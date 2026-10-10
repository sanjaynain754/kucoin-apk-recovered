package com.kubi.assets.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AccountOrderEntity.kt */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/assets/entity/SetAccountSortEntity;", "", "displayMode", "", "balanceCurrency", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDisplayMode", "()Ljava/lang/String;", "getBalanceCurrency", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SetAccountSortEntity {

    @NotNull
    private final String balanceCurrency;

    @NotNull
    private final String displayMode;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetAccountSortEntity)) {
            return false;
        }
        SetAccountSortEntity setAccountSortEntity = (SetAccountSortEntity) other;
        return Intrinsics.areEqual(this.displayMode, setAccountSortEntity.displayMode) && Intrinsics.areEqual(this.balanceCurrency, setAccountSortEntity.balanceCurrency);
    }

    public SetAccountSortEntity(@NotNull String displayMode, @NotNull String balanceCurrency) {
        Intrinsics.checkNotNullParameter(displayMode, "displayMode");
        Intrinsics.checkNotNullParameter(balanceCurrency, "balanceCurrency");
        this.displayMode = displayMode;
        this.balanceCurrency = balanceCurrency;
    }

    public static /* synthetic */ SetAccountSortEntity copy$default(SetAccountSortEntity setAccountSortEntity, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = setAccountSortEntity.displayMode;
        }
        if ((i11 & 2) != 0) {
            str2 = setAccountSortEntity.balanceCurrency;
        }
        return setAccountSortEntity.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDisplayMode() {
        return this.displayMode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBalanceCurrency() {
        return this.balanceCurrency;
    }

    @NotNull
    public final SetAccountSortEntity copy(@NotNull String displayMode, @NotNull String balanceCurrency) {
        Intrinsics.checkNotNullParameter(displayMode, "displayMode");
        Intrinsics.checkNotNullParameter(balanceCurrency, "balanceCurrency");
        return new SetAccountSortEntity(displayMode, balanceCurrency);
    }

    @NotNull
    public final String getBalanceCurrency() {
        return this.balanceCurrency;
    }

    @NotNull
    public final String getDisplayMode() {
        return this.displayMode;
    }

    public int hashCode() {
        return (this.displayMode.hashCode() * 31) + this.balanceCurrency.hashCode();
    }

    @NotNull
    public String toString() {
        return "SetAccountSortEntity(displayMode=" + this.displayMode + ", balanceCurrency=" + this.balanceCurrency + ')';
    }
}
