package com.kubi.user.tag.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.user.model.UserTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UserTagRequest.kt */
/* JADX INFO: loaded from: classes53.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/user/tag/entity/UserTagRequest;", "Landroid/os/Parcelable;", "userTagList", "", "Lcom/kubi/user/model/UserTag;", "<init>", "(Ljava/util/List;)V", "getUserTagList", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UserTagRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UserTagRequest> CREATOR = new C26811a();

    @NotNull
    private final List<UserTag> userTagList;

    /* JADX INFO: renamed from: com.kubi.user.tag.entity.UserTagRequest$a */
    /* JADX INFO: compiled from: UserTagRequest.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26811a implements Parcelable.Creator<UserTagRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UserTagRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(parcel.readParcelable(UserTagRequest.class.getClassLoader()));
            }
            return new UserTagRequest(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UserTagRequest[] newArray(int i11) {
            return new UserTagRequest[i11];
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
        return (other instanceof UserTagRequest) && Intrinsics.areEqual(this.userTagList, ((UserTagRequest) other).userTagList);
    }

    public UserTagRequest(@NotNull List<UserTag> userTagList) {
        Intrinsics.checkNotNullParameter(userTagList, "userTagList");
        this.userTagList = userTagList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserTagRequest copy$default(UserTagRequest userTagRequest, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = userTagRequest.userTagList;
        }
        return userTagRequest.copy(list);
    }

    @NotNull
    public final List<UserTag> component1() {
        return this.userTagList;
    }

    @NotNull
    public final UserTagRequest copy(@NotNull List<UserTag> userTagList) {
        Intrinsics.checkNotNullParameter(userTagList, "userTagList");
        return new UserTagRequest(userTagList);
    }

    @NotNull
    public final List<UserTag> getUserTagList() {
        return this.userTagList;
    }

    public int hashCode() {
        return this.userTagList.hashCode();
    }

    @NotNull
    public String toString() {
        return "UserTagRequest(userTagList=" + this.userTagList + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<UserTag> list = this.userTagList;
        dest.writeInt(list.size());
        Iterator<UserTag> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
    }
}
