package com.example.demo;

public class FizzBuzz {

	public String fizzBuzz(int input) {
//		if(input % 15 == 0) {
//			return "FizzBuzz";
//		}
//		if(input % 3 == 0) {
//			return "Fizz";
//		}
//		if(input % 5 == 0) {
//			return "Buzz";
//		}
		IFizzBuzz rules[] = { new FizzBuzzRule(), new FizzRule(), new BuzzRule()};
		for(IFizzBuzz rule : rules) {
			if(rule.isValid(input)) {
				return rule.say();
			}
		}
		
		return input+"";
	}
	
	interface IFizzBuzz{
		public boolean isValid(int input);
		public String say();
	}
	
	class FizzRule implements IFizzBuzz{

		@Override
		public boolean isValid(int input) {
			return input % 3 == 0;
		}

		@Override
		public String say() {
			return "Fizz";
		}
	}
	
	class BuzzRule implements IFizzBuzz{

		@Override
		public boolean isValid(int input) {
			return input % 5 == 0;
		}

		@Override
		public String say() {
			return "Buzz";
		}
	}
	class FizzBuzzRule implements IFizzBuzz{

		@Override
		public boolean isValid(int input) {
			return input % 15 == 0;
		}

		@Override
		public String say() {
			return "FizzBuzz";
		}
	}
}
