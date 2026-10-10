package com.kubi.payment.fast.common.confirm;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.kubi.otc.R$string;
import com.kubi.payment.fast.common.confirm.CommonConfirmVM;
import com.kubi.payment.fast.data.entities.PreviewOrder;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AbsFastConfirmFiatFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Deprecated(message = "废弃")
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J\b\u0010\n\u001a\u00020\u0007H\u0014J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H&J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&J\b\u0010\u0016\u001a\u00020\u000fH&J\b\u0010\u0017\u001a\u00020\u000fH\u0014¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/payment/fast/common/confirm/AbsFastConfirmFiatFragment;", "VM", "Lcom/kubi/payment/fast/common/confirm/CommonConfirmVM;", "Lcom/kubi/payment/fast/common/confirm/CommonConfirmFragment;", "<init>", "()V", "onPreviewOrderResponseReady", "", "previewOrder", "Lcom/kubi/payment/fast/data/entities/PreviewOrder$Response;", "observeData", "onCountDownTimeUpdated", "countDownTime", "", "isFinished", "", "getConfirmView", "Landroid/view/View;", "getConfirmProgressView", "getConfirmTextView", "Landroid/widget/TextView;", "getCountDownTextView", "isConfirmViewEnable", "isSell", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class AbsFastConfirmFiatFragment<VM extends CommonConfirmVM> extends CommonConfirmFragment<VM> {

    /* JADX INFO: renamed from: com.kubi.payment.fast.common.confirm.AbsFastConfirmFiatFragment$a */
    /* JADX INFO: compiled from: AbsFastConfirmFiatFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20473a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f38534b;

        public C20473a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f38534b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f38534b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38534b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a4 */
    public abstract View mo46286a4();

    @Nullable
    /* JADX INFO: renamed from: b4 */
    public abstract TextView mo46287b4();

    @Nullable
    /* JADX INFO: renamed from: c4 */
    public abstract View mo46288c4();

    @Nullable
    /* JADX INFO: renamed from: d4 */
    public abstract TextView mo46289d4();

    /* JADX INFO: renamed from: e4 */
    public abstract boolean mo46290e4();

    /* JADX INFO: renamed from: f4 */
    public boolean mo46291f4() {
        return false;
    }

    @Override // com.kubi.payment.fast.common.confirm.CommonConfirmFragment
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: N3 */
    public void mo46284N3(@NotNull String countDownTime, boolean z11) {
        Intrinsics.checkNotNullParameter(countDownTime, "countDownTime");
        TextView textViewMo46289d4 = mo46289d4();
        if (textViewMo46289d4 != null) {
            textViewMo46289d4.setText(countDownTime + 's');
        }
        if (z11) {
            if (!m45647o3().getF38546g0()) {
                m45647o3().m46331K(false);
                return;
            }
            View viewMo46288c4 = mo46288c4();
            if (viewMo46288c4 != null) {
                viewMo46288c4.setEnabled(mo46290e4());
            }
            TextView textViewMo46287b4 = mo46287b4();
            if (textViewMo46287b4 != null) {
                textViewMo46287b4.setText(getStringRes(R$string.pay_fast_trade_confirm_refresh_price, new Object[0]));
            }
        }
    }

    @Override // com.kubi.payment.fast.common.confirm.CommonConfirmFragment
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: O3 */
    public void mo46285O3(@NotNull PreviewOrder.Response previewOrder) {
        Intrinsics.checkNotNullParameter(previewOrder, "previewOrder");
        TextView textViewMo46289d4 = mo46289d4();
        if (textViewMo46289d4 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(previewOrder.getExpireTime());
            sb2.append('s');
            textViewMo46289d4.setText(sb2.toString());
        }
        TextView textViewMo46287b4 = mo46287b4();
        if (textViewMo46287b4 != null) {
            textViewMo46287b4.setText(getStringRes(mo46291f4() ? R$string.fast_pay_confirm_sell : R$string.fast_pay_confirm_buy, new Object[0]));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public static final Unit m46283g4(AbsFastConfirmFiatFragment absFastConfirmFiatFragment, Boolean bool) {
        int i11;
        String stringRes;
        if (bool.booleanValue()) {
            if (((CommonConfirmVM) absFastConfirmFiatFragment.m45647o3()).getF38546g0()) {
                View viewMo46286a4 = absFastConfirmFiatFragment.mo46286a4();
                if (viewMo46286a4 != null) {
                    C27046k.m66685H(viewMo46286a4);
                }
                View viewMo46288c4 = absFastConfirmFiatFragment.mo46288c4();
                if (viewMo46288c4 != null) {
                    viewMo46288c4.setEnabled(false);
                }
                TextView textViewMo46287b4 = absFastConfirmFiatFragment.mo46287b4();
                if (textViewMo46287b4 != null) {
                    textViewMo46287b4.setText(absFastConfirmFiatFragment.getString(R$string.pay_fast_buy_refresh));
                }
            }
            TextView textViewMo46289d4 = absFastConfirmFiatFragment.mo46289d4();
            if (textViewMo46289d4 != null) {
                textViewMo46289d4.setText(absFastConfirmFiatFragment.getString(R$string.pay_fast_buy_refresh));
            }
        } else if (((CommonConfirmVM) absFastConfirmFiatFragment.m45647o3()).getF38546g0()) {
            View viewMo46286a5 = absFastConfirmFiatFragment.mo46286a4();
            if (viewMo46286a5 != null) {
                C27046k.m66700o(viewMo46286a5);
            }
            View viewMo46288c5 = absFastConfirmFiatFragment.mo46288c4();
            if (viewMo46288c5 != null) {
                viewMo46288c5.setEnabled(absFastConfirmFiatFragment.mo46290e4());
            }
            TextView textViewMo46287b5 = absFastConfirmFiatFragment.mo46287b4();
            if (textViewMo46287b5 != null) {
                if (((CommonConfirmVM) absFastConfirmFiatFragment.m45647o3()).getF38547h0()) {
                    stringRes = absFastConfirmFiatFragment.getStringRes(R$string.pay_fast_trade_confirm_refresh_price, new Object[0]);
                } else {
                    if (absFastConfirmFiatFragment.mo46291f4()) {
                        i11 = R$string.fast_pay_confirm_sell;
                    } else {
                        i11 = R$string.fast_pay_confirm_buy;
                    }
                    stringRes = absFastConfirmFiatFragment.getStringRes(i11, new Object[0]);
                }
                textViewMo46287b5.setText(stringRes);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.payment.fast.common.confirm.CommonConfirmFragment, com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: r3 */
    public void mo45650r3() {
        super.mo45650r3();
        m45647o3().m46330J().observe(getViewLifecycleOwner(), new C20473a(new Function1() { // from class: com.kubi.payment.fast.common.confirm.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbsFastConfirmFiatFragment.m46283g4(this.f38549b, (Boolean) obj);
            }
        }));
    }
}
