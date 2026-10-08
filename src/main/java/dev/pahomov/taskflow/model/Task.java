package dev.pahomov.taskflow;

import static dev.pahomov.taskflow.TaskStatus.*;

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
}
