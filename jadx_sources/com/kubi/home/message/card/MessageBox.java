package com.kubi.home.message.card;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MessageBox.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u0080\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010,J\u0006\u0010-\u001a\u00020\u0005J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020\u0005HÖ\u0001J\t\u00103\u001a\u00020\tHÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u0005R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0017\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001f¨\u00069"}, m90084d2 = {"Lcom/kubi/home/message/card/MessageBox;", "Landroid/os/Parcelable;", "id", "", "groupId", "", "gmtCreated", "boxType", "title", "", "url", "showTime", "templateCode", ViewProps.PADDING_TOP, ViewProps.PADDING_BOTTOM, "<init>", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getGroupId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGmtCreated", "getBoxType", "getTitle", "()Ljava/lang/String;", "getUrl", "getShowTime", "getTemplateCode", "getPaddingTop", "()I", "getPaddingBottom", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Lcom/kubi/home/message/card/MessageBox;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MessageBox implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MessageBox> CREATOR = new C14662a();

    @Nullable
    private final Integer boxType;

    @Nullable
    private final Long gmtCreated;

    @Nullable
    private final Integer groupId;

    @Nullable
    private final Long id;
    private final int paddingBottom;
    private final int paddingTop;

    @NotNull
    private final String showTime;

    @Nullable
    private final String templateCode;

    @Nullable
    private final String title;

    @Nullable
    private final String url;

    /* JADX INFO: renamed from: com.kubi.home.message.card.MessageBox$a */
    /* JADX INFO: compiled from: MessageBox.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14662a implements Parcelable.Creator<MessageBox> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MessageBox createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MessageBox(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MessageBox[] newArray(int i11) {
            return new MessageBox[i11];
        }
    }

    public MessageBox() {
        this(null, null, null, null, null, null, null, null, 0, 0, 1023, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageBox)) {
            return false;
        }
        MessageBox messageBox = (MessageBox) other;
        return Intrinsics.areEqual(this.id, messageBox.id) && Intrinsics.areEqual(this.groupId, messageBox.groupId) && Intrinsics.areEqual(this.gmtCreated, messageBox.gmtCreated) && Intrinsics.areEqual(this.boxType, messageBox.boxType) && Intrinsics.areEqual(this.title, messageBox.title) && Intrinsics.areEqual(this.url, messageBox.url) && Intrinsics.areEqual(this.showTime, messageBox.showTime) && Intrinsics.areEqual(this.templateCode, messageBox.templateCode) && this.paddingTop == messageBox.paddingTop && this.paddingBottom == messageBox.paddingBottom;
    }

    public MessageBox(@Nullable Long l11, @Nullable Integer num, @Nullable Long l12, @Nullable Integer num2, @Nullable String str, @Nullable String str2, @NotNull String showTime, @Nullable String str3, int i11, int i12) {
        Intrinsics.checkNotNullParameter(showTime, "showTime");
        this.id = l11;
        this.groupId = num;
        this.gmtCreated = l12;
        this.boxType = num2;
        this.title = str;
        this.url = str2;
        this.showTime = showTime;
        this.templateCode = str3;
        this.paddingTop = i11;
        this.paddingBottom = i12;
    }

    public static /* synthetic */ MessageBox copy$default(MessageBox messageBox, Long l11, Integer num, Long l12, Integer num2, String str, String str2, String str3, String str4, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            l11 = messageBox.id;
        }
        if ((i13 & 2) != 0) {
            num = messageBox.groupId;
        }
        if ((i13 & 4) != 0) {
            l12 = messageBox.gmtCreated;
        }
        if ((i13 & 8) != 0) {
            num2 = messageBox.boxType;
        }
        if ((i13 & 16) != 0) {
            str = messageBox.title;
        }
        if ((i13 & 32) != 0) {
            str2 = messageBox.url;
        }
        if ((i13 & 64) != 0) {
            str3 = messageBox.showTime;
        }
        if ((i13 & 128) != 0) {
            str4 = messageBox.templateCode;
        }
        if ((i13 & 256) != 0) {
            i11 = messageBox.paddingTop;
        }
        if ((i13 & 512) != 0) {
            i12 = messageBox.paddingBottom;
        }
        int i14 = i11;
        int i15 = i12;
        String str5 = str3;
        String str6 = str4;
        String str7 = str;
        String str8 = str2;
        return messageBox.copy(l11, num, l12, num2, str7, str8, str5, str6, i14, i15);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getPaddingBottom() {
        return this.paddingBottom;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getGroupId() {
        return this.groupId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getGmtCreated() {
        return this.gmtCreated;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getBoxType() {
        return this.boxType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getShowTime() {
        return this.showTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTemplateCode() {
        return this.templateCode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getPaddingTop() {
        return this.paddingTop;
    }

    @NotNull
    public final MessageBox copy(@Nullable Long id2, @Nullable Integer groupId, @Nullable Long gmtCreated, @Nullable Integer boxType, @Nullable String title, @Nullable String url, @NotNull String showTime, @Nullable String templateCode, int paddingTop, int paddingBottom) {
        Intrinsics.checkNotNullParameter(showTime, "showTime");
        return new MessageBox(id2, groupId, gmtCreated, boxType, title, url, showTime, templateCode, paddingTop, paddingBottom);
    }

    @Nullable
    public final Integer getBoxType() {
        return this.boxType;
    }

    @Nullable
    public final Long getGmtCreated() {
        return this.gmtCreated;
    }

    @Nullable
    public final Integer getGroupId() {
        return this.groupId;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    public final int getPaddingBottom() {
        return this.paddingBottom;
    }

    public final int getPaddingTop() {
        return this.paddingTop;
    }

    @NotNull
    public final String getShowTime() {
        return this.showTime;
    }

    @Nullable
    public final String getTemplateCode() {
        return this.templateCode;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        Long l11 = this.id;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        Integer num = this.groupId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l12 = this.gmtCreated;
        int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Integer num2 = this.boxType;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.title;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        int iHashCode6 = (((iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.showTime.hashCode()) * 31;
        String str3 = this.templateCode;
        return ((((iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.paddingTop)) * 31) + Integer.hashCode(this.paddingBottom);
    }

    @NotNull
    public String toString() {
        return "MessageBox(id=" + this.id + ", groupId=" + this.groupId + ", gmtCreated=" + this.gmtCreated + ", boxType=" + this.boxType + ", title=" + this.title + ", url=" + this.url + ", showTime=" + this.showTime + ", templateCode=" + this.templateCode + ", paddingTop=" + this.paddingTop + ", paddingBottom=" + this.paddingBottom + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Long l11 = this.id;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Integer num = this.groupId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Long l12 = this.gmtCreated;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        Integer num2 = this.boxType;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeString(this.title);
        dest.writeString(this.url);
        dest.writeString(this.showTime);
        dest.writeString(this.templateCode);
        dest.writeInt(this.paddingTop);
        dest.writeInt(this.paddingBottom);
    }

    public /* synthetic */ MessageBox(Long l11, Integer num, Long l12, Integer num2, String str, String str2, String str3, String str4, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0L : l11, (i13 & 2) != 0 ? 0 : num, (i13 & 4) != 0 ? 0L : l12, (i13 & 8) != 0 ? 0 : num2, (i13 & 16) != 0 ? "" : str, (i13 & 32) != 0 ? "" : str2, (i13 & 64) != 0 ? "" : str3, (i13 & 128) != 0 ? null : str4, (i13 & 256) != 0 ? 0 : i11, (i13 & 512) != 0 ? 0 : i12);
    }
}
