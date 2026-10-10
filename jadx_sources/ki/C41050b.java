package ki;

import androidx.collection.ArrayMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.platform.model.ContractEntity;
import fm.C37567b;
import fm.C37571f;
import li.C42226a;
import li.C42227b;
import li.C42228c;
import li.C42229d;
import li.C42230e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p236em.C37214b;
import p314hi.InterfaceC38213a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ki.b */
/* JADX INFO: compiled from: QtyUnitFactory.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0005J\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005J\u001c\u0010\u0013\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0006\u0010\u0017\u001a\u00020\rJ\u0006\u0010\u0018\u001a\u00020\rJ\u0006\u0010\u0019\u001a\u00020\rJ\u0006\u0010\u001a\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00050\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/futures/trade/config/qty/QtyUnitFactory;", "", "<init>", "()V", "mIQtyUnitStrategy", "Lcom/kubi/futures/trade/config/qty/IQtyUnitStrategy;", "mLastIQtyUnitStrategy", "mQtyCache", "Landroidx/collection/ArrayMap;", "", "switchByType", "", "type", "", "switchByContract", "contract", "Lcom/kubi/futures/trade/config/IFuturesContractConfig;", "current", "last", "build", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "assignment", "strategy", "getQtyType", "getQtyTypeOfLot", "getQtyTypeOfValue", "getQtyTypeOfCost", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C41050b {

    /* JADX INFO: renamed from: c */
    @Nullable
    public static InterfaceC41049a f91266c;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C41050b f91264a = new C41050b();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static InterfaceC41049a f91265b = new C42227b();

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final ArrayMap<Boolean, InterfaceC41049a> f91267d = new ArrayMap<>();

    /* JADX INFO: renamed from: a */
    public final void m90018a(InterfaceC41049a interfaceC41049a) {
        if (f91265b.getClass() != interfaceC41049a.getClass()) {
            f91266c = f91265b;
        }
        f91265b = interfaceC41049a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final InterfaceC41049a m90019b(@Nullable ContractEntity contractEntity) {
        if (contractEntity == null) {
            return new C42229d();
        }
        if (contractEntity.isInverse()) {
            InterfaceC41049a interfaceC41049a = f91265b;
            if (interfaceC41049a instanceof C42228c) {
                return interfaceC41049a;
            }
            ArrayMap<Boolean, InterfaceC41049a> arrayMap = f91267d;
            Boolean bool = Boolean.TRUE;
            InterfaceC41049a interfaceC41049a2 = arrayMap.get(bool);
            if (interfaceC41049a2 != null) {
                return interfaceC41049a2;
            }
            C42228c c42228c = new C42228c();
            arrayMap.put(bool, c42228c);
            return c42228c;
        }
        InterfaceC41049a interfaceC41049a3 = f91265b;
        if (!(interfaceC41049a3 instanceof C42228c)) {
            return interfaceC41049a3;
        }
        ArrayMap<Boolean, InterfaceC41049a> arrayMap2 = f91267d;
        Boolean bool2 = Boolean.FALSE;
        InterfaceC41049a interfaceC41049a4 = arrayMap2.get(bool2);
        if (interfaceC41049a4 != null) {
            return interfaceC41049a4;
        }
        InterfaceC41049a interfaceC41049aM90020c = m90020c(null, C37567b.m84629s(contractEntity));
        arrayMap2.put(bool2, interfaceC41049aM90020c);
        return interfaceC41049aM90020c;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    public final InterfaceC41049a m90020c(String str, InterfaceC38213a interfaceC38213a) {
        if (interfaceC38213a != null && interfaceC38213a.mo86246q()) {
            return new C42228c();
        }
        if (str == null) {
            str = C37571f.m84698e(RepositoryServiceLocator.f19236a.m20290i().mo99981F0());
        }
        switch (str.hashCode()) {
            case -1208996640:
                if (str.equals("QtyUnitOfLot")) {
                    return new C42229d();
                }
                break;
            case -351270942:
                if (str.equals("QtyUnitOfCurrency")) {
                    return new C42227b();
                }
                break;
            case 1175541790:
                if (str.equals("QtyUnitOfCost")) {
                    return new C42226a();
                }
                break;
            case 2099180352:
                if (str.equals("QtyUnitOfValue")) {
                    return new C42230e();
                }
                break;
        }
        C37214b.m83257c("创建数量策略出现问题，type:" + str, "QtyUnitFactory");
        return new C42227b();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC41049a m90021d() {
        return f91265b;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m90022e() {
        InterfaceC41049a interfaceC41049a = f91265b;
        if (interfaceC41049a instanceof C42229d) {
            return "lot";
        }
        if (interfaceC41049a instanceof C42227b) {
            return FirebaseAnalytics.Param.CURRENCY;
        }
        if (interfaceC41049a instanceof C42230e) {
            return "value";
        }
        return interfaceC41049a instanceof C42226a ? "cost" : "lot";
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final InterfaceC41049a m90023f() {
        return f91266c;
    }

    /* JADX INFO: renamed from: g */
    public final void m90024g(@NotNull InterfaceC38213a contract) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        InterfaceC41049a interfaceC41049aM90020c = m90020c(null, contract);
        f91265b = interfaceC41049aM90020c;
        f91267d.put(Boolean.valueOf(interfaceC41049aM90020c instanceof C42228c), interfaceC41049aM90020c);
    }

    /* JADX INFO: renamed from: h */
    public final void m90025h(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (f91265b instanceof C42228c) {
            return;
        }
        InterfaceC41049a interfaceC41049aM90020c = m90020c(type, null);
        m90018a(interfaceC41049aM90020c);
        f91267d.put(Boolean.valueOf(interfaceC41049aM90020c instanceof C42228c), interfaceC41049aM90020c);
    }
}
