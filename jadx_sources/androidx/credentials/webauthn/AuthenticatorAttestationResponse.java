package androidx.credentials.webauthn;

import androidx.annotation.RestrictTo;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.Charsets;

/* JADX INFO: compiled from: AuthenticatorAttestationResponse.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001d\u001a\u00020\u0005H\u0002J\r\u0010\u001e\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u001fJ\b\u0010 \u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006!"}, m90084d2 = {"Landroidx/credentials/webauthn/AuthenticatorAttestationResponse;", "Landroidx/credentials/webauthn/AuthenticatorResponse;", "requestOptions", "Landroidx/credentials/webauthn/PublicKeyCredentialCreationOptions;", "credentialId", "", "credentialPublicKey", "origin", "", "up", "", "uv", "be", CmcdConfiguration.KEY_BUFFER_STARVATION, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "clientDataHash", "<init>", "(Landroidx/credentials/webauthn/PublicKeyCredentialCreationOptions;[B[BLjava/lang/String;ZZZZLjava/lang/String;[B)V", "clientJson", "Lorg/json/JSONObject;", "getClientJson", "()Lorg/json/JSONObject;", "setClientJson", "(Lorg/json/JSONObject;)V", "attestationObject", "getAttestationObject", "()[B", "setAttestationObject", "([B)V", "authData", "defaultAttestationObject", "defaultAttestationObject$credentials", JPushConstants.Analysis.KEY_JSON, "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class AuthenticatorAttestationResponse implements AuthenticatorResponse {

    @NotNull
    private byte[] attestationObject;
    private final boolean be;
    private final boolean bs;

    @Nullable
    private final byte[] clientDataHash;

    @NotNull
    private JSONObject clientJson;

    @NotNull
    private final byte[] credentialId;

    @NotNull
    private final byte[] credentialPublicKey;

    @NotNull
    private final String origin;

    @Nullable
    private final String packageName;

    @NotNull
    private final PublicKeyCredentialCreationOptions requestOptions;
    private final boolean up;
    private final boolean uv;

    public AuthenticatorAttestationResponse(@NotNull PublicKeyCredentialCreationOptions requestOptions, @NotNull byte[] credentialId, @NotNull byte[] credentialPublicKey, @NotNull String origin, boolean z11, boolean z12, boolean z13, boolean z14, @Nullable String str, @Nullable byte[] bArr) throws JSONException {
        Intrinsics.checkNotNullParameter(requestOptions, "requestOptions");
        Intrinsics.checkNotNullParameter(credentialId, "credentialId");
        Intrinsics.checkNotNullParameter(credentialPublicKey, "credentialPublicKey");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.requestOptions = requestOptions;
        this.credentialId = credentialId;
        this.credentialPublicKey = credentialPublicKey;
        this.origin = origin;
        this.up = z11;
        this.uv = z12;
        this.be = z13;
        this.bs = z14;
        this.packageName = str;
        this.clientDataHash = bArr;
        this.clientJson = new JSONObject();
        getClientJson().put("type", "webauthn.create");
        getClientJson().put(ClientData.KEY_CHALLENGE, WebAuthnUtils.INSTANCE.b64Encode(requestOptions.getChallenge()));
        getClientJson().put("origin", origin);
        if (str != null) {
            getClientJson().put("androidPackageName", str);
        }
        this.attestationObject = defaultAttestationObject$credentials();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    private final byte[] authData() throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = this.requestOptions.getRp().getId().getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        boolean z11 = this.up;
        ?? r11 = z11;
        if (this.uv) {
            r11 = (z11 ? 1 : 0) | 4;
        }
        ?? r12 = r11;
        if (this.be) {
            r12 = (r11 == true ? 1 : 0) | 8;
        }
        ?? r13 = r12;
        if (this.bs) {
            r13 = (r12 == true ? 1 : 0) | 16;
        }
        int i11 = r13 | 64;
        byte[] bArr = new byte[16];
        for (int i12 = 0; i12 < 16; i12++) {
            bArr[i12] = 0;
        }
        byte[] bArr2 = this.credentialId;
        byte[] bArr3 = {(byte) (bArr2.length >> 8), (byte) bArr2.length};
        Intrinsics.checkNotNull(bArrDigest);
        return ArraysKt.plus(ArraysKt.plus(ArraysKt.plus(ArraysKt.plus(ArraysKt.plus(ArraysKt.plus(bArrDigest, new byte[]{(byte) i11}), new byte[]{0, 0, 0, 0}), bArr), bArr3), this.credentialId), this.credentialPublicKey);
    }

    @NotNull
    public final byte[] defaultAttestationObject$credentials() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("fmt", "none");
        linkedHashMap.put("attStmt", MapsKt.emptyMap());
        linkedHashMap.put("authData", authData());
        return new Cbor().encode(linkedHashMap);
    }

    @NotNull
    public final byte[] getAttestationObject() {
        return this.attestationObject;
    }

    @Override // androidx.credentials.webauthn.AuthenticatorResponse
    @NotNull
    public JSONObject getClientJson() {
        return this.clientJson;
    }

    public final void setAttestationObject(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<set-?>");
        this.attestationObject = bArr;
    }

    @Override // androidx.credentials.webauthn.AuthenticatorResponse
    public void setClientJson(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<set-?>");
        this.clientJson = jSONObject;
    }

    @Override // androidx.credentials.webauthn.AuthenticatorResponse
    @NotNull
    public JSONObject json() throws JSONException {
        String string = getClientJson().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        byte[] bytes = string.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        JSONObject jSONObject = new JSONObject();
        if (this.clientDataHash == null) {
            jSONObject.put("clientDataJSON", WebAuthnUtils.INSTANCE.b64Encode(bytes));
        }
        jSONObject.put("attestationObject", WebAuthnUtils.INSTANCE.b64Encode(this.attestationObject));
        jSONObject.put("transports", new JSONArray((Collection) CollectionsKt.listOf((Object[]) new String[]{"internal", "hybrid"})));
        return jSONObject;
    }

    public /* synthetic */ AuthenticatorAttestationResponse(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, byte[] bArr, byte[] bArr2, String str, boolean z11, boolean z12, boolean z13, boolean z14, String str2, byte[] bArr3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(publicKeyCredentialCreationOptions, bArr, bArr2, str, z11, z12, z13, z14, (i11 & 256) != 0 ? null : str2, (i11 & 512) != 0 ? null : bArr3);
    }
}
