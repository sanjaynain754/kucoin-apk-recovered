package com.kubi.jsbridge.impl.common;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.mine.api.service.IMineService;
import com.kubi.sdk.protocol.ProtocolException;
import kotlinx.coroutines.InterfaceC41709m0;
import p481ny.C42899b;
import p694vk.AbstractC45585n0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJsBridgeCommon.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.jsbridge.impl.common.KCJsBridgeCommon$showAppUpgradeAlert$1", m90122f = "KCJsBridgeCommon.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCJsBridgeCommon$showAppUpgradeAlert$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    int label;

    /* JADX INFO: renamed from: i */
    public static final boolean m31698i() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCJsBridgeCommon$showAppUpgradeAlert$1(Function2<? super Boolean, ? super ProtocolException, Unit> function2, Continuation<? super KCJsBridgeCommon$showAppUpgradeAlert$1> continuation) {
        super(2, continuation);
        this.$callback = function2;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m31697h(Function2 function2, FragmentActivity fragmentActivity) {
        IMineService iMineService = IMineService.f35025a.get();
        AbstractC45585n0.a aVar = new AbstractC45585n0.a();
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        iMineService.mo41626i(aVar, supportFragmentManager, LifecycleOwnerKt.getLifecycleScope(fragmentActivity), new Function0() { // from class: com.kubi.jsbridge.impl.common.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(KCJsBridgeCommon$showAppUpgradeAlert$1.m31698i());
            }
        }, null);
        function2.invoke(Boolean.TRUE, null);
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCJsBridgeCommon$showAppUpgradeAlert$1(this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCJsBridgeCommon$showAppUpgradeAlert$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            final Function2<Boolean, ProtocolException, Unit> function2 = this.$callback;
            C42899b.m94073c(new Function1() { // from class: com.kubi.jsbridge.impl.common.n
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return KCJsBridgeCommon$showAppUpgradeAlert$1.m31697h(function2, (FragmentActivity) obj2);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
