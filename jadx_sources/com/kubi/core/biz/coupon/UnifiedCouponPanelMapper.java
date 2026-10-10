package com.kubi.core.biz.coupon;

import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.core.biz.coupon.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: UnifiedTradeCoupon.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0012\u0010\f\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0013\u0010\r\u001a\u00020\u0005*\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/core/biz/coupon/UnifiedCouponPanelMapper;", "", "<init>", "()V", "STATUS_USING", "", "map", "Lcom/kubi/core/biz/coupon/UnifiedCouponPanelState;", "prizeType", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/core/biz/coupon/UnifiedCouponAvailableEntity;", "mapFeeDeduction", "mapInterestFree", "orZero", "(Ljava/lang/Integer;)I", "allCoupons", "", "Lcom/kubi/core/biz/coupon/UnifiedCouponEntity;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifiedTradeCoupon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifiedTradeCoupon.kt\ncom/kubi/core/biz/coupon/UnifiedCouponPanelMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,172:1\n295#2,2:173\n295#2,2:175\n*S KotlinDebug\n*F\n+ 1 UnifiedTradeCoupon.kt\ncom/kubi/core/biz/coupon/UnifiedCouponPanelMapper\n*L\n120#1:173,2\n130#1:175,2\n*E\n"})
public final class UnifiedCouponPanelMapper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final UnifiedCouponPanelMapper f20379a = new UnifiedCouponPanelMapper();

    @NotNull
    /* JADX INFO: renamed from: b */
    public final UnifiedCouponPanelState m21725b(int i11, @Nullable UnifiedCouponAvailableEntity unifiedCouponAvailableEntity) {
        if (i11 != 2) {
            return (i11 == 4 || i11 == 7) ? m21726c(unifiedCouponAvailableEntity) : UnifiedCouponPanelState.b.f20382a;
        }
        return m21727d(unifiedCouponAvailableEntity);
    }

    /* JADX INFO: renamed from: d */
    public final UnifiedCouponPanelState m21727d(UnifiedCouponAvailableEntity unifiedCouponAvailableEntity) {
        UnifiedCouponEntity unifiedCouponEntity;
        int iM21728e;
        List<UnifiedCouponEntity> availableCoupons;
        Integer availableCount;
        List<UnifiedCouponEntity> listM21724a;
        Object next;
        String discountRate;
        Integer numValueOf = null;
        if (unifiedCouponAvailableEntity == null || (listM21724a = m21724a(unifiedCouponAvailableEntity)) == null) {
            unifiedCouponEntity = null;
        } else {
            Iterator<T> it = listM21724a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                UnifiedCouponEntity unifiedCouponEntity2 = (UnifiedCouponEntity) next;
                Integer status = unifiedCouponEntity2.getStatus();
                if (status != null && status.intValue() == 2 && (discountRate = unifiedCouponEntity2.getDiscountRate()) != null && !StringsKt.isBlank(discountRate)) {
                    break;
                }
            }
            unifiedCouponEntity = (UnifiedCouponEntity) next;
        }
        if (unifiedCouponEntity != null) {
            String discountRate2 = unifiedCouponEntity.getDiscountRate();
            if (discountRate2 == null) {
                discountRate2 = "";
            }
            return new UnifiedCouponPanelState.InterestUsing(discountRate2);
        }
        if (unifiedCouponAvailableEntity == null || (availableCount = unifiedCouponAvailableEntity.getAvailableCount()) == null) {
            if (unifiedCouponAvailableEntity != null && (availableCoupons = unifiedCouponAvailableEntity.getAvailableCoupons()) != null) {
                numValueOf = Integer.valueOf(availableCoupons.size());
            }
            iM21728e = m21728e(numValueOf);
        } else {
            iM21728e = availableCount.intValue();
        }
        return iM21728e > 0 ? new UnifiedCouponPanelState.InterestCount(iM21728e) : UnifiedCouponPanelState.b.f20382a;
    }

    /* JADX INFO: renamed from: c */
    public final UnifiedCouponPanelState m21726c(UnifiedCouponAvailableEntity unifiedCouponAvailableEntity) {
        List<UnifiedCouponEntity> availableCoupons;
        Object next;
        String totalAmount;
        if (unifiedCouponAvailableEntity != null && (availableCoupons = unifiedCouponAvailableEntity.getAvailableCoupons()) != null) {
            Iterator<T> it = availableCoupons.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                totalAmount = ((UnifiedCouponEntity) next).getTotalAmount();
            } while (totalAmount == null || StringsKt.isBlank(totalAmount));
            UnifiedCouponEntity unifiedCouponEntity = (UnifiedCouponEntity) next;
            if (unifiedCouponEntity != null) {
                String totalAmount2 = unifiedCouponEntity.getTotalAmount();
                if (totalAmount2 == null) {
                    totalAmount2 = "";
                }
                String currency = unifiedCouponEntity.getCurrency();
                return new UnifiedCouponPanelState.FeeDeduction(totalAmount2, currency != null ? currency : "");
            }
        }
        return UnifiedCouponPanelState.b.f20382a;
    }

    /* JADX INFO: renamed from: e */
    public final int m21728e(Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final List<UnifiedCouponEntity> m21724a(UnifiedCouponAvailableEntity unifiedCouponAvailableEntity) {
        List<UnifiedCouponEntity> availableCoupons = unifiedCouponAvailableEntity.getAvailableCoupons();
        if (availableCoupons == null) {
            availableCoupons = CollectionsKt.emptyList();
        }
        List<UnifiedCouponEntity> unavailableCoupons = unifiedCouponAvailableEntity.getUnavailableCoupons();
        if (unavailableCoupons == null) {
            unavailableCoupons = CollectionsKt.emptyList();
        }
        return CollectionsKt.plus((Collection) availableCoupons, (Iterable) unavailableCoupons);
    }
}
