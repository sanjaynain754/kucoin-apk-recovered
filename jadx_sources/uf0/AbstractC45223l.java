package uf0;

import io.opencensus.trace.C39220c;
import io.opencensus.trace.Span;
import tf0.C44941b;

/* JADX INFO: renamed from: uf0.l */
/* JADX INFO: compiled from: SpanBuilder.java */
/* JADX INFO: loaded from: classes60.dex */
public abstract class AbstractC45223l {

    /* JADX INFO: renamed from: uf0.l$a */
    /* JADX INFO: compiled from: SpanBuilder.java */
    public static final class a extends AbstractC45223l {
        /* JADX INFO: renamed from: c */
        public static a m99914c(String str, Span span) {
            return new a(str);
        }

        @Override // uf0.AbstractC45223l
        /* JADX INFO: renamed from: b */
        public Span mo99913b() {
            return C39220c.f87110e;
        }

        public a(String str) {
            C44941b.m99389b(str, "name");
        }

        @Override // uf0.AbstractC45223l
        /* JADX INFO: renamed from: a */
        public AbstractC45223l mo99912a(boolean z11) {
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC45223l mo99912a(boolean z11);

    /* JADX INFO: renamed from: b */
    public abstract Span mo99913b();
}
