package androidx.credentials.webauthn;

import android.util.Log;
import androidx.annotation.RestrictTo;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PublicKeyCredentialCreationOptions.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\u0005¨\u00060"}, m90084d2 = {"Landroidx/credentials/webauthn/PublicKeyCredentialCreationOptions;", "", "requestJson", "", "<init>", "(Ljava/lang/String;)V", JPushConstants.Analysis.KEY_JSON, "Lorg/json/JSONObject;", "getJson", "()Lorg/json/JSONObject;", "rp", "Landroidx/credentials/webauthn/PublicKeyCredentialRpEntity;", "getRp", "()Landroidx/credentials/webauthn/PublicKeyCredentialRpEntity;", "user", "Landroidx/credentials/webauthn/PublicKeyCredentialUserEntity;", "getUser", "()Landroidx/credentials/webauthn/PublicKeyCredentialUserEntity;", ClientData.KEY_CHALLENGE, "", "getChallenge", "()[B", "pubKeyCredParams", "", "Landroidx/credentials/webauthn/PublicKeyCredentialParameters;", "getPubKeyCredParams", "()Ljava/util/List;", "timeout", "", "getTimeout", "()J", "setTimeout", "(J)V", "excludeCredentials", "Landroidx/credentials/webauthn/PublicKeyCredentialDescriptor;", "getExcludeCredentials", "setExcludeCredentials", "(Ljava/util/List;)V", "authenticatorSelection", "Landroidx/credentials/webauthn/AuthenticatorSelectionCriteria;", "getAuthenticatorSelection", "()Landroidx/credentials/webauthn/AuthenticatorSelectionCriteria;", "setAuthenticatorSelection", "(Landroidx/credentials/webauthn/AuthenticatorSelectionCriteria;)V", "attestation", "getAttestation", "()Ljava/lang/String;", "setAttestation", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class PublicKeyCredentialCreationOptions {

    @NotNull
    private String attestation;

    @NotNull
    private AuthenticatorSelectionCriteria authenticatorSelection;

    @NotNull
    private final byte[] challenge;

    @NotNull
    private List<PublicKeyCredentialDescriptor> excludeCredentials;

    @NotNull
    private final JSONObject json;

    @NotNull
    private final List<PublicKeyCredentialParameters> pubKeyCredParams;

    @NotNull
    private final PublicKeyCredentialRpEntity rp;
    private long timeout;

    @NotNull
    private final PublicKeyCredentialUserEntity user;

    @NotNull
    public final String getAttestation() {
        return this.attestation;
    }

    @NotNull
    public final AuthenticatorSelectionCriteria getAuthenticatorSelection() {
        return this.authenticatorSelection;
    }

    @NotNull
    public final byte[] getChallenge() {
        return this.challenge;
    }

    @NotNull
    public final List<PublicKeyCredentialDescriptor> getExcludeCredentials() {
        return this.excludeCredentials;
    }

    @NotNull
    public final JSONObject getJson() {
        return this.json;
    }

    @NotNull
    public final List<PublicKeyCredentialParameters> getPubKeyCredParams() {
        return this.pubKeyCredParams;
    }

    @NotNull
    public final PublicKeyCredentialRpEntity getRp() {
        return this.rp;
    }

    public final long getTimeout() {
        return this.timeout;
    }

    @NotNull
    public final PublicKeyCredentialUserEntity getUser() {
        return this.user;
    }

    public final void setAttestation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.attestation = str;
    }

    public final void setAuthenticatorSelection(@NotNull AuthenticatorSelectionCriteria authenticatorSelectionCriteria) {
        Intrinsics.checkNotNullParameter(authenticatorSelectionCriteria, "<set-?>");
        this.authenticatorSelection = authenticatorSelectionCriteria;
    }

    public final void setExcludeCredentials(@NotNull List<PublicKeyCredentialDescriptor> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.excludeCredentials = list;
    }

    public final void setTimeout(long j11) {
        this.timeout = j11;
    }

    public PublicKeyCredentialCreationOptions(@NotNull String requestJson) throws JSONException {
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
        JSONObject jSONObject = new JSONObject(requestJson);
        this.json = jSONObject;
        String string = jSONObject.getString(ClientData.KEY_CHALLENGE);
        WebAuthnUtils.Companion companion = WebAuthnUtils.INSTANCE;
        Intrinsics.checkNotNull(string);
        this.challenge = companion.b64Decode(string);
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        String string2 = jSONObject2.getString("name");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = jSONObject2.getString("id");
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        this.rp = new PublicKeyCredentialRpEntity(string2, string3);
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        String string4 = jSONObject3.getString("id");
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        byte[] bArrB64Decode = companion.b64Decode(string4);
        String string5 = jSONObject3.getString("name");
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        String string6 = jSONObject3.getString("displayName");
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        this.user = new PublicKeyCredentialUserEntity(string5, bArrB64Decode, string6);
        JSONArray jSONArray = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i11);
            String string7 = jSONObject4.getString("type");
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            arrayList.add(new PublicKeyCredentialParameters(string7, jSONObject4.getLong("alg")));
        }
        List<PublicKeyCredentialParameters> list = CollectionsKt.toList(arrayList);
        this.pubKeyCredParams = list;
        this.timeout = this.json.optLong("timeout", 0L);
        this.excludeCredentials = CollectionsKt.emptyList();
        this.authenticatorSelection = new AuthenticatorSelectionCriteria("platform", "required", false, null, 12, null);
        String strOptString = this.json.optString("attestation", "none");
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        this.attestation = strOptString;
        Log.i("WebAuthn", "Challenge " + this.challenge + "()");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("rp ");
        sb2.append(this.rp);
        Log.i("WebAuthn", sb2.toString());
        Log.i("WebAuthn", "user " + this.user);
        Log.i("WebAuthn", "pubKeyCredParams " + list);
        Log.i("WebAuthn", "timeout " + this.timeout);
        Log.i("WebAuthn", "excludeCredentials " + this.excludeCredentials);
        Log.i("WebAuthn", "authenticatorSelection " + this.authenticatorSelection);
        Log.i("WebAuthn", "attestation " + this.attestation);
    }
}
