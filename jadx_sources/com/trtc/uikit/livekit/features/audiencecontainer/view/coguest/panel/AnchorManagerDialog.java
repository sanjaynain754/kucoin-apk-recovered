package com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.trtc.tuikit.common.permission.AbstractC35867d;
import com.trtc.tuikit.common.system.ContextProvider;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.common.ErrorLocalized;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.features.audiencecontainer.store.IMStore;
import ee0.C37144f;
import io.trtc.tuikit.atomicx.widget.basicwidget.alertdialog.AtomicAlertDialog;
import io.trtc.tuikit.atomicx.widget.basicwidget.alertdialog.C39361f;
import io.trtc.tuikit.atomicx.widget.basicwidget.avatar.AtomicAvatar;
import io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import io.trtc.tuikit.atomicxcore.api.live.GuestListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveAudienceListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveEndedReason;
import io.trtc.tuikit.atomicxcore.api.live.LiveListListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import io.trtc.tuikit.atomicxcore.api.live.SeatInfo;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import vc0.C45494c;
import vc0.C45495d;
import vc0.C45497f;

/* JADX INFO: compiled from: AnchorManagerDialog.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u007f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004*\u0003EHK\u0018\u0000 M2\u00020\u0001:\u0001MB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\tJ\b\u0010#\u001a\u00020!H\u0016J\b\u0010$\u001a\u00020!H\u0016J\b\u0010%\u001a\u00020!H\u0002J\u0010\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020\u0014H\u0002J\b\u0010(\u001a\u00020!H\u0002J\b\u0010)\u001a\u00020!H\u0002J\b\u0010*\u001a\u00020!H\u0002J\b\u0010+\u001a\u00020!H\u0002J\b\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020-H\u0002J\b\u0010/\u001a\u00020!H\u0002J\b\u00100\u001a\u00020!H\u0002J\u0010\u00101\u001a\u00020!2\u0006\u0010'\u001a\u00020\u0014H\u0002J\u0016\u00102\u001a\u00020!2\f\u00103\u001a\b\u0012\u0004\u0012\u00020504H\u0002J\b\u00106\u001a\u00020!H\u0002J\b\u00107\u001a\u00020!H\u0002J\b\u00108\u001a\u00020!H\u0002J\b\u00109\u001a\u00020!H\u0002J\b\u0010:\u001a\u00020!H\u0002J\b\u0010;\u001a\u00020!H\u0002J\u0010\u0010<\u001a\u00020!2\u0006\u0010=\u001a\u00020-H\u0002J\u0010\u0010>\u001a\u00020!2\u0006\u0010?\u001a\u00020-H\u0002J\u0016\u0010@\u001a\u00020!2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020C0BH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u00020EX\u0082\u0004¢\u0006\u0004\n\u0002\u0010FR\u0010\u0010G\u001a\u00020HX\u0082\u0004¢\u0006\u0004\n\u0002\u0010IR\u0010\u0010J\u001a\u00020KX\u0082\u0004¢\u0006\u0004\n\u0002\u0010L¨\u0006N"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;", "context", "Landroid/content/Context;", "audienceStore", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;", "<init>", "(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;)V", "seatUserInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "confirmDialog", "Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "imageHeadView", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;", "userIdText", "Landroid/widget/TextView;", "userNameText", "flipCameraContainer", "Landroid/view/View;", "followContainer", "handUpContainer", "audioContainer", "videoContainer", "ivAudio", "Landroid/widget/ImageView;", "tvAudio", "ivVideo", "tvVideo", "textUnfollow", "imageFollowIcon", "init", "", "seatInfo", "onAttachedToWindow", "onDetachedFromWindow", "initView", "bindViewId", "rootView", "updateView", "updateMediaDeviceButton", "updateAdminDeviceButton", "updateGeneralUserDeviceButton", "isSelfUser", "", "isAdmin", "addObserver", "removeObserver", "initFollowButtonView", "onFollowingUserChanged", "followUsers", "", "", "onHangupButtonClicked", "onMicrophoneButtonClicked", "onCameraButtonClicked", "onSwitchCameraButtonClicked", "unMuteMicrophone", "startCamera", "updateMicrophoneButton", "isAudioLocked", "updateCameraButton", "isVideoLocked", "onConnectUserListChanged", "connectedUserList", "", "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;", "liveLisListener", "com/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$liveLisListener$1", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$liveLisListener$1;", "liveAudienceListener", "com/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$liveAudienceListener$1", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$liveAudienceListener$1;", "coGuestListener", "com/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$coGuestListener$1", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$coGuestListener$1;", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAnchorManagerDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchorManagerDialog.kt\ncom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,517:1\n1#2:518\n*E\n"})
public final class AnchorManagerDialog extends AtomicPopover {

    /* JADX INFO: renamed from: H */
    @NotNull
    public static final Companion f78772H = new Companion(null);

    /* JADX INFO: renamed from: I */
    @NotNull
    public static final LiveKitLogger f78773I = LiveKitLogger.f77564c.getLiveStreamLogger("AnchorManagerDialog");

    /* JADX INFO: renamed from: A */
    public ImageView f78774A;

    /* JADX INFO: renamed from: B */
    public TextView f78775B;

    /* JADX INFO: renamed from: C */
    public TextView f78776C;

    /* JADX INFO: renamed from: D */
    public ImageView f78777D;

    /* JADX INFO: renamed from: E */
    @NotNull
    public final C36265c f78778E;

    /* JADX INFO: renamed from: F */
    @NotNull
    public final C36264b f78779F;

    /* JADX INFO: renamed from: G */
    @NotNull
    public final C36257a f78780G;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final C37144f f78781m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public LiveUserInfo f78782n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public AtomicAlertDialog f78783o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public InterfaceC41775x1 f78784p;

    /* JADX INFO: renamed from: q */
    public AtomicAvatar f78785q;

    /* JADX INFO: renamed from: r */
    public TextView f78786r;

    /* JADX INFO: renamed from: s */
    public TextView f78787s;

    /* JADX INFO: renamed from: t */
    public View f78788t;

    /* JADX INFO: renamed from: u */
    public View f78789u;

    /* JADX INFO: renamed from: v */
    public View f78790v;

    /* JADX INFO: renamed from: w */
    public View f78791w;

    /* JADX INFO: renamed from: x */
    public View f78792x;

    /* JADX INFO: renamed from: y */
    public ImageView f78793y;

    /* JADX INFO: renamed from: z */
    public TextView f78794z;

    /* JADX INFO: compiled from: AnchorManagerDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$Companion;", "", "<init>", "()V", "LOGGER", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "BUTTON_DISABLE_ALPHA", "", "BUTTON_ENABLE_ALPHA", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.AnchorManagerDialog$a */
    /* JADX INFO: compiled from: AnchorManagerDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$coGuestListener$1", "Lio/trtc/tuikit/atomicxcore/api/live/GuestListener;", "onKickedOffSeat", "", "seatIndex", "", "hostUser", "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36257a extends GuestListener {
        public C36257a() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.GuestListener
        public void onKickedOffSeat(int seatIndex, LiveUserInfo hostUser) {
            Intrinsics.checkNotNullParameter(hostUser, "hostUser");
            AnchorManagerDialog.this.dismiss();
            AtomicAlertDialog atomicAlertDialog = AnchorManagerDialog.this.f78783o;
            if (atomicAlertDialog != null) {
                atomicAlertDialog.m88063s();
            }
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.AnchorManagerDialog$b */
    /* JADX INFO: compiled from: AnchorManagerDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$liveAudienceListener$1", "Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceListener;", "onAudienceLeft", "", "audience", "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36264b extends LiveAudienceListener {
        public C36264b() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.LiveAudienceListener
        public void onAudienceLeft(LiveUserInfo audience) {
            Intrinsics.checkNotNullParameter(audience, "audience");
            if (AnchorManagerDialog.this.f78782n == null) {
                return;
            }
            LiveUserInfo liveUserInfo = AnchorManagerDialog.this.f78782n;
            Intrinsics.checkNotNull(liveUserInfo);
            if (TextUtils.isEmpty(liveUserInfo.getUserID())) {
                return;
            }
            String userID = audience.getUserID();
            LiveUserInfo liveUserInfo2 = AnchorManagerDialog.this.f78782n;
            Intrinsics.checkNotNull(liveUserInfo2);
            if (Intrinsics.areEqual(userID, liveUserInfo2.getUserID())) {
                AnchorManagerDialog.this.dismiss();
                AtomicAlertDialog atomicAlertDialog = AnchorManagerDialog.this.f78783o;
                if (atomicAlertDialog != null) {
                    atomicAlertDialog.m88063s();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.AnchorManagerDialog$c */
    /* JADX INFO: compiled from: AnchorManagerDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$liveLisListener$1", "Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;", "onLiveEnded", "", "liveID", "", "reason", "Lio/trtc/tuikit/atomicxcore/api/live/LiveEndedReason;", "message", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36265c extends LiveListListener {
        public C36265c() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.LiveListListener
        public void onLiveEnded(String liveID, LiveEndedReason reason, String message) {
            Intrinsics.checkNotNullParameter(liveID, "liveID");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(message, "message");
            AnchorManagerDialog.this.dismiss();
            AtomicAlertDialog atomicAlertDialog = AnchorManagerDialog.this.f78783o;
            if (atomicAlertDialog != null) {
                atomicAlertDialog.m88063s();
            }
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.AnchorManagerDialog$d */
    /* JADX INFO: compiled from: AnchorManagerDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$startCamera$1", "Lcom/trtc/tuikit/common/permission/PermissionCallback;", "onRequesting", "", "onGranted", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36266d extends AbstractC35867d {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f78811b;

        public C36266d(boolean z11) {
            this.f78811b = z11;
        }

        /* JADX INFO: renamed from: f */
        public static final Unit m81091f(C45494c completionHandler) {
            Intrinsics.checkNotNullParameter(completionHandler, "$this$completionHandler");
            completionHandler.m100461h(new Function2() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.o
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AnchorManagerDialog.C36266d.m81092g(((Integer) obj).intValue(), (String) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: g */
        public static final Unit m81092g(int i11, String str) {
            Intrinsics.checkNotNullParameter(str, "<unused var>");
            ErrorLocalized.f77561a.onError(i11);
            return Unit.INSTANCE;
        }

        @Override // com.trtc.tuikit.common.permission.AbstractC35867d
        /* JADX INFO: renamed from: b */
        public void mo79394b() {
            AnchorManagerDialog.f78773I.m79404b("requestCameraPermissions:[onGranted]");
            AnchorManagerDialog.this.f78781m.getF82420b().openLocalCamera(this.f78811b, C45495d.m100463a(new Function1() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.n
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AnchorManagerDialog.C36266d.m81091f((C45494c) obj);
                }
            }));
        }

        @Override // com.trtc.tuikit.common.permission.AbstractC35867d
        /* JADX INFO: renamed from: c */
        public void mo79395c() {
            AnchorManagerDialog.f78773I.m79404b("requestCameraPermissions:[onRequesting]");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorManagerDialog(@NotNull Context context, @NotNull C37144f audienceStore) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(audienceStore, "audienceStore");
        this.f78781m = audienceStore;
        m81060g0();
        this.f78778E = new C36265c();
        this.f78779F = new C36264b();
        this.f78780G = new C36257a();
    }

    /* JADX INFO: renamed from: F0 */
    private final void m81034F0() {
        LiveUserInfo liveUserInfo = this.f78782n;
        if (liveUserInfo == null) {
            return;
        }
        Intrinsics.checkNotNull(liveUserInfo);
        if (TextUtils.isEmpty(liveUserInfo.getUserID())) {
            return;
        }
        LiveUserInfo liveUserInfo2 = this.f78782n;
        Intrinsics.checkNotNull(liveUserInfo2);
        String avatarURL = liveUserInfo2.getAvatarURL();
        AtomicAvatar atomicAvatar = this.f78785q;
        TextView textView = null;
        if (atomicAvatar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageHeadView");
            atomicAvatar = null;
        }
        atomicAvatar.setContent(new AtomicAvatar.AbstractC39363b.URL(avatarURL, R$drawable.livekit_ic_avatar));
        TextView textView2 = this.f78787s;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userNameText");
            textView2 = null;
        }
        LiveUserInfo liveUserInfo3 = this.f78782n;
        Intrinsics.checkNotNull(liveUserInfo3);
        textView2.setText(liveUserInfo3.getUserName());
        TextView textView3 = this.f78786r;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userIdText");
        } else {
            textView = textView3;
        }
        Context context = getContext();
        int i11 = R$string.common_user_id;
        LiveUserInfo liveUserInfo4 = this.f78782n;
        Intrinsics.checkNotNull(liveUserInfo4);
        textView.setText(context.getString(i11, liveUserInfo4.getUserID()));
        m81031D0();
    }

    /* JADX INFO: renamed from: Y */
    private final void m81053Y(View view) {
        View viewFindViewById = view.findViewById(R$id.user_id);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f78786r = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.user_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f78787s = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.iv_head);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f78785q = (AtomicAvatar) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R$id.hand_up_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f78790v = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R$id.flip_camera_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f78788t = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R$id.fl_follow_panel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f78789u = viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R$id.iv_audio);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f78793y = (ImageView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R$id.audio_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f78791w = viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R$id.tv_audio);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f78794z = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R$id.video_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.f78792x = viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R$id.iv_video);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f78774A = (ImageView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R$id.tv_video);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.f78775B = (TextView) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R$id.tv_unfollow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        this.f78776C = (TextView) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R$id.iv_follow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        this.f78777D = (ImageView) viewFindViewById14;
        View view2 = this.f78790v;
        View view3 = null;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("handUpContainer");
            view2 = null;
        }
        view2.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                AnchorManagerDialog.m81054Z(this.f78856b, view4);
            }
        });
        View view4 = this.f78788t;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flipCameraContainer");
            view4 = null;
        }
        view4.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                AnchorManagerDialog.m81055a0(this.f78862b, view5);
            }
        });
        View view5 = this.f78791w;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioContainer");
            view5 = null;
        }
        view5.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                AnchorManagerDialog.m81056b0(this.f78864b, view6);
            }
        });
        View view6 = this.f78792x;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoContainer");
        } else {
            view3 = view6;
        }
        view3.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view7) {
                AnchorManagerDialog.m81057c0(this.f78866b, view7);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    private final void m81058e0(View view) {
        view.findViewById(R$id.fl_follow_panel).setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AnchorManagerDialog.m81059f0(this.f78868b, view2);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m81059f0(AnchorManagerDialog anchorManagerDialog, View view) {
        if (anchorManagerDialog.f78782n == null) {
            return;
        }
        Set<String> value = anchorManagerDialog.f78781m.m83093l().m83106a().getValue();
        LiveUserInfo liveUserInfo = anchorManagerDialog.f78782n;
        Intrinsics.checkNotNull(liveUserInfo);
        if (value.contains(liveUserInfo.getUserID())) {
            IMStore f82427i = anchorManagerDialog.f78781m.getF82427i();
            LiveUserInfo liveUserInfo2 = anchorManagerDialog.f78782n;
            Intrinsics.checkNotNull(liveUserInfo2);
            f82427i.m80755j(liveUserInfo2.getUserID());
            return;
        }
        IMStore f82427i2 = anchorManagerDialog.f78781m.getF82427i();
        LiveUserInfo liveUserInfo3 = anchorManagerDialog.f78782n;
        Intrinsics.checkNotNull(liveUserInfo3);
        f82427i2.m80751f(liveUserInfo3.getUserID());
    }

    /* JADX INFO: renamed from: h0 */
    private final boolean m81061h0() {
        UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
        String userID = value != null ? value.getUserID() : null;
        if (TextUtils.isEmpty(userID)) {
            return false;
        }
        return Intrinsics.areEqual(userID, this.f78781m.m83096o().getCurrentLive().getValue().getLiveOwner().getUserID());
    }

    /* JADX INFO: renamed from: i0 */
    private final boolean m81062i0() {
        LiveUserInfo liveUserInfo = this.f78782n;
        if (liveUserInfo == null) {
            return false;
        }
        Intrinsics.checkNotNull(liveUserInfo);
        if (TextUtils.isEmpty(liveUserInfo.getUserID())) {
            return false;
        }
        LiveUserInfo liveUserInfo2 = this.f78782n;
        Intrinsics.checkNotNull(liveUserInfo2);
        String userID = liveUserInfo2.getUserID();
        UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
        return Intrinsics.areEqual(userID, value != null ? value.getUserID() : null);
    }

    /* JADX INFO: renamed from: n0 */
    public static final Unit m81063n0(final AnchorManagerDialog anchorManagerDialog, AtomicAlertDialog.DialogConfig init) {
        Intrinsics.checkNotNullParameter(init, "$this$init");
        String string = anchorManagerDialog.getContext().getString(R$string.common_disconnect_tips);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        init.m88090o(string);
        String string2 = anchorManagerDialog.getContext().getString(R$string.common_disconnection);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        C39361f.m88097g(init, string2, AtomicAlertDialog.TextColorPreset.RED, false, new Function1() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnchorManagerDialog.m81064o0(this.f78858b, (Dialog) obj);
            }
        }, 4, null);
        String string3 = anchorManagerDialog.getContext().getString(R$string.common_cancel);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        C39361f.m88095e(init, string3, AtomicAlertDialog.TextColorPreset.PRIMARY, false, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o0 */
    public static final Unit m81064o0(AnchorManagerDialog anchorManagerDialog, Dialog it) {
        Intrinsics.checkNotNullParameter(it, "it");
        LiveSeatStore f82422d = anchorManagerDialog.f78781m.getF82422d();
        LiveUserInfo liveUserInfo = anchorManagerDialog.f78782n;
        Intrinsics.checkNotNull(liveUserInfo);
        f82422d.kickUserOutOfSeat(liveUserInfo.getUserID(), C45495d.m100463a(new Function1() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnchorManagerDialog.m81065p0((C45494c) obj);
            }
        }));
        anchorManagerDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p0 */
    public static final Unit m81065p0(C45494c completionHandler) {
        Intrinsics.checkNotNullParameter(completionHandler, "$this$completionHandler");
        completionHandler.m100461h(new Function2() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.d
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AnchorManagerDialog.m81066q0(((Integer) obj).intValue(), (String) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q0 */
    public static final Unit m81066q0(int i11, String str) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        ErrorLocalized.f77561a.onError(i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r0 */
    public static final Unit m81067r0(final AnchorManagerDialog anchorManagerDialog, AtomicAlertDialog.DialogConfig init) {
        Intrinsics.checkNotNullParameter(init, "$this$init");
        String string = anchorManagerDialog.getContext().getString(R$string.common_terminate_room_connection_message);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        init.m88090o(string);
        String string2 = anchorManagerDialog.getContext().getString(R$string.common_disconnection);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        C39361f.m88097g(init, string2, AtomicAlertDialog.TextColorPreset.RED, false, new Function1() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnchorManagerDialog.m81068s0(this.f78875b, (Dialog) obj);
            }
        }, 4, null);
        String string3 = anchorManagerDialog.getContext().getString(R$string.common_cancel);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        C39361f.m88095e(init, string3, AtomicAlertDialog.TextColorPreset.PRIMARY, false, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s0 */
    public static final Unit m81068s0(AnchorManagerDialog anchorManagerDialog, Dialog it) {
        Intrinsics.checkNotNullParameter(it, "it");
        anchorManagerDialog.f78781m.getF82424f().disconnect(null);
        anchorManagerDialog.f78781m.getF82429k().m80790g(false);
        anchorManagerDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v0 */
    private final void m81069v0() {
        InterfaceC41775x1 interfaceC41775x1 = this.f78784p;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f78781m.getF82419a().removeLiveListListener(this.f78778E);
        this.f78781m.getF82424f().removeGuestListener(this.f78780G);
        this.f78781m.getF82423e().removeLiveAudienceListener(this.f78779F);
    }

    /* JADX INFO: renamed from: w0 */
    private final void m81070w0() {
        boolean zBooleanValue = this.f78781m.getF82420b().getDeviceState().isFrontCamera().getValue().booleanValue();
        C45497f c45497f = C45497f.f102528a;
        Context contextM79397b = ContextProvider.m79397b();
        Intrinsics.checkNotNullExpressionValue(contextM79397b, "getApplicationContext(...)");
        c45497f.m100466a(contextM79397b, new C36266d(zBooleanValue));
    }

    /* JADX INFO: renamed from: y0 */
    public static final Unit m81071y0(C45494c completionHandler) {
        Intrinsics.checkNotNullParameter(completionHandler, "$this$completionHandler");
        completionHandler.m100461h(new Function2() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.m
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AnchorManagerDialog.m81072z0(((Integer) obj).intValue(), (String) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z0 */
    public static final Unit m81072z0(int i11, String str) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        ErrorLocalized.f77561a.onError(i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m81077d0(@NotNull LiveUserInfo seatInfo) {
        Intrinsics.checkNotNullParameter(seatInfo, "seatInfo");
        this.f78782n = seatInfo;
        m81034F0();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m81078j0() {
        Object next;
        SeatUserInfo userInfo;
        String userID;
        UserProfile value;
        if (this.f78782n == null) {
            return;
        }
        View view = null;
        if (!m81062i0()) {
            if (m81061h0()) {
                LiveSeatStore f82422d = this.f78781m.getF82422d();
                LiveUserInfo liveUserInfo = this.f78782n;
                f82422d.closeRemoteCamera(liveUserInfo != null ? liveUserInfo.getUserID() : null, null);
                dismiss();
                return;
            }
            return;
        }
        Iterator<T> it = this.f78781m.m83098q().getSeatList().getValue().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                userID = ((SeatInfo) next).getUserInfo().getUserID();
                value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
            }
        } while (!Intrinsics.areEqual(userID, value != null ? value.getUserID() : null));
        SeatInfo seatInfo = (SeatInfo) next;
        if (((seatInfo == null || (userInfo = seatInfo.getUserInfo()) == null) ? null : userInfo.getCameraStatus()) == DeviceStatus.ON) {
            this.f78781m.getF82420b().closeLocalCamera();
            View view2 = this.f78788t;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("flipCameraContainer");
            } else {
                view = view2;
            }
            view.setVisibility(8);
        } else {
            m81070w0();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m81079k0(List<SeatUserInfo> list) {
        LiveUserInfo liveUserInfo = this.f78782n;
        if (liveUserInfo == null) {
            return;
        }
        Intrinsics.checkNotNull(liveUserInfo);
        if (TextUtils.isEmpty(liveUserInfo.getUserID())) {
            return;
        }
        for (SeatUserInfo seatUserInfo : list) {
            LiveUserInfo liveUserInfo2 = this.f78782n;
            Intrinsics.checkNotNull(liveUserInfo2);
            if (Intrinsics.areEqual(liveUserInfo2.getUserID(), seatUserInfo.getUserID())) {
                return;
            }
        }
        dismiss();
        AtomicAlertDialog atomicAlertDialog = this.f78783o;
        if (atomicAlertDialog != null) {
            atomicAlertDialog.m88063s();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m81080l0(Set<String> set) {
        LiveUserInfo liveUserInfo = this.f78782n;
        if (liveUserInfo == null) {
            return;
        }
        Intrinsics.checkNotNull(liveUserInfo);
        TextView textView = null;
        ImageView imageView = null;
        if (set.contains(liveUserInfo.getUserID())) {
            TextView textView2 = this.f78776C;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textUnfollow");
                textView2 = null;
            }
            textView2.setVisibility(8);
            ImageView imageView2 = this.f78777D;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageFollowIcon");
            } else {
                imageView = imageView2;
            }
            imageView.setVisibility(0);
            return;
        }
        ImageView imageView3 = this.f78777D;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageFollowIcon");
            imageView3 = null;
        }
        imageView3.setVisibility(8);
        TextView textView3 = this.f78776C;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textUnfollow");
        } else {
            textView = textView3;
        }
        textView.setVisibility(0);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m81081m0() {
        if (this.f78782n == null) {
            return;
        }
        if (this.f78783o == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.f78783o = new AtomicAlertDialog(context, null, 2, null);
        }
        if (m81061h0()) {
            AtomicAlertDialog atomicAlertDialog = this.f78783o;
            if (atomicAlertDialog != null) {
                atomicAlertDialog.m88065u(new Function1() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.j
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AnchorManagerDialog.m81063n0(this.f78871b, (AtomicAlertDialog.DialogConfig) obj);
                    }
                });
            }
            AtomicAlertDialog atomicAlertDialog2 = this.f78783o;
            Intrinsics.checkNotNull(atomicAlertDialog2);
            atomicAlertDialog2.m88054I();
            return;
        }
        if (m81062i0()) {
            AtomicAlertDialog atomicAlertDialog3 = this.f78783o;
            if (atomicAlertDialog3 != null) {
                atomicAlertDialog3.m88065u(new Function1() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.k
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AnchorManagerDialog.m81067r0(this.f78873b, (AtomicAlertDialog.DialogConfig) obj);
                    }
                });
            }
            AtomicAlertDialog atomicAlertDialog4 = this.f78783o;
            Intrinsics.checkNotNull(atomicAlertDialog4);
            atomicAlertDialog4.m88054I();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m81082t0() {
        Object next;
        SeatUserInfo userInfo;
        String userID;
        UserProfile value;
        if (this.f78782n == null) {
            return;
        }
        DeviceStatus microphoneStatus = null;
        if (!m81062i0()) {
            if (m81061h0()) {
                LiveSeatStore f82422d = this.f78781m.getF82422d();
                LiveUserInfo liveUserInfo = this.f78782n;
                f82422d.closeRemoteMicrophone(liveUserInfo != null ? liveUserInfo.getUserID() : null, null);
                dismiss();
                return;
            }
            return;
        }
        Iterator<T> it = this.f78781m.m83098q().getSeatList().getValue().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                userID = ((SeatInfo) next).getUserInfo().getUserID();
                value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
            }
        } while (!Intrinsics.areEqual(userID, value != null ? value.getUserID() : null));
        SeatInfo seatInfo = (SeatInfo) next;
        if (seatInfo != null && (userInfo = seatInfo.getUserInfo()) != null) {
            microphoneStatus = userInfo.getMicrophoneStatus();
        }
        if (microphoneStatus == DeviceStatus.ON) {
            this.f78781m.getF82422d().muteMicrophone();
        } else {
            m81084x0();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m81083u0() {
        this.f78781m.getF82420b().switchCamera(!this.f78781m.getF82420b().getDeviceState().isFrontCamera().getValue().booleanValue());
        dismiss();
    }

    /* JADX INFO: renamed from: x0 */
    public final void m81084x0() {
        this.f78781m.getF82422d().unmuteMicrophone(C45495d.m100463a(new Function1() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnchorManagerDialog.m81071y0((C45494c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D0 */
    private final void m81031D0() {
        if (m81061h0()) {
            m81073A0();
        } else {
            m81075C0();
        }
    }

    /* JADX INFO: renamed from: X */
    private final void m81052X() {
        this.f78784p = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new AnchorManagerDialog$addObserver$1(this, null), 3, null);
        this.f78781m.getF82419a().addLiveListListener(this.f78778E);
        this.f78781m.getF82424f().addGuestListener(this.f78780G);
        this.f78781m.getF82423e().addLiveAudienceListener(this.f78779F);
    }

    /* JADX INFO: renamed from: Z */
    public static final void m81054Z(AnchorManagerDialog anchorManagerDialog, View view) {
        anchorManagerDialog.m81081m0();
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m81055a0(AnchorManagerDialog anchorManagerDialog, View view) {
        anchorManagerDialog.m81083u0();
    }

    /* JADX INFO: renamed from: b0 */
    public static final void m81056b0(AnchorManagerDialog anchorManagerDialog, View view) {
        anchorManagerDialog.m81082t0();
    }

    /* JADX INFO: renamed from: c0 */
    public static final void m81057c0(AnchorManagerDialog anchorManagerDialog, View view) {
        anchorManagerDialog.m81078j0();
    }

    /* JADX INFO: renamed from: g0 */
    private final void m81060g0() {
        View viewInflate = View.inflate(getContext(), R$layout.livekit_anchor_manager_panel, null);
        Intrinsics.checkNotNull(viewInflate);
        m88181q(viewInflate);
        m81053Y(viewInflate);
        m81058e0(viewInflate);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m81073A0() {
        View view = null;
        if (m81062i0()) {
            View view2 = this.f78788t;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("flipCameraContainer");
                view2 = null;
            }
            view2.setVisibility(0);
            View view3 = this.f78790v;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("handUpContainer");
                view3 = null;
            }
            view3.setVisibility(8);
            View view4 = this.f78789u;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("followContainer");
            } else {
                view = view4;
            }
            view.setVisibility(8);
            return;
        }
        View view5 = this.f78788t;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flipCameraContainer");
            view5 = null;
        }
        view5.setVisibility(8);
        View view6 = this.f78790v;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("handUpContainer");
            view6 = null;
        }
        view6.setVisibility(0);
        View view7 = this.f78789u;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("followContainer");
        } else {
            view = view7;
        }
        view.setVisibility(0);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m81074B0(boolean z11) {
        Object next;
        DeviceStatus cameraStatus;
        SeatUserInfo userInfo;
        String userID;
        String userID2;
        int i11;
        int i12;
        View view = null;
        TextView textView = null;
        View view2 = null;
        View view3 = null;
        if (!m81062i0()) {
            if (m81061h0()) {
                View view4 = this.f78792x;
                if (view4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("videoContainer");
                    view4 = null;
                }
                view4.setEnabled(true);
                ImageView imageView = this.f78774A;
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ivVideo");
                    imageView = null;
                }
                imageView.setAlpha(1.0f);
                ImageView imageView2 = this.f78774A;
                if (imageView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ivVideo");
                    imageView2 = null;
                }
                if (z11) {
                    i11 = R$drawable.livekit_ic_disable_video;
                } else {
                    i11 = R$drawable.livekit_ic_start_video;
                }
                imageView2.setImageResource(i11);
                TextView textView2 = this.f78775B;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvVideo");
                } else {
                    textView = textView2;
                }
                if (z11) {
                    i12 = R$string.common_enable_video;
                } else {
                    i12 = R$string.common_disable_video;
                }
                textView.setText(i12);
                return;
            }
            return;
        }
        if (z11) {
            View view5 = this.f78792x;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("videoContainer");
                view5 = null;
            }
            view5.setEnabled(false);
            ImageView imageView3 = this.f78774A;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivVideo");
                imageView3 = null;
            }
            imageView3.setAlpha(0.24f);
            ImageView imageView4 = this.f78774A;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivVideo");
                imageView4 = null;
            }
            imageView4.setImageResource(R$drawable.livekit_ic_stop_video);
            TextView textView3 = this.f78775B;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvVideo");
                textView3 = null;
            }
            textView3.setText(R$string.common_start_video);
            View view6 = this.f78788t;
            if (view6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("flipCameraContainer");
            } else {
                view2 = view6;
            }
            view2.setVisibility(8);
            return;
        }
        View view7 = this.f78792x;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoContainer");
            view7 = null;
        }
        view7.setEnabled(true);
        ImageView imageView5 = this.f78774A;
        if (imageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivVideo");
            imageView5 = null;
        }
        imageView5.setAlpha(1.0f);
        Iterator<T> it = this.f78781m.m83098q().getSeatList().getValue().iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
                userID = ((SeatInfo) next).getUserInfo().getUserID();
                UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
                if (value != null) {
                    userID2 = value.getUserID();
                } else {
                    userID2 = null;
                }
            } else {
                next = null;
                break;
            }
        } while (!Intrinsics.areEqual(userID, userID2));
        SeatInfo seatInfo = (SeatInfo) next;
        if (seatInfo != null && (userInfo = seatInfo.getUserInfo()) != null) {
            cameraStatus = userInfo.getCameraStatus();
        } else {
            cameraStatus = null;
        }
        if (cameraStatus == DeviceStatus.ON) {
            ImageView imageView6 = this.f78774A;
            if (imageView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivVideo");
                imageView6 = null;
            }
            imageView6.setImageResource(R$drawable.livekit_ic_start_video);
            TextView textView4 = this.f78775B;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvVideo");
                textView4 = null;
            }
            textView4.setText(R$string.common_stop_video);
            View view8 = this.f78788t;
            if (view8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("flipCameraContainer");
            } else {
                view3 = view8;
            }
            view3.setVisibility(0);
            return;
        }
        ImageView imageView7 = this.f78774A;
        if (imageView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivVideo");
            imageView7 = null;
        }
        imageView7.setImageResource(R$drawable.livekit_ic_stop_video);
        TextView textView5 = this.f78775B;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvVideo");
            textView5 = null;
        }
        textView5.setText(R$string.common_start_video);
        View view9 = this.f78788t;
        if (view9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flipCameraContainer");
        } else {
            view = view9;
        }
        view.setVisibility(8);
    }

    /* JADX INFO: renamed from: C0 */
    public final void m81075C0() {
        Object next;
        boolean z11;
        SeatUserInfo userInfo;
        String userID;
        SeatUserInfo userInfo2;
        String userID2;
        String userID3;
        if (m81062i0()) {
            View view = this.f78788t;
            Object obj = null;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("flipCameraContainer");
                view = null;
            }
            boolean z12 = false;
            view.setVisibility(0);
            View view2 = this.f78790v;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("handUpContainer");
                view2 = null;
            }
            view2.setVisibility(0);
            View view3 = this.f78789u;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("followContainer");
                view3 = null;
            }
            view3.setVisibility(8);
            Iterator<T> it = this.f78781m.m83098q().getSeatList().getValue().iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                    userID2 = ((SeatInfo) next).getUserInfo().getUserID();
                    LiveUserInfo liveUserInfo = this.f78782n;
                    if (liveUserInfo != null) {
                        userID3 = liveUserInfo.getUserID();
                    } else {
                        userID3 = null;
                    }
                } else {
                    next = null;
                    break;
                }
            } while (!Intrinsics.areEqual(userID2, userID3));
            SeatInfo seatInfo = (SeatInfo) next;
            if (seatInfo != null && (userInfo2 = seatInfo.getUserInfo()) != null && !userInfo2.getAllowOpenCamera()) {
                z11 = true;
            } else {
                z11 = false;
            }
            m81074B0(z11);
            for (Object obj2 : this.f78781m.m83098q().getSeatList().getValue()) {
                String userID4 = ((SeatInfo) obj2).getUserInfo().getUserID();
                LiveUserInfo liveUserInfo2 = this.f78782n;
                if (liveUserInfo2 != null) {
                    userID = liveUserInfo2.getUserID();
                } else {
                    userID = null;
                }
                if (Intrinsics.areEqual(userID4, userID)) {
                    obj = obj2;
                    break;
                }
            }
            SeatInfo seatInfo2 = (SeatInfo) obj;
            if (seatInfo2 != null && (userInfo = seatInfo2.getUserInfo()) != null && !userInfo.getAllowOpenMicrophone()) {
                z12 = true;
            }
            m81076E0(z12);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m81076E0(boolean z11) {
        Object next;
        DeviceStatus microphoneStatus;
        SeatUserInfo userInfo;
        String userID;
        String userID2;
        int i11;
        int i12;
        TextView textView = null;
        if (!m81062i0()) {
            if (m81061h0()) {
                View view = this.f78791w;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("audioContainer");
                    view = null;
                }
                view.setEnabled(true);
                ImageView imageView = this.f78793y;
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ivAudio");
                    imageView = null;
                }
                imageView.setAlpha(1.0f);
                ImageView imageView2 = this.f78793y;
                if (imageView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ivAudio");
                    imageView2 = null;
                }
                if (z11) {
                    i11 = R$drawable.livekit_ic_disable_audio;
                } else {
                    i11 = R$drawable.livekit_ic_unmute_audio;
                }
                imageView2.setImageResource(i11);
                TextView textView2 = this.f78794z;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvAudio");
                } else {
                    textView = textView2;
                }
                if (z11) {
                    i12 = R$string.common_enable_audio;
                } else {
                    i12 = R$string.common_disable_audio;
                }
                textView.setText(i12);
                return;
            }
            return;
        }
        if (z11) {
            View view2 = this.f78791w;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audioContainer");
                view2 = null;
            }
            view2.setEnabled(false);
            ImageView imageView3 = this.f78793y;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivAudio");
                imageView3 = null;
            }
            imageView3.setAlpha(0.24f);
            ImageView imageView4 = this.f78793y;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivAudio");
                imageView4 = null;
            }
            imageView4.setImageResource(R$drawable.livekit_ic_mute_audio);
            TextView textView3 = this.f78794z;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvAudio");
            } else {
                textView = textView3;
            }
            textView.setText(R$string.common_unmute_audio);
            return;
        }
        View view3 = this.f78791w;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioContainer");
            view3 = null;
        }
        view3.setEnabled(true);
        ImageView imageView5 = this.f78793y;
        if (imageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivAudio");
            imageView5 = null;
        }
        imageView5.setAlpha(1.0f);
        Iterator<T> it = this.f78781m.m83098q().getSeatList().getValue().iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
                userID = ((SeatInfo) next).getUserInfo().getUserID();
                UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
                if (value != null) {
                    userID2 = value.getUserID();
                } else {
                    userID2 = null;
                }
            } else {
                next = null;
                break;
            }
        } while (!Intrinsics.areEqual(userID, userID2));
        SeatInfo seatInfo = (SeatInfo) next;
        if (seatInfo != null && (userInfo = seatInfo.getUserInfo()) != null) {
            microphoneStatus = userInfo.getMicrophoneStatus();
        } else {
            microphoneStatus = null;
        }
        if (microphoneStatus == DeviceStatus.OFF) {
            ImageView imageView6 = this.f78793y;
            if (imageView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivAudio");
                imageView6 = null;
            }
            imageView6.setImageResource(R$drawable.livekit_ic_mute_audio);
            TextView textView4 = this.f78794z;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvAudio");
            } else {
                textView = textView4;
            }
            textView.setText(R$string.common_unmute_audio);
            return;
        }
        ImageView imageView7 = this.f78793y;
        if (imageView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivAudio");
            imageView7 = null;
        }
        imageView7.setImageResource(R$drawable.livekit_ic_unmute_audio);
        TextView textView5 = this.f78794z;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvAudio");
        } else {
            textView = textView5;
        }
        textView.setText(R$string.common_mute_audio);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m81052X();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m81069v0();
    }
}
