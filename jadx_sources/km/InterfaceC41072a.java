package km;

import com.kubi.kumex.market.ContractObject;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: km.a */
/* JADX INFO: compiled from: AdapterData.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/kumex/market/tradingArea/adapter/AdapterData;", "", "getList", "", "Lcom/kubi/kumex/market/ContractObject;", "notifySetDataChanged", "", "data", "removeItem", "index", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC41072a {
    @NotNull
    /* JADX INFO: renamed from: a */
    List<ContractObject> mo90050a();

    /* JADX INFO: renamed from: c */
    void mo90051c(@NotNull List<? extends ContractObject> list);

    void removeItem(int index);
}
