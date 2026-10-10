package p212dv;

import com.kubi.quotefacade.entity.MarketMenuEntity;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: dv.q */
/* JADX INFO: compiled from: MarketContainerContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/event/MarketContainerContract$MarketMenuDataEvent;", "Lcom/kubi/mvi/event/ISingleEvent;", "marketMenuEntity", "Lcom/kubi/quotefacade/entity/MarketMenuEntity;", "<init>", "(Lcom/kubi/quotefacade/entity/MarketMenuEntity;)V", "getMarketMenuEntity", "()Lcom/kubi/quotefacade/entity/MarketMenuEntity;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C36977q implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final MarketMenuEntity f82093a;

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final MarketMenuEntity getF82093a() {
        return this.f82093a;
    }

    public C36977q(@Nullable MarketMenuEntity marketMenuEntity) {
        this.f82093a = marketMenuEntity;
    }
}
