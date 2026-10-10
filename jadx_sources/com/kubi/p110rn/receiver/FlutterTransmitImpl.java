package com.kubi.p110rn.receiver;

import com.kubi.p110rn.modules.RNPublishSubject;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p741wy.InterfaceC45953m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: FlutterTransmitImpl.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072*\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tj\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u0001`\u000bH\u0016¨\u0006\f"}, m90084d2 = {"Lcom/kubi/rn/receiver/FlutterTransmitImpl;", "Lcom/kubi/sdk/flutter/transmit/IRNNotifyTransmit;", "<init>", "()V", "sendEventToRN", "", "eventName", "", ReportDataTable.COLUMN_PARAMS, "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FlutterTransmitImpl implements InterfaceC45953m {
    @Override // p741wy.InterfaceC45953m
    public void sendEventToRN(@NotNull String eventName, @Nullable HashMap<String, Object> params) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        C44128b.m97266j("FlutterTransmitImpl", "sendEventToRN eventName: " + eventName);
        RNPublishSubject.INSTANCE.getNativeNotifyRn().onNext(new Pair<>(eventName, params));
    }
}
