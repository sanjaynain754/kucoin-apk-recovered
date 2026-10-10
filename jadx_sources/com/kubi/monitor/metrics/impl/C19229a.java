package com.kubi.monitor.metrics.impl;

import androidx.media3.exoplayer.upstream.CmcdData;
import br.InterfaceC4645a;
import com.kubi.monitor.metrics.bean.CollectorData;
import com.kubi.monitor.metrics.util.C19236a;
import com.kubi.monitor.metrics.util.StorageUnit;
import org.jetbrains.annotations.NotNull;
import p840zq.C46908e;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.monitor.metrics.impl.a */
/* JADX INFO: compiled from: MemCollector.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000b¨\u0006\r"}, m90084d2 = {"Lcom/kubi/monitor/metrics/impl/a;", "Lbr/a;", "<init>", "()V", "Lcom/kubi/monitor/metrics/bean/CollectorData;", "b", "()Lcom/kubi/monitor/metrics/bean/CollectorData;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()I", "Ljava/lang/Runtime;", "Ljava/lang/Runtime;", "runtime", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C19229a implements InterfaceC4645a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Runtime runtime;

    @Override // br.InterfaceC4645a
    /* JADX INFO: renamed from: a */
    public int mo4592a() {
        return 2;
    }

    @Override // br.InterfaceC4645a
    @NotNull
    /* JADX INFO: renamed from: b */
    public CollectorData mo4593b() {
        CollectorData collectorDataAcquire = C46908e.f104773a.m103324k().acquire();
        if (collectorDataAcquire == null) {
            collectorDataAcquire = new CollectorData(2);
        } else {
            collectorDataAcquire.m42488i(2);
        }
        long j11 = this.runtime.totalMemory();
        long jFreeMemory = this.runtime.freeMemory();
        long jMaxMemory = this.runtime.maxMemory();
        C19236a c19236a = C19236a.f35593a;
        StorageUnit storageUnit = StorageUnit.BYTES;
        collectorDataAcquire.m42486g(c19236a.m42498a(storageUnit.toMegabytes(j11 - jFreeMemory)), c19236a.m42498a(storageUnit.toMegabytes((jMaxMemory - j11) + jFreeMemory)));
        C44128b.m97259c("MetricsManager", Intrinsics.stringPlus("mem data ", collectorDataAcquire));
        return collectorDataAcquire;
    }

    public C19229a() {
        Runtime runtime = Runtime.getRuntime();
        Intrinsics.checkNotNullExpressionValue(runtime, "getRuntime()");
        this.runtime = runtime;
    }
}
