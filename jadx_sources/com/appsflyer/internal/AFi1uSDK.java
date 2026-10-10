package com.appsflyer.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u0014\u0010\u0014\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 "}, m90084d2 = {"Lcom/appsflyer/internal/AFi1uSDK;", "", "", "p0", "", "p1", "", "", "p2", "", "p3", "p4", "p5", "<init>", "(JFLjava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getRevenue", "()Z", "getCurrencyIso4217Code", "Ljava/lang/String;", "getMediationNetwork", "I", "AFAdRevenueData", "F", "getMonetizationNetwork", "component4", "Ljava/util/List;", "component2", "J"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class AFi1uSDK {

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    public long component4;

    /* JADX INFO: renamed from: component4, reason: from kotlin metadata */
    @NotNull
    public final String getRevenue;

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    public final float getMonetizationNetwork;

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    public final int AFAdRevenueData;

    /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    @NotNull
    public List<String> component2;

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    @NotNull
    public final String getMediationNetwork;

    public final boolean equals(@Nullable Object p11) {
        if (this == p11) {
            return true;
        }
        if (!Intrinsics.areEqual(AFi1uSDK.class, p11 != null ? p11.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(p11, "");
        AFi1uSDK aFi1uSDK = (AFi1uSDK) p11;
        return this.component4 == aFi1uSDK.component4 && this.getMonetizationNetwork == aFi1uSDK.getMonetizationNetwork && Intrinsics.areEqual(this.component2, aFi1uSDK.component2) && this.AFAdRevenueData == aFi1uSDK.AFAdRevenueData && Intrinsics.areEqual(this.getMediationNetwork, aFi1uSDK.getMediationNetwork) && Intrinsics.areEqual(this.getRevenue, aFi1uSDK.getRevenue);
    }

    @JvmOverloads
    public AFi1uSDK(long j11, float f11, @NotNull List<String> list, int i11, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.component4 = j11;
        this.getMonetizationNetwork = f11;
        this.component2 = list;
        this.AFAdRevenueData = i11;
        this.getMediationNetwork = str;
        this.getRevenue = str2;
    }

    @JvmName(name = "getRevenue")
    public final boolean getRevenue() {
        long millis = TimeUnit.SECONDS.toMillis(this.component4);
        AFa1ySDK monetizationNetwork = AFa1ySDK.getMonetizationNetwork();
        return millis > ((AFd1zSDK) AFa1ySDK.getCurrencyIso4217Code(new Object[]{monetizationNetwork}, 254507867, -254507852, System.identityHashCode(monetizationNetwork))).component2().getMonetizationNetwork();
    }

    public final int hashCode() {
        return (((((((((Long.hashCode(this.component4) * 31) + Float.hashCode(this.getMonetizationNetwork)) * 31) + this.component2.hashCode()) * 31) + this.AFAdRevenueData) * 31) + this.getMediationNetwork.hashCode()) * 31) + this.getRevenue.hashCode();
    }
}
