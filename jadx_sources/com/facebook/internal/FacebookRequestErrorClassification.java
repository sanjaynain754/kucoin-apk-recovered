package com.facebook.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.FacebookRequestError;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: FacebookRequestErrorClassification.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0081\u0001\b\u0000\u0012\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0004\u0018\u00010\u0002\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0004\u0018\u00010\u0002\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R-\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR-\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR-\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001fR\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001f¨\u0006$"}, m90084d2 = {"Lcom/facebook/internal/FacebookRequestErrorClassification;", "", "", "", "", "otherErrors", "transientErrors", "loginRecoverableErrors", "", "otherRecoveryMessage", "transientRecoveryMessage", "loginRecoverableRecoveryMessage", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/facebook/FacebookRequestError$Category;", "category", "d", "(Lcom/facebook/FacebookRequestError$Category;)Ljava/lang/String;", "errorCode", "errorSubCode", "", "isTransient", "c", "(IIZ)Lcom/facebook/FacebookRequestError$Category;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/Map;", "getOtherErrors", "()Ljava/util/Map;", "b", "getTransientErrors", "getLoginRecoverableErrors", "Ljava/lang/String;", "e", "f", "g", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class FacebookRequestErrorClassification {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h */
    @Nullable
    public static FacebookRequestErrorClassification f9556h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Map<Integer, Set<Integer>> otherErrors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final Map<Integer, Set<Integer>> transientErrors;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final Map<Integer, Set<Integer>> loginRecoverableErrors;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final String otherRecoveryMessage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final String transientRecoveryMessage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final String loginRecoverableRecoveryMessage;

    /* JADX INFO: compiled from: FacebookRequestErrorClassification.kt */
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\"\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\r\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0014\u0010\u001f\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R\u0014\u0010 \u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0017R\u0014\u0010\"\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010#R\u0014\u0010&\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010#R\u0014\u0010'\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, m90084d2 = {"Lcom/facebook/internal/FacebookRequestErrorClassification$Companion;", "", "<init>", "()V", "Lorg/json/JSONArray;", "jsonArray", "Lcom/facebook/internal/FacebookRequestErrorClassification;", "createFromJSON", "(Lorg/json/JSONArray;)Lcom/facebook/internal/FacebookRequestErrorClassification;", "Lorg/json/JSONObject;", "definition", "", "", "", "b", "(Lorg/json/JSONObject;)Ljava/util/Map;", "getDefaultErrorClassification", "()Lcom/facebook/internal/FacebookRequestErrorClassification;", "getDefaultErrorClassification$annotations", "defaultErrorClassification", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "defaultErrorClassificationImpl", "EC_APP_NOT_INSTALLED", "I", "EC_APP_TOO_MANY_CALLS", "EC_INVALID_SESSION", "EC_INVALID_TOKEN", "EC_RATE", "EC_SERVICE_UNAVAILABLE", "EC_TOO_MANY_USER_ACTION_CALLS", "EC_USER_TOO_MANY_CALLS", "ESC_APP_INACTIVE", "ESC_APP_NOT_INSTALLED", "", "KEY_LOGIN_RECOVERABLE", "Ljava/lang/String;", "KEY_NAME", "KEY_OTHER", "KEY_RECOVERY_MESSAGE", "KEY_TRANSIENT", "defaultInstance", "Lcom/facebook/internal/FacebookRequestErrorClassification;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final FacebookRequestErrorClassification m9934a() {
            return new FacebookRequestErrorClassification(null, MapsKt.hashMapOf(TuplesKt.m90091to(2, null), TuplesKt.m90091to(4, null), TuplesKt.m90091to(9, null), TuplesKt.m90091to(17, null), TuplesKt.m90091to(341, null)), MapsKt.hashMapOf(TuplesKt.m90091to(102, null), TuplesKt.m90091to(190, null), TuplesKt.m90091to(412, null)), null, null, null);
        }

        @JvmStatic
        @Nullable
        public final FacebookRequestErrorClassification createFromJSON(@Nullable JSONArray jsonArray) {
            String strOptString;
            if (jsonArray == null) {
                return null;
            }
            int length = jsonArray.length();
            Map<Integer, Set<Integer>> mapM9935b = null;
            Map<Integer, Set<Integer>> mapM9935b2 = null;
            Map<Integer, Set<Integer>> mapM9935b3 = null;
            String strOptString2 = null;
            String strOptString3 = null;
            String strOptString4 = null;
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObjectOptJSONObject = jsonArray.optJSONObject(i11);
                if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString("name")) != null) {
                    if (StringsKt.equals(strOptString, "other", true)) {
                        strOptString2 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapM9935b = m9935b(jSONObjectOptJSONObject);
                    } else if (StringsKt.equals(strOptString, "transient", true)) {
                        strOptString3 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapM9935b2 = m9935b(jSONObjectOptJSONObject);
                    } else if (StringsKt.equals(strOptString, "login_recoverable", true)) {
                        strOptString4 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapM9935b3 = m9935b(jSONObjectOptJSONObject);
                    }
                }
            }
            return new FacebookRequestErrorClassification(mapM9935b, mapM9935b2, mapM9935b3, strOptString2, strOptString3, strOptString4);
        }

        @NotNull
        public final synchronized FacebookRequestErrorClassification getDefaultErrorClassification() {
            FacebookRequestErrorClassification facebookRequestErrorClassification;
            try {
                if (FacebookRequestErrorClassification.f9556h == null) {
                    FacebookRequestErrorClassification.f9556h = m9934a();
                }
                facebookRequestErrorClassification = FacebookRequestErrorClassification.f9556h;
                Intrinsics.checkNotNull(facebookRequestErrorClassification, "null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
            } catch (Throwable th2) {
                throw th2;
            }
            return facebookRequestErrorClassification;
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: b */
        public final Map<Integer, Set<Integer>> m9935b(JSONObject definition) {
            int iOptInt;
            HashSet hashSet;
            JSONArray jSONArrayOptJSONArray = definition.optJSONArray(FirebaseAnalytics.Param.ITEMS);
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                return null;
            }
            HashMap map = new HashMap();
            int length = jSONArrayOptJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
                if (jSONObjectOptJSONObject != null && (iOptInt = jSONObjectOptJSONObject.optInt("code")) != 0) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("subcodes");
                    if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                        hashSet = null;
                    } else {
                        hashSet = new HashSet();
                        int length2 = jSONArrayOptJSONArray2.length();
                        for (int i12 = 0; i12 < length2; i12++) {
                            int iOptInt2 = jSONArrayOptJSONArray2.optInt(i12);
                            if (iOptInt2 != 0) {
                                hashSet.add(Integer.valueOf(iOptInt2));
                            }
                        }
                    }
                    map.put(Integer.valueOf(iOptInt), hashSet);
                }
            }
            return map;
        }

        @JvmStatic
        public static /* synthetic */ void getDefaultErrorClassification$annotations() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.FacebookRequestErrorClassification$a */
    /* JADX INFO: compiled from: FacebookRequestErrorClassification.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public /* synthetic */ class C5747a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FacebookRequestError.Category.values().length];
            try {
                iArr[FacebookRequestError.Category.OTHER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FacebookRequestError.Category.LOGIN_RECOVERABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FacebookRequestError.Category.TRANSIENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final FacebookRequestError.Category m9932c(int errorCode, int errorSubCode, boolean isTransient) {
        Set<Integer> set;
        Set<Integer> set2;
        Set<Integer> set3;
        if (isTransient) {
            return FacebookRequestError.Category.TRANSIENT;
        }
        Map<Integer, Set<Integer>> map = this.otherErrors;
        if (map != null && map.containsKey(Integer.valueOf(errorCode)) && ((set3 = this.otherErrors.get(Integer.valueOf(errorCode))) == null || set3.contains(Integer.valueOf(errorSubCode)))) {
            return FacebookRequestError.Category.OTHER;
        }
        Map<Integer, Set<Integer>> map2 = this.loginRecoverableErrors;
        if (map2 != null && map2.containsKey(Integer.valueOf(errorCode)) && ((set2 = this.loginRecoverableErrors.get(Integer.valueOf(errorCode))) == null || set2.contains(Integer.valueOf(errorSubCode)))) {
            return FacebookRequestError.Category.LOGIN_RECOVERABLE;
        }
        Map<Integer, Set<Integer>> map3 = this.transientErrors;
        return (map3 != null && map3.containsKey(Integer.valueOf(errorCode)) && ((set = this.transientErrors.get(Integer.valueOf(errorCode))) == null || set.contains(Integer.valueOf(errorSubCode)))) ? FacebookRequestError.Category.TRANSIENT : FacebookRequestError.Category.OTHER;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final String m9933d(@Nullable FacebookRequestError.Category category) {
        int i11 = category == null ? -1 : C5747a.$EnumSwitchMapping$0[category.ordinal()];
        if (i11 == 1) {
            return this.otherRecoveryMessage;
        }
        if (i11 == 2) {
            return this.loginRecoverableRecoveryMessage;
        }
        if (i11 != 3) {
            return null;
        }
        return this.transientRecoveryMessage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FacebookRequestErrorClassification(@Nullable Map<Integer, ? extends Set<Integer>> map, @Nullable Map<Integer, ? extends Set<Integer>> map2, @Nullable Map<Integer, ? extends Set<Integer>> map3, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.otherErrors = map;
        this.transientErrors = map2;
        this.loginRecoverableErrors = map3;
        this.otherRecoveryMessage = str;
        this.transientRecoveryMessage = str2;
        this.loginRecoverableRecoveryMessage = str3;
    }
}
