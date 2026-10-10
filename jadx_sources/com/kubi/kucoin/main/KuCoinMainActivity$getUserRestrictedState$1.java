package com.kubi.kucoin.main;

import androidx.fragment.app.FragmentManager;
import com.kubi.user.api.IUserService;
import com.kubi.user.api.UserRestrictedStateBean;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KuCoinMainActivity.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kucoin.main.KuCoinMainActivity$getUserRestrictedState$1", m90122f = "KuCoinMainActivity.kt", m90123i = {}, m90124l = {515}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KuCoinMainActivity$getUserRestrictedState$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentManager $childFragmentManager;
    int label;
    final /* synthetic */ KuCoinMainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KuCoinMainActivity$getUserRestrictedState$1(FragmentManager fragmentManager, KuCoinMainActivity kuCoinMainActivity, Continuation<? super KuCoinMainActivity$getUserRestrictedState$1> continuation) {
        super(2, continuation);
        this.$childFragmentManager = fragmentManager;
        this.this$0 = kuCoinMainActivity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KuCoinMainActivity$getUserRestrictedState$1(this.$childFragmentManager, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KuCoinMainActivity$getUserRestrictedState$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            IUserService iUserService = IUserService.a.get();
            this.label = 1;
            obj = iUserService.z0(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        UserRestrictedStateBean userRestrictedStateBean = (UserRestrictedStateBean) obj;
        if (userRestrictedStateBean != null) {
            FragmentManager fragmentManager = this.$childFragmentManager;
            KuCoinMainActivity kuCoinMainActivity = this.this$0;
            if (fragmentManager != null) {
                kuCoinMainActivity.m32408u2(fragmentManager, userRestrictedStateBean);
            } else {
                IUserService.a.get().y(kuCoinMainActivity, userRestrictedStateBean);
                KuCoinMainViewModel kuCoinMainViewModel = kuCoinMainActivity.f27972y;
                if (kuCoinMainViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                    kuCoinMainViewModel = null;
                }
                kuCoinMainViewModel.m32456B(false);
            }
        }
        return Unit.INSTANCE;
    }
}
