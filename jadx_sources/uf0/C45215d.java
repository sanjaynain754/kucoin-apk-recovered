package uf0;

import io.opencensus.trace.Status;

/* JADX INFO: renamed from: uf0.d */
/* JADX INFO: compiled from: AutoValue_EndSpanOptions.java */
/* JADX INFO: loaded from: classes60.dex */
public final class C45215d extends AbstractC45222k {

    /* JADX INFO: renamed from: b */
    public final boolean f101735b;

    /* JADX INFO: renamed from: c */
    public final Status f101736c;

    /* JADX INFO: renamed from: uf0.d$b */
    /* JADX INFO: compiled from: AutoValue_EndSpanOptions.java */
    public static final class b extends AbstractC45222k.a {

        /* JADX INFO: renamed from: a */
        public Boolean f101737a;

        /* JADX INFO: renamed from: b */
        public Status f101738b;

        @Override // uf0.AbstractC45222k.a
        /* JADX INFO: renamed from: a */
        public AbstractC45222k mo99895a() {
            String str = "";
            if (this.f101737a == null) {
                str = " sampleToLocalSpanStore";
            }
            if (str.isEmpty()) {
                return new C45215d(this.f101737a.booleanValue(), this.f101738b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // uf0.AbstractC45222k.a
        /* JADX INFO: renamed from: b */
        public AbstractC45222k.a mo99896b(Status status) {
            this.f101738b = status;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public AbstractC45222k.a m99897c(boolean z11) {
            this.f101737a = Boolean.valueOf(z11);
            return this;
        }
    }

    public boolean equals(Object obj) {
        Status status;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC45222k) {
            AbstractC45222k abstractC45222k = (AbstractC45222k) obj;
            if (this.f101735b == abstractC45222k.mo99893b() && ((status = this.f101736c) != null ? status.equals(abstractC45222k.mo99894c()) : abstractC45222k.mo99894c() == null)) {
                return true;
            }
        }
        return false;
    }

    public C45215d(boolean z11, Status status) {
        this.f101735b = z11;
        this.f101736c = status;
    }

    @Override // uf0.AbstractC45222k
    /* JADX INFO: renamed from: b */
    public boolean mo99893b() {
        return this.f101735b;
    }

    @Override // uf0.AbstractC45222k
    /* JADX INFO: renamed from: c */
    public Status mo99894c() {
        return this.f101736c;
    }

    public int hashCode() {
        int i11 = ((this.f101735b ? 1231 : 1237) ^ 1000003) * 1000003;
        Status status = this.f101736c;
        return i11 ^ (status == null ? 0 : status.hashCode());
    }

    public String toString() {
        return "EndSpanOptions{sampleToLocalSpanStore=" + this.f101735b + ", status=" + this.f101736c + "}";
    }
}
