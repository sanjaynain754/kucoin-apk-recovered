package se;

import com.kubi.core.spot.entity.ComplianceInfoEntity;
import com.kubi.core.spot.entity.SpotBannerEntity;
import com.kubi.core.spot.entity.SpotInformationEntity;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: renamed from: se.a */
/* JADX INFO: compiled from: ISpotTradeApi.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H'J\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H'J2\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0006H'J(\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0006H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/spot/business/mvi/ISpotTradeApi;", "", "requestCurrentSymbolHasCoupons", "Lkotlinx/coroutines/flow/Flow;", "", "symbol", "", "getSpotInformation", "Lcom/kubi/core/spot/entity/SpotInformationEntity;", "getRiskWarning", "getSpotNoticeList", "Lcom/kubi/core/spot/entity/SpotBannerEntity;", "category", "blockCode", "symbolCode", "getComplianceInfo", "Lcom/kubi/core/spot/entity/ComplianceInfoEntity;", "type", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC44395a {
    @GET("v1/kc/trade/config/query")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<ComplianceInfoEntity> m97922a(@Nullable @Query("symbol") String str, @Nullable @Query("type") String str2);

    @GET("v1/kc/risk/tips/{symbol}")
    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<String> m97923b(@Path("symbol") @Nullable String str);

    @GET("v1/kc/system/notices")
    @NotNull
    /* JADX INFO: renamed from: c */
    InterfaceC41634e<SpotBannerEntity> m97924c(@Nullable @Query("category") String str, @Nullable @Query("blockCode") String str2, @Nullable @Query("symbolCode") String str3);

    @GET("v1/kc/trade-basic-info")
    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC41634e<SpotInformationEntity> m97925d(@Nullable @Query("symbol") String str);

    /* JADX INFO: renamed from: e */
    static /* synthetic */ InterfaceC41634e m97921e(InterfaceC44395a interfaceC44395a, String str, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getComplianceInfo");
        }
        if ((i11 & 2) != 0) {
            str2 = "9";
        }
        return interfaceC44395a.m97922a(str, str2);
    }
}
