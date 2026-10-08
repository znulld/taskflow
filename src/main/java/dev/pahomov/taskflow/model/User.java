package dev.pahomov.taskflow;

import java.util.List;
import java.util.LinkedList;

import dev.pahomov.taskflow.Project;

public class User
{
	private String name;
	List<Project> projects;

	public User(String name)
	{
		this.name	= name;
		this.projects	= new LinkedList<>();
	}

	// --- GET
	public String getName()
	{ return this.name; }

	public void createProject(String projName)
	{ this.projects.add(new Project(projName)); }

	public void deleteProject(String projName)
	{
		for (Project project : this.projects)
		{
			if (project.getName().equals(projName))
			{ this.projects.remove(project); }
		}

		System.out.println("There is no such project.");
	}

	public Project getProject(String projName)
	{
		for (Project project : this.projects)
		{
			if (project.getName().equals(projName))
			{ return project; }
		}

		System.out.println("There is no such project.");
		return null;
	}
}
