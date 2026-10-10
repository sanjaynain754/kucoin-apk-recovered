package com.kubi.lite.tab.ui;

import com.kubi.sdk.mode.widget.HomeMaskView;
import com.kubi.sdk.mode.widget.SwitchLayout;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: LiteMainActivity.kt */
/* JADX INFO: loaded from: classes24.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.lite.tab.ui.LiteMainActivity$loadingWithAnimation$1", m90122f = "LiteMainActivity.kt", m90123i = {0, 0}, m90124l = {343, 346}, m90125m = "invokeSuspend", m90126n = {"sharedView", "$i$a$-let-LiteMainActivity$loadingWithAnimation$1$1"}, m90127s = {"L$0", "I$0"})
public final class LiteMainActivity$loadingWithAnimation$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ LiteMainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiteMainActivity$loadingWithAnimation$1(LiteMainActivity liteMainActivity, Continuation<? super LiteMainActivity$loadingWithAnimation$1> continuation) {
        super(2, continuation);
        this.this$0 = liteMainActivity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiteMainActivity$loadingWithAnimation$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((LiteMainActivity$loadingWithAnimation$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if (r7.m37598q0(r6) == r0) goto L20;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.m37586o0();
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        HomeMaskView homeMaskView = this.this$0.f32110q;
        if (homeMaskView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("maskView");
            homeMaskView = null;
        }
        SwitchLayout sharedView = homeMaskView.getSharedView();
        if (sharedView != null) {
            C44128b.m97266j("LiteV2-LiteMainActivity", "Executing enter animation");
            LiteMainActivity.Companion companion = LiteMainActivity.f32101w;
            this.L$0 = SpillingKt.nullOutSpilledVariable(sharedView);
            this.I$0 = 0;
            this.label = 1;
            if (companion.showAnimationInAsync(sharedView, this) != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
        LiteMainActivity liteMainActivity = this.this$0;
        this.L$0 = null;
        this.label = 2;
    }
}
