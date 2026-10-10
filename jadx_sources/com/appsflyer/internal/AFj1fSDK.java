package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;
import p852kotlin.sequences.Sequence;
import p852kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes.dex */
@JvmName(name = "JsonUtils")
@SourceDebugExtension({"SMAP\nJsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonUtils.kt\ncom/appsflyer/internal/util/JsonUtils\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n759#2,2:62\n775#2,4:64\n759#2,2:68\n775#2,4:70\n1549#3:74\n1620#3,3:75\n*S KotlinDebug\n*F\n+ 1 JsonUtils.kt\ncom/appsflyer/internal/util/JsonUtils\n*L\n16#1:62,2\n16#1:64,4\n28#1:68,2\n28#1:70,4\n44#1:74\n44#1:75,3\n*E\n"})
public final class AFj1fSDK {
    @NotNull
    public static final Map<String, Object> getCurrencyIso4217Code(@NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "");
        Sequence sequenceAsSequence = SequencesKt.asSequence(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : sequenceAsSequence) {
            Object obj2 = jSONObject.get((String) obj);
            Intrinsics.checkNotNullExpressionValue(obj2, "");
            linkedHashMap.put(obj, getCurrencyIso4217Code(obj2));
        }
        return linkedHashMap;
    }

    private static final List<Object> getMonetizationNetwork(JSONArray jSONArray) throws JSONException {
        IntRange intRangeUntil = RangesKt.until(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            Object obj = jSONArray.get(((IntIterator) it).nextInt());
            Intrinsics.checkNotNullExpressionValue(obj, "");
            arrayList.add(getCurrencyIso4217Code(obj));
        }
        return arrayList;
    }

    private static final Object getCurrencyIso4217Code(Object obj) {
        if (obj instanceof JSONArray) {
            return getMonetizationNetwork((JSONArray) obj);
        }
        if (obj instanceof JSONObject) {
            return getCurrencyIso4217Code((JSONObject) obj);
        }
        if (Intrinsics.areEqual(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }
}
