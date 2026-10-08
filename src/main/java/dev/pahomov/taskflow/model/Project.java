package dev.pahomov.taskflow;

import java.util.List;
import java.util.LinkedList;

public class Project
{
	private String name;
	private List<Task> tasks;

	public Project(String name)
	{
		this.name	= name;
		this.tasks	= new LinkedList<>();
	}

	// --- GET
	public String getName()
	{ return this.name; }
	
	public List<Task> getTasks()
	{ return this.tasks; }

	public void createTask(String name)
	{ this.tasks.add(new Task(name)); }

	public void createTaskRange(List<Task> taskRange)
	{ this.tasks.addAll(taskRange); }

	public void deleteTask(String taskName)
	{
		for (Task task : this.tasks)
		{
			if (task.getName().equals(taskName))
			{
				this.tasks.remove(task);

				return;
			}
		}

		System.out.println("There is no such task.");
	}

	public void printTasks()
	{
		for (Task task : this.tasks)
		{ System.out.println(String.format("%s \n", task.getName())); }
	}
}
