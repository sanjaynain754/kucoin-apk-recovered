package p659uc;

import com.kubi.copytrading.entity.CopyTradingContractEntity;
import com.kubi.utils.storage.StorageType;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.StorageId;

/* JADX INFO: renamed from: uc.a */
/* JADX INFO: compiled from: StorageIds.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/copytrading/storage/StorageIds;", "", "<init>", "()V", "CATEGORY", "", "supportedContractEntities", "Lcom/kubi/utils/storage/StorageId;", "", "Lcom/kubi/copytrading/entity/CopyTradingContractEntity;", "getSupportedContractEntities", "()Lcom/kubi/utils/storage/StorageId;", "hedgeFeatureAvailable", "", "getHedgeFeatureAvailable", "positionModel", "getPositionModel", "userWidget", "getUserWidget", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStorageIds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StorageIds.kt\ncom/kubi/copytrading/storage/StorageIds\n+ 2 StorageId.kt\ncom/kubi/utils/storage/StorageId\n*L\n1#1,58:1\n46#2:59\n46#2:60\n*S KotlinDebug\n*F\n+ 1 StorageIds.kt\ncom/kubi/copytrading/storage/StorageIds\n*L\n33#1:59\n45#1:60\n*E\n"})
public final class C45151a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45151a f101594a = new C45151a();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final StorageId<List<CopyTradingContractEntity>> f101595b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final StorageId<Boolean> f101596c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final StorageId<String> f101597d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final StorageId<String> f101598e;

    static {
        StorageType storageType = StorageType.LocalSite;
        f101595b = new StorageId<>("CopyTrading", "all_supported_symbols", storageType, false);
        StorageId storageId = new StorageId("CopyTrading", "feature_available", storageType, false);
        f101596c = new StorageId<>(storageId.getCategory(), "copyTrading_hedge_" + storageId.getKey(), storageId.getStorageType(), storageId.getSupportLegacy());
        StorageId storageId2 = new StorageId("CopyTrading", "position_mode", storageType, false);
        f101597d = new StorageId<>(storageId2.getCategory(), "copyTrading_" + storageId2.getKey(), storageId2.getStorageType(), storageId2.getSupportLegacy());
        f101598e = new StorageId<>("CopyTrading", "user_home_widget", storageType, false);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final StorageId<Boolean> m99795a() {
        return f101596c;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final StorageId<String> m99796b() {
        return f101597d;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final StorageId<List<CopyTradingContractEntity>> m99797c() {
        return f101595b;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final StorageId<String> m99798d() {
        return f101598e;
    }
}
