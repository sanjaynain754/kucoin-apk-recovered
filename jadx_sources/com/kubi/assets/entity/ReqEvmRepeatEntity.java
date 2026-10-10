package com.kubi.assets.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReqEvmRepeatEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/assets/entity/ReqEvmRepeatEntity;", "", "addresses", "", "Lcom/kubi/assets/entity/EvmRepeatEntity;", "<init>", "(Ljava/util/List;)V", "getAddresses", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ReqEvmRepeatEntity {

    @NotNull
    private final List<EvmRepeatEntity> addresses;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ReqEvmRepeatEntity) && Intrinsics.areEqual(this.addresses, ((ReqEvmRepeatEntity) other).addresses);
    }

    public ReqEvmRepeatEntity(@NotNull List<EvmRepeatEntity> addresses) {
        Intrinsics.checkNotNullParameter(addresses, "addresses");
        this.addresses = addresses;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReqEvmRepeatEntity copy$default(ReqEvmRepeatEntity reqEvmRepeatEntity, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = reqEvmRepeatEntity.addresses;
        }
        return reqEvmRepeatEntity.copy(list);
    }

    @NotNull
    public final List<EvmRepeatEntity> component1() {
        return this.addresses;
    }

    @NotNull
    public final ReqEvmRepeatEntity copy(@NotNull List<EvmRepeatEntity> addresses) {
        Intrinsics.checkNotNullParameter(addresses, "addresses");
        return new ReqEvmRepeatEntity(addresses);
    }

    @NotNull
    public final List<EvmRepeatEntity> getAddresses() {
        return this.addresses;
    }

    public int hashCode() {
        return this.addresses.hashCode();
    }

    @NotNull
    public String toString() {
        return "ReqEvmRepeatEntity(addresses=" + this.addresses + ')';
    }
}
