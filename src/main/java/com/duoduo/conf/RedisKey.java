package com.duoduo.conf;

public class RedisKey {
	/** ===================================================用户有关信息======================================================== */
	// user_index对象前缀,后面拼接用户userId
	public static final String STRING_USER_INDEX_PREFIX = "user_";
	//hash使用
	public static final String HASH_USER_INFO_PREFIX = "userinfo_";
	//list使用
	public static final String LIST_USER_LIST_PREFIX = "userlist_";
	//set使用
	public static final String SET_USER_LIST_PREFIX = "userset_";
	//zset使用
	public static final String ZSET_USER_LIST_PREFIX = "userzset_";
	
}
