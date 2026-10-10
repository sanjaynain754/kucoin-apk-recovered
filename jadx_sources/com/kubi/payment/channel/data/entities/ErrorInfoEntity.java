package com.kubi.payment.channel.data.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ErrorInfoEntity.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0010R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/payment/channel/data/entities/ErrorInfoEntity;", "Landroid/os/Parcelable;", "code", "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getMessage", "needEdd", "", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ErrorInfoEntity implements Parcelable {

    @NotNull
    public static final String NEED_EDD = "NEED_EDD";

    @SerializedName("code")
    @Nullable
    private final String code;

    @SerializedName("msg")
    @Nullable
    private final String message;

    @NotNull
    public static final Parcelable.Creator<ErrorInfoEntity> CREATOR = new C20323a();

    /* JADX INFO: renamed from: com.kubi.payment.channel.data.entities.ErrorInfoEntity$a */
    /* JADX INFO: compiled from: ErrorInfoEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20323a implements Parcelable.Creator<ErrorInfoEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ErrorInfoEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ErrorInfoEntity(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ErrorInfoEntity[] newArray(int i11) {
            return new ErrorInfoEntity[i11];
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
        if (!(other instanceof ErrorInfoEntity)) {
            return false;
        }
        ErrorInfoEntity errorInfoEntity = (ErrorInfoEntity) other;
        return Intrinsics.areEqual(this.code, errorInfoEntity.code) && Intrinsics.areEqual(this.message, errorInfoEntity.message);
    }

    public static /* synthetic */ ErrorInfoEntity copy$default(ErrorInfoEntity errorInfoEntity, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = errorInfoEntity.code;
        }
        if ((i11 & 2) != 0) {
            str2 = errorInfoEntity.message;
        }
        return errorInfoEntity.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final ErrorInfoEntity copy(@Nullable String code, @Nullable String message) {
        return new ErrorInfoEntity(code, message);
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean needEdd() {
        return Intrinsics.areEqual(this.code, NEED_EDD);
    }

    @NotNull
    public String toString() {
        return "ErrorInfoEntity(code=" + this.code + ", message=" + this.message + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.code);
        dest.writeString(this.message);
    }

    public ErrorInfoEntity(@Nullable String str, @Nullable String str2) {
        this.code = str;
        this.message = str2;
    }
}
