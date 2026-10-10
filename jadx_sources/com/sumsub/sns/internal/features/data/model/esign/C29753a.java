package com.sumsub.sns.internal.features.data.model.esign;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.InterfaceC41849m0;
import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44951d;
import ug0.C45236a;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.esign.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29753a implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29753a f59830a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29753a c29753a = new C29753a();
        f59830a = c29753a;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.esign.ESignAction", c29753a, 3);
        c41826h2.m91581o("agreement", true);
        c41826h2.m91581o("otp", true);
        c41826h2.m91581o("requiredData", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        return new InterfaceC44951d[]{C45236a.m99969u(C29765g.f59841a), C45236a.m99969u(C29780p.f59851a), C45236a.m99969u(C29743O.f59814a)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        C29769i c29769i;
        C29783s c29783s;
        C29745Q c29745q;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        C29769i c29769i2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            c29769i = (C29769i) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C29765g.f59841a, null);
            c29783s = (C29783s) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C29780p.f59851a, null);
            c29745q = (C29745Q) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C29743O.f59814a, null);
            i11 = 7;
        } else {
            boolean z11 = true;
            int i12 = 0;
            C29783s c29783s2 = null;
            C29745Q c29745q2 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    c29769i2 = (C29769i) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C29765g.f59841a, c29769i2);
                    i12 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    c29783s2 = (C29783s) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C29780p.f59851a, c29783s2);
                    i12 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    c29745q2 = (C29745Q) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C29743O.f59814a, c29745q2);
                    i12 |= 4;
                }
            }
            i11 = i12;
            c29769i = c29769i2;
            c29783s = c29783s2;
            c29745q = c29745q2;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29757c(i11, c29769i, c29783s, c29745q);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29757c c29757c = (C29757c) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c29757c.f59831a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C29765g.f59841a, c29757c.f59831a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c29757c.f59832b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C29780p.f59851a, c29757c.f59832b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c29757c.f59833c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, C29743O.f59814a, c29757c.f59833c);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
