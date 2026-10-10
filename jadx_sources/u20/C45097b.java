package u20;

import com.kubi.tradebase.OrderType;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: u20.b */
/* JADX INFO: compiled from: OrderTypePluginRegistry.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/spot/dialog/order/plugin/OrderTypePluginRegistry;", "", "<init>", "()V", "map", "", "Lcom/kubi/tradebase/OrderType;", "Lcom/kubi/spot/dialog/order/plugin/LimitPlugin;", "require", "type", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45097b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45097b f101500a = new C45097b();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Map<OrderType, C45096a> f101501b = MapsKt.mapOf(TuplesKt.m90091to(OrderType.LIMIT, new C45096a()));

    @NotNull
    /* JADX INFO: renamed from: a */
    public final C45096a m99710a(@NotNull OrderType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        C45096a c45096a = f101501b.get(type);
        if (c45096a != null) {
            return c45096a;
        }
        throw new IllegalStateException(("Unsupported order type: " + type).toString());
    }
}
