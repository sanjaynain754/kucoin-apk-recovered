package p414kv;

import com.kubi.quotefacade.entity.HoldingAlphaData;
import com.kubi.quotefacade.entity.HoldingAlphaEntity;
import com.kubi.quotefacade.entity.HoldingData;
import com.kubi.quotefacade.entity.HoldingEntity;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kv.f */
/* JADX INFO: compiled from: HoldingDataMapper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/mapper/HoldingDataMapper;", "Lcom/kubi/quotefacade/mapper/IMapper;", "Lcom/kubi/quotefacade/entity/HoldingAlphaData;", "Lcom/kubi/quotefacade/entity/HoldingData;", "<init>", "()V", "map", "input", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHoldingDataMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HoldingDataMapper.kt\ncom/kubi/quotefacade/mapper/HoldingDataMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,38:1\n1563#2:39\n1634#2,3:40\n*S KotlinDebug\n*F\n+ 1 HoldingDataMapper.kt\ncom/kubi/quotefacade/mapper/HoldingDataMapper\n*L\n17#1:39\n17#1:40,3\n*E\n"})
public final class C41990f implements InterfaceC41991g<HoldingAlphaData, HoldingData> {
    @Override // p414kv.InterfaceC41991g
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public HoldingData mo51723a(@NotNull HoldingAlphaData input) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(input, "input");
        String accountType = input.getAccountType();
        Long lastUpdateTime = input.getLastUpdateTime();
        List<HoldingAlphaEntity> list = input.getList();
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (HoldingAlphaEntity holdingAlphaEntity : list) {
                arrayList.add(new HoldingEntity(holdingAlphaEntity.getDisplayToken(), "", "", holdingAlphaEntity.getPrice(), holdingAlphaEntity.getPriceRate(), holdingAlphaEntity.getTradingVolume(), "", holdingAlphaEntity.getToken(), holdingAlphaEntity.getExternalChain(), holdingAlphaEntity.getTokenIcon(), holdingAlphaEntity.getChainIcon(), holdingAlphaEntity.getTokenBridgeId(), true, holdingAlphaEntity.getDisplayToken(), holdingAlphaEntity.getAlphaMarks()));
            }
        } else {
            arrayList = null;
        }
        return new HoldingData(arrayList, accountType, lastUpdateTime);
    }
}
