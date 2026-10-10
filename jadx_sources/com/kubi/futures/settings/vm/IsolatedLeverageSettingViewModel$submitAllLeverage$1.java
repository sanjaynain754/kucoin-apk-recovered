package com.kubi.futures.settings.vm;

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

/* JADX INFO: compiled from: IsolatedLeverageSettingViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.settings.vm.IsolatedLeverageSettingViewModel$submitAllLeverage$1", m90122f = "IsolatedLeverageSettingViewModel.kt", m90123i = {}, m90124l = {85}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class IsolatedLeverageSettingViewModel$submitAllLeverage$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $leverage;
    final /* synthetic */ String $primarySymbol;
    int label;
    final /* synthetic */ IsolatedLeverageSettingViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.futures.settings.vm.IsolatedLeverageSettingViewModel$submitAllLeverage$1$1 */
    /* JADX INFO: compiled from: IsolatedLeverageSettingViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.settings.vm.IsolatedLeverageSettingViewModel$submitAllLeverage$1$1", m90122f = "IsolatedLeverageSettingViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C135081 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ String $leverage;
        final /* synthetic */ String $primarySymbol;
        int label;
        final /* synthetic */ IsolatedLeverageSettingViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135081(String str, String str2, IsolatedLeverageSettingViewModel isolatedLeverageSettingViewModel, Continuation<? super C135081> continuation) {
            super(1, continuation);
            this.$primarySymbol = str;
            this.$leverage = str2;
            this.this$0 = isolatedLeverageSettingViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C135081(this.$primarySymbol, this.$leverage, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C135081) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                C13521a.m26442b(this.$primarySymbol, this.$leverage);
                this.this$0.m26389z().postValue(new Pair<>(Boxing.boxBoolean(true), null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IsolatedLeverageSettingViewModel$submitAllLeverage$1(String str, String str2, IsolatedLeverageSettingViewModel isolatedLeverageSettingViewModel, Continuation<? super IsolatedLeverageSettingViewModel$submitAllLeverage$1> continuation) {
        super(2, continuation);
        this.$primarySymbol = str;
        this.$leverage = str2;
        this.this$0 = isolatedLeverageSettingViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IsolatedLeverageSettingViewModel$submitAllLeverage$1(this.$primarySymbol, this.$leverage, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((IsolatedLeverageSettingViewModel$submitAllLeverage$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m26391f(IsolatedLeverageSettingViewModel isolatedLeverageSettingViewModel, Throwable th2) {
        isolatedLeverageSettingViewModel.m26389z().postValue(new Pair<>(Boolean.FALSE, th2));
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
            C135081 c135081 = new C135081(this.$primarySymbol, this.$leverage, this.this$0, null);
            final IsolatedLeverageSettingViewModel isolatedLeverageSettingViewModel = this.this$0;
            Function1 function1 = new Function1() { // from class: com.kubi.futures.settings.vm.g
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return IsolatedLeverageSettingViewModel$submitAllLeverage$1.m26391f(isolatedLeverageSettingViewModel, (Throwable) obj2);
                }
            };
            this.label = 1;
            if (CoroutineExKt.m36471a(c135081, function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
