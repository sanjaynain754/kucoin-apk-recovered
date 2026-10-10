package com.kubi.profit.loss.analysis.lib;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisFragmentContract$ChangeCurrentRangeIntent */
/* JADX INFO: compiled from: AssetsProfitLossAnalysisFragmentContract.kt */
/* JADX INFO: loaded from: classes35.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisFragmentContract$ChangeCurrentRangeIntent;", "Lcom/kubi/mvi/state/IIntent;", SessionDescription.ATTR_RANGE, "", "<init>", "(Ljava/lang/String;)V", "getRange", "()Ljava/lang/String;", "ProfitLossAnalysisLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C21510x555bf7ec implements InterfaceC19282d {

    @NotNull
    private final String range;

    public C21510x555bf7ec(@NotNull String range) {
        Intrinsics.checkNotNullParameter(range, "range");
        this.range = range;
    }

    @NotNull
    public final String getRange() {
        return this.range;
    }
}
