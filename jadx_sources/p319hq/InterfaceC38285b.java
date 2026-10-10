package p319hq;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.SingleCurrencyBalance;
import com.kubi.mine.api.entity.KycStatusEntity;
import com.kubi.mine.lib.entity.NewcomerConfigEntity;
import com.kubi.mine.lib.entity.SocialMediaEntity;
import com.kubi.sdk.base.entity.BaseEntity;
import io.reactivex.Observable;
import java.util.ArrayList;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: hq.b */
/* JADX INFO: compiled from: MineApi.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H'J\u0010\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H'J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\nH'J,\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\nH'JJ\u0010\u0012\u001a$\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00140\u0013j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0014`\u00150\u00032\b\b\u0001\u0010\u0016\u001a\u00020\n2\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u0018\u001a\u00020\nH'J8\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e0\r2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\nH'J\"\u0010\u001c\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000e0\r2\b\b\u0001\u0010\u001d\u001a\u00020\u001eH'J\u0014\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\rH'J\u001e\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e0\r2\b\b\u0001\u0010!\u001a\u00020\nH'J \u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e0\r2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\nH'J<\u0010'\u001a*\u0012$\u0012\"\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010(\u0018\u00010\u0013j\f\u0012\u0006\u0012\u0004\u0018\u00010(\u0018\u0001`\u0015\u0018\u00010\u000e\u0018\u00010\r2\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\nH'R0\u0010\"\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020#0\u0013j\b\u0012\u0004\u0012\u00020#`\u00150\u000e0\r8gX¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006*À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/mine/lib/api/MineApi;", "", "noviceSummary", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/mine/lib/entity/NewcomerConfigEntity;", "kycStatus", "Lcom/kubi/mine/api/entity/KycStatusEntity;", "promotionConfig", "Lcom/kubi/mine/lib/entity/ReferralTextConfig;", "businessLine", "", "code", "getCurrencyBalance", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/data/entity/SingleCurrencyBalance;", "accountType", FirebaseAnalytics.Param.CURRENCY, "getCheckRequiredValidationByFlow", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "bizType", "loginToken", "header", "setUserConfig", "language", "balanceCurrency", "updateDeduction", "enabled", "", "requestTime", "modifyUserName", "nickName", "availableAvatars", "Lcom/kubi/mine/lib/entity/AvatarEntity;", "getAvailableAvatars", "()Lio/reactivex/Observable;", "modifyAvatar", "getSocialMedia", "Lcom/kubi/mine/lib/entity/SocialMediaEntity;", "lang", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC38285b {
    @GET("v1/dismiss/kyc/status")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<KycStatusEntity> m86408a();

    @GET("/timestamp")
    @NotNull
    /* JADX INFO: renamed from: b */
    Observable<BaseEntity<String>> m86409b();

    @FormUrlEncoded
    @POST("v2/auth/user-locale")
    @NotNull
    /* JADX INFO: renamed from: c */
    Observable<BaseEntity<Object>> m86410c(@Field(FirebaseAnalytics.Param.CURRENCY) @Nullable String str, @Field("language") @Nullable String str2, @Field("balanceCurrency") @Nullable String str3);

    @Headers({"X-SENSORS-ID:true"})
    @GET("v1/kcop/newcomer/app/is-newcomer")
    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC41634e<NewcomerConfigEntity> m86411d();

    @FormUrlEncoded
    @POST("v1/account/currency-balance")
    @NotNull
    /* JADX INFO: renamed from: f */
    Observable<BaseEntity<SingleCurrencyBalance>> m86412f(@Field("accountType") @Nullable String str, @Field(FirebaseAnalytics.Param.CURRENCY) @Nullable String str2);

    @FormUrlEncoded
    @POST("v1/auth/check-required-validation")
    @NotNull
    /* JADX INFO: renamed from: g */
    InterfaceC41634e<ArrayList<String[]>> m86413g(@Field("bizType") @NotNull String str, @Field("loginToken") @Nullable String str2, @Header("X-SERVICE-PLATFORM") @NotNull String str3);

    @FormUrlEncoded
    @POST("v1/user/update-kcs-deduction-config")
    @NotNull
    /* JADX INFO: renamed from: h */
    Observable<BaseEntity<Object>> m86414h(@Field("enabled") boolean z11);

    @GET("v1/cms/social-media")
    @Nullable
    /* JADX INFO: renamed from: j */
    Observable<BaseEntity<ArrayList<SocialMediaEntity>>> m86415j(@Nullable @Query("lang") String str);

    /* JADX INFO: renamed from: e */
    static /* synthetic */ Observable m86406e(InterfaceC38285b interfaceC38285b, String str, String str2, String str3, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setUserConfig");
        }
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        return interfaceC38285b.m86410c(str, str2, str3);
    }

    /* JADX INFO: renamed from: i */
    static /* synthetic */ InterfaceC41634e m86407i(InterfaceC38285b interfaceC38285b, String str, String str2, String str3, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCheckRequiredValidationByFlow");
        }
        if ((i11 & 4) != 0) {
            str3 = "KUCOIN";
        }
        return interfaceC38285b.m86413g(str, str2, str3);
    }
}
