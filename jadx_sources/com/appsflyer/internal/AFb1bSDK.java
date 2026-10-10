package com.appsflyer.internal;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\f"}, m90084d2 = {"Lcom/appsflyer/internal/AFb1bSDK;", "", "", "getMediationNetwork", "()Z", "Landroid/content/Context;", "p0", "Lcom/appsflyer/internal/AFb1bSDK$AFa1zSDK;", "p1", "", "getCurrencyIso4217Code", "(Landroid/content/Context;Lcom/appsflyer/internal/AFb1bSDK$AFa1zSDK;)V", "()V", "AFa1ySDK", "AFa1zSDK"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface AFb1bSDK {

    /* JADX INFO: renamed from: AFa1ySDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.getMediationNetwork;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFb1bSDK$AFa1ySDK, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes34.dex */
    public static final class Companion {
        static final /* synthetic */ Companion getMediationNetwork = new Companion();
        private static long getRevenue = 500;

        public static long getMediationNetwork() {
            return getRevenue;
        }

        private Companion() {
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public interface AFa1zSDK {
        void getMonetizationNetwork(@NotNull AFh1pSDK aFh1pSDK);

        void getRevenue();
    }

    void getCurrencyIso4217Code();

    void getCurrencyIso4217Code(@NotNull Context p11, @NotNull AFa1zSDK p12);

    boolean getMediationNetwork();
}
