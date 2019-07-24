package com.muhammad.dll;

public class DLL {
    public Node head;
    public Node tail;
    
    public DLL() {
        this.head = null;
        this.tail = null;
    }
    
    // the push method will add a new node to the end of the list
    public void push(Node newNode) {
        // if there is no head in the list, aka, an empty list, we set the newNode to be the head and tail of the list
        if(this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        
        // first find the lastNode in the list
        // then, set the lastNode's next to be the newNode;
        // then, we have to set the previous of the lastNode to the lastNode that we found previously.
        // finally, set the list's tail to be the node that we have added
        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        this.tail = newNode;
    }
    
    public void printValuesForward() {
        // find the first node, aka head.
        Node current = this.head;
        
        // while the current node exists...
        while(current != null) {
            // print it's value
            System.out.println(current.value);
            // and move on to it's next node.
            current = current.next;
        }
    }
    
    public void printValuesBackward() {
    	Node current = this.tail;
    	
    	while(current != null) {
    		System.out.println(current.value);
    		
    		current = current.previous;
    	}
    }
    
    public Node pop() {    	
    	Node current = this.tail;
    	Node previous = current.previous;
    	this.tail = previous;   
    	current.previous = null;
    	previous.next = null;
    	return current;
    }
    
    public boolean contains(Integer value) {
    	Node current = this.head;    
        while(current != null) {
        	if (current.value == value) {
        		return true;
        	}
            current = current.next;
        }
        return false;
    }
    
    public int size() {
    	int size = 0;
    	Node current = this.head;
    	while(current != null) {
    		size++;
            current = current.next;
        }
    	return size;
    }
    
    public void insertAt(Node newNode, int index) {
    	if(this.size() < index && index > 0) {
    		System.out.println("Invalid input index");
    		return;
    	}
    	
    	Node current = this.head;
    	
    	for (int i = 0; i < index; i++) {
			current = current.next;
		}
    	
    	Node previous = current.previous;
    	
    	previous.next = newNode;
    	current.previous = newNode;
    	newNode.previous = previous;
    	newNode.next = current;
    }
    
    public void removeAt(int index) {
    	if(this.size() < index && index < 0) {
    		return;
    	} else if (index == this.size()) {
    		this.pop();
    		return;
    	} else if (index == 0) {
    		removeFromBeggining();
    		return;
    	}else {
	    	Node current = this.head;
	    	for (int i = 0; i < index; i++) {
				current = current.next;
			}
	    	Node previous = current.previous;
	    	Node after = current.next;
	    	
	    	previous.next = after;
	    	after.previous = previous;
	    	
	    	current.next = null;
	    	current.previous = null;
    	}

    }

	private Node removeFromBeggining() {
		Node current = this.head;
		Node after = current.next;
		this.head = after;   
		current.next = null;
		after.previous = null;
		return current;
	}
    
    private IsPalindrome checkPalindrome;
    public void setDLLType (IsPalindrome palindrome) {
    	checkPalindrome = palindrome;
    }
    public boolean isPalindrome() {
    	return checkPalindrome.isPalindrome(this);
    }
}
