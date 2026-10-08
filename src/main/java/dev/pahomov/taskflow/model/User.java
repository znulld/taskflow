package dev.pahomov.taskflow.model;

import java.util.List;
import java.util.LinkedList;
import java.util.NoSuchElementException;

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

		throw new NoSuchElementException("No such project");
	}

	public Project getProject(String projName)
	{
		for (Project project : this.projects)
		{
			if (project.getName().equals(projName))
			{ return project; }
		}

		thow new NoSuchElementException("No such project.");
		return null;
	}
}
