package com.sumsub.sns.internal.features.data.model.common.remote.response;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.C41828i;
import kotlinx.serialization.internal.C41897w2;
import kotlinx.serialization.internal.InterfaceC41849m0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import tg0.InterfaceC44949c;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44963p;
import ug0.C45236a;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.O0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29497O0 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29497O0 f59521a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29497O0 c29497o0 = new C29497O0();
        f59521a = c29497o0;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.response.WithIdDocsStatusResponse.RequiredIdDocs.DocSetsItem", c29497o0, 17);
        c41826h2.m91581o("idDocSetType", true);
        c41826h2.m91581o("types", true);
        c41826h2.m91581o("subTypes", true);
        c41826h2.m91581o("videoRequired", true);
        c41826h2.m91581o("fields", true);
        c41826h2.m91581o("customFields", true);
        c41826h2.m91581o("questionnaireId", true);
        c41826h2.m91581o("questionnaireDefId", true);
        c41826h2.m91581o("captureMode", true);
        c41826h2.m91581o("uploaderMode", true);
        c41826h2.m91581o("restrictCountries", true);
        c41826h2.m91581o("poaStepSettingsId", true);
        c41826h2.m91581o("skipAllowed", true);
        c41826h2.m91581o("nfcVerificationSettings", true);
        c41826h2.m91581o("phoneVerificationSettings", true);
        c41826h2.m91581o("emailVerificationSettings", true);
        c41826h2.m91581o("paymentSourceSettings", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        Lazy[] lazyArr = C29599r1.f59619r;
        C41897w2 c41897w2 = C41897w2.f92051a;
        InterfaceC44951d interfaceC44951dM99969u = C45236a.m99969u(c41897w2);
        InterfaceC44951d interfaceC44951dM99969u2 = C45236a.m99969u((InterfaceC44951d) lazyArr[1].getValue());
        InterfaceC44951d interfaceC44951dM99969u3 = C45236a.m99969u((InterfaceC44951d) lazyArr[2].getValue());
        InterfaceC44951d interfaceC44951dM99969u4 = C45236a.m99969u(c41897w2);
        InterfaceC44951d interfaceC44951dM99969u5 = C45236a.m99969u((InterfaceC44951d) lazyArr[4].getValue());
        InterfaceC44951d interfaceC44951dM99969u6 = C45236a.m99969u((InterfaceC44951d) lazyArr[5].getValue());
        InterfaceC44951d interfaceC44951dM99969u7 = C45236a.m99969u(c41897w2);
        InterfaceC44951d interfaceC44951dM99969u8 = C45236a.m99969u(c41897w2);
        InterfaceC44951d interfaceC44951dM99969u9 = C45236a.m99969u(c41897w2);
        InterfaceC44951d interfaceC44951dM99969u10 = C45236a.m99969u(c41897w2);
        C41828i c41828i = C41828i.f91957a;
        return new InterfaceC44951d[]{interfaceC44951dM99969u, interfaceC44951dM99969u2, interfaceC44951dM99969u3, interfaceC44951dM99969u4, interfaceC44951dM99969u5, interfaceC44951dM99969u6, interfaceC44951dM99969u7, interfaceC44951dM99969u8, interfaceC44951dM99969u9, interfaceC44951dM99969u10, C45236a.m99969u(c41828i), C45236a.m99969u(c41897w2), C45236a.m99969u(c41828i), C45236a.m99969u(C29506T0.f59526a), C45236a.m99969u(C29512W0.f59533a), C45236a.m99969u(C29501Q0.f59522a), C45236a.m99969u(C29518Z0.f59538a)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        String str;
        String str2;
        C29595q1 c29595q1;
        C29504S0 c29504s0;
        C29516Y0 c29516y0;
        C29510V0 c29510v0;
        Boolean bool;
        String str3;
        String str4;
        String str5;
        String str6;
        List list;
        List list2;
        String str7;
        List list3;
        List list4;
        Boolean bool2;
        int i12;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29599r1.f59619r;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            C41897w2 c41897w2 = C41897w2.f92051a;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, c41897w2, null);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, (InterfaceC44949c) lazyArr[1].getValue(), null);
            List list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, (InterfaceC44949c) lazyArr[2].getValue(), null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, c41897w2, null);
            List list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, (InterfaceC44949c) lazyArr[4].getValue(), null);
            List list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, (InterfaceC44949c) lazyArr[5].getValue(), null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 6, c41897w2, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 7, c41897w2, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 8, c41897w2, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 9, c41897w2, null);
            C41828i c41828i = C41828i.f91957a;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 10, c41828i, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 11, c41897w2, null);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 12, c41828i, null);
            C29510V0 c29510v1 = (C29510V0) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 13, C29506T0.f59526a, null);
            C29516Y0 c29516y1 = (C29516Y0) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 14, C29512W0.f59533a, null);
            C29504S0 c29504s1 = (C29504S0) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 15, C29501Q0.f59522a, null);
            i11 = 131071;
            c29595q1 = (C29595q1) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 16, C29518Z0.f59538a, null);
            bool = bool4;
            list3 = list7;
            list2 = list6;
            list = list5;
            str = str8;
            str7 = str9;
            str6 = str13;
            str4 = str11;
            str5 = str10;
            str3 = str12;
            bool2 = bool3;
            c29504s0 = c29504s1;
            c29516y0 = c29516y1;
            c29510v0 = c29510v1;
            str2 = str14;
            list4 = list8;
        } else {
            int i13 = 4;
            int i14 = 2;
            int i15 = 1;
            boolean z11 = true;
            Boolean bool5 = null;
            String str15 = null;
            List list9 = null;
            C29595q1 c29595q2 = null;
            C29504S0 c29504s2 = null;
            C29510V0 c29510v2 = null;
            Boolean bool6 = null;
            String str16 = null;
            String str17 = null;
            List list10 = null;
            String str18 = null;
            String str19 = null;
            List list11 = null;
            List list12 = null;
            String str20 = null;
            int i16 = 5;
            i11 = 0;
            C29516Y0 c29516y2 = null;
            String str21 = null;
            while (z11) {
                List list13 = list10;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                switch (iDecodeElementIndex) {
                    case -1:
                        z11 = false;
                        list10 = list13;
                        list9 = list9;
                        i15 = 1;
                        i14 = 2;
                        i13 = 4;
                        break;
                    case 0:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, str19);
                        i11 |= 1;
                        list11 = list11;
                        list10 = list13;
                        list9 = list9;
                        bool5 = bool5;
                        i15 = 1;
                        i14 = 2;
                        i13 = 4;
                        i16 = 5;
                        break;
                    case 1:
                        int i17 = i15;
                        list11 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, i17, (InterfaceC44949c) lazyArr[i15].getValue(), list11);
                        i11 |= 2;
                        list12 = list12;
                        list10 = list13;
                        bool5 = bool5;
                        i14 = 2;
                        i16 = 5;
                        i15 = i17;
                        list9 = list9;
                        i13 = 4;
                        break;
                    case 2:
                        int i18 = i14;
                        list12 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, i18, (InterfaceC44949c) lazyArr[i14].getValue(), list12);
                        i11 |= 4;
                        str20 = str20;
                        list10 = list13;
                        bool5 = bool5;
                        i16 = 5;
                        i14 = i18;
                        list9 = list9;
                        i13 = 4;
                        break;
                    case 3:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, str20);
                        i11 |= 8;
                        list10 = list13;
                        list9 = list9;
                        bool5 = bool5;
                        i13 = 4;
                        i16 = 5;
                        break;
                    case 4:
                        Boolean bool7 = bool5;
                        List list14 = list9;
                        int i19 = i13;
                        list10 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, i19, (InterfaceC44949c) lazyArr[i13].getValue(), list13);
                        i11 |= 16;
                        i13 = i19;
                        list9 = list14;
                        bool5 = bool7;
                        i16 = 5;
                        break;
                    case 5:
                        List list15 = list9;
                        int i21 = i16;
                        i11 |= 32;
                        list9 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, i21, (InterfaceC44949c) lazyArr[i16].getValue(), list15);
                        bool5 = bool5;
                        i16 = i21;
                        list10 = list13;
                        break;
                    case 6:
                        list9 = list9;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 6, C41897w2.f92051a, str21);
                        i11 |= 64;
                        list10 = list13;
                        list9 = list9;
                        break;
                    case 7:
                        list9 = list9;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 7, C41897w2.f92051a, str17);
                        i11 |= 128;
                        list10 = list13;
                        list9 = list9;
                        break;
                    case 8:
                        list9 = list9;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 8, C41897w2.f92051a, str16);
                        i11 |= 256;
                        list10 = list13;
                        list9 = list9;
                        break;
                    case 9:
                        list9 = list9;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 9, C41897w2.f92051a, str18);
                        i11 |= 512;
                        list10 = list13;
                        list9 = list9;
                        break;
                    case 10:
                        list9 = list9;
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 10, C41828i.f91957a, bool5);
                        i11 |= 1024;
                        list10 = list13;
                        list9 = list9;
                        break;
                    case 11:
                        list9 = list9;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 11, C41897w2.f92051a, str15);
                        i11 |= 2048;
                        list10 = list13;
                        list9 = list9;
                        break;
                    case 12:
                        list9 = list9;
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 12, C41828i.f91957a, bool6);
                        i11 |= 4096;
                        list10 = list13;
                        list9 = list9;
                        break;
                    case 13:
                        list9 = list9;
                        c29510v2 = (C29510V0) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 13, C29506T0.f59526a, c29510v2);
                        i11 |= 8192;
                        list10 = list13;
                        list9 = list9;
                        break;
                    case 14:
                        list9 = list9;
                        c29516y2 = (C29516Y0) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 14, C29512W0.f59533a, c29516y2);
                        i11 |= 16384;
                        list10 = list13;
                        list9 = list9;
                        break;
                    case 15:
                        c29504s2 = (C29504S0) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 15, C29501Q0.f59522a, c29504s2);
                        i12 = 32768;
                        i11 |= i12;
                        list10 = list13;
                        list9 = list9;
                        break;
                    case 16:
                        c29595q2 = (C29595q1) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 16, C29518Z0.f59538a, c29595q2);
                        i12 = 65536;
                        i11 |= i12;
                        list10 = list13;
                        list9 = list9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str19;
            str2 = str15;
            c29595q1 = c29595q2;
            c29504s0 = c29504s2;
            c29516y0 = c29516y2;
            c29510v0 = c29510v2;
            bool = bool6;
            str3 = str16;
            str4 = str17;
            str5 = str21;
            str6 = str18;
            list = list11;
            list2 = list12;
            str7 = str20;
            list3 = list10;
            list4 = list9;
            bool2 = bool5;
        }
        int i22 = i11;
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29599r1(i22, str, list, list2, str7, list3, list4, str5, str4, str3, str6, bool2, str2, bool, c29510v0, c29516y0, c29504s0, c29595q1);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29599r1 c29599r1 = (C29599r1) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29599r1.f59619r;
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c29599r1.f59620a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, c29599r1.f59620a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c29599r1.f59621b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, (InterfaceC44963p) lazyArr[1].getValue(), c29599r1.f59621b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c29599r1.f59622c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, (InterfaceC44963p) lazyArr[2].getValue(), c29599r1.f59622c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c29599r1.f59623d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, c29599r1.f59623d);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 4) || c29599r1.f59624e != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 4, (InterfaceC44963p) lazyArr[4].getValue(), c29599r1.f59624e);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 5) || c29599r1.f59625f != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 5, (InterfaceC44963p) lazyArr[5].getValue(), c29599r1.f59625f);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 6) || c29599r1.f59626g != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 6, C41897w2.f92051a, c29599r1.f59626g);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 7) || c29599r1.f59627h != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 7, C41897w2.f92051a, c29599r1.f59627h);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 8) || c29599r1.f59628i != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 8, C41897w2.f92051a, c29599r1.f59628i);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 9) || c29599r1.f59629j != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 9, C41897w2.f92051a, c29599r1.f59629j);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 10) || c29599r1.f59630k != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 10, C41828i.f91957a, c29599r1.f59630k);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 11) || c29599r1.f59631l != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 11, C41897w2.f92051a, c29599r1.f59631l);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 12) || c29599r1.f59632m != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 12, C41828i.f91957a, c29599r1.f59632m);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 13) || c29599r1.f59633n != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 13, C29506T0.f59526a, c29599r1.f59633n);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 14) || c29599r1.f59634o != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 14, C29512W0.f59533a, c29599r1.f59634o);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 15) || c29599r1.f59635p != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 15, C29501Q0.f59522a, c29599r1.f59635p);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 16) || c29599r1.f59636q != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 16, C29518Z0.f59538a, c29599r1.f59636q);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
