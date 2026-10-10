package com.kubi.payment.p2p;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.payment.base.BasePaymentVM;
import com.kubi.payment.p2p.data.entities.BadgeInfo;
import com.kubi.payment.p2p.data.source.IP2PRepository;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: P2PViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/payment/p2p/P2PViewModel;", "Lcom/kubi/payment/base/BasePaymentVM;", "Lcom/kubi/payment/p2p/data/source/IP2PRepository;", "repository", "<init>", "(Lcom/kubi/payment/p2p/data/source/IP2PRepository;)V", "_badgeInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/payment/p2p/data/entities/BadgeInfo;", "get_badgeInfo", "()Landroidx/lifecycle/MutableLiveData;", "badgeInfo", "Landroidx/lifecycle/LiveData;", "getBadgeInfo", "()Landroidx/lifecycle/LiveData;", "isLoadingBadgeInfo", "", "isReportingHeartBeat", "loadBadgeInfo", "", "heartBeatReport", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class P2PViewModel extends BasePaymentVM<IP2PRepository> {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final IP2PRepository f39691Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<BadgeInfo> f39692a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f39693b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f39694c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PViewModel(@NotNull IP2PRepository repository) {
        super(repository);
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f39691Z = repository;
        this.f39692a0 = new MutableLiveData<>();
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final MutableLiveData<BadgeInfo> m48462A() {
        return this.f39692a0;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final LiveData<BadgeInfo> m48465z() {
        return this.f39692a0;
    }

    /* JADX INFO: renamed from: B */
    public final void m48463B() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new P2PViewModel$heartBeatReport$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: C */
    public final void m48464C() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new P2PViewModel$loadBadgeInfo$1(this, null), 3, null);
    }
}
