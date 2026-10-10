package com.jumio.core.models;

import com.jumio.commons.PersistWith;
import com.jumio.core.constants.ConstantsKt;
import com.jumio.core.model.StaticModel;
import com.jumio.core.models.SettingsModel;
import com.jumio.core.util.JsonUtilKt;
import com.tencent.bugly.proguard.C33556b3;
import java.util.Date;
import java.util.List;
import jumio.core.AbstractC40511C;
import jumio.core.AbstractC40565M3;
import jumio.core.AbstractC40637b0;
import jumio.core.AbstractC40653e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\b<\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 `2\u00020\u0001:\u0001`B\u009b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0 \u0012\b\b\u0002\u0010!\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\bHÆ\u0003J\t\u0010C\u001a\u00020\bHÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\t\u0010G\u001a\u00020\u000eHÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\t\u0010K\u001a\u00020\u0005HÆ\u0003J\t\u0010L\u001a\u00020\u000eHÆ\u0003J\t\u0010M\u001a\u00020\u000eHÆ\u0003J\t\u0010N\u001a\u00020\bHÆ\u0003J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\t\u0010Q\u001a\u00020\u0005HÆ\u0003J\t\u0010R\u001a\u00020\u000eHÆ\u0003J\t\u0010S\u001a\u00020\u000eHÆ\u0003J\t\u0010T\u001a\u00020\u0005HÆ\u0003J\t\u0010U\u001a\u00020\u000eHÆ\u0003J\t\u0010V\u001a\u00020\u0005HÆ\u0003J\t\u0010W\u001a\u00020\u000eHÆ\u0003J\u000f\u0010X\u001a\b\u0012\u0004\u0012\u00020\b0 HÆ\u0003J\t\u0010Y\u001a\u00020\bHÆ\u0003J\u009d\u0002\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u000e2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0 2\b\b\u0002\u0010!\u001a\u00020\bHÆ\u0001J\u0013\u0010[\u001a\u00020\u00052\b\u0010\\\u001a\u0004\u0018\u00010]HÖ\u0003J\t\u0010^\u001a\u00020\u000eHÖ\u0001J\t\u0010_\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010&R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010&R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010&R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010&R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010&R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010&R\u0011\u0010\u0013\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b0\u0010,R\u0011\u0010\u0014\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b1\u0010,R\u0011\u0010\u0015\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b2\u0010)R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010&R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010&R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010&R\u0011\u0010\u0019\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b6\u0010,R\u0011\u0010\u001a\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b7\u0010,R\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u0010&R\u0011\u0010\u001c\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b9\u0010,R\u0011\u0010\u001d\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010&R\u0011\u0010\u001e\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b;\u0010,R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0 ¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010!\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b>\u0010)¨\u0006a"}, m90084d2 = {"Lcom/jumio/core/models/SettingsModel;", "Lcom/jumio/core/model/StaticModel;", "serverTimestamp", "", "isBrandingEnabled", "", "returnImages", "countryForIp", "", "stateForIp", "isAdditionalDataPointsEnabled", "isLoaded", "isAnalyticsEnabled", "maxLivenessImages", "", "useCamera1", "cameraConnection", "keyPinningEnabled", "isInstantFeedbackEnabled", "automationMaxRetries", "maxFileUploadSize", "workflowDefinitionKey", "automaticBarcodeExtraction", "skipDocTypeSelection", "docClassifierOverride", "throttlingLimit", "imageCompressionQuality", "skipStartScreen", "startMaxLoadingTime", "sensorDataCollectionEnabled", "sensorSamplingTime", "docProofAcquireModes", "", "faceCaptureMode", "<init>", "(JZZLjava/lang/String;Ljava/lang/String;ZZZIZZZZIILjava/lang/String;ZZZIIZIZILjava/util/List;Ljava/lang/String;)V", "getServerTimestamp", "()J", "()Z", "getReturnImages", "getCountryForIp", "()Ljava/lang/String;", "getStateForIp", "getMaxLivenessImages", "()I", "getUseCamera1", "getCameraConnection", "getKeyPinningEnabled", "getAutomationMaxRetries", "getMaxFileUploadSize", "getWorkflowDefinitionKey", "getAutomaticBarcodeExtraction", "getSkipDocTypeSelection", "getDocClassifierOverride", "getThrottlingLimit", "getImageCompressionQuality", "getSkipStartScreen", "getStartMaxLoadingTime", "getSensorDataCollectionEnabled", "getSensorSamplingTime", "getDocProofAcquireModes", "()Ljava/util/List;", "getFaceCaptureMode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "copy", "equals", "other", "", "hashCode", "toString", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("SettingsModel")
public final /* data */ class SettingsModel implements StaticModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A */
    public final String f14324A;

    /* JADX INFO: renamed from: a */
    public final long f14325a;

    /* JADX INFO: renamed from: b */
    public final boolean f14326b;

    /* JADX INFO: renamed from: c */
    public final boolean f14327c;

    /* JADX INFO: renamed from: d */
    public final String f14328d;

    /* JADX INFO: renamed from: e */
    public final String f14329e;

    /* JADX INFO: renamed from: f */
    public final boolean f14330f;

    /* JADX INFO: renamed from: g */
    public final boolean f14331g;

    /* JADX INFO: renamed from: h */
    public final boolean f14332h;

    /* JADX INFO: renamed from: i */
    public final int f14333i;

    /* JADX INFO: renamed from: j */
    public final boolean f14334j;

    /* JADX INFO: renamed from: k */
    public final boolean f14335k;

    /* JADX INFO: renamed from: l */
    public final boolean f14336l;

    /* JADX INFO: renamed from: m */
    public final boolean f14337m;

    /* JADX INFO: renamed from: n */
    public final int f14338n;

    /* JADX INFO: renamed from: o */
    public final int f14339o;

    /* JADX INFO: renamed from: p */
    public final String f14340p;

    /* JADX INFO: renamed from: q */
    public final boolean f14341q;

    /* JADX INFO: renamed from: r */
    public final boolean f14342r;

    /* JADX INFO: renamed from: s */
    public final boolean f14343s;

    /* JADX INFO: renamed from: t */
    public final int f14344t;

    /* JADX INFO: renamed from: u */
    public final int f14345u;

    /* JADX INFO: renamed from: v */
    public final boolean f14346v;

    /* JADX INFO: renamed from: w */
    public final int f14347w;

    /* JADX INFO: renamed from: x */
    public final boolean f14348x;

    /* JADX INFO: renamed from: y */
    public final int f14349y;

    /* JADX INFO: renamed from: z */
    public final List f14350z;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/models/SettingsModel$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/models/SettingsModel;", "jsonObject", "Lorg/json/JSONObject;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSettingsModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsModel.kt\ncom/jumio/core/models/SettingsModel$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static final String m14567a(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0118  */
        @NotNull
        public final SettingsModel fromJson(@NotNull JSONObject jsonObject) throws JSONException {
            List map;
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("configurations");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            JSONObject jSONObject = jSONObjectOptJSONObject;
            Date dateOptDate$default = JsonUtilKt.optDate$default(jsonObject, "timestamp", "yyyy-MM-dd'T'HH:mm:ss.S'Z'", null, null, null, 28, null);
            long time = dateOptDate$default != null ? dateOptDate$default.getTime() : 0L;
            JSONObject jSONObjectOptJSONObject2 = jsonObject.optJSONObject("merchantSettings");
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
            }
            boolean zOptBoolean = jSONObjectOptJSONObject2.optBoolean("brandingEnabled", true);
            boolean zOptBoolean2 = jSONObjectOptJSONObject2.optBoolean("returnImages", false);
            String strOptString = jsonObject.optString("countryForIp", "");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            String strOptString2 = jsonObject.optString("stateForIp", "");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
            boolean zOptBoolean3 = jSONObjectOptJSONObject2.optBoolean("analyticsEnabled", false);
            boolean zOptBoolean4 = jSONObjectOptJSONObject2.optBoolean("additionalDataPoints", false);
            int iCoerceIn = RangesKt.coerceIn(jsonObject.optInt("maxLivenessImages", 10), 0, 10);
            int iOptInt = jsonObject.optInt("maxFileUploadSize", 3145728);
            boolean zOptBoolean5 = jsonObject.optBoolean("keyPinning", true);
            String strOptString3 = jsonObject.optString("workflowDefinitionKey", "");
            Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(...)");
            boolean zOptBoolean6 = jSONObjectOptJSONObject2.optBoolean("skipDocTypeSelection", false);
            boolean zOptBoolean7 = jSONObjectOptJSONObject2.optBoolean("docClassifierOverride", false);
            int iOptInt2 = jsonObject.optInt("networkThrottlingLimit", 300);
            boolean zOptBoolean8 = jSONObject.optBoolean("instantFeedback", false);
            int iOptInt3 = jSONObject.optInt("maxRetries", 0);
            boolean zOptBoolean9 = jSONObjectOptJSONObject2.optBoolean("automaticBarcodeExtraction", true);
            boolean zOptBoolean10 = jSONObject.optBoolean("useCamera1", false);
            boolean zOptBoolean11 = jSONObject.optBoolean("collectCameraStackTrace", false);
            double dOptDouble = jSONObject.optDouble("imageCompressionQuality", 0.9d);
            List list = AbstractC40565M3.f90054a;
            int i11 = (int) (dOptDouble * ((double) 100));
            boolean zOptBoolean12 = jSONObjectOptJSONObject2.optBoolean("skipStartScreen", false);
            int iOptInt4 = jsonObject.optInt("startMaxLoadingTime", 5000);
            boolean zOptBoolean13 = jSONObjectOptJSONObject2.optBoolean("sensorDataCollectionEnabled", false);
            String strOptString4 = jSONObject.optString("sensorSamplingTime", C33556b3.f68995S);
            Intrinsics.checkNotNullExpressionValue(strOptString4, "optString(...)");
            int i12 = Integer.parseInt(strOptString4);
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("docProofAcquireModes");
            if (jSONArrayOptJSONArray == null || (map = JsonUtilKt.map(jSONArrayOptJSONArray, new Function1() { // from class: r9.j
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SettingsModel.Companion.m14567a((String) obj);
                }
            })) == null) {
                map = AbstractC40565M3.f90054a;
            } else {
                if (map.isEmpty()) {
                    map = null;
                }
                if (map == null) {
                    map = AbstractC40565M3.f90054a;
                }
            }
            List list2 = map;
            String strOptString5 = jSONObjectOptJSONObject2.optString("faceCaptureMode", ConstantsKt.FACE_CAPTURE_MODE_FRONT);
            Intrinsics.checkNotNullExpressionValue(strOptString5, "optString(...)");
            return new SettingsModel(time, zOptBoolean, zOptBoolean2, strOptString, strOptString2, zOptBoolean4, true, zOptBoolean3, iCoerceIn, zOptBoolean10, zOptBoolean11, zOptBoolean5, zOptBoolean8, iOptInt3, iOptInt, strOptString3, zOptBoolean9, zOptBoolean6, zOptBoolean7, iOptInt2, i11, zOptBoolean12, iOptInt4, zOptBoolean13, i12, list2, strOptString5);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public SettingsModel() {
        this(0L, false, false, null, null, false, false, false, 0, false, false, false, false, 0, 0, null, false, false, false, 0, 0, false, 0, false, 0, null, null, 134217727, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SettingsModel copy$default(SettingsModel settingsModel, long j11, boolean z11, boolean z12, String str, String str2, boolean z13, boolean z14, boolean z15, int i11, boolean z16, boolean z17, boolean z18, boolean z19, int i12, int i13, String str3, boolean z21, boolean z22, boolean z23, int i14, int i15, boolean z24, int i16, boolean z25, int i17, List list, String str4, int i18, Object obj) {
        String str5;
        List list2;
        long j12 = (i18 & 1) != 0 ? settingsModel.f14325a : j11;
        boolean z26 = (i18 & 2) != 0 ? settingsModel.f14326b : z11;
        boolean z27 = (i18 & 4) != 0 ? settingsModel.f14327c : z12;
        String str6 = (i18 & 8) != 0 ? settingsModel.f14328d : str;
        String str7 = (i18 & 16) != 0 ? settingsModel.f14329e : str2;
        boolean z28 = (i18 & 32) != 0 ? settingsModel.f14330f : z13;
        boolean z29 = (i18 & 64) != 0 ? settingsModel.f14331g : z14;
        boolean z31 = (i18 & 128) != 0 ? settingsModel.f14332h : z15;
        int i19 = (i18 & 256) != 0 ? settingsModel.f14333i : i11;
        boolean z32 = (i18 & 512) != 0 ? settingsModel.f14334j : z16;
        boolean z33 = (i18 & 1024) != 0 ? settingsModel.f14335k : z17;
        boolean z34 = (i18 & 2048) != 0 ? settingsModel.f14336l : z18;
        boolean z35 = (i18 & 4096) != 0 ? settingsModel.f14337m : z19;
        long j13 = j12;
        int i21 = (i18 & 8192) != 0 ? settingsModel.f14338n : i12;
        int i22 = (i18 & 16384) != 0 ? settingsModel.f14339o : i13;
        String str8 = (i18 & 32768) != 0 ? settingsModel.f14340p : str3;
        boolean z36 = (i18 & 65536) != 0 ? settingsModel.f14341q : z21;
        boolean z37 = (i18 & 131072) != 0 ? settingsModel.f14342r : z22;
        boolean z38 = (i18 & 262144) != 0 ? settingsModel.f14343s : z23;
        int i23 = (i18 & 524288) != 0 ? settingsModel.f14344t : i14;
        int i24 = (i18 & 1048576) != 0 ? settingsModel.f14345u : i15;
        boolean z39 = (i18 & 2097152) != 0 ? settingsModel.f14346v : z24;
        int i25 = (i18 & 4194304) != 0 ? settingsModel.f14347w : i16;
        boolean z41 = (i18 & 8388608) != 0 ? settingsModel.f14348x : z25;
        int i26 = (i18 & 16777216) != 0 ? settingsModel.f14349y : i17;
        List list3 = (i18 & 33554432) != 0 ? settingsModel.f14350z : list;
        if ((i18 & 67108864) != 0) {
            list2 = list3;
            str5 = settingsModel.f14324A;
        } else {
            str5 = str4;
            list2 = list3;
        }
        return settingsModel.copy(j13, z26, z27, str6, str7, z28, z29, z31, i19, z32, z33, z34, z35, i21, i22, str8, z36, z37, z38, i23, i24, z39, i25, z41, i26, list2, str5);
    }

    @NotNull
    public final SettingsModel copy(long serverTimestamp, boolean isBrandingEnabled, boolean returnImages, @NotNull String countryForIp, @NotNull String stateForIp, boolean isAdditionalDataPointsEnabled, boolean isLoaded, boolean isAnalyticsEnabled, int maxLivenessImages, boolean useCamera1, boolean cameraConnection, boolean keyPinningEnabled, boolean isInstantFeedbackEnabled, int automationMaxRetries, int maxFileUploadSize, @NotNull String workflowDefinitionKey, boolean automaticBarcodeExtraction, boolean skipDocTypeSelection, boolean docClassifierOverride, int throttlingLimit, int imageCompressionQuality, boolean skipStartScreen, int startMaxLoadingTime, boolean sensorDataCollectionEnabled, int sensorSamplingTime, @NotNull List<String> docProofAcquireModes, @NotNull String faceCaptureMode) {
        Intrinsics.checkNotNullParameter(countryForIp, "countryForIp");
        Intrinsics.checkNotNullParameter(stateForIp, "stateForIp");
        Intrinsics.checkNotNullParameter(workflowDefinitionKey, "workflowDefinitionKey");
        Intrinsics.checkNotNullParameter(docProofAcquireModes, "docProofAcquireModes");
        Intrinsics.checkNotNullParameter(faceCaptureMode, "faceCaptureMode");
        return new SettingsModel(serverTimestamp, isBrandingEnabled, returnImages, countryForIp, stateForIp, isAdditionalDataPointsEnabled, isLoaded, isAnalyticsEnabled, maxLivenessImages, useCamera1, cameraConnection, keyPinningEnabled, isInstantFeedbackEnabled, automationMaxRetries, maxFileUploadSize, workflowDefinitionKey, automaticBarcodeExtraction, skipDocTypeSelection, docClassifierOverride, throttlingLimit, imageCompressionQuality, skipStartScreen, startMaxLoadingTime, sensorDataCollectionEnabled, sensorSamplingTime, docProofAcquireModes, faceCaptureMode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingsModel)) {
            return false;
        }
        SettingsModel settingsModel = (SettingsModel) other;
        return this.f14325a == settingsModel.f14325a && this.f14326b == settingsModel.f14326b && this.f14327c == settingsModel.f14327c && Intrinsics.areEqual(this.f14328d, settingsModel.f14328d) && Intrinsics.areEqual(this.f14329e, settingsModel.f14329e) && this.f14330f == settingsModel.f14330f && this.f14331g == settingsModel.f14331g && this.f14332h == settingsModel.f14332h && this.f14333i == settingsModel.f14333i && this.f14334j == settingsModel.f14334j && this.f14335k == settingsModel.f14335k && this.f14336l == settingsModel.f14336l && this.f14337m == settingsModel.f14337m && this.f14338n == settingsModel.f14338n && this.f14339o == settingsModel.f14339o && Intrinsics.areEqual(this.f14340p, settingsModel.f14340p) && this.f14341q == settingsModel.f14341q && this.f14342r == settingsModel.f14342r && this.f14343s == settingsModel.f14343s && this.f14344t == settingsModel.f14344t && this.f14345u == settingsModel.f14345u && this.f14346v == settingsModel.f14346v && this.f14347w == settingsModel.f14347w && this.f14348x == settingsModel.f14348x && this.f14349y == settingsModel.f14349y && Intrinsics.areEqual(this.f14350z, settingsModel.f14350z) && Intrinsics.areEqual(this.f14324A, settingsModel.f14324A);
    }

    public SettingsModel(long j11, boolean z11, boolean z12, @NotNull String countryForIp, @NotNull String stateForIp, boolean z13, boolean z14, boolean z15, int i11, boolean z16, boolean z17, boolean z18, boolean z19, int i12, int i13, @NotNull String workflowDefinitionKey, boolean z21, boolean z22, boolean z23, int i14, int i15, boolean z24, int i16, boolean z25, int i17, @NotNull List<String> docProofAcquireModes, @NotNull String faceCaptureMode) {
        Intrinsics.checkNotNullParameter(countryForIp, "countryForIp");
        Intrinsics.checkNotNullParameter(stateForIp, "stateForIp");
        Intrinsics.checkNotNullParameter(workflowDefinitionKey, "workflowDefinitionKey");
        Intrinsics.checkNotNullParameter(docProofAcquireModes, "docProofAcquireModes");
        Intrinsics.checkNotNullParameter(faceCaptureMode, "faceCaptureMode");
        this.f14325a = j11;
        this.f14326b = z11;
        this.f14327c = z12;
        this.f14328d = countryForIp;
        this.f14329e = stateForIp;
        this.f14330f = z13;
        this.f14331g = z14;
        this.f14332h = z15;
        this.f14333i = i11;
        this.f14334j = z16;
        this.f14335k = z17;
        this.f14336l = z18;
        this.f14337m = z19;
        this.f14338n = i12;
        this.f14339o = i13;
        this.f14340p = workflowDefinitionKey;
        this.f14341q = z21;
        this.f14342r = z22;
        this.f14343s = z23;
        this.f14344t = i14;
        this.f14345u = i15;
        this.f14346v = z24;
        this.f14347w = i16;
        this.f14348x = z25;
        this.f14349y = i17;
        this.f14350z = docProofAcquireModes;
        this.f14324A = faceCaptureMode;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getF14325a() {
        return this.f14325a;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getF14334j() {
        return this.f14334j;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getF14335k() {
        return this.f14335k;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getF14336l() {
        return this.f14336l;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getF14337m() {
        return this.f14337m;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getF14338n() {
        return this.f14338n;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getF14339o() {
        return this.f14339o;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getF14340p() {
        return this.f14340p;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getF14341q() {
        return this.f14341q;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getF14342r() {
        return this.f14342r;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getF14343s() {
        return this.f14343s;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getF14326b() {
        return this.f14326b;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getF14344t() {
        return this.f14344t;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getF14345u() {
        return this.f14345u;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final boolean getF14346v() {
        return this.f14346v;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final int getF14347w() {
        return this.f14347w;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final boolean getF14348x() {
        return this.f14348x;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final int getF14349y() {
        return this.f14349y;
    }

    @NotNull
    public final List<String> component26() {
        return this.f14350z;
    }

    @NotNull
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getF14324A() {
        return this.f14324A;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getF14327c() {
        return this.f14327c;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getF14328d() {
        return this.f14328d;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getF14329e() {
        return this.f14329e;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getF14330f() {
        return this.f14330f;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getF14331g() {
        return this.f14331g;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getF14332h() {
        return this.f14332h;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getF14333i() {
        return this.f14333i;
    }

    public final boolean getAutomaticBarcodeExtraction() {
        return this.f14341q;
    }

    public final int getAutomationMaxRetries() {
        return this.f14338n;
    }

    public final boolean getCameraConnection() {
        return this.f14335k;
    }

    @NotNull
    public final String getCountryForIp() {
        return this.f14328d;
    }

    public final boolean getDocClassifierOverride() {
        return this.f14343s;
    }

    @NotNull
    public final List<String> getDocProofAcquireModes() {
        return this.f14350z;
    }

    @NotNull
    public final String getFaceCaptureMode() {
        return this.f14324A;
    }

    public final int getImageCompressionQuality() {
        return this.f14345u;
    }

    public final boolean getKeyPinningEnabled() {
        return this.f14336l;
    }

    public final int getMaxFileUploadSize() {
        return this.f14339o;
    }

    public final int getMaxLivenessImages() {
        return this.f14333i;
    }

    public final boolean getReturnImages() {
        return this.f14327c;
    }

    public final boolean getSensorDataCollectionEnabled() {
        return this.f14348x;
    }

    public final int getSensorSamplingTime() {
        return this.f14349y;
    }

    public final long getServerTimestamp() {
        return this.f14325a;
    }

    public final boolean getSkipDocTypeSelection() {
        return this.f14342r;
    }

    public final boolean getSkipStartScreen() {
        return this.f14346v;
    }

    public final int getStartMaxLoadingTime() {
        return this.f14347w;
    }

    @NotNull
    public final String getStateForIp() {
        return this.f14329e;
    }

    public final int getThrottlingLimit() {
        return this.f14344t;
    }

    public final boolean getUseCamera1() {
        return this.f14334j;
    }

    @NotNull
    public final String getWorkflowDefinitionKey() {
        return this.f14340p;
    }

    public int hashCode() {
        return this.f14324A.hashCode() + ((this.f14350z.hashCode() + AbstractC40653e0.m89252a(this.f14349y, AbstractC40637b0.m89251a(this.f14348x, AbstractC40653e0.m89252a(this.f14347w, AbstractC40637b0.m89251a(this.f14346v, AbstractC40653e0.m89252a(this.f14345u, AbstractC40653e0.m89252a(this.f14344t, AbstractC40637b0.m89251a(this.f14343s, AbstractC40637b0.m89251a(this.f14342r, AbstractC40637b0.m89251a(this.f14341q, AbstractC40511C.m89148a(this.f14340p, AbstractC40653e0.m89252a(this.f14339o, AbstractC40653e0.m89252a(this.f14338n, AbstractC40637b0.m89251a(this.f14337m, AbstractC40637b0.m89251a(this.f14336l, AbstractC40637b0.m89251a(this.f14335k, AbstractC40637b0.m89251a(this.f14334j, AbstractC40653e0.m89252a(this.f14333i, AbstractC40637b0.m89251a(this.f14332h, AbstractC40637b0.m89251a(this.f14331g, AbstractC40637b0.m89251a(this.f14330f, AbstractC40511C.m89148a(this.f14329e, AbstractC40511C.m89148a(this.f14328d, AbstractC40637b0.m89251a(this.f14327c, AbstractC40637b0.m89251a(this.f14326b, Long.hashCode(this.f14325a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    public final boolean isAdditionalDataPointsEnabled() {
        return this.f14330f;
    }

    public final boolean isAnalyticsEnabled() {
        return this.f14332h;
    }

    public final boolean isBrandingEnabled() {
        return this.f14326b;
    }

    public final boolean isInstantFeedbackEnabled() {
        return this.f14337m;
    }

    public final boolean isLoaded() {
        return this.f14331g;
    }

    @NotNull
    public String toString() {
        return "SettingsModel(serverTimestamp=" + this.f14325a + ", isBrandingEnabled=" + this.f14326b + ", returnImages=" + this.f14327c + ", countryForIp=" + this.f14328d + ", stateForIp=" + this.f14329e + ", isAdditionalDataPointsEnabled=" + this.f14330f + ", isLoaded=" + this.f14331g + ", isAnalyticsEnabled=" + this.f14332h + ", maxLivenessImages=" + this.f14333i + ", useCamera1=" + this.f14334j + ", cameraConnection=" + this.f14335k + ", keyPinningEnabled=" + this.f14336l + ", isInstantFeedbackEnabled=" + this.f14337m + ", automationMaxRetries=" + this.f14338n + ", maxFileUploadSize=" + this.f14339o + ", workflowDefinitionKey=" + this.f14340p + ", automaticBarcodeExtraction=" + this.f14341q + ", skipDocTypeSelection=" + this.f14342r + ", docClassifierOverride=" + this.f14343s + ", throttlingLimit=" + this.f14344t + ", imageCompressionQuality=" + this.f14345u + ", skipStartScreen=" + this.f14346v + ", startMaxLoadingTime=" + this.f14347w + ", sensorDataCollectionEnabled=" + this.f14348x + ", sensorSamplingTime=" + this.f14349y + ", docProofAcquireModes=" + this.f14350z + ", faceCaptureMode=" + this.f14324A + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SettingsModel(long j11, boolean z11, boolean z12, String str, String str2, boolean z13, boolean z14, boolean z15, int i11, boolean z16, boolean z17, boolean z18, boolean z19, int i12, int i13, String str3, boolean z21, boolean z22, boolean z23, int i14, int i15, boolean z24, int i16, boolean z25, int i17, List list, String str4, int i18, DefaultConstructorMarker defaultConstructorMarker) {
        int i19;
        long j12 = (i18 & 1) != 0 ? 0L : j11;
        boolean z26 = (i18 & 2) != 0 ? true : z11;
        boolean z27 = (i18 & 4) != 0 ? false : z12;
        String str5 = (i18 & 8) != 0 ? "" : str;
        String str6 = (i18 & 16) != 0 ? "" : str2;
        boolean z28 = (i18 & 32) != 0 ? false : z13;
        boolean z29 = (i18 & 64) != 0 ? false : z14;
        boolean z31 = (i18 & 128) != 0 ? false : z15;
        int i21 = (i18 & 256) != 0 ? 10 : i11;
        boolean z32 = (i18 & 512) != 0 ? false : z16;
        boolean z33 = (i18 & 1024) != 0 ? false : z17;
        boolean z34 = (i18 & 2048) != 0 ? true : z18;
        boolean z35 = (i18 & 4096) != 0 ? false : z19;
        boolean z36 = z34;
        int i22 = (i18 & 8192) != 0 ? 0 : i12;
        int i23 = (i18 & 16384) != 0 ? 3145728 : i13;
        String str7 = (i18 & 32768) == 0 ? str3 : "";
        boolean z37 = (i18 & 65536) != 0 ? true : z21;
        boolean z38 = (i18 & 131072) != 0 ? false : z22;
        boolean z39 = (i18 & 262144) != 0 ? false : z23;
        int i24 = (i18 & 524288) != 0 ? 300 : i14;
        if ((i18 & 1048576) != 0) {
            List list2 = AbstractC40565M3.f90054a;
            i19 = (int) (((double) 100) * 0.9d);
        } else {
            i19 = i15;
        }
        this(j12, z26, z27, str5, str6, z28, z29, z31, i21, z32, z33, z36, z35, i22, i23, str7, z37, z38, z39, i24, i19, (i18 & 2097152) != 0 ? false : z24, (i18 & 4194304) != 0 ? 5000 : i16, (i18 & 8388608) != 0 ? false : z25, (i18 & 16777216) != 0 ? Integer.parseInt(C33556b3.f68995S) : i17, (i18 & 33554432) != 0 ? AbstractC40565M3.f90054a : list, (i18 & 67108864) != 0 ? ConstantsKt.FACE_CAPTURE_MODE_FRONT : str4);
    }
}
