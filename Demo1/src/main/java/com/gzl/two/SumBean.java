package com.gzl.two;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
public class SumBean {
	@Autowired
	private OneBean oneBean;
	@Autowired
	private TwoBean twoBean;
//	@Value("99")
	private int i;

	
	
	public SumBean() {
		super();
	}

	
	


	public SumBean(OneBean oneBean, TwoBean twoBean, int i) {
		super();
		this.oneBean = oneBean;
		this.twoBean = twoBean;
		this.i = i;
	}
	
	
	public OneBean getOneBean() {
		return oneBean;
	}

	public void setOneBean(OneBean oneBean) {
		this.oneBean = oneBean;
	}

	public TwoBean getTwoBean() {
		return twoBean;
	}

	public void setTwoBean(TwoBean twoBean) {
		this.twoBean = twoBean;
	}

	public int getI() {
		return i;
	}
	
	public void setI(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "SumBean [oneBean=" + oneBean + ", twoBean=" + twoBean + ", i=" + i + "]";
	}
	
	
}
