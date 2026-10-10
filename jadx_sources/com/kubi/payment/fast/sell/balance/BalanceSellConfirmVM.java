package com.kubi.payment.fast.sell.balance;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.payment.fast.common.confirm.CommonConfirmVM;
import com.kubi.payment.fast.common.confirm.ConfirmExtraParams;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.payment.track.FastTrackData;
import com.kubi.payment.track.IPaymentTrack;
import com.kubi.utils.extensions.C27041f;
import kotlinx.coroutines.C41696j;
import lt.C42296a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BalanceSellConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Deprecated(message = "废弃")
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmVM;", "Lcom/kubi/payment/fast/common/confirm/CommonConfirmVM;", "repository", "Lcom/kubi/payment/fast/data/source/IFastRepository;", "extraParams", "Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;", "<init>", "(Lcom/kubi/payment/fast/data/source/IFastRepository;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;)V", "_orderId", "Landroidx/lifecycle/MutableLiveData;", "", "orderId", "Landroidx/lifecycle/LiveData;", "getOrderId", "()Landroidx/lifecycle/LiveData;", "placeOrder", "", "trackPlaceOrderSuccessful", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BalanceSellConfirmVM extends CommonConfirmVM {

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public final IFastRepository f38671j0;

    /* JADX INFO: renamed from: k0 */
    @Nullable
    public final ConfirmExtraParams f38672k0;

    /* JADX INFO: renamed from: l0 */
    @NotNull
    public final MutableLiveData<String> f38673l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalanceSellConfirmVM(@NotNull IFastRepository repository, @Nullable ConfirmExtraParams confirmExtraParams) {
        super(repository, confirmExtraParams);
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f38671j0 = repository;
        this.f38672k0 = confirmExtraParams;
        this.f38673l0 = new MutableLiveData<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public final void m46630U() throws JSONException {
        C42296a c42296a = C42296a.f93790a;
        ConfirmExtraParams confirmExtraParams = this.f38672k0;
        String strM66668h = C27041f.m66668h(confirmExtraParams != null ? confirmExtraParams.getCryptoCurrency() : null);
        ConfirmExtraParams confirmExtraParams2 = this.f38672k0;
        C42296a.m92834b(c42296a, true, "", strM66668h, C27041f.m66668h(confirmExtraParams2 != null ? confirmExtraParams2.getFiatCurrency() : null), "pay_fast_sell", "fast_balance", null, null, null, null, null, 1984, null);
        IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
        FastTrackData fastTrackData = new FastTrackData("sell", FastQuoteModel.PAY_BALANCE);
        ConfirmExtraParams confirmExtraParams3 = this.f38672k0;
        fastTrackData.setFiatCurrency(confirmExtraParams3 != null ? confirmExtraParams3.getFiatCurrency() : null);
        ConfirmExtraParams confirmExtraParams4 = this.f38672k0;
        fastTrackData.setCryptoCurrency(confirmExtraParams4 != null ? confirmExtraParams4.getCryptoCurrency() : null);
        Unit unit = Unit.INSTANCE;
        IPaymentTrack.m49793b(track, "PLACE_ORDER", true, null, fastTrackData, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final LiveData<String> m46631S() {
        return this.f38673l0;
    }

    /* JADX INFO: renamed from: T */
    public final void m46632T() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new BalanceSellConfirmVM$placeOrder$1(this, null), 3, null);
    }
}
