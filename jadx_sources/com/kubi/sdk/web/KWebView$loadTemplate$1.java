package com.kubi.sdk.web;

import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: KWebView.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.web.KWebView", m90122f = "KWebView.kt", m90123i = {0, 0, 0}, m90124l = {327}, m90125m = "loadTemplate", m90126n = {"this", ReportDataTable.COLUMN_PARAMS, "url"}, m90127s = {"L$0", "L$1", "L$2"})
public final class KWebView$loadTemplate$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ KWebView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KWebView$loadTemplate$1(KWebView kWebView, Continuation<? super KWebView$loadTemplate$1> continuation) {
        super(continuation);
        this.this$0 = kWebView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m58574n(null, null, null, this);
    }
}
