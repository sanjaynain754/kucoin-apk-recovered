package com.appsflyer.internal;

/* JADX INFO: loaded from: classes34.dex */
public class AFd1eSDK {
    public final long getRevenue;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.getRevenue == ((AFd1eSDK) obj).getRevenue;
    }

    public int hashCode() {
        long j11 = this.getRevenue;
        return (int) (j11 ^ (j11 >>> 32));
    }

    public AFd1eSDK(long j11) {
        this.getRevenue = j11;
    }
}
