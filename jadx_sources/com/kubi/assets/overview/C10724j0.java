package com.kubi.assets.overview;

import com.kubi.assets.entity.CommonAccountEntity;
import com.kubi.assets.entity.EarnBalance;
import com.kubi.assets.entity.EquityEntity;
import com.kubi.assets.entity.MarginEntity;
import com.kubi.assets.entity.OverviewAccountInfo;
import com.kubi.assets.entity.SmallEntity;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.data.entity.AssetSingleEntity;
import com.kubi.data.entity.SubAssetEntity;
import com.kubi.data.entity.UnifiedAssetEntity;
import java.math.BigDecimal;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.overview.j0 */
/* JADX INFO: compiled from: AssetOverviewViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¨\u0006\u0004"}, m90084d2 = {"filterSmallAssets", "", "accountInfo", "Lcom/kubi/assets/entity/OverviewAccountInfo;", "AssetsCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C10724j0 {
    /* JADX INFO: renamed from: a */
    public static final boolean m18648a(@Nullable OverviewAccountInfo overviewAccountInfo) {
        BigDecimal totalBalance;
        Boolean execute;
        if (overviewAccountInfo == null) {
            return true;
        }
        AssetSingleEntity main = overviewAccountInfo.getMain();
        if (main == null || (totalBalance = main.getTotalBalance()) == null) {
            AssetSingleEntity trade = overviewAccountInfo.getTrade();
            totalBalance = trade != null ? trade.getTotalBalance() : null;
            if (totalBalance == null) {
                MarginEntity margin = overviewAccountInfo.getMargin();
                totalBalance = margin != null ? margin.getTotalBalance() : null;
                if (totalBalance == null) {
                    EquityEntity kumex = overviewAccountInfo.getKumex();
                    totalBalance = kumex != null ? kumex.getTotalEquity() : null;
                    if (totalBalance == null) {
                        EarnBalance earn = overviewAccountInfo.getEarn();
                        totalBalance = earn != null ? earn.getTotalValue() : null;
                        if (totalBalance == null) {
                            SubAssetEntity robot = overviewAccountInfo.getRobot();
                            totalBalance = robot != null ? robot.getTotalBalance() : null;
                            if (totalBalance == null) {
                                SubAssetEntity copyTrading = overviewAccountInfo.getCopyTrading();
                                totalBalance = copyTrading != null ? copyTrading.getTotalBalance() : null;
                                if (totalBalance == null) {
                                    CommonAccountEntity option = overviewAccountInfo.getOption();
                                    totalBalance = option != null ? option.getTotalBalance() : null;
                                    if (totalBalance == null) {
                                        CommonAccountEntity alpha = overviewAccountInfo.getAlpha();
                                        totalBalance = alpha != null ? alpha.getTotalBalance() : null;
                                        if (totalBalance == null) {
                                            UnifiedAssetEntity unified = overviewAccountInfo.getUnified();
                                            totalBalance = unified != null ? unified.getTotalBalance() : null;
                                            if (totalBalance == null) {
                                                CommonAccountEntity mining = overviewAccountInfo.getMining();
                                                totalBalance = mining != null ? mining.getTotalBalance() : null;
                                                if (totalBalance == null) {
                                                    SubAssetEntity sub = overviewAccountInfo.getSub();
                                                    totalBalance = sub != null ? sub.getTotalBalance() : null;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        AssetSingleEntity main2 = overviewAccountInfo.getMain();
        if (main2 == null || (execute = main2.getExecute()) == null) {
            AssetSingleEntity trade2 = overviewAccountInfo.getTrade();
            execute = trade2 != null ? trade2.getExecute() : null;
            if (execute == null) {
                MarginEntity margin2 = overviewAccountInfo.getMargin();
                execute = margin2 != null ? margin2.getExecute() : null;
                if (execute == null) {
                    EquityEntity kumex2 = overviewAccountInfo.getKumex();
                    execute = kumex2 != null ? kumex2.getExecute() : null;
                    if (execute == null) {
                        EarnBalance earn2 = overviewAccountInfo.getEarn();
                        execute = earn2 != null ? earn2.getExecute() : null;
                        if (execute == null) {
                            SubAssetEntity robot2 = overviewAccountInfo.getRobot();
                            execute = robot2 != null ? robot2.getExecute() : null;
                            if (execute == null) {
                                SubAssetEntity copyTrading2 = overviewAccountInfo.getCopyTrading();
                                execute = copyTrading2 != null ? copyTrading2.getExecute() : null;
                                if (execute == null) {
                                    CommonAccountEntity option2 = overviewAccountInfo.getOption();
                                    execute = option2 != null ? option2.getExecute() : null;
                                    if (execute == null) {
                                        CommonAccountEntity alpha2 = overviewAccountInfo.getAlpha();
                                        execute = alpha2 != null ? alpha2.getExecute() : null;
                                        if (execute == null) {
                                            UnifiedAssetEntity unified2 = overviewAccountInfo.getUnified();
                                            execute = unified2 != null ? unified2.getExecute() : null;
                                            if (execute == null) {
                                                CommonAccountEntity mining2 = overviewAccountInfo.getMining();
                                                execute = mining2 != null ? mining2.getExecute() : null;
                                                if (execute == null) {
                                                    SubAssetEntity sub2 = overviewAccountInfo.getSub();
                                                    execute = sub2 != null ? sub2.getExecute() : null;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (Intrinsics.areEqual(execute, Boolean.FALSE)) {
            return true;
        }
        if (totalBalance == null) {
            return false;
        }
        String balanceCurrency = AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency();
        AssetsHelper assetsHelper = AssetsHelper.f18684a;
        SmallEntity smallEntityM19164h = assetsHelper.m19164h();
        BigDecimal bigDecimalM89916A = C41014a.m89916A(totalBalance, balanceCurrency, smallEntityM19164h != null ? smallEntityM19164h.getBaseCurrency() : null);
        SmallEntity smallEntityM19164h2 = assetsHelper.m19164h();
        return bigDecimalM89916A.compareTo(smallEntityM19164h2 != null ? smallEntityM19164h2.getQuotaLimit() : null) >= 0;
    }
}
