package com.main;

import java.util.Arrays;

public class Item {
	String cat_name = ""; // һ����Ŀ����
	long num_iid = 0l; // ��ƷID
	String title = ""; // ��Ʒ����
	String pict_url	= ""; //��Ʒ��ͼ
	int small_images_num = 5;
	String[] small_images = new String[small_images_num]; // ��ƷСͼ�б�
	String reserve_price = ""; // ��Ʒһ�ڼ۸�
	String zk_final_price = "";	// �ۿۼۣ�Ԫ�� ������Ԥ����Ʒ��������ʱ���ڣ��ۿۼ�=Ԥ�ۼ�
	int user_type = 1; // �������ͣ�0��ʾ���У�1��ʾ�̳�
	String provcity = ""; // ��Ʒ���ڵ�
	String item_url = ""; // ��Ʒ����
	String seller_id = ""; // ����id
	int volume = 0; // 30������
	String nick	= ""; // ��������
	String cat_leaf_name = ""; // Ҷ����Ŀ����
	boolean is_prepay = false; // �Ƿ���������߱���
	int shop_dsr = 0; // ����dsr ����
	int ratesum = 0; // ���ҵȼ�
	boolean i_rfd_rate = false; // �˿����Ƿ������ҵ��ֵ
	boolean h_good_rate = false; // �������Ƿ������ҵ��ֵ
	boolean h_pay_rate30 = false; // �ɽ�ת���Ƿ������ҵ��ֵ
	boolean free_shipment = false; // �Ƿ����
	String material_lib_type = ""; // ��Ʒ�����ͣ�֧�ֶ�������������Ӣ�Ķ��ŷָ���,���ָ���1:Ӫ����Ʒ���ƿ⣬2. ������Ʒ�⣬���ֵΪ��������1��2��������Ʒ����
	String presale_discount_fee_text = ""; // Ԥ����Ʒ-��Ʒ�Ż���Ϣ
	long presale_tail_end_time = 0l; // Ԥ����Ʒ-���������ʱ�䣨���룩
	long presale_tail_start_time = 0l; // Ԥ����Ʒ-��β�ʼʱ�䣨���룩
	long presale_end_time = 0l; // Ԥ����Ʒ-���������ʱ�䣨���룩
	long presale_start_time = 0l; // Ԥ����Ʒ-������ʼʱ�䣨���룩
	String presale_deposit = ""; // Ԥ����Ʒ-����Ԫ��
	long ju_play_end_time = 0l; // �ۻ������� -����ʱ�䣨���룩
	long ju_play_start_time = 0l; // �ۻ������� -��ʼʱ�䣨���룩
	String play_info = ""; // �淨	1�ۻ�����������N����XԪ����N��X�ۣ���N��XԪ�� 2��è��ʱ����ǰN����ÿ��XԪ��ǰN������N��ÿ��XԪ��ǰN��ÿ��XԪ��
	long tmall_play_activity_end_time = 0l; // ��è��ʱ������ -����ʱ�䣨���룩
	long tmall_play_activity_start_time = 0l; // ��è��ʱ������ -��ʼʱ�䣨���룩
	@Override
	public String toString() {
		String str1 = "һ����Ŀ���ƣ�" + cat_name + "\n��ƷID��" + num_iid + "\n��Ʒ���⣺" + title + "\n��Ʒ��ͼ��" + pict_url;
		String str2 = "\n��ƷСͼ�б�\n";
		for(int i = 0; i < small_images.length - 1; i++) {
			str2 = str2 + (i+1) + "." + small_images[i] + "\n";
		}
		String str3 = "��Ʒͳһ�۸�" + reserve_price + "\n�ۿۼۣ�Ԫ�� ��" + zk_final_price + "\n�������ͣ�0:���У�1:�̳ǣ���" + user_type
				+ "\n��Ʒ���ڵأ�" + provcity + "\n��Ʒ���ӣ�" + item_url + "\n����ID��" + seller_id + "\n30��������"
				+ volume + "\n�������ƣ�" + nick + "\nҶ����Ŀ���ƣ�" + cat_leaf_name + "\n�Ƿ���������߱��ϣ�" + is_prepay
				+ "\n����dsr���֣�" + shop_dsr + "\n���ҵȼ���" + ratesum + "\n�˿����Ƿ���ھ�ֵ��" + i_rfd_rate + "\n�������Ƿ���ھ�ֵ��"
				+ h_good_rate + "\n�ɽ�ת���Ƿ���ھ�ֵ��" + h_pay_rate30 + "\n�Ƿ���ʣ�" + free_shipment
				+ "\n��Ʒ�����ͣ�" + material_lib_type + "\nԤ����Ʒ-��Ʒ�Ż���Ϣ��"
				+ presale_discount_fee_text + "\nԤ����Ʒ-���������ʱ�䣨���룩��" + presale_tail_end_time
				+ "\nԤ����Ʒ-��β�ʼʱ�䣨���룩��" + presale_tail_start_time + "\nԤ����Ʒ-���������ʱ�䣨���룩��" + presale_end_time
				+ "\nԤ����Ʒ-������ʼʱ�䣨���룩��" + presale_start_time + "\nԤ����Ʒ-����Ԫ����" + presale_deposit
				+ "\n�ۻ������� -����ʱ�䣨���룩��" + ju_play_end_time + "\n�ۻ������� -��ʼʱ�䣨���룩��" + ju_play_start_time
				+ "\n�淨��" + play_info + "\n��è��ʱ������ -����ʱ�䣨���룩��" + tmall_play_activity_end_time
				+ "\n��è��ʱ������ -��ʼʱ�䣨���룩��" + tmall_play_activity_start_time;
		String string = str1 + str2 + str3;
		return string;
	}
	
	
}
