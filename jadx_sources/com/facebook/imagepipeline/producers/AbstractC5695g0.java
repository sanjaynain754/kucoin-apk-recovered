package com.facebook.imagepipeline.producers;

import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.request.ImageRequest;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import p006a4.AbstractC0110a;
import p712w3.C45702b;
import p749x5.C46075i;
import p819z3.InterfaceC46679h;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.g0 */
/* JADX INFO: compiled from: LocalFetchProducer.java */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC5695g0 implements InterfaceC5731v0<C46075i> {

    /* JADX INFO: renamed from: a */
    public final Executor f9328a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC46679h f9329b;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.g0$a */
    /* JADX INFO: compiled from: LocalFetchProducer.java */
    public class a extends AbstractC5687d1<C46075i> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ImageRequest f9330g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ InterfaceC5737y0 f9331h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC5733w0 f9332i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC5712m interfaceC5712m, InterfaceC5737y0 interfaceC5737y0, InterfaceC5733w0 interfaceC5733w0, String str, ImageRequest imageRequest, InterfaceC5737y0 interfaceC5737y1, InterfaceC5733w0 interfaceC5733w1) {
            super(interfaceC5712m, interfaceC5737y0, interfaceC5733w0, str);
            this.f9330g = imageRequest;
            this.f9331h = interfaceC5737y1;
            this.f9332i = interfaceC5733w1;
        }

        @Override // p651u3.AbstractRunnableC45105h
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public C46075i mo9586c() throws Exception {
            C46075i c46075iMo9572d = AbstractC5695g0.this.mo9572d(this.f9330g);
            if (c46075iMo9572d == null) {
                this.f9331h.mo9453a(this.f9332i, AbstractC5695g0.this.mo9573f(), false);
                this.f9332i.mo9668j(ImagesContract.LOCAL, RemoteConfigComponent.FETCH_FILE_NAME);
                return null;
            }
            c46075iMo9572d.m101560J();
            this.f9331h.mo9453a(this.f9332i, AbstractC5695g0.this.mo9573f(), true);
            this.f9332i.mo9668j(ImagesContract.LOCAL, RemoteConfigComponent.FETCH_FILE_NAME);
            this.f9332i.putExtra(HasExtraData.Companion.KEY_COLOR_SPACE, c46075iMo9572d.m101576k());
            return c46075iMo9572d;
        }

        @Override // p651u3.AbstractRunnableC45105h
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo9585b(C46075i c46075i) {
            C46075i.m101556g(c46075i);
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.g0$b */
    /* JADX INFO: compiled from: LocalFetchProducer.java */
    public class b extends C5691f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC5687d1 f9334a;

        public b(AbstractC5687d1 abstractC5687d1) {
            this.f9334a = abstractC5687d1;
        }

        @Override // com.facebook.imagepipeline.producers.InterfaceC5735x0
        /* JADX INFO: renamed from: b */
        public void mo9116b() {
            this.f9334a.m99725a();
        }
    }

    /* JADX INFO: renamed from: c */
    public C46075i m9692c(InputStream inputStream, int i11) throws IOException {
        AbstractC0110a abstractC0110aM558p = null;
        try {
            abstractC0110aM558p = i11 <= 0 ? AbstractC0110a.m558p(this.f9329b.mo602a(inputStream)) : AbstractC0110a.m558p(this.f9329b.mo606e(inputStream, i11));
            C46075i c46075i = new C46075i((AbstractC0110a<PooledByteBuffer>) abstractC0110aM558p);
            C45702b.m100881b(inputStream);
            AbstractC0110a.m555j(abstractC0110aM558p);
            return c46075i;
        } catch (Throwable th2) {
            C45702b.m100881b(inputStream);
            AbstractC0110a.m555j(abstractC0110aM558p);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract C46075i mo9572d(ImageRequest imageRequest) throws IOException;

    /* JADX INFO: renamed from: f */
    public abstract String mo9573f();

    public AbstractC5695g0(Executor executor, InterfaceC46679h interfaceC46679h) {
        this.f9328a = executor;
        this.f9329b = interfaceC46679h;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5731v0
    /* JADX INFO: renamed from: a */
    public void mo9524a(InterfaceC5712m<C46075i> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
        InterfaceC5737y0 interfaceC5737y0Mo9665g = interfaceC5733w0.mo9665g();
        ImageRequest imageRequestMo9666h = interfaceC5733w0.mo9666h();
        interfaceC5733w0.mo9668j(ImagesContract.LOCAL, RemoteConfigComponent.FETCH_FILE_NAME);
        a aVar = new a(interfaceC5712m, interfaceC5737y0Mo9665g, interfaceC5733w0, mo9573f(), imageRequestMo9666h, interfaceC5737y0Mo9665g, interfaceC5733w0);
        interfaceC5733w0.mo9667i(new b(aVar));
        this.f9328a.execute(aVar);
    }

    /* JADX INFO: renamed from: e */
    public C46075i m9693e(InputStream inputStream, int i11) throws IOException {
        return m9692c(inputStream, i11);
    }
}
