package com.kubi.user.token;

import a70.C0188b;
import a70.InterfaceC0187a;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.text.SpannableString;
import androidx.core.app.FrameMetricsAggregator;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.C5258a;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.event.api.C12572a;
import com.kubi.kucoin.token.TokenLifecycleRefreshContext;
import com.kubi.kucoin.token.TokenLifecycleRefreshResult;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.router.core.Router;
import com.kubi.sdk.constant.monitor.KunlunBusinessEventEnum;
import com.kubi.user.R$string;
import com.kubi.user.account.AccountChange;
import com.kubi.user.account.AccountChangeType;
import com.kubi.user.config.LoginInfoConfig;
import com.kubi.user.config.UserInfo;
import com.kubi.user.exception.RefreshTokenException;
import com.kubi.user.exception.UserCenterException;
import com.kubi.user.model.LoginUserEntity;
import com.kubi.user.signup.SignupExtKt;
import com.kubi.utils.C27058k0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import d70.C36638a;
import f00.C37304a;
import g00.InterfaceC37764p;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.DelayKt;
import mr.C42597a;
import o00.C42917g;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p569qq.C43846g;
import p569qq.C43847h;
import p569qq.C43852m;
import p569qq.InterfaceC43845f;
import p777xx.C46337a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import p852kotlin.time.Duration;
import p852kotlin.time.DurationKt;
import p852kotlin.time.DurationUnit;
import rg0.C44087f;
import rg0.InterfaceC44082a;
import ro.C44128b;

/* JADX INFO: compiled from: TokenLifecycleRefreshExecutor.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000§\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0013\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003^_`B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0002\b&J0\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00052\b\b\u0002\u0010-\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010.J.\u0010/\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\nH\u0082@¢\u0006\u0002\u0010.J \u00100\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\nH\u0002J'\u00103\u001a\u0002042\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u00052\b\b\u0002\u00105\u001a\u00020\nH\u0000¢\u0006\u0002\b6J\r\u00107\u001a\u000204H\u0000¢\u0006\u0002\b8J\r\u00109\u001a\u00020\bH\u0000¢\u0006\u0002\b:J2\u0010;\u001a\u0002H<\"\u0004\b\u0000\u0010<2\u001c\u0010=\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H<0?\u0012\u0006\u0012\u0004\u0018\u00010\u00010>H\u0082@¢\u0006\u0002\u0010@J*\u0010A\u001a\u0004\u0018\u00010B2\u0006\u00101\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u00182\u0006\u0010E\u001a\u00020FH\u0002J\"\u0010G\u001a\u0004\u0018\u00010H2\u0006\u00101\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u0018H\u0002J \u0010I\u001a\u0002042\u0006\u00101\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u0018H\u0002J(\u0010J\u001a\u0002042\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020F2\u0006\u0010N\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u0005H\u0002J\u0018\u0010O\u001a\u0002042\u0006\u0010P\u001a\u00020F2\u0006\u0010Q\u001a\u00020RH\u0002J\b\u0010S\u001a\u000204H\u0002J\b\u0010T\u001a\u000204H\u0002J\u0019\u0010U\u001a\u0004\u0018\u00010V2\b\u0010W\u001a\u0004\u0018\u00010XH\u0000¢\u0006\u0002\bYJ\u0010\u0010Z\u001a\u0002042\u0006\u0010[\u001a\u00020\bH\u0002J\u0010\u0010\\\u001a\u0002042\u0006\u0010]\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u001d\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b \u0010!¨\u0006a"}, m90084d2 = {"Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;", "", "<init>", "()V", "FAILED_BY_KICK", "", "PAGE_ID", "MAX_NETWORK_RETRY_COUNT", "", "NOTIFY_REFRESH_TOKEN_TIME_LIMIT", "", "DIALOG_TIME_SPAN", "MAX_REFRESH_RATE_LIMIT_ENTRIES", "RECEIVER_HANDLED_ERROR_CODES", "", "lastDialogTime", "lastNotifyRefreshTokenTime", "refreshRateLimitLock", "lastRefreshElapsedRealtimeBySession", "com/kubi/user/token/TokenLifecycleRefreshExecutor$lastRefreshElapsedRealtimeBySession$1", "Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$lastRefreshElapsedRealtimeBySession$1;", "refreshMutex", "Lkotlinx/coroutines/sync/Mutex;", "needNotifyTokenRefresh", "", "getNeedNotifyTokenRefresh", "()Z", "needNotifyTokenRefresh$delegate", "Lkotlin/Lazy;", "refreshApi", "Lcom/kubi/user/token/TokenLifecycleRefreshApi;", "kotlin.jvm.PlatformType", "getRefreshApi", "()Lcom/kubi/user/token/TokenLifecycleRefreshApi;", "refreshApi$delegate", "createRefreshOkHttpClient", "Lokhttp3/OkHttpClient;", "baseClient", "createRefreshOkHttpClient$UserCenterLib_googleRelease", "refreshToken", "Lcom/kubi/kucoin/token/TokenLifecycleRefreshResult;", "triggerPath", "context", "Lcom/kubi/kucoin/token/TokenLifecycleRefreshContext;", "source", "refreshTimeLimit", "(Ljava/lang/String;Lcom/kubi/kucoin/token/TokenLifecycleRefreshContext;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshTokenInternal", "shouldSkipRefresh", "accountId", "accessToken", "recordTokenIssued", "", "elapsedRealtime", "recordTokenIssued$UserCenterLib_googleRelease", "resetRefreshTimeForTest", "resetRefreshTimeForTest$UserCenterLib_googleRelease", "refreshRateLimitEntryCountForTest", "refreshRateLimitEntryCountForTest$UserCenterLib_googleRelease", "retryNetworkException", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commitRefreshResult", "Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$RefreshCommitResult;", "attributionToken", "wasCurrentAccount", "refreshedEntity", "Lcom/kubi/user/model/LoginUserEntity;", "locateTargetAccount", "Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$LocatedAccount;", "handleKickOutFailure", "handleBusinessFailure", "exception", "Lcom/kubi/network/retrofit/exception/ApiException;", "targetAccount", "isCurrentAccount", "notifyAlternativeAccount", "target", "type", "Lcom/kubi/user/account/AccountChangeType;", "notifyTokenRefreshedIfNeeded", "showKickOutDialog", "validKickOutDialogHost", "Landroidx/fragment/app/FragmentActivity;", "activity", "Landroid/app/Activity;", "validKickOutDialogHost$UserCenterLib_googleRelease", "trackRefreshTokenEvent", "code", "logLifecycle", "message", "LocatedAccount", "RefreshCommitResult", "RefreshRateLimitKey", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTokenLifecycleRefreshExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TokenLifecycleRefreshExecutor.kt\ncom/kubi/user/token/TokenLifecycleRefreshExecutor\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 UserCenterIssue.kt\ncom/kubi/user/exception/UserCenterIssueKt\n+ 5 KuEmitter.kt\ncom/kubi/router/emitter/KuEmitter\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 8 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 9 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,654:1\n116#2,8:655\n125#2,2:664\n1#3:663\n1#3:684\n57#4,8:666\n57#4,8:674\n16#5:682\n2756#6:683\n19#7,2:685\n35#8,4:687\n39#8:693\n44#9,2:691\n*S KotlinDebug\n*F\n+ 1 TokenLifecycleRefreshExecutor.kt\ncom/kubi/user/token/TokenLifecycleRefreshExecutor\n*L\n155#1:655,8\n155#1:664,2\n556#1:684\n349#1:666,8\n543#1:674,8\n556#1:682\n556#1:683\n575#1:685,2\n116#1:687,4\n116#1:693\n116#1:691,2\n*E\n"})
public final class TokenLifecycleRefreshExecutor {

    /* JADX INFO: renamed from: c */
    public static volatile long f53849c;

    /* JADX INFO: renamed from: d */
    public static volatile long f53850d;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final TokenLifecycleRefreshExecutor f53847a = new TokenLifecycleRefreshExecutor();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Set<String> f53848b = SetsKt.setOf((Object[]) new String[]{"280003", "280001", "280010"});

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Object f53851e = new Object();

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final C26830xe289c863 f53852f = new C26830xe289c863();

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final InterfaceC44082a f53853g = C44087f.m97144b(false, 1, null);

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Lazy f53854h = LazyKt.lazy(new Function0() { // from class: com.kubi.user.token.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(TokenLifecycleRefreshExecutor.m65848t());
        }
    });

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final Lazy f53855i = LazyKt.lazy(new Function0() { // from class: com.kubi.user.token.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TokenLifecycleRefreshExecutor.m65851z();
        }
    });

    /* JADX INFO: renamed from: com.kubi.user.token.TokenLifecycleRefreshExecutor$a, reason: from toString */
    /* JADX INFO: compiled from: TokenLifecycleRefreshExecutor.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$LocatedAccount;", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/user/model/LoginUserEntity;", "isCurrent", "", "<init>", "(Lcom/kubi/user/model/LoginUserEntity;Z)V", "getEntity", "()Lcom/kubi/user/model/LoginUserEntity;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class LocatedAccount {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final LoginUserEntity entity;

        /* JADX INFO: renamed from: b, reason: from toString */
        public final boolean isCurrent;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocatedAccount)) {
                return false;
            }
            LocatedAccount locatedAccount = (LocatedAccount) other;
            return Intrinsics.areEqual(this.entity, locatedAccount.entity) && this.isCurrent == locatedAccount.isCurrent;
        }

        public LocatedAccount(@NotNull LoginUserEntity entity, boolean z11) {
            Intrinsics.checkNotNullParameter(entity, "entity");
            this.entity = entity;
            this.isCurrent = z11;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final LoginUserEntity getEntity() {
            return this.entity;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsCurrent() {
            return this.isCurrent;
        }

        public int hashCode() {
            return (this.entity.hashCode() * 31) + Boolean.hashCode(this.isCurrent);
        }

        @NotNull
        public String toString() {
            return "LocatedAccount(entity=" + this.entity + ", isCurrent=" + this.isCurrent + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.user.token.TokenLifecycleRefreshExecutor$b, reason: from toString */
    /* JADX INFO: compiled from: TokenLifecycleRefreshExecutor.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$RefreshCommitResult;", "", "accessToken", "", "isCurrent", "", "currentAccountEntity", "Lcom/kubi/user/model/LoginUserEntity;", "<init>", "(Ljava/lang/String;ZLcom/kubi/user/model/LoginUserEntity;)V", "getAccessToken", "()Ljava/lang/String;", "()Z", "getCurrentAccountEntity", "()Lcom/kubi/user/model/LoginUserEntity;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class RefreshCommitResult {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String accessToken;

        /* JADX INFO: renamed from: b, reason: from toString */
        public final boolean isCurrent;

        /* JADX INFO: renamed from: c, reason: from toString */
        @Nullable
        public final LoginUserEntity currentAccountEntity;

        public RefreshCommitResult(@NotNull String accessToken, boolean z11, @Nullable LoginUserEntity loginUserEntity) {
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            this.accessToken = accessToken;
            this.isCurrent = z11;
            this.currentAccountEntity = loginUserEntity;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RefreshCommitResult)) {
                return false;
            }
            RefreshCommitResult refreshCommitResult = (RefreshCommitResult) other;
            return Intrinsics.areEqual(this.accessToken, refreshCommitResult.accessToken) && this.isCurrent == refreshCommitResult.isCurrent && Intrinsics.areEqual(this.currentAccountEntity, refreshCommitResult.currentAccountEntity);
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAccessToken() {
            return this.accessToken;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final LoginUserEntity getCurrentAccountEntity() {
            return this.currentAccountEntity;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsCurrent() {
            return this.isCurrent;
        }

        public int hashCode() {
            int iHashCode = ((this.accessToken.hashCode() * 31) + Boolean.hashCode(this.isCurrent)) * 31;
            LoginUserEntity loginUserEntity = this.currentAccountEntity;
            return iHashCode + (loginUserEntity == null ? 0 : loginUserEntity.hashCode());
        }

        @NotNull
        public String toString() {
            return "RefreshCommitResult(accessToken=" + this.accessToken + ", isCurrent=" + this.isCurrent + ", currentAccountEntity=" + this.currentAccountEntity + ')';
        }

        public /* synthetic */ RefreshCommitResult(String str, boolean z11, LoginUserEntity loginUserEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z11, (i11 & 4) != 0 ? null : loginUserEntity);
        }
    }

    /* JADX INFO: renamed from: com.kubi.user.token.TokenLifecycleRefreshExecutor$c, reason: from toString */
    /* JADX INFO: compiled from: TokenLifecycleRefreshExecutor.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$RefreshRateLimitKey;", "", "accountId", "", "accessToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccountId", "()Ljava/lang/String;", "getAccessToken", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class RefreshRateLimitKey {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String accountId;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final String accessToken;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RefreshRateLimitKey)) {
                return false;
            }
            RefreshRateLimitKey refreshRateLimitKey = (RefreshRateLimitKey) other;
            return Intrinsics.areEqual(this.accountId, refreshRateLimitKey.accountId) && Intrinsics.areEqual(this.accessToken, refreshRateLimitKey.accessToken);
        }

        public RefreshRateLimitKey(@NotNull String accountId, @NotNull String accessToken) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            this.accountId = accountId;
            this.accessToken = accessToken;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        public int hashCode() {
            return (this.accountId.hashCode() * 31) + this.accessToken.hashCode();
        }

        @NotNull
        public String toString() {
            return "RefreshRateLimitKey(accountId=" + this.accountId + ", accessToken=" + this.accessToken + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.user.token.TokenLifecycleRefreshExecutor$d */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C26829d extends TypeToken<Boolean> {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:12|13|43|26|(1:36)(1:29)) */
    /* JADX WARN: Code duplicated, block: B:29:0x0064 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x006d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        r4 = r12;
        r12 = r13;
        r13 = r4;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x006d, please report this as an issue */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00b2 -> B:13:0x0036). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object m65854C(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) throws Exception {
        TokenLifecycleRefreshExecutor$retryNetworkException$1 tokenLifecycleRefreshExecutor$retryNetworkException$1;
        int i11;
        Function1<? super Continuation<? super T>, ? extends Object> function2;
        Object objInvoke;
        if (continuation instanceof TokenLifecycleRefreshExecutor$retryNetworkException$1) {
            tokenLifecycleRefreshExecutor$retryNetworkException$1 = (TokenLifecycleRefreshExecutor$retryNetworkException$1) continuation;
            int i12 = tokenLifecycleRefreshExecutor$retryNetworkException$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                tokenLifecycleRefreshExecutor$retryNetworkException$1.label = i12 - Integer.MIN_VALUE;
            } else {
                tokenLifecycleRefreshExecutor$retryNetworkException$1 = new TokenLifecycleRefreshExecutor$retryNetworkException$1(this, continuation);
            }
        } else {
            tokenLifecycleRefreshExecutor$retryNetworkException$1 = new TokenLifecycleRefreshExecutor$retryNetworkException$1(this, continuation);
        }
        Object obj = tokenLifecycleRefreshExecutor$retryNetworkException$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = tokenLifecycleRefreshExecutor$retryNetworkException$1.label;
        if (i13 == 0) {
            ResultKt.throwOnFailure(obj);
            i11 = 0;
            tokenLifecycleRefreshExecutor$retryNetworkException$1.L$0 = function1;
            tokenLifecycleRefreshExecutor$retryNetworkException$1.L$1 = null;
            tokenLifecycleRefreshExecutor$retryNetworkException$1.I$0 = i11;
            tokenLifecycleRefreshExecutor$retryNetworkException$1.label = 1;
            objInvoke = function1.invoke(tokenLifecycleRefreshExecutor$retryNetworkException$1);
            if (objInvoke != coroutine_suspended) {
                return coroutine_suspended;
            }
            return objInvoke;
        }
        if (i13 != 1) {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i14 = tokenLifecycleRefreshExecutor$retryNetworkException$1.I$0;
            function2 = (Function1) tokenLifecycleRefreshExecutor$retryNetworkException$1.L$0;
            ResultKt.throwOnFailure(obj);
            i11 = i14;
            function1 = function2;
            tokenLifecycleRefreshExecutor$retryNetworkException$1.L$0 = function1;
            tokenLifecycleRefreshExecutor$retryNetworkException$1.L$1 = null;
            tokenLifecycleRefreshExecutor$retryNetworkException$1.I$0 = i11;
            tokenLifecycleRefreshExecutor$retryNetworkException$1.label = 1;
            objInvoke = function1.invoke(tokenLifecycleRefreshExecutor$retryNetworkException$1);
            if (objInvoke != coroutine_suspended) {
                return coroutine_suspended;
            }
            return objInvoke;
        }
        int i15 = tokenLifecycleRefreshExecutor$retryNetworkException$1.I$0;
        function2 = (Function1) tokenLifecycleRefreshExecutor$retryNetworkException$1.L$0;
        try {
            try {
                ResultKt.throwOnFailure(obj);
                return obj;
            } catch (Exception e11) {
                Exception e12 = e11;
                if (i15 >= 3) {
                    throw e12;
                }
                int i16 = i15 + 1;
                long j11 = ((long) (i15 + 2)) * 1000;
                m65866s("Refresh network exception; retry " + i16 + " starts in " + j11 + "ms");
                Duration.Companion companion = Duration.INSTANCE;
                long duration = DurationKt.toDuration(j11, DurationUnit.MILLISECONDS);
                tokenLifecycleRefreshExecutor$retryNetworkException$1.L$0 = function2;
                tokenLifecycleRefreshExecutor$retryNetworkException$1.L$1 = SpillingKt.nullOutSpilledVariable(e12);
                tokenLifecycleRefreshExecutor$retryNetworkException$1.I$0 = i16;
                tokenLifecycleRefreshExecutor$retryNetworkException$1.J$0 = j11;
                tokenLifecycleRefreshExecutor$retryNetworkException$1.label = 2;
                if (DelayKt.m90351c(duration, tokenLifecycleRefreshExecutor$retryNetworkException$1) != coroutine_suspended) {
                    i11 = i16;
                    function1 = function2;
                    tokenLifecycleRefreshExecutor$retryNetworkException$1.L$0 = function1;
                    tokenLifecycleRefreshExecutor$retryNetworkException$1.L$1 = null;
                    tokenLifecycleRefreshExecutor$retryNetworkException$1.I$0 = i11;
                    tokenLifecycleRefreshExecutor$retryNetworkException$1.label = 1;
                    objInvoke = function1.invoke(tokenLifecycleRefreshExecutor$retryNetworkException$1);
                    if (objInvoke != coroutine_suspended) {
                        return objInvoke;
                    }
                }
                return coroutine_suspended;
            }
        } catch (ApiException e13) {
            throw e13;
        } catch (CancellationException e14) {
            throw e14;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F */
    public static final void m65834F() {
        String pageId;
        TokenLifecycleRefreshExecutor tokenLifecycleRefreshExecutor = f53847a;
        FragmentActivity fragmentActivityM65858J = tokenLifecycleRefreshExecutor.m65858J(C5258a.m6125h());
        if (fragmentActivityM65858J == 0) {
            tokenLifecycleRefreshExecutor.m65866s("Kick-out dialog skipped: no lifecycle-safe FragmentActivity");
            ToastCompat.m66465z(R$string.login_kickout_notice_dialog_content_one);
            return;
        }
        String string = fragmentActivityM65858J.getString(R$string.login_kickout_notice_dialog_content_one);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = fragmentActivityM65858J.getString(R$string.login_kickout_notice_dialog_content_two);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        final String str = (!(fragmentActivityM65858J instanceof InterfaceC43845f) || (pageId = ((InterfaceC43845f) fragmentActivityM65858J).getPageId()) == null) ? "B1login" : pageId;
        try {
            C43852m.m96595g(str, "loginOutTips", null, null, 12, null);
            AlertDialogFragmentHelper alertDialogFragmentHelperM54159P4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.login_kickout_notice_dialog_title).m54154K4(new SpannableString(string + '\n' + string2)).m54161R4(0).m54162S4(R$string.confirm, new DialogInterface.OnClickListener() { // from class: com.kubi.user.token.g
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    TokenLifecycleRefreshExecutor.m65835G(str, dialogInterface, i11);
                }
            }).m54159P4(R$string.login_kickout_notice_dialog_login_action, new DialogInterface.OnClickListener() { // from class: com.kubi.user.token.h
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    TokenLifecycleRefreshExecutor.m65836H(str, dialogInterface, i11);
                }
            });
            FragmentManager supportFragmentManager = fragmentActivityM65858J.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            alertDialogFragmentHelperM54159P4.show(supportFragmentManager, "loginOutTips");
        } catch (IllegalStateException e11) {
            C44128b.m97262f("TokenLifecycle", "Kick-out dialog skipped: Activity state changed before show", e11);
            ToastCompat.m66465z(R$string.login_kickout_notice_dialog_content_one);
        }
    }

    /* JADX INFO: renamed from: G */
    public static final void m65835G(String str, DialogInterface dialogInterface, int i11) {
        f53849c = 0L;
        C43852m.m96595g(str, "loginOutTips", "1", null, 8, null);
        C41696j.m91104d(SignupExtKt.m65735h(null, null, 3, null), null, null, new TokenLifecycleRefreshExecutor$showKickOutDialog$1$1$1(null), 3, null);
    }

    /* JADX INFO: renamed from: H */
    public static final void m65836H(String str, DialogInterface dialogInterface, int i11) {
        f53849c = 0L;
        C43852m.m96595g(str, "loginOutTips", "2", null, 8, null);
        InterfaceC37764p.a.m85181b(C37304a.f82764a, null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX INFO: renamed from: l */
    public static final RefreshCommitResult m65847l(String str, String str2, LoginUserEntity loginUserEntity, boolean z11) {
        LoginUserEntity loginUserEntityM748n;
        String str3;
        String strM66668h;
        LoginUserEntity loginUserEntityY = LoginInfoConfig.a.y(str, str2, loginUserEntity);
        if (loginUserEntityY != null) {
            String strM66668h2 = C27041f.m66668h(loginUserEntityY.token);
            if (strM66668h2.length() <= 0) {
                strM66668h2 = null;
            }
            if (strM66668h2 == null) {
                return null;
            }
            return new RefreshCommitResult(strM66668h2, true, loginUserEntityY);
        }
        String str4 = UserInfo.c().id;
        if (Intrinsics.areEqual(str4, str)) {
            return null;
        }
        if ((!z11 || !StringsKt.isBlank(str4)) && (loginUserEntityM748n = C0188b.f557a.m748n(str, str2, loginUserEntity)) != null && (str3 = loginUserEntityM748n.token) != null && (strM66668h = C27041f.m66668h(str3)) != null) {
            String str5 = strM66668h.length() > 0 ? strM66668h : null;
            if (str5 != null) {
                return new RefreshCommitResult(str5, false, null, 4, null);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m65848t() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C26829d().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("platform_uc_notify_token_refresh", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m65849x(TokenLifecycleRefreshExecutor tokenLifecycleRefreshExecutor, String str, String str2, long j11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            j11 = SystemClock.elapsedRealtime();
        }
        tokenLifecycleRefreshExecutor.m65869w(str, str2, j11);
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m65850y(String str, RefreshRateLimitKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return Intrinsics.areEqual(key.getAccountId(), str);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Nullable
    /* JADX INFO: renamed from: A */
    public final Object m65852A(@NotNull String str, @NotNull TokenLifecycleRefreshContext tokenLifecycleRefreshContext, @NotNull String str2, long j11, @NotNull Continuation<? super TokenLifecycleRefreshResult> continuation) throws Throwable {
        TokenLifecycleRefreshExecutor$refreshToken$1 tokenLifecycleRefreshExecutor$refreshToken$1;
        String str3;
        int i11;
        String str4;
        InterfaceC44082a interfaceC44082a;
        TokenLifecycleRefreshContext tokenLifecycleRefreshContext2;
        long j12;
        InterfaceC44082a interfaceC44082a2;
        TokenLifecycleRefreshResult tokenLifecycleRefreshResult;
        if (continuation instanceof TokenLifecycleRefreshExecutor$refreshToken$1) {
            tokenLifecycleRefreshExecutor$refreshToken$1 = (TokenLifecycleRefreshExecutor$refreshToken$1) continuation;
            int i12 = tokenLifecycleRefreshExecutor$refreshToken$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                tokenLifecycleRefreshExecutor$refreshToken$1.label = i12 - Integer.MIN_VALUE;
            } else {
                tokenLifecycleRefreshExecutor$refreshToken$1 = new TokenLifecycleRefreshExecutor$refreshToken$1(this, continuation);
            }
        } else {
            tokenLifecycleRefreshExecutor$refreshToken$1 = new TokenLifecycleRefreshExecutor$refreshToken$1(this, continuation);
        }
        TokenLifecycleRefreshExecutor$refreshToken$1 tokenLifecycleRefreshExecutor$refreshToken$2 = tokenLifecycleRefreshExecutor$refreshToken$1;
        Object objM65853B = tokenLifecycleRefreshExecutor$refreshToken$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = tokenLifecycleRefreshExecutor$refreshToken$2.label;
        try {
            if (i13 == 0) {
                ResultKt.throwOnFailure(objM65853B);
                InterfaceC44082a interfaceC44082a3 = f53853g;
                tokenLifecycleRefreshExecutor$refreshToken$2.L$0 = str;
                tokenLifecycleRefreshExecutor$refreshToken$2.L$1 = tokenLifecycleRefreshContext;
                tokenLifecycleRefreshExecutor$refreshToken$2.L$2 = str2;
                tokenLifecycleRefreshExecutor$refreshToken$2.L$3 = interfaceC44082a3;
                tokenLifecycleRefreshExecutor$refreshToken$2.J$0 = j11;
                tokenLifecycleRefreshExecutor$refreshToken$2.I$0 = 0;
                tokenLifecycleRefreshExecutor$refreshToken$2.label = 1;
                if (interfaceC44082a3.mo91344d(null, tokenLifecycleRefreshExecutor$refreshToken$2) != coroutine_suspended) {
                    str3 = str;
                    i11 = 0;
                    str4 = str2;
                    interfaceC44082a = interfaceC44082a3;
                    tokenLifecycleRefreshContext2 = tokenLifecycleRefreshContext;
                    j12 = j11;
                }
                return coroutine_suspended;
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC44082a2 = (InterfaceC44082a) tokenLifecycleRefreshExecutor$refreshToken$2.L$3;
                try {
                    ResultKt.throwOnFailure(objM65853B);
                    tokenLifecycleRefreshResult = (TokenLifecycleRefreshResult) objM65853B;
                    interfaceC44082a = interfaceC44082a2;
                    interfaceC44082a.mo91345e(null);
                    return tokenLifecycleRefreshResult;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC44082a2.mo91345e(null);
                    throw th;
                }
            }
            i11 = tokenLifecycleRefreshExecutor$refreshToken$2.I$0;
            long j13 = tokenLifecycleRefreshExecutor$refreshToken$2.J$0;
            InterfaceC44082a interfaceC44082a4 = (InterfaceC44082a) tokenLifecycleRefreshExecutor$refreshToken$2.L$3;
            String str5 = (String) tokenLifecycleRefreshExecutor$refreshToken$2.L$2;
            tokenLifecycleRefreshContext2 = (TokenLifecycleRefreshContext) tokenLifecycleRefreshExecutor$refreshToken$2.L$1;
            str3 = (String) tokenLifecycleRefreshExecutor$refreshToken$2.L$0;
            ResultKt.throwOnFailure(objM65853B);
            interfaceC44082a = interfaceC44082a4;
            j12 = j13;
            str4 = str5;
            if (C27058k0.f54342a.m66755e()) {
                TokenLifecycleRefreshExecutor tokenLifecycleRefreshExecutor = f53847a;
                tokenLifecycleRefreshExecutor$refreshToken$2.L$0 = SpillingKt.nullOutSpilledVariable(str3);
                tokenLifecycleRefreshExecutor$refreshToken$2.L$1 = SpillingKt.nullOutSpilledVariable(tokenLifecycleRefreshContext2);
                tokenLifecycleRefreshExecutor$refreshToken$2.L$2 = SpillingKt.nullOutSpilledVariable(str4);
                tokenLifecycleRefreshExecutor$refreshToken$2.L$3 = interfaceC44082a;
                tokenLifecycleRefreshExecutor$refreshToken$2.J$0 = j12;
                tokenLifecycleRefreshExecutor$refreshToken$2.I$0 = i11;
                tokenLifecycleRefreshExecutor$refreshToken$2.I$1 = 0;
                tokenLifecycleRefreshExecutor$refreshToken$2.label = 2;
                objM65853B = tokenLifecycleRefreshExecutor.m65853B(str3, tokenLifecycleRefreshContext2, str4, j12, tokenLifecycleRefreshExecutor$refreshToken$2);
                if (objM65853B != coroutine_suspended) {
                    interfaceC44082a2 = interfaceC44082a;
                    tokenLifecycleRefreshResult = (TokenLifecycleRefreshResult) objM65853B;
                    interfaceC44082a = interfaceC44082a2;
                }
                return coroutine_suspended;
            }
            f53847a.m65866s("Refresh skipped: app is not in foreground, source=" + str4);
            String attributionAccessToken = tokenLifecycleRefreshContext2.getAttributionAccessToken();
            tokenLifecycleRefreshResult = new TokenLifecycleRefreshResult(attributionAccessToken.length() > 0 ? attributionAccessToken : null, "noop", tokenLifecycleRefreshContext2.getAccountType(), null, null, false, 56, null);
            interfaceC44082a.mo91345e(null);
            return tokenLifecycleRefreshResult;
        } catch (Throwable th3) {
            th = th3;
            interfaceC44082a2 = interfaceC44082a;
            interfaceC44082a2.mo91345e(null);
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x006d: MOVE (r14 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:110), block:B:21:0x006b */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9981. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: B */
    public final java.lang.Object m65853B(java.lang.String r30, com.kubi.kucoin.token.TokenLifecycleRefreshContext r31, java.lang.String r32, long r33, p852kotlin.coroutines.Continuation<? super com.kubi.kucoin.token.TokenLifecycleRefreshResult> r35) {
        /*
            Method dump skipped, instruction units count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.user.token.TokenLifecycleRefreshExecutor.m65853B(java.lang.String, com.kubi.kucoin.token.k, java.lang.String, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: I */
    public final void m65857I(int i11) {
        C43847h.m96572a(KunlunBusinessEventEnum.REFRESH_TOKEN_RESULT, i11);
    }

    @Nullable
    /* JADX INFO: renamed from: J */
    public final FragmentActivity m65858J(@Nullable Activity activity) {
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        if (fragmentActivity == null || fragmentActivity.isFinishing() || fragmentActivity.isDestroyed() || fragmentActivity.getSupportFragmentManager().isStateSaved()) {
            return null;
        }
        return fragmentActivity;
    }

    /* JADX INFO: renamed from: k */
    public final RefreshCommitResult m65859k(final String str, final String str2, final boolean z11, final LoginUserEntity loginUserEntity) {
        return (RefreshCommitResult) C0188b.f557a.m749o(new Function0() { // from class: com.kubi.user.token.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TokenLifecycleRefreshExecutor.m65847l(str, str2, loginUserEntity, z11);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final OkHttpClient m65860m(@NotNull OkHttpClient baseClient) {
        Intrinsics.checkNotNullParameter(baseClient, "baseClient");
        return baseClient.newBuilder().dispatcher(new Dispatcher()).build();
    }

    /* JADX INFO: renamed from: n */
    public final boolean m65861n() {
        return ((Boolean) f53854h.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: o */
    public final TokenLifecycleRefreshApi m65862o() {
        return (TokenLifecycleRefreshApi) f53855i.getValue();
    }

    /* JADX INFO: renamed from: p */
    public final void m65863p(ApiException apiException, LoginUserEntity loginUserEntity, boolean z11, String str) {
        if (z11) {
            LoginInfoConfig.a.O(false);
        } else {
            m65867u(loginUserEntity, AccountChangeType.TYPE_280003);
        }
        String code = apiException.code;
        Intrinsics.checkNotNullExpressionValue(code, "code");
        Integer intOrNull = StringsKt.toIntOrNull(code);
        m65857I(intOrNull != null ? intOrNull.intValue() : -1);
        RefreshTokenException refreshTokenException = new RefreshTokenException("续期失败,业务错误码=" + apiException.code + "，原因=" + apiException.getMessage() + ",url=" + str, (Throwable) null, 2, (DefaultConstructorMarker) null);
        if (!C42899b.m94075e(refreshTokenException)) {
            if (C36638a.m81972c(refreshTokenException)) {
                C43846g.m96568c(new UserCenterException(refreshTokenException, "refresh_token", true, null, 8, null), null, 2, null);
            } else {
                C36638a.m81973d(refreshTokenException, "refresh_token");
            }
        }
        m65866s("Refresh failed with business error code=" + apiException.code);
    }

    /* JADX INFO: renamed from: q */
    public final void m65864q(String str, String str2, boolean z11) {
        if (LoginInfoConfig.a.P(str, str2, false)) {
            m65856E();
            return;
        }
        LocatedAccount locatedAccountM65865r = m65865r(str, str2, z11);
        if (locatedAccountM65865r == null || locatedAccountM65865r.getIsCurrent()) {
            m65866s("500036 side effect ignored: target session changed before conditional logout");
        } else {
            m65867u(locatedAccountM65865r.getEntity(), AccountChangeType.TYPE_500036);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m65866s(String str) {
        C44128b.m97261e("TokenLifecycle", str);
    }

    /* JADX INFO: renamed from: u */
    public final void m65867u(LoginUserEntity loginUserEntity, AccountChangeType accountChangeType) {
        String string = StringsKt.trim((CharSequence) loginUserEntity.id).toString();
        if (string.length() == 0) {
            return;
        }
        C46337a c46337a = C46337a.f103912a;
        Iterator it = Router.f46192a.m56190l(InterfaceC0187a.class).iterator();
        while (it.hasNext()) {
            ((InterfaceC0187a) it.next()).invoke(new AccountChange(string, accountChangeType));
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m65869w(@NotNull String accountId, @NotNull String accessToken, long j11) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        final String string = StringsKt.trim((CharSequence) accountId).toString();
        String string2 = StringsKt.trim((CharSequence) accessToken).toString();
        if (string.length() == 0 || string2.length() == 0) {
            return;
        }
        synchronized (f53851e) {
            C26830xe289c863 c26830xe289c863 = f53852f;
            Set<RefreshRateLimitKey> setKeySet = c26830xe289c863.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
            CollectionsKt.removeAll(setKeySet, new Function1() { // from class: com.kubi.user.token.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(TokenLifecycleRefreshExecutor.m65850y(string, (TokenLifecycleRefreshExecutor.RefreshRateLimitKey) obj));
                }
            });
            c26830xe289c863.put(new RefreshRateLimitKey(string, string2), Long.valueOf(j11));
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: z */
    public static final TokenLifecycleRefreshApi m65851z() {
        return (TokenLifecycleRefreshApi) C42597a.m93388d().newBuilder().client(f53847a.m65860m(C42597a.m93389e())).build().create(TokenLifecycleRefreshApi.class);
    }

    /* JADX INFO: renamed from: D */
    public final boolean m65855D(String str, String str2, long j11) {
        Long l11;
        if (StringsKt.isBlank(str) || StringsKt.isBlank(str2) || j11 <= 0) {
            return false;
        }
        synchronized (f53851e) {
            l11 = (Long) f53852f.get((Object) new RefreshRateLimitKey(str, str2));
        }
        if (l11 != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - l11.longValue();
            if (0 <= jElapsedRealtime && jElapsedRealtime < j11) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final void m65856E() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f53849c < 300000) {
            return;
        }
        f53849c = jCurrentTimeMillis;
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.user.token.f
            @Override // java.lang.Runnable
            public final void run() {
                TokenLifecycleRefreshExecutor.m65834F();
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final LocatedAccount m65865r(String str, String str2, boolean z11) {
        LoginUserEntity loginUserEntityM736b;
        LoginUserEntity loginUserEntityC = UserInfo.c();
        if (Intrinsics.areEqual(loginUserEntityC.id, str)) {
            if (!Intrinsics.areEqual(C27041f.m66668h(loginUserEntityC.token), str2)) {
                loginUserEntityC = null;
            }
            if (loginUserEntityC == null) {
                return null;
            }
            return new LocatedAccount(loginUserEntityC, true);
        }
        if ((!z11 || !StringsKt.isBlank(loginUserEntityC.id)) && (loginUserEntityM736b = C0188b.f557a.m736b(str)) != null) {
            if (!Intrinsics.areEqual(C27041f.m66668h(loginUserEntityM736b.token), str2)) {
                loginUserEntityM736b = null;
            }
            if (loginUserEntityM736b != null) {
                return new LocatedAccount(loginUserEntityM736b, false);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final void m65868v() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (m65861n() && jCurrentTimeMillis - f53850d >= 10000) {
            f53850d = jCurrentTimeMillis;
            C12572a.m23695d("com.kubi.user.event.UserEvent:onTokenRefresh", null, 0L, 6, null);
        }
    }
}
