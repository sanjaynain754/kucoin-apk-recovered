package p414kv;

import com.kubi.quotefacade.entity.RankEntity;
import com.kubi.quotefacade.entity.RankFuturesEntity;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kv.j */
/* JADX INFO: compiled from: RankEntityMapper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/mapper/RankEntityMapper;", "Lcom/kubi/quotefacade/mapper/IMapper;", "Lcom/kubi/quotefacade/entity/RankFuturesEntity;", "Lcom/kubi/quotefacade/entity/RankEntity;", "<init>", "()V", "map", "input", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C41994j implements InterfaceC41991g<RankFuturesEntity, RankEntity> {
    @Override // p414kv.InterfaceC41991g
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RankEntity mo51723a(@NotNull RankFuturesEntity input) {
        Intrinsics.checkNotNullParameter(input, "input");
        RankEntity rankEntity = new RankEntity(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        rankEntity.setOrder(input.getOrder());
        rankEntity.setCurrency(input.getCrypto());
        rankEntity.setSymbol(input.getSymbol());
        rankEntity.setQuote(input.getQuoteCrypto());
        rankEntity.setChangeRate(input.getLast24HourRate());
        rankEntity.setPrice(input.getLastPrice());
        rankEntity.setVolValue(input.getLast24HourTradingVolume());
        rankEntity.setOpeningTime(input.getOpeningTime());
        rankEntity.setInverseSymbol(Boolean.valueOf(input.getInverseSymbol()));
        return rankEntity;
    }
}
