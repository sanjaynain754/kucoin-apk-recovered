package com.kubi.core.biz.submit;

import af.C0296a;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import be.InterfaceC4578a;
import com.facebook.AuthenticationTokenClaims;
import com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment;
import com.kubi.core.base.order.data.C11623a;
import com.kubi.core.base.order.data.OrderItem;
import com.kubi.core.base.order.data.TradeSide;
import com.kubi.core.biz.callauction.CallAuctionSwitch;
import com.kubi.core.biz.submit.horizontal.TradeBaseHorizontalSubmitFragment;
import com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment;
import com.kubi.core.biz.symbol.SymbolBizUiState;
import com.kubi.core.spot.business.businessTrack.DurationTrackManager;
import com.kubi.core.spot.business.businessTrack.SpotBusinessTracker;
import com.kubi.core.spot.business.holder.ITradeHolderDependDelegate;
import com.kubi.core.spot.entity.MarginSymbolInfo;
import com.kubi.core.spot.entity.OrderBookCenterEntity;
import com.kubi.core.spot.entity.OrderResultEntity;
import com.kubi.core.spot.entity.WsRecentDealEntity;
import com.kubi.core.spot.helper.ITradeTypeRequestOrder;
import com.kubi.core.spot.helper.NewOrderBookHelper;
import com.kubi.core.spot.helper.TradeModel;
import com.kubi.core.utils.C12462a;
import com.kubi.data.coin.AccountType;
import com.kubi.data.entity.OrderBookEntity;
import com.kubi.data.entity.OrderBookIndex;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.kucoin.manager.SpotMarketSocketAdapter;
import com.kubi.kucoin.manager.SpotMatchPushEntity;
import com.kubi.monitor.helper.TracePageHelper;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.otc.entity.OtcAd;
import com.kubi.p110rn.Constants;
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
import com.kubi.spot.api.ISpotCommonService;
import com.kubi.tradebase.business.kyc.KycViewModel;
import com.kubi.tradebase.orderbook.OrderBookDataHelper;
import com.kubi.tradebase.tradetype.TradeType;
import com.kubi.tradecorebiz.R$array;
import com.kubi.tradecorebiz.R$id;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.tradecorebiz.R$string;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27099x;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import ee.C37136a;
import g10.C37787r;
import g10.InterfaceC37770a;
import gd.InterfaceC37868a;
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
import k30.AvailableTradeAmountState;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41673r;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p260fd.ChangeRateData;
import p309hd.InterfaceC38169a;
import p309hd.InterfaceC38170b;
import p309hd.TradeSettingsBean;
import p310he.InterfaceC38174a;
import p310he.InterfaceC38175b;
import p402kf.C41016c;
import p569qq.C43841b;
import p569qq.C43852m;
import p639te.C44934a;
import p722wd.C45796e;
import p756xc.BalanceData;
import p756xc.TradeSymbolBalance;
import p827zc.AbstractC46753c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Triple;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import ro.C44128b;
import ve.C45518a;
import y70.C46392a;

/* JADX INFO: compiled from: TradeCoreSubmitFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u0097\u00012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u00062\u00020\u0007:\u0002\u0097\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u00108\u001a\u00020%H\u0014J\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0002J\u0010\u0010>\u001a\u00020;2\u0006\u0010?\u001a\u00020=H\u0016J\u0010\u0010@\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0016J\u0018\u0010A\u001a\u00020;2\u0006\u0010B\u001a\u00020C2\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010D\u001a\u00020;H\u0002J@\u0010E\u001a\u00020;2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020C0G2\u0006\u0010H\u001a\u00020I2\u001a\u0010J\u001a\u0016\u0012\u0004\u0012\u00020.\u0012\u0006\u0012\u0004\u0018\u00010C\u0012\u0004\u0012\u00020;0KH\u0002J8\u0010L\u001a\u00020;2\u001a\u0010J\u001a\u0016\u0012\u0004\u0012\u00020.\u0012\u0006\u0012\u0004\u0018\u00010C\u0012\u0004\u0012\u00020;0K2\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020C0GH\u0002J@\u0010N\u001a\u00020;2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020C0G2\u0006\u0010H\u001a\u00020I2\u001a\u0010J\u001a\u0016\u0012\u0004\u0012\u00020.\u0012\u0006\u0012\u0004\u0018\u00010C\u0012\u0004\u0012\u00020;0KH\u0016JT\u0010O\u001a\u00020;2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020C0G2\u0006\u0010H\u001a\u00020I2\u001a\u0010J\u001a\u0016\u0012\u0004\u0012\u00020.\u0012\u0006\u0012\u0004\u0018\u00010C\u0012\u0004\u0012\u00020;0K2\b\u0010?\u001a\u0004\u0018\u00010=2\b\u0010P\u001a\u0004\u0018\u00010CH\u0002J\b\u0010Q\u001a\u00020\u001fH\u0016J\b\u0010R\u001a\u00020SH\u0016J\b\u0010T\u001a\u00020SH\u0016J\b\u0010U\u001a\u00020;H\u0016J\b\u0010V\u001a\u00020WH\u0016J\b\u0010X\u001a\u00020.H\u0016J\b\u0010Y\u001a\u00020=H\u0016J\u001a\u0010Z\u001a\u00020.2\b\u0010[\u001a\u0004\u0018\u00010\\2\u0006\u0010]\u001a\u00020^H\u0002J\u0010\u0010_\u001a\u00020;2\u0006\u0010`\u001a\u00020aH\u0016J\u0010\u0010b\u001a\u00020;2\u0006\u0010c\u001a\u00020.H\u0016J\b\u0010d\u001a\u00020.H\u0016J\u0010\u0010e\u001a\u00020;2\u0006\u0010c\u001a\u00020.H\u0016J\b\u0010f\u001a\u00020.H\u0016J\u0010\u0010r\u001a\u00020;2\u0006\u0010s\u001a\u00020.H\u0017J\u001a\u0010t\u001a\u00020;2\u0006\u0010u\u001a\u00020v2\b\u0010w\u001a\u0004\u0018\u00010xH\u0016J\b\u0010y\u001a\u00020;H\u0016J\b\u0010z\u001a\u00020;H\u0016J\b\u0010{\u001a\u00020;H\u0014J\b\u0010|\u001a\u00020;H\u0016J\b\u0010}\u001a\u00020;H\u0016J\b\u0010~\u001a\u00020;H\u0016J!\u0010\u007f\u001a\u00020;2\t\b\u0002\u0010\u0080\u0001\u001a\u00020.2\f\b\u0002\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0082\u0001H\u0002J\u000b\u0010\u0083\u0001\u001a\u0004\u0018\u00010vH\u0016J\t\u0010\u0084\u0001\u001a\u00020.H\u0016J\t\u0010\u0085\u0001\u001a\u000201H\u0016J\b\u0010$\u001a\u00020%H\u0016J\t\u0010\u0086\u0001\u001a\u00020.H\u0016J\u0012\u0010\u0087\u0001\u001a\u00020;2\u0007\u0010\u0086\u0001\u001a\u00020.H\u0016J\u001b\u0010\u0088\u0001\u001a\u00020;2\u0007\u0010\u0089\u0001\u001a\u00020C2\u0007\u0010\u008a\u0001\u001a\u00020(H\u0016J\u0012\u0010\u008b\u0001\u001a\u00020;2\u0007\u0010\u008a\u0001\u001a\u00020(H\u0002J\u000f\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020+0*H\u0016J\u0019\u0010\u008d\u0001\u001a\u00020;2\u000e\u0010\u008e\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010'H\u0002J\u0014\u0010\u0090\u0001\u001a\u00020;2\t\b\u0002\u0010\u0091\u0001\u001a\u00020.H\u0002J\u0012\u0010\u0092\u0001\u001a\u00020;2\u0007\u0010\u008e\u0001\u001a\u00020=H\u0002J\u0012\u0010\u0093\u0001\u001a\u00020;2\u0007\u0010\u0094\u0001\u001a\u00020.H\u0002J\u0014\u0010\u0095\u0001\u001a\u00020.2\t\u0010\u0096\u0001\u001a\u0004\u0018\u00010CH\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010)\u001a\u0012\u0012\u0004\u0012\u00020+0*j\b\u0012\u0004\u0012\u00020+`,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u00103\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u0016\u001a\u0004\b5\u00106R\u000e\u00109\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010h\u001a\u00020i8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010\u0016\u001a\u0004\bj\u0010kR\u001b\u0010m\u001a\u00020n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010\u0016\u001a\u0004\bo\u0010p¨\u0006\u0098\u0001"}, m90084d2 = {"Lcom/kubi/core/biz/submit/TradeCoreSubmitFragment;", "Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizFragment;", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent;", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;", "Lcom/kubi/core/biz/submit/TradeSubmitVM;", "Lcom/kubi/sdk/websocket/IWsDataGetter;", "Lcom/kubi/core/spot/business/ITradeParentBehavior;", "Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;", "<init>", "()V", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "createVM", "manager", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "utaMarginTradeCoreViewModel", "Lcom/kubi/core/biz/submit/UtaMarginTradeCoreViewModel;", "getUtaMarginTradeCoreViewModel", "()Lcom/kubi/core/biz/submit/UtaMarginTradeCoreViewModel;", "utaMarginTradeCoreViewModel$delegate", "Lkotlin/Lazy;", "mTradeModel", "Lcom/kubi/core/spot/helper/TradeModel;", Constants.BIZ, "Lcom/kubi/core/config/TradeBiz;", "getBiz", "()Lcom/kubi/core/config/TradeBiz;", "getTradeCoreDataRepoProvider", "verticalSubmitFragment", "Lcom/kubi/sdk/BaseFragment;", "getVerticalSubmitFragment", "()Lcom/kubi/sdk/BaseFragment;", "horizontalSubmitFragment", "getHorizontalSubmitFragment", "lastPrecision", "", "lastSupportTradeTypeKeys", "", "Lcom/kubi/tradebase/tradetype/TradeType;", "activeDelegationList", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/OrderBookIndex;", "Lkotlin/collections/ArrayList;", "limitStopPriceFocused", "", "ocoStopLimitPriceFocused", "mBboData", "Lcom/kubi/core/spot/entity/OrderBookCenterEntity;", "mIsBuy", "kycViewModel", "Lcom/kubi/tradebase/business/kyc/KycViewModel;", "getKycViewModel", "()Lcom/kubi/tradebase/business/kyc/KycViewModel;", "kycViewModel$delegate", "getLayout", "isInit", "initPage", "", "symbolInfoData", "Lcom/kubi/data/entity/SymbolInfoEntity;", "showOrderBookAmountDialog", "symbolInfo", "showOrderPrecisionDialog", "resetOrderBook", "symbol", "", "collectBuyDirectionData", "showWithdrawDialog", "marketOderParams", "", "tradeTypeRequestOrder", "Lcom/kubi/core/spot/helper/ITradeTypeRequestOrder;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "orderDone", "orderParams", "requestOrder", "submitOrderAfterSecurityCheck", "baseCurrency", "fragment", "getBaseBalance", "Lcom/kubi/core/base/arch/api/data/BalanceData;", "getQuoteBalance", "fetchSymbolBalance", "currentSymbol", "Lcom/kubi/data/entity/TradeItemBean;", "isMaintenance", "currentSymbolInfo", "handleKYC0Error", "orderConfig", "Lcom/kubi/core/biz/submit/SubmitOrderConfig;", "it", "", "onClickOrderBookPrice", "value", "Ljava/math/BigDecimal;", "setLimitStopPriceFocused", "hasFocus", "isLimitStopPriceFocused", "setOcoStopLimitPriceFocused", "isOcoStopLimitPriceFocused", "hasTrack", "wsDataHelper", "Lcom/kubi/sdk/websocket/WsDataHelper;", "getWsDataHelper", "()Lcom/kubi/sdk/websocket/WsDataHelper;", "wsDataHelper$delegate", "mOrderBookHelper", "Lcom/kubi/core/spot/helper/NewOrderBookHelper;", "getMOrderBookHelper", "()Lcom/kubi/core/spot/helper/NewOrderBookHelper;", "mOrderBookHelper$delegate", "getRestfulData", "isResetWs", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onRefresh", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "bindState", "onAgainShow", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "registerWsData", "toggleCurrentFragment", "refresh", "mode", "Lcom/kubi/core/base/setting/data/TradePanelModel;", "getContainerView", "isSupportBorrow", "bboData", "isBuy", "setIsBuy", "onTradeTypeChanged", com.google.firebase.messaging.Constants.ScionAnalytics.PARAM_LABEL, "tradeType", "trackTradeTypeChanged", "getActiveDelegationList", "updateActiveOrders", "data", "Lcom/kubi/core/base/order/data/ActiveOrdersData$OrderItem;", "loadData", "isRefresh", "reloadSymbols", "toggleSubscribe", AuthenticationTokenClaims.JSON_KEY_SUB, "isBuyByRequestOrderParam", "side", "Companion", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeCoreSubmitFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeCoreSubmitFragment.kt\ncom/kubi/core/biz/submit/TradeCoreSubmitFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n+ 6 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 7 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 8 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 9 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 10 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,1001:1\n106#2,15:1002\n13537#3,3:1017\n808#4,11:1020\n1869#4,2:1031\n1573#4:1033\n1604#4,4:1034\n808#4,11:1038\n1869#4,2:1049\n808#4,11:1054\n774#4:1065\n865#4,2:1066\n808#4,11:1068\n1869#4,2:1079\n1869#4,2:1101\n808#4,11:1103\n1869#4,2:1114\n1563#4:1118\n1634#4,3:1119\n774#4:1122\n865#4,2:1123\n808#4,11:1125\n1869#4,2:1136\n808#4,11:1138\n1869#4,2:1149\n808#4,11:1156\n1869#4,2:1167\n808#4,11:1169\n1869#4,2:1180\n808#4,11:1182\n1869#4,2:1193\n808#4,11:1195\n1869#4,2:1206\n808#4,11:1208\n1869#4,2:1219\n808#4,11:1221\n1869#4,2:1232\n808#4,11:1234\n1869#4,2:1245\n808#4,11:1247\n1869#4,2:1258\n35#5,3:1051\n49#6:1081\n51#6:1085\n49#6:1086\n51#6:1090\n49#6:1091\n51#6:1095\n49#6:1096\n51#6:1100\n46#7:1082\n51#7:1084\n46#7:1087\n51#7:1089\n46#7:1092\n51#7:1094\n46#7:1097\n51#7:1099\n105#8:1083\n105#8:1088\n105#8:1093\n105#8:1098\n135#9,2:1116\n126#9,2:1260\n220#10,5:1151\n*S KotlinDebug\n*F\n+ 1 TradeCoreSubmitFragment.kt\ncom/kubi/core/biz/submit/TradeCoreSubmitFragment\n*L\n123#1:1002,15\n196#1:1017,3\n212#1:1020,11\n213#1:1031,2\n223#1:1033\n223#1:1034,4\n244#1:1038,11\n245#1:1049,2\n588#1:1054,11\n588#1:1065\n588#1:1066,2\n589#1:1068,11\n589#1:1079,2\n861#1:1101,2\n909#1:1103,11\n910#1:1114,2\n945#1:1118\n945#1:1119,3\n957#1:1122\n957#1:1123,2\n958#1:1125,11\n959#1:1136,2\n978#1:1138,11\n978#1:1149,2\n175#1:1156,11\n176#1:1167,2\n205#1:1169,11\n206#1:1180,2\n209#1:1182,11\n210#1:1193,2\n230#1:1195,11\n231#1:1206,2\n241#1:1208,11\n242#1:1219,2\n619#1:1221,11\n620#1:1232,2\n642#1:1234,11\n643#1:1245,2\n829#1:1247,11\n830#1:1258,2\n451#1:1051,3\n676#1:1081\n676#1:1085\n694#1:1086\n694#1:1090\n704#1:1091\n704#1:1095\n725#1:1096\n725#1:1100\n676#1:1082\n676#1:1084\n694#1:1087\n694#1:1089\n704#1:1092\n704#1:1094\n725#1:1097\n725#1:1099\n676#1:1083\n694#1:1088\n704#1:1093\n725#1:1098\n913#1:1116,2\n921#1:1260,2\n162#1:1151,5\n*E\n"})
public final class TradeCoreSubmitFragment extends AbsTradeBaseBizFragment<TradeSubmitBizContract$UiIntent, UiState, TradeSubmitVM> implements InterfaceC37770a, InterfaceC38175b, ITradeHolderDependDelegate {

    /* JADX INFO: renamed from: m0 */
    @NotNull
    public static final Companion f20627m0 = new Companion(null);

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f20628Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final TradeModel f20629Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final InterfaceC4578a f20630a0;

    /* JADX INFO: renamed from: b0 */
    public int f20631b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public List<? extends TradeType> f20632c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final ArrayList<OrderBookIndex> f20633d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f20634e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final OrderBookCenterEntity f20635f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f20636g0;

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final Lazy f20637h0;

    /* JADX INFO: renamed from: i0 */
    public boolean f20638i0;

    /* JADX INFO: renamed from: j0 */
    public boolean f20639j0;

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public final Lazy f20640k0;

    /* JADX INFO: renamed from: l0 */
    @NotNull
    public final Lazy f20641l0;

    /* JADX INFO: compiled from: TradeCoreSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/core/biz/submit/TradeCoreSubmitFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/core/biz/submit/TradeCoreSubmitFragment;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final TradeCoreSubmitFragment newInstance() {
            return new TradeCoreSubmitFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$11 */
    /* JADX INFO: compiled from: TradeCoreSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/data/entity/SymbolInfoEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$11", m90122f = "TradeCoreSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1204111 extends SuspendLambda implements Function2<SymbolInfoEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SymbolInfoEntity symbolInfoEntity, Continuation<? super Unit> continuation) {
            return ((C1204111) create(symbolInfoEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C1204111(Continuation<? super C1204111> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1204111 c1204111 = TradeCoreSubmitFragment.this.new C1204111(continuation);
            c1204111.L$0 = obj;
            return c1204111;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            SymbolInfoEntity symbolInfoEntity = (SymbolInfoEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (TradeCoreSubmitFragment.this.f20638i0) {
                TradeCoreSubmitFragment.this.m22361K5(symbolInfoEntity);
            } else {
                TradeCoreSubmitFragment.this.m22381h5(symbolInfoEntity);
            }
            TradeCoreSubmitFragment.m22343t5(TradeCoreSubmitFragment.this, false, 1, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$13 */
    /* JADX INFO: compiled from: TradeCoreSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/core/biz/submit/TradeTypeUiData;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$13", m90122f = "TradeCoreSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nTradeCoreSubmitFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeCoreSubmitFragment.kt\ncom/kubi/core/biz/submit/TradeCoreSubmitFragment$bindState$13\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1001:1\n1563#2:1002\n1634#2,3:1003\n*S KotlinDebug\n*F\n+ 1 TradeCoreSubmitFragment.kt\ncom/kubi/core/biz/submit/TradeCoreSubmitFragment$bindState$13\n*L\n738#1:1002\n738#1:1003,3\n*E\n"})
    public static final class C1204313 extends SuspendLambda implements Function2<List<? extends TradeTypeUiData>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C1204313(Continuation<? super C1204313> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1204313 c1204313 = TradeCoreSubmitFragment.this.new C1204313(continuation);
            c1204313.L$0 = obj;
            return c1204313;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends TradeTypeUiData> list, Continuation<? super Unit> continuation) {
            return ((C1204313) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String symbol;
            List<? extends TradeTypeUiData> listEmptyList = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<? extends TradeTypeUiData> listEmptyList2 = listEmptyList == null ? CollectionsKt.emptyList() : listEmptyList;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listEmptyList2, 10));
            Iterator it = listEmptyList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((TradeTypeUiData) it.next()).getF20771b());
            }
            boolean zAreEqual = Intrinsics.areEqual(arrayList, TradeCoreSubmitFragment.this.f20632c0);
            TradeCoreSubmitFragment.this.f20632c0 = arrayList;
            if (!zAreEqual && (symbol = TradeCoreSubmitFragment.m22256F4(TradeCoreSubmitFragment.this).getSymbol()) != null) {
                TradeCoreSubmitFragment tradeCoreSubmitFragment = TradeCoreSubmitFragment.this;
                tradeCoreSubmitFragment.m22372W4().m23311o(symbol, tradeCoreSubmitFragment.f20631b0);
            }
            if (C37878b0.f85252a.m85527h(ISpotCommonService.f49644a.get().mo59970n())) {
                BaseFragment baseFragmentM22377e5 = TradeCoreSubmitFragment.this.m22377e5();
                TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment = baseFragmentM22377e5 instanceof TradeBaseVerticalSubmitFragment ? (TradeBaseVerticalSubmitFragment) baseFragmentM22377e5 : null;
                if (tradeBaseVerticalSubmitFragment != null) {
                    tradeBaseVerticalSubmitFragment.m22703j4();
                }
            } else {
                BaseFragment baseFragmentM22371U4 = TradeCoreSubmitFragment.this.m22371U4();
                TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment = baseFragmentM22371U4 instanceof TradeBaseHorizontalSubmitFragment ? (TradeBaseHorizontalSubmitFragment) baseFragmentM22371U4 : null;
                if (tradeBaseHorizontalSubmitFragment != null) {
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    tradeBaseHorizontalSubmitFragment.m22592F4(listEmptyList);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$15 */
    /* JADX INFO: compiled from: TradeCoreSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/base/setting/data/TradePanelModel;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$15", m90122f = "TradeCoreSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1204515 extends SuspendLambda implements Function2<InterfaceC38170b, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC38170b interfaceC38170b, Continuation<? super Unit> continuation) {
            return ((C1204515) create(interfaceC38170b, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C1204515(Continuation<? super C1204515> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1204515 c1204515 = TradeCoreSubmitFragment.this.new C1204515(continuation);
            c1204515.L$0 = obj;
            return c1204515;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            InterfaceC38170b interfaceC38170b = (InterfaceC38170b) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TradeCoreSubmitFragment.m22301X5(TradeCoreSubmitFragment.this, true, null, 2, null);
            TradeCoreSubmitFragment.this.m21011A3().m22455B0(new TradeSubmitBizContract$UiIntent.PanelModelChange(interfaceC38170b));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$17 */
    /* JADX INFO: compiled from: TradeCoreSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/core/base/order/data/ActiveOrdersData$OrderItem;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$17", m90122f = "TradeCoreSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1204717 extends SuspendLambda implements Function2<List<? extends OrderItem>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends OrderItem> list, Continuation<? super Unit> continuation) {
            return invoke2((List<OrderItem>) list, continuation);
        }

        public C1204717(Continuation<? super C1204717> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1204717 c1204717 = TradeCoreSubmitFragment.this.new C1204717(continuation);
            c1204717.L$0 = obj;
            return c1204717;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<OrderItem> list, Continuation<? super Unit> continuation) {
            return ((C1204717) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List listEmptyList = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TradeCoreSubmitFragment tradeCoreSubmitFragment = TradeCoreSubmitFragment.this;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            tradeCoreSubmitFragment.m22309a6(listEmptyList);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$19 */
    /* JADX INFO: compiled from: TradeCoreSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/base/arch/api/data/TradeSymbolBalance;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$19", m90122f = "TradeCoreSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nTradeCoreSubmitFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeCoreSubmitFragment.kt\ncom/kubi/core/biz/submit/TradeCoreSubmitFragment$bindState$19\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1001:1\n808#2,11:1002\n1869#2,2:1013\n*S KotlinDebug\n*F\n+ 1 TradeCoreSubmitFragment.kt\ncom/kubi/core/biz/submit/TradeCoreSubmitFragment$bindState$19\n*L\n773#1:1002,11\n774#1:1013,2\n*E\n"})
    public static final class C1204919 extends SuspendLambda implements Function2<TradeSymbolBalance, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C1204919(Continuation<? super C1204919> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1204919 c1204919 = TradeCoreSubmitFragment.this.new C1204919(continuation);
            c1204919.L$0 = obj;
            return c1204919;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(TradeSymbolBalance tradeSymbolBalance, Continuation<? super Unit> continuation) {
            return ((C1204919) create(tradeSymbolBalance, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TradeSymbolBalance tradeSymbolBalance = (TradeSymbolBalance) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<Fragment> fragments = TradeCoreSubmitFragment.this.getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : fragments) {
                if (obj2 instanceof InterfaceC38174a) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC38174a) it.next()).mo22599S();
            }
            TradeCoreSubmitFragment.this.m21020z3().m21740s(new C45796e(tradeSymbolBalance));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$21 */
    /* JADX INFO: compiled from: TradeCoreSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/base/arch/api/data/TradeSymbolBalance;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$21", m90122f = "TradeCoreSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nTradeCoreSubmitFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeCoreSubmitFragment.kt\ncom/kubi/core/biz/submit/TradeCoreSubmitFragment$bindState$21\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1001:1\n808#2,11:1002\n1869#2,2:1013\n*S KotlinDebug\n*F\n+ 1 TradeCoreSubmitFragment.kt\ncom/kubi/core/biz/submit/TradeCoreSubmitFragment$bindState$21\n*L\n778#1:1002,11\n779#1:1013,2\n*E\n"})
    public static final class C1205121 extends SuspendLambda implements Function2<TradeSymbolBalance, Continuation<? super Unit>, Object> {
        int label;

        public C1205121(Continuation<? super C1205121> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TradeCoreSubmitFragment.this.new C1205121(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(TradeSymbolBalance tradeSymbolBalance, Continuation<? super Unit> continuation) {
            return ((C1205121) create(tradeSymbolBalance, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                List<Fragment> fragments = TradeCoreSubmitFragment.this.getChildFragmentManager().getFragments();
                Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : fragments) {
                    if (obj2 instanceof InterfaceC38174a) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC38174a) it.next()).mo22599S();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$23 */
    /* JADX INFO: compiled from: TradeCoreSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/tradebase/available/AvailableTradeAmountState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$23", m90122f = "TradeCoreSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nTradeCoreSubmitFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeCoreSubmitFragment.kt\ncom/kubi/core/biz/submit/TradeCoreSubmitFragment$bindState$23\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1001:1\n808#2,11:1002\n1869#2,2:1013\n*S KotlinDebug\n*F\n+ 1 TradeCoreSubmitFragment.kt\ncom/kubi/core/biz/submit/TradeCoreSubmitFragment$bindState$23\n*L\n782#1:1002,11\n783#1:1013,2\n*E\n"})
    public static final class C1205323 extends SuspendLambda implements Function2<AvailableTradeAmountState, Continuation<? super Unit>, Object> {
        int label;

        public C1205323(Continuation<? super C1205323> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TradeCoreSubmitFragment.this.new C1205323(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(AvailableTradeAmountState availableTradeAmountState, Continuation<? super Unit> continuation) {
            return ((C1205323) create(availableTradeAmountState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                List<Fragment> fragments = TradeCoreSubmitFragment.this.getChildFragmentManager().getFragments();
                Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : fragments) {
                    if (obj2 instanceof InterfaceC38174a) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC38174a) it.next()).mo22616p2();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$25 */
    /* JADX INFO: compiled from: TradeCoreSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$25", m90122f = "TradeCoreSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1205525 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        int label;

        public C1205525(Continuation<? super C1205525> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TradeCoreSubmitFragment.this.new C1205525(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((C1205525) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                TradeCoreSubmitFragment.m22343t5(TradeCoreSubmitFragment.this, false, 1, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$27 */
    /* JADX INFO: compiled from: TradeCoreSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/spot/entity/MarginSymbolInfo;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$27", m90122f = "TradeCoreSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nTradeCoreSubmitFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeCoreSubmitFragment.kt\ncom/kubi/core/biz/submit/TradeCoreSubmitFragment$bindState$27\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1001:1\n808#2,11:1002\n1869#2,2:1013\n*S KotlinDebug\n*F\n+ 1 TradeCoreSubmitFragment.kt\ncom/kubi/core/biz/submit/TradeCoreSubmitFragment$bindState$27\n*L\n791#1:1002,11\n792#1:1013,2\n*E\n"})
    public static final class C1205727 extends SuspendLambda implements Function2<MarginSymbolInfo, Continuation<? super Unit>, Object> {
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(MarginSymbolInfo marginSymbolInfo, Continuation<? super Unit> continuation) {
            return ((C1205727) create(marginSymbolInfo, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C1205727(Continuation<? super C1205727> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TradeCoreSubmitFragment.this.new C1205727(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                List<Fragment> fragments = TradeCoreSubmitFragment.this.getChildFragmentManager().getFragments();
                Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : fragments) {
                    if (obj2 instanceof InterfaceC38174a) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC38174a) it.next()).mo22608h2();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$3 */
    /* JADX INFO: compiled from: TradeCoreSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/data/entity/SymbolInfoEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$3", m90122f = "TradeCoreSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C120583 extends SuspendLambda implements Function2<SymbolInfoEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SymbolInfoEntity symbolInfoEntity, Continuation<? super Unit> continuation) {
            return ((C120583) create(symbolInfoEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C120583(Continuation<? super C120583> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C120583 c120583 = TradeCoreSubmitFragment.this.new C120583(continuation);
            c120583.L$0 = obj;
            return c120583;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            SymbolInfoEntity symbolInfoEntity = (SymbolInfoEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (TradeCoreSubmitFragment.this.f20638i0) {
                TradeCoreSubmitFragment.this.m22361K5(symbolInfoEntity);
            } else {
                TradeCoreSubmitFragment.this.m22381h5(symbolInfoEntity);
            }
            TradeSubmitVM tradeSubmitVMM21011A3 = TradeCoreSubmitFragment.this.m21011A3();
            if (tradeSubmitVMM21011A3 != null) {
                tradeSubmitVMM21011A3.m22455B0(new TradeSubmitBizContract$UiIntent.ChangeSymbol(symbolInfoEntity.getCode(), symbolInfoEntity));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$6 */
    /* JADX INFO: compiled from: TradeCoreSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/data/entity/SymbolInfoEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$6", m90122f = "TradeCoreSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C120596 extends SuspendLambda implements Function2<SymbolInfoEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SymbolInfoEntity symbolInfoEntity, Continuation<? super Unit> continuation) {
            return ((C120596) create(symbolInfoEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C120596(Continuation<? super C120596> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C120596 c120596 = TradeCoreSubmitFragment.this.new C120596(continuation);
            c120596.L$0 = obj;
            return c120596;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SymbolInfoEntity symbolInfoEntity = (SymbolInfoEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TradeSubmitVM tradeSubmitVMM21011A3 = TradeCoreSubmitFragment.this.m21011A3();
            if (tradeSubmitVMM21011A3 != null) {
                tradeSubmitVMM21011A3.m22455B0(new TradeSubmitBizContract$UiIntent.UpdateSymbolInfo(symbolInfoEntity));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$8 */
    /* JADX INFO: compiled from: TradeCoreSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u001c\u0010\u0002\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lkotlin/Triple;", "", "", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$8", m90122f = "TradeCoreSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C120608 extends SuspendLambda implements Function2<Triple<? extends String, ? extends Integer, ? extends Boolean>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Triple<? extends String, ? extends Integer, ? extends Boolean> triple, Continuation<? super Unit> continuation) {
            return invoke2((Triple<String, Integer, Boolean>) triple, continuation);
        }

        public C120608(Continuation<? super C120608> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C120608 c120608 = TradeCoreSubmitFragment.this.new C120608(continuation);
            c120608.L$0 = obj;
            return c120608;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Triple<String, Integer, Boolean> triple, Continuation<? super Unit> continuation) {
            return ((C120608) create(triple, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Triple triple = (Triple) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str = (String) triple.getFirst();
            Integer num = (Integer) triple.getSecond();
            if (str != null && num != null) {
                TradeCoreSubmitFragment.this.m22364M5(str, num.intValue());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: V5 */
    public static final void m22297V5(TradeCoreSubmitFragment tradeCoreSubmitFragment, Function2 function2, Map map, SymbolInfoEntity symbolInfoEntity, String str, Throwable th2) throws JSONException {
        String baseCurrency = null;
        BaseFragment.hideLoadingDialog$default(tradeCoreSubmitFragment, false, 1, null);
        boolean z11 = th2 instanceof ApiException;
        if (z11) {
            Boolean bool = Boolean.FALSE;
            StringBuilder sb2 = new StringBuilder();
            ApiException apiException = (ApiException) th2;
            sb2.append(apiException.code);
            sb2.append(':');
            sb2.append(apiException.getMessage());
            function2.invoke(bool, sb2.toString());
        }
        SpotBusinessTracker.Companion companion = SpotBusinessTracker.f21010a;
        SpotBusinessTracker.SpotCategory spotCategory = SpotBusinessTracker.SpotCategory.PLACE_ORDER;
        Intrinsics.checkNotNull(th2);
        companion.trackSpotTradeException(spotCategory, th2);
        C45518a.m100508b("Error creating order: " + th2, "TradeSubmitFragment");
        AbstractC46753c abstractC46753cMo22375b2 = tradeCoreSubmitFragment.mo22375b2();
        SubmitOrderConfig f104580e = abstractC46753cMo22375b2 != null ? abstractC46753cMo22375b2.getF104580e() : null;
        OrderErrorCodeInterception orderErrorCodeInterception = OrderErrorCodeInterception.f20693a;
        ApiException apiException2 = z11 ? (ApiException) th2 : null;
        if (orderErrorCodeInterception.m22530b(apiException2 != null ? apiException2.code : null)) {
            if (tradeCoreSubmitFragment.m22385q5((String) map.get("side"))) {
                if (symbolInfoEntity != null) {
                    baseCurrency = symbolInfoEntity.getQuoteCurrency();
                }
            } else if (symbolInfoEntity != null) {
                baseCurrency = symbolInfoEntity.getBaseCurrency();
            }
            orderErrorCodeInterception.m22531c(baseCurrency, AccountType.UNIFIED, tradeCoreSubmitFragment, "TradeCoreSubmitFragment");
            return;
        }
        if (tradeCoreSubmitFragment.m22380g5(f104580e, th2)) {
            return;
        }
        if (f104580e != null) {
            FragmentManager childFragmentManager = tradeCoreSubmitFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            if (f104580e.mo22541e(th2, str, childFragmentManager)) {
                return;
            }
        }
        ApiException apiException3 = z11 ? (ApiException) th2 : null;
        if (Intrinsics.areEqual(apiException3 != null ? apiException3.code : null, "600000")) {
            return;
        }
        C19331c.m42836c(th2, null, 2, null);
    }

    /* JADX INFO: renamed from: h5 */
    public final void m22381h5(final SymbolInfoEntity symbolInfoEntity) throws Exception {
        this.f20638i0 = true;
        this.f20631b0 = symbolInfoEntity.getPriceIncrementPrecision();
        Observable<Boolean> observableObserveOn = C41016c.m89963a().observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.core.biz.submit.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeCoreSubmitFragment.m22329l5(this.f20800b, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.core.biz.submit.u
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeCoreSubmitFragment.m22331m5(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.core.biz.submit.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeCoreSubmitFragment.m22333n5((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.core.biz.submit.w
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeCoreSubmitFragment.m22335o5(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        m22301X5(this, false, null, 3, null);
        CompositeDisposable destroyDisposable = getDestroyDisposable();
        PublishSubject<Boolean> publishSubjectM21641g = CallAuctionSwitch.f20317a.m21641g();
        final Function1 function3 = new Function1() { // from class: com.kubi.core.biz.submit.x
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeCoreSubmitFragment.m22337p5(this.f20856b, symbolInfoEntity, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer2 = new Consumer() { // from class: com.kubi.core.biz.submit.y
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeCoreSubmitFragment.m22323i5(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.core.biz.submit.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeCoreSubmitFragment.m22325j5((Throwable) obj);
            }
        };
        destroyDisposable.add(publishSubjectM21641g.subscribe(consumer2, new Consumer() { // from class: com.kubi.core.biz.submit.a0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeCoreSubmitFragment.m22327k5(function4, obj);
            }
        }));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onHide() {
        this.f20639j0 = false;
        m22378f5().m85236i(false);
        m22372W4().m23307k();
        getState();
        m22304Y5(false);
        m21011A3().m22455B0(TradeSubmitBizContract$UiIntent.Hide.INSTANCE);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() throws Exception {
        m22388s5(true);
        TradeSubmitVM tradeSubmitVMM21011A3 = m21011A3();
        if (tradeSubmitVMM21011A3 != null) {
            tradeSubmitVMM21011A3.m22455B0(TradeSubmitBizContract$UiIntent.Refresh.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: s5 */
    public final void m22388s5(boolean z11) throws Exception {
        mo22379g(true);
        Disposable disposableMo37924X = C37136a.f82407a.m83062a().mo37924X(mo22359J(), z11);
        if (disposableMo37924X != null) {
            DisposableKt.addTo(disposableMo37924X, getDestroyDisposable());
        }
        m22372W4().m23308l();
    }

    /* JADX INFO: renamed from: y5 */
    public final void m22390y5(Function2<? super Boolean, ? super String, Unit> function2, Map<String, String> map) {
        BigDecimal changeRate;
        BaseFragment.hideLoadingDialog$default(this, false, 1, null);
        ToastCompat.m66441G(getString(R$string.deal_ok), new Object[0]);
        function2.invoke(Boolean.TRUE, null);
        ChangeRateData changeRateDataM22739s = m21013D3().m22739s();
        if (changeRateDataM22739s == null || (changeRate = changeRateDataM22739s.getChangeRate()) == null) {
            return;
        }
        ISpotCommonService.f49644a.get().mo59967k(map, Double.valueOf(changeRate.doubleValue()), getActivity());
    }

    /* JADX INFO: renamed from: C5 */
    public static final boolean m22251C5(TradeCoreSubmitFragment tradeCoreSubmitFragment, SpotMatchPushEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Fragment parentFragment = tradeCoreSubmitFragment.getParentFragment();
        return C27025c.m66566d(parentFragment != null ? Boolean.valueOf(parentFragment.isVisible()) : null);
    }

    /* JADX INFO: renamed from: D5 */
    public static final boolean m22253D5(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: E5 */
    public static final WsRecentDealEntity m22255E5(SpotMatchPushEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C44934a.m99365a(it);
    }

    /* JADX INFO: renamed from: F5 */
    public static final WsRecentDealEntity m22257F5(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (WsRecentDealEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: I5 */
    public static final Unit m22264I5(Throwable th2) {
        C44128b.m97263g("TradeSubmitFragment", th2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a8  */
    /* JADX INFO: renamed from: L5 */
    public static final Unit m22272L5(Function2 function2, TradeCoreSubmitFragment tradeCoreSubmitFragment, SymbolInfoEntity symbolInfoEntity, String str, Throwable error) throws JSONException {
        Intrinsics.checkNotNullParameter(error, "error");
        boolean z11 = error instanceof ApiException;
        if (z11) {
            ApiException apiException = (ApiException) error;
            if (!Intrinsics.areEqual(apiException.code, OtcAd.KYC_NOT_PASS)) {
                function2.invoke(Boolean.FALSE, apiException.code + ':' + error.getMessage());
            }
        }
        SpotBusinessTracker.f21010a.trackSpotTradeException(SpotBusinessTracker.SpotCategory.PASS_CHECK_FAILED, error);
        C45518a.m100508b("Security check failed: " + error, "TradeSubmitFragment");
        AbstractC46753c abstractC46753cMo22375b2 = tradeCoreSubmitFragment.mo22375b2();
        String baseCurrency = null;
        SubmitOrderConfig f104580e = abstractC46753cMo22375b2 != null ? abstractC46753cMo22375b2.getF104580e() : null;
        OrderErrorCodeInterception orderErrorCodeInterception = OrderErrorCodeInterception.f20693a;
        ApiException apiException2 = z11 ? (ApiException) error : null;
        if (orderErrorCodeInterception.m22530b(apiException2 != null ? apiException2.code : null)) {
            if (tradeCoreSubmitFragment.getF20636g0()) {
                if (symbolInfoEntity != null) {
                    baseCurrency = symbolInfoEntity.getQuoteCurrency();
                }
            } else if (symbolInfoEntity != null) {
                baseCurrency = symbolInfoEntity.getBaseCurrency();
            }
            orderErrorCodeInterception.m22531c(baseCurrency, AccountType.UNIFIED, tradeCoreSubmitFragment, "TradeCoreSubmitFragment");
        } else if (!tradeCoreSubmitFragment.m22380g5(f104580e, error)) {
            if (f104580e != null) {
                FragmentManager childFragmentManager = tradeCoreSubmitFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                if (!f104580e.mo22541e(error, str, childFragmentManager)) {
                    C19331c.m42836c(error, null, 2, null);
                }
            } else {
                C19331c.m42836c(error, null, 2, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N5 */
    public static final void m22277N5(TradeCoreSubmitFragment tradeCoreSubmitFragment, SymbolInfoEntity symbolInfoEntity, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        C37878b0.f85252a.m85544y(baseViewHolder.getAdapterPosition());
        List<Fragment> fragments = tradeCoreSubmitFragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof InterfaceC38174a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC38174a) it.next()).mo22589E(symbolInfoEntity, baseViewHolder.getAdapterPosition());
        }
        C43852m.m96591c(C12462a.m23402a(), "orderShift", String.valueOf(baseViewHolder.getAdapterPosition() + 1), null, 8, null);
    }

    /* JADX INFO: renamed from: O4 */
    public static final String m22279O4(SymbolBizUiState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getSymbol();
    }

    /* JADX INFO: renamed from: P4 */
    public static final SymbolInfoEntity m22282P4(SymbolBizUiState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getSymbolInfo();
    }

    /* JADX INFO: renamed from: Q4 */
    public static final Integer m22285Q4(SymbolBizUiState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SymbolInfoEntity symbolInfo = it.getSymbolInfo();
        if (symbolInfo != null) {
            return Integer.valueOf(symbolInfo.getPriceIncrementPrecision());
        }
        return null;
    }

    /* JADX INFO: renamed from: S4 */
    public static final InterfaceC38169a m22289S4(TradeSettingsBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getTradeDirection();
    }

    /* JADX INFO: renamed from: U5 */
    public static final void m22294U5(TradeCoreSubmitFragment tradeCoreSubmitFragment, Function2 function2, Map map, OrderResultEntity orderResultEntity) {
        C45518a.m100507a("Successfully created order", "TradeSubmitFragment");
        DurationTrackManager.Companion companion = DurationTrackManager.f21006c;
        companion.getInstance().m22859g(C27041f.m66668h(orderResultEntity.getOrderId()), companion.getInstance().getF21009b());
        tradeCoreSubmitFragment.m22390y5(function2, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V4 */
    public final KycViewModel m22296V4() {
        return (KycViewModel) this.f20637h0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X4 */
    public static final boolean m22300X4(TradeCoreSubmitFragment tradeCoreSubmitFragment, OrderBookCenterEntity it) {
        UiState uiState;
        SymbolInfoEntity symbolInfo;
        Intrinsics.checkNotNullParameter(it, "it");
        String symbol = it.getSymbol();
        TradeSubmitVM tradeSubmitVMM21011A3 = tradeCoreSubmitFragment.m21011A3();
        return Intrinsics.areEqual(symbol, (tradeSubmitVMM21011A3 == null || (uiState = (UiState) tradeSubmitVMM21011A3.getState()) == null || (symbolInfo = uiState.getSymbolInfo()) == null) ? null : symbolInfo.getCode());
    }

    /* JADX INFO: renamed from: X5 */
    public static /* synthetic */ void m22301X5(TradeCoreSubmitFragment tradeCoreSubmitFragment, boolean z11, InterfaceC38170b interfaceC38170b, int i11, Object obj) throws Exception {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            interfaceC38170b = null;
        }
        tradeCoreSubmitFragment.m22373W5(z11, interfaceC38170b);
    }

    /* JADX INFO: renamed from: Y4 */
    public static final boolean m22303Y4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a6 */
    public final void m22309a6(List<OrderItem> list) {
        this.f20633d0.clear();
        ArrayList<OrderBookIndex> arrayList = this.f20633d0;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (OrderItem orderItem : list) {
            String side = orderItem.getSide();
            String strM63278e = null;
            boolean zAreEqual = Intrinsics.areEqual(side != null ? C11623a.m21087f(side) : null, TradeSide.BUY.INSTANCE);
            Double dValueOf = Double.valueOf(C27039d.m66647g(orderItem.getPrice()));
            BigDecimal price = orderItem.getPrice();
            if (price != null) {
                OrderBookDataHelper orderBookDataHelper = OrderBookDataHelper.f51601a;
                int i11 = this.f20631b0;
                String side2 = orderItem.getSide();
                strM63278e = orderBookDataHelper.m63278e(price, i11, !Intrinsics.areEqual(side2 != null ? C11623a.m21087f(side2) : null, TradeSide.SELL.INSTANCE));
            }
            arrayList2.add(new OrderBookIndex(zAreEqual, dValueOf, strM63278e));
        }
        arrayList.addAll(arrayList2);
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : fragments) {
            Fragment fragment = (Fragment) obj;
            if (fragment.isAdded() && fragment.isVisible()) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (obj2 instanceof InterfaceC38174a) {
                arrayList4.add(obj2);
            }
        }
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            ((InterfaceC38174a) it.next()).mo22604c0();
        }
    }

    /* JADX INFO: renamed from: b5 */
    public static final Unit m22311b5(Throwable th2) {
        C44128b.m97263g("TradeSubmitFragment", th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c6 */
    public static final C37787r m22315c6(TradeCoreSubmitFragment tradeCoreSubmitFragment) {
        return new C37787r(tradeCoreSubmitFragment);
    }

    /* JADX INFO: renamed from: d5 */
    private final UtaMarginTradeCoreViewModel m22317d5() {
        return (UtaMarginTradeCoreViewModel) this.f20628Y.getValue();
    }

    /* JADX INFO: renamed from: j5 */
    public static final Unit m22325j5(Throwable th2) {
        C44128b.m97259c("subscribe", th2.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n5 */
    public static final Unit m22333n5(Throwable th2) {
        C44128b.m97263g("TradeSubmitFragment", th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r5 */
    public static final KycViewModel m22340r5(TradeCoreSubmitFragment tradeCoreSubmitFragment) {
        return (KycViewModel) new ViewModelProvider(tradeCoreSubmitFragment).get(KycViewModel.class);
    }

    /* JADX INFO: renamed from: t5 */
    public static /* synthetic */ void m22343t5(TradeCoreSubmitFragment tradeCoreSubmitFragment, boolean z11, int i11, Object obj) throws Exception {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        tradeCoreSubmitFragment.m22388s5(z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u5 */
    public static final NewOrderBookHelper m22345u5(final TradeCoreSubmitFragment tradeCoreSubmitFragment) {
        String symbol;
        UiState uiState;
        C37787r c37787rM22378f5 = tradeCoreSubmitFragment.m22378f5();
        TradeSubmitVM tradeSubmitVMM21011A3 = tradeCoreSubmitFragment.m21011A3();
        if (tradeSubmitVMM21011A3 == null || (uiState = (UiState) tradeSubmitVMM21011A3.getState()) == null || (symbol = uiState.getSymbol()) == null) {
            symbol = "";
        }
        return new NewOrderBookHelper(c37787rM22378f5, tradeCoreSubmitFragment, symbol, tradeCoreSubmitFragment.f20631b0, new Consumer() { // from class: com.kubi.core.biz.submit.r
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeCoreSubmitFragment.m22347v5(this.f20797b, (OrderBookEntity) obj);
            }
        }, tradeCoreSubmitFragment.m21013D3().m22743w());
    }

    /* JADX INFO: renamed from: w5 */
    public static final void m22349w5(BaseViewHolder viewHolder, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
        View view = viewHolder.getView(R$id.cb_next_tips);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66708w((CompoundButton) view, new Function2() { // from class: com.kubi.core.biz.submit.s0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TradeCoreSubmitFragment.m22351x5((CompoundButton) obj, ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: x5 */
    public static final Unit m22351x5(CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        C46392a.m102328k(C38519a.f86479a.m87137l(), z11);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.core.spot.business.holder.ITradeHolderDependDelegate
    /* JADX INFO: renamed from: C0, reason: from getter */
    public boolean getF20634e0() {
        return this.f20634e0;
    }

    @Override // p310he.InterfaceC38175b
    /* JADX INFO: renamed from: D */
    public void mo22355D(@NotNull final SymbolInfoEntity symbolInfo) {
        Intrinsics.checkNotNullParameter(symbolInfo, "symbolInfo");
        ArrayList arrayList = new ArrayList();
        String[] stringArray = getResources().getStringArray(R$array.trade_core_all_or_single);
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
        BaseDialogFragment baseDialogFragmentM54192r3 = BottomSheetDialogHelper.m58944B(BottomSheetDialogHelper.f48599a, arrayList, new BiConsumer() { // from class: com.kubi.core.biz.submit.f0
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                TradeCoreSubmitFragment.m22277N5(this.f20703b, symbolInfo, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, false, null, null, false, 60, null).m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.core.biz.submit.g0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                TradeCoreSubmitFragment.m22280O5(this.f20706b, dialogInterface);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentM54192r3.show(childFragmentManager, "showOrderBookAmountDialog");
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof InterfaceC38174a) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((InterfaceC38174a) it.next()).mo22602b(0);
        }
    }

    @Override // p310he.InterfaceC38175b, com.kubi.core.spot.business.holder.ITradeHolderDependDelegate
    @NotNull
    /* JADX INFO: renamed from: G, reason: from getter */
    public OrderBookCenterEntity getF20635f0() {
        return this.f20635f0;
    }

    @Override // p310he.InterfaceC38175b
    /* JADX INFO: renamed from: L, reason: from getter */
    public boolean getF20636g0() {
        return this.f20636g0;
    }

    /* JADX INFO: renamed from: R5 */
    public final void m22368R5(final Map<String, String> map, ITradeTypeRequestOrder iTradeTypeRequestOrder, final Function2<? super Boolean, ? super String, Unit> function2, final SymbolInfoEntity symbolInfoEntity, final String str) {
        Observable<OrderResultEntity> observableM23315b = this.f20629Z.m23315b(map, iTradeTypeRequestOrder);
        final Function1 function1 = new Function1() { // from class: com.kubi.core.biz.submit.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeCoreSubmitFragment.m22290S5(this.f20780b, (Disposable) obj);
            }
        };
        Disposable disposableSubscribe = observableM23315b.doOnSubscribe(new Consumer() { // from class: com.kubi.core.biz.submit.o
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeCoreSubmitFragment.m22292T5(function1, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.kubi.core.biz.submit.p
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeCoreSubmitFragment.m22294U5(this.f20787b, function2, map, (OrderResultEntity) obj);
            }
        }, new Consumer() { // from class: com.kubi.core.biz.submit.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws JSONException {
                TradeCoreSubmitFragment.m22297V5(this.f20792b, function2, map, symbolInfoEntity, str, (Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    @Override // p310he.InterfaceC38175b
    /* JADX INFO: renamed from: T */
    public void mo22369T(@NotNull BigDecimal value) {
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
            if (obj3 instanceof InterfaceC38174a) {
                arrayList3.add(obj3);
            }
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            ((InterfaceC38174a) it.next()).mo22601a(value);
        }
    }

    @Override // com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment
    @NotNull
    /* JADX INFO: renamed from: T4, reason: merged with bridge method [inline-methods] */
    public TradeSubmitVM mo21017v3(@NotNull AbstractC46753c manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        return new TradeSubmitVM(manager);
    }

    /* JADX INFO: renamed from: W4 */
    public final NewOrderBookHelper m22372W4() {
        return (NewOrderBookHelper) this.f20641l0.getValue();
    }

    /* JADX INFO: renamed from: W5 */
    public final void m22373W5(boolean z11, InterfaceC38170b interfaceC38170b) throws Exception {
        boolean zM85527h = interfaceC38170b == null ? C37878b0.f85252a.m85527h(ISpotCommonService.f49644a.get().mo59970n()) : Intrinsics.areEqual(interfaceC38170b, InterfaceC38170b.b.f85867a);
        C44128b.m97258b("pittttttttt--toggleCurrentFragment: " + interfaceC38170b + ", result: " + zM85527h);
        BaseFragment baseFragmentM22377e5 = zM85527h ? m22377e5() : m22371U4();
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        for (Fragment fragment : fragments) {
            if (Intrinsics.areEqual(fragment, baseFragmentM22377e5)) {
                fragmentTransactionBeginTransaction.show(fragment);
            } else {
                fragmentTransactionBeginTransaction.hide(fragment);
            }
        }
        fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        if (z11) {
            mo22379g(true);
        }
    }

    @Override // p310he.InterfaceC38175b
    /* JADX INFO: renamed from: e */
    public void mo22376e(@NotNull String label, @NotNull TradeType tradeType) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        if (isDetached() || isRemoving() || getChildFragmentManager().isDestroyed()) {
            return;
        }
        TradeSubmitVM tradeSubmitVMM21011A3 = m21011A3();
        if (tradeSubmitVMM21011A3 != null) {
            tradeSubmitVMM21011A3.m22455B0(new TradeSubmitBizContract$UiIntent.ChangeTradeType(tradeType));
        }
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof InterfaceC38174a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC38174a) it.next()).mo22606f(label, tradeType);
        }
        if (IUserService.a.get().c() && ((tradeType == TradeType.MARKET || tradeType == TradeType.MARKET_STOP) && !C46392a.m102322d(C38519a.f86479a.m87137l(), false))) {
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.notice_prompt).m54153J4(R$string.toggle_market_tips).m54149F4(getLayoutInflater().inflate(R$layout.view_never_tips_next_time, (ViewGroup) null), new DialogFragmentHelper.InterfaceC22882b() { // from class: com.kubi.core.biz.submit.h0
                @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
                /* JADX INFO: renamed from: b3 */
                public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                    TradeCoreSubmitFragment.m22349w5(baseViewHolder, dialogFragmentHelper);
                }
            }).m54162S4(R$string.i_know, null).m54172c5(getChildFragmentManager());
        }
        m22374Z5(tradeType);
    }

    /* JADX INFO: renamed from: f5 */
    public final C37787r m22378f5() {
        return (C37787r) this.f20640k0.getValue();
    }

    /* JADX INFO: renamed from: g5 */
    public final boolean m22380g5(SubmitOrderConfig submitOrderConfig, Throwable th2) {
        if (!(th2 instanceof ApiException) || submitOrderConfig == null) {
            return false;
        }
        String code = ((ApiException) th2).code;
        Intrinsics.checkNotNullExpressionValue(code, "code");
        if (!submitOrderConfig.mo22542f(code)) {
            return false;
        }
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new TradeCoreSubmitFragment$handleKYC0Error$1(this, th2, null));
        return true;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.activity_fragment_container;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<TradeSubmitVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(TradeSubmitVM.class);
    }

    @Override // com.kubi.core.spot.business.holder.ITradeHolderDependDelegate
    /* JADX INFO: renamed from: i0 */
    public void mo22382i0(boolean z11) {
        this.f20636g0 = z11;
        TradeSubmitVM tradeSubmitVMM21011A3 = m21011A3();
        if (tradeSubmitVMM21011A3 != null) {
            tradeSubmitVMM21011A3.m22455B0(new TradeSubmitBizContract$UiIntent.ChangeBuyOrSellDirection(z11));
        }
        m22317d5().m22507s(z11);
    }

    @Override // com.kubi.core.spot.business.holder.ITradeHolderDependDelegate
    @Nullable
    /* JADX INFO: renamed from: j0 */
    public View mo22383j0() {
        return findViewById(R$id.fl_container);
    }

    @Override // p310he.InterfaceC38175b
    /* JADX INFO: renamed from: n */
    public void mo22384n(@NotNull final SymbolInfoEntity symbolInfoData) {
        Intrinsics.checkNotNullParameter(symbolInfoData, "symbolInfoData");
        C43852m.m96591c(C12462a.m23402a(), "decimalShift", "1", null, 8, null);
        BottomSheetDialogHelper bottomSheetDialogHelper = BottomSheetDialogHelper.f48599a;
        ArrayList<String> arrayListM1040b = C0296a.m1040b(symbolInfoData.getPriceIncrementPrecision());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM1040b, 10));
        int i11 = 0;
        for (Object obj : arrayListM1040b) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new SelectEntity(null, (String) obj, null, null, null, null, null, null, null, false, this.f20631b0 == symbolInfoData.getPriceIncrementPrecision() - i11, null, 3069, null));
            i11 = i12;
        }
        BaseDialogFragment baseDialogFragmentM54192r3 = BottomSheetDialogHelper.m58944B(bottomSheetDialogHelper, arrayList, new BiConsumer() { // from class: com.kubi.core.biz.submit.b0
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj2, Object obj3) {
                TradeCoreSubmitFragment.m22283P5(this.f20686b, symbolInfoData, (BaseViewHolder) obj2, (BottomSheetDialogHelper.InterfaceC24339a) obj3);
            }
        }, false, null, null, false, 60, null).m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.core.biz.submit.c0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                TradeCoreSubmitFragment.m22286Q5(this.f20691b, dialogInterface);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentM54192r3.show(childFragmentManager, "showOrderPrecision");
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : fragments) {
            if (obj2 instanceof InterfaceC38174a) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((InterfaceC38174a) it.next()).mo22602b(1);
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m22367R4();
    }

    /* JADX INFO: renamed from: q5 */
    public final boolean m22385q5(String str) {
        if (Intrinsics.areEqual(str, "buy")) {
            return true;
        }
        if (Intrinsics.areEqual(str, "sell")) {
            return false;
        }
        return getF20636g0();
    }

    @Override // com.kubi.core.spot.business.holder.ITradeHolderDependDelegate
    /* JADX INFO: renamed from: r1 */
    public void mo22386r1(@NotNull Map<String, String> marketOderParams, @NotNull ITradeTypeRequestOrder tradeTypeRequestOrder, @NotNull final Function2<? super Boolean, ? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(marketOderParams, "marketOderParams");
        Intrinsics.checkNotNullParameter(tradeTypeRequestOrder, "tradeTypeRequestOrder");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final SymbolInfoEntity symbolInfo = m21013D3().m22740t().getSymbolInfo();
        final String baseCurrency = symbolInfo != null ? symbolInfo.getBaseCurrency() : null;
        TradeSecurityScene tradeSecurityScene = TradeSecurityScene.TRADE_CORE_SUBMIT;
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        String strM66919i = C27099x.m66919i(marketOderParams, false, 2, null);
        if (strM66919i == null) {
            strM66919i = "";
        }
        TradePasswordExtensionsKt.m56335d(this, tradeSecurityScene, lifecycleScope, (504 & 4) != 0 ? "" : strM66919i, (504 & 8) != 0 ? null : null, (504 & 16) != 0 ? false : false, (504 & 32) != 0, (504 & 64) != 0 ? false : false, (504 & 128) != 0 ? new TradePasswordExtensionsKt$executeTradePassword$1(null) : new TradeCoreSubmitFragment$requestOrder$1(null), (504 & 256) != 0 ? new Function0() { // from class: com.kubi.safe.api.service.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradePasswordExtensionsKt.m56337f();
            }
        } : null, new TradeCoreSubmitFragment$requestOrder$2(marketOderParams, this, tradeTypeRequestOrder, callback, symbolInfo, baseCurrency, null), (504 & 1024) != 0 ? new Function0() { // from class: com.kubi.safe.api.service.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradePasswordExtensionsKt.m56338g();
            }
        } : null, (504 & 2048) != 0 ? new Function1() { // from class: com.kubi.safe.api.service.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradePasswordExtensionsKt.m56339h((Throwable) obj);
            }
        } : new Function1() { // from class: com.kubi.core.biz.submit.t0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeCoreSubmitFragment.m22272L5(callback, this, symbolInfo, baseCurrency, (Throwable) obj);
            }
        });
    }

    @Override // p310he.InterfaceC38175b
    /* JADX INFO: renamed from: s0, reason: from getter */
    public int getF20631b0() {
        return this.f20631b0;
    }

    @Override // com.kubi.core.spot.business.holder.ITradeHolderDependDelegate
    /* JADX INFO: renamed from: y0 */
    public void mo22389y0(boolean z11) {
        this.f20634e0 = z11;
    }

    @Override // com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment
    @NotNull
    /* JADX INFO: renamed from: y3, reason: from getter */
    public InterfaceC4578a getF20711Z() {
        return this.f20630a0;
    }

    @Override // p310he.InterfaceC38175b
    @NotNull
    /* JADX INFO: renamed from: z0 */
    public ArrayList<OrderBookIndex> mo22391z0() {
        return this.f20633d0;
    }

    public TradeCoreSubmitFragment() {
        final Function0 function0 = new Function0() { // from class: com.kubi.core.biz.submit.z0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeCoreSubmitFragment.m22312b6(this.f20862b);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.core.biz.submit.TradeCoreSubmitFragment$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }

            {
                super(0);
            }
        });
        final Function0 function1 = null;
        this.f20628Y = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(UtaMarginTradeCoreViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.core.biz.submit.TradeCoreSubmitFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.core.biz.submit.TradeCoreSubmitFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function1;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.core.biz.submit.TradeCoreSubmitFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.f20629Z = new TradeModel();
        this.f20630a0 = InterfaceC4578a.k.f4056a;
        this.f20631b0 = 8;
        this.f20632c0 = CollectionsKt.emptyList();
        this.f20633d0 = new ArrayList<>();
        this.f20635f0 = new OrderBookCenterEntity();
        this.f20636g0 = true;
        this.f20637h0 = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.submit.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeCoreSubmitFragment.m22340r5(this.f20747b);
            }
        });
        this.f20640k0 = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.submit.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeCoreSubmitFragment.m22315c6(this.f20774b);
            }
        });
        this.f20641l0 = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.submit.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeCoreSubmitFragment.m22345u5(this.f20777b);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A5 */
    public static final void m22247A5(final TradeCoreSubmitFragment tradeCoreSubmitFragment) {
        UiState uiState;
        final SymbolInfoEntity symbolInfo;
        TradeSubmitVM tradeSubmitVMM21011A3 = tradeCoreSubmitFragment.m21011A3();
        if (tradeSubmitVMM21011A3 != null && (uiState = (UiState) tradeSubmitVMM21011A3.getState()) != null && (symbolInfo = uiState.getSymbolInfo()) != null) {
            tradeCoreSubmitFragment.getVisibleDisposable().clear();
            Disposable disposableM23309m = tradeCoreSubmitFragment.m22372W4().m23309m();
            if (disposableM23309m != null) {
                DisposableKt.addTo(disposableM23309m, tradeCoreSubmitFragment.getVisibleDisposable());
            }
            CompositeDisposable visibleDisposable = tradeCoreSubmitFragment.getVisibleDisposable();
            SpotMarketSocketAdapter spotMarketSocketAdapter = SpotMarketSocketAdapter.f28144a;
            String symbol = symbolInfo.getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
            Observable observableM32619F = SpotMarketSocketAdapter.m32619F(spotMarketSocketAdapter, symbol, false, new Function0() { // from class: com.kubi.core.biz.submit.i0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeCoreSubmitFragment.m22249B5(this.f20742b, symbolInfo);
                }
            }, 2, null);
            final Function1 function1 = new Function1() { // from class: com.kubi.core.biz.submit.j0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(TradeCoreSubmitFragment.m22251C5(this.f20748b, (SpotMatchPushEntity) obj));
                }
            };
            Observable observableThrottleLatest = observableM32619F.filter(new Predicate() { // from class: com.kubi.core.biz.submit.k0
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return TradeCoreSubmitFragment.m22253D5(function1, obj);
                }
            }).throttleLatest(ISpotCommonService.f49644a.get().mo59969m(), TimeUnit.MILLISECONDS);
            final Function1 function2 = new Function1() { // from class: com.kubi.core.biz.submit.l0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradeCoreSubmitFragment.m22255E5((SpotMatchPushEntity) obj);
                }
            };
            Observable observableObserveOn = observableThrottleLatest.map(new Function() { // from class: com.kubi.core.biz.submit.m0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return TradeCoreSubmitFragment.m22257F5(function2, obj);
                }
            }).observeOn(AndroidSchedulers.mainThread());
            final Function1 function3 = new Function1() { // from class: com.kubi.core.biz.submit.n0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradeCoreSubmitFragment.m22259G5(this.f20781b, symbolInfo, (WsRecentDealEntity) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.core.biz.submit.o0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    TradeCoreSubmitFragment.m22261H5(function3, obj);
                }
            };
            final Function1 function4 = new Function1() { // from class: com.kubi.core.biz.submit.q0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradeCoreSubmitFragment.m22264I5((Throwable) obj);
                }
            };
            visibleDisposable.add(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.core.biz.submit.r0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    TradeCoreSubmitFragment.m22267J5(function4, obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: B5 */
    public static final Observable m22249B5(TradeCoreSubmitFragment tradeCoreSubmitFragment, SymbolInfoEntity symbolInfoEntity) {
        C37787r c37787rM22378f5 = tradeCoreSubmitFragment.m22378f5();
        String symbol = symbolInfoEntity.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        return c37787rM22378f5.m85233f("/market/match:%s", symbol);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F4 */
    public static final /* synthetic */ UiState m22256F4(TradeCoreSubmitFragment tradeCoreSubmitFragment) {
        return (UiState) tradeCoreSubmitFragment.getState();
    }

    /* JADX INFO: renamed from: G5 */
    public static final Unit m22259G5(TradeCoreSubmitFragment tradeCoreSubmitFragment, SymbolInfoEntity symbolInfoEntity, WsRecentDealEntity wsRecentDealEntity) {
        List<Fragment> fragments = tradeCoreSubmitFragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof InterfaceC38174a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC38174a) it.next()).mo22618s(symbolInfoEntity, wsRecentDealEntity.convertToOrderCenter(tradeCoreSubmitFragment.f20635f0));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H5 */
    public static final void m22261H5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: J5 */
    public static final void m22267J5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: O5 */
    public static final void m22280O5(TradeCoreSubmitFragment tradeCoreSubmitFragment, DialogInterface dialogInterface) {
        List<Fragment> fragments = tradeCoreSubmitFragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof InterfaceC38174a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC38174a) it.next()).mo22603c(0);
        }
    }

    /* JADX INFO: renamed from: P5 */
    public static final void m22283P5(TradeCoreSubmitFragment tradeCoreSubmitFragment, SymbolInfoEntity symbolInfoEntity, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        String lowerCase;
        tradeCoreSubmitFragment.f20631b0 = symbolInfoEntity.getPriceIncrementPrecision() - baseViewHolder.getAdapterPosition();
        List<Fragment> fragments = tradeCoreSubmitFragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof InterfaceC38174a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC38174a) it.next()).mo22605d(interfaceC24339a.getLabel().toString(), tradeCoreSubmitFragment.f20631b0);
        }
        tradeCoreSubmitFragment.m22372W4().m23303e(tradeCoreSubmitFragment.f20631b0);
        String strM23402a = C12462a.m23402a();
        String strValueOf = String.valueOf(baseViewHolder.getAdapterPosition() + 2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tradeCoreSubmitFragment.f20631b0);
        sb2.append('_');
        String baseCurrency = symbolInfoEntity.getBaseCurrency();
        String lowerCase2 = null;
        if (baseCurrency != null) {
            lowerCase = baseCurrency.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        sb2.append(lowerCase);
        sb2.append('_');
        String quoteCurrency = symbolInfoEntity.getQuoteCurrency();
        if (quoteCurrency != null) {
            lowerCase2 = quoteCurrency.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        }
        sb2.append(lowerCase2);
        C43852m.m96590b(strM23402a, "decimalShift", strValueOf, TuplesKt.m90091to("decimalValue", sb2.toString()));
    }

    /* JADX INFO: renamed from: Q5 */
    public static final void m22286Q5(TradeCoreSubmitFragment tradeCoreSubmitFragment, DialogInterface dialogInterface) {
        List<Fragment> fragments = tradeCoreSubmitFragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof InterfaceC38174a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC38174a) it.next()).mo22603c(1);
        }
    }

    /* JADX INFO: renamed from: S5 */
    public static final Unit m22290S5(TradeCoreSubmitFragment tradeCoreSubmitFragment, Disposable disposable) {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(tradeCoreSubmitFragment), C41782z0.m91393c(), null, new TradeCoreSubmitFragment$submitOrderAfterSecurityCheck$1$1(tradeCoreSubmitFragment, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T5 */
    public static final void m22292T5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Y5 */
    private final void m22304Y5(boolean z11) {
        m22378f5().m85236i(z11);
        m22372W4().m23313q(z11);
    }

    /* JADX INFO: renamed from: Z4 */
    public static final Unit m22306Z4(TradeCoreSubmitFragment tradeCoreSubmitFragment, SymbolInfoEntity symbolInfoEntity, OrderBookCenterEntity orderBookCenterEntity) {
        List<Fragment> fragments = tradeCoreSubmitFragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList<InterfaceC38174a> arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof InterfaceC38174a) {
                arrayList.add(obj);
            }
        }
        for (InterfaceC38174a interfaceC38174a : arrayList) {
            OrderBookCenterEntity orderBookCenterEntityCovert = tradeCoreSubmitFragment.f20635f0.covert(orderBookCenterEntity);
            Intrinsics.checkNotNullExpressionValue(orderBookCenterEntityCovert, "covert(...)");
            interfaceC38174a.mo22618s(symbolInfoEntity, orderBookCenterEntityCovert);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a5 */
    public static final void m22308a5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b6 */
    public static final ViewModelStoreOwner m22312b6(TradeCoreSubmitFragment tradeCoreSubmitFragment) {
        Fragment fragmentRequireParentFragment = tradeCoreSubmitFragment.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }

    /* JADX INFO: renamed from: c5 */
    public static final void m22314c5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i5 */
    public static final void m22323i5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k5 */
    public static final void m22327k5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l5 */
    public static final Unit m22329l5(TradeCoreSubmitFragment tradeCoreSubmitFragment, Boolean bool) {
        List<Fragment> fragments = tradeCoreSubmitFragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof InterfaceC38174a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC38174a) it.next()).mo22600U();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m5 */
    public static final void m22331m5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o5 */
    public static final void m22335o5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p5 */
    public static final Unit m22337p5(TradeCoreSubmitFragment tradeCoreSubmitFragment, SymbolInfoEntity symbolInfoEntity, Boolean bool) {
        String code = symbolInfoEntity.getCode();
        Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
        tradeCoreSubmitFragment.m22364M5(code, tradeCoreSubmitFragment.f20631b0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v5 */
    public static final void m22347v5(TradeCoreSubmitFragment tradeCoreSubmitFragment, OrderBookEntity orderBookEntity) {
        Boolean boolValueOf;
        Double dFirstOrNull;
        Double dFirstOrNull2;
        double[] dArr;
        double[] dArr2;
        FragmentActivity activity = tradeCoreSubmitFragment.getActivity();
        if (activity != null) {
            boolValueOf = Boolean.valueOf(activity.isFinishing());
        } else {
            boolValueOf = null;
        }
        if (!C27025c.m66566d(boolValueOf) && !tradeCoreSubmitFragment.isDetached()) {
            List<Fragment> fragments = tradeCoreSubmitFragment.getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ArrayList<InterfaceC38174a> arrayList = new ArrayList();
            for (Object obj : fragments) {
                if (obj instanceof InterfaceC38174a) {
                    arrayList.add(obj);
                }
            }
            for (InterfaceC38174a interfaceC38174a : arrayList) {
                Intrinsics.checkNotNull(orderBookEntity);
                interfaceC38174a.mo22591F0(orderBookEntity);
            }
            TradeSubmitVM tradeSubmitVMM21011A3 = tradeCoreSubmitFragment.m21011A3();
            OrderBookCenterEntity orderBookCenterEntity = tradeCoreSubmitFragment.f20635f0;
            List<double[]> bids = orderBookEntity.getBids();
            if (bids != null && (dArr2 = (double[]) CollectionsKt.firstOrNull((List) bids)) != null) {
                dFirstOrNull = ArraysKt.firstOrNull(dArr2);
            } else {
                dFirstOrNull = null;
            }
            orderBookCenterEntity.setBestBid(C27039d.m66646f(dFirstOrNull));
            List<double[]> asks = orderBookEntity.getAsks();
            if (asks != null && (dArr = (double[]) CollectionsKt.lastOrNull((List) asks)) != null) {
                dFirstOrNull2 = ArraysKt.firstOrNull(dArr);
            } else {
                dFirstOrNull2 = null;
            }
            orderBookCenterEntity.setBestAsk(C27039d.m66646f(dFirstOrNull2));
            tradeSubmitVMM21011A3.m22455B0(new TradeSubmitBizContract$UiIntent.UpdateBbo(orderBookCenterEntity));
            if (!tradeCoreSubmitFragment.f20639j0) {
                tradeCoreSubmitFragment.f20639j0 = true;
                TracePageHelper.m42467b("load_spot");
                C43841b.m96557d("B5UnifyTrading", "data_load_finish", null, 4, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.core.spot.business.holder.ITradeHolderDependDelegate
    @NotNull
    /* JADX INFO: renamed from: I */
    public BalanceData mo22358I() {
        BalanceData base;
        TradeSymbolBalance tradeBalance = ((UiState) getState()).getTradeBalance();
        if (tradeBalance != null && (base = tradeBalance.getBase()) != null) {
            return base;
        }
        return new BalanceData(null, null, null, 7, null);
    }

    @Override // com.kubi.core.spot.business.holder.ITradeHolderDependDelegate
    @NotNull
    /* JADX INFO: renamed from: J */
    public TradeItemBean mo22359J() {
        TradeItemBean tradeItemBean = m21013D3().m22740t().getTradeItemBean();
        if (tradeItemBean == null) {
            return new TradeItemBean();
        }
        return tradeItemBean;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.core.spot.business.holder.ITradeHolderDependDelegate
    /* JADX INFO: renamed from: K */
    public void mo22360K() {
        TradeSubmitVM tradeSubmitVMM21011A3 = m21011A3();
        if (tradeSubmitVMM21011A3 != null) {
            tradeSubmitVMM21011A3.m22455B0(new TradeSubmitBizContract$UiIntent.FetchSymbolBalance(((UiState) getState()).getSymbolInfo(), getVisibleDisposable()));
        }
    }

    /* JADX INFO: renamed from: K5 */
    public final void m22361K5(SymbolInfoEntity symbolInfoEntity) {
        this.f20631b0 = symbolInfoEntity.getPriceIncrementPrecision();
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList<InterfaceC38174a> arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof InterfaceC38174a) {
                arrayList.add(obj);
            }
        }
        for (InterfaceC38174a interfaceC38174a : arrayList) {
            interfaceC38174a.mo22599S();
            InterfaceC38174a.m86139S2(interfaceC38174a, symbolInfoEntity, false, 2, null);
        }
        this.f20635f0.clear(symbolInfoEntity.getSymbol());
        this.f20633d0.clear();
        NewOrderBookHelper newOrderBookHelperM22372W4 = m22372W4();
        String code = symbolInfoEntity.getCode();
        Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
        newOrderBookHelperM22372W4.m23310n(code, this.f20631b0);
    }

    @Override // com.kubi.core.spot.business.holder.ITradeHolderDependDelegate
    /* JADX INFO: renamed from: M */
    public boolean mo22363M() {
        return m21013D3().m22740t().getIsMaintenance();
    }

    /* JADX INFO: renamed from: M5 */
    public final void m22364M5(String str, int i11) {
        TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment;
        m22372W4().m23311o(str, i11);
        if (C37878b0.f85252a.m85527h(ISpotCommonService.f49644a.get().mo59970n())) {
            BaseFragment baseFragmentM22377e5 = m22377e5();
            if (baseFragmentM22377e5 instanceof TradeBaseVerticalSubmitFragment) {
                tradeBaseVerticalSubmitFragment = (TradeBaseVerticalSubmitFragment) baseFragmentM22377e5;
            } else {
                tradeBaseVerticalSubmitFragment = null;
            }
            if (tradeBaseVerticalSubmitFragment != null) {
                tradeBaseVerticalSubmitFragment.m22703j4();
            }
        }
    }

    @Override // com.kubi.core.spot.business.holder.ITradeHolderDependDelegate
    @NotNull
    /* JADX INFO: renamed from: N */
    public SymbolInfoEntity mo22365N() {
        SymbolInfoEntity symbolInfo = m21013D3().m22740t().getSymbolInfo();
        if (symbolInfo == null) {
            return new SymbolInfoEntity();
        }
        return symbolInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.core.spot.business.holder.ITradeHolderDependDelegate
    @NotNull
    /* JADX INFO: renamed from: O */
    public BalanceData mo22366O() {
        BalanceData quote;
        TradeSymbolBalance tradeBalance = ((UiState) getState()).getTradeBalance();
        if (tradeBalance != null && (quote = tradeBalance.getQuote()) != null) {
            return quote;
        }
        return new BalanceData(null, null, null, 7, null);
    }

    /* JADX INFO: renamed from: R4 */
    public final void m22367R4() {
        InterfaceC37868a f104577b;
        InterfaceC41678w<TradeSettingsBean> interfaceC41678wMo85483a;
        InterfaceC41634e interfaceC41634eM90941x;
        AbstractC46753c abstractC46753cMo22375b2 = mo22375b2();
        if (abstractC46753cMo22375b2 != null && (f104577b = abstractC46753cMo22375b2.getF104577b()) != null && (interfaceC41678wMo85483a = f104577b.mo85483a()) != null && (interfaceC41634eM90941x = C41636g.m90941x(interfaceC41678wMo85483a, new Function1() { // from class: com.kubi.core.biz.submit.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeCoreSubmitFragment.m22289S4((TradeSettingsBean) obj);
            }
        })) != null) {
            m21016u3(interfaceC41634eM90941x, new TradeCoreSubmitFragment$collectBuyDirectionData$2(this, null));
        }
    }

    /* JADX INFO: renamed from: U4 */
    public final BaseFragment m22371U4() {
        BaseFragment baseFragment;
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("horizontalSubmitFragment");
        if (fragmentFindFragmentByTag instanceof BaseFragment) {
            baseFragment = (BaseFragment) fragmentFindFragmentByTag;
        } else {
            baseFragment = null;
        }
        if (baseFragment == null) {
            TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment = new TradeBaseHorizontalSubmitFragment();
            getChildFragmentManager().beginTransaction().add(R$id.fl_container, tradeBaseHorizontalSubmitFragment, "horizontalSubmitFragment").hide(tradeBaseHorizontalSubmitFragment).commitNowAllowingStateLoss();
            return tradeBaseHorizontalSubmitFragment;
        }
        return baseFragment;
    }

    /* JADX INFO: renamed from: Z5 */
    public final void m22374Z5(TradeType tradeType) {
        String str;
        String strM23402a = C12462a.m23402a();
        if (getF20636g0()) {
            str = "buy";
        } else {
            str = "sell";
        }
        C43852m.m96590b(strM23402a, "orderType", "1", TuplesKt.m90091to("trade_type", str), TuplesKt.m90091to("orderType", tradeType.getValue()));
    }

    @Override // com.kubi.core.spot.business.holder.ITradeHolderDependDelegate
    @Nullable
    /* JADX INFO: renamed from: b2 */
    public AbstractC46753c mo22375b2() {
        TradeSubmitVM tradeSubmitVMM21011A3 = m21011A3();
        if (tradeSubmitVMM21011A3 != null) {
            return tradeSubmitVMM21011A3.getF20069V();
        }
        return null;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        final InterfaceC41634e interfaceC41634eM90941x = C41636g.m90941x(m21013D3().m22742v(), new Function1() { // from class: com.kubi.core.biz.submit.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeCoreSubmitFragment.m22279O4((SymbolBizUiState) obj);
            }
        });
        m21016u3(C41636g.m90881E(new InterfaceC41634e<SymbolInfoEntity>() { // from class: com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 TradeCoreSubmitFragment.kt\ncom/kubi/core/biz/submit/TradeCoreSubmitFragment\n*L\n1#1,49:1\n50#2:50\n677#3:51\n*E\n"})
            public static final class C120372<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f20643b;

                /* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$$inlined$map$1$2", m90122f = "TradeCoreSubmitFragment.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C120372.this.emit(null, this);
                    }
                }

                public C120372(InterfaceC41635f interfaceC41635f) {
                    this.f20643b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f20643b;
                        SymbolInfoEntity symbolInfo = ((SymbolBizUiState) obj).getSymbolInfo();
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(symbolInfo, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super SymbolInfoEntity> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM90941x.collect(new C120372(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), new C120583(null));
        final InterfaceC41634e interfaceC41634eM90941x2 = C41636g.m90941x(m21013D3().m22742v(), new Function1() { // from class: com.kubi.core.biz.submit.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeCoreSubmitFragment.m22282P4((SymbolBizUiState) obj);
            }
        });
        m21016u3(C41636g.m90881E(new InterfaceC41634e<SymbolInfoEntity>() { // from class: com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$$inlined$map$2

            /* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$$inlined$map$2$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 TradeCoreSubmitFragment.kt\ncom/kubi/core/biz/submit/TradeCoreSubmitFragment\n*L\n1#1,49:1\n50#2:50\n694#3:51\n*E\n"})
            public static final class C120382<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f20645b;

                /* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$$inlined$map$2$2", m90122f = "TradeCoreSubmitFragment.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C120382.this.emit(null, this);
                    }
                }

                public C120382(InterfaceC41635f interfaceC41635f) {
                    this.f20645b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f20645b;
                        SymbolInfoEntity symbolInfo = ((SymbolBizUiState) obj).getSymbolInfo();
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(symbolInfo, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super SymbolInfoEntity> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM90941x2.collect(new C120382(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), new C120596(null));
        final InterfaceC41673r<SymbolBizUiState> interfaceC41673rM22742v = m21013D3().m22742v();
        m21016u3(C41636g.m90939v(new InterfaceC41634e<Triple<? extends String, ? extends Integer, ? extends Boolean>>() { // from class: com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$$inlined$map$3

            /* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$$inlined$map$3$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 TradeCoreSubmitFragment.kt\ncom/kubi/core/biz/submit/TradeCoreSubmitFragment\n*L\n1#1,49:1\n50#2:50\n705#3,5:51\n*E\n"})
            public static final class C120392<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f20647b;

                /* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$$inlined$map$3$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$$inlined$map$3$2", m90122f = "TradeCoreSubmitFragment.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C120392.this.emit(null, this);
                    }
                }

                public C120392(InterfaceC41635f interfaceC41635f) {
                    this.f20647b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f20647b;
                        SymbolBizUiState symbolBizUiState = (SymbolBizUiState) obj;
                        SymbolInfoEntity symbolInfo = symbolBizUiState.getSymbolInfo();
                        String code = symbolInfo != null ? symbolInfo.getCode() : null;
                        SymbolInfoEntity symbolInfo2 = symbolBizUiState.getSymbolInfo();
                        Triple triple = new Triple(code, symbolInfo2 != null ? Boxing.boxInt(symbolInfo2.getPriceIncrementPrecision()) : null, Boxing.boxBoolean(symbolBizUiState.isInCallAuctionTrade()));
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(triple, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super Triple<? extends String, ? extends Integer, ? extends Boolean>> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41673rM22742v.collect(new C120392(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), new C120608(null));
        final InterfaceC41634e interfaceC41634eM90941x3 = C41636g.m90941x(m21013D3().m22742v(), new Function1() { // from class: com.kubi.core.biz.submit.e0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeCoreSubmitFragment.m22285Q4((SymbolBizUiState) obj);
            }
        });
        m21016u3(C41636g.m90881E(new InterfaceC41634e<SymbolInfoEntity>() { // from class: com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$$inlined$map$4

            /* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$$inlined$map$4$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 TradeCoreSubmitFragment.kt\ncom/kubi/core/biz/submit/TradeCoreSubmitFragment\n*L\n1#1,49:1\n50#2:50\n725#3:51\n*E\n"})
            public static final class C120402<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f20649b;

                /* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$$inlined$map$4$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeCoreSubmitFragment$bindState$$inlined$map$4$2", m90122f = "TradeCoreSubmitFragment.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C120402.this.emit(null, this);
                    }
                }

                public C120402(InterfaceC41635f interfaceC41635f) {
                    this.f20649b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f20649b;
                        SymbolInfoEntity symbolInfo = ((SymbolBizUiState) obj).getSymbolInfo();
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(symbolInfo, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super SymbolInfoEntity> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM90941x3.collect(new C120402(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), new C1204111(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.submit.TradeCoreSubmitFragment.bindState.12
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UiState) obj).getSupportTradeTypes();
            }
        }, new C1204313(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.submit.TradeCoreSubmitFragment.bindState.14
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UiState) obj).getPanelModel();
            }
        }, new C1204515(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.submit.TradeCoreSubmitFragment.bindState.16
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UiState) obj).getAllActiveDelegations();
            }
        }, new C1204717(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.submit.TradeCoreSubmitFragment.bindState.18
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UiState) obj).getTradeBalance();
            }
        }, new C1204919(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.submit.TradeCoreSubmitFragment.bindState.20
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UiState) obj).getAvailableBalance();
            }
        }, new C1205121(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.submit.TradeCoreSubmitFragment.bindState.22
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UiState) obj).getAvailableTradeAmount();
            }
        }, new C1205323(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.submit.TradeCoreSubmitFragment.bindState.24
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UiState) obj).getSymbol();
            }
        }, new C1205525(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.submit.TradeCoreSubmitFragment.bindState.26
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UiState) obj).getMarginSymbolInfo();
            }
        }, new C1205727(null));
    }

    /* JADX INFO: renamed from: e5 */
    public final BaseFragment m22377e5() {
        BaseFragment baseFragment;
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("verticalSubmitFragment");
        if (fragmentFindFragmentByTag instanceof BaseFragment) {
            baseFragment = (BaseFragment) fragmentFindFragmentByTag;
        } else {
            baseFragment = null;
        }
        if (baseFragment == null) {
            TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment = new TradeBaseVerticalSubmitFragment();
            getChildFragmentManager().beginTransaction().add(R$id.fl_container, tradeBaseVerticalSubmitFragment, "verticalSubmitFragment").hide(tradeBaseVerticalSubmitFragment).commitNowAllowingStateLoss();
            return tradeBaseVerticalSubmitFragment;
        }
        return baseFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g10.InterfaceC37770a
    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: g */
    public void mo22379g(boolean z11) throws Exception {
        UiState uiState;
        final SymbolInfoEntity symbolInfo;
        TradeSubmitVM tradeSubmitVMM21011A3 = m21011A3();
        if (tradeSubmitVMM21011A3 != null && (uiState = (UiState) tradeSubmitVMM21011A3.getState()) != null && (symbolInfo = uiState.getSymbolInfo()) != null) {
            TradeModel tradeModel = this.f20629Z;
            String code = symbolInfo.getCode();
            Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
            Observable<OrderBookCenterEntity> observableM23314a = tradeModel.m23314a(code);
            final Function1 function1 = new Function1() { // from class: com.kubi.core.biz.submit.p0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(TradeCoreSubmitFragment.m22300X4(this.f20790b, (OrderBookCenterEntity) obj));
                }
            };
            Observable<OrderBookCenterEntity> observableFilter = observableM23314a.filter(new Predicate() { // from class: com.kubi.core.biz.submit.u0
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return TradeCoreSubmitFragment.m22303Y4(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: com.kubi.core.biz.submit.v0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradeCoreSubmitFragment.m22306Z4(this.f20811b, symbolInfo, (OrderBookCenterEntity) obj);
                }
            };
            Consumer<? super OrderBookCenterEntity> consumer = new Consumer() { // from class: com.kubi.core.biz.submit.w0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    TradeCoreSubmitFragment.m22308a5(function2, obj);
                }
            };
            final Function1 function3 = new Function1() { // from class: com.kubi.core.biz.submit.x0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradeCoreSubmitFragment.m22311b5((Throwable) obj);
                }
            };
            observableFilter.subscribe(consumer, new Consumer() { // from class: com.kubi.core.biz.submit.y0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    TradeCoreSubmitFragment.m22314c5(function3, obj);
                }
            });
            TradeSubmitVM tradeSubmitVMM21011A4 = m21011A3();
            if (tradeSubmitVMM21011A4 != null) {
                tradeSubmitVMM21011A4.m22455B0(new TradeSubmitBizContract$UiIntent.UpdateBbo(this.f20635f0));
            }
            m22372W4().m23305g();
            if (z11) {
                m22392z5();
            }
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onAgainShow() throws Exception {
        super.onAgainShow();
        m22343t5(this, false, 1, null);
        m22304Y5(true);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() throws Exception {
        super.onShow();
        m22301X5(this, true, null, 2, null);
        TradeSubmitVM tradeSubmitVMM21011A3 = m21011A3();
        if (tradeSubmitVMM21011A3 != null) {
            tradeSubmitVMM21011A3.m22455B0(TradeSubmitBizContract$UiIntent.Refresh.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: z5 */
    public void m22392z5() throws Exception {
        m22378f5().m85234g(new Action() { // from class: com.kubi.core.biz.submit.d0
            @Override // io.reactivex.functions.Action
            public final void run() {
                TradeCoreSubmitFragment.m22247A5(this.f20694b);
            }
        });
    }

    @Override // com.kubi.core.spot.business.holder.ITradeHolderDependDelegate
    @NotNull
    /* JADX INFO: renamed from: H */
    public BaseFragment mo22357H() {
        return this;
    }
}
