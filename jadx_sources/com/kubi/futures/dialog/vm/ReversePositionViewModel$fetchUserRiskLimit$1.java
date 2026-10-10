package com.kubi.futures.dialog.vm;

import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.kumex.data.platform.model.UserMaxLeverageEntity;
import java.math.BigDecimal;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ReversePositionViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.dialog.vm.ReversePositionViewModel$fetchUserRiskLimit$1", m90122f = "ReversePositionViewModel.kt", m90123i = {0}, m90124l = {75}, m90125m = "invokeSuspend", m90126n = {"leverageEntity"}, m90127s = {"L$0"})
public final class ReversePositionViewModel$fetchUserRiskLimit$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isTrial;
    final /* synthetic */ BigDecimal $maxLeverage;
    final /* synthetic */ String $symbol;
    Object L$0;
    int label;
    final /* synthetic */ ReversePositionViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.futures.dialog.vm.ReversePositionViewModel$fetchUserRiskLimit$1$1 */
    /* JADX INFO: compiled from: ReversePositionViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.dialog.vm.ReversePositionViewModel$fetchUserRiskLimit$1$1", m90122f = "ReversePositionViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C131411 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ UserMaxLeverageEntity $leverageEntity;
        final /* synthetic */ BigDecimal $maxLeverage;
        final /* synthetic */ String $symbol;
        int label;
        final /* synthetic */ ReversePositionViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131411(ReversePositionViewModel reversePositionViewModel, UserMaxLeverageEntity userMaxLeverageEntity, BigDecimal bigDecimal, String str, Continuation<? super C131411> continuation) {
            super(2, continuation);
            this.this$0 = reversePositionViewModel;
            this.$leverageEntity = userMaxLeverageEntity;
            this.$maxLeverage = bigDecimal;
            this.$symbol = str;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C131411(this.this$0, this.$leverageEntity, this.$maxLeverage, this.$symbol, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C131411) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ReversePositionViewModel reversePositionViewModel = this.this$0;
                BigDecimal isolatedMaxLeverage = this.$leverageEntity.getIsolatedMaxLeverage();
                if (isolatedMaxLeverage == null) {
                    isolatedMaxLeverage = this.$maxLeverage;
                }
                reversePositionViewModel.f22955b0 = isolatedMaxLeverage;
                this.this$0.m25467G().setValue(this.this$0.m25468H(this.$symbol));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReversePositionViewModel$fetchUserRiskLimit$1(boolean z11, String str, ReversePositionViewModel reversePositionViewModel, BigDecimal bigDecimal, Continuation<? super ReversePositionViewModel$fetchUserRiskLimit$1> continuation) {
        super(2, continuation);
        this.$isTrial = z11;
        this.$symbol = str;
        this.this$0 = reversePositionViewModel;
        this.$maxLeverage = bigDecimal;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReversePositionViewModel$fetchUserRiskLimit$1(this.$isTrial, this.$symbol, this.this$0, this.$maxLeverage, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ReversePositionViewModel$fetchUserRiskLimit$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
            UserMaxLeverageEntity userMaxLeverageEntityMo4498L0 = MultiBizFacadeManager.m20260s(MultiBizFacadeManager.f19232a, null, 1, null).mo4498L0(this.$isTrial, this.$symbol);
            AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
            C131411 c131411 = new C131411(this.this$0, userMaxLeverageEntityMo4498L0, this.$maxLeverage, this.$symbol, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(userMaxLeverageEntityMo4498L0);
            this.label = 1;
            if (C41686h.m91049g(abstractC41697j0M94121c, c131411, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
