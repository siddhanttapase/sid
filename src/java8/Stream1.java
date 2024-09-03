package java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {

	public static void main(String[] args) {
		StringJoiner joiner=new StringJoiner("*");
		joiner.add("Sidd");
		joiner.add("Ruch");
		joiner.add("Sang");
		joiner.add("Shas");
		System.out.println(joiner);

	}

}
