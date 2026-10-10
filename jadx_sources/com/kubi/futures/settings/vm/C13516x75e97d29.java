package com.kubi.futures.settings.vm;

import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.kumex.utils.CoroutineExKt;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.kubi.futures.settings.vm.TradingPreferenceViewModel$fetchPreferenceData$1$positionModeAsync$1 */
/* JADX INFO: compiled from: TradingPreferenceViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.settings.vm.TradingPreferenceViewModel$fetchPreferenceData$1$positionModeAsync$1", m90122f = "TradingPreferenceViewModel.kt", m90123i = {}, m90124l = {65}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class C13516x75e97d29 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super String>, Object> {
    final /* synthetic */ boolean $isTrial;
    int label;

    /* JADX INFO: renamed from: com.kubi.futures.settings.vm.TradingPreferenceViewModel$fetchPreferenceData$1$positionModeAsync$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: TradingPreferenceViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.settings.vm.TradingPreferenceViewModel$fetchPreferenceData$1$positionModeAsync$1$1", m90122f = "TradingPreferenceViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
        final /* synthetic */ boolean $isTrial;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z11, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$isTrial = z11;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.$isTrial, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super String> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return MultiBizFacadeManager.m20257l(MultiBizFacadeManager.f19232a, null, 1, null).mo89037a0(this.$isTrial);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13516x75e97d29(boolean z11, Continuation<? super C13516x75e97d29> continuation) {
        super(2, continuation);
        this.$isTrial = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C13516x75e97d29(this.$isTrial, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super String> continuation) {
        return ((C13516x75e97d29) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isTrial, null);
            this.label = 1;
            obj = CoroutineExKt.m36472b(anonymousClass1, null, this, 2, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        String str = (String) obj;
        if (str == null) {
            return MultiBizFacadeManager.m20257l(MultiBizFacadeManager.f19232a, null, 1, null).mo89035V0(this.$isTrial);
        }
        return str;
    }
}
