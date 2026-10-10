package com.kubi.sdk.flutter.delegate;

import android.content.Context;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: KnbHandlerHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.flutter.delegate.KnbHandlerHelper$handleKnb$2", m90122f = "KnbHandlerHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KnbHandlerHelper$handleKnb$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ MethodCall $call;
    final /* synthetic */ Context $context;
    final /* synthetic */ MethodChannel.Result $result;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KnbHandlerHelper$handleKnb$2(MethodCall methodCall, Context context, MethodChannel.Result result, Continuation<? super KnbHandlerHelper$handleKnb$2> continuation) {
        super(2, continuation);
        this.$call = methodCall;
        this.$context = context;
        this.$result = result;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KnbHandlerHelper$handleKnb$2(this.$call, this.$context, this.$result, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KnbHandlerHelper$handleKnb$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            KnbHandlerHelper knbHandlerHelper = KnbHandlerHelper.f46655a;
            Map mapM56787j = knbHandlerHelper.m56787j(this.$call.arguments);
            String str = this.$call.method;
            C44128b.m97259c("KnbHandler", "knb_call:" + str + ' ' + mapM56787j);
            Context context = this.$context;
            Intrinsics.checkNotNull(str);
            knbHandlerHelper.m56784f(context, str, mapM56787j, this.$result);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
