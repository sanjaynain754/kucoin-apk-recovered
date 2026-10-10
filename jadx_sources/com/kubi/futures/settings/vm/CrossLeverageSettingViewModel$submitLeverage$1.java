package com.kubi.futures.settings.vm;

import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.kumex.data.platform.model.SubmitCrossLeverageEntity;
import com.kubi.kumex.utils.CoroutineExKt;
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
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: CrossLeverageSettingViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.settings.vm.CrossLeverageSettingViewModel$submitLeverage$1", m90122f = "CrossLeverageSettingViewModel.kt", m90123i = {}, m90124l = {72}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class CrossLeverageSettingViewModel$submitLeverage$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isTrial;
    final /* synthetic */ String $leverage;
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ CrossLeverageSettingViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.futures.settings.vm.CrossLeverageSettingViewModel$submitLeverage$1$1 */
    /* JADX INFO: compiled from: CrossLeverageSettingViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.settings.vm.CrossLeverageSettingViewModel$submitLeverage$1$1", m90122f = "CrossLeverageSettingViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C135051 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isTrial;
        final /* synthetic */ String $leverage;
        final /* synthetic */ String $symbol;
        int label;
        final /* synthetic */ CrossLeverageSettingViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135051(boolean z11, String str, String str2, CrossLeverageSettingViewModel crossLeverageSettingViewModel, Continuation<? super C135051> continuation) {
            super(1, continuation);
            this.$isTrial = z11;
            this.$symbol = str;
            this.$leverage = str2;
            this.this$0 = crossLeverageSettingViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C135051(this.$isTrial, this.$symbol, this.$leverage, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C135051) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.m26359C().postValue(new Pair<>(Boxing.boxBoolean(MultiBizFacadeManager.m20256j(MultiBizFacadeManager.f19232a, null, 1, null).mo24481f0(this.$isTrial, new SubmitCrossLeverageEntity(this.$symbol, this.$leverage))), null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossLeverageSettingViewModel$submitLeverage$1(boolean z11, String str, String str2, CrossLeverageSettingViewModel crossLeverageSettingViewModel, Continuation<? super CrossLeverageSettingViewModel$submitLeverage$1> continuation) {
        super(2, continuation);
        this.$isTrial = z11;
        this.$symbol = str;
        this.$leverage = str2;
        this.this$0 = crossLeverageSettingViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CrossLeverageSettingViewModel$submitLeverage$1(this.$isTrial, this.$symbol, this.$leverage, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CrossLeverageSettingViewModel$submitLeverage$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Unit m26374f(CrossLeverageSettingViewModel crossLeverageSettingViewModel, Throwable th2) {
        crossLeverageSettingViewModel.m26359C().postValue(new Pair<>(Boolean.FALSE, th2));
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
            C135051 c135051 = new C135051(this.$isTrial, this.$symbol, this.$leverage, this.this$0, null);
            final CrossLeverageSettingViewModel crossLeverageSettingViewModel = this.this$0;
            Function1 function1 = new Function1() { // from class: com.kubi.futures.settings.vm.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return CrossLeverageSettingViewModel$submitLeverage$1.m26374f(crossLeverageSettingViewModel, (Throwable) obj2);
                }
            };
            this.label = 1;
            if (CoroutineExKt.m36471a(c135051, function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
