package io.trtc.tuikit.atomicxcore.api.message;

import android.os.Parcel;
import android.os.Parcelable;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39392b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u001c"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/MessageExtension;", "Landroid/os/Parcelable;", "extensionKey", "", "extensionValue", "(Ljava/lang/String;Ljava/lang/String;)V", "getExtensionKey", "()Ljava/lang/String;", "setExtensionKey", "(Ljava/lang/String;)V", "getExtensionValue", "setExtensionValue", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class MessageExtension implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MessageExtension> CREATOR = new Creator();

    @Nullable
    private String extensionKey;

    @Nullable
    private String extensionValue;

    @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<MessageExtension> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MessageExtension createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MessageExtension(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MessageExtension[] newArray(int i11) {
            return new MessageExtension[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessageExtension() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageExtension)) {
            return false;
        }
        MessageExtension messageExtension = (MessageExtension) other;
        return Intrinsics.areEqual(this.extensionKey, messageExtension.extensionKey) && Intrinsics.areEqual(this.extensionValue, messageExtension.extensionValue);
    }

    public MessageExtension(@Nullable String str, @Nullable String str2) {
        this.extensionKey = str;
        this.extensionValue = str2;
    }

    public static /* synthetic */ MessageExtension copy$default(MessageExtension messageExtension, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = messageExtension.extensionKey;
        }
        if ((i11 & 2) != 0) {
            str2 = messageExtension.extensionValue;
        }
        return messageExtension.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExtensionKey() {
        return this.extensionKey;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExtensionValue() {
        return this.extensionValue;
    }

    @NotNull
    public final MessageExtension copy(@Nullable String extensionKey, @Nullable String extensionValue) {
        return new MessageExtension(extensionKey, extensionValue);
    }

    @Nullable
    public final String getExtensionKey() {
        return this.extensionKey;
    }

    @Nullable
    public final String getExtensionValue() {
        return this.extensionValue;
    }

    public int hashCode() {
        String str = this.extensionKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.extensionValue;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setExtensionKey(@Nullable String str) {
        this.extensionKey = str;
    }

    public final void setExtensionValue(@Nullable String str) {
        this.extensionValue = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MessageExtension(extensionKey=");
        sb2.append(this.extensionKey);
        sb2.append(", extensionValue=");
        return AbstractC39392b.m88221a(sb2, this.extensionValue, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.extensionKey);
        parcel.writeString(this.extensionValue);
    }

    public /* synthetic */ MessageExtension(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}
