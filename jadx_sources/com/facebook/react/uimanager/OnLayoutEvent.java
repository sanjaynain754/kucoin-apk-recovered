package com.facebook.react.uimanager;

import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* JADX INFO: loaded from: classes45.dex */
public class OnLayoutEvent extends Event<OnLayoutEvent> {
    private static final Pools.SynchronizedPool<OnLayoutEvent> EVENTS_POOL = new Pools.SynchronizedPool<>(20);
    private int mHeight;
    private int mWidth;

    /* JADX INFO: renamed from: mX */
    private int f9920mX;

    /* JADX INFO: renamed from: mY */
    private int f9921mY;

    @Deprecated
    public static OnLayoutEvent obtain(int i11, int i12, int i13, int i14, int i15) {
        return obtain(-1, i11, i12, i13, i14, i15);
    }

    @Deprecated
    public void init(int i11, int i12, int i13, int i14, int i15) {
        init(-1, i11, i12, i13, i14, i15);
    }

    public static OnLayoutEvent obtain(int i11, int i12, int i13, int i14, int i15, int i16) {
        OnLayoutEvent onLayoutEventAcquire = EVENTS_POOL.acquire();
        if (onLayoutEventAcquire == null) {
            onLayoutEventAcquire = new OnLayoutEvent();
        }
        OnLayoutEvent onLayoutEvent = onLayoutEventAcquire;
        onLayoutEvent.init(i11, i12, i13, i14, i15, i16);
        return onLayoutEvent;
    }

    public void init(int i11, int i12, int i13, int i14, int i15, int i16) {
        super.init(i11, i12);
        this.f9920mX = i13;
        this.f9921mY = i14;
        this.mWidth = i15;
        this.mHeight = i16;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        EVENTS_POOL.release(this);
    }

    private OnLayoutEvent() {
    }

    @Override // com.facebook.react.uimanager.events.Event
    @Nullable
    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("x", PixelUtil.toDIPFromPixel(this.f9920mX));
        writableMapCreateMap.putDouble("y", PixelUtil.toDIPFromPixel(this.f9921mY));
        writableMapCreateMap.putDouble("width", PixelUtil.toDIPFromPixel(this.mWidth));
        writableMapCreateMap.putDouble("height", PixelUtil.toDIPFromPixel(this.mHeight));
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putMap(TtmlNode.TAG_LAYOUT, writableMapCreateMap);
        writableMapCreateMap2.putInt("target", getViewTag());
        return writableMapCreateMap2;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topLayout";
    }
}
