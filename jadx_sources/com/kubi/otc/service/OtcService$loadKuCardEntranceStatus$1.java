package com.kubi.otc.service;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: OtcService.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.otc.service.OtcService", m90122f = "OtcService.kt", m90123i = {0}, m90124l = {201}, m90125m = "loadKuCardEntranceStatus", m90126n = {"forceRefresh"}, m90127s = {"Z$0"})
public final class OtcService$loadKuCardEntranceStatus$1 extends ContinuationImpl {
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OtcService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtcService$loadKuCardEntranceStatus$1(OtcService otcService, Continuation<? super OtcService$loadKuCardEntranceStatus$1> continuation) {
        super(continuation);
        this.this$0 = otcService;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo43959f(false, this);
    }
}
