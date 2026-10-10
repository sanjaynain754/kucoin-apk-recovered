package com.trtc.uikit.livekit.livestream;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.lifecycle.Lifecycle;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.function.language.dynamic.LangDynamicManager;
import com.kubi.sdk.util.IDisableEdgeToEdge;
import com.kubi.user.config.UserInfo;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.tencent.qcloud.tuicore.TUICore;
import com.tencent.qcloud.tuicore.interfaces.ITUINotification;
import com.trtc.tuikit.common.FullScreenActivity;
import com.trtc.tuikit.common.foregroundservice.VideoForegroundService;
import com.trtc.tuikit.common.system.ContextProvider;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.component.pippanel.PIPPanelStore;
import com.trtc.uikit.livekit.features.audiencecontainer.AudienceContainerView;
import com.trtc.uikit.livekit.features.audiencecontainer.store.AudienceContainerStore;
import com.trtc.uikit.livekit.features.endstatistics.AudienceEndStatisticsView;
import com.trtc.uikit.livekit.features.endstatistics.InterfaceC36372e;
import com.trtc.uikit.livekit.livestream.VideoLiveAudienceActivity;
import com.trtc.uikit.livekit.livestream.impl.VideoLiveKitImpl;
import com.trtc.uikit.livekit.p180kc.helper.LiveRemoteConfigHelper;
import de0.InterfaceC36664a;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import io.trtc.tuikit.atomicx.pictureinpicture.PictureInPictureStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import java.util.Map;
import ne0.C42816a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43853n;
import p569qq.InterfaceC43845f;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import pe0.C43453a;
import ro.C44128b;

/* JADX INFO: compiled from: VideoLiveAudienceActivity.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 I2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001IB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\nH\u0016J\u0012\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0014H\u0002J2\u0010\u001f\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020%\u0018\u00010$H\u0016J\b\u0010&\u001a\u00020\u0014H\u0014J\b\u0010'\u001a\u00020\u0014H\u0014J\"\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\b\u0010.\u001a\u00020\u0014H\u0017J\b\u0010/\u001a\u00020\u0014H\u0014J\b\u00100\u001a\u00020\u0014H\u0016J\b\u00101\u001a\u00020\u0014H\u0016J\b\u00102\u001a\u00020\u0014H\u0014J\b\u00103\u001a\u00020\u0014H\u0014J\u0010\u00104\u001a\u00020\u00142\u0006\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u00020\u00142\u0006\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u00020\u0014H\u0002J\b\u0010;\u001a\u00020\u0014H\u0002J \u0010<\u001a\u00020\u00142\u0006\u0010=\u001a\u00020!2\u0006\u0010>\u001a\u00020!2\u0006\u0010?\u001a\u00020!H\u0016J\b\u0010@\u001a\u00020\u0014H\u0016J\b\u0010A\u001a\u00020\u0014H\u0002J\u0012\u0010B\u001a\u00020\u00142\b\u0010C\u001a\u0004\u0018\u00010-H\u0014R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010D\u001a\u0004\u0018\u00010!X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006J"}, m90084d2 = {"Lcom/trtc/uikit/livekit/livestream/VideoLiveAudienceActivity;", "Lcom/trtc/tuikit/common/FullScreenActivity;", "Lcom/tencent/qcloud/tuicore/interfaces/ITUINotification;", "Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$CallingAPIListener;", "Lcom/trtc/uikit/livekit/features/audiencecontainer/AudienceContainerViewDefine$AudienceContainerViewListener;", "Lcom/kubi/sdk/util/IDisableEdgeToEdge;", "Lcom/kubi/monitor/ITrackPage;", "<init>", "()V", "mResources", "Landroid/content/res/Resources;", "destroyCompositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "layoutContainer", "Landroid/widget/FrameLayout;", "audienceContainerView", "Lcom/trtc/uikit/livekit/features/audiencecontainer/AudienceContainerView;", "audienceEndStatisticsView", "Lcom/trtc/uikit/livekit/features/endstatistics/AudienceEndStatisticsView;", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "getResources", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "observeKCLoginState", "liveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "disableFunction", "onNotifyEvent", "key", "", "subKey", "param", "", "", "onUserLeaveHint", "onDestroy", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onStop", "onLeaveLive", "onStopLive", "onResume", "onPause", "onPictureInPictureModeChanged", "isInPictureInPictureMode", "", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "startForegroundService", "stopForegroundService", "onLiveEnded", "roomId", TUIConstantDefine.OWNER_NAME, TUIConstantDefine.OWNER_AVATAR_URL, "onPictureInPictureClick", "destroyAudienceView", "onNewIntent", "intent", "pageId", "getPageId", "()Ljava/lang/String;", "setPageId", "(Ljava/lang/String;)V", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nVideoLiveAudienceActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoLiveAudienceActivity.kt\ncom/trtc/uikit/livekit/livestream/VideoLiveAudienceActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,366:1\n1#2:367\n*E\n"})
public final class VideoLiveAudienceActivity extends FullScreenActivity implements ITUINotification, VideoLiveKitImpl.InterfaceC36459b, InterfaceC36664a, IDisableEdgeToEdge, InterfaceC43845f {

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final Companion f79316o = new Companion(null);

    /* JADX INFO: renamed from: i */
    @Nullable
    public final Resources f79317i;

    /* JADX INFO: renamed from: k */
    public FrameLayout f79319k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public AudienceContainerView f79320l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public AudienceEndStatisticsView f79321m;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final CompositeDisposable f79318j = new CompositeDisposable();

    /* JADX INFO: renamed from: n */
    @Nullable
    public String f79322n = "B1FeedLive";

    /* JADX INFO: compiled from: VideoLiveAudienceActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/trtc/uikit/livekit/livestream/VideoLiveAudienceActivity$Companion;", "", "<init>", "()V", "KEY_EXTENSION_NAME", "", "NOTIFY_START_ACTIVITY", "METHOD_ACTIVITY_RESULT", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.livestream.VideoLiveAudienceActivity$a */
    /* JADX INFO: compiled from: VideoLiveAudienceActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/trtc/uikit/livekit/livestream/VideoLiveAudienceActivity$onLiveEnded$1$1", "Lcom/trtc/uikit/livekit/features/endstatistics/EndStatisticsDefine$AudienceEndStatisticsViewListener;", "onCloseButtonClick", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36457a implements InterfaceC36372e {
        public C36457a() {
        }

        @Override // com.trtc.uikit.livekit.features.endstatistics.InterfaceC36372e
        /* JADX INFO: renamed from: a */
        public void mo81369a() {
            VideoLiveAudienceActivity.this.finish();
        }
    }

    @Override // com.trtc.tuikit.common.FullScreenActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        FrameLayout frameLayout = null;
        super.onCreate(null);
        C44128b.m97266j("Live", "VideoLiveAudienceActivity onCreate");
        getWindow().addFlags(128);
        getWindow().getDecorView().setSystemUiVisibility(1024);
        setContentView(R$layout.livekit_activity_video_live_audience);
        View viewFindViewById = findViewById(R$id.fl_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f79319k = (FrameLayout) viewFindViewById;
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("VideoLiveAudience", "liveBundle is null");
            return;
        }
        LiveInfo liveInfoM95667a = C43453a.f95982a.m95667a(extras);
        m81725M();
        AudienceContainerView audienceContainerView = new AudienceContainerView(this, null, 0, 6, null);
        audienceContainerView.m80730k(true);
        if (!LiveRemoteConfigHelper.f79162a.m81520b()) {
            audienceContainerView.m80729j(true);
        }
        audienceContainerView.m80733n(this, liveInfoM95667a);
        audienceContainerView.m80726g(this);
        this.f79320l = audienceContainerView;
        FrameLayout frameLayout2 = this.f79319k;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutContainer");
        } else {
            frameLayout = frameLayout2;
        }
        frameLayout.addView(this.f79320l);
        VideoLiveKitImpl.Companion companion = VideoLiveKitImpl.f79326j;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        companion.createInstance(applicationContext).m81743g(this);
        TUICore.registerEvent("EVENT_KEY_LIVE_KIT", "EVENT_SUB_KEY_DESTROY_LIVE_VIEW", this);
        m81732S();
        m81731N(liveInfoM95667a);
    }

    /* JADX INFO: renamed from: M */
    private final void m81725M() {
        AudienceContainerStore.Companion companion = AudienceContainerStore.f78550b;
        companion.disableHeaderVisitorCnt(true);
        companion.disableFooterCoGuest(true);
    }

    /* JADX INFO: renamed from: O */
    public static final Boolean m81726O(Boolean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(UserInfo.a.n());
    }

    /* JADX INFO: renamed from: P */
    public static final Boolean m81727P(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Boolean) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: N */
    public final void m81731N(final LiveInfo liveInfo) {
        Observable observableE = UserInfo.a.e();
        final Function1 function1 = new Function1() { // from class: oe0.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoLiveAudienceActivity.m81726O((Boolean) obj);
            }
        };
        Observable observableDistinctUntilChanged = observableE.map(new Function() { // from class: oe0.c
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return VideoLiveAudienceActivity.m81727P(function1, obj);
            }
        }).distinctUntilChanged();
        final Function1 function2 = new Function1() { // from class: oe0.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoLiveAudienceActivity.m81728Q(liveInfo, this, (Boolean) obj);
            }
        };
        Disposable disposableSubscribe = observableDistinctUntilChanged.subscribe(new Consumer() { // from class: oe0.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VideoLiveAudienceActivity.m81729R(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, this.f79318j);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@NotNull Context newBase) {
        Context contextAttachBaseContext2;
        Intrinsics.checkNotNullParameter(newBase, "newBase");
        AppCompatDelegate delegate = getDelegate();
        super.attachBaseContext((delegate == null || (contextAttachBaseContext2 = delegate.attachBaseContext2(newBase)) == null) ? null : MultiLanguageManager.f46805a.m56994p(contextAttachBaseContext2));
    }

    @Override // de0.InterfaceC36664a
    /* JADX INFO: renamed from: f */
    public void mo81734f() {
        VideoLiveKitImpl.Companion companion = VideoLiveKitImpl.f79326j;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        if (companion.createInstance(applicationContext).m81744h(this)) {
            AudienceContainerView audienceContainerView = this.f79320l;
            String roomId = audienceContainerView != null ? audienceContainerView.getRoomId() : null;
            PIPPanelStore pIPPanelStoreSharedInstance = PIPPanelStore.f77996b.sharedInstance();
            if (roomId == null) {
                roomId = "";
            }
            pIPPanelStoreSharedInstance.m79909e(roomId);
        }
    }

    @Override // p569qq.InterfaceC43845f
    @Nullable
    /* JADX INFO: renamed from: getPageId, reason: from getter */
    public String getF18762X() {
        return this.f79322n;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    @NotNull
    public Resources getResources() {
        LangDynamicManager langDynamicManager = LangDynamicManager.f46816a;
        Resources resources = super.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        Resources resourcesM57014f = langDynamicManager.m57014f(resources);
        Configuration configuration = resourcesM57014f.getConfiguration();
        configuration.fontScale = 1.0f;
        resourcesM57014f.updateConfiguration(configuration, resourcesM57014f.getDisplayMetrics());
        return resourcesM57014f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // de0.InterfaceC36664a
    /* JADX INFO: renamed from: m */
    public void mo81735m(@NotNull String roomId, @NotNull String ownerName, @NotNull String ownerAvatarUrl) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(ownerName, "ownerName");
        Intrinsics.checkNotNullParameter(ownerAvatarUrl, "ownerAvatarUrl");
        if (PIPPanelStore.f77996b.sharedInstance().getF77998a().getF101322c()) {
            finish();
            return;
        }
        FrameLayout frameLayout = null;
        AudienceEndStatisticsView audienceEndStatisticsView = new AudienceEndStatisticsView(this, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
        audienceEndStatisticsView.m81346f(roomId, ownerName, ownerAvatarUrl);
        audienceEndStatisticsView.setListener(new C36457a());
        this.f79321m = audienceEndStatisticsView;
        FrameLayout frameLayout2 = this.f79319k;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutContainer");
            frameLayout2 = null;
        }
        frameLayout2.removeAllViews();
        FrameLayout frameLayout3 = this.f79319k;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutContainer");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.addView(this.f79321m);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (this.f79317i != null) {
            Resources resources = super.getResources();
            resources.getConfiguration().fontScale = 1.0f;
            this.f79317i.updateConfiguration(newConfig, resources.getDisplayMetrics());
        }
        AppCompatDelegate delegate = getDelegate();
        if (delegate != null) {
            delegate.onConfigurationChanged(newConfig);
        }
        boolean z11 = getRequestedOrientation() == 1;
        AudienceContainerView audienceContainerView = this.f79320l;
        if (audienceContainerView != null) {
            audienceContainerView.setScreenOrientation(z11);
        }
    }

    @Override // com.tencent.qcloud.tuicore.interfaces.ITUINotification
    public void onNotifyEvent(@Nullable String key, @Nullable String subKey, @Nullable Map<String, ? extends Object> param) {
        if (!TextUtils.equals(key, "TEBeautyExtension") || !TextUtils.equals(subKey, "onStartActivityNotifyEvent")) {
            if (TextUtils.equals(key, "EVENT_KEY_LIVE_KIT") && Intrinsics.areEqual("EVENT_SUB_KEY_DESTROY_LIVE_VIEW", subKey)) {
                m81730L();
                return;
            }
            return;
        }
        Object obj = param != null ? param.get("intent") : null;
        Intent intent = obj instanceof Intent ? (Intent) obj : null;
        Object obj2 = param != null ? param.get("requestCode") : null;
        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
        if (num != null && intent != null) {
            startActivityForResult(intent, num.intValue());
        } else if (intent != null) {
            startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m81728Q(LiveInfo liveInfo, VideoLiveAudienceActivity videoLiveAudienceActivity, Boolean bool) {
        if (!bool.booleanValue()) {
            return Unit.INSTANCE;
        }
        C44128b.m97259c("Live", "VideoLiveAudienceActivity observeKCLoginState login:" + bool + ",roomId:" + liveInfo.getLiveID() + ",roomOwnerId:" + liveInfo.getLiveOwner().getUserID());
        VideoLiveKitImpl.Companion companion = VideoLiveKitImpl.f79326j;
        Context applicationContext = videoLiveAudienceActivity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        companion.createInstance(applicationContext).m81748l(liveInfo.getLiveID(), liveInfo.getLiveOwner().getUserID());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R */
    public static final void m81729R(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: L */
    public final void m81730L() {
        if (!isFinishing() && !isDestroyed()) {
            AudienceContainerView audienceContainerView = this.f79320l;
            if (audienceContainerView != null) {
                audienceContainerView.m80728i();
            }
            finishAndRemoveTask();
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m81732S() {
        Context contextM79397b = ContextProvider.m79397b();
        Intrinsics.checkNotNull(contextM79397b);
        VideoForegroundService.m79357d(contextM79397b, C42816a.m93881a(contextM79397b), contextM79397b.getString(R$string.common_app_running), 0);
    }

    /* JADX INFO: renamed from: T */
    public final void m81733T() {
        VideoForegroundService.m79358e(ContextProvider.m79397b());
    }

    @Override // com.trtc.uikit.livekit.livestream.impl.VideoLiveKitImpl.InterfaceC36459b
    /* JADX INFO: renamed from: l */
    public void mo81720l() {
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TUICore.callService("TEBeautyExtension", "onActivityResult", MapsKt.mapOf(TuplesKt.m90091to("requestCode", Integer.valueOf(requestCode)), TuplesKt.m90091to("resultCode", Integer.valueOf(resultCode)), TuplesKt.m90091to("data", data)));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @Deprecated(message = "Deprecated in Java")
    @SuppressLint({"MissingSuperCall"})
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        PIPPanelStore.Companion companion = PIPPanelStore.f77996b;
        companion.sharedInstance().m79908d();
        VideoLiveKitImpl.Companion companion2 = VideoLiveKitImpl.f79326j;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        companion2.createInstance(applicationContext).m81750n(this);
        m81733T();
        AudienceContainerView audienceContainerView = this.f79320l;
        if (audienceContainerView != null) {
            audienceContainerView.m80737r(this);
        }
        TUICore.unRegisterEvent(this);
        companion.sharedInstance().m79909e("");
        PictureInPictureStore.f87308c.getShared().m87974e(false);
        C44128b.m97261e("Live", "VideoLiveAudienceActivity onDestroy");
        this.f79318j.dispose();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        C44128b.m97266j("Live", "VideoLiveAudienceActivity onNewIntent");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        C43853n.m96607a(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode);
        PIPPanelStore.f77996b.sharedInstance().getF77998a().m99363h(isInPictureInPictureMode);
        PictureInPictureStore.f87308c.getShared().m87974e(isInPictureInPictureMode);
        AudienceContainerView audienceContainerView = this.f79320l;
        if (audienceContainerView != null) {
            audienceContainerView.m80731l(isInPictureInPictureMode);
        }
        if (!isInPictureInPictureMode && getLifecycle().getState() == Lifecycle.State.CREATED) {
            m81730L();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        VideoLiveKitImpl.Companion companion = VideoLiveKitImpl.f79326j;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        companion.createInstance(applicationContext).m81753r();
        C43853n.m96608b(this);
        C44128b.m97261e("Live", "VideoLiveAudienceActivity onResume");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        if (!isFinishing()) {
            VideoLiveKitImpl.Companion companion = VideoLiveKitImpl.f79326j;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.createInstance(applicationContext).m81756u();
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        AudienceContainerView audienceContainerView;
        super.onUserLeaveHint();
        PIPPanelStore.Companion companion = PIPPanelStore.f77996b;
        if (!companion.sharedInstance().getF77998a().getF101322c() && (audienceContainerView = this.f79320l) != null && audienceContainerView.m80735p() && companion.sharedInstance().getF77998a().getF101324e()) {
            mo81734f();
        }
    }
}
