package com.kubi.unify.stream;

import com.kubi.unify.UnifyGlobalDataManager;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: UnifyDataStreamManager.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyDataStreamManager$bindGlobalStateFlow$1", m90122f = "UnifyDataStreamManager.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UnifyDataStreamManager$bindGlobalStateFlow$1 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public UnifyDataStreamManager$bindGlobalStateFlow$1(Continuation<? super UnifyDataStreamManager$bindGlobalStateFlow$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UnifyDataStreamManager$bindGlobalStateFlow$1 unifyDataStreamManager$bindGlobalStateFlow$1 = new UnifyDataStreamManager$bindGlobalStateFlow$1(continuation);
        unifyDataStreamManager$bindGlobalStateFlow$1.L$0 = obj;
        return unifyDataStreamManager$bindGlobalStateFlow$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((UnifyDataStreamManager$bindGlobalStateFlow$1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        UnifyGlobalDataManager.m64868l(UnifyGlobalDataManager.f53084a, str, null, null, 6, null);
        return Unit.INSTANCE;
    }
}
