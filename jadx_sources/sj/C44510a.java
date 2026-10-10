package sj;

import com.kubi.home.entity.MoodInfoEntity;
import com.kubi.home.v2.biz.kuming.KuMiningDataEntity;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.storage.StorageType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.StorageId;

/* JADX INFO: renamed from: sj.a */
/* JADX INFO: compiled from: HomeStoreIdV2.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00058F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00058F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\bR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\bR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\bR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\bR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\bR\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\bR\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\bR\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\bR\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\bR\u0017\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00058F¢\u0006\u0006\u001a\u0004\b1\u0010\b¨\u00062"}, m90084d2 = {"Lcom/kubi/home/v2/data/HomeStoreIdV2;", "", "<init>", "()V", "KEY_CARD_CONFIG_CACHE_TIME", "Lcom/kubi/utils/storage/StorageId;", "", "getKEY_CARD_CONFIG_CACHE_TIME", "()Lcom/kubi/utils/storage/StorageId;", "KEY_CACHE_MOOD_ENTITY", "Lcom/kubi/home/entity/MoodInfoEntity;", "getKEY_CACHE_MOOD_ENTITY", "APP_GUIDE_DONE", "", "getAPP_GUIDE_DONE", "KEY_ALERT_DEPOSIT_GUIDE", "getKEY_ALERT_DEPOSIT_GUIDE", "KEY_AUTO_PULL_DOWN", "getKEY_AUTO_PULL_DOWN", "KEY_LAST_RANK_TAB_INDEX", "", "getKEY_LAST_RANK_TAB_INDEX", "KV_MORE_MENU_ICON", "", "getKV_MORE_MENU_ICON", "KEY_CARD_CONFIG", "getKEY_CARD_CONFIG", "USER_MENU", "getUSER_MENU", "SERVER_HOME_MENU", "getSERVER_HOME_MENU", "HOME_MENU", "getHOME_MENU", "MENU_MARK", "getMENU_MARK", "RANK_TAB", "getRANK_TAB", "WIDGET_GUID_SHOW_FINISH", "getWIDGET_GUID_SHOW_FINISH", "LITE_GUID_SHOW_FINISH", "getLITE_GUID_SHOW_FINISH", "WIDGET_GUID_SHOW_TIME", "getWIDGET_GUID_SHOW_TIME", "WIDGET_GUID_ADD_TIPS_SHOW", "getWIDGET_GUID_ADD_TIPS_SHOW", "BANNER_HEIGHT", "getBANNER_HEIGHT", "KU_MINING_WIDGET_INFO", "Lcom/kubi/home/v2/biz/kuming/KuMiningDataEntity;", "getKU_MINING_WIDGET_INFO", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeStoreIdV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeStoreIdV2.kt\ncom/kubi/home/v2/data/HomeStoreIdV2\n+ 2 HomeStoreIdV2.kt\ncom/kubi/home/v2/data/HomeStoreIdV2Kt\n+ 3 StorageId.kt\ncom/kubi/utils/storage/StorageId\n*L\n1#1,90:1\n90#2:91\n46#3:92\n*S KotlinDebug\n*F\n+ 1 HomeStoreIdV2.kt\ncom/kubi/home/v2/data/HomeStoreIdV2\n*L\n49#1:91\n49#1:92\n*E\n"})
public final class C44510a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C44510a f98560a = new C44510a();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final StorageId<Long> f98561b = new StorageId<>("CATE_KV_HOME_V2", "KEY_CARD_CONFIG_CACHE_TIME", null, false, 12, null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final StorageId<MoodInfoEntity> f98562c = new StorageId<>("CATE_KV_HOME_V2", "KEY_CACHE_MOOD_ENTITY", null, false, 12, null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final StorageId<Boolean> f98563d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final StorageId<Boolean> f98564e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final StorageId<Boolean> f98565f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final StorageId<Integer> f98566g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final StorageId<String> f98567h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final StorageId<String> f98568i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final StorageId<String> f98569j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final StorageId<Boolean> f98570k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final StorageId<Integer> f98571l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final StorageId<Boolean> f98572m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final StorageId<Boolean> f98573n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final StorageId<Long> f98574o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final StorageId<Boolean> f98575p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final StorageId<Integer> f98576q;

    static {
        StorageType storageType = StorageType.Shared;
        f98563d = new StorageId<>("CATE_KV_HOME_V2", "AppGuideDone-", storageType, false, 8, null);
        f98564e = new StorageId<>("CATE_KV_HOME_V2", "KEY_ALERT_DEPOSIT_GUIDE", storageType, false, 8, null);
        f98565f = new StorageId<>("CATE_KV_HOME_V2", "KEY_AUTO_PULL_DOWN", storageType, false, 8, null);
        f98566g = new StorageId<>("CATE_KV_HOME_V2", "KEY_LAST_RANK_TAB_INDEX", storageType, false, 8, null);
        f98567h = new StorageId<>("CATE_KV_HOME_V2", "more_menu_icon", null, false, 12, null);
        f98568i = new StorageId<>("CATE_KV_HOME_V2", "server_home_menu", null, false, 12, null);
        f98569j = new StorageId<>("CATE_KV_HOME_V2", "home_menu", null, false, 12, null);
        f98570k = new StorageId<>("CATE_KV_HOME_V2", "menu_mark", null, false, 12, null);
        f98571l = new StorageId<>("CATE_KV_HOME_V2", "rank_tab_", null, false, 12, null);
        f98572m = new StorageId<>("CATE_KV_HOME_V2", "widget_guid_show_finish", null, false, 12, null);
        f98573n = new StorageId<>("CATE_KV_HOME_V2", "lite_guid_show_finish", null, false, 12, null);
        f98574o = new StorageId<>("CATE_KV_HOME_V2", "widget_guid_show_time", null, false, 12, null);
        f98575p = new StorageId<>("CATE_KV_HOME_V2", "widget_guid_add_tips_show", null, false, 12, null);
        f98576q = new StorageId<>("CATE_KV_HOME_V2", "banner_height", null, false, 12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final StorageId<Integer> m98475a() {
        return f98576q;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final StorageId<String> m98476b() {
        StorageId storageId = new StorageId("CATE_KV_HOME_V2", "key_home_card_config", null, false, 12, null);
        String strH = UserInfo.a.h();
        if (strH == null) {
            strH = "";
        }
        return storageId.m102384f(strH);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final StorageId<KuMiningDataEntity> m98477c() {
        return new StorageId("CATE_KV_HOME_V2", "KEY_KU_MINING_WIDGET_INFO", null, false, 12, null).m102384f(UserInfo.a.i());
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final StorageId<Boolean> m98478d() {
        return f98573n;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final StorageId<Boolean> m98479e() {
        return f98575p;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final StorageId<Boolean> m98480f() {
        return f98572m;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final StorageId<Long> m98481g() {
        return f98574o;
    }
}
