package p414kv;

import com.kubi.quotefacade.entity.ChainFilterData;
import com.kubi.quotefacade.entity.ChainItemEntity;
import com.kubi.quotefacade.entity.ChainListParam;
import com.kubi.quotefacade.entity.RiskInfo;
import com.kubi.quotefacade.entity.SortSets;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kv.a */
/* JADX INFO: compiled from: ChainItemEntityMapper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0000\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003¨\u0006\u0007"}, m90084d2 = {"convert", "Lcom/kubi/quotefacade/entity/ChainItemEntity;", "newChainItemEntity", "Lcom/kubi/quotefacade/entity/ChainFilterData;", "other", "Lcom/kubi/quotefacade/entity/ChainListParam;", "chainFilterData", "QuoteFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C41985a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ChainFilterData m92060a(@NotNull ChainFilterData chainFilterData, @NotNull ChainFilterData other) {
        Intrinsics.checkNotNullParameter(chainFilterData, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        chainFilterData.setChainSortType(other.getChainSortType());
        chainFilterData.setMaxPriceChange24h(other.getMaxPriceChange24h());
        chainFilterData.setMinPriceChange24h(other.getMinPriceChange24h());
        chainFilterData.setMaxTxCount24h(other.getMaxTxCount24h());
        chainFilterData.setMinTxCount24h(other.getMinTxCount24h());
        chainFilterData.setMaxMakers24h(other.getMaxMakers24h());
        chainFilterData.setMinMakers24h(other.getMinMakers24h());
        chainFilterData.setMaxHolders(other.getMaxHolders());
        chainFilterData.setMinHolders(other.getMinHolders());
        chainFilterData.setMaxVolume24h(other.getMaxVolume24h());
        chainFilterData.setMinVolume24h(other.getMinVolume24h());
        chainFilterData.setMaxTvl(other.getMaxTvl());
        chainFilterData.setMinTvl(other.getMinTvl());
        chainFilterData.setMaxFdv(other.getMaxFdv());
        chainFilterData.setMinFdv(other.getMinFdv());
        chainFilterData.setMaxMarketCap(other.getMaxMarketCap());
        chainFilterData.setMinMarketCap(other.getMinMarketCap());
        chainFilterData.setAve(other.getAve());
        chainFilterData.setOrderByRange(other.getOrderByRange());
        return chainFilterData;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final ChainItemEntity m92061b(@NotNull ChainItemEntity chainItemEntity, @NotNull ChainItemEntity newChainItemEntity) {
        Intrinsics.checkNotNullParameter(chainItemEntity, "<this>");
        Intrinsics.checkNotNullParameter(newChainItemEntity, "newChainItemEntity");
        chainItemEntity.setTotal(newChainItemEntity.getTotal());
        chainItemEntity.setLaunchPrice(newChainItemEntity.getLaunchPrice());
        chainItemEntity.setCurrentPriceEth(newChainItemEntity.getCurrentPriceEth());
        chainItemEntity.setCurrentPriceUsd(newChainItemEntity.getCurrentPriceUsd());
        chainItemEntity.setLockAmount(newChainItemEntity.getLockAmount());
        chainItemEntity.setBurnAmount(newChainItemEntity.getBurnAmount());
        chainItemEntity.setOtherAmount(newChainItemEntity.getOtherAmount());
        chainItemEntity.setMarketCap(newChainItemEntity.getMarketCap());
        chainItemEntity.setFdv(newChainItemEntity.getFdv());
        chainItemEntity.setTvl(newChainItemEntity.getTvl());
        chainItemEntity.setToken(newChainItemEntity.getToken());
        chainItemEntity.setChain(newChainItemEntity.getChain());
        chainItemEntity.setDecimal(newChainItemEntity.getDecimal());
        chainItemEntity.setName(newChainItemEntity.getName());
        chainItemEntity.setSymbol(newChainItemEntity.getSymbol());
        chainItemEntity.setHolders(newChainItemEntity.getHolders());
        chainItemEntity.setLogoUrl(newChainItemEntity.getLogoUrl());
        chainItemEntity.setLaunchAt(newChainItemEntity.getLaunchAt());
        chainItemEntity.setCreatedAt(newChainItemEntity.getCreatedAt());
        chainItemEntity.setUpdatedAt(newChainItemEntity.getUpdatedAt());
        chainItemEntity.setTokenPriceChange(newChainItemEntity.getTokenPriceChange());
        chainItemEntity.setTokenTxVolumeUsd(newChainItemEntity.getTokenTxVolumeUsd());
        chainItemEntity.setTokenTxCount(newChainItemEntity.getTokenTxCount());
        chainItemEntity.setTokenBuyTxCount(newChainItemEntity.getTokenBuyTxCount());
        chainItemEntity.setTokenSellTxCount(newChainItemEntity.getTokenSellTxCount());
        chainItemEntity.setTokenMakers(newChainItemEntity.getTokenMakers());
        chainItemEntity.setTokenBuyers(newChainItemEntity.getTokenBuyers());
        chainItemEntity.setTokenSellers(newChainItemEntity.getTokenSellers());
        chainItemEntity.setHasMintMethod(newChainItemEntity.getHasMintMethod());
        chainItemEntity.setAuditLevel(newChainItemEntity.getAuditLevel());
        chainItemEntity.setChainLogo(newChainItemEntity.getChainLogo());
        chainItemEntity.setSecurityScore(newChainItemEntity.getSecurityScore());
        chainItemEntity.setHotToken(newChainItemEntity.getHotToken());
        chainItemEntity.setHasNotRenounced(newChainItemEntity.getHasNotRenounced());
        chainItemEntity.setHasNotOpenSource(newChainItemEntity.getHasNotOpenSource());
        chainItemEntity.setDataSource(newChainItemEntity.getDataSource());
        chainItemEntity.setKcChain(newChainItemEntity.getKcChain());
        chainItemEntity.setLpNotLocked(newChainItemEntity.getLpNotLocked());
        chainItemEntity.setInBlacklist(newChainItemEntity.getInBlacklist());
        chainItemEntity.setHoneypot(newChainItemEntity.getHoneypot());
        return chainItemEntity;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final ChainListParam m92062c(@NotNull ChainListParam chainListParam, @NotNull ChainFilterData chainFilterData) {
        Intrinsics.checkNotNullParameter(chainListParam, "<this>");
        Intrinsics.checkNotNullParameter(chainFilterData, "chainFilterData");
        chainListParam.setMaxPriceChange24h(chainFilterData.getMaxPriceChange24h());
        chainListParam.setMinPriceChange24h(chainFilterData.getMinPriceChange24h());
        chainListParam.setMaxTxCount24h(chainFilterData.getMaxTxCount24h());
        chainListParam.setMinTxCount24h(chainFilterData.getMinTxCount24h());
        chainListParam.setMaxMakers24h(chainFilterData.getMaxMakers24h());
        chainListParam.setMinMakers24h(chainFilterData.getMinMakers24h());
        chainListParam.setMaxHolders(chainFilterData.getMaxHolders());
        chainListParam.setMinHolders(chainFilterData.getMinHolders());
        chainListParam.setMaxVolume24h(chainFilterData.getMaxVolume24h());
        chainListParam.setMinVolume24h(chainFilterData.getMinVolume24h());
        chainListParam.setMaxTvl(chainFilterData.getMaxTvl());
        chainListParam.setMinTvl(chainFilterData.getMinTvl());
        chainListParam.setMaxFdv(chainFilterData.getMaxFdv());
        chainListParam.setMinFdv(chainFilterData.getMinFdv());
        chainListParam.setMaxMarketCap(chainFilterData.getMaxMarketCap());
        chainListParam.setMinMarketCap(chainFilterData.getMinMarketCap());
        RiskInfo riskInfo = new RiskInfo(null, 1, null);
        riskInfo.setAveRiskLevel(Integer.valueOf(chainFilterData.getAve() ? 0 : -1));
        chainListParam.setRiskInfo(riskInfo);
        if (chainFilterData.getChainSortType() != null) {
            SortSets sortSets = new SortSets(null, null, 3, null);
            sortSets.setField("");
            sortSets.setSide("");
            chainListParam.setSortSets(sortSets);
        }
        chainListParam.setOrderByRange(chainFilterData.getOrderByRange());
        return chainListParam;
    }
}
