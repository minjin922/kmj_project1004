package com.hk.cardamoyeo.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

public interface LogService {
	public void execute(Model model, HttpServletRequest request);
}
