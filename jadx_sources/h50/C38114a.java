package h50;

import com.kubi.tradingbotkit.business.strategyList.entity.StrategyItemEntity;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: h50.a */
/* JADX INFO: compiled from: StrategyEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0010\u001a\u00020\u0011*\u00020\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"ALL", "", "EMPTY", "ROBOT_GRID_FAILED", "SPOT_GRID", "SPOT_AIP", "SPOT_POSITION", "SPOT_INFINITY_GRID", "SPOT_MARTIN_GALE", "SPOT_AI_GRID", "SPOT_CTA", "MARGIN_GRID", "FUTURES_GRID", "FUTURES_WIN_TWO_WAY", "FUTURES_MARTIN_GALE", "FUTURES_CTA", "isSupported", "", "Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;", "TradingBotKitLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C38114a {
    /* JADX INFO: renamed from: a */
    public static final boolean m86044a(@NotNull StrategyItemEntity strategyItemEntity) {
        Integer type;
        Integer type2;
        Integer type3;
        Integer type4;
        Integer type5;
        Integer type6;
        Integer type7;
        Integer type8;
        Integer type9;
        Integer type10;
        Integer type11;
        Intrinsics.checkNotNullParameter(strategyItemEntity, "<this>");
        Integer type12 = strategyItemEntity.getType();
        return (type12 != null && type12.intValue() == 2) || ((type = strategyItemEntity.getType()) != null && type.intValue() == 1) || (((type2 = strategyItemEntity.getType()) != null && type2.intValue() == 4) || (((type3 = strategyItemEntity.getType()) != null && type3.intValue() == 5) || (((type4 = strategyItemEntity.getType()) != null && type4.intValue() == 7) || (((type5 = strategyItemEntity.getType()) != null && type5.intValue() == 8) || (((type6 = strategyItemEntity.getType()) != null && type6.intValue() == 11) || (((type7 = strategyItemEntity.getType()) != null && type7.intValue() == 10) || (((type8 = strategyItemEntity.getType()) != null && type8.intValue() == 3) || (((type9 = strategyItemEntity.getType()) != null && type9.intValue() == 9) || (((type10 = strategyItemEntity.getType()) != null && type10.intValue() == 12) || ((type11 = strategyItemEntity.getType()) != null && type11.intValue() == 13))))))))));
    }
}
