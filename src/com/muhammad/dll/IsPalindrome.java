package com.muhammad.dll;

public interface IsPalindrome {
	 public boolean isPalindrome(DLL dll);
}

class IntegerInput implements IsPalindrome {
	@Override
	public boolean isPalindrome(DLL dll) {
    	Node before = dll.head;
    	Node after = dll.tail;
    	
    	int halfOfList = ((dll.size())/2);
    	for (int i = 0; i < halfOfList; i++) {
			if(before.value != after.value) {
				return false;
			}
			before = before.next;
			after = after.previous;
		}
    	return true;
    }
}

