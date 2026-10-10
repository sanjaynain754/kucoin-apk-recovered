package p603rp;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.StringRes;
import com.blankj.utilcode.util.SpanUtils;
import com.kubi.assets.C11351z0;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.data.coin.AccountType;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.host.HostManager;
import com.kubi.margin.R$color;
import com.kubi.margin.R$drawable;
import com.kubi.margin.R$string;
import com.kubi.margin.api.entity.FeeEntity;
import com.kubi.margin.trade.MarginConfigManager;
import com.kubi.margin.trade.submit.MarginSubmitFragment;
import com.kubi.margin.view.LeverGiftView;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.resources.MenuItem;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24271s1;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27017c;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37756h;
import g00.InterfaceC37766r;
import gf.C37878b0;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import mp.C42579a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041bp.C4643e;
import p318hp.C38236a;
import p429lf.C42180b;
import p437lp.C42290a;
import p568qp.C43839s;
import p569qq.C43852m;
import p698vp.C45612b;
import p768xo.InterfaceC46306g;
import p830zf.InterfaceC46809l0;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import ro.C44128b;

/* JADX INFO: renamed from: rp.k0 */
/* JADX INFO: compiled from: BaseMarginMenuItemsProvider.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019J\b\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u001dH&J\b\u0010\u001f\u001a\u00020\u001dH&J\b\u0010 \u001a\u00020!H&J\b\u0010\"\u001a\u00020\u001dH&J\b\u0010#\u001a\u00020\u001aH\u0002J\b\u0010$\u001a\u00020\u001aH\u0002J\b\u0010%\u001a\u00020\u001aH\u0002J\b\u0010&\u001a\u00020\u001aH\u0002J\u001a\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u001dH\u0014J\b\u0010,\u001a\u00020\u001aH\u0002J\b\u0010-\u001a\u00020\u001aH\u0002J\b\u0010.\u001a\u00020\u001aH\u0002J\b\u0010/\u001a\u00020\u001aH\u0002J\b\u00100\u001a\u000201H\u0014J\b\u00102\u001a\u00020\u001aH\u0002J\b\u00103\u001a\u00020\u001aH\u0002J\b\u00104\u001a\u00020\u001aH\u0002J\b\u00105\u001a\u00020\u001aH\u0002J\u0010\u00106\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!H\u0002J\b\u00107\u001a\u00020\u001aH\u0002J\b\u00108\u001a\u00020(H\u0002J\b\u00109\u001a\u00020(H\u0002J\b\u0010:\u001a\u00020!H\u0002J\b\u0010;\u001a\u00020!H\u0002J\b\u0010<\u001a\u00020!H\u0002J\b\u0010=\u001a\u00020!H\u0002J\u0012\u0010>\u001a\u00020\u001d2\b\b\u0001\u0010?\u001a\u00020!H\u0002J\u0010\u0010@\u001a\u00020!2\u0006\u0010A\u001a\u00020!H\u0002J\b\u0010B\u001a\u00020\tH\u0002J\b\u0010C\u001a\u00020DH\u0002J\u0016\u0010E\u001a\u00020(2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020(0GH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006H"}, m90084d2 = {"Lcom/kubi/margin/trade/menu/BaseMarginMoreItemsProvider;", "", "baseFragment", "Lcom/kubi/sdk/BaseFragment;", "tradeSubmitFragment", "Lcom/kubi/margin/trade/submit/MarginSubmitFragment;", "destroyDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "tradeModel", "Lcom/kubi/margin/trade/helper/MarginTradeModel;", "<init>", "(Lcom/kubi/sdk/BaseFragment;Lcom/kubi/margin/trade/submit/MarginSubmitFragment;Lio/reactivex/disposables/CompositeDisposable;Lcom/kubi/data/entity/TradeItemBean;Lcom/kubi/margin/trade/helper/MarginTradeModel;)V", "getBaseFragment", "()Lcom/kubi/sdk/BaseFragment;", "getTradeSubmitFragment", "()Lcom/kubi/margin/trade/submit/MarginSubmitFragment;", "getDestroyDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "getTradeItemBean", "()Lcom/kubi/data/entity/TradeItemBean;", "getTradeModel", "()Lcom/kubi/margin/trade/helper/MarginTradeModel;", "getMenuItems", "", "Lcom/kubi/resources/MenuItem;", "getMenuItemsForData", "getPositionType", "", "getRiskUrl", "getTrackPageId", "tradeType", "", "getMarginType", "getFAQMenuItem", "getBorrowMenuItem", "getRepayMenuItem", "getTradeRateMenuItem", "showTradeRateDialog", "", "taxContent", "Landroid/text/SpannableStringBuilder;", "feeContent", "getLendingRateMenuItem", "getRiskLimitMenuItem", "getTradeOrientationMenuItem", "getMarginPnlMenuItem", "getCurrentTradeTypeVertical", "", "getFavoriteMenuItem", "getInterestFreeCouponMenuItem", "getAlertMenuItem", "getMarginBonusMenuItem", "getSettingMenuItem", "getSmallAssetExchangeMenuItem", "showLoadingDialog", "hideLoadingDialog", "getFavoriteIcon", "getFavoriteTint", "getAlertIcon", "getAlertTint", "getString", "resId", "getColorRes", "id", "getCurrentSymbol", "currentSymbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "checkOpenMarginWithRedirect", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function0;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBaseMarginMenuItemsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseMarginMenuItemsProvider.kt\ncom/kubi/margin/trade/menu/BaseMarginMoreItemsProvider\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,599:1\n17#2,2:600\n*S KotlinDebug\n*F\n+ 1 BaseMarginMenuItemsProvider.kt\ncom/kubi/margin/trade/menu/BaseMarginMoreItemsProvider\n*L\n252#1:600,2\n*E\n"})
public abstract class AbstractC44151k0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final BaseFragment f97485a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final MarginSubmitFragment f97486b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final CompositeDisposable f97487c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final TradeItemBean f97488d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final C43839s f97489e;

    /* JADX INFO: renamed from: W0 */
    public static final void m97299W0(AbstractC44151k0 abstractC44151k0, Integer num, BaseQuickAdapter baseQuickAdapter) {
        C43852m.m96591c(abstractC44151k0.mo97359S0(), "tradingFreeRateButton", "1", null, 8, null);
        String string = abstractC44151k0.f97485a.getString(R$string.trade_rate_tip_1, abstractC44151k0.getF97488d().getShowSymbol(), (char) 8237 + C42180b.m92642g(new BigDecimal(String.valueOf(abstractC44151k0.getF97488d().getSymbolInfoEntity().getTakerFeeRate())), null, null, 20, false, false, false, 27, null) + (char) 8236, (char) 8237 + C42180b.m92642g(new BigDecimal(String.valueOf(abstractC44151k0.getF97488d().getSymbolInfoEntity().getMakerFeeRate())), null, null, 20, false, false, false, 27, null) + (char) 8236);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        BaseFragment baseFragment = abstractC44151k0.f97485a;
        int i11 = R$string.trade_rate_tip_2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Lv ");
        C42579a c42579a = C42579a.f94275a;
        sb2.append(c42579a.m93347g().d0().getFeeLevel());
        String string2 = sb2.toString();
        String showSymbol = abstractC44151k0.getF97488d().getShowSymbol();
        StringBuilder sb3 = new StringBuilder();
        sb3.append((char) 8237);
        MarginConfigManager marginConfigManager = MarginConfigManager.f33681a;
        sb3.append(C42180b.m92642g(marginConfigManager.m39885c1(abstractC44151k0.m97351M()), null, null, 20, false, false, false, 27, null));
        sb3.append((char) 8236);
        String string3 = baseFragment.getString(i11, string2, showSymbol, sb3.toString(), (char) 8237 + C42180b.m92642g(marginConfigManager.m39875U0(abstractC44151k0.m97351M()), null, null, 20, false, false, false, 27, null) + (char) 8236);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        if (c42579a.m93347g().c()) {
            string = string + "\n\n" + string3;
        }
        FeeEntity feeEntityM39871R0 = marginConfigManager.m39871R0(abstractC44151k0.m97351M());
        SpannableStringBuilder spannableStringBuilderM6097d = null;
        BigDecimal bigDecimalM66535e = DowngradeExKt.m66535e(feeEntityM39871R0 != null ? feeEntityM39871R0.getBuyTaxRate() : null, null, 1, null);
        BigDecimal bigDecimalM66535e2 = DowngradeExKt.m66535e(feeEntityM39871R0 != null ? feeEntityM39871R0.getSellTaxRate() : null, null, 1, null);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalM66535e.compareTo(bigDecimal) != 0 || bigDecimalM66535e2.compareTo(bigDecimal) != 0) {
            Object objM56186h = Router.f46192a.m56186h(InterfaceC46809l0.class, SiteInfoManager.f47913a.m58109c());
            if (objM56186h != null ? ((InterfaceC46809l0) objM56186h).mo102976a() : false) {
                String string4 = abstractC44151k0.f97485a.getString(R$string.kc_eu_tax_tip);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                spannableStringBuilderM6097d = new SpanUtils().m6094a(string).m6094a("\n\n").m6094a(string4).m6097d();
            } else {
                SpanUtils spanUtilsM6094a = new SpanUtils().m6094a(string).m6094a("\n\n");
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(abstractC44151k0.m97357R0(R$string.kc_tax_pop_rate), Arrays.copyOf(new Object[]{(char) 8237 + C42180b.m92642g(bigDecimalM66535e, null, null, 20, false, false, false, 27, null) + (char) 8236, (char) 8237 + C42180b.m92642g(bigDecimalM66535e2, null, null, 20, false, false, false, 27, null) + (char) 8236}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                SpanUtils spanUtilsM6094a2 = spanUtilsM6094a.m6094a(str);
                final String complianceTaxHelpCenterUrl = feeEntityM39871R0 != null ? feeEntityM39871R0.getComplianceTaxHelpCenterUrl() : null;
                if (!TextUtils.isEmpty(complianceTaxHelpCenterUrl)) {
                    spanUtilsM6094a2 = spanUtilsM6094a2.m6098e(abstractC44151k0.m97361V(R$color.complementary), true, new View.OnClickListener() { // from class: rp.q
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            AbstractC44151k0.m97300X0(complianceTaxHelpCenterUrl, view);
                        }
                    }).m6102i();
                }
                spannableStringBuilderM6097d = spanUtilsM6094a2.m6097d();
            }
        }
        abstractC44151k0.m97369a1(spannableStringBuilderM6097d, string);
    }

    @NotNull
    /* JADX INFO: renamed from: F0 */
    public abstract String mo97346F0();

    @NotNull
    /* JADX INFO: renamed from: L0 */
    public abstract String mo97350L0();

    /* JADX INFO: renamed from: M0 */
    public final MenuItem m97352M0(int i11) {
        final String str;
        if (i11 != 1) {
            str = i11 != 2 ? "" : "marginIsolated";
        } else {
            str = "marginCross";
        }
        return new MenuItem(107, R$drawable.ic2_setting_20, m97357R0(R$string.trade_setting), new BiConsumer() { // from class: rp.g
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC44151k0.m97291N0(this.f97471b, str, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m97361V(R$color.c_text)), false, 32, null);
    }

    @NotNull
    /* JADX INFO: renamed from: S0 */
    public abstract String mo97359S0();

    /* JADX INFO: renamed from: b1 */
    public abstract int mo97371b1();

    @NotNull
    /* JADX INFO: renamed from: w0 */
    public abstract String mo97377w0();

    public AbstractC44151k0(@NotNull BaseFragment baseFragment, @NotNull MarginSubmitFragment tradeSubmitFragment, @NotNull CompositeDisposable destroyDisposable, @NotNull TradeItemBean tradeItemBean, @NotNull C43839s tradeModel) {
        Intrinsics.checkNotNullParameter(baseFragment, "baseFragment");
        Intrinsics.checkNotNullParameter(tradeSubmitFragment, "tradeSubmitFragment");
        Intrinsics.checkNotNullParameter(destroyDisposable, "destroyDisposable");
        Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
        Intrinsics.checkNotNullParameter(tradeModel, "tradeModel");
        this.f97485a = baseFragment;
        this.f97486b = tradeSubmitFragment;
        this.f97487c = destroyDisposable;
        this.f97488d = tradeItemBean;
        this.f97489e = tradeModel;
    }

    /* JADX INFO: renamed from: C0 */
    public static final Unit m97277C0(List list, final AbstractC44151k0 abstractC44151k0) {
        list.add(new MenuItem(112, R$drawable.ic2_index_price_20, abstractC44151k0.m97357R0(R$string.index_price), new BiConsumer() { // from class: rp.b0
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC44151k0.m97279D0(this.f97461b, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(abstractC44151k0.m97361V(R$color.c_text)), false, 32, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D0 */
    public static final void m97279D0(AbstractC44151k0 abstractC44151k0, Integer num, BaseQuickAdapter baseQuickAdapter) {
        C42290a.f93780a.m92825d(abstractC44151k0.m97351M());
    }

    /* JADX INFO: renamed from: E0 */
    public static final void m97281E0(Integer num, BaseQuickAdapter baseQuickAdapter) {
        C42290a.f93780a.m92824c("CollateralRatioPage");
    }

    /* JADX INFO: renamed from: I0 */
    public static final Unit m97287I0(SymbolInfoEntity symbolInfoEntity, AbstractC44151k0 abstractC44151k0) {
        InterfaceC37756h.a.m85144b(C37304a.f82764a, symbolInfoEntity.getQuoteCurrency(), symbolInfoEntity.getCode(), "repay", abstractC44151k0.mo97346F0(), C43852m.m96601m(abstractC44151k0.mo97359S0(), "repayButton", "1"), null, null, 96, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N0 */
    public static final void m97291N0(AbstractC44151k0 abstractC44151k0, String str, Integer num, BaseQuickAdapter baseQuickAdapter) {
        if (abstractC44151k0.f97485a.getContext() != null) {
            InterfaceC37756h.a.m85148f(C37304a.f82764a, false, str, null, null, null, 29, null);
        }
    }

    /* JADX INFO: renamed from: P */
    public static final void m97292P(final AbstractC44151k0 abstractC44151k0, Integer num, BaseQuickAdapter baseQuickAdapter) {
        IUserService.O(C42579a.f94275a.m93347g(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: rp.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC44151k0.m97294Q(this.f97505b);
            }
        }), 1, (Object) null);
    }

    /* JADX INFO: renamed from: P0 */
    public static final void m97293P0(final AbstractC44151k0 abstractC44151k0, Integer num, BaseQuickAdapter baseQuickAdapter) {
        IUserService.E0(C42579a.f94275a.m93347g(), (Map) null, new Function0() { // from class: rp.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC44151k0.m97295Q0(this.f97500b);
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m97294Q(AbstractC44151k0 abstractC44151k0) {
        IQuoteFacadeService.f41383a.get().m50686M(abstractC44151k0.getF97488d());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q0 */
    public static final Unit m97295Q0(AbstractC44151k0 abstractC44151k0) {
        Context context = abstractC44151k0.f97485a.getContext();
        if (context != null) {
            IAssetsCenterService.f16464a.get().mo15348n(context, AccountType.LEVER);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U */
    public static final Unit m97297U(SymbolInfoEntity symbolInfoEntity, AbstractC44151k0 abstractC44151k0) {
        InterfaceC37756h.a.m85144b(C37304a.f82764a, symbolInfoEntity.getQuoteCurrency(), symbolInfoEntity.getCode(), "borrow", abstractC44151k0.mo97346F0(), C43852m.m96601m(abstractC44151k0.mo97359S0(), "borrowButton", "1"), null, null, 96, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X0 */
    public static final void m97300X0(String str, View view) {
        Router.f46192a.m56184f(C27041f.m66668h(str)).m4048k();
    }

    /* JADX INFO: renamed from: g0 */
    public static final Unit m97313g0(AbstractC44151k0 abstractC44151k0, Throwable th2) {
        if ((th2 instanceof ApiException) && Intrinsics.areEqual(((ApiException) th2).code, "420000")) {
            ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.rank_fav_limit, 150), new Object[0]);
        }
        abstractC44151k0.m97366Y0();
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i0 */
    public static final Unit m97317i0() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j0 */
    public static final Unit m97319j0(AbstractC44151k0 abstractC44151k0, boolean z11) {
        if (z11) {
            ToastCompat.m66441G(abstractC44151k0.m97357R0(C45612b.m100697c(abstractC44151k0.getF97488d()) ? R$string.cancel_favor_ok : R$string.add_favorites_ok), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n0 */
    public static final Unit m97325n0(AbstractC44151k0 abstractC44151k0) {
        C24271s1.m58531c(Router.f46192a.m56184f("lever/target/lend").m4038a("marginType", abstractC44151k0.mo97377w0()).m4038a("marginSymbol", abstractC44151k0.getF97488d().getSymbol()), C43852m.m96601m(abstractC44151k0.mo97359S0(), "InterestFreeCouponButton", "1")).m4048k();
        LeverGiftView leverGiftViewM86317b = C38236a.f85935a.m86317b();
        if (leverGiftViewM86317b != null) {
            leverGiftViewM86317b.m40688j("interest");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p0 */
    public static final void m97328p0(Integer num, BaseQuickAdapter baseQuickAdapter) {
        C42290a.f93780a.m92822a();
    }

    /* JADX INFO: renamed from: s0 */
    public static final Unit m97333s0(AbstractC44151k0 abstractC44151k0) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, HostManager.a.m() + "/account/vouchers?appNeedLang=true&&needLogin=true", null, 2L, null, C43852m.m96601m(abstractC44151k0.mo97359S0(), "marginBonusButton", "1"), null, null, 106, null);
        LeverGiftView leverGiftViewM86317b = C38236a.f85935a.m86317b();
        if (leverGiftViewM86317b != null) {
            leverGiftViewM86317b.m40688j("bonus");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u0 */
    public static final void m97336u0(final AbstractC44151k0 abstractC44151k0, Integer num, BaseQuickAdapter baseQuickAdapter) {
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: rp.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC44151k0.m97338v0(this.f97501b);
            }
        }, 1, (Object) null);
    }

    @NotNull
    /* JADX INFO: renamed from: B0 */
    public final List<MenuItem> m97345B0() {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(m97374o0());
        arrayList.add(m97348J0());
        C24129b.m58033e(SiteVisibleConfigKey.LeverageIndex, new Function0() { // from class: rp.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC44151k0.m97277C0(arrayList, this);
            }
        });
        if (C4643e.f4176a.m4585g()) {
            arrayList.add(new MenuItem(109, R$drawable.ic2_trading_fee_level_20, m97357R0(R$string.kc_mortgage_priority), new BiConsumer() { // from class: rp.d
                @Override // io.reactivex.functions.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    AbstractC44151k0.m97281E0((Integer) obj, (BaseQuickAdapter) obj2);
                }
            }, Integer.valueOf(m97361V(R$color.c_text)), false, 32, null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: J0 */
    public final MenuItem m97348J0() {
        return new MenuItem(2, R$drawable.ic2_security_warning_20, m97357R0(R$string.margin_risk_limit), new BiConsumer() { // from class: rp.r
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC44151k0.m97289K0(this.f97496b, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m97361V(R$color.c_text)), false, 32, null);
    }

    /* JADX INFO: renamed from: K */
    public final void m97349K(final Function0<Unit> function0) {
        MarginConfigManager.f33681a.m39880Z(this.f97485a, new Function0() { // from class: rp.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC44151k0.m97290L(function0);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final SymbolInfoEntity m97351M() {
        SymbolInfoEntity symbolInfoEntity = this.f97488d.getSymbolInfoEntity();
        Intrinsics.checkNotNullExpressionValue(symbolInfoEntity, "getSymbolInfoEntity(...)");
        return symbolInfoEntity;
    }

    /* JADX INFO: renamed from: O */
    public final MenuItem m97354O() {
        return new MenuItem(106, m97353N(), m97357R0(R$string.alert), new BiConsumer() { // from class: rp.e
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC44151k0.m97292P(this.f97467b, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m97356R()), false, 32, null);
    }

    /* JADX INFO: renamed from: O0 */
    public final MenuItem m97355O0() {
        return new MenuItem(110, R$drawable.ic2_kcs_20, m97357R0(R$string.small_asset_exchange), new BiConsumer() { // from class: rp.h
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC44151k0.m97293P0(this.f97474b, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m97361V(R$color.c_text)), false, 32, null);
    }

    /* JADX INFO: renamed from: R0 */
    public final String m97357R0(@StringRes int i11) {
        String string = this.f97485a.getString(i11);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: T0 */
    public final MenuItem m97360T0() {
        return new MenuItem(101, !m97364X() ? R$drawable.ic2_trade_vertical_20 : R$drawable.ic2_trade_horizontal_20, m97357R0(!m97364X() ? R$string.vertical_order : R$string.language_horizontal), new BiConsumer() { // from class: rp.b
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC44151k0.m97298U0(this.f97460b, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m97361V(R$color.c_text)), false, 32, null);
    }

    /* JADX INFO: renamed from: V */
    public final int m97361V(int i11) {
        return this.f97485a.getColorRes(i11);
    }

    /* JADX INFO: renamed from: V0 */
    public final MenuItem m97362V0() {
        return new MenuItem(102, R$drawable.ic2_trading_fee_level_20, m97357R0(R$string.trade_rate), new BiConsumer() { // from class: rp.e0
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC44151k0.m97299W0(this.f97468b, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m97361V(R$color.c_text)), false, 32, null);
    }

    /* JADX INFO: renamed from: W, reason: from getter */
    public final TradeItemBean getF97488d() {
        return this.f97488d;
    }

    /* JADX INFO: renamed from: X */
    public boolean m97364X() {
        return C37878b0.f85252a.m85527h(mo97371b1());
    }

    /* JADX INFO: renamed from: Y */
    public final MenuItem m97365Y() {
        return new MenuItem(111, R$drawable.ic2_customer_service_20, m97357R0(R$string.help_center), new BiConsumer() { // from class: rp.f0
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC44151k0.m97301Z(this.f97470b, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m97361V(R$color.c_text)), false, 32, null);
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m97366Y0() {
        BaseFragment.hideLoadingDialog$default(this.f97485a, false, 1, null);
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m97367Z0() {
        this.f97485a.showLoadingDialog();
    }

    /* JADX INFO: renamed from: a1 */
    public void m97369a1(@Nullable SpannableStringBuilder spannableStringBuilder, @NotNull String feeContent) {
        Intrinsics.checkNotNullParameter(feeContent, "feeContent");
        AlertDialogFragmentHelper alertDialogFragmentHelperM54168Y4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(m97357R0(R$string.trade_rate));
        CharSequence charSequence = spannableStringBuilder;
        if (spannableStringBuilder == null) {
            charSequence = feeContent;
        }
        alertDialogFragmentHelperM54168Y4.m54156M4(charSequence).m54162S4(R$string.i_already_know, null).m54172c5(this.f97485a.getChildFragmentManager());
    }

    /* JADX INFO: renamed from: b0 */
    public final MenuItem m97370b0() {
        return new MenuItem(100, m97368a0(), m97357R0(R$string.favorites), new BiConsumer() { // from class: rp.i0
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC44151k0.m97305c0(this.f97477b, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m97372k0()), false, 32, null);
    }

    /* JADX INFO: renamed from: l0 */
    public final MenuItem m97373l0() {
        int i11 = R$drawable.ic2_coupons_20;
        String strM97357R0 = m97357R0(R$string.interest_free_coupon);
        BiConsumer biConsumer = new BiConsumer() { // from class: rp.g0
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC44151k0.m97323m0(this.f97473b, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        };
        Integer numValueOf = Integer.valueOf(m97361V(R$color.c_text));
        LeverGiftView leverGiftViewM86317b = C38236a.f85935a.m86317b();
        return new MenuItem(103, i11, strM97357R0, biConsumer, numValueOf, C27025c.m66566d(leverGiftViewM86317b != null ? Boolean.valueOf(leverGiftViewM86317b.m40687i("interest")) : null));
    }

    /* JADX INFO: renamed from: o0 */
    public final MenuItem m97374o0() {
        return new MenuItem(108, R$drawable.ic2_lending_rate_20, m97357R0(R$string.margin_lending_data_rate), new BiConsumer() { // from class: rp.y
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC44151k0.m97328p0((Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m97361V(R$color.c_text)), false, 32, null);
    }

    /* JADX INFO: renamed from: q0 */
    public final MenuItem m97375q0() {
        int i11 = R$drawable.ic2_bonus_20;
        String strM97357R0 = m97357R0(R$string.margin_bonus);
        BiConsumer biConsumer = new BiConsumer() { // from class: rp.f
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC44151k0.m97331r0(this.f97469b, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        };
        Integer numValueOf = Integer.valueOf(m97361V(R$color.c_text));
        LeverGiftView leverGiftViewM86317b = C38236a.f85935a.m86317b();
        return new MenuItem(104, i11, strM97357R0, biConsumer, numValueOf, C27025c.m66566d(leverGiftViewM86317b != null ? Boolean.valueOf(leverGiftViewM86317b.m40687i("bonus")) : null));
    }

    /* JADX INFO: renamed from: t0 */
    public final MenuItem m97376t0() {
        return new MenuItem(200, R$drawable.ic2_asset_overview_20, C27017c.f54310a.m66516f(com.kubi.tradecorebiz.R$string.margin_pnl_analyze, new Object[0]), new BiConsumer() { // from class: rp.h0
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC44151k0.m97336u0(this.f97475b, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m97361V(R$color.c_text)), false, 32, null);
    }

    @NotNull
    /* JADX INFO: renamed from: x0 */
    public final List<MenuItem> m97378x0() {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(m97358S());
        arrayList.add(m97347G0());
        arrayList.add(m97362V0());
        arrayList.add(m97360T0());
        arrayList.add(m97365Y());
        arrayList.add(m97370b0());
        C24129b.m58033e(SiteVisibleConfigKey.MarginLend, new Function0() { // from class: rp.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC44151k0.m97342y0(arrayList, this);
            }
        });
        arrayList.add(m97354O());
        C24129b.m58033e(SiteVisibleConfigKey.MarginBonus, new Function0() { // from class: rp.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC44151k0.m97344z0(arrayList, this);
            }
        });
        C24129b.m58033e(SiteVisibleConfigKey.MarginKcsConvert, new Function0() { // from class: rp.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC44151k0.m97274A0(arrayList, this);
            }
        });
        arrayList.add(m97352M0(mo97371b1()));
        if (C11351z0.m20196k()) {
            arrayList.add(m97376t0());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: A0 */
    public static final Unit m97274A0(List list, AbstractC44151k0 abstractC44151k0) {
        list.add(abstractC44151k0.m97355O0());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H0 */
    public static final void m97285H0(final AbstractC44151k0 abstractC44151k0, final SymbolInfoEntity symbolInfoEntity, Integer num, BaseQuickAdapter baseQuickAdapter) {
        C43852m.m96591c(abstractC44151k0.mo97359S0(), "repayButton", "1", null, 8, null);
        abstractC44151k0.m97349K(new Function0() { // from class: rp.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC44151k0.m97287I0(symbolInfoEntity, abstractC44151k0);
            }
        });
    }

    /* JADX INFO: renamed from: K0 */
    public static final void m97289K0(AbstractC44151k0 abstractC44151k0, Integer num, BaseQuickAdapter baseQuickAdapter) {
        C43852m.m96591c(abstractC44151k0.mo97359S0(), "riskLimitButton", "1", null, 8, null);
        if (C4643e.f4176a.m4586h()) {
            C42290a.f93780a.m92823b(abstractC44151k0.mo97371b1());
        } else {
            InterfaceC37766r.a.m85190a(C37304a.f82764a, abstractC44151k0.mo97350L0(), null, null, null, null, null, null, 126, null);
        }
    }

    /* JADX INFO: renamed from: L */
    public static final Unit m97290L(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T */
    public static final void m97296T(final AbstractC44151k0 abstractC44151k0, final SymbolInfoEntity symbolInfoEntity, Integer num, BaseQuickAdapter baseQuickAdapter) {
        C43852m.m96591c(abstractC44151k0.mo97359S0(), "borrowButton", "1", null, 8, null);
        abstractC44151k0.m97349K(new Function0() { // from class: rp.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC44151k0.m97297U(symbolInfoEntity, abstractC44151k0);
            }
        });
    }

    /* JADX INFO: renamed from: U0 */
    public static final void m97298U0(AbstractC44151k0 abstractC44151k0, Integer num, BaseQuickAdapter baseQuickAdapter) {
        C43852m.m96591c(abstractC44151k0.mo97359S0(), "horizontalButton", "1", null, 8, null);
        Intrinsics.checkNotNull(num);
        MenuItem menuItem = (MenuItem) baseQuickAdapter.getItem(num.intValue());
        if (!abstractC44151k0.m97364X()) {
            if (menuItem != null) {
                menuItem.m54365i(abstractC44151k0.m97357R0(R$string.language_horizontal));
            }
            if (menuItem != null) {
                menuItem.m54364h(R$drawable.ic2_trade_horizontal_20);
            }
            baseQuickAdapter.notifyItemChanged(num.intValue());
            C37878b0.f85252a.m85537r(abstractC44151k0.mo97371b1(), true);
        } else {
            if (menuItem != null) {
                menuItem.m54365i(abstractC44151k0.m97357R0(R$string.vertical_order));
            }
            if (menuItem != null) {
                menuItem.m54364h(R$drawable.ic2_trade_vertical_20);
            }
            baseQuickAdapter.notifyItemChanged(num.intValue());
            C37878b0.f85252a.m85537r(abstractC44151k0.mo97371b1(), false);
        }
        abstractC44151k0.f97486b.B5(true);
    }

    /* JADX INFO: renamed from: Z */
    public static final void m97301Z(AbstractC44151k0 abstractC44151k0, Integer num, BaseQuickAdapter baseQuickAdapter) {
        String str;
        C43852m.m96591c(abstractC44151k0.mo97359S0(), "tutorialButton", "1", null, 8, null);
        C37304a c37304a = C37304a.f82764a;
        if (abstractC44151k0.mo97371b1() == 2) {
            str = InterfaceC46306g.f103879f;
        } else {
            str = InterfaceC46306g.f103878e;
        }
        String str2 = str;
        Intrinsics.checkNotNull(str2);
        InterfaceC37766r.a.m85190a(c37304a, str2, null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: c0 */
    public static final void m97305c0(final AbstractC44151k0 abstractC44151k0, final Integer num, final BaseQuickAdapter baseQuickAdapter) {
        Intrinsics.checkNotNull(num);
        final MenuItem menuItem = (MenuItem) baseQuickAdapter.getItem(num.intValue());
        C42579a c42579a = C42579a.f94275a;
        if (c42579a.m93347g().c()) {
            C43839s c43839s = abstractC44151k0.f97489e;
            String symbol = abstractC44151k0.getF97488d().getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
            Observable<Object> observableM96541c = c43839s.m96541c(symbol);
            final Function1 function1 = new Function1() { // from class: rp.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC44151k0.m97307d0(this.f97476b, (Disposable) obj);
                }
            };
            Observable<Object> observableDoOnSubscribe = observableM96541c.doOnSubscribe(new Consumer() { // from class: rp.j
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AbstractC44151k0.m97309e0(function1, obj);
                }
            });
            Consumer<? super Object> consumer = new Consumer() { // from class: rp.k
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AbstractC44151k0.m97311f0(this.f97481b, menuItem, baseQuickAdapter, num, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: rp.m
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC44151k0.m97313g0(this.f97492b, (Throwable) obj);
                }
            };
            Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(consumer, new Consumer() { // from class: rp.n
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AbstractC44151k0.m97315h0(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, abstractC44151k0.f97487c);
            return;
        }
        if (!TextUtils.isEmpty(c42579a.m93347g().d0().id) && c42579a.m93347g().o()) {
            IUserService.O(c42579a.m93347g(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: rp.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbstractC44151k0.m97317i0();
                }
            }), 1, (Object) null);
            return;
        }
        if (!C45612b.m100697c(abstractC44151k0.getF97488d())) {
            C43852m.m96590b(abstractC44151k0.mo97359S0(), "favoritesButton", "1", TuplesKt.m90091to("symbol", abstractC44151k0.getF97488d().getSymbol()));
        }
        c42579a.m93345e().mo50678C(abstractC44151k0.getF97488d(), new Function1() { // from class: rp.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC44151k0.m97319j0(this.f97494b, ((Boolean) obj).booleanValue());
            }
        });
        if (menuItem != null) {
            menuItem.m54364h(abstractC44151k0.m97368a0());
        }
        if (menuItem != null) {
            menuItem.m54366j(Integer.valueOf(abstractC44151k0.m97372k0()));
        }
        baseQuickAdapter.notifyItemChanged(num.intValue());
    }

    /* JADX INFO: renamed from: d0 */
    public static final Unit m97307d0(AbstractC44151k0 abstractC44151k0, Disposable disposable) {
        abstractC44151k0.m97367Z0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e0 */
    public static final void m97309e0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m97311f0(AbstractC44151k0 abstractC44151k0, MenuItem menuItem, BaseQuickAdapter baseQuickAdapter, Integer num, Object obj) {
        int i11;
        if (!C45612b.m100697c(abstractC44151k0.getF97488d())) {
            C43852m.m96590b(abstractC44151k0.mo97359S0(), "favoritesButton", "1", TuplesKt.m90091to("symbol", abstractC44151k0.getF97488d().getSymbol()));
        }
        abstractC44151k0.m97366Y0();
        if (C45612b.m100697c(abstractC44151k0.getF97488d())) {
            i11 = R$string.cancel_favor_ok;
        } else {
            i11 = R$string.add_favorites_ok;
        }
        ToastCompat.m66441G(abstractC44151k0.m97357R0(i11), new Object[0]);
        abstractC44151k0.getF97488d().setFavor(!C45612b.m100697c(abstractC44151k0.getF97488d()));
        if (menuItem != null) {
            menuItem.m54364h(abstractC44151k0.m97368a0());
        }
        if (menuItem != null) {
            menuItem.m54366j(Integer.valueOf(abstractC44151k0.m97372k0()));
        }
        Intrinsics.checkNotNull(num);
        baseQuickAdapter.notifyItemChanged(num.intValue());
    }

    /* JADX INFO: renamed from: h0 */
    public static final void m97315h0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m0 */
    public static final void m97323m0(final AbstractC44151k0 abstractC44151k0, Integer num, BaseQuickAdapter baseQuickAdapter) {
        C43852m.m96591c(abstractC44151k0.mo97359S0(), "InterestFreeCouponButton", "1", null, 8, null);
        IUserService.O(C42579a.f94275a.m93347g(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: rp.t
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC44151k0.m97325n0(this.f97499b);
            }
        }), 1, (Object) null);
    }

    /* JADX INFO: renamed from: r0 */
    public static final void m97331r0(final AbstractC44151k0 abstractC44151k0, Integer num, BaseQuickAdapter baseQuickAdapter) {
        C43852m.m96591c(abstractC44151k0.mo97359S0(), "marginBonusButton", "1", null, 8, null);
        IUserService.O(C42579a.f94275a.m93347g(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: rp.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC44151k0.m97333s0(this.f97504b);
            }
        }), 1, (Object) null);
    }

    /* JADX INFO: renamed from: v0 */
    public static final Unit m97338v0(AbstractC44151k0 abstractC44151k0) {
        String strM20189d;
        if (abstractC44151k0.mo97371b1() == 2) {
            strM20189d = C11351z0.m20191f();
        } else {
            strM20189d = C11351z0.m20189d();
        }
        Router.f46192a.m56184f(C11351z0.m20186a() + strM20189d).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y0 */
    public static final Unit m97342y0(List list, AbstractC44151k0 abstractC44151k0) {
        list.add(abstractC44151k0.m97373l0());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z0 */
    public static final Unit m97344z0(List list, AbstractC44151k0 abstractC44151k0) {
        list.add(abstractC44151k0.m97375q0());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G0 */
    public final MenuItem m97347G0() {
        final SymbolInfoEntity symbolInfoEntity = getF97488d().getSymbolInfoEntity();
        return new MenuItem(1, R$drawable.ic2_repay_20, m97357R0(R$string.repay_coin), new BiConsumer() { // from class: rp.d0
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC44151k0.m97285H0(this.f97465b, symbolInfoEntity, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m97361V(R$color.c_text)), false, 32, null);
    }

    /* JADX INFO: renamed from: N */
    public final int m97353N() {
        if (getF97488d().isAlarm()) {
            return R$drawable.ic2_alert_select_20;
        }
        return R$drawable.ic2_alert_unselect_20;
    }

    /* JADX INFO: renamed from: R */
    public final int m97356R() {
        int i11;
        if (getF97488d().isAlarm()) {
            i11 = R$color.complementary;
        } else {
            i11 = R$color.c_text;
        }
        return m97361V(i11);
    }

    /* JADX INFO: renamed from: S */
    public final MenuItem m97358S() {
        final SymbolInfoEntity symbolInfoEntity = getF97488d().getSymbolInfoEntity();
        return new MenuItem(0, R$drawable.ic2_borrow_20, m97357R0(R$string.lever_borrow_coin), new BiConsumer() { // from class: rp.j0
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC44151k0.m97296T(this.f97479b, symbolInfoEntity, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m97361V(R$color.c_text)), false, 32, null);
    }

    /* JADX INFO: renamed from: a0 */
    public final int m97368a0() {
        if (C45612b.m100697c(getF97488d())) {
            return R$drawable.ic2_favorite_select_20;
        }
        return R$drawable.ic2_favorite_unselect_20;
    }

    /* JADX INFO: renamed from: k0 */
    public final int m97372k0() {
        int i11;
        if (C45612b.m100697c(getF97488d())) {
            i11 = R$color.complementary;
        } else {
            i11 = R$color.c_text;
        }
        return m97361V(i11);
    }
}
