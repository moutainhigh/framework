package com.jsmsframework.common.mapper;

import com.jsmsframework.common.dto.JsmsPage;
import com.jsmsframework.common.entity.JsmsSendEmailList;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @description 发送邮箱管理表
 * @author tanjiangqiang
 * @date 2017-11-30
 */
@Repository
public interface JsmsSendEmailListMapper{

	int insert(JsmsSendEmailList model);
	
	int insertBatch(List<JsmsSendEmailList> modelList);

	
	int update(JsmsSendEmailList model);
	
	int updateSelective(JsmsSendEmailList model);

    JsmsSendEmailList getById(Integer id);

	List<JsmsSendEmailList> queryList(JsmsPage<JsmsSendEmailList> page);

	int count(Map<String, Object> params);

	int countForEdit(Map<String, Object> params);

}