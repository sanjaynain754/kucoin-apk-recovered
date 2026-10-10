package com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.features.audiencecontainer.view.BasicView;
import ee0.C37144f;
import io.trtc.tuikit.atomicx.widget.basicwidget.avatar.AtomicAvatar;
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

/* JADX INFO: compiled from: CoGuestBackgroundWidgetsView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bJ\b\u0010\u0013\u001a\u00020\u000fH\u0014J\b\u0010\u0014\u001a\u00020\u000fH\u0014J\b\u0010\u0015\u001a\u00020\u000fH\u0014J\b\u0010\u0016\u001a\u00020\u000fH\u0014J\u0017\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0002\u0010\u001aR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/widgets/CoGuestBackgroundWidgetsView;", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "seatUserInfo", "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;", "imageAvatar", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;", "init", "", "manager", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;", "userInfo", "initView", "refreshView", "addObserver", "removeObserver", "onPictureInPictureObserver", "isPipMode", "", "(Ljava/lang/Boolean;)V", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CoGuestBackgroundWidgetsView extends BasicView {

    /* JADX INFO: renamed from: u */
    @NotNull
    public static final Companion f78890u = new Companion(null);

    /* JADX INFO: renamed from: v */
    @NotNull
    public static final LiveKitLogger f78891v = LiveKitLogger.f77564c.getFeaturesLogger("coGuest-BackgroundWidgetsView");

    /* JADX INFO: renamed from: s */
    @NotNull
    public SeatUserInfo f78892s;

    /* JADX INFO: renamed from: t */
    public AtomicAvatar f78893t;

    /* JADX INFO: compiled from: CoGuestBackgroundWidgetsView.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/widgets/CoGuestBackgroundWidgetsView$Companion;", "", "<init>", "()V", "LOGGER", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CoGuestBackgroundWidgetsView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CoGuestBackgroundWidgetsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final void m81182i(Boolean bool) {
        setVisibility(Intrinsics.areEqual(bool, Boolean.TRUE) ? 8 : 0);
    }

    @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.BasicView
    /* JADX INFO: renamed from: d */
    public void mo80951d() {
        AtomicAvatar atomicAvatar = this.f78893t;
        if (atomicAvatar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageAvatar");
            atomicAvatar = null;
        }
        atomicAvatar.setContent(new AtomicAvatar.AbstractC39363b.URL(this.f78892s.getAvatarURL(), R$drawable.livekit_ic_avatar));
    }

    /* JADX INFO: renamed from: h */
    public final void m81183h(@NotNull C37144f manager, @NotNull SeatUserInfo userInfo) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        f78891v.m79404b("init userId:" + userInfo.getUserID());
        this.f78892s = userInfo;
        super.mo80950b(manager);
    }

    public /* synthetic */ CoGuestBackgroundWidgetsView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.BasicView
    /* JADX INFO: renamed from: a */
    public void mo80889a() {
        setSubscribeStateJob(C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new CoGuestBackgroundWidgetsView$addObserver$1(this, null), 3, null));
    }

    @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.BasicView
    /* JADX INFO: renamed from: c */
    public void mo80892c() {
        LayoutInflater.from(getContext()).inflate(R$layout.livekit_co_guest_background_widgets_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.iv_avatar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f78893t = (AtomicAvatar) viewFindViewById;
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
    public CoGuestBackgroundWidgetsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f78892s = new SeatUserInfo(null, null, null, null, null, null, false, null, false, null, 1023, null);
    }
}
