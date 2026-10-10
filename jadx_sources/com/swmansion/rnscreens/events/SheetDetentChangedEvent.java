package com.swmansion.rnscreens.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: SheetDetentChangedEvent.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\f¨\u0006\u0014"}, m90084d2 = {"Lcom/swmansion/rnscreens/events/SheetDetentChangedEvent;", "Lcom/facebook/react/uimanager/events/Event;", "surfaceId", "", "viewId", "index", "isStable", "", "<init>", "(IIIZ)V", "getIndex", "()I", "()Z", "getEventName", "", "getCoalescingKey", "", "getEventData", "Lcom/facebook/react/bridge/WritableMap;", "Companion", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class SheetDetentChangedEvent extends Event<SheetDetentChangedEvent> {

    @NotNull
    public static final String EVENT_NAME = "topSheetDetentChanged";
    private final int index;
    private final boolean isStable;

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: isStable, reason: from getter */
    public final boolean getIsStable() {
        return this.isStable;
    }

    public SheetDetentChangedEvent(int i11, int i12, int i13, boolean z11) {
        super(i11, i12);
        this.index = i13;
        this.isStable = z11;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @Nullable
    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("index", this.index);
        writableMapCreateMap.putBoolean("isStable", this.isStable);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    public String getEventName() {
        return EVENT_NAME;
    }
}
