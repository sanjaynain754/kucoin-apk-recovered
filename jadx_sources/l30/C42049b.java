package l30;

import android.util.SparseArray;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: l30.b */
/* JADX INFO: compiled from: OrderBookAdapterExt.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R4\u0010\u0007\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u000b*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/tradebase/business/orderbook/OrderBookAdapterExt;", "", "<init>", "()V", "LESS_THAN_8", "", "GREATER_OR_EQUALS_8", "weakReference", "Ljava/lang/ref/WeakReference;", "Landroid/util/SparseArray;", "Lcom/kubi/tradebase/business/orderbook/IOrderBookAmountDisplayRule;", "kotlin.jvm.PlatformType", "getWeakReference", "()Ljava/lang/ref/WeakReference;", "setWeakReference", "(Ljava/lang/ref/WeakReference;)V", "getDisplayRules", "getOrderBookAmountDisplayRule", "pricePrecision", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42049b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42049b f92327a = new C42049b();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static WeakReference<SparseArray<InterfaceC42048a>> f92328b;

    static {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(2, new C42050c());
        sparseArray.put(1, new C42051d());
        f92328b = new WeakReference<>(sparseArray);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final SparseArray<InterfaceC42048a> m92252a() {
        SparseArray<InterfaceC42048a> sparseArray = f92328b.get();
        if (sparseArray != null) {
            return sparseArray;
        }
        SparseArray<InterfaceC42048a> sparseArray2 = new SparseArray<>();
        sparseArray2.put(2, new C42050c());
        sparseArray2.put(1, new C42051d());
        f92328b = new WeakReference<>(sparseArray2);
        return sparseArray2;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final InterfaceC42048a m92253b(int i11) {
        if (i11 >= 8) {
            InterfaceC42048a interfaceC42048a = m92252a().get(2);
            Intrinsics.checkNotNull(interfaceC42048a);
            return interfaceC42048a;
        }
        InterfaceC42048a interfaceC42048a2 = m92252a().get(1);
        Intrinsics.checkNotNull(interfaceC42048a2);
        return interfaceC42048a2;
    }
}
