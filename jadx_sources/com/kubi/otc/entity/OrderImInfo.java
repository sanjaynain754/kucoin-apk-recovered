package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OtcBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006&"}, m90084d2 = {"Lcom/kubi/otc/entity/OrderImInfo;", "Landroid/os/Parcelable;", "messageUnread", "", "from", "", "fromName", TypedValues.TransitionType.S_TO, "toName", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMessageUnread", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFrom", "()Ljava/lang/String;", "getFromName", "getTo", "getToName", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/otc/entity/OrderImInfo;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OrderImInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OrderImInfo> CREATOR = new Creator();

    @Nullable
    private final String from;

    @Nullable
    private final String fromName;

    @Nullable
    private final Boolean messageUnread;

    @Nullable
    private final String to;

    @Nullable
    private final String toName;

    /* JADX INFO: compiled from: OtcBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderImInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderImInfo createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new OrderImInfo(boolValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderImInfo[] newArray(int i11) {
            return new OrderImInfo[i11];
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
        if (!(other instanceof OrderImInfo)) {
            return false;
        }
        OrderImInfo orderImInfo = (OrderImInfo) other;
        return Intrinsics.areEqual(this.messageUnread, orderImInfo.messageUnread) && Intrinsics.areEqual(this.from, orderImInfo.from) && Intrinsics.areEqual(this.fromName, orderImInfo.fromName) && Intrinsics.areEqual(this.to, orderImInfo.to) && Intrinsics.areEqual(this.toName, orderImInfo.toName);
    }

    public static /* synthetic */ OrderImInfo copy$default(OrderImInfo orderImInfo, Boolean bool, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = orderImInfo.messageUnread;
        }
        if ((i11 & 2) != 0) {
            str = orderImInfo.from;
        }
        if ((i11 & 4) != 0) {
            str2 = orderImInfo.fromName;
        }
        if ((i11 & 8) != 0) {
            str3 = orderImInfo.to;
        }
        if ((i11 & 16) != 0) {
            str4 = orderImInfo.toName;
        }
        String str5 = str4;
        String str6 = str2;
        return orderImInfo.copy(bool, str, str6, str3, str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getMessageUnread() {
        return this.messageUnread;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFromName() {
        return this.fromName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTo() {
        return this.to;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getToName() {
        return this.toName;
    }

    @NotNull
    public final OrderImInfo copy(@Nullable Boolean messageUnread, @Nullable String from, @Nullable String fromName, @Nullable String to2, @Nullable String toName) {
        return new OrderImInfo(messageUnread, from, fromName, to2, toName);
    }

    @Nullable
    public final String getFrom() {
        return this.from;
    }

    @Nullable
    public final String getFromName() {
        return this.fromName;
    }

    @Nullable
    public final Boolean getMessageUnread() {
        return this.messageUnread;
    }

    @Nullable
    public final String getTo() {
        return this.to;
    }

    @Nullable
    public final String getToName() {
        return this.toName;
    }

    public int hashCode() {
        Boolean bool = this.messageUnread;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.from;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fromName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.to;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.toName;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OrderImInfo(messageUnread=" + this.messageUnread + ", from=" + this.from + ", fromName=" + this.fromName + ", to=" + this.to + ", toName=" + this.toName + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.messageUnread;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            dest.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        dest.writeInt(BooleanValue);
        dest.writeString(this.from);
        dest.writeString(this.fromName);
        dest.writeString(this.to);
        dest.writeString(this.toName);
    }

    public OrderImInfo(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.messageUnread = bool;
        this.from = str;
        this.fromName = str2;
        this.to = str3;
        this.toName = str4;
    }
}
