package com.facebook.react.views.textinput;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* JADX INFO: loaded from: classes45.dex */
class ReactTextInputFocusEvent extends Event<ReactTextInputFocusEvent> {
    private static final String EVENT_NAME = "topFocus";

    @Deprecated
    public ReactTextInputFocusEvent(int i11) {
        this(-1, i11);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }

    public ReactTextInputFocusEvent(int i11, int i12) {
        super(i11, i12);
    }

    @Override // com.facebook.react.uimanager.events.Event
    @Nullable
    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("target", getViewTag());
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return EVENT_NAME;
    }
}
