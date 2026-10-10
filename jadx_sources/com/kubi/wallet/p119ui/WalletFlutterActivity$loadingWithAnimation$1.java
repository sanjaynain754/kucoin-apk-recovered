package com.kubi.wallet.p119ui;

import com.kubi.sdk.flutter.delegate.FlutterViewDelegate;
import com.kubi.sdk.mode.widget.HomeMaskView;
import com.kubi.sdk.mode.widget.SwitchLayout;
import kotlinx.coroutines.InterfaceC41709m0;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: WalletFlutterActivity.kt */
/* JADX INFO: loaded from: classes55.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.wallet.ui.WalletFlutterActivity$loadingWithAnimation$1", m90122f = "WalletFlutterActivity.kt", m90123i = {}, m90124l = {249, 251, 252}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class WalletFlutterActivity$loadingWithAnimation$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ WalletFlutterActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletFlutterActivity$loadingWithAnimation$1(WalletFlutterActivity walletFlutterActivity, Continuation<? super WalletFlutterActivity$loadingWithAnimation$1> continuation) {
        super(2, continuation);
        this.this$0 = walletFlutterActivity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletFlutterActivity$loadingWithAnimation$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((WalletFlutterActivity$loadingWithAnimation$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r6.m66978c0(r5) == r0) goto L25;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws JSONException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    WalletFlutterActivity walletFlutterActivity = this.this$0;
                    this.label = 3;
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.m66979d0();
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        HomeMaskView homeMaskView = this.this$0.f54631m;
        if (homeMaskView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("maskView");
            homeMaskView = null;
        }
        SwitchLayout sharedView = homeMaskView.getSharedView();
        if (sharedView != null) {
            WalletFlutterActivity.Companion companion = WalletFlutterActivity.f54625n;
            this.label = 1;
            if (companion.showAnimationInAsync(sharedView, this) != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
        C44128b.m97259c("WalletFlutterActivity", "[loadingWithAnimation] showAnimationInAsync");
        FlutterViewDelegate flutterViewDelegate = this.this$0.f54628j;
        this.label = 2;
        if (flutterViewDelegate.m56770v(this) != coroutine_suspended) {
            WalletFlutterActivity walletFlutterActivity2 = this.this$0;
            this.label = 3;
        }
        return coroutine_suspended;
    }
}
