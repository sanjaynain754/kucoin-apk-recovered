package com.kubi.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketBean.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/data/entity/ContentEntity;", "Landroid/os/Parcelable;", "zh_CN", "", "en_US", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getZh_CN", "()Ljava/lang/String;", "getEn_US", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ContentEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ContentEntity> CREATOR = new Creator();

    @NotNull
    private final String en_US;

    @Nullable
    private final String zh_CN;

    /* JADX INFO: compiled from: MarketBean.kt */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<ContentEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContentEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ContentEntity(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContentEntity[] newArray(int i11) {
            return new ContentEntity[i11];
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
        if (!(other instanceof ContentEntity)) {
            return false;
        }
        ContentEntity contentEntity = (ContentEntity) other;
        return Intrinsics.areEqual(this.zh_CN, contentEntity.zh_CN) && Intrinsics.areEqual(this.en_US, contentEntity.en_US);
    }

    public ContentEntity(@Nullable String str, @NotNull String en_US) {
        Intrinsics.checkNotNullParameter(en_US, "en_US");
        this.zh_CN = str;
        this.en_US = en_US;
    }

    public static /* synthetic */ ContentEntity copy$default(ContentEntity contentEntity, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = contentEntity.zh_CN;
        }
        if ((i11 & 2) != 0) {
            str2 = contentEntity.en_US;
        }
        return contentEntity.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getZh_CN() {
        return this.zh_CN;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEn_US() {
        return this.en_US;
    }

    @NotNull
    public final ContentEntity copy(@Nullable String zh_CN, @NotNull String en_US) {
        Intrinsics.checkNotNullParameter(en_US, "en_US");
        return new ContentEntity(zh_CN, en_US);
    }

    @NotNull
    public final String getEn_US() {
        return this.en_US;
    }

    @Nullable
    public final String getZh_CN() {
        return this.zh_CN;
    }

    public int hashCode() {
        String str = this.zh_CN;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.en_US.hashCode();
    }

    @NotNull
    public String toString() {
        return "ContentEntity(zh_CN=" + this.zh_CN + ", en_US=" + this.en_US + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.zh_CN);
        dest.writeString(this.en_US);
    }
}
