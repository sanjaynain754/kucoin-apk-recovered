package dj;

import com.kubi.home.entity.GridNaviClickedEntity;
import com.kubi.home.entity.MoodInfoEntity;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.storage.StorageType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.StorageId;

/* JADX INFO: renamed from: dj.d */
/* JADX INFO: compiled from: HomeStoreId.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00058F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\bR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\bR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\bR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\bR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00170\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\bR\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00170\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\bR\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00170\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\bR\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00058F¢\u0006\u0006\u001a\u0004\b-\u0010\bR\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00170\u00058F¢\u0006\u0006\u001a\u0004\b/\u0010\bR\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\u00170\u00058F¢\u0006\u0006\u001a\u0004\b1\u0010\bR\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\r0\u00058F¢\u0006\u0006\u001a\u0004\b3\u0010\bR\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020\r0\u00058F¢\u0006\u0006\u001a\u0004\b5\u0010\bR\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\u00140\u00058F¢\u0006\u0006\u001a\u0004\b7\u0010\bR\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020\r0\u00058F¢\u0006\u0006\u001a\u0004\b9\u0010\bR\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\r0\u00058F¢\u0006\u0006\u001a\u0004\b;\u0010\bR\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00170\u00058F¢\u0006\u0006\u001a\u0004\b=\u0010\b¨\u0006>"}, m90084d2 = {"Lcom/kubi/home/common/ex/HomeStoreId;", "", "<init>", "()V", "KEY_CARD_CONFIG_CACHE_TIME", "Lcom/kubi/utils/storage/StorageId;", "", "getKEY_CARD_CONFIG_CACHE_TIME", "()Lcom/kubi/utils/storage/StorageId;", "KEY_CACHE_MOOD_ENTITY", "Lcom/kubi/home/entity/MoodInfoEntity;", "getKEY_CACHE_MOOD_ENTITY", "APP_GUIDE_DONE", "", "getAPP_GUIDE_DONE", "KEY_ALERT_DEPOSIT_GUIDE", "getKEY_ALERT_DEPOSIT_GUIDE", "KEY_AUTO_PULL_DOWN", "getKEY_AUTO_PULL_DOWN", "KEY_LAST_RANK_TAB_INDEX", "", "getKEY_LAST_RANK_TAB_INDEX", "KV_MORE_MENU_ICON", "", "getKV_MORE_MENU_ICON", "KEY_CARD_CONFIG", "getKEY_CARD_CONFIG", "USER_MENU", "getUSER_MENU", "SERVER_HOME_MENU", "getSERVER_HOME_MENU", "HOME_MENU", "getHOME_MENU", "MENU_MARK", "getMENU_MARK", "RANK_TAB", "getRANK_TAB", "WIDGET_DATA_BANNER", "getWIDGET_DATA_BANNER", "WIDGET_DATA_RECOMMEND", "getWIDGET_DATA_RECOMMEND", "WIDGET_DATA_GRID_NAVI", "getWIDGET_DATA_GRID_NAVI", "HOME_GRID_NAVI_CLICKED", "Lcom/kubi/home/entity/GridNaviClickedEntity;", "getHOME_GRID_NAVI_CLICKED", "HOME_GRID_NAVI_ALL", "getHOME_GRID_NAVI_ALL", "HOME_FEED_TAB", "getHOME_FEED_TAB", "HOME_FEED_TAB_FOLLOW_SHOW", "getHOME_FEED_TAB_FOLLOW_SHOW", "HOME_FEED_TAB_LIVE_SHOW", "getHOME_FEED_TAB_LIVE_SHOW", "HOME_FEED_TAB_INDEX", "getHOME_FEED_TAB_INDEX", "HOME_FEED_ACTION_POPUP_LIVE", "getHOME_FEED_ACTION_POPUP_LIVE", "HOME_FEED_ACTION_POPUP_DISCOVER_FOLLOW", "getHOME_FEED_ACTION_POPUP_DISCOVER_FOLLOW", "HOME_PAY_JUMP_URL", "getHOME_PAY_JUMP_URL", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeStoreId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeStoreId.kt\ncom/kubi/home/common/ex/HomeStoreId\n+ 2 HomeStoreId.kt\ncom/kubi/home/common/ex/HomeStoreIdKt\n+ 3 StorageId.kt\ncom/kubi/utils/storage/StorageId\n*L\n1#1,109:1\n109#2:110\n46#3:111\n*S KotlinDebug\n*F\n+ 1 HomeStoreId.kt\ncom/kubi/home/common/ex/HomeStoreId\n*L\n48#1:110\n48#1:111\n*E\n"})
public final class C36719d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C36719d f79632a = new C36719d();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final StorageId<Long> f79633b = new StorageId<>("CATE_KV_HOME", "KEY_CARD_CONFIG_CACHE_TIME", null, false, 12, null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final StorageId<MoodInfoEntity> f79634c = new StorageId<>("CATE_KV_HOME", "KEY_CACHE_MOOD_ENTITY", null, false, 12, null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final StorageId<Boolean> f79635d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final StorageId<Boolean> f79636e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final StorageId<Boolean> f79637f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final StorageId<Integer> f79638g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final StorageId<String> f79639h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final StorageId<String> f79640i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final StorageId<String> f79641j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final StorageId<String> f79642k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final StorageId<Boolean> f79643l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final StorageId<Integer> f79644m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final StorageId<String> f79645n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final StorageId<String> f79646o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final StorageId<String> f79647p;

    static {
        StorageType storageType = StorageType.Shared;
        f79635d = new StorageId<>("CATE_KV_HOME", "AppGuideDone-", storageType, false, 8, null);
        f79636e = new StorageId<>("CATE_KV_HOME", "KEY_ALERT_DEPOSIT_GUIDE", storageType, false, 8, null);
        f79637f = new StorageId<>("CATE_KV_HOME", "KEY_AUTO_PULL_DOWN", storageType, false, 8, null);
        f79638g = new StorageId<>("CATE_KV_HOME", "KEY_LAST_RANK_TAB_INDEX", storageType, false, 8, null);
        f79639h = new StorageId<>("CATE_KV_HOME", "more_menu_icon", null, false, 12, null);
        f79640i = new StorageId<>("CATE_KV_HOME", "key_home_card_config", null, false, 12, null);
        f79641j = new StorageId<>("CATE_KV_HOME", "server_home_menu", null, false, 12, null);
        f79642k = new StorageId<>("CATE_KV_HOME", "home_menu", null, false, 12, null);
        f79643l = new StorageId<>("CATE_KV_HOME", "menu_mark", null, false, 12, null);
        f79644m = new StorageId<>("CATE_KV_HOME", "rank_tab_", null, false, 12, null);
        f79645n = new StorageId<>("CATE_KV_HOME", "widget_data_banner_new", null, false, 12, null);
        f79646o = new StorageId<>("CATE_KV_HOME", "widget_data_recommend", null, false, 12, null);
        f79647p = new StorageId<>("CATE_KV_HOME", "widget_data_grid_navi", null, false, 12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final StorageId<Boolean> m82256a() {
        return f79635d;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final StorageId<Boolean> m82257b() {
        return new StorageId<>("CATE_KV_HOME", "home_feed_actio_popup_discover_follow_v2", null, false, 12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final StorageId<Boolean> m82258c() {
        return new StorageId<>("CATE_KV_HOME", "home_feed_actio_popup_live", null, false, 12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final StorageId<String> m82259d() {
        return new StorageId<>("CATE_KV_HOME", "home_feed_tab_codes", null, false, 12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final StorageId<Boolean> m82260e() {
        return new StorageId<>("CATE_KV_HOME", "home_feed_tab_codes_follow_show", null, false, 12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final StorageId<Integer> m82261f() {
        return new StorageId<>("CATE_KV_HOME", "home_feed_tab_select_index", null, false, 12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final StorageId<Boolean> m82262g() {
        return new StorageId<>("CATE_KV_HOME", "home_feed_tab_codes_live_show", null, false, 12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final StorageId<String> m82263h() {
        StorageId storageId = new StorageId("CATE_KV_HOME", "home_grid_navi_all", null, false, 12, null);
        String strH = UserInfo.a.h();
        if (strH == null) {
            strH = "";
        }
        return storageId.m102384f(strH);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final StorageId<GridNaviClickedEntity> m82264i() {
        StorageId storageId = new StorageId("CATE_KV_HOME", "home_grid_navi_clicked", null, false, 12, null);
        String strH = UserInfo.a.h();
        if (strH == null) {
            strH = "";
        }
        return storageId.m102384f(strH);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final StorageId<String> m82265j() {
        return f79642k;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final StorageId<String> m82266k() {
        return new StorageId<>("CATE_KV_HOME", "home_pay_jump_url", null, false, 12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final StorageId<Boolean> m82267l() {
        return f79636e;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final StorageId<Boolean> m82268m() {
        return f79637f;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final StorageId<MoodInfoEntity> m82269n() {
        return f79634c;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final StorageId<String> m82270o() {
        return f79640i;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final StorageId<Long> m82271p() {
        return f79633b;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final StorageId<Integer> m82272q() {
        return f79638g;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final StorageId<String> m82273r() {
        return f79639h;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final StorageId<Boolean> m82274s() {
        return f79643l;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final StorageId<Integer> m82275t() {
        return f79644m;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final StorageId<String> m82276u() {
        return f79641j;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final StorageId<String> m82277v() {
        StorageId storageId = new StorageId("CATE_KV_HOME", "USER_MENU", null, true, 4, null);
        String strI = UserInfo.a.i();
        return new StorageId<>(storageId.getCategory(), storageId.getKey() + strI, storageId.getStorageType(), storageId.getSupportLegacy());
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final StorageId<String> m82278w() {
        return f79645n;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final StorageId<String> m82279x() {
        return f79647p;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final StorageId<String> m82280y() {
        return f79646o;
    }
}
