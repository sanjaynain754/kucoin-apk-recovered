package cv;

import com.kubi.data.entity.WsRankMarketSnapshotEntity;
import com.kubi.quotefacade.entity.RankEntity;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cv.e */
/* JADX INFO: compiled from: RankEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m90084d2 = {"convert", "Lcom/kubi/quotefacade/entity/RankEntity;", "input", "Lcom/kubi/data/entity/WsRankMarketSnapshotEntity;", "QuoteFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C36548e {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final RankEntity m81814a(@NotNull RankEntity rankEntity, @NotNull WsRankMarketSnapshotEntity input) {
        Intrinsics.checkNotNullParameter(rankEntity, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        rankEntity.setOrder(input.getOrder());
        rankEntity.setCurrency(input.getCurrency());
        rankEntity.setSymbol(input.getSymbol());
        rankEntity.setSymbolCode(input.getSymbolCode());
        rankEntity.setQuote(input.getQuote());
        rankEntity.setChangeRate(input.getChangeRate());
        rankEntity.setPrice(input.getPrice());
        rankEntity.setValue(input.getValue());
        rankEntity.setMarkCap(input.getMarkCap());
        rankEntity.setVolValue(input.getVolValue());
        rankEntity.setOpeningTime(input.getOpeningTime());
        rankEntity.setInverseSymbol(input.getInverseSymbol());
        rankEntity.setIconUrl(input.getIconUrl());
        return rankEntity;
    }
}
