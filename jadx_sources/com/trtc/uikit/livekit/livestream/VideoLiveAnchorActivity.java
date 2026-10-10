package com.trtc.uikit.livekit.livestream;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Lifecycle;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.function.language.dynamic.LangDynamicManager;
import com.kubi.sdk.util.IDisableEdgeToEdge;
import com.kubi.sdk.util.PermissionAspect;
import com.tencent.qcloud.tuicore.TUICore;
import com.tencent.qcloud.tuicore.interfaces.ITUINotification;
import com.trtc.tuikit.common.FullScreenActivity;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.component.pippanel.PIPPanelStore;
import com.trtc.uikit.livekit.features.anchorboardcast.AnchorBoardcastState;
import com.trtc.uikit.livekit.features.anchorboardcast.AnchorView;
import com.trtc.uikit.livekit.features.anchorboardcast.AnchorViewListener;
import com.trtc.uikit.livekit.features.anchorboardcast.RoomBehavior;
import com.trtc.uikit.livekit.features.anchorboardcast.store.AnchorStore;
import com.trtc.uikit.livekit.features.anchorprepare.AnchorPrepareView;
import com.trtc.uikit.livekit.features.anchorprepare.AnchorPrepareViewListener;
import com.trtc.uikit.livekit.features.anchorprepare.LiveStreamPrivacyStatus;
import com.trtc.uikit.livekit.features.anchorprepare.PrepareState;
import com.trtc.uikit.livekit.features.endstatistics.AnchorEndStatisticsInfo;
import com.trtc.uikit.livekit.features.endstatistics.AnchorEndStatisticsView;
import com.trtc.uikit.livekit.features.endstatistics.InterfaceC36371d;
import com.trtc.uikit.livekit.livestream.VideoLiveAnchorActivity;
import com.trtc.uikit.livekit.livestream.impl.VideoLiveKitImpl;
import dh0.C36686b;
import io.trtc.tuikit.atomicx.pictureinpicture.PictureInPictureStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.view.LiveCoreView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.aspectj.lang.InterfaceC43175a;
import org.aspectj.runtime.internal.C43179b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p514ou.C43330a;
import p569qq.C43852m;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import pe0.C43453a;
import ro.C44128b;

/* JADX INFO: compiled from: VideoLiveAnchorActivity.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\u0018\u0000 O2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001OB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\b\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u00020\u001c2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\b\u0010$\u001a\u00020\u001cH\u0014J\b\u0010%\u001a\u00020\u001cH\u0014J\b\u0010&\u001a\u00020\u001cH\u0014J\b\u0010'\u001a\u00020\u001cH\u0014J\b\u0010(\u001a\u00020\u001cH\u0017J\u0010\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u0014H\u0016J\b\u0010+\u001a\u00020\u001cH\u0002J\b\u0010,\u001a\u00020\u001cH\u0002J\b\u0010-\u001a\u00020\u001cH\u0002J\b\u0010.\u001a\u00020\u001cH\u0002J\b\u0010/\u001a\u00020\u001cH\u0002J\u0012\u00100\u001a\u00020\u001c2\b\u00101\u001a\u0004\u0018\u000102H\u0002J\b\u00103\u001a\u00020\u001cH\u0002J\b\u00104\u001a\u00020\u001cH\u0002J\b\u00105\u001a\u00020\u001cH\u0016J\b\u00106\u001a\u00020\u001cH\u0016J\u0010\u00107\u001a\u00020\u001c2\u0006\u00101\u001a\u000202H\u0016J\b\u00108\u001a\u00020\u001cH\u0016J\b\u00109\u001a\u00020\u001cH\u0016J\b\u0010:\u001a\u00020\u001cH\u0016J2\u0010;\u001a\u00020\u001c2\b\u0010<\u001a\u0004\u0018\u00010\u00162\b\u0010=\u001a\u0004\u0018\u00010\u00162\u0014\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020@\u0018\u00010?H\u0016J\"\u0010A\u001a\u00020\u001c2\u0006\u0010B\u001a\u00020\n2\u0006\u0010C\u001a\u00020\n2\b\u0010D\u001a\u0004\u0018\u00010EH\u0014J+\u0010F\u001a\u00020\u001c2\u0006\u0010B\u001a\u00020\n2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00160H2\u0006\u0010I\u001a\u00020JH\u0016¢\u0006\u0002\u0010KJ\b\u0010L\u001a\u00020\u001cH\u0002J\u0012\u0010M\u001a\u00020\u001c2\b\u0010N\u001a\u0004\u0018\u00010EH\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006P"}, m90084d2 = {"Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;", "Lcom/trtc/tuikit/common/FullScreenActivity;", "Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$CallingAPIListener;", "Lcom/trtc/uikit/livekit/features/anchorprepare/AnchorPrepareViewListener;", "Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorViewListener;", "Lcom/tencent/qcloud/tuicore/interfaces/ITUINotification;", "Lcom/kubi/sdk/util/IDisableEdgeToEdge;", "<init>", "()V", "startActivityRequestCode", "", "layoutContainer", "Landroid/widget/FrameLayout;", "anchorPrepareView", "Lcom/trtc/uikit/livekit/features/anchorprepare/AnchorPrepareView;", "anchorView", "Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;", "anchorEndStatisticsView", "Lcom/trtc/uikit/livekit/features/endstatistics/AnchorEndStatisticsView;", "needCreateRoom", "", "roomId", "", "liveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "anchorEndStatisticsInfo", "Lcom/trtc/uikit/livekit/features/endstatistics/EndStatisticsDefine$AnchorEndStatisticsInfo;", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "getResources", "Landroid/content/res/Resources;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onStop", "onUserLeaveHint", "onDestroy", "onBackPressed", "onPictureInPictureModeChanged", "isInPictureInPictureMode", "addPrepareView", "addAnchorView", "disableFunction", "removeAnchorPrepareView", "initLiveInfo", "initEndStatisticsInfo", "state", "Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorBoardcastState;", "removeAnchorView", "addAnchorEndStatisticsView", "onClickStartButton", "onClickBackButton", "onEndLiving", "onClickFloatWindow", "onLeaveLive", "onStopLive", "onNotifyEvent", "key", "subKey", "param", "", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "destroyAnchorView", "onNewIntent", "intent", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class VideoLiveAnchorActivity extends FullScreenActivity implements VideoLiveKitImpl.InterfaceC36459b, AnchorPrepareViewListener, AnchorViewListener, ITUINotification, IDisableEdgeToEdge {

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final Companion f79304r;

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ InterfaceC43175a.a f79305s;

    /* JADX INFO: renamed from: i */
    public int f79306i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f79307j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public AnchorPrepareView f79308k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public AnchorView f79309l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public AnchorEndStatisticsView f79310m;

    /* JADX INFO: renamed from: n */
    public boolean f79311n = true;

    /* JADX INFO: renamed from: o */
    @NotNull
    public String f79312o = "";

    /* JADX INFO: renamed from: p */
    @NotNull
    public LiveInfo f79313p = new LiveInfo(null, null, null, false, false, false, false, 0, null, 0, null, null, null, 0, null, 0, 0, false, null, 524287, null);

    /* JADX INFO: renamed from: q */
    @NotNull
    public final AnchorEndStatisticsInfo f79314q = new AnchorEndStatisticsInfo(null, 0, 0, 0, 0, 0, 0, 127, null);

    /* JADX INFO: compiled from: VideoLiveAnchorActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity$Companion;", "", "<init>", "()V", "INTENT_KEY_ROOM_ID", "", "INTENT_KEY_NEED_CREATE", "KEY_EXTENSION_NAME", "NOTIFY_START_ACTIVITY", "METHOD_ACTIVITY_RESULT", "PICK_CONTENT_ALL", "REQUEST_CODE_PERMISSIONS", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.livestream.VideoLiveAnchorActivity$a */
    /* JADX INFO: compiled from: VideoLiveAnchorActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity$addAnchorEndStatisticsView$1$1", "Lcom/trtc/uikit/livekit/features/endstatistics/EndStatisticsDefine$AnchorEndStatisticsViewListener;", "onCloseButtonClick", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36456a implements InterfaceC36371d {
        public C36456a() {
        }

        @Override // com.trtc.uikit.livekit.features.endstatistics.InterfaceC36371d
        /* JADX INFO: renamed from: a */
        public void mo81368a() {
            VideoLiveAnchorActivity.this.finishAndRemoveTask();
        }
    }

    @Override // com.trtc.tuikit.common.FullScreenActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        FrameLayout frameLayout = null;
        super.onCreate(null);
        C44128b.m97266j("Live", "VideoLiveAnchorActivity onNewIntent");
        C43852m.m96595g("B1FeedStreamerLive", "page", null, null, 12, null);
        getWindow().addFlags(128);
        getWindow().getDecorView().setSystemUiVisibility(1024);
        setContentView(R$layout.livekit_activity_video_live_anchor);
        String stringExtra = getIntent().getStringExtra("intent_key_room_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f79312o = stringExtra;
        this.f79313p.setLiveID(stringExtra);
        this.f79311n = getIntent().getBooleanExtra("intent_key_need_create", false);
        Bundle extras = getIntent().getExtras();
        if (extras != null && !extras.containsKey("intent_key_room_id")) {
            this.f79313p = C43453a.f95982a.m95667a(extras);
        }
        View viewFindViewById = findViewById(R$id.fl_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        FrameLayout frameLayout2 = (FrameLayout) viewFindViewById;
        this.f79307j = frameLayout2;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutContainer");
        } else {
            frameLayout = frameLayout2;
        }
        ViewCompat.setOnApplyWindowInsetsListener(frameLayout, new OnApplyWindowInsetsListener() { // from class: oe0.a
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return VideoLiveAnchorActivity.m81710P(view, windowInsetsCompat);
            }
        });
        if (this.f79311n) {
            m81713K();
        } else {
            m81712J();
        }
        TUICore.registerEvent("TEBeautyExtension", "onStartActivityNotifyEvent", this);
        TUICore.registerEvent("EVENT_KEY_LIVE_KIT", "EVENT_SUB_KEY_DESTROY_LIVE_VIEW", this);
        VideoLiveKitImpl.Companion companion = VideoLiveKitImpl.f79326j;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        companion.createInstance(applicationContext).m81743g(this);
    }

    /* JADX INFO: renamed from: P */
    public static final WindowInsetsCompat m81710P(View v11, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(v11, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        v11.setPadding(v11.getPaddingStart(), v11.getPaddingTop(), v11.getPaddingEnd(), insets.getInsets(WindowInsetsCompat.Type.navigationBars()).bottom);
        return insets;
    }

    private static /* synthetic */ void ajc$preClinit() {
        C36686b c36686b = new C36686b("VideoLiveAnchorActivity.kt", VideoLiveAnchorActivity.class);
        f79305s = c36686b.m82128h("method-execution", c36686b.m82127g("1", "onRequestPermissionsResult", "com.trtc.uikit.livekit.livestream.VideoLiveAnchorActivity", "int:[Ljava.lang.String;:[I", "requestCode:permissions:grantResults", "", "void"), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    public final void m81711I() {
        FrameLayout frameLayout = null;
        AnchorEndStatisticsView anchorEndStatisticsView = new AnchorEndStatisticsView(this, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
        anchorEndStatisticsView.m81324j(this.f79314q);
        anchorEndStatisticsView.setListener(new C36456a());
        this.f79310m = anchorEndStatisticsView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout frameLayout2 = this.f79307j;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutContainer");
        } else {
            frameLayout = frameLayout2;
        }
        frameLayout.addView(this.f79310m, layoutParams);
    }

    /* JADX INFO: renamed from: K */
    public final void m81713K() {
        AnchorPrepareView anchorPrepareView = new AnchorPrepareView(this, null, 0, 6, null);
        FrameLayout frameLayout = null;
        anchorPrepareView.m80605f(this.f79313p.getLiveID(), null);
        anchorPrepareView.m80603d(this);
        this.f79308k = anchorPrepareView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout frameLayout2 = this.f79307j;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutContainer");
        } else {
            frameLayout = frameLayout2;
        }
        frameLayout.addView(this.f79308k, layoutParams);
    }

    /* JADX INFO: renamed from: M */
    public final void m81715M() {
        AnchorStore.Companion companion = AnchorStore.f78167o;
        companion.disableHeaderVisitorCnt(true);
        companion.disableFooterCoGuest(true);
        companion.disableFooterCoHost(true);
        companion.disableFooterBattle(true);
    }

    /* JADX INFO: renamed from: N */
    public final void m81716N(AnchorBoardcastState anchorBoardcastState) {
        if (anchorBoardcastState != null) {
            AnchorEndStatisticsInfo anchorEndStatisticsInfo = this.f79314q;
            anchorEndStatisticsInfo.m81367n(this.f79313p.getLiveID());
            anchorEndStatisticsInfo.m81364k(anchorBoardcastState.getF78106b());
            anchorEndStatisticsInfo.m81365l(anchorBoardcastState.getF78105a());
            anchorEndStatisticsInfo.m81366m(anchorBoardcastState.getF78107c());
            anchorEndStatisticsInfo.m81361h(anchorBoardcastState.getF78108d());
            anchorEndStatisticsInfo.m81362i(anchorBoardcastState.getF78109e());
            anchorEndStatisticsInfo.m81363j(anchorBoardcastState.getF78110f());
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m81717O() {
        PrepareState state;
        AnchorPrepareView anchorPrepareView = this.f79308k;
        if (anchorPrepareView == null || (state = anchorPrepareView.getState()) == null) {
            return;
        }
        this.f79313p.setLiveName(state.roomName.getValue());
        this.f79313p.setPublicVisible(state.liveMode.getValue() == LiveStreamPrivacyStatus.PUBLIC);
        this.f79313p.setCoverURL(state.coverURL.getValue());
        this.f79313p.setBackgroundURL(state.coverURL.getValue());
        this.f79313p.setSeatLayoutTemplateID(state.coGuestTemplateId.getValue().intValue());
    }

    /* JADX INFO: renamed from: Q */
    public final void m81718Q() {
        FrameLayout frameLayout = this.f79307j;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutContainer");
            frameLayout = null;
        }
        frameLayout.removeAllViews();
    }

    /* JADX INFO: renamed from: R */
    public final void m81719R() {
        FrameLayout frameLayout = this.f79307j;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutContainer");
            frameLayout = null;
        }
        frameLayout.removeAllViews();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@NotNull Context newBase) {
        Context contextAttachBaseContext2;
        Intrinsics.checkNotNullParameter(newBase, "newBase");
        AppCompatDelegate delegate = getDelegate();
        super.attachBaseContext((delegate == null || (contextAttachBaseContext2 = delegate.attachBaseContext2(newBase)) == null) ? null : MultiLanguageManager.f46805a.m56994p(contextAttachBaseContext2));
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

    @Override // com.tencent.qcloud.tuicore.interfaces.ITUINotification
    public void onNotifyEvent(@Nullable String key, @Nullable String subKey, @Nullable Map<String, ? extends Object> param) {
        Object obj;
        if (!TextUtils.equals(key, "TEBeautyExtension") || !TextUtils.equals(subKey, "onStartActivityNotifyEvent")) {
            if (TextUtils.equals(key, "EVENT_KEY_LIVE_KIT") && TextUtils.equals(subKey, "EVENT_SUB_KEY_DESTROY_LIVE_VIEW")) {
                m81714L();
                return;
            }
            return;
        }
        if (param == null || (obj = param.get("requestCode")) == null) {
            return;
        }
        this.f79306i = ((Integer) obj).intValue();
        if (ContextCompat.checkSelfPermission(this, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 1001);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK", MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*|video/*");
        startActivityForResult(intent, this.f79306i);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) throws Throwable {
        InterfaceC43175a interfaceC43175aM82125e = C36686b.m82125e(f79305s, this, this, new Object[]{C43179b.m94790c(requestCode), permissions, grantResults});
        PermissionAspect.m58339c().m58340d(interfaceC43175aM82125e);
        C43330a.m95368b().m95370d(interfaceC43175aM82125e);
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (requestCode != 1001) {
            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK", MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*|video/*");
        startActivityForResult(intent, this.f79306i);
    }

    @Override // com.trtc.uikit.livekit.features.anchorprepare.AnchorPrepareViewListener
    /* JADX INFO: renamed from: p */
    public void mo80619p() {
        AnchorPrepareView anchorPrepareView = this.f79308k;
        if (anchorPrepareView != null) {
            anchorPrepareView.m80614q(this);
        }
        m81717O();
        m81718Q();
        m81712J();
    }

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.AnchorViewListener
    /* JADX INFO: renamed from: u */
    public void mo80184u() {
        VideoLiveKitImpl.Companion companion = VideoLiveKitImpl.f79326j;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        if (companion.createInstance(applicationContext).m81744h(this)) {
            PIPPanelStore.f77996b.sharedInstance().m79909e(this.f79313p.getLiveID());
        }
    }

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.AnchorViewListener
    /* JADX INFO: renamed from: w */
    public void mo80185w(@NotNull AnchorBoardcastState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        AnchorView anchorView = this.f79309l;
        if (anchorView != null) {
            anchorView.m80122e2(this);
        }
        m81716N(state);
        m81719R();
        m81711I();
    }

    static {
        ajc$preClinit();
        f79304r = new Companion(null);
    }

    /* JADX INFO: renamed from: J */
    public final void m81712J() {
        RoomBehavior roomBehavior;
        Object objValueOf;
        RoomBehavior roomBehavior2;
        InterfaceC41678w<Integer> interfaceC41678w;
        m81715M();
        AnchorView anchorView = new AnchorView(this, null, 0, 6, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AnchorPrepareView anchorPrepareView = this.f79308k;
        FrameLayout frameLayout = null;
        if (anchorPrepareView != null) {
            PrepareState state = anchorPrepareView.getState();
            if (state != null && (interfaceC41678w = state.coHostTemplateId) != null) {
                objValueOf = Integer.valueOf(interfaceC41678w.getValue().intValue());
            } else {
                objValueOf = "";
            }
            linkedHashMap.put("coHostTemplateId", objValueOf);
            LiveInfo liveInfo = this.f79313p;
            LiveCoreView coreView = anchorPrepareView.getF78454f();
            if (this.f79311n) {
                roomBehavior2 = RoomBehavior.CREATE_ROOM;
            } else {
                roomBehavior2 = RoomBehavior.ENTER_ROOM;
            }
            anchorView.m80125g1(liveInfo, coreView, roomBehavior2, linkedHashMap);
        } else {
            LiveInfo liveInfo2 = this.f79313p;
            if (this.f79311n) {
                roomBehavior = RoomBehavior.CREATE_ROOM;
            } else {
                roomBehavior = RoomBehavior.ENTER_ROOM;
            }
            anchorView.m80125g1(liveInfo2, null, roomBehavior, linkedHashMap);
        }
        anchorView.m80096R0(this);
        this.f79309l = anchorView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout frameLayout2 = this.f79307j;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutContainer");
        } else {
            frameLayout = frameLayout2;
        }
        frameLayout.addView(this.f79309l, layoutParams);
    }

    /* JADX INFO: renamed from: L */
    public final void m81714L() {
        if (!isFinishing() && !isDestroyed()) {
            finishAndRemoveTask();
        }
    }

    @Override // com.trtc.uikit.livekit.livestream.impl.VideoLiveKitImpl.InterfaceC36459b
    /* JADX INFO: renamed from: l */
    public void mo81720l() {
        finish();
    }

    @Override // com.trtc.uikit.livekit.features.anchorprepare.AnchorPrepareViewListener
    /* JADX INFO: renamed from: n */
    public void mo80618n() {
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TUICore.callService("TEBeautyExtension", "onActivityResult", MapsKt.mapOf(TuplesKt.m90091to("requestCode", Integer.valueOf(requestCode)), TuplesKt.m90091to("resultCode", Integer.valueOf(resultCode)), TuplesKt.m90091to("data", data)));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        PIPPanelStore.Companion companion = PIPPanelStore.f77996b;
        companion.sharedInstance().m79908d();
        TUICore.unRegisterEvent(this);
        AnchorPrepareView anchorPrepareView = this.f79308k;
        if (anchorPrepareView != null) {
            anchorPrepareView.m80614q(this);
        }
        AnchorView anchorView = this.f79309l;
        if (anchorView != null) {
            anchorView.m80122e2(this);
        }
        companion.sharedInstance().m79909e("");
        PictureInPictureStore.f87308c.getShared().m87974e(false);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        C44128b.m97266j("Live", "VideoLiveAnchorActivity onNewIntent");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode);
        PictureInPictureStore.f87308c.getShared().m87974e(isInPictureInPictureMode);
        PIPPanelStore.f77996b.sharedInstance().getF77998a().m99361f(isInPictureInPictureMode);
        AnchorView anchorView = this.f79309l;
        if (anchorView != null) {
            anchorView.m80109Z0(isInPictureInPictureMode);
        }
        if (!isInPictureInPictureMode && getLifecycle().getState() == Lifecycle.State.CREATED) {
            finishAndRemoveTask();
            AnchorView anchorView2 = this.f79309l;
            if (anchorView2 != null) {
                anchorView2.m80085I2();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        VideoLiveKitImpl.Companion companion = VideoLiveKitImpl.f79326j;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        companion.createInstance(applicationContext).m81753r();
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
        super.onUserLeaveHint();
        PIPPanelStore.Companion companion = PIPPanelStore.f77996b;
        if (!companion.sharedInstance().getF77998a().getF101321b() && companion.sharedInstance().getF77998a().getF101323d() && companion.sharedInstance().getF77998a().getF101324e()) {
            mo80184u();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @Deprecated(message = "Deprecated in Java")
    @SuppressLint({"MissingSuperCall"})
    public void onBackPressed() {
    }
}
