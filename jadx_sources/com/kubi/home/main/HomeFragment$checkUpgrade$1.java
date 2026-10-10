package com.kubi.home.main;

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

/* JADX INFO: compiled from: HomeFragment.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.main.HomeFragment$checkUpgrade$1", m90122f = "HomeFragment.kt", m90123i = {}, m90124l = {284}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class HomeFragment$checkUpgrade$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ HomeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$checkUpgrade$1(HomeFragment homeFragment, Continuation<? super HomeFragment$checkUpgrade$1> continuation) {
        super(2, continuation);
        this.this$0 = homeFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeFragment$checkUpgrade$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((HomeFragment$checkUpgrade$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m29314g(HomeFragment homeFragment) {
        return homeFragment.f25716W;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m29315h(HomeFragment homeFragment, boolean z11) {
        homeFragment.f25718Y.set(true);
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
        this.this$0.f25717X--;
        IMineService iMineService = IMineService.f35025a.get();
        AbstractC45585n0.c cVar = new AbstractC45585n0.c();
        FragmentManager childFragmentManager = this.this$0.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.this$0);
        final HomeFragment homeFragment = this.this$0;
        Function0<Boolean> function0 = new Function0() { // from class: com.kubi.home.main.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(HomeFragment$checkUpgrade$1.m29314g(homeFragment));
            }
        };
        final HomeFragment homeFragment2 = this.this$0;
        iMineService.mo41626i(cVar, childFragmentManager, lifecycleScope, function0, new Function1() { // from class: com.kubi.home.main.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return HomeFragment$checkUpgrade$1.m29315h(homeFragment2, ((Boolean) obj2).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }
}
