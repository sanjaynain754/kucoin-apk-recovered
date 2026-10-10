package ae;

import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.StringRes;
import com.blankj.utilcode.util.SpanUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.reflect.TypeToken;
import com.kubi.assets.C11351z0;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.core.base.quote.inner.SymbolFavOrCancelHandler;
import com.kubi.core.biz.coupon.UnifiedCouponRouter;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.host.HostManager;
import com.kubi.margin.api.IMarginService;
import com.kubi.margin.api.entity.FeeEntity;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.resources.MenuItem;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.spot.api.ISpotCommonService;
import com.kubi.tradecorebiz.R$color;
import com.kubi.tradecorebiz.R$drawable;
import com.kubi.tradecorebiz.R$string;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27017c;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import ee.C37136a;
import f00.C37304a;
import g00.InterfaceC37753e;
import g00.InterfaceC37756h;
import g00.InterfaceC37766r;
import gd.C37869b;
import gf.C37878b0;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.reactivex.functions.BiConsumer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p260fd.Request;
import p260fd.Response;
import p261fe.C37437a;
import p309hd.InterfaceC38170b;
import p429lf.C42180b;
import p569qq.C43846g;
import p569qq.C43852m;
import p830zf.InterfaceC46809l0;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: ae.r */
/* JADX INFO: compiled from: MarginMoreItemsProvider.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u001f\u001a\u00020 H\u0014J\u0010\u0010!\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\"\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010#\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010$\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010%\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010&\u001a\u00020\u0015H\u0002J\b\u0010'\u001a\u00020\u0015H\u0002J\u0010\u0010(\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010)\u001a\u00020\u00112\b\b\u0001\u0010*\u001a\u00020\u0015H\u0002J\u001a\u0010+\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010,\u001a\u00020\u0015H\u0002J\b\u0010-\u001a\u00020\u0003H\u0002J\u0010\u0010.\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0016\u0010/\u001a\u00020\u000e2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000e01H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, m90084d2 = {"Lcom/kubi/core/biz/symbolbarold/menu/MarginMoreItemsProvider;", "", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "<init>", "(Lcom/kubi/data/entity/TradeItemBean;)V", "getMenuItems", "", "Lcom/kubi/resources/MenuItem;", "baseFragment", "Lcom/kubi/sdk/BaseFragment;", "tradeTypeToggleChangeListener", "Lcom/kubi/core/biz/symbolbarold/menu/MenuItemsProvider$TradeTypeToggleChangeListener;", "setTradeTypeToggleChangeListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "getPositionType", "", "getRiskUrl", "getTrackPageId", "tradeType", "", "getMarginType", "getFAQMenuItem", "getBorrowMenuItem", "getRepayMenuItem", "getTradeRateMenuItem", "getLendingRateMenuItem", "getInterestFreeCouponMenuItem", "getRiskLimitMenuItem", "getTradeOrientationMenuItem", "getCurrentTradeTypeVertical", "", "getFavoriteMenuItem", "getAlertMenuItem", "getSettingMenuItem", "getSmallAssetExchangeMenuItem", "getFavoriteTintColor", "getFavoriteIcon", "getAlertIcon", "getAlertTint", "getString", "resId", "getColorRes", "color", "getCurrentSymbol", "createPnlMenuItem", "checkOpenMarginWithRedirect", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function0;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginMoreItemsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginMoreItemsProvider.kt\ncom/kubi/core/biz/symbolbarold/menu/MarginMoreItemsProvider\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 4 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,493:1\n35#2,4:494\n39#2:500\n44#3,2:498\n17#4,2:501\n*S KotlinDebug\n*F\n+ 1 MarginMoreItemsProvider.kt\ncom/kubi/core/biz/symbolbarold/menu/MarginMoreItemsProvider\n*L\n73#1:494,4\n73#1:500\n73#1:498,2\n200#1:501,2\n*E\n"})
public final class C0276r {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final TradeItemBean f750a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public C0285v0.a f751b;

    /* JADX INFO: renamed from: ae.r$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: Z */
    public static final boolean m890Z() {
        return true;
    }

    public C0276r(@NotNull TradeItemBean tradeItemBean) {
        Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
        this.f750a = tradeItemBean;
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ int m878A(C0276r c0276r, BaseFragment baseFragment, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = R$color.c_text;
        }
        return c0276r.m931z(baseFragment, i11);
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m881H(C0276r c0276r, MenuItem menuItem, BaseFragment baseFragment, BaseQuickAdapter baseQuickAdapter, Integer num, Response it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getIsSuccess()) {
            ToastCompat.m66441G(!C37869b.m85487a(c0276r.f750a) ? C27017c.f54310a.m66516f(R$string.add_favorites_ok, new Object[0]) : C27017c.f54310a.m66516f(R$string.cancel_favor_ok, new Object[0]), new Object[0]);
            TradeItemBean tradeItemBean = c0276r.f750a;
            tradeItemBean.setFavor(!C37869b.m85487a(tradeItemBean));
            if (menuItem != null) {
                menuItem.m54364h(c0276r.m915E());
            }
            if (menuItem != null) {
                menuItem.m54366j(Integer.valueOf(c0276r.m917K(baseFragment)));
            }
            Intrinsics.checkNotNull(num);
            baseQuickAdapter.notifyItemChanged(num.intValue());
        }
        BaseFragment.hideLoadingDialog$default(baseFragment, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m882I() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public static final Unit m883J(C0276r c0276r, boolean z11) {
        if (z11) {
            ToastCompat.m66441G(C37869b.m85487a(c0276r.f750a) ? C27017c.f54310a.m66516f(R$string.cancel_favor_ok, new Object[0]) : C27017c.f54310a.m66516f(R$string.add_favorites_ok, new Object[0]), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M */
    public static final void m884M(final C0276r c0276r, Integer num, BaseQuickAdapter baseQuickAdapter) {
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: ae.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C0276r.m885N(this.f749b);
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: renamed from: N */
    public static final Unit m885N(C0276r c0276r) {
        UnifiedCouponRouter.f20385a.m21734b(2, c0276r.getF750a().getSymbolInfoEntity().getCode());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P */
    public static final void m886P(Integer num, BaseQuickAdapter baseQuickAdapter) {
        C37304a c37304a = C37304a.f82764a;
        String strDecode = Uri.decode(HostManager.a.m() + "/margin-data/loan-rates?appNeedLang=true&loading=2");
        Intrinsics.checkNotNullExpressionValue(strDecode, "decode(...)");
        InterfaceC37766r.a.m85190a(c37304a, strDecode, null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: S */
    public static final void m887S(C0276r c0276r, Integer num, BaseQuickAdapter baseQuickAdapter) {
        InterfaceC37756h.a.m85148f(C37304a.f82764a, false, null, C43852m.m96601m(c0276r.m923U(), "uta_margin", "1"), null, null, 27, null);
    }

    /* JADX INFO: renamed from: Y */
    public static final void m889Y(C0276r c0276r, BaseFragment baseFragment, Integer num, BaseQuickAdapter baseQuickAdapter) {
        int i11;
        IMarginService iMarginServiceM83062a = C37136a.f82407a.m83062a();
        SymbolInfoEntity symbolInfoEntity = c0276r.f750a.getSymbolInfoEntity();
        Intrinsics.checkNotNullExpressionValue(symbolInfoEntity, "getSymbolInfoEntity(...)");
        FeeEntity feeEntityMo37947m0 = iMarginServiceM83062a.mo37947m0(symbolInfoEntity);
        C27017c c27017c = C27017c.f54310a;
        String strM66516f = c27017c.m66516f(R$string.trade_rate_tip_1, c0276r.f750a.getShowSymbol(), (char) 8237 + C42180b.m92642g(new BigDecimal(String.valueOf(c0276r.f750a.getSymbolInfoEntity().getTakerFeeRate())), null, null, 20, false, false, false, 27, null) + (char) 8236, (char) 8237 + C42180b.m92642g(new BigDecimal(String.valueOf(c0276r.f750a.getSymbolInfoEntity().getMakerFeeRate())), null, null, 20, false, false, false, 27, null) + (char) 8236);
        int i12 = R$string.trade_rate_tip_2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Lv ");
        IUserService.Companion companion = IUserService.a;
        sb2.append(companion.get().d0().getFeeLevel());
        String string = sb2.toString();
        String showSymbol = c0276r.f750a.getShowSymbol();
        StringBuilder sb3 = new StringBuilder();
        sb3.append((char) 8237);
        SymbolInfoEntity symbolInfoEntity2 = c0276r.f750a.getSymbolInfoEntity();
        Intrinsics.checkNotNullExpressionValue(symbolInfoEntity2, "getSymbolInfoEntity(...)");
        sb3.append(C42180b.m92642g(iMarginServiceM83062a.mo37956r(symbolInfoEntity2), null, null, 20, false, false, false, 27, null));
        sb3.append((char) 8236);
        String string2 = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append((char) 8237);
        SymbolInfoEntity symbolInfoEntity3 = c0276r.f750a.getSymbolInfoEntity();
        Intrinsics.checkNotNullExpressionValue(symbolInfoEntity3, "getSymbolInfoEntity(...)");
        sb4.append(C42180b.m92642g(iMarginServiceM83062a.mo37911J(symbolInfoEntity3), null, null, 20, false, false, false, 27, null));
        sb4.append((char) 8236);
        String strM66516f2 = c27017c.m66516f(i12, string, showSymbol, string2, sb4.toString());
        String str = strM66516f;
        if (companion.get().c() && ISpotCommonService.f49644a.get().mo59956B(new Function0() { // from class: ae.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C0276r.m890Z());
            }
        })) {
            str = strM66516f;
            str = strM66516f + "\n\n" + strM66516f2;
        }
        str = strM66516f;
        SpannableStringBuilder spannableStringBuilderM6097d = null;
        BigDecimal bigDecimalM66535e = DowngradeExKt.m66535e(feeEntityMo37947m0 != null ? feeEntityMo37947m0.getBuyTaxRate() : null, null, 1, null);
        BigDecimal bigDecimalM66535e2 = DowngradeExKt.m66535e(feeEntityMo37947m0 != null ? feeEntityMo37947m0.getSellTaxRate() : null, null, 1, null);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalM66535e.compareTo(bigDecimal) == 0 && bigDecimalM66535e2.compareTo(bigDecimal) == 0) {
            i11 = 0;
        } else {
            Object objM56186h = Router.f46192a.m56186h(InterfaceC46809l0.class, SiteInfoManager.f47913a.m58109c());
            if (objM56186h != null ? ((InterfaceC46809l0) objM56186h).mo102976a() : false) {
                i11 = 0;
                spannableStringBuilderM6097d = new SpanUtils().m6094a(str).m6094a("\n\n").m6094a(c27017c.m66516f(R$string.kc_eu_tax_tip, new Object[0])).m6097d();
            } else {
                SpanUtils spanUtilsM6094a = new SpanUtils().m6094a(str).m6094a("\n\n");
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str2 = String.format(c27017c.m66516f(R$string.kc_tax_pop_rate, new Object[0]), Arrays.copyOf(new Object[]{(char) 8237 + C42180b.m92642g(bigDecimalM66535e, null, null, 20, false, false, false, 27, null) + (char) 8236, (char) 8237 + C42180b.m92642g(bigDecimalM66535e2, null, null, 20, false, false, false, 27, null) + (char) 8236}, 2));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                SpanUtils spanUtilsM6094a2 = spanUtilsM6094a.m6094a(str2);
                final String complianceTaxHelpCenterUrl = feeEntityMo37947m0 != null ? feeEntityMo37947m0.getComplianceTaxHelpCenterUrl() : null;
                if (!TextUtils.isEmpty(complianceTaxHelpCenterUrl)) {
                    spanUtilsM6094a2 = spanUtilsM6094a2.m6098e(c27017c.m66512a(R$color.complementary), true, new View.OnClickListener() { // from class: ae.h
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C0276r.m892a0(complianceTaxHelpCenterUrl, view);
                        }
                    }).m6102i();
                }
                spannableStringBuilderM6097d = spanUtilsM6094a2.m6097d();
                i11 = 0;
            }
        }
        AlertDialogFragmentHelper alertDialogFragmentHelperM54168Y4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(c27017c.m66516f(R$string.trade_rate, new Object[i11]));
        CharSequence charSequence = str;
        if (spannableStringBuilderM6097d != null) {
            charSequence = spannableStringBuilderM6097d;
        }
        alertDialogFragmentHelperM54168Y4.m54156M4(charSequence).m54162S4(R$string.i_already_know, null).m54172c5(baseFragment.getChildFragmentManager());
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m892a0(String str, View view) {
        Router.f46192a.m56184f(C27041f.m66668h(str)).m4048k();
    }

    /* JADX INFO: renamed from: s */
    public static final void m909s(Integer num, BaseQuickAdapter baseQuickAdapter) {
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: ae.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C0276r.m910t();
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m910t() {
        Router.f46192a.m56184f(C11351z0.m20186a() + C11351z0.m20195j()).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final void m911w(final C0276r c0276r, Integer num, BaseQuickAdapter baseQuickAdapter) {
        IUserService.O(IUserService.a.get(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: ae.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C0276r.m912x(this.f719b);
            }
        }), 1, (Object) null);
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m912x(C0276r c0276r) {
        IQuoteFacadeService.f41383a.get().m50686M(c0276r.getF750a());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final TradeItemBean getF750a() {
        return this.f750a;
    }

    /* JADX INFO: renamed from: C */
    public final MenuItem m914C(BaseFragment baseFragment) {
        return new MenuItem(111, R$drawable.ic2_customer_service_20, m922T(R$string.help_center), new BiConsumer() { // from class: ae.o
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C0276r.m879D(this.f745b, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m878A(this, baseFragment, 0, 2, null)), false, 32, null);
    }

    /* JADX INFO: renamed from: F */
    public final MenuItem m916F(final BaseFragment baseFragment) {
        return new MenuItem(100, m915E(), C27017c.f54310a.m66516f(R$string.favorites, new Object[0]), new BiConsumer() { // from class: ae.j
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C0276r.m880G(baseFragment, this, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m917K(baseFragment)), false, 32, null);
    }

    /* JADX INFO: renamed from: K */
    public final int m917K(BaseFragment baseFragment) {
        return m931z(baseFragment, C37869b.m85487a(this.f750a) ? R$color.complementary : R$color.c_text);
    }

    /* JADX INFO: renamed from: L */
    public final MenuItem m918L(BaseFragment baseFragment) {
        return new MenuItem(109, R$drawable.ic2_coupons_20, m922T(R$string.interest_free_coupon), new BiConsumer() { // from class: ae.n
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C0276r.m884M(this.f741b, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m878A(this, baseFragment, 0, 2, null)), false, 32, null);
    }

    /* JADX INFO: renamed from: O */
    public final MenuItem m919O(BaseFragment baseFragment) {
        return new MenuItem(108, R$drawable.ic2_lending_rate_20, m922T(R$string.margin_lending_data_rate), new BiConsumer() { // from class: ae.a
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C0276r.m886P((Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m878A(this, baseFragment, 0, 2, null)), false, 32, null);
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final List<MenuItem> m920Q(@NotNull BaseFragment baseFragment) {
        Object objM20457a;
        Intrinsics.checkNotNullParameter(baseFragment, "baseFragment");
        List<MenuItem> listMutableListOf = CollectionsKt.mutableListOf(m925X(baseFragment), m919O(baseFragment), m918L(baseFragment), m924V(baseFragment), m914C(baseFragment), m916F(baseFragment), m929v(baseFragment), m921R(baseFragment));
        if (C11351z0.m20196k() && IUnifyAccountService.f53155a.get().mo64979C()) {
            try {
                RemoteConfig remoteConfig = RemoteConfig.f19636a;
                Type type = new a().getType();
                Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                objM20457a = RemoteConfig.m20457a("asset_uta_pnl", type);
            } catch (Throwable th2) {
                C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
                objM20457a = null;
            }
            if (C27025c.m66567e((Boolean) objM20457a, false)) {
                listMutableListOf.add(m927r(baseFragment));
            }
        }
        return listMutableListOf;
    }

    /* JADX INFO: renamed from: R */
    public final MenuItem m921R(BaseFragment baseFragment) {
        return new MenuItem(107, R$drawable.ic2_setting_20, C27017c.f54310a.m66516f(R$string.trade_setting, new Object[0]), new BiConsumer() { // from class: ae.l
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C0276r.m887S(this.f735b, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m878A(this, baseFragment, 0, 2, null)), false, 32, null);
    }

    /* JADX INFO: renamed from: T */
    public final String m922T(@StringRes int i11) {
        return C27017c.f54310a.m66516f(i11, new Object[0]);
    }

    /* JADX INFO: renamed from: U */
    public final String m923U() {
        return "B4tradingCross";
    }

    /* JADX INFO: renamed from: V */
    public final MenuItem m924V(BaseFragment baseFragment) {
        C37878b0 c37878b0 = C37878b0.f85252a;
        C37437a c37437a = C37437a.f83039a;
        return new MenuItem(101, !c37878b0.m85527h(c37437a.m84227a()) ? R$drawable.ic2_trade_vertical_20 : R$drawable.ic2_trade_horizontal_20, !c37878b0.m85527h(c37437a.m84227a()) ? C27017c.f54310a.m66516f(R$string.vertical_order, new Object[0]) : C27017c.f54310a.m66516f(R$string.language_horizontal, new Object[0]), new BiConsumer() { // from class: ae.i
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C0276r.m888W(this.f727b, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m878A(this, baseFragment, 0, 2, null)), false, 32, null);
    }

    /* JADX INFO: renamed from: X */
    public final MenuItem m925X(final BaseFragment baseFragment) {
        return new MenuItem(102, R$drawable.ic2_trading_fee_level_20, C27017c.f54310a.m66516f(R$string.trade_rate, new Object[0]), new BiConsumer() { // from class: ae.k
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C0276r.m889Y(this.f732b, baseFragment, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m878A(this, baseFragment, 0, 2, null)), false, 32, null);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m926b0(@NotNull C0285v0.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f751b = listener;
    }

    /* JADX INFO: renamed from: r */
    public final MenuItem m927r(BaseFragment baseFragment) {
        return new MenuItem(200, R$drawable.ic2_asset_overview_20, C27017c.f54310a.m66516f(R$string.spot_pnl_analyze, new Object[0]), new BiConsumer() { // from class: ae.p
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C0276r.m909s((Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m878A(this, baseFragment, 0, 2, null)), false, 32, null);
    }

    /* JADX INFO: renamed from: v */
    public final MenuItem m929v(BaseFragment baseFragment) {
        return new MenuItem(106, m928u(), m922T(R$string.alert), new BiConsumer() { // from class: ae.m
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C0276r.m911w(this.f738b, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m930y(baseFragment)), false, 32, null);
    }

    /* JADX INFO: renamed from: D */
    public static final void m879D(C0276r c0276r, Integer num, BaseQuickAdapter baseQuickAdapter) {
        C43852m.m96591c(c0276r.m923U(), "tutorialButton", "1", null, 8, null);
        InterfaceC37753e.a.m85128a(C37304a.f82764a, null, null, null, 7, null);
    }

    /* JADX INFO: renamed from: G */
    public static final void m880G(final BaseFragment baseFragment, final C0276r c0276r, final Integer num, final BaseQuickAdapter baseQuickAdapter) {
        Intrinsics.checkNotNull(num);
        final MenuItem menuItem = (MenuItem) baseQuickAdapter.getItem(num.intValue());
        IUserService.Companion companion = IUserService.a;
        if (companion.get().c()) {
            baseFragment.showLoadingDialog();
            SymbolFavOrCancelHandler symbolFavOrCancelHandler = new SymbolFavOrCancelHandler();
            String symbol = c0276r.f750a.getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
            symbolFavOrCancelHandler.mo21152a(new Request(symbol), baseFragment.getDestroyDisposable(), new Function1() { // from class: ae.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C0276r.m881H(this.f708b, menuItem, baseFragment, baseQuickAdapter, num, (Response) obj);
                }
            });
            return;
        }
        if (!TextUtils.isEmpty(companion.get().d0().id) && companion.get().o()) {
            IUserService.O((IUserService) Router.f46192a.m56192n(IUserService.class), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: ae.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C0276r.m882I();
                }
            }), 1, (Object) null);
            return;
        }
        IQuoteFacadeService.f41383a.get().mo50678C(c0276r.f750a, new Function1() { // from class: ae.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C0276r.m883J(this.f714b, ((Boolean) obj).booleanValue());
            }
        });
        if (menuItem != null) {
            menuItem.m54364h(c0276r.m915E());
        }
        if (menuItem != null) {
            menuItem.m54366j(Integer.valueOf(c0276r.m917K(baseFragment)));
        }
        baseQuickAdapter.notifyItemChanged(num.intValue());
    }

    /* JADX INFO: renamed from: W */
    public static final void m888W(C0276r c0276r, Integer num, BaseQuickAdapter baseQuickAdapter) {
        Intrinsics.checkNotNull(num);
        MenuItem menuItem = (MenuItem) baseQuickAdapter.getItem(num.intValue());
        C37878b0 c37878b0 = C37878b0.f85252a;
        C37437a c37437a = C37437a.f83039a;
        if (!c37878b0.m85527h(c37437a.m84227a())) {
            if (menuItem != null) {
                menuItem.m54365i(C27017c.f54310a.m66516f(R$string.language_horizontal, new Object[0]));
            }
            if (menuItem != null) {
                menuItem.m54364h(R$drawable.ic2_trade_horizontal_20);
            }
            baseQuickAdapter.notifyItemChanged(num.intValue());
            c37878b0.m85537r(c37437a.m84227a(), true);
            C0285v0.a aVar = c0276r.f751b;
            if (aVar != null) {
                aVar.mo1016a(InterfaceC38170b.b.f85867a);
                return;
            }
            return;
        }
        if (menuItem != null) {
            menuItem.m54365i(C27017c.f54310a.m66516f(R$string.vertical_order, new Object[0]));
        }
        if (menuItem != null) {
            menuItem.m54364h(R$drawable.ic2_trade_vertical_20);
        }
        baseQuickAdapter.notifyItemChanged(num.intValue());
        c37878b0.m85537r(c37437a.m84227a(), false);
        C0285v0.a aVar2 = c0276r.f751b;
        if (aVar2 != null) {
            aVar2.mo1016a(InterfaceC38170b.a.f85866a);
        }
    }

    /* JADX INFO: renamed from: E */
    public final int m915E() {
        if (C37869b.m85487a(getF750a())) {
            return R$drawable.ic2_favorite_select_20;
        }
        return R$drawable.ic2_favorite_unselect_20;
    }

    /* JADX INFO: renamed from: u */
    public final int m928u() {
        if (getF750a().isAlarm()) {
            return R$drawable.ic2_alert_select_20;
        }
        return R$drawable.ic2_alert_unselect_20;
    }

    /* JADX INFO: renamed from: y */
    public final int m930y(BaseFragment baseFragment) {
        int i11;
        if (getF750a().isAlarm()) {
            i11 = R$color.complementary;
        } else {
            i11 = R$color.c_text;
        }
        return m931z(baseFragment, i11);
    }

    /* JADX INFO: renamed from: z */
    public final int m931z(BaseFragment baseFragment, int i11) {
        return baseFragment.getColorRes(i11);
    }
}
