package com.google.api.client.googleapis.notifications;

import com.google.api.client.util.Beta;

/* JADX INFO: loaded from: classes56.dex */
@Beta
public class TypedNotification<T> extends AbstractNotification {
    private T content;

    public TypedNotification(long j11, String str, String str2, String str3, String str4) {
        super(j11, str, str2, str3, str4);
    }

    public TypedNotification(UnparsedNotification unparsedNotification) {
        super(unparsedNotification);
    }

    public final T getContent() {
        return this.content;
    }

    @Override // com.google.api.client.googleapis.notifications.AbstractNotification
    public TypedNotification<T> setChanged(String str) {
        return (TypedNotification) super.setChanged(str);
    }

    @Override // com.google.api.client.googleapis.notifications.AbstractNotification
    public TypedNotification<T> setChannelExpiration(String str) {
        return (TypedNotification) super.setChannelExpiration(str);
    }

    @Override // com.google.api.client.googleapis.notifications.AbstractNotification
    public TypedNotification<T> setChannelId(String str) {
        return (TypedNotification) super.setChannelId(str);
    }

    @Override // com.google.api.client.googleapis.notifications.AbstractNotification
    public TypedNotification<T> setChannelToken(String str) {
        return (TypedNotification) super.setChannelToken(str);
    }

    public TypedNotification<T> setContent(T t11) {
        this.content = t11;
        return this;
    }

    @Override // com.google.api.client.googleapis.notifications.AbstractNotification
    public TypedNotification<T> setMessageNumber(long j11) {
        return (TypedNotification) super.setMessageNumber(j11);
    }

    @Override // com.google.api.client.googleapis.notifications.AbstractNotification
    public TypedNotification<T> setResourceId(String str) {
        return (TypedNotification) super.setResourceId(str);
    }

    @Override // com.google.api.client.googleapis.notifications.AbstractNotification
    public TypedNotification<T> setResourceState(String str) {
        return (TypedNotification) super.setResourceState(str);
    }

    @Override // com.google.api.client.googleapis.notifications.AbstractNotification
    public TypedNotification<T> setResourceUri(String str) {
        return (TypedNotification) super.setResourceUri(str);
    }

    @Override // com.google.api.client.googleapis.notifications.AbstractNotification
    public String toString() {
        return super.toStringHelper().add("content", this.content).toString();
    }
}
