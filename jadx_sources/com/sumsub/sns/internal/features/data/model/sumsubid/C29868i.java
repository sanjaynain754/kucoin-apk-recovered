package com.sumsub.sns.internal.features.data.model.sumsubid;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.C41828i;
import kotlinx.serialization.internal.InterfaceC41849m0;
import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44951d;
import ug0.C45236a;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.sumsubid.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29868i implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29868i f59949a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29868i c29868i = new C29868i();
        f59949a = c29868i;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.sumsubid.SNSSumsubIdCheckCodeResponse.ProfileInfo", c29868i, 2);
        c41826h2.m91581o("currentAgreementAccepted", true);
        c41826h2.m91581o("hasDocs", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        C41828i c41828i = C41828i.f91957a;
        return new InterfaceC44951d[]{C45236a.m99969u(c41828i), C45236a.m99969u(c41828i)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        Boolean bool;
        Boolean bool2;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Boolean bool3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            C41828i c41828i = C41828i.f91957a;
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, c41828i, null);
            bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, c41828i, null);
            i11 = 3;
        } else {
            boolean z11 = true;
            int i12 = 0;
            Boolean bool4 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41828i.f91957a, bool3);
                    i12 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41828i.f91957a, bool4);
                    i12 |= 2;
                }
            }
            i11 = i12;
            bool = bool3;
            bool2 = bool4;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29871l(i11, bool, bool2);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29871l c29871l = (C29871l) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c29871l.f59950a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C41828i.f91957a, c29871l.f59950a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c29871l.f59951b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C41828i.f91957a, c29871l.f59951b);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
