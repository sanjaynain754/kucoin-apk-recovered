package com.kubi.quotefacade.widgets.risefall;

import com.kubi.home.api.HomeConst;
import com.kubi.home.api.HomeWidgetCode;
import com.kubi.mvi.common.MviExKt;
import com.kubi.quotefacade.entity.RiseFallEntity;
import com.kubi.quotefacade.widgets.QuoteWidgetsRepo;
import kotlinx.coroutines.InterfaceC41709m0;
import org.json.JSONException;
import p502oj.C43103h;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: RiseFallWidgetVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.widgets.risefall.RiseFallWidgetVM$startLoadData$2", m90122f = "RiseFallWidgetVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class RiseFallWidgetVM$startLoadData$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RiseFallWidgetVM this$0;

    /* JADX INFO: renamed from: com.kubi.quotefacade.widgets.risefall.RiseFallWidgetVM$startLoadData$2$1 */
    /* JADX INFO: compiled from: RiseFallWidgetVM.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.widgets.risefall.RiseFallWidgetVM$startLoadData$2$1", m90122f = "RiseFallWidgetVM.kt", m90123i = {0}, m90124l = {54}, m90125m = "invokeSuspend", m90126n = {"startTime"}, m90127s = {"J$0"})
    public static final class C226731 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC41709m0 $$this$launch;
        long J$0;
        int label;
        final /* synthetic */ RiseFallWidgetVM this$0;

        public final Object invoke(int i11, Continuation<? super Unit> continuation) {
            return ((C226731) create(Integer.valueOf(i11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C226731(RiseFallWidgetVM riseFallWidgetVM, InterfaceC41709m0 interfaceC41709m0, Continuation<? super C226731> continuation) {
            super(2, continuation);
            this.this$0 = riseFallWidgetVM;
            this.$$this$launch = interfaceC41709m0;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C226731(this.this$0, this.$$this$launch, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return invoke(num.intValue(), continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws JSONException {
            long j11;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    j11 = this.J$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                long jM94718b = C43103h.f95308a.m94718b();
                QuoteWidgetsRepo quoteWidgetsRepo = this.this$0.f42885X;
                this.J$0 = jM94718b;
                this.label = 1;
                obj = quoteWidgetsRepo.m53343l(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j11 = jM94718b;
            }
            RiseFallEntity riseFallEntity = (RiseFallEntity) obj;
            C43103h c43103h = C43103h.f95308a;
            c43103h.m94720d(HomeWidgetCode.ChangeDistribution.getCode(), c43103h.m94718b() - j11);
            if (riseFallEntity != null) {
                this.this$0.m53648r(riseFallEntity);
            } else {
                RiseFallWidgetVM riseFallWidgetVM = this.this$0;
                if (((UIState) riseFallWidgetVM.getState()).getData() == null) {
                    riseFallWidgetVM.send(C22675b.f42891a);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiseFallWidgetVM$startLoadData$2(RiseFallWidgetVM riseFallWidgetVM, Continuation<? super RiseFallWidgetVM$startLoadData$2> continuation) {
        super(2, continuation);
        this.this$0 = riseFallWidgetVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RiseFallWidgetVM$startLoadData$2 riseFallWidgetVM$startLoadData$2 = new RiseFallWidgetVM$startLoadData$2(this.this$0, continuation);
        riseFallWidgetVM$startLoadData$2.L$0 = obj;
        return riseFallWidgetVM$startLoadData$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((RiseFallWidgetVM$startLoadData$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.f42887Z = MviExKt.m42522r(interfaceC41709m0, Integer.MAX_VALUE, HomeConst.f25513a.m28963c(), null, null, null, new C226731(this.this$0, interfaceC41709m0, null), 28, null);
        return Unit.INSTANCE;
    }
}
