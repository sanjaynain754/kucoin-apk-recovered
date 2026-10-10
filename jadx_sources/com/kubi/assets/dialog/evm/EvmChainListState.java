package com.kubi.assets.dialog.evm;

import com.google.firebase.messaging.Constants;
import com.kubi.assets.entity.EvmChainEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.dialog.evm.f, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: EvmChainListVM.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/assets/dialog/evm/EvmChainListState;", "", "isLoading", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "list", "", "Lcom/kubi/assets/entity/EvmChainEntity;", "<init>", "(ZLjava/lang/String;Ljava/util/List;)V", "()Z", "getError", "()Ljava/lang/String;", "getList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class EvmChainListState {

    /* JADX INFO: renamed from: a, reason: from toString */
    public final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final String error;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final List<EvmChainEntity> list;

    public EvmChainListState() {
        this(false, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EvmChainListState)) {
            return false;
        }
        EvmChainListState evmChainListState = (EvmChainListState) other;
        return this.isLoading == evmChainListState.isLoading && Intrinsics.areEqual(this.error, evmChainListState.error) && Intrinsics.areEqual(this.list, evmChainListState.list);
    }

    public EvmChainListState(boolean z11, @Nullable String str, @Nullable List<EvmChainEntity> list) {
        this.isLoading = z11;
        this.error = str;
        this.list = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ EvmChainListState m16292b(EvmChainListState evmChainListState, boolean z11, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = evmChainListState.isLoading;
        }
        if ((i11 & 2) != 0) {
            str = evmChainListState.error;
        }
        if ((i11 & 4) != 0) {
            list = evmChainListState.list;
        }
        return evmChainListState.m16293a(z11, str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final EvmChainListState m16293a(boolean z11, @Nullable String str, @Nullable List<EvmChainEntity> list) {
        return new EvmChainListState(z11, str, list);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final List<EvmChainEntity> m16294c() {
        return this.list;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        String str = this.error;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<EvmChainEntity> list = this.list;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EvmChainListState(isLoading=" + this.isLoading + ", error=" + this.error + ", list=" + this.list + ')';
    }

    public /* synthetic */ EvmChainListState(boolean z11, String str, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : list);
    }
}
