package com.kubi.payment.kucard.helper;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: KuCardHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.kucard.helper.KuCardHelper", m90122f = "KuCardHelper.kt", m90123i = {0}, m90124l = {46}, m90125m = "loadKuCardEntranceConfig", m90126n = {"forceRefresh"}, m90127s = {"Z$0"})
public final class KuCardHelper$loadKuCardEntranceConfig$1 extends ContinuationImpl {
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ KuCardHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KuCardHelper$loadKuCardEntranceConfig$1(KuCardHelper kuCardHelper, Continuation<? super KuCardHelper$loadKuCardEntranceConfig$1> continuation) {
        super(continuation);
        this.this$0 = kuCardHelper;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m48298d(false, this);
    }
}
