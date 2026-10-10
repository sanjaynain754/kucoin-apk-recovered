package com.kubi.user.protocol.text;

import com.kubi.sdk.web.KWebView;
import com.kubi.user.protocol.entity.SignProtocolContentItem;
import com.kubi.utils.C27100x0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: SignProtocolContentView.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.user.protocol.text.SignProtocolContentView$listenCurrentPageContentHeight$1", m90122f = "SignProtocolContentView.kt", m90123i = {}, m90124l = {210}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SignProtocolContentView$listenCurrentPageContentHeight$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ KWebView $signupProtocolWebView;
    final /* synthetic */ float $webViewScale;
    int label;
    final /* synthetic */ SignProtocolContentView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignProtocolContentView$listenCurrentPageContentHeight$1(KWebView kWebView, float f11, SignProtocolContentView signProtocolContentView, Continuation<? super SignProtocolContentView$listenCurrentPageContentHeight$1> continuation) {
        super(2, continuation);
        this.$signupProtocolWebView = kWebView;
        this.$webViewScale = f11;
        this.this$0 = signProtocolContentView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignProtocolContentView$listenCurrentPageContentHeight$1(this.$signupProtocolWebView, this.$webViewScale, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SignProtocolContentView$listenCurrentPageContentHeight$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m65689f(KWebView kWebView, float f11, SignProtocolContentView signProtocolContentView) {
        boolean z11;
        int iFloor = (int) Math.floor(kWebView.getContentHeight() * f11);
        if (iFloor > 0 && kWebView.getHeight() > iFloor - 10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            ((SignProtocolContentItem) signProtocolContentView.f53753b.get(signProtocolContentView.f53754c)).setHasRead(Boolean.TRUE);
        }
        C44128b.m97259c("SignProtocolContentView", "onMount, currentProtocolIndex is " + signProtocolContentView.f53754c + ",webViewScale is " + f11 + ", signupProtocolWebView.scrollY is " + kWebView.getScrollY() + ", signupProtocolWebView.contentHeight is " + kWebView.getContentHeight() + ", signupProtocolWebView.contentHeight * webViewScale is " + iFloor + ", signupProtocolWebView.height is " + kWebView.getHeight() + " contentHeightLessThanViewHeight is " + z11);
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
            if (DelayKt.m90350b(500L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        final KWebView kWebView = this.$signupProtocolWebView;
        final float f11 = this.$webViewScale;
        final SignProtocolContentView signProtocolContentView = this.this$0;
        C27100x0.m66924e(new Function0() { // from class: com.kubi.user.protocol.text.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SignProtocolContentView$listenCurrentPageContentHeight$1.m65689f(kWebView, f11, signProtocolContentView);
            }
        });
        return Unit.INSTANCE;
    }
}
