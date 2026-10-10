package com.kubi.home.widgets.feed;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.flutter.C23767n;
import com.kubi.sdk.flutter.KCFlutterRouteManager;
import com.kubi.user.api.IUserService;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p233ej.C37201i;
import p607rv.C44177a;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: HomeFeedActionLayout.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rJ\u0006\u0010\u0013\u001a\u00020\u0011J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0002J\b\u0010\u001a\u001a\u00020\u0011H\u0002J\b\u0010\u001b\u001a\u00020\u0007H\u0002J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/home/widgets/feed/HomeFeedActionLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "curTabCode", "", "curVisible", "", "actionBtn", "Landroidx/appcompat/widget/AppCompatImageView;", "updateVisible", "", TIMPushProvider.f75062n, "onPageHide", "bindFlowEvent", TUIConstants.TUIChat.OWNER, "Landroidx/lifecycle/LifecycleOwner;", "onTabPositionChange", "onActionBtnClick", "onClickActionLive", "onClickActionAdd", "getHomeViewDistanceToBottomWindow", "findHomeRootView", "Landroid/view/View;", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeFeedActionLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFeedActionLayout.kt\ncom/kubi/home/widgets/feed/HomeFeedActionLayout\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n76#2,7:184\n76#2,7:191\n153#2,7:198\n153#2,7:205\n1#3:212\n*S KotlinDebug\n*F\n+ 1 HomeFeedActionLayout.kt\ncom/kubi/home/widgets/feed/HomeFeedActionLayout\n*L\n83#1:184,7\n88#1:191,7\n92#1:198,7\n96#1:205,7\n*E\n"})
public final class HomeFeedActionLayout extends FrameLayout {

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Companion f26717e = new Companion(null);

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f26718b;

    /* JADX INFO: renamed from: c */
    public boolean f26719c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public AppCompatImageView f26720d;

    /* JADX INFO: compiled from: HomeFeedActionLayout.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/home/widgets/feed/HomeFeedActionLayout$Companion;", "", "<init>", "()V", "TAG", "", "FEED_TASK_DIALOG_ROUTER", "PAGE_KEY", "PAGE_HOME", "PAGE_FOLLOW", "RN_ROUTER", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeFeedActionLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeFeedActionLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m31130k(HomeFeedActionLayout homeFeedActionLayout) {
        C37201i c37201i = C37201i.f82500a;
        Map mapMapOf = MapsKt.mapOf(TuplesKt.m90091to("pageType", c37201i.m83235y(homeFeedActionLayout.f26718b) ? "followFeed" : "homeFeed"));
        String string = new JSONObject(mapMapOf).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (c37201i.m83230s()) {
            RouteExKt.m56217H("krn/router?biz=home&entry=main&component=home_rn_app&route=PostEntrySheet&needLogin=true&transparent=true&appPresent=presentmodal&params=" + mapMapOf);
        } else {
            KCFlutterRouteManager.m56840m(KCFlutterRouteManager.f46704a, "/home/feed/add_post?isTransparent=true&params=" + Uri.encode(string), null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m31131m() {
        C44128b.m97258b("[onClickActionLive] jump");
        C23767n.m56881e();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public final void m31132g(LifecycleOwner lifecycleOwner) {
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_feed_tab_change".length();
        }
        C12572a.m23692a(lifecycleOwner, false, new C15105x92be36eb("com.kubi.home.feed.QuoteEvent:home_feed_tab_change", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_feed_flutter_tab_change".length();
        }
        C12572a.m23692a(lifecycleOwner, false, new C15106x92be36ec("com.kubi.home.feed.QuoteEvent:home_feed_flutter_tab_change", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_feed_tab_changed".length();
        }
        C12572a.m23692a(lifecycleOwner, false, new C15107x92be36ed("com.kubi.home.feed.QuoteEvent:home_feed_tab_changed", null, this));
        if (c12573b.m23696a()) {
            "feed_flutter_distance_home_feed_request".length();
        }
        C12572a.m23692a(lifecycleOwner, false, new C15108x92be36ee("feed_flutter_distance_home_feed_request", null, this));
    }

    /* JADX INFO: renamed from: i */
    public final void m31134i() throws JSONException {
        HomeFeedPopup.f26740a.m31168b();
        C37201i c37201i = C37201i.f82500a;
        if (c37201i.m83236z(this.f26718b)) {
            m31136l();
        } else if (c37201i.m83235y(this.f26718b) || c37201i.m83234x(this.f26718b)) {
            m31135j();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m31135j() {
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: com.kubi.home.widgets.feed.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeFeedActionLayout.m31130k(this.f26737b);
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: renamed from: l */
    public final void m31136l() throws JSONException {
        C44128b.m97258b("[onClickActionLive] start");
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: com.kubi.home.widgets.feed.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeFeedActionLayout.m31131m();
            }
        }, 1, (Object) null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b("B1HomepageFeedLive", "liveApplyBtn", null, jSONObject, 4, null);
    }

    /* JADX INFO: renamed from: n */
    public final void m31137n() {
        HomeFeedPopup.f26740a.m31168b();
    }

    /* JADX INFO: renamed from: o */
    public final void m31138o() {
        C37201i c37201i = C37201i.f82500a;
        this.f26718b = c37201i.m83226o();
        C44128b.m97259c("HomeFeedActionLayout", "[onTabPositionChange] curTabCode:" + this.f26718b);
        Integer numM83225n = c37201i.m83225n(this.f26718b);
        if (numM83225n != null) {
            this.f26720d.setImageResource(numM83225n.intValue());
        }
        m31139p(this.f26719c);
    }

    /* JADX INFO: renamed from: p */
    public final void m31139p(boolean z11) {
        int i11;
        this.f26719c = z11;
        if (z11 && C37201i.f82500a.m83220i(this.f26718b)) {
            HomeFeedPopup homeFeedPopup = HomeFeedPopup.f26740a;
            Context context = getContext();
            homeFeedPopup.m31169c(context instanceof FragmentActivity ? (FragmentActivity) context : null);
            i11 = 0;
        } else {
            HomeFeedPopup.f26740a.m31168b();
            i11 = 8;
        }
        setVisibility(i11);
    }

    public /* synthetic */ HomeFeedActionLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m31127d(HomeFeedActionLayout homeFeedActionLayout) throws JSONException {
        homeFeedActionLayout.m31134i();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getHomeViewDistanceToBottomWindow() {
        return C44177a.f97517a.m97396a(m31133h());
    }

    /* JADX INFO: renamed from: h */
    public final View m31133h() {
        View view;
        Object parent = getParent();
        if (parent instanceof View) {
            view = (View) parent;
        } else {
            view = null;
        }
        if (view == null || view.getId() != R$id.homeRootView) {
            return null;
        }
        return view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeFeedActionLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(R$layout.home_feed_action_layout, this);
        View viewFindViewById = findViewById(R$id.home_feed_action);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewFindViewById;
        this.f26720d = appCompatImageView;
        C27046k.m66711z(appCompatImageView, 0L, new Function0() { // from class: com.kubi.home.widgets.feed.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeFeedActionLayout.m31127d(this.f26736b);
            }
        }, 1, null);
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity != null) {
            m31132g(fragmentActivity);
        }
        m31138o();
    }
}
