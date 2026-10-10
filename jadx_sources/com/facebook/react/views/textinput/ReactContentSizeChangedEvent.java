package com.facebook.react.views.textinput;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* JADX INFO: loaded from: classes45.dex */
public class ReactContentSizeChangedEvent extends Event<ReactTextChangedEvent> {
    public static final String EVENT_NAME = "topContentSizeChange";
    private float mContentHeight;
    private float mContentWidth;

    @Deprecated
    public ReactContentSizeChangedEvent(int i11, float f11, float f12) {
        this(-1, i11, f11, f12);
    }

    public ReactContentSizeChangedEvent(int i11, int i12, float f11, float f12) {
        super(i11, i12);
        this.mContentWidth = f11;
        this.mContentHeight = f12;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @Nullable
    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putDouble("width", this.mContentWidth);
        writableMapCreateMap2.putDouble("height", this.mContentHeight);
        writableMapCreateMap.putMap("contentSize", writableMapCreateMap2);
        writableMapCreateMap.putInt("target", getViewTag());
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return EVENT_NAME;
    }
}
