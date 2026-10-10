package com.kubi.mine.lib.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.user.protocol.entity.SignTermItem;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SocialMediaEntity.kt */
/* JADX INFO: loaded from: classes29.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006%"}, m90084d2 = {"Lcom/kubi/mine/lib/entity/SocialMediaEntity;", "Landroid/os/Parcelable;", TUIConstants.TUIChat.INPUT_MORE_ICON, "", "title", SignTermItem.LINK, "platform", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Ljava/lang/String;", "setIcon", "(Ljava/lang/String;)V", "getTitle", "setTitle", "getLink", "setLink", "getPlatform", "setPlatform", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SocialMediaEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SocialMediaEntity> CREATOR = new C18935a();

    @Nullable
    private String icon;

    @NotNull
    private String link;

    @Nullable
    private String platform;

    @Nullable
    private String title;

    /* JADX INFO: renamed from: com.kubi.mine.lib.entity.SocialMediaEntity$a */
    /* JADX INFO: compiled from: SocialMediaEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18935a implements Parcelable.Creator<SocialMediaEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SocialMediaEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SocialMediaEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SocialMediaEntity[] newArray(int i11) {
            return new SocialMediaEntity[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialMediaEntity)) {
            return false;
        }
        SocialMediaEntity socialMediaEntity = (SocialMediaEntity) other;
        return Intrinsics.areEqual(this.icon, socialMediaEntity.icon) && Intrinsics.areEqual(this.title, socialMediaEntity.title) && Intrinsics.areEqual(this.link, socialMediaEntity.link) && Intrinsics.areEqual(this.platform, socialMediaEntity.platform);
    }

    public SocialMediaEntity(@Nullable String str, @Nullable String str2, @NotNull String link, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(link, "link");
        this.icon = str;
        this.title = str2;
        this.link = link;
        this.platform = str3;
    }

    public static /* synthetic */ SocialMediaEntity copy$default(SocialMediaEntity socialMediaEntity, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = socialMediaEntity.icon;
        }
        if ((i11 & 2) != 0) {
            str2 = socialMediaEntity.title;
        }
        if ((i11 & 4) != 0) {
            str3 = socialMediaEntity.link;
        }
        if ((i11 & 8) != 0) {
            str4 = socialMediaEntity.platform;
        }
        return socialMediaEntity.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    @NotNull
    public final SocialMediaEntity copy(@Nullable String icon, @Nullable String title, @NotNull String link, @Nullable String platform) {
        Intrinsics.checkNotNullParameter(link, "link");
        return new SocialMediaEntity(icon, title, link, platform);
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getPlatform() {
        return this.platform;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.icon;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.link.hashCode()) * 31;
        String str3 = this.platform;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setLink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.link = str;
    }

    public final void setPlatform(@Nullable String str) {
        this.platform = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "SocialMediaEntity(icon=" + this.icon + ", title=" + this.title + ", link=" + this.link + ", platform=" + this.platform + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.icon);
        dest.writeString(this.title);
        dest.writeString(this.link);
        dest.writeString(this.platform);
    }
}
