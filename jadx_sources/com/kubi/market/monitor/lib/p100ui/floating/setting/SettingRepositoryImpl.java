package com.kubi.market.monitor.lib.p100ui.floating.setting;

import com.kubi.market.monitor.lib.entity.MarketFloatingWindowConfig;
import com.kubi.market.monitor.lib.p100ui.floating.FloatingWindowConfigManager;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.widget.dialog.SelectEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.k1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SettingRepositoryImpl.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u000bH\u0016J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u000bH\u0016J\u0010\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\u000bH\u0016J\u0010\u0010\"\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0016J\b\u0010&\u001a\u00020$H\u0016J\b\u0010'\u001a\u00020$H\u0016J\b\u0010(\u001a\u00020$H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006)"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/setting/SettingRepositoryImpl;", "Lcom/kubi/market/monitor/lib/ui/floating/setting/ISettingRepository;", "<init>", "()V", "config", "Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;", "getConfig", "()Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;", "updatePagingTime", "", "pagingTime", "", "updateAutoScrollTime", "scrollTime", "updateTheme", BaseActivity.THEME, "updateSwitch", "switch", "", "updateFloatingWindowBgAlpha", "bgAlpha", "updatePriceShow", "updateQuoteChangeShow", "updateCurrencyNameShow", "updatePageSize", "pageSize", "updateDisplayMode", "displayMode", "updateDataUpdateIntervalTime", "dataUpdateIntervalTime", "updatePagingMode", "pagingMode", "updateTextSizeMode", "textSizeMode", "updateActionBarShow", "getUpdateIntervalTimeSelectDialogData", "Lcom/kubi/market/monitor/lib/ui/floating/setting/SelectData;", "getPagingModelSelectDialogData", "getSelectTextSizeModeDialogData", "getDisplayModeSelectData", "getThemeSelectData", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSettingRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingRepositoryImpl.kt\ncom/kubi/market/monitor/lib/ui/floating/setting/SettingRepositoryImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,248:1\n11228#2:249\n11563#2,3:250\n1563#3:253\n1634#3,3:254\n1563#3:257\n1634#3,3:258\n1563#3:261\n1634#3,3:262\n1563#3:265\n1634#3,3:266\n*S KotlinDebug\n*F\n+ 1 SettingRepositoryImpl.kt\ncom/kubi/market/monitor/lib/ui/floating/setting/SettingRepositoryImpl\n*L\n179#1:249\n179#1:250,3\n194#1:253\n194#1:254,3\n210#1:257\n210#1:258,3\n225#1:261\n225#1:262,3\n239#1:265\n239#1:266,3\n*E\n"})
public final class SettingRepositoryImpl implements ISettingRepository {
    @Override // com.kubi.market.monitor.lib.p100ui.floating.setting.ISettingRepository
    @NotNull
    /* JADX INFO: renamed from: e */
    public SelectData mo40952e() {
        List listListOf = CollectionsKt.listOf((Object[]) new Integer[]{0, 8});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            arrayList.add(new SelectEntity(String.valueOf(iIntValue), C18686g.m40915d(iIntValue), null, null, null, null, null, null, null, false, m40947G().getPagingMode() == iIntValue, null, 3068, null));
        }
        return new SelectData(3, arrayList);
    }

    @Override // com.kubi.market.monitor.lib.p100ui.floating.setting.ISettingRepository
    @NotNull
    /* JADX INFO: renamed from: g */
    public SelectData mo40954g() {
        List listListOf = CollectionsKt.listOf((Object[]) new Integer[]{0, 8});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            arrayList.add(new SelectEntity(String.valueOf(iIntValue), C18686g.m40919h(iIntValue), null, null, null, null, null, null, null, false, iIntValue == m40947G().getTheme(), null, 3068, null));
        }
        return new SelectData(5, arrayList);
    }

    @Override // com.kubi.market.monitor.lib.p100ui.floating.setting.ISettingRepository
    @NotNull
    /* JADX INFO: renamed from: k */
    public SelectData mo40958k() {
        List listListOf = CollectionsKt.listOf((Object[]) new Integer[]{1, 2, 3});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            arrayList.add(new SelectEntity(String.valueOf(iIntValue), C18686g.m40918g(iIntValue), null, null, null, null, null, null, null, false, m40947G().getTextSizeMode() == iIntValue, null, 3068, null));
        }
        return new SelectData(4, arrayList);
    }

    @Override // com.kubi.market.monitor.lib.p100ui.floating.setting.ISettingRepository
    @NotNull
    /* JADX INFO: renamed from: o */
    public SelectData mo40962o() {
        List listListOf = CollectionsKt.listOf((Object[]) new Integer[]{0, 8});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            arrayList.add(new SelectEntity(String.valueOf(iIntValue), C18686g.m40913b(iIntValue), null, null, null, null, null, null, null, false, iIntValue == m40947G().getDisplayMode(), null, 3068, null));
        }
        return new SelectData(2, arrayList);
    }

    @Override // com.kubi.market.monitor.lib.p100ui.floating.setting.ISettingRepository
    @NotNull
    /* JADX INFO: renamed from: q */
    public SelectData mo40964q() {
        Integer[] numArr = {3, 5, 10, 60, 180, 600};
        ArrayList arrayList = new ArrayList(6);
        for (int i11 = 0; i11 < 6; i11++) {
            int iIntValue = numArr[i11].intValue();
            arrayList.add(new SelectEntity(String.valueOf(iIntValue), C18686g.m40920i(iIntValue), null, null, null, null, null, null, null, false, iIntValue == FloatingWindowConfigManager.f34272a.m40730g().getDataUpdateIntervalTime(), null, 3068, null));
        }
        return new SelectData(1, arrayList);
    }

    /* JADX INFO: renamed from: H */
    public static final MarketFloatingWindowConfig m40927H(boolean z11, MarketFloatingWindowConfig updateMarketFloatingWindowConfig) {
        Intrinsics.checkNotNullParameter(updateMarketFloatingWindowConfig, "$this$updateMarketFloatingWindowConfig");
        return updateMarketFloatingWindowConfig.copy((16382 & 1) != 0 ? updateMarketFloatingWindowConfig.isShow : false, (16382 & 2) != 0 ? updateMarketFloatingWindowConfig.theme : 0, (16382 & 4) != 0 ? updateMarketFloatingWindowConfig.floatingWindowBgAlpha : 0, (16382 & 8) != 0 ? updateMarketFloatingWindowConfig.dataUpdateIntervalTime : 0, (16382 & 16) != 0 ? updateMarketFloatingWindowConfig.displayMode : 0, (16382 & 32) != 0 ? updateMarketFloatingWindowConfig.autoScrollTime : 0, (16382 & 64) != 0 ? updateMarketFloatingWindowConfig.pageTurningTime : 0, (16382 & 128) != 0 ? updateMarketFloatingWindowConfig.pagingMode : 0, (16382 & 256) != 0 ? updateMarketFloatingWindowConfig.pageSize : 0, (16382 & 512) != 0 ? updateMarketFloatingWindowConfig.actionBarShow : z11, (16382 & 1024) != 0 ? updateMarketFloatingWindowConfig.currencyNameShow : false, (16382 & 2048) != 0 ? updateMarketFloatingWindowConfig.quoteChangeShow : false, (16382 & 4096) != 0 ? updateMarketFloatingWindowConfig.priceShow : false, (16382 & 8192) != 0 ? updateMarketFloatingWindowConfig.textSizeMode : 0);
    }

    /* JADX INFO: renamed from: I */
    public static final MarketFloatingWindowConfig m40928I(int i11, MarketFloatingWindowConfig updateMarketFloatingWindowConfig) {
        Intrinsics.checkNotNullParameter(updateMarketFloatingWindowConfig, "$this$updateMarketFloatingWindowConfig");
        return updateMarketFloatingWindowConfig.copy((16382 & 1) != 0 ? updateMarketFloatingWindowConfig.isShow : false, (16382 & 2) != 0 ? updateMarketFloatingWindowConfig.theme : 0, (16382 & 4) != 0 ? updateMarketFloatingWindowConfig.floatingWindowBgAlpha : 0, (16382 & 8) != 0 ? updateMarketFloatingWindowConfig.dataUpdateIntervalTime : 0, (16382 & 16) != 0 ? updateMarketFloatingWindowConfig.displayMode : 0, (16382 & 32) != 0 ? updateMarketFloatingWindowConfig.autoScrollTime : i11, (16382 & 64) != 0 ? updateMarketFloatingWindowConfig.pageTurningTime : 0, (16382 & 128) != 0 ? updateMarketFloatingWindowConfig.pagingMode : 0, (16382 & 256) != 0 ? updateMarketFloatingWindowConfig.pageSize : 0, (16382 & 512) != 0 ? updateMarketFloatingWindowConfig.actionBarShow : false, (16382 & 1024) != 0 ? updateMarketFloatingWindowConfig.currencyNameShow : false, (16382 & 2048) != 0 ? updateMarketFloatingWindowConfig.quoteChangeShow : false, (16382 & 4096) != 0 ? updateMarketFloatingWindowConfig.priceShow : false, (16382 & 8192) != 0 ? updateMarketFloatingWindowConfig.textSizeMode : 0);
    }

    /* JADX INFO: renamed from: J */
    public static final MarketFloatingWindowConfig m40929J(boolean z11, MarketFloatingWindowConfig updateMarketFloatingWindowConfig) {
        Intrinsics.checkNotNullParameter(updateMarketFloatingWindowConfig, "$this$updateMarketFloatingWindowConfig");
        return updateMarketFloatingWindowConfig.copy((16382 & 1) != 0 ? updateMarketFloatingWindowConfig.isShow : false, (16382 & 2) != 0 ? updateMarketFloatingWindowConfig.theme : 0, (16382 & 4) != 0 ? updateMarketFloatingWindowConfig.floatingWindowBgAlpha : 0, (16382 & 8) != 0 ? updateMarketFloatingWindowConfig.dataUpdateIntervalTime : 0, (16382 & 16) != 0 ? updateMarketFloatingWindowConfig.displayMode : 0, (16382 & 32) != 0 ? updateMarketFloatingWindowConfig.autoScrollTime : 0, (16382 & 64) != 0 ? updateMarketFloatingWindowConfig.pageTurningTime : 0, (16382 & 128) != 0 ? updateMarketFloatingWindowConfig.pagingMode : 0, (16382 & 256) != 0 ? updateMarketFloatingWindowConfig.pageSize : 0, (16382 & 512) != 0 ? updateMarketFloatingWindowConfig.actionBarShow : false, (16382 & 1024) != 0 ? updateMarketFloatingWindowConfig.currencyNameShow : z11, (16382 & 2048) != 0 ? updateMarketFloatingWindowConfig.quoteChangeShow : false, (16382 & 4096) != 0 ? updateMarketFloatingWindowConfig.priceShow : false, (16382 & 8192) != 0 ? updateMarketFloatingWindowConfig.textSizeMode : 0);
    }

    /* JADX INFO: renamed from: K */
    public static final MarketFloatingWindowConfig m40930K(int i11, MarketFloatingWindowConfig updateMarketFloatingWindowConfig) {
        Intrinsics.checkNotNullParameter(updateMarketFloatingWindowConfig, "$this$updateMarketFloatingWindowConfig");
        return updateMarketFloatingWindowConfig.copy((16382 & 1) != 0 ? updateMarketFloatingWindowConfig.isShow : false, (16382 & 2) != 0 ? updateMarketFloatingWindowConfig.theme : 0, (16382 & 4) != 0 ? updateMarketFloatingWindowConfig.floatingWindowBgAlpha : 0, (16382 & 8) != 0 ? updateMarketFloatingWindowConfig.dataUpdateIntervalTime : i11, (16382 & 16) != 0 ? updateMarketFloatingWindowConfig.displayMode : 0, (16382 & 32) != 0 ? updateMarketFloatingWindowConfig.autoScrollTime : 0, (16382 & 64) != 0 ? updateMarketFloatingWindowConfig.pageTurningTime : 0, (16382 & 128) != 0 ? updateMarketFloatingWindowConfig.pagingMode : 0, (16382 & 256) != 0 ? updateMarketFloatingWindowConfig.pageSize : 0, (16382 & 512) != 0 ? updateMarketFloatingWindowConfig.actionBarShow : false, (16382 & 1024) != 0 ? updateMarketFloatingWindowConfig.currencyNameShow : false, (16382 & 2048) != 0 ? updateMarketFloatingWindowConfig.quoteChangeShow : false, (16382 & 4096) != 0 ? updateMarketFloatingWindowConfig.priceShow : false, (16382 & 8192) != 0 ? updateMarketFloatingWindowConfig.textSizeMode : 0);
    }

    /* JADX INFO: renamed from: L */
    public static final MarketFloatingWindowConfig m40931L(int i11, MarketFloatingWindowConfig updateMarketFloatingWindowConfig) {
        Intrinsics.checkNotNullParameter(updateMarketFloatingWindowConfig, "$this$updateMarketFloatingWindowConfig");
        return updateMarketFloatingWindowConfig.copy((16382 & 1) != 0 ? updateMarketFloatingWindowConfig.isShow : false, (16382 & 2) != 0 ? updateMarketFloatingWindowConfig.theme : 0, (16382 & 4) != 0 ? updateMarketFloatingWindowConfig.floatingWindowBgAlpha : 0, (16382 & 8) != 0 ? updateMarketFloatingWindowConfig.dataUpdateIntervalTime : 0, (16382 & 16) != 0 ? updateMarketFloatingWindowConfig.displayMode : i11, (16382 & 32) != 0 ? updateMarketFloatingWindowConfig.autoScrollTime : 0, (16382 & 64) != 0 ? updateMarketFloatingWindowConfig.pageTurningTime : 0, (16382 & 128) != 0 ? updateMarketFloatingWindowConfig.pagingMode : 0, (16382 & 256) != 0 ? updateMarketFloatingWindowConfig.pageSize : 0, (16382 & 512) != 0 ? updateMarketFloatingWindowConfig.actionBarShow : false, (16382 & 1024) != 0 ? updateMarketFloatingWindowConfig.currencyNameShow : false, (16382 & 2048) != 0 ? updateMarketFloatingWindowConfig.quoteChangeShow : false, (16382 & 4096) != 0 ? updateMarketFloatingWindowConfig.priceShow : false, (16382 & 8192) != 0 ? updateMarketFloatingWindowConfig.textSizeMode : 0);
    }

    /* JADX INFO: renamed from: M */
    public static final MarketFloatingWindowConfig m40932M(int i11, MarketFloatingWindowConfig updateMarketFloatingWindowConfig) {
        Intrinsics.checkNotNullParameter(updateMarketFloatingWindowConfig, "$this$updateMarketFloatingWindowConfig");
        return updateMarketFloatingWindowConfig.copy((16382 & 1) != 0 ? updateMarketFloatingWindowConfig.isShow : false, (16382 & 2) != 0 ? updateMarketFloatingWindowConfig.theme : 0, (16382 & 4) != 0 ? updateMarketFloatingWindowConfig.floatingWindowBgAlpha : i11, (16382 & 8) != 0 ? updateMarketFloatingWindowConfig.dataUpdateIntervalTime : 0, (16382 & 16) != 0 ? updateMarketFloatingWindowConfig.displayMode : 0, (16382 & 32) != 0 ? updateMarketFloatingWindowConfig.autoScrollTime : 0, (16382 & 64) != 0 ? updateMarketFloatingWindowConfig.pageTurningTime : 0, (16382 & 128) != 0 ? updateMarketFloatingWindowConfig.pagingMode : 0, (16382 & 256) != 0 ? updateMarketFloatingWindowConfig.pageSize : 0, (16382 & 512) != 0 ? updateMarketFloatingWindowConfig.actionBarShow : false, (16382 & 1024) != 0 ? updateMarketFloatingWindowConfig.currencyNameShow : false, (16382 & 2048) != 0 ? updateMarketFloatingWindowConfig.quoteChangeShow : false, (16382 & 4096) != 0 ? updateMarketFloatingWindowConfig.priceShow : false, (16382 & 8192) != 0 ? updateMarketFloatingWindowConfig.textSizeMode : 0);
    }

    /* JADX INFO: renamed from: N */
    public static final MarketFloatingWindowConfig m40933N(int i11, MarketFloatingWindowConfig updateMarketFloatingWindowConfig) {
        Intrinsics.checkNotNullParameter(updateMarketFloatingWindowConfig, "$this$updateMarketFloatingWindowConfig");
        return updateMarketFloatingWindowConfig.copy((16382 & 1) != 0 ? updateMarketFloatingWindowConfig.isShow : false, (16382 & 2) != 0 ? updateMarketFloatingWindowConfig.theme : 0, (16382 & 4) != 0 ? updateMarketFloatingWindowConfig.floatingWindowBgAlpha : 0, (16382 & 8) != 0 ? updateMarketFloatingWindowConfig.dataUpdateIntervalTime : 0, (16382 & 16) != 0 ? updateMarketFloatingWindowConfig.displayMode : 0, (16382 & 32) != 0 ? updateMarketFloatingWindowConfig.autoScrollTime : 0, (16382 & 64) != 0 ? updateMarketFloatingWindowConfig.pageTurningTime : 0, (16382 & 128) != 0 ? updateMarketFloatingWindowConfig.pagingMode : 0, (16382 & 256) != 0 ? updateMarketFloatingWindowConfig.pageSize : i11, (16382 & 512) != 0 ? updateMarketFloatingWindowConfig.actionBarShow : false, (16382 & 1024) != 0 ? updateMarketFloatingWindowConfig.currencyNameShow : false, (16382 & 2048) != 0 ? updateMarketFloatingWindowConfig.quoteChangeShow : false, (16382 & 4096) != 0 ? updateMarketFloatingWindowConfig.priceShow : false, (16382 & 8192) != 0 ? updateMarketFloatingWindowConfig.textSizeMode : 0);
    }

    /* JADX INFO: renamed from: O */
    public static final MarketFloatingWindowConfig m40934O(int i11, MarketFloatingWindowConfig updateMarketFloatingWindowConfig) {
        Intrinsics.checkNotNullParameter(updateMarketFloatingWindowConfig, "$this$updateMarketFloatingWindowConfig");
        return updateMarketFloatingWindowConfig.copy((16382 & 1) != 0 ? updateMarketFloatingWindowConfig.isShow : false, (16382 & 2) != 0 ? updateMarketFloatingWindowConfig.theme : 0, (16382 & 4) != 0 ? updateMarketFloatingWindowConfig.floatingWindowBgAlpha : 0, (16382 & 8) != 0 ? updateMarketFloatingWindowConfig.dataUpdateIntervalTime : 0, (16382 & 16) != 0 ? updateMarketFloatingWindowConfig.displayMode : 0, (16382 & 32) != 0 ? updateMarketFloatingWindowConfig.autoScrollTime : 0, (16382 & 64) != 0 ? updateMarketFloatingWindowConfig.pageTurningTime : 0, (16382 & 128) != 0 ? updateMarketFloatingWindowConfig.pagingMode : i11, (16382 & 256) != 0 ? updateMarketFloatingWindowConfig.pageSize : 0, (16382 & 512) != 0 ? updateMarketFloatingWindowConfig.actionBarShow : false, (16382 & 1024) != 0 ? updateMarketFloatingWindowConfig.currencyNameShow : false, (16382 & 2048) != 0 ? updateMarketFloatingWindowConfig.quoteChangeShow : false, (16382 & 4096) != 0 ? updateMarketFloatingWindowConfig.priceShow : false, (16382 & 8192) != 0 ? updateMarketFloatingWindowConfig.textSizeMode : 0);
    }

    /* JADX INFO: renamed from: P */
    public static final MarketFloatingWindowConfig m40935P(int i11, MarketFloatingWindowConfig updateMarketFloatingWindowConfig) {
        Intrinsics.checkNotNullParameter(updateMarketFloatingWindowConfig, "$this$updateMarketFloatingWindowConfig");
        return updateMarketFloatingWindowConfig.copy((16382 & 1) != 0 ? updateMarketFloatingWindowConfig.isShow : false, (16382 & 2) != 0 ? updateMarketFloatingWindowConfig.theme : 0, (16382 & 4) != 0 ? updateMarketFloatingWindowConfig.floatingWindowBgAlpha : 0, (16382 & 8) != 0 ? updateMarketFloatingWindowConfig.dataUpdateIntervalTime : 0, (16382 & 16) != 0 ? updateMarketFloatingWindowConfig.displayMode : 0, (16382 & 32) != 0 ? updateMarketFloatingWindowConfig.autoScrollTime : 0, (16382 & 64) != 0 ? updateMarketFloatingWindowConfig.pageTurningTime : i11, (16382 & 128) != 0 ? updateMarketFloatingWindowConfig.pagingMode : 0, (16382 & 256) != 0 ? updateMarketFloatingWindowConfig.pageSize : 0, (16382 & 512) != 0 ? updateMarketFloatingWindowConfig.actionBarShow : false, (16382 & 1024) != 0 ? updateMarketFloatingWindowConfig.currencyNameShow : false, (16382 & 2048) != 0 ? updateMarketFloatingWindowConfig.quoteChangeShow : false, (16382 & 4096) != 0 ? updateMarketFloatingWindowConfig.priceShow : false, (16382 & 8192) != 0 ? updateMarketFloatingWindowConfig.textSizeMode : 0);
    }

    /* JADX INFO: renamed from: Q */
    public static final MarketFloatingWindowConfig m40936Q(boolean z11, MarketFloatingWindowConfig updateMarketFloatingWindowConfig) {
        Intrinsics.checkNotNullParameter(updateMarketFloatingWindowConfig, "$this$updateMarketFloatingWindowConfig");
        return updateMarketFloatingWindowConfig.copy((16382 & 1) != 0 ? updateMarketFloatingWindowConfig.isShow : false, (16382 & 2) != 0 ? updateMarketFloatingWindowConfig.theme : 0, (16382 & 4) != 0 ? updateMarketFloatingWindowConfig.floatingWindowBgAlpha : 0, (16382 & 8) != 0 ? updateMarketFloatingWindowConfig.dataUpdateIntervalTime : 0, (16382 & 16) != 0 ? updateMarketFloatingWindowConfig.displayMode : 0, (16382 & 32) != 0 ? updateMarketFloatingWindowConfig.autoScrollTime : 0, (16382 & 64) != 0 ? updateMarketFloatingWindowConfig.pageTurningTime : 0, (16382 & 128) != 0 ? updateMarketFloatingWindowConfig.pagingMode : 0, (16382 & 256) != 0 ? updateMarketFloatingWindowConfig.pageSize : 0, (16382 & 512) != 0 ? updateMarketFloatingWindowConfig.actionBarShow : false, (16382 & 1024) != 0 ? updateMarketFloatingWindowConfig.currencyNameShow : false, (16382 & 2048) != 0 ? updateMarketFloatingWindowConfig.quoteChangeShow : false, (16382 & 4096) != 0 ? updateMarketFloatingWindowConfig.priceShow : z11, (16382 & 8192) != 0 ? updateMarketFloatingWindowConfig.textSizeMode : 0);
    }

    /* JADX INFO: renamed from: R */
    public static final MarketFloatingWindowConfig m40937R(boolean z11, MarketFloatingWindowConfig updateMarketFloatingWindowConfig) {
        Intrinsics.checkNotNullParameter(updateMarketFloatingWindowConfig, "$this$updateMarketFloatingWindowConfig");
        return updateMarketFloatingWindowConfig.copy((16382 & 1) != 0 ? updateMarketFloatingWindowConfig.isShow : false, (16382 & 2) != 0 ? updateMarketFloatingWindowConfig.theme : 0, (16382 & 4) != 0 ? updateMarketFloatingWindowConfig.floatingWindowBgAlpha : 0, (16382 & 8) != 0 ? updateMarketFloatingWindowConfig.dataUpdateIntervalTime : 0, (16382 & 16) != 0 ? updateMarketFloatingWindowConfig.displayMode : 0, (16382 & 32) != 0 ? updateMarketFloatingWindowConfig.autoScrollTime : 0, (16382 & 64) != 0 ? updateMarketFloatingWindowConfig.pageTurningTime : 0, (16382 & 128) != 0 ? updateMarketFloatingWindowConfig.pagingMode : 0, (16382 & 256) != 0 ? updateMarketFloatingWindowConfig.pageSize : 0, (16382 & 512) != 0 ? updateMarketFloatingWindowConfig.actionBarShow : false, (16382 & 1024) != 0 ? updateMarketFloatingWindowConfig.currencyNameShow : false, (16382 & 2048) != 0 ? updateMarketFloatingWindowConfig.quoteChangeShow : z11, (16382 & 4096) != 0 ? updateMarketFloatingWindowConfig.priceShow : false, (16382 & 8192) != 0 ? updateMarketFloatingWindowConfig.textSizeMode : 0);
    }

    /* JADX INFO: renamed from: S */
    public static final MarketFloatingWindowConfig m40938S(int i11, MarketFloatingWindowConfig updateMarketFloatingWindowConfig) {
        Intrinsics.checkNotNullParameter(updateMarketFloatingWindowConfig, "$this$updateMarketFloatingWindowConfig");
        return updateMarketFloatingWindowConfig.copy((16382 & 1) != 0 ? updateMarketFloatingWindowConfig.isShow : false, (16382 & 2) != 0 ? updateMarketFloatingWindowConfig.theme : 0, (16382 & 4) != 0 ? updateMarketFloatingWindowConfig.floatingWindowBgAlpha : 0, (16382 & 8) != 0 ? updateMarketFloatingWindowConfig.dataUpdateIntervalTime : 0, (16382 & 16) != 0 ? updateMarketFloatingWindowConfig.displayMode : 0, (16382 & 32) != 0 ? updateMarketFloatingWindowConfig.autoScrollTime : 0, (16382 & 64) != 0 ? updateMarketFloatingWindowConfig.pageTurningTime : 0, (16382 & 128) != 0 ? updateMarketFloatingWindowConfig.pagingMode : 0, (16382 & 256) != 0 ? updateMarketFloatingWindowConfig.pageSize : 0, (16382 & 512) != 0 ? updateMarketFloatingWindowConfig.actionBarShow : false, (16382 & 1024) != 0 ? updateMarketFloatingWindowConfig.currencyNameShow : false, (16382 & 2048) != 0 ? updateMarketFloatingWindowConfig.quoteChangeShow : false, (16382 & 4096) != 0 ? updateMarketFloatingWindowConfig.priceShow : false, (16382 & 8192) != 0 ? updateMarketFloatingWindowConfig.textSizeMode : i11);
    }

    /* JADX INFO: renamed from: T */
    public static final MarketFloatingWindowConfig m40939T(int i11, MarketFloatingWindowConfig updateMarketFloatingWindowConfig) {
        Intrinsics.checkNotNullParameter(updateMarketFloatingWindowConfig, "$this$updateMarketFloatingWindowConfig");
        return updateMarketFloatingWindowConfig.copy((16382 & 1) != 0 ? updateMarketFloatingWindowConfig.isShow : false, (16382 & 2) != 0 ? updateMarketFloatingWindowConfig.theme : i11, (16382 & 4) != 0 ? updateMarketFloatingWindowConfig.floatingWindowBgAlpha : 0, (16382 & 8) != 0 ? updateMarketFloatingWindowConfig.dataUpdateIntervalTime : 0, (16382 & 16) != 0 ? updateMarketFloatingWindowConfig.displayMode : 0, (16382 & 32) != 0 ? updateMarketFloatingWindowConfig.autoScrollTime : 0, (16382 & 64) != 0 ? updateMarketFloatingWindowConfig.pageTurningTime : 0, (16382 & 128) != 0 ? updateMarketFloatingWindowConfig.pagingMode : 0, (16382 & 256) != 0 ? updateMarketFloatingWindowConfig.pageSize : 0, (16382 & 512) != 0 ? updateMarketFloatingWindowConfig.actionBarShow : false, (16382 & 1024) != 0 ? updateMarketFloatingWindowConfig.currencyNameShow : false, (16382 & 2048) != 0 ? updateMarketFloatingWindowConfig.quoteChangeShow : false, (16382 & 4096) != 0 ? updateMarketFloatingWindowConfig.priceShow : false, (16382 & 8192) != 0 ? updateMarketFloatingWindowConfig.textSizeMode : 0);
    }

    /* JADX INFO: renamed from: G */
    public final MarketFloatingWindowConfig m40947G() {
        return FloatingWindowConfigManager.f34272a.m40730g();
    }

    @Override // com.kubi.market.monitor.lib.p100ui.floating.setting.ISettingRepository
    /* JADX INFO: renamed from: a */
    public void mo40948a(final int i11) {
        FloatingWindowConfigManager.f34272a.m40746y(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.h1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingRepositoryImpl.m40932M(i11, (MarketFloatingWindowConfig) obj);
            }
        });
    }

    @Override // com.kubi.market.monitor.lib.p100ui.floating.setting.ISettingRepository
    /* JADX INFO: renamed from: b */
    public void mo40949b(final boolean z11) {
        FloatingWindowConfigManager.f34272a.m40746y(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.i1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingRepositoryImpl.m40927H(z11, (MarketFloatingWindowConfig) obj);
            }
        });
    }

    @Override // com.kubi.market.monitor.lib.p100ui.floating.setting.ISettingRepository
    /* JADX INFO: renamed from: c */
    public void mo40950c(boolean z11) {
        FloatingWindowConfigManager.f34272a.m40745w(z11);
    }

    @Override // com.kubi.market.monitor.lib.p100ui.floating.setting.ISettingRepository
    /* JADX INFO: renamed from: d */
    public void mo40951d(final int i11) {
        FloatingWindowConfigManager.f34272a.m40746y(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.d1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingRepositoryImpl.m40931L(i11, (MarketFloatingWindowConfig) obj);
            }
        });
    }

    @Override // com.kubi.market.monitor.lib.p100ui.floating.setting.ISettingRepository
    /* JADX INFO: renamed from: f */
    public void mo40953f(final int i11) {
        FloatingWindowConfigManager.f34272a.m40746y(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.y0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingRepositoryImpl.m40939T(i11, (MarketFloatingWindowConfig) obj);
            }
        });
    }

    @Override // com.kubi.market.monitor.lib.p100ui.floating.setting.ISettingRepository
    /* JADX INFO: renamed from: h */
    public void mo40955h(final int i11) {
        FloatingWindowConfigManager.f34272a.m40746y(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.j1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingRepositoryImpl.m40938S(i11, (MarketFloatingWindowConfig) obj);
            }
        });
    }

    @Override // com.kubi.market.monitor.lib.p100ui.floating.setting.ISettingRepository
    /* JADX INFO: renamed from: i */
    public void mo40956i(final int i11) {
        FloatingWindowConfigManager.f34272a.m40746y(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.z0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingRepositoryImpl.m40928I(i11, (MarketFloatingWindowConfig) obj);
            }
        });
    }

    @Override // com.kubi.market.monitor.lib.p100ui.floating.setting.ISettingRepository
    /* JADX INFO: renamed from: j */
    public void mo40957j(final boolean z11) {
        FloatingWindowConfigManager.f34272a.m40746y(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.x0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingRepositoryImpl.m40937R(z11, (MarketFloatingWindowConfig) obj);
            }
        });
    }

    @Override // com.kubi.market.monitor.lib.p100ui.floating.setting.ISettingRepository
    /* JADX INFO: renamed from: l */
    public void mo40959l(final int i11) {
        FloatingWindowConfigManager.f34272a.m40746y(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.a1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingRepositoryImpl.m40934O(i11, (MarketFloatingWindowConfig) obj);
            }
        });
    }

    @Override // com.kubi.market.monitor.lib.p100ui.floating.setting.ISettingRepository
    /* JADX INFO: renamed from: m */
    public void mo40960m(final boolean z11) {
        FloatingWindowConfigManager.f34272a.m40746y(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.f1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingRepositoryImpl.m40936Q(z11, (MarketFloatingWindowConfig) obj);
            }
        });
    }

    @Override // com.kubi.market.monitor.lib.p100ui.floating.setting.ISettingRepository
    /* JADX INFO: renamed from: n */
    public void mo40961n(final int i11) {
        FloatingWindowConfigManager.f34272a.m40746y(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.b1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingRepositoryImpl.m40935P(i11, (MarketFloatingWindowConfig) obj);
            }
        });
    }

    @Override // com.kubi.market.monitor.lib.p100ui.floating.setting.ISettingRepository
    /* JADX INFO: renamed from: p */
    public void mo40963p(final boolean z11) {
        FloatingWindowConfigManager.f34272a.m40746y(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.g1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingRepositoryImpl.m40929J(z11, (MarketFloatingWindowConfig) obj);
            }
        });
    }

    @Override // com.kubi.market.monitor.lib.p100ui.floating.setting.ISettingRepository
    /* JADX INFO: renamed from: r */
    public void mo40965r(final int i11) {
        FloatingWindowConfigManager.f34272a.m40746y(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.e1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingRepositoryImpl.m40930K(i11, (MarketFloatingWindowConfig) obj);
            }
        });
    }

    @Override // com.kubi.market.monitor.lib.p100ui.floating.setting.ISettingRepository
    /* JADX INFO: renamed from: s */
    public void mo40966s(final int i11) {
        FloatingWindowConfigManager.f34272a.m40746y(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.c1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingRepositoryImpl.m40933N(i11, (MarketFloatingWindowConfig) obj);
            }
        });
    }
}
