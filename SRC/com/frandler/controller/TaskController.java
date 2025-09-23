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
	 
	 public String getTaskById(int tmpId) {
		 return tskmodel.getTaskById(tmpId);
	}
	 
	 public void removeTaskById(int tmpId) {
		tskmodel.removeTaskById(tmpId);
	}
}
