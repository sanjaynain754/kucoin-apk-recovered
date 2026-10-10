package com.kubi.p110rn.core.pageopen;

import com.facebook.react.bridge.ReadableMap;
import com.kubi.sdk.performance.pageopen.PageOpenMode;
import com.kubi.sdk.performance.pageopen.PageOpenPhaseTimings;
import com.kubi.sdk.performance.pageopen.PageOpenResult;
import com.kubi.sdk.performance.pageopen.PageOpenStageRecord;
import com.kubi.sdk.performance.pageopen.PageOpenValidation;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.math.MathKt;
import p852kotlin.sequences.SequencesKt;
import ro.C44128b;

/* JADX INFO: compiled from: KrnPageOpenBridgePayload.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J#\u0010\r\u001a\u00020\u000e2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012H\u0000¢\u0006\u0002\b\u0013J\u001e\u0010\u0014\u001a\u00020\u000e2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012H\u0002J>\u0010\u0015\u001a\u00020\u000e2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00122\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J(\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J>\u0010\u001c\u001a\u00020\u000e2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00122\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00012\u0006\u0010 \u001a\u00020\u0007H\u0002J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0005H\u0002J)\u0010&\u001a\u0004\u0018\u00010\t*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00122\u0006\u0010'\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010(J$\u0010)\u001a\u0004\u0018\u00010\u0005*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00122\u0006\u0010'\u001a\u00020\u0005H\u0002J)\u0010*\u001a\u0004\u0018\u00010+*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00122\u0006\u0010'\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010,J)\u0010-\u001a\u0004\u0018\u00010\u0007*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00122\u0006\u0010'\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010.J1\u0010/\u001a\u00020+*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00122\u0006\u0010'\u001a\u00020\u00052\b\u00100\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u00101J\"\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u00063"}, m90084d2 = {"Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgePayloadParser;", "", "<init>", "()V", "TAG", "", "PHASE_TOLERANCE_MS", "", "PROTOCOL_VERSION", "", "ACTION_BIND", "ACTION_DATA_READY", "ACTION_FINISH", "parse", "Lcom/kubi/rn/core/pageopen/KrnPageOpenPayloadParseResult;", ReportDataTable.COLUMN_PARAMS, "Lcom/facebook/react/bridge/ReadableMap;", "values", "", "parse$BReactNativeLib_googleRelease", "parseMap", "parseDataReady", "rootTag", "routeKey", "pageId", "openMode", "Lcom/kubi/sdk/performance/pageopen/PageOpenMode;", "parseBind", "parseFinish", "parseStage", "Lcom/kubi/sdk/performance/pageopen/PageOpenStageRecord;", "value", "maxDurationMs", "accepted", "payload", "Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgePayload;", "rejected", "code", "intValue", "key", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;", "stringValue", "optionalBoolean", "", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;", "durationValue", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;", "hasInvalidDuration", "parsed", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Long;)Z", "stringKeyMap", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKrnPageOpenBridgePayload.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KrnPageOpenBridgePayload.kt\ncom/kubi/rn/core/pageopen/KrnPageOpenBridgePayloadParser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,365:1\n1#2:366\n1#2:377\n1617#3,9:367\n1869#3:376\n1870#3:378\n1626#3:379\n*S KotlinDebug\n*F\n+ 1 KrnPageOpenBridgePayload.kt\ncom/kubi/rn/core/pageopen/KrnPageOpenBridgePayloadParser\n*L\n359#1:377\n359#1:367,9\n359#1:376\n359#1:378\n359#1:379\n*E\n"})
public final class KrnPageOpenBridgePayloadParser {

    @NotNull
    private static final String ACTION_BIND = "bind";

    @NotNull
    private static final String ACTION_DATA_READY = "data_ready";

    @NotNull
    private static final String ACTION_FINISH = "finish";

    @NotNull
    public static final KrnPageOpenBridgePayloadParser INSTANCE = new KrnPageOpenBridgePayloadParser();
    private static final long PHASE_TOLERANCE_MS = 2;
    private static final int PROTOCOL_VERSION = 1;

    @NotNull
    private static final String TAG = "KrnPageOpenPayload";

    @NotNull
    public final KrnPageOpenPayloadParseResult parse(@Nullable ReadableMap params) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(params != null ? params.toHashMap() : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            C44128b.m97270n(TAG, "PageOpen payload map conversion failed");
        }
        HashMap map = (HashMap) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
        return map == null ? rejected("missing_payload") : parse$BReactNativeLib_googleRelease(map);
    }

    private final KrnPageOpenPayloadParseResult accepted(KrnPageOpenBridgePayload payload) {
        return new KrnPageOpenPayloadParseResult(payload, null);
    }

    private final KrnPageOpenPayloadParseResult parseBind(int rootTag, String routeKey, String pageId, PageOpenMode openMode) {
        return openMode != PageOpenMode.CONTAINER_ENTRY ? rejected("bind_not_supported_for_navigation") : accepted(new KrnPageOpenBindPayload(rootTag, routeKey, pageId, openMode));
    }

    private final KrnPageOpenPayloadParseResult parseDataReady(Map<String, ? extends Object> values, int rootTag, String routeKey, String pageId, PageOpenMode openMode) {
        if (openMode != PageOpenMode.CONTAINER_ENTRY) {
            return rejected("data_ready_not_supported_for_navigation");
        }
        String strStringValue = stringValue(values, "pageTraceId");
        if (strStringValue == null) {
            return rejected("invalid_page_trace_id");
        }
        if (!PageOpenValidation.f47249a.m57426f(strStringValue)) {
            return rejected("invalid_page_trace_id");
        }
        Boolean boolOptionalBoolean = optionalBoolean(values, "cacheHit");
        return (values.containsKey("cacheHit") && boolOptionalBoolean == null) ? rejected("invalid_cache_hit") : accepted(new KrnPageOpenDataReadyPayload(rootTag, routeKey, pageId, openMode, strStringValue, boolOptionalBoolean));
    }

    private final KrnPageOpenPayloadParseResult parseFinish(Map<String, ? extends Object> values, int rootTag, String routeKey, String pageId, PageOpenMode openMode) {
        Map<String, Object> mapStringKeyMap;
        List listEmptyList;
        String strStringValue = stringValue(values, "pageTraceId");
        if (strStringValue == null) {
            return rejected("invalid_page_trace_id");
        }
        if (!PageOpenValidation.f47249a.m57426f(strStringValue)) {
            return rejected("invalid_page_trace_id");
        }
        PageOpenResult pageOpenResultFromValue = PageOpenResult.INSTANCE.fromValue(stringValue(values, DbParams.KEY_CHANNEL_RESULT));
        if (pageOpenResultFromValue == null) {
            return rejected("invalid_result");
        }
        String strStringValue2 = stringValue(values, "source");
        PageOpenMode pageOpenMode = PageOpenMode.IN_BUNDLE_NAVIGATION;
        if (openMode == pageOpenMode && !Intrinsics.areEqual(strStringValue2, "rn_navigation")) {
            return rejected("invalid_source");
        }
        Boolean boolOptionalBoolean = optionalBoolean(values, "cacheHit");
        if (values.containsKey("cacheHit") && boolOptionalBoolean == null) {
            return rejected("invalid_cache_hit");
        }
        Object obj = values.get("timings");
        if (obj == null) {
            mapStringKeyMap = MapsKt.emptyMap();
        } else {
            if (!(obj instanceof Map)) {
                return rejected("invalid_timings");
            }
            mapStringKeyMap = stringKeyMap((Map) obj);
        }
        Long lDurationValue = durationValue(mapStringKeyMap, "ttidMs");
        Long lDurationValue2 = durationValue(mapStringKeyMap, "ttfdMs");
        Long lDurationValue3 = durationValue(mapStringKeyMap, "dataPhaseMs");
        Long lDurationValue4 = durationValue(mapStringKeyMap, "renderPhaseMs");
        if (hasInvalidDuration(mapStringKeyMap, "ttidMs", lDurationValue) || hasInvalidDuration(mapStringKeyMap, "ttfdMs", lDurationValue2) || hasInvalidDuration(mapStringKeyMap, "dataPhaseMs", lDurationValue3) || hasInvalidDuration(mapStringKeyMap, "renderPhaseMs", lDurationValue4)) {
            return rejected("invalid_timings");
        }
        if (lDurationValue != null && lDurationValue2 != null && lDurationValue.longValue() > lDurationValue2.longValue()) {
            return rejected("invalid_timing_order");
        }
        if ((lDurationValue3 == null) != (lDurationValue4 == null)) {
            return rejected("invalid_phase_timings");
        }
        if (openMode == pageOpenMode && pageOpenResultFromValue != PageOpenResult.SUCCESS && (lDurationValue3 != null || lDurationValue4 != null)) {
            return rejected("invalid_phase_timings");
        }
        if (openMode == pageOpenMode && (lDurationValue2 == null || (pageOpenResultFromValue == PageOpenResult.SUCCESS && lDurationValue == null))) {
            return rejected("missing_navigation_timings");
        }
        if (openMode == pageOpenMode && pageOpenResultFromValue == PageOpenResult.SUCCESS && (lDurationValue3 == null || lDurationValue4 == null)) {
            return rejected("invalid_phase_timings");
        }
        if (openMode == pageOpenMode && pageOpenResultFromValue == PageOpenResult.SUCCESS && lDurationValue != null && lDurationValue2 != null && lDurationValue3 != null && lDurationValue4 != null && Math.abs(((lDurationValue.longValue() + lDurationValue3.longValue()) + lDurationValue4.longValue()) - lDurationValue2.longValue()) > 2) {
            return rejected("invalid_phase_timings");
        }
        Object obj2 = values.get("stageRecords");
        if (obj2 == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            if (!(obj2 instanceof List)) {
                return rejected("invalid_stage_records");
            }
            listEmptyList = (List) obj2;
        }
        final long jLongValue = lDurationValue2 != null ? lDurationValue2.longValue() : 300000L;
        return accepted(new KrnPageOpenFinishPayload(rootTag, routeKey, pageId, openMode, strStringValue, strStringValue2, pageOpenResultFromValue, boolOptionalBoolean, lDurationValue, lDurationValue2, new PageOpenPhaseTimings(lDurationValue3, lDurationValue4), SequencesKt.toList(SequencesKt.take(SequencesKt.mapNotNull(CollectionsKt.asSequence(listEmptyList), new Function1() { // from class: com.kubi.rn.core.pageopen.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return KrnPageOpenBridgePayloadParser.parseFinish$lambda$5(jLongValue, obj3);
            }
        }), 20))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PageOpenStageRecord parseFinish$lambda$5(long j11, Object obj) {
        return INSTANCE.parseStage(obj, j11);
    }

    private final KrnPageOpenPayloadParseResult parseMap(Map<String, ? extends Object> values) {
        Integer numIntValue = intValue(values, "protocolVersion");
        if (numIntValue == null || numIntValue.intValue() != 1) {
            return rejected("unsupported_protocol");
        }
        Integer numIntValue2 = intValue(values, "RootTag");
        if (numIntValue2 == null || numIntValue2.intValue() <= 0) {
            return rejected("invalid_root_tag");
        }
        String strStringValue = stringValue(values, "routeKey");
        if (strStringValue == null) {
            return rejected("invalid_route_key");
        }
        PageOpenValidation pageOpenValidation = PageOpenValidation.f47249a;
        if (!pageOpenValidation.m57424d(strStringValue)) {
            return rejected("invalid_route_key");
        }
        String strStringValue2 = stringValue(values, "pageId");
        if (strStringValue2 == null) {
            return rejected("invalid_page_id");
        }
        if (!pageOpenValidation.m57423c(strStringValue2)) {
            return rejected("invalid_page_id");
        }
        String strStringValue3 = stringValue(values, "openMode");
        PageOpenMode pageOpenMode = PageOpenMode.CONTAINER_ENTRY;
        if (!Intrinsics.areEqual(strStringValue3, pageOpenMode.getValue())) {
            pageOpenMode = PageOpenMode.IN_BUNDLE_NAVIGATION;
            if (!Intrinsics.areEqual(strStringValue3, pageOpenMode.getValue())) {
                return rejected("invalid_open_mode");
            }
        }
        PageOpenMode pageOpenMode2 = pageOpenMode;
        String strStringValue4 = stringValue(values, TUIConstants.TIMPush.NOTIFICATION.ACTION);
        if (strStringValue4 != null) {
            int iHashCode = strStringValue4.hashCode();
            if (iHashCode != -1274442605) {
                if (iHashCode != 3023933) {
                    if (iHashCode == 1618298062 && strStringValue4.equals(ACTION_DATA_READY)) {
                        return parseDataReady(values, numIntValue2.intValue(), strStringValue, strStringValue2, pageOpenMode2);
                    }
                } else if (strStringValue4.equals(ACTION_BIND)) {
                    return parseBind(numIntValue2.intValue(), strStringValue, strStringValue2, pageOpenMode2);
                }
            } else if (strStringValue4.equals(ACTION_FINISH)) {
                return parseFinish(values, numIntValue2.intValue(), strStringValue, strStringValue2, pageOpenMode2);
            }
        }
        return rejected("invalid_action");
    }

    private final PageOpenStageRecord parseStage(Object obj, long j11) {
        Map<String, Object> mapStringKeyMap;
        String strStringValue;
        Long lDurationValue;
        Map<?, ?> map = obj instanceof Map ? (Map) obj : null;
        if (map == null || (mapStringKeyMap = stringKeyMap(map)) == null || (strStringValue = stringValue(mapStringKeyMap, "name")) == null) {
            return null;
        }
        PageOpenValidation pageOpenValidation = PageOpenValidation.f47249a;
        if (!pageOpenValidation.m57425e(strStringValue)) {
            return null;
        }
        String strStringValue2 = stringValue(mapStringKeyMap, "stageScope");
        if ((strStringValue2 == null || Intrinsics.areEqual(strStringValue2, "business")) && (lDurationValue = durationValue(mapStringKeyMap, "durationMs")) != null) {
            long jLongValue = lDurationValue.longValue();
            if (pageOpenValidation.m57422a(jLongValue, j11) && Intrinsics.areEqual(stringValue(mapStringKeyMap, DbParams.KEY_CHANNEL_RESULT), "success")) {
                return new PageOpenStageRecord(strStringValue, jLongValue);
            }
            return null;
        }
        return null;
    }

    private final KrnPageOpenPayloadParseResult rejected(String code) {
        return new KrnPageOpenPayloadParseResult(null, code);
    }

    @NotNull
    public final KrnPageOpenPayloadParseResult parse$BReactNativeLib_googleRelease(@NotNull Map<String, ? extends Object> values) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(values, "values");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(parseMap(values));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            C44128b.m97270n(TAG, "PageOpen payload parsing failed");
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            objM103844constructorimpl = INSTANCE.rejected("invalid_payload");
        }
        return (KrnPageOpenPayloadParseResult) objM103844constructorimpl;
    }

    private KrnPageOpenBridgePayloadParser() {
    }

    private final Long durationValue(Map<String, ? extends Object> map, String str) {
        Number number;
        Object obj = map.get(str);
        if (obj instanceof Number) {
            number = (Number) obj;
        } else {
            number = null;
        }
        if (number == null) {
            return null;
        }
        double dDoubleValue = number.doubleValue();
        if (Math.abs(dDoubleValue) <= Double.MAX_VALUE && dDoubleValue >= 0.0d) {
            Long lValueOf = Long.valueOf(MathKt.roundToLong(dDoubleValue));
            if (PageOpenValidation.m57421b(PageOpenValidation.f47249a, lValueOf.longValue(), 0L, 2, null)) {
                return lValueOf;
            }
        }
        return null;
    }

    private final boolean hasInvalidDuration(Map<String, ? extends Object> map, String str, Long l11) {
        if (map.containsKey(str) && map.get(str) != null && l11 == null) {
            return true;
        }
        return false;
    }

    private final Integer intValue(Map<String, ? extends Object> map, String str) {
        Number number;
        Object obj = map.get(str);
        if (obj instanceof Number) {
            number = (Number) obj;
        } else {
            number = null;
        }
        if (number == null) {
            return null;
        }
        double dDoubleValue = number.doubleValue();
        if (Math.abs(dDoubleValue) > Double.MAX_VALUE || dDoubleValue % 1.0d != 0.0d || dDoubleValue < -2.147483648E9d || dDoubleValue > 2.147483647E9d) {
            return null;
        }
        return Integer.valueOf((int) dDoubleValue);
    }

    private final Boolean optionalBoolean(Map<String, ? extends Object> map, String str) {
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    private final Map<String, Object> stringKeyMap(Map<?, ?> map) {
        String str;
        Set<Map.Entry<?, ?>> setEntrySet = map.entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Pair pairM90091to = null;
            if (key instanceof String) {
                str = (String) key;
            } else {
                str = null;
            }
            if (str != null) {
                pairM90091to = TuplesKt.m90091to(str, entry.getValue());
            }
            if (pairM90091to != null) {
                arrayList.add(pairM90091to);
            }
        }
        return MapsKt.toMap(arrayList);
    }

    private final String stringValue(Map<String, ? extends Object> map, String str) {
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }
}
