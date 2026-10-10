package p212dv;

import com.kubi.data.entity.TradeItemBean;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: dv.s */
/* JADX INFO: compiled from: MarketListContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/quotefacade/event/MarketListContract$MarketListDataEvent;", "Lcom/kubi/mvi/event/ISingleEvent;", "showList", "", "Lcom/kubi/data/entity/TradeItemBean;", "<init>", "(Ljava/util/List;)V", "getShowList", "()Ljava/util/List;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C36979s implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final List<TradeItemBean> f82095a;

    @Nullable
    /* JADX INFO: renamed from: a */
    public final List<TradeItemBean> m82797a() {
        return this.f82095a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C36979s(@Nullable List<? extends TradeItemBean> list) {
        this.f82095a = list;
    }
}
