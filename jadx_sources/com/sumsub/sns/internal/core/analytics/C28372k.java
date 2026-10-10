package com.sumsub.sns.internal.core.analytics;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.C41838k;
import kotlinx.serialization.internal.C41897w2;
import kotlinx.serialization.internal.InterfaceC41849m0;
import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44951d;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.analytics.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C28372k implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C28372k f57851a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        return new InterfaceC44951d[]{C41897w2.f92051a, C41838k.f91974c};
    }

    static {
        C28372k c28372k = new C28372k();
        f57851a = c28372k;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.core.analytics.SNSAnalyticSink.CacheItem", c28372k, 2);
        c41826h2.m91581o("sessionId", false);
        c41826h2.m91581o("data", false);
        descriptor = c41826h2;
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        String strDecodeStringElement;
        byte[] bArr;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 0);
            bArr = (byte[]) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 1, C41838k.f91974c, null);
            i11 = 3;
        } else {
            boolean z11 = true;
            int i12 = 0;
            byte[] bArr2 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 0);
                    i12 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    bArr2 = (byte[]) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 1, C41838k.f91974c, bArr2);
                    i12 |= 2;
                }
            }
            i11 = i12;
            strDecodeStringElement = strDecodeStringElement2;
            bArr = bArr2;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C28374m(i11, strDecodeStringElement, bArr);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C28374m c28374m = (C28374m) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        interfaceC45829bBeginStructure.encodeStringElement(interfaceC45533f, 0, c28374m.f57852a);
        interfaceC45829bBeginStructure.encodeSerializableElement(interfaceC45533f, 1, C41838k.f91974c, c28374m.f57853b);
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
