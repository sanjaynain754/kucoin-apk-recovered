package io.trtc.tuikit.atomicxcore.api.message;

import android.os.Parcel;
import android.os.Parcelable;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39391a;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003JO\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001J\u0013\u0010*\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020)HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\u0019\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020)HÖ\u0001R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014¨\u00064"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/MergedForwardInfo;", "Landroid/os/Parcelable;", "title", "", "abstractList", "", "compatibleText", "needReadReceipt", "", "supportExtension", "offlinePushInfo", "Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZZLio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;)V", "getAbstractList", "()Ljava/util/List;", "setAbstractList", "(Ljava/util/List;)V", "getCompatibleText", "()Ljava/lang/String;", "setCompatibleText", "(Ljava/lang/String;)V", "getNeedReadReceipt", "()Z", "setNeedReadReceipt", "(Z)V", "getOfflinePushInfo", "()Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;", "setOfflinePushInfo", "(Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;)V", "getSupportExtension", "setSupportExtension", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class MergedForwardInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MergedForwardInfo> CREATOR = new Creator();

    @Nullable
    private List<String> abstractList;

    @NotNull
    private String compatibleText;
    private boolean needReadReceipt;

    @Nullable
    private OfflinePushInfo offlinePushInfo;
    private boolean supportExtension;

    @NotNull
    private String title;

    @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<MergedForwardInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MergedForwardInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string2 = parcel.readString();
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                z11 = true;
            }
            return new MergedForwardInfo(string, arrayListCreateStringArrayList, string2, z11, parcel.readInt() != 0, parcel.readInt() == 0 ? null : OfflinePushInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MergedForwardInfo[] newArray(int i11) {
            return new MergedForwardInfo[i11];
        }
    }

    public MergedForwardInfo(@NotNull String title, @Nullable List<String> list, @NotNull String compatibleText, boolean z11, boolean z12, @Nullable OfflinePushInfo offlinePushInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(compatibleText, "compatibleText");
        this.title = title;
        this.abstractList = list;
        this.compatibleText = compatibleText;
        this.needReadReceipt = z11;
        this.supportExtension = z12;
        this.offlinePushInfo = offlinePushInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MergedForwardInfo)) {
            return false;
        }
        MergedForwardInfo mergedForwardInfo = (MergedForwardInfo) other;
        return Intrinsics.areEqual(this.title, mergedForwardInfo.title) && Intrinsics.areEqual(this.abstractList, mergedForwardInfo.abstractList) && Intrinsics.areEqual(this.compatibleText, mergedForwardInfo.compatibleText) && this.needReadReceipt == mergedForwardInfo.needReadReceipt && this.supportExtension == mergedForwardInfo.supportExtension && Intrinsics.areEqual(this.offlinePushInfo, mergedForwardInfo.offlinePushInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MergedForwardInfo copy$default(MergedForwardInfo mergedForwardInfo, String str, List list, String str2, boolean z11, boolean z12, OfflinePushInfo offlinePushInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mergedForwardInfo.title;
        }
        if ((i11 & 2) != 0) {
            list = mergedForwardInfo.abstractList;
        }
        if ((i11 & 4) != 0) {
            str2 = mergedForwardInfo.compatibleText;
        }
        if ((i11 & 8) != 0) {
            z11 = mergedForwardInfo.needReadReceipt;
        }
        if ((i11 & 16) != 0) {
            z12 = mergedForwardInfo.supportExtension;
        }
        if ((i11 & 32) != 0) {
            offlinePushInfo = mergedForwardInfo.offlinePushInfo;
        }
        boolean z13 = z12;
        OfflinePushInfo offlinePushInfo2 = offlinePushInfo;
        return mergedForwardInfo.copy(str, list, str2, z11, z13, offlinePushInfo2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final List<String> component2() {
        return this.abstractList;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCompatibleText() {
        return this.compatibleText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getNeedReadReceipt() {
        return this.needReadReceipt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getSupportExtension() {
        return this.supportExtension;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final OfflinePushInfo getOfflinePushInfo() {
        return this.offlinePushInfo;
    }

    @Nullable
    public final List<String> getAbstractList() {
        return this.abstractList;
    }

    @NotNull
    public final String getCompatibleText() {
        return this.compatibleText;
    }

    public final boolean getNeedReadReceipt() {
        return this.needReadReceipt;
    }

    @Nullable
    public final OfflinePushInfo getOfflinePushInfo() {
        return this.offlinePushInfo;
    }

    public final boolean getSupportExtension() {
        return this.supportExtension;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        List<String> list = this.abstractList;
        int iM88220a = AbstractC39391a.m88220a(this.compatibleText, (iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31);
        boolean z11 = this.needReadReceipt;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iM88220a + r11) * 31;
        boolean z12 = this.supportExtension;
        int i12 = (i11 + (z12 ? 1 : z12)) * 31;
        OfflinePushInfo offlinePushInfo = this.offlinePushInfo;
        return i12 + (offlinePushInfo != null ? offlinePushInfo.hashCode() : 0);
    }

    public final void setAbstractList(@Nullable List<String> list) {
        this.abstractList = list;
    }

    public final void setCompatibleText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.compatibleText = str;
    }

    public final void setNeedReadReceipt(boolean z11) {
        this.needReadReceipt = z11;
    }

    public final void setOfflinePushInfo(@Nullable OfflinePushInfo offlinePushInfo) {
        this.offlinePushInfo = offlinePushInfo;
    }

    public final void setSupportExtension(boolean z11) {
        this.supportExtension = z11;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "MergedForwardInfo(title=" + this.title + ", abstractList=" + this.abstractList + ", compatibleText=" + this.compatibleText + ", needReadReceipt=" + this.needReadReceipt + ", supportExtension=" + this.supportExtension + ", offlinePushInfo=" + this.offlinePushInfo + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.title);
        parcel.writeStringList(this.abstractList);
        parcel.writeString(this.compatibleText);
        parcel.writeInt(this.needReadReceipt ? 1 : 0);
        parcel.writeInt(this.supportExtension ? 1 : 0);
        OfflinePushInfo offlinePushInfo = this.offlinePushInfo;
        if (offlinePushInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offlinePushInfo.writeToParcel(parcel, flags);
        }
    }

    @NotNull
    public final MergedForwardInfo copy(@NotNull String title, @Nullable List<String> abstractList, @NotNull String compatibleText, boolean needReadReceipt, boolean supportExtension, @Nullable OfflinePushInfo offlinePushInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(compatibleText, "compatibleText");
        return new MergedForwardInfo(title, abstractList, compatibleText, needReadReceipt, supportExtension, offlinePushInfo);
    }

    public /* synthetic */ MergedForwardInfo(String str, List list, String str2, boolean z11, boolean z12, OfflinePushInfo offlinePushInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? false : z12, (i11 & 32) != 0 ? null : offlinePushInfo);
    }
}
