package com.facebook.react.views.textinput;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* JADX INFO: loaded from: classes45.dex */
class ReactTextInputKeyPressEvent extends Event<ReactTextInputKeyPressEvent> {
    public static final String EVENT_NAME = "topKeyPress";
    private String mKey;

    @Deprecated
    public ReactTextInputKeyPressEvent(int i11, String str) {
        this(-1, i11, str);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }

    public ReactTextInputKeyPressEvent(int i11, int i12, String str) {
        super(i11, i12);
        this.mKey = str;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @Nullable
    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("key", this.mKey);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return EVENT_NAME;
    }
}
