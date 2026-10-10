package p227ea;

import com.kubi.advert.api.entity.PageConfigEntity;
import com.kubi.advert.api.entity.PromotionConfig;
import com.kubi.advert.entity.AfOpenIdEntity;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/* JADX INFO: renamed from: ea.a */
/* JADX INFO: compiled from: AdvertApi.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J.\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u0006H'J\u001a\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00032\b\b\u0003\u0010\r\u001a\u00020\u0006H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/advert/api/AdvertApi;", "", "promotionConfig", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/advert/api/entity/PromotionConfig;", "businessLine", "", "code", "pageConfig", "Lcom/kubi/advert/api/entity/PageConfigEntity;", "cacheTime", "openId", "Lcom/kubi/advert/entity/AfOpenIdEntity;", "channelCode", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC37124a {
    @Headers({"Cache-Time: 5000"})
    @GET("v1/promotion/configCode")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<PromotionConfig> m83038a(@NotNull @Query("businessLine") String str, @NotNull @Query("code") String str2);

    @GET("v1/user/open-id")
    @NotNull
    /* JADX INFO: renamed from: c */
    InterfaceC41634e<AfOpenIdEntity> m83039c(@NotNull @Query("channelCode") String str);

    @GET("v1/promotion/configCode")
    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC41634e<PageConfigEntity> m83040d(@NotNull @Query("businessLine") String str, @NotNull @Query("code") String str2, @Header("Cache-Time") @NotNull String str3);

    /* JADX INFO: renamed from: b */
    static /* synthetic */ InterfaceC41634e m83037b(InterfaceC37124a interfaceC37124a, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openId");
        }
        if ((i11 & 1) != 0) {
            str = "appsflyer";
        }
        return interfaceC37124a.m83039c(str);
    }
}
