package p461n3;

import android.util.Patterns;
import androidx.autofill.HintConstants;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.common.constants.JCommonConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.Charsets;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: n3.a */
/* JADX INFO: compiled from: FeatureExtractor.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010$\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010(J+\u0010,\u001a\u00020\u00042\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0)2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0)H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u0014H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b3\u00104J/\u0010:\u001a\u00020\t2\u0006\u00105\u001a\u00020\u00122\n\u00108\u001a\u000606j\u0002`72\n\u00109\u001a\u000606j\u0002`7H\u0002¢\u0006\u0004\b:\u0010;J\u0019\u00100\u001a\u0004\u0018\u00010\u00122\u0006\u00105\u001a\u00020\u0012H\u0002¢\u0006\u0004\b0\u0010<R\"\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u0010>R\"\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010>R\"\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010>R\u0016\u0010C\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u0010BR\u0016\u0010E\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010D¨\u0006F"}, m90084d2 = {"Ln3/a;", "", "<init>", "()V", "", "f", "()Z", "Ljava/io/File;", "file", "", "d", "(Ljava/io/File;)V", "", "buttonText", "activityName", "appName", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lorg/json/JSONObject;", "viewHierarchy", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lorg/json/JSONObject;Ljava/lang/String;)[F", "node", "i", "(Lorg/json/JSONObject;)[F", "Lorg/json/JSONArray;", "siblings", "screenName", "formFieldsJSON", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lorg/json/JSONObject;Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[F", "language", "event", "textType", "matchText", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "pattern", "k", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "indicators", "values", "g", "([Ljava/lang/String;[Ljava/lang/String;)Z", "j", "(Lorg/json/JSONObject;Lorg/json/JSONArray;)Z", "b", "m", "([F[F)V", "e", "(Lorg/json/JSONObject;)Z", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "textSB", "hintSB", "n", "(Lorg/json/JSONObject;Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;)V", "(Lorg/json/JSONObject;)Lorg/json/JSONObject;", "", "Ljava/util/Map;", "languageInfo", "eventInfo", "textTypeInfo", "Lorg/json/JSONObject;", "rules", "Z", "initialized", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C42718a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42718a f94534a = new C42718a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static Map<String, String> languageInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static Map<String, String> eventInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static Map<String, String> textTypeInfo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static JSONObject rules;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static boolean initialized;

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final float[] m93598a(@NotNull JSONObject viewHierarchy, @NotNull String appName) {
        if (C42757a.m93689d(C42718a.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(viewHierarchy, "viewHierarchy");
            Intrinsics.checkNotNullParameter(appName, "appName");
            if (!initialized) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i11 = 0; i11 < 30; i11++) {
                fArr[i11] = 0.0f;
            }
            try {
                String lowerCase = appName.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                JSONObject jSONObject = new JSONObject(viewHierarchy.optJSONObject(TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW).toString());
                String screenName = viewHierarchy.optString("screenname");
                JSONArray jSONArray = new JSONArray();
                C42718a c42718a = f94534a;
                c42718a.m93607j(jSONObject, jSONArray);
                c42718a.m93610m(fArr, c42718a.m93606i(jSONObject));
                JSONObject jSONObjectM93602b = c42718a.m93602b(jSONObject);
                if (jSONObjectM93602b == null) {
                    return null;
                }
                Intrinsics.checkNotNullExpressionValue(screenName, "screenName");
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "viewTree.toString()");
                c42718a.m93610m(fArr, c42718a.m93605h(jSONObjectM93602b, jSONArray, screenName, string, lowerCase));
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C42718a.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m93599c(@NotNull String buttonText, @NotNull String activityName, @NotNull String appName) {
        if (C42757a.m93689d(C42718a.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            Intrinsics.checkNotNullParameter(appName, "appName");
            String lowerCase = (appName + " | " + activityName + ", " + buttonText).toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
            return lowerCase;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C42718a.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m93600d(@Nullable File file) {
        if (C42757a.m93689d(C42718a.class)) {
            return;
        }
        try {
            try {
                rules = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                rules = new JSONObject(new String(bArr, Charsets.UTF_8));
                languageInfo = MapsKt.mapOf(TuplesKt.m90091to("ENGLISH", "1"), TuplesKt.m90091to("GERMAN", "2"), TuplesKt.m90091to("SPANISH", "3"), TuplesKt.m90091to("JAPANESE", "4"));
                eventInfo = MapsKt.mapOf(TuplesKt.m90091to("VIEW_CONTENT", "0"), TuplesKt.m90091to("SEARCH", "1"), TuplesKt.m90091to("ADD_TO_CART", "2"), TuplesKt.m90091to("ADD_TO_WISHLIST", "3"), TuplesKt.m90091to("INITIATE_CHECKOUT", "4"), TuplesKt.m90091to("ADD_PAYMENT_INFO", "5"), TuplesKt.m90091to("PURCHASE", "6"), TuplesKt.m90091to("LEAD", TUIConstants.TUICustomerServicePlugin.BUSINESS_ID_SRC_CUSTOMER_SERVICE_SAY_HELLO), TuplesKt.m90091to("COMPLETE_REGISTRATION", "8"));
                textTypeInfo = MapsKt.mapOf(TuplesKt.m90091to("BUTTON_TEXT", "1"), TuplesKt.m90091to("PAGE_TITLE", "2"), TuplesKt.m90091to("RESOLVED_DOCUMENT_LINK", "3"), TuplesKt.m90091to("BUTTON_ID", "4"));
                initialized = true;
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C42718a.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final boolean m93601f() {
        if (C42757a.m93689d(C42718a.class)) {
            return false;
        }
        try {
            return initialized;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C42718a.class);
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public final float[] m93605h(JSONObject node, JSONArray siblings, String screenName, String formFieldsJSON, String appName) {
        float f11;
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i11 = 0; i11 < 30; i11++) {
                fArr[i11] = 0.0f;
            }
            int length = siblings.length();
            float f12 = 1.0f;
            fArr[3] = length > 1 ? length - 1.0f : 0.0f;
            try {
                int length2 = siblings.length();
                int i12 = 0;
                while (i12 < length2) {
                    JSONObject jSONObject = siblings.getJSONObject(i12);
                    f11 = f12;
                    try {
                        Intrinsics.checkNotNullExpressionValue(jSONObject, "siblings.getJSONObject(i)");
                        if (m93603e(jSONObject)) {
                            fArr[9] = fArr[9] + f11;
                        }
                        i12++;
                        f12 = f11;
                    } catch (JSONException unused) {
                    }
                }
            } catch (JSONException unused2) {
            }
            f11 = f12;
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str = screenName + '|' + appName;
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            m93611n(node, sb3, sb2);
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "hintSB.toString()");
            String string2 = sb3.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "textSB.toString()");
            fArr[15] = m93609l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", string2) ? f11 : 0.0f;
            fArr[16] = m93609l("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", str) ? f11 : 0.0f;
            fArr[17] = m93609l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", string) ? f11 : 0.0f;
            fArr[18] = StringsKt.contains$default((CharSequence) formFieldsJSON, (CharSequence) "password", false, 2, (Object) null) ? f11 : 0.0f;
            fArr[19] = m93608k("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", formFieldsJSON) ? f11 : 0.0f;
            fArr[20] = m93608k("(?i)(sign in)|login|signIn", formFieldsJSON) ? f11 : 0.0f;
            fArr[21] = m93608k("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", formFieldsJSON) ? f11 : 0.0f;
            fArr[22] = m93609l("ENGLISH", "PURCHASE", "BUTTON_TEXT", string2) ? f11 : 0.0f;
            fArr[24] = m93609l("ENGLISH", "PURCHASE", "PAGE_TITLE", str) ? f11 : 0.0f;
            fArr[25] = m93608k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", string2) ? f11 : 0.0f;
            fArr[27] = m93608k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str) ? f11 : 0.0f;
            fArr[28] = m93609l("ENGLISH", "LEAD", "BUTTON_TEXT", string2) ? f11 : 0.0f;
            fArr[29] = m93609l("ENGLISH", "LEAD", "PAGE_TITLE", str) ? f11 : 0.0f;
            return fArr;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m93607j(JSONObject node, JSONArray siblings) {
        boolean z11;
        if (C42757a.m93689d(this)) {
            return false;
        }
        try {
            if (node.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray jSONArrayOptJSONArray = node.optJSONArray("childviews");
            int length = jSONArrayOptJSONArray.length();
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z11 = false;
                    break;
                }
                if (jSONArrayOptJSONArray.getJSONObject(i11).optBoolean("is_interacted")) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            boolean z12 = z11;
            JSONArray jSONArray = new JSONArray();
            if (z11) {
                int length2 = jSONArrayOptJSONArray.length();
                for (int i12 = 0; i12 < length2; i12++) {
                    siblings.put(jSONArrayOptJSONArray.getJSONObject(i12));
                }
                return z12;
            }
            int length3 = jSONArrayOptJSONArray.length();
            for (int i13 = 0; i13 < length3; i13++) {
                JSONObject child = jSONArrayOptJSONArray.getJSONObject(i13);
                Intrinsics.checkNotNullExpressionValue(child, "child");
                if (m93607j(child, siblings)) {
                    jSONArray.put(child);
                    z12 = true;
                }
            }
            node.put("childviews", jSONArray);
            return z12;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m93602b(JSONObject view) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            if (view.optBoolean("is_interacted")) {
                return view;
            }
            JSONArray jSONArrayOptJSONArray = view.optJSONArray("childviews");
            if (jSONArrayOptJSONArray == null) {
                return null;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i11);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "children.getJSONObject(i)");
                JSONObject jSONObjectM93602b = m93602b(jSONObject);
                if (jSONObjectM93602b != null) {
                    return jSONObjectM93602b;
                }
            }
        } catch (JSONException unused) {
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m93603e(JSONObject node) {
        if (C42757a.m93689d(this)) {
            return false;
        }
        try {
            if (((node.optInt("classtypebitmask") & 1) << 5) <= 0) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m93604g(String[] indicators, String[] values) {
        if (C42757a.m93689d(this)) {
            return false;
        }
        try {
            for (String str : indicators) {
                for (String str2 : values) {
                    if (StringsKt.contains$default((CharSequence) str2, (CharSequence) str, false, 2, (Object) null)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public final float[] m93606i(JSONObject node) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i11 = 0; i11 < 30; i11++) {
                fArr[i11] = 0.0f;
            }
            String strOptString = node.optString("text");
            Intrinsics.checkNotNullExpressionValue(strOptString, "node.optString(TEXT_KEY)");
            String lowerCase = strOptString.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
            String strOptString2 = node.optString("hint");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "node.optString(HINT_KEY)");
            String lowerCase2 = strOptString2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase()");
            String strOptString3 = node.optString("classname");
            Intrinsics.checkNotNullExpressionValue(strOptString3, "node.optString(CLASS_NAME_KEY)");
            String lowerCase3 = strOptString3.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase()");
            int iOptInt = node.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (m93604g(new String[]{"$", "amount", FirebaseAnalytics.Param.PRICE, "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (m93604g(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (m93604g(new String[]{"tel", HintConstants.AUTOFILL_HINT_PHONE}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (m93604g(new String[]{FirebaseAnalytics.Event.SEARCH}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (iOptInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (iOptInt == 2 || iOptInt == 3) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (iOptInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (StringsKt.contains$default((CharSequence) lowerCase3, (CharSequence) "checkbox", false, 2, (Object) null)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (m93604g(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (StringsKt.contains$default((CharSequence) lowerCase3, (CharSequence) JCommonConstants.Network.KEY_RADIO, false, 2, (Object) null) && StringsKt.contains$default((CharSequence) lowerCase3, (CharSequence) "button", false, 2, (Object) null)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray jSONArrayOptJSONArray = node.optJSONArray("childviews");
                int length = jSONArrayOptJSONArray.length();
                for (int i12 = 0; i12 < length; i12++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i12);
                    Intrinsics.checkNotNullExpressionValue(jSONObject, "childViews.getJSONObject(i)");
                    m93610m(fArr, m93606i(jSONObject));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m93608k(String pattern, String matchText) {
        if (C42757a.m93689d(this)) {
            return false;
        }
        try {
            return Pattern.compile(pattern).matcher(matchText).find();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m93609l(String language, String event, String textType, String matchText) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (C42757a.m93689d(this)) {
            return false;
        }
        try {
            JSONObject jSONObject = rules;
            String strOptString = null;
            Map<String, String> map = null;
            strOptString = null;
            strOptString = null;
            strOptString = null;
            strOptString = null;
            if (jSONObject == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rules");
                jSONObject = null;
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("rulesForLanguage");
            if (jSONObjectOptJSONObject3 != null) {
                Map<String, String> map2 = languageInfo;
                if (map2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("languageInfo");
                    map2 = null;
                }
                JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject(map2.get(language));
                if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject4.optJSONObject("rulesForEvent")) != null) {
                    Map<String, String> map3 = eventInfo;
                    if (map3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("eventInfo");
                        map3 = null;
                    }
                    JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject.optJSONObject(map3.get(event));
                    if (jSONObjectOptJSONObject5 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject5.optJSONObject("positiveRules")) != null) {
                        Map<String, String> map4 = textTypeInfo;
                        if (map4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("textTypeInfo");
                        } else {
                            map = map4;
                        }
                        strOptString = jSONObjectOptJSONObject2.optString(map.get(textType));
                    }
                }
            }
            if (strOptString == null) {
                return false;
            }
            return m93608k(strOptString, matchText);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m93610m(float[] a11, float[] b11) {
        if (!C42757a.m93689d(this)) {
            try {
                int length = a11.length;
                for (int i11 = 0; i11 < length; i11++) {
                    a11[i11] = a11[i11] + b11[i11];
                }
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m93611n(JSONObject view, StringBuilder textSB, StringBuilder hintSB) {
        if (!C42757a.m93689d(this)) {
            try {
                String strOptString = view.optString("text", "");
                Intrinsics.checkNotNullExpressionValue(strOptString, "view.optString(TEXT_KEY, \"\")");
                String lowerCase = strOptString.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                String strOptString2 = view.optString("hint", "");
                Intrinsics.checkNotNullExpressionValue(strOptString2, "view.optString(HINT_KEY, \"\")");
                String lowerCase2 = strOptString2.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase()");
                if (lowerCase.length() > 0) {
                    textSB.append(lowerCase);
                    textSB.append(C33627eb.f69716f);
                }
                if (lowerCase2.length() > 0) {
                    hintSB.append(lowerCase2);
                    hintSB.append(C33627eb.f69716f);
                }
                JSONArray jSONArrayOptJSONArray = view.optJSONArray("childviews");
                if (jSONArrayOptJSONArray != null) {
                    int length = jSONArrayOptJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        try {
                            JSONObject currentChildView = jSONArrayOptJSONArray.getJSONObject(i11);
                            Intrinsics.checkNotNullExpressionValue(currentChildView, "currentChildView");
                            m93611n(currentChildView, textSB, hintSB);
                        } catch (JSONException unused) {
                        }
                    }
                }
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }
}
