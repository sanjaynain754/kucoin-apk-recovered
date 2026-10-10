package com.kubi.kumex.market;

import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.data.market.IMarketService;
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

/* JADX INFO: compiled from: KuMexReadyFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.market.KuMexReadyFragment$initView$1$1$iconUrl$1", m90122f = "KuMexReadyFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KuMexReadyFragment$initView$1$1$iconUrl$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super String>, Object> {
    int label;
    final /* synthetic */ KuMexReadyFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KuMexReadyFragment$initView$1$1$iconUrl$1(KuMexReadyFragment kuMexReadyFragment, Continuation<? super KuMexReadyFragment$initView$1$1$iconUrl$1> continuation) {
        super(2, continuation);
        this.this$0 = kuMexReadyFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KuMexReadyFragment$initView$1$1$iconUrl$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super String> continuation) {
        return ((KuMexReadyFragment$initView$1$1$iconUrl$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            IMarketService iMarketServiceM20286e = RepositoryServiceLocator.f19236a.m20286e();
            String str = this.this$0.f29399V;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("symbol");
                str = null;
            }
            return iMarketServiceM20286e.mo24804d(str);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
