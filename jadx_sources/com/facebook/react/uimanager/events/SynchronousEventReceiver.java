package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.WritableMap;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: SynchronousEventReceiver.kt */
/* JADX INFO: loaded from: classes45.dex */
@Deprecated(message = "Experimental")
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JB\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m90084d2 = {"Lcom/facebook/react/uimanager/events/SynchronousEventReceiver;", "", "receiveEvent", "", "surfaceId", "", "reactTag", "eventName", "", "canCoalesceEvent", "", ReportDataTable.COLUMN_PARAMS, "Lcom/facebook/react/bridge/WritableMap;", "eventCategory", "experimental_isSynchronous", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface SynchronousEventReceiver {
    void receiveEvent(int surfaceId, int reactTag, @NotNull String eventName, boolean canCoalesceEvent, @Nullable WritableMap params, int eventCategory, boolean experimental_isSynchronous);
}
