package com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.panel;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.TUICore;
import com.tencent.qcloud.tuicore.interfaces.ITUINotification;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.common.ErrorLocalized;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.features.anchorboardcast.store.AnchorStore;
import io.trtc.tuikit.atomicx.widget.basicwidget.alertdialog.AtomicAlertDialog;
import io.trtc.tuikit.atomicx.widget.basicwidget.alertdialog.C39361f;
import io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover;
import io.trtc.tuikit.atomicxcore.api.live.BattleInfo;
import io.trtc.tuikit.atomicxcore.api.live.BattleListener;
import io.trtc.tuikit.atomicxcore.api.live.BattleStore;
import io.trtc.tuikit.atomicxcore.api.live.CoHostStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import io.trtc.tuikit.atomicxcore.api.view.LiveCoreView;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import wd0.CoHostAnchor;

/* JADX INFO: compiled from: AnchorCoHostManageDialog.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u009d\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001!\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020$H\u0002J\b\u0010)\u001a\u00020$H\u0002J\u0016\u0010*\u001a\u00020$2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,H\u0003J\u0016\u0010.\u001a\u00020$2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000,H\u0003J\u0016\u00101\u001a\u00020$2\f\u00102\u001a\b\u0012\u0004\u0012\u0002000,H\u0002J\b\u00103\u001a\u00020$H\u0002J\b\u00104\u001a\u00020$H\u0002J\b\u00105\u001a\u00020$H\u0002J\b\u00106\u001a\u00020$H\u0002J\u0010\u00107\u001a\u00020$2\u0006\u00108\u001a\u00020'H\u0002J\b\u00109\u001a\u00020$H\u0002J\b\u0010:\u001a\u00020$H\u0002J\b\u0010;\u001a\u00020$H\u0002J\b\u0010<\u001a\u00020$H\u0002J\b\u0010=\u001a\u00020$H\u0002J\b\u0010>\u001a\u00020$H\u0002J.\u0010?\u001a\u00020$2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020A2\u0014\u0010C\u001a\u0010\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020E\u0018\u00010DH\u0016J\b\u0010F\u001a\u00020$H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\"¨\u0006G"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/cohost/panel/AnchorCoHostManageDialog;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;", "Lcom/tencent/qcloud/tuicore/interfaces/ITUINotification;", "context", "Landroid/content/Context;", "anchorManager", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;", "liveStream", "Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;", "<init>", "(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)V", "logger", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "textConnectedTitle", "Landroid/widget/TextView;", "nestedScrollView", "Landroidx/core/widget/NestedScrollView;", "recyclerConnectedList", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerRecommendList", "anchorConnectedAdapter", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/cohost/panel/AnchorConnectingAdapter;", "anchorRecommendedAdapter", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/cohost/panel/AnchorRecommendedAdapter;", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "textDisconnect", "swipeRefreshLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "textRecommendTitle", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "battleListener", "com/trtc/uikit/livekit/features/anchorboardcast/view/cohost/panel/AnchorCoHostManageDialog$battleListener$1", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/cohost/panel/AnchorCoHostManageDialog$battleListener$1;", "initView", "", "bindViewId", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "addObserver", "removeObserver", "onRecommendListChange", "recommendList", "", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/CoHostAnchor;", "onConnectedUserChange", "seatList", "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;", "onCandidatesChange", "candidatesList", "initRecommendList", "refreshData", "loadMoreData", "initConnectingList", "initBackView", "rootView", "initRefresh", "initRecommendTitle", "initDisconnectView", "initNestedScrollView", "showDisconnectDialog", "disconnect", "onNotifyEvent", "key", "", "subKey", "param", "", "", "onDetachedFromWindow", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
public final class AnchorCoHostManageDialog extends AtomicPopover implements ITUINotification {

    /* JADX INFO: renamed from: A */
    @NotNull
    public final C36141a f78364A;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final AnchorStore f78365m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final LiveCoreView f78366n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final LiveKitLogger f78367o;

    /* JADX INFO: renamed from: p */
    public TextView f78368p;

    /* JADX INFO: renamed from: q */
    public NestedScrollView f78369q;

    /* JADX INFO: renamed from: r */
    public RecyclerView f78370r;

    /* JADX INFO: renamed from: s */
    public RecyclerView f78371s;

    /* JADX INFO: renamed from: t */
    public AnchorConnectingAdapter f78372t;

    /* JADX INFO: renamed from: u */
    public AnchorRecommendedAdapter f78373u;

    /* JADX INFO: renamed from: v */
    public LinearLayoutManager f78374v;

    /* JADX INFO: renamed from: w */
    public TextView f78375w;

    /* JADX INFO: renamed from: x */
    public SwipeRefreshLayout f78376x;

    /* JADX INFO: renamed from: y */
    public TextView f78377y;

    /* JADX INFO: renamed from: z */
    @Nullable
    public InterfaceC41775x1 f78378z;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.panel.AnchorCoHostManageDialog$a */
    /* JADX INFO: compiled from: AnchorCoHostManageDialog.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0016¨\u0006\n"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/view/cohost/panel/AnchorCoHostManageDialog$battleListener$1", "Lio/trtc/tuikit/atomicxcore/api/live/BattleListener;", "onBattleStarted", "", "battleInfo", "Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;", "inviter", "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;", "invitees", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36141a extends BattleListener {
        public C36141a() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.BattleListener
        public void onBattleStarted(BattleInfo battleInfo, SeatUserInfo inviter, List<SeatUserInfo> invitees) {
            Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
            Intrinsics.checkNotNullParameter(inviter, "inviter");
            Intrinsics.checkNotNullParameter(invitees, "invitees");
            if (AnchorCoHostManageDialog.this.isShowing()) {
                AnchorCoHostManageDialog.this.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.panel.AnchorCoHostManageDialog$b */
    /* JADX INFO: compiled from: AnchorCoHostManageDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/view/cohost/panel/AnchorCoHostManageDialog$initNestedScrollView$1", "Landroidx/core/widget/NestedScrollView$OnScrollChangeListener;", "onScrollChange", "", "v", "Landroidx/core/widget/NestedScrollView;", "scrollX", "", "scrollY", "oldScrollX", "oldScrollY", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36145b implements NestedScrollView.OnScrollChangeListener {
        public C36145b() {
        }

        @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
        public void onScrollChange(NestedScrollView v11, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
            Intrinsics.checkNotNullParameter(v11, "v");
            if (scrollY >= v11.getChildAt(0).getMeasuredHeight() - v11.getMeasuredHeight()) {
                Log.d("xander_test", "loadMoreData");
                if (AnchorCoHostManageDialog.this.f78365m.m80233j().getIsLoadMore() || AnchorCoHostManageDialog.this.f78365m.m80233j().getIsLastPage()) {
                    return;
                }
                AnchorCoHostManageDialog.this.m80526d0();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorCoHostManageDialog(@NotNull Context context, @NotNull AnchorStore anchorManager, @NotNull LiveCoreView liveStream) throws Exception {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(anchorManager, "anchorManager");
        Intrinsics.checkNotNullParameter(liveStream, "liveStream");
        this.f78365m = anchorManager;
        this.f78366n = liveStream;
        this.f78367o = LiveKitLogger.f77564c.getFeaturesLogger("AnchorCoHostManageDialog");
        this.f78364A = new C36141a();
        m80509c0();
    }

    /* JADX INFO: renamed from: P */
    private final void m80505P() throws Exception {
        String liveID = LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID();
        BattleStore.INSTANCE.create(liveID).addBattleListener(this.f78364A);
        this.f78378z = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new AnchorCoHostManageDialog$addObserver$1(this, CoHostStore.INSTANCE.create(liveID), null), 3, null);
        TUICore.registerEvent("EVENT_KEY_LIVE_KIT", "EVENT_SUB_KEY_REQUEST_CONNECTION_SUCCESS", this);
    }

    /* JADX INFO: renamed from: b0 */
    public static final void m80508b0(AnchorCoHostManageDialog anchorCoHostManageDialog) {
        anchorCoHostManageDialog.f78365m.getF78176i().m101141a(true);
        SwipeRefreshLayout swipeRefreshLayout = anchorCoHostManageDialog.f78376x;
        if (swipeRefreshLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("swipeRefreshLayout");
            swipeRefreshLayout = null;
        }
        swipeRefreshLayout.setRefreshing(false);
    }

    /* JADX INFO: renamed from: j0 */
    private final void m80512j0() {
        this.f78365m.getF78176i().m101141a(true);
    }

    /* JADX INFO: renamed from: k0 */
    private final void m80513k0() {
        BattleStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID()).removeBattleListener(this.f78364A);
        InterfaceC41775x1 interfaceC41775x1 = this.f78378z;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        TUICore.unRegisterEvent(this);
    }

    /* JADX INFO: renamed from: m0 */
    public static final Unit m80514m0(final AnchorCoHostManageDialog anchorCoHostManageDialog, AtomicAlertDialog.DialogConfig init) {
        Intrinsics.checkNotNullParameter(init, "$this$init");
        String string = anchorCoHostManageDialog.getContext().getString(R$string.common_disconnect_tips);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        C39361f.m88099i(init, string, null, null, false, 8, null);
        String string2 = anchorCoHostManageDialog.getContext().getString(R$string.common_disconnect_cancel);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        C39361f.m88095e(init, string2, null, false, new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.panel.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnchorCoHostManageDialog.m80515n0((Dialog) obj);
            }
        }, 6, null);
        String string3 = anchorCoHostManageDialog.getContext().getString(R$string.common_end_connect);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        C39361f.m88097g(init, string3, null, false, new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.panel.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnchorCoHostManageDialog.m80516o0(this.f78392b, (Dialog) obj);
            }
        }, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n0 */
    public static final Unit m80515n0(Dialog it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o0 */
    public static final Unit m80516o0(AnchorCoHostManageDialog anchorCoHostManageDialog, Dialog it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.dismiss();
        anchorCoHostManageDialog.m80518R();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q */
    public final void m80517Q(View view) {
        View viewFindViewById = view.findViewById(R$id.nsv_scroll_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f78369q = (NestedScrollView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.tv_connected_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f78368p = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.tv_recommend_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f78377y = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R$id.rv_connecting_user_list);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f78370r = (RecyclerView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R$id.rv_recommendation_user_list);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f78371s = (RecyclerView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R$id.srl_recommendation_user_list);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f78376x = (SwipeRefreshLayout) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R$id.tv_disconnect);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f78375w = (TextView) viewFindViewById7;
    }

    /* JADX INFO: renamed from: R */
    public final void m80518R() {
        CoHostStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID()).exitHostConnection(null);
    }

    /* JADX INFO: renamed from: S */
    public final void m80519S(View view) {
        View viewFindViewById = view.findViewById(R$id.iv_back);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.panel.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AnchorCoHostManageDialog.m80506T(this.f78384b, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m80520U() {
        RecyclerView recyclerView = this.f78370r;
        AnchorConnectingAdapter anchorConnectingAdapter = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerConnectedList");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f78372t = new AnchorConnectingAdapter(context, this.f78365m);
        RecyclerView recyclerView2 = this.f78370r;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerConnectedList");
            recyclerView2 = null;
        }
        AnchorConnectingAdapter anchorConnectingAdapter2 = this.f78372t;
        if (anchorConnectingAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("anchorConnectedAdapter");
        } else {
            anchorConnectingAdapter = anchorConnectingAdapter2;
        }
        recyclerView2.setAdapter(anchorConnectingAdapter);
    }

    /* JADX INFO: renamed from: V */
    public final void m80521V() {
        TextView textView = this.f78375w;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textDisconnect");
            textView = null;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.panel.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnchorCoHostManageDialog.m80507W(this.f78386b, view);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public final void m80522X() {
        NestedScrollView nestedScrollView = this.f78369q;
        if (nestedScrollView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nestedScrollView");
            nestedScrollView = null;
        }
        nestedScrollView.setOnScrollChangeListener(new C36145b());
    }

    /* JADX INFO: renamed from: Y */
    public final void m80523Y() {
        this.f78374v = new LinearLayoutManager(getContext(), 1, false);
        RecyclerView recyclerView = this.f78371s;
        AnchorRecommendedAdapter anchorRecommendedAdapter = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerRecommendList");
            recyclerView = null;
        }
        LinearLayoutManager linearLayoutManager = this.f78374v;
        if (linearLayoutManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linearLayoutManager");
            linearLayoutManager = null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f78373u = new AnchorRecommendedAdapter(context, this.f78365m);
        RecyclerView recyclerView2 = this.f78371s;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerRecommendList");
            recyclerView2 = null;
        }
        AnchorRecommendedAdapter anchorRecommendedAdapter2 = this.f78373u;
        if (anchorRecommendedAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("anchorRecommendedAdapter");
        } else {
            anchorRecommendedAdapter = anchorRecommendedAdapter2;
        }
        recyclerView2.setAdapter(anchorRecommendedAdapter);
    }

    /* JADX INFO: renamed from: Z */
    public final void m80524Z() {
        TextView textView = null;
        if (this.f78365m.m80233j().m101136a().getValue().isEmpty()) {
            TextView textView2 = this.f78377y;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textRecommendTitle");
            } else {
                textView = textView2;
            }
            textView.setVisibility(8);
            return;
        }
        TextView textView3 = this.f78377y;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textRecommendTitle");
        } else {
            textView = textView3;
        }
        textView.setVisibility(0);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m80525a0() {
        SwipeRefreshLayout swipeRefreshLayout = this.f78376x;
        if (swipeRefreshLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("swipeRefreshLayout");
            swipeRefreshLayout = null;
        }
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.panel.b
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                AnchorCoHostManageDialog.m80508b0(this.f78385b);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public final void m80526d0() {
        this.f78365m.getF78176i().m101141a(false);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m80527e0(List<SeatUserInfo> list) {
        this.f78367o.m79404b("onCandidatesChange: " + list);
        this.f78365m.getF78176i().m101143c(list);
    }

    @SuppressLint({"NotifyDataSetChanged", "StringFormatMatches"})
    /* JADX INFO: renamed from: f0 */
    public final void m80528f0(final List<SeatUserInfo> list) {
        this.f78365m.getF78176i().m101141a(true);
        TextView textView = this.f78375w;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textDisconnect");
            textView = null;
        }
        textView.post(new Runnable() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.panel.e
            @Override // java.lang.Runnable
            public final void run() {
                AnchorCoHostManageDialog.m80510g0(list, this);
            }
        });
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: h0 */
    public final void m80529h0(final List<CoHostAnchor> list) {
        TextView textView = this.f78377y;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textRecommendTitle");
            textView = null;
        }
        textView.post(new Runnable() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.panel.d
            @Override // java.lang.Runnable
            public final void run() {
                AnchorCoHostManageDialog.m80511i0(list, this);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public final void m80530l0() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AtomicAlertDialog atomicAlertDialog = new AtomicAlertDialog(context, null, 2, null);
        atomicAlertDialog.m88065u(new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.panel.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnchorCoHostManageDialog.m80514m0(this.f78391b, (AtomicAlertDialog.DialogConfig) obj);
            }
        });
        atomicAlertDialog.m88054I();
    }

    @Override // com.tencent.qcloud.tuicore.interfaces.ITUINotification
    public void onNotifyEvent(@NotNull String key, @NotNull String subKey, @Nullable Map<String, ? extends Object> param) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(subKey, "subKey");
        if (TextUtils.equals(key, "EVENT_KEY_LIVE_KIT") && TextUtils.equals(subKey, "EVENT_SUB_KEY_REQUEST_CONNECTION_SUCCESS")) {
            if (param == null) {
                ErrorLocalized.f77561a.onError(TUILiveConnectionManager.ConnectionCode.UNKNOWN.getValue());
                return;
            }
            Object value = param.entrySet().iterator().next().getValue();
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager.ConnectionCode");
            ErrorLocalized.f77561a.onError(((TUILiveConnectionManager.ConnectionCode) value).getValue());
        }
    }

    /* JADX INFO: renamed from: T */
    public static final void m80506T(AnchorCoHostManageDialog anchorCoHostManageDialog, View view) {
        anchorCoHostManageDialog.dismiss();
    }

    /* JADX INFO: renamed from: W */
    public static final void m80507W(AnchorCoHostManageDialog anchorCoHostManageDialog, View view) {
        anchorCoHostManageDialog.m80530l0();
    }

    /* JADX INFO: renamed from: c0 */
    private final void m80509c0() throws Exception {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.livekit_layout_anchor_connection_manager_panel, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate);
        m80517Q(viewInflate);
        m80519S(viewInflate);
        m80525a0();
        m80520U();
        m80524Z();
        m80523Y();
        m80521V();
        m80522X();
        m80512j0();
        m88181q(viewInflate);
        m80505P();
    }

    /* JADX INFO: renamed from: g0 */
    public static final void m80510g0(List list, AnchorCoHostManageDialog anchorCoHostManageDialog) {
        AnchorConnectingAdapter anchorConnectingAdapter = null;
        if (list.isEmpty()) {
            TextView textView = anchorCoHostManageDialog.f78375w;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textDisconnect");
                textView = null;
            }
            textView.setVisibility(8);
            TextView textView2 = anchorCoHostManageDialog.f78368p;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textConnectedTitle");
                textView2 = null;
            }
            textView2.setVisibility(8);
        } else {
            TextView textView3 = anchorCoHostManageDialog.f78375w;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textDisconnect");
                textView3 = null;
            }
            textView3.setVisibility(0);
            TextView textView4 = anchorCoHostManageDialog.f78368p;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textConnectedTitle");
                textView4 = null;
            }
            textView4.setVisibility(0);
            TextView textView5 = anchorCoHostManageDialog.f78368p;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textConnectedTitle");
                textView5 = null;
            }
            textView5.setText(anchorCoHostManageDialog.getContext().getString(R$string.common_connection_list_title, Integer.valueOf(list.size() - 1)));
        }
        AnchorConnectingAdapter anchorConnectingAdapter2 = anchorCoHostManageDialog.f78372t;
        if (anchorConnectingAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("anchorConnectedAdapter");
            anchorConnectingAdapter2 = null;
        }
        anchorConnectingAdapter2.m80537j(list);
        AnchorConnectingAdapter anchorConnectingAdapter3 = anchorCoHostManageDialog.f78372t;
        if (anchorConnectingAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("anchorConnectedAdapter");
        } else {
            anchorConnectingAdapter = anchorConnectingAdapter3;
        }
        anchorConnectingAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m80511i0(List list, AnchorCoHostManageDialog anchorCoHostManageDialog) {
        AnchorRecommendedAdapter anchorRecommendedAdapter = null;
        if (list.isEmpty()) {
            TextView textView = anchorCoHostManageDialog.f78377y;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textRecommendTitle");
                textView = null;
            }
            textView.setVisibility(8);
        } else {
            TextView textView2 = anchorCoHostManageDialog.f78377y;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textRecommendTitle");
                textView2 = null;
            }
            textView2.setVisibility(0);
        }
        AnchorRecommendedAdapter anchorRecommendedAdapter2 = anchorCoHostManageDialog.f78373u;
        if (anchorRecommendedAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("anchorRecommendedAdapter");
            anchorRecommendedAdapter2 = null;
        }
        anchorRecommendedAdapter2.m80551r(list);
        AnchorRecommendedAdapter anchorRecommendedAdapter3 = anchorCoHostManageDialog.f78373u;
        if (anchorRecommendedAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("anchorRecommendedAdapter");
        } else {
            anchorRecommendedAdapter = anchorRecommendedAdapter3;
        }
        anchorRecommendedAdapter.notifyDataSetChanged();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m80513k0();
    }
}
