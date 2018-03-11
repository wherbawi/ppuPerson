package edu.ppu.runners;

import java.util.Arrays;
import java.util.List;

import edu.ppu.domain.Person;

public class Runner {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person(200, "x"), new Person(20, "z"), new Person(30, "d"));
		double avg;
		avg = getAvg(persons);
		System.out.println(avg);
	}

	private static double getAvg(List<Person> persons) {
		double avg;
		int sum = 0;
		for (Person person : persons) {
			System.out.println(person);
			sum += person.getAge();
		}
		avg = sum / persons.size();
		return avg;
	}

}
