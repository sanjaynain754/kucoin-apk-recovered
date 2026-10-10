package com.appsflyer.internal;

import com.tencent.bugly.proguard.C33616e0;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class AFi1zSDK {

    @Nullable
    public final AFi1wSDK AFAdRevenueData;

    @Nullable
    public final AFh1aSDK getMediationNetwork;

    @Nullable
    public AFi1uSDK getRevenue;

    private static AFh1aSDK getMonetizationNetwork(JSONObject jSONObject) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject monetizationNetwork = getMonetizationNetwork(jSONObject, "exc_mngr");
            objM103844constructorimpl = Result.m103844constructorimpl(monetizationNetwork != null ? new AFh1aSDK(monetizationNetwork.getString("sdk_ver"), monetizationNetwork.optInt("min", -1), monetizationNetwork.optInt("expire", -1), monetizationNetwork.optLong("ttl", -1L)) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return (AFh1aSDK) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
    }

    private static AFi1wSDK getRevenue(JSONObject jSONObject) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject monetizationNetwork = getMonetizationNetwork(jSONObject, "meta_data");
            objM103844constructorimpl = Result.m103844constructorimpl(monetizationNetwork != null ? new AFi1wSDK(monetizationNetwork.optDouble("send_rate", 1.0d)) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return (AFi1wSDK) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(AFi1zSDK.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        AFi1zSDK aFi1zSDK = (AFi1zSDK) obj;
        return Intrinsics.areEqual(this.getMediationNetwork, aFi1zSDK.getMediationNetwork) && Intrinsics.areEqual(this.AFAdRevenueData, aFi1zSDK.AFAdRevenueData) && Intrinsics.areEqual(this.getRevenue, aFi1zSDK.getRevenue);
    }

    public AFi1zSDK(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.getRevenue = getCurrencyIso4217Code(jSONObject);
        this.getMediationNetwork = getMonetizationNetwork(jSONObject);
        this.AFAdRevenueData = getRevenue(jSONObject);
    }

    private static AFi1uSDK getCurrencyIso4217Code(JSONObject jSONObject) {
        Object objM103844constructorimpl;
        AFi1uSDK aFi1uSDK;
        List listEmptyList;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject monetizationNetwork = getMonetizationNetwork(jSONObject, "r_debugger");
            if (monetizationNetwork != null) {
                long j11 = monetizationNetwork.getLong("ttl");
                int i11 = monetizationNetwork.getInt("counter");
                String strOptString = monetizationNetwork.optString("app_ver", "");
                String strOptString2 = monetizationNetwork.optString("sdk_ver", "");
                float fOptDouble = (float) monetizationNetwork.optDouble("ratio", 1.0d);
                JSONArray jSONArrayOptJSONArray = monetizationNetwork.optJSONArray(C33616e0.f69644s);
                if (jSONArrayOptJSONArray != null) {
                    Intrinsics.checkNotNullExpressionValue(jSONArrayOptJSONArray, "");
                    listEmptyList = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i12 = 0; i12 < length; i12++) {
                        String string = jSONArrayOptJSONArray.getString(i12);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        listEmptyList.add(string);
                    }
                } else {
                    listEmptyList = CollectionsKt.emptyList();
                }
                List list = listEmptyList;
                Intrinsics.checkNotNullExpressionValue(strOptString, "");
                Intrinsics.checkNotNullExpressionValue(strOptString2, "");
                aFi1uSDK = new AFi1uSDK(j11, fOptDouble, list, i11, strOptString, strOptString2);
            } else {
                aFi1uSDK = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(aFi1uSDK);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return (AFi1uSDK) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
    }

    public final int hashCode() {
        AFh1aSDK aFh1aSDK = this.getMediationNetwork;
        int iHashCode = (aFh1aSDK != null ? aFh1aSDK.hashCode() : 0) * 31;
        AFi1wSDK aFi1wSDK = this.AFAdRevenueData;
        int iHashCode2 = (iHashCode + (aFi1wSDK != null ? aFi1wSDK.hashCode() : 0)) * 31;
        AFi1uSDK aFi1uSDK = this.getRevenue;
        return iHashCode2 + (aFi1uSDK != null ? aFi1uSDK.hashCode() : 0);
    }

    private static JSONObject getMonetizationNetwork(JSONObject jSONObject, String str) throws JSONException, NullPointerException {
        JSONObject jSONObjectOptJSONObject;
        if (!jSONObject.has(str) || (jSONObjectOptJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("v1");
    }
}
