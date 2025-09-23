package com.frander.model;
import java.util.ArrayList;

public class TaskModel {
// CR U D
	ArrayList<String> masterTache = new ArrayList<>();
	
	public TaskModel() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void saveTaks(String task) {
	    masterTache.add(task);
	}

	
    public String getTasks() {
        
    	String stringbuiler;
    	stringbuiler = "--------------- LISTE DES TACHES ----------------------------------\n";
    	for(int i = 0; i < masterTache.size(); i++) {   
    		   
               stringbuiler += "Task "+(i+1)+" : "+ masterTache.get(i) +" \n";
    	}
    	stringbuiler += "-----------------------------------------------------------------\n";
		return stringbuiler;
	}
    
    public String getTaskById(int id) {
        
    	String stringbuiler;
    	stringbuiler = "--------------- LISTE DES TACHES ----------------------------------\n";
    	for(int i = 0; i < masterTache.size(); i++) {   
               if (id == i+1) {
            	   stringbuiler = "\nTache "+(id)+" --> "+masterTache.get(i)+"\n";
			}
    	}
    	stringbuiler += "----------------------------------------------------------------------\n";
		return stringbuiler;
	}
    
    
    public void removeTaskById(int taskid) {
    	String builder;
    	builder = "--------------- SUPPRESSION DE TACHES ----------------------------------\n";
    	for(int i = 0; i < masterTache.size(); i++) {   
               if (taskid == i) {
            	   masterTache.remove(taskid);
			}
    	}
    	builder += "----------------------------------------------------------------------\n";
		
	}


}
