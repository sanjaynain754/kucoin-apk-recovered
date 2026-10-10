package com.kubi.payment.fasttrade;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.otc.entity.FastSymbol;
import com.kubi.payment.base.BasePaymentVM;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.payment.util.PaymentStorageId;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import y70.C46392a;

/* JADX INFO: compiled from: FastTradeVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Deprecated(message = "废弃")
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\u0013J\u0006\u0010\u001a\u001a\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/FastTradeVM;", "Lcom/kubi/payment/base/BasePaymentVM;", "Lcom/kubi/payment/fast/data/source/IFastRepository;", "repository", "<init>", "(Lcom/kubi/payment/fast/data/source/IFastRepository;)V", "value", "Lcom/kubi/otc/entity/FastSymbol;", "tradingPairs", "getTradingPairs", "()Lcom/kubi/otc/entity/FastSymbol;", "_selectedFiatCurrency", "Landroidx/lifecycle/MutableLiveData;", "", "selectedFiatCurrency", "Landroidx/lifecycle/LiveData;", "getSelectedFiatCurrency", "()Landroidx/lifecycle/LiveData;", "_showContent", "", "showContent", "getShowContent", "updateFiatCurrency", "", "fiatCurrency", "needCache", "loadTradingPairInfo", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FastTradeVM extends BasePaymentVM<IFastRepository> {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final IFastRepository f38722Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public FastSymbol f38723a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<String> f38724b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<Boolean> f38725c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastTradeVM(@NotNull IFastRepository repository) {
        super(repository);
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f38722Z = repository;
        this.f38724b0 = new MutableLiveData<>();
        this.f38725c0 = new MutableLiveData<>();
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m46712E(FastTradeVM fastTradeVM, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        fastTradeVM.m46722D(str, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final LiveData<Boolean> m46719A() {
        return this.f38725c0;
    }

    @Nullable
    /* JADX INFO: renamed from: B, reason: from getter */
    public final FastSymbol getF38723a0() {
        return this.f38723a0;
    }

    /* JADX INFO: renamed from: D */
    public final void m46722D(@NotNull String fiatCurrency, boolean z11) {
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        if (fiatCurrency.length() == 0) {
            return;
        }
        String value = this.f38724b0.getValue();
        if (value == null || value.length() == 0 || !Intrinsics.areEqual(value, fiatCurrency)) {
            this.f38724b0.setValue(fiatCurrency);
            if (z11) {
                C46392a.m102333p(PaymentStorageId.f40364a.m49832j(), fiatCurrency);
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final LiveData<String> m46723z() {
        return this.f38724b0;
    }

    /* JADX INFO: renamed from: C */
    public final void m46721C() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new FastTradeVM$loadTradingPairInfo$1(this, null), 3, null);
    }
}
