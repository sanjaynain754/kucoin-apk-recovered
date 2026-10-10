package androidx.credentials.webauthn;

import androidx.annotation.RestrictTo;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.Charsets;

/* JADX INFO: compiled from: AuthenticatorAssertionResponse.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010 \u001a\u00020\u0005J\u0006\u0010!\u001a\u00020\u0005J\b\u0010\"\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001c¨\u0006#"}, m90084d2 = {"Landroidx/credentials/webauthn/AuthenticatorAssertionResponse;", "Landroidx/credentials/webauthn/AuthenticatorResponse;", "requestOptions", "Landroidx/credentials/webauthn/PublicKeyCredentialRequestOptions;", "credentialId", "", "origin", "", "up", "", "uv", "be", CmcdConfiguration.KEY_BUFFER_STARVATION, "userHandle", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "clientDataHash", "<init>", "(Landroidx/credentials/webauthn/PublicKeyCredentialRequestOptions;[BLjava/lang/String;ZZZZ[BLjava/lang/String;[B)V", "clientJson", "Lorg/json/JSONObject;", "getClientJson", "()Lorg/json/JSONObject;", "setClientJson", "(Lorg/json/JSONObject;)V", "authenticatorData", "getAuthenticatorData", "()[B", "setAuthenticatorData", "([B)V", TUIConstants.TUICalling.PARAM_NAME_AUDIO_SIGNATURE, "getSignature", "setSignature", "defaultAuthenticatorData", "dataToSign", JPushConstants.Analysis.KEY_JSON, "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class AuthenticatorAssertionResponse implements AuthenticatorResponse {

    @NotNull
    private byte[] authenticatorData;
    private final boolean be;
    private final boolean bs;

    @Nullable
    private final byte[] clientDataHash;

    @NotNull
    private JSONObject clientJson;

    @NotNull
    private final byte[] credentialId;

    @NotNull
    private final String origin;

    @Nullable
    private final String packageName;

    @NotNull
    private final PublicKeyCredentialRequestOptions requestOptions;

    @NotNull
    private byte[] signature;
    private final boolean up;

    @NotNull
    private byte[] userHandle;
    private final boolean uv;

    public AuthenticatorAssertionResponse(@NotNull PublicKeyCredentialRequestOptions requestOptions, @NotNull byte[] credentialId, @NotNull String origin, boolean z11, boolean z12, boolean z13, boolean z14, @NotNull byte[] userHandle, @Nullable String str, @Nullable byte[] bArr) throws JSONException {
        Intrinsics.checkNotNullParameter(requestOptions, "requestOptions");
        Intrinsics.checkNotNullParameter(credentialId, "credentialId");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(userHandle, "userHandle");
        this.requestOptions = requestOptions;
        this.credentialId = credentialId;
        this.origin = origin;
        this.up = z11;
        this.uv = z12;
        this.be = z13;
        this.bs = z14;
        this.userHandle = userHandle;
        this.packageName = str;
        this.clientDataHash = bArr;
        this.clientJson = new JSONObject();
        this.signature = new byte[0];
        getClientJson().put("type", "webauthn.get");
        getClientJson().put(ClientData.KEY_CHALLENGE, WebAuthnUtils.INSTANCE.b64Encode(requestOptions.getChallenge()));
        getClientJson().put("origin", origin);
        if (str != null) {
            getClientJson().put("androidPackageName", str);
        }
        this.authenticatorData = defaultAuthenticatorData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @NotNull
    public final byte[] defaultAuthenticatorData() throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = this.requestOptions.getRpId().getBytes(Charsets.UTF_8);
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
        int i11 = r12;
        if (this.bs) {
            i11 = (r12 == true ? 1 : 0) | 16;
        }
        Intrinsics.checkNotNull(bArrDigest);
        return ArraysKt.plus(ArraysKt.plus(bArrDigest, new byte[]{(byte) i11}), new byte[]{0, 0, 0, 0});
    }

    @NotNull
    public final byte[] dataToSign() throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bArrDigest = this.clientDataHash;
        if (bArrDigest == null) {
            String string = getClientJson().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            byte[] bytes = string.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            bArrDigest = messageDigest.digest(bytes);
            Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        }
        return ArraysKt.plus(this.authenticatorData, bArrDigest);
    }

    @NotNull
    public final byte[] getAuthenticatorData() {
        return this.authenticatorData;
    }

    @Override // androidx.credentials.webauthn.AuthenticatorResponse
    @NotNull
    public JSONObject getClientJson() {
        return this.clientJson;
    }

    @NotNull
    public final byte[] getSignature() {
        return this.signature;
    }

    public final void setAuthenticatorData(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<set-?>");
        this.authenticatorData = bArr;
    }

    @Override // androidx.credentials.webauthn.AuthenticatorResponse
    public void setClientJson(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<set-?>");
        this.clientJson = jSONObject;
    }

    public final void setSignature(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<set-?>");
        this.signature = bArr;
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
        WebAuthnUtils.Companion companion = WebAuthnUtils.INSTANCE;
        jSONObject.put("authenticatorData", companion.b64Encode(this.authenticatorData));
        jSONObject.put(TUIConstants.TUICalling.PARAM_NAME_AUDIO_SIGNATURE, companion.b64Encode(this.signature));
        jSONObject.put("userHandle", companion.b64Encode(this.userHandle));
        return jSONObject;
    }

    public /* synthetic */ AuthenticatorAssertionResponse(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, byte[] bArr, String str, boolean z11, boolean z12, boolean z13, boolean z14, byte[] bArr2, String str2, byte[] bArr3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(publicKeyCredentialRequestOptions, bArr, str, z11, z12, z13, z14, bArr2, (i11 & 256) != 0 ? null : str2, (i11 & 512) != 0 ? null : bArr3);
    }
}
