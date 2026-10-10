package com.facebook.react.internal.interop;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InteropEventEmitter.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0017J \u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0017J\u0012\u0010\u0014\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/facebook/react/internal/interop/InteropEventEmitter;", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "eventDispatcherOverride", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "receiveEvent", "", "targetReactTag", "", "eventName", "", "eventData", "Lcom/facebook/react/bridge/WritableMap;", "receiveTouches", "touches", "Lcom/facebook/react/bridge/WritableArray;", "changedIndices", "overrideEventDispatcher", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class InteropEventEmitter implements RCTEventEmitter {

    @Nullable
    private EventDispatcher eventDispatcherOverride;

    @NotNull
    private final ReactContext reactContext;

    @VisibleForTesting
    public final void overrideEventDispatcher(@Nullable EventDispatcher eventDispatcherOverride) {
        this.eventDispatcherOverride = eventDispatcherOverride;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    @Deprecated(message = "Deprecated in Java")
    public void receiveEvent(int targetReactTag, @NotNull String eventName, @Nullable WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        EventDispatcher eventDispatcherForReactTag = this.eventDispatcherOverride;
        if (eventDispatcherForReactTag == null) {
            eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.reactContext, targetReactTag);
        }
        int surfaceId = UIManagerHelper.getSurfaceId(this.reactContext);
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new InteropEvent(eventName, eventData, surfaceId, targetReactTag));
        }
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    @Deprecated(message = "Deprecated in Java")
    public void receiveTouches(@NotNull String eventName, @NotNull WritableArray touches, @NotNull WritableArray changedIndices) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(touches, "touches");
        Intrinsics.checkNotNullParameter(changedIndices, "changedIndices");
        throw new UnsupportedOperationException("EventEmitter#receiveTouches is not supported by the Fabric Interop Layer");
    }

    public InteropEventEmitter(@NotNull ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }
}
