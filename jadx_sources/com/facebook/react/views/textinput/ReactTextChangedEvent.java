package com.facebook.react.views.textinput;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* JADX INFO: loaded from: classes45.dex */
public class ReactTextChangedEvent extends Event<ReactTextChangedEvent> {
    public static final String EVENT_NAME = "topChange";
    private int mEventCount;
    private String mText;

    @Deprecated
    public ReactTextChangedEvent(int i11, String str, int i12) {
        this(-1, i11, str, i12);
    }

    public ReactTextChangedEvent(int i11, int i12, String str, int i13) {
        super(i11, i12);
        this.mText = str;
        this.mEventCount = i13;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @Nullable
    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("text", this.mText);
        writableMapCreateMap.putInt("eventCount", this.mEventCount);
        writableMapCreateMap.putInt("target", getViewTag());
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return EVENT_NAME;
    }
}
