package src.main.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Berry> listOfBerry = new ArrayList<>();

		for (int i = 1; i < CreateBerry.totalNumber(); i++) {

			listOfBerry.add(new Berry(CreateBerry.berryName(i), CreateBerry.berrySize(i), CreateBerry.growthTime(i)));

		}

		listOfBerry = listOfBerry.stream()
				.sorted(Comparator.comparing(Berry::getGrowthTime).reversed().thenComparing(Berry::getSize))
				.collect(Collectors.toList());

		Berry fastestGrowingBiggestBerry = listOfBerry.get(listOfBerry.size() - 1);

		System.out.println(fastestGrowingBiggestBerry.getName());
		System.out.println(fastestGrowingBiggestBerry.getSize());
		System.out.println(fastestGrowingBiggestBerry.getGrowthTime());

	}

}
