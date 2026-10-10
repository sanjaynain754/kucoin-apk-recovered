package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p333i6.C38457p;
import p550q6.C43637c;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: AuthenticationToken.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 +2\u00020\u0001:\u0001+B\u0017\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u000f\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u000f\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020\u001aH\u0016J(\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003H\u0002J\r\u0010%\u001a\u00020\nH\u0000¢\u0006\u0002\b&J\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u001aH\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006,"}, m90084d2 = {"Lcom/facebook/AuthenticationToken;", "Landroid/os/Parcelable;", InterfaceC33826o0.f71244p, "", "expectedNonce", "(Ljava/lang/String;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "jsonObject", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", AuthenticationToken.CLAIMS_KEY, "Lcom/facebook/AuthenticationTokenClaims;", "getClaims", "()Lcom/facebook/AuthenticationTokenClaims;", "getExpectedNonce", "()Ljava/lang/String;", AuthenticationToken.HEADER_KEY, "Lcom/facebook/AuthenticationTokenHeader;", "getHeader", "()Lcom/facebook/AuthenticationTokenHeader;", "signature", "getSignature", "getToken", "describeContents", "", "equals", "", "other", "", "hashCode", "isValidSignature", "headerString", "claimsString", "sigString", "kid", "toJSONObject", "toJSONObject$facebook_core_release", "writeToParcel", "", "dest", "flags", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAuthenticationToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthenticationToken.kt\ncom/facebook/AuthenticationToken\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n1#2:213\n*E\n"})
public final class AuthenticationToken implements Parcelable {

    @NotNull
    public static final String AUTHENTICATION_TOKEN_KEY = "id_token";

    @NotNull
    private static final String CLAIMS_KEY = "claims";

    @NotNull
    private static final String EXPECTED_NONCE_KEY = "expected_nonce";

    @NotNull
    private static final String HEADER_KEY = "header";

    @NotNull
    private static final String SIGNATURE_KEY = "signature";

    @NotNull
    private static final String TOKEN_STRING_KEY = "token_string";

    @NotNull
    private final AuthenticationTokenClaims claims;

    @NotNull
    private final String expectedNonce;

    @NotNull
    private final AuthenticationTokenHeader header;

    @NotNull
    private final String signature;

    @NotNull
    private final String token;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<AuthenticationToken> CREATOR = new C5482a();

    /* JADX INFO: compiled from: AuthenticationToken.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\r\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/facebook/AuthenticationToken$Companion;", "", "()V", "AUTHENTICATION_TOKEN_KEY", "", "CLAIMS_KEY", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AuthenticationToken;", "EXPECTED_NONCE_KEY", "HEADER_KEY", "SIGNATURE_KEY", "TOKEN_STRING_KEY", "getCurrentAuthenticationToken", "setCurrentAuthenticationToken", "", "authenticationToken", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @Nullable
        public final AuthenticationToken getCurrentAuthenticationToken() {
            return AuthenticationTokenManager.INSTANCE.getInstance().getCurrentAuthenticationTokenField();
        }

        @JvmStatic
        public final void setCurrentAuthenticationToken(@Nullable AuthenticationToken authenticationToken) {
            AuthenticationTokenManager.INSTANCE.getInstance().m7624e(authenticationToken);
        }
    }

    /* JADX INFO: renamed from: com.facebook.AuthenticationToken$a */
    /* JADX INFO: compiled from: AuthenticationToken.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"com/facebook/AuthenticationToken$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AuthenticationToken;", "Landroid/os/Parcel;", "source", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/os/Parcel;)Lcom/facebook/AuthenticationToken;", "", "size", "", "b", "(I)[Lcom/facebook/AuthenticationToken;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C5482a implements Parcelable.Creator<AuthenticationToken> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AuthenticationToken[] newArray(int size) {
            return new AuthenticationToken[size];
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AuthenticationToken createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new AuthenticationToken(source);
        }
    }

    @JvmOverloads
    public AuthenticationToken(@NotNull String token, @NotNull String expectedNonce) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(expectedNonce, "expectedNonce");
        C38457p.m86725d(token, InterfaceC33826o0.f71244p);
        C38457p.m86725d(expectedNonce, "expectedNonce");
        List listSplit$default = StringsKt.split$default((CharSequence) token, new String[]{C33978va.f72339h}, false, 0, 6, (Object) null);
        if (listSplit$default.size() != 3) {
            throw new IllegalArgumentException("Invalid IdToken string");
        }
        String str = (String) listSplit$default.get(0);
        String str2 = (String) listSplit$default.get(1);
        String str3 = (String) listSplit$default.get(2);
        this.token = token;
        this.expectedNonce = expectedNonce;
        AuthenticationTokenHeader authenticationTokenHeader = new AuthenticationTokenHeader(str);
        this.header = authenticationTokenHeader;
        this.claims = new AuthenticationTokenClaims(str2, expectedNonce);
        if (!isValidSignature(str, str2, str3, authenticationTokenHeader.getKid())) {
            throw new IllegalArgumentException("Invalid Signature");
        }
        this.signature = str3;
    }

    private final boolean isValidSignature(String headerString, String claimsString, String sigString, String kid) {
        try {
            String strM96034c = C43637c.m96034c(kid);
            if (strM96034c == null) {
                return false;
            }
            return C43637c.m96036e(C43637c.m96033b(strM96034c), headerString + '.' + claimsString, sigString);
        } catch (IOException | InvalidKeySpecException unused) {
            return false;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthenticationToken)) {
            return false;
        }
        AuthenticationToken authenticationToken = (AuthenticationToken) other;
        return Intrinsics.areEqual(this.token, authenticationToken.token) && Intrinsics.areEqual(this.expectedNonce, authenticationToken.expectedNonce) && Intrinsics.areEqual(this.header, authenticationToken.header) && Intrinsics.areEqual(this.claims, authenticationToken.claims) && Intrinsics.areEqual(this.signature, authenticationToken.signature);
    }

    @JvmStatic
    @Nullable
    public static final AuthenticationToken getCurrentAuthenticationToken() {
        return INSTANCE.getCurrentAuthenticationToken();
    }

    @JvmStatic
    public static final void setCurrentAuthenticationToken(@Nullable AuthenticationToken authenticationToken) {
        INSTANCE.setCurrentAuthenticationToken(authenticationToken);
    }

    @NotNull
    public final AuthenticationTokenClaims getClaims() {
        return this.claims;
    }

    @NotNull
    public final String getExpectedNonce() {
        return this.expectedNonce;
    }

    @NotNull
    public final AuthenticationTokenHeader getHeader() {
        return this.header;
    }

    @NotNull
    public final String getSignature() {
        return this.signature;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return ((((((((527 + this.token.hashCode()) * 31) + this.expectedNonce.hashCode()) * 31) + this.header.hashCode()) * 31) + this.claims.hashCode()) * 31) + this.signature.hashCode();
    }

    @NotNull
    public final JSONObject toJSONObject$facebook_core_release() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TOKEN_STRING_KEY, this.token);
        jSONObject.put(EXPECTED_NONCE_KEY, this.expectedNonce);
        jSONObject.put(HEADER_KEY, this.header.toJSONObject$facebook_core_release());
        jSONObject.put(CLAIMS_KEY, this.claims.toJSONObject$facebook_core_release());
        jSONObject.put("signature", this.signature);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.token);
        dest.writeString(this.expectedNonce);
        dest.writeParcelable(this.header, flags);
        dest.writeParcelable(this.claims, flags);
        dest.writeString(this.signature);
    }

    public AuthenticationToken(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.token = C38457p.m86729h(parcel.readString(), InterfaceC33826o0.f71244p);
        this.expectedNonce = C38457p.m86729h(parcel.readString(), "expectedNonce");
        Parcelable parcelable = parcel.readParcelable(AuthenticationTokenHeader.class.getClassLoader());
        if (parcelable != null) {
            this.header = (AuthenticationTokenHeader) parcelable;
            Parcelable parcelable2 = parcel.readParcelable(AuthenticationTokenClaims.class.getClassLoader());
            if (parcelable2 != null) {
                this.claims = (AuthenticationTokenClaims) parcelable2;
                this.signature = C38457p.m86729h(parcel.readString(), "signature");
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public AuthenticationToken(@NotNull JSONObject jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String string = jsonObject.getString(TOKEN_STRING_KEY);
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(TOKEN_STRING_KEY)");
        this.token = string;
        String string2 = jsonObject.getString(EXPECTED_NONCE_KEY);
        Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(EXPECTED_NONCE_KEY)");
        this.expectedNonce = string2;
        String string3 = jsonObject.getString("signature");
        Intrinsics.checkNotNullExpressionValue(string3, "jsonObject.getString(SIGNATURE_KEY)");
        this.signature = string3;
        JSONObject headerJSONObject = jsonObject.getJSONObject(HEADER_KEY);
        JSONObject claimsJSONObject = jsonObject.getJSONObject(CLAIMS_KEY);
        Intrinsics.checkNotNullExpressionValue(headerJSONObject, "headerJSONObject");
        this.header = new AuthenticationTokenHeader(headerJSONObject);
        AuthenticationTokenClaims.Companion companion = AuthenticationTokenClaims.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(claimsJSONObject, "claimsJSONObject");
        this.claims = companion.createFromJSONObject$facebook_core_release(claimsJSONObject);
    }
}
