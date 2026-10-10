package com.sumsub.sns.internal.features.data.model.sumsubid;

import com.kubi.kyc.KycKey;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.sumsubid.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29881v implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29881v f59967a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29881v c29881v = new C29881v();
        f59967a = c29881v;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.sumsubid.SNSSumsubIdDocsResponse.SNSSumsubIdIdDoc", c29881v, 14);
        c41826h2.m91581o("idDocType", true);
        c41826h2.m91581o("country", true);
        c41826h2.m91581o(KycKey.firstName, true);
        c41826h2.m91581o("firstNameEn", true);
        c41826h2.m91581o(KycKey.lastName, true);
        c41826h2.m91581o("lastNameEn", true);
        c41826h2.m91581o("issuedDate", true);
        c41826h2.m91581o("validUntil", true);
        c41826h2.m91581o("number", true);
        c41826h2.m91581o("dob", true);
        c41826h2.m91581o("mrzLine1", true);
        c41826h2.m91581o("mrzLine2", true);
        c41826h2.m91581o("mrzLine3", true);
        c41826h2.m91581o("address", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        Lazy[] lazyArr = C29883x.f59968o;
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new InterfaceC44951d[]{C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u((InterfaceC44951d) lazyArr[13].getValue())};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        String str;
        int i11;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        Map map;
        String str12;
        String str13;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29883x.f59968o;
        Map map2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            C41897w2 c41897w2 = C41897w2.f92051a;
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, c41897w2, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, c41897w2, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, c41897w2, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, c41897w2, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, c41897w2, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, c41897w2, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 6, c41897w2, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 7, c41897w2, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 8, c41897w2, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 9, c41897w2, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 10, c41897w2, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 11, c41897w2, null);
            str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 12, c41897w2, null);
            map = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 13, (InterfaceC44949c) lazyArr[13].getValue(), null);
            i11 = 16383;
            str3 = str24;
            str8 = str23;
            str5 = str21;
            str6 = str20;
            str9 = str19;
            str10 = str17;
            str4 = str22;
            str7 = str18;
            str11 = str16;
            str13 = str15;
            str = str14;
            str2 = str25;
        } else {
            int i12 = 13;
            int i13 = 0;
            String str26 = null;
            String str27 = null;
            String str28 = null;
            String str29 = null;
            String str30 = null;
            String str31 = null;
            String str32 = null;
            String str33 = null;
            String str34 = null;
            String str35 = null;
            String str36 = null;
            String str37 = null;
            boolean z11 = true;
            String str38 = null;
            while (z11) {
                int i14 = i12;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                switch (iDecodeElementIndex) {
                    case -1:
                        str37 = str37;
                        str26 = str26;
                        z11 = false;
                        map2 = map2;
                        i12 = 13;
                        break;
                    case 0:
                        i13 |= 1;
                        str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, str37);
                        str26 = str26;
                        map2 = map2;
                        i12 = 13;
                        break;
                    case 1:
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, str26);
                        i13 |= 2;
                        map2 = map2;
                        str36 = str36;
                        i12 = 13;
                        break;
                    case 2:
                        str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, str38);
                        i13 |= 4;
                        map2 = map2;
                        str26 = str26;
                        i12 = 13;
                        break;
                    case 3:
                        str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, str35);
                        i13 |= 8;
                        map2 = map2;
                        str26 = str26;
                        i12 = 13;
                        break;
                    case 4:
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, C41897w2.f92051a, str32);
                        i13 |= 16;
                        map2 = map2;
                        str26 = str26;
                        i12 = 13;
                        break;
                    case 5:
                        str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, C41897w2.f92051a, str34);
                        i13 |= 32;
                        map2 = map2;
                        str26 = str26;
                        i12 = 13;
                        break;
                    case 6:
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 6, C41897w2.f92051a, str31);
                        i13 |= 64;
                        map2 = map2;
                        str26 = str26;
                        i12 = 13;
                        break;
                    case 7:
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 7, C41897w2.f92051a, str30);
                        i13 |= 128;
                        map2 = map2;
                        str26 = str26;
                        i12 = 13;
                        break;
                    case 8:
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 8, C41897w2.f92051a, str29);
                        i13 |= 256;
                        map2 = map2;
                        str26 = str26;
                        i12 = 13;
                        break;
                    case 9:
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 9, C41897w2.f92051a, str33);
                        i13 |= 512;
                        map2 = map2;
                        str26 = str26;
                        i12 = 13;
                        break;
                    case 10:
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 10, C41897w2.f92051a, str28);
                        i13 |= 1024;
                        map2 = map2;
                        str26 = str26;
                        i12 = 13;
                        break;
                    case 11:
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 11, C41897w2.f92051a, str27);
                        i13 |= 2048;
                        map2 = map2;
                        str26 = str26;
                        i12 = 13;
                        break;
                    case 12:
                        str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 12, C41897w2.f92051a, str36);
                        i13 |= 4096;
                        map2 = map2;
                        str26 = str26;
                        i12 = 13;
                        break;
                    case 13:
                        map2 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, i14, (InterfaceC44949c) lazyArr[i14].getValue(), map2);
                        i13 |= 8192;
                        i12 = i14;
                        str26 = str26;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str37;
            i11 = i13;
            str2 = str27;
            str3 = str28;
            str4 = str29;
            str5 = str30;
            str6 = str31;
            str7 = str32;
            str8 = str33;
            str9 = str34;
            str10 = str35;
            str11 = str38;
            map = map2;
            str12 = str36;
            str13 = str26;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29883x(i11, str, str13, str11, str10, str7, str9, str6, str5, str4, str8, str3, str2, str12, map);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29883x c29883x = (C29883x) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29883x.f59968o;
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c29883x.f59969a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, c29883x.f59969a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c29883x.f59970b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, c29883x.f59970b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c29883x.f59971c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, c29883x.f59971c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c29883x.f59972d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, c29883x.f59972d);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 4) || c29883x.f59973e != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 4, C41897w2.f92051a, c29883x.f59973e);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 5) || c29883x.f59974f != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 5, C41897w2.f92051a, c29883x.f59974f);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 6) || c29883x.f59975g != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 6, C41897w2.f92051a, c29883x.f59975g);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 7) || c29883x.f59976h != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 7, C41897w2.f92051a, c29883x.f59976h);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 8) || c29883x.f59977i != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 8, C41897w2.f92051a, c29883x.f59977i);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 9) || c29883x.f59978j != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 9, C41897w2.f92051a, c29883x.f59978j);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 10) || c29883x.f59979k != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 10, C41897w2.f92051a, c29883x.f59979k);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 11) || c29883x.f59980l != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 11, C41897w2.f92051a, c29883x.f59980l);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 12) || c29883x.f59981m != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 12, C41897w2.f92051a, c29883x.f59981m);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 13) || c29883x.f59982n != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 13, (InterfaceC44963p) lazyArr[13].getValue(), c29883x.f59982n);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
