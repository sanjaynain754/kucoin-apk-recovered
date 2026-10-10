package com.kubi.futures.trade.welfare.vm;

import com.kubi.broker.RepositoryServiceLocator;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FuturesAirdropHistoryViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.welfare.vm.FuturesAirdropHistoryViewModel$fetchAirdropList$1", m90122f = "FuturesAirdropHistoryViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FuturesAirdropHistoryViewModel$fetchAirdropList$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $page;
    final /* synthetic */ int $pageSize;
    final /* synthetic */ String $status;
    int label;
    final /* synthetic */ FuturesAirdropHistoryViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAirdropHistoryViewModel$fetchAirdropList$1(String str, int i11, int i12, FuturesAirdropHistoryViewModel futuresAirdropHistoryViewModel, Continuation<? super FuturesAirdropHistoryViewModel$fetchAirdropList$1> continuation) {
        super(2, continuation);
        this.$status = str;
        this.$page = i11;
        this.$pageSize = i12;
        this.this$0 = futuresAirdropHistoryViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesAirdropHistoryViewModel$fetchAirdropList$1(this.$status, this.$page, this.$pageSize, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FuturesAirdropHistoryViewModel$fetchAirdropList$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.m28738n().postValue(new Pair<>(Boxing.boxBoolean(false), RepositoryServiceLocator.f19236a.m20292k().mo100556d(this.$status, this.$page, this.$pageSize)));
            this.this$0.f24912X = 1;
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
