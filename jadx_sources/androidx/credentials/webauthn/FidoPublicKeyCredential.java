package androidx.credentials.webauthn;

import androidx.annotation.RestrictTo;
import cn.jiguang.privates.push.constants.JPushConstants;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FidoPublicKeyCredential.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m90084d2 = {"Landroidx/credentials/webauthn/FidoPublicKeyCredential;", "", "rawId", "", "response", "Landroidx/credentials/webauthn/AuthenticatorResponse;", "authenticatorAttachment", "", "<init>", "([BLandroidx/credentials/webauthn/AuthenticatorResponse;Ljava/lang/String;)V", "getRawId", "()[B", "getResponse", "()Landroidx/credentials/webauthn/AuthenticatorResponse;", "getAuthenticatorAttachment", "()Ljava/lang/String;", JPushConstants.Analysis.KEY_JSON, "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class FidoPublicKeyCredential {

    @NotNull
    private final String authenticatorAttachment;

    @NotNull
    private final byte[] rawId;

    @NotNull
    private final AuthenticatorResponse response;

    @NotNull
    public final String getAuthenticatorAttachment() {
        return this.authenticatorAttachment;
    }

    @NotNull
    public final byte[] getRawId() {
        return this.rawId;
    }

    @NotNull
    public final AuthenticatorResponse getResponse() {
        return this.response;
    }

    @NotNull
    public final String json() throws JSONException {
        String strB64Encode = WebAuthnUtils.INSTANCE.b64Encode(this.rawId);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", strB64Encode);
        jSONObject.put("rawId", strB64Encode);
        jSONObject.put("type", "public-key");
        jSONObject.put("authenticatorAttachment", this.authenticatorAttachment);
        jSONObject.put("response", this.response.json());
        jSONObject.put("clientExtensionResults", new JSONObject());
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public FidoPublicKeyCredential(@NotNull byte[] rawId, @NotNull AuthenticatorResponse response, @NotNull String authenticatorAttachment) {
        Intrinsics.checkNotNullParameter(rawId, "rawId");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(authenticatorAttachment, "authenticatorAttachment");
        this.rawId = rawId;
        this.response = response;
        this.authenticatorAttachment = authenticatorAttachment;
    }
}
