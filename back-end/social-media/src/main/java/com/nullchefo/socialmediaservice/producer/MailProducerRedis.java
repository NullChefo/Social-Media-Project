package com.nullchefo.socialmediaservice.producer;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MailProducerRedis {

//	@Autowired
//	private RedisTemplate<String, Object> redisTemplate;
//
//	public void saveToRedis(String key, Object value) {
//		redisTemplate.opsForValue().set(key, value);
//	}
//
//	public Object getFromRedis(String key) {
//		return redisTemplate.opsForValue().getAndDelete(key);
//	}
//
//	public List<Object> getAllFromRedis(){
//		return Collections.singletonList(redisTemplate.keys("*"));
//	}

}
