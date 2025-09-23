package com.frandler.vue;

import java.util.Scanner;

import com.frandler.controller.TaskController;

public class TaskView {

	TaskController tskController = new TaskController();
	private Scanner mscanner = new Scanner(System.in);
	public TaskView() {
		// TODO Auto-generated constructor stub
	}

	
	public void addTask() {
		String taskString ="";
		System.out.print("Please add a new task: ");
		taskString = mscanner.nextLine();
		var res = tskController.addTask(taskString);
		if(res!="") {
			System.err.println(res);
		}
	}
	
	
	public void getTasks() {
		System.out.println(tskController.getTasks());
	}
	
	public void getTaskbyId() {
		// TODO Auto-generated method stub
		System.out.print("Please enter the task ID: ");
		int idTaskInt = mscanner.nextInt();
		//var answer = tskController.getTaskById(idTaskInt);
		
		if(tskController.getTaskById(idTaskInt) != null) {
			System.out.println(tskController.getTaskById(idTaskInt));
		}	
		
	}
	
	public void removeTaskById() {
		// TODO Auto-generated method stub
		System.out.print("------------------------------------------\nPlease enter the ID of task : ");
		int idTaskInt = mscanner.nextInt();
		if (idTaskInt<0) {
			System.err.println("Tache ("+idTaskInt+ ") ivalide");
		}
		tskController.removeTaskById(idTaskInt);
	}
	
	public void getMenu() {
		

		  // Menu simple
      boolean running = true;
      
      while (running) {
          System.out.println("\n=== GESTIONNAIRE DE TÂCHES ===");
          System.out.println("1. Ajouter une tâche");
          System.out.println("2. Afficher les tâches");
          System.out.println("3. Afficher une tâche");
          System.out.println("4. Supprimer une tâche");
          System.out.println("5. Quitter");
          System.out.print("Votre choix : ");
          
          int choice = mscanner.nextInt();
          mscanner.nextLine(); 
          
          switch (choice) {
              case 1:
              	addTask();
                  break;
              case 2:
              	getTasks();
                  break;
              case 3:
            	  getTaskbyId();
                    break;
              case 4:
            	  removeTaskById();
            	  break;
              case 5:
                  running = false;
                  System.out.println("Au revoir !");
                  break;
              default:
                  System.out.println("Choix invalide !");
          }
      }
//      scanner.close();
		
	}
}
