package p768xo;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.margin.api.entity.CouponsOverview;
import com.kubi.margin.api.entity.MarginCouponConfig;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: xo.a */
/* JADX INFO: compiled from: CouponApi.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007H'J2\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007H'J4\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032$\b\u0001\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000ej\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`\u000fH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/margin/api/CouponApi;", "", "fetchUserCoupon", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/kubi/margin/api/entity/MarginCouponConfig;", FirebaseAnalytics.Param.CURRENCY, "", "positionType", "positionTag", "fetchCouponView", "Lcom/kubi/margin/api/entity/CouponsOverview;", "useCoupon", TtmlNode.TAG_BODY, "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC46300a {
    @POST("v1/margin-coupon/coupon/use")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<Object> m102053a(@Body @NotNull HashMap<String, String> map);

    @Headers({"Cache-Time: 3000"})
    @GET("v1/margin-coupon/coupon/view")
    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<CouponsOverview> m102054b(@Nullable @Query(FirebaseAnalytics.Param.CURRENCY) String str, @Nullable @Query("positionType") String str2, @Nullable @Query("positionTag") String str3);

    @GET("v1/margin-coupon/coupon/usable")
    @NotNull
    /* JADX INFO: renamed from: c */
    InterfaceC41634e<List<MarginCouponConfig>> m102055c(@Nullable @Query(FirebaseAnalytics.Param.CURRENCY) String str, @Nullable @Query("positionType") String str2, @Nullable @Query("positionTag") String str3);
}
