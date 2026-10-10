package io.opencensus.trace;

import rf0.AbstractC44072b;
import tf0.C44941b;
import uf0.AbstractC45217f;

/* JADX INFO: loaded from: classes60.dex */
@Deprecated
public abstract class NetworkEvent extends AbstractC45217f {

    public enum Type {
        SENT,
        RECV
    }

    /* JADX INFO: renamed from: io.opencensus.trace.NetworkEvent$a */
    @Deprecated
    public static abstract class AbstractC39217a {
        /* JADX INFO: renamed from: a */
        public abstract NetworkEvent mo87938a();

        /* JADX INFO: renamed from: b */
        public abstract AbstractC39217a mo87939b(long j11);

        /* JADX INFO: renamed from: c */
        public abstract AbstractC39217a mo87940c(long j11);

        /* JADX INFO: renamed from: d */
        public abstract AbstractC39217a mo87941d(long j11);
    }

    /* JADX INFO: renamed from: b */
    public abstract long mo87933b();

    /* JADX INFO: renamed from: c */
    public abstract AbstractC44072b mo87934c();

    /* JADX INFO: renamed from: d */
    public abstract long mo87935d();

    /* JADX INFO: renamed from: e */
    public abstract Type mo87936e();

    /* JADX INFO: renamed from: f */
    public abstract long mo87937f();

    /* JADX INFO: renamed from: a */
    public static AbstractC39217a m87932a(Type type, long j11) {
        return new C39219b.b().m87956e((Type) C44941b.m99389b(type, "type")).mo87940c(j11).mo87941d(0L).mo87939b(0L);
    }
}
