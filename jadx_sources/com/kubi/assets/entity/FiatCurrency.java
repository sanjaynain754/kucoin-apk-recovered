package com.kubi.assets.entity;

import androidx.annotation.Keep;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetV2SettingEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/assets/entity/FiatCurrency;", "", "name", "", "symbol", TUIConstants.TUIChat.INPUT_MORE_ICON, "isChecked", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getSymbol", "setSymbol", "getIcon", "setIcon", "()Z", "setChecked", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FiatCurrency {

    @Nullable
    private String icon;
    private boolean isChecked;

    @Nullable
    private String name;

    @Nullable
    private String symbol;

    public FiatCurrency(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z11) {
        this.name = str;
        this.symbol = str2;
        this.icon = str3;
        this.isChecked = z11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiatCurrency)) {
            return false;
        }
        FiatCurrency fiatCurrency = (FiatCurrency) other;
        return Intrinsics.areEqual(this.name, fiatCurrency.name) && Intrinsics.areEqual(this.symbol, fiatCurrency.symbol) && Intrinsics.areEqual(this.icon, fiatCurrency.icon) && this.isChecked == fiatCurrency.isChecked;
    }

    public static /* synthetic */ FiatCurrency copy$default(FiatCurrency fiatCurrency, String str, String str2, String str3, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fiatCurrency.name;
        }
        if ((i11 & 2) != 0) {
            str2 = fiatCurrency.symbol;
        }
        if ((i11 & 4) != 0) {
            str3 = fiatCurrency.icon;
        }
        if ((i11 & 8) != 0) {
            z11 = fiatCurrency.isChecked;
        }
        return fiatCurrency.copy(str, str2, str3, z11);
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    @NotNull
    public final FiatCurrency copy(@Nullable String name, @Nullable String symbol, @Nullable String icon, boolean isChecked) {
        return new FiatCurrency(name, symbol, icon, isChecked);
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
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isChecked);
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    public final void setChecked(boolean z11) {
        this.isChecked = z11;
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
        return "FiatCurrency(name=" + this.name + ", symbol=" + this.symbol + ", icon=" + this.icon + ", isChecked=" + this.isChecked + ')';
    }

    public /* synthetic */ FiatCurrency(String str, String str2, String str3, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? false : z11);
    }
}
