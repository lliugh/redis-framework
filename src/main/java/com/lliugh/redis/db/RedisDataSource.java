package com.lliugh.redis.db;

import redis.clients.jedis.ShardedJedis;

/**
 * @author lliugh & guohaoliu@gmail.com & http://github.com/lliugh
 * @(#)RedisDataSource.java 1.0 08/12/2015
 */

public interface RedisDataSource {
    public abstract ShardedJedis getRedisClient();
    public void returnResource(ShardedJedis shardedJedis);
    public void returnResource(ShardedJedis shardedJedis,boolean broken);
}
