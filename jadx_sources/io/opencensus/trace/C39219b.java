package io.opencensus.trace;

import rf0.AbstractC44072b;

/* JADX INFO: renamed from: io.opencensus.trace.b */
/* JADX INFO: compiled from: AutoValue_NetworkEvent.java */
/* JADX INFO: loaded from: classes60.dex */
@Deprecated
public final class C39219b extends NetworkEvent {

    /* JADX INFO: renamed from: a */
    public final NetworkEvent.Type f87102a;

    /* JADX INFO: renamed from: b */
    public final long f87103b;

    /* JADX INFO: renamed from: c */
    public final long f87104c;

    /* JADX INFO: renamed from: d */
    public final long f87105d;

    /* JADX INFO: renamed from: io.opencensus.trace.b$b */
    /* JADX INFO: compiled from: AutoValue_NetworkEvent.java */
    public static final class b extends NetworkEvent.AbstractC39217a {

        /* JADX INFO: renamed from: a */
        public NetworkEvent.Type f87106a;

        /* JADX INFO: renamed from: b */
        public Long f87107b;

        /* JADX INFO: renamed from: c */
        public Long f87108c;

        /* JADX INFO: renamed from: d */
        public Long f87109d;

        @Override // io.opencensus.trace.NetworkEvent.AbstractC39217a
        /* JADX INFO: renamed from: a */
        public NetworkEvent mo87938a() {
            String str = "";
            if (this.f87106a == null) {
                str = " type";
            }
            if (this.f87107b == null) {
                str = str + " messageId";
            }
            if (this.f87108c == null) {
                str = str + " uncompressedMessageSize";
            }
            if (this.f87109d == null) {
                str = str + " compressedMessageSize";
            }
            if (str.isEmpty()) {
                return new C39219b(null, this.f87106a, this.f87107b.longValue(), this.f87108c.longValue(), this.f87109d.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* JADX INFO: renamed from: e */
        public NetworkEvent.AbstractC39217a m87956e(NetworkEvent.Type type) {
            if (type == null) {
                throw new NullPointerException("Null type");
            }
            this.f87106a = type;
            return this;
        }

        @Override // io.opencensus.trace.NetworkEvent.AbstractC39217a
        /* JADX INFO: renamed from: b */
        public NetworkEvent.AbstractC39217a mo87939b(long j11) {
            this.f87109d = Long.valueOf(j11);
            return this;
        }

        @Override // io.opencensus.trace.NetworkEvent.AbstractC39217a
        /* JADX INFO: renamed from: c */
        public NetworkEvent.AbstractC39217a mo87940c(long j11) {
            this.f87107b = Long.valueOf(j11);
            return this;
        }

        @Override // io.opencensus.trace.NetworkEvent.AbstractC39217a
        /* JADX INFO: renamed from: d */
        public NetworkEvent.AbstractC39217a mo87941d(long j11) {
            this.f87108c = Long.valueOf(j11);
            return this;
        }
    }

    @Override // io.opencensus.trace.NetworkEvent
    /* JADX INFO: renamed from: c */
    public AbstractC44072b mo87934c() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NetworkEvent) {
            NetworkEvent networkEvent = (NetworkEvent) obj;
            networkEvent.mo87934c();
            if (this.f87102a.equals(networkEvent.mo87936e()) && this.f87103b == networkEvent.mo87935d() && this.f87104c == networkEvent.mo87937f() && this.f87105d == networkEvent.mo87933b()) {
                return true;
            }
        }
        return false;
    }

    public C39219b(AbstractC44072b abstractC44072b, NetworkEvent.Type type, long j11, long j12, long j13) {
        this.f87102a = type;
        this.f87103b = j11;
        this.f87104c = j12;
        this.f87105d = j13;
    }

    @Override // io.opencensus.trace.NetworkEvent
    /* JADX INFO: renamed from: b */
    public long mo87933b() {
        return this.f87105d;
    }

    @Override // io.opencensus.trace.NetworkEvent
    /* JADX INFO: renamed from: d */
    public long mo87935d() {
        return this.f87103b;
    }

    @Override // io.opencensus.trace.NetworkEvent
    /* JADX INFO: renamed from: e */
    public NetworkEvent.Type mo87936e() {
        return this.f87102a;
    }

    @Override // io.opencensus.trace.NetworkEvent
    /* JADX INFO: renamed from: f */
    public long mo87937f() {
        return this.f87104c;
    }

    public String toString() {
        return "NetworkEvent{kernelTimestamp=" + ((Object) null) + ", type=" + this.f87102a + ", messageId=" + this.f87103b + ", uncompressedMessageSize=" + this.f87104c + ", compressedMessageSize=" + this.f87105d + "}";
    }

    public int hashCode() {
        long jHashCode = ((1000003 * 1000003) ^ this.f87102a.hashCode()) * 1000003;
        long j11 = this.f87103b;
        long j12 = ((int) (jHashCode ^ (j11 ^ (j11 >>> 32)))) * 1000003;
        long j13 = this.f87104c;
        long j14 = this.f87105d;
        return (int) (((long) (((int) (j12 ^ (j13 ^ (j13 >>> 32)))) * 1000003)) ^ (j14 ^ (j14 >>> 32)));
    }
}
