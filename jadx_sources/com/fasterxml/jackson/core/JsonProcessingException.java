package com.fasterxml.jackson.core;

/* JADX INFO: loaded from: classes45.dex */
public class JsonProcessingException extends JacksonException {
    private static final long serialVersionUID = 123;
    protected JsonLocation _location;

    public JsonProcessingException(String str, JsonLocation jsonLocation, Throwable th2) {
        super(str, th2);
        this._location = jsonLocation;
    }

    public void clearLocation() {
        this._location = null;
    }

    public String getMessageSuffix() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.JacksonException
    public Object getProcessor() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.JacksonException
    public JsonLocation getLocation() {
        return this._location;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    public JsonProcessingException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        JsonLocation location = getLocation();
        String messageSuffix = getMessageSuffix();
        if (location == null && messageSuffix == null) {
            return message;
        }
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append(message);
        if (messageSuffix != null) {
            sb2.append(messageSuffix);
        }
        if (location != null) {
            sb2.append('\n');
            sb2.append(" at ");
            sb2.append(location.toString());
        }
        return sb2.toString();
    }

    @Override // com.fasterxml.jackson.core.JacksonException
    public String getOriginalMessage() {
        return super.getMessage();
    }

    public JsonProcessingException(String str, JsonLocation jsonLocation) {
        this(str, jsonLocation, null);
    }

    public JsonProcessingException(String str, Throwable th2) {
        this(str, null, th2);
    }

    public JsonProcessingException(Throwable th2) {
        this(null, null, th2);
    }
}
