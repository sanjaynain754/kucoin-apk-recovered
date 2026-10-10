package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.internal.C5760c;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p333i6.C38457p;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.IntCompanionObject;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.Charsets;

/* JADX INFO: compiled from: AuthenticationTokenClaims.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 L2\u00020\u0001:\u0001LB\u0017\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0085\u0002\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018\u0012\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001eB\u000f\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020 ¢\u0006\u0002\u0010!J\b\u0010;\u001a\u00020\u0019H\u0016J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0096\u0002J\b\u0010@\u001a\u00020\u0019H\u0016J\u0018\u0010A\u001a\u00020=2\u0006\u0010B\u001a\u00020C2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010D\u001a\u00020\u0003H\u0007J\r\u0010E\u001a\u00020CH\u0001¢\u0006\u0002\bFJ\b\u0010G\u001a\u00020\u0003H\u0016J\u0018\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020 2\u0006\u0010K\u001a\u00020\u0019H\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u001f\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010#R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u000104¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010#R\u001f\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b8\u00102R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010#R\u001f\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b:\u00102¨\u0006M"}, m90084d2 = {"Lcom/facebook/AuthenticationTokenClaims;", "Landroid/os/Parcelable;", "encodedClaims", "", "expectedNonce", "(Ljava/lang/String;Ljava/lang/String;)V", AuthenticationTokenClaims.JSON_KEY_JIT, AuthenticationTokenClaims.JSON_KEY_ISS, AuthenticationTokenClaims.JSON_KEY_AUD, AuthenticationTokenClaims.JSON_KEY_NONCE, AuthenticationTokenClaims.JSON_KEY_EXP, "", AuthenticationTokenClaims.JSON_KEY_IAT, AuthenticationTokenClaims.JSON_KEY_SUB, "name", "givenName", "middleName", "familyName", "email", "picture", "userFriends", "", "userBirthday", "userAgeRange", "", "", "userHometown", "userLocation", "userGender", "userLink", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getAud", "()Ljava/lang/String;", "getEmail", "getExp", "()J", "getFamilyName", "getGivenName", "getIat", "getIss", "getJti", "getMiddleName", "getName", "getNonce", "getPicture", "getSub", "getUserAgeRange", "()Ljava/util/Map;", "getUserBirthday", "", "getUserFriends", "()Ljava/util/Set;", "getUserGender", "getUserHometown", "getUserLink", "getUserLocation", "describeContents", "equals", "", "other", "", "hashCode", "isValidClaims", "claimsJson", "Lorg/json/JSONObject;", "toEnCodedString", "toJSONObject", "toJSONObject$facebook_core_release", "toString", "writeToParcel", "", "dest", "flags", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAuthenticationTokenClaims.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthenticationTokenClaims.kt\ncom/facebook/AuthenticationTokenClaims\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,585:1\n1#2:586\n*E\n"})
public final class AuthenticationTokenClaims implements Parcelable {

    @NotNull
    public static final String JSON_KEY_AUD = "aud";

    @NotNull
    public static final String JSON_KEY_EMAIL = "email";

    @NotNull
    public static final String JSON_KEY_EXP = "exp";

    @NotNull
    public static final String JSON_KEY_FAMILY_NAME = "family_name";

    @NotNull
    public static final String JSON_KEY_GIVEN_NAME = "given_name";

    @NotNull
    public static final String JSON_KEY_IAT = "iat";

    @NotNull
    public static final String JSON_KEY_ISS = "iss";

    @NotNull
    public static final String JSON_KEY_JIT = "jti";

    @NotNull
    public static final String JSON_KEY_MIDDLE_NAME = "middle_name";

    @NotNull
    public static final String JSON_KEY_NAME = "name";

    @NotNull
    public static final String JSON_KEY_NONCE = "nonce";

    @NotNull
    public static final String JSON_KEY_PICTURE = "picture";

    @NotNull
    public static final String JSON_KEY_SUB = "sub";

    @NotNull
    public static final String JSON_KEY_USER_AGE_RANGE = "user_age_range";

    @NotNull
    public static final String JSON_KEY_USER_BIRTHDAY = "user_birthday";

    @NotNull
    public static final String JSON_KEY_USER_FRIENDS = "user_friends";

    @NotNull
    public static final String JSON_KEY_USER_GENDER = "user_gender";

    @NotNull
    public static final String JSON_KEY_USER_HOMETOWN = "user_hometown";

    @NotNull
    public static final String JSON_KEY_USER_LINK = "user_link";

    @NotNull
    public static final String JSON_KEY_USER_LOCATION = "user_location";
    public static final long MAX_TIME_SINCE_TOKEN_ISSUED = 600000;

    @NotNull
    private final String aud;

    @Nullable
    private final String email;
    private final long exp;

    @Nullable
    private final String familyName;

    @Nullable
    private final String givenName;
    private final long iat;

    @NotNull
    private final String iss;

    @NotNull
    private final String jti;

    @Nullable
    private final String middleName;

    @Nullable
    private final String name;

    @NotNull
    private final String nonce;

    @Nullable
    private final String picture;

    @NotNull
    private final String sub;

    @Nullable
    private final Map<String, Integer> userAgeRange;

    @Nullable
    private final String userBirthday;

    @Nullable
    private final Set<String> userFriends;

    @Nullable
    private final String userGender;

    @Nullable
    private final Map<String, String> userHometown;

    @Nullable
    private final String userLink;

    @Nullable
    private final Map<String, String> userLocation;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<AuthenticationTokenClaims> CREATOR = new C5483a();

    /* JADX INFO: compiled from: AuthenticationTokenClaims.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b J\u001b\u0010!\u001a\u0004\u0018\u00010\u0007*\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0007H\u0000¢\u0006\u0002\b#R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0086T¢\u0006\u0002\n\u0000¨\u0006$"}, m90084d2 = {"Lcom/facebook/AuthenticationTokenClaims$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AuthenticationTokenClaims;", "JSON_KEY_AUD", "", "JSON_KEY_EMAIL", "JSON_KEY_EXP", "JSON_KEY_FAMILY_NAME", "JSON_KEY_GIVEN_NAME", "JSON_KEY_IAT", "JSON_KEY_ISS", "JSON_KEY_JIT", "JSON_KEY_MIDDLE_NAME", "JSON_KEY_NAME", "JSON_KEY_NONCE", "JSON_KEY_PICTURE", "JSON_KEY_SUB", "JSON_KEY_USER_AGE_RANGE", "JSON_KEY_USER_BIRTHDAY", "JSON_KEY_USER_FRIENDS", "JSON_KEY_USER_GENDER", "JSON_KEY_USER_HOMETOWN", "JSON_KEY_USER_LINK", "JSON_KEY_USER_LOCATION", "MAX_TIME_SINCE_TOKEN_ISSUED", "", "createFromJSONObject", "jsonObject", "Lorg/json/JSONObject;", "createFromJSONObject$facebook_core_release", "getNullableString", "name", "getNullableString$facebook_core_release", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final AuthenticationTokenClaims createFromJSONObject$facebook_core_release(@NotNull JSONObject jsonObject) throws JSONException {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            String jti = jsonObject.getString(AuthenticationTokenClaims.JSON_KEY_JIT);
            String iss = jsonObject.getString(AuthenticationTokenClaims.JSON_KEY_ISS);
            String aud = jsonObject.getString(AuthenticationTokenClaims.JSON_KEY_AUD);
            String nonce = jsonObject.getString(AuthenticationTokenClaims.JSON_KEY_NONCE);
            long j11 = jsonObject.getLong(AuthenticationTokenClaims.JSON_KEY_EXP);
            long j12 = jsonObject.getLong(AuthenticationTokenClaims.JSON_KEY_IAT);
            String sub = jsonObject.getString(AuthenticationTokenClaims.JSON_KEY_SUB);
            String nullableString$facebook_core_release = getNullableString$facebook_core_release(jsonObject, "name");
            String nullableString$facebook_core_release2 = getNullableString$facebook_core_release(jsonObject, AuthenticationTokenClaims.JSON_KEY_GIVEN_NAME);
            String nullableString$facebook_core_release3 = getNullableString$facebook_core_release(jsonObject, AuthenticationTokenClaims.JSON_KEY_MIDDLE_NAME);
            String nullableString$facebook_core_release4 = getNullableString$facebook_core_release(jsonObject, AuthenticationTokenClaims.JSON_KEY_FAMILY_NAME);
            String nullableString$facebook_core_release5 = getNullableString$facebook_core_release(jsonObject, "email");
            String nullableString$facebook_core_release6 = getNullableString$facebook_core_release(jsonObject, "picture");
            JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray(AuthenticationTokenClaims.JSON_KEY_USER_FRIENDS);
            String nullableString$facebook_core_release7 = getNullableString$facebook_core_release(jsonObject, AuthenticationTokenClaims.JSON_KEY_USER_BIRTHDAY);
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject(AuthenticationTokenClaims.JSON_KEY_USER_AGE_RANGE);
            JSONObject jSONObjectOptJSONObject2 = jsonObject.optJSONObject(AuthenticationTokenClaims.JSON_KEY_USER_HOMETOWN);
            JSONObject jSONObjectOptJSONObject3 = jsonObject.optJSONObject(AuthenticationTokenClaims.JSON_KEY_USER_LOCATION);
            String nullableString$facebook_core_release8 = getNullableString$facebook_core_release(jsonObject, AuthenticationTokenClaims.JSON_KEY_USER_GENDER);
            String nullableString$facebook_core_release9 = getNullableString$facebook_core_release(jsonObject, AuthenticationTokenClaims.JSON_KEY_USER_LINK);
            Intrinsics.checkNotNullExpressionValue(jti, "jti");
            Intrinsics.checkNotNullExpressionValue(iss, "iss");
            Intrinsics.checkNotNullExpressionValue(aud, "aud");
            Intrinsics.checkNotNullExpressionValue(nonce, "nonce");
            Intrinsics.checkNotNullExpressionValue(sub, "sub");
            return new AuthenticationTokenClaims(jti, iss, aud, nonce, j11, j12, sub, nullableString$facebook_core_release, nullableString$facebook_core_release2, nullableString$facebook_core_release3, nullableString$facebook_core_release4, nullableString$facebook_core_release5, nullableString$facebook_core_release6, jSONArrayOptJSONArray == null ? null : C5760c.m10061b0(jSONArrayOptJSONArray), nullableString$facebook_core_release7, jSONObjectOptJSONObject == null ? null : C5760c.m10076n(jSONObjectOptJSONObject), jSONObjectOptJSONObject2 == null ? null : C5760c.m10077o(jSONObjectOptJSONObject2), jSONObjectOptJSONObject3 != null ? C5760c.m10077o(jSONObjectOptJSONObject3) : null, nullableString$facebook_core_release8, nullableString$facebook_core_release9);
        }

        @Nullable
        public final String getNullableString$facebook_core_release(@NotNull JSONObject jSONObject, @NotNull String name) {
            Intrinsics.checkNotNullParameter(jSONObject, "<this>");
            Intrinsics.checkNotNullParameter(name, "name");
            if (jSONObject.has(name)) {
                return jSONObject.getString(name);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.AuthenticationTokenClaims$a */
    /* JADX INFO: compiled from: AuthenticationTokenClaims.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"com/facebook/AuthenticationTokenClaims$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AuthenticationTokenClaims;", "Landroid/os/Parcel;", "source", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/os/Parcel;)Lcom/facebook/AuthenticationTokenClaims;", "", "size", "", "b", "(I)[Lcom/facebook/AuthenticationTokenClaims;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C5483a implements Parcelable.Creator<AuthenticationTokenClaims> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenClaims[] newArray(int size) {
            return new AuthenticationTokenClaims[size];
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenClaims createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new AuthenticationTokenClaims(source);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    @VisibleForTesting(otherwise = 2)
    public AuthenticationTokenClaims(@NotNull String jti, @NotNull String iss, @NotNull String aud, @NotNull String nonce, long j11, long j12, @NotNull String sub) {
        this(jti, iss, aud, nonce, j11, j12, sub, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048448, null);
        Intrinsics.checkNotNullParameter(jti, "jti");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(aud, "aud");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sub, "sub");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthenticationTokenClaims)) {
            return false;
        }
        AuthenticationTokenClaims authenticationTokenClaims = (AuthenticationTokenClaims) other;
        return Intrinsics.areEqual(this.jti, authenticationTokenClaims.jti) && Intrinsics.areEqual(this.iss, authenticationTokenClaims.iss) && Intrinsics.areEqual(this.aud, authenticationTokenClaims.aud) && Intrinsics.areEqual(this.nonce, authenticationTokenClaims.nonce) && this.exp == authenticationTokenClaims.exp && this.iat == authenticationTokenClaims.iat && Intrinsics.areEqual(this.sub, authenticationTokenClaims.sub) && Intrinsics.areEqual(this.name, authenticationTokenClaims.name) && Intrinsics.areEqual(this.givenName, authenticationTokenClaims.givenName) && Intrinsics.areEqual(this.middleName, authenticationTokenClaims.middleName) && Intrinsics.areEqual(this.familyName, authenticationTokenClaims.familyName) && Intrinsics.areEqual(this.email, authenticationTokenClaims.email) && Intrinsics.areEqual(this.picture, authenticationTokenClaims.picture) && Intrinsics.areEqual(this.userFriends, authenticationTokenClaims.userFriends) && Intrinsics.areEqual(this.userBirthday, authenticationTokenClaims.userBirthday) && Intrinsics.areEqual(this.userAgeRange, authenticationTokenClaims.userAgeRange) && Intrinsics.areEqual(this.userHometown, authenticationTokenClaims.userHometown) && Intrinsics.areEqual(this.userLocation, authenticationTokenClaims.userLocation) && Intrinsics.areEqual(this.userGender, authenticationTokenClaims.userGender) && Intrinsics.areEqual(this.userLink, authenticationTokenClaims.userLink);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    @VisibleForTesting(otherwise = 2)
    public AuthenticationTokenClaims(@NotNull String jti, @NotNull String iss, @NotNull String aud, @NotNull String nonce, long j11, long j12, @NotNull String sub, @Nullable String str) {
        this(jti, iss, aud, nonce, j11, j12, sub, str, null, null, null, null, null, null, null, null, null, null, null, null, 1048320, null);
        Intrinsics.checkNotNullParameter(jti, "jti");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(aud, "aud");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sub, "sub");
    }

    private final boolean isValidClaims(JSONObject claimsJson, String expectedNonce) {
        if (claimsJson == null) {
            return false;
        }
        String jti = claimsJson.optString(JSON_KEY_JIT);
        Intrinsics.checkNotNullExpressionValue(jti, "jti");
        if (jti.length() == 0) {
            return false;
        }
        try {
            String iss = claimsJson.optString(JSON_KEY_ISS);
            Intrinsics.checkNotNullExpressionValue(iss, "iss");
            if (iss.length() != 0 && (Intrinsics.areEqual(new URL(iss).getHost(), "facebook.com") || Intrinsics.areEqual(new URL(iss).getHost(), "www.facebook.com"))) {
                String aud = claimsJson.optString(JSON_KEY_AUD);
                Intrinsics.checkNotNullExpressionValue(aud, "aud");
                if (aud.length() == 0 || !Intrinsics.areEqual(aud, C5501a.m7800n())) {
                    return false;
                }
                long j11 = 1000;
                if (new Date().after(new Date(claimsJson.optLong(JSON_KEY_EXP) * j11))) {
                    return false;
                }
                if (new Date().after(new Date((claimsJson.optLong(JSON_KEY_IAT) * j11) + 600000))) {
                    return false;
                }
                String sub = claimsJson.optString(JSON_KEY_SUB);
                Intrinsics.checkNotNullExpressionValue(sub, "sub");
                if (sub.length() == 0) {
                    return false;
                }
                String nonce = claimsJson.optString(JSON_KEY_NONCE);
                Intrinsics.checkNotNullExpressionValue(nonce, "nonce");
                return nonce.length() != 0 && Intrinsics.areEqual(nonce, expectedNonce);
            }
            return false;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    @NotNull
    public final String getAud() {
        return this.aud;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    public final long getExp() {
        return this.exp;
    }

    @Nullable
    public final String getFamilyName() {
        return this.familyName;
    }

    @Nullable
    public final String getGivenName() {
        return this.givenName;
    }

    public final long getIat() {
        return this.iat;
    }

    @NotNull
    public final String getIss() {
        return this.iss;
    }

    @NotNull
    public final String getJti() {
        return this.jti;
    }

    @Nullable
    public final String getMiddleName() {
        return this.middleName;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getNonce() {
        return this.nonce;
    }

    @Nullable
    public final String getPicture() {
        return this.picture;
    }

    @NotNull
    public final String getSub() {
        return this.sub;
    }

    @Nullable
    public final Map<String, Integer> getUserAgeRange() {
        return this.userAgeRange;
    }

    @Nullable
    public final String getUserBirthday() {
        return this.userBirthday;
    }

    @Nullable
    public final Set<String> getUserFriends() {
        return this.userFriends;
    }

    @Nullable
    public final String getUserGender() {
        return this.userGender;
    }

    @Nullable
    public final Map<String, String> getUserHometown() {
        return this.userHometown;
    }

    @Nullable
    public final String getUserLink() {
        return this.userLink;
    }

    @Nullable
    public final Map<String, String> getUserLocation() {
        return this.userLocation;
    }

    public int hashCode() {
        int iHashCode = (((((((((((((527 + this.jti.hashCode()) * 31) + this.iss.hashCode()) * 31) + this.aud.hashCode()) * 31) + this.nonce.hashCode()) * 31) + Long.hashCode(this.exp)) * 31) + Long.hashCode(this.iat)) * 31) + this.sub.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.givenName;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.middleName;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.familyName;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.email;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.picture;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Set<String> set = this.userFriends;
        int iHashCode8 = (iHashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        String str7 = this.userBirthday;
        int iHashCode9 = (iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Map<String, Integer> map = this.userAgeRange;
        int iHashCode10 = (iHashCode9 + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, String> map2 = this.userHometown;
        int iHashCode11 = (iHashCode10 + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map<String, String> map3 = this.userLocation;
        int iHashCode12 = (iHashCode11 + (map3 != null ? map3.hashCode() : 0)) * 31;
        String str8 = this.userGender;
        int iHashCode13 = (iHashCode12 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.userLink;
        return iHashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    @VisibleForTesting(otherwise = 2)
    @NotNull
    public final JSONObject toJSONObject$facebook_core_release() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(JSON_KEY_JIT, this.jti);
        jSONObject.put(JSON_KEY_ISS, this.iss);
        jSONObject.put(JSON_KEY_AUD, this.aud);
        jSONObject.put(JSON_KEY_NONCE, this.nonce);
        jSONObject.put(JSON_KEY_EXP, this.exp);
        jSONObject.put(JSON_KEY_IAT, this.iat);
        String str = this.sub;
        if (str != null) {
            jSONObject.put(JSON_KEY_SUB, str);
        }
        String str2 = this.name;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.givenName;
        if (str3 != null) {
            jSONObject.put(JSON_KEY_GIVEN_NAME, str3);
        }
        String str4 = this.middleName;
        if (str4 != null) {
            jSONObject.put(JSON_KEY_MIDDLE_NAME, str4);
        }
        String str5 = this.familyName;
        if (str5 != null) {
            jSONObject.put(JSON_KEY_FAMILY_NAME, str5);
        }
        String str6 = this.email;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.picture;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        if (this.userFriends != null) {
            jSONObject.put(JSON_KEY_USER_FRIENDS, new JSONArray((Collection) this.userFriends));
        }
        String str8 = this.userBirthday;
        if (str8 != null) {
            jSONObject.put(JSON_KEY_USER_BIRTHDAY, str8);
        }
        if (this.userAgeRange != null) {
            jSONObject.put(JSON_KEY_USER_AGE_RANGE, new JSONObject(this.userAgeRange));
        }
        if (this.userHometown != null) {
            jSONObject.put(JSON_KEY_USER_HOMETOWN, new JSONObject(this.userHometown));
        }
        if (this.userLocation != null) {
            jSONObject.put(JSON_KEY_USER_LOCATION, new JSONObject(this.userLocation));
        }
        String str9 = this.userGender;
        if (str9 != null) {
            jSONObject.put(JSON_KEY_USER_GENDER, str9);
        }
        String str10 = this.userLink;
        if (str10 != null) {
            jSONObject.put(JSON_KEY_USER_LINK, str10);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.jti);
        dest.writeString(this.iss);
        dest.writeString(this.aud);
        dest.writeString(this.nonce);
        dest.writeLong(this.exp);
        dest.writeLong(this.iat);
        dest.writeString(this.sub);
        dest.writeString(this.name);
        dest.writeString(this.givenName);
        dest.writeString(this.middleName);
        dest.writeString(this.familyName);
        dest.writeString(this.email);
        dest.writeString(this.picture);
        if (this.userFriends == null) {
            dest.writeStringList(null);
        } else {
            dest.writeStringList(new ArrayList(this.userFriends));
        }
        dest.writeString(this.userBirthday);
        dest.writeMap(this.userAgeRange);
        dest.writeMap(this.userHometown);
        dest.writeMap(this.userLocation);
        dest.writeString(this.userGender);
        dest.writeString(this.userLink);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    @VisibleForTesting(otherwise = 2)
    public AuthenticationTokenClaims(@NotNull String jti, @NotNull String iss, @NotNull String aud, @NotNull String nonce, long j11, long j12, @NotNull String sub, @Nullable String str, @Nullable String str2) {
        this(jti, iss, aud, nonce, j11, j12, sub, str, str2, null, null, null, null, null, null, null, null, null, null, null, 1048064, null);
        Intrinsics.checkNotNullParameter(jti, "jti");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(aud, "aud");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sub, "sub");
    }

    @VisibleForTesting(otherwise = 2)
    @NotNull
    public final String toEnCodedString() {
        byte[] bytes = toString().getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        String strEncodeToString = Base64.encodeToString(bytes, 8);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(claimsJso…Array(), Base64.URL_SAFE)");
        return strEncodeToString;
    }

    @NotNull
    public String toString() {
        String string = toJSONObject$facebook_core_release().toString();
        Intrinsics.checkNotNullExpressionValue(string, "claimsJsonObject.toString()");
        return string;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    @VisibleForTesting(otherwise = 2)
    public AuthenticationTokenClaims(@NotNull String jti, @NotNull String iss, @NotNull String aud, @NotNull String nonce, long j11, long j12, @NotNull String sub, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this(jti, iss, aud, nonce, j11, j12, sub, str, str2, str3, null, null, null, null, null, null, null, null, null, null, 1047552, null);
        Intrinsics.checkNotNullParameter(jti, "jti");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(aud, "aud");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    @VisibleForTesting(otherwise = 2)
    public AuthenticationTokenClaims(@NotNull String jti, @NotNull String iss, @NotNull String aud, @NotNull String nonce, long j11, long j12, @NotNull String sub, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this(jti, iss, aud, nonce, j11, j12, sub, str, str2, str3, str4, null, null, null, null, null, null, null, null, null, 1046528, null);
        Intrinsics.checkNotNullParameter(jti, "jti");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(aud, "aud");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    @VisibleForTesting(otherwise = 2)
    public AuthenticationTokenClaims(@NotNull String jti, @NotNull String iss, @NotNull String aud, @NotNull String nonce, long j11, long j12, @NotNull String sub, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this(jti, iss, aud, nonce, j11, j12, sub, str, str2, str3, str4, str5, null, null, null, null, null, null, null, null, 1044480, null);
        Intrinsics.checkNotNullParameter(jti, "jti");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(aud, "aud");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    @VisibleForTesting(otherwise = 2)
    public AuthenticationTokenClaims(@NotNull String jti, @NotNull String iss, @NotNull String aud, @NotNull String nonce, long j11, long j12, @NotNull String sub, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this(jti, iss, aud, nonce, j11, j12, sub, str, str2, str3, str4, str5, str6, null, null, null, null, null, null, null, 1040384, null);
        Intrinsics.checkNotNullParameter(jti, "jti");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(aud, "aud");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    @VisibleForTesting(otherwise = 2)
    public AuthenticationTokenClaims(@NotNull String jti, @NotNull String iss, @NotNull String aud, @NotNull String nonce, long j11, long j12, @NotNull String sub, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Collection<String> collection) {
        this(jti, iss, aud, nonce, j11, j12, sub, str, str2, str3, str4, str5, str6, collection, null, null, null, null, null, null, 1032192, null);
        Intrinsics.checkNotNullParameter(jti, "jti");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(aud, "aud");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    @VisibleForTesting(otherwise = 2)
    public AuthenticationTokenClaims(@NotNull String jti, @NotNull String iss, @NotNull String aud, @NotNull String nonce, long j11, long j12, @NotNull String sub, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Collection<String> collection, @Nullable String str7) {
        this(jti, iss, aud, nonce, j11, j12, sub, str, str2, str3, str4, str5, str6, collection, str7, null, null, null, null, null, 1015808, null);
        Intrinsics.checkNotNullParameter(jti, "jti");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(aud, "aud");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    @VisibleForTesting(otherwise = 2)
    public AuthenticationTokenClaims(@NotNull String jti, @NotNull String iss, @NotNull String aud, @NotNull String nonce, long j11, long j12, @NotNull String sub, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Collection<String> collection, @Nullable String str7, @Nullable Map<String, Integer> map) {
        this(jti, iss, aud, nonce, j11, j12, sub, str, str2, str3, str4, str5, str6, collection, str7, map, null, null, null, null, 983040, null);
        Intrinsics.checkNotNullParameter(jti, "jti");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(aud, "aud");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    @VisibleForTesting(otherwise = 2)
    public AuthenticationTokenClaims(@NotNull String jti, @NotNull String iss, @NotNull String aud, @NotNull String nonce, long j11, long j12, @NotNull String sub, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Collection<String> collection, @Nullable String str7, @Nullable Map<String, Integer> map, @Nullable Map<String, String> map2) {
        this(jti, iss, aud, nonce, j11, j12, sub, str, str2, str3, str4, str5, str6, collection, str7, map, map2, null, null, null, 917504, null);
        Intrinsics.checkNotNullParameter(jti, "jti");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(aud, "aud");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    @VisibleForTesting(otherwise = 2)
    public AuthenticationTokenClaims(@NotNull String jti, @NotNull String iss, @NotNull String aud, @NotNull String nonce, long j11, long j12, @NotNull String sub, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Collection<String> collection, @Nullable String str7, @Nullable Map<String, Integer> map, @Nullable Map<String, String> map2, @Nullable Map<String, String> map3) {
        this(jti, iss, aud, nonce, j11, j12, sub, str, str2, str3, str4, str5, str6, collection, str7, map, map2, map3, null, null, 786432, null);
        Intrinsics.checkNotNullParameter(jti, "jti");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(aud, "aud");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    @VisibleForTesting(otherwise = 2)
    public AuthenticationTokenClaims(@NotNull String jti, @NotNull String iss, @NotNull String aud, @NotNull String nonce, long j11, long j12, @NotNull String sub, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Collection<String> collection, @Nullable String str7, @Nullable Map<String, Integer> map, @Nullable Map<String, String> map2, @Nullable Map<String, String> map3, @Nullable String str8) {
        this(jti, iss, aud, nonce, j11, j12, sub, str, str2, str3, str4, str5, str6, collection, str7, map, map2, map3, str8, null, 524288, null);
        Intrinsics.checkNotNullParameter(jti, "jti");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(aud, "aud");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sub, "sub");
    }

    @JvmOverloads
    public AuthenticationTokenClaims(@NotNull String encodedClaims, @NotNull String expectedNonce) throws JSONException {
        Intrinsics.checkNotNullParameter(encodedClaims, "encodedClaims");
        Intrinsics.checkNotNullParameter(expectedNonce, "expectedNonce");
        C38457p.m86725d(encodedClaims, "encodedClaims");
        byte[] decodedBytes = Base64.decode(encodedClaims, 8);
        Intrinsics.checkNotNullExpressionValue(decodedBytes, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decodedBytes, Charsets.UTF_8));
        if (isValidClaims(jSONObject, expectedNonce)) {
            String string = jSONObject.getString(JSON_KEY_JIT);
            Intrinsics.checkNotNullExpressionValue(string, "jsonObj.getString(JSON_KEY_JIT)");
            this.jti = string;
            String string2 = jSONObject.getString(JSON_KEY_ISS);
            Intrinsics.checkNotNullExpressionValue(string2, "jsonObj.getString(JSON_KEY_ISS)");
            this.iss = string2;
            String string3 = jSONObject.getString(JSON_KEY_AUD);
            Intrinsics.checkNotNullExpressionValue(string3, "jsonObj.getString(JSON_KEY_AUD)");
            this.aud = string3;
            String string4 = jSONObject.getString(JSON_KEY_NONCE);
            Intrinsics.checkNotNullExpressionValue(string4, "jsonObj.getString(JSON_KEY_NONCE)");
            this.nonce = string4;
            this.exp = jSONObject.getLong(JSON_KEY_EXP);
            this.iat = jSONObject.getLong(JSON_KEY_IAT);
            String string5 = jSONObject.getString(JSON_KEY_SUB);
            Intrinsics.checkNotNullExpressionValue(string5, "jsonObj.getString(JSON_KEY_SUB)");
            this.sub = string5;
            Companion companion = INSTANCE;
            this.name = companion.getNullableString$facebook_core_release(jSONObject, "name");
            this.givenName = companion.getNullableString$facebook_core_release(jSONObject, JSON_KEY_GIVEN_NAME);
            this.middleName = companion.getNullableString$facebook_core_release(jSONObject, JSON_KEY_MIDDLE_NAME);
            this.familyName = companion.getNullableString$facebook_core_release(jSONObject, JSON_KEY_FAMILY_NAME);
            this.email = companion.getNullableString$facebook_core_release(jSONObject, "email");
            this.picture = companion.getNullableString$facebook_core_release(jSONObject, "picture");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(JSON_KEY_USER_FRIENDS);
            this.userFriends = jSONArrayOptJSONArray == null ? null : Collections.unmodifiableSet(C5760c.m10059a0(jSONArrayOptJSONArray));
            this.userBirthday = companion.getNullableString$facebook_core_release(jSONObject, JSON_KEY_USER_BIRTHDAY);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(JSON_KEY_USER_AGE_RANGE);
            this.userAgeRange = jSONObjectOptJSONObject == null ? null : Collections.unmodifiableMap(C5760c.m10076n(jSONObjectOptJSONObject));
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(JSON_KEY_USER_HOMETOWN);
            this.userHometown = jSONObjectOptJSONObject2 == null ? null : Collections.unmodifiableMap(C5760c.m10077o(jSONObjectOptJSONObject2));
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject(JSON_KEY_USER_LOCATION);
            this.userLocation = jSONObjectOptJSONObject3 != null ? Collections.unmodifiableMap(C5760c.m10077o(jSONObjectOptJSONObject3)) : null;
            this.userGender = companion.getNullableString$facebook_core_release(jSONObject, JSON_KEY_USER_GENDER);
            this.userLink = companion.getNullableString$facebook_core_release(jSONObject, JSON_KEY_USER_LINK);
            return;
        }
        throw new IllegalArgumentException("Invalid claims");
    }

    public /* synthetic */ AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j11, long j12, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Collection collection, String str12, Map map, Map map2, Map map3, String str13, String str14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, j11, j12, str5, (i11 & 128) != 0 ? null : str6, (i11 & 256) != 0 ? null : str7, (i11 & 512) != 0 ? null : str8, (i11 & 1024) != 0 ? null : str9, (i11 & 2048) != 0 ? null : str10, (i11 & 4096) != 0 ? null : str11, (i11 & 8192) != 0 ? null : collection, (i11 & 16384) != 0 ? null : str12, (32768 & i11) != 0 ? null : map, (65536 & i11) != 0 ? null : map2, (131072 & i11) != 0 ? null : map3, (262144 & i11) != 0 ? null : str13, (i11 & 524288) != 0 ? null : str14);
    }

    @JvmOverloads
    @VisibleForTesting(otherwise = 2)
    public AuthenticationTokenClaims(@NotNull String jti, @NotNull String iss, @NotNull String aud, @NotNull String nonce, long j11, long j12, @NotNull String sub, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Collection<String> collection, @Nullable String str7, @Nullable Map<String, Integer> map, @Nullable Map<String, String> map2, @Nullable Map<String, String> map3, @Nullable String str8, @Nullable String str9) {
        Intrinsics.checkNotNullParameter(jti, "jti");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(aud, "aud");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sub, "sub");
        C38457p.m86725d(jti, JSON_KEY_JIT);
        C38457p.m86725d(iss, JSON_KEY_ISS);
        C38457p.m86725d(aud, JSON_KEY_AUD);
        C38457p.m86725d(nonce, JSON_KEY_NONCE);
        C38457p.m86725d(sub, JSON_KEY_SUB);
        this.jti = jti;
        this.iss = iss;
        this.aud = aud;
        this.nonce = nonce;
        this.exp = j11;
        this.iat = j12;
        this.sub = sub;
        this.name = str;
        this.givenName = str2;
        this.middleName = str3;
        this.familyName = str4;
        this.email = str5;
        this.picture = str6;
        this.userFriends = collection != null ? Collections.unmodifiableSet(new HashSet(collection)) : null;
        this.userBirthday = str7;
        this.userAgeRange = map != null ? Collections.unmodifiableMap(new HashMap(map)) : null;
        this.userHometown = map2 != null ? Collections.unmodifiableMap(new HashMap(map2)) : null;
        this.userLocation = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
        this.userGender = str8;
        this.userLink = str9;
    }

    public AuthenticationTokenClaims(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.jti = C38457p.m86729h(parcel.readString(), JSON_KEY_JIT);
        this.iss = C38457p.m86729h(parcel.readString(), JSON_KEY_ISS);
        this.aud = C38457p.m86729h(parcel.readString(), JSON_KEY_AUD);
        this.nonce = C38457p.m86729h(parcel.readString(), JSON_KEY_NONCE);
        this.exp = parcel.readLong();
        this.iat = parcel.readLong();
        this.sub = C38457p.m86729h(parcel.readString(), JSON_KEY_SUB);
        this.name = parcel.readString();
        this.givenName = parcel.readString();
        this.middleName = parcel.readString();
        this.familyName = parcel.readString();
        this.email = parcel.readString();
        this.picture = parcel.readString();
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        this.userFriends = arrayListCreateStringArrayList != null ? Collections.unmodifiableSet(new HashSet(arrayListCreateStringArrayList)) : null;
        this.userBirthday = parcel.readString();
        HashMap hashMap = parcel.readHashMap(IntCompanionObject.INSTANCE.getClass().getClassLoader());
        hashMap = hashMap == null ? null : hashMap;
        this.userAgeRange = hashMap != null ? Collections.unmodifiableMap(hashMap) : null;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        HashMap hashMap2 = parcel.readHashMap(stringCompanionObject.getClass().getClassLoader());
        hashMap2 = hashMap2 == null ? null : hashMap2;
        this.userHometown = hashMap2 != null ? Collections.unmodifiableMap(hashMap2) : null;
        HashMap hashMap3 = parcel.readHashMap(stringCompanionObject.getClass().getClassLoader());
        hashMap3 = hashMap3 == null ? null : hashMap3;
        this.userLocation = hashMap3 != null ? Collections.unmodifiableMap(hashMap3) : null;
        this.userGender = parcel.readString();
        this.userLink = parcel.readString();
    }
}
