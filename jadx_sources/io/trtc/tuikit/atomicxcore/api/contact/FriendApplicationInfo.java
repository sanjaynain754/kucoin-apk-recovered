package io.trtc.tuikit.atomicxcore.api.contact;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.MimeTypes;
import com.tencent.imsdk.p128v2.V2TIMFriendApplication;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39391a;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39392b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\u000e\u0010!\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\"J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003JW\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020+HÖ\u0001J\t\u00101\u001a\u00020\u0005HÖ\u0001J\u0019\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020+HÖ\u0001R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u00067"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/contact/FriendApplicationInfo;", "Landroid/os/Parcelable;", MimeTypes.BASE_TYPE_APPLICATION, "Lcom/tencent/imsdk/v2/V2TIMFriendApplication;", "applicationID", "", "avatarURL", "title", "source", "type", "Lio/trtc/tuikit/atomicxcore/api/contact/FriendApplicationType;", "addWording", "(Lcom/tencent/imsdk/v2/V2TIMFriendApplication;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/contact/FriendApplicationType;Ljava/lang/String;)V", "getAddWording", "()Ljava/lang/String;", "setAddWording", "(Ljava/lang/String;)V", "getApplication$atomicxcore_release", "()Lcom/tencent/imsdk/v2/V2TIMFriendApplication;", "setApplication$atomicxcore_release", "(Lcom/tencent/imsdk/v2/V2TIMFriendApplication;)V", "getApplicationID", "setApplicationID", "getAvatarURL", "setAvatarURL", "getSource", "setSource", "getTitle", "setTitle", "getType", "()Lio/trtc/tuikit/atomicxcore/api/contact/FriendApplicationType;", "setType", "(Lio/trtc/tuikit/atomicxcore/api/contact/FriendApplicationType;)V", "component1", "component1$atomicxcore_release", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class FriendApplicationInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FriendApplicationInfo> CREATOR = new Creator();

    @Nullable
    private String addWording;

    @NotNull
    private V2TIMFriendApplication application;

    @NotNull
    private String applicationID;

    @Nullable
    private String avatarURL;

    @Nullable
    private String source;

    @Nullable
    private String title;

    @NotNull
    private FriendApplicationType type;

    @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FriendApplicationInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FriendApplicationInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FriendApplicationInfo((V2TIMFriendApplication) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), FriendApplicationType.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FriendApplicationInfo[] newArray(int i11) {
            return new FriendApplicationInfo[i11];
        }
    }

    public FriendApplicationInfo(@NotNull V2TIMFriendApplication application, @NotNull String applicationID, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull FriendApplicationType type, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(applicationID, "applicationID");
        Intrinsics.checkNotNullParameter(type, "type");
        this.application = application;
        this.applicationID = applicationID;
        this.avatarURL = str;
        this.title = str2;
        this.source = str3;
        this.type = type;
        this.addWording = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FriendApplicationInfo)) {
            return false;
        }
        FriendApplicationInfo friendApplicationInfo = (FriendApplicationInfo) other;
        return Intrinsics.areEqual(this.application, friendApplicationInfo.application) && Intrinsics.areEqual(this.applicationID, friendApplicationInfo.applicationID) && Intrinsics.areEqual(this.avatarURL, friendApplicationInfo.avatarURL) && Intrinsics.areEqual(this.title, friendApplicationInfo.title) && Intrinsics.areEqual(this.source, friendApplicationInfo.source) && this.type == friendApplicationInfo.type && Intrinsics.areEqual(this.addWording, friendApplicationInfo.addWording);
    }

    public static /* synthetic */ FriendApplicationInfo copy$default(FriendApplicationInfo friendApplicationInfo, V2TIMFriendApplication v2TIMFriendApplication, String str, String str2, String str3, String str4, FriendApplicationType friendApplicationType, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            v2TIMFriendApplication = friendApplicationInfo.application;
        }
        if ((i11 & 2) != 0) {
            str = friendApplicationInfo.applicationID;
        }
        if ((i11 & 4) != 0) {
            str2 = friendApplicationInfo.avatarURL;
        }
        if ((i11 & 8) != 0) {
            str3 = friendApplicationInfo.title;
        }
        if ((i11 & 16) != 0) {
            str4 = friendApplicationInfo.source;
        }
        if ((i11 & 32) != 0) {
            friendApplicationType = friendApplicationInfo.type;
        }
        if ((i11 & 64) != 0) {
            str5 = friendApplicationInfo.addWording;
        }
        FriendApplicationType friendApplicationType2 = friendApplicationType;
        String str6 = str5;
        String str7 = str4;
        String str8 = str2;
        return friendApplicationInfo.copy(v2TIMFriendApplication, str, str8, str3, str7, friendApplicationType2, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1$atomicxcore_release, reason: from getter */
    public final V2TIMFriendApplication getApplication() {
        return this.application;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getApplicationID() {
        return this.applicationID;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAvatarURL() {
        return this.avatarURL;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final FriendApplicationType getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAddWording() {
        return this.addWording;
    }

    @NotNull
    public final FriendApplicationInfo copy(@NotNull V2TIMFriendApplication application, @NotNull String applicationID, @Nullable String avatarURL, @Nullable String title, @Nullable String source, @NotNull FriendApplicationType type, @Nullable String addWording) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(applicationID, "applicationID");
        Intrinsics.checkNotNullParameter(type, "type");
        return new FriendApplicationInfo(application, applicationID, avatarURL, title, source, type, addWording);
    }

    @Nullable
    public final String getAddWording() {
        return this.addWording;
    }

    @NotNull
    public final V2TIMFriendApplication getApplication$atomicxcore_release() {
        return this.application;
    }

    @NotNull
    public final String getApplicationID() {
        return this.applicationID;
    }

    @Nullable
    public final String getAvatarURL() {
        return this.avatarURL;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final FriendApplicationType getType() {
        return this.type;
    }

    public int hashCode() {
        int iM88220a = AbstractC39391a.m88220a(this.applicationID, this.application.hashCode() * 31, 31);
        String str = this.avatarURL;
        int iHashCode = (iM88220a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.source;
        int iHashCode3 = (this.type.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.addWording;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setAddWording(@Nullable String str) {
        this.addWording = str;
    }

    public final void setApplication$atomicxcore_release(@NotNull V2TIMFriendApplication v2TIMFriendApplication) {
        Intrinsics.checkNotNullParameter(v2TIMFriendApplication, "<set-?>");
        this.application = v2TIMFriendApplication;
    }

    public final void setApplicationID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.applicationID = str;
    }

    public final void setAvatarURL(@Nullable String str) {
        this.avatarURL = str;
    }

    public final void setSource(@Nullable String str) {
        this.source = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setType(@NotNull FriendApplicationType friendApplicationType) {
        Intrinsics.checkNotNullParameter(friendApplicationType, "<set-?>");
        this.type = friendApplicationType;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FriendApplicationInfo(application=");
        sb2.append(this.application);
        sb2.append(", applicationID=");
        sb2.append(this.applicationID);
        sb2.append(", avatarURL=");
        sb2.append(this.avatarURL);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", source=");
        sb2.append(this.source);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", addWording=");
        return AbstractC39392b.m88221a(sb2, this.addWording, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeSerializable(this.application);
        parcel.writeString(this.applicationID);
        parcel.writeString(this.avatarURL);
        parcel.writeString(this.title);
        parcel.writeString(this.source);
        parcel.writeString(this.type.name());
        parcel.writeString(this.addWording);
    }

    public /* synthetic */ FriendApplicationInfo(V2TIMFriendApplication v2TIMFriendApplication, String str, String str2, String str3, String str4, FriendApplicationType friendApplicationType, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(v2TIMFriendApplication, str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, friendApplicationType, (i11 & 64) != 0 ? null : str5);
    }
}
