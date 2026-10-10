package com.kubi.kumex.market.p091v2;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewpager.widget.ViewPager;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.futures.trade.position.KlinePositionPushManager;
import com.kubi.futures.trade.submit.panel.premarket.g;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.constant.KlineLowLiquidityState;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.RobotSiteConfigEntity;
import com.kubi.kumex.data.platform.model.SymbolConfig;
import com.kubi.kumex.helper.C16108t;
import com.kubi.kumex.market.p091v2.coinInfo.KuMexMarketCoinInfoFragment;
import com.kubi.kumex.market.p091v2.viewModel.MarketCoinInfoUiStatus;
import com.kubi.kumex.market.p091v2.viewModel.MarketInfoViewModel;
import com.kubi.kumex.market.p091v2.viewModel.UsStockMarketStatus;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.kumex.trade.ToggleSymbolDialogFragment;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.p110rn.p111ui.KCBridgeRejecterError;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.quotefacade.entity.CurrencyFilterTransferData;
import com.kubi.quotefacade.entity.MarketListEntityItem;
import com.kubi.quotefacade.entity.SymbolData;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.FragmentResultListener;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.flutter.KCFlutterRouteManager;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.SnapshotHelper;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.share.api.IShareService;
import com.kubi.share.api.ImageShareParam;
import com.kubi.user.api.IUserService;
import com.kubi.user.config.a;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27032f;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.data.entity.ClickCardReport;
import dm.C36744c4;
import dm.C36786j4;
import dm.C36856v2;
import f00.C37304a;
import fm.C37570e;
import g00.InterfaceC37754f;
import g00.InterfaceC37756h;
import g00.InterfaceC37762n;
import g00.InterfaceC37766r;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mr.C42597a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p212dv.C36976p;
import p212dv.InterfaceC36975o;
import p236em.C37214b;
import p429lf.C42180b;
import p569qq.C43846g;
import p569qq.C43852m;
import p569qq.InterfaceC43850k;
import p607rv.C44183g;
import p729wl.C45875l0;
import p801yl.C46527h0;
import p830zf.InterfaceC46826v;
import p836zl.C46894j;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import th.InterfaceC44974a;
import th.InterfaceC44980d;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: KuMexMarketInfoFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b!\b\u0007\u0018\u0000 }2\u00020\u00012\u00020\u0002:\u0001}B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\u001a\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u0002072\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010A\u001a\u00020?H\u0016J\b\u0010B\u001a\u00020?H\u0016J\b\u0010C\u001a\u00020?H\u0002J\b\u0010D\u001a\u00020?H\u0002J\b\u0010E\u001a\u00020?H\u0002J\u0010\u0010F\u001a\u00020?2\u0006\u0010G\u001a\u00020\fH\u0002J\u0010\u0010H\u001a\u00020?2\u0006\u0010G\u001a\u00020\fH\u0002J\b\u0010I\u001a\u00020?H\u0002J\b\u0010J\u001a\u00020?H\u0002J\b\u0010K\u001a\u00020?H\u0002J\b\u0010L\u001a\u00020?H\u0002J\u0012\u0010M\u001a\u00020?2\b\b\u0002\u0010N\u001a\u00020\u001cH\u0002J\b\u0010O\u001a\u00020?H\u0002J\b\u0010P\u001a\u00020?H\u0002J\b\u0010Q\u001a\u00020?H\u0002J\b\u0010R\u001a\u00020?H\u0002J\f\u0010S\u001a\u00020?*\u00020TH\u0002J\u0010\u0010U\u001a\u00020?2\u0006\u0010V\u001a\u00020\u001cH\u0002J\u0010\u0010W\u001a\u00020?2\u0006\u0010X\u001a\u00020\u001cH\u0002J\b\u0010Y\u001a\u00020\u0001H\u0002J\b\u0010Z\u001a\u00020?H\u0002J\b\u0010[\u001a\u00020\u001cH\u0002J\b\u0010\\\u001a\u00020]H\u0002J\b\u0010^\u001a\u00020\u001cH\u0002J\b\u0010_\u001a\u00020]H\u0002J\b\u0010a\u001a\u00020\fH\u0002J\b\u0010b\u001a\u00020?H\u0002J\b\u0010c\u001a\u00020?H\u0002J\b\u0010d\u001a\u00020?H\u0002J\u0010\u0010e\u001a\u00020?2\u0006\u0010G\u001a\u00020\fH\u0002J\u0010\u0010f\u001a\u00020?2\u0006\u0010G\u001a\u00020\fH\u0002J\b\u0010g\u001a\u00020?H\u0002J\b\u0010h\u001a\u00020?H\u0002J\u0010\u0010i\u001a\u00020?2\u0006\u0010j\u001a\u000205H\u0002J\b\u0010k\u001a\u00020?H\u0002J\b\u0010l\u001a\u00020?H\u0002J\b\u0010m\u001a\u00020?H\u0002J\b\u0010n\u001a\u00020?H\u0002J\b\u0010o\u001a\u00020\u001cH\u0002J\b\u0010p\u001a\u00020\fH\u0002J\n\u0010q\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010r\u001a\u00020?2\u0006\u0010G\u001a\u00020\fH\u0002J\u0010\u0010s\u001a\u00020?2\u0006\u0010G\u001a\u00020\fH\u0002J\b\u0010t\u001a\u00020?H\u0002J\u001c\u0010u\u001a\u00020?2\u0006\u0010v\u001a\u00020\u001c2\n\b\u0002\u0010w\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010x\u001a\u00020?2\u0006\u0010v\u001a\u00020\u001cH\u0002J\f\u0010y\u001a\u00020?*\u00020\u0006H\u0002J\f\u0010z\u001a\u00020?*\u00020\u0006H\u0002J\b\u0010{\u001a\u00020\u001cH\u0016J\b\u0010|\u001a\u00020?H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\"\u001a\n $*\u0004\u0018\u00010#0#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0012\u001a\u0004\b%\u0010&R\u000e\u0010(\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u000205X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006~"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/KuMexMarketInfoFragment;", "Lcom/kubi/sdk/BaseFragment;", "Lcom/kubi/quotefacade/event/IKlineCoinInfoTabProvider;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexFragmentMarketInfoBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentMarketInfoBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "symbol", "", "marketInfoViewModel", "Lcom/kubi/kumex/market/v2/viewModel/MarketInfoViewModel;", "getMarketInfoViewModel", "()Lcom/kubi/kumex/market/v2/viewModel/MarketInfoViewModel;", "marketInfoViewModel$delegate", "Lkotlin/Lazy;", "observeSymbolConfigDisposable", "Lio/reactivex/disposables/Disposable;", "titles", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "adapter", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "aiFeedOpen", "", "isShowKline", "isShowAiIcon", "isAlarm", "lottieAiView", "Lcom/airbnb/lottie/LottieAnimationView;", "platformApi", "Lcom/kubi/futures/data/platform/IPlatformApi;", "kotlin.jvm.PlatformType", "getPlatformApi", "()Lcom/kubi/futures/data/platform/IPlatformApi;", "platformApi$delegate", "showShare", "showAlert", "bottomSheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "submitBottomSheetFragment", "Lcom/kubi/kumex/market/v2/KuMexSubmitBottomSheetFragment;", "pendingQuickOrderPrice", "headerFullNameCrypto", "headerLastPrice", "headerLast24HourRate", "headerPriceIsUp", "isHeaderMarketSummaryVisible", "headerScrollY", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "observeCoinInfo", "initObserver", "bindFlowEvent", "refreshPageInfo", "curSymbol", "refreshLowLiquidityPolling", "initBottomOperation", "initBottomSheet", "showBottomSheet", "hideBottomSheet", "destroyBottomSheetFragmentIfNeeded", "needHideBottomSheet", "initBottomSheetFragment", "showBottomSheetFragment", "hideBottomSheetFragment", "initHeader", "disableNavigationAmin", "Landroid/app/Activity;", "updateFavStyle", "isAddedFav", "updateAlertStyle", "hasAlarm", "getKlineFragment", "bindAdapter", "isContractInfoTabVisible", "getContractInfoFragment", "Landroidx/fragment/app/Fragment;", "isRnContractInfoEnabled", "getRnContractInfoFragment", "maxSlidePx", "getBaseCurrency", "initShareByFlavor", "initAlertByRemoteConfig", "handleShareImage", "initFavObserve", "updateHeaderSymbolText", "resetHeaderSubTitleState", "applyHeaderSubTitleState", "applyLegacyHeaderPriceState", "scrollY", "updateHeaderSubTitleText", "updateHeaderFullNameCryptoText", "updateHeaderMarketSummaryText", "updateHeaderPriceText", "hasHeaderFullNameCrypto", "buildHeaderMarketSummaryText", "formatHeaderLast24HourRate", "updatePreMarketInfo", "updateAiFlagInfo", "notifyKlineLowLiquidityStateIfNeeded", "notifyKlineLowLiquidityState", "isLowLiquidityPeriod", "marketSession", "updateLowLiquidityLabelVisibility", "hideHeaderInfoWhenShare", "showHeaderInfoAfterShare", "containsCoinInfoTab", "onDestroyView", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKuMexMarketInfoFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuMexMarketInfoFragment.kt\ncom/kubi/kumex/market/v2/KuMexMarketInfoFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 5 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 6 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 7 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 8 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 9 KVStore.kt\ncom/kubi/utils/storage/KVStore\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 11 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 12 ViewExt.kt\ncom/kubi/utils/extensions/core/ViewExtKt\n+ 13 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1281:1\n147#2,16:1282\n106#3,15:1298\n35#4,4:1313\n39#4:1319\n35#4,4:1320\n39#4:1326\n35#4,4:1401\n39#4:1407\n44#5,2:1317\n44#5,2:1324\n44#5,2:1405\n153#6,7:1327\n76#6,7:1334\n76#6,7:1341\n76#6,7:1348\n76#6,7:1355\n153#6,7:1362\n153#6,7:1369\n76#6,7:1387\n76#6,7:1394\n25#7,2:1376\n27#7:1381\n153#8,2:1378\n178#9:1380\n1#10:1382\n37#11:1383\n36#11,3:1384\n37#11:1415\n36#11,3:1416\n372#12:1408\n1549#13:1409\n1620#13,3:1410\n1869#13,2:1413\n*S KotlinDebug\n*F\n+ 1 KuMexMarketInfoFragment.kt\ncom/kubi/kumex/market/v2/KuMexMarketInfoFragment\n*L\n150#1:1282,16\n157#1:1298,15\n175#1:1313,4\n175#1:1319\n180#1:1320,4\n180#1:1326\n905#1:1401,4\n905#1:1407\n175#1:1317,2\n180#1:1324,2\n905#1:1405,2\n325#1:1327,7\n331#1:1334,7\n341#1:1341,7\n355#1:1348,7\n370#1:1355,7\n378#1:1362,7\n385#1:1369,7\n832#1:1387,7\n874#1:1394,7\n437#1:1376,2\n437#1:1381\n441#1:1378,2\n441#1:1380\n815#1:1383\n815#1:1384,3\n273#1:1415\n273#1:1416,3\n1235#1:1408\n1235#1:1409\n1235#1:1410,3\n1235#1:1413,2\n*E\n"})
@InterfaceC43850k(pageId = "primary_page_k_contract")
public final class KuMexMarketInfoFragment extends BaseFragment implements InterfaceC36975o {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f29631U = C45681e.m100799e(this, new Function1<KuMexMarketInfoFragment, C36856v2>() { // from class: com.kubi.kumex.market.v2.KuMexMarketInfoFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36856v2 invoke(@NotNull KuMexMarketInfoFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36856v2.m82577a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36856v2, Unit>() { // from class: com.kubi.kumex.market.v2.KuMexMarketInfoFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36856v2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36856v2 c36856v2) {
            invoke(c36856v2);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    public String f29632V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f29633W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public Disposable f29634X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final ArrayList<CharSequence> f29635Y;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public FragmentStatePagerAdapter f29636Z;

    /* JADX INFO: renamed from: a0 */
    public final boolean f29637a0;

    /* JADX INFO: renamed from: b0 */
    public final boolean f29638b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f29639c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f29640d0;

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public LottieAnimationView f29641e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final Lazy f29642f0;

    /* JADX INFO: renamed from: g0 */
    public final boolean f29643g0;

    /* JADX INFO: renamed from: h0 */
    public final boolean f29644h0;

    /* JADX INFO: renamed from: i0 */
    @Nullable
    public BottomSheetBehavior<?> f29645i0;

    /* JADX INFO: renamed from: j0 */
    @Nullable
    public KuMexSubmitBottomSheetFragment f29646j0;

    /* JADX INFO: renamed from: k0 */
    @Nullable
    public String f29647k0;

    /* JADX INFO: renamed from: l0 */
    @Nullable
    public String f29648l0;

    /* JADX INFO: renamed from: m0 */
    @Nullable
    public String f29649m0;

    /* JADX INFO: renamed from: n0 */
    @Nullable
    public String f29650n0;

    /* JADX INFO: renamed from: o0 */
    public boolean f29651o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f29652p0;

    /* JADX INFO: renamed from: q0 */
    public float f29653q0;

    /* JADX INFO: renamed from: r0 */
    public final float f29654r0;

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ KProperty<Object>[] f29630t0 = {Reflection.property1(new PropertyReference1Impl(KuMexMarketInfoFragment.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexFragmentMarketInfoBinding;", 0))};

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public static final Companion f29629s0 = new Companion(null);

    /* JADX INFO: compiled from: KuMexMarketInfoFragment.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/KuMexMarketInfoFragment$Companion;", "", "<init>", "()V", "KEY_KUMEX_MARKET_INFO_SYMBOL_CHANGED", "", "KEY_INIT_QUICK_ORDER_PRICE", "CONFIG_KEY_RN_MIGRATION_CONTRACT_INFO_ENABLED", "RN_CONTRACT_INFO_BIZ", "RN_CONTRACT_INFO_ENTRY", "RN_CONTRACT_INFO_COMPONENT", "RN_CONTRACT_INFO_ROUTE_TRADING_RULES", "instance", "Lcom/kubi/kumex/market/v2/KuMexMarketInfoFragment;", "args", "Landroid/os/Bundle;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final KuMexMarketInfoFragment instance(@Nullable Bundle args) {
            KuMexMarketInfoFragment kuMexMarketInfoFragment = new KuMexMarketInfoFragment();
            kuMexMarketInfoFragment.setArguments(args);
            return kuMexMarketInfoFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.KuMexMarketInfoFragment$a */
    /* JADX INFO: compiled from: KuMexMarketInfoFragment.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/kumex/market/v2/KuMexMarketInfoFragment$bindAdapter$2", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "getItem", "Landroidx/fragment/app/Fragment;", ViewProps.POSITION, "", "getCount", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16323a extends FragmentStatePagerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<Fragment> f29655a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16323a(List<Fragment> list, FragmentManager fragmentManager) {
            super(fragmentManager, 1);
            this.f29655a = list;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.f29655a.size();
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        public Fragment getItem(int position) {
            return this.f29655a.get(position);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.KuMexMarketInfoFragment$b */
    /* JADX INFO: compiled from: KuMexMarketInfoFragment.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\f"}, m90084d2 = {"com/kubi/kumex/market/v2/KuMexMarketInfoFragment$bindAdapter$4", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrolled", "", ViewProps.POSITION, "", "positionOffset", "", "positionOffsetPixels", "onPageScrollStateChanged", "state", "onPageSelected", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16324b implements ViewPager.OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            if (position == 1 && KuMexMarketInfoFragment.this.f29637a0) {
                C43852m.m96590b("B6FuturesCandle", "FeedTab", "1", TuplesKt.m90091to(FirebaseAnalytics.Param.CURRENCY, KuMexMarketInfoFragment.this.m34837t4()));
            }
        }

        public C16324b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int state) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.KuMexMarketInfoFragment$c */
    /* JADX INFO: compiled from: KuMexMarketInfoFragment.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class RunnableC16334c implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CustomViewPager f29657b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f29658c;

        public RunnableC16334c(CustomViewPager customViewPager, int i11) {
            this.f29657b = customViewPager;
            this.f29658c = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f29657b.setCurrentItem(this.f29658c, true);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.KuMexMarketInfoFragment$d */
    /* JADX INFO: compiled from: KuMexMarketInfoFragment.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class RunnableC16335d implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CustomViewPager f29659b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f29660c;

        public RunnableC16335d(CustomViewPager customViewPager, int i11) {
            this.f29659b = customViewPager;
            this.f29660c = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f29659b.setCurrentItem(this.f29660c, true);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.KuMexMarketInfoFragment$e */
    /* JADX INFO: compiled from: KuMexMarketInfoFragment.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/kumex/market/v2/KuMexMarketInfoFragment$initBottomSheet$1$1", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "onStateChanged", "", "bottomSheet", "Landroid/view/View;", "newState", "", "onSlide", "slideOffset", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16336e extends BottomSheetBehavior.BottomSheetCallback {
        public C16336e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View bottomSheet, float slideOffset) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View bottomSheet, int newState) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            C44128b.m97266j("zht onStateChanged", String.valueOf(newState));
            if (newState == 3) {
                KuMexMarketInfoFragment.this.m34876u5();
            } else if (newState == 4) {
                KuMexMarketInfoFragment.this.m34868p4(false);
            } else {
                if (newState != 5) {
                    return;
                }
                KuMexMarketInfoFragment.this.m34868p4(false);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.KuMexMarketInfoFragment$f */
    /* JADX INFO: compiled from: KuMexMarketInfoFragment.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/kumex/market/v2/KuMexMarketInfoFragment$initObserver$2", "Lcom/kubi/sdk/FragmentResultListener;", "onFragmentResult", "", DbParams.KEY_CHANNEL_RESULT, "Landroid/os/Bundle;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16337f implements FragmentResultListener {
        public C16337f() {
        }

        @Override // com.kubi.sdk.FragmentResultListener
        /* JADX INFO: renamed from: a */
        public void mo26171a(Bundle result) {
            Intrinsics.checkNotNullParameter(result, "result");
            KuMexMarketInfoFragment.m34833q4(KuMexMarketInfoFragment.this, false, 1, null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.KuMexMarketInfoFragment$g */
    /* JADX INFO: compiled from: KuMexMarketInfoFragment.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/kumex/market/v2/KuMexMarketInfoFragment$initObserver$3", "Lcom/kubi/sdk/FragmentResultListener;", "onFragmentResult", "", DbParams.KEY_CHANNEL_RESULT, "Landroid/os/Bundle;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16338g implements FragmentResultListener {
        public C16338g() {
        }

        @Override // com.kubi.sdk.FragmentResultListener
        /* JADX INFO: renamed from: a */
        public void mo26171a(Bundle result) {
            Intrinsics.checkNotNullParameter(result, "result");
            KuMexMarketInfoFragment.m34833q4(KuMexMarketInfoFragment.this, false, 1, null);
            FragmentActivity activity = KuMexMarketInfoFragment.this.getActivity();
            if (activity != null) {
                activity.finish();
            }
            FragmentActivity activity2 = KuMexMarketInfoFragment.this.getActivity();
            if (activity2 != null) {
                KuMexMarketInfoFragment.this.m34870r4(activity2);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.KuMexMarketInfoFragment$h */
    /* JADX INFO: compiled from: KuMexMarketInfoFragment.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/kumex/market/v2/KuMexMarketInfoFragment$initObserver$4", "Lcom/kubi/sdk/FragmentResultListener;", "onFragmentResult", "", DbParams.KEY_CHANNEL_RESULT, "Landroid/os/Bundle;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16339h implements FragmentResultListener {
        public C16339h() {
        }

        @Override // com.kubi.sdk.FragmentResultListener
        /* JADX INFO: renamed from: a */
        public void mo26171a(Bundle result) {
            Intrinsics.checkNotNullParameter(result, "result");
            String str = KuMexMarketInfoFragment.this.f29632V;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("symbol");
                str = null;
            }
            String strM56285z = RouteExKt.m56285z(result, "symbol", str);
            String str2 = KuMexMarketInfoFragment.this.f29632V;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("symbol");
                str2 = null;
            }
            if (!Intrinsics.areEqual(strM56285z, str2)) {
                KuMexMarketInfoFragment.m34833q4(KuMexMarketInfoFragment.this, false, 1, null);
                KuMexMarketInfoFragment kuMexMarketInfoFragment = KuMexMarketInfoFragment.this;
                Intrinsics.checkNotNull(strM56285z);
                kuMexMarketInfoFragment.m34871r5(strM56285z);
            }
            Fragment fragmentFindFragmentByTag = KuMexMarketInfoFragment.this.getChildFragmentManager().findFragmentByTag("showToggleSymbol");
            DialogFragment dialogFragment = fragmentFindFragmentByTag instanceof DialogFragment ? (DialogFragment) fragmentFindFragmentByTag : null;
            if (dialogFragment != null) {
                dialogFragment.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.KuMexMarketInfoFragment$i */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C16340i extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.KuMexMarketInfoFragment$j */
    /* JADX INFO: compiled from: KuMexMarketInfoFragment.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/kumex/market/v2/KuMexMarketInfoFragment$observeCoinInfo$1$2", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "getItem", "Landroidx/fragment/app/Fragment;", ViewProps.POSITION, "", "getCount", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16341j extends FragmentStatePagerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<Fragment> f29665a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16341j(List<Fragment> list, FragmentManager fragmentManager) {
            super(fragmentManager, 1);
            this.f29665a = list;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.f29665a.size();
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        public Fragment getItem(int position) {
            return this.f29665a.get(position);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.KuMexMarketInfoFragment$k */
    /* JADX INFO: compiled from: KuMexMarketInfoFragment.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16342k implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f29666b;

        public C16342k(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f29666b = function;
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
            return this.f29666b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f29666b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.KuMexMarketInfoFragment$l */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C16343l extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.KuMexMarketInfoFragment$m */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C16344m extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: Q4 */
    public static final boolean m34783Q4(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: Y4 */
    public static final Unit m34797Y4(KuMexMarketInfoFragment kuMexMarketInfoFragment, CurrencyFilterTransferData currencyFilterTransferData, KCBridgeRejecterError kCBridgeRejecterError) {
        SymbolData data;
        String symbolCode;
        SymbolData data2;
        String symbolCode2;
        Long longOrNull;
        String level1 = currencyFilterTransferData != null ? currencyFilterTransferData.getLevel1() : null;
        if (level1 != null) {
            switch (level1.hashCode()) {
                case -1263170109:
                    if (level1.equals(ClickCardReport.ReportData.CARD_TYPE_FUTURE) && (data = currencyFilterTransferData.getData()) != null && (symbolCode = data.getSymbolCode()) != null) {
                        m34833q4(kuMexMarketInfoFragment, false, 1, null);
                        kuMexMarketInfoFragment.m34871r5(symbolCode);
                        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), symbolCode, false, 2, null);
                        IReactNativeService.INSTANCE.get().nativeNotifyRn("CoinInfoSymbolChanged", MapsKt.hashMapOf(TuplesKt.m90091to("sourceType", ClickCardReport.ReportData.CARD_TYPE_FUTURE), TuplesKt.m90091to("symbol", symbolCode), TuplesKt.m90091to(TtmlNode.RUBY_BASE, contractEntityM99529O != null ? contractEntityM99529O.getSpotCurrency() : null), TuplesKt.m90091to("quote", contractEntityM99529O != null ? contractEntityM99529O.getQuoteCurrency() : null)));
                    }
                    break;
                case -1081309778:
                    if (level1.equals(ViewProps.MARGIN)) {
                        C37304a c37304a = C37304a.f82764a;
                        SymbolData data3 = currencyFilterTransferData.getData();
                        String str = Intrinsics.areEqual(data3 != null ? data3.getLeverage() : null, "isolated") ? "isolated" : "cross";
                        SymbolData data4 = currencyFilterTransferData.getData();
                        InterfaceC37756h.a.m85145c(c37304a, str, data4 != null ? data4.getSymbolCode() : null, null, null, null, null, 60, null);
                        FragmentActivity activity = kuMexMarketInfoFragment.getActivity();
                        if (activity != null) {
                            activity.finish();
                        }
                        FragmentActivity activity2 = kuMexMarketInfoFragment.getActivity();
                        if (activity2 != null) {
                            kuMexMarketInfoFragment.m34870r4(activity2);
                        }
                    }
                    break;
                case 3537154:
                    if (level1.equals(SearchCategory$Companion.SPOT)) {
                        C37304a c37304a2 = C37304a.f82764a;
                        SymbolData data5 = currencyFilterTransferData.getData();
                        InterfaceC37762n.a.m85177a(c37304a2, data5 != null ? data5.getSymbolCode() : null, null, null, null, 14, null);
                        FragmentActivity activity3 = kuMexMarketInfoFragment.getActivity();
                        if (activity3 != null) {
                            activity3.finish();
                        }
                        FragmentActivity activity4 = kuMexMarketInfoFragment.getActivity();
                        if (activity4 != null) {
                            kuMexMarketInfoFragment.m34870r4(activity4);
                        }
                    }
                    break;
                case 92909918:
                    if (level1.equals("alpha")) {
                        if (currencyFilterTransferData != null && (data2 = currencyFilterTransferData.getData()) != null && (symbolCode2 = data2.getSymbolCode()) != null && (longOrNull = StringsKt.toLongOrNull(symbolCode2)) != null) {
                            long jLongValue = longOrNull.longValue();
                            KCFlutterRouteManager.m56839j(KCFlutterRouteManager.f46704a, "market/alphaKline?tokenBridgeId=" + jLongValue, false, null, 6, null);
                        }
                        FragmentActivity activity5 = kuMexMarketInfoFragment.getActivity();
                        if (activity5 != null) {
                            activity5.finish();
                        }
                        FragmentActivity activity6 = kuMexMarketInfoFragment.getActivity();
                        if (activity6 != null) {
                            kuMexMarketInfoFragment.m34870r4(activity6);
                        }
                    }
                    break;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q4 */
    public static /* synthetic */ void m34833q4(KuMexMarketInfoFragment kuMexMarketInfoFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        kuMexMarketInfoFragment.m34868p4(z11);
    }

    /* JADX INFO: renamed from: x5 */
    public static final Unit m34843x5(KuMexMarketInfoFragment kuMexMarketInfoFragment, C36856v2 c36856v2, BaseEntity baseEntity) {
        String lastPrice;
        String last24HourRate;
        BigDecimal bigDecimalOrNull;
        String str = null;
        MarketListEntityItem marketListEntityItem = baseEntity != null ? (MarketListEntityItem) baseEntity.getData() : null;
        kuMexMarketInfoFragment.f29648l0 = marketListEntityItem != null ? marketListEntityItem.getFullNameCrypto() : null;
        if (marketListEntityItem == null || (lastPrice = marketListEntityItem.getLastPrice()) == null) {
            lastPrice = kuMexMarketInfoFragment.f29649m0;
        }
        kuMexMarketInfoFragment.f29649m0 = lastPrice;
        kuMexMarketInfoFragment.f29650n0 = marketListEntityItem != null ? marketListEntityItem.getLast24HourRate() : null;
        if (marketListEntityItem != null && (last24HourRate = marketListEntityItem.getLast24HourRate()) != null && (bigDecimalOrNull = StringsKt.toBigDecimalOrNull(last24HourRate)) != null) {
            kuMexMarketInfoFragment.f29651o0 = bigDecimalOrNull.signum() >= 0;
        }
        kuMexMarketInfoFragment.m34821l4();
        List<String> futuresMarks = marketListEntityItem != null ? marketListEntityItem.getFuturesMarks() : null;
        kuMexMarketInfoFragment.f29639c0 = (futuresMarks == null || futuresMarks.isEmpty() || !futuresMarks.contains("Ai_Crypto_Insights")) ? false : true;
        boolean zM66566d = C27025c.m66566d(futuresMarks != null ? Boolean.valueOf(futuresMarks.contains("Price_Alarm")) : null);
        kuMexMarketInfoFragment.f29640d0 = zM66566d;
        kuMexMarketInfoFragment.m34849B5(zM66566d);
        LottieAnimationView lottieAnimationView = c36856v2.f81239g.f79826h;
        kuMexMarketInfoFragment.f29641e0 = lottieAnimationView;
        if (kuMexMarketInfoFragment.f29639c0) {
            if (lottieAnimationView != null && lottieAnimationView.getAnimation() == null) {
                lottieAnimationView.setAnimation("ai-belle.json");
                lottieAnimationView.setRepeatCount(-1);
                lottieAnimationView.playAnimation();
            }
            String str2 = kuMexMarketInfoFragment.f29632V;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("symbol");
            } else {
                str = str2;
            }
            C43852m.m96594f("B6FuturesCandle", "AIInsights", "1", TuplesKt.m90091to("trade_pair", str));
            LottieAnimationView lottieAnimationView2 = kuMexMarketInfoFragment.f29641e0;
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.setVisibility(0);
            }
        } else {
            if (lottieAnimationView != null) {
                lottieAnimationView.cancelAnimation();
            }
            LottieAnimationView lottieAnimationView3 = kuMexMarketInfoFragment.f29641e0;
            if (lottieAnimationView3 != null) {
                lottieAnimationView3.setVisibility(8);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s5 */
    public final void m34873s5() {
        this.f29648l0 = null;
        this.f29649m0 = null;
        this.f29650n0 = null;
        this.f29651o0 = true;
        this.f29652p0 = false;
        this.f29653q0 = 0.0f;
        m34821l4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KuMexMarketInfoFragment() {
        Object objM20457a;
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.kumex.market.v2.KuMexMarketInfoFragment$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }

            {
                super(0);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.kumex.market.v2.KuMexMarketInfoFragment$special$$inlined$viewModels$default$2
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
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarketInfoViewModel.class);
        Function0<ViewModelStore> function1 = new Function0<ViewModelStore>() { // from class: com.kubi.kumex.market.v2.KuMexMarketInfoFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        };
        Object objM20457a2 = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f29633W = FragmentViewModelLazyKt.createViewModelLazy(this, orCreateKotlinClass, function1, new Function0<CreationExtras>() { // from class: com.kubi.kumex.market.v2.KuMexMarketInfoFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = objArr;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.kumex.market.v2.KuMexMarketInfoFragment$special$$inlined$viewModels$default$5
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
        this.f29635Y = new ArrayList<>();
        IQuoteFacadeService.Companion companion = IQuoteFacadeService.f41383a;
        this.f29637a0 = companion.get().mo50706i();
        this.f29638b0 = companion.get().mo50691R();
        this.f29642f0 = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.v2.z0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuMexMarketInfoFragment.m34831p5();
            }
        });
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C16343l().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kLine_future_share_show", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        boolean z11 = false;
        this.f29643g0 = C27025c.m66567e((Boolean) objM20457a, false);
        if (C24129b.m58030b(SiteVisibleConfigKey.PriceAlert)) {
            try {
                RemoteConfig remoteConfig2 = RemoteConfig.f19636a;
                Type type2 = new C16344m().getType();
                Intrinsics.checkNotNullExpressionValue(type2, "object : TypeToken<T>() {}.type");
                objM20457a2 = RemoteConfig.m20457a("market_alert_rn_enable_v2", type2);
            } catch (Throwable th3) {
                C43846g.m96568c(new KCConfigException(th3, "RemoteConfig", false, null, 8, null), null, 2, null);
            }
            if (C27025c.m66567e((Boolean) objM20457a2, false)) {
                z11 = true;
            }
        }
        this.f29644h0 = z11;
        this.f29651o0 = true;
        this.f29654r0 = C27040e.m66657a(18.0f);
    }

    /* JADX INFO: renamed from: B4 */
    public static final void m34752B4(final KuMexMarketInfoFragment kuMexMarketInfoFragment, FragmentActivity fragmentActivity, final C36856v2 c36856v2) {
        if (kuMexMarketInfoFragment.f29638b0) {
            SnapshotHelper snapshotHelper = SnapshotHelper.f48173a;
            FragmentActivity fragmentActivityRequireActivity = kuMexMarketInfoFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            snapshotHelper.m58416i(fragmentActivityRequireActivity, new Function1() { // from class: com.kubi.kumex.market.v2.l1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KuMexMarketInfoFragment.m34754C4(this.f29812b, c36856v2, (Bitmap) obj);
                }
            });
            return;
        }
        View viewFindViewById = fragmentActivity.findViewById(R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        Bitmap bitmapM66590u = ViewExtKt.m66590u(viewFindViewById, C27017c.f54310a.m66512a(R$color.c_overlay));
        IShareService iShareServiceM35904f = KuMexDepend.f30378a.m35904f();
        ImageShareParam imageShareParam = new ImageShareParam("f_k_share", null, false, null, false, null, null, null, null, null, 1022, null);
        imageShareParam.setBitmap(bitmapM66590u);
        IShareService.m59640c(iShareServiceM35904f, imageShareParam, null, 2, null);
        kuMexMarketInfoFragment.m34878v5(c36856v2);
    }

    /* JADX INFO: renamed from: C4 */
    public static final Unit m34754C4(KuMexMarketInfoFragment kuMexMarketInfoFragment, C36856v2 c36856v2, Bitmap bitmap) {
        IShareService iShareService = IShareService.f49268a.get();
        ImageShareParam imageShareParam = new ImageShareParam("f_k_share", null, false, null, false, null, null, null, null, null, 1022, null);
        imageShareParam.setBitmap(bitmap);
        IShareService.m59640c(iShareService, imageShareParam, null, 2, null);
        kuMexMarketInfoFragment.m34878v5(c36856v2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D4 */
    public final boolean m34756D4() {
        String str = this.f29648l0;
        return str != null && (StringsKt.isBlank(str) ^ true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G5 */
    public final void m34762G5() {
        if (this.f29652p0) {
            m34758E5();
        } else {
            m34851D5();
        }
    }

    /* JADX INFO: renamed from: H5 */
    private final void m34764H5(final String str) {
        runOnUiThread(new Function0() { // from class: com.kubi.kumex.market.v2.o1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuMexMarketInfoFragment.m34767I5(this.f29823b, str);
            }
        });
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m34766I4(final KuMexMarketInfoFragment kuMexMarketInfoFragment) {
        String str = kuMexMarketInfoFragment.f29632V;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbol");
            str = null;
        }
        Pair pairM90091to = TuplesKt.m90091to("symbol", str);
        KuMexDepend kuMexDepend = KuMexDepend.f30378a;
        C43852m.m96590b("B6FuturesCandle", "priceAlarm", "1", pairM90091to, TuplesKt.m90091to("is_login", Integer.valueOf(kuMexDepend.m35905g().c() ? 1 : 0)), TuplesKt.m90091to("norm_version", "1"));
        IUserService.O(kuMexDepend.m35905g(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.kumex.market.v2.j1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuMexMarketInfoFragment.m34769J4(this.f29804b);
            }
        }), 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m34769J4(KuMexMarketInfoFragment kuMexMarketInfoFragment) {
        IQuoteFacadeService iQuoteFacadeService = IQuoteFacadeService.f41383a.get();
        String str = kuMexMarketInfoFragment.f29632V;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbol");
            str = null;
        }
        iQuoteFacadeService.mo50692S(new TradeItemBean(str), "Futures");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public static final Unit m34772L4(KuMexMarketInfoFragment kuMexMarketInfoFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C37304a c37304a = C37304a.f82764a;
        String str = kuMexMarketInfoFragment.f29632V;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbol");
            str = null;
        }
        InterfaceC37754f.a.m85131c(c37304a, str, "buy", null, null, null, null, null, null, null, 508, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M4 */
    public static final Unit m34775M4(KuMexMarketInfoFragment kuMexMarketInfoFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C37304a c37304a = C37304a.f82764a;
        String str = kuMexMarketInfoFragment.f29632V;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbol");
            str = null;
        }
        InterfaceC37754f.a.m85131c(c37304a, str, "sell", null, null, null, null, null, null, null, 508, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M5 */
    public static final Unit m34776M5(KuMexMarketInfoFragment kuMexMarketInfoFragment) {
        g gVar = g.a;
        FragmentManager childFragmentManager = kuMexMarketInfoFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        gVar.u(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N4 */
    public static final Unit m34778N4(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        KuMexDepend kuMexDepend = KuMexDepend.f30378a;
        if (kuMexDepend.m35905g().c()) {
            InterfaceC37766r.a.m85190a(C37304a.f82764a, C45875l0.f103336a.m101332A0(), null, null, null, null, null, null, 126, null);
        } else {
            IUserService.O(kuMexDepend.m35905g(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.kumex.market.v2.y0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KuMexMarketInfoFragment.m34780O4();
                }
            }), 1, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O4 */
    public static final Unit m34780O4() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X4 */
    public static final Unit m34795X4(final KuMexMarketInfoFragment kuMexMarketInfoFragment) {
        IQuoteFacadeService.Companion companion = IQuoteFacadeService.f41383a;
        String str = null;
        if (companion.get().mo50718w()) {
            try {
                IQuoteFacadeService iQuoteFacadeService = companion.get();
                FragmentManager childFragmentManager = kuMexMarketInfoFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                String str2 = kuMexMarketInfoFragment.f29632V;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("symbol");
                    str2 = null;
                }
                iQuoteFacadeService.mo50714q(kuMexMarketInfoFragment, childFragmentManager, new CurrencyFilterTransferData(ClickCardReport.ReportData.CARD_TYPE_FUTURE, null, null, new SymbolData(str2, null, 2, null), 6, null), "FuturesMarketRnToggleSymbolDialog", new Function2() { // from class: com.kubi.kumex.market.v2.e1
                    @Override // p852kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return KuMexMarketInfoFragment.m34797Y4(this.f29777b, (CurrencyFilterTransferData) obj, (KCBridgeRejecterError) obj2);
                    }
                });
            } catch (Exception e11) {
                C37214b.m83255a(e11, "FuturesMarketRnToggleSymbolDialog");
            }
        } else {
            ToggleSymbolDialogFragment.Companion companion2 = ToggleSymbolDialogFragment.f30439s0;
            String str3 = kuMexMarketInfoFragment.f29632V;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("symbol");
            } else {
                str = str3;
            }
            ToggleSymbolDialogFragment toggleSymbolDialogFragmentNewInstance = companion2.newInstance(true, str);
            FragmentManager childFragmentManager2 = kuMexMarketInfoFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
            toggleSymbolDialogFragmentNewInstance.show(childFragmentManager2, "showToggleSymbol");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z4 */
    public static final Unit m34799Z4(final KuMexMarketInfoFragment kuMexMarketInfoFragment) {
        boolean zMo50715s;
        Boolean boolM84689d;
        InterfaceC44980d interfaceC44980dM20288g = RepositoryServiceLocator.f19236a.m20288g();
        String str = kuMexMarketInfoFragment.f29632V;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbol");
            str = null;
        }
        SymbolConfig symbolConfigMo24996X = interfaceC44980dM20288g.mo24996X(str);
        KuMexDepend kuMexDepend = KuMexDepend.f30378a;
        if (kuMexDepend.m35905g().c()) {
            if (symbolConfigMo24996X != null) {
                String str3 = kuMexMarketInfoFragment.f29632V;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("symbol");
                    str3 = null;
                }
                boolM84689d = C37570e.m84689d(symbolConfigMo24996X, str3);
            } else {
                boolM84689d = null;
            }
            zMo50715s = C27025c.m66566d(boolM84689d);
        } else {
            IQuoteFacadeService iQuoteFacadeService = IQuoteFacadeService.f41383a.get();
            String str4 = kuMexMarketInfoFragment.f29632V;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("symbol");
                str4 = null;
            }
            zMo50715s = iQuoteFacadeService.mo50715s(str4);
        }
        final boolean z11 = !zMo50715s;
        if (kuMexDepend.m35905g().c()) {
            String str5 = kuMexMarketInfoFragment.f29632V;
            if (str5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("symbol");
            } else {
                str2 = str5;
            }
            C16108t.m34070o(str2, z11, new Function0() { // from class: com.kubi.kumex.market.v2.a1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KuMexMarketInfoFragment.m34801a5(this.f29690b, z11);
                }
            });
        } else if (TextUtils.isEmpty(kuMexDepend.m35905g().d()) || !a.b()) {
            String str6 = kuMexMarketInfoFragment.f29632V;
            if (str6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("symbol");
            } else {
                str2 = str6;
            }
            C16108t.m34078w(str2, z11, new Function0() { // from class: com.kubi.kumex.market.v2.c1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KuMexMarketInfoFragment.m34805c5(this.f29703b, z11);
                }
            });
        } else {
            IUserService.O(kuMexDepend.m35905g(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.kumex.market.v2.b1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KuMexMarketInfoFragment.m34803b5(this.f29697b, z11);
                }
            }), 1, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b5 */
    public static final Unit m34803b5(KuMexMarketInfoFragment kuMexMarketInfoFragment, boolean z11) {
        String str = kuMexMarketInfoFragment.f29632V;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbol");
            str = null;
        }
        C16108t.m34072q(str, z11, null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d5 */
    public static final Unit m34807d5(KuMexMarketInfoFragment kuMexMarketInfoFragment) {
        String str = kuMexMarketInfoFragment.f29632V;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbol");
            str = null;
        }
        C43852m.m96590b("B6FuturesCandle", "AIInsights", "1", TuplesKt.m90091to("trade_pair", str));
        InterfaceC44980d interfaceC44980dM20288g = RepositoryServiceLocator.f19236a.m20288g();
        String str2 = kuMexMarketInfoFragment.f29632V;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbol");
            str2 = null;
        }
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(interfaceC44980dM20288g, str2, false, 2, null);
        String str3 = "CoinInsights?base=" + (contractEntityM99529O != null ? contractEntityM99529O.getSpotCurrency() : null) + "&sourceType=" + ClickCardReport.ReportData.CARD_TYPE_FUTURE;
        Router.f46192a.m56184f("krn/router?biz=coininfo&entry=main&component=krn_coininfo&route=" + Uri.encode(str3)).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l5 */
    public static /* synthetic */ void m34822l5(KuMexMarketInfoFragment kuMexMarketInfoFragment, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        kuMexMarketInfoFragment.m34865k5(z11, str);
    }

    /* JADX INFO: renamed from: o4 */
    private final String m34828o4() {
        String str = this.f29649m0;
        if (str == null || StringsKt.isBlank(str)) {
            str = null;
        }
        String strM66669i = C27041f.m66669i(str, "--");
        String strM34872s4 = m34872s4();
        if (strM34872s4 == null) {
            return strM66669i;
        }
        String str2 = this.f29650n0;
        if (str2 == null) {
            str2 = "";
        }
        if (StringsKt.contains$default((CharSequence) strM66669i, (CharSequence) "%", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) strM66669i, (CharSequence) strM34872s4, false, 2, (Object) null) || StringsKt.contains$default((CharSequence) strM66669i, (CharSequence) str2, false, 2, (Object) null)) {
            return strM66669i;
        }
        return strM66669i + ' ' + strM34872s4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t4 */
    public final String m34837t4() {
        InterfaceC44980d interfaceC44980dM20288g = RepositoryServiceLocator.f19236a.m20288g();
        String str = this.f29632V;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbol");
            str = null;
        }
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(interfaceC44980dM20288g, str, false, 2, null);
        String strM66677q = C27041f.m66677q(contractEntityM99529O != null ? contractEntityM99529O.getBaseCurrency() : null);
        return strM66677q == null ? "BTC" : strM66677q;
    }

    /* JADX INFO: renamed from: w4 */
    private final BaseFragment m34841w4() {
        String str;
        String str2 = null;
        if (!this.f29638b0) {
            KuMexMarketChartFragment.Companion companion = KuMexMarketChartFragment.f29603e0;
            String str3 = this.f29632V;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("symbol");
            } else {
                str2 = str3;
            }
            return companion.instance(str2);
        }
        IQuoteFacadeService iQuoteFacadeService = IQuoteFacadeService.f41383a.get();
        String str4 = this.f29632V;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbol");
            str = null;
        } else {
            str = str4;
        }
        return IQuoteFacadeService.m50672J(iQuoteFacadeService, str, SearchCategory$Companion.FUTURES, null, 4, null);
    }

    /* JADX INFO: renamed from: E4 */
    public final void m34852E4() {
        BottomSheetBehavior<?> bottomSheetBehavior = this.f29645i0;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(5);
        }
    }

    /* JADX INFO: renamed from: F4 */
    public final void m34853F4() {
        KuMexSubmitBottomSheetFragment kuMexSubmitBottomSheetFragment = this.f29646j0;
        if (kuMexSubmitBottomSheetFragment != null) {
            if (!kuMexSubmitBottomSheetFragment.isAdded() || kuMexSubmitBottomSheetFragment.getView() == null) {
                kuMexSubmitBottomSheetFragment = null;
            }
            if (kuMexSubmitBottomSheetFragment != null) {
                kuMexSubmitBottomSheetFragment.onHide();
            }
        }
    }

    /* JADX INFO: renamed from: G4 */
    public final void m34854G4(C36856v2 c36856v2) {
        ConstraintLayout headerRootCl = c36856v2.f81239g.f79825g;
        Intrinsics.checkNotNullExpressionValue(headerRootCl, "headerRootCl");
        IntRange intRangeUntil = RangesKt.until(0, headerRootCl.getChildCount());
        ArrayList<View> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(headerRootCl.getChildAt(((IntIterator) it).nextInt()));
        }
        for (View view : arrayList) {
            Intrinsics.checkNotNull(view);
            C27046k.m66684G(view, view.getId() == R$id.flexLayout);
        }
        ShapeTextView preMarketLabel = c36856v2.f81239g.f79828j;
        Intrinsics.checkNotNullExpressionValue(preMarketLabel, "preMarketLabel");
        C27046k.m66700o(preMarketLabel);
    }

    /* JADX INFO: renamed from: H4 */
    public final void m34855H4() {
        C36744c4 c36744c4;
        AppCompatImageView appCompatImageView;
        C36744c4 c36744c5;
        C36744c4 c36744c6;
        AppCompatImageView appCompatImageView2;
        C36744c4 c36744c7;
        AppCompatImageView appCompatImageView3;
        if (!this.f29644h0) {
            C36856v2 c36856v2M34875u4 = m34875u4();
            if (c36856v2M34875u4 != null && (c36744c4 = c36856v2M34875u4.f81239g) != null && (appCompatImageView = c36744c4.f79820b) != null) {
                ViewExtKt.m66577h(appCompatImageView);
            }
            C44183g.f97524a.m97408f();
            return;
        }
        m34849B5(this.f29640d0);
        C36856v2 c36856v2M34875u5 = m34875u4();
        if (c36856v2M34875u5 != null && (c36744c7 = c36856v2M34875u5.f81239g) != null && (appCompatImageView3 = c36744c7.f79820b) != null) {
            ViewExtKt.m66594y(appCompatImageView3);
        }
        C36856v2 c36856v2M34875u6 = m34875u4();
        if (c36856v2M34875u6 != null && (c36744c6 = c36856v2M34875u6.f81239g) != null && (appCompatImageView2 = c36744c6.f79820b) != null) {
            C27046k.m66711z(appCompatImageView2, 0L, new Function0() { // from class: com.kubi.kumex.market.v2.f1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KuMexMarketInfoFragment.m34766I4(this.f29783b);
                }
            }, 1, null);
        }
        C44183g c44183g = C44183g.f97524a;
        FragmentActivity activity = getActivity();
        C36856v2 c36856v2M34875u7 = m34875u4();
        C44183g.m97407n(c44183g, activity, (c36856v2M34875u7 == null || (c36744c5 = c36856v2M34875u7.f81239g) == null) ? null : c36744c5.f79820b, false, 4, null);
    }

    /* JADX INFO: renamed from: K5 */
    public final void m34858K5(final String str) {
        runOnUiThread(new Function0() { // from class: com.kubi.kumex.market.v2.s0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuMexMarketInfoFragment.m34773L5(this.f29838b, str);
            }
        });
    }

    @Override // p212dv.InterfaceC36975o
    /* JADX INFO: renamed from: P2 */
    public boolean mo32806P2() {
        return this.f29635Y.contains(getStringRes(R$string.market_coin_info, new Object[0]));
    }

    /* JADX INFO: renamed from: R4 */
    public final void m34860R4() {
        if (this.f29646j0 == null) {
            this.f29646j0 = KuMexSubmitBottomSheetFragment.f29672h0.newInstance(this.f29647k0);
            this.f29647k0 = null;
            FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
            int i11 = R$id.bottom_sheet_container;
            KuMexSubmitBottomSheetFragment kuMexSubmitBottomSheetFragment = this.f29646j0;
            Intrinsics.checkNotNull(kuMexSubmitBottomSheetFragment);
            fragmentTransactionBeginTransaction.replace(i11, kuMexSubmitBottomSheetFragment).commitNowAllowingStateLoss();
        }
    }

    /* JADX INFO: renamed from: S4 */
    public final void m34861S4(final String str) {
        Disposable disposable = this.f29634X;
        if (disposable != null) {
            ViewExKt.m36485k(disposable);
        }
        Flowable<SymbolConfig> flowableObserveOn = RepositoryServiceLocator.f19236a.m20288g().mo25009f0(str).observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.market.v2.p1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexMarketInfoFragment.m34787T4(this.f29827b, str, (SymbolConfig) obj);
            }
        };
        Disposable disposableSubscribe = flowableObserveOn.subscribe(new Consumer() { // from class: com.kubi.kumex.market.v2.q1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexMarketInfoFragment.m34789U4(function1, obj);
            }
        });
        Intrinsics.checkNotNull(disposableSubscribe);
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        this.f29634X = disposableSubscribe;
    }

    /* JADX INFO: renamed from: g5 */
    public final void m34862g5() {
        C36744c4 c36744c4;
        AppCompatImageView appCompatImageView;
        C36744c4 c36744c5;
        AppCompatImageView appCompatImageView2;
        C36744c4 c36744c6;
        AppCompatImageView appCompatImageView3;
        if (C24129b.m58030b(SiteVisibleConfigKey.InviteRebate) && this.f29643g0) {
            C36856v2 c36856v2M34875u4 = m34875u4();
            if (c36856v2M34875u4 != null && (c36744c6 = c36856v2M34875u4.f81239g) != null && (appCompatImageView3 = c36744c6.f79829k) != null) {
                ViewExtKt.m66594y(appCompatImageView3);
            }
        } else {
            C36856v2 c36856v2M34875u5 = m34875u4();
            if (c36856v2M34875u5 != null && (c36744c4 = c36856v2M34875u5.f81239g) != null && (appCompatImageView = c36744c4.f79829k) != null) {
                ViewExtKt.m66577h(appCompatImageView);
            }
        }
        C36856v2 c36856v2M34875u6 = m34875u4();
        if (c36856v2M34875u6 == null || (c36744c5 = c36856v2M34875u6.f81239g) == null || (appCompatImageView2 = c36744c5.f79829k) == null) {
            return;
        }
        C27046k.m66711z(appCompatImageView2, 0L, new Function0() { // from class: com.kubi.kumex.market.v2.d1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuMexMarketInfoFragment.m34814h5(this.f29768b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: i5 */
    public final boolean m34863i5() {
        g gVar = g.a;
        InterfaceC44980d interfaceC44980dM20288g = RepositoryServiceLocator.f19236a.m20288g();
        String str = this.f29632V;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbol");
            str = null;
        }
        return !gVar.o(InterfaceC44980d.m99529O(interfaceC44980dM20288g, str, false, 2, null));
    }

    /* JADX INFO: renamed from: j5 */
    public final boolean m34864j5() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C16340i().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kumex_rn_migration_contract_info__enabled", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, false);
    }

    /* JADX INFO: renamed from: k5 */
    public final void m34865k5(boolean z11, String str) {
        if (this.f29638b0) {
            InterfaceC44980d interfaceC44980dM20288g = RepositoryServiceLocator.f19236a.m20288g();
            String str2 = this.f29632V;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("symbol");
                str2 = null;
            }
            boolean z12 = false;
            ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(interfaceC44980dM20288g, str2, false, 2, null);
            boolean z13 = contractEntityM99529O != null && contractEntityM99529O.isUsStock();
            if (z13 && z11) {
                z12 = true;
            }
            String str3 = this.f29632V;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("symbol");
                str3 = null;
            }
            if (!z13) {
                str = null;
            }
            C12572a.m23695d("kline_low_liquidity_state_event", new KlineLowLiquidityState(str3, z12, str), 0L, 4, null);
        }
    }

    /* JADX INFO: renamed from: n5 */
    public final void m34867n5() {
        if (IQuoteFacadeService.f41383a.get().mo50698a()) {
            return;
        }
        m34880x4().m35119n().observe(getViewLifecycleOwner(), new C16342k(new Function1() { // from class: com.kubi.kumex.market.v2.h1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexMarketInfoFragment.m34829o5(this.f29793b, (MarketCoinInfoUiStatus) obj);
            }
        }));
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        String strM102677L;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Bundle arguments = getArguments();
        if (arguments == null || (strM102677L = RouteExKt.m56284y(arguments, "symbol")) == null) {
            strM102677L = C46527h0.f104291a.m102677L();
        }
        this.f29632V = strM102677L;
        getTitleBar().m58934f();
        C46527h0 c46527h0 = C46527h0.f104291a;
        String str = this.f29632V;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbol");
            str = null;
        }
        c46527h0.m102670E0(str);
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_market_info, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        C43852m.m96595g("B6FuturesCandle", "FuturesCandlePageNew", null, null, 12, null);
        String str = this.f29632V;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbol");
            str = null;
        }
        m34879w5(str);
        String str3 = this.f29632V;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbol");
        } else {
            str2 = str3;
        }
        m34869q5(str2);
        m34866m5();
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m34791V4();
        m34857K4();
        m34859P4();
        m34826n4();
        m34809e5();
        bindFlowEvent();
        C36976p.f82091a.m82793b(this);
    }

    /* JADX INFO: renamed from: p4 */
    public final void m34868p4(boolean z11) {
        if (z11) {
            m34852E4();
        }
        KuMexSubmitBottomSheetFragment kuMexSubmitBottomSheetFragment = this.f29646j0;
        if (kuMexSubmitBottomSheetFragment != null) {
            m34853F4();
            FragmentTransaction fragmentTransactionRemove = getChildFragmentManager().beginTransaction().remove(kuMexSubmitBottomSheetFragment);
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            if (C27032f.m66617h(childFragmentManager)) {
                fragmentTransactionRemove.commitAllowingStateLoss();
            } else {
                fragmentTransactionRemove.commitNowAllowingStateLoss();
            }
            this.f29646j0 = null;
        }
    }

    /* JADX INFO: renamed from: q5 */
    public final void m34869q5(String str) {
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), str, false, 2, null);
        if (contractEntityM99529O != null && contractEntityM99529O.isUsStock()) {
            m34880x4().m35122q();
            m34880x4().m35121p(true);
        } else {
            m34880x4().m35122q();
            m34856J5(false);
            m34822l5(this, false, null, 2, null);
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final void m34870r4(Activity activity) {
        if (Build.VERSION.SDK_INT >= 34) {
            activity.overrideActivityTransition(0, 0, 0);
        } else {
            activity.overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: renamed from: r5 */
    public final void m34871r5(String str) {
        String str2 = this.f29632V;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbol");
            str2 = null;
        }
        if (!Intrinsics.areEqual(str, str2)) {
            m34833q4(this, false, 1, null);
        }
        this.f29632V = str;
        this.f29640d0 = false;
        m34873s5();
        m34849B5(false);
        m34764H5(str);
        m34858K5(str);
        m34826n4();
        m34861S4(str);
        m34879w5(str);
        m34869q5(str);
    }

    /* JADX INFO: renamed from: s4 */
    public final String m34872s4() {
        String strM92642g;
        String str = this.f29650n0;
        if (str != null) {
            if (StringsKt.isBlank(str)) {
                str = null;
            }
            if (str != null) {
                BigDecimal bigDecimalOrNull = StringsKt.toBigDecimalOrNull(str);
                return (bigDecimalOrNull == null || (strM92642g = C42180b.m92642g(bigDecimalOrNull, null, null, 0, true, false, true, 23, null)) == null) ? str : strM92642g;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t5 */
    public final void m34874t5() {
        if (this.f29646j0 == null) {
            m34860R4();
        }
        BottomSheetBehavior<?> bottomSheetBehavior = this.f29645i0;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(3);
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final C36856v2 m34875u4() {
        return (C36856v2) this.f29631U.getValue(this, f29630t0[0]);
    }

    /* JADX INFO: renamed from: u5 */
    public final void m34876u5() {
        KuMexSubmitBottomSheetFragment kuMexSubmitBottomSheetFragment = this.f29646j0;
        if (kuMexSubmitBottomSheetFragment != null) {
            if (!kuMexSubmitBottomSheetFragment.isAdded() || kuMexSubmitBottomSheetFragment.getView() == null) {
                kuMexSubmitBottomSheetFragment = null;
            }
            if (kuMexSubmitBottomSheetFragment != null) {
                kuMexSubmitBottomSheetFragment.onShow();
            }
        }
    }

    /* JADX INFO: renamed from: v5 */
    public final void m34878v5(C36856v2 c36856v2) {
        AppCompatImageView backIv = c36856v2.f81239g.f79821c;
        Intrinsics.checkNotNullExpressionValue(backIv, "backIv");
        C27046k.m66685H(backIv);
        View divider = c36856v2.f81239g.f79822d;
        Intrinsics.checkNotNullExpressionValue(divider, "divider");
        C27046k.m66685H(divider);
        FlexboxLayout flexLayout = c36856v2.f81239g.f79824f;
        Intrinsics.checkNotNullExpressionValue(flexLayout, "flexLayout");
        C27046k.m66685H(flexLayout);
        BaseTextView symbolNameTv = c36856v2.f81239g.f79831m;
        Intrinsics.checkNotNullExpressionValue(symbolNameTv, "symbolNameTv");
        C27046k.m66685H(symbolNameTv);
        String str = this.f29632V;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbol");
            str = null;
        }
        m34858K5(str);
        if (this.f29639c0) {
            LottieAnimationView ivAi = c36856v2.f81239g.f79826h;
            Intrinsics.checkNotNullExpressionValue(ivAi, "ivAi");
            C27046k.m66685H(ivAi);
        }
        if (this.f29644h0) {
            AppCompatImageView alertIv = c36856v2.f81239g.f79820b;
            Intrinsics.checkNotNullExpressionValue(alertIv, "alertIv");
            C27046k.m66685H(alertIv);
        } else {
            AppCompatImageView alertIv2 = c36856v2.f81239g.f79820b;
            Intrinsics.checkNotNullExpressionValue(alertIv2, "alertIv");
            C27046k.m66700o(alertIv2);
        }
        AppCompatImageView favIv = c36856v2.f81239g.f79823e;
        Intrinsics.checkNotNullExpressionValue(favIv, "favIv");
        C27046k.m66685H(favIv);
        m34862g5();
        if (this.f29643g0 && C24129b.m58030b(SiteVisibleConfigKey.InviteRebate)) {
            AppCompatImageView shareIv = c36856v2.f81239g.f79829k;
            Intrinsics.checkNotNullExpressionValue(shareIv, "shareIv");
            C27046k.m66685H(shareIv);
        } else {
            AppCompatImageView shareIv2 = c36856v2.f81239g.f79829k;
            Intrinsics.checkNotNullExpressionValue(shareIv2, "shareIv");
            C27046k.m66700o(shareIv2);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: x4 */
    public final MarketInfoViewModel m34880x4() {
        return (MarketInfoViewModel) this.f29633W.getValue();
    }

    /* JADX INFO: renamed from: y4 */
    public final InterfaceC44974a m34881y4() {
        return (InterfaceC44974a) this.f29642f0.getValue();
    }

    /* JADX INFO: renamed from: z4 */
    public final Fragment m34882z4() {
        IReactNativeService iReactNativeService = IReactNativeService.INSTANCE.get();
        Bundle bundle = new Bundle();
        bundle.putString(Constants.BIZ, "tradeinfo_new");
        bundle.putString("entry", "main");
        bundle.putString(Constants.COMPONENT, "kucoin_tradeinfo_kudos_rn");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FuturesTradingRules?symbol=");
        String str = this.f29632V;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbol");
            str = null;
        }
        sb2.append(Uri.encode(str));
        bundle.putString("route", Uri.encode(sb2.toString()));
        return iReactNativeService.getRnRootFragment(bundle);
    }

    /* JADX INFO: renamed from: A5 */
    public static final void m34750A5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E5 */
    public final void m34758E5() {
        Context context;
        int iM54289n;
        C36856v2 c36856v2M34875u4 = m34875u4();
        if (c36856v2M34875u4 == null || (context = getContext()) == null) {
            return;
        }
        c36856v2M34875u4.f81239g.f79832n.setText(m34828o4());
        BaseTextView baseTextView = c36856v2M34875u4.f81239g.f79832n;
        if (this.f29651o0) {
            iM54289n = C22890g.m54291p(context);
        } else {
            iM54289n = C22890g.m54289n(context);
        }
        baseTextView.setTextColor(iM54289n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F5 */
    public final void m34760F5() {
        Context context;
        int iM54289n;
        C36856v2 c36856v2M34875u4 = m34875u4();
        if (c36856v2M34875u4 == null || (context = getContext()) == null) {
            return;
        }
        BaseTextView baseTextView = c36856v2M34875u4.f81239g.f79832n;
        String str = this.f29649m0;
        if (str == null || StringsKt.isBlank(str)) {
            str = null;
        }
        baseTextView.setText(C27041f.m66669i(str, "--"));
        BaseTextView baseTextView2 = c36856v2M34875u4.f81239g.f79832n;
        if (this.f29651o0) {
            iM54289n = C22890g.m54291p(context);
        } else {
            iM54289n = C22890g.m54289n(context);
        }
        baseTextView2.setTextColor(iM54289n);
    }

    /* JADX INFO: renamed from: I5 */
    public static final Unit m34767I5(KuMexMarketInfoFragment kuMexMarketInfoFragment, String str) {
        C36856v2 c36856v2M34875u4 = kuMexMarketInfoFragment.m34875u4();
        if (c36856v2M34875u4 == null) {
            return Unit.INSTANCE;
        }
        BaseTextView baseTextView = c36856v2M34875u4.f81239g.f79831m;
        C27096v0 c27096v0M24435g = null;
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), str, false, 2, null);
        if (contractEntityM99529O != null) {
            c27096v0M24435g = FuturesDisplayNameUtils.m24435g(FuturesDisplayNameUtils.f22525a, contractEntityM99529O, false, 1, null);
        }
        baseTextView.setText(C27041f.m66667g(c27096v0M24435g, str));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L5 */
    public static final Unit m34773L5(final KuMexMarketInfoFragment kuMexMarketInfoFragment, String str) {
        C36856v2 c36856v2M34875u4 = kuMexMarketInfoFragment.m34875u4();
        if (c36856v2M34875u4 == null) {
            return Unit.INSTANCE;
        }
        Boolean boolValueOf = null;
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), str, false, 2, null);
        if (contractEntityM99529O != null) {
            boolValueOf = Boolean.valueOf(contractEntityM99529O.isPreMarket());
        }
        if (C27025c.m66566d(boolValueOf)) {
            ShapeTextView preMarketLabel = c36856v2M34875u4.f81239g.f79828j;
            Intrinsics.checkNotNullExpressionValue(preMarketLabel, "preMarketLabel");
            ViewExtKt.m66594y(preMarketLabel);
            g gVar = g.a;
            FragmentManager childFragmentManager = kuMexMarketInfoFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            gVar.h(childFragmentManager);
            ContractEntity contractEntityM102673I = C46527h0.f104291a.m102673I();
            C36786j4 c36786j4 = c36856v2M34875u4.f81240h;
            gVar.j(contractEntityM102673I, c36786j4.f80356e, c36786j4.f80355d, c36786j4.f80353b);
            ShapeTextView preMarketLabel2 = c36856v2M34875u4.f81239g.f79828j;
            Intrinsics.checkNotNullExpressionValue(preMarketLabel2, "preMarketLabel");
            C27046k.m66711z(preMarketLabel2, 0L, new Function0() { // from class: com.kubi.kumex.market.v2.g1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KuMexMarketInfoFragment.m34776M5(this.f29788b);
                }
            }, 1, null);
        } else {
            ShapeTextView preMarketLabel3 = c36856v2M34875u4.f81239g.f79828j;
            Intrinsics.checkNotNullExpressionValue(preMarketLabel3, "preMarketLabel");
            ViewExtKt.m66577h(preMarketLabel3);
            ShapeConstraintLayout preMarketTipsLayout = c36856v2M34875u4.f81240h.f80356e;
            Intrinsics.checkNotNullExpressionValue(preMarketTipsLayout, "preMarketTipsLayout");
            ViewExtKt.m66577h(preMarketTipsLayout);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T4 */
    public static final Unit m34787T4(KuMexMarketInfoFragment kuMexMarketInfoFragment, String str, SymbolConfig symbolConfig) {
        kuMexMarketInfoFragment.m34850C5(C27025c.m66566d(C37570e.m84689d(symbolConfig, str)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U4 */
    public static final void m34789U4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V4 */
    private final void m34791V4() {
        boolean zMo50715s;
        C36856v2 c36856v2M34875u4 = m34875u4();
        if (c36856v2M34875u4 == null) {
            return;
        }
        AppCompatImageView backIv = c36856v2M34875u4.f81239g.f79821c;
        Intrinsics.checkNotNullExpressionValue(backIv, "backIv");
        C27046k.m66711z(backIv, 0L, new Function0() { // from class: com.kubi.kumex.market.v2.t0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuMexMarketInfoFragment.m34793W4(this.f29845b);
            }
        }, 1, null);
        String str = this.f29632V;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbol");
            str = null;
        }
        m34764H5(str);
        String str3 = this.f29632V;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbol");
            str3 = null;
        }
        m34858K5(str3);
        m34821l4();
        BaseTextView symbolNameTv = c36856v2M34875u4.f81239g.f79831m;
        Intrinsics.checkNotNullExpressionValue(symbolNameTv, "symbolNameTv");
        C27046k.m66711z(symbolNameTv, 0L, new Function0() { // from class: com.kubi.kumex.market.v2.u0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuMexMarketInfoFragment.m34795X4(this.f29848b);
            }
        }, 1, null);
        m34862g5();
        if (KuMexDepend.f30378a.m35905g().c()) {
            InterfaceC44980d interfaceC44980dM20288g = RepositoryServiceLocator.f19236a.m20288g();
            String str4 = this.f29632V;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("symbol");
                str4 = null;
            }
            SymbolConfig symbolConfigMo24996X = interfaceC44980dM20288g.mo24996X(str4);
            String str5 = this.f29632V;
            if (str5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("symbol");
            } else {
                str2 = str5;
            }
            zMo50715s = C27025c.m66566d(C37570e.m84689d(symbolConfigMo24996X, str2));
        } else {
            IQuoteFacadeService iQuoteFacadeService = IQuoteFacadeService.f41383a.get();
            String str6 = this.f29632V;
            if (str6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("symbol");
            } else {
                str2 = str6;
            }
            zMo50715s = iQuoteFacadeService.mo50715s(str2);
        }
        m34850C5(zMo50715s);
        AppCompatImageView favIv = c36856v2M34875u4.f81239g.f79823e;
        Intrinsics.checkNotNullExpressionValue(favIv, "favIv");
        C27046k.m66711z(favIv, 0L, new Function0() { // from class: com.kubi.kumex.market.v2.v0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuMexMarketInfoFragment.m34799Z4(this.f29852b);
            }
        }, 1, null);
        m34855H4();
        LottieAnimationView ivAi = c36856v2M34875u4.f81239g.f79826h;
        this.f29641e0 = ivAi;
        Intrinsics.checkNotNullExpressionValue(ivAi, "ivAi");
        C27046k.m66711z(ivAi, 0L, new Function0() { // from class: com.kubi.kumex.market.v2.w0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuMexMarketInfoFragment.m34807d5(this.f29865b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: W4 */
    public static final Unit m34793W4(KuMexMarketInfoFragment kuMexMarketInfoFragment) {
        kuMexMarketInfoFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a5 */
    public static final Unit m34801a5(KuMexMarketInfoFragment kuMexMarketInfoFragment, boolean z11) {
        kuMexMarketInfoFragment.m34850C5(z11);
        return Unit.INSTANCE;
    }

    private final void bindFlowEvent() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "to_coin_info_tab".length();
        }
        C12572a.m23692a(viewLifecycleOwner, false, new C16327x201f11e5("to_coin_info_tab", null, this));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        if (c12573b.m23696a()) {
            "kline_quick_order_key".length();
        }
        C12572a.m23692a(viewLifecycleOwner2, false, new C16328x201f11e6("kline_quick_order_key", null, this));
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        if (c12573b.m23696a()) {
            "JUMP_MARKET_FEED_TAB".length();
        }
        C12572a.m23692a(viewLifecycleOwner3, false, new C16329x201f11e7("JUMP_MARKET_FEED_TAB", null, this));
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        if (c12573b.m23696a()) {
            "JUMP_COIN_INFO_TAB".length();
        }
        C12572a.m23692a(viewLifecycleOwner4, false, new C16330x201f11e8("JUMP_COIN_INFO_TAB", null, this));
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        if (c12573b.m23696a()) {
            "gesture_status".length();
        }
        C12572a.m23692a(viewLifecycleOwner5, false, new C16331x201f11e9("gesture_status", null, this));
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        if (c12573b.m23696a()) {
            "hide_share_fav".length();
        }
        C12572a.m23692a(viewLifecycleOwner6, false, new C16332x201f11ea("hide_share_fav", null, this));
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "getViewLifecycleOwner(...)");
        if (c12573b.m23696a()) {
            "refresh_mex_market_info_fragment".length();
        }
        C12572a.m23692a(viewLifecycleOwner7, false, new C16333x201f11eb("refresh_mex_market_info_fragment", null, this));
    }

    /* JADX INFO: renamed from: c5 */
    public static final Unit m34805c5(KuMexMarketInfoFragment kuMexMarketInfoFragment, boolean z11) {
        kuMexMarketInfoFragment.m34850C5(z11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e5 */
    private final void m34809e5() {
        m34867n5();
        m34880x4().m35120o().observe(getViewLifecycleOwner(), new C16342k(new Function1() { // from class: com.kubi.kumex.market.v2.x0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexMarketInfoFragment.m34811f5(this.f29869b, (UsStockMarketStatus) obj);
            }
        }));
        setFragmentResultListener("key_close_quick_order_bottom_sheet", new C16337f());
        setFragmentResultListener("key_finish_activity_and_close", new C16338g());
        setFragmentResultListener("key_kumex_market_info_symbol_changed", new C16339h());
        String str = this.f29632V;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbol");
            str = null;
        }
        m34861S4(str);
    }

    /* JADX INFO: renamed from: f5 */
    public static final Unit m34811f5(KuMexMarketInfoFragment kuMexMarketInfoFragment, UsStockMarketStatus usStockMarketStatus) {
        kuMexMarketInfoFragment.m34856J5(usStockMarketStatus.getIsLowLiquidityPeriod());
        kuMexMarketInfoFragment.m34865k5(usStockMarketStatus.getIsLowLiquidityPeriod(), usStockMarketStatus.getMarketSession());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h5 */
    public static final Unit m34814h5(KuMexMarketInfoFragment kuMexMarketInfoFragment) {
        kuMexMarketInfoFragment.m34848A4();
        C27023a.m66555b("B6FuturesCandle", "Share", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    private final void m34821l4() {
        boolean z11;
        C36856v2 c36856v2M34875u4 = m34875u4();
        if (c36856v2M34875u4 == null) {
            return;
        }
        if (c36856v2M34875u4.f81239g.f79827i.getVisibility() == 0) {
            c36856v2M34875u4.f81239g.f79824f.setTranslationY(0.0f);
            c36856v2M34875u4.f81239g.f79832n.setAlpha(0.0f);
            c36856v2M34875u4.f81239g.f79832n.setTranslationY(this.f29654r0);
            if (m34756D4()) {
                c36856v2M34875u4.f81239g.f79832n.setVisibility(0);
                m34758E5();
                return;
            } else {
                m34760F5();
                return;
            }
        }
        if (!m34756D4()) {
            m34824m4(this.f29653q0);
            return;
        }
        if (this.f29653q0 >= this.f29654r0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f29652p0 = z11;
        c36856v2M34875u4.f81239g.f79832n.setVisibility(0);
        c36856v2M34875u4.f81239g.f79824f.setTranslationY(-C27040e.m66657a(8.3f));
        c36856v2M34875u4.f81239g.f79832n.setAlpha(1.0f);
        c36856v2M34875u4.f81239g.f79832n.setTranslationY(0.0f);
        m34762G5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x004c  */
    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    /* JADX INFO: renamed from: m4 */
    public final void m34824m4(float f11) {
        C36856v2 c36856v2M34875u4 = m34875u4();
        if (c36856v2M34875u4 == null) {
            return;
        }
        c36856v2M34875u4.f81239g.f79824f.setTranslationY(RangesKt.coerceIn((-f11) / 2.16f, -C27040e.m66657a(8.3f), 0.0f));
        float f12 = this.f29654r0;
        float fCoerceIn = RangesKt.coerceIn(f12 - f11, 0.0f, f12);
        c36856v2M34875u4.f81239g.f79832n.setTranslationY(fCoerceIn);
        if (f11 > 0.0f) {
            BaseTextView tvCoinpairsPrice = c36856v2M34875u4.f81239g.f79832n;
            Intrinsics.checkNotNullExpressionValue(tvCoinpairsPrice, "tvCoinpairsPrice");
            if (ViewExtKt.m66580k(tvCoinpairsPrice)) {
                c36856v2M34875u4.f81239g.f79832n.setVisibility(0);
            } else if (f11 <= 0.0f) {
                c36856v2M34875u4.f81239g.f79832n.setVisibility(4);
            }
        } else if (f11 <= 0.0f) {
            c36856v2M34875u4.f81239g.f79832n.setVisibility(4);
        }
        c36856v2M34875u4.f81239g.f79832n.setAlpha(1.0f - (fCoerceIn / this.f29654r0));
    }

    /* JADX INFO: renamed from: n4 */
    private final void m34826n4() {
        String spotCurrency;
        String quoteCurrency;
        C36856v2 c36856v2M34875u4 = m34875u4();
        if (c36856v2M34875u4 == null) {
            return;
        }
        boolean zM58030b = C24129b.m58030b(SiteVisibleConfigKey.CoinInfo);
        BaseFragment baseFragmentMo20622c = KuMexDepend.f30378a.m35900b().mo20622c();
        ArrayList arrayList = new ArrayList();
        arrayList.add(m34841w4());
        if (this.f29637a0) {
            arrayList.add(IQuoteFacadeService.f41383a.get().mo50703f(m34837t4(), "kline_futures"));
        }
        if (zM58030b) {
            IQuoteFacadeService.Companion companion = IQuoteFacadeService.f41383a;
            if (companion.get().mo50698a()) {
                InterfaceC44980d interfaceC44980dM20288g = RepositoryServiceLocator.f19236a.m20288g();
                String str = this.f29632V;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("symbol");
                    str = null;
                }
                ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(interfaceC44980dM20288g, str, false, 2, null);
                IQuoteFacadeService iQuoteFacadeService = companion.get();
                String str2 = this.f29632V;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("symbol");
                    str2 = null;
                }
                if (contractEntityM99529O != null) {
                    spotCurrency = contractEntityM99529O.getSpotCurrency();
                } else {
                    spotCurrency = null;
                }
                if (contractEntityM99529O != null) {
                    quoteCurrency = contractEntityM99529O.getQuoteCurrency();
                } else {
                    quoteCurrency = null;
                }
                BaseFragment baseFragmentMo50695W = iQuoteFacadeService.mo50695W(ClickCardReport.ReportData.CARD_TYPE_FUTURE, str2, spotCurrency, quoteCurrency);
                Intrinsics.checkNotNull(baseFragmentMo50695W, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
                arrayList.add(baseFragmentMo50695W);
            } else {
                KuMexMarketCoinInfoFragment.Companion companion2 = KuMexMarketCoinInfoFragment.f29710Z;
                String str3 = this.f29632V;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("symbol");
                    str3 = null;
                }
                arrayList.add(companion2.instance(str3));
            }
        }
        if (m34863i5()) {
            arrayList.add(m34877v4());
        }
        if (baseFragmentMo20622c != null && C24129b.m58030b(SiteVisibleConfigKey.CopyTrading)) {
            arrayList.add(baseFragmentMo20622c);
        }
        C16323a c16323a = new C16323a(arrayList, getChildFragmentManager());
        this.f29636Z = c16323a;
        c36856v2M34875u4.f81243k.setAdapter(c16323a);
        c36856v2M34875u4.f81243k.setOffscreenPageLimit(arrayList.size());
        this.f29635Y.clear();
        this.f29635Y.add(getStringRes(R$string.market_trade, new Object[0]));
        if (this.f29637a0) {
            this.f29635Y.add(getString(R$string.kc_market_feed_tab));
        }
        if (zM58030b) {
            this.f29635Y.add(getStringRes(R$string.market_coin_info, new Object[0]));
        }
        if (m34863i5()) {
            this.f29635Y.add(getStringRes(R$string.bkumex_contract_info, new Object[0]));
            c36856v2M34875u4.f81243k.setOffscreenPageLimit(this.f29635Y.size());
        }
        if (baseFragmentMo20622c != null && C24129b.m58030b(SiteVisibleConfigKey.CopyTrading)) {
            this.f29635Y.add(getStringRes(R$string.cp_trading_best_leader, new Object[0]));
        }
        c36856v2M34875u4.f81234b.m55279E(c36856v2M34875u4.f81243k, (CharSequence[]) this.f29635Y.toArray(new CharSequence[0]));
        c36856v2M34875u4.f81243k.addOnPageChangeListener(new C16324b());
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "kline_scroll_offset_key".length();
        }
        C12572a.m23692a(viewLifecycleOwner, false, new C16325xa6c00942("kline_scroll_offset_key", null, this, c36856v2M34875u4));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        if (c12573b.m23696a()) {
            "kline_update_price_key".length();
        }
        C12572a.m23692a(viewLifecycleOwner2, false, new C16326xa6c00943("kline_update_price_key", null, this, c36856v2M34875u4));
    }

    /* JADX INFO: renamed from: o5 */
    public static final Unit m34829o5(KuMexMarketInfoFragment kuMexMarketInfoFragment, MarketCoinInfoUiStatus marketCoinInfoUiStatus) {
        SlidingTabLayout slidingTabLayout;
        CustomViewPager customViewPager;
        String symbol = marketCoinInfoUiStatus.getSymbol();
        String str = kuMexMarketInfoFragment.f29632V;
        CustomViewPager customViewPager2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbol");
            str = null;
        }
        if (Intrinsics.areEqual(symbol, str) && !marketCoinInfoUiStatus.getHasCoinInfo()) {
            ArrayList arrayList = new ArrayList();
            BaseFragment baseFragmentMo20622c = KuMexDepend.f30378a.m35900b().mo20622c();
            arrayList.add(kuMexMarketInfoFragment.m34841w4());
            if (kuMexMarketInfoFragment.f29637a0) {
                arrayList.add(IQuoteFacadeService.f41383a.get().mo50703f(kuMexMarketInfoFragment.m34837t4(), "kline_futures"));
            }
            if (kuMexMarketInfoFragment.m34863i5()) {
                arrayList.add(kuMexMarketInfoFragment.m34877v4());
            }
            if (baseFragmentMo20622c != null && C24129b.m58030b(SiteVisibleConfigKey.CopyTrading)) {
                arrayList.add(baseFragmentMo20622c);
            }
            kuMexMarketInfoFragment.f29636Z = new C16341j(arrayList, kuMexMarketInfoFragment.getChildFragmentManager());
            C36856v2 c36856v2M34875u4 = kuMexMarketInfoFragment.m34875u4();
            if (c36856v2M34875u4 != null && (customViewPager = c36856v2M34875u4.f81243k) != null) {
                customViewPager.setAdapter(kuMexMarketInfoFragment.f29636Z);
            }
            kuMexMarketInfoFragment.f29635Y.clear();
            kuMexMarketInfoFragment.f29635Y.add(kuMexMarketInfoFragment.getStringRes(R$string.market_trade, new Object[0]));
            if (kuMexMarketInfoFragment.f29637a0) {
                kuMexMarketInfoFragment.f29635Y.add(kuMexMarketInfoFragment.getString(R$string.kc_market_feed_tab));
            }
            if (kuMexMarketInfoFragment.m34863i5()) {
                kuMexMarketInfoFragment.f29635Y.add(kuMexMarketInfoFragment.getStringRes(R$string.bkumex_contract_info, new Object[0]));
            }
            if (baseFragmentMo20622c != null && C24129b.m58030b(SiteVisibleConfigKey.CopyTrading)) {
                kuMexMarketInfoFragment.f29635Y.add(kuMexMarketInfoFragment.getStringRes(R$string.cp_trading_best_leader, new Object[0]));
            }
            C36856v2 c36856v2M34875u5 = kuMexMarketInfoFragment.m34875u4();
            if (c36856v2M34875u5 != null && (slidingTabLayout = c36856v2M34875u5.f81234b) != null) {
                C36856v2 c36856v2M34875u6 = kuMexMarketInfoFragment.m34875u4();
                if (c36856v2M34875u6 != null) {
                    customViewPager2 = c36856v2M34875u6.f81243k;
                }
                slidingTabLayout.m55279E(customViewPager2, (CharSequence[]) kuMexMarketInfoFragment.f29635Y.toArray(new CharSequence[0]));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p5 */
    public static final InterfaceC44974a m34831p5() {
        return (InterfaceC44974a) C42597a.m93386b().create(InterfaceC44974a.class);
    }

    /* JADX INFO: renamed from: y5 */
    public static final void m34845y5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z5 */
    public static final Unit m34847z5(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C37214b.m83255a(th2, "updateAiFlagInfo");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A4 */
    public final void m34848A4() {
        final C36856v2 c36856v2M34875u4;
        final FragmentActivity activity = getActivity();
        if (activity == null || (c36856v2M34875u4 = m34875u4()) == null) {
            return;
        }
        m34854G4(c36856v2M34875u4);
        c36856v2M34875u4.f81239g.f79825g.post(new Runnable() { // from class: com.kubi.kumex.market.v2.i1
            @Override // java.lang.Runnable
            public final void run() {
                KuMexMarketInfoFragment.m34752B4(this.f29798b, activity, c36856v2M34875u4);
            }
        });
    }

    /* JADX INFO: renamed from: B5 */
    public final void m34849B5(boolean z11) {
        C36856v2 c36856v2M34875u4 = m34875u4();
        if (c36856v2M34875u4 == null) {
            return;
        }
        AppCompatImageView appCompatImageView = c36856v2M34875u4.f81239g.f79820b;
        if (z11) {
            appCompatImageView.setImageResource(R$drawable.ic2_alert_select_20);
            appCompatImageView.clearColorFilter();
        } else {
            appCompatImageView.setImageResource(R$drawable.ic2_alert_unselect_20);
            Intrinsics.checkNotNull(appCompatImageView);
            C27046k.m66701p(appCompatImageView, ContextCompat.getColor(appCompatImageView.getContext(), R$color.emphasis));
        }
    }

    /* JADX INFO: renamed from: C5 */
    public final void m34850C5(boolean z11) {
        C36856v2 c36856v2M34875u4 = m34875u4();
        if (c36856v2M34875u4 == null) {
            return;
        }
        AppCompatImageView appCompatImageView = c36856v2M34875u4.f81239g.f79823e;
        if (z11) {
            appCompatImageView.setImageResource(R$drawable.ic2_favorite_select_20);
            appCompatImageView.clearColorFilter();
        } else {
            appCompatImageView.setImageResource(R$drawable.ic2_favorite_unselect_20);
            Intrinsics.checkNotNull(appCompatImageView);
            C27046k.m66701p(appCompatImageView, ContextCompat.getColor(appCompatImageView.getContext(), R$color.emphasis));
        }
    }

    /* JADX INFO: renamed from: D5 */
    public final void m34851D5() {
        Context context;
        C36856v2 c36856v2M34875u4 = m34875u4();
        if (c36856v2M34875u4 == null || (context = getContext()) == null) {
            return;
        }
        BaseTextView baseTextView = c36856v2M34875u4.f81239g.f79832n;
        String str = this.f29648l0;
        if (str == null) {
            str = "";
        }
        baseTextView.setText(str);
        c36856v2M34875u4.f81239g.f79832n.setTextColor(ContextCompat.getColor(context, R$color.c_text40));
    }

    /* JADX INFO: renamed from: J5 */
    public final void m34856J5(boolean z11) {
        C36856v2 c36856v2M34875u4 = m34875u4();
        if (c36856v2M34875u4 == null) {
            return;
        }
        InterfaceC44980d interfaceC44980dM20288g = RepositoryServiceLocator.f19236a.m20288g();
        String str = this.f29632V;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbol");
            str = null;
        }
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(interfaceC44980dM20288g, str, false, 2, null);
        if (contractEntityM99529O != null && contractEntityM99529O.isUsStock() && z11) {
            ShapeTextView lowLiquidityLabel = c36856v2M34875u4.f81239g.f79827i;
            Intrinsics.checkNotNullExpressionValue(lowLiquidityLabel, "lowLiquidityLabel");
            ViewExtKt.m66594y(lowLiquidityLabel);
            c36856v2M34875u4.f81239g.f79827i.setAlpha(1.0f);
        } else {
            ShapeTextView lowLiquidityLabel2 = c36856v2M34875u4.f81239g.f79827i;
            Intrinsics.checkNotNullExpressionValue(lowLiquidityLabel2, "lowLiquidityLabel");
            ViewExtKt.m66577h(lowLiquidityLabel2);
            c36856v2M34875u4.f81239g.f79827i.setAlpha(1.0f);
        }
        m34821l4();
    }

    /* JADX INFO: renamed from: K4 */
    public final void m34857K4() {
        Context context;
        Boolean boolValueOf;
        C36856v2 c36856v2M34875u4 = m34875u4();
        if (c36856v2M34875u4 == null || (context = getContext()) == null) {
            return;
        }
        c36856v2M34875u4.f81238f.setBackground(C22890g.m54287l(C22890g.m54291p(context), 24.0f));
        c36856v2M34875u4.f81242j.setBackground(C22890g.m54287l(C22890g.m54289n(context), 24.0f));
        BaseTextView buy = c36856v2M34875u4.f81238f;
        Intrinsics.checkNotNullExpressionValue(buy, "buy");
        ViewExtKt.m66575f(buy, new Function1() { // from class: com.kubi.kumex.market.v2.k1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexMarketInfoFragment.m34772L4(this.f29808b, (View) obj);
            }
        });
        BaseTextView sell = c36856v2M34875u4.f81242j;
        Intrinsics.checkNotNullExpressionValue(sell, "sell");
        ViewExtKt.m66575f(sell, new Function1() { // from class: com.kubi.kumex.market.v2.m1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexMarketInfoFragment.m34775M4(this.f29817b, (View) obj);
            }
        });
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46826v.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((InterfaceC46826v) objM56186h).m103157a(c36856v2M34875u4);
            return;
        }
        InterfaceC44980d interfaceC44980dM20288g = RepositoryServiceLocator.f19236a.m20288g();
        String str = this.f29632V;
        Boolean boolIsSupportFutures = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbol");
            str = null;
        }
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(interfaceC44980dM20288g, str, false, 2, null);
        if (contractEntityM99529O != null) {
            boolValueOf = Boolean.valueOf(contractEntityM99529O.getSupportGridTrading());
        } else {
            boolValueOf = null;
        }
        if (C27025c.m66566d(boolValueOf)) {
            RobotSiteConfigEntity robotSiteConfigEntity = (RobotSiteConfigEntity) C46392a.f104043a.m102336j(C46894j.f104736a.m103252Q(), RobotSiteConfigEntity.class, null);
            if (robotSiteConfigEntity != null) {
                boolIsSupportFutures = robotSiteConfigEntity.isSupportFutures();
            }
            if (C27025c.m66566d(boolIsSupportFutures) && C24129b.m58030b(SiteVisibleConfigKey.BotFuturesContractGrid)) {
                BaseTextView robot = c36856v2M34875u4.f81241i;
                Intrinsics.checkNotNullExpressionValue(robot, "robot");
                ViewExtKt.m66575f(robot, new Function1() { // from class: com.kubi.kumex.market.v2.n1
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return KuMexMarketInfoFragment.m34778N4((View) obj);
                    }
                });
                return;
            }
        }
        BaseTextView robot2 = c36856v2M34875u4.f81241i;
        Intrinsics.checkNotNullExpressionValue(robot2, "robot");
        ViewExtKt.m66577h(robot2);
    }

    /* JADX INFO: renamed from: P4 */
    public final void m34859P4() {
        C36856v2 c36856v2M34875u4 = m34875u4();
        if (c36856v2M34875u4 == null) {
            return;
        }
        FrameLayout bottomSheet = c36856v2M34875u4.f81236d;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        BottomSheetBehavior<?> bottomSheetBehaviorFrom = BottomSheetBehavior.from(bottomSheet);
        bottomSheetBehaviorFrom.setState(5);
        bottomSheetBehaviorFrom.setHideable(true);
        bottomSheetBehaviorFrom.setPeekHeight(0);
        bottomSheetBehaviorFrom.setDraggable(true);
        bottomSheetBehaviorFrom.addBottomSheetCallback(new C16336e());
        this.f29645i0 = bottomSheetBehaviorFrom;
        bottomSheet.setOnTouchListener(new View.OnTouchListener() { // from class: com.kubi.kumex.market.v2.r0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return KuMexMarketInfoFragment.m34783Q4(view, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: m5 */
    public final void m34866m5() {
        UsStockMarketStatus value = m34880x4().m35120o().getValue();
        if (value == null) {
            return;
        }
        m34865k5(value.getIsLowLiquidityPeriod(), value.getMarketSession());
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        m34880x4().m35122q();
        LottieAnimationView lottieAnimationView = this.f29641e0;
        if (lottieAnimationView != null) {
            lottieAnimationView.cancelAnimation();
        }
        this.f29641e0 = null;
        C44183g.f97524a.m97408f();
        ViewPager viewPager = (ViewPager) findViewById(R$id.viewPager);
        if (viewPager != null) {
            viewPager.setAdapter(null);
        }
        this.f29636Z = null;
        super.onDestroyView();
        C36976p.f82091a.m82794c(this);
        KlinePositionPushManager.f24259a.m27772a();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        m34880x4().m35122q();
    }

    /* JADX INFO: renamed from: v4 */
    public final Fragment m34877v4() {
        if (m34864j5()) {
            return m34882z4();
        }
        KuMexMarketFuturesInfoFragment.Companion companion = KuMexMarketFuturesInfoFragment.f29617c0;
        String str = this.f29632V;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbol");
            str = null;
        }
        return companion.instance(str);
    }

    /* JADX INFO: renamed from: w5 */
    public final void m34879w5(String str) {
        final C36856v2 c36856v2M34875u4 = m34875u4();
        if (c36856v2M34875u4 != null) {
            try {
                Observable observableObserveOn = InterfaceC44974a.m99450h0(m34881y4(), null, str, null, 5, null).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
                final Function1 function1 = new Function1() { // from class: com.kubi.kumex.market.v2.r1
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return KuMexMarketInfoFragment.m34843x5(this.f29834b, c36856v2M34875u4, (BaseEntity) obj);
                    }
                };
                Consumer consumer = new Consumer() { // from class: com.kubi.kumex.market.v2.s1
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        KuMexMarketInfoFragment.m34845y5(function1, obj);
                    }
                };
                final Function1 function2 = new Function1() { // from class: com.kubi.kumex.market.v2.p0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return KuMexMarketInfoFragment.m34847z5((Throwable) obj);
                    }
                };
                Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.market.v2.q0
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        KuMexMarketInfoFragment.m34750A5(function2, obj);
                    }
                });
                Intrinsics.checkNotNull(disposableSubscribe);
                DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
            } catch (Exception e11) {
                C37214b.m83255a(e11, "updateAiFlagInfo");
            }
        }
    }
}
