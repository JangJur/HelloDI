package kr.ac.hansung.spring.di;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PetOwner {
	
	private final AnimalType animal;
	
	public void play() {
		animal.sound();
	}

}
