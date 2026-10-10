package com.kubi.spot.dialog.order;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.spot.dialog.order.model.AmendParams;
import com.kubi.spot.dialog.order.model.AmendResult;
import com.kubi.spot.dialog.order.model.MarginAmendParams;
import com.kubi.spot.entity.LatestPriceEntity;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.kubi.spot.dialog.order.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AmendApi.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000bH'J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\tH'J\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\tH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/spot/dialog/order/AmendApi;", "", "requestAmendOrder", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/spot/dialog/order/model/AmendResult;", TtmlNode.TAG_BODY, "Lcom/kubi/spot/dialog/order/model/AmendParams;", "requestAmendOrderV2", "validationToken", "", "requestMarginAmendOrder", "Lcom/kubi/spot/dialog/order/model/MarginAmendParams;", "requestMarginAmendOrderV2", "getLatestPrice", "Lcom/kubi/spot/entity/LatestPriceEntity;", "symbol", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface AmendApi {
    @GET("v1/market/orderbook-level1")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<LatestPriceEntity> m61721a(@Nullable @Query("symbol") String str);

    @POST("orders/v2/alter")
    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<AmendResult> m61722b(@Body @NotNull AmendParams amendParams, @Header("X-VALIDATION-TOKEN") @NotNull String str);

    @POST("orders/alter")
    @NotNull
    /* JADX INFO: renamed from: c */
    InterfaceC41634e<AmendResult> m61723c(@Body @NotNull AmendParams amendParams);

    @POST("v2/margin/order/alter")
    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC41634e<AmendResult> m61724d(@Body @NotNull MarginAmendParams marginAmendParams, @Header("X-VALIDATION-TOKEN") @NotNull String str);

    @POST("v1/margin/order/alter")
    @NotNull
    /* JADX INFO: renamed from: e */
    InterfaceC41634e<AmendResult> m61725e(@Body @NotNull MarginAmendParams marginAmendParams);
}
