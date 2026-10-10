package com.appsflyer.internal;

import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AdRevenueScheme;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes34.dex */
@SourceDebugExtension({"SMAP\nSendAdRevenueTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SendAdRevenueTask.kt\ncom/appsflyer/internal/components/queue/tasks/SendAdRevenueTask\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,77:1\n215#2,2:78\n*S KotlinDebug\n*F\n+ 1 SendAdRevenueTask.kt\ncom/appsflyer/internal/components/queue/tasks/SendAdRevenueTask\n*L\n66#1:78,2\n*E\n"})
public final class AFf1uSDK extends AFf1tSDK {

    @NotNull
    private final AFh1jSDK hashCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1uSDK(@NotNull AFh1jSDK aFh1jSDK, @NotNull AFd1zSDK aFd1zSDK) {
        super(aFh1jSDK, aFd1zSDK);
        Intrinsics.checkNotNullParameter(aFh1jSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.hashCode = aFh1jSDK;
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void getMonetizationNetwork(@NotNull AFh1mSDK aFh1mSDK) {
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        super.getMonetizationNetwork(aFh1mSDK);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        AFAdRevenueData aFAdRevenueData = this.hashCode.toString;
        Intrinsics.checkNotNullExpressionValue(aFAdRevenueData, "");
        linkedHashMap.put("monetization_network", aFAdRevenueData.getMonetizationNetwork());
        linkedHashMap.put("event_revenue_currency", aFAdRevenueData.getCurrencyIso4217Code());
        linkedHashMap.put("mediation_network", aFAdRevenueData.getMediationNetwork().getValue());
        linkedHashMap.put("event_revenue", Double.valueOf(aFAdRevenueData.getRevenue()));
        Map<String, Object> map = this.hashCode.copy;
        if (map != null && !map.isEmpty()) {
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{AdRevenueScheme.AD_TYPE, AdRevenueScheme.AD_UNIT, "country", AdRevenueScheme.PLACEMENT});
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (listListOf.contains(key)) {
                    linkedHashMap.put(key, value);
                } else {
                    linkedHashMap2.put(key, value);
                }
            }
            linkedHashMap.put("custom_parameters", linkedHashMap2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("name", "adrevenue_sdk");
        linkedHashMap3.put("payload", linkedHashMap);
        Map<String, Object> map2 = aFh1mSDK.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(map2, "");
        map2.put("ad_network", linkedHashMap3);
    }
}
