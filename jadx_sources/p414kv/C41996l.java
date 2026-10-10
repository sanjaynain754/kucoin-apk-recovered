package p414kv;

import com.kubi.data.entity.WsAlphaSnapshotEntity;
import com.kubi.quotefacade.entity.AlphaItemEntity;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kv.l */
/* JADX INFO: compiled from: WSEntityMapper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m90084d2 = {"convert", "Lcom/kubi/quotefacade/entity/AlphaItemEntity;", "wsItem", "Lcom/kubi/data/entity/WsAlphaSnapshotEntity;", "QuoteFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C41996l {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final AlphaItemEntity m92078a(@NotNull AlphaItemEntity alphaItemEntity, @NotNull WsAlphaSnapshotEntity wsItem) {
        Intrinsics.checkNotNullParameter(alphaItemEntity, "<this>");
        Intrinsics.checkNotNullParameter(wsItem, "wsItem");
        alphaItemEntity.setTokenIcon(wsItem.getTokenIcon());
        alphaItemEntity.setChainIcon(wsItem.getChainIcon());
        alphaItemEntity.setTokenBridgeId(wsItem.getTokenBridgeId());
        alphaItemEntity.setPrice(wsItem.getPrice());
        alphaItemEntity.setTradingVolume(wsItem.getTradingVolume());
        alphaItemEntity.setPriceRate(wsItem.getPriceRate());
        alphaItemEntity.setDisplayToken(wsItem.getDisplayToken());
        return alphaItemEntity;
    }
}
