package io.opencensus.trace;

import tf0.C44941b;
import uf0.AbstractC45217f;

/* JADX INFO: loaded from: classes60.dex */
public abstract class MessageEvent extends AbstractC45217f {

    public enum Type {
        SENT,
        RECEIVED
    }

    /* JADX INFO: renamed from: io.opencensus.trace.MessageEvent$a */
    public static abstract class AbstractC39216a {
        /* JADX INFO: renamed from: a */
        public abstract MessageEvent mo87928a();

        /* JADX INFO: renamed from: b */
        public abstract AbstractC39216a mo87929b(long j11);

        /* JADX INFO: renamed from: c */
        public abstract AbstractC39216a mo87930c(long j11);

        /* JADX INFO: renamed from: d */
        public abstract AbstractC39216a mo87931d(long j11);
    }

    /* JADX INFO: renamed from: b */
    public abstract long mo87924b();

    /* JADX INFO: renamed from: c */
    public abstract long mo87925c();

    /* JADX INFO: renamed from: d */
    public abstract Type mo87926d();

    /* JADX INFO: renamed from: e */
    public abstract long mo87927e();

    /* JADX INFO: renamed from: a */
    public static AbstractC39216a m87923a(Type type, long j11) {
        return new C39218a.b().m87955e((Type) C44941b.m99389b(type, "type")).mo87930c(j11).mo87931d(0L).mo87929b(0L);
    }
}
