package com.kubi.kumex.trade;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.google.gson.reflect.TypeToken;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizType;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.RobotSiteConfigEntity;
import com.kubi.kumex.helper.BadgeHelper;
import com.kubi.kumex.helper.KuMEXUpgrade;
import com.kubi.kumex.trade.menu.MenuItem;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.extensions.C27025c;
import fm.C37567b;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p294gz.C38057a;
import p569qq.C43846g;
import p801yl.C46527h0;
import p830zf.InterfaceC46810m;
import p836zl.C46894j;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tm.C45042a;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.kumex.trade.k3 */
/* JADX INFO: compiled from: FuturesFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000\u001a\u001a\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017*\u00020\u0001\u001a\u001a\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017*\u00020\u0001\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"findFuturesFragment", "Lcom/kubi/kumex/trade/FuturesFragment;", "Landroidx/fragment/app/Fragment;", "FUTURES_TRANSFER_MEMU_ID", "", "FUTURES_TRADE_UNIT_MENU_ID", "FUTURES_TUTORIAL_MENU_ID", "FUTURES_PREFERENCE_MENU_ID", "FUTURES_COUPON_MENU_ID", "FUTURES_FUNDING_RATE_MENU_ID", "FUTURES_CALCULATOR_MENU_ID", "FUTURES_ROBOT_MENU_ID", "FUTURES_RISK_LIMIT_MENU_ID", "TRADING_RULES_MEMU_ID", "INDEX_PRICE_MEMU_ID", "FUNDING_RATE_MEMU_ID", "STABLE_ARBITRAGE_MEMU_ID", "INSURANCE_FUND_MEMU_ID", "RISK_LIMIT_MEMU_ID", "KUCOIN_INDEX_PRICE_MEMU_ID", "getDataItems", "Ljava/util/ArrayList;", "Lcom/kubi/kumex/trade/menu/MenuItem;", "Lkotlin/collections/ArrayList;", "FUTURES_PNL_ANALYZER_MENU_ID", "FUTURES_MOCK_MENU_ID", "FUTURES_TRIAL_FUNDS_MENU_ID", "getMenuItems", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesFragment.kt\ncom/kubi/kumex/trade/FuturesFragmentKt\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 KVStore.kt\ncom/kubi/utils/storage/KVStore\n+ 4 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 5 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 6 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,2545:1\n153#2,2:2546\n178#3:2548\n25#4,3:2549\n35#5,4:2552\n39#5:2558\n44#6,2:2556\n*S KotlinDebug\n*F\n+ 1 FuturesFragment.kt\ncom/kubi/kumex/trade/FuturesFragmentKt\n*L\n2447#1:2546,2\n2447#1:2548\n2469#1:2549,3\n2501#1:2552,4\n2501#1:2558\n2501#1:2556,2\n*E\n"})
public final class C16893k3 {

    /* JADX INFO: renamed from: com.kubi.kumex.trade.k3$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.kumex.trade.k3$b */
    /* JADX INFO: compiled from: FuturesFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f30539b;

        public b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f30539b = function;
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
            return this.f30539b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f30539b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final FuturesFragment m36300a(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        if (fragment instanceof FuturesFragment) {
            return (FuturesFragment) fragment;
        }
        Fragment parentFragment = fragment.getParentFragment();
        if (parentFragment != null) {
            return m36300a(parentFragment);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final ArrayList<MenuItem> m36301b(@NotNull FuturesFragment futuresFragment) {
        Intrinsics.checkNotNullParameter(futuresFragment, "<this>");
        int i11 = R$drawable.ic2_documents_20;
        String string = futuresFragment.getString(R$string.bkumex_trading_rules);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        C45042a c45042a = C45042a.f101445a;
        MenuItem menuItem = new MenuItem(1001, i11, string, null, false, c45042a.m99620h(), 24, null);
        int i12 = R$drawable.ic2_trade_information_20;
        String string2 = futuresFragment.getString(R$string.contract_price_index_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        MenuItem menuItem2 = new MenuItem(1002, i12, string2, null, false, c45042a.m99614b(), 24, null);
        int i13 = R$drawable.ic2_index_price_20;
        String string3 = futuresFragment.getString(R$string.contract_kucoin_index_title);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        MenuItem menuItem3 = new MenuItem(1007, i13, string3, null, false, C24129b.m58030b(SiteVisibleConfigKey.TradingInfoIndexPriceSpotPrice), 24, null);
        int i14 = R$drawable.ic2_tradefee_20;
        String string4 = futuresFragment.getString(R$string.bkumex_funding);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        ArrayList<MenuItem> arrayListArrayListOf = CollectionsKt.arrayListOf(menuItem, menuItem2, menuItem3, new MenuItem(1003, i14, string4, null, false, c45042a.m99613a(), 24, null));
        if (C38057a.f85671a.m85928a("kcApp.B6FuturesTrade.More.arbitrageportfolios.1", true)) {
            int i15 = R$drawable.ic2_kcsfee_20;
            String string5 = futuresFragment.getString(R$string.bkmex__information_stable_arbitrage);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            arrayListArrayListOf.add(new MenuItem(1004, i15, string5, null, false, c45042a.m99619g(), 24, null));
        }
        int i16 = R$drawable.ic2_security_setting_20;
        String string6 = futuresFragment.getString(R$string.bkmex__information_insurance_fund);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        arrayListArrayListOf.add(new MenuItem(1005, i16, string6, null, false, c45042a.m99615c(), 24, null));
        int i17 = R$drawable.ic2_security_warning_20;
        String string7 = futuresFragment.getString(R$string.kumex_risk_limit);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        arrayListArrayListOf.add(new MenuItem(1006, i17, string7, null, false, c45042a.m99618f(), 24, null));
        return arrayListArrayListOf;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x026e  */
    /* JADX WARN: Code duplicated, block: B:58:0x027a  */
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final ArrayList<MenuItem> m36302c(@NotNull FuturesFragment futuresFragment) {
        Intrinsics.checkNotNullParameter(futuresFragment, "<this>");
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        int i11 = R$drawable.ic2_setting_20;
        String stringRes = futuresFragment.getStringRes(R$string.kumex_trading_perferences, new Object[0]);
        int i12 = R$color.c_text;
        arrayList.add(new MenuItem(5, i11, stringRes, Integer.valueOf(futuresFragment.getColorRes(i12)), false, false, 48, null));
        int i13 = R$drawable.ic2_calculator_20;
        String stringRes2 = futuresFragment.getStringRes(R$string.calculator, new Object[0]);
        Integer numValueOf = Integer.valueOf(futuresFragment.getColorRes(i12));
        BrokerConfig brokerConfig = BrokerConfig.f19211a;
        arrayList.add(new MenuItem(8, i13, stringRes2, numValueOf, false, brokerConfig.m20201d().mo20231S0().contains("calculator"), 16, null));
        Object objM20457a = null;
        if (!KuMEXUpgrade.m34085e(KuMEXUpgrade.f29306a, null, 1, null) && !futuresFragment.m36141E0()) {
            arrayList.add(new MenuItem(2, R$drawable.ic2_transfer_20, C37567b.m84620j(C46527h0.f104291a.m102673I()) + ' ' + futuresFragment.getStringRes(R$string.transfer, new Object[0]), Integer.valueOf(futuresFragment.getColorRes(i12)), false, false, 48, null));
        }
        ContractEntity contractEntityM102673I = C46527h0.f104291a.m102673I();
        if (!C27025c.m66566d(contractEntityM102673I != null ? Boolean.valueOf(contractEntityM102673I.isInverse()) : null)) {
            arrayList.add(new MenuItem(3, R$drawable.ic2_unit_20, futuresFragment.getStringRes(R$string.trade_unit, new Object[0]) + '(' + futuresFragment.m36173d6() + ')', Integer.valueOf(futuresFragment.getColorRes(i12)), false, false, 48, null));
        }
        if (!futuresFragment.m36141E0() && C24129b.m58030b(SiteVisibleConfigKey.TradingBot)) {
            RobotSiteConfigEntity robotSiteConfigEntity = (RobotSiteConfigEntity) C46392a.f104043a.m102336j(C46894j.f104736a.m103252Q(), RobotSiteConfigEntity.class, null);
            if (C27025c.m66566d(robotSiteConfigEntity != null ? robotSiteConfigEntity.isSupportFutures() : null)) {
                arrayList.add(new MenuItem(9, R$drawable.ic2_roboto_20, futuresFragment.getStringRes(R$string.robot, new Object[0]), Integer.valueOf(futuresFragment.getColorRes(i12)), false, brokerConfig.m20201d().mo20231S0().contains("tradingBot"), 16, null));
            }
        }
        arrayList.add(new MenuItem(7, R$drawable.ic2_trading_fee_level_20, futuresFragment.getStringRes(R$string.funds_costs, new Object[0]), Integer.valueOf(futuresFragment.getColorRes(i12)), false, brokerConfig.m20201d().mo20231S0().contains("fundingRate"), 16, null));
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46810m.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((InterfaceC46810m) objM56186h).m103141b(arrayList);
        } else {
            int i14 = R$drawable.ic2_coupons_20;
            String strM36166X5 = futuresFragment.m36166X5();
            Integer numValueOf2 = Integer.valueOf(futuresFragment.getColorRes(i12));
            MultiBizType multiBizTypeM36172c6 = futuresFragment.m36172c6();
            MultiBizType multiBizType = MultiBizType.UNIFIED;
            arrayList.add(new MenuItem(6, i14, strM36166X5, numValueOf2, multiBizTypeM36172c6 != multiBizType && futuresFragment.m36158S7(), futuresFragment.m36172c6() == multiBizType || (brokerConfig.m20201d().mo20231S0().contains("bonus") && C38057a.f85671a.m85928a("kcApp.B6FuturesTrade.futures.perks", true))));
        }
        if (BadgeHelper.f29249a.m33971r()) {
            if (IUnifyAccountService.f53155a.get().mo64979C()) {
                try {
                    RemoteConfig remoteConfig = RemoteConfig.f19636a;
                    Type type = new a().getType();
                    Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                    objM20457a = RemoteConfig.m20457a("asset_uta_pnl", type);
                } catch (Throwable th2) {
                    C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
                }
                if (C27025c.m66567e((Boolean) objM20457a, false)) {
                    arrayList.add(new MenuItem(11, R$drawable.ic2_asset_overview_20, futuresFragment.getStringRes(R$string.futures_pnl_analyze, new Object[0]), Integer.valueOf(futuresFragment.getColorRes(R$color.c_text)), BadgeHelper.f29249a.m33969p(), false, 32, null));
                } else if (!IUnifyAccountService.f53155a.get().mo64979C()) {
                    arrayList.add(new MenuItem(11, R$drawable.ic2_asset_overview_20, futuresFragment.getStringRes(R$string.futures_pnl_analyze, new Object[0]), Integer.valueOf(futuresFragment.getColorRes(R$color.c_text)), BadgeHelper.f29249a.m33969p(), false, 32, null));
                }
            } else if (!IUnifyAccountService.f53155a.get().mo64979C()) {
                arrayList.add(new MenuItem(11, R$drawable.ic2_asset_overview_20, futuresFragment.getStringRes(R$string.futures_pnl_analyze, new Object[0]), Integer.valueOf(futuresFragment.getColorRes(R$color.c_text)), BadgeHelper.f29249a.m33969p(), false, 32, null));
            }
        }
        arrayList.add(new MenuItem(12, R$drawable.ic2_coupons_thin_20, futuresFragment.getStringRes(R$string.kuemx_lead_trial_title, new Object[0]), Integer.valueOf(futuresFragment.getColorRes(R$color.c_text)), futuresFragment.m36160T7(), C45042a.f101445a.m99621i() && futuresFragment.m36172c6() == MultiBizType.COPY_TRADING));
        return arrayList;
    }
}
