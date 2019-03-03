package Emppackage;

import java.util.ArrayList;

public class Evaluation {
	ArrayList<String> metric = new ArrayList<String>();
	ArrayList<Integer> rating = new ArrayList<Integer>();
	ArrayList<Integer> weight = new ArrayList<Integer>();
	
	public Evaluation ()  {
	//constructer	
	}
	//metric methods
	public void  createMetric(){
		metric.add("gui input");    
	}
	public void  deleteMetric(){
		metric.remove("gui input");   
	}
	
	public void  clearMetric(){
		metric.clear();    
	}
	public void  setMetric(){
		metric.set(4,"userinput");  
	}
	
	//rating methods
	public void  createRating(){
		rating.add(3);    
	}
	public void  deleteRating(){
		rating.remove(5);   
	}
	
	public void  clearRating(){
		rating.clear();    
	}
	public void  setRating(){
		rating.set(4,5);  
	}
	//weight methods
		public void  createweight(){
			weight.add(3);    
		}
		public void  deleteWeight(){
			weight.remove(5);   
		}
		
		public void  clearWeight(){
			weight.clear();    
		}
		public void  setWeight(){
			weight.set(4,"userinput");  
		}
}

