package com.kubi.payment.p2p.trade;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.util.TypedValueCompat;
import androidx.credentials.provider.CredentialEntry;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.recyclerview.widget.RecyclerView;
import com.cpiz.android.bubbleview.BubbleFrameLayout;
import com.cpiz.android.bubbleview.BubbleLinearLayout;
import com.cpiz.android.bubbleview.BubbleStyle;
import com.cpiz.android.bubbleview.C5392c;
import com.facebook.react.uimanager.ViewProps;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.event.api.C12572a;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.otc.OtcUserManager;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$font;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.AdPayType;
import com.kubi.otc.entity.FoxKingDepositAmount;
import com.kubi.otc.entity.LimitDays;
import com.kubi.otc.entity.OtcInfoEntity;
import com.kubi.otc.otc.trade.OtcDealFragment;
import com.kubi.otc.security.SecuritySettingDialog;
import com.kubi.otc.service.OtcDepend;
import com.kubi.payment.fast.common.helper.TradeLimitHelper;
import com.kubi.payment.fast.paymentmethod.ExtraParams;
import com.kubi.payment.fast.paymentmethod.PaymentMethodFragment;
import com.kubi.payment.flutter.FlutterNavigationHelper;
import com.kubi.payment.flutter.FlutterUtils;
import com.kubi.payment.helper.RemoteConfigHelper;
import com.kubi.payment.p2p.P2PHelper;
import com.kubi.payment.p2p.P2PServiceLocator;
import com.kubi.payment.p2p.P2PViewModelFactory;
import com.kubi.payment.p2p.data.entities.ExpressBuyPreCheck;
import com.kubi.payment.p2p.data.entities.P2PTradingPairInfo;
import com.kubi.payment.p2p.data.source.remote.P2PWebService;
import com.kubi.payment.p2p.trade.filter.P2PFilterDialog;
import com.kubi.payment.p2p.trade.view.CurrencyEditView;
import com.kubi.payment.p2p.trade.view.DashedUnderlineTextView;
import com.kubi.payment.p2p.trade.view.P2PExpressPriceDialog;
import com.kubi.payment.p2p.trade.view.P2PExpressQuestionDialog;
import com.kubi.payment.p2p.widget.PaymentMethodTextView;
import com.kubi.payment.track.IPaymentTrack;
import com.kubi.payment.track.P2PTrackData;
import com.kubi.payment.util.PaymentStorageId;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27056j0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37754f;
import gf.C37890n;
import gt.C38019j;
import ht.C38346y;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import lt.C42304i;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p270ft.C37674q2;
import p402kf.C41016c;
import p569qq.C43841b;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.math.MathKt;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;
import y70.C46392a;

/* JADX INFO: compiled from: P2PTradeMarketListFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001f\u0018\u0000 w2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001wB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u001e\u001a\u00020\u001fH\u0014J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\u0012\u0010+\u001a\u00020(2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u001a\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u0002002\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u00101\u001a\u00020(H\u0014J$\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000204032\u0006\u00105\u001a\u00020\u001f2\u0006\u00106\u001a\u00020\u001fH\u0014J\b\u00107\u001a\u00020\u0019H\u0002J\u001a\u00108\u001a\u00020(2\b\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u00020\u0002H\u0014J\u0014\u0010<\u001a\u00020(*\u00020:2\u0006\u0010;\u001a\u00020\u0002H\u0002J\u0016\u0010=\u001a\u00020>2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@H\u0002J\u0018\u0010B\u001a\u00020(2\u0006\u0010;\u001a\u00020\u00022\u0006\u00109\u001a\u00020:H\u0007J\u0018\u0010C\u001a\u00020(2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0002H\u0002J\b\u0010D\u001a\u00020(H\u0002J\u0010\u0010E\u001a\u00020\u00192\u0006\u0010F\u001a\u00020\u0002H\u0003J\u0010\u0010G\u001a\u00020(2\u0006\u0010F\u001a\u00020\u0002H\u0002J\b\u0010H\u001a\u00020\u0019H\u0016J\b\u0010I\u001a\u00020(H\u0002J\b\u0010J\u001a\u00020(H\u0016J\b\u0010K\u001a\u00020(H\u0002J\u0010\u0010L\u001a\u00020(2\u0006\u0010;\u001a\u00020\u0002H\u0002J\b\u0010M\u001a\u00020(H\u0002J\"\u0010N\u001a\u00020(2\b\u0010O\u001a\u0004\u0018\u00010P2\u0006\u0010Q\u001a\u00020\u00192\u0006\u0010R\u001a\u00020PH\u0002J\u0010\u0010S\u001a\u00020(2\u0006\u0010T\u001a\u00020\u0019H\u0014J\b\u0010U\u001a\u00020(H\u0002J\b\u0010V\u001a\u00020PH\u0002J\u0010\u0010W\u001a\u00020(2\u0006\u0010X\u001a\u00020YH\u0002J\b\u0010Z\u001a\u00020(H\u0002J\b\u0010[\u001a\u00020(H\u0002J\b\u0010\\\u001a\u00020(H\u0002J\b\u0010]\u001a\u00020\u0019H\u0002J\u0012\u0010^\u001a\u00020(2\b\b\u0002\u0010_\u001a\u00020\u0019H\u0002J\b\u0010`\u001a\u00020(H\u0002J\b\u0010a\u001a\u00020(H\u0002J\b\u0010b\u001a\u00020(H\u0002J\b\u0010c\u001a\u00020PH\u0002J\b\u0010d\u001a\u00020PH\u0002J\u0010\u0010e\u001a\u00020(2\u0006\u0010;\u001a\u00020\u0002H\u0002J\u0010\u0010f\u001a\u00020(2\u0006\u0010g\u001a\u00020PH\u0002J\u0010\u0010h\u001a\u00020\u00192\u0006\u0010g\u001a\u00020PH\u0002J\b\u0010i\u001a\u00020PH\u0002J\u0018\u0010j\u001a\u00020(2\u0006\u0010k\u001a\u00020P2\u0006\u0010l\u001a\u00020PH\u0002J\u000e\u0010m\u001a\u00020(2\u0006\u0010n\u001a\u00020\u0006J\b\u0010o\u001a\u00020(H\u0007J\b\u0010p\u001a\u00020(H\u0014J\b\u0010q\u001a\u00020(H\u0002J\b\u0010r\u001a\u00020(H\u0002J\u001e\u0010s\u001a\u00020(2\u0006\u0010t\u001a\u00020P2\u0006\u0010R\u001a\u00020P2\u0006\u0010u\u001a\u00020PJ\b\u0010v\u001a\u00020\u0019H\u0014R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR#\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010 \u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u000f\u001a\u0004\b!\u0010\"R\u001b\u0010$\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u000f\u001a\u0004\b%\u0010\"¨\u0006x"}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/P2PTradeMarketListFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/otc/entity/OtcInfoEntity;", "<init>", "()V", "tradeData", "Lcom/kubi/payment/p2p/trade/ITradeData;", "tradeItem", "viewModel", "Lcom/kubi/payment/p2p/trade/P2PTradeMarketListViewModel;", "tradeLimitHelper", "Lcom/kubi/payment/fast/common/helper/TradeLimitHelper;", "getTradeLimitHelper", "()Lcom/kubi/payment/fast/common/helper/TradeLimitHelper;", "tradeLimitHelper$delegate", "Lkotlin/Lazy;", "api", "Lcom/kubi/payment/p2p/data/source/remote/P2PWebService$Paging;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/payment/p2p/data/source/remote/P2PWebService$Paging;", "api$delegate", "headerBinding", "Lcom/kubi/otc/databinding/PaymentItemP2pExpressBinding;", "isFirstLoad", "", "isFolded", "tradingPairInfo", "Lcom/kubi/payment/p2p/data/entities/P2PTradingPairInfo$Response;", "isFiatCurrencyInputMode", "getItemLayout", "", "useFlutterAmountInputPage", "getUseFlutterAmountInputPage", "()Z", "useFlutterAmountInputPage$delegate", "hasP2PExpressEntrance", "getHasP2PExpressEntrance", "hasP2PExpressEntrance$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "loadData", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "pageSize", "hasRealAdList", "bindDataToView", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "bindPaymentMethod", "buildBubbleWindow", "Lcom/cpiz/android/bubbleview/BubblePopupWindow;", "adPayTypes", "", "Lcom/kubi/otc/entity/AdPayType;", "onTradeClick", "trackItemClick", "expressBuyPreCheck", "preCheck", "ad", "exposeTradeLimit", "needAutoLoad", "toTrade", "refreshData", "checkToDetail", "toDetail", "observeData", "jumpAmountInputPage", "adId", "", "isBuy", "cryptoCurrency", "onNetworkFinished", "success", "refreshP2PExpress", "getCurrentCurrency", "handleExpressBuyPrecheckResult", "response", "Lcom/kubi/payment/p2p/data/entities/ExpressBuyPreCheck$Response;", "showInExistAdDialog", "updatePrecision", "updateOnlyP2pExpressView", "hasNoExpress", "switchInputMode", "forceFiatInputMode", "resetInput", "expandOrFoldP2pExpressView", "switchFoldMode", "getMinLimitAmount", "getMaxLimitAmount", "showLimitWithdrawDialog", "saveUnShowLimitCache", "legal", "isUnShowLimitCache", "getSide", "trackP2P", "category", "reason", "setTradeDataListener", "data", "notifyIconData", "setHeader", "initHeaderViewListener", "launchPaymentMethodsPage", "onTradingPairChanged", "fiatCurrency", "tradeType", "needDefaultBackground", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nP2PTradeMarketListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 P2PTradeMarketListFragment.kt\ncom/kubi/payment/p2p/trade/P2PTradeMarketListFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Utils.kt\ncom/kubi/payment/util/UtilsKt\n+ 5 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 6 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,1273:1\n65#2,4:1274\n37#2:1278\n53#2:1279\n72#2:1280\n1761#3,3:1281\n774#3:1284\n865#3,2:1285\n827#3:1287\n855#3,2:1288\n1669#3,8:1290\n1878#3,3:1298\n1869#3,2:1310\n123#4,9:1301\n35#5,4:1312\n39#5:1318\n35#5,4:1319\n39#5:1325\n44#6,2:1316\n44#6,2:1323\n*S KotlinDebug\n*F\n+ 1 P2PTradeMarketListFragment.kt\ncom/kubi/payment/p2p/trade/P2PTradeMarketListFragment\n*L\n220#1:1274,4\n220#1:1278\n220#1:1279\n220#1:1280\n279#1:1281,3\n393#1:1284\n393#1:1285,2\n394#1:1287\n394#1:1288,2\n395#1:1290,8\n401#1:1298,3\n472#1:1310,2\n419#1:1301,9\n167#1:1312,4\n167#1:1318\n174#1:1319,4\n174#1:1325\n167#1:1316,2\n174#1:1323,2\n*E\n"})
public final class P2PTradeMarketListFragment extends BasePagingFragment<OtcInfoEntity> {

    /* JADX INFO: renamed from: l0 */
    @NotNull
    public static final Companion f39998l0 = new Companion(null);

    /* JADX INFO: renamed from: Z */
    @Nullable
    public ITradeData f39999Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public OtcInfoEntity f40000a0;

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public P2PTradeMarketListViewModel f40001b0;

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public C37674q2 f40004e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f40005f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f40006g0;

    /* JADX INFO: renamed from: h0 */
    @Nullable
    public P2PTradingPairInfo.Response f40007h0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f40002c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.p2p.trade.x0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return P2PTradeMarketListFragment.m49206e6();
        }
    });

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final Lazy f40003d0 = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.p2p.trade.y0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return P2PTradeMarketListFragment.m49156F4();
        }
    });

    /* JADX INFO: renamed from: i0 */
    public boolean f40008i0 = true;

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public final Lazy f40009j0 = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.p2p.trade.z0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(P2PTradeMarketListFragment.m49211h6());
        }
    });

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public final Lazy f40010k0 = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.p2p.trade.a1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(P2PTradeMarketListFragment.m49209g5());
        }
    });

    /* JADX INFO: compiled from: P2PTradeMarketListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/P2PTradeMarketListFragment$Companion;", "", "<init>", "()V", "CACHE_KEY_PAYMENT_P2P_EXPRESS_FOLDED", "", "CACHE_LIMIT", "FIAT_PRECISION", "", "CRYPTO_PRECISION", "SWITCH_EXPRESS_TAB", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.p2p.trade.P2PTradeMarketListFragment$a */
    /* JADX INFO: compiled from: Utils.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, m90084d2 = {"com/kubi/payment/util/UtilsKt$doOnGlobalLayout$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncom/kubi/payment/util/UtilsKt$doOnGlobalLayout$1\n+ 2 P2PTradeMarketListFragment.kt\ncom/kubi/payment/p2p/trade/P2PTradeMarketListFragment\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,143:1\n421#2,26:144\n447#2,16:172\n465#2:189\n172#3,2:170\n1#4:188\n*S KotlinDebug\n*F\n+ 1 P2PTradeMarketListFragment.kt\ncom/kubi/payment/p2p/trade/P2PTradeMarketListFragment\n*L\n446#1:170,2\n*E\n"})
    public static final class ViewTreeObserverOnGlobalLayoutListenerC21244a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f40011b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f40012c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ P2PTradeMarketListFragment f40013d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ List f40014e;

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f40011b.getMeasuredWidth() > 0) {
                this.f40011b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) this.f40011b;
                int childCount = linearLayoutCompat.getChildCount();
                boolean z11 = false;
                int i11 = 0;
                for (int i12 = 0; i12 < childCount; i12++) {
                    int measuredWidth = linearLayoutCompat.getChildAt(i12).getMeasuredWidth();
                    int i13 = i11 + measuredWidth;
                    if (i13 >= linearLayoutCompat.getMeasuredWidth()) {
                        linearLayoutCompat.removeViews(i12, linearLayoutCompat.getChildCount() - i12);
                        i11 = i13 - measuredWidth;
                        z11 = true;
                        break;
                    }
                    i11 = i13 + this.f40012c;
                }
                if (z11) {
                    int iM66658b = C27040e.m66658b(22);
                    if (i11 + iM66658b > linearLayoutCompat.getMeasuredWidth()) {
                        linearLayoutCompat.removeViewAt(linearLayoutCompat.getChildCount() - 1);
                    }
                    AppCompatImageView appCompatImageView = new AppCompatImageView(((OldBaseFragment) this.f40013d).mContext);
                    int iM66658b2 = C27040e.m66658b(4);
                    appCompatImageView.setPadding(iM66658b2, iM66658b2, iM66658b2, iM66658b2);
                    appCompatImageView.setImageResource(R$drawable.ic2_arrow_down_16);
                    C27046k.m66701p(appCompatImageView, ContextCompat.getColor(((OldBaseFragment) this.f40013d).mContext, R$color.c_icon));
                    C5392c c5392cM49254L4 = this.f40013d.m49254L4(this.f40014e);
                    c5392cM49254L4.setElevation(2.0f);
                    c5392cM49254L4.setOnDismissListener(new C21245b(appCompatImageView));
                    C27046k.m66711z(appCompatImageView, 0L, new C21246c(c5392cM49254L4, appCompatImageView), 1, null);
                    LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(iM66658b, iM66658b);
                    ((LinearLayout.LayoutParams) layoutParams).leftMargin = this.f40012c;
                    Unit unit = Unit.INSTANCE;
                    linearLayoutCompat.addView(appCompatImageView, layoutParams);
                }
            }
        }

        public ViewTreeObserverOnGlobalLayoutListenerC21244a(View view, int i11, P2PTradeMarketListFragment p2PTradeMarketListFragment, List list) {
            this.f40011b = view;
            this.f40012c = i11;
            this.f40013d = p2PTradeMarketListFragment;
            this.f40014e = list;
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.p2p.trade.P2PTradeMarketListFragment$b */
    /* JADX INFO: compiled from: P2PTradeMarketListFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21245b implements PopupWindow.OnDismissListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AppCompatImageView f40015b;

        public C21245b(AppCompatImageView appCompatImageView) {
            this.f40015b = appCompatImageView;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            this.f40015b.setImageResource(R$drawable.ic2_arrow_down_16);
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.p2p.trade.P2PTradeMarketListFragment$c */
    /* JADX INFO: compiled from: P2PTradeMarketListFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21246c implements Function0<Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C5392c f40016b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AppCompatImageView f40017c;

        public C21246c(C5392c c5392c, AppCompatImageView appCompatImageView) {
            this.f40016b = c5392c;
            this.f40017c = appCompatImageView;
        }

        /* JADX INFO: renamed from: a */
        public final void m49281a() {
            this.f40016b.m7079m(this.f40017c, BubbleStyle.ArrowDirection.Up);
            this.f40017c.setImageResource(R$drawable.ic2_arrow_up_16);
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m49281a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.p2p.trade.P2PTradeMarketListFragment$d */
    /* JADX INFO: compiled from: P2PTradeMarketListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/payment/p2p/trade/P2PTradeMarketListFragment$buildBubbleWindow$2", "Lcom/cpiz/android/bubbleview/BubblePopupWindow;", "setHeight", "", "height", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21247d extends C5392c {
        @Override // android.widget.PopupWindow
        public void setHeight(int height) {
            if (height > 0) {
                super.setHeight(height);
            }
        }

        public C21247d(BubbleFrameLayout bubbleFrameLayout) {
            super(bubbleFrameLayout, bubbleFrameLayout);
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.p2p.trade.P2PTradeMarketListFragment$e */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C21248e extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.payment.p2p.trade.P2PTradeMarketListFragment$f */
    /* JADX INFO: compiled from: View.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChange", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "left", "", ViewProps.TOP, "right", ViewProps.BOTTOM, "oldLeft", "oldTop", "oldRight", "oldBottom", "core-ktx_release", "androidx/core/view/ViewKt$doOnLayout$$inlined$doOnNextLayout$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 P2PTradeMarketListFragment.kt\ncom/kubi/payment/p2p/trade/P2PTradeMarketListFragment\n*L\n1#1,414:1\n69#2:415\n70#2:429\n221#3,13:416\n*E\n"})
    public static final class ViewOnLayoutChangeListenerC21249f implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC21249f() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            view.removeOnLayoutChangeListener(this);
            if (view.getHeight() > 0) {
                P2PTradeMarketListFragment.this.f46496X.setDragRate(RangesKt.coerceAtLeast(view.getHeight() / 3500.0f, 0.5f));
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.p2p.trade.P2PTradeMarketListFragment$g */
    /* JADX INFO: compiled from: P2PTradeMarketListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/payment/p2p/trade/P2PTradeMarketListFragment$onViewCreated$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21250g extends RecyclerView.OnScrollListener {
        public C21250g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            ITradeData iTradeData = P2PTradeMarketListFragment.this.f39999Z;
            if (iTradeData != null) {
                iTradeData.mo49141s2(newState != 0);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.p2p.trade.P2PTradeMarketListFragment$h */
    /* JADX INFO: compiled from: P2PTradeMarketListFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21251h implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f40020b;

        public C21251h(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f40020b = function;
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
            return this.f40020b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f40020b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.p2p.trade.P2PTradeMarketListFragment$i */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C21252i extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: o5 */
    public static final Unit m49224o5() {
        C12572a.m23695d("switch_express_tab", null, 0L, 6, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: B3 */
    public boolean mo21464B3() {
        return false;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: C3 */
    public boolean mo15903C3() {
        return false;
    }

    /* JADX INFO: renamed from: R5 */
    public final void m49261R5(boolean z11) {
        boolean z12 = true;
        if (!z11 && this.f40008i0) {
            z12 = false;
        }
        this.f40008i0 = z12;
        m49248G5();
    }

    /* JADX INFO: renamed from: E5 */
    public static final void m49155E5(P2PTradeMarketListFragment p2PTradeMarketListFragment, OtcInfoEntity otcInfoEntity, DialogInterface dialogInterface, int i11) throws JSONException {
        P2PFilterDialog.P2PFilterData p2PFilterDataMo49130Y1;
        ITradeData iTradeData = p2PTradeMarketListFragment.f39999Z;
        if (iTradeData != null) {
            iTradeData.mo49133g2((iTradeData == null || (p2PFilterDataMo49130Y1 = iTradeData.mo49130Y1()) == null) ? null : P2PFilterDialog.P2PFilterData.copy$default(p2PFilterDataMo49130Y1, false, false, null, true, 7, null));
        }
        p2PTradeMarketListFragment.mo15906F3();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pay_side", otcInfoEntity.isBuy() ? "buy" : "sell");
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B7P2P", "showtradableadsclick", "1", jSONObject);
    }

    /* JADX INFO: renamed from: F5 */
    public static final void m49157F5(OtcInfoEntity otcInfoEntity, DialogInterface dialogInterface, int i11) throws JSONException {
        InterfaceC37754f.a.m85130b(C37304a.f82764a, null, null, null, null, 15, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pay_side", otcInfoEntity.isBuy() ? "buy" : "sell");
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B7P2P", "tradabledepositclick", "1", jSONObject);
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m49159H4(OtcInfoEntity otcInfoEntity) {
        FlutterNavigationHelper.f39477a.m48165d(C27041f.m66668h(otcInfoEntity.getId()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m49161I4(P2PTradeMarketListFragment p2PTradeMarketListFragment, OtcInfoEntity otcInfoEntity) {
        MerchantQualificationDialog.Companion companion = MerchantQualificationDialog.f39972t0;
        FragmentManager childFragmentManager = p2PTradeMarketListFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        FoxKingDepositAmount foxKingDepositAmount = otcInfoEntity.getFoxKingDepositAmount();
        String amount = foxKingDepositAmount != null ? foxKingDepositAmount.getAmount() : null;
        FoxKingDepositAmount foxKingDepositAmount2 = otcInfoEntity.getFoxKingDepositAmount();
        companion.showMerchantQualificationDialog(childFragmentManager, new MerchantQualificationDialog.MerchantQualification(amount, foxKingDepositAmount2 != null ? foxKingDepositAmount2.getCurrency() : null, Boolean.valueOf(C27025c.m66566d(Boolean.valueOf(otcInfoEntity.isFoxKingMerchants()))), Boolean.valueOf(C27025c.m66566d(Boolean.valueOf(otcInfoEntity.isGoldMerchants())))));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M5 */
    public static final Unit m49167M5(final P2PTradeMarketListFragment p2PTradeMarketListFragment, final OtcInfoEntity otcInfoEntity, BaseViewHolder viewHolder, final DialogFragmentHelper helper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        final View view = viewHolder.getView(R$id.tv_agree);
        final View view2 = viewHolder.getView(R$id.tv_confirm);
        TextView textView = (TextView) viewHolder.getView(R$id.tv_content);
        ITradeData iTradeData = p2PTradeMarketListFragment.f39999Z;
        String strM66668h = C27041f.m66668h(iTradeData != null ? iTradeData.mo49119K2() : null);
        textView.setText(p2PTradeMarketListFragment.getString(R$string.payment_c2c_advertisement_dialog_content, strM66668h, strM66668h));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        Intrinsics.checkNotNull(textView);
        highlightTextHelper.m54120f(textView, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(p2PTradeMarketListFragment.getColorRes(R$color.primary))));
        View view3 = viewHolder.getView(R$id.iv_cancel);
        Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
        C27046k.m66711z(view3, 0L, new Function0() { // from class: com.kubi.payment.p2p.trade.v1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PTradeMarketListFragment.m49170N5(helper);
            }
        }, 1, null);
        Intrinsics.checkNotNull(view);
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.payment.p2p.trade.w1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PTradeMarketListFragment.m49173O5(view, view2);
            }
        }, 1, null);
        Intrinsics.checkNotNull(view2);
        C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.payment.p2p.trade.x1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PTradeMarketListFragment.m49175P5(this.f40153b, otcInfoEntity, helper);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S5 */
    public static /* synthetic */ void m49179S5(P2PTradeMarketListFragment p2PTradeMarketListFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        p2PTradeMarketListFragment.m49261R5(z11);
    }

    /* JADX INFO: renamed from: U4 */
    public static final Unit m49183U4(P2PTradeMarketListFragment p2PTradeMarketListFragment, Disposable disposable) {
        if (p2PTradeMarketListFragment.f40005f0) {
            C43841b.m96557d("B7p2p_load", "data_load_start", null, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U5 */
    public static final void m49184U5(DialogInterface dialogInterface, int i11) {
        C43852m.m96591c("B7P2P", "paymethodCancelButton", null, null, 12, null);
    }

    /* JADX INFO: renamed from: W4 */
    public static final Unit m49189W4(P2PTradeMarketListFragment p2PTradeMarketListFragment, BasePageEntity basePageEntity) {
        if (p2PTradeMarketListFragment.f40005f0) {
            p2PTradeMarketListFragment.f40005f0 = false;
            C43841b.m96557d("B7p2p_load", "data_load_finish", null, 4, null);
            C43841b.m96557d("B7p2p_load", "page_load_end", null, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X5 */
    public static final Unit m49192X5() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y4 */
    public static final Unit m49194Y4(P2PTradeMarketListFragment p2PTradeMarketListFragment, Throwable th2) {
        if (p2PTradeMarketListFragment.f40005f0) {
            p2PTradeMarketListFragment.f40005f0 = false;
            C43841b.m96555b("B7p2p_load", null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z5 */
    public static final void m49197Z5(final P2PTradeMarketListFragment p2PTradeMarketListFragment, DialogInterface dialogInterface, int i11) throws Exception {
        OtcInfoEntity otcInfoEntity = p2PTradeMarketListFragment.f40000a0;
        if (C27025c.m66566d(otcInfoEntity != null ? Boolean.valueOf(otcInfoEntity.isBuy()) : null)) {
            p2PTradeMarketListFragment.m49256M4();
            return;
        }
        P2PHelper p2PHelper = P2PHelper.f39683a;
        FragmentManager childFragmentManager = p2PTradeMarketListFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        p2PHelper.m48413e(childFragmentManager, LifecycleOwnerKt.getLifecycleScope(p2PTradeMarketListFragment), new Function0() { // from class: com.kubi.payment.p2p.trade.t1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PTradeMarketListFragment.m49199a6(this.f40113b);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0078  */
    /* JADX INFO: renamed from: e5 */
    public static final Boolean m49205e5(P2PTradeMarketListFragment p2PTradeMarketListFragment, ExpressBuyPreCheck.Response response, ExpressBuyPreCheck.AmountInterval amountInterval, ExpressBuyPreCheck.AmountInterval amountInterval2, String it) {
        Boolean boolValueOf;
        boolean z11;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(p2PTradeMarketListFragment.f40008i0 && Intrinsics.areEqual(response.getQuoteType(), "FIAT")) && (p2PTradeMarketListFragment.f40008i0 || !Intrinsics.areEqual(response.getQuoteType(), "CRYPTO"))) {
            return Boolean.TRUE;
        }
        P2PTradeMarketListViewModel p2PTradeMarketListViewModel = p2PTradeMarketListFragment.f40001b0;
        if (p2PTradeMarketListViewModel != null) {
            boolValueOf = Boolean.valueOf(p2PTradeMarketListViewModel.m49302M(it, C27041f.m66668h(amountInterval != null ? amountInterval.getMinAmount() : null), C27041f.m66668h(amountInterval != null ? amountInterval.getMaxAmount() : null)));
        } else {
            boolValueOf = null;
        }
        boolean zM66567e = C27025c.m66567e(boolValueOf, true);
        if (amountInterval2 != null) {
            if (zM66567e) {
                P2PTradeMarketListViewModel p2PTradeMarketListViewModel2 = p2PTradeMarketListFragment.f40001b0;
                z11 = C27025c.m66567e(p2PTradeMarketListViewModel2 != null ? Boolean.valueOf(p2PTradeMarketListViewModel2.m49302M(it, C27041f.m66668h(amountInterval2.getMinAmount()), C27041f.m66668h(amountInterval2.getMaxAmount()))) : null, true);
            }
            zM66567e = z11;
        }
        return Boolean.valueOf(zM66567e);
    }

    /* JADX INFO: renamed from: e6 */
    public static final TradeLimitHelper m49206e6() {
        return new TradeLimitHelper();
    }

    /* JADX INFO: renamed from: g5 */
    public static final boolean m49209g5() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C21248e().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("payment_android_p2p_express", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: h6 */
    public static final boolean m49211h6() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C21252i().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("payment_android_flutter_amount_input_page_enable", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: j5 */
    public static final Unit m49214j5(P2PTradeMarketListFragment p2PTradeMarketListFragment, View it) {
        P2PTradingPairInfo.Info info;
        P2PTradingPairInfo.Info info2;
        Intrinsics.checkNotNullParameter(it, "it");
        P2PExpressQuestionDialog.Companion companion = P2PExpressQuestionDialog.f40141s0;
        P2PTradingPairInfo.Response response = p2PTradeMarketListFragment.f40007h0;
        String expressGuideVideoUrl = null;
        String hedgeMidCurrency = (response == null || (info2 = response.getInfo()) == null) ? null : info2.getHedgeMidCurrency();
        P2PTradingPairInfo.Response response2 = p2PTradeMarketListFragment.f40007h0;
        if (response2 != null && (info = response2.getInfo()) != null) {
            expressGuideVideoUrl = info.getExpressGuideVideoUrl();
        }
        FragmentManager childFragmentManager = p2PTradeMarketListFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.show(hedgeMidCurrency, expressGuideVideoUrl, childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k5 */
    public static final Unit m49216k5(P2PTradeMarketListFragment p2PTradeMarketListFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        m49179S5(p2PTradeMarketListFragment, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l5 */
    public static final Unit m49218l5(P2PTradeMarketListFragment p2PTradeMarketListFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        p2PTradeMarketListFragment.m49259Q5();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m5 */
    public static final Unit m49220m5(P2PTradeMarketListFragment p2PTradeMarketListFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        P2PExpressPriceDialog.Companion companion = P2PExpressPriceDialog.f40140q0;
        FragmentManager childFragmentManager = p2PTradeMarketListFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.show(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n5 */
    public static final Unit m49222n5(P2PTradeMarketListFragment p2PTradeMarketListFragment, View it) {
        C37674q2 c37674q2;
        CurrencyEditView currencyEditView;
        CurrencyEditView currencyEditView2;
        Intrinsics.checkNotNullParameter(it, "it");
        C37674q2 c37674q3 = p2PTradeMarketListFragment.f40004e0;
        String strM66668h = C27041f.m66668h((c37674q3 == null || (currencyEditView2 = c37674q3.f84453d) == null) ? null : currencyEditView2.getCurrencyAmount());
        if ((strM66668h == null || strM66668h.length() == 0) && (c37674q2 = p2PTradeMarketListFragment.f40004e0) != null && (currencyEditView = c37674q2.f84453d) != null) {
            currencyEditView.m49380d("0");
        }
        p2PTradeMarketListFragment.m49260R4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t5 */
    private final void m49230t5() {
        LiveData<ExpressBuyPreCheck.Response> liveDataM49291A;
        LiveData<P2PTradingPairInfo.Response> liveDataM49295E;
        LiveData<String> liveDataM49294D;
        LiveData<OtcInfoEntity> liveDataM49292B;
        LiveData<Throwable> liveDataM94033n;
        LiveData<Boolean> liveDataM94036q;
        P2PTradeMarketListViewModel p2PTradeMarketListViewModel = this.f40001b0;
        if (p2PTradeMarketListViewModel != null && (liveDataM94036q = p2PTradeMarketListViewModel.m94036q()) != null) {
            liveDataM94036q.observe(getViewLifecycleOwner(), new C21251h(new Function1() { // from class: com.kubi.payment.p2p.trade.r0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P2PTradeMarketListFragment.m49232u5(this.f40103b, (Boolean) obj);
                }
            }));
        }
        P2PTradeMarketListViewModel p2PTradeMarketListViewModel2 = this.f40001b0;
        if (p2PTradeMarketListViewModel2 != null && (liveDataM94033n = p2PTradeMarketListViewModel2.m94033n()) != null) {
            liveDataM94033n.observe(getViewLifecycleOwner(), new C21251h(new Function1() { // from class: com.kubi.payment.p2p.trade.c1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P2PTradeMarketListFragment.m49234v5((Throwable) obj);
                }
            }));
        }
        P2PTradeMarketListViewModel p2PTradeMarketListViewModel3 = this.f40001b0;
        if (p2PTradeMarketListViewModel3 != null && (liveDataM49292B = p2PTradeMarketListViewModel3.m49292B()) != null) {
            liveDataM49292B.observe(getViewLifecycleOwner(), new C21251h(new Function1() { // from class: com.kubi.payment.p2p.trade.n1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P2PTradeMarketListFragment.m49236w5(this.f40092b, (OtcInfoEntity) obj);
                }
            }));
        }
        P2PTradeMarketListViewModel p2PTradeMarketListViewModel4 = this.f40001b0;
        if (p2PTradeMarketListViewModel4 != null && (liveDataM49294D = p2PTradeMarketListViewModel4.m49294D()) != null) {
            liveDataM49294D.observe(getViewLifecycleOwner(), new C21251h(new Function1() { // from class: com.kubi.payment.p2p.trade.y1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P2PTradeMarketListFragment.m49240y5(this.f40157b, (String) obj);
                }
            }));
        }
        P2PTradeMarketListViewModel p2PTradeMarketListViewModel5 = this.f40001b0;
        if (p2PTradeMarketListViewModel5 != null && (liveDataM49295E = p2PTradeMarketListViewModel5.m49295E()) != null) {
            liveDataM49295E.observe(getViewLifecycleOwner(), new C21251h(new Function1() { // from class: com.kubi.payment.p2p.trade.b2
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P2PTradeMarketListFragment.m49242z5(this.f40046b, (P2PTradingPairInfo.Response) obj);
                }
            }));
        }
        P2PTradeMarketListViewModel p2PTradeMarketListViewModel6 = this.f40001b0;
        if (p2PTradeMarketListViewModel6 == null || (liveDataM49291A = p2PTradeMarketListViewModel6.m49291A()) == null) {
            return;
        }
        liveDataM49291A.observe(getViewLifecycleOwner(), new C21251h(new Function1() { // from class: com.kubi.payment.p2p.trade.c2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P2PTradeMarketListFragment.m49150A5(this.f40049b, (ExpressBuyPreCheck.Response) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w5 */
    public static final Unit m49236w5(P2PTradeMarketListFragment p2PTradeMarketListFragment, OtcInfoEntity otcInfoEntity) {
        P2PTradeMarketListViewModel p2PTradeMarketListViewModel = p2PTradeMarketListFragment.f40001b0;
        if (C27025c.m66566d(p2PTradeMarketListViewModel != null ? Boolean.valueOf(p2PTradeMarketListViewModel.m49296F(otcInfoEntity.getBlockStatus())) : null)) {
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.notice_prompt).m54153J4(R$string.pay_p2p_black_check_dialog_msg).m54159P4(R$string.cancel, null).m54162S4(R$string.pay_p2p_black_check_dialog_manage, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.p2p.trade.i1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    P2PTradeMarketListFragment.m49238x5(dialogInterface, i11);
                }
            }).m54172c5(p2PTradeMarketListFragment.getChildFragmentManager());
            return Unit.INSTANCE;
        }
        boolean z11 = C27039d.m66647g(otcInfoEntity.getCurrencyBalanceQuantity()) <= 0.0d;
        if (z11) {
            p2PTradeMarketListFragment.m49271d6("CHECK_AD_BALANCE", "-10006:CHECK_AD_BALANCE");
        }
        boolean z12 = C27039d.m66647g(otcInfoEntity.getLegalBalanceQuantity()) < C27039d.m66647g(otcInfoEntity.getLimitMinQuote());
        if (z12) {
            p2PTradeMarketListFragment.m49271d6("CHECK_SELL_LIMIT", "-10008:CHECK_SELL_LIMIT");
        }
        if (z11 || z12) {
            p2PTradeMarketListFragment.showToast(p2PTradeMarketListFragment.getString(R$string.ads_banlace_insufficient));
            p2PTradeMarketListFragment.mo15906F3();
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(C27041f.m66668h(otcInfoEntity.getStatus()), "PUTDOWN")) {
            p2PTradeMarketListFragment.m49271d6("CHECK_AD_STATUS", "-10007:CHECK_AD_STATUS");
            p2PTradeMarketListFragment.showToast(p2PTradeMarketListFragment.getString(R$string.ads_down_resubmit));
            p2PTradeMarketListFragment.mo15906F3();
            return Unit.INSTANCE;
        }
        OtcInfoEntity otcInfoEntity2 = p2PTradeMarketListFragment.f40000a0;
        if (otcInfoEntity2 != null) {
            if (C27025c.m66566d(Boolean.valueOf(otcInfoEntity2.isBuy())) && !p2PTradeMarketListFragment.m49277p5(C27041f.m66668h(otcInfoEntity2.getLegal()))) {
                LifecycleOwnerKt.getLifecycleScope(p2PTradeMarketListFragment).launchWhenStarted(new P2PTradeMarketListFragment$observeData$3$2$1(p2PTradeMarketListFragment, otcInfoEntity2, otcInfoEntity, null));
            } else if (p2PTradeMarketListFragment.m49268c5()) {
                p2PTradeMarketListFragment.m49278q5(otcInfoEntity.getId(), otcInfoEntity.isBuy(), C27041f.m66668h(otcInfoEntity.getCurrency()));
            } else {
                OtcDealFragment.Companion companion = OtcDealFragment.f38042f0;
                Context mContext = p2PTradeMarketListFragment.mContext;
                Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
                Intrinsics.checkNotNull(otcInfoEntity);
                BigDecimal floatPrice = otcInfoEntity2.getFloatPrice();
                OtcDealFragment.Companion.startFragment$default(companion, mContext, otcInfoEntity, floatPrice != null ? floatPrice.toPlainString() : null, null, 8, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x5 */
    public static final void m49238x5(DialogInterface dialogInterface, int i11) {
        FlutterNavigationHelper.f39477a.m48164c();
    }

    /* JADX INFO: renamed from: z5 */
    public static final Unit m49242z5(P2PTradeMarketListFragment p2PTradeMarketListFragment, P2PTradingPairInfo.Response response) {
        p2PTradeMarketListFragment.f40007h0 = response;
        p2PTradeMarketListFragment.m49261R5(true);
        if (!p2PTradeMarketListFragment.m49272f5()) {
            C43852m.m96595g("B7P2P", "expressbuy", "1", null, 8, null);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: A3 */
    public void mo49243A3() {
        SwipeRefreshRecyclerView mSwipeRefreshRecyclerView = this.f46496X;
        if (mSwipeRefreshRecyclerView != null) {
            Intrinsics.checkNotNullExpressionValue(mSwipeRefreshRecyclerView, "mSwipeRefreshRecyclerView");
            if (!mSwipeRefreshRecyclerView.isLaidOut() || mSwipeRefreshRecyclerView.isLayoutRequested()) {
                mSwipeRefreshRecyclerView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC21249f());
            } else if (mSwipeRefreshRecyclerView.getHeight() > 0) {
                this.f46496X.setDragRate(RangesKt.coerceAtLeast(mSwipeRefreshRecyclerView.getHeight() / 3500.0f, 0.5f));
            }
        }
        super.mo49243A3();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: B5 */
    public final void m49244B5(@NotNull OtcInfoEntity item, @NotNull BaseViewHolder helper) throws Exception {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(helper, "helper");
        m49269c6(helper, item);
        if (m49246D5(item)) {
            this.f40000a0 = item;
            m49264W5();
        }
    }

    /* JADX INFO: renamed from: C5 */
    public final void m49245C5(@NotNull String fiatCurrency, @NotNull String cryptoCurrency, @NotNull String tradeType) {
        P2PTradeMarketListViewModel p2PTradeMarketListViewModel;
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        this.f40007h0 = null;
        ITradeData iTradeData = this.f39999Z;
        if (!C27025c.m66566d(iTradeData != null ? Boolean.valueOf(iTradeData.mo49121L()) : null) || (p2PTradeMarketListViewModel = this.f40001b0) == null) {
            return;
        }
        p2PTradeMarketListViewModel.m49300J(fiatCurrency, cryptoCurrency, tradeType);
    }

    @SuppressLint({"KCCyclomaticComplexityCheck"})
    /* JADX INFO: renamed from: D5 */
    public final boolean m49246D5(final OtcInfoEntity otcInfoEntity) throws JSONException {
        P2PTradeMarketListViewModel p2PTradeMarketListViewModel = this.f40001b0;
        if (!C27025c.m66567e(p2PTradeMarketListViewModel != null ? Boolean.valueOf(p2PTradeMarketListViewModel.m49301K(!otcInfoEntity.isBuy())) : null, true)) {
            SecuritySettingDialog.Companion companion = SecuritySettingDialog.f38120x0;
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            companion.show(childFragmentManager, new SecuritySettingDialog.SecuritySetting(false, !otcInfoEntity.isBuy(), true, true, false, null, 49, null));
            m49271d6("CHECK_ACCOUNT_SET", "-10013:CHECK_ACCOUNT_SET");
            return false;
        }
        if (C27025c.m66566d(otcInfoEntity.getSelf())) {
            ToastCompat.m66437C(R$string.p2p_ad_can_not_trade_yourself);
            return false;
        }
        Integer tradeLimitDialogType = otcInfoEntity.getTradeLimitDialogType();
        if (tradeLimitDialogType != null && tradeLimitDialogType.intValue() == 0) {
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54161R4(1).m54167X4(R$string.payment_p2p_list_limit_title).m54156M4(C27041f.m66668h(otcInfoEntity.getTradeLimitTip())).m54162S4(R$string.payment_p2p_only_trade, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.p2p.trade.k1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) throws JSONException {
                    P2PTradeMarketListFragment.m49155E5(this.f40083b, otcInfoEntity, dialogInterface, i11);
                }
            }).m54159P4(R$string.payment_p2p_limit_known, null).m54172c5(getChildFragmentManager());
            m49258Q4(otcInfoEntity);
            m49271d6("CHECK_COUNTERPARTY_Limit", "-10015:CHECK_COUNTERPARTY_Limit");
            return false;
        }
        Integer tradeLimitDialogType2 = otcInfoEntity.getTradeLimitDialogType();
        if (tradeLimitDialogType2 != null && tradeLimitDialogType2.intValue() == 1) {
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54161R4(1).m54167X4(R$string.payment_p2p_list_limit_title).m54156M4(C27041f.m66668h(otcInfoEntity.getTradeLimitTip())).m54162S4(R$string.payment_p2p_limit_known, null).m54172c5(getChildFragmentManager());
            m49258Q4(otcInfoEntity);
            m49271d6("CHECK_COUNTERPARTY_Limit", "-10015:CHECK_COUNTERPARTY_Limit");
            return false;
        }
        String strM66668h = C27041f.m66668h(otcInfoEntity.getOpponentBalanceLimit());
        P2PTradeMarketListViewModel p2PTradeMarketListViewModel2 = this.f40001b0;
        if (C27025c.m66566d(p2PTradeMarketListViewModel2 != null ? Boolean.valueOf(p2PTradeMarketListViewModel2.m49299I(DowngradeExKt.m66535e(strM66668h, null, 1, null))) : null)) {
            return true;
        }
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54161R4(1).m54167X4(R$string.payment_p2p_list_limit_title).m54156M4(getStringRes(R$string.payment_total_balance_limit_tips, strM66668h)).m54162S4(R$string.payment_p2p_limit_deposit, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.p2p.trade.l1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) throws JSONException {
                P2PTradeMarketListFragment.m49157F5(otcInfoEntity, dialogInterface, i11);
            }
        }).m54159P4(R$string.payment_p2p_limit_known, null).m54172c5(getChildFragmentManager());
        m49258Q4(otcInfoEntity);
        m49271d6("CHECK_DEEPASSET", "-10014:CHECK_DEEPASSET");
        return false;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: G4, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@Nullable final BaseViewHolder baseViewHolder, @NotNull final OtcInfoEntity item) {
        GradientDrawable gradientDrawable;
        String stringRes;
        String dealOrderRate;
        Intrinsics.checkNotNullParameter(item, "item");
        if (baseViewHolder != null) {
            int i11 = R$id.tvTitle;
            Integer additionalAd = item.getAdditionalAd();
            baseViewHolder.setGone(i11, additionalAd != null && C27039d.m66650j(additionalAd) == 1);
            int i12 = R$id.tvSubtitle;
            Integer additionalAd2 = item.getAdditionalAd();
            baseViewHolder.setGone(i12, additionalAd2 != null && C27039d.m66650j(additionalAd2) == 1);
            baseViewHolder.setText(i12, m49275h5() ? getStringRes(R$string.payment_recommend_ad_less_des, new Object[0]) : getStringRes(R$string.payment_recommend_ad_no_des, new Object[0]));
            boolean zAreEqual = Intrinsics.areEqual(C27041f.m66668h(item.getTopTag()), "1");
            int i13 = R$id.tvTopPicks;
            baseViewHolder.setGone(i13, zAreEqual);
            View view = baseViewHolder.itemView;
            if (zAreEqual) {
                gradientDrawable = new GradientDrawable();
                gradientDrawable.setStroke(MathKt.roundToInt(C27040e.m66657a(0.5f)), ContextCompat.getColor(this.mContext, R$color.brandGreen));
                gradientDrawable.setCornerRadius(C27040e.m66657a(12.0f));
            } else {
                gradientDrawable = null;
            }
            view.setBackground(gradientDrawable);
            baseViewHolder.setText(i13, C27041f.m66668h(item.getTopTagTip()));
            TextView textView = (TextView) baseViewHolder.getView(R$id.tv_new_user_tag);
            if (textView != null) {
                FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                C42304i.m92850g(textView, childFragmentManager, item.getNewUserTag(), item.getNewUserTagTip());
            }
            int i14 = R$id.tvAvatar;
            baseViewHolder.setText(i14, C27041f.m66668h(item.getLetter()));
            View view2 = baseViewHolder.getView(R$id.viewStatus);
            P2PTradeMarketListViewModel p2PTradeMarketListViewModel = this.f40001b0;
            view2.setActivated(C27025c.m66566d(p2PTradeMarketListViewModel != null ? Boolean.valueOf(p2PTradeMarketListViewModel.m49298H(item)) : null));
            int i15 = R$id.tv_name;
            baseViewHolder.setText(i15, C27041f.m66668h(item.getNickName()));
            View view3 = baseViewHolder.getView(i14);
            Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
            View view4 = baseViewHolder.getView(i15);
            Intrinsics.checkNotNullExpressionValue(view4, "getView(...)");
            C27046k.m66681D(new View[]{view3, view4}, new Function0() { // from class: com.kubi.payment.p2p.trade.u0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return P2PTradeMarketListFragment.m49159H4(item);
                }
            });
            int i16 = R$id.tv_amount;
            StringBuilder sb2 = new StringBuilder();
            BigDecimal currencyBalanceQuantity = item.getCurrencyBalanceQuantity();
            sb2.append(C27041f.m66668h(currencyBalanceQuantity != null ? currencyBalanceQuantity.toPlainString() : null));
            sb2.append(' ');
            sb2.append(item.getCurrency());
            baseViewHolder.setText(i16, sb2.toString());
            int i17 = R$id.tv_limit;
            StringBuilder sb3 = new StringBuilder();
            BigDecimal limitMinQuote = item.getLimitMinQuote();
            sb3.append(C27041f.m66668h(limitMinQuote != null ? limitMinQuote.toPlainString() : null));
            sb3.append('-');
            BigDecimal limitMaxQuote = item.getLimitMaxQuote();
            sb3.append(C27041f.m66668h(limitMaxQuote != null ? limitMaxQuote.toPlainString() : null));
            sb3.append(' ');
            sb3.append(item.getLegal());
            baseViewHolder.setText(i17, sb3.toString());
            int i18 = R$id.tv_price;
            BigDecimal floatPrice = item.getFloatPrice();
            baseViewHolder.setText(i18, C27041f.m66668h(floatPrice != null ? floatPrice.toPlainString() : null));
            int i19 = R$id.tv_price_currency;
            String strM89967e = C41016c.m89967e(C27041f.m66668h(item.getLegal()));
            Intrinsics.checkNotNullExpressionValue(strM89967e, "getCurrentCurrencySymbol(...)");
            baseViewHolder.setText(i19, StringsKt.replace$default(strM89967e, "- -", "", false, 4, (Object) null));
            P2PTradeMarketListViewModel p2PTradeMarketListViewModel2 = this.f40001b0;
            boolean zM66566d = C27025c.m66566d(p2PTradeMarketListViewModel2 != null ? Boolean.valueOf(p2PTradeMarketListViewModel2.m49297G(item)) : null);
            int i21 = R$id.tv_button;
            if (zM66566d) {
                stringRes = getStringRes(R$string.payment_p2p_restricted, new Object[0]);
            } else {
                stringRes = item.isBuy() ? getStringRes(R$string.otc_buy, new Object[0]) : getStringRes(R$string.otc_sell, new Object[0]);
            }
            baseViewHolder.setText(i21, stringRes);
            baseViewHolder.setText(R$id.tv_order_num, getString(R$string.payment_unit_bill, C27041f.m66668h(item.getDealOrderNum())));
            baseViewHolder.setText(R$id.tv_order_rate, C27041f.m66668h(item.getDealOrderRate()));
            int i22 = R$id.view_order_info;
            String dealOrderNum = item.getDealOrderNum();
            baseViewHolder.setVisible(i22, (dealOrderNum == null || dealOrderNum.length() == 0 || (dealOrderRate = item.getDealOrderRate()) == null || dealOrderRate.length() == 0) ? false : true);
            int i23 = R$id.iv_fox_king;
            baseViewHolder.setGone(i23, C27025c.m66566d(Boolean.valueOf(item.isFoxKingMerchants())));
            int i24 = R$id.iv_huangjin_business;
            baseViewHolder.setGone(i24, C27025c.m66566d(Boolean.valueOf(item.isGoldMerchants())));
            baseViewHolder.setBackgroundRes(i21, item.isBuy() ? R$drawable.payment_selector_primary_bg : R$drawable.payment_selector_secondary_bg);
            baseViewHolder.setEnabled(i21, !zM66566d);
            baseViewHolder.setTextColor(i21, zM66566d ? getColorRes(R$color.c_text) : getColorRes(R$color.c_white));
            View view5 = baseViewHolder.getView(i23);
            Intrinsics.checkNotNullExpressionValue(view5, "getView(...)");
            View view6 = baseViewHolder.getView(i24);
            Intrinsics.checkNotNullExpressionValue(view6, "getView(...)");
            View view7 = baseViewHolder.getView(R$id.iv_approve_business);
            Intrinsics.checkNotNullExpressionValue(view7, "getView(...)");
            C27046k.m66681D(new View[]{view5, view6, view7}, new Function0() { // from class: com.kubi.payment.p2p.trade.v0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return P2PTradeMarketListFragment.m49161I4(this.f40119b, item);
                }
            });
            View view8 = baseViewHolder.getView(R$id.view_root);
            Intrinsics.checkNotNullExpressionValue(view8, "getView(...)");
            C27046k.m66711z(view8, 0L, new Function0() { // from class: com.kubi.payment.p2p.trade.w0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return P2PTradeMarketListFragment.m49163J4(this.f40147b, item, baseViewHolder);
                }
            }, 1, null);
            m49252K4(baseViewHolder, item);
        }
    }

    /* JADX INFO: renamed from: H5 */
    public final void m49249H5() {
        CurrencyEditView currencyEditView;
        C37674q2 c37674q2 = this.f40004e0;
        if (c37674q2 == null || (currencyEditView = c37674q2.f84453d) == null) {
            return;
        }
        currencyEditView.m49380d("");
    }

    /* JADX INFO: renamed from: I5 */
    public final void m49250I5(String str) {
        C46392a.m102328k(PaymentStorageId.f40364a.m49822A(str), true);
    }

    /* JADX INFO: renamed from: J5 */
    public final void m49251J5(@NotNull ITradeData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f39999Z = data;
    }

    /* JADX INFO: renamed from: K4 */
    public final void m49252K4(BaseViewHolder baseViewHolder, OtcInfoEntity otcInfoEntity) {
        ArrayList arrayList;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) baseViewHolder.getView(R$id.view_pay_types);
        List<AdPayType> adPayTypes = otcInfoEntity.getAdPayTypes();
        ArrayList arrayList2 = null;
        if (adPayTypes != null) {
            arrayList = new ArrayList();
            for (Object obj : adPayTypes) {
                if (Intrinsics.areEqual(((AdPayType) obj).getPayTypeCode(), "OTHER")) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        List listM66560c = C27024b.m66560c(arrayList);
        List<AdPayType> adPayTypes2 = otcInfoEntity.getAdPayTypes();
        if (adPayTypes2 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : adPayTypes2) {
                if (!Intrinsics.areEqual(((AdPayType) obj2).getPayTypeCode(), "OTHER")) {
                    arrayList3.add(obj2);
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayList3) {
                if (hashSet.add(((AdPayType) obj3).getPayTypeCode())) {
                    arrayList4.add(obj3);
                }
            }
            arrayList2 = arrayList4;
        }
        List mutableList = CollectionsKt.toMutableList((Collection) C27024b.m66560c(arrayList2));
        mutableList.addAll(listM66560c);
        int iM66658b = C27040e.m66658b(8);
        linearLayoutCompat.removeAllViews();
        int color = ContextCompat.getColor(this.mContext, R$color.c_text40);
        int i11 = 0;
        for (Object obj4 : mutableList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            AdPayType adPayType = (AdPayType) obj4;
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            PaymentMethodTextView paymentMethodTextView = new PaymentMethodTextView(mContext);
            paymentMethodTextView.setText(C27041f.m66668h(adPayType.getPayTypeNameEn()));
            paymentMethodTextView.setTextSize(2, 11.0f);
            paymentMethodTextView.setTextColor(color);
            paymentMethodTextView.setDrawableColor(adPayType.getColor());
            paymentMethodTextView.setTypeface(ResourcesCompat.getFont(this.mContext, R$font.regular));
            LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-2, -2);
            if (i11 > 0) {
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = iM66658b;
            }
            Unit unit = Unit.INSTANCE;
            linearLayoutCompat.addView(paymentMethodTextView, layoutParams);
            i11 = i12;
        }
        linearLayoutCompat.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC21244a(linearLayoutCompat, iM66658b, this, mutableList));
    }

    /* JADX INFO: renamed from: K5 */
    public final void m49253K5() {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54156M4(getStringRes(R$string.payment_no_optional_ad, new Object[0])).m54163T4(getStringRes(R$string.payment_ok, new Object[0]), null).m54172c5(getChildFragmentManager());
    }

    /* JADX INFO: renamed from: L4 */
    public final C5392c m49254L4(List<AdPayType> list) {
        View viewInflate = LayoutInflater.from(this.mContext).inflate(R$layout.payment_method_pop_up_layout, (ViewGroup) null, false);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type com.cpiz.android.bubbleview.BubbleFrameLayout");
        BubbleFrameLayout bubbleFrameLayout = (BubbleFrameLayout) viewInflate;
        BubbleLinearLayout bubbleLinearLayout = (BubbleLinearLayout) bubbleFrameLayout.findViewById(R$id.pay_type_container);
        int color = ContextCompat.getColor(this.mContext, R$color.c_text40);
        for (AdPayType adPayType : list) {
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            PaymentMethodTextView paymentMethodTextView = new PaymentMethodTextView(mContext);
            paymentMethodTextView.setText(adPayType.getPayTypeCode());
            paymentMethodTextView.setTypeface(ResourcesCompat.getFont(this.mContext, R$font.regular));
            paymentMethodTextView.setTextSize(2, 11.0f);
            paymentMethodTextView.setTextColor(color);
            paymentMethodTextView.setDrawableColor(adPayType.getColor());
            paymentMethodTextView.setMinWidth(C27040e.m66658b(160));
            LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-2, -2);
            ((LinearLayout.LayoutParams) layoutParams).topMargin = C27040e.m66658b(8);
            Unit unit = Unit.INSTANCE;
            bubbleLinearLayout.addView(paymentMethodTextView, layoutParams);
        }
        bubbleFrameLayout.setFillColor(ContextCompat.getColor(this.mContext, R$color.c_bulletLayer));
        bubbleFrameLayout.setArrowWidth(C27040e.m66657a(12.0f));
        bubbleFrameLayout.setArrowHeight(C27040e.m66657a(6.0f));
        C21247d c21247d = new C21247d(bubbleFrameLayout);
        c21247d.m7076j(true);
        c21247d.m7077k(true);
        c21247d.setBackgroundDrawable(ContextCompat.getDrawable(this.mContext, R$drawable.shape_overlay_8r));
        return c21247d;
    }

    /* JADX INFO: renamed from: L5 */
    public final void m49255L5(final OtcInfoEntity otcInfoEntity) {
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.botc_limit_withdraw_dialog, 0, 0, 0, false, false, false, false, false, 510, null).m54237f4(new Function2() { // from class: com.kubi.payment.p2p.trade.s1
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return P2PTradeMarketListFragment.m49167M5(this.f40109b, otcInfoEntity, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(childFragmentManager, "cancelDialog");
    }

    /* JADX INFO: renamed from: M4 */
    public final void m49256M4() throws Exception {
        final OtcInfoEntity otcInfoEntity = this.f40000a0;
        if (otcInfoEntity != null) {
            C38019j.f85625a.m85901j(this, otcInfoEntity.isBuy(), new Consumer() { // from class: com.kubi.payment.p2p.trade.r1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    P2PTradeMarketListFragment.m49169N4(this.f40104b, otcInfoEntity, this, (Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: P4 */
    public final void m49257P4() {
        ConstraintLayout constraintLayout;
        AppCompatImageView appCompatImageView;
        ConstraintLayout constraintLayout2;
        AppCompatImageView appCompatImageView2;
        if (this.f40006g0) {
            C37674q2 c37674q2 = this.f40004e0;
            if (c37674q2 != null && (appCompatImageView = c37674q2.f84455f) != null) {
                appCompatImageView.setImageResource(R$drawable.ic2_arrow_down_16);
            }
            C37674q2 c37674q3 = this.f40004e0;
            if (c37674q3 == null || (constraintLayout = c37674q3.f84451b) == null) {
                return;
            }
            C27046k.m66700o(constraintLayout);
            return;
        }
        C37674q2 c37674q4 = this.f40004e0;
        if (c37674q4 != null && (appCompatImageView2 = c37674q4.f84455f) != null) {
            appCompatImageView2.setImageResource(R$drawable.ic2_arrow_up_16);
        }
        C37674q2 c37674q5 = this.f40004e0;
        if (c37674q5 == null || (constraintLayout2 = c37674q5.f84451b) == null) {
            return;
        }
        C27046k.m66685H(constraintLayout2);
    }

    /* JADX INFO: renamed from: Q4 */
    public final void m49258Q4(OtcInfoEntity otcInfoEntity) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pay_side", otcInfoEntity.isBuy() ? "buy" : "sell");
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e("B7P2P", "tradelimitpopup", "1", jSONObject);
    }

    /* JADX INFO: renamed from: Q5 */
    public final void m49259Q5() {
        this.f40006g0 = !this.f40006g0;
        C46392a.m102328k(PaymentStorageId.f40364a.m49837o(), this.f40006g0);
        m49248G5();
    }

    /* JADX INFO: renamed from: R4 */
    public final void m49260R4() {
        CurrencyEditView currencyEditView;
        P2PTradeMarketListViewModel p2PTradeMarketListViewModel = this.f40001b0;
        if (!C27025c.m66567e(p2PTradeMarketListViewModel != null ? Boolean.valueOf(P2PTradeMarketListViewModel.m49282L(p2PTradeMarketListViewModel, false, 1, null)) : null, true)) {
            SecuritySettingDialog.Companion companion = SecuritySettingDialog.f38120x0;
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            companion.show(childFragmentManager, new SecuritySettingDialog.SecuritySetting(false, false, true, true, false, null, 51, null));
            return;
        }
        P2PTradeMarketListViewModel p2PTradeMarketListViewModel2 = this.f40001b0;
        if (p2PTradeMarketListViewModel2 != null) {
            ITradeData iTradeData = this.f39999Z;
            String strM66668h = C27041f.m66668h(iTradeData != null ? iTradeData.mo49119K2() : null);
            ITradeData iTradeData2 = this.f39999Z;
            String strM66668h2 = C27041f.m66668h(iTradeData2 != null ? iTradeData2.mo49132e1() : null);
            String str = this.f40008i0 ? "FIAT" : "CRYPTO";
            C37674q2 c37674q2 = this.f40004e0;
            String strM66668h3 = C27041f.m66668h((c37674q2 == null || (currencyEditView = c37674q2.f84453d) == null) ? null : currencyEditView.getCurrencyAmount());
            ITradeData iTradeData3 = this.f39999Z;
            p2PTradeMarketListViewModel2.m49303z(strM66668h, strM66668h2, str, strM66668h3, C27025c.m66567e(iTradeData3 != null ? Boolean.valueOf(iTradeData3.mo49121L()) : null, true) ? "BUY" : "SELL");
        }
    }

    /* JADX INFO: renamed from: S4 */
    public final P2PWebService.a m49262S4() {
        return (P2PWebService.a) this.f40003d0.getValue();
    }

    /* JADX INFO: renamed from: T5 */
    public final void m49263T5(OtcInfoEntity otcInfoEntity) {
        LimitDays limitDays;
        LimitDays limitDays2;
        OtcUserManager otcUserManager = OtcUserManager.f38144a;
        HashMap<String, LimitDays> userKycDayLimitConfigs = otcUserManager.m45490j().getUserKycDayLimitConfigs();
        if (!C27025c.m66566d((userKycDayLimitConfigs == null || (limitDays2 = userKycDayLimitConfigs.get(otcInfoEntity.getLegal())) == null) ? null : Boolean.valueOf(limitDays2.getSatisfyRegisterDayLimit()))) {
            AlertDialogFragmentHelper alertDialogFragmentHelperM54167X4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.notice_prompt);
            C27017c c27017c = C27017c.f54310a;
            int i11 = R$string.register_time_limit;
            HashMap<String, LimitDays> userKycDayLimitConfigs2 = otcUserManager.m45490j().getUserKycDayLimitConfigs();
            alertDialogFragmentHelperM54167X4.m54156M4(c27017c.m66516f(i11, Integer.valueOf(C27039d.m66650j((userKycDayLimitConfigs2 == null || (limitDays = userKycDayLimitConfigs2.get(otcInfoEntity.getLegal())) == null) ? null : Integer.valueOf(limitDays.getLowerRegisterDays()))))).m54162S4(R$string.already_know, null).m54172c5(getChildFragmentManager());
            m49271d6("CHECK_REGISTER_TIME", "-10005:CHECK_REGISTER_TIME");
            return;
        }
        if (!otcInfoEntity.isBuy() && otcInfoEntity.notMatchPayType(otcUserManager.m45490j().getSupportPayWay())) {
            C43852m.m96595g("B7P2P", "paymethodPopUp", null, null, 12, null);
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.notice_prompt).m54153J4(R$string.recieve_method_not_match).m54159P4(R$string.cancel, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.p2p.trade.z1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i12) {
                    P2PTradeMarketListFragment.m49184U5(dialogInterface, i12);
                }
            }).m54162S4(R$string.go_set, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.p2p.trade.a2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i12) {
                    P2PTradeMarketListFragment.m49187V5(this.f40042b, dialogInterface, i12);
                }
            }).m54172c5(getChildFragmentManager());
            m49271d6("CHECK_SELL_PAYS", "-10010:CHECK_SELL_PAYS");
        } else {
            P2PTradeMarketListViewModel p2PTradeMarketListViewModel = this.f40001b0;
            if (p2PTradeMarketListViewModel != null) {
                p2PTradeMarketListViewModel.m49293C(C27041f.m66668h(otcInfoEntity.getId()));
            }
        }
    }

    /* JADX INFO: renamed from: W5 */
    public final void m49264W5() throws Exception {
        OtcDepend otcDepend = OtcDepend.f38138a;
        OtcDepend.m45451d(otcDepend, null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.payment.p2p.trade.m1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PTradeMarketListFragment.m49192X5();
            }
        }), 1, null);
        if (!otcDepend.m45466o()) {
            m49271d6("CHECK_LOGIN", "-10000:CHECK_LOGIN");
            return;
        }
        OtcInfoEntity otcInfoEntity = this.f40000a0;
        if (C27025c.m66566d(otcInfoEntity != null ? Boolean.valueOf(otcInfoEntity.isLimitMerchants()) : null)) {
            m49271d6("CHECK_MERCHANT", "-10001:CHECK_MERCHANT");
            ToastCompat.m66441G(getString(R$string.otc_ad_target_limit), new Object[0]);
            return;
        }
        OtcInfoEntity otcInfoEntity2 = this.f40000a0;
        String strM66668h = C27041f.m66668h(otcInfoEntity2 != null ? otcInfoEntity2.getTradeLimitTip() : null);
        if (strM66668h.length() > 0) {
            ToastCompat.m66441G(strM66668h, new Object[0]);
            return;
        }
        ITradeData iTradeData = this.f39999Z;
        String str = "USD";
        if (!Intrinsics.areEqual(iTradeData != null ? iTradeData.mo49119K2() : null, "USD") || OtcUserManager.f38144a.m45490j().isUS()) {
            ITradeData iTradeData2 = this.f39999Z;
            str = "CAD";
            if (!Intrinsics.areEqual(iTradeData2 != null ? iTradeData2.mo49119K2() : null, "CAD") || OtcUserManager.f38144a.m45490j().isCA()) {
                str = "";
            }
        }
        if (str.length() > 0) {
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.notice_prompt).m54156M4(getString(R$string.kyc_mismatch, str, str)).m54159P4(R$string.f37116no, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.p2p.trade.o1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    P2PTradeMarketListFragment.m49195Y5(dialogInterface, i11);
                }
            }).m54162S4(R$string.yes, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.p2p.trade.p1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) throws Exception {
                    P2PTradeMarketListFragment.m49197Z5(this.f40099b, dialogInterface, i11);
                }
            }).m54172c5(getChildFragmentManager());
            return;
        }
        OtcInfoEntity otcInfoEntity3 = this.f40000a0;
        if (C27025c.m66566d(otcInfoEntity3 != null ? Boolean.valueOf(otcInfoEntity3.isBuy()) : null)) {
            m49256M4();
            return;
        }
        P2PHelper p2PHelper = P2PHelper.f39683a;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        p2PHelper.m48413e(childFragmentManager, LifecycleOwnerKt.getLifecycleScope(this), new Function0() { // from class: com.kubi.payment.p2p.trade.q1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PTradeMarketListFragment.m49201b6(this.f40101b);
            }
        });
    }

    /* JADX INFO: renamed from: Z4 */
    public final boolean m49265Z4() {
        return ((Boolean) this.f40010k0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: a5 */
    public final String m49266a5() {
        ITradeData iTradeData = this.f39999Z;
        return (C27025c.m66566d(iTradeData != null ? Boolean.valueOf(iTradeData.mo49121L()) : null) ? P2PTradingPairInfo.TradeTypeEnum.SELL : P2PTradingPairInfo.TradeTypeEnum.BUY).getType();
    }

    /* JADX INFO: renamed from: b5 */
    public final TradeLimitHelper m49267b5() {
        return (TradeLimitHelper) this.f40002c0.getValue();
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m49268c5() {
        return ((Boolean) this.f40009j0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: d6 */
    public final void m49271d6(String str, String str2) {
        IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
        P2PTrackData p2PTrackData = new P2PTrackData(m49266a5());
        ITradeData iTradeData = this.f39999Z;
        p2PTrackData.setFiatCurrency(C27041f.m66668h(iTradeData != null ? iTradeData.mo49119K2() : null));
        Unit unit = Unit.INSTANCE;
        track.mo49801g(str, false, str2, p2PTrackData);
    }

    /* JADX INFO: renamed from: f5 */
    public final boolean m49272f5() {
        P2PTradingPairInfo.Response response = this.f40007h0;
        if (response != null) {
            return (response != null ? response.getInfo() : null) == null;
        }
        return true;
    }

    /* JADX INFO: renamed from: f6 */
    public final void m49273f6() {
        ConstraintLayout constraintLayout;
        BaseTextView baseTextView;
        ConstraintLayout constraintLayout2;
        LinearLayout root;
        LinearLayout root2;
        ConstraintLayout constraintLayout3;
        BaseTextView baseTextView2;
        ConstraintLayout constraintLayout4;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        LinearLayout root3;
        if (!this.f46495W.getData().isEmpty()) {
            if (m49272f5()) {
                C37674q2 c37674q2 = this.f40004e0;
                if (c37674q2 == null || (root2 = c37674q2.getRoot()) == null) {
                    return;
                }
                C27046k.m66700o(root2);
                return;
            }
            C37674q2 c37674q3 = this.f40004e0;
            if (c37674q3 != null && (root = c37674q3.getRoot()) != null) {
                C27046k.m66685H(root);
            }
            if (m49265Z4()) {
                C37674q2 c37674q4 = this.f40004e0;
                if (c37674q4 != null && (constraintLayout2 = c37674q4.f84452c) != null) {
                    C27046k.m66700o(constraintLayout2);
                }
            } else {
                C37674q2 c37674q5 = this.f40004e0;
                if (c37674q5 != null && (constraintLayout = c37674q5.f84452c) != null) {
                    C27046k.m66685H(constraintLayout);
                }
            }
            C37674q2 c37674q6 = this.f40004e0;
            if (c37674q6 == null || (baseTextView = c37674q6.f84458i) == null) {
                return;
            }
            C27046k.m66700o(baseTextView);
            return;
        }
        if (m49272f5()) {
            C37674q2 c37674q7 = this.f40004e0;
            if (c37674q7 == null || (root3 = c37674q7.getRoot()) == null) {
                return;
            }
            C27046k.m66700o(root3);
            return;
        }
        showContent();
        C37674q2 c37674q8 = this.f40004e0;
        if (c37674q8 != null && (baseTextView4 = c37674q8.f84458i) != null) {
            C27046k.m66685H(baseTextView4);
        }
        if (m49265Z4()) {
            C37674q2 c37674q9 = this.f40004e0;
            if (c37674q9 != null && (baseTextView3 = c37674q9.f84458i) != null) {
                baseTextView3.setText(getStringRes(R$string.payment_p2p_exprerss_match_ad_des, new Object[0]));
            }
            C37674q2 c37674q10 = this.f40004e0;
            if (c37674q10 == null || (constraintLayout4 = c37674q10.f84452c) == null) {
                return;
            }
            C27046k.m66700o(constraintLayout4);
            return;
        }
        C37674q2 c37674q11 = this.f40004e0;
        if (c37674q11 != null && (baseTextView2 = c37674q11.f84458i) != null) {
            baseTextView2.setText(getStringRes(R$string.payment_p2p_express_mode_only, new Object[0]));
        }
        C37674q2 c37674q12 = this.f40004e0;
        if (c37674q12 == null || (constraintLayout3 = c37674q12.f84452c) == null) {
            return;
        }
        C27046k.m66685H(constraintLayout3);
    }

    /* JADX INFO: renamed from: g6 */
    public final void m49274g6() {
        CurrencyEditView currencyEditView;
        BaseTextView baseTextView;
        DashedUnderlineTextView dashedUnderlineTextView;
        String price;
        P2PTradingPairInfo.Info info;
        CurrencyEditView currencyEditView2;
        BaseTextView baseTextView2;
        CurrencyEditView currencyEditView3;
        int iM66651k;
        P2PTradingPairInfo.Info info2;
        P2PTradingPairInfo.Info info3;
        C37674q2 c37674q2 = this.f40004e0;
        if (c37674q2 != null && (currencyEditView3 = c37674q2.f84453d) != null) {
            if (this.f40008i0) {
                P2PTradingPairInfo.Response response = this.f40007h0;
                iM66651k = C27039d.m66651k((response == null || (info3 = response.getInfo()) == null) ? null : info3.getFiatPrecision(), 2);
            } else {
                P2PTradingPairInfo.Response response2 = this.f40007h0;
                iM66651k = C27039d.m66651k((response2 == null || (info2 = response2.getInfo()) == null) ? null : info2.getCryptoPrecision(), 8);
            }
            currencyEditView3.m49382f(new InputFilter[]{new C27056j0(iM66651k)});
        }
        if (this.f40008i0) {
            C37674q2 c37674q3 = this.f40004e0;
            if (c37674q3 != null && (baseTextView2 = c37674q3.f84457h) != null) {
                baseTextView2.setText(getString(R$string.payment_by_fiat));
            }
            C37674q2 c37674q4 = this.f40004e0;
            if (c37674q4 != null && (currencyEditView2 = c37674q4.f84453d) != null) {
                ITradeData iTradeData = this.f39999Z;
                currencyEditView2.m49381e(C27041f.m66668h(iTradeData != null ? iTradeData.mo49119K2() : null));
            }
        } else {
            C37674q2 c37674q5 = this.f40004e0;
            if (c37674q5 != null && (baseTextView = c37674q5.f84457h) != null) {
                baseTextView.setText(getString(R$string.payment_by_crypto));
            }
            C37674q2 c37674q6 = this.f40004e0;
            if (c37674q6 != null && (currencyEditView = c37674q6.f84453d) != null) {
                ITradeData iTradeData2 = this.f39999Z;
                currencyEditView.m49381e(C27041f.m66668h(iTradeData2 != null ? iTradeData2.mo49132e1() : null));
            }
        }
        C37674q2 c37674q7 = this.f40004e0;
        if (c37674q7 == null || (dashedUnderlineTextView = c37674q7.f84460k) == null) {
            return;
        }
        int i11 = R$string.payment_reference_price_text;
        ITradeData iTradeData3 = this.f39999Z;
        String strM66668h = C27041f.m66668h(iTradeData3 != null ? iTradeData3.mo49132e1() : null);
        P2PTradingPairInfo.Response response3 = this.f40007h0;
        if (response3 == null || (info = response3.getInfo()) == null || (price = info.getPrice()) == null) {
            price = C33820nf.f71144W;
        }
        ITradeData iTradeData4 = this.f39999Z;
        dashedUnderlineTextView.setText(getString(i11, "1", strM66668h, price, C27041f.m66668h(iTradeData4 != null ? iTradeData4.mo49119K2() : null)));
    }

    /* JADX INFO: renamed from: h5 */
    public final boolean m49275h5() {
        List data = this.f46495W.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        if (data != null && data.isEmpty()) {
            return false;
        }
        Iterator it = data.iterator();
        while (it.hasNext()) {
            Integer additionalAd = ((OtcInfoEntity) it.next()).getAdditionalAd();
            if (additionalAd != null && C27039d.m66650j(additionalAd) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i5 */
    public final void m49276i5() {
        C37674q2 c37674q2;
        BaseTextView baseTextView;
        KcPrimaryButton kcPrimaryButton;
        DashedUnderlineTextView dashedUnderlineTextView;
        AppCompatImageView appCompatImageView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        C37674q2 c37674q3 = this.f40004e0;
        if (c37674q3 != null && (baseTextView3 = c37674q3.f84461l) != null) {
            ViewExtKt.m66575f(baseTextView3, new Function1() { // from class: com.kubi.payment.p2p.trade.b1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P2PTradeMarketListFragment.m49214j5(this.f40045b, (View) obj);
                }
            });
        }
        C37674q2 c37674q4 = this.f40004e0;
        if (c37674q4 != null && (baseTextView2 = c37674q4.f84457h) != null) {
            ViewExtKt.m66575f(baseTextView2, new Function1() { // from class: com.kubi.payment.p2p.trade.d1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P2PTradeMarketListFragment.m49216k5(this.f40052b, (View) obj);
                }
            });
        }
        C37674q2 c37674q5 = this.f40004e0;
        if (c37674q5 != null && (appCompatImageView = c37674q5.f84455f) != null) {
            ViewExtKt.m66575f(appCompatImageView, new Function1() { // from class: com.kubi.payment.p2p.trade.e1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P2PTradeMarketListFragment.m49218l5(this.f40055b, (View) obj);
                }
            });
        }
        C37674q2 c37674q6 = this.f40004e0;
        if (c37674q6 != null && (dashedUnderlineTextView = c37674q6.f84460k) != null) {
            ViewExtKt.m66575f(dashedUnderlineTextView, new Function1() { // from class: com.kubi.payment.p2p.trade.f1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P2PTradeMarketListFragment.m49220m5(this.f40059b, (View) obj);
                }
            });
        }
        C37674q2 c37674q7 = this.f40004e0;
        if (c37674q7 != null && (kcPrimaryButton = c37674q7.f84454e) != null) {
            ViewExtKt.m66575f(kcPrimaryButton, new Function1() { // from class: com.kubi.payment.p2p.trade.g1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P2PTradeMarketListFragment.m49222n5(this.f40070b, (View) obj);
                }
            });
        }
        if (!m49265Z4() || (c37674q2 = this.f40004e0) == null || (baseTextView = c37674q2.f84458i) == null) {
            return;
        }
        C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.payment.p2p.trade.h1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PTradeMarketListFragment.m49224o5();
            }
        }, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Application application = BaseApplication.INSTANCE.get();
        this.f40001b0 = (P2PTradeMarketListViewModel) new ViewModelProvider(this, new P2PViewModelFactory(P2PServiceLocator.m48466d(application), application)).get(P2PTradeMarketListViewModel.class);
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.f46496X.setBackgroundResource(R$color.c_overlay);
        this.f46496X.getRecyclerView().addOnScrollListener(new C21250g());
        if (RemoteConfigHelper.f39546a.m48249a()) {
            this.f46496X.getRecyclerView().addItemDecoration(new EndItemDecoration((int) TypedValueCompat.dpToPx(84.0f, getResources().getDisplayMetrics())));
        }
        m49230t5();
    }

    /* JADX INFO: renamed from: p5 */
    public final boolean m49277p5(String str) {
        return C46392a.m102322d(PaymentStorageId.f40364a.m49822A(str), false);
    }

    /* JADX INFO: renamed from: q5 */
    public final void m49278q5(String str, boolean z11, String str2) {
        Router.f46192a.m56184f(FlutterUtils.m48217b(FlutterUtils.f39512a, "payment/p2p/amount/input", false, 2, null)).m4038a("adId", str).m4038a("isBuy", z11 ? "1" : "0").m4038a("cryptoCurrency", str2).m4048k();
    }

    /* JADX INFO: renamed from: r5 */
    public final void m49279r5() {
        CurrencyEditView currencyEditView;
        Bundle bundle = new Bundle();
        bundle.putString(BaseActivity.TITLE_BAR, CredentialEntry.FALSE_STRING);
        String type = P2PTradingPairInfo.TradeTypeEnum.BUY.getType();
        ITradeData iTradeData = this.f39999Z;
        String currencyAmount = null;
        String strM66669i = C27041f.m66669i(iTradeData != null ? iTradeData.mo49119K2() : null, "USD");
        ITradeData iTradeData2 = this.f39999Z;
        String strM66669i2 = C27041f.m66669i(iTradeData2 != null ? iTradeData2.mo49132e1() : null, "USDT");
        C37890n c37890n = C37890n.f85269a;
        ITradeData iTradeData3 = this.f39999Z;
        CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(C27041f.m66669i(iTradeData3 != null ? iTradeData3.mo49132e1() : null, "USDT"));
        String iconUrl = coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null;
        C37674q2 c37674q2 = this.f40004e0;
        if (c37674q2 != null && (currencyEditView = c37674q2.f84453d) != null) {
            currencyAmount = currencyEditView.getCurrencyAmount();
        }
        bundle.putParcelable("data", new ExtraParams(type, this.f40008i0 ? "FIAT" : "CRYPTO", strM66669i, null, strM66669i2, iconUrl, C27041f.m66668h(currencyAmount), false, null, "P2P_EXPRESS", RendererCapabilities.DECODER_SUPPORT_MASK, null));
        Intent intent = new Intent(this.mContext, (Class<?>) BaseActivity.class);
        intent.putExtra("fragment", PaymentMethodFragment.class.getName());
        intent.putExtras(bundle);
        startActivity(intent);
        C43852m.m96591c("B7P2P", "expressbuy", "1", null, 8, null);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: s5 */
    public final void m49280s5() {
        RecyclerView.Adapter adapter = this.f46496X.getRecyclerView().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.payment_item_trade_market;
    }

    /* JADX INFO: renamed from: A5 */
    public static final Unit m49150A5(P2PTradeMarketListFragment p2PTradeMarketListFragment, ExpressBuyPreCheck.Response response) {
        Intrinsics.checkNotNull(response);
        p2PTradeMarketListFragment.m49270d5(response);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F4 */
    public static final P2PWebService.a m49156F4() {
        return (P2PWebService.a) C42597a.m93386b().create(P2PWebService.a.class);
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m49163J4(P2PTradeMarketListFragment p2PTradeMarketListFragment, OtcInfoEntity otcInfoEntity, BaseViewHolder baseViewHolder) throws Exception {
        p2PTradeMarketListFragment.m49244B5(otcInfoEntity, baseViewHolder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N4 */
    public static final void m49169N4(P2PTradeMarketListFragment p2PTradeMarketListFragment, final OtcInfoEntity otcInfoEntity, final P2PTradeMarketListFragment p2PTradeMarketListFragment2, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            C38346y.m86491B(p2PTradeMarketListFragment, otcInfoEntity, new Action() { // from class: com.kubi.payment.p2p.trade.u1
                @Override // io.reactivex.functions.Action
                public final void run() {
                    P2PTradeMarketListFragment.m49172O4(this.f40116b, otcInfoEntity);
                }
            });
        }
    }

    /* JADX INFO: renamed from: N5 */
    public static final Unit m49170N5(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O4 */
    public static final void m49172O4(P2PTradeMarketListFragment p2PTradeMarketListFragment, OtcInfoEntity otcInfoEntity) {
        p2PTradeMarketListFragment.hideDialogLoading();
        p2PTradeMarketListFragment.m49263T5(otcInfoEntity);
    }

    /* JADX INFO: renamed from: O5 */
    public static final Unit m49173O5(View view, View view2) {
        view.setSelected(!view.isSelected());
        view2.setEnabled(view.isSelected());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P5 */
    public static final Unit m49175P5(P2PTradeMarketListFragment p2PTradeMarketListFragment, OtcInfoEntity otcInfoEntity, DialogFragmentHelper dialogFragmentHelper) {
        String plainString;
        OtcInfoEntity otcInfoEntity2;
        BigDecimal floatPrice;
        if (p2PTradeMarketListFragment.m49268c5()) {
            p2PTradeMarketListFragment.m49278q5(otcInfoEntity.getId(), otcInfoEntity.isBuy(), C27041f.m66668h(otcInfoEntity.getCurrency()));
            otcInfoEntity2 = otcInfoEntity;
        } else {
            OtcDealFragment.Companion companion = OtcDealFragment.f38042f0;
            Context mContext = p2PTradeMarketListFragment.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            OtcInfoEntity otcInfoEntity3 = p2PTradeMarketListFragment.f40000a0;
            if (otcInfoEntity3 != null && (floatPrice = otcInfoEntity3.getFloatPrice()) != null) {
                plainString = floatPrice.toPlainString();
            } else {
                plainString = null;
            }
            otcInfoEntity2 = otcInfoEntity;
            OtcDealFragment.Companion.startFragment$default(companion, mContext, otcInfoEntity2, plainString, null, 8, null);
        }
        p2PTradeMarketListFragment.m49250I5(C27041f.m66668h(otcInfoEntity2.getLegal()));
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T4 */
    public static final void m49181T4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V4 */
    public static final void m49186V4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V5 */
    public static final void m49187V5(P2PTradeMarketListFragment p2PTradeMarketListFragment, DialogInterface dialogInterface, int i11) {
        C38346y.m86509T(p2PTradeMarketListFragment);
        C43852m.m96591c("B7P2P", "paymethodSetupButton", null, null, 12, null);
    }

    /* JADX INFO: renamed from: X4 */
    public static final void m49191X4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a6 */
    public static final Unit m49199a6(P2PTradeMarketListFragment p2PTradeMarketListFragment) throws Exception {
        p2PTradeMarketListFragment.m49256M4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b6 */
    public static final Unit m49201b6(P2PTradeMarketListFragment p2PTradeMarketListFragment) throws Exception {
        p2PTradeMarketListFragment.m49256M4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u5 */
    public static final Unit m49232u5(P2PTradeMarketListFragment p2PTradeMarketListFragment, Boolean bool) {
        if (bool.booleanValue()) {
            p2PTradeMarketListFragment.showDialogLoading();
        } else {
            p2PTradeMarketListFragment.hideDialogLoading();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v5 */
    public static final Unit m49234v5(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y5 */
    public static final Unit m49240y5(P2PTradeMarketListFragment p2PTradeMarketListFragment, String str) {
        Intrinsics.checkNotNull(str);
        p2PTradeMarketListFragment.m49271d6("CHECK_AD_DETAIL", str);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: E3 */
    public void mo22112E3(boolean z11) {
        m49273f6();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: F3 */
    public void mo15906F3() {
        CurrencyEditView currencyEditView;
        showLoading();
        super.mo15906F3();
        C37674q2 c37674q2 = this.f40004e0;
        if (c37674q2 != null && (currencyEditView = c37674q2.f84453d) != null) {
            currencyEditView.m49385i(null);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: G3 */
    public void mo15907G3() {
        LinearLayout root;
        super.mo15907G3();
        this.f40004e0 = C37674q2.m84935c(getLayoutInflater());
        m49276i5();
        BaseQuickAdapter<T, BaseViewHolder> baseQuickAdapter = this.f46495W;
        C37674q2 c37674q2 = this.f40004e0;
        if (c37674q2 != null) {
            root = c37674q2.getRoot();
        } else {
            root = null;
        }
        baseQuickAdapter.addHeaderView(root);
    }

    /* JADX INFO: renamed from: G5 */
    public final void m49248G5() {
        m49274g6();
        m49249H5();
        m49257P4();
        m49273f6();
    }

    /* JADX INFO: renamed from: c6 */
    public final void m49269c6(BaseViewHolder baseViewHolder, OtcInfoEntity otcInfoEntity) {
        String str;
        if (otcInfoEntity.isBuy()) {
            str = "buy";
        } else {
            str = "sell";
        }
        C43852m.m96590b("B7P2P", "buyOrSellButton", "1", TuplesKt.m90091to("pay_side", str), TuplesKt.m90091to("pay_fiat_currency", C27041f.m66668h(otcInfoEntity.getLegal())), TuplesKt.m90091to("pay_crypto_currency", C27041f.m66668h(otcInfoEntity.getCurrency())), TuplesKt.m90091to("norm_version", "1"));
    }

    /* JADX INFO: renamed from: d5 */
    public final void m49270d5(final ExpressBuyPreCheck.Response response) {
        String minAmount;
        String maxAmount;
        String minAmount2;
        String maxAmount2;
        String stringRes;
        CurrencyEditView currencyEditView;
        CurrencyEditView currencyEditViewM49383g;
        CurrencyEditView currencyEditViewM49385i;
        CurrencyEditView currencyEditView2;
        String minAmount3;
        String maxAmount3;
        CurrencyEditView currencyEditView3;
        Integer matchAd = response.getMatchAd();
        if (matchAd != null && matchAd.intValue() == 0) {
            m49253K5();
            return;
        }
        Boolean boolValueOf = null;
        if (matchAd != null && matchAd.intValue() == 1) {
            C37674q2 c37674q2 = this.f40004e0;
            if (c37674q2 != null && (currencyEditView3 = c37674q2.f84453d) != null) {
                if (c37674q2 != null && currencyEditView3 != null) {
                    boolValueOf = Boolean.valueOf(currencyEditView3.isFocused());
                }
                currencyEditView3.m49379c(true, C27025c.m66566d(boolValueOf));
            }
            m49279r5();
            return;
        }
        if (matchAd != null && matchAd.intValue() == 2) {
            List<ExpressBuyPreCheck.AmountInterval> amountIntervalList = response.getAmountIntervalList();
            if (amountIntervalList != null && !amountIntervalList.isEmpty()) {
                final ExpressBuyPreCheck.AmountInterval amountInterval = (ExpressBuyPreCheck.AmountInterval) CollectionsKt.getOrNull(response.getAmountIntervalList(), 0);
                final ExpressBuyPreCheck.AmountInterval amountInterval2 = (ExpressBuyPreCheck.AmountInterval) CollectionsKt.getOrNull(response.getAmountIntervalList(), 1);
                if (response.getAmountIntervalList().size() == 1) {
                    int i11 = R$string.payment_limit_tip;
                    if (amountInterval != null) {
                        minAmount3 = amountInterval.getMinAmount();
                    } else {
                        minAmount3 = null;
                    }
                    String strM66668h = C27041f.m66668h(minAmount3);
                    if (amountInterval != null) {
                        maxAmount3 = amountInterval.getMaxAmount();
                    } else {
                        maxAmount3 = null;
                    }
                    stringRes = getStringRes(i11, strM66668h, C27041f.m66668h(maxAmount3), C27041f.m66668h(response.getCurrency()));
                } else {
                    int i12 = R$string.payment_limit_tip2;
                    if (amountInterval != null) {
                        minAmount = amountInterval.getMinAmount();
                    } else {
                        minAmount = null;
                    }
                    String strM66668h2 = C27041f.m66668h(minAmount);
                    if (amountInterval != null) {
                        maxAmount = amountInterval.getMaxAmount();
                    } else {
                        maxAmount = null;
                    }
                    String strM66668h3 = C27041f.m66668h(maxAmount);
                    if (amountInterval2 != null) {
                        minAmount2 = amountInterval2.getMinAmount();
                    } else {
                        minAmount2 = null;
                    }
                    String strM66668h4 = C27041f.m66668h(minAmount2);
                    if (amountInterval2 != null) {
                        maxAmount2 = amountInterval2.getMaxAmount();
                    } else {
                        maxAmount2 = null;
                    }
                    stringRes = getStringRes(i12, strM66668h2, strM66668h3, strM66668h4, C27041f.m66668h(maxAmount2), C27041f.m66668h(response.getCurrency()));
                }
                C37674q2 c37674q3 = this.f40004e0;
                if (c37674q3 != null && (currencyEditView = c37674q3.f84453d) != null && (currencyEditViewM49383g = currencyEditView.m49383g(stringRes)) != null && (currencyEditViewM49385i = currencyEditViewM49383g.m49385i(new Function1() { // from class: com.kubi.payment.p2p.trade.j1
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return P2PTradeMarketListFragment.m49205e5(this.f40077b, response, amountInterval, amountInterval2, (String) obj);
                    }
                })) != null) {
                    C37674q2 c37674q4 = this.f40004e0;
                    if (c37674q4 != null && (currencyEditView2 = c37674q4.f84453d) != null) {
                        boolValueOf = Boolean.valueOf(currencyEditView2.isFocused());
                    }
                    currencyEditViewM49385i.m49379c(false, C27025c.m66566d(boolValueOf));
                    return;
                }
                return;
            }
            m49253K5();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f40005f0 = true;
        this.f40006g0 = C46392a.m102322d(PaymentStorageId.f40364a.m49837o(), false);
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @NotNull
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<OtcInfoEntity>> mo16440r3(int i11, int i12) {
        String strMo49132e1;
        String strMo49119K2;
        String strMo49138k1;
        String strMo49122N1;
        String sortCode;
        Boolean boolValueOf;
        P2PFilterDialog.P2PFilterData p2PFilterDataMo49130Y1;
        P2PFilterDialog.P2PFilterData p2PFilterDataMo49130Y2;
        P2PFilterDialog.P2PFilterData p2PFilterDataMo49130Y3;
        P2PWebService.a aVarM49262S4 = m49262S4();
        ITradeData iTradeData = this.f39999Z;
        Boolean boolValueOf2 = null;
        if (iTradeData != null) {
            strMo49132e1 = iTradeData.mo49132e1();
        } else {
            strMo49132e1 = null;
        }
        String strM66669i = C27041f.m66669i(strMo49132e1, "USDT");
        ITradeData iTradeData2 = this.f39999Z;
        if (iTradeData2 != null) {
            strMo49119K2 = iTradeData2.mo49119K2();
        } else {
            strMo49119K2 = null;
        }
        String strM66669i2 = C27041f.m66669i(strMo49119K2, "USD");
        ITradeData iTradeData3 = this.f39999Z;
        if (iTradeData3 != null) {
            strMo49138k1 = iTradeData3.mo49138k1();
        } else {
            strMo49138k1 = null;
        }
        String strM66668h = C27041f.m66668h(strMo49138k1);
        ITradeData iTradeData4 = this.f39999Z;
        if (iTradeData4 != null) {
            strMo49122N1 = iTradeData4.mo49122N1();
        } else {
            strMo49122N1 = null;
        }
        String strM66668h2 = C27041f.m66668h(strMo49122N1);
        ITradeData iTradeData5 = this.f39999Z;
        if (iTradeData5 != null && (p2PFilterDataMo49130Y3 = iTradeData5.mo49130Y1()) != null) {
            sortCode = p2PFilterDataMo49130Y3.getSortCode();
        } else {
            sortCode = null;
        }
        String strM66668h3 = C27041f.m66668h(sortCode);
        ITradeData iTradeData6 = this.f39999Z;
        if (iTradeData6 != null && (p2PFilterDataMo49130Y2 = iTradeData6.mo49130Y1()) != null) {
            boolValueOf = Boolean.valueOf(p2PFilterDataMo49130Y2.getSwitchMerchantEnabled());
        } else {
            boolValueOf = null;
        }
        Integer numValueOf = Integer.valueOf(C27025c.m66566d(boolValueOf) ? 1 : 0);
        ITradeData iTradeData7 = this.f39999Z;
        if (iTradeData7 != null && (p2PFilterDataMo49130Y1 = iTradeData7.mo49130Y1()) != null) {
            boolValueOf2 = Boolean.valueOf(p2PFilterDataMo49130Y1.getSwitchTradableEnabled());
        }
        Observable<R> observableCompose = aVarM49262S4.m48559a(strM66669i, strM66669i2, strM66668h, strM66668h2, strM66668h3, numValueOf, Boolean.valueOf(C27025c.m66566d(boolValueOf2)), m49266a5(), i11, i12).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.payment.p2p.trade.d2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P2PTradeMarketListFragment.m49183U4(this.f40053b, (Disposable) obj);
            }
        };
        Observable observableDoOnSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.payment.p2p.trade.e2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                P2PTradeMarketListFragment.m49186V4(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.payment.p2p.trade.f2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P2PTradeMarketListFragment.m49189W4(this.f40060b, (BasePageEntity) obj);
            }
        };
        Observable observableDoOnNext = observableDoOnSubscribe.doOnNext(new Consumer() { // from class: com.kubi.payment.p2p.trade.g2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                P2PTradeMarketListFragment.m49191X4(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: com.kubi.payment.p2p.trade.s0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P2PTradeMarketListFragment.m49194Y4(this.f40108b, (Throwable) obj);
            }
        };
        Observable<BasePageEntity<OtcInfoEntity>> observableDoOnError = observableDoOnNext.doOnError(new Consumer() { // from class: com.kubi.payment.p2p.trade.t0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                P2PTradeMarketListFragment.m49181T4(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnError, "doOnError(...)");
        return observableDoOnError;
    }

    /* JADX INFO: renamed from: Y5 */
    public static final void m49195Y5(DialogInterface dialogInterface, int i11) {
    }
}
