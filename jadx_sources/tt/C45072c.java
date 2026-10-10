package tt;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.kubi.otc.entity.FastSymbol;
import com.kubi.payment.base.BasePaymentVM;
import com.kubi.payment.fast.data.source.IFastRepository;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: tt.c */
/* JADX INFO: compiled from: OldFastTradeVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Deprecated(message = "废弃")
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u0013J\u0006\u0010\u0019\u001a\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/payment/fast/OldFastTradeVM;", "Lcom/kubi/payment/base/BasePaymentVM;", "Lcom/kubi/payment/fast/data/source/IFastRepository;", "repository", "<init>", "(Lcom/kubi/payment/fast/data/source/IFastRepository;)V", "value", "Lcom/kubi/otc/entity/FastSymbol;", "tradingPairs", "getTradingPairs", "()Lcom/kubi/otc/entity/FastSymbol;", "_fiatCurrency", "Landroidx/lifecycle/MutableLiveData;", "", "fiatCurrency", "Landroidx/lifecycle/LiveData;", "getFiatCurrency", "()Landroidx/lifecycle/LiveData;", "_showContent", "", "showContent", "getShowContent", "updateFiatCurrency", "", "needCache", "loadTradingPairInfo", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45072c extends BasePaymentVM<IFastRepository> {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final IFastRepository f101468Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public FastSymbol f101469a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<String> f101470b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<Boolean> f101471c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45072c(@NotNull IFastRepository repository) {
        super(repository);
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f101468Z = repository;
        this.f101470b0 = new MutableLiveData<>();
        this.f101471c0 = new MutableLiveData<>();
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final LiveData<String> m99671t() {
        return this.f101470b0;
    }

    @Nullable
    /* JADX INFO: renamed from: u, reason: from getter */
    public final FastSymbol getF101469a0() {
        return this.f101469a0;
    }
}
