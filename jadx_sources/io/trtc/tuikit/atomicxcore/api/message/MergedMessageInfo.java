package io.trtc.tuikit.atomicxcore.api.message;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J%\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001f"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/MergedMessageInfo;", "Landroid/os/Parcelable;", "title", "", "abstractList", "", "(Ljava/lang/String;Ljava/util/List;)V", "getAbstractList", "()Ljava/util/List;", "setAbstractList", "(Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class MergedMessageInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MergedMessageInfo> CREATOR = new Creator();

    @Nullable
    private List<String> abstractList;

    @NotNull
    private String title;

    @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<MergedMessageInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MergedMessageInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MergedMessageInfo(parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MergedMessageInfo[] newArray(int i11) {
            return new MergedMessageInfo[i11];
        }
    }

    public MergedMessageInfo(@NotNull String title, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.abstractList = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MergedMessageInfo)) {
            return false;
        }
        MergedMessageInfo mergedMessageInfo = (MergedMessageInfo) other;
        return Intrinsics.areEqual(this.title, mergedMessageInfo.title) && Intrinsics.areEqual(this.abstractList, mergedMessageInfo.abstractList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MergedMessageInfo copy$default(MergedMessageInfo mergedMessageInfo, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mergedMessageInfo.title;
        }
        if ((i11 & 2) != 0) {
            list = mergedMessageInfo.abstractList;
        }
        return mergedMessageInfo.copy(str, list);
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

    @Nullable
    public final List<String> getAbstractList() {
        return this.abstractList;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        List<String> list = this.abstractList;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final void setAbstractList(@Nullable List<String> list) {
        this.abstractList = list;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "MergedMessageInfo(title=" + this.title + ", abstractList=" + this.abstractList + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.title);
        parcel.writeStringList(this.abstractList);
    }

    @NotNull
    public final MergedMessageInfo copy(@NotNull String title, @Nullable List<String> abstractList) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new MergedMessageInfo(title, abstractList);
    }

    public /* synthetic */ MergedMessageInfo(String str, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : list);
    }
}
