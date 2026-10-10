package com.kubi.tradebase.business.klineSettings;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.media3.extractor.text.ttml.TtmlNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KlineConfig.kt */
/* JADX INFO: loaded from: classes48.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006 "}, m90084d2 = {"Lcom/kubi/tradebase/business/klineSettings/KLineSettingConfig;", "Landroid/os/Parcelable;", "showHistoryOrder", "", "showActiveOrder", "<init>", "(ZZ)V", "getShowHistoryOrder", "()Z", "setShowHistoryOrder", "(Z)V", "getShowActiveOrder", "setShowActiveOrder", "isChanged", "history", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KLineSettingConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<KLineSettingConfig> CREATOR = new C25851a();
    private boolean showActiveOrder;
    private boolean showHistoryOrder;

    /* JADX INFO: renamed from: com.kubi.tradebase.business.klineSettings.KLineSettingConfig$a */
    /* JADX INFO: compiled from: KlineConfig.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25851a implements Parcelable.Creator<KLineSettingConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KLineSettingConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new KLineSettingConfig(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KLineSettingConfig[] newArray(int i11) {
            return new KLineSettingConfig[i11];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KLineSettingConfig() {
        boolean z11 = false;
        this(z11, z11, 3, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KLineSettingConfig)) {
            return false;
        }
        KLineSettingConfig kLineSettingConfig = (KLineSettingConfig) other;
        return this.showHistoryOrder == kLineSettingConfig.showHistoryOrder && this.showActiveOrder == kLineSettingConfig.showActiveOrder;
    }

    public KLineSettingConfig(boolean z11, boolean z12) {
        this.showHistoryOrder = z11;
        this.showActiveOrder = z12;
    }

    public static /* synthetic */ KLineSettingConfig copy$default(KLineSettingConfig kLineSettingConfig, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = kLineSettingConfig.showHistoryOrder;
        }
        if ((i11 & 2) != 0) {
            z12 = kLineSettingConfig.showActiveOrder;
        }
        return kLineSettingConfig.copy(z11, z12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowHistoryOrder() {
        return this.showHistoryOrder;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShowActiveOrder() {
        return this.showActiveOrder;
    }

    @NotNull
    public final KLineSettingConfig copy(boolean showHistoryOrder, boolean showActiveOrder) {
        return new KLineSettingConfig(showHistoryOrder, showActiveOrder);
    }

    public final boolean getShowActiveOrder() {
        return this.showActiveOrder;
    }

    public final boolean getShowHistoryOrder() {
        return this.showHistoryOrder;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.showHistoryOrder) * 31) + Boolean.hashCode(this.showActiveOrder);
    }

    public final boolean isChanged(boolean history, boolean open) {
        return (this.showHistoryOrder == history && this.showActiveOrder == open) ? false : true;
    }

    public final void setShowActiveOrder(boolean z11) {
        this.showActiveOrder = z11;
    }

    public final void setShowHistoryOrder(boolean z11) {
        this.showHistoryOrder = z11;
    }

    @NotNull
    public String toString() {
        return "KLineSettingConfig(showHistoryOrder=" + this.showHistoryOrder + ", showActiveOrder=" + this.showActiveOrder + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.showHistoryOrder ? 1 : 0);
        dest.writeInt(this.showActiveOrder ? 1 : 0);
    }

    public /* synthetic */ KLineSettingConfig(boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12);
    }
}
