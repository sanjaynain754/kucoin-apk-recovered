package com.kubi.httpdns.cache;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import ck.C4989a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HostRecord.kt */
/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010 \u001a\u0004\b#\u0010\"\"\u0004\b$\u0010%¨\u0006&"}, m90084d2 = {"Lcom/kubi/httpdns/cache/HostRecord;", "Landroid/os/Parcelable;", "", "host", "", "ips", "", "ttl", "timestamp", "<init>", "(Ljava/lang/String;[Ljava/lang/String;JJ)V", "", "fromDisk", "allowMaxTtl", "Lck/a;", "toHttpDnsResult", "(ZJ)Lck/a;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getHost", "()Ljava/lang/String;", "[Ljava/lang/String;", "getIps", "()[Ljava/lang/String;", "J", "getTtl", "()J", "getTimestamp", "setTimestamp", "(J)V", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class HostRecord implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HostRecord> CREATOR = new C15194a();

    @NotNull
    private final String host;

    @NotNull
    private final String[] ips;
    private long timestamp;
    private final long ttl;

    /* JADX INFO: renamed from: com.kubi.httpdns.cache.HostRecord$a */
    /* JADX INFO: compiled from: HostRecord.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C15194a implements Parcelable.Creator<HostRecord> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HostRecord createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HostRecord(parcel.readString(), parcel.createStringArray(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HostRecord[] newArray(int i11) {
            return new HostRecord[i11];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public HostRecord(@NotNull String host, @NotNull String[] ips, long j11, long j12) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(ips, "ips");
        this.host = host;
        this.ips = ips;
        this.ttl = j11;
        this.timestamp = j12;
    }

    public static /* synthetic */ C4989a toHttpDnsResult$default(HostRecord hostRecord, boolean z11, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return hostRecord.toHttpDnsResult(z11, j11);
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    @NotNull
    public final String[] getIps() {
        return this.ips;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final long getTtl() {
        return this.ttl;
    }

    public final void setTimestamp(long j11) {
        this.timestamp = j11;
    }

    @NotNull
    public final C4989a toHttpDnsResult(boolean fromDisk, long allowMaxTtl) {
        return new C4989a(this.host, this.ips, Math.min(this.ttl, allowMaxTtl), this.timestamp, fromDisk);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.host);
        parcel.writeStringArray(this.ips);
        parcel.writeLong(this.ttl);
        parcel.writeLong(this.timestamp);
    }
}
