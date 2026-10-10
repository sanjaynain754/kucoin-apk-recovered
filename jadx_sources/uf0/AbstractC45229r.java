package uf0;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.errorprone.annotations.MustBeClosed;
import io.opencensus.trace.Span;
import rf0.InterfaceC44071a;
import tf0.C44941b;

/* JADX INFO: renamed from: uf0.r */
/* JADX INFO: compiled from: Tracer.java */
/* JADX INFO: loaded from: classes60.dex */
public abstract class AbstractC45229r {

    /* JADX INFO: renamed from: a */
    public static final b f101761a = new b();

    /* JADX INFO: renamed from: uf0.r$b */
    /* JADX INFO: compiled from: Tracer.java */
    public static final class b extends AbstractC45229r {
        public b() {
        }

        @Override // uf0.AbstractC45229r
        /* JADX INFO: renamed from: c */
        public AbstractC45223l mo99936c(String str, Span span) {
            return AbstractC45223l.a.m99914c(str, span);
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract AbstractC45223l mo99936c(String str, Span span);

    /* JADX INFO: renamed from: a */
    public static AbstractC45229r m99934a() {
        return f101761a;
    }

    @MustBeClosed
    /* JADX INFO: renamed from: d */
    public final InterfaceC44071a m99937d(Span span) {
        return C45221j.m99910b((Span) C44941b.m99389b(span, TtmlNode.TAG_SPAN), false);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC45223l m99935b(String str) {
        return mo99936c(str, C45221j.m99909a());
    }
}
