package com.kubi.futures.dialog.vm;

import androidx.fragment.app.Fragment;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.utils.CoroutineExKt;
import com.kubi.utils.extensions.C27039d;
import fm.C37567b;
import fm.C37569d;
import java.math.BigDecimal;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import th.InterfaceC44980d;

/* JADX INFO: compiled from: ReversePositionViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.dialog.vm.ReversePositionViewModel$submitOfPositionFragment$1", m90122f = "ReversePositionViewModel.kt", m90123i = {}, m90124l = {132, 144}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ReversePositionViewModel$submitOfPositionFragment$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ PositionEntity $finalPosition;
    final /* synthetic */ Fragment $fragment;
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ ReversePositionViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.futures.dialog.vm.ReversePositionViewModel$submitOfPositionFragment$1$1 */
    /* JADX INFO: compiled from: ReversePositionViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.dialog.vm.ReversePositionViewModel$submitOfPositionFragment$1$1", m90122f = "ReversePositionViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C131421 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ PositionEntity $finalPosition;
        final /* synthetic */ String $symbol;
        int label;
        final /* synthetic */ ReversePositionViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131421(ReversePositionViewModel reversePositionViewModel, PositionEntity positionEntity, String str, Continuation<? super C131421> continuation) {
            super(1, continuation);
            this.this$0 = reversePositionViewModel;
            this.$finalPosition = positionEntity;
            this.$symbol = str;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C131421(this.this$0, this.$finalPosition, this.$symbol, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C131421) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.f22955b0 = MultiBizFacadeManager.m20260s(MultiBizFacadeManager.f19232a, null, 1, null).mo4498L0(this.$finalPosition.isTrialFunds(), this.$symbol).getIsolatedMaxLeverage();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.dialog.vm.ReversePositionViewModel$submitOfPositionFragment$1$3 */
    /* JADX INFO: compiled from: ReversePositionViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.dialog.vm.ReversePositionViewModel$submitOfPositionFragment$1$3", m90122f = "ReversePositionViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C131433 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ PositionEntity $finalPosition;
        final /* synthetic */ Fragment $fragment;
        int label;
        final /* synthetic */ ReversePositionViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131433(ReversePositionViewModel reversePositionViewModel, Fragment fragment, PositionEntity positionEntity, Continuation<? super C131433> continuation) {
            super(2, continuation);
            this.this$0 = reversePositionViewModel;
            this.$fragment = fragment;
            this.$finalPosition = positionEntity;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C131433(this.this$0, this.$fragment, this.$finalPosition, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C131433) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.m25472L(this.$fragment, this.$finalPosition, true);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReversePositionViewModel$submitOfPositionFragment$1(PositionEntity positionEntity, ReversePositionViewModel reversePositionViewModel, String str, Fragment fragment, Continuation<? super ReversePositionViewModel$submitOfPositionFragment$1> continuation) {
        super(2, continuation);
        this.$finalPosition = positionEntity;
        this.this$0 = reversePositionViewModel;
        this.$symbol = str;
        this.$fragment = fragment;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m25478f(ReversePositionViewModel reversePositionViewModel, String str, Throwable th2) {
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), str, false, 2, null);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(C27039d.m66651k(contractEntityM99529O != null ? Integer.valueOf(C37567b.m84615e(contractEntityM99529O, false, 1, null)) : null, 100));
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        reversePositionViewModel.f22955b0 = bigDecimalValueOf;
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReversePositionViewModel$submitOfPositionFragment$1(this.$finalPosition, this.this$0, this.$symbol, this.$fragment, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ReversePositionViewModel$submitOfPositionFragment$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r8, r1, r7) == r0) goto L17;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        if (!C37569d.m84649A(this.$finalPosition)) {
            C131421 c131421 = new C131421(this.this$0, this.$finalPosition, this.$symbol, null);
            final ReversePositionViewModel reversePositionViewModel = this.this$0;
            final String str = this.$symbol;
            Function1 function1 = new Function1() { // from class: com.kubi.futures.dialog.vm.t
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ReversePositionViewModel$submitOfPositionFragment$1.m25478f(reversePositionViewModel, str, (Throwable) obj2);
                }
            };
            this.label = 1;
            if (CoroutineExKt.m36471a(c131421, function1, this) != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
        AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
        C131433 c131433 = new C131433(this.this$0, this.$fragment, this.$finalPosition, null);
        this.label = 2;
    }
}
