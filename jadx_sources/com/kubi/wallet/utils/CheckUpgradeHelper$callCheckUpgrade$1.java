package com.kubi.wallet.utils;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.mine.api.service.IMineService;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
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

/* JADX INFO: compiled from: CheckUpgradeHelper.kt */
/* JADX INFO: loaded from: classes55.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.wallet.utils.CheckUpgradeHelper$callCheckUpgrade$1", m90122f = "CheckUpgradeHelper.kt", m90123i = {}, m90124l = {37}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class CheckUpgradeHelper$callCheckUpgrade$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CheckUpgradeHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckUpgradeHelper$callCheckUpgrade$1(CheckUpgradeHelper checkUpgradeHelper, Continuation<? super CheckUpgradeHelper$callCheckUpgrade$1> continuation) {
        super(2, continuation);
        this.this$0 = checkUpgradeHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final boolean m66996h() {
        return WalletState.f54638a.m67000c();
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheckUpgradeHelper$callCheckUpgrade$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CheckUpgradeHelper$callCheckUpgrade$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m66997i(CheckUpgradeHelper checkUpgradeHelper, boolean z11) {
        checkUpgradeHelper.f54636c.set(true);
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
            this.label = 1;
            if (DelayKt.m90350b(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.this$0.f54635b--;
        IMineService iMineService = IMineService.f35025a.get();
        AbstractC45585n0.c cVar = new AbstractC45585n0.c();
        FragmentManager supportFragmentManager = this.this$0.f54634a.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.this$0.f54634a);
        Function0<Boolean> function0 = new Function0() { // from class: com.kubi.wallet.utils.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(CheckUpgradeHelper$callCheckUpgrade$1.m66996h());
            }
        };
        final CheckUpgradeHelper checkUpgradeHelper = this.this$0;
        iMineService.mo41626i(cVar, supportFragmentManager, lifecycleScope, function0, new Function1() { // from class: com.kubi.wallet.utils.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return CheckUpgradeHelper$callCheckUpgrade$1.m66997i(checkUpgradeHelper, ((Boolean) obj2).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }
}
