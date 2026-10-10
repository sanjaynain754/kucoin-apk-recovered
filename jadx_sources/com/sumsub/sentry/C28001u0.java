package com.sumsub.sentry;

import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41874r0;
import kotlinx.serialization.internal.C41897w2;
import kotlinx.serialization.internal.InterfaceC41849m0;
import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44951d;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sentry.u0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C28001u0 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C28001u0 f57136a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        return new InterfaceC44951d[]{C41897w2.f92051a};
    }

    static {
        C28001u0 c28001u0 = new C28001u0();
        f57136a = c28001u0;
        C41874r0 c41874r0 = new C41874r0("com.sumsub.sentry.SentryId", c28001u0);
        c41874r0.m91581o("uuid", true);
        descriptor = c41874r0;
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        return new C28009w0(interfaceC41787b.decodeInline(descriptor).decodeString());
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        String str = ((C28009w0) obj).f57137a;
        InterfaceC45830c interfaceC45830cEncodeInline = interfaceC45830c.encodeInline(descriptor);
        if (interfaceC45830cEncodeInline == null) {
            return;
        }
        interfaceC45830cEncodeInline.encodeString(str);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
