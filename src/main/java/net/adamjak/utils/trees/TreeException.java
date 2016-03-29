package net.adamjak.utils.trees;

/**
 * Created by Tomas Adamjak on 29.3.2016.
 * Copyright 2016, Tomas Adamjak
 * License: The BSD 3-Clause License
 */
public class TreeException extends RuntimeException
{
	public TreeException ()
	{
	}

	public TreeException (String message)
	{
		super(message);
	}

	public TreeException (String message, Throwable cause)
	{
		super(message, cause);
	}

	public TreeException (Throwable cause)
	{
		super(cause);
	}

	public TreeException (String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
	{
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
