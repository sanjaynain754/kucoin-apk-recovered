package com.kubi.kumex.data.trade.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WsStopEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0017J>\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010 J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\"HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\"R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR\"\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006-"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/WsStopEntity;", "Landroid/os/Parcelable;", "id", "", "success", "", "errorCode", "timestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getSuccess", "()Ljava/lang/Boolean;", "setSuccess", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getErrorCode", "setErrorCode", "getTimestamp", "()Ljava/lang/Long;", "setTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;)Lcom/kubi/kumex/data/trade/model/WsStopEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WsStopEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WsStopEntity> CREATOR = new C15842a();

    @Nullable
    private String errorCode;

    @SerializedName("orderId")
    @Nullable
    private String id;

    @Nullable
    private Boolean success;

    @SerializedName("ts")
    @Nullable
    private Long timestamp;

    /* JADX INFO: renamed from: com.kubi.kumex.data.trade.model.WsStopEntity$a */
    /* JADX INFO: compiled from: WsStopEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15842a implements Parcelable.Creator<WsStopEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WsStopEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new WsStopEntity(string, boolValueOf, parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final WsStopEntity[] newArray(int i11) {
            return new WsStopEntity[i11];
        }
    }

    public WsStopEntity() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WsStopEntity)) {
            return false;
        }
        WsStopEntity wsStopEntity = (WsStopEntity) other;
        return Intrinsics.areEqual(this.id, wsStopEntity.id) && Intrinsics.areEqual(this.success, wsStopEntity.success) && Intrinsics.areEqual(this.errorCode, wsStopEntity.errorCode) && Intrinsics.areEqual(this.timestamp, wsStopEntity.timestamp);
    }

    public WsStopEntity(@Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable Long l11) {
        this.id = str;
        this.success = bool;
        this.errorCode = str2;
        this.timestamp = l11;
    }

    public static /* synthetic */ WsStopEntity copy$default(WsStopEntity wsStopEntity, String str, Boolean bool, String str2, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = wsStopEntity.id;
        }
        if ((i11 & 2) != 0) {
            bool = wsStopEntity.success;
        }
        if ((i11 & 4) != 0) {
            str2 = wsStopEntity.errorCode;
        }
        if ((i11 & 8) != 0) {
            l11 = wsStopEntity.timestamp;
        }
        return wsStopEntity.copy(str, bool, str2, l11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getSuccess() {
        return this.success;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final WsStopEntity copy(@Nullable String id2, @Nullable Boolean success, @Nullable String errorCode, @Nullable Long timestamp) {
        return new WsStopEntity(id2, success, errorCode, timestamp);
    }

    @Nullable
    public final String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Boolean getSuccess() {
        return this.success;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.success;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.errorCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.timestamp;
        return iHashCode3 + (l11 != null ? l11.hashCode() : 0);
    }

    public final void setErrorCode(@Nullable String str) {
        this.errorCode = str;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setSuccess(@Nullable Boolean bool) {
        this.success = bool;
    }

    public final void setTimestamp(@Nullable Long l11) {
        this.timestamp = l11;
    }

    @NotNull
    public String toString() {
        return "WsStopEntity(id=" + this.id + ", success=" + this.success + ", errorCode=" + this.errorCode + ", timestamp=" + this.timestamp + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        Boolean bool = this.success;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.errorCode);
        Long l11 = this.timestamp;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
    }

    public /* synthetic */ WsStopEntity(String str, Boolean bool, String str2, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : l11);
    }
}
