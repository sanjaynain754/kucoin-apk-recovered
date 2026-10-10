package com.kubi.jsbridge.impl.network;

import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.kubi.jsbridge.impl.network.h, reason: from Kotlin metadata */
/* JADX INFO: compiled from: UploadFileResultConverter.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001¨\u0006\b"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/network/UploadFileResultConverter;", "", "<init>", "()V", "convert", "", "", DbParams.KEY_CHANNEL_RESULT, "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUploadFileResultConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadFileResultConverter.kt\ncom/kubi/jsbridge/impl/network/UploadFileResultConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,25:1\n1193#2,2:26\n1267#2,4:28\n*S KotlinDebug\n*F\n+ 1 UploadFileResultConverter.kt\ncom/kubi/jsbridge/impl/network/UploadFileResultConverter\n*L\n16#1:26,2\n16#1:28,4\n*E\n"})
public final class UploadFileResultConverter {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final UploadFileResultConverter f27473a = new UploadFileResultConverter();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Map<String, Object> m31821a(@Nullable Object obj) {
        if (!(obj instanceof Map)) {
            Pair pairM90091to = TuplesKt.m90091to("success", Boolean.TRUE);
            Pair pairM90091to2 = TuplesKt.m90091to("code", "200");
            Pair pairM90091to3 = TuplesKt.m90091to("msg", "success");
            if (obj == null) {
                obj = MapsKt.emptyMap();
            }
            return MapsKt.mapOf(pairM90091to, pairM90091to2, pairM90091to3, TuplesKt.m90091to("data", obj));
        }
        Set<Map.Entry> setEntrySet = ((Map) obj).entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            String strValueOf = String.valueOf(entry.getKey());
            Object value = entry.getValue();
            if (value == null) {
                value = MapsKt.emptyMap();
            }
            Pair pairM90091to4 = TuplesKt.m90091to(strValueOf, value);
            linkedHashMap.put(pairM90091to4.getFirst(), pairM90091to4.getSecond());
        }
        return linkedHashMap;
    }
}
