package classes;

import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Person {

	private String strmyFirstName = "dftFname";
	private String strmyLastName = "dftLname";
	private String strmyAdd ="dftAddress";
	private String strmyTown = "dftTown";
	private String strmyPostcode = "dftPC";
	private String strDOB = "12/12/2010";
	private String strPhone = "dftPhone";

	public String getFirstName()
	{
		return strmyFirstName;
	}
	
	public void setFirstName(String strNewName)
	{
		strmyFirstName = strNewName;
	}

	public String getLastName()
	{
		return strmyLastName;
	}
	
	public void setLastName(String strNewName)
	{
		strmyLastName = strNewName;
	}

	public String getAddress() {
		return strmyAdd;
	}

	public void setAddress(String strmyAdd) {
		this.strmyAdd = strmyAdd;
	}

	public String getTown() {
		return strmyTown;
	}

	public void setTown(String strmyTown) {
		this.strmyTown = strmyTown;
	}

	public String getPostcode() {
		return strmyPostcode;
	}

	public void setPostcode(String strmyPostcode) {
		this.strmyPostcode = strmyPostcode;
	}

	public String getDOB() {
		return strDOB;
	}

	public void setDOB(String strDOB) {
		this.strDOB = strDOB;
	}

	public String getPhone() {
		return strPhone;
	}

	public void setPhone(String strPhone) {
		this.strPhone = strPhone;
	}
	
	Person()
	{
		setFirstName("dftFName");
		setLastName("dftFName");
		setAddress("dftAddress");
		setTown("dftTown");
		setPostcode("dftPC");
		setDOB ("12/12/2012");
		setPhone("dftPhone");
	}

	Person(String strNewFirstName,String strNewLastName, String strNewAdd, String strNewTown, String strNewPostCode, String strNewDOB, String strNewPhone)
	{
		setFirstName(strNewFirstName);
		setLastName(strNewLastName);
		setAddress(strNewAdd);
		setTown(strNewTown);
		setPostcode(strNewPostCode);
		setDOB (strNewDOB);
		setPhone(strNewPhone);
	}

}
