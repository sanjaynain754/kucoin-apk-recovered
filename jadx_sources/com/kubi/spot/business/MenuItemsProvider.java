package com.kubi.spot.business;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import com.blankj.utilcode.util.SpanUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.assets.C11351z0;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.data.coin.TransferJumper;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.margin.api.IMarginService;
import com.kubi.margin.api.entity.FeeEntity;
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
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.spot.BSpotApp;
import com.kubi.spot.R$color;
import com.kubi.spot.R$drawable;
import com.kubi.spot.R$string;
import com.kubi.spot.business.submit.TradeSubmitFragment;
import com.kubi.spot.helper.C25307a;
import com.kubi.spot.helper.TradeModel;
import com.kubi.spot.service.SpotDepend;
import com.kubi.tradingbotkit.api.ITradingBotService;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27017c;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import eg.InterfaceC37174b;
import f00.C37304a;
import f30.C37340k;
import g00.InterfaceC37753e;
import g00.InterfaceC37756h;
import g00.InterfaceC37758j;
import gf.C37878b0;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p402kf.C41016c;
import p429lf.C42180b;
import p569qq.C43846g;
import p569qq.C43852m;
import p830zf.InterfaceC46809l0;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.spot.business.h3, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MenuItemsProvider.kt */
/* JADX INFO: loaded from: classes47.dex */
@Deprecated(message = "废弃", replaceWith = @ReplaceWith(expression = "com.kubi.tradecorebiz.biz.menus.MenuItemsProviderV2", imports = {}))
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020\u0016H\u0002J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010!\u001a\u00020\u0016H\u0002J\b\u0010\"\u001a\u00020\u0016H\u0002J\b\u0010#\u001a\u00020\u0016H\u0002J\b\u0010$\u001a\u00020\u0016H\u0002J\b\u0010%\u001a\u00020\u0016H\u0002J\b\u0010&\u001a\u00020\u0016H\u0002J\b\u0010'\u001a\u00020\u0016H\u0002J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020)H\u0002J\b\u0010+\u001a\u00020)H\u0002J\b\u0010,\u001a\u00020)H\u0002J\b\u0010-\u001a\u00020)H\u0002J\u001c\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\n\b\u0002\u00102\u001a\u0004\u0018\u000103H\u0002J\u0010\u00104\u001a\u00020/2\u0006\u00105\u001a\u000201H\u0002J\u0012\u00106\u001a\u00020)2\b\b\u0002\u00107\u001a\u00020)H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u00068"}, m90084d2 = {"Lcom/kubi/spot/business/MenuItemsProvider;", "", "spotTradeFragment", "Lcom/kubi/spot/business/SpotTradeFragment;", "tradeSubmitFragment", "Lcom/kubi/spot/business/submit/TradeSubmitFragment;", "mTradeModel", "Lcom/kubi/spot/helper/TradeModel;", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "<init>", "(Lcom/kubi/spot/business/SpotTradeFragment;Lcom/kubi/spot/business/submit/TradeSubmitFragment;Lcom/kubi/spot/helper/TradeModel;Lcom/kubi/data/entity/TradeItemBean;)V", "getTradeItemBean", "()Lcom/kubi/data/entity/TradeItemBean;", "hasCoupons", "", "getHasCoupons", "()Z", "setHasCoupons", "(Z)V", "getMenuItems", "", "Lcom/kubi/resources/MenuItem;", "createFAQMenuItem", "createPnlMenuItem", "createDepositBaseCurrencyMenuItem", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "createTransferBaseCurrencyMenuItem", "createDepositQuoteCurrencyMenuItem", "createTransferQuoteCurrencyMenuItem", "createFiatBuyCryptoMenuItem", "createSymbolBaseInfoMenuItem", "createTradingBotMenuItem", "createTradingFeeMenuItem", "createCouponsMenuItem", "createTradeTypeToggleMenuItem", "createFavoriteMenuItem", "createAlertMenuItem", "createTradeSettingMenuItem", "getFlavorMoreShow", "", "getAlertIcon", "geAlertTintColor", "getFavoriteTintColor", "getFavoriteIcon", "trackMore", "", "locationId", "", ReportDataTable.COLUMN_PARAMS, "Lorg/json/JSONObject;", "trackDeposit", FirebaseAnalytics.Param.CURRENCY, "getColorRes", "color", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMenuItemsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuItemsProvider.kt\ncom/kubi/spot/business/MenuItemsProvider\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,583:1\n33#2:584\n17#2,2:585\n34#2,3:587\n17#2,2:597\n17#2,2:599\n17#2,2:601\n35#3,4:590\n39#3:596\n44#4,2:594\n*S KotlinDebug\n*F\n+ 1 MenuItemsProvider.kt\ncom/kubi/spot/business/MenuItemsProvider\n*L\n110#1:584\n110#1:585,2\n110#1:587,3\n552#1:597,2\n336#1:599,2\n345#1:601,2\n120#1:590,4\n120#1:596\n120#1:594,2\n*E\n"})
public final class MenuItemsProvider {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final SpotTradeFragment f50160a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final TradeSubmitFragment f50161b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final TradeModel f50162c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final TradeItemBean f50163d;

    /* JADX INFO: renamed from: e */
    public boolean f50164e;

    /* JADX INFO: renamed from: com.kubi.spot.business.h3$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: M */
    public static final void m61032M(MenuItemsProvider menuItemsProvider, SymbolInfoEntity symbolInfoEntity, Integer num, BaseQuickAdapter baseQuickAdapter) {
        m61031K0(menuItemsProvider, "2", null, 2, null);
        String baseCurrency = symbolInfoEntity.getBaseCurrency();
        Intrinsics.checkNotNullExpressionValue(baseCurrency, "getBaseCurrency(...)");
        menuItemsProvider.m61090I0(baseCurrency);
        C37340k.f82854a.m83929f(symbolInfoEntity.getBaseCurrency());
    }

    /* JADX INFO: renamed from: O */
    public static final void m61033O(MenuItemsProvider menuItemsProvider, SymbolInfoEntity symbolInfoEntity, Integer num, BaseQuickAdapter baseQuickAdapter) {
        m61031K0(menuItemsProvider, "2", null, 2, null);
        String quoteCurrency = symbolInfoEntity.getQuoteCurrency();
        Intrinsics.checkNotNullExpressionValue(quoteCurrency, "getQuoteCurrency(...)");
        menuItemsProvider.m61090I0(quoteCurrency);
        C37340k.f82854a.m83929f(symbolInfoEntity.getQuoteCurrency());
    }

    /* JADX INFO: renamed from: p0 */
    public static final void m61067p0(MenuItemsProvider menuItemsProvider, Integer num, BaseQuickAdapter baseQuickAdapter) {
        int i11;
        SpannableStringBuilder spannableStringBuilderM6097d;
        m61031K0(menuItemsProvider, "5", null, 2, null);
        IMarginService iMarginServiceM63033c = SpotDepend.f51244a.m63033c();
        SymbolInfoEntity symbolInfoEntity = menuItemsProvider.f50163d.getSymbolInfoEntity();
        Intrinsics.checkNotNullExpressionValue(symbolInfoEntity, "getSymbolInfoEntity(...)");
        FeeEntity feeEntityMo37947m0 = iMarginServiceM63033c.mo37947m0(symbolInfoEntity);
        C27017c c27017c = C27017c.f54310a;
        String strM66516f = c27017c.m66516f(R$string.trade_rate_tip_1, menuItemsProvider.f50163d.getShowSymbol(), (char) 8237 + C42180b.m92642g(new BigDecimal(String.valueOf(menuItemsProvider.f50163d.getSymbolInfoEntity().getTakerFeeRate())), null, null, 20, false, false, false, 27, null) + (char) 8236, (char) 8237 + C42180b.m92642g(new BigDecimal(String.valueOf(menuItemsProvider.f50163d.getSymbolInfoEntity().getMakerFeeRate())), null, null, 20, false, false, false, 27, null) + (char) 8236);
        int i12 = R$string.trade_rate_tip_2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Lv ");
        IUserService.Companion companion = IUserService.a;
        sb2.append(companion.get().d0().getFeeLevel());
        String string = sb2.toString();
        String showSymbol = menuItemsProvider.f50163d.getShowSymbol();
        StringBuilder sb3 = new StringBuilder();
        sb3.append((char) 8237);
        SymbolInfoEntity symbolInfoEntity2 = menuItemsProvider.f50163d.getSymbolInfoEntity();
        Intrinsics.checkNotNullExpressionValue(symbolInfoEntity2, "getSymbolInfoEntity(...)");
        sb3.append(C42180b.m92642g(iMarginServiceM63033c.mo37956r(symbolInfoEntity2), null, null, 20, false, false, false, 27, null));
        sb3.append((char) 8236);
        String string2 = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append((char) 8237);
        SymbolInfoEntity symbolInfoEntity3 = menuItemsProvider.f50163d.getSymbolInfoEntity();
        Intrinsics.checkNotNullExpressionValue(symbolInfoEntity3, "getSymbolInfoEntity(...)");
        sb4.append(C42180b.m92642g(iMarginServiceM63033c.mo37911J(symbolInfoEntity3), null, null, 20, false, false, false, 27, null));
        sb4.append((char) 8236);
        String strM66516f2 = c27017c.m66516f(i12, string, showSymbol, string2, sb4.toString());
        if (companion.get().c()) {
            Object objM56186h = Router.f46192a.m56186h(InterfaceC37174b.class, SiteInfoManager.f47913a.m58109c());
            if (objM56186h != null ? ((InterfaceC37174b) objM56186h).m83147g() : true) {
                strM66516f = strM66516f + "\n\n" + strM66516f2;
            }
        }
        BigDecimal bigDecimalM66535e = DowngradeExKt.m66535e(feeEntityMo37947m0 != null ? feeEntityMo37947m0.getBuyTaxRate() : null, null, 1, null);
        BigDecimal bigDecimalM66535e2 = DowngradeExKt.m66535e(feeEntityMo37947m0 != null ? feeEntityMo37947m0.getSellTaxRate() : null, null, 1, null);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalM66535e.compareTo(bigDecimal) == 0 && bigDecimalM66535e2.compareTo(bigDecimal) == 0) {
            spannableStringBuilderM6097d = null;
            i11 = 0;
        } else {
            Object objM56186h2 = Router.f46192a.m56186h(InterfaceC46809l0.class, SiteInfoManager.f47913a.m58109c());
            if (objM56186h2 != null ? ((InterfaceC46809l0) objM56186h2).mo102976a() : false) {
                i11 = 0;
                spannableStringBuilderM6097d = new SpanUtils().m6094a("\n\n").m6094a(c27017c.m66516f(R$string.kc_eu_tax_tip, new Object[0])).m6097d();
            } else {
                SpanUtils spanUtilsM6094a = new SpanUtils().m6094a(strM66516f).m6094a("\n\n");
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String strM66516f3 = c27017c.m66516f(R$string.kc_tax_pop_rate, new Object[0]);
                StringBuilder sb5 = new StringBuilder();
                sb5.append((char) 8237);
                i11 = 0;
                sb5.append(C42180b.m92642g(bigDecimalM66535e, null, null, 20, false, false, false, 27, null));
                sb5.append((char) 8236);
                String str = String.format(strM66516f3, Arrays.copyOf(new Object[]{sb5.toString(), (char) 8237 + C42180b.m92642g(bigDecimalM66535e2, null, null, 20, false, false, false, 27, null) + (char) 8236}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                SpanUtils spanUtilsM6094a2 = spanUtilsM6094a.m6094a(str);
                final String complianceTaxHelpCenterUrl = feeEntityMo37947m0 != null ? feeEntityMo37947m0.getComplianceTaxHelpCenterUrl() : null;
                if (!TextUtils.isEmpty(complianceTaxHelpCenterUrl)) {
                    spanUtilsM6094a2 = spanUtilsM6094a2.m6098e(c27017c.m66512a(R$color.complementary), true, new View.OnClickListener() { // from class: com.kubi.spot.business.m2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            MenuItemsProvider.m61069q0(complianceTaxHelpCenterUrl, view);
                        }
                    }).m6102i();
                }
                spannableStringBuilderM6097d = spanUtilsM6094a2.m6097d();
            }
        }
        AlertDialogFragmentHelper alertDialogFragmentHelperM54168Y4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(c27017c.m66516f(R$string.trade_rate, new Object[i11]));
        CharSequence charSequence = strM66516f;
        if (spannableStringBuilderM6097d != null) {
            charSequence = spannableStringBuilderM6097d;
        }
        alertDialogFragmentHelperM54168Y4.m54156M4(charSequence).m54162S4(R$string.i_already_know, null).m54172c5(menuItemsProvider.f50160a.getChildFragmentManager());
    }

    /* JADX INFO: renamed from: s0 */
    public static final void m61072s0(MenuItemsProvider menuItemsProvider, final SymbolInfoEntity symbolInfoEntity, Integer num, BaseQuickAdapter baseQuickAdapter) {
        m61031K0(menuItemsProvider, "4", null, 2, null);
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: com.kubi.spot.business.w2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MenuItemsProvider.m61074t0(symbolInfoEntity);
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: renamed from: v0 */
    public static final void m61077v0(MenuItemsProvider menuItemsProvider, final SymbolInfoEntity symbolInfoEntity, Integer num, BaseQuickAdapter baseQuickAdapter) {
        m61031K0(menuItemsProvider, "4", null, 2, null);
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: com.kubi.spot.business.k2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MenuItemsProvider.m61079w0(symbolInfoEntity);
            }
        }, 1, (Object) null);
    }

    public MenuItemsProvider(@NotNull SpotTradeFragment spotTradeFragment, @NotNull TradeSubmitFragment tradeSubmitFragment, @NotNull TradeModel mTradeModel, @NotNull TradeItemBean tradeItemBean) {
        Intrinsics.checkNotNullParameter(spotTradeFragment, "spotTradeFragment");
        Intrinsics.checkNotNullParameter(tradeSubmitFragment, "tradeSubmitFragment");
        Intrinsics.checkNotNullParameter(mTradeModel, "mTradeModel");
        Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
        this.f50160a = spotTradeFragment;
        this.f50161b = tradeSubmitFragment;
        this.f50162c = mTradeModel;
        this.f50163d = tradeItemBean;
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ int m61020A0(MenuItemsProvider menuItemsProvider, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = R$color.c_text;
        }
        return menuItemsProvider.m61107z0(i11);
    }

    /* JADX INFO: renamed from: G */
    public static final void m61026G(final MenuItemsProvider menuItemsProvider, Integer num, BaseQuickAdapter baseQuickAdapter) {
        IUserService.O(SpotDepend.f51244a.m63036f(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.spot.business.z2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MenuItemsProvider.m61028H(this.f50491b);
            }
        }), 1, (Object) null);
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m61028H(MenuItemsProvider menuItemsProvider) {
        IQuoteFacadeService.f41383a.get().mo50692S(menuItemsProvider.f50163d, IQuoteFacadeService.Companion.TRADE_TYPE_SPOT);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public static final void m61029J(final MenuItemsProvider menuItemsProvider, Integer num, BaseQuickAdapter baseQuickAdapter) {
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: com.kubi.spot.business.l2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MenuItemsProvider.m61030K(this.f50181b);
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m61030K(MenuItemsProvider menuItemsProvider) {
        String symbol = menuItemsProvider.f50163d.getSymbol();
        if (symbol != null) {
            BSpotApp.Companion.jumpToH5$default(BSpotApp.f49558a, "/land/fee_discount_coupons/" + symbol, null, false, 6, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ void m61031K0(MenuItemsProvider menuItemsProvider, String str, JSONObject jSONObject, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            jSONObject = null;
        }
        menuItemsProvider.m61091J0(str, jSONObject);
    }

    /* JADX INFO: renamed from: Q */
    public static final void m61034Q(Integer num, BaseQuickAdapter baseQuickAdapter) {
        InterfaceC37753e.a.m85128a(C37304a.f82764a, null, null, null, 7, null);
    }

    /* JADX INFO: renamed from: S */
    public static final void m61035S(final MenuItemsProvider menuItemsProvider, final Integer num, final BaseQuickAdapter baseQuickAdapter) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("symbol", menuItemsProvider.f50163d.getSymbol());
        Unit unit = Unit.INSTANCE;
        menuItemsProvider.m61091J0(TUIConstants.TUICustomerServicePlugin.BUSINESS_ID_SRC_CUSTOMER_SERVICE_SAY_HELLO, jSONObject);
        Intrinsics.checkNotNull(num);
        final MenuItem menuItem = (MenuItem) baseQuickAdapter.getItem(num.intValue());
        IUserService.Companion companion = IUserService.a;
        if (!companion.get().c()) {
            if (!TextUtils.isEmpty(companion.get().d0().id) && companion.get().o()) {
                IUserService.O((IUserService) Router.f46192a.m56192n(IUserService.class), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.spot.business.u2
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MenuItemsProvider.m61041Y();
                    }
                }), 1, (Object) null);
                return;
            }
            IQuoteFacadeService.f41383a.get().mo50678C(menuItemsProvider.f50163d, new Function1() { // from class: com.kubi.spot.business.v2
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MenuItemsProvider.m61042Z(this.f50476b, ((Boolean) obj).booleanValue());
                }
            });
            if (menuItem != null) {
                menuItem.m54364h(menuItemsProvider.m61083B0());
            }
            if (menuItem != null) {
                menuItem.m54366j(Integer.valueOf(menuItemsProvider.m61084C0()));
            }
            baseQuickAdapter.notifyItemChanged(num.intValue());
            return;
        }
        TradeModel tradeModel = menuItemsProvider.f50162c;
        String symbol = menuItemsProvider.f50163d.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        Observable<Object> observableM61849c = tradeModel.m61849c(symbol);
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.business.p2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MenuItemsProvider.m61036T(this.f50288b, (Disposable) obj);
            }
        };
        Observable<Object> observableDoOnSubscribe = observableM61849c.doOnSubscribe(new Consumer() { // from class: com.kubi.spot.business.q2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MenuItemsProvider.m61037U(function1, obj);
            }
        });
        Consumer<? super Object> consumer = new Consumer() { // from class: com.kubi.spot.business.r2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MenuItemsProvider.m61038V(this.f50297b, menuItem, baseQuickAdapter, num, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.business.s2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MenuItemsProvider.m61039W(this.f50302b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.business.t2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MenuItemsProvider.m61040X(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, menuItemsProvider.f50160a.getDestroyDisposable());
    }

    /* JADX INFO: renamed from: T */
    public static final Unit m61036T(MenuItemsProvider menuItemsProvider, Disposable disposable) {
        menuItemsProvider.f50160a.showLoadingDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V */
    public static final void m61038V(MenuItemsProvider menuItemsProvider, MenuItem menuItem, BaseQuickAdapter baseQuickAdapter, Integer num, Object obj) {
        BaseFragment.hideLoadingDialog$default(menuItemsProvider.f50160a, false, 1, null);
        ToastCompat.m66441G(C25307a.m61759a(menuItemsProvider.f50163d) ? C27017c.f54310a.m66516f(R$string.cancel_favor_ok, new Object[0]) : C27017c.f54310a.m66516f(R$string.add_favorites_ok, new Object[0]), new Object[0]);
        TradeItemBean tradeItemBean = menuItemsProvider.f50163d;
        tradeItemBean.setFavor(!C25307a.m61759a(tradeItemBean));
        if (menuItem != null) {
            menuItem.m54364h(menuItemsProvider.m61083B0());
        }
        if (menuItem != null) {
            menuItem.m54366j(Integer.valueOf(menuItemsProvider.m61084C0()));
        }
        Intrinsics.checkNotNull(num);
        baseQuickAdapter.notifyItemChanged(num.intValue());
    }

    /* JADX INFO: renamed from: W */
    public static final Unit m61039W(MenuItemsProvider menuItemsProvider, Throwable th2) {
        if ((th2 instanceof ApiException) && Intrinsics.areEqual(((ApiException) th2).code, "420000")) {
            ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.rank_fav_limit, 150), new Object[0]);
        }
        C44128b.m97263g("SpotTradeFragment", th2);
        BaseFragment.hideLoadingDialog$default(menuItemsProvider.f50160a, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y */
    public static final Unit m61041Y() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z */
    public static final Unit m61042Z(MenuItemsProvider menuItemsProvider, boolean z11) {
        if (z11) {
            ToastCompat.m66441G(C25307a.m61759a(menuItemsProvider.f50163d) ? C27017c.f54310a.m66516f(R$string.cancel_favor_ok, new Object[0]) : C27017c.f54310a.m66516f(R$string.add_favorites_ok, new Object[0]), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b0 */
    public static final void m61045b0(final MenuItemsProvider menuItemsProvider, Integer num, BaseQuickAdapter baseQuickAdapter) {
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: com.kubi.spot.business.x2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MenuItemsProvider.m61047c0(this.f50483b);
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: renamed from: c0 */
    public static final Unit m61047c0(MenuItemsProvider menuItemsProvider) {
        C43852m.m96590b("B5trading", "morePopup", "buyCryptoButton", TuplesKt.m90091to("after_page_id", "B7FastTrade"), TuplesKt.m90091to("norm_version", "1"), TuplesKt.m90091to("coin", menuItemsProvider.f50163d.getSymbolInfoEntity().getQuoteCurrency()));
        InterfaceC37758j.a.m85163l(C37304a.f82764a, null, C41016c.m89965c(), menuItemsProvider.f50163d.getSymbolInfoEntity().getQuoteCurrency(), null, null, null, null, 121, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e0 */
    public static final void m61050e0(Integer num, BaseQuickAdapter baseQuickAdapter) {
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: com.kubi.spot.business.o2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MenuItemsProvider.m61052f0();
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: renamed from: f0 */
    public static final Unit m61052f0() {
        String str;
        if (IUnifyAccountService.f53155a.get().mo64979C()) {
            str = C11351z0.m20186a() + C11351z0.m20195j();
        } else {
            str = C11351z0.m20186a() + C11351z0.m20192g();
        }
        Router.f46192a.m56184f(str).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h0 */
    public static final void m61055h0(SymbolInfoEntity symbolInfoEntity, Integer num, BaseQuickAdapter baseQuickAdapter) {
        C37340k.f82854a.m83930j(symbolInfoEntity);
    }

    /* JADX INFO: renamed from: j0 */
    public static final void m61058j0(Integer num, BaseQuickAdapter baseQuickAdapter) {
        InterfaceC37756h.a.m85148f(C37304a.f82764a, false, SearchCategory$Companion.SPOT, null, null, null, 28, null);
    }

    /* JADX INFO: renamed from: n0 */
    public static final void m61064n0(Integer num, BaseQuickAdapter baseQuickAdapter) {
        C43852m.m96591c("B5trading", "TradingBot", "8", null, 8, null);
        ITradingBotService.f52126a.get().mo63679c();
    }

    /* JADX INFO: renamed from: q0 */
    public static final void m61069q0(String str, View view) {
        Router.f46192a.m56184f(C27041f.m66668h(str)).m4048k();
    }

    /* JADX INFO: renamed from: t0 */
    public static final Unit m61074t0(SymbolInfoEntity symbolInfoEntity) {
        TransferJumper.Companion.jumpToTransfer$default(TransferJumper.f21427a, symbolInfoEntity.getBaseCurrency(), null, null, "MAIN", "TRADE", false, null, 102, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w0 */
    public static final Unit m61079w0(SymbolInfoEntity symbolInfoEntity) {
        TransferJumper.Companion.jumpToTransfer$default(TransferJumper.f21427a, symbolInfoEntity.getQuoteCurrency(), null, null, "MAIN", "TRADE", false, null, 102, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B0 */
    public final int m61083B0() {
        return C25307a.m61759a(this.f50163d) ? R$drawable.ic2_favorite_select_20 : R$drawable.ic2_favorite_unselect_20;
    }

    /* JADX INFO: renamed from: C0 */
    public final int m61084C0() {
        return m61107z0(C25307a.m61759a(this.f50163d) ? R$color.complementary : R$color.c_text);
    }

    /* JADX INFO: renamed from: D0 */
    public final int m61085D0() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC37174b.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            return ((InterfaceC37174b) objM56186h).m83144d();
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f6  */
    @NotNull
    /* JADX INFO: renamed from: E0 */
    public final List<MenuItem> m61086E0() {
        Object objM20457a;
        SymbolInfoEntity symbolInfoEntity = this.f50163d.getSymbolInfoEntity();
        Intrinsics.checkNotNull(symbolInfoEntity);
        final List<MenuItem> listMutableListOf = CollectionsKt.mutableListOf(m61092L(symbolInfoEntity), m61103r0(symbolInfoEntity), m61093N(symbolInfoEntity), m61104u0(symbolInfoEntity));
        C24129b.m58033e(SiteVisibleConfigKey.FastTrade, new Function0() { // from class: com.kubi.spot.business.c2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MenuItemsProvider.m61025F0(listMutableListOf, this);
            }
        });
        listMutableListOf.add(m61098g0(symbolInfoEntity));
        C24129b.m58033e(SiteVisibleConfigKey.TradingBot, new Function0() { // from class: com.kubi.spot.business.n2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MenuItemsProvider.m61027G0(listMutableListOf, this);
            }
        });
        listMutableListOf.add(m61102o0());
        if (m61085D0() != 1 || C24129b.m58030b(SiteVisibleConfigKey.SpotVoucher)) {
            listMutableListOf.add(m61089I());
        }
        listMutableListOf.add(m61100k0());
        Object objM56186h = Router.f46192a.m56186h(InterfaceC37174b.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null ? ((InterfaceC37174b) objM56186h).m83145e() : true) {
            listMutableListOf.add(m61094P());
        }
        listMutableListOf.add(m61095R());
        if (C24129b.m58030b(SiteVisibleConfigKey.PriceAlert)) {
            listMutableListOf.add(m61087F());
        }
        listMutableListOf.add(m61099i0());
        if (C11351z0.m20196k()) {
            if (IUnifyAccountService.f53155a.get().mo64979C()) {
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
                    listMutableListOf.add(m61097d0());
                } else if (!IUnifyAccountService.f53155a.get().mo64979C()) {
                    listMutableListOf.add(m61097d0());
                }
            } else if (!IUnifyAccountService.f53155a.get().mo64979C()) {
                listMutableListOf.add(m61097d0());
            }
        }
        return listMutableListOf;
    }

    /* JADX INFO: renamed from: F */
    public final MenuItem m61087F() {
        return new MenuItem(106, m61106y0(), C27017c.f54310a.m66516f(R$string.alert, new Object[0]), new BiConsumer() { // from class: com.kubi.spot.business.b3
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                MenuItemsProvider.m61026G(this.f49765b, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m61105x0()), false, 32, null);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m61088H0(boolean z11) {
        this.f50164e = z11;
    }

    /* JADX INFO: renamed from: I */
    public final MenuItem m61089I() {
        return new MenuItem(108, R$drawable.ic2_coupons_20, C27017c.f54310a.m66516f(R$string.kc_spot_panel_coupons, new Object[0]), new BiConsumer() { // from class: com.kubi.spot.business.c3
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                MenuItemsProvider.m61029J(this.f49799b, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m61020A0(this, 0, 1, null)), this.f50164e);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m61090I0(String str) {
        C43852m.m96590b("B5trading", "morePopup", "depositButton", TuplesKt.m90091to("after_page_id", "B1depositpage"), TuplesKt.m90091to("norm_version", "1"), TuplesKt.m90091to("coin", C27041f.m66668h(str)));
    }

    /* JADX INFO: renamed from: J0 */
    public final void m61091J0(String str, JSONObject jSONObject) {
        C43852m.m96589a("B5trading", "more", str, jSONObject);
    }

    /* JADX INFO: renamed from: L */
    public final MenuItem m61092L(final SymbolInfoEntity symbolInfoEntity) {
        return new MenuItem(1, R$drawable.ic2_deposit_20, symbolInfoEntity.getBaseCurrencyName() + ' ' + C27017c.f54310a.m66516f(R$string.deposit_coin, new Object[0]), new BiConsumer() { // from class: com.kubi.spot.business.e2
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                MenuItemsProvider.m61032M(this.f50142b, symbolInfoEntity, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m61020A0(this, 0, 1, null)), false, 32, null);
    }

    /* JADX INFO: renamed from: N */
    public final MenuItem m61093N(final SymbolInfoEntity symbolInfoEntity) {
        return new MenuItem(2, R$drawable.ic2_deposit_20, symbolInfoEntity.getQuoteCurrencyName() + ' ' + C27017c.f54310a.m66516f(R$string.deposit_coin, new Object[0]), new BiConsumer() { // from class: com.kubi.spot.business.e3
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                MenuItemsProvider.m61033O(this.f50144b, symbolInfoEntity, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m61020A0(this, 0, 1, null)), false, 32, null);
    }

    /* JADX INFO: renamed from: P */
    public final MenuItem m61094P() {
        return new MenuItem(111, R$drawable.ic2_customer_service_20, C27017c.f54310a.m66516f(R$string.help_center, new Object[0]), new BiConsumer() { // from class: com.kubi.spot.business.f2
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                MenuItemsProvider.m61034Q((Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m61020A0(this, 0, 1, null)), false, 32, null);
    }

    /* JADX INFO: renamed from: R */
    public final MenuItem m61095R() {
        return new MenuItem(100, m61083B0(), C27017c.f54310a.m66516f(R$string.favorites, new Object[0]), new BiConsumer() { // from class: com.kubi.spot.business.d3
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) throws JSONException {
                MenuItemsProvider.m61035S(this.f49896b, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m61084C0()), false, 32, null);
    }

    /* JADX INFO: renamed from: a0 */
    public final MenuItem m61096a0() {
        return new MenuItem(4, R$drawable.ic2_buy_crypto2_20, C27017c.f54310a.m66516f(R$string.fiat_buy_crypto, new Object[0]), new BiConsumer() { // from class: com.kubi.spot.business.f3
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                MenuItemsProvider.m61045b0(this.f50150b, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m61020A0(this, 0, 1, null)), false, 32, null);
    }

    /* JADX INFO: renamed from: d0 */
    public final MenuItem m61097d0() {
        return new MenuItem(200, com.kubi.tradecorebiz.R$drawable.ic2_asset_overview_20, C27017c.f54310a.m66516f(com.kubi.tradecorebiz.R$string.spot_pnl_analyze, new Object[0]), new BiConsumer() { // from class: com.kubi.spot.business.i2
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                MenuItemsProvider.m61050e0((Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m61020A0(this, 0, 1, null)), false, 32, null);
    }

    /* JADX INFO: renamed from: g0 */
    public final MenuItem m61098g0(final SymbolInfoEntity symbolInfoEntity) {
        return new MenuItem(110, R$drawable.ic2_transfer_information_20, C27017c.f54310a.m66516f(R$string.bkumex_trading_rules, new Object[0]), new BiConsumer() { // from class: com.kubi.spot.business.y2
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                MenuItemsProvider.m61055h0(symbolInfoEntity, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m61020A0(this, 0, 1, null)), false, 32, null);
    }

    /* JADX INFO: renamed from: i0 */
    public final MenuItem m61099i0() {
        return new MenuItem(107, R$drawable.ic2_setting_20, C27017c.f54310a.m66516f(R$string.trade_setting, new Object[0]), new BiConsumer() { // from class: com.kubi.spot.business.g2
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                MenuItemsProvider.m61058j0((Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m61020A0(this, 0, 1, null)), false, 32, null);
    }

    /* JADX INFO: renamed from: k0 */
    public final MenuItem m61100k0() {
        C37878b0 c37878b0 = C37878b0.f85252a;
        return new MenuItem(101, !c37878b0.m85527h(0) ? R$drawable.ic2_trade_vertical_20 : R$drawable.ic2_trade_horizontal_20, !c37878b0.m85527h(0) ? C27017c.f54310a.m66516f(R$string.vertical_order, new Object[0]) : C27017c.f54310a.m66516f(R$string.language_horizontal, new Object[0]), new BiConsumer() { // from class: com.kubi.spot.business.d2
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) throws Exception {
                MenuItemsProvider.m61061l0(this.f49895b, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m61020A0(this, 0, 1, null)), false, 32, null);
    }

    /* JADX INFO: renamed from: m0 */
    public final MenuItem m61101m0() {
        return new MenuItem(103, R$drawable.ic2_roboto_20, C27017c.f54310a.m66516f(R$string.robot, new Object[0]), new BiConsumer() { // from class: com.kubi.spot.business.g3
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                MenuItemsProvider.m61064n0((Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m61020A0(this, 0, 1, null)), false, 32, null);
    }

    /* JADX INFO: renamed from: o0 */
    public final MenuItem m61102o0() {
        return new MenuItem(102, R$drawable.ic2_trading_fee_level_20, C27017c.f54310a.m66516f(R$string.trade_rate, new Object[0]), new BiConsumer() { // from class: com.kubi.spot.business.j2
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                MenuItemsProvider.m61067p0(this.f50172b, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m61020A0(this, 0, 1, null)), false, 32, null);
    }

    /* JADX INFO: renamed from: r0 */
    public final MenuItem m61103r0(final SymbolInfoEntity symbolInfoEntity) {
        return new MenuItem(3, R$drawable.ic2_transfer_20, symbolInfoEntity.getBaseCurrencyName() + ' ' + C27017c.f54310a.m66516f(R$string.transfer, new Object[0]), new BiConsumer() { // from class: com.kubi.spot.business.a3
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                MenuItemsProvider.m61072s0(this.f49758b, symbolInfoEntity, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m61020A0(this, 0, 1, null)), false, 32, null);
    }

    /* JADX INFO: renamed from: u0 */
    public final MenuItem m61104u0(final SymbolInfoEntity symbolInfoEntity) {
        return new MenuItem(4, R$drawable.ic2_transfer_20, symbolInfoEntity.getQuoteCurrencyName() + ' ' + C27017c.f54310a.m66516f(R$string.transfer, new Object[0]), new BiConsumer() { // from class: com.kubi.spot.business.h2
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                MenuItemsProvider.m61077v0(this.f50158b, symbolInfoEntity, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m61020A0(this, 0, 1, null)), false, 32, null);
    }

    /* JADX INFO: renamed from: x0 */
    public final int m61105x0() {
        return m61107z0(this.f50163d.isAlarm() ? R$color.complementary : R$color.c_text);
    }

    /* JADX INFO: renamed from: y0 */
    public final int m61106y0() {
        return this.f50163d.isAlarm() ? R$drawable.ic2_alert_select_20 : R$drawable.ic2_alert_unselect_20;
    }

    /* JADX INFO: renamed from: z0 */
    public final int m61107z0(int i11) {
        return this.f50160a.getColorRes(i11);
    }

    /* JADX INFO: renamed from: F0 */
    public static final Unit m61025F0(List list, MenuItemsProvider menuItemsProvider) {
        list.add(menuItemsProvider.m61096a0());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G0 */
    public static final Unit m61027G0(List list, MenuItemsProvider menuItemsProvider) {
        list.add(menuItemsProvider.m61101m0());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U */
    public static final void m61037U(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: X */
    public static final void m61040X(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m61061l0(MenuItemsProvider menuItemsProvider, Integer num, BaseQuickAdapter baseQuickAdapter) throws Exception {
        Intrinsics.checkNotNull(num);
        MenuItem menuItem = (MenuItem) baseQuickAdapter.getItem(num.intValue());
        C37878b0 c37878b0 = C37878b0.f85252a;
        if (!c37878b0.m85527h(0)) {
            if (menuItem != null) {
                menuItem.m54365i(C27017c.f54310a.m66516f(R$string.language_horizontal, new Object[0]));
            }
            if (menuItem != null) {
                menuItem.m54364h(R$drawable.ic2_trade_horizontal_20);
            }
            baseQuickAdapter.notifyItemChanged(num.intValue());
            c37878b0.m85537r(0, true);
        } else {
            if (menuItem != null) {
                menuItem.m54365i(C27017c.f54310a.m66516f(R$string.vertical_order, new Object[0]));
            }
            if (menuItem != null) {
                menuItem.m54364h(R$drawable.ic2_trade_vertical_20);
            }
            baseQuickAdapter.notifyItemChanged(num.intValue());
            c37878b0.m85537r(0, false);
            m61031K0(menuItemsProvider, "6", null, 2, null);
        }
        menuItemsProvider.f50161b.m61558s5(true);
    }
}
