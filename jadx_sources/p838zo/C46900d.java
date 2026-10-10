package p838zo;

import com.kubi.margin.api.entity.CouponsOverview;
import com.kubi.margin.api.entity.MarginCouponConfig;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zo.d */
/* JADX INFO: compiled from: MarginCouponConfig.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, m90084d2 = {"isSame", "", "Lcom/kubi/margin/api/entity/MarginCouponConfig;", "other", "Lcom/kubi/margin/api/entity/CouponsOverview;", "MarginApi_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46900d {
    /* JADX INFO: renamed from: a */
    public static final boolean m103307a(@Nullable CouponsOverview couponsOverview, @Nullable CouponsOverview couponsOverview2) {
        if (couponsOverview == null && couponsOverview2 == null) {
            return true;
        }
        if (Intrinsics.areEqual(couponsOverview2 != null ? couponsOverview2.getCouponNotUseNum() : null, couponsOverview != null ? couponsOverview.getCouponNotUseNum() : null)) {
            return m103308b(couponsOverview != null ? couponsOverview.getUsingCoupon() : null, couponsOverview2 != null ? couponsOverview2.getUsingCoupon() : null);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m103308b(MarginCouponConfig marginCouponConfig, MarginCouponConfig marginCouponConfig2) {
        if (marginCouponConfig2 == null && marginCouponConfig == null) {
            return true;
        }
        if (!Intrinsics.areEqual(marginCouponConfig != null ? marginCouponConfig.getActivityId() : null, marginCouponConfig2 != null ? marginCouponConfig2.getActivityId() : null)) {
            return false;
        }
        if (!Intrinsics.areEqual(marginCouponConfig != null ? marginCouponConfig.getCouponId() : null, marginCouponConfig2 != null ? marginCouponConfig2.getCouponId() : null)) {
            return false;
        }
        if (Intrinsics.areEqual(marginCouponConfig != null ? marginCouponConfig.getState() : null, marginCouponConfig2 != null ? marginCouponConfig2.getState() : null)) {
            return Intrinsics.areEqual(marginCouponConfig != null ? marginCouponConfig.getCurrency() : null, marginCouponConfig2 != null ? marginCouponConfig2.getCurrency() : null);
        }
        return false;
    }
}
