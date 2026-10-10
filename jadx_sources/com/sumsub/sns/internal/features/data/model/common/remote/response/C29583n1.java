package com.sumsub.sns.internal.features.data.model.common.remote.response;

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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.n1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29583n1 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29583n1 f59603a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29583n1 c29583n1 = new C29583n1();
        f59603a = c29583n1;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.response.WithIdDocsStatusResponse.RequiredIdDocs.DocSetsItem.RemotePaymentSourceLevelSettings.TypeSettings", c29583n1, 4);
        c41826h2.m91581o("bankCard", true);
        c41826h2.m91581o("bankAccount", true);
        c41826h2.m91581o("eWallet", true);
        c41826h2.m91581o("cryptoWallet", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        return new InterfaceC44951d[]{C45236a.m99969u(C29536d1.f59563a), C45236a.m99969u(C29521a1.f59541a), C45236a.m99969u(C29571k1.f59595a), C45236a.m99969u(C29556h1.f59580a)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        C29546f1 c29546f1;
        C29531c1 c29531c1;
        C29579m1 c29579m1;
        C29566j1 c29566j1;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        C29546f1 c29546f2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            C29546f1 c29546f3 = (C29546f1) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C29536d1.f59563a, null);
            C29531c1 c29531c2 = (C29531c1) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C29521a1.f59541a, null);
            C29579m1 c29579m2 = (C29579m1) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C29571k1.f59595a, null);
            c29546f1 = c29546f3;
            c29566j1 = (C29566j1) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C29556h1.f59580a, null);
            c29579m1 = c29579m2;
            c29531c1 = c29531c2;
            i11 = 15;
        } else {
            boolean z11 = true;
            int i12 = 0;
            C29531c1 c29531c3 = null;
            C29579m1 c29579m3 = null;
            C29566j1 c29566j2 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    c29546f2 = (C29546f1) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C29536d1.f59563a, c29546f2);
                    i12 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    c29531c3 = (C29531c1) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C29521a1.f59541a, c29531c3);
                    i12 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    c29579m3 = (C29579m1) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C29571k1.f59595a, c29579m3);
                    i12 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    c29566j2 = (C29566j1) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C29556h1.f59580a, c29566j2);
                    i12 |= 8;
                }
            }
            i11 = i12;
            c29546f1 = c29546f2;
            c29531c1 = c29531c3;
            c29579m1 = c29579m3;
            c29566j1 = c29566j2;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29591p1(i11, c29546f1, c29531c1, c29579m1, c29566j1);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29591p1 c29591p1 = (C29591p1) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c29591p1.f59613a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C29536d1.f59563a, c29591p1.f59613a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c29591p1.f59614b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C29521a1.f59541a, c29591p1.f59614b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c29591p1.f59615c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, C29571k1.f59595a, c29591p1.f59615c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c29591p1.f59616d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, C29556h1.f59580a, c29591p1.f59616d);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
