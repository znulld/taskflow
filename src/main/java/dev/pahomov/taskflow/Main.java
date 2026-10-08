package dev.pahomov.taskflow;

import dev.pahomov.taskflow.User;

class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello Taskflow");

		User user = new User("");

		user.createProject("Test Project");
		user.createProject("Test Project2");

		if (user.getProject("Test Project2") == null)
		{ System.out.println("No such project."); return; }

		user.getProject("Test Project2").createTask("Task-1");
		user.getProject("Test Project2").createTask("Task-2");
		user.getProject("Test Project2").createTask("Task-3");
		user.getProject("Test Project2").createTask("Task-4");

		user.getProject("Test Project2").deleteTask("Task-3");

		user.getProject("Test Project2").printTasks();
	}
}
