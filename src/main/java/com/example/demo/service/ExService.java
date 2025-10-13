package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ExService {
	
	private static final Logger log = LoggerFactory.getLogger(ExService.class);
	
	public String sayHello(String hi) {
		String msg = hi + " 좋은 날";
		log.info(msg);
		log.debug(msg);
		return msg;
	}

	public String ex321() {
		
		int number = 1;
		String result = "";
		
		if(number == 1) {
			result = "if 블록입니다.";
			System.out.println(result);
			log.info(result);
		}else if(number == 2) {
			result = "else if 블록입니다.";
			System.out.println(result);
		}else {
			result = "else 블록입니다.";
			System.out.println("else 블록입니다.");
			log.info(result);
		}
		return result;
	}

	public String ex322() {
		
		int [] array = {1,2,3,4,5};
		String result = "";
		for (int i = 0; i < array.length; i++)
		result += array[i];
		log.info(result);
		return result;
	}

	public String ex323() {
		String result = "";
		int[] array = {1,2,3,4,5};
		int i = 0;
		
		while(i < array.length) {
			result += array[i];
			log.info(result);
			i++;
		}
		return result;
	}
	public interface Car{ public String getColor();}
	public class Sonata implements Car{
		public Sonata() {
			log.info("Sonata 출고");
		}
		@Override
		public String getColor() {
			return "색상 : 빨간색";
		}
	}
	public class K5 implements Car{
		public K5() {
			log.info("k5 출고");
		}
		@Override
		public String getColor() {
			return "색상 : 노랑색";
		}
	}
	public String ex324() {
		Car car1 = new Sonata();
		String re1 = car1.getColor();
		Car car2 = new K5();
		String re2 = car2.getColor();
		String result = re1 + "<br>" + re2 + "<br>" + "차 두대를 출고함";
		return result;
	}
	
	public String ex325() {
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list.get(1));
		int result = list.get(1);
		return String.valueOf("List의 1번 인덱스 값 : " + result);
	}

	public String ex326() {
		
		List<String> list = new ArrayList<>();
		
		list.add("public");
		list.add("static");
		list.add("void");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(1));
		}
		list.remove(1);
		int voidIndex = list.indexOf("void");
		System.out.println("void의 index = " + voidIndex);
		return String.valueOf(voidIndex);
	}

	public String ex327() {
		
		String str1 = new String("is same?");
		String str2 = new String("is same?");
		
		boolean result = str1 == str2;
		return String.valueOf(result);
	}

	public String ex328() {
		
		String str1 = new String("is same?");
		String str2 = new String("is same?");
		
		boolean result = (str1.equals(str2));
		return String.valueOf(result);
	}

	public String ex331() {
		List<String>list = new ArrayList<>();
		
		list.add("public");
		list.add("static");
		list.add("void");
		
		list.sort(new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				return str1.compareTo(str2);
			}
		});
		list.sort((Comparator<String>) (str1, str2) -> str1.compareTo(str2));
		return null;
	}

	public String ex332() {
		
		List<String>list = new ArrayList<>();
		
		list.add("public");
		list.add("static");
		list.add("void");
		
		list.stream().forEach(str -> System.out.println(str));
		
		return null;
	}

	public String ex333() {
		Integer[] integerArray = new Integer[] {1,2,3,4,5,6,7,8,9,10};
		List<Integer>list = Arrays.asList(integerArray);
		
		List<Integer> evenList = new ArrayList<>();
		
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < list.size(); i++) {
			Integer number = list.get(i);
			if (number %2 == 0) {
				evenList.add(number);
			}
		}
		
		for (int i = 0; i < evenList.size(); i++) {
			result.append(evenList.get(i)).append("<br>");
		}
		String finalresult = result.toString();
		return finalresult;
	}

	public String ex334() {
		
		Integer[] integerArray = new Integer[] {1,2,3,4,5,6,7,8,9,10};
		List<Integer> list = Arrays.asList(integerArray);
		
		List<Integer> evenList = list.stream()
				.filter(value -> value % 2 ==0).collect(Collectors.toList());
		
		evenList.stream().forEach(value -> System.out.println(value));
		return null;
	}

	public String ex335() {
		
		Integer[] integerArray = new Integer[] {1,2,3,4,5};
		List<Integer> list = Arrays.asList(integerArray);
		list.stream().forEach(value -> System.out.println(value));
		return null;
	}





}
