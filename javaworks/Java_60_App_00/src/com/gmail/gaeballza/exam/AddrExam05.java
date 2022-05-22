package com.gmail.gaeballza.exam;

import java.util.ArrayList;
import java.util.List;

import com.gmail.gaeballza.exec.service.AddrServiceV1;
import com.gmail.gaeballza.model.AddressVO;

public class AddrExam05 {
	//리스트에 데이터추가하는법
	public static void main(String[] args) {
		List<AddressVO> addrs = new ArrayList<>();
		AddressVO addrVO = new AddressVO();
		addrVO.setName("홍길동");
		addrVO.setTel("010-0000-0001");
		addrVO.setAge(33);
		addrs.add(addrVO);
		
		addrVO = new AddressVO();
		addrVO.setName("이몽룡");
		addrVO.setTel("010-0000-0002");
		addrVO.setAge(20);
		addrs.add(addrVO);
		
		addrVO = new AddressVO();
		addrVO.setName("성춘향");
		addrVO.setTel("010-0000-0003");
		addrVO.setAge(16);
		addrs.add(addrVO);
		
		AddrServiceV1 addrService = new AddrServiceV1();
		addrService.printAddrList(addrs);
		System.out.println("=".repeat(100));
		//기존 데이터에 새 데이터 추가
		addrVO = AddressVO.builder()
						.name("임꺽정")
						.tel("010-0000-0004")
						.age(40)
						.build();
		addrs.set(2, addrVO);
		addrService.printAddrList(addrs);
		
		int size = addrs.size();
		for (int i = 0; i < size; i ++) {
			for (int j = i + 1; j < size; j++) {
				if(addrs.get(i).getAge() > addrs.get(j).getAge()) {
					AddressVO sVO = addrs.get(i);
					addrs.set(i, addrs.get(j));
					addrs.set(j, sVO);
				}
			}
		}
		System.out.println("=".repeat(100));
		addrService.printAddrList(addrs);
		
		
		
	}

}
