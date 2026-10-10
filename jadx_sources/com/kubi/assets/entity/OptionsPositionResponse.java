package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006%"}, m90084d2 = {"Lcom/kubi/assets/entity/OptionsPositionResponse;", "Landroid/os/Parcelable;", "context", "", "hasNext", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/assets/entity/OptionsPositionEntity;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getContext", "()Ljava/lang/String;", "setContext", "(Ljava/lang/String;)V", "getHasNext", "setHasNext", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OptionsPositionResponse implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OptionsPositionResponse> CREATOR = new Creator();

    @Nullable
    private String context;

    @Nullable
    private String hasNext;

    @Nullable
    private List<OptionsPositionEntity> items;

    /* JADX INFO: compiled from: AssetEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<OptionsPositionResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionsPositionResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(OptionsPositionEntity.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new OptionsPositionResponse(string, string2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionsPositionResponse[] newArray(int i11) {
            return new OptionsPositionResponse[i11];
        }
    }

    public OptionsPositionResponse() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsPositionResponse)) {
            return false;
        }
        OptionsPositionResponse optionsPositionResponse = (OptionsPositionResponse) other;
        return Intrinsics.areEqual(this.context, optionsPositionResponse.context) && Intrinsics.areEqual(this.hasNext, optionsPositionResponse.hasNext) && Intrinsics.areEqual(this.items, optionsPositionResponse.items);
    }

    public OptionsPositionResponse(@Nullable String str, @Nullable String str2, @Nullable List<OptionsPositionEntity> list) {
        this.context = str;
        this.hasNext = str2;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionsPositionResponse copy$default(OptionsPositionResponse optionsPositionResponse, String str, String str2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = optionsPositionResponse.context;
        }
        if ((i11 & 2) != 0) {
            str2 = optionsPositionResponse.hasNext;
        }
        if ((i11 & 4) != 0) {
            list = optionsPositionResponse.items;
        }
        return optionsPositionResponse.copy(str, str2, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHasNext() {
        return this.hasNext;
    }

    @Nullable
    public final List<OptionsPositionEntity> component3() {
        return this.items;
    }

    @NotNull
    public final OptionsPositionResponse copy(@Nullable String context, @Nullable String hasNext, @Nullable List<OptionsPositionEntity> items) {
        return new OptionsPositionResponse(context, hasNext, items);
    }

    @Nullable
    public final String getContext() {
        return this.context;
    }

    @Nullable
    public final String getHasNext() {
        return this.hasNext;
    }

    @Nullable
    public final List<OptionsPositionEntity> getItems() {
        return this.items;
    }

    public int hashCode() {
        String str = this.context;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.hasNext;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<OptionsPositionEntity> list = this.items;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final void setContext(@Nullable String str) {
        this.context = str;
    }

    public final void setHasNext(@Nullable String str) {
        this.hasNext = str;
    }

    public final void setItems(@Nullable List<OptionsPositionEntity> list) {
        this.items = list;
    }

    @NotNull
    public String toString() {
        return "OptionsPositionResponse(context=" + this.context + ", hasNext=" + this.hasNext + ", items=" + this.items + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.context);
        dest.writeString(this.hasNext);
        List<OptionsPositionEntity> list = this.items;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<OptionsPositionEntity> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ OptionsPositionResponse(String str, String str2, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : list);
    }
}
