package com.trtc.uikit.livekit.component.beauty.tebeauty;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.TUICore;
import com.tencent.qcloud.tuicore.interfaces.TUIExtensionInfo;
import com.tencent.qcloud.tuicore.interfaces.TUIServiceCallback;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;
import com.trtc.tuikit.common.system.ContextProvider;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.component.beauty.tebeauty.TEBeautyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.trtc.uikit.livekit.component.beauty.tebeauty.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TEBeautyManager.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0011\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001&B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0013\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u0010\u0010\u0017\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u000fH\u0002J\u001a\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!J\u0006\u0010\"\u001a\u00020\u0005J\b\u0010#\u001a\u00020\u0015H\u0002J\u0012\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012¨\u0006'"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/beauty/tebeauty/TEBeautyManager;", "", "<init>", "()V", "TE_BEAUTY_EXTENSION", "", "LOGGER", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "listenerRef", "Ljava/lang/ref/WeakReference;", "Lcom/trtc/uikit/livekit/component/beauty/tebeauty/TEBeautyManager$OnBeautyListener;", "lastParamList", "mainHandler", "Landroid/os/Handler;", "hasLoaded", "", "trtcVideoFrameListener", "com/trtc/uikit/livekit/component/beauty/tebeauty/TEBeautyManager$trtcVideoFrameListener$1", "Lcom/trtc/uikit/livekit/component/beauty/tebeauty/TEBeautyManager$trtcVideoFrameListener$1;", "isSupportTEBeauty", "setCustomVideoProcess", "", "clear", "setListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "init", "context", "Landroid/content/Context;", "createBeautyKit", "initBeautyKit", "createPanel", "checkBeautyResource", TUIConstants.TUIChat.CALL_BACK, "Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;", "exportParam", "destroyBeautyKit", "createTEBeautyPanel", "Landroid/view/View;", "OnBeautyListener", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TEBeautyManager {

    /* JADX INFO: renamed from: c */
    @Nullable
    public static WeakReference<a> f77698c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public static String f77699d;

    /* JADX INFO: renamed from: f */
    public static boolean f77701f;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final TEBeautyManager f77696a = new TEBeautyManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final LiveKitLogger f77697b = LiveKitLogger.f77564c.getComponentLogger("TEBeautyManager");

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Handler f77700e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final e f77702g = new e();

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.beauty.tebeauty.a$a */
    /* JADX INFO: compiled from: TEBeautyManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/beauty/tebeauty/TEBeautyManager$OnBeautyListener;", "", "onCreateBeautyView", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "onDestroyBeautyView", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo79575a();

        /* JADX INFO: renamed from: b */
        void mo79576b(@NotNull View view);
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.beauty.tebeauty.a$b */
    /* JADX INFO: compiled from: TEBeautyManager.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, m90084d2 = {"com/trtc/uikit/livekit/component/beauty/tebeauty/TEBeautyManager$checkBeautyResource$1", "Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;", "onServiceCallback", "", "errorCode", "", "errorMessage", "", "bundle", "Landroid/os/Bundle;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b extends TUIServiceCallback {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ TUIServiceCallback f77703f;

        @Override // com.tencent.qcloud.tuicore.interfaces.TUIServiceCallback
        public void onServiceCallback(int errorCode, String errorMessage, Bundle bundle) {
            TEBeautyManager.f77701f = true;
            TUIServiceCallback tUIServiceCallback = this.f77703f;
            if (tUIServiceCallback != null) {
                tUIServiceCallback.onServiceCallback(errorCode, errorMessage, bundle);
            }
        }

        public b(TUIServiceCallback tUIServiceCallback) {
            this.f77703f = tUIServiceCallback;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.beauty.tebeauty.a$c */
    /* JADX INFO: compiled from: TEBeautyManager.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, m90084d2 = {"com/trtc/uikit/livekit/component/beauty/tebeauty/TEBeautyManager$createBeautyKit$1", "Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;", "onServiceCallback", "", "errorCode", "", "errorMessage", "", "bundle", "Landroid/os/Bundle;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class c extends TUIServiceCallback {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Context f77704f;

        public c(Context context) {
            this.f77704f = context;
        }

        @Override // com.tencent.qcloud.tuicore.interfaces.TUIServiceCallback
        public void onServiceCallback(int errorCode, String errorMessage, Bundle bundle) {
            if (errorCode == 0) {
                TEBeautyManager.f77696a.m79593q(this.f77704f, true);
                return;
            }
            TEBeautyManager.f77697b.m79403a("checkBeautyResource failed: " + errorMessage);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.beauty.tebeauty.a$d */
    /* JADX INFO: compiled from: TEBeautyManager.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, m90084d2 = {"com/trtc/uikit/livekit/component/beauty/tebeauty/TEBeautyManager$initBeautyKit$1", "Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;", "onServiceCallback", "", "errorCode", "", "errorMessage", "", "bundle", "Landroid/os/Bundle;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class d extends TUIServiceCallback {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ boolean f77705f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Context f77706g;

        public d(boolean z11, Context context) {
            this.f77705f = z11;
            this.f77706g = context;
        }

        /* JADX INFO: renamed from: b */
        public static final void m79597b(Context context) {
            WeakReference weakReference;
            a aVar;
            View viewM79589m = TEBeautyManager.f77696a.m79589m(context);
            if (viewM79589m == null || (weakReference = TEBeautyManager.f77698c) == null || (aVar = (a) weakReference.get()) == null) {
                return;
            }
            aVar.mo79576b(viewM79589m);
        }

        @Override // com.tencent.qcloud.tuicore.interfaces.TUIServiceCallback
        public void onServiceCallback(int errorCode, String errorMessage, Bundle bundle) {
            if (errorCode != 0) {
                TEBeautyManager.f77697b.m79403a("initBeautyKit failed: " + errorMessage);
                return;
            }
            TEBeautyManager.f77697b.m79404b("initBeautyKit success");
            if (this.f77705f) {
                Handler handler = TEBeautyManager.f77700e;
                final Context context = this.f77706g;
                handler.post(new Runnable() { // from class: id0.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        TEBeautyManager.d.m79597b(context);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.beauty.tebeauty.a$e */
    /* JADX INFO: compiled from: TEBeautyManager.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, m90084d2 = {"com/trtc/uikit/livekit/component/beauty/tebeauty/TEBeautyManager$trtcVideoFrameListener$1", "Lcom/tencent/trtc/TRTCCloudListener$TRTCVideoFrameListener;", "onGLContextCreated", "", "onProcessVideoFrame", "", "srcFrame", "Lcom/tencent/trtc/TRTCCloudDef$TRTCVideoFrame;", "dstFrame", "onGLContextDestory", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class e implements TRTCCloudListener.TRTCVideoFrameListener {
        /* JADX INFO: renamed from: c */
        public static final void m79600c() {
            TEBeautyManager tEBeautyManager = TEBeautyManager.f77696a;
            Context contextM79397b = ContextProvider.m79397b();
            Intrinsics.checkNotNullExpressionValue(contextM79397b, "getApplicationContext(...)");
            tEBeautyManager.m79593q(contextM79397b, false);
        }

        @Override // com.tencent.trtc.TRTCCloudListener.TRTCVideoFrameListener
        public void onGLContextDestory() {
            TEBeautyManager tEBeautyManager = TEBeautyManager.f77696a;
            final String strM79591o = tEBeautyManager.m79591o();
            tEBeautyManager.m79590n();
            TEBeautyManager.f77700e.post(new Runnable() { // from class: id0.b
                @Override // java.lang.Runnable
                public final void run() {
                    TEBeautyManager.e.m79601d(strM79591o);
                }
            });
        }

        @Override // com.tencent.trtc.TRTCCloudListener.TRTCVideoFrameListener
        public int onProcessVideoFrame(TRTCCloudDef.TRTCVideoFrame srcFrame, TRTCCloudDef.TRTCVideoFrame dstFrame) {
            Intrinsics.checkNotNullParameter(srcFrame, "srcFrame");
            Intrinsics.checkNotNullParameter(dstFrame, "dstFrame");
            Map mapMapOf = MapsKt.mapOf(TuplesKt.m90091to(TUIConstants.TUIBeauty.PARAM_NAME_SRC_TEXTURE_ID, Integer.valueOf(srcFrame.texture.textureId)), TuplesKt.m90091to(TUIConstants.TUIBeauty.PARAM_NAME_FRAME_WIDTH, Integer.valueOf(srcFrame.width)), TuplesKt.m90091to(TUIConstants.TUIBeauty.PARAM_NAME_FRAME_HEIGHT, Integer.valueOf(srcFrame.height)));
            TRTCCloudDef.TRTCTexture tRTCTexture = dstFrame.texture;
            Object objCallService = TUICore.callService("TEBeautyExtension", TUIConstants.TUIBeauty.METHOD_PROCESS_VIDEO_FRAME, mapMapOf);
            Intrinsics.checkNotNull(objCallService, "null cannot be cast to non-null type kotlin.Int");
            tRTCTexture.textureId = ((Integer) objCallService).intValue();
            return 0;
        }

        /* JADX INFO: renamed from: d */
        public static final void m79601d(String str) {
            a aVar;
            TEBeautyManager.f77699d = str;
            WeakReference weakReference = TEBeautyManager.f77698c;
            if (weakReference != null && (aVar = (a) weakReference.get()) != null) {
                aVar.mo79575a();
            }
        }

        @Override // com.tencent.trtc.TRTCCloudListener.TRTCVideoFrameListener
        public void onGLContextCreated() {
            if (TEBeautyManager.f77701f) {
                TEBeautyManager.f77700e.post(new Runnable() { // from class: id0.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        TEBeautyManager.e.m79600c();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m79586j(@NotNull Context context, @Nullable TUIServiceCallback tUIServiceCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        f77697b.m79404b("checkBeautyResource");
        TUICore.callService("TEBeautyExtension", "checkResource", MapsKt.mapOf(TuplesKt.m90091to("context", context)), new b(tUIServiceCallback));
    }

    /* JADX INFO: renamed from: k */
    public final void m79587k() {
        f77697b.m79404b("clear");
        f77699d = null;
    }

    /* JADX INFO: renamed from: l */
    public final void m79588l(Context context) {
        m79586j(context, new c(context));
    }

    /* JADX INFO: renamed from: m */
    public final View m79589m(Context context) {
        View view;
        List<TUIExtensionInfo> extensionList = TUICore.getExtensionList("TEBeautyExtension", MapsKt.mapOf(TuplesKt.m90091to("context", context), TuplesKt.m90091to("lastParamList", f77699d)));
        Intrinsics.checkNotNullExpressionValue(extensionList, "getExtensionList(...)");
        Iterator<T> it = extensionList.iterator();
        do {
            view = null;
            if (!it.hasNext()) {
                break;
            }
            Object obj = ((TUIExtensionInfo) it.next()).getData().get("beautyPanel");
            if (obj instanceof View) {
                view = (View) obj;
            }
        } while (view == null);
        return view;
    }

    /* JADX INFO: renamed from: n */
    public final void m79590n() {
        f77697b.m79404b("destroyBeautyKit");
        TUICore.callService("TEBeautyExtension", "destroyBeautyKit", null);
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final String m79591o() {
        String string;
        Object objCallService = TUICore.callService("TEBeautyExtension", "exportParam", null);
        if (objCallService == null || (string = objCallService.toString()) == null) {
            string = "null";
        }
        f77699d = string;
        f77697b.m79404b("exportParam:" + f77699d);
        String str = f77699d;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: p */
    public final void m79592p(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        m79588l(context);
    }

    /* JADX INFO: renamed from: q */
    public final void m79593q(Context context, boolean z11) {
        f77697b.m79404b("initBeautyKit:" + f77699d);
        TUICore.callService("TEBeautyExtension", "initBeautyKit", MapsKt.mapOf(TuplesKt.m90091to("context", context), TuplesKt.m90091to("lastParamList", f77699d)), new d(z11, context));
    }

    /* JADX INFO: renamed from: r */
    public final boolean m79594r() {
        return TUICore.getService("TEBeautyExtension") != null;
    }

    /* JADX INFO: renamed from: s */
    public final void m79595s() {
        f77699d = "";
        if (m79594r()) {
            TUIRoomEngine.sharedInstance().getTRTCCloud().setLocalVideoProcessListener(2, 3, f77702g);
        }
    }

    public final void setListener(@Nullable a aVar) {
        f77698c = new WeakReference<>(aVar);
    }
}
