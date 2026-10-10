package ae;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import com.blankj.utilcode.util.SpanUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.reflect.TypeToken;
import com.kubi.assets.C11351z0;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.core.base.TradeAccountType;
import com.kubi.core.base.quote.inner.SymbolFavOrCancelHandler;
import com.kubi.core.biz.coupon.UnifiedCouponRouter;
import com.kubi.core.utils.C12462a;
import com.kubi.data.coin.AccountType;
import com.kubi.data.coin.TransferJumper;
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
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
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
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import ee.C37136a;
import f00.C37304a;
import g00.InterfaceC37749a;
import g00.InterfaceC37753e;
import g00.InterfaceC37756h;
import g00.InterfaceC37758j;
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
import org.json.JSONException;
import org.json.JSONObject;
import p260fd.Request;
import p260fd.Response;
import p261fe.C37437a;
import p309hd.InterfaceC38170b;
import p402kf.C41016c;
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

/* JADX INFO: renamed from: ae.v0 */
/* JADX INFO: compiled from: MenuItemsProvider.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\"\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0018\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\"\u0010 \u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0010\u0010!\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\"\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010#\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001a\u0010%\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010'\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010(\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010)\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010*\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020,H\u0002J\u0010\u0010.\u001a\u00020,2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010/\u001a\u00020,2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u00100\u001a\u00020,H\u0002J\u001c\u00101\u001a\u00020\u000f2\u0006\u00102\u001a\u0002032\n\b\u0002\u00104\u001a\u0004\u0018\u000105H\u0002J\u001a\u00106\u001a\u00020,2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u00107\u001a\u00020,H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00069"}, m90084d2 = {"Lcom/kubi/core/biz/symbolbarold/menu/MenuItemsProvider;", "", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "<init>", "(Lcom/kubi/data/entity/TradeItemBean;)V", "hasCoupons", "", "getHasCoupons", "()Z", "setHasCoupons", "(Z)V", "tradeTypeToggleChangeListener", "Lcom/kubi/core/biz/symbolbarold/menu/MenuItemsProvider$TradeTypeToggleChangeListener;", "setTradeTypeToggleChangeListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "getMenuItems", "", "Lcom/kubi/resources/MenuItem;", "baseFragment", "Lcom/kubi/sdk/BaseFragment;", "tradeAccount", "Lcom/kubi/core/base/TradeAccountType;", "toAccount", "Lcom/kubi/data/coin/AccountType;", "createFAQMenuItem", "createDepositBaseCurrencyMenuItem", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "createTransferBaseCurrencyMenuItem", "createDepositQuoteCurrencyMenuItem", "createTransferQuoteCurrencyMenuItem", "createFiatBuyCryptoMenuItem", "createSymbolBaseInfoMenuItem", "createTradingBotMenuItem", "createTradingFeeMenuItem", "createCouponsMenuItem", "createTradeTypeToggleMenuItem", "createPnlMenuItem", "createFavoriteMenuItem", "createAlertMenuItem", "createTradeSettingMenuItem", "getFlavorMoreShow", "", "getAlertIcon", "geAlertTintColor", "getFavoriteTintColor", "getFavoriteIcon", "trackMore", "locationId", "", ReportDataTable.COLUMN_PARAMS, "Lorg/json/JSONObject;", "getColorRes", "color", "TradeTypeToggleChangeListener", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMenuItemsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuItemsProvider.kt\ncom/kubi/core/biz/symbolbarold/menu/MenuItemsProvider\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 4 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,606:1\n35#2,4:607\n39#2:613\n44#3,2:611\n17#4,2:614\n*S KotlinDebug\n*F\n+ 1 MenuItemsProvider.kt\ncom/kubi/core/biz/symbolbarold/menu/MenuItemsProvider\n*L\n128#1:607,4\n128#1:613\n128#1:611,2\n338#1:614,2\n*E\n"})
public final class C0285v0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final TradeItemBean f764a;

    /* JADX INFO: renamed from: b */
    public boolean f765b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public a f766c;

    /* JADX INFO: renamed from: ae.v0$a */
    /* JADX INFO: compiled from: MenuItemsProvider.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/biz/symbolbarold/menu/MenuItemsProvider$TradeTypeToggleChangeListener;", "", "onChange", "", "mode", "Lcom/kubi/core/base/setting/data/TradePanelModel;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo1016a(@NotNull InterfaceC38170b interfaceC38170b);
    }

    /* JADX INFO: renamed from: ae.v0$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class b extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: K */
    public static final void m943K(C0285v0 c0285v0, SymbolInfoEntity symbolInfoEntity, Integer num, BaseQuickAdapter baseQuickAdapter) {
        m940F0(c0285v0, "2", null, 2, null);
        InterfaceC37749a.a.m85110e(C37304a.f82764a, symbolInfoEntity.getBaseCurrency(), null, null, null, null, null, 62, null);
    }

    /* JADX INFO: renamed from: M */
    public static final void m944M(C0285v0 c0285v0, SymbolInfoEntity symbolInfoEntity, Integer num, BaseQuickAdapter baseQuickAdapter) {
        m940F0(c0285v0, "2", null, 2, null);
        InterfaceC37749a.a.m85110e(C37304a.f82764a, symbolInfoEntity.getQuoteCurrency(), null, null, null, null, null, 62, null);
    }

    /* JADX INFO: renamed from: k0 */
    public static final boolean m970k0() {
        return true;
    }

    /* JADX INFO: renamed from: n0 */
    public static final void m975n0(C0285v0 c0285v0, final SymbolInfoEntity symbolInfoEntity, final AccountType accountType, Integer num, BaseQuickAdapter baseQuickAdapter) {
        m940F0(c0285v0, "4", null, 2, null);
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: ae.m0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C0285v0.m977o0(symbolInfoEntity, accountType);
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: renamed from: q0 */
    public static final void m980q0(C0285v0 c0285v0, final SymbolInfoEntity symbolInfoEntity, final AccountType accountType, Integer num, BaseQuickAdapter baseQuickAdapter) {
        m940F0(c0285v0, "4", null, 2, null);
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: ae.i0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C0285v0.m982r0(symbolInfoEntity, accountType);
            }
        }, 1, (Object) null);
    }

    public C0285v0(@NotNull TradeItemBean tradeItemBean) {
        Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
        this.f764a = tradeItemBean;
    }

    /* JADX INFO: renamed from: E */
    public static final void m938E(final C0285v0 c0285v0, Integer num, BaseQuickAdapter baseQuickAdapter) {
        IUserService.O(C37136a.f82407a.m83064c(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: ae.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C0285v0.m939F(this.f713b);
            }
        }), 1, (Object) null);
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m939F(C0285v0 c0285v0) {
        IQuoteFacadeService.f41383a.get().mo50692S(c0285v0.f764a, IQuoteFacadeService.Companion.TRADE_TYPE_SPOT);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ void m940F0(C0285v0 c0285v0, String str, JSONObject jSONObject, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            jSONObject = null;
        }
        c0285v0.m994E0(str, jSONObject);
    }

    /* JADX INFO: renamed from: H */
    public static final void m941H(final C0285v0 c0285v0, final boolean z11, Integer num, BaseQuickAdapter baseQuickAdapter) {
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: ae.l0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C0285v0.m942I(this.f736b, z11);
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m942I(C0285v0 c0285v0, boolean z11) {
        String symbol = c0285v0.f764a.getSymbol();
        if (symbol != null) {
            if (z11) {
                UnifiedCouponRouter.f20385a.m21734b(7, symbol);
            } else {
                ISpotCommonService.f49644a.get().mo59971o(symbol);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O */
    public static final void m945O(Integer num, BaseQuickAdapter baseQuickAdapter) {
        InterfaceC37753e.a.m85128a(C37304a.f82764a, null, null, null, 7, null);
    }

    /* JADX INFO: renamed from: Q */
    public static final void m946Q(final C0285v0 c0285v0, final BaseFragment baseFragment, final Integer num, final BaseQuickAdapter baseQuickAdapter) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("symbol", c0285v0.f764a.getSymbol());
        Unit unit = Unit.INSTANCE;
        c0285v0.m994E0(TUIConstants.TUICustomerServicePlugin.BUSINESS_ID_SRC_CUSTOMER_SERVICE_SAY_HELLO, jSONObject);
        Intrinsics.checkNotNull(num);
        final MenuItem menuItem = (MenuItem) baseQuickAdapter.getItem(num.intValue());
        IUserService.Companion companion = IUserService.a;
        if (companion.get().c()) {
            baseFragment.showLoadingDialog();
            SymbolFavOrCancelHandler symbolFavOrCancelHandler = new SymbolFavOrCancelHandler();
            String symbol = c0285v0.f764a.getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
            symbolFavOrCancelHandler.mo21152a(new Request(symbol), baseFragment.getDestroyDisposable(), new Function1() { // from class: ae.f0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C0285v0.m947R(this.f720b, menuItem, baseFragment, baseQuickAdapter, num, (Response) obj);
                }
            });
            return;
        }
        if (!TextUtils.isEmpty(companion.get().d0().id) && companion.get().o()) {
            IUserService.O((IUserService) Router.f46192a.m56192n(IUserService.class), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: ae.g0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C0285v0.m948S();
                }
            }), 1, (Object) null);
            return;
        }
        IQuoteFacadeService.f41383a.get().mo50678C(c0285v0.f764a, new Function1() { // from class: ae.h0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C0285v0.m949T(this.f726b, ((Boolean) obj).booleanValue());
            }
        });
        if (menuItem != null) {
            menuItem.m54364h(c0285v0.m1012w0());
        }
        if (menuItem != null) {
            menuItem.m54366j(Integer.valueOf(c0285v0.m1013x0(baseFragment)));
        }
        baseQuickAdapter.notifyItemChanged(num.intValue());
    }

    /* JADX INFO: renamed from: R */
    public static final Unit m947R(C0285v0 c0285v0, MenuItem menuItem, BaseFragment baseFragment, BaseQuickAdapter baseQuickAdapter, Integer num, Response it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getIsSuccess()) {
            ToastCompat.m66441G(!C37869b.m85487a(c0285v0.f764a) ? C27017c.f54310a.m66516f(R$string.add_favorites_ok, new Object[0]) : C27017c.f54310a.m66516f(R$string.cancel_favor_ok, new Object[0]), new Object[0]);
            TradeItemBean tradeItemBean = c0285v0.f764a;
            tradeItemBean.setFavor(!C37869b.m85487a(tradeItemBean));
            if (menuItem != null) {
                menuItem.m54364h(c0285v0.m1012w0());
            }
            if (menuItem != null) {
                menuItem.m54366j(Integer.valueOf(c0285v0.m1013x0(baseFragment)));
            }
            Intrinsics.checkNotNull(num);
            baseQuickAdapter.notifyItemChanged(num.intValue());
        }
        BaseFragment.hideLoadingDialog$default(baseFragment, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S */
    public static final Unit m948S() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T */
    public static final Unit m949T(C0285v0 c0285v0, boolean z11) {
        if (z11) {
            ToastCompat.m66441G(C37869b.m85487a(c0285v0.f764a) ? C27017c.f54310a.m66516f(R$string.cancel_favor_ok, new Object[0]) : C27017c.f54310a.m66516f(R$string.add_favorites_ok, new Object[0]), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V */
    public static final void m950V(final C0285v0 c0285v0, Integer num, BaseQuickAdapter baseQuickAdapter) {
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: ae.k0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C0285v0.m951W(this.f734b);
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: renamed from: W */
    public static final Unit m951W(C0285v0 c0285v0) {
        InterfaceC37758j.a.m85163l(C37304a.f82764a, null, C41016c.m89965c(), c0285v0.f764a.getSymbolInfoEntity().getQuoteCurrency(), null, null, null, null, 121, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y */
    public static final void m952Y(Integer num, BaseQuickAdapter baseQuickAdapter) {
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: ae.j0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C0285v0.m953Z();
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: renamed from: Z */
    public static final Unit m953Z() {
        Router.f46192a.m56184f(C11351z0.m20186a() + C11351z0.m20195j()).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b0 */
    public static final void m956b0(SymbolInfoEntity symbolInfoEntity, Integer num, BaseQuickAdapter baseQuickAdapter) {
        ISpotCommonService.f49644a.get().mo59972p(symbolInfoEntity);
    }

    /* JADX INFO: renamed from: d0 */
    public static final void m959d0(Integer num, BaseQuickAdapter baseQuickAdapter) {
        InterfaceC37756h.a.m85148f(C37304a.f82764a, false, null, null, null, null, 31, null);
    }

    /* JADX INFO: renamed from: j0 */
    public static final void m968j0(C0285v0 c0285v0, BaseFragment baseFragment, Integer num, BaseQuickAdapter baseQuickAdapter) {
        int i11;
        SpannableStringBuilder spannableStringBuilderM6097d;
        m940F0(c0285v0, "5", null, 2, null);
        IMarginService iMarginServiceM83062a = C37136a.f82407a.m83062a();
        SymbolInfoEntity symbolInfoEntity = c0285v0.f764a.getSymbolInfoEntity();
        Intrinsics.checkNotNullExpressionValue(symbolInfoEntity, "getSymbolInfoEntity(...)");
        FeeEntity feeEntityMo37947m0 = iMarginServiceM83062a.mo37947m0(symbolInfoEntity);
        C27017c c27017c = C27017c.f54310a;
        String strM66516f = c27017c.m66516f(R$string.trade_rate_tip_1, c0285v0.f764a.getShowSymbol(), (char) 8237 + C42180b.m92642g(new BigDecimal(String.valueOf(c0285v0.f764a.getSymbolInfoEntity().getTakerFeeRate())), null, null, 20, false, false, false, 27, null) + (char) 8236, (char) 8237 + C42180b.m92642g(new BigDecimal(String.valueOf(c0285v0.f764a.getSymbolInfoEntity().getMakerFeeRate())), null, null, 20, false, false, false, 27, null) + (char) 8236);
        int i12 = R$string.trade_rate_tip_2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Lv ");
        IUserService.Companion companion = IUserService.a;
        sb2.append(companion.get().d0().getFeeLevel());
        String string = sb2.toString();
        String showSymbol = c0285v0.f764a.getShowSymbol();
        StringBuilder sb3 = new StringBuilder();
        sb3.append((char) 8237);
        SymbolInfoEntity symbolInfoEntity2 = c0285v0.f764a.getSymbolInfoEntity();
        Intrinsics.checkNotNullExpressionValue(symbolInfoEntity2, "getSymbolInfoEntity(...)");
        sb3.append(C42180b.m92642g(iMarginServiceM83062a.mo37956r(symbolInfoEntity2), null, null, 20, false, false, false, 27, null));
        sb3.append((char) 8236);
        String string2 = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append((char) 8237);
        SymbolInfoEntity symbolInfoEntity3 = c0285v0.f764a.getSymbolInfoEntity();
        Intrinsics.checkNotNullExpressionValue(symbolInfoEntity3, "getSymbolInfoEntity(...)");
        sb4.append(C42180b.m92642g(iMarginServiceM83062a.mo37911J(symbolInfoEntity3), null, null, 20, false, false, false, 27, null));
        sb4.append((char) 8236);
        String strM66516f2 = c27017c.m66516f(i12, string, showSymbol, string2, sb4.toString());
        String str = strM66516f;
        if (companion.get().c() && ISpotCommonService.f49644a.get().mo59956B(new Function0() { // from class: ae.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C0285v0.m970k0());
            }
        })) {
            str = strM66516f;
            str = strM66516f + "\n\n" + strM66516f2;
        }
        BigDecimal bigDecimalM66535e = DowngradeExKt.m66535e(feeEntityMo37947m0 != null ? feeEntityMo37947m0.getBuyTaxRate() : null, null, 1, null);
        BigDecimal bigDecimalM66535e2 = DowngradeExKt.m66535e(feeEntityMo37947m0 != null ? feeEntityMo37947m0.getSellTaxRate() : null, null, 1, null);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalM66535e.compareTo(bigDecimal) == 0 && bigDecimalM66535e2.compareTo(bigDecimal) == 0) {
            spannableStringBuilderM6097d = null;
            i11 = 0;
        } else {
            Object objM56186h = Router.f46192a.m56186h(InterfaceC46809l0.class, SiteInfoManager.f47913a.m58109c());
            if (objM56186h != null ? ((InterfaceC46809l0) objM56186h).mo102976a() : false) {
                i11 = 0;
                spannableStringBuilderM6097d = new SpanUtils().m6094a(str).m6094a("\n\n").m6094a(c27017c.m66516f(R$string.kc_eu_tax_tip, new Object[0])).m6097d();
            } else {
                SpanUtils spanUtilsM6094a = new SpanUtils().m6094a(str).m6094a("\n\n");
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String strM66516f3 = c27017c.m66516f(R$string.kc_tax_pop_rate, new Object[0]);
                StringBuilder sb5 = new StringBuilder();
                sb5.append((char) 8237);
                i11 = 0;
                sb5.append(C42180b.m92642g(bigDecimalM66535e, null, null, 20, false, false, false, 27, null));
                sb5.append((char) 8236);
                String str2 = String.format(strM66516f3, Arrays.copyOf(new Object[]{sb5.toString(), (char) 8237 + C42180b.m92642g(bigDecimalM66535e2, null, null, 20, false, false, false, 27, null) + (char) 8236}, 2));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                SpanUtils spanUtilsM6094a2 = spanUtilsM6094a.m6094a(str2);
                final String complianceTaxHelpCenterUrl = feeEntityMo37947m0 != null ? feeEntityMo37947m0.getComplianceTaxHelpCenterUrl() : null;
                if (!TextUtils.isEmpty(complianceTaxHelpCenterUrl)) {
                    spanUtilsM6094a2 = spanUtilsM6094a2.m6098e(c27017c.m66512a(R$color.complementary), true, new View.OnClickListener() { // from class: ae.e0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C0285v0.m972l0(complianceTaxHelpCenterUrl, view);
                        }
                    }).m6102i();
                }
                spannableStringBuilderM6097d = spanUtilsM6094a2.m6097d();
            }
        }
        AlertDialogFragmentHelper alertDialogFragmentHelperM54168Y4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(c27017c.m66516f(R$string.trade_rate, new Object[i11]));
        CharSequence charSequence = str;
        if (spannableStringBuilderM6097d != null) {
            charSequence = spannableStringBuilderM6097d;
        }
        alertDialogFragmentHelperM54168Y4.m54156M4(charSequence).m54162S4(R$string.i_already_know, null).m54172c5(baseFragment.getChildFragmentManager());
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m972l0(String str, View view) {
        Router.f46192a.m56184f(C27041f.m66668h(str)).m4048k();
    }

    /* JADX INFO: renamed from: o0 */
    public static final Unit m977o0(SymbolInfoEntity symbolInfoEntity, AccountType accountType) {
        String strName;
        TransferJumper.Companion companion = TransferJumper.f21427a;
        String baseCurrency = symbolInfoEntity.getBaseCurrency();
        if (accountType == null || (strName = accountType.name()) == null) {
            strName = "TRADE";
        }
        TransferJumper.Companion.jumpToTransfer$default(companion, baseCurrency, null, null, "MAIN", strName, false, null, 102, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r0 */
    public static final Unit m982r0(SymbolInfoEntity symbolInfoEntity, AccountType accountType) {
        String strName;
        TransferJumper.Companion companion = TransferJumper.f21427a;
        String quoteCurrency = symbolInfoEntity.getQuoteCurrency();
        if (accountType == null || (strName = accountType.name()) == null) {
            strName = "TRADE";
        }
        TransferJumper.Companion.jumpToTransfer$default(companion, quoteCurrency, null, null, "MAIN", strName, false, null, 102, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v0 */
    public static /* synthetic */ int m987v0(C0285v0 c0285v0, BaseFragment baseFragment, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = R$color.c_text;
        }
        return c0285v0.m1011u0(baseFragment, i11);
    }

    /* JADX INFO: renamed from: D */
    public final MenuItem m992D(BaseFragment baseFragment) {
        return new MenuItem(106, m1010t0(), C27017c.f54310a.m66516f(R$string.alert, new Object[0]), new BiConsumer() { // from class: ae.x
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C0285v0.m938E(this.f768b, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m1009s0(baseFragment)), false, 32, null);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m993D0(@NotNull a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f766c = listener;
    }

    /* JADX INFO: renamed from: G */
    public final MenuItem m995G(BaseFragment baseFragment, TradeAccountType tradeAccountType) {
        final boolean zAreEqual = Intrinsics.areEqual(tradeAccountType, TradeAccountType.Unified.INSTANCE);
        return new MenuItem(108, R$drawable.ic2_coupons_20, C27017c.f54310a.m66516f(R$string.kc_spot_panel_coupons, new Object[0]), new BiConsumer() { // from class: ae.a0
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C0285v0.m941H(this.f706b, zAreEqual, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m987v0(this, baseFragment, 0, 2, null)), !zAreEqual && this.f765b);
    }

    /* JADX INFO: renamed from: J */
    public final MenuItem m996J(BaseFragment baseFragment, final SymbolInfoEntity symbolInfoEntity) {
        return new MenuItem(1, R$drawable.ic2_deposit_20, symbolInfoEntity.getBaseCurrencyName() + ' ' + C27017c.f54310a.m66516f(R$string.deposit_coin, new Object[0]), new BiConsumer() { // from class: ae.z
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C0285v0.m943K(this.f771b, symbolInfoEntity, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m987v0(this, baseFragment, 0, 2, null)), false, 32, null);
    }

    /* JADX INFO: renamed from: L */
    public final MenuItem m997L(BaseFragment baseFragment, final SymbolInfoEntity symbolInfoEntity) {
        return new MenuItem(2, R$drawable.ic2_deposit_20, symbolInfoEntity.getQuoteCurrencyName() + ' ' + C27017c.f54310a.m66516f(R$string.deposit_coin, new Object[0]), new BiConsumer() { // from class: ae.t0
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C0285v0.m944M(this.f759b, symbolInfoEntity, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m987v0(this, baseFragment, 0, 2, null)), false, 32, null);
    }

    /* JADX INFO: renamed from: N */
    public final MenuItem m998N(BaseFragment baseFragment) {
        return new MenuItem(111, R$drawable.ic2_customer_service_20, C27017c.f54310a.m66516f(R$string.help_center, new Object[0]), new BiConsumer() { // from class: ae.u
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C0285v0.m945O((Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m987v0(this, baseFragment, 0, 2, null)), false, 32, null);
    }

    /* JADX INFO: renamed from: P */
    public final MenuItem m999P(final BaseFragment baseFragment) {
        return new MenuItem(100, m1012w0(), C27017c.f54310a.m66516f(R$string.favorites, new Object[0]), new BiConsumer() { // from class: ae.y
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) throws JSONException {
                C0285v0.m946Q(this.f769b, baseFragment, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m1013x0(baseFragment)), false, 32, null);
    }

    /* JADX INFO: renamed from: U */
    public final MenuItem m1000U(BaseFragment baseFragment) {
        return new MenuItem(4, R$drawable.ic2_buy_crypto2_20, C27017c.f54310a.m66516f(R$string.fiat_buy_crypto, new Object[0]), new BiConsumer() { // from class: ae.w
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C0285v0.m950V(this.f767b, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m987v0(this, baseFragment, 0, 2, null)), false, 32, null);
    }

    /* JADX INFO: renamed from: X */
    public final MenuItem m1001X(BaseFragment baseFragment) {
        return new MenuItem(200, R$drawable.ic2_asset_overview_20, C27017c.f54310a.m66516f(R$string.spot_pnl_analyze, new Object[0]), new BiConsumer() { // from class: ae.v
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C0285v0.m952Y((Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m987v0(this, baseFragment, 0, 2, null)), false, 32, null);
    }

    /* JADX INFO: renamed from: a0 */
    public final MenuItem m1002a0(BaseFragment baseFragment, final SymbolInfoEntity symbolInfoEntity) {
        return new MenuItem(110, R$drawable.ic2_transfer_information_20, C27017c.f54310a.m66516f(R$string.bkumex_trading_rules, new Object[0]), new BiConsumer() { // from class: ae.p0
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C0285v0.m956b0(symbolInfoEntity, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m987v0(this, baseFragment, 0, 2, null)), false, 32, null);
    }

    /* JADX INFO: renamed from: c0 */
    public final MenuItem m1003c0(BaseFragment baseFragment) {
        return new MenuItem(107, R$drawable.ic2_setting_20, C27017c.f54310a.m66516f(R$string.trade_setting, new Object[0]), new BiConsumer() { // from class: ae.q0
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C0285v0.m959d0((Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m987v0(this, baseFragment, 0, 2, null)), false, 32, null);
    }

    /* JADX INFO: renamed from: e0 */
    public final MenuItem m1004e0(BaseFragment baseFragment) {
        C37878b0 c37878b0 = C37878b0.f85252a;
        C37437a c37437a = C37437a.f83039a;
        return new MenuItem(101, !c37878b0.m85527h(c37437a.m84227a()) ? R$drawable.ic2_trade_vertical_20 : R$drawable.ic2_trade_horizontal_20, !c37878b0.m85527h(c37437a.m84227a()) ? C27017c.f54310a.m66516f(R$string.vertical_order, new Object[0]) : C27017c.f54310a.m66516f(R$string.language_horizontal, new Object[0]), new BiConsumer() { // from class: ae.r0
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C0285v0.m962f0(this.f752b, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m987v0(this, baseFragment, 0, 2, null)), false, 32, null);
    }

    /* JADX INFO: renamed from: g0 */
    public final MenuItem m1005g0(BaseFragment baseFragment) {
        return new MenuItem(103, R$drawable.ic2_roboto_20, C27017c.f54310a.m66516f(R$string.robot, new Object[0]), new BiConsumer() { // from class: ae.s0
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C0285v0.m965h0((Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m987v0(this, baseFragment, 0, 2, null)), false, 32, null);
    }

    /* JADX INFO: renamed from: i0 */
    public final MenuItem m1006i0(final BaseFragment baseFragment) {
        return new MenuItem(102, R$drawable.ic2_trading_fee_level_20, C27017c.f54310a.m66516f(R$string.trade_rate, new Object[0]), new BiConsumer() { // from class: ae.o0
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C0285v0.m968j0(this.f746b, baseFragment, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m987v0(this, baseFragment, 0, 2, null)), false, 32, null);
    }

    /* JADX INFO: renamed from: m0 */
    public final MenuItem m1007m0(BaseFragment baseFragment, final SymbolInfoEntity symbolInfoEntity, final AccountType accountType) {
        return new MenuItem(3, R$drawable.ic2_transfer_20, symbolInfoEntity.getBaseCurrencyName() + ' ' + C27017c.f54310a.m66516f(R$string.transfer, new Object[0]), new BiConsumer() { // from class: ae.t
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C0285v0.m975n0(this.f756b, symbolInfoEntity, accountType, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m987v0(this, baseFragment, 0, 2, null)), false, 32, null);
    }

    /* JADX INFO: renamed from: p0 */
    public final MenuItem m1008p0(BaseFragment baseFragment, final SymbolInfoEntity symbolInfoEntity, final AccountType accountType) {
        return new MenuItem(4, R$drawable.ic2_transfer_20, symbolInfoEntity.getQuoteCurrencyName() + ' ' + C27017c.f54310a.m66516f(R$string.transfer, new Object[0]), new BiConsumer() { // from class: ae.u0
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C0285v0.m980q0(this.f761b, symbolInfoEntity, accountType, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, Integer.valueOf(m987v0(this, baseFragment, 0, 2, null)), false, 32, null);
    }

    /* JADX INFO: renamed from: s0 */
    public final int m1009s0(BaseFragment baseFragment) {
        return m1011u0(baseFragment, this.f764a.isAlarm() ? R$color.complementary : R$color.c_text);
    }

    /* JADX INFO: renamed from: t0 */
    public final int m1010t0() {
        return this.f764a.isAlarm() ? R$drawable.ic2_alert_select_20 : R$drawable.ic2_alert_unselect_20;
    }

    /* JADX INFO: renamed from: w0 */
    public final int m1012w0() {
        return C37869b.m85487a(this.f764a) ? R$drawable.ic2_favorite_select_20 : R$drawable.ic2_favorite_unselect_20;
    }

    /* JADX INFO: renamed from: x0 */
    public final int m1013x0(BaseFragment baseFragment) {
        return m1011u0(baseFragment, C37869b.m85487a(this.f764a) ? R$color.complementary : R$color.c_text);
    }

    /* JADX INFO: renamed from: y0 */
    public final int m1014y0() {
        return ISpotCommonService.f49644a.get().mo59960d();
    }

    @NotNull
    /* JADX INFO: renamed from: z0 */
    public final List<MenuItem> m1015z0(@NotNull final BaseFragment baseFragment, @Nullable TradeAccountType tradeAccountType, @Nullable AccountType accountType) {
        Object objM20457a;
        Intrinsics.checkNotNullParameter(baseFragment, "baseFragment");
        SymbolInfoEntity symbolInfoEntity = this.f764a.getSymbolInfoEntity();
        Intrinsics.checkNotNull(symbolInfoEntity);
        final List<MenuItem> listMutableListOf = CollectionsKt.mutableListOf(m996J(baseFragment, symbolInfoEntity), m1007m0(baseFragment, symbolInfoEntity, accountType), m997L(baseFragment, symbolInfoEntity), m1008p0(baseFragment, symbolInfoEntity, accountType));
        C24129b.m58033e(SiteVisibleConfigKey.FastTrade, new Function0() { // from class: ae.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C0285v0.m933A0(listMutableListOf, this, baseFragment);
            }
        });
        listMutableListOf.add(m1002a0(baseFragment, symbolInfoEntity));
        C24129b.m58033e(SiteVisibleConfigKey.TradingBot, new Function0() { // from class: ae.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C0285v0.m935B0(listMutableListOf, this, baseFragment);
            }
        });
        listMutableListOf.add(m1006i0(baseFragment));
        if (m1014y0() != 1) {
            listMutableListOf.add(m995G(baseFragment, tradeAccountType));
        }
        listMutableListOf.add(m1004e0(baseFragment));
        ISpotCommonService.f49644a.get().mo59964h(new Function0() { // from class: ae.n0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C0285v0.m937C0(listMutableListOf, this, baseFragment);
            }
        });
        listMutableListOf.add(m999P(baseFragment));
        listMutableListOf.add(m992D(baseFragment));
        listMutableListOf.add(m1003c0(baseFragment));
        if (C11351z0.m20196k() && IUnifyAccountService.f53155a.get().mo64979C()) {
            try {
                RemoteConfig remoteConfig = RemoteConfig.f19636a;
                Type type = new b().getType();
                Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                objM20457a = RemoteConfig.m20457a("asset_uta_pnl", type);
            } catch (Throwable th2) {
                C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
                objM20457a = null;
            }
            if (C27025c.m66567e((Boolean) objM20457a, false)) {
                listMutableListOf.add(m1001X(baseFragment));
            }
        }
        return listMutableListOf;
    }

    /* JADX INFO: renamed from: A0 */
    public static final Unit m933A0(List list, C0285v0 c0285v0, BaseFragment baseFragment) {
        list.add(c0285v0.m1000U(baseFragment));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B0 */
    public static final Unit m935B0(List list, C0285v0 c0285v0, BaseFragment baseFragment) {
        list.add(c0285v0.m1005g0(baseFragment));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C0 */
    public static final Unit m937C0(List list, C0285v0 c0285v0, BaseFragment baseFragment) {
        list.add(c0285v0.m998N(baseFragment));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m962f0(C0285v0 c0285v0, Integer num, BaseQuickAdapter baseQuickAdapter) {
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
            a aVar = c0285v0.f766c;
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
        m940F0(c0285v0, "6", null, 2, null);
        a aVar2 = c0285v0.f766c;
        if (aVar2 != null) {
            aVar2.mo1016a(InterfaceC38170b.a.f85866a);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static final void m965h0(Integer num, BaseQuickAdapter baseQuickAdapter) {
        C43852m.m96591c(C12462a.m23402a(), "TradingBot", "8", null, 8, null);
        InterfaceC37766r.a.m85190a(C37304a.f82764a, HostManager.a.j() + "?dark=true&loading=2&needLogin=true&lang=" + MultiLanguageManager.f46811g.getLocale(), null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m994E0(String str, JSONObject jSONObject) {
        C43852m.m96589a(C12462a.m23402a(), "more", str, jSONObject);
    }

    /* JADX INFO: renamed from: u0 */
    public final int m1011u0(BaseFragment baseFragment, int i11) {
        return baseFragment.getColorRes(i11);
    }
}
