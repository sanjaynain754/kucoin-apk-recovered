package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NewGuideBannerEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/assets/entity/NewGuideBannerEntity;", "Landroid/os/Parcelable;", "title", "", "content", "resourceUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getContent", "getResourceUrl", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class NewGuideBannerEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NewGuideBannerEntity> CREATOR = new Creator();

    @NotNull
    private final String content;

    @NotNull
    private final String resourceUrl;

    @NotNull
    private final String title;

    /* JADX INFO: compiled from: NewGuideBannerEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<NewGuideBannerEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewGuideBannerEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NewGuideBannerEntity(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewGuideBannerEntity[] newArray(int i11) {
            return new NewGuideBannerEntity[i11];
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
        if (!(other instanceof NewGuideBannerEntity)) {
            return false;
        }
        NewGuideBannerEntity newGuideBannerEntity = (NewGuideBannerEntity) other;
        return Intrinsics.areEqual(this.title, newGuideBannerEntity.title) && Intrinsics.areEqual(this.content, newGuideBannerEntity.content) && Intrinsics.areEqual(this.resourceUrl, newGuideBannerEntity.resourceUrl);
    }

    public NewGuideBannerEntity(@NotNull String title, @NotNull String content, @NotNull String resourceUrl) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(resourceUrl, "resourceUrl");
        this.title = title;
        this.content = content;
        this.resourceUrl = resourceUrl;
    }

    public static /* synthetic */ NewGuideBannerEntity copy$default(NewGuideBannerEntity newGuideBannerEntity, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = newGuideBannerEntity.title;
        }
        if ((i11 & 2) != 0) {
            str2 = newGuideBannerEntity.content;
        }
        if ((i11 & 4) != 0) {
            str3 = newGuideBannerEntity.resourceUrl;
        }
        return newGuideBannerEntity.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getResourceUrl() {
        return this.resourceUrl;
    }

    @NotNull
    public final NewGuideBannerEntity copy(@NotNull String title, @NotNull String content, @NotNull String resourceUrl) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(resourceUrl, "resourceUrl");
        return new NewGuideBannerEntity(title, content, resourceUrl);
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final String getResourceUrl() {
        return this.resourceUrl;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.content.hashCode()) * 31) + this.resourceUrl.hashCode();
    }

    @NotNull
    public String toString() {
        return "NewGuideBannerEntity(title=" + this.title + ", content=" + this.content + ", resourceUrl=" + this.resourceUrl + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.content);
        dest.writeString(this.resourceUrl);
    }
}
