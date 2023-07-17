package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("stateinfo")
public class StateInfo {
    @Value("${stateinfo.rajyapal}")
	private String rajyapal;
    @Value("${stateinfo.CM}")
	private String CM;
    @Value("${stateinfo.DCM}")
	private String DCM;
    @Value("${stateinfo.LOP}")
	private String LOP;
    @Value("${stateinfo.MLA}")
	private Integer MLA;
	@Override
	public String toString() {
		return "StateInfo [rajyapal=" + rajyapal + ", CM=" + CM + ", DCM=" + DCM + ", LOP=" + LOP + ", MLA=" + MLA
				+ "]";
	}
    
}
