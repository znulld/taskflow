package dev.pahomov.taskflow.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTest
{
	@Test
	void shouldHaveTodoStatusWhenCreated()
	{
		Task task = new Task("Test-Task");

		assertEquals(TaskStatus.TODO, task.getStatus());
	}
}
