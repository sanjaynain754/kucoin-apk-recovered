package com.kubi.assets.service;

import com.kubi.assets.entity.B2CConfig;
import io.reactivex.functions.Consumer;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AssetsHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "data", "Lcom/kubi/assets/entity/B2CConfig;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.service.AssetsHelper$fetchB2cConfig$2", m90122f = "AssetsHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AssetsHelper$fetchB2cConfig$2 extends SuspendLambda implements Function2<B2CConfig, Continuation<? super Unit>, Object> {
    final /* synthetic */ Consumer<B2CConfig> $function;
    /* synthetic */ Object L$0;
    int label;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(B2CConfig b2CConfig, Continuation<? super Unit> continuation) {
        return ((AssetsHelper$fetchB2cConfig$2) create(b2CConfig, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetsHelper$fetchB2cConfig$2(Consumer<B2CConfig> consumer, Continuation<? super AssetsHelper$fetchB2cConfig$2> continuation) {
        super(2, continuation);
        this.$function = consumer;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetsHelper$fetchB2cConfig$2 assetsHelper$fetchB2cConfig$2 = new AssetsHelper$fetchB2cConfig$2(this.$function, continuation);
        assetsHelper$fetchB2cConfig$2.L$0 = obj;
        return assetsHelper$fetchB2cConfig$2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        B2CConfig b2CConfig = (B2CConfig) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AssetsHelper.f18688e = b2CConfig;
        Consumer<B2CConfig> consumer = this.$function;
        if (consumer != null) {
            consumer.accept(AssetsHelper.f18688e);
        }
        return Unit.INSTANCE;
    }
}
