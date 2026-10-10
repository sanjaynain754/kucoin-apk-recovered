package com.kubi.kucoin.token;

import com.kubi.sdk.config.KCTokenLifecycleConfig;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.kucoin.token.j, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TokenLifecyclePolicy.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ.\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007J\u0016\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0007¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/kucoin/token/TokenLifecyclePolicy;", "", "<init>", "()V", "classifyRemaining", "Lcom/kubi/kucoin/token/TokenLifecycleManager$TokenWindow;", "remainingMillis", "", "config", "Lcom/kubi/sdk/config/KCTokenLifecycleConfig;", "createAnchor", "Lcom/kubi/kucoin/token/TokenLifecycleManager$TokenAnchor;", "accountId", "", "accessToken", "expireAt", "deviceNow", "monotonicNow", "effectiveRefreshTimeLimit", "source", "refreshTimeLimit", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TokenLifecyclePolicy {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final TokenLifecyclePolicy f28471a = new TokenLifecyclePolicy();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final TokenLifecycleManager.TokenWindow m33007a(long j11, @NotNull KCTokenLifecycleConfig config) {
        KCTokenLifecycleConfig kCTokenLifecycleConfigCopy$default;
        Intrinsics.checkNotNullParameter(config, "config");
        if (config.getSoftWindowMinutes() < 0 || config.getHardWindowMinutes() < 0 || config.getHardWindowMinutes() > config.getSoftWindowMinutes()) {
            KCTokenLifecycleConfig kCTokenLifecycleConfig = new KCTokenLifecycleConfig(false, 0L, 0L, false, false, null, 63, null);
            C44128b.m97261e("TokenLifecycle", "Invalid token lifecycle window config; falling back to default window values");
            kCTokenLifecycleConfigCopy$default = KCTokenLifecycleConfig.copy$default(config, false, kCTokenLifecycleConfig.getSoftWindowMinutes(), kCTokenLifecycleConfig.getHardWindowMinutes(), false, false, null, 57, null);
        } else {
            kCTokenLifecycleConfigCopy$default = config;
        }
        TimeUnit timeUnit = TimeUnit.MINUTES;
        long millis = timeUnit.toMillis(kCTokenLifecycleConfigCopy$default.getHardWindowMinutes());
        long millis2 = timeUnit.toMillis(kCTokenLifecycleConfigCopy$default.getSoftWindowMinutes());
        if (!kCTokenLifecycleConfigCopy$default.getHardWindowEnabled() || j11 > millis) {
            return (!kCTokenLifecycleConfigCopy$default.getSoftWindowEnabled() || j11 > millis2) ? TokenLifecycleManager.TokenWindow.NORMAL : TokenLifecycleManager.TokenWindow.SOFT;
        }
        return TokenLifecycleManager.TokenWindow.HARD;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final TokenLifecycleManager.TokenAnchor m33008b(@NotNull String accountId, @NotNull String accessToken, long j11, long j12, long j13) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        return new TokenLifecycleManager.TokenAnchor(accountId, accessToken, j11, j13 + (j11 - j12));
    }

    /* JADX INFO: renamed from: c */
    public final long m33009c(@NotNull String source, long j11) {
        Intrinsics.checkNotNullParameter(source, "source");
        Long lValueOf = Long.valueOf(j11);
        long jLongValue = lValueOf.longValue();
        if (!Intrinsics.areEqual(source, ITokenLifecycleRefreshSPI.Companion.SOURCE_MANUAL) || jLongValue <= 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        return 0L;
    }
}
