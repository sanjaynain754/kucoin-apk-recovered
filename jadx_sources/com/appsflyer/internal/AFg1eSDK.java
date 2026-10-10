package com.appsflyer.internal;

import android.util.Log;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJG\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\fJ1\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\fJ'\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\fR\u0014\u0010\u001a\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, m90084d2 = {"Lcom/appsflyer/internal/AFg1eSDK;", "Lcom/appsflyer/internal/AFg1bSDK;", "<init>", "()V", "Lcom/appsflyer/internal/AFh1ySDK;", "p0", "", "p1", "", "p2", "", "d", "(Lcom/appsflyer/internal/AFh1ySDK;Ljava/lang/String;Z)V", "", "p3", "p4", "p5", "p6", "e", "(Lcom/appsflyer/internal/AFh1ySDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFh1ySDK;Ljava/lang/String;)V", "i", "Lcom/appsflyer/AFLogger$LogLevel;", "getCurrencyIso4217Code", "(Lcom/appsflyer/AFLogger$LogLevel;Lcom/appsflyer/internal/AFh1ySDK;Ljava/lang/String;Ljava/lang/Throwable;)V", "getMediationNetwork", "(Lcom/appsflyer/AFLogger$LogLevel;)Z", "v", "w", "getShouldExtendMsg", "()Z", "AFa1zSDK"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class AFg1eSDK extends AFg1bSDK {

    /* JADX INFO: loaded from: classes34.dex */
    public /* synthetic */ class AFa1ySDK {
        public static final /* synthetic */ int[] getCurrencyIso4217Code;

        static {
            int[] iArr = new int[AFLogger.LogLevel.values().length];
            try {
                iArr[AFLogger.LogLevel.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFLogger.LogLevel.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFLogger.LogLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AFLogger.LogLevel.VERBOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AFLogger.LogLevel.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AFLogger.LogLevel.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            getCurrencyIso4217Code = iArr;
        }
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    /* JADX INFO: renamed from: d */
    public final void mo5914d(@NotNull AFh1ySDK p11, @NotNull String p12, boolean p13) {
        Intrinsics.checkNotNullParameter(p11, "");
        Intrinsics.checkNotNullParameter(p12, "");
        getCurrencyIso4217Code(AFLogger.LogLevel.DEBUG, p11, p12, null);
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    /* JADX INFO: renamed from: e */
    public final void mo5915e(@NotNull AFh1ySDK p11, @NotNull String p12, @NotNull Throwable p13, boolean p14, boolean p15, boolean p16, boolean p17) {
        Intrinsics.checkNotNullParameter(p11, "");
        Intrinsics.checkNotNullParameter(p12, "");
        Intrinsics.checkNotNullParameter(p13, "");
        if (p15) {
            getCurrencyIso4217Code(AFLogger.LogLevel.ERROR, p11, p12, p13);
        } else if (p14) {
            getCurrencyIso4217Code(AFLogger.LogLevel.DEBUG, p11, p12, null);
        }
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void force(@NotNull AFh1ySDK p11, @NotNull String p12) {
        Intrinsics.checkNotNullParameter(p11, "");
        Intrinsics.checkNotNullParameter(p12, "");
        if (AppsFlyerProperties.getInstance().isLogsDisabledCompletely()) {
            return;
        }
        Log.d("AppsFlyer_6.17.4", withTag$SDK_prodRelease(p12, p11));
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    @JvmName(name = "getShouldExtendMsg")
    public final boolean getShouldExtendMsg() {
        return AFLogger.LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    /* JADX INFO: renamed from: i */
    public final void mo5916i(@NotNull AFh1ySDK p11, @NotNull String p12, boolean p13) {
        Intrinsics.checkNotNullParameter(p11, "");
        Intrinsics.checkNotNullParameter(p12, "");
        getCurrencyIso4217Code(AFLogger.LogLevel.INFO, p11, p12, null);
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    /* JADX INFO: renamed from: v */
    public final void mo5917v(@NotNull AFh1ySDK p11, @NotNull String p12, boolean p13) {
        Intrinsics.checkNotNullParameter(p11, "");
        Intrinsics.checkNotNullParameter(p12, "");
        getCurrencyIso4217Code(AFLogger.LogLevel.VERBOSE, p11, p12, null);
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    /* JADX INFO: renamed from: w */
    public final void mo5918w(@NotNull AFh1ySDK p11, @NotNull String p12, boolean p13) {
        Intrinsics.checkNotNullParameter(p11, "");
        Intrinsics.checkNotNullParameter(p12, "");
        getCurrencyIso4217Code(AFLogger.LogLevel.WARNING, p11, p12, null);
    }

    private final void getCurrencyIso4217Code(AFLogger.LogLevel p11, AFh1ySDK p12, String p13, Throwable p14) {
        if (getMediationNetwork(p11)) {
            String revenue = getRevenue(p13, p12);
            int i11 = AFa1ySDK.getCurrencyIso4217Code[p11.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                Log.e("AppsFlyer_6.17.4", revenue, p14);
                                return;
                            }
                            return;
                        }
                        Log.v("AppsFlyer_6.17.4", revenue);
                        return;
                    }
                    Log.w("AppsFlyer_6.17.4", revenue);
                    return;
                }
                Log.i("AppsFlyer_6.17.4", revenue);
                return;
            }
            Log.d("AppsFlyer_6.17.4", revenue);
        }
    }

    private static boolean getMediationNetwork(AFLogger.LogLevel p11) {
        if (p11.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel()) {
            return true;
        }
        return false;
    }
}
