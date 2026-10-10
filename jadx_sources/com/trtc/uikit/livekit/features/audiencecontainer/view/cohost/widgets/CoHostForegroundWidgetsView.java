package com.trtc.uikit.livekit.features.audiencecontainer.view.cohost.widgets;

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

/* JADX INFO: compiled from: CoHostForegroundWidgetsView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011J\b\u0010\u0017\u001a\u00020\u0013H\u0014J\b\u0010\u0018\u001a\u00020\u0013H\u0014J\b\u0010\u0019\u001a\u00020\u0013H\u0002J\b\u0010\u001a\u001a\u00020\u0013H\u0002J\b\u0010\u001b\u001a\u00020\u0013H\u0014J\b\u0010\u001c\u001a\u00020\u0013H\u0014J\b\u0010\u001d\u001a\u00020\u0013H\u0002J\b\u0010\u001e\u001a\u00020\u0013H\u0002J\b\u0010\u001f\u001a\u00020\u0013H\u0002J\b\u0010 \u001a\u00020!H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/cohost/widgets/CoHostForegroundWidgetsView;", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "layoutUserInfo", "Landroid/widget/LinearLayout;", "textName", "Landroid/widget/TextView;", "imageMuteAudio", "Landroid/widget/ImageView;", "seatUserInfo", "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;", "init", "", "manager", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;", "seatInfo", "initView", "refreshView", "initMuteAudioView", "initUserNameView", "addObserver", "removeObserver", "onCoGuestChange", "onCoHostChange", "updateVisibility", "isShowUserInfo", "", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CoHostForegroundWidgetsView extends BasicView {

    /* JADX INFO: renamed from: w */
    @NotNull
    public static final Companion f78909w = new Companion(null);

    /* JADX INFO: renamed from: x */
    @NotNull
    public static final LiveKitLogger f78910x = LiveKitLogger.f77564c.getLiveStreamLogger("CoHostWidgetsView");

    /* JADX INFO: renamed from: s */
    public LinearLayout f78911s;

    /* JADX INFO: renamed from: t */
    public TextView f78912t;

    /* JADX INFO: renamed from: u */
    public ImageView f78913u;

    /* JADX INFO: renamed from: v */
    @NotNull
    public SeatUserInfo f78914v;

    /* JADX INFO: compiled from: CoHostForegroundWidgetsView.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/cohost/widgets/CoHostForegroundWidgetsView$Companion;", "", "<init>", "()V", "LOGGER", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CoHostForegroundWidgetsView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CoHostForegroundWidgetsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: l */
    private final void m81211l() {
        ImageView imageView = this.f78913u;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageMuteAudio");
            imageView = null;
        }
        imageView.setVisibility(this.f78914v.getMicrophoneStatus() == DeviceStatus.ON ? 8 : 0);
    }

    /* JADX INFO: renamed from: k */
    public final void m81217k(@NotNull C37144f manager, @NotNull SeatUserInfo seatInfo) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(seatInfo, "seatInfo");
        f78910x.m79404b("init userId:" + seatInfo.getUserID() + ",liveID:" + seatInfo.getLiveID());
        this.f78914v = seatInfo;
        super.mo80950b(manager);
    }

    public /* synthetic */ CoHostForegroundWidgetsView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: m */
    private final void m81212m() {
        String userName;
        TextView textView = null;
        if (m81213n()) {
            LinearLayout linearLayout = this.f78911s;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutUserInfo");
                linearLayout = null;
            }
            linearLayout.setVisibility(0);
        } else {
            LinearLayout linearLayout2 = this.f78911s;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutUserInfo");
                linearLayout2 = null;
            }
            linearLayout2.setVisibility(8);
        }
        TextView textView2 = this.f78912t;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textName");
        } else {
            textView = textView2;
        }
        if (TextUtils.isEmpty(this.f78914v.getUserName())) {
            userName = this.f78914v.getUserID();
        } else {
            userName = this.f78914v.getUserName();
        }
        textView.setText(userName);
    }

    /* JADX INFO: renamed from: n */
    private final boolean m81213n() {
        if (getAudienceStore().m83091j().getConnected().getValue().size() > 1 || getAudienceStore().m83089h().getConnected().getValue().size() > 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final void m81214o() {
        m81212m();
        m81216q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final void m81215p() {
        m81212m();
        m81216q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final void m81216q() {
        int i11;
        if (getMediaState().m83111e().getValue().booleanValue()) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        setVisibility(i11);
    }

    @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.BasicView
    /* JADX INFO: renamed from: a */
    public void mo80889a() {
        setSubscribeStateJob(C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new CoHostForegroundWidgetsView$addObserver$1(this, null), 3, null));
    }

    @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.BasicView
    /* JADX INFO: renamed from: c */
    public void mo80892c() {
        LayoutInflater.from(getContext()).inflate(R$layout.livekit_co_guest_foreground_widgets_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.ll_user_info);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f78911s = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.iv_mute_audio);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f78913u = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.tv_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f78912t = (TextView) viewFindViewById3;
    }

    @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.BasicView
    /* JADX INFO: renamed from: d */
    public void mo80951d() {
        m81212m();
        m81211l();
    }

    @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.BasicView
    /* JADX INFO: renamed from: e */
    public void mo80896e() {
        InterfaceC41775x1 f78705q = getF78705q();
        if (f78705q != null) {
            InterfaceC41775x1.a.m91377a(f78705q, null, 1, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CoHostForegroundWidgetsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f78914v = new SeatUserInfo(null, null, null, null, null, null, false, null, false, null, 1023, null);
    }
}
