package com.kubi.home.setting;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.kucoin.home.cards.BaseCardData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SettingCardData.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/home/setting/SettingCardData;", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SettingCardData extends BaseCardData {

    @NotNull
    public static final Parcelable.Creator<SettingCardData> CREATOR = new C14849a();

    @NotNull
    private final String url;

    /* JADX INFO: renamed from: com.kubi.home.setting.SettingCardData$a */
    /* JADX INFO: compiled from: SettingCardData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14849a implements Parcelable.Creator<SettingCardData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SettingCardData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SettingCardData(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SettingCardData[] newArray(int i11) {
            return new SettingCardData[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SettingCardData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SettingCardData) && Intrinsics.areEqual(this.url, ((SettingCardData) other).url);
    }

    public /* synthetic */ SettingCardData(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "card/config" : str);
    }

    public static /* synthetic */ SettingCardData copy$default(SettingCardData settingCardData, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = settingCardData.url;
        }
        return settingCardData.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final SettingCardData copy(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new SettingCardData(url);
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    @NotNull
    public String toString() {
        return "SettingCardData(url=" + this.url + ')';
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardData, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.url);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingCardData(@NotNull String url) {
        super(0, 0, 0, false, 0, "SETTING", "setting", 0, 159, null);
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
    }
}
