package com.kubi.copytrading;

import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.copytrading.entity.LeadUserEntity;
import com.kubi.host.HostManager;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.C27025c;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import f00.C37304a;
import g00.InterfaceC37754f;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026ay.C4400a;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: CopyTradingConfig.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\b\u0010$\u001a\u0004\u0018\u00010\u0015J\u0006\u0010%\u001a\u00020&J\u0006\u0010'\u001a\u00020&J\b\u0010(\u001a\u00020\tH\u0002J\u001c\u0010\u0012\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00140)J\u0006\u0010*\u001a\u00020&J\u0010\u0010+\u001a\u00020\u001a2\b\u0010,\u001a\u0004\u0018\u00010\tJ\u0010\u0010-\u001a\u00020\u001a2\b\u0010.\u001a\u0004\u0018\u00010\tJ\u000e\u0010/\u001a\u00020\u001a2\u0006\u00100\u001a\u00020\tJ\u0016\u00101\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\t2\u0006\u00103\u001a\u00020\tJ\u0006\u00104\u001a\u00020\u001aJ\u000e\u00105\u001a\u00020\u001a2\u0006\u00103\u001a\u00020\tJ\u000e\u00106\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u001aJ\u0016\u00108\u001a\u00020\u001a2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\tJ\u0006\u0010<\u001a\u00020\u001aJ\u001e\u0010=\u001a\u00020\u001a2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\tJ\u0010\u0010?\u001a\u00020&2\u0006\u0010,\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R#\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0012\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u0019\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001a8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b\u001e\u0010\u001bR\u000e\u0010 \u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010!\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006@"}, m90084d2 = {"Lcom/kubi/copytrading/CopyTradingConfig;", "", "<init>", "()V", "coroutineExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "ioScope", "Lkotlinx/coroutines/CoroutineScope;", "coroutineName", "", "KV_CATEGORY_COPY_TRADING_ACCOUNT", "copyTdApi", "Lcom/kubi/copytrading/CopytdApi;", "kotlin.jvm.PlatformType", "getCopyTdApi", "()Lcom/kubi/copytrading/CopytdApi;", "copyTdApi$delegate", "Lkotlin/Lazy;", "accountInfoChangedData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlin/Pair;", "Lcom/kubi/copytrading/entity/LeadUserEntity;", "accountList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "currentLeadUser", "isSupportCopyTrading", "", "()Z", "isSupportCopyTrading$delegate", "needCopyTradingKrnEngineDeInit", "getNeedCopyTradingKrnEngineDeInit", "needCopyTradingKrnEngineDeInit$delegate", "COPY_HOME_ROUTE", "COPY_TRADING_GUIDE_URL", "getCOPY_TRADING_GUIDE_URL", "()Ljava/lang/String;", "getCurrentLeadUser", "fetchIsSupportLeadTrading", "", "fetchCopytdAccountInfo", "getKvKey", "Lkotlinx/coroutines/flow/StateFlow;", "clearAccMemoryCache", "isInLeadUserAndToggle", "subUid", "isInLeadUserConfigIdAndToggle", "leaderConfigId", "jump2CopyTrading", TUIConstants.TIMPush.NOTIFICATION.ACTION, "jump2LeadDetail", "copyConfigId", "leadConfigId", "isOpenLeadTrading", "jump2LeadUserHome", "jump2ProfitSharePage", "isUnProfitShare", "jump2TrialFundPage", "trialFundId", "", DropFrameTable.COLUMN_SCENE, "requestLeadTrading", "jump2CopyTradingTransfer", FirebaseAnalytics.Param.CURRENCY, "fetchHedgeAvailable", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCopyTradingConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyTradingConfig.kt\ncom/kubi/copytrading/CopyTradingConfig\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 5 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,310:1\n1#2:311\n35#3,4:312\n39#3:318\n44#4,2:316\n47#5,4:319\n*S KotlinDebug\n*F\n+ 1 CopyTradingConfig.kt\ncom/kubi/copytrading/CopyTradingConfig\n*L\n85#1:312,4\n85#1:318\n85#1:316,2\n46#1:319,4\n*E\n"})
public final class CopyTradingConfig {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final CopyTradingConfig f19710a = new CopyTradingConfig();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final CoroutineExceptionHandler f19711b = new C11432b(CoroutineExceptionHandler.INSTANCE);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f19712c = LazyKt.lazy(new Function0() { // from class: com.kubi.copytrading.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CopyTradingConfig.m20587m();
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final InterfaceC41669n<Pair<LeadUserEntity, LeadUserEntity>> f19713d = C41679x.m91009a(new Pair(null, null));

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final CopyOnWriteArrayList<LeadUserEntity> f19714e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public static volatile LeadUserEntity f19715f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Lazy f19716g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Lazy f19717h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final String f19718i;

    /* JADX INFO: renamed from: com.kubi.copytrading.CopyTradingConfig$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C11431a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.copytrading.CopyTradingConfig$b */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 CopyTradingConfig.kt\ncom/kubi/copytrading/CopyTradingConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,49:1\n46#2:50\n44#3,2:51\n*S KotlinDebug\n*F\n+ 1 CopyTradingConfig.kt\ncom/kubi/copytrading/CopyTradingConfig\n*L\n46#1:51,2\n*E\n"})
    public static final class C11432b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C43846g.m96568c(new KCConfigException(exception, "CopyTrading", false, null, 8, null), null, 2, null);
        }

        public C11432b(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m20596l() {
        f19715f = null;
        f19714e.clear();
        f19713d.setValue(new Pair<>(null, null));
    }

    static {
        CopyOnWriteArrayList<LeadUserEntity> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        f19714e = copyOnWriteArrayList;
        f19715f = (LeadUserEntity) CollectionsKt.firstOrNull((List) copyOnWriteArrayList);
        f19716g = LazyKt.lazy(new Function0() { // from class: com.kubi.copytrading.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(CopyTradingConfig.m20574A());
            }
        });
        f19717h = LazyKt.lazy(new Function0() { // from class: com.kubi.copytrading.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(CopyTradingConfig.m20576I());
            }
        });
        f19718i = HostManager.a.m() + "/support/categories/38946625559833?appNeedLang=true";
    }

    /* JADX INFO: renamed from: A */
    public static final boolean m20574A() {
        return C24129b.m58030b(SiteVisibleConfigKey.CopyTrading);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ boolean m20575D(CopyTradingConfig copyTradingConfig, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "USDT";
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        return copyTradingConfig.m20589C(str, str2);
    }

    /* JADX INFO: renamed from: I */
    public static final boolean m20576I() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C11431a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("copy_trading_krn_engine_deinit", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, false);
    }

    /* JADX INFO: renamed from: B */
    public final boolean m20588B(@NotNull String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        int iHashCode = action.hashCode();
        if (iHashCode != -1597342790) {
            if (iHashCode != -1060537535) {
                if (iHashCode == -506309132 && action.equals("copyHome")) {
                    return Router.f46192a.m56184f("/krn/router?biz=follow&entry=main&component=krn_follow_trade&route=CopyTradeMiniProgram?uiStateValue=copyTradingJump.copyHome").m4048k();
                }
            } else if (action.equals("myCopy")) {
                return InterfaceC37754f.a.m85138j(C37304a.f82764a, "copyTrading", null, "copyTradingJump." + action, null, null, null, null, 122, null);
            }
        } else if (action.equals("myLeading")) {
            return Router.f46192a.m56184f("/krn/router?biz=follow&entry=main&component=krn_follow_trade&route=CopyTradeMiniProgram?uiStateValue=copyTradingJump.myLeading").m4048k();
        }
        C44128b.m97270n("CopyTradingConfig", "jump2CopyTrading received unknown action: " + action + ", fallback to jumpQuotesHomeV2");
        return InterfaceC37754f.a.m85138j(C37304a.f82764a, "copyTrading", null, "copyTradingJump." + action, null, null, null, null, 122, null);
    }

    /* JADX INFO: renamed from: C */
    public final boolean m20589C(@Nullable String str, @Nullable String str2) {
        if (str2 == null) {
            LeadUserEntity leadUserEntityM20602s = m20602s();
            str2 = leadUserEntityM20602s != null ? leadUserEntityM20602s.getUid() : null;
        }
        Router router = Router.f46192a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("krn/router?biz=follow&entry=main&component=krn_follow_trade&route=");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("AccountTransfer?subUID=");
        sb3.append(str2);
        sb3.append("&currency=");
        if (str == null) {
            str = "";
        }
        sb3.append(str);
        sb2.append(Uri.encode(sb3.toString()));
        return router.m56184f(sb2.toString()).m4048k();
    }

    /* JADX INFO: renamed from: E */
    public final boolean m20590E(@NotNull String copyConfigId, @NotNull String leadConfigId) {
        Intrinsics.checkNotNullParameter(copyConfigId, "copyConfigId");
        Intrinsics.checkNotNullParameter(leadConfigId, "leadConfigId");
        return Router.f46192a.m56184f("krn/router?biz=follow&entry=main&component=krn_follow_trade&route=" + Uri.encode("MyTraderPositionSummary?copyConfigId=" + copyConfigId + "&leadConfigId=" + leadConfigId)).m4048k();
    }

    /* JADX INFO: renamed from: F */
    public final boolean m20591F(@NotNull String leadConfigId) {
        Intrinsics.checkNotNullParameter(leadConfigId, "leadConfigId");
        return Router.f46192a.m56184f("krn/router?biz=follow&entry=main&component=krn_follow_trade&route=" + Uri.encode("TraderProfile?leadConfigId=" + leadConfigId)).m4048k();
    }

    /* JADX INFO: renamed from: G */
    public final boolean m20592G(boolean z11) {
        return Router.f46192a.m56184f("krn/router?biz=follow&entry=main&component=krn_follow_trade&route=" + Uri.encode("ProfitShareMain?isUnProfitShare=" + z11)).m4048k();
    }

    /* JADX INFO: renamed from: H */
    public final boolean m20593H(int i11, @NotNull String scene) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        return Router.f46192a.m56184f("krn/router?biz=follow&entry=main&component=krn_follow_trade&route=" + Uri.encode("TrialFund?id=" + i11 + "&scene=" + scene)).m4048k();
    }

    /* JADX INFO: renamed from: J */
    public final boolean m20594J() {
        C4400a c4400aM56184f = Router.f46192a.m56184f("kumex/trade");
        LeadUserEntity leadUserEntityM20602s = m20602s();
        return c4400aM56184f.m4038a("leadUserId", leadUserEntityM20602s != null ? leadUserEntityM20602s.getUid() : null).m4048k();
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final InterfaceC41678w<Pair<LeadUserEntity, LeadUserEntity>> m20595k() {
        return f19713d;
    }

    /* JADX INFO: renamed from: o */
    public final void m20598o(String str) {
        C41696j.m91104d(m20605v("fetchFeatureAvailable"), null, null, new CopyTradingConfig$fetchHedgeAvailable$1(str, null), 3, null);
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final String m20600q() {
        return f19718i;
    }

    /* JADX INFO: renamed from: r */
    public final CopytdApi m20601r() {
        return (CopytdApi) f19712c.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final LeadUserEntity m20602s() {
        return f19715f;
    }

    /* JADX INFO: renamed from: t */
    public final String m20603t() {
        return UserInfo.a.i() + "fetchIsSupportLeadTradingList";
    }

    /* JADX INFO: renamed from: u */
    public final boolean m20604u() {
        return ((Boolean) f19717h.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: v */
    public final InterfaceC41709m0 m20605v(String str) {
        return C41713n0.m91125a(new CoroutineName(str).plus(C42911a.m94120b()).plus(f19711b));
    }

    /* JADX INFO: renamed from: z */
    public final boolean m20609z() {
        return ((Boolean) f19716g.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: m */
    public static final CopytdApi m20587m() {
        return (CopytdApi) C42597a.m93388d().create(CopytdApi.class);
    }

    /* JADX INFO: renamed from: n */
    public final void m20597n() {
        if (m20609z() && UserInfo.a.n()) {
            C41696j.m91104d(C41713n0.m91126b(), null, null, new CopyTradingConfig$fetchCopytdAccountInfo$1(null), 3, null);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m20599p() {
        if (m20609z() && UserInfo.a.n()) {
            C41696j.m91104d(m20605v("LoadCopyTradingAccountCache"), null, null, new CopyTradingConfig$fetchIsSupportLeadTrading$1(null), 3, null);
            m20597n();
        }
    }

    /* JADX INFO: renamed from: w */
    public final boolean m20606w(@Nullable String str) {
        Object next;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator<T> it = f19714e.iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!Intrinsics.areEqual(((LeadUserEntity) next).getUid(), str));
        LeadUserEntity leadUserEntity = (LeadUserEntity) next;
        if (leadUserEntity != null) {
            f19715f = leadUserEntity;
            f19713d.setValue(new Pair<>(f19715f, f19715f));
        }
        if (leadUserEntity == null) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m20607x(@Nullable String str) {
        Object next;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator<T> it = f19714e.iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!Intrinsics.areEqual(((LeadUserEntity) next).getConfigId(), str));
        LeadUserEntity leadUserEntity = (LeadUserEntity) next;
        if (leadUserEntity != null) {
            f19715f = leadUserEntity;
            f19713d.setValue(new Pair<>(f19715f, f19715f));
        }
        if (leadUserEntity == null) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m20608y() {
        if (m20609z() && UserInfo.a.n() && m20602s() != null) {
            return true;
        }
        return false;
    }
}
