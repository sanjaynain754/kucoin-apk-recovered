package com.sumsub.sns.internal.features.data.model.prooface;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.C41844l0;
import kotlinx.serialization.internal.C41897w2;
import kotlinx.serialization.internal.InterfaceC41849m0;
import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44951d;
import ug0.C45236a;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.prooface.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29820d implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29820d f59900a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29820d c29820d = new C29820d();
        f59900a = c29820d;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.prooface.CalibrationValue", c29820d, 3);
        c41826h2.m91581o("expositionBias", false);
        c41826h2.m91581o("brightness", false);
        c41826h2.m91581o("color", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        InterfaceC44951d interfaceC44951dM99969u = C45236a.m99969u(C41897w2.f92051a);
        C41844l0 c41844l0 = C41844l0.f91982a;
        return new InterfaceC44951d[]{c41844l0, c41844l0, interfaceC44951dM99969u};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        float fDecodeFloatElement;
        float fDecodeFloatElement2;
        int i11;
        String str;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            fDecodeFloatElement = compositeDecoderBeginStructure.decodeFloatElement(interfaceC45533f, 0);
            fDecodeFloatElement2 = compositeDecoderBeginStructure.decodeFloatElement(interfaceC45533f, 1);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, null);
            i11 = 7;
        } else {
            fDecodeFloatElement = 0.0f;
            boolean z11 = true;
            int i12 = 0;
            String str2 = null;
            float fDecodeFloatElement3 = 0.0f;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    fDecodeFloatElement = compositeDecoderBeginStructure.decodeFloatElement(interfaceC45533f, 0);
                    i12 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    fDecodeFloatElement3 = compositeDecoderBeginStructure.decodeFloatElement(interfaceC45533f, 1);
                    i12 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, str2);
                    i12 |= 4;
                }
            }
            fDecodeFloatElement2 = fDecodeFloatElement3;
            i11 = i12;
            str = str2;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29822f(i11, fDecodeFloatElement, fDecodeFloatElement2, str);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29822f c29822f = (C29822f) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        interfaceC45829bBeginStructure.encodeFloatElement(interfaceC45533f, 0, c29822f.f59901a);
        interfaceC45829bBeginStructure.encodeFloatElement(interfaceC45533f, 1, c29822f.f59902b);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c29822f.f59903c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, c29822f.f59903c);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
