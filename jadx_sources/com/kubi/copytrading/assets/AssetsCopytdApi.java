package com.kubi.copytrading.assets;

import com.kubi.copytrading.CopyTradingConfig;
import com.kubi.copytrading.entity.LeadUserEntity;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.kubi.copytrading.assets.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AssetsCopytdApi.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0006H'J \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0016\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n0\u0003H'J\u001a\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u0013H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/copytrading/assets/AssetsCopytdApi;", "", "fetchLeadTradingAsset", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/copytrading/assets/LeaderTraderAccountInfoEntity;", "conversionUnit", "", "leadConfigId", "header", "fetchLeadTradingPositions", "", "Lcom/kubi/copytrading/assets/LeadTradingPositionEntity;", "fetchCopyTradingAsset", "Lcom/kubi/copytrading/assets/CopyTradingCopyAssetEntity;", "fetchCopyTradingPositions", "Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;", "fetchRecommendLeadTrading", "Lcom/kubi/copytrading/assets/LeadTradingEntity;", "leadTradingItemRequestEntity", "Lcom/kubi/copytrading/assets/LeadTradingItemRequestEntity;", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface AssetsCopytdApi {
    @GET("v1/copyTrading/leadHomePage/positions/current")
    @NotNull
    /* JADX INFO: renamed from: c */
    InterfaceC41634e<List<LeadTradingPositionEntity>> m20662c(@Nullable @Query("leadConfigId") String str);

    @POST("v1/copyTrading/leaderboard/query")
    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC41634e<LeadTradingEntity> m20663d(@Body @NotNull LeadTradingItemRequestEntity leadTradingItemRequestEntity);

    @GET("v1/copyTrading/leadTraders/summary")
    @NotNull
    /* JADX INFO: renamed from: e */
    InterfaceC41634e<LeaderTraderAccountInfoEntity> m20664e(@NotNull @Query("conversionUnit") String str, @Nullable @Query("leadConfigId") String str2, @Header("X-SUB-UID") @Nullable String str3);

    @GET("v1/copyTrading/copyHomePage/traders/current")
    @NotNull
    /* JADX INFO: renamed from: f */
    InterfaceC41634e<List<CopyTradingTraderEntity>> m20665f();

    @GET("v1/copyTrading/copyTraders/summary")
    @NotNull
    /* JADX INFO: renamed from: g */
    InterfaceC41634e<CopyTradingCopyAssetEntity> m20666g(@NotNull @Query("conversionUnit") String str);

    /* JADX INFO: renamed from: a */
    static /* synthetic */ InterfaceC41634e m20660a(AssetsCopytdApi assetsCopytdApi, String str, String str2, String str3, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchLeadTradingAsset");
        }
        if ((i11 & 2) != 0) {
            LeadUserEntity leadUserEntityM20602s = CopyTradingConfig.f19710a.m20602s();
            str2 = leadUserEntityM20602s != null ? leadUserEntityM20602s.getConfigId() : null;
        }
        if ((i11 & 4) != 0) {
            LeadUserEntity leadUserEntityM20602s2 = CopyTradingConfig.f19710a.m20602s();
            str3 = leadUserEntityM20602s2 != null ? leadUserEntityM20602s2.getUid() : null;
        }
        return assetsCopytdApi.m20664e(str, str2, str3);
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ InterfaceC41634e m20661b(AssetsCopytdApi assetsCopytdApi, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchLeadTradingPositions");
        }
        if ((i11 & 1) != 0) {
            LeadUserEntity leadUserEntityM20602s = CopyTradingConfig.f19710a.m20602s();
            str = leadUserEntityM20602s != null ? leadUserEntityM20602s.getConfigId() : null;
        }
        return assetsCopytdApi.m20662c(str);
    }
}
