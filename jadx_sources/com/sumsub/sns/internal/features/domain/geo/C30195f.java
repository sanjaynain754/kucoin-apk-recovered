package com.sumsub.sns.internal.features.domain.geo;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41799c0;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.C41844l0;
import kotlinx.serialization.internal.InterfaceC41849m0;
import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44951d;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.geo.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C30195f implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C30195f f60686a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        C41799c0 c41799c0 = C41799c0.f91901a;
        return new InterfaceC44951d[]{c41799c0, c41799c0, C41844l0.f91982a};
    }

    static {
        C30195f c30195f = new C30195f();
        f60686a = c30195f;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.domain.geo.EncodeLocationUseCase.LocationPayload", c30195f, 3);
        c41826h2.m91581o("lat", false);
        c41826h2.m91581o("lon", false);
        c41826h2.m91581o("accuracy", false);
        descriptor = c41826h2;
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        float fDecodeFloatElement;
        int i11;
        double d11;
        double d12;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            double dDecodeDoubleElement = compositeDecoderBeginStructure.decodeDoubleElement(interfaceC45533f, 0);
            double dDecodeDoubleElement2 = compositeDecoderBeginStructure.decodeDoubleElement(interfaceC45533f, 1);
            fDecodeFloatElement = compositeDecoderBeginStructure.decodeFloatElement(interfaceC45533f, 2);
            i11 = 7;
            d11 = dDecodeDoubleElement;
            d12 = dDecodeDoubleElement2;
        } else {
            fDecodeFloatElement = 0.0f;
            boolean z11 = true;
            double dDecodeDoubleElement3 = 0.0d;
            int i12 = 0;
            double dDecodeDoubleElement4 = 0.0d;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    dDecodeDoubleElement4 = compositeDecoderBeginStructure.decodeDoubleElement(interfaceC45533f, 0);
                    i12 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    dDecodeDoubleElement3 = compositeDecoderBeginStructure.decodeDoubleElement(interfaceC45533f, 1);
                    i12 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    fDecodeFloatElement = compositeDecoderBeginStructure.decodeFloatElement(interfaceC45533f, 2);
                    i12 |= 4;
                }
            }
            i11 = i12;
            d11 = dDecodeDoubleElement4;
            d12 = dDecodeDoubleElement3;
        }
        float f11 = fDecodeFloatElement;
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C30197h(i11, d11, d12, f11);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C30197h c30197h = (C30197h) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        interfaceC45829bBeginStructure.encodeDoubleElement(interfaceC45533f, 0, c30197h.f60687a);
        interfaceC45829bBeginStructure.encodeDoubleElement(interfaceC45533f, 1, c30197h.f60688b);
        interfaceC45829bBeginStructure.encodeFloatElement(interfaceC45533f, 2, c30197h.f60689c);
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
