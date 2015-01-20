package com.application.messages;

import java.text.*;
import java.util.*;

public class Message {
	protected Date date;
	protected String text;
	protected String userName;
	protected String str;
	public Message(Date date, String text, String userName){
		this.date=date;
		this.text=text;
		this.userName=userName;
		SimpleDateFormat anotherDate=new SimpleDateFormat("dd MMMM yyyy hh:mm:ss");
		String str=anotherDate.format(date);
		this.str=str;
	}
	public Date getDate(){
		return date;
	}
	public String getText(){
		return text;
	}
	public String getUserName(){
		return userName;
	}
	public void setDate(Date date){
		this.date=date;
	}
	public void setText(String text){
		this.text=text;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	public String formattedText(){
		String all;
		all=userName+"\n"+str+" "+"\n\n"+text+"\n\n";
		return all;
	}
}
