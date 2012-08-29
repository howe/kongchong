package  com.esup.kongchong.tools.mail;

public class Test {

	public static void main(String[] args) throws Exception {
		Email email = new Email();
		email.setFrom("order@esup.cn");
		email.setPwd("esup.cn123");
		email.setRecipients(new String[] { "93896711@qq.com" });
		email.setReceives(new String[] {"Esup网游<info@esup.cn>"});
		email.setSubject("Esup网游 - 斗牛棋牌网充值订单");
		email.setHeadValue("Esup网游订单");
		email.setHeadName("Esup网游订单");
		email.setContentType("html");
		email.setContent("<a href=\"http://www.esup.cn\">Esup网游</a>");
//		email.setFile(new String[] { "C:/测试.txt", "C:/测试2.txt" });

		TransportService.sendMailBySMTP(email);
	}
}
