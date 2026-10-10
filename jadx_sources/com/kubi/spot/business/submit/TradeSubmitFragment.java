package com.kubi.spot.business.submit;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.kubi.core.biz.callauction.CallAuctionSwitch;
import com.kubi.core.spot.entity.OrderBookCenterEntity;
import com.kubi.data.entity.OrderBookEntity;
import com.kubi.data.entity.OrderBookIndex;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.kucoin.manager.SpotMarketSocketAdapter;
import com.kubi.kucoin.manager.SpotMatchPushEntity;
import com.kubi.margin.api.IMarginService;
import com.kubi.margin.api.entity.FeeEntity;
import com.kubi.monitor.helper.TracePageHelper;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.network.websocket.model.Message;
import com.kubi.otc.entity.OtcAd;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.safe.api.service.TradePasswordExtensionsKt;
import com.kubi.safe.api.service.TradePasswordExtensionsKt$executeTradePassword$1;
import com.kubi.safe.api.tradesecurity.TradeSecurityScene;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.spot.R$array;
import com.kubi.spot.R$id;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$string;
import com.kubi.spot.SpotRemoteConfig;
import com.kubi.spot.business.BaseTradeFragment;
import com.kubi.spot.business.ITradeBehavior;
import com.kubi.spot.business.ITradeChildBehavior;
import com.kubi.spot.business.ITradeParentBehavior;
import com.kubi.spot.business.businessTrack.DurationTrackManager;
import com.kubi.spot.business.businessTrack.SpotBusinessTracker;
import com.kubi.spot.business.saving.SavingCacheManager;
import com.kubi.spot.business.saving.SavingConfig;
import com.kubi.spot.business.saving.SavingCoroutineScope;
import com.kubi.spot.entity.DelegationEntity;
import com.kubi.spot.entity.OrderResultEntity;
import com.kubi.spot.entity.WsRecentDealEntity;
import com.kubi.spot.entity.WsRecentDealEntityKt;
import com.kubi.spot.helper.ITradeTypeRequestOrder;
import com.kubi.spot.helper.NewOrderBookHelper;
import com.kubi.spot.helper.TradeModel;
import com.kubi.spot.quote.market.trade.C25799u;
import com.kubi.spot.service.SpotDepend;
import com.kubi.tradebase.available.AvailableTradeSide;
import com.kubi.tradebase.business.kyc.KycViewModel;
import com.kubi.tradebase.entity.CurrencyBalance;
import com.kubi.tradebase.orderbook.OrderBookDataHelper;
import com.kubi.tradebase.tradetype.TradeType;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27099x;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.C27032f;
import com.tencent.qcloud.tuicore.TUIConstants;
import d30.C36606a;
import g10.C37787r;
import g10.InterfaceC37770a;
import gf.C37878b0;
import id.C38519a;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.PublishSubject;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import k30.AvailableTradeAmountContext;
import k30.AvailableTradeAmountState;
import k30.AvailableTradeCapacity;
import k30.C40883e;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p402kf.C41016c;
import p569qq.C43841b;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: TradeSubmitFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u0091\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t*\u0001*\u0018\u0000 ©\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002©\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u001a\u00104\u001a\u0002052\u0006\u00106\u001a\u00020-2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00107\u001a\u000205H\u0016J\b\u00108\u001a\u000205H\u0016J\b\u00109\u001a\u000205H\u0016J\u0010\u0010:\u001a\u0002052\u0006\u0010;\u001a\u00020\u0015H\u0002J\u0010\u0010<\u001a\u0002052\u0006\u0010;\u001a\u00020\u0015H\u0002J\b\u0010=\u001a\u000205H\u0002J\b\u0010>\u001a\u000205H\u0002J\u0006\u0010?\u001a\u000205J0\u0010@\u001a\u0002052\b\u0010A\u001a\u0004\u0018\u00010B2\b\u0010C\u001a\u0004\u0018\u00010D2\b\u0010E\u001a\u0004\u0018\u00010B2\b\u0010F\u001a\u0004\u0018\u00010DH\u0016J$\u0010G\u001a\u0002052\u0006\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010B2\b\u0010E\u001a\u0004\u0018\u00010BH\u0016J(\u0010K\u001a\u0002052\u0006\u0010H\u001a\u00020I2\u0006\u0010L\u001a\u00020M2\u000e\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0OH\u0016J\u001c\u0010P\u001a\u0002052\b\u0010Q\u001a\u0004\u0018\u00010B2\b\u0010R\u001a\u0004\u0018\u00010BH\u0016J\u0010\u0010S\u001a\u00020T2\u0006\u0010H\u001a\u00020IH\u0016J\b\u0010U\u001a\u000205H\u0002J0\u0010V\u001a\u0002052\b\u0010A\u001a\u0004\u0018\u00010B2\b\u0010C\u001a\u0004\u0018\u00010D2\b\u0010E\u001a\u0004\u0018\u00010B2\b\u0010F\u001a\u0004\u0018\u00010DH\u0016J\b\u0010W\u001a\u000205H\u0016J\b\u0010X\u001a\u000205H\u0016J\b\u0010Y\u001a\u000205H\u0016J@\u0010Z\u001a\u0002052\u0012\u0010[\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020]0\\2\u0006\u0010^\u001a\u00020_2\u001a\u0010`\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010]\u0012\u0004\u0012\u0002050aH\u0002J8\u0010b\u001a\u0002052\u001a\u0010`\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010]\u0012\u0004\u0012\u0002050a2\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020]0\\H\u0002J@\u0010d\u001a\u0002052\u0012\u0010[\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020]0\\2\u0006\u0010^\u001a\u00020_2\u001a\u0010`\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010]\u0012\u0004\u0012\u0002050aH\u0016J@\u0010e\u001a\u0002052\u0012\u0010[\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020]0\\2\u0006\u0010^\u001a\u00020_2\u001a\u0010`\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010]\u0012\u0004\u0012\u0002050aH\u0002J\u0010\u0010f\u001a\u00020\u00152\u0006\u0010g\u001a\u00020hH\u0002J\u0010\u0010i\u001a\u0002052\u0006\u0010j\u001a\u00020BH\u0016J\u0010\u0010k\u001a\u0002052\u0006\u0010l\u001a\u00020\u0015H\u0016J\b\u0010m\u001a\u00020\u0015H\u0016J\u0010\u0010n\u001a\u0002052\u0006\u0010l\u001a\u00020\u0015H\u0016J\b\u0010o\u001a\u00020\u0015H\u0016J\u0010\u0010{\u001a\u0002052\u0006\u0010|\u001a\u00020\u0015H\u0017J\b\u0010}\u001a\u000205H\u0016J\u0010\u0010~\u001a\u0002052\b\b\u0002\u0010\u007f\u001a\u00020\u0015J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\t\u0010\u0080\u0001\u001a\u00020IH\u0016J\t\u0010\u0081\u0001\u001a\u00020\u0018H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0082\u0001\u001a\u0002052\u0007\u0010\u0083\u0001\u001a\u00020\u0015J\t\u0010\u0084\u0001\u001a\u00020\u0015H\u0016J\u0012\u0010\u0085\u0001\u001a\u0002052\u0007\u0010\u0084\u0001\u001a\u00020\u0015H\u0016J\u001b\u0010\u0086\u0001\u001a\u0002052\u0007\u0010\u0087\u0001\u001a\u00020]2\u0007\u0010\u0088\u0001\u001a\u00020\u000eH\u0016J\u0019\u0010\u0089\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013H\u0016J\u0017\u0010\u008a\u0001\u001a\u0002052\u000e\u0010\u008b\u0001\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010OJ\t\u0010\u0092\u0001\u001a\u00020\u0001H\u0016J\n\u0010\u0093\u0001\u001a\u00030\u0094\u0001H\u0016J\n\u0010\u0095\u0001\u001a\u00030\u0096\u0001H\u0016J\n\u0010\u0097\u0001\u001a\u00030\u0098\u0001H\u0016J\n\u0010\u0099\u0001\u001a\u00030\u009a\u0001H\u0016J\n\u0010\u009b\u0001\u001a\u00030\u009a\u0001H\u0016J\t\u0010\u009c\u0001\u001a\u00020\u0015H\u0016J\u0011\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0003\u0010\u009e\u0001J\t\u0010\u009f\u0001\u001a\u00020]H\u0016J\u0014\u0010 \u0001\u001a\u0005\u0018\u00010¡\u00012\u0006\u0010q\u001a\u00020rH\u0016J\t\u0010¢\u0001\u001a\u00020\u0015H\u0016J\u0019\u0010£\u0001\u001a\u0002052\u000e\u0010\u008b\u0001\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010OH\u0016J\t\u0010¤\u0001\u001a\u000205H\u0016J\t\u0010¥\u0001\u001a\u000205H\u0016J\t\u0010¦\u0001\u001a\u000205H\u0016J\t\u0010§\u0001\u001a\u000205H\u0016J\u000b\u0010¨\u0001\u001a\u0004\u0018\u00010-H\u0016R\u0014\u0010\b\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b$\u0010%R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0004\n\u0002\u0010+R\u000e\u0010p\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010q\u001a\u00020r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010!\u001a\u0004\bs\u0010tR\u001b\u0010v\u001a\u00020w8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010!\u001a\u0004\bx\u0010yR \u0010\u008d\u0001\u001a\u00030\u008e\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0091\u0001\u0010!\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001¨\u0006ª\u0001"}, m90084d2 = {"Lcom/kubi/spot/business/submit/TradeSubmitFragment;", "Lcom/kubi/sdk/BaseFragment;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "Lcom/kubi/sdk/websocket/IWsDataGetter;", "Lcom/kubi/spot/business/ITradeParentBehavior;", "Lcom/kubi/spot/business/holder/ITradeHolderDependDelegate;", "<init>", "()V", "verticalSubmitFragment", "getVerticalSubmitFragment", "()Lcom/kubi/sdk/BaseFragment;", "horizontalSubmitFragment", "getHorizontalSubmitFragment", "lastPrecision", "", "lastTradeMode", "activeDelegationList", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/OrderBookIndex;", "Lkotlin/collections/ArrayList;", "limitStopPriceFocused", "", "ocoStopLimitPriceFocused", "mBboData", "Lcom/kubi/core/spot/entity/OrderBookCenterEntity;", "availableTradeAmountStore", "Lcom/kubi/tradebase/available/AvailableTradeAmountStore;", "mIsBuy", "kycViewModel", "Lcom/kubi/tradebase/business/kyc/KycViewModel;", "getKycViewModel", "()Lcom/kubi/tradebase/business/kyc/KycViewModel;", "kycViewModel$delegate", "Lkotlin/Lazy;", "mGooglePlayScoreHelper", "Lcom/kubi/spot/business/submit/GooglePlayScoreHelper;", "getMGooglePlayScoreHelper", "()Lcom/kubi/spot/business/submit/GooglePlayScoreHelper;", "mGooglePlayScoreHelper$delegate", "visibleSavingScope", "Lcom/kubi/spot/business/saving/SavingCoroutineScope;", "savingModelChangeEvent", "com/kubi/spot/business/submit/TradeSubmitFragment$savingModelChangeEvent$1", "Lcom/kubi/spot/business/submit/TradeSubmitFragment$savingModelChangeEvent$1;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onRefresh", "loadData", "isRefresh", "fetchSavingBalance", "unsubscribeSavingBalance", "refreshOrderBookData", "reloadSymbols", "holderAvailableBalanceChange", "quoteBalance", "Ljava/math/BigDecimal;", "quoteBalanceDisplayStr", "", "baseAvailableBalance", "baseBalanceDisplayStr", "updateAvailableTradeCapacity", "orderType", "Lcom/kubi/tradebase/tradetype/TradeType;", "quoteAvailableBalance", "updateAvailableTradeExecutionPrices", "side", "Lcom/kubi/tradebase/available/AvailableTradeSide;", "prices", "", "updateAvailableTradeBbo", "bestAsk", "bestBid", "availableTradeAmountState", "Lcom/kubi/tradebase/available/AvailableTradeAmountState;", "updateAvailableTradeContext", "notifyAvailableBalanceChange", "refreshButtonStatus", "showOrderBookAmountDialog", "showOrderPrecisionDialog", "showWithdrawDialog", "marketOderParams", "", "", "tradeTypeRequestOrder", "Lcom/kubi/spot/helper/ITradeTypeRequestOrder;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "orderDone", "orderParams", "requestOrder", "submitOrderAfterSecurityCheck", "handleKYC0Error", "it", "", "onClickOrderBookPrice", "value", "setLimitStopPriceFocused", "hasFocus", "isLimitStopPriceFocused", "setOcoStopLimitPriceFocused", "isOcoStopLimitPriceFocused", "hasTrack", "wsDataHelper", "Lcom/kubi/sdk/websocket/WsDataHelper;", "getWsDataHelper", "()Lcom/kubi/sdk/websocket/WsDataHelper;", "wsDataHelper$delegate", "mOrderBookHelper", "Lcom/kubi/spot/helper/NewOrderBookHelper;", "getMOrderBookHelper", "()Lcom/kubi/spot/helper/NewOrderBookHelper;", "mOrderBookHelper$delegate", "getRestfulData", "isResetWs", "registerWsData", "toggleCurrentFragment", "refresh", "lastTradeType", "bboData", "toggleSubscribe", AuthenticationTokenClaims.JSON_KEY_SUB, "isBuy", "setIsBuy", "onTradeTypeChanged", Constants.ScionAnalytics.PARAM_LABEL, "index", "getActiveDelegationList", "updateActiveOrders", "data", "Lcom/kubi/spot/entity/DelegationEntity;", "mParent", "Lcom/kubi/spot/business/ITradeBehavior;", "getMParent", "()Lcom/kubi/spot/business/ITradeBehavior;", "mParent$delegate", "fragment", "currentSymbol", "Lcom/kubi/data/entity/TradeItemBean;", "currentSymbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "tradeMode", "Lcom/kubi/spot/helper/TradeModel;", "getBaseBalance", "Lcom/kubi/tradebase/entity/CurrencyBalance;", "getQuoteBalance", "isMaintenance", "checkIsBuyLong", "()Ljava/lang/Boolean;", "extValueLabel", "extValueWsDisposable", "Lio/reactivex/disposables/Disposable;", "needShowExtValue", "onTodoOrdersCallBack", "fetchSymbolBalance", "fetchExtValue", "showExtValueTips", "fetchDelegation", "getContainerView", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeSubmitFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeSubmitFragment.kt\ncom/kubi/spot/business/submit/TradeSubmitFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n+ 5 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 6 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 7 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 8 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 9 LogInfo.kt\ncom/kubi/spot/loginfo/LogInfoKt\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,867:1\n808#2,11:868\n1869#2,2:879\n808#2,11:881\n1869#2,2:892\n808#2,11:897\n1869#2,2:908\n1573#2:910\n1604#2,4:911\n808#2,11:915\n1869#2,2:926\n808#2,11:931\n774#2:942\n865#2,2:943\n808#2,11:945\n1869#2,2:956\n808#2,11:958\n1869#2,2:969\n1563#2:973\n1634#2,3:974\n808#2,11:977\n1869#2,2:988\n808#2,11:995\n1869#2,2:1006\n808#2,11:1008\n1869#2,2:1019\n808#2,11:1021\n1869#2,2:1032\n808#2,11:1034\n1869#2,2:1045\n808#2,11:1047\n1869#2,2:1058\n808#2,11:1075\n1869#2,2:1086\n808#2,11:1088\n1869#2,2:1099\n808#2,11:1101\n1869#2,2:1112\n13537#3,3:894\n35#4,3:928\n135#5,2:971\n126#5,2:1115\n220#6,5:990\n35#7,4:1060\n39#7:1066\n44#8,2:1064\n8#9,2:1067\n12#9,2:1069\n8#9,2:1071\n12#9,2:1073\n1#10:1114\n*S KotlinDebug\n*F\n+ 1 TradeSubmitFragment.kt\ncom/kubi/spot/business/submit/TradeSubmitFragment\n*L\n258#1:868,11\n258#1:879,2\n340#1:881,11\n341#1:892,2\n368#1:897,11\n369#1:908,2\n378#1:910\n378#1:911,4\n396#1:915,11\n397#1:926,2\n650#1:931,11\n651#1:942\n651#1:943,2\n652#1:945,11\n653#1:956,2\n792#1:958,11\n793#1:969,2\n819#1:973\n819#1:974,3\n825#1:977,11\n826#1:988,2\n181#1:995,11\n182#1:1006,2\n361#1:1008,11\n362#1:1019,2\n365#1:1021,11\n366#1:1032,2\n385#1:1034,11\n386#1:1045,2\n393#1:1047,11\n394#1:1058,2\n677#1:1075,11\n678#1:1086,2\n691#1:1088,11\n692#1:1099,2\n716#1:1101,11\n717#1:1112,2\n351#1:894,3\n561#1:928,3\n797#1:971,2\n807#1:1115,2\n151#1:990,5\n446#1:1060,4\n446#1:1066\n446#1:1064,2\n579#1:1067,2\n581#1:1069,2\n609#1:1071,2\n623#1:1073,2\n*E\n"})
public final class TradeSubmitFragment extends BaseFragment implements SwipeRefreshLayout.OnRefreshListener, InterfaceC37770a, ITradeParentBehavior, com.kubi.spot.business.holder.z {

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public static final Companion f50340k0 = new Companion(null);

    /* JADX INFO: renamed from: V */
    public int f50342V;

    /* JADX INFO: renamed from: X */
    public boolean f50344X;

    /* JADX INFO: renamed from: Y */
    public boolean f50345Y;

    /* JADX INFO: renamed from: g0 */
    public boolean f50353g0;

    /* JADX INFO: renamed from: U */
    public int f50341U = 8;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final ArrayList<OrderBookIndex> f50343W = new ArrayList<>();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final OrderBookCenterEntity f50346Z = new OrderBookCenterEntity();

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final C40883e f50347a0 = new C40883e();

    /* JADX INFO: renamed from: b0 */
    public boolean f50348b0 = true;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f50349c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.submit.l0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeSubmitFragment.m61533x4(this.f50417b);
        }
    });

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final Lazy f50350d0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.submit.w0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeSubmitFragment.m61538z4();
        }
    });

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final SavingCoroutineScope f50351e0 = new SavingCoroutineScope(C42911a.m94120b());

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final C25120a f50352f0 = new C25120a();

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final Lazy f50354h0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.submit.h1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeSubmitFragment.m61536y5(this.f50404b);
        }
    });

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final Lazy f50355i0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.submit.s1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeSubmitFragment.m61433A4(this.f50439b);
        }
    });

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public final Lazy f50356j0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.submit.b2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeSubmitFragment.m61437C4(this.f50378b);
        }
    });

    /* JADX INFO: compiled from: TradeSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/spot/business/submit/TradeSubmitFragment$Companion;", "", "<init>", "()V", "DEFAULT_SELECT_POSITION", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.submit.TradeSubmitFragment$a */
    /* JADX INFO: compiled from: TradeSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/spot/business/submit/TradeSubmitFragment$savingModelChangeEvent$1", "Lcom/kubi/spot/business/saving/SavingConfig$ISavingModeChangeEvent;", "onChange", "", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25120a implements SavingConfig.a {
        public C25120a() {
        }

        @Override // com.kubi.spot.business.saving.SavingConfig.a
        /* JADX INFO: renamed from: a */
        public void mo61347a(boolean z11) {
            if (z11) {
                SavingCacheManager.f50304a.m61306s(TradeSubmitFragment.this.mo60189N(), TradeSubmitFragment.this.getVisibleDisposable(), TradeSubmitFragment.this.f50351e0);
            } else {
                TradeSubmitFragment.this.f50351e0.close();
            }
        }
    }

    /* JADX INFO: renamed from: N4 */
    private final void m61459N4(Function2<? super Boolean, ? super String, Unit> function2, Map<String, String> map) {
        BaseFragment.hideLoadingDialog$default(this, false, 1, null);
        ToastCompat.m66441G(getString(R$string.deal_ok), new Object[0]);
        function2.invoke(Boolean.TRUE, null);
        m61554l4().m61655k(map);
        m61554l4().m61656l(mo60180J().getChangeRate());
        m61554l4().m61657m(getActivity());
    }

    /* JADX INFO: renamed from: r5 */
    public static final void m61521r5(TradeSubmitFragment tradeSubmitFragment, Function2 function2, Throwable th2) throws JSONException {
        BaseFragment.hideLoadingDialog$default(tradeSubmitFragment, false, 1, null);
        if (th2 instanceof ApiException) {
            Boolean bool = Boolean.FALSE;
            StringBuilder sb2 = new StringBuilder();
            ApiException apiException = (ApiException) th2;
            sb2.append(apiException.code);
            sb2.append(':');
            sb2.append(apiException.getMessage());
            function2.invoke(bool, sb2.toString());
        }
        SpotBusinessTracker.Companion companion = SpotBusinessTracker.f49771a;
        SpotBusinessTracker.SpotCategory spotCategory = SpotBusinessTracker.SpotCategory.PLACE_ORDER;
        Intrinsics.checkNotNull(th2);
        companion.trackSpotTradeException(spotCategory, th2);
        C44128b.m97270n("trade|Spot|TradeSubmitFragment", "Error creating order: " + th2);
        if (tradeSubmitFragment.m61561w4(th2)) {
            return;
        }
        ApiExceptionShowDialog apiExceptionShowDialog = ApiExceptionShowDialog.f50375a;
        FragmentManager childFragmentManager = tradeSubmitFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        String baseCurrency = tradeSubmitFragment.mo60189N().getBaseCurrency();
        Intrinsics.checkNotNullExpressionValue(baseCurrency, "getBaseCurrency(...)");
        if (apiExceptionShowDialog.m61643b(th2, childFragmentManager, baseCurrency)) {
            return;
        }
        C19331c.m42836c(th2, null, 2, null);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        this.f50353g0 = false;
        m61530v4().m85236i(false);
        m61507m4().m61752k();
        m61560v5();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() throws Exception {
        m61535y4(true);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() throws Exception {
        m61535y4(false);
        m61507m4().m61753l();
    }

    /* JADX INFO: renamed from: A4 */
    public static final NewOrderBookHelper m61433A4(final TradeSubmitFragment tradeSubmitFragment) {
        C37787r c37787rM61530v4 = tradeSubmitFragment.m61530v4();
        String symbol = tradeSubmitFragment.mo60180J().getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        return new NewOrderBookHelper(c37787rM61530v4, tradeSubmitFragment, symbol, tradeSubmitFragment.f50341U, new Consumer() { // from class: com.kubi.spot.business.submit.v0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeSubmitFragment.m61435B4(this.f50445b, (OrderBookEntity) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D4 */
    public static final void m61439D4(BaseViewHolder viewHolder, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
        View view = viewHolder.getView(R$id.cb_next_tips);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66708w((CompoundButton) view, new Function2() { // from class: com.kubi.spot.business.submit.t1
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TradeSubmitFragment.m61441E4((CompoundButton) obj, ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m61441E4(CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        C46392a.m102328k(C38519a.f86479a.m87137l(), z11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G4 */
    public static final Unit m61445G4(Throwable th2) {
        C44128b.m97259c("subscribe", th2.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K4 */
    public static final Unit m61453K4(Throwable th2) {
        C44128b.m97263g("TradeSubmitFragment", th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S4 */
    public static final boolean m61467S4(TradeSubmitFragment tradeSubmitFragment, SpotMatchPushEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BaseTradeFragment baseTradeFragment = (BaseTradeFragment) tradeSubmitFragment.m61555n4();
        return C27025c.m66566d(baseTradeFragment != null ? Boolean.valueOf(baseTradeFragment.isVisible()) : null);
    }

    /* JADX INFO: renamed from: T4 */
    public static final boolean m61469T4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: U4 */
    public static final WsRecentDealEntity m61471U4(SpotMatchPushEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return WsRecentDealEntityKt.toSpotWsRecentDealEntity(it);
    }

    /* JADX INFO: renamed from: V4 */
    public static final WsRecentDealEntity m61473V4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (WsRecentDealEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: Y4 */
    public static final Unit m61479Y4(Throwable th2) {
        C44128b.m97263g("TradeSubmitFragment", th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a5 */
    public static final boolean m61483a5(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual("/account/balance", it.getTopic());
    }

    /* JADX INFO: renamed from: b5 */
    public static final boolean m61485b5(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: c5 */
    public static final Unit m61487c5(final TradeSubmitFragment tradeSubmitFragment, final Message message) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.spot.business.submit.u1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeSubmitFragment.m61489d5(message, tradeSubmitFragment);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d5 */
    public static final Unit m61489d5(Message message, TradeSubmitFragment tradeSubmitFragment) {
        Object objOpt = new JSONObject(C27041f.m66668h(message.getData())).opt(FirebaseAnalytics.Param.CURRENCY);
        BaseTradeFragment baseTradeFragment = (BaseTradeFragment) tradeSubmitFragment.m61555n4();
        if (C27025c.m66566d(baseTradeFragment != null ? Boolean.valueOf(baseTradeFragment.isVisible()) : null) && (Intrinsics.areEqual(objOpt, tradeSubmitFragment.mo60189N().getBaseCurrency()) || Intrinsics.areEqual(objOpt, tradeSubmitFragment.mo60189N().getQuoteCurrency()))) {
            tradeSubmitFragment.mo60183K();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h5 */
    public static final Unit m61496h5() {
        C44128b.m97266j("trade|Spot|TradeSubmitFragment", "User cancelled security check");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i5 */
    public static final Unit m61497i5(Function2 function2, TradeSubmitFragment tradeSubmitFragment, Throwable error) throws JSONException {
        Intrinsics.checkNotNullParameter(error, "error");
        C44128b.m97270n("trade|Spot|TradeSubmitFragment", "Security check failed: " + error);
        if (error instanceof ApiException) {
            ApiException apiException = (ApiException) error;
            if (!Intrinsics.areEqual(apiException.code, OtcAd.KYC_NOT_PASS)) {
                function2.invoke(Boolean.FALSE, apiException.code + ':' + error.getMessage());
            }
        }
        SpotBusinessTracker.f49771a.trackSpotTradeException(SpotBusinessTracker.SpotCategory.PASS_CHECK_FAILED, error);
        if (tradeSubmitFragment.isAdded() && !tradeSubmitFragment.m61561w4(error)) {
            ApiExceptionShowDialog apiExceptionShowDialog = ApiExceptionShowDialog.f50375a;
            FragmentManager childFragmentManager = tradeSubmitFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            String baseCurrency = tradeSubmitFragment.mo60189N().getBaseCurrency();
            Intrinsics.checkNotNullExpressionValue(baseCurrency, "getBaseCurrency(...)");
            if (!apiExceptionShowDialog.m61643b(error, childFragmentManager, baseCurrency)) {
                C19331c.m42836c(error, null, 2, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j5 */
    public static final void m61500j5(TradeSubmitFragment tradeSubmitFragment, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        C37878b0.f85252a.m85544y(baseViewHolder.getAdapterPosition());
        List<Fragment> fragments = tradeSubmitFragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof ITradeChildBehavior) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ITradeChildBehavior) it.next()).mo60291R0(baseViewHolder.getAdapterPosition());
        }
        C43852m.m96591c("B5trading", "orderShift", String.valueOf(baseViewHolder.getAdapterPosition() + 1), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public final KycViewModel m61502k4() {
        return (KycViewModel) this.f50349c0.getValue();
    }

    /* JADX INFO: renamed from: m4 */
    private final NewOrderBookHelper m61507m4() {
        return (NewOrderBookHelper) this.f50355i0.getValue();
    }

    /* JADX INFO: renamed from: o4 */
    public static final boolean m61511o4(TradeSubmitFragment tradeSubmitFragment, OrderBookCenterEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getSymbol(), tradeSubmitFragment.mo60180J().getSymbol());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public static final boolean m61514p4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: q5 */
    public static final void m61518q5(TradeSubmitFragment tradeSubmitFragment, Function2 function2, Map map, OrderResultEntity orderResultEntity) {
        C44128b.m97266j("trade|Spot|TradeSubmitFragment", "Successfully created order");
        DurationTrackManager.Companion companion = DurationTrackManager.f49767c;
        companion.getInstance().m60324j(C27041f.m66668h(orderResultEntity.getOrderId()), companion.getInstance().getF49770b());
        tradeSubmitFragment.m61459N4(function2, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s4 */
    public static final Unit m61523s4(Throwable th2) {
        C44128b.m97263g("TradeSubmitFragment", th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t5 */
    public static /* synthetic */ void m61526t5(TradeSubmitFragment tradeSubmitFragment, boolean z11, int i11, Object obj) throws Exception {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        tradeSubmitFragment.m61558s5(z11);
    }

    /* JADX INFO: renamed from: v4 */
    private final C37787r m61530v4() {
        return (C37787r) this.f50354h0.getValue();
    }

    /* JADX INFO: renamed from: x4 */
    public static final KycViewModel m61533x4(TradeSubmitFragment tradeSubmitFragment) {
        return (KycViewModel) new ViewModelProvider(tradeSubmitFragment).get(KycViewModel.class);
    }

    /* JADX INFO: renamed from: y5 */
    public static final C37787r m61536y5(TradeSubmitFragment tradeSubmitFragment) {
        return new C37787r(tradeSubmitFragment);
    }

    /* JADX INFO: renamed from: z4 */
    public static final GooglePlayScoreHelper m61538z4() {
        return new GooglePlayScoreHelper();
    }

    /* JADX INFO: renamed from: C0, reason: from getter */
    public boolean getF50344X() {
        return this.f50344X;
    }

    @Override // com.kubi.spot.business.ITradeBehavior
    /* JADX INFO: renamed from: C2 */
    public void mo61540C2(@NotNull List<DelegationEntity> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        m61555n4().mo61540C2(data);
    }

    @Override // com.kubi.spot.business.ITradeParentBehavior
    @NotNull
    /* JADX INFO: renamed from: G, reason: from getter */
    public OrderBookCenterEntity getF50346Z() {
        return this.f50346Z;
    }

    /* JADX INFO: renamed from: I0, reason: from getter */
    public boolean getF50345Y() {
        return this.f50345Y;
    }

    /* JADX INFO: renamed from: K0 */
    public void m61542K0(@NotNull TradeType orderType, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        m61563x5();
        this.f50347a0.m89505e(orderType, new AvailableTradeCapacity(bigDecimal, bigDecimal2));
    }

    @Override // com.kubi.spot.business.ITradeParentBehavior
    /* JADX INFO: renamed from: L, reason: from getter */
    public boolean getF50348b0() {
        return this.f50348b0;
    }

    /* JADX INFO: renamed from: L1 */
    public void m61543L1(boolean z11) {
        this.f50345Y = z11;
    }

    /* JADX INFO: renamed from: O0 */
    public void m61545O0(@NotNull TradeType orderType, @NotNull AvailableTradeSide side, @NotNull List<? extends BigDecimal> prices) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(prices, "prices");
        this.f50347a0.m89507g(orderType, side, prices);
    }

    @NotNull
    /* JADX INFO: renamed from: S1 */
    public AvailableTradeAmountState m61548S1(@NotNull TradeType orderType) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        return this.f50347a0.m89503c(orderType);
    }

    @Override // com.kubi.spot.business.ITradeParentBehavior
    /* JADX INFO: renamed from: T */
    public void mo60306T(@NotNull BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof BaseFragment) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((BaseFragment) obj2).isShowing()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (obj3 instanceof ITradeChildBehavior) {
                arrayList3.add(obj3);
            }
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            ((ITradeChildBehavior) it.next()).mo60294a(value);
        }
    }

    @Override // com.kubi.spot.business.ITradeParentBehavior
    /* JADX INFO: renamed from: X, reason: from getter */
    public int getF50342V() {
        return this.f50342V;
    }

    @Override // com.kubi.spot.business.ITradeParentBehavior
    /* JADX INFO: renamed from: Y */
    public void mo60308Y() {
        C43852m.m96591c("B5trading", "decimalShift", "1", null, 8, null);
        BottomSheetDialogHelper bottomSheetDialogHelper = BottomSheetDialogHelper.f48599a;
        ArrayList<String> arrayListM63003a = C25799u.m63003a(mo60189N().getPriceIncrementPrecision());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM63003a, 10));
        int i11 = 0;
        for (Object obj : arrayListM63003a) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new SelectEntity(null, (String) obj, null, null, null, null, null, null, null, false, this.f50341U == mo60189N().getPriceIncrementPrecision() - i11, null, 3069, null));
            i11 = i12;
        }
        BaseDialogFragment baseDialogFragmentM54192r3 = BottomSheetDialogHelper.m58944B(bottomSheetDialogHelper, arrayList, new BiConsumer() { // from class: com.kubi.spot.business.submit.z0
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj2, Object obj3) {
                TradeSubmitFragment.m61505l5(this.f50460b, (BaseViewHolder) obj2, (BottomSheetDialogHelper.InterfaceC24339a) obj3);
            }
        }, false, null, null, false, 60, null).m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.spot.business.submit.a1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                TradeSubmitFragment.m61508m5(this.f50371b, dialogInterface);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentM54192r3.show(childFragmentManager, "showOrderPrecision");
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : fragments) {
            if (obj2 instanceof ITradeChildBehavior) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((ITradeChildBehavior) it.next()).mo60295b(1);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public void m61549Z0(@NotNull Map<String, String> marketOderParams, @NotNull ITradeTypeRequestOrder tradeTypeRequestOrder, @NotNull final Function2<? super Boolean, ? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(marketOderParams, "marketOderParams");
        Intrinsics.checkNotNullParameter(tradeTypeRequestOrder, "tradeTypeRequestOrder");
        Intrinsics.checkNotNullParameter(callback, "callback");
        TradeSecurityScene tradeSecurityScene = TradeSecurityScene.SPOT_SUBMIT;
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        String strM66919i = C27099x.m66919i(marketOderParams, false, 2, null);
        if (strM66919i == null) {
            strM66919i = "";
        }
        TradePasswordExtensionsKt.m56335d(this, tradeSecurityScene, lifecycleScope, (504 & 4) != 0 ? "" : strM66919i, (504 & 8) != 0 ? null : null, (504 & 16) != 0 ? false : false, (504 & 32) != 0, (504 & 64) != 0 ? false : false, (504 & 128) != 0 ? new TradePasswordExtensionsKt$executeTradePassword$1(null) : new TradeSubmitFragment$requestOrder$1(null), (504 & 256) != 0 ? new Function0() { // from class: com.kubi.safe.api.service.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradePasswordExtensionsKt.m56337f();
            }
        } : null, new TradeSubmitFragment$requestOrder$2(marketOderParams, this, tradeTypeRequestOrder, callback, null), (504 & 1024) != 0 ? new Function0() { // from class: com.kubi.safe.api.service.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradePasswordExtensionsKt.m56338g();
            }
        } : new Function0() { // from class: com.kubi.spot.business.submit.v1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeSubmitFragment.m61496h5();
            }
        }, (504 & 2048) != 0 ? new Function1() { // from class: com.kubi.safe.api.service.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradePasswordExtensionsKt.m56339h((Throwable) obj);
            }
        } : new Function1() { // from class: com.kubi.spot.business.submit.w1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitFragment.m61497i5(callback, this, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public void m61551i0(boolean z11) {
        this.f50348b0 = z11;
    }

    /* JADX INFO: renamed from: i4 */
    public final void m61552i4(boolean z11) {
        SavingConfig savingConfig = SavingConfig.f50323a;
        if (savingConfig.m61340h()) {
            if (z11) {
                SavingCacheManager.f50304a.m61298g(mo60189N(), getVisibleDisposable());
            } else {
                SavingCacheManager.f50304a.m61300m(mo60189N(), getVisibleDisposable(), this.f50351e0);
                savingConfig.m61344l(this.f50352f0);
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: j0 */
    public View m61553j0() {
        return findViewById(R$id.fl_container);
    }

    @Override // com.kubi.spot.business.ITradeParentBehavior
    /* JADX INFO: renamed from: l0 */
    public void mo60310l0() {
        ArrayList arrayList = new ArrayList();
        String[] stringArray = getResources().getStringArray(R$array.kucoin_all_or_single);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        int length = stringArray.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            String str = stringArray[i11];
            int i13 = i12 + 1;
            Intrinsics.checkNotNull(str);
            arrayList.add(new SelectEntity(null, str, null, null, null, null, null, null, null, false, i12 == C37878b0.f85252a.m85531l(), null, 3069, null));
            i11++;
            i12 = i13;
        }
        BaseDialogFragment baseDialogFragmentM54192r3 = BottomSheetDialogHelper.m58944B(BottomSheetDialogHelper.f48599a, arrayList, new BiConsumer() { // from class: com.kubi.spot.business.submit.q1
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                TradeSubmitFragment.m61500j5(this.f50432b, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, false, null, null, false, 60, null).m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.spot.business.submit.r1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                TradeSubmitFragment.m61503k5(this.f50436b, dialogInterface);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentM54192r3.show(childFragmentManager, "showOrderBookAmountDialog");
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof ITradeChildBehavior) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((ITradeChildBehavior) it.next()).mo60295b(0);
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final GooglePlayScoreHelper m61554l4() {
        return (GooglePlayScoreHelper) this.f50350d0.getValue();
    }

    /* JADX INFO: renamed from: n4 */
    public final ITradeBehavior m61555n4() {
        return (ITradeBehavior) this.f50356j0.getValue();
    }

    /* JADX INFO: renamed from: o2 */
    public void m61557o2(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2) {
        this.f50347a0.m89504d(bigDecimal, bigDecimal2);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.activity_fragment_container, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws Exception {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m61563x5();
        this.f50341U = mo60189N().getPriceIncrementPrecision();
        Observable<Boolean> observableObserveOn = C41016c.m89963a().observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.business.submit.n0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitFragment.m61449I4(this.f50424b, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.spot.business.submit.o0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeSubmitFragment.m61451J4(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.business.submit.p0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitFragment.m61453K4((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.business.submit.q0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeSubmitFragment.m61455L4(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        m61526t5(this, false, 1, null);
        CompositeDisposable destroyDisposable = getDestroyDisposable();
        PublishSubject<Boolean> publishSubjectM21641g = CallAuctionSwitch.f20317a.m21641g();
        final Function1 function3 = new Function1() { // from class: com.kubi.spot.business.submit.r0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitFragment.m61457M4(this.f50435b, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer2 = new Consumer() { // from class: com.kubi.spot.business.submit.s0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeSubmitFragment.m61443F4(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.spot.business.submit.t0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitFragment.m61445G4((Throwable) obj);
            }
        };
        destroyDisposable.add(publishSubjectM21641g.subscribe(consumer2, new Consumer() { // from class: com.kubi.spot.business.submit.u0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeSubmitFragment.m61447H4(function4, obj);
            }
        }));
    }

    @Override // com.kubi.spot.business.ITradeParentBehavior
    /* JADX INFO: renamed from: p0 */
    public void mo60311p0(@NotNull String label, int i11) {
        Intrinsics.checkNotNullParameter(label, "label");
        if (!isShowing() || isDetached() || isRemoving() || getChildFragmentManager().isDestroyed()) {
            return;
        }
        this.f50342V = i11;
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof ITradeChildBehavior) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ITradeChildBehavior) it.next()).mo60300d0(label, i11);
        }
        if (IUserService.a.get().c()) {
            if ((i11 == 1 || i11 == 4) && !C46392a.m102322d(C38519a.f86479a.m87137l(), false)) {
                AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.notice_prompt).m54153J4(R$string.toggle_market_tips).m54149F4(getLayoutInflater().inflate(R$layout.view_never_tips_next_time, (ViewGroup) null), new DialogFragmentHelper.InterfaceC22882b() { // from class: com.kubi.spot.business.submit.y0
                    @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
                    /* JADX INFO: renamed from: b3 */
                    public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                        TradeSubmitFragment.m61439D4(baseViewHolder, dialogFragmentHelper);
                    }
                }).m54162S4(R$string.i_know, null).m54172c5(getChildFragmentManager());
            }
        }
    }

    @Override // com.kubi.spot.business.ITradeBehavior
    @Nullable
    /* JADX INFO: renamed from: q0 */
    public Disposable mo60288q0(@NotNull C37787r wsDataHelper) {
        Intrinsics.checkNotNullParameter(wsDataHelper, "wsDataHelper");
        return m61555n4().mo60288q0(wsDataHelper);
    }

    @Override // com.kubi.spot.business.ITradeParentBehavior
    /* JADX INFO: renamed from: s0, reason: from getter */
    public int getF50341U() {
        return this.f50341U;
    }

    /* JADX INFO: renamed from: s5 */
    public final void m61558s5(boolean z11) throws Exception {
        BaseFragment baseFragmentM61528u4 = C37878b0.f85252a.m85527h(0) ? m61528u4() : m61499j4();
        if (!baseFragmentM61528u4.isAdded()) {
            getChildFragmentManager().beginTransaction().add(R$id.fl_container, baseFragmentM61528u4).commitNowAllowingStateLoss();
        }
        for (Fragment fragment : getChildFragmentManager().getFragments()) {
            if (Intrinsics.areEqual(fragment, baseFragmentM61528u4)) {
                C27032f.m66627r(this, baseFragmentM61528u4);
            } else {
                Intrinsics.checkNotNull(fragment);
                C27032f.m66615f(this, fragment);
            }
        }
        if (z11) {
            m61546O4();
        }
    }

    @Override // com.kubi.spot.business.ITradeParentBehavior
    @NotNull
    /* JADX INFO: renamed from: v0 */
    public TradeType mo60313v0() {
        C36606a c36606a = C36606a.f79410a;
        TradeType tradeType = (TradeType) CollectionsKt.getOrNull(c36606a.m81919b(), this.f50342V);
        if (tradeType != null) {
            return tradeType;
        }
        this.f50342V = 0;
        return c36606a.m81919b().get(0);
    }

    /* JADX INFO: renamed from: v5 */
    public final void m61560v5() {
        SavingConfig savingConfig = SavingConfig.f50323a;
        if (savingConfig.m61340h()) {
            savingConfig.m61345m(this.f50352f0);
            this.f50351e0.close();
        }
    }

    /* JADX INFO: renamed from: w4 */
    public final boolean m61561w4(Throwable th2) {
        if (!(th2 instanceof ApiException) || !Intrinsics.areEqual(((ApiException) th2).code, "400303")) {
            return false;
        }
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new TradeSubmitFragment$handleKYC0Error$1(this, th2, null));
        return true;
    }

    /* JADX INFO: renamed from: w5 */
    public final void m61562w5(@NotNull List<DelegationEntity> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        m61555n4().mo61540C2(data);
        this.f50343W.clear();
        ArrayList<OrderBookIndex> arrayList = this.f50343W;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(data, 10));
        for (DelegationEntity delegationEntity : data) {
            boolean zAreEqual = Intrinsics.areEqual(delegationEntity.getSide(), "buy");
            Double dValueOf = Double.valueOf(C27039d.m66647g(delegationEntity.getPrice()));
            BigDecimal price = delegationEntity.getPrice();
            arrayList2.add(new OrderBookIndex(zAreEqual, dValueOf, price != null ? OrderBookDataHelper.f51601a.m63278e(price, this.f50341U, !Intrinsics.areEqual(delegationEntity.getSide(), "sell")) : null));
        }
        arrayList.addAll(arrayList2);
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof ITradeChildBehavior) {
                arrayList3.add(obj);
            }
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            ((ITradeChildBehavior) it.next()).mo60298c0();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m61564y0(boolean z11) {
        this.f50344X = z11;
    }

    @Override // com.kubi.spot.business.ITradeParentBehavior
    @NotNull
    /* JADX INFO: renamed from: z0 */
    public ArrayList<OrderBookIndex> mo60314z0() {
        return this.f50343W;
    }

    /* JADX INFO: renamed from: B4 */
    public static final void m61435B4(TradeSubmitFragment tradeSubmitFragment, OrderBookEntity orderBookEntity) {
        Boolean boolValueOf;
        FragmentActivity activity = tradeSubmitFragment.getActivity();
        if (activity != null) {
            boolValueOf = Boolean.valueOf(activity.isFinishing());
        } else {
            boolValueOf = null;
        }
        if (!C27025c.m66566d(boolValueOf) && !tradeSubmitFragment.isDetached()) {
            List<Fragment> fragments = tradeSubmitFragment.getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ArrayList<ITradeChildBehavior> arrayList = new ArrayList();
            for (Object obj : fragments) {
                if (obj instanceof ITradeChildBehavior) {
                    arrayList.add(obj);
                }
            }
            for (ITradeChildBehavior iTradeChildBehavior : arrayList) {
                Intrinsics.checkNotNull(orderBookEntity);
                iTradeChildBehavior.mo60290F0(orderBookEntity);
            }
            if (!tradeSubmitFragment.f50353g0) {
                tradeSubmitFragment.f50353g0 = true;
                TracePageHelper.m42467b("load_spot");
                C43841b.m96557d("B5trading", "data_load_finish", null, 4, null);
            }
        }
    }

    /* JADX INFO: renamed from: C4 */
    public static final ITradeBehavior m61437C4(TradeSubmitFragment tradeSubmitFragment) {
        ActivityResultCaller parentFragment = tradeSubmitFragment.getParentFragment();
        Intrinsics.checkNotNull(parentFragment, "null cannot be cast to non-null type com.kubi.spot.business.ITradeBehavior");
        return (ITradeBehavior) parentFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public static final void m61443F4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H4 */
    public static final void m61447H4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m61449I4(TradeSubmitFragment tradeSubmitFragment, Boolean bool) {
        List<Fragment> fragments = tradeSubmitFragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof ITradeChildBehavior) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ITradeChildBehavior) it.next()).mo60293U();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final void m61451J4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L4 */
    public static final void m61455L4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M4 */
    public static final Unit m61457M4(TradeSubmitFragment tradeSubmitFragment, Boolean bool) {
        NewOrderBookHelper newOrderBookHelperM61507m4 = tradeSubmitFragment.m61507m4();
        String symbol = tradeSubmitFragment.mo60180J().getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        newOrderBookHelperM61507m4.m61756o(symbol, tradeSubmitFragment.f50341U);
        TradeHorizontalSubmitFragment tradeHorizontalSubmitFragment = null;
        TradeVerticalSubmitFragment tradeVerticalSubmitFragment = null;
        if (C37878b0.f85252a.m85527h(0)) {
            BaseFragment baseFragmentM61528u4 = tradeSubmitFragment.m61528u4();
            if (baseFragmentM61528u4 instanceof TradeVerticalSubmitFragment) {
                tradeVerticalSubmitFragment = (TradeVerticalSubmitFragment) baseFragmentM61528u4;
            }
            if (tradeVerticalSubmitFragment != null) {
                tradeVerticalSubmitFragment.m61634K3();
            }
        } else {
            BaseFragment baseFragmentM61499j4 = tradeSubmitFragment.m61499j4();
            if (baseFragmentM61499j4 instanceof TradeHorizontalSubmitFragment) {
                tradeHorizontalSubmitFragment = (TradeHorizontalSubmitFragment) baseFragmentM61499j4;
            }
            if (tradeHorizontalSubmitFragment != null) {
                tradeHorizontalSubmitFragment.m61421t4();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q4 */
    public static final void m61463Q4(final TradeSubmitFragment tradeSubmitFragment) {
        tradeSubmitFragment.getVisibleDisposable().clear();
        Disposable disposableM61754m = tradeSubmitFragment.m61507m4().m61754m();
        if (disposableM61754m != null) {
            DisposableKt.addTo(disposableM61754m, tradeSubmitFragment.getVisibleDisposable());
        }
        CompositeDisposable visibleDisposable = tradeSubmitFragment.getVisibleDisposable();
        SpotMarketSocketAdapter spotMarketSocketAdapter = SpotMarketSocketAdapter.f28144a;
        String symbol = tradeSubmitFragment.mo60180J().getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        Observable observableM32619F = SpotMarketSocketAdapter.m32619F(spotMarketSocketAdapter, symbol, false, new Function0() { // from class: com.kubi.spot.business.submit.b1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeSubmitFragment.m61465R4(this.f50377b);
            }
        }, 2, null);
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.business.submit.g1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TradeSubmitFragment.m61467S4(this.f50401b, (SpotMatchPushEntity) obj));
            }
        };
        Observable observableFilter = observableM32619F.filter(new Predicate() { // from class: com.kubi.spot.business.submit.i1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return TradeSubmitFragment.m61469T4(function1, obj);
            }
        });
        long jM59947l = SpotRemoteConfig.f49637a.m59947l();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Observable observableThrottleLatest = observableFilter.throttleLatest(jM59947l, timeUnit);
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.business.submit.j1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitFragment.m61471U4((SpotMatchPushEntity) obj);
            }
        };
        Observable observableObserveOn = observableThrottleLatest.map(new Function() { // from class: com.kubi.spot.business.submit.k1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return TradeSubmitFragment.m61473V4(function2, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final Function1 function3 = new Function1() { // from class: com.kubi.spot.business.submit.l1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitFragment.m61475W4(this.f50418b, (WsRecentDealEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.spot.business.submit.m1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeSubmitFragment.m61477X4(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.spot.business.submit.n1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitFragment.m61479Y4((Throwable) obj);
            }
        };
        visibleDisposable.add(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.business.submit.o1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeSubmitFragment.m61481Z4(function4, obj);
            }
        }));
        CompositeDisposable visibleDisposable2 = tradeSubmitFragment.getVisibleDisposable();
        PublishSubject<Message> publishSubjectM85233f = tradeSubmitFragment.m61530v4().m85233f("/account/balance", "");
        final Function1 function5 = new Function1() { // from class: com.kubi.spot.business.submit.p1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TradeSubmitFragment.m61483a5((Message) obj));
            }
        };
        Observable<Message> observableObserveOn2 = publishSubjectM85233f.filter(new Predicate() { // from class: com.kubi.spot.business.submit.c1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return TradeSubmitFragment.m61485b5(function5, obj);
            }
        }).debounce(200L, timeUnit).observeOn(AndroidSchedulers.mainThread());
        final Function1 function6 = new Function1() { // from class: com.kubi.spot.business.submit.d1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitFragment.m61487c5(this.f50386b, (Message) obj);
            }
        };
        Consumer<? super Message> consumer2 = new Consumer() { // from class: com.kubi.spot.business.submit.e1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeSubmitFragment.m61491e5(function6, obj);
            }
        };
        final TradeSubmitFragment$registerWsData$1$8 tradeSubmitFragment$registerWsData$1$8 = TradeSubmitFragment$registerWsData$1$8.INSTANCE;
        visibleDisposable2.add(observableObserveOn2.subscribe(consumer2, new Consumer() { // from class: com.kubi.spot.business.submit.f1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeSubmitFragment.m61493f5(tradeSubmitFragment$registerWsData$1$8, obj);
            }
        }));
        Disposable disposableMo60288q0 = tradeSubmitFragment.mo60288q0(tradeSubmitFragment.m61530v4());
        if (disposableMo60288q0 != null) {
            tradeSubmitFragment.getVisibleDisposable().add(disposableMo60288q0);
        }
    }

    /* JADX INFO: renamed from: R4 */
    public static final Observable m61465R4(TradeSubmitFragment tradeSubmitFragment) {
        C37787r c37787rM61530v4 = tradeSubmitFragment.m61530v4();
        String symbol = tradeSubmitFragment.mo60180J().getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        return c37787rM61530v4.m85233f("/market/match:%s", symbol);
    }

    /* JADX INFO: renamed from: W4 */
    public static final Unit m61475W4(TradeSubmitFragment tradeSubmitFragment, WsRecentDealEntity wsRecentDealEntity) {
        List<Fragment> fragments = tradeSubmitFragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof ITradeChildBehavior) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ITradeChildBehavior) it.next()).mo60302h0(wsRecentDealEntity.convertToOrderCenter(tradeSubmitFragment.f50346Z));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X4 */
    public static final void m61477X4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z4 */
    public static final void m61481Z4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e5 */
    public static final void m61491e5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f5 */
    public static final void m61493f5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j4 */
    private final BaseFragment m61499j4() {
        BaseFragment baseFragment;
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("horizontalSubmitFragment");
        if (fragmentFindFragmentByTag instanceof BaseFragment) {
            baseFragment = (BaseFragment) fragmentFindFragmentByTag;
        } else {
            baseFragment = null;
        }
        if (baseFragment == null) {
            TradeHorizontalSubmitFragment tradeHorizontalSubmitFragment = new TradeHorizontalSubmitFragment();
            getChildFragmentManager().beginTransaction().add(R$id.fl_container, tradeHorizontalSubmitFragment, "horizontalSubmitFragment").hide(tradeHorizontalSubmitFragment).commitNowAllowingStateLoss();
            return tradeHorizontalSubmitFragment;
        }
        return baseFragment;
    }

    /* JADX INFO: renamed from: k5 */
    public static final void m61503k5(TradeSubmitFragment tradeSubmitFragment, DialogInterface dialogInterface) {
        List<Fragment> fragments = tradeSubmitFragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof ITradeChildBehavior) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ITradeChildBehavior) it.next()).mo60297c(0);
        }
    }

    /* JADX INFO: renamed from: l5 */
    public static final void m61505l5(TradeSubmitFragment tradeSubmitFragment, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        tradeSubmitFragment.f50341U = tradeSubmitFragment.mo60189N().getPriceIncrementPrecision() - baseViewHolder.getAdapterPosition();
        List<Fragment> fragments = tradeSubmitFragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof ITradeChildBehavior) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ITradeChildBehavior) it.next()).mo60299d(interfaceC24339a.getLabel().toString(), tradeSubmitFragment.f50341U);
        }
        tradeSubmitFragment.m61507m4().m61748e(tradeSubmitFragment.f50341U);
        String strValueOf = String.valueOf(baseViewHolder.getAdapterPosition() + 2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tradeSubmitFragment.f50341U);
        sb2.append('_');
        String baseCurrency = tradeSubmitFragment.mo60189N().getBaseCurrency();
        Intrinsics.checkNotNullExpressionValue(baseCurrency, "getBaseCurrency(...)");
        Locale locale = Locale.ROOT;
        String lowerCase = baseCurrency.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        sb2.append(lowerCase);
        sb2.append('_');
        String quoteCurrency = tradeSubmitFragment.mo60189N().getQuoteCurrency();
        Intrinsics.checkNotNullExpressionValue(quoteCurrency, "getQuoteCurrency(...)");
        String lowerCase2 = quoteCurrency.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        sb2.append(lowerCase2);
        C43852m.m96590b("B5trading", "decimalShift", strValueOf, TuplesKt.m90091to("decimalValue", sb2.toString()));
    }

    /* JADX INFO: renamed from: m5 */
    public static final void m61508m5(TradeSubmitFragment tradeSubmitFragment, DialogInterface dialogInterface) {
        List<Fragment> fragments = tradeSubmitFragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof ITradeChildBehavior) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ITradeChildBehavior) it.next()).mo60297c(1);
        }
    }

    /* JADX INFO: renamed from: o5 */
    public static final Unit m61512o5(TradeSubmitFragment tradeSubmitFragment, Disposable disposable) {
        tradeSubmitFragment.showLoadingDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p5 */
    public static final void m61515p5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m61517q4(TradeSubmitFragment tradeSubmitFragment, OrderBookCenterEntity orderBookCenterEntity) {
        List<Fragment> fragments = tradeSubmitFragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList<ITradeChildBehavior> arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof ITradeChildBehavior) {
                arrayList.add(obj);
            }
        }
        for (ITradeChildBehavior iTradeChildBehavior : arrayList) {
            OrderBookCenterEntity orderBookCenterEntityCovert = tradeSubmitFragment.f50346Z.covert(orderBookCenterEntity);
            Intrinsics.checkNotNullExpressionValue(orderBookCenterEntityCovert, "covert(...)");
            iTradeChildBehavior.mo60302h0(orderBookCenterEntityCovert);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r4 */
    public static final void m61520r4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t4 */
    public static final void m61525t4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u4 */
    private final BaseFragment m61528u4() {
        BaseFragment baseFragment;
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("verticalSubmitFragment");
        if (fragmentFindFragmentByTag instanceof BaseFragment) {
            baseFragment = (BaseFragment) fragmentFindFragmentByTag;
        } else {
            baseFragment = null;
        }
        if (baseFragment == null) {
            TradeVerticalSubmitFragment tradeVerticalSubmitFragment = new TradeVerticalSubmitFragment();
            getChildFragmentManager().beginTransaction().add(R$id.fl_container, tradeVerticalSubmitFragment, "verticalSubmitFragment").hide(tradeVerticalSubmitFragment).commitNowAllowingStateLoss();
            return tradeVerticalSubmitFragment;
        }
        return baseFragment;
    }

    /* JADX INFO: renamed from: y4 */
    private final void m61535y4(boolean z11) throws Exception {
        m61546O4();
        mo60183K();
        mo60199m2();
        m61552i4(z11);
        Disposable disposableMo37924X = SpotDepend.f51244a.m63033c().mo37924X(mo60180J(), z11);
        if (disposableMo37924X != null) {
            DisposableKt.addTo(disposableMo37924X, getDestroyDisposable());
        }
    }

    @Override // com.kubi.spot.business.ITradeBehavior
    @NotNull
    /* JADX INFO: renamed from: H */
    public BaseFragment mo60178H() {
        return m61555n4().mo60178H();
    }

    @Override // com.kubi.spot.business.ITradeBehavior
    @NotNull
    /* JADX INFO: renamed from: I */
    public CurrencyBalance getF49729X() {
        return m61555n4().getF49729X();
    }

    @Override // com.kubi.spot.business.ITradeBehavior
    @NotNull
    /* JADX INFO: renamed from: J */
    public TradeItemBean mo60180J() {
        return m61555n4().mo60180J();
    }

    @Override // com.kubi.spot.business.ITradeBehavior
    /* JADX INFO: renamed from: K */
    public void mo60183K() {
        m61555n4().mo60183K();
    }

    @Override // com.kubi.spot.business.ITradeBehavior
    /* JADX INFO: renamed from: M */
    public boolean mo60188M() {
        return m61555n4().mo60188M();
    }

    /* JADX INFO: renamed from: M0 */
    public void m61544M0(@Nullable BigDecimal bigDecimal, @Nullable CharSequence charSequence, @Nullable BigDecimal bigDecimal2, @Nullable CharSequence charSequence2) {
        ITradeBehavior iTradeBehavior;
        ActivityResultCaller parentFragment = getParentFragment();
        if (parentFragment instanceof ITradeBehavior) {
            iTradeBehavior = (ITradeBehavior) parentFragment;
        } else {
            iTradeBehavior = null;
        }
        if (iTradeBehavior != null) {
            iTradeBehavior.mo60218w0(bigDecimal, charSequence, bigDecimal2, charSequence2);
        }
    }

    @Override // com.kubi.spot.business.ITradeBehavior
    @NotNull
    /* JADX INFO: renamed from: N */
    public SymbolInfoEntity mo60189N() {
        return m61555n4().mo60189N();
    }

    @Override // com.kubi.spot.business.ITradeBehavior
    @NotNull
    /* JADX INFO: renamed from: O */
    public CurrencyBalance getF49730Y() {
        return m61555n4().getF49730Y();
    }

    /* JADX INFO: renamed from: O4 */
    public final void m61546O4() throws Exception {
        mo60285W();
        mo22379g(true);
    }

    @Override // com.kubi.spot.business.ITradeBehavior
    /* JADX INFO: renamed from: P1 */
    public boolean mo60283P1() {
        return m61555n4().mo60283P1();
    }

    /* JADX INFO: renamed from: P4 */
    public void m61547P4() throws Exception {
        m61530v4().m85234g(new Action() { // from class: com.kubi.spot.business.submit.x0
            @Override // io.reactivex.functions.Action
            public final void run() {
                TradeSubmitFragment.m61463Q4(this.f50454b);
            }
        });
    }

    @Override // com.kubi.spot.business.ITradeBehavior
    /* JADX INFO: renamed from: W */
    public void mo60285W() {
        m61555n4().mo60285W();
    }

    @Override // com.kubi.spot.business.ITradeParentBehavior
    /* JADX INFO: renamed from: f0 */
    public void mo60309f0() {
        if (isShowing()) {
            List<Fragment> fragments = getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : fragments) {
                if (obj instanceof ITradeChildBehavior) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ITradeChildBehavior) it.next()).mo60301f0();
            }
        }
    }

    @Override // g10.InterfaceC37770a
    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: g */
    public void mo22379g(boolean z11) throws Exception {
        TradeModel tradeModelMo60203o0 = mo60203o0();
        String symbol = mo60180J().getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        Observable<OrderBookCenterEntity> observableM61856l = tradeModelMo60203o0.m61856l(symbol);
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.business.submit.c2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TradeSubmitFragment.m61511o4(this.f50382b, (OrderBookCenterEntity) obj));
            }
        };
        Observable<OrderBookCenterEntity> observableFilter = observableM61856l.filter(new Predicate() { // from class: com.kubi.spot.business.submit.d2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return TradeSubmitFragment.m61514p4(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.business.submit.e2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitFragment.m61517q4(this.f50394b, (OrderBookCenterEntity) obj);
            }
        };
        Consumer<? super OrderBookCenterEntity> consumer = new Consumer() { // from class: com.kubi.spot.business.submit.f2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeSubmitFragment.m61520r4(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.spot.business.submit.g2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitFragment.m61523s4((Throwable) obj);
            }
        };
        observableFilter.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.business.submit.m0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeSubmitFragment.m61525t4(function3, obj);
            }
        });
        m61507m4().m61750g();
        if (z11) {
            m61547P4();
        }
    }

    /* JADX INFO: renamed from: g5 */
    public final void m61550g5() {
        m61563x5();
        this.f50341U = mo60189N().getPriceIncrementPrecision();
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList<ITradeChildBehavior> arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof ITradeChildBehavior) {
                arrayList.add(obj);
            }
        }
        for (ITradeChildBehavior iTradeChildBehavior : arrayList) {
            iTradeChildBehavior.mo60292S();
            ITradeChildBehavior.m60289F1(iTradeChildBehavior, false, 1, null);
        }
        this.f50346Z.clear(mo60180J().getSymbol());
        this.f50343W.clear();
        NewOrderBookHelper newOrderBookHelperM61507m4 = m61507m4();
        String symbol = mo60180J().getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        newOrderBookHelperM61507m4.m61755n(symbol, this.f50341U);
    }

    @Override // com.kubi.spot.business.ITradeBehavior
    /* JADX INFO: renamed from: m2 */
    public void mo60199m2() {
        m61555n4().mo60199m2();
    }

    @Override // com.kubi.spot.business.ITradeBehavior
    /* JADX INFO: renamed from: n0 */
    public void mo60287n0() {
        m61555n4().mo60287n0();
    }

    /* JADX INFO: renamed from: n5 */
    public final void m61556n5(final Map<String, String> map, ITradeTypeRequestOrder iTradeTypeRequestOrder, final Function2<? super Boolean, ? super String, Unit> function2) {
        Observable<OrderResultEntity> observableM61859o = mo60203o0().m61859o(map, iTradeTypeRequestOrder);
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.business.submit.x1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitFragment.m61512o5(this.f50455b, (Disposable) obj);
            }
        };
        Disposable disposableSubscribe = observableM61859o.doOnSubscribe(new Consumer() { // from class: com.kubi.spot.business.submit.y1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeSubmitFragment.m61515p5(function1, obj);
            }
        }).subscribe(new Consumer() { // from class: com.kubi.spot.business.submit.z1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeSubmitFragment.m61518q5(this.f50461b, function2, map, (OrderResultEntity) obj);
            }
        }, new Consumer() { // from class: com.kubi.spot.business.submit.a2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws JSONException {
                TradeSubmitFragment.m61521r5(this.f50372b, function2, (Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    @Override // com.kubi.spot.business.ITradeBehavior
    @NotNull
    /* JADX INFO: renamed from: o0 */
    public TradeModel mo60203o0() {
        return m61555n4().mo60203o0();
    }

    /* JADX INFO: renamed from: u5 */
    public final void m61559u5(boolean z11) {
        m61530v4().m85236i(z11);
        m61507m4().m61758q(z11);
    }

    @Override // com.kubi.spot.business.ITradeBehavior
    /* JADX INFO: renamed from: w0 */
    public void mo60218w0(@Nullable BigDecimal bigDecimal, @Nullable CharSequence charSequence, @Nullable BigDecimal bigDecimal2, @Nullable CharSequence charSequence2) {
        m61555n4().mo60218w0(bigDecimal, charSequence, bigDecimal2, charSequence2);
    }

    /* JADX INFO: renamed from: x5 */
    public final void m61563x5() {
        String buyTaxRate;
        SymbolInfoEntity symbolInfoEntityMo60189N = mo60189N();
        C40883e c40883e = this.f50347a0;
        String code = symbolInfoEntityMo60189N.getCode();
        Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
        String baseCurrencyName = symbolInfoEntityMo60189N.getBaseCurrencyName();
        String baseCurrency = symbolInfoEntityMo60189N.getBaseCurrency();
        Intrinsics.checkNotNullExpressionValue(baseCurrency, "getBaseCurrency(...)");
        String strM66669i = C27041f.m66669i(baseCurrencyName, baseCurrency);
        String quoteCurrencyName = symbolInfoEntityMo60189N.getQuoteCurrencyName();
        String quoteCurrency = symbolInfoEntityMo60189N.getQuoteCurrency();
        Intrinsics.checkNotNullExpressionValue(quoteCurrency, "getQuoteCurrency(...)");
        c40883e.m89506f(new AvailableTradeAmountContext("classic_spot", code, strM66669i, C27041f.m66669i(quoteCurrencyName, quoteCurrency), DowngradeExKt.m66535e(symbolInfoEntityMo60189N.getBaseIncrement(), null, 1, null), DowngradeExKt.m66535e(symbolInfoEntityMo60189N.getQuoteIncrement(), null, 1, null), symbolInfoEntityMo60189N.getBaseIncrementPrecision(), symbolInfoEntityMo60189N.getQuoteIncrementPrecision()));
        IMarginService iMarginServiceM63033c = SpotDepend.f51244a.m63033c();
        C40883e c40883e2 = this.f50347a0;
        BigDecimal bigDecimal = (BigDecimal) ComparisonsKt.maxOf(iMarginServiceM63033c.mo37956r(symbolInfoEntityMo60189N), iMarginServiceM63033c.mo37911J(symbolInfoEntityMo60189N));
        FeeEntity feeEntityMo37947m0 = iMarginServiceM63033c.mo37947m0(symbolInfoEntityMo60189N);
        if (feeEntityMo37947m0 != null) {
            buyTaxRate = feeEntityMo37947m0.getBuyTaxRate();
        } else {
            buyTaxRate = null;
        }
        c40883e2.m89508h(bigDecimal.add(DowngradeExKt.m66535e(buyTaxRate, null, 1, null)));
    }
}
