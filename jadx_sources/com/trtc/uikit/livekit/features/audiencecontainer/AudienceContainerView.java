package com.trtc.uikit.livekit.features.audiencecontainer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.TUICore;
import com.tencent.qcloud.tuicore.interfaces.ITUINotification;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.features.audiencecontainer.store.AudienceContainerStore;
import com.trtc.uikit.livekit.features.audiencecontainer.store.LiveInfoListStore;
import com.trtc.uikit.livekit.features.audiencecontainer.store.access.TUILiveListDataSource;
import com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView;
import com.trtc.uikit.livekit.features.audiencecontainer.view.liveListviewpager.LiveListViewPager;
import com.trtc.uikit.livekit.features.audiencecontainer.view.liveListviewpager.LiveListViewPagerAdapter;
import de0.InterfaceC36664a;
import de0.InterfaceC36667d;
import ee0.C37139a;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AudienceContainerView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 @2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001@B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001fJ\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!J\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$J\u000e\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u0017J\u000e\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u0017J\u000e\u0010*\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u0017J\u000e\u0010+\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u0017J\u000e\u0010,\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u0017J\u000e\u0010-\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u0017J\u000e\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\u0017J\u0006\u00100\u001a\u00020\u001dJ\u0006\u00101\u001a\u00020\u0017J\b\u00102\u001a\u00020\u001bH\u0014J\b\u00103\u001a\u00020\u001bH\u0014J\u0010\u00104\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u00105\u001a\u00020\u001bH\u0016J\b\u00106\u001a\u00020\u001bH\u0016J.\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u001d2\u0014\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020<\u0018\u00010;H\u0016J\u0006\u0010=\u001a\u00020\u001bJ\u001e\u0010>\u001a\u00020\u001b2\u0014\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020<\u0018\u00010;H\u0002J\b\u0010?\u001a\u00020\u001bH\u0002R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/AudienceContainerView;", "Landroid/widget/FrameLayout;", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$ViewObserver;", "Lcom/tencent/qcloud/tuicore/interfaces/ITUINotification;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "liveListViewPager", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPager;", "liveListViewPagerAdapter", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter;", "audienceView", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;", "audienceContainerManager", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceContainerStore;", "isLandscape", "", "isLoading", "isLinking", "init", "", "roomId", "", "liveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", KlineFlutterMiniConstants.PROP_DATA_SOURCE, "Lcom/trtc/uikit/livekit/features/audiencecontainer/AudienceContainerViewDefine$LiveListDataSource;", "addListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/trtc/uikit/livekit/features/audiencecontainer/AudienceContainerViewDefine$AudienceContainerViewListener;", "removeListener", "setScreenOrientation", "isPortrait", "disableSliding", "disable", "disableHeaderFloatWin", "disableHeaderLiveData", "disableHeaderVisitorCnt", "disableFooterCoGuest", "enablePictureInPictureMode", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "getRoomId", "isLiveStreaming", "onAttachedToWindow", "onDetachedFromWindow", "createAudienceView", "onLoading", "onFinished", "onNotifyEvent", "key", "subKey", "param", "", "", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "onLinkStatusChanged", "enableSliding", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AudienceContainerView extends FrameLayout implements AudienceView.InterfaceC36209b, ITUINotification {

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final Companion f78539j = new Companion(null);

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final LiveKitLogger f78540k = LiveKitLogger.f77564c.getLiveStreamLogger("AudienceContainerView");

    /* JADX INFO: renamed from: b */
    @Nullable
    public FragmentActivity f78541b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final LiveListViewPager f78542c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public LiveListViewPagerAdapter f78543d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public AudienceView f78544e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final AudienceContainerStore f78545f;

    /* JADX INFO: renamed from: g */
    public boolean f78546g;

    /* JADX INFO: renamed from: h */
    public boolean f78547h;

    /* JADX INFO: renamed from: i */
    public boolean f78548i;

    /* JADX INFO: compiled from: AudienceContainerView.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/AudienceContainerView$Companion;", "", "<init>", "()V", "LOGGER", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.AudienceContainerView$a */
    /* JADX INFO: compiled from: AudienceContainerView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\t\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\f"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/AudienceContainerView$init$1", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter;", "onCreateView", "Landroid/view/View;", "liveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "onViewWillSlideIn", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onViewSlideInCancelled", "onViewDidSlideIn", "onViewDidSlideOut", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36197a extends LiveListViewPagerAdapter {

        /* JADX INFO: renamed from: p */
        public final /* synthetic */ AudienceContainerView f78549p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36197a(FragmentActivity fragmentActivity, LiveInfoListStore liveInfoListStore, LiveInfo liveInfo, AudienceContainerView audienceContainerView) {
            super(fragmentActivity, liveInfoListStore, liveInfo);
            this.f78549p = audienceContainerView;
        }

        @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.liveListviewpager.LiveListViewPagerAdapter
        /* JADX INFO: renamed from: o */
        public View mo80738o(LiveInfo liveInfo) {
            Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
            return this.f78549p.m80727h(liveInfo);
        }

        @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.liveListviewpager.LiveListViewPagerAdapter
        /* JADX INFO: renamed from: p */
        public void mo80739p(View view) {
            AudienceContainerView audienceContainerView = this.f78549p;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView");
            audienceContainerView.f78544e = (AudienceView) view;
            AudienceView audienceView = this.f78549p.f78544e;
            if (audienceView != null) {
                audienceView.m80876J0();
            }
            AudienceView audienceView2 = this.f78549p.f78544e;
            if (audienceView2 != null) {
                audienceView2.setViewObserver(this.f78549p);
            }
            AudienceView audienceView3 = this.f78549p.f78544e;
            if (audienceView3 != null) {
                audienceView3.setAudienceContainerViewListenerList(this.f78549p.f78545f.getF78551a());
            }
            AudienceView audienceView4 = this.f78549p.f78544e;
            if (audienceView4 != null) {
                audienceView4.m80882S0();
            }
        }

        @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.liveListviewpager.LiveListViewPagerAdapter
        /* JADX INFO: renamed from: q */
        public void mo80740q(View view) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView");
            AudienceView audienceView = (AudienceView) view;
            audienceView.setViewObserver(null);
            audienceView.m80883T0();
        }

        @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.liveListviewpager.LiveListViewPagerAdapter
        /* JADX INFO: renamed from: r */
        public void mo80741r(View view) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView");
            ((AudienceView) view).m80923u1();
        }

        @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.liveListviewpager.LiveListViewPagerAdapter
        /* JADX INFO: renamed from: t */
        public void mo80742t(View view) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView");
            ((AudienceView) view).m80920r1();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AudienceContainerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView.InterfaceC36209b
    /* JADX INFO: renamed from: a */
    public void mo80724a() {
        this.f78547h = false;
        m80732m();
    }

    @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView.InterfaceC36209b
    /* JADX INFO: renamed from: b */
    public void mo80725b() {
        this.f78547h = true;
        m80732m();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AudienceContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: g */
    public final void m80726g(@NotNull InterfaceC36664a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        f78540k.m79404b("addListener listener:" + listener);
        this.f78545f.m80743a(listener);
    }

    @NotNull
    public final String getRoomId() {
        String roomId;
        AudienceView audienceView = this.f78544e;
        return (audienceView == null || (roomId = audienceView.getRoomId()) == null) ? "" : roomId;
    }

    /* JADX INFO: renamed from: h */
    public final AudienceView m80727h(LiveInfo liveInfo) {
        FragmentActivity fragmentActivity = this.f78541b;
        Intrinsics.checkNotNull(fragmentActivity);
        AudienceView audienceView = new AudienceView(fragmentActivity, null, 0, 6, null);
        audienceView.m80905i0(liveInfo);
        return audienceView;
    }

    /* JADX INFO: renamed from: i */
    public final void m80728i() {
        AudienceView audienceView = this.f78544e;
        if (audienceView != null) {
            audienceView.m80883T0();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m80729j(boolean z11) {
        AudienceContainerStore.f78550b.disableHeaderFloatWin(z11);
    }

    /* JADX INFO: renamed from: k */
    public final void m80730k(boolean z11) {
        LiveListViewPagerAdapter liveListViewPagerAdapter;
        AudienceContainerStore.f78550b.disableSliding(z11);
        if (!z11 || (liveListViewPagerAdapter = this.f78543d) == null) {
            return;
        }
        liveListViewPagerAdapter.m81264v();
    }

    /* JADX INFO: renamed from: l */
    public final void m80731l(boolean z11) {
        AudienceView audienceView = this.f78544e;
        if (audienceView != null) {
            audienceView.m80899f0(z11);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m80732m() {
        if (C37139a.f82409a.m83071e().getValue().booleanValue()) {
            return;
        }
        this.f78542c.m81240n((this.f78548i || this.f78547h || this.f78546g) ? false : true);
    }

    /* JADX INFO: renamed from: n */
    public final void m80733n(@NotNull FragmentActivity fragmentActivity, @NotNull LiveInfo liveInfo) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        this.f78541b = fragmentActivity;
        m80734o(fragmentActivity, liveInfo, new TUILiveListDataSource());
    }

    /* JADX INFO: renamed from: o */
    public final void m80734o(@NotNull FragmentActivity fragmentActivity, @NotNull LiveInfo liveInfo, @NotNull InterfaceC36667d dataSource) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f78541b = fragmentActivity;
        C36197a c36197a = new C36197a(fragmentActivity, new LiveInfoListStore(dataSource), liveInfo, this);
        this.f78543d = c36197a;
        LiveListViewPager liveListViewPager = this.f78542c;
        Intrinsics.checkNotNull(c36197a);
        liveListViewPager.setAdapter(c36197a);
        LiveListViewPagerAdapter liveListViewPagerAdapter = this.f78543d;
        if (liveListViewPagerAdapter != null) {
            liveListViewPagerAdapter.m81259l();
        }
    }

    @Override // com.tencent.qcloud.tuicore.interfaces.ITUINotification
    public void onNotifyEvent(@NotNull String key, @NotNull String subKey, @Nullable Map<String, ? extends Object> param) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(subKey, "subKey");
        if (Intrinsics.areEqual("EVENT_SUB_KEY_LINK_STATUS_CHANGE", subKey)) {
            m80736q(param);
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m80735p() {
        AudienceView audienceView = this.f78544e;
        if (audienceView != null) {
            return audienceView.getF78650m0();
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final void m80736q(Map<String, ? extends Object> map) {
        if (C37139a.f82409a.m83071e().getValue().booleanValue() || map == null) {
            return;
        }
        Object obj = map.get("EVENT_PARAMS_IS_LINKING");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            this.f78548i = bool.booleanValue();
            m80732m();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m80737r(@NotNull InterfaceC36664a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        f78540k.m79404b("removeListener listener:" + listener);
        this.f78545f.m80745c(listener);
    }

    public final void setScreenOrientation(boolean isPortrait) {
        this.f78546g = !isPortrait;
        m80732m();
    }

    public /* synthetic */ AudienceContainerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TUICore.registerEvent("EVENT_KEY_LIVE_KIT", "EVENT_SUB_KEY_LINK_STATUS_CHANGE", this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        TUICore.unRegisterEvent("EVENT_KEY_LIVE_KIT", "EVENT_SUB_KEY_LINK_STATUS_CHANGE", this);
        AudienceView audienceView = this.f78544e;
        if (audienceView != null) {
            audienceView.m80883T0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AudienceContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        LiveListViewPager liveListViewPager = new LiveListViewPager(context, null, 0, 6, null);
        this.f78542c = liveListViewPager;
        this.f78545f = new AudienceContainerStore();
        addView(liveListViewPager);
    }
}
