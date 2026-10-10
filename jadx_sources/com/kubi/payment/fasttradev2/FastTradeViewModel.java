package com.kubi.payment.fasttradev2;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.otc.exception.OtcException;
import com.kubi.payment.base.BasePaymentVM;
import com.kubi.payment.fast.data.entities.FastTradeCryptoCurrency;
import com.kubi.payment.fast.data.entities.FastTradeFiatCurrency;
import com.kubi.payment.fast.data.entities.FiatCouponInfo;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.payment.service.IPaymentSiteService;
import com.kubi.payment.util.PaymentStorageId;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41016c;
import p477nt.AbstractC42878k;
import p477nt.C42875h;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: FastTradeViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u0000 x2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001xB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u00072\b\u0010:\u001a\u0004\u0018\u00010\u0007J\u0006\u0010;\u001a\u000208J:\u0010<\u001a\u0002082\b\u0010=\u001a\u0004\u0018\u00010\u00162\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b2\u0012\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000b0\nH\u0082@¢\u0006\u0002\u0010@J\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u0082@¢\u0006\u0002\u0010BJ\u001c\u0010C\u001a\u0002082\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u0082@¢\u0006\u0002\u0010DJ\u0014\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u0082@¢\u0006\u0002\u0010BJ \u0010F\u001a\u0004\u0018\u00010\u00122\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000bH\u0082@¢\u0006\u0002\u0010DJ\u0016\u0010G\u001a\u0002082\u0006\u0010H\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010IJ&\u0010J\u001a\u0002082\b\u0010=\u001a\u0004\u0018\u00010\u00122\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u0082@¢\u0006\u0002\u0010KJ\u000e\u0010L\u001a\u00020\u0007H\u0082@¢\u0006\u0002\u0010BJ\u0016\u0010M\u001a\u0002082\u0006\u00109\u001a\u00020\u0007H\u0082@¢\u0006\u0002\u0010NJ\u0006\u0010O\u001a\u000208J(\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b2\b\u00109\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010Q\u001a\u00020\u001eH\u0082@¢\u0006\u0002\u0010RJ\u0018\u0010S\u001a\u0004\u0018\u00010\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bH\u0002J\u001a\u0010T\u001a\u0002082\b\u0010H\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010U\u001a\u00020\u001eJ\u001a\u0010V\u001a\u0002082\b\u0010W\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010U\u001a\u00020\u001eJ\b\u0010X\u001a\u00020\u0007H\u0002J\b\u0010Y\u001a\u00020\u0007H\u0002J\u0006\u0010Z\u001a\u000208J\u0006\u0010[\u001a\u000208Jd\u0010\\\u001a\u000208\"\b\b\u0000\u0010]*\u00020^2\u0012\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H]0\u000b0`2\u0010\u0010a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u000b2\u0012\u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H]0(0\n2\u0016\u0010c\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u0001H]\u0012\u0006\u0012\u0004\u0018\u00010\u00070dH\u0002J2\u0010e\u001a\b\u0012\u0004\u0012\u0002H]0\u000b\"\b\b\u0000\u0010]*\u00020^2\u0012\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H]0\u000b0`H\u0082@¢\u0006\u0002\u0010fJ:\u0010g\u001a\u000208\"\b\b\u0000\u0010]*\u00020^2\u0012\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H]0\u000b0`2\f\u0010>\u001a\b\u0012\u0004\u0012\u0002H]0\u000bH\u0082@¢\u0006\u0002\u0010hJ\u000e\u0010i\u001a\u0002082\u0006\u00109\u001a\u00020\u0012J\u000e\u0010j\u001a\u0002082\u0006\u0010:\u001a\u00020\u0016JW\u0010k\u001a\u000208\"\b\b\u0000\u0010]*\u00020^2\u0012\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H]0\u000b0`2\u0006\u0010l\u001a\u0002H]2\u000e\u0010m\u001a\n\u0012\u0004\u0012\u0002H]\u0018\u00010\u000b2\u0012\u0010n\u001a\u000e\u0012\u0004\u0012\u0002H]\u0012\u0004\u0012\u00020\u001e0dH\u0002¢\u0006\u0002\u0010oJ\u0006\u0010p\u001a\u000208J\u0006\u0010q\u001a\u000208J6\u0010r\u001a\u000208\"\u0004\b\u0000\u0010]2\u0012\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H]0\u000b0`2\u0012\u0010s\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H]0(0\nH\u0002J\u0006\u0010t\u001a\u000208J\u000e\u0010u\u001a\u000208H\u0082@¢\u0006\u0002\u0010BJ\u000e\u0010v\u001a\u0002082\u0006\u0010w\u001a\u00020/R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000b0\u000e8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0010R\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u000e8F¢\u0006\u0006\u001a\u0004\b \u0010\u0010R\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u000e8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0010R\u001a\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000b0\u000e8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0010R\u001a\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120(0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120(0\u000e8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0010R\u001a\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160(0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160(0\u000e8F¢\u0006\u0006\u001a\u0004\b-\u0010\u0010R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u000e8F¢\u0006\u0006\u001a\u0004\b1\u0010\u0010R\u001b\u00102\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b3\u00104¨\u0006y"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/FastTradeViewModel;", "Lcom/kubi/payment/base/BasePaymentVM;", "Lcom/kubi/payment/fast/data/source/IFastRepository;", "repository", "<init>", "(Lcom/kubi/payment/fast/data/source/IFastRepository;)V", "initialFiatCurrency", "", "initialCryptoCurrency", "_fiatCurrencyList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/kubi/payment/fasttradev2/ItemFiatCurrency;", "fiatCurrencyList", "Landroidx/lifecycle/LiveData;", "getFiatCurrencyList", "()Landroidx/lifecycle/LiveData;", "_selectedFiatCurrency", "Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;", "selectedFiatCurrency", "getSelectedFiatCurrency", "selectedCryptoCurrency", "Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Response;", "getSelectedCryptoCurrency", "_selectedCryptoCurrency", "_cryptoCurrencyList", "cryptoCurrencyList", "getCryptoCurrencyList", "_showContent", "Lcom/kubi/payment/base/Event;", "", "showContent", "getShowContent", "_showSellCryptoCurrencyDialog", "showSellCryptoCurrencyDialog", "getShowSellCryptoCurrencyDialog", "_sellCryptoCurrencyList", "sellCryptoCurrencyList", "getSellCryptoCurrencyList", "_fiatHistoryCurrencyList", "", "fiatHistoryCurrencyList", "getFiatHistoryCurrencyList", "_cryptoHistoryCurrencyList", "cryptoHistoryCurrencyList", "getCryptoHistoryCurrencyList", "_fiatCouponInfo", "Lcom/kubi/payment/fast/data/entities/FiatCouponInfo$Response;", "fiatCouponInfo", "getFiatCouponInfo", "useMultiAccountWidget", "getUseMultiAccountWidget", "()Z", "useMultiAccountWidget$delegate", "Lkotlin/Lazy;", "updateTradingPair", "", "fiatCurrency", "cryptoCurrency", "loadTradingPair", "convertToItemFastTradeCryptoCurrencyList", "selectedCurrency", "currencyList", "liveData", "(Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Response;Ljava/util/List;Landroidx/lifecycle/MutableLiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCacheFiatCurrencyList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cacheFiatCurrencyList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFiatCurrencyList", "findSelectedFiatCurrency", "updateCryptoCurrencyList", "newFiatCurrency", "(Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "convertToItemFastTradeFiatCurrencyList", "(Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCacheFiatCurrency", "cacheFiatCurrency", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadSellCryptoCurrencyList", "loadCryptoCurrencyList", "needBalance", "(Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findSelectedCryptoCurrency", "updateSelectedFiatCurrency", "needCache", "updateSelectedCryptoCurrency", "newCryptoCurrency", "defaultFiatCurrency", "defaultCryptoCurrency", "loadHistoryFiatCurrencyList", "loadHistoryCryptoCurrencyList", "loadHistoryCurrencyList", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/Parcelable;", "key", "Lcom/kubi/utils/storage/StorageId;", "currencyTitles", "historyListData", "condition", "Lkotlin/Function1;", "getHistoryCurrency", "(Lcom/kubi/utils/storage/StorageId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cacheHistoryCurrency", "(Lcom/kubi/utils/storage/StorageId;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addFiatToHistory", "addCryptoToHistory", "addToHistory", FirebaseAnalytics.Param.CURRENCY, "historyList", "predicate", "(Lcom/kubi/utils/storage/StorageId;Landroid/os/Parcelable;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "clearFiatHistory", "clearCryptoHistory", "clearHistory", "historyData", "loadFiatCouponInfo", "realRequestCouponInfo", "setFiatCouponInfo", "info", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFastTradeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastTradeViewModel.kt\ncom/kubi/payment/fasttradev2/FastTradeViewModel\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 7 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 8 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,748:1\n47#2,4:749\n1563#3:753\n1634#3,3:754\n1563#3:760\n1634#3,3:761\n1563#3:770\n1634#3,3:771\n1563#3:774\n1634#3,3:775\n44#4,2:757\n44#4,2:764\n1#5:759\n17#6,2:766\n17#6,2:768\n35#7,4:778\n39#7:784\n44#8,2:782\n*S KotlinDebug\n*F\n+ 1 FastTradeViewModel.kt\ncom/kubi/payment/fasttradev2/FastTradeViewModel\n*L\n164#1:749,4\n307#1:753\n307#1:754,3\n467#1:760\n467#1:761,3\n586#1:770\n586#1:771,3\n597#1:774\n597#1:775,3\n311#1:757,2\n495#1:764,2\n566#1:766,2\n575#1:768,2\n145#1:778,4\n145#1:784\n145#1:782,2\n*E\n"})
public final class FastTradeViewModel extends BasePaymentVM<IFastRepository> {

    /* JADX INFO: renamed from: n0 */
    @NotNull
    public static final Companion f38994n0 = new Companion(null);

    /* JADX INFO: renamed from: o0 */
    @NotNull
    public static final List<String> f38995o0 = CollectionsKt.listOf((Object[]) new String[]{"FAST_SELL", "FAST_BUY"});

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final IFastRepository f38996Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public String f38997a0;

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public String f38998b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<List<ItemFiatCurrency>> f38999c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<FastTradeFiatCurrency.Response> f39000d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final MutableLiveData<FastTradeCryptoCurrency.Response> f39001e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final MutableLiveData<List<FastTradeCryptoCurrency.Response>> f39002f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final MutableLiveData<C42875h<Boolean>> f39003g0;

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final MutableLiveData<C42875h<Boolean>> f39004h0;

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final MutableLiveData<List<FastTradeCryptoCurrency.Response>> f39005i0;

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public final MutableLiveData<List<FastTradeFiatCurrency.Response>> f39006j0;

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public final MutableLiveData<List<FastTradeCryptoCurrency.Response>> f39007k0;

    /* JADX INFO: renamed from: l0 */
    @NotNull
    public final MutableLiveData<FiatCouponInfo.Response> f39008l0;

    /* JADX INFO: renamed from: m0 */
    @NotNull
    public final Lazy f39009m0;

    /* JADX INFO: compiled from: FastTradeViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/FastTradeViewModel$Companion;", "", "<init>", "()V", CredentialProviderBaseController.TYPE_TAG, "", "TRADE_TYPE", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.FastTradeViewModel$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 FastTradeViewModel.kt\ncom/kubi/payment/fasttradev2/FastTradeViewModel\n+ 3 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,49:1\n165#2,2:50\n168#2:54\n44#3,2:52\n*S KotlinDebug\n*F\n+ 1 FastTradeViewModel.kt\ncom/kubi/payment/fasttradev2/FastTradeViewModel\n*L\n166#1:52,2\n*E\n"})
    public static final class C20692a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            if (exception instanceof CancellationException) {
                return;
            }
            C43846g.m96568c(new OtcException(exception, "FastTradeViewModel", false, null, 8, null), null, 2, null);
        }

        public C20692a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.FastTradeViewModel$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C20693b extends TypeToken<Boolean> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastTradeViewModel(@NotNull IFastRepository repository) {
        super(repository);
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f38996Z = repository;
        this.f38999c0 = new MutableLiveData<>();
        this.f39000d0 = new MutableLiveData<>();
        this.f39001e0 = new MutableLiveData<>();
        this.f39002f0 = new MutableLiveData<>();
        this.f39003g0 = new MutableLiveData<>();
        this.f39004h0 = new MutableLiveData<>();
        this.f39005i0 = new MutableLiveData<>();
        this.f39006j0 = new MutableLiveData<>();
        this.f39007k0 = new MutableLiveData<>();
        this.f39008l0 = new MutableLiveData<>();
        this.f39009m0 = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.fasttradev2.g0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(FastTradeViewModel.m47269X0());
            }
        });
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ Object m47252H0(FastTradeViewModel fastTradeViewModel, FastTradeFiatCurrency.Response response, boolean z11, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return fastTradeViewModel.m47283G0(response, z11, continuation);
    }

    /* JADX INFO: renamed from: L0 */
    public static final String m47257L0(FastTradeCryptoCurrency.Response response) {
        if (response != null) {
            return response.getTitle();
        }
        return null;
    }

    /* JADX INFO: renamed from: O0 */
    public static final String m47261O0(FastTradeFiatCurrency.Response response) {
        if (response != null) {
            return response.getTitle();
        }
        return null;
    }

    /* JADX INFO: renamed from: V */
    public static final boolean m47267V(FastTradeCryptoCurrency.Response response, FastTradeCryptoCurrency.Response it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getTitle(), response.getTitle());
    }

    /* JADX INFO: renamed from: X */
    public static final boolean m47268X(FastTradeFiatCurrency.Response response, FastTradeFiatCurrency.Response it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getTitle(), response.getTitle());
    }

    /* JADX INFO: renamed from: X0 */
    public static final boolean m47269X0() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C20693b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("payment_android_use_fund_component_key", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    @NotNull
    /* JADX INFO: renamed from: A0 */
    public final LiveData<List<FastTradeCryptoCurrency.Response>> m47277A0() {
        return this.f39005i0;
    }

    @NotNull
    /* JADX INFO: renamed from: B0 */
    public final LiveData<C42875h<Boolean>> m47278B0() {
        return this.f39003g0;
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public final LiveData<C42875h<Boolean>> m47279C0() {
        return this.f39004h0;
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m47280D0() {
        return ((Boolean) this.f39009m0.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: G0 */
    public final Object m47283G0(FastTradeFiatCurrency.Response response, boolean z11, Continuation<? super List<FastTradeCryptoCurrency.Response>> continuation) {
        FastTradeViewModel$loadCryptoCurrencyList$1 fastTradeViewModel$loadCryptoCurrencyList$1;
        List list;
        if (continuation instanceof FastTradeViewModel$loadCryptoCurrencyList$1) {
            fastTradeViewModel$loadCryptoCurrencyList$1 = (FastTradeViewModel$loadCryptoCurrencyList$1) continuation;
            int i11 = fastTradeViewModel$loadCryptoCurrencyList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fastTradeViewModel$loadCryptoCurrencyList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                fastTradeViewModel$loadCryptoCurrencyList$1 = new FastTradeViewModel$loadCryptoCurrencyList$1(this, continuation);
            }
        } else {
            fastTradeViewModel$loadCryptoCurrencyList$1 = new FastTradeViewModel$loadCryptoCurrencyList$1(this, continuation);
        }
        Object obj = fastTradeViewModel$loadCryptoCurrencyList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = fastTradeViewModel$loadCryptoCurrencyList$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            if (response == null) {
                return arrayList;
            }
            IFastRepository iFastRepository = this.f38996Z;
            FastTradeCryptoCurrency.Request request = new FastTradeCryptoCurrency.Request(response.getTitle(), f38995o0, z11, m47280D0() ? "fast_sell" : "");
            fastTradeViewModel$loadCryptoCurrencyList$1.L$0 = SpillingKt.nullOutSpilledVariable(response);
            fastTradeViewModel$loadCryptoCurrencyList$1.L$1 = arrayList;
            fastTradeViewModel$loadCryptoCurrencyList$1.Z$0 = z11;
            fastTradeViewModel$loadCryptoCurrencyList$1.label = 1;
            Object objMo46418P = iFastRepository.mo46418P(request, fastTradeViewModel$loadCryptoCurrencyList$1);
            if (objMo46418P == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objMo46418P;
            list = arrayList;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) fastTradeViewModel$loadCryptoCurrencyList$1.L$1;
            ResultKt.throwOnFailure(obj);
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            Boxing.boxBoolean(list.addAll(C27024b.m66560c((List) ((AbstractC42878k.Success) abstractC42878k).m94040a())));
            return list;
        }
        if (!(abstractC42878k instanceof AbstractC42878k.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        m45659r().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
        return list;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: J0 */
    public final Object m47285J0(Continuation<? super List<FastTradeFiatCurrency.Response>> continuation) {
        FastTradeViewModel$loadFiatCurrencyList$1 fastTradeViewModel$loadFiatCurrencyList$1;
        List list;
        if (continuation instanceof FastTradeViewModel$loadFiatCurrencyList$1) {
            fastTradeViewModel$loadFiatCurrencyList$1 = (FastTradeViewModel$loadFiatCurrencyList$1) continuation;
            int i11 = fastTradeViewModel$loadFiatCurrencyList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fastTradeViewModel$loadFiatCurrencyList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                fastTradeViewModel$loadFiatCurrencyList$1 = new FastTradeViewModel$loadFiatCurrencyList$1(this, continuation);
            }
        } else {
            fastTradeViewModel$loadFiatCurrencyList$1 = new FastTradeViewModel$loadFiatCurrencyList$1(this, continuation);
        }
        Object obj = fastTradeViewModel$loadFiatCurrencyList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = fastTradeViewModel$loadFiatCurrencyList$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            FastTradeFiatCurrency.Request request = new FastTradeFiatCurrency.Request("FIAT", f38995o0);
            IFastRepository iFastRepository = this.f38996Z;
            fastTradeViewModel$loadFiatCurrencyList$1.L$0 = arrayList;
            fastTradeViewModel$loadFiatCurrencyList$1.L$1 = SpillingKt.nullOutSpilledVariable(request);
            fastTradeViewModel$loadFiatCurrencyList$1.label = 1;
            Object objMo46420T = iFastRepository.mo46420T(request, fastTradeViewModel$loadFiatCurrencyList$1);
            if (objMo46420T == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = arrayList;
            obj = objMo46420T;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) fastTradeViewModel$loadFiatCurrencyList$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            Boxing.boxBoolean(list.addAll(C27024b.m66560c((List) ((AbstractC42878k.Success) abstractC42878k).m94040a())));
            return list;
        }
        if (!(abstractC42878k instanceof AbstractC42878k.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        m45659r().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
        return list;
    }

    /* JADX INFO: renamed from: K0 */
    public final void m47286K0() {
        ArrayList arrayList;
        StorageId<List<FastTradeCryptoCurrency.Response>> storageIdM49829g = PaymentStorageId.f40364a.m49829g();
        List<FastTradeCryptoCurrency.Response> value = this.f39002f0.getValue();
        if (value != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                arrayList.add(((FastTradeCryptoCurrency.Response) it.next()).getTitle());
            }
        } else {
            arrayList = null;
        }
        m47287M0(storageIdM49829g, arrayList, this.f39007k0, new Function1() { // from class: com.kubi.payment.fasttradev2.e0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FastTradeViewModel.m47257L0((FastTradeCryptoCurrency.Response) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N0 */
    public final void m47288N0() {
        ArrayList arrayList;
        StorageId<List<FastTradeFiatCurrency.Response>> storageIdM49830h = PaymentStorageId.f40364a.m49830h();
        List<ItemFiatCurrency> value = this.f38999c0.getValue();
        if (value != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                arrayList.add(((ItemFiatCurrency) it.next()).getFiatCurrency().getTitle());
            }
        } else {
            arrayList = null;
        }
        m47287M0(storageIdM49830h, arrayList, this.f39006j0, new Function1() { // from class: com.kubi.payment.fasttradev2.f0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FastTradeViewModel.m47261O0((FastTradeFiatCurrency.Response) obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: R0 */
    public final Object m47291R0(Continuation<? super Unit> continuation) {
        FastTradeViewModel$realRequestCouponInfo$1 fastTradeViewModel$realRequestCouponInfo$1;
        if (continuation instanceof FastTradeViewModel$realRequestCouponInfo$1) {
            fastTradeViewModel$realRequestCouponInfo$1 = (FastTradeViewModel$realRequestCouponInfo$1) continuation;
            int i11 = fastTradeViewModel$realRequestCouponInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fastTradeViewModel$realRequestCouponInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                fastTradeViewModel$realRequestCouponInfo$1 = new FastTradeViewModel$realRequestCouponInfo$1(this, continuation);
            }
        } else {
            fastTradeViewModel$realRequestCouponInfo$1 = new FastTradeViewModel$realRequestCouponInfo$1(this, continuation);
        }
        Object objMo46429j = fastTradeViewModel$realRequestCouponInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = fastTradeViewModel$realRequestCouponInfo$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objMo46429j);
            IFastRepository iFastRepository = this.f38996Z;
            FastTradeFiatCurrency.Response value = this.f39000d0.getValue();
            String title = value != null ? value.getTitle() : null;
            FastTradeCryptoCurrency.Response value2 = this.f39001e0.getValue();
            FiatCouponInfo.Request request = new FiatCouponInfo.Request("FAST_BUY", title, value2 != null ? value2.getTitle() : null);
            fastTradeViewModel$realRequestCouponInfo$1.label = 1;
            objMo46429j = iFastRepository.mo46429j(request, fastTradeViewModel$realRequestCouponInfo$1);
            if (objMo46429j == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objMo46429j);
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) objMo46429j;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            this.f39008l0.setValue((FiatCouponInfo.Response) ((AbstractC42878k.Success) abstractC42878k).m94040a());
        } else {
            if (!(abstractC42878k instanceof AbstractC42878k.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            m45659r().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m47292S0(@NotNull FiatCouponInfo.Response info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f39008l0.setValue(info);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:54:0x0104  */
    /* JADX WARN: Code duplicated, block: B:57:0x010e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014c, code lost:
    
        if (m47306f0(r5, r14, r6, r4) == r0) goto L65;
     */
    /* JADX INFO: renamed from: T0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m47293T0(FastTradeFiatCurrency.Response response, Continuation<? super Unit> continuation) {
        FastTradeViewModel$updateCryptoCurrencyList$1 fastTradeViewModel$updateCryptoCurrencyList$1;
        FastTradeViewModel fastTradeViewModel;
        FastTradeFiatCurrency.Response response2;
        Object next;
        FastTradeCryptoCurrency.Response response3;
        FastTradeCryptoCurrency.Response response4;
        String subTitle;
        String subTitle2;
        String iconUrl;
        String iconUrl2;
        if (continuation instanceof FastTradeViewModel$updateCryptoCurrencyList$1) {
            fastTradeViewModel$updateCryptoCurrencyList$1 = (FastTradeViewModel$updateCryptoCurrencyList$1) continuation;
            int i11 = fastTradeViewModel$updateCryptoCurrencyList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fastTradeViewModel$updateCryptoCurrencyList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                fastTradeViewModel$updateCryptoCurrencyList$1 = new FastTradeViewModel$updateCryptoCurrencyList$1(this, continuation);
            }
        } else {
            fastTradeViewModel$updateCryptoCurrencyList$1 = new FastTradeViewModel$updateCryptoCurrencyList$1(this, continuation);
        }
        FastTradeViewModel$updateCryptoCurrencyList$1 fastTradeViewModel$updateCryptoCurrencyList$2 = fastTradeViewModel$updateCryptoCurrencyList$1;
        Object objM47252H0 = fastTradeViewModel$updateCryptoCurrencyList$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = fastTradeViewModel$updateCryptoCurrencyList$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM47252H0);
            fastTradeViewModel$updateCryptoCurrencyList$2.L$0 = SpillingKt.nullOutSpilledVariable(response);
            fastTradeViewModel$updateCryptoCurrencyList$2.label = 1;
            fastTradeViewModel = this;
            objM47252H0 = m47252H0(fastTradeViewModel, response, false, fastTradeViewModel$updateCryptoCurrencyList$2, 2, null);
            if (objM47252H0 != coroutine_suspended) {
                response2 = response;
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM47252H0);
                return Unit.INSTANCE;
            }
            response4 = (FastTradeCryptoCurrency.Response) fastTradeViewModel$updateCryptoCurrencyList$2.L$3;
            response3 = (FastTradeCryptoCurrency.Response) fastTradeViewModel$updateCryptoCurrencyList$2.L$2;
            ResultKt.throwOnFailure(objM47252H0);
            fastTradeViewModel = this;
            subTitle = response4.getSubTitle();
            if (response3 != null) {
                subTitle2 = response3.getSubTitle();
            } else {
                subTitle2 = null;
            }
            if (Intrinsics.areEqual(subTitle, subTitle2)) {
                iconUrl = response4.getIconUrl();
                if (response3 != null) {
                    iconUrl2 = response3.getIconUrl();
                } else {
                    iconUrl2 = null;
                }
                if (Intrinsics.areEqual(iconUrl, iconUrl2)) {
                    if (!Intrinsics.areEqual(response4.isSupportRecurring(), response3 != null ? response3.isSupportRecurring() : null)) {
                        response4.setSelected(true);
                        fastTradeViewModel.f39001e0.setValue(response4);
                    }
                } else {
                    response4.setSelected(true);
                    fastTradeViewModel.f39001e0.setValue(response4);
                }
            } else {
                response4.setSelected(true);
                fastTradeViewModel.f39001e0.setValue(response4);
            }
            return Unit.INSTANCE;
        }
        response2 = (FastTradeFiatCurrency.Response) fastTradeViewModel$updateCryptoCurrencyList$2.L$0;
        ResultKt.throwOnFailure(objM47252H0);
        fastTradeViewModel = this;
        List<FastTradeCryptoCurrency.Response> list = (List) objM47252H0;
        FastTradeCryptoCurrency.Response value = fastTradeViewModel.f39001e0.getValue();
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((FastTradeCryptoCurrency.Response) next).getTitle(), value != null ? value.getTitle() : null));
        FastTradeCryptoCurrency.Response response5 = (FastTradeCryptoCurrency.Response) next;
        if (response5 != null) {
            MutableLiveData<List<FastTradeCryptoCurrency.Response>> mutableLiveData = fastTradeViewModel.f39002f0;
            fastTradeViewModel$updateCryptoCurrencyList$2.L$0 = SpillingKt.nullOutSpilledVariable(response2);
            fastTradeViewModel$updateCryptoCurrencyList$2.L$1 = SpillingKt.nullOutSpilledVariable(list);
            fastTradeViewModel$updateCryptoCurrencyList$2.L$2 = value;
            fastTradeViewModel$updateCryptoCurrencyList$2.L$3 = response5;
            fastTradeViewModel$updateCryptoCurrencyList$2.label = 2;
            if (m47306f0(value, list, mutableLiveData, fastTradeViewModel$updateCryptoCurrencyList$2) != coroutine_suspended) {
                response3 = value;
                response4 = response5;
                subTitle = response4.getSubTitle();
                if (response3 != null) {
                    subTitle2 = response3.getSubTitle();
                } else {
                    subTitle2 = null;
                }
                if (Intrinsics.areEqual(subTitle, subTitle2)) {
                    iconUrl = response4.getIconUrl();
                    if (response3 != null) {
                        iconUrl2 = response3.getIconUrl();
                    } else {
                        iconUrl2 = null;
                    }
                    if (Intrinsics.areEqual(iconUrl, iconUrl2)) {
                        if (!Intrinsics.areEqual(response4.isSupportRecurring(), response3 != null ? response3.isSupportRecurring() : null)) {
                            response4.setSelected(true);
                            fastTradeViewModel.f39001e0.setValue(response4);
                        }
                    } else {
                        response4.setSelected(true);
                        fastTradeViewModel.f39001e0.setValue(response4);
                    }
                } else {
                    response4.setSelected(true);
                    fastTradeViewModel.f39001e0.setValue(response4);
                }
                return Unit.INSTANCE;
            }
        } else {
            FastTradeCryptoCurrency.Response response6 = (FastTradeCryptoCurrency.Response) CollectionsKt.firstOrNull((List) list);
            if (response6 != null) {
                fastTradeViewModel.f39001e0.setValue(response6);
            }
            MutableLiveData<List<FastTradeCryptoCurrency.Response>> mutableLiveData2 = fastTradeViewModel.f39002f0;
            fastTradeViewModel$updateCryptoCurrencyList$2.L$0 = SpillingKt.nullOutSpilledVariable(response2);
            fastTradeViewModel$updateCryptoCurrencyList$2.L$1 = SpillingKt.nullOutSpilledVariable(list);
            fastTradeViewModel$updateCryptoCurrencyList$2.L$2 = SpillingKt.nullOutSpilledVariable(value);
            fastTradeViewModel$updateCryptoCurrencyList$2.L$3 = SpillingKt.nullOutSpilledVariable(response5);
            fastTradeViewModel$updateCryptoCurrencyList$2.L$4 = SpillingKt.nullOutSpilledVariable(response6);
            fastTradeViewModel$updateCryptoCurrencyList$2.label = 3;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: U */
    public final void m47294U(@NotNull final FastTradeCryptoCurrency.Response cryptoCurrency) {
        Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
        m47299Y(PaymentStorageId.f40364a.m49829g(), cryptoCurrency, this.f39007k0.getValue(), new Function1() { // from class: com.kubi.payment.fasttradev2.i0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(FastTradeViewModel.m47267V(cryptoCurrency, (FastTradeCryptoCurrency.Response) obj));
            }
        });
    }

    /* JADX INFO: renamed from: U0 */
    public final void m47295U0(@Nullable FastTradeCryptoCurrency.Response response, boolean z11) {
        if (response == null) {
            return;
        }
        FastTradeCryptoCurrency.Response value = this.f39001e0.getValue();
        if (value == null || !Intrinsics.areEqual(value, response)) {
            this.f39001e0.setValue(response);
            for (FastTradeCryptoCurrency.Response response2 : C27024b.m66560c(this.f39002f0.getValue())) {
                response2.setSelected(Intrinsics.areEqual(response2.getTitle(), response.getTitle()));
            }
            if (z11) {
                C46392a.m102333p(PaymentStorageId.f40364a.m49831i(), C27041f.m66668h(response.getTitle()));
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m47297W(@NotNull final FastTradeFiatCurrency.Response fiatCurrency) {
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        m47299Y(PaymentStorageId.f40364a.m49830h(), fiatCurrency, this.f39006j0.getValue(), new Function1() { // from class: com.kubi.payment.fasttradev2.h0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(FastTradeViewModel.m47268X(fiatCurrency, (FastTradeFiatCurrency.Response) obj));
            }
        });
    }

    /* JADX INFO: renamed from: W0 */
    public final void m47298W0(@Nullable String str, @Nullable String str2) {
        this.f38997a0 = str;
        this.f38998b0 = str2;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m47303c0() {
        m47305e0(PaymentStorageId.f40364a.m49829g(), this.f39007k0);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m47304d0() {
        m47305e0(PaymentStorageId.f40364a.m49830h(), this.f39006j0);
    }

    /* JADX INFO: renamed from: h0 */
    public final String m47308h0() {
        String strMo45625e;
        Object objM56186h = Router.f46192a.m56186h(IPaymentSiteService.class, SiteInfoManager.f47913a.m58109c());
        return (objM56186h == null || (strMo45625e = ((IPaymentSiteService) objM56186h).mo45625e()) == null) ? "USDT" : strMo45625e;
    }

    /* JADX INFO: renamed from: j0 */
    public final FastTradeCryptoCurrency.Response m47310j0(List<FastTradeCryptoCurrency.Response> list) {
        Object next;
        String strM66669i = "";
        try {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((FastTradeCryptoCurrency.Response) it.next()).getTitle());
            }
            String strM102326h = C46392a.m102326h(PaymentStorageId.f40364a.m49831i(), "");
            if (C27041f.m66668h(this.f38998b0).length() > 0) {
                if (arrayList.contains(this.f38998b0)) {
                    strM66669i = C27041f.m66668h(this.f38998b0);
                }
            } else if (strM102326h.length() <= 0) {
                strM102326h = m47308h0();
                if (arrayList.contains(strM102326h)) {
                    strM66669i = strM102326h;
                }
            } else if (arrayList.contains(strM102326h)) {
                strM66669i = strM102326h;
            }
            if (C27041f.m66668h(strM66669i).length() == 0) {
                strM66669i = C27041f.m66669i((String) CollectionsKt.firstOrNull((List) arrayList), "USDT");
            }
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.areEqual(((FastTradeCryptoCurrency.Response) next).getTitle(), strM66669i)) {
                    return (FastTradeCryptoCurrency.Response) next;
                }
            }
            next = null;
            return (FastTradeCryptoCurrency.Response) next;
        } catch (Exception e11) {
            C43846g.m96568c(new OtcException(e11, "FastTradeViewModel.updateSelectedFiatCurrency", false, null, 8, null), null, 2, null);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v26, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v6, types: [T, java.lang.String] */
    /* JADX INFO: renamed from: l0 */
    public final Object m47311l0(List<FastTradeFiatCurrency.Response> list, Continuation<? super FastTradeFiatCurrency.Response> continuation) {
        FastTradeViewModel$findSelectedFiatCurrency$1 fastTradeViewModel$findSelectedFiatCurrency$1;
        List<FastTradeFiatCurrency.Response> list2;
        Ref.ObjectRef objectRef;
        List list3;
        if (continuation instanceof FastTradeViewModel$findSelectedFiatCurrency$1) {
            fastTradeViewModel$findSelectedFiatCurrency$1 = (FastTradeViewModel$findSelectedFiatCurrency$1) continuation;
            int i11 = fastTradeViewModel$findSelectedFiatCurrency$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fastTradeViewModel$findSelectedFiatCurrency$1.label = i11 - Integer.MIN_VALUE;
            } else {
                fastTradeViewModel$findSelectedFiatCurrency$1 = new FastTradeViewModel$findSelectedFiatCurrency$1(this, continuation);
            }
        } else {
            fastTradeViewModel$findSelectedFiatCurrency$1 = new FastTradeViewModel$findSelectedFiatCurrency$1(this, continuation);
        }
        FastTradeViewModel$findSelectedFiatCurrency$1 fastTradeViewModel$findSelectedFiatCurrency$2 = fastTradeViewModel$findSelectedFiatCurrency$1;
        Object objM47281E0 = fastTradeViewModel$findSelectedFiatCurrency$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = fastTradeViewModel$findSelectedFiatCurrency$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM47281E0);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = "";
            ArrayList arrayList = new ArrayList();
            try {
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (FastTradeFiatCurrency.Response response : list) {
                    arrayList2.add(C27041f.m66668h(response != null ? response.getTitle() : null));
                }
                arrayList.addAll(arrayList2);
            } catch (Exception e11) {
                C43846g.m96568c(new OtcException(e11, "FastTradeViewModel", false, null, 8, null), null, 2, null);
            }
            fastTradeViewModel$findSelectedFiatCurrency$2.L$0 = list;
            fastTradeViewModel$findSelectedFiatCurrency$2.L$1 = objectRef2;
            fastTradeViewModel$findSelectedFiatCurrency$2.L$2 = arrayList;
            fastTradeViewModel$findSelectedFiatCurrency$2.label = 1;
            objM47281E0 = m47281E0(fastTradeViewModel$findSelectedFiatCurrency$2);
            if (objM47281E0 == coroutine_suspended) {
                return coroutine_suspended;
            }
            list2 = list;
            objectRef = objectRef2;
            list3 = arrayList;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list4 = (List) fastTradeViewModel$findSelectedFiatCurrency$2.L$2;
            objectRef = (Ref.ObjectRef) fastTradeViewModel$findSelectedFiatCurrency$2.L$1;
            list2 = (List) fastTradeViewModel$findSelectedFiatCurrency$2.L$0;
            ResultKt.throwOnFailure(objM47281E0);
            list3 = list4;
        }
        ?? r11 = (String) objM47281E0;
        if (C27041f.m66668h(this.f38997a0).length() > 0) {
            if (CollectionsKt.contains(list3, this.f38997a0)) {
                objectRef.element = C27041f.m66668h(this.f38997a0);
            }
        } else if (r11.length() <= 0) {
            ?? M47309i0 = m47309i0();
            if (list3.contains(M47309i0)) {
                objectRef.element = M47309i0;
            }
        } else if (list3.contains(r11)) {
            objectRef.element = r11;
        }
        if (C27041f.m66668h((String) objectRef.element).length() == 0) {
            objectRef.element = C27041f.m66669i((String) CollectionsKt.firstOrNull(list3), IPaymentSiteService.Companion.EUR);
        }
        for (Object obj : list2) {
            FastTradeFiatCurrency.Response response2 = (FastTradeFiatCurrency.Response) obj;
            if (Intrinsics.areEqual(response2 != null ? response2.getTitle() : null, objectRef.element)) {
                return obj;
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final LiveData<List<FastTradeCryptoCurrency.Response>> m47312m0() {
        return this.f39002f0;
    }

    @NotNull
    /* JADX INFO: renamed from: n0 */
    public final LiveData<List<FastTradeCryptoCurrency.Response>> m47313n0() {
        List<FastTradeCryptoCurrency.Response> value = this.f39007k0.getValue();
        if (value != null) {
            value.clear();
        }
        return this.f39007k0;
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    public final LiveData<FiatCouponInfo.Response> m47314o0() {
        return this.f39008l0;
    }

    @NotNull
    /* JADX INFO: renamed from: p0 */
    public final LiveData<List<ItemFiatCurrency>> m47315p0() {
        return this.f38999c0;
    }

    @NotNull
    /* JADX INFO: renamed from: q0 */
    public final LiveData<List<FastTradeFiatCurrency.Response>> m47316q0() {
        List<FastTradeFiatCurrency.Response> value = this.f39006j0.getValue();
        if (value != null) {
            value.clear();
        }
        return this.f39006j0;
    }

    @NotNull
    /* JADX INFO: renamed from: y0 */
    public final LiveData<FastTradeCryptoCurrency.Response> m47318y0() {
        return this.f39001e0;
    }

    @NotNull
    /* JADX INFO: renamed from: z0 */
    public final LiveData<FastTradeFiatCurrency.Response> m47319z0() {
        return this.f39000d0;
    }

    /* JADX INFO: renamed from: E0 */
    public final Object m47281E0(Continuation<? super String> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new FastTradeViewModel$loadCacheFiatCurrency$2(null), continuation);
    }

    /* JADX INFO: renamed from: F0 */
    public final Object m47282F0(Continuation<? super List<FastTradeFiatCurrency.Response>> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new FastTradeViewModel$loadCacheFiatCurrencyList$2(null), continuation);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m47284I0() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new FastTradeViewModel$loadFiatCouponInfo$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: M0 */
    public final <T extends Parcelable> void m47287M0(StorageId<List<T>> storageId, List<String> list, MutableLiveData<List<T>> mutableLiveData, Function1<? super T, String> function1) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new FastTradeViewModel$loadHistoryCurrencyList$1(this, storageId, list, mutableLiveData, function1, null), 3, null);
    }

    /* JADX INFO: renamed from: P0 */
    public final void m47289P0() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new FastTradeViewModel$loadSellCryptoCurrencyList$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m47290Q0() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), new C20692a(CoroutineExceptionHandler.INSTANCE), null, new FastTradeViewModel$loadTradingPair$2(this, null), 2, null);
    }

    /* JADX INFO: renamed from: V0 */
    public final void m47296V0(@Nullable FastTradeFiatCurrency.Response response, boolean z11) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new FastTradeViewModel$updateSelectedFiatCurrency$1(response, this, z11, null), 3, null);
    }

    /* JADX INFO: renamed from: Y */
    public final <T extends Parcelable> void m47299Y(StorageId<List<T>> storageId, T t11, List<? extends T> list, Function1<? super T, Boolean> function1) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new FastTradeViewModel$addToHistory$1(list, function1, t11, this, storageId, null), 3, null);
    }

    /* JADX INFO: renamed from: Z */
    public final Object m47300Z(String str, Continuation<? super Unit> continuation) {
        Object objM91049g = C41686h.m91049g(C42911a.m94120b(), new FastTradeViewModel$cacheFiatCurrency$2(str, null), continuation);
        if (objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91049g;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a0 */
    public final Object m47301a0(List<FastTradeFiatCurrency.Response> list, Continuation<? super Unit> continuation) {
        Object objM91049g = C41686h.m91049g(C42911a.m94120b(), new FastTradeViewModel$cacheFiatCurrencyList$2(list, null), continuation);
        if (objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91049g;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b0 */
    public final <T extends Parcelable> Object m47302b0(StorageId<List<T>> storageId, List<? extends T> list, Continuation<? super Unit> continuation) {
        Object objM91049g = C41686h.m91049g(C42911a.m94120b(), new FastTradeViewModel$cacheHistoryCurrency$2(storageId, list, null), continuation);
        if (objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91049g;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e0 */
    public final <T> void m47305e0(StorageId<List<T>> storageId, MutableLiveData<List<T>> mutableLiveData) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new FastTradeViewModel$clearHistory$1(storageId, mutableLiveData, null), 3, null);
    }

    /* JADX INFO: renamed from: f0 */
    public final Object m47306f0(FastTradeCryptoCurrency.Response response, List<FastTradeCryptoCurrency.Response> list, MutableLiveData<List<FastTradeCryptoCurrency.Response>> mutableLiveData, Continuation<? super Unit> continuation) {
        Object objM91049g = C41686h.m91049g(C42911a.m94119a(), new FastTradeViewModel$convertToItemFastTradeCryptoCurrencyList$2(list, mutableLiveData, response, null), continuation);
        if (objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91049g;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g0 */
    public final Object m47307g0(FastTradeFiatCurrency.Response response, List<FastTradeFiatCurrency.Response> list, Continuation<? super Unit> continuation) {
        Object objM91049g = C41686h.m91049g(C42911a.m94119a(), new FastTradeViewModel$convertToItemFastTradeFiatCurrencyList$2(this, list, response, null), continuation);
        if (objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91049g;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i0 */
    public final String m47309i0() {
        String strMo45622b;
        String strM89965c = C41016c.m89965c();
        if (strM89965c != null && strM89965c.length() != 0) {
            return strM89965c;
        }
        Object objM56186h = Router.f46192a.m56186h(IPaymentSiteService.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null && (strMo45622b = ((IPaymentSiteService) objM56186h).mo45622b()) != null) {
            return strMo45622b;
        }
        return IPaymentSiteService.Companion.EUR;
    }

    /* JADX INFO: renamed from: x0 */
    public final <T extends Parcelable> Object m47317x0(StorageId<List<T>> storageId, Continuation<? super List<? extends T>> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new FastTradeViewModel$getHistoryCurrency$2(storageId, null), continuation);
    }
}
