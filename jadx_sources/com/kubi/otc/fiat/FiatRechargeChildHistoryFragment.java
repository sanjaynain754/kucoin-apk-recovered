package com.kubi.otc.fiat;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.entity.FiatRechargeHistory;
import com.kubi.otc.fiat.recharge.FiatRechargeOrderDetailFragment;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import et.InterfaceC37240b;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatHistoryListFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0014J$\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0012H\u0014R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/otc/fiat/FiatRechargeChildHistoryFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/otc/entity/FiatRechargeHistory;", "<init>", "()V", "mApi", "Lcom/kubi/otc/api/FiatApi;", "kotlin.jvm.PlatformType", "getMApi", "()Lcom/kubi/otc/api/FiatApi;", "mApi$delegate", "Lkotlin/Lazy;", "mFiat", "", "getMFiat", "()Ljava/lang/String;", "mFiat$delegate", "getItemLayout", "", "bindDataToView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "pageSize", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FiatRechargeChildHistoryFragment extends BasePagingFragment<FiatRechargeHistory> {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f37289Z = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatRechargeChildHistoryFragment.m44034O3();
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f37290a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatRechargeChildHistoryFragment.m44035P3(this.f37295b);
        }
    });

    /* JADX INFO: renamed from: L3 */
    public static final Unit m44033L3(FiatRechargeHistory fiatRechargeHistory) {
        FiatRechargeOrderDetailFragment.Companion.startFragment$default(FiatRechargeOrderDetailFragment.f37301X, fiatRechargeHistory.getOrderId(), null, 2, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: K3, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@NotNull BaseViewHolder helper, @NotNull final FiatRechargeHistory item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        BaseViewHolder text = helper.setText(R$id.tv_coin_name, C27041f.m66669i(item.getCoin(), "--"));
        int i11 = R$id.tv_status;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        text.setText(i11, item.getStatusString(contextRequireContext)).setText(R$id.tv_amount, C27041f.m66669i(item.getAmount(), "--")).setText(R$id.tv_time, TimeUtils.m66422i(C27039d.m66652l(item.getCreateTime())));
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.otc.fiat.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FiatRechargeChildHistoryFragment.m44033L3(item);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: M3 */
    public final InterfaceC37240b m44037M3() {
        return (InterfaceC37240b) this.f37289Z.getValue();
    }

    /* JADX INFO: renamed from: N3 */
    public final String m44038N3() {
        return (String) this.f37290a0.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.botc_item_fiat_recharge_history;
    }

    /* JADX INFO: renamed from: O3 */
    public static final InterfaceC37240b m44034O3() {
        return (InterfaceC37240b) C42597a.m93386b().create(InterfaceC37240b.class);
    }

    /* JADX INFO: renamed from: P3 */
    public static final String m44035P3(FiatRechargeChildHistoryFragment fiatRechargeChildHistoryFragment) {
        FiatHistoryListFragment fiatHistoryListFragment;
        Fragment parentFragment = fiatRechargeChildHistoryFragment.getParentFragment();
        String strM44026q3 = null;
        if (parentFragment instanceof FiatHistoryListFragment) {
            fiatHistoryListFragment = (FiatHistoryListFragment) parentFragment;
        } else {
            fiatHistoryListFragment = null;
        }
        if (fiatHistoryListFragment != null) {
            strM44026q3 = fiatHistoryListFragment.m44026q3();
        }
        return C27041f.m66668h(strM44026q3);
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @NotNull
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<FiatRechargeHistory>> mo16440r3(int i11, int i12) {
        Observable<BasePageEntity<FiatRechargeHistory>> observableCompose = InterfaceC37240b.m83288b(m44037M3(), m44038N3(), i11, i12, null, 8, null).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }
}
