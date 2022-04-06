package dev.autoprac.glue;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import dev.autoprac.engine.AutoEngine;

@Resource
public class CoreGlue {

	public CoreGlue() {

	}

	@Autowired
	public AutoEngine engine;
}
