package com.kubi.agora.jsbridge;

import android.content.Context;
import com.blankj.utilcode.util.C5303w0;
import com.kubi.agora.AgoraShareScreenManager;
import com.kubi.agora.ScreenCaptureHelper;
import com.kubi.agora.jsbridge.KCJsBridgeScreenShare;
import com.kubi.event.api.C12572a;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36560a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: KCJsBridgeScreenShare.kt */
/* JADX INFO: loaded from: classes63.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016J@\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016J@\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016J@\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/agora/jsbridge/KCJsBridgeScreenShare;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiAgoraScreenShareModule;", "<init>", "()V", "isScreenShareEnable", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "source", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "startScreenShare", "stopScreenShare", "startToFloating", "Companion", "AgoraLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCJsBridgeScreenShare implements InterfaceC36560a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f15322a = new Companion(null);

    /* JADX INFO: compiled from: KCJsBridgeScreenShare.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/agora/jsbridge/KCJsBridgeScreenShare$Companion;", "", "<init>", "()V", "TAG", "", "PRE_FIX", "EVENT_START_SCREEN_SHARE", "EVENT_START_TO_FLOATING", "AgoraLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m14939f() {
        ScreenCaptureHelper screenCaptureHelperM14917k = AgoraShareScreenManager.f15305a.m14917k();
        if (screenCaptureHelperM14917k != null) {
            screenCaptureHelperM14917k.m14877j();
        }
    }

    @Override // d00.InterfaceC36560a
    /* JADX INFO: renamed from: a */
    public void mo14940a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C44128b.m97259c("KCJsBridgeScreenShare", "[stopScreenShare]  obj: " + obj + ", source:" + source);
        C5303w0.m6512b(new Runnable() { // from class: ka.a
            @Override // java.lang.Runnable
            public final void run() {
                KCJsBridgeScreenShare.m14939f();
            }
        });
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // d00.InterfaceC36560a
    /* JADX INFO: renamed from: b */
    public void mo14941b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C44128b.m97259c("KCJsBridgeScreenShare", "[startToFloating]  obj: " + obj + ", source:" + source);
        C12572a.m23695d("com.kubi.screen.share.Event:startToFloating", null, 0L, 6, null);
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // d00.InterfaceC36560a
    /* JADX INFO: renamed from: c */
    public void mo14942c(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C44128b.m97259c("KCJsBridgeScreenShare", "[startScreenShare] obj: " + obj + ", source:" + source);
        C12572a.m23695d("com.kubi.screen.share.Event:startScreenShare", null, 0L, 6, null);
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // d00.InterfaceC36560a
    /* JADX INFO: renamed from: d */
    public void mo14943d(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C44128b.m97259c("KCJsBridgeScreenShare", "[isScreenShareEnable]  obj: " + obj + ", source:" + source);
        callback.invoke(Boolean.TRUE, null);
    }
}
