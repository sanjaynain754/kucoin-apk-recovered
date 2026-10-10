package androidx.credentials.webauthn;

import androidx.annotation.RestrictTo;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PublicKeyCredentialRequestOptions.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, m90084d2 = {"Landroidx/credentials/webauthn/PublicKeyCredentialRequestOptions;", "", "requestJson", "", "<init>", "(Ljava/lang/String;)V", JPushConstants.Analysis.KEY_JSON, "Lorg/json/JSONObject;", "getJson", "()Lorg/json/JSONObject;", ClientData.KEY_CHALLENGE, "", "getChallenge", "()[B", "timeout", "", "getTimeout", "()J", "rpId", "getRpId", "()Ljava/lang/String;", "userVerification", "getUserVerification", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class PublicKeyCredentialRequestOptions {

    @NotNull
    private final byte[] challenge;

    @NotNull
    private final JSONObject json;

    @NotNull
    private final String rpId;
    private final long timeout;

    @NotNull
    private final String userVerification;

    @NotNull
    public final byte[] getChallenge() {
        return this.challenge;
    }

    @NotNull
    public final JSONObject getJson() {
        return this.json;
    }

    @NotNull
    public final String getRpId() {
        return this.rpId;
    }

    public final long getTimeout() {
        return this.timeout;
    }

    @NotNull
    public final String getUserVerification() {
        return this.userVerification;
    }

    public PublicKeyCredentialRequestOptions(@NotNull String requestJson) throws JSONException {
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
        JSONObject jSONObject = new JSONObject(requestJson);
        this.json = jSONObject;
        String string = jSONObject.getString(ClientData.KEY_CHALLENGE);
        WebAuthnUtils.Companion companion = WebAuthnUtils.INSTANCE;
        Intrinsics.checkNotNull(string);
        this.challenge = companion.b64Decode(string);
        this.timeout = jSONObject.optLong("timeout", 0L);
        String strOptString = jSONObject.optString("rpId", "");
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        this.rpId = strOptString;
        String strOptString2 = jSONObject.optString("userVerification", "preferred");
        Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
        this.userVerification = strOptString2;
    }
}
