package com.kubi.assets.dialog.evm;

import com.kubi.assets.entity.EvmRepeatAddressItemEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.dialog.evm.t, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: EvmRepeatChainVM.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003JK\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010 \u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, m90084d2 = {"Lcom/kubi/assets/dialog/evm/EvmRepeatChainItem;", "", "index", "", "address", "", "memo", "count", "children", "", "Lcom/kubi/assets/entity/EvmRepeatAddressItemEntity;", "expanded", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;ILjava/util/List;Z)V", "getIndex", "()I", "getAddress", "()Ljava/lang/String;", "getMemo", "getCount", "getChildren", "()Ljava/util/List;", "getExpanded", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class EvmRepeatChainItem {

    /* JADX INFO: renamed from: a, reason: from toString */
    public final int index;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String address;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final String memo;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final int count;

    /* JADX INFO: renamed from: e, reason: from toString */
    @NotNull
    public final List<EvmRepeatAddressItemEntity> children;

    /* JADX INFO: renamed from: f, reason: from toString */
    public final boolean expanded;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EvmRepeatChainItem)) {
            return false;
        }
        EvmRepeatChainItem evmRepeatChainItem = (EvmRepeatChainItem) other;
        return this.index == evmRepeatChainItem.index && Intrinsics.areEqual(this.address, evmRepeatChainItem.address) && Intrinsics.areEqual(this.memo, evmRepeatChainItem.memo) && this.count == evmRepeatChainItem.count && Intrinsics.areEqual(this.children, evmRepeatChainItem.children) && this.expanded == evmRepeatChainItem.expanded;
    }

    public EvmRepeatChainItem(int i11, @NotNull String address, @NotNull String memo, int i12, @NotNull List<EvmRepeatAddressItemEntity> children, boolean z11) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(memo, "memo");
        Intrinsics.checkNotNullParameter(children, "children");
        this.index = i11;
        this.address = address;
        this.memo = memo;
        this.count = i12;
        this.children = children;
        this.expanded = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ EvmRepeatChainItem m16301b(EvmRepeatChainItem evmRepeatChainItem, int i11, String str, String str2, int i12, List list, boolean z11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = evmRepeatChainItem.index;
        }
        if ((i13 & 2) != 0) {
            str = evmRepeatChainItem.address;
        }
        if ((i13 & 4) != 0) {
            str2 = evmRepeatChainItem.memo;
        }
        if ((i13 & 8) != 0) {
            i12 = evmRepeatChainItem.count;
        }
        if ((i13 & 16) != 0) {
            list = evmRepeatChainItem.children;
        }
        if ((i13 & 32) != 0) {
            z11 = evmRepeatChainItem.expanded;
        }
        List list2 = list;
        boolean z12 = z11;
        return evmRepeatChainItem.m16302a(i11, str, str2, i12, list2, z12);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final EvmRepeatChainItem m16302a(int i11, @NotNull String address, @NotNull String memo, int i12, @NotNull List<EvmRepeatAddressItemEntity> children, boolean z11) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(memo, "memo");
        Intrinsics.checkNotNullParameter(children, "children");
        return new EvmRepeatChainItem(i11, address, memo, i12, children, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<EvmRepeatAddressItemEntity> m16304d() {
        return this.children;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getExpanded() {
        return this.expanded;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getMemo() {
        return this.memo;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.index) * 31) + this.address.hashCode()) * 31) + this.memo.hashCode()) * 31) + Integer.hashCode(this.count)) * 31) + this.children.hashCode()) * 31) + Boolean.hashCode(this.expanded);
    }

    @NotNull
    public String toString() {
        return "EvmRepeatChainItem(index=" + this.index + ", address=" + this.address + ", memo=" + this.memo + ", count=" + this.count + ", children=" + this.children + ", expanded=" + this.expanded + ')';
    }
}
