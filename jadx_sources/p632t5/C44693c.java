package p632t5;

import com.facebook.imagepipeline.producers.C5684c1;
import com.facebook.imagepipeline.producers.InterfaceC5731v0;
import com.facebook.imagepipeline.producers.InterfaceC5733w0;
import p006a4.AbstractC0110a;
import p192d6.C36621b;
import p251f4.InterfaceC37351b;
import p821z5.InterfaceC46704c;

/* JADX INFO: renamed from: t5.c */
/* JADX INFO: compiled from: CloseableProducerToDataSourceAdapter.java */
/* JADX INFO: loaded from: classes34.dex */
public class C44693c<T> extends AbstractC44691a<AbstractC0110a<T>> {
    public C44693c(InterfaceC5731v0<AbstractC0110a<T>> interfaceC5731v0, C5684c1 c5684c1, InterfaceC46704c interfaceC46704c) {
        super(interfaceC5731v0, c5684c1, interfaceC46704c);
    }

    /* JADX INFO: renamed from: E */
    public static <T> InterfaceC37351b<AbstractC0110a<T>> m98857E(InterfaceC5731v0<AbstractC0110a<T>> interfaceC5731v0, C5684c1 c5684c1, InterfaceC46704c interfaceC46704c) {
        if (C36621b.m81959d()) {
            C36621b.m81957a("CloseableProducerToDataSourceAdapter#create");
        }
        C44693c c44693c = new C44693c(interfaceC5731v0, c5684c1, interfaceC46704c);
        if (C36621b.m81959d()) {
            C36621b.m81958b();
        }
        return c44693c;
    }

    @Override // com.facebook.datasource.AbstractDataSource
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void mo8592e(AbstractC0110a<T> abstractC0110a) {
        AbstractC0110a.m555j(abstractC0110a);
    }

    @Override // com.facebook.datasource.AbstractDataSource, p251f4.InterfaceC37351b
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public AbstractC0110a<T> getResult() {
        return AbstractC0110a.m553h((AbstractC0110a) super.getResult());
    }

    @Override // p632t5.AbstractC44691a
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo98853C(AbstractC0110a<T> abstractC0110a, int i11, InterfaceC5733w0 interfaceC5733w0) {
        super.mo98853C(AbstractC0110a.m553h(abstractC0110a), i11, interfaceC5733w0);
    }
}
