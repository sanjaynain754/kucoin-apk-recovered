package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChainBackDeleteEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J,\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/ChainBackDeleteEntity;", "Landroid/os/Parcelable;", DbParams.KEY_CHANNEL_RESULT, "", "outOfBoundsDelete", "", "", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;)V", "getResult", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOutOfBoundsDelete", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/util/List;)Lcom/kubi/quotefacade/entity/ChainBackDeleteEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ChainBackDeleteEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ChainBackDeleteEntity> CREATOR = new C21873a();

    @Nullable
    private final List<String> outOfBoundsDelete;

    @Nullable
    private final Boolean result;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.ChainBackDeleteEntity$a */
    /* JADX INFO: compiled from: ChainBackDeleteEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21873a implements Parcelable.Creator<ChainBackDeleteEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChainBackDeleteEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ChainBackDeleteEntity(boolValueOf, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ChainBackDeleteEntity[] newArray(int i11) {
            return new ChainBackDeleteEntity[i11];
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
        if (!(other instanceof ChainBackDeleteEntity)) {
            return false;
        }
        ChainBackDeleteEntity chainBackDeleteEntity = (ChainBackDeleteEntity) other;
        return Intrinsics.areEqual(this.result, chainBackDeleteEntity.result) && Intrinsics.areEqual(this.outOfBoundsDelete, chainBackDeleteEntity.outOfBoundsDelete);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChainBackDeleteEntity copy$default(ChainBackDeleteEntity chainBackDeleteEntity, Boolean bool, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = chainBackDeleteEntity.result;
        }
        if ((i11 & 2) != 0) {
            list = chainBackDeleteEntity.outOfBoundsDelete;
        }
        return chainBackDeleteEntity.copy(bool, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getResult() {
        return this.result;
    }

    @Nullable
    public final List<String> component2() {
        return this.outOfBoundsDelete;
    }

    @NotNull
    public final ChainBackDeleteEntity copy(@Nullable Boolean result, @Nullable List<String> outOfBoundsDelete) {
        return new ChainBackDeleteEntity(result, outOfBoundsDelete);
    }

    @Nullable
    public final List<String> getOutOfBoundsDelete() {
        return this.outOfBoundsDelete;
    }

    @Nullable
    public final Boolean getResult() {
        return this.result;
    }

    public int hashCode() {
        Boolean bool = this.result;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<String> list = this.outOfBoundsDelete;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ChainBackDeleteEntity(result=" + this.result + ", outOfBoundsDelete=" + this.outOfBoundsDelete + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.result;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            dest.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        dest.writeInt(BooleanValue);
        dest.writeStringList(this.outOfBoundsDelete);
    }

    public ChainBackDeleteEntity(@Nullable Boolean bool, @Nullable List<String> list) {
        this.result = bool;
        this.outOfBoundsDelete = list;
    }
}
