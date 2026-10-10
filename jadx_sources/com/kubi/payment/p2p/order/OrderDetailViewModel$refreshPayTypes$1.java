package com.kubi.payment.p2p.order;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: OrderDetailViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.p2p.order.OrderDetailViewModel", m90122f = "OrderDetailViewModel.kt", m90123i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, m90124l = {481}, m90125m = "refreshPayTypes", m90126n = {"$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "it", "reservedFields", "$i$f$map", "$i$f$mapTo", "$i$a$-map-OrderDetailViewModel$refreshPayTypes$2"}, m90127s = {"L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2"})
public final class OrderDetailViewModel$refreshPayTypes$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OrderDetailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetailViewModel$refreshPayTypes$1(OrderDetailViewModel orderDetailViewModel, Continuation<? super OrderDetailViewModel$refreshPayTypes$1> continuation) {
        super(continuation);
        this.this$0 = orderDetailViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m48797z0(this);
    }
}
