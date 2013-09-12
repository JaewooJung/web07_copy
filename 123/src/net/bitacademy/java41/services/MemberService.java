package net.bitacademy.java41.services;

import java.util.List;

import net.bitacademy.java41.dao.MemberDao;
import net.bitacademy.java41.dao.ProjectDao;
import net.bitacademy.java41.vo.Member;

public class MemberService {
	MemberDao memberDao;
	
	public MemberService setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
		return this;
	}
	
	public void signUp(Member member) throws Exception {
		memberDao.add(member);
	}

	public List<Member> list() throws Exception{
		return memberDao.list();
	}
	
	public Member get(String email) throws Exception{
		return memberDao.get(email);
	}
	
	public int changePassword(String email, String oldPassword, String newPassword) throws Exception{
		return memberDao.changePassword(email, oldPassword, newPassword);
		
	}
	
	public void add(Member member) throws Exception{
	memberDao.add(member);
	}

	 
	}
}
