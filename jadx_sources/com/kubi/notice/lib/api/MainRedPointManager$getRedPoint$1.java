package com.kubi.notice.lib.api;

import android.content.Context;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: MainRedPointManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.notice.lib.api.MainRedPointManager$getRedPoint$1", m90122f = "MainRedPointManager.kt", m90123i = {}, m90124l = {50}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class MainRedPointManager$getRedPoint$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ boolean $needRequestOTC;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainRedPointManager$getRedPoint$1(Context context, boolean z11, Continuation<? super MainRedPointManager$getRedPoint$1> continuation) {
        super(1, continuation);
        this.$context = context;
        this.$needRequestOTC = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MainRedPointManager$getRedPoint$1(this.$context, this.$needRequestOTC, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((MainRedPointManager$getRedPoint$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            MainRedPointManager mainRedPointManager = MainRedPointManager.f36366a;
            Context context = this.$context;
            boolean z11 = this.$needRequestOTC;
            this.label = 1;
            if (mainRedPointManager.m43152l(context, z11, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
