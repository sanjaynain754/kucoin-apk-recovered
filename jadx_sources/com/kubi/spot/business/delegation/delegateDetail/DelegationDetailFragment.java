package com.kubi.spot.business.delegation.delegateDetail;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.C5303w0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.margin.api.IMarginService;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.spot.R$color;
import com.kubi.spot.R$drawable;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$string;
import com.kubi.spot.business.delegation.delegateDetail.DelegationDetailFragment;
import com.kubi.spot.entity.DelegationEntity;
import com.kubi.spot.entity.DelegationItemEntity;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import e20.InterfaceC37053d;
import f30.C37330a;
import f30.C37347r;
import gf.C37886j;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.math.RoundingMode;
import l20.C42039f;
import l20.InterfaceC42045l;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p367jd.C40391e;
import p402kf.C41014a;
import p830zf.InterfaceC46815o0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import v30.C45396n;

/* JADX INFO: compiled from: DelegationDetailFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001fH\u0014J$\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\"0!2\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001fH\u0014J\u001c\u0010%\u001a\u00020\u00172\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010)\u001a\u00020\u001d2\b\u0010*\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010+\u001a\u00020\u0006H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR#\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0013\u0010\u0014¨\u0006,"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/spot/entity/DelegationItemEntity;", "<init>", "()V", "tradeType", "", "getTradeType", "()Ljava/lang/String;", "tradeType$delegate", "Lkotlin/Lazy;", "mTradeApi", "Lcom/kubi/spot/api/MarketApi;", "kotlin.jvm.PlatformType", "getMTradeApi", "()Lcom/kubi/spot/api/MarketApi;", "mTradeApi$delegate", "delegationData", "Lcom/kubi/spot/entity/DelegationEntity;", "getDelegationData", "()Lcom/kubi/spot/entity/DelegationEntity;", "delegationData$delegate", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "needDefaultBackground", "", "getItemLayout", "", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "pageSize", "bindDataToView", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "isTaxVisible", FirebaseAnalytics.Param.TAX, "getQuoteCurrency", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDelegationDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegationDetailFragment.kt\ncom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,147:1\n1#2:148\n17#3,2:149\n*S KotlinDebug\n*F\n+ 1 DelegationDetailFragment.kt\ncom/kubi/spot/business/delegation/delegateDetail/DelegationDetailFragment\n*L\n139#1:149,2\n*E\n"})
public final class DelegationDetailFragment extends BasePagingFragment<DelegationItemEntity> {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f49996Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f49997a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f49998b0;

    /* JADX INFO: renamed from: U3 */
    private final boolean m60827U3(String str) {
        return !(DowngradeExKt.m66538h(str, 0.0d, 1, null) == 0.0d);
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: C3 */
    public boolean mo15903C3() {
        return false;
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m60822N3(final DelegationDetailFragment delegationDetailFragment) {
        IMarginService.f32724a.get().mo37912K("SPOT_TAX_TIPS", new Consumer() { // from class: l20.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DelegationDetailFragment.m60823O3(this.f92317b, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public static final void m60823O3(DelegationDetailFragment delegationDetailFragment, String str) {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54167X4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.kc_trade_india_tax_title);
        String string = delegationDetailFragment.getString(R$string.common_tax_tips);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        AlertDialogFragmentHelper alertDialogFragmentHelperM54163T4 = alertDialogFragmentHelperM54167X4.m54156M4(C27041f.m66669i(str, string)).m54163T4(delegationDetailFragment.getString(R$string.i_already_know), null);
        FragmentManager childFragmentManager = delegationDetailFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54163T4.show(childFragmentManager, "tax_tip");
    }

    /* JADX INFO: renamed from: R3 */
    private final InterfaceC37053d m60825R3() {
        return (InterfaceC37053d) this.f49997a0.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: M3, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@Nullable BaseViewHolder baseViewHolder, @Nullable DelegationItemEntity delegationItemEntity) {
        String amountFormatterStr;
        String amountFormatterStr2;
        String strM85579c;
        if (baseViewHolder == null || delegationItemEntity == null) {
            return;
        }
        String string = getString(R$string.stub);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        C45396n c45396nM100326a = C45396n.m100326a(baseViewHolder.itemView);
        Intrinsics.checkNotNullExpressionValue(c45396nM100326a, "bind(...)");
        c45396nM100326a.f102235v.setText(C37347r.m83945e(C27039d.m66652l(delegationItemEntity.getTime())));
        ShowHideTextView showHideTextView = c45396nM100326a.f102226m;
        DelegationEntity delegationEntityM60831Q3 = m60831Q3();
        String amountFormatterStr3 = null;
        if (delegationEntityM60831Q3 != null) {
            BigDecimal fee = delegationItemEntity.getFee();
            amountFormatterStr = delegationEntityM60831Q3.getAmountFormatterStr(fee != null ? fee.negate() : null, true);
        } else {
            amountFormatterStr = null;
        }
        showHideTextView.setText(C27041f.m66669i(amountFormatterStr, string));
        BaseTextView baseTextView = c45396nM100326a.f102223j;
        String feeCurrency = delegationItemEntity.getFeeCurrency();
        if (feeCurrency == null) {
            feeCurrency = m60826S3();
        }
        baseTextView.setText(feeCurrency);
        ShowHideTextView showHideTextView2 = c45396nM100326a.f102232s;
        DelegationEntity delegationEntityM60831Q4 = m60831Q3();
        if (delegationEntityM60831Q4 != null) {
            BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(delegationItemEntity.getTax());
            amountFormatterStr2 = delegationEntityM60831Q4.getAmountFormatterStr(bigDecimalM66536f != null ? bigDecimalM66536f.negate() : null, true);
        } else {
            amountFormatterStr2 = null;
        }
        showHideTextView2.setText(C27041f.m66669i(amountFormatterStr2, string));
        BaseTextView baseTextView2 = c45396nM100326a.f102233t;
        String taxCurrency = delegationItemEntity.getTaxCurrency();
        if (taxCurrency == null) {
            taxCurrency = m60826S3();
        }
        baseTextView2.setText(taxCurrency);
        ShowHideTextView showHideTextView3 = c45396nM100326a.f102219f;
        DelegationEntity delegationEntityM60831Q5 = m60831Q3();
        showHideTextView3.setText(C27041f.m66669i(delegationEntityM60831Q5 != null ? delegationEntityM60831Q5.getAmountFormatterStr(delegationItemEntity.getSize(), false) : null, string));
        ShowHideTextView showHideTextView4 = c45396nM100326a.f102228o;
        BigDecimal price = delegationItemEntity.getPrice();
        if (price != null) {
            DelegationEntity delegationEntityM60831Q6 = m60831Q3();
            strM85579c = C37886j.m85579c(price, delegationEntityM60831Q6 != null ? delegationEntityM60831Q6.getSymbol() : null, (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null);
        } else {
            strM85579c = null;
        }
        showHideTextView4.setText(C27041f.m66669i(strM85579c, string));
        ShowHideTextView showHideTextView5 = c45396nM100326a.f102224k;
        DelegationEntity delegationEntityM60831Q7 = m60831Q3();
        if (delegationEntityM60831Q7 != null) {
            BigDecimal size = delegationItemEntity.getSize();
            amountFormatterStr3 = delegationEntityM60831Q7.getAmountFormatterStr(size != null ? size.multiply(C41014a.m89922G(delegationItemEntity.getPrice(), null, 1, null)) : null, true);
        }
        showHideTextView5.setText(C27041f.m66669i(amountFormatterStr3, string));
        BaseTextView tvTaxName = c45396nM100326a.f102234u;
        Intrinsics.checkNotNullExpressionValue(tvTaxName, "tvTaxName");
        C37330a.m83912d(tvTaxName, m60827U3(delegationItemEntity.getTax()));
        ShowHideTextView tvTax = c45396nM100326a.f102232s;
        Intrinsics.checkNotNullExpressionValue(tvTax, "tvTax");
        C37330a.m83912d(tvTax, m60827U3(delegationItemEntity.getTax()));
        LinearLayout llTax = c45396nM100326a.f102218e;
        Intrinsics.checkNotNullExpressionValue(llTax, "llTax");
        C37330a.m83912d(llTax, m60827U3(delegationItemEntity.getTax()));
        BaseTextView tvTaxCurrency = c45396nM100326a.f102233t;
        Intrinsics.checkNotNullExpressionValue(tvTaxCurrency, "tvTaxCurrency");
        C37330a.m83912d(tvTaxCurrency, m60827U3(delegationItemEntity.getTax()));
        BaseTextView tvTaxName2 = c45396nM100326a.f102234u;
        Intrinsics.checkNotNullExpressionValue(tvTaxName2, "tvTaxName");
        C27046k.m66711z(tvTaxName2, 0L, new Function0() { // from class: l20.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegationDetailFragment.m60822N3(this.f92316b);
            }
        }, 1, null);
        BaseTextView tvTaxName3 = c45396nM100326a.f102234u;
        Intrinsics.checkNotNullExpressionValue(tvTaxName3, "tvTaxName");
        C27046k.m66694i(tvTaxName3, R$drawable.ic2_question_16, 0, C5303w0.m6511a() ? GravityCompat.START : GravityCompat.END, 2, null);
        LinearLayout llCounterparty = c45396nM100326a.f102216c;
        Intrinsics.checkNotNullExpressionValue(llCounterparty, "llCounterparty");
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46815o0.class, SiteInfoManager.f47913a.m58109c());
        C37330a.m83912d(llCounterparty, objM56186h != null ? ((InterfaceC46815o0) objM56186h).mo102977a() : false);
    }

    /* JADX INFO: renamed from: Q3 */
    public final DelegationEntity m60831Q3() {
        return (DelegationEntity) this.f49998b0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: T3 */
    public final String m60832T3() {
        return (String) this.f49996Z.getValue();
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
        DelegationEntity delegationEntityM60831Q3 = m60831Q3();
        if (delegationEntityM60831Q3 != null) {
            InterfaceC42045l interfaceC42045lM92242a = C42039f.m92242a(delegationEntityM60831Q3);
            View viewInflate = View.inflate(this.mContext, interfaceC42045lM92242a.mo92249b(delegationEntityM60831Q3), null);
            Intrinsics.checkNotNull(viewInflate);
            interfaceC42045lM92242a.mo92245a(viewInflate, delegationEntityM60831Q3, this);
            this.f46495W.addHeaderView(viewInflate);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.core_item_delegation_detail;
    }

    public DelegationDetailFragment() {
        setPageId("B5singleOrder");
        this.f49996Z = LazyKt.lazy(new Function0() { // from class: l20.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegationDetailFragment.m60829W3(this.f92314b);
            }
        });
        this.f49997a0 = LazyKt.lazy(new Function0() { // from class: l20.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegationDetailFragment.m60828V3();
            }
        });
        this.f49998b0 = LazyKt.lazy(new Function0() { // from class: l20.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegationDetailFragment.m60824P3(this.f92315b);
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public static final DelegationEntity m60824P3(DelegationDetailFragment delegationDetailFragment) {
        Bundle arguments = delegationDetailFragment.getArguments();
        if (arguments != null) {
            return (DelegationEntity) arguments.getParcelable("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: S3 */
    private final String m60826S3() {
        String quoteCurrencyName;
        SymbolInfoEntity symbolInfoEntity;
        DelegationEntity delegationEntityM60831Q3 = m60831Q3();
        if (delegationEntityM60831Q3 != null && (symbolInfoEntity = delegationEntityM60831Q3.getSymbolInfoEntity()) != null) {
            quoteCurrencyName = symbolInfoEntity.getQuoteCurrencyName();
        } else {
            quoteCurrencyName = null;
        }
        String string = getString(R$string.stub);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return C27041f.m66669i(quoteCurrencyName, string);
    }

    /* JADX INFO: renamed from: V3 */
    public static final InterfaceC37053d m60828V3() {
        return (InterfaceC37053d) C42597a.m93386b().create(InterfaceC37053d.class);
    }

    /* JADX INFO: renamed from: W3 */
    public static final String m60829W3(DelegationDetailFragment delegationDetailFragment) {
        String string;
        Bundle arguments = delegationDetailFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("tradeType");
        } else {
            string = null;
        }
        return C27041f.m66669i(string, "TRADE");
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @NotNull
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<DelegationItemEntity>> mo16440r3(int i11, int i12) {
        String symbol;
        InterfaceC37053d interfaceC37053dM60825R3 = m60825R3();
        String strM60832T3 = m60832T3();
        DelegationEntity delegationEntityM60831Q3 = m60831Q3();
        String orderId = null;
        if (delegationEntityM60831Q3 != null) {
            symbol = delegationEntityM60831Q3.getSymbol();
        } else {
            symbol = null;
        }
        DelegationEntity delegationEntityM60831Q4 = m60831Q3();
        if (delegationEntityM60831Q4 != null) {
            orderId = delegationEntityM60831Q4.getOrderId();
        }
        Observable observableCompose = interfaceC37053dM60825R3.m82928S(strM60832T3, symbol, orderId, i11, i12).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }
}
