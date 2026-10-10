package lb;

import com.kubi.assets.entity.HomeAssetInfo;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.storage.StorageType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import y70.StorageId;

/* JADX INFO: renamed from: lb.h */
/* JADX INFO: compiled from: StorageIds.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b*\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\tR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00078F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\tR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00078F¢\u0006\u0006\u001a\u0004\b \u0010\tR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\tR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00078F¢\u0006\u0006\u001a\u0004\b$\u0010\tR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00078F¢\u0006\u0006\u001a\u0004\b&\u0010\tR\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\tR\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\tR\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00078F¢\u0006\u0006\u001a\u0004\b,\u0010\tR\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\tR\u0017\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00078F¢\u0006\u0006\u001a\u0004\b1\u0010\tR\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078F¢\u0006\u0006\u001a\u0004\b3\u0010\tR\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078F¢\u0006\u0006\u001a\u0004\b5\u0010\tR\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078F¢\u0006\u0006\u001a\u0004\b7\u0010\tR\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\tR\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00078F¢\u0006\u0006\u001a\u0004\b;\u0010\tR\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00078F¢\u0006\u0006\u001a\u0004\b=\u0010\tR\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00078F¢\u0006\u0006\u001a\u0004\b?\u0010\tR\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00078F¢\u0006\u0006\u001a\u0004\bA\u0010\tR\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00078F¢\u0006\u0006\u001a\u0004\bC\u0010\tR\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00078F¢\u0006\u0006\u001a\u0004\bE\u0010\tR\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0007¢\u0006\b\n\u0000\u001a\u0004\bG\u0010\tR\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0007¢\u0006\b\n\u0000\u001a\u0004\bI\u0010\tR\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078F¢\u0006\u0006\u001a\u0004\bK\u0010\tR\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078F¢\u0006\u0006\u001a\u0004\bM\u0010\tR\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00078F¢\u0006\u0006\u001a\u0004\bO\u0010\tR\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00078F¢\u0006\u0006\u001a\u0004\bQ\u0010\tR\u0017\u0010R\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00078F¢\u0006\u0006\u001a\u0004\bS\u0010\tR\u0017\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078F¢\u0006\u0006\u001a\u0004\bU\u0010\tR\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078F¢\u0006\u0006\u001a\u0004\bW\u0010\tR\u0017\u0010X\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00078F¢\u0006\u0006\u001a\u0004\bY\u0010\t¨\u0006Z"}, m90084d2 = {"Lcom/kubi/assets/utils/StorageIds;", "", "<init>", "()V", "CATEGORY", "", "LINE_CHART_RANGE", "Lcom/kubi/utils/storage/StorageId;", "getLINE_CHART_RANGE", "()Lcom/kubi/utils/storage/StorageId;", "PNL_METHOD", "getPNL_METHOD", "DEPOSIT_KEY_HISTORY_LIST", "getDEPOSIT_KEY_HISTORY_LIST", "WITHDRAW_KEY_HISTORY_LIST", "getWITHDRAW_KEY_HISTORY_LIST", "V5_KEY_HISTORY_LIST", "getV5_KEY_HISTORY_LIST", "DEPOSIT_COIN_LIST", "getDEPOSIT_COIN_LIST", "SMALL_COIN", "getSMALL_COIN", "HOT_SEARCH", "getHOT_SEARCH", "WITHDRAW_COIN_LIST", "getWITHDRAW_COIN_LIST", "SHOW_HIDE_ASSET_SWITCH", "", "getSHOW_HIDE_ASSET_SWITCH", "PNL_METHOD_NEW_TIP_DISMISSED", "getPNL_METHOD_NEW_TIP_DISMISSED", "MAIN_HIDE_SMALL_COIN_SWITCH", "getMAIN_HIDE_SMALL_COIN_SWITCH", "MARGIN_SHOW_SINGLE_PAGE", "getMARGIN_SHOW_SINGLE_PAGE", "MARGIN_HIDE_SMALL_COIN_SWITCH", "getMARGIN_HIDE_SMALL_COIN_SWITCH", "ISOLATED_HIDE_SMALL_COIN_SWITCH", "getISOLATED_HIDE_SMALL_COIN_SWITCH", "HIDE_ZERO_ASSET", "getHIDE_ZERO_ASSET", "ASSET_NEW_USER_GUIDE", "getASSET_NEW_USER_GUIDE", "SPOT_HIDE_SMALL_COIN_SWITCH", "getSPOT_HIDE_SMALL_COIN_SWITCH", "SHOW_WITHDRAW_IN_OUT", "getSHOW_WITHDRAW_IN_OUT", "HOME_ASSET_INFO", "Lcom/kubi/assets/entity/HomeAssetInfo;", "getHOME_ASSET_INFO", "ACCOUNT_TAB_ORDER_TYPE", "getACCOUNT_TAB_ORDER_TYPE", "ACCOUNT_TAB_DEFAULT_ORDER", "getACCOUNT_TAB_DEFAULT_ORDER", "ACCOUNT_TAB_CUSTOM_ORDER", "getACCOUNT_TAB_CUSTOM_ORDER", "WITHDRAW_ACCOUNT_LIST", "getWITHDRAW_ACCOUNT_LIST", "ALPHA_HIDE_SMALL_COIN_SWITCH", "getALPHA_HIDE_SMALL_COIN_SWITCH", "SHOW_ALPHA_ACCOUNT", "getSHOW_ALPHA_ACCOUNT", "UNIFIED_ASSETS_HIDE_SMALL_BALANCES", "getUNIFIED_ASSETS_HIDE_SMALL_BALANCES", "UNIFIED_ASSETS_SHOW_IN_DEBT", "getUNIFIED_ASSETS_SHOW_IN_DEBT", "UNIFIED_MARGIN_GUIDE_SHOWN", "getUNIFIED_MARGIN_GUIDE_SHOWN", "IS_TRIAL_INCLUDED", "getIS_TRIAL_INCLUDED", "LITE_RECHARGE_GUIDE_SHOW", "getLITE_RECHARGE_GUIDE_SHOW", "LITE_WITHDRAW_GUIDE_SHOW", "getLITE_WITHDRAW_GUIDE_SHOW", "LAST_SELECTED_ACCOUNT_TAB", "getLAST_SELECTED_ACCOUNT_TAB", "ACCOUNT_SORT_MODE", "getACCOUNT_SORT_MODE", "ACCOUNT_TAB_SORT_GUIDE_CLICKED", "getACCOUNT_TAB_SORT_GUIDE_CLICKED", "ACCOUNT_SORT_SETTING_GUIDE_CLICKED", "getACCOUNT_SORT_SETTING_GUIDE_CLICKED", "ACCOUNT_SORT_HAND_GUIDE_SHOWN", "getACCOUNT_SORT_HAND_GUIDE_SHOWN", "NEW_ACCOUNT_TAB_ORDER_TYPE", "getNEW_ACCOUNT_TAB_ORDER_TYPE", "NEW_ACCOUNT_TAB_CUSTOM_ORDER", "getNEW_ACCOUNT_TAB_CUSTOM_ORDER", "ACCOUNT_HIDE_SMALL_ASSET_SWITCH", "getACCOUNT_HIDE_SMALL_ASSET_SWITCH", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42153h {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42153h f93593a = new C42153h();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final StorageId<String> f93594b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final StorageId<String> f93595c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final StorageId<String> f93596d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final StorageId<String> f93597e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final StorageId<String> f93598f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final StorageId<String> f93599g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final StorageId<String> f93600h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final StorageId<Boolean> f93601i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final StorageId<Boolean> f93602j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final StorageId<Boolean> f93603k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final StorageId<Boolean> f93604l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final StorageId<Boolean> f93605m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final StorageId<String> f93606n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final StorageId<Boolean> f93607o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final StorageId<Boolean> f93608p;

    static {
        StorageId storageId = new StorageId("asset", "line_chart_range2", null, true, 4, null);
        String strH = UserInfo.a.h();
        if (strH == null) {
            strH = "";
        }
        f93594b = storageId.m102384f(strH);
        f93595c = new StorageId<>("asset", "kv_deposit_key_history", null, true, 4, null);
        f93596d = new StorageId<>("asset", "kv_withdraw_key_history", null, true, 4, null);
        f93597e = new StorageId<>("asset", "asset_coin_info_list", null, true, 4, null);
        f93598f = new StorageId<>("asset", "small_coin", null, true, 4, null);
        f93599g = new StorageId<>("asset", "deposit_hot_coin_key", null, true, 4, null);
        f93600h = new StorageId<>("asset", "asset_withdraw_enable_coin_info_list", null, true, 4, null);
        StorageType storageType = StorageType.Shared;
        f93601i = new StorageId<>("flutter_asset", "asset_eye_switch", storageType, false, 8, null);
        f93602j = new StorageId<>("asset", "showSingleFragment", null, true, 4, null);
        f93603k = new StorageId<>("asset", "hide_zero_asset", storageType, true);
        f93604l = new StorageId<>("asset", "show_new_guide", storageType, true);
        f93605m = new StorageId<>("asset", "SHOW_WITHDRAW_GUIDE", storageType, true);
        f93606n = new StorageId<>("asset", "withdraw_account_list", null, false, 12, null);
        f93607o = new StorageId<>("asset", "lite_recharge_guide_show", storageType, true);
        f93608p = new StorageId<>("asset", "lite_withdraw_guide_show", storageType, true);
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final StorageId<String> m92497A() {
        return new StorageId<>("asset", "pnl_method_" + UserInfo.a.i(), null, true, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final StorageId<Boolean> m92498B() {
        StorageId storageId = new StorageId("flutter_asset", "pnl_method_new_tip_dismissed", StorageType.Shared, false, 8, null);
        String strH = UserInfo.a.h();
        if (strH == null) {
            strH = "";
        }
        return storageId.m102384f(strH);
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final StorageId<Boolean> m92499C() {
        return new StorageId<>("asset", UserInfo.a.i() + "_show_alpha_account", null, true, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final StorageId<Boolean> m92500D() {
        return f93601i;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final StorageId<Boolean> m92501E() {
        return f93605m;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final StorageId<String> m92502F() {
        return f93598f;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final StorageId<Boolean> m92503G() {
        return new StorageId<>("asset", UserInfo.a.i() + "spot_assets_hide_small_balances", StorageType.Shared, true);
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final StorageId<Boolean> m92504H() {
        return new StorageId<>("asset", UserInfo.a.i() + "cross_assets_hide_small_balances", StorageType.Shared, true);
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final StorageId<Boolean> m92505I() {
        return new StorageId<>("asset", UserInfo.a.i() + "unified_assets_show_in_debt", StorageType.Shared, true);
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final StorageId<Boolean> m92506J() {
        return new StorageId<>("asset", UserInfo.a.i() + "unified_margin_guide_shown", StorageType.Shared, true);
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final StorageId<String> m92507K() {
        return new StorageId<>("asset", UserInfo.a.i() + "totalOverViewCache", null, true, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final StorageId<String> m92508L() {
        return f93606n;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final StorageId<String> m92509M() {
        return f93600h;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final StorageId<String> m92510N() {
        return f93596d;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final StorageId<Boolean> m92511a() {
        return new StorageId<>("asset", UserInfo.a.i() + "_account_hide_small_asset_switch", null, true, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final StorageId<Boolean> m92512b() {
        return new StorageId<>("asset", "account_sort_hand_guide_shown_" + UserInfo.a.i(), null, true, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final StorageId<String> m92513c() {
        return new StorageId<>("asset", "account_sort_mode_" + UserInfo.a.i(), null, true, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final StorageId<Boolean> m92514d() {
        return new StorageId<>("asset", "account_sort_setting_guide_clicked_" + UserInfo.a.i(), null, true, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final StorageId<String> m92515e() {
        return new StorageId<>("asset", "account_tab_order_" + UserInfo.a.i(), null, true, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final StorageId<String> m92516f() {
        return new StorageId<>("asset", "account_default_order_" + UserInfo.a.i(), null, true, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final StorageId<String> m92517g() {
        return new StorageId<>("asset", "account_tab_order_type_" + UserInfo.a.i(), null, true, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final StorageId<Boolean> m92518h() {
        return new StorageId<>("asset", "account_tab_sort_guide_clicked_" + UserInfo.a.i(), null, true, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final StorageId<Boolean> m92519i() {
        return new StorageId<>("asset", UserInfo.a.i() + "_alpha_assets_hide_small_balances", null, true, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final StorageId<Boolean> m92520j() {
        return f93604l;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final StorageId<String> m92521k() {
        return f93597e;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final StorageId<String> m92522l() {
        return f93595c;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final StorageId<Boolean> m92523m() {
        return f93603k;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final StorageId<HomeAssetInfo> m92524n() {
        StorageId storageId = new StorageId("asset", "LATEST_ASSET_TIMESTAMP", StorageType.Shared, true);
        String strH = UserInfo.a.h();
        if (strH == null) {
            strH = "";
        }
        return storageId.m102384f(strH);
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final StorageId<String> m92525o() {
        return f93599g;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final StorageId<Boolean> m92526p() {
        return new StorageId<>("asset", UserInfo.a.i() + "isolated_assets_hide_small_balances", StorageType.Shared, true);
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final StorageId<Boolean> m92527q() {
        StorageId storageId = new StorageId("asset", "is_trial_included", StorageType.Shared, true);
        String strH = UserInfo.a.h();
        if (strH == null) {
            strH = "";
        }
        return storageId.m102384f(strH);
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final StorageId<String> m92528r() {
        return new StorageId<>("asset", "last_selected_account_tab_" + UserInfo.a.i(), null, true, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final StorageId<String> m92529s() {
        return f93594b;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final StorageId<Boolean> m92530t() {
        return f93607o;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final StorageId<Boolean> m92531u() {
        return f93608p;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final StorageId<Boolean> m92532v() {
        return new StorageId<>("asset", UserInfo.a.i() + "main_assets_hide_small_balances", StorageType.Shared, true);
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final StorageId<Boolean> m92533w() {
        return new StorageId<>("asset", UserInfo.a.i() + "cross_assets_hide_small_balances", StorageType.Shared, true);
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final StorageId<Boolean> m92534x() {
        return f93602j;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final StorageId<String> m92535y() {
        return new StorageId<>("asset", "new_account_tab_custom_order_" + UserInfo.a.i(), null, true, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final StorageId<String> m92536z() {
        return new StorageId<>("asset", "new_account_tab_order_type_" + UserInfo.a.i(), null, true, 4, null);
    }
}
