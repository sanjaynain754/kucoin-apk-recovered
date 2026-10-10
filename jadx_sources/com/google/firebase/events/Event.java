package com.google.firebase.events;

import com.google.firebase.components.Preconditions;

/* JADX INFO: loaded from: classes56.dex */
public class Event<T> {
    private final T payload;
    private final Class<T> type;

    public T getPayload() {
        return this.payload;
    }

    public Class<T> getType() {
        return this.type;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.type, this.payload);
    }

    public Event(Class<T> cls, T t11) {
        this.type = (Class) Preconditions.checkNotNull(cls);
        this.payload = (T) Preconditions.checkNotNull(t11);
    }
}
