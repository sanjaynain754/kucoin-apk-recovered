package p640ti;

import com.facebook.react.uimanager.ViewProps;
import com.kubi.kumex.R$color;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.resources.C22890g;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import fm.C37569d;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p402kf.C41014a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ti.j */
/* JADX INFO: compiled from: LitePositionWrapper.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/futures/trade/position/data/LitePositionWrapper;", "Lcom/kubi/futures/trade/position/data/BasePositionWrapper;", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "orders", "", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "currentSymbol", "", "<init>", "(Lcom/kubi/kumex/data/trade/model/PositionEntity;Ljava/util/List;Ljava/lang/String;)V", "pnl", "Lcom/kubi/utils/StyledText;", "getPnl", "()Lcom/kubi/utils/StyledText;", "pnl$delegate", "Lkotlin/Lazy;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45035j extends C45030e {

    /* JADX INFO: renamed from: y */
    @NotNull
    public final Lazy f101433y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45035j(@NotNull final PositionEntity position, @NotNull List<OrderEntity> orders, @NotNull String currentSymbol) {
        super(position, orders, currentSymbol);
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(orders, "orders");
        Intrinsics.checkNotNullParameter(currentSymbol, "currentSymbol");
        this.f101433y = LazyKt.lazy(new Function0() { // from class: ti.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C45035j.m99583J(position);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public static final C27096v0 m99583J(PositionEntity positionEntity) {
        C27096v0 c27096v0 = new C27096v0();
        BigDecimal bigDecimalM84658J = C37569d.m84658J(positionEntity);
        c27096v0.m66905e(C37569d.m84682w(positionEntity, bigDecimalM84658J, false, 2, null) + " (" + C37569d.m84677r(positionEntity) + ')', C22890g.m54280e(C27017c.f54310a.m66513b(), C41014a.m89922G(bigDecimalM84658J, null, 1, null), R$color.emphasis));
        return c27096v0;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final C27096v0 m99584I() {
        return (C27096v0) this.f101433y.getValue();
    }
}
