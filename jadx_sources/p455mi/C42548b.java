package p455mi;

import com.kubi.futures.trade.coupon.UnifiedFuturesCouponAvailableEntity;
import com.kubi.futures.trade.coupon.UnifiedFuturesCouponEntity;
import com.kubi.futures.trade.coupon.UnifiedFuturesFeeDeductionCoupon;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: mi.b */
/* JADX INFO: compiled from: UnifiedFuturesCoupon.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/futures/trade/coupon/UnifiedFuturesCouponPanelMapper;", "", "<init>", "()V", "map", "Lcom/kubi/futures/trade/coupon/UnifiedFuturesFeeDeductionCoupon;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/futures/trade/coupon/UnifiedFuturesCouponAvailableEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifiedFuturesCoupon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifiedFuturesCoupon.kt\ncom/kubi/futures/trade/coupon/UnifiedFuturesCouponPanelMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n295#2,2:109\n*S KotlinDebug\n*F\n+ 1 UnifiedFuturesCoupon.kt\ncom/kubi/futures/trade/coupon/UnifiedFuturesCouponPanelMapper\n*L\n74#1:109,2\n*E\n"})
public final class C42548b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42548b f94224a = new C42548b();

    @Nullable
    /* JADX INFO: renamed from: a */
    public final UnifiedFuturesFeeDeductionCoupon m93279a(@Nullable UnifiedFuturesCouponAvailableEntity unifiedFuturesCouponAvailableEntity) {
        List<UnifiedFuturesCouponEntity> availableCoupons;
        Object next;
        String totalAmount;
        if (unifiedFuturesCouponAvailableEntity != null && (availableCoupons = unifiedFuturesCouponAvailableEntity.getAvailableCoupons()) != null) {
            Iterator<T> it = availableCoupons.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                totalAmount = ((UnifiedFuturesCouponEntity) next).getTotalAmount();
            } while (totalAmount == null || StringsKt.isBlank(totalAmount));
            UnifiedFuturesCouponEntity unifiedFuturesCouponEntity = (UnifiedFuturesCouponEntity) next;
            if (unifiedFuturesCouponEntity != null) {
                String totalAmount2 = unifiedFuturesCouponEntity.getTotalAmount();
                if (totalAmount2 == null) {
                    totalAmount2 = "";
                }
                String currency = unifiedFuturesCouponEntity.getCurrency();
                return new UnifiedFuturesFeeDeductionCoupon(totalAmount2, currency != null ? currency : "");
            }
        }
        return null;
    }
}
