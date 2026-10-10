package u50;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.tradingbotkit.entity.GridTradingItemEntity;
import com.kubi.tradingbotkit.entity.MarketsEntity;
import com.kubi.utils.storage.StorageType;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.StorageId;

/* JADX INFO: renamed from: u50.a */
/* JADX INFO: compiled from: StorageIds.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001e0\u0007\"\u0004\b\u0000\u0010\u001e*\b\u0012\u0004\u0012\u0002H\u001e0\u00072\u0006\u0010\u001f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\nR\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00100\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\nR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\n¨\u0006%"}, m90084d2 = {"Lcom/kubi/tradingbotkit/storage/StorageIds;", "", "<init>", "()V", "CATEGORY", "", "showOnlyCurrentContractStrategies", "Lcom/kubi/utils/storage/StorageId;", "", "getShowOnlyCurrentContractStrategies", "()Lcom/kubi/utils/storage/StorageId;", "showedNewUserCoupons", "getShowedNewUserCoupons", "openedGridTradingListDialog", "getOpenedGridTradingListDialog", "allSpotGridQuotes", "", "Lcom/kubi/tradingbotkit/entity/MarketsEntity;", "getAllSpotGridQuotes", "curSpotGridSymbol", "getCurSpotGridSymbol", "curFuturesGridSymbol", "getCurFuturesGridSymbol", "defaultSpotGridSymbol", "getDefaultSpotGridSymbol", "defaultFuturesGridSymbol", "getDefaultFuturesGridSymbol", "showedGridGuide", "getShowedGridGuide", "keyPrefixWith", ExifInterface.GPS_DIRECTION_TRUE, "prefix", "supportedGridTypes", "Lcom/kubi/tradingbotkit/entity/GridTradingItemEntity;", "getSupportedGridTypes", "robotWidget", "getRobotWidget", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStorageIds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StorageIds.kt\ncom/kubi/tradingbotkit/storage/StorageIds\n+ 2 StorageId.kt\ncom/kubi/utils/storage/StorageId\n*L\n1#1,138:1\n46#2:139\n*S KotlinDebug\n*F\n+ 1 StorageIds.kt\ncom/kubi/tradingbotkit/storage/StorageIds\n*L\n116#1:139\n*E\n"})
public final class C45125a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45125a f101543a = new C45125a();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final StorageId<Boolean> f101544b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final StorageId<Boolean> f101545c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final StorageId<Boolean> f101546d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final StorageId<List<MarketsEntity>> f101547e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final StorageId<String> f101548f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final StorageId<String> f101549g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final StorageId<String> f101550h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final StorageId<String> f101551i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final StorageId<Boolean> f101552j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final StorageId<List<GridTradingItemEntity>> f101553k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final StorageId<String> f101554l;

    static {
        StorageType storageType = StorageType.LocalSite;
        f101544b = new StorageId<>("TradingBot", "show_only_current_contract_strategies", storageType, false);
        f101545c = new StorageId<>("TradingBot", "show_new_user_coupons", storageType, false);
        f101546d = new StorageId<>("TradingBot", "opened_grid_trading_list_dialog", storageType, false);
        f101547e = new StorageId<>("TradingBot", "all_spot_grid_quotes", storageType, false);
        f101548f = new StorageId<>("TradingBot", "cur_spot_grid_symbol", storageType, false);
        f101549g = new StorageId<>("TradingBot", "cur_futures_grid_symbol", storageType, false);
        f101550h = new StorageId<>("TradingBot", "default_spot_grid_symbol", storageType, false);
        f101551i = new StorageId<>("TradingBot", "default_futures_grid_symbol", storageType, false);
        f101552j = new StorageId<>("TradingBot", "grid_guide", storageType, false);
        f101553k = new StorageId<>("TradingBot", "supported_grid_types", storageType, false);
        f101554l = new StorageId<>("TradingBot", "robot_home_widget", storageType, false);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final StorageId<List<MarketsEntity>> m99746a() {
        return f101547e;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final StorageId<String> m99747b() {
        return f101554l;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final StorageId<Boolean> m99748c() {
        return f101544b;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final StorageId<List<GridTradingItemEntity>> m99749d() {
        return f101553k;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final <T> StorageId<T> m99750e(@NotNull StorageId<T> storageId, @NotNull String prefix) {
        Intrinsics.checkNotNullParameter(storageId, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return new StorageId<>(storageId.getCategory(), prefix + '_' + storageId.getKey(), storageId.getStorageType(), storageId.getSupportLegacy());
    }
}
