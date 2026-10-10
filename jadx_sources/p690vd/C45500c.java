package p690vd;

import af.C0296a;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.kubi.core.base.order.uidata.C11629a;
import com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity;
import com.kubi.core.utils.C12465d;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.BaseFragment;
import com.kubi.tradecorebiz.R$color;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import v30.C45387i0;

/* JADX INFO: renamed from: vd.c */
/* JADX INFO: compiled from: BindHistoryItemOfAdvanceLimit.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/core/biz/order/record/history/item/BindHistoryItemOfAdvanceLimit;", "Lcom/kubi/core/biz/order/record/history/item/IHistoryItemViewBindData;", "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$AdvancedLimit;", "<init>", "()V", "bindData", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "binding", "Lcom/kubi/tradecorebiz/databinding/TradeCoreItemDelegationViewBinding;", "data", "isUpGreen", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45500c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45500c f102532a = new C45500c();

    /* JADX INFO: renamed from: d */
    public static final Unit m100470d(BaseFragment baseFragment) {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54163T4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.notice_prompt).m54156M4(baseFragment.getString(R$string.price_protect_part_deal)).m54163T4(baseFragment.getString(R$string.i_already_know), null);
        FragmentManager childFragmentManager = baseFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54163T4.show(childFragmentManager, "request_order_tips_deal");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m100471e() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public void m100472c(@NotNull final BaseFragment fragment, @NotNull C45387i0 binding, @NotNull HistoryOrdersUiData$ItemEntity.AdvancedLimit data, boolean z11) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(data, "data");
        binding.f102149m.setText(C11629a.m21106i(data));
        binding.f102148l.setText(C12465d.m23408d(C27039d.m66652l(data.getTime())));
        BaseTextView tvHide = binding.f102146j;
        Intrinsics.checkNotNullExpressionValue(tvHide, "tvHide");
        C0296a.m1042d(tvHide, C11629a.m21121x(data));
        BaseTextView tvTriggerPriceTitle = binding.f102152p;
        Intrinsics.checkNotNullExpressionValue(tvTriggerPriceTitle, "tvTriggerPriceTitle");
        C0296a.m1042d(tvTriggerPriceTitle, false);
        ShowHideTextView tvTriggerPrice = binding.f102151o;
        Intrinsics.checkNotNullExpressionValue(tvTriggerPrice, "tvTriggerPrice");
        C0296a.m1042d(tvTriggerPrice, false);
        binding.f102150n.setText(fragment.getString(C11629a.m21107j(data)) + " / " + C11629a.m21116s(data));
        BaseTextView baseTextView = binding.f102150n;
        Context context = fragment.getContext();
        baseTextView.setTextColor(C27039d.m66651k(context != null ? Integer.valueOf(C22890g.m54281f(context, C11629a.m21117t(data))) : null, fragment.getColorRes(R$color.c_text)));
        binding.f102139c.setText(fragment.getString(R$string.dealed) + '/' + fragment.getString(R$string.delegation_amount_stub, C11629a.m21100c(data)));
        if (C11629a.m21120w(data)) {
            binding.f102139c.setNeedDash(true);
            DashTextView tvAmountType = binding.f102139c;
            Intrinsics.checkNotNullExpressionValue(tvAmountType, "tvAmountType");
            C27046k.m66711z(tvAmountType, 0L, new Function0() { // from class: vd.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C45500c.m100470d(fragment);
                }
            }, 1, null);
        } else {
            binding.f102139c.setNeedDash(false);
            DashTextView tvAmountType2 = binding.f102139c;
            Intrinsics.checkNotNullExpressionValue(tvAmountType2, "tvAmountType");
            C27046k.m66711z(tvAmountType2, 0L, new Function0() { // from class: vd.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C45500c.m100471e();
                }
            }, 1, null);
        }
        ShowHideTextView tvDealPercent = binding.f102143g;
        Intrinsics.checkNotNullExpressionValue(tvDealPercent, "tvDealPercent");
        C0296a.m1042d(tvDealPercent, true);
        binding.f102143g.setText('(' + C42828b.m93915p(C11629a.m21103f(data)) + ')');
        BaseTextView baseTextView2 = binding.f102147k;
        Context context2 = fragment.getContext();
        baseTextView2.setText(context2 != null ? context2.getString(C11629a.m21110m(data)) : null);
        binding.f102142f.setText(new C27096v0().append(C11629a.m21099b(data, C11629a.m21101d(data), false)).m66905e(" / " + C11629a.m21099b(data, C11629a.m21113p(data), false), fragment.getColorRes(R$color.c_text40)));
        binding.f102141e.setText(fragment.getStringRes(R$string.deal_avg_price, new Object[0]));
        ShowHideTextView showHideTextView = binding.f102140d;
        String averagePrice = data.getAveragePrice();
        showHideTextView.setText(C11629a.m21105h(data, averagePrice != null ? StringsKt.toBigDecimalOrNull(averagePrice) : null));
        binding.f102145i.setText(fragment.getStringRes(R$string.delegation_price, new Object[0]));
        ShowHideTextView showHideTextView2 = binding.f102144h;
        String price = data.getPrice();
        showHideTextView2.setText(C11629a.m21105h(data, price != null ? StringsKt.toBigDecimalOrNull(price) : null));
    }
}
