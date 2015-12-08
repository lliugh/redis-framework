package com.lliugh.redis.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class DataEvent {
	public static ResponseEntity<Object> wrap(String eventName, Object data) {
		return wrap(eventName, data, HttpStatus.OK);
	}
	
	public static ResponseEntity<Object> wrap(String eventName, Object data, HttpStatus httpStatus) {
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("TigerFace-Event", eventName);
//		responseHeaders.set("ContentType", headerValue);
		return new ResponseEntity<Object>(data, responseHeaders, httpStatus);
	}
}
