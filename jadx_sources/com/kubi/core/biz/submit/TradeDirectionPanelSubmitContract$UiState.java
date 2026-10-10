package com.kubi.core.biz.submit;

import com.kubi.mvi.state.InterfaceC19284f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: TradeDirectionPanelSubmitVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/biz/submit/TradeDirectionPanelSubmitContract$UiState;", "Lcom/kubi/core/base/arch/mvi/IBizUiStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TradeDirectionPanelSubmitContract$UiState implements InterfaceC19284f {

    @NotNull
    public static final TradeDirectionPanelSubmitContract$UiState INSTANCE = new TradeDirectionPanelSubmitContract$UiState();

    public boolean equals(@Nullable Object other) {
        return this == other || (other instanceof TradeDirectionPanelSubmitContract$UiState);
    }

    @NotNull
    public String toString() {
        return "UiState";
    }

    private TradeDirectionPanelSubmitContract$UiState() {
    }

    public int hashCode() {
        return 1003464390;
    }
}
