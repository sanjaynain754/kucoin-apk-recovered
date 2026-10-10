package com.sumsub.sns.internal.features.data.model.esign;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.C41828i;
import kotlinx.serialization.internal.C41891v0;
import kotlinx.serialization.internal.InterfaceC41849m0;
import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44951d;
import ug0.C45236a;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.esign.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29780p implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29780p f59851a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29780p c29780p = new C29780p();
        f59851a = c29780p;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.esign.ESignOtp", c29780p, 4);
        c41826h2.m91581o("sent", true);
        c41826h2.m91581o("codeLength", true);
        c41826h2.m91581o("resendTtl", true);
        c41826h2.m91581o("confirmed", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        C41828i c41828i = C41828i.f91957a;
        InterfaceC44951d interfaceC44951dM99969u = C45236a.m99969u(c41828i);
        C41891v0 c41891v0 = C41891v0.f92041a;
        return new InterfaceC44951d[]{interfaceC44951dM99969u, C45236a.m99969u(c41891v0), C45236a.m99969u(c41891v0), C45236a.m99969u(c41828i)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        Boolean bool;
        Integer num;
        Integer num2;
        Boolean bool2;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Boolean bool3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            C41828i c41828i = C41828i.f91957a;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, c41828i, null);
            C41891v0 c41891v0 = C41891v0.f92041a;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, c41891v0, null);
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, c41891v0, null);
            bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, c41828i, null);
            i11 = 15;
            num2 = num4;
            num = num3;
            bool = bool4;
        } else {
            boolean z11 = true;
            int i12 = 0;
            Integer num5 = null;
            Integer num6 = null;
            Boolean bool5 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41828i.f91957a, bool3);
                    i12 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41891v0.f92041a, num5);
                    i12 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41891v0.f92041a, num6);
                    i12 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C41828i.f91957a, bool5);
                    i12 |= 8;
                }
            }
            i11 = i12;
            bool = bool3;
            num = num5;
            num2 = num6;
            bool2 = bool5;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29783s(i11, bool, num, num2, bool2);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29783s c29783s = (C29783s) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c29783s.f59852a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C41828i.f91957a, c29783s.f59852a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c29783s.f59853b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C41891v0.f92041a, c29783s.f59853b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c29783s.f59854c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, C41891v0.f92041a, c29783s.f59854c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c29783s.f59855d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, C41828i.f91957a, c29783s.f59855d);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
