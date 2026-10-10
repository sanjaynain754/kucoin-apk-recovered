package com.kubi.homern.page;

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
import p852kotlin.time.Duration;
import p852kotlin.time.DurationKt;
import p852kotlin.time.DurationUnit;

/* JADX INFO: compiled from: HomeRnFragment.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.homern.page.HomeRnFragment$checkUpgrade$1", m90122f = "HomeRnFragment.kt", m90123i = {}, m90124l = {215}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class HomeRnFragment$checkUpgrade$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ HomeRnFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeRnFragment$checkUpgrade$1(HomeRnFragment homeRnFragment, Continuation<? super HomeRnFragment$checkUpgrade$1> continuation) {
        super(2, continuation);
        this.this$0 = homeRnFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeRnFragment$checkUpgrade$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((HomeRnFragment$checkUpgrade$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m31291g(HomeRnFragment homeRnFragment) {
        return homeRnFragment.f26968V;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m31292h(HomeRnFragment homeRnFragment, boolean z11) {
        homeRnFragment.f26970X.set(true);
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
            Duration.Companion companion = Duration.INSTANCE;
            long duration = DurationKt.toDuration(1000, DurationUnit.MILLISECONDS);
            this.label = 1;
            if (DelayKt.m90351c(duration, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.this$0.f26969W--;
        IMineService iMineService = IMineService.f35025a.get();
        AbstractC45585n0.c cVar = new AbstractC45585n0.c();
        FragmentManager childFragmentManager = this.this$0.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.this$0);
        final HomeRnFragment homeRnFragment = this.this$0;
        Function0<Boolean> function0 = new Function0() { // from class: com.kubi.homern.page.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(HomeRnFragment$checkUpgrade$1.m31291g(homeRnFragment));
            }
        };
        final HomeRnFragment homeRnFragment2 = this.this$0;
        iMineService.mo41626i(cVar, childFragmentManager, lifecycleScope, function0, new Function1() { // from class: com.kubi.homern.page.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return HomeRnFragment$checkUpgrade$1.m31292h(homeRnFragment2, ((Boolean) obj2).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }
}
