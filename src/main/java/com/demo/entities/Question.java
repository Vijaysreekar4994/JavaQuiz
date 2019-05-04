package com.demo.entities;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="question")
public class Question implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String content;
	private Set<Answer> answers;
	
	public Question() {
		
	}
	public Question(String content, Set<Answer> answers) {
		this.content = content;
		this.answers = answers;
	}
	
	@Id
	@GeneratedValue(strategy= IDENTITY)
	@Column(name="id", unique=true, nullable=false)
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id=id;
	}
	@Column(name="content", nullable=false, length=65535)
	public String getContent(){
		return this.content;
	}
	public void setContent(String content){
		this.content=content;
	}
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="qestion")
	public Set<Answer> getAnsers(){
		return this.answers;
	}
	public void setAnswers(Set<Answer> answer) {
		this.answers = answer;
	}
}