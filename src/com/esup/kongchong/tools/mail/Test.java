package  com.esup.kongchong.tools.mail;

public class Test {

	public static void main(String[] args) throws Exception {
		Email email = new Email();
		email.setFrom("love@yueta.cn");
		email.setPwd("oYE3aphMFo");
		email.setRecipients(new String[] { "93896711@qq.com" });
		email.setReceives(new String[] {"Yueta<info@yueta.cn>"});
		email.setSubject("来之约Ta的问候");
		email.setHeadValue("情人节快乐");
		email.setHeadName("Love letter");
		email.setContentType("html");
		email.setContent("<a href=\"http://www.qq.com\">腾讯</a>");
//		email.setFile(new String[] { "C:/测试.txt", "C:/测试2.txt" });

		TransportService.sendMailBySMTP(email);
	}
}
