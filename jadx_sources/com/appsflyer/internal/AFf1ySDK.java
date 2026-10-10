package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\u0002H\u0015¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0012\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u0012\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0015\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\"R\u0014\u0010%\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'"}, m90084d2 = {"Lcom/appsflyer/internal/AFf1ySDK;", "Lcom/appsflyer/internal/AFe1cSDK;", "", "Lcom/appsflyer/internal/AFi1fSDK;", "p0", "Lcom/appsflyer/internal/AFc1kSDK;", "p1", "Lcom/appsflyer/internal/AFd1zSDK;", "p2", "Lcom/appsflyer/internal/AFg1pSDK;", "p3", "Lcom/appsflyer/internal/AFc1fSDK;", "p4", "Lcom/appsflyer/internal/AFh1fSDK;", "p5", "<init>", "(Lcom/appsflyer/internal/AFi1fSDK;Lcom/appsflyer/internal/AFc1kSDK;Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFg1pSDK;Lcom/appsflyer/internal/AFc1fSDK;Lcom/appsflyer/internal/AFh1fSDK;)V", "Lcom/appsflyer/internal/AFd1iSDK;", "AFAdRevenueData", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1iSDK;", "", "getCurrencyIso4217Code", "()J", "Lcom/appsflyer/attribution/AppsFlyerRequestListener;", "areAllFieldsValid", "()Lcom/appsflyer/attribution/AppsFlyerRequestListener;", "", "equals", "()Z", "copydefault", "Lcom/appsflyer/internal/AFc1fSDK;", "getMediationNetwork", "component1", "Lcom/appsflyer/internal/AFh1fSDK;", "Lcom/appsflyer/internal/AFg1pSDK;", "copy", "Lcom/appsflyer/internal/AFc1kSDK;", "getMonetizationNetwork", "hashCode", "Lcom/appsflyer/internal/AFi1fSDK;", "getRevenue"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class AFf1ySDK extends AFe1cSDK<String> {

    /* JADX INFO: renamed from: component1, reason: from kotlin metadata */
    @NotNull
    public AFh1fSDK AFAdRevenueData;

    /* JADX INFO: renamed from: copy, reason: from kotlin metadata */
    @NotNull
    private final AFc1kSDK getMonetizationNetwork;

    /* JADX INFO: renamed from: copydefault, reason: from kotlin metadata */
    @NotNull
    private final AFc1fSDK getMediationNetwork;

    /* JADX INFO: renamed from: equals, reason: from kotlin metadata */
    @NotNull
    private final AFg1pSDK getCurrencyIso4217Code;

    /* JADX INFO: renamed from: hashCode, reason: from kotlin metadata */
    @NotNull
    private final AFi1fSDK getRevenue;

    public /* synthetic */ AFf1ySDK(AFi1fSDK aFi1fSDK, AFc1kSDK aFc1kSDK, AFd1zSDK aFd1zSDK, AFg1pSDK aFg1pSDK, AFc1fSDK aFc1fSDK, AFh1fSDK aFh1fSDK, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFi1fSDK, aFc1kSDK, aFd1zSDK, aFg1pSDK, aFc1fSDK, (i11 & 32) != 0 ? new AFh1fSDK() : aFh1fSDK);
    }

    @Override // com.appsflyer.internal.AFe1cSDK, com.appsflyer.internal.AFe1mSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1cSDK
    @Nullable
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1cSDK
    public final boolean equals() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1cSDK
    @Nullable
    public final AFd1iSDK<String> AFAdRevenueData(@NotNull String p11) throws JSONException {
        AFd1aSDK aFd1aSDK;
        String str;
        LinkedHashMap linkedHashMap;
        Intrinsics.checkNotNullParameter(p11, "");
        AFh1fSDK aFh1fSDK = this.AFAdRevenueData;
        Map<String, Object> map = aFh1fSDK.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(map, "");
        map.put("app_id", this.getMonetizationNetwork.getMediationNetwork.getMonetizationNetwork.getPackageName());
        map.put("sdk_version", AFc1kSDK.AFAdRevenueData());
        map.put(TPDownloadProxyEnum.USER_APP_VERSION, this.getMonetizationNetwork.m5954n_().versionName);
        this.getCurrencyIso4217Code.getCurrencyIso4217Code(map);
        try {
            AFi1gSDK aFi1gSDKAFAdRevenueData = this.getRevenue.AFAdRevenueData();
            if (aFi1gSDKAFAdRevenueData != null) {
                linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("pia_timestamp", Long.valueOf(aFi1gSDKAFAdRevenueData.AFAdRevenueData));
                linkedHashMap2.put("ttr_millis", Long.valueOf(aFi1gSDKAFAdRevenueData.getMonetizationNetwork));
                String str2 = aFi1gSDKAFAdRevenueData.getMediationNetwork;
                if (str2 != null) {
                    linkedHashMap2.put("pia_token", str2);
                }
                String str3 = aFi1gSDKAFAdRevenueData.getCurrencyIso4217Code;
                if (str3 != null) {
                    linkedHashMap2.put("error_code", str3);
                }
                linkedHashMap.put("pia", linkedHashMap2);
            } else {
                linkedHashMap = null;
            }
            if (linkedHashMap != null) {
                aFh1fSDK.getMonetizationNetwork(linkedHashMap);
            }
            if (!this.getRevenue.getCurrencyIso4217Code()) {
                Map<String, Object> map2 = aFh1fSDK.getMonetizationNetwork;
                Intrinsics.checkNotNullExpressionValue(map2, "");
                AFk1xSDK.getRevenue(map2).put("pia_disabled", Boolean.TRUE);
            }
        } catch (Throwable th2) {
            AFg1bSDK.e$default(AFLogger.INSTANCE, AFh1ySDK.PLAY_INTEGRITY_API, "Error while adding PIA data to payload", th2, true, false, false, false, 96, null);
        }
        AFd1mSDK aFd1mSDK = ((AFe1cSDK) this).component4;
        AFd1iSDK<String> aFd1iSDK = (AFd1iSDK) AFd1mSDK.getMonetizationNetwork(new Object[]{aFd1mSDK, this.AFAdRevenueData, ((AFe1cSDK) this).component3.getMonetizationNetwork(), this.getMediationNetwork}, 364095913, -364095911, System.identityHashCode(aFd1mSDK));
        Map<String, Object> map3 = this.AFAdRevenueData.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(map3, "");
        if (aFd1iSDK != null && (aFd1aSDK = aFd1iSDK.getRevenue) != null && (str = aFd1aSDK.getCurrencyIso4217Code) != null) {
            JSONObject jSONObject = new JSONObject(map3);
            if (jSONObject.has("pia")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("pia");
                if (jSONObject2.has("pia_token")) {
                    jSONObject2.put("pia_token", AFh1zSDK.AFAdRevenueData(jSONObject2.getString("pia_token")));
                }
            }
            AFh1zSDK.getCurrencyIso4217Code(toString() + ": preparing data: ", jSONObject);
            AFd1kSDK aFd1kSDK = this.areAllFieldsValid;
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            aFd1kSDK.AFAdRevenueData(str, string);
        }
        return aFd1iSDK;
    }

    @Override // com.appsflyer.internal.AFe1cSDK, com.appsflyer.internal.AFe1mSDK
    public final long getCurrencyIso4217Code() {
        return TimeUnit.MINUTES.toMillis(1L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    private AFf1ySDK(@NotNull AFi1fSDK aFi1fSDK, @NotNull AFc1kSDK aFc1kSDK, @NotNull AFd1zSDK aFd1zSDK, @NotNull AFg1pSDK aFg1pSDK, @NotNull AFc1fSDK aFc1fSDK, @NotNull AFh1fSDK aFh1fSDK) {
        Intrinsics.checkNotNullParameter(aFi1fSDK, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(aFg1pSDK, "");
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
        Intrinsics.checkNotNullParameter(aFh1fSDK, "");
        AFe1oSDK aFe1oSDK = AFe1oSDK.PLAY_INTEGRITY_API;
        AFe1oSDK aFe1oSDK2 = AFe1oSDK.CONVERSION;
        super(aFe1oSDK, new AFe1oSDK[]{aFe1oSDK2}, aFd1zSDK, "PIA");
        this.getRevenue = aFi1fSDK;
        this.getMonetizationNetwork = aFc1kSDK;
        this.getCurrencyIso4217Code = aFg1pSDK;
        this.getMediationNetwork = aFc1fSDK;
        this.AFAdRevenueData = aFh1fSDK;
        this.getMonetizationNetwork.add(aFe1oSDK2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AFf1ySDK(@NotNull AFi1fSDK aFi1fSDK, @NotNull AFc1kSDK aFc1kSDK, @NotNull AFd1zSDK aFd1zSDK, @NotNull AFg1pSDK aFg1pSDK, @NotNull AFc1fSDK aFc1fSDK) {
        this(aFi1fSDK, aFc1kSDK, aFd1zSDK, aFg1pSDK, aFc1fSDK, null, 32, null);
        Intrinsics.checkNotNullParameter(aFi1fSDK, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(aFg1pSDK, "");
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
    }
}
