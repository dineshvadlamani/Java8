package com.example.lambda;

public interface DefaultStaticMethods {

	String getBrand();

	String speedUp();

	String slowDown();

	default String turnAlarm() {
		return "turning vehicle alaram";
	}

	default String turnAlarmOff() {
		return "turning vehicle alaram off";
	}

	public class Car implements DefaultStaticMethods {

		@Override
		public String getBrand() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String speedUp() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String slowDown() {
			// TODO Auto-generated method stub
			return null;
		}

	}
}
