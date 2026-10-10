package com.kubi.home.rank.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.R$color;
import com.kubi.home.R$dimen;
import com.kubi.home.R$mipmap;
import com.kubi.home.R$string;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.DashTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.function.language.LanguageType;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27100x0;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27034h;
import com.kubi.utils.extensions.core.ViewExtKt;
import dj.C36719d;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.BiConsumer;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p311hf.C38184b;
import p739ww.C45938b;
import p830zf.InterfaceC46822s;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.Typography;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.home.rank.impl.x, reason: from Kotlin metadata */
/* JADX INFO: compiled from: RankWidget.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0016H\u0002J\r\u0010\u001c\u001a\u00020\u0016*\u00020\u0003H\u0082\bJ\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001aH\u0002J\u0016\u0010\u001f\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010 \u001a\u00020\u0014H\u0002J\b\u0010!\u001a\u00020\u0016H\u0002J\u0006\u0010\"\u001a\u00020\u0016J\b\u0010#\u001a\u00020\u0016H\u0002J\u0006\u0010$\u001a\u00020\u0016J\u0006\u0010%\u001a\u00020\u0016J\b\u0010&\u001a\u00020\u0011H\u0002J\u0006\u0010'\u001a\u00020\u001aJ\u001a\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u00112\b\b\u0002\u0010*\u001a\u00020+H\u0002J\u001b\u0010,\u001a\u00020\u0016*\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0082\bJ\u000e\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u00020+J\b\u00101\u001a\u00020\u0016H\u0002J\b\u00102\u001a\u00020\u0016H\u0002J\u0006\u00103\u001a\u00020\u0016J\u0006\u00104\u001a\u00020\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00065"}, m90084d2 = {"Lcom/kubi/home/rank/impl/RankWidget;", "", "rankFragmentContext", "Lcom/kubi/home/rank/impl/RankFragmentContext;", "<init>", "(Lcom/kubi/home/rank/impl/RankFragmentContext;)V", "getRankFragmentContext", "()Lcom/kubi/home/rank/impl/RankFragmentContext;", "setRankFragmentContext", "rankRepository", "Lcom/kubi/home/rank/impl/RankRepository;", "fragments", "Ljava/util/ArrayList;", "Lcom/kubi/sdk/BaseFragment;", "Lkotlin/collections/ArrayList;", "tabList", "", "Lcom/kubi/home/rank/impl/RankTab;", "getRakTab", ViewProps.POSITION, "", "popDepositDialog", "", "fragment", "Landroidx/fragment/app/Fragment;", "tip", "", "initUI", "handleRightTxtClick", "refreshTopBarText", "key", "subLength", "maxLength", "enableVolCoinNameClick", "enableChangeRateClick", "enableChangeRateClickForNewCoin", "disableCoinName", "disableChangeRate", "currentSelectTabEntity", "getCurrentKey", "handleTabClick", "rankTab", "isInitClick", "", "initViewPager", "lastFavHeight", "isExpand", "collapseOrExpand", "expand", "resetViewPagerHeight", "showSelectRankDialog", "onStartMove", "onIdle", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRankWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankWidget.kt\ncom/kubi/home/rank/impl/RankWidget\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 HomeStoreId.kt\ncom/kubi/home/common/ex/HomeStoreIdKt\n+ 4 StorageId.kt\ncom/kubi/utils/storage/StorageId\n+ 5 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,495:1\n399#1,8:512\n407#1,2:523\n410#1,2:526\n429#1:528\n430#1,5:530\n440#1:542\n170#1,13:568\n17#2,2:496\n17#2,2:498\n25#2,3:509\n109#3:500\n109#3:503\n109#3:506\n109#3:543\n109#3:546\n109#3:549\n109#3:581\n46#4:501\n46#4:504\n46#4:507\n46#4:544\n46#4:547\n46#4:550\n46#4:582\n67#5:502\n67#5:505\n67#5:508\n67#5:529\n67#5:545\n67#5:548\n67#5:551\n67#5:556\n58#5,2:583\n1563#6:520\n1634#6,2:521\n1636#6:525\n1563#6:552\n1634#6,3:553\n1869#6,2:564\n1869#6,2:566\n76#7,7:535\n76#7,7:557\n*S KotlinDebug\n*F\n+ 1 RankWidget.kt\ncom/kubi/home/rank/impl/RankWidget\n*L\n165#1:512,8\n165#1:523,2\n165#1:526,2\n165#1:528\n165#1:530,5\n165#1:542\n150#1:568,13\n53#1:496,2\n67#1:498,2\n152#1:509,3\n83#1:500\n96#1:503\n103#1:506\n205#1:543\n226#1:546\n242#1:549\n477#1:581\n83#1:501\n96#1:504\n103#1:507\n205#1:544\n226#1:547\n242#1:550\n477#1:582\n84#1:502\n97#1:505\n104#1:508\n165#1:529\n205#1:545\n226#1:548\n242#1:551\n429#1:556\n477#1:583,2\n165#1:520\n165#1:521,2\n165#1:525\n406#1:552\n406#1:553,3\n485#1:564,2\n491#1:566,2\n165#1:535,7\n434#1:557,7\n*E\n"})
public final class RankWidget {

    /* JADX INFO: renamed from: a */
    @NotNull
    public RankFragmentContext f26077a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final RankRepository f26078b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final ArrayList<BaseFragment> f26079c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public List<RankTab> f26080d;

    /* JADX INFO: renamed from: e */
    public int f26081e;

    /* JADX INFO: renamed from: f */
    public boolean f26082f;

    /* JADX INFO: renamed from: com.kubi.home.rank.impl.x$a */
    /* JADX INFO: compiled from: RankWidget.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017¨\u0006\u0006"}, m90084d2 = {"com/kubi/home/rank/impl/RankWidget$initUI$1$5", "Lcom/kubi/resources/widget/flyco/listener/OnTabSelectListener;", "onTabSelect", "", ViewProps.POSITION, "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends C45938b {
        public a() {
        }

        @Override // p739ww.C45938b
        @SuppressLint({"UseCompatLoadingForDrawables"})
        /* JADX INFO: renamed from: b */
        public void mo18273b(int i11) {
            super.mo18273b(i11);
            RankWidget rankWidget = RankWidget.this;
            RankWidget.m30008s(rankWidget, rankWidget.m30022p(i11), false, 2, null);
        }
    }

    public RankWidget(@NotNull RankFragmentContext rankFragmentContext) {
        int i11;
        ArrayList<BaseFragment> arrayListArrayListOf;
        List<RankTab> listListOf;
        Intrinsics.checkNotNullParameter(rankFragmentContext, "rankFragmentContext");
        this.f26077a = rankFragmentContext;
        this.f26078b = new RankRepository();
        Router router = Router.f46192a;
        SiteInfoManager siteInfoManager = SiteInfoManager.f47913a;
        Object objM56186h = router.m56186h(InterfaceC46822s.class, siteInfoManager.m58109c());
        if (objM56186h == null || (arrayListArrayListOf = ((InterfaceC46822s) objM56186h).m103151c()) == null) {
            BaseFragment baseFragmentMo50720y = IQuoteFacadeService.f41383a.get().mo50720y("HOME_RANK");
            RankFragment.Companion companion = RankFragment.f25998a0;
            i11 = 4;
            arrayListArrayListOf = CollectionsKt.arrayListOf(baseFragmentMo50720y, companion.newInstance("HOT"), companion.newInstance("UP"), companion.newInstance("new_coin"), companion.newInstance("VOL"), companion.newInstance("DOWN"));
        } else {
            i11 = 4;
        }
        this.f26079c = arrayListArrayListOf;
        Object objM56186h2 = router.m56186h(InterfaceC46822s.class, siteInfoManager.m58109c());
        if (objM56186h2 == null || (listListOf = ((InterfaceC46822s) objM56186h2).m103152d()) == null) {
            C27017c c27017c = C27017c.f54310a;
            RankTab rankTab = new RankTab("FAV", 0, 0, c27017c.m66516f(R$string.favorites, new Object[0]));
            RankTab rankTab2 = new RankTab("HOT", 1, 1, c27017c.m66516f(R$string.rank_hot, new Object[0]));
            C36719d c36719d = C36719d.f79632a;
            StorageId<Integer> storageIdM82275t = c36719d.m82275t();
            RankTab rankTab3 = new RankTab("UP", C46392a.m102323e(new StorageId(storageIdM82275t.getCategory(), storageIdM82275t.getKey() + "UP", storageIdM82275t.getStorageType(), storageIdM82275t.getSupportLegacy()), 2), 2, c27017c.m66516f(R$string.rank_gainers, new Object[0]));
            RankTab rankTab4 = new RankTab("new_coin", 8, 8, c27017c.m66516f(R$string.rank_tab_new, new Object[0]));
            StorageId<Integer> storageIdM82275t2 = c36719d.m82275t();
            StorageId storageId = new StorageId(storageIdM82275t2.getCategory(), storageIdM82275t2.getKey() + "VOL", storageIdM82275t2.getStorageType(), storageIdM82275t2.getSupportLegacy());
            int i12 = i11;
            RankTab rankTab5 = new RankTab("VOL", C46392a.m102323e(storageId, i12), i12, c27017c.m66516f(R$string.rank_volume, new Object[0]));
            StorageId<Integer> storageIdM82275t3 = c36719d.m82275t();
            listListOf = CollectionsKt.listOf((Object[]) new RankTab[]{rankTab, rankTab2, rankTab3, rankTab4, rankTab5, new RankTab("DOWN", C46392a.m102323e(new StorageId(storageIdM82275t3.getCategory(), storageIdM82275t3.getKey() + "DOWN", storageIdM82275t3.getStorageType(), storageIdM82275t3.getSupportLegacy()), 6), 6, c27017c.m66516f(R$string.rank_losers, new Object[0]))});
        }
        this.f26080d = listListOf;
        m30025t();
        this.f26081e = C27040e.m66658b(280);
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m29998B(RankWidget rankWidget) {
        int iM66633d;
        CustomViewPager customViewPagerM29980j = rankWidget.f26077a.m29980j();
        if (Intrinsics.areEqual(rankWidget.f26080d.get(customViewPagerM29980j.getCurrentItem()).getKey(), "FAV")) {
            iM66633d = rankWidget.f26081e;
        } else {
            Context context = customViewPagerM29980j.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iM66633d = (rankWidget.f26082f ? 10 : 5) * C27034h.m66633d(context, R$dimen.trade_cell_height);
        }
        ViewExtKt.m66578i(customViewPagerM29980j, iM66633d);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ String m30000F(RankWidget rankWidget, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 19;
        }
        return rankWidget.m30013E(str, i11);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m30008s(RankWidget rankWidget, RankTab rankTab, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        rankWidget.m30024r(rankTab, z11);
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m30009u(RankWidget rankWidget, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rankWidget.f26078b.m29876m(rankWidget.m30021o());
        rankWidget.m30012C();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m30010v(RankWidget rankWidget, RankFragmentContext rankFragmentContext, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rankWidget.f26078b.m29876m(rankWidget.m30021o());
        if (Intrinsics.areEqual(rankWidget.m30021o(), "new_coin")) {
            rankWidget.m30028y(rankFragmentContext.m29973c(), rankFragmentContext.m29979i(R$string.newcoin_calculation_of_changes) + ' ' + rankFragmentContext.m29979i(R$string.newcoin_calculation_way));
        } else {
            rankWidget.m30012C();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final void m30011A() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.rank.impl.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankWidget.m29998B(this.f26072b);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public final void m30012C() {
        final RankTab rankTab = this.f26080d.get(this.f26077a.m29978h().getCurrentTab());
        final String key = rankTab.getKey();
        final List<BottomSheetDialogHelper.InterfaceC24339a> listM29865b = this.f26078b.m29865b(key, this.f26080d.get(this.f26077a.m29978h().getCurrentTab()).getDefaultType());
        DialogFragmentHelper dialogFragmentHelperM58944B = BottomSheetDialogHelper.m58944B(BottomSheetDialogHelper.f48599a, listM29865b, new BiConsumer() { // from class: com.kubi.home.rank.impl.w
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                RankWidget.m29999D(listM29865b, this, key, rankTab, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, false, null, null, false, 60, null);
        FragmentManager childFragmentManager = this.f26077a.m29973c().getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM58944B.show(childFragmentManager, "showRankChangeDialog");
    }

    /* JADX INFO: renamed from: h */
    public final void m30014h(boolean z11) {
        this.f26082f = z11;
        m30011A();
    }

    /* JADX INFO: renamed from: i */
    public final RankTab m30015i() {
        return this.f26080d.get(this.f26077a.m29978h().getCurrentTab());
    }

    /* JADX INFO: renamed from: j */
    public final void m30016j() {
        RankFragmentContext rankFragmentContext = this.f26077a;
        rankFragmentContext.m29971a().setNeedDash(false);
        C14768b.m29930c(rankFragmentContext.m29971a());
        rankFragmentContext.m29971a().setClickable(false);
    }

    /* JADX INFO: renamed from: k */
    public final void m30017k() {
        RankFragmentContext rankFragmentContext = this.f26077a;
        rankFragmentContext.m29972b().setNeedDash(false);
        C14768b.m29930c(rankFragmentContext.m29972b());
        rankFragmentContext.m29972b().setClickable(false);
    }

    /* JADX INFO: renamed from: l */
    public final void m30018l() {
        RankFragmentContext rankFragmentContext = this.f26077a;
        rankFragmentContext.m29971a().setClickable(true);
        DashTextView dashTextViewM29971a = rankFragmentContext.m29971a();
        Drawable drawableM29974d = rankFragmentContext.m29974d(R$mipmap.ic_drop_triangle);
        drawableM29974d.setColorFilter(rankFragmentContext.m29973c().getResources().getColor(R$color.emphasis20), PorterDuff.Mode.SRC_IN);
        C14768b.m29933f(dashTextViewM29971a, drawableM29974d);
        rankFragmentContext.m29971a().setNeedDash(false);
        m30017k();
    }

    /* JADX INFO: renamed from: m */
    public final void m30019m() {
        RankFragmentContext rankFragmentContext = this.f26077a;
        rankFragmentContext.m29971a().setClickable(true);
        C14768b.m29930c(rankFragmentContext.m29971a());
        rankFragmentContext.m29971a().setNeedDash(true);
        m30017k();
    }

    /* JADX INFO: renamed from: n */
    public final void m30020n() {
        RankFragmentContext rankFragmentContext = this.f26077a;
        rankFragmentContext.m29972b().setClickable(true);
        rankFragmentContext.m29972b().setNeedDash(false);
        DashTextView dashTextViewM29972b = rankFragmentContext.m29972b();
        Drawable drawableM29974d = rankFragmentContext.m29974d(R$mipmap.ic_drop_triangle);
        drawableM29974d.setColorFilter(rankFragmentContext.m29973c().getResources().getColor(R$color.emphasis20), PorterDuff.Mode.SRC_IN);
        C14768b.m29933f(dashTextViewM29972b, drawableM29974d);
        m30016j();
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final RankTab m30022p(int i11) {
        return this.f26080d.get(i11);
    }

    @NotNull
    /* JADX INFO: renamed from: q, reason: from getter */
    public final RankFragmentContext getF26077a() {
        return this.f26077a;
    }

    /* JADX INFO: renamed from: t */
    public final void m30025t() {
        final RankFragmentContext rankFragmentContext = this.f26077a;
        String strM86147b = C38184b.f85884a.m86147b();
        if (strM86147b.length() > 0) {
            String string = rankFragmentContext.m29973c().getString(R$string.rank_volume_new_price_any, strM86147b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            rankFragmentContext.m29977g().setText(string);
        }
        ViewExtKt.m66575f(rankFragmentContext.m29972b(), new Function1() { // from class: com.kubi.home.rank.impl.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RankWidget.m30009u(this.f26069b, (View) obj);
            }
        });
        ViewExtKt.m66575f(rankFragmentContext.m29971a(), new Function1() { // from class: com.kubi.home.rank.impl.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RankWidget.m30010v(this.f26070b, rankFragmentContext, (View) obj);
            }
        });
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46822s.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((InterfaceC46822s) objM56186h).m103153e(this);
        } else {
            m30016j();
        }
        m30017k();
        rankFragmentContext.m29978h().setNeedBold(true);
        rankFragmentContext.m29978h().setTextBold(1);
        rankFragmentContext.m29978h().setOnTabSelectListener(new a());
        List<RankTab> list = this.f26080d;
        rankFragmentContext.m29980j().setScanScroll(true);
        if (this.f26079c.size() > 2) {
            rankFragmentContext.m29980j().setOffscreenPageLimit(this.f26079c.size() - 1);
        }
        CustomViewPager customViewPagerM29980j = rankFragmentContext.m29980j();
        FragmentManager childFragmentManager = rankFragmentContext.m29973c().getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        ArrayList<BaseFragment> arrayList = this.f26079c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (RankTab rankTab : list) {
            C44128b.m97259c("RankTitle", rankTab.getTitle());
            arrayList2.add(rankTab.getTitle());
        }
        customViewPagerM29980j.setAdapter(new C27103z(childFragmentManager, arrayList, arrayList2));
        rankFragmentContext.m29978h().setViewPager(rankFragmentContext.m29980j());
        rankFragmentContext.m29980j().addOnPageChangeListener(new C14800y(this));
        int iCoerceAtMost = RangesKt.coerceAtMost(C46392a.m102323e(C36719d.f79632a.m82272q(), 1), list.size() - 1);
        rankFragmentContext.m29978h().setCurrentTab(iCoerceAtMost);
        m30024r(m30022p(iCoerceAtMost), true);
        Fragment fragmentM29973c = rankFragmentContext.m29973c();
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.home.event.HomeEvent:RankFavContentHeight".length();
        }
        C12572a.m23692a(fragmentM29973c, false, new RankWidget$initViewPager$$inlined$bindFlowEvent$default$1("com.kubi.home.event.HomeEvent:RankFavContentHeight", null, this));
    }

    /* JADX INFO: renamed from: w */
    public final void m30026w() {
        for (BaseFragment baseFragment : this.f26079c) {
            RankFragment rankFragment = baseFragment instanceof RankFragment ? (RankFragment) baseFragment : null;
            if (rankFragment != null) {
                rankFragment.m29850v3();
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m30027x() {
        for (BaseFragment baseFragment : this.f26079c) {
            RankFragment rankFragment = baseFragment instanceof RankFragment ? (RankFragment) baseFragment : null;
            if (rankFragment != null) {
                rankFragment.m29851w3();
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m30028y(Fragment fragment, String str) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54156M4(str).m54162S4(R$string.already_know, null).m54172c5(fragment.getChildFragmentManager());
    }

    /* JADX INFO: renamed from: z */
    public final void m30029z(String str) {
        if (Intrinsics.areEqual(str, "FAV")) {
            RankFragmentContext rankFragmentContext = this.f26077a;
            C27046k.m66700o(rankFragmentContext.m29976f());
            C27046k.m66700o(rankFragmentContext.m29975e());
            return;
        }
        C27046k.m66685H(this.f26077a.m29976f());
        C27046k.m66685H(this.f26077a.m29975e());
        if (Intrinsics.areEqual(str, "HOT")) {
            RankFragmentContext rankFragmentContext2 = this.f26077a;
            rankFragmentContext2.m29972b().setText(rankFragmentContext2.m29979i(R$string.rank_hot_coin));
            rankFragmentContext2.m29971a().setText(rankFragmentContext2.m29979i(R$string.rank_24_change));
        }
        if (Intrinsics.areEqual(str, "VOL")) {
            StorageId<Integer> storageIdM82275t = C36719d.f79632a.m82275t();
            if (C46392a.m102323e(new StorageId(storageIdM82275t.getCategory(), storageIdM82275t.getKey() + str, storageIdM82275t.getStorageType(), storageIdM82275t.getSupportLegacy()), 4) == 5) {
                RankFragmentContext rankFragmentContext3 = this.f26077a;
                rankFragmentContext3.m29972b().setText(m30000F(this, rankFragmentContext3.m29979i(R$string.trade_pair) + '/' + rankFragmentContext3.m29979i(R$string.rank_7d_vol), 0, 1, null));
                rankFragmentContext3.m29971a().setText(rankFragmentContext3.m29979i(R$string.rank_24_change));
            } else {
                RankFragmentContext rankFragmentContext4 = this.f26077a;
                rankFragmentContext4.m29972b().setText(m30000F(this, rankFragmentContext4.m29979i(R$string.trade_pair) + '/' + rankFragmentContext4.m29979i(R$string.rank_24_vol), 0, 1, null));
                rankFragmentContext4.m29971a().setText(rankFragmentContext4.m29979i(R$string.rank_24_change));
            }
        }
        int i11 = MultiLanguageManager.f46811g == LanguageType.f46797RU ? 13 : 16;
        if (Intrinsics.areEqual(str, "UP")) {
            StorageId<Integer> storageIdM82275t2 = C36719d.f79632a.m82275t();
            if (C46392a.m102323e(new StorageId(storageIdM82275t2.getCategory(), storageIdM82275t2.getKey() + str, storageIdM82275t2.getStorageType(), storageIdM82275t2.getSupportLegacy()), 2) == 3) {
                RankFragmentContext rankFragmentContext5 = this.f26077a;
                rankFragmentContext5.m29971a().setText(m30013E(rankFragmentContext5.m29979i(R$string.rank_7d_change), i11));
                rankFragmentContext5.m29972b().setText(rankFragmentContext5.m29979i(R$string.rank_hot_coin));
            } else {
                RankFragmentContext rankFragmentContext6 = this.f26077a;
                rankFragmentContext6.m29971a().setText(rankFragmentContext6.m29979i(R$string.rank_24_change));
                rankFragmentContext6.m29972b().setText(rankFragmentContext6.m29979i(R$string.rank_hot_coin));
            }
        }
        if (Intrinsics.areEqual(str, "DOWN")) {
            StorageId<Integer> storageIdM82275t3 = C36719d.f79632a.m82275t();
            if (C46392a.m102323e(new StorageId(storageIdM82275t3.getCategory(), storageIdM82275t3.getKey() + str, storageIdM82275t3.getStorageType(), storageIdM82275t3.getSupportLegacy()), 6) == 7) {
                RankFragmentContext rankFragmentContext7 = this.f26077a;
                rankFragmentContext7.m29971a().setText(m30013E(rankFragmentContext7.m29979i(R$string.rank_7d_change), i11));
                rankFragmentContext7.m29972b().setText(rankFragmentContext7.m29979i(R$string.rank_hot_coin));
            } else {
                RankFragmentContext rankFragmentContext8 = this.f26077a;
                rankFragmentContext8.m29971a().setText(rankFragmentContext8.m29979i(R$string.rank_24_change));
                rankFragmentContext8.m29972b().setText(rankFragmentContext8.m29979i(R$string.rank_hot_coin));
            }
        }
        if (Intrinsics.areEqual(str, "new_coin")) {
            RankFragmentContext rankFragmentContext9 = this.f26077a;
            rankFragmentContext9.m29971a().setText(rankFragmentContext9.m29979i(R$string.newcoin_change_since_listing));
            rankFragmentContext9.m29972b().setText(m30000F(this, rankFragmentContext9.m29979i(R$string.newcoin_coin) + '/' + rankFragmentContext9.m29979i(R$string.newcoin_change_rate_24h), 0, 1, null));
        }
    }

    /* JADX INFO: renamed from: D */
    public static final void m29999D(List list, RankWidget rankWidget, String str, RankTab rankTab, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        int i11 = Integer.parseInt(((BottomSheetDialogHelper.InterfaceC24339a) list.get(baseViewHolder.getAdapterPosition())).getValue());
        if (i11 != rankWidget.f26078b.m29866c(str)) {
            StorageId<Integer> storageIdM82275t = C36719d.f79632a.m82275t();
            C46392a.m102329l(new StorageId(storageIdM82275t.getCategory(), storageIdM82275t.getKey() + str, storageIdM82275t.getStorageType(), storageIdM82275t.getSupportLegacy()), i11);
            rankWidget.m30029z(str);
            C12572a.m23695d("change_rank_type", RankTab.m29992b(rankTab, null, i11, 0, null, 13, null), 0L, 4, null);
        }
    }

    /* JADX INFO: renamed from: E */
    public final String m30013E(String str, int i11) {
        if (str.length() > i11) {
            StringBuilder sb2 = new StringBuilder();
            String strSubstring = str.substring(0, i11 - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sb2.append(strSubstring);
            sb2.append(Typography.ellipsis);
            return sb2.toString();
        }
        return str;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final String m30021o() {
        return m30015i().getKey();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: r */
    public final void m30024r(RankTab rankTab, boolean z11) {
        String key = rankTab.getKey();
        switch (key.hashCode()) {
            case 2715:
                if (key.equals("UP")) {
                    this.f26078b.m29871h("upRankButton");
                    m30018l();
                    m30029z(rankTab.getKey());
                }
                break;
            case 69371:
                if (key.equals("FAV")) {
                    m30029z(rankTab.getKey());
                    if (!z11) {
                        this.f26078b.m29871h("favoritesRankButton");
                    }
                }
                break;
            case 71725:
                if (key.equals("HOT")) {
                    this.f26078b.m29871h("hotRankButton");
                    m30016j();
                    m30017k();
                    m30029z(rankTab.getKey());
                }
                break;
            case 85171:
                if (key.equals("VOL")) {
                    this.f26078b.m29871h("volumeRankButton");
                    m30020n();
                    m30029z(rankTab.getKey());
                }
                break;
            case 2104482:
                if (key.equals("DOWN")) {
                    this.f26078b.m29871h("downRankButton");
                    m30018l();
                    m30029z(rankTab.getKey());
                }
                break;
            case 1376829904:
                if (key.equals("new_coin")) {
                    this.f26078b.m29871h("newCoinButton");
                    m30019m();
                    m30029z(rankTab.getKey());
                }
                break;
        }
        this.f26077a.m29980j().requestLayout();
    }
}
