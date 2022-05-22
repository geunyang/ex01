package com.gmail.gaeballza.exec.service;

import java.util.List;

import com.gmail.gaeballza.model.AddressVO;

public class AddrServiceV1 {

	public void printAddr(AddressVO vo) {
		System.out.println(vo.toString());
	}

	public void printAddrList(AddressVO[] addrs) {
		for (AddressVO vo : addrs) {
			System.out.println(vo.toString());
		}
		System.out.println("=".repeat(100));
	}

	public void printAddrList(List<AddressVO> addrs) {
		for (AddressVO vo : addrs) {
			System.out.println(vo.toString());
		}
		System.out.println("-".repeat(100));
	}

}
