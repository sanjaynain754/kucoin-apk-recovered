package com.facebook.react.uimanager.events;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.SystemClock;
import com.facebook.react.uimanager.events.Event;

/* JADX INFO: loaded from: classes45.dex */
public abstract class Event<T extends Event> {
    private static int sUniqueID;

    @Nullable
    private EventAnimationDriverMatchSpec mEventAnimationDriverMatchSpec;
    private boolean mInitialized;
    private int mSurfaceId;
    private long mTimestampMs;
    private int mUniqueID;
    private int mViewTag;

    public interface EventAnimationDriverMatchSpec {
        boolean match(int i11, String str);
    }

    public Event() {
        int i11 = sUniqueID;
        sUniqueID = i11 + 1;
        this.mUniqueID = i11;
    }

    public boolean canCoalesce() {
        return true;
    }

    public final void dispose() {
        this.mInitialized = false;
        onDispose();
    }

    public boolean experimental_isSynchronous() {
        return false;
    }

    public short getCoalescingKey() {
        return (short) 0;
    }

    public int getEventCategory() {
        return 2;
    }

    @Nullable
    public WritableMap getEventData() {
        return null;
    }

    public abstract String getEventName();

    @Deprecated
    public void init(int i11) {
        init(-1, i11);
    }

    public EventAnimationDriverMatchSpec getEventAnimationDriverMatchSpec() {
        if (this.mEventAnimationDriverMatchSpec == null) {
            this.mEventAnimationDriverMatchSpec = new EventAnimationDriverMatchSpec() { // from class: com.facebook.react.uimanager.events.Event.1
                @Override // com.facebook.react.uimanager.events.Event.EventAnimationDriverMatchSpec
                public boolean match(int i11, String str) {
                    return i11 == Event.this.getViewTag() && str.equals(Event.this.getEventName());
                }
            };
        }
        return this.mEventAnimationDriverMatchSpec;
    }

    public final int getSurfaceId() {
        return this.mSurfaceId;
    }

    public final long getTimestampMs() {
        return this.mTimestampMs;
    }

    public int getUniqueID() {
        return this.mUniqueID;
    }

    public final int getViewTag() {
        return this.mViewTag;
    }

    public void init(int i11, int i12) {
        init(i11, i12, SystemClock.uptimeMillis());
    }

    public boolean isInitialized() {
        return this.mInitialized;
    }

    @Deprecated
    public Event(int i11) {
        int i12 = sUniqueID;
        sUniqueID = i12 + 1;
        this.mUniqueID = i12;
        init(i11);
    }

    public T coalesce(T t11) {
        if (getTimestampMs() >= t11.getTimestampMs()) {
            return this;
        }
        return t11;
    }

    @Deprecated
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), getEventData());
    }

    public void dispatchModern(RCTModernEventEmitter rCTModernEventEmitter) {
        if (getSurfaceId() != -1) {
            rCTModernEventEmitter.receiveEvent(getSurfaceId(), getViewTag(), getEventName(), canCoalesce(), getCoalescingKey(), getEventData(), getEventCategory());
        } else {
            dispatch(rCTModernEventEmitter);
        }
    }

    public void init(int i11, int i12, long j11) {
        this.mSurfaceId = i11;
        this.mViewTag = i12;
        this.mTimestampMs = j11;
        this.mInitialized = true;
    }

    public Event(int i11, int i12) {
        int i13 = sUniqueID;
        sUniqueID = i13 + 1;
        this.mUniqueID = i13;
        init(i11, i12);
    }

    public void onDispose() {
    }
}
