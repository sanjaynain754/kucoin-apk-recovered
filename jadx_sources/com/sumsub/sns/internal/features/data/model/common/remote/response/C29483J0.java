package com.sumsub.sns.internal.features.data.model.common.remote.response;

import androidx.autofill.HintConstants;
import com.kubi.kyc.KycKey;
import java.util.List;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.J0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29483J0 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29483J0 f59492a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29483J0 c29483j0 = new C29483J0();
        f59492a = c29483j0;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.response.WithIdDocsStatusResponse.Info", c29483j0, 15);
        c41826h2.m91581o("country", true);
        c41826h2.m91581o(KycKey.firstName, true);
        c41826h2.m91581o(KycKey.lastName, true);
        c41826h2.m91581o("middleName", true);
        c41826h2.m91581o("legalName", true);
        c41826h2.m91581o(HintConstants.AUTOFILL_HINT_GENDER, true);
        c41826h2.m91581o("dob", true);
        c41826h2.m91581o("placeOfBirth", true);
        c41826h2.m91581o("countryOfBirth", true);
        c41826h2.m91581o("stateOfBirth", true);
        c41826h2.m91581o(KycKey.nationality, true);
        c41826h2.m91581o("addresses", true);
        c41826h2.m91581o("tin", true);
        c41826h2.m91581o("taxResidenceCountry", true);
        c41826h2.m91581o(HintConstants.AUTOFILL_HINT_PHONE, true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        Lazy[] lazyArr = C29489L0.f59500p;
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new InterfaceC44951d[]{C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u((InterfaceC44951d) lazyArr[11].getValue()), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        String str;
        String str2;
        String str3;
        String str4;
        List list;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29489L0.f59500p;
        String str16 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            C41897w2 c41897w2 = C41897w2.f92051a;
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, c41897w2, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, c41897w2, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, c41897w2, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, c41897w2, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, c41897w2, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, c41897w2, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 6, c41897w2, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 7, c41897w2, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 8, c41897w2, null);
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 9, c41897w2, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 10, c41897w2, null);
            str = str18;
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 11, (InterfaceC44949c) lazyArr[11].getValue(), null);
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 12, c41897w2, null);
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 13, c41897w2, null);
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 14, c41897w2, null);
            i11 = 32767;
            str4 = str30;
            str14 = str28;
            str2 = str17;
            str5 = str27;
            str10 = str26;
            str7 = str24;
            str8 = str23;
            str11 = str22;
            str13 = str20;
            str6 = str25;
            str9 = str21;
            str12 = str19;
            str3 = str29;
            list = list2;
        } else {
            String str31 = null;
            List list3 = null;
            String str32 = null;
            String str33 = null;
            String str34 = null;
            String str35 = null;
            String str36 = null;
            String str37 = null;
            String str38 = null;
            String str39 = null;
            String str40 = null;
            String str41 = null;
            boolean z11 = true;
            i11 = 0;
            String str42 = null;
            String str43 = null;
            while (z11) {
                String str44 = str42;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                switch (iDecodeElementIndex) {
                    case -1:
                        str31 = str31;
                        z11 = false;
                        str42 = str44;
                        str31 = str31;
                        break;
                    case 0:
                        str15 = str44;
                        str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, str40);
                        i11 |= 1;
                        str41 = str41;
                        str42 = str15;
                        str39 = str39;
                        str31 = str31;
                        break;
                    case 1:
                        str15 = str44;
                        str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, str41);
                        i11 |= 2;
                        str42 = str15;
                        str39 = str39;
                        str31 = str31;
                        break;
                    case 2:
                        str31 = str31;
                        str39 = str39;
                        i11 |= 4;
                        str42 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, str44);
                        str39 = str39;
                        str31 = str31;
                        break;
                    case 3:
                        str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, str39);
                        i11 |= 8;
                        str31 = str31;
                        str42 = str44;
                        break;
                    case 4:
                        str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, C41897w2.f92051a, str36);
                        i11 |= 16;
                        str42 = str44;
                        str39 = str39;
                        break;
                    case 5:
                        str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, C41897w2.f92051a, str38);
                        i11 |= 32;
                        str42 = str44;
                        str39 = str39;
                        break;
                    case 6:
                        str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 6, C41897w2.f92051a, str35);
                        i11 |= 64;
                        str42 = str44;
                        str39 = str39;
                        break;
                    case 7:
                        str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 7, C41897w2.f92051a, str34);
                        i11 |= 128;
                        str42 = str44;
                        str39 = str39;
                        break;
                    case 8:
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 8, C41897w2.f92051a, str33);
                        i11 |= 256;
                        str42 = str44;
                        str39 = str39;
                        break;
                    case 9:
                        str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 9, C41897w2.f92051a, str37);
                        i11 |= 512;
                        str42 = str44;
                        str39 = str39;
                        break;
                    case 10:
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 10, C41897w2.f92051a, str32);
                        i11 |= 1024;
                        str42 = str44;
                        str39 = str39;
                        break;
                    case 11:
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 11, (InterfaceC44949c) lazyArr[11].getValue(), list3);
                        i11 |= 2048;
                        str42 = str44;
                        str39 = str39;
                        break;
                    case 12:
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 12, C41897w2.f92051a, str31);
                        i11 |= 4096;
                        str42 = str44;
                        str39 = str39;
                        break;
                    case 13:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 13, C41897w2.f92051a, str16);
                        i11 |= 8192;
                        str42 = str44;
                        str39 = str39;
                        break;
                    case 14:
                        str43 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 14, C41897w2.f92051a, str43);
                        i11 |= 16384;
                        str42 = str44;
                        str39 = str39;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str41;
            str2 = str40;
            str3 = str16;
            str4 = str43;
            list = list3;
            str5 = str32;
            str6 = str33;
            str7 = str34;
            str8 = str35;
            str9 = str36;
            str10 = str37;
            str11 = str38;
            str12 = str42;
            str13 = str39;
            str14 = str31;
        }
        int i12 = i11;
        String str45 = str;
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29489L0(i12, str2, str45, str12, str13, str9, str11, str8, str7, str6, str10, str5, list, str14, str3, str4);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29489L0 c29489l0 = (C29489L0) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29489L0.f59500p;
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c29489l0.f59501a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, c29489l0.f59501a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c29489l0.f59502b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, c29489l0.f59502b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c29489l0.f59503c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, c29489l0.f59503c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c29489l0.f59504d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, c29489l0.f59504d);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 4) || c29489l0.f59505e != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 4, C41897w2.f92051a, c29489l0.f59505e);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 5) || c29489l0.f59506f != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 5, C41897w2.f92051a, c29489l0.f59506f);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 6) || c29489l0.f59507g != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 6, C41897w2.f92051a, c29489l0.f59507g);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 7) || c29489l0.f59508h != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 7, C41897w2.f92051a, c29489l0.f59508h);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 8) || c29489l0.f59509i != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 8, C41897w2.f92051a, c29489l0.f59509i);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 9) || c29489l0.f59510j != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 9, C41897w2.f92051a, c29489l0.f59510j);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 10) || c29489l0.f59511k != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 10, C41897w2.f92051a, c29489l0.f59511k);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 11) || c29489l0.f59512l != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 11, (InterfaceC44963p) lazyArr[11].getValue(), c29489l0.f59512l);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 12) || c29489l0.f59513m != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 12, C41897w2.f92051a, c29489l0.f59513m);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 13) || c29489l0.f59514n != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 13, C41897w2.f92051a, c29489l0.f59514n);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 14) || c29489l0.f59515o != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 14, C41897w2.f92051a, c29489l0.f59515o);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
