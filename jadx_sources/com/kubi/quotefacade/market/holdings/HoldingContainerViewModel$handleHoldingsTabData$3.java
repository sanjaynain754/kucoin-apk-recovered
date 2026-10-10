package com.kubi.quotefacade.market.holdings;

import com.kubi.quotefacade.entity.HoldingDir;
import com.kubi.quotefacade.event.UIState;
import com.kubi.quotefacade.service.BQuoteFacadeDepend;
import p212dv.C36974n;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HoldingContainerViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/quotefacade/entity/HoldingDir;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.market.holdings.HoldingContainerViewModel$handleHoldingsTabData$3", m90122f = "HoldingContainerViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class HoldingContainerViewModel$handleHoldingsTabData$3 extends SuspendLambda implements Function2<HoldingDir, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HoldingContainerViewModel this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(HoldingDir holdingDir, Continuation<? super Unit> continuation) {
        return ((HoldingContainerViewModel$handleHoldingsTabData$3) create(holdingDir, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoldingContainerViewModel$handleHoldingsTabData$3(HoldingContainerViewModel holdingContainerViewModel, Continuation<? super HoldingContainerViewModel$handleHoldingsTabData$3> continuation) {
        super(2, continuation);
        this.this$0 = holdingContainerViewModel;
    }

    /* JADX INFO: renamed from: g */
    public static final UIState m52452g(UIState uIState) {
        return UIState.copy$default(uIState, null, new Object(), null, 5, null);
    }

    /* JADX INFO: renamed from: h */
    public static final UIState m52453h(UIState uIState) {
        return UIState.copy$default(uIState, new Object(), null, null, 6, null);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HoldingContainerViewModel$handleHoldingsTabData$3 holdingContainerViewModel$handleHoldingsTabData$3 = new HoldingContainerViewModel$handleHoldingsTabData$3(this.this$0, continuation);
        holdingContainerViewModel$handleHoldingsTabData$3.L$0 = obj;
        return holdingContainerViewModel$handleHoldingsTabData$3;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HoldingDir holdingDir = (HoldingDir) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (holdingDir == null || !BQuoteFacadeDepend.f42592a.m53025e().c()) {
            Boxing.boxBoolean(this.this$0.updateState(new Function1() { // from class: com.kubi.quotefacade.market.holdings.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return HoldingContainerViewModel$handleHoldingsTabData$3.m52453h((UIState) obj2);
                }
            }));
        } else if (Intrinsics.areEqual(holdingDir.getAllHoldingEmpty(), Boxing.boxBoolean(true))) {
            Boxing.boxBoolean(this.this$0.updateState(new Function1() { // from class: com.kubi.quotefacade.market.holdings.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return HoldingContainerViewModel$handleHoldingsTabData$3.m52452g((UIState) obj2);
                }
            }));
        } else {
            this.this$0.send(new C36974n(holdingDir.getList()));
            Unit unit = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
