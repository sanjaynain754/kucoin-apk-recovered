package u20;

import com.kubi.spot.dialog.order.model.AmendContext;
import com.kubi.spot.dialog.order.precheck.AmendPreCheck;
import com.kubi.spot.dialog.order.precheck.DealAmountValidator;
import com.kubi.spot.dialog.order.precheck.NoChangeValidator;
import com.kubi.spot.dialog.order.precheck.PriceRangeValidator;
import com.kubi.spot.dialog.order.precheck.QuantityRangeValidator;
import com.kubi.tradebase.OrderType;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: u20.a */
/* JADX INFO: compiled from: LimitPlugin.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, m90084d2 = {"Lcom/kubi/spot/dialog/order/plugin/LimitPlugin;", "Lcom/kubi/spot/dialog/order/plugin/AmendOrderTypePlugin;", "<init>", "()V", "type", "Lcom/kubi/tradebase/OrderType;", "getType", "()Lcom/kubi/tradebase/OrderType;", "getTypeValidators", "", "Lcom/kubi/spot/dialog/order/precheck/AmendPreCheck;", "ctx", "Lcom/kubi/spot/dialog/order/model/AmendContext;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45096a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final OrderType f101499a = OrderType.LIMIT;

    @NotNull
    /* JADX INFO: renamed from: a */
    public List<AmendPreCheck> m99709a(@NotNull AmendContext ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        return CollectionsKt.listOf((Object[]) new AmendPreCheck[]{new NoChangeValidator(), new PriceRangeValidator(), new QuantityRangeValidator(), new DealAmountValidator()});
    }
}
