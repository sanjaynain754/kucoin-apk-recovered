package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.internal.C5760c;
import com.facebook.internal.ImageRequest;
import com.google.android.gms.common.Scopes;
import com.google.firebase.messaging.Constants;
import com.kubi.kyc.KycKey;
import com.kubi.user.protocol.entity.SignTermItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p333i6.C38457p;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Profile.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 *2\u00020\u0001:\u0001*BO\b\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bB\u000f\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eB\u000f\b\u0012\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\u0016\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001cJ\b\u0010$\u001a\u00020\u001cH\u0016J\b\u0010%\u001a\u0004\u0018\u00010\rJ\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u001cH\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017¨\u0006+"}, m90084d2 = {"Lcom/facebook/Profile;", "Landroid/os/Parcelable;", "id", "", KycKey.firstName, "middleName", KycKey.lastName, "name", "linkUri", "Landroid/net/Uri;", "pictureUri", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;)V", "jsonObject", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getFirstName", "()Ljava/lang/String;", "getId", "getLastName", "getLinkUri", "()Landroid/net/Uri;", "getMiddleName", "getName", "getPictureUri", "describeContents", "", "equals", "", "other", "", "getProfilePictureUri", "width", "height", "hashCode", "toJSONObject", "writeToParcel", "", "dest", "flags", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class Profile implements Parcelable {

    @NotNull
    private static final String FIRST_NAME_KEY = "first_name";

    @NotNull
    private static final String ID_KEY = "id";

    @NotNull
    private static final String LAST_NAME_KEY = "last_name";

    @NotNull
    private static final String LINK_URI_KEY = "link_uri";

    @NotNull
    private static final String MIDDLE_NAME_KEY = "middle_name";

    @NotNull
    private static final String NAME_KEY = "name";

    @NotNull
    private static final String PICTURE_URI_KEY = "picture_uri";

    @Nullable
    private final String firstName;

    @Nullable
    private final String id;

    @Nullable
    private final String lastName;

    @Nullable
    private final Uri linkUri;

    @Nullable
    private final String middleName;

    @Nullable
    private final String name;

    @Nullable
    private final Uri pictureUri;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = Profile.class.getSimpleName();

    @JvmField
    @NotNull
    public static final Parcelable.Creator<Profile> CREATOR = new C5500a();

    /* JADX INFO: compiled from: Profile.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0007J\u0012\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u000f*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/facebook/Profile$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/Profile;", "FIRST_NAME_KEY", "", "ID_KEY", "LAST_NAME_KEY", "LINK_URI_KEY", "MIDDLE_NAME_KEY", "NAME_KEY", "PICTURE_URI_KEY", "TAG", "kotlin.jvm.PlatformType", "fetchProfileForCurrentAccessToken", "", "getCurrentProfile", "setCurrentProfile", Scopes.PROFILE, "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: com.facebook.Profile$Companion$a */
        /* JADX INFO: compiled from: Profile.kt */
        @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"com/facebook/Profile$Companion$a", "Lcom/facebook/internal/c$a;", "Lorg/json/JSONObject;", "userInfo", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lorg/json/JSONObject;)V", "Lcom/facebook/FacebookException;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "b", "(Lcom/facebook/FacebookException;)V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
        public static final class C5499a implements C5760c.a {
            @Override // com.facebook.internal.C5760c.a
            /* JADX INFO: renamed from: a */
            public void mo7558a(@Nullable JSONObject userInfo) {
                String strOptString = userInfo != null ? userInfo.optString("id") : null;
                if (strOptString == null) {
                    Log.w(Profile.TAG, "No user ID returned on Me request");
                    return;
                }
                String strOptString2 = userInfo.optString(SignTermItem.LINK);
                String strOptString3 = userInfo.optString("profile_picture", null);
                Profile.INSTANCE.setCurrentProfile(new Profile(strOptString, userInfo.optString(Profile.FIRST_NAME_KEY), userInfo.optString("middle_name"), userInfo.optString(Profile.LAST_NAME_KEY), userInfo.optString("name"), strOptString2 != null ? Uri.parse(strOptString2) : null, strOptString3 != null ? Uri.parse(strOptString3) : null));
            }

            @Override // com.facebook.internal.C5760c.a
            /* JADX INFO: renamed from: b */
            public void mo7559b(@Nullable FacebookException error) {
                Log.e(Profile.TAG, "Got unexpected exception: " + error);
            }
        }

        public Companion() {
        }

        @JvmStatic
        public final void fetchProfileForCurrentAccessToken() {
            AccessToken.Companion companion = AccessToken.INSTANCE;
            AccessToken currentAccessToken = companion.getCurrentAccessToken();
            if (currentAccessToken == null) {
                return;
            }
            if (companion.isCurrentAccessTokenActive()) {
                C5760c.m10044F(currentAccessToken.getToken(), new C5499a());
            } else {
                setCurrentProfile(null);
            }
        }

        @JvmStatic
        @Nullable
        public final Profile getCurrentProfile() {
            return ProfileManager.INSTANCE.getInstance().getCurrentProfileField();
        }

        @JvmStatic
        public final void setCurrentProfile(@Nullable Profile profile) {
            ProfileManager.INSTANCE.getInstance().m7763f(profile);
        }
    }

    /* JADX INFO: renamed from: com.facebook.Profile$a */
    /* JADX INFO: compiled from: Profile.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"com/facebook/Profile$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/Profile;", "Landroid/os/Parcel;", "source", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/os/Parcel;)Lcom/facebook/Profile;", "", "size", "", "b", "(I)[Lcom/facebook/Profile;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C5500a implements Parcelable.Creator<Profile> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Profile[] newArray(int size) {
            return new Profile[size];
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Profile createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new Profile(source, null);
        }
    }

    public /* synthetic */ Profile(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof Profile)) {
            return false;
        }
        String str5 = this.id;
        return ((str5 == null && ((Profile) other).id == null) || Intrinsics.areEqual(str5, ((Profile) other).id)) && (((str = this.firstName) == null && ((Profile) other).firstName == null) || Intrinsics.areEqual(str, ((Profile) other).firstName)) && ((((str2 = this.middleName) == null && ((Profile) other).middleName == null) || Intrinsics.areEqual(str2, ((Profile) other).middleName)) && ((((str3 = this.lastName) == null && ((Profile) other).lastName == null) || Intrinsics.areEqual(str3, ((Profile) other).lastName)) && ((((str4 = this.name) == null && ((Profile) other).name == null) || Intrinsics.areEqual(str4, ((Profile) other).name)) && ((((uri = this.linkUri) == null && ((Profile) other).linkUri == null) || Intrinsics.areEqual(uri, ((Profile) other).linkUri)) && (((uri2 = this.pictureUri) == null && ((Profile) other).pictureUri == null) || Intrinsics.areEqual(uri2, ((Profile) other).pictureUri))))));
    }

    @JvmOverloads
    public Profile(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Uri uri) {
        this(str, str2, str3, str4, str5, uri, null, 64, null);
    }

    @JvmStatic
    public static final void fetchProfileForCurrentAccessToken() {
        INSTANCE.fetchProfileForCurrentAccessToken();
    }

    @JvmStatic
    @Nullable
    public static final Profile getCurrentProfile() {
        return INSTANCE.getCurrentProfile();
    }

    @JvmStatic
    public static final void setCurrentProfile(@Nullable Profile profile) {
        INSTANCE.setCurrentProfile(profile);
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    public final Uri getLinkUri() {
        return this.linkUri;
    }

    @Nullable
    public final String getMiddleName() {
        return this.middleName;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Uri getPictureUri() {
        return this.pictureUri;
    }

    @NotNull
    public final Uri getProfilePictureUri(int width, int height) {
        String token;
        Uri uri = this.pictureUri;
        if (uri != null) {
            return uri;
        }
        AccessToken.Companion companion = AccessToken.INSTANCE;
        if (companion.isCurrentAccessTokenActive()) {
            AccessToken currentAccessToken = companion.getCurrentAccessToken();
            token = currentAccessToken != null ? currentAccessToken.getToken() : null;
        } else {
            token = "";
        }
        return ImageRequest.INSTANCE.getProfilePictureUri(this.id, width, height, token);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = 527 + (str != null ? str.hashCode() : 0);
        String str2 = this.firstName;
        if (str2 != null) {
            iHashCode = (iHashCode * 31) + str2.hashCode();
        }
        String str3 = this.middleName;
        if (str3 != null) {
            iHashCode = (iHashCode * 31) + str3.hashCode();
        }
        String str4 = this.lastName;
        if (str4 != null) {
            iHashCode = (iHashCode * 31) + str4.hashCode();
        }
        String str5 = this.name;
        if (str5 != null) {
            iHashCode = (iHashCode * 31) + str5.hashCode();
        }
        Uri uri = this.linkUri;
        if (uri != null) {
            iHashCode = (iHashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.pictureUri;
        return uri2 != null ? (iHashCode * 31) + uri2.hashCode() : iHashCode;
    }

    @Nullable
    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.id);
            jSONObject.put(FIRST_NAME_KEY, this.firstName);
            jSONObject.put("middle_name", this.middleName);
            jSONObject.put(LAST_NAME_KEY, this.lastName);
            jSONObject.put("name", this.name);
            Uri uri = this.linkUri;
            if (uri != null) {
                jSONObject.put(LINK_URI_KEY, uri.toString());
            }
            Uri uri2 = this.pictureUri;
            if (uri2 != null) {
                jSONObject.put(PICTURE_URI_KEY, uri2.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.firstName);
        dest.writeString(this.middleName);
        dest.writeString(this.lastName);
        dest.writeString(this.name);
        Uri uri = this.linkUri;
        dest.writeString(uri != null ? uri.toString() : null);
        Uri uri2 = this.pictureUri;
        dest.writeString(uri2 != null ? uri2.toString() : null);
    }

    public /* synthetic */ Profile(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, uri, (i11 & 64) != 0 ? null : uri2);
    }

    @JvmOverloads
    public Profile(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Uri uri, @Nullable Uri uri2) {
        C38457p.m86729h(str, "id");
        this.id = str;
        this.firstName = str2;
        this.middleName = str3;
        this.lastName = str4;
        this.name = str5;
        this.linkUri = uri;
        this.pictureUri = uri2;
    }

    public Profile(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.id = jsonObject.optString("id", null);
        this.firstName = jsonObject.optString(FIRST_NAME_KEY, null);
        this.middleName = jsonObject.optString("middle_name", null);
        this.lastName = jsonObject.optString(LAST_NAME_KEY, null);
        this.name = jsonObject.optString("name", null);
        String strOptString = jsonObject.optString(LINK_URI_KEY, null);
        this.linkUri = strOptString == null ? null : Uri.parse(strOptString);
        String strOptString2 = jsonObject.optString(PICTURE_URI_KEY, null);
        this.pictureUri = strOptString2 != null ? Uri.parse(strOptString2) : null;
    }

    private Profile(Parcel parcel) {
        this.id = parcel.readString();
        this.firstName = parcel.readString();
        this.middleName = parcel.readString();
        this.lastName = parcel.readString();
        this.name = parcel.readString();
        String string = parcel.readString();
        this.linkUri = string == null ? null : Uri.parse(string);
        String string2 = parcel.readString();
        this.pictureUri = string2 != null ? Uri.parse(string2) : null;
    }
}
