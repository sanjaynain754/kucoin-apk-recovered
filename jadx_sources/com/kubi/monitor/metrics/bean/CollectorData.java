package com.kubi.monitor.metrics.bean;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CollectorData.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\u0005R\"\u0010#\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010&\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001e\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"¨\u0006*"}, m90084d2 = {"Lcom/kubi/monitor/metrics/bean/CollectorData;", "", "", "dataType", "<init>", "(I)V", "", "value", "restValue", "", "g", "(JJ)V", "data", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lcom/kubi/monitor/metrics/bean/CollectorData;)V", "", "toString", "()Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I)Lcom/kubi/monitor/metrics/bean/CollectorData;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "e", "i", "b", "J", "c", "()J", "setCurrentTime", "(J)V", "currentTime", "d", "setCurrentValue", "currentValue", "f", "setRestValue", "Companion", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final /* data */ class CollectorData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public int dataType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public long currentTime = System.currentTimeMillis();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    public long currentValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public long restValue;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CollectorData) && this.dataType == ((CollectorData) other).dataType;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ CollectorData m42480b(CollectorData collectorData, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = collectorData.dataType;
        }
        return collectorData.m42481a(i11);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final CollectorData m42481a(int dataType) {
        return new CollectorData(dataType);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getCurrentTime() {
        return this.currentTime;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getCurrentValue() {
        return this.currentValue;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getRestValue() {
        return this.restValue;
    }

    /* JADX INFO: renamed from: g */
    public final void m42486g(long value, long restValue) {
        this.currentValue = value;
        this.restValue = restValue;
        this.currentTime = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: h */
    public final void m42487h(@NotNull CollectorData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.currentValue = data.currentValue;
        this.restValue = data.restValue;
        this.currentTime = data.currentTime;
        this.dataType = data.dataType;
    }

    public int hashCode() {
        return Integer.hashCode(this.dataType);
    }

    /* JADX INFO: renamed from: i */
    public final void m42488i(int i11) {
        this.dataType = i11;
    }

    @NotNull
    public String toString() {
        return "CollectorData(dataType=" + this.dataType + ", currentTime=" + this.currentTime + ", currentValue=" + this.currentValue + ", restValue=" + this.restValue + ')';
    }

    public CollectorData(int i11) {
        this.dataType = i11;
    }
}
