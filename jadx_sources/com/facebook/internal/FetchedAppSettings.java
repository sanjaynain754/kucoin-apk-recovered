package com.facebook.internal;

import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: FetchedAppSettings.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\bA\u0018\u0000 j2\u00020\u0001:\u0002klB\u008f\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\f0\f\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016\u0012\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&\u0012\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&\u0012 \u0010*\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040&0)\u0018\u00010&\u0012 \u0010+\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040&0)\u0018\u00010&\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0002¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u00101R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR/\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\f0\f8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u00103\u001a\u0004\b2\u00101R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bF\u0010HR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bI\u00105\u001a\u0004\bJ\u00107R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bK\u00105\u001a\u0004\bL\u00107R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bM\u00103\u001a\u0004\bK\u00101R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bN\u00103\u001a\u0004\b:\u00101R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bI\u0010QR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bR\u00105\u001a\u0004\bS\u00107R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bT\u00103\u001a\u0004\bU\u00101R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bV\u00103\u001a\u0004\bW\u00101R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bX\u00105\u001a\u0004\bT\u00107R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bY\u00105\u001a\u0004\bZ\u00107R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bS\u00105\u001a\u0004\bX\u00107R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b[\u0010P\u001a\u0004\bO\u0010QR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b<\u0010P\u001a\u0004\bM\u0010QR%\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bZ\u0010C\u001a\u0004\b\\\u0010ER\u0019\u0010!\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b]\u0010P\u001a\u0004\b8\u0010QR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b0\u0010P\u001a\u0004\bV\u0010QR\u0019\u0010#\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b^\u0010P\u001a\u0004\b[\u0010QR\u0019\u0010$\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b_\u0010P\u001a\u0004\bY\u0010QR\u0019\u0010%\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b`\u0010P\u001a\u0004\b4\u0010QR\u001f\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\b>\u0010cR\u001f\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\bd\u0010b\u001a\u0004\bR\u0010cR1\u0010*\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040&0)\u0018\u00010&8\u0006¢\u0006\f\n\u0004\be\u0010b\u001a\u0004\bN\u0010cR1\u0010+\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040&0)\u0018\u00010&8\u0006¢\u0006\f\n\u0004\bf\u0010b\u001a\u0004\b]\u0010cR\u0019\u0010-\u001a\u0004\u0018\u00010,8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bB\u0010i¨\u0006m"}, m90084d2 = {"Lcom/facebook/internal/FetchedAppSettings;", "", "", "supportsImplicitLogging", "", "nuxContent", "nuxEnabled", "", "sessionTimeoutInSeconds", "Ljava/util/EnumSet;", "Lcom/facebook/internal/SmartLoginOption;", "smartLoginOptions", "", "Lcom/facebook/internal/FetchedAppSettings$DialogFeatureConfig;", "dialogConfigurations", "automaticLoggingEnabled", "Lcom/facebook/internal/FacebookRequestErrorClassification;", "errorClassification", "smartLoginBookmarkIconURL", "smartLoginMenuIconURL", "iAPAutomaticLoggingEnabled", "codelessEventsEnabled", "Lorg/json/JSONArray;", "eventBindings", "sdkUpdateMessage", "trackUninstallEnabled", "monitorViaDialogEnabled", "rawAamRules", "suggestedEventsSetting", "restrictiveDataSetting", "protectedModeStandardParamsSetting", "MACARuleMatchingSetting", "migratedAutoLogValues", "blocklistEvents", "redactedEvents", "sensitiveParams", "schemaRestrictions", "bannedParams", "", "currencyDedupeParameters", "purchaseValueDedupeParameters", "Lkotlin/Pair;", "prodDedupeParameters", "testDedupeParameters", "", "dedupeWindow", "<init>", "(ZLjava/lang/String;ZILjava/util/EnumSet;Ljava/util/Map;ZLcom/facebook/internal/FacebookRequestErrorClassification;Ljava/lang/String;Ljava/lang/String;ZZLorg/json/JSONArray;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Lorg/json/JSONArray;Ljava/util/Map;Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)V", "x", "()Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Z", "b", "Ljava/lang/String;", "getNuxContent", "()Ljava/lang/String;", "c", "getNuxEnabled", "d", "I", "u", "()I", "e", "Ljava/util/EnumSet;", "getSmartLoginOptions", "()Ljava/util/EnumSet;", "f", "Ljava/util/Map;", "g", "()Ljava/util/Map;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lcom/facebook/internal/FacebookRequestErrorClassification;", "()Lcom/facebook/internal/FacebookRequestErrorClassification;", "i", "getSmartLoginBookmarkIconURL", "j", "getSmartLoginMenuIconURL", "k", CmcdData.Factory.STREAM_TYPE_LIVE, "m", "Lorg/json/JSONArray;", "()Lorg/json/JSONArray;", "n", CmcdData.Factory.STREAMING_FORMAT_SS, "o", "getTrackUninstallEnabled", "p", "getMonitorViaDialogEnabled", "q", "r", "v", "t", "getMigratedAutoLogValues", "w", "y", "z", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "Ljava/util/List;", "()Ljava/util/List;", "C", "D", ExifInterface.LONGITUDE_EAST, "F", "Ljava/lang/Long;", "()Ljava/lang/Long;", "G", "Companion", "DialogFeatureConfig", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class FetchedAppSettings {

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public final JSONArray bannedParams;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public final List<String> currencyDedupeParameters;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public final List<String> purchaseValueDedupeParameters;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public final List<Pair<String, List<String>>> prodDedupeParameters;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public final List<Pair<String, List<String>>> testDedupeParameters;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public final Long dedupeWindow;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean supportsImplicitLogging;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String nuxContent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean nuxEnabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int sessionTimeoutInSeconds;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final EnumSet<SmartLoginOption> smartLoginOptions;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Map<String, Map<String, DialogFeatureConfig>> dialogConfigurations;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final boolean automaticLoggingEnabled;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final FacebookRequestErrorClassification errorClassification;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String smartLoginBookmarkIconURL;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final String smartLoginMenuIconURL;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final boolean iAPAutomaticLoggingEnabled;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final boolean codelessEventsEnabled;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public final JSONArray eventBindings;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final String sdkUpdateMessage;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final boolean trackUninstallEnabled;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final boolean monitorViaDialogEnabled;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public final String rawAamRules;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public final String suggestedEventsSetting;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public final String restrictiveDataSetting;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public final JSONArray protectedModeStandardParamsSetting;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public final JSONArray MACARuleMatchingSetting;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public final Map<String, Boolean> migratedAutoLogValues;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public final JSONArray blocklistEvents;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public final JSONArray redactedEvents;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public final JSONArray sensitiveParams;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public final JSONArray schemaRestrictions;

    /* JADX INFO: compiled from: FetchedAppSettings.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¨\u0006\t"}, m90084d2 = {"Lcom/facebook/internal/FetchedAppSettings$Companion;", "", "()V", "getDialogFeatureConfig", "Lcom/facebook/internal/FetchedAppSettings$DialogFeatureConfig;", "applicationId", "", "actionName", "featureName", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @Nullable
        public final DialogFeatureConfig getDialogFeatureConfig(@NotNull String applicationId, @NotNull String actionName, @NotNull String featureName) {
            Map<String, Map<String, DialogFeatureConfig>> mapM9950g;
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(actionName, "actionName");
            Intrinsics.checkNotNullParameter(featureName, "featureName");
            if (actionName.length() == 0 || featureName.length() == 0) {
                return null;
            }
            FetchedAppSettings fetchedAppSettingsM9975f = FetchedAppSettingsManager.m9975f(applicationId);
            Map<String, DialogFeatureConfig> map = (fetchedAppSettingsM9975f == null || (mapM9950g = fetchedAppSettingsM9975f.m9950g()) == null) ? null : mapM9950g.get(actionName);
            if (map != null) {
                return map.get(featureName);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: FetchedAppSettings.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0012\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\f\u001a\u0004\b\u000e\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m90084d2 = {"Lcom/facebook/internal/FetchedAppSettings$DialogFeatureConfig;", "", "", "dialogName", "featureName", "Landroid/net/Uri;", "fallbackUrl", "", "versionSpec", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;[I)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "()Ljava/lang/String;", "b", "c", "Landroid/net/Uri;", "getFallbackUrl", "()Landroid/net/Uri;", "d", "[I", "getVersionSpec", "()[I", "e", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class DialogFeatureConfig {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String dialogName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String featureName;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final Uri fallbackUrl;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public final int[] versionSpec;

        /* JADX INFO: compiled from: FetchedAppSettings.kt */
        @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010¨\u0006\u0014"}, m90084d2 = {"Lcom/facebook/internal/FetchedAppSettings$DialogFeatureConfig$Companion;", "", "<init>", "()V", "Lorg/json/JSONObject;", "dialogConfigJSON", "Lcom/facebook/internal/FetchedAppSettings$DialogFeatureConfig;", "parseDialogConfig", "(Lorg/json/JSONObject;)Lcom/facebook/internal/FetchedAppSettings$DialogFeatureConfig;", "Lorg/json/JSONArray;", "versionsJSON", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lorg/json/JSONArray;)[I", "", "DIALOG_CONFIG_DIALOG_NAME_FEATURE_NAME_SEPARATOR", "Ljava/lang/String;", "DIALOG_CONFIG_NAME_KEY", "DIALOG_CONFIG_URL_KEY", "DIALOG_CONFIG_VERSIONS_KEY", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }

            /* JADX INFO: renamed from: a */
            public final int[] m9970a(JSONArray versionsJSON) {
                if (versionsJSON == null) {
                    return null;
                }
                int length = versionsJSON.length();
                int[] iArr = new int[length];
                for (int i11 = 0; i11 < length; i11++) {
                    int i12 = -1;
                    int iOptInt = versionsJSON.optInt(i11, -1);
                    if (iOptInt == -1) {
                        String versionString = versionsJSON.optString(i11);
                        if (!C5760c.m10057Z(versionString)) {
                            try {
                                Intrinsics.checkNotNullExpressionValue(versionString, "versionString");
                                i12 = Integer.parseInt(versionString);
                            } catch (NumberFormatException e11) {
                                C5760c.m10063d0("FacebookSDK", e11);
                            }
                            iOptInt = i12;
                        }
                    }
                    iArr[i11] = iOptInt;
                }
                return iArr;
            }

            @Nullable
            public final DialogFeatureConfig parseDialogConfig(@NotNull JSONObject dialogConfigJSON) {
                Intrinsics.checkNotNullParameter(dialogConfigJSON, "dialogConfigJSON");
                String dialogNameWithFeature = dialogConfigJSON.optString("name");
                if (C5760c.m10057Z(dialogNameWithFeature)) {
                    return null;
                }
                Intrinsics.checkNotNullExpressionValue(dialogNameWithFeature, "dialogNameWithFeature");
                List listSplit$default = StringsKt.split$default((CharSequence) dialogNameWithFeature, new String[]{"|"}, false, 0, 6, (Object) null);
                if (listSplit$default.size() != 2) {
                    return null;
                }
                String str = (String) CollectionsKt.first(listSplit$default);
                String str2 = (String) CollectionsKt.last(listSplit$default);
                if (C5760c.m10057Z(str) || C5760c.m10057Z(str2)) {
                    return null;
                }
                String strOptString = dialogConfigJSON.optString("url");
                return new DialogFeatureConfig(str, str2, C5760c.m10057Z(strOptString) ? null : Uri.parse(strOptString), m9970a(dialogConfigJSON.optJSONArray("versions")), null);
            }
        }

        public /* synthetic */ DialogFeatureConfig(String str, String str2, Uri uri, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, uri, iArr);
        }

        public DialogFeatureConfig(String str, String str2, Uri uri, int[] iArr) {
            this.dialogName = str;
            this.featureName = str2;
            this.fallbackUrl = uri;
            this.versionSpec = iArr;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDialogName() {
            return this.dialogName;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFeatureName() {
            return this.featureName;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FetchedAppSettings(boolean z11, @NotNull String nuxContent, boolean z12, int i11, @NotNull EnumSet<SmartLoginOption> smartLoginOptions, @NotNull Map<String, ? extends Map<String, DialogFeatureConfig>> dialogConfigurations, boolean z13, @NotNull FacebookRequestErrorClassification errorClassification, @NotNull String smartLoginBookmarkIconURL, @NotNull String smartLoginMenuIconURL, boolean z14, boolean z15, @Nullable JSONArray jSONArray, @NotNull String sdkUpdateMessage, boolean z16, boolean z17, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable JSONArray jSONArray2, @Nullable JSONArray jSONArray3, @Nullable Map<String, Boolean> map, @Nullable JSONArray jSONArray4, @Nullable JSONArray jSONArray5, @Nullable JSONArray jSONArray6, @Nullable JSONArray jSONArray7, @Nullable JSONArray jSONArray8, @Nullable List<String> list, @Nullable List<String> list2, @Nullable List<? extends Pair<String, ? extends List<String>>> list3, @Nullable List<? extends Pair<String, ? extends List<String>>> list4, @Nullable Long l11) {
        Intrinsics.checkNotNullParameter(nuxContent, "nuxContent");
        Intrinsics.checkNotNullParameter(smartLoginOptions, "smartLoginOptions");
        Intrinsics.checkNotNullParameter(dialogConfigurations, "dialogConfigurations");
        Intrinsics.checkNotNullParameter(errorClassification, "errorClassification");
        Intrinsics.checkNotNullParameter(smartLoginBookmarkIconURL, "smartLoginBookmarkIconURL");
        Intrinsics.checkNotNullParameter(smartLoginMenuIconURL, "smartLoginMenuIconURL");
        Intrinsics.checkNotNullParameter(sdkUpdateMessage, "sdkUpdateMessage");
        this.supportsImplicitLogging = z11;
        this.nuxContent = nuxContent;
        this.nuxEnabled = z12;
        this.sessionTimeoutInSeconds = i11;
        this.smartLoginOptions = smartLoginOptions;
        this.dialogConfigurations = dialogConfigurations;
        this.automaticLoggingEnabled = z13;
        this.errorClassification = errorClassification;
        this.smartLoginBookmarkIconURL = smartLoginBookmarkIconURL;
        this.smartLoginMenuIconURL = smartLoginMenuIconURL;
        this.iAPAutomaticLoggingEnabled = z14;
        this.codelessEventsEnabled = z15;
        this.eventBindings = jSONArray;
        this.sdkUpdateMessage = sdkUpdateMessage;
        this.trackUninstallEnabled = z16;
        this.monitorViaDialogEnabled = z17;
        this.rawAamRules = str;
        this.suggestedEventsSetting = str2;
        this.restrictiveDataSetting = str3;
        this.protectedModeStandardParamsSetting = jSONArray2;
        this.MACARuleMatchingSetting = jSONArray3;
        this.migratedAutoLogValues = map;
        this.blocklistEvents = jSONArray4;
        this.redactedEvents = jSONArray5;
        this.sensitiveParams = jSONArray6;
        this.schemaRestrictions = jSONArray7;
        this.bannedParams = jSONArray8;
        this.currencyDedupeParameters = list;
        this.purchaseValueDedupeParameters = list2;
        this.prodDedupeParameters = list3;
        this.testDedupeParameters = list4;
        this.dedupeWindow = l11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAutomaticLoggingEnabled() {
        return this.automaticLoggingEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final JSONArray getBannedParams() {
        return this.bannedParams;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final JSONArray getBlocklistEvents() {
        return this.blocklistEvents;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getCodelessEventsEnabled() {
        return this.codelessEventsEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final List<String> m9948e() {
        return this.currencyDedupeParameters;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getDedupeWindow() {
        return this.dedupeWindow;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final Map<String, Map<String, DialogFeatureConfig>> m9950g() {
        return this.dialogConfigurations;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final FacebookRequestErrorClassification getErrorClassification() {
        return this.errorClassification;
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final JSONArray getEventBindings() {
        return this.eventBindings;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIAPAutomaticLoggingEnabled() {
        return this.iAPAutomaticLoggingEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final JSONArray getMACARuleMatchingSetting() {
        return this.MACARuleMatchingSetting;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final List<Pair<String, List<String>>> m9955l() {
        return this.prodDedupeParameters;
    }

    @Nullable
    /* JADX INFO: renamed from: m, reason: from getter */
    public final JSONArray getProtectedModeStandardParamsSetting() {
        return this.protectedModeStandardParamsSetting;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final List<String> m9957n() {
        return this.purchaseValueDedupeParameters;
    }

    @Nullable
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getRawAamRules() {
        return this.rawAamRules;
    }

    @Nullable
    /* JADX INFO: renamed from: p, reason: from getter */
    public final JSONArray getRedactedEvents() {
        return this.redactedEvents;
    }

    @Nullable
    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getRestrictiveDataSetting() {
        return this.restrictiveDataSetting;
    }

    @Nullable
    /* JADX INFO: renamed from: r, reason: from getter */
    public final JSONArray getSchemaRestrictions() {
        return this.schemaRestrictions;
    }

    @NotNull
    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getSdkUpdateMessage() {
        return this.sdkUpdateMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: t, reason: from getter */
    public final JSONArray getSensitiveParams() {
        return this.sensitiveParams;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final int getSessionTimeoutInSeconds() {
        return this.sessionTimeoutInSeconds;
    }

    @Nullable
    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getSuggestedEventsSetting() {
        return this.suggestedEventsSetting;
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public final List<Pair<String, List<String>>> m9966w() {
        return this.testDedupeParameters;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getSupportsImplicitLogging() {
        return this.supportsImplicitLogging;
    }
}
