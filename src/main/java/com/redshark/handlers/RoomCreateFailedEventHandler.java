package com.redshark.handlers;

import com.redshark.event.Event;
import com.redshark.event.EventFactory;
import com.redshark.event.EventHandler;
import com.redshark.event.EventResponse;
import com.redshark.event.EventType;
import com.redshark.event.ExecutorEventDispatcher;

public class RoomCreateFailedEventHandler extends EventHandler {
	
	public RoomCreateFailedEventHandler()
	{
		this.eventType = EventType.ROOM_CREATE_FAILED;
	}
	@Override
	public void onEvent(Event event)
	{
		System.out.println(event.toString());
	}
}
