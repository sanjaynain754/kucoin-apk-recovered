package com.kubi.kumex.data.platform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RestPwdEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0003J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006!"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/RestPwdEntity;", "Landroid/os/Parcelable;", "status", "", "reason", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getReason", "()Ljava/lang/String;", "setReason", "(Ljava/lang/String;)V", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/kubi/kumex/data/platform/model/RestPwdEntity;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RestPwdEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RestPwdEntity> CREATOR = new C15822a();

    @Nullable
    private String reason;

    @Nullable
    private Integer status;

    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.RestPwdEntity$a */
    /* JADX INFO: compiled from: RestPwdEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15822a implements Parcelable.Creator<RestPwdEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RestPwdEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RestPwdEntity(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RestPwdEntity[] newArray(int i11) {
            return new RestPwdEntity[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RestPwdEntity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestPwdEntity)) {
            return false;
        }
        RestPwdEntity restPwdEntity = (RestPwdEntity) other;
        return Intrinsics.areEqual(this.status, restPwdEntity.status) && Intrinsics.areEqual(this.reason, restPwdEntity.reason);
    }

    public RestPwdEntity(@Nullable Integer num, @Nullable String str) {
        this.status = num;
        this.reason = str;
    }

    public static /* synthetic */ RestPwdEntity copy$default(RestPwdEntity restPwdEntity, Integer num, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = restPwdEntity.status;
        }
        if ((i11 & 2) != 0) {
            str = restPwdEntity.reason;
        }
        return restPwdEntity.copy(num, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    public final RestPwdEntity copy(@Nullable Integer status, @Nullable String reason) {
        return new RestPwdEntity(status, reason);
    }

    @Nullable
    public final String getReason() {
        return this.reason;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    public int hashCode() {
        Integer num = this.status;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.reason;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setReason(@Nullable String str) {
        this.reason = str;
    }

    public final void setStatus(@Nullable Integer num) {
        this.status = num;
    }

    @NotNull
    public String toString() {
        return "RestPwdEntity(status=" + this.status + ", reason=" + this.reason + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.status;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeString(this.reason);
    }

    public /* synthetic */ RestPwdEntity(Integer num, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : str);
    }
}
