package com.kubi.core.biz.order.detail;

import af.C0296a;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import cd.InterfaceC4934a;
import com.blankj.utilcode.util.C5303w0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.core.base.order.data.Request;
import com.kubi.core.base.order.data.ResponseItemEntity;
import com.kubi.core.base.order.uidata.C11629a;
import com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity;
import com.kubi.core.biz.order.detail.AbsOrderDetailFragment;
import com.kubi.core.utils.C12465d;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.margin.api.IMarginService;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.tradecorebiz.R$color;
import com.kubi.tradecorebiz.R$drawable;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37886j;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p057ce.C4939a;
import p367jd.C40391e;
import p402kf.C41014a;
import p793yc.InterfaceC46463e;
import p827zc.InterfaceC46752b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import sd.C44393g;
import v30.C45396n;
import v30.C45398o;

/* JADX INFO: compiled from: AbsOrderDetailFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J$\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0014J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0016H\u0014J\u001c\u0010\u001b\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u0014J\u0012\u0010\u001f\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\u0010\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006$"}, m90084d2 = {"Lcom/kubi/core/biz/order/detail/AbsOrderDetailFragment;", "Lcom/kubi/core/base/arch/repo/IRepoProvider;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/core/biz/order/detail/HistoryOrderFillsUiData;", "<init>", "()V", "delegationData", "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;", "getDelegationData", "()Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;", "delegationData$delegate", "Lkotlin/Lazy;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "", "pageSize", "needDefaultBackground", "", "getItemLayout", "bindDataToView", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "isTaxVisible", FirebaseAnalytics.Param.TAX, "", "getQuoteCurrency", "textStub", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAbsOrderDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsOrderDetailFragment.kt\ncom/kubi/core/biz/order/detail/AbsOrderDetailFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
public abstract class AbsOrderDetailFragment extends BasePagingFragment<HistoryOrderFillsUiData> implements InterfaceC46752b {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f20576Z;

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: C3 */
    public boolean mo15903C3() {
        return false;
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m22094L3(final AbsOrderDetailFragment absOrderDetailFragment) {
        IMarginService.f32724a.get().mo37912K("SPOT_TAX_TIPS", new Consumer() { // from class: sd.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbsOrderDetailFragment.m22095M3(this.f98059b, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    public static final void m22095M3(AbsOrderDetailFragment absOrderDetailFragment, String str) {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54167X4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.kc_trade_india_tax_title);
        String string = absOrderDetailFragment.getString(R$string.common_tax_tips);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        AlertDialogFragmentHelper alertDialogFragmentHelperM54163T4 = alertDialogFragmentHelperM54167X4.m54156M4(C27041f.m66669i(str, string)).m54163T4(absOrderDetailFragment.getString(R$string.i_already_know), null);
        FragmentManager childFragmentManager = absOrderDetailFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54163T4.show(childFragmentManager, "tax_tip");
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: K3, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@Nullable BaseViewHolder baseViewHolder, @Nullable HistoryOrderFillsUiData historyOrderFillsUiData) {
        String strM21099b;
        String strM21099b2;
        String strM85579c;
        if (baseViewHolder == null || historyOrderFillsUiData == null) {
            return;
        }
        C45396n c45396nM100326a = C45396n.m100326a(baseViewHolder.itemView);
        Intrinsics.checkNotNullExpressionValue(c45396nM100326a, "bind(...)");
        String strM66516f = C27017c.f54310a.m66516f(R$string.stub, new Object[0]);
        c45396nM100326a.f102235v.setText(C12465d.m23409e(C27039d.m66652l(historyOrderFillsUiData.getTime())));
        ShowHideTextView showHideTextView = c45396nM100326a.f102226m;
        HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntityM22098O3 = m22098O3();
        String strM21099b3 = null;
        if (historyOrdersUiData$ItemEntityM22098O3 != null) {
            BigDecimal fee = historyOrderFillsUiData.getFee();
            strM21099b = C11629a.m21099b(historyOrdersUiData$ItemEntityM22098O3, fee != null ? fee.negate() : null, true);
        } else {
            strM21099b = null;
        }
        showHideTextView.setText(C27041f.m66669i(strM21099b, strM66516f));
        BaseTextView baseTextView = c45396nM100326a.f102223j;
        String feeCurrency = historyOrderFillsUiData.getFeeCurrency();
        if (feeCurrency == null) {
            feeCurrency = m22099P3(strM66516f);
        }
        baseTextView.setText(feeCurrency);
        HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntityM22098O4 = m22098O3();
        if (historyOrdersUiData$ItemEntityM22098O4 != null) {
            BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(historyOrderFillsUiData.getTax());
            strM21099b2 = C11629a.m21099b(historyOrdersUiData$ItemEntityM22098O4, bigDecimalM66536f != null ? bigDecimalM66536f.negate() : null, true);
        } else {
            strM21099b2 = null;
        }
        c45396nM100326a.f102232s.setText(strM21099b2);
        LinearLayout llTax = c45396nM100326a.f102218e;
        Intrinsics.checkNotNullExpressionValue(llTax, "llTax");
        C0296a.m1042d(llTax, (!m22100Q3(historyOrderFillsUiData.getTax()) || strM21099b2 == null || strM21099b2.length() == 0) ? false : true);
        BaseTextView baseTextView2 = c45396nM100326a.f102233t;
        String taxCurrency = historyOrderFillsUiData.getTaxCurrency();
        if (taxCurrency == null) {
            taxCurrency = m22099P3(strM66516f);
        }
        baseTextView2.setText(taxCurrency);
        BaseTextView baseTextView3 = c45396nM100326a.f102234u;
        Intrinsics.checkNotNull(baseTextView3);
        C27046k.m66711z(baseTextView3, 0L, new Function0() { // from class: sd.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbsOrderDetailFragment.m22094L3(this.f98057b);
            }
        }, 1, null);
        C27046k.m66694i(baseTextView3, R$drawable.ic2_question_16, 0, C5303w0.m6511a() ? GravityCompat.START : GravityCompat.END, 2, null);
        ShowHideTextView showHideTextView2 = c45396nM100326a.f102219f;
        HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntityM22098O5 = m22098O3();
        showHideTextView2.setText(C27041f.m66669i(historyOrdersUiData$ItemEntityM22098O5 != null ? C11629a.m21099b(historyOrdersUiData$ItemEntityM22098O5, historyOrderFillsUiData.getSize(), false) : null, strM66516f));
        ShowHideTextView showHideTextView3 = c45396nM100326a.f102228o;
        BigDecimal price = historyOrderFillsUiData.getPrice();
        if (price != null) {
            HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntityM22098O6 = m22098O3();
            strM85579c = C37886j.m85579c(price, historyOrdersUiData$ItemEntityM22098O6 != null ? historyOrdersUiData$ItemEntityM22098O6.getSymbol() : null, (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null);
        } else {
            strM85579c = null;
        }
        showHideTextView3.setText(C27041f.m66669i(strM85579c, strM66516f));
        ShowHideTextView showHideTextView4 = c45396nM100326a.f102224k;
        HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntityM22098O7 = m22098O3();
        if (historyOrdersUiData$ItemEntityM22098O7 != null) {
            BigDecimal size = historyOrderFillsUiData.getSize();
            strM21099b3 = C11629a.m21099b(historyOrdersUiData$ItemEntityM22098O7, size != null ? size.multiply(C41014a.m89922G(historyOrderFillsUiData.getPrice(), null, 1, null)) : null, true);
        }
        showHideTextView4.setText(C27041f.m66669i(strM21099b3, strM66516f));
        Integer numM5171a = C4939a.f5493a.m5171a(historyOrderFillsUiData.getLiquidityRole());
        if (numM5171a == null) {
            LinearLayout llRole = c45396nM100326a.f102217d;
            Intrinsics.checkNotNullExpressionValue(llRole, "llRole");
            C0296a.m1042d(llRole, false);
            BaseTextView tvRole = c45396nM100326a.f102230q;
            Intrinsics.checkNotNullExpressionValue(tvRole, "tvRole");
            C0296a.m1042d(tvRole, false);
            BaseTextView tvRoleName = c45396nM100326a.f102231r;
            Intrinsics.checkNotNullExpressionValue(tvRoleName, "tvRoleName");
            C0296a.m1042d(tvRoleName, false);
            return;
        }
        c45396nM100326a.f102230q.setText(numM5171a.intValue());
        LinearLayout llRole2 = c45396nM100326a.f102217d;
        Intrinsics.checkNotNullExpressionValue(llRole2, "llRole");
        C0296a.m1042d(llRole2, true);
        BaseTextView tvRole2 = c45396nM100326a.f102230q;
        Intrinsics.checkNotNullExpressionValue(tvRole2, "tvRole");
        C0296a.m1042d(tvRole2, true);
        BaseTextView tvRoleName2 = c45396nM100326a.f102231r;
        Intrinsics.checkNotNullExpressionValue(tvRoleName2, "tvRoleName");
        C0296a.m1042d(tvRoleName2, true);
    }

    /* JADX INFO: renamed from: O3 */
    public final HistoryOrdersUiData$ItemEntity m22098O3() {
        return (HistoryOrdersUiData$ItemEntity) this.f20576Z.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        int color = ContextCompat.getColor(this.mContext, R$color.c_overlay);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            EdgeToEdgeCompat.f48106a.m58267e(activity, color);
        }
        NavigationBar navigationBar = getNavigationBar();
        if (navigationBar != null) {
            ViewExtKt.m66584o(navigationBar, 0, EdgeToEdgeCompat.f48106a.m58272j(), 0, 0);
        }
        this.f46496X.getRecyclerView().setBackgroundColor(color);
        this.f46496X.getRecyclerView().addItemDecoration(new C40391e());
        HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntityM22098O3 = m22098O3();
        if (historyOrdersUiData$ItemEntityM22098O3 != null) {
            C44393g c44393g = new C44393g();
            C45398o c45398oM100331c = C45398o.m100331c(LayoutInflater.from(this.mContext));
            Intrinsics.checkNotNullExpressionValue(c45398oM100331c, "inflate(...)");
            c45398oM100331c.getRoot().setBackgroundColor(color);
            c44393g.mo97917c(c45398oM100331c, historyOrdersUiData$ItemEntityM22098O3, this);
            this.f46495W.addHeaderView(c45398oM100331c.getRoot());
        }
        NavigationBar navigationBar2 = getNavigationBar();
        if (navigationBar2 != null) {
            navigationBar2.setBackgroundColor(color);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.core_item_delegation_detail;
    }

    public AbsOrderDetailFragment() {
        setPageId("B5singleOrder");
        this.f20576Z = LazyKt.lazy(new Function0() { // from class: sd.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbsOrderDetailFragment.m22096N3(this.f98058b);
            }
        });
    }

    /* JADX INFO: renamed from: N3 */
    public static final HistoryOrdersUiData$ItemEntity m22096N3(AbsOrderDetailFragment absOrderDetailFragment) {
        Bundle arguments = absOrderDetailFragment.getArguments();
        if (arguments != null) {
            return (HistoryOrdersUiData$ItemEntity) arguments.getParcelable("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: P3 */
    public final String m22099P3(String str) {
        String quoteCurrencyName;
        SymbolInfoEntity symbolInfo;
        HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntityM22098O3 = m22098O3();
        if (historyOrdersUiData$ItemEntityM22098O3 != null && (symbolInfo = historyOrdersUiData$ItemEntityM22098O3.getSymbolInfo()) != null) {
            quoteCurrencyName = symbolInfo.getQuoteCurrencyName();
        } else {
            quoteCurrencyName = null;
        }
        return C27041f.m66669i(quoteCurrencyName, str);
    }

    /* JADX INFO: renamed from: Q3 */
    public final boolean m22100Q3(String str) {
        if (!TextUtils.isEmpty(str) && !C41014a.m89919D(DowngradeExKt.m66536f(str))) {
            return true;
        }
        return false;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @NotNull
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<HistoryOrderFillsUiData>> mo16440r3(int i11, int i12) {
        InterfaceC46463e<Request, ResponseItemEntity, HistoryOrderFillsUiData> f101566j;
        String symbol;
        InterfaceC4934a interfaceC4934aMo96893b = getF54179Z().getF104578c();
        if (interfaceC4934aMo96893b != null && (f101566j = interfaceC4934aMo96893b.getF104591i()) != null) {
            HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntityM22098O3 = m22098O3();
            String orderId = null;
            if (historyOrdersUiData$ItemEntityM22098O3 != null) {
                symbol = historyOrdersUiData$ItemEntityM22098O3.getSymbol();
            } else {
                symbol = null;
            }
            HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntityM22098O4 = m22098O3();
            if (historyOrdersUiData$ItemEntityM22098O4 != null) {
                orderId = historyOrdersUiData$ItemEntityM22098O4.getOrderId();
            }
            Observable<BasePageEntity<HistoryOrderFillsUiData>> observableMo66265a = f101566j.mo66265a(new Request("SPOT", symbol, orderId, String.valueOf(i11), String.valueOf(i12)));
            if (observableMo66265a != null) {
                return observableMo66265a;
            }
        }
        Observable<BasePageEntity<HistoryOrderFillsUiData>> observableEmpty = Observable.empty();
        Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
        return observableEmpty;
    }
}
