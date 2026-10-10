package com.kubi.kucoin.home.cards;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaseCardData.kt */
/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010%\u001a\u00020\u0003H\u0016J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012¨\u0006+"}, m90084d2 = {"Lcom/kubi/kucoin/home/cards/BaseCardData;", "Landroid/os/Parcelable;", "width", "", "height", "orientation", "bg", "", "id", "type", "", "code", "weight", "<init>", "(IIIZILjava/lang/String;Ljava/lang/String;I)V", "getWidth", "()I", "setWidth", "(I)V", "getHeight", "setHeight", "getOrientation", "setOrientation", "getBg", "()Z", "setBg", "(Z)V", "getId", "setId", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "getCode", "setCode", "getWeight", "setWeight", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class BaseCardData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BaseCardData> CREATOR = new C15374a();
    private boolean bg;

    @Nullable
    private String code;
    private int height;
    private int id;
    private int orientation;

    @Nullable
    private String type;
    private int weight;
    private int width;

    /* JADX INFO: renamed from: com.kubi.kucoin.home.cards.BaseCardData$a */
    /* JADX INFO: compiled from: BaseCardData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15374a implements Parcelable.Creator<BaseCardData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseCardData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BaseCardData(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BaseCardData[] newArray(int i11) {
            return new BaseCardData[i11];
        }
    }

    public BaseCardData() {
        this(0, 0, 0, false, 0, null, null, 0, 255, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BaseCardData(int i11, int i12, int i13, boolean z11, int i14, @Nullable String str, @Nullable String str2, int i15) {
        this.width = i11;
        this.height = i12;
        this.orientation = i13;
        this.bg = z11;
        this.id = i14;
        this.type = str;
        this.code = str2;
        this.weight = i15;
    }

    public final boolean getBg() {
        return this.bg;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getId() {
        return this.id;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final int getWeight() {
        return this.weight;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setBg(boolean z11) {
        this.bg = z11;
    }

    public final void setCode(@Nullable String str) {
        this.code = str;
    }

    public final void setHeight(int i11) {
        this.height = i11;
    }

    public final void setId(int i11) {
        this.id = i11;
    }

    public final void setOrientation(int i11) {
        this.orientation = i11;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setWeight(int i11) {
        this.weight = i11;
    }

    public final void setWidth(int i11) {
        this.width = i11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.width);
        dest.writeInt(this.height);
        dest.writeInt(this.orientation);
        dest.writeInt(this.bg ? 1 : 0);
        dest.writeInt(this.id);
        dest.writeString(this.type);
        dest.writeString(this.code);
        dest.writeInt(this.weight);
    }

    public /* synthetic */ BaseCardData(int i11, int i12, int i13, boolean z11, int i14, String str, String str2, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? -1 : i11, (i16 & 2) != 0 ? -2 : i12, (i16 & 4) != 0 ? 1 : i13, (i16 & 8) != 0 ? false : z11, (i16 & 16) != 0 ? 0 : i14, (i16 & 32) != 0 ? null : str, (i16 & 64) != 0 ? null : str2, (i16 & 128) != 0 ? 0 : i15);
    }
}
