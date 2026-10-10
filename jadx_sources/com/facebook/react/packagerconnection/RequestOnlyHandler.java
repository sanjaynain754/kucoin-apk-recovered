package com.facebook.react.packagerconnection;

import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p747x3.C45999a;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: RequestOnlyHandler.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\u000b"}, m90084d2 = {"Lcom/facebook/react/packagerconnection/RequestOnlyHandler;", "Lcom/facebook/react/packagerconnection/RequestHandler;", "<init>", "()V", "onRequest", "", ReportDataTable.COLUMN_PARAMS, "", "responder", "Lcom/facebook/react/packagerconnection/Responder;", "onNotification", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public abstract class RequestOnlyHandler implements RequestHandler {
    @Override // com.facebook.react.packagerconnection.RequestHandler
    public abstract void onRequest(@Nullable Object params, @NotNull Responder responder);

    @Override // com.facebook.react.packagerconnection.RequestHandler
    public final void onNotification(@Nullable Object params) {
        C45999a.m101507m(JSPackagerClient.class.getSimpleName(), "Notification is not supported");
    }
}
