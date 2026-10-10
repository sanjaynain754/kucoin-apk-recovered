package p436lo;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.loan.api.entity.LeverCoinConfig;
import com.kubi.loan.repo.platform.IPlatformService;
import com.kubi.utils.C27100x0;
import gf.C37890n;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mr.C42597a;
import nf.C42828b;
import no.C42856a;
import o00.C42916f;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p406ko.InterfaceC41087k;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: lo.l */
/* JADX INFO: compiled from: PlatformServiceImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\u0017\u001a\u00020\u0011H\u0016J\u001c\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0019\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\b\b\u0001\u0010\u0017\u001a\u00020\u0011H\u0097\u0001R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/loan/repo/platform/PlatformServiceImpl;", "Lcom/kubi/loan/repo/platform/IPlatformService;", "Lcom/kubi/loan/repo/IInternal;", "Lcom/kubi/loan/repo/platform/IPlatformApi;", "platformApi", "<init>", "(Lcom/kubi/loan/repo/platform/IPlatformApi;)V", "()V", "platformSp", "Lcom/kubi/loan/repo/platform/LoadPlatformStore;", "getLeverCurrency", "", "getLeverCoinList", "Lio/reactivex/Flowable;", "", "Lcom/kubi/data/entity/CoinInfoEntity;", "supportIsolated", "", "getLeverCoinConfig", "Lcom/kubi/loan/api/entity/LeverCoinConfig;", FirebaseAnalytics.Param.CURRENCY, RemoteConfigComponent.FETCH_FILE_NAME, "fetchLeverCoinConfig", "needRate", "fetchReferRate", "Ljava/math/BigDecimal;", "amount", "init", "", "fetchLeverCoinConfigV2", "LoanLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPlatformServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformServiceImpl.kt\ncom/kubi/loan/repo/platform/PlatformServiceImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,84:1\n1#2:85\n15#3,2:86\n774#4:88\n865#4,2:89\n*S KotlinDebug\n*F\n+ 1 PlatformServiceImpl.kt\ncom/kubi/loan/repo/platform/PlatformServiceImpl\n*L\n82#1:86,2\n41#1:88\n41#1:89,2\n*E\n"})
public final class C42289l implements IPlatformService, InterfaceC41087k, InterfaceC42278a {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC42278a f93778b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final C42281d f93779c;

    public C42289l(@NotNull InterfaceC42278a platformApi) {
        Intrinsics.checkNotNullParameter(platformApi, "platformApi");
        this.f93778b = platformApi;
        this.f93779c = new C42281d();
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m92815p(C42289l c42289l) {
        c42289l.mo92797d(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m92817r(C42289l c42289l) {
        c42289l.mo92797d(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m92821v(C42289l c42289l) {
        c42289l.mo92797d(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final void m92816q(final C42289l c42289l) {
        C27100x0.m66923d(new Function0() { // from class: lo.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C42289l.m92817r(this.f93776b);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static final void m92818s(final boolean z11, final FlowableEmitter emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        C37890n.f85269a.mo85590a(new Consumer() { // from class: lo.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C42289l.m92819t(emitter, z11, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static final void m92820u(final C42289l c42289l) {
        C27100x0.m66923d(new Function0() { // from class: lo.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C42289l.m92821v(this.f93777b);
            }
        });
    }

    @Override // p436lo.InterfaceC42278a
    @NotNull
    /* JADX INFO: renamed from: a */
    public BigDecimal mo92796a(@Nullable String str, @Nullable String str2) {
        return this.f93778b.mo92796a(str, str2);
    }

    @Override // com.kubi.loan.repo.platform.IPlatformService
    @NotNull
    /* JADX INFO: renamed from: c */
    public Flowable<List<CoinInfoEntity>> mo37797c(final boolean z11) {
        if (C42856a.f94921a.m94000c().c()) {
            Flowable<List<CoinInfoEntity>> flowableCreate = Flowable.create(new FlowableOnSubscribe() { // from class: lo.g
                @Override // io.reactivex.FlowableOnSubscribe
                public final void subscribe(FlowableEmitter flowableEmitter) {
                    C42289l.m92818s(z11, flowableEmitter);
                }
            }, BackpressureStrategy.BUFFER);
            Intrinsics.checkNotNull(flowableCreate);
            return flowableCreate;
        }
        Flowable<List<CoinInfoEntity>> flowableJust = Flowable.just(CollectionsKt.emptyList());
        Intrinsics.checkNotNull(flowableJust);
        return flowableJust;
    }

    @Override // p436lo.InterfaceC42278a
    @NotNull
    /* JADX INFO: renamed from: d */
    public List<LeverCoinConfig> mo92797d(boolean z11) {
        List<LeverCoinConfig> listMo92798h = C42856a.f94921a.m94000c().c() ? this.f93778b.mo92798h(z11) : this.f93778b.mo92797d(z11);
        this.f93779c.m92807i(listMo92798h);
        return listMo92798h;
    }

    @Override // com.kubi.loan.repo.platform.IPlatformService
    @Nullable
    /* JADX INFO: renamed from: e */
    public LeverCoinConfig mo37798e(@NotNull String currency, boolean z11) {
        Object next;
        Intrinsics.checkNotNullParameter(currency, "currency");
        String strM93912m = C42828b.m93912m(currency);
        Iterator<T> it = this.f93779c.m92804d().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((LeverCoinConfig) next).getCurrency(), strM93912m));
        LeverCoinConfig leverCoinConfig = (LeverCoinConfig) next;
        if (leverCoinConfig != null) {
            return leverCoinConfig;
        }
        if (z11) {
            C27100x0.m66923d(new Function0() { // from class: lo.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C42289l.m92815p(this.f93770b);
                }
            });
            return mo37798e(currency, false);
        }
        C42916f.m94127f().scheduleDirect(new Runnable() { // from class: lo.f
            @Override // java.lang.Runnable
            public final void run() {
                C42289l.m92816q(this.f93771b);
            }
        });
        return null;
    }

    @Override // com.kubi.loan.repo.platform.IPlatformService
    @NotNull
    /* JADX INFO: renamed from: f */
    public String mo37799f() {
        return this.f93779c.m92805e();
    }

    @Override // p436lo.InterfaceC42278a
    @GET("v2/margin/currencies")
    @NotNull
    /* JADX INFO: renamed from: h */
    public List<LeverCoinConfig> mo92798h(@Query("needRate") boolean z11) {
        return this.f93778b.mo92798h(z11);
    }

    @Override // p406ko.InterfaceC41087k
    public void init() {
        C42917g.m94137c().execute(new Runnable() { // from class: lo.i
            @Override // java.lang.Runnable
            public final void run() {
                C42289l.m92820u(this.f93775b);
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C42289l() {
        Object objCreate = C42597a.m93391g().create(InterfaceC42278a.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        this((InterfaceC42278a) objCreate);
    }

    /* JADX INFO: renamed from: t */
    public static final void m92819t(FlowableEmitter flowableEmitter, boolean z11, List list) {
        Intrinsics.checkNotNull(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            CoinInfoEntity coinInfoEntity = (CoinInfoEntity) obj;
            if (z11) {
                if (coinInfoEntity.isDebitEnabled() && (coinInfoEntity.isMarginEnabled() || coinInfoEntity.isIsolatedEnabled())) {
                    arrayList.add(obj);
                }
            } else if (coinInfoEntity.isDebitEnabled() && coinInfoEntity.isMarginEnabled()) {
                arrayList.add(obj);
            }
        }
        flowableEmitter.onNext(arrayList);
    }
}
