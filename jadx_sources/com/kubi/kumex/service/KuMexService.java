package com.kubi.kumex.service;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.C5258a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.futures.FuturesRemote;
import com.kubi.futures.entry.IFuturesFragmentController;
import com.kubi.futures.entry.p080rn.FuturesRnMigrationHostFragment;
import com.kubi.futures.settings.FuturesConfirmationPreferencesBridge;
import com.kubi.futures.settings.FuturesLayoutPreferencesBridge;
import com.kubi.futures.settings.FuturesOrderPreferencesBridge;
import com.kubi.futures.share.PositionPnlShare;
import com.kubi.kumex.R$string;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.kumex.data.assets.model.ProfitRecordEntity;
import com.kubi.kumex.data.assets.model.ProfitShareEntity;
import com.kubi.kumex.data.market.model.QuotesEntity;
import com.kubi.kumex.data.platform.model.CoinEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.ContractNotice;
import com.kubi.kumex.data.platform.model.NoticeConfig;
import com.kubi.kumex.data.platform.model.PropertyEntity;
import com.kubi.kumex.data.platform.model.RobotSiteConfigEntity;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.entity.ContractEntityOpenData;
import com.kubi.kumex.entity.ContractOpenNotice;
import com.kubi.kumex.entity.PositionWrapperEntity;
import com.kubi.kumex.helper.BadgeHelper;
import com.kubi.kumex.helper.C16108t;
import com.kubi.kumex.helper.KuMEXUpgrade;
import com.kubi.kumex.helper.NoticeHelper;
import com.kubi.kumex.trade.FuturesFragment;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.mvi.common.MviExKt;
import com.kubi.otc.entity.OtcAd;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeKLineKlineContractConfig;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteType;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.C27099x;
import com.kubi.utils.FlowableCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import f00.C37304a;
import fm.C37567b;
import fm.C37570e;
import fm.C37571f;
import g00.InterfaceC37763o;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import ki.C41050b;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.rx2.RxConvertKt;
import o00.C42916f;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026ay.C4400a;
import p294gz.C38057a;
import p569qq.C43846g;
import p729wl.C45875l0;
import p765xl.InterfaceC46260a;
import p765xl.InterfaceC46261b;
import p801yl.C46527h0;
import p830zf.InterfaceC46810m;
import p836zl.C46894j;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import th.InterfaceC44980d;
import tm.C45042a;
import y70.C46392a;

/* JADX INFO: compiled from: KuMexService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\"\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016J\u001a\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016J \u0010\u001a\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001b2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010 \u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u001fH\u0016J\b\u0010$\u001a\u00020\u0014H\u0016J\b\u0010%\u001a\u00020\u0005H\u0016J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0014H\u0016J\b\u0010)\u001a\u00020\u0005H\u0016J\u0018\u0010*\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0014H\u0016J\u0010\u0010,\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u0005H\u0016J\b\u0010.\u001a\u00020'H\u0016J\n\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0018\u00101\u001a\u00020'2\u0006\u00102\u001a\u0002002\u0006\u00103\u001a\u00020\u0014H\u0016J\u0012\u00104\u001a\u00020'2\b\u00102\u001a\u0004\u0018\u000100H\u0016J\u0010\u00105\u001a\u00020'2\u0006\u00102\u001a\u000200H\u0016J\b\u00106\u001a\u00020'H\u0016J\u0010\u00107\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J0\u00108\u001a\u00020'2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00142\u0006\u0010:\u001a\u00020\u00142\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010<H\u0016J\u0018\u0010=\u001a\u00020'2\u0006\u0010\f\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u0014H\u0016J\u000e\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016J\u0010\u0010?\u001a\u00020@2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u000e\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\nH\u0016J\u0010\u0010C\u001a\u00020'2\u0006\u0010D\u001a\u000200H\u0016J\b\u0010E\u001a\u00020FH\u0016J\b\u0010G\u001a\u00020HH\u0016J>\u0010I\u001a\u00020'2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u00052\u0006\u0010M\u001a\u00020\u00052\u001c\u0010;\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010O\u0012\u0004\u0012\u00020'0NH\u0016J>\u0010P\u001a\u00020'2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u00052\u0006\u0010M\u001a\u00020\u00052\u001c\u0010;\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010O\u0012\u0004\u0012\u00020'0NH\u0016J\u001c\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020S0R2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0012\u0010T\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u001c\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020S0R2\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\u001a\u0010V\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020S0R0\nH\u0016J\u001c\u0010W\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010S0R0XH\u0016J\u0010\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020ZH\u0016J@\u0010\\\u001a\u00020'2\u0006\u0010J\u001a\u00020K2\u0006\u0010]\u001a\u00020\u00052\b\u0010^\u001a\u0004\u0018\u00010\u00052\u001c\u0010;\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010O\u0012\u0004\u0012\u00020'0NH\u0016JJ\u0010_\u001a\u00020'2\u0006\u0010J\u001a\u00020K2\u0006\u0010`\u001a\u00020\u00052\b\u0010]\u001a\u0004\u0018\u00010\u00052\b\u0010a\u001a\u0004\u0018\u00010\u00052\u001c\u0010;\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010O\u0012\u0004\u0012\u00020'0NH\u0016J,\u0010b\u001a\u00020'2\u0006\u0010J\u001a\u00020K2\b\u0010`\u001a\u0004\u0018\u00010\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010c\u001a\u00020dH\u0016J\b\u0010e\u001a\u00020\u0005H\u0016JT\u0010f\u001a\u00020'2\u0006\u0010J\u001a\u00020K2\b\u0010g\u001a\u0004\u0018\u00010h2\u0006\u0010i\u001a\u00020\u00052\u0006\u0010j\u001a\u00020\u00052(\u0010;\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020S\u0018\u00010R\u0012\u0006\u0012\u0004\u0018\u00010O\u0012\u0004\u0012\u00020'0NH\u0016J^\u0010k\u001a\u00020'2\u0006\u0010J\u001a\u00020K2\b\u0010g\u001a\u0004\u0018\u00010h2\u0006\u0010i\u001a\u00020\u00052\u0006\u0010l\u001a\u00020\u00052\u0014\u0010m\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020S\u0018\u00010R2\u001c\u0010;\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010O\u0012\u0004\u0012\u00020'0NH\u0016JV\u0010n\u001a\u00020'2\u0006\u0010J\u001a\u00020K2\b\u0010o\u001a\u0004\u0018\u00010h2\u0006\u0010i\u001a\u00020\u00052\u0014\u0010m\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020S\u0018\u00010R2\u001c\u0010;\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010O\u0012\u0004\u0012\u00020'0NH\u0016J\u0012\u0010p\u001a\u0004\u0018\u00010q2\u0006\u0010J\u001a\u00020KH\u0002J\u0012\u0010r\u001a\u0004\u0018\u0001002\u0006\u0010J\u001a\u00020KH\u0002J\u0012\u0010s\u001a\u0004\u0018\u00010q2\u0006\u0010t\u001a\u00020uH\u0002J\u0012\u0010v\u001a\u0004\u0018\u0001002\u0006\u0010t\u001a\u00020uH\u0002J\u001c\u0010w\u001a\u0004\u0018\u00010x*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020S\u0018\u00010RH\u0002J\u001c\u0010y\u001a\u0004\u0018\u00010z*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020S\u0018\u00010RH\u0002J$\u0010{\u001a\u0004\u0018\u00010\u0005*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020S\u0018\u00010R2\u0006\u0010|\u001a\u00020\u0005H\u0002J)\u0010}\u001a\u0004\u0018\u00010~*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020S\u0018\u00010R2\u0006\u0010|\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010\u007fJ+\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u001f*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020S\u0018\u00010R2\u0006\u0010|\u001a\u00020\u0005H\u0002¢\u0006\u0003\u0010\u0081\u0001J+\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0014*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020S\u0018\u00010R2\u0006\u0010|\u001a\u00020\u0005H\u0002¢\u0006\u0003\u0010\u0083\u0001J&\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0085\u0001*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020S\u0018\u00010R2\u0006\u0010|\u001a\u00020\u0005H\u0002J\u000f\u0010\u0086\u0001\u001a\u00020\u0014*\u0004\u0018\u00010\u0005H\u0002J\u0011\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0005H\u0002J\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0005H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0089\u0001"}, m90084d2 = {"Lcom/kubi/kumex/service/KuMexService;", "Lcom/kubi/kumex/api/IKuMexService;", "<init>", "()V", "getKuMexPageId", "", "job", "Lkotlinx/coroutines/Job;", "fetchQuotesListBySymbolsForDistribution", "Lio/reactivex/Observable;", "", "Lcom/kubi/kumex/data/market/model/QuotesEntity;", "symbols", "getContractSymbol", "baseCurrency", "quoteCurrency", "formatSymbolWithTag", "Lcom/kubi/utils/StyledText;", "symbol", "withTag", "", "getFutureTag", "formatSymbolWithoutPerp", "getFuturesCoinAvatar", FirebaseAnalytics.Param.CURRENCY, "getContractSymbolList", "getContractCurrencyInfo", "Lkotlin/Pair;", "getFuturesGridService", "Lcom/kubi/kumex/api/IFuturesGridService;", "getLongPrecision", "", "checkUpgrade", "supportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "getMaxLeverage", "getRewardConfig", "getContractWelfare", "synchronized", "", "force", "getMarketsPageId", "hasContract", "wait", "futuresRobotVisible", "type", "fetchSystemConfig", "getFuturesFragment", "Lcom/kubi/sdk/BaseFragment;", "handleKlineInMaintenance", "futuresFragment", TIMPushProvider.f75062n, "releaseOptionEngine", "refreshFuturesFragment", "loadNoticeConfig", "isFavor", "changeFavourite", "favourite", "isNetwork", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function0;", "changeCacheFavorite", "getFutureFavorList", "getContractEntityMapBean", "Lcom/kubi/kumex/entity/ContractEntityOpenData;", "getContractList", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "checkQuotesNotice", "baseFragment", "getContractNotice", "Lcom/kubi/kumex/entity/ContractOpenNotice;", "getAssetsService", "Lcom/kubi/kumex/api/IFuturesAssetsService;", "requestFutureMarketClosePosition", "ctx", "Landroid/content/Context;", "subUid", "positionJson", "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "requestFuturePositionTpSl", "getFuturesConfig", "", "", "getKlineContractConfigJson", "getFuturesCoinConfig", "getFuturesCoinConfigList", "map2UnifyContractConfig", "Lkotlinx/coroutines/flow/Flow;", "futuresContainerRouterIntercept", "Lcom/kubi/router/model/Postcard;", "originPostcard", "modifyFuturesOrder", "orderInfo", "targetPrice", "cancelFuturesOrder", "orderId", "tpslOrderInfo", "jumpFuturesDelegationDetail", "orderEntity", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "getContractTradeUnit", "getFeaturesConfig", "obj", "Ljava/lang/Object;", "source", "tabType", "handleMenuAction", TUIConstants.TUIChat.INPUT_MORE_ACTION_ID, ReportDataTable.COLUMN_PARAMS, "shareFuturesPositionPnl", "objects", "findCurrentFuturesFragment", "Lcom/kubi/kumex/trade/FuturesFragment;", "findCurrentVisibleBaseFragment", "findFuturesFragmentInHierarchy", "fragment", "Landroidx/fragment/app/Fragment;", "findVisibleBaseFragmentInHierarchy", "toProfitRecordEntity", "Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;", "toProfitShareEntity", "Lcom/kubi/kumex/data/assets/model/ProfitShareEntity;", TypedValues.Custom.S_STRING, "key", "long", "", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;", "int", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;", TypedValues.Custom.S_BOOLEAN, "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;", "decimal", "Ljava/math/BigDecimal;", "hasLongShortDirection", "toPositionSide", "toCloseType", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKuMexService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuMexService.kt\ncom/kubi/kumex/service/KuMexService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CoinEntityEx.kt\ncom/kubi/kumex/extensions/CoinEntityExKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 KVStore.kt\ncom/kubi/utils/storage/KVStore\n+ 6 NoticeConfig.kt\ncom/kubi/kumex/data/platform/model/NoticeConfig\n+ 7 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 8 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 11 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 12 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 13 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 14 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 15 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 16 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,1241:1\n774#2:1242\n865#2,2:1243\n1563#2:1245\n1634#2,3:1246\n774#2:1259\n865#2:1260\n866#2:1262\n1563#2:1264\n1634#2,2:1265\n1636#2:1269\n1617#2,9:1279\n1869#2:1288\n1870#2:1295\n1626#2:1296\n24#3:1249\n16#3:1250\n153#4,2:1251\n153#4,2:1254\n153#4,2:1311\n153#4,2:1325\n178#5:1253\n178#5:1256\n178#5:1313\n178#5:1327\n29#6:1257\n21#6:1258\n22#6:1261\n23#6:1263\n24#6:1267\n30#6:1270\n149#7:1268\n149#7:1274\n149#7:1278\n149#7:1292\n149#7:1302\n160#7,4:1303\n160#7,4:1307\n35#8,3:1271\n35#8,3:1275\n35#8,3:1289\n1#9:1293\n1#9:1294\n49#10:1297\n51#10:1301\n46#11:1298\n51#11:1300\n105#12:1299\n17#13,2:1314\n19#14,2:1316\n19#14,2:1328\n19#14,2:1330\n19#14,2:1332\n35#15,4:1318\n39#15:1324\n44#16,2:1322\n*S KotlinDebug\n*F\n+ 1 KuMexService.kt\ncom/kubi/kumex/service/KuMexService\n*L\n233#1:1242\n233#1:1243,2\n235#1:1245\n235#1:1246,3\n462#1:1259\n462#1:1260\n462#1:1262\n462#1:1264\n462#1:1265,2\n462#1:1269\n609#1:1279,9\n609#1:1288\n609#1:1295\n609#1:1296\n301#1:1249\n301#1:1250\n334#1:1251,2\n338#1:1254,2\n772#1:1311,2\n889#1:1325,2\n334#1:1253\n338#1:1256\n772#1:1313\n889#1:1327\n462#1:1257\n462#1:1258\n462#1:1261\n462#1:1263\n462#1:1267\n462#1:1270\n462#1:1268\n567#1:1274\n601#1:1278\n610#1:1292\n662#1:1302\n695#1:1303,4\n696#1:1307,4\n568#1:1271,3\n602#1:1275,3\n610#1:1289,3\n609#1:1294\n615#1:1297\n615#1:1301\n615#1:1298\n615#1:1300\n615#1:1299\n775#1:1314,2\n852#1:1316,2\n978#1:1328,2\n1015#1:1330,2\n1044#1:1332,2\n865#1:1318,4\n865#1:1324\n865#1:1322,2\n*E\n"})
public final class KuMexService implements IKuMexService {

    /* JADX INFO: renamed from: com.kubi.kumex.service.KuMexService$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C16783a extends TypeToken<OrderEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.kumex.service.KuMexService$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C16784b extends TypeToken<OrderEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.kumex.service.KuMexService$c */
    /* JADX INFO: compiled from: KuMexService.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/kumex/service/KuMexService$getAssetsService$1", "Lcom/kubi/kumex/api/IFuturesAssetsService;", "observePositionList", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/kubi/kumex/entity/PositionWrapperEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nKuMexService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuMexService.kt\ncom/kubi/kumex/service/KuMexService$getAssetsService$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1241:1\n1021#2,2:1242\n*S KotlinDebug\n*F\n+ 1 KuMexService.kt\ncom/kubi/kumex/service/KuMexService$getAssetsService$1\n*L\n486#1:1242,2\n*E\n"})
    public static final class C16785c implements InterfaceC46260a {

        /* JADX INFO: renamed from: com.kubi.kumex.service.KuMexService$c$a */
        /* JADX INFO: compiled from: Comparisons.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 KuMexService.kt\ncom/kubi/kumex/service/KuMexService$getAssetsService$1\n*L\n1#1,328:1\n486#2:329\n*E\n"})
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return ComparisonsKt.compareValues(Long.valueOf(C27039d.m66652l(((PositionWrapperEntity) t12).getCreateTime())), Long.valueOf(C27039d.m66652l(((PositionWrapperEntity) t11).getCreateTime())));
            }
        }

        /* JADX INFO: renamed from: h */
        public static final List m35891h(List it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C16816v.m35908b(it, false);
        }

        /* JADX INFO: renamed from: i */
        public static final List m35892i(Function1 function1, Object p11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return (List) function1.invoke(p11);
        }

        /* JADX INFO: renamed from: j */
        public static final List m35893j(List it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C16816v.m35908b(it, true);
        }

        /* JADX INFO: renamed from: k */
        public static final List m35894k(Function1 function1, Object p11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return (List) function1.invoke(p11);
        }

        /* JADX INFO: renamed from: l */
        public static final ArrayList m35895l(List positions, List trialPositions) {
            Intrinsics.checkNotNullParameter(positions, "positions");
            Intrinsics.checkNotNullParameter(trialPositions, "trialPositions");
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(positions);
            arrayList.addAll(trialPositions);
            if (arrayList.size() > 1) {
                CollectionsKt.sortWith(arrayList, new a());
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: m */
        public static final ArrayList m35896m(Function2 function2, Object p11, Object p12) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return (ArrayList) function2.invoke(p11, p12);
        }

        @Override // p765xl.InterfaceC46260a
        /* JADX INFO: renamed from: a */
        public InterfaceC41634e<List<PositionWrapperEntity>> mo35844a() {
            MultiBizFacadeManager multiBizFacadeManager = MultiBizFacadeManager.f19232a;
            Observable observableM20246B = MultiBizFacadeManager.m20246B(multiBizFacadeManager, false, null, 2, null);
            final Function1 function1 = new Function1() { // from class: com.kubi.kumex.service.n
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KuMexService.C16785c.m35891h((List) obj);
                }
            };
            Observable map = observableM20246B.map(new Function() { // from class: com.kubi.kumex.service.o
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return KuMexService.C16785c.m35892i(function1, obj);
                }
            });
            Observable observableM20246B2 = MultiBizFacadeManager.m20246B(multiBizFacadeManager, true, null, 2, null);
            final Function1 function2 = new Function1() { // from class: com.kubi.kumex.service.p
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KuMexService.C16785c.m35893j((List) obj);
                }
            };
            Observable map2 = observableM20246B2.map(new Function() { // from class: com.kubi.kumex.service.q
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return KuMexService.C16785c.m35894k(function2, obj);
                }
            });
            final Function2 function3 = new Function2() { // from class: com.kubi.kumex.service.r
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return KuMexService.C16785c.m35895l((List) obj, (List) obj2);
                }
            };
            Observable observableCombineLatest = Observable.combineLatest(map, map2, new BiFunction() { // from class: com.kubi.kumex.service.s
                @Override // io.reactivex.functions.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return KuMexService.C16785c.m35896m(function3, obj, obj2);
                }
            });
            Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "combineLatest(...)");
            return RxConvertKt.m91205b(observableCombineLatest);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.service.KuMexService$d */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0004"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/kumex/data/platform/model/NoticeConfig$body$lambda$1$$inlined$fromJson$1", "com/kubi/kumex/data/platform/model/NoticeConfig$first$$inlined$body$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C16786d extends TypeToken<ContractNotice> {
    }

    /* JADX INFO: renamed from: com.kubi.kumex.service.KuMexService$e */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C16787e extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.kumex.service.KuMexService$f */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C16788f extends TypeToken<HashMap<String, Object>> {
    }

    /* JADX INFO: renamed from: com.kubi.kumex.service.KuMexService$g */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C16789g extends TypeToken<HashMap<String, Object>> {
    }

    /* JADX INFO: renamed from: com.kubi.kumex.service.KuMexService$h */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C16790h extends TypeToken<HashMap<String, Object>> {
    }

    /* JADX INFO: renamed from: com.kubi.kumex.service.KuMexService$i */
    /* JADX INFO: compiled from: KuMexService.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90083d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, m90084d2 = {"com/kubi/kumex/service/KuMexService$getFuturesGridService$1", "Lcom/kubi/kumex/api/IFuturesGridService;", "getContractDrawerFragment", "Lcom/kubi/sdk/BaseFragment;", "observeCheckSymbol", "Lio/reactivex/Flowable;", "", "updateCheckSymbol", "", "symbol", "getFuturesGridContractFirst", "getSymbolPricePrecision", "", "symbolCode", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16791i implements InterfaceC46261b {
        @Override // p765xl.InterfaceC46261b
        /* JADX INFO: renamed from: a */
        public int mo35845a(String symbolCode) {
            Intrinsics.checkNotNullParameter(symbolCode, "symbolCode");
            ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), symbolCode, false, 2, null);
            if (contractEntityM99529O != null) {
                return C37567b.m84618h(contractEntityM99529O);
            }
            return 4;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.service.KuMexService$j */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C16792j extends TypeToken<OrderEntity> {
    }

    /* JADX INFO: renamed from: z0 */
    public static final void m35870z0(Map map) {
        Object obj = map != null ? map.get("fromType") : null;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            str = SearchCategory$Companion.FUTURES;
        }
        InterfaceC37763o.a.m85179a(C37304a.f82764a, str, null, null, null, 14, null);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: A */
    public List<Map<String, Object>> mo33252A() {
        Object objM103844constructorimpl;
        String strM66919i;
        try {
            Result.Companion companion = Result.INSTANCE;
            List<CoinEntity> listMo25004d = RepositoryServiceLocator.f19236a.m20288g().mo25004d();
            ArrayList arrayList = new ArrayList();
            for (CoinEntity coinEntity : listMo25004d) {
                if (coinEntity == null || (strM66919i = C27099x.m66919i(coinEntity, false, 2, null)) == null) {
                    strM66919i = "";
                }
                C27099x c27099x = C27099x.f54458a;
                Object objM66914d = C27099x.m66914d(strM66919i, new C16789g().getType());
                if (((HashMap) objM66914d).isEmpty()) {
                    objM66914d = null;
                }
                HashMap map = (HashMap) objM66914d;
                if (map != null) {
                    arrayList.add(map);
                }
            }
            objM103844constructorimpl = Result.m103844constructorimpl(arrayList);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        List<Map<String, Object>> list = (List) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: renamed from: B0 */
    public final boolean m35871B0(String str) {
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (upperCase != null) {
                return StringsKt.contains$default((CharSequence) upperCase, (CharSequence) SharedPositionInfo.SIDE_LONG, false, 2, (Object) null) || StringsKt.contains$default((CharSequence) upperCase, (CharSequence) SharedPositionInfo.SIDE_SHORT, false, 2, (Object) null);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: D0 */
    public final Long m35873D0(Map<String, ? extends Object> map, String str) {
        if (map == null) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            return null;
        }
        String str2 = (String) obj;
        Long longOrNull = StringsKt.toLongOrNull(str2);
        if (longOrNull != null) {
            return longOrNull;
        }
        Double doubleOrNull = StringsKt.toDoubleOrNull(str2);
        if (doubleOrNull != null) {
            return Long.valueOf((long) doubleOrNull.doubleValue());
        }
        return null;
    }

    /* JADX INFO: renamed from: F0 */
    public final String m35874F0(Map<String, ? extends Object> map, String str) {
        Object obj;
        if (map == null || (obj = map.get(str)) == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Number) || (obj instanceof Boolean)) {
            return obj.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: G0 */
    public final String m35875G0(String str) {
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (upperCase != null) {
                if (StringsKt.contains$default((CharSequence) upperCase, (CharSequence) SharedPositionInfo.SIDE_LONG, false, 2, (Object) null) || Intrinsics.areEqual(upperCase, "BUY")) {
                    return "CLOSE_LONG";
                }
                if (StringsKt.contains$default((CharSequence) upperCase, (CharSequence) SharedPositionInfo.SIDE_SHORT, false, 2, (Object) null) || Intrinsics.areEqual(upperCase, "SELL")) {
                    return "CLOSE_SHORT";
                }
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: H0 */
    public final String m35876H0(String str) {
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (upperCase != null) {
                String str2 = SharedPositionInfo.SIDE_LONG;
                if (!StringsKt.contains$default((CharSequence) upperCase, (CharSequence) SharedPositionInfo.SIDE_LONG, false, 2, (Object) null) && !Intrinsics.areEqual(upperCase, "BUY")) {
                    str2 = SharedPositionInfo.SIDE_SHORT;
                    if (!StringsKt.contains$default((CharSequence) upperCase, (CharSequence) SharedPositionInfo.SIDE_SHORT, false, 2, (Object) null) && !Intrinsics.areEqual(upperCase, "SELL")) {
                        return null;
                    }
                }
                return str2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: J0 */
    public final ProfitShareEntity m35878J0(Map<String, ? extends Object> map) {
        if (map == null) {
            return null;
        }
        BigDecimal bigDecimalM35880o0 = m35880o0(map, "openPrice");
        BigDecimal bigDecimalM35880o1 = m35880o0(map, "closePrice");
        BigDecimal bigDecimalM35880o2 = m35880o0(map, "profitRate");
        if (bigDecimalM35880o2 == null) {
            bigDecimalM35880o2 = m35880o0(map, "roe");
        }
        if (bigDecimalM35880o0 == null && bigDecimalM35880o1 == null && bigDecimalM35880o2 == null) {
            return null;
        }
        return new ProfitShareEntity(bigDecimalM35880o0, bigDecimalM35880o1, bigDecimalM35880o2);
    }

    /* JADX WARN: Code duplicated, block: B:91:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:94:0x02f5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v111, types: [T, com.kubi.kumex.trade.FuturesFragment] */
    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: f */
    public void mo33278f(@NotNull final Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String tabType, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) throws InterruptedException {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        Object objM103844constructorimpl3;
        boolean z11;
        String strM36173d6;
        String strM36166X5;
        String symbol;
        Object objM20457a;
        Map<String, Object> mapMapOf;
        Boolean boolIsSupportFutures;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(tabType, "tabType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (Intrinsics.areEqual(tabType, "settingsAccountCapabilities")) {
            IUnifyAccountService iUnifyAccountService = IUnifyAccountService.f53155a.get();
            callback.invoke(MapsKt.mapOf(TuplesKt.m90091to("contractVersion", 2), TuplesKt.m90091to("status", "ready"), TuplesKt.m90091to("isHitGray", Boolean.valueOf(iUnifyAccountService.mo65008x())), TuplesKt.m90091to("hasOpened", Boolean.valueOf(iUnifyAccountService.mo64991e()))), null);
            return;
        }
        if (Intrinsics.areEqual(tabType, "settingsHostCapabilities")) {
            RobotSiteConfigEntity robotSiteConfigEntity = (RobotSiteConfigEntity) C46392a.f104043a.m102336j(C46894j.f104736a.m103252Q(), RobotSiteConfigEntity.class, null);
            long jM66652l = C27039d.m66652l(RepositoryServiceLocator.f19236a.m20292k().mo100574u().getLatestRewardTime());
            Object objM56186h = Router.f46192a.m56186h(InterfaceC46810m.class, SiteInfoManager.f47913a.m58109c());
            boolean zM103140a = objM56186h != null ? ((InterfaceC46810m) objM56186h).m103140a() : true;
            Pair pairM90091to = TuplesKt.m90091to("contractVersion", 2);
            Pair pairM90091to2 = TuplesKt.m90091to("futuresTradingAvailable", m35868x0(!KuMEXUpgrade.m34085e(KuMEXUpgrade.f29306a, null, 1, null)));
            if (robotSiteConfigEntity == null || (boolIsSupportFutures = robotSiteConfigEntity.isSupportFutures()) == null || (mapMapOf = m35868x0(boolIsSupportFutures.booleanValue())) == null) {
                mapMapOf = MapsKt.mapOf(TuplesKt.m90091to("status", "loading"));
            }
            Pair pairM90091to3 = TuplesKt.m90091to("robotFutures", mapMapOf);
            BadgeHelper badgeHelper = BadgeHelper.f29249a;
            Pair pairM90091to4 = TuplesKt.m90091to("pnlAnalyzeBase", m35868x0(badgeHelper.m33971r()));
            Pair pairM90091to5 = TuplesKt.m90091to("welfareRedDot", m35868x0(badgeHelper.m33972s(jM66652l)));
            Pair pairM90091to6 = TuplesKt.m90091to("hostVariant", MapsKt.mapOf(TuplesKt.m90091to("status", "ready"), TuplesKt.m90091to("value", zM103140a ? "default" : SiteType.THAILAND_NAME)));
            Pair pairM90091to7 = TuplesKt.m90091to("tutorialSupported", m35868x0(zM103140a));
            Pair pairM90091to8 = TuplesKt.m90091to("status", "ready");
            C45875l0 c45875l0 = C45875l0.f103336a;
            callback.invoke(MapsKt.mapOf(pairM90091to, pairM90091to2, pairM90091to3, pairM90091to4, pairM90091to5, pairM90091to6, pairM90091to7, TuplesKt.m90091to("navigationHosts", MapsKt.mapOf(pairM90091to8, TuplesKt.m90091to("value", MapsKt.mapOf(TuplesKt.m90091to("calculatorUrl", c45875l0.m101337e0()), TuplesKt.m90091to("robotUrl", c45875l0.m101332A0()), TuplesKt.m90091to("fundsUrl", c45875l0.m101347o0())))))), null);
            return;
        }
        if (Intrinsics.areEqual(tabType, "layoutPreferences")) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(FuturesLayoutPreferencesBridge.f23398a.m26349f());
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
                callback.invoke((Map) objM103844constructorimpl, null);
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                String message = thM103847exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "Read layout preferences failed";
                }
                callback.invoke(null, new ProtocolException(message, null, null, false, 14, null));
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(tabType, "confirmationPreferences")) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                objM103844constructorimpl2 = Result.m103844constructorimpl(FuturesConfirmationPreferencesBridge.f23389a.m26342h());
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.INSTANCE;
                objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th3));
            }
            if (Result.m103851isSuccessimpl(objM103844constructorimpl2)) {
                callback.invoke((Map) objM103844constructorimpl2, null);
            }
            Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl2);
            if (thM103847exceptionOrNullimpl2 != null) {
                String message2 = thM103847exceptionOrNullimpl2.getMessage();
                if (message2 == null) {
                    message2 = "Read confirmation preferences failed";
                }
                callback.invoke(null, new ProtocolException(message2, null, null, false, 14, null));
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(tabType, "orderPreferences")) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                objM103844constructorimpl3 = Result.m103844constructorimpl(FuturesOrderPreferencesBridge.f23409a.m26355d());
            } catch (Throwable th4) {
                Result.Companion companion6 = Result.INSTANCE;
                objM103844constructorimpl3 = Result.m103844constructorimpl(ResultKt.createFailure(th4));
            }
            if (Result.m103851isSuccessimpl(objM103844constructorimpl3)) {
                callback.invoke((Map) objM103844constructorimpl3, null);
            }
            Throwable thM103847exceptionOrNullimpl3 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl3);
            if (thM103847exceptionOrNullimpl3 != null) {
                String message3 = thM103847exceptionOrNullimpl3.getMessage();
                if (message3 == null) {
                    message3 = "Read order preferences failed";
                }
                callback.invoke(null, new ProtocolException(message3, null, null, false, 14, null));
                return;
            }
            return;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            ?? M35881t0 = m35881t0(ctx);
            objectRef.element = M35881t0;
            booleanRef.element = M35881t0 != 0 ? M35881t0.m36141E0() : false;
        } else {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.kumex.service.i
                @Override // java.lang.Runnable
                public final void run() {
                    KuMexService.m35869y0(objectRef, this, ctx, booleanRef, countDownLatch);
                }
            });
            countDownLatch.await(500L, TimeUnit.MILLISECONDS);
        }
        ContractEntity contractEntityM102673I = C46527h0.f104291a.m102673I();
        if (BadgeHelper.f29249a.m33971r()) {
            if (IUnifyAccountService.f53155a.get().mo64979C()) {
                try {
                    RemoteConfig remoteConfig = RemoteConfig.f19636a;
                    Type type = new C16787e().getType();
                    Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                    objM20457a = RemoteConfig.m20457a("asset_uta_pnl", type);
                } catch (Throwable th5) {
                    C43846g.m96568c(new KCConfigException(th5, "RemoteConfig", false, null, 8, null), null, 2, null);
                    objM20457a = null;
                }
                if (!C27025c.m66567e((Boolean) objM20457a, false)) {
                    if (!IUnifyAccountService.f53155a.get().mo64979C()) {
                        z11 = false;
                    }
                }
            } else if (!IUnifyAccountService.f53155a.get().mo64979C()) {
                z11 = false;
            }
            z11 = true;
        } else {
            z11 = false;
        }
        Pair pairM90091to9 = TuplesKt.m90091to("isTrial", Boolean.valueOf(booleanRef.element));
        Pair pairM90091to10 = TuplesKt.m90091to("isInverse", Boolean.valueOf(C27025c.m66566d(contractEntityM102673I != null ? Boolean.valueOf(contractEntityM102673I.isInverse()) : null)));
        KuMexDepend kuMexDepend = KuMexDepend.f30378a;
        Pair pairM90091to11 = TuplesKt.m90091to("hasOpenContract", Boolean.valueOf(kuMexDepend.m35906h()));
        Pair pairM90091to12 = TuplesKt.m90091to("isUpgrade", Boolean.valueOf(KuMEXUpgrade.m34085e(KuMEXUpgrade.f29306a, null, 1, null)));
        Pair pairM90091to13 = TuplesKt.m90091to("isLogin", Boolean.valueOf(kuMexDepend.m35905g().c()));
        Pair pairM90091to14 = TuplesKt.m90091to("settleCurrency", C27041f.m66668h(C37567b.m84620j(contractEntityM102673I)));
        FuturesFragment futuresFragment = (FuturesFragment) objectRef.element;
        String str = "";
        if (futuresFragment == null || (strM36173d6 = futuresFragment.m36173d6()) == null) {
            strM36173d6 = "";
        }
        Pair pairM90091to15 = TuplesKt.m90091to("qtyUnit", strM36173d6);
        Pair pairM90091to16 = TuplesKt.m90091to("tradingBotVisible", Boolean.valueOf(C24129b.m58030b(SiteVisibleConfigKey.TradingBot)));
        RobotSiteConfigEntity robotSiteConfigEntity2 = (RobotSiteConfigEntity) C46392a.f104043a.m102336j(C46894j.f104736a.m103252Q(), RobotSiteConfigEntity.class, null);
        Pair pairM90091to17 = TuplesKt.m90091to("robotSupportFutures", Boolean.valueOf(C27025c.m66566d(robotSiteConfigEntity2 != null ? robotSiteConfigEntity2.isSupportFutures() : null)));
        BrokerConfig brokerConfig = BrokerConfig.f19211a;
        Pair pairM90091to18 = TuplesKt.m90091to("showCalculator", Boolean.valueOf(brokerConfig.m20201d().mo20231S0().contains("calculator")));
        Pair pairM90091to19 = TuplesKt.m90091to("showTradingBot", Boolean.valueOf(brokerConfig.m20201d().mo20231S0().contains("tradingBot")));
        Pair pairM90091to20 = TuplesKt.m90091to("showFundingRate", Boolean.valueOf(brokerConfig.m20201d().mo20231S0().contains("fundingRate")));
        Pair pairM90091to21 = TuplesKt.m90091to("showBonus", Boolean.valueOf(brokerConfig.m20201d().mo20231S0().contains("bonus") && C38057a.f85671a.m85928a("kcApp.B6FuturesTrade.futures.perks", true)));
        C45042a c45042a = C45042a.f101445a;
        Pair pairM90091to22 = TuplesKt.m90091to("tradingRulesEnabled", Boolean.valueOf(c45042a.m99620h()));
        Pair pairM90091to23 = TuplesKt.m90091to("indexPriceEnabled", Boolean.valueOf(c45042a.m99614b()));
        Pair pairM90091to24 = TuplesKt.m90091to("kucoinIndexPriceEnabled", Boolean.valueOf(C24129b.m58030b(SiteVisibleConfigKey.TradingInfoIndexPriceSpotPrice)));
        Pair pairM90091to25 = TuplesKt.m90091to("fundingRateEnabled", Boolean.valueOf(c45042a.m99613a()));
        Pair pairM90091to26 = TuplesKt.m90091to("stableArbitrageEnabled", Boolean.valueOf(c45042a.m99619g() && C38057a.f85671a.m85928a("kcApp.B6FuturesTrade.More.arbitrageportfolios.1", true)));
        Pair pairM90091to27 = TuplesKt.m90091to("insuranceFundEnabled", Boolean.valueOf(c45042a.m99615c()));
        Pair pairM90091to28 = TuplesKt.m90091to("riskLimitEnabled", Boolean.valueOf(c45042a.m99618f()));
        FuturesFragment futuresFragment2 = (FuturesFragment) objectRef.element;
        if (futuresFragment2 == null || (strM36166X5 = futuresFragment2.m36166X5()) == null) {
            strM36166X5 = "";
        }
        Pair pairM90091to29 = TuplesKt.m90091to("futuresBonusText", strM36166X5);
        FuturesFragment futuresFragment3 = (FuturesFragment) objectRef.element;
        Pair pairM90091to30 = TuplesKt.m90091to("showFuturesBonusDot", Boolean.valueOf(futuresFragment3 != null ? futuresFragment3.m36158S7() : false));
        Pair pairM90091to31 = TuplesKt.m90091to("supportPnlAnalyze", Boolean.valueOf(z11));
        IUnifyAccountService.Companion companion7 = IUnifyAccountService.f53155a;
        Pair pairM90091to32 = TuplesKt.m90091to("isUnifiedAccount", Boolean.valueOf(companion7.get().mo64979C()));
        Pair pairM90091to33 = TuplesKt.m90091to("unifiedSiteVisible", Boolean.valueOf(companion7.get().mo65001q()));
        Pair pairM90091to34 = TuplesKt.m90091to("isHitGray", Boolean.valueOf(companion7.get().mo65008x()));
        Pair pairM90091to35 = TuplesKt.m90091to("supportShowToggleUnified", Boolean.valueOf(brokerConfig.m20201d().mo20241r0()));
        Pair pairM90091to36 = TuplesKt.m90091to("accountMode", companion7.get().mo64979C() ? "unified" : "classic");
        C45875l0 c45875l1 = C45875l0.f103336a;
        Pair pairM90091to37 = TuplesKt.m90091to("calculatorUrl", c45875l1.m101337e0());
        Pair pairM90091to38 = TuplesKt.m90091to("robotUrl", c45875l1.m101332A0());
        Pair pairM90091to39 = TuplesKt.m90091to("fundsUrl", c45875l1.m101347o0());
        if (contractEntityM102673I != null && (symbol = contractEntityM102673I.getSymbol()) != null) {
            str = symbol;
        }
        callback.invoke(MapsKt.mutableMapOf(pairM90091to9, pairM90091to10, pairM90091to11, pairM90091to12, pairM90091to13, pairM90091to14, pairM90091to15, pairM90091to16, pairM90091to17, pairM90091to18, pairM90091to19, pairM90091to20, pairM90091to21, pairM90091to22, pairM90091to23, pairM90091to24, pairM90091to25, pairM90091to26, pairM90091to27, pairM90091to28, pairM90091to29, pairM90091to30, pairM90091to31, pairM90091to32, pairM90091to33, pairM90091to34, pairM90091to35, pairM90091to36, pairM90091to37, pairM90091to38, pairM90091to39, TuplesKt.m90091to("symbol", str), TuplesKt.m90091to("isInverseStr", String.valueOf(contractEntityM102673I != null ? Boolean.valueOf(contractEntityM102673I.isInverse()) : null))), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
    
        if (r3.equals(androidx.credentials.provider.CredentialEntry.FALSE_STRING) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0063, code lost:
    
        if (r3.equals(androidx.credentials.provider.CredentialEntry.TRUE_STRING) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006c, code lost:
    
        if (r3.equals("yes") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0075, code lost:
    
        if (r3.equals("no") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007e, code lost:
    
        if (r3.equals("1") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0083, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008a, code lost:
    
        if (r3.equals("0") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008f, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX INFO: renamed from: j0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean m35879j0(Map<String, ? extends Object> map, String str) {
        if (map == null) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof Number) {
            return Boolean.valueOf(((Number) obj).intValue() != 0);
        }
        if (!(obj instanceof String)) {
            return null;
        }
        String lowerCase = ((String) obj).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != 48) {
            if (iHashCode != 49) {
                if (iHashCode != 3521) {
                    if (iHashCode != 119527) {
                        if (iHashCode != 3569038) {
                            if (iHashCode == 97196323) {
                            }
                        }
                        return null;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public static final void m35847E0(KuMexService kuMexService, BaseFragment baseFragment, ProfitRecordEntity profitRecordEntity, ProfitShareEntity profitShareEntity, Function2 function2) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            new PositionPnlShare().m26550o(baseFragment, profitRecordEntity, profitShareEntity);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            function2.invoke(Boolean.TRUE, null);
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            function2.invoke(Boolean.FALSE, new ProtocolException(OtcAd.KYC_NOT_PASS, thM103847exceptionOrNullimpl, null, false, 12, null));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static final Unit m35860k0(boolean z11, OrderEntity orderEntity, String str) {
        MultiBizFacadeManager.m20260s(MultiBizFacadeManager.f19232a, null, 1, null).mo4507i1(z11, orderEntity != null ? orderEntity.getSymbol() : null, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m35861l0(Function2 function2, Object obj) {
        function2.invoke(Boolean.TRUE, null);
    }

    /* JADX INFO: renamed from: m0 */
    public static final Unit m35862m0(Function2 function2, Throwable th2) {
        Boolean bool = Boolean.FALSE;
        String message = th2.getMessage();
        if (message == null) {
            message = "cancel order failed";
        }
        function2.invoke(bool, new ProtocolException(message, null, null, false, 14, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p0 */
    public static final ObservableSource m35864p0(List chunk) {
        Intrinsics.checkNotNullParameter(chunk, "chunk");
        return RepositoryServiceLocator.f19236a.m20286e().mo24812n(CollectionsKt.joinToString$default(chunk, ",", null, null, 0, null, null, 62, null)).compose(C24217a1.m58390n());
    }

    /* JADX INFO: renamed from: q0 */
    public static final ObservableSource m35865q0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (ObservableSource) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: r0 */
    public static final List m35866r0(List listOfLists) {
        Intrinsics.checkNotNullParameter(listOfLists, "listOfLists");
        return CollectionsKt.flatten(listOfLists);
    }

    /* JADX INFO: renamed from: s0 */
    public static final List m35867s0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (List) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: x0 */
    public static final Map<String, Object> m35868x0(boolean z11) {
        return MapsKt.mapOf(TuplesKt.m90091to("status", "ready"), TuplesKt.m90091to("value", Boolean.valueOf(z11)));
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: B */
    public boolean mo33253B(@NotNull String symbol, boolean z11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return RepositoryServiceLocator.f19236a.m20288g().mo24978D(symbol, z11) != null;
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: C */
    public boolean mo33254C(@Nullable FragmentManager fragmentManager) {
        return KuMEXUpgrade.f29306a.m34089d(fragmentManager);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: D */
    public C27096v0 mo33255D(@NotNull String symbol, boolean z11) {
        C27096v0 c27096v0M24441f;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        ContractEntity contractEntityMo24978D = RepositoryServiceLocator.f19236a.m20288g().mo24978D(symbol, false);
        if (contractEntityMo24978D != null && (c27096v0M24441f = FuturesDisplayNameUtils.f22525a.m24441f(contractEntityMo24978D, z11)) != null) {
            return c27096v0M24441f;
        }
        C27096v0 c27096v0Append = new C27096v0().append(symbol);
        Intrinsics.checkNotNullExpressionValue(c27096v0Append, "append(...)");
        return c27096v0Append;
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: E */
    public void mo33256E(@NotNull String symbols, boolean z11) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        InterfaceC44980d interfaceC44980dM20288g = RepositoryServiceLocator.f19236a.m20288g();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("symbol", symbols);
        linkedHashMap.put("favourite", String.valueOf(z11));
        interfaceC44980dM20288g.mo24990R(MapsKt.toMap(linkedHashMap));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    @Override // com.kubi.kumex.api.IKuMexService
    @Nullable
    /* JADX INFO: renamed from: F */
    public String mo33257F(@NotNull String symbol) {
        Object objM103844constructorimpl;
        boolean z11;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        try {
            Result.Companion companion = Result.INSTANCE;
            ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), symbol, false, 2, null);
            long jM84618h = contractEntityM99529O != null ? C37567b.m84618h(contractEntityM99529O) : 0L;
            if (contractEntityM99529O != null) {
                z11 = true;
                if (!C37567b.m84626p(contractEntityM99529O)) {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(C27099x.m66919i(new KCFlutterBridgeKLineKlineContractConfig(jM84618h, z11, contractEntityM99529O != null ? C37567b.m84624n(contractEntityM99529O) : 0L, C27041f.m66668h(String.valueOf(contractEntityM99529O != null ? contractEntityM99529O.getMultiplier() : null)), C27041f.m66668h(String.valueOf(contractEntityM99529O != null ? contractEntityM99529O.getBaseCurrency() : null)), C27041f.m66668h(String.valueOf(contractEntityM99529O != null ? contractEntityM99529O.getQuoteCurrency() : null)), C27041f.m66668h(String.valueOf(contractEntityM99529O != null ? contractEntityM99529O.getTickSize() : null)), mo33264M(symbol), "prep", contractEntityM99529O != null ? contractEntityM99529O.getFirstOpenDate() : 0L, C27025c.m66566d(contractEntityM99529O != null ? Boolean.valueOf(contractEntityM99529O.isInverse()) : null), C27041f.m66668h(String.valueOf(contractEntityM99529O != null ? contractEntityM99529O.getDisplayBaseCurrency() : null)), C27041f.m66668h(String.valueOf(contractEntityM99529O != null ? contractEntityM99529O.getIndexSymbol() : null)), C27041f.m66668h(String.valueOf(contractEntityM99529O != null ? contractEntityM99529O.getSettleCurrency() : null)), C41050b.f91264a.m90022e(), Long.valueOf(C27039d.m66650j(contractEntityM99529O != null ? Integer.valueOf(C37567b.m84623m(contractEntityM99529O)) : null))), false, 2, null));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return (String) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: G */
    public void mo33258G(@NotNull Context ctx, @NotNull String orderInfo, @Nullable String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(orderInfo, "orderInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            C27099x c27099x = C27099x.f54458a;
            MviExKt.m42518n(new KuMexService$modifyFuturesOrder$1((OrderEntity) C27099x.m66914d(orderInfo, new C16792j().getType()), str, callback, null));
        } catch (Throwable th2) {
            callback.invoke(Boolean.FALSE, new ProtocolException(null, th2, null, false, 13, null));
        }
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: H */
    public void mo33259H(@NotNull Context ctx, @Nullable String str, @Nullable String str2, @NotNull OrderEntity orderEntity) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(orderEntity, "orderEntity");
        MviExKt.m42518n(new KuMexService$jumpFuturesDelegationDetail$1(ctx, orderEntity, null));
    }

    /* JADX INFO: renamed from: I0 */
    public final ProfitRecordEntity m35877I0(Map<String, ? extends Object> map) {
        String strM35874F0;
        String strM35874F1;
        if (map != null && (strM35874F0 = m35874F0(map, "id")) != null) {
            String str = !StringsKt.isBlank(strM35874F0) ? strM35874F0 : null;
            if (str != null && (strM35874F1 = m35874F0(map, "symbol")) != null) {
                String str2 = !StringsKt.isBlank(strM35874F1) ? strM35874F1 : null;
                if (str2 != null) {
                    String strM35874F2 = m35874F0(map, "type");
                    String strM35876H0 = m35876H0(m35874F0(map, "side"));
                    if (strM35876H0 == null) {
                        strM35876H0 = m35876H0(strM35874F2);
                    }
                    String strM35875G0 = m35871B0(strM35874F2) ? strM35874F2 : null;
                    if (strM35875G0 == null && (strM35875G0 = m35875G0(strM35874F2)) == null) {
                        strM35875G0 = m35875G0(strM35876H0);
                    }
                    String str3 = strM35875G0;
                    String strM35874F3 = m35874F0(map, FirebaseAnalytics.Param.CURRENCY);
                    Integer numM35872C0 = m35872C0(map, TypedValues.CycleType.S_WAVE_OFFSET);
                    Long lM35873D0 = m35873D0(map, "closeDate");
                    BigDecimal bigDecimalM35880o0 = m35880o0(map, "realisedPnl");
                    boolean zAreEqual = Intrinsics.areEqual(m35879j0(map, "isTrialFunds"), Boolean.TRUE);
                    String strM35874F4 = m35874F0(map, "prizeType");
                    String strM35874F5 = m35874F0(map, "marginMode");
                    BigDecimal bigDecimalM35880o1 = m35880o0(map, "profitRate");
                    if (bigDecimalM35880o1 == null) {
                        bigDecimalM35880o1 = m35880o0(map, "roe");
                    }
                    return new ProfitRecordEntity(str, str2, strM35874F3, numM35872C0, str3, lM35873D0, bigDecimalM35880o0, null, null, null, null, null, zAreEqual, strM35874F4, strM35874F5, null, bigDecimalM35880o1, null, null, m35880o0(map, "leverage"), strM35876H0, m35874F0(map, "closeType"), m35873D0(map, "openTime"), null, 8388608, null);
                }
            }
        }
        return null;
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @Nullable
    /* JADX INFO: renamed from: J */
    public String mo33261J(@NotNull String baseCurrency, @NotNull String quoteCurrency) {
        Object next;
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(quoteCurrency, "quoteCurrency");
        Iterator<T> it = RepositoryServiceLocator.f19236a.m20288g().mo25016k().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ContractEntity contractEntity = (ContractEntity) next;
            if (Intrinsics.areEqual(C27041f.m66677q(contractEntity.getQuoteCurrency()), quoteCurrency) && Intrinsics.areEqual(contractEntity.getSpotCurrency(), baseCurrency) && !Intrinsics.areEqual(contractEntity.getStatus(), "Settled") && !Intrinsics.areEqual(contractEntity.getStatus(), "Closed")) {
                break;
            }
        }
        ContractEntity contractEntity2 = (ContractEntity) next;
        if (contractEntity2 != null) {
            return contractEntity2.getSymbol();
        }
        return null;
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: K */
    public boolean mo33262K(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return C37570e.m84690e(symbol);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: L */
    public void mo33263L(@NotNull Context ctx, @NotNull final String orderId, @Nullable String str, @Nullable String str2, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Object objM66914d;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            String strM66668h = C27041f.m66668h(str);
            Object objM66914d2 = null;
            try {
                C27099x c27099x = C27099x.f54458a;
                objM66914d = C27099x.m66914d(strM66668h, new C16783a().getType());
            } catch (Throwable unused) {
                objM66914d = null;
            }
            final OrderEntity orderEntity = (OrderEntity) objM66914d;
            String strM66668h2 = C27041f.m66668h(str2);
            try {
                C27099x c27099x2 = C27099x.f54458a;
                objM66914d2 = C27099x.m66914d(strM66668h2, new C16784b().getType());
            } catch (Throwable unused2) {
            }
            OrderEntity orderEntity2 = (OrderEntity) objM66914d2;
            if (orderEntity2 != null) {
                orderEntity = orderEntity2;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("cancelFuturesOrder isTpslOrder=");
            sb2.append(orderEntity2 != null);
            C44128b.m97259c("KuMexService", sb2.toString());
            C44128b.m97259c("KuMexService", "cancelFuturesOrder realOrder=" + orderEntity);
            final boolean zIsTrialFunds = orderEntity != null ? orderEntity.isTrialFunds() : false;
            Flowable<Object> flowableObserveOn = FlowableCompat.f54248a.m66386c(new Function0() { // from class: com.kubi.kumex.service.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KuMexService.m35860k0(zIsTrialFunds, orderEntity, orderId);
                }
            }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
            Consumer<? super Object> consumer = new Consumer() { // from class: com.kubi.kumex.service.k
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    KuMexService.m35861l0(callback, obj);
                }
            };
            final Function1 function1 = new Function1() { // from class: com.kubi.kumex.service.l
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KuMexService.m35862m0(callback, (Throwable) obj);
                }
            };
            flowableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.service.m
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    KuMexService.m35863n0(function1, obj);
                }
            });
        } catch (Throwable th2) {
            callback.invoke(Boolean.FALSE, new ProtocolException(null, th2, null, false, 13, null));
        }
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: M */
    public String mo33264M(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        ContractEntity contractEntityMo24978D = RepositoryServiceLocator.f19236a.m20288g().mo24978D(symbol, false);
        return C27041f.m66669i(contractEntityMo24978D != null ? FuturesDisplayNameUtils.f22525a.m24442h(contractEntityMo24978D) : null, symbol);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: O */
    public void mo33265O(@Nullable BaseFragment baseFragment) {
        IFuturesFragmentController iFuturesFragmentController = baseFragment instanceof IFuturesFragmentController ? (IFuturesFragmentController) baseFragment : null;
        if (iFuturesFragmentController != null) {
            iFuturesFragmentController.mo25527Y0();
        }
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: P */
    public List<String> mo33266P(@NotNull String baseCurrency) {
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        List<ContractEntity> listMo25016k = RepositoryServiceLocator.f19236a.m20288g().mo25016k();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMo25016k) {
            if (Intrinsics.areEqual(((ContractEntity) obj).getSpotCurrency(), baseCurrency)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ContractEntity) it.next()).getSymbol());
        }
        return CollectionsKt.filterNotNull(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: Q */
    public void mo33267Q(@NotNull BaseFragment futuresFragment) {
        Intrinsics.checkNotNullParameter(futuresFragment, "futuresFragment");
        IFuturesFragmentController iFuturesFragmentController = futuresFragment instanceof IFuturesFragmentController ? (IFuturesFragmentController) futuresFragment : null;
        if (iFuturesFragmentController != null) {
            iFuturesFragmentController.mo20214B0();
        }
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: R */
    public void mo33268R(@NotNull String symbol, boolean z11, boolean z12, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (z12) {
            C16108t.m34070o(symbol, z11, function0);
        } else {
            C16108t.m34080y(symbol, z11, function0);
        }
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: S */
    public Map<String, Object> mo33269S(@NotNull String currency) {
        Object objM103844constructorimpl;
        String strM66919i;
        Intrinsics.checkNotNullParameter(currency, "currency");
        try {
            Result.Companion companion = Result.INSTANCE;
            CoinEntity coinEntityMo25027s = RepositoryServiceLocator.f19236a.m20288g().mo25027s(currency, false);
            if (coinEntityMo25027s == null || (strM66919i = C27099x.m66919i(coinEntityMo25027s, false, 2, null)) == null) {
                strM66919i = "";
            }
            C27099x c27099x = C27099x.f54458a;
            objM103844constructorimpl = Result.m103844constructorimpl((HashMap) C27099x.m66914d(strM66919i, new C16788f().getType()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Map<String, Object> map = (Map) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
        return map == null ? MapsKt.emptyMap() : map;
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @Nullable
    /* JADX INFO: renamed from: U */
    public BaseFragment mo33270U() {
        boolean zM85928a = C38057a.f85671a.m85928a("kcApp.B6FuturesTrade.More.AtsContract.1", true);
        if (C24129b.m58030b(SiteVisibleConfigKey.Futures) && zM85928a) {
            return FuturesRnMigrationHostFragment.f23030Z.newInstance();
        }
        return null;
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: V */
    public C4400a mo33271V(@NotNull C4400a originPostcard) {
        Intrinsics.checkNotNullParameter(originPostcard, "originPostcard");
        if (!Intrinsics.areEqual(RouteExKt.m56216G(originPostcard.getUri()), "home") || !Intrinsics.areEqual(RouteExKt.m56284y(originPostcard.getBundle(), "page"), "1") || !Intrinsics.areEqual(RouteExKt.m56284y(originPostcard.getBundle(), "mainTab"), "copyTrading") || Intrinsics.areEqual(RouteExKt.m56284y(originPostcard.getBundle(), "entrySource"), "quotes") || !FuturesRemote.f23108a.m25650p()) {
            return originPostcard;
        }
        Uri uri = Uri.parse(originPostcard.getUri().getScheme() + "://home?page=3");
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        Bundle bundle = originPostcard.getBundle();
        bundle.putString("subPageName", "copyTrading");
        return new C4400a(uri, bundle);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: W */
    public void mo33272W(@NotNull BaseFragment baseFragment) {
        Intrinsics.checkNotNullParameter(baseFragment, "baseFragment");
        NoticeHelper.f29301a.m34047s(baseFragment);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: X */
    public void mo33273X(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @Nullable Map<String, ? extends Object> map, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseFragment baseFragmentM35881t0 = m35881t0(ctx);
        if (baseFragmentM35881t0 == null) {
            baseFragmentM35881t0 = m35882u0(ctx);
        }
        final BaseFragment baseFragment = baseFragmentM35881t0;
        if (baseFragment == null) {
            callback.invoke(Boolean.FALSE, new ProtocolException("-3", new IllegalStateException("没有可见的界面承载"), null, false, 12, null));
            return;
        }
        final ProfitRecordEntity profitRecordEntityM35877I0 = m35877I0(map);
        if (profitRecordEntityM35877I0 == null) {
            callback.invoke(Boolean.FALSE, new ProtocolException("-2", new IllegalArgumentException("仓位盈亏数据结构不合规"), null, false, 12, null));
            return;
        }
        final ProfitShareEntity profitShareEntityM35878J0 = m35878J0(map);
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.kumex.service.h
            @Override // java.lang.Runnable
            public final void run() {
                KuMexService.m35847E0(this.f30387b, baseFragment, profitRecordEntityM35877I0, profitShareEntityM35878J0, callback);
            }
        });
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: a */
    public void mo33274a(@NotNull final Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String actionId, @Nullable final Map<String, ? extends Object> map, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        Object objM103844constructorimpl3;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C44128b.m97259c("KuMexService", "handleMenuAction actionId=" + actionId + ", params=" + map);
        FuturesLayoutPreferencesBridge futuresLayoutPreferencesBridge = FuturesLayoutPreferencesBridge.f23398a;
        if (futuresLayoutPreferencesBridge.m26345b(actionId)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(futuresLayoutPreferencesBridge.m26344a(actionId, map)));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
                Boolean bool = (Boolean) objM103844constructorimpl;
                bool.booleanValue();
                callback.invoke(bool, null);
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                Boolean bool2 = Boolean.FALSE;
                String message = thM103847exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "Update layout preference failed";
                }
                callback.invoke(bool2, new ProtocolException(message, null, null, false, 14, null));
                return;
            }
            return;
        }
        FuturesConfirmationPreferencesBridge futuresConfirmationPreferencesBridge = FuturesConfirmationPreferencesBridge.f23389a;
        if (futuresConfirmationPreferencesBridge.m26337c(actionId)) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                objM103844constructorimpl2 = Result.m103844constructorimpl(Boolean.valueOf(futuresConfirmationPreferencesBridge.m26336b(actionId, map)));
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.INSTANCE;
                objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th3));
            }
            if (Result.m103851isSuccessimpl(objM103844constructorimpl2)) {
                Boolean bool3 = (Boolean) objM103844constructorimpl2;
                bool3.booleanValue();
                callback.invoke(bool3, null);
            }
            Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl2);
            if (thM103847exceptionOrNullimpl2 != null) {
                Boolean bool4 = Boolean.FALSE;
                String message2 = thM103847exceptionOrNullimpl2.getMessage();
                if (message2 == null) {
                    message2 = "Update confirmation preference failed";
                }
                callback.invoke(bool4, new ProtocolException(message2, null, null, false, 14, null));
                return;
            }
            return;
        }
        FuturesOrderPreferencesBridge futuresOrderPreferencesBridge = FuturesOrderPreferencesBridge.f23409a;
        if (!futuresOrderPreferencesBridge.m26353b(actionId)) {
            if (Intrinsics.areEqual(actionId, "unifyAccountSwitch")) {
                C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.kumex.service.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        KuMexService.m35870z0(map);
                    }
                });
                callback.invoke(Boolean.TRUE, null);
                return;
            }
            final Integer num = (Integer) MapsKt.mapOf(TuplesKt.m90091to("preferences", 5), TuplesKt.m90091to("calculator", 8), TuplesKt.m90091to("transfer", 2), TuplesKt.m90091to("tradeUnit", 3), TuplesKt.m90091to("robot", 9), TuplesKt.m90091to("fundsCosts", 7), TuplesKt.m90091to(FirebaseAnalytics.Param.COUPON, 6), TuplesKt.m90091to("pnlAnalyzer", 11), TuplesKt.m90091to("mock", 100), TuplesKt.m90091to("tradingRules", 1001), TuplesKt.m90091to("indexPrice", 1002), TuplesKt.m90091to("fundingRate", 1003), TuplesKt.m90091to("stableArbitrage", 1004), TuplesKt.m90091to("insuranceFund", 1005), TuplesKt.m90091to("riskLimit", 1006), TuplesKt.m90091to("kucoinIndexPrice", 1007)).get(actionId);
            if (num != null) {
                C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.kumex.service.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        KuMexService.m35846A0(this.f30380b, ctx, callback, num, map);
                    }
                });
                return;
            }
            callback.invoke(Boolean.FALSE, new ProtocolException("Unknown action: " + actionId, null, null, false, 14, null));
            return;
        }
        try {
            Result.Companion companion5 = Result.INSTANCE;
            objM103844constructorimpl3 = Result.m103844constructorimpl(Boolean.valueOf(futuresOrderPreferencesBridge.m26352a(actionId, map)));
        } catch (Throwable th4) {
            Result.Companion companion6 = Result.INSTANCE;
            objM103844constructorimpl3 = Result.m103844constructorimpl(ResultKt.createFailure(th4));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl3)) {
            Boolean bool5 = (Boolean) objM103844constructorimpl3;
            bool5.booleanValue();
            callback.invoke(bool5, null);
        }
        Throwable thM103847exceptionOrNullimpl3 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl3);
        if (thM103847exceptionOrNullimpl3 != null) {
            Boolean bool6 = Boolean.FALSE;
            String message3 = thM103847exceptionOrNullimpl3.getMessage();
            if (message3 == null) {
                message3 = "Update order preference failed";
            }
            callback.invoke(bool6, new ProtocolException(message3, null, null, false, 14, null));
        }
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: c */
    public void mo33275c(boolean z11) {
        RepositoryServiceLocator.f19236a.m20288g().mo25003c(z11);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: d */
    public void mo33276d(@NotNull Context ctx, @NotNull String subUid, @NotNull String positionJson, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(subUid, "subUid");
        Intrinsics.checkNotNullParameter(positionJson, "positionJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(C41696j.m91104d(C41713n0.m91126b(), null, null, new KuMexService$requestFuturePositionTpSl$1$1(callback, positionJson, subUid, null), 3, null));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            callback.invoke(Boolean.FALSE, new ProtocolException(OtcAd.KYC_NOT_PASS, new RuntimeException("协议调用异常"), null, false, 12, null));
        }
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: e */
    public int mo33277e() {
        return C46527h0.f104291a.m102675K();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: g */
    public void mo33279g() {
        KuMEXUpgrade.f29306a.m34090g();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: h */
    public void mo33280h() {
        RepositoryServiceLocator.f19236a.m20288g().mo25012h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: i */
    public void mo33281i(@NotNull BaseFragment futuresFragment, boolean z11) {
        Intrinsics.checkNotNullParameter(futuresFragment, "futuresFragment");
        IFuturesFragmentController iFuturesFragmentController = futuresFragment instanceof IFuturesFragmentController ? (IFuturesFragmentController) futuresFragment : null;
        if (iFuturesFragmentController != null) {
            iFuturesFragmentController.mo20216q1(z11);
        }
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: j */
    public void mo33282j(@NotNull Context ctx, @NotNull String subUid, @NotNull String positionJson, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(subUid, "subUid");
        Intrinsics.checkNotNullParameter(positionJson, "positionJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(C41696j.m91104d(C41713n0.m91126b(), null, null, new KuMexService$requestFutureMarketClosePosition$1$1(callback, positionJson, subUid, null), 3, null));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            callback.invoke(Boolean.FALSE, new ProtocolException(OtcAd.KYC_NOT_PASS, new RuntimeException("协议调用异常"), null, false, 12, null));
        }
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: k */
    public List<ContractEntity> mo33283k() {
        return RepositoryServiceLocator.f19236a.m20288g().mo25016k();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: l */
    public boolean mo33284l() {
        return RepositoryServiceLocator.f19236a.m20292k().mo100573l();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: n */
    public InterfaceC46261b mo33285n() {
        return new C16791i();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: o */
    public Map<String, Object> mo33286o(@NotNull String symbol) {
        Object objM103844constructorimpl;
        String strM66919i;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        try {
            Result.Companion companion = Result.INSTANCE;
            ContractEntity contractEntityMo24978D = RepositoryServiceLocator.f19236a.m20288g().mo24978D(symbol, false);
            if (contractEntityMo24978D == null || (strM66919i = C27099x.m66919i(contractEntityMo24978D, false, 2, null)) == null) {
                strM66919i = "";
            }
            C27099x c27099x = C27099x.f54458a;
            objM103844constructorimpl = Result.m103844constructorimpl((HashMap) C27099x.m66914d(strM66919i, new C16790h().getType()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Map<String, Object> map = (Map) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
        return map == null ? MapsKt.emptyMap() : map;
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: p */
    public ContractOpenNotice mo33287p() {
        ContractOpenNotice contractOpenNotice = new ContractOpenNotice(null, null, null, null, null, 31, null);
        NoticeConfig noticeConfigMo25019n = RepositoryServiceLocator.f19236a.m20288g().mo25019n();
        ArrayList arrayList = new ArrayList();
        for (Map<String, ? extends Object> map : noticeConfigMo25019n) {
            if (Intrinsics.areEqual(map.get("type"), "quote_notice")) {
                arrayList.add(map);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String strM66606i = C27029c.m66606i((Map) it.next());
            Intrinsics.checkNotNullExpressionValue(strM66606i, "toJson(...)");
            C27099x c27099x = C27099x.f54458a;
            arrayList2.add(C27099x.m66914d(strM66606i, new C16786d().getType()));
        }
        ContractNotice contractNotice = (ContractNotice) (arrayList2.isEmpty() ? null : arrayList2.get(0));
        if (contractNotice != null) {
            contractOpenNotice.setIcon(contractNotice.getIcon());
            contractOpenNotice.setLink(contractNotice.getLink());
            contractOpenNotice.setContent(contractNotice.getContent());
            contractOpenNotice.setStart(contractNotice.getStart());
            contractOpenNotice.setEnd(contractNotice.getEnd());
        }
        return contractOpenNotice;
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: r */
    public String mo33288r() {
        return C37571f.m84698e(RepositoryServiceLocator.f19236a.m20290i().mo99981F0());
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: s */
    public String mo33289s(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        ContractEntity contractEntityMo24978D = RepositoryServiceLocator.f19236a.m20288g().mo24978D(symbol, false);
        return Intrinsics.areEqual(contractEntityMo24978D != null ? Boolean.valueOf(C37567b.m84625o(contractEntityMo24978D)) : null, Boolean.TRUE) ? StringsKt.trim((CharSequence) C27017c.f54310a.m66516f(R$string.perpetual_contract, "")).toString() : "";
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: t */
    public InterfaceC46260a mo33290t() {
        return new C16785c();
    }

    /* JADX INFO: renamed from: t0 */
    public final FuturesFragment m35881t0(Context context) {
        FragmentManager supportFragmentManager;
        List<Fragment> fragments;
        Activity activityM6125h = context instanceof Activity ? (Activity) context : null;
        if (activityM6125h == null) {
            activityM6125h = C5258a.m6125h();
        }
        if (activityM6125h == null) {
            C44128b.m97259c("KuMexService", "findCurrentFuturesFragment: activity is null");
            return null;
        }
        BaseActivity baseActivity = activityM6125h instanceof BaseActivity ? (BaseActivity) activityM6125h : null;
        if (baseActivity != null && (supportFragmentManager = baseActivity.getSupportFragmentManager()) != null && (fragments = supportFragmentManager.getFragments()) != null) {
            for (Fragment fragment : fragments) {
                Intrinsics.checkNotNull(fragment);
                FuturesFragment futuresFragmentM35883v0 = m35883v0(fragment);
                if (futuresFragmentM35883v0 != null) {
                    return futuresFragmentM35883v0;
                }
            }
        }
        return null;
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: u */
    public String mo33291u() {
        return C45875l0.f103336a.m101340h0();
    }

    /* JADX INFO: renamed from: u0 */
    public final BaseFragment m35882u0(Context context) {
        FragmentManager supportFragmentManager;
        List<Fragment> fragments;
        Activity activityM6125h = context instanceof Activity ? (Activity) context : null;
        if (activityM6125h == null) {
            activityM6125h = C5258a.m6125h();
        }
        FragmentActivity fragmentActivity = activityM6125h instanceof FragmentActivity ? (FragmentActivity) activityM6125h : null;
        if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null && (fragments = supportFragmentManager.getFragments()) != null) {
            for (Fragment fragment : fragments) {
                Intrinsics.checkNotNull(fragment);
                BaseFragment baseFragmentM35884w0 = m35884w0(fragment);
                if (baseFragmentM35884w0 != null) {
                    return baseFragmentM35884w0;
                }
            }
        }
        return null;
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: v */
    public String mo33292v() {
        return "B6FuturesMarkets";
    }

    /* JADX INFO: renamed from: v0 */
    public final FuturesFragment m35883v0(Fragment fragment) {
        if (fragment instanceof FuturesFragment) {
            return (FuturesFragment) fragment;
        }
        List<Fragment> fragments = fragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        for (Fragment fragment2 : fragments) {
            Intrinsics.checkNotNull(fragment2);
            FuturesFragment futuresFragmentM35883v0 = m35883v0(fragment2);
            if (futuresFragmentM35883v0 != null) {
                return futuresFragmentM35883v0;
            }
        }
        return null;
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: w */
    public int mo33293w(@Nullable String str) {
        PropertyEntity properties;
        Integer displayPrecision = null;
        CoinEntity coinEntityM99528E = InterfaceC44980d.m99528E(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(str), false, 2, null);
        if (coinEntityM99528E != null && (properties = coinEntityM99528E.getProperties()) != null) {
            displayPrecision = properties.getDisplayPrecision();
        }
        return C27039d.m66651k(displayPrecision, 8);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: x */
    public Observable<List<QuotesEntity>> mo33294x(@NotNull List<String> symbols) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        Observable observableFromIterable = Observable.fromIterable(CollectionsKt.chunked(symbols, 40));
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.service.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexService.m35864p0((List) obj);
            }
        };
        Single list = observableFromIterable.flatMap(new Function() { // from class: com.kubi.kumex.service.e
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return KuMexService.m35865q0(function1, obj);
            }
        }, true).toList();
        final Function1 function2 = new Function1() { // from class: com.kubi.kumex.service.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexService.m35866r0((List) obj);
            }
        };
        Observable<List<QuotesEntity>> observable = list.map(new Function() { // from class: com.kubi.kumex.service.g
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return KuMexService.m35867s0(function2, obj);
            }
        }).observeOn(C42916f.m94128g()).subscribeOn(C42916f.m94127f()).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return observable;
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: y */
    public ContractEntityOpenData mo33295y(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        ContractEntityOpenData contractEntityOpenData = new ContractEntityOpenData(null, false, null, null, null, null, null, 0L, 0L, 0L, null, 0L, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, false, null, null, null, null, null, null, -1, 32767, null);
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), symbol, false, 2, null);
        if (contractEntityM99529O != null) {
            contractEntityOpenData.setType(contractEntityM99529O.getType());
            contractEntityOpenData.setInverse(contractEntityM99529O.isInverse());
            contractEntityOpenData.setSymbol(contractEntityM99529O.getSymbol());
            contractEntityOpenData.setRootSymbol(contractEntityM99529O.getRootSymbol());
            contractEntityOpenData.setBaseCurrency(contractEntityM99529O.getBaseCurrency());
            contractEntityOpenData.setQuoteCurrency(contractEntityM99529O.getQuoteCurrency());
            contractEntityOpenData.setStatus(contractEntityM99529O.getStatus());
            contractEntityOpenData.setCreatedAt(contractEntityM99529O.getCreatedAt());
            contractEntityOpenData.setExpireDate(contractEntityM99529O.getExpireDate());
            contractEntityOpenData.setUpdatedAt(contractEntityM99529O.getUpdatedAt());
            contractEntityOpenData.setFairMethod(contractEntityM99529O.getFairMethod());
            contractEntityOpenData.setFirstOpenDate(contractEntityM99529O.getFirstOpenDate());
            contractEntityOpenData.setFundingBaseSymbol(contractEntityM99529O.getFundingBaseSymbol());
            contractEntityOpenData.setFundingQuoteSymbol(contractEntityM99529O.getFundingQuoteSymbol());
            contractEntityOpenData.setIndexSymbol(contractEntityM99529O.getIndexSymbol());
            contractEntityOpenData.setInitialMargin(contractEntityM99529O.getInitialMargin());
            contractEntityOpenData.setDeleverage(contractEntityM99529O.isDeleverage());
            contractEntityOpenData.setQuanto(contractEntityM99529O.isQuanto());
            contractEntityOpenData.setLotSize(contractEntityM99529O.getLotSize());
            contractEntityOpenData.setMaintainMargin(contractEntityM99529O.getMaintainMargin());
            contractEntityOpenData.setMakerFeeRate(contractEntityM99529O.getMakerFeeRate());
            contractEntityOpenData.setMakerFixFee(contractEntityM99529O.getMakerFixFee());
            contractEntityOpenData.setMarkMethod(contractEntityM99529O.getMarkMethod());
            contractEntityOpenData.setMaxOrderQty(contractEntityM99529O.getMaxOrderQty());
            contractEntityOpenData.setIndexPriceTickSize(contractEntityM99529O.getIndexPriceTickSize());
            contractEntityOpenData.setMaxPrice(contractEntityM99529O.getMaxPrice());
            contractEntityOpenData.setMaxRiskLimit(contractEntityM99529O.getMaxRiskLimit());
            contractEntityOpenData.setMinRiskLimit(contractEntityM99529O.getMinRiskLimit());
            contractEntityOpenData.setRiskStep(contractEntityM99529O.getRiskStep());
            contractEntityOpenData.setSettleCurrency(contractEntityM99529O.getSettleCurrency());
            contractEntityOpenData.setSettleDate(contractEntityM99529O.getSettleDate());
            contractEntityOpenData.setSettlementFee(contractEntityM99529O.getSettlementFee());
            contractEntityOpenData.setTakerFeeRate(contractEntityM99529O.getTakerFeeRate());
            contractEntityOpenData.setTakerFixFee(contractEntityM99529O.getTakerFixFee());
            contractEntityOpenData.setTickSize(contractEntityM99529O.getTickSize());
            contractEntityOpenData.setMultiplier(contractEntityM99529O.getMultiplier());
            contractEntityOpenData.setMaxLeverage(contractEntityM99529O.getMaxLeverage());
            contractEntityOpenData.setSupportGridTrading(contractEntityM99529O.getSupportGridTrading());
            contractEntityOpenData.setStepRiskLimitStatus(contractEntityM99529O.getStepRiskLimitStatus());
            contractEntityOpenData.setTrialFunds(contractEntityM99529O.isTrialFunds());
            contractEntityOpenData.setSpotCurrency(contractEntityM99529O.getSpotCurrency());
            contractEntityOpenData.setK(contractEntityM99529O.getK());
            contractEntityOpenData.setM(contractEntityM99529O.getM());
            contractEntityOpenData.setF(contractEntityM99529O.getF());
            contractEntityOpenData.setMmrLimit(contractEntityM99529O.getMmrLimit());
            contractEntityOpenData.setMmrLevConstant(contractEntityM99529O.getMmrLevConstant());
        }
        return contractEntityOpenData;
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: z */
    public boolean mo33296z(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.areEqual(type, SearchCategory$Companion.FUTURES)) {
            if (C24129b.m58030b(SiteVisibleConfigKey.TradingBot)) {
                RobotSiteConfigEntity robotSiteConfigEntity = (RobotSiteConfigEntity) C46392a.f104043a.m102336j(C46894j.f104736a.m103252Q(), RobotSiteConfigEntity.class, null);
                if (C27025c.m66566d(robotSiteConfigEntity != null ? robotSiteConfigEntity.isSupportFutures() : null)) {
                    return true;
                }
            }
            return false;
        }
        if (C24129b.m58030b(SiteVisibleConfigKey.TradingBot)) {
            RobotSiteConfigEntity robotSiteConfigEntity2 = (RobotSiteConfigEntity) C46392a.f104043a.m102336j(C46894j.f104736a.m103252Q(), RobotSiteConfigEntity.class, null);
            if (C27025c.m66566d(robotSiteConfigEntity2 != null ? robotSiteConfigEntity2.isSupportSpot() : null)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: A0 */
    public static final void m35846A0(KuMexService kuMexService, Context context, Function2 function2, Integer num, Map map) {
        FuturesFragment futuresFragmentM35881t0 = kuMexService.m35881t0(context);
        if (futuresFragmentM35881t0 != null && futuresFragmentM35881t0.isAdded()) {
            futuresFragmentM35881t0.m36144G6(num.intValue(), map);
            function2.invoke(Boolean.TRUE, null);
        } else {
            function2.invoke(Boolean.FALSE, new ProtocolException("FuturesFragment not found or not added", null, null, false, 14, null));
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static final void m35863n0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.kubi.kumex.trade.FuturesFragment] */
    /* JADX INFO: renamed from: y0 */
    public static final void m35869y0(Ref.ObjectRef objectRef, KuMexService kuMexService, Context context, Ref.BooleanRef booleanRef, CountDownLatch countDownLatch) {
        boolean zM36141E0;
        ?? M35881t0 = kuMexService.m35881t0(context);
        objectRef.element = M35881t0;
        if (M35881t0 != 0) {
            zM36141E0 = M35881t0.m36141E0();
        } else {
            zM36141E0 = false;
        }
        booleanRef.element = zM36141E0;
        countDownLatch.countDown();
    }

    /* JADX INFO: renamed from: C0 */
    public final Integer m35872C0(Map<String, ? extends Object> map, String str) {
        Long lM35873D0 = m35873D0(map, str);
        if (lM35873D0 != null) {
            return Integer.valueOf((int) lM35873D0.longValue());
        }
        return null;
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: I */
    public String mo33260I() {
        return C17060n0.m36552b();
    }

    /* JADX INFO: renamed from: o0 */
    public final BigDecimal m35880o0(Map<String, ? extends Object> map, String str) {
        Object objM103844constructorimpl;
        String strM35874F0 = m35874F0(map, str);
        Object obj = null;
        if (strM35874F0 == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(new BigDecimal(strM35874F0));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (!Result.m103850isFailureimpl(objM103844constructorimpl)) {
            obj = objM103844constructorimpl;
        }
        return (BigDecimal) obj;
    }

    /* JADX INFO: renamed from: w0 */
    public final BaseFragment m35884w0(Fragment fragment) {
        BaseFragment baseFragmentM35884w0;
        BaseFragment baseFragment;
        List<Fragment> fragments = fragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        Iterator<T> it = fragments.iterator();
        do {
            if (it.hasNext()) {
                Fragment fragment2 = (Fragment) it.next();
                Intrinsics.checkNotNull(fragment2);
                baseFragmentM35884w0 = m35884w0(fragment2);
            } else {
                baseFragmentM35884w0 = null;
                break;
            }
        } while (baseFragmentM35884w0 == null);
        if (baseFragmentM35884w0 != null) {
            return baseFragmentM35884w0;
        }
        if (fragment instanceof BaseFragment) {
            baseFragment = (BaseFragment) fragment;
        } else {
            baseFragment = null;
        }
        if (baseFragment == null || !baseFragment.isShowing()) {
            return null;
        }
        return baseFragment;
    }
}
