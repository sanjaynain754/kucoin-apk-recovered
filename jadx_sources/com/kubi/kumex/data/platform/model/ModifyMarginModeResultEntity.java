package com.kubi.kumex.data.platform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModifyMarginModeResultEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0010\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/ModifyMarginModeResultEntity;", "Landroid/os/Parcelable;", "marginMode", "", "", "errors", "", "Lcom/kubi/kumex/data/platform/model/ModifyMarginModeErrorEntity;", "<init>", "(Ljava/util/Map;Ljava/util/List;)V", "getMarginMode", "()Ljava/util/Map;", "getErrors", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ModifyMarginModeResultEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ModifyMarginModeResultEntity> CREATOR = new C15814a();

    @Nullable
    private final List<ModifyMarginModeErrorEntity> errors;

    @Nullable
    private final Map<String, String> marginMode;

    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.ModifyMarginModeResultEntity$a */
    /* JADX INFO: compiled from: ModifyMarginModeResultEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15814a implements Parcelable.Creator<ModifyMarginModeResultEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ModifyMarginModeResultEntity createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i11 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList.add(ModifyMarginModeErrorEntity.CREATOR.createFromParcel(parcel));
                }
            }
            return new ModifyMarginModeResultEntity(linkedHashMap, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ModifyMarginModeResultEntity[] newArray(int i11) {
            return new ModifyMarginModeResultEntity[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ModifyMarginModeResultEntity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModifyMarginModeResultEntity)) {
            return false;
        }
        ModifyMarginModeResultEntity modifyMarginModeResultEntity = (ModifyMarginModeResultEntity) other;
        return Intrinsics.areEqual(this.marginMode, modifyMarginModeResultEntity.marginMode) && Intrinsics.areEqual(this.errors, modifyMarginModeResultEntity.errors);
    }

    public ModifyMarginModeResultEntity(@Nullable Map<String, String> map, @Nullable List<ModifyMarginModeErrorEntity> list) {
        this.marginMode = map;
        this.errors = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ModifyMarginModeResultEntity copy$default(ModifyMarginModeResultEntity modifyMarginModeResultEntity, Map map, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = modifyMarginModeResultEntity.marginMode;
        }
        if ((i11 & 2) != 0) {
            list = modifyMarginModeResultEntity.errors;
        }
        return modifyMarginModeResultEntity.copy(map, list);
    }

    @Nullable
    public final Map<String, String> component1() {
        return this.marginMode;
    }

    @Nullable
    public final List<ModifyMarginModeErrorEntity> component2() {
        return this.errors;
    }

    @NotNull
    public final ModifyMarginModeResultEntity copy(@Nullable Map<String, String> marginMode, @Nullable List<ModifyMarginModeErrorEntity> errors) {
        return new ModifyMarginModeResultEntity(marginMode, errors);
    }

    @Nullable
    public final List<ModifyMarginModeErrorEntity> getErrors() {
        return this.errors;
    }

    @Nullable
    public final Map<String, String> getMarginMode() {
        return this.marginMode;
    }

    public int hashCode() {
        Map<String, String> map = this.marginMode;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        List<ModifyMarginModeErrorEntity> list = this.errors;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ModifyMarginModeResultEntity(marginMode=" + this.marginMode + ", errors=" + this.errors + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Map<String, String> map = this.marginMode;
        if (map == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeString(entry.getValue());
            }
        }
        List<ModifyMarginModeErrorEntity> list = this.errors;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<ModifyMarginModeErrorEntity> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ ModifyMarginModeResultEntity(Map map, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : map, (i11 & 2) != 0 ? null : list);
    }
}
