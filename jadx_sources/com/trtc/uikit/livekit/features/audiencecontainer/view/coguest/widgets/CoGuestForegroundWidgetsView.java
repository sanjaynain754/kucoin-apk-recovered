package com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.widgets;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.features.audiencecontainer.view.BasicView;
import ee0.C37144f;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CoGuestForegroundWidgetsView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 $2\u00020\u0001:\u0001$B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011J\b\u0010\u0017\u001a\u00020\u0013H\u0014J\b\u0010\u0018\u001a\u00020\u0013H\u0014J\b\u0010\u0019\u001a\u00020\u0013H\u0002J\b\u0010\u001a\u001a\u00020\u0013H\u0002J\b\u0010\u001b\u001a\u00020\u0013H\u0014J\b\u0010\u001c\u001a\u00020\u0013H\u0014J\b\u0010\u001d\u001a\u00020\u0013H\u0002J\b\u0010\u001e\u001a\u00020\u0013H\u0002J\u0017\u0010\u001f\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020!H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/widgets/CoGuestForegroundWidgetsView;", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "layoutUserInfo", "Landroid/widget/LinearLayout;", "textName", "Landroid/widget/TextView;", "imageMuteAudio", "Landroid/widget/ImageView;", "seatUserInfo", "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;", "init", "", "manager", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;", "userInfo", "initView", "refreshView", "initMuteAudioView", "initUserNameView", "addObserver", "removeObserver", "onCoGuestChange", "onCoHostChange", "onPictureInPictureObserver", "isPipMode", "", "(Ljava/lang/Boolean;)V", "isShowUserInfo", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CoGuestForegroundWidgetsView extends BasicView {

    /* JADX INFO: renamed from: w */
    @NotNull
    public static final Companion f78895w = new Companion(null);

    /* JADX INFO: renamed from: x */
    @NotNull
    public static final LiveKitLogger f78896x = LiveKitLogger.f77564c.getLiveStreamLogger("CoGuestWidgetsView");

    /* JADX INFO: renamed from: s */
    public LinearLayout f78897s;

    /* JADX INFO: renamed from: t */
    public TextView f78898t;

    /* JADX INFO: renamed from: u */
    public ImageView f78899u;

    /* JADX INFO: renamed from: v */
    @NotNull
    public SeatUserInfo f78900v;

    /* JADX INFO: compiled from: CoGuestForegroundWidgetsView.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/widgets/CoGuestForegroundWidgetsView$Companion;", "", "<init>", "()V", "LOGGER", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CoGuestForegroundWidgetsView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CoGuestForegroundWidgetsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final void m81190q(Boolean bool) {
        setVisibility(Intrinsics.areEqual(bool, Boolean.TRUE) ? 8 : 0);
    }

    /* JADX INFO: renamed from: k */
    public final void m81191k(@NotNull C37144f manager, @NotNull SeatUserInfo userInfo) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        f78896x.m79404b("init userId:" + userInfo.getUserID());
        this.f78900v = userInfo;
        super.mo80950b(manager);
    }

    /* JADX INFO: renamed from: l */
    public final void m81192l() {
        ImageView imageView = this.f78899u;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageMuteAudio");
            imageView = null;
        }
        imageView.setVisibility(this.f78900v.getMicrophoneStatus() == DeviceStatus.ON ? 8 : 0);
    }

    public /* synthetic */ CoGuestForegroundWidgetsView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.BasicView
    /* JADX INFO: renamed from: a */
    public void mo80889a() {
        setSubscribeStateJob(C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new CoGuestForegroundWidgetsView$addObserver$1(this, null), 3, null));
    }

    @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.BasicView
    /* JADX INFO: renamed from: c */
    public void mo80892c() {
        LayoutInflater.from(getContext()).inflate(R$layout.livekit_co_guest_foreground_widgets_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.ll_user_info);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f78897s = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.iv_mute_audio);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f78899u = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.tv_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f78898t = (TextView) viewFindViewById3;
    }

    @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.BasicView
    /* JADX INFO: renamed from: d */
    public void mo80951d() {
        m81193m();
        m81192l();
    }

    @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.BasicView
    /* JADX INFO: renamed from: e */
    public void mo80896e() {
        InterfaceC41775x1 f78705q = getF78705q();
        if (f78705q != null) {
            InterfaceC41775x1.a.m91377a(f78705q, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m81193m() {
        String userName;
        TextView textView = null;
        if (m81194n()) {
            LinearLayout linearLayout = this.f78897s;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutUserInfo");
                linearLayout = null;
            }
            linearLayout.setVisibility(0);
        } else {
            LinearLayout linearLayout2 = this.f78897s;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutUserInfo");
                linearLayout2 = null;
            }
            linearLayout2.setVisibility(8);
        }
        TextView textView2 = this.f78898t;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textName");
        } else {
            textView = textView2;
        }
        if (TextUtils.isEmpty(this.f78900v.getUserName())) {
            userName = this.f78900v.getUserID();
        } else {
            userName = this.f78900v.getUserName();
        }
        textView.setText(userName);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m81194n() {
        if (getAudienceStore().m83091j().getConnected().getValue().size() > 1 || getAudienceStore().m83089h().getConnected().getValue().size() > 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final void m81195o() {
        m81193m();
    }

    /* JADX INFO: renamed from: p */
    public final void m81196p() {
        m81193m();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CoGuestForegroundWidgetsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f78900v = new SeatUserInfo(null, null, null, null, null, null, false, null, false, null, 1023, null);
    }
}
