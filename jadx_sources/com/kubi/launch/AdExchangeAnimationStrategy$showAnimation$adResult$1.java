package com.kubi.launch;

import android.view.ViewStub;
import com.kubi.sdk.BaseActivity;
import com.kubi.utils.extensions.C27046k;
import kotlinx.coroutines.InterfaceC41709m0;
import p569qq.C43840a;
import p668un.C45280q;
import p668un.InterfaceC45269f;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AnimationStrategy.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, m90084d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.launch.AdExchangeAnimationStrategy$showAnimation$adResult$1", m90122f = "AnimationStrategy.kt", m90123i = {}, m90124l = {147}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AdExchangeAnimationStrategy$showAnimation$adResult$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Pair<? extends Boolean, ? extends String>>, Object> {
    final /* synthetic */ LauncherContext $context;
    final /* synthetic */ ViewStub $viewStub;
    int label;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Pair<? extends Boolean, ? extends String>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super Pair<Boolean, String>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdExchangeAnimationStrategy$showAnimation$adResult$1(LauncherContext launcherContext, ViewStub viewStub, Continuation<? super AdExchangeAnimationStrategy$showAnimation$adResult$1> continuation) {
        super(2, continuation);
        this.$context = launcherContext;
        this.$viewStub = viewStub;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdExchangeAnimationStrategy$showAnimation$adResult$1(this.$context, this.$viewStub, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Pair<Boolean, String>> continuation) {
        return ((AdExchangeAnimationStrategy$showAnimation$adResult$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C43840a.m96550d("checkAdAsync", "AnimationStrategy");
        C27046k.m66703r(this.$context.m37491j());
        InterfaceC45269f interfaceC45269fM100072j = C45280q.f101804a.m100072j();
        BaseActivity f31802a = this.$context.getF31802a();
        ViewStub viewStub = this.$viewStub;
        this.label = 1;
        Object objMo14689a = interfaceC45269fM100072j.mo14689a(f31802a, viewStub, this);
        if (objMo14689a == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objMo14689a;
    }
}
