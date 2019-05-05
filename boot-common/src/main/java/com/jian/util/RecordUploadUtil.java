package com.jian.util;

import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.jian.entity.LsRecord;

@Component
public class RecordUploadUtil {
	
	static String appId = "03495eaa179e24e06eb7deab306d4a8a";
	static String sign = "0141d0ebde29fc3192c6c257732152bc";
	static Logger logger = LoggerFactory.getLogger("上传比对记录-");

	 @Value("${recordUpload}")
	 private String recordUploadUrl;
	 
	 
	 static RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(180 * 1000)
				.setConnectionRequestTimeout(180 * 1000).setSocketTimeout(180 * 1000).setRedirectsEnabled(true).build();

	 
	 public static void setHttp(HttpPost httpPost) {
			httpPost.setConfig(requestConfig);
			httpPost.setHeader("Content-Type", "application/json");
			httpPost.setHeader("appId", appId);
			httpPost.setHeader("sign", sign);
		} 
	 
	 public static String getRes(CloseableHttpClient httpClient, HttpPost post) {
			JSONObject json = new JSONObject();
			String str = "";
			try {
				CloseableHttpResponse response = httpClient.execute(post);
				StatusLine statusline = response.getStatusLine();
				int responsecode = statusline.getStatusCode();
				if (responsecode == 200) {
					HttpEntity he = response.getEntity();
					str = EntityUtils.toString(he, "UTF-8");

				} else {
					json.put("result", false);
					json.put("msg", responsecode);
					str = json.toString();
				}

				response.close();
				httpClient.close();
				return str;
			} catch (ClientProtocolException e) {
				json.put("result", false);
				json.put("msg", e.getMessage());
				str = json.toString();
				return str;
			} catch (IOException e) {
				json.put("result", false);
				json.put("msg", e.getMessage());
				str = json.toString();
				return str;
			}
		}
	 
	 
	 public   String upload(LsRecord ljRecord ){
			try {
				ljRecord.setVerifyPhoto(FileUtil.img_base64_head(FileUtil.getPicture2Byte(ljRecord.getVerifyPhoto(), "upload/record/")));
			} catch (IOException e) {
				e.printStackTrace();
			}
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpPost post  = new HttpPost(recordUploadUrl);
			setHttp(post);
			post.setEntity(new StringEntity(JSON.toJSONString(ljRecord), Charset.forName("UTF-8")));
			String str = getRes(httpClient, post);
			logger.info(str);
			return str;
		}
}
