package com.kubi.home.navigation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5275i0;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.material.navigation.NavigationBarView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.R$drawable;
import com.kubi.home.R$layout;
import com.kubi.home.R$mipmap;
import com.kubi.home.R$string;
import com.kubi.home.api.IHomeService;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.entity.NavigationAvatarEntity;
import com.kubi.home.exception.HomeGlideException;
import com.kubi.home.main.C14614f;
import com.kubi.home.main.shimmer.NavigationShimmerLayout;
import com.kubi.home.service.HomeDepend;
import com.kubi.home.v2.HomeFragmentV2;
import com.kubi.kucoin.api.IKuFacadeService;
import com.kubi.lite.api.ILiteService;
import com.kubi.mine.api.entity.KycStatusEntity;
import com.kubi.mine.api.entity.KycStyleType;
import com.kubi.notice.api.service.INoticeService;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.rorbin.badgeview.QBadgeView;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.search.api.ISearchService;
import com.kubi.search.api.entity.SearchHintEntity;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.kubi.wallet.api.IWalletService;
import com.tencent.qcloud.tuicore.TUIConstants;
import dj.C36716a;
import dj.C36722g;
import f00.C37304a;
import fj.C37550v0;
import fj.C37552w0;
import g00.InterfaceC37760l;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p209ds.RedDot;
import p273fw.C37726b;
import p294gz.C38057a;
import p481ny.C42899b;
import p502oj.C43099d;
import p569qq.C43840a;
import p569qq.C43841b;
import p569qq.C43846g;
import p569qq.C43852m;
import p830zf.InterfaceC46791c0;
import p830zf.InterfaceC46800h;
import p830zf.InterfaceC46802i;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;
import zw.C46932c;
import zw.InterfaceC46930a;

/* JADX INFO: compiled from: NavigationCard.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\"\u001a\u00020 H\u0002J\u0012\u0010#\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010%H\u0002J\b\u0010&\u001a\u00020 H\u0002J\b\u0010'\u001a\u00020 H\u0002J\b\u0010(\u001a\u00020 H\u0002J\b\u0010)\u001a\u00020 H\u0002J\b\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020 H\u0016J\b\u0010-\u001a\u00020 H\u0002J\b\u0010.\u001a\u00020 H\u0002J\u0006\u0010/\u001a\u00020 J\b\u00100\u001a\u00020 H\u0002J\b\u00101\u001a\u00020 H\u0002J\u000e\u00102\u001a\u00020 2\u0006\u00103\u001a\u000204J\b\u00105\u001a\u00020+H\u0002J\b\u00106\u001a\u00020 H\u0002J\b\u00107\u001a\u00020 H\u0002J\b\u00108\u001a\u00020 H\u0002J\b\u00109\u001a\u00020 H\u0002J\u0010\u0010:\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010;\u001a\u00020 H\u0002J\b\u0010<\u001a\u00020 H\u0016J\b\u0010=\u001a\u00020 H\u0016J\b\u0010@\u001a\u00020 H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010>\u001a\u0004\u0018\u00010?X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, m90084d2 = {"Lcom/kubi/home/navigation/NavigationCard;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "kucoinLayoutHomeNavigationBinding", "Lcom/kubi/home/databinding/KucoinLayoutHomeNavigationBinding;", "getKucoinLayoutHomeNavigationBinding", "()Lcom/kubi/home/databinding/KucoinLayoutHomeNavigationBinding;", "kucoinLayoutHomeNavigationBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/home/navigation/NavigationViewModel;", "getViewModel", "()Lcom/kubi/home/navigation/NavigationViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "mAvatarBadge", "Lcom/kubi/resources/widget/rorbin/badgeview/Badge;", "mNoticeBadge", "mWeb3ModeBadge", "Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;", TtmlNode.TEXT_EMPHASIS_MARK_DOT, "Lcom/kubi/notice/api/entity/RedDot;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initObserves", "applyKycStatusView", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/mine/api/entity/KycStatusEntity;", "initBadges", "initNavi", "initSearchAndWeb3Entrance", "configGlobalHomeNavigation", "isNeedApplyFeatureKCOP16204", "", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "applyFeatureKCOP16204", "tryToShowPayDialog", "updateTitle", "onClickAction", "initRightIconsForHomeV2", "displayLayout", "state", "Lcom/kubi/home/navigation/NavigationState;", "isIvMessageVisible", "listenLoginEvent", "refreshWeb3ModeRedDot", "trackDotClick", "trackDotExpose", "bindRedDot", "updateAvatar", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onDestroyView", "currentSearchHint", "Lcom/kubi/search/api/entity/SearchHintEntity;", "refreshSearchGuideWord", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNavigationCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationCard.kt\ncom/kubi/home/navigation/NavigationCard\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 5 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 View.kt\nandroidx/core/view/ViewKt\n+ 8 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,563:1\n147#2,16:564\n158#3,2:580\n76#3,7:582\n76#3,7:592\n76#3,7:599\n81#3,2:606\n76#3,7:608\n153#3,7:615\n25#4,3:589\n17#4,2:622\n17#4,2:624\n220#5,5:626\n1#6:631\n142#7,8:632\n63#8,5:640\n68#8:647\n71#8,4:649\n1761#9,2:645\n1763#9:648\n*S KotlinDebug\n*F\n+ 1 NavigationCard.kt\ncom/kubi/home/navigation/NavigationCard\n*L\n102#1:564,16\n123#1:580,2\n138#1:582,7\n227#1:592,7\n232#1:599,7\n235#1:606,2\n238#1:608,7\n258#1:615,7\n198#1:589,3\n296#1:622,2\n341#1:624,2\n108#1:626,5\n418#1:632,8\n512#1:640,5\n512#1:647\n512#1:649,4\n512#1:645,2\n512#1:648\n*E\n"})
public final class NavigationCard extends BaseFragment {

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ KProperty<Object>[] f25876b0 = {Reflection.property1(new PropertyReference1Impl(NavigationCard.class, "kucoinLayoutHomeNavigationBinding", "getKucoinLayoutHomeNavigationBinding()Lcom/kubi/home/databinding/KucoinLayoutHomeNavigationBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f25877U = C45681e.m100799e(this, new Function1<NavigationCard, C37550v0>() { // from class: com.kubi.home.navigation.NavigationCard$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37550v0 invoke(@NotNull NavigationCard fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37550v0.m84572a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37550v0, Unit>() { // from class: com.kubi.home.navigation.NavigationCard$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37550v0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37550v0 c37550v0) {
            invoke(c37550v0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f25878V = LazyKt.lazy(new Function0() { // from class: com.kubi.home.navigation.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NavigationCard.m29608A4(this.f25903b);
        }
    });

    /* JADX INFO: renamed from: W */
    @Nullable
    public InterfaceC46930a f25879W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public InterfaceC46930a f25880X;

    /* JADX INFO: renamed from: Y */
    @Nullable
    public QBadgeView f25881Y;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public RedDot f25882Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public SearchHintEntity f25883a0;

    /* JADX INFO: renamed from: com.kubi.home.navigation.NavigationCard$b */
    /* JADX INFO: compiled from: NavigationCard.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14694b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f25884b;

        public C14694b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f25884b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f25884b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25884b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f25881Y = null;
        super.onDestroyView();
    }

    /* JADX INFO: renamed from: com.kubi.home.navigation.NavigationCard$a */
    /* JADX INFO: compiled from: NavigationCard.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C14693a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NavigationState.values().length];
            try {
                iArr[NavigationState.ShowContent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NavigationState.ShowShimmer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: A4 */
    public static final NavigationViewModel m29608A4(NavigationCard navigationCard) {
        return (NavigationViewModel) new ViewModelProvider(navigationCard).get(NavigationViewModel.class);
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m29618L3() {
        Router.f46192a.m56184f(IHomeService.f25434a.get().mo28946b()).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public final void m29619N3(RedDot redDot) {
        InterfaceC46930a interfaceC46930a = this.f25880X;
        if (interfaceC46930a != null) {
            this.f25882Z = redDot;
            if (redDot.getNoticeNumberCount() > 0) {
                interfaceC46930a.mo55426c(7.0f, 6.0f, true);
                interfaceC46930a.mo55425b(redDot.getNoticeNumberCount());
                C37726b.m85021a(getContext(), redDot.getNoticeNumberCount());
            } else {
                interfaceC46930a.mo55426c(12.0f, 9.0f, true);
                interfaceC46930a.mo55425b(redDot.getNoticeAllCount() > 0 ? -1 : 0);
                C37726b.m85025e(getContext());
            }
        }
        InterfaceC46930a interfaceC46930a2 = this.f25879W;
        if (interfaceC46930a2 != null) {
            interfaceC46930a2.mo55425b((redDot.getEncourageCount() > 0 || redDot.getInvitationCount() > 0) ? -1 : 0);
        }
    }

    /* JADX INFO: renamed from: P3 */
    public static final Unit m29620P3() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        C43852m.m96589a(HomeCardViewHolderProxy.PAGE_ID, "upperRight", "kucoinPay", jSONObject);
        RouteExKt.m56217H("home/userPay");
        HomeNavigationPayDialogHelper.f25899a.m29698c();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m29623W3(NavigationCard navigationCard) throws JSONException {
        ImageView imageView;
        if (!C24129b.m58030b(SiteVisibleConfigKey.PersonalCenter)) {
            return Unit.INSTANCE;
        }
        JSONObject jSONObject = new JSONObject();
        C37550v0 c37550v0M29662S3 = navigationCard.m29662S3();
        jSONObject.put("yesOrNo", (c37550v0M29662S3 == null || (imageView = c37550v0M29662S3.f83442i) == null) ? false : ViewExtKt.m66581l(imageView));
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a(HomeCardViewHolderProxy.PAGE_ID, "perCenter", "1", jSONObject);
        C43841b.m96557d("event_click_home_mine", "click_start_btn", null, 4, null);
        HomeNavigationPayDialogHelper.f25899a.m29698c();
        C12572a.m23695d("com.kubi.home.event.HomeEvent:switchDrawer", Boolean.TRUE, 0L, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m29624X3() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("optionKey", MultiLanguageManager.f46811g.getLocalString());
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a(HomeCardViewHolderProxy.PAGE_ID, "helpCenter", "1", jSONObject);
        Router.f46192a.m56184f(C14614f.m29399b()).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Unit m29625Y3(NavigationCard navigationCard) {
        C43852m.m96591c(HomeCardViewHolderProxy.PAGE_ID, "scan", "1", null, 8, null);
        HomeDepend.f26198a.m30224c().handleScanCode(navigationCard);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e4 */
    public static final Unit m29629e4(NavigationCard navigationCard) {
        ImageView imageView;
        ImageView imageView2;
        if (!C43099d.f95299a.m94706c()) {
            return Unit.INSTANCE;
        }
        C37550v0 c37550v0M29662S3 = navigationCard.m29662S3();
        if (c37550v0M29662S3 != null && (imageView2 = c37550v0M29662S3.f83439f) != null) {
            C27046k.m66700o(imageView2);
        }
        C37550v0 c37550v0M29662S4 = navigationCard.m29662S3();
        if (c37550v0M29662S4 != null && (imageView = c37550v0M29662S4.f83444k) != null) {
            C27046k.m66685H(imageView);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h4 */
    public static final Unit m29631h4(NavigationCard navigationCard) throws JSONException {
        SearchHintEntity searchHintEntity = navigationCard.f25883a0;
        String value = searchHintEntity != null ? searchHintEntity.getValue() : null;
        String str = value == null ? "" : value;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("contentItem", str);
        jSONObject.put("optionKey", MultiLanguageManager.f46811g.getLocalString());
        String type = searchHintEntity != null ? searchHintEntity.getType() : null;
        if (type == null) {
            type = "";
        }
        jSONObject.put("messageType", type);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a(HomeCardViewHolderProxy.PAGE_ID, FirebaseAnalytics.Event.SEARCH, "1", jSONObject);
        C37304a c37304a = C37304a.f82764a;
        String strM96601m = C43852m.m96601m(HomeCardViewHolderProxy.PAGE_ID, FirebaseAnalytics.Event.SEARCH, "1");
        String type2 = searchHintEntity != null ? searchHintEntity.getType() : null;
        InterfaceC37760l.a.m85175a(c37304a, "HOME", str, type2 == null ? "" : type2, null, strM96601m, null, null, 104, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public final void m29640o4() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.navigation.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavigationCard.m29642p4(this.f25915b);
            }
        });
    }

    /* JADX INFO: renamed from: y4 */
    public static final void m29655y4(boolean z11, GlideException glideException) {
        if (z11 || glideException == null) {
            return;
        }
        C43840a.m96550d("load avatar url failed: " + C36722g.m82288b().getAvatar(), "NavigationCard");
        if (glideException.getCause() instanceof GlideException) {
            Throwable cause = glideException.getCause();
            Intrinsics.checkNotNull(cause, "null cannot be cast to non-null type com.bumptech.glide.load.engine.GlideException");
            List<Throwable> rootCauses = ((GlideException) cause).getRootCauses();
            Intrinsics.checkNotNullExpressionValue(rootCauses, "getRootCauses(...)");
            if (rootCauses == null || !rootCauses.isEmpty()) {
                for (Throwable th2 : rootCauses) {
                    Intrinsics.checkNotNull(th2);
                    if (C42899b.m94075e(th2)) {
                        return;
                    }
                }
            }
        }
        C43846g.m96568c(new HomeGlideException(glideException, "NavigationCard", false, null, 8, null), null, 2, null);
    }

    /* JADX INFO: renamed from: Q3 */
    public final void m29661Q3(@NotNull final NavigationState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.navigation.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavigationCard.m29621R3(this.f25913b, state);
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public final C37550v0 m29662S3() {
        return (C37550v0) this.f25877U.getValue(this, f25876b0[0]);
    }

    /* JADX INFO: renamed from: T3 */
    public final NavigationViewModel m29663T3() {
        return (NavigationViewModel) this.f25878V.getValue();
    }

    /* JADX INFO: renamed from: d4 */
    public final void m29666d4() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.navigation.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavigationCard.m29629e4(this.f25912b);
            }
        });
    }

    /* JADX INFO: renamed from: f4 */
    public final void m29667f4() {
        C37552w0 c37552w0;
        ConstraintLayout constraintLayout;
        ImageView imageView;
        BaseTextView baseTextView;
        C37552w0 c37552w1;
        ConstraintLayout constraintLayout2;
        BaseTextView baseTextView2;
        ImageView imageView2;
        BaseTextView baseTextView3;
        C37552w0 c37552w2;
        ConstraintLayout constraintLayout3;
        if (IWalletService.f54542a.get().mo66941a() || ILiteService.f32003a.get().mo37530a()) {
            C37550v0 c37550v0M29662S3 = m29662S3();
            if (c37550v0M29662S3 != null && (c37552w1 = c37550v0M29662S3.f83449p) != null && (constraintLayout2 = c37552w1.f83482b) != null) {
                C27046k.m66685H(constraintLayout2);
            }
            C37550v0 c37550v0M29662S4 = m29662S3();
            if (c37550v0M29662S4 != null && (baseTextView = c37550v0M29662S4.f83435b) != null) {
                C27046k.m66703r(baseTextView);
            }
            C37550v0 c37550v0M29662S5 = m29662S3();
            if (c37550v0M29662S5 != null && (imageView = c37550v0M29662S5.f83444k) != null) {
                C27046k.m66700o(imageView);
            }
            updateTitle();
            m29666d4();
            C43852m.m96595g(HomeCardViewHolderProxy.PAGE_ID, "web3wallet", null, null, 12, null);
            C37550v0 c37550v0M29662S6 = m29662S3();
            if (c37550v0M29662S6 != null && (c37552w0 = c37550v0M29662S6.f83449p) != null && (constraintLayout = c37552w0.f83482b) != null) {
                C27046k.m66710y(constraintLayout, 1500L, new Function0() { // from class: com.kubi.home.navigation.g
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NavigationCard.m29630g4(this.f25904b);
                    }
                });
            }
        } else {
            C37550v0 c37550v0M29662S7 = m29662S3();
            if (c37550v0M29662S7 != null && (c37552w2 = c37550v0M29662S7.f83449p) != null && (constraintLayout3 = c37552w2.f83482b) != null) {
                C27046k.m66700o(constraintLayout3);
            }
            C37550v0 c37550v0M29662S8 = m29662S3();
            if (c37550v0M29662S8 != null && (baseTextView3 = c37550v0M29662S8.f83435b) != null) {
                C27046k.m66685H(baseTextView3);
            }
            C37550v0 c37550v0M29662S9 = m29662S3();
            if (c37550v0M29662S9 != null && (imageView2 = c37550v0M29662S9.f83444k) != null) {
                C27046k.m66685H(imageView2);
            }
            if (C12573b.f21598a.m23696a()) {
                "SearchEvent:UPDATE_HINT_WORD".length();
            }
            C12572a.m23692a(this, false, new C14695xa244e44c("SearchEvent:UPDATE_HINT_WORD", null, this));
            C37550v0 c37550v0M29662S10 = m29662S3();
            if (c37550v0M29662S10 != null && (baseTextView2 = c37550v0M29662S10.f83435b) != null) {
                C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: com.kubi.home.navigation.h
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NavigationCard.m29631h4(this.f25905b);
                    }
                }, 1, null);
            }
        }
        m29660O3();
        m29658K3();
    }

    /* JADX INFO: renamed from: i4 */
    public final boolean m29668i4() {
        return C38057a.f85671a.m85928a(C43852m.m96602n(HomeCardViewHolderProxy.PAGE_ID, "inform", null, 4, null), true) && C24129b.m58030b(SiteVisibleConfigKey.MessageCenter);
    }

    /* JADX INFO: renamed from: j4 */
    public final boolean m29669j4() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46800h.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            return ((InterfaceC46800h) objM56186h).mo5259a();
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29670k4() {
        Observable observableObserveOn = UserInfo.a.e().observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.home.navigation.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NavigationCard.m29635l4(this.f25906b, (Boolean) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(new Consumer() { // from class: com.kubi.home.navigation.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NavigationCard.m29637m4(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.kucoin_layout_home_navigation, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws JSONException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.home.event.HomeEvent:updateAvatar".length();
        }
        C12572a.m23692a(this, false, new NavigationCard$onViewCreated$$inlined$bindFlowEvent$1("com.kubi.home.event.HomeEvent:updateAvatar", null, this));
        m29664V3();
        m29622U3();
        m29665a4();
    }

    /* JADX INFO: renamed from: q4 */
    public final void m29672q4() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.navigation.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavigationCard.m29645r4(this.f25916b);
            }
        });
    }

    /* JADX INFO: renamed from: s4 */
    public final void m29673s4() throws JSONException {
        String str;
        RedDot redDot = this.f25882Z;
        if (redDot != null) {
            if (redDot.getNoticeNumberCount() > 0) {
                str = "number";
            } else {
                str = redDot.getNoticeAllCount() > 0 ? "redPoint" : "none";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("contentType", str);
            jSONObject.put("messageNumber", redDot.getNoticeNumberCount());
            Unit unit = Unit.INSTANCE;
            C36716a.m82242e(HomeCardViewHolderProxy.PAGE_ID, "inform", "1", jSONObject);
        }
    }

    /* JADX INFO: renamed from: t4 */
    public final void m29674t4() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("contentType", "none");
        Unit unit = Unit.INSTANCE;
        C36716a.m82244g(HomeCardViewHolderProxy.PAGE_ID, "inform", "1", jSONObject);
    }

    /* JADX INFO: renamed from: R3 */
    public static final Unit m29621R3(NavigationCard navigationCard, NavigationState navigationState) {
        QBadgeView qBadgeView;
        ImageView imageView;
        NavigationShimmerLayout navigationShimmerLayout;
        LinearLayoutCompat linearLayoutCompat;
        LinearLayoutCompat linearLayoutCompat2;
        ImageView imageView2;
        NavigationShimmerLayout navigationShimmerLayout2;
        LinearLayoutCompat linearLayoutCompat3;
        if (navigationCard.getView() != null && !navigationCard.isDetached() && !navigationCard.isRemoving()) {
            int i11 = C14693a.$EnumSwitchMapping$0[navigationState.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    C37550v0 c37550v0M29662S3 = navigationCard.m29662S3();
                    if (c37550v0M29662S3 != null && (linearLayoutCompat3 = c37550v0M29662S3.f83446m) != null) {
                        C27046k.m66700o(linearLayoutCompat3);
                    }
                    C37550v0 c37550v0M29662S4 = navigationCard.m29662S3();
                    if (c37550v0M29662S4 != null && (navigationShimmerLayout2 = c37550v0M29662S4.f83448o) != null) {
                        navigationShimmerLayout2.m29491j();
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                View view = null;
                if (navigationCard.m29668i4()) {
                    C37550v0 c37550v0M29662S5 = navigationCard.m29662S3();
                    if (c37550v0M29662S5 != null && (imageView2 = c37550v0M29662S5.f83443j) != null) {
                        C27046k.m66685H(imageView2);
                    }
                    InterfaceC46930a interfaceC46930a = navigationCard.f25880X;
                    if (interfaceC46930a instanceof QBadgeView) {
                        view = (QBadgeView) interfaceC46930a;
                    }
                    if (view != null) {
                        C27046k.m66685H(view);
                    }
                } else {
                    C37550v0 c37550v0M29662S6 = navigationCard.m29662S3();
                    if (c37550v0M29662S6 != null && (imageView = c37550v0M29662S6.f83443j) != null) {
                        C27046k.m66700o(imageView);
                    }
                    InterfaceC46930a interfaceC46930a2 = navigationCard.f25880X;
                    if (interfaceC46930a2 instanceof QBadgeView) {
                        qBadgeView = (QBadgeView) interfaceC46930a2;
                    } else {
                        qBadgeView = null;
                    }
                    if (qBadgeView != null) {
                        C27046k.m66700o(qBadgeView);
                        ViewParent parent = qBadgeView.getParent();
                        if (parent instanceof ViewGroup) {
                            view = (ViewGroup) parent;
                        }
                        if (view != null) {
                            C27046k.m66700o(view);
                        }
                    }
                }
                C37550v0 c37550v0M29662S7 = navigationCard.m29662S3();
                if (c37550v0M29662S7 != null && (linearLayoutCompat2 = c37550v0M29662S7.f83446m) != null) {
                    linearLayoutCompat2.requestFocus();
                }
                C37550v0 c37550v0M29662S8 = navigationCard.m29662S3();
                if (c37550v0M29662S8 != null && (linearLayoutCompat = c37550v0M29662S8.f83446m) != null) {
                    C27046k.m66685H(linearLayoutCompat);
                }
                C37550v0 c37550v0M29662S9 = navigationCard.m29662S3();
                if (c37550v0M29662S9 != null && (navigationShimmerLayout = c37550v0M29662S9.f83448o) != null) {
                    navigationShimmerLayout.m29490g();
                }
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    private final void m29622U3() {
        C37552w0 c37552w0;
        BaseTextView baseTextView;
        ImageView imageView;
        Context context = getContext();
        if (context != null) {
            FrameLayout frameLayout = null;
            if (m29668i4()) {
                QBadgeView qBadgeViewM103404a = C46932c.m103404a(new QBadgeView(context));
                C37550v0 c37550v0M29662S3 = m29662S3();
                if (c37550v0M29662S3 != null) {
                    imageView = c37550v0M29662S3.f83443j;
                } else {
                    imageView = null;
                }
                InterfaceC46930a interfaceC46930aMo55429f = qBadgeViewM103404a.mo55429f(imageView);
                this.f25880X = interfaceC46930aMo55429f;
                if (interfaceC46930aMo55429f != null) {
                    interfaceC46930aMo55429f.mo55428e(4.0f, true);
                }
            }
            QBadgeView qBadgeViewM103404a2 = C46932c.m103404a(new QBadgeView(context));
            C37550v0 c37550v0M29662S4 = m29662S3();
            if (c37550v0M29662S4 != null) {
                frameLayout = c37550v0M29662S4.f83436c;
            }
            this.f25879W = qBadgeViewM103404a2.mo55429f(frameLayout);
            C37550v0 c37550v0M29662S5 = m29662S3();
            if (c37550v0M29662S5 != null && (c37552w0 = c37550v0M29662S5.f83449p) != null && (baseTextView = c37552w0.f83484d) != null) {
                QBadgeView qBadgeViewM103404a3 = C46932c.m103404a(new QBadgeView(context));
                qBadgeViewM103404a3.mo55431h(NavigationBarView.ITEM_GRAVITY_START_CENTER);
                qBadgeViewM103404a3.mo55426c(1.0f, 0.0f, true);
                qBadgeViewM103404a3.mo55429f(baseTextView);
                this.f25881Y = qBadgeViewM103404a3;
            }
            m29672q4();
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public static final Unit m29626Z3(NavigationCard navigationCard) throws JSONException {
        navigationCard.m29673s4();
        INoticeService.f36364a.get().mo43134c();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    public static final Unit m29627b4(NavigationCard navigationCard, NavigationAvatarEntity navigationAvatarEntity) {
        navigationCard.m29676w4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c4 */
    public static final Unit m29628c4(NavigationCard navigationCard, KycStatusEntity kycStatusEntity) {
        navigationCard.m29659M3(kycStatusEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g4 */
    public static final Unit m29630g4(NavigationCard navigationCard) {
        navigationCard.m29671n4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    public static final Unit m29635l4(NavigationCard navigationCard, Boolean bool) {
        if (!bool.booleanValue()) {
            C37726b.m85025e(navigationCard.getContext());
        }
        navigationCard.m29672q4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public static final void m29637m4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p4 */
    public static final Unit m29642p4(NavigationCard navigationCard) throws JSONException {
        C37550v0 c37550v0M29662S3 = navigationCard.m29662S3();
        if (c37550v0M29662S3 == null) {
            return Unit.INSTANCE;
        }
        BaseTextView etSearch = c37550v0M29662S3.f83435b;
        Intrinsics.checkNotNullExpressionValue(etSearch, "etSearch");
        if (!C27046k.m66704s(etSearch)) {
            return Unit.INSTANCE;
        }
        SearchHintEntity searchHintEntityMo59108a = ISearchService.f48774a.get().mo59108a();
        if (searchHintEntityMo59108a != null) {
            c37550v0M29662S3.f83435b.setText(searchHintEntityMo59108a.getValue());
            JSONObject jSONObject = new JSONObject();
            String value = searchHintEntityMo59108a.getValue();
            String str = "";
            if (value == null) {
                value = "";
            }
            jSONObject.put("contentItem", value);
            jSONObject.put("optionKey", MultiLanguageManager.f46811g.getLocalString());
            String type = searchHintEntityMo59108a.getType();
            if (type != null) {
                str = type;
            }
            jSONObject.put("messageType", str);
            Unit unit = Unit.INSTANCE;
            C43852m.m96593e(HomeCardViewHolderProxy.PAGE_ID, FirebaseAnalytics.Event.SEARCH, "1", jSONObject);
        } else {
            searchHintEntityMo59108a = null;
        }
        navigationCard.f25883a0 = searchHintEntityMo59108a;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m29645r4(NavigationCard navigationCard) {
        C37552w0 c37552w0;
        BaseTextView baseTextView;
        Object objM103844constructorimpl;
        int iM66658b;
        C37550v0 c37550v0M29662S3 = navigationCard.m29662S3();
        if (c37550v0M29662S3 != null && (c37552w0 = c37550v0M29662S3.f83449p) != null && (baseTextView = c37552w0.f83484d) != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(IKuFacadeService.f27711a.get().mo31922a()));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Boolean bool = Boolean.FALSE;
            if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                objM103844constructorimpl = bool;
            }
            boolean zBooleanValue = ((Boolean) objM103844constructorimpl).booleanValue();
            int i11 = 0;
            if (zBooleanValue) {
                iM66658b = C27040e.m66658b(12);
            } else {
                iM66658b = 0;
            }
            baseTextView.setPaddingRelative(iM66658b, baseTextView.getPaddingTop(), baseTextView.getPaddingEnd(), baseTextView.getPaddingBottom());
            QBadgeView qBadgeView = navigationCard.f25881Y;
            if (qBadgeView != null) {
                if (zBooleanValue) {
                    i11 = -1;
                }
                qBadgeView.mo55425b(i11);
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final void m29650v4(NavigationCard navigationCard, ImageView imageView) {
        FragmentActivity activity = navigationCard.getActivity();
        if (activity != null) {
            HomeNavigationPayDialogHelper.f25899a.m29699d(activity, imageView);
        }
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m29653x4(ImageView imageView) {
        C24277v.m58538c(imageView.getContext(), C36722g.m82288b().getAvatar(), imageView, R$mipmap.home_icon_mine_default_head, false, false, new C24277v.b() { // from class: com.kubi.home.navigation.i
            @Override // com.kubi.sdk.util.C24277v.b
            /* JADX INFO: renamed from: a */
            public final void mo29703a(boolean z11, GlideException glideException) {
                NavigationCard.m29655y4(z11, glideException);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m29657z4(ImageView imageView, String str) {
        ComponentCallbacks2C5309c.m6556t(imageView.getContext()).mo6634v(str).m6594E0(imageView);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public final void m29658K3() {
        C37550v0 c37550v0M29662S3;
        if (!m29669j4() || (c37550v0M29662S3 = m29662S3()) == null) {
            return;
        }
        ImageView ivCustomerService = c37550v0M29662S3.f83440g;
        Intrinsics.checkNotNullExpressionValue(ivCustomerService, "ivCustomerService");
        C27046k.m66685H(ivCustomerService);
        ImageView ivCustomerService2 = c37550v0M29662S3.f83440g;
        Intrinsics.checkNotNullExpressionValue(ivCustomerService2, "ivCustomerService");
        C27046k.m66711z(ivCustomerService2, 0L, new Function0() { // from class: com.kubi.home.navigation.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavigationCard.m29618L3();
            }
        }, 1, null);
        ImageView ivMassage = c37550v0M29662S3.f83443j;
        Intrinsics.checkNotNullExpressionValue(ivMassage, "ivMassage");
        c37550v0M29662S3.f83446m.removeView(ivMassage);
        c37550v0M29662S3.f83446m.addView(ivMassage, 1);
        m29675u4();
    }

    /* JADX INFO: renamed from: M3 */
    public final void m29659M3(KycStatusEntity kycStatusEntity) {
        ImageView imageView;
        String displayType;
        C37550v0 c37550v0M29662S3 = m29662S3();
        if (c37550v0M29662S3 != null && (imageView = c37550v0M29662S3.f83442i) != null) {
            KycStyleType kycStyleType = KycStyleType.WARN;
            String displayType2 = null;
            if (kycStatusEntity != null) {
                displayType = kycStatusEntity.getDisplayType();
            } else {
                displayType = null;
            }
            if (kycStyleType.equalString(displayType)) {
                ViewExtKt.m66594y(imageView);
                imageView.setImageResource(R$mipmap.navi_kyc_warning);
                return;
            }
            KycStyleType kycStyleType2 = KycStyleType.ERROR;
            if (kycStatusEntity != null) {
                displayType2 = kycStatusEntity.getDisplayType();
            }
            if (kycStyleType2.equalString(displayType2)) {
                ViewExtKt.m66594y(imageView);
                imageView.setImageResource(R$mipmap.navi_kyc_failed);
            } else {
                ViewExtKt.m66577h(imageView);
            }
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final void m29660O3() {
        C37550v0 c37550v0M29662S3 = m29662S3();
        if (c37550v0M29662S3 == null || !C24129b.m58030b(SiteVisibleConfigKey.KucoinPay)) {
            return;
        }
        ImageView ivQrCode = c37550v0M29662S3.f83444k;
        Intrinsics.checkNotNullExpressionValue(ivQrCode, "ivQrCode");
        C27046k.m66700o(ivQrCode);
        ImageView ivKucoinPay = c37550v0M29662S3.f83441h;
        Intrinsics.checkNotNullExpressionValue(ivKucoinPay, "ivKucoinPay");
        C27046k.m66685H(ivKucoinPay);
        ImageView ivKucoinPay2 = c37550v0M29662S3.f83441h;
        Intrinsics.checkNotNullExpressionValue(ivKucoinPay2, "ivKucoinPay");
        C27046k.m66711z(ivKucoinPay2, 0L, new Function0() { // from class: com.kubi.home.navigation.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavigationCard.m29620P3();
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: V3 */
    public final void m29664V3() throws JSONException {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        ImageView imageView5;
        ImageView imageView6;
        FrameLayout frameLayout;
        m29667f4();
        C37550v0 c37550v0M29662S3 = m29662S3();
        if (c37550v0M29662S3 != null && (frameLayout = c37550v0M29662S3.f83445l) != null) {
            C27046k.m66710y(frameLayout, 1000L, new Function0() { // from class: com.kubi.home.navigation.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NavigationCard.m29623W3(this.f25917b);
                }
            });
        }
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46791c0.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((InterfaceC46791c0) objM56186h).m103120a(m29662S3(), this);
        } else {
            C37550v0 c37550v0M29662S4 = m29662S3();
            if (c37550v0M29662S4 != null && (imageView = c37550v0M29662S4.f83439f) != null) {
                C27046k.m66710y(imageView, 1000L, new Function0() { // from class: com.kubi.home.navigation.u
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NavigationCard.m29624X3();
                    }
                });
            }
        }
        C37550v0 c37550v0M29662S5 = m29662S3();
        if (c37550v0M29662S5 != null && (imageView6 = c37550v0M29662S5.f83444k) != null) {
            C27046k.m66711z(imageView6, 0L, new Function0() { // from class: com.kubi.home.navigation.v
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NavigationCard.m29625Y3(this.f25918b);
                }
            }, 1, null);
        }
        if (m29668i4()) {
            C37550v0 c37550v0M29662S6 = m29662S3();
            if (c37550v0M29662S6 != null && (imageView5 = c37550v0M29662S6.f83443j) != null) {
                C27046k.m66685H(imageView5);
            }
            C37550v0 c37550v0M29662S7 = m29662S3();
            if (c37550v0M29662S7 != null && (imageView4 = c37550v0M29662S7.f83443j) != null) {
                C27046k.m66711z(imageView4, 0L, new Function0() { // from class: com.kubi.home.navigation.w
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NavigationCard.m29626Z3(this.f25919b);
                    }
                }, 1, null);
            }
        } else {
            C37550v0 c37550v0M29662S8 = m29662S3();
            if (c37550v0M29662S8 != null && (imageView3 = c37550v0M29662S8.f83443j) != null) {
                C27046k.m66700o(imageView3);
            }
            C37550v0 c37550v0M29662S9 = m29662S3();
            if (c37550v0M29662S9 != null && (imageView2 = c37550v0M29662S9.f83444k) != null) {
                ViewExtKt.m66584o(imageView2, 0, 0, C27040e.m66658b(8), 0);
            }
        }
        m29676w4();
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "com.kubi.home.event.HomeEvent:openQrCodeScan".length();
        }
        C12572a.m23692a(this, false, new NavigationCard$initNavi$$inlined$bindFlowEvent$default$1("com.kubi.home.event.HomeEvent:openQrCodeScan", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.event.HomeEvent:showRedPoint".length();
        }
        C12572a.m23692a(this, false, new NavigationCard$initNavi$$inlined$bindFlowEvent$default$2("com.kubi.home.event.HomeEvent:showRedPoint", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.event.HomeEvent:refreshWeb3ModeRedDot".length();
        }
        C12572a.m23692a(this, false, new NavigationCard$initNavi$$inlined$bindFlowEvent$1("com.kubi.home.event.HomeEvent:refreshWeb3ModeRedDot", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.event.HomeEvent:updateNaviKycStatus".length();
        }
        C12572a.m23692a(this, false, new NavigationCard$initNavi$$inlined$bindFlowEvent$default$3("com.kubi.home.event.HomeEvent:updateNaviKycStatus", null, this));
        m29670k4();
        m29674t4();
    }

    /* JADX INFO: renamed from: a4 */
    public final void m29665a4() {
        m29663T3().m29679n().observe(getViewLifecycleOwner(), new C14694b(new Function1() { // from class: com.kubi.home.navigation.x
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NavigationCard.m29627b4(this.f25920b, (NavigationAvatarEntity) obj);
            }
        }));
        if (!m29669j4()) {
            m29663T3().m29680o().observe(getViewLifecycleOwner(), new C14694b(new Function1() { // from class: com.kubi.home.navigation.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NavigationCard.m29628c4(this.f25902b, (KycStatusEntity) obj);
                }
            }));
        }
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.home.event.HomeEvent:shimmer_show".length();
        }
        C12572a.m23692a(this, false, new NavigationCard$initObserves$$inlined$bindFlowEvent$default$1("com.kubi.home.event.HomeEvent:shimmer_show", null, this));
    }

    /* JADX INFO: renamed from: n4 */
    public final void m29671n4() {
        FragmentActivity fragmentActivity;
        LifecycleCoroutineScope lifecycleScope;
        Context context = getContext();
        if (context instanceof FragmentActivity) {
            fragmentActivity = (FragmentActivity) context;
        } else {
            fragmentActivity = null;
        }
        if (fragmentActivity != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragmentActivity)) != null) {
            lifecycleScope.launchWhenStarted(new NavigationCard$onClickAction$1(null));
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        HomeNavigationPayDialogHelper.f25899a.m29698c();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m29663T3().m29682q();
        m29640o4();
        m29672q4();
    }

    /* JADX INFO: renamed from: u4 */
    public final void m29675u4() {
        C37550v0 c37550v0M29662S3;
        if (m29669j4() && C24129b.m58030b(SiteVisibleConfigKey.KucoinPay) && HomeFragmentV2.f26336f0.getHomepageLoadFinish() && isShowing() && (c37550v0M29662S3 = m29662S3()) != null) {
            final ImageView ivKucoinPay = c37550v0M29662S3.f83441h;
            Intrinsics.checkNotNullExpressionValue(ivKucoinPay, "ivKucoinPay");
            ivKucoinPay.post(new Runnable() { // from class: com.kubi.home.navigation.l
                @Override // java.lang.Runnable
                public final void run() {
                    NavigationCard.m29650v4(this.f25908b, ivKucoinPay);
                }
            });
        }
    }

    public final void updateTitle() {
        C37552w0 c37552w0;
        BaseTextView baseTextView;
        int iMo82102a;
        C37550v0 c37550v0M29662S3 = m29662S3();
        if (c37550v0M29662S3 != null && (c37552w0 = c37550v0M29662S3.f83449p) != null && (baseTextView = c37552w0.f83484d) != null) {
            String string = null;
            if (ILiteService.f32003a.get().mo37530a()) {
                Context context = getContext();
                if (context != null) {
                    string = context.getString(R$string.lite_mode_selector_pro);
                }
            } else {
                Context context2 = getContext();
                if (context2 != null) {
                    Object objM56186h = Router.f46192a.m56186h(InterfaceC46802i.class, SiteInfoManager.f47913a.m58109c());
                    if (objM56186h != null) {
                        iMo82102a = ((InterfaceC46802i) objM56186h).mo82102a();
                    } else {
                        iMo82102a = R$string.tab_exchange;
                    }
                    string = context2.getString(iMo82102a);
                }
            }
            baseTextView.setText(string);
        }
    }

    /* JADX INFO: renamed from: w4 */
    public final void m29676w4() {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        final ImageView imageView;
        final ImageView imageView2;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        FragmentActivity activity = getActivity();
        final String strAvatar = null;
        if (activity != null) {
            boolValueOf = Boolean.valueOf(activity.isDestroyed());
        } else {
            boolValueOf = null;
        }
        if (!C27025c.m66567e(boolValueOf, true)) {
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                boolValueOf2 = Boolean.valueOf(activity2.isFinishing());
            } else {
                boolValueOf2 = null;
            }
            if (!C27025c.m66567e(boolValueOf2, true)) {
                C37550v0 c37550v0M29662S3 = m29662S3();
                if (c37550v0M29662S3 != null && (baseTextView4 = c37550v0M29662S3.f83447n) != null) {
                    baseTextView4.setLayoutParams(new FrameLayout.LayoutParams(C5275i0.m6236a(26.0f), C5275i0.m6236a(26.0f), 17));
                    if (C36722g.m82292f()) {
                        baseTextView4.setText(StringsKt.trim((CharSequence) C36722g.m82288b().getShowHeadText()).toString());
                        InterfaceC46930a interfaceC46930a = this.f25879W;
                        if (interfaceC46930a != null) {
                            interfaceC46930a.mo55426c(-1.0f, -1.0f, true);
                        }
                        baseTextView4.setPadding(0, 0, 0, 0);
                        baseTextView4.setBackgroundResource(R$drawable.shape_user_center_white_circle_33);
                    } else {
                        baseTextView4.setText("");
                        baseTextView4.setBackgroundResource(R$mipmap.home_icon_mine_default_head);
                        InterfaceC46930a interfaceC46930a2 = this.f25879W;
                        if (interfaceC46930a2 != null) {
                            interfaceC46930a2.mo55426c(44.0f, 0.0f, true);
                        }
                    }
                }
                C37550v0 c37550v0M29662S4 = m29662S3();
                if (c37550v0M29662S4 != null && (imageView2 = c37550v0M29662S4.f83437d) != null) {
                    imageView2.setLayoutParams(new FrameLayout.LayoutParams(C5275i0.m6236a(26.0f), C5275i0.m6236a(26.0f), 17));
                    if (C36722g.m82292f()) {
                        String avatar = C36722g.m82288b().getAvatar();
                        if (avatar != null && avatar.length() != 0) {
                            C27100x0.m66924e(new Function0() { // from class: com.kubi.home.navigation.d
                                @Override // p852kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return NavigationCard.m29653x4(imageView2);
                                }
                            });
                            ViewExtKt.m66594y(imageView2);
                            C37550v0 c37550v0M29662S5 = m29662S3();
                            if (c37550v0M29662S5 != null && (baseTextView3 = c37550v0M29662S5.f83447n) != null) {
                                ViewExtKt.m66577h(baseTextView3);
                            }
                        } else {
                            imageView2.setImageResource(0);
                            ViewExtKt.m66577h(imageView2);
                            C37550v0 c37550v0M29662S6 = m29662S3();
                            if (c37550v0M29662S6 != null && (baseTextView2 = c37550v0M29662S6.f83447n) != null) {
                                ViewExtKt.m66594y(baseTextView2);
                            }
                        }
                        InterfaceC46930a interfaceC46930a3 = this.f25879W;
                        if (interfaceC46930a3 != null) {
                            interfaceC46930a3.mo55426c(-1.0f, -1.0f, true);
                        }
                    } else {
                        ViewExtKt.m66577h(imageView2);
                        C37550v0 c37550v0M29662S7 = m29662S3();
                        if (c37550v0M29662S7 != null && (baseTextView = c37550v0M29662S7.f83447n) != null) {
                            ViewExtKt.m66594y(baseTextView);
                        }
                        InterfaceC46930a interfaceC46930a4 = this.f25879W;
                        if (interfaceC46930a4 != null) {
                            interfaceC46930a4.mo55426c(44.0f, 0.0f, true);
                        }
                    }
                }
                C37550v0 c37550v0M29662S8 = m29662S3();
                if (c37550v0M29662S8 != null && (imageView = c37550v0M29662S8.f83438e) != null) {
                    NavigationAvatarEntity value = m29663T3().m29679n().getValue();
                    if (value != null) {
                        strAvatar = value.avatar();
                    }
                    if (strAvatar != null && strAvatar.length() != 0) {
                        C27100x0.m66924e(new Function0() { // from class: com.kubi.home.navigation.o
                            @Override // p852kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return NavigationCard.m29657z4(imageView, strAvatar);
                            }
                        });
                    } else {
                        imageView.setImageResource(0);
                    }
                }
            }
        }
    }
}
