package p838zo;

import com.kubi.margin.api.IMarginService;
import com.kubi.margin.api.entity.LeverBalance;
import com.kubi.utils.extensions.C27025c;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p311hf.C38190h;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zo.c */
/* JADX INFO: compiled from: LeverBalance.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m90084d2 = {"closeStatus", "Lcom/kubi/margin/api/entity/ILiquidationStatus;", "Lcom/kubi/margin/api/entity/LeverBalance;", "MarginApi_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46899c {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC46898b m103306a(@NotNull LeverBalance leverBalance) {
        Intrinsics.checkNotNullParameter(leverBalance, "<this>");
        if (Intrinsics.areEqual(leverBalance.getStatus(), "EFFECTIVE") && C41014a.m89922G(leverBalance.getTotalLiability(), null, 1, null).compareTo(BigDecimal.ZERO) > 0) {
            return (C38190h.f85888a.m86166k() && C27025c.m66566d(leverBalance.isOneClickLiquidationOpen()) && IMarginService.f32724a.get().mo37918Q()) ? InterfaceC46898b.a.f104762a : InterfaceC46898b.c.f104764a;
        }
        if (Intrinsics.areEqual(leverBalance.getStatus(), "FROZEN_FL") && Intrinsics.areEqual(leverBalance.getStatusBizType(), "ONE_CLICK_LIQUIDATION")) {
            return InterfaceC46898b.b.f104763a;
        }
        return (Intrinsics.areEqual(leverBalance.getStatus(), "FROZEN_FL") && Intrinsics.areEqual(leverBalance.getStatusBizType(), "ONE_CLICK_LIQUIDATION_CANCELING")) ? InterfaceC46898b.d.f104765a : InterfaceC46898b.c.f104764a;
    }
}
