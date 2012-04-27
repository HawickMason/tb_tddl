/*(C) 2007-2012 Alibaba Group Holding Limited.	

import javax.sql.DataSource;

import com.taobao.tddl.interact.rule.bean.DBType;

/**
 * Ϊ�˱����TGroupDataSource��һ���spring������
 * 
 * @author linxuan
 * 
 */
public interface DataSourceFetcher {
	DataSource getDataSource(String key);
	DBType getDataSourceDBType(String key);
}