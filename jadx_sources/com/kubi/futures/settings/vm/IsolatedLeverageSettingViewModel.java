package com.kubi.futures.settings.vm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.compliance.leverage.EuropeUnlockLeverageViewModel;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.service.KuMexDepend;
import com.tencent.bugly.proguard.C33556b3;
import java.math.BigDecimal;
import java.util.HashMap;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import th.InterfaceC44980d;

/* JADX INFO: compiled from: IsolatedLeverageSettingViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000bJ\u0016\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018J\u0016\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018J\u0006\u0010\u001e\u001a\u00020\u0006J\u0006\u0010\u001f\u001a\u00020\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR%\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\bR\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m90084d2 = {"Lcom/kubi/futures/settings/vm/IsolatedLeverageSettingViewModel;", "Lcom/kubi/futures/compliance/leverage/EuropeUnlockLeverageViewModel;", "<init>", "()V", "userMaxLeverage", "Landroidx/lifecycle/MutableLiveData;", "Ljava/math/BigDecimal;", "getUserMaxLeverage", "()Landroidx/lifecycle/MutableLiveData;", "submitResult", "Lkotlin/Pair;", "", "", "getSubmitResult", "batchSubmitResult", "getBatchSubmitResult", "_crossTrialMaxLeverage", "crossTrialMaxLeverage", "Landroidx/lifecycle/LiveData;", "getCrossTrialMaxLeverage", "()Landroidx/lifecycle/LiveData;", "fetchUserRiskLimit", "", "symbol", "", "isTrial", "submitLeverage", "leverage", "submitAllLeverage", "primarySymbol", "getUsefulLeverage", "isEnable", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIsolatedLeverageSettingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IsolatedLeverageSettingViewModel.kt\ncom/kubi/futures/settings/vm/IsolatedLeverageSettingViewModel\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,113:1\n47#2,4:114\n*S KotlinDebug\n*F\n+ 1 IsolatedLeverageSettingViewModel.kt\ncom/kubi/futures/settings/vm/IsolatedLeverageSettingViewModel\n*L\n52#1:114,4\n*E\n"})
public class IsolatedLeverageSettingViewModel extends EuropeUnlockLeverageViewModel {

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<BigDecimal> f23486a0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<Pair<Boolean, Throwable>> f23487b0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<Pair<Boolean, Throwable>> f23488c0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<Boolean> f23489d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final LiveData<Boolean> f23490e0;

    /* JADX INFO: renamed from: com.kubi.futures.settings.vm.IsolatedLeverageSettingViewModel$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 IsolatedLeverageSettingViewModel.kt\ncom/kubi/futures/settings/vm/IsolatedLeverageSettingViewModel\n*L\n1#1,49:1\n53#2,2:50\n*E\n"})
    public static final class C13507a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ IsolatedLeverageSettingViewModel f23491b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ BigDecimal f23492c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13507a(CoroutineExceptionHandler.Companion companion, IsolatedLeverageSettingViewModel isolatedLeverageSettingViewModel, BigDecimal bigDecimal) {
            super(companion);
            this.f23491b = isolatedLeverageSettingViewModel;
            this.f23492c = bigDecimal;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            this.f23491b.m26384D().postValue(this.f23492c);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final LiveData<Boolean> m26381A() {
        return this.f23490e0;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final MutableLiveData<Pair<Boolean, Throwable>> m26382B() {
        return this.f23487b0;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final BigDecimal m26383C() {
        return KuMexDepend.f30378a.m35905g().c() ? C41014a.m89921F(this.f23486a0.getValue(), "5") : new BigDecimal(5);
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final MutableLiveData<BigDecimal> m26384D() {
        return this.f23486a0;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m26385E() {
        return this.f23486a0.getValue() != null;
    }

    /* JADX INFO: renamed from: F */
    public final void m26386F(@NotNull String primarySymbol, @NotNull String leverage) {
        Intrinsics.checkNotNullParameter(primarySymbol, "primarySymbol");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new IsolatedLeverageSettingViewModel$submitAllLeverage$1(primarySymbol, leverage, this, null), 2, null);
    }

    /* JADX INFO: renamed from: G */
    public final void m26387G(@NotNull String symbol, @NotNull String leverage) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        HashMap map = new HashMap();
        map.put("leverage", leverage);
        map.put("symbol", symbol);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new IsolatedLeverageSettingViewModel$submitLeverage$1(map, this, null), 2, null);
    }

    /* JADX INFO: renamed from: y */
    public final void m26388y(@NotNull String symbol, boolean z11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), symbol, false, 2, null);
        BigDecimal bigDecimalM89921F = C41014a.m89921F(contractEntityM99529O != null ? contractEntityM99529O.getMaxLeverage() : null, C33556b3.f68995S);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(new C13507a(CoroutineExceptionHandler.INSTANCE, this, bigDecimalM89921F)), null, new IsolatedLeverageSettingViewModel$fetchUserRiskLimit$1(z11, symbol, this, bigDecimalM89921F, null), 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final MutableLiveData<Pair<Boolean, Throwable>> m26389z() {
        return this.f23488c0;
    }

    public IsolatedLeverageSettingViewModel() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.f23489d0 = mutableLiveData;
        this.f23490e0 = mutableLiveData;
    }
}
