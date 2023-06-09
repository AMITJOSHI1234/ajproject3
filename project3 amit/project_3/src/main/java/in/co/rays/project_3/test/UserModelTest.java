package in.co.rays.project_3.test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.project_3.dto.UserDTO;
import in.co.rays.project_3.exception.ApplicationException;
import in.co.rays.project_3.exception.DuplicateRecordException;
import in.co.rays.project_3.model.UserModelHibImp;
import in.co.rays.project_3.model.UserModelInt;

public class UserModelTest {
public static UserModelInt model = new UserModelHibImp();
public static void main(String[] args) throws ParseException, ApplicationException, DuplicateRecordException {
	//testadd();
	//testauthentication();
	//testupdate();
	//testdelete();
	//testfindbypk();
	//testlist();
	//testsearch();
	//testfindbylogin();
	//testdate();
}
private static void testdate() throws ParseException {
	Date d = new Date();
	System.out.println("Current year:"+d.getYear());
	String date = "08/05/2006";
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy");
	Date newDate = sdf.parse(date);
	int age = d.getYear() - newDate.getYear();
	System.out.println("Age:"+age);
	if(age>18) {
		System.out.println("valid");
	}else {
		System.out.println("invalid");
	}
	
}
private static void testfindbylogin() throws ApplicationException {
	UserDTO dto = model.findByLogin("Aniket@gmail.com");
	System.out.println(dto.getId() + "\t" + dto.getFirstName() + "\t" + dto.getLastName() + "\t" + dto.getLogin()
			+ "\t" + dto.getPassword() + "\t" + dto.getDob() + "\t" + dto.getMobileNo() + "\t" + dto.getRoleId()
			+ "\t" + dto.getUnSuccessfullLogin() + "\t" + dto.getGender() + "\t" 
			 );	
}
private static void testsearch() throws ApplicationException {
	UserDTO dto = new UserDTO();
	dto.setId(2L);
	//List list = new ArrayList();
	ArrayList<UserDTO> a = (ArrayList<UserDTO>) model.search(dto,0,0);
	for (UserDTO udto1 : a) {
		System.out.println(udto1.getId() + "\t" + udto1.getFirstName() + "\t" + udto1.getLastName() + "\t"
				+ udto1.getLogin() + "\t" + udto1.getPassword() + "\t" + udto1.getDob() + "\t"
				+ udto1.getMobileNo() + "\t" + udto1.getRoleId() );
		}
	
}
private static void testlist() throws ApplicationException {
	UserDTO dto = new UserDTO();
	List list = new ArrayList();
	list = model.list(1, 10);
	if (list.size() < 0) {
		System.out.println("list fail");
	}
	Iterator it = list.iterator();
	while (it.hasNext()) {
		dto = (UserDTO) it.next();
		System.out.println(dto.getId());
		System.out.println(dto.getFirstName());
		System.out.println(dto.getLastName());
		System.out.println(dto.getLogin());
		System.out.println(dto.getPassword());
		System.out.println(dto.getDob());
		System.out.println(dto.getRoleId());
		System.out.println(dto.getUnSuccessfullLogin());
		System.out.println(dto.getGender());
		System.out.println(dto.getLastLogin());
		
		System.out.println(dto.getMobileNo());
		System.out.println(dto.getCreatedBy());
		System.out.println(dto.getModifiedBy());
		System.out.println(dto.getCreatedDatetime());
		System.out.println(dto.getModifiedDatetime());
	}
	
}
private static void testfindbypk() throws ApplicationException {
	UserDTO dto = model.findByPK(3L);
	System.out.println(dto.getId() + "\t" + dto.getFirstName() + "\t" + dto.getLastName() + "\t" + dto.getLogin()
			+ "\t" + dto.getPassword() + "\t" + dto.getDob() + "\t" + dto.getMobileNo() + "\t" + dto.getRoleId()
			+ "\t" + dto.getUnSuccessfullLogin() + "\t" + dto.getGender() + "\t" + dto.getLastLogin() + "\t"
			+ "\t" + dto.getLastLogin() + "\t" + dto.getRegisteredIP());

	
}
private static void testdelete() throws ApplicationException {
	UserDTO dto = new UserDTO();
	dto.setId(5L);
	model.delete(dto);
	System.out.println("delete data successfully");
}
	
private static void testupdate() throws ParseException, ApplicationException, DuplicateRecordException {
	UserDTO dto = new UserDTO();
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	dto.setId(5L);
	dto.setFirstName("Mayank");
	
	dto.setLastName("agrawalll");
	dto.setDob(sdf.parse("31-12-1995"));
	dto.setConfirmPassword("1234");
	dto.setPassword("1234");
	dto.setLogin("Mayank@gmail.com");
	dto.setGender("males");
	dto.setUnSuccessfullLogin(2);
	
	dto.setCreatedBy("admins");
	dto.setModifiedBy("admins");
	dto.setRoleId(2);
	dto.setMobileNo("9406653787");
	dto.setRegisteredIP("aa@gmail.com");
	dto.setLoginIP("aa@gmail.com");
	dto.setLastLogin(new Timestamp(new Date().getTime()));
	dto.setCreatedDatetime(new Timestamp(new Date().getTime()));
	dto.setModifiedDatetime(new Timestamp(new Date().getTime()));
	model.update(dto);
	System.out.println("data update successfully");
	
}
private static void testauthentication() throws ApplicationException {
	UserDTO dto = new UserDTO();
	dto.setLogin("Sumesh@gmail.com");
	dto.setPassword("Sumesh@12345");
	
	UserDTO bean = model.authenticate(dto.getLogin(), dto.getPassword());
	if(bean!=null) {
		System.out.println("Authenticated");
	}else {
		System.out.println("fail!!!");
	}
	
}
private static void testadd() throws ParseException, ApplicationException, DuplicateRecordException {
	UserDTO dto = new UserDTO();
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	
	dto.setFirstName("kp");
	dto.setLastName("verma");
	dto.setDob(sdf.parse("15-05-2000"));
	dto.setConfirmPassword("Kp@12345");
	dto.setPassword("Kp@12345");
	dto.setLogin("kp@gmail.com");
	dto.setGender("male");
	dto.setRoleId(3);
	dto.setUnSuccessfullLogin(3);

	dto.setCreatedBy("admin");
	dto.setModifiedBy("admin");
	//dto.setRoleId(1);
	dto.setMobileNo("9406653731");
	dto.setRegisteredIP("kp@gmail.com");
	dto.setLoginIP("kp@gmail.com");
	dto.setLastLogin(new Timestamp(new Date().getTime()));
	dto.setCreatedDatetime(new Timestamp(new Date().getTime()));
	dto.setModifiedDatetime(new Timestamp(new Date().getTime()));
	
	System.out.println(dto);
	long pk = model.add(dto);
	System.out.println(dto.getFirstName());
	System.out.println(pk + "data successfully insert"); 
	
}
}
