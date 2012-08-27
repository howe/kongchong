package com.esup.kongchong.tools;

import java.util.Iterator;

import javax.management.openmbean.CompositeData;
import javax.management.openmbean.TabularData;

import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.stat.JdbcDataSourceStat;

@At("/test2")
@IocBean(fields = {"dataSource"})
public class DruidTest {

	private DruidDataSource dataSource;

	@At("/t")
	public void test() throws Exception {
		JdbcDataSourceStat jds = dataSource.getDataSourceStat();

		System.out.println("数据源URL : " + jds.getUrl());

		System.out.println(jds.getConnectionStat().getConnectLastTime());
		//System.out.println(JdbcDataSourceStat.getStatFilter(dataSource).getConnectionActiveCount());

		// System.out.println("最大连接活动数 : "
		// + jds.getStatFilter(dataSource).getConnectionConnectingMax());
		// System.out.println(jds.getStatFilter(dataSource).getConnectionConnectCount());
		// System.out.println(jds.getStatFilter(dataSource).getConnectionConnectErrorCount());
		//
		// System.out.println(jds.getStatFilter(dataSource).getConnectionCloseCount());
		// System.out.println(jds.getStatFilter(dataSource).getConnectionCommitCount());

		TabularData td = jds.getSqlList();

		// System.out.println("测试..." +
		// td.keySet().iterator().next().toString());

		Iterator<CompositeData> it = (Iterator<CompositeData>) td.values().iterator();
		while (it.hasNext()) {
			CompositeData cd = it.next();
			System.out.println(cd.get("SQL"));
			System.out.println(cd.get("TotalTime"));
			System.out.println(cd.get("LastTime"));
			System.out.println(cd.get("EffectedRowCount"));
			System.out.println(cd.get("FetchRowCount"));
			System.out.println(cd.get("ExecuteCount"));
			System.out.println(cd.get("RunningCount"));
		}

	}
}
