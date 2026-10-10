package gu;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.payment.p2p.trade.view.AbsP2PBaseTopPopup;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33978va;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: gu.n */
/* JADX INFO: compiled from: P2PFiatCurrencyAmountFilterPopup.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0016\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/view/P2PFiatCurrencyAmountFilterPopup;", "Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;", "context", "Landroid/content/Context;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "", "", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "getLayout", "", "initView", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "setData", "amount", "fiatCurrency", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C38033n extends AbsP2PBaseTopPopup {

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Function1<String, Unit> f85648g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C38033n(@NotNull Context context, @NotNull Function1<? super String, Unit> listener) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f85648g = listener;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m85904t(EditText editText) {
        editText.setText("");
        return Unit.INSTANCE;
    }

    @Override // com.kubi.payment.p2p.trade.view.AbsP2PBaseTopPopup
    /* JADX INFO: renamed from: m */
    public int mo49372m() {
        return R$layout.payment_popup_filter_currency_fiat_amount;
    }

    @Override // com.kubi.payment.p2p.trade.view.AbsP2PBaseTopPopup
    /* JADX INFO: renamed from: o */
    public void mo49374o(@NotNull BaseViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        final EditText editText = (EditText) viewHolder.getView(R$id.et_amount);
        View view = viewHolder.getView(R$id.tv_reset_amount);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: gu.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C38033n.m85904t(editText);
            }
        }, 1, null);
        View view2 = viewHolder.getView(R$id.tv_confirm_amount);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: gu.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C38033n.m85905u(editText, this);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: v */
    public final void m85906v(@NotNull String amount, @NotNull String fiatCurrency) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        BaseViewHolder baseViewHolderM49373n = m49373n();
        baseViewHolderM49373n.setText(R$id.et_amount, amount);
        baseViewHolderM49373n.setText(R$id.tv_currency_fiat, fiatCurrency);
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m85905u(EditText editText, C38033n c38033n) {
        String string = editText.getText().toString();
        Function1<String, Unit> function1 = c38033n.f85648g;
        if (Intrinsics.areEqual(string, C33978va.f72339h)) {
            string = "";
        }
        function1.invoke(string);
        c38033n.m49369i();
        return Unit.INSTANCE;
    }
}
