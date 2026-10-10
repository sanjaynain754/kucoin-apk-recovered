package com.kubi.margin.trade;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.cpiz.android.bubbleview.BubbleTextView;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.appbar.AppBarLayout;
import com.google.gson.reflect.TypeToken;
import com.kubi.assets.entity.HoldEarnCardHelper;
import com.kubi.assets.entity.HoldEarnConstKt;
import com.kubi.core.base.TradeAccountType;
import com.kubi.core.biz.menu.more.MoreDialogSectionTab;
import com.kubi.core.biz.menu.more.MultiTabBottomDialog;
import com.kubi.core.biz.menu.more.MultiTabItemInfo;
import com.kubi.core.biz.menu.more.TradeFunctionsFragment;
import com.kubi.core.biz.menu.more.TradeWebContainerFragment;
import com.kubi.core.biz.offline.SymbolOfflineBannerView;
import com.kubi.core.biz.offline.SymbolOfflineData;
import com.kubi.core.biz.offline.SymbolOfflineUtilsExtKt;
import com.kubi.core.biz.symbolbar.SymbolBarLayout;
import com.kubi.core.biz.togglesymbols.ToggleSymbolDialogHelperKt;
import com.kubi.data.entity.MarginOfflineInfoKt;
import com.kubi.data.entity.MarginSymbolInfo;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.margin.MarginAgreementDialog;
import com.kubi.margin.R$color;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.margin.api.entity.CouponsOverview;
import com.kubi.margin.api.entity.LeverBalance;
import com.kubi.margin.api.entity.MarginNoticeBanner;
import com.kubi.margin.api.entity.MarkPrice;
import com.kubi.margin.delegation.MarginTradeOpenOrdersFragment;
import com.kubi.margin.entity.WsMarketSnapshotEntity;
import com.kubi.margin.exception.MarginException;
import com.kubi.margin.kline.MarginKlineFragment;
import com.kubi.margin.kline.MarginSmallFlutterKlineFragment;
import com.kubi.margin.trade.position.MarginWholePositionFragment;
import com.kubi.margin.trade.submit.MarginSubmitFragment;
import com.kubi.margin.view.MarginBannerTipView;
import com.kubi.monitor.EventParametersBuilder;
import com.kubi.network.websocket.model.Message;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.p110rn.p111ui.KCBridgeRejecterError;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.quotefacade.entity.CurrencyFilterTransferData;
import com.kubi.quotefacade.entity.MarketListEntityItem;
import com.kubi.quotefacade.entity.SymbolData;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.MenuItem;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.guideview.C22896d;
import com.kubi.resources.guideview.InterfaceC22894b;
import com.kubi.resources.guideview.ViewOnKeyListenerC22895c;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.HoldingEarnEntryCardView;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.resources.widget.MarqueeTextView;
import com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.function.language.LanguageType;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.tradebase.BizType;
import com.kubi.tradebase.entity.CurrencyBalance;
import com.kubi.user.api.IUserService;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27018c0;
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
import com.kubi.utils.storage.StorageType;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.data.entity.ClickCardReport;
import f00.C37304a;
import f30.C37330a;
import g00.InterfaceC37754f;
import g00.InterfaceC37756h;
import g10.C37787r;
import g10.InterfaceC37770a;
import gf.C37878b0;
import gf.C37890n;
import hb0.InterfaceC38162f;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.PublishSubject;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import jb0.InterfaceC40373g;
import kotlinx.coroutines.C41696j;
import mp.C42579a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p206dp.C36947x;
import p311hf.C38184b;
import p318hp.C38274t;
import p402kf.C41014a;
import p429lf.C42179a;
import p437lp.C42290a;
import p509op.C43162b;
import p509op.C43169i;
import p509op.InterfaceC43161a;
import p537pp.C43518g;
import p568qp.C43839s;
import p569qq.C43841b;
import p569qq.C43846g;
import p569qq.C43852m;
import p603rp.AbstractC44151k0;
import p671uq.C45290a;
import p698vp.C45618h;
import p739ww.C45938b;
import p757xd.C46148j;
import p757xd.InterfaceC46140b;
import p757xd.SymbolBarData;
import p768xo.InterfaceC46302c;
import p768xo.InterfaceC46305f;
import p794yd.C46466a;
import p794yd.C46467b;
import p830zf.InterfaceC46789b0;
import p830zf.InterfaceC46815o0;
import p838zo.C46897a;
import p838zo.C46901e;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.TypeIntrinsics;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import w00.C45681e;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: BaseMarginFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010<\u001a\u00020=H&J\b\u0010>\u001a\u00020=H&J\b\u0010?\u001a\u00020@H\u0016J\b\u0010A\u001a\u00020BH&J\u0012\u0010C\u001a\u00020@2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J$\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\b\u0010D\u001a\u0004\u0018\u00010E2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\u001a\u0010L\u001a\u00020@2\u0006\u0010M\u001a\u00020G2\b\u0010D\u001a\u0004\u0018\u00010EH\u0017J\b\u0010N\u001a\u00020@H\u0002J\b\u0010O\u001a\u00020@H\u0002J\b\u0010P\u001a\u00020@H\u0002J\b\u0010Q\u001a\u00020@H\u0002J\u0017\u0010R\u001a\u00020@2\b\b\u0002\u0010S\u001a\u00020TH\u0000¢\u0006\u0002\bUJ \u0010V\u001a\u00020@2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010W\u001a\u00020G2\u0006\u0010X\u001a\u00020YH\u0002J\u0010\u0010Z\u001a\u00020@2\u0006\u0010\b\u001a\u00020\tH\u0002J\b\u0010[\u001a\u00020=H\u0002J\b\u0010\\\u001a\u00020=H\u0002J\n\u0010]\u001a\u0004\u0018\u00010^H\u0016J\b\u0010_\u001a\u00020@H\u0016J\u0012\u0010`\u001a\u00020@2\b\b\u0002\u0010a\u001a\u00020=H\u0016J\b\u0010b\u001a\u00020@H\u0016J\b\u0010c\u001a\u00020@H\u0016J\u0012\u0010d\u001a\u00020@2\b\u0010e\u001a\u0004\u0018\u00010fH\u0002J\b\u0010g\u001a\u00020@H\u0002J\b\u0010h\u001a\u00020@H\u0002J\b\u0010l\u001a\u00020@H\u0002J<\u0010m\u001a\u00020@2\u0006\u0010n\u001a\u00020o2\b\u0010p\u001a\u0004\u0018\u00010G2\n\b\u0002\u0010q\u001a\u0004\u0018\u00010G2\n\b\u0002\u0010r\u001a\u0004\u0018\u00010G2\b\b\u0002\u0010s\u001a\u00020kH\u0002J0\u0010t\u001a\u00020@2\b\u0010u\u001a\u0004\u0018\u00010v2\b\u0010w\u001a\u0004\u0018\u00010x2\b\u0010y\u001a\u0004\u0018\u00010v2\b\u0010z\u001a\u0004\u0018\u00010xH\u0016J\b\u0010{\u001a\u00020@H\u0002J\b\u0010|\u001a\u00020@H\u0002J\b\u0010}\u001a\u00020@H\u0002J\u0011\u0010~\u001a\u00020k2\u0007\u0010\u007f\u001a\u00030\u0080\u0001H\u0002J\t\u0010\u0081\u0001\u001a\u00020@H\u0002J\t\u0010\u0082\u0001\u001a\u00020 H\u0016J\t\u0010\u0083\u0001\u001a\u00020 H\u0016J\u0012\u0010\u0084\u0001\u001a\u00020@2\u0007\u0010\u0085\u0001\u001a\u00020 H\u0016J\u0012\u0010\u0086\u0001\u001a\u00020@2\u0007\u0010\u0085\u0001\u001a\u00020 H\u0016J\t\u0010\u0087\u0001\u001a\u00020@H\u0017J\t\u0010\u0089\u0001\u001a\u00020@H\u0002J\t\u0010\u008a\u0001\u001a\u00020kH\u0002J\t\u0010\u008b\u0001\u001a\u00020kH\u0002J\t\u0010\u008c\u0001\u001a\u00020@H\u0002J\u001e\u0010\u0092\u0001\u001a\u00020@2\u0013\u0010\u0093\u0001\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020=0%H\u0002J\u0012\u0010\u0099\u0001\u001a\u00020@2\u0007\u0010\u009a\u0001\u001a\u00020kH\u0016J\t\u0010\u009b\u0001\u001a\u00020@H\u0016J\t\u0010\u009c\u0001\u001a\u00020@H\u0002J\t\u0010\u009d\u0001\u001a\u00020@H\u0002J\t\u0010\u009e\u0001\u001a\u00020kH\u0016J\t\u0010\u009f\u0001\u001a\u00020\u0015H\u0016J\t\u0010 \u0001\u001a\u00020=H\u0016J\t\u0010¡\u0001\u001a\u00020kH\u0016J\u0017\u0010¢\u0001\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0018\u00010%H\u0016J\t\u0010£\u0001\u001a\u00020@H\u0016J\b\u0010n\u001a\u00020\u0001H\u0016J\t\u0010¤\u0001\u001a\u00020\u0015H\u0016J\n\u0010¥\u0001\u001a\u00030¦\u0001H\u0016J\t\u0010§\u0001\u001a\u00020\u001bH\u0016J\t\u0010¨\u0001\u001a\u00020@H\u0016J\f\u0010©\u0001\u001a\u0005\u0018\u00010\u0080\u0001H\u0002J\f\u0010ª\u0001\u001a\u0005\u0018\u00010\u0080\u0001H\u0002J\t\u0010«\u0001\u001a\u00020@H\u0016J\t\u0010¬\u0001\u001a\u00020@H\u0016J\n\u0010\u00ad\u0001\u001a\u00030\u0080\u0001H\u0016J\u0015\u0010®\u0001\u001a\u0004\u0018\u0001062\b\u0010\u0094\u0001\u001a\u00030\u0095\u0001H\u0016J\u0013\u0010¯\u0001\u001a\u00020@2\n\u0010°\u0001\u001a\u0005\u0018\u00010\u0080\u0001J\t\u0010±\u0001\u001a\u00020@H\u0016J\t\u0010²\u0001\u001a\u00020@H\u0002R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u001b8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010'\u001a\u00020(8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0013\u001a\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u00020-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u000106X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u000106X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u000106X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020=X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020kX\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0088\u0001\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u001f\u0010\u008d\u0001\u001a\u00020=X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R \u0010\u0094\u0001\u001a\u00030\u0095\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0098\u0001\u0010\u0013\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001¨\u0006³\u0001"}, m90084d2 = {"Lcom/kubi/margin/trade/BaseMarginFragment;", "Lcom/kubi/sdk/BaseFragment;", "Lcom/kubi/margin/kline/MarginKlineFragment$IKlineFragmentProvider;", "Lcom/kubi/sdk/websocket/IWsDataGetter;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "Lcom/kubi/margin/trade/IMarginBehavior;", "<init>", "()V", "binding", "Lcom/kubi/margin/databinding/BmarginFragmentMarginTradeBinding;", "getBinding", "()Lcom/kubi/margin/databinding/BmarginFragmentMarginTradeBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "baseMarginViewModel", "Lcom/kubi/margin/trade/BaseMarginViewModel;", "getBaseMarginViewModel", "()Lcom/kubi/margin/trade/BaseMarginViewModel;", "baseMarginViewModel$delegate", "Lkotlin/Lazy;", "mCurrentSymbol", "Lcom/kubi/data/entity/TradeItemBean;", "getMCurrentSymbol", "()Lcom/kubi/data/entity/TradeItemBean;", "setMCurrentSymbol", "(Lcom/kubi/data/entity/TradeItemBean;)V", "mTradeModel", "Lcom/kubi/margin/trade/helper/MarginTradeModel;", "getMTradeModel", "()Lcom/kubi/margin/trade/helper/MarginTradeModel;", "mTradeModel$delegate", "baseBalance", "Lcom/kubi/tradebase/entity/CurrencyBalance;", "quoteBalance", "mKlineFragment", "Lcom/kubi/margin/kline/MarginSmallFlutterKlineFragment;", "couponsData", "Lkotlin/Pair;", "Lcom/kubi/margin/api/entity/CouponsOverview;", "tradeSubmitFragment", "Lcom/kubi/margin/trade/submit/MarginSubmitFragment;", "getTradeSubmitFragment", "()Lcom/kubi/margin/trade/submit/MarginSubmitFragment;", "tradeSubmitFragment$delegate", "mWsUpdateTime", "", "getMWsUpdateTime", "()J", "setMWsUpdateTime", "(J)V", "mHttpRequestTime", "getMHttpRequestTime", "setMHttpRequestTime", "mSnapDisposable", "Lio/reactivex/disposables/Disposable;", "mActiveDisposable", "mStopDisposable", "mLoopDisposable", "multiTabBottomDialog", "Lcom/kubi/core/biz/menu/more/MultiTabBottomDialog;", "getLayout", "", "tradeType", "onPositionGet", "", "getPageAdapter", "Lcom/kubi/utils/InnerPagerAdapter;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initHoldEarnCard", "refreshHoldEarnCardVisibility", "initViewModels", "actionMoreBtnClickEvent", "showMoreMenuDialog", "tab", "Lcom/kubi/core/biz/menu/more/MoreDialogSectionTab;", "showMoreMenuDialog$MarginLib_googleRelease", "fillBannerItem", "itemView", "model", "Lcom/kubi/margin/trade/banner/DisplayBanner;", "refreshBannerDataAndStatus", "findCurrentDelegationPosition", "getCurrentRequestOrderType", "getMenuItemsProvider", "Lcom/kubi/margin/trade/menu/BaseMarginMoreItemsProvider;", "onChildRefresh", "scrollToTop", TypedValues.CycleType.S_WAVE_OFFSET, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "updateSymbolOfflineBanner", "offlineData", "Lcom/kubi/core/biz/offline/SymbolOfflineData;", "checkAndShowMultiSiteAgreement", "launchBannerUI", "lastKlinePosition", "isKlineShow", "", "handleKlineView", "renderKlineView", "fragment", "Landroidx/fragment/app/Fragment;", "content", "kLineTitle", "line", "needTrack", "notifyAvailableBalanceChange", "quoteAvailableBalance", "Ljava/math/BigDecimal;", "quoteBalanceDisplayStr", "", "baseAvailableBalance", "baseBalanceDisplayStr", "showToggleSymbol", "handleEventFromSmallKline", "checkIfSymbolChange", "checkSymbolSupportMargin", "symbol", "", "checkIsBuy", "getBaseBalance", "getQuoteBalance", "setBaseBalance", "balance", "setQuoteBalance", "fetchSymbolBalance", "lastDialogShowTime", "showMultiSiteAgreementDialog", "checkIsOpenSameRequestOrderAndPosition", "checkIsStopSameRequestOrderAndPosition", "fetchDelegationCount", "delegationCount", "getDelegationCount", "()I", "setDelegationCount", "(I)V", "updateDelegationTitle", "delegationCountPair", "wsDataHelper", "Lcom/kubi/sdk/websocket/WsDataHelper;", "getWsDataHelper", "()Lcom/kubi/sdk/websocket/WsDataHelper;", "wsDataHelper$delegate", "getRestfulData", "isResetWs", "registerWsData", "updateSymbolInfo", "setChangeRate", "isMaintenance", "getTradeBean", "getPrecision", "isIndex", "getCouponsData", "onRefresh", "currentSymbol", "currentSymbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "tradeMode", "refreshButtonStatus", "subBaseSymbol", "subQuoteSymbol", "fetchExtValue", "showExtValueTips", "extValueLabel", "extValueWsDisposable", "showMarginTicketGuide", "type", "fetchMarginCoupons", "startLoop", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBaseMarginFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseMarginFragment.kt\ncom/kubi/margin/trade/BaseMarginFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 7 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 DurationTracker.kt\ncom/kubi/monitor/DurationTrackerKt\n+ 10 MarginIssue.kt\ncom/kubi/margin/exception/MarginIssueKt\n+ 11 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,1449:1\n147#2,16:1450\n106#3,15:1466\n32#4:1481\n23#4,2:1565\n135#4,2:1580\n126#4,2:1699\n1#5:1482\n81#6,2:1483\n76#6,7:1485\n158#6,2:1494\n17#7,2:1492\n17#7,2:1496\n808#8,11:1498\n808#8,11:1509\n808#8,11:1520\n1869#8,2:1531\n808#8,11:1547\n774#8:1558\n865#8,2:1559\n1869#8,2:1561\n808#8,11:1567\n1869#8,2:1578\n808#8,11:1582\n1869#8,2:1593\n808#8,11:1595\n774#8:1606\n865#8,2:1607\n1869#8,2:1609\n808#8,11:1611\n1869#8,2:1622\n808#8,11:1624\n1869#8,2:1635\n808#8,11:1637\n774#8:1648\n865#8,2:1649\n1869#8,2:1651\n808#8,11:1653\n774#8:1664\n865#8,2:1665\n1869#8,2:1667\n808#8,11:1673\n1869#8,2:1684\n808#8,11:1686\n1869#8,2:1697\n808#8,11:1701\n1869#8,2:1712\n46#9,14:1533\n44#10,2:1563\n160#11,4:1669\n*S KotlinDebug\n*F\n+ 1 BaseMarginFragment.kt\ncom/kubi/margin/trade/BaseMarginFragment\n*L\n185#1:1450,16\n191#1:1466,15\n241#1:1481\n931#1:1565,2\n1366#1:1580,2\n1404#1:1699,2\n278#1:1483,2\n374#1:1485,7\n396#1:1494,2\n380#1:1492,2\n457#1:1496,2\n555#1:1498,11\n569#1:1509,11\n597#1:1520,11\n598#1:1531,2\n797#1:1547,11\n798#1:1558\n798#1:1559,2\n798#1:1561,2\n1232#1:1567,11\n1233#1:1578,2\n337#1:1582,11\n338#1:1593,2\n999#1:1595,11\n1000#1:1606\n1000#1:1607,2\n1001#1:1609,2\n1011#1:1611,11\n1012#1:1622,2\n1013#1:1624,11\n1014#1:1635,2\n1020#1:1637,11\n1021#1:1648\n1021#1:1649,2\n1022#1:1651,2\n1081#1:1653,11\n1082#1:1664\n1082#1:1665,2\n1083#1:1667,2\n1276#1:1673,11\n1277#1:1684,2\n1354#1:1686,11\n1355#1:1697,2\n1442#1:1701,11\n1443#1:1712,2\n756#1:1533,14\n869#1:1563,2\n1139#1:1669,4\n*E\n"})
public abstract class BaseMarginFragment extends BaseFragment implements MarginKlineFragment.InterfaceC17697a, InterfaceC37770a, SwipeRefreshLayout.OnRefreshListener, IMarginBehavior {

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ KProperty<Object>[] f33646p0 = {Reflection.property1(new PropertyReference1Impl(BaseMarginFragment.class, "binding", "getBinding()Lcom/kubi/margin/databinding/BmarginFragmentMarginTradeBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f33647U = C45681e.m100799e(this, new Function1<BaseMarginFragment, C36947x>() { // from class: com.kubi.margin.trade.BaseMarginFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36947x invoke(@NotNull BaseMarginFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36947x.m82763a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36947x, Unit>() { // from class: com.kubi.margin.trade.BaseMarginFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36947x it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36947x c36947x) {
            invoke(c36947x);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f33648V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public TradeItemBean f33649W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f33650X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public CurrencyBalance f33651Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public CurrencyBalance f33652Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public MarginSmallFlutterKlineFragment f33653a0;

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public Pair<CouponsOverview, CouponsOverview> f33654b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f33655c0;

    /* JADX INFO: renamed from: d0 */
    public long f33656d0;

    /* JADX INFO: renamed from: e0 */
    public long f33657e0;

    /* JADX INFO: renamed from: f0 */
    @Nullable
    public Disposable f33658f0;

    /* JADX INFO: renamed from: g0 */
    @Nullable
    public Disposable f33659g0;

    /* JADX INFO: renamed from: h0 */
    @Nullable
    public Disposable f33660h0;

    /* JADX INFO: renamed from: i0 */
    @Nullable
    public Disposable f33661i0;

    /* JADX INFO: renamed from: j0 */
    @Nullable
    public MultiTabBottomDialog f33662j0;

    /* JADX INFO: renamed from: k0 */
    public int f33663k0;

    /* JADX INFO: renamed from: l0 */
    public boolean f33664l0;

    /* JADX INFO: renamed from: m0 */
    public long f33665m0;

    /* JADX INFO: renamed from: n0 */
    public int f33666n0;

    /* JADX INFO: renamed from: o0 */
    @NotNull
    public final Lazy f33667o0;

    /* JADX INFO: renamed from: com.kubi.margin.trade.BaseMarginFragment$a */
    /* JADX INFO: compiled from: BaseMarginFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/margin/trade/BaseMarginFragment$onViewCreated$2$3", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", ViewProps.POSITION, "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nBaseMarginFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseMarginFragment.kt\ncom/kubi/margin/trade/BaseMarginFragment$onViewCreated$2$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1449:1\n808#2,11:1450\n774#2:1461\n865#2,2:1462\n1869#2,2:1464\n*S KotlinDebug\n*F\n+ 1 BaseMarginFragment.kt\ncom/kubi/margin/trade/BaseMarginFragment$onViewCreated$2$3\n*L\n305#1:1450,11\n306#1:1461\n306#1:1462,2\n307#1:1464,2\n*E\n"})
    public static final class C18159a extends ViewPager.SimpleOnPageChangeListener {
        public C18159a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            C43852m.m96591c(BaseMarginFragment.this.mo39907P0(), "orderManagement", String.valueOf(position + 1), null, 8, null);
            if (position == 0) {
                List<Fragment> fragments = BaseMarginFragment.this.getChildFragmentManager().getFragments();
                Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj : fragments) {
                    if (obj instanceof MarginTradeOpenOrdersFragment) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (((MarginTradeOpenOrdersFragment) obj2).isAdded()) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((MarginTradeOpenOrdersFragment) it.next()).m38114y3();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.trade.BaseMarginFragment$b */
    /* JADX INFO: compiled from: BaseMarginFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/margin/trade/BaseMarginFragment$onViewCreated$2$4", "Lcom/kubi/resources/widget/flyco/listener/OnTabSelectListener;", "onTabSelect", "", ViewProps.POSITION, "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nBaseMarginFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseMarginFragment.kt\ncom/kubi/margin/trade/BaseMarginFragment$onViewCreated$2$4\n+ 2 DurationTracker.kt\ncom/kubi/monitor/DurationTrackerKt\n*L\n1#1,1449:1\n46#2,14:1450\n*S KotlinDebug\n*F\n+ 1 BaseMarginFragment.kt\ncom/kubi/margin/trade/BaseMarginFragment$onViewCreated$2$4\n*L\n319#1:1450,14\n*E\n"})
    public static final class C18160b extends C45938b {
        public C18160b() {
        }

        @Override // p739ww.C45938b
        /* JADX INFO: renamed from: b */
        public void mo18273b(int i11) {
            String str;
            super.mo18273b(i11);
            if (i11 == 1) {
                BaseMarginFragment baseMarginFragment = BaseMarginFragment.this;
                if ("margin_position_tab".length() == 0 || "page_load_start".length() == 0) {
                    C44128b.m97270n("Monitor", "eventName(margin_position_tab) or pointName(page_load_start) is null");
                    return;
                }
                EventParametersBuilder eventParametersBuilderAcquire = EventParametersBuilder.INSTANCE.acquire();
                if (baseMarginFragment.mo39705A0() == 1) {
                    str = "cross";
                } else {
                    str = "isolated";
                }
                eventParametersBuilderAcquire.m42382c("marginType", str);
                C45290a.f101823a.m100101b("margin_position_tab", "page_load_start", "", eventParametersBuilderAcquire.m42380a());
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.trade.BaseMarginFragment$c */
    /* JADX INFO: compiled from: BaseMarginFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/margin/trade/BaseMarginFragment$onViewCreated$2$7", "Lcom/kubi/sdk/function/language/MultiLanguageManager$OnLanguageChangeListener;", "onLanguageChange", "", "language", "Lcom/kubi/sdk/function/language/LanguageType;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18161c implements MultiLanguageManager.a {
        @Override // com.kubi.sdk.function.language.MultiLanguageManager.a
        public void onLanguageChange(LanguageType language) {
            Intrinsics.checkNotNullParameter(language, "language");
            C43169i.f95330a.m94777g();
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.trade.BaseMarginFragment$d */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C18162d extends TypeToken<WsMarketSnapshotEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.margin.trade.BaseMarginFragment$e */
    /* JADX INFO: compiled from: BaseMarginFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18163e implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f33670b;

        public C18163e(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f33670b = function;
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
            return this.f33670b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f33670b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.trade.BaseMarginFragment$f */
    /* JADX INFO: compiled from: BaseMarginFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/margin/trade/BaseMarginFragment$showMarginTicketGuide$1$guide$1", "Lcom/kubi/resources/guideview/Component;", "getView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "getAnchor", "", "getFitPosition", "getYOffset", "getXOffset", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18164f implements InterfaceC22894b {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ImageView f33672b;

        /* JADX INFO: renamed from: g */
        public static final Unit m39753g(ImageView imageView) {
            Object tag = imageView != null ? imageView.getTag() : null;
            ViewOnKeyListenerC22895c viewOnKeyListenerC22895c = tag instanceof ViewOnKeyListenerC22895c ? (ViewOnKeyListenerC22895c) tag : null;
            if (viewOnKeyListenerC22895c != null) {
                viewOnKeyListenerC22895c.m54306d();
            }
            return Unit.INSTANCE;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: a */
        public int mo18889a() {
            return -6;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: b */
        public int mo18890b() {
            return -8;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: c */
        public int mo18891c() {
            return 4;
        }

        public C18164f(ImageView imageView) {
            this.f33672b = imageView;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: d */
        public int mo18892d() {
            return 48;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: e */
        public View mo18893e(LayoutInflater inflater) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            View viewInflate = inflater.inflate(R$layout.bmargin_view_guide_trade_kline, (ViewGroup) null);
            BaseMarginFragment baseMarginFragment = BaseMarginFragment.this;
            final ImageView imageView = this.f33672b;
            View viewFindViewById = viewInflate.findViewById(R$id.know);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: com.kubi.margin.trade.b2
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseMarginFragment.C18164f.m39753g(imageView);
                }
            }, 1, null);
            ((BubbleTextView) viewInflate.findViewById(R$id.bubble)).setText(baseMarginFragment.getString(R$string.margin_still_check_here));
            Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
            return viewInflate;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: I6 */
    public static final Unit m39553I6(CurrencyFilterTransferData currencyFilterTransferData, KCBridgeRejecterError kCBridgeRejecterError) {
        SymbolData data;
        String symbolCode;
        SymbolData data2;
        SymbolData data3;
        String symbolCode2;
        String symbolCode3;
        SymbolData data4;
        String symbolCode4;
        SymbolData data5;
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
                    if (level1.equals(ViewProps.MARGIN) && (data2 = currencyFilterTransferData.getData()) != null && data2.getSymbolCode() != null) {
                        if (Intrinsics.areEqual(currencyFilterTransferData.getLevel2(), "cross")) {
                            SymbolData data6 = currencyFilterTransferData.getData();
                            if (data6 != null && (symbolCode3 = data6.getSymbolCode()) != null) {
                                InterfaceC37754f.a.m85136h(C37304a.f82764a, symbolCode3, Boolean.TRUE, null, null, null, 28, null);
                            }
                        } else if (Intrinsics.areEqual(currencyFilterTransferData.getLevel2(), "isolated") && (data3 = currencyFilterTransferData.getData()) != null && (symbolCode2 = data3.getSymbolCode()) != null) {
                            InterfaceC37754f.a.m85134f(C37304a.f82764a, symbolCode2, Boolean.TRUE, null, null, null, 28, null);
                        }
                    }
                    break;
                case 3537154:
                    if (level1.equals(SearchCategory$Companion.SPOT) && (data4 = currencyFilterTransferData.getData()) != null && (symbolCode4 = data4.getSymbolCode()) != null) {
                        InterfaceC37754f.a.m85140l(C37304a.f82764a, symbolCode4, Boolean.TRUE, null, null, null, null, 60, null);
                    }
                    break;
                case 92909918:
                    if (level1.equals("alpha") && (data5 = currencyFilterTransferData.getData()) != null && (symbolCode5 = data5.getSymbolCode()) != null) {
                        InterfaceC37754f.a.m85129a(C37304a.f82764a, Long.valueOf(DowngradeExKt.m66546p(symbolCode5, 0L, 1, null)), Boolean.TRUE, null, null, null, 28, null);
                    }
                    break;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g6 */
    public static final void m39633g6(Boolean bool) {
        C43841b.m96557d("margin_refresh_delegation_list", "receive_socket", null, 4, null);
        if (bool.booleanValue()) {
            com.kubi.margin.trade.holder.businessTrack.a.a.d(10);
        }
    }

    /* JADX INFO: renamed from: p6 */
    public static final void m39671p6(Boolean bool) {
        C43841b.m96557d("margin_refresh_delegation_list", "receive_socket", null, 4, null);
        if (bool.booleanValue()) {
            com.kubi.margin.trade.holder.businessTrack.a.a.d(10);
        }
    }

    /* JADX INFO: renamed from: w5 */
    private final int m39695w5() {
        try {
            List<Fragment> fragments = getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : fragments) {
                if (obj instanceof MarginTradeOpenOrdersFragment) {
                    arrayList.add(obj);
                }
            }
            MarginTradeOpenOrdersFragment marginTradeOpenOrdersFragment = (MarginTradeOpenOrdersFragment) CollectionsKt.firstOrNull((List) arrayList);
            if (marginTradeOpenOrdersFragment != null) {
                return marginTradeOpenOrdersFragment.m38107o3();
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.kubi.margin.trade.IMarginBehavior
    /* JADX INFO: renamed from: A0 */
    public abstract int mo39705A0();

    @Nullable
    /* JADX INFO: renamed from: D5 */
    public AbstractC44151k0 mo39711D5() {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: E5 */
    public abstract C27103z mo39712E5();

    @Override // com.kubi.margin.kline.MarginKlineFragment.InterfaceC17697a
    /* JADX INFO: renamed from: M1 */
    public boolean mo38435M1() {
        return false;
    }

    public abstract int getLayout();

    public BaseMarginFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.margin.trade.BaseMarginFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.margin.trade.BaseMarginFragment$special$$inlined$viewModels$default$2
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
        this.f33648V = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BaseMarginViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.margin.trade.BaseMarginFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.margin.trade.BaseMarginFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.margin.trade.BaseMarginFragment$special$$inlined$viewModels$default$5
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
        this.f33649W = new TradeItemBean("BTC-" + C38184b.f85884a.m86147b());
        this.f33650X = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseMarginFragment.m39578Q5();
            }
        });
        this.f33651Y = new CurrencyBalance(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
        this.f33652Z = new CurrencyBalance(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
        this.f33655c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseMarginFragment.m39581R6();
            }
        });
        this.f33663k0 = -1;
        this.f33667o0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseMarginFragment.m39651k7(this.f34196b);
            }
        });
    }

    /* JADX INFO: renamed from: D6 */
    public static /* synthetic */ void m39536D6(BaseMarginFragment baseMarginFragment, MoreDialogSectionTab moreDialogSectionTab, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMoreMenuDialog");
        }
        if ((i11 & 1) != 0) {
            moreDialogSectionTab = MoreDialogSectionTab.a.f20520a;
        }
        baseMarginFragment.m39710C6(moreDialogSectionTab);
    }

    /* JADX INFO: renamed from: E6 */
    public static final Unit m39539E6(BaseMarginFragment baseMarginFragment) {
        MultiTabBottomDialog multiTabBottomDialog = baseMarginFragment.f33662j0;
        if (multiTabBottomDialog != null) {
            multiTabBottomDialog.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F6 */
    public static final Unit m39542F6(BaseMarginFragment baseMarginFragment) {
        MultiTabBottomDialog multiTabBottomDialog = baseMarginFragment.f33662j0;
        if (multiTabBottomDialog != null) {
            multiTabBottomDialog.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G5 */
    private final C37787r m39545G5() {
        return (C37787r) this.f33667o0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H5 */
    public final void m39548H5() {
        Fragment parentFragment;
        this.f33664l0 = !this.f33664l0;
        if (C27063n.m66765c("k_panel_position", 0, 1, null) == 0) {
            C36947x c36947xM39700y5 = m39700y5();
            m39675q6(this, c36947xM39700y5 != null ? c36947xM39700y5.f82035h : null, null, null, true);
            return;
        }
        Fragment parentFragment2 = getParentFragment();
        InterfaceC46302c interfaceC46302c = parentFragment2 instanceof InterfaceC46302c ? (InterfaceC46302c) parentFragment2 : null;
        if (interfaceC46302c == null || (parentFragment = getParentFragment()) == null) {
            return;
        }
        m39675q6(parentFragment, interfaceC46302c.mo63561l1(), interfaceC46302c.mo63550M2(), null, true);
    }

    /* JADX INFO: renamed from: H6 */
    private final void m39549H6() {
        IQuoteFacadeService.Companion companion = IQuoteFacadeService.f41383a;
        if (companion.get().mo50718w()) {
            try {
                String str = mo39705A0() == 2 ? "isolated" : "cross";
                IQuoteFacadeService iQuoteFacadeService = companion.get();
                FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                iQuoteFacadeService.mo50714q(this, childFragmentManager, new CurrencyFilterTransferData(ViewProps.MARGIN, str, null, new SymbolData(this.f33649W.getSymbol(), null, 2, null), 4, null), "TradeMarginRnToggleSymbolDialog", new Function2() { // from class: com.kubi.margin.trade.a0
                    @Override // p852kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BaseMarginFragment.m39553I6((CurrencyFilterTransferData) obj, (KCBridgeRejecterError) obj2);
                    }
                });
            } catch (Exception e11) {
                C43846g.m96568c(new MarginException(e11, "TradeMarginSymbolFilter", false, null, 8, null), null, 2, null);
            }
        } else {
            TradeItemBean tradeItemBean = this.f33649W;
            int iMo39705A0 = mo39705A0();
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
            ToggleSymbolDialogHelperKt.m22836g(Integer.valueOf(iMo39705A0), false, tradeItemBean, childFragmentManager2, new Function0() { // from class: com.kubi.margin.trade.b0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseMarginFragment.m39557J6(this.f33721b);
                }
            }, 2, null);
        }
        if (isShowing()) {
            m39545G5().m85236i(false);
            m39713F5().D5(false);
        }
        C43852m.m96591c(mo39907P0(), "informationStrip", "1", null, 8, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I5 */
    private final void m39552I5() {
        SymbolBarLayout symbolBarLayout;
        C46148j f20881c;
        FrameLayout frameLayout;
        View viewMo63564n1;
        Fragment parentFragment;
        int iM66765c = C27063n.m66765c("k_panel_position", 0, 1, null);
        if (this.f33663k0 == iM66765c) {
            MarginSmallFlutterKlineFragment marginSmallFlutterKlineFragment = this.f33653a0;
            if ((marginSmallFlutterKlineFragment != null ? marginSmallFlutterKlineFragment.getParentFragment() : null) != null) {
                return;
            }
        }
        this.f33663k0 = iM66765c;
        MarginSmallFlutterKlineFragment marginSmallFlutterKlineFragment2 = this.f33653a0;
        if (marginSmallFlutterKlineFragment2 != null && (parentFragment = getParentFragment()) != null) {
            C27032f.m66622m(parentFragment, marginSmallFlutterKlineFragment2);
        }
        this.f33653a0 = null;
        Fragment parentFragment2 = getParentFragment();
        InterfaceC46302c interfaceC46302c = parentFragment2 instanceof InterfaceC46302c ? (InterfaceC46302c) parentFragment2 : null;
        if (interfaceC46302c != null && (viewMo63564n1 = interfaceC46302c.mo63564n1()) != null) {
            ViewExtKt.m66577h(viewMo63564n1);
        }
        C36947x c36947xM39700y5 = m39700y5();
        if (c36947xM39700y5 != null && (frameLayout = c36947xM39700y5.f82035h) != null) {
            ViewExtKt.m66577h(frameLayout);
        }
        if (iM66765c == 0) {
            C36947x c36947xM39700y6 = m39700y5();
            m39679r6(this, this, c36947xM39700y6 != null ? c36947xM39700y6.f82035h : null, null, null, false, 28, null);
            return;
        }
        if (iM66765c != 1) {
            this.f33664l0 = false;
            C36947x c36947xM39700y7 = m39700y5();
            if (c36947xM39700y7 == null || (symbolBarLayout = c36947xM39700y7.f82040m) == null || (f20881c = symbolBarLayout.getF20881c()) == null) {
                return;
            }
            C46148j.m101730v(f20881c, iM66765c, this.f33664l0, false, 4, null);
            return;
        }
        Fragment parentFragment3 = getParentFragment();
        final InterfaceC46302c interfaceC46302c2 = parentFragment3 instanceof InterfaceC46302c ? (InterfaceC46302c) parentFragment3 : null;
        if (interfaceC46302c2 != null) {
            View viewMo63564n2 = interfaceC46302c2.mo63564n1();
            if (viewMo63564n2 != null) {
                ViewExtKt.m66594y(viewMo63564n2);
            }
            View viewMo63550M2 = interfaceC46302c2.mo63550M2();
            if (viewMo63550M2 != null) {
                C27046k.m66711z(viewMo63550M2, 0L, new Function0() { // from class: com.kubi.margin.trade.e0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseMarginFragment.m39556J5(this.f33876b, interfaceC46302c2);
                    }
                }, 1, null);
            }
            Fragment fragmentRequireParentFragment = requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            m39679r6(this, fragmentRequireParentFragment, interfaceC46302c2.mo63561l1(), interfaceC46302c2.mo63550M2(), interfaceC46302c2.mo63579x1(), false, 16, null);
        }
    }

    /* JADX INFO: renamed from: J5 */
    public static final Unit m39556J5(BaseMarginFragment baseMarginFragment, InterfaceC46302c interfaceC46302c) {
        baseMarginFragment.f33664l0 = !baseMarginFragment.f33664l0;
        Fragment fragmentRequireParentFragment = baseMarginFragment.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
        baseMarginFragment.m39675q6(fragmentRequireParentFragment, interfaceC46302c.mo63561l1(), interfaceC46302c.mo63550M2(), interfaceC46302c.mo63579x1(), true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K5 */
    private final void m39560K5() {
        if (C12573b.f21598a.m23696a()) {
            HoldEarnConstKt.HOLD_EARN_OPEN_SUCC.length();
        }
        C12572a.m23692a(this, true, new BaseMarginFragment$initHoldEarnCard$$inlined$bindFlowEvent$1(HoldEarnConstKt.HOLD_EARN_OPEN_SUCC, null, this));
    }

    /* JADX INFO: renamed from: M5 */
    public static final Unit m39566M5(BaseMarginFragment baseMarginFragment, MarginSymbolInfo marginSymbolInfo) {
        if (marginSymbolInfo != null) {
            baseMarginFragment.m39740i7(new SymbolOfflineData("", marginSymbolInfo.getSymbol(), 0L, null, null, MarginOfflineInfoKt.offlineTime(marginSymbolInfo), MarginOfflineInfoKt.offlineTime(marginSymbolInfo), MarginOfflineInfoKt.offlineLink(marginSymbolInfo), 24, null));
        } else {
            baseMarginFragment.m39740i7(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003b  */
    /* JADX INFO: renamed from: N5 */
    public static final Unit m39570N5(BaseMarginFragment baseMarginFragment, MarginNoticeBanner marginNoticeBanner) {
        C36947x c36947xM39700y5;
        MarginBannerTipView marginBannerTipView;
        String content;
        Unit unit;
        MarginBannerTipView marginBannerTipView2;
        C36947x c36947xM39700y6;
        MarginBannerTipView marginBannerTipView3;
        MarginBannerTipView marginBannerTipView4;
        if (marginNoticeBanner == null || (content = marginNoticeBanner.getContent()) == null) {
            c36947xM39700y5 = baseMarginFragment.m39700y5();
            if (c36947xM39700y5 != null && (marginBannerTipView = c36947xM39700y5.f82038k) != null) {
                marginBannerTipView.m40697f();
            }
        } else {
            C36947x c36947xM39700y7 = baseMarginFragment.m39700y5();
            if (c36947xM39700y7 != null && (marginBannerTipView4 = c36947xM39700y7.f82038k) != null) {
                marginBannerTipView4.setTipText(content);
            }
            String webUrl = marginNoticeBanner.getWebUrl();
            if (webUrl != null && (c36947xM39700y6 = baseMarginFragment.m39700y5()) != null && (marginBannerTipView3 = c36947xM39700y6.f82038k) != null) {
                marginBannerTipView3.m40696d(content, webUrl);
            }
            C36947x c36947xM39700y8 = baseMarginFragment.m39700y5();
            if (c36947xM39700y8 == null || (marginBannerTipView2 = c36947xM39700y8.f82038k) == null) {
                unit = null;
            } else {
                marginBannerTipView2.m40699j();
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                c36947xM39700y5 = baseMarginFragment.m39700y5();
                if (c36947xM39700y5 != null) {
                    marginBannerTipView.m40697f();
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q5 */
    public static final C43839s m39578Q5() {
        return new C43839s();
    }

    /* JADX INFO: renamed from: R4 */
    private final void m39580R4() {
        TradeItemBean tradeItemBeanM85603D;
        C36947x c36947xM39700y5 = m39700y5();
        if (c36947xM39700y5 != null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                String symbol = this.f33649W.getSymbol();
                Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
                String strM56241c0 = RouteExKt.m56241c0(arguments, "symbol", symbol);
                if (strM56241c0 != null) {
                    if (strM56241c0.length() <= 0 || Intrinsics.areEqual(strM56241c0, this.f33649W.getSymbol()) || !m39734V4(strM56241c0)) {
                        tradeItemBeanM85603D = this.f33649W;
                    } else {
                        tradeItemBeanM85603D = C37890n.f85269a.m85603D(strM56241c0);
                        if (tradeItemBeanM85603D == null) {
                            tradeItemBeanM85603D = new TradeItemBean(strM56241c0);
                        }
                    }
                    if (tradeItemBeanM85603D != null) {
                        this.f33649W = tradeItemBeanM85603D;
                    }
                }
            }
            C46148j f20881c = c36947xM39700y5.f82040m.getF20881c();
            if (Intrinsics.areEqual(f20881c != null ? f20881c.m101732n() : null, this.f33649W.getShowSymbol())) {
                return;
            }
            this.f33654b0 = null;
            StorageId storageId = new StorageId(ViewProps.MARGIN, "lastSymbol" + mo39705A0(), StorageType.LocalSite, true);
            String symbol2 = this.f33649W.getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol2, "getSymbol(...)");
            C46392a.m102333p(storageId, symbol2);
            C46148j f20881c2 = c36947xM39700y5.f82040m.getF20881c();
            if (f20881c2 != null) {
                f20881c2.m101735q(new SymbolBarData(this.f33649W.getSymbol(), this.f33649W.getShowSymbol(), null, null, null, Integer.valueOf(C27063n.m66765c("k_panel_position", 0, 1, null)), this.f33664l0, false, 152, null));
            }
            MarginSmallFlutterKlineFragment marginSmallFlutterKlineFragment = this.f33653a0;
            if (marginSmallFlutterKlineFragment != null) {
                marginSmallFlutterKlineFragment.m38694I3(this.f33649W);
            }
            CurrencyBalance currencyBalance = new CurrencyBalance(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
            currencyBalance.setCurrency(mo39722N().getQuoteCurrency());
            this.f33652Z = currencyBalance;
            CurrencyBalance currencyBalance2 = new CurrencyBalance(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
            currencyBalance2.setCurrency(mo39722N().getBaseCurrency());
            this.f33651Y = currencyBalance2;
            m39713F5().k5();
        }
    }

    /* JADX INFO: renamed from: R6 */
    public static final MarginSubmitFragment m39581R6() {
        return new MarginSubmitFragment();
    }

    /* JADX INFO: renamed from: U6 */
    public static final boolean m39590U6(BaseMarginFragment baseMarginFragment, MarketListEntityItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getSymbol(), baseMarginFragment.f33649W.getSymbol());
    }

    /* JADX INFO: renamed from: V5 */
    public static final Unit m39592V5(BaseMarginFragment baseMarginFragment, boolean z11) {
        C37304a c37304a = C37304a.f82764a;
        long jM39695w5 = baseMarginFragment.m39695w5();
        InterfaceC37756h.a.m85146d(c37304a, z11 ? "isolated" : "cross", Long.valueOf(jM39695w5), baseMarginFragment.mo39717J().getSymbol(), null, null, C43852m.m96601m(baseMarginFragment.mo39907P0(), "orderManagement", "5"), null, null, 216, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V6 */
    public static final boolean m39593V6(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: W4 */
    public static final boolean m39595W4(BaseMarginFragment baseMarginFragment, String str, String str2, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (baseMarginFragment.isShowing() && Intrinsics.areEqual(DowngradeExKt.m66551u("/indicator/markPrice:%s", new Object[]{str}, null, 2, null), it.getTopic())) || Intrinsics.areEqual(DowngradeExKt.m66551u("/indicator/markPrice:%s", new Object[]{str2}, null, 2, null), it.getTopic());
    }

    /* JADX INFO: renamed from: W5 */
    public static final void m39596W5(BaseMarginFragment baseMarginFragment, InterfaceC38162f it) throws Exception {
        Intrinsics.checkNotNullParameter(it, "it");
        List<Fragment> fragments = baseMarginFragment.getChildFragmentManager().getFragments();
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
        baseMarginFragment.m39587T6();
        baseMarginFragment.m39739f5();
        baseMarginFragment.mo22379g(true);
        baseMarginFragment.mo39729R5();
        baseMarginFragment.m39623d6();
    }

    /* JADX INFO: renamed from: X4 */
    public static final boolean m39599X4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: X5 */
    public static final void m39600X5(BaseMarginFragment baseMarginFragment, C36947x c36947x, BGABanner bGABanner, View itemView, InterfaceC43161a interfaceC43161a, int i11) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        if (interfaceC43161a != null) {
            baseMarginFragment.m39745t5(c36947x, itemView, interfaceC43161a);
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public static final String m39603Y4(Message s11) {
        Intrinsics.checkNotNullParameter(s11, "s");
        return s11.getData();
    }

    /* JADX INFO: renamed from: Y5 */
    public static final Unit m39604Y5(C36947x c36947x, BaseMarginFragment baseMarginFragment) {
        c36947x.f82038k.m40697f();
        baseMarginFragment.m39749x5().m39769z();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z4 */
    public static final String m39607Z4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (String) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: a5 */
    public static final Unit m39611a5(final String str, final BaseMarginFragment baseMarginFragment, final String str2, final String str3) {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.margin.trade.w1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseMarginFragment.m39615b5(str3, str, baseMarginFragment, str2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a7 */
    public static final boolean m39613a7(ArrayList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() > 0;
    }

    /* JADX INFO: renamed from: b5 */
    public static final Unit m39615b5(String str, String str2, BaseMarginFragment baseMarginFragment, String str3) {
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("symbol");
        BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(jSONObject.optString("value"));
        if (bigDecimalM66536f != null) {
            if (Intrinsics.areEqual(strOptString, str2)) {
                C46897a.m103304p(baseMarginFragment.getF33651Y(), bigDecimalM66536f);
                C12572a.m23695d("/indicator/markPrice:%s", new Pair(baseMarginFragment.f33651Y.getCurrency(), bigDecimalM66536f), 0L, 4, null);
            }
            if (Intrinsics.areEqual(strOptString, str3)) {
                C46897a.m103304p(baseMarginFragment.getF33652Z(), bigDecimalM66536f);
                C12572a.m23695d("/indicator/markPrice:%s", new Pair(baseMarginFragment.f33652Z.getCurrency(), bigDecimalM66536f), 0L, 4, null);
            }
            BigDecimal bigDecimalM103292d = C46897a.m103292d(baseMarginFragment.getF33651Y());
            BigDecimal bigDecimalDivide = bigDecimalM103292d != null ? bigDecimalM103292d.divide(C41014a.m89921F(C46897a.m103292d(baseMarginFragment.getF33652Z()), "1"), 12, RoundingMode.DOWN) : null;
            List<Fragment> fragments = baseMarginFragment.m39713F5().getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : fragments) {
                if (obj instanceof IMarginChildBehavior) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((IMarginChildBehavior) it.next()).m40014m0(bigDecimalDivide);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b6 */
    public static final Unit m39616b6(BaseMarginFragment baseMarginFragment, boolean z11) {
        baseMarginFragment.f33664l0 = !baseMarginFragment.f33664l0;
        C36947x c36947xM39700y5 = baseMarginFragment.m39700y5();
        baseMarginFragment.m39675q6(baseMarginFragment, c36947xM39700y5 != null ? c36947xM39700y5.f82035h : null, null, null, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b7 */
    public static final boolean m39617b7(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: c7 */
    public static final Unit m39620c7(BaseMarginFragment baseMarginFragment, ArrayList arrayList) {
        baseMarginFragment.f33649W.setSymbolInfoEntity((SymbolInfoEntity) arrayList.get(0));
        C37890n.f85269a.m85607H(baseMarginFragment.f33649W.getSymbolInfoEntity());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d6 */
    private final void m39623d6() {
        StorageId<Long> storageIdClassicStorageId = HoldEarnCardHelper.INSTANCE.classicStorageId(UserInfo.a.i());
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new BaseMarginFragment$refreshHoldEarnCardVisibility$1(this, storageIdClassicStorageId, null), 3, null);
    }

    /* JADX INFO: renamed from: f6 */
    public static final void m39629f6(final BaseMarginFragment baseMarginFragment) {
        Disposable disposable = baseMarginFragment.f33658f0;
        if (disposable != null) {
            baseMarginFragment.getVisibleDisposable().remove(disposable);
        }
        Disposable disposable2 = baseMarginFragment.f33659g0;
        if (disposable2 != null) {
            baseMarginFragment.getVisibleDisposable().remove(disposable2);
        }
        Disposable disposable3 = baseMarginFragment.f33660h0;
        if (disposable3 != null) {
            baseMarginFragment.getVisibleDisposable().remove(disposable3);
        }
        C37787r c37787rM39545G5 = baseMarginFragment.m39545G5();
        String symbol = baseMarginFragment.f33649W.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        PublishSubject<Message> publishSubjectM85233f = c37787rM39545G5.m85233f("/market/snapshot_app:%s", symbol);
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.z0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(BaseMarginFragment.m39637h6(this.f34216b, (Message) obj));
            }
        };
        Observable<Message> observableFilter = publishSubjectM85233f.filter(new Predicate() { // from class: com.kubi.margin.trade.a1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return BaseMarginFragment.m39641i6(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.b1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseMarginFragment.m39645j6((Message) obj);
            }
        };
        Observable observableObserveOn = observableFilter.map(new io.reactivex.functions.Function() { // from class: com.kubi.margin.trade.c1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BaseMarginFragment.m39650k6(function2, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final Function1 function3 = new Function1() { // from class: com.kubi.margin.trade.e1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseMarginFragment.m39655l6(this.f33878b, (WsMarketSnapshotEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.margin.trade.f1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseMarginFragment.m39659m6(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.margin.trade.g1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseMarginFragment.m39663n6((Throwable) obj);
            }
        };
        baseMarginFragment.f33658f0 = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.trade.h1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseMarginFragment.m39667o6(function4, obj);
            }
        });
        DelegationDataHelper delegationDataHelper = DelegationDataHelper.f33714a;
        baseMarginFragment.f33659g0 = delegationDataHelper.m40003Q(baseMarginFragment.m39545G5().m85233f("/spotMarket/tradeOrders", ""), "/spotMarket/tradeOrders", new Consumer() { // from class: com.kubi.margin.trade.i1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseMarginFragment.m39671p6((Boolean) obj);
            }
        });
        baseMarginFragment.f33660h0 = delegationDataHelper.m40003Q(baseMarginFragment.m39545G5().m85233f("/spotMarket/advancedOrders", ""), "/spotMarket/advancedOrders", new Consumer() { // from class: com.kubi.margin.trade.j1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseMarginFragment.m39633g6((Boolean) obj);
            }
        });
        Disposable disposable4 = baseMarginFragment.f33658f0;
        if (disposable4 != null) {
            baseMarginFragment.getVisibleDisposable().add(disposable4);
        }
        Disposable disposable5 = baseMarginFragment.f33659g0;
        if (disposable5 != null) {
            baseMarginFragment.getVisibleDisposable().add(disposable5);
        }
        Disposable disposable6 = baseMarginFragment.f33660h0;
        if (disposable6 != null) {
            baseMarginFragment.getVisibleDisposable().add(disposable6);
        }
    }

    /* JADX INFO: renamed from: h6 */
    public static final boolean m39637h6(BaseMarginFragment baseMarginFragment, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return baseMarginFragment.isShowing() && Intrinsics.areEqual(DowngradeExKt.m66551u("/market/snapshot_app:%s", new Object[]{baseMarginFragment.f33649W.getSymbol()}, null, 2, null), it.getTopic());
    }

    /* JADX INFO: renamed from: i6 */
    public static final boolean m39641i6(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: j6 */
    public static final WsMarketSnapshotEntity m39645j6(Message s11) {
        Object objM66914d;
        Intrinsics.checkNotNullParameter(s11, "s");
        String strM66668h = C27041f.m66668h(s11.getData());
        try {
            C27099x c27099x = C27099x.f54458a;
            objM66914d = C27099x.m66914d(strM66668h, new C18162d().getType());
        } catch (Throwable unused) {
            objM66914d = null;
        }
        return (WsMarketSnapshotEntity) objM66914d;
    }

    /* JADX INFO: renamed from: k6 */
    public static final WsMarketSnapshotEntity m39650k6(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (WsMarketSnapshotEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: k7 */
    public static final C37787r m39651k7(BaseMarginFragment baseMarginFragment) {
        return new C37787r(baseMarginFragment);
    }

    /* JADX INFO: renamed from: l6 */
    public static final Unit m39655l6(BaseMarginFragment baseMarginFragment, WsMarketSnapshotEntity wsMarketSnapshotEntity) {
        if (wsMarketSnapshotEntity != null) {
            wsMarketSnapshotEntity.covertToTradeItemBean(baseMarginFragment.f33649W);
        }
        baseMarginFragment.m39692v6();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q6 */
    private final void m39675q6(Fragment fragment, View view, View view2, View view3, boolean z11) {
        SymbolBarLayout symbolBarLayout;
        C46148j f20881c;
        if (view == null) {
            return;
        }
        if (this.f33664l0) {
            if ("margin_kline_load".length() == 0 || "click_start_btn".length() == 0) {
                C44128b.m97270n("Monitor", "eventName(margin_kline_load) or pointName(click_start_btn) is null");
            } else {
                EventParametersBuilder eventParametersBuilderAcquire = EventParametersBuilder.INSTANCE.acquire();
                eventParametersBuilderAcquire.m42382c("marginType", mo39705A0() == 1 ? "cross" : "isolated");
                C45290a.f101823a.m100101b("margin_kline_load", "click_start_btn", "", eventParametersBuilderAcquire.m42380a());
            }
            ViewExtKt.m66594y(view);
            if (view2 != null) {
                ViewExtKt.m66577h(view2);
            }
            MarginSmallFlutterKlineFragment.Companion companion = MarginSmallFlutterKlineFragment.f33119e0;
            String symbol = this.f33649W.getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
            MarginSmallFlutterKlineFragment marginSmallFlutterKlineFragmentNewInstance = companion.newInstance(symbol, C27039d.m66650j(Integer.valueOf(this.f33649W.getSymbolInfoEntity().getPriceIncrementPrecision())));
            MarginSmallFlutterKlineFragment marginSmallFlutterKlineFragment = this.f33653a0;
            if (marginSmallFlutterKlineFragment != null) {
                if (!marginSmallFlutterKlineFragment.isAdded()) {
                    marginSmallFlutterKlineFragment = null;
                }
                if (marginSmallFlutterKlineFragment != null) {
                    C27032f.m66622m(fragment, marginSmallFlutterKlineFragment);
                }
            }
            this.f33653a0 = marginSmallFlutterKlineFragmentNewInstance;
            C27032f.m66611b(fragment, view.getId(), marginSmallFlutterKlineFragmentNewInstance, null, 4, null);
            if (view3 != null) {
                ViewExtKt.m66594y(view3);
            }
        } else {
            ViewExtKt.m66577h(view);
            if (view2 != null) {
                ViewExtKt.m66594y(view2);
            }
            MarginSmallFlutterKlineFragment marginSmallFlutterKlineFragment2 = this.f33653a0;
            if (marginSmallFlutterKlineFragment2 != null) {
                C27032f.m66622m(fragment, marginSmallFlutterKlineFragment2);
            }
            this.f33653a0 = null;
            if (view3 != null) {
                ViewExtKt.m66577h(view3);
            }
        }
        if (z11) {
            C43852m.m96591c(mo39907P0(), "informationStrip", "2", null, 8, null);
        }
        C36947x c36947xM39700y5 = m39700y5();
        if (c36947xM39700y5 == null || (symbolBarLayout = c36947xM39700y5.f82040m) == null || (f20881c = symbolBarLayout.getF20881c()) == null) {
            return;
        }
        C46148j.m101730v(f20881c, C27063n.m66765c("k_panel_position", 0, 1, null), this.f33664l0, false, 4, null);
    }

    /* JADX INFO: renamed from: r6 */
    public static /* synthetic */ void m39679r6(BaseMarginFragment baseMarginFragment, Fragment fragment, View view, View view2, View view3, boolean z11, int i11, Object obj) {
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
        baseMarginFragment.m39675q6(fragment, view, view2, view3, z11);
    }

    /* JADX INFO: renamed from: t6 */
    public static /* synthetic */ void m39685t6(BaseMarginFragment baseMarginFragment, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToTop");
        }
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        baseMarginFragment.m39744s6(i11);
    }

    /* JADX INFO: renamed from: v5 */
    public static final Unit m39691v5(InterfaceC43161a interfaceC43161a, BaseMarginFragment baseMarginFragment, C36947x c36947x) {
        C43169i.f95330a.m94778h(interfaceC43161a);
        baseMarginFragment.m39737c6(c36947x);
        C43852m.m96591c(baseMarginFragment.mo39907P0(), "informationStrip", "6", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y5 */
    public final C36947x m39700y5() {
        return (C36947x) this.f33647U.getValue(this, f33646p0[0]);
    }

    /* JADX INFO: renamed from: y6 */
    public static final Unit m39701y6(SpannableString spannableString, String str, final AlertDialogFragmentHelper alertDialogFragmentHelper, final BaseMarginFragment baseMarginFragment) {
        spannableString.setSpan(new C27018c0(R$color.primary, new View.OnClickListener() { // from class: com.kubi.margin.trade.v1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseMarginFragment.m39704z6(alertDialogFragmentHelper, baseMarginFragment, view);
            }
        }), StringsKt.indexOf$default((CharSequence) spannableString, str, 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) spannableString, str, 0, false, 6, (Object) null) + str.length(), 18);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A5, reason: from getter */
    public final int getF33666n0() {
        return this.f33666n0;
    }

    @NotNull
    /* JADX INFO: renamed from: B5, reason: from getter */
    public final TradeItemBean getF33649W() {
        return this.f33649W;
    }

    @NotNull
    /* JADX INFO: renamed from: C5 */
    public final C43839s m39709C5() {
        return (C43839s) this.f33650X.getValue();
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
    /* JADX INFO: renamed from: C6 */
    public final void m39710C6(@NotNull MoreDialogSectionTab tab) {
        List<MenuItem> listEmptyList;
        List<MenuItem> listEmptyList2;
        Intrinsics.checkNotNullParameter(tab, "tab");
        AbstractC44151k0 abstractC44151k0Mo39711D5 = mo39711D5();
        String string = getString(com.kubi.spot.R$string.kc_trade_more_tab_feature);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        TradeFunctionsFragment.Companion companion = TradeFunctionsFragment.f20509Y;
        if (abstractC44151k0Mo39711D5 == null || (listEmptyList = abstractC44151k0Mo39711D5.m97378x0()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<MenuItem> mutableList = CollectionsKt.toMutableList((Collection) listEmptyList);
        BizType bizType = BizType.MARGIN;
        MultiTabItemInfo multiTabItemInfo = new MultiTabItemInfo(string, companion.create(mutableList, bizType, new Function0() { // from class: com.kubi.margin.trade.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseMarginFragment.m39539E6(this.f33726b);
            }
        }));
        String string2 = getString(com.kubi.spot.R$string.bkmex_aggregate_information_data);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        if (abstractC44151k0Mo39711D5 == null || (listEmptyList2 = abstractC44151k0Mo39711D5.m97345B0()) == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        MultiTabItemInfo multiTabItemInfo2 = new MultiTabItemInfo(string2, companion.create(CollectionsKt.toMutableList((Collection) listEmptyList2), bizType, new Function0() { // from class: com.kubi.margin.trade.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseMarginFragment.m39542F6(this.f33742b);
            }
        }));
        String string3 = getString(com.kubi.spot.R$string.kc_trade_more_tab_guide);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        TradeWebContainerFragment.Companion companion2 = TradeWebContainerFragment.f20516W;
        MultiTabBottomDialog.Companion companion3 = MultiTabBottomDialog.f20501v0;
        MultiTabBottomDialog multiTabBottomDialogCreate = companion3.create(CollectionsKt.mutableListOf(multiTabItemInfo, multiTabItemInfo2, new MultiTabItemInfo(string3, companion2.create(companion3.getMARGIN_USER_GUIDES_URL()))), Intrinsics.areEqual(tab, MoreDialogSectionTab.b.f20521a) ? 1 : 0);
        this.f33662j0 = multiTabBottomDialogCreate;
        if (multiTabBottomDialogCreate != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            multiTabBottomDialogCreate.show(childFragmentManager, "funcitons");
        }
    }

    @Override // com.kubi.margin.kline.MarginKlineFragment.InterfaceC17697a
    @NotNull
    /* JADX INFO: renamed from: D0 */
    public TradeItemBean mo38428D0() {
        return this.f33649W;
    }

    @NotNull
    /* JADX INFO: renamed from: F5 */
    public final MarginSubmitFragment m39713F5() {
        return (MarginSubmitFragment) this.f33655c0.getValue();
    }

    /* JADX INFO: renamed from: G6 */
    public final void m39714G6() {
        LeverBalance leverBalanceM39879Y0 = MarginConfigManager.f33681a.m39879Y0();
        if (Intrinsics.areEqual(leverBalanceM39879Y0.getOpenFlag(), Boolean.TRUE) && Intrinsics.areEqual(leverBalanceM39879Y0.isSignAgreement(), Boolean.FALSE) && isShowing()) {
            String simpleName = MarginAgreementDialog.class.getSimpleName();
            Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag(simpleName);
            if (fragmentFindFragmentByTag == null || !fragmentFindFragmentByTag.isVisible()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.f33665m0 < 1000) {
                    return;
                }
                this.f33665m0 = jCurrentTimeMillis;
                MarginAgreementDialog marginAgreementDialog = new MarginAgreementDialog();
                marginAgreementDialog.setArguments(BundleKt.bundleOf(TuplesKt.m90091to("url", leverBalanceM39879Y0.getAgreementUrl()), TuplesKt.m90091to("type", 4)));
                FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                marginAgreementDialog.show(childFragmentManager, simpleName);
            }
        }
    }

    @Override // com.kubi.margin.trade.IMarginBehavior
    @NotNull
    /* JADX INFO: renamed from: I, reason: from getter */
    public CurrencyBalance getF33651Y() {
        return this.f33651Y;
    }

    @Override // com.kubi.margin.trade.IMarginBehavior
    @NotNull
    /* JADX INFO: renamed from: J */
    public TradeItemBean mo39717J() {
        return this.f33649W;
    }

    @Override // com.kubi.margin.trade.IMarginBehavior
    @SuppressLint({"KCCyclomaticComplexityCheck"})
    /* JADX INFO: renamed from: K */
    public void mo39718K() {
        Disposable disposableM39866D0;
        C42579a c42579a = C42579a.f94275a;
        if (c42579a.m93347g().c() && getActivity() != null) {
            FragmentActivity activity = getActivity();
            if (!C27025c.m66566d(activity != null ? Boolean.valueOf(activity.isFinishing()) : null) && c42579a.m93347g().d0().isHasOpenLever()) {
                if (mo39705A0() == 2) {
                    this.f33657e0 = System.currentTimeMillis();
                }
                MarginConfigManager marginConfigManager = MarginConfigManager.f33681a;
                Observable<Pair<CurrencyBalance, CurrencyBalance>> observableM39869L0 = marginConfigManager.m39869L0(mo39705A0(), mo39722N());
                final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.k0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BaseMarginFragment.m39666o5(this.f33948b, (Pair) obj);
                    }
                };
                Consumer<? super Pair<CurrencyBalance, CurrencyBalance>> consumer = new Consumer() { // from class: com.kubi.margin.trade.l0
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        BaseMarginFragment.m39670p5(function1, obj);
                    }
                };
                final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.m0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BaseMarginFragment.m39674q5((Throwable) obj);
                    }
                };
                Disposable disposableSubscribe = observableM39869L0.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.trade.n0
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        BaseMarginFragment.m39678r5(function2, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
                DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
                if (mo39705A0() != 1 || (disposableM39866D0 = marginConfigManager.m39866D0(new Action() { // from class: com.kubi.margin.trade.o0
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        BaseMarginFragment.m39682s5(this.f33975b);
                    }
                })) == null) {
                    return;
                }
                DisposableKt.addTo(disposableM39866D0, getDestroyDisposable());
            }
        }
    }

    /* JADX INFO: renamed from: K6 */
    public final void m39719K6() {
        Disposable disposable = this.f33661i0;
        if (disposable != null) {
            getVisibleDisposable().remove(disposable);
        }
        C42579a c42579a = C42579a.f94275a;
        if (c42579a.m93347g().c() && c42579a.m93347g().d0().isHasOpenLever()) {
            Observable<Long> observableObserveOn = Observable.interval(5L, 30L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread());
            final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.r
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BaseMarginFragment.m39563L6(this.f34167b, (Long) obj);
                }
            };
            Consumer<? super Long> consumer = new Consumer() { // from class: com.kubi.margin.trade.s
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BaseMarginFragment.m39567M6(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.t
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BaseMarginFragment.m39571N6((Throwable) obj);
                }
            };
            Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.trade.u
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BaseMarginFragment.m39573O6(function2, obj);
                }
            });
            this.f33661i0 = disposableSubscribe;
            if (disposableSubscribe != null) {
                getVisibleDisposable().add(disposableSubscribe);
            }
        }
    }

    @Override // com.kubi.margin.trade.IMarginBehavior
    /* JADX INFO: renamed from: M */
    public boolean mo39721M() {
        return C42579a.f94275a.m93346f().mo60008u(mo39717J().getSymbol());
    }

    @Override // com.kubi.margin.trade.IMarginBehavior
    @NotNull
    /* JADX INFO: renamed from: N */
    public SymbolInfoEntity mo39722N() {
        SymbolInfoEntity symbolInfoEntity = this.f33649W.getSymbolInfoEntity();
        Intrinsics.checkNotNullExpressionValue(symbolInfoEntity, "getSymbolInfoEntity(...)");
        return symbolInfoEntity;
    }

    @Override // com.kubi.margin.trade.IMarginBehavior
    @NotNull
    /* JADX INFO: renamed from: O, reason: from getter */
    public CurrencyBalance getF33652Z() {
        return this.f33652Z;
    }

    /* JADX INFO: renamed from: O4 */
    public final void m39724O4() {
        List<MenuItem> listEmptyList;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46789b0.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null ? ((InterfaceC46789b0) objM56186h).mo103117b() : false) {
            m39536D6(this, null, 1, null);
        } else {
            BottomSheetDialogHelper bottomSheetDialogHelper = BottomSheetDialogHelper.f48599a;
            AbstractC44151k0 abstractC44151k0Mo39711D5 = mo39711D5();
            if (abstractC44151k0Mo39711D5 == null || (listEmptyList = abstractC44151k0Mo39711D5.m97378x0()) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            DialogFragmentHelper dialogFragmentHelperM59005W = bottomSheetDialogHelper.m59005W(listEmptyList);
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            dialogFragmentHelperM59005W.show(childFragmentManager, "funcitons");
        }
        C43852m.m96591c(mo39907P0(), "informationStrip", "4", null, 8, null);
    }

    /* JADX INFO: renamed from: P4 */
    public final void m39726P4() {
        Disposable disposableM39866D0;
        if (C38274t.f85990a.m86354A() || (disposableM39866D0 = MarginConfigManager.f33681a.m39866D0(new Action() { // from class: com.kubi.margin.trade.p0
            @Override // io.reactivex.functions.Action
            public final void run() {
                BaseMarginFragment.m39577Q4(this.f33980b);
            }
        })) == null) {
            return;
        }
        DisposableKt.addTo(disposableM39866D0, getDestroyDisposable());
    }

    @Override // com.kubi.margin.trade.IMarginBehavior
    /* JADX INFO: renamed from: U1 */
    public void mo39732U1() {
        C42579a c42579a = C42579a.f94275a;
        if (c42579a.m93347g().c() && getActivity() != null) {
            FragmentActivity activity = getActivity();
            if (!C27025c.m66566d(activity != null ? Boolean.valueOf(activity.isFinishing()) : null) && c42579a.m93347g().d0().isHasOpenLever()) {
                LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new BaseMarginFragment$fetchMarginCoupons$1(this, null));
            }
        }
    }

    /* JADX INFO: renamed from: V4 */
    public final boolean m39734V4(String str) {
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(str);
        if (symbolInfoEntityM85601B == null) {
            return false;
        }
        return mo39705A0() == 1 ? symbolInfoEntityM85601B.isMarginEnabled() : symbolInfoEntityM85601B.isIsolatedMarginTradeEnabled();
    }

    @Override // com.kubi.margin.trade.IMarginBehavior
    @Nullable
    /* JADX INFO: renamed from: b1 */
    public Pair<CouponsOverview, CouponsOverview> mo39736b1() {
        return this.f33654b0;
    }

    @Override // g10.InterfaceC37770a
    /* JADX INFO: renamed from: g */
    public void mo22379g(boolean z11) throws Exception {
        if (z11) {
            m39738e6();
        }
    }

    @Override // com.kubi.margin.kline.MarginKlineFragment.InterfaceC17697a
    public int getPrecision() {
        return this.f33649W.getSymbolInfoEntity().getPriceIncrementPrecision();
    }

    /* JADX INFO: renamed from: i7 */
    public final void m39740i7(final SymbolOfflineData symbolOfflineData) {
        SymbolOfflineBannerView symbolOfflineBannerView;
        C36947x c36947xM39700y5 = m39700y5();
        if (c36947xM39700y5 == null || (symbolOfflineBannerView = c36947xM39700y5.f82041n) == null) {
            return;
        }
        if (symbolOfflineData == null) {
            symbolOfflineBannerView.m22062f();
            return;
        }
        String symbol = this.f33649W.getSymbol();
        final String showSymbol = this.f33649W.getShowSymbol();
        Context context = getContext();
        String string = null;
        if (context != null) {
            int i11 = R$string.kc_trade_offline_margin_tip;
            Long offlineTime = symbolOfflineData.getOfflineTime();
            string = context.getString(i11, showSymbol, C27041f.m66668h(offlineTime != null ? C42179a.m92633f(offlineTime.longValue(), null, false, true, null, 11, null) : null));
        }
        final String str = string;
        symbolOfflineBannerView.m22060d(symbolOfflineData);
        C27046k.m66711z(symbolOfflineBannerView, 0L, new Function0() { // from class: com.kubi.margin.trade.k1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseMarginFragment.m39646j7(this.f33949b, symbolOfflineData, showSymbol, str);
            }
        }, 1, null);
        Intrinsics.checkNotNull(showSymbol);
        String type = TradeAccountType.Margin.INSTANCE.getType();
        Intrinsics.checkNotNull(symbol);
        SymbolOfflineUtilsExtKt.m22073i(this, symbolOfflineData, showSymbol, str, SymbolOfflineUtilsExtKt.m22067c(type, symbol));
    }

    @Override // com.kubi.margin.trade.IMarginBehavior
    /* JADX INFO: renamed from: n0 */
    public void mo39741n0() {
        final AlertDialogFragmentHelper alertDialogFragmentHelperM54167X4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.notice_prompt);
        int i11 = R$string.trade_index;
        final String string = getString(i11);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        final SpannableString spannableString = new SpannableString(getString(R$string.margin_dialog_market_price_tips, getString(i11)));
        C24129b.m58033e(SiteVisibleConfigKey.LeverageIndex, new Function0() { // from class: com.kubi.margin.trade.l1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseMarginFragment.m39701y6(spannableString, string, alertDialogFragmentHelperM54167X4, this);
            }
        });
        alertDialogFragmentHelperM54167X4.m54154K4(spannableString).m54163T4(getString(R$string.i_know), null).m54172c5(getChildFragmentManager());
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(getLayout(), (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"KCCyclomaticComplexityCheck"})
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        View view2;
        View viewFindViewById;
        SymbolBarLayout symbolBarLayout;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36947x c36947xM39700y5 = m39700y5();
        if (c36947xM39700y5 != null && (symbolBarLayout = c36947xM39700y5.f82040m) != null) {
            Context context = symbolBarLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            symbolBarLayout.m22751a(new C46467b(context), new C46466a(mo39907P0(), mo39705A0() == 2, new Function0() { // from class: com.kubi.margin.trade.h0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseMarginFragment.m39608Z5(this.f33930b);
                }
            }, new Function0() { // from class: com.kubi.margin.trade.s0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseMarginFragment.m39612a6(this.f34176b);
                }
            }, new Function1() { // from class: com.kubi.margin.trade.d1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BaseMarginFragment.m39616b6(this.f33743b, ((Boolean) obj).booleanValue());
                }
            }));
        }
        final C36947x c36947xM39700y6 = m39700y5();
        if (c36947xM39700y6 != null) {
            if (C12573b.f21598a.m23696a()) {
                "handle_click_event".length();
            }
            C12572a.m23692a(this, true, new C18167x75c13716("handle_click_event", null, this));
            AppCompatImageView allDelegation = c36947xM39700y6.f82030c;
            Intrinsics.checkNotNullExpressionValue(allDelegation, "allDelegation");
            C27046k.m66711z(allDelegation, 0L, new Function0() { // from class: com.kubi.margin.trade.o1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseMarginFragment.m39589U5(this.f33976b);
                }
            }, 1, null);
            c36947xM39700y6.f82037j.setAdapter(mo39712E5());
            CustomViewPager customViewPager = c36947xM39700y6.f82037j;
            PagerAdapter adapter = customViewPager.getAdapter();
            customViewPager.setOffscreenPageLimit(C27039d.m66651k(adapter != null ? Integer.valueOf(adapter.getCount()) : null, 2));
            c36947xM39700y6.f82037j.addOnPageChangeListener(new C18159a());
            c36947xM39700y6.f82029b.setNeedBold(true);
            c36947xM39700y6.f82029b.setTabMaxLine(1);
            c36947xM39700y6.f82029b.setOnTabSelectListener(new C18160b());
            c36947xM39700y6.f82029b.setViewPager(c36947xM39700y6.f82037j);
            c36947xM39700y6.f82029b.m55291w();
            c36947xM39700y6.f82039l.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.margin.trade.x1
                @Override // jb0.InterfaceC40373g
                /* JADX INFO: renamed from: a */
                public final void mo15329a(InterfaceC38162f interfaceC38162f) throws Exception {
                    BaseMarginFragment.m39596W5(this.f34205b, interfaceC38162f);
                }
            });
            C27032f.m66611b(this, R$id.fl_trade_container, m39713F5(), null, 4, null);
            c36947xM39700y6.f82036i.setUseHackyViews(false);
            c36947xM39700y6.f82036i.setAdapter(new BGABanner.InterfaceC22979b() { // from class: com.kubi.margin.trade.y1
                @Override // com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner.InterfaceC22979b
                /* JADX INFO: renamed from: a */
                public final void mo17775a(BGABanner bGABanner, View view3, Object obj, int i11) {
                    BaseMarginFragment.m39600X5(this.f34211a, c36947xM39700y6, bGABanner, view3, (InterfaceC43161a) obj, i11);
                }
            });
            MultiLanguageManager.f46805a.addOnLanguageChangeListener(new C18161c());
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null && (view2 = parentFragment.getView()) != null && (viewFindViewById = view2.findViewById(R$id.root_view)) != null) {
                viewFindViewById.setBackgroundResource(R$color.c_overlay);
            }
            c36947xM39700y6.f82038k.setOnCloseClickListener(new Function0() { // from class: com.kubi.margin.trade.z1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseMarginFragment.m39604Y5(c36947xM39700y6, this);
                }
            });
        }
        if (C12573b.f21598a.m23696a()) {
            "action_order_open_or_end".length();
        }
        C12572a.m23692a(this, false, new C18166xb9160a71("action_order_open_or_end", null, this));
        m39720L5();
        m39560K5();
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46815o0.class, SiteInfoManager.f47913a.m58109c());
        boolean zMo102977a = objM56186h != null ? ((InterfaceC46815o0) objM56186h).mo102977a() : false;
        C36947x c36947xM39700y7 = m39700y5();
        if (c36947xM39700y7 != null && (baseTextView3 = c36947xM39700y7.f82043p) != null) {
            C37330a.m83912d(baseTextView3, zMo102977a);
        }
        C36947x c36947xM39700y8 = m39700y5();
        if (c36947xM39700y8 != null && (baseTextView2 = c36947xM39700y8.f82042o) != null) {
            C37330a.m83912d(baseTextView2, zMo102977a);
        }
        C36947x c36947xM39700y9 = m39700y5();
        if (c36947xM39700y9 == null || (baseTextView = c36947xM39700y9.f82042o) == null) {
            return;
        }
        baseTextView.setMovementMethod(LinkMovementMethod.getInstance());
        HighlightTextHelper.f43497a.m54116a(baseTextView, HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(ContextCompat.getColor(baseTextView.getContext(), R$color.c_text)));
    }

    @Override // com.kubi.margin.trade.IMarginBehavior
    @Nullable
    /* JADX INFO: renamed from: q0 */
    public Disposable mo39743q0(@NotNull C37787r wsDataHelper) {
        Intrinsics.checkNotNullParameter(wsDataHelper, "wsDataHelper");
        final String strM39727P6 = m39727P6();
        final String strM39728Q6 = m39728Q6();
        ArrayList arrayList = new ArrayList();
        if (strM39727P6 != null) {
            arrayList.add(strM39727P6);
        }
        if (strM39728Q6 != null) {
            arrayList.add(strM39728Q6);
        }
        Unit unit = Unit.INSTANCE;
        PublishSubject<Message> publishSubjectM85233f = wsDataHelper.m85233f("/indicator/markPrice:%s", CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null));
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.m1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(BaseMarginFragment.m39595W4(this.f33962b, strM39727P6, strM39728Q6, (Message) obj));
            }
        };
        Observable<Message> observableFilter = publishSubjectM85233f.filter(new Predicate() { // from class: com.kubi.margin.trade.n1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return BaseMarginFragment.m39599X4(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.p1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseMarginFragment.m39603Y4((Message) obj);
            }
        };
        Observable observableObserveOn = observableFilter.map(new io.reactivex.functions.Function() { // from class: com.kubi.margin.trade.q1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BaseMarginFragment.m39607Z4(function2, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final Function1 function3 = new Function1() { // from class: com.kubi.margin.trade.r1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseMarginFragment.m39611a5(strM39727P6, this, strM39728Q6, (String) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.margin.trade.s1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseMarginFragment.m39619c5(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.margin.trade.t1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseMarginFragment.m39622d5((Throwable) obj);
            }
        };
        return observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.trade.u1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseMarginFragment.m39626e5(function4, obj);
            }
        });
    }

    /* JADX INFO: renamed from: t5 */
    public final void m39745t5(final C36947x c36947x, View view, final InterfaceC43161a interfaceC43161a) {
        final MarqueeTextView marqueeTextView = (MarqueeTextView) view.findViewById(R$id.marqueeView);
        marqueeTextView.setContentList(C43162b.m94762b(interfaceC43161a));
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.margin.trade.g0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseMarginFragment.m39688u5(this.f33924b, marqueeTextView);
            }
        }, 1, null);
        ImageView imageView = (ImageView) view.findViewById(R$id.iv_close);
        imageView.setImageTintList(ContextCompat.getColorStateList(imageView.getContext(), R$color.c_icon60));
        Intrinsics.checkNotNull(imageView);
        C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.margin.trade.i0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseMarginFragment.m39691v5(interfaceC43161a, this, c36947x);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: u6 */
    public void m39746u6(@NotNull CurrencyBalance balance) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.f33651Y = balance;
    }

    @Override // com.kubi.margin.trade.IMarginBehavior
    /* JADX INFO: renamed from: w0 */
    public void mo39747w0(@Nullable BigDecimal bigDecimal, @Nullable CharSequence charSequence, @Nullable BigDecimal bigDecimal2, @Nullable CharSequence charSequence2) {
        if (C42579a.f94275a.m93347g().c()) {
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new BaseMarginFragment$notifyAvailableBalanceChange$3(this, bigDecimal, charSequence, null));
            return;
        }
        if (isAdded()) {
            List<Fragment> fragments = getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : fragments) {
                if (obj instanceof MarginTradeOpenOrdersFragment) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((MarginTradeOpenOrdersFragment) obj2).isAdded()) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((MarginTradeOpenOrdersFragment) it.next()).m38105A3(null, null);
            }
        }
    }

    /* JADX INFO: renamed from: w6 */
    public final void m39748w6(long j11) {
        this.f33656d0 = j11;
    }

    /* JADX INFO: renamed from: x5 */
    public final BaseMarginViewModel m39749x5() {
        return (BaseMarginViewModel) this.f33648V.getValue();
    }

    /* JADX INFO: renamed from: x6 */
    public void m39750x6(@NotNull CurrencyBalance balance) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.f33652Z = balance;
    }

    /* JADX INFO: renamed from: B6 */
    public static final Unit m39531B6(BaseMarginFragment baseMarginFragment, String str) {
        ImageView f104635k;
        SymbolBarLayout symbolBarLayout;
        InterfaceC46140b f20880b;
        if (baseMarginFragment.getView() == null) {
            return Unit.INSTANCE;
        }
        C36947x c36947xM39700y5 = baseMarginFragment.m39700y5();
        if (c36947xM39700y5 != null && (symbolBarLayout = c36947xM39700y5.f82040m) != null && (f20880b = symbolBarLayout.getF20880b()) != null) {
            f104635k = f20880b.getF104635k();
        } else {
            f104635k = null;
        }
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895cM54318b = new C22896d().m54333q(f104635k).m54319c(150).m54323g(0).m54317a(baseMarginFragment.new C18164f(f104635k)).m54320d(false).m54318b();
        if (f104635k != null) {
            f104635k.setTag(viewOnKeyListenerC22895cM54318b);
        }
        viewOnKeyListenerC22895cM54318b.m54313k(false);
        if (baseMarginFragment.isShowing()) {
            viewOnKeyListenerC22895cM54318b.m54315m(baseMarginFragment);
            C46392a.m102328k(C45618h.f102740a.m100715c(str), true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J6 */
    public static final Unit m39557J6(BaseMarginFragment baseMarginFragment) {
        if (baseMarginFragment.isShowing()) {
            baseMarginFragment.m39545G5().m85236i(true);
            baseMarginFragment.m39713F5().D5(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L6 */
    public static final Unit m39563L6(BaseMarginFragment baseMarginFragment, Long l11) {
        if (baseMarginFragment.m39713F5().isAdded()) {
            List<Fragment> fragments = baseMarginFragment.m39713F5().getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : fragments) {
                if (obj instanceof IMarginChildBehavior) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((IMarginChildBehavior) it.next()).m40005S();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M6 */
    public static final void m39567M6(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N6 */
    public static final Unit m39571N6(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O6 */
    public static final void m39573O6(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P5 */
    public static final Unit m39575P5(BaseMarginFragment baseMarginFragment) {
        C36947x c36947xM39700y5 = baseMarginFragment.m39700y5();
        if (c36947xM39700y5 != null) {
            baseMarginFragment.m39737c6(c36947xM39700y5);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q4 */
    public static final void m39577Q4(BaseMarginFragment baseMarginFragment) {
        baseMarginFragment.m39714G6();
    }

    /* JADX INFO: renamed from: S4 */
    private final void m39583S4() {
        Boolean boolM56221L;
        Bundle arguments = getArguments();
        if (arguments != null && (boolM56221L = RouteExKt.m56221L(arguments, "isBuy")) != null) {
            m39713F5().i0(boolM56221L.booleanValue());
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.remove("isBuy");
        }
    }

    /* JADX INFO: renamed from: S6 */
    private final void m39584S6(Pair<Integer, Integer> pair) {
        PagerAdapter adapter;
        String string;
        String string2;
        SlidingTabLayout slidingTabLayout;
        CustomViewPager customViewPager;
        C36947x c36947xM39700y5 = m39700y5();
        if (c36947xM39700y5 != null && (customViewPager = c36947xM39700y5.f82037j) != null) {
            adapter = customViewPager.getAdapter();
        } else {
            adapter = null;
        }
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.kubi.utils.InnerPagerAdapter");
        C27103z c27103z = (C27103z) adapter;
        if (!C42579a.f94275a.m93347g().c()) {
            string2 = getString(R$string.todo_delegation);
        } else {
            this.f33666n0 = pair.getFirst().intValue() + pair.getSecond().intValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getString(R$string.todo_delegation));
            if (this.f33666n0 > 99) {
                string = "(99+)";
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append('(');
                sb3.append(this.f33666n0);
                sb3.append(')');
                string = sb3.toString();
            }
            sb2.append(string);
            string2 = sb2.toString();
        }
        Intrinsics.checkNotNull(string2);
        if (!c27103z.m66939a().isEmpty()) {
            List<CharSequence> listM66939a = c27103z.m66939a();
            Intrinsics.checkNotNull(listM66939a, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.CharSequence>");
            TypeIntrinsics.asMutableList(listM66939a).set(0, string2);
        } else {
            String string3 = getString(R$string.margin_asset_manage);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            c27103z.m66940b(CollectionsKt.arrayListOf(string2, string3));
        }
        C36947x c36947xM39700y6 = m39700y5();
        if (c36947xM39700y6 != null && (slidingTabLayout = c36947xM39700y6.f82029b) != null) {
            slidingTabLayout.m55291w();
        }
    }

    /* JADX INFO: renamed from: T5 */
    public static final Unit m39586T5(BaseMarginFragment baseMarginFragment) {
        SymbolBarLayout symbolBarLayout;
        baseMarginFragment.m39725O5();
        C36947x c36947xM39700y5 = baseMarginFragment.m39700y5();
        if (c36947xM39700y5 != null) {
            symbolBarLayout = c36947xM39700y5.f82040m;
        } else {
            symbolBarLayout = null;
        }
        C43518g.m95755n(symbolBarLayout, baseMarginFragment.getDestroyDisposable());
        baseMarginFragment.m39726P4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T6 */
    private final void m39587T6() {
        C43839s c43839sM39709C5 = m39709C5();
        String symbol = this.f33649W.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        Observable<MarketListEntityItem> observableM96544h = c43839sM39709C5.m96544h(symbol);
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(BaseMarginFragment.m39590U6(this.f33725b, (MarketListEntityItem) obj));
            }
        };
        Observable<MarketListEntityItem> observableFilter = observableM96544h.filter(new Predicate() { // from class: com.kubi.margin.trade.h
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return BaseMarginFragment.m39593V6(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseMarginFragment.m39597W6(this.f33936b, (MarketListEntityItem) obj);
            }
        };
        Consumer<? super MarketListEntityItem> consumer = new Consumer() { // from class: com.kubi.margin.trade.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseMarginFragment.m39601X6(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.margin.trade.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseMarginFragment.m39605Y6(this.f33947b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableFilter.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.trade.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseMarginFragment.m39609Z6(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        C43839s c43839sM39709C6 = m39709C5();
        String symbol2 = this.f33649W.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol2, "getSymbol(...)");
        Observable<ArrayList<SymbolInfoEntity>> observableM96545i = c43839sM39709C6.m96545i(symbol2);
        final Function1 function4 = new Function1() { // from class: com.kubi.margin.trade.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(BaseMarginFragment.m39613a7((ArrayList) obj));
            }
        };
        Observable<ArrayList<SymbolInfoEntity>> observableObserveOn = observableM96545i.filter(new Predicate() { // from class: com.kubi.margin.trade.o
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return BaseMarginFragment.m39617b7(function4, obj);
            }
        }).observeOn(C42916f.m94127f());
        final Function1 function5 = new Function1() { // from class: com.kubi.margin.trade.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseMarginFragment.m39620c7(this.f33979b, (ArrayList) obj);
            }
        };
        Observable<ArrayList<SymbolInfoEntity>> observableObserveOn2 = observableObserveOn.doOnNext(new Consumer() { // from class: com.kubi.margin.trade.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseMarginFragment.m39624d7(function5, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final Function1 function6 = new Function1() { // from class: com.kubi.margin.trade.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseMarginFragment.m39627e7(this.f33741b, (ArrayList) obj);
            }
        };
        Consumer<? super ArrayList<SymbolInfoEntity>> consumer2 = new Consumer() { // from class: com.kubi.margin.trade.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseMarginFragment.m39630f7(function6, obj);
            }
        };
        final Function1 function7 = new Function1() { // from class: com.kubi.margin.trade.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseMarginFragment.m39634g7(this.f33916b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe2 = observableObserveOn2.subscribe(consumer2, new Consumer() { // from class: com.kubi.margin.trade.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseMarginFragment.m39638h7(function7, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe2, getDestroyDisposable());
    }

    /* JADX INFO: renamed from: U5 */
    public static final Unit m39589U5(final BaseMarginFragment baseMarginFragment) {
        final boolean z11;
        C43852m.m96591c(baseMarginFragment.mo39907P0(), "orderManagement", "5", null, 8, null);
        if (baseMarginFragment.mo39705A0() == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        IUserService.O(C42579a.f94275a.m93347g(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.margin.trade.u0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseMarginFragment.m39592V5(this.f34184b, z11);
            }
        }), 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W6 */
    public static final Unit m39597W6(BaseMarginFragment baseMarginFragment, MarketListEntityItem marketListEntityItem) {
        Double dValueOf;
        KuCoinRefreshLayout kuCoinRefreshLayout;
        C36947x c36947xM39700y5 = baseMarginFragment.m39700y5();
        if (c36947xM39700y5 != null && (kuCoinRefreshLayout = c36947xM39700y5.f82039l) != null) {
            kuCoinRefreshLayout.setRefreshing(false);
        }
        TradeItemBean tradeItemBean = baseMarginFragment.f33649W;
        String last24HourRate = marketListEntityItem.getLast24HourRate();
        if (last24HourRate != null) {
            dValueOf = Double.valueOf(Double.parseDouble(last24HourRate));
        } else {
            dValueOf = null;
        }
        tradeItemBean.setChangeRate(dValueOf);
        baseMarginFragment.m39692v6();
        baseMarginFragment.f33649W.setFavor(marketListEntityItem.getFavoritePersonal());
        baseMarginFragment.f33649W.setAlarm(marketListEntityItem.getAlarmingPersonal());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X6 */
    public static final void m39601X6(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Y6 */
    public static final Unit m39605Y6(BaseMarginFragment baseMarginFragment, Throwable th2) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        C44128b.m97264h(th2);
        C36947x c36947xM39700y5 = baseMarginFragment.m39700y5();
        if (c36947xM39700y5 != null && (kuCoinRefreshLayout = c36947xM39700y5.f82039l) != null) {
            kuCoinRefreshLayout.setRefreshing(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z5 */
    public static final Unit m39608Z5(BaseMarginFragment baseMarginFragment) {
        baseMarginFragment.m39724O4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z6 */
    public static final void m39609Z6(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a6 */
    public static final Unit m39612a6(BaseMarginFragment baseMarginFragment) {
        baseMarginFragment.m39549H6();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c5 */
    public static final void m39619c5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d5 */
    public static final Unit m39622d5(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d7 */
    public static final void m39624d7(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e5 */
    public static final void m39626e5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e7 */
    public static final Unit m39627e7(BaseMarginFragment baseMarginFragment, ArrayList arrayList) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        C36947x c36947xM39700y5 = baseMarginFragment.m39700y5();
        if (c36947xM39700y5 != null && (kuCoinRefreshLayout = c36947xM39700y5.f82039l) != null) {
            kuCoinRefreshLayout.setRefreshing(false);
        }
        baseMarginFragment.m39749x5().m39763A(baseMarginFragment.f33649W);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f7 */
    public static final void m39630f7(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g5 */
    public static final Unit m39632g5(BaseMarginFragment baseMarginFragment, Pair pair) {
        Intrinsics.checkNotNull(pair);
        baseMarginFragment.m39584S6(pair);
        List<Fragment> fragments = baseMarginFragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof MarginTradeOpenOrdersFragment) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((MarginTradeOpenOrdersFragment) obj2).isAdded()) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((MarginTradeOpenOrdersFragment) it.next()).m38113w3(pair);
        }
        if (!baseMarginFragment.m39731T4() && !baseMarginFragment.m39733U4()) {
            com.kubi.margin.trade.holder.businessTrack.a.a.d(0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g7 */
    public static final Unit m39634g7(BaseMarginFragment baseMarginFragment, Throwable th2) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        C36947x c36947xM39700y5 = baseMarginFragment.m39700y5();
        if (c36947xM39700y5 != null && (kuCoinRefreshLayout = c36947xM39700y5.f82039l) != null) {
            kuCoinRefreshLayout.setRefreshing(false);
        }
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h5 */
    public static final void m39636h5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h7 */
    public static final void m39638h7(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i5 */
    public static final Unit m39640i5(BaseMarginFragment baseMarginFragment, Throwable th2) {
        if (!baseMarginFragment.m39731T4() && !baseMarginFragment.m39733U4()) {
            com.kubi.margin.trade.holder.businessTrack.a.a.a();
        }
        th2.printStackTrace();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j5 */
    public static final void m39644j5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j7 */
    public static final Unit m39646j7(BaseMarginFragment baseMarginFragment, SymbolOfflineData symbolOfflineData, String str, String str2) {
        Intrinsics.checkNotNull(str);
        SymbolOfflineUtilsExtKt.m22077m(baseMarginFragment, symbolOfflineData, str, str2, false, null, 24, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k5 */
    public static final Unit m39649k5(BaseMarginFragment baseMarginFragment, String str, String str2, List list) {
        BigDecimal bigDecimalDivide;
        Object next;
        Object next2;
        Object next3;
        BigDecimal value;
        BigDecimal value2;
        BigDecimal value3;
        Intrinsics.checkNotNull(list);
        Iterator it = list.iterator();
        do {
            bigDecimalDivide = null;
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!Intrinsics.areEqual(((MarkPrice) next).getSymbol(), str));
        MarkPrice markPrice = (MarkPrice) next;
        if (markPrice != null && (value3 = markPrice.getValue()) != null) {
            C46897a.m103304p(baseMarginFragment.getF33651Y(), value3);
        }
        Iterator it2 = list.iterator();
        do {
            if (it2.hasNext()) {
                next2 = it2.next();
            } else {
                next2 = null;
                break;
            }
        } while (!Intrinsics.areEqual(((MarkPrice) next2).getSymbol(), str2));
        MarkPrice markPrice2 = (MarkPrice) next2;
        if (markPrice2 != null && (value2 = markPrice2.getValue()) != null) {
            C46897a.m103304p(baseMarginFragment.getF33652Z(), value2);
        }
        Iterator it3 = list.iterator();
        do {
            if (it3.hasNext()) {
                next3 = it3.next();
            } else {
                next3 = null;
                break;
            }
        } while (!Intrinsics.areEqual(((MarkPrice) next3).getSymbol(), "USDT-BTC"));
        MarkPrice markPrice3 = (MarkPrice) next3;
        if (markPrice3 != null && (value = markPrice3.getValue()) != null) {
            C46901e.f104766a.m103310b(value);
        }
        BigDecimal bigDecimalM103292d = C46897a.m103292d(baseMarginFragment.getF33651Y());
        if (bigDecimalM103292d != null) {
            bigDecimalDivide = bigDecimalM103292d.divide(C41014a.m89921F(C46897a.m103292d(baseMarginFragment.getF33652Z()), "1"), 12, RoundingMode.DOWN);
        }
        List<Fragment> fragments = baseMarginFragment.m39713F5().getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof IMarginChildBehavior) {
                arrayList.add(obj);
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ((IMarginChildBehavior) it4.next()).m40014m0(bigDecimalDivide);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l5 */
    public static final void m39654l5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m5 */
    public static final Unit m39658m5(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m6 */
    public static final void m39659m6(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n5 */
    public static final void m39662n5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n6 */
    public static final Unit m39663n6(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o5 */
    public static final Unit m39666o5(BaseMarginFragment baseMarginFragment, Pair pair) {
        String currency;
        String currency2;
        if (baseMarginFragment.mo39705A0() == 2 && baseMarginFragment.f33657e0 < baseMarginFragment.f33656d0) {
            List<Fragment> fragments = baseMarginFragment.getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : fragments) {
                if (obj instanceof MarginTradeOpenOrdersFragment) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((MarginTradeOpenOrdersFragment) obj2).isAdded()) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                MarginTradeOpenOrdersFragment.m38103x3((MarginTradeOpenOrdersFragment) it.next(), null, 1, null);
            }
            return Unit.INSTANCE;
        }
        if (pair.getFirst() != null && pair.getSecond() != null) {
            CurrencyBalance currencyBalance = (CurrencyBalance) pair.getFirst();
            CurrencyBalance currencyBalance2 = (CurrencyBalance) pair.getSecond();
            if (currencyBalance != null) {
                currency = currencyBalance.getCurrency();
            } else {
                currency = null;
            }
            if (Intrinsics.areEqual(currency, baseMarginFragment.mo39722N().getBaseCurrency())) {
                if (currencyBalance2 != null) {
                    currency2 = currencyBalance2.getCurrency();
                } else {
                    currency2 = null;
                }
                if (Intrinsics.areEqual(currency2, baseMarginFragment.mo39722N().getQuoteCurrency())) {
                    Intrinsics.checkNotNull(currencyBalance2);
                    baseMarginFragment.f33652Z = currencyBalance2;
                    Intrinsics.checkNotNull(currencyBalance);
                    baseMarginFragment.f33651Y = currencyBalance;
                    List<Fragment> fragments2 = baseMarginFragment.m39713F5().getChildFragmentManager().getFragments();
                    Intrinsics.checkNotNullExpressionValue(fragments2, "getFragments(...)");
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : fragments2) {
                        if (obj3 instanceof IMarginChildBehavior) {
                            arrayList3.add(obj3);
                        }
                    }
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        ((IMarginChildBehavior) it2.next()).m40005S();
                    }
                    List<Fragment> fragments3 = baseMarginFragment.getChildFragmentManager().getFragments();
                    Intrinsics.checkNotNullExpressionValue(fragments3, "getFragments(...)");
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj4 : fragments3) {
                        if (obj4 instanceof MarginWholePositionFragment) {
                            arrayList4.add(obj4);
                        }
                    }
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        ((MarginWholePositionFragment) it3.next()).m40577g4();
                    }
                }
            }
            if (baseMarginFragment.mo39705A0() == 2) {
                baseMarginFragment.mo39730S5();
            }
            List<Fragment> fragments4 = baseMarginFragment.getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments4, "getFragments(...)");
            ArrayList arrayList5 = new ArrayList();
            for (Object obj5 : fragments4) {
                if (obj5 instanceof MarginTradeOpenOrdersFragment) {
                    arrayList5.add(obj5);
                }
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj6 : arrayList5) {
                if (((MarginTradeOpenOrdersFragment) obj6).isAdded()) {
                    arrayList6.add(obj6);
                }
            }
            Iterator it4 = arrayList6.iterator();
            while (it4.hasNext()) {
                MarginTradeOpenOrdersFragment.m38103x3((MarginTradeOpenOrdersFragment) it4.next(), null, 1, null);
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o6 */
    public static final void m39667o6(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p5 */
    public static final void m39670p5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q5 */
    public static final Unit m39674q5(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r5 */
    public static final void m39678r5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s5 */
    public static final void m39682s5(BaseMarginFragment baseMarginFragment) {
        baseMarginFragment.mo39730S5();
    }

    /* JADX INFO: renamed from: u5 */
    public static final Unit m39688u5(BaseMarginFragment baseMarginFragment, MarqueeTextView marqueeTextView) {
        C43852m.m96591c(baseMarginFragment.mo39907P0(), "informationStrip", "5", null, 8, null);
        try {
            Result.Companion companion = Result.INSTANCE;
            C43169i.f95330a.m94780j(marqueeTextView.getCurrentIndex());
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v6 */
    private final void m39692v6() {
        SymbolBarLayout symbolBarLayout;
        C46148j f20881c;
        C36947x c36947xM39700y5 = m39700y5();
        if (c36947xM39700y5 != null && (symbolBarLayout = c36947xM39700y5.f82040m) != null && (f20881c = symbolBarLayout.getF20881c()) != null) {
            String symbol = this.f33649W.getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
            C46148j.m101729s(f20881c, symbol, this.f33649W.getChangeRate(), false, 4, null);
        }
    }

    /* JADX INFO: renamed from: z6 */
    public static final void m39704z6(AlertDialogFragmentHelper alertDialogFragmentHelper, BaseMarginFragment baseMarginFragment, View view) {
        alertDialogFragmentHelper.dismissAllowingStateLoss();
        C42290a.f93780a.m92825d(baseMarginFragment.mo39722N());
    }

    /* JADX INFO: renamed from: A6 */
    public final void m39707A6(@Nullable final String str) {
        if (isShowing() && !C46392a.m102322d(C45618h.f102740a.m100715c(str), false)) {
            BaseFragment.runOnUiThread$default(this, new Function0() { // from class: com.kubi.margin.trade.q0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseMarginFragment.m39531B6(this.f34161b, str);
                }
            }, 200L, null, 4, null);
        }
    }

    /* JADX INFO: renamed from: L5 */
    public final void m39720L5() {
        m39749x5().m39768x().observe(getViewLifecycleOwner(), new C18163e(new Function1() { // from class: com.kubi.margin.trade.r0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseMarginFragment.m39566M5(this.f34168b, (MarginSymbolInfo) obj);
            }
        }));
        m39749x5().m39767w().observe(getViewLifecycleOwner(), new C18163e(new Function1() { // from class: com.kubi.margin.trade.t0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseMarginFragment.m39570N5(this.f34179b, (MarginNoticeBanner) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O5 */
    public final void m39725O5() {
        BGABanner bGABanner;
        C36947x c36947xM39700y5 = m39700y5();
        if (c36947xM39700y5 != null && (bGABanner = c36947xM39700y5.f82036i) != null) {
            bGABanner.startAutoPlay();
        }
        Disposable disposableM94781k = C43169i.f95330a.m94781k(new Function0() { // from class: com.kubi.margin.trade.j0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseMarginFragment.m39575P5(this.f33942b);
            }
        });
        if (disposableM94781k != null) {
            DisposableKt.addTo(disposableM94781k, getDestroyDisposable());
        }
    }

    /* JADX INFO: renamed from: P6 */
    public final String m39727P6() {
        if (!Intrinsics.areEqual(mo39722N().getBaseCurrency(), "BTC")) {
            return mo39722N().getBaseCurrency() + "-BTC";
        }
        return null;
    }

    /* JADX INFO: renamed from: Q6 */
    public final String m39728Q6() {
        if (!Intrinsics.areEqual(mo39722N().getQuoteCurrency(), "BTC")) {
            return mo39722N().getQuoteCurrency() + "-BTC";
        }
        return null;
    }

    /* JADX INFO: renamed from: T4 */
    public final boolean m39731T4() {
        C36947x c36947xM39700y5;
        CustomViewPager customViewPager;
        if (isAdded() && (c36947xM39700y5 = m39700y5()) != null && (customViewPager = c36947xM39700y5.f82037j) != null && customViewPager.getCurrentItem() == 1 && m39695w5() == 0 && m39751z5() <= 2) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: U4 */
    public final boolean m39733U4() {
        C36947x c36947xM39700y5;
        CustomViewPager customViewPager;
        if (isAdded() && (c36947xM39700y5 = m39700y5()) != null && (customViewPager = c36947xM39700y5.f82037j) != null && customViewPager.getCurrentItem() == 1 && m39695w5() == 1 && m39751z5() > 2) {
            return true;
        }
        return false;
    }

    @Override // com.kubi.margin.trade.IMarginBehavior
    /* JADX INFO: renamed from: W */
    public void mo39735W() {
        final String strM39727P6 = m39727P6();
        final String strM39728Q6 = m39728Q6();
        InterfaceC46305f interfaceC46305fM39876V0 = MarginConfigManager.f33681a.m39876V0();
        ArrayList arrayList = new ArrayList();
        if (strM39727P6 != null) {
            arrayList.add(strM39727P6);
        }
        if (strM39728Q6 != null) {
            arrayList.add(strM39728Q6);
        }
        arrayList.add("USDT-BTC");
        Observable<R> observableCompose = interfaceC46305fM39876V0.m102068B(arrayList).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.v0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseMarginFragment.m39649k5(this.f34188b, strM39727P6, strM39728Q6, (List) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.margin.trade.w0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseMarginFragment.m39654l5(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.x0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseMarginFragment.m39658m5((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.trade.y0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseMarginFragment.m39662n5(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    /* JADX INFO: renamed from: c6 */
    public final void m39737c6(C36947x c36947x) {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        if (!isDetached()) {
            List<InterfaceC43161a> listM94779i = C43169i.f95330a.m94779i();
            if (!C38274t.f85990a.m86354A() && !listM94779i.isEmpty()) {
                FrameLayout flBanner = c36947x.f82032e;
                Intrinsics.checkNotNullExpressionValue(flBanner, "flBanner");
                ViewExtKt.m66594y(flBanner);
                ViewParent parent = c36947x.f82032e.getParent();
                if (parent instanceof ConstraintLayout) {
                    constraintLayout2 = (ConstraintLayout) parent;
                } else {
                    constraintLayout2 = null;
                }
                if (constraintLayout2 != null) {
                    constraintLayout2.setConstraintSet(null);
                }
                BGABanner bGABanner = c36947x.f82036i;
                boolean z11 = true;
                if (listM94779i.size() == 1) {
                    z11 = false;
                }
                bGABanner.setAutoPlayAble(z11);
                c36947x.f82036i.setData(R$layout.bmargin_item_lever_marquee, listM94779i, (List<String>) null);
                return;
            }
            FrameLayout flBanner2 = c36947x.f82032e;
            Intrinsics.checkNotNullExpressionValue(flBanner2, "flBanner");
            ViewExtKt.m66577h(flBanner2);
            ViewParent parent2 = c36947x.f82032e.getParent();
            if (parent2 instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) parent2;
            } else {
                constraintLayout = null;
            }
            if (constraintLayout != null) {
                constraintLayout.setConstraintSet(null);
            }
        }
    }

    /* JADX INFO: renamed from: e6 */
    public void m39738e6() throws Exception {
        m39545G5().m85234g(new Action() { // from class: com.kubi.margin.trade.f0
            @Override // io.reactivex.functions.Action
            public final void run() {
                BaseMarginFragment.m39629f6(this.f33917b);
            }
        });
    }

    /* JADX INFO: renamed from: f5 */
    public final void m39739f5() {
        Observable<Pair<Integer, Integer>> observableM96542d = m39709C5().m96542d(mo39705A0());
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseMarginFragment.m39632g5(this.f34187b, (Pair) obj);
            }
        };
        Consumer<? super Pair<Integer, Integer>> consumer = new Consumer() { // from class: com.kubi.margin.trade.x
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseMarginFragment.m39636h5(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseMarginFragment.m39640i5(this.f34209b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableM96542d.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.trade.z
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseMarginFragment.m39644j5(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getVisibleDisposable());
    }

    @Override // com.kubi.margin.trade.IMarginBehavior
    @NotNull
    /* JADX INFO: renamed from: o0 */
    public C43839s mo39742o0() {
        return m39709C5();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String strM102326h = C46392a.m102326h(new StorageId(ViewProps.MARGIN, "lastSymbol" + mo39705A0(), StorageType.LocalSite, true), "");
        if (TextUtils.isEmpty(strM102326h)) {
            strM102326h = "BTC-" + C38184b.f85884a.m86147b();
        }
        this.f33649W = new TradeItemBean(strM102326h);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        BGABanner bGABanner;
        if (getView() != null) {
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
            m39545G5().m85236i(false);
            C43841b.m96555b("B4tradingCross", null, 2, null);
            C43841b.m96555b("B4tradingIsolated", null, 2, null);
            com.kubi.margin.trade.holder.businessTrack.a.a.a();
            C36947x c36947xM39700y5 = m39700y5();
            if (c36947xM39700y5 != null && (bGABanner = c36947xM39700y5.f82036i) != null) {
                bGABanner.stopAutoPlay();
            }
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        C36947x c36947xM39700y5 = m39700y5();
        if (c36947xM39700y5 != null && (kuCoinRefreshLayout = c36947xM39700y5.f82039l) != null) {
            kuCoinRefreshLayout.autoRefresh();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0045  */
    @Override // com.kubi.sdk.BaseFragment
    public void onShow() throws Exception {
        HoldingEarnEntryCardView holdingEarnEntryCardView;
        Boolean boolValueOf;
        FrameLayout frameLayout;
        m39580R4();
        m39587T6();
        m39583S4();
        mo22379g(true);
        m39739f5();
        m39552I5();
        SymbolBarLayout symbolBarLayout = null;
        if (C37878b0.f85252a.m85527h(mo39705A0())) {
            C36947x c36947xM39700y5 = m39700y5();
            if (c36947xM39700y5 != null && (frameLayout = c36947xM39700y5.f82035h) != null) {
                boolValueOf = Boolean.valueOf(ViewExtKt.m66579j(frameLayout));
            } else {
                boolValueOf = null;
            }
            if (C27025c.m66566d(boolValueOf)) {
                C38274t.f85990a.m86364t(this, new Function0() { // from class: com.kubi.margin.trade.b
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseMarginFragment.m39586T5(this.f33720b);
                    }
                });
            } else {
                C38274t.f85990a.m86366x().onNext(Boolean.TRUE);
            }
        } else {
            C38274t.f85990a.m86366x().onNext(Boolean.TRUE);
        }
        m39725O5();
        C36947x c36947xM39700y6 = m39700y5();
        if (c36947xM39700y6 != null) {
            symbolBarLayout = c36947xM39700y6.f82040m;
        }
        C43518g.m95755n(symbolBarLayout, getDestroyDisposable());
        m39726P4();
        m39749x5().m39763A(this.f33649W);
        m39719K6();
        String strMo39907P0 = mo39907P0();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("symbol", mo39722N().getCode());
        Unit unit = Unit.INSTANCE;
        C43852m.m96595g(strMo39907P0, "symbolZone", null, jSONObject, 4, null);
        C36947x c36947xM39700y7 = m39700y5();
        if (c36947xM39700y7 != null && (holdingEarnEntryCardView = c36947xM39700y7.f82034g) != null) {
            holdingEarnEntryCardView.m54529g();
        }
        m39623d6();
    }

    /* JADX INFO: renamed from: s6 */
    public void m39744s6(int i11) {
        AppBarLayout appBarLayout;
        ViewGroup.LayoutParams layoutParams;
        CoordinatorLayout.LayoutParams layoutParams2;
        CoordinatorLayout.Behavior behavior;
        C36947x c36947xM39700y5 = m39700y5();
        AppBarLayout.Behavior behavior2 = null;
        if (c36947xM39700y5 != null) {
            appBarLayout = c36947xM39700y5.f82031d;
        } else {
            appBarLayout = null;
        }
        if (i11 == 0 && appBarLayout != null) {
            appBarLayout.setExpanded(true, false);
        }
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
            behavior2.setTopAndBottomOffset(i11);
        }
    }

    /* JADX INFO: renamed from: z5 */
    public final int m39751z5() {
        Integer numValueOf;
        try {
            List<Fragment> fragments = getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : fragments) {
                if (obj instanceof MarginSubmitFragment) {
                    arrayList.add(obj);
                }
            }
            MarginSubmitFragment marginSubmitFragment = (MarginSubmitFragment) CollectionsKt.firstOrNull((List) arrayList);
            if (marginSubmitFragment != null) {
                numValueOf = Integer.valueOf(marginSubmitFragment.X());
            } else {
                numValueOf = null;
            }
            return C27039d.m66650j(numValueOf);
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.kubi.margin.trade.IMarginBehavior
    @NotNull
    /* JADX INFO: renamed from: H */
    public BaseFragment mo39715H() {
        return this;
    }

    /* JADX INFO: renamed from: R5 */
    public void mo39729R5() {
    }

    /* JADX INFO: renamed from: S5 */
    public void mo39730S5() {
    }
}
