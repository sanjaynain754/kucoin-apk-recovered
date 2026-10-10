package com.kubi.kucoin.token;

import a70.C0188b;
import android.os.SystemClock;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.kubi.otc.entity.OtcAd;
import com.kubi.router.core.Router;
import com.kubi.sdk.config.KCTokenLifecycleConfig;
import com.kubi.user.account.MultiAccountBizErrorHandler;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.LoginUserEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlinx.coroutines.AbstractC41710m1;
import kotlinx.coroutines.C41690i;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41718o1;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p351iy.C40192c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: TokenLifecycleManager.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000³\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\n*\u0001\u001d\bÆ\u0002\u0018\u00002\u00020\u0001:\u0010\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020 J\u0006\u0010%\u001a\u00020 J\b\u0010&\u001a\u00020 H\u0002J\u000e\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(J\u0015\u0010*\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0000¢\u0006\u0002\b+J\u0010\u0010,\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020(J\u0017\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010)\u001a\u00020(H\u0000¢\u0006\u0002\b/J4\u00100\u001a\u0004\u0018\u00010\u00102\u0006\u00101\u001a\u00020\u00102\b\b\u0002\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00102\b\b\u0002\u00104\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u00105Jk\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00102\b\b\u0002\u00104\u001a\u00020\u001b2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0002\u0010>J>\u0010?\u001a\u00020\u00122\u0006\u00108\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u001b2\u0006\u0010@\u001a\u00020\u001b2\u0006\u0010A\u001a\u00020BH\u0082@¢\u0006\u0002\u0010CJ*\u0010D\u001a\u00020 2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010F\u001a\u0004\u0018\u00010\u00122\b\u0010G\u001a\u0004\u0018\u00010\u0014H\u0002J6\u0010H\u001a\u00020 2\u0006\u00108\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00102\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010I\u001a\u00020JH\u0002J@\u0010K\u001a\u00020\u00122\u0006\u00108\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00102\b\b\u0002\u00104\u001a\u00020\u001b2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010I\u001a\u00020JH\u0002Jv\u0010L\u001a\u00020\u00122\u0006\u00108\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00102\b\b\u0002\u00104\u001a\u00020\u001b2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010I\u001a\u00020J2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010M\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020 \u0018\u00010NH\u0082@¢\u0006\u0002\u0010OJ\u001a\u0010P\u001a\u0004\u0018\u00010Q2\u0006\u0010R\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0010H\u0002J8\u0010S\u001a\u0004\u0018\u00010Q2\u0006\u0010R\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00102\u0016\b\u0002\u0010M\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020 \u0018\u00010NH\u0082@¢\u0006\u0002\u0010TJ4\u0010U\u001a\u00020 2\b\u0010:\u001a\u0004\u0018\u00010\u00102\u0006\u0010V\u001a\u00020\u00102\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\n\b\u0002\u0010W\u001a\u0004\u0018\u00010XH\u0002J6\u0010Y\u001a\u0004\u0018\u00010X2\b\u0010:\u001a\u0004\u0018\u00010\u00102\u0006\u0010V\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00102\b\u00109\u001a\u0004\u0018\u00010\u0010H\u0002JG\u0010Z\u001a\u00020 2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010R\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00102\b\u00109\u001a\u0004\u0018\u00010\u00102\b\u0010;\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0002\u0010[J\u0010\u0010\\\u001a\u00020B2\u0006\u00108\u001a\u00020\u0010H\u0002J$\u0010]\u001a\u00020\u00122\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010^\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010_J\u0010\u0010`\u001a\u00020 2\u0006\u0010R\u001a\u00020\u0010H\u0002J\u0018\u0010a\u001a\u00020J2\u0006\u0010b\u001a\u00020\u00102\u0006\u0010c\u001a\u00020\u0010H\u0002J\u0010\u0010d\u001a\u00020e2\u0006\u0010R\u001a\u00020\u0010H\u0002J\u0010\u0010f\u001a\u00020 2\u0006\u0010g\u001a\u00020\u0010H\u0002J\u0012\u0010h\u001a\u0004\u0018\u00010\u00102\u0006\u00108\u001a\u00020\u0010H\u0002J\u0015\u0010i\u001a\u00020\u00102\u0006\u0010R\u001a\u00020\u0010H\u0000¢\u0006\u0002\bjJ\u0015\u0010k\u001a\u00020\u00102\u0006\u0010R\u001a\u00020\u0010H\u0000¢\u0006\u0002\blJ\u0010\u0010m\u001a\u00020\u00102\u0006\u0010R\u001a\u00020\u0010H\u0002JA\u0010n\u001a\u00020 2\u0006\u00103\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00102\b\u00109\u001a\u0004\u0018\u00010\u00102\u0006\u0010F\u001a\u00020\u00122\u0006\u0010o\u001a\u00020\u00102\b\u0010p\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0002\u0010qJ\u0010\u0010r\u001a\u00020\u00122\u0006\u0010c\u001a\u00020\u0010H\u0002J\u0010\u0010s\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u0010H\u0002J\u0010\u0010t\u001a\u00020J2\u0006\u0010@\u001a\u00020\u001bH\u0002J\u0010\u0010u\u001a\u00020\u00122\u0006\u0010F\u001a\u00020\u0012H\u0002J\u0018\u0010v\u001a\u00020 2\u0006\u00108\u001a\u00020\u00102\u0006\u0010g\u001a\u00020\u0010H\u0002J\b\u0010w\u001a\u00020 H\u0002J\u001c\u0010x\u001a\u00020(*\u00020(2\u0006\u0010y\u001a\u00020\u00102\u0006\u0010z\u001a\u00020JH\u0002J\f\u0010{\u001a\u00020J*\u00020(H\u0002J\u0015\u0010|\u001a\u00020e2\u0006\u0010}\u001a\u00020\u001bH\u0000¢\u0006\u0002\b~J\u001d\u0010|\u001a\u00020e2\u0006\u0010}\u001a\u00020\u001b2\u0006\u0010\u007f\u001a\u00020\u0005H\u0000¢\u0006\u0002\b~J:\u0010\u0080\u0001\u001a\u00020\u00192\u0006\u0010b\u001a\u00020\u00102\u0006\u0010c\u001a\u00020\u00102\u0007\u0010\u0081\u0001\u001a\u00020\u001b2\u0007\u0010\u0082\u0001\u001a\u00020\u001b2\u0007\u0010\u0083\u0001\u001a\u00020\u001bH\u0000¢\u0006\u0003\b\u0084\u0001J\u000f\u0010\u0085\u0001\u001a\u00020 H\u0000¢\u0006\u0003\b\u0086\u0001J\u0019\u0010\u008b\u0001\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u001bH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0004\u0012\u00020\u00140\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00160\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u000f\u0010\u0087\u0001\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u0088\u0001\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0089\u0001\u001a\u00030\u008a\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0094\u0001"}, m90084d2 = {"Lcom/kubi/kucoin/token/TokenLifecycleManager;", "", "<init>", "()V", "tokenLifecycleConfig", "Lcom/kubi/sdk/config/KCTokenLifecycleConfig;", "getTokenLifecycleConfig", "()Lcom/kubi/sdk/config/KCTokenLifecycleConfig;", "tokenLifecycleConfig$delegate", "Lkotlin/Lazy;", "refreshDispatcher", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "refreshScope", "Lkotlinx/coroutines/CoroutineScope;", "inFlightRefreshes", "", "", "Lkotlinx/coroutines/Deferred;", "Lcom/kubi/kucoin/token/TokenLifecycleRefreshResult;", "refreshMonitorContexts", "Lcom/kubi/kucoin/token/TokenLifecycleManager$RefreshMonitorContext;", "blockingRefreshBarriers", "Lcom/kubi/kucoin/token/TokenLifecycleManager$BlockingRefreshBarrier;", "stateLock", "tokenAnchor", "Lcom/kubi/kucoin/token/TokenLifecycleManager$TokenAnchor;", "sessionGeneration", "", "refreshedTokenMappings", "com/kubi/kucoin/token/TokenLifecycleManager$refreshedTokenMappings$1", "Lcom/kubi/kucoin/token/TokenLifecycleManager$refreshedTokenMappings$1;", "hydrateCurrentToken", "", "onTokenChanged", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/user/model/LoginUserEntity;", "clear", "onForeground", "handleForeground", "prepareRequest", "Lokhttp3/Request;", "request", "attachMonitorNameSnapshot", "attachMonitorNameSnapshot$LAppNet_googleRelease", "recoverFromBusiness401", "recoverFromBusiness401WithResult", "Lcom/kubi/kucoin/token/TokenLifecycleManager$Business401RecoveryResult;", "recoverFromBusiness401WithResult$LAppNet_googleRelease", "refreshTokenFromExternal", "triggerPath", "expiredAccessToken", "source", "refreshTimeLimit", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrCreateRefresh", "Lcom/kubi/kucoin/token/TokenLifecycleManager$RefreshTaskHandle;", "expiredToken", "refreshType", "blockingToken", "hardWaitStart", "expectedSessionGeneration", "expectedAccountType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lcom/kubi/kucoin/token/TokenLifecycleManager$RefreshTaskHandle;", "executeRefresh", "taskGeneration", "refreshContext", "Lcom/kubi/kucoin/token/TokenLifecycleRefreshContext;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLcom/kubi/kucoin/token/TokenLifecycleRefreshContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "monitorCompletedRefreshTask", "task", "refreshResult", "fallbackContext", "startRefresh", "registerBlockingBarrier", "", "waitForRefresh", "awaitRefresh", "onAccountTypeResolved", "Lkotlin/Function1;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZLjava/lang/Long;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitBlockingRefreshBarrier", "Lcom/kubi/kucoin/token/TokenLifecycleManager$BlockingRefreshBarrierResult;", "requestToken", "awaitBlockingRefreshBarrierSuspend", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerBlockingRefreshBarrierLocked", "refreshToken", "forceContext", "Lcom/kubi/kucoin/token/TokenLifecycleManager$ForceRefreshContext;", "createForceRefreshContext", "promoteRefreshMonitorContextLocked", "(Lkotlinx/coroutines/Deferred;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "resolveRefreshContext", "awaitRefreshTask", "accountType", "(Lkotlinx/coroutines/Deferred;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ensureCurrentAnchor", "isCurrentSessionToken", "accountId", "accessToken", "currentWindow", "Lcom/kubi/kucoin/token/TokenLifecycleManager$TokenWindow;", "hydrateCurrentTokenAfterRefresh", "refreshedToken", "resolveLatestToken", "monitorAccountTypeForToken", "monitorAccountTypeForToken$LAppNet_googleRelease", "monitorNameForToken", "monitorNameForToken$LAppNet_googleRelease", "monitorNameForTokenLocked", "monitorRefreshTerminal", "monitorName", TypedValues.TransitionType.S_DURATION, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/kucoin/token/TokenLifecycleRefreshResult;Ljava/lang/String;Ljava/lang/Long;)V", "mappedTokenResult", "failedRefreshResult", "isSessionGenerationActive", "invalidatedRefreshResult", "recordTokenMappingLocked", "clearLocked", "withAccessToken", "newToken", "isBusiness401Replay", "isInternalTokenRequest", "classifyRemaining", "remainingMillis", "classifyRemaining$LAppNet_googleRelease", "config", "createAnchor", "expireAt", "deviceNow", "monotonicNow", "createAnchor$LAppNet_googleRelease", "resetForTest", "resetForTest$LAppNet_googleRelease", "FOREGROUND_TRIGGER_PATH", "TOKEN_LIFECYCLE_TRIGGER_PATH", "MAX_TOKEN_MAPPING_SIZE", "", "effectiveRefreshTimeLimit", "TokenAnchor", "Business401RecoveryResult", "BlockingRefreshBarrierResult", "BlockingRefreshBarrier", "ForceRefreshContext", "RefreshMonitorContext", "RefreshTaskHandle", "TokenWindow", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTokenLifecycleManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TokenLifecycleManager.kt\ncom/kubi/kucoin/token/TokenLifecycleManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Router.kt\ncom/kubi/router/core/Router\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1488:1\n1#2:1489\n176#3:1490\n295#4,2:1491\n1869#4,2:1493\n*S KotlinDebug\n*F\n+ 1 TokenLifecycleManager.kt\ncom/kubi/kucoin/token/TokenLifecycleManager\n*L\n639#1:1490\n1052#1:1491,2\n1328#1:1493,2\n*E\n"})
public final class TokenLifecycleManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final TokenLifecycleManager f28424a = new TokenLifecycleManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f28425b = LazyKt.lazy(new Function0() { // from class: com.kubi.kucoin.token.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TokenLifecycleManager.m32904l0();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final AbstractC41710m1 f28426c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final InterfaceC41709m0 f28427d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Map<String, InterfaceC41729r0<TokenLifecycleRefreshResult>> f28428e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Map<InterfaceC41729r0<TokenLifecycleRefreshResult>, RefreshMonitorContext> f28429f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Map<String, BlockingRefreshBarrier> f28430g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Object f28431h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public static volatile TokenAnchor f28432i;

    /* JADX INFO: renamed from: j */
    public static long f28433j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final TokenLifecycleManager$refreshedTokenMappings$1 f28434k;

    /* JADX INFO: compiled from: TokenLifecycleManager.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kucoin/token/TokenLifecycleManager$TokenWindow;", "", "<init>", "(Ljava/lang/String;I)V", OtcAd.STATUS_NORMAL, "SOFT", "HARD", "MISSING_EXPIRE_AT", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum TokenWindow {
        NORMAL,
        SOFT,
        HARD,
        MISSING_EXPIRE_AT;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f28436c = EnumEntriesKt.enumEntries(m32954a());

        @NotNull
        public static EnumEntries<TokenWindow> getEntries() {
            return f28436c;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.token.TokenLifecycleManager$a, reason: from toString */
    /* JADX INFO: compiled from: TokenLifecycleManager.kt */
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003JC\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006#"}, m90084d2 = {"Lcom/kubi/kucoin/token/TokenLifecycleManager$BlockingRefreshBarrier;", "", "task", "Lkotlinx/coroutines/Deferred;", "Lcom/kubi/kucoin/token/TokenLifecycleRefreshResult;", "fallbackToken", "", "forceContext", "Lcom/kubi/kucoin/token/TokenLifecycleManager$ForceRefreshContext;", "sessionGeneration", "", "accountType", "<init>", "(Lkotlinx/coroutines/Deferred;Ljava/lang/String;Lcom/kubi/kucoin/token/TokenLifecycleManager$ForceRefreshContext;JLjava/lang/String;)V", "getTask", "()Lkotlinx/coroutines/Deferred;", "getFallbackToken", "()Ljava/lang/String;", "getForceContext", "()Lcom/kubi/kucoin/token/TokenLifecycleManager$ForceRefreshContext;", "getSessionGeneration", "()J", "getAccountType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class BlockingRefreshBarrier {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final InterfaceC41729r0<TokenLifecycleRefreshResult> task;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final String fallbackToken;

        /* JADX INFO: renamed from: c, reason: from toString */
        @Nullable
        public final ForceRefreshContext forceContext;

        /* JADX INFO: renamed from: d, reason: from toString */
        public final long sessionGeneration;

        /* JADX INFO: renamed from: e, reason: from toString */
        @NotNull
        public final String accountType;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BlockingRefreshBarrier)) {
                return false;
            }
            BlockingRefreshBarrier blockingRefreshBarrier = (BlockingRefreshBarrier) other;
            return Intrinsics.areEqual(this.task, blockingRefreshBarrier.task) && Intrinsics.areEqual(this.fallbackToken, blockingRefreshBarrier.fallbackToken) && Intrinsics.areEqual(this.forceContext, blockingRefreshBarrier.forceContext) && this.sessionGeneration == blockingRefreshBarrier.sessionGeneration && Intrinsics.areEqual(this.accountType, blockingRefreshBarrier.accountType);
        }

        public BlockingRefreshBarrier(@NotNull InterfaceC41729r0<TokenLifecycleRefreshResult> task, @NotNull String fallbackToken, @Nullable ForceRefreshContext forceRefreshContext, long j11, @NotNull String accountType) {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(fallbackToken, "fallbackToken");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            this.task = task;
            this.fallbackToken = fallbackToken;
            this.forceContext = forceRefreshContext;
            this.sessionGeneration = j11;
            this.accountType = accountType;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAccountType() {
            return this.accountType;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFallbackToken() {
            return this.fallbackToken;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final ForceRefreshContext getForceContext() {
            return this.forceContext;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getSessionGeneration() {
            return this.sessionGeneration;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final InterfaceC41729r0<TokenLifecycleRefreshResult> m32959e() {
            return this.task;
        }

        public int hashCode() {
            int iHashCode = ((this.task.hashCode() * 31) + this.fallbackToken.hashCode()) * 31;
            ForceRefreshContext forceRefreshContext = this.forceContext;
            return ((((iHashCode + (forceRefreshContext == null ? 0 : forceRefreshContext.hashCode())) * 31) + Long.hashCode(this.sessionGeneration)) * 31) + this.accountType.hashCode();
        }

        @NotNull
        public String toString() {
            return "BlockingRefreshBarrier(task=" + this.task + ", fallbackToken=" + this.fallbackToken + ", forceContext=" + this.forceContext + ", sessionGeneration=" + this.sessionGeneration + ", accountType=" + this.accountType + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.token.TokenLifecycleManager$b, reason: from toString */
    /* JADX INFO: compiled from: TokenLifecycleManager.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/kucoin/token/TokenLifecycleManager$BlockingRefreshBarrierResult;", "", "refreshResult", "Lcom/kubi/kucoin/token/TokenLifecycleRefreshResult;", "fallbackToken", "", "<init>", "(Lcom/kubi/kucoin/token/TokenLifecycleRefreshResult;Ljava/lang/String;)V", "getRefreshResult", "()Lcom/kubi/kucoin/token/TokenLifecycleRefreshResult;", "getFallbackToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class BlockingRefreshBarrierResult {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final TokenLifecycleRefreshResult refreshResult;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final String fallbackToken;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BlockingRefreshBarrierResult)) {
                return false;
            }
            BlockingRefreshBarrierResult blockingRefreshBarrierResult = (BlockingRefreshBarrierResult) other;
            return Intrinsics.areEqual(this.refreshResult, blockingRefreshBarrierResult.refreshResult) && Intrinsics.areEqual(this.fallbackToken, blockingRefreshBarrierResult.fallbackToken);
        }

        public BlockingRefreshBarrierResult(@NotNull TokenLifecycleRefreshResult refreshResult, @NotNull String fallbackToken) {
            Intrinsics.checkNotNullParameter(refreshResult, "refreshResult");
            Intrinsics.checkNotNullParameter(fallbackToken, "fallbackToken");
            this.refreshResult = refreshResult;
            this.fallbackToken = fallbackToken;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFallbackToken() {
            return this.fallbackToken;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final TokenLifecycleRefreshResult getRefreshResult() {
            return this.refreshResult;
        }

        public int hashCode() {
            return (this.refreshResult.hashCode() * 31) + this.fallbackToken.hashCode();
        }

        @NotNull
        public String toString() {
            return "BlockingRefreshBarrierResult(refreshResult=" + this.refreshResult + ", fallbackToken=" + this.fallbackToken + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.token.TokenLifecycleManager$c, reason: from toString */
    /* JADX INFO: compiled from: TokenLifecycleManager.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/kucoin/token/TokenLifecycleManager$Business401RecoveryResult;", "", "replayRequest", "Lokhttp3/Request;", "refreshResult", "Lcom/kubi/kucoin/token/TokenLifecycleRefreshResult;", "<init>", "(Lokhttp3/Request;Lcom/kubi/kucoin/token/TokenLifecycleRefreshResult;)V", "getReplayRequest", "()Lokhttp3/Request;", "getRefreshResult", "()Lcom/kubi/kucoin/token/TokenLifecycleRefreshResult;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Business401RecoveryResult {

        /* JADX INFO: renamed from: a, reason: from toString */
        @Nullable
        public final Request replayRequest;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final TokenLifecycleRefreshResult refreshResult;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Business401RecoveryResult)) {
                return false;
            }
            Business401RecoveryResult business401RecoveryResult = (Business401RecoveryResult) other;
            return Intrinsics.areEqual(this.replayRequest, business401RecoveryResult.replayRequest) && Intrinsics.areEqual(this.refreshResult, business401RecoveryResult.refreshResult);
        }

        public Business401RecoveryResult(@Nullable Request request, @NotNull TokenLifecycleRefreshResult refreshResult) {
            Intrinsics.checkNotNullParameter(refreshResult, "refreshResult");
            this.replayRequest = request;
            this.refreshResult = refreshResult;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TokenLifecycleRefreshResult getRefreshResult() {
            return this.refreshResult;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Request getReplayRequest() {
            return this.replayRequest;
        }

        public int hashCode() {
            Request request = this.replayRequest;
            return ((request == null ? 0 : request.hashCode()) * 31) + this.refreshResult.hashCode();
        }

        @NotNull
        public String toString() {
            return "Business401RecoveryResult(replayRequest=" + this.replayRequest + ", refreshResult=" + this.refreshResult + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.token.TokenLifecycleManager$d, reason: from toString */
    /* JADX INFO: compiled from: TokenLifecycleManager.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/kucoin/token/TokenLifecycleManager$ForceRefreshContext;", "", "triggerPath", "", "source", "refreshType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTriggerPath", "()Ljava/lang/String;", "getSource", "getRefreshType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ForceRefreshContext {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String triggerPath;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final String source;

        /* JADX INFO: renamed from: c, reason: from toString */
        @Nullable
        public final String refreshType;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ForceRefreshContext)) {
                return false;
            }
            ForceRefreshContext forceRefreshContext = (ForceRefreshContext) other;
            return Intrinsics.areEqual(this.triggerPath, forceRefreshContext.triggerPath) && Intrinsics.areEqual(this.source, forceRefreshContext.source) && Intrinsics.areEqual(this.refreshType, forceRefreshContext.refreshType);
        }

        public ForceRefreshContext(@NotNull String triggerPath, @NotNull String source, @Nullable String str) {
            Intrinsics.checkNotNullParameter(triggerPath, "triggerPath");
            Intrinsics.checkNotNullParameter(source, "source");
            this.triggerPath = triggerPath;
            this.source = source;
            this.refreshType = str;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getRefreshType() {
            return this.refreshType;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTriggerPath() {
            return this.triggerPath;
        }

        public int hashCode() {
            int iHashCode = ((this.triggerPath.hashCode() * 31) + this.source.hashCode()) * 31;
            String str = this.refreshType;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "ForceRefreshContext(triggerPath=" + this.triggerPath + ", source=" + this.source + ", refreshType=" + this.refreshType + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.token.TokenLifecycleManager$e, reason: from toString */
    /* JADX INFO: compiled from: TokenLifecycleManager.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\t\u0010(\u001a\u00020\u0003HÆ\u0003Jd\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u000f¨\u00061"}, m90084d2 = {"Lcom/kubi/kucoin/token/TokenLifecycleManager$RefreshMonitorContext;", "", "source", "", "triggerPath", "refreshType", "hardWaitStart", "", "monitorName", "sessionGeneration", "manualRefreshTimeLimit", "accountType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "setSource", "(Ljava/lang/String;)V", "getTriggerPath", "setTriggerPath", "getRefreshType", "setRefreshType", "getHardWaitStart", "()Ljava/lang/Long;", "setHardWaitStart", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getMonitorName", "setMonitorName", "getSessionGeneration", "()J", "getManualRefreshTimeLimit", "getAccountType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/String;)Lcom/kubi/kucoin/token/TokenLifecycleManager$RefreshMonitorContext;", "equals", "", "other", "hashCode", "", "toString", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class RefreshMonitorContext {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public String source;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public String triggerPath;

        /* JADX INFO: renamed from: c, reason: from toString */
        @Nullable
        public String refreshType;

        /* JADX INFO: renamed from: d, reason: from toString */
        @Nullable
        public Long hardWaitStart;

        /* JADX INFO: renamed from: e, reason: from toString */
        @NotNull
        public String monitorName;

        /* JADX INFO: renamed from: f, reason: from toString */
        public final long sessionGeneration;

        /* JADX INFO: renamed from: g, reason: from toString */
        @Nullable
        public final Long manualRefreshTimeLimit;

        /* JADX INFO: renamed from: h, reason: from toString */
        @NotNull
        public final String accountType;

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ RefreshMonitorContext m32969b(RefreshMonitorContext refreshMonitorContext, String str, String str2, String str3, Long l11, String str4, long j11, Long l12, String str5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = refreshMonitorContext.source;
            }
            if ((i11 & 2) != 0) {
                str2 = refreshMonitorContext.triggerPath;
            }
            if ((i11 & 4) != 0) {
                str3 = refreshMonitorContext.refreshType;
            }
            if ((i11 & 8) != 0) {
                l11 = refreshMonitorContext.hardWaitStart;
            }
            if ((i11 & 16) != 0) {
                str4 = refreshMonitorContext.monitorName;
            }
            if ((i11 & 32) != 0) {
                j11 = refreshMonitorContext.sessionGeneration;
            }
            if ((i11 & 64) != 0) {
                l12 = refreshMonitorContext.manualRefreshTimeLimit;
            }
            if ((i11 & 128) != 0) {
                str5 = refreshMonitorContext.accountType;
            }
            long j12 = j11;
            Long l13 = l11;
            String str6 = str4;
            String str7 = str3;
            return refreshMonitorContext.m32970a(str, str2, str7, l13, str6, j12, l12, str5);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RefreshMonitorContext)) {
                return false;
            }
            RefreshMonitorContext refreshMonitorContext = (RefreshMonitorContext) other;
            return Intrinsics.areEqual(this.source, refreshMonitorContext.source) && Intrinsics.areEqual(this.triggerPath, refreshMonitorContext.triggerPath) && Intrinsics.areEqual(this.refreshType, refreshMonitorContext.refreshType) && Intrinsics.areEqual(this.hardWaitStart, refreshMonitorContext.hardWaitStart) && Intrinsics.areEqual(this.monitorName, refreshMonitorContext.monitorName) && this.sessionGeneration == refreshMonitorContext.sessionGeneration && Intrinsics.areEqual(this.manualRefreshTimeLimit, refreshMonitorContext.manualRefreshTimeLimit) && Intrinsics.areEqual(this.accountType, refreshMonitorContext.accountType);
        }

        public RefreshMonitorContext(@NotNull String source, @NotNull String triggerPath, @Nullable String str, @Nullable Long l11, @NotNull String monitorName, long j11, @Nullable Long l12, @NotNull String accountType) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(triggerPath, "triggerPath");
            Intrinsics.checkNotNullParameter(monitorName, "monitorName");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            this.source = source;
            this.triggerPath = triggerPath;
            this.refreshType = str;
            this.hardWaitStart = l11;
            this.monitorName = monitorName;
            this.sessionGeneration = j11;
            this.manualRefreshTimeLimit = l12;
            this.accountType = accountType;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final RefreshMonitorContext m32970a(@NotNull String source, @NotNull String triggerPath, @Nullable String str, @Nullable Long l11, @NotNull String monitorName, long j11, @Nullable Long l12, @NotNull String accountType) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(triggerPath, "triggerPath");
            Intrinsics.checkNotNullParameter(monitorName, "monitorName");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            return new RefreshMonitorContext(source, triggerPath, str, l11, monitorName, j11, l12, accountType);
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getAccountType() {
            return this.accountType;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final Long getHardWaitStart() {
            return this.hardWaitStart;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final Long getManualRefreshTimeLimit() {
            return this.manualRefreshTimeLimit;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getMonitorName() {
            return this.monitorName;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getRefreshType() {
            return this.refreshType;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final long getSessionGeneration() {
            return this.sessionGeneration;
        }

        public int hashCode() {
            int iHashCode = ((this.source.hashCode() * 31) + this.triggerPath.hashCode()) * 31;
            String str = this.refreshType;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l11 = this.hardWaitStart;
            int iHashCode3 = (((((iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31) + this.monitorName.hashCode()) * 31) + Long.hashCode(this.sessionGeneration)) * 31;
            Long l12 = this.manualRefreshTimeLimit;
            return ((iHashCode3 + (l12 != null ? l12.hashCode() : 0)) * 31) + this.accountType.hashCode();
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getTriggerPath() {
            return this.triggerPath;
        }

        /* JADX INFO: renamed from: k */
        public final void m32979k(@Nullable Long l11) {
            this.hardWaitStart = l11;
        }

        /* JADX INFO: renamed from: l */
        public final void m32980l(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.monitorName = str;
        }

        /* JADX INFO: renamed from: m */
        public final void m32981m(@Nullable String str) {
            this.refreshType = str;
        }

        /* JADX INFO: renamed from: n */
        public final void m32982n(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.source = str;
        }

        /* JADX INFO: renamed from: o */
        public final void m32983o(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.triggerPath = str;
        }

        @NotNull
        public String toString() {
            return "RefreshMonitorContext(source=" + this.source + ", triggerPath=" + this.triggerPath + ", refreshType=" + this.refreshType + ", hardWaitStart=" + this.hardWaitStart + ", monitorName=" + this.monitorName + ", sessionGeneration=" + this.sessionGeneration + ", manualRefreshTimeLimit=" + this.manualRefreshTimeLimit + ", accountType=" + this.accountType + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.token.TokenLifecycleManager$f, reason: from toString */
    /* JADX INFO: compiled from: TokenLifecycleManager.kt */
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J>\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\tHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m90084d2 = {"Lcom/kubi/kucoin/token/TokenLifecycleManager$RefreshTaskHandle;", "", "task", "Lkotlinx/coroutines/Deferred;", "Lcom/kubi/kucoin/token/TokenLifecycleRefreshResult;", "sessionGeneration", "", "manualRefreshTimeLimit", "accountType", "", "<init>", "(Lkotlinx/coroutines/Deferred;JLjava/lang/Long;Ljava/lang/String;)V", "getTask", "()Lkotlinx/coroutines/Deferred;", "getSessionGeneration", "()J", "getManualRefreshTimeLimit", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAccountType", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Lkotlinx/coroutines/Deferred;JLjava/lang/Long;Ljava/lang/String;)Lcom/kubi/kucoin/token/TokenLifecycleManager$RefreshTaskHandle;", "equals", "", "other", "hashCode", "", "toString", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class RefreshTaskHandle {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final InterfaceC41729r0<TokenLifecycleRefreshResult> task;

        /* JADX INFO: renamed from: b, reason: from toString */
        public final long sessionGeneration;

        /* JADX INFO: renamed from: c, reason: from toString */
        @Nullable
        public final Long manualRefreshTimeLimit;

        /* JADX INFO: renamed from: d, reason: from toString */
        @NotNull
        public final String accountType;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RefreshTaskHandle)) {
                return false;
            }
            RefreshTaskHandle refreshTaskHandle = (RefreshTaskHandle) other;
            return Intrinsics.areEqual(this.task, refreshTaskHandle.task) && this.sessionGeneration == refreshTaskHandle.sessionGeneration && Intrinsics.areEqual(this.manualRefreshTimeLimit, refreshTaskHandle.manualRefreshTimeLimit) && Intrinsics.areEqual(this.accountType, refreshTaskHandle.accountType);
        }

        public RefreshTaskHandle(@NotNull InterfaceC41729r0<TokenLifecycleRefreshResult> task, long j11, @Nullable Long l11, @NotNull String accountType) {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            this.task = task;
            this.sessionGeneration = j11;
            this.manualRefreshTimeLimit = l11;
            this.accountType = accountType;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAccountType() {
            return this.accountType;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Long getManualRefreshTimeLimit() {
            return this.manualRefreshTimeLimit;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getSessionGeneration() {
            return this.sessionGeneration;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final InterfaceC41729r0<TokenLifecycleRefreshResult> m32987d() {
            return this.task;
        }

        public int hashCode() {
            int iHashCode = ((this.task.hashCode() * 31) + Long.hashCode(this.sessionGeneration)) * 31;
            Long l11 = this.manualRefreshTimeLimit;
            return ((iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31) + this.accountType.hashCode();
        }

        @NotNull
        public String toString() {
            return "RefreshTaskHandle(task=" + this.task + ", sessionGeneration=" + this.sessionGeneration + ", manualRefreshTimeLimit=" + this.manualRefreshTimeLimit + ", accountType=" + this.accountType + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.token.TokenLifecycleManager$g, reason: from toString */
    /* JADX INFO: compiled from: TokenLifecycleManager.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/kucoin/token/TokenLifecycleManager$TokenAnchor;", "", "accountId", "", "accessToken", "expireAt", "", "monoExpireAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJ)V", "getAccountId", "()Ljava/lang/String;", "getAccessToken", "getExpireAt", "()J", "getMonoExpireAt", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class TokenAnchor {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String accountId;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final String accessToken;

        /* JADX INFO: renamed from: c, reason: from toString */
        public final long expireAt;

        /* JADX INFO: renamed from: d, reason: from toString */
        public final long monoExpireAt;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TokenAnchor)) {
                return false;
            }
            TokenAnchor tokenAnchor = (TokenAnchor) other;
            return Intrinsics.areEqual(this.accountId, tokenAnchor.accountId) && Intrinsics.areEqual(this.accessToken, tokenAnchor.accessToken) && this.expireAt == tokenAnchor.expireAt && this.monoExpireAt == tokenAnchor.monoExpireAt;
        }

        public TokenAnchor(@NotNull String accountId, @NotNull String accessToken, long j11, long j12) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            this.accountId = accountId;
            this.accessToken = accessToken;
            this.expireAt = j11;
            this.monoExpireAt = j12;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAccessToken() {
            return this.accessToken;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getExpireAt() {
            return this.expireAt;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getMonoExpireAt() {
            return this.monoExpireAt;
        }

        public int hashCode() {
            return (((((this.accountId.hashCode() * 31) + this.accessToken.hashCode()) * 31) + Long.hashCode(this.expireAt)) * 31) + Long.hashCode(this.monoExpireAt);
        }

        @NotNull
        public String toString() {
            return "TokenAnchor(accountId=" + this.accountId + ", accessToken=" + this.accessToken + ", expireAt=" + this.expireAt + ", monoExpireAt=" + this.monoExpireAt + ')';
        }
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ RefreshTaskHandle m32887H(TokenLifecycleManager tokenLifecycleManager, String str, String str2, String str3, long j11, String str4, String str5, Long l11, Long l12, String str6, int i11, Object obj) {
        return tokenLifecycleManager.m32916G(str, str2, str3, (i11 & 8) != 0 ? 0L : j11, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : l11, (i11 & 128) != 0 ? null : l12, (i11 & 256) != 0 ? null : str6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public static /* synthetic */ Object m32909t(TokenLifecycleManager tokenLifecycleManager, String str, String str2, String str3, long j11, String str4, boolean z11, Long l11, String str5, Function1 function1, Continuation continuation, int i11, Object obj) {
        return tokenLifecycleManager.m32947s(str, str2, str3, (i11 & 8) != 0 ? 0L : j11, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? null : l11, (i11 & 128) != 0 ? null : str5, (i11 & 256) != 0 ? null : function1, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a8 A[Catch: all -> 0x0040, CancellationException -> 0x0043, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003b, B:26:0x00a0, B:28:0x00a8, B:30:0x00c3, B:32:0x00c9, B:36:0x00d7, B:38:0x00dd, B:40:0x00fa, B:43:0x0101, B:44:0x0103, B:49:0x0111, B:51:0x0114, B:53:0x0149, B:56:0x017f, B:57:0x0180), top: B:63:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c3 A[Catch: all -> 0x0040, CancellationException -> 0x0043, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003b, B:26:0x00a0, B:28:0x00a8, B:30:0x00c3, B:32:0x00c9, B:36:0x00d7, B:38:0x00dd, B:40:0x00fa, B:43:0x0101, B:44:0x0103, B:49:0x0111, B:51:0x0114, B:53:0x0149, B:56:0x017f, B:57:0x0180), top: B:63:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c9 A[Catch: all -> 0x0040, CancellationException -> 0x0043, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003b, B:26:0x00a0, B:28:0x00a8, B:30:0x00c3, B:32:0x00c9, B:36:0x00d7, B:38:0x00dd, B:40:0x00fa, B:43:0x0101, B:44:0x0103, B:49:0x0111, B:51:0x0114, B:53:0x0149, B:56:0x017f, B:57:0x0180), top: B:63:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00dd A[Catch: all -> 0x0040, CancellationException -> 0x0043, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003b, B:26:0x00a0, B:28:0x00a8, B:30:0x00c3, B:32:0x00c9, B:36:0x00d7, B:38:0x00dd, B:40:0x00fa, B:43:0x0101, B:44:0x0103, B:49:0x0111, B:51:0x0114, B:53:0x0149, B:56:0x017f, B:57:0x0180), top: B:63:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00fa A[Catch: all -> 0x0040, CancellationException -> 0x0043, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003b, B:26:0x00a0, B:28:0x00a8, B:30:0x00c3, B:32:0x00c9, B:36:0x00d7, B:38:0x00dd, B:40:0x00fa, B:43:0x0101, B:44:0x0103, B:49:0x0111, B:51:0x0114, B:53:0x0149, B:56:0x017f, B:57:0x0180), top: B:63:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0100 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x0101 A[Catch: all -> 0x0040, CancellationException -> 0x0043, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003b, B:26:0x00a0, B:28:0x00a8, B:30:0x00c3, B:32:0x00c9, B:36:0x00d7, B:38:0x00dd, B:40:0x00fa, B:43:0x0101, B:44:0x0103, B:49:0x0111, B:51:0x0114, B:53:0x0149, B:56:0x017f, B:57:0x0180), top: B:63:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x010a  */
    /* JADX WARN: Code duplicated, block: B:48:0x010c A[Catch: all -> 0x017e, TRY_LEAVE, TryCatch #3 {, blocks: (B:45:0x0104, B:48:0x010c), top: B:67:0x0104 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0114 A[Catch: all -> 0x0040, CancellationException -> 0x0043, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003b, B:26:0x00a0, B:28:0x00a8, B:30:0x00c3, B:32:0x00c9, B:36:0x00d7, B:38:0x00dd, B:40:0x00fa, B:43:0x0101, B:44:0x0103, B:49:0x0111, B:51:0x0114, B:53:0x0149, B:56:0x017f, B:57:0x0180), top: B:63:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0149 A[Catch: all -> 0x0040, CancellationException -> 0x0043, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003b, B:26:0x00a0, B:28:0x00a8, B:30:0x00c3, B:32:0x00c9, B:36:0x00d7, B:38:0x00dd, B:40:0x00fa, B:43:0x0101, B:44:0x0103, B:49:0x0111, B:51:0x0114, B:53:0x0149, B:56:0x017f, B:57:0x0180), top: B:63:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x00a8, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x0114, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x0149, please report this as an issue */
    /* JADX INFO: renamed from: E */
    public final Object m32914E(String str, String str2, String str3, long j11, long j12, TokenLifecycleRefreshContext tokenLifecycleRefreshContext, Continuation<? super TokenLifecycleRefreshResult> continuation) {
        TokenLifecycleManager$executeRefresh$1 tokenLifecycleManager$executeRefresh$1;
        String str4;
        TokenLifecycleRefreshContext tokenLifecycleRefreshContext2;
        long j13;
        String str5;
        TokenLifecycleRefreshResult tokenLifecycleRefreshResult;
        String accessToken;
        String string;
        if (continuation instanceof TokenLifecycleManager$executeRefresh$1) {
            tokenLifecycleManager$executeRefresh$1 = (TokenLifecycleManager$executeRefresh$1) continuation;
            int i11 = tokenLifecycleManager$executeRefresh$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                tokenLifecycleManager$executeRefresh$1.label = i11 - Integer.MIN_VALUE;
            } else {
                tokenLifecycleManager$executeRefresh$1 = new TokenLifecycleManager$executeRefresh$1(this, continuation);
            }
        } else {
            tokenLifecycleManager$executeRefresh$1 = new TokenLifecycleManager$executeRefresh$1(this, continuation);
        }
        TokenLifecycleManager$executeRefresh$1 tokenLifecycleManager$executeRefresh$2 = tokenLifecycleManager$executeRefresh$1;
        Object obj = tokenLifecycleManager$executeRefresh$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = tokenLifecycleManager$executeRefresh$2.label;
        boolean z11 = true;
        try {
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j14 = tokenLifecycleManager$executeRefresh$2.J$1;
                tokenLifecycleRefreshContext2 = (TokenLifecycleRefreshContext) tokenLifecycleManager$executeRefresh$2.L$3;
                str4 = (String) tokenLifecycleManager$executeRefresh$2.L$1;
                str5 = (String) tokenLifecycleManager$executeRefresh$2.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    j13 = j14;
                    tokenLifecycleRefreshResult = (TokenLifecycleRefreshResult) obj;
                    if (!m32924P(j13)) {
                        C44128b.m97261e("TokenLifecycle", "Refresh result discarded: login session invalidated, triggerPath=" + str4);
                        return m32921M(tokenLifecycleRefreshResult);
                    }
                    accessToken = tokenLifecycleRefreshResult.getAccessToken();
                    if (accessToken != null) {
                        string = StringsKt.trim((CharSequence) accessToken).toString();
                    } else {
                        string = null;
                    }
                    if (string == null) {
                        string = "";
                    }
                    if (string.length() == 0) {
                        return TokenLifecycleRefreshResult.m33016b(tokenLifecycleRefreshResult, null, null, null, null, null, false, 62, null);
                    }
                    if (Intrinsics.areEqual(string, str5)) {
                        return tokenLifecycleRefreshResult;
                    }
                    synchronized (f28431h) {
                        if (j13 != f28433j) {
                            z11 = false;
                        } else {
                            f28424a.m32935a0(str5, string);
                        }
                    }
                    if (z11) {
                        C44128b.m97261e("TokenLifecycle", "Refresh result discarded: login session invalidated, triggerPath=" + str4);
                        return TokenLifecycleRefreshResult.m33016b(tokenLifecycleRefreshResult, null, "failed", null, "network_error", null, false, 52, null);
                    }
                    m32920L(string);
                    C44128b.m97261e("TokenLifecycle", "Token refresh succeeded and latest mapping recorded, triggerPath=" + str4);
                    return TokenLifecycleRefreshResult.m33016b(tokenLifecycleRefreshResult, string, null, null, null, null, false, 62, null);
                } catch (Throwable th2) {
                    th = th2;
                    C44128b.m97262f("TokenLifecycle", "Token refresh failed with exception, triggerPath=" + str4, th);
                    return new TokenLifecycleRefreshResult(null, "failed", tokenLifecycleRefreshContext2.getAccountType(), "network_error", null, false, 48, null);
                }
            }
            ResultKt.throwOnFailure(obj);
            C44128b.m97261e("TokenLifecycle", "Starting token refresh, source=" + str3 + ", triggerPath=" + str2);
            try {
                ITokenLifecycleRefreshSPI iTokenLifecycleRefreshSPI = (ITokenLifecycleRefreshSPI) Router.f46192a.m56192n(ITokenLifecycleRefreshSPI.class);
                tokenLifecycleManager$executeRefresh$2.L$0 = str;
                tokenLifecycleManager$executeRefresh$2.L$1 = str2;
                tokenLifecycleManager$executeRefresh$2.L$2 = SpillingKt.nullOutSpilledVariable(str3);
                tokenLifecycleManager$executeRefresh$2.L$3 = tokenLifecycleRefreshContext;
                tokenLifecycleManager$executeRefresh$2.J$0 = j11;
                j13 = j12;
                tokenLifecycleManager$executeRefresh$2.J$1 = j13;
                tokenLifecycleManager$executeRefresh$2.label = 1;
                Object objMo32883a = iTokenLifecycleRefreshSPI.mo32883a(str2, tokenLifecycleRefreshContext, str3, j11, tokenLifecycleManager$executeRefresh$2);
                if (objMo32883a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str5 = str;
                str4 = str2;
                obj = objMo32883a;
                tokenLifecycleRefreshResult = (TokenLifecycleRefreshResult) obj;
                if (!m32924P(j13)) {
                    C44128b.m97261e("TokenLifecycle", "Refresh result discarded: login session invalidated, triggerPath=" + str4);
                    return m32921M(tokenLifecycleRefreshResult);
                }
                accessToken = tokenLifecycleRefreshResult.getAccessToken();
                if (accessToken != null) {
                    string = StringsKt.trim((CharSequence) accessToken).toString();
                } else {
                    string = null;
                }
                if (string == null) {
                    string = "";
                }
                if (string.length() == 0) {
                    return TokenLifecycleRefreshResult.m33016b(tokenLifecycleRefreshResult, null, null, null, null, null, false, 62, null);
                }
                if (Intrinsics.areEqual(string, str5)) {
                    return tokenLifecycleRefreshResult;
                }
                synchronized (f28431h) {
                    if (j13 != f28433j) {
                        z11 = false;
                    } else {
                        f28424a.m32935a0(str5, string);
                    }
                    if (z11) {
                        C44128b.m97261e("TokenLifecycle", "Refresh result discarded: login session invalidated, triggerPath=" + str4);
                        return TokenLifecycleRefreshResult.m33016b(tokenLifecycleRefreshResult, null, "failed", null, "network_error", null, false, 52, null);
                    }
                    m32920L(string);
                    C44128b.m97261e("TokenLifecycle", "Token refresh succeeded and latest mapping recorded, triggerPath=" + str4);
                    return TokenLifecycleRefreshResult.m33016b(tokenLifecycleRefreshResult, string, null, null, null, null, false, 62, null);
                }
            } catch (Throwable th3) {
                th = th3;
                str4 = str2;
                tokenLifecycleRefreshContext2 = tokenLifecycleRefreshContext;
                C44128b.m97262f("TokenLifecycle", "Token refresh failed with exception, triggerPath=" + str4, th);
                return new TokenLifecycleRefreshResult(null, "failed", tokenLifecycleRefreshContext2.getAccountType(), "network_error", null, false, 48, null);
            }
        } catch (CancellationException e11) {
            throw e11;
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [T, com.kubi.kucoin.token.TokenLifecycleManager$e, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: G */
    public final RefreshTaskHandle m32916G(String str, String str2, String str3, long j11, String str4, String str5, Long l11, Long l12, String str6) {
        String str7;
        Long lValueOf;
        String strM32926R;
        String strM32926R2;
        String strM32926R3;
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = -1L;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (f28431h) {
            if (l12 != null) {
                try {
                    if (l12.longValue() != f28433j) {
                        String strM32926R4 = str6 == null ? f28424a.m32926R(str) : str6;
                        C44128b.m97261e("TokenLifecycle", "Refresh follow-up rejected: login session generation changed");
                        return new RefreshTaskHandle(C41777y.m91386a(f28424a.m32915F(strM32926R4)), l12.longValue(), Intrinsics.areEqual(str3, ITokenLifecycleRefreshSPI.Companion.SOURCE_MANUAL) ? Long.valueOf(j11) : null, strM32926R4);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            String str8 = (String) f28434k.get((Object) str);
            if (str8 != null) {
                InterfaceC41729r0<TokenLifecycleRefreshResult> interfaceC41729r0 = f28428e.get(str8);
                if (interfaceC41729r0 != null) {
                    if (interfaceC41729r0.isCompleted()) {
                        interfaceC41729r0 = null;
                    }
                    if (interfaceC41729r0 != null) {
                        TokenLifecycleManager tokenLifecycleManager = f28424a;
                        tokenLifecycleManager.m32934Z(interfaceC41729r0, str8, str2, str3, str4, l11);
                        InterfaceC41729r0<TokenLifecycleRefreshResult> interfaceC41729r1 = interfaceC41729r0;
                        tokenLifecycleManager.m32938f0(str5, str8, interfaceC41729r1, tokenLifecycleManager.m32910A(str5, str8, str2, str3, str4));
                        C44128b.m97261e("TokenLifecycle", "SingleFlight matched latest token in-flight refresh task");
                        Map<InterfaceC41729r0<TokenLifecycleRefreshResult>, RefreshMonitorContext> map = f28429f;
                        RefreshMonitorContext refreshMonitorContext = map.get(interfaceC41729r1);
                        long sessionGeneration = refreshMonitorContext != null ? refreshMonitorContext.getSessionGeneration() : f28433j;
                        RefreshMonitorContext refreshMonitorContext2 = map.get(interfaceC41729r1);
                        lValueOf = refreshMonitorContext2 != null ? refreshMonitorContext2.getManualRefreshTimeLimit() : null;
                        RefreshMonitorContext refreshMonitorContext3 = map.get(interfaceC41729r1);
                        if (refreshMonitorContext3 == null || (strM32926R3 = refreshMonitorContext3.getAccountType()) == null) {
                            strM32926R3 = tokenLifecycleManager.m32926R(str8);
                        }
                        return new RefreshTaskHandle(interfaceC41729r1, sessionGeneration, lValueOf, strM32926R3);
                    }
                }
                C44128b.m97261e("TokenLifecycle", "SingleFlight matched completed token mapping");
                TokenLifecycleRefreshResult tokenLifecycleRefreshResultM32925Q = f28424a.m32925Q(str8);
                return new RefreshTaskHandle(C41777y.m91386a(tokenLifecycleRefreshResultM32925Q), f28433j, null, tokenLifecycleRefreshResultM32925Q.getAccountType());
            }
            Map<String, InterfaceC41729r0<TokenLifecycleRefreshResult>> map2 = f28428e;
            InterfaceC41729r0<TokenLifecycleRefreshResult> interfaceC41729r2 = map2.get(str);
            if (interfaceC41729r2 == null) {
                str7 = str;
            } else {
                if (!interfaceC41729r2.isCompleted()) {
                    TokenLifecycleManager tokenLifecycleManager2 = f28424a;
                    tokenLifecycleManager2.m32934Z(interfaceC41729r2, str, str2, str3, str4, l11);
                    tokenLifecycleManager2.m32938f0(str5, str, interfaceC41729r2, tokenLifecycleManager2.m32910A(str5, str, str2, str3, str4));
                    C44128b.m97261e("TokenLifecycle", "SingleFlight reused in-flight refresh task");
                    Map<InterfaceC41729r0<TokenLifecycleRefreshResult>, RefreshMonitorContext> map3 = f28429f;
                    RefreshMonitorContext refreshMonitorContext4 = map3.get(interfaceC41729r2);
                    long sessionGeneration2 = refreshMonitorContext4 != null ? refreshMonitorContext4.getSessionGeneration() : f28433j;
                    RefreshMonitorContext refreshMonitorContext5 = map3.get(interfaceC41729r2);
                    lValueOf = refreshMonitorContext5 != null ? refreshMonitorContext5.getManualRefreshTimeLimit() : null;
                    RefreshMonitorContext refreshMonitorContext6 = map3.get(interfaceC41729r2);
                    if (refreshMonitorContext6 == null || (strM32926R2 = refreshMonitorContext6.getAccountType()) == null) {
                        strM32926R2 = tokenLifecycleManager2.m32926R(str);
                    }
                    return new RefreshTaskHandle(interfaceC41729r2, sessionGeneration2, lValueOf, strM32926R2);
                }
                str7 = str;
                map2.remove(str7);
                C44128b.m97261e("TokenLifecycle", "SingleFlight evicted completed refresh task without token rotation");
            }
            long j12 = f28433j;
            longRef.element = j12;
            TokenLifecycleManager tokenLifecycleManager3 = f28424a;
            TokenLifecycleRefreshContext tokenLifecycleRefreshContextM32940h0 = tokenLifecycleManager3.m32940h0(str7);
            ?? refreshMonitorContext7 = new RefreshMonitorContext(str3, str2, str4, Intrinsics.areEqual(str4, "hard") ? l11 : null, tokenLifecycleManager3.m32929U(str7), j12, Intrinsics.areEqual(str3, ITokenLifecycleRefreshSPI.Companion.SOURCE_MANUAL) ? Long.valueOf(j11) : null, tokenLifecycleRefreshContextM32940h0.getAccountType());
            objectRef.element = refreshMonitorContext7;
            InterfaceC41709m0 interfaceC41709m0 = f28427d;
            String str9 = str7;
            InterfaceC41729r0<TokenLifecycleRefreshResult> interfaceC41729r0M91102b = C41696j.m91102b(interfaceC41709m0, null, CoroutineStart.LAZY, new TokenLifecycleManager$getOrCreateRefresh$task$1$4(str9, str2, str3, j11, j12, tokenLifecycleRefreshContextM32940h0, null), 1, null);
            map2.put(str9, interfaceC41729r0M91102b);
            f28429f.put(interfaceC41729r0M91102b, (RefreshMonitorContext) refreshMonitorContext7);
            tokenLifecycleManager3.m32938f0(str5, str9, interfaceC41729r0M91102b, tokenLifecycleManager3.m32910A(str5, str9, str2, str3, str4));
            C44128b.m97261e("TokenLifecycle", "SingleFlight created refresh task, triggerPath=" + str2);
            interfaceC41729r0M91102b.start();
            C41696j.m91104d(interfaceC41709m0, null, null, new TokenLifecycleManager$getOrCreateRefresh$1(interfaceC41729r0M91102b, objectRef, longRef, str9, null), 3, null);
            long j13 = longRef.element;
            lValueOf = Intrinsics.areEqual(str3, ITokenLifecycleRefreshSPI.Companion.SOURCE_MANUAL) ? Long.valueOf(j11) : null;
            RefreshMonitorContext refreshMonitorContext8 = (RefreshMonitorContext) objectRef.element;
            if (refreshMonitorContext8 == null || (strM32926R = refreshMonitorContext8.getAccountType()) == null) {
                strM32926R = m32926R(str);
            }
            return new RefreshTaskHandle(interfaceC41729r0M91102b, j13, lValueOf, strM32926R);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Nullable
    /* JADX INFO: renamed from: d0 */
    public final Object m32937d0(@NotNull String str, @NotNull String str2, @NotNull String str3, long j11, @NotNull Continuation<? super String> continuation) {
        TokenLifecycleManager$refreshTokenFromExternal$1 tokenLifecycleManager$refreshTokenFromExternal$1;
        if (continuation instanceof TokenLifecycleManager$refreshTokenFromExternal$1) {
            tokenLifecycleManager$refreshTokenFromExternal$1 = (TokenLifecycleManager$refreshTokenFromExternal$1) continuation;
            int i11 = tokenLifecycleManager$refreshTokenFromExternal$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                tokenLifecycleManager$refreshTokenFromExternal$1.label = i11 - Integer.MIN_VALUE;
            } else {
                tokenLifecycleManager$refreshTokenFromExternal$1 = new TokenLifecycleManager$refreshTokenFromExternal$1(this, continuation);
            }
        } else {
            tokenLifecycleManager$refreshTokenFromExternal$1 = new TokenLifecycleManager$refreshTokenFromExternal$1(this, continuation);
        }
        TokenLifecycleManager$refreshTokenFromExternal$1 tokenLifecycleManager$refreshTokenFromExternal$2 = tokenLifecycleManager$refreshTokenFromExternal$1;
        Object objM32909t = tokenLifecycleManager$refreshTokenFromExternal$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = tokenLifecycleManager$refreshTokenFromExternal$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM32909t);
            String string = StringsKt.trim((CharSequence) str2).toString();
            if (string.length() == 0) {
                String str4 = UserInfo.c().token;
                string = str4 != null ? StringsKt.trim((CharSequence) str4).toString() : null;
                if (string == null) {
                    string = "";
                }
            }
            if (string.length() == 0) {
                C44128b.m97261e("TokenLifecycle", "External refresh skipped: access token is empty, source=" + str3);
                return null;
            }
            String str5 = StringsKt.isBlank(str) ? "token_lifecycle" : str;
            long jM32912C = m32912C(str3, j11);
            C44128b.m97261e("TokenLifecycle", "External refresh joined lifecycle SingleFlight, source=" + str3);
            tokenLifecycleManager$refreshTokenFromExternal$2.L$0 = SpillingKt.nullOutSpilledVariable(str);
            tokenLifecycleManager$refreshTokenFromExternal$2.L$1 = SpillingKt.nullOutSpilledVariable(str2);
            tokenLifecycleManager$refreshTokenFromExternal$2.L$2 = SpillingKt.nullOutSpilledVariable(str3);
            tokenLifecycleManager$refreshTokenFromExternal$2.L$3 = SpillingKt.nullOutSpilledVariable(string);
            tokenLifecycleManager$refreshTokenFromExternal$2.L$4 = SpillingKt.nullOutSpilledVariable(str5);
            tokenLifecycleManager$refreshTokenFromExternal$2.J$0 = j11;
            tokenLifecycleManager$refreshTokenFromExternal$2.J$1 = jM32912C;
            tokenLifecycleManager$refreshTokenFromExternal$2.label = 1;
            objM32909t = m32909t(this, string, str5, str3, jM32912C, "force", false, null, null, null, tokenLifecycleManager$refreshTokenFromExternal$2, TXVodDownloadDataSource.QUALITY_480P, null);
            if (objM32909t == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM32909t);
        }
        return ((TokenLifecycleRefreshResult) objM32909t).getAccessToken();
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0162  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ed, code lost:
    
        if (r3 == r13) goto L73;
     */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m32946r(String str, String str2, Function1<? super String, Unit> function1, Continuation<? super BlockingRefreshBarrierResult> continuation) {
        TokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$1 tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$1;
        BlockingRefreshBarrier blockingRefreshBarrier;
        String str3;
        long j11;
        String str4;
        String str5;
        BlockingRefreshBarrier blockingRefreshBarrier2;
        TokenLifecycleRefreshResult tokenLifecycleRefreshResult;
        BlockingRefreshBarrier blockingRefreshBarrier3;
        String accessToken;
        Function1<? super String, Unit> function2 = function1;
        if (continuation instanceof TokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$1) {
            tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$1 = (TokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$1) continuation;
            int i11 = tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$1.label = i11 - Integer.MIN_VALUE;
            } else {
                tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$1 = new TokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$1(this, continuation);
            }
        } else {
            tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$1 = new TokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$1(this, continuation);
        }
        TokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$1 tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$2 = tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$1;
        Object objM32948u = tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$2.label;
        if (i12 != 0) {
            if (i12 == 1) {
                j11 = tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$2.J$0;
                BlockingRefreshBarrier blockingRefreshBarrier4 = (BlockingRefreshBarrier) tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$2.L$3;
                function2 = (Function1) tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$2.L$2;
                String str6 = (String) tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$2.L$1;
                str4 = (String) tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$2.L$0;
                ResultKt.throwOnFailure(objM32948u);
                blockingRefreshBarrier = blockingRefreshBarrier4;
                str5 = str6;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                blockingRefreshBarrier2 = (BlockingRefreshBarrier) tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$2.L$3;
                ResultKt.throwOnFailure(objM32948u);
            }
            tokenLifecycleRefreshResult = (TokenLifecycleRefreshResult) objM32948u;
            blockingRefreshBarrier3 = blockingRefreshBarrier2;
            accessToken = tokenLifecycleRefreshResult.getAccessToken();
            if ((accessToken == null && accessToken.length() != 0) || (strM32939g0 = m32939g0(blockingRefreshBarrier3.getFallbackToken())) == null) {
            }
            return new BlockingRefreshBarrierResult(tokenLifecycleRefreshResult, strM32939g0);
        }
        ResultKt.throwOnFailure(objM32948u);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (f28431h) {
            try {
                Map<String, BlockingRefreshBarrier> map = f28430g;
                blockingRefreshBarrier = map.get(str);
                if (blockingRefreshBarrier == null) {
                    String str7 = (String) f28434k.get((Object) str);
                    blockingRefreshBarrier = str7 != null ? map.get(str7) : null;
                }
                if (blockingRefreshBarrier != null) {
                    RefreshMonitorContext refreshMonitorContext = f28429f.get(blockingRefreshBarrier.m32959e());
                    if (Intrinsics.areEqual(refreshMonitorContext != null ? refreshMonitorContext.getRefreshType() : null, "hard") && refreshMonitorContext.getHardWaitStart() == null) {
                        refreshMonitorContext.m32982n(ITokenLifecycleRefreshSPI.Companion.SOURCE_PREFLIGHT);
                        str3 = str2;
                        refreshMonitorContext.m32983o(str3);
                        refreshMonitorContext.m32979k(Boxing.boxLong(jElapsedRealtime));
                    } else {
                        str3 = str2;
                    }
                } else {
                    str3 = str2;
                    blockingRefreshBarrier = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (blockingRefreshBarrier == null) {
            return null;
        }
        if (function2 != null) {
            function2.invoke(blockingRefreshBarrier.getAccountType());
        }
        C44128b.m97261e("TokenLifecycle", "Request joined active blocking token refresh barrier");
        InterfaceC41729r0<TokenLifecycleRefreshResult> interfaceC41729r0M32959e = blockingRefreshBarrier.m32959e();
        String accountType = blockingRefreshBarrier.getAccountType();
        tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$2.L$0 = str;
        tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$2.L$1 = SpillingKt.nullOutSpilledVariable(str3);
        tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$2.L$2 = SpillingKt.nullOutSpilledVariable(function2);
        tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$2.L$3 = blockingRefreshBarrier;
        tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$2.J$0 = jElapsedRealtime;
        tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$2.label = 1;
        Object objM32948u2 = m32948u(interfaceC41729r0M32959e, accountType, tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$2);
        if (objM32948u2 != coroutine_suspended) {
            objM32948u = objM32948u2;
            j11 = jElapsedRealtime;
            str4 = str;
            str5 = str3;
        }
        return coroutine_suspended;
        Function1<? super String, Unit> function3 = function2;
        TokenLifecycleRefreshResult tokenLifecycleRefreshResult2 = (TokenLifecycleRefreshResult) objM32948u;
        if (!m32924P(blockingRefreshBarrier.getSessionGeneration())) {
            return new BlockingRefreshBarrierResult(m32921M(tokenLifecycleRefreshResult2), str4);
        }
        ForceRefreshContext forceContext = blockingRefreshBarrier.getForceContext();
        if (forceContext == null || !Intrinsics.areEqual(tokenLifecycleRefreshResult2.getResult(), "noop")) {
            blockingRefreshBarrier2 = blockingRefreshBarrier;
            tokenLifecycleRefreshResult = tokenLifecycleRefreshResult2;
        } else {
            C44128b.m97261e("TokenLifecycle", "Blocking barrier joined unrestricted follow-up after rate-limited noop");
            String accessToken2 = tokenLifecycleRefreshResult2.getAccessToken();
            if (accessToken2 == null) {
                accessToken2 = blockingRefreshBarrier.getFallbackToken();
            } else {
                if (accessToken2.length() <= 0) {
                    accessToken2 = null;
                }
                if (accessToken2 == null) {
                    accessToken2 = blockingRefreshBarrier.getFallbackToken();
                }
            }
            String triggerPath = forceContext.getTriggerPath();
            long j12 = j11;
            String source = forceContext.getSource();
            String str8 = accessToken2;
            String refreshType = forceContext.getRefreshType();
            Long lBoxLong = Boxing.boxLong(j12);
            lBoxLong.longValue();
            String str9 = str5;
            blockingRefreshBarrier2 = blockingRefreshBarrier;
            RefreshTaskHandle refreshTaskHandleM32916G = m32916G(str8, triggerPath, source, 0L, refreshType, str4, Intrinsics.areEqual(forceContext.getRefreshType(), "hard") ? lBoxLong : null, Boxing.boxLong(blockingRefreshBarrier.getSessionGeneration()), blockingRefreshBarrier.getAccountType());
            InterfaceC41729r0<TokenLifecycleRefreshResult> interfaceC41729r0M32987d = refreshTaskHandleM32916G.m32987d();
            String accountType2 = refreshTaskHandleM32916G.getAccountType();
            tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$2.L$0 = SpillingKt.nullOutSpilledVariable(str4);
            tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$2.L$1 = SpillingKt.nullOutSpilledVariable(str9);
            tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$2.L$2 = SpillingKt.nullOutSpilledVariable(function3);
            tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$2.L$3 = blockingRefreshBarrier2;
            tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$2.L$4 = SpillingKt.nullOutSpilledVariable(tokenLifecycleRefreshResult2);
            tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$2.L$5 = SpillingKt.nullOutSpilledVariable(forceContext);
            tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$2.L$6 = SpillingKt.nullOutSpilledVariable(str8);
            tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$2.L$7 = SpillingKt.nullOutSpilledVariable(refreshTaskHandleM32916G);
            tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$2.J$0 = j12;
            tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$2.label = 2;
            objM32948u = m32948u(interfaceC41729r0M32987d, accountType2, tokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$2);
        }
        blockingRefreshBarrier3 = blockingRefreshBarrier2;
        accessToken = tokenLifecycleRefreshResult.getAccessToken();
        String strM32939g0 = accessToken == null ? blockingRefreshBarrier3.getFallbackToken() : blockingRefreshBarrier3.getFallbackToken();
        return new BlockingRefreshBarrierResult(tokenLifecycleRefreshResult, strM32939g0);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX INFO: renamed from: s */
    public final Object m32947s(String str, String str2, String str3, long j11, String str4, boolean z11, Long l11, String str5, Function1<? super String, Unit> function1, Continuation<? super TokenLifecycleRefreshResult> continuation) {
        TokenLifecycleManager$awaitRefresh$1 tokenLifecycleManager$awaitRefresh$1;
        TokenLifecycleManager tokenLifecycleManager;
        int i11;
        String str6;
        String str7;
        String str8;
        Long l12;
        String str9;
        Object obj;
        String str10;
        Long l13;
        RefreshTaskHandle refreshTaskHandle;
        long j12;
        Function1<? super String, Unit> function2;
        String str11;
        String str12;
        Long manualRefreshTimeLimit;
        boolean z12 = z11;
        if (continuation instanceof TokenLifecycleManager$awaitRefresh$1) {
            tokenLifecycleManager$awaitRefresh$1 = (TokenLifecycleManager$awaitRefresh$1) continuation;
            int i12 = tokenLifecycleManager$awaitRefresh$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                tokenLifecycleManager$awaitRefresh$1.label = i12 - Integer.MIN_VALUE;
            } else {
                tokenLifecycleManager$awaitRefresh$1 = new TokenLifecycleManager$awaitRefresh$1(this, continuation);
            }
        } else {
            tokenLifecycleManager$awaitRefresh$1 = new TokenLifecycleManager$awaitRefresh$1(this, continuation);
        }
        TokenLifecycleManager$awaitRefresh$1 tokenLifecycleManager$awaitRefresh$2 = tokenLifecycleManager$awaitRefresh$1;
        Object obj2 = tokenLifecycleManager$awaitRefresh$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = tokenLifecycleManager$awaitRefresh$2.label;
        if (i13 == 0) {
            ResultKt.throwOnFailure(obj2);
            Long lBoxLong = Boxing.boxLong(SystemClock.elapsedRealtime());
            lBoxLong.longValue();
            Long l14 = Intrinsics.areEqual(str4, "hard") ? lBoxLong : null;
            tokenLifecycleManager = this;
            i11 = 1;
            RefreshTaskHandle refreshTaskHandleM32916G = tokenLifecycleManager.m32916G(str, str2, str3, j11, str4, z12 ? str : null, l14, l11, str5);
            if (function1 != null) {
                function1.invoke(refreshTaskHandleM32916G.getAccountType());
            }
            InterfaceC41729r0<TokenLifecycleRefreshResult> interfaceC41729r0M32987d = refreshTaskHandleM32916G.m32987d();
            String accountType = refreshTaskHandleM32916G.getAccountType();
            str6 = str;
            tokenLifecycleManager$awaitRefresh$2.L$0 = str6;
            tokenLifecycleManager$awaitRefresh$2.L$1 = str2;
            tokenLifecycleManager$awaitRefresh$2.L$2 = str3;
            tokenLifecycleManager$awaitRefresh$2.L$3 = str4;
            tokenLifecycleManager$awaitRefresh$2.L$4 = SpillingKt.nullOutSpilledVariable(l11);
            tokenLifecycleManager$awaitRefresh$2.L$5 = SpillingKt.nullOutSpilledVariable(str5);
            tokenLifecycleManager$awaitRefresh$2.L$6 = function1;
            tokenLifecycleManager$awaitRefresh$2.L$7 = l14;
            tokenLifecycleManager$awaitRefresh$2.L$8 = refreshTaskHandleM32916G;
            tokenLifecycleManager$awaitRefresh$2.J$0 = j11;
            tokenLifecycleManager$awaitRefresh$2.Z$0 = z12;
            tokenLifecycleManager$awaitRefresh$2.label = 1;
            Object objM32948u = tokenLifecycleManager.m32948u(interfaceC41729r0M32987d, accountType, tokenLifecycleManager$awaitRefresh$2);
            if (objM32948u != coroutine_suspended) {
                str7 = str2;
                str8 = str3;
                l12 = l14;
                str9 = str5;
                obj = objM32948u;
                str10 = str4;
                l13 = l11;
                refreshTaskHandle = refreshTaskHandleM32916G;
                j12 = j11;
                function2 = function1;
            }
        }
        if (i13 != 1) {
            if (i13 == 2) {
            } else if (i13 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj2);
            return obj2;
        }
        boolean z13 = tokenLifecycleManager$awaitRefresh$2.Z$0;
        j12 = tokenLifecycleManager$awaitRefresh$2.J$0;
        RefreshTaskHandle refreshTaskHandle2 = (RefreshTaskHandle) tokenLifecycleManager$awaitRefresh$2.L$8;
        Long l15 = (Long) tokenLifecycleManager$awaitRefresh$2.L$7;
        function2 = (Function1) tokenLifecycleManager$awaitRefresh$2.L$6;
        String str13 = (String) tokenLifecycleManager$awaitRefresh$2.L$5;
        l13 = (Long) tokenLifecycleManager$awaitRefresh$2.L$4;
        String str14 = (String) tokenLifecycleManager$awaitRefresh$2.L$3;
        str8 = (String) tokenLifecycleManager$awaitRefresh$2.L$2;
        String str15 = (String) tokenLifecycleManager$awaitRefresh$2.L$1;
        String str16 = (String) tokenLifecycleManager$awaitRefresh$2.L$0;
        ResultKt.throwOnFailure(obj2);
        z12 = z13;
        str7 = str15;
        str9 = str13;
        l12 = l15;
        i11 = 1;
        refreshTaskHandle = refreshTaskHandle2;
        obj = obj2;
        str10 = str14;
        str6 = str16;
        tokenLifecycleManager = this;
        TokenLifecycleRefreshResult tokenLifecycleRefreshResult = (TokenLifecycleRefreshResult) obj;
        String str17 = str7;
        String str18 = str6;
        if (!tokenLifecycleManager.m32924P(refreshTaskHandle.getSessionGeneration())) {
            return tokenLifecycleManager.m32921M(tokenLifecycleRefreshResult);
        }
        int i14 = (Intrinsics.areEqual(str8, "401") || Intrinsics.areEqual(str10, "hard") || (Intrinsics.areEqual(str10, "force") && j12 <= 0)) ? i11 : 0;
        Long manualRefreshTimeLimit2 = refreshTaskHandle.getManualRefreshTimeLimit();
        int i15 = (manualRefreshTimeLimit2 == null || manualRefreshTimeLimit2.longValue() <= 0) ? 0 : i11;
        if (i14 != 0 && i15 != 0) {
            String str19 = str10;
            if (Intrinsics.areEqual(tokenLifecycleRefreshResult.getResult(), "noop")) {
                C44128b.m97261e("TokenLifecycle", "Rate-limited refresh cannot satisfy forced refresh; scheduling unrestricted follow-up");
                String accessToken = tokenLifecycleRefreshResult.getAccessToken();
                if (accessToken == null) {
                    accessToken = str18;
                } else {
                    if (accessToken.length() <= 0) {
                        accessToken = null;
                    }
                    if (accessToken == null) {
                        accessToken = str18;
                    }
                }
                String str20 = accessToken;
                Long l16 = l12;
                RefreshTaskHandle refreshTaskHandleM32916G2 = m32916G(str20, str17, str8, 0L, str19, z12 ? str18 : null, l16, Boxing.boxLong(refreshTaskHandle.getSessionGeneration()), refreshTaskHandle.getAccountType());
                if (function2 != null) {
                    function2.invoke(refreshTaskHandleM32916G2.getAccountType());
                }
                InterfaceC41729r0<TokenLifecycleRefreshResult> interfaceC41729r0M32987d2 = refreshTaskHandleM32916G2.m32987d();
                String str21 = str9;
                String accountType2 = refreshTaskHandleM32916G2.getAccountType();
                tokenLifecycleManager$awaitRefresh$2.L$0 = SpillingKt.nullOutSpilledVariable(str18);
                tokenLifecycleManager$awaitRefresh$2.L$1 = SpillingKt.nullOutSpilledVariable(str17);
                tokenLifecycleManager$awaitRefresh$2.L$2 = SpillingKt.nullOutSpilledVariable(str8);
                tokenLifecycleManager$awaitRefresh$2.L$3 = SpillingKt.nullOutSpilledVariable(str19);
                tokenLifecycleManager$awaitRefresh$2.L$4 = SpillingKt.nullOutSpilledVariable(l13);
                tokenLifecycleManager$awaitRefresh$2.L$5 = SpillingKt.nullOutSpilledVariable(str21);
                tokenLifecycleManager$awaitRefresh$2.L$6 = SpillingKt.nullOutSpilledVariable(function2);
                tokenLifecycleManager$awaitRefresh$2.L$7 = SpillingKt.nullOutSpilledVariable(l16);
                tokenLifecycleManager$awaitRefresh$2.L$8 = SpillingKt.nullOutSpilledVariable(refreshTaskHandle);
                tokenLifecycleManager$awaitRefresh$2.L$9 = SpillingKt.nullOutSpilledVariable(tokenLifecycleRefreshResult);
                tokenLifecycleManager$awaitRefresh$2.L$10 = SpillingKt.nullOutSpilledVariable(str20);
                tokenLifecycleManager$awaitRefresh$2.L$11 = SpillingKt.nullOutSpilledVariable(refreshTaskHandleM32916G2);
                tokenLifecycleManager$awaitRefresh$2.J$0 = j12;
                tokenLifecycleManager$awaitRefresh$2.Z$0 = z12;
                tokenLifecycleManager$awaitRefresh$2.I$0 = i14;
                tokenLifecycleManager$awaitRefresh$2.I$1 = i15;
                tokenLifecycleManager$awaitRefresh$2.label = 2;
                Object objM32948u2 = m32948u(interfaceC41729r0M32987d2, accountType2, tokenLifecycleManager$awaitRefresh$2);
                if (objM32948u2 != coroutine_suspended) {
                    return objM32948u2;
                }
            } else {
                str11 = str19;
            }
        }
        str11 = str10;
        int i16 = (!Intrinsics.areEqual(str8, ITokenLifecycleRefreshSPI.Companion.SOURCE_MANUAL) || j12 <= 0 || !Intrinsics.areEqual(tokenLifecycleRefreshResult.getResult(), "noop") || (manualRefreshTimeLimit = refreshTaskHandle.getManualRefreshTimeLimit()) == null || manualRefreshTimeLimit.longValue() <= j12) ? 0 : 1;
        if (i16 == 0) {
            return tokenLifecycleRefreshResult;
        }
        C44128b.m97261e("TokenLifecycle", "Manual refresh joined a looser rate-limit task; rechecking with caller policy");
        String accessToken2 = tokenLifecycleRefreshResult.getAccessToken();
        if (accessToken2 == null) {
            str12 = str18;
        } else {
            str12 = accessToken2.length() > 0 ? accessToken2 : null;
            if (str12 == null) {
                str12 = str18;
            }
        }
        Long lBoxLong2 = Boxing.boxLong(refreshTaskHandle.getSessionGeneration());
        RefreshTaskHandle refreshTaskHandle3 = refreshTaskHandle;
        String accountType3 = refreshTaskHandle3.getAccountType();
        tokenLifecycleManager$awaitRefresh$2.L$0 = SpillingKt.nullOutSpilledVariable(str18);
        tokenLifecycleManager$awaitRefresh$2.L$1 = SpillingKt.nullOutSpilledVariable(str17);
        tokenLifecycleManager$awaitRefresh$2.L$2 = SpillingKt.nullOutSpilledVariable(str8);
        tokenLifecycleManager$awaitRefresh$2.L$3 = SpillingKt.nullOutSpilledVariable(str11);
        tokenLifecycleManager$awaitRefresh$2.L$4 = SpillingKt.nullOutSpilledVariable(l13);
        tokenLifecycleManager$awaitRefresh$2.L$5 = SpillingKt.nullOutSpilledVariable(str9);
        tokenLifecycleManager$awaitRefresh$2.L$6 = SpillingKt.nullOutSpilledVariable(function2);
        tokenLifecycleManager$awaitRefresh$2.L$7 = SpillingKt.nullOutSpilledVariable(l12);
        tokenLifecycleManager$awaitRefresh$2.L$8 = SpillingKt.nullOutSpilledVariable(refreshTaskHandle3);
        tokenLifecycleManager$awaitRefresh$2.L$9 = SpillingKt.nullOutSpilledVariable(tokenLifecycleRefreshResult);
        tokenLifecycleManager$awaitRefresh$2.L$10 = SpillingKt.nullOutSpilledVariable(str12);
        tokenLifecycleManager$awaitRefresh$2.J$0 = j12;
        tokenLifecycleManager$awaitRefresh$2.Z$0 = z12;
        tokenLifecycleManager$awaitRefresh$2.I$0 = i14;
        tokenLifecycleManager$awaitRefresh$2.I$1 = i15;
        tokenLifecycleManager$awaitRefresh$2.I$2 = i16;
        tokenLifecycleManager$awaitRefresh$2.label = 3;
        Object objM32947s = m32947s(str12, str17, str8, j12, str11, z12, lBoxLong2, accountType3, function2, tokenLifecycleManager$awaitRefresh$2);
        return objM32947s == coroutine_suspended ? coroutine_suspended : objM32947s;
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.token.TokenLifecycleManager$h */
    /* JADX INFO: compiled from: TokenLifecycleManager.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C15665h {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TokenWindow.values().length];
            try {
                iArr[TokenWindow.HARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TokenWindow.SOFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TokenWindow.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TokenWindow.MISSING_EXPIRE_AT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.kubi.kucoin.token.c
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return TokenLifecycleManager.m32891c0(runnable);
            }
        });
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        AbstractC41710m1 abstractC41710m1M91179c = C41718o1.m91179c(executorServiceNewSingleThreadExecutor);
        f28426c = abstractC41710m1M91179c;
        f28427d = C41713n0.m91125a(C41727q2.m91192b(null, 1, null).plus(abstractC41710m1M91179c));
        f28428e = new LinkedHashMap();
        f28429f = new LinkedHashMap();
        f28430g = new LinkedHashMap();
        f28431h = new Object();
        f28434k = new TokenLifecycleManager$refreshedTokenMappings$1();
    }

    /* JADX INFO: renamed from: c0 */
    public static final Thread m32891c0(Runnable runnable) {
        Thread thread = new Thread(runnable, "token-lifecycle-refresh");
        thread.setDaemon(true);
        return thread;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ Object m32894e0(TokenLifecycleManager tokenLifecycleManager, String str, String str2, String str3, long j11, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        String str4 = str2;
        if ((i11 & 8) != 0) {
            j11 = 0;
        }
        return tokenLifecycleManager.m32937d0(str, str4, str3, j11, continuation);
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m32902k0(TokenLifecycleManager tokenLifecycleManager, String str, String str2, String str3, String str4, boolean z11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str4 = null;
        }
        String str5 = str4;
        if ((i11 & 16) != 0) {
            z11 = false;
        }
        tokenLifecycleManager.m32941j0(str, str2, str3, str5, z11);
    }

    /* JADX INFO: renamed from: l0 */
    public static final KCTokenLifecycleConfig m32904l0() {
        return C40192c.f89321a.m88543e();
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ TokenLifecycleRefreshResult m32907n0(TokenLifecycleManager tokenLifecycleManager, String str, String str2, String str3, long j11, String str4, boolean z11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            j11 = 0;
        }
        return tokenLifecycleManager.m32942m0(str, str2, str3, j11, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? false : z11);
    }

    /* JADX INFO: renamed from: A */
    public final ForceRefreshContext m32910A(String str, String str2, String str3, String str4, String str5) {
        if (str == null || str.length() == 0 || !Intrinsics.areEqual(str, str2)) {
            return null;
        }
        return new ForceRefreshContext(str3, str4, str5);
    }

    /* JADX INFO: renamed from: B */
    public final TokenWindow m32911B(String str) {
        TokenAnchor tokenAnchor = f28432i;
        return (tokenAnchor == null || !Intrinsics.areEqual(tokenAnchor.getAccessToken(), str)) ? TokenWindow.MISSING_EXPIRE_AT : m32949v(tokenAnchor.getMonoExpireAt() - SystemClock.elapsedRealtime());
    }

    /* JADX INFO: renamed from: C */
    public final long m32912C(String str, long j11) {
        return TokenLifecyclePolicy.f28471a.m33009c(str, j11);
    }

    /* JADX INFO: renamed from: D */
    public final void m32913D(String str) {
        TokenAnchor tokenAnchor = f28432i;
        if (tokenAnchor == null || !Intrinsics.areEqual(tokenAnchor.getAccessToken(), str)) {
            LoginUserEntity loginUserEntityC = UserInfo.c();
            if (Intrinsics.areEqual(loginUserEntityC.token, str)) {
                m32932X(loginUserEntityC);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final TokenLifecycleRefreshResult m32915F(String str) {
        return new TokenLifecycleRefreshResult(null, "failed", str, "network_error", null, false, 48, null);
    }

    /* JADX INFO: renamed from: I */
    public final KCTokenLifecycleConfig m32917I() {
        return (KCTokenLifecycleConfig) f28425b.getValue();
    }

    /* JADX INFO: renamed from: O */
    public final boolean m32923O(Request request) {
        return TokenLifecycleRequestRewriter.f28488a.m33025a(request);
    }

    /* JADX INFO: renamed from: P */
    public final boolean m32924P(long j11) {
        boolean z11;
        synchronized (f28431h) {
            z11 = j11 == f28433j;
        }
        return z11;
    }

    /* JADX INFO: renamed from: Q */
    public final TokenLifecycleRefreshResult m32925Q(String str) {
        return new TokenLifecycleRefreshResult(str, "noop", m32926R(str), null, null, false, 56, null);
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final String m32926R(@NotNull String requestToken) {
        Intrinsics.checkNotNullParameter(requestToken, "requestToken");
        String str = UserInfo.c().token;
        String string = str != null ? StringsKt.trim((CharSequence) str).toString() : null;
        if (string == null) {
            string = "";
        }
        return (Intrinsics.areEqual(requestToken, string) || Intrinsics.areEqual(m32939g0(requestToken), string)) ? "currentUser" : "altUser";
    }

    /* JADX INFO: renamed from: S */
    public final void m32927S(InterfaceC41729r0<TokenLifecycleRefreshResult> interfaceC41729r0, TokenLifecycleRefreshResult tokenLifecycleRefreshResult, RefreshMonitorContext refreshMonitorContext) throws JSONException {
        RefreshMonitorContext refreshMonitorContextM32969b;
        if (tokenLifecycleRefreshResult == null) {
            return;
        }
        synchronized (f28431h) {
            try {
                RefreshMonitorContext refreshMonitorContext2 = f28429f.get(interfaceC41729r0);
                if (refreshMonitorContext2 == null || (refreshMonitorContextM32969b = RefreshMonitorContext.m32969b(refreshMonitorContext2, null, null, null, null, null, 0L, null, null, 255, null)) == null) {
                    refreshMonitorContextM32969b = refreshMonitorContext != null ? RefreshMonitorContext.m32969b(refreshMonitorContext, null, null, null, null, null, 0L, null, null, 255, null) : null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (refreshMonitorContextM32969b == null || Intrinsics.areEqual(refreshMonitorContextM32969b.getSource(), "401")) {
            return;
        }
        if (Intrinsics.areEqual(refreshMonitorContextM32969b.getRefreshType(), "hard") && Intrinsics.areEqual(tokenLifecycleRefreshResult.getResult(), "noop")) {
            return;
        }
        String source = refreshMonitorContextM32969b.getSource();
        String triggerPath = refreshMonitorContextM32969b.getTriggerPath();
        String refreshType = refreshMonitorContextM32969b.getRefreshType();
        String monitorName = refreshMonitorContextM32969b.getMonitorName();
        Long hardWaitStart = refreshMonitorContextM32969b.getHardWaitStart();
        m32930V(source, triggerPath, refreshType, tokenLifecycleRefreshResult, monitorName, hardWaitStart != null ? Long.valueOf(RangesKt.coerceAtLeast(SystemClock.elapsedRealtime() - hardWaitStart.longValue(), 0L)) : null);
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final String m32928T(@NotNull String requestToken) {
        String strM32929U;
        Intrinsics.checkNotNullParameter(requestToken, "requestToken");
        synchronized (f28431h) {
            strM32929U = f28424a.m32929U(requestToken);
        }
        return strM32929U;
    }

    /* JADX INFO: renamed from: U */
    public final String m32929U(String str) {
        String str2 = (String) f28434k.get((Object) str);
        if (str2 != null) {
            str = str2;
        }
        TokenAnchor tokenAnchor = f28432i;
        return Intrinsics.areEqual(tokenAnchor != null ? tokenAnchor.getAccessToken() : null, str) ? "monotonic" : "missing_expireat";
    }

    /* JADX INFO: renamed from: V */
    public final void m32930V(String str, String str2, String str3, TokenLifecycleRefreshResult tokenLifecycleRefreshResult, String str4, Long l11) throws JSONException {
        TokenMonitor.m33027b(TokenMonitor.f28493a, str, tokenLifecycleRefreshResult.getAccountType(), tokenLifecycleRefreshResult.getResult(), str2, str4, str3, tokenLifecycleRefreshResult.getReason(), null, l11, (tokenLifecycleRefreshResult.getRefreshRequested() && (Intrinsics.areEqual(str3, "soft") || Intrinsics.areEqual(str3, "hard"))) ? 1L : null, tokenLifecycleRefreshResult.getRefreshRequested() ? tokenLifecycleRefreshResult.getRefreshTokenExpired() : null, 128, null);
    }

    /* JADX INFO: renamed from: W */
    public final void m32931W() {
        C41696j.m91104d(f28427d, null, null, new TokenLifecycleManager$onForeground$1(null), 3, null);
    }

    /* JADX INFO: renamed from: X */
    public final void m32932X(@NotNull LoginUserEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        String string = StringsKt.trim((CharSequence) entity.id).toString();
        String str = entity.token;
        String string2 = str != null ? StringsKt.trim((CharSequence) str).toString() : null;
        if (string2 == null) {
            string2 = "";
        }
        String str2 = string2;
        synchronized (f28431h) {
            if (string.length() != 0 && str2.length() != 0) {
                String accountId = null;
                TokenLifecycleManager tokenLifecycleManager = f28424a;
                if (!tokenLifecycleManager.m32922N(string, str2)) {
                    C44128b.m97261e("TokenLifecycle", "Stale token event ignored: event no longer belongs to current login session");
                    return;
                }
                TokenAnchor tokenAnchor = f28432i;
                if (Intrinsics.areEqual(tokenAnchor != null ? tokenAnchor.getAccountId() : null, string) && !Intrinsics.areEqual(tokenAnchor.getAccessToken(), str2)) {
                    tokenLifecycleManager.m32935a0(tokenAnchor.getAccessToken(), str2);
                }
                if (entity.accessTokenExpireAt <= 0) {
                    if (!Intrinsics.areEqual(tokenAnchor != null ? tokenAnchor.getAccountId() : null, string) || !Intrinsics.areEqual(tokenAnchor.getAccessToken(), str2)) {
                        f28432i = null;
                    }
                    C44128b.m97261e("TokenLifecycle", "Token anchor missing expireAt: request proceeds with business 401 fallback enabled");
                    return;
                }
                if (tokenAnchor != null) {
                    accountId = tokenAnchor.getAccountId();
                }
                if (Intrinsics.areEqual(accountId, string) && Intrinsics.areEqual(tokenAnchor.getAccessToken(), str2) && tokenAnchor.getExpireAt() == entity.accessTokenExpireAt) {
                    return;
                }
                f28432i = tokenLifecycleManager.m32953z(string, str2, entity.accessTokenExpireAt, System.currentTimeMillis(), SystemClock.elapsedRealtime());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Token monotonic clock anchor updated, accountPresent=");
                sb2.append(string.length() > 0);
                sb2.append(", expireAtPresent=");
                sb2.append(entity.accessTokenExpireAt > 0);
                C44128b.m97259c("TokenLifecycle", sb2.toString());
                C44128b.m97261e("TokenLifecycle", "Token monotonic clock anchor updated");
                Unit unit = Unit.INSTANCE;
                return;
            }
            C44128b.m97261e("TokenLifecycle", "Token anchor cleared: current account or access token is empty");
            f28424a.m32952y();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final Request m32933Y(@NotNull Request request) throws JSONException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (m32923O(request)) {
            return request;
        }
        String strHeader = request.header("X-APP-TOKEN");
        String string = strHeader != null ? StringsKt.trim((CharSequence) strHeader).toString() : null;
        if (string == null) {
            string = "";
        }
        if (string.length() == 0) {
            return request;
        }
        BlockingRefreshBarrierResult blockingRefreshBarrierResultM32945q = m32945q(string, request.url().encodedPath());
        if (blockingRefreshBarrierResultM32945q != null) {
            String accessToken = blockingRefreshBarrierResultM32945q.getRefreshResult().getAccessToken();
            if (accessToken == null) {
                accessToken = blockingRefreshBarrierResultM32945q.getFallbackToken();
            }
            if (accessToken.length() <= 0 || Intrinsics.areEqual(accessToken, string)) {
                C44128b.m97261e("TokenLifecycle", "Blocking refresh barrier completed without a new token; proceeding with old token, path=" + request.url().encodedPath());
                return request;
            }
            C44128b.m97261e("TokenLifecycle", "Blocking refresh barrier completed; proceeding with latest token, path=" + request.url().encodedPath());
            return f28424a.m32943o0(request, accessToken, false);
        }
        String strM32939g0 = m32939g0(string);
        if (strM32939g0 != null) {
            C44128b.m97261e("TokenLifecycle", "Request matched old token mapping; proceeding with latest token, path=" + request.url().encodedPath());
            TokenMonitor tokenMonitor = TokenMonitor.f28493a;
            TokenLifecycleManager tokenLifecycleManager = f28424a;
            TokenMonitor.m33027b(tokenMonitor, ITokenLifecycleRefreshSPI.Companion.SOURCE_PREFLIGHT, tokenLifecycleManager.m32926R(string), "noop", request.url().encodedPath(), tokenLifecycleManager.m32928T(strM32939g0), "proceed", null, null, null, null, null, 1984, null);
            return tokenLifecycleManager.m32943o0(request, strM32939g0, false);
        }
        m32913D(string);
        int i11 = C15665h.$EnumSwitchMapping$0[m32911B(string).ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3 || i11 == 4) {
                    return request;
                }
                throw new NoWhenBranchMatchedException();
            }
            C44128b.m97261e("TokenLifecycle", "SOFT window entered; triggering async refresh and proceeding, path=" + request.url().encodedPath());
            m32902k0(this, string, request.url().encodedPath(), ITokenLifecycleRefreshSPI.Companion.SOURCE_PREFLIGHT, "soft", false, 16, null);
            return request;
        }
        C44128b.m97261e("TokenLifecycle", "HARD window entered; request waiting for token refresh, path=" + request.url().encodedPath());
        String accessToken2 = m32907n0(this, string, request.url().encodedPath(), ITokenLifecycleRefreshSPI.Companion.SOURCE_PREFLIGHT, 0L, "hard", true, 8, null).getAccessToken();
        if (accessToken2 == null || accessToken2.length() == 0 || Intrinsics.areEqual(accessToken2, string)) {
            C44128b.m97261e("TokenLifecycle", "HARD window refresh failed; proceeding with old token as fallback, path=" + request.url().encodedPath());
            return request;
        }
        C44128b.m97261e("TokenLifecycle", "HARD window refresh succeeded; proceeding with latest token, path=" + request.url().encodedPath());
        return m32943o0(request, accessToken2, false);
    }

    /* JADX INFO: renamed from: Z */
    public final void m32934Z(InterfaceC41729r0<TokenLifecycleRefreshResult> interfaceC41729r0, String str, String str2, String str3, String str4, Long l11) {
        RefreshMonitorContext refreshMonitorContext;
        if (Intrinsics.areEqual(str4, "hard") && (refreshMonitorContext = f28429f.get(interfaceC41729r0)) != null) {
            if (!Intrinsics.areEqual(refreshMonitorContext.getRefreshType(), "hard")) {
                refreshMonitorContext.m32982n(str3);
                refreshMonitorContext.m32983o(str2);
                refreshMonitorContext.m32981m("hard");
                refreshMonitorContext.m32980l(m32929U(str));
            }
            if (refreshMonitorContext.getHardWaitStart() == null && l11 != null) {
                refreshMonitorContext.m32979k(l11);
            }
            C44128b.m97261e("TokenLifecycle", "SingleFlight monitoring policy promoted to HARD for a blocking waiter");
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b0 */
    public final Business401RecoveryResult m32936b0(@NotNull Request request) {
        String str;
        Intrinsics.checkNotNullParameter(request, "request");
        Request requestM32943o0 = null;
        if (m32923O(request)) {
            return null;
        }
        String strHeader = request.header("X-APP-TOKEN");
        String string = strHeader != null ? StringsKt.trim((CharSequence) strHeader).toString() : null;
        if (string == null) {
            string = "";
        }
        String str2 = string;
        if (str2.length() == 0) {
            return null;
        }
        C44128b.m97261e("TokenLifecycle", "Business 401 entered fallback refresh, path=" + request.url().encodedPath());
        TokenLifecycleRefreshResult tokenLifecycleRefreshResultM32907n0 = m32907n0(this, str2, request.url().encodedPath(), "401", 0L, null, true, 24, null);
        String accessToken = tokenLifecycleRefreshResultM32907n0.getAccessToken();
        if (accessToken != null) {
            if (accessToken.length() <= 0 || Intrinsics.areEqual(accessToken, str2)) {
                accessToken = null;
            }
            if (accessToken != null) {
                requestM32943o0 = f28424a.m32943o0(request, accessToken, true);
            }
        }
        if (requestM32943o0 == null) {
            str = "Business 401 refresh failed; returning original response, path=" + request.url().encodedPath();
        } else {
            str = "Business 401 refresh succeeded; preparing one-time replay, path=" + request.url().encodedPath();
        }
        C44128b.m97261e("TokenLifecycle", str);
        return new Business401RecoveryResult(requestM32943o0, tokenLifecycleRefreshResultM32907n0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    /* JADX WARN: Code duplicated, block: B:23:0x003c  */
    /* JADX INFO: renamed from: f0 */
    public final void m32938f0(String str, String str2, InterfaceC41729r0<TokenLifecycleRefreshResult> interfaceC41729r0, ForceRefreshContext forceRefreshContext) {
        ForceRefreshContext forceContext;
        ForceRefreshContext forceContext2;
        String strM32926R;
        if (str == null || str.length() == 0) {
            return;
        }
        Map<String, BlockingRefreshBarrier> map = f28430g;
        BlockingRefreshBarrier blockingRefreshBarrier = map.get(str);
        Object obj = null;
        if (blockingRefreshBarrier == null) {
            forceContext = null;
        } else {
            if (blockingRefreshBarrier.m32959e() != interfaceC41729r0) {
                blockingRefreshBarrier = null;
            }
            if (blockingRefreshBarrier != null) {
                forceContext = blockingRefreshBarrier.getForceContext();
            } else {
                forceContext = null;
            }
        }
        BlockingRefreshBarrier blockingRefreshBarrier2 = map.get(str2);
        if (blockingRefreshBarrier2 == null) {
            forceContext2 = null;
        } else {
            if (blockingRefreshBarrier2.m32959e() != interfaceC41729r0) {
                blockingRefreshBarrier2 = null;
            }
            if (blockingRefreshBarrier2 != null) {
                forceContext2 = blockingRefreshBarrier2.getForceContext();
            } else {
                forceContext2 = null;
            }
        }
        List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new ForceRefreshContext[]{forceRefreshContext, forceContext, forceContext2});
        for (Object obj2 : listListOfNotNull) {
            if (Intrinsics.areEqual(((ForceRefreshContext) obj2).getRefreshType(), "hard")) {
                obj = obj2;
                break;
            }
        }
        ForceRefreshContext forceRefreshContext2 = (ForceRefreshContext) obj;
        if (forceRefreshContext2 == null) {
            forceRefreshContext2 = (ForceRefreshContext) CollectionsKt.firstOrNull(listListOfNotNull);
        }
        ForceRefreshContext forceRefreshContext3 = forceRefreshContext2;
        Map<InterfaceC41729r0<TokenLifecycleRefreshResult>, RefreshMonitorContext> map2 = f28429f;
        RefreshMonitorContext refreshMonitorContext = map2.get(interfaceC41729r0);
        long sessionGeneration = refreshMonitorContext != null ? refreshMonitorContext.getSessionGeneration() : f28433j;
        RefreshMonitorContext refreshMonitorContext2 = map2.get(interfaceC41729r0);
        if (refreshMonitorContext2 == null || (strM32926R = refreshMonitorContext2.getAccountType()) == null) {
            strM32926R = m32926R(str2);
        }
        BlockingRefreshBarrier blockingRefreshBarrier3 = new BlockingRefreshBarrier(interfaceC41729r0, str2, forceRefreshContext3, sessionGeneration, strM32926R);
        Map<String, BlockingRefreshBarrier> map3 = f28430g;
        map3.put(str, blockingRefreshBarrier3);
        map3.put(str2, blockingRefreshBarrier3);
        C44128b.m97261e("TokenLifecycle", "Blocking token refresh barrier registered");
    }

    /* JADX INFO: renamed from: g0 */
    public final String m32939g0(String str) {
        String str2;
        synchronized (f28431h) {
            str2 = (String) f28434k.get((Object) str);
        }
        return str2;
    }

    /* JADX INFO: renamed from: h0 */
    public final TokenLifecycleRefreshContext m32940h0(final String str) {
        return (TokenLifecycleRefreshContext) C0188b.f557a.m749o(new Function0() { // from class: com.kubi.kucoin.token.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TokenLifecycleManager.m32899i0(str);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final void m32941j0(String str, String str2, String str3, String str4, boolean z11) {
        m32887H(this, str, str2, str3, 0L, str4, z11 ? str : null, null, null, null, 456, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.String] */
    /* JADX INFO: renamed from: m0 */
    public final TokenLifecycleRefreshResult m32942m0(String str, String str2, String str3, long j11, String str4, boolean z11) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = m32926R(str);
        try {
            return (TokenLifecycleRefreshResult) C41690i.m91067b(null, new TokenLifecycleManager$waitForRefresh$1(str, str2, str3, j11, str4, z11, objectRef, null), 1, null);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return m32915F((String) objectRef.element);
        } catch (Throwable th2) {
            C44128b.m97262f("TokenLifecycle", "Exception while synchronously waiting for token refresh", th2);
            return m32915F((String) objectRef.element);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final Request m32943o0(Request request, String str, boolean z11) {
        return TokenLifecycleRequestRewriter.f28488a.m33026b(request, str, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final Request m32944p(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        String strHeader = request.header("X-APP-TOKEN");
        String string = strHeader != null ? StringsKt.trim((CharSequence) strHeader).toString() : null;
        if (string == null) {
            string = "";
        }
        return string.length() == 0 ? request : request.newBuilder().tag(TokenLifecycleMonitorNameTag.class, new TokenLifecycleMonitorNameTag(m32928T(string))).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.String] */
    /* JADX INFO: renamed from: q */
    public final BlockingRefreshBarrierResult m32945q(String str, String str2) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = m32926R(str);
        try {
            return (BlockingRefreshBarrierResult) C41690i.m91067b(null, new TokenLifecycleManager$awaitBlockingRefreshBarrier$1(str, str2, objectRef, null), 1, null);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return new BlockingRefreshBarrierResult(m32915F((String) objectRef.element), str);
        } catch (Throwable th2) {
            C44128b.m97262f("TokenLifecycle", "Exception while synchronously waiting for refresh barrier", th2);
            return new BlockingRefreshBarrierResult(m32915F((String) objectRef.element), str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: u */
    public final Object m32948u(InterfaceC41729r0<TokenLifecycleRefreshResult> interfaceC41729r0, String str, Continuation<? super TokenLifecycleRefreshResult> continuation) {
        TokenLifecycleManager$awaitRefreshTask$1 tokenLifecycleManager$awaitRefreshTask$1;
        if (continuation instanceof TokenLifecycleManager$awaitRefreshTask$1) {
            tokenLifecycleManager$awaitRefreshTask$1 = (TokenLifecycleManager$awaitRefreshTask$1) continuation;
            int i11 = tokenLifecycleManager$awaitRefreshTask$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                tokenLifecycleManager$awaitRefreshTask$1.label = i11 - Integer.MIN_VALUE;
            } else {
                tokenLifecycleManager$awaitRefreshTask$1 = new TokenLifecycleManager$awaitRefreshTask$1(this, continuation);
            }
        } else {
            tokenLifecycleManager$awaitRefreshTask$1 = new TokenLifecycleManager$awaitRefreshTask$1(this, continuation);
        }
        Object objMo91198h = tokenLifecycleManager$awaitRefreshTask$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = tokenLifecycleManager$awaitRefreshTask$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objMo91198h);
                tokenLifecycleManager$awaitRefreshTask$1.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                tokenLifecycleManager$awaitRefreshTask$1.L$1 = str;
                tokenLifecycleManager$awaitRefreshTask$1.label = 1;
                objMo91198h = interfaceC41729r0.mo91198h(tokenLifecycleManager$awaitRefreshTask$1);
                if (objMo91198h == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) tokenLifecycleManager$awaitRefreshTask$1.L$1;
                ResultKt.throwOnFailure(objMo91198h);
            }
            return (TokenLifecycleRefreshResult) objMo91198h;
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            C44128b.m97262f("TokenLifecycle", "Exception while waiting for token refresh task", th2);
            return m32915F(str);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final TokenWindow m32950w(long j11, @NotNull KCTokenLifecycleConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return TokenLifecyclePolicy.f28471a.m33007a(j11, config);
    }

    /* JADX INFO: renamed from: x */
    public final void m32951x() {
        synchronized (f28431h) {
            f28424a.m32952y();
            Unit unit = Unit.INSTANCE;
        }
        C44128b.m97261e("TokenLifecycle", "Login session cleared; token lifecycle state invalidated");
    }

    /* JADX INFO: renamed from: y */
    public final void m32952y() {
        f28433j++;
        f28432i = null;
        f28434k.clear();
        f28430g.clear();
        f28428e.clear();
        f28429f.clear();
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final TokenAnchor m32953z(@NotNull String accountId, @NotNull String accessToken, long j11, long j12, long j13) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        return TokenLifecyclePolicy.f28471a.m33008b(accountId, accessToken, j11, j12, j13);
    }

    /* JADX INFO: renamed from: i0 */
    public static final TokenLifecycleRefreshContext m32899i0(String str) {
        String string;
        String str2;
        String str3;
        LoginUserEntity loginUserEntityC = UserInfo.c();
        LoginUserEntity loginUserEntityM65471d = MultiAccountBizErrorHandler.f53654a.m65471d(str);
        if (loginUserEntityM65471d == null) {
            loginUserEntityM65471d = loginUserEntityC;
        }
        boolean zAreEqual = Intrinsics.areEqual(loginUserEntityM65471d.id, loginUserEntityC.id);
        String string2 = StringsKt.trim((CharSequence) loginUserEntityM65471d.id).toString();
        String str4 = loginUserEntityM65471d.token;
        String string3 = null;
        if (str4 != null) {
            string = StringsKt.trim((CharSequence) str4).toString();
        } else {
            string = null;
        }
        if (string == null) {
            string = "";
        }
        String str5 = loginUserEntityM65471d.refreshToken;
        if (str5 != null) {
            string3 = StringsKt.trim((CharSequence) str5).toString();
        }
        if (string3 == null) {
            str2 = "";
        } else {
            str2 = string3;
        }
        long j11 = loginUserEntityM65471d.refreshTokenExpireAt;
        if (zAreEqual) {
            str3 = "currentUser";
        } else {
            str3 = "altUser";
        }
        return new TokenLifecycleRefreshContext(string2, string, str2, j11, zAreEqual, str3);
    }

    /* JADX INFO: renamed from: J */
    public final void m32918J() {
        String string;
        String str = UserInfo.c().token;
        if (str != null) {
            string = StringsKt.trim((CharSequence) str).toString();
        } else {
            string = null;
        }
        if (string == null) {
            string = "";
        }
        String str2 = string;
        if (str2.length() == 0) {
            return;
        }
        m32913D(str2);
        TokenWindow tokenWindowM32911B = m32911B(str2);
        C44128b.m97261e("TokenLifecycle", "App returned to foreground; token lifecycle window=" + tokenWindowM32911B);
        int i11 = C15665h.$EnumSwitchMapping$0[tokenWindowM32911B.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            m32902k0(this, str2, "app_foreground", ITokenLifecycleRefreshSPI.Companion.SOURCE_PREFLIGHT, "soft", false, 16, null);
            return;
        }
        m32941j0(str2, "app_foreground", ITokenLifecycleRefreshSPI.Companion.SOURCE_PREFLIGHT, "hard", true);
    }

    /* JADX INFO: renamed from: K */
    public final void m32919K() {
        m32932X(UserInfo.c());
    }

    /* JADX INFO: renamed from: L */
    public final void m32920L(String str) {
        LoginUserEntity loginUserEntityC = UserInfo.c();
        if (Intrinsics.areEqual(loginUserEntityC.token, str)) {
            m32932X(loginUserEntityC);
        }
    }

    /* JADX INFO: renamed from: M */
    public final TokenLifecycleRefreshResult m32921M(TokenLifecycleRefreshResult tokenLifecycleRefreshResult) {
        String reason = tokenLifecycleRefreshResult.getReason();
        if (!Intrinsics.areEqual(reason, "280003") && !Intrinsics.areEqual(reason, "500036")) {
            reason = null;
        }
        if (reason == null) {
            reason = "network_error";
        }
        return TokenLifecycleRefreshResult.m33016b(tokenLifecycleRefreshResult, null, "failed", null, reason, null, false, 52, null);
    }

    /* JADX INFO: renamed from: N */
    public final boolean m32922N(String str, String str2) {
        String string;
        LoginUserEntity loginUserEntityC = UserInfo.c();
        if (Intrinsics.areEqual(StringsKt.trim((CharSequence) loginUserEntityC.id).toString(), str)) {
            String str3 = loginUserEntityC.token;
            if (str3 != null) {
                string = StringsKt.trim((CharSequence) str3).toString();
            } else {
                string = null;
            }
            if (string == null) {
                string = "";
            }
            if (Intrinsics.areEqual(string, str2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m32935a0(String str, String str2) {
        if (str.length() == 0 || str2.length() == 0 || Intrinsics.areEqual(str, str2)) {
            return;
        }
        Set<Map.Entry<String, String>> setEntrySet = f28434k.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (Intrinsics.areEqual(entry.getValue(), str)) {
                entry.setValue(str2);
            }
        }
        f28434k.put(str, str2);
        C44128b.m97261e("TokenLifecycle", "Old-to-latest token mapping updated");
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final TokenWindow m32949v(long j11) {
        return m32950w(j11, m32917I());
    }
}
