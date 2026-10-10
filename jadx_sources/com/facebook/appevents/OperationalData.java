package com.facebook.appevents;

import android.os.Bundle;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.FacebookException;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: OperationalData.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R,\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m90084d2 = {"Lcom/facebook/appevents/OperationalData;", "", "<init>", "()V", "c", "()Lcom/facebook/appevents/OperationalData;", "Lcom/facebook/appevents/OperationalDataEnum;", "type", "", "key", "value", "", "b", "(Lcom/facebook/appevents/OperationalDataEnum;Ljava/lang/String;Ljava/lang/Object;)V", "d", "(Lcom/facebook/appevents/OperationalDataEnum;Ljava/lang/String;)Ljava/lang/Object;", "Lorg/json/JSONObject;", "e", "()Lorg/json/JSONObject;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/Map;", "operationalData", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOperationalData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperationalData.kt\ncom/facebook/appevents/OperationalData\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,252:1\n457#2:253\n403#2:254\n1238#3,4:255\n*S KotlinDebug\n*F\n+ 1 OperationalData.kt\ncom/facebook/appevents/OperationalData\n*L\n74#1:253\n74#1:254\n74#1:255,4\n*E\n"})
public final class OperationalData {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Set<String> f7670c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Set<String> f7671d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Map<OperationalDataEnum, Pair<Set<String>, Set<String>>> f7672e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<OperationalDataEnum, Map<String, Object>> operationalData = new LinkedHashMap();

    /* JADX INFO: compiled from: OperationalData.kt */
    @Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013JB\u0010\u0014\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\n2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J,\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u0007\u001a&\u0012\u0004\u0012\u00020\t\u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/facebook/appevents/OperationalData$Companion;", "", "()V", "iapOperationalAndCustomParameters", "", "", "iapOperationalParameters", "parameterClassifications", "", "Lcom/facebook/appevents/OperationalDataEnum;", "Lkotlin/Pair;", "addParameter", "", "typeOfParameter", "key", "value", "customEventsParams", "Landroid/os/Bundle;", "operationalData", "Lcom/facebook/appevents/OperationalData;", "addParameterAndReturn", "getParameter", ReportDataTable.COLUMN_PARAMS, "getParameterClassification", "Lcom/facebook/appevents/ParameterClassification;", "parameter", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: com.facebook.appevents.OperationalData$Companion$a */
        /* JADX INFO: compiled from: OperationalData.kt */
        @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
        public /* synthetic */ class C5503a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ParameterClassification.values().length];
                try {
                    iArr[ParameterClassification.CustomData.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ParameterClassification.OperationalData.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ParameterClassification.CustomAndOperationalData.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Companion() {
        }

        public final void addParameter(@NotNull OperationalDataEnum typeOfParameter, @NotNull String key, @NotNull String value, @NotNull Bundle customEventsParams, @NotNull OperationalData operationalData) {
            Intrinsics.checkNotNullParameter(typeOfParameter, "typeOfParameter");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(customEventsParams, "customEventsParams");
            Intrinsics.checkNotNullParameter(operationalData, "operationalData");
            int i11 = C5503a.$EnumSwitchMapping$0[getParameterClassification(typeOfParameter, key).ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        return;
                    }
                    operationalData.m7888b(typeOfParameter, key, value);
                    customEventsParams.putCharSequence(key, value);
                    return;
                }
                operationalData.m7888b(typeOfParameter, key, value);
                return;
            }
            customEventsParams.putCharSequence(key, value);
        }

        @NotNull
        public final Pair<Bundle, OperationalData> addParameterAndReturn(@NotNull OperationalDataEnum typeOfParameter, @NotNull String key, @NotNull String value, @Nullable Bundle customEventsParams, @Nullable OperationalData operationalData) {
            Intrinsics.checkNotNullParameter(typeOfParameter, "typeOfParameter");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            int i11 = C5503a.$EnumSwitchMapping$0[getParameterClassification(typeOfParameter, key).ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        if (operationalData == null) {
                            operationalData = new OperationalData();
                        }
                        if (customEventsParams == null) {
                            customEventsParams = new Bundle();
                        }
                        operationalData.m7888b(typeOfParameter, key, value);
                        customEventsParams.putCharSequence(key, value);
                    }
                } else {
                    if (operationalData == null) {
                        operationalData = new OperationalData();
                    }
                    operationalData.m7888b(typeOfParameter, key, value);
                }
            } else {
                if (customEventsParams == null) {
                    customEventsParams = new Bundle();
                }
                customEventsParams.putCharSequence(key, value);
            }
            return new Pair<>(customEventsParams, operationalData);
        }

        @Nullable
        public final Object getParameter(@NotNull OperationalDataEnum typeOfParameter, @NotNull String key, @Nullable Bundle params, @Nullable OperationalData operationalData) {
            Object objM7890d;
            Intrinsics.checkNotNullParameter(typeOfParameter, "typeOfParameter");
            Intrinsics.checkNotNullParameter(key, "key");
            CharSequence charSequence = null;
            if (operationalData != null) {
                objM7890d = operationalData.m7890d(typeOfParameter, key);
            } else {
                objM7890d = null;
            }
            if (params != null) {
                charSequence = params.getCharSequence(key);
            }
            if (objM7890d == null) {
                return charSequence;
            }
            return objM7890d;
        }

        @NotNull
        public final ParameterClassification getParameterClassification(@NotNull OperationalDataEnum typeOfParameter, @NotNull String parameter) {
            Set set;
            Intrinsics.checkNotNullParameter(typeOfParameter, "typeOfParameter");
            Intrinsics.checkNotNullParameter(parameter, "parameter");
            Pair pair = (Pair) OperationalData.f7672e.get(typeOfParameter);
            Set set2 = null;
            if (pair != null) {
                set = (Set) pair.getFirst();
            } else {
                set = null;
            }
            Pair pair2 = (Pair) OperationalData.f7672e.get(typeOfParameter);
            if (pair2 != null) {
                set2 = (Set) pair2.getSecond();
            }
            if (set != null && set.contains(parameter)) {
                return ParameterClassification.OperationalData;
            }
            if (set2 != null && set2.contains(parameter)) {
                return ParameterClassification.CustomAndOperationalData;
            }
            return ParameterClassification.CustomData;
        }
    }

    static {
        Set<String> of2 = SetsKt.setOf((Object[]) new String[]{"fb_iap_package_name", "fb_iap_subs_auto_renewing", "fb_free_trial_period", "fb_intro_price_amount_micros", "fb_intro_price_cycles", "fb_iap_base_plan", "is_implicit_purchase_logging_enabled", "fb_iap_sdk_supported_library_versions", "is_autolog_app_events_enabled", "fb_iap_client_library_version", "fb_iap_subs_period", "fb_iap_purchase_token", "fb_iap_non_deduped_event_time", "fb_iap_actual_dedup_result", "fb_iap_actual_dedup_key_used", "fb_iap_test_dedup_result", "fb_iap_test_dedup_key_used"});
        f7670c = of2;
        Set<String> of3 = SetsKt.setOf((Object[]) new String[]{"fb_iap_product_id", "fb_iap_product_type", "fb_iap_purchase_time"});
        f7671d = of3;
        f7672e = MapsKt.mapOf(TuplesKt.m90091to(OperationalDataEnum.IAPParameters, new Pair(of2, of3)));
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final OperationalData m7889c() {
        OperationalData operationalData = new OperationalData();
        for (OperationalDataEnum operationalDataEnum : this.operationalData.keySet()) {
            Map<String, Object> map = this.operationalData.get(operationalDataEnum);
            if (map != null) {
                for (String str : map.keySet()) {
                    Object obj = map.get(str);
                    if (obj != null) {
                        operationalData.m7888b(operationalDataEnum, str, obj);
                    }
                }
            }
        }
        return operationalData;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final JSONObject m7891e() {
        JSONObject jSONObject;
        try {
            Map<OperationalDataEnum, Map<String, Object>> map = this.operationalData;
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
            for (Object obj : map.entrySet()) {
                linkedHashMap.put(((OperationalDataEnum) ((Map.Entry) obj).getKey()).getValue(), ((Map.Entry) obj).getValue());
            }
            jSONObject = new JSONObject(MapsKt.toMap(linkedHashMap));
        } catch (Exception unused) {
            jSONObject = null;
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public final void m7888b(@NotNull OperationalDataEnum type, @NotNull String key, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            AppEvent.INSTANCE.validateIdentifier(key);
            if (!(value instanceof String) && !(value instanceof Number)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{value, key}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                throw new FacebookException(str);
            }
            if (!this.operationalData.containsKey(type)) {
                this.operationalData.put(type, new LinkedHashMap());
            }
            Map<String, Object> map = this.operationalData.get(type);
            if (map != null) {
                map.put(key, value);
            }
        } catch (Exception unused) {
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m7890d(@NotNull OperationalDataEnum type, @NotNull String key) {
        Map<String, Object> map;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.operationalData.containsKey(type) || (map = this.operationalData.get(type)) == null) {
            return null;
        }
        return map.get(key);
    }
}
