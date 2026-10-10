package p801yl;

import android.annotation.SuppressLint;
import androidx.lifecycle.MutableLiveData;
import bm.C4634g;
import com.google.common.base.Optional;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.PreferencesEntity;
import com.kubi.kumex.data.platform.model.UserConfig;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.utils.DataMapUtil;
import com.kubi.utils.FlowableCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import fm.C37567b;
import fm.C37571f;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p729wl.C45875l0;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ReplaceWith;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import sh0.InterfaceC44416b;
import th.InterfaceC44980d;

/* JADX INFO: renamed from: yl.h0 */
/* JADX INFO: compiled from: ContractConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\bJ\u0006\u0010\u0011\u001a\u00020\bJ*\u0010\u0012\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\b0\b \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\b0\b\u0018\u00010\u00130\u0013J\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017J*\u0010\u001a\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00170\u0017 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00170\u0017\u0018\u00010\u00130\u0013J\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0013J\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0013H\u0007J\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0013J\u0014\u0010\"\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u001f0\u001f0\u0013J\u0006\u0010#\u001a\u00020\bJ\u0016\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\bJ\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0(J\u0006\u0010)\u001a\u00020\bJ\u0006\u0010*\u001a\u00020\bJ\u0006\u0010+\u001a\u00020\bJ\u0006\u0010,\u001a\u00020\bJ\u0006\u0010-\u001a\u00020\fJ\u0006\u0010.\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006/"}, m90084d2 = {"Lcom/kubi/kumex/config/ContractConfig;", "", "<init>", "()V", "DEFAULT_PRECISION", "", "_isCopyTradingSymbolOccurredFallback", "Landroidx/lifecycle/MutableLiveData;", "", "isCopyTradingSymbolOccurredFallback", "()Landroidx/lifecycle/MutableLiveData;", "clearCopyTradingSymbolOccurred", "", "init", "isPro", "setLot", "lot", "isLot", "observeLot", "Lio/reactivex/Flowable;", "kotlin.jvm.PlatformType", "setSymbol", "symbol", "", "getSymbol", "getSymbolPricePrecision", "observeSymbol", "getSymbolConfig", "Lcom/kubi/kumex/data/platform/model/SymbolConfig;", "observeSymbolConfig", "getContract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "observeContract", "observeCurrentContract", "observeContractLot", "getInitIsPro", "submitPreferencesSettings", "settings", "Lcom/kubi/kumex/data/platform/model/PreferencesEntity;", "observePreferencesSettingsPosition", "Lio/reactivex/Observable;", "isPreferencesPositionOpen", "isPreferencesStopProfitAndLossOpen", "isPreferencesIndexPriceOpen", "isPreferencesFundingRateOpen", "trackPreferenceSettings", "getMaxLeverage", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"CheckResult"})
@SourceDebugExtension({"SMAP\nContractConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContractConfig.kt\ncom/kubi/kumex/config/ContractConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,249:1\n1999#2,14:250\n295#2,2:264\n*S KotlinDebug\n*F\n+ 1 ContractConfig.kt\ncom/kubi/kumex/config/ContractConfig\n*L\n245#1:250,14\n129#1:264,2\n*E\n"})
public final class C46527h0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46527h0 f104291a = new C46527h0();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final MutableLiveData<Boolean> f104292b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final MutableLiveData<Boolean> f104293c;

    static {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        f104292b = mutableLiveData;
        f104293c = mutableLiveData;
    }

    /* JADX INFO: renamed from: A0 */
    public static final Boolean m102604A0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Boolean) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: C0 */
    public static final String m102607C0(UserConfig it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C37571f.m84694a(it);
    }

    /* JADX INFO: renamed from: D0 */
    public static final String m102609D0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (String) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: H0 */
    public static final void m102614H0(PreferencesEntity preferencesEntity, Object obj) {
        RepositoryServiceLocator.f19236a.m20290i().mo99986i(preferencesEntity);
        f104291a.m102676K0();
    }

    /* JADX INFO: renamed from: I0 */
    public static final Unit m102615I0(PreferencesEntity preferencesEntity, Throwable th2) {
        C44128b.m97259c("submitPreferencesSettings 失败", preferencesEntity + '\n' + th2.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M */
    public static final void m102617M(String str) {
        f104292b.postValue(Boolean.TRUE);
        C46527h0 c46527h0 = f104291a;
        Intrinsics.checkNotNull(str);
        c46527h0.m102670E0(str);
    }

    /* JADX INFO: renamed from: X */
    public static final InterfaceC44416b m102618X(Pair it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getSecond() != null) {
            Object second = it.getSecond();
            Intrinsics.checkNotNull(second);
            return Flowable.just(second);
        }
        InterfaceC44980d interfaceC44980dM20288g = RepositoryServiceLocator.f19236a.m20288g();
        Object first = it.getFirst();
        Intrinsics.checkNotNullExpressionValue(first, "<get-first>(...)");
        Flowable<ContractEntity> flowableMo24982I = interfaceC44980dM20288g.mo24982I((String) first);
        final Function1 function1 = new Function1() { // from class: yl.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C46527h0.m102620Z((ContractEntity) obj));
            }
        };
        return flowableMo24982I.filter(new Predicate() { // from class: yl.x
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return C46527h0.m102619Y(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public static final boolean m102619Y(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: Z */
    public static final boolean m102620Z(ContractEntity contract) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        return Intrinsics.areEqual(f104291a.m102677L(), contract.getSymbol());
    }

    /* JADX INFO: renamed from: a0 */
    public static final InterfaceC44416b m102622a0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (InterfaceC44416b) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: b0 */
    public static final String m102624b0(UserConfig it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C37571f.m84694a(it);
    }

    /* JADX INFO: renamed from: c0 */
    public static final String m102626c0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (String) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: d0 */
    public static final Pair m102628d0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new Pair(it, InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), it, false, 2, null));
    }

    /* JADX INFO: renamed from: e0 */
    public static final Pair m102630e0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Pair) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: g0 */
    public static final Optional m102633g0(Boolean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Optional.fromNullable(f104291a.m102673I());
    }

    /* JADX INFO: renamed from: h0 */
    public static final Optional m102635h0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Optional) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: i0 */
    public static final boolean m102637i0(Optional it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.isPresent();
    }

    /* JADX INFO: renamed from: j0 */
    public static final boolean m102639j0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: k0 */
    public static final ContractEntity m102641k0(Optional it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object obj = it.get();
        Intrinsics.checkNotNull(obj);
        return (ContractEntity) obj;
    }

    /* JADX INFO: renamed from: l0 */
    public static final ContractEntity m102643l0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (ContractEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: n0 */
    public static final String m102646n0(UserConfig it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C37571f.m84694a(it);
    }

    /* JADX INFO: renamed from: o0 */
    public static final String m102648o0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (String) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: p0 */
    public static final ContractEntity m102650p0(String symbol, List list) {
        Object next;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(list, "list");
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((ContractEntity) next).getSymbol(), symbol));
        ContractEntity contractEntity = (ContractEntity) next;
        return contractEntity == null ? new ContractEntity(null, false, null, null, null, null, null, null, 0L, 0L, 0L, null, 0L, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 536870911, null) : contractEntity;
    }

    /* JADX INFO: renamed from: q0 */
    public static final ContractEntity m102652q0(Function2 function2, Object p11, Object p12) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return (ContractEntity) function2.invoke(p11, p12);
    }

    /* JADX INFO: renamed from: r0 */
    public static final boolean m102654r0(ContractEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String symbol = it.getSymbol();
        return !(symbol == null || symbol.length() == 0);
    }

    /* JADX INFO: renamed from: s0 */
    public static final boolean m102656s0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: t0 */
    public static final boolean m102658t0(ContractEntity last, ContractEntity current) {
        Intrinsics.checkNotNullParameter(last, "last");
        Intrinsics.checkNotNullParameter(current, "current");
        return Intrinsics.areEqual(last, current);
    }

    /* JADX INFO: renamed from: u0 */
    public static final boolean m102660u0(Function2 function2, Object p11, Object p12) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return ((Boolean) function2.invoke(p11, p12)).booleanValue();
    }

    /* JADX INFO: renamed from: w0 */
    public static final Boolean m102663w0(UserConfig it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(C37571f.m84696c(it));
    }

    /* JADX INFO: renamed from: x0 */
    public static final Boolean m102665x0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Boolean) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: z0 */
    public static final Boolean m102668z0(PreferencesEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(C27025c.m66567e(it.getSeniorPosition(), true));
    }

    /* JADX INFO: renamed from: B0 */
    public final Flowable<String> m102669B0() {
        Flowable<UserConfig> flowableMo99989o = RepositoryServiceLocator.f19236a.m20290i().mo99989o();
        final Function1 function1 = new Function1() { // from class: yl.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C46527h0.m102607C0((UserConfig) obj);
            }
        };
        return flowableMo99989o.map(new Function() { // from class: yl.d
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C46527h0.m102609D0(function1, obj);
            }
        }).distinctUntilChanged();
    }

    /* JADX INFO: renamed from: E0 */
    public final void m102670E0(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        RepositoryServiceLocator.f19236a.m20290i().mo99991q(MapsKt.mutableMapOf(new Pair("defaultSymbol", symbol)));
    }

    /* JADX INFO: renamed from: F0 */
    public final void m102671F0(@NotNull final PreferencesEntity settings, final boolean z11) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        KuMexDepend kuMexDepend = KuMexDepend.f30378a;
        if (kuMexDepend.m35905g().c() && kuMexDepend.m35906h() && settings.getSeniorOrder() == null && settings.getSeniorPosition() == null && settings.getConditionalOrder() == null && settings.getStopProfitAndLoss() == null && settings.getIndexPrice() == null) {
            Flowable flowableObserveOn = FlowableCompat.f54248a.m66385b(new Function0() { // from class: yl.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C46527h0.m102613G0(settings, z11);
                }
            }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
            Consumer consumer = new Consumer() { // from class: yl.w
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C46527h0.m102614H0(settings, obj);
                }
            };
            final Function1 function1 = new Function1() { // from class: yl.a0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C46527h0.m102615I0(settings, (Throwable) obj);
                }
            };
            flowableObserveOn.subscribe(consumer, new Consumer() { // from class: yl.b0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C46527h0.m102616J0(function1, obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m102672H() {
        f104292b.setValue(Boolean.FALSE);
    }

    @Nullable
    /* JADX INFO: renamed from: I */
    public final ContractEntity m102673I() {
        return InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), m102677L(), false, 2, null);
    }

    /* JADX INFO: renamed from: J */
    public final boolean m102674J() {
        if (C37571f.m84695b(RepositoryServiceLocator.f19236a.m20290i().mo99981F0())) {
            return m102686V();
        }
        return !DataMapUtil.m66366b(DataMapUtil.f54245a, C45875l0.f103336a.m101357y0(), false, 2, null);
    }

    /* JADX INFO: renamed from: K */
    public final int m102675K() {
        Object next;
        BigDecimal maxLeverage;
        Iterator<T> it = RepositoryServiceLocator.f19236a.m20288g().mo25016k().iterator();
        Integer numValueOf = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                double dM66647g = C27039d.m66647g(((ContractEntity) next).getMaxLeverage());
                do {
                    Object next2 = it.next();
                    double dM66647g2 = C27039d.m66647g(((ContractEntity) next2).getMaxLeverage());
                    if (Double.compare(dM66647g, dM66647g2) < 0) {
                        next = next2;
                        dM66647g = dM66647g2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        ContractEntity contractEntity = (ContractEntity) next;
        if (contractEntity != null && (maxLeverage = contractEntity.getMaxLeverage()) != null) {
            numValueOf = Integer.valueOf(maxLeverage.intValue());
        }
        return C27039d.m66651k(numValueOf, 100);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m102676K0() {
        PreferencesEntity preferencesEntityMo99988m = RepositoryServiceLocator.f19236a.m20290i().mo99988m();
        if (preferencesEntityMo99988m.getSeniorOrder() == null || preferencesEntityMo99988m.getSeniorPosition() == null || preferencesEntityMo99988m.getConditionalOrder() == null || preferencesEntityMo99988m.getIndexPrice() == null) {
            return;
        }
        preferencesEntityMo99988m.getStopProfitAndLoss();
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final String m102677L() {
        List<ContractEntity> listMo25016k;
        RepositoryServiceLocator repositoryServiceLocator = RepositoryServiceLocator.f19236a;
        String strM84694a = C37571f.m84694a(repositoryServiceLocator.m20290i().mo99981F0());
        if (Intrinsics.areEqual(strM84694a, C4634g.m4564a()) || (listMo25016k = repositoryServiceLocator.m20288g().mo25016k()) == null || listMo25016k.isEmpty()) {
            return strM84694a;
        }
        if (InterfaceC44980d.m99529O(repositoryServiceLocator.m20288g(), strM84694a, false, 2, null) != null) {
            return BrokerConfig.f19211a.m20201d().mo20226H(strM84694a, new Consumer() { // from class: yl.a
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C46527h0.m102617M((String) obj);
                }
            });
        }
        m102670E0(C4634g.m4564a());
        return C4634g.m4564a();
    }

    /* JADX INFO: renamed from: N */
    public final int m102678N(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), symbol, false, 2, null);
        if (contractEntityM99529O != null) {
            return C37567b.m84618h(contractEntityM99529O);
        }
        return 4;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final MutableLiveData<Boolean> m102680P() {
        return f104293c;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m102681Q() {
        return C37571f.m84696c(RepositoryServiceLocator.f19236a.m20290i().mo99981F0());
    }

    /* JADX INFO: renamed from: R */
    public final boolean m102682R() {
        return C27025c.m66567e(RepositoryServiceLocator.f19236a.m20290i().mo99988m().getFundingRate(), true);
    }

    /* JADX INFO: renamed from: S */
    public final boolean m102683S() {
        return C27025c.m66567e(RepositoryServiceLocator.f19236a.m20290i().mo99988m().getIndexPrice(), true);
    }

    /* JADX INFO: renamed from: T */
    public final boolean m102684T() {
        return C27025c.m66567e(RepositoryServiceLocator.f19236a.m20290i().mo99988m().getSeniorPosition(), true);
    }

    /* JADX INFO: renamed from: U */
    public final boolean m102685U() {
        return C27025c.m66567e(RepositoryServiceLocator.f19236a.m20290i().mo99988m().getStopProfitAndLoss(), true);
    }

    /* JADX INFO: renamed from: V */
    public final boolean m102686V() {
        return C37571f.m84697d(RepositoryServiceLocator.f19236a.m20290i().mo99981F0());
    }

    @Deprecated(message = "observeContract 如果此合约的单个参数发生变化，上游收不到回调", replaceWith = @ReplaceWith(expression = "observeCurrentContract", imports = {}))
    @NotNull
    /* JADX INFO: renamed from: W */
    public final Flowable<ContractEntity> m102687W() {
        Flowable<UserConfig> flowableMo99989o = RepositoryServiceLocator.f19236a.m20290i().mo99989o();
        final Function1 function1 = new Function1() { // from class: yl.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C46527h0.m102624b0((UserConfig) obj);
            }
        };
        Flowable<R> map = flowableMo99989o.map(new Function() { // from class: yl.h
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C46527h0.m102626c0(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: yl.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C46527h0.m102628d0((String) obj);
            }
        };
        Flowable map2 = map.map(new Function() { // from class: yl.j
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C46527h0.m102630e0(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: yl.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C46527h0.m102618X((Pair) obj);
            }
        };
        Flowable<ContractEntity> flowableFlatMap = map2.flatMap(new Function() { // from class: yl.m
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C46527h0.m102622a0(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(flowableFlatMap, "flatMap(...)");
        return flowableFlatMap;
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final Flowable<ContractEntity> m102689m0() {
        RepositoryServiceLocator repositoryServiceLocator = RepositoryServiceLocator.f19236a;
        Flowable<UserConfig> flowableMo99989o = repositoryServiceLocator.m20290i().mo99989o();
        final Function1 function1 = new Function1() { // from class: yl.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C46527h0.m102646n0((UserConfig) obj);
            }
        };
        InterfaceC44416b map = flowableMo99989o.map(new Function() { // from class: yl.o
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C46527h0.m102648o0(function1, obj);
            }
        });
        Flowable<List<ContractEntity>> flowableMo24989Q = repositoryServiceLocator.m20288g().mo24989Q();
        final Function2 function2 = new Function2() { // from class: yl.p
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C46527h0.m102650p0((String) obj, (List) obj2);
            }
        };
        Flowable flowableCombineLatest = Flowable.combineLatest(map, flowableMo24989Q, new BiFunction() { // from class: yl.q
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return C46527h0.m102652q0(function2, obj, obj2);
            }
        });
        final Function1 function3 = new Function1() { // from class: yl.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C46527h0.m102654r0((ContractEntity) obj));
            }
        };
        Flowable flowableFilter = flowableCombineLatest.filter(new Predicate() { // from class: yl.s
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return C46527h0.m102656s0(function3, obj);
            }
        });
        final Function2 function4 = new Function2() { // from class: yl.t
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(C46527h0.m102658t0((ContractEntity) obj, (ContractEntity) obj2));
            }
        };
        Flowable<ContractEntity> flowableDistinctUntilChanged = flowableFilter.distinctUntilChanged(new BiPredicate() { // from class: yl.u
            @Override // io.reactivex.functions.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                return C46527h0.m102660u0(function4, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(flowableDistinctUntilChanged, "distinctUntilChanged(...)");
        return flowableDistinctUntilChanged;
    }

    /* JADX INFO: renamed from: v0 */
    public final Flowable<Boolean> m102690v0() {
        Flowable<UserConfig> flowableMo99989o = RepositoryServiceLocator.f19236a.m20290i().mo99989o();
        final Function1 function1 = new Function1() { // from class: yl.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C46527h0.m102663w0((UserConfig) obj);
            }
        };
        return flowableMo99989o.map(new Function() { // from class: yl.z
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C46527h0.m102665x0(function1, obj);
            }
        }).distinctUntilChanged();
    }

    @NotNull
    /* JADX INFO: renamed from: y0 */
    public final Observable<Boolean> m102691y0() {
        Observable<PreferencesEntity> observableMo99990p = RepositoryServiceLocator.f19236a.m20290i().mo99990p();
        final Function1 function1 = new Function1() { // from class: yl.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C46527h0.m102668z0((PreferencesEntity) obj);
            }
        };
        Observable<Boolean> observableDistinctUntilChanged = observableMo99990p.map(new Function() { // from class: yl.f
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C46527h0.m102604A0(function1, obj);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    /* JADX INFO: renamed from: G0 */
    public static final Object m102613G0(PreferencesEntity preferencesEntity, boolean z11) {
        preferencesEntity.setSeniorOrder(Boolean.valueOf(z11));
        preferencesEntity.setSeniorPosition(Boolean.valueOf(z11));
        preferencesEntity.setConditionalOrder(Boolean.valueOf(z11));
        preferencesEntity.setStopProfitAndLoss(Boolean.valueOf(z11));
        preferencesEntity.setIndexPrice(Boolean.valueOf(z11));
        preferencesEntity.setFundingRate(Boolean.valueOf(z11));
        Object objMo99992r = RepositoryServiceLocator.f19236a.m20290i().mo99992r(preferencesEntity);
        if (objMo99992r == null) {
            return new Object();
        }
        return objMo99992r;
    }

    /* JADX INFO: renamed from: J0 */
    public static final void m102616J0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final Flowable<ContractEntity> m102688f0() {
        Flowable<ContractEntity> flowableM102687W = m102687W();
        Flowable<Boolean> flowableM102690v0 = m102690v0();
        final Function1 function1 = new Function1() { // from class: yl.c0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C46527h0.m102633g0((Boolean) obj);
            }
        };
        Flowable<R> map = flowableM102690v0.map(new Function() { // from class: yl.d0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C46527h0.m102635h0(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: yl.e0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C46527h0.m102637i0((Optional) obj));
            }
        };
        Flowable flowableFilter = map.filter(new Predicate() { // from class: yl.f0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return C46527h0.m102639j0(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: yl.g0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C46527h0.m102641k0((Optional) obj);
            }
        };
        Flowable<ContractEntity> flowableMerge = Flowable.merge(flowableM102687W, flowableFilter.map(new Function() { // from class: yl.b
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C46527h0.m102643l0(function3, obj);
            }
        }));
        Intrinsics.checkNotNullExpressionValue(flowableMerge, "merge(...)");
        return flowableMerge;
    }

    /* JADX INFO: renamed from: O */
    public final void m102679O() {
    }
}
