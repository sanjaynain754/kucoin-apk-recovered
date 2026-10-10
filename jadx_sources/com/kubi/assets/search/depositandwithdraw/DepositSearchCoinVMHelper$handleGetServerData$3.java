package com.kubi.assets.search.depositandwithdraw;

import com.kubi.assets.entity.SearchCoinEntity;
import java.util.List;
import kotlinx.coroutines.InterfaceC41769w;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: DepositSearchCoinVMHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/assets/entity/SearchCoinEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.search.depositandwithdraw.DepositSearchCoinVMHelper$handleGetServerData$3", m90122f = "DepositSearchCoinVMHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class DepositSearchCoinVMHelper$handleGetServerData$3 extends SuspendLambda implements Function2<List<SearchCoinEntity>, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC41769w<Boolean> $completableDeferred;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DepositSearchCoinVMHelper$handleGetServerData$3(InterfaceC41769w<Boolean> interfaceC41769w, Continuation<? super DepositSearchCoinVMHelper$handleGetServerData$3> continuation) {
        super(2, continuation);
        this.$completableDeferred = interfaceC41769w;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DepositSearchCoinVMHelper$handleGetServerData$3(this.$completableDeferred, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(List<SearchCoinEntity> list, Continuation<? super Unit> continuation) {
        return ((DepositSearchCoinVMHelper$handleGetServerData$3) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.$completableDeferred.mo91370n(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
