package com.kubi.credential.utils;

import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ProtocolUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\fJ%\u0010\u0013\u001a\u00020\u0012*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/credential/utils/ProtocolUtils;", "", "<init>", "()V", "", "responseJson", "Lkotlin/Function0;", "warpFunc", "e", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/String;", "registrationResponseJson", "f", "(Ljava/lang/String;)Ljava/lang/String;", "authenticationResponseJson", "d", "Lorg/json/JSONObject;", "key", "value", "", "c", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V", "", "b", "Lkotlin/Lazy;", "()Z", "enableProtocolWrap", "credential_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ProtocolUtils {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ProtocolUtils f21332a = new ProtocolUtils();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy enableProtocolWrap = LazyKt.lazy(new Function0<Boolean>() { // from class: com.kubi.credential.utils.ProtocolUtils$enableProtocolWrap$2

        /* JADX INFO: renamed from: com.kubi.credential.utils.ProtocolUtils$enableProtocolWrap$2$a */
        /* JADX INFO: compiled from: RemoteConfig.kt */
        @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/credential/utils/ProtocolUtils$enableProtocolWrap$2$a", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
        public static final class C12481a extends TypeToken<Boolean> {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            Object objM20457a;
            try {
                RemoteConfig remoteConfig = RemoteConfig.f19636a;
                Type type = new C12481a().getType();
                Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                objM20457a = RemoteConfig.m20457a("enable_credential_protocol_wrap", type);
            } catch (Throwable th2) {
                C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
                objM20457a = null;
            }
            Boolean bool = (Boolean) objM20457a;
            return Boolean.valueOf(bool != null ? bool.booleanValue() : true);
        }
    });

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m23465c(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj != null) {
            jSONObject.put(str, obj);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m23466d(@NotNull final String authenticationResponseJson) {
        Intrinsics.checkNotNullParameter(authenticationResponseJson, "authenticationResponseJson");
        return m23467e(authenticationResponseJson, new Function0<String>() { // from class: com.kubi.credential.utils.ProtocolUtils$warpAuthenticationResponseJson$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject(authenticationResponseJson);
                ProtocolUtils.m23465c(jSONObject, "rawId", jSONObject2.opt("rawId"));
                ProtocolUtils.m23465c(jSONObject, "authenticatorAttachment", jSONObject2.opt("authenticatorAttachment"));
                ProtocolUtils.m23465c(jSONObject, "type", jSONObject2.opt("type"));
                ProtocolUtils.m23465c(jSONObject, "id", jSONObject2.opt("id"));
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("response");
                ProtocolUtils.m23465c(jSONObject3, "clientDataJSON", jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.opt("clientDataJSON") : null);
                ProtocolUtils.m23465c(jSONObject3, "authenticatorData", jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.opt("authenticatorData") : null);
                ProtocolUtils.m23465c(jSONObject3, TUIConstants.TUICalling.PARAM_NAME_AUDIO_SIGNATURE, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.opt(TUIConstants.TUICalling.PARAM_NAME_AUDIO_SIGNATURE) : null);
                ProtocolUtils.m23465c(jSONObject3, "userHandle", jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.opt("userHandle") : null);
                Unit unit = Unit.INSTANCE;
                ProtocolUtils.m23465c(jSONObject, "response", jSONObject3);
                ProtocolUtils.m23465c(jSONObject, "clientExtensionResults", jSONObject2.opt("clientExtensionResults"));
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "JSONObject().apply {\n   …\n            }.toString()");
                return string;
            }
        });
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final String m23467e(String responseJson, Function0<String> warpFunc) {
        return f21332a.m23469b() ? warpFunc.invoke() : responseJson;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m23468f(@NotNull final String registrationResponseJson) {
        Intrinsics.checkNotNullParameter(registrationResponseJson, "registrationResponseJson");
        return m23467e(registrationResponseJson, new Function0<String>() { // from class: com.kubi.credential.utils.ProtocolUtils$warpRegistrationResponseJson$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject(registrationResponseJson);
                ProtocolUtils.m23465c(jSONObject, "rawId", jSONObject2.opt("rawId"));
                ProtocolUtils.m23465c(jSONObject, "authenticatorAttachment", jSONObject2.opt("authenticatorAttachment"));
                ProtocolUtils.m23465c(jSONObject, "type", jSONObject2.opt("type"));
                ProtocolUtils.m23465c(jSONObject, "id", jSONObject2.opt("id"));
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("response");
                ProtocolUtils.m23465c(jSONObject3, "transports", jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.opt("transports") : null);
                ProtocolUtils.m23465c(jSONObject3, "clientDataJSON", jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.opt("clientDataJSON") : null);
                ProtocolUtils.m23465c(jSONObject3, "attestationObject", jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.opt("attestationObject") : null);
                Unit unit = Unit.INSTANCE;
                ProtocolUtils.m23465c(jSONObject, "response", jSONObject3);
                ProtocolUtils.m23465c(jSONObject, "clientExtensionResults", jSONObject2.opt("clientExtensionResults"));
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "JSONObject().apply {\n   …\n            }.toString()");
                return string;
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final boolean m23469b() {
        return ((Boolean) enableProtocolWrap.getValue()).booleanValue();
    }
}
