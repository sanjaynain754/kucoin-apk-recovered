package com.kubi.quotefacade.widgets.gembox;

import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.quotefacade.entity.ChanceGemBoxCurrency;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.quotefacade.widgets.gembox.GemboxWidgetContract$UIState, reason: from toString */
/* JADX INFO: compiled from: GemboxWidgetContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/gembox/GemboxWidgetContract$UIState;", "Lcom/kubi/mvi/state/IState;", "data", "Lcom/kubi/quotefacade/entity/ChanceGemBoxCurrency;", "<init>", "(Lcom/kubi/quotefacade/entity/ChanceGemBoxCurrency;)V", "getData", "()Lcom/kubi/quotefacade/entity/ChanceGemBoxCurrency;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UIState implements InterfaceC19284f {

    @Nullable
    private final ChanceGemBoxCurrency data;

    /* JADX WARN: Multi-variable type inference failed */
    public UIState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UIState) && Intrinsics.areEqual(this.data, ((UIState) other).data);
    }

    public UIState(@Nullable ChanceGemBoxCurrency chanceGemBoxCurrency) {
        this.data = chanceGemBoxCurrency;
    }

    @NotNull
    public final UIState copy(@Nullable ChanceGemBoxCurrency data) {
        return new UIState(data);
    }

    @Nullable
    public final ChanceGemBoxCurrency getData() {
        return this.data;
    }

    public int hashCode() {
        ChanceGemBoxCurrency chanceGemBoxCurrency = this.data;
        if (chanceGemBoxCurrency == null) {
            return 0;
        }
        return chanceGemBoxCurrency.hashCode();
    }

    @NotNull
    public String toString() {
        return "UIState(data=" + this.data + ')';
    }

    public /* synthetic */ UIState(ChanceGemBoxCurrency chanceGemBoxCurrency, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : chanceGemBoxCurrency);
    }
}
