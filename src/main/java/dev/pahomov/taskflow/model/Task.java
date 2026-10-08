package dev.pahomov.taskflow.model;

import static dev.pahomov.taskflow.model.TaskStatus.*;

public class Task
{
	private String name;
	private TaskStatus status;

	public Task()
	{ this(""); }

	public Task(String name)
	{
		this.name	= name;
		this.status 	= TODO;
	}

	// --- GET
	public TaskStatus getStatus()
	{ return this.status; }
	
	public String getName()
	{ return this.name; }
	// --- SET

	public void start()
	{ 
		System.out.println("Starting task.."); 

		status = TaskStatus.IN_PROGRESS;
	}

	public void complete()
	{
		System.out.println("Task complete.");

		status = TaskStatus.DONE;
	}
}
