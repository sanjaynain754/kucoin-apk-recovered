package com.facebook.react.views.textinput;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* JADX INFO: loaded from: classes45.dex */
class ReactTextInputEndEditingEvent extends Event<ReactTextInputEndEditingEvent> {
    private static final String EVENT_NAME = "topEndEditing";
    private String mText;

    @Deprecated
    public ReactTextInputEndEditingEvent(int i11, String str) {
        this(-1, i11, str);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }

    public ReactTextInputEndEditingEvent(int i11, int i12, String str) {
        super(i11, i12);
        this.mText = str;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @Nullable
    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("target", getViewTag());
        writableMapCreateMap.putString("text", this.mText);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return EVENT_NAME;
    }
}
