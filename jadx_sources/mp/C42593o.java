package mp;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.core.biz.BaseTradeCoreFragment;
import com.kubi.data.entity.MarginSymbolInfo;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.flutter.widget.kline.C12803q;
import com.kubi.margin.api.IMarginService;
import com.kubi.margin.api.entity.CouponsOverview;
import com.kubi.margin.api.entity.FeeEntity;
import com.kubi.margin.api.entity.FundsInfo;
import com.kubi.margin.api.entity.IsolateMarginPosition;
import com.kubi.margin.api.entity.IsolateMarginPositionTag;
import com.kubi.margin.api.entity.IsolatedMarginBridgeConfig;
import com.kubi.margin.api.entity.LeverBalance;
import com.kubi.margin.api.entity.MarginBonusConfig;
import com.kubi.margin.api.entity.MarginBridgeConfig;
import com.kubi.margin.api.entity.MarginCouponConfig;
import com.kubi.margin.api.entity.MarginPosition;
import com.kubi.margin.api.entity.MarginWelfare;
import com.kubi.margin.api.entity.MarkPrice;
import com.kubi.margin.entity.IsolateMarginPositionConfig;
import com.kubi.margin.kline.MarginFlutterKlineLandscapeActivity;
import com.kubi.margin.market.MarginSymbolsFragment;
import com.kubi.margin.p099eu.EuMarginRiskAgreementManager;
import com.kubi.margin.trade.BaseMarginFragment;
import com.kubi.margin.trade.MarginConfigManager;
import com.kubi.margin.trade.MarginIsolateTradeFragment;
import com.kubi.margin.trade.MarginTradeFragment;
import com.kubi.margin.trade.coupons.CouponsHelper;
import com.kubi.margin.trade.dialog.SwitchMarginTradeDialog;
import com.kubi.margin.trade.etf.EtfInfoFragment;
import com.kubi.margin.view.LeverGiftView;
import com.kubi.margin.view.MarginRiskView;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.spot.api.ISpotService;
import com.kubi.tradebase.business.klineSettings.KLineSettingConfig;
import com.kubi.user.api.IUserService;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.kubi.utils.storage.StorageType;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37754f;
import g00.InterfaceC37756h;
import gf.C37890n;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p318hp.C38236a;
import p318hp.C38279v0;
import p402kf.C41014a;
import p429lf.C42180b;
import p437lp.C42290a;
import p698vp.C45612b;
import p768xo.InterfaceC46303d;
import p768xo.InterfaceC46305f;
import p804yo.AbstractC46554a;
import p804yo.InterfaceC46555b;
import p830zf.InterfaceC46789b0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: mp.o */
/* JADX INFO: compiled from: MarginService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000À\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001aH\u0016J\u001a\u0010!\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001aH\u0016J\u0018\u0010\"\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001aH\u0016J\u001a\u0010#\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001aH\u0016J\u0018\u0010$\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001aH\u0016J\u0018\u0010&\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001aH\u0016J\u0010\u0010'\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001aH\u0016J\n\u0010(\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010)\u001a\u00020*H\u0016J\u0012\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010 \u001a\u00020\u001aH\u0016J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020,0.H\u0016J\u001e\u0010/\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u0016000\u001c2\u0006\u00101\u001a\u00020\u001aH\u0016J\u001a\u00102\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0018H\u0016J\u0010\u00107\u001a\u00020\u00162\u0006\u00108\u001a\u000209H\u0016J\u0010\u0010:\u001a\u00020\u00162\u0006\u00108\u001a\u000209H\u0016J\u0012\u0010;\u001a\u0004\u0018\u00010<2\u0006\u00108\u001a\u000209H\u0016J\b\u0010=\u001a\u00020>H\u0016J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001aH\u0016J\u0017\u0010?\u001a\u0004\u0018\u00010\u00122\u0006\u0010 \u001a\u00020\u001aH\u0016¢\u0006\u0002\u0010@J\u001f\u0010A\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010\u001c2\b\u0010C\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010DJ\u001a\u0010E\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001aH\u0016J\u001a\u0010F\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001aH\u0016J\u0012\u0010G\u001a\u0004\u0018\u00010H2\u0006\u0010 \u001a\u00020\u001aH\u0016J\u0016\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u001c2\u0006\u0010 \u001a\u00020\u001aH\u0016J\u0010\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020MH\u0016J\"\u0010N\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0.000\u001c2\u0006\u0010%\u001a\u00020\u001aH\u0016J\u0016\u0010P\u001a\b\u0012\u0004\u0012\u00020O0.2\u0006\u0010%\u001a\u00020\u001aH\u0016J\u001c\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d000\u001c2\u0006\u0010R\u001a\u00020\u0018H\u0016J$\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d000\u001c2\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010R\u001a\u00020\u0018H\u0016J\u001c\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U000\u001c2\u0006\u0010%\u001a\u00020\u001aH\u0016J\u0010\u0010V\u001a\u00020U2\u0006\u0010%\u001a\u00020\u001aH\u0016J\u0014\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020X000\u001cH\u0016J\b\u0010Y\u001a\u00020XH\u0016J$\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020[000\u001c2\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001aH\u0016J\u0010\u0010\\\u001a\u00020\u001a2\u0006\u0010]\u001a\u000205H\u0016J\u0014\u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020_000\u001cH\u0016J\u0014\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020a000\u001cH\u0016J-\u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H000\u001c2\b\u0010c\u001a\u0004\u0018\u00010\u001a2\b\u0010d\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010eJ!\u0010f\u001a\u00020H2\b\u0010c\u001a\u0004\u0018\u00010\u001a2\b\u0010d\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010gJ\u001e\u0010h\u001a\b\u0012\u0004\u0012\u00020i0.2\u000e\u0010j\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0.H\u0016J-\u0010k\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020U0mj\b\u0012\u0004\u0012\u00020U`n0l2\b\u0010C\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010oJ\b\u0010p\u001a\u00020MH\u0016J\b\u0010q\u001a\u00020MH\u0016J\b\u0010r\u001a\u00020\u001aH\u0016J\b\u0010s\u001a\u00020\u001aH\u0016J\u0010\u0010t\u001a\u0002052\u0006\u0010L\u001a\u00020MH\u0016J\u0010\u0010u\u001a\u00020\u00182\u0006\u0010L\u001a\u00020MH\u0016J\u0010\u0010v\u001a\u00020K2\u0006\u0010L\u001a\u00020MH\u0016J\b\u0010w\u001a\u00020KH\u0016J\u001a\u0010x\u001a\u00020K2\u0006\u0010y\u001a\u00020z2\b\u0010{\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010|\u001a\u00020K2\u0006\u0010y\u001a\u00020z2\b\u0010{\u001a\u0004\u0018\u00010\u001aH\u0016J+\u0010}\u001a\u00020K2\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010~\u001a\u00020\u00182\u0006\u0010\u007f\u001a\u00020\u00182\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u001aH\u0016Jw\u0010\u0081\u0001\u001a\u00020K2\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0083\u00012\u0006\u0010L\u001a\u00020M2\u0007\u0010\u0084\u0001\u001a\u00020\u001a2\b\u0010\u0085\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u0087\u0001\u001a\u00020\u001a2\t\u0010\u0088\u0001\u001a\u0004\u0018\u0001092\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00162\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00162\u0007\u0010\u008b\u0001\u001a\u00020\u00182\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u001a2\u0007\u0010\u008d\u0001\u001a\u00020\u0018H\u0016J5\u0010\u008e\u0001\u001a\u00020K2\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0083\u00012\u0006\u0010L\u001a\u00020M2\n\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0090\u00012\n\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u0001H\u0016J*\u0010\u0092\u0001\u001a\u00020K2\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0083\u00012\n\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0094\u00012\u0007\u0010\u0095\u0001\u001a\u00020\u001aH\u0016J\u001d\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00182\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0083\u0001H\u0016¢\u0006\u0003\u0010\u0097\u0001J\t\u0010\u0098\u0001\u001a\u00020KH\u0016J\u001d\u0010\u0099\u0001\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0083\u0001H\u0016J)\u0010\u009a\u0001\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0083\u00012\n\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009c\u0001H\u0016J\t\u0010\u009d\u0001\u001a\u00020\u0018H\u0016J\u0011\u0010\u009e\u0001\u001a\u00020>2\u0006\u0010{\u001a\u00020\u001aH\u0016J\u0013\u0010\u009f\u0001\u001a\u00020\u00182\b\u0010L\u001a\u0004\u0018\u00010>H\u0016JA\u0010 \u0001\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\b\u0010%\u001a\u0004\u0018\u00010\u001a2\u0007\u0010¡\u0001\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010\u001a2\u0011\u0010¢\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¤\u00010£\u0001H\u0016J0\u0010¥\u0001\u001a\u00020K2\u0007\u0010¦\u0001\u001a\u00020M2\b\u0010%\u001a\u0004\u0018\u00010\u001a2\u0007\u0010¡\u0001\u001a\u00020\u001a2\t\u0010§\u0001\u001a\u0004\u0018\u00010\u001aH\u0016J&\u0010¨\u0001\u001a\u00020K2\u0007\u0010©\u0001\u001a\u00020\u001a2\u0012\u0010ª\u0001\u001a\r\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010£\u0001H\u0016J2\u0010«\u0001\u001a\u00020K2\b\u0010¬\u0001\u001a\u00030\u00ad\u00012\b\u0010®\u0001\u001a\u00030¯\u00012\b\u0010 \u001a\u0004\u0018\u0001092\t\u0010°\u0001\u001a\u0004\u0018\u00010\u001aH\u0016J)\u0010±\u0001\u001a\u00020K2\b\u0010²\u0001\u001a\u00030³\u00012\b\u0010´\u0001\u001a\u00030µ\u00012\n\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0090\u0001H\u0016J#\u0010¶\u0001\u001a\u00020K2\u0006\u0010L\u001a\u00020>2\u0007\u0010·\u0001\u001a\u00020\u00182\u0007\u0010¸\u0001\u001a\u00020\u0018H\u0016J>\u0010¹\u0001\u001a\u00020K2\u0007\u0010º\u0001\u001a\u00020z2\u0006\u0010 \u001a\u00020\u001a2\u0007\u0010»\u0001\u001a\u00020\u00182\u0007\u0010¼\u0001\u001a\u00020\u00182\u0007\u0010½\u0001\u001a\u00020\u00182\u0007\u0010¾\u0001\u001a\u00020\u001aH\u0016J.\u0010¿\u0001\u001a\u00020M2\t\u0010À\u0001\u001a\u0004\u0018\u00010\u00122\u0007\u0010Á\u0001\u001a\u00020\u00182\t\u0010Â\u0001\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0003\u0010Ã\u0001J\t\u0010Ä\u0001\u001a\u00020\u0018H\u0016J\t\u0010Å\u0001\u001a\u00020KH\u0016J!\u0010Æ\u0001\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\u000e\u0010Ç\u0001\u001a\t\u0012\u0004\u0012\u00020K0È\u0001H\u0016J\u0014\u0010É\u0001\u001a\u0005\u0018\u00010Ê\u00012\u0006\u0010 \u001a\u00020\u001aH\u0016J\t\u0010Ë\u0001\u001a\u00020\u0018H\u0016J\u0013\u0010Ì\u0001\u001a\u00020\u001a2\b\u0010¬\u0001\u001a\u00030\u00ad\u0001H\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR#\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR#\u0010\u000e\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000f\u0010\b¨\u0006Í\u0001"}, m90084d2 = {"Lcom/kubi/margin/service/MarginService;", "Lcom/kubi/margin/api/IMarginService;", "<init>", "()V", "observableApi", "Lcom/kubi/margin/api/MarginApi;", "kotlin.jvm.PlatformType", "getObservableApi", "()Lcom/kubi/margin/api/MarginApi;", "observableApi$delegate", "Lkotlin/Lazy;", "syncApi", "getSyncApi", "syncApi$delegate", "flowApi", "getFlowApi", "flowApi$delegate", "getLeverType", "", "getMarginType", "getIsolatedMarginType", "fetchUserLeverage", "Ljava/math/BigDecimal;", "isIsolated", "", "code", "", "modifyUserLeverage", "Lio/reactivex/Observable;", "", "leverage", "getMarginMaxLever", "symbol", "getMarginRiskLever", "getMarginPositionLever", "getMarginMaxAutoLoanDebtRatio", "getIsolatedMaxBorrowAmount", FirebaseAnalytics.Param.CURRENCY, "getIsolatedBorrowEnable", "getIsolatedBorrowEnableOnSymbol", "getMarginRiskGrade", "getMarginConfigForBridge", "Lcom/kubi/margin/api/entity/MarginBridgeConfig;", "getIsolatedMarginConfigForBridge", "Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;", "getIsolatedMarginConfigListForBridge", "", "fetchEtfTicker", "Lcom/kubi/sdk/base/entity/BaseEntity;", "baseCurrency", "getTradeFeeData", "Lio/reactivex/disposables/Disposable;", "currentSymbol", "Lcom/kubi/data/entity/TradeItemBean;", "isRefresh", "getTakerFee", "currentSymbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "getMakerFee", "getFeeInfo", "Lcom/kubi/margin/api/entity/FeeEntity;", "getIndexPriceListFragment", "Landroidx/fragment/app/Fragment;", "getPnlPrecision", "(Ljava/lang/String;)Ljava/lang/Integer;", "fetchAllIsolatePositionList", "Lcom/kubi/margin/api/entity/IsolateMarginPosition;", "filterNotLoan", "(Ljava/lang/Boolean;)Lio/reactivex/Observable;", "getTransferableAmountDebtRatio", "getLiquidationDebtRatio", "getIsolatePositionBySymbol", "Lcom/kubi/margin/api/entity/MarginPosition;", "fetchIsolatePosition", "profitIllegalDialog", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "fetchIsoLatePositionTags", "Lcom/kubi/margin/api/entity/IsolateMarginPositionTag;", "fetchIsoLatePositionTagsBorrow", "setMarginAutoReturn", "isOpen", "setIsolateMarginAutoReturn", "singlePositionInfo", "Lcom/kubi/margin/api/entity/FundsInfo;", "singlePositionInfoSync", "leverPositionInfo", "Lcom/kubi/margin/api/entity/LeverBalance;", "leverPositionInfoSync", "getIsolatedTransfer", "Lcom/kubi/margin/api/entity/MarginTransfer;", "getMarginMaxLeverString", "item", "getTargetLend", "Lcom/kubi/margin/api/entity/MarginCouponConfig;", "fetchMarginBonus", "Lcom/kubi/margin/api/entity/MarginBonusConfig;", "getSingleMarginPositionByCode", "symbolCode", "withCache", "(Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/Observable;", "getSingleMarginPositionByCodeSync", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/margin/api/entity/MarginPosition;", "getMarginMarkPricesSync", "Lcom/kubi/margin/api/entity/MarkPrice;", "symbolList", "fetchCrossAssetsList", "Lkotlinx/coroutines/flow/Flow;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/Boolean;)Lkotlinx/coroutines/flow/Flow;", "getMarginTradeFragment", "getIsolatedMarginTradeFragment", "getCrossPageId", "getIsolatedPageId", "getTradeItemBean", "isBaseMarginFragment", "marginTradeFragmentScrollToTop", "toAgreeEtf", "toEtfApply", "requireContext", "Landroid/content/Context;", "coin", "toEftRedeem", "toMarginTradeTab", "isolated", "isBuy", "spmId", "joinMarginRiskView", "viewGroup", "Landroid/view/ViewGroup;", "status", "value", "", "riskGrade", "symbolInfo", "transferableAmountDebtRatio", "flDebtRatio", "isIsolateMargin", "quoteCurrency", "showDashBoardView", "joinLeverGiftView", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Action;", "dismissCallback", "checkShowLeverGiftView", "config", "Lcom/kubi/margin/api/entity/MarginWelfare;", "page", "isTypeBonus", "(Landroid/view/ViewGroup;)Ljava/lang/Boolean;", "clearGiftView", "showMarginTicketGuide", "fetchMarginWelfare", "ivBonus", "Landroid/view/View;", "isShowExperienceIcon", "getEtfInfoFragment", "isEtfInfo", "requestCouponsData", "positionType", "callBack", "Lio/reactivex/functions/Consumer;", "Lcom/kubi/margin/api/entity/CouponsOverview;", "showCouponsDialog", "assetBorrowFragment", "positionTag", "getTaxAdvice", "bizType", "consumer", "jumpToTradeHistoryOfOpenOrder", "type", "Lcom/kubi/margin/api/define/MarginType;", "tab", "Lcom/kubi/margin/api/define/MarginTradeHistoryType;", "spm", "showErrorAgreementDialog", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "throwable", "", "showSwitchMarginTradeDialog", "isSupportCross", "isSupportIsolate", "jump2MarginHorizontalKlinePage", "ctx", "showHistoryOrder", "showActivityOrder", "isFrom", "klineType", "getMarginToggleSymbolsFragment", "tradeType", "isMarket", "tradeItemBean", "(Ljava/lang/Integer;ZLcom/kubi/data/entity/TradeItemBean;)Lcom/kubi/sdk/BaseFragment;", "isSupportGuideTab", "jumpToLoanRateDescPage", "checkEuMarginRiskAgreement", "onPassed", "Lkotlin/Function0;", "fetchMarginCurrencyInfo", "Lcom/kubi/data/entity/MarginSymbolInfo;", "isSupportCrossOneClickLiquidation", "defaultSymbol", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginService.kt\ncom/kubi/margin/service/MarginService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,761:1\n1563#2:762\n1634#2,3:763\n808#2,11:766\n774#2:777\n865#2,2:778\n1869#2,2:780\n808#2,11:789\n1761#2,3:800\n808#2,11:803\n774#2:814\n865#2,2:815\n1869#2,2:817\n17#3,2:782\n17#3,2:786\n135#4,2:784\n32#4:788\n*S KotlinDebug\n*F\n+ 1 MarginService.kt\ncom/kubi/margin/service/MarginService\n*L\n205#1:762\n205#1:763,3\n521#1:766,11\n522#1:777\n522#1:778,2\n523#1:780,2\n545#1:789,11\n546#1:800,3\n554#1:803,11\n555#1:814\n555#1:815,2\n555#1:817,2\n536#1:782,2\n683#1:786,2\n624#1:784,2\n709#1:788\n*E\n"})
public final class C42593o implements IMarginService {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f94293b = LazyKt.lazy(new Function0() { // from class: mp.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C42593o.m93367b1();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f94294c = LazyKt.lazy(new Function0() { // from class: mp.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C42593o.m93369d1();
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f94295d = LazyKt.lazy(new Function0() { // from class: mp.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C42593o.m93365V0();
        }
    });

    /* JADX INFO: renamed from: mp.o$a */
    /* JADX INFO: compiled from: MarginService.kt */
    /* JADX INFO: loaded from: classes27.dex */
    @Metadata(m90083d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0011"}, m90084d2 = {"com/kubi/margin/service/MarginService$joinMarginRiskView$1$1", "Lcom/kubi/margin/view/MarginRiskView$IRiskData;", "fragment", "Lcom/kubi/sdk/BaseFragment;", "status", "", "value", "", "riskGrade", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "transferableAmountDebtRatio", "Ljava/math/BigDecimal;", "flDebtRatio", "isIsolateMargin", "", "quoteCurrency", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements MarginRiskView.InterfaceC18593a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseFragment f94296a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f94297b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ double f94298c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f94299d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ SymbolInfoEntity f94300e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ BigDecimal f94301f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ BigDecimal f94302g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ boolean f94303h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ String f94304i;

        public a(BaseFragment baseFragment, String str, double d11, String str2, SymbolInfoEntity symbolInfoEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z11, String str3) {
            this.f94296a = baseFragment;
            this.f94297b = str;
            this.f94298c = d11;
            this.f94299d = str2;
            this.f94300e = symbolInfoEntity;
            this.f94301f = bigDecimal;
            this.f94302g = bigDecimal2;
            this.f94303h = z11;
            this.f94304i = str3;
        }

        @Override // com.kubi.margin.view.MarginRiskView.InterfaceC18593a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getF94304i() {
            return this.f94304i;
        }

        @Override // com.kubi.margin.view.MarginRiskView.InterfaceC18593a
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getF94303h() {
            return this.f94303h;
        }

        @Override // com.kubi.margin.view.MarginRiskView.InterfaceC18593a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getF94299d() {
            return this.f94299d;
        }

        @Override // com.kubi.margin.view.MarginRiskView.InterfaceC18593a
        /* JADX INFO: renamed from: d, reason: from getter */
        public BigDecimal getF94302g() {
            return this.f94302g;
        }

        @Override // com.kubi.margin.view.MarginRiskView.InterfaceC18593a
        /* JADX INFO: renamed from: e, reason: from getter */
        public SymbolInfoEntity getF94300e() {
            return this.f94300e;
        }

        @Override // com.kubi.margin.view.MarginRiskView.InterfaceC18593a
        /* JADX INFO: renamed from: f, reason: from getter */
        public BigDecimal getF94301f() {
            return this.f94301f;
        }

        @Override // com.kubi.margin.view.MarginRiskView.InterfaceC18593a
        /* JADX INFO: renamed from: g, reason: from getter and merged with bridge method [inline-methods] */
        public BaseFragment mo40120H() {
            return this.f94296a;
        }

        @Override // com.kubi.margin.view.MarginRiskView.InterfaceC18593a
        /* JADX INFO: renamed from: status, reason: from getter */
        public String getF94297b() {
            return this.f94297b;
        }

        @Override // com.kubi.margin.view.MarginRiskView.InterfaceC18593a
        /* JADX INFO: renamed from: value, reason: from getter */
        public double getF94298c() {
            return this.f94298c;
        }
    }

    @Override // com.kubi.margin.api.IMarginService
    /* JADX INFO: renamed from: V */
    public int mo37922V() {
        return 3;
    }

    @Override // com.kubi.margin.api.IMarginService
    /* JADX INFO: renamed from: c0 */
    public int mo37932c0() {
        return 2;
    }

    @Override // com.kubi.margin.api.IMarginService
    /* JADX INFO: renamed from: f0 */
    public int mo37936f0() {
        return 1;
    }

    /* JADX INFO: renamed from: P0 */
    public static final MarginWelfare m93359P0(MarginCouponConfig coupon, MarginBonusConfig bonus) {
        Intrinsics.checkNotNullParameter(coupon, "coupon");
        Intrinsics.checkNotNullParameter(bonus, "bonus");
        return new MarginWelfare(coupon, bonus);
    }

    /* JADX INFO: renamed from: Q0 */
    public static final MarginWelfare m93360Q0(Function2 function2, Object p11, Object p12) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return (MarginWelfare) function2.invoke(p11, p12);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX INFO: renamed from: R0 */
    public static final Unit m93361R0(BaseFragment baseFragment, View view, C42593o c42593o, ViewGroup viewGroup, LeverGiftView leverGiftView, MarginWelfare marginWelfare) {
        if (C38279v0.f86024a.m86401a(marginWelfare.getBonus())) {
            List<Fragment> fragments = baseFragment.getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : fragments) {
                if (obj instanceof BaseMarginFragment) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        BaseMarginFragment baseMarginFragment = (BaseMarginFragment) it.next();
                        if (baseMarginFragment.isAdded() && baseMarginFragment.isShowing()) {
                            if (view != null) {
                                ViewExtKt.m66577h(view);
                            }
                        }
                    }
                }
            }
            if (view != null) {
                ViewExtKt.m66594y(view);
            }
        } else if (view != null) {
            ViewExtKt.m66577h(view);
        }
        c42593o.m93374M0(viewGroup, marginWelfare, "trade");
        C38236a.f85935a.m86318c(leverGiftView);
        List<Fragment> fragments2 = baseFragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments2, "getFragments(...)");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : fragments2) {
            if (obj2 instanceof BaseMarginFragment) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            BaseMarginFragment baseMarginFragment2 = (BaseMarginFragment) obj3;
            if (baseMarginFragment2.isAdded() && baseMarginFragment2.isShowing()) {
                arrayList3.add(obj3);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            ((BaseMarginFragment) it2.next()).mo39729R5();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a1 */
    public static final Unit m93366a1(AbstractC46554a abstractC46554a, InterfaceC46555b interfaceC46555b, SymbolInfoEntity symbolInfoEntity, C42593o c42593o, String str) {
        String strM93375N0;
        C37304a c37304a = C37304a.f82764a;
        long f104305a = abstractC46554a.getF104305a();
        String strMo102699b = interfaceC46555b.mo102699b();
        if (symbolInfoEntity == null || (strM93375N0 = symbolInfoEntity.getSymbol()) == null) {
            strM93375N0 = c42593o.m93375N0(interfaceC46555b);
        }
        InterfaceC37756h.a.m85146d(c37304a, strMo102699b, Long.valueOf(f104305a), strM93375N0, null, null, str, null, null, 216, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c1 */
    public static final Unit m93368c1(boolean z11, Fragment fragment, InterfaceC46555b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        boolean zAreEqual = Intrinsics.areEqual(it, InterfaceC46555b.b.f104310a);
        if (z11 == zAreEqual) {
            return Unit.INSTANCE;
        }
        InterfaceC46303d interfaceC46303d = fragment instanceof InterfaceC46303d ? (InterfaceC46303d) fragment : null;
        if (interfaceC46303d != null) {
            interfaceC46303d.mo63575u(zAreEqual);
        } else {
            ActivityResultCaller parentFragment = fragment.getParentFragment();
            InterfaceC46303d interfaceC46303d2 = parentFragment instanceof InterfaceC46303d ? (InterfaceC46303d) parentFragment : null;
            if (interfaceC46303d2 != null) {
                interfaceC46303d2.mo63575u(zAreEqual);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e1 */
    public static final Unit m93370e1(String str) {
        Router.f46192a.m56184f("etf/redeem").m4038a("coin", str).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f1 */
    public static final Unit m93371f1(String str) {
        Router.f46192a.m56184f("etf/apply").m4038a("coin", str).m4048k();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.margin.api.IMarginService
    @NotNull
    /* JADX INFO: renamed from: A */
    public List<IsolatedMarginBridgeConfig> mo37903A() {
        List<IsolateMarginPositionConfig> listM39868K0 = MarginConfigManager.f33681a.m39868K0();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM39868K0, 10));
        for (IsolateMarginPositionConfig isolateMarginPositionConfig : listM39868K0) {
            String symbol = isolateMarginPositionConfig.getSymbol();
            if (symbol == null) {
                symbol = "";
            }
            SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(symbol);
            arrayList.add(C42594p.m93384c(isolateMarginPositionConfig, symbolInfoEntityM85601B != null ? Boolean.valueOf(symbolInfoEntityM85601B.isTradeEnableShow()) : isolateMarginPositionConfig.getEnable()));
        }
        return arrayList;
    }

    @Override // com.kubi.margin.api.IMarginService
    @Nullable
    /* JADX INFO: renamed from: C */
    public MarginPosition mo37904C(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return MarginConfigManager.f33681a.m39874T0(symbol);
    }

    @Override // com.kubi.margin.api.IMarginService
    @NotNull
    /* JADX INFO: renamed from: D */
    public BigDecimal mo37905D(boolean z11, @NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return MarginConfigManager.f33681a.m39867J0(z11 ? 2 : 1, code);
    }

    @Override // com.kubi.margin.api.IMarginService
    @NotNull
    /* JADX INFO: renamed from: E */
    public MarginBridgeConfig mo37906E() {
        return C42594p.m93385d(MarginConfigManager.f33681a.m39877W0());
    }

    @Override // com.kubi.margin.api.IMarginService
    /* JADX INFO: renamed from: F */
    public boolean mo37907F(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        IsolateMarginPositionConfig isolateMarginPositionConfigM39872S0 = MarginConfigManager.f33681a.m39872S0(symbol);
        if (isolateMarginPositionConfigM39872S0 == null) {
            return false;
        }
        return C27025c.m66566d(isolateMarginPositionConfigM39872S0.getBaseBorrowEnable()) || C27025c.m66566d(isolateMarginPositionConfigM39872S0.getQuoteBorrowEnable());
    }

    @Override // com.kubi.margin.api.IMarginService
    @Nullable
    /* JADX INFO: renamed from: G */
    public Boolean mo37908G(@Nullable ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() != 1) {
            return null;
        }
        View childAt = viewGroup.getChildAt(0);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.kubi.margin.view.LeverGiftView");
        return Boolean.valueOf(Intrinsics.areEqual(((LeverGiftView) childAt).getF34251c(), "bonus"));
    }

    @Override // com.kubi.margin.api.IMarginService
    @NotNull
    /* JADX INFO: renamed from: H */
    public List<IsolateMarginPositionTag> mo37909H(@NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return InterfaceC46305f.m102066u(m93379Y0(), currency, null, 2, null);
    }

    @Override // com.kubi.margin.api.IMarginService
    @NotNull
    /* JADX INFO: renamed from: I */
    public Fragment mo37910I(@NotNull String coin) {
        Intrinsics.checkNotNullParameter(coin, "coin");
        return EtfInfoFragment.f33880X.newInstance(coin);
    }

    @Override // com.kubi.margin.api.IMarginService
    @NotNull
    /* JADX INFO: renamed from: J */
    public BigDecimal mo37911J(@NotNull SymbolInfoEntity currentSymbolInfo) {
        Intrinsics.checkNotNullParameter(currentSymbolInfo, "currentSymbolInfo");
        return MarginConfigManager.f33681a.m39875U0(currentSymbolInfo);
    }

    @Override // com.kubi.margin.api.IMarginService
    /* JADX INFO: renamed from: K */
    public void mo37912K(@NotNull String bizType, @Nullable Consumer<String> consumer) throws Exception {
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        MarginConfigManager.f33681a.m39887d1(bizType, consumer);
    }

    @Override // com.kubi.margin.api.IMarginService
    @NotNull
    /* JADX INFO: renamed from: L */
    public BaseFragment mo37913L() {
        return new MarginIsolateTradeFragment();
    }

    @Override // com.kubi.margin.api.IMarginService
    /* JADX INFO: renamed from: M */
    public void mo37914M(@Nullable ViewGroup viewGroup, @NotNull BaseFragment fragment, @Nullable Action action, @Nullable Action action2) {
        Context context;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (viewGroup == null || !fragment.isAdded() || fragment.getContext() == null || (context = fragment.getContext()) == null) {
            return;
        }
        LeverGiftView leverGiftView = new LeverGiftView(context);
        leverGiftView.setAction(action);
        leverGiftView.setDismissCallback(action2);
        ViewExtKt.m66577h(leverGiftView);
        viewGroup.removeAllViews();
        viewGroup.addView(leverGiftView);
    }

    /* JADX INFO: renamed from: M0 */
    public void m93374M0(@Nullable ViewGroup viewGroup, @Nullable MarginWelfare marginWelfare, @NotNull String page) {
        Intrinsics.checkNotNullParameter(page, "page");
        if (viewGroup == null || viewGroup.getChildCount() != 1) {
            return;
        }
        View childAt = viewGroup.getChildAt(0);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.kubi.margin.view.LeverGiftView");
        ((LeverGiftView) childAt).m40685d("bonus", marginWelfare, page);
    }

    @Override // com.kubi.margin.api.IMarginService
    /* JADX INFO: renamed from: N */
    public void mo37915N(@NotNull final BaseFragment fragment, @Nullable final ViewGroup viewGroup, @Nullable final View view) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (viewGroup == null || viewGroup.getChildCount() != 1) {
            return;
        }
        View childAt = viewGroup.getChildAt(0);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.kubi.margin.view.LeverGiftView");
        final LeverGiftView leverGiftView = (LeverGiftView) childAt;
        if (!C42579a.f94275a.m93347g().c()) {
            ViewExtKt.m66577h(leverGiftView);
            return;
        }
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46789b0.class, SiteInfoManager.f47913a.m58109c());
        ObservableSource observableSourceCompose = objM56186h != null ? ((InterfaceC46789b0) objM56186h).mo103118c() : false ? m93376O0().compose(C24217a1.m58389m()) : Observable.just(new MarginBonusConfig(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null));
        ObservableSource observableSourceCompose2 = m93380Z0().compose(C24217a1.m58389m());
        final Function2 function2 = new Function2() { // from class: mp.h
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C42593o.m93359P0((MarginCouponConfig) obj, (MarginBonusConfig) obj2);
            }
        };
        Observable observableZip = Observable.zip(observableSourceCompose2, observableSourceCompose, new BiFunction() { // from class: mp.i
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return C42593o.m93360Q0(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: mp.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C42593o.m93361R0(fragment, view, this, viewGroup, leverGiftView, (MarginWelfare) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: mp.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C42593o.m93362S0(function1, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: mp.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C42593o.m93363T0((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableZip.subscribe(consumer, new Consumer() { // from class: mp.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C42593o.m93364U0(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, fragment.getDestroyDisposable());
    }

    /* JADX INFO: renamed from: N0 */
    public final String m93375N0(InterfaceC46555b interfaceC46555b) {
        String strM102326h = C46392a.m102326h(new StorageId(ViewProps.MARGIN, "lastSymbol" + interfaceC46555b.mo102698a(), StorageType.LocalSite, true), "");
        return TextUtils.isEmpty(strM102326h) ? "BTC-USDT" : strM102326h;
    }

    @Override // com.kubi.margin.api.IMarginService
    /* JADX INFO: renamed from: O */
    public void mo37916O(@NotNull String symbol, boolean z11, boolean z12, @Nullable String str) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        MarginSymbolInfo marginSymbolInfoM39881Z0 = MarginConfigManager.f33681a.m39881Z0(symbol);
        if (!(marginSymbolInfoM39881Z0 != null ? Intrinsics.areEqual(marginSymbolInfoM39881Z0.getIsEnableMarginTrade(), Boolean.TRUE) : false)) {
            if (!(marginSymbolInfoM39881Z0 != null ? Intrinsics.areEqual(marginSymbolInfoM39881Z0.getIsIsolatedEnabled(), Boolean.TRUE) : false)) {
                symbol = "";
            }
        }
        String str2 = symbol;
        if (z11) {
            InterfaceC37754f.a.m85134f(C37304a.f82764a, str2, Boolean.valueOf(z12), str, null, null, 24, null);
        } else {
            InterfaceC37754f.a.m85136h(C37304a.f82764a, str2, Boolean.valueOf(z12), str, null, null, 24, null);
        }
    }

    @Override // com.kubi.margin.api.IMarginService
    /* JADX INFO: renamed from: P */
    public void mo37917P() {
        C42290a.f93780a.m92822a();
    }

    @Override // com.kubi.margin.api.IMarginService
    /* JADX INFO: renamed from: Q */
    public boolean mo37918Q() {
        return C24129b.m58030b(SiteVisibleConfigKey.MarginOneClickClose);
    }

    @Override // com.kubi.margin.api.IMarginService
    @Nullable
    /* JADX INFO: renamed from: S */
    public IsolatedMarginBridgeConfig mo37919S(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        IsolateMarginPositionConfig isolateMarginPositionConfigM39872S0 = MarginConfigManager.f33681a.m39872S0(symbol);
        if (isolateMarginPositionConfigM39872S0 == null) {
            return null;
        }
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(symbol);
        return C42594p.m93384c(isolateMarginPositionConfigM39872S0, symbolInfoEntityM85601B != null ? Boolean.valueOf(symbolInfoEntityM85601B.isTradeEnableShow()) : isolateMarginPositionConfigM39872S0.getEnable());
    }

    @Override // com.kubi.margin.api.IMarginService
    /* JADX INFO: renamed from: T */
    public void mo37920T() {
        InterfaceC37756h.a.m85147e(C37304a.f82764a, 1L, null, null, null, null, null, null, 126, null);
    }

    @Override // com.kubi.margin.api.IMarginService
    /* JADX INFO: renamed from: U */
    public boolean mo37921U() {
        C38279v0 c38279v0 = C38279v0.f86024a;
        return c38279v0.m86401a(c38279v0.m86402b());
    }

    @Override // com.kubi.margin.api.IMarginService
    @Nullable
    /* JADX INFO: renamed from: W */
    public String mo37923W() {
        return MarginConfigManager.f33681a.m39877W0().getRiskGrade();
    }

    /* JADX INFO: renamed from: W0 */
    public final InterfaceC46305f m93377W0() {
        return (InterfaceC46305f) this.f94295d.getValue();
    }

    @Override // com.kubi.margin.api.IMarginService
    @Nullable
    /* JADX INFO: renamed from: X */
    public Disposable mo37924X(@NotNull TradeItemBean currentSymbol, boolean z11) {
        Intrinsics.checkNotNullParameter(currentSymbol, "currentSymbol");
        return MarginConfigManager.f33681a.m39888j1(currentSymbol, z11);
    }

    /* JADX INFO: renamed from: X0 */
    public final InterfaceC46305f m93378X0() {
        return (InterfaceC46305f) this.f94293b.getValue();
    }

    @Override // com.kubi.margin.api.IMarginService
    @Nullable
    /* JADX INFO: renamed from: Y */
    public MarginSymbolInfo mo37925Y(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return MarginConfigManager.f33681a.m39881Z0(symbol);
    }

    /* JADX INFO: renamed from: Y0 */
    public final InterfaceC46305f m93379Y0() {
        return (InterfaceC46305f) this.f94294c.getValue();
    }

    @Override // com.kubi.margin.api.IMarginService
    @NotNull
    /* JADX INFO: renamed from: Z */
    public BaseFragment mo37926Z() {
        return new MarginTradeFragment();
    }

    @Override // com.kubi.margin.api.IMarginService
    /* JADX INFO: renamed from: a */
    public boolean mo37927a() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46789b0.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            return ((InterfaceC46789b0) objM56186h).mo103116a();
        }
        return false;
    }

    @Override // com.kubi.margin.api.IMarginService
    @NotNull
    /* JADX INFO: renamed from: a0 */
    public BigDecimal mo37928a0(@NotNull String symbol, @NotNull String currency) {
        List listSplit$default;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(currency, "currency");
        IsolateMarginPositionConfig isolateMarginPositionConfigM39872S0 = MarginConfigManager.f33681a.m39872S0(symbol);
        if (isolateMarginPositionConfigM39872S0 == null) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        String symbol2 = isolateMarginPositionConfigM39872S0.getSymbol();
        if (symbol2 != null && (listSplit$default = StringsKt.split$default((CharSequence) symbol2, new String[]{C33820nf.f71144W}, false, 0, 6, (Object) null)) != null && listSplit$default.size() == 2) {
            return Intrinsics.areEqual(StringsKt.split$default((CharSequence) isolateMarginPositionConfigM39872S0.getSymbol(), new String[]{C33820nf.f71144W}, false, 0, 6, (Object) null).get(0), currency) ? C41014a.m89922G(isolateMarginPositionConfigM39872S0.getBaseMaxBorrowAmount(), null, 1, null) : C41014a.m89922G(isolateMarginPositionConfigM39872S0.getQuoteMaxBorrowAmount(), null, 1, null);
        }
        BigDecimal ZERO2 = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
        return ZERO2;
    }

    @Override // com.kubi.margin.api.IMarginService
    @Nullable
    /* JADX INFO: renamed from: b0 */
    public BigDecimal mo37930b0(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (!z11) {
            return MarginConfigManager.f33681a.m39877W0().getRiskLeverage();
        }
        IsolateMarginPositionConfig isolateMarginPositionConfigM39872S0 = MarginConfigManager.f33681a.m39872S0(symbol);
        if (isolateMarginPositionConfigM39872S0 != null) {
            return isolateMarginPositionConfigM39872S0.getRiskLeverage();
        }
        return null;
    }

    @Override // com.kubi.margin.api.IMarginService
    @NotNull
    /* JADX INFO: renamed from: d */
    public Observable<BaseEntity<FundsInfo>> mo37933d(@NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return m93378X0().m102093d(currency);
    }

    @Override // com.kubi.margin.api.IMarginService
    @NotNull
    /* JADX INFO: renamed from: e */
    public FundsInfo mo37934e(@NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return m93379Y0().m102094e(currency);
    }

    @Override // com.kubi.margin.api.IMarginService
    @Nullable
    /* JADX INFO: renamed from: g0 */
    public BigDecimal mo37937g0(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (!z11) {
            return MarginConfigManager.f33681a.m39877W0().getMaxLeverage();
        }
        IsolateMarginPositionConfig isolateMarginPositionConfigM39872S0 = MarginConfigManager.f33681a.m39872S0(symbol);
        if (isolateMarginPositionConfigM39872S0 != null) {
            return isolateMarginPositionConfigM39872S0.getMaxLeverage();
        }
        return null;
    }

    @Override // com.kubi.margin.api.IMarginService
    /* JADX INFO: renamed from: h0 */
    public void mo37938h0(@NotNull BaseFragment fragment, @NotNull Function0<Unit> onPassed) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(onPassed, "onPassed");
        EuMarginRiskAgreementManager.f33022a.m38347j(fragment, onPassed);
    }

    @Override // com.kubi.margin.api.IMarginService
    @Nullable
    /* JADX INFO: renamed from: i0 */
    public Observable<IsolateMarginPosition> mo37940i0(@Nullable Boolean bool) {
        return MarginConfigManager.m39830l0(MarginConfigManager.f33681a, 0L, bool, 1, null);
    }

    @Override // com.kubi.margin.api.IMarginService
    @NotNull
    /* JADX INFO: renamed from: j0 */
    public BaseFragment mo37942j0(@Nullable Integer num, boolean z11, @Nullable TradeItemBean tradeItemBean) {
        return MarginSymbolsFragment.INSTANCE.newInstance(num != null ? num.intValue() : 1, z11, tradeItemBean);
    }

    @Override // com.kubi.margin.api.IMarginService
    @NotNull
    /* JADX INFO: renamed from: k */
    public Observable<BaseEntity<BigDecimal>> mo37943k(@NotNull String baseCurrency) {
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        return MarginConfigManager.f33681a.m39876V0().m102100k(baseCurrency);
    }

    @Override // com.kubi.margin.api.IMarginService
    @NotNull
    /* JADX INFO: renamed from: l */
    public List<MarkPrice> mo37944l(@NotNull List<String> symbolList) {
        Intrinsics.checkNotNullParameter(symbolList, "symbolList");
        return m93379Y0().m102101l(symbolList);
    }

    @Override // com.kubi.margin.api.IMarginService
    /* JADX INFO: renamed from: l0 */
    public void mo37945l0() {
        C38236a.f85935a.m86318c(null);
    }

    @Override // com.kubi.margin.api.IMarginService
    @NotNull
    /* JADX INFO: renamed from: m */
    public Observable<Object> mo37946m(boolean z11, @NotNull String leverage, @NotNull String code) {
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(code, "code");
        return MarginConfigManager.f33681a.m39894u1(z11 ? 2 : 1, leverage, code);
    }

    @Override // com.kubi.margin.api.IMarginService
    @Nullable
    /* JADX INFO: renamed from: m0 */
    public FeeEntity mo37947m0(@NotNull SymbolInfoEntity currentSymbolInfo) {
        Intrinsics.checkNotNullParameter(currentSymbolInfo, "currentSymbolInfo");
        return MarginConfigManager.f33681a.m39871R0(currentSymbolInfo);
    }

    @Override // com.kubi.margin.api.IMarginService
    /* JADX INFO: renamed from: n */
    public void mo37948n(@NotNull BaseFragment fragment, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (viewGroup == null || viewGroup.getChildCount() != 1) {
            return;
        }
        View childAt = viewGroup.getChildAt(0);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.kubi.margin.view.LeverGiftView");
        LeverGiftView leverGiftView = (LeverGiftView) childAt;
        List<Fragment> fragments = fragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof BaseMarginFragment) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            BaseMarginFragment baseMarginFragment = (BaseMarginFragment) obj2;
            if (baseMarginFragment.isAdded() && baseMarginFragment.isShowing()) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((BaseMarginFragment) it.next()).m39707A6(leverGiftView.getF34251c());
        }
    }

    @Override // com.kubi.margin.api.IMarginService
    @NotNull
    /* JADX INFO: renamed from: n0 */
    public String mo37949n0() {
        return "B4tradingCross";
    }

    @Override // com.kubi.margin.api.IMarginService
    @NotNull
    /* JADX INFO: renamed from: o */
    public String mo37950o() {
        return "B4tradingIsolated";
    }

    @Override // com.kubi.margin.api.IMarginService
    @NotNull
    /* JADX INFO: renamed from: o0 */
    public Observable<MarginPosition> mo37951o0(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return MarginConfigManager.m39840p0(MarginConfigManager.f33681a, symbol, false, 2, null);
    }

    @Override // com.kubi.margin.api.IMarginService
    /* JADX INFO: renamed from: p */
    public void mo37952p(@NotNull FragmentManager childFragmentManager, @NotNull Throwable throwable, @Nullable Action action) throws Exception {
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        C45612b.m100699e(throwable, childFragmentManager, action);
    }

    @Override // com.kubi.margin.api.IMarginService
    /* JADX INFO: renamed from: p0 */
    public void mo37953p0(@NotNull final InterfaceC46555b type, @NotNull final AbstractC46554a tab, @Nullable final SymbolInfoEntity symbolInfoEntity, @Nullable final String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(tab, "tab");
        IUserService.O(C42579a.f94275a.m93347g(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: mp.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C42593o.m93366a1(tab, type, symbolInfoEntity, this, str);
            }
        }), 1, (Object) null);
    }

    @Override // com.kubi.margin.api.IMarginService
    @NotNull
    /* JADX INFO: renamed from: q */
    public BigDecimal mo37954q(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return MarginConfigManager.f33681a.m39878X0(new TradeItemBean(symbol));
    }

    @Override // com.kubi.margin.api.IMarginService
    /* JADX INFO: renamed from: q0 */
    public void mo37955q0(@Nullable ViewGroup viewGroup, @NotNull BaseFragment fragment, @NotNull String status, double d11, @NotNull String riskGrade, @Nullable SymbolInfoEntity symbolInfoEntity, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, boolean z11, @Nullable String str, boolean z12) {
        Context context;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(riskGrade, "riskGrade");
        if (viewGroup == null || !fragment.isAdded() || fragment.getContext() == null || (context = fragment.getContext()) == null) {
            return;
        }
        MarginRiskView marginRiskView = new MarginRiskView(context);
        marginRiskView.m40708e(new a(fragment, status, d11, riskGrade, symbolInfoEntity, bigDecimal, bigDecimal2, z11, str), z12);
        viewGroup.removeAllViews();
        viewGroup.addView(marginRiskView);
    }

    @Override // com.kubi.margin.api.IMarginService
    @NotNull
    /* JADX INFO: renamed from: r */
    public BigDecimal mo37956r(@NotNull SymbolInfoEntity currentSymbolInfo) {
        Intrinsics.checkNotNullParameter(currentSymbolInfo, "currentSymbolInfo");
        return MarginConfigManager.f33681a.m39885c1(currentSymbolInfo);
    }

    @Override // com.kubi.margin.api.IMarginService
    /* JADX INFO: renamed from: r0 */
    public void mo37957r0(@NotNull BaseFragment assetBorrowFragment, @Nullable String str, @NotNull String positionType, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(assetBorrowFragment, "assetBorrowFragment");
        Intrinsics.checkNotNullParameter(positionType, "positionType");
        CouponsHelper.f33730a.m40027k(assetBorrowFragment, str, positionType, str2);
    }

    @Override // com.kubi.margin.api.IMarginService
    /* JADX INFO: renamed from: s */
    public void mo37958s(@NotNull Context requireContext, @Nullable final String str) {
        Intrinsics.checkNotNullParameter(requireContext, "requireContext");
        if (C42579a.f94275a.m93347g().d0().isAgreeEtf()) {
            Router.f46192a.m56184f("etf/apply").m4038a("coin", str).m4048k();
        } else {
            InterfaceC37756h.a.m85147e(C37304a.f82764a, 1L, null, null, null, null, IRedirect.INSTANCE.obtain(new Function0() { // from class: mp.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C42593o.m93371f1(str);
                }
            }), null, 94, null);
        }
    }

    @Override // com.kubi.margin.api.IMarginService
    /* JADX INFO: renamed from: s0 */
    public void mo37959s0(@NotNull Context requireContext, @Nullable final String str) {
        Intrinsics.checkNotNullParameter(requireContext, "requireContext");
        if (C42579a.f94275a.m93347g().d0().isAgreeEtf()) {
            Router.f46192a.m56184f("etf/redeem").m4038a("coin", str).m4048k();
        } else {
            InterfaceC37756h.a.m85147e(C37304a.f82764a, 1L, null, null, null, null, IRedirect.INSTANCE.obtain(new Function0() { // from class: mp.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C42593o.m93370e1(str);
                }
            }), null, 94, null);
        }
    }

    @Override // com.kubi.margin.api.IMarginService
    @NotNull
    /* JADX INFO: renamed from: t */
    public String mo37960t(@NotNull TradeItemBean item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return C42180b.m92640e(MarginConfigManager.f33681a.m39878X0(item), null, 4, false, false, false, 0, null, 125, null) + 'x';
    }

    @Override // com.kubi.margin.api.IMarginService
    /* JADX INFO: renamed from: t0 */
    public boolean mo37961t0(@Nullable Fragment fragment) {
        return fragment instanceof EtfInfoFragment;
    }

    @Override // com.kubi.margin.api.IMarginService
    @Nullable
    /* JADX INFO: renamed from: u */
    public BigDecimal mo37962u(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (!z11) {
            return MarginConfigManager.f33681a.m39877W0().getLiquidationDebtRatio();
        }
        IsolateMarginPositionConfig isolateMarginPositionConfigM39872S0 = MarginConfigManager.f33681a.m39872S0(symbol);
        if (isolateMarginPositionConfigM39872S0 != null) {
            return isolateMarginPositionConfigM39872S0.getFlDebtRatio();
        }
        return null;
    }

    @Override // com.kubi.margin.api.IMarginService
    @Nullable
    /* JADX INFO: renamed from: u0 */
    public BigDecimal mo37963u0(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (!z11) {
            return MarginConfigManager.f33681a.m39877W0().getTransferableAmountDebtRatio();
        }
        IsolateMarginPositionConfig isolateMarginPositionConfigM39872S0 = MarginConfigManager.f33681a.m39872S0(symbol);
        if (isolateMarginPositionConfigM39872S0 != null) {
            return isolateMarginPositionConfigM39872S0.getTransferOutMaxDebtRatio();
        }
        return null;
    }

    @Override // com.kubi.margin.api.IMarginService
    @NotNull
    /* JADX INFO: renamed from: v */
    public BigDecimal mo37964v(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return MarginConfigManager.f33681a.m39884c0(z11 ? 2 : 1, symbol);
    }

    @Override // com.kubi.margin.api.IMarginService
    @NotNull
    /* JADX INFO: renamed from: v0 */
    public TradeItemBean mo37965v0(@NotNull BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (fragment instanceof BaseMarginFragment) {
            return ((BaseMarginFragment) fragment).getF33649W();
        }
        if (!(fragment instanceof BaseTradeCoreFragment)) {
            return new TradeItemBean("BTC-USDT");
        }
        TradeItemBean tradeItemBeanM22735o = ((BaseTradeCoreFragment) fragment).m21244w3().m22735o();
        return tradeItemBeanM22735o == null ? new TradeItemBean("BTC-USDT") : tradeItemBeanM22735o;
    }

    @Override // com.kubi.margin.api.IMarginService
    /* JADX INFO: renamed from: w */
    public void mo37966w(@NotNull BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (fragment instanceof BaseMarginFragment) {
            BaseMarginFragment.m39685t6((BaseMarginFragment) fragment, 0, 1, null);
        }
    }

    @Override // com.kubi.margin.api.IMarginService
    /* JADX INFO: renamed from: w0 */
    public void mo37967w0(@NotNull Context ctx, @NotNull String symbol, boolean z11, boolean z12, boolean z13, @NotNull String klineType) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(klineType, "klineType");
        TradeItemBean tradeItemBean = new TradeItemBean(symbol);
        Intent intent = new Intent(ctx, (Class<?>) MarginFlutterKlineLandscapeActivity.class);
        intent.putExtra("data_1", false);
        intent.putExtra("data", tradeItemBean);
        intent.putExtra("tradeType", 1);
        intent.putExtra("isFrom", z13);
        C12803q.m24369a(intent, symbol, klineType);
        intent.putExtra("data_4", new KLineSettingConfig(z11, z12));
        intent.setFlags(268435456);
        ctx.startActivity(intent);
    }

    @Override // com.kubi.margin.api.IMarginService
    /* JADX INFO: renamed from: x */
    public void mo37968x(@NotNull BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        MarginConfigManager.f33681a.m39895v1(fragment);
    }

    @Override // com.kubi.margin.api.IMarginService
    /* JADX INFO: renamed from: x0 */
    public boolean mo37969x0(@NotNull String symbol, @NotNull String currency) {
        String symbol2;
        List listSplit$default;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(currency, "currency");
        IsolateMarginPositionConfig isolateMarginPositionConfigM39872S0 = MarginConfigManager.f33681a.m39872S0(symbol);
        if (isolateMarginPositionConfigM39872S0 == null || (symbol2 = isolateMarginPositionConfigM39872S0.getSymbol()) == null || (listSplit$default = StringsKt.split$default((CharSequence) symbol2, new String[]{C33820nf.f71144W}, false, 0, 6, (Object) null)) == null || listSplit$default.size() != 2) {
            return false;
        }
        return Intrinsics.areEqual(StringsKt.split$default((CharSequence) isolateMarginPositionConfigM39872S0.getSymbol(), new String[]{C33820nf.f71144W}, false, 0, 6, (Object) null).get(0), currency) ? C27025c.m66566d(isolateMarginPositionConfigM39872S0.getBaseBorrowEnable()) : C27025c.m66566d(isolateMarginPositionConfigM39872S0.getQuoteBorrowEnable());
    }

    @Override // com.kubi.margin.api.IMarginService
    /* JADX INFO: renamed from: y */
    public void mo37970y(@NotNull BaseFragment fragment, @Nullable String str, @NotNull String positionType, @Nullable String str2, @NotNull Consumer<CouponsOverview> callBack) throws Exception {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(positionType, "positionType");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        CouponsHelper.f33730a.m40025h(fragment, str, positionType, str2, callBack);
    }

    @Override // com.kubi.margin.api.IMarginService
    /* JADX INFO: renamed from: y0 */
    public boolean mo37971y0(@NotNull BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        return fragment instanceof BaseMarginFragment;
    }

    @Override // com.kubi.margin.api.IMarginService
    @Nullable
    /* JADX INFO: renamed from: z */
    public Integer mo37972z(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        IsolateMarginPositionConfig isolateMarginPositionConfigM39872S0 = MarginConfigManager.f33681a.m39872S0(symbol);
        if (isolateMarginPositionConfigM39872S0 != null) {
            return isolateMarginPositionConfigM39872S0.getPnlPrecision();
        }
        return null;
    }

    @Override // com.kubi.margin.api.IMarginService
    /* JADX INFO: renamed from: z0 */
    public void mo37973z0(@NotNull final Fragment fragment, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        final boolean zM102322d = C46392a.m102322d(ISpotService.f49646a.get().mo59987D(), false);
        new SwitchMarginTradeDialog().m40267i(zM102322d ? InterfaceC46555b.b.f104310a : InterfaceC46555b.a.f104307a, z11, z12, fragment, new Function1() { // from class: mp.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C42593o.m93368c1(zM102322d, fragment, (InterfaceC46555b) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S0 */
    public static final void m93362S0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T0 */
    public static final Unit m93363T0(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U0 */
    public static final void m93364U0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V0 */
    public static final InterfaceC46305f m93365V0() {
        return (InterfaceC46305f) C42597a.m93387c().create(InterfaceC46305f.class);
    }

    /* JADX INFO: renamed from: b1 */
    public static final InterfaceC46305f m93367b1() {
        return (InterfaceC46305f) C42597a.m93386b().create(InterfaceC46305f.class);
    }

    /* JADX INFO: renamed from: d1 */
    public static final InterfaceC46305f m93369d1() {
        return (InterfaceC46305f) C42597a.m93391g().create(InterfaceC46305f.class);
    }

    @NotNull
    /* JADX INFO: renamed from: O0 */
    public Observable<BaseEntity<MarginBonusConfig>> m93376O0() {
        return m93378X0().m102108t();
    }

    @NotNull
    /* JADX INFO: renamed from: Z0 */
    public Observable<BaseEntity<MarginCouponConfig>> m93380Z0() {
        return m93378X0().m102076L();
    }

    @Override // com.kubi.margin.api.IMarginService
    @NotNull
    /* JADX INFO: renamed from: b */
    public InterfaceC41634e<ArrayList<FundsInfo>> mo37929b(@Nullable Boolean bool) {
        return m93377W0().m102091b(bool);
    }

    @Override // com.kubi.margin.api.IMarginService
    @NotNull
    /* JADX INFO: renamed from: c */
    public MarginPosition mo37931c(@Nullable String str, @Nullable Boolean bool) {
        return m93379Y0().m102092c(str, bool);
    }

    @Override // com.kubi.margin.api.IMarginService
    @NotNull
    /* JADX INFO: renamed from: f */
    public Observable<BaseEntity<LeverBalance>> mo37935f() {
        return m93378X0().m102095f();
    }

    @Override // com.kubi.margin.api.IMarginService
    @NotNull
    /* JADX INFO: renamed from: i */
    public LeverBalance mo37939i() {
        return m93379Y0().m102098i();
    }

    @Override // com.kubi.margin.api.IMarginService
    @NotNull
    /* JADX INFO: renamed from: j */
    public Observable<BaseEntity<MarginPosition>> mo37941j(@Nullable String str, @Nullable Boolean bool) {
        return m93378X0().m102099j(str, bool);
    }
}
