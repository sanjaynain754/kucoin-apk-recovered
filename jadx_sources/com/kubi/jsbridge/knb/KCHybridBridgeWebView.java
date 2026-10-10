package com.kubi.jsbridge.knb;

import android.content.Context;
import androidx.lifecycle.LifecycleOwnerKt;
import c00.InterfaceC4771r;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.jsbridge.exception.WebBridgeException;
import com.kubi.p110rn.RNConstantKt;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.sdk.applet.IAppletService;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.web.KWebView;
import com.kubi.widget.web.ui.KWebBaseActivity;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCHybridBridgeWebView.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0017\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00050\rH\u0016Je\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00050\rH\u0016¢\u0006\u0002\u0010\u0016J@\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0018\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00050\rH\u0016JÁ\u0001\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010\u00112\b\u0010 \u001a\u0004\u0018\u00010\u00112\b\u0010!\u001a\u0004\u0018\u00010\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u00112\b\u0010#\u001a\u0004\u0018\u00010\u00112\b\u0010$\u001a\u0004\u0018\u00010\u00112\b\u0010%\u001a\u0004\u0018\u00010\u00112\b\u0010&\u001a\u0004\u0018\u00010\u00112\b\u0010'\u001a\u0004\u0018\u00010\u00112\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00050\rH\u0016¢\u0006\u0002\u0010(¨\u0006*"}, m90084d2 = {"Lcom/kubi/jsbridge/knb/KCHybridBridgeWebView;", "Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeWebviewCall;", "<init>", "()V", "exit", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "appPopAnimated", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", RNConstantKt.SEND_PAGE_MOUNT, "pageType", "", "dclTime", "", "currentProjectName", "currentProjectVersion", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "setWebViewScrollBarVisible", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "updateHeader", ViewProps.VISIBLE, "statusBarTransparent", "leftVisible", "rightVisible", "title", "titleColor", "background", "statusBarIsLightMode", "leftIcon", "leftTint", "leadIcon", "trailIcon", "rightIcon", "rightTint", "(Landroid/content/Context;Ljava/lang/Object;ZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Companion", "WebBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCHybridBridgeWebView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCHybridBridgeWebView.kt\ncom/kubi/jsbridge/knb/KCHybridBridgeWebView\n+ 2 KWebBridgeIssue.kt\ncom/kubi/jsbridge/exception/KWebBridgeIssueKt\n*L\n1#1,173:1\n44#2,2:174\n*S KotlinDebug\n*F\n+ 1 KCHybridBridgeWebView.kt\ncom/kubi/jsbridge/knb/KCHybridBridgeWebView\n*L\n80#1:174,2\n*E\n"})
public final class KCHybridBridgeWebView implements InterfaceC4771r {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f27484a = new Companion(null);

    /* JADX INFO: compiled from: KCHybridBridgeWebView.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/jsbridge/knb/KCHybridBridgeWebView$Companion;", "", "<init>", "()V", "TAG", "", "WebBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // c00.InterfaceC4771r
    /* JADX INFO: renamed from: a */
    public void mo4835a(@NotNull Context ctx, @Nullable Object obj, boolean z11, boolean z12, boolean z13, boolean z14, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        KWebBaseActivity kWebBaseActivity = ctx instanceof KWebBaseActivity ? (KWebBaseActivity) ctx : null;
        if (kWebBaseActivity == null) {
            callback.invoke(Boolean.FALSE, null);
        } else {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(kWebBaseActivity), null, null, new KCHybridBridgeWebView$updateHeader$1(ctx, z12, z13, z14, str, str2, str3, z11, bool, str4, str5, str6, str7, str8, str9, callback, null), 3, null);
        }
    }

    @Override // c00.InterfaceC4771r
    /* JADX INFO: renamed from: b */
    public void mo4836b(@NotNull Context ctx, @Nullable Object obj, boolean z11, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        KWebBaseActivity kWebBaseActivity = ctx instanceof KWebBaseActivity ? (KWebBaseActivity) ctx : null;
        if (kWebBaseActivity == null) {
            callback.invoke(Boolean.FALSE, null);
        } else {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(kWebBaseActivity), null, null, new KCHybridBridgeWebView$setWebViewScrollBarVisible$1(kWebBaseActivity, z11, callback, null), 3, null);
        }
    }

    @Override // c00.InterfaceC4771r
    /* JADX INFO: renamed from: c */
    public void mo4837c(@NotNull Context ctx, @Nullable Object obj, @Nullable String str, @Nullable Double d11, @Nullable String str2, @Nullable String str3, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            KWebView kWebViewM67452n0 = obj instanceof KWebView ? (KWebView) obj : null;
            if (kWebViewM67452n0 == null) {
                KWebBaseActivity kWebBaseActivity = ctx instanceof KWebBaseActivity ? (KWebBaseActivity) ctx : null;
                kWebViewM67452n0 = kWebBaseActivity != null ? kWebBaseActivity.m67452n0() : null;
                if (kWebViewM67452n0 == null) {
                    callback.invoke(Boolean.FALSE, null);
                    return;
                }
            }
            kWebViewM67452n0.m58582v(str, d11, str2, str3);
            callback.invoke(Boolean.TRUE, null);
        } catch (Throwable th2) {
            C43846g.m96568c(new WebBridgeException(th2, "KCHybridBridgeWebView", false, null, 8, null), null, 2, null);
            callback.invoke(Boolean.FALSE, new ProtocolException(th2.getMessage(), th2, null, false, 12, null));
        }
    }

    @Override // c00.InterfaceC4771r
    public void exit(@NotNull Context ctx, @Nullable Object obj, final boolean appPopAnimated, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final KWebBaseActivity kWebBaseActivity = ctx instanceof KWebBaseActivity ? (KWebBaseActivity) ctx : null;
        if (kWebBaseActivity == null) {
            callback.invoke(Boolean.FALSE, null);
        } else {
            IAppletService.f46452a.get().mo15069d(kWebBaseActivity, new Function0() { // from class: com.kubi.jsbridge.knb.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KCHybridBridgeWebView.m31851e(kWebBaseActivity, appPopAnimated, callback);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m31851e(KWebBaseActivity kWebBaseActivity, boolean z11, Function2 function2) {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(kWebBaseActivity), null, null, new KCHybridBridgeWebView$exit$1$1(kWebBaseActivity, z11, function2, null), 3, null);
        return Unit.INSTANCE;
    }
}
