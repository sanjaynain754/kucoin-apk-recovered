package com.kubi.jsbridge.knb;

import android.content.Context;
import com.kubi.jsbridge.exception.WebBridgeException;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.widget.web.ui.KWebBaseActivity;
import kotlinx.coroutines.InterfaceC41709m0;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import pk.C43501b;

/* JADX INFO: compiled from: KCHybridBridgeWebView.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.jsbridge.knb.KCHybridBridgeWebView$updateHeader$1", m90122f = "KCHybridBridgeWebView.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKCHybridBridgeWebView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCHybridBridgeWebView.kt\ncom/kubi/jsbridge/knb/KCHybridBridgeWebView$updateHeader$1\n+ 2 KWebBridgeIssue.kt\ncom/kubi/jsbridge/exception/KWebBridgeIssueKt\n*L\n1#1,173:1\n44#2,2:174\n*S KotlinDebug\n*F\n+ 1 KCHybridBridgeWebView.kt\ncom/kubi/jsbridge/knb/KCHybridBridgeWebView$updateHeader$1\n*L\n167#1:174,2\n*E\n"})
public final class KCHybridBridgeWebView$updateHeader$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $background;
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ String $leadIcon;
    final /* synthetic */ String $leftIcon;
    final /* synthetic */ String $leftTint;
    final /* synthetic */ boolean $leftVisible;
    final /* synthetic */ String $rightIcon;
    final /* synthetic */ String $rightTint;
    final /* synthetic */ boolean $rightVisible;
    final /* synthetic */ Boolean $statusBarIsLightMode;
    final /* synthetic */ boolean $statusBarTransparent;
    final /* synthetic */ String $title;
    final /* synthetic */ String $titleColor;
    final /* synthetic */ String $trailIcon;
    final /* synthetic */ boolean $visible;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCHybridBridgeWebView$updateHeader$1(Context context, boolean z11, boolean z12, boolean z13, String str, String str2, String str3, boolean z14, Boolean bool, String str4, String str5, String str6, String str7, String str8, String str9, Function2<? super Boolean, ? super ProtocolException, Unit> function2, Continuation<? super KCHybridBridgeWebView$updateHeader$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$statusBarTransparent = z11;
        this.$leftVisible = z12;
        this.$rightVisible = z13;
        this.$title = str;
        this.$titleColor = str2;
        this.$background = str3;
        this.$visible = z14;
        this.$statusBarIsLightMode = bool;
        this.$leftIcon = str4;
        this.$leftTint = str5;
        this.$leadIcon = str6;
        this.$trailIcon = str7;
        this.$rightIcon = str8;
        this.$rightTint = str9;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCHybridBridgeWebView$updateHeader$1(this.$ctx, this.$statusBarTransparent, this.$leftVisible, this.$rightVisible, this.$title, this.$titleColor, this.$background, this.$visible, this.$statusBarIsLightMode, this.$leftIcon, this.$leftTint, this.$leadIcon, this.$trailIcon, this.$rightIcon, this.$rightTint, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCHybridBridgeWebView$updateHeader$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        Throwable th2;
        boolean zBooleanValue;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            C43501b c43501b = C43501b.f96040a;
            KWebBaseActivity kWebBaseActivity = (KWebBaseActivity) this.$ctx;
            boolean z12 = this.$statusBarTransparent;
            boolean z13 = this.$leftVisible;
            boolean z14 = this.$rightVisible;
            String str = this.$title;
            String str2 = this.$titleColor;
            String str3 = this.$background;
            boolean z15 = this.$visible;
            Boolean bool = this.$statusBarIsLightMode;
            if (bool != null) {
                try {
                    zBooleanValue = bool.booleanValue();
                } catch (Throwable th3) {
                    th2 = th3;
                    z11 = false;
                    C43846g.m96568c(new WebBridgeException(th2, "KCHybridBridgeWebView", false, null, 8, null), null, 2, null);
                    Throwable th4 = th2;
                    this.$callback.invoke(Boxing.boxBoolean(z11), new ProtocolException(th4.getMessage(), th4, null, false, 12, null));
                }
            } else {
                zBooleanValue = DayNightThemeManager.f28592a.m33187l();
            }
            z11 = false;
            try {
                this.$callback.invoke(Boxing.boxBoolean(c43501b.m95726f(kWebBaseActivity, z12, z13, z14, str, str2, str3, z15, zBooleanValue, this.$leftIcon, this.$leftTint, this.$leadIcon, this.$trailIcon, this.$rightIcon, this.$rightTint)), null);
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
                C43846g.m96568c(new WebBridgeException(th2, "KCHybridBridgeWebView", false, null, 8, null), null, 2, null);
                Throwable th6 = th2;
                this.$callback.invoke(Boxing.boxBoolean(z11), new ProtocolException(th6.getMessage(), th6, null, false, 12, null));
            }
        } catch (Throwable th7) {
            th = th7;
            z11 = false;
        }
        return Unit.INSTANCE;
    }
}
