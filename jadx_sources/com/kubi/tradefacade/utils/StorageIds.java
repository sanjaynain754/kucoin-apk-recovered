package com.kubi.tradefacade.utils;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.tradefacade.utils.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: StorageIds.kt */
/* JADX INFO: loaded from: classes50.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00078F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00078F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00078F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00078F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/tradefacade/utils/StorageIds;", "", "<init>", "()V", "CATEGORY", "", "LAST_SELECTED_TRADE_TAB", "Lcom/kubi/utils/storage/StorageId;", "getLAST_SELECTED_TRADE_TAB", "()Lcom/kubi/utils/storage/StorageId;", "TRADE_TAB_ORDER", "getTRADE_TAB_ORDER", "TRADE_TAB_ORDER_HIDDEN", "getTRADE_TAB_ORDER_HIDDEN", "HAD_TRADE_TAB_SETTINGS_GUIDE", "", "getHAD_TRADE_TAB_SETTINGS_GUIDE", "HAD_TRADE_TAB_SETTINGS_EDIT_GUIDE", "getHAD_TRADE_TAB_SETTINGS_EDIT_GUIDE", "HAD_EDIT_TRADE_TAB_SETTINGS", "getHAD_EDIT_TRADE_TAB_SETTINGS", "TRADE_TAB_SORT_HAND_GUIDE_SHOWN", "getTRADE_TAB_SORT_HAND_GUIDE_SHOWN", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class StorageIds {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final StorageIds f52040a = new StorageIds();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final StorageId<Boolean> m63667a() {
        return new StorageId<>("TradeFacade", "had_edit_trade_tab_settings", null, false, 12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final StorageId<Boolean> m63668b() {
        return new StorageId<>("TradeFacade", "had_trade_tab_settings_edit_guide", null, false, 12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final StorageId<Boolean> m63669c() {
        return new StorageId<>("TradeFacade", "had_trade_tab_settings_guide", null, false, 12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final StorageId<String> m63670d() {
        return new StorageId<>("TradeFacade", "last_selected_trade_tab", null, false, 12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final StorageId<String> m63671e() {
        return new StorageId<>("TradeFacade", "trade_tab_order", null, false, 12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final StorageId<String> m63672f() {
        return new StorageId<>("TradeFacade", "trade_tab_order_hidden", null, false, 12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final StorageId<Boolean> m63673g() {
        return new StorageId<>("TradeFacade", "trade_tab_sort_hand_guide_shown", null, false, 12, null);
    }
}
