package p477nt;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;

/* JADX INFO: renamed from: nt.g */
/* JADX INFO: compiled from: BaseViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Deprecated(message = "废弃，请使用BasePaymentViewModel", replaceWith = @ReplaceWith(expression = "com.kubi.payment.base.BasePaymentViewModel", imports = {}))
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/payment/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "_isLoading", "Landroidx/lifecycle/MutableLiveData;", "", "get_isLoading", "()Landroidx/lifecycle/MutableLiveData;", "isLoading", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "_toastException", "", "get_toastException", "toastException", "getToastException", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class C42874g extends ViewModel {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final MutableLiveData<Boolean> f94943V = new MutableLiveData<>();

    /* JADX INFO: renamed from: W */
    @NotNull
    public final MutableLiveData<Throwable> f94944W = new MutableLiveData<>();

    @NotNull
    /* JADX INFO: renamed from: n */
    public final LiveData<Throwable> m94033n() {
        return this.f94944W;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final MutableLiveData<Boolean> m94034o() {
        return this.f94943V;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final MutableLiveData<Throwable> m94035p() {
        return this.f94944W;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final LiveData<Boolean> m94036q() {
        return this.f94943V;
    }
}
