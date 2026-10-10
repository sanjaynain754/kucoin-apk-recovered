package com.kubi.kumex.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.user.protocol.entity.SignTermItem;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContractOpenNotice.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014JJ\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010 J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\"HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016¨\u0006."}, m90084d2 = {"Lcom/kubi/kumex/entity/ContractOpenNotice;", "Landroid/os/Parcelable;", TUIConstants.TUIChat.INPUT_MORE_ICON, "", SignTermItem.LINK, "content", "start", "", "end", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getIcon", "()Ljava/lang/String;", "setIcon", "(Ljava/lang/String;)V", "getLink", "setLink", "getContent", "setContent", "getStart", "()Ljava/lang/Long;", "setStart", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getEnd", "setEnd", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/kubi/kumex/entity/ContractOpenNotice;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ContractOpenNotice implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ContractOpenNotice> CREATOR = new Creator();

    @Nullable
    private String content;

    @Nullable
    private Long end;

    @Nullable
    private String icon;

    @Nullable
    private String link;

    @Nullable
    private Long start;

    /* JADX INFO: compiled from: ContractOpenNotice.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<ContractOpenNotice> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContractOpenNotice createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ContractOpenNotice(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContractOpenNotice[] newArray(int i11) {
            return new ContractOpenNotice[i11];
        }
    }

    public ContractOpenNotice() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContractOpenNotice)) {
            return false;
        }
        ContractOpenNotice contractOpenNotice = (ContractOpenNotice) other;
        return Intrinsics.areEqual(this.icon, contractOpenNotice.icon) && Intrinsics.areEqual(this.link, contractOpenNotice.link) && Intrinsics.areEqual(this.content, contractOpenNotice.content) && Intrinsics.areEqual(this.start, contractOpenNotice.start) && Intrinsics.areEqual(this.end, contractOpenNotice.end);
    }

    public ContractOpenNotice(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l11, @Nullable Long l12) {
        this.icon = str;
        this.link = str2;
        this.content = str3;
        this.start = l11;
        this.end = l12;
    }

    public static /* synthetic */ ContractOpenNotice copy$default(ContractOpenNotice contractOpenNotice, String str, String str2, String str3, Long l11, Long l12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = contractOpenNotice.icon;
        }
        if ((i11 & 2) != 0) {
            str2 = contractOpenNotice.link;
        }
        if ((i11 & 4) != 0) {
            str3 = contractOpenNotice.content;
        }
        if ((i11 & 8) != 0) {
            l11 = contractOpenNotice.start;
        }
        if ((i11 & 16) != 0) {
            l12 = contractOpenNotice.end;
        }
        Long l13 = l12;
        String str4 = str3;
        return contractOpenNotice.copy(str, str2, str4, l11, l13);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getStart() {
        return this.start;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getEnd() {
        return this.end;
    }

    @NotNull
    public final ContractOpenNotice copy(@Nullable String icon, @Nullable String link, @Nullable String content, @Nullable Long start, @Nullable Long end) {
        return new ContractOpenNotice(icon, link, content, start, end);
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final Long getEnd() {
        return this.end;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final Long getStart() {
        return this.start;
    }

    public int hashCode() {
        String str = this.icon;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.link;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.content;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l11 = this.start;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.end;
        return iHashCode4 + (l12 != null ? l12.hashCode() : 0);
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setEnd(@Nullable Long l11) {
        this.end = l11;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setStart(@Nullable Long l11) {
        this.start = l11;
    }

    @NotNull
    public String toString() {
        return "ContractOpenNotice(icon=" + this.icon + ", link=" + this.link + ", content=" + this.content + ", start=" + this.start + ", end=" + this.end + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.icon);
        dest.writeString(this.link);
        dest.writeString(this.content);
        Long l11 = this.start;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Long l12 = this.end;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
    }

    public /* synthetic */ ContractOpenNotice(String str, String str2, String str3, Long l11, Long l12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? null : l11, (i11 & 16) != 0 ? null : l12);
    }
}
