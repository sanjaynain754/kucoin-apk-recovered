package com.kubi.home.message.card;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.kucoin.home.cards.BaseCardData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MessageBoxData.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/home/message/card/MessageBoxData;", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "data", "Lcom/kubi/home/message/card/MessageBoxCardData;", "<init>", "(Lcom/kubi/home/message/card/MessageBoxCardData;)V", "getData", "()Lcom/kubi/home/message/card/MessageBoxCardData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MessageBoxData extends BaseCardData {

    @NotNull
    public static final Parcelable.Creator<MessageBoxData> CREATOR = new C14666a();

    @NotNull
    private final MessageBoxCardData data;

    /* JADX INFO: renamed from: com.kubi.home.message.card.MessageBoxData$a */
    /* JADX INFO: compiled from: MessageBoxData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14666a implements Parcelable.Creator<MessageBoxData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MessageBoxData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MessageBoxData(MessageBoxCardData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MessageBoxData[] newArray(int i11) {
            return new MessageBoxData[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessageBoxData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MessageBoxData) && Intrinsics.areEqual(this.data, ((MessageBoxData) other).data);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageBoxData(@NotNull MessageBoxCardData data) {
        super(0, 0, 0, false, 0, null, null, 0, 255, null);
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public static /* synthetic */ MessageBoxData copy$default(MessageBoxData messageBoxData, MessageBoxCardData messageBoxCardData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            messageBoxCardData = messageBoxData.data;
        }
        return messageBoxData.copy(messageBoxCardData);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MessageBoxCardData getData() {
        return this.data;
    }

    @NotNull
    public final MessageBoxData copy(@NotNull MessageBoxCardData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new MessageBoxData(data);
    }

    @NotNull
    public final MessageBoxCardData getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "MessageBoxData(data=" + this.data + ')';
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardData, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.data.writeToParcel(dest, flags);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ MessageBoxData(MessageBoxCardData messageBoxCardData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new MessageBoxCardData(null, 1, 0 == true ? 1 : 0) : messageBoxCardData);
    }
}
