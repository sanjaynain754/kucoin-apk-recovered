package com.kubi.p110rn.modules.command.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PhotoModel.kt */
/* JADX INFO: loaded from: classes39.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0006\u0010\u001f\u001a\u00020\u0005J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006+"}, m90084d2 = {"Lcom/kubi/rn/modules/command/model/PhotoModel;", "Landroid/os/Parcelable;", "uri", "", "width", "", "height", "size", "", "type", TypedValues.TransitionType.S_DURATION, "", "<init>", "(Ljava/lang/String;IIDLjava/lang/String;J)V", "getUri", "()Ljava/lang/String;", "getWidth", "()I", "getHeight", "getSize", "()D", "getType", "getDuration", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PhotoModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PhotoModel> CREATOR = new Creator();
    private final long duration;
    private final int height;
    private final double size;

    @NotNull
    private final String type;

    @NotNull
    private final String uri;
    private final int width;

    /* JADX INFO: compiled from: PhotoModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<PhotoModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhotoModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PhotoModel(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readDouble(), parcel.readString(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhotoModel[] newArray(int i11) {
            return new PhotoModel[i11];
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
        if (!(other instanceof PhotoModel)) {
            return false;
        }
        PhotoModel photoModel = (PhotoModel) other;
        return Intrinsics.areEqual(this.uri, photoModel.uri) && this.width == photoModel.width && this.height == photoModel.height && Double.compare(this.size, photoModel.size) == 0 && Intrinsics.areEqual(this.type, photoModel.type) && this.duration == photoModel.duration;
    }

    public PhotoModel(@NotNull String uri, int i11, int i12, double d11, @NotNull String type, long j11) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(type, "type");
        this.uri = uri;
        this.width = i11;
        this.height = i12;
        this.size = d11;
        this.type = type;
        this.duration = j11;
    }

    public static /* synthetic */ PhotoModel copy$default(PhotoModel photoModel, String str, int i11, int i12, double d11, String str2, long j11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = photoModel.uri;
        }
        if ((i13 & 2) != 0) {
            i11 = photoModel.width;
        }
        if ((i13 & 4) != 0) {
            i12 = photoModel.height;
        }
        if ((i13 & 8) != 0) {
            d11 = photoModel.size;
        }
        if ((i13 & 16) != 0) {
            str2 = photoModel.type;
        }
        if ((i13 & 32) != 0) {
            j11 = photoModel.duration;
        }
        String str3 = str2;
        double d12 = d11;
        int i14 = i12;
        return photoModel.copy(str, i11, i14, d12, str3, j11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getSize() {
        return this.size;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    public final PhotoModel copy(@NotNull String uri, int width, int height, double size, @NotNull String type, long duration) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(type, "type");
        return new PhotoModel(uri, width, height, size, type, duration);
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getHeight() {
        return this.height;
    }

    public final double getSize() {
        return this.size;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getUri() {
        return this.uri;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((((((this.uri.hashCode() * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Double.hashCode(this.size)) * 31) + this.type.hashCode()) * 31) + Long.hashCode(this.duration);
    }

    @NotNull
    public String toString() {
        return "PhotoModel(uri=" + this.uri + ", width=" + this.width + ", height=" + this.height + ", size=" + this.size + ", type=" + this.type + ", duration=" + this.duration + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.uri);
        dest.writeInt(this.width);
        dest.writeInt(this.height);
        dest.writeDouble(this.size);
        dest.writeString(this.type);
        dest.writeLong(this.duration);
    }
}
