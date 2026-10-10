package com.kubi.futures.settings.vm;

import com.kubi.kumex.utils.CoroutineExKt;
import com.kubi.network.retrofit.utils.C19331c;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: IsolatedRiskLimitViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.settings.vm.IsolatedRiskLimitViewModel$submitRiskLimit$1", m90122f = "IsolatedRiskLimitViewModel.kt", m90123i = {}, m90124l = {50}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class IsolatedRiskLimitViewModel$submitRiskLimit$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isTrial;
    final /* synthetic */ int $level;
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ IsolatedRiskLimitViewModel this$0;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Unit m26401f(Throwable th2) {
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IsolatedRiskLimitViewModel$submitRiskLimit$1(IsolatedRiskLimitViewModel isolatedRiskLimitViewModel, boolean z11, String str, int i11, Continuation<? super IsolatedRiskLimitViewModel$submitRiskLimit$1> continuation) {
        super(2, continuation);
        this.this$0 = isolatedRiskLimitViewModel;
        this.$isTrial = z11;
        this.$symbol = str;
        this.$level = i11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IsolatedRiskLimitViewModel$submitRiskLimit$1(this.this$0, this.$isTrial, this.$symbol, this.$level, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((IsolatedRiskLimitViewModel$submitRiskLimit$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
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
            IsolatedRiskLimitViewModel$submitRiskLimit$1$result$1 isolatedRiskLimitViewModel$submitRiskLimit$1$result$1 = new IsolatedRiskLimitViewModel$submitRiskLimit$1$result$1(this.$isTrial, this.$symbol, this.$level, null);
            Function1 function1 = new Function1() { // from class: com.kubi.futures.settings.vm.j
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return IsolatedRiskLimitViewModel$submitRiskLimit$1.m26401f((Throwable) obj2);
                }
            };
            this.label = 1;
            obj = CoroutineExKt.m36471a(isolatedRiskLimitViewModel$submitRiskLimit$1$result$1, function1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.this$0.m26396r().postValue(Boxing.boxBoolean(zBooleanValue));
        return Unit.INSTANCE;
    }
}
