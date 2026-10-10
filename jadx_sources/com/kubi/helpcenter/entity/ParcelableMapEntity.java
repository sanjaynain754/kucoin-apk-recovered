package com.kubi.helpcenter.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ParcelableMapEntity.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012,\b\u0002\u0010\u0002\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003j\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003j\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u0005HÆ\u0003J7\u0010\u000b\u001a\u00020\u00002,\b\u0002\u0010\u0002\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003j\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u0005HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rR5\u0010\u0002\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003j\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/helpcenter/entity/ParcelableMapEntity;", "Landroid/os/Parcelable;", "map", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "<init>", "(Ljava/util/HashMap;)V", "getMap", "()Ljava/util/HashMap;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "HelpCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ParcelableMapEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ParcelableMapEntity> CREATOR = new C14479a();

    @Nullable
    private final HashMap<String, String> map;

    /* JADX INFO: renamed from: com.kubi.helpcenter.entity.ParcelableMapEntity$a */
    /* JADX INFO: compiled from: ParcelableMapEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14479a implements Parcelable.Creator<ParcelableMapEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ParcelableMapEntity createFromParcel(Parcel parcel) {
            HashMap map;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                map = null;
            } else {
                int i11 = parcel.readInt();
                HashMap map2 = new HashMap(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    map2.put(parcel.readString(), parcel.readString());
                }
                map = map2;
            }
            return new ParcelableMapEntity(map);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ParcelableMapEntity[] newArray(int i11) {
            return new ParcelableMapEntity[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ParcelableMapEntity() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ParcelableMapEntity) && Intrinsics.areEqual(this.map, ((ParcelableMapEntity) other).map);
    }

    public ParcelableMapEntity(@Nullable HashMap<String, String> map) {
        this.map = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ParcelableMapEntity copy$default(ParcelableMapEntity parcelableMapEntity, HashMap map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = parcelableMapEntity.map;
        }
        return parcelableMapEntity.copy(map);
    }

    @Nullable
    public final HashMap<String, String> component1() {
        return this.map;
    }

    @NotNull
    public final ParcelableMapEntity copy(@Nullable HashMap<String, String> map) {
        return new ParcelableMapEntity(map);
    }

    @Nullable
    public final HashMap<String, String> getMap() {
        return this.map;
    }

    public int hashCode() {
        HashMap<String, String> map = this.map;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    @NotNull
    public String toString() {
        return "ParcelableMapEntity(map=" + this.map + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        HashMap<String, String> map = this.map;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeString(entry.getValue());
        }
    }

    public /* synthetic */ ParcelableMapEntity(HashMap map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : map);
    }
}
