package com.frander.model;
import java.util.HashMap;
import java.util.Iterator;
//import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class TaskModel {
// CR U D
	
	//ArrayList<String> masterTache = new ArrayList<>();
	
	Map<Integer, String> masterTache = new HashMap<>();
	int taskId = 0;
	Random random = new Random();
	
	public TaskModel() {
		// TODO Auto-generated constructor stub
	}
	
	public int generateRandomId(int min, int max) {
	    return random.nextInt(max - min) + min;
	}
	
	public int saveTaks(String task) {
	    int taskId = generateRandomId(100, 1000);
	    masterTache.put(taskId, task);
		return taskId;
	}

	public String getTasks() {
        
    	String stringbuiler;
    	stringbuiler = "\n--------------- LISTE DES TACHES ----------------------------------\n";
    	for (Integer key : masterTache.keySet()) {
    	    stringbuiler +="No_Tache: " + key + " -> " + masterTache.get(key)+"\n";
    	}
    	stringbuiler += "-----------------------------------------------------------------\n";
		return stringbuiler;
	}
    
	public String getTaskById(int idEntered) {
    	return masterTache.get(idEntered);
	}
	
	public boolean removeTaskById(int taskIdEntered) {
		return masterTache.remove(taskIdEntered) != null;
	}

}
