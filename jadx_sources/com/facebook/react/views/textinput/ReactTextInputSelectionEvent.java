package com.facebook.react.views.textinput;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* JADX INFO: loaded from: classes45.dex */
class ReactTextInputSelectionEvent extends Event<ReactTextInputSelectionEvent> {
    private static final String EVENT_NAME = "topSelectionChange";
    private int mSelectionEnd;
    private int mSelectionStart;

    @Deprecated
    public ReactTextInputSelectionEvent(int i11, int i12, int i13) {
        this(-1, i11, i12, i13);
    }

    public ReactTextInputSelectionEvent(int i11, int i12, int i13, int i14) {
        super(i11, i12);
        this.mSelectionStart = i13;
        this.mSelectionEnd = i14;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @Nullable
    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt("end", this.mSelectionEnd);
        writableMapCreateMap2.putInt("start", this.mSelectionStart);
        writableMapCreateMap.putMap("selection", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return EVENT_NAME;
    }
}
