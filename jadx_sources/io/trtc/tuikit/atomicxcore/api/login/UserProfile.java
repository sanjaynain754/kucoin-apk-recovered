package io.trtc.tuikit.atomicxcore.api.login;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0012\n\u0002\b1\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0002\u0010\u0013J\t\u00106\u001a\u00020\u0003HÆ\u0003J\u0017\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010=\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010>\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010?\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0090\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010AJ\t\u0010B\u001a\u00020\nHÖ\u0001J\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u00020\nHÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001J\u0019\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\nHÖ\u0001R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0019\"\u0004\b/\u0010\u001bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\b0\u0010*\"\u0004\b1\u0010,R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0019\"\u0004\b3\u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0019\"\u0004\b5\u0010\u001b¨\u0006N"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;", "Landroid/os/Parcelable;", "userID", "", "nickname", "avatarURL", TUIConstants.TUILogin.SELF_SIGNATURE, HintConstants.AUTOFILL_HINT_GENDER, "Lio/trtc/tuikit/atomicxcore/api/login/Gender;", ViewProps.ROLE, "", FirebaseAnalytics.Param.LEVEL, "birthday", "", "allowType", "Lio/trtc/tuikit/atomicxcore/api/login/AllowType;", TUIConstantDefine.CUSTOM_INFO, "", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/login/Gender;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Lio/trtc/tuikit/atomicxcore/api/login/AllowType;Ljava/util/Map;)V", "getAllowType", "()Lio/trtc/tuikit/atomicxcore/api/login/AllowType;", "setAllowType", "(Lio/trtc/tuikit/atomicxcore/api/login/AllowType;)V", "getAvatarURL", "()Ljava/lang/String;", "setAvatarURL", "(Ljava/lang/String;)V", "getBirthday", "()Ljava/lang/Long;", "setBirthday", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCustomInfo", "()Ljava/util/Map;", "setCustomInfo", "(Ljava/util/Map;)V", "getGender", "()Lio/trtc/tuikit/atomicxcore/api/login/Gender;", "setGender", "(Lio/trtc/tuikit/atomicxcore/api/login/Gender;)V", "getLevel", "()Ljava/lang/Integer;", "setLevel", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getNickname", "setNickname", "getRole", "setRole", "getSelfSignature", "setSelfSignature", "getUserID", "setUserID", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/login/Gender;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Lio/trtc/tuikit/atomicxcore/api/login/AllowType;Ljava/util/Map;)Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class UserProfile implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UserProfile> CREATOR = new Creator();

    @Nullable
    private AllowType allowType;

    @Nullable
    private String avatarURL;

    @Nullable
    private Long birthday;

    @Nullable
    private Map<String, byte[]> customInfo;

    @Nullable
    private Gender gender;

    @Nullable
    private Integer level;

    @Nullable
    private String nickname;

    @Nullable
    private Integer role;

    @Nullable
    private String selfSignature;

    @NotNull
    private String userID;

    @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<UserProfile> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UserProfile createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            LinkedHashMap linkedHashMap = null;
            Gender genderValueOf = parcel.readInt() == 0 ? null : Gender.valueOf(parcel.readString());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            AllowType allowTypeValueOf = parcel.readInt() == 0 ? null : AllowType.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                int i11 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashMap.put(parcel.readString(), parcel.createByteArray());
                }
            }
            return new UserProfile(string, string2, string3, string4, genderValueOf, numValueOf, numValueOf2, lValueOf, allowTypeValueOf, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UserProfile[] newArray(int i11) {
            return new UserProfile[i11];
        }
    }

    public UserProfile() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserProfile)) {
            return false;
        }
        UserProfile userProfile = (UserProfile) other;
        return Intrinsics.areEqual(this.userID, userProfile.userID) && Intrinsics.areEqual(this.nickname, userProfile.nickname) && Intrinsics.areEqual(this.avatarURL, userProfile.avatarURL) && Intrinsics.areEqual(this.selfSignature, userProfile.selfSignature) && this.gender == userProfile.gender && Intrinsics.areEqual(this.role, userProfile.role) && Intrinsics.areEqual(this.level, userProfile.level) && Intrinsics.areEqual(this.birthday, userProfile.birthday) && this.allowType == userProfile.allowType && Intrinsics.areEqual(this.customInfo, userProfile.customInfo);
    }

    public UserProfile(@NotNull String userID, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Gender gender, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l11, @Nullable AllowType allowType, @Nullable Map<String, byte[]> map) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        this.userID = userID;
        this.nickname = str;
        this.avatarURL = str2;
        this.selfSignature = str3;
        this.gender = gender;
        this.role = num;
        this.level = num2;
        this.birthday = l11;
        this.allowType = allowType;
        this.customInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserProfile copy$default(UserProfile userProfile, String str, String str2, String str3, String str4, Gender gender, Integer num, Integer num2, Long l11, AllowType allowType, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = userProfile.userID;
        }
        if ((i11 & 2) != 0) {
            str2 = userProfile.nickname;
        }
        if ((i11 & 4) != 0) {
            str3 = userProfile.avatarURL;
        }
        if ((i11 & 8) != 0) {
            str4 = userProfile.selfSignature;
        }
        if ((i11 & 16) != 0) {
            gender = userProfile.gender;
        }
        if ((i11 & 32) != 0) {
            num = userProfile.role;
        }
        if ((i11 & 64) != 0) {
            num2 = userProfile.level;
        }
        if ((i11 & 128) != 0) {
            l11 = userProfile.birthday;
        }
        if ((i11 & 256) != 0) {
            allowType = userProfile.allowType;
        }
        if ((i11 & 512) != 0) {
            map = userProfile.customInfo;
        }
        AllowType allowType2 = allowType;
        Map map2 = map;
        Integer num3 = num2;
        Long l12 = l11;
        Gender gender2 = gender;
        Integer num4 = num;
        return userProfile.copy(str, str2, str3, str4, gender2, num4, num3, l12, allowType2, map2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserID() {
        return this.userID;
    }

    @Nullable
    public final Map<String, byte[]> component10() {
        return this.customInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAvatarURL() {
        return this.avatarURL;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSelfSignature() {
        return this.selfSignature;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Gender getGender() {
        return this.gender;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getRole() {
        return this.role;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getLevel() {
        return this.level;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getBirthday() {
        return this.birthday;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final AllowType getAllowType() {
        return this.allowType;
    }

    @Nullable
    public final AllowType getAllowType() {
        return this.allowType;
    }

    @Nullable
    public final String getAvatarURL() {
        return this.avatarURL;
    }

    @Nullable
    public final Long getBirthday() {
        return this.birthday;
    }

    @Nullable
    public final Map<String, byte[]> getCustomInfo() {
        return this.customInfo;
    }

    @Nullable
    public final Gender getGender() {
        return this.gender;
    }

    @Nullable
    public final Integer getLevel() {
        return this.level;
    }

    @Nullable
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    public final Integer getRole() {
        return this.role;
    }

    @Nullable
    public final String getSelfSignature() {
        return this.selfSignature;
    }

    @NotNull
    public final String getUserID() {
        return this.userID;
    }

    public int hashCode() {
        int iHashCode = this.userID.hashCode() * 31;
        String str = this.nickname;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatarURL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.selfSignature;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Gender gender = this.gender;
        int iHashCode5 = (iHashCode4 + (gender == null ? 0 : gender.hashCode())) * 31;
        Integer num = this.role;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.level;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l11 = this.birthday;
        int iHashCode8 = (iHashCode7 + (l11 == null ? 0 : l11.hashCode())) * 31;
        AllowType allowType = this.allowType;
        int iHashCode9 = (iHashCode8 + (allowType == null ? 0 : allowType.hashCode())) * 31;
        Map<String, byte[]> map = this.customInfo;
        return iHashCode9 + (map != null ? map.hashCode() : 0);
    }

    public final void setAllowType(@Nullable AllowType allowType) {
        this.allowType = allowType;
    }

    public final void setAvatarURL(@Nullable String str) {
        this.avatarURL = str;
    }

    public final void setBirthday(@Nullable Long l11) {
        this.birthday = l11;
    }

    public final void setCustomInfo(@Nullable Map<String, byte[]> map) {
        this.customInfo = map;
    }

    public final void setGender(@Nullable Gender gender) {
        this.gender = gender;
    }

    public final void setLevel(@Nullable Integer num) {
        this.level = num;
    }

    public final void setNickname(@Nullable String str) {
        this.nickname = str;
    }

    public final void setRole(@Nullable Integer num) {
        this.role = num;
    }

    public final void setSelfSignature(@Nullable String str) {
        this.selfSignature = str;
    }

    public final void setUserID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userID = str;
    }

    @NotNull
    public String toString() {
        return "UserProfile(userID=" + this.userID + ", nickname=" + this.nickname + ", avatarURL=" + this.avatarURL + ", selfSignature=" + this.selfSignature + ", gender=" + this.gender + ", role=" + this.role + ", level=" + this.level + ", birthday=" + this.birthday + ", allowType=" + this.allowType + ", customInfo=" + this.customInfo + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.userID);
        parcel.writeString(this.nickname);
        parcel.writeString(this.avatarURL);
        parcel.writeString(this.selfSignature);
        Gender gender = this.gender;
        if (gender == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(gender.name());
        }
        Integer num = this.role;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.level;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Long l11 = this.birthday;
        if (l11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l11.longValue());
        }
        AllowType allowType = this.allowType;
        if (allowType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(allowType.name());
        }
        Map<String, byte[]> map = this.customInfo;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeByteArray(entry.getValue());
        }
    }

    @NotNull
    public final UserProfile copy(@NotNull String userID, @Nullable String nickname, @Nullable String avatarURL, @Nullable String selfSignature, @Nullable Gender gender, @Nullable Integer role, @Nullable Integer level, @Nullable Long birthday, @Nullable AllowType allowType, @Nullable Map<String, byte[]> customInfo) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        return new UserProfile(userID, nickname, avatarURL, selfSignature, gender, role, level, birthday, allowType, customInfo);
    }

    public /* synthetic */ UserProfile(String str, String str2, String str3, String str4, Gender gender, Integer num, Integer num2, Long l11, AllowType allowType, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : gender, (i11 & 32) != 0 ? null : num, (i11 & 64) != 0 ? null : num2, (i11 & 128) != 0 ? null : l11, (i11 & 256) != 0 ? null : allowType, (i11 & 512) != 0 ? null : map);
    }
}
