package io.trtc.tuikit.atomicxcore.api.message;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006#"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/CustomMessageInfo;", "Landroid/os/Parcelable;", "data", "", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "", "extensionInfo", "([BLjava/lang/String;[B)V", "getData", "()[B", "setData", "([B)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getExtensionInfo", "setExtensionInfo", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class CustomMessageInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CustomMessageInfo> CREATOR = new Creator();

    @Nullable
    private byte[] data;

    @Nullable
    private String description;

    @Nullable
    private byte[] extensionInfo;

    @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<CustomMessageInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CustomMessageInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CustomMessageInfo(parcel.createByteArray(), parcel.readString(), parcel.createByteArray());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CustomMessageInfo[] newArray(int i11) {
            return new CustomMessageInfo[i11];
        }
    }

    public CustomMessageInfo() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomMessageInfo)) {
            return false;
        }
        CustomMessageInfo customMessageInfo = (CustomMessageInfo) other;
        return Intrinsics.areEqual(this.data, customMessageInfo.data) && Intrinsics.areEqual(this.description, customMessageInfo.description) && Intrinsics.areEqual(this.extensionInfo, customMessageInfo.extensionInfo);
    }

    public CustomMessageInfo(@Nullable byte[] bArr, @Nullable String str, @Nullable byte[] bArr2) {
        this.data = bArr;
        this.description = str;
        this.extensionInfo = bArr2;
    }

    public static /* synthetic */ CustomMessageInfo copy$default(CustomMessageInfo customMessageInfo, byte[] bArr, String str, byte[] bArr2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bArr = customMessageInfo.data;
        }
        if ((i11 & 2) != 0) {
            str = customMessageInfo.description;
        }
        if ((i11 & 4) != 0) {
            bArr2 = customMessageInfo.extensionInfo;
        }
        return customMessageInfo.copy(bArr, str, bArr2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final byte[] getExtensionInfo() {
        return this.extensionInfo;
    }

    @NotNull
    public final CustomMessageInfo copy(@Nullable byte[] data, @Nullable String description, @Nullable byte[] extensionInfo) {
        return new CustomMessageInfo(data, description, extensionInfo);
    }

    @Nullable
    public final byte[] getData() {
        return this.data;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final byte[] getExtensionInfo() {
        return this.extensionInfo;
    }

    public int hashCode() {
        byte[] bArr = this.data;
        int iHashCode = (bArr == null ? 0 : Arrays.hashCode(bArr)) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        byte[] bArr2 = this.extensionInfo;
        return iHashCode2 + (bArr2 != null ? Arrays.hashCode(bArr2) : 0);
    }

    public final void setData(@Nullable byte[] bArr) {
        this.data = bArr;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setExtensionInfo(@Nullable byte[] bArr) {
        this.extensionInfo = bArr;
    }

    @NotNull
    public String toString() {
        return "CustomMessageInfo(data=" + Arrays.toString(this.data) + ", description=" + this.description + ", extensionInfo=" + Arrays.toString(this.extensionInfo) + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeByteArray(this.data);
        parcel.writeString(this.description);
        parcel.writeByteArray(this.extensionInfo);
    }

    public /* synthetic */ CustomMessageInfo(byte[] bArr, String str, byte[] bArr2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bArr, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : bArr2);
    }
}
