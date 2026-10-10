package com.kubi.kumex.data.platform.model;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ContractMaintainEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/ContractMaintainEntity;", "", "pausedContracts", "", "", "cancelOnlyContracts", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getPausedContracts", "()Ljava/util/List;", "setPausedContracts", "(Ljava/util/List;)V", "getCancelOnlyContracts", "setCancelOnlyContracts", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ContractMaintainEntity {

    @Nullable
    private List<String> cancelOnlyContracts;

    @Nullable
    private List<String> pausedContracts;

    /* JADX WARN: Multi-variable type inference failed */
    public ContractMaintainEntity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public ContractMaintainEntity(@Nullable List<String> list, @Nullable List<String> list2) {
        this.pausedContracts = list;
        this.cancelOnlyContracts = list2;
    }

    @Nullable
    public final List<String> getCancelOnlyContracts() {
        return this.cancelOnlyContracts;
    }

    @Nullable
    public final List<String> getPausedContracts() {
        return this.pausedContracts;
    }

    public final void setCancelOnlyContracts(@Nullable List<String> list) {
        this.cancelOnlyContracts = list;
    }

    public final void setPausedContracts(@Nullable List<String> list) {
        this.pausedContracts = list;
    }

    public /* synthetic */ ContractMaintainEntity(List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : list2);
    }
}
