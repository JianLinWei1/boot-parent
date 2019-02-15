package com.jian.service;

import java.util.List;

import com.jian.entity.LsPerson;
import com.jian.entity.LsRecord;
import com.jian.util.ResultUtil;
/**
 * 监所接口
 * @ClassName:  PrisonsPersonService   
 * @Description:TODO   
 * @author: JianLinWei
 * @email: jianlinwei_dream@163.com
 * @date:   2019年1月17日 上午11:18:06   
 *
 */
public interface PrisonsPersonService {
    /**
     * 增加监所人员
     */
	ResultUtil  insertPrisonsPerson(List<LsPerson> list);
	/**
	 * 更新监所人员
	 */
	ResultUtil  updatePrisonsPerson(List<LsPerson> list);

	/**
	 *删除监所人员
	 */
	ResultUtil  deletePrisonsPerson(List<LsPerson> list);
	/**
	 * 查询监所人员
	 */
	ResultUtil  queryPrisonsPerson(int page , int limit);
	/**
	 * 查询监所比对记录
	 */
	ResultUtil queryPrisonRecords(int page , int limit);
	/**
	 * 查询监所设备
	 */
	ResultUtil queryPrisonDevices();
	/**
	 * GRPC人员获取
	 */
	List<LsPerson>  getLsPersonsByVersion(long  version);
	/**
	 * GRPC上传比对记录
	 */
	ResultUtil  addLsRecord(List<LsRecord>  lsRecords);
}
