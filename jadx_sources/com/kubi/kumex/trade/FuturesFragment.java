package com.kubi.kumex.trade;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.os.BundleKt;
import androidx.credentials.provider.CredentialEntry;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import bi.C4609a;
import bi.C4610b;
import bi.C4616h;
import bi.C4619k;
import bi.C4622n;
import ci.InterfaceC4984e;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.C5313g;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.appbar.AppBarLayout;
import com.google.gson.reflect.TypeToken;
import com.kubi.assets.C11351z0;
import com.kubi.assets.entity.HoldEarnConstKt;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.broker.MultiBizType;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.copytrading.ICopyTradingFuturesDelegate;
import com.kubi.copytrading.ICopyTradingService;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.futures.FuturesRemote;
import com.kubi.futures.compliance.leverage.EuropeUnlockLeverageTips;
import com.kubi.futures.data.compliance.entity.EuropeUnlockLeverageLevelTaskEntity;
import com.kubi.futures.dialog.QtyUnitSelectDialog;
import com.kubi.futures.entry.IFuturesFragmentController;
import com.kubi.futures.mock.FuturesMockFragment;
import com.kubi.futures.settings.C13392j;
import com.kubi.futures.settings.TradingPreferencesFragment;
import com.kubi.futures.trade.FuturesTradeFragment;
import com.kubi.futures.trade.FuturesViewModel;
import com.kubi.futures.trade.position.FuturesPositionFragment;
import com.kubi.futures.trade.submit.FuturesSubmitFragment;
import com.kubi.futures.trade.submit.FuturesSubmitViewModel;
import com.kubi.futures.trade.submit.panel.premarket.PreMarketCountDownFragment;
import com.kubi.futures.trade.submit.panel.tradeType.BaseInputPanel;
import com.kubi.futures.trade.vm.FuturesComposeStreamViewModel;
import com.kubi.futures.trade.welfare.airdrop.AirDropBonusDialog;
import com.kubi.futures.trade.welfare.airdrop.AirDropDialogManager;
import com.kubi.futures.trade.welfare.airdrop.AirdropPositionPnlDetailsDialog;
import com.kubi.futures.trade.welfare.distribution.DistributionManager;
import com.kubi.futures.view.FuturesShimmer;
import com.kubi.futures.view.FuturesTraderProChallengeView;
import com.kubi.futures.view.KycLeadHelper;
import com.kubi.futures.view.KycLeadView;
import com.kubi.host.HostManager;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.PreMarketKey;
import com.kubi.kumex.data.market.model.TickerEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.ContractMaintainEntity;
import com.kubi.kumex.data.platform.model.FuturesAirdropProfitEntity;
import com.kubi.kumex.data.platform.model.FuturesBannerEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.data.platform.model.PreferencesEntity;
import com.kubi.kumex.data.platform.model.TradingNoticeEntity;
import com.kubi.kumex.data.trade.model.SymbolsCrossLeverage;
import com.kubi.kumex.data.welfare.AirdropBonusEntity;
import com.kubi.kumex.dialog.FuturesMoreMenuDialog;
import com.kubi.kumex.dialog.RiskWarningDialog;
import com.kubi.kumex.guide.GuideHelper;
import com.kubi.kumex.helper.BadgeHelper;
import com.kubi.kumex.helper.NoticeHelper;
import com.kubi.kumex.helper.V2Upgrade;
import com.kubi.kumex.kline.KumexSmallFlutterKlineFragment;
import com.kubi.kumex.market.tradingArea.child.DrawerListFragment;
import com.kubi.kumex.record.ContractRecordFragment;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.kumex.trade.menu.MenuItem;
import com.kubi.kumex.trade.order.TodoDelegateFragment;
import com.kubi.kumex.trade.viewModel.OrdersNum;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.kumex.utils.Persistence;
import com.kubi.mine.api.entity.KycStyleType;
import com.kubi.monitor.EventParametersBuilder;
import com.kubi.monitor.helper.TracePageHelper;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.p072ad.api.entity.ResAdEntity;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.p110rn.p111ui.KCBridgeRejecterError;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.quotefacade.entity.CurrencyFilterTransferData;
import com.kubi.quotefacade.entity.SymbolData;
import com.kubi.resources.C22890g;
import com.kubi.resources.ColorClickSpan;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.HoldingEarnEntryCardView;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.FragmentResultListener;
import com.kubi.sdk.flutter.C23767n;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.util.C24271s1;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.trade.core.biz.api.ITradeCoreService;
import com.kubi.tradebase.business.kyc.KycViewModel;
import com.kubi.tradingbotkit.api.ITradingBotService;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.user.api.IUserService;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.LoginUserEntity;
import com.kubi.utils.AbstractC27013a0;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27050g0;
import com.kubi.utils.C27063n;
import com.kubi.utils.C27100x0;
import com.kubi.utils.C27103z;
import com.kubi.utils.FlowableCompat;
import com.kubi.utils.FlowableCompatKt;
import com.kubi.utils.ObservableLast;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.C27032f;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.InterfaceC33568bf;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import com.trtc.uikit.livekit.p180kc.data.entity.ClickCardReport;
import dm.C36760f2;
import f00.C37304a;
import fm.C37567b;
import fm.C37569d;
import g00.InterfaceC37752d;
import g00.InterfaceC37754f;
import g00.InterfaceC37766r;
import gf.C37878b0;
import i60.InterfaceC38459b;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.processors.PublishProcessor;
import io.reactivex.rxkotlin.DisposableKt;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TimeZone;
import ki.C41050b;
import kotlinx.coroutines.C41696j;
import m50.RobotStrategyNumEvent;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p026ay.C4400a;
import p048c2.C4781a0;
import p236em.C37214b;
import p294gz.C38057a;
import p343ii.C38645a;
import p429lf.C42179a;
import p429lf.C42180b;
import p455mi.C42551e;
import p569qq.C43841b;
import p569qq.C43846g;
import p569qq.C43852m;
import p569qq.InterfaceC43850k;
import p663uh.InterfaceC45238b;
import p671uq.C45290a;
import p694vk.C45591t;
import p696vm.C45606a;
import p729wl.C45875l0;
import p766xm.C46284m;
import p801yl.C46527h0;
import p836zl.C46894j;
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
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import t30.C44685e;
import w00.C45681e;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: FuturesFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u0096\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 Î\u00012\u00020\u00012\u00020\u0002:\u0002Î\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010Q2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\u001a\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020M2\b\u0010P\u001a\u0004\u0018\u00010QH\u0016J\b\u0010W\u001a\u00020UH\u0002J\u0012\u0010X\u001a\u00020U2\b\u0010Y\u001a\u0004\u0018\u00010QH\u0016J\b\u0010Z\u001a\u00020UH\u0002J\b\u0010[\u001a\u00020UH\u0016J\b\u0010\\\u001a\u00020UH\u0016J\u0012\u0010]\u001a\u00020U2\b\u0010^\u001a\u0004\u0018\u00010_H\u0002J\b\u0010`\u001a\u00020UH\u0002J\b\u0010a\u001a\u00020UH\u0002J\u001c\u0010b\u001a\u0004\u0018\u0001Hc\"\n\b\u0000\u0010c\u0018\u0001*\u00020dH\u0082\b¢\u0006\u0002\u0010eJ\b\u0010f\u001a\u00020UH\u0002J\b\u0010g\u001a\u00020UH\u0002J\u0010\u0010h\u001a\u00020U2\u0006\u0010i\u001a\u00020(H\u0002J\b\u0010j\u001a\u00020(H\u0002J\b\u0010k\u001a\u00020UH\u0016J\b\u0010l\u001a\u00020UH\u0002J\b\u0010m\u001a\u00020UH\u0002J\b\u0010n\u001a\u00020UH\u0002J\b\u0010p\u001a\u00020UH\u0003J\u0010\u0010q\u001a\u00020U2\u0006\u0010r\u001a\u00020_H\u0002J\u0010\u0010s\u001a\u00020U2\u0006\u0010t\u001a\u00020uH\u0002J\b\u0010v\u001a\u00020UH\u0002J\b\u0010w\u001a\u00020UH\u0002J\u0012\u0010x\u001a\u00020U2\b\u0010y\u001a\u0004\u0018\u00010_H\u0002J\u0010\u0010z\u001a\u00020U2\u0006\u0010y\u001a\u00020_H\u0002J\b\u0010{\u001a\u00020UH\u0002J\b\u0010|\u001a\u00020UH\u0002J\u0015\u0010}\u001a\u00020U2\u0006\u0010~\u001a\u00020(H\u0000¢\u0006\u0002\b\u007fJ\t\u0010\u0080\u0001\u001a\u00020UH\u0002J\u0012\u0010\u0081\u0001\u001a\u00020U2\u0007\u0010y\u001a\u00030\u0082\u0001H\u0002J\u0013\u0010\u0083\u0001\u001a\u00020U2\b\u0010\u0084\u0001\u001a\u00030\u0085\u0001H\u0002J\u0013\u0010\u0086\u0001\u001a\u00020U2\b\u0010y\u001a\u0004\u0018\u00010_H\u0002J\t\u0010\u0087\u0001\u001a\u00020UH\u0002J\t\u0010\u0088\u0001\u001a\u00020UH\u0002J\u0007\u0010\u0089\u0001\u001a\u00020(J\t\u0010\u008a\u0001\u001a\u00020UH\u0002J\t\u0010\u008b\u0001\u001a\u00020UH\u0002J\t\u0010\u008c\u0001\u001a\u00020UH\u0002J\f\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008e\u0001H\u0002J\t\u0010\u008f\u0001\u001a\u00020UH\u0002J\t\u0010\u0090\u0001\u001a\u00020UH\u0002J\t\u0010\u0091\u0001\u001a\u00020(H\u0002J\t\u0010\u0092\u0001\u001a\u00020UH\u0002J\u0007\u0010\u0093\u0001\u001a\u00020(J\t\u0010\u0094\u0001\u001a\u00020UH\u0002J\t\u0010\u0095\u0001\u001a\u00020UH\u0002J\t\u0010\u0096\u0001\u001a\u00020UH\u0002J\t\u0010\u0097\u0001\u001a\u00020UH\u0002J\t\u0010\u0098\u0001\u001a\u00020UH\u0002J\t\u0010\u0099\u0001\u001a\u00020UH\u0002J\u0016\u0010\u009a\u0001\u001a\u00020U2\u000b\b\u0002\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u001dH\u0002J\t\u0010\u009c\u0001\u001a\u00020UH\u0016J\u0014\u0010\u009d\u0001\u001a\u00020U2\t\b\u0002\u0010\u009e\u0001\u001a\u00020\u001dH\u0002J\u0014\u0010\u009f\u0001\u001a\u00020U2\t\b\u0002\u0010\u009e\u0001\u001a\u00020\u001dH\u0002J\u0012\u0010 \u0001\u001a\u00020U2\u0007\u0010y\u001a\u00030¡\u0001H\u0002J\t\u0010¢\u0001\u001a\u00020UH\u0016J\t\u0010£\u0001\u001a\u00020UH\u0016J\u0012\u0010¤\u0001\u001a\u00020U2\u0007\u0010¥\u0001\u001a\u00020(H\u0016J\u0007\u0010¦\u0001\u001a\u00020\u001dJ\u0019\u0010§\u0001\u001a\u00020U2\b\u0010¨\u0001\u001a\u00030©\u0001H\u0000¢\u0006\u0003\bª\u0001J3\u0010§\u0001\u001a\u00020U2\u0007\u0010«\u0001\u001a\u00020%2\u0019\b\u0002\u0010¬\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0005\u0012\u00030®\u0001\u0018\u00010\u00ad\u0001H\u0000¢\u0006\u0003\bª\u0001J\u0007\u0010¯\u0001\u001a\u00020\u001dJ\t\u0010°\u0001\u001a\u00020UH\u0002J\u0007\u0010±\u0001\u001a\u00020(J\u0007\u0010²\u0001\u001a\u00020UJ\t\u0010³\u0001\u001a\u00020UH\u0002J\u0007\u0010´\u0001\u001a\u00020UJ\u0013\u0010µ\u0001\u001a\u00020U2\b\u0010¶\u0001\u001a\u00030\u0082\u0001H\u0002J\u001b\u0010·\u0001\u001a\u00020(2\n\u0010¸\u0001\u001a\u0005\u0018\u00010¹\u0001H\u0002¢\u0006\u0003\u0010º\u0001J\u0018\u0010»\u0001\u001a\u00020U2\u000f\u0010¼\u0001\u001a\n\u0012\u0005\u0012\u00030¾\u00010½\u0001J\t\u0010¿\u0001\u001a\u00020UH\u0002J\u001a\u0010À\u0001\u001a\u00020U2\u000f\u0010Á\u0001\u001a\n\u0012\u0005\u0012\u00030Â\u00010½\u0001H\u0002J,\u0010Ã\u0001\u001a\u00020U2\u0007\u0010Ä\u0001\u001a\u00020M2\b\u0010Å\u0001\u001a\u00030Â\u00012\u000e\u0010Æ\u0001\u001a\t\u0012\u0004\u0012\u00020U0Ç\u0001H\u0002J\t\u0010È\u0001\u001a\u00020\u0001H\u0002J\t\u0010É\u0001\u001a\u00020UH\u0002J\u001d\u0010Ê\u0001\u001a\u00020U2\b\u0010Ë\u0001\u001a\u00030¹\u00012\b\u0010Ì\u0001\u001a\u00030¹\u0001H\u0002J\t\u0010Í\u0001\u001a\u00020UH\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019R+\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0010\u001a\u0004\b\u001f\u0010 R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0004\n\u0002\u0010&R\u000e\u0010'\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u0010\u001a\u0004\b-\u0010.R\u001d\u00100\u001a\u0004\u0018\u00010\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u0010\u001a\u0004\b1\u00102R\u000e\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u00107\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\u0010\u001a\u0004\b9\u0010:R\u001b\u0010<\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\u0010\u001a\u0004\b>\u0010?R\u001b\u0010A\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010\u0010\u001a\u0004\bC\u0010DR\u001b\u0010F\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010\u0010\u001a\u0004\bH\u0010IR\u000e\u0010K\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010o\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Ï\u0001"}, m90084d2 = {"Lcom/kubi/kumex/trade/FuturesFragment;", "Lcom/kubi/sdk/BaseFragment;", "Lcom/kubi/futures/entry/IFuturesFragmentController;", "<init>", "()V", "bkumexFragmentFuturesBinding", "Lcom/kubi/kumex/databinding/BkumexFragmentFuturesBinding;", "getBkumexFragmentFuturesBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentFuturesBinding;", "bkumexFragmentFuturesBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "getMultiBizType", "()Lcom/kubi/broker/MultiBizType;", "multiBizType$delegate", "Lkotlin/Lazy;", "kycViewModel", "Lcom/kubi/tradebase/business/kyc/KycViewModel;", "getKycViewModel", "()Lcom/kubi/tradebase/business/kyc/KycViewModel;", "kycViewModel$delegate", "announcement", "Lcom/kubi/kumex/view/Announcement;", "getAnnouncement", "()Lcom/kubi/kumex/view/Announcement;", "announcement$delegate", "titleList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getTitleList", "()Ljava/util/ArrayList;", "titleList$delegate", "klineFragment", "Lcom/kubi/kumex/kline/KumexSmallFlutterKlineFragment;", "lastSmallKlineMainChart", "", "Ljava/lang/Integer;", "alreadyHandleComposeException", "", "alreadyTrackPreferences", "alreadyTrackTradingNotice", "futuresPositionFragment", "Lcom/kubi/futures/trade/position/FuturesPositionFragment;", "getFuturesPositionFragment", "()Lcom/kubi/futures/trade/position/FuturesPositionFragment;", "futuresPositionFragment$delegate", "robotStrategiesFragment", "getRobotStrategiesFragment", "()Lcom/kubi/sdk/BaseFragment;", "robotStrategiesFragment$delegate", "futuresUpgrade", "Lcom/kubi/kumex/helper/V2Upgrade;", "checkLoginexecuteOnce", "futuresComposeStreamViewModel", "Lcom/kubi/futures/trade/vm/FuturesComposeStreamViewModel;", "getFuturesComposeStreamViewModel", "()Lcom/kubi/futures/trade/vm/FuturesComposeStreamViewModel;", "futuresComposeStreamViewModel$delegate", "futuresViewModel", "Lcom/kubi/futures/trade/FuturesViewModel;", "getFuturesViewModel", "()Lcom/kubi/futures/trade/FuturesViewModel;", "futuresViewModel$delegate", "copyTradingDelegate", "Lcom/kubi/copytrading/ICopyTradingFuturesDelegate;", "getCopyTradingDelegate", "()Lcom/kubi/copytrading/ICopyTradingFuturesDelegate;", "copyTradingDelegate$delegate", "europeUnlockLeverageTips", "Lcom/kubi/futures/compliance/leverage/EuropeUnlockLeverageTips;", "getEuropeUnlockLeverageTips", "()Lcom/kubi/futures/compliance/leverage/EuropeUnlockLeverageTips;", "europeUnlockLeverageTips$delegate", "isLowLiquidityPeriod", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "refreshKlineToggleViewStatus", "onArguments", "bundle", "checkLogin", "onLoad", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "refreshLowLiquidityPolling", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "fetchBanner", "subscribeOrderPositionFragment", "findFragment", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/fragment/app/Fragment;", "()Landroidx/fragment/app/Fragment;", "handleKline", "refreshSmallKlineMainIndex", "updateKlineIcStyle", "klineShow", "isSmallKLineExpand", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "initListener", "toggleKline", "showToggleSymbol", "hasChangedSymbolOnHide", "initObserver", "refreshKlineContentStatus", "contractEntity", "handleComposeException", "exception", "Lcom/kubi/futures/exception/IFuturesCoreApiException;", "subscribe", "fetchAndRefresh", "updateSymbolText", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "onContractChange", "initHoldEarnCard", "showInterestNotice", "onTraderProChallengeVisibilityChanged", ViewProps.VISIBLE, "onTraderProChallengeVisibilityChanged$KumexLib_googleRelease", "refreshConvert2Perp", "onTickerChange", "Lcom/kubi/kumex/data/market/model/TickerEntity;", "setupLowLiquidityTips", "textView", "Landroid/widget/TextView;", "updateLowLiquidityTag", "handleRobot", "handleTrialFunds", "isShowTrialFundsDot", "handlePnlAnalyze", "handleTransfer", "handleTradeUnit", "getSubmitViewModelFromHierarchy", "Lcom/kubi/futures/trade/submit/FuturesSubmitViewModel;", "refreshLeadTradingWelfareIfNeeded", "refreshUnifiedFuturesCouponIfNeeded", "isClosePosition", "handlePreferences", "isTrial", "handleFuturesWelfare", "handleFundsCosts", "handleCalculator", "handleContractRecord", "handleTradingRules", "handleIndexPrice", "handleKuCoinIndexPrice", "symbol", "refresh", "fetchPreferencesSettings", "time", "fetchTradingNoticeSettings", "trackPreferenceSettings", "Lcom/kubi/kumex/data/platform/model/PreferencesEntity;", "onResume", "onDestroyView", "handleKlineInMaintenance", TIMPushProvider.f75062n, "getQtyUnit", "handlerMenuItemClicked", "menuItem", "Lcom/kubi/kumex/trade/menu/MenuItem;", "handlerMenuItemClicked$KumexLib_googleRelease", "id", ReportDataTable.COLUMN_PARAMS, "", "", "getFuturesBonusText", "hideFuturesBonusDot", "isShowFuturesBonusDot", "showPositionTab", "showLoading", "showContent", "checkFundingRateIsChange", "tickerEntity", "isFundingRateTimeBiggerCurrentTime", "effectiveFundingRateCycleStartTime", "", "(Ljava/lang/Long;)Z", "notifyEuropeUnlockLeverageTips", "tasks", "", "Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageLevelTaskEntity;", "initBannerView", "refreshBannerDataAndStatus", "bannerList", "Lcom/kubi/kumex/data/platform/model/FuturesBannerEntity;", "fillBannerItem", "itemView", "model", "onCloseClick", "Lkotlin/Function0;", "getTodoFragment", "observeLeverageChangeForRnOrderCenter", "notifyOrderChangeToRn", "basicOrderCount", "advancedOrderCount", "notifyOrderRefreshToRn", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"CheckResult"})
@SourceDebugExtension({"SMAP\nFuturesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesFragment.kt\ncom/kubi/kumex/trade/FuturesFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 7 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 8 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 DurationTracker.kt\ncom/kubi/monitor/DurationTrackerKt\n+ 11 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n+ 12 ViewExt.kt\ncom/kubi/utils/extensions/core/ViewExtKt\n+ 13 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 14 StorageId.kt\ncom/kubi/utils/storage/StorageId\n+ 15 KVStore.kt\ncom/kubi/utils/storage/KVStore\n*L\n1#1,2545:1\n618#1:2611\n147#2,16:2546\n106#3,15:2562\n106#3,15:2577\n153#4,7:2592\n76#4,7:2628\n153#4,7:2635\n76#4,7:2642\n76#4,7:2649\n158#4,2:2656\n256#5,2:2599\n256#5,2:2601\n254#5:2658\n256#5,2:2659\n256#5,2:2661\n256#5,2:2663\n310#5:2705\n326#5,4:2706\n311#5:2710\n35#6,4:2603\n39#6:2609\n44#7,2:2607\n84#8:2610\n126#8,2:2665\n136#8:2667\n153#8,2:2677\n144#8,2:2680\n84#8:2682\n144#8,2:2711\n1#9:2612\n1#9:2613\n46#10,14:2614\n34#11:2668\n372#12:2669\n1549#13:2670\n1620#13,3:2671\n1869#13,2:2674\n774#13:2683\n865#13,2:2684\n774#13:2686\n865#13,2:2687\n774#13:2689\n865#13,2:2690\n808#13,11:2692\n1869#13,2:2703\n46#14:2676\n178#15:2679\n*S KotlinDebug\n*F\n+ 1 FuturesFragment.kt\ncom/kubi/kumex/trade/FuturesFragment\n*L\n614#1:2611\n266#1:2546,16\n320#1:2562,15\n342#1:2577,15\n371#1:2592,7\n1003#1:2628,7\n1197#1:2635,7\n1201#1:2642,7\n1209#1:2649,7\n1393#1:2656,2\n424#1:2599,2\n438#1:2601,2\n1408#1:2658\n1528#1:2659,2\n1529#1:2661,2\n1530#1:2663,2\n1105#1:2705\n1105#1:2706,4\n1105#1:2710\n528#1:2603,4\n528#1:2609\n528#1:2607,2\n595#1:2610\n1551#1:2665,2\n1560#1:2667\n2016#1:2677,2\n2024#1:2680,2\n2070#1:2682\n2034#1:2711,2\n614#1:2612\n889#1:2614,14\n1836#1:2668\n1964#1:2669\n1964#1:2670\n1964#1:2671,3\n1964#1:2674,2\n784#1:2683\n784#1:2684,2\n785#1:2686\n785#1:2687,2\n1037#1:2689\n1037#1:2690,2\n1038#1:2692,11\n1039#1:2703,2\n2010#1:2676\n2016#1:2679\n*E\n"})
@InterfaceC43850k(pageId = "primary_page_contract")
public final class FuturesFragment extends BaseFragment implements IFuturesFragmentController {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public static final PublishProcessor<ContractEntity> f30413q0;

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public static final ScrollPredicate2<Object> f30414r0;

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f30415U = C45681e.m100799e(this, new Function1<FuturesFragment, C36760f2>() { // from class: com.kubi.kumex.trade.FuturesFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36760f2 invoke(@NotNull FuturesFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36760f2.m82372a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36760f2, Unit>() { // from class: com.kubi.kumex.trade.FuturesFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36760f2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36760f2 c36760f2) {
            invoke(c36760f2);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f30416V = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.trade.w2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FuturesFragment.m36009V7(this.f30750b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f30417W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f30418X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f30419Y;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public KumexSmallFlutterKlineFragment f30420Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public Integer f30421a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f30422b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f30423c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f30424d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final Lazy f30425e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final Lazy f30426f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final V2Upgrade f30427g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f30428h0;

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final Lazy f30429i0;

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public final Lazy f30430j0;

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public final Lazy f30431k0;

    /* JADX INFO: renamed from: l0 */
    @NotNull
    public final Lazy f30432l0;

    /* JADX INFO: renamed from: m0 */
    public boolean f30433m0;

    /* JADX INFO: renamed from: n0 */
    public boolean f30434n0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ KProperty<Object>[] f30412p0 = {Reflection.property1(new PropertyReference1Impl(FuturesFragment.class, "bkumexFragmentFuturesBinding", "getBkumexFragmentFuturesBinding()Lcom/kubi/kumex/databinding/BkumexFragmentFuturesBinding;", 0))};

    /* JADX INFO: renamed from: o0 */
    @NotNull
    public static final Companion f30411o0 = new Companion(null);

    /* JADX INFO: compiled from: FuturesFragment.kt */
    @Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\u0015J\u0014\u0010\u0016\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bJ\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0012J\u0012\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u001a\"\u0004\b\u0000\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/kumex/trade/FuturesFragment$Companion;", "", "<init>", "()V", "EXTRA_SET_ROOT_TOP_PADDING", "", "EXTRA_SHOW_LEADER_GUIDE_TIP", "refresh", "Lio/reactivex/processors/PublishProcessor;", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "kotlin.jvm.PlatformType", "scroll2", "Lcom/kubi/kumex/trade/ScrollPredicate2;", "newInstance", "Lcom/kubi/kumex/trade/FuturesFragment;", "type", "Lcom/kubi/broker/MultiBizType;", "setRootTopPadding", "", "showLeaderGuideTip", "performRefresh", "", "observeRefresh", "performScroll2", "isScroll", "scrollPredicate", "Lcom/kubi/utils/LastPredicate;", ExifInterface.GPS_DIRECTION_TRUE, "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nFuturesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesFragment.kt\ncom/kubi/kumex/trade/FuturesFragment$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2545:1\n1#2:2546\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ FuturesFragment newInstance$default(Companion companion, MultiBizType multiBizType, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z12 = false;
            }
            return companion.newInstance(multiBizType, z11, z12);
        }

        @NotNull
        public final FuturesFragment newInstance(@NotNull MultiBizType type, boolean setRootTopPadding, boolean showLeaderGuideTip) {
            Intrinsics.checkNotNullParameter(type, "type");
            FuturesFragment futuresFragment = new FuturesFragment();
            futuresFragment.setArguments(BundleKt.bundleOf(TuplesKt.m90091to("multiType", type.getValue()), TuplesKt.m90091to("set_root_top_padding", Boolean.valueOf(setRootTopPadding)), TuplesKt.m90091to("show_leader_guide_tip", Boolean.valueOf(showLeaderGuideTip))));
            return futuresFragment;
        }

        public final void performRefresh() {
            ContractEntity contractEntityM102673I = C46527h0.f104291a.m102673I();
            if (contractEntityM102673I != null) {
                FuturesFragment.f30413q0.onNext(contractEntityM102673I);
            }
        }

        public final void performScroll2(boolean isScroll) {
            if (isScroll) {
                FuturesFragment.f30414r0.m36283d();
            } else {
                FuturesFragment.f30414r0.m36284e();
            }
        }

        @NotNull
        public final PublishProcessor<ContractEntity> observeRefresh() {
            return FuturesFragment.f30413q0;
        }

        @NotNull
        public final <T> AbstractC27013a0<T> scrollPredicate() {
            ScrollPredicate2 scrollPredicate2 = FuturesFragment.f30414r0;
            Intrinsics.checkNotNull(scrollPredicate2, "null cannot be cast to non-null type com.kubi.utils.LastPredicate<T of com.kubi.kumex.trade.FuturesFragment.Companion.scrollPredicate>");
            return scrollPredicate2;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.trade.FuturesFragment$a */
    /* JADX INFO: compiled from: FuturesFragment.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, m90084d2 = {"com/kubi/kumex/trade/FuturesFragment$initListener$16", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", ViewProps.POSITION, "positionOffset", "", "positionOffsetPixels", "onPageSelected", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16817a implements ViewPager.OnPageChangeListener {
        public C16817a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(final int position) {
            GuideHelper.f29155a.m33886r(position == 1);
            C43852m.m96591c(C17060n0.m36552b(), "Position", String.valueOf(position + 1), null, 8, null);
            final FuturesFragment futuresFragment = FuturesFragment.this;
            C27100x0.m66924e(new Function0() { // from class: com.kubi.kumex.trade.i3
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesFragment.C16817a.m36205b(futuresFragment, position);
                }
            });
        }

        /* JADX INFO: renamed from: b */
        public static final Unit m36205b(FuturesFragment futuresFragment, int i11) {
            Object obj = futuresFragment.m36050g6().get(i11);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            String string = futuresFragment.getString(R$string.robot);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            if (StringsKt.startsWith$default((String) obj, string, false, 2, (Object) null)) {
                C43852m.m96591c(C17060n0.m36552b(), "botTab", "tab", null, 8, null);
            }
            return Unit.INSTANCE;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int state) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.trade.FuturesFragment$b */
    /* JADX INFO: compiled from: FuturesFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/kumex/trade/FuturesFragment$initListener$4", "Lcom/kubi/sdk/FragmentResultListener;", "onFragmentResult", "", DbParams.KEY_CHANNEL_RESULT, "Landroid/os/Bundle;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16818b implements FragmentResultListener {
        public C16818b() {
        }

        @Override // com.kubi.sdk.FragmentResultListener
        /* JADX INFO: renamed from: a */
        public void mo26171a(Bundle result) {
            Intrinsics.checkNotNullParameter(result, "result");
            Fragment fragmentFindFragmentByTag = FuturesFragment.this.getChildFragmentManager().findFragmentByTag("showToggleSymbol");
            DialogFragment dialogFragment = fragmentFindFragmentByTag instanceof DialogFragment ? (DialogFragment) fragmentFindFragmentByTag : null;
            if (dialogFragment != null) {
                dialogFragment.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.trade.FuturesFragment$c */
    /* JADX INFO: compiled from: FuturesFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nFuturesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesFragment.kt\ncom/kubi/kumex/trade/FuturesFragment$initObserver$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2545:1\n388#2,7:2546\n*S KotlinDebug\n*F\n+ 1 FuturesFragment.kt\ncom/kubi/kumex/trade/FuturesFragment$initObserver$1$1$1\n*L\n1008#1:2546,7\n*E\n"})
    public static final class C16819c implements Function0<Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RobotStrategyNumEvent f30437b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ FuturesFragment f30438c;

        public C16819c(RobotStrategyNumEvent robotStrategyNumEvent, FuturesFragment futuresFragment) {
            this.f30437b = robotStrategyNumEvent;
            this.f30438c = futuresFragment;
        }

        /* JADX INFO: renamed from: a */
        public final void m36206a() {
            int iNextIndex;
            SlidingTabLayout slidingTabLayout;
            if (Intrinsics.areEqual(this.f30437b.getType(), SearchCategory$Companion.FUTURES)) {
                ArrayList arrayListM36050g6 = this.f30438c.m36050g6();
                FuturesFragment futuresFragment = this.f30438c;
                ListIterator listIterator = arrayListM36050g6.listIterator(arrayListM36050g6.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    } else if (StringsKt.startsWith$default((String) listIterator.previous(), futuresFragment.getStringRes(R$string.robot, new Object[0]), false, 2, (Object) null)) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                if (iNextIndex != -1) {
                    if (this.f30437b.getNum() == null) {
                        this.f30438c.m36050g6().set(iNextIndex, this.f30438c.getStringRes(R$string.robot, new Object[0]));
                    } else {
                        this.f30438c.m36050g6().set(iNextIndex, this.f30438c.getStringRes(R$string.robot, new Object[0]) + " (" + this.f30437b.getNum() + ')');
                    }
                    C36760f2 c36760f2M36161U5 = this.f30438c.m36161U5();
                    if (c36760f2M36161U5 == null || (slidingTabLayout = c36760f2M36161U5.f80029b) == null) {
                        return;
                    }
                    FuturesFragment futuresFragment2 = this.f30438c;
                    TextView textViewM55289t = slidingTabLayout.m55289t(iNextIndex);
                    if (textViewM55289t != null) {
                        textViewM55289t.setText((CharSequence) futuresFragment2.m36050g6().get(iNextIndex));
                    }
                }
            }
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m36206a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.trade.FuturesFragment$d */
    /* JADX INFO: compiled from: FuturesFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/kumex/trade/FuturesFragment$initObserver$4", "Landroidx/lifecycle/Observer;", "", "onChanged", "", "occurredFallback", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16820d implements Observer<Boolean> {
        /* JADX INFO: renamed from: a */
        public void m36207a(boolean z11) {
            if (z11) {
                ToastCompat.m66465z(R$string.copytd_symbol_unsupport_tips);
                C46527h0.f104291a.m102672H();
            }
        }

        @Override // androidx.lifecycle.Observer
        public /* bridge */ /* synthetic */ void onChanged(Boolean bool) {
            m36207a(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.trade.FuturesFragment$e */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C16821e extends TypeToken<Boolean> {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: B8 */
    public static final Unit m35919B8(CurrencyFilterTransferData currencyFilterTransferData, KCBridgeRejecterError kCBridgeRejecterError) {
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

    /* JADX INFO: renamed from: O6 */
    private final void m35980O6() {
        BaseFragment baseFragmentM36042e6;
        Pair<String, BaseFragment> pairMo20631l;
        BaseFragment baseFragmentMo64978B;
        final C36760f2 c36760f2M36161U5 = m36161U5();
        if (c36760f2M36161U5 == null) {
            return;
        }
        TextView textView = (TextView) findViewById(R$id.tvLowLiquidityTips);
        if (textView != null) {
            m36198v8(textView);
        }
        LinearLayout rootView = c36760f2M36161U5.f80021D;
        Intrinsics.checkNotNullExpressionValue(rootView, "rootView");
        C44685e.m98846e(rootView, null, 1, null);
        if (DayNightThemeManager.f28592a.m33187l()) {
            c36760f2M36161U5.f80030c.setAnimation("futures_icon_day.json");
        } else {
            c36760f2M36161U5.f80030c.setAnimation("future_icon_night.json");
        }
        MultiBizType multiBizTypeM36172c6 = m36172c6();
        MultiBizType multiBizType = MultiBizType.UNIFIED;
        if (multiBizTypeM36172c6 == multiBizType || !C38057a.f85671a.m85928a("kcApp.B6FuturesTrade.futures.perks", true)) {
            LottieAnimationView activityIconLav = c36760f2M36161U5.f80030c;
            Intrinsics.checkNotNullExpressionValue(activityIconLav, "activityIconLav");
            C27046k.m66700o(activityIconLav);
        } else {
            LottieAnimationView activityIconLav2 = c36760f2M36161U5.f80030c;
            Intrinsics.checkNotNullExpressionValue(activityIconLav2, "activityIconLav");
            C27046k.m66685H(activityIconLav2);
        }
        LottieAnimationView activityIconLav3 = c36760f2M36161U5.f80030c;
        Intrinsics.checkNotNullExpressionValue(activityIconLav3, "activityIconLav");
        C27046k.m66711z(activityIconLav3, 0L, new Function0() { // from class: com.kubi.kumex.trade.d2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesFragment.m35985P6();
            }
        }, 1, null);
        GuideHelper guideHelper = GuideHelper.f29155a;
        guideHelper.m33887s(this);
        View view = getView();
        if (view != null) {
            guideHelper.m33875B(view);
        }
        String name = DrawerListFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        setFragmentResultListener(name, new C16818b());
        ImageView ivSymbol = c36760f2M36161U5.f80037j;
        Intrinsics.checkNotNullExpressionValue(ivSymbol, "ivSymbol");
        C44685e.m98845d(ivSymbol, new Action() { // from class: com.kubi.kumex.trade.e2
            @Override // io.reactivex.functions.Action
            public final void run() {
                FuturesFragment.m35990Q6(this.f30489b);
            }
        });
        BaseTextView symbol = c36760f2M36161U5.f80023F;
        Intrinsics.checkNotNullExpressionValue(symbol, "symbol");
        C44685e.m98845d(symbol, new Action() { // from class: com.kubi.kumex.trade.f2
            @Override // io.reactivex.functions.Action
            public final void run() {
                FuturesFragment.m35995R6(this.f30499b);
            }
        });
        c36760f2M36161U5.f80019B.m54650b(new Function0() { // from class: com.kubi.kumex.trade.g2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesFragment.m35999S6(this.f30509b, c36760f2M36161U5);
            }
        });
        AppCompatImageView ivKline = c36760f2M36161U5.f80036i;
        Intrinsics.checkNotNullExpressionValue(ivKline, "ivKline");
        ViewExtKt.m66575f(ivKline, new Function1() { // from class: com.kubi.kumex.trade.h2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFragment.m36005U6((View) obj);
            }
        });
        AppCompatImageView more = c36760f2M36161U5.f80049v;
        Intrinsics.checkNotNullExpressionValue(more, "more");
        ViewExtKt.m66575f(more, new Function1() { // from class: com.kubi.kumex.trade.i2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFragment.m36008V6(this.f30525b, (View) obj);
            }
        });
        AppCompatImageView klineTopToggleIv = c36760f2M36161U5.f80042o;
        Intrinsics.checkNotNullExpressionValue(klineTopToggleIv, "klineTopToggleIv");
        C27046k.m66711z(klineTopToggleIv, 0L, new Function0() { // from class: com.kubi.kumex.trade.j2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesFragment.m36012W6(this.f30531b);
            }
        }, 1, null);
        RelativeLayout klineToggle = c36760f2M36161U5.f80040m;
        Intrinsics.checkNotNullExpressionValue(klineToggle, "klineToggle");
        C44685e.m98845d(klineToggle, new Action() { // from class: com.kubi.kumex.trade.k2
            @Override // io.reactivex.functions.Action
            public final void run() {
                FuturesFragment.m36015X6(this.f30538b);
            }
        });
        C27032f.m66611b(this, R$id.submitContent, new FuturesTradeFragment(), null, 4, null);
        m36148K6();
        AppCompatImageView futuresHistory = c36760f2M36161U5.f80033f;
        Intrinsics.checkNotNullExpressionValue(futuresHistory, "futuresHistory");
        ViewExtKt.m66575f(futuresHistory, new Function1() { // from class: com.kubi.kumex.trade.m2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFragment.m36019Y6(this.f30553b, (View) obj);
            }
        });
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(m36176h6(), m36169Z5());
        if (m36172c6() == multiBizType && (baseFragmentMo64978B = IUnifyAccountService.f53155a.get().mo64978B(BundleKt.bundleOf(TuplesKt.m90091to("isFutures", CredentialEntry.TRUE_STRING)))) != null) {
            arrayListArrayListOf.add(baseFragmentMo64978B);
            m36050g6().add(getString(R$string.main_asset));
        }
        if (m36172c6() == MultiBizType.COPY_TRADING && (pairMo20631l = ICopyTradingService.f19723a.get().mo20631l()) != null) {
            m36050g6().add(pairMo20631l.getFirst());
            arrayListArrayListOf.add(pairMo20631l.getSecond());
        }
        if (m36172c6() == MultiBizType.CLASSIC && (baseFragmentM36042e6 = m36042e6()) != null) {
            arrayListArrayListOf.add(baseFragmentM36042e6);
            m36050g6().add(getString(R$string.robot));
        }
        RtlViewPager rtlViewPager = c36760f2M36161U5.f80050w;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rtlViewPager.setAdapter(new C27103z(childFragmentManager, arrayListArrayListOf, m36050g6()));
        c36760f2M36161U5.f80050w.setOffscreenPageLimit(arrayListArrayListOf.size() - 1);
        c36760f2M36161U5.f80050w.addOnPageChangeListener(new C16817a());
        c36760f2M36161U5.f80029b.setNeedBold(true);
        c36760f2M36161U5.f80029b.setViewPager(c36760f2M36161U5.f80050w);
        c36760f2M36161U5.f80029b.setCurrentTab(1);
        c36760f2M36161U5.f80029b.m55291w();
        m36194t5();
        if (m36162U7()) {
            c36760f2M36161U5.f80040m.performClick();
        }
        m36171a6().m26729x();
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: Z6 */
    private final void m36022Z6() {
        if (m36042e6() != null) {
            String name = RobotStrategyNumEvent.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (C12573b.f21598a.m23696a()) {
                name.length();
            }
            C12572a.m23692a(this, false, new C16822x2833d01f(name, null, this));
        }
        C46527h0 c46527h0 = C46527h0.f104291a;
        Flowable<ContractEntity> flowableObserveOn = c46527h0.m102687W().distinctUntilChanged().observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.trade.w
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFragment.m36055h7(this.f30748b, (ContractEntity) obj);
            }
        };
        Consumer<? super ContractEntity> consumer = new Consumer() { // from class: com.kubi.kumex.trade.j0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesFragment.m36058i7(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.kumex.trade.v0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFragment.m36062j7((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = flowableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.trade.h1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesFragment.m36068k7(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        c46527h0.m102680P().observe(getViewLifecycleOwner(), new C16820d());
        Flowable<ContractEntity> flowableM102687W = c46527h0.m102687W();
        Companion companion = f30411o0;
        Flowable flowableObserveOn2 = Flowable.merge(flowableM102687W, companion.observeRefresh()).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function3 = new Function1() { // from class: com.kubi.kumex.trade.k1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFragment.m36073l7(this.f30537b, (ContractEntity) obj);
            }
        };
        Consumer consumer2 = new Consumer() { // from class: com.kubi.kumex.trade.l1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesFragment.m36078m7(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.kumex.trade.m1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFragment.m36082n7((Throwable) obj);
            }
        };
        Disposable disposableSubscribe2 = flowableObserveOn2.subscribe(consumer2, new Consumer() { // from class: com.kubi.kumex.trade.n1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesFragment.m36088o7(function4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe2, getDestroyDisposable());
        Flowable<ContractEntity> flowableObserveOn3 = companion.observeRefresh().subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function5 = new Function1() { // from class: com.kubi.kumex.trade.o1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFragment.m36092p7((ContractEntity) obj);
            }
        };
        Consumer<? super ContractEntity> consumer3 = new Consumer() { // from class: com.kubi.kumex.trade.q1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesFragment.m36097q7(function5, obj);
            }
        };
        final Function1 function6 = new Function1() { // from class: com.kubi.kumex.trade.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFragment.m36100r7((Throwable) obj);
            }
        };
        Disposable disposableSubscribe3 = flowableObserveOn3.subscribe(consumer3, new Consumer() { // from class: com.kubi.kumex.trade.z
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesFragment.m36104s7(function6, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe3, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe3, getDestroyDisposable());
        Observable observable = Flowable.merge(c46527h0.m102687W(), companion.observeRefresh()).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        Observable<T> observableObserveOn = C27050g0.m66716a(observable, showPredicate()).observeOn(C42916f.m94128g());
        final Function1 function7 = new Function1() { // from class: com.kubi.kumex.trade.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFragment.m36107t7(this.f30444b, (ContractEntity) obj);
            }
        };
        Consumer consumer4 = new Consumer() { // from class: com.kubi.kumex.trade.b0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesFragment.m36111u7(function7, obj);
            }
        };
        final Function1 function8 = new Function1() { // from class: com.kubi.kumex.trade.c0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFragment.m36117v7((Throwable) obj);
            }
        };
        Disposable disposableSubscribe4 = observableObserveOn.subscribe(consumer4, new Consumer() { // from class: com.kubi.kumex.trade.d0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesFragment.m36121w7(function8, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe4, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe4, getDestroyDisposable());
        PublishProcessor publishProcessorD4 = m36169Z5().D4();
        final Function2 function9 = new Function2() { // from class: com.kubi.kumex.trade.e0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(FuturesFragment.m36126x7((Integer) obj, (Integer) obj2));
            }
        };
        Flowable flowableObserveOn4 = publishProcessorD4.distinctUntilChanged(new BiPredicate() { // from class: com.kubi.kumex.trade.f0
            @Override // io.reactivex.functions.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                return FuturesFragment.m36131y7(function9, obj, obj2);
            }
        }).observeOn(C42916f.m94128g());
        final Function1 function10 = new Function1() { // from class: com.kubi.kumex.trade.g0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFragment.m36136z7(this.f30507b, (Integer) obj);
            }
        };
        Disposable disposableSubscribe5 = flowableObserveOn4.subscribe(new Consumer() { // from class: com.kubi.kumex.trade.h0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesFragment.m35912A7(function10, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe5, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe5, getDestroyDisposable());
        RepositoryServiceLocator repositoryServiceLocator = RepositoryServiceLocator.f19236a;
        Observable observableMerge = Observable.merge(repositoryServiceLocator.m20288g().mo25007e0(), repositoryServiceLocator.m20288g().mo25021p());
        Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(...)");
        Observable observableObserveOn2 = FlowableCompatKt.m66397k(observableMerge).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function11 = new Function1() { // from class: com.kubi.kumex.trade.k0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFragment.m35918B7(this.f30536b, (ContractMaintainEntity) obj);
            }
        };
        Consumer consumer5 = new Consumer() { // from class: com.kubi.kumex.trade.l0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesFragment.m35923C7(function11, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.kubi.kumex.trade.m0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFragment.m35927D7((Throwable) obj);
            }
        };
        Disposable disposableSubscribe6 = observableObserveOn2.subscribe(consumer5, new Consumer() { // from class: com.kubi.kumex.trade.n0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesFragment.m35932E7(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe6, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe6, getDestroyDisposable());
        ObservableLast observableLastM66716a = C27050g0.m66716a(UserInfo.a.j(), showPredicate());
        final Function1 function13 = new Function1() { // from class: com.kubi.kumex.trade.o0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFragment.m35937F7((LoginUserEntity) obj);
            }
        };
        Observable<R> map = observableLastM66716a.map(new Function() { // from class: com.kubi.kumex.trade.p0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return FuturesFragment.m35942G7(function13, obj);
            }
        });
        final Function2 function14 = new Function2() { // from class: com.kubi.kumex.trade.q0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(FuturesFragment.m35947H7((String) obj, (String) obj2));
            }
        };
        Observable observableObserveOn3 = map.distinctUntilChanged((BiPredicate<? super R, ? super R>) new BiPredicate() { // from class: com.kubi.kumex.trade.r0
            @Override // io.reactivex.functions.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                return FuturesFragment.m35953I7(function14, obj, obj2);
            }
        }).observeOn(C42916f.m94128g());
        final Function1 function15 = new Function1() { // from class: com.kubi.kumex.trade.s0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFragment.m35958J7(this.f30700b, (String) obj);
            }
        };
        Consumer consumer6 = new Consumer() { // from class: com.kubi.kumex.trade.u0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesFragment.m35962K7(function15, obj);
            }
        };
        final Function1 function16 = new Function1() { // from class: com.kubi.kumex.trade.w0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFragment.m35967L7((Throwable) obj);
            }
        };
        Disposable disposableSubscribe7 = observableObserveOn3.subscribe(consumer6, new Consumer() { // from class: com.kubi.kumex.trade.x0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesFragment.m35972M7(function16, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe7, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe7, getDestroyDisposable());
        m36018Y5().m().observe(getViewLifecycleOwner(), new C16893k3.b(new Function1() { // from class: com.kubi.kumex.trade.y0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFragment.m35977N7(this.f30769b, (InterfaceC4984e) obj);
            }
        }));
        if (IUnifyAccountService.f53155a.get().mo64980D()) {
            m36018Y5().q().observe(getViewLifecycleOwner(), new C16893k3.b(new Function1() { // from class: com.kubi.kumex.trade.z0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesFragment.m35981O7(this.f30780b, (OrdersNum) obj);
                }
            }));
        } else {
            m36018Y5().r().observe(getViewLifecycleOwner(), new C16893k3.b(new Function1() { // from class: com.kubi.kumex.trade.a1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesFragment.m35986P7(this.f30445b, (Long) obj);
                }
            }));
        }
        Disposable disposableE = com.kubi.kumex.trade.order.p1.a.e();
        if (disposableE != null) {
            DisposableKt.addTo(disposableE, getDestroyDisposable());
        }
        m36170Z7();
        String name2 = PreMarketCountDownFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            name2.length();
        }
        C12572a.m23692a(this, false, new FuturesFragment$initObserver$$inlined$bindFlowEvent$default$1(name2, null, this));
        String name3 = C4609a.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
        if (c12573b.m23696a()) {
            name3.length();
        }
        C12572a.m23692a(this, false, new FuturesFragment$initObserver$$inlined$bindFlowEvent$default$2(name3, null, this));
        String name4 = C4622n.class.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "getName(...)");
        if (c12573b.m23696a()) {
            name4.length();
        }
        C12572a.m23692a(this, false, new FuturesFragment$initObserver$$inlined$bindFlowEvent$default$3(name4, null, this));
        m36029b6().m63182q().observe(getViewLifecycleOwner(), new C16893k3.b(new Function1() { // from class: com.kubi.kumex.trade.b1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFragment.m36025a7(this.f30462b, (KycStyleType) obj);
            }
        }));
        m36171a6().m26731z().observe(getViewLifecycleOwner(), new C16893k3.b(new Function1() { // from class: com.kubi.kumex.trade.c1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFragment.m36030b7(this.f30470b, (ResAdEntity) obj);
            }
        }));
        m36171a6().m26716D().observe(getViewLifecycleOwner(), new C16893k3.b(new Function1() { // from class: com.kubi.kumex.trade.d1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFragment.m36034c7(this.f30480b, (TickerEntity) obj);
            }
        }));
        m36171a6().m26713A().observe(getViewLifecycleOwner(), new C16893k3.b(new Function1() { // from class: com.kubi.kumex.trade.f1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFragment.m36038d7(this.f30498b, (Pair) obj);
            }
        }));
        m36171a6().m26718F().observe(getViewLifecycleOwner(), new C16893k3.b(new Function1() { // from class: com.kubi.kumex.trade.g1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFragment.m36043e7(this.f30508b, (Boolean) obj);
            }
        }));
        m36171a6().m26714B().observe(getViewLifecycleOwner(), new C16893k3.b(new Function1() { // from class: com.kubi.kumex.trade.i1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFragment.m36046f7(this.f30524b, (List) obj);
            }
        }));
        m36171a6().m26717E().observe(getViewLifecycleOwner(), new C16893k3.b(new Function1() { // from class: com.kubi.kumex.trade.j1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFragment.m36051g7(this.f30530b, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G6 */
    public final void m36144G6(int i11, @Nullable Map<String, ? extends Object> map) {
        if (i11 == 2) {
            m36140D6();
            return;
        }
        if (i11 == 3) {
            m36137A6();
            return;
        }
        if (i11 == 11) {
            m36197u6();
            return;
        }
        if (i11 == 12) {
            m36143F6();
            return;
        }
        if (i11 == 100) {
            BaseActivity.Companion companion = BaseActivity.INSTANCE;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            companion.launch(contextRequireContext, FuturesMockFragment.class, "Mock页面");
            return;
        }
        switch (i11) {
            case 5:
                m36199w6();
                break;
            case 6:
                m36186p6();
                if (m36172c6() != MultiBizType.UNIFIED) {
                    m36146J6();
                }
                break;
            case 7:
                m36184n6();
                break;
            case 8:
                m36178i6();
                break;
            case 9:
                m36201y6();
                break;
            default:
                switch (i11) {
                    case 1001:
                        m36138C6();
                        break;
                    case 1002:
                        m36190r6();
                        break;
                    case 1003:
                        C45606a.f102730a.m100690a("FundingRatePage");
                        break;
                    case 1004:
                        C45606a.f102730a.m100690a("ArbitragePage");
                        break;
                    case 1005:
                        C45606a.f102730a.m100690a("InsuranceFundPage");
                        break;
                    case 1006:
                        C45606a.f102730a.m100690a("RiskLimitPage");
                        break;
                    case 1007:
                        Object obj = map != null ? map.get("symbol") : null;
                        m36195t6(obj instanceof String ? (String) obj : null);
                        break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: U7 */
    public final boolean m36162U7() {
        int iM66765c = C27063n.m66765c("k_panel_position", 0, 1, null);
        return (iM66765c == 0 || iM66765c == 1) && Persistence.f30799a.m36516a("contract_small_k_line_expand", false);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onArguments(@Nullable Bundle bundle) {
        SlidingTabLayout slidingTabLayout;
        AppBarLayout appBarLayout;
        RtlViewPager rtlViewPager;
        PagerAdapter adapter;
        SlidingTabLayout slidingTabLayout2;
        AppBarLayout appBarLayout2;
        SlidingTabLayout slidingTabLayout3;
        AppBarLayout appBarLayout3;
        String strM56239b0 = bundle != null ? RouteExKt.m56239b0(bundle, "symbol") : null;
        if (!TextUtils.isEmpty(strM56239b0)) {
            C46527h0 c46527h0 = C46527h0.f104291a;
            Intrinsics.checkNotNull(strM56239b0);
            c46527h0.m102670E0(strM56239b0);
        }
        m36163V5().mo20618D0(bundle, this);
        String strM56284y = bundle != null ? RouteExKt.m56284y(bundle, "bottomTab") : null;
        if (Intrinsics.areEqual(strM56284y, ViewProps.POSITION)) {
            C36760f2 c36760f2M36161U5 = m36161U5();
            if (c36760f2M36161U5 != null && (appBarLayout3 = c36760f2M36161U5.f80031d) != null) {
                appBarLayout3.setExpanded(false);
            }
            C36760f2 c36760f2M36161U6 = m36161U5();
            if (c36760f2M36161U6 != null && (slidingTabLayout3 = c36760f2M36161U6.f80029b) != null) {
                slidingTabLayout3.setCurrentTab(1);
            }
        } else if (Intrinsics.areEqual(strM56284y, "order")) {
            C36760f2 c36760f2M36161U7 = m36161U5();
            if (c36760f2M36161U7 != null && (appBarLayout2 = c36760f2M36161U7.f80031d) != null) {
                appBarLayout2.setExpanded(false);
            }
            C36760f2 c36760f2M36161U8 = m36161U5();
            if (c36760f2M36161U8 != null && (slidingTabLayout2 = c36760f2M36161U8.f80029b) != null) {
                slidingTabLayout2.setCurrentTab(0);
            }
        } else if (Intrinsics.areEqual(strM56284y, "funds")) {
            C36760f2 c36760f2M36161U9 = m36161U5();
            if (C27039d.m66650j((c36760f2M36161U9 == null || (rtlViewPager = c36760f2M36161U9.f80050w) == null || (adapter = rtlViewPager.getAdapter()) == null) ? null : Integer.valueOf(adapter.getCount())) >= 3) {
                C36760f2 c36760f2M36161U10 = m36161U5();
                if (c36760f2M36161U10 != null && (appBarLayout = c36760f2M36161U10.f80031d) != null) {
                    appBarLayout.setExpanded(false);
                }
                C36760f2 c36760f2M36161U11 = m36161U5();
                if (c36760f2M36161U11 != null && (slidingTabLayout = c36760f2M36161U11.f80029b) != null) {
                    slidingTabLayout.setCurrentTab(2);
                }
            }
        }
        String strM56284y2 = bundle != null ? RouteExKt.m56284y(bundle, "couponCode") : null;
        if (strM56284y2 == null || strM56284y2.length() == 0) {
            return;
        }
        m36171a6().m26725s(strM56284y2);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    /* JADX WARN: Code duplicated, block: B:13:0x0018  */
    /* JADX INFO: renamed from: t6 */
    public final void m36195t6(String str) {
        ContractEntity contractEntityM102673I;
        String symbol = null;
        if (str == null) {
            contractEntityM102673I = C46527h0.f104291a.m102673I();
            if (contractEntityM102673I != null) {
                symbol = contractEntityM102673I.getSymbol();
            }
        } else {
            if (StringsKt.isBlank(str)) {
                str = null;
            }
            if (str == null) {
                contractEntityM102673I = C46527h0.f104291a.m102673I();
                if (contractEntityM102673I != null) {
                    symbol = contractEntityM102673I.getSymbol();
                }
            } else {
                symbol = str;
            }
        }
        Router.f46192a.m56184f(C23767n.m56883g("contract/kucoinIndexPrice", false)).m4038a("symbol", symbol).m4048k();
    }

    static {
        PublishProcessor<ContractEntity> publishProcessorCreate = PublishProcessor.create();
        Intrinsics.checkNotNullExpressionValue(publishProcessorCreate, "create(...)");
        f30413q0 = publishProcessorCreate;
        f30414r0 = new ScrollPredicate2<>();
    }

    /* JADX INFO: renamed from: A8 */
    private final void m35913A8() {
        IQuoteFacadeService.Companion companion = IQuoteFacadeService.f41383a;
        if (companion.get().mo50718w()) {
            try {
                IQuoteFacadeService iQuoteFacadeService = companion.get();
                FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                try {
                    iQuoteFacadeService.mo50714q(this, childFragmentManager, new CurrencyFilterTransferData(ClickCardReport.ReportData.CARD_TYPE_FUTURE, null, null, new SymbolData(C46527h0.f104291a.m102677L(), null, 2, null), 6, null), "TradeFuturesRnToggleSymbolDialog", new Function2() { // from class: com.kubi.kumex.trade.d3
                        @Override // p852kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return FuturesFragment.m35919B8((CurrencyFilterTransferData) obj, (KCBridgeRejecterError) obj2);
                        }
                    });
                } catch (Exception e11) {
                    e = e11;
                    C37214b.m83255a(e, "TradeFuturesRnToggleSymbolDialog");
                }
            } catch (Exception e12) {
                e = e12;
            }
        } else {
            ToggleSymbolDialogFragment toggleSymbolDialogFragmentNewInstance$default = ToggleSymbolDialogFragment.Companion.newInstance$default(ToggleSymbolDialogFragment.f30439s0, false, null, 3, null);
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
            toggleSymbolDialogFragmentNewInstance$default.show(childFragmentManager2, "showToggleSymbol");
        }
        View viewFindViewById = findViewById(R$id.naviBubble);
        C43852m.m96590b(C17060n0.m36552b(), "ContractSwitchEnter", "1", TuplesKt.m90091to("status", C27025c.m66566d(viewFindViewById != null ? Boolean.valueOf(C27046k.m66704s(viewFindViewById)) : null) ? TtmlNode.TEXT_EMPHASIS_MARK_OPEN : "close"));
        C43841b.m96557d("click_future_exchange", "click_start_btn", null, 4, null);
    }

    /* JADX INFO: renamed from: C8 */
    private final void m35924C8() {
        ObservableLast observableLastM66716a = C27050g0.m66716a(RepositoryServiceLocator.f19236a.m20286e().mo24802b(C46527h0.f104291a.m102677L()), f30411o0.scrollPredicate());
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.trade.s1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(FuturesFragment.m35928D8((TickerEntity) obj));
            }
        };
        Observable observableObserveOn = observableLastM66716a.filter(new Predicate() { // from class: com.kubi.kumex.trade.t1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return FuturesFragment.m35933E8(function1, obj);
            }
        }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function2 = new Function1() { // from class: com.kubi.kumex.trade.u1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFragment.m35938F8(this.f30719b, (TickerEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.kumex.trade.v1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesFragment.m35943G8(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.kumex.trade.w1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFragment.m35948H8(this.f30749b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.trade.x1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesFragment.m35954I8(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getVisibleDisposable());
    }

    /* JADX INFO: renamed from: D8 */
    public static final boolean m35928D8(TickerEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !com.kubi.futures.trade.submit.panel.premarket.g.a.o(C46527h0.f104291a.m102673I());
    }

    /* JADX INFO: renamed from: E6 */
    public static final Unit m35931E6() {
        if (KuMexDepend.f30378a.m35906h()) {
            BrokerConfig.f19211a.m20201d().mo20245y0(C37567b.m84620j(C46527h0.f104291a.m102673I()), "More", "5");
        } else {
            InterfaceC37752d.a.m85123b(C37304a.f82764a, C17060n0.m36552b(), Boolean.TRUE, null, C43852m.m96601m(C17060n0.m36552b(), "More", "5"), null, null, 52, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E8 */
    public static final boolean m35933E8(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: F5 */
    public static /* synthetic */ void m35936F5(FuturesFragment futuresFragment, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "300000";
        }
        futuresFragment.m36142E5(str);
    }

    /* JADX INFO: renamed from: F7 */
    public static final String m35937F7(LoginUserEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C27041f.m66668h(it.uid) + it.isHasOpenContract();
    }

    /* JADX INFO: renamed from: G5 */
    public static final PreferencesEntity m35941G5(String str) throws Throwable {
        PreferencesEntity preferencesEntityMo99977n = RepositoryServiceLocator.f19236a.m20290i().mo99977n(str);
        return preferencesEntityMo99977n == null ? new PreferencesEntity(null, null, null, null, null, null, null, 127, null) : preferencesEntityMo99977n;
    }

    /* JADX INFO: renamed from: G7 */
    public static final String m35942G7(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (String) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: H5 */
    public static final Unit m35946H5(FuturesFragment futuresFragment, PreferencesEntity preferencesEntity) throws JSONException {
        InterfaceC45238b interfaceC45238bM20290i = RepositoryServiceLocator.f19236a.m20290i();
        Intrinsics.checkNotNull(preferencesEntity);
        interfaceC45238bM20290i.mo99986i(preferencesEntity);
        C46527h0 c46527h0 = C46527h0.f104291a;
        boolean zM102674J = c46527h0.m102674J();
        NoticeHelper.f29301a.m34045H(futuresFragment, preferencesEntity, zM102674J);
        c46527h0.m102671F0(preferencesEntity, zM102674J);
        futuresFragment.m36151M8(preferencesEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H7 */
    public static final boolean m35947H7(String old, String current) {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(current, "current");
        return Intrinsics.areEqual(old, current);
    }

    /* JADX INFO: renamed from: H8 */
    public static final Unit m35948H8(FuturesFragment futuresFragment, Throwable th2) {
        futuresFragment.m36177h8(new TickerEntity(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null));
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I6 */
    public static /* synthetic */ void m35952I6(FuturesFragment futuresFragment, int i11, Map map, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            map = null;
        }
        futuresFragment.m36144G6(i11, map);
    }

    /* JADX INFO: renamed from: I7 */
    public static final boolean m35953I7(Function2 function2, Object p11, Object p12) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return ((Boolean) function2.invoke(p11, p12)).booleanValue();
    }

    /* JADX INFO: renamed from: K8 */
    public static final ArrayList m35963K8(FuturesFragment futuresFragment) {
        return CollectionsKt.arrayListOf(futuresFragment.getStringRes(R$string.todo_delegation, new Object[0]), futuresFragment.getStringRes(R$string.hold_position, new Object[0]));
    }

    /* JADX INFO: renamed from: L6 */
    public static final void m35966L6(final FuturesFragment futuresFragment, final C36760f2 c36760f2, BGABanner bGABanner, View itemView, final FuturesBannerEntity futuresBannerEntity, int i11) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        if (futuresBannerEntity != null) {
            futuresFragment.m36153O5(itemView, futuresBannerEntity, new Function0() { // from class: com.kubi.kumex.trade.e3
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesFragment.m35971M6(c36760f2, futuresFragment, futuresBannerEntity);
                }
            });
        }
    }

    /* JADX INFO: renamed from: M5 */
    public static /* synthetic */ void m35970M5(FuturesFragment futuresFragment, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "300000";
        }
        futuresFragment.m36149L5(str);
    }

    /* JADX INFO: renamed from: M6 */
    public static final Unit m35971M6(C36760f2 c36760f2, FuturesFragment futuresFragment, FuturesBannerEntity futuresBannerEntity) {
        c36760f2.f80048u.stopAutoPlay();
        c36760f2.f80048u.setVisibility(8);
        futuresFragment.m36171a6().m26724r(futuresBannerEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N5 */
    public static final Unit m35975N5(FuturesFragment futuresFragment, TradingNoticeEntity it) throws JSONException {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!futuresFragment.f30424d0) {
            futuresFragment.f30424d0 = true;
            C13392j.m26328o(it);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N6 */
    private final void m35976N6() {
        if (C12573b.f21598a.m23696a()) {
            HoldEarnConstKt.HOLD_EARN_OPEN_SUCC.length();
        }
        C12572a.m23692a(this, true, new FuturesFragment$initHoldEarnCard$$inlined$bindFlowEvent$1(HoldEarnConstKt.HOLD_EARN_OPEN_SUCC, null, this));
    }

    /* JADX INFO: renamed from: O7 */
    public static final Unit m35981O7(FuturesFragment futuresFragment, OrdersNum ordersNum) {
        SlidingTabLayout slidingTabLayout;
        TextView textViewM55289t;
        if (KuMexDepend.f30378a.m35905g().c()) {
            futuresFragment.m36167X7(ordersNum.getBasicNum(), ordersNum.getAdvancedNum());
            futuresFragment.m36050g6().set(0, futuresFragment.getStringRes(R$string.todo_delegation, new Object[0]) + " (" + ordersNum.getTotalNum() + ')');
        } else {
            futuresFragment.m36167X7(0L, 0L);
            futuresFragment.m36050g6().set(0, futuresFragment.getStringRes(R$string.todo_delegation, new Object[0]));
        }
        C36760f2 c36760f2M36161U5 = futuresFragment.m36161U5();
        if (c36760f2M36161U5 != null && (slidingTabLayout = c36760f2M36161U5.f80029b) != null && (textViewM55289t = slidingTabLayout.m55289t(0)) != null) {
            textViewM55289t.setText(futuresFragment.m36050g6().get(0));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P5 */
    public static final Unit m35984P5(FuturesBannerEntity futuresBannerEntity) {
        Router.f46192a.m56184f(C27041f.m66668h(futuresBannerEntity.getPath())).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P7 */
    public static final Unit m35986P7(FuturesFragment futuresFragment, Long l11) {
        SlidingTabLayout slidingTabLayout;
        TextView textViewM55289t;
        if (KuMexDepend.f30378a.m35905g().c()) {
            futuresFragment.m36050g6().set(0, futuresFragment.getStringRes(R$string.todo_delegation, new Object[0]) + " (" + l11 + ')');
        } else {
            futuresFragment.m36050g6().set(0, futuresFragment.getStringRes(R$string.todo_delegation, new Object[0]));
        }
        C36760f2 c36760f2M36161U5 = futuresFragment.m36161U5();
        if (c36760f2M36161U5 != null && (slidingTabLayout = c36760f2M36161U5.f80029b) != null && (textViewM55289t = slidingTabLayout.m55289t(0)) != null) {
            textViewM55289t.setText(futuresFragment.m36050g6().get(0));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S5 */
    public static final FuturesPositionFragment m35998S5() {
        return new FuturesPositionFragment();
    }

    /* JADX INFO: renamed from: U6 */
    public static final Unit m36005U6(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC37752d.a.m85122a(C37304a.f82764a, C46527h0.f104291a.m102677L(), null, null, null, 14, null);
        C43852m.m96591c(C17060n0.m36552b(), "KlineEnter", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V6 */
    public static final Unit m36008V6(FuturesFragment futuresFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C43852m.m96591c(C17060n0.m36552b(), "MoreClick", null, null, 12, null);
        FuturesMoreMenuDialog.Companion companion = FuturesMoreMenuDialog.f28850s0;
        ArrayList<MenuItem> arrayListM36302c = C16893k3.m36302c(futuresFragment);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM36302c) {
            if (((MenuItem) obj).isShow()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList<MenuItem> arrayListM36301b = C16893k3.m36301b(futuresFragment);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayListM36301b) {
            if (((MenuItem) obj2).isShow()) {
                arrayList3.add(obj2);
            }
        }
        FuturesMoreMenuDialog.Companion.newInstance$default(companion, arrayList2, new ArrayList(arrayList3), false, 4, null).show(futuresFragment.getChildFragmentManager(), "more");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y5 */
    private final FuturesComposeStreamViewModel m36018Y5() {
        return (FuturesComposeStreamViewModel) this.f30429i0.getValue();
    }

    /* JADX INFO: renamed from: Y6 */
    public static final Unit m36019Y6(FuturesFragment futuresFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C43852m.m96591c(C17060n0.m36552b(), "Position", "3", null, 8, null);
        futuresFragment.m36181l6();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a7 */
    public static final Unit m36025a7(FuturesFragment futuresFragment, KycStyleType kycStyleType) {
        if (kycStyleType == KycStyleType.SUCCESS) {
            GuideHelper.f29155a.m33893y(futuresFragment.getView());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b6 */
    private final KycViewModel m36029b6() {
        return (KycViewModel) this.f30417W.getValue();
    }

    /* JADX INFO: renamed from: b7 */
    public static final Unit m36030b7(FuturesFragment futuresFragment, ResAdEntity resAdEntity) {
        GuideHelper guideHelper = GuideHelper.f29155a;
        View view = futuresFragment.getView();
        Intrinsics.checkNotNull(resAdEntity);
        guideHelper.m33892x(view, resAdEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e6 */
    private final BaseFragment m36042e6() {
        return (BaseFragment) this.f30426f0.getValue();
    }

    /* JADX INFO: renamed from: f8 */
    public static final Unit m36047f8() {
        GuideHelper.f29155a.m33880j();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g6 */
    public final ArrayList<String> m36050g6() {
        return (ArrayList) this.f30419Y.getValue();
    }

    /* JADX INFO: renamed from: g8 */
    public static final Unit m36052g8() {
        GuideHelper.f29155a.m33877e();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h7 */
    public static final Unit m36055h7(FuturesFragment futuresFragment, ContractEntity contractEntity) {
        ITradingBotService.f52126a.get().mo63677a(contractEntity.getSymbol(), futuresFragment.m36042e6());
        IUnifyAccountService.f53155a.get().mo65010z(C27041f.m66669i(contractEntity.getSymbol(), "XBTUSDTM"));
        if (futuresFragment.isShowing()) {
            ContractsOfflineManager contractsOfflineManager = ContractsOfflineManager.f30505a;
            Intrinsics.checkNotNull(contractEntity);
            contractsOfflineManager.m36296h(futuresFragment, contractEntity);
        } else {
            futuresFragment.f30434n0 = true;
        }
        List<Fragment> fragments = futuresFragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            Fragment fragment = (Fragment) obj;
            if (fragment.isAdded() && fragment.getView() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList<InterfaceC38459b> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof InterfaceC38459b) {
                arrayList2.add(obj2);
            }
        }
        for (InterfaceC38459b interfaceC38459b : arrayList2) {
            String settleCurrency = contractEntity.getSettleCurrency();
            String str = "";
            if (settleCurrency == null) {
                settleCurrency = "";
            }
            String settleCurrency2 = contractEntity.getSettleCurrency();
            if (settleCurrency2 != null) {
                str = settleCurrency2;
            }
            interfaceC38459b.mo21309B2(new Pair<>(settleCurrency, str));
            interfaceC38459b.mo21311x(C27041f.m66669i(contractEntity.getSymbol(), "XBTUSDTM"));
        }
        if (contractEntity.isStock()) {
            C44128b.m97259c(futuresFragment.getTAG(), "RiskWarningDialog show");
            RiskWarningDialog.Companion companion = RiskWarningDialog.f28865r0;
            FragmentManager childFragmentManager = futuresFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            companion.showIfNeeded(childFragmentManager);
        }
        futuresFragment.m36191r8(contractEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n8 */
    public static final Unit m36083n8(FuturesFragment futuresFragment) {
        com.kubi.futures.trade.submit.panel.premarket.g gVar = com.kubi.futures.trade.submit.panel.premarket.g.a;
        FragmentManager childFragmentManager = futuresFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        gVar.u(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o6 */
    public static final Unit m36087o6() {
        if (KuMexDepend.f30378a.m35906h()) {
            InterfaceC37766r.a.m85190a(C37304a.f82764a, C45875l0.f103336a.m101347o0(), null, null, null, C43852m.m96601m(C17060n0.m36552b(), "More", "8"), null, null, 110, null);
        } else {
            InterfaceC37752d.a.m85123b(C37304a.f82764a, C17060n0.m36552b(), Boolean.TRUE, null, C43852m.m96601m(C17060n0.m36552b(), "More", "8"), null, null, 52, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p7 */
    public static final Unit m36092p7(ContractEntity contractEntity) {
        KuMexDepend.f30378a.m35902d().mo43960g(null);
        RepositoryServiceLocator.f19236a.m20288g().mo25003c(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q5 */
    public static final C46284m m36095q5() {
        return new C46284m();
    }

    /* JADX INFO: renamed from: u8 */
    public static final BaseFragment m36112u8() {
        return ITradingBotService.f52126a.get().mo63682g(SearchCategory$Companion.FUTURES);
    }

    /* JADX INFO: renamed from: v5 */
    public static final ICopyTradingFuturesDelegate m36115v5(FuturesFragment futuresFragment) {
        return KuMexDepend.f30378a.m35900b().mo20627h(futuresFragment);
    }

    /* JADX INFO: renamed from: v6 */
    public static final Unit m36116v6(FuturesFragment futuresFragment) {
        String str;
        if (IUnifyAccountService.f53155a.get().mo64979C()) {
            str = C11351z0.m20186a() + C11351z0.m20193h();
        } else {
            str = C11351z0.m20186a() + C11351z0.m20190e();
        }
        Router.f46192a.m56184f(str).m4048k();
        BadgeHelper.f29249a.m33967n(futuresFragment);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w5 */
    public static final EuropeUnlockLeverageTips m36120w5() {
        return new EuropeUnlockLeverageTips();
    }

    /* JADX INFO: renamed from: w8 */
    public static final Unit m36122w8(TextView textView, TextPaint ds2) {
        Intrinsics.checkNotNullParameter(ds2, "ds");
        ds2.setColor(ContextCompat.getColor(textView.getContext(), R$color.emphasis));
        ds2.setUnderlineText(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x6 */
    public static final Unit m36125x6() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x7 */
    public static final boolean m36126x7(Integer a11, Integer b11) {
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        return Intrinsics.areEqual(a11, b11) && a11.intValue() != 0;
    }

    /* JADX INFO: renamed from: x8 */
    public static final void m36127x8(View view) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, HostManager.a.m() + "/support/48142946141603", null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: y5 */
    public static final boolean m36130y5() {
        return RepositoryServiceLocator.f19236a.m20288g().mo24978D(C46527h0.f104291a.m102677L(), true) != null;
    }

    /* JADX INFO: renamed from: y7 */
    public static final boolean m36131y7(Function2 function2, Object p11, Object p12) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return ((Boolean) function2.invoke(p11, p12)).booleanValue();
    }

    /* JADX INFO: renamed from: z6 */
    public static final Unit m36135z6() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z7 */
    public static final Unit m36136z7(FuturesFragment futuresFragment, Integer num) {
        SlidingTabLayout slidingTabLayout;
        if (!KuMexDepend.f30378a.m35905g().c() || num.intValue() < 0) {
            futuresFragment.m36050g6().set(1, futuresFragment.getStringRes(R$string.hold_position, new Object[0]));
        } else {
            futuresFragment.m36050g6().set(1, futuresFragment.getStringRes(R$string.hold_position, new Object[0]) + " (" + num + ')');
        }
        C36760f2 c36760f2M36161U5 = futuresFragment.m36161U5();
        if (c36760f2M36161U5 != null && (slidingTabLayout = c36760f2M36161U5.f80029b) != null) {
            TextView textViewM55289t = slidingTabLayout.m55289t(1);
            if (textViewM55289t != null) {
                textViewM55289t.setText(futuresFragment.m36050g6().get(1));
            }
            View viewM55288r = slidingTabLayout.m55288r(1);
            if (viewM55288r != null) {
                ViewGroup.LayoutParams layoutParams = viewM55288r.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = -2;
                viewM55288r.setLayoutParams(layoutParams);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C6 */
    public final void m36138C6() {
        C4400a c4400aM56184f = Router.f46192a.m56184f(C23767n.m56883g("contract/contractRule", false));
        C46527h0 c46527h0 = C46527h0.f104291a;
        ContractEntity contractEntityM102673I = c46527h0.m102673I();
        C4400a c4400aM4038a = c4400aM56184f.m4038a("symbol", contractEntityM102673I != null ? contractEntityM102673I.getSymbol() : null);
        ContractEntity contractEntityM102673I2 = c46527h0.m102673I();
        c4400aM4038a.m4038a("isInverse", String.valueOf(contractEntityM102673I2 != null ? Boolean.valueOf(contractEntityM102673I2.isInverse()) : null)).m4048k();
    }

    /* JADX INFO: renamed from: D5 */
    public final void m36139D5() {
        BGABanner bGABanner;
        if (RepositoryServiceLocator.f19236a.m20288g().mo25031v() / 1000 >= C46392a.m102324f(C46894j.f104736a.m103276o(), 0L)) {
            C36760f2 c36760f2M36161U5 = m36161U5();
            if (c36760f2M36161U5 != null && (bGABanner = c36760f2M36161U5.f80048u) != null) {
                bGABanner.startAutoPlay();
            }
            m36171a6().m26727v(MultiLanguageManager.f46811g.getLocalString(), C46527h0.f104291a.m102677L());
        }
    }

    /* JADX INFO: renamed from: E5 */
    public final void m36142E5(final String str) {
        KuMexDepend kuMexDepend = KuMexDepend.f30378a;
        if (kuMexDepend.m35905g().c() && kuMexDepend.m35906h()) {
            Flowable flowableObserveOn = FlowableCompat.f54248a.m66385b(new Function0() { // from class: com.kubi.kumex.trade.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesFragment.m35941G5(str);
                }
            }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
            final Function1 function1 = new Function1() { // from class: com.kubi.kumex.trade.x
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesFragment.m35946H5(this.f30758b, (PreferencesEntity) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.kumex.trade.i0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    FuturesFragment.m35951I5(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.kumex.trade.t0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesFragment.m35957J5(this.f30710b, (Throwable) obj);
                }
            };
            Disposable disposableSubscribe = flowableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.trade.e1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    FuturesFragment.m35961K5(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        }
    }

    /* JADX INFO: renamed from: H6 */
    public final void m36145H6(@NotNull MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        m35952I6(this, menuItem.getId(), null, 2, null);
    }

    /* JADX INFO: renamed from: J6 */
    public final void m36146J6() {
        Long latestRewardTime = RepositoryServiceLocator.f19236a.m20292k().mo100574u().getLatestRewardTime();
        if (latestRewardTime != null) {
            BadgeHelper.f29249a.m33968o(this, latestRewardTime.longValue());
        }
    }

    /* JADX INFO: renamed from: L5 */
    public final void m36149L5(String str) {
        KuMexDepend kuMexDepend = KuMexDepend.f30378a;
        if (kuMexDepend.m35905g().c() && kuMexDepend.m35906h()) {
            C13392j.m26320g(this, str, new Function1() { // from class: com.kubi.kumex.trade.l2
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesFragment.m35975N5(this.f30545b, (TradingNoticeEntity) obj);
                }
            }, null, 8, null);
        }
    }

    /* JADX INFO: renamed from: M8 */
    public final void m36151M8(PreferencesEntity preferencesEntity) throws JSONException {
        if (this.f30423c0) {
            return;
        }
        this.f30423c0 = true;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("orderTpSlStatus", C27025c.m66566d(preferencesEntity.getStopProfitAndLoss()) ? TtmlNode.TEXT_EMPHASIS_MARK_OPEN : "close");
        jSONObject.put("positionStatus", C27025c.m66566d(preferencesEntity.getSeniorPosition()) ? TtmlNode.TEXT_EMPHASIS_MARK_OPEN : "close");
        jSONObject.put("fundingStatus", C27025c.m66566d(preferencesEntity.getFundingRate()) ? TtmlNode.TEXT_EMPHASIS_MARK_OPEN : "close");
        jSONObject.put("stopStatus", C27025c.m66566d(preferencesEntity.getConditionalOrder()) ? TtmlNode.TEXT_EMPHASIS_MARK_OPEN : "close");
        jSONObject.put("indexStatus", C27025c.m66566d(preferencesEntity.getIndexPrice()) ? TtmlNode.TEXT_EMPHASIS_MARK_OPEN : "close");
        jSONObject.put("advancedSetting", C27025c.m66566d(preferencesEntity.getSeniorOrder()) ? TtmlNode.TEXT_EMPHASIS_MARK_OPEN : "close");
        C43852m.m96605q("preference_status", jSONObject);
    }

    /* JADX INFO: renamed from: O5 */
    public final void m36153O5(View view, final FuturesBannerEntity futuresBannerEntity, final Function0<Unit> function0) {
        C44128b.m97258b("bieber.fill banner.. " + futuresBannerEntity);
        ((TextView) view.findViewById(R$id.marqueeView)).setText(new BannerItem(C27041f.m66668h(futuresBannerEntity.getTitle()), C27041f.m66668h(futuresBannerEntity.getPath())).getDisplayString());
        String strM66668h = C27041f.m66668h(futuresBannerEntity.getDisplayImageUrl());
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R$id.iv_announcement);
        if (strM66668h.length() > 0) {
            C5313g c5313gMo92213o0 = ComponentCallbacks2C5309c.m6556t(appCompatImageView.getContext()).mo6634v(strM66668h).mo92213o0(new C4781a0(C27040e.m66658b(18)));
            int i11 = R$drawable.ic2_announcement_16;
            Intrinsics.checkNotNull(c5313gMo92213o0.mo92188b0(i11).mo92208m(i11).mo92191d().m6594E0(appCompatImageView));
        } else {
            appCompatImageView.setImageDrawable(C27017c.f54310a.m66514c(R$drawable.ic_announcement_16, Integer.valueOf(R$color.primary)));
        }
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.kumex.trade.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesFragment.m35984P5(futuresBannerEntity);
            }
        }, 1, null);
        ImageView imageView = (ImageView) view.findViewById(R$id.iv_close);
        imageView.setImageTintList(ContextCompat.getColorStateList(imageView.getContext(), R$color.c_icon60));
        Intrinsics.checkNotNull(imageView);
        C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.kumex.trade.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesFragment.m35989Q5(function0);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: P8 */
    public final void m36155P8(final ContractEntity contractEntity) {
        if (contractEntity == null) {
            return;
        }
        runOnUiThread(new Function0() { // from class: com.kubi.kumex.trade.r2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesFragment.m35991Q8(this.f30690b, contractEntity);
            }
        });
    }

    /* JADX INFO: renamed from: S7 */
    public final boolean m36158S7() {
        return BadgeHelper.f29249a.m33972s(C27039d.m66652l(RepositoryServiceLocator.f19236a.m20292k().mo100574u().getLatestRewardTime()));
    }

    /* JADX INFO: renamed from: T5 */
    public final C46284m m36159T5() {
        return (C46284m) this.f30418X.getValue();
    }

    /* JADX INFO: renamed from: T7 */
    public final boolean m36160T7() {
        return !C46392a.m102322d(C46894j.f104736a.m103256U(), false);
    }

    /* JADX INFO: renamed from: U5 */
    public final C36760f2 m36161U5() {
        return (C36760f2) this.f30415U.getValue(this, f30412p0[0]);
    }

    /* JADX INFO: renamed from: V5 */
    public final ICopyTradingFuturesDelegate m36163V5() {
        return (ICopyTradingFuturesDelegate) this.f30431k0.getValue();
    }

    /* JADX INFO: renamed from: W5 */
    public final EuropeUnlockLeverageTips m36164W5() {
        return (EuropeUnlockLeverageTips) this.f30432l0.getValue();
    }

    /* JADX INFO: renamed from: W7 */
    public final void m36165W7(@NotNull List<EuropeUnlockLeverageLevelTaskEntity> tasks) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        m36164W5().m24678h(m36161U5(), tasks);
    }

    /* JADX INFO: renamed from: X7 */
    public final void m36167X7(long j11, long j12) {
        IReactNativeService iReactNativeService = IReactNativeService.INSTANCE.get();
        if (iReactNativeService != null) {
            iReactNativeService.nativeNotifyRn("onOrderCntUpdated", MapsKt.hashMapOf(TuplesKt.m90091to("basicOrderCount", Long.valueOf(j11)), TuplesKt.m90091to("advancedOrderCount", Long.valueOf(j12))));
        }
        m36168Y7();
    }

    /* JADX INFO: renamed from: Y7 */
    public final void m36168Y7() {
        IReactNativeService iReactNativeService;
        if (!IUnifyAccountService.f53155a.get().mo64980D() || (iReactNativeService = IReactNativeService.INSTANCE.get()) == null) {
            return;
        }
        iReactNativeService.nativeNotifyRn("orderCenterRefresh", null);
    }

    /* JADX INFO: renamed from: Z5 */
    public final FuturesPositionFragment m36169Z5() {
        return (FuturesPositionFragment) this.f30425e0.getValue();
    }

    /* JADX INFO: renamed from: Z7 */
    public final void m36170Z7() {
        if (IUnifyAccountService.f53155a.get().mo64980D()) {
            MultiBizFacadeManager multiBizFacadeManager = MultiBizFacadeManager.f19232a;
            Observable observableObserveOn = Observable.merge(multiBizFacadeManager.m20270i(m36172c6()).mo24472C(false).skip(1L), multiBizFacadeManager.m20270i(m36172c6()).mo24472C(true).skip(1L)).observeOn(C42916f.m94128g());
            final Function1 function1 = new Function1() { // from class: com.kubi.kumex.trade.y2
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesFragment.m36026a8(this.f30770b, (SymbolsCrossLeverage) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.kumex.trade.z2
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    FuturesFragment.m36031b8(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.kumex.trade.a3
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesFragment.m36035c8((Throwable) obj);
                }
            };
            Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.trade.b3
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    FuturesFragment.m36039d8(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        }
    }

    /* JADX INFO: renamed from: a6 */
    public final FuturesViewModel m36171a6() {
        return (FuturesViewModel) this.f30430j0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: c6 */
    public final MultiBizType m36172c6() {
        return (MultiBizType) this.f30416V.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: d6 */
    public final String m36173d6() {
        ContractEntity contractEntityM102673I = C46527h0.f104291a.m102673I();
        return contractEntityM102673I == null ? "" : C41050b.f91264a.m90021d().mo90014h(new C38645a(contractEntityM102673I));
    }

    /* JADX INFO: renamed from: h6 */
    public final BaseFragment m36176h6() {
        if (!IUnifyAccountService.f53155a.get().mo64980D()) {
            return TodoDelegateFragment.Y.newInstance();
        }
        return ITradeCoreService.f51346a.get().mo63102a("FUTURES", C46527h0.f104291a.m102677L());
    }

    /* JADX INFO: renamed from: i8 */
    public final void m36179i8(boolean z11) {
        if (!z11) {
            m36202y8();
            return;
        }
        View viewFindViewById = findViewById(R$id.interestNoticeLayout);
        if (viewFindViewById != null) {
            ViewExtKt.m66577h(viewFindViewById);
        }
    }

    /* JADX INFO: renamed from: j6 */
    public final void m36180j6(InterfaceC4984e interfaceC4984e) {
        if (this.f30422b0) {
            return;
        }
        this.f30422b0 = true;
        if (getChildFragmentManager().findFragmentByTag("ComposeExceptionDialog") != null) {
            return;
        }
        AlertDialogFragmentHelper alertDialogFragmentHelperM54169Z4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54165V4(R$drawable.ic2_common_warning).m54167X4(R$string.request_time_out).m54169Z4(true);
        String string = getString(R$string.request_time_out_message);
        Intrinsics.checkNotNull(string);
        alertDialogFragmentHelperM54169Z4.m54156M4(string).m54157N4(true).m54161R4(0).m54162S4(R$string.pay_advcash_withdraw_result_refresh, new DialogInterface.OnClickListener() { // from class: com.kubi.kumex.trade.u2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                FuturesFragment.m36067k6(this.f30720b, dialogInterface, i11);
            }
        }).m54159P4(R$string.cancel, null).m54193s3(this, "ComposeExceptionDialog");
    }

    /* JADX INFO: renamed from: l6 */
    public final void m36181l6() {
        IUserService.O(KuMexDepend.f30378a.m35905g(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.kumex.trade.p2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesFragment.m36077m6(this.f30669b);
            }
        }), 1, (Object) null);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_futures, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        GuideHelper.f29155a.m33885p();
        m36159T5().m102046m();
        com.kubi.kumex.trade.order.p1.a.j();
        m36171a6().m26723K();
        super.onDestroyView();
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        C36760f2 c36760f2M36161U5;
        LinearLayout linearLayout;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        f30414r0.m36284e();
        Bundle arguments = getArguments();
        if (arguments != null && RouteExKt.m56250h(arguments, "set_root_top_padding") && (c36760f2M36161U5 = m36161U5()) != null && (linearLayout = c36760f2M36161U5.f80021D) != null) {
            linearLayout.setPadding(0, EdgeToEdgeCompat.f48106a.m58272j(), 0, 0);
        }
        m35980O6();
        m36022Z6();
        onArguments(getArguments());
        if (C12573b.f21598a.m23696a()) {
            "handle_click_event".length();
        }
        C12572a.m23692a(this, false, new FuturesFragment$onViewCreated$$inlined$bindFlowEvent$default$1("handle_click_event", null, this));
        ICopyTradingFuturesDelegate iCopyTradingFuturesDelegateM36163V5 = m36163V5();
        C36760f2 c36760f2M36161U6 = m36161U5();
        LinearLayout linearLayout2 = c36760f2M36161U6 != null ? c36760f2M36161U6.f80021D : null;
        C36760f2 c36760f2M36161U7 = m36161U5();
        AppBarLayout appBarLayout = c36760f2M36161U7 != null ? c36760f2M36161U7.f80031d : null;
        C36760f2 c36760f2M36161U8 = m36161U5();
        iCopyTradingFuturesDelegateM36163V5.mo20617C0(linearLayout2, appBarLayout, c36760f2M36161U8 != null ? c36760f2M36161U8.f80050w : null);
        m36171a6().m26720H(new Consumer() { // from class: com.kubi.kumex.trade.p1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesFragment.m36063j8(this.f30668b, (FuturesWelfareTrialItemEntity) obj);
            }
        });
        m36171a6().m26719G(new Consumer() { // from class: com.kubi.kumex.trade.a2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesFragment.m36069k8(this.f30446b, (FuturesAirdropProfitEntity) obj);
            }
        });
        m36029b6().m63180n();
        showLoading();
        m36171a6().m26728w();
        AirDropDialogManager.f24559a.m28346h(this);
        m35976N6();
    }

    /* JADX INFO: renamed from: p8 */
    public final void m36187p8() {
        View view;
        RelativeLayout relativeLayout;
        BaseTextView baseTextView;
        RelativeLayout relativeLayout2;
        RelativeLayout relativeLayout3;
        View view2;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        View view3;
        RelativeLayout relativeLayout4;
        Boolean boolValueOf = null;
        int iM66765c = C27063n.m66765c("k_panel_position", 0, 1, null);
        if (iM66765c == 0) {
            C36760f2 c36760f2M36161U5 = m36161U5();
            if (c36760f2M36161U5 != null && (relativeLayout = c36760f2M36161U5.f80040m) != null) {
                ViewExtKt.m66577h(relativeLayout);
            }
            C36760f2 c36760f2M36161U6 = m36161U5();
            if (c36760f2M36161U6 == null || (view = c36760f2M36161U6.f80038k) == null) {
                return;
            }
            ViewExtKt.m66577h(view);
            return;
        }
        if (iM66765c != 1) {
            C36760f2 c36760f2M36161U7 = m36161U5();
            if (c36760f2M36161U7 != null && (relativeLayout4 = c36760f2M36161U7.f80040m) != null) {
                ViewExtKt.m66577h(relativeLayout4);
            }
            C36760f2 c36760f2M36161U8 = m36161U5();
            if (c36760f2M36161U8 == null || (view3 = c36760f2M36161U8.f80038k) == null) {
                return;
            }
            ViewExtKt.m66577h(view3);
            return;
        }
        C36760f2 c36760f2M36161U9 = m36161U5();
        boolean zM66566d = C27025c.m66566d((c36760f2M36161U9 == null || (frameLayout2 = c36760f2M36161U9.f80039l) == null) ? null : Boolean.valueOf(C27046k.m66704s(frameLayout2)));
        C36760f2 c36760f2M36161U10 = m36161U5();
        if (c36760f2M36161U10 != null && (view2 = c36760f2M36161U10.f80038k) != null) {
            C36760f2 c36760f2M36161U11 = m36161U5();
            if (c36760f2M36161U11 != null && (frameLayout = c36760f2M36161U11.f80039l) != null) {
                boolValueOf = Boolean.valueOf(C27046k.m66704s(frameLayout));
            }
            view2.setVisibility(C27025c.m66566d(boolValueOf) ? 0 : 8);
        }
        C36760f2 c36760f2M36161U12 = m36161U5();
        if (c36760f2M36161U12 == null || (baseTextView = c36760f2M36161U12.f80026I) == null) {
            return;
        }
        if (com.kubi.futures.trade.submit.panel.premarket.g.a.o(C46527h0.f104291a.m102673I())) {
            C36760f2 c36760f2M36161U13 = m36161U5();
            if (c36760f2M36161U13 != null && (relativeLayout3 = c36760f2M36161U13.f80040m) != null) {
                ViewExtKt.m66594y(relativeLayout3);
            }
            baseTextView.setText(getString(zM66566d ? R$string.home_rank_toggle : R$string.home_rank_expand));
            C27046k.m66694i(baseTextView, zM66566d ? R$drawable.ic2_triangle_top_12 : R$drawable.ic2_triangle_bottom_12, 2, 0, 4, null);
            return;
        }
        C36760f2 c36760f2M36161U14 = m36161U5();
        if (c36760f2M36161U14 != null && (relativeLayout2 = c36760f2M36161U14.f80040m) != null) {
            relativeLayout2.setVisibility(zM66566d ? 8 : 0);
        }
        baseTextView.setText(getString(R$string.home_rank_expand));
        C27046k.m66694i(baseTextView, R$drawable.ic2_triangle_bottom_12, 2, 0, 4, null);
    }

    /* JADX INFO: renamed from: r5 */
    public final void m36189r5(TickerEntity tickerEntity) {
        View viewFindViewById;
        final ShapeConstraintLayout shapeConstraintLayout = (ShapeConstraintLayout) findViewById(R$id.fundingRateChangeLayout);
        if (shapeConstraintLayout == null) {
            return;
        }
        ViewExtKt.m66577h(shapeConstraintLayout);
        boolean zM36157R7 = m36157R7(tickerEntity.getEffectiveFundingRateCycleStartTime());
        if (tickerEntity.getCurrentFundingRateGranularity() == null || tickerEntity.getGranularity() == null || !zM36157R7) {
            return;
        }
        final long jM66652l = C27039d.m66652l(tickerEntity.getGranularity());
        long jM66652l2 = C27039d.m66652l(tickerEntity.getCurrentFundingRateGranularity());
        if (jM66652l == jM66652l2) {
            return;
        }
        ContractEntity contractEntityM102673I = C46527h0.f104291a.m102673I();
        String str = "fundingRateChangeTips" + (contractEntityM102673I != null ? contractEntityM102673I.getSymbol() : null);
        StorageId<PreMarketKey> storageIdM103241F = C46894j.f104736a.m103241F();
        String category = storageIdM103241F.getCategory();
        storageIdM103241F.getKey();
        final StorageId storageId = new StorageId(category, str, storageIdM103241F.getStorageType(), storageIdM103241F.getSupportLegacy());
        PreMarketKey preMarketKey = (PreMarketKey) C46392a.f104043a.m102336j(storageId, PreMarketKey.class, null);
        if (preMarketKey == null) {
            preMarketKey = new PreMarketKey(null, null, 3, null);
        }
        if (C27039d.m66652l(preMarketKey.getGranularity()) == jM66652l) {
            Boolean boolIsClose = preMarketKey.isClose();
            if (boolIsClose != null ? boolIsClose.booleanValue() : false) {
                return;
            }
        } else {
            C46392a.m102331n(storageId, new PreMarketKey(Boolean.FALSE, Long.valueOf(jM66652l)));
        }
        ViewExtKt.m66594y(shapeConstraintLayout);
        TextView textView = (TextView) findViewById(R$id.fundingChangeContent);
        if (textView == null || (viewFindViewById = findViewById(R$id.ivFundingRateCloseTips)) == null) {
            return;
        }
        C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: com.kubi.kumex.trade.x2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesFragment.m36103s5(shapeConstraintLayout, storageId, jM66652l);
            }
        }, 1, null);
        Long effectiveFundingRateCycleStartTime = tickerEntity.getEffectiveFundingRateCycleStartTime();
        String strM92647l = C42180b.m92647l(effectiveFundingRateCycleStartTime != null ? C42179a.m92633f(effectiveFundingRateCycleStartTime.longValue(), null, false, false, null, 15, null) : null);
        int rawOffset = ((TimeZone.getDefault().getRawOffset() / 1000) / 60) / 60;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(rawOffset >= 0 ? "+" : "");
        sb2.append(rawOffset);
        String string = sb2.toString();
        long j11 = 1000;
        long j12 = 60;
        long j13 = ((jM66652l / j11) / j12) / j12;
        long j14 = ((jM66652l2 / j11) / j12) / j12;
        textView.setText(getStringRes(R$string.funding_rate_change_message, contractEntityM102673I != null ? FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM102673I) : null, strM92647l, "UTC" + string, Long.valueOf(j14), Long.valueOf(j13)));
    }

    /* JADX INFO: renamed from: r6 */
    public final void m36190r6() {
        C4400a c4400aM56184f = Router.f46192a.m56184f(C23767n.m56883g("contract/contractIndex", false));
        C46527h0 c46527h0 = C46527h0.f104291a;
        ContractEntity contractEntityM102673I = c46527h0.m102673I();
        C4400a c4400aM4038a = c4400aM56184f.m4038a("symbol", contractEntityM102673I != null ? contractEntityM102673I.getSymbol() : null);
        ContractEntity contractEntityM102673I2 = c46527h0.m102673I();
        c4400aM4038a.m4038a("isInverse", String.valueOf(contractEntityM102673I2 != null ? Boolean.valueOf(contractEntityM102673I2.isInverse()) : null)).m4048k();
    }

    /* JADX INFO: renamed from: r8 */
    public final void m36191r8(ContractEntity contractEntity) {
        if (contractEntity != null && contractEntity.isUsStock() && isShowing()) {
            m36171a6().m26723K();
            m36171a6().m26722J();
        } else {
            m36171a6().m26723K();
            this.f30433m0 = false;
            m36154O8(contractEntity);
        }
    }

    /* JADX INFO: renamed from: s8 */
    public final void m36193s8() {
        KumexSmallFlutterKlineFragment kumexSmallFlutterKlineFragment;
        int iM85525f = C37878b0.f85252a.m85525f();
        Integer num = this.f30421a0;
        this.f30421a0 = Integer.valueOf(iM85525f);
        if (num == null || num.intValue() == iM85525f || (kumexSmallFlutterKlineFragment = this.f30420Z) == null) {
            return;
        }
        kumexSmallFlutterKlineFragment.m24418o3(iM85525f);
    }

    /* JADX INFO: renamed from: t5 */
    public final void m36194t5() {
        KuMexDepend kuMexDepend = KuMexDepend.f30378a;
        if (TextUtils.isEmpty(kuMexDepend.m35905g().d0().id) || !kuMexDepend.m35905g().o() || this.f30428h0) {
            return;
        }
        this.f30428h0 = true;
        C43852m.m96591c(C17060n0.m36552b(), "appTradeAutoLoginShowTimes", "1", null, 8, null);
        IUserService.O(kuMexDepend.m35905g(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.kumex.trade.v2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesFragment.m36110u5();
            }
        }), 1, (Object) null);
    }

    /* JADX INFO: renamed from: u6 */
    public final void m36197u6() {
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: com.kubi.kumex.trade.z1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesFragment.m36116v6(this.f30781b);
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: renamed from: v8 */
    public final void m36198v8(final TextView textView) {
        String string = getString(R$string.kc_futures_us_stock_tips_rue);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        CharSequence string2 = getString(R$string.kumex_future_low_liquidity_period_desc, string);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        int iIndexOf$default = StringsKt.indexOf$default(string2, string, 0, false, 6, (Object) null);
        if (iIndexOf$default >= 0) {
            SpannableString spannableString = new SpannableString(string2);
            spannableString.setSpan(new ColorClickSpan(new Function1() { // from class: com.kubi.kumex.trade.s2
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesFragment.m36122w8(textView, (TextPaint) obj);
                }
            }, new View.OnClickListener() { // from class: com.kubi.kumex.trade.t2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FuturesFragment.m36127x8(view);
                }
            }), iIndexOf$default, string.length() + iIndexOf$default, 33);
            string2 = spannableString;
        }
        textView.setText(string2);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
    }

    /* JADX INFO: renamed from: x5 */
    public final void m36200x5() {
        if (C46527h0.f104291a.m102673I() != null) {
            f30411o0.performRefresh();
            return;
        }
        Flowable flowableObserveOn = FlowableCompat.f54248a.m66385b(new Function0() { // from class: com.kubi.kumex.trade.f3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(FuturesFragment.m36130y5());
            }
        }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.trade.g3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFragment.m36134z5((Boolean) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.kumex.trade.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesFragment.m35911A5(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.kumex.trade.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFragment.m35916B5((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = flowableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.trade.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesFragment.m35922C5(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    /* JADX INFO: renamed from: y8 */
    public final void m36202y8() {
        View viewFindViewById = findViewById(R$id.interestNoticeLayout);
        HoldingEarnEntryCardView holdingEarnEntryCardView = viewFindViewById instanceof HoldingEarnEntryCardView ? (HoldingEarnEntryCardView) viewFindViewById : null;
        if (holdingEarnEntryCardView == null) {
            return;
        }
        FuturesTraderProChallengeView futuresTraderProChallengeView = (FuturesTraderProChallengeView) findViewById(R$id.traderProChallengeView);
        if (futuresTraderProChallengeView == null || futuresTraderProChallengeView.getVisibility() != 0) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FuturesFragment$showInterestNotice$1(holdingEarnEntryCardView, this, null), 3, null);
        } else {
            ViewExtKt.m66577h(holdingEarnEntryCardView);
        }
    }

    public FuturesFragment() {
        setPageId(C17060n0.m36552b());
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.kumex.trade.FuturesFragment$special$$inlined$viewModels$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.kumex.trade.FuturesFragment$special$$inlined$viewModels$default$2
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
        this.f30417W = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(KycViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.kumex.trade.FuturesFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.kumex.trade.FuturesFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.kumex.trade.FuturesFragment$special$$inlined$viewModels$default$5
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
        this.f30418X = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.trade.h3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesFragment.m36095q5();
            }
        });
        this.f30419Y = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.trade.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesFragment.m35963K8(this.f30649b);
            }
        });
        this.f30425e0 = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.trade.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesFragment.m35998S5();
            }
        });
        this.f30426f0 = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.trade.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesFragment.m36112u8();
            }
        });
        this.f30427g0 = new V2Upgrade();
        this.f30429i0 = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.trade.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesFragment.m35994R5(this.f30679b);
            }
        });
        final Function0<Fragment> function2 = new Function0<Fragment>() { // from class: com.kubi.kumex.trade.FuturesFragment$special$$inlined$viewModels$default$6
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
        final Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.kumex.trade.FuturesFragment$special$$inlined$viewModels$default$7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function2.invoke();
            }

            {
                super(0);
            }
        });
        this.f30430j0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(FuturesViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.kumex.trade.FuturesFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy2).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.kumex.trade.FuturesFragment$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function3 = function1;
                if (function3 != null && (creationExtras = (CreationExtras) function3.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.kumex.trade.FuturesFragment$special$$inlined$viewModels$default$10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.f30431k0 = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.trade.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesFragment.m36115v5(this.f30688b);
            }
        });
        this.f30432l0 = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.trade.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesFragment.m36120w5();
            }
        });
    }

    /* JADX INFO: renamed from: A5 */
    public static final void m35911A5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: A7 */
    public static final void m35912A7(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B5 */
    public static final Unit m35916B5(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B6 */
    public static final boolean m35917B6(FuturesFragment futuresFragment) {
        FuturesSubmitViewModel futuresSubmitViewModelM36175f6 = futuresFragment.m36175f6();
        if (futuresSubmitViewModelM36175f6 != null) {
            return futuresSubmitViewModelM36175f6.T();
        }
        return false;
    }

    /* JADX INFO: renamed from: B7 */
    public static final Unit m35918B7(FuturesFragment futuresFragment, ContractMaintainEntity contractMaintainEntity) {
        futuresFragment.m36169Z5().C4();
        FuturesComposeStreamViewModel futuresComposeStreamViewModelM36018Y5 = futuresFragment.m36018Y5();
        Intrinsics.checkNotNull(contractMaintainEntity);
        futuresComposeStreamViewModelM36018Y5.h(contractMaintainEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C5 */
    public static final void m35922C5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: C7 */
    public static final void m35923C7(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: D7 */
    public static final Unit m35927D7(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E7 */
    public static final void m35932E7(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F8 */
    public static final Unit m35938F8(FuturesFragment futuresFragment, TickerEntity tickerEntity) {
        Intrinsics.checkNotNull(tickerEntity);
        futuresFragment.m36177h8(tickerEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G8 */
    public static final void m35943G8(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I5 */
    public static final void m35951I5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I8 */
    public static final void m35954I8(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: J5 */
    public static final Unit m35957J5(FuturesFragment futuresFragment, Throwable th2) {
        C44128b.m97259c(futuresFragment.getTAG(), C27041f.m66668h(th2.getMessage()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J7 */
    public static final Unit m35958J7(FuturesFragment futuresFragment, String str) {
        SlidingTabLayout slidingTabLayout;
        TextView textViewM55289t;
        EuropeUnlockLeverageTips.m24672i(futuresFragment.m36164W5(), futuresFragment.m36161U5(), null, 2, null);
        BadgeHelper.f29249a.m33965k(futuresFragment);
        futuresFragment.m36171a6().m26726t();
        boolean zC = KuMexDepend.f30378a.m35905g().c();
        futuresFragment.m36018Y5().u(zC);
        if (zC) {
            futuresFragment.m36142E5("0");
            futuresFragment.m36149L5("0");
            futuresFragment.m36171a6().m26730y();
            futuresFragment.m36171a6().m26729x();
            C36760f2 c36760f2M36161U5 = futuresFragment.m36161U5();
            if (c36760f2M36161U5 != null) {
                GuideHelper guideHelper = GuideHelper.f29155a;
                ConstraintLayout toolBar = c36760f2M36161U5.f80024G;
                Intrinsics.checkNotNullExpressionValue(toolBar, "toolBar");
                guideHelper.m33874A(toolBar);
            }
            futuresFragment.m36171a6().m26728w();
        } else {
            futuresFragment.m36050g6().set(0, futuresFragment.getStringRes(R$string.todo_delegation, new Object[0]));
            C36760f2 c36760f2M36161U6 = futuresFragment.m36161U5();
            if (c36760f2M36161U6 != null && (slidingTabLayout = c36760f2M36161U6.f80029b) != null && (textViewM55289t = slidingTabLayout.m55289t(0)) != null) {
                textViewM55289t.setText(futuresFragment.m36050g6().get(0));
            }
            RepositoryServiceLocator.f19236a.m20290i().mo99986i(new PreferencesEntity(null, null, null, null, null, null, null, 127, null));
            DistributionManager.f24703a.m28550e();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K5 */
    public static final void m35961K5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K7 */
    public static final void m35962K7(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: L7 */
    public static final Unit m35967L7(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M7 */
    public static final void m35972M7(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N7 */
    public static final Unit m35977N7(FuturesFragment futuresFragment, InterfaceC4984e interfaceC4984e) {
        Intrinsics.checkNotNull(interfaceC4984e);
        futuresFragment.m36180j6(interfaceC4984e);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P6 */
    public static final Unit m35985P6() {
        C43852m.m96591c(C17060n0.m36552b(), "Futures_Perks", null, null, 12, null);
        InterfaceC37766r.a.m85190a(C37304a.f82764a, C45875l0.f103336a.m101336E0(), null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q5 */
    public static final Unit m35989Q5(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q6 */
    public static final void m35990Q6(FuturesFragment futuresFragment) {
        futuresFragment.m35913A8();
    }

    /* JADX INFO: renamed from: Q8 */
    public static final Unit m35991Q8(FuturesFragment futuresFragment, ContractEntity contractEntity) {
        C36760f2 c36760f2M36161U5 = futuresFragment.m36161U5();
        if (c36760f2M36161U5 == null) {
            return Unit.INSTANCE;
        }
        c36760f2M36161U5.f80023F.setText(FuturesDisplayNameUtils.f22525a.m24442h(contractEntity));
        ShapeTextView perpLabel = c36760f2M36161U5.f80051x;
        Intrinsics.checkNotNullExpressionValue(perpLabel, "perpLabel");
        C27046k.m66684G(perpLabel, C37567b.m84625o(contractEntity));
        if (C37567b.m84625o(contractEntity)) {
            BaseTextView symbol = c36760f2M36161U5.f80023F;
            Intrinsics.checkNotNullExpressionValue(symbol, "symbol");
            ViewExtKt.m66585p(symbol, 0, 0, C27040e.m66658b(3), 0, 11, null);
        } else {
            BaseTextView symbol2 = c36760f2M36161U5.f80023F;
            Intrinsics.checkNotNullExpressionValue(symbol2, "symbol");
            ViewExtKt.m66585p(symbol2, 0, 0, C27040e.m66658b(8), 0, 11, null);
        }
        ShapeTextView shapeTextView = c36760f2M36161U5.f80051x;
        String string = futuresFragment.getString(R$string.perpetual_contract, "");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        shapeTextView.setText(StringsKt.trim((CharSequence) string).toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R5 */
    public static final FuturesComposeStreamViewModel m35994R5(FuturesFragment futuresFragment) {
        return com.kubi.futures.trade.vm.g1.a(futuresFragment);
    }

    /* JADX INFO: renamed from: R6 */
    public static final void m35995R6(FuturesFragment futuresFragment) {
        futuresFragment.m35913A8();
    }

    /* JADX INFO: renamed from: S6 */
    public static final Unit m35999S6(final FuturesFragment futuresFragment, final C36760f2 c36760f2) {
        futuresFragment.m36171a6().m26729x();
        futuresFragment.m36200x5();
        m35936F5(futuresFragment, null, 1, null);
        m35970M5(futuresFragment, null, 1, null);
        if (futuresFragment.m36172c6() == MultiBizType.UNIFIED) {
            IUnifyAccountService.Companion companion = IUnifyAccountService.f53155a;
            companion.get().mo64989c();
            companion.get().mo64995k();
        }
        BaseFragment.runOnUiThread$default(futuresFragment, new Function0() { // from class: com.kubi.kumex.trade.q2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesFragment.m36002T6(this.f30681b, c36760f2);
            }
        }, 1000L, null, 4, null);
        ContractEntity contractEntityM102673I = C46527h0.f104291a.m102673I();
        if (contractEntityM102673I != null) {
            futuresFragment.m36018Y5().i(C27041f.m66668h(contractEntityM102673I.getSymbol()));
        }
        String name = C4619k.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        C12572a.m23695d(name, C4619k.f4148a, 0L, 4, null);
        futuresFragment.m36163V5().mo20616B0();
        futuresFragment.m36018Y5().x();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T6 */
    public static final Unit m36002T6(FuturesFragment futuresFragment, C36760f2 c36760f2) {
        if (futuresFragment.getView() != null) {
            c36760f2.f80019B.setRefreshing(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V7 */
    public static final MultiBizType m36009V7(FuturesFragment futuresFragment) {
        Object objM56284y;
        Iterator<MultiBizType> it = MultiBizType.getEntries().iterator();
        while (true) {
            objM56284y = null;
            if (!it.hasNext()) {
                break;
            }
            MultiBizType next = it.next();
            String value = next.getValue();
            Bundle arguments = futuresFragment.getArguments();
            if (arguments != null) {
                objM56284y = RouteExKt.m56284y(arguments, "multiType");
            }
            if (Intrinsics.areEqual(value, objM56284y)) {
                objM56284y = next;
                break;
            }
        }
        MultiBizType multiBizType = (MultiBizType) objM56284y;
        if (multiBizType == null) {
            return MultiBizType.CLASSIC;
        }
        return multiBizType;
    }

    /* JADX INFO: renamed from: W6 */
    public static final Unit m36012W6(FuturesFragment futuresFragment) {
        futuresFragment.m36150L8();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X6 */
    public static final void m36015X6(FuturesFragment futuresFragment) {
        futuresFragment.m36150L8();
    }

    /* JADX INFO: renamed from: a8 */
    public static final Unit m36026a8(FuturesFragment futuresFragment, SymbolsCrossLeverage symbolsCrossLeverage) {
        futuresFragment.m36168Y7();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b8 */
    public static final void m36031b8(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c7 */
    public static final Unit m36034c7(FuturesFragment futuresFragment, TickerEntity tickerEntity) {
        Intrinsics.checkNotNull(tickerEntity);
        futuresFragment.m36189r5(tickerEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c8 */
    public static final Unit m36035c8(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C37214b.m83255a(th2, "FuturesFragment-observeCrossLeverageForRnOrderCenter");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d7 */
    public static final Unit m36038d7(FuturesFragment futuresFragment, Pair pair) {
        String str = (String) pair.getFirst();
        AirdropBonusEntity airdropBonusEntity = (AirdropBonusEntity) pair.getSecond();
        String symbol = airdropBonusEntity.getSymbol();
        if (symbol != null && symbol.length() != 0) {
            AirDropBonusDialog.Companion companion = AirDropBonusDialog.f24540w0;
            FragmentManager childFragmentManager = futuresFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            companion.show(childFragmentManager, airdropBonusEntity, str);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d8 */
    public static final void m36039d8(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e7 */
    public static final Unit m36043e7(FuturesFragment futuresFragment, Boolean bool) {
        if (bool.booleanValue()) {
            GuideHelper.f29155a.m33890v(futuresFragment.getContentView());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f7 */
    public static final Unit m36046f7(FuturesFragment futuresFragment, List list) {
        Intrinsics.checkNotNull(list);
        futuresFragment.m36182l8(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g7 */
    public static final Unit m36051g7(FuturesFragment futuresFragment, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        futuresFragment.f30433m0 = bool.booleanValue();
        futuresFragment.m36154O8(C46527h0.f104291a.m102673I());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i7 */
    public static final void m36058i7(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j7 */
    public static final Unit m36062j7(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j8 */
    public static final void m36063j8(FuturesFragment futuresFragment, FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity) {
        if (futuresFragment.isAdded() && futuresWelfareTrialItemEntity != null) {
            DistributionManager.f24703a.m28549d(futuresFragment, futuresWelfareTrialItemEntity);
        }
    }

    /* JADX INFO: renamed from: k6 */
    public static final void m36067k6(FuturesFragment futuresFragment, DialogInterface dialogInterface, int i11) {
        futuresFragment.m36018Y5().t(futuresFragment.m36172c6());
    }

    /* JADX INFO: renamed from: k7 */
    public static final void m36068k7(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k8 */
    public static final void m36069k8(FuturesFragment futuresFragment, FuturesAirdropProfitEntity futuresAirdropProfitEntity) {
        if (futuresFragment.isAdded() && futuresAirdropProfitEntity != null) {
            BigDecimal withdrawAmount = futuresAirdropProfitEntity.getWithdrawAmount();
            if (withdrawAmount == null) {
                withdrawAmount = BigDecimal.ZERO;
            }
            if (withdrawAmount.compareTo(BigDecimal.ZERO) > 0) {
                AirdropPositionPnlDetailsDialog.Companion companion = AirdropPositionPnlDetailsDialog.f24569s0;
                FragmentManager childFragmentManager = futuresFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                companion.show(childFragmentManager, futuresAirdropProfitEntity);
            }
            String name = C4610b.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            C12572a.m23695d(name, C4610b.f4138a, 0L, 4, null);
        }
    }

    /* JADX INFO: renamed from: l7 */
    public static final Unit m36073l7(FuturesFragment futuresFragment, ContractEntity contractEntity) {
        Intrinsics.checkNotNull(contractEntity);
        futuresFragment.m36174e8(contractEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m6 */
    public static final Unit m36077m6(FuturesFragment futuresFragment) {
        Context context = futuresFragment.getContext();
        if (context == null) {
            return Unit.INSTANCE;
        }
        if (!KuMexDepend.f30378a.m35906h()) {
            ToastCompat.m66441G(futuresFragment.getStringRes(R$string.no_open_contract, new Object[0]), new Object[0]);
        } else {
            BaseActivity.INSTANCE.launch(context, ContractRecordFragment.class, C24271s1.m58530b(BundleKt.bundleOf(TuplesKt.m90091to("page", "TodoDelegates"), TuplesKt.m90091to("ordersType", "ActiveDelegates")), C17060n0.m36552b(), "Position", "3"));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m7 */
    public static final void m36078m7(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n7 */
    public static final Unit m36082n7(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o7 */
    public static final void m36088o7(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q6 */
    public static final Unit m36096q6(FuturesFragment futuresFragment) {
        String symbol;
        if (futuresFragment.m36172c6() == MultiBizType.UNIFIED) {
            C42551e c42551e = C42551e.f94227a;
            ContractEntity contractEntityM102673I = C46527h0.f104291a.m102673I();
            if (contractEntityM102673I != null) {
                symbol = contractEntityM102673I.getSymbol();
            } else {
                symbol = null;
            }
            c42551e.m93285b(symbol);
        } else {
            InterfaceC37752d.a.m85127f(C37304a.f82764a, null, null, null, null, 15, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q7 */
    public static final void m36097q7(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r7 */
    public static final Unit m36100r7(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s5 */
    public static final Unit m36103s5(ShapeConstraintLayout shapeConstraintLayout, StorageId storageId, long j11) {
        ViewExtKt.m66577h(shapeConstraintLayout);
        C46392a.m102331n(storageId, new PreMarketKey(Boolean.TRUE, Long.valueOf(j11)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s7 */
    public static final void m36104s7(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void showLoading() {
        C36760f2 c36760f2M36161U5 = m36161U5();
        if (c36760f2M36161U5 == null) {
            return;
        }
        LinearLayout linearLayout = c36760f2M36161U5.f80021D;
        Context context = c36760f2M36161U5.f80021D.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        linearLayout.addView(new FuturesShimmer(context), 0, new ViewGroup.MarginLayoutParams(-1, -1));
    }

    /* JADX INFO: renamed from: t7 */
    public static final Unit m36107t7(FuturesFragment futuresFragment, ContractEntity contractEntity) {
        Intrinsics.checkNotNull(contractEntity);
        futuresFragment.m36185o8(contractEntity);
        futuresFragment.getVisibleDisposable().clear();
        futuresFragment.m35924C8();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u5 */
    public static final Unit m36110u5() {
        C43852m.m96591c(C17060n0.m36552b(), "appTradeAutoLoginSuccess", "1", null, 8, null);
        InterfaceC37754f.a.m85131c(C37304a.f82764a, null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u7 */
    public static final void m36111u7(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v7 */
    public static final Unit m36117v7(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w7 */
    public static final void m36121w7(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z5 */
    public static final Unit m36134z5(Boolean bool) {
        if (bool.booleanValue()) {
            f30411o0.performRefresh();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A6 */
    public final void m36137A6() {
        if (getContext() == null) {
            return;
        }
        QtyUnitSelectDialog qtyUnitSelectDialog = new QtyUnitSelectDialog();
        Bundle bundle = new Bundle();
        bundle.putString("symbol", C46527h0.f104291a.m102677L());
        bundle.putBoolean("data", m36156Q7());
        qtyUnitSelectDialog.setArguments(bundle);
        qtyUnitSelectDialog.m25227x4(new Function0() { // from class: com.kubi.kumex.trade.b2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(FuturesFragment.m35917B6(this.f30463b));
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        qtyUnitSelectDialog.show(childFragmentManager, "QtyUnitSelectDialog");
    }

    @Override // com.kubi.futures.entry.IFuturesFragmentController
    /* JADX INFO: renamed from: B0 */
    public void mo20214B0() {
        ViewGroup.LayoutParams layoutParams;
        CoordinatorLayout.LayoutParams layoutParams2;
        CoordinatorLayout.Behavior behavior;
        C36760f2 c36760f2M36161U5 = m36161U5();
        if (c36760f2M36161U5 == null) {
            return;
        }
        AppBarLayout appBarLayout = c36760f2M36161U5.f80031d;
        AppBarLayout.Behavior behavior2 = null;
        if (appBarLayout != null) {
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
        KuCoinRefreshLayout kuCoinRefreshLayout = c36760f2M36161U5.f80019B;
        if (kuCoinRefreshLayout != null) {
            kuCoinRefreshLayout.autoRefresh();
        }
        m36168Y7();
    }

    /* JADX INFO: renamed from: D6 */
    public final void m36140D6() {
        C43852m.m96591c(C17060n0.m36552b(), "More", "5", null, 8, null);
        IUserService.O(KuMexDepend.f30378a.m35905g(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.kumex.trade.r1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesFragment.m35931E6();
            }
        }), 1, (Object) null);
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m36141E0() {
        Boolean boolValueOf;
        SwitchCompat switchCompat;
        View view = getView();
        if (view != null && (switchCompat = (SwitchCompat) view.findViewById(R$id.trialSwitch)) != null) {
            boolValueOf = Boolean.valueOf(switchCompat.isChecked());
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: F6 */
    public final void m36143F6() {
        C43852m.m96591c(C17060n0.m36552b(), "More", TUIConstants.TUICustomerServicePlugin.BUSINESS_ID_SRC_CUSTOMER_SERVICE_TYPING, null, 8, null);
        C46392a.m102328k(C46894j.f104736a.m103256U(), true);
        C45606a.f102730a.m100691b();
    }

    /* JADX INFO: renamed from: J8 */
    public final void m36147J8() {
        Object obj;
        Object next;
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        Iterator<T> it = fragments.iterator();
        do {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!(((Fragment) next) instanceof FuturesPositionFragment));
        if (next instanceof FuturesPositionFragment) {
            obj = next;
        }
        FuturesPositionFragment futuresPositionFragment = (FuturesPositionFragment) obj;
        if (futuresPositionFragment != null) {
            futuresPositionFragment.T4();
        }
    }

    /* JADX INFO: renamed from: K6 */
    public final void m36148K6() {
        boolean z11;
        final C36760f2 c36760f2M36161U5 = m36161U5();
        if (c36760f2M36161U5 == null) {
            return;
        }
        long jMo25031v = RepositoryServiceLocator.f19236a.m20288g().mo25031v() / 1000;
        long jM102324f = C46392a.m102324f(C46894j.f104736a.m103276o(), 0L);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("bieber.init banner.. serverTime=");
        sb2.append(jMo25031v);
        sb2.append(", nextFetchTime=");
        sb2.append(jM102324f);
        sb2.append("..... ");
        if (jMo25031v < jM102324f) {
            z11 = true;
        } else {
            z11 = false;
        }
        sb2.append(z11);
        C44128b.m97258b(sb2.toString());
        if (jMo25031v < jM102324f) {
            BGABanner mBanner = c36760f2M36161U5.f80048u;
            Intrinsics.checkNotNullExpressionValue(mBanner, "mBanner");
            ViewExtKt.m66577h(mBanner);
        } else {
            BGABanner mBanner2 = c36760f2M36161U5.f80048u;
            Intrinsics.checkNotNullExpressionValue(mBanner2, "mBanner");
            ViewExtKt.m66594y(mBanner2);
            c36760f2M36161U5.f80048u.setUseHackyViews(false);
            c36760f2M36161U5.f80048u.setAdapter(new BGABanner.InterfaceC22979b() { // from class: com.kubi.kumex.trade.o2
                @Override // com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner.InterfaceC22979b
                /* JADX INFO: renamed from: a */
                public final void mo17775a(BGABanner bGABanner, View view, Object obj, int i11) {
                    FuturesFragment.m35966L6(this.f30655a, c36760f2M36161U5, bGABanner, view, (FuturesBannerEntity) obj, i11);
                }
            });
        }
    }

    /* JADX INFO: renamed from: L8 */
    public final void m36150L8() {
        String str;
        boolean z11;
        C36760f2 c36760f2M36161U5 = m36161U5();
        if (c36760f2M36161U5 == null) {
            return;
        }
        com.kubi.futures.trade.submit.panel.premarket.g gVar = com.kubi.futures.trade.submit.panel.premarket.g.a;
        C46527h0 c46527h0 = C46527h0.f104291a;
        if (gVar.o(c46527h0.m102673I())) {
            FrameLayout klineContent = c36760f2M36161U5.f80039l;
            Intrinsics.checkNotNullExpressionValue(klineContent, "klineContent");
            FrameLayout klineContent2 = c36760f2M36161U5.f80039l;
            Intrinsics.checkNotNullExpressionValue(klineContent2, "klineContent");
            C27046k.m66684G(klineContent, !C27046k.m66704s(klineContent2));
            m36187p8();
            FrameLayout klineContent3 = c36760f2M36161U5.f80039l;
            Intrinsics.checkNotNullExpressionValue(klineContent3, "klineContent");
            m36152N8(C27046k.m66704s(klineContent3));
            FrameLayout klineContent4 = c36760f2M36161U5.f80039l;
            Intrinsics.checkNotNullExpressionValue(klineContent4, "klineContent");
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            gVar.z(klineContent4, childFragmentManager);
            return;
        }
        FrameLayout klineContent5 = c36760f2M36161U5.f80039l;
        Intrinsics.checkNotNullExpressionValue(klineContent5, "klineContent");
        ViewExtKt.m66578i(klineContent5, C27040e.m66658b(InterfaceC33568bf.f69245q));
        FrameLayout klineContent6 = c36760f2M36161U5.f80039l;
        Intrinsics.checkNotNullExpressionValue(klineContent6, "klineContent");
        FrameLayout klineContent7 = c36760f2M36161U5.f80039l;
        Intrinsics.checkNotNullExpressionValue(klineContent7, "klineContent");
        C27046k.m66684G(klineContent6, !C27046k.m66704s(klineContent7));
        m36187p8();
        Persistence persistence = Persistence.f30799a;
        FrameLayout klineContent8 = c36760f2M36161U5.f80039l;
        Intrinsics.checkNotNullExpressionValue(klineContent8, "klineContent");
        persistence.m36519f("contract_small_k_line_expand", C27046k.m66704s(klineContent8));
        FrameLayout klineContent9 = c36760f2M36161U5.f80039l;
        Intrinsics.checkNotNullExpressionValue(klineContent9, "klineContent");
        m36152N8(C27046k.m66704s(klineContent9));
        FrameLayout klineContent10 = c36760f2M36161U5.f80039l;
        Intrinsics.checkNotNullExpressionValue(klineContent10, "klineContent");
        if (C27046k.m66704s(klineContent10)) {
            if ("future_kline_load".length() == 0 || "click_start_btn".length() == 0) {
                C44128b.m97270n("Monitor", "eventName(future_kline_load) or pointName(click_start_btn) is null");
            } else {
                EventParametersBuilder eventParametersBuilderAcquire = EventParametersBuilder.INSTANCE.acquire();
                eventParametersBuilderAcquire.m42382c("type", TIMPushProvider.f75062n);
                C45290a.f101823a.m100101b("future_kline_load", "click_start_btn", "", eventParametersBuilderAcquire.m42380a());
            }
            String strM102677L = c46527h0.m102677L();
            KumexSmallFlutterKlineFragment kumexSmallFlutterKlineFragment = this.f30420Z;
            if (kumexSmallFlutterKlineFragment != null) {
                if (!kumexSmallFlutterKlineFragment.isAdded()) {
                    kumexSmallFlutterKlineFragment = null;
                }
                if (kumexSmallFlutterKlineFragment != null) {
                    C27032f.m66620k(this, kumexSmallFlutterKlineFragment);
                }
            }
            KumexSmallFlutterKlineFragment.Companion companion = KumexSmallFlutterKlineFragment.f29339e0;
            int iM102678N = c46527h0.m102678N(strM102677L);
            if (C27063n.m66765c("k_panel_position", 0, 1, null) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            KumexSmallFlutterKlineFragment kumexSmallFlutterKlineFragmentNewInstance = companion.newInstance(strM102677L, iM102678N, z11);
            this.f30420Z = kumexSmallFlutterKlineFragmentNewInstance;
            C27032f.m66611b(this, R$id.klineContent, kumexSmallFlutterKlineFragmentNewInstance, null, 4, null);
        } else {
            KumexSmallFlutterKlineFragment kumexSmallFlutterKlineFragment2 = this.f30420Z;
            if (kumexSmallFlutterKlineFragment2 != null) {
                C27032f.m66622m(this, kumexSmallFlutterKlineFragment2);
            }
            this.f30420Z = null;
        }
        int iM66765c = C27063n.m66765c("k_panel_position", 0, 1, null);
        if (iM66765c != 0) {
            if (iM66765c != 1) {
                AppCompatImageView klineTopToggleIv = c36760f2M36161U5.f80042o;
                Intrinsics.checkNotNullExpressionValue(klineTopToggleIv, "klineTopToggleIv");
                C27046k.m66700o(klineTopToggleIv);
            } else {
                AppCompatImageView klineTopToggleIv2 = c36760f2M36161U5.f80042o;
                Intrinsics.checkNotNullExpressionValue(klineTopToggleIv2, "klineTopToggleIv");
                C27046k.m66700o(klineTopToggleIv2);
            }
        } else {
            AppCompatImageView klineTopToggleIv3 = c36760f2M36161U5.f80042o;
            Intrinsics.checkNotNullExpressionValue(klineTopToggleIv3, "klineTopToggleIv");
            C27046k.m66685H(klineTopToggleIv3);
            FrameLayout klineContent11 = c36760f2M36161U5.f80039l;
            Intrinsics.checkNotNullExpressionValue(klineContent11, "klineContent");
            m36152N8(C27046k.m66704s(klineContent11));
        }
        String strM36552b = C17060n0.m36552b();
        FrameLayout klineContent12 = c36760f2M36161U5.f80039l;
        Intrinsics.checkNotNullExpressionValue(klineContent12, "klineContent");
        if (C27046k.m66704s(klineContent12)) {
            str = TtmlNode.TEXT_EMPHASIS_MARK_OPEN;
        } else {
            str = "close";
        }
        C43852m.m96590b(strM36552b, "KlinePreview", "1", TuplesKt.m90091to("status", str));
    }

    /* JADX INFO: renamed from: N8 */
    public final void m36152N8(boolean z11) {
        C36760f2 c36760f2M36161U5 = m36161U5();
        if (c36760f2M36161U5 != null) {
            if (z11) {
                Drawable drawable = ContextCompat.getDrawable(c36760f2M36161U5.f80042o.getContext(), R$drawable.ic2_kline_expand_20);
                if (drawable != null) {
                    c36760f2M36161U5.f80042o.setImageDrawable(drawable);
                    DrawableCompat.setTint(drawable, getColorRes(R$color.brandGreen));
                    return;
                }
                return;
            }
            Drawable drawable2 = ContextCompat.getDrawable(c36760f2M36161U5.f80042o.getContext(), R$drawable.ic2_kline_fold_20);
            if (drawable2 != null) {
                c36760f2M36161U5.f80042o.setImageDrawable(drawable2);
                DrawableCompat.setTint(drawable2, getColorRes(R$color.c_text));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    /* JADX INFO: renamed from: O8 */
    public final void m36154O8(ContractEntity contractEntity) {
        boolean z11;
        int i11;
        int i12;
        C36760f2 c36760f2M36161U5 = m36161U5();
        if (c36760f2M36161U5 == null) {
            return;
        }
        int i13 = 0;
        if (contractEntity != null) {
            z11 = true;
            if (!contractEntity.isUsStock() || !this.f30433m0) {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        LinearLayout lowLiquidityContainer = c36760f2M36161U5.f80046s;
        Intrinsics.checkNotNullExpressionValue(lowLiquidityContainer, "lowLiquidityContainer");
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        lowLiquidityContainer.setVisibility(i11);
        View viewFindViewById = findViewById(R$id.lowLiquidityTipsLayout);
        if (viewFindViewById != null) {
            if (z11) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            viewFindViewById.setVisibility(i12);
        }
        BaseTextView priceRate = c36760f2M36161U5.f80053z;
        Intrinsics.checkNotNullExpressionValue(priceRate, "priceRate");
        if (z11) {
            i13 = 8;
        }
        priceRate.setVisibility(i13);
    }

    /* JADX INFO: renamed from: Q7 */
    public final boolean m36156Q7() {
        Boolean boolValueOf;
        Object next;
        Fragment fragment;
        Fragment fragment2;
        BaseInputPanel baseInputPanel;
        FragmentManager childFragmentManager;
        List<Fragment> fragments;
        Object next2;
        FragmentManager childFragmentManager2;
        List<Fragment> fragments2;
        Object next3;
        List<Fragment> fragments3 = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments3, "getFragments(...)");
        Iterator<T> it = fragments3.iterator();
        do {
            boolValueOf = null;
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!(((Fragment) next) instanceof FuturesTradeFragment));
        Fragment fragment3 = (Fragment) next;
        if (fragment3 != null && (childFragmentManager2 = fragment3.getChildFragmentManager()) != null && (fragments2 = childFragmentManager2.getFragments()) != null) {
            Iterator<T> it2 = fragments2.iterator();
            do {
                if (it2.hasNext()) {
                    next3 = it2.next();
                } else {
                    next3 = null;
                    break;
                }
            } while (!(((Fragment) next3) instanceof FuturesSubmitFragment));
            fragment = (Fragment) next3;
        } else {
            fragment = null;
        }
        if (fragment != null && (childFragmentManager = fragment.getChildFragmentManager()) != null && (fragments = childFragmentManager.getFragments()) != null) {
            Iterator<T> it3 = fragments.iterator();
            do {
                if (it3.hasNext()) {
                    next2 = it3.next();
                } else {
                    next2 = null;
                    break;
                }
            } while (!(((Fragment) next2) instanceof BaseInputPanel));
            fragment2 = (Fragment) next2;
        } else {
            fragment2 = null;
        }
        if (fragment2 instanceof BaseInputPanel) {
            baseInputPanel = (BaseInputPanel) fragment2;
        } else {
            baseInputPanel = null;
        }
        if (baseInputPanel != null) {
            boolValueOf = Boolean.valueOf(baseInputPanel.Q4());
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: R7 */
    public final boolean m36157R7(Long l11) {
        if (C27039d.m66652l(l11) > RepositoryServiceLocator.f19236a.m20288g().mo25031v()) {
            return true;
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: X5 */
    public final String m36166X5() {
        if (m36172c6() == MultiBizType.UNIFIED) {
            return getStringRes(R$string.kc_spot_panel_coupons, new Object[0]);
        }
        RepositoryServiceLocator repositoryServiceLocator = RepositoryServiceLocator.f19236a;
        if (repositoryServiceLocator.m20292k().mo100574u().getTotalNum() < 1) {
            return getStringRes(R$string.futures_rewards, new Object[0]);
        }
        return getStringRes(R$string.futures_rewards, new Object[0]) + '(' + repositoryServiceLocator.m20292k().mo100574u().getTotalNum() + ')';
    }

    /* JADX INFO: renamed from: e8 */
    public final void m36174e8(ContractEntity contractEntity) {
        C36760f2 c36760f2M36161U5 = m36161U5();
        if (c36760f2M36161U5 == null) {
            return;
        }
        c36760f2M36161U5.f80053z.setText(C37569d.m84684y());
        BaseTextView baseTextView = c36760f2M36161U5.f80053z;
        int i11 = R$color.c_text30;
        baseTextView.setTextColor(getColorRes(i11));
        c36760f2M36161U5.f80018A.setText(C37569d.m84684y());
        c36760f2M36161U5.f80018A.setTextColor(getColorRes(i11));
        m36155P8(contractEntity);
        m36154O8(contractEntity);
        m36018Y5().i(C27041f.m66668h(contractEntity.getSymbol()));
        ContractsOfflineManager.f30505a.m36297k(findViewById(R$id.offlineTipsLayout), (TextView) findViewById(R$id.offlineTipsView), findViewById(R$id.ivCloseTips), contractEntity);
        m36183m8();
        m36171a6().m26715C(C27041f.m66668h(contractEntity.getSymbol()));
    }

    /* JADX INFO: renamed from: f6 */
    public final FuturesSubmitViewModel m36175f6() {
        Object next;
        Fragment fragment;
        FuturesSubmitFragment futuresSubmitFragment;
        FragmentManager childFragmentManager;
        List<Fragment> fragments;
        Object next2;
        List<Fragment> fragments2 = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments2, "getFragments(...)");
        Iterator<T> it = fragments2.iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!(((Fragment) next) instanceof FuturesTradeFragment));
        Fragment fragment2 = (Fragment) next;
        if (fragment2 != null && (childFragmentManager = fragment2.getChildFragmentManager()) != null && (fragments = childFragmentManager.getFragments()) != null) {
            Iterator<T> it2 = fragments.iterator();
            do {
                if (it2.hasNext()) {
                    next2 = it2.next();
                } else {
                    next2 = null;
                    break;
                }
            } while (!(((Fragment) next2) instanceof FuturesSubmitFragment));
            fragment = (Fragment) next2;
        } else {
            fragment = null;
        }
        if (fragment instanceof FuturesSubmitFragment) {
            futuresSubmitFragment = (FuturesSubmitFragment) fragment;
        } else {
            futuresSubmitFragment = null;
        }
        if (futuresSubmitFragment == null) {
            return null;
        }
        return com.kubi.futures.trade.submit.p.a(futuresSubmitFragment);
    }

    /* JADX INFO: renamed from: h8 */
    public final void m36177h8(TickerEntity tickerEntity) {
        Context context;
        String strM92642g;
        C36760f2 c36760f2M36161U5 = m36161U5();
        if (c36760f2M36161U5 == null || (context = getContext()) == null) {
            return;
        }
        int iM54280e = C22890g.m54280e(context, C27039d.m66656p(tickerEntity.getPriceChgPct()), R$color.c_text30);
        if (tickerEntity.getPriceChgPct() == null) {
            strM92642g = C37569d.m84684y();
        } else {
            BigDecimal priceChgPct = tickerEntity.getPriceChgPct();
            if (priceChgPct != null) {
                strM92642g = C42180b.m92642g(priceChgPct, null, null, 0, true, false, true, 23, null);
            } else {
                strM92642g = null;
            }
        }
        c36760f2M36161U5.f80053z.setTextColor(iM54280e);
        c36760f2M36161U5.f80053z.setText(strM92642g);
        c36760f2M36161U5.f80018A.setTextColor(iM54280e);
        c36760f2M36161U5.f80018A.setText(strM92642g);
        m36155P8(C46527h0.f104291a.m102673I());
        m36183m8();
    }

    /* JADX INFO: renamed from: i6 */
    public final void m36178i6() {
        C43852m.m96591c(C17060n0.m36552b(), "More", "9", null, 8, null);
        InterfaceC37766r.a.m85190a(C37304a.f82764a, C45875l0.f103336a.m101337e0(), null, null, null, C43852m.m96601m(C17060n0.m36552b(), "More", "9"), null, null, 110, null);
    }

    /* JADX INFO: renamed from: l8 */
    public final void m36182l8(List<FuturesBannerEntity> list) {
        C36760f2 c36760f2M36161U5 = m36161U5();
        if (c36760f2M36161U5 == null || isDetached()) {
            return;
        }
        if (list.isEmpty()) {
            BGABanner mBanner = c36760f2M36161U5.f80048u;
            Intrinsics.checkNotNullExpressionValue(mBanner, "mBanner");
            ViewExtKt.m66577h(mBanner);
            return;
        }
        BGABanner mBanner2 = c36760f2M36161U5.f80048u;
        Intrinsics.checkNotNullExpressionValue(mBanner2, "mBanner");
        ViewExtKt.m66594y(mBanner2);
        BGABanner bGABanner = c36760f2M36161U5.f80048u;
        boolean z11 = true;
        if (list.size() == 1) {
            z11 = false;
        }
        bGABanner.setAutoPlayAble(z11);
        c36760f2M36161U5.f80048u.setData(R$layout.bkumex_banner_item, list, (List<String>) null);
    }

    /* JADX INFO: renamed from: m8 */
    public final void m36183m8() {
        Boolean boolValueOf;
        C36760f2 c36760f2M36161U5 = m36161U5();
        if (c36760f2M36161U5 != null) {
            C46527h0 c46527h0 = C46527h0.f104291a;
            ContractEntity contractEntityM102673I = c46527h0.m102673I();
            if (contractEntityM102673I != null) {
                boolValueOf = Boolean.valueOf(contractEntityM102673I.isPreMarket());
            } else {
                boolValueOf = null;
            }
            if (C27025c.m66566d(boolValueOf)) {
                ShapeTextView preMarketLabel = c36760f2M36161U5.f80052y;
                Intrinsics.checkNotNullExpressionValue(preMarketLabel, "preMarketLabel");
                ViewExtKt.m66594y(preMarketLabel);
                com.kubi.futures.trade.submit.panel.premarket.g gVar = com.kubi.futures.trade.submit.panel.premarket.g.a;
                FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                gVar.h(childFragmentManager);
                gVar.r(c46527h0.m102673I(), findViewById(R$id.convert2perpLayout));
                gVar.j(c46527h0.m102673I(), findViewById(R$id.preMarketTipsLayout), (TextView) findViewById(R$id.preMarketTipsContent), findViewById(R$id.ivClosePreMarketTips));
                ShapeTextView preMarketLabel2 = c36760f2M36161U5.f80052y;
                Intrinsics.checkNotNullExpressionValue(preMarketLabel2, "preMarketLabel");
                C27046k.m66711z(preMarketLabel2, 0L, new Function0() { // from class: com.kubi.kumex.trade.c3
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FuturesFragment.m36083n8(this.f30471b);
                    }
                }, 1, null);
                return;
            }
            ShapeTextView preMarketLabel3 = c36760f2M36161U5.f80052y;
            Intrinsics.checkNotNullExpressionValue(preMarketLabel3, "preMarketLabel");
            ViewExtKt.m66577h(preMarketLabel3);
            ShapeConstraintLayout shapeConstraintLayout = (ShapeConstraintLayout) findViewById(R$id.preMarketTipsLayout);
            if (shapeConstraintLayout != null) {
                ViewExtKt.m66577h(shapeConstraintLayout);
            }
            View viewFindViewById = findViewById(R$id.convert2perpLayout);
            if (viewFindViewById != null) {
                ViewExtKt.m66577h(viewFindViewById);
            }
        }
    }

    /* JADX INFO: renamed from: n6 */
    public final void m36184n6() {
        C43852m.m96591c(C17060n0.m36552b(), "More", "8", null, 8, null);
        IUserService.O(KuMexDepend.f30378a.m35905g(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.kumex.trade.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesFragment.m36087o6();
            }
        }), 1, (Object) null);
    }

    /* JADX INFO: renamed from: o8 */
    public final void m36185o8(ContractEntity contractEntity) {
        FrameLayout frameLayout;
        Boolean boolValueOf;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        String symbol = contractEntity.getSymbol();
        if (symbol == null) {
            return;
        }
        com.kubi.futures.trade.submit.panel.premarket.g gVar = com.kubi.futures.trade.submit.panel.premarket.g.a;
        boolean z11 = true;
        FrameLayout frameLayout4 = null;
        if (!gVar.o(contractEntity)) {
            C36760f2 c36760f2M36161U5 = m36161U5();
            if (c36760f2M36161U5 != null && (frameLayout3 = c36760f2M36161U5.f80039l) != null) {
                ViewExtKt.m66578i(frameLayout3, C27040e.m66658b(InterfaceC33568bf.f69245q));
            }
            C36760f2 c36760f2M36161U6 = m36161U5();
            if (c36760f2M36161U6 != null) {
                frameLayout = c36760f2M36161U6.f80039l;
            } else {
                frameLayout = null;
            }
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            gVar.i(false, frameLayout, childFragmentManager);
            C36760f2 c36760f2M36161U7 = m36161U5();
            if (c36760f2M36161U7 != null && (frameLayout2 = c36760f2M36161U7.f80039l) != null) {
                boolValueOf = Boolean.valueOf(C27046k.m66704s(frameLayout2));
            } else {
                boolValueOf = null;
            }
            if (C27025c.m66566d(boolValueOf)) {
                KumexSmallFlutterKlineFragment kumexSmallFlutterKlineFragment = this.f30420Z;
                if (kumexSmallFlutterKlineFragment == null) {
                    KumexSmallFlutterKlineFragment.Companion companion = KumexSmallFlutterKlineFragment.f29339e0;
                    int iM102678N = C46527h0.f104291a.m102678N(symbol);
                    if (C27063n.m66765c("k_panel_position", 0, 1, null) != 1) {
                        z11 = false;
                    }
                    KumexSmallFlutterKlineFragment kumexSmallFlutterKlineFragmentNewInstance = companion.newInstance(symbol, iM102678N, z11);
                    this.f30420Z = kumexSmallFlutterKlineFragmentNewInstance;
                    int i11 = R$id.klineContent;
                    Intrinsics.checkNotNull(kumexSmallFlutterKlineFragmentNewInstance);
                    C27032f.m66611b(this, i11, kumexSmallFlutterKlineFragmentNewInstance, null, 4, null);
                } else if (kumexSmallFlutterKlineFragment != null) {
                    kumexSmallFlutterKlineFragment.m34272H3(symbol, C37567b.m84618h(contractEntity));
                }
            }
        } else {
            KumexSmallFlutterKlineFragment kumexSmallFlutterKlineFragment2 = this.f30420Z;
            if (kumexSmallFlutterKlineFragment2 != null) {
                C27032f.m66622m(this, kumexSmallFlutterKlineFragment2);
                this.f30420Z = null;
            }
            C36760f2 c36760f2M36161U8 = m36161U5();
            if (c36760f2M36161U8 != null) {
                frameLayout4 = c36760f2M36161U8.f80039l;
            }
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
            gVar.i(true, frameLayout4, childFragmentManager2);
        }
        m36187p8();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        BGABanner bGABanner;
        super.onHide();
        m36018Y5().z();
        m36169Z5().U3();
        GuideHelper.f29155a.m33879i();
        com.kubi.futures.trade.submit.panel.premarket.o.a.h();
        com.kubi.futures.trade.submit.a0.a.o(false, C46527h0.f104291a.m102677L());
        C36760f2 c36760f2M36161U5 = m36161U5();
        if (c36760f2M36161U5 != null && (bGABanner = c36760f2M36161U5.f80048u) != null) {
            bGABanner.stopAutoPlay();
        }
        m36171a6().m26723K();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() throws JSONException {
        String str;
        super.onLoad();
        BadgeHelper.f29249a.m33964f(this);
        KuMexDepend kuMexDepend = KuMexDepend.f30378a;
        if (kuMexDepend.m35905g().c()) {
            JSONObject jSONObject = new JSONObject();
            if (kuMexDepend.m35906h()) {
                str = TtmlNode.TEXT_EMPHASIS_MARK_OPEN;
            } else {
                str = "close";
            }
            jSONObject.put("EnableStatus", str);
            C43852m.m96605q("user_status", jSONObject);
        }
        m35936F5(this, null, 1, null);
        m35970M5(this, null, 1, null);
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m36196t8();
        m36193s8();
        TracePageHelper.m42470e("open_contract", "load_contract", "加载:交易页-合约");
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        Object objM20457a;
        boolean zBooleanValue;
        Boolean boolValueOf;
        KycLeadView kycLeadView;
        super.onShow();
        C43852m.m96595g(C17060n0.m36552b(), "futuresMain", null, null, 12, null);
        if (!FuturesRemote.f23108a.m25650p()) {
            KycLeadHelper kycLeadHelper = KycLeadHelper.f25001a;
            C36760f2 c36760f2M36161U5 = m36161U5();
            if (c36760f2M36161U5 != null) {
                kycLeadView = c36760f2M36161U5.f80043p;
            } else {
                kycLeadView = null;
            }
            kycLeadHelper.m28852a(kycLeadView, LifecycleOwnerKt.getLifecycleScope(this));
        }
        m36163V5().mo20619a();
        m36188q8();
        m36196t8();
        m35924C8();
        RepositoryServiceLocator.f19236a.m20288g().mo25003c(true);
        m36147J8();
        KuMexDepend kuMexDepend = KuMexDepend.f30378a;
        if (kuMexDepend.m35905g().c() && !kuMexDepend.m35906h()) {
            IUserService.z(kuMexDepend.m35905g(), (Function0) null, 1, (Object) null);
        }
        C46527h0.f104291a.m102676K0();
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C16821e().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("android_appupgradedialog_v2futures_open", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        Boolean bool = (Boolean) objM20457a;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        C45591t.f102713a.m100681a("FuturesFragment_appUpgradeDialog-kumolangma ：open=" + zBooleanValue);
        if (zBooleanValue) {
            KuMexDepend.f30378a.m35901c().mo41629l(this, new Function0() { // from class: com.kubi.kumex.trade.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesFragment.m36047f8();
                }
            }, new Function0() { // from class: com.kubi.kumex.trade.u
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesFragment.m36052g8();
                }
            }, C17060n0.m36552b());
        } else {
            this.f30427g0.m33991c(this);
            this.f30427g0.m33990b();
        }
        View view = getView();
        if (view != null) {
            GuideHelper.f29155a.m33875B(view);
        }
        GuideHelper.f29155a.m33888t();
        m36192s6();
        m36193s8();
        m36018Y5().w();
        if (this.f30434n0) {
            ContractEntity contractEntityM102673I = C46527h0.f104291a.m102673I();
            if (contractEntityM102673I != null) {
                ContractsOfflineManager.f30505a.m36296h(this, contractEntityM102673I);
            }
            this.f30434n0 = false;
        }
        com.kubi.futures.trade.submit.a0 a0Var = com.kubi.futures.trade.submit.a0.a;
        C46527h0 c46527h0 = C46527h0.f104291a;
        a0Var.o(true, c46527h0.m102677L());
        DistributionManager.f24703a.m28548c(this);
        com.kubi.futures.trade.submit.panel.premarket.o.a.i();
        m36171a6().m26715C(c46527h0.m102677L());
        ContractEntity contractEntityM102673I2 = c46527h0.m102673I();
        if (contractEntityM102673I2 != null) {
            boolValueOf = Boolean.valueOf(contractEntityM102673I2.isPreMarket());
        } else {
            boolValueOf = null;
        }
        if (C27025c.m66566d(boolValueOf)) {
            com.kubi.futures.trade.submit.panel.premarket.g.a.j(c46527h0.m102673I(), findViewById(R$id.preMarketTipsLayout), (TextView) findViewById(R$id.preMarketTipsContent), findViewById(R$id.ivClosePreMarketTips));
        } else {
            ShapeConstraintLayout shapeConstraintLayout = (ShapeConstraintLayout) findViewById(R$id.preMarketTipsLayout);
            if (shapeConstraintLayout != null) {
                ViewExtKt.m66577h(shapeConstraintLayout);
            }
        }
        EuropeUnlockLeverageTips.m24672i(m36164W5(), m36161U5(), null, 2, null);
        m36139D5();
        m36202y8();
        m36191r8(c46527h0.m102673I());
    }

    /* JADX INFO: renamed from: p6 */
    public final void m36186p6() {
        C43852m.m96591c(C17060n0.m36552b(), "More", TUIConstants.TUICustomerServicePlugin.BUSINESS_ID_SRC_CUSTOMER_SERVICE_SAY_HELLO, null, 8, null);
        IUserService.O(KuMexDepend.f30378a.m35905g(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.kumex.trade.n2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesFragment.m36096q6(this.f30652b);
            }
        }), 1, (Object) null);
    }

    @Override // com.kubi.futures.entry.IFuturesFragmentController
    /* JADX INFO: renamed from: q1 */
    public void mo20216q1(boolean z11) {
        C36760f2 c36760f2M36161U5;
        LinearLayout.LayoutParams layoutParams;
        boolean z12;
        if (getView() == null || (c36760f2M36161U5 = m36161U5()) == null) {
            return;
        }
        LinearLayout linearLayout = c36760f2M36161U5.f80045r;
        ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        LinearLayout.LayoutParams layoutParams3 = null;
        if (layoutParams2 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            int iM66602e = 0;
            if (z11) {
                LinearLayout rootView = c36760f2M36161U5.f80021D;
                Intrinsics.checkNotNullExpressionValue(rootView, "rootView");
                LinearLayout llKline = c36760f2M36161U5.f80045r;
                Intrinsics.checkNotNullExpressionValue(llKline, "llKline");
                if (rootView.indexOfChild(llKline) != -1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (C27025c.m66566d(Boolean.valueOf(z12))) {
                    iM66602e = C27029c.m66602e(this, 30.0f);
                }
            }
            layoutParams.bottomMargin = iM66602e;
            layoutParams3 = layoutParams;
        }
        linearLayout.setLayoutParams(layoutParams3);
    }

    /* JADX INFO: renamed from: q8 */
    public final void m36188q8() {
        if (m36172c6() != MultiBizType.COPY_TRADING || !KuMexDepend.f30378a.m35900b().mo20635p()) {
            return;
        }
        String name = C4616h.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        C12572a.m23695d(name, C4616h.f4146a, 0L, 4, null);
    }

    /* JADX INFO: renamed from: s6 */
    public final void m36192s6() {
        C36760f2 c36760f2M36161U5 = m36161U5();
        if (c36760f2M36161U5 == null) {
            return;
        }
        m36187p8();
        int iM66765c = C27063n.m66765c("k_panel_position", 0, 1, null);
        if (iM66765c != 0) {
            if (iM66765c != 1) {
                AppCompatImageView klineTopToggleIv = c36760f2M36161U5.f80042o;
                Intrinsics.checkNotNullExpressionValue(klineTopToggleIv, "klineTopToggleIv");
                C27046k.m66700o(klineTopToggleIv);
                LinearLayout llKline = c36760f2M36161U5.f80045r;
                Intrinsics.checkNotNullExpressionValue(llKline, "llKline");
                ViewExtKt.m66577h(llKline);
                C43852m.m96605q("preference_status", new JSONObject().put("ChartStatus", TIMPushProvider.f75063o));
                return;
            }
            KumexSmallFlutterKlineFragment kumexSmallFlutterKlineFragment = this.f30420Z;
            if (kumexSmallFlutterKlineFragment != null) {
                kumexSmallFlutterKlineFragment.m24416F3(true);
            }
            AppCompatImageView klineTopToggleIv2 = c36760f2M36161U5.f80042o;
            Intrinsics.checkNotNullExpressionValue(klineTopToggleIv2, "klineTopToggleIv");
            C27046k.m66700o(klineTopToggleIv2);
            LinearLayout llKline2 = c36760f2M36161U5.f80045r;
            Intrinsics.checkNotNullExpressionValue(llKline2, "llKline");
            ViewExtKt.m66594y(llKline2);
            View klineTopLine = c36760f2M36161U5.f80041n;
            Intrinsics.checkNotNullExpressionValue(klineTopLine, "klineTopLine");
            ViewExtKt.m66594y(klineTopLine);
            ViewParent parent = c36760f2M36161U5.f80045r.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(c36760f2M36161U5.f80045r);
            c36760f2M36161U5.f80021D.addView(c36760f2M36161U5.f80045r);
            c36760f2M36161U5.f80045r.setBackgroundResource(R$color.c_overlay);
            C43852m.m96605q("preference_status", new JSONObject().put("ChartStatus", ViewProps.BOTTOM));
            return;
        }
        KumexSmallFlutterKlineFragment kumexSmallFlutterKlineFragment2 = this.f30420Z;
        if (kumexSmallFlutterKlineFragment2 != null) {
            kumexSmallFlutterKlineFragment2.m24416F3(false);
        }
        AppCompatImageView klineTopToggleIv3 = c36760f2M36161U5.f80042o;
        Intrinsics.checkNotNullExpressionValue(klineTopToggleIv3, "klineTopToggleIv");
        C27046k.m66685H(klineTopToggleIv3);
        FrameLayout klineContent = c36760f2M36161U5.f80039l;
        Intrinsics.checkNotNullExpressionValue(klineContent, "klineContent");
        m36152N8(C27046k.m66704s(klineContent));
        LinearLayout llKline3 = c36760f2M36161U5.f80045r;
        Intrinsics.checkNotNullExpressionValue(llKline3, "llKline");
        ViewExtKt.m66594y(llKline3);
        View klineTopLine2 = c36760f2M36161U5.f80041n;
        Intrinsics.checkNotNullExpressionValue(klineTopLine2, "klineTopLine");
        ViewExtKt.m66577h(klineTopLine2);
        ViewParent parent2 = c36760f2M36161U5.f80045r.getParent();
        Intrinsics.checkNotNull(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent2).removeView(c36760f2M36161U5.f80045r);
        c36760f2M36161U5.f80044q.addView(c36760f2M36161U5.f80045r, 0);
        c36760f2M36161U5.f80045r.setBackgroundResource(R$color.c_transparent);
        C43852m.m96605q("preference_status", new JSONObject().put("ChartStatus", ViewProps.TOP));
    }

    public final void showContent() {
        C36760f2 c36760f2M36161U5 = m36161U5();
        if (c36760f2M36161U5 == null) {
            return;
        }
        LinearLayout rootView = c36760f2M36161U5.f80021D;
        Intrinsics.checkNotNullExpressionValue(rootView, "rootView");
        IntRange intRangeUntil = RangesKt.until(0, rootView.getChildCount());
        ArrayList<View> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(rootView.getChildAt(((IntIterator) it).nextInt()));
        }
        for (View view : arrayList) {
            if (view instanceof FuturesShimmer) {
                ViewExtKt.m66577h(view);
                ((FuturesShimmer) view).m28822g();
            }
        }
        GuideHelper guideHelper = GuideHelper.f29155a;
        ConstraintLayout toolBar = c36760f2M36161U5.f80024G;
        Intrinsics.checkNotNullExpressionValue(toolBar, "toolBar");
        guideHelper.m33874A(toolBar);
        m36159T5().m102050q(c36760f2M36161U5.f80021D, this);
        m36171a6().m26726t();
        Bundle arguments = getArguments();
        if (arguments != null && RouteExKt.m56250h(arguments, "show_leader_guide_tip")) {
            KuMexDepend.f30378a.m35900b().mo20638s(this);
        }
    }

    /* JADX INFO: renamed from: t8 */
    public final void m36196t8() {
        if (m36172c6() != MultiBizType.UNIFIED) {
            return;
        }
        String name = C4616h.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        C12572a.m23695d(name, C4616h.f4146a, 0L, 4, null);
    }

    /* JADX INFO: renamed from: w6 */
    public final void m36199w6() {
        C43852m.m96591c(C17060n0.m36552b(), "More", "4", null, 8, null);
        KuMexDepend kuMexDepend = KuMexDepend.f30378a;
        if (!kuMexDepend.m35905g().c()) {
            IUserService.O(kuMexDepend.m35905g(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.kumex.trade.c2
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesFragment.m36125x6();
                }
            }), 1, (Object) null);
            return;
        }
        if (!kuMexDepend.m35906h()) {
            InterfaceC37752d.a.m85123b(C37304a.f82764a, C17060n0.m36552b(), Boolean.TRUE, null, null, null, null, 60, null);
            return;
        }
        BaseActivity.Companion companion = BaseActivity.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Bundle bundleM58530b = C24271s1.m58530b(new Bundle(), C17060n0.m36552b(), "More", "4");
        bundleM58530b.putBoolean("data", m36141E0());
        Unit unit = Unit.INSTANCE;
        companion.launch(contextRequireContext, TradingPreferencesFragment.class, bundleM58530b);
    }

    /* JADX INFO: renamed from: y6 */
    public final void m36201y6() {
        C43852m.m96591c(C17060n0.m36552b(), "More", "2", null, 8, null);
        KuMexDepend kuMexDepend = KuMexDepend.f30378a;
        if (kuMexDepend.m35905g().c()) {
            InterfaceC37766r.a.m85190a(C37304a.f82764a, C45875l0.f103336a.m101332A0(), null, null, null, C43852m.m96601m(C17060n0.m36552b(), "More", "2"), null, null, 110, null);
        } else {
            IUserService.O(kuMexDepend.m35905g(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.kumex.trade.y1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesFragment.m36135z6();
                }
            }), 1, (Object) null);
        }
    }

    /* JADX INFO: renamed from: z8 */
    public final void m36203z8() {
        SlidingTabLayout slidingTabLayout;
        AppBarLayout appBarLayout;
        C36760f2 c36760f2M36161U5 = m36161U5();
        if (c36760f2M36161U5 != null && (appBarLayout = c36760f2M36161U5.f80031d) != null) {
            appBarLayout.setExpanded(false);
        }
        C36760f2 c36760f2M36161U6 = m36161U5();
        if (c36760f2M36161U6 != null && (slidingTabLayout = c36760f2M36161U6.f80029b) != null) {
            slidingTabLayout.setCurrentTab(1);
        }
    }
}
