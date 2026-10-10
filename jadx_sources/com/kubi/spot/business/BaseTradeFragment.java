package com.kubi.spot.business;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.blankj.utilcode.util.C5275i0;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.assets.entity.HoldEarnCardHelper;
import com.kubi.assets.entity.HoldEarnConstKt;
import com.kubi.core.base.TradeAccountType;
import com.kubi.core.biz.callauction.CallAuctionSwitch;
import com.kubi.core.biz.menu.more.MoreDialogSectionTab;
import com.kubi.core.biz.menu.more.MultiTabBottomDialog;
import com.kubi.core.biz.menu.more.MultiTabItemInfo;
import com.kubi.core.biz.menu.more.TradeFunctionsFragment;
import com.kubi.core.biz.menu.more.TradeWebContainerFragment;
import com.kubi.core.biz.offline.SymbolOfflineBannerView;
import com.kubi.core.biz.offline.SymbolOfflineData;
import com.kubi.core.biz.offline.SymbolOfflineUtilsExtKt;
import com.kubi.core.biz.offline.SymbolsOfflineManager;
import com.kubi.core.biz.symbolbar.SymbolBarLayout;
import com.kubi.core.biz.togglesymbols.ToggleSymbolDialogHelperKt;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.SymbolPreviewEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.host.HostManager;
import com.kubi.margin.api.IMarginService;
import com.kubi.mart.api.entity.MartChangeSymbolEvent;
import com.kubi.monitor.EventParametersBuilder;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.network.websocket.model.Message;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.p110rn.p111ui.KCBridgeRejecterError;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.quotefacade.entity.CurrencyFilterTransferData;
import com.kubi.quotefacade.entity.SymbolData;
import com.kubi.resources.MenuItem;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.HoldingEarnEntryCardView;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.spot.R$color;
import com.kubi.spot.R$drawable;
import com.kubi.spot.R$id;
import com.kubi.spot.R$string;
import com.kubi.spot.business.businessTrack.DurationTrackManager;
import com.kubi.spot.business.businessTrack.DurationTrackerHelper;
import com.kubi.spot.business.callAuction.CallAuctionFragment;
import com.kubi.spot.business.callAuction.CallAuctionViewController;
import com.kubi.spot.business.delegation.TradeFundsListFragment;
import com.kubi.spot.business.delegation.TradeOpenOrdersFragment;
import com.kubi.spot.business.mvi.SpotTradeContract$UiIntent;
import com.kubi.spot.business.mvi.UIState;
import com.kubi.spot.business.submit.TradeSubmitFragment;
import com.kubi.spot.entity.DelegationEntity;
import com.kubi.spot.entity.NFTEntity;
import com.kubi.spot.exeption.SpotMessage;
import com.kubi.spot.helper.C25307a;
import com.kubi.spot.helper.SymbolInfoHelper;
import com.kubi.spot.helper.TradeManager;
import com.kubi.spot.helper.TradeModel;
import com.kubi.spot.kline.KuCoinKlineFragment;
import com.kubi.spot.kline.flutter.SpotSmallFlutterKlineFragment;
import com.kubi.spot.service.SpotDepend;
import com.kubi.spot.view.SpotTradeRiskTipView;
import com.kubi.tradebase.BizType;
import com.kubi.tradebase.entity.CurrencyBalance;
import com.kubi.tradingbotkit.api.ITradingBotService;
import com.kubi.user.api.IUserService;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27063n;
import com.kubi.utils.C27099x;
import com.kubi.utils.C27100x0;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.C27032f;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.data.entity.ClickCardReport;
import d30.C36606a;
import e20.InterfaceC37053d;
import e30.InterfaceC37055a;
import eg.InterfaceC37174b;
import f00.C37304a;
import f30.C37330a;
import g00.InterfaceC37754f;
import g00.InterfaceC37762n;
import g10.C37787r;
import g10.InterfaceC37770a;
import gf.C37890n;
import hb0.InterfaceC38162f;
import id.C38519a;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.PublishSubject;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jb0.InterfaceC40373g;
import kotlinx.coroutines.C41696j;
import m50.RobotStrategyNumEvent;
import mr.C42597a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38184b;
import p429lf.C42179a;
import p429lf.C42180b;
import p569qq.C43841b;
import p569qq.C43846g;
import p569qq.C43852m;
import p671uq.C45290a;
import p757xd.C46148j;
import p757xd.InterfaceC46140b;
import p757xd.SymbolBarData;
import p768xo.InterfaceC46302c;
import p828zd.C46760a;
import p828zd.C46761b;
import p830zf.InterfaceC46789b0;
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
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import t20.C44635d0;
import t20.C44655n0;
import w00.C45681e;
import w20.C45700a;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: BaseTradeFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u009a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010G\u001a\u00020\u001fH\u0002J\u0006\u0010H\u001a\u00020IJ\b\u0010J\u001a\u00020KH$J\b\u0010L\u001a\u00020IH\u0016J\b\u0010M\u001a\u00020NH\u0016J\u0012\u0010O\u001a\u00020I2\b\u0010P\u001a\u0004\u0018\u00010QH\u0016J$\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\b\u0010P\u001a\u0004\u0018\u00010Q2\b\u0010V\u001a\u0004\u0018\u00010WH\u0016J\u001a\u0010X\u001a\u00020I2\u0006\u0010Y\u001a\u00020S2\b\u0010P\u001a\u0004\u0018\u00010QH\u0017J\b\u0010Z\u001a\u00020IH\u0002J\b\u0010[\u001a\u00020IH\u0002J\u0017\u0010\\\u001a\u00020I2\b\b\u0002\u0010]\u001a\u00020^H\u0000¢\u0006\u0002\b_J\u0012\u0010`\u001a\u00020I2\b\b\u0002\u0010]\u001a\u00020^H\u0002J\b\u0010a\u001a\u00020IH\u0016J\b\u0010b\u001a\u00020IH\u0016J\b\u0010c\u001a\u00020IH\u0016J\u0006\u0010d\u001a\u00020IJ\b\u0010e\u001a\u00020KH\u0002J\b\u0010f\u001a\u00020IH\u0016J\b\u0010g\u001a\u00020IH\u0002J\u0006\u0010m\u001a\u00020IJ<\u0010n\u001a\u00020I2\u0006\u0010o\u001a\u00020p2\b\u0010q\u001a\u0004\u0018\u00010S2\n\b\u0002\u0010r\u001a\u0004\u0018\u00010S2\n\b\u0002\u0010s\u001a\u0004\u0018\u00010S2\b\b\u0002\u0010t\u001a\u000206H\u0002J\u0019\u0010u\u001a\u00020I2\n\b\u0002\u0010v\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0002\u0010wJ0\u0010x\u001a\u00020I2\b\u0010y\u001a\u0004\u0018\u00010z2\b\u0010{\u001a\u0004\u0018\u00010|2\b\u0010}\u001a\u0004\u0018\u00010z2\b\u0010~\u001a\u0004\u0018\u00010|H\u0016J\b\u0010\u007f\u001a\u00020IH\u0002J\t\u0010\u0080\u0001\u001a\u00020IH\u0002J\t\u0010\u0081\u0001\u001a\u00020IH\u0002J\t\u0010\u0082\u0001\u001a\u00020IH\u0002J\u0013\u0010\u0083\u0001\u001a\u00020I2\b\u0010\u0084\u0001\u001a\u00030\u0085\u0001H\u0002J\t\u0010\u0086\u0001\u001a\u00020IH\u0002J\t\u0010\u0087\u0001\u001a\u00020\u001cH\u0016J\t\u0010\u0088\u0001\u001a\u00020\u001cH\u0016J\t\u0010\u0089\u0001\u001a\u00020IH\u0016J\t\u0010\u008a\u0001\u001a\u00020IH\u0016J3\u0010\u008b\u0001\u001a\u00020I2(\u0010\u008c\u0001\u001a#\u0012\u000e\u0012\f\u0012\u0005\u0012\u00030\u008f\u0001\u0018\u00010\u008e\u0001\u0012\u000e\u0012\f\u0012\u0005\u0012\u00030\u008f\u0001\u0018\u00010\u008e\u00010\u008d\u0001H\u0002J\u001c\u0010\u0090\u0001\u001a\u00020I2\u0011\u0010\u0091\u0001\u001a\f\u0012\u0005\u0012\u00030\u008f\u0001\u0018\u00010\u0092\u0001H\u0002J3\u0010\u0098\u0001\u001a\u00020I2(\u0010\u008c\u0001\u001a#\u0012\u000e\u0012\f\u0012\u0005\u0012\u00030\u008f\u0001\u0018\u00010\u008e\u0001\u0012\u000e\u0012\f\u0012\u0005\u0012\u00030\u008f\u0001\u0018\u00010\u008e\u00010\u008d\u0001H\u0002J\u0012\u0010\u009e\u0001\u001a\u00020I2\u0007\u0010\u009f\u0001\u001a\u000206H\u0016J\t\u0010 \u0001\u001a\u00020IH\u0016J\t\u0010¡\u0001\u001a\u00020IH\u0002J\t\u0010¢\u0001\u001a\u00020IH\u0002J\u0012\u0010£\u0001\u001a\u00020I2\u0007\u0010¤\u0001\u001a\u000206H\u0002J\u0011\u0010¥\u0001\u001a\n\u0012\u0005\u0012\u00030§\u00010¦\u0001H\u0002J\t\u0010¨\u0001\u001a\u00020IH\u0002J$\u0010©\u0001\u001a\u00020I2\u0007\u0010ª\u0001\u001a\u0002062\n\u0010«\u0001\u001a\u0005\u0018\u00010¬\u0001H\u0016¢\u0006\u0003\u0010\u00ad\u0001J\t\u0010®\u0001\u001a\u000206H\u0016J\t\u0010¯\u0001\u001a\u00020\u0010H\u0016J\t\u0010°\u0001\u001a\u00020KH\u0016J\t\u0010±\u0001\u001a\u00020IH\u0016J\b\u0010o\u001a\u00020&H\u0016J\t\u0010²\u0001\u001a\u00020\u0010H\u0016J\n\u0010³\u0001\u001a\u00030´\u0001H\u0016J\t\u0010µ\u0001\u001a\u00020\u0016H\u0016J\u0011\u0010¶\u0001\u001a\n\u0012\u0005\u0012\u00030¸\u00010·\u0001H\u0016R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b\"\u0010#R\u001d\u0010%\u001a\u0004\u0018\u00010&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b'\u0010(R\u001b\u0010*\u001a\u00020+8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001a\u001a\u0004\b,\u0010-R\u001a\u0010/\u001a\u000200X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u000206X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010;\u001a\u0004\u0018\u00010<X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001c\u0010A\u001a\u0004\u0018\u00010BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u000e\u0010h\u001a\u00020KX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010i\u001a\u0004\u0018\u000106X\u0082\u000e¢\u0006\u0004\n\u0002\u0010jR\u000e\u0010k\u001a\u000206X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u000206X\u0082\u000e¢\u0006\u0002\n\u0000R\u001f\u0010\u0093\u0001\u001a\u00020KX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R \u0010\u0099\u0001\u001a\u00030\u009a\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u009d\u0001\u0010\u001a\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001¨\u0006¹\u0001"}, m90084d2 = {"Lcom/kubi/spot/business/BaseTradeFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;", "Lcom/kubi/spot/kline/KuCoinKlineFragment$IKlineFragmentProvider;", "Lcom/kubi/sdk/websocket/IWsDataGetter;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "Lcom/kubi/spot/business/ITradeBehavior;", "<init>", "()V", "binding", "Lcom/kubi/spot/databinding/FragmentSpotTradeBinding;", "getBinding", "()Lcom/kubi/spot/databinding/FragmentSpotTradeBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mCurrentSymbol", "Lcom/kubi/data/entity/TradeItemBean;", "getMCurrentSymbol", "()Lcom/kubi/data/entity/TradeItemBean;", "setMCurrentSymbol", "(Lcom/kubi/data/entity/TradeItemBean;)V", "mTradeModel", "Lcom/kubi/spot/helper/TradeModel;", "getMTradeModel", "()Lcom/kubi/spot/helper/TradeModel;", "mTradeModel$delegate", "Lkotlin/Lazy;", "baseBalance", "Lcom/kubi/tradebase/entity/CurrencyBalance;", "quoteBalance", "mKlineFragment", "Lcom/kubi/spot/kline/flutter/SpotSmallFlutterKlineFragment;", "fundsListFragment", "Lcom/kubi/spot/business/delegation/TradeFundsListFragment;", "getFundsListFragment", "()Lcom/kubi/spot/business/delegation/TradeFundsListFragment;", "fundsListFragment$delegate", "robotStrategiesFragment", "Lcom/kubi/sdk/BaseFragment;", "getRobotStrategiesFragment", "()Lcom/kubi/sdk/BaseFragment;", "robotStrategiesFragment$delegate", "tradeSubmitFragment", "Lcom/kubi/spot/business/submit/TradeSubmitFragment;", "getTradeSubmitFragment", "()Lcom/kubi/spot/business/submit/TradeSubmitFragment;", "tradeSubmitFragment$delegate", "callAuctionFragment", "Lcom/kubi/spot/business/callAuction/CallAuctionFragment;", "getCallAuctionFragment", "()Lcom/kubi/spot/business/callAuction/CallAuctionFragment;", "setCallAuctionFragment", "(Lcom/kubi/spot/business/callAuction/CallAuctionFragment;)V", "needRefreshCallAuctionProgress", "", "getNeedRefreshCallAuctionProgress", "()Z", "setNeedRefreshCallAuctionProgress", "(Z)V", "moreMenuDialog", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "getMoreMenuDialog", "()Lcom/kubi/resources/dialog/DialogFragmentHelper;", "setMoreMenuDialog", "(Lcom/kubi/resources/dialog/DialogFragmentHelper;)V", "multiTabBottomDialog", "Lcom/kubi/core/biz/menu/more/MultiTabBottomDialog;", "getMultiTabBottomDialog", "()Lcom/kubi/core/biz/menu/more/MultiTabBottomDialog;", "setMultiTabBottomDialog", "(Lcom/kubi/core/biz/menu/more/MultiTabBottomDialog;)V", "buildKlineFragment", "removeKlineFragment", "", "getLayout", "", "updateSymbolCompleted", "getPageAdapter", "Lcom/kubi/utils/InnerPagerAdapter;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initHoldEarnCard", "refreshHoldEarnCardVisibility", "showMoreMenuDialog", "tab", "Lcom/kubi/core/biz/menu/more/MoreDialogSectionTab;", "showMoreMenuDialog$SpotLib_googleRelease", "showTabModeMoreDialog", "onChildRefresh", "scrollToTop", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "handleEventFromSmallKline", "findCurrentDelegationPosition", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "updateSymbolOfflineBanner", "lastKlinePosition", "lastNft", "Ljava/lang/Boolean;", "isKlineShow", "isNft", "handleKlineView", "renderKlineView", "fragment", "Landroidx/fragment/app/Fragment;", "content", "kLineTitle", "line", "needTrack", "renderNftView", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "(Ljava/lang/Boolean;)V", "notifyAvailableBalanceChange", "quoteAvailableBalance", "Ljava/math/BigDecimal;", "quoteBalanceDisplayStr", "", "baseAvailableBalance", "baseBalanceDisplayStr", "showToggleSymbol", "jumpToLeverTrade", "checkIfSymbolChange", "resetUI", "initNftView", "nft", "Lcom/kubi/spot/entity/NFTEntity;", "checkIsBuy", "getBaseBalance", "getQuoteBalance", "fetchSymbolBalance", "fetchDelegation", "stopSpotOrder", "pair", "Lkotlin/Pair;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "Lcom/kubi/spot/entity/DelegationEntity;", "processItems", FirebaseAnalytics.Param.ITEMS, "", "delegationCount", "getDelegationCount", "()I", "setDelegationCount", "(I)V", "updateDelegationTitle", "wsDataHelper", "Lcom/kubi/sdk/websocket/WsDataHelper;", "getWsDataHelper", "()Lcom/kubi/sdk/websocket/WsDataHelper;", "wsDataHelper$delegate", "getRestfulData", "isResetWs", "registerWsData", "noticeOrderChange", "updateSymbolInfo", "updateRefreshCallAuctionFlag", "enableAuctionTrade", "updateEnableTradingFromPreviewInfo", "Lio/reactivex/Observable;", "Lcom/kubi/data/entity/SymbolPreviewEntity;", "setChangeRate", "setChangeP30", "isShowP30", "changeRate", "", "(ZLjava/lang/Double;)V", "isMaintenance", "getTradeBean", "getPrecision", "onRefresh", "currentSymbol", "currentSymbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "tradeMode", "getMenuItems", "", "Lcom/kubi/resources/MenuItem;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBaseTradeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseTradeFragment.kt\ncom/kubi/spot/business/BaseTradeFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 6 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 DurationTracker.kt\ncom/kubi/monitor/DurationTrackerKt\n+ 9 SpotIssue.kt\ncom/kubi/spot/exeption/SpotIssueKt\n+ 10 Response.kt\ncom/kubi/network/websocket/model/Message\n+ 11 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 12 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1251:1\n147#2,16:1252\n32#3:1268\n23#3,2:1362\n136#3:1367\n126#3,2:1368\n1#4:1269\n17#5,2:1270\n17#5,2:1281\n17#5,2:1360\n76#6,7:1272\n158#6,2:1279\n808#7,11:1283\n1869#7,2:1294\n808#7,11:1296\n808#7,11:1321\n774#7:1332\n865#7,2:1333\n1869#7,2:1335\n808#7,11:1337\n774#7:1348\n865#7,2:1349\n1869#7,2:1351\n827#7:1364\n855#7,2:1365\n808#7,11:1372\n774#7:1383\n865#7,2:1384\n1869#7,2:1386\n1869#7,2:1388\n808#7,11:1390\n1869#7,2:1401\n808#7,11:1410\n1869#7,2:1421\n808#7,11:1423\n774#7:1434\n865#7,2:1435\n1869#7,2:1437\n808#7,11:1439\n774#7:1450\n865#7,2:1451\n1869#7,2:1453\n46#8,14:1307\n43#9,7:1353\n52#9,2:1370\n43#9,7:1403\n58#10,6:1455\n64#10,2:1462\n126#11:1461\n216#12,2:1464\n*S KotlinDebug\n*F\n+ 1 BaseTradeFragment.kt\ncom/kubi/spot/business/BaseTradeFragment\n*L\n163#1:1252,16\n234#1:1268\n866#1:1362,2\n959#1:1367\n961#1:1368,2\n329#1:1270,2\n422#1:1281,2\n858#1:1360,2\n360#1:1272,7\n387#1:1279,2\n469#1:1283,11\n470#1:1294,2\n508#1:1296,11\n727#1:1321,11\n728#1:1332\n728#1:1333,2\n728#1:1335,2\n749#1:1337,11\n750#1:1348\n750#1:1349,2\n751#1:1351,2\n948#1:1364\n948#1:1365,2\n1050#1:1372,11\n1051#1:1383\n1051#1:1384,2\n1052#1:1386,2\n1069#1:1388,2\n336#1:1390,11\n337#1:1401,2\n1009#1:1410,11\n1010#1:1421,2\n1012#1:1423,11\n1013#1:1434\n1013#1:1435,2\n1014#1:1437,2\n1032#1:1439,11\n1033#1:1450\n1033#1:1451,2\n1034#1:1453,2\n656#1:1307,14\n807#1:1353,7\n986#1:1370,2\n355#1:1403,7\n1123#1:1455,6\n1123#1:1462,2\n1123#1:1461\n1131#1:1464,2\n*E\n"})
public abstract class BaseTradeFragment extends SimpleStateFragment<UIState> implements KuCoinKlineFragment.InterfaceC25353a, InterfaceC37770a, SwipeRefreshLayout.OnRefreshListener, ITradeBehavior {

    /* JADX INFO: renamed from: n0 */
    public static final /* synthetic */ KProperty<Object>[] f49725n0 = {Reflection.property1(new PropertyReference1Impl(BaseTradeFragment.class, "binding", "getBinding()Lcom/kubi/spot/databinding/FragmentSpotTradeBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @Nullable
    public SpotSmallFlutterKlineFragment f49731Z;

    /* JADX INFO: renamed from: e0 */
    public boolean f49736e0;

    /* JADX INFO: renamed from: f0 */
    @Nullable
    public DialogFragmentHelper f49737f0;

    /* JADX INFO: renamed from: g0 */
    @Nullable
    public MultiTabBottomDialog f49738g0;

    /* JADX INFO: renamed from: i0 */
    @Nullable
    public Boolean f49740i0;

    /* JADX INFO: renamed from: j0 */
    public boolean f49741j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f49742k0;

    /* JADX INFO: renamed from: l0 */
    public int f49743l0;

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f49726U = C45681e.m100799e(this, new Function1<BaseTradeFragment, C44635d0>() { // from class: com.kubi.spot.business.BaseTradeFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44635d0 invoke(@NotNull BaseTradeFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44635d0.m98747a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44635d0, Unit>() { // from class: com.kubi.spot.business.BaseTradeFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44635d0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44635d0 c44635d0) {
            invoke(c44635d0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public TradeItemBean f49727V = new TradeItemBean("BTC-" + C38184b.f85884a.m86147b());

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f49728W = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.u0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseTradeFragment.m60042I5();
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public CurrencyBalance f49729X = new CurrencyBalance(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);

    /* JADX INFO: renamed from: Y */
    @NotNull
    public CurrencyBalance f49730Y = new CurrencyBalance(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f49732a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.v0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseTradeFragment.m60136l5();
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f49733b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.w0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseTradeFragment.m60149q6();
        }
    });

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f49734c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.x0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseTradeFragment.m60025D6();
        }
    });

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public CallAuctionFragment f49735d0 = new CallAuctionFragment();

    /* JADX INFO: renamed from: h0 */
    public int f49739h0 = -1;

    /* JADX INFO: renamed from: m0 */
    @NotNull
    public final Lazy f49744m0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.y0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseTradeFragment.m60112c7(this.f50486b);
        }
    });

    /* JADX INFO: renamed from: com.kubi.spot.business.BaseTradeFragment$a */
    /* JADX INFO: compiled from: BaseTradeFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/spot/business/BaseTradeFragment$onViewCreated$4", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", ViewProps.POSITION, "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nBaseTradeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseTradeFragment.kt\ncom/kubi/spot/business/BaseTradeFragment$onViewCreated$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1251:1\n808#2,11:1252\n774#2:1263\n865#2,2:1264\n1869#2,2:1266\n808#2,11:1268\n774#2:1279\n865#2,2:1280\n1869#2,2:1282\n*S KotlinDebug\n*F\n+ 1 BaseTradeFragment.kt\ncom/kubi/spot/business/BaseTradeFragment$onViewCreated$4\n*L\n299#1:1252,11\n300#1:1263\n300#1:1264,2\n301#1:1266,2\n307#1:1268,11\n308#1:1279\n308#1:1280,2\n309#1:1282,2\n*E\n"})
    public static final class C24658a extends ViewPager.SimpleOnPageChangeListener {
        public C24658a() {
        }

        /* JADX INFO: renamed from: b */
        public static final Unit m60224b(BaseTradeFragment baseTradeFragment, int i11) {
            PagerAdapter adapter;
            C27103z c27103z;
            List<CharSequence> listM66939a;
            CharSequence charSequence;
            CustomViewPager customViewPager;
            C44635d0 c44635d0M60200m5 = baseTradeFragment.m60200m5();
            if (c44635d0M60200m5 != null && (customViewPager = c44635d0M60200m5.f99029p) != null) {
                adapter = customViewPager.getAdapter();
            } else {
                adapter = null;
            }
            if (adapter instanceof C27103z) {
                c27103z = (C27103z) adapter;
            } else {
                c27103z = null;
            }
            if (c27103z != null && (listM66939a = c27103z.m66939a()) != null && (charSequence = listM66939a.get(i11)) != null) {
                String string = baseTradeFragment.getString(R$string.robot);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                if (StringsKt.startsWith$default(charSequence, (CharSequence) string, false, 2, (Object) null)) {
                    C43852m.m96591c("B5trading", "botTab", "tab", null, 8, null);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(final int position) {
            super.onPageSelected(position);
            C43852m.m96591c("B5trading", "shiftOrder", String.valueOf(position + 1), null, 8, null);
            if (position != 0) {
                if (position == 1) {
                    C43852m.m96591c("B5trading", "spotFundsTab", null, null, 12, null);
                    List<Fragment> fragments = BaseTradeFragment.this.getChildFragmentManager().getFragments();
                    Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : fragments) {
                        if (obj instanceof TradeFundsListFragment) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (((TradeFundsListFragment) obj2).isAdded()) {
                            arrayList2.add(obj2);
                        }
                    }
                    BaseTradeFragment baseTradeFragment = BaseTradeFragment.this;
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((TradeFundsListFragment) it.next()).m60674S3(baseTradeFragment.mo60180J());
                    }
                }
            } else {
                C43852m.m96591c("B5trading", "openOrderTab", null, null, 12, null);
                List<Fragment> fragments2 = BaseTradeFragment.this.getChildFragmentManager().getFragments();
                Intrinsics.checkNotNullExpressionValue(fragments2, "getFragments(...)");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : fragments2) {
                    if (obj3 instanceof TradeOpenOrdersFragment) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : arrayList3) {
                    if (((TradeOpenOrdersFragment) obj4).isAdded()) {
                        arrayList4.add(obj4);
                    }
                }
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    ((TradeOpenOrdersFragment) it2.next()).m60762v3();
                }
            }
            final BaseTradeFragment baseTradeFragment2 = BaseTradeFragment.this;
            C27100x0.m66924e(new Function0() { // from class: com.kubi.spot.business.x1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseTradeFragment.C24658a.m60224b(baseTradeFragment2, position);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.BaseTradeFragment$b */
    /* JADX INFO: compiled from: BaseTradeFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nBaseTradeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseTradeFragment.kt\ncom/kubi/spot/business/BaseTradeFragment$onViewCreated$8$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1251:1\n360#2,7:1252\n*S KotlinDebug\n*F\n+ 1 BaseTradeFragment.kt\ncom/kubi/spot/business/BaseTradeFragment$onViewCreated$8$1$1\n*L\n371#1:1252,7\n*E\n"})
    public static final class C24659b implements Function0<Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RobotStrategyNumEvent f49746b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ BaseTradeFragment f49747c;

        public C24659b(RobotStrategyNumEvent robotStrategyNumEvent, BaseTradeFragment baseTradeFragment) {
            this.f49746b = robotStrategyNumEvent;
            this.f49747c = baseTradeFragment;
        }

        /* JADX INFO: renamed from: a */
        public final void m60225a() {
            String stringRes;
            SlidingTabLayout slidingTabLayout;
            CustomViewPager customViewPager;
            if (Intrinsics.areEqual(this.f49746b.getType(), SearchCategory$Companion.SPOT)) {
                if (this.f49746b.getNum() == null) {
                    stringRes = this.f49747c.getStringRes(R$string.robot, new Object[0]);
                } else {
                    stringRes = this.f49747c.getStringRes(R$string.robot, new Object[0]) + " (" + this.f49746b.getNum() + ')';
                }
                C44635d0 c44635d0M60200m5 = this.f49747c.m60200m5();
                PagerAdapter adapter = (c44635d0M60200m5 == null || (customViewPager = c44635d0M60200m5.f99029p) == null) ? null : customViewPager.getAdapter();
                C27103z c27103z = adapter instanceof C27103z ? (C27103z) adapter : null;
                if (c27103z != null) {
                    BaseTradeFragment baseTradeFragment = this.f49747c;
                    List<? extends CharSequence> mutableList = CollectionsKt.toMutableList((Collection) c27103z.m66939a());
                    Iterator<? extends CharSequence> it = mutableList.iterator();
                    int i11 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i11 = -1;
                            break;
                        } else if (StringsKt.contains$default(it.next(), (CharSequence) baseTradeFragment.getStringRes(R$string.robot, new Object[0]), false, 2, (Object) null)) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    if (i11 != -1) {
                        mutableList.set(i11, stringRes);
                        c27103z.m66940b(mutableList);
                        C44635d0 c44635d0M60200m6 = baseTradeFragment.m60200m5();
                        if (c44635d0M60200m6 == null || (slidingTabLayout = c44635d0M60200m6.f99015b) == null) {
                            return;
                        }
                        slidingTabLayout.m55291w();
                    }
                }
            }
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m60225a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.BaseTradeFragment$c */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C24660c extends TypeToken<WsMarketSnapshotEntity> {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: A6 */
    public static final Unit m60016A6(CurrencyFilterTransferData currencyFilterTransferData, KCBridgeRejecterError kCBridgeRejecterError) {
        SymbolData data;
        String symbolCode;
        SymbolData data2;
        String symbolCode2;
        String symbolCode3;
        SymbolData data3;
        String symbolCode4;
        SymbolData data4;
        String symbolCode5;
        String level1 = currencyFilterTransferData != null ? currencyFilterTransferData.getLevel1() : null;
        if (level1 != null) {
            switch (level1.hashCode()) {
                case -1263170109:
                    if (level1.equals(ClickCardReport.ReportData.CARD_TYPE_FUTURE) && (data = currencyFilterTransferData.getData()) != null && (symbolCode = data.getSymbolCode()) != null) {
                        InterfaceC37754f.a.m85131c(C37304a.f82764a, symbolCode, "buy", null, null, null, null, null, null, null, 508, null);
                    }
                    break;
                case -1081309778:
                    if (level1.equals(ViewProps.MARGIN)) {
                        if (Intrinsics.areEqual(currencyFilterTransferData.getLevel2(), "cross")) {
                            SymbolData data5 = currencyFilterTransferData.getData();
                            if (data5 != null && (symbolCode3 = data5.getSymbolCode()) != null) {
                                InterfaceC37754f.a.m85136h(C37304a.f82764a, symbolCode3, Boolean.TRUE, null, null, null, 28, null);
                            }
                        } else if (Intrinsics.areEqual(currencyFilterTransferData.getLevel2(), "isolated") && (data2 = currencyFilterTransferData.getData()) != null && (symbolCode2 = data2.getSymbolCode()) != null) {
                            InterfaceC37754f.a.m85134f(C37304a.f82764a, symbolCode2, Boolean.TRUE, null, null, null, 28, null);
                        }
                    }
                    break;
                case 3537154:
                    if (level1.equals(SearchCategory$Companion.SPOT) && (data3 = currencyFilterTransferData.getData()) != null && (symbolCode4 = data3.getSymbolCode()) != null) {
                        InterfaceC37754f.a.m85140l(C37304a.f82764a, symbolCode4, Boolean.TRUE, null, null, null, null, 60, null);
                    }
                    break;
                case 92909918:
                    if (level1.equals("alpha") && (data4 = currencyFilterTransferData.getData()) != null && (symbolCode5 = data4.getSymbolCode()) != null) {
                        InterfaceC37754f.a.m85129a(C37304a.f82764a, Long.valueOf(DowngradeExKt.m66546p(symbolCode5, 0L, 1, null)), Boolean.TRUE, null, null, null, 28, null);
                    }
                    break;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N5 */
    public static final Unit m60056N5(BaseTradeFragment baseTradeFragment) {
        m60162w6(baseTradeFragment, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T5 */
    public static final Unit m60079T5(BaseTradeFragment baseTradeFragment, Boolean bool) throws Exception {
        baseTradeFragment.mo22379g(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J5 */
    public final void m60181J5() {
        C43841b.m96557d("refresh_delegation_list", "receive_socket", null, 4, null);
        mo60199m2();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public abstract int getLayout();

    /* JADX INFO: renamed from: k5 */
    public final int m60196k5() {
        try {
            List<Fragment> fragments = getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : fragments) {
                if (obj instanceof TradeOpenOrdersFragment) {
                    arrayList.add(obj);
                }
            }
            TradeOpenOrdersFragment tradeOpenOrdersFragment = (TradeOpenOrdersFragment) CollectionsKt.firstOrNull((List) arrayList);
            if (tradeOpenOrdersFragment != null) {
                return tradeOpenOrdersFragment.m60758n3();
            }
            return 0;
        } catch (Exception e11) {
            C44128b.m97263g("findCurrentDelegationPosition", e11);
            return 0;
        }
    }

    /* JADX INFO: renamed from: n6 */
    public final void m60202n6(Boolean bool) {
        C44655n0 c44655n0;
        ConstraintLayout root;
        BaseTextView baseTextView;
        LinearLayout linearLayout;
        C44655n0 c44655n1;
        ConstraintLayout root2;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        LinearLayout linearLayout2;
        C44655n0 c44655n2;
        ConstraintLayout root3;
        BaseTextView baseTextView4;
        C44655n0 c44655n3;
        ConstraintLayout root4;
        C44655n0 c44655n4;
        ConstraintLayout root5;
        if (bool == null) {
            C44635d0 c44635d0M60200m5 = m60200m5();
            if (c44635d0M60200m5 != null && (c44655n3 = c44635d0M60200m5.f99030q) != null && (root4 = c44655n3.getRoot()) != null) {
                C44635d0 c44635d0M60200m6 = m60200m5();
                C27046k.m66684G(root4, !C27025c.m66566d((c44635d0M60200m6 == null || (c44655n4 = c44635d0M60200m6.f99030q) == null || (root5 = c44655n4.getRoot()) == null) ? null : Boolean.valueOf(C27046k.m66704s(root5))));
            }
        } else {
            C44635d0 c44635d0M60200m7 = m60200m5();
            if (c44635d0M60200m7 != null && (c44655n0 = c44635d0M60200m7.f99030q) != null && (root = c44655n0.getRoot()) != null) {
                C27046k.m66684G(root, bool.booleanValue());
            }
        }
        if (C27063n.m66765c("k_panel_position", 0, 1, null) == 0) {
            C44635d0 c44635d0M60200m8 = m60200m5();
            if (c44635d0M60200m8 == null || (c44655n2 = c44635d0M60200m8.f99030q) == null || (root3 = c44655n2.getRoot()) == null || !C27046k.m66704s(root3)) {
                C44635d0 c44635d0M60200m9 = m60200m5();
                if (c44635d0M60200m9 != null && (baseTextView3 = c44635d0M60200m9.f99038y) != null) {
                    C27046k.m66694i(baseTextView3, R$drawable.ic2_triangle_bottom_12, C5275i0.m6236a(2.0f), 0, 4, null);
                }
            } else {
                C44635d0 c44635d0M60200m10 = m60200m5();
                if (c44635d0M60200m10 != null && (baseTextView4 = c44635d0M60200m10.f99038y) != null) {
                    C27046k.m66694i(baseTextView4, R$drawable.ic2_triangle_top_12, C5275i0.m6236a(2.0f), 0, 4, null);
                }
            }
            C44635d0 c44635d0M60200m11 = m60200m5();
            if (c44635d0M60200m11 == null || (linearLayout2 = c44635d0M60200m11.f99031r) == null) {
                return;
            }
            C37330a.m83912d(linearLayout2, this.f49742k0 && !this.f49741j0);
            return;
        }
        C44635d0 c44635d0M60200m12 = m60200m5();
        if (c44635d0M60200m12 == null || (c44655n1 = c44635d0M60200m12.f99030q) == null || (root2 = c44655n1.getRoot()) == null || !C27046k.m66704s(root2)) {
            C44635d0 c44635d0M60200m13 = m60200m5();
            if (c44635d0M60200m13 != null && (baseTextView = c44635d0M60200m13.f99038y) != null) {
                C27046k.m66694i(baseTextView, R$drawable.ic2_triangle_bottom_12, C5275i0.m6236a(2.0f), 0, 4, null);
            }
        } else {
            C44635d0 c44635d0M60200m14 = m60200m5();
            if (c44635d0M60200m14 != null && (baseTextView2 = c44635d0M60200m14.f99038y) != null) {
                C27046k.m66694i(baseTextView2, R$drawable.ic2_triangle_top_12, C5275i0.m6236a(2.0f), 0, 4, null);
            }
        }
        C44635d0 c44635d0M60200m15 = m60200m5();
        if (c44635d0M60200m15 == null || (linearLayout = c44635d0M60200m15.f99031r) == null) {
            return;
        }
        C37330a.m83912d(linearLayout, this.f49742k0);
    }

    /* JADX INFO: renamed from: B5 */
    public static final Unit m60019B5(BaseTradeFragment baseTradeFragment, InterfaceC46302c interfaceC46302c) {
        baseTradeFragment.f49741j0 = !baseTradeFragment.f49741j0;
        Fragment fragmentRequireParentFragment = baseTradeFragment.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
        baseTradeFragment.m60198l6(fragmentRequireParentFragment, interfaceC46302c.mo63561l1(), interfaceC46302c.mo63550M2(), interfaceC46302c.mo63579x1(), true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D6 */
    public static final TradeSubmitFragment m60025D6() {
        return new TradeSubmitFragment();
    }

    /* JADX INFO: renamed from: F5 */
    public static final Unit m60031F5() {
        Router.f46192a.m56184f(HostManager.a.m() + "/nft-token/intro").m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G5 */
    public static final Unit m60034G5(NFTEntity nFTEntity, BaseTradeFragment baseTradeFragment) {
        NFTDialog nFTDialogNewInstance = NFTDialog.f49748b0.newInstance(nFTEntity);
        FragmentManager childFragmentManager = baseTradeFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        nFTDialogNewInstance.show(childFragmentManager, "nft_dialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G6 */
    public static final Unit m60035G6(BaseTradeFragment baseTradeFragment, SymbolPreviewEntity symbolPreviewEntity) {
        baseTradeFragment.f49727V.getSymbolInfoEntity().setEnableTrading(C27025c.m66566d(symbolPreviewEntity.getEnableTrading()));
        baseTradeFragment.m60043I6(C27025c.m66566d(symbolPreviewEntity.isEnableAuctionTrade()));
        baseTradeFragment.f49727V.getSymbolInfoEntity().setEnableAuctionTrade(Boolean.valueOf(C27025c.m66566d(symbolPreviewEntity.isEnableAuctionTrade())));
        C37890n.f85269a.m85607H(baseTradeFragment.f49727V.getSymbolInfoEntity());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H5 */
    private final void m60038H5() {
        C43852m.m96591c("B5trading", "marginButton", null, null, 12, null);
        IMarginService iMarginServiceM63033c = SpotDepend.f51244a.m63033c();
        String symbol = this.f49727V.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        IMarginService.m37900d0(iMarginServiceM63033c, symbol, mo60189N().isIsolatedMarginTradeEnabled(), false, null, 12, null);
    }

    /* JADX INFO: renamed from: I5 */
    public static final TradeModel m60042I5() {
        return new TradeModel();
    }

    /* JADX INFO: renamed from: I6 */
    private final void m60043I6(boolean z11) {
        if (Intrinsics.areEqual(this.f49727V.getSymbolInfoEntity().getEnableAuctionTrade(), Boolean.valueOf(z11))) {
            return;
        }
        this.f49736e0 = true;
    }

    /* JADX INFO: renamed from: L6 */
    public static final boolean m60049L6(BaseTradeFragment baseTradeFragment, ArrayList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() > 0 && Intrinsics.areEqual(((TradeItemBean) it.get(0)).getSymbol(), baseTradeFragment.f49727V.getSymbol());
    }

    /* JADX INFO: renamed from: M6 */
    public static final boolean m60053M6(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: N4 */
    public static final Unit m60055N4(BaseTradeFragment baseTradeFragment, NFTEntity nFTEntity) {
        if (nFTEntity != null && C27025c.m66566d(nFTEntity.getDisplay())) {
            baseTradeFragment.f49742k0 = true;
            baseTradeFragment.m60172A5();
            baseTradeFragment.m60175D5(nFTEntity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N6 */
    public static final TradeItemBean m60057N6(ArrayList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (TradeItemBean) it.get(0);
    }

    /* JADX INFO: renamed from: O5 */
    public static final Unit m60060O5(BaseTradeFragment baseTradeFragment, boolean z11) {
        FrameLayout frameLayout;
        baseTradeFragment.f49741j0 = !baseTradeFragment.f49741j0;
        if (baseTradeFragment.f49742k0) {
            baseTradeFragment.m60202n6(Boolean.FALSE);
        }
        C44635d0 c44635d0M60200m5 = baseTradeFragment.m60200m5();
        if (c44635d0M60200m5 != null && (frameLayout = c44635d0M60200m5.f99027n) != null) {
            baseTradeFragment.m60198l6(baseTradeFragment, frameLayout, null, null, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O6 */
    public static final TradeItemBean m60061O6(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (TradeItemBean) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: P5 */
    public static final Unit m60064P5(BaseTradeFragment baseTradeFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        m60144o6(baseTradeFragment, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q5 */
    public static final Unit m60068Q5(final BaseTradeFragment baseTradeFragment) {
        C43852m.m96591c("B5trading", "orderList", null, null, 12, null);
        IUserService.O(IUserService.a.get(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.spot.business.z0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseTradeFragment.m60071R5(this.f50490b);
            }
        }), 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R5 */
    public static final Unit m60071R5(BaseTradeFragment baseTradeFragment) {
        InterfaceC37762n.a.m85178b(C37304a.f82764a, null, Long.valueOf(baseTradeFragment.m60196k5()), baseTradeFragment.mo60180J().getSymbol(), C43852m.m96601m("B5trading", "orderList", "1"), null, null, 49, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S4 */
    public static final Unit m60074S4(BaseTradeFragment baseTradeFragment, BasePageEntity basePageEntity) {
        List<DelegationEntity> items;
        if (basePageEntity != null && (items = basePageEntity.getItems()) != null) {
            baseTradeFragment.m60220x5().m61562w5(items);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S5 */
    public static final void m60075S5(BaseTradeFragment baseTradeFragment, InterfaceC38162f it) throws Exception {
        Intrinsics.checkNotNullParameter(it, "it");
        List<Fragment> fragments = baseTradeFragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof SwipeRefreshLayout.OnRefreshListener) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((SwipeRefreshLayout.OnRefreshListener) it2.next()).onRefresh();
        }
        baseTradeFragment.m60186K6();
        baseTradeFragment.mo22379g(true);
        baseTradeFragment.mo60185K5();
        baseTradeFragment.m60193Y5();
    }

    /* JADX INFO: renamed from: T6 */
    public static final boolean m60080T6(ArrayList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() > 0;
    }

    /* JADX INFO: renamed from: U6 */
    public static final boolean m60084U6(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: V6 */
    public static final ObservableSource m60088V6(BaseTradeFragment baseTradeFragment, ArrayList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Boolean enableAuctionTrade = ((SymbolInfoEntity) it.get(0)).getEnableAuctionTrade();
        Intrinsics.checkNotNullExpressionValue(enableAuctionTrade, "getEnableAuctionTrade(...)");
        baseTradeFragment.m60043I6(enableAuctionTrade.booleanValue());
        baseTradeFragment.f49727V.setSymbolInfoEntity((SymbolInfoEntity) it.get(0));
        if (!SymbolInfoHelper.f50575a.m61804a(baseTradeFragment.f49727V, true)) {
            return baseTradeFragment.m60177F6();
        }
        C37890n.f85269a.m85607H(baseTradeFragment.f49727V.getSymbolInfoEntity());
        Observable observableJust = Observable.just(it);
        Intrinsics.checkNotNull(observableJust);
        return observableJust;
    }

    /* JADX INFO: renamed from: W6 */
    public static final ObservableSource m60092W6(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (ObservableSource) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: X6 */
    public static final void m60095X6(BaseTradeFragment baseTradeFragment, Object obj) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        if (baseTradeFragment.f49736e0 && CallAuctionSwitch.f20317a.m21637c()) {
            CallAuctionViewController callAuctionViewController = CallAuctionViewController.f49857a;
            String symbol = baseTradeFragment.f49727V.getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
            callAuctionViewController.m60534a(baseTradeFragment, symbol, false, baseTradeFragment.m60200m5());
        }
        C44635d0 c44635d0M60200m5 = baseTradeFragment.m60200m5();
        if (c44635d0M60200m5 != null && (kuCoinRefreshLayout = c44635d0M60200m5.f99032s) != null) {
            kuCoinRefreshLayout.setRefreshing(false);
        }
        baseTradeFragment.mo60182J6();
    }

    /* JADX INFO: renamed from: Y4 */
    public static final Unit m60097Y4(Throwable th2) {
        DurationTrackerHelper.f49784a.m60348a();
        th2.printStackTrace();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a5 */
    public static final Unit m60103a5(BaseTradeFragment baseTradeFragment, BasePageEntity basePageEntity) {
        List<DelegationEntity> items;
        if (!IUserService.a.get().c()) {
            return Unit.INSTANCE;
        }
        if (basePageEntity != null && (items = basePageEntity.getItems()) != null) {
            baseTradeFragment.m60192X5(items);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b6 */
    public static final boolean m60107b6(BaseTradeFragment baseTradeFragment, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!baseTradeFragment.isVisible()) {
            return false;
        }
        String str = String.format("/market/snapshot_app:%s", Arrays.copyOf(new Object[]{baseTradeFragment.f49727V.getSymbol()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return Intrinsics.areEqual(str, it.getTopic());
    }

    /* JADX INFO: renamed from: b7 */
    public static final Unit m60108b7(BaseTradeFragment baseTradeFragment, SymbolOfflineData symbolOfflineData) {
        String showSymbol = baseTradeFragment.f49727V.getShowSymbol();
        Intrinsics.checkNotNullExpressionValue(showSymbol, "getShowSymbol(...)");
        SymbolOfflineUtilsExtKt.m22077m(baseTradeFragment, symbolOfflineData, showSymbol, null, false, null, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c6 */
    public static final boolean m60111c6(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: c7 */
    public static final C37787r m60112c7(BaseTradeFragment baseTradeFragment) {
        return new C37787r(baseTradeFragment);
    }

    /* JADX INFO: renamed from: d6 */
    public static final WsMarketSnapshotEntity m60115d6(Message s11) {
        Intrinsics.checkNotNullParameter(s11, "s");
        Object objM66914d = null;
        if (s11.getData() != null && !TextUtils.isEmpty(s11.getData())) {
            try {
                String data = s11.getData();
                Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                C27099x c27099x = C27099x.f54458a;
                objM66914d = C27099x.m66914d(data, new C24660c().getType());
            } catch (Throwable unused) {
            }
        }
        return (WsMarketSnapshotEntity) objM66914d;
    }

    /* JADX INFO: renamed from: e5 */
    public static final Pair m60117e5(CurrencyBalance t11, CurrencyBalance t12) {
        Intrinsics.checkNotNullParameter(t11, "t1");
        Intrinsics.checkNotNullParameter(t12, "t2");
        return new Pair(t11, t12);
    }

    /* JADX INFO: renamed from: e6 */
    public static final WsMarketSnapshotEntity m60118e6(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (WsMarketSnapshotEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: f5 */
    public static final Pair m60120f5(Function2 function2, Object p11, Object p12) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return (Pair) function2.invoke(p11, p12);
    }

    /* JADX INFO: renamed from: f6 */
    public static final Unit m60121f6(BaseTradeFragment baseTradeFragment, WsMarketSnapshotEntity wsMarketSnapshotEntity) {
        if (wsMarketSnapshotEntity != null) {
            wsMarketSnapshotEntity.covertToTradeItemBean(baseTradeFragment.f49727V);
        }
        baseTradeFragment.m60215u6();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l5 */
    public static final TradeFundsListFragment m60136l5() {
        return TradeFundsListFragment.f49916c0.newInstance();
    }

    /* JADX INFO: renamed from: m6 */
    public static /* synthetic */ void m60139m6(BaseTradeFragment baseTradeFragment, Fragment fragment, View view, View view2, View view3, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderKlineView");
        }
        if ((i11 & 4) != 0) {
            view2 = null;
        }
        if ((i11 & 8) != 0) {
            view3 = null;
        }
        if ((i11 & 16) != 0) {
            z11 = false;
        }
        baseTradeFragment.m60198l6(fragment, view, view2, view3, z11);
    }

    /* JADX INFO: renamed from: o6 */
    public static /* synthetic */ void m60144o6(BaseTradeFragment baseTradeFragment, Boolean bool, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderNftView");
        }
        if ((i11 & 1) != 0) {
            bool = null;
        }
        baseTradeFragment.m60202n6(bool);
    }

    /* JADX INFO: renamed from: q6 */
    public static final BaseFragment m60149q6() {
        return ITradingBotService.f52126a.get().mo63682g(SearchCategory$Companion.SPOT);
    }

    /* JADX INFO: renamed from: w6 */
    public static /* synthetic */ void m60162w6(BaseTradeFragment baseTradeFragment, MoreDialogSectionTab moreDialogSectionTab, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMoreMenuDialog");
        }
        if ((i11 & 1) != 0) {
            moreDialogSectionTab = MoreDialogSectionTab.a.f20520a;
        }
        baseTradeFragment.m60217v6(moreDialogSectionTab);
    }

    /* JADX INFO: renamed from: y5 */
    private final C37787r m60167y5() {
        return (C37787r) this.f49744m0.getValue();
    }

    /* JADX INFO: renamed from: y6 */
    public static final Unit m60168y6(BaseTradeFragment baseTradeFragment) {
        MultiTabBottomDialog multiTabBottomDialog = baseTradeFragment.f49738g0;
        if (multiTabBottomDialog != null) {
            multiTabBottomDialog.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z6 */
    private final void m60171z6() {
        C43852m.m96591c("B5trading", "symbolSelect", null, null, 12, null);
        IQuoteFacadeService.Companion companion = IQuoteFacadeService.f41383a;
        if (companion.get().mo50718w()) {
            try {
                IQuoteFacadeService iQuoteFacadeService = companion.get();
                FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                try {
                    iQuoteFacadeService.mo50714q(this, childFragmentManager, new CurrencyFilterTransferData(SearchCategory$Companion.SPOT, null, null, new SymbolData(this.f49727V.getSymbol(), null, 2, null), 6, null), "TradeSpotRnToggleSymbolDialog", new Function2() { // from class: com.kubi.spot.business.r1
                        @Override // p852kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BaseTradeFragment.m60016A6((CurrencyFilterTransferData) obj, (KCBridgeRejecterError) obj2);
                        }
                    });
                } catch (Exception e11) {
                    e = e11;
                    C45700a.m100877c(e, "TradeSpotSymbolFilter");
                }
            } catch (Exception e12) {
                e = e12;
            }
        } else {
            String symbol = this.f49727V.getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
            C12572a.m23695d("mart_changeSymol", new MartChangeSymbolEvent("spot_trade", symbol), 0L, 4, null);
            String symbol2 = this.f49727V.getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol2, "getSymbol(...)");
            ToggleSymbolDialogHelperKt.m22841l(this, symbol2, new Function0() { // from class: com.kubi.spot.business.s1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseTradeFragment.m60020B6(this.f50301b);
                }
            });
        }
        if (isShowing()) {
            m60167y5().m85236i(false);
            m60220x5().m61559u5(false);
        }
        C43841b.m96557d("click_spot_exchange", "click_start_btn", null, 4, null);
    }

    /* JADX INFO: renamed from: A5 */
    public final void m60172A5() {
        FrameLayout frameLayout;
        C44655n0 c44655n0;
        ConstraintLayout root;
        FrameLayout frameLayout2;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        C44655n0 c44655n1;
        ConstraintLayout root2;
        FrameLayout frameLayout3;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        LinearLayout linearLayout5;
        SymbolBarLayout symbolBarLayout;
        C46148j f20881c;
        C44655n0 c44655n2;
        ConstraintLayout root3;
        FrameLayout frameLayout4;
        LinearLayout linearLayout6;
        LinearLayout linearLayout7;
        LinearLayout linearLayout8;
        View viewMo63564n1;
        Boolean boolValueOf = null;
        if (CallAuctionSwitch.m21636i(CallAuctionSwitch.f20317a, false, 1, null)) {
            return;
        }
        int iM66765c = C27063n.m66765c("k_panel_position", 0, 1, null);
        if (Intrinsics.areEqual(this.f49740i0, Boolean.valueOf(this.f49742k0)) && this.f49739h0 == iM66765c) {
            SpotSmallFlutterKlineFragment spotSmallFlutterKlineFragment = this.f49731Z;
            if ((spotSmallFlutterKlineFragment != null ? spotSmallFlutterKlineFragment.getParentFragment() : null) != null) {
                return;
            }
        }
        this.f49739h0 = iM66765c;
        this.f49740i0 = Boolean.valueOf(this.f49742k0);
        m60197k6();
        ActivityResultCaller parentFragment = getParentFragment();
        InterfaceC46302c interfaceC46302c = parentFragment instanceof InterfaceC46302c ? (InterfaceC46302c) parentFragment : null;
        if (interfaceC46302c != null && (viewMo63564n1 = interfaceC46302c.mo63564n1()) != null) {
            ViewExtKt.m66577h(viewMo63564n1);
        }
        C44635d0 c44635d0M60200m5 = m60200m5();
        if (c44635d0M60200m5 != null && (linearLayout8 = c44635d0M60200m5.f99028o) != null) {
            ViewExtKt.m66577h(linearLayout8);
        }
        if (iM66765c == 0) {
            C44635d0 c44635d0M60200m6 = m60200m5();
            if (c44635d0M60200m6 != null && (linearLayout = c44635d0M60200m6.f99028o) != null) {
                ViewExtKt.m66594y(linearLayout);
            }
            if (this.f49741j0) {
                if (this.f49742k0) {
                    m60202n6(Boolean.FALSE);
                }
                C44635d0 c44635d0M60200m7 = m60200m5();
                if (c44635d0M60200m7 == null || (frameLayout2 = c44635d0M60200m7.f99027n) == null) {
                    return;
                }
                m60139m6(this, this, frameLayout2, null, null, false, 28, null);
                return;
            }
            C44635d0 c44635d0M60200m8 = m60200m5();
            if (c44635d0M60200m8 != null && (c44655n0 = c44635d0M60200m8.f99030q) != null && (root = c44655n0.getRoot()) != null) {
                boolValueOf = Boolean.valueOf(C27046k.m66704s(root));
            }
            m60202n6(boolValueOf);
            C44635d0 c44635d0M60200m9 = m60200m5();
            if (c44635d0M60200m9 == null || (frameLayout = c44635d0M60200m9.f99027n) == null) {
                return;
            }
            m60139m6(this, this, frameLayout, null, null, false, 28, null);
            return;
        }
        if (iM66765c != 1) {
            this.f49741j0 = false;
            if (this.f49742k0) {
                C44635d0 c44635d0M60200m10 = m60200m5();
                if (c44635d0M60200m10 != null && (linearLayout7 = c44635d0M60200m10.f99028o) != null) {
                    ViewExtKt.m66594y(linearLayout7);
                }
                C44635d0 c44635d0M60200m11 = m60200m5();
                if (c44635d0M60200m11 != null && (linearLayout6 = c44635d0M60200m11.f99031r) != null) {
                    ViewExtKt.m66594y(linearLayout6);
                }
                C44635d0 c44635d0M60200m12 = m60200m5();
                if (c44635d0M60200m12 != null && (frameLayout4 = c44635d0M60200m12.f99027n) != null) {
                    ViewExtKt.m66577h(frameLayout4);
                }
                C44635d0 c44635d0M60200m13 = m60200m5();
                if (c44635d0M60200m13 != null && (c44655n2 = c44635d0M60200m13.f99030q) != null && (root3 = c44655n2.getRoot()) != null) {
                    boolValueOf = Boolean.valueOf(C27046k.m66704s(root3));
                }
                m60202n6(boolValueOf);
            } else {
                C44635d0 c44635d0M60200m14 = m60200m5();
                if (c44635d0M60200m14 != null && (linearLayout5 = c44635d0M60200m14.f99028o) != null) {
                    ViewExtKt.m66577h(linearLayout5);
                }
            }
            C44635d0 c44635d0M60200m15 = m60200m5();
            if (c44635d0M60200m15 == null || (symbolBarLayout = c44635d0M60200m15.f99035v) == null || (f20881c = symbolBarLayout.getF20881c()) == null) {
                return;
            }
            C46148j.m101730v(f20881c, iM66765c, this.f49741j0, false, 4, null);
            return;
        }
        ActivityResultCaller parentFragment2 = getParentFragment();
        final InterfaceC46302c interfaceC46302c2 = parentFragment2 instanceof InterfaceC46302c ? (InterfaceC46302c) parentFragment2 : null;
        if (interfaceC46302c2 != null) {
            View viewMo63564n2 = interfaceC46302c2.mo63564n1();
            if (viewMo63564n2 != null) {
                ViewExtKt.m66594y(viewMo63564n2);
            }
            if (this.f49742k0) {
                C44635d0 c44635d0M60200m16 = m60200m5();
                if (c44635d0M60200m16 != null && (linearLayout4 = c44635d0M60200m16.f99028o) != null) {
                    ViewExtKt.m66594y(linearLayout4);
                }
                C44635d0 c44635d0M60200m17 = m60200m5();
                if (c44635d0M60200m17 != null && (linearLayout3 = c44635d0M60200m17.f99031r) != null) {
                    ViewExtKt.m66594y(linearLayout3);
                }
                C44635d0 c44635d0M60200m18 = m60200m5();
                if (c44635d0M60200m18 != null && (frameLayout3 = c44635d0M60200m18.f99027n) != null) {
                    ViewExtKt.m66577h(frameLayout3);
                }
                C44635d0 c44635d0M60200m19 = m60200m5();
                if (c44635d0M60200m19 != null && (c44655n1 = c44635d0M60200m19.f99030q) != null && (root2 = c44655n1.getRoot()) != null) {
                    boolValueOf = Boolean.valueOf(C27046k.m66704s(root2));
                }
                m60202n6(boolValueOf);
            } else {
                C44635d0 c44635d0M60200m20 = m60200m5();
                if (c44635d0M60200m20 != null && (linearLayout2 = c44635d0M60200m20.f99028o) != null) {
                    ViewExtKt.m66577h(linearLayout2);
                }
            }
            View viewMo63550M2 = interfaceC46302c2.mo63550M2();
            if (viewMo63550M2 != null) {
                C27046k.m66711z(viewMo63550M2, 0L, new Function0() { // from class: com.kubi.spot.business.t1
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseTradeFragment.m60019B5(this.f50467b, interfaceC46302c2);
                    }
                }, 1, null);
            }
            InterfaceC46302c interfaceC46302c3 = interfaceC46302c2;
            Fragment fragmentRequireParentFragment = requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            m60139m6(this, fragmentRequireParentFragment, interfaceC46302c3.mo63561l1(), interfaceC46302c3.mo63550M2(), interfaceC46302c3.mo63579x1(), false, 16, null);
        }
    }

    /* JADX INFO: renamed from: C5 */
    public final void m60173C5() {
        if (C12573b.f21598a.m23696a()) {
            HoldEarnConstKt.HOLD_EARN_OPEN_SUCC.length();
        }
        C12572a.m23692a(this, true, new BaseTradeFragment$initHoldEarnCard$$inlined$bindFlowEvent$1(HoldEarnConstKt.HOLD_EARN_OPEN_SUCC, null, this));
    }

    /* JADX INFO: renamed from: C6 */
    public final void m60174C6(Pair<? extends BasePageEntity<DelegationEntity>, ? extends BasePageEntity<DelegationEntity>> pair) {
        if (IUserService.a.get().c()) {
            BasePageEntity<DelegationEntity> first = pair.getFirst();
            m60192X5(first != null ? first.getItems() : null);
            BasePageEntity<DelegationEntity> second = pair.getSecond();
            m60192X5(second != null ? second.getItems() : null);
        }
    }

    @Override // com.kubi.spot.kline.KuCoinKlineFragment.InterfaceC25353a
    @NotNull
    /* JADX INFO: renamed from: D0, reason: from getter */
    public TradeItemBean getF49727V() {
        return this.f49727V;
    }

    @Override // com.kubi.spot.business.ITradeBehavior
    @NotNull
    /* JADX INFO: renamed from: I, reason: from getter */
    public CurrencyBalance getF49729X() {
        return this.f49729X;
    }

    @Override // com.kubi.spot.business.ITradeBehavior
    @NotNull
    /* JADX INFO: renamed from: J */
    public TradeItemBean mo60180J() {
        return this.f49727V;
    }

    @Override // com.kubi.spot.business.ITradeBehavior
    /* JADX INFO: renamed from: K */
    public void mo60183K() {
        String quoteCurrency;
        if (IUserService.a.get().c() && getActivity() != null) {
            FragmentActivity activity = getActivity();
            if (C27025c.m66566d(activity != null ? Boolean.valueOf(activity.isFinishing()) : null)) {
                return;
            }
            String baseCurrency = mo60189N().getBaseCurrency();
            if (baseCurrency == null || baseCurrency.length() == 0 || (quoteCurrency = mo60189N().getQuoteCurrency()) == null || quoteCurrency.length() == 0) {
                C43846g.m96568c(new SpotMessage("BaseTradeFragment：baseCurrency is empty or quoteCurrency is empty", "v1/account/currency-balance", false, 4, null), null, 2, null);
            }
            ObservableSource observableSourceCompose = ((InterfaceC37053d) C42597a.m93386b().create(InterfaceC37053d.class)).m82938f("TRADE", mo60189N().getBaseCurrency()).compose(C24217a1.m58389m());
            ObservableSource observableSourceCompose2 = ((InterfaceC37053d) C42597a.m93386b().create(InterfaceC37053d.class)).m82938f("TRADE", mo60189N().getQuoteCurrency()).compose(C24217a1.m58389m());
            final Function2 function2 = new Function2() { // from class: com.kubi.spot.business.a
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BaseTradeFragment.m60117e5((CurrencyBalance) obj, (CurrencyBalance) obj2);
                }
            };
            Observable observableZip = Observable.zip(observableSourceCompose, observableSourceCompose2, new BiFunction() { // from class: com.kubi.spot.business.l
                @Override // io.reactivex.functions.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return BaseTradeFragment.m60120f5(function2, obj, obj2);
                }
            });
            final Function1 function1 = new Function1() { // from class: com.kubi.spot.business.w
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BaseTradeFragment.m60123g5(this.f50477b, (Pair) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.spot.business.h0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BaseTradeFragment.m60126h5(function1, obj);
                }
            };
            final Function1 function3 = new Function1() { // from class: com.kubi.spot.business.s0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BaseTradeFragment.m60129i5((Throwable) obj);
                }
            };
            Disposable disposableSubscribe = observableZip.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.business.d1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BaseTradeFragment.m60132j5(function3, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
            m60205p5().m60673K4(mo60180J());
        }
    }

    /* JADX INFO: renamed from: K4 */
    public final SpotSmallFlutterKlineFragment m60184K4() {
        Fragment parentFragment;
        SpotSmallFlutterKlineFragment spotSmallFlutterKlineFragment = this.f49731Z;
        if (spotSmallFlutterKlineFragment != null && spotSmallFlutterKlineFragment.isAdded() && (parentFragment = spotSmallFlutterKlineFragment.getParentFragment()) != null) {
            C27032f.m66622m(parentFragment, spotSmallFlutterKlineFragment);
        }
        SpotSmallFlutterKlineFragment.Companion companion = SpotSmallFlutterKlineFragment.f50681e0;
        String symbol = this.f49727V.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        SpotSmallFlutterKlineFragment spotSmallFlutterKlineFragmentNewInstance = companion.newInstance(symbol, this.f49727V.getSymbolInfoEntity().getPriceIncrementPrecision());
        this.f49731Z = spotSmallFlutterKlineFragmentNewInstance;
        return spotSmallFlutterKlineFragmentNewInstance;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    /* JADX INFO: renamed from: L4 */
    public final void m60187L4() {
        SymbolBarLayout symbolBarLayout;
        InterfaceC46140b f20880b;
        ImageView f104634j;
        SymbolBarLayout symbolBarLayout2;
        C46148j f20881c;
        SymbolBarLayout symbolBarLayout3;
        C46148j f20881c2;
        TradeItemBean tradeItemBean;
        Bundle arguments = getArguments();
        if (arguments != null) {
            String symbol = this.f49727V.getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
            String strM56285z = RouteExKt.m56285z(arguments, "symbol", symbol);
            if (strM56285z != null) {
                if (strM56285z.length() <= 0 || Intrinsics.areEqual(strM56285z, this.f49727V.getSymbol())) {
                    tradeItemBean = this.f49727V;
                } else {
                    C37890n c37890n = C37890n.f85269a;
                    if (c37890n.m85601B(strM56285z) != null) {
                        m60206p6();
                        tradeItemBean = c37890n.m85603D(strM56285z);
                        if (tradeItemBean == null) {
                            tradeItemBean = new TradeItemBean(strM56285z);
                        }
                    } else {
                        tradeItemBean = this.f49727V;
                    }
                }
                if (tradeItemBean != null) {
                    Object objM56186h = Router.f46192a.m56186h(InterfaceC37174b.class, SiteInfoManager.f47913a.m58109c());
                    if ((objM56186h != null ? Boolean.valueOf(((InterfaceC37174b) objM56186h).m83142b(this.f49727V.getSymbol())) : Boolean.FALSE).booleanValue()) {
                        tradeItemBean = new TradeItemBean("BTC-THB");
                    }
                    this.f49727V = tradeItemBean;
                }
            }
        }
        CallAuctionViewController callAuctionViewController = CallAuctionViewController.f49857a;
        String symbol2 = this.f49727V.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol2, "getSymbol(...)");
        callAuctionViewController.m60534a(this, symbol2, false, m60200m5());
        C44635d0 c44635d0M60200m5 = m60200m5();
        if (Intrinsics.areEqual((c44635d0M60200m5 == null || (symbolBarLayout3 = c44635d0M60200m5.f99035v) == null || (f20881c2 = symbolBarLayout3.getF20881c()) == null) ? null : f20881c2.m101732n(), this.f49727V.getShowSymbol())) {
            m60172A5();
            return;
        }
        StorageId<String> storageIdM87132g = C38519a.f86479a.m87132g();
        String symbol3 = this.f49727V.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol3, "getSymbol(...)");
        C46392a.m102333p(storageIdM87132g, symbol3);
        mo60213t6(false, null);
        C44635d0 c44635d0M60200m6 = m60200m5();
        if (c44635d0M60200m6 != null && (symbolBarLayout2 = c44635d0M60200m6.f99035v) != null && (f20881c = symbolBarLayout2.getF20881c()) != null) {
            f20881c.m101735q(new SymbolBarData(this.f49727V.getSymbol(), this.f49727V.getShowSymbol(), null, null, null, Integer.valueOf(C27063n.m66765c("k_panel_position", 0, 1, null)), this.f49741j0, false, 152, null));
        }
        SpotSmallFlutterKlineFragment spotSmallFlutterKlineFragment = this.f49731Z;
        if (spotSmallFlutterKlineFragment != null) {
            String symbol4 = this.f49727V.getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol4, "getSymbol(...)");
            spotSmallFlutterKlineFragment.m24419p3(symbol4, this.f49727V.getSymbolInfoEntity().getPriceIncrementPrecision());
        }
        CurrencyBalance currencyBalance = new CurrencyBalance(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
        currencyBalance.setCurrency(mo60189N().getQuoteCurrency());
        this.f49730Y = currencyBalance;
        CurrencyBalance currencyBalance2 = new CurrencyBalance(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
        currencyBalance2.setCurrency(mo60189N().getBaseCurrency());
        this.f49729X = currencyBalance2;
        m60220x5().m61550g5();
        m60202n6(Boolean.FALSE);
        this.f49742k0 = false;
        m60172A5();
        C44635d0 c44635d0M60200m7 = m60200m5();
        if (c44635d0M60200m7 != null && (symbolBarLayout = c44635d0M60200m7.f99035v) != null && (f20880b = symbolBarLayout.getF20880b()) != null && (f104634j = f20880b.getF104634j()) != null) {
            f104634j.setEnabled(false);
        }
        TradeModel tradeModelM60208r5 = m60208r5();
        String symbol5 = mo60189N().getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol5, "getSymbol(...)");
        Observable<NFTEntity> observableDoFinally = tradeModelM60208r5.m61855k(symbol5).doFinally(new Action() { // from class: com.kubi.spot.business.c0
            @Override // io.reactivex.functions.Action
            public final void run() {
                BaseTradeFragment.m60051M4(this.f49795b);
            }
        });
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.business.d0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseTradeFragment.m60055N4(this.f49893b, (NFTEntity) obj);
            }
        };
        Consumer<? super NFTEntity> consumer = new Consumer() { // from class: com.kubi.spot.business.e0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseTradeFragment.m60059O4(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.business.f0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseTradeFragment.m60063P4((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableDoFinally.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.business.g0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseTradeFragment.m60067Q4(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        ITradingBotService.f52126a.get().mo63677a(this.f49727V.getSymbol(), m60219w5());
    }

    @Override // com.kubi.spot.business.ITradeBehavior
    /* JADX INFO: renamed from: M */
    public boolean mo60188M() {
        return TradeManager.f50593a.m61840o(this.f49727V.getSymbol());
    }

    @Override // com.kubi.spot.business.ITradeBehavior
    @NotNull
    /* JADX INFO: renamed from: N */
    public SymbolInfoEntity mo60189N() {
        SymbolInfoEntity symbolInfoEntity = this.f49727V.getSymbolInfoEntity();
        Intrinsics.checkNotNullExpressionValue(symbolInfoEntity, "getSymbolInfoEntity(...)");
        return symbolInfoEntity;
    }

    @Override // com.kubi.spot.business.ITradeBehavior
    @NotNull
    /* JADX INFO: renamed from: O, reason: from getter */
    public CurrencyBalance getF49730Y() {
        return this.f49730Y;
    }

    /* JADX INFO: renamed from: X5 */
    public final void m60192X5(List<DelegationEntity> list) {
        if (list != null) {
            for (DelegationEntity delegationEntity : list) {
                DurationTrackManager.Companion companion = DurationTrackManager.f49767c;
                String strM60321f = companion.getInstance().m60321f(delegationEntity.getOrderId());
                if (strM60321f != null) {
                    C43841b.m96556c("click_submit_spot_order", "data_load_finish", strM60321f);
                    companion.getInstance().m60325k(delegationEntity.getOrderId());
                }
            }
        }
    }

    /* JADX INFO: renamed from: Y5 */
    public final void m60193Y5() {
        StorageId<Long> storageIdClassicStorageId = HoldEarnCardHelper.INSTANCE.classicStorageId(UserInfo.a.i());
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new BaseTradeFragment$refreshHoldEarnCardVisibility$1(this, storageIdClassicStorageId, null), 3, null);
    }

    @Override // g10.InterfaceC37770a
    /* JADX INFO: renamed from: g */
    public void mo22379g(boolean z11) throws Exception {
        if (z11) {
            m60194Z5();
        }
    }

    @Override // com.kubi.spot.kline.KuCoinKlineFragment.InterfaceC25353a
    public int getPrecision() {
        return this.f49727V.getSymbolInfoEntity().getPriceIncrementPrecision();
    }

    /* JADX INFO: renamed from: k6 */
    public final void m60197k6() {
        Fragment parentFragment;
        SpotSmallFlutterKlineFragment spotSmallFlutterKlineFragment = this.f49731Z;
        if (spotSmallFlutterKlineFragment == null || (parentFragment = spotSmallFlutterKlineFragment.getParentFragment()) == null) {
            return;
        }
        C27032f.m66622m(parentFragment, spotSmallFlutterKlineFragment);
    }

    /* JADX INFO: renamed from: l6 */
    public final void m60198l6(Fragment fragment, View view, View view2, View view3, boolean z11) {
        LinearLayout linearLayout;
        SymbolBarLayout symbolBarLayout;
        C46148j f20881c;
        if (view == null) {
            return;
        }
        if (this.f49741j0) {
            if ("spot_kline_load".length() == 0 || "click_start_btn".length() == 0) {
                C44128b.m97270n("Monitor", "eventName(spot_kline_load) or pointName(click_start_btn) is null");
            } else {
                EventParametersBuilder eventParametersBuilderAcquire = EventParametersBuilder.INSTANCE.acquire();
                if (this.f49741j0) {
                    eventParametersBuilderAcquire.m42382c("type", TIMPushProvider.f75062n);
                } else {
                    eventParametersBuilderAcquire.m42382c("type", TIMPushProvider.f75063o);
                }
                C45290a.f101823a.m100101b("spot_kline_load", "click_start_btn", "", eventParametersBuilderAcquire.m42380a());
            }
            ViewExtKt.m66594y(view);
            if (view2 != null) {
                ViewExtKt.m66577h(view2);
            }
            C27032f.m66611b(fragment, view.getId(), m60184K4(), null, 4, null);
            if (z11) {
                C43852m.m96591c("B5trading", "kShow", "1", null, 8, null);
            }
            if (view3 != null) {
                ViewExtKt.m66594y(view3);
            }
        } else {
            ViewExtKt.m66577h(view);
            if (view2 != null) {
                ViewExtKt.m66594y(view2);
            }
            m60197k6();
            if (z11) {
                C43852m.m96591c("B5trading", "kShow", "2", null, 8, null);
            }
            if (view3 != null) {
                ViewExtKt.m66577h(view3);
            }
        }
        C44635d0 c44635d0M60200m5 = m60200m5();
        if (c44635d0M60200m5 != null && (symbolBarLayout = c44635d0M60200m5.f99035v) != null && (f20881c = symbolBarLayout.getF20881c()) != null) {
            C46148j.m101730v(f20881c, C27063n.m66765c("k_panel_position", 0, 1, null), this.f49741j0, false, 4, null);
        }
        C44635d0 c44635d0M60200m6 = m60200m5();
        if (c44635d0M60200m6 == null || (linearLayout = c44635d0M60200m6.f99031r) == null) {
            return;
        }
        C37330a.m83912d(linearLayout, this.f49742k0 && !this.f49741j0);
    }

    @Nullable
    /* JADX INFO: renamed from: m5 */
    public final C44635d0 m60200m5() {
        return (C44635d0) this.f49726U.getValue(this, f49725n0[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: n5, reason: from getter */
    public final CallAuctionFragment getF49735d0() {
        return this.f49735d0;
    }

    /* JADX INFO: renamed from: o5, reason: from getter */
    public final int getF49743l0() {
        return this.f49743l0;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(getLayout(), (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"KCLongMethodCheck"})
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        View view2;
        View viewFindViewById;
        KuCoinRefreshLayout kuCoinRefreshLayout;
        SymbolBarLayout symbolBarLayout;
        C46148j f20881c;
        SymbolBarLayout symbolBarLayout2;
        InterfaceC46140b f20880b;
        SlidingTabLayout slidingTabLayout;
        SlidingTabLayout slidingTabLayout2;
        SlidingTabLayout slidingTabLayout3;
        SlidingTabLayout slidingTabLayout4;
        CustomViewPager customViewPager;
        CustomViewPager customViewPager2;
        CustomViewPager customViewPager3;
        PagerAdapter adapter;
        CustomViewPager customViewPager4;
        AppCompatImageView appCompatImageView;
        BaseTextView baseTextView;
        SymbolBarLayout symbolBarLayout3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C44635d0 c44635d0M60200m5 = m60200m5();
        if (c44635d0M60200m5 != null && (symbolBarLayout3 = c44635d0M60200m5.f99035v) != null) {
            Context context = symbolBarLayout3.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            symbolBarLayout3.m22751a(new C46761b(context), new C46760a("B5trading", new Function0() { // from class: com.kubi.spot.business.i0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseTradeFragment.m60048L5(this.f50166b);
                }
            }, new Function0() { // from class: com.kubi.spot.business.k0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseTradeFragment.m60052M5(this.f50174b);
                }
            }, new Function0() { // from class: com.kubi.spot.business.l0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseTradeFragment.m60056N5(this.f50179b);
                }
            }, new Function1() { // from class: com.kubi.spot.business.m0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BaseTradeFragment.m60060O5(this.f50184b, ((Boolean) obj).booleanValue());
                }
            }));
        }
        C44635d0 c44635d0M60200m6 = m60200m5();
        if (c44635d0M60200m6 != null && (baseTextView = c44635d0M60200m6.f99038y) != null) {
            ViewExtKt.m66575f(baseTextView, new Function1() { // from class: com.kubi.spot.business.n0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BaseTradeFragment.m60064P5(this.f50274b, (View) obj);
                }
            });
        }
        C44635d0 c44635d0M60200m7 = m60200m5();
        if (c44635d0M60200m7 != null && (appCompatImageView = c44635d0M60200m7.f99016c) != null) {
            C27046k.m66711z(appCompatImageView, 0L, new Function0() { // from class: com.kubi.spot.business.o0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseTradeFragment.m60068Q5(this.f50284b);
                }
            }, 1, null);
        }
        C44635d0 c44635d0M60200m8 = m60200m5();
        if (c44635d0M60200m8 != null && (customViewPager4 = c44635d0M60200m8.f99029p) != null) {
            customViewPager4.setAdapter(m60216v5());
        }
        C44635d0 c44635d0M60200m9 = m60200m5();
        if (c44635d0M60200m9 != null && (customViewPager2 = c44635d0M60200m9.f99029p) != null) {
            C44635d0 c44635d0M60200m10 = m60200m5();
            customViewPager2.setOffscreenPageLimit(C27039d.m66651k((c44635d0M60200m10 == null || (customViewPager3 = c44635d0M60200m10.f99029p) == null || (adapter = customViewPager3.getAdapter()) == null) ? null : Integer.valueOf(adapter.getCount()), 2));
        }
        C44635d0 c44635d0M60200m11 = m60200m5();
        if (c44635d0M60200m11 != null && (customViewPager = c44635d0M60200m11.f99029p) != null) {
            customViewPager.addOnPageChangeListener(new C24658a());
        }
        C44635d0 c44635d0M60200m12 = m60200m5();
        boolean zM83143c = true;
        if (c44635d0M60200m12 != null && (slidingTabLayout4 = c44635d0M60200m12.f99015b) != null) {
            slidingTabLayout4.setNeedBold(true);
        }
        C44635d0 c44635d0M60200m13 = m60200m5();
        if (c44635d0M60200m13 != null && (slidingTabLayout3 = c44635d0M60200m13.f99015b) != null) {
            slidingTabLayout3.setTabMaxLine(1);
        }
        C44635d0 c44635d0M60200m14 = m60200m5();
        if (c44635d0M60200m14 != null && (slidingTabLayout2 = c44635d0M60200m14.f99015b) != null) {
            C44635d0 c44635d0M60200m15 = m60200m5();
            slidingTabLayout2.setViewPager(c44635d0M60200m15 != null ? c44635d0M60200m15.f99029p : null);
        }
        C44635d0 c44635d0M60200m16 = m60200m5();
        if (c44635d0M60200m16 != null && (slidingTabLayout = c44635d0M60200m16.f99015b) != null) {
            slidingTabLayout.m55291w();
        }
        Object objM56186h = Router.f46192a.m56186h(InterfaceC37174b.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            InterfaceC37174b interfaceC37174b = (InterfaceC37174b) objM56186h;
            C44635d0 c44635d0M60200m17 = m60200m5();
            zM83143c = interfaceC37174b.m83143c((c44635d0M60200m17 == null || (symbolBarLayout2 = c44635d0M60200m17.f99035v) == null || (f20880b = symbolBarLayout2.getF20880b()) == null) ? null : f20880b.getF104635k());
        }
        C44635d0 c44635d0M60200m18 = m60200m5();
        if (c44635d0M60200m18 != null && (symbolBarLayout = c44635d0M60200m18.f99035v) != null && (f20881c = symbolBarLayout.getF20881c()) != null) {
            f20881c.m101740x(zM83143c, zM83143c);
        }
        C44635d0 c44635d0M60200m19 = m60200m5();
        if (c44635d0M60200m19 != null && (kuCoinRefreshLayout = c44635d0M60200m19.f99032s) != null) {
            kuCoinRefreshLayout.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.spot.business.p0
                @Override // jb0.InterfaceC40373g
                /* JADX INFO: renamed from: a */
                public final void mo15329a(InterfaceC38162f interfaceC38162f) throws Exception {
                    BaseTradeFragment.m60075S5(this.f50287b, interfaceC38162f);
                }
            });
        }
        C27032f.m66611b(this, R$id.fl_trade_container, m60220x5(), null, 4, null);
        m60173C5();
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null && (view2 = parentFragment.getView()) != null && (viewFindViewById = view2.findViewById(R$id.root_view)) != null) {
            viewFindViewById.setBackgroundResource(R$color.c_overlay);
        }
        CompositeDisposable destroyDisposable = getDestroyDisposable();
        PublishSubject<Boolean> publishSubjectM21641g = CallAuctionSwitch.f20317a.m21641g();
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.business.q0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseTradeFragment.m60079T5(this.f50290b, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.spot.business.r0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseTradeFragment.m60083U5(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.business.t0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseTradeFragment.m60087V5((Throwable) obj);
            }
        };
        destroyDisposable.add(publishSubjectM21641g.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.business.j0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseTradeFragment.m60091W5(function2, obj);
            }
        }));
        if (m60219w5() != null) {
            String name = RobotStrategyNumEvent.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (C12573b.f21598a.m23696a()) {
                name.length();
            }
            C12572a.m23692a(this, false, new C24661x4c691a1d(name, null, this));
        }
    }

    /* JADX INFO: renamed from: p5 */
    public final TradeFundsListFragment m60205p5() {
        return (TradeFundsListFragment) this.f49732a0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: q5 */
    public final TradeItemBean m60207q5() {
        return this.f49727V;
    }

    @NotNull
    /* JADX INFO: renamed from: r5 */
    public final TradeModel m60208r5() {
        return (TradeModel) this.f49728W.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: s5 */
    public List<MenuItem> mo60210s5() {
        return new ArrayList();
    }

    /* JADX INFO: renamed from: s6 */
    public final void m60211s6(@NotNull CallAuctionFragment callAuctionFragment) {
        Intrinsics.checkNotNullParameter(callAuctionFragment, "<set-?>");
        this.f49735d0 = callAuctionFragment;
    }

    @Nullable
    /* JADX INFO: renamed from: t5, reason: from getter */
    public final DialogFragmentHelper getF49737f0() {
        return this.f49737f0;
    }

    @Nullable
    /* JADX INFO: renamed from: u5, reason: from getter */
    public final MultiTabBottomDialog getF49738g0() {
        return this.f49738g0;
    }

    @NotNull
    /* JADX INFO: renamed from: v5 */
    public C27103z m60216v5() {
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(TradeOpenOrdersFragment.f49942X.newInstance(), m60205p5());
        BaseFragment baseFragmentM60219w5 = m60219w5();
        if (baseFragmentM60219w5 != null) {
            arrayListArrayListOf.add(baseFragmentM60219w5);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        ArrayList arrayList = new ArrayList();
        arrayList.add(getString(R$string.todo_delegation));
        arrayList.add(getString(R$string.option_assets));
        if (m60219w5() != null) {
            arrayList.add(getString(R$string.robot));
        }
        Unit unit = Unit.INSTANCE;
        return new C27103z(childFragmentManager, arrayListArrayListOf, arrayList);
    }

    /* JADX INFO: renamed from: v6 */
    public final void m60217v6(@NotNull MoreDialogSectionTab tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        String symbol = this.f49727V.getSymbol();
        if (symbol != null && IUserService.a.get().c()) {
            sendIntent(new SpotTradeContract$UiIntent.GetAssetTotal(symbol));
        }
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46789b0.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null ? ((InterfaceC46789b0) objM56186h).mo103117b() : false) {
            m60221x6(tab);
        } else {
            DialogFragmentHelper dialogFragmentHelperM59005W = BottomSheetDialogHelper.f48599a.m59005W(CollectionsKt.toMutableList((Collection) mo60210s5()));
            this.f49737f0 = dialogFragmentHelperM59005W;
            if (dialogFragmentHelperM59005W != null) {
                FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                dialogFragmentHelperM59005W.show(childFragmentManager, "funcitons");
            }
        }
        C43852m.m96590b("B5trading", "moreUpperRightCorner", "1", TuplesKt.m90091to("norm_version", "1"));
    }

    @Override // com.kubi.spot.business.ITradeBehavior
    /* JADX INFO: renamed from: w0 */
    public void mo60218w0(@Nullable BigDecimal bigDecimal, @Nullable CharSequence charSequence, @Nullable BigDecimal bigDecimal2, @Nullable CharSequence charSequence2) {
        CustomViewPager customViewPager;
        if (!IUserService.a.get().c()) {
            List<Fragment> fragments = getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : fragments) {
                if (obj instanceof TradeOpenOrdersFragment) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((TradeOpenOrdersFragment) obj2).isAdded()) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((TradeOpenOrdersFragment) it.next()).m60757m3(charSequence, mo60189N().getQuoteCurrencyName());
            }
            return;
        }
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new BaseTradeFragment$notifyAvailableBalanceChange$3(this, charSequence, null));
        C44635d0 c44635d0M60200m5 = m60200m5();
        if (c44635d0M60200m5 == null || (customViewPager = c44635d0M60200m5.f99029p) == null || customViewPager.getCurrentItem() != 2) {
            return;
        }
        List<Fragment> fragments2 = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments2, "getFragments(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : fragments2) {
            if (obj3 instanceof TradeFundsListFragment) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : arrayList3) {
            if (((TradeFundsListFragment) obj4).isAdded()) {
                arrayList4.add(obj4);
            }
        }
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            ((TradeFundsListFragment) it2.next()).m60674S3(mo60180J());
        }
    }

    /* JADX INFO: renamed from: w5 */
    public final BaseFragment m60219w5() {
        return (BaseFragment) this.f49733b0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: x5 */
    public final TradeSubmitFragment m60220x5() {
        return (TradeSubmitFragment) this.f49734c0.getValue();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: x6 */
    public final void m60221x6(MoreDialogSectionTab moreDialogSectionTab) {
        String string = getString(R$string.kc_trade_more_tab_feature);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        MultiTabItemInfo multiTabItemInfo = new MultiTabItemInfo(string, TradeFunctionsFragment.f20509Y.create(mo60210s5(), BizType.SPOT, new Function0() { // from class: com.kubi.spot.business.a1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseTradeFragment.m60168y6(this.f49757b);
            }
        }));
        String string2 = getString(R$string.kc_trade_more_tab_guide);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        TradeWebContainerFragment.Companion companion = TradeWebContainerFragment.f20516W;
        MultiTabBottomDialog.Companion companion2 = MultiTabBottomDialog.f20501v0;
        MultiTabBottomDialog multiTabBottomDialogCreate = companion2.create(CollectionsKt.mutableListOf(multiTabItemInfo, new MultiTabItemInfo(string2, companion.create(companion2.getSPOT_USER_GUIDES_URL()))), Intrinsics.areEqual(moreDialogSectionTab, MoreDialogSectionTab.b.f20521a) ? 1 : 0);
        this.f49738g0 = multiTabBottomDialogCreate;
        if (multiTabBottomDialogCreate != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            multiTabBottomDialogCreate.show(childFragmentManager, "funcitons");
        }
    }

    /* JADX INFO: renamed from: B6 */
    public static final Unit m60020B6(BaseTradeFragment baseTradeFragment) {
        if (baseTradeFragment.isShowing()) {
            baseTradeFragment.m60167y5().m85236i(true);
            baseTradeFragment.m60220x5().m61559u5(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E5 */
    public static final Unit m60028E5(NFTEntity nFTEntity) {
        String positionJumpLink = nFTEntity.getPositionJumpLink();
        if (positionJumpLink != null) {
            Router.f46192a.m56184f(positionJumpLink).m4048k();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H6 */
    public static final void m60039H6(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: L5 */
    public static final Unit m60048L5(BaseTradeFragment baseTradeFragment) {
        baseTradeFragment.m60171z6();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M4 */
    public static final void m60051M4(BaseTradeFragment baseTradeFragment) {
        C44635d0 c44635d0M60200m5;
        SymbolBarLayout symbolBarLayout;
        InterfaceC46140b f20880b;
        ImageView f104634j;
        if (baseTradeFragment.isAdded() && !baseTradeFragment.isDetached() && baseTradeFragment.isShowing() && (c44635d0M60200m5 = baseTradeFragment.m60200m5()) != null && (symbolBarLayout = c44635d0M60200m5.f99035v) != null && (f20880b = symbolBarLayout.getF20880b()) != null && (f104634j = f20880b.getF104634j()) != null) {
            f104634j.setEnabled(true);
        }
    }

    /* JADX INFO: renamed from: M5 */
    public static final Unit m60052M5(BaseTradeFragment baseTradeFragment) {
        baseTradeFragment.m60038H5();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O4 */
    public static final void m60059O4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P4 */
    public static final Unit m60063P4(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P6 */
    public static final Unit m60065P6(BaseTradeFragment baseTradeFragment, TradeItemBean tradeItemBean) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        C44635d0 c44635d0M60200m5 = baseTradeFragment.m60200m5();
        if (c44635d0M60200m5 != null && (kuCoinRefreshLayout = c44635d0M60200m5.f99032s) != null) {
            kuCoinRefreshLayout.setRefreshing(false);
        }
        baseTradeFragment.f49727V.setChangeRate(tradeItemBean.getChangeRate());
        baseTradeFragment.m60215u6();
        TradeItemBean tradeItemBean2 = baseTradeFragment.f49727V;
        Intrinsics.checkNotNull(tradeItemBean);
        tradeItemBean2.setFavor(C25307a.m61759a(tradeItemBean));
        baseTradeFragment.f49727V.setAlarm(tradeItemBean.isAlarm());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q4 */
    public static final void m60067Q4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q6 */
    public static final void m60069Q6(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R6 */
    public static final Unit m60072R6(BaseTradeFragment baseTradeFragment, Throwable th2) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        th2.printStackTrace();
        C44635d0 c44635d0M60200m5 = baseTradeFragment.m60200m5();
        if (c44635d0M60200m5 != null && (kuCoinRefreshLayout = c44635d0M60200m5.f99032s) != null) {
            kuCoinRefreshLayout.setRefreshing(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S6 */
    public static final void m60076S6(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T4 */
    public static final void m60078T4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: U4 */
    public static final Unit m60082U4(Throwable th2) {
        th2.printStackTrace();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U5 */
    public static final void m60083U5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V4 */
    public static final void m60086V4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V5 */
    public static final Unit m60087V5(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C45700a.m100877c(th2, "BaseTradeFragment");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W4 */
    public static final Unit m60090W4(BaseTradeFragment baseTradeFragment, Pair pair) {
        Intrinsics.checkNotNull(pair);
        baseTradeFragment.m60176E6(pair);
        baseTradeFragment.m60174C6(pair);
        List<Fragment> fragments = baseTradeFragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof TradeOpenOrdersFragment) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((TradeOpenOrdersFragment) obj2).isAdded()) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((TradeOpenOrdersFragment) it.next()).m60761t3(pair);
        }
        DurationTrackerHelper.f49784a.m60349b();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W5 */
    public static final void m60091W5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: X4 */
    public static final void m60094X4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Y6 */
    public static final Unit m60098Y6(BaseTradeFragment baseTradeFragment, Throwable th2) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        C44635d0 c44635d0M60200m5 = baseTradeFragment.m60200m5();
        if (c44635d0M60200m5 != null && (kuCoinRefreshLayout = c44635d0M60200m5.f99032s) != null) {
            kuCoinRefreshLayout.setRefreshing(false);
        }
        baseTradeFragment.mo60182J6();
        th2.printStackTrace();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z4 */
    public static final void m60100Z4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z6 */
    public static final void m60101Z6(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a6 */
    public static final void m60104a6(final BaseTradeFragment baseTradeFragment) {
        baseTradeFragment.getVisibleDisposable().clear();
        CompositeDisposable visibleDisposable = baseTradeFragment.getVisibleDisposable();
        C37787r c37787rM60167y5 = baseTradeFragment.m60167y5();
        String symbol = baseTradeFragment.f49727V.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        PublishSubject<Message> publishSubjectM85233f = c37787rM60167y5.m85233f("/market/snapshot_app:%s", symbol);
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.business.b1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(BaseTradeFragment.m60107b6(this.f49764b, (Message) obj));
            }
        };
        Observable<Message> observableFilter = publishSubjectM85233f.filter(new Predicate() { // from class: com.kubi.spot.business.c1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return BaseTradeFragment.m60111c6(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.business.e1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseTradeFragment.m60115d6((Message) obj);
            }
        };
        Observable observableObserveOn = observableFilter.map(new Function() { // from class: com.kubi.spot.business.f1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BaseTradeFragment.m60118e6(function2, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final Function1 function3 = new Function1() { // from class: com.kubi.spot.business.g1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseTradeFragment.m60121f6(this.f50154b, (WsMarketSnapshotEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.spot.business.h1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseTradeFragment.m60124g6(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.spot.business.i1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseTradeFragment.m60127h6((Throwable) obj);
            }
        };
        visibleDisposable.add(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.business.j1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseTradeFragment.m60130i6(function4, obj);
            }
        }));
        InterfaceC37055a interfaceC37055aM81921d = C36606a.f79410a.m81921d();
        Iterator<Map.Entry<String, String>> it = DurationTrackManager.f49767c.getInstance().m60323h().entrySet().iterator();
        while (it.hasNext()) {
            C43841b.m96556c("click_submit_spot_order", "data_load_finish", it.next().getValue());
        }
        DurationTrackManager.f49767c.getInstance().m60318c();
        interfaceC37055aM81921d.mo60488c(baseTradeFragment, baseTradeFragment.getVisibleDisposable(), baseTradeFragment.m60167y5(), new Function0() { // from class: com.kubi.spot.business.k1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseTradeFragment.m60133j6(this.f50175b);
            }
        });
    }

    /* JADX INFO: renamed from: b5 */
    public static final void m60106b5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c5 */
    public static final Unit m60110c5(Throwable th2) {
        th2.printStackTrace();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d5 */
    public static final void m60114d5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g5 */
    public static final Unit m60123g5(BaseTradeFragment baseTradeFragment, Pair pair) {
        Object first = pair.getFirst();
        Intrinsics.checkNotNullExpressionValue(first, "<get-first>(...)");
        CurrencyBalance currencyBalance = (CurrencyBalance) first;
        Object second = pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "<get-second>(...)");
        CurrencyBalance currencyBalance2 = (CurrencyBalance) second;
        if (Intrinsics.areEqual(currencyBalance.getCurrency(), baseTradeFragment.mo60189N().getBaseCurrency()) && Intrinsics.areEqual(currencyBalance2.getCurrency(), baseTradeFragment.mo60189N().getQuoteCurrency())) {
            baseTradeFragment.f49730Y = currencyBalance2;
            baseTradeFragment.f49729X = currencyBalance;
            List<Fragment> fragments = baseTradeFragment.m60220x5().getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : fragments) {
                if (obj instanceof ITradeChildBehavior) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ITradeChildBehavior) it.next()).mo60292S();
            }
            List<Fragment> fragments2 = baseTradeFragment.getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments2, "getFragments(...)");
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : fragments2) {
                if (obj2 instanceof TradeOpenOrdersFragment) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : arrayList2) {
                if (((TradeOpenOrdersFragment) obj3).isAdded()) {
                    arrayList3.add(obj3);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                TradeOpenOrdersFragment.m60755u3((TradeOpenOrdersFragment) it2.next(), null, 1, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g6 */
    public static final void m60124g6(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h5 */
    public static final void m60126h5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h6 */
    public static final Unit m60127h6(Throwable th2) {
        th2.printStackTrace();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i5 */
    public static final Unit m60129i5(Throwable th2) {
        th2.printStackTrace();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i6 */
    public static final void m60130i6(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j5 */
    public static final void m60132j5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j6 */
    public static final Unit m60133j6(BaseTradeFragment baseTradeFragment) {
        baseTradeFragment.m60181J5();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D5 */
    public final void m60175D5(final NFTEntity nFTEntity) {
        C44655n0 c44655n0;
        BaseTextView baseTextView;
        ArrayList arrayList;
        C44655n0 c44655n1;
        FrameLayout frameLayout;
        C44655n0 c44655n2;
        FrameLayout frameLayout2;
        C44655n0 c44655n3;
        FrameLayout frameLayout3;
        C44655n0 c44655n4;
        BaseTextView baseTextView2;
        C44655n0 c44655n5;
        BaseTextView baseTextView3;
        C44655n0 c44655n6;
        BaseTextView baseTextView4;
        C44655n0 c44655n7;
        BaseTextView baseTextView5;
        C44655n0 c44655n8;
        BaseTextView baseTextView6;
        C44655n0 c44655n9;
        BaseTextView baseTextView7;
        C44655n0 c44655n10;
        BaseTextView baseTextView8;
        String strM92640e;
        C44655n0 c44655n11;
        BaseTextView baseTextView9;
        String strM92640e2;
        BaseTextView baseTextView10;
        C44635d0 c44635d0M60200m5 = m60200m5();
        if (c44635d0M60200m5 != null && (baseTextView10 = c44635d0M60200m5.f99038y) != null) {
            baseTextView10.setText(C27017c.f54310a.m66516f(R$string.nft_about, mo60189N().getBaseCurrencyName()));
        }
        C44635d0 c44635d0M60200m6 = m60200m5();
        if (c44635d0M60200m6 != null && (c44655n11 = c44635d0M60200m6.f99030q) != null && (baseTextView9 = c44655n11.f99263j) != null) {
            BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(nFTEntity.getCurrentTotalCirculation());
            if (bigDecimalM66536f != null) {
                strM92640e2 = C42180b.m92640e(bigDecimalM66536f, null, 0, false, false, true, 0, null, 111, null);
            } else {
                strM92640e2 = null;
            }
            baseTextView9.setText(C27041f.m66669i(strM92640e2, "--"));
        }
        C44635d0 c44635d0M60200m7 = m60200m5();
        if (c44635d0M60200m7 != null && (c44655n10 = c44635d0M60200m7.f99030q) != null && (baseTextView8 = c44655n10.f99259f) != null) {
            BigDecimal bigDecimalM66536f2 = DowngradeExKt.m66536f(nFTEntity.getInitialDistributeIssuance());
            if (bigDecimalM66536f2 != null) {
                strM92640e = C42180b.m92640e(bigDecimalM66536f2, null, 0, false, false, true, 0, null, 111, null);
            } else {
                strM92640e = null;
            }
            baseTextView8.setText(C27041f.m66669i(strM92640e, "--"));
        }
        C44635d0 c44635d0M60200m8 = m60200m5();
        if (c44635d0M60200m8 != null && (c44655n9 = c44635d0M60200m8.f99030q) != null && (baseTextView7 = c44655n9.f99265l) != null) {
            baseTextView7.setText(C42179a.m92629b(C27039d.m66652l(nFTEntity.getDistributeTime()), null, false, null, false, 15, null));
        }
        C44635d0 c44635d0M60200m9 = m60200m5();
        if (c44635d0M60200m9 != null && (c44655n8 = c44635d0M60200m9.f99030q) != null && (baseTextView6 = c44655n8.f99256c) != null) {
            baseTextView6.setText(C27041f.m66669i(nFTEntity.getPositionDisplayLink(), "--"));
        }
        C44635d0 c44635d0M60200m10 = m60200m5();
        if (c44635d0M60200m10 != null && (c44655n7 = c44635d0M60200m10.f99030q) != null && (baseTextView5 = c44655n7.f99256c) != null) {
            C27046k.m66711z(baseTextView5, 0L, new Function0() { // from class: com.kubi.spot.business.n1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseTradeFragment.m60028E5(nFTEntity);
                }
            }, 1, null);
        }
        String descText = nFTEntity.getDescText();
        if (descText != null && descText.length() != 0) {
            C44635d0 c44635d0M60200m11 = m60200m5();
            if (c44635d0M60200m11 != null && (c44655n6 = c44635d0M60200m11.f99030q) != null && (baseTextView4 = c44655n6.f99258e) != null) {
                ViewExtKt.m66594y(baseTextView4);
            }
            C44635d0 c44635d0M60200m12 = m60200m5();
            if (c44635d0M60200m12 != null && (c44655n5 = c44635d0M60200m12.f99030q) != null && (baseTextView3 = c44655n5.f99258e) != null) {
                baseTextView3.setText(nFTEntity.getDescText());
            }
        } else {
            C44635d0 c44635d0M60200m13 = m60200m5();
            if (c44635d0M60200m13 != null && (c44655n0 = c44635d0M60200m13.f99030q) != null && (baseTextView = c44655n0.f99258e) != null) {
                ViewExtKt.m66577h(baseTextView);
            }
        }
        C44635d0 c44635d0M60200m14 = m60200m5();
        if (c44635d0M60200m14 != null && (c44655n4 = c44635d0M60200m14.f99030q) != null && (baseTextView2 = c44655n4.f99261h) != null) {
            C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: com.kubi.spot.business.p1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseTradeFragment.m60031F5();
                }
            }, 1, null);
        }
        List<String> mediaUrls = nFTEntity.getMediaUrls();
        if (mediaUrls != null) {
            arrayList = new ArrayList();
            for (Object obj : mediaUrls) {
                String str = (String) obj;
                if (str != null && str.length() != 0) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            C44635d0 c44635d0M60200m15 = m60200m5();
            if (c44635d0M60200m15 != null && (c44655n3 = c44635d0M60200m15.f99030q) != null && (frameLayout3 = c44655n3.f99255b) != null) {
                ViewExtKt.m66594y(frameLayout3);
            }
            C44635d0 c44635d0M60200m16 = m60200m5();
            if (c44635d0M60200m16 != null && (c44655n2 = c44635d0M60200m16.f99030q) != null && (frameLayout2 = c44655n2.f99255b) != null) {
                C27046k.m66711z(frameLayout2, 0L, new Function0() { // from class: com.kubi.spot.business.q1
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseTradeFragment.m60034G5(nFTEntity, this);
                    }
                }, 1, null);
            }
        } else {
            C44635d0 c44635d0M60200m17 = m60200m5();
            if (c44635d0M60200m17 != null && (c44655n1 = c44635d0M60200m17.f99030q) != null && (frameLayout = c44655n1.f99255b) != null) {
                ViewExtKt.m66577h(frameLayout);
            }
        }
        if (this.f49741j0 && C27063n.m66765c("k_panel_position", 0, 1, null) != 0) {
            StorageId storageId = new StorageId(SearchCategory$Companion.SPOT, "nft_" + mo60189N().getCode(), null, false, 12, null);
            if (C46392a.m102322d(storageId, true)) {
                m60202n6(Boolean.TRUE);
                C46392a.m102328k(storageId, false);
            }
        }
    }

    /* JADX INFO: renamed from: E6 */
    public final void m60176E6(Pair<? extends BasePageEntity<DelegationEntity>, ? extends BasePageEntity<DelegationEntity>> pair) {
        Integer numValueOf;
        String str;
        CharSequence string;
        C44635d0 c44635d0M60200m5 = m60200m5();
        if (c44635d0M60200m5 != null) {
            PagerAdapter adapter = c44635d0M60200m5.f99029p.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.kubi.utils.InnerPagerAdapter");
            C27103z c27103z = (C27103z) adapter;
            if (!IUserService.a.get().c()) {
                string = getString(R$string.todo_delegation);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            } else if (pair.getFirst() == null && pair.getSecond() == null) {
                string = c27103z.m66939a().get(0);
            } else {
                BasePageEntity<DelegationEntity> first = pair.getFirst();
                Integer numValueOf2 = null;
                if (first != null) {
                    numValueOf = Integer.valueOf(first.getTotalNum());
                } else {
                    numValueOf = null;
                }
                int iM66650j = C27039d.m66650j(numValueOf);
                BasePageEntity<DelegationEntity> second = pair.getSecond();
                if (second != null) {
                    numValueOf2 = Integer.valueOf(second.getTotalNum());
                }
                int iM66650j2 = iM66650j + C27039d.m66650j(numValueOf2);
                this.f49743l0 = iM66650j2;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(getString(R$string.todo_delegation));
                if (iM66650j2 > 99) {
                    str = " (99+) ";
                } else {
                    str = " (" + iM66650j2 + ") ";
                }
                sb2.append(str);
                string = sb2.toString();
            }
            List<? extends CharSequence> mutableList = CollectionsKt.toMutableList((Collection) c27103z.m66939a());
            mutableList.set(0, string);
            c27103z.m66940b(mutableList);
            c44635d0M60200m5.f99015b.m55291w();
        }
    }

    /* JADX INFO: renamed from: F6 */
    public final Observable<SymbolPreviewEntity> m60177F6() {
        String code;
        InterfaceC37053d interfaceC37053d = (InterfaceC37053d) C42597a.m93386b().create(InterfaceC37053d.class);
        SymbolInfoEntity symbolInfoEntity = this.f49727V.getSymbolInfoEntity();
        String baseCurrency = null;
        if (symbolInfoEntity != null) {
            code = symbolInfoEntity.getCode();
        } else {
            code = null;
        }
        String strM66668h = C27041f.m66668h(code);
        SymbolInfoEntity symbolInfoEntity2 = this.f49727V.getSymbolInfoEntity();
        if (symbolInfoEntity2 != null) {
            baseCurrency = symbolInfoEntity2.getBaseCurrency();
        }
        String strM66668h2 = C27041f.m66668h(baseCurrency);
        String string = MultiLanguageManager.f46811g.getLocale().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Observable<R> observableCompose = interfaceC37053d.m82936d(strM66668h, strM66668h2, string).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.business.l1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseTradeFragment.m60035G6(this.f50180b, (SymbolPreviewEntity) obj);
            }
        };
        Observable<SymbolPreviewEntity> observableDoOnNext = observableCompose.doOnNext(new Consumer() { // from class: com.kubi.spot.business.m1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseTradeFragment.m60039H6(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
        return observableDoOnNext;
    }

    /* JADX INFO: renamed from: K6 */
    public final void m60186K6() {
        TradeModel tradeModelM60208r5 = m60208r5();
        String symbol = this.f49727V.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        Observable<ArrayList<TradeItemBean>> observableM61857m = tradeModelM60208r5.m61857m(symbol);
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.business.o1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(BaseTradeFragment.m60049L6(this.f50285b, (ArrayList) obj));
            }
        };
        Observable<ArrayList<TradeItemBean>> observableFilter = observableM61857m.filter(new Predicate() { // from class: com.kubi.spot.business.d
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return BaseTradeFragment.m60053M6(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.business.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseTradeFragment.m60057N6((ArrayList) obj);
            }
        };
        Observable<R> map = observableFilter.map(new Function() { // from class: com.kubi.spot.business.f
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BaseTradeFragment.m60061O6(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: com.kubi.spot.business.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseTradeFragment.m60065P6(this.f50152b, (TradeItemBean) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.spot.business.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseTradeFragment.m60069Q6(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.spot.business.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseTradeFragment.m60072R6(this.f50165b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = map.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.business.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseTradeFragment.m60076S6(function4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        this.f49736e0 = false;
        TradeModel tradeModelM60208r6 = m60208r5();
        String symbol2 = this.f49727V.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol2, "getSymbol(...)");
        Observable<ArrayList<SymbolInfoEntity>> observableM61858n = tradeModelM60208r6.m61858n(symbol2);
        final Function1 function5 = new Function1() { // from class: com.kubi.spot.business.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(BaseTradeFragment.m60080T6((ArrayList) obj));
            }
        };
        Observable<ArrayList<SymbolInfoEntity>> observableObserveOn = observableM61858n.filter(new Predicate() { // from class: com.kubi.spot.business.m
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return BaseTradeFragment.m60084U6(function5, obj);
            }
        }).observeOn(C42916f.m94127f());
        final Function1 function6 = new Function1() { // from class: com.kubi.spot.business.u1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseTradeFragment.m60088V6(this.f50472b, (ArrayList) obj);
            }
        };
        Observable observableObserveOn2 = observableObserveOn.flatMap(new Function() { // from class: com.kubi.spot.business.v1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BaseTradeFragment.m60092W6(function6, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        Consumer consumer2 = new Consumer() { // from class: com.kubi.spot.business.w1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseTradeFragment.m60095X6(this.f50478b, obj);
            }
        };
        final Function1 function7 = new Function1() { // from class: com.kubi.spot.business.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseTradeFragment.m60098Y6(this.f49761b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe2 = observableObserveOn2.subscribe(consumer2, new Consumer() { // from class: com.kubi.spot.business.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseTradeFragment.m60101Z6(function7, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe2, getDestroyDisposable());
    }

    /* JADX INFO: renamed from: R4 */
    public final void m60191R4() {
        Boolean boolM56221L;
        Bundle arguments = getArguments();
        if (arguments != null && (boolM56221L = RouteExKt.m56221L(arguments, "isBuy")) != null) {
            m60220x5().m61551i0(boolM56221L.booleanValue());
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.remove("isBuy");
        }
    }

    /* JADX INFO: renamed from: Z5 */
    public void m60194Z5() throws Exception {
        m60167y5().m85234g(new Action() { // from class: com.kubi.spot.business.n
            @Override // io.reactivex.functions.Action
            public final void run() {
                BaseTradeFragment.m60104a6(this.f50273b);
            }
        });
    }

    /* JADX INFO: renamed from: a7 */
    public final void m60195a7() {
        SymbolOfflineBannerView symbolOfflineBannerView;
        C44635d0 c44635d0M60200m5 = m60200m5();
        if (c44635d0M60200m5 != null && (symbolOfflineBannerView = c44635d0M60200m5.f99036w) != null) {
            final SymbolOfflineData symbolOfflineDataM22081c = SymbolsOfflineManager.f20563a.m22081c(this.f49727V.getSymbol());
            if (symbolOfflineDataM22081c != null) {
                symbolOfflineBannerView.m22060d(symbolOfflineDataM22081c);
                C27046k.m66711z(symbolOfflineBannerView, 0L, new Function0() { // from class: com.kubi.spot.business.b0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseTradeFragment.m60108b7(this.f49762b, symbolOfflineDataM22081c);
                    }
                }, 1, null);
                TradeItemBean tradeItemBean = this.f49727V;
                String symbol = tradeItemBean.getSymbol();
                Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
                String showSymbol = tradeItemBean.getShowSymbol();
                Intrinsics.checkNotNullExpressionValue(showSymbol, "getShowSymbol(...)");
                String type = TradeAccountType.ClassicSpot.INSTANCE.getType();
                String symbol2 = tradeItemBean.getSymbol();
                Intrinsics.checkNotNullExpressionValue(symbol2, "getSymbol(...)");
                SymbolOfflineUtilsExtKt.m22068d(this, symbol, showSymbol, SymbolOfflineUtilsExtKt.m22067c(type, symbol2));
                return;
            }
            symbolOfflineBannerView.m22062f();
        }
    }

    @Override // com.kubi.spot.business.ITradeBehavior
    /* JADX INFO: renamed from: m2 */
    public void mo60199m2() {
        CustomViewPager customViewPager;
        TradeModel tradeModelM60208r5 = m60208r5();
        String symbol = mo60180J().getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        Observable<BasePageEntity<DelegationEntity>> observableM61852h = tradeModelM60208r5.m61852h(symbol, false);
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.business.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseTradeFragment.m60074S4(this.f50283b, (BasePageEntity) obj);
            }
        };
        Consumer<? super BasePageEntity<DelegationEntity>> consumer = new Consumer() { // from class: com.kubi.spot.business.r
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseTradeFragment.m60078T4(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.business.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseTradeFragment.m60082U4((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableM61852h.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.business.t
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseTradeFragment.m60086V4(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        Observable<Pair<BasePageEntity<DelegationEntity>, BasePageEntity<DelegationEntity>>> observableM61851e = m60208r5().m61851e();
        final Function1 function3 = new Function1() { // from class: com.kubi.spot.business.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseTradeFragment.m60090W4(this.f50471b, (Pair) obj);
            }
        };
        Consumer<? super Pair<BasePageEntity<DelegationEntity>, BasePageEntity<DelegationEntity>>> consumer2 = new Consumer() { // from class: com.kubi.spot.business.v
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseTradeFragment.m60094X4(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.spot.business.x
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseTradeFragment.m60097Y4((Throwable) obj);
            }
        };
        Disposable disposableSubscribe2 = observableM61851e.subscribe(consumer2, new Consumer() { // from class: com.kubi.spot.business.y
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseTradeFragment.m60100Z4(function4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe2, getDestroyDisposable());
        Observable<BasePageEntity<DelegationEntity>> observableM61853i = m60208r5().m61853i();
        final Function1 function5 = new Function1() { // from class: com.kubi.spot.business.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseTradeFragment.m60103a5(this.f50489b, (BasePageEntity) obj);
            }
        };
        Consumer<? super BasePageEntity<DelegationEntity>> consumer3 = new Consumer() { // from class: com.kubi.spot.business.a0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseTradeFragment.m60106b5(function5, obj);
            }
        };
        final Function1 function6 = new Function1() { // from class: com.kubi.spot.business.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseTradeFragment.m60110c5((Throwable) obj);
            }
        };
        Disposable disposableSubscribe3 = observableM61853i.subscribe(consumer3, new Consumer() { // from class: com.kubi.spot.business.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseTradeFragment.m60114d5(function6, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe3, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe3, getDestroyDisposable());
        C44635d0 c44635d0M60200m5 = m60200m5();
        if (c44635d0M60200m5 != null && (customViewPager = c44635d0M60200m5.f99029p) != null && customViewPager.getCurrentItem() == 0) {
            List<Fragment> fragments = getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : fragments) {
                if (obj instanceof TradeOpenOrdersFragment) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((TradeOpenOrdersFragment) obj2).isAdded()) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((TradeOpenOrdersFragment) it.next()).m60762v3();
            }
        }
    }

    @Override // com.kubi.spot.business.ITradeBehavior
    @NotNull
    /* JADX INFO: renamed from: o0 */
    public TradeModel mo60203o0() {
        return m60208r5();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String strM102326h = C46392a.m102326h(C38519a.f86479a.m87132g(), "");
        if (TextUtils.isEmpty(strM102326h)) {
            strM102326h = "BTC-" + C38184b.f85884a.m86147b();
        }
        this.f49727V = new TradeItemBean(strM102326h);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onHide() {
        if (getView() == null) {
            return;
        }
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof DialogFragment) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((DialogFragment) it.next()).dismissAllowingStateLoss();
        }
        m60167y5().m85236i(false);
        C43841b.m96555b("B5trading", null, 2, null);
        DurationTrackerHelper.f49784a.m60348a();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        C44635d0 c44635d0M60200m5 = m60200m5();
        if (c44635d0M60200m5 != null && (kuCoinRefreshLayout = c44635d0M60200m5.f99032s) != null) {
            kuCoinRefreshLayout.autoRefresh();
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() throws Exception {
        HoldingEarnEntryCardView holdingEarnEntryCardView;
        m60187L4();
        m60186K6();
        m60191R4();
        mo22379g(true);
        m60195a7();
        C44635d0 c44635d0M60200m5 = m60200m5();
        if (c44635d0M60200m5 != null && (holdingEarnEntryCardView = c44635d0M60200m5.f99024k) != null) {
            holdingEarnEntryCardView.m54529g();
        }
        m60193Y5();
    }

    /* JADX INFO: renamed from: p6 */
    public final void m60206p6() {
        SymbolBarLayout symbolBarLayout;
        C46148j f20881c;
        SpotTradeRiskTipView spotTradeRiskTipView;
        C44635d0 c44635d0M60200m5 = m60200m5();
        if (c44635d0M60200m5 != null && (spotTradeRiskTipView = c44635d0M60200m5.f99033t) != null) {
            ViewExtKt.m66577h(spotTradeRiskTipView);
        }
        C44635d0 c44635d0M60200m6 = m60200m5();
        if (c44635d0M60200m6 != null && (symbolBarLayout = c44635d0M60200m6.f99035v) != null && (f20881c = symbolBarLayout.getF20881c()) != null) {
            f20881c.m101741y(false);
        }
    }

    /* JADX INFO: renamed from: r6 */
    public void m60209r6() {
        ViewGroup.LayoutParams layoutParams;
        CoordinatorLayout.LayoutParams layoutParams2;
        CoordinatorLayout.Behavior behavior;
        AppBarLayout appBarLayout;
        C44635d0 c44635d0M60200m5 = m60200m5();
        AppBarLayout.Behavior behavior2 = null;
        if (c44635d0M60200m5 != null && (appBarLayout = c44635d0M60200m5.f99017d) != null) {
            layoutParams = appBarLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
        } else {
            layoutParams2 = null;
        }
        if (layoutParams2 != null) {
            behavior = layoutParams2.getBehavior();
        } else {
            behavior = null;
        }
        if (behavior instanceof AppBarLayout.Behavior) {
            behavior2 = (AppBarLayout.Behavior) behavior;
        }
        if (behavior2 != null) {
            behavior2.setTopAndBottomOffset(0);
        }
    }

    /* JADX INFO: renamed from: u6 */
    public final void m60215u6() {
        SymbolBarLayout symbolBarLayout;
        C46148j f20881c;
        C44635d0 c44635d0M60200m5 = m60200m5();
        if (c44635d0M60200m5 != null && (symbolBarLayout = c44635d0M60200m5.f99035v) != null && (f20881c = symbolBarLayout.getF20881c()) != null) {
            String symbol = this.f49727V.getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
            C46148j.m101729s(f20881c, symbol, this.f49727V.getChangeRate(), false, 4, null);
        }
        mo60213t6(true, this.f49727V.getChangeRate());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z5 */
    public final void m60222z5() {
        Fragment parentFragment;
        if (isShowing()) {
            this.f49741j0 = !this.f49741j0;
            InterfaceC46302c interfaceC46302c = null;
            LinearLayout linearLayout = null;
            int iM66765c = C27063n.m66765c("k_panel_position", 0, 1, null);
            C44635d0 c44635d0M60200m5 = m60200m5();
            if (c44635d0M60200m5 != null) {
                if (iM66765c == 0) {
                    FrameLayout frameLayout = c44635d0M60200m5.f99027n;
                    if (this.f49742k0) {
                        linearLayout = c44635d0M60200m5.f99031r;
                    }
                    m60198l6(this, frameLayout, linearLayout, null, true);
                    return;
                }
                Fragment parentFragment2 = getParentFragment();
                if (parentFragment2 instanceof InterfaceC46302c) {
                    interfaceC46302c = (InterfaceC46302c) parentFragment2;
                }
                if (interfaceC46302c != null && (parentFragment = getParentFragment()) != null) {
                    m60198l6(parentFragment, interfaceC46302c.mo63561l1(), interfaceC46302c.mo63550M2(), null, true);
                }
            }
        }
    }

    @Override // com.kubi.spot.business.ITradeBehavior
    @NotNull
    /* JADX INFO: renamed from: H */
    public BaseFragment mo60178H() {
        return this;
    }

    /* JADX INFO: renamed from: J6 */
    public void mo60182J6() {
    }

    /* JADX INFO: renamed from: K5 */
    public void mo60185K5() {
    }

    /* JADX INFO: renamed from: t6 */
    public void mo60213t6(boolean z11, @Nullable Double d11) {
    }
}
