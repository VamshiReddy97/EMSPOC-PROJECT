package com.yash.ems.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.ems.model.Skill;

public interface SkillRepository extends JpaRepository<Skill, Integer>{
	public List<Skill> findBySkillName(String skillName);
	

}
