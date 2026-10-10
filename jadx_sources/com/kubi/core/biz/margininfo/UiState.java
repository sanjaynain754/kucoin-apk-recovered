package com.kubi.core.biz.margininfo;

import com.kubi.core.spot.entity.SpotInformationEntity;
import com.kubi.mvi.state.InterfaceC19284f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.biz.margininfo.MarginInfoContract$UiState, reason: from toString */
/* JADX INFO: compiled from: MarginInfoContract.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/core/biz/margininfo/MarginInfoContract$UiState;", "Lcom/kubi/mvi/state/IState;", "spotInformation", "Lcom/kubi/core/spot/entity/SpotInformationEntity;", "<init>", "(Lcom/kubi/core/spot/entity/SpotInformationEntity;)V", "getSpotInformation", "()Lcom/kubi/core/spot/entity/SpotInformationEntity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UiState implements InterfaceC19284f {

    @Nullable
    private final SpotInformationEntity spotInformation;

    /* JADX WARN: Multi-variable type inference failed */
    public UiState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UiState) && Intrinsics.areEqual(this.spotInformation, ((UiState) other).spotInformation);
    }

    public UiState(@Nullable SpotInformationEntity spotInformationEntity) {
        this.spotInformation = spotInformationEntity;
    }

    public int hashCode() {
        SpotInformationEntity spotInformationEntity = this.spotInformation;
        if (spotInformationEntity == null) {
            return 0;
        }
        return spotInformationEntity.hashCode();
    }

    @NotNull
    public String toString() {
        return "UiState(spotInformation=" + this.spotInformation + ')';
    }

    public /* synthetic */ UiState(SpotInformationEntity spotInformationEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : spotInformationEntity);
    }
}
