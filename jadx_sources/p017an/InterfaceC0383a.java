package p017an;

import com.appsflyer.AppsFlyerProperties;
import com.kubi.kyc.api.KycInfoEntity;
import com.kubi.kyc.entity.UserKycWayEntity;
import com.kubi.kyc.vendor.jumio.entity.KycStepEntity;
import com.kubi.sdk.base.entity.BaseEntity;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: an.a */
/* JADX INFO: compiled from: KycApi.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\tH'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u0003H'J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u0003H'JB\u0010\r\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00040\u00032(\b\u0001\u0010\u000e\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000fj\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u0001`\u0010H'J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00040\u0003H'R$\u0010\u0011\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/kyc/api/KycApi;", "", "getKycStepTips", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Ljava/util/ArrayList;", "Lcom/kubi/kyc/vendor/jumio/entity/KycStepEntity;", "Lkotlin/collections/ArrayList;", AppsFlyerProperties.CHANNEL, "", "kycResult", "Lcom/kubi/kyc/api/KycInfoEntity;", "kycInfo", "submitSenior", "param", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "kycCode", "getKycCode", "()Lio/reactivex/Observable;", "getKycWay", "Lcom/kubi/kyc/entity/UserKycWayEntity;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC0383a {
    @GET("v1/kyc/code")
    @NotNull
    /* JADX INFO: renamed from: c */
    Observable<BaseEntity<String>> m1515c();

    @GET("v1/kyc/step/tips")
    @NotNull
    /* JADX INFO: renamed from: d */
    Observable<BaseEntity<ArrayList<KycStepEntity>>> m1516d(@NotNull @Query(AppsFlyerProperties.CHANNEL) String str);

    @GET("v1/kyc-info")
    @NotNull
    /* JADX INFO: renamed from: e */
    Observable<BaseEntity<KycInfoEntity>> m1517e();

    @NotNull
    @FormUrlEncoded
    @Headers({"HEADER_FINGER_EVENT:kyc2"})
    @POST("v1/kyc/senior/submit")
    /* JADX INFO: renamed from: f */
    Observable<BaseEntity<Object>> m1518f(@FieldMap @Nullable HashMap<String, String> map);

    @GET("v1/kyc/way")
    @NotNull
    /* JADX INFO: renamed from: g */
    Observable<BaseEntity<UserKycWayEntity>> m1519g();

    @GET("v1/kyc/result")
    @NotNull
    /* JADX INFO: renamed from: h */
    Observable<BaseEntity<KycInfoEntity>> m1520h();
}
