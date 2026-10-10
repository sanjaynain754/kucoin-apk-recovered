package com.kubi.unify.unify.mapper;

import android.text.TextUtils;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.unify.api.entity.UnifyOrderDisplayTypeEnum;
import com.kubi.unify.api.entity.UnifyOrderStatusEnum;
import com.kubi.unify.entity.UnifyOrderEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Iterator;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: OrderMapper.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0003H\u0017J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u001a\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/unify/unify/mapper/OrderMapper;", "", "toLowerCaseCustom", "", "toOrderEntity", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/unify/entity/UnifyOrderEntity;", "afterMapping", "", "target", "source", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOrderMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderMapper.kt\ncom/kubi/unify/unify/mapper/OrderMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,105:1\n1#2:106\n295#3,2:107\n*S KotlinDebug\n*F\n+ 1 OrderMapper.kt\ncom/kubi/unify/unify/mapper/OrderMapper\n*L\n94#1:107,2\n*E\n"})
public interface OrderMapper {
    @NotNull
    OrderEntity toOrderEntity(@NotNull UnifyOrderEntity entity);

    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    default void afterMapping(@NotNull OrderEntity target, @NotNull UnifyOrderEntity source) {
        boolean z11;
        UnifyOrderDisplayTypeEnum next;
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(source, "source");
        String slTriggerPriceType = source.getSlTriggerPriceType();
        if (slTriggerPriceType == null || slTriggerPriceType.length() == 0) {
            slTriggerPriceType = null;
        }
        if (slTriggerPriceType != null) {
            target.setStopPriceType(slTriggerPriceType);
            if (Intrinsics.areEqual(target.getSide(), "buy")) {
                target.setTriggerStopDownPrice(source.getSlTriggerPrice());
            } else {
                target.setTriggerStopUpPrice(source.getSlTriggerPrice());
            }
        }
        String tpTriggerPriceType = source.getTpTriggerPriceType();
        if (tpTriggerPriceType == null || tpTriggerPriceType.length() == 0) {
            tpTriggerPriceType = null;
        }
        if (tpTriggerPriceType != null) {
            target.setStopPriceType(tpTriggerPriceType);
            if (Intrinsics.areEqual(target.getSide(), "buy")) {
                target.setTriggerStopUpPrice(source.getTpTriggerPrice());
            } else {
                target.setTriggerStopDownPrice(source.getTpTriggerPrice());
            }
        }
        Integer status = source.getStatus();
        int type = UnifyOrderStatusEnum.CANCELED.getType();
        if (status != null && status.intValue() == type) {
            z11 = true;
        } else {
            Integer status2 = source.getStatus();
            int type2 = UnifyOrderStatusEnum.PARTIAL_CANCELED.getType();
            if (status2 != null && status2.intValue() == type2) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        target.setCancelExist(Boolean.valueOf(z11));
        Integer status3 = source.getStatus();
        target.setStopTriggered(Boolean.valueOf(status3 != null && status3.intValue() == UnifyOrderStatusEnum.TRIGGERED.getType()));
        Iterator<UnifyOrderDisplayTypeEnum> it = UnifyOrderDisplayTypeEnum.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int type3 = next.getType();
            Integer orderDisplayType = source.getOrderDisplayType();
            if (orderDisplayType != null && type3 == orderDisplayType.intValue()) {
                break;
            }
        }
        UnifyOrderDisplayTypeEnum unifyOrderDisplayTypeEnum = next;
        target.setDisplayType(C27041f.m66669i(unifyOrderDisplayTypeEnum != null ? unifyOrderDisplayTypeEnum.getTradeType() : null, TUIConstants.TUIContact.LIMIT));
        target.setAdvancedDisplayType(unifyOrderDisplayTypeEnum != null ? C27017c.f54310a.m66516f(unifyOrderDisplayTypeEnum.getDisplayString(), new Object[0]) : null);
        if (!TextUtils.isEmpty(source.getTriggerDirection())) {
            target.setDealValue(null);
        }
        target.setMarginMode(source.getMarginMode());
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
