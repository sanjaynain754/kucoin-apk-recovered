package com.facebook.appevents.cloudbridge;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.LoggingBehavior;
import com.facebook.internal.C5760c;
import com.facebook.internal.Logger;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.ExceptionsKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: AppEventsConversionsAPITransformer.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u00048\u001e,9B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0007\u0010\bJC\u0010\r\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b\u0018\u00010\nj\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b\u0018\u0001`\f2\u0006\u0010\t\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0014\u0010\u0015JW\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u008b\u0001\u0010\u001e\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000f2\u0018\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b0\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010!\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b\u0018\u00010\u001b2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000bH\u0000¢\u0006\u0004\b!\u0010\"J3\u0010#\u001a\u00020\u00132\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b#\u0010$J3\u0010%\u001a\u00020\u00132\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b%\u0010$J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010(JA\u0010*\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b\u0018\u00010\u001b2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b*\u0010+JQ\u0010,\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b\u0018\u00010\u001b2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b2\u0018\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b0\u001bH\u0002¢\u0006\u0004\b,\u0010-J\u008f\u0001\u0010.\u001a\u00020\u00192\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000f2.\u0010\u001c\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b0\nj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b`\f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000fH\u0002¢\u0006\u0004\b.\u0010/R \u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u0002000\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00101R \u00105\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u0002040\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u00101R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002060\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u00101¨\u0006:"}, m90084d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer;", "", "<init>", "()V", "", "field", "value", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "appEvents", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "k", "(Ljava/lang/String;)Ljava/util/ArrayList;", "", TUIConstants.TUIContact.USER_DATA, "appData", "Lcom/facebook/appevents/cloudbridge/AppEventUserAndAppDataField;", "", "g", "(Ljava/util/Map;Ljava/util/Map;Lcom/facebook/appevents/cloudbridge/AppEventUserAndAppDataField;Ljava/lang/Object;)V", "restOfData", "d", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "Lcom/facebook/appevents/cloudbridge/AppEventType;", "eventType", "", "customEvents", "eventTime", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/appevents/cloudbridge/AppEventType;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;", "parameters", "e", "(Ljava/util/Map;)Ljava/util/List;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/util/Map;Lcom/facebook/appevents/cloudbridge/AppEventUserAndAppDataField;Ljava/lang/Object;)V", "i", "input", "j", "(Ljava/lang/String;)Ljava/lang/String;", "commonFields", "c", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/List;", "b", "(Ljava/util/Map;Ljava/util/List;)Ljava/util/List;", "f", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/ArrayList;Ljava/util/Map;)Lcom/facebook/appevents/cloudbridge/AppEventType;", "Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$b;", "Ljava/util/Map;", "topLevelTransformations", "Lcom/facebook/appevents/cloudbridge/CustomEventField;", "Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$a;", "customEventTransformations", "Lcom/facebook/appevents/cloudbridge/ConversionsAPIEventName;", "standardEventTransformations", "DataProcessingParameterName", "ValueTransformationType", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAppEventsConversionsAPITransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppEventsConversionsAPITransformer.kt\ncom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,713:1\n1855#2,2:714\n1855#2,2:716\n1855#2:718\n1855#2,2:719\n1856#2:721\n1855#2,2:722\n215#3,2:724\n*S KotlinDebug\n*F\n+ 1 AppEventsConversionsAPITransformer.kt\ncom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer\n*L\n380#1:714,2\n427#1:716,2\n448#1:718\n453#1:719,2\n448#1:721\n604#1:722,2\n660#1:724,2\n*E\n"})
public final class AppEventsConversionsAPITransformer {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AppEventsConversionsAPITransformer f7713a = new AppEventsConversionsAPITransformer();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Map<AppEventUserAndAppDataField, SectionFieldMapping> topLevelTransformations;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final Map<CustomEventField, SectionCustomEventFieldMapping> customEventTransformations;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final Map<String, ConversionsAPIEventName> standardEventTransformations;

    /* JADX INFO: compiled from: AppEventsConversionsAPITransformer.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m90084d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$DataProcessingParameterName;", "", "rawValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "OPTIONS", "COUNTRY", "STATE", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public enum DataProcessingParameterName {
        OPTIONS("data_processing_options"),
        COUNTRY("data_processing_options_country"),
        STATE("data_processing_options_state");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String rawValue;

        /* JADX INFO: compiled from: AppEventsConversionsAPITransformer.kt */
        @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002¨\u0006\u0007"}, m90084d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$DataProcessingParameterName$Companion;", "", "()V", "invoke", "Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$DataProcessingParameterName;", "rawValue", "", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nAppEventsConversionsAPITransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppEventsConversionsAPITransformer.kt\ncom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$DataProcessingParameterName$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,713:1\n1282#2,2:714\n*S KotlinDebug\n*F\n+ 1 AppEventsConversionsAPITransformer.kt\ncom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$DataProcessingParameterName$Companion\n*L\n341#1:714,2\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }

            @Nullable
            public final DataProcessingParameterName invoke(@NotNull String rawValue) {
                Intrinsics.checkNotNullParameter(rawValue, "rawValue");
                for (DataProcessingParameterName dataProcessingParameterName : DataProcessingParameterName.values()) {
                    if (Intrinsics.areEqual(dataProcessingParameterName.getRawValue(), rawValue)) {
                        return dataProcessingParameterName;
                    }
                }
                return null;
            }
        }

        @NotNull
        public final String getRawValue() {
            return this.rawValue;
        }

        DataProcessingParameterName(String str) {
            this.rawValue = str;
        }
    }

    /* JADX INFO: compiled from: AppEventsConversionsAPITransformer.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m90084d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$ValueTransformationType;", "", "(Ljava/lang/String;I)V", "ARRAY", "BOOL", "INT", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public enum ValueTransformationType {
        ARRAY,
        BOOL,
        INT;


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: compiled from: AppEventsConversionsAPITransformer.kt */
        @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002¨\u0006\u0007"}, m90084d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$ValueTransformationType$Companion;", "", "()V", "invoke", "Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$ValueTransformationType;", "rawValue", "", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }

            @Nullable
            public final ValueTransformationType invoke(@NotNull String rawValue) {
                Intrinsics.checkNotNullParameter(rawValue, "rawValue");
                if (Intrinsics.areEqual(rawValue, AppEventUserAndAppDataField.EXT_INFO.getRawValue())) {
                    return ValueTransformationType.ARRAY;
                }
                if (Intrinsics.areEqual(rawValue, AppEventUserAndAppDataField.URL_SCHEMES.getRawValue())) {
                    return ValueTransformationType.ARRAY;
                }
                if (Intrinsics.areEqual(rawValue, CustomEventField.CONTENT_IDS.getRawValue())) {
                    return ValueTransformationType.ARRAY;
                }
                if (Intrinsics.areEqual(rawValue, CustomEventField.CONTENTS.getRawValue())) {
                    return ValueTransformationType.ARRAY;
                }
                if (Intrinsics.areEqual(rawValue, DataProcessingParameterName.OPTIONS.getRawValue())) {
                    return ValueTransformationType.ARRAY;
                }
                if (Intrinsics.areEqual(rawValue, AppEventUserAndAppDataField.ADV_TE.getRawValue())) {
                    return ValueTransformationType.BOOL;
                }
                if (Intrinsics.areEqual(rawValue, AppEventUserAndAppDataField.APP_TE.getRawValue())) {
                    return ValueTransformationType.BOOL;
                }
                if (Intrinsics.areEqual(rawValue, CustomEventField.EVENT_TIME.getRawValue())) {
                    return ValueTransformationType.INT;
                }
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$a, reason: from toString */
    /* JADX INFO: compiled from: AppEventsConversionsAPITransformer.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m90084d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$a;", "", "Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;", "section", "Lcom/facebook/appevents/cloudbridge/ConversionsAPICustomEventField;", "field", "<init>", "(Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;Lcom/facebook/appevents/cloudbridge/ConversionsAPICustomEventField;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;", "b", "()Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;", "setSection", "(Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;)V", "Lcom/facebook/appevents/cloudbridge/ConversionsAPICustomEventField;", "()Lcom/facebook/appevents/cloudbridge/ConversionsAPICustomEventField;", "setField", "(Lcom/facebook/appevents/cloudbridge/ConversionsAPICustomEventField;)V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final /* data */ class SectionCustomEventFieldMapping {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @Nullable
        public ConversionsAPISection section;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public ConversionsAPICustomEventField field;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SectionCustomEventFieldMapping)) {
                return false;
            }
            SectionCustomEventFieldMapping sectionCustomEventFieldMapping = (SectionCustomEventFieldMapping) other;
            return this.section == sectionCustomEventFieldMapping.section && this.field == sectionCustomEventFieldMapping.field;
        }

        public SectionCustomEventFieldMapping(@Nullable ConversionsAPISection conversionsAPISection, @NotNull ConversionsAPICustomEventField field) {
            Intrinsics.checkNotNullParameter(field, "field");
            this.section = conversionsAPISection;
            this.field = field;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ConversionsAPICustomEventField getField() {
            return this.field;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ConversionsAPISection getSection() {
            return this.section;
        }

        public int hashCode() {
            ConversionsAPISection conversionsAPISection = this.section;
            return ((conversionsAPISection == null ? 0 : conversionsAPISection.hashCode()) * 31) + this.field.hashCode();
        }

        @NotNull
        public String toString() {
            return "SectionCustomEventFieldMapping(section=" + this.section + ", field=" + this.field + ')';
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$b, reason: from toString */
    /* JADX INFO: compiled from: AppEventsConversionsAPITransformer.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m90084d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$b;", "", "Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;", "section", "Lcom/facebook/appevents/cloudbridge/ConversionsAPIUserAndAppDataField;", "field", "<init>", "(Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;Lcom/facebook/appevents/cloudbridge/ConversionsAPIUserAndAppDataField;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;", "b", "()Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;", "setSection", "(Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;)V", "Lcom/facebook/appevents/cloudbridge/ConversionsAPIUserAndAppDataField;", "()Lcom/facebook/appevents/cloudbridge/ConversionsAPIUserAndAppDataField;", "setField", "(Lcom/facebook/appevents/cloudbridge/ConversionsAPIUserAndAppDataField;)V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final /* data */ class SectionFieldMapping {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public ConversionsAPISection section;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public ConversionsAPIUserAndAppDataField field;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SectionFieldMapping)) {
                return false;
            }
            SectionFieldMapping sectionFieldMapping = (SectionFieldMapping) other;
            return this.section == sectionFieldMapping.section && this.field == sectionFieldMapping.field;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ConversionsAPIUserAndAppDataField getField() {
            return this.field;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ConversionsAPISection getSection() {
            return this.section;
        }

        public int hashCode() {
            int iHashCode = this.section.hashCode() * 31;
            ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField = this.field;
            return iHashCode + (conversionsAPIUserAndAppDataField == null ? 0 : conversionsAPIUserAndAppDataField.hashCode());
        }

        @NotNull
        public String toString() {
            return "SectionFieldMapping(section=" + this.section + ", field=" + this.field + ')';
        }

        public SectionFieldMapping(@NotNull ConversionsAPISection section, @Nullable ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField) {
            Intrinsics.checkNotNullParameter(section, "section");
            this.section = section;
            this.field = conversionsAPIUserAndAppDataField;
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$c */
    /* JADX INFO: compiled from: AppEventsConversionsAPITransformer.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public /* synthetic */ class C5510c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ValueTransformationType.values().length];
            try {
                iArr[ValueTransformationType.ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ValueTransformationType.BOOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ValueTransformationType.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ConversionsAPISection.values().length];
            try {
                iArr2[ConversionsAPISection.APP_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ConversionsAPISection.USER_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[AppEventType.values().length];
            try {
                iArr3[AppEventType.MOBILE_APP_INSTALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[AppEventType.CUSTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    static {
        AppEventUserAndAppDataField appEventUserAndAppDataField = AppEventUserAndAppDataField.ANON_ID;
        ConversionsAPISection conversionsAPISection = ConversionsAPISection.USER_DATA;
        Pair pairM90091to = TuplesKt.m90091to(appEventUserAndAppDataField, new SectionFieldMapping(conversionsAPISection, ConversionsAPIUserAndAppDataField.ANON_ID));
        Pair pairM90091to2 = TuplesKt.m90091to(AppEventUserAndAppDataField.APP_USER_ID, new SectionFieldMapping(conversionsAPISection, ConversionsAPIUserAndAppDataField.FB_LOGIN_ID));
        Pair pairM90091to3 = TuplesKt.m90091to(AppEventUserAndAppDataField.ADVERTISER_ID, new SectionFieldMapping(conversionsAPISection, ConversionsAPIUserAndAppDataField.MAD_ID));
        Pair pairM90091to4 = TuplesKt.m90091to(AppEventUserAndAppDataField.PAGE_ID, new SectionFieldMapping(conversionsAPISection, ConversionsAPIUserAndAppDataField.PAGE_ID));
        Pair pairM90091to5 = TuplesKt.m90091to(AppEventUserAndAppDataField.PAGE_SCOPED_USER_ID, new SectionFieldMapping(conversionsAPISection, ConversionsAPIUserAndAppDataField.PAGE_SCOPED_USER_ID));
        AppEventUserAndAppDataField appEventUserAndAppDataField2 = AppEventUserAndAppDataField.ADV_TE;
        ConversionsAPISection conversionsAPISection2 = ConversionsAPISection.APP_DATA;
        topLevelTransformations = MapsKt.mapOf(pairM90091to, pairM90091to2, pairM90091to3, pairM90091to4, pairM90091to5, TuplesKt.m90091to(appEventUserAndAppDataField2, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.ADV_TE)), TuplesKt.m90091to(AppEventUserAndAppDataField.APP_TE, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.APP_TE)), TuplesKt.m90091to(AppEventUserAndAppDataField.CONSIDER_VIEWS, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.CONSIDER_VIEWS)), TuplesKt.m90091to(AppEventUserAndAppDataField.DEVICE_TOKEN, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.DEVICE_TOKEN)), TuplesKt.m90091to(AppEventUserAndAppDataField.EXT_INFO, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.EXT_INFO)), TuplesKt.m90091to(AppEventUserAndAppDataField.INCLUDE_DWELL_DATA, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INCLUDE_DWELL_DATA)), TuplesKt.m90091to(AppEventUserAndAppDataField.INCLUDE_VIDEO_DATA, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INCLUDE_VIDEO_DATA)), TuplesKt.m90091to(AppEventUserAndAppDataField.INSTALL_REFERRER, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INSTALL_REFERRER)), TuplesKt.m90091to(AppEventUserAndAppDataField.INSTALLER_PACKAGE, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INSTALLER_PACKAGE)), TuplesKt.m90091to(AppEventUserAndAppDataField.RECEIPT_DATA, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.RECEIPT_DATA)), TuplesKt.m90091to(AppEventUserAndAppDataField.URL_SCHEMES, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.URL_SCHEMES)), TuplesKt.m90091to(AppEventUserAndAppDataField.USER_DATA, new SectionFieldMapping(conversionsAPISection, null)));
        Pair pairM90091to6 = TuplesKt.m90091to(CustomEventField.EVENT_TIME, new SectionCustomEventFieldMapping(null, ConversionsAPICustomEventField.EVENT_TIME));
        Pair pairM90091to7 = TuplesKt.m90091to(CustomEventField.EVENT_NAME, new SectionCustomEventFieldMapping(null, ConversionsAPICustomEventField.EVENT_NAME));
        CustomEventField customEventField = CustomEventField.VALUE_TO_SUM;
        ConversionsAPISection conversionsAPISection3 = ConversionsAPISection.CUSTOM_DATA;
        customEventTransformations = MapsKt.mapOf(pairM90091to6, pairM90091to7, TuplesKt.m90091to(customEventField, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.VALUE_TO_SUM)), TuplesKt.m90091to(CustomEventField.CONTENT_IDS, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.CONTENT_IDS)), TuplesKt.m90091to(CustomEventField.CONTENTS, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.CONTENTS)), TuplesKt.m90091to(CustomEventField.CONTENT_TYPE, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.CONTENT_TYPE)), TuplesKt.m90091to(CustomEventField.CURRENCY, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.CURRENCY)), TuplesKt.m90091to(CustomEventField.DESCRIPTION, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.DESCRIPTION)), TuplesKt.m90091to(CustomEventField.LEVEL, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.LEVEL)), TuplesKt.m90091to(CustomEventField.MAX_RATING_VALUE, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.MAX_RATING_VALUE)), TuplesKt.m90091to(CustomEventField.NUM_ITEMS, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.NUM_ITEMS)), TuplesKt.m90091to(CustomEventField.PAYMENT_INFO_AVAILABLE, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.PAYMENT_INFO_AVAILABLE)), TuplesKt.m90091to(CustomEventField.REGISTRATION_METHOD, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.REGISTRATION_METHOD)), TuplesKt.m90091to(CustomEventField.SEARCH_STRING, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.SEARCH_STRING)), TuplesKt.m90091to(CustomEventField.SUCCESS, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.SUCCESS)), TuplesKt.m90091to(CustomEventField.ORDER_ID, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.ORDER_ID)), TuplesKt.m90091to(CustomEventField.AD_TYPE, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.AD_TYPE)));
        standardEventTransformations = MapsKt.mapOf(TuplesKt.m90091to("fb_mobile_achievement_unlocked", ConversionsAPIEventName.UNLOCKED_ACHIEVEMENT), TuplesKt.m90091to("fb_mobile_activate_app", ConversionsAPIEventName.ACTIVATED_APP), TuplesKt.m90091to("fb_mobile_add_payment_info", ConversionsAPIEventName.ADDED_PAYMENT_INFO), TuplesKt.m90091to("fb_mobile_add_to_cart", ConversionsAPIEventName.ADDED_TO_CART), TuplesKt.m90091to("fb_mobile_add_to_wishlist", ConversionsAPIEventName.ADDED_TO_WISHLIST), TuplesKt.m90091to("fb_mobile_complete_registration", ConversionsAPIEventName.COMPLETED_REGISTRATION), TuplesKt.m90091to("fb_mobile_content_view", ConversionsAPIEventName.VIEWED_CONTENT), TuplesKt.m90091to("fb_mobile_initiated_checkout", ConversionsAPIEventName.INITIATED_CHECKOUT), TuplesKt.m90091to("fb_mobile_level_achieved", ConversionsAPIEventName.ACHIEVED_LEVEL), TuplesKt.m90091to("fb_mobile_purchase", ConversionsAPIEventName.PURCHASED), TuplesKt.m90091to("fb_mobile_rate", ConversionsAPIEventName.RATED), TuplesKt.m90091to("fb_mobile_search", ConversionsAPIEventName.SEARCHED), TuplesKt.m90091to("fb_mobile_spent_credits", ConversionsAPIEventName.SPENT_CREDITS), TuplesKt.m90091to("fb_mobile_tutorial_completion", ConversionsAPIEventName.COMPLETED_TUTORIAL));
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: k */
    public static final ArrayList<Map<String, Object>> m7959k(@NotNull String appEvents) {
        Intrinsics.checkNotNullParameter(appEvents, "appEvents");
        ArrayList<Map> arrayList = new ArrayList();
        try {
            Iterator<T> it = C5760c.m10075m(new JSONArray(appEvents)).iterator();
            while (it.hasNext()) {
                arrayList.add(C5760c.m10076n(new JSONObject((String) it.next())));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            ArrayList<Map<String, Object>> arrayList2 = new ArrayList<>();
            for (Map map : arrayList) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (String str : map.keySet()) {
                    CustomEventField customEventFieldInvoke = CustomEventField.INSTANCE.invoke(str);
                    SectionCustomEventFieldMapping sectionCustomEventFieldMapping = customEventTransformations.get(customEventFieldInvoke);
                    if (customEventFieldInvoke != null && sectionCustomEventFieldMapping != null) {
                        ConversionsAPISection section = sectionCustomEventFieldMapping.getSection();
                        if (section == null) {
                            try {
                                String rawValue = sectionCustomEventFieldMapping.getField().getRawValue();
                                if (customEventFieldInvoke == CustomEventField.EVENT_NAME && ((String) map.get(str)) != null) {
                                    AppEventsConversionsAPITransformer appEventsConversionsAPITransformer = f7713a;
                                    Object obj = map.get(str);
                                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                                    linkedHashMap2.put(rawValue, appEventsConversionsAPITransformer.m7970j((String) obj));
                                } else if (customEventFieldInvoke == CustomEventField.EVENT_TIME && ((Integer) map.get(str)) != null) {
                                    Object obj2 = map.get(str);
                                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Any");
                                    Object objM7960l = m7960l(str, obj2);
                                    Intrinsics.checkNotNull(objM7960l, "null cannot be cast to non-null type kotlin.Any");
                                    linkedHashMap2.put(rawValue, objM7960l);
                                }
                            } catch (ClassCastException e11) {
                                Logger.INSTANCE.log(LoggingBehavior.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents ClassCastException: \n %s ", ExceptionsKt.stackTraceToString(e11));
                            }
                        } else if (section == ConversionsAPISection.CUSTOM_DATA) {
                            String rawValue2 = sectionCustomEventFieldMapping.getField().getRawValue();
                            Object obj3 = map.get(str);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Any");
                            Object objM7960l2 = m7960l(str, obj3);
                            Intrinsics.checkNotNull(objM7960l2, "null cannot be cast to non-null type kotlin.Any");
                            linkedHashMap.put(rawValue2, objM7960l2);
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    linkedHashMap2.put(ConversionsAPISection.CUSTOM_DATA.getRawValue(), linkedHashMap);
                }
                arrayList2.add(linkedHashMap2);
            }
            return arrayList2;
        } catch (JSONException e12) {
            Logger.INSTANCE.log(LoggingBehavior.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", appEvents, e12);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Map] */
    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: l */
    public static final Object m7960l(@NotNull String field, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(value, "value");
        ValueTransformationType valueTransformationTypeInvoke = ValueTransformationType.INSTANCE.invoke(field);
        String str = value instanceof String ? (String) value : null;
        if (valueTransformationTypeInvoke == null || str == null) {
            return value;
        }
        int i11 = C5510c.$EnumSwitchMapping$0[valueTransformationTypeInvoke.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return StringsKt.toIntOrNull(value.toString());
                }
                throw new NoWhenBranchMatchedException();
            }
            Integer intOrNull = StringsKt.toIntOrNull(str.toString());
            if (intOrNull != null) {
                return Boolean.valueOf(intOrNull.intValue() != 0);
            }
            return null;
        }
        try {
            List<String> listM10075m = C5760c.m10075m(new JSONArray(str));
            ArrayList arrayList = new ArrayList();
            Iterator it = listM10075m.iterator();
            while (it.hasNext()) {
                ?? M10075m = (String) it.next();
                try {
                    try {
                        M10075m = C5760c.m10076n(new JSONObject((String) M10075m));
                    } catch (JSONException unused) {
                        M10075m = C5760c.m10075m(new JSONArray((String) M10075m));
                    }
                } catch (JSONException unused2) {
                }
                arrayList.add(M10075m);
            }
            return arrayList;
        } catch (JSONException e11) {
            Logger.INSTANCE.log(LoggingBehavior.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", value, e11);
            return Unit.INSTANCE;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final List<Map<String, Object>> m7961a(@NotNull AppEventType eventType, @NotNull Map<String, Object> userData, @NotNull Map<String, Object> appData, @NotNull Map<String, Object> restOfData, @NotNull List<? extends Map<String, ? extends Object>> customEvents, @Nullable Object eventTime) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(userData, "userData");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(restOfData, "restOfData");
        Intrinsics.checkNotNullParameter(customEvents, "customEvents");
        Map<String, Object> mapM7964d = m7964d(userData, appData, restOfData);
        int i11 = C5510c.$EnumSwitchMapping$2[eventType.ordinal()];
        if (i11 == 1) {
            return m7963c(mapM7964d, eventTime);
        }
        if (i11 != 2) {
            return null;
        }
        return m7962b(mapM7964d, customEvents);
    }

    /* JADX INFO: renamed from: c */
    public final List<Map<String, Object>> m7963c(Map<String, ? extends Object> commonFields, Object eventTime) {
        if (eventTime == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(commonFields);
        linkedHashMap.put(ConversionsAPICustomEventField.EVENT_NAME.getRawValue(), OtherEventConstants.MOBILE_APP_INSTALL.getRawValue());
        linkedHashMap.put(ConversionsAPICustomEventField.EVENT_TIME.getRawValue(), eventTime);
        return CollectionsKt.listOf(linkedHashMap);
    }

    /* JADX INFO: renamed from: f */
    public final AppEventType m7966f(Map<String, ? extends Object> parameters, Map<String, Object> userData, Map<String, Object> appData, ArrayList<Map<String, Object>> customEvents, Map<String, Object> restOfData) {
        Object obj = parameters.get(OtherEventConstants.EVENT.getRawValue());
        AppEventType.Companion companion = AppEventType.INSTANCE;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        AppEventType appEventTypeInvoke = companion.invoke((String) obj);
        if (appEventTypeInvoke != AppEventType.OTHER) {
            for (Map.Entry<String, ? extends Object> entry : parameters.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                AppEventUserAndAppDataField appEventUserAndAppDataFieldInvoke = AppEventUserAndAppDataField.INSTANCE.invoke(key);
                if (appEventUserAndAppDataFieldInvoke != null) {
                    f7713a.m7967g(userData, appData, appEventUserAndAppDataFieldInvoke, value);
                } else {
                    boolean zAreEqual = Intrinsics.areEqual(key, ConversionsAPISection.CUSTOM_EVENTS.getRawValue());
                    boolean z11 = value instanceof String;
                    if (appEventTypeInvoke == AppEventType.CUSTOM && zAreEqual && z11) {
                        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.String");
                        ArrayList<Map<String, Object>> arrayListM7959k = m7959k((String) value);
                        if (arrayListM7959k != null) {
                            customEvents.addAll(arrayListM7959k);
                        }
                    } else if (DataProcessingParameterName.INSTANCE.invoke(key) != null) {
                        restOfData.put(key, value);
                    }
                }
            }
        }
        return appEventTypeInvoke;
    }

    /* JADX INFO: renamed from: h */
    public final void m7968h(Map<String, Object> appData, AppEventUserAndAppDataField field, Object value) {
        ConversionsAPIUserAndAppDataField field2;
        String rawValue;
        SectionFieldMapping sectionFieldMapping = topLevelTransformations.get(field);
        if (sectionFieldMapping == null || (field2 = sectionFieldMapping.getField()) == null || (rawValue = field2.getRawValue()) == null) {
            return;
        }
        appData.put(rawValue, value);
    }

    /* JADX INFO: renamed from: i */
    public final void m7969i(Map<String, Object> userData, AppEventUserAndAppDataField field, Object value) {
        ConversionsAPIUserAndAppDataField field2;
        String rawValue;
        if (field == AppEventUserAndAppDataField.USER_DATA) {
            try {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.String");
                userData.putAll(C5760c.m10076n(new JSONObject((String) value)));
                return;
            } catch (JSONException e11) {
                Logger.INSTANCE.log(LoggingBehavior.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", value, e11);
                return;
            }
        }
        SectionFieldMapping sectionFieldMapping = topLevelTransformations.get(field);
        if (sectionFieldMapping == null || (field2 = sectionFieldMapping.getField()) == null || (rawValue = field2.getRawValue()) == null) {
            return;
        }
        userData.put(rawValue, value);
    }

    /* JADX INFO: renamed from: j */
    public final String m7970j(String input) {
        String rawValue;
        Map<String, ConversionsAPIEventName> map = standardEventTransformations;
        if (!map.containsKey(input)) {
            return input;
        }
        ConversionsAPIEventName conversionsAPIEventName = map.get(input);
        return (conversionsAPIEventName == null || (rawValue = conversionsAPIEventName.getRawValue()) == null) ? "" : rawValue;
    }

    /* JADX INFO: renamed from: b */
    public final List<Map<String, Object>> m7962b(Map<String, ? extends Object> commonFields, List<? extends Map<String, ? extends Object>> customEvents) {
        if (customEvents.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = customEvents.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(commonFields);
            linkedHashMap.putAll(map);
            arrayList.add(linkedHashMap);
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Map<String, Object> m7964d(@NotNull Map<String, ? extends Object> userData, @NotNull Map<String, ? extends Object> appData, @NotNull Map<String, ? extends Object> restOfData) {
        Intrinsics.checkNotNullParameter(userData, "userData");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(restOfData, "restOfData");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OtherEventConstants.ACTION_SOURCE.getRawValue(), OtherEventConstants.APP.getRawValue());
        linkedHashMap.put(ConversionsAPISection.USER_DATA.getRawValue(), userData);
        linkedHashMap.put(ConversionsAPISection.APP_DATA.getRawValue(), appData);
        linkedHashMap.putAll(restOfData);
        return linkedHashMap;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final List<Map<String, Object>> m7965e(@NotNull Map<String, ? extends Object> parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList<Map<String, Object>> arrayList = new ArrayList<>();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        AppEventType appEventTypeM7966f = m7966f(parameters, linkedHashMap, linkedHashMap2, arrayList, linkedHashMap3);
        if (appEventTypeM7966f == AppEventType.OTHER) {
            return null;
        }
        return m7961a(appEventTypeM7966f, linkedHashMap, linkedHashMap2, linkedHashMap3, arrayList, parameters.get(OtherEventConstants.INSTALL_EVENT_TIME.getRawValue()));
    }

    /* JADX INFO: renamed from: g */
    public final void m7967g(@NotNull Map<String, Object> userData, @NotNull Map<String, Object> appData, @NotNull AppEventUserAndAppDataField field, @NotNull Object value) {
        ConversionsAPISection section;
        Intrinsics.checkNotNullParameter(userData, "userData");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(value, "value");
        SectionFieldMapping sectionFieldMapping = topLevelTransformations.get(field);
        if (sectionFieldMapping != null && (section = sectionFieldMapping.getSection()) != null) {
            int i11 = C5510c.$EnumSwitchMapping$1[section.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    m7969i(userData, field, value);
                    return;
                }
                return;
            }
            m7968h(appData, field, value);
        }
    }
}
