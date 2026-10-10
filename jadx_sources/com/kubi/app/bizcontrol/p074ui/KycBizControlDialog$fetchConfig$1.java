package com.kubi.app.bizcontrol.p074ui;

import androidx.lifecycle.MutableLiveData;
import kotlinx.coroutines.InterfaceC41709m0;
import p294gz.C38058b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KycBizControlDialog.kt */
/* JADX INFO: loaded from: classes64.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.app.bizcontrol.ui.KycBizControlDialog$fetchConfig$1", m90122f = "KycBizControlDialog.kt", m90123i = {}, m90124l = {90}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KycBizControlDialog$fetchConfig$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ KycBizControlDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycBizControlDialog$fetchConfig$1(KycBizControlDialog kycBizControlDialog, Continuation<? super KycBizControlDialog$fetchConfig$1> continuation) {
        super(2, continuation);
        this.this$0 = kycBizControlDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KycBizControlDialog$fetchConfig$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KycBizControlDialog$fetchConfig$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableLiveData mutableLiveData;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                mutableLiveData = (MutableLiveData) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            MutableLiveData mutableLiveData2 = this.this$0.f15523Z;
            C38058b c38058b = C38058b.f85672a;
            this.L$0 = mutableLiveData2;
            this.label = 1;
            Object objM85931c = c38058b.m85931c(this);
            if (objM85931c == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableLiveData = mutableLiveData2;
            obj = objM85931c;
        }
        mutableLiveData.postValue(obj);
        return Unit.INSTANCE;
    }
}
