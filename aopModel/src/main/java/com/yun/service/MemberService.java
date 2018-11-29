package com.yun.service;

import com.yun.dao.MemberDao;
import com.yun.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class MemberService {
	Logger logger = Logger.getLogger(MemberService.class.getName());

	@Autowired
	private MemberDao memberDao;

	public boolean add(Member member){
		System.out.println("添加成功");
		return true;
	}

	public void delete(long id){
		System.out.println("删除成功");
	}

	public void update(long id , String name){
		System.out.println("删除成功");
	}

	public void query(long id )throws  Exception{
		int i = (int)Math.random()*10;
		if (i%2==0){
			System.out.println("meiyoucuow ");
		}else{
			throw new Exception("shishi");
		}
	}
}
