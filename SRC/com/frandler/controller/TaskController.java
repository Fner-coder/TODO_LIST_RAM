package com.frandler.controller;

import com.frander.model.TaskModel;

public class TaskController {
	TaskModel tskmodel = new TaskModel();
	public TaskController() {
		// TODO Auto-generated constructor stub
	}
	
	public String addTask(String task) {
		String errorString = "";
		String tmpTaskTrimmedString = task.trim();
		
		if (tmpTaskTrimmedString.isEmpty() || tmpTaskTrimmedString == null) {
			errorString= "The task entered is invalid....";
		}
		tskmodel.saveTaks(tmpTaskTrimmedString);
		return errorString;
	}
	
	 public String getTasks() {
		return tskmodel.getTasks();
	 }
	 
	 public boolean getTaskById(int tmpId) {
		 String getTaskString = tskmodel.getTaskById(tmpId);
		 if (getTaskString != null) {
			 System.out.println("\n------------- TACHE RECHERCHEE------------------------");
			 System.out.println("Tache("+tmpId+ ") -> "+ getTaskString+"\n------------------------------------------------------");
		 }
		 else {
			System.err.println("Tache introuvable!");
		}
		 return false;
	}
	 
	 public boolean removeTaskById(int tmpId) {
		 boolean getTaskString = tskmodel.removeTaskById(tmpId);
		 if (getTaskString) 
			 System.out.println("Tache: "+tmpId+ "-> "+ getTaskString+" supprimee \n------------------------------------------------------");
		 else 
			System.err.println("Tache non trouvee!");
		
		 return false;
		 
	}
}

