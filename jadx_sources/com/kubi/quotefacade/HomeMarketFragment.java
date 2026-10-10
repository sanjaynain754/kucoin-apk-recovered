package com.kubi.quotefacade;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.ViewPager;
import bv.C4660d0;
import com.blankj.utilcode.util.C5275i0;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.monitor.helper.TracePageHelper;
import com.kubi.otc.entity.OtcAd;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.alpha.AlphaFragment;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.quotefacade.chance.ChanceFragment;
import com.kubi.quotefacade.chance.ChanceRnContainer;
import com.kubi.quotefacade.chance.ChanceSiteConfig;
import com.kubi.quotefacade.constant.CardID;
import com.kubi.quotefacade.constant.QuoteMainTab;
import com.kubi.quotefacade.entity.Letter;
import com.kubi.quotefacade.entity.Lettes;
import com.kubi.quotefacade.entity.PageInfo;
import com.kubi.quotefacade.favorites.QuoteFavoriteFragment;
import com.kubi.quotefacade.feed.FeedFragment;
import com.kubi.quotefacade.helper.QuoteConfigHelper;
import com.kubi.quotefacade.helper.QuoteKV;
import com.kubi.quotefacade.market.QuoteMarketFragment;
import com.kubi.quotefacade.repository.QuoteRepository;
import com.kubi.quotefacade.service.BQuoteFacadeDepend;
import com.kubi.quotefacade.view.QuoteViewPager;
import com.kubi.quotefacade.view.TabContainerFragment;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.flyco.widget.MsgView;
import com.kubi.resources.widget.rorbin.badgeview.QBadgeView;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.search.api.ISearchService;
import com.kubi.search.api.entity.SearchHintEntity;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.tradingbotkit.api.ITradingBotService;
import com.kubi.utils.C27100x0;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import cv.C36546c;
import f00.C37304a;
import g00.InterfaceC37757i;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p025av.C4391b;
import p10.C43353a;
import p321hv.InterfaceC38353c;
import p321hv.InterfaceC38354d;
import p569qq.C43846g;
import p569qq.C43852m;
import p739ww.C45938b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import w00.C45681e;
import y70.C46392a;
import zw.C46932c;
import zw.InterfaceC46930a;

/* JADX INFO: compiled from: HomeMarketFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 I2\u00020\u0001:\u0001IB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\u001fH\u0014J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020!H\u0016J\u0012\u0010#\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010%H\u0016J\b\u0010*\u001a\u00020!H\u0016J\u0010\u0010+\u001a\u00020!2\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010,\u001a\u00020!H\u0002J\u0010\u0010-\u001a\u00020!2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010.\u001a\u00020!2\u0006\u0010'\u001a\u00020(H\u0002J \u0010/\u001a\u00020!2\u0006\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000202H\u0007J \u00104\u001a\u00020!2\u0006\u00105\u001a\u0002022\u0006\u00106\u001a\u0002022\u0006\u00107\u001a\u000202H\u0007J\u0012\u00108\u001a\u00020\u001f2\b\b\u0001\u00109\u001a\u00020\u001fH\u0002J\u0006\u0010:\u001a\u00020!J\b\u0010;\u001a\u00020!H\u0002J\b\u0010<\u001a\u00020!H\u0002J\u0010\u0010=\u001a\u00020!2\u0006\u0010>\u001a\u00020\nH\u0002J\b\u0010?\u001a\u00020!H\u0002J\u0010\u0010@\u001a\u00020!2\u0006\u0010A\u001a\u000202H\u0007J\u0006\u0010B\u001a\u00020!J\u0006\u0010C\u001a\u00020!J\b\u0010D\u001a\u00020!H\u0016J\b\u0010G\u001a\u00020!H\u0002J\u0006\u0010H\u001a\u00020!R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0010\u0010E\u001a\u0004\u0018\u00010FX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006J"}, m90084d2 = {"Lcom/kubi/quotefacade/HomeMarketFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "mNoticeBadge", "Lcom/kubi/resources/widget/rorbin/badgeview/Badge;", "latestNoticeGmtCreated", "", "Ljava/lang/Long;", "clearRedDotOnNextResult", "", "pageInfos", "", "Lcom/kubi/quotefacade/entity/PageInfo;", "viewBind", "Lcom/kubi/quotefacade/databinding/KucoinLayoutHomeMarketSwitchFragmentbarBinding;", "getViewBind", "()Lcom/kubi/quotefacade/databinding/KucoinLayoutHomeMarketSwitchFragmentbarBinding;", "viewBind$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "cachedChanceFragment", "Landroidx/fragment/app/Fragment;", "chanceFragment", "getChanceFragment", "()Landroidx/fragment/app/Fragment;", "cachedFeedFragment", "Lcom/kubi/quotefacade/view/TabContainerFragment;", "feedFragment", "getFeedFragment", "()Lcom/kubi/quotefacade/view/TabContainerFragment;", "getLayout", "", "onLoad", "", "lazyLoad", "onArguments", "bundle", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "onDestroyView", "initViews", "setupMarketHeaderWidgetsBySite", "initFragments", "initViewPager", "resetSwitchBar", "type", "market", "", "index", "resetSwitchBarV2", "mainTab", "subTab", "info", "indexOf", "titleResId", "showTopMenuGuide", "initBadges", "getRedDotStatus", "updateReddot", "isShow", "gotoSmartPush", "changePagerScrollStatus", "scrollStatus", "removeEmotionView", "removeCopyTradingRnFragment", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "currentSearchHint", "Lcom/kubi/search/api/entity/SearchHintEntity;", "refreshSearchGuideWord", "removeFeedFlutterFragment", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"KCCyclomaticComplexityCheck", "KCFragmentCheck", "KCLongMethodCheck"})
@SourceDebugExtension({"SMAP\nHomeMarketFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeMarketFragment.kt\ncom/kubi/quotefacade/HomeMarketFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n+ 7 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 10 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,807:1\n147#2,16:808\n35#3,4:824\n39#3:830\n44#4,2:828\n1#5:831\n326#6,4:832\n17#7,2:836\n17#7,2:838\n25#7,2:848\n27#7:859\n25#7,3:866\n1563#8:840\n1634#8,3:841\n1563#8:844\n1634#8,3:845\n1563#8:862\n1634#8,3:863\n135#9,2:850\n67#9:860\n67#9:861\n76#10,7:852\n*S KotlinDebug\n*F\n+ 1 HomeMarketFragment.kt\ncom/kubi/quotefacade/HomeMarketFragment\n*L\n115#1:808,16\n138#1:824,4\n138#1:830\n138#1:828,2\n248#1:832,4\n270#1:836,2\n298#1:838,2\n381#1:848,2\n381#1:859\n597#1:866,3\n344#1:840\n344#1:841,3\n345#1:844\n345#1:845,3\n590#1:862\n590#1:863,3\n383#1:850,2\n519#1:860\n580#1:861\n390#1:852,7\n*E\n"})
public final class HomeMarketFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: U */
    @Nullable
    public InterfaceC46930a f40943U;

    /* JADX INFO: renamed from: V */
    @Nullable
    public volatile Long f40944V;

    /* JADX INFO: renamed from: W */
    public volatile boolean f40945W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public List<PageInfo> f40946X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f40947Y = C45681e.m100799e(this, new Function1<HomeMarketFragment, C4660d0>() { // from class: com.kubi.quotefacade.HomeMarketFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4660d0 invoke(@NotNull HomeMarketFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4660d0.m4632a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4660d0, Unit>() { // from class: com.kubi.quotefacade.HomeMarketFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4660d0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4660d0 c4660d0) {
            invoke(c4660d0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Z */
    @Nullable
    public Fragment f40948Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public TabContainerFragment f40949a0;

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public SearchHintEntity f40950b0;

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f40942d0 = {Reflection.property1(new PropertyReference1Impl(HomeMarketFragment.class, "viewBind", "getViewBind()Lcom/kubi/quotefacade/databinding/KucoinLayoutHomeMarketSwitchFragmentbarBinding;", 0))};

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final Companion f40941c0 = new Companion(null);

    /* JADX INFO: compiled from: HomeMarketFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/quotefacade/HomeMarketFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/quotefacade/HomeMarketFragment;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final HomeMarketFragment newInstance() {
            return new HomeMarketFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.HomeMarketFragment$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes37.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C21563a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.HomeMarketFragment$b */
    /* JADX INFO: compiled from: HomeMarketFragment.kt */
    /* JADX INFO: loaded from: classes37.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/quotefacade/HomeMarketFragment$initViewPager$1", "Lcom/kubi/resources/widget/flyco/listener/OnTabSelectListener;", "onTabSelect", "", ViewProps.POSITION, "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21564b extends C45938b {
        public C21564b() {
        }

        @Override // p739ww.C45938b
        /* JADX INFO: renamed from: b */
        public void mo18273b(int i11) {
            String tabChangedLocationId;
            PageInfo pageInfo;
            if (i11 != HomeMarketFragment.this.m50113K3(R$string.discover_emotion_chance)) {
                List list = HomeMarketFragment.this.f40946X;
                if (list == null || (pageInfo = (PageInfo) list.get(i11)) == null || (tabChangedLocationId = pageInfo.getTabChangedLocationId()) == null) {
                    tabChangedLocationId = "";
                }
                C43852m.m96591c("B5Markets", "TopNav", tabChangedLocationId, null, 8, null);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.HomeMarketFragment$c */
    /* JADX INFO: compiled from: HomeMarketFragment.kt */
    /* JADX INFO: loaded from: classes37.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/quotefacade/HomeMarketFragment$initViewPager$4", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", ViewProps.POSITION, "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nHomeMarketFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeMarketFragment.kt\ncom/kubi/quotefacade/HomeMarketFragment$initViewPager$4\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,807:1\n15#2,2:808\n1#3:810\n58#4,2:811\n126#4,2:813\n*S KotlinDebug\n*F\n+ 1 HomeMarketFragment.kt\ncom/kubi/quotefacade/HomeMarketFragment$initViewPager$4\n*L\n419#1:808,2\n420#1:811,2\n425#1:813,2\n*E\n"})
    public static final class C21565c extends ViewPager.SimpleOnPageChangeListener {
        public C21565c() {
        }

        /* JADX INFO: renamed from: d */
        public static final void m50160d(int i11, int i12) {
            QuoteKV quoteKV = QuoteKV.f42044a;
            C46392a.m102329l(quoteKV.m52052l(), i11);
            if (i11 == i12) {
                C46392a.m102328k(quoteKV.m52047g(), true);
            }
        }

        /* JADX INFO: renamed from: c */
        public static final void m50159c(HomeMarketFragment homeMarketFragment, int i11) {
            SlidingTabLayout slidingTabLayout;
            C4660d0 c4660d0M50143I3 = homeMarketFragment.m50143I3();
            if (c4660d0M50143I3 != null && (slidingTabLayout = c4660d0M50143I3.f4276d) != null) {
                slidingTabLayout.setCurrentTab(i11);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(final int position) throws JSONException {
            QuoteViewPager quoteViewPager;
            SlidingTabLayout slidingTabLayout;
            SlidingTabLayout slidingTabLayout2;
            MsgView msgViewM55287q;
            SlidingTabLayout slidingTabLayout3;
            QuoteViewPager quoteViewPager2;
            String str;
            PageInfo pageInfo;
            String tabChangedLocationId;
            PageInfo pageInfo2;
            String tabChangedLocationId2;
            String str2;
            PageInfo pageInfo3;
            String tabChangedLocationId3;
            SlidingTabLayout slidingTabLayout4;
            QuoteViewPager quoteViewPager3;
            super.onPageSelected(position);
            if (HomeMarketFragment.this.getView() != null) {
                C4660d0 c4660d0M50143I3 = HomeMarketFragment.this.m50143I3();
                Boolean boolValueOf = null;
                if (c4660d0M50143I3 != null) {
                    quoteViewPager = c4660d0M50143I3.f4278f;
                } else {
                    quoteViewPager = null;
                }
                if (quoteViewPager != null) {
                    final int currentItem = 0;
                    if (position != HomeMarketFragment.this.m50113K3(R$string.kc_tb_asset_bot)) {
                        final int iM50113K3 = HomeMarketFragment.this.m50113K3(R$string.discover_emotion_chance);
                        C42917g.m94137c().execute(new Runnable() { // from class: com.kubi.quotefacade.o
                            @Override // java.lang.Runnable
                            public final void run() {
                                HomeMarketFragment.C21565c.m50160d(position, iM50113K3);
                            }
                        });
                        String str3 = "";
                        if (position != iM50113K3) {
                            List list = HomeMarketFragment.this.f40946X;
                            if (list == null || (pageInfo3 = (PageInfo) list.get(position)) == null || (tabChangedLocationId3 = pageInfo3.getTabChangedLocationId()) == null) {
                                str2 = "";
                            } else {
                                str2 = tabChangedLocationId3;
                            }
                            C43852m.m96595g("B5Markets", "TopNav", str2, null, 8, null);
                        }
                        if (position == HomeMarketFragment.this.m50113K3(R$string.favorites)) {
                            List list2 = HomeMarketFragment.this.f40946X;
                            if (list2 != null && (pageInfo2 = (PageInfo) list2.get(position)) != null && (tabChangedLocationId2 = pageInfo2.getTabChangedLocationId()) != null) {
                                str3 = tabChangedLocationId2;
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("type", "v2");
                            Unit unit = Unit.INSTANCE;
                            C43852m.m96589a("B5Markets", "TopNav", str3, jSONObject);
                            return;
                        }
                        if (position == HomeMarketFragment.this.m50113K3(R$string.market)) {
                            List list3 = HomeMarketFragment.this.f40946X;
                            if (list3 == null || (pageInfo = (PageInfo) list3.get(position)) == null || (tabChangedLocationId = pageInfo.getTabChangedLocationId()) == null) {
                                str = "";
                            } else {
                                str = tabChangedLocationId;
                            }
                            C43852m.m96591c("B5Markets", "TopNav", str, null, 8, null);
                            return;
                        }
                        if (position == HomeMarketFragment.this.m50113K3(R$string.market_alpha)) {
                            C27023a.m66555b("B5marketAlpha", "tab", "1", null, 8, null);
                            return;
                        }
                        if (position == HomeMarketFragment.this.m50113K3(R$string.futures)) {
                            BQuoteFacadeDepend bQuoteFacadeDepend = BQuoteFacadeDepend.f42592a;
                            if (bQuoteFacadeDepend.m53023c().mo33254C(HomeMarketFragment.this.getChildFragmentManager())) {
                                C4660d0 c4660d0M50143I4 = HomeMarketFragment.this.m50143I3();
                                if (c4660d0M50143I4 != null && (quoteViewPager2 = c4660d0M50143I4.f4278f) != null) {
                                    quoteViewPager2.setCurrentItem(0);
                                    return;
                                }
                                return;
                            }
                            C4660d0 c4660d0M50143I5 = HomeMarketFragment.this.m50143I3();
                            if (c4660d0M50143I5 != null && (slidingTabLayout3 = c4660d0M50143I5.f4276d) != null) {
                                slidingTabLayout3.m55290u(1);
                            }
                            TracePageHelper.m42472g("open_contract_quotes", "合约行情");
                            String strMo33292v = bQuoteFacadeDepend.m53023c().mo33292v();
                            JSONObject jSONObject2 = new JSONObject();
                            C4660d0 c4660d0M50143I6 = HomeMarketFragment.this.m50143I3();
                            if (c4660d0M50143I6 != null && (slidingTabLayout2 = c4660d0M50143I6.f4276d) != null && (msgViewM55287q = slidingTabLayout2.m55287q(1)) != null) {
                                boolValueOf = Boolean.valueOf(ViewExtKt.m66581l(msgViewM55287q));
                            }
                            jSONObject2.put("if_red", boolValueOf);
                            Unit unit2 = Unit.INSTANCE;
                            C43852m.m96589a(strMo33292v, "View", "1", jSONObject2);
                            return;
                        }
                        if (position == iM50113K3) {
                            C4660d0 c4660d0M50143I7 = HomeMarketFragment.this.m50143I3();
                            if (c4660d0M50143I7 != null && (slidingTabLayout = c4660d0M50143I7.f4276d) != null) {
                                slidingTabLayout.m55290u(position);
                            }
                            C43852m.m96591c("B5TradeChance", "TopNav", "1", null, 8, null);
                            C43852m.m96591c(BQuoteFacadeDepend.f42592a.m53023c().mo33292v(), "View", "2", null, 8, null);
                            C43852m.m96591c("B5Markets", "TopNav", "4", null, 8, null);
                            return;
                        }
                        return;
                    }
                    C43852m.m96591c("B5MarketsBot", "botTab", "1", null, 8, null);
                    ITradingBotService.f52126a.get().mo63679c();
                    C4660d0 c4660d0M50143I8 = HomeMarketFragment.this.m50143I3();
                    if (c4660d0M50143I8 != null && (quoteViewPager3 = c4660d0M50143I8.f4278f) != null) {
                        currentItem = quoteViewPager3.getCurrentItem();
                    }
                    C4660d0 c4660d0M50143I9 = HomeMarketFragment.this.m50143I3();
                    if (c4660d0M50143I9 != null && (slidingTabLayout4 = c4660d0M50143I9.f4276d) != null) {
                        final HomeMarketFragment homeMarketFragment = HomeMarketFragment.this;
                        slidingTabLayout4.post(new Runnable() { // from class: com.kubi.quotefacade.n
                            @Override // java.lang.Runnable
                            public final void run() {
                                HomeMarketFragment.C21565c.m50159c(homeMarketFragment, currentItem);
                            }
                        });
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K3 */
    public final int m50113K3(@StringRes int i11) {
        List<PageInfo> list = this.f40946X;
        if (list == null) {
            return -1;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PageInfo) it.next()).getPageTitle());
        }
        return arrayList.indexOf(getString(i11));
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m50114N3(HomeMarketFragment homeMarketFragment) {
        List<PageInfo> list = homeMarketFragment.f40946X;
        if (list != null) {
            String string = homeMarketFragment.getString(R$string.kc_tb_asset_bot);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            list.add(new PageInfo(string, "10", new Fragment()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R3 */
    public static final Unit m50116R3(Bundle bundle) {
        BQuoteFacadeDepend.f42592a.m53021a().mo20626g(bundle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m50117S3() {
        BQuoteFacadeDepend.f42592a.m53023c().mo33275c(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d4 */
    public static final Unit m50121d4() {
        if (!C24129b.m58030b(SiteVisibleConfigKey.MarketWidget)) {
            return Unit.INSTANCE;
        }
        InterfaceC37757i.a.m85150b(C37304a.f82764a, null, null, null, 7, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e4 */
    public static final Unit m50122e4(HomeMarketFragment homeMarketFragment) throws JSONException {
        if (!C24129b.m58030b(SiteVisibleConfigKey.IntelligentMonitoring)) {
            return Unit.INSTANCE;
        }
        homeMarketFragment.m50144J3();
        return Unit.INSTANCE;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: A3 */
    public final void m50139A3(@NotNull String scrollStatus) {
        C4660d0 c4660d0M50143I3;
        ChanceFragment chanceFragment;
        Intrinsics.checkNotNullParameter(scrollStatus, "scrollStatus");
        if (getView() == null || (c4660d0M50143I3 = m50143I3()) == null) {
            return;
        }
        if (C36546c.f79388a.m81812a(scrollStatus)) {
            c4660d0M50143I3.f4278f.setScroll(false);
            Fragment fragmentM50140B3 = m50140B3();
            chanceFragment = fragmentM50140B3 instanceof ChanceFragment ? (ChanceFragment) fragmentM50140B3 : null;
            if (chanceFragment != null) {
                chanceFragment.m51020l3(false);
                return;
            }
            return;
        }
        c4660d0M50143I3.f4278f.setScroll(true);
        Fragment fragmentM50140B4 = m50140B3();
        chanceFragment = fragmentM50140B4 instanceof ChanceFragment ? (ChanceFragment) fragmentM50140B4 : null;
        if (chanceFragment != null) {
            chanceFragment.m51020l3(true);
        }
    }

    /* JADX INFO: renamed from: B3 */
    public final Fragment m50140B3() {
        Object objM20457a;
        Fragment fragmentNewInstance = this.f40948Z;
        if (fragmentNewInstance == null) {
            try {
                RemoteConfig remoteConfig = RemoteConfig.f19636a;
                Type type = new C21563a().getType();
                Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                objM20457a = RemoteConfig.m20457a("market_opportunity_rn", type);
            } catch (Throwable th2) {
                C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
                objM20457a = null;
            }
            fragmentNewInstance = C27025c.m66567e((Boolean) objM20457a, false) ? ChanceRnContainer.f41634V.newInstance() : ChanceFragment.f41626Y.newInstance();
            this.f40948Z = fragmentNewInstance;
        }
        return fragmentNewInstance;
    }

    /* JADX INFO: renamed from: C3 */
    public final TabContainerFragment m50141C3() {
        TabContainerFragment tabContainerFragment = this.f40949a0;
        if (tabContainerFragment != null) {
            return tabContainerFragment;
        }
        FeedFragment feedFragmentInstance = FeedFragment.f41910W.instance();
        this.f40949a0 = feedFragmentInstance;
        return feedFragmentInstance;
    }

    /* JADX INFO: renamed from: D3 */
    public final void m50142D3() {
        if (C24129b.m58030b(SiteVisibleConfigKey.IntelligentMonitoring) && BQuoteFacadeDepend.f42592a.m53025e().c()) {
            Observable observableObserveOn = new QuoteRepository().m53014d(CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(CardID.ALART.getId()), Integer.valueOf(CardID.MARKET_CHANGE.getId()), Integer.valueOf(CardID.WHALE.getId())}), ",", null, null, 0, null, null, 62, null), null, 1, 1).compose(C24217a1.m58390n()).observeOn(AndroidSchedulers.mainThread());
            final Function1 function1 = new Function1() { // from class: com.kubi.quotefacade.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HomeMarketFragment.m50109E3(this.f42115b, (Letter) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.quotefacade.j
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    HomeMarketFragment.m50110F3(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.quotefacade.k
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HomeMarketFragment.m50111G3(this.f42133b, (Throwable) obj);
                }
            };
            Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.quotefacade.l
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    HomeMarketFragment.m50112H3(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        }
    }

    /* JADX INFO: renamed from: I3 */
    public final C4660d0 m50143I3() {
        return (C4660d0) this.f40947Y.getValue(this, f40942d0[0]);
    }

    /* JADX INFO: renamed from: J3 */
    public final void m50144J3() throws JSONException {
        Long l11 = this.f40944V;
        if (l11 != null) {
            QuoteKV.f42044a.m52064x(String.valueOf(l11.longValue()));
        } else {
            this.f40945W = true;
        }
        Router.f46192a.m56184f("krn/router?biz=message&entry=main&component=kucoin_message_rn&needLogin=true&route=GroupPage&cardBusinessId=104").m4048k();
        JSONObject jSONObject = new JSONObject();
        InterfaceC46930a interfaceC46930a = this.f40943U;
        jSONObject.put("contentType", (interfaceC46930a == null || interfaceC46930a.getBadgeNumber() != -1) ? "none" : "redpoint");
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B5Markets", "inform", "1", jSONObject);
        m50156f4(false);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0082  */
    /* JADX WARN: Code duplicated, block: B:6:0x002b  */
    /* JADX INFO: renamed from: M3 */
    public final void m50146M3(View view) {
        ArrayList<PageInfo> arrayList;
        QuoteConfigHelper quoteConfigHelper;
        List<PageInfo> list;
        List<PageInfo> list2;
        List<PageInfo> list3;
        Router router = Router.f46192a;
        SiteInfoManager siteInfoManager = SiteInfoManager.f47913a;
        Object objM56186h = router.m56186h(InterfaceC38353c.class, siteInfoManager.m58109c());
        if (objM56186h != null) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            arrayList = ((InterfaceC38353c) objM56186h).m86542a(context, getArguments());
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                quoteConfigHelper = QuoteConfigHelper.f41987a;
                if (quoteConfigHelper.m51930j() && quoteConfigHelper.m51928h()) {
                    String string = getString(R$string.favorites);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    arrayList.add(new PageInfo(string, "1", QuoteFavoriteFragment.Companion.newInstance$default(QuoteFavoriteFragment.f41688f0, null, 1, null)));
                }
                if (quoteConfigHelper.m51936p() && quoteConfigHelper.m51933m()) {
                    String string2 = getString(R$string.market);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    arrayList.add(new PageInfo(string2, "6", QuoteMarketFragment.f42200X.newInstance()));
                }
                if (quoteConfigHelper.m51937q()) {
                    String string3 = getString(R$string.market_alpha);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    arrayList.add(new PageInfo(string3, "8", new AlphaFragment()));
                }
            }
        } else {
            arrayList = new ArrayList<>();
            quoteConfigHelper = QuoteConfigHelper.f41987a;
            if (quoteConfigHelper.m51930j()) {
                String string4 = getString(R$string.favorites);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                arrayList.add(new PageInfo(string4, "1", QuoteFavoriteFragment.Companion.newInstance$default(QuoteFavoriteFragment.f41688f0, null, 1, null)));
            }
            if (quoteConfigHelper.m51936p()) {
                String string5 = getString(R$string.market);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                arrayList.add(new PageInfo(string5, "6", QuoteMarketFragment.f42200X.newInstance()));
            }
            if (quoteConfigHelper.m51937q()) {
                String string6 = getString(R$string.market_alpha);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                arrayList.add(new PageInfo(string6, "8", new AlphaFragment()));
            }
        }
        this.f40946X = arrayList;
        Object objM56186h2 = router.m56186h(InterfaceC38354d.class, siteInfoManager.m58109c());
        boolean zM86545b = objM56186h2 != null ? ((InterfaceC38354d) objM56186h2).m86545b() : true;
        boolean zM51040a = ChanceSiteConfig.f41642a.m51040a();
        if (zM86545b && zM51040a && C24129b.m58030b(SiteVisibleConfigKey.Opportunity) && (list3 = this.f40946X) != null) {
            String string7 = getString(R$string.discover_emotion_chance);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            list3.add(new PageInfo(string7, "4", m50140B3()));
        }
        if (IQuoteFacadeService.f41383a.get().mo50706i() && C24129b.m58030b(SiteVisibleConfigKey.Feed) && (list2 = this.f40946X) != null) {
            String string8 = getString(R$string.kc_market_feed_tab);
            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
            list2.add(new PageInfo(string8, "8", m50141C3()));
        }
        BQuoteFacadeDepend bQuoteFacadeDepend = BQuoteFacadeDepend.f42592a;
        if (bQuoteFacadeDepend.m53021a().mo20634o() && (list = this.f40946X) != null) {
            Bundle arguments = getArguments();
            String strM56284y = arguments != null ? RouteExKt.m56284y(arguments, "uiStateValue") : null;
            String string9 = getString(R$string.copytd_copy_trading);
            Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
            list.add(new PageInfo(string9, "5", bQuoteFacadeDepend.m53021a().mo20630k(strM56284y, "quotes")));
        }
        C24129b.m58033e(SiteVisibleConfigKey.TradingBot, new Function0() { // from class: com.kubi.quotefacade.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeMarketFragment.m50114N3(this.f41916b);
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public final void m50148P3(View view) {
        BaseTextView baseTextView;
        view.setPadding(0, EdgeToEdgeCompat.f48106a.m58272j(), 0, 0);
        view.setBackgroundColor(getColorRes(R$color.c_overlay));
        m50155c4();
        C4660d0 c4660d0M50143I3 = m50143I3();
        if (c4660d0M50143I3 == null || (baseTextView = c4660d0M50143I3.f4277e) == null) {
            return;
        }
        C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.quotefacade.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeMarketFragment.m50115Q3(this.f41659b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: T3 */
    public final void m50149T3() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeMarketFragment.m50118U3(this.f41917b);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public final void m50150V3() {
        PageInfo pageInfo;
        Fragment fragment;
        List<PageInfo> list = this.f40946X;
        if (list == null || (pageInfo = (PageInfo) CollectionsKt.getOrNull(list, m50113K3(R$string.copytd_copy_trading))) == null || (fragment = pageInfo.getFragment()) == null) {
            return;
        }
        BQuoteFacadeDepend.f42592a.m53021a().mo20637r(fragment);
    }

    /* JADX INFO: renamed from: W3 */
    public final void m50151W3() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeMarketFragment.m50119X3(this.f41654b);
            }
        });
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m50152Y3() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeMarketFragment.m50120Z3(this.f41463b);
            }
        });
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: a4 */
    public final void m50153a4(int i11, @NotNull String market, @NotNull String index) {
        QuoteViewPager quoteViewPager;
        Bundle arguments;
        Intrinsics.checkNotNullParameter(market, "market");
        Intrinsics.checkNotNullParameter(index, "index");
        if (i11 == 0) {
            m50154b4(QuoteMainTab.MARKET.getType(), SearchCategory$Companion.SPOT, "");
            return;
        }
        if (i11 == 1) {
            if (StringsKt.equals("FAV", market, true)) {
                m50154b4(QuoteMainTab.FAV.getType(), SearchCategory$Companion.FUTURES, "");
                return;
            } else {
                m50154b4(QuoteMainTab.MARKET.getType(), SearchCategory$Companion.FUTURES, "");
                return;
            }
        }
        if (i11 == 2) {
            m50154b4(QuoteMainTab.CHANCE.getType(), "", "");
            return;
        }
        int iM102323e = C46392a.m102323e(QuoteKV.f42044a.m52052l(), 0);
        if (iM102323e == m50113K3(R$string.discover_emotion_chance) && (arguments = m50140B3().getArguments()) != null) {
            arguments.putString("market", market);
        }
        C4660d0 c4660d0M50143I3 = m50143I3();
        if (c4660d0M50143I3 == null || (quoteViewPager = c4660d0M50143I3.f4278f) == null) {
            return;
        }
        quoteViewPager.setCurrentItem(iM102323e);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: b4 */
    public final void m50154b4(@NotNull String mainTab, @NotNull String subTab, @NotNull String info) {
        QuoteViewPager quoteViewPager;
        C4660d0 c4660d0M50143I3;
        QuoteViewPager quoteViewPager2;
        C4660d0 c4660d0M50143I4;
        QuoteViewPager quoteViewPager3;
        QuoteViewPager quoteViewPager4;
        C4660d0 c4660d0M50143I5;
        QuoteViewPager quoteViewPager5;
        C4660d0 c4660d0M50143I6;
        QuoteViewPager quoteViewPager6;
        QuoteViewPager quoteViewPager7;
        QuoteViewPager quoteViewPager8;
        QuoteViewPager quoteViewPager9;
        QuoteViewPager quoteViewPager10;
        QuoteViewPager quoteViewPager11;
        Intrinsics.checkNotNullParameter(mainTab, "mainTab");
        Intrinsics.checkNotNullParameter(subTab, "subTab");
        Intrinsics.checkNotNullParameter(info, "info");
        if (Intrinsics.areEqual(mainTab, QuoteMainTab.FAV.getType())) {
            C4660d0 c4660d0M50143I7 = m50143I3();
            if (c4660d0M50143I7 != null && (quoteViewPager11 = c4660d0M50143I7.f4278f) != null) {
                quoteViewPager11.setCurrentItem(m50113K3(R$string.favorites));
            }
            C4391b.f3820a.m4009g(subTab);
            return;
        }
        if (Intrinsics.areEqual(mainTab, QuoteMainTab.MARKET.getType())) {
            C4660d0 c4660d0M50143I8 = m50143I3();
            if (c4660d0M50143I8 == null || (quoteViewPager9 = c4660d0M50143I8.f4278f) == null || quoteViewPager9.getAdapter() == null) {
                return;
            }
            C4660d0 c4660d0M50143I9 = m50143I3();
            if (c4660d0M50143I9 != null && (quoteViewPager10 = c4660d0M50143I9.f4278f) != null) {
                quoteViewPager10.setCurrentItem(m50113K3(R$string.market));
            }
            C4391b.f3820a.m4010h(subTab);
            return;
        }
        if (Intrinsics.areEqual(mainTab, QuoteMainTab.ALPHA.getType())) {
            C4660d0 c4660d0M50143I10 = m50143I3();
            if (c4660d0M50143I10 == null || (quoteViewPager7 = c4660d0M50143I10.f4278f) == null || quoteViewPager7.getAdapter() == null) {
                return;
            }
            C4660d0 c4660d0M50143I11 = m50143I3();
            if (c4660d0M50143I11 != null && (quoteViewPager8 = c4660d0M50143I11.f4278f) != null) {
                quoteViewPager8.setCurrentItem(m50113K3(R$string.market_alpha));
            }
            C4391b.f3820a.m4010h(subTab);
            return;
        }
        if (Intrinsics.areEqual(mainTab, QuoteMainTab.KRAZY_DEGEN.getType())) {
            int iM50113K3 = m50113K3(R$string.quote_chain_tab_name);
            if (iM50113K3 == -1 || (c4660d0M50143I6 = m50143I3()) == null || (quoteViewPager6 = c4660d0M50143I6.f4278f) == null) {
                return;
            }
            quoteViewPager6.setCurrentItem(iM50113K3);
            return;
        }
        if (Intrinsics.areEqual(mainTab, QuoteMainTab.CHANCE.getType())) {
            C4660d0 c4660d0M50143I12 = m50143I3();
            if (c4660d0M50143I12 != null && (quoteViewPager4 = c4660d0M50143I12.f4278f) != null && quoteViewPager4.getAdapter() != null && (c4660d0M50143I5 = m50143I3()) != null && (quoteViewPager5 = c4660d0M50143I5.f4278f) != null) {
                quoteViewPager5.setCurrentItem(m50113K3(R$string.discover_emotion_chance));
            }
            C4391b.f3820a.m4008f(subTab);
            Bundle arguments = m50140B3().getArguments();
            if (arguments != null) {
                arguments.putString("market", info);
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(mainTab, QuoteMainTab.COPY_TRADING.getType())) {
            int iM102323e = C46392a.m102323e(QuoteKV.f42044a.m52052l(), 0);
            C4660d0 c4660d0M50143I13 = m50143I3();
            if (c4660d0M50143I13 == null || (quoteViewPager = c4660d0M50143I13.f4278f) == null) {
                return;
            }
            quoteViewPager.setCurrentItem(iM102323e);
            return;
        }
        if (!BQuoteFacadeDepend.f42592a.m53021a().mo20634o() || (c4660d0M50143I3 = m50143I3()) == null || (quoteViewPager2 = c4660d0M50143I3.f4278f) == null || quoteViewPager2.getAdapter() == null || (c4660d0M50143I4 = m50143I3()) == null || (quoteViewPager3 = c4660d0M50143I4.f4278f) == null) {
            return;
        }
        quoteViewPager3.setCurrentItem(m50113K3(R$string.copytd_copy_trading));
    }

    /* JADX INFO: renamed from: f4 */
    public final void m50156f4(boolean z11) {
        InterfaceC46930a interfaceC46930a = this.f40943U;
        if (interfaceC46930a != null) {
            interfaceC46930a.mo55425b(z11 ? -1 : 0);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.kucoin_layout_home_market_switch_fragmentbar;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m50148P3(view);
        m50146M3(view);
        m50147O3(view);
    }

    public HomeMarketFragment() {
        setPageId("B5Markets");
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m50109E3(HomeMarketFragment homeMarketFragment, Letter letter) throws JSONException {
        List<Lettes> letters;
        C44128b.m97266j(homeMarketFragment.getTAG(), "result = " + letter);
        String str = "none";
        boolean z11 = false;
        if (letter != null && (letters = letter.getLetters()) != null && !letters.isEmpty()) {
            QuoteKV quoteKV = QuoteKV.f42044a;
            Long lM52062v = quoteKV.m52062v();
            C44128b.m97266j(homeMarketFragment.getTAG(), "getGmtCreated sp= " + lM52062v + ", new gmt:" + letters.get(0).getGmtCreated());
            String gmtCreated = letters.get(0).getGmtCreated();
            Long lM66547q = DowngradeExKt.m66547q(gmtCreated);
            homeMarketFragment.f40944V = lM66547q;
            if (homeMarketFragment.f40945W && gmtCreated != null && gmtCreated.length() != 0) {
                homeMarketFragment.f40945W = false;
                quoteKV.m52064x(gmtCreated);
                homeMarketFragment.m50156f4(false);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("contentType", "none");
                Unit unit = Unit.INSTANCE;
                C43852m.m96593e("B5Markets", "inform", "1", jSONObject);
                return Unit.INSTANCE;
            }
            if (lM52062v == null) {
                C44128b.m97266j(homeMarketFragment.getTAG(), "save gmtCreated to sp= " + letters.get(0).getGmtCreated());
                quoteKV.m52064x(letters.get(0).getGmtCreated());
            } else if (lM66547q != null && lM66547q.longValue() > lM52062v.longValue()) {
                z11 = true;
                homeMarketFragment.m50156f4(true);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        if (z11) {
            str = "redpoint";
        }
        jSONObject2.put("contentType", str);
        Unit unit2 = Unit.INSTANCE;
        C43852m.m96593e("B5Markets", "inform", "1", jSONObject2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F3 */
    public static final void m50110F3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m50111G3(HomeMarketFragment homeMarketFragment, Throwable th2) {
        C44128b.m97270n(homeMarketFragment.getTAG(), "getRedDotStatus error: " + th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H3 */
    public static final void m50112H3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Unit m50115Q3(HomeMarketFragment homeMarketFragment) {
        String value;
        QuoteViewPager quoteViewPager;
        C4660d0 c4660d0M50143I3 = homeMarketFragment.m50143I3();
        if (c4660d0M50143I3 != null && (quoteViewPager = c4660d0M50143I3.f4278f) != null && quoteViewPager.getCurrentItem() == homeMarketFragment.m50113K3(R$string.copytd_copy_trading)) {
            BQuoteFacadeDepend.f42592a.m53021a().mo20623d();
        } else {
            SearchHintEntity searchHintEntity = homeMarketFragment.f40950b0;
            String type = null;
            if (searchHintEntity != null) {
                value = searchHintEntity.getValue();
            } else {
                value = null;
            }
            String str = "";
            if (value == null) {
                value = "";
            }
            C43353a c43353a = C43353a.f95736a;
            String strM96602n = C43852m.m96602n("B5Markets", FirebaseAnalytics.Event.SEARCH, null, 4, null);
            if (searchHintEntity != null) {
                type = searchHintEntity.getType();
            }
            if (type != null) {
                str = type;
            }
            c43353a.m95474b(value, "MARKET", strM96602n, str);
            C43852m.m96591c("B5Markets", FirebaseAnalytics.Event.SEARCH, null, null, 12, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m50118U3(HomeMarketFragment homeMarketFragment) {
        C4660d0 c4660d0M50143I3 = homeMarketFragment.m50143I3();
        if (c4660d0M50143I3 == null) {
            return Unit.INSTANCE;
        }
        SearchHintEntity searchHintEntityMo59108a = ISearchService.f48774a.get().mo59108a();
        if (searchHintEntityMo59108a != null) {
            c4660d0M50143I3.f4277e.setText(searchHintEntityMo59108a.getValue());
        } else {
            searchHintEntityMo59108a = null;
        }
        homeMarketFragment.f40950b0 = searchHintEntityMo59108a;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m50119X3(HomeMarketFragment homeMarketFragment) {
        QuoteViewPager quoteViewPager;
        PageInfo pageInfo;
        PageInfo pageInfo2;
        if (homeMarketFragment.getView() == null) {
            return Unit.INSTANCE;
        }
        if (homeMarketFragment.f40946X != null) {
            C4660d0 c4660d0M50143I3 = homeMarketFragment.m50143I3();
            if (c4660d0M50143I3 != null && (quoteViewPager = c4660d0M50143I3.f4278f) != null) {
                int currentItem = quoteViewPager.getCurrentItem();
                Fragment fragmentM50140B3 = homeMarketFragment.m50140B3();
                Fragment fragment = null;
                if (fragmentM50140B3 instanceof ChanceFragment) {
                    List<PageInfo> list = homeMarketFragment.f40946X;
                    if (list != null && (pageInfo2 = list.get(currentItem)) != null) {
                        fragment = pageInfo2.getFragment();
                    }
                    if ((fragment instanceof ChanceFragment) && ((ChanceFragment) fragmentM50140B3).m51022p3()) {
                        return Unit.INSTANCE;
                    }
                    ((ChanceFragment) fragmentM50140B3).m51023q3();
                } else if (fragmentM50140B3 instanceof ChanceRnContainer) {
                    List<PageInfo> list2 = homeMarketFragment.f40946X;
                    if (list2 != null && (pageInfo = list2.get(currentItem)) != null) {
                        fragment = pageInfo.getFragment();
                    }
                    if (fragment instanceof ChanceRnContainer) {
                        return Unit.INSTANCE;
                    }
                    ((ChanceRnContainer) fragmentM50140B3).m51033s3();
                }
            } else {
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    public static final Unit m50120Z3(HomeMarketFragment homeMarketFragment) {
        QuoteViewPager quoteViewPager;
        Fragment fragment;
        PageInfo pageInfo;
        if (homeMarketFragment.getView() == null) {
            return Unit.INSTANCE;
        }
        if (homeMarketFragment.f40946X != null) {
            C4660d0 c4660d0M50143I3 = homeMarketFragment.m50143I3();
            if (c4660d0M50143I3 != null && (quoteViewPager = c4660d0M50143I3.f4278f) != null) {
                int currentItem = quoteViewPager.getCurrentItem();
                List<PageInfo> list = homeMarketFragment.f40946X;
                if (list != null && (pageInfo = list.get(currentItem)) != null) {
                    fragment = pageInfo.getFragment();
                } else {
                    fragment = null;
                }
                if (Intrinsics.areEqual(fragment, homeMarketFragment.m50141C3())) {
                    return Unit.INSTANCE;
                }
                homeMarketFragment.m50141C3().m53330o3();
            } else {
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    public final void m50145L3() {
        ImageView imageView;
        Context context = getContext();
        if (context != null) {
            QBadgeView qBadgeViewM103404a = C46932c.m103404a(new QBadgeView(context));
            C4660d0 c4660d0M50143I3 = m50143I3();
            if (c4660d0M50143I3 != null) {
                imageView = c4660d0M50143I3.f4274b;
            } else {
                imageView = null;
            }
            InterfaceC46930a interfaceC46930aMo55429f = qBadgeViewM103404a.mo55429f(imageView);
            this.f40943U = interfaceC46930aMo55429f;
            if (interfaceC46930aMo55429f != null) {
                interfaceC46930aMo55429f.mo55426c(16.0f, 4.0f, true);
                m50156f4(false);
            }
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final void m50147O3(View view) {
        ArrayList arrayList;
        List listEmptyList;
        int iM50113K3;
        C4660d0 c4660d0M50143I3;
        SlidingTabLayout slidingTabLayout;
        QuoteViewPager quoteViewPager;
        QuoteViewPager quoteViewPager2;
        Integer numM56228S;
        QuoteViewPager quoteViewPager3;
        int iM50113K4;
        C4660d0 c4660d0M50143I4;
        SlidingTabLayout slidingTabLayout2;
        TextView textViewM55289t;
        int iM50113K5;
        C4660d0 c4660d0M50143I5;
        SlidingTabLayout slidingTabLayout3;
        TextView textViewM55289t2;
        SlidingTabLayout slidingTabLayout4;
        SlidingTabLayout slidingTabLayout5;
        QuoteViewPager quoteViewPager4;
        QuoteViewPager quoteViewPager5;
        SlidingTabLayout slidingTabLayout6;
        SlidingTabLayout slidingTabLayout7;
        C4660d0 c4660d0M50143I6 = m50143I3();
        int size = 1;
        if (c4660d0M50143I6 != null && (slidingTabLayout7 = c4660d0M50143I6.f4276d) != null) {
            slidingTabLayout7.setNeedBold(true);
        }
        C4660d0 c4660d0M50143I7 = m50143I3();
        if (c4660d0M50143I7 != null && (slidingTabLayout6 = c4660d0M50143I7.f4276d) != null) {
            slidingTabLayout6.setUnderlineIgnorePadding(true);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        List<PageInfo> list = this.f40946X;
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((PageInfo) it.next()).getFragment());
            }
        } else {
            arrayList = new ArrayList();
        }
        List<PageInfo> list2 = this.f40946X;
        if (list2 != null) {
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                listEmptyList.add(((PageInfo) it2.next()).getPageTitle());
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        C27103z c27103z = new C27103z(childFragmentManager, arrayList, listEmptyList);
        C4660d0 c4660d0M50143I8 = m50143I3();
        if (c4660d0M50143I8 != null && (quoteViewPager5 = c4660d0M50143I8.f4278f) != null) {
            quoteViewPager5.setAdapter(c27103z);
        }
        C4660d0 c4660d0M50143I9 = m50143I3();
        if (c4660d0M50143I9 != null && (slidingTabLayout5 = c4660d0M50143I9.f4276d) != null) {
            C4660d0 c4660d0M50143I10 = m50143I3();
            if (c4660d0M50143I10 != null) {
                quoteViewPager4 = c4660d0M50143I10.f4278f;
            } else {
                quoteViewPager4 = null;
            }
            slidingTabLayout5.setViewPager(quoteViewPager4);
        }
        C4660d0 c4660d0M50143I11 = m50143I3();
        if (c4660d0M50143I11 != null && (slidingTabLayout4 = c4660d0M50143I11.f4276d) != null) {
            slidingTabLayout4.setOnTabSelectListener(new C21564b());
        }
        QuoteConfigHelper quoteConfigHelper = QuoteConfigHelper.f41987a;
        if (quoteConfigHelper.m51925e() && (iM50113K5 = m50113K3(R$string.quote_chain_tab_name)) != -1 && (c4660d0M50143I5 = m50143I3()) != null && (slidingTabLayout3 = c4660d0M50143I5.f4276d) != null && (textViewM55289t2 = slidingTabLayout3.m55289t(iM50113K5)) != null) {
            C27046k.m66694i(textViewM55289t2, R$mipmap.quote_ic_hot, C5275i0.m6236a(4.0f), 0, 4, null);
        }
        if (quoteConfigHelper.m51924d() && (iM50113K4 = m50113K3(R$string.market_alpha)) != -1 && (c4660d0M50143I4 = m50143I3()) != null && (slidingTabLayout2 = c4660d0M50143I4.f4276d) != null && (textViewM55289t = slidingTabLayout2.m55289t(iM50113K4)) != null) {
            C27046k.m66694i(textViewM55289t, R$mipmap.quote_ic_hot, C5275i0.m6236a(4.0f), 0, 4, null);
        }
        C4660d0 c4660d0M50143I12 = m50143I3();
        if (c4660d0M50143I12 != null && (quoteViewPager3 = c4660d0M50143I12.f4278f) != null) {
            List<PageInfo> list3 = this.f40946X;
            if (list3 != null) {
                size = list3.size();
            }
            quoteViewPager3.setOffscreenPageLimit(size);
        }
        C4660d0 c4660d0M50143I13 = m50143I3();
        if (c4660d0M50143I13 != null && (quoteViewPager2 = c4660d0M50143I13.f4278f) != null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                numM56228S = RouteExKt.m56228S(arguments, "type");
            } else {
                numM56228S = null;
            }
            quoteViewPager2.setCurrentItem(C27039d.m66650j(numM56228S));
        }
        Object objM56186h = Router.f46192a.m56186h(InterfaceC38353c.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((InterfaceC38353c) objM56186h).m86543b();
        } else {
            if (!C46392a.m102322d(QuoteKV.f42044a.m52047g(), false) && (iM50113K3 = m50113K3(R$string.discover_emotion_chance)) >= 0 && (c4660d0M50143I3 = m50143I3()) != null && (slidingTabLayout = c4660d0M50143I3.f4276d) != null) {
                slidingTabLayout.m55282H(iM50113K3, 0);
            }
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            if (C12573b.f21598a.m23696a()) {
                "gesture_status".length();
            }
            C12572a.m23692a(viewLifecycleOwner, false, new C21566xbe4feaf3("gesture_status", null, this));
        }
        C4660d0 c4660d0M50143I14 = m50143I3();
        if (c4660d0M50143I14 != null && (quoteViewPager = c4660d0M50143I14.f4278f) != null) {
            quoteViewPager.addOnPageChangeListener(new C21565c());
        }
    }

    /* JADX INFO: renamed from: c4 */
    public final void m50155c4() {
        int i11;
        C4660d0 c4660d0M50143I3 = m50143I3();
        if (c4660d0M50143I3 == null) {
            return;
        }
        boolean zM58030b = C24129b.m58030b(SiteVisibleConfigKey.MarketWidget);
        boolean zM58030b2 = C24129b.m58030b(SiteVisibleConfigKey.IntelligentMonitoring);
        ImageView imageView = c4660d0M50143I3.f4275c;
        int i12 = 8;
        int iM6236a = 0;
        if (zM58030b) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView.setVisibility(i11);
        ImageView imageView2 = c4660d0M50143I3.f4274b;
        if (zM58030b2) {
            i12 = 0;
        }
        imageView2.setVisibility(i12);
        BaseTextView tvSearch = c4660d0M50143I3.f4277e;
        Intrinsics.checkNotNullExpressionValue(tvSearch, "tvSearch");
        ViewGroup.LayoutParams layoutParams = tvSearch.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (!zM58030b && !zM58030b2) {
                iM6236a = C5275i0.m6236a(16.0f);
            }
            layoutParams2.setMarginEnd(iM6236a);
            tvSearch.setLayoutParams(layoutParams2);
            if (zM58030b2) {
                m50145L3();
            }
            ImageView ivBack = c4660d0M50143I3.f4275c;
            Intrinsics.checkNotNullExpressionValue(ivBack, "ivBack");
            C27046k.m66711z(ivBack, 0L, new Function0() { // from class: com.kubi.quotefacade.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HomeMarketFragment.m50121d4();
                }
            }, 1, null);
            ImageView ivAlert = c4660d0M50143I3.f4274b;
            Intrinsics.checkNotNullExpressionValue(ivAlert, "ivAlert");
            C27046k.m66711z(ivAlert, 0L, new Function0() { // from class: com.kubi.quotefacade.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HomeMarketFragment.m50122e4(this.f41462b);
                }
            }, 1, null);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void lazyLoad() {
        String strM56237a0;
        Integer numM56227R;
        String strM56237a1;
        Intent intent;
        Intent intent2;
        Intent intent3;
        Intent intent4;
        Intent intent5;
        Intent intent6;
        String strM56237a2;
        String strM56237a3;
        Intent intent7;
        Intent intent8;
        Intent intent9;
        Intent intent10;
        Intent intent11;
        Intent intent12;
        Intent intent13;
        super.lazyLoad();
        FragmentActivity activity = getActivity();
        String strM56237a4 = null;
        if (activity != null && (intent13 = activity.getIntent()) != null) {
            strM56237a0 = RouteExKt.m56237a0(intent13, "mainTab");
        } else {
            strM56237a0 = null;
        }
        if (strM56237a0 != null && strM56237a0.length() != 0) {
            FragmentActivity activity2 = getActivity();
            if (activity2 != null && (intent12 = activity2.getIntent()) != null) {
                strM56237a2 = RouteExKt.m56237a0(intent12, "mainTab");
            } else {
                strM56237a2 = null;
            }
            String strM66668h = C27041f.m66668h(strM56237a2);
            FragmentActivity activity3 = getActivity();
            if (activity3 != null && (intent11 = activity3.getIntent()) != null) {
                strM56237a3 = RouteExKt.m56237a0(intent11, "subTab");
            } else {
                strM56237a3 = null;
            }
            String strM66668h2 = C27041f.m66668h(strM56237a3);
            FragmentActivity activity4 = getActivity();
            if (activity4 != null && (intent10 = activity4.getIntent()) != null) {
                strM56237a4 = RouteExKt.m56237a0(intent10, "info");
            }
            m50154b4(strM66668h, strM66668h2, C27041f.m66668h(strM56237a4));
            FragmentActivity activity5 = getActivity();
            if (activity5 != null && (intent9 = activity5.getIntent()) != null) {
                intent9.putExtra("mainTab", "");
            }
            FragmentActivity activity6 = getActivity();
            if (activity6 != null && (intent8 = activity6.getIntent()) != null) {
                intent8.putExtra("subTab", "");
            }
            FragmentActivity activity7 = getActivity();
            if (activity7 != null && (intent7 = activity7.getIntent()) != null) {
                intent7.putExtra("info", "");
            }
        } else {
            FragmentActivity activity8 = getActivity();
            if (activity8 != null && (intent6 = activity8.getIntent()) != null) {
                numM56227R = RouteExKt.m56227R(intent6, "type");
            } else {
                numM56227R = null;
            }
            int iM66651k = C27039d.m66651k(numM56227R, -1);
            FragmentActivity activity9 = getActivity();
            if (activity9 != null && (intent5 = activity9.getIntent()) != null) {
                strM56237a1 = RouteExKt.m56237a0(intent5, "market");
            } else {
                strM56237a1 = null;
            }
            String strM66668h3 = C27041f.m66668h(strM56237a1);
            FragmentActivity activity10 = getActivity();
            if (activity10 != null && (intent4 = activity10.getIntent()) != null) {
                strM56237a4 = RouteExKt.m56237a0(intent4, "index");
            }
            m50153a4(iM66651k, strM66668h3, C27041f.m66668h(strM56237a4));
            FragmentActivity activity11 = getActivity();
            if (activity11 != null && (intent3 = activity11.getIntent()) != null) {
                intent3.putExtra("type", OtcAd.KYC_NOT_PASS);
            }
            FragmentActivity activity12 = getActivity();
            if (activity12 != null && (intent2 = activity12.getIntent()) != null) {
                intent2.putExtra("market", "");
            }
            FragmentActivity activity13 = getActivity();
            if (activity13 != null && (intent = activity13.getIntent()) != null) {
                intent.putExtra("index", "");
            }
        }
        m50142D3();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onArguments(@Nullable final Bundle bundle) {
        String strM56239b0;
        Integer numM56228S;
        String strM56239b1;
        String strM56239b2;
        String strM56239b3;
        super.onArguments(bundle);
        String strM56239b4 = null;
        if (bundle != null) {
            strM56239b0 = RouteExKt.m56239b0(bundle, "mainTab");
        } else {
            strM56239b0 = null;
        }
        if (strM56239b0 != null && strM56239b0.length() != 0) {
            if (bundle != null) {
                strM56239b2 = RouteExKt.m56239b0(bundle, "mainTab");
            } else {
                strM56239b2 = null;
            }
            String strM66668h = C27041f.m66668h(strM56239b2);
            if (bundle != null) {
                strM56239b3 = RouteExKt.m56239b0(bundle, "subTab");
            } else {
                strM56239b3 = null;
            }
            String strM66668h2 = C27041f.m66668h(strM56239b3);
            if (bundle != null) {
                strM56239b4 = RouteExKt.m56239b0(bundle, "info");
            }
            m50154b4(strM66668h, strM66668h2, C27041f.m66668h(strM56239b4));
        } else {
            if (bundle != null) {
                numM56228S = RouteExKt.m56228S(bundle, "type");
            } else {
                numM56228S = null;
            }
            int iM66651k = C27039d.m66651k(numM56228S, -1);
            if (bundle != null) {
                strM56239b1 = RouteExKt.m56239b0(bundle, "market");
            } else {
                strM56239b1 = null;
            }
            String strM66668h3 = C27041f.m66668h(strM56239b1);
            if (bundle != null) {
                strM56239b4 = RouteExKt.m56239b0(bundle, "index");
            }
            m50153a4(iM66651k, strM66668h3, C27041f.m66668h(strM56239b4));
        }
        C24129b.m58033e(SiteVisibleConfigKey.CopyTrading, new Function0() { // from class: com.kubi.quotefacade.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeMarketFragment.m50116R3(bundle);
            }
        });
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        QuoteViewPager quoteViewPager;
        C4660d0 c4660d0M50143I3 = m50143I3();
        if (c4660d0M50143I3 != null && (quoteViewPager = c4660d0M50143I3.f4278f) != null) {
            quoteViewPager.setAdapter(null);
        }
        this.f40946X = null;
        this.f40948Z = null;
        this.f40949a0 = null;
        super.onDestroyView();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        C24129b.m58033e(SiteVisibleConfigKey.Futures, new Function0() { // from class: com.kubi.quotefacade.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeMarketFragment.m50117S3();
            }
        });
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m50149T3();
    }
}
