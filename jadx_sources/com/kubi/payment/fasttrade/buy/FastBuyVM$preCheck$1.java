package com.kubi.payment.fasttrade.buy;

import com.kubi.otc.entity.FiatUserInfo;
import com.kubi.payment.fast.data.source.IFastRepository;
import kotlinx.coroutines.InterfaceC41709m0;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FastBuyVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttrade.buy.FastBuyVM$preCheck$1", m90122f = "FastBuyVM.kt", m90123i = {}, m90124l = {139}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FastBuyVM$preCheck$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ FastBuyVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastBuyVM$preCheck$1(FastBuyVM fastBuyVM, Continuation<? super FastBuyVM$preCheck$1> continuation) {
        super(2, continuation);
        this.this$0 = fastBuyVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FastBuyVM$preCheck$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FastBuyVM$preCheck$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            if (!this.this$0.f38756b0) {
                this.this$0.f38756b0 = true;
                this.this$0.m45657p().postValue(Boxing.boxBoolean(true));
                IFastRepository iFastRepository = this.this$0.f38754Z;
                this.label = 1;
                obj = iFastRepository.mo46423a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                return Unit.INSTANCE;
            }
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            this.this$0.f38755a0.postValue((FiatUserInfo) ((AbstractC42878k.Success) abstractC42878k).m94040a());
        } else if (abstractC42878k instanceof AbstractC42878k.Error) {
            this.this$0.m45659r().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.this$0.f38756b0 = false;
        this.this$0.m45657p().setValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
