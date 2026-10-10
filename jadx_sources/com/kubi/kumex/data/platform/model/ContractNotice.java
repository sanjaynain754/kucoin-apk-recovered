package com.kubi.kumex.data.platform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.user.protocol.entity.SignTermItem;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NoticeConfig.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010JJ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010\"\u0004\b\u0013\u0010\u0014¨\u0006)"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/ContractNotice;", "Landroid/os/Parcelable;", TUIConstants.TUIChat.INPUT_MORE_ICON, "", SignTermItem.LINK, "content", "start", "", "end", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getIcon", "()Ljava/lang/String;", "getLink", "getContent", "getStart", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEnd", "setEnd", "(Ljava/lang/Long;)V", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/kubi/kumex/data/platform/model/ContractNotice;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ContractNotice implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ContractNotice> CREATOR = new C15797a();

    @Nullable
    private final String content;

    @Nullable
    private Long end;

    @Nullable
    private final String icon;

    @Nullable
    private final String link;

    @Nullable
    private final Long start;

    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.ContractNotice$a */
    /* JADX INFO: compiled from: NoticeConfig.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15797a implements Parcelable.Creator<ContractNotice> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ContractNotice createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ContractNotice(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ContractNotice[] newArray(int i11) {
            return new ContractNotice[i11];
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
        if (!(other instanceof ContractNotice)) {
            return false;
        }
        ContractNotice contractNotice = (ContractNotice) other;
        return Intrinsics.areEqual(this.icon, contractNotice.icon) && Intrinsics.areEqual(this.link, contractNotice.link) && Intrinsics.areEqual(this.content, contractNotice.content) && Intrinsics.areEqual(this.start, contractNotice.start) && Intrinsics.areEqual(this.end, contractNotice.end);
    }

    public static /* synthetic */ ContractNotice copy$default(ContractNotice contractNotice, String str, String str2, String str3, Long l11, Long l12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = contractNotice.icon;
        }
        if ((i11 & 2) != 0) {
            str2 = contractNotice.link;
        }
        if ((i11 & 4) != 0) {
            str3 = contractNotice.content;
        }
        if ((i11 & 8) != 0) {
            l11 = contractNotice.start;
        }
        if ((i11 & 16) != 0) {
            l12 = contractNotice.end;
        }
        Long l13 = l12;
        String str4 = str3;
        return contractNotice.copy(str, str2, str4, l11, l13);
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
    public final ContractNotice copy(@Nullable String icon, @Nullable String link, @Nullable String content, @Nullable Long start, @Nullable Long end) {
        return new ContractNotice(icon, link, content, start, end);
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

    public final void setEnd(@Nullable Long l11) {
        this.end = l11;
    }

    @NotNull
    public String toString() {
        return "ContractNotice(icon=" + this.icon + ", link=" + this.link + ", content=" + this.content + ", start=" + this.start + ", end=" + this.end + ')';
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

    public ContractNotice(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l11, @Nullable Long l12) {
        this.icon = str;
        this.link = str2;
        this.content = str3;
        this.start = l11;
        this.end = l12;
    }
}
