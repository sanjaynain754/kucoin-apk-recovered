package com.kubi.spot.quote.coin;

import com.kubi.sdk.base.entity.BaseEntity;
import e20.InterfaceC37053d;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: KuCoinCoinViewModel.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.quote.coin.KuCoinCoinViewModel$getFlashTrade$1", m90122f = "KuCoinCoinViewModel.kt", m90123i = {0}, m90124l = {63}, m90125m = "invokeSuspend", m90126n = {"$i$a$-runCatching-KuCoinCoinViewModel$getFlashTrade$1$1"}, m90127s = {"I$0"})
public final class KuCoinCoinViewModel$getFlashTrade$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $coin;
    int I$0;
    int label;
    final /* synthetic */ KuCoinCoinViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KuCoinCoinViewModel$getFlashTrade$1(KuCoinCoinViewModel kuCoinCoinViewModel, String str, Continuation<? super KuCoinCoinViewModel$getFlashTrade$1> continuation) {
        super(2, continuation);
        this.this$0 = kuCoinCoinViewModel;
        this.$coin = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KuCoinCoinViewModel$getFlashTrade$1(this.this$0, this.$coin, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KuCoinCoinViewModel$getFlashTrade$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                KuCoinCoinViewModel kuCoinCoinViewModel = this.this$0;
                String str = this.$coin;
                Result.Companion companion = Result.INSTANCE;
                InterfaceC37053d interfaceC37053dM62201q = kuCoinCoinViewModel.m62201q();
                this.I$0 = 0;
                this.label = 1;
                obj = interfaceC37053dM62201q.m82942j(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            objM103844constructorimpl = Result.m103844constructorimpl((Boolean) ((BaseEntity) obj).getData());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        KuCoinCoinViewModel kuCoinCoinViewModel2 = this.this$0;
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            kuCoinCoinViewModel2.m62203s().postValue((Boolean) objM103844constructorimpl);
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97264h(thM103847exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
