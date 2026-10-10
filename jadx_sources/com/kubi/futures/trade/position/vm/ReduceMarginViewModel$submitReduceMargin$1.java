package com.kubi.futures.trade.position.vm;

import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.broker.MultiBizFacadeManager;
import java.math.BigDecimal;
import java.util.concurrent.CancellationException;
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
import p852kotlin.jvm.internal.Intrinsics;
import ug.InterfaceC45233b;

/* JADX INFO: compiled from: ReduceMarginViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.position.vm.ReduceMarginViewModel$submitReduceMargin$1", m90122f = "ReduceMarginViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ReduceMarginViewModel$submitReduceMargin$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isTrial;
    final /* synthetic */ BigDecimal $margin;
    final /* synthetic */ String $positionSide;
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ ReduceMarginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReduceMarginViewModel$submitReduceMargin$1(boolean z11, String str, BigDecimal bigDecimal, String str2, ReduceMarginViewModel reduceMarginViewModel, Continuation<? super ReduceMarginViewModel$submitReduceMargin$1> continuation) {
        super(2, continuation);
        this.$isTrial = z11;
        this.$symbol = str;
        this.$margin = bigDecimal;
        this.$positionSide = str2;
        this.this$0 = reduceMarginViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReduceMarginViewModel$submitReduceMargin$1(this.$isTrial, this.$symbol, this.$margin, this.$positionSide, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ReduceMarginViewModel$submitReduceMargin$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                InterfaceC45233b interfaceC45233bM20259p = MultiBizFacadeManager.m20259p(MultiBizFacadeManager.f19232a, null, 1, null);
                boolean z11 = this.$isTrial;
                String str = this.$symbol;
                String plainString = C6447a.m11724a(this.$margin).toPlainString();
                Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
                interfaceC45233bM20259p.mo93805I(z11, str, plainString, this.$positionSide);
                this.this$0.m27948d0().postValue(new Pair<>(Boxing.boxBoolean(true), null));
            } catch (CancellationException e11) {
                throw e11;
            } catch (Exception e12) {
                this.this$0.m27948d0().postValue(new Pair<>(Boxing.boxBoolean(false), e12));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
