package io.opencensus.trace;

/* JADX INFO: renamed from: io.opencensus.trace.a */
/* JADX INFO: compiled from: AutoValue_MessageEvent.java */
/* JADX INFO: loaded from: classes60.dex */
public final class C39218a extends MessageEvent {

    /* JADX INFO: renamed from: a */
    public final MessageEvent.Type f87094a;

    /* JADX INFO: renamed from: b */
    public final long f87095b;

    /* JADX INFO: renamed from: c */
    public final long f87096c;

    /* JADX INFO: renamed from: d */
    public final long f87097d;

    /* JADX INFO: renamed from: io.opencensus.trace.a$b */
    /* JADX INFO: compiled from: AutoValue_MessageEvent.java */
    public static final class b extends MessageEvent.AbstractC39216a {

        /* JADX INFO: renamed from: a */
        public MessageEvent.Type f87098a;

        /* JADX INFO: renamed from: b */
        public Long f87099b;

        /* JADX INFO: renamed from: c */
        public Long f87100c;

        /* JADX INFO: renamed from: d */
        public Long f87101d;

        @Override // io.opencensus.trace.MessageEvent.AbstractC39216a
        /* JADX INFO: renamed from: a */
        public MessageEvent mo87928a() {
            String str = "";
            if (this.f87098a == null) {
                str = " type";
            }
            if (this.f87099b == null) {
                str = str + " messageId";
            }
            if (this.f87100c == null) {
                str = str + " uncompressedMessageSize";
            }
            if (this.f87101d == null) {
                str = str + " compressedMessageSize";
            }
            if (str.isEmpty()) {
                return new C39218a(this.f87098a, this.f87099b.longValue(), this.f87100c.longValue(), this.f87101d.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* JADX INFO: renamed from: e */
        public MessageEvent.AbstractC39216a m87955e(MessageEvent.Type type) {
            if (type == null) {
                throw new NullPointerException("Null type");
            }
            this.f87098a = type;
            return this;
        }

        @Override // io.opencensus.trace.MessageEvent.AbstractC39216a
        /* JADX INFO: renamed from: b */
        public MessageEvent.AbstractC39216a mo87929b(long j11) {
            this.f87101d = Long.valueOf(j11);
            return this;
        }

        @Override // io.opencensus.trace.MessageEvent.AbstractC39216a
        /* JADX INFO: renamed from: c */
        public MessageEvent.AbstractC39216a mo87930c(long j11) {
            this.f87099b = Long.valueOf(j11);
            return this;
        }

        @Override // io.opencensus.trace.MessageEvent.AbstractC39216a
        /* JADX INFO: renamed from: d */
        public MessageEvent.AbstractC39216a mo87931d(long j11) {
            this.f87100c = Long.valueOf(j11);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MessageEvent) {
            MessageEvent messageEvent = (MessageEvent) obj;
            if (this.f87094a.equals(messageEvent.mo87926d()) && this.f87095b == messageEvent.mo87925c() && this.f87096c == messageEvent.mo87927e() && this.f87097d == messageEvent.mo87924b()) {
                return true;
            }
        }
        return false;
    }

    public C39218a(MessageEvent.Type type, long j11, long j12, long j13) {
        this.f87094a = type;
        this.f87095b = j11;
        this.f87096c = j12;
        this.f87097d = j13;
    }

    @Override // io.opencensus.trace.MessageEvent
    /* JADX INFO: renamed from: b */
    public long mo87924b() {
        return this.f87097d;
    }

    @Override // io.opencensus.trace.MessageEvent
    /* JADX INFO: renamed from: c */
    public long mo87925c() {
        return this.f87095b;
    }

    @Override // io.opencensus.trace.MessageEvent
    /* JADX INFO: renamed from: d */
    public MessageEvent.Type mo87926d() {
        return this.f87094a;
    }

    @Override // io.opencensus.trace.MessageEvent
    /* JADX INFO: renamed from: e */
    public long mo87927e() {
        return this.f87096c;
    }

    public int hashCode() {
        long jHashCode = (this.f87094a.hashCode() ^ 1000003) * 1000003;
        long j11 = this.f87095b;
        long j12 = ((int) (jHashCode ^ (j11 ^ (j11 >>> 32)))) * 1000003;
        long j13 = this.f87096c;
        long j14 = this.f87097d;
        return (int) (((long) (((int) (j12 ^ (j13 ^ (j13 >>> 32)))) * 1000003)) ^ (j14 ^ (j14 >>> 32)));
    }

    public String toString() {
        return "MessageEvent{type=" + this.f87094a + ", messageId=" + this.f87095b + ", uncompressedMessageSize=" + this.f87096c + ", compressedMessageSize=" + this.f87097d + "}";
    }
}
