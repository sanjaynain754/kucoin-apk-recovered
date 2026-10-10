package com.kubi.payment.fast.data.source;

import com.kubi.payment.fast.data.entities.PlaceBuyOrder;
import com.kubi.payment.fast.data.source.remote.FastRemoteDataSource;
import com.kubi.sdk.base.entity.BaseEntity;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FastRepositoryImpl.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/payment/fast/data/entities/PlaceBuyOrder$Response;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fast.data.source.FastRepositoryImpl$placeBuyCommonOrder$2", m90122f = "FastRepositoryImpl.kt", m90123i = {}, m90124l = {255}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FastRepositoryImpl$placeBuyCommonOrder$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super BaseEntity<PlaceBuyOrder.Response>>, Object> {
    final /* synthetic */ String $colorTheme;
    final /* synthetic */ PlaceBuyOrder.Request $request;
    int label;
    final /* synthetic */ FastRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastRepositoryImpl$placeBuyCommonOrder$2(FastRepositoryImpl fastRepositoryImpl, String str, PlaceBuyOrder.Request request, Continuation<? super FastRepositoryImpl$placeBuyCommonOrder$2> continuation) {
        super(2, continuation);
        this.this$0 = fastRepositoryImpl;
        this.$colorTheme = str;
        this.$request = request;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FastRepositoryImpl$placeBuyCommonOrder$2(this.this$0, this.$colorTheme, this.$request, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super BaseEntity<PlaceBuyOrder.Response>> continuation) {
        return ((FastRepositoryImpl$placeBuyCommonOrder$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        FastRemoteDataSource fastRemoteDataSource = this.this$0.f38591a;
        String str = this.$colorTheme;
        PlaceBuyOrder.Request request = this.$request;
        this.label = 1;
        Object objM46474w = fastRemoteDataSource.m46474w(str, request, this);
        if (objM46474w == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM46474w;
    }
}
