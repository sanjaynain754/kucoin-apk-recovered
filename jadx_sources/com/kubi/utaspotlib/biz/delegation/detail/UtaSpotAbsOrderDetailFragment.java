package com.kubi.utaspotlib.biz.delegation.detail;

import com.kubi.core.biz.order.detail.AbsOrderDetailFragment;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.utaspotlib.biz.delegation.detail.UtaSpotAbsOrderDetailFragment;
import org.jetbrains.annotations.NotNull;
import p827zc.AbstractC46753c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import r70.C43942e;

/* JADX INFO: compiled from: UtaSpotAbsOrderDetailFragment.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\rH\u0014R\u001b\u0010\u0004\u001a\u00020\u00058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/utaspotlib/biz/delegation/detail/UtaSpotAbsOrderDetailFragment;", "Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;", "<init>", "()V", "bizRepoProvider", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "getBizRepoProvider", "()Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "bizRepoProvider$delegate", "Lkotlin/Lazy;", "needDefaultBackground", "", "getItemLayout", "", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UtaSpotAbsOrderDetailFragment extends AbsOrderDetailFragment {

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f54118a0;

    @Override // com.kubi.core.biz.order.detail.AbsOrderDetailFragment, com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: C3 */
    public boolean mo15903C3() {
        return false;
    }

    /* JADX INFO: renamed from: S3 */
    public static final C43942e m66040S3(UtaSpotAbsOrderDetailFragment utaSpotAbsOrderDetailFragment) {
        return new C43942e(utaSpotAbsOrderDetailFragment.getArguments());
    }

    @Override // p827zc.InterfaceC46752b
    @NotNull
    /* JADX INFO: renamed from: p1 */
    public AbstractC46753c mo66036p1() {
        return (AbstractC46753c) this.f54118a0.getValue();
    }

    @Override // com.kubi.core.biz.order.detail.AbsOrderDetailFragment, com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.core_item_delegation_detail;
    }

    public UtaSpotAbsOrderDetailFragment() {
        setPageId("B5singleOrder");
        this.f54118a0 = LazyKt.lazy(new Function0() { // from class: o70.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UtaSpotAbsOrderDetailFragment.m66040S3(this.f95131b);
            }
        });
    }
}
