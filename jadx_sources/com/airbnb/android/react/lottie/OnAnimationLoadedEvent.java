package com.airbnb.android.react.lottie;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: OnAnimationLoadedEvent.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¨\u0006\f"}, m90084d2 = {"Lcom/airbnb/android/react/lottie/OnAnimationLoadedEvent;", "Lcom/facebook/react/uimanager/events/Event;", "surfaceId", "", "viewId", "<init>", "(II)V", "getEventName", "", "getEventData", "Lcom/facebook/react/bridge/WritableMap;", "Companion", "lottie-react-native_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class OnAnimationLoadedEvent extends Event<OnAnimationLoadedEvent> {

    @NotNull
    public static final String EVENT_NAME = "topAnimationLoaded";

    public OnAnimationLoadedEvent(int i11, int i12) {
        super(i11, i12);
    }

    @Override // com.facebook.react.uimanager.events.Event
    @Nullable
    public WritableMap getEventData() {
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    public String getEventName() {
        return EVENT_NAME;
    }
}
