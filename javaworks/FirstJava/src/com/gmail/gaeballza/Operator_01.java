package com.gmail.gaeballza;

public class Operator_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ��ɹ�(Statement)
		 * java�ڵ忡�� ��ɹ��� �ݵ�� ���� �����ݷ�(;)�� �´�
		 * ��ɹ��� ������ keyword�� ������ �ü��ִ�
		 * keyword�� �����ϴ� ��ɹ��� � ����� �����ϴ� ����̰�
		 * ������ �����ϴ� ���� �����ڰ� ����´�
		 * ������ �ٷ� ������ ���� �����ڿ���
		 * ���Կ�����(=), ���׿�����(++,--), ���տ�����(+=,*=.-+,/=,%=), ���׿����ڵ����ִ�
		 * 
		 */
		int intNum1 = 10;
		int intNum2 = 0;
		
		//���Կ�����: ���ͷ� 100�� ���� intNum2�� �����϶�
		intNum2 = 100;
		
		System.out.println(intNum1);
		System.out.println(intNum2);
		
		//���׿�����: �����θ� 1 ������Ű�� �� ����� intNum2�� �����϶�
		intNum2++; //intNum2 = intnum2 + 1;
		System.out.println(intNum2);
		
		//���Կ�����
		intNum2 = ++intNum1; //intNum1�� 1 ������Ű�� �� ����� intNum2�� ����
		System.out.println(intNum2);
		
		//���Կ�����
		intNum1 = intNum1 + 10; //intNum1�� ���� 10 ������Ű��
		intNum2 = intNum1; //�� ���� intNum2�� ����
		System.out.println(intNum2);
		
		//���տ�����
		//���� ���� �̸��� ������ �����ġ���� ���� �о����
		//����(���⼭�� +10)�� �����ϰ�
		//����� �� ���� ������ �����϶�
		intNum1 += 10;//intNum1�� ���� 10 ������Ű��
		intNum2 = intNum1; //intNum1�� ����
		System.out.println(intNum2);
		
		/*
		 * ���Կ����ڰ� ���� ������ �� ���
		 * 
		 * 1. ������ �����ʺ���
		 * 1-1. (intNum1 = intNum1 + 10)
		 * 1-2. intNum1 ������ �� ���� �����ڰ� �´�
		 * 1-3. ���� �����ʺ���
		 * 1-4. intNum1 + 10���� ����
		 * 
		 * 2. 1-4�� ����� intNum1�� ����(����)�Ѵ�
		 * 3. intNum2�� ����� ���� �о intNum2�� �����Ѵ�
		 */
		intNum2 = intNum1 = intNum1 + 10;
		System.out.println(intNum2);
		
		/*
		 * ���Կ���� (intNum1 = intNum2 + 10) ��
		 * �ٸ� ��ɹ� ���� ���ԵǴ� ���
		 * ���Կ������ ���� ��� ����
		 * 1. intNum2 + 10�� �����ϰ�
		 * 2. ����� intNum1�� ����(����)�Ѵ�
		 * 3. intNum1�� ����� ���� console�� ����ϰ�
		 * 4. intNum1�� ���� �״�� �����Ѵ�
		 * 5. ������ �ڵ忡�� intNum1 ���� ����� �� �ִ�
		 * 
		 */
		System.out.println(intNum1 = intNum2 + 10);
		System.out.println(intNum1 = intNum2 += 30 );
		
		
		
		
		

	}
	
	public static int num() {
		return 0;
	}
}
