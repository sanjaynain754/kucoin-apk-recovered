package com.kubi.spot.business.saving;

import android.annotation.SuppressLint;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.network.restful.C19321b;
import com.kubi.sdk.util.C24217a1;
import com.kubi.spot.entity.SavingBalanceEntity;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import e20.InterfaceC37051b;
import e20.InterfaceC37053d;
import er.C37237b;
import gf.C37886j;
import gr.C38000b;
import gr.C38006h;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.C41696j;
import mr.C42597a;
import nf.C42828b;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: SavingCacheManager.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006J \u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0018\u0010\u001f\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010 \u001a\u00020\u001cJ\u000e\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u000bJ\u000e\u0010#\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u000bJ \u0010$\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001eJ$\u0010&\u001a\u00020\u00182\b\u0010'\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010\u0013H\u0002J\u001a\u0010\u001f\u001a\u00020\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010 \u001a\u00020\u001cH\u0002J\u001a\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010\u0006H\u0002R*\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006+"}, m90084d2 = {"Lcom/kubi/spot/business/saving/SavingCacheManager;", "", "<init>", "()V", "savingBalanceCache", "Ljava/util/HashMap;", "", "Lcom/kubi/spot/entity/SavingBalanceEntity;", "Lkotlin/collections/HashMap;", "balanceChangeListeners", "", "Lcom/kubi/spot/business/saving/SavingBalanceChangeListener;", "subSavingRestfulApi", "Lcom/kubi/spot/api/ISpotWSDynamicTopic;", "getSubSavingRestfulApi", "()Lcom/kubi/spot/api/ISpotWSDynamicTopic;", "subSavingRestfulApi$delegate", "Lkotlin/Lazy;", "getSavingBalance", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.CURRENCY, "getSavingBalanceDisplay", "currencyName", "asyncBalanceFromRemoteAndSub", "", "symbol", "Lcom/kubi/data/entity/SymbolInfoEntity;", "requestDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "subScope", "Lcom/kubi/spot/business/saving/SavingCoroutineScope;", "asyncBalanceFromRemote", "disposable", "registerSavingBalanceChangeEvent", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "unregisterSavingBalanceChangeEvent", "subSavingBalanceChangeEvent", "wsScope", "notifyDataChangeEvent", "uid", "balance", "updateSavingBalance", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"CheckResult"})
@SourceDebugExtension({"SMAP\nSavingCacheManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavingCacheManager.kt\ncom/kubi/spot/business/saving/SavingCacheManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,258:1\n1869#2,2:259\n*S KotlinDebug\n*F\n+ 1 SavingCacheManager.kt\ncom/kubi/spot/business/saving/SavingCacheManager\n*L\n222#1:259,2\n*E\n"})
public final class SavingCacheManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SavingCacheManager f50304a = new SavingCacheManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final HashMap<String, SavingBalanceEntity> f50305b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final List<SavingBalanceChangeListener> f50306c = new ArrayList();

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy f50307d = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.saving.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SavingCacheManager.m61297t();
        }
    });

    @Nullable
    /* JADX INFO: renamed from: n */
    public final BigDecimal m61301n(@Nullable String str) {
        String strH;
        if (str == null || (strH = UserInfo.a.h()) == null) {
            return null;
        }
        SavingBalanceEntity savingBalanceEntity = f50305b.get(str + strH);
        if (savingBalanceEntity != null) {
            return savingBalanceEntity.getAvailableBalance();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m61293i(String str, SavingBalanceEntity savingBalanceEntity) {
        SavingCacheManager savingCacheManager = f50304a;
        Intrinsics.checkNotNull(savingBalanceEntity);
        savingCacheManager.m61308v(savingBalanceEntity, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final InterfaceC37051b m61297t() {
        return (InterfaceC37051b) new C19321b.a().m42777b(new C38000b(C37237b.m83282e("network/channel_default"))).m42778c(new C38006h()).m42776a().m42772b(InterfaceC37051b.class);
    }

    /* JADX INFO: renamed from: g */
    public final void m61298g(@Nullable SymbolInfoEntity symbolInfoEntity, @NotNull CompositeDisposable disposable) {
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        if (SavingConfig.f50323a.m61341i(symbolInfoEntity)) {
            m61299h(symbolInfoEntity != null ? symbolInfoEntity.getQuoteCurrency() : null, disposable);
            m61299h(symbolInfoEntity != null ? symbolInfoEntity.getBaseCurrency() : null, disposable);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m61299h(String str, CompositeDisposable compositeDisposable) {
        if (str == null) {
            return;
        }
        final String strH = UserInfo.a.h();
        Observable observableObserveOn = ((InterfaceC37053d) C42597a.m93386b().create(InterfaceC37053d.class)).m82932X(str).compose(C24217a1.m58390n()).observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.business.saving.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SavingCacheManager.m61293i(strH, (SavingBalanceEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.spot.business.saving.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SavingCacheManager.m61294j(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.business.saving.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SavingCacheManager.m61295k((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.business.saving.o
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SavingCacheManager.m61296l(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    /* JADX INFO: renamed from: m */
    public final void m61300m(@Nullable SymbolInfoEntity symbolInfoEntity, @NotNull CompositeDisposable requestDisposable, @NotNull SavingCoroutineScope subScope) {
        Intrinsics.checkNotNullParameter(requestDisposable, "requestDisposable");
        Intrinsics.checkNotNullParameter(subScope, "subScope");
        if (SavingConfig.f50323a.m61341i(symbolInfoEntity)) {
            m61306s(symbolInfoEntity, requestDisposable, subScope);
            m61298g(symbolInfoEntity, requestDisposable);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final String m61302o(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            return "--";
        }
        BigDecimal bigDecimalM61301n = m61301n(str);
        return C42828b.m93906g(C27041f.m66669i(bigDecimalM61301n != null ? C37886j.m85578b(bigDecimalM61301n, str, null, false, false, false, 0, null, 0, 254, null) : null, "--"), C27041f.m66668h(str2), true, false, 4, null);
    }

    /* JADX INFO: renamed from: p */
    public final InterfaceC37051b m61303p() {
        return (InterfaceC37051b) f50307d.getValue();
    }

    /* JADX INFO: renamed from: q */
    public final void m61304q(String str, String str2, BigDecimal bigDecimal) {
        if (Intrinsics.areEqual(UserInfo.a.h(), str)) {
            for (SavingBalanceChangeListener savingBalanceChangeListener : f50306c) {
                BigDecimal bigDecimal2 = bigDecimal == null ? BigDecimal.ZERO : bigDecimal;
                Intrinsics.checkNotNull(bigDecimal2);
                savingBalanceChangeListener.mo61320a(str, str2, bigDecimal2);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m61305r(@NotNull SavingBalanceChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        f50306c.add(listener);
    }

    /* JADX INFO: renamed from: s */
    public final void m61306s(@Nullable SymbolInfoEntity symbolInfoEntity, @NotNull CompositeDisposable requestDisposable, @NotNull SavingCoroutineScope wsScope) {
        Intrinsics.checkNotNullParameter(requestDisposable, "requestDisposable");
        Intrinsics.checkNotNullParameter(wsScope, "wsScope");
        SavingConfig savingConfig = SavingConfig.f50323a;
        if (savingConfig.m61333a() && savingConfig.m61341i(symbolInfoEntity)) {
            wsScope.close();
            C41696j.m91104d(wsScope, null, null, new SavingCacheManager$subSavingBalanceChangeEvent$1(wsScope, symbolInfoEntity, requestDisposable, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m61307u(@NotNull SavingBalanceChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        f50306c.remove(listener);
    }

    /* JADX INFO: renamed from: v */
    public final void m61308v(SavingBalanceEntity savingBalanceEntity, String str) {
        if (str == null) {
            C44128b.m97260d("uid is null, updateSavingBalance failed.");
            return;
        }
        String currency = savingBalanceEntity.getCurrency();
        if (currency != null) {
            f50305b.put(currency + str, savingBalanceEntity);
            f50304a.m61304q(str, savingBalanceEntity.getCurrency(), savingBalanceEntity.getAvailableBalance());
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m61294j(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m61295k(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final void m61296l(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
