package com.kubi.assets.entity;

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
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: WithdrawEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\r\"\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006("}, m90084d2 = {"Lcom/kubi/assets/entity/WithdrawImgEntity;", "Landroid/os/Parcelable;", "id", "", "imgData", "phrases", "", "Lcom/kubi/assets/entity/Phrases;", "imgDataInfo", "Lcom/kubi/assets/entity/ImgDataInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/kubi/assets/entity/ImgDataInfo;)V", "getId", "()Ljava/lang/String;", "getImgData", "setImgData", "(Ljava/lang/String;)V", "getPhrases", "()Ljava/util/List;", "getImgDataInfo", "()Lcom/kubi/assets/entity/ImgDataInfo;", "getBase64Image", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WithdrawImgEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WithdrawImgEntity> CREATOR = new Creator();

    @Nullable
    private final String id;

    @Nullable
    private String imgData;

    @Nullable
    private final ImgDataInfo imgDataInfo;

    @Nullable
    private final List<Phrases> phrases;

    /* JADX INFO: compiled from: WithdrawEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<WithdrawImgEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawImgEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(Phrases.CREATOR.createFromParcel(parcel));
                }
            }
            return new WithdrawImgEntity(string, string2, arrayList, parcel.readInt() != 0 ? ImgDataInfo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawImgEntity[] newArray(int i11) {
            return new WithdrawImgEntity[i11];
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
        if (!(other instanceof WithdrawImgEntity)) {
            return false;
        }
        WithdrawImgEntity withdrawImgEntity = (WithdrawImgEntity) other;
        return Intrinsics.areEqual(this.id, withdrawImgEntity.id) && Intrinsics.areEqual(this.imgData, withdrawImgEntity.imgData) && Intrinsics.areEqual(this.phrases, withdrawImgEntity.phrases) && Intrinsics.areEqual(this.imgDataInfo, withdrawImgEntity.imgDataInfo);
    }

    @Nullable
    public final String getBase64Image() {
        List listSplit$default;
        try {
            String str = this.imgData;
            if (str != null && (listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null)) != null) {
                return (String) listSplit$default.get(1);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WithdrawImgEntity copy$default(WithdrawImgEntity withdrawImgEntity, String str, String str2, List list, ImgDataInfo imgDataInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = withdrawImgEntity.id;
        }
        if ((i11 & 2) != 0) {
            str2 = withdrawImgEntity.imgData;
        }
        if ((i11 & 4) != 0) {
            list = withdrawImgEntity.phrases;
        }
        if ((i11 & 8) != 0) {
            imgDataInfo = withdrawImgEntity.imgDataInfo;
        }
        return withdrawImgEntity.copy(str, str2, list, imgDataInfo);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImgData() {
        return this.imgData;
    }

    @Nullable
    public final List<Phrases> component3() {
        return this.phrases;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ImgDataInfo getImgDataInfo() {
        return this.imgDataInfo;
    }

    @NotNull
    public final WithdrawImgEntity copy(@Nullable String id2, @Nullable String imgData, @Nullable List<Phrases> phrases, @Nullable ImgDataInfo imgDataInfo) {
        return new WithdrawImgEntity(id2, imgData, phrases, imgDataInfo);
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getImgData() {
        return this.imgData;
    }

    @Nullable
    public final ImgDataInfo getImgDataInfo() {
        return this.imgDataInfo;
    }

    @Nullable
    public final List<Phrases> getPhrases() {
        return this.phrases;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.imgData;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Phrases> list = this.phrases;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        ImgDataInfo imgDataInfo = this.imgDataInfo;
        return iHashCode3 + (imgDataInfo != null ? imgDataInfo.hashCode() : 0);
    }

    public final void setImgData(@Nullable String str) {
        this.imgData = str;
    }

    @NotNull
    public String toString() {
        return "WithdrawImgEntity(id=" + this.id + ", imgData=" + this.imgData + ", phrases=" + this.phrases + ", imgDataInfo=" + this.imgDataInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.imgData);
        List<Phrases> list = this.phrases;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<Phrases> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        ImgDataInfo imgDataInfo = this.imgDataInfo;
        if (imgDataInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            imgDataInfo.writeToParcel(dest, flags);
        }
    }

    public WithdrawImgEntity(@Nullable String str, @Nullable String str2, @Nullable List<Phrases> list, @Nullable ImgDataInfo imgDataInfo) {
        this.id = str;
        this.imgData = str2;
        this.phrases = list;
        this.imgDataInfo = imgDataInfo;
    }
}
