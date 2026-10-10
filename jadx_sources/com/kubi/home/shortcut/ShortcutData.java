package com.kubi.home.shortcut;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.kucoin.home.cards.BaseCardData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ShortcutData.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/home/shortcut/ShortcutData;", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "data", "Lcom/kubi/home/shortcut/ShortcutResponse;", "<init>", "(Lcom/kubi/home/shortcut/ShortcutResponse;)V", "getData", "()Lcom/kubi/home/shortcut/ShortcutResponse;", "toString", "", "component1", "copy", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ShortcutData extends BaseCardData {

    @NotNull
    public static final Parcelable.Creator<ShortcutData> CREATOR = new C14860a();

    @Nullable
    private final ShortcutResponse data;

    /* JADX INFO: renamed from: com.kubi.home.shortcut.ShortcutData$a */
    /* JADX INFO: compiled from: ShortcutData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14860a implements Parcelable.Creator<ShortcutData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ShortcutData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShortcutData(parcel.readInt() == 0 ? null : ShortcutResponse.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ShortcutData[] newArray(int i11) {
            return new ShortcutData[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShortcutData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ShortcutData) && Intrinsics.areEqual(this.data, ((ShortcutData) other).data);
    }

    public ShortcutData(@Nullable ShortcutResponse shortcutResponse) {
        super(0, 0, 0, false, 0, null, null, 0, 255, null);
        this.data = shortcutResponse;
    }

    public static /* synthetic */ ShortcutData copy$default(ShortcutData shortcutData, ShortcutResponse shortcutResponse, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            shortcutResponse = shortcutData.data;
        }
        return shortcutData.copy(shortcutResponse);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ShortcutResponse getData() {
        return this.data;
    }

    @NotNull
    public final ShortcutData copy(@Nullable ShortcutResponse data) {
        return new ShortcutData(data);
    }

    @Nullable
    public final ShortcutResponse getData() {
        return this.data;
    }

    public int hashCode() {
        ShortcutResponse shortcutResponse = this.data;
        if (shortcutResponse == null) {
            return 0;
        }
        return shortcutResponse.hashCode();
    }

    @NotNull
    public String toString() {
        return "MENU";
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardData, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        ShortcutResponse shortcutResponse = this.data;
        if (shortcutResponse == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            shortcutResponse.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ ShortcutData(ShortcutResponse shortcutResponse, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : shortcutResponse);
    }
}
