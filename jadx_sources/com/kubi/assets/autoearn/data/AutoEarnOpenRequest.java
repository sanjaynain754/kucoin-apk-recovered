package com.kubi.assets.autoearn.data;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AutoEarnOpenRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/assets/autoearn/data/AutoEarnOpenRequest;", "", "switchCurrency", "Lcom/kubi/assets/autoearn/data/SwitchCurrency;", "<init>", "(Lcom/kubi/assets/autoearn/data/SwitchCurrency;)V", "getSwitchCurrency", "()Lcom/kubi/assets/autoearn/data/SwitchCurrency;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AutoEarnOpenRequest {

    @SerializedName("switch_currency")
    @NotNull
    private final SwitchCurrency switchCurrency;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AutoEarnOpenRequest) && Intrinsics.areEqual(this.switchCurrency, ((AutoEarnOpenRequest) other).switchCurrency);
    }

    public AutoEarnOpenRequest(@NotNull SwitchCurrency switchCurrency) {
        Intrinsics.checkNotNullParameter(switchCurrency, "switchCurrency");
        this.switchCurrency = switchCurrency;
    }

    public static /* synthetic */ AutoEarnOpenRequest copy$default(AutoEarnOpenRequest autoEarnOpenRequest, SwitchCurrency switchCurrency, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            switchCurrency = autoEarnOpenRequest.switchCurrency;
        }
        return autoEarnOpenRequest.copy(switchCurrency);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SwitchCurrency getSwitchCurrency() {
        return this.switchCurrency;
    }

    @NotNull
    public final AutoEarnOpenRequest copy(@NotNull SwitchCurrency switchCurrency) {
        Intrinsics.checkNotNullParameter(switchCurrency, "switchCurrency");
        return new AutoEarnOpenRequest(switchCurrency);
    }

    @NotNull
    public final SwitchCurrency getSwitchCurrency() {
        return this.switchCurrency;
    }

    public int hashCode() {
        return this.switchCurrency.hashCode();
    }

    @NotNull
    public String toString() {
        return "AutoEarnOpenRequest(switchCurrency=" + this.switchCurrency + ')';
    }
}
