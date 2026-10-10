package nl;

import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.event.api.C12572a;
import com.kubi.kucoin.main.mode.reddot.Web3ModeRedDotConfig;
import com.kubi.sdk.mode.AppMode;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27017c;
import com.kubi.wallet.api.IWalletService;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p373jk.C40432e;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: nl.a */
/* JADX INFO: compiled from: Web3ModeRedDotManager.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u001d\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0013J%\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0000¢\u0006\u0002\b\u0018J\u0017\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\b\u001bJ\b\u0010\u001c\u001a\u00020\nH\u0002J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0005H\u0002J\u0018\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\nH\u0002J\b\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0002J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0005H\u0002J\b\u0010&\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/kubi/kucoin/main/mode/reddot/Web3ModeRedDotManager;", "", "<init>", "()V", "TAG", "", "STORAGE_NAMESPACE", "STORAGE_KEY_PREFIX", "REMOTE_CONFIG_KEY", "DEFAULT_INTERVAL_DAYS", "", "SECONDS_PER_DAY", "shouldShow", "", "onUserModeSelected", "fromMode", "Lcom/kubi/sdk/mode/AppMode;", "targetMode", "shouldConsume", "shouldConsume$KuFacadeLib_googleRelease", "hasIntervalElapsed", "lastConsumedAtSeconds", "nowSeconds", "intervalDays", "hasIntervalElapsed$KuFacadeLib_googleRelease", "resolveIntervalDays", "rawIntervalDays", "resolveIntervalDays$KuFacadeLib_googleRelease", "getIntervalDays", "currentUid", "getLastConsumedAt", "uid", "updateLastConsumedAt", "timestampSeconds", "notifyRedDotRefresh", "", "resolveIntervalSeconds", "storageKey", "currentTimeSeconds", "KuFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWeb3ModeRedDotManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Web3ModeRedDotManager.kt\ncom/kubi/kucoin/main/mode/reddot/Web3ModeRedDotManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,158:1\n1#2:159\n35#3,4:160\n39#3:166\n44#4,2:164\n*S KotlinDebug\n*F\n+ 1 Web3ModeRedDotManager.kt\ncom/kubi/kucoin/main/mode/reddot/Web3ModeRedDotManager\n*L\n102#1:160,4\n102#1:166\n102#1:164,2\n*E\n"})
public final class C42851a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42851a f94919a = new C42851a();

    /* JADX INFO: renamed from: nl.a$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Web3ModeRedDotConfig> {
    }

    /* JADX INFO: renamed from: c */
    public final long m93986c() {
        Object objM103844constructorimpl;
        Object objM20457a;
        try {
            Result.Companion companion = Result.INSTANCE;
            try {
                RemoteConfig remoteConfig = RemoteConfig.f19636a;
                Type type = new a().getType();
                Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                objM20457a = RemoteConfig.m20457a("web3_wallet_red_dot_interval_days", type);
            } catch (Throwable th2) {
                C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
                objM20457a = null;
            }
            Web3ModeRedDotConfig web3ModeRedDotConfig = (Web3ModeRedDotConfig) objM20457a;
            objM103844constructorimpl = Result.m103844constructorimpl(web3ModeRedDotConfig != null ? web3ModeRedDotConfig.getIntervalDays() : null);
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th3));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97270n("Web3ModeRedDot", "read interval config failed: " + thM103847exceptionOrNullimpl.getMessage());
        }
        return m93991h((String) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl));
    }

    /* JADX INFO: renamed from: b */
    public final String m93985b() {
        String strH;
        UserInfo userInfo = UserInfo.a;
        if (!userInfo.n() || (strH = userInfo.h()) == null || StringsKt.isBlank(strH)) {
            return null;
        }
        return strH;
    }

    /* JADX INFO: renamed from: d */
    public final long m93987d(String str) {
        Object objM103844constructorimpl;
        Long longOrNull;
        try {
            Result.Companion companion = Result.INSTANCE;
            String strM89069i = C40432e.f89748a.m89069i(C27017c.f54310a.m66513b(), m93995l(str), "");
            objM103844constructorimpl = Result.m103844constructorimpl(Long.valueOf((strM89069i == null || (longOrNull = StringsKt.toLongOrNull(strM89069i)) == null) ? 0L : longOrNull.longValue()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97270n("Web3ModeRedDot", "read consumed timestamp failed: " + thM103847exceptionOrNullimpl.getMessage());
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = 0L;
        }
        return ((Number) objM103844constructorimpl).longValue();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m93988e(long j11, long j12, long j13) {
        if (j11 <= 0) {
            return true;
        }
        return j11 <= j12 && j12 - j11 >= m93992i(j13);
    }

    /* JADX INFO: renamed from: f */
    public final void m93989f() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            C12572a.m23695d("com.kubi.home.event.HomeEvent:refreshWeb3ModeRedDot", null, 0L, 6, null);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97270n("Web3ModeRedDot", "notify red dot refresh failed: " + thM103847exceptionOrNullimpl.getMessage());
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m93990g(@NotNull AppMode fromMode, @NotNull AppMode targetMode) {
        String strM93985b;
        Intrinsics.checkNotNullParameter(fromMode, "fromMode");
        Intrinsics.checkNotNullParameter(targetMode, "targetMode");
        if (!m93993j(fromMode, targetMode) || (strM93985b = m93985b()) == null || !m93996m(strM93985b, m93984a())) {
            return false;
        }
        m93989f();
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final long m93991h(@Nullable String str) {
        String string;
        Long longOrNull;
        if (str == null || (string = StringsKt.trim((CharSequence) str).toString()) == null || (longOrNull = StringsKt.toLongOrNull(string)) == null) {
            return 30L;
        }
        if (longOrNull.longValue() <= 0) {
            longOrNull = null;
        }
        if (longOrNull != null) {
            return longOrNull.longValue();
        }
        return 30L;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m93993j(@NotNull AppMode fromMode, @NotNull AppMode targetMode) {
        Intrinsics.checkNotNullParameter(fromMode, "fromMode");
        Intrinsics.checkNotNullParameter(targetMode, "targetMode");
        AppMode appMode = AppMode.Pro;
        if ((fromMode == appMode || fromMode == AppMode.Lite) && targetMode == AppMode.Web3) {
            return true;
        }
        if (fromMode == AppMode.Web3) {
            return targetMode == appMode || targetMode == AppMode.Lite;
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final String m93995l(String str) {
        return "web3_redDot_last_consumedAt." + str;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m93996m(String str, long j11) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(C40432e.f89748a.m89072n(C27017c.f54310a.m66513b(), m93995l(str), String.valueOf(j11), "")));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97270n("Web3ModeRedDot", "write consumed timestamp failed: " + thM103847exceptionOrNullimpl.getMessage());
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = bool;
        }
        return ((Boolean) objM103844constructorimpl).booleanValue();
    }

    /* JADX INFO: renamed from: a */
    public final long m93984a() {
        return System.currentTimeMillis() / 1000;
    }

    /* JADX INFO: renamed from: i */
    public final long m93992i(long j11) {
        long jLongValue;
        Object objM103844constructorimpl;
        Long lValueOf = Long.valueOf(j11);
        if (lValueOf.longValue() <= 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            jLongValue = lValueOf.longValue();
        } else {
            jLongValue = 30;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Long.valueOf(Math.multiplyExact(jLongValue, 86400L)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = 2592000L;
        }
        return ((Number) objM103844constructorimpl).longValue();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m93994k() {
        Object objM103844constructorimpl;
        String strM93985b = m93985b();
        if (strM93985b == null) {
            return false;
        }
        AppMode currentBizMode$default = AppMode.Companion.getCurrentBizMode$default(AppMode.INSTANCE, null, 1, null);
        if (currentBizMode$default != AppMode.Pro && currentBizMode$default != AppMode.Lite) {
            return false;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(IWalletService.f54542a.get().mo66941a()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97270n("Web3ModeRedDot", "check Web3 entry availability failed: " + thM103847exceptionOrNullimpl.getMessage());
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = bool;
        }
        if (!((Boolean) objM103844constructorimpl).booleanValue()) {
            return false;
        }
        return m93988e(m93987d(strM93985b), m93984a(), m93986c());
    }
}
