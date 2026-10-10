package com.kubi.assets.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReqEvmRepeatEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/assets/entity/EvmRepeatEntity;", "", "address", "", "memo", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getMemo", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class EvmRepeatEntity {

    @NotNull
    private String address;

    @NotNull
    private final String memo;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EvmRepeatEntity)) {
            return false;
        }
        EvmRepeatEntity evmRepeatEntity = (EvmRepeatEntity) other;
        return Intrinsics.areEqual(this.address, evmRepeatEntity.address) && Intrinsics.areEqual(this.memo, evmRepeatEntity.memo);
    }

    public EvmRepeatEntity(@NotNull String address, @NotNull String memo) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(memo, "memo");
        this.address = address;
        this.memo = memo;
    }

    public static /* synthetic */ EvmRepeatEntity copy$default(EvmRepeatEntity evmRepeatEntity, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = evmRepeatEntity.address;
        }
        if ((i11 & 2) != 0) {
            str2 = evmRepeatEntity.memo;
        }
        return evmRepeatEntity.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMemo() {
        return this.memo;
    }

    @NotNull
    public final EvmRepeatEntity copy(@NotNull String address, @NotNull String memo) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(memo, "memo");
        return new EvmRepeatEntity(address, memo);
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    public final String getMemo() {
        return this.memo;
    }

    public int hashCode() {
        return (this.address.hashCode() * 31) + this.memo.hashCode();
    }

    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.address = str;
    }

    @NotNull
    public String toString() {
        return "EvmRepeatEntity(address=" + this.address + ", memo=" + this.memo + ')';
    }
}
