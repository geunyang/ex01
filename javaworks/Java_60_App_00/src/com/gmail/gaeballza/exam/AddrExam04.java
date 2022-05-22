package com.gmail.gaeballza.exam;

import java.util.ArrayList;
import java.util.List;

import com.gmail.gaeballza.exec.service.AddrServiceV1;
import com.gmail.gaeballza.model.AddressVO;

public class AddrExam04 {
	//리스트에 데이터추가하는법
	public static void main(String[] args) {
		List<AddressVO> addrs = new ArrayList<>();
		AddressVO addrVO = new AddressVO();
		addrVO.setName("홍길동");
		addrVO.setTel("010-0000-0001");
		addrs.add(addrVO);
		
		addrVO = new AddressVO();
		addrVO.setName("이몽룡");
		addrVO.setTel("010-0000-0002");
		addrs.add(addrVO);
		
		addrVO = new AddressVO();
		addrVO.setName("성춘향");
		addrVO.setTel("010-0000-0003");
		addrs.add(addrVO);
		
		AddrServiceV1 addrService = new AddrServiceV1();
		addrService.printAddrList(addrs);
	}

}
