package com.appsflyer.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B+\b\u0002\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, m90084d2 = {"Lcom/appsflyer/internal/AFa1gSDK;", "", "", "", "p0", "Lcom/appsflyer/internal/AFa1jSDK;", "p1", "<init>", "(Ljava/util/Map;Lcom/appsflyer/internal/AFa1jSDK;)V", "", "AFAdRevenueData", "(Ljava/lang/String;)Z", "", "getCurrencyIso4217Code", "(Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/util/Map;", "getRevenue", "Lcom/appsflyer/internal/AFa1jSDK;", "AFa1uSDK"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class AFa1gSDK {

    /* JADX INFO: renamed from: AFa1uSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    final Map<String, Object> AFAdRevenueData;

    @Nullable
    final AFa1jSDK getRevenue;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFa1gSDK$AFa1uSDK, reason: from kotlin metadata */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b"}, m90084d2 = {"Lcom/appsflyer/internal/AFa1gSDK$AFa1uSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFh1mSDK;", "p0", "Lcom/appsflyer/internal/AFa1gSDK;", "getMediationNetwork", "(Lcom/appsflyer/internal/AFh1mSDK;)Lcom/appsflyer/internal/AFa1gSDK;", "Lcom/appsflyer/internal/AFa1jSDK;", "getMonetizationNetwork", "(Lcom/appsflyer/internal/AFa1jSDK;)Lcom/appsflyer/internal/AFa1gSDK;"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        @NotNull
        public static AFa1gSDK getMediationNetwork(@NotNull AFh1mSDK p11) {
            Intrinsics.checkNotNullParameter(p11, "");
            Map<String, Object> map = p11.getMonetizationNetwork;
            Intrinsics.checkNotNullExpressionValue(map, "");
            return new AFa1gSDK(map, null, 2, 0 == true ? 1 : 0);
        }

        @JvmStatic
        @NotNull
        public static AFa1gSDK getMonetizationNetwork(@NotNull AFa1jSDK p11) {
            Intrinsics.checkNotNullParameter(p11, "");
            return new AFa1gSDK(new LinkedHashMap(), p11, null);
        }
    }

    private AFa1gSDK(Map<String, Object> map, AFa1jSDK aFa1jSDK) {
        this.AFAdRevenueData = map;
        this.getRevenue = aFa1jSDK;
    }

    public final boolean AFAdRevenueData(@NotNull String p11) {
        Intrinsics.checkNotNullParameter(p11, "");
        return this.AFAdRevenueData.containsKey(p11);
    }

    @JvmStatic
    @NotNull
    public static final AFa1gSDK AFAdRevenueData(@NotNull AFa1jSDK aFa1jSDK) {
        return Companion.getMonetizationNetwork(aFa1jSDK);
    }

    public final void getCurrencyIso4217Code(@NotNull String p11, @Nullable Object p12) {
        Intrinsics.checkNotNullParameter(p11, "");
        this.AFAdRevenueData.put(p11, p12);
        AFa1jSDK aFa1jSDK = this.getRevenue;
        if (aFa1jSDK != null) {
            aFa1jSDK.getMediationNetwork(this.AFAdRevenueData);
        }
    }

    @JvmStatic
    @NotNull
    public static final AFa1gSDK getMonetizationNetwork(@NotNull AFh1mSDK aFh1mSDK) {
        return Companion.getMediationNetwork(aFh1mSDK);
    }

    public /* synthetic */ AFa1gSDK(Map map, AFa1jSDK aFa1jSDK, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i11 & 2) != 0 ? null : aFa1jSDK);
    }

    public /* synthetic */ AFa1gSDK(Map map, AFa1jSDK aFa1jSDK, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, aFa1jSDK);
    }
}
