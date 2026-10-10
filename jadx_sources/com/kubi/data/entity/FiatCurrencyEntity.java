package com.kubi.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatCurrencyEntity.kt */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006!"}, m90084d2 = {"Lcom/kubi/data/entity/FiatCurrencyEntity;", "Landroid/os/Parcelable;", "name", "", "symbol", TUIConstants.TUIChat.INPUT_MORE_ICON, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getSymbol", "setSymbol", "getIcon", "setIcon", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FiatCurrencyEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FiatCurrencyEntity> CREATOR = new Creator();

    @Nullable
    private String icon;

    @Nullable
    private String name;

    @Nullable
    private String symbol;

    /* JADX INFO: compiled from: FiatCurrencyEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FiatCurrencyEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatCurrencyEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FiatCurrencyEntity(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatCurrencyEntity[] newArray(int i11) {
            return new FiatCurrencyEntity[i11];
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
        if (!(other instanceof FiatCurrencyEntity)) {
            return false;
        }
        FiatCurrencyEntity fiatCurrencyEntity = (FiatCurrencyEntity) other;
        return Intrinsics.areEqual(this.name, fiatCurrencyEntity.name) && Intrinsics.areEqual(this.symbol, fiatCurrencyEntity.symbol) && Intrinsics.areEqual(this.icon, fiatCurrencyEntity.icon);
    }

    public static /* synthetic */ FiatCurrencyEntity copy$default(FiatCurrencyEntity fiatCurrencyEntity, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fiatCurrencyEntity.name;
        }
        if ((i11 & 2) != 0) {
            str2 = fiatCurrencyEntity.symbol;
        }
        if ((i11 & 4) != 0) {
            str3 = fiatCurrencyEntity.icon;
        }
        return fiatCurrencyEntity.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final FiatCurrencyEntity copy(@Nullable String name, @Nullable String symbol, @Nullable String icon) {
        return new FiatCurrencyEntity(name, symbol, icon);
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbol;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.icon;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    @NotNull
    public String toString() {
        return "FiatCurrencyEntity(name=" + this.name + ", symbol=" + this.symbol + ", icon=" + this.icon + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.symbol);
        dest.writeString(this.icon);
    }

    public FiatCurrencyEntity(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.name = str;
        this.symbol = str2;
        this.icon = str3;
    }
}
