package com.kubi.quotefacade.favorites;

import com.kubi.quotefacade.entity.HoldingCombinedData;
import com.kubi.quotefacade.entity.HoldingCombinedItem;
import com.kubi.quotefacade.service.BQuoteFacadeDepend;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: FavHoldingsViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "data", "Lcom/kubi/quotefacade/entity/HoldingCombinedData;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.FavHoldingsViewModel$handleHoldingsTabData$2", m90122f = "FavHoldingsViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FavHoldingsViewModel$handleHoldingsTabData$2 extends SuspendLambda implements Function2<HoldingCombinedData, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FavHoldingsViewModel this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(HoldingCombinedData holdingCombinedData, Continuation<? super Unit> continuation) {
        return ((FavHoldingsViewModel$handleHoldingsTabData$2) create(holdingCombinedData, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavHoldingsViewModel$handleHoldingsTabData$2(FavHoldingsViewModel favHoldingsViewModel, Continuation<? super FavHoldingsViewModel$handleHoldingsTabData$2> continuation) {
        super(2, continuation);
        this.this$0 = favHoldingsViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FavHoldingsViewModel$handleHoldingsTabData$2 favHoldingsViewModel$handleHoldingsTabData$2 = new FavHoldingsViewModel$handleHoldingsTabData$2(this.this$0, continuation);
        favHoldingsViewModel$handleHoldingsTabData$2.L$0 = obj;
        return favHoldingsViewModel$handleHoldingsTabData$2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        List<HoldingCombinedItem> combinedList;
        HoldingCombinedData holdingCombinedData = (HoldingCombinedData) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Integer numBoxInt = null;
        if (BQuoteFacadeDepend.f42592a.m53025e().c()) {
            List<HoldingCombinedItem> combinedList2 = holdingCombinedData != null ? holdingCombinedData.getCombinedList() : null;
            if (combinedList2 == null || combinedList2.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            z11 = false;
        }
        String str = FavHoldingsViewModel.f41685a0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[handleHoldingsTabData] combinedListSize:");
        if (holdingCombinedData != null && (combinedList = holdingCombinedData.getCombinedList()) != null) {
            numBoxInt = Boxing.boxInt(combinedList.size());
        }
        sb2.append(numBoxInt);
        sb2.append(", show:");
        sb2.append(z11);
        C44128b.m97259c(str, sb2.toString());
        this.this$0.f41686X = Boxing.boxBoolean(z11);
        this.this$0.send(new C22059q0(z11));
        return Unit.INSTANCE;
    }
}
