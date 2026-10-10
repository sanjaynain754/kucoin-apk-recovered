package p684v5;

import com.facebook.imageformat.ImageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: v5.c */
/* JADX INFO: compiled from: ImageDecoderConfig.java */
/* JADX INFO: loaded from: classes34.dex */
public class C45422c {

    /* JADX INFO: renamed from: a */
    public final Map<ImageFormat, InterfaceC45421b> f102451a;

    /* JADX INFO: renamed from: b */
    public final List<ImageFormat.InterfaceC5635a> f102452b;

    /* JADX INFO: renamed from: v5.c$a */
    /* JADX INFO: compiled from: ImageDecoderConfig.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public Map<ImageFormat, InterfaceC45421b> f102453a;

        /* JADX INFO: renamed from: b */
        public List<ImageFormat.InterfaceC5635a> f102454b;

        /* JADX INFO: renamed from: c */
        public a m100384c(ImageFormat imageFormat, ImageFormat.InterfaceC5635a interfaceC5635a, InterfaceC45421b interfaceC45421b) {
            if (this.f102454b == null) {
                this.f102454b = new ArrayList();
            }
            this.f102454b.add(interfaceC5635a);
            if (interfaceC45421b != null) {
                m100386e(imageFormat, interfaceC45421b);
            }
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C45422c m100385d() {
            return new C45422c(this);
        }

        /* JADX INFO: renamed from: e */
        public a m100386e(ImageFormat imageFormat, InterfaceC45421b interfaceC45421b) {
            if (this.f102453a == null) {
                this.f102453a = new HashMap();
            }
            this.f102453a.put(imageFormat, interfaceC45421b);
            return this;
        }
    }

    public C45422c(a aVar) {
        this.f102451a = aVar.f102453a;
        this.f102452b = aVar.f102454b;
    }

    /* JADX INFO: renamed from: a */
    public Map<ImageFormat, InterfaceC45421b> m100380a() {
        return this.f102451a;
    }

    /* JADX INFO: renamed from: b */
    public List<ImageFormat.InterfaceC5635a> m100381b() {
        return this.f102452b;
    }
}
