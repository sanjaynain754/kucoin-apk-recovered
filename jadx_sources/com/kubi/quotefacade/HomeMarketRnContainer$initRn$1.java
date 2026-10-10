package com.kubi.quotefacade;

import com.blankj.utilcode.util.C5286o;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.sdk.BaseFragment;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41709m0;
import p241ev.C37266a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: HomeMarketRnContainer.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.HomeMarketRnContainer$initRn$1", m90122f = "HomeMarketRnContainer.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nHomeMarketRnContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeMarketRnContainer.kt\ncom/kubi/quotefacade/HomeMarketRnContainer$initRn$1\n+ 2 QuoteIssue.kt\ncom/kubi/quotefacade/exception/QuoteIssueKt\n*L\n1#1,233:1\n45#2,7:234\n*S KotlinDebug\n*F\n+ 1 HomeMarketRnContainer.kt\ncom/kubi/quotefacade/HomeMarketRnContainer$initRn$1\n*L\n133#1:234,7\n*E\n"})
public final class HomeMarketRnContainer$initRn$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ HomeMarketRnContainer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeMarketRnContainer$initRn$1(HomeMarketRnContainer homeMarketRnContainer, Continuation<? super HomeMarketRnContainer$initRn$1> continuation) {
        super(2, continuation);
        this.this$0 = homeMarketRnContainer;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeMarketRnContainer$initRn$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((HomeMarketRnContainer$initRn$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                try {
                    BaseFragment rnRootFragment = IReactNativeService.INSTANCE.get().getRnRootFragment(this.this$0.m50174q3());
                    HomeMarketRnContainer homeMarketRnContainer = this.this$0;
                    homeMarketRnContainer.f40954U = rnRootFragment;
                    C5286o.m6317a(homeMarketRnContainer.getChildFragmentManager(), rnRootFragment, R$id.fl_container);
                    homeMarketRnContainer.m50177u3();
                } catch (Exception e11) {
                    if (e11 instanceof CancellationException) {
                        Unit unit = Unit.INSTANCE;
                        this.this$0.f40957X = false;
                        return unit;
                    }
                    String tag = this.this$0.getTAG();
                    Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
                    C37266a.m83411b(e11, tag);
                }
                return Unit.INSTANCE;
            } finally {
                this.this$0.f40957X = false;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
