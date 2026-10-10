package com.kubi.unify.unify.mapper;

import com.kubi.kumex.data.assets.model.ProfitDetailItemEntity;
import com.kubi.kumex.data.assets.model.ProfitRecordEntity;
import com.kubi.kumex.data.assets.model.TradeRecordEntity;
import com.kubi.unify.api.entity.UnifyOrderDisplayTypeEnum;
import com.kubi.unify.api.entity.UnifyOrderFillTypeEnum;
import com.kubi.unify.unify.common.history.UnifyPositionDetailEntity;
import com.kubi.unify.unify.common.history.UnifyProfitRecordEntity;
import com.kubi.unify.unify.common.history.UnifyTradeRecordEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Iterator;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: HistoryMapper.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0003H\u0017J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\nH'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\rH'J\u001a\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\rH\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/unify/unify/mapper/HistoryMapper;", "", "toLowerCaseCustom", "", "toProfitRecordEntity", "Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/unify/unify/common/history/UnifyProfitRecordEntity;", "toProfitDetailItemEntity", "Lcom/kubi/kumex/data/assets/model/ProfitDetailItemEntity;", "Lcom/kubi/unify/unify/common/history/UnifyPositionDetailEntity;", "toTradeRecordEntity", "Lcom/kubi/kumex/data/assets/model/TradeRecordEntity;", "Lcom/kubi/unify/unify/common/history/UnifyTradeRecordEntity;", "afterMapping", "", "target", "source", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHistoryMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryMapper.kt\ncom/kubi/unify/unify/mapper/HistoryMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,99:1\n295#2,2:100\n295#2,2:102\n*S KotlinDebug\n*F\n+ 1 HistoryMapper.kt\ncom/kubi/unify/unify/mapper/HistoryMapper\n*L\n89#1:100,2\n92#1:102,2\n*E\n"})
public interface HistoryMapper {
    @NotNull
    ProfitDetailItemEntity toProfitDetailItemEntity(@NotNull UnifyPositionDetailEntity entity);

    @NotNull
    ProfitRecordEntity toProfitRecordEntity(@NotNull UnifyProfitRecordEntity entity);

    @NotNull
    TradeRecordEntity toTradeRecordEntity(@NotNull UnifyTradeRecordEntity entity);

    default void afterMapping(@NotNull TradeRecordEntity target, @NotNull UnifyTradeRecordEntity source) {
        UnifyOrderDisplayTypeEnum next;
        UnifyOrderFillTypeEnum next2;
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(source, "source");
        Iterator<UnifyOrderDisplayTypeEnum> it = UnifyOrderDisplayTypeEnum.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int type = next.getType();
            Integer orderDisplayType = source.getOrderDisplayType();
            if (orderDisplayType != null && type == orderDisplayType.intValue()) {
                break;
            }
        }
        UnifyOrderDisplayTypeEnum unifyOrderDisplayTypeEnum = next;
        target.setDisplayType(unifyOrderDisplayTypeEnum != null ? unifyOrderDisplayTypeEnum.getTradeType() : null);
        Iterator<UnifyOrderFillTypeEnum> it2 = UnifyOrderFillTypeEnum.getEntries().iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!Intrinsics.areEqual(next2.getUtaType(), source.getFillType()));
        UnifyOrderFillTypeEnum unifyOrderFillTypeEnum = next2;
        target.setFillType(unifyOrderFillTypeEnum != null ? unifyOrderFillTypeEnum.getClassicType() : null);
        target.setLiquidationPrice(source.getPrice());
        String marginMode = source.getMarginMode();
        if (marginMode == null) {
            marginMode = "CROSS";
        }
        target.setMarginMode(marginMode);
    }

    @Nullable
    default String toLowerCaseCustom(@Nullable String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
