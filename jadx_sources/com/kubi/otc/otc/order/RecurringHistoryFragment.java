package com.kubi.otc.otc.order;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.TextView;
import com.kubi.otc.R$color;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.payment.fast.data.entities.RecurringPlan;
import com.kubi.payment.fast.data.source.remote.FastWebService;
import com.kubi.payment.flutter.FlutterNavigationHelper;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RecurringHistoryFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0014J\u001c\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0015J\b\u0010\u0017\u001a\u00020\u0013H\u0014J\b\u0010\u0018\u001a\u00020\u0010H\u0014R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/otc/otc/order/RecurringHistoryFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/payment/fast/data/entities/RecurringPlan;", "<init>", "()V", "fastWebService", "Lcom/kubi/payment/fast/data/source/remote/FastWebService;", "kotlin.jvm.PlatformType", "getFastWebService", "()Lcom/kubi/payment/fast/data/source/remote/FastWebService;", "fastWebService$delegate", "Lkotlin/Lazy;", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "", "pageSize", "bindDataToView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "onReBack", "getItemLayout", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RecurringHistoryFragment extends BasePagingFragment<RecurringPlan> {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f37844Z = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.order.n
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RecurringHistoryFragment.m45007L3();
        }
    });

    /* JADX INFO: renamed from: K3 */
    public static final Unit m45006K3(RecurringPlan recurringPlan) {
        FlutterNavigationHelper.f39477a.m48166e(C27041f.m66668h(recurringPlan != null ? recurringPlan.getRecurringId() : null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @SuppressLint({"ResourceType"})
    /* JADX INFO: renamed from: J3, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@Nullable BaseViewHolder baseViewHolder, @Nullable final RecurringPlan recurringPlan) {
        if (baseViewHolder != null) {
            ((TextView) baseViewHolder.getView(R$id.tv_crypto_currency)).setText(C27041f.m66669i(recurringPlan != null ? recurringPlan.getCryptoCurrency() : null, "--"));
            TextView textView = (TextView) baseViewHolder.getView(R$id.tv_status);
            if (Intrinsics.areEqual(recurringPlan != null ? recurringPlan.getStatus() : null, RecurringPlan.PROCESSING)) {
                textView.setTextColor(getColorRes(R$color.brandGreen));
            } else {
                textView.setTextColor(getColorRes(R$color.c_text40));
            }
            String strM66668h = C27041f.m66668h(recurringPlan != null ? recurringPlan.getStatus() : null);
            switch (strM66668h.hashCode()) {
                case -1134023652:
                    if (strM66668h.equals(RecurringPlan.SUSPENDED)) {
                        textView.setText(getStringRes(R$string.payment_Investment_status_paused, new Object[0]));
                    }
                    break;
                case -1031784143:
                    if (strM66668h.equals(RecurringPlan.CANCELLED)) {
                        textView.setText(getStringRes(R$string.payment_Investment_status_canceled, new Object[0]));
                    }
                    break;
                case 1746537160:
                    if (strM66668h.equals("CREATED")) {
                        textView.setText(getStringRes(R$string.fast_result_pending, new Object[0]));
                    }
                    break;
                case 2052692649:
                    if (strM66668h.equals(RecurringPlan.PROCESSING)) {
                        textView.setText(getStringRes(R$string.payment_Investment_status_process, new Object[0]));
                    }
                    break;
                case 2066319421:
                    if (strM66668h.equals("FAILED")) {
                        textView.setText(getStringRes(R$string.failed, new Object[0]));
                    }
                    break;
            }
            ((TextView) baseViewHolder.getView(R$id.tv_create_time)).setText(getStringRes(R$string.payment_Investment_create_time, TimeUtils.m66424k(C27039d.m66652l(recurringPlan != null ? recurringPlan.getCreateTime() : null))));
            ((TextView) baseViewHolder.getView(R$id.tv_total_value)).setText(getStringRes(R$string.payment_price, recurringPlan != null ? recurringPlan.getTotalFiatAmount() : null, recurringPlan != null ? recurringPlan.getFiatCurrency() : null));
            ((TextView) baseViewHolder.getView(R$id.tv_recurring_times_value)).setText(String.valueOf(recurringPlan != null ? recurringPlan.getTotalTimes() : null));
            TextView textView2 = (TextView) baseViewHolder.getView(R$id.tv_next_payment_time);
            textView2.setText(recurringPlan != null ? recurringPlan.getNextPaymentDescription() : null);
            String nextPaymentDescription = recurringPlan != null ? recurringPlan.getNextPaymentDescription() : null;
            if (nextPaymentDescription == null || nextPaymentDescription.length() == 0) {
                Intrinsics.checkNotNull(textView2);
                C27046k.m66700o(textView2);
            } else {
                Intrinsics.checkNotNull(textView2);
                C27046k.m66685H(textView2);
            }
            View itemView = baseViewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.otc.otc.order.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecurringHistoryFragment.m45006K3(recurringPlan);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: M3 */
    public final FastWebService m45009M3() {
        return (FastWebService) this.f37844Z.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.payment_item_recurring_plan;
    }

    /* JADX INFO: renamed from: L3 */
    public static final FastWebService m45007L3() {
        return (FastWebService) C42597a.m93386b().create(FastWebService.class);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void onReBack() {
        super.onReBack();
        mo15906F3();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @NotNull
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<RecurringPlan>> mo16440r3(int i11, int i12) {
        Observable observableCompose = m45009M3().m46499h(i11, i12).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }
}
