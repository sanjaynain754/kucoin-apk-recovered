package com.kubi.payment.channel.paymentmethod.withdraw;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.otc.exception.OtcMessage;
import com.kubi.payment.base.BasePaymentVM;
import com.kubi.payment.channel.data.entities.PaymentMethod;
import com.kubi.payment.channel.data.source.IChannelRepository;
import com.kubi.payment.channel.precheck.PreCheckInterceptorChain;
import com.kubi.payment.channel.precheck.PreCheckRequest;
import com.kubi.payment.data.entities.UserInfo;
import java.util.List;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43841b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: WithdrawPaymentMethodVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0011\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0002\b\u0013J\u0006\u0010\u001c\u001a\u00020\u0012J\u0010\u0010\u001d\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0016\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u0016J\b\u0010#\u001a\u00020\u0012H\u0014R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\f8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000eR\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\f8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000e¨\u0006$"}, m90084d2 = {"Lcom/kubi/payment/channel/paymentmethod/withdraw/WithdrawPaymentMethodVM;", "Lcom/kubi/payment/base/BasePaymentVM;", "Lcom/kubi/payment/channel/data/source/IChannelRepository;", "repository", "<init>", "(Lcom/kubi/payment/channel/data/source/IChannelRepository;)V", "isFirstLoad", "", "_kycInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/payment/data/entities/UserInfo$KycInfoResponse;", "kycInfo", "Landroidx/lifecycle/LiveData;", "getKycInfo", "()Landroidx/lifecycle/LiveData;", "preCheckChain", "Lcom/kubi/payment/channel/precheck/PreCheckInterceptorChain;", "setWithdrawPreCheckChain", "", "setWithdrawPreCheckChain$PaymentLib_googleRelease", "_paymentMethodList", "", "Lcom/kubi/payment/channel/data/entities/PaymentMethod;", "paymentMethodList", "getPaymentMethodList", "_paymentMethod", "paymentMethod", "getPaymentMethod", "loadUserInfo", "loadPaymentMethodList", "fiatCurrency", "", "preCheck", "request", "Lcom/kubi/payment/channel/precheck/PreCheckRequest;", "onCleared", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWithdrawPaymentMethodVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithdrawPaymentMethodVM.kt\ncom/kubi/payment/channel/paymentmethod/withdraw/WithdrawPaymentMethodVM\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,161:1\n48#2,2:162\n*S KotlinDebug\n*F\n+ 1 WithdrawPaymentMethodVM.kt\ncom/kubi/payment/channel/paymentmethod/withdraw/WithdrawPaymentMethodVM\n*L\n106#1:162,2\n*E\n"})
public final class WithdrawPaymentMethodVM extends BasePaymentVM<IChannelRepository> {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final IChannelRepository f38362Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f38363a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<UserInfo.KycInfoResponse> f38364b0;

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public PreCheckInterceptorChain f38365c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<List<PaymentMethod>> f38366d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final MutableLiveData<PaymentMethod> f38367e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithdrawPaymentMethodVM(@NotNull IChannelRepository repository) {
        super(repository);
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f38362Z = repository;
        this.f38363a0 = true;
        this.f38364b0 = new MutableLiveData<>();
        this.f38366d0 = new MutableLiveData<>();
        this.f38367e0 = new MutableLiveData<>();
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final LiveData<UserInfo.KycInfoResponse> m45977D() {
        return this.f38364b0;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final LiveData<PaymentMethod> m45978E() {
        return this.f38367e0;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final LiveData<List<PaymentMethod>> m45979F() {
        return this.f38366d0;
    }

    /* JADX INFO: renamed from: G */
    public final void m45980G(@Nullable String str) {
        if (this.f38363a0) {
            m45658q().setValue(new BasePaymentVM.LoadingUIState(false, false, false, false, 15, null));
            C43841b.m96557d("B7channel_withdraw", "data_load_start", null, 4, null);
        } else {
            m45657p().setValue(Boolean.TRUE);
        }
        if (str == null || str.length() == 0) {
            C43846g.m96568c(new OtcMessage("fiatCurrency is null", "payment_withdraw", false, 4, null), null, 2, null);
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new WithdrawPaymentMethodVM$loadPaymentMethodList$1(this, str, null), 3, null);
    }

    /* JADX INFO: renamed from: I */
    public final void m45982I(@NotNull PreCheckRequest request, @NotNull PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new WithdrawPaymentMethodVM$preCheck$1(this, request, paymentMethod, null), 3, null);
    }

    /* JADX INFO: renamed from: J */
    public final void m45983J(@Nullable PreCheckInterceptorChain preCheckInterceptorChain) {
        this.f38365c0 = preCheckInterceptorChain;
    }

    /* JADX INFO: renamed from: H */
    public final void m45981H() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new WithdrawPaymentMethodVM$loadUserInfo$1(this, null), 3, null);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f38363a0 = false;
    }
}
