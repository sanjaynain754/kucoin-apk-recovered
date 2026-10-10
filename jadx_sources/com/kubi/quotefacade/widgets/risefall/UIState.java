package com.kubi.quotefacade.widgets.risefall;

import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.quotefacade.entity.RiseFallEntity;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.quotefacade.widgets.risefall.RiseFallContract$UIState, reason: from toString */
/* JADX INFO: compiled from: RiseFallContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/risefall/RiseFallContract$UIState;", "Lcom/kubi/mvi/state/IState;", "data", "Lcom/kubi/quotefacade/entity/RiseFallEntity;", "rateUp", "Ljava/math/BigDecimal;", "rateDown", "<init>", "(Lcom/kubi/quotefacade/entity/RiseFallEntity;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getData", "()Lcom/kubi/quotefacade/entity/RiseFallEntity;", "getRateUp", "()Ljava/math/BigDecimal;", "getRateDown", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UIState implements InterfaceC19284f {

    @Nullable
    private final RiseFallEntity data;

    @Nullable
    private final BigDecimal rateDown;

    @Nullable
    private final BigDecimal rateUp;

    public UIState() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return Intrinsics.areEqual(this.data, uIState.data) && Intrinsics.areEqual(this.rateUp, uIState.rateUp) && Intrinsics.areEqual(this.rateDown, uIState.rateDown);
    }

    public UIState(@Nullable RiseFallEntity riseFallEntity, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2) {
        this.data = riseFallEntity;
        this.rateUp = bigDecimal;
        this.rateDown = bigDecimal2;
    }

    public static /* synthetic */ UIState copy$default(UIState uIState, RiseFallEntity riseFallEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            riseFallEntity = uIState.data;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = uIState.rateUp;
        }
        if ((i11 & 4) != 0) {
            bigDecimal2 = uIState.rateDown;
        }
        return uIState.copy(riseFallEntity, bigDecimal, bigDecimal2);
    }

    @NotNull
    public final UIState copy(@Nullable RiseFallEntity data, @Nullable BigDecimal rateUp, @Nullable BigDecimal rateDown) {
        return new UIState(data, rateUp, rateDown);
    }

    @Nullable
    public final RiseFallEntity getData() {
        return this.data;
    }

    @Nullable
    public final BigDecimal getRateDown() {
        return this.rateDown;
    }

    @Nullable
    public final BigDecimal getRateUp() {
        return this.rateUp;
    }

    public int hashCode() {
        RiseFallEntity riseFallEntity = this.data;
        int iHashCode = (riseFallEntity == null ? 0 : riseFallEntity.hashCode()) * 31;
        BigDecimal bigDecimal = this.rateUp;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.rateDown;
        return iHashCode2 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UIState(data=" + this.data + ", rateUp=" + this.rateUp + ", rateDown=" + this.rateDown + ')';
    }

    public /* synthetic */ UIState(RiseFallEntity riseFallEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : riseFallEntity, (i11 & 2) != 0 ? null : bigDecimal, (i11 & 4) != 0 ? null : bigDecimal2);
    }
}
