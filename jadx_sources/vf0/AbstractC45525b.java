package vf0;

/* JADX INFO: renamed from: vf0.b */
/* JADX INFO: compiled from: ExportComponent.java */
/* JADX INFO: loaded from: classes60.dex */
public abstract class AbstractC45525b {

    /* JADX INFO: renamed from: vf0.b$b */
    /* JADX INFO: compiled from: ExportComponent.java */
    public static final class b extends AbstractC45525b {

        /* JADX INFO: renamed from: a */
        public final AbstractC45526c f102583a;

        public b() {
            this.f102583a = AbstractC45526c.m100514a();
        }

        @Override // vf0.AbstractC45525b
        /* JADX INFO: renamed from: a */
        public AbstractC45526c mo100513a() {
            return this.f102583a;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC45526c mo100513a();

    /* JADX INFO: renamed from: b */
    public static AbstractC45525b m100512b() {
        return new b();
    }
}
