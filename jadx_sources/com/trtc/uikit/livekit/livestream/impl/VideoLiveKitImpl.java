package com.trtc.uikit.livekit.livestream.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.AudioManager$OnModeChangedListener;
import android.net.Uri;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Rational;
import androidx.annotation.RequiresApi;
import androidx.autofill.HintConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.utils.ToastCompat;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.TUICore;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.component.pippanel.PIPPanelStore;
import com.trtc.uikit.livekit.livestream.VideoLiveAnchorActivity;
import com.trtc.uikit.livekit.livestream.VideoLiveAudienceActivity;
import com.trtc.uikit.livekit.livestream.VideoLiveKit;
import com.trtc.uikit.livekit.livestream.impl.VideoLiveKitImpl;
import f00.C37304a;
import g00.InterfaceC37751c;
import io.trtc.tuikit.atomicx.widget.basicwidget.toast.AtomicToast;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import pe0.C43457e;
import pe0.C43458f;
import ro.C44128b;

/* JADX INFO: compiled from: VideoLiveKitImpl.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 62\u00020\u0001:\u00046789B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J \u0010!\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001aH\u0016J\u0018\u0010$\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001aH\u0016J\u0012\u0010%\u001a\u00020\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010&H\u0016J\u000e\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020)J\u0010\u0010*\u001a\u00020\u00172\b\u0010+\u001a\u0004\u0018\u00010\u0015J\u0010\u0010,\u001a\u00020\u00172\b\u0010+\u001a\u0004\u0018\u00010\u0015J\u0006\u0010-\u001a\u00020\u0017J\u0006\u0010.\u001a\u00020\u0017J\b\u0010/\u001a\u00020\u0017H\u0002J\b\u00100\u001a\u00020\u0017H\u0002J\b\u00101\u001a\u00020\u0017H\u0002J\u0006\u00102\u001a\u00020\u0017J\b\u00103\u001a\u00020\u0011H\u0002J\b\u00104\u001a\u00020\u0017H\u0002J\b\u00105\u001a\u00020\u0017H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0018\u00010\tR\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0018\u00010\u000bR\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, m90084d2 = {"Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;", "Lcom/trtc/uikit/livekit/livestream/VideoLiveKit;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "logger", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "audioModeListener", "Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$AudioModeListener;", "phoneListener", "Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$PhoneCallStateListener;", "audioManager", "Landroid/media/AudioManager;", "telephonyManager", "Landroid/telephony/TelephonyManager;", "audioModeListenerRegistered", "", "callingAPIListenerList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/lang/ref/WeakReference;", "Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$CallingAPIListener;", "initAudioModeListener", "", "startLive", "roomId", "", "joinLive", "liveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "leaveLive", TUIConstants.TUIChat.CALL_BACK, "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "enterRoom", "roomOwnerId", "loginTxUserId", "joinAudienceClient", "stopLive", "Lio/trtc/tuikit/atomicxcore/api/live/StopLiveCompletionHandler;", "enterPictureInPictureMode", "activity", "Landroid/app/Activity;", "addCallingAPIListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeCallingAPIListener", "startPushLocalVideoOnResume", "stopPushLocalVideoOnStop", "startListeningPhoneState", "stopListeningPhoneState", "startPushLocalVideo", "stopPushLocalVideo", "isInCall", "notifyLeaveLive", "notifyStopLive", "Companion", "AudioModeListener", "PhoneCallStateListener", "CallingAPIListener", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nVideoLiveKitImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoLiveKitImpl.kt\ncom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,345:1\n1869#2,2:346\n1869#2,2:348\n*S KotlinDebug\n*F\n+ 1 VideoLiveKitImpl.kt\ncom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl\n*L\n335#1:346,2\n341#1:348,2\n*E\n"})
public final class VideoLiveKitImpl implements VideoLiveKit {

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final Companion f79326j = new Companion(null);

    /* JADX INFO: renamed from: k */
    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    public static volatile VideoLiveKitImpl f79327k;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final LiveKitLogger f79328b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Context f79329c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public C36458a f79330d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public C36460c f79331e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public AudioManager f79332f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public TelephonyManager f79333g;

    /* JADX INFO: renamed from: h */
    public boolean f79334h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final CopyOnWriteArrayList<WeakReference<InterfaceC36459b>> f79335i;

    /* JADX INFO: compiled from: VideoLiveKitImpl.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$Companion;", "", "<init>", "()V", "ROOM_ID", "", "OWNER_ID", "sInstance", "Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;", "createInstance", "context", "Landroid/content/Context;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nVideoLiveKitImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoLiveKitImpl.kt\ncom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n1#2:346\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final VideoLiveKitImpl createInstance(@NotNull Context context) {
            VideoLiveKitImpl videoLiveKitImpl;
            Intrinsics.checkNotNullParameter(context, "context");
            VideoLiveKitImpl videoLiveKitImpl2 = VideoLiveKitImpl.f79327k;
            if (videoLiveKitImpl2 != null) {
                return videoLiveKitImpl2;
            }
            synchronized (VideoLiveKitImpl.class) {
                videoLiveKitImpl = VideoLiveKitImpl.f79327k;
                if (videoLiveKitImpl == null) {
                    videoLiveKitImpl = new VideoLiveKitImpl(context, null);
                    VideoLiveKitImpl.f79327k = videoLiveKitImpl;
                }
            }
            return videoLiveKitImpl;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.livestream.impl.VideoLiveKitImpl$a */
    /* JADX INFO: compiled from: VideoLiveKitImpl.kt */
    @RequiresApi(api = 31)
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0083\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$AudioModeListener;", "Landroid/media/AudioManager$OnModeChangedListener;", "<init>", "(Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;)V", "onModeChanged", "", "mode", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C36458a implements AudioManager$OnModeChangedListener {
        public C36458a() {
        }

        public void onModeChanged(int mode) {
            VideoLiveKitImpl.this.f79328b.m79404b("onModeChanged, mode:" + mode);
            if (mode == 0) {
                VideoLiveKitImpl.this.m81752q();
            } else if (mode != 2) {
                VideoLiveKitImpl.this.m81752q();
            } else {
                VideoLiveKitImpl.this.m81755t();
            }
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.livestream.impl.VideoLiveKitImpl$b */
    /* JADX INFO: compiled from: VideoLiveKitImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$CallingAPIListener;", "", "onLeaveLive", "", "onStopLive", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC36459b {
        /* JADX INFO: renamed from: l */
        void mo81720l();
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.livestream.impl.VideoLiveKitImpl$c */
    /* JADX INFO: compiled from: VideoLiveKitImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, m90084d2 = {"Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$PhoneCallStateListener;", "Landroid/telephony/PhoneStateListener;", "<init>", "(Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;)V", "onCallStateChanged", "", "state", "", "incomingNumber", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C36460c extends PhoneStateListener {
        public C36460c() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int state, @Nullable String incomingNumber) {
            super.onCallStateChanged(state, incomingNumber);
            VideoLiveKitImpl.this.f79328b.m79404b("onCallStateChanged, state:" + state + ", incomingNumber:" + incomingNumber);
            if (state == 0) {
                VideoLiveKitImpl.this.m81752q();
            } else if (state != 2) {
                VideoLiveKitImpl.this.m81752q();
            } else {
                VideoLiveKitImpl.this.m81755t();
            }
        }
    }

    public /* synthetic */ VideoLiveKitImpl(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    public VideoLiveKitImpl(Context context) {
        this.f79328b = LiveKitLogger.f77564c.getFeaturesLogger("VideoLiveKitImpl");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f79329c = applicationContext;
        this.f79335i = new CopyOnWriteArrayList<>();
        m81746j(applicationContext);
    }

    @Override // com.trtc.uikit.livekit.livestream.VideoLiveKit
    /* JADX INFO: renamed from: a */
    public void mo81736a(@Nullable CompletionHandler completionHandler) {
        LiveListStore.INSTANCE.shared().leaveLive(completionHandler);
        m81749m();
    }

    /* JADX INFO: renamed from: g */
    public final void m81743g(@Nullable InterfaceC36459b interfaceC36459b) {
        if (interfaceC36459b != null) {
            this.f79335i.add(new WeakReference<>(interfaceC36459b));
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m81744h(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Build.VERSION.SDK_INT < 26) {
            AtomicToast atomicToast = AtomicToast.f87566a;
            String string = activity.getString(R$string.common_picture_in_picture_android_system_tips);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            AtomicToast.m88196j(atomicToast, activity, string, AtomicToast.Style.WARNING, null, null, null, null, null, 248, null);
            this.f79328b.m79406d("Picture-in-picture mode is not supported under android 8.0 lower version");
            return false;
        }
        Object systemService = activity.getSystemService("appops");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AppOpsManager");
        if (((AppOpsManager) systemService).checkOpNoThrow("android:picture_in_picture", activity.getApplicationInfo().uid, activity.getPackageName()) == 0) {
            activity.enterPictureInPictureMode(C43458f.m95672a().setAspectRatio(new Rational(9, 16)).build());
            return true;
        }
        Intent intent = new Intent("android.settings.PICTURE_IN_PICTURE_SETTINGS", Uri.parse("package:" + activity.getPackageName()));
        intent.addFlags(268435456);
        activity.startActivity(intent);
        this.f79328b.m79406d("Picture in Picture not permission");
        return false;
    }

    /* JADX INFO: renamed from: i */
    public void m81745i(@NotNull String roomId, @NotNull String roomOwnerId, @NotNull String loginTxUserId) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(roomOwnerId, "roomOwnerId");
        Intrinsics.checkNotNullParameter(loginTxUserId, "loginTxUserId");
        if (PIPPanelStore.f77996b.sharedInstance().getF77998a().getF101323d()) {
            ToastCompat.m66437C(R$string.common_exit_float_window_tip);
            return;
        }
        TUICore.notifyEvent("EVENT_KEY_LIVE_KIT", "EVENT_SUB_KEY_DESTROY_LIVE_VIEW", null);
        UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
        C44128b.m97266j("Live", "enterRoom, roomId:" + roomId + ", roomOwnerId:" + roomOwnerId + ",userId:" + (value != null ? value.getUserID() : null) + ",loginTxUserId:" + loginTxUserId);
        if (TextUtils.equals(roomOwnerId, loginTxUserId)) {
            Intent intent = new Intent(this.f79329c, (Class<?>) VideoLiveAnchorActivity.class);
            intent.addFlags(268435456);
            intent.putExtra("intent_key_room_id", roomId);
            this.f79329c.startActivity(intent);
            return;
        }
        Intent intent2 = new Intent(this.f79329c, (Class<?>) VideoLiveAudienceActivity.class);
        intent2.addFlags(268435456);
        intent2.putExtra("roomId", roomId);
        intent2.putExtra(TUIConstantDefine.OWNER_ID, roomOwnerId);
        this.f79329c.startActivity(intent2);
    }

    /* JADX INFO: renamed from: j */
    public final void m81746j(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f79330d = new C36458a();
            Object systemService = context.getSystemService("audio");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            this.f79332f = (AudioManager) systemService;
            this.f79331e = null;
            this.f79333g = null;
            return;
        }
        this.f79330d = null;
        this.f79332f = null;
        this.f79331e = new C36460c();
        Object systemService2 = context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        this.f79333g = (TelephonyManager) systemService2;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m81747k() {
        AudioManager audioManager = this.f79332f;
        if (audioManager != null) {
            return audioManager.getMode() == 2;
        }
        TelephonyManager telephonyManager = this.f79333g;
        return telephonyManager != null && telephonyManager.getCallState() == 2;
    }

    /* JADX INFO: renamed from: l */
    public void m81748l(@NotNull String roomId, @NotNull String roomOwnerId) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(roomOwnerId, "roomOwnerId");
        InterfaceC37751c.a.m85121a(C37304a.f82764a, roomId, roomOwnerId, null, null, null, null, null, null, 252, null);
    }

    /* JADX INFO: renamed from: m */
    public final void m81749m() {
        Iterator<T> it = this.f79335i.iterator();
        while (it.hasNext()) {
            InterfaceC36459b interfaceC36459b = (InterfaceC36459b) ((WeakReference) it.next()).get();
            if (interfaceC36459b != null) {
                interfaceC36459b.mo81720l();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m81750n(@Nullable final InterfaceC36459b interfaceC36459b) {
        CollectionsKt.removeAll((List) this.f79335i, new Function1() { // from class: pe0.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(VideoLiveKitImpl.m81742o(interfaceC36459b, (WeakReference) obj));
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m81751p() {
        if (Build.VERSION.SDK_INT < 31) {
            TelephonyManager telephonyManager = this.f79333g;
            if (telephonyManager != null) {
                telephonyManager.listen(this.f79331e, 32);
                return;
            }
            return;
        }
        C36458a c36458a = this.f79330d;
        if (c36458a == null || this.f79334h) {
            return;
        }
        AudioManager audioManager = this.f79332f;
        if (audioManager != null) {
            audioManager.addOnModeChangedListener(this.f79329c.getMainExecutor(), C43457e.m95671a(c36458a));
        }
        this.f79334h = true;
    }

    /* JADX INFO: renamed from: s */
    public final void m81754s() {
        if (Build.VERSION.SDK_INT < 31) {
            TelephonyManager telephonyManager = this.f79333g;
            if (telephonyManager != null) {
                telephonyManager.listen(this.f79331e, 0);
                return;
            }
            return;
        }
        C36458a c36458a = this.f79330d;
        if (c36458a == null || !this.f79334h) {
            return;
        }
        AudioManager audioManager = this.f79332f;
        if (audioManager != null) {
            audioManager.removeOnModeChangedListener(C43457e.m95671a(c36458a));
        }
        this.f79334h = false;
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m81742o(InterfaceC36459b interfaceC36459b, WeakReference weakReference) {
        return Intrinsics.areEqual(weakReference.get(), interfaceC36459b);
    }

    /* JADX INFO: renamed from: q */
    public final void m81752q() {
        TUIRoomEngine.sharedInstance().startPushLocalVideo();
    }

    /* JADX INFO: renamed from: r */
    public final void m81753r() {
        if (m81747k()) {
            m81755t();
        } else {
            m81752q();
        }
        m81751p();
    }

    /* JADX INFO: renamed from: t */
    public final void m81755t() {
        TUIRoomEngine.sharedInstance().stopPushLocalVideo();
    }

    /* JADX INFO: renamed from: u */
    public final void m81756u() {
        m81755t();
        m81754s();
    }
}
