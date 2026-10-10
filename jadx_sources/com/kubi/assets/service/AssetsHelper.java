package com.kubi.assets.service;

import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.gson.reflect.TypeToken;
import com.kubi.assets.AssetRemoteConfig;
import com.kubi.assets.AssetRnBundle;
import com.kubi.assets.AssetRnRouteConfig;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.R$string;
import com.kubi.assets.detail.RecordDetailFragment;
import com.kubi.assets.dialog.payment.C9835j;
import com.kubi.assets.entity.B2CConfig;
import com.kubi.assets.entity.B2CLoanEntity;
import com.kubi.assets.entity.SmallEntity;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.data.coin.TransferJumper;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.helpcenter.api.CustomerServiceType;
import com.kubi.helpcenter.api.local.IHelpCenterService;
import com.kubi.mvi.common.MviExKt;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.p110rn.Constants;
import com.kubi.payment.channel.data.entities.ChannelKycRequest;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.flutter.KCFlutterRouteManager;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27099x;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37749a;
import g00.InterfaceC37758j;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.flow.InterfaceC41634e;
import lb.C42153h;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026ay.C4400a;
import p311hf.C38184b;
import p402kf.C41014a;
import p569qq.C43841b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: AssetsHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u000eJ\u0012\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0012\u0010\u0014\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0006\u0010\u0015\u001a\u00020\u000eJ&\u0010\u0016\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aJ$\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013JD\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u00132\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u001f\u001a\u00020\u00132\b\b\u0002\u0010 \u001a\u00020\u00132\b\b\u0002\u0010!\u001a\u00020\u001a2\b\b\u0002\u0010\"\u001a\u00020\u0013J\u001c\u0010#\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u00132\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0012\u0010$\u001a\u00020\u000e2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0013J\u0006\u0010&\u001a\u00020\u000eJ\b\u0010'\u001a\u00020\u000eH\u0002J\b\u0010(\u001a\u00020\u000eH\u0002J$\u0010)\u001a\u00020\u000e2\b\b\u0002\u0010*\u001a\u00020\u00132\b\b\u0002\u0010+\u001a\u00020\u00132\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\u0018\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020\u001aJ\u0018\u00100\u001a\u00020\u000e2\u0010\b\u0002\u00101\u001a\n\u0012\u0004\u0012\u000203\u0018\u000102J \u00100\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u00132\b\b\u0002\u00104\u001a\u00020\u001aJ\"\u00105\u001a\u00020\u000e2\u0006\u00106\u001a\u0002072\n\b\u0002\u00108\u001a\u0004\u0018\u0001092\u0006\u0010:\u001a\u00020;J\u0010\u0010<\u001a\u00020\u000e2\b\u0010=\u001a\u0004\u0018\u00010>J\u0006\u0010?\u001a\u00020\u000eJ\u0006\u0010@\u001a\u00020AJ\u0006\u0010B\u001a\u00020\u001aJ\u0006\u0010C\u001a\u00020\u0013J\u0014\u0010J\u001a\b\u0012\u0004\u0012\u00020F02H\u0086@¢\u0006\u0002\u0010KJ\"\u0010L\u001a\u00020\u000e2\u0012\b\u0002\u0010M\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010I\u0018\u00010NH\u0086@¢\u0006\u0002\u0010OJ\u0018\u0010P\u001a\u00020\u000e2\b\u0010Q\u001a\u0004\u0018\u00010R2\u0006\u0010S\u001a\u00020TJ\u0006\u0010U\u001a\u00020\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010D\u001a\u0012\u0012\u0004\u0012\u00020F0Ej\b\u0012\u0004\u0012\u00020F`GX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020IX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006V"}, m90084d2 = {"Lcom/kubi/assets/service/AssetsHelper;", "", "<init>", "()V", "smallCoin", "Lcom/kubi/assets/entity/SmallEntity;", "getSmallCoin", "()Lcom/kubi/assets/entity/SmallEntity;", "setSmallCoin", "(Lcom/kubi/assets/entity/SmallEntity;)V", "smallCoinKcs", "getSmallCoinKcs", "setSmallCoinKcs", "getSmallCoinConfig", "", "getSmallCoinConfigKcs", "getAlphaAccountVisible", "toP2P", "spmId", "", "toBuy", "toRecord", "toDeposit", "tabIndex", "", "canDialog", "", "jumpRnWithdraw", "coin", "address", "jumpRnWithdrawCoinPicker", "platFrom", "tabMark", "isShowFiat", "page", "jumpRnDeposit", "jumpRnSmallCoinExchange", "accountType", "toWithdraw", "toDepositAssetPayment", "toWithdrawAssetPayment", "toTransfer", "from", TypedValues.TransitionType.S_TO, "showSmallTipsDialog", "fragment", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "isMargin", "toCovert", "fromList", "", "Lcom/kubi/data/entity/CoinInfoEntity;", "isWithdraw", "scroll2TopAndRefresh", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "appBar", "Lcom/google/android/material/appbar/AppBarLayout;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Action;", "toHelpChat", "activity", "Landroidx/fragment/app/FragmentActivity;", "toCustomerService", "getUserInfo", "Lcom/kubi/user/model/LoginUserEntity;", "isSubAccountWithTip", "getMode", "b2cProductList", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/B2CLoanEntity;", "Lkotlin/collections/ArrayList;", "b2cConfig", "Lcom/kubi/assets/entity/B2CConfig;", "fetchB2cCurrenciesOrCache", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchB2cConfig", "function", "Lio/reactivex/functions/Consumer;", "(Lio/reactivex/functions/Consumer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "goRecordDetail", "context", "Landroid/content/Context;", "accountDetailEntity", "Landroid/os/Parcelable;", "toInOutDetailPage", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetsHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetsHelper.kt\ncom/kubi/assets/service/AssetsHelper\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n*L\n1#1,584:1\n35#2,4:585\n39#2:591\n44#3,2:589\n32#4:592\n135#4,2:593\n1056#5:595\n1#6:596\n1#6:598\n25#7:597\n26#7:599\n*S KotlinDebug\n*F\n+ 1 AssetsHelper.kt\ncom/kubi/assets/service/AssetsHelper\n*L\n88#1:585,4\n88#1:591\n88#1:589,2\n99#1:592\n117#1:593,2\n353#1:595\n506#1:598\n506#1:597\n506#1:599\n*E\n"})
public final class AssetsHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AssetsHelper f18684a = new AssetsHelper();

    /* JADX INFO: renamed from: b */
    @Nullable
    public static SmallEntity f18685b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public static SmallEntity f18686c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final ArrayList<B2CLoanEntity> f18687d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static B2CConfig f18688e;

    /* JADX INFO: renamed from: com.kubi.assets.service.AssetsHelper$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C10914a extends TypeToken<Integer> {
    }

    /* JADX INFO: renamed from: com.kubi.assets.service.AssetsHelper$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 AssetsHelper.kt\ncom/kubi/assets/service/AssetsHelper\n*L\n1#1,328:1\n353#2:329\n*E\n"})
    public static final class C10915b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            CoinInfoEntity coinInfoEntity = (CoinInfoEntity) t11;
            CoinInfoEntity coinInfoEntity2 = (CoinInfoEntity) t12;
            return ComparisonsKt.compareValues(Double.valueOf(-C41014a.m89939m(coinInfoEntity.getAvailableBalance(), coinInfoEntity.getCode())), Double.valueOf(-C41014a.m89939m(coinInfoEntity2.getAvailableBalance(), coinInfoEntity2.getCode())));
        }
    }

    static {
        BigDecimal bigDecimal = new BigDecimal("1");
        C38184b c38184b = C38184b.f85884a;
        f18685b = new SmallEntity(bigDecimal, c38184b.m86146a());
        f18686c = new SmallEntity(new BigDecimal("5"), c38184b.m86146a());
        f18687d = new ArrayList<>();
        f18688e = new B2CConfig(null, null, null, 7, null);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m19136C(AssetsHelper assetsHelper, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        assetsHelper.m19149A(str, str2, z11);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m19137F(AssetsHelper assetsHelper, String str, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = null;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            z11 = true;
        }
        assetsHelper.m19152E(str, i11, z11);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m19138K(AssetsHelper assetsHelper, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        assetsHelper.m19156J(str);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m19139N(AssetsHelper assetsHelper, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "MAIN";
        }
        if ((i11 & 2) != 0) {
            str2 = "TRADE";
        }
        if ((i11 & 4) != 0) {
            str3 = "";
        }
        assetsHelper.m19158M(str, str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m19143e(AssetsHelper assetsHelper, Consumer consumer, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            consumer = null;
        }
        return assetsHelper.m19161d(consumer, continuation);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m19144o(AssetsHelper assetsHelper, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        assetsHelper.m19170n(str, str2);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m19145s(AssetsHelper assetsHelper, String str, String str2, String str3, String str4, boolean z11, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        if ((i11 & 4) != 0) {
            str3 = "";
        }
        if ((i11 & 8) != 0) {
            str4 = "";
        }
        if ((i11 & 16) != 0) {
            z11 = true;
        }
        if ((i11 & 32) != 0) {
            str5 = "default";
        }
        assetsHelper.m19173r(str, str2, str3, str4, z11, str5);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m19146u(AssetsHelper assetsHelper, RecyclerView recyclerView, AppBarLayout appBarLayout, Action action, int i11, Object obj) throws Exception {
        if ((i11 & 2) != 0) {
            appBarLayout = null;
        }
        assetsHelper.m19174t(recyclerView, appBarLayout, action);
    }

    /* JADX INFO: renamed from: v */
    public static final void m19147v(AppBarLayout.Behavior behavior, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        behavior.setTopAndBottomOffset(((Integer) animatedValue).intValue());
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m19148y(AssetsHelper assetsHelper, OldBaseFragment oldBaseFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        assetsHelper.m19176x(oldBaseFragment, z11);
    }

    /* JADX INFO: renamed from: A */
    public final void m19149A(@NotNull String from, @NotNull String to2, boolean z11) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to2, "to");
        if (Intrinsics.areEqual(from, C38184b.f85884a.m86146a())) {
            from = "BTC";
        }
        C4400a c4400aM4038a = Router.f46192a.m56184f("krn/router").m4038a(Constants.BIZ, "convert").m4038a("entry", "main").m4038a(Constants.COMPONENT, "kucoin_convert_rn").m4038a("route", Uri.encode("ConvertPage?from=" + from + "&to=" + to2));
        if (z11) {
            c4400aM4038a = c4400aM4038a.m4038a("type", ChannelKycRequest.SCENE_WITHDRAW);
        }
        c4400aM4038a.m4048k();
    }

    /* JADX INFO: renamed from: B */
    public final void m19150B(@Nullable List<? extends CoinInfoEntity> list) {
        String str;
        String code;
        String code2 = "BTC";
        if (list == null || list.isEmpty()) {
            str = code2;
        } else {
            List listSortedWith = CollectionsKt.sortedWith(list, new C10915b());
            CoinInfoEntity coinInfoEntity = (CoinInfoEntity) CollectionsKt.firstOrNull(listSortedWith);
            if (coinInfoEntity != null) {
                code = coinInfoEntity.getCode();
                Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
            } else {
                code = "BTC";
            }
            if (Intrinsics.areEqual(code, C38184b.f85884a.m86146a())) {
                if (listSortedWith.size() > 1) {
                    code2 = ((CoinInfoEntity) listSortedWith.get(1)).getCode();
                    Intrinsics.checkNotNull(code2);
                }
                str = code2;
            } else {
                str = code;
            }
        }
        m19136C(this, str, C38184b.f85884a.m86146a(), false, 4, null);
    }

    /* JADX INFO: renamed from: D */
    public final void m19151D() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(AssetsDepend.f18689a.m19182b().mo28946b());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            Router.f46192a.m56184f((String) objM103844constructorimpl).m4048k();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m19153G() {
        InterfaceC37749a.a.m85107b(C37304a.f82764a, FastQuoteModel.PAY_RECHARGE, "ASSET", null, null, null, 28, null);
    }

    /* JADX INFO: renamed from: H */
    public final void m19154H(@Nullable FragmentActivity fragmentActivity) {
        if (fragmentActivity != null) {
            IHelpCenterService.f25326a.get().mo1474d(fragmentActivity, null, CustomerServiceType.ASSETS);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m19155I() {
        String balanceCurrency = AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency();
        Locale locale = Locale.ROOT;
        String lowerCase = balanceCurrency.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String lowerCase2 = "KCS".toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        if (Intrinsics.areEqual(lowerCase, lowerCase2)) {
            balanceCurrency = C38184b.f85884a.m86146a();
        }
        KCFlutterRouteManager.m56839j(KCFlutterRouteManager.f46704a, "in_out_stats?baseCurrency=" + balanceCurrency, false, null, 6, null);
    }

    /* JADX INFO: renamed from: J */
    public final void m19156J(@Nullable String str) {
        C4400a c4400aM56184f = Router.f46192a.m56184f("otc?type=0");
        if (str != null) {
            c4400aM56184f.m4038a("spm", str);
        }
        c4400aM56184f.m4048k();
    }

    /* JADX INFO: renamed from: L */
    public final void m19157L() {
        InterfaceC37749a.a.m85114i(C37304a.f82764a, null, null, null, null, null, 31, null);
    }

    /* JADX INFO: renamed from: M */
    public final void m19158M(@NotNull String from, @NotNull String to2, @NotNull String spmId) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to2, "to");
        Intrinsics.checkNotNullParameter(spmId, "spmId");
        C43841b.m96557d("b1overview_transfer_load", "page_load_start", null, 4, null);
        TransferJumper.Companion.jumpToTransfer$default(TransferJumper.f21427a, (Intrinsics.areEqual("OPTION", from) || Intrinsics.areEqual("OPTION", to2)) ? "USDT" : C38184b.f85884a.m86146a(), null, null, from, to2, false, spmId, 38, null);
    }

    /* JADX INFO: renamed from: P */
    public final void m19160P() {
        InterfaceC37749a.a.m85107b(C37304a.f82764a, "WITHDRAW", "ASSET", null, null, null, 28, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m19161d(@Nullable Consumer<B2CConfig> consumer, @NotNull Continuation<? super Unit> continuation) throws Exception {
        AssetsHelper$fetchB2cConfig$1 assetsHelper$fetchB2cConfig$1;
        if (continuation instanceof AssetsHelper$fetchB2cConfig$1) {
            assetsHelper$fetchB2cConfig$1 = (AssetsHelper$fetchB2cConfig$1) continuation;
            int i11 = assetsHelper$fetchB2cConfig$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                assetsHelper$fetchB2cConfig$1.label = i11 - Integer.MIN_VALUE;
            } else {
                assetsHelper$fetchB2cConfig$1 = new AssetsHelper$fetchB2cConfig$1(this, continuation);
            }
        } else {
            assetsHelper$fetchB2cConfig$1 = new AssetsHelper$fetchB2cConfig$1(this, continuation);
        }
        Object objM42823d = assetsHelper$fetchB2cConfig$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = assetsHelper$fetchB2cConfig$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42823d);
            String feeRate = f18688e.getFeeRate();
            if (feeRate != null && feeRate.length() != 0) {
                if (consumer != null) {
                    consumer.accept(f18688e);
                }
                return Unit.INSTANCE;
            }
            InterfaceC41634e<B2CConfig> interfaceC41634eM17139j0 = ((AssetV2Api) C42597a.m93387c().create(AssetV2Api.class)).m17139j0();
            AssetsHelper$fetchB2cConfig$2 assetsHelper$fetchB2cConfig$2 = new AssetsHelper$fetchB2cConfig$2(consumer, null);
            assetsHelper$fetchB2cConfig$1.L$0 = consumer;
            assetsHelper$fetchB2cConfig$1.label = 1;
            objM42823d = RetrofitFlowExKt.m42823d(interfaceC41634eM17139j0, false, assetsHelper$fetchB2cConfig$2, assetsHelper$fetchB2cConfig$1);
            if (objM42823d == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            consumer = (Consumer) assetsHelper$fetchB2cConfig$1.L$0;
            ResultKt.throwOnFailure(objM42823d);
        }
        Throwable throwable = ((C19334f) objM42823d).getThrowable();
        if (throwable != null) {
            throwable.printStackTrace();
            if (consumer != null) {
                consumer.accept(null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: f */
    public final Object m19162f(@NotNull Continuation<? super List<B2CLoanEntity>> continuation) {
        AssetsHelper$fetchB2cCurrenciesOrCache$1 assetsHelper$fetchB2cCurrenciesOrCache$1;
        if (continuation instanceof AssetsHelper$fetchB2cCurrenciesOrCache$1) {
            assetsHelper$fetchB2cCurrenciesOrCache$1 = (AssetsHelper$fetchB2cCurrenciesOrCache$1) continuation;
            int i11 = assetsHelper$fetchB2cCurrenciesOrCache$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                assetsHelper$fetchB2cCurrenciesOrCache$1.label = i11 - Integer.MIN_VALUE;
            } else {
                assetsHelper$fetchB2cCurrenciesOrCache$1 = new AssetsHelper$fetchB2cCurrenciesOrCache$1(this, continuation);
            }
        } else {
            assetsHelper$fetchB2cCurrenciesOrCache$1 = new AssetsHelper$fetchB2cCurrenciesOrCache$1(this, continuation);
        }
        Object objM17092M = assetsHelper$fetchB2cCurrenciesOrCache$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = assetsHelper$fetchB2cCurrenciesOrCache$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM17092M);
            ArrayList<B2CLoanEntity> arrayList = f18687d;
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            AssetV2Api assetV2Api = (AssetV2Api) C42597a.m93386b().create(AssetV2Api.class);
            assetsHelper$fetchB2cCurrenciesOrCache$1.label = 1;
            objM17092M = assetV2Api.m17092M(assetsHelper$fetchB2cCurrenciesOrCache$1);
            if (objM17092M == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM17092M);
        }
        BaseEntity baseEntity = (BaseEntity) objM17092M;
        boolean success = baseEntity.getSuccess();
        Collection collection = (Collection) baseEntity.getData();
        if (!success || !(!(collection == null || collection.isEmpty()))) {
            return CollectionsKt.emptyList();
        }
        ArrayList<B2CLoanEntity> arrayList2 = f18687d;
        arrayList2.clear();
        arrayList2.addAll((Collection) baseEntity.getData());
        return arrayList2;
    }

    /* JADX INFO: renamed from: g */
    public final void m19163g() {
        if (C46392a.m102322d(C42153h.f93593a.m92499C(), false)) {
            return;
        }
        MviExKt.m42518n(new AssetsHelper$getAlphaAccountVisible$1((AssetV2Api) C42597a.m93388d().create(AssetV2Api.class), null));
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final SmallEntity m19164h() {
        return f18685b;
    }

    /* JADX INFO: renamed from: i */
    public final void m19165i() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C10914a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_small_assets_hide", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        int iM66651k = C27039d.m66651k((Integer) objM20457a, 1);
        f18685b = new SmallEntity(new BigDecimal(iM66651k > 0 ? iM66651k : 1), C38184b.f85884a.m86146a());
    }

    /* JADX INFO: renamed from: j */
    public final void m19166j() {
        String strM102326h = C46392a.m102326h(C42153h.f93593a.m92502F(), "");
        if (!TextUtils.isEmpty(strM102326h)) {
            f18686c = (SmallEntity) C27099x.m66912b(strM102326h, SmallEntity.class);
        }
        MviExKt.m42518n(new AssetsHelper$getSmallCoinConfigKcs$1$1((AssetV2Api) C42597a.m93387c().create(AssetV2Api.class), null));
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final SmallEntity m19167k() {
        return f18686c;
    }

    /* JADX INFO: renamed from: l */
    public final void m19168l(@Nullable Context context, @NotNull Parcelable accountDetailEntity) {
        Intrinsics.checkNotNullParameter(accountDetailEntity, "accountDetailEntity");
        if (context != null) {
            BaseActivity.INSTANCE.launch(context, RecordDetailFragment.class, new C27051h().m66721e("data", accountDetailEntity).m66717a());
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m19170n(@NotNull String coin, @Nullable String str) {
        Intrinsics.checkNotNullParameter(coin, "coin");
        AssetRnBundle assetRnBundleM20185b = AssetRnRouteConfig.f19197a.m20185b(AssetRemoteConfig.f18903a.m19573p());
        Router.f46192a.m56184f("krn/router").m4038a(Constants.BIZ, assetRnBundleM20185b.getBiz()).m4038a("entry", "main").m4038a(Constants.COMPONENT, assetRnBundleM20185b.getComponent()).m4038a("needLogin", Boolean.TRUE).m4038a("route", "AssetsDepositCoinPickerPage?coin=" + coin + "&spmId=" + str).m4048k();
    }

    /* JADX INFO: renamed from: p */
    public final void m19171p(@Nullable String str) {
        String strM66669i = C27041f.m66669i(str, "main");
        AssetRnBundle assetRnBundleM20184a = AssetRnRouteConfig.f19197a.m20184a(AssetRemoteConfig.f18903a.m19573p());
        Router.f46192a.m56184f("krn/router").m4038a(Constants.BIZ, assetRnBundleM20184a.getBiz()).m4038a("entry", "main").m4038a(Constants.COMPONENT, assetRnBundleM20184a.getComponent()).m4038a("needLogin", Boolean.TRUE).m4038a("route", "AssetsKcsConvertPage?accountType=" + strM66669i).m4048k();
    }

    /* JADX INFO: renamed from: q */
    public final void m19172q(@NotNull String coin, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(coin, "coin");
        AssetRnBundle assetRnBundleM20185b = AssetRnRouteConfig.f19197a.m20185b(AssetRemoteConfig.f18903a.m19573p());
        Router.f46192a.m56184f("krn/router").m4038a(Constants.BIZ, assetRnBundleM20185b.getBiz()).m4038a("entry", "main").m4038a(Constants.COMPONENT, assetRnBundleM20185b.getComponent()).m4038a("needLogin", Boolean.TRUE).m4038a("route", "WithdrawPage?coin=" + coin + "&address=" + str + "&spmId=" + str2).m4048k();
    }

    /* JADX INFO: renamed from: r */
    public final void m19173r(@NotNull String address, @Nullable String str, @NotNull String platFrom, @NotNull String tabMark, boolean z11, @NotNull String page) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(platFrom, "platFrom");
        Intrinsics.checkNotNullParameter(tabMark, "tabMark");
        Intrinsics.checkNotNullParameter(page, "page");
        AssetRnBundle assetRnBundleM20185b = AssetRnRouteConfig.f19197a.m20185b(AssetRemoteConfig.f18903a.m19573p());
        Router.f46192a.m56184f("krn/router").m4038a(Constants.BIZ, assetRnBundleM20185b.getBiz()).m4038a("entry", "main").m4038a(Constants.COMPONENT, assetRnBundleM20185b.getComponent()).m4038a("needLogin", Boolean.TRUE).m4038a("route", "WithdrawPage?address=" + address + "&spmId=" + str + "&platFrom=" + platFrom + "&tabMark=" + tabMark + "&isShowFiat=" + z11 + "&page=" + page).m4048k();
    }

    /* JADX INFO: renamed from: t */
    public final void m19174t(@NotNull RecyclerView recyclerView, @Nullable AppBarLayout appBarLayout, @NotNull Action action) throws Exception {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(action, "action");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        if (((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition() != 0) {
            recyclerView.smoothScrollToPosition(0);
            return;
        }
        if (appBarLayout == null) {
            action.run();
            return;
        }
        ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (behavior instanceof AppBarLayout.Behavior) {
            final AppBarLayout.Behavior behavior2 = (AppBarLayout.Behavior) behavior;
            int topAndBottomOffset = behavior2.getTopAndBottomOffset();
            if (topAndBottomOffset == 0) {
                action.run();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofInt(topAndBottomOffset, 0).setDuration(200L);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kubi.assets.service.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AssetsHelper.m19147v(behavior2, valueAnimator);
                }
            });
            duration.start();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m19175w(@Nullable SmallEntity smallEntity) {
        f18686c = smallEntity;
    }

    /* JADX INFO: renamed from: x */
    public final void m19176x(@NotNull OldBaseFragment fragment, boolean z11) {
        String string;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        AlertDialogFragmentHelper alertDialogFragmentHelperM54167X4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.note);
        if (z11) {
            int i11 = R$string.lever_small_amount_tips;
            SmallEntity smallEntity = f18685b;
            string = fragment.getString(i11, C27041f.m66668h(smallEntity != null ? smallEntity.showString() : null));
        } else {
            int i12 = R$string.hide_small_tips;
            SmallEntity smallEntity2 = f18685b;
            string = fragment.getString(i12, C27041f.m66668h(smallEntity2 != null ? smallEntity2.showString() : null));
        }
        alertDialogFragmentHelperM54167X4.m54156M4(string).m54162S4(R$string.confirm, null).m54172c5(fragment.getChildFragmentManager());
    }

    /* JADX INFO: renamed from: E */
    public final void m19152E(@Nullable String str, int i11, boolean z11) {
        if (TextUtils.isEmpty(str)) {
            if (AssetsDepend.f18689a.m19189j().U()) {
                C43841b.m96555b("B1depositCoinList_choose_coin_load", null, 2, null);
                InterfaceC37749a.a.m85111f(C37304a.f82764a, null, null, null, 7, null);
                return;
            }
            C43841b.m96557d("B1depositCoinList_choose_coin_load", "page_load_start", null, 4, null);
            if (C9835j.m16374a() && z11) {
                m19153G();
                return;
            } else {
                InterfaceC37749a.a.m85110e(C37304a.f82764a, null, 1L, Long.valueOf(i11), null, null, null, 57, null);
                return;
            }
        }
        if (AssetsDepend.f18689a.m19189j().U()) {
            InterfaceC37749a.a.m85111f(C37304a.f82764a, String.valueOf(str), null, null, 6, null);
        } else if (C9835j.m16374a() && z11) {
            m19153G();
        } else {
            InterfaceC37749a.a.m85110e(C37304a.f82764a, null, 1L, Long.valueOf(i11), str, null, null, 49, null);
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m19159O() {
        if (C9835j.m16374a()) {
            m19160P();
        } else {
            InterfaceC37749a.a.m85118m(C37304a.f82764a, null, null, null, null, null, null, null, 127, null);
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m19169m() {
        if (UserInfo.c().getType() == 3) {
            ToastCompat.m66437C(R$string.not_support_sub_account);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public final void m19177z(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            InterfaceC37758j.a.m85163l(C37304a.f82764a, null, null, null, null, null, null, null, 127, null);
        } else {
            InterfaceC37758j.a.m85163l(C37304a.f82764a, null, null, null, null, String.valueOf(str), null, null, 111, null);
        }
    }
}
