package com.kubi.quotefacade.tradechance;

import com.kubi.mvi.common.MviExKt;
import com.kubi.quotefacade.entity.ChancePlateEntity;
import com.kubi.quotefacade.entity.ChancePlateItem;
import java.util.List;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: TradeChanceVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.tradechance.TradeChanceVM$launchRepeatCall$1", m90122f = "TradeChanceVM.kt", m90123i = {0}, m90124l = {230}, m90125m = "invokeSuspend", m90126n = {"$this$launch"}, m90127s = {"L$0"})
public final class TradeChanceVM$launchRepeatCall$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TradeChanceVM this$0;

    /* JADX INFO: renamed from: com.kubi.quotefacade.tradechance.TradeChanceVM$launchRepeatCall$1$1 */
    /* JADX INFO: compiled from: TradeChanceVM.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.tradechance.TradeChanceVM$launchRepeatCall$1$1", m90122f = "TradeChanceVM.kt", m90123i = {}, m90124l = {232}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C225391 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC41709m0 $$this$launch;
        int label;
        final /* synthetic */ TradeChanceVM this$0;

        public final Object invoke(int i11, Continuation<? super Unit> continuation) {
            return ((C225391) create(Integer.valueOf(i11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                TradeChanceVM tradeChanceVM = this.this$0;
                this.label = 1;
                obj = tradeChanceVM.m53097c0(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ChancePlateEntity chancePlateEntity = (ChancePlateEntity) obj;
            List<ChancePlateItem> plateList = chancePlateEntity != null ? chancePlateEntity.getPlateList() : null;
            if (plateList != null && !plateList.isEmpty() && C41713n0.m91132h(this.$$this$launch)) {
                this.this$0.m53096Z(CollectionsKt.mutableListOf(new ChanceDataPlate(chancePlateEntity)));
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C225391(TradeChanceVM tradeChanceVM, InterfaceC41709m0 interfaceC41709m0, Continuation<? super C225391> continuation) {
            super(2, continuation);
            this.this$0 = tradeChanceVM;
            this.$$this$launch = interfaceC41709m0;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C225391(this.this$0, this.$$this$launch, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return invoke(num.intValue(), continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeChanceVM$launchRepeatCall$1(TradeChanceVM tradeChanceVM, Continuation<? super TradeChanceVM$launchRepeatCall$1> continuation) {
        super(2, continuation);
        this.this$0 = tradeChanceVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TradeChanceVM$launchRepeatCall$1 tradeChanceVM$launchRepeatCall$1 = new TradeChanceVM$launchRepeatCall$1(this.this$0, continuation);
        tradeChanceVM$launchRepeatCall$1.L$0 = obj;
        return tradeChanceVM$launchRepeatCall$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TradeChanceVM$launchRepeatCall$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            this.L$0 = interfaceC41709m0;
            this.label = 1;
            if (DelayKt.m90350b(10000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        TradeChanceVM tradeChanceVM = this.this$0;
        tradeChanceVM.f42618j0 = MviExKt.m42522r(interfaceC41709m0, Integer.MAX_VALUE, 10000L, null, null, null, new C225391(tradeChanceVM, interfaceC41709m0, null), 28, null);
        return Unit.INSTANCE;
    }
}
