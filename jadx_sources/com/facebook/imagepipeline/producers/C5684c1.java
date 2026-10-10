package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import p617s5.InterfaceC44346r;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.c1 */
/* JADX INFO: compiled from: SettableProducerContext.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5684c1 extends C5688e {
    public C5684c1(ImageRequest imageRequest, InterfaceC5733w0 interfaceC5733w0) {
        this(imageRequest, interfaceC5733w0.getId(), interfaceC5733w0.mo9669k(), interfaceC5733w0.mo9665g(), interfaceC5733w0.mo9663a(), interfaceC5733w0.mo9673o(), interfaceC5733w0.mo9672n(), interfaceC5733w0.mo9671m(), interfaceC5733w0.getPriority(), interfaceC5733w0.mo9664b());
    }

    public C5684c1(ImageRequest imageRequest, String str, InterfaceC5737y0 interfaceC5737y0, Object obj, ImageRequest.RequestLevel requestLevel, boolean z11, boolean z12, Priority priority, InterfaceC44346r interfaceC44346r) {
        super(imageRequest, str, interfaceC5737y0, obj, requestLevel, z11, z12, priority, interfaceC44346r);
    }

    public C5684c1(ImageRequest imageRequest, String str, String str2, InterfaceC5737y0 interfaceC5737y0, Object obj, ImageRequest.RequestLevel requestLevel, boolean z11, boolean z12, Priority priority, InterfaceC44346r interfaceC44346r) {
        super(imageRequest, str, str2, null, interfaceC5737y0, obj, requestLevel, z11, z12, priority, interfaceC44346r);
    }
}
