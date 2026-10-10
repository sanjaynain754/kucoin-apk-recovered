package com.trtc.uikit.livekit.component.roominfo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.user.api.IUserService;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.tencent.qcloud.tuicore.util.ScreenUtil;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.p180kc.helper.LiveFlutterHelper;
import com.trtc.uikit.livekit.p180kc.roominfo.service.KCRoomInfoService;
import com.trtc.uikit.livekit.p180kc.roominfo.store.FollowButtonState;
import com.trtc.uikit.livekit.p180kc.roominfo.store.KCRoomInfoState;
import io.trtc.tuikit.atomicx.widget.basicwidget.avatar.AtomicAvatar;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import vc0.C45496e;
import wc0.C45791b;

/* JADX INFO: compiled from: LiveInfoView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0006\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001=B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u0013J\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010 \u001a\u00020\u001bJ\u000e\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001fJ\b\u0010#\u001a\u00020\u001bH\u0002J\b\u0010$\u001a\u00020\u001bH\u0002J\b\u0010%\u001a\u00020\u001bH\u0002J\b\u0010&\u001a\u00020\u001bH\u0002J\b\u0010'\u001a\u00020\u001bH\u0002J\b\u0010(\u001a\u00020\u001bH\u0002J\b\u0010)\u001a\u00020\u001bH\u0014J\b\u0010*\u001a\u00020\u001bH\u0014J\b\u0010+\u001a\u00020\u001bH\u0002J\b\u0010,\u001a\u00020\u001bH\u0002J\b\u0010-\u001a\u00020\u001bH\u0002J\b\u0010.\u001a\u00020\u001bH\u0002J\u0012\u0010/\u001a\u00020\u001b2\b\u00100\u001a\u0004\u0018\u000101H\u0002J\u0012\u00102\u001a\u00020\u001b2\b\u00103\u001a\u0004\u0018\u000101H\u0002J\u0012\u00104\u001a\u00020\u001b2\b\u00105\u001a\u0004\u0018\u000101H\u0002J\u0018\u00106\u001a\u00020\u001b2\u000e\u00107\u001a\n\u0012\u0004\u0012\u000201\u0018\u000108H\u0002J\b\u00109\u001a\u00020\u001bH\u0002J\b\u0010:\u001a\u00020\u001bH\u0002J\u0012\u0010;\u001a\u00020\u001b2\b\u0010<\u001a\u0004\u0018\u000101H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/roominfo/LiveInfoView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "textNickName", "Landroid/widget/TextView;", "imageAvatar", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;", "layoutRoot", "Landroid/widget/LinearLayout;", "followButton", "Lcom/kubi/resources/widget/button/KcPrimaryButton;", "kcRoomInfoService", "Lcom/trtc/uikit/livekit/kc/roominfo/service/KCRoomInfoService;", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "attachedLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onResumeObserver", "Landroidx/lifecycle/LifecycleEventObserver;", "init", "", "liveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "enableFollow", "", "unInit", "setScreenOrientation", "isPortrait", "initView", "refreshView", "addObserver", "observeFollowStatus", "unObserveFollowStatus", "removeObserver", "onAttachedToWindow", "onDetachedFromWindow", "bindViewId", "initHostNameView", "initHostAvatarView", "initRoomInfoPanelView", "onHostIdChange", TUIConstantDefine.OWNER_ID, "", "onHostNickNameChange", "name", "onHostAvatarChange", "avatar", "onFollowStatusChange", "followUsers", "", "onFollowButtonClick", "refreshFollowButton", "reportData", "roomId", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nLiveInfoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveInfoView.kt\ncom/trtc/uikit/livekit/component/roominfo/LiveInfoView\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,421:1\n153#2,7:422\n*S KotlinDebug\n*F\n+ 1 LiveInfoView.kt\ncom/trtc/uikit/livekit/component/roominfo/LiveInfoView\n*L\n190#1:422,7\n*E\n"})
public final class LiveInfoView extends FrameLayout {

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final Companion f78002j = new Companion(null);

    /* JADX INFO: renamed from: b */
    public TextView f78003b;

    /* JADX INFO: renamed from: c */
    public AtomicAvatar f78004c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f78005d;

    /* JADX INFO: renamed from: e */
    public KcPrimaryButton f78006e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public KCRoomInfoService f78007f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public InterfaceC41775x1 f78008g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public LifecycleOwner f78009h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public LifecycleEventObserver f78010i;

    /* JADX INFO: compiled from: LiveInfoView.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/roominfo/LiveInfoView$Companion;", "", "<init>", "()V", "LIVEKIT_METRICS_PANEL_SHOW_LIVE_ROOM_LIVE_INFO", "", "LIVEKIT_METRICS_PANEL_SHOW_VOICE_ROOM_LIVE_INFO", "LIVE_FEED_REFRESH_CARD", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveInfoView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m79923q(LiveInfoView liveInfoView, View it) {
        KCRoomInfoState f79189g;
        InterfaceC41669n<String> ownerId;
        KCRoomInfoState f79189g2;
        InterfaceC41669n<String> ownerId2;
        Intrinsics.checkNotNullParameter(it, "it");
        KCRoomInfoService kCRoomInfoService = liveInfoView.f78007f;
        String value = null;
        String strM66668h = C27041f.m66668h((kCRoomInfoService == null || (f79189g2 = kCRoomInfoService.getF79189g()) == null || (ownerId2 = f79189g2.getOwnerId()) == null) ? null : ownerId2.getValue());
        C44128b.m97259c("Live", "LiveInfoView layoutRoot click userId: " + strM66668h);
        if (!StringsKt.isBlank(strM66668h)) {
            C43852m.m96591c("B1FeedLive", "avatar", null, null, 12, null);
            LiveFlutterHelper liveFlutterHelper = LiveFlutterHelper.f79161a;
            KCRoomInfoService kCRoomInfoService2 = liveInfoView.f78007f;
            if (kCRoomInfoService2 != null && (f79189g = kCRoomInfoService2.getF79189g()) != null && (ownerId = f79189g.getOwnerId()) != null) {
                value = ownerId.getValue();
            }
            liveFlutterHelper.m81517b(C27041f.m66668h(value));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final void m79924t(LiveInfoView liveInfoView, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        KCRoomInfoService kCRoomInfoService;
        KCRoomInfoState f79189g;
        KCRoomInfoState f79189g2;
        InterfaceC41669n<String> ownerId;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_RESUME) {
            KCRoomInfoService kCRoomInfoService2 = liveInfoView.f78007f;
            String selfUserId = null;
            String value = (kCRoomInfoService2 == null || (f79189g2 = kCRoomInfoService2.getF79189g()) == null || (ownerId = f79189g2.getOwnerId()) == null) ? null : ownerId.getValue();
            KCRoomInfoService kCRoomInfoService3 = liveInfoView.f78007f;
            if (kCRoomInfoService3 != null && (f79189g = kCRoomInfoService3.getF79189g()) != null) {
                selfUserId = f79189g.getSelfUserId();
            }
            if ((value == null || StringsKt.isBlank(value) || !TextUtils.equals(selfUserId, value)) && (kCRoomInfoService = liveInfoView.f78007f) != null) {
                kCRoomInfoService.m81568m();
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m79925v(LiveInfoView liveInfoView) {
        KCRoomInfoState f79189g;
        InterfaceC41669n<FollowButtonState> followButtonState;
        FollowButtonState value;
        KCRoomInfoService kCRoomInfoService = liveInfoView.f78007f;
        if (C27025c.m66566d((kCRoomInfoService == null || (f79189g = kCRoomInfoService.getF79189g()) == null || (followButtonState = f79189g.getFollowButtonState()) == null || (value = followButtonState.getValue()) == null) ? null : Boolean.valueOf(value.isFollowed()))) {
            KCRoomInfoService kCRoomInfoService2 = liveInfoView.f78007f;
            if (kCRoomInfoService2 != null) {
                kCRoomInfoService2.m81572q();
            }
            C43852m.m96591c("B1FeedLive", "cancelFollow", null, null, 12, null);
        } else {
            KCRoomInfoService kCRoomInfoService3 = liveInfoView.f78007f;
            if (kCRoomInfoService3 != null) {
                kCRoomInfoService3.m81562g();
            }
            C43852m.m96591c("B1FeedLive", "follow", null, null, 12, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m79926y(LiveInfoView liveInfoView, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        liveInfoView.m79942u();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final void m79927A() {
        KCRoomInfoState f79189g;
        InterfaceC41669n<FollowButtonState> followButtonState;
        FollowButtonState value;
        KCRoomInfoService kCRoomInfoService = this.f78007f;
        KcPrimaryButton kcPrimaryButton = null;
        if (C27025c.m66566d((kCRoomInfoService == null || (f79189g = kCRoomInfoService.getF79189g()) == null || (followButtonState = f79189g.getFollowButtonState()) == null || (value = followButtonState.getValue()) == null) ? null : Boolean.valueOf(value.isFollowed()))) {
            KcPrimaryButton kcPrimaryButton2 = this.f78006e;
            if (kcPrimaryButton2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("followButton");
            } else {
                kcPrimaryButton = kcPrimaryButton2;
            }
            kcPrimaryButton.setText(kcPrimaryButton.getContext().getString(R$string.live_followed));
            kcPrimaryButton.setEnabled(true);
            kcPrimaryButton.setAlpha(0.4f);
            return;
        }
        KcPrimaryButton kcPrimaryButton3 = this.f78006e;
        if (kcPrimaryButton3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("followButton");
        } else {
            kcPrimaryButton = kcPrimaryButton3;
        }
        kcPrimaryButton.setText(kcPrimaryButton.getContext().getString(R$string.live_follow));
        kcPrimaryButton.setEnabled(true);
        kcPrimaryButton.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: B */
    public final void m79928B() {
        KCRoomInfoState f79189g;
        KCRoomInfoService kCRoomInfoService = this.f78007f;
        KcPrimaryButton kcPrimaryButton = null;
        if (C27025c.m66566d((kCRoomInfoService == null || (f79189g = kCRoomInfoService.getF79189g()) == null) ? null : Boolean.valueOf(f79189g.getEnableFollow()))) {
            return;
        }
        KcPrimaryButton kcPrimaryButton2 = this.f78006e;
        if (kcPrimaryButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("followButton");
        } else {
            kcPrimaryButton = kcPrimaryButton2;
        }
        kcPrimaryButton.setVisibility(8);
    }

    /* JADX INFO: renamed from: C */
    public final void m79929C() {
        InterfaceC41775x1 interfaceC41775x1 = this.f78008g;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m79932F() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        LifecycleEventObserver lifecycleEventObserver = this.f78010i;
        if (lifecycleEventObserver != null && (lifecycleOwner = this.f78009h) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(lifecycleEventObserver);
        }
        this.f78010i = null;
        this.f78009h = null;
    }

    /* JADX INFO: renamed from: k */
    public final void m79934k() {
        View viewFindViewById = findViewById(R$id.ll_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f78005d = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.tv_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f78003b = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.iv_avatar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f78004c = (AtomicAvatar) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.atomic_btn_follow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f78006e = (KcPrimaryButton) viewFindViewById4;
    }

    /* JADX INFO: renamed from: l */
    public final void m79935l(@NotNull LiveInfo liveInfo, @NotNull KCRoomInfoService kcRoomInfoService) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        Intrinsics.checkNotNullParameter(kcRoomInfoService, "kcRoomInfoService");
        m79936m(liveInfo, true, kcRoomInfoService);
    }

    /* JADX INFO: renamed from: m */
    public final void m79936m(@NotNull LiveInfo liveInfo, boolean z11, @NotNull KCRoomInfoService kcRoomInfoService) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        Intrinsics.checkNotNullParameter(kcRoomInfoService, "kcRoomInfoService");
        this.f78007f = kcRoomInfoService;
        kcRoomInfoService.getF79189g().setEnableFollow(z11);
        m79940r();
        m79933j();
        m79930D(liveInfo.getLiveID());
        m79928B();
    }

    /* JADX INFO: renamed from: n */
    public final void m79937n() {
        KCRoomInfoState f79189g;
        InterfaceC41669n<String> ownerAvatarUrl;
        AtomicAvatar atomicAvatar = this.f78004c;
        String value = null;
        if (atomicAvatar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageAvatar");
            atomicAvatar = null;
        }
        atomicAvatar.setShape(AtomicAvatar.AvatarShape.Round);
        KCRoomInfoService kCRoomInfoService = this.f78007f;
        if (kCRoomInfoService != null && (f79189g = kCRoomInfoService.getF79189g()) != null && (ownerAvatarUrl = f79189g.getOwnerAvatarUrl()) != null) {
            value = ownerAvatarUrl.getValue();
        }
        atomicAvatar.setContent(new AtomicAvatar.AbstractC39363b.URL(C27041f.m66668h(value), R$drawable.room_info_default_avatar));
    }

    /* JADX INFO: renamed from: o */
    public final void m79938o() {
        KCRoomInfoState f79189g;
        InterfaceC41669n<String> ownerId;
        KCRoomInfoState f79189g2;
        InterfaceC41669n<String> ownerName;
        KCRoomInfoService kCRoomInfoService = this.f78007f;
        TextView textView = null;
        String value = (kCRoomInfoService == null || (f79189g2 = kCRoomInfoService.getF79189g()) == null || (ownerName = f79189g2.getOwnerName()) == null) ? null : ownerName.getValue();
        KCRoomInfoService kCRoomInfoService2 = this.f78007f;
        String value2 = (kCRoomInfoService2 == null || (f79189g = kCRoomInfoService2.getF79189g()) == null || (ownerId = f79189g.getOwnerId()) == null) ? null : ownerId.getValue();
        TextView textView2 = this.f78003b;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textNickName");
        } else {
            textView = textView2;
        }
        if (TextUtils.isEmpty(value)) {
            value = value2;
        }
        textView.setText(value);
    }

    /* JADX INFO: renamed from: p */
    public final void m79939p() {
        LinearLayout linearLayout = this.f78005d;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutRoot");
            linearLayout = null;
        }
        C45791b.m101117c(linearLayout, 0L, new Function1() { // from class: com.trtc.uikit.livekit.component.roominfo.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveInfoView.m79923q(this.f78016b, (View) obj);
            }
        }, 1, null);
    }

    public final void setScreenOrientation(boolean isPortrait) {
        LinearLayout linearLayout = this.f78005d;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutRoot");
            linearLayout = null;
        }
        linearLayout.setEnabled(isPortrait);
    }

    /* JADX INFO: renamed from: u */
    public final void m79942u() {
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: com.trtc.uikit.livekit.component.roominfo.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveInfoView.m79925v(this.f78018b);
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: renamed from: w */
    public final void m79943w(String str) {
        AtomicAvatar atomicAvatar = this.f78004c;
        if (atomicAvatar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageAvatar");
            atomicAvatar = null;
        }
        if (str == null) {
            str = "";
        }
        atomicAvatar.setContent(new AtomicAvatar.AbstractC39363b.URL(str, R$drawable.room_info_default_avatar));
    }

    /* JADX INFO: renamed from: x */
    public final void m79944x(String str) {
        KcPrimaryButton kcPrimaryButton;
        KCRoomInfoService kCRoomInfoService;
        KCRoomInfoState f79189g;
        KCRoomInfoState f79189g2;
        KCRoomInfoService kCRoomInfoService2 = this.f78007f;
        if (C27025c.m66566d((kCRoomInfoService2 == null || (f79189g2 = kCRoomInfoService2.getF79189g()) == null) ? null : Boolean.valueOf(f79189g2.getEnableFollow())) && !TextUtils.isEmpty(str)) {
            KCRoomInfoService kCRoomInfoService3 = this.f78007f;
            boolean zEquals = TextUtils.equals((kCRoomInfoService3 == null || (f79189g = kCRoomInfoService3.getF79189g()) == null) ? null : f79189g.getSelfUserId(), str);
            if (zEquals) {
                TextView textView = this.f78003b;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("textNickName");
                    textView = null;
                }
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginEnd(ScreenUtil.dip2px(8.0f));
                TextView textView2 = this.f78003b;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("textNickName");
                    textView2 = null;
                }
                textView2.setLayoutParams(layoutParams2);
                KcPrimaryButton kcPrimaryButton2 = this.f78006e;
                if (kcPrimaryButton2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("followButton");
                    kcPrimaryButton2 = null;
                }
                kcPrimaryButton2.setVisibility(8);
            } else {
                KcPrimaryButton kcPrimaryButton3 = this.f78006e;
                if (kcPrimaryButton3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("followButton");
                    kcPrimaryButton3 = null;
                }
                kcPrimaryButton3.setVisibility(0);
            }
            if (str != null && (kCRoomInfoService = this.f78007f) != null) {
                kCRoomInfoService.m81567l();
            }
            if (zEquals) {
                return;
            }
            m79927A();
            KcPrimaryButton kcPrimaryButton4 = this.f78006e;
            if (kcPrimaryButton4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("followButton");
                kcPrimaryButton = null;
            } else {
                kcPrimaryButton = kcPrimaryButton4;
            }
            C45791b.m101117c(kcPrimaryButton, 0L, new Function1() { // from class: com.trtc.uikit.livekit.component.roominfo.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LiveInfoView.m79926y(this.f78015b, (View) obj);
                }
            }, 1, null);
        }
    }

    public /* synthetic */ LiveInfoView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: D */
    public final void m79930D(String str) {
        if (!TextUtils.isEmpty(str) && str != null && StringsKt.startsWith$default(str, "voice_", false, 2, (Object) null)) {
            C45496e.m100464a(191008);
        } else {
            C45496e.m100464a(190009);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m79933j() {
        this.f78008g = C41696j.m91104d(C41713n0.m91126b(), null, null, new LiveInfoView$addObserver$1(this, null), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m79941s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m79929C();
        m79932F();
    }

    /* JADX INFO: renamed from: r */
    public final void m79940r() {
        m79938o();
        m79937n();
        m79939p();
    }

    /* JADX INFO: renamed from: s */
    public final void m79941s() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        Object context = getContext();
        if (context instanceof LifecycleOwner) {
            lifecycleOwner = (LifecycleOwner) context;
        } else {
            lifecycleOwner = null;
        }
        if (lifecycleOwner != null) {
            this.f78009h = lifecycleOwner;
            this.f78010i = new LifecycleEventObserver() { // from class: com.trtc.uikit.livekit.component.roominfo.c
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    LiveInfoView.m79924t(this.f78017b, lifecycleOwner2, event);
                }
            };
            LifecycleOwner lifecycleOwner2 = this.f78009h;
            if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
                LifecycleEventObserver lifecycleEventObserver = this.f78010i;
                Intrinsics.checkNotNull(lifecycleEventObserver);
                lifecycle.addObserver(lifecycleEventObserver);
            }
            LifecycleOwner lifecycleOwner3 = this.f78009h;
            if (lifecycleOwner3 != null) {
                if (C12573b.f21598a.m23696a()) {
                    "live_feed_refresh_card".length();
                }
                C12572a.m23692a(lifecycleOwner3, false, new C35974xc20d2cc6("live_feed_refresh_card", null, this));
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m79945z(String str) {
        m79938o();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(R$layout.live_info_view, (ViewGroup) this, true);
        m79934k();
    }

    /* JADX INFO: renamed from: E */
    public final void m79931E() {
    }
}
