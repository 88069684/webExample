package com.duoduo.conf;
/**
 * rediskey 预设配置
 * @author haikuan
 *
 */

import com.alibaba.druid.sql.ast.expr.SQLSequenceExpr.Function;

public class RedisKey {
	private static final String APPNAME = "web";
	/** ===================================================用户有关信息======================================================== */
	// user_index对象前缀,后面拼接用户userId
	public static final String STRING_USER_INDEX_PREFIX = APPNAME + "user_";
	// hash使用
	public static final String HASH_USER_INFO_PREFIX = APPNAME + "userinfo_";
	// list使用
	public static final String LIST_USER_LIST = APPNAME + "userlist_";
	// set使用
	public static final String SET_USER_LIST = APPNAME + "userset_";
	// zset使用
	public static final String ZSET_USER_LIST = APPNAME + "userzset_";

}
