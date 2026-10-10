package p212dv;

import com.kubi.data.entity.WsMarketSnapshotEntity;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: dv.u */
/* JADX INFO: compiled from: MarketListContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/quotefacade/event/MarketListContract$WSSpotRegister;", "Lcom/kubi/mvi/event/ISingleEvent;", "wsSpotEntities", "", "Lcom/kubi/data/entity/WsMarketSnapshotEntity;", "<init>", "(Ljava/util/List;)V", "getWsSpotEntities", "()Ljava/util/List;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C36981u implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final List<WsMarketSnapshotEntity> f82097a;

    /* JADX WARN: Multi-variable type inference failed */
    public C36981u() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C36981u(@Nullable List<WsMarketSnapshotEntity> list) {
        this.f82097a = list;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final List<WsMarketSnapshotEntity> m82799a() {
        return this.f82097a;
    }

    public /* synthetic */ C36981u(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list);
    }
}
