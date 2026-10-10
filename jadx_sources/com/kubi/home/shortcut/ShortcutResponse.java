package com.kubi.home.shortcut;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ShortcutResponse.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/home/shortcut/ShortcutResponse;", "Landroid/os/Parcelable;", "navigationList", "", "Lcom/kubi/home/shortcut/FunctionEntity;", "iconResponse", "Lcom/kubi/home/shortcut/IconResponse;", "<init>", "(Ljava/util/List;Lcom/kubi/home/shortcut/IconResponse;)V", "getNavigationList", "()Ljava/util/List;", "getIconResponse", "()Lcom/kubi/home/shortcut/IconResponse;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ShortcutResponse implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ShortcutResponse> CREATOR = new C14861a();

    @Nullable
    private final IconResponse iconResponse;

    @Nullable
    private final List<FunctionEntity> navigationList;

    /* JADX INFO: renamed from: com.kubi.home.shortcut.ShortcutResponse$a */
    /* JADX INFO: compiled from: ShortcutResponse.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14861a implements Parcelable.Creator<ShortcutResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ShortcutResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(FunctionEntity.CREATOR.createFromParcel(parcel));
                }
            }
            return new ShortcutResponse(arrayList, parcel.readInt() != 0 ? IconResponse.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ShortcutResponse[] newArray(int i11) {
            return new ShortcutResponse[i11];
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
        if (!(other instanceof ShortcutResponse)) {
            return false;
        }
        ShortcutResponse shortcutResponse = (ShortcutResponse) other;
        return Intrinsics.areEqual(this.navigationList, shortcutResponse.navigationList) && Intrinsics.areEqual(this.iconResponse, shortcutResponse.iconResponse);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShortcutResponse copy$default(ShortcutResponse shortcutResponse, List list, IconResponse iconResponse, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = shortcutResponse.navigationList;
        }
        if ((i11 & 2) != 0) {
            iconResponse = shortcutResponse.iconResponse;
        }
        return shortcutResponse.copy(list, iconResponse);
    }

    @Nullable
    public final List<FunctionEntity> component1() {
        return this.navigationList;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final IconResponse getIconResponse() {
        return this.iconResponse;
    }

    @NotNull
    public final ShortcutResponse copy(@Nullable List<FunctionEntity> navigationList, @Nullable IconResponse iconResponse) {
        return new ShortcutResponse(navigationList, iconResponse);
    }

    @Nullable
    public final IconResponse getIconResponse() {
        return this.iconResponse;
    }

    @Nullable
    public final List<FunctionEntity> getNavigationList() {
        return this.navigationList;
    }

    public int hashCode() {
        List<FunctionEntity> list = this.navigationList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        IconResponse iconResponse = this.iconResponse;
        return iHashCode + (iconResponse != null ? iconResponse.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ShortcutResponse(navigationList=" + this.navigationList + ", iconResponse=" + this.iconResponse + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<FunctionEntity> list = this.navigationList;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<FunctionEntity> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        IconResponse iconResponse = this.iconResponse;
        if (iconResponse == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            iconResponse.writeToParcel(dest, flags);
        }
    }

    public ShortcutResponse(@Nullable List<FunctionEntity> list, @Nullable IconResponse iconResponse) {
        this.navigationList = list;
        this.iconResponse = iconResponse;
    }
}
