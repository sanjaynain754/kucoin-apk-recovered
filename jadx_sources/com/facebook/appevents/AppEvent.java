package com.facebook.appevents;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.internal.C5760c;
import com.facebook.internal.Logger;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p220e3.C37054a;
import p330i3.C38431c;
import p330i3.C38433e;
import p357j3.C40258g;
import p446m3.C42419a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.jvm.internal.TypeIntrinsics;
import p852kotlin.text.Regex;

/* JADX INFO: compiled from: AppEvent.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0010\b\u0007\u0018\u0000 72\u00020\u0001:\u000278BS\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B3\b\u0012\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u001d¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010 \u001a\u0004\u0018\u00010\u001d2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b \u0010#J\u000f\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J=\u0010&\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b&\u0010'J/\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020)2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010(\u001a\u00020\tH\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0002H\u0002¢\u0006\u0004\b,\u0010%R\u0017\u0010-\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u001fR\u0017\u00100\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u0010\u001fR\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u00102\u001a\u0004\b\u0014\u0010\u001cR\u0014\u0010\u0015\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00102R\u0017\u00103\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010%R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00104R\u0011\u00106\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b6\u0010\u001c¨\u00069"}, m90084d2 = {"Lcom/facebook/appevents/AppEvent;", "Ljava/io/Serializable;", "", "contextName", "eventName", "", "valueToSum", "Landroid/os/Bundle;", "parameters", "", "isImplicitlyLogged", "isInBackground", "Ljava/util/UUID;", "currentSessionId", "Lcom/facebook/appevents/OperationalData;", "operationalParameters", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;ZZLjava/util/UUID;Lcom/facebook/appevents/OperationalData;)V", "jsonString", "operationalJsonString", "isImplicit", "inBackground", "checksum", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "", "writeReplace", "()Ljava/lang/Object;", "getIsImplicit", "()Z", "Lorg/json/JSONObject;", "getJSONObject", "()Lorg/json/JSONObject;", "getOperationalJSONObject", "Lcom/facebook/appevents/OperationalDataEnum;", "type", "(Lcom/facebook/appevents/OperationalDataEnum;)Lorg/json/JSONObject;", "toString", "()Ljava/lang/String;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;Ljava/util/UUID;)Lorg/json/JSONObject;", "isOperational", "", "c", "(Landroid/os/Bundle;Z)Ljava/util/Map;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "jsonObject", "Lorg/json/JSONObject;", "getJsonObject", "operationalJsonObject", "getOperationalJsonObject", "Z", "name", "Ljava/lang/String;", "getName", "isChecksumValid", "Companion", "SerializationProxyV2", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class AppEvent implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final HashSet<String> f7643b = new HashSet<>();
    private static final long serialVersionUID = 1;

    @Nullable
    private final String checksum;
    private final boolean inBackground;
    private final boolean isImplicit;

    @NotNull
    private final JSONObject jsonObject;

    @NotNull
    private final String name;

    @NotNull
    private final JSONObject operationalJsonObject;

    /* JADX INFO: compiled from: AppEvent.kt */
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R$\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0012j\b\u0012\u0004\u0012\u00020\u0004`\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m90084d2 = {"Lcom/facebook/appevents/AppEvent$Companion;", "", "<init>", "()V", "", "identifier", "", "validateIdentifier", "(Ljava/lang/String;)V", "toHash", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Ljava/lang/String;", "", "MAX_IDENTIFIER_LENGTH", "I", "", "serialVersionUID", "J", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "validatedIdentifiers", "Ljava/util/HashSet;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAppEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppEvent.kt\ncom/facebook/appevents/AppEvent$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,299:1\n1#2:300\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final String m7837a(String toHash) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                Charset charsetForName = Charset.forName("UTF-8");
                Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
                byte[] bytes = toHash.getBytes(charsetForName);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                messageDigest.update(bytes, 0, bytes.length);
                byte[] bArrDigest = messageDigest.digest();
                Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest.digest()");
                return C40258g.m88608c(bArrDigest);
            } catch (UnsupportedEncodingException e11) {
                C5760c.m10063d0("Failed to generate checksum: ", e11);
                return "1";
            } catch (NoSuchAlgorithmException e12) {
                C5760c.m10063d0("Failed to generate checksum: ", e12);
                return "0";
            }
        }

        public final void validateIdentifier(@NotNull String identifier) {
            boolean zContains;
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            if (identifier.length() == 0 || identifier.length() > 40) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{identifier, 40}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
                throw new FacebookException(str);
            }
            synchronized (AppEvent.f7643b) {
                zContains = AppEvent.f7643b.contains(identifier);
                Unit unit = Unit.INSTANCE;
            }
            if (zContains) {
                return;
            }
            if (new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").matches(identifier)) {
                synchronized (AppEvent.f7643b) {
                    AppEvent.f7643b.add(identifier);
                }
            } else {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String str2 = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{identifier}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                throw new FacebookException(str2);
            }
        }
    }

    /* JADX INFO: compiled from: AppEvent.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/facebook/appevents/AppEvent$SerializationProxyV2;", "Ljava/io/Serializable;", "jsonString", "", "operationalJsonString", "isImplicit", "", "inBackground", "checksum", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "readResolve", "", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class SerializationProxyV2 implements Serializable {
        private static final long serialVersionUID = 20160803001L;

        @Nullable
        private final String checksum;
        private final boolean inBackground;
        private final boolean isImplicit;

        @NotNull
        private final String jsonString;

        @NotNull
        private final String operationalJsonString;

        public SerializationProxyV2(@NotNull String jsonString, @NotNull String operationalJsonString, boolean z11, boolean z12, @Nullable String str) {
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            Intrinsics.checkNotNullParameter(operationalJsonString, "operationalJsonString");
            this.jsonString = jsonString;
            this.operationalJsonString = operationalJsonString;
            this.isImplicit = z11;
            this.inBackground = z12;
            this.checksum = str;
        }

        private final Object readResolve() throws ObjectStreamException, JSONException {
            return new AppEvent(this.jsonString, this.operationalJsonString, this.isImplicit, this.inBackground, this.checksum, null);
        }
    }

    public /* synthetic */ AppEvent(String str, String str2, boolean z11, boolean z12, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z11, z12, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: getOperationalJSONObject, reason: from getter */
    public final JSONObject getOperationalJsonObject() {
        return this.operationalJsonObject;
    }

    public /* synthetic */ AppEvent(String str, String str2, Double d11, Bundle bundle, boolean z11, boolean z12, UUID uuid, OperationalData operationalData, int i11, DefaultConstructorMarker defaultConstructorMarker) throws JSONException, FacebookException {
        this(str, str2, d11, bundle, z11, z12, uuid, (i11 & 128) != 0 ? null : operationalData);
    }

    public static /* synthetic */ Map validateParameters$default(AppEvent appEvent, Bundle bundle, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return appEvent.m7836c(bundle, z11);
    }

    private final Object writeReplace() throws ObjectStreamException {
        String string = this.jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
        String string2 = this.operationalJsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "operationalJsonObject.toString()");
        return new SerializationProxyV2(string, string2, this.isImplicit, this.inBackground, this.checksum);
    }

    /* JADX INFO: renamed from: a */
    public final String m7834a() {
        Companion companion = INSTANCE;
        String string = this.jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
        return companion.m7837a(string);
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m7835b(String contextName, String eventName, Double valueToSum, Bundle parameters, UUID currentSessionId) throws JSONException {
        INSTANCE.validateIdentifier(eventName);
        JSONObject jSONObject = new JSONObject();
        String strM93108e = C42419a.m93108e(eventName);
        if (Intrinsics.areEqual(strM93108e, eventName)) {
            strM93108e = C38433e.m86681d(eventName);
        }
        jSONObject.put("_eventName", strM93108e);
        jSONObject.put("_logTime", System.currentTimeMillis() / ((long) 1000));
        jSONObject.put("_ui", contextName);
        if (currentSessionId != null) {
            jSONObject.put("_session_id", currentSessionId);
        }
        if (parameters != null) {
            Map mapValidateParameters$default = validateParameters$default(this, parameters, false, 2, null);
            for (String str : mapValidateParameters$default.keySet()) {
                jSONObject.put(str, mapValidateParameters$default.get(str));
            }
        }
        if (valueToSum != null) {
            jSONObject.put("_valueToSum", valueToSum.doubleValue());
        }
        if (this.inBackground) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.isImplicit) {
            jSONObject.put("_implicitlyLogged", "1");
            return jSONObject;
        }
        Logger.Companion companion = Logger.INSTANCE;
        LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "eventObject.toString()");
        companion.log(loggingBehavior, "AppEvents", "Created app event '%s'", string);
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public final Map<String, String> m7836c(Bundle parameters, boolean isOperational) {
        HashMap map = new HashMap();
        for (String key : parameters.keySet()) {
            Companion companion = INSTANCE;
            Intrinsics.checkNotNullExpressionValue(key, "key");
            companion.validateIdentifier(key);
            Object obj = parameters.get(key);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, key}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                throw new FacebookException(str);
            }
            map.put(key, obj.toString());
        }
        if (!isOperational) {
            C38431c.m86667c(map);
            C42419a.m93109f(TypeIntrinsics.asMutableMap(map), this.name);
            C37054a.m82960c(TypeIntrinsics.asMutableMap(map), this.name);
        }
        return map;
    }

    public final boolean getIsImplicit() {
        return this.isImplicit;
    }

    @NotNull
    /* JADX INFO: renamed from: getJSONObject, reason: from getter */
    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    @NotNull
    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final JSONObject getOperationalJSONObject(@NotNull OperationalDataEnum type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.operationalJsonObject.optJSONObject(type.getValue());
    }

    @NotNull
    public final JSONObject getOperationalJsonObject() {
        return this.operationalJsonObject;
    }

    public final boolean isChecksumValid() {
        if (this.checksum == null) {
            return true;
        }
        return Intrinsics.areEqual(m7834a(), this.checksum);
    }

    public final boolean isImplicit() {
        return this.isImplicit;
    }

    @NotNull
    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.jsonObject.optString("_eventName"), Boolean.valueOf(this.isImplicit), this.jsonObject.toString()}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }

    public AppEvent(@NotNull String contextName, @NotNull String eventName, @Nullable Double d11, @Nullable Bundle bundle, boolean z11, boolean z12, @Nullable UUID uuid, @Nullable OperationalData operationalData) throws JSONException, FacebookException {
        JSONObject jSONObjectM7891e;
        Intrinsics.checkNotNullParameter(contextName, "contextName");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.isImplicit = z11;
        this.inBackground = z12;
        this.name = eventName;
        this.operationalJsonObject = (operationalData == null || (jSONObjectM7891e = operationalData.m7891e()) == null) ? new JSONObject() : jSONObjectM7891e;
        this.jsonObject = m7835b(contextName, eventName, d11, bundle, uuid);
        this.checksum = m7834a();
    }

    public AppEvent(String str, String str2, boolean z11, boolean z12, String str3) {
        JSONObject jSONObject = new JSONObject(str);
        this.jsonObject = jSONObject;
        this.operationalJsonObject = new JSONObject(str2);
        this.isImplicit = z11;
        String strOptString = jSONObject.optString("_eventName");
        Intrinsics.checkNotNullExpressionValue(strOptString, "jsonObject.optString(Con…nts.EVENT_NAME_EVENT_KEY)");
        this.name = strOptString;
        this.checksum = str3;
        this.inBackground = z12;
    }
}
