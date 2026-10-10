package com.kubi.quotefacade.helper;

import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.storage.StorageType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p321hv.InterfaceC38352b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.quotefacade.helper.p2, reason: from Kotlin metadata */
/* JADX INFO: compiled from: QuoteKV.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0014\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010&\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u0010'J\u0010\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\nR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\nR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\nR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\nR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\nR\u000e\u0010%\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\nR\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\nR\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\nR\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\nR\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\nR\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\nR\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\nR\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\nR\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\n¨\u0006="}, m90084d2 = {"Lcom/kubi/quotefacade/helper/QuoteKV;", "", "<init>", "()V", "KV_CATE", "", "KEY_CHAIN_WEB3_ALERT", "Lcom/kubi/utils/storage/StorageId;", "", "getKEY_CHAIN_WEB3_ALERT", "()Lcom/kubi/utils/storage/StorageId;", "ETF_FAVOR_DATA", "getETF_FAVOR_DATA", "SPOT_FAVOR_DATA", "getSPOT_FAVOR_DATA", "FUTURE_FAVOR_DATA", "getFUTURE_FAVOR_DATA", "CHAIN_FAVOR_DATA", "getCHAIN_FAVOR_DATA", "ALPHA_FAV_DATA", "getALPHA_FAV_DATA", "ALPHA_POP_PREMIUM", "getALPHA_POP_PREMIUM", "ALPHA_POP_ONCHAIN", "getALPHA_POP_ONCHAIN", "ALPHA_PREMIUM_NEW", "", "getALPHA_PREMIUM_NEW", "KEY_MARKET_SELECT", "", "getKEY_MARKET_SELECT", "DISCOVER_RED_POINT", "getDISCOVER_RED_POINT", "CONTRACT_QUOTE_NOTICE", "getCONTRACT_QUOTE_NOTICE", "IS_CHECKED_HOLDING_TAB_SHOW_RED_DOT", "getIS_CHECKED_HOLDING_TAB_SHOW_RED_DOT", "NOTICE_LIST_LATEST_KEY", "getNoticeGmtCreated", "()Ljava/lang/Long;", "setNoticeGmtCreated", "", "gmtCreated", "KV_RANK_MAIN_POSITION", "getKV_RANK_MAIN_POSITION", "KV_RANK_SUB_POSITION", "getKV_RANK_SUB_POSITION", "KV_WIDGET_GEMBOX_DATA", "getKV_WIDGET_GEMBOX_DATA", "KV_WIDGET_RISE_FALL_DATA", "getKV_WIDGET_RISE_FALL_DATA", "KV_WIDGET_FEAR_GREED_DATA", "getKV_WIDGET_FEAR_GREED_DATA", "KV_WIDGET_HOT_SECTORS_DATA", "getKV_WIDGET_HOT_SECTORS_DATA", "KV_HOME_RANK_NEW_READ_SYMBOL_SET", "getKV_HOME_RANK_NEW_READ_SYMBOL_SET", "KV_HOME_RANK_SPOT_MARKET_CONFIG", "getKV_HOME_RANK_SPOT_MARKET_CONFIG", "KV_HOME_RANK_SPOT_MARKET_CHOOSE", "getKV_HOME_RANK_SPOT_MARKET_CHOOSE", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nQuoteKV.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuoteKV.kt\ncom/kubi/quotefacade/helper/QuoteKV\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 StorageId.kt\ncom/kubi/utils/storage/StorageIdKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,119:1\n17#2,2:120\n67#3:122\n67#3:124\n32#4:123\n23#4,2:125\n*S KotlinDebug\n*F\n+ 1 QuoteKV.kt\ncom/kubi/quotefacade/helper/QuoteKV\n*L\n33#1:120,2\n81#1:122\n91#1:124\n83#1:123\n93#1:125,2\n*E\n"})
public final class QuoteKV {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final QuoteKV f42044a = new QuoteKV();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final StorageId<Boolean> f42045b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final StorageId<String> f42046c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final StorageId<String> f42047d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final StorageId<String> f42048e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final StorageId<String> f42049f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final StorageId<Boolean> f42050g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final StorageId<Boolean> f42051h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final StorageId<Long> f42052i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final StorageId<Integer> f42053j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final StorageId<Boolean> f42054k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final StorageId<Long> f42055l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final StorageId<Boolean> f42056m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final StorageId<String> f42057n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final StorageId<String> f42058o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final StorageId<String> f42059p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final StorageId<String> f42060q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final StorageId<String> f42061r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public static final StorageId<String> f42062s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public static final StorageId<String> f42063t;

    /* JADX INFO: renamed from: u */
    @NotNull
    public static final StorageId<String> f42064u;

    /* JADX INFO: renamed from: v */
    @NotNull
    public static final StorageId<String> f42065v;

    static {
        StorageType storageType = StorageType.Shared;
        f42045b = new StorageId<>("KV_CATE_QUOTE", "KEY_CHAIN_WEB3_ALERT", storageType, false, 8, null);
        f42046c = new StorageId<>("KV_CATE_QUOTE", "key_etf_favor_data", null, true, 4, null);
        f42047d = new StorageId<>("KV_CATE_QUOTE", "key_future_favor_data", null, true, 4, null);
        f42048e = new StorageId<>("KV_CATE_QUOTE", "key_market_meme_favorite_data", null, true, 4, null);
        f42049f = new StorageId<>("KV_CATE_QUOTE", "key_market_alpha_favorite_data", null, true, 4, null);
        f42050g = new StorageId<>("KV_CATE_QUOTE", "key_alpha_pop_premium", null, false, 12, null);
        f42051h = new StorageId<>("KV_CATE_QUOTE", "key_alpha_pop_onchain", null, false, 12, null);
        f42052i = new StorageId<>("KV_CATE_QUOTE", "alpha_premium_new", storageType, false, 8, null);
        f42053j = new StorageId<>("KV_CATE_QUOTE", "key_market_select", null, false, 12, null);
        f42054k = new StorageId<>("KV_CATE_QUOTE", "DISCOVER_RED_POINT", null, false, 12, null);
        f42055l = new StorageId<>("KV_CATE_QUOTE", "contract_list_notice", null, false, 12, null);
        f42056m = new StorageId<>("KV_CATE_QUOTE", "IS_CHECKED_HOLDING_TAB_SHOW_RED_DOT", null, false, 12, null);
        f42057n = new StorageId<>("KV_CATE_QUOTE", "kv_rank_main_position", storageType, false, 8, null);
        f42058o = new StorageId<>("KV_CATE_QUOTE", "kv_rank_sub_position", storageType, false, 8, null);
        f42059p = new StorageId<>("KV_CATE_QUOTE", "kv_widget_gembox_data", null, false, 12, null);
        f42060q = new StorageId<>("KV_CATE_QUOTE", "kv_widget_rise_fall_data", null, false, 12, null);
        f42061r = new StorageId<>("KV_CATE_QUOTE", "kv_widget_fear_greed_data", null, false, 12, null);
        f42062s = new StorageId<>("KV_CATE_QUOTE", "kv_widget_hot_sectors_data", null, false, 12, null);
        f42063t = new StorageId<>("KV_CATE_QUOTE", "kv_home_rank_new_read_symbol_set", null, false, 12, null);
        f42064u = new StorageId<>("KV_CATE_QUOTE", "kv_home_rank_spot_market_config", null, false, 12, null);
        f42065v = new StorageId<>("KV_CATE_QUOTE", "kv_home_rank_spot_market_choose", null, false, 12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final StorageId<String> m52041a() {
        return f42049f;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final StorageId<Boolean> m52042b() {
        return f42051h;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final StorageId<Boolean> m52043c() {
        return f42050g;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final StorageId<Long> m52044d() {
        return f42052i;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final StorageId<String> m52045e() {
        return f42048e;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final StorageId<Long> m52046f() {
        return f42055l;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final StorageId<Boolean> m52047g() {
        return f42054k;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final StorageId<String> m52048h() {
        return f42046c;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final StorageId<String> m52049i() {
        return f42047d;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final StorageId<Boolean> m52050j() {
        return f42056m;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final StorageId<Boolean> m52051k() {
        return f42045b;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final StorageId<Integer> m52052l() {
        return f42053j;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final StorageId<String> m52053m() {
        return f42063t;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final StorageId<String> m52054n() {
        return f42065v;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final StorageId<String> m52055o() {
        return f42064u;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final StorageId<String> m52056p() {
        return f42057n;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final StorageId<String> m52057q() {
        return f42058o;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final StorageId<String> m52058r() {
        return f42061r;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final StorageId<String> m52059s() {
        return f42059p;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final StorageId<String> m52060t() {
        return f42062s;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final StorageId<String> m52061u() {
        return f42060q;
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public final Long m52062v() {
        String strM102326h = C46392a.m102326h(new StorageId("flutter_KV_CATE_QUOTE", "market_notice_list_latest_key", StorageType.Shared, false).m102384f(UserInfo.a.i()), "");
        if (strM102326h.length() == 0) {
            return null;
        }
        return DowngradeExKt.m66547q(strM102326h);
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final StorageId<String> m52063w() {
        String strM86541a;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC38352b.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h == null || (strM86541a = ((InterfaceC38352b) objM56186h).m86541a()) == null) {
            strM86541a = "key_spot_favor_data";
        }
        return new StorageId<>("KV_CATE_QUOTE", strM86541a, null, true, 4, null);
    }

    /* JADX INFO: renamed from: x */
    public final void m52064x(@Nullable String str) {
        StorageId storageIdM102384f = new StorageId("flutter_KV_CATE_QUOTE", "market_notice_list_latest_key", StorageType.Shared, false).m102384f(UserInfo.a.i());
        if (str == null) {
            str = "";
        }
        C46392a.m102333p(storageIdM102384f, str);
    }
}
