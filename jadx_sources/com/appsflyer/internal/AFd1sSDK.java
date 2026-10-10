package com.appsflyer.internal;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\ncom/appsflyer/internal/components/monitorsdk/helpers/ExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,24:1\n1549#2:25\n1620#2,3:26\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\ncom/appsflyer/internal/components/monitorsdk/helpers/ExtensionsKt\n*L\n16#1:25\n16#1:26,3\n*E\n"})
public final class AFd1sSDK {
    public static final boolean getCurrencyIso4217Code(@NotNull HttpURLConnection httpURLConnection) {
        Intrinsics.checkNotNullParameter(httpURLConnection, "");
        return httpURLConnection.getResponseCode() / 100 == 2;
    }

    @NotNull
    public static final JSONArray getMonetizationNetwork(@NotNull List<ExceptionInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ExceptionInfo) it.next()).AFAdRevenueData());
        }
        return new JSONArray((Collection) arrayList);
    }
}
