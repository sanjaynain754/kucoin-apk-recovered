package sg;

import com.kubi.kumex.data.platform.model.MarginModeInfoEntity;
import com.kubi.kumex.data.trade.model.SymbolsCrossLeverage;
import io.reactivex.Observable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p559qg.InterfaceC43729a;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: sg.d */
/* JADX INFO: compiled from: ICrossBizInterface.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/function/cross/IMultiSocketCrossApi;", "Lcom/kubi/function/IMultiFunction;", "observeMarginMode", "Lio/reactivex/Observable;", "", "", "Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;", "isTrial", "", "observeCrossLeverage", "Lcom/kubi/kumex/data/trade/model/SymbolsCrossLeverage;", "observeOccupancyBalance", "", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC44407d extends InterfaceC43729a {
    @NotNull
    /* JADX INFO: renamed from: C */
    Observable<SymbolsCrossLeverage> mo86196C(boolean z11);

    @NotNull
    /* JADX INFO: renamed from: E */
    Observable<Map<String, MarginModeInfoEntity>> mo86197E(boolean z11);

    @NotNull
    /* JADX INFO: renamed from: p */
    Observable<Object> mo86200p(boolean z11);
}
