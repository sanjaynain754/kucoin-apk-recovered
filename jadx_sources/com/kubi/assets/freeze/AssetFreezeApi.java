package com.kubi.assets.freeze;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.assets.freeze.entity.TradeAgreementContentEntity;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.kubi.assets.freeze.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AssetFreezeApi.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0004H'J\u0012\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u0004H'J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0014\b\u0001\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/assets/freeze/AssetFreezeApi;", "", "loadMiddleGroundResource", "", "", "", "Lcom/kubi/assets/freeze/AssetMiddleGroundResource;", "code", "loadRwaAgreementContent", "Lcom/kubi/assets/freeze/entity/TradeAgreementContentEntity;", "agreementType", "signRwaAgreement", "Lkotlinx/coroutines/flow/Flow;", TtmlNode.TAG_BODY, "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface AssetFreezeApi {
    @GET("v1/platform-resource-position/position")
    @NotNull
    /* JADX INFO: renamed from: f */
    Map<String, List<AssetMiddleGroundResource>> m16911f(@NotNull @Query("code") String str);

    @GET("v1/trade-agreement/detail")
    @NotNull
    /* JADX INFO: renamed from: g */
    TradeAgreementContentEntity m16912g(@NotNull @Query("agreementTag") String str);

    @FormUrlEncoded
    @POST("v1/trade-agreement/sign")
    @NotNull
    /* JADX INFO: renamed from: h */
    InterfaceC41634e<Object> m16913h(@FieldMap @NotNull Map<String, String> map);

    /* JADX INFO: renamed from: i */
    static /* synthetic */ TradeAgreementContentEntity m16910i(AssetFreezeApi assetFreezeApi, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadRwaAgreementContent");
        }
        if ((i11 & 1) != 0) {
            str = "SPOT-RWA-TRADE-AGREEMENT";
        }
        return assetFreezeApi.m16912g(str);
    }
}
