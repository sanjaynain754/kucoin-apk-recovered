package vf0;

import io.opencensus.trace.Status;
import java.util.Map;

/* JADX INFO: renamed from: vf0.a */
/* JADX INFO: compiled from: AutoValue_SampledSpanStore_PerSpanNameSummary.java */
/* JADX INFO: loaded from: classes60.dex */
public final class C45524a extends AbstractC45526c.c {

    /* JADX INFO: renamed from: a */
    public final Map<Object, Integer> f102581a;

    /* JADX INFO: renamed from: b */
    public final Map<Status.CanonicalCode, Integer> f102582b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC45526c.c) {
            AbstractC45526c.c cVar = (AbstractC45526c.c) obj;
            if (this.f102581a.equals(cVar.mo100511c()) && this.f102582b.equals(cVar.mo100510b())) {
                return true;
            }
        }
        return false;
    }

    @Override // vf0.AbstractC45526c.c
    /* JADX INFO: renamed from: b */
    public Map<Status.CanonicalCode, Integer> mo100510b() {
        return this.f102582b;
    }

    @Override // vf0.AbstractC45526c.c
    /* JADX INFO: renamed from: c */
    public Map<Object, Integer> mo100511c() {
        return this.f102581a;
    }

    public int hashCode() {
        return ((this.f102581a.hashCode() ^ 1000003) * 1000003) ^ this.f102582b.hashCode();
    }

    public String toString() {
        return "PerSpanNameSummary{numbersOfLatencySampledSpans=" + this.f102581a + ", numbersOfErrorSampledSpans=" + this.f102582b + "}";
    }

    public C45524a(Map<Object, Integer> map, Map<Status.CanonicalCode, Integer> map2) {
        if (map != null) {
            this.f102581a = map;
            if (map2 != null) {
                this.f102582b = map2;
                return;
            }
            throw new NullPointerException("Null numbersOfErrorSampledSpans");
        }
        throw new NullPointerException("Null numbersOfLatencySampledSpans");
    }
}
