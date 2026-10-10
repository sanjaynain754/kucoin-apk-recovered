package sd;

import af.C0296a;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.kubi.core.base.TradeAccountType;
import com.kubi.core.base.order.uidata.C11629a;
import com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity;
import com.kubi.core.base.utils.C11674a;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.AlignTopTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.BaseFragment;
import com.kubi.tradecorebiz.R$color;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p429lf.C42179a;
import p569qq.C43852m;
import p827zc.AbstractC46753c;
import p827zc.InterfaceC46752b;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import v30.C45398o;

/* JADX INFO: renamed from: sd.f */
/* JADX INFO: compiled from: DetailBaseHeaderView.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/core/biz/order/detail/DetailBaseHeaderView;", "Lcom/kubi/core/biz/order/detail/IOrderDetailHeaderView;", "<init>", "()V", "onItemClick", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;", "bindData", "binding", "Lcom/kubi/tradecorebiz/databinding/CoreOrderDetailHeaderLayoutBinding;", "fragment", "Lcom/kubi/sdk/BaseFragment;", "getDisplayPriceText", "", "context", "Landroid/content/Context;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class AbstractC44392f {
    /* JADX INFO: renamed from: g */
    public abstract void mo97919g(@NotNull HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static final Unit m97916e(String str, BaseFragment baseFragment, View it) {
        AbstractC46753c abstractC46753cMo66036p1;
        Intrinsics.checkNotNullParameter(it, "it");
        if (str != null && str.length() != 0) {
            C11674a.m21212a(baseFragment, R$string.cancel_reason_title, str, "DetailBaseHeaderView");
        }
        TradeAccountType f97159i = null;
        InterfaceC46752b interfaceC46752b = baseFragment instanceof InterfaceC46752b ? (InterfaceC46752b) baseFragment : null;
        if (interfaceC46752b != null && (abstractC46753cMo66036p1 = interfaceC46752b.mo66036p1()) != null) {
            f97159i = abstractC46753cMo66036p1.getF97159i();
        }
        if (Intrinsics.areEqual(f97159i, TradeAccountType.Unified.INSTANCE)) {
            C43852m.m96591c("B5UnifyTrading", "cancelReason", null, null, 12, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public void mo97917c(@NotNull C45398o binding, @NotNull final HistoryOrdersUiData$ItemEntity entity, @NotNull final BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(entity, "entity");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        AlignTopTextView tvSymbols = binding.f102261v;
        Intrinsics.checkNotNullExpressionValue(tvSymbols, "tvSymbols");
        C27046k.m66711z(tvSymbols, 0L, new Function0() { // from class: sd.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC44392f.m97915d(this.f98060b, entity);
            }
        }, 1, null);
        binding.f102261v.setText(C11629a.m21106i(entity));
        ShowHideTextView showHideTextView = binding.f102258s;
        Context contextRequireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        showHideTextView.setText(m97918f(contextRequireContext, entity));
        binding.f102263x.setText(C42179a.m92633f(C27039d.m66652l(entity.getTime()), null, false, false, null, 15, null));
        BaseTextView tvHide = binding.f102257r;
        Intrinsics.checkNotNullExpressionValue(tvHide, "tvHide");
        C0296a.m1042d(tvHide, C11629a.m21121x(entity));
        binding.f102260u.setText(C11629a.m21109l(entity, fragment.getContext()));
        final String strM21108k = C11629a.m21108k(entity);
        binding.f102260u.setNeedDash(!(strM21108k == null || strM21108k.length() == 0));
        DashTextView tvStatus = binding.f102260u;
        Intrinsics.checkNotNullExpressionValue(tvStatus, "tvStatus");
        ViewExtKt.m66575f(tvStatus, new Function1() { // from class: sd.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC44392f.m97916e(strM21108k, fragment, (View) obj);
            }
        });
        binding.f102264y.setText(fragment.getString(C11629a.m21107j(entity)) + " / " + C11629a.m21116s(entity) + C11629a.m21111n(entity));
        BaseTextView baseTextView = binding.f102264y;
        Context context = fragment.getContext();
        String string = null;
        baseTextView.setTextColor(C27039d.m66651k(context != null ? Integer.valueOf(C22890g.m54281f(context, C11629a.m21117t(entity))) : null, fragment.getColorRes(R$color.c_text)));
        binding.f102253n.setText(C11629a.m21099b(entity, C11629a.m21101d(entity), C11629a.m21118u(entity)));
        binding.f102250k.setText(C11629a.m21099b(entity, C11629a.m21113p(entity), C11629a.m21118u(entity)));
        binding.f102251l.setText(fragment.getString(R$string.dealed) + '/' + fragment.getString(R$string.delegation_amount_stub, C11629a.m21100c(entity)));
        ShowHideTextView showHideTextView2 = binding.f102254o;
        String filledFunds = entity.getFilledFunds();
        String strM21098a = C11629a.m21098a(entity, filledFunds != null ? DowngradeExKt.m66535e(filledFunds, null, 1, null) : null, true);
        if (strM21098a != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strM21098a);
            sb2.append(' ');
            SymbolInfoEntity symbolInfo = entity.getSymbolInfo();
            sb2.append(symbolInfo != null ? symbolInfo.getQuoteCurrencyName() : null);
            string = sb2.toString();
        }
        showHideTextView2.setText(C27041f.m66669i(string, C27017c.f54310a.m66516f(com.kubi.tradebase.R$string.stub, new Object[0])));
        binding.f102256q.setText(C11629a.m21104g(entity));
        String strM21112o = C11629a.m21112o(entity);
        RelativeLayout rlTax = binding.f102247h;
        Intrinsics.checkNotNullExpressionValue(rlTax, "rlTax");
        C0296a.m1042d(rlTax, C11629a.m21122y(entity));
        binding.f102262w.setText(strM21112o);
    }

    /* JADX INFO: renamed from: f */
    public final String m97918f(Context context, HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity) {
        if (historyOrdersUiData$ItemEntity instanceof HistoryOrdersUiData$ItemEntity.Market) {
            String string = context.getString(R$string.market_price);
            Intrinsics.checkNotNull(string);
            return string;
        }
        if (historyOrdersUiData$ItemEntity instanceof HistoryOrdersUiData$ItemEntity.StopMarket) {
            String string2 = context.getString(R$string.market_price);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        if (historyOrdersUiData$ItemEntity instanceof HistoryOrdersUiData$ItemEntity.StopLimit) {
            String price = ((HistoryOrdersUiData$ItemEntity.StopLimit) historyOrdersUiData$ItemEntity).getPrice();
            return C11629a.m21105h(historyOrdersUiData$ItemEntity, price != null ? StringsKt.toBigDecimalOrNull(price) : null);
        }
        if (historyOrdersUiData$ItemEntity instanceof HistoryOrdersUiData$ItemEntity.Limit) {
            String price2 = ((HistoryOrdersUiData$ItemEntity.Limit) historyOrdersUiData$ItemEntity).getPrice();
            return C11629a.m21105h(historyOrdersUiData$ItemEntity, price2 != null ? StringsKt.toBigDecimalOrNull(price2) : null);
        }
        if (!(historyOrdersUiData$ItemEntity instanceof HistoryOrdersUiData$ItemEntity.AdvancedLimit)) {
            throw new NoWhenBranchMatchedException();
        }
        String price3 = ((HistoryOrdersUiData$ItemEntity.AdvancedLimit) historyOrdersUiData$ItemEntity).getPrice();
        return C11629a.m21105h(historyOrdersUiData$ItemEntity, price3 != null ? StringsKt.toBigDecimalOrNull(price3) : null);
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m97915d(AbstractC44392f abstractC44392f, HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity) {
        abstractC44392f.mo97919g(historyOrdersUiData$ItemEntity);
        return Unit.INSTANCE;
    }
}
