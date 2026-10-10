package ug;

import com.kubi.kumex.data.trade.model.PositionEntity;
import io.reactivex.Observable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: ug.a */
/* JADX INFO: compiled from: IIsolatedBizInterface.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/function/isolated/IIsolatedAssetsService;", "", "observePositions", "Lio/reactivex/Observable;", "", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "isTrial", "", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC45232a {
    @NotNull
    /* JADX INFO: renamed from: G */
    Observable<List<PositionEntity>> mo93938G(boolean z11);
}
