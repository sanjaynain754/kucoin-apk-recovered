package com.kubi.kumex.service;

import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.entity.PositionWrapperEntity;
import com.kubi.utils.extensions.C27041f;
import fm.C37569d;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.kumex.service.v */
/* JADX INFO: compiled from: KuMexService.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\u0006"}, m90084d2 = {"wrapperPositions", "", "Lcom/kubi/kumex/entity/PositionWrapperEntity;", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "isTrial", "", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKuMexService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuMexService.kt\ncom/kubi/kumex/service/KuMexServiceKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1241:1\n1869#2,2:1242\n*S KotlinDebug\n*F\n+ 1 KuMexService.kt\ncom/kubi/kumex/service/KuMexServiceKt\n*L\n1212#1:1242,2\n*E\n"})
public final class C16816v {
    /* JADX INFO: renamed from: b */
    public static final List<PositionWrapperEntity> m35908b(List<PositionEntity> list, boolean z11) {
        ArrayList arrayList = new ArrayList();
        for (PositionEntity positionEntity : list) {
            ContractEntity contractEntityM84661b = C37569d.m84661b(positionEntity);
            CharSequence charSequenceM84679t = C37569d.m84679t(positionEntity);
            String strM66668h = C27041f.m66668h(positionEntity.getSettleCurrency());
            String strM84682w = C37569d.m84682w(positionEntity, positionEntity.getUnrealisedPnl(), false, 2, null);
            String strM84663d = C37569d.m84663d(positionEntity);
            String strM84664e = C37569d.m84664e(positionEntity, contractEntityM84661b);
            String strM84676q = C37569d.m84676q(positionEntity);
            String strM84670k = C37569d.m84670k(positionEntity, contractEntityM84661b);
            String strM84668i = C37569d.m84668i(positionEntity);
            String strM84669j = C37569d.m84669j(positionEntity, contractEntityM84661b);
            String quoteCurrency = null;
            String strM84678s = C37569d.m84678s(positionEntity);
            CharSequence charSequenceM84680u = C37569d.m84680u(positionEntity);
            ContractEntity contractEntityM84661b2 = C37569d.m84661b(positionEntity);
            String spotCurrency = contractEntityM84661b2 != null ? contractEntityM84661b2.getSpotCurrency() : null;
            String symbol = positionEntity.getSymbol();
            String marginMode = positionEntity.getMarginMode();
            BigDecimal unrealisedPnl = positionEntity.getUnrealisedPnl();
            BigDecimal unrealisedRoePcnt = positionEntity.getUnrealisedRoePcnt();
            Long openingTimestamp = positionEntity.getOpeningTimestamp();
            ContractEntity contractEntityM84661b3 = C37569d.m84661b(positionEntity);
            if (contractEntityM84661b3 != null) {
                quoteCurrency = contractEntityM84661b3.getQuoteCurrency();
            }
            arrayList.add(new PositionWrapperEntity(charSequenceM84679t, strM66668h, strM84682w, unrealisedPnl, strM84678s, unrealisedRoePcnt, strM84668i, marginMode, strM84663d, charSequenceM84680u, symbol, strM84676q, strM84664e, strM84669j, strM84670k, spotCurrency, quoteCurrency, openingTimestamp, Boolean.valueOf(z11), positionEntity.getPrizeType()));
        }
        return arrayList;
    }
}
