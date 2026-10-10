package com.kubi.payment.chat.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatInfo.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, m90084d2 = {"Lcom/kubi/payment/chat/entity/ChatInfo;", "Landroid/os/Parcelable;", "from", "", "fromName", TypedValues.TransitionType.S_TO, "toName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFrom", "()Ljava/lang/String;", "getFromName", "getTo", "getToName", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ChatInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ChatInfo> CREATOR = new C20413a();

    @Nullable
    private final String from;

    @Nullable
    private final String fromName;

    @Nullable
    private final String to;

    @Nullable
    private final String toName;

    /* JADX INFO: renamed from: com.kubi.payment.chat.entity.ChatInfo$a */
    /* JADX INFO: compiled from: ChatInfo.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20413a implements Parcelable.Creator<ChatInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChatInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChatInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ChatInfo[] newArray(int i11) {
            return new ChatInfo[i11];
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
        if (!(other instanceof ChatInfo)) {
            return false;
        }
        ChatInfo chatInfo = (ChatInfo) other;
        return Intrinsics.areEqual(this.from, chatInfo.from) && Intrinsics.areEqual(this.fromName, chatInfo.fromName) && Intrinsics.areEqual(this.to, chatInfo.to) && Intrinsics.areEqual(this.toName, chatInfo.toName);
    }

    public static /* synthetic */ ChatInfo copy$default(ChatInfo chatInfo, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = chatInfo.from;
        }
        if ((i11 & 2) != 0) {
            str2 = chatInfo.fromName;
        }
        if ((i11 & 4) != 0) {
            str3 = chatInfo.to;
        }
        if ((i11 & 8) != 0) {
            str4 = chatInfo.toName;
        }
        return chatInfo.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFromName() {
        return this.fromName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTo() {
        return this.to;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getToName() {
        return this.toName;
    }

    @NotNull
    public final ChatInfo copy(@Nullable String from, @Nullable String fromName, @Nullable String to2, @Nullable String toName) {
        return new ChatInfo(from, fromName, to2, toName);
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
    public final String getTo() {
        return this.to;
    }

    @Nullable
    public final String getToName() {
        return this.toName;
    }

    public int hashCode() {
        String str = this.from;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fromName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.to;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.toName;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ChatInfo(from=" + this.from + ", fromName=" + this.fromName + ", to=" + this.to + ", toName=" + this.toName + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.from);
        dest.writeString(this.fromName);
        dest.writeString(this.to);
        dest.writeString(this.toName);
    }

    public ChatInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.from = str;
        this.fromName = str2;
        this.to = str3;
        this.toName = str4;
    }
}
