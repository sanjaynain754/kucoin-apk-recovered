package com.kubi.home.v2;

import com.kubi.home.widgets.HomeRecyclerView;
import fj.C37520g0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: HomeFragmentV2.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.v2.HomeFragmentV2$bindFlowEvent$2$1", m90122f = "HomeFragmentV2.kt", m90123i = {}, m90124l = {316}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class HomeFragmentV2$bindFlowEvent$2$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $index;
    int label;
    final /* synthetic */ HomeFragmentV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragmentV2$bindFlowEvent$2$1(HomeFragmentV2 homeFragmentV2, int i11, Continuation<? super HomeFragmentV2$bindFlowEvent$2$1> continuation) {
        super(2, continuation);
        this.this$0 = homeFragmentV2;
        this.$index = i11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeFragmentV2$bindFlowEvent$2$1(this.this$0, this.$index, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((HomeFragmentV2$bindFlowEvent$2$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HomeRecyclerView homeRecyclerView;
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
            if (DelayKt.m90350b(500L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        C37520g0 c37520g0M30491X3 = this.this$0.m30491X3();
        if (c37520g0M30491X3 != null && (homeRecyclerView = c37520g0M30491X3.f83300c) != null) {
            homeRecyclerView.scrollToPosition(this.$index);
        }
        return Unit.INSTANCE;
    }
}
