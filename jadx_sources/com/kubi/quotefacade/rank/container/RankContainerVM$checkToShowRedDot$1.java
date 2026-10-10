package com.kubi.quotefacade.rank.container;

import androidx.lifecycle.MutableLiveData;
import com.kubi.quotefacade.entity.RankEntity;
import com.kubi.quotefacade.rank.NewRankRedDotHelper;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: RankContainerVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.rank.container.RankContainerVM$checkToShowRedDot$1", m90122f = "RankContainerVM.kt", m90123i = {0}, m90124l = {32}, m90125m = "invokeSuspend", m90126n = {"curData"}, m90127s = {"L$0"})
public final class RankContainerVM$checkToShowRedDot$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $subType;
    Object L$0;
    int label;
    final /* synthetic */ RankContainerVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankContainerVM$checkToShowRedDot$1(String str, RankContainerVM rankContainerVM, Continuation<? super RankContainerVM$checkToShowRedDot$1> continuation) {
        super(2, continuation);
        this.$subType = str;
        this.this$0 = rankContainerVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RankContainerVM$checkToShowRedDot$1(this.$subType, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((RankContainerVM$checkToShowRedDot$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<RankEntity> listEmptyList;
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
            NewRankRedDotHelper newRankRedDotHelper = NewRankRedDotHelper.f42388a;
            MutableLiveData<List<RankEntity>> mutableLiveDataM52640h = newRankRedDotHelper.m52640h(this.$subType);
            if (mutableLiveDataM52640h == null || (listEmptyList = mutableLiveDataM52640h.getValue()) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            this.L$0 = SpillingKt.nullOutSpilledVariable(listEmptyList);
            this.label = 1;
            obj = newRankRedDotHelper.m52644m(listEmptyList, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.this$0.send(new C22451a(this.$subType, ((Boolean) obj).booleanValue()));
        return Unit.INSTANCE;
    }
}
