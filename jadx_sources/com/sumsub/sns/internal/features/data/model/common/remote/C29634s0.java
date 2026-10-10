package com.sumsub.sns.internal.features.data.model.common.remote;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.C41891v0;
import kotlinx.serialization.internal.C41897w2;
import kotlinx.serialization.internal.InterfaceC41849m0;
import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44951d;
import ug0.C45236a;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.s0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29634s0 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29634s0 f59691a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29634s0 c29634s0 = new C29634s0();
        f59691a = c29634s0;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.NfcSessionInfo", c29634s0, 11);
        c41826h2.m91581o("type", false);
        c41826h2.m91581o("seed", true);
        c41826h2.m91581o("documentNumber", true);
        c41826h2.m91581o("birthDate", true);
        c41826h2.m91581o("expirationDate", true);
        c41826h2.m91581o("kinegramAccessToken", true);
        c41826h2.m91581o("kinegramSessionId", true);
        c41826h2.m91581o("mrtdDataFilesToRead", true);
        c41826h2.m91581o("nfcSkipTryCount", true);
        c41826h2.m91581o("fallbackTries", true);
        c41826h2.m91581o("documentScanPosition", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        C41897w2 c41897w2 = C41897w2.f92051a;
        InterfaceC44951d interfaceC44951dM99969u = C45236a.m99969u(c41897w2);
        InterfaceC44951d interfaceC44951dM99969u2 = C45236a.m99969u(c41897w2);
        InterfaceC44951d interfaceC44951dM99969u3 = C45236a.m99969u(c41897w2);
        InterfaceC44951d interfaceC44951dM99969u4 = C45236a.m99969u(c41897w2);
        InterfaceC44951d interfaceC44951dM99969u5 = C45236a.m99969u(c41897w2);
        InterfaceC44951d interfaceC44951dM99969u6 = C45236a.m99969u(c41897w2);
        InterfaceC44951d interfaceC44951dM99969u7 = C45236a.m99969u(c41897w2);
        C41891v0 c41891v0 = C41891v0.f92041a;
        return new InterfaceC44951d[]{c41897w2, interfaceC44951dM99969u, interfaceC44951dM99969u2, interfaceC44951dM99969u3, interfaceC44951dM99969u4, interfaceC44951dM99969u5, interfaceC44951dM99969u6, interfaceC44951dM99969u7, C45236a.m99969u(c41891v0), C45236a.m99969u(c41891v0), C45236a.m99969u(c41897w2)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        Integer num;
        Integer num2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        int i12 = 10;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 0);
            C41897w2 c41897w2 = C41897w2.f92051a;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, c41897w2, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, c41897w2, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, c41897w2, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, c41897w2, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, c41897w2, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 6, c41897w2, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 7, c41897w2, null);
            C41891v0 c41891v0 = C41891v0.f92041a;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 8, c41891v0, null);
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 9, c41891v0, null);
            str8 = strDecodeStringElement2;
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 10, c41897w2, null);
            num = num4;
            str = str16;
            str4 = str15;
            str2 = str14;
            str6 = str12;
            num2 = num3;
            str5 = str13;
            str7 = str11;
            str9 = str10;
            i11 = 2047;
        } else {
            boolean z11 = true;
            int i13 = 0;
            Integer num5 = null;
            Integer num6 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            String str24 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                switch (iDecodeElementIndex) {
                    case -1:
                        z11 = false;
                        break;
                    case 0:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 0);
                        i13 |= 1;
                        i12 = 10;
                        break;
                    case 1:
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, str24);
                        i13 |= 2;
                        i12 = 10;
                        break;
                    case 2:
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, str23);
                        i13 |= 4;
                        i12 = 10;
                        break;
                    case 3:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, str22);
                        i13 |= 8;
                        i12 = 10;
                        break;
                    case 4:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, C41897w2.f92051a, str21);
                        i13 |= 16;
                        i12 = 10;
                        break;
                    case 5:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, C41897w2.f92051a, str18);
                        i13 |= 32;
                        i12 = 10;
                        break;
                    case 6:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 6, C41897w2.f92051a, str20);
                        i13 |= 64;
                        i12 = 10;
                        break;
                    case 7:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 7, C41897w2.f92051a, str17);
                        i13 |= 128;
                        i12 = 10;
                        break;
                    case 8:
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 8, C41891v0.f92041a, num6);
                        i13 |= 256;
                        i12 = 10;
                        break;
                    case 9:
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 9, C41891v0.f92041a, num5);
                        i13 |= 512;
                        i12 = 10;
                        break;
                    case 10:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, i12, C41897w2.f92051a, str19);
                        i13 |= 1024;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i11 = i13;
            num = num5;
            num2 = num6;
            str = str17;
            str2 = str18;
            str3 = str19;
            str4 = str20;
            str5 = str21;
            str6 = str22;
            str7 = str23;
            str8 = strDecodeStringElement;
            str9 = str24;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29655v0(i11, str8, str9, str7, str6, str5, str2, str4, str, num2, num, str3);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29655v0 c29655v0 = (C29655v0) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        interfaceC45829bBeginStructure.encodeStringElement(interfaceC45533f, 0, c29655v0.f59705a);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c29655v0.f59706b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, c29655v0.f59706b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c29655v0.f59707c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, c29655v0.f59707c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c29655v0.f59708d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, c29655v0.f59708d);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 4) || c29655v0.f59709e != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 4, C41897w2.f92051a, c29655v0.f59709e);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 5) || c29655v0.f59710f != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 5, C41897w2.f92051a, c29655v0.f59710f);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 6) || c29655v0.f59711g != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 6, C41897w2.f92051a, c29655v0.f59711g);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 7) || c29655v0.f59712h != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 7, C41897w2.f92051a, c29655v0.f59712h);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 8) || c29655v0.f59713i != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 8, C41891v0.f92041a, c29655v0.f59713i);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 9) || c29655v0.f59714j != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 9, C41891v0.f92041a, c29655v0.f59714j);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 10) || c29655v0.f59715k != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 10, C41897w2.f92051a, c29655v0.f59715k);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
