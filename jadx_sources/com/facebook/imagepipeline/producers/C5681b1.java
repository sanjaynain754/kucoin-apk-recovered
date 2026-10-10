package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.util.TriState;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p006a4.AbstractC0110a;
import p223e6.C37077b;
import p223e6.C37080e;
import p223e6.InterfaceC37078c;
import p223e6.InterfaceC37079d;
import p422l5.C42054a;
import p712w3.C45708h;
import p749x5.C46075i;
import p819z3.AbstractC46681j;
import p819z3.InterfaceC46679h;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.b1 */
/* JADX INFO: compiled from: ResizeAndRotateProducer.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5681b1 implements InterfaceC5731v0<C46075i> {

    /* JADX INFO: renamed from: a */
    public final Executor f9279a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC46679h f9280b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5731v0<C46075i> f9281c;

    /* JADX INFO: renamed from: d */
    public final boolean f9282d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC37079d f9283e;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.b1$a */
    /* JADX INFO: compiled from: ResizeAndRotateProducer.java */
    public class a extends AbstractC5724s<C46075i, C46075i> {

        /* JADX INFO: renamed from: c */
        public final boolean f9284c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC37079d f9285d;

        /* JADX INFO: renamed from: e */
        public final InterfaceC5733w0 f9286e;

        /* JADX INFO: renamed from: f */
        public boolean f9287f;

        /* JADX INFO: renamed from: g */
        public final JobScheduler f9288g;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.b1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ResizeAndRotateProducer.java */
        public class C46965a implements JobScheduler.InterfaceC5670d {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C5681b1 f9290a;

            public C46965a(C5681b1 c5681b1) {
                this.f9290a = c5681b1;
            }

            @Override // com.facebook.imagepipeline.producers.JobScheduler.InterfaceC5670d
            /* JADX INFO: renamed from: a */
            public void mo9570a(C46075i c46075i, int i11) throws Throwable {
                if (c46075i == null) {
                    a.this.m9801o().mo9652b(null, i11);
                } else {
                    a aVar = a.this;
                    aVar.m9640v(c46075i, i11, (InterfaceC37078c) C45708h.m100896g(aVar.f9285d.createImageTranscoder(c46075i.m101578m(), a.this.f9284c)));
                }
            }
        }

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.b1$a$b */
        /* JADX INFO: compiled from: ResizeAndRotateProducer.java */
        public class b extends C5691f {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C5681b1 f9292a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC5712m f9293b;

            public b(C5681b1 c5681b1, InterfaceC5712m interfaceC5712m) {
                this.f9292a = c5681b1;
                this.f9293b = interfaceC5712m;
            }

            @Override // com.facebook.imagepipeline.producers.C5691f, com.facebook.imagepipeline.producers.InterfaceC5735x0
            /* JADX INFO: renamed from: a */
            public void mo9557a() {
                if (a.this.f9286e.mo9671m()) {
                    a.this.f9288g.m9567h();
                }
            }

            @Override // com.facebook.imagepipeline.producers.InterfaceC5735x0
            /* JADX INFO: renamed from: b */
            public void mo9116b() {
                a.this.f9288g.m9562c();
                a.this.f9287f = true;
                this.f9293b.mo9651a();
            }
        }

        public a(InterfaceC5712m<C46075i> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0, boolean z11, InterfaceC37079d interfaceC37079d) {
            super(interfaceC5712m);
            this.f9287f = false;
            this.f9286e = interfaceC5733w0;
            Boolean resizingAllowedOverride = interfaceC5733w0.mo9666h().getResizingAllowedOverride();
            this.f9284c = resizingAllowedOverride != null ? resizingAllowedOverride.booleanValue() : z11;
            this.f9285d = interfaceC37079d;
            this.f9288g = new JobScheduler(C5681b1.this.f9279a, new C46965a(C5681b1.this), 100);
            interfaceC5733w0.mo9667i(new b(C5681b1.this, interfaceC5712m));
        }

        /* JADX INFO: renamed from: A */
        public final C46075i m9638A(C46075i c46075i) {
            return (this.f9286e.mo9666h().getRotationOptions().getDeferUntilRendered() || c46075i.m101559F() == 0 || c46075i.m101559F() == -1) ? c46075i : m9642x(c46075i, 0);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public void mo9551h(C46075i c46075i, int i11) {
            if (this.f9287f) {
                return;
            }
            boolean zM9645d = AbstractC5682c.m9645d(i11);
            if (c46075i == null) {
                if (zM9645d) {
                    m9801o().mo9652b(null, 1);
                    return;
                }
                return;
            }
            ImageFormat imageFormatM101578m = c46075i.m101578m();
            TriState triStateM9631h = C5681b1.m9631h(this.f9286e.mo9666h(), c46075i, (InterfaceC37078c) C45708h.m100896g(this.f9285d.createImageTranscoder(imageFormatM101578m, this.f9284c)));
            if (zM9645d || triStateM9631h != TriState.UNSET) {
                if (triStateM9631h != TriState.YES) {
                    m9641w(c46075i, i11, imageFormatM101578m);
                } else if (this.f9288g.m9569k(c46075i, i11)) {
                    if (zM9645d || this.f9286e.mo9671m()) {
                        this.f9288g.m9567h();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: v */
        public final void m9640v(C46075i c46075i, int i11, InterfaceC37078c interfaceC37078c) throws Throwable {
            this.f9286e.mo9665g().mo9454b(this.f9286e, "ResizeAndRotateProducer");
            ImageRequest imageRequestMo9666h = this.f9286e.mo9666h();
            AbstractC46681j abstractC46681jMo603b = C5681b1.this.f9280b.mo603b();
            try {
                try {
                    C37077b c37077bMo9510b = interfaceC37078c.mo9510b(c46075i, abstractC46681jMo603b, imageRequestMo9666h.getRotationOptions(), imageRequestMo9666h.getResizeOptions(), null, 85, c46075i.m101576k());
                    if (c37077bMo9510b.getTranscodeStatus() == 2) {
                        throw new RuntimeException("Error while transcoding the image");
                    }
                    Map<String, String> mapM9643y = m9643y(c46075i, imageRequestMo9666h.getResizeOptions(), c37077bMo9510b, interfaceC37078c.getIdentifier());
                    AbstractC0110a abstractC0110aM558p = AbstractC0110a.m558p(abstractC46681jMo603b.mo9487a());
                    try {
                        C46075i c46075i2 = new C46075i((AbstractC0110a<PooledByteBuffer>) abstractC0110aM558p);
                        c46075i2.m101567S(C42054a.com.jumio.core.constants.ConstantsKt.FILE_TYPE_JPEG java.lang.String);
                        try {
                            c46075i2.m101560J();
                            this.f9286e.mo9665g().mo9462j(this.f9286e, "ResizeAndRotateProducer", mapM9643y);
                            if (c37077bMo9510b.getTranscodeStatus() != 1) {
                                i11 |= 16;
                            }
                            m9801o().mo9652b(c46075i2, i11);
                            C46075i.m101556g(c46075i2);
                            AbstractC0110a.m555j(abstractC0110aM558p);
                            abstractC46681jMo603b.close();
                        } catch (Throwable th2) {
                            C46075i.m101556g(c46075i2);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        AbstractC0110a.m555j(abstractC0110aM558p);
                        throw th3;
                    }
                } catch (Exception e11) {
                    this.f9286e.mo9665g().mo9463k(this.f9286e, "ResizeAndRotateProducer", e11, null);
                    if (AbstractC5682c.m9645d(i11)) {
                        m9801o().onFailure(e11);
                    }
                    abstractC46681jMo603b.close();
                }
            } catch (Throwable th4) {
                abstractC46681jMo603b.close();
                throw th4;
            }
        }

        /* JADX INFO: renamed from: w */
        public final void m9641w(C46075i c46075i, int i11, ImageFormat imageFormat) {
            m9801o().mo9652b((imageFormat == C42054a.com.jumio.core.constants.ConstantsKt.FILE_TYPE_JPEG java.lang.String || imageFormat == C42054a.HEIF) ? m9638A(c46075i) : m9644z(c46075i), i11);
        }

        /* JADX INFO: renamed from: y */
        public final Map<String, String> m9643y(C46075i c46075i, ResizeOptions resizeOptions, C37077b c37077b, String str) {
            String str2;
            if (!this.f9286e.mo9665g().mo9458f(this.f9286e, "ResizeAndRotateProducer")) {
                return null;
            }
            String str3 = c46075i.getWidth() + "x" + c46075i.getHeight();
            if (resizeOptions != null) {
                str2 = resizeOptions.width + "x" + resizeOptions.height;
            } else {
                str2 = "Unspecified";
            }
            HashMap map = new HashMap();
            map.put("Image format", String.valueOf(c46075i.m101578m()));
            map.put("Original size", str3);
            map.put("Requested size", str2);
            map.put("queueTime", String.valueOf(this.f9288g.m9565f()));
            map.put("Transcoder id", str);
            map.put("Transcoding result", String.valueOf(c37077b));
            return ImmutableMap.copyOf((Map) map);
        }

        /* JADX INFO: renamed from: z */
        public final C46075i m9644z(C46075i c46075i) {
            RotationOptions rotationOptions = this.f9286e.mo9666h().getRotationOptions();
            return (rotationOptions.m9196j() || !rotationOptions.m9195i()) ? c46075i : m9642x(c46075i, rotationOptions.m9194h());
        }

        /* JADX INFO: renamed from: x */
        public final C46075i m9642x(C46075i c46075i, int i11) {
            C46075i c46075iM101555b = C46075i.m101555b(c46075i);
            if (c46075iM101555b != null) {
                c46075iM101555b.m101568T(i11);
            }
            return c46075iM101555b;
        }
    }

    /* JADX INFO: renamed from: h */
    public static TriState m9631h(ImageRequest imageRequest, C46075i c46075i, InterfaceC37078c interfaceC37078c) {
        if (c46075i == null || c46075i.m101578m() == ImageFormat.f8817d) {
            return TriState.UNSET;
        }
        if (interfaceC37078c.mo9511c(c46075i.m101578m())) {
            return TriState.valueOf(m9629f(imageRequest.getRotationOptions(), c46075i) || interfaceC37078c.mo9509a(c46075i, imageRequest.getRotationOptions(), imageRequest.getResizeOptions()));
        }
        return TriState.NO;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5731v0
    /* JADX INFO: renamed from: a */
    public void mo9524a(InterfaceC5712m<C46075i> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
        this.f9281c.mo9524a(new a(interfaceC5712m, interfaceC5733w0, this.f9282d, this.f9283e), interfaceC5733w0);
    }

    public C5681b1(Executor executor, InterfaceC46679h interfaceC46679h, InterfaceC5731v0<C46075i> interfaceC5731v0, boolean z11, InterfaceC37079d interfaceC37079d) {
        this.f9279a = (Executor) C45708h.m100896g(executor);
        this.f9280b = (InterfaceC46679h) C45708h.m100896g(interfaceC46679h);
        this.f9281c = (InterfaceC5731v0) C45708h.m100896g(interfaceC5731v0);
        this.f9283e = (InterfaceC37079d) C45708h.m100896g(interfaceC37079d);
        this.f9282d = z11;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m9629f(RotationOptions rotationOptions, C46075i c46075i) {
        if (!rotationOptions.getDeferUntilRendered()) {
            if (C37080e.m82993e(rotationOptions, c46075i) != 0 || m9630g(rotationOptions, c46075i)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m9630g(RotationOptions rotationOptions, C46075i c46075i) {
        if (rotationOptions.m9195i() && !rotationOptions.getDeferUntilRendered()) {
            return C37080e.INVERTED_EXIF_ORIENTATIONS.contains(Integer.valueOf(c46075i.m101583t()));
        }
        c46075i.m101565Q(0);
        return false;
    }
}
