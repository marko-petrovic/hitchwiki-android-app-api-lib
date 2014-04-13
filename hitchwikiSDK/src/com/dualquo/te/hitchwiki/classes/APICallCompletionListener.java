package com.dualquo.te.hitchwiki.classes;

import com.dualquo.te.hitchwiki.entities.Error;

public interface APICallCompletionListener<T> 
{
	public void onComplete
	(
		boolean success, 
		int occasionalParameter,
		String stringParameter,
		Error error, 
		T object
	);
}
