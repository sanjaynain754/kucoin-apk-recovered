package p821z5;

import com.facebook.imagepipeline.request.ImageRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p747x3.C45999a;

/* JADX INFO: renamed from: z5.b */
/* JADX INFO: compiled from: ForwardingRequestListener.java */
/* JADX INFO: loaded from: classes34.dex */
public class C46703b implements InterfaceC46705d {

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC46705d> f104538a;

    public C46703b(Set<InterfaceC46705d> set) {
        this.f104538a = new ArrayList(set.size());
        for (InterfaceC46705d interfaceC46705d : set) {
            if (interfaceC46705d != null) {
                this.f104538a.add(interfaceC46705d);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m102948a(String str, Throwable th2) {
        C45999a.m101508n("ForwardingRequestListener", str, th2);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5739z0
    public void onProducerEvent(String str, String str2, String str3) {
        int size = this.f104538a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f104538a.get(i11).onProducerEvent(str, str2, str3);
            } catch (Exception e11) {
                m102948a("InternalListener exception in onIntermediateChunkStart", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5739z0
    public void onProducerFinishWithCancellation(String str, String str2, Map<String, String> map) {
        int size = this.f104538a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f104538a.get(i11).onProducerFinishWithCancellation(str, str2, map);
            } catch (Exception e11) {
                m102948a("InternalListener exception in onProducerFinishWithCancellation", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5739z0
    public void onProducerFinishWithFailure(String str, String str2, Throwable th2, Map<String, String> map) {
        int size = this.f104538a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f104538a.get(i11).onProducerFinishWithFailure(str, str2, th2, map);
            } catch (Exception e11) {
                m102948a("InternalListener exception in onProducerFinishWithFailure", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5739z0
    public void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
        int size = this.f104538a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f104538a.get(i11).onProducerFinishWithSuccess(str, str2, map);
            } catch (Exception e11) {
                m102948a("InternalListener exception in onProducerFinishWithSuccess", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5739z0
    public void onProducerStart(String str, String str2) {
        int size = this.f104538a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f104538a.get(i11).onProducerStart(str, str2);
            } catch (Exception e11) {
                m102948a("InternalListener exception in onProducerStart", e11);
            }
        }
    }

    @Override // p821z5.InterfaceC46705d
    public void onRequestCancellation(String str) {
        int size = this.f104538a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f104538a.get(i11).onRequestCancellation(str);
            } catch (Exception e11) {
                m102948a("InternalListener exception in onRequestCancellation", e11);
            }
        }
    }

    @Override // p821z5.InterfaceC46705d
    public void onRequestFailure(ImageRequest imageRequest, String str, Throwable th2, boolean z11) {
        int size = this.f104538a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f104538a.get(i11).onRequestFailure(imageRequest, str, th2, z11);
            } catch (Exception e11) {
                m102948a("InternalListener exception in onRequestFailure", e11);
            }
        }
    }

    @Override // p821z5.InterfaceC46705d
    public void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z11) {
        int size = this.f104538a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f104538a.get(i11).onRequestStart(imageRequest, obj, str, z11);
            } catch (Exception e11) {
                m102948a("InternalListener exception in onRequestStart", e11);
            }
        }
    }

    @Override // p821z5.InterfaceC46705d
    public void onRequestSuccess(ImageRequest imageRequest, String str, boolean z11) {
        int size = this.f104538a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f104538a.get(i11).onRequestSuccess(imageRequest, str, z11);
            } catch (Exception e11) {
                m102948a("InternalListener exception in onRequestSuccess", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5739z0
    public void onUltimateProducerReached(String str, String str2, boolean z11) {
        int size = this.f104538a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f104538a.get(i11).onUltimateProducerReached(str, str2, z11);
            } catch (Exception e11) {
                m102948a("InternalListener exception in onProducerFinishWithSuccess", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5739z0
    public boolean requiresExtraMap(String str) {
        int size = this.f104538a.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f104538a.get(i11).requiresExtraMap(str)) {
                return true;
            }
        }
        return false;
    }

    public C46703b(InterfaceC46705d... interfaceC46705dArr) {
        this.f104538a = new ArrayList(interfaceC46705dArr.length);
        for (InterfaceC46705d interfaceC46705d : interfaceC46705dArr) {
            if (interfaceC46705d != null) {
                this.f104538a.add(interfaceC46705d);
            }
        }
    }
}
