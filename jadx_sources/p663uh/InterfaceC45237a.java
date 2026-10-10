package p663uh;

import com.blankj.utilcode.util.C5276j;
import com.kubi.kumex.data.platform.model.OpenEntity;
import com.kubi.kumex.data.platform.model.PreferencesEntity;
import com.kubi.kumex.data.platform.model.TradingNoticeEntity;
import com.kubi.kumex.data.platform.model.TradingNoticeParamsEntity;
import com.kubi.kumex.data.platform.model.UserConfig;
import com.kubi.kumex.data.trade.model.AuUserCategoryVO;
import com.kubi.kumex.data.trade.model.UserTaxEntity;
import com.tencent.bugly.proguard.C33577c3;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: uh.a */
/* JADX INFO: compiled from: ISettingApi.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005H'J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\u0005H'J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\n\u001a\u00020\u000bH'J8\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0003\u0010\u0012\u001a\u00020\u00052\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0005H'JP\u0010\u0014\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00150\rj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0015`\u000f2\b\b\u0001\u0010\u0016\u001a\u00020\u00052\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0012\u001a\u00020\u00052\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0005H'J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0003\u0010\b\u001a\u00020\u0005H'J\u001e\u0010\u001a\u001a\u00020\u00012\u0014\b\u0001\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001cH'J\b\u0010\u001d\u001a\u00020\u001eH'J\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u0005H'J\u0014\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0001\u0010#\u001a\u00020$H'J\"\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001c2\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u0005H'J\n\u0010'\u001a\u0004\u0018\u00010(H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006)À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/data/setting/ISettingApi;", "", "openContract", "Lcom/kubi/kumex/data/platform/model/OpenEntity;", C33577c3.f69334H, "", "fetchTradingNoticeSettings", "Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;", "time", "submitTradingNoticeSettings", "param", "Lcom/kubi/kumex/data/platform/model/TradingNoticeParamsEntity;", "checkValidationCode", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/CheckCodeResultEntity;", "Lkotlin/collections/ArrayList;", "checkCodeParamsEntity", "Lcom/kubi/data/entity/CheckCodeParamsEntity;", "header", "fingerId", "checkRequiredValidation", "", "bizType", "loginToken", "fetchPreferencesSettings", "Lcom/kubi/kumex/data/platform/model/PreferencesEntity;", "submitPreferencesSettings", "request", "", "fetchUserConfig", "Lcom/kubi/kumex/data/platform/model/UserConfig;", "submitUserConfig", "symbol", "fetchTaxRate", "Lcom/kubi/kumex/data/trade/model/UserTaxEntity;", "isTrial", "", "getBizType", "fundsType", "fetchAuUserCategory", "Lcom/kubi/kumex/data/trade/model/AuUserCategoryVO;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC45237a {
    @GET("v2/km/trade/configs/getUserTaxFee")
    @Nullable
    /* JADX INFO: renamed from: a */
    UserTaxEntity mo99971a(@Query("isTrial") boolean z11) throws Throwable;

    @GET("v1/kumex-account/funds-tx-type")
    @NotNull
    /* JADX INFO: renamed from: b */
    Map<String, String> mo99972b(@Nullable @Query("fundsType") String str) throws Throwable;

    @GET("v1/kumex/basic-config")
    @NotNull
    /* JADX INFO: renamed from: d */
    UserConfig mo99973d() throws Throwable;

    @POST("v1/kumex/user/open-contract")
    @NotNull
    /* JADX INFO: renamed from: h */
    OpenEntity mo99974h(@Header("X-DEVICE-FRONT-ID") @NotNull String str) throws Throwable;

    @FormUrlEncoded
    @POST("v1/kumex/basic-config")
    @Nullable
    /* JADX INFO: renamed from: j */
    Object mo99975j(@Field("defaultSymbol") @Nullable String str) throws Throwable;

    @POST("v1/user/user-config")
    @Nullable
    /* JADX INFO: renamed from: l */
    Object mo99976l(@Body @NotNull TradingNoticeParamsEntity tradingNoticeParamsEntity) throws Throwable;

    @GET("v1/contracts/user-preferences")
    @Nullable
    /* JADX INFO: renamed from: n */
    PreferencesEntity mo99977n(@Header("Cache-Time") @NotNull String str) throws Throwable;

    @GET("v1/user/user-configs")
    @Nullable
    /* JADX INFO: renamed from: u */
    TradingNoticeEntity mo99978u(@Header("Cache-Time") @NotNull String str) throws Throwable;

    @GET("v2/km/configs/getAuUserCategory")
    @Nullable
    /* JADX INFO: renamed from: v */
    AuUserCategoryVO mo99979v() throws Throwable;

    @NotNull
    @FormUrlEncoded
    @POST("v1/contracts/user-preferences")
    /* JADX INFO: renamed from: x */
    Object mo99980x(@FieldMap @NotNull Map<String, String> map) throws Throwable;

    /* JADX INFO: renamed from: y */
    static /* synthetic */ OpenEntity m99970y(InterfaceC45237a interfaceC45237a, String str, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openContract");
        }
        if ((i11 & 1) != 0) {
            str = C5276j.m6247f();
            Intrinsics.checkNotNullExpressionValue(str, "getUniqueDeviceId(...)");
        }
        return interfaceC45237a.mo99974h(str);
    }
}
