package com.kubi.unify.unify.mapper;

import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.unify.entity.UnifyPositionEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: PositionMapper.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/unify/unify/mapper/PositionMapper;", "", "toPositionEntity", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/unify/entity/UnifyPositionEntity;", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface PositionMapper {
    @NotNull
    PositionEntity toPositionEntity(@NotNull UnifyPositionEntity entity);
}
