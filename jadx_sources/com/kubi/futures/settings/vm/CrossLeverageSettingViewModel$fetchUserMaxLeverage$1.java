package com.kubi.futures.settings.vm;

import androidx.lifecycle.MutableLiveData;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.kumex.data.platform.model.UserMaxLeverageEntity;
import com.kubi.kumex.utils.CoroutineExKt;
import java.math.BigDecimal;
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

/* JADX INFO: compiled from: CrossLeverageSettingViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.settings.vm.CrossLeverageSettingViewModel$fetchUserMaxLeverage$1", m90122f = "CrossLeverageSettingViewModel.kt", m90123i = {}, m90124l = {55}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class CrossLeverageSettingViewModel$fetchUserMaxLeverage$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isTrial;
    final /* synthetic */ BigDecimal $maxLeverage;
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ CrossLeverageSettingViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.futures.settings.vm.CrossLeverageSettingViewModel$fetchUserMaxLeverage$1$1 */
    /* JADX INFO: compiled from: CrossLeverageSettingViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.settings.vm.CrossLeverageSettingViewModel$fetchUserMaxLeverage$1$1", m90122f = "CrossLeverageSettingViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C135031 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isTrial;
        final /* synthetic */ BigDecimal $maxLeverage;
        final /* synthetic */ String $symbol;
        int label;
        final /* synthetic */ CrossLeverageSettingViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135031(boolean z11, String str, CrossLeverageSettingViewModel crossLeverageSettingViewModel, BigDecimal bigDecimal, Continuation<? super C135031> continuation) {
            super(1, continuation);
            this.$isTrial = z11;
            this.$symbol = str;
            this.this$0 = crossLeverageSettingViewModel;
            this.$maxLeverage = bigDecimal;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C135031(this.$isTrial, this.$symbol, this.this$0, this.$maxLeverage, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C135031) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                UserMaxLeverageEntity userMaxLeverageEntityMo4498L0 = MultiBizFacadeManager.m20260s(MultiBizFacadeManager.f19232a, null, 1, null).mo4498L0(this.$isTrial, this.$symbol);
                CrossLeverageSettingViewModel crossLeverageSettingViewModel = this.this$0;
                BigDecimal bigDecimal = this.$maxLeverage;
                MutableLiveData<BigDecimal> mutableLiveDataM26362F = crossLeverageSettingViewModel.m26362F();
                BigDecimal crossMaxLeverage = userMaxLeverageEntityMo4498L0.getCrossMaxLeverage();
                if (crossMaxLeverage != null) {
                    bigDecimal = crossMaxLeverage;
                }
                mutableLiveDataM26362F.postValue(bigDecimal);
                crossLeverageSettingViewModel.f23479b0.postValue(userMaxLeverageEntityMo4498L0.getTrialCrossMaxLeverageFlag());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossLeverageSettingViewModel$fetchUserMaxLeverage$1(boolean z11, String str, CrossLeverageSettingViewModel crossLeverageSettingViewModel, BigDecimal bigDecimal, Continuation<? super CrossLeverageSettingViewModel$fetchUserMaxLeverage$1> continuation) {
        super(2, continuation);
        this.$isTrial = z11;
        this.$symbol = str;
        this.this$0 = crossLeverageSettingViewModel;
        this.$maxLeverage = bigDecimal;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CrossLeverageSettingViewModel$fetchUserMaxLeverage$1(this.$isTrial, this.$symbol, this.this$0, this.$maxLeverage, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CrossLeverageSettingViewModel$fetchUserMaxLeverage$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m26370f(CrossLeverageSettingViewModel crossLeverageSettingViewModel, BigDecimal bigDecimal, Throwable th2) {
        crossLeverageSettingViewModel.m26362F().postValue(bigDecimal);
        return Unit.INSTANCE;
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
            C135031 c135031 = new C135031(this.$isTrial, this.$symbol, this.this$0, this.$maxLeverage, null);
            final CrossLeverageSettingViewModel crossLeverageSettingViewModel = this.this$0;
            final BigDecimal bigDecimal = this.$maxLeverage;
            Function1 function1 = new Function1() { // from class: com.kubi.futures.settings.vm.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return CrossLeverageSettingViewModel$fetchUserMaxLeverage$1.m26370f(crossLeverageSettingViewModel, bigDecimal, (Throwable) obj2);
                }
            };
            this.label = 1;
            if (CoroutineExKt.m36471a(c135031, function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
