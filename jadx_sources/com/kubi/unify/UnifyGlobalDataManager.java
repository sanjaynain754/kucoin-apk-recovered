package com.kubi.unify;

import android.app.Activity;
import com.blankj.utilcode.util.C5264d;
import com.blankj.utilcode.util.C5287o0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.unify.api.entity.UnifyAccountType;
import com.kubi.unify.api.entity.UnifyHourlyRateEntity;
import com.kubi.unify.entity.BorrowConfigEntity;
import com.kubi.unify.entity.CDRConfigEntity;
import com.kubi.unify.entity.UnifyAccountStatusEntity;
import com.kubi.unify.entity.UnifyConfig;
import com.kubi.unify.utils.UnifyCoroutineScope;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.C27025c;
import i60.InterfaceC38460c;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: UnifyGlobalDataManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020 J\u0006\u0010+\u001a\u00020)J\b\u0010,\u001a\u00020)H\u0002J\u000e\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020/J/\u00100\u001a\u00020)2\n\b\u0002\u00101\u001a\u0004\u0018\u00010 2\n\b\u0002\u00102\u001a\u0004\u0018\u00010/2\n\b\u0002\u00103\u001a\u0004\u0018\u00010/¢\u0006\u0002\u00104J\b\u00105\u001a\u00020)H\u0002J\b\u00106\u001a\u00020)H\u0002J\b\u00107\u001a\u00020)H\u0002J\b\u00108\u001a\u00020)H\u0002J\b\u00109\u001a\u00020)H\u0002J\u0006\u0010:\u001a\u00020)J\u0016\u0010;\u001a\u00020)2\u0006\u0010*\u001a\u00020 2\u0006\u0010<\u001a\u00020!J\u0006\u0010=\u001a\u00020)R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011R \u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0011R \u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020%0\u001f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020%0\u001f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0011¨\u0006>"}, m90084d2 = {"Lcom/kubi/unify/UnifyGlobalDataManager;", "", "<init>", "()V", "unifyApi", "Lcom/kubi/unify/api/UnifyApi;", "getUnifyApi", "()Lcom/kubi/unify/api/UnifyApi;", "unifyApi$delegate", "Lkotlin/Lazy;", "_unifyCdrConfigState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/kubi/unify/entity/CDRConfigEntity;", "unifyCdrConfigState", "Lkotlinx/coroutines/flow/StateFlow;", "getUnifyCdrConfigState", "()Lkotlinx/coroutines/flow/StateFlow;", "_unifyLoanConfigState", "Lcom/kubi/unify/entity/BorrowConfigEntity;", "unifyLoanConfigState", "getUnifyLoanConfigState", "_unifyConfigState", "Lcom/kubi/unify/entity/UnifyConfig;", "unifyConfigState", "getUnifyConfigState", "_unifyAccountStatusState", "Lcom/kubi/unify/entity/UnifyAccountStatusEntity;", "unifyAccountStatusState", "getUnifyAccountStatusState", "_userLoanLeverageConfigState", "", "", "Ljava/math/BigDecimal;", "userLoanLeverageConfigState", "getUserLoanLeverageConfigState", "_unifyHourlyRatesState", "Lcom/kubi/unify/api/entity/UnifyHourlyRateEntity;", "unifyHourlyRatesState", "getUnifyHourlyRatesState", "fetchUnifyHourlyRates", "", FirebaseAnalytics.Param.CURRENCY, "init", "registerAppStatus", "onLoginStatusChanged", "hasLogin", "", "changeUnifyAccountStatus", "accountType", "isAnswered", "hasOpened", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "fetchUnifyConfig", "fetchUnifyCdrConfig", "fetchUnifyLoanCurrencyConfig", "fetchUserStateInfo", "fetchUserLoanLeverageConfig", "updateUserLoanLeverageConfig", "updateUserLoanLeverageFromWs", "leverage", "updateUnifyLoanCurrencyConfig", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifyGlobalDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyGlobalDataManager.kt\ncom/kubi/unify/UnifyGlobalDataManager\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,336:1\n144#2,2:337\n*S KotlinDebug\n*F\n+ 1 UnifyGlobalDataManager.kt\ncom/kubi/unify/UnifyGlobalDataManager\n*L\n164#1:337,2\n*E\n"})
public final class UnifyGlobalDataManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final UnifyGlobalDataManager f53084a = new UnifyGlobalDataManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f53085b = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifyGlobalDataManager.m64857C();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final InterfaceC41669n<List<CDRConfigEntity>> f53086c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final InterfaceC41678w<List<CDRConfigEntity>> f53087d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final InterfaceC41669n<List<BorrowConfigEntity>> f53088e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final InterfaceC41678w<List<BorrowConfigEntity>> f53089f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final InterfaceC41669n<UnifyConfig> f53090g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final InterfaceC41678w<UnifyConfig> f53091h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final InterfaceC41669n<UnifyAccountStatusEntity> f53092i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final InterfaceC41678w<UnifyAccountStatusEntity> f53093j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final InterfaceC41669n<Map<String, BigDecimal>> f53094k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final InterfaceC41678w<Map<String, BigDecimal>> f53095l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final InterfaceC41669n<Map<String, UnifyHourlyRateEntity>> f53096m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final InterfaceC41678w<Map<String, UnifyHourlyRateEntity>> f53097n;

    /* JADX INFO: renamed from: com.kubi.unify.UnifyGlobalDataManager$a */
    /* JADX INFO: compiled from: UnifyGlobalDataManager.kt */
    /* JADX INFO: loaded from: classes52.dex */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/unify/UnifyGlobalDataManager$registerAppStatus$1", "Lcom/blankj/utilcode/util/Utils$OnAppStatusChangedListener;", "onForeground", "", "activity", "Landroid/app/Activity;", "onBackground", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26448a implements C5287o0.b {
        @Override // com.blankj.utilcode.util.C5287o0.b
        public void onForeground(Activity activity) {
            UnifyGlobalDataManager.f53084a.m64880r();
        }

        @Override // com.blankj.utilcode.util.C5287o0.b
        public void onBackground(Activity activity) {
        }
    }

    static {
        InterfaceC41669n<List<CDRConfigEntity>> interfaceC41669nM91009a = C41679x.m91009a(CollectionsKt.emptyList());
        f53086c = interfaceC41669nM91009a;
        f53087d = C41636g.m90907c(interfaceC41669nM91009a);
        InterfaceC41669n<List<BorrowConfigEntity>> interfaceC41669nM91009a2 = C41679x.m91009a(CollectionsKt.emptyList());
        f53088e = interfaceC41669nM91009a2;
        f53089f = C41636g.m90907c(interfaceC41669nM91009a2);
        InterfaceC41669n<UnifyConfig> interfaceC41669nM91009a3 = C41679x.m91009a(new UnifyConfig(null, null, null, null, 15, null));
        f53090g = interfaceC41669nM91009a3;
        f53091h = C41636g.m90907c(interfaceC41669nM91009a3);
        InterfaceC41669n<UnifyAccountStatusEntity> interfaceC41669nM91009a4 = C41679x.m91009a(new UnifyAccountStatusEntity(null, null, null, null, 15, null));
        f53092i = interfaceC41669nM91009a4;
        f53093j = C41636g.m90907c(interfaceC41669nM91009a4);
        InterfaceC41669n<Map<String, BigDecimal>> interfaceC41669nM91009a5 = C41679x.m91009a(MapsKt.emptyMap());
        f53094k = interfaceC41669nM91009a5;
        f53095l = C41636g.m90907c(interfaceC41669nM91009a5);
        InterfaceC41669n<Map<String, UnifyHourlyRateEntity>> interfaceC41669nM91009a6 = C41679x.m91009a(MapsKt.emptyMap());
        f53096m = interfaceC41669nM91009a6;
        f53097n = C41636g.m90907c(interfaceC41669nM91009a6);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m64868l(UnifyGlobalDataManager unifyGlobalDataManager, String str, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = f53093j.getValue().getAccountType();
        }
        if ((i11 & 2) != 0) {
            bool = f53093j.getValue().isAnswered();
        }
        if ((i11 & 4) != 0) {
            bool2 = Boolean.valueOf(C27025c.m66566d(f53093j.getValue().getHasOpened()) || Intrinsics.areEqual(str, UnifyAccountType.UNIFIED.getValue()));
        }
        unifyGlobalDataManager.m64874k(str, bool, bool2);
    }

    /* JADX INFO: renamed from: A */
    public final void m64869A(boolean z11) {
        if (z11) {
            m64880r();
        } else {
            f53092i.setValue(new UnifyAccountStatusEntity(null, null, null, null, 15, null));
            f53094k.setValue(MapsKt.emptyMap());
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m64870B() {
        C5264d.registerAppStatusChangedListener(new C26448a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D */
    public final void m64871D() {
        C41696j.m91104d(new UnifyCoroutineScope(null, 1, 0 == true ? 1 : 0), null, null, new UnifyGlobalDataManager$updateUnifyLoanCurrencyConfig$1(null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public final void m64872E() {
        C41696j.m91104d(new UnifyCoroutineScope(null, 1, 0 == true ? 1 : 0), null, null, new UnifyGlobalDataManager$updateUserLoanLeverageConfig$1(null), 3, null);
    }

    /* JADX INFO: renamed from: F */
    public final void m64873F(@NotNull String currency, @NotNull BigDecimal leverage) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        InterfaceC41669n<Map<String, BigDecimal>> interfaceC41669n = f53094k;
        Map<String, BigDecimal> mutableMap = MapsKt.toMutableMap(interfaceC41669n.getValue());
        mutableMap.put(currency, leverage);
        interfaceC41669n.setValue(mutableMap);
    }

    /* JADX INFO: renamed from: k */
    public final void m64874k(@Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2) {
        InterfaceC41669n<UnifyAccountStatusEntity> interfaceC41669n = f53092i;
        interfaceC41669n.setValue(interfaceC41669n.getValue().copy(bool, str, bool2, Boolean.TRUE));
        C46392a.m102331n(UnifyStoreIds.f53305a.m65247i(), f53093j.getValue());
        if (C27025c.m66566d(bool2)) {
            m64879q();
        }
        IReactNativeService.INSTANCE.get().nativeNotifyRn("userAccountChanged", MapsKt.hashMapOf(TuplesKt.m90091to("isUtaTrading", Boolean.valueOf(IUnifyAccountService.f53155a.get().mo64979C()))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public final void m64875m() {
        C41696j.m91104d(new UnifyCoroutineScope(null, 1, 0 == true ? 1 : 0), null, null, new UnifyGlobalDataManager$fetchUnifyCdrConfig$1(null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final void m64876n() {
        C41696j.m91104d(new UnifyCoroutineScope(null, 1, 0 == true ? 1 : 0), null, null, new UnifyGlobalDataManager$fetchUnifyConfig$1(null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public final void m64877o(@NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        if (UserInfo.a.n()) {
            C41696j.m91104d(new UnifyCoroutineScope(null, 1, 0 == true ? 1 : 0), null, null, new UnifyGlobalDataManager$fetchUnifyHourlyRates$1(currency, null), 3, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public final void m64878p() {
        C41696j.m91104d(new UnifyCoroutineScope(null, 1, 0 == true ? 1 : 0), null, null, new UnifyGlobalDataManager$fetchUnifyLoanCurrencyConfig$1(null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public final void m64879q() {
        if (UserInfo.a.n() && C27025c.m66566d(f53092i.getValue().getHasOpened())) {
            C41696j.m91104d(new UnifyCoroutineScope(null, 1, 0 == true ? 1 : 0), null, null, new UnifyGlobalDataManager$fetchUserLoanLeverageConfig$1(null), 3, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public final void m64880r() {
        if (UserInfo.a.n()) {
            C41696j.m91104d(new UnifyCoroutineScope(null, 1, 0 == true ? 1 : 0), null, null, new UnifyGlobalDataManager$fetchUserStateInfo$1(null), 3, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final InterfaceC41678w<UnifyAccountStatusEntity> m64881s() {
        return f53093j;
    }

    /* JADX INFO: renamed from: t */
    public final InterfaceC38460c m64882t() {
        Object value = f53085b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (InterfaceC38460c) value;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final InterfaceC41678w<List<CDRConfigEntity>> m64883u() {
        return f53087d;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final InterfaceC41678w<UnifyConfig> m64884v() {
        return f53091h;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final InterfaceC41678w<Map<String, UnifyHourlyRateEntity>> m64885w() {
        return f53097n;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final InterfaceC41678w<List<BorrowConfigEntity>> m64886x() {
        return f53089f;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final InterfaceC41678w<Map<String, BigDecimal>> m64887y() {
        return f53095l;
    }

    /* JADX INFO: renamed from: C */
    public static final InterfaceC38460c m64857C() {
        return (InterfaceC38460c) C42597a.m93388d().create(InterfaceC38460c.class);
    }

    /* JADX INFO: renamed from: z */
    public final void m64888z() {
        m64876n();
        m64875m();
        m64878p();
        m64880r();
        m64870B();
    }
}
