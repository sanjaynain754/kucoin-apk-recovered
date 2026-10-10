package com.appsflyer.internal;

import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rBE\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f"}, m90084d2 = {"Lcom/appsflyer/internal/AFd1gSDK;", "Lcom/appsflyer/internal/AFd1aSDK;", "", "p0", "", "p1", "", "p2", "p3", "", "p4", "<init>", "(Ljava/lang/String;Ljava/util/Map;[BLjava/lang/String;Z)V", "AFa1zSDK"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class AFd1gSDK extends AFd1aSDK {

    /* JADX INFO: renamed from: AFa1zSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1gSDK$AFa1zSDK, reason: from kotlin metadata */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\n\u001a\u0006*\u00020\u00040\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\r"}, m90084d2 = {"Lcom/appsflyer/internal/AFd1gSDK$AFa1zSDK;", "", "<init>", "()V", "", "p0", "p1", "p2", "p3", "p4", "getMonetizationNetwork", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getRevenue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting
        public static String getMonetizationNetwork(@NotNull String p11, @NotNull String p12, @Nullable String p13, @NotNull String p14, @NotNull String p15) {
            Intrinsics.checkNotNullParameter(p11, "");
            Intrinsics.checkNotNullParameter(p12, "");
            Intrinsics.checkNotNullParameter(p14, "");
            Intrinsics.checkNotNullParameter(p15, "");
            return AFj1dSDK.getRevenue(TextUtils.join("\u2063", new String[]{p15, p13, p11 + p12}), p14);
        }

        public static String getRevenue(String p11, String p12, String p13) {
            return String.format(AFd1mSDK.getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), AFa1ySDK.getMonetizationNetwork().getHostName()) + p11 + p13 + "?device_id=" + p12;
        }
    }

    public /* synthetic */ AFd1gSDK(String str, Map map, byte[] bArr, String str2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i11 & 4) != 0 ? null : bArr, (i11 & 8) != 0 ? "GET" : str2, (i11 & 16) != 0 ? false : z11);
    }

    @JvmStatic
    @NotNull
    public static final AFd1gSDK getMediationNetwork(@NotNull String str, @Nullable String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        String revenue = Companion.getRevenue(str, str2, str3);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        AFd1gSDK aFd1gSDK = new AFd1gSDK(revenue, MapsKt.mapOf(TuplesKt.m90091to("Connection", "close"), TuplesKt.m90091to("af_request_epoch_ms", strValueOf), TuplesKt.m90091to("af_sig", Companion.getMonetizationNetwork(str, str3, str2, str4, strValueOf))), null, null, false, 28, null);
        aFd1gSDK.component3 = 10000;
        return aFd1gSDK;
    }

    private AFd1gSDK(String str, Map<String, String> map, byte[] bArr, String str2, boolean z11) {
        super(str, bArr, str2, map, z11);
    }
}
