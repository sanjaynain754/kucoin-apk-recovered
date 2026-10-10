package com.kubi.quotefacade.mapper;

import com.kubi.quotefacade.entity.HoldingCombinedData;
import com.kubi.quotefacade.entity.HoldingCombinedItem;
import com.kubi.quotefacade.entity.HoldingCombinedItemData;
import com.kubi.quotefacade.entity.HoldingData;
import com.kubi.quotefacade.entity.HoldingEntity;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p414kv.InterfaceC41991g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: HoldingCombinedDataMapper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\r\u001a\u0004\u0018\u00010\u000e*\u0004\u0018\u00010\u000fH\u0002¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/quotefacade/mapper/HoldingCombinedDataMapper;", "Lcom/kubi/quotefacade/mapper/IMapper;", "Lcom/kubi/quotefacade/entity/HoldingCombinedData;", "Lcom/kubi/quotefacade/entity/HoldingData;", "<init>", "()V", "map", "input", "mapCrypto", "Lcom/kubi/quotefacade/entity/HoldingEntity;", "data", "Lcom/kubi/quotefacade/entity/HoldingCombinedItemData;", "mapAlpha", "toBigDecimalOrNull", "Ljava/math/BigDecimal;", "", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHoldingCombinedDataMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HoldingCombinedDataMapper.kt\ncom/kubi/quotefacade/mapper/HoldingCombinedDataMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1617#2,9:74\n1869#2:83\n1870#2:86\n1626#2:87\n1#3:84\n1#3:85\n*S KotlinDebug\n*F\n+ 1 HoldingCombinedDataMapper.kt\ncom/kubi/quotefacade/mapper/HoldingCombinedDataMapper\n*L\n23#1:74,9\n23#1:83\n23#1:86\n23#1:87\n23#1:85\n*E\n"})
public final class HoldingCombinedDataMapper implements InterfaceC41991g<HoldingCombinedData, HoldingData> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f42176a = new Companion(null);

    /* JADX INFO: compiled from: HoldingCombinedDataMapper.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/quotefacade/mapper/HoldingCombinedDataMapper$Companion;", "", "<init>", "()V", "TYPE_CRYPTO", "", "TYPE_ALPHA", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: e */
    public final BigDecimal m52238e(String str) {
        Object objM103844constructorimpl;
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(new BigDecimal(str));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return (BigDecimal) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    @Override // p414kv.InterfaceC41991g
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public HoldingData mo51723a(@NotNull HoldingCombinedData input) {
        ArrayList arrayList;
        HoldingCombinedItemData data;
        HoldingEntity holdingEntityM52236c;
        Intrinsics.checkNotNullParameter(input, "input");
        Long lastUpdateTime = input.getLastUpdateTime();
        List<HoldingCombinedItem> combinedList = input.getCombinedList();
        if (combinedList != null) {
            arrayList = new ArrayList();
            for (HoldingCombinedItem holdingCombinedItem : combinedList) {
                String type = holdingCombinedItem.getType();
                if (Intrinsics.areEqual(type, "Crypto")) {
                    HoldingCombinedItemData data2 = holdingCombinedItem.getData();
                    if (data2 != null) {
                        holdingEntityM52236c = m52237d(data2);
                    } else {
                        holdingEntityM52236c = null;
                    }
                } else if (!Intrinsics.areEqual(type, "Alpha") || (data = holdingCombinedItem.getData()) == null) {
                    holdingEntityM52236c = null;
                } else {
                    holdingEntityM52236c = m52236c(data);
                }
                if (holdingEntityM52236c != null) {
                    arrayList.add(holdingEntityM52236c);
                }
            }
        } else {
            arrayList = null;
        }
        return new HoldingData(arrayList, null, lastUpdateTime);
    }

    /* JADX INFO: renamed from: c */
    public final HoldingEntity m52236c(HoldingCombinedItemData holdingCombinedItemData) {
        return new HoldingEntity(holdingCombinedItemData.getDisplayToken(), "", "", m52238e(holdingCombinedItemData.getPrice()), m52238e(holdingCombinedItemData.getPriceRate()), m52238e(holdingCombinedItemData.getTradingVolume()), "", holdingCombinedItemData.getToken(), holdingCombinedItemData.getExternalChain(), holdingCombinedItemData.getTokenIcon(), holdingCombinedItemData.getChainIcon(), holdingCombinedItemData.getTokenBridgeId(), true, holdingCombinedItemData.getDisplayToken(), holdingCombinedItemData.getAlphaMarks());
    }

    /* JADX INFO: renamed from: d */
    public final HoldingEntity m52237d(HoldingCombinedItemData holdingCombinedItemData) {
        return new HoldingEntity(holdingCombinedItemData.getSymbol(), holdingCombinedItemData.getBaseCurrency(), holdingCombinedItemData.getQuoteCurrency(), m52238e(holdingCombinedItemData.getCurrentPrice()), m52238e(holdingCombinedItemData.getChangeRate()), m52238e(holdingCombinedItemData.getValue()), holdingCombinedItemData.getRecQuote(), null, null, holdingCombinedItemData.getIcon(), null, null, false, holdingCombinedItemData.getDisplayCrypto(), null, 19840, null);
    }
}
