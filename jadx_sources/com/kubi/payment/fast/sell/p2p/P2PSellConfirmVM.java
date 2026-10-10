package com.kubi.payment.fast.sell.p2p;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.payment.fast.common.confirm.p2p.P2PConfirmVM;
import com.kubi.payment.fast.common.confirm.p2p.P2PExtraParams;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.payment.p2p.data.entities.TaxInfo;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: P2PSellConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Deprecated(message = "废弃")
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0014@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/payment/fast/sell/p2p/P2PSellConfirmVM;", "Lcom/kubi/payment/fast/common/confirm/p2p/P2PConfirmVM;", "repository", "Lcom/kubi/payment/fast/data/source/IFastRepository;", "extraParams", "Lcom/kubi/payment/fast/common/confirm/p2p/P2PExtraParams;", "<init>", "(Lcom/kubi/payment/fast/data/source/IFastRepository;Lcom/kubi/payment/fast/common/confirm/p2p/P2PExtraParams;)V", "_previewOrderResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/otc/entity/FastQuoteModel;", "previewOrderResponse", "Landroidx/lifecycle/LiveData;", "getPreviewOrderResponse", "()Landroidx/lifecycle/LiveData;", "value", "Lcom/kubi/payment/p2p/data/entities/TaxInfo;", "taxInfo", "getTaxInfo", "()Lcom/kubi/payment/p2p/data/entities/TaxInfo;", "", "needForceRefresh", "getNeedForceRefresh", "()Z", "previewOrder", "", "placeOrder", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class P2PSellConfirmVM extends P2PConfirmVM {

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public static final Companion f38684j0 = new Companion(null);

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final IFastRepository f38685e0;

    /* JADX INFO: renamed from: f0 */
    @Nullable
    public final P2PExtraParams f38686f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final MutableLiveData<FastQuoteModel> f38687g0;

    /* JADX INFO: renamed from: h0 */
    @Nullable
    public TaxInfo f38688h0;

    /* JADX INFO: renamed from: i0 */
    public boolean f38689i0;

    /* JADX INFO: compiled from: P2PSellConfirmVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/fast/sell/p2p/P2PSellConfirmVM$Companion;", "", "<init>", "()V", "PAYMENT_TYPE_P2P", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PSellConfirmVM(@NotNull IFastRepository repository, @Nullable P2PExtraParams p2PExtraParams) {
        super(repository, null, p2PExtraParams);
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f38685e0 = repository;
        this.f38686f0 = p2PExtraParams;
        this.f38687g0 = new MutableLiveData<>();
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final boolean getF38689i0() {
        return this.f38689i0;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final LiveData<FastQuoteModel> m46669N() {
        return this.f38687g0;
    }

    @Nullable
    /* JADX INFO: renamed from: O, reason: from getter */
    public final TaxInfo getF38688h0() {
        return this.f38688h0;
    }

    /* JADX INFO: renamed from: P */
    public final void m46671P() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new P2PSellConfirmVM$placeOrder$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: Q */
    public final void m46672Q() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new P2PSellConfirmVM$previewOrder$1(this, null), 3, null);
    }
}
