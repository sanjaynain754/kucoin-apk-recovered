package com.kubi.quotefacade.helper;

import com.kubi.quotefacade.entity.WsFutureSnapshotEntity;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.quotefacade.helper.s2 */
/* JADX INFO: compiled from: QuoteWSDataController.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m90084d2 = {"toQuoteFutureEntity", "Lcom/kubi/quotefacade/entity/WsFutureSnapshotEntity;", "Lcom/kubi/data/entity/WsFutureSnapshotEntity;", "QuoteFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C22206s2 {
    /* JADX INFO: renamed from: b */
    public static final WsFutureSnapshotEntity m52113b(com.kubi.data.entity.WsFutureSnapshotEntity wsFutureSnapshotEntity) {
        return new WsFutureSnapshotEntity(wsFutureSnapshotEntity.getSymbol(), wsFutureSnapshotEntity.getVolume(), wsFutureSnapshotEntity.getTurnover(), wsFutureSnapshotEntity.getLastPrice(), wsFutureSnapshotEntity.getLowPrice(), wsFutureSnapshotEntity.getHighPrice(), wsFutureSnapshotEntity.getPriceChg(), wsFutureSnapshotEntity.getPriceChgPct(), null, null);
    }
}
