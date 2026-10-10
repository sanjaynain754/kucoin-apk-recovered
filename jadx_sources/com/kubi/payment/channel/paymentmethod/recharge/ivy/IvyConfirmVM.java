package com.kubi.payment.channel.paymentmethod.recharge.ivy;

import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.payment.base.BasePaymentVM;
import com.kubi.payment.channel.data.entities.CreateIvyOrderEntity;
import com.kubi.payment.channel.data.entities.IvyConfirmPageEntity;
import com.kubi.payment.channel.data.source.IChannelRepository;
import com.kubi.router.utils.RouteExKt;
import com.kubi.utils.extensions.C27041f;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IvyConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"J\u0006\u0010#\u001a\u00020 J\u0006\u0010$\u001a\u00020 J\b\u0010%\u001a\u00020 H\u0007R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u00178F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0019¨\u0006&"}, m90084d2 = {"Lcom/kubi/payment/channel/paymentmethod/recharge/ivy/IvyConfirmVM;", "Lcom/kubi/payment/base/BasePaymentVM;", "Lcom/kubi/payment/channel/data/source/IChannelRepository;", "repository", "<init>", "(Lcom/kubi/payment/channel/data/source/IChannelRepository;)V", "channelId", "", "getChannelId", "()Ljava/lang/String;", "setChannelId", "(Ljava/lang/String;)V", "paymentMethodCode", "getPaymentMethodCode", "setPaymentMethodCode", "fiatCurrency", "getFiatCurrency", "setFiatCurrency", "fiatAmount", "_pageInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/payment/channel/data/entities/IvyConfirmPageEntity$Response;", "pageInfo", "Landroidx/lifecycle/LiveData;", "getPageInfo", "()Landroidx/lifecycle/LiveData;", "_createIvyOrderResult", "Lcom/kubi/payment/base/Result;", "Lcom/kubi/payment/channel/data/entities/CreateIvyOrderEntity$Response;", "createIvyOrderResult", "getCreateIvyOrderResult", "fillArguments", "", "arguments", "Landroid/os/Bundle;", "loadIvyConfirmPage", "createIvyOrder", "mockIvyOrderResult", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class IvyConfirmVM extends BasePaymentVM<IChannelRepository> {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final IChannelRepository f38332Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public String f38333a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public String f38334b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public String f38335c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public String f38336d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final MutableLiveData<IvyConfirmPageEntity.Response> f38337e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final MutableLiveData<AbstractC42878k<CreateIvyOrderEntity.Response>> f38338f0;

    /* JADX INFO: renamed from: A */
    public final void m45940A(@Nullable Bundle bundle) {
        this.f38333a0 = C27041f.m66668h(bundle != null ? RouteExKt.m56284y(bundle, "channelId") : null);
        this.f38334b0 = C27041f.m66668h(bundle != null ? RouteExKt.m56284y(bundle, "paymentMethodCode") : null);
        this.f38335c0 = C27041f.m66668h(bundle != null ? RouteExKt.m56284y(bundle, "fiatCurrency") : null);
        this.f38336d0 = C27041f.m66668h(bundle != null ? RouteExKt.m56284y(bundle, "fiatAmount") : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IvyConfirmVM(@NotNull IChannelRepository repository) {
        super(repository);
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f38332Z = repository;
        this.f38333a0 = "";
        this.f38334b0 = "";
        this.f38335c0 = "";
        this.f38336d0 = "";
        this.f38337e0 = new MutableLiveData<>();
        this.f38338f0 = new MutableLiveData<>();
    }

    @NotNull
    /* JADX INFO: renamed from: B, reason: from getter */
    public final String getF38333a0() {
        return this.f38333a0;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final LiveData<AbstractC42878k<CreateIvyOrderEntity.Response>> m45942C() {
        return this.f38338f0;
    }

    @NotNull
    /* JADX INFO: renamed from: D, reason: from getter */
    public final String getF38335c0() {
        return this.f38335c0;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final LiveData<IvyConfirmPageEntity.Response> m45944E() {
        return this.f38337e0;
    }

    @NotNull
    /* JADX INFO: renamed from: F, reason: from getter */
    public final String getF38334b0() {
        return this.f38334b0;
    }

    /* JADX INFO: renamed from: G */
    public final void m45946G() {
        m45658q().setValue(new BasePaymentVM.LoadingUIState(false, false, false, false, 15, null));
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new IvyConfirmVM$loadIvyConfirmPage$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: z */
    public final void m45947z() {
        m45658q().setValue(new BasePaymentVM.LoadingUIState(false, false, false, false, 15, null));
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new IvyConfirmVM$createIvyOrder$1(this, null), 3, null);
    }
}
