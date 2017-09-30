package cse360project1;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class listOfPages {
	node current;
	public listOfPages(int currentPage) {
		node pages[] = new node[25];
		for(int y = 0; y < 25; y++) {
			if(y<24) {
				int i = y+1;
				pages[y].setNext(pages[i]);
			}
			else {
				//pages[y].setNext(null);
			}
			if(y>0) {
				int i = y-1;
				pages[y].setPrevious(pages[i]);
			}
			else {
				//pages[y].setPrevious(null);
			}
		}
		
		
		current = pages[currentPage-1];
	}
	public JPanel nextPage() {
		current = current.getNext();
		return current.getPanel();
		
	}
	public JPanel previousPage() {
		current = current.getPrevious();
		return current.getPanel();
	}
	
	
	private class node{
		
		JPanel panel = new JPanel();
		node nextPage;
		node previousPage;
		
		public node() {			
			nextPage = null;
			previousPage = null;
		}
		
		public void setNext(node next) {
			nextPage = next;
		}
		
		public void setPrevious(node last) {
			previousPage = last;
		}
		
		public node getNext() {
			return nextPage;
		}
		
		public node getPrevious() {
			return previousPage;
		}
		
		public JPanel getPanel() {
			return panel;
		}
		
		//Kaitlyn and I must discuss the best way to go about
		// this business
		/*
		public void setQuestion(Question q) {
			panel = new Tutor(q);
		}
		
		public void setHTMLLesson(string URL){
			panel = new Tutor(URL);
		}
		
		public void setPDF(PDFFILE pdf){
			panel = new Tutor(pdf);
		}
		
		public void setVideo(string URL){
			panel = new Tutor(URL);
		}
		*/
	}
}
