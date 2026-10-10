package com.appsflyer.internal;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, m90084d2 = {"Lcom/appsflyer/internal/AFe1tSDK;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCurrencyIso4217Code", "Ljava/lang/String;", "getMonetizationNetwork", "getRevenue", "AFAdRevenueData"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public enum AFe1tSDK {
    API("api"),
    RC("rc"),
    DEFAULT("");


    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    @NotNull
    public final String getMonetizationNetwork;

    AFe1tSDK(String str) {
        this.getMonetizationNetwork = str;
    }
}
