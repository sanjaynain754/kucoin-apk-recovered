package com.facebook.react.fabric.events;

import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.uimanager.events.RCTModernEventEmitter;
import com.facebook.react.uimanager.events.TouchEvent;
import com.facebook.systrace.Systrace;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FabricEventEmitter.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0017J*\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016JB\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\tH\u0016J \u0010\u0013\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0017J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0018H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/facebook/react/fabric/events/FabricEventEmitter;", "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;", "uiManager", "Lcom/facebook/react/fabric/FabricUIManager;", "<init>", "(Lcom/facebook/react/fabric/FabricUIManager;)V", "receiveEvent", "", "reactTag", "", "eventName", "", ReportDataTable.COLUMN_PARAMS, "Lcom/facebook/react/bridge/WritableMap;", "surfaceId", "canCoalesceEvent", "", "customCoalesceKey", "category", "receiveTouches", "touches", "Lcom/facebook/react/bridge/WritableArray;", "changedIndices", "event", "Lcom/facebook/react/uimanager/events/TouchEvent;", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class FabricEventEmitter implements RCTModernEventEmitter {

    @NotNull
    private final FabricUIManager uiManager;

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    @Deprecated(message = "Deprecated in Java")
    public void receiveEvent(int reactTag, @NotNull String eventName, @Nullable WritableMap params) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        receiveEvent(-1, reactTag, eventName, params);
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    @Deprecated(message = "Deprecated in Java")
    public void receiveTouches(@NotNull String eventName, @NotNull WritableArray touches, @NotNull WritableArray changedIndices) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(touches, "touches");
        Intrinsics.checkNotNullParameter(changedIndices, "changedIndices");
        throw new UnsupportedOperationException("EventEmitter#receiveTouches is not supported by Fabric");
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int surfaceId, int reactTag, @NotNull String eventName, @Nullable WritableMap params) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        receiveEvent(surfaceId, reactTag, eventName, false, 0, params, 2);
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    @Deprecated(message = "Deprecated in Java")
    public void receiveTouches(@NotNull TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        throw new UnsupportedOperationException("EventEmitter#receiveTouches is not supported by Fabric");
    }

    public FabricEventEmitter(@NotNull FabricUIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        this.uiManager = uiManager;
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int surfaceId, int reactTag, @NotNull String eventName, boolean canCoalesceEvent, int customCoalesceKey, @Nullable WritableMap params, int category) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Systrace.m10662c(0L, "FabricEventEmitter.receiveEvent('" + eventName + "')");
        try {
            this.uiManager.receiveEvent(surfaceId, reactTag, eventName, canCoalesceEvent, params, category);
        } finally {
            Systrace.m10667i(0L);
        }
    }
}
