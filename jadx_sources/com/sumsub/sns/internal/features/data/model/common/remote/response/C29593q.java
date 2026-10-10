package com.sumsub.sns.internal.features.data.model.common.remote.response;

import androidx.autofill.HintConstants;
import com.sumsub.sns.internal.features.data.model.common.remote.C29316a;
import com.sumsub.sns.internal.features.data.model.common.remote.C29332c;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.C41897w2;
import kotlinx.serialization.internal.InterfaceC41849m0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44949c;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44963p;
import ug0.C45236a;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29593q implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29593q f59617a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29593q c29593q = new C29593q();
        f59617a = c29593q;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.response.ApplicantWithIdDocsStatusResponse.Applicant", c29593q, 11);
        c41826h2.m91581o("id", true);
        c41826h2.m91581o("requiredIdDocs", false);
        c41826h2.m91581o("externalUserId", true);
        c41826h2.m91581o("lang", true);
        c41826h2.m91581o("info", true);
        c41826h2.m91581o("fixedInfo", true);
        c41826h2.m91581o("questionnaires", true);
        c41826h2.m91581o("metadata", true);
        c41826h2.m91581o("agreement", true);
        c41826h2.m91581o("email", true);
        c41826h2.m91581o(HintConstants.AUTOFILL_HINT_PHONE, true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        Lazy[] lazyArr = C29601s.f59637l;
        C41897w2 c41897w2 = C41897w2.f92051a;
        InterfaceC44951d interfaceC44951dM99969u = C45236a.m99969u(c41897w2);
        InterfaceC44951d interfaceC44951dM99969u2 = C45236a.m99969u(c41897w2);
        C29483J0 c29483j0 = C29483J0.f59492a;
        return new InterfaceC44951d[]{c41897w2, C29492M0.f59516a, interfaceC44951dM99969u, interfaceC44951dM99969u2, C45236a.m99969u(c29483j0), C45236a.m99969u(c29483j0), C45236a.m99969u((InterfaceC44951d) lazyArr[6].getValue()), C45236a.m99969u((InterfaceC44951d) lazyArr[7].getValue()), C45236a.m99969u(C29316a.f59330a), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        C29603s1 c29603s1;
        List list;
        C29489L0 c29489l0;
        String str;
        List list2;
        C29489L0 c29489l1;
        String str2;
        C29332c c29332c;
        String str3;
        String str4;
        String str5;
        Lazy[] lazyArr;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr2 = C29601s.f59637l;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 0);
            C29603s1 c29603s2 = (C29603s1) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 1, C29492M0.f59516a, null);
            C41897w2 c41897w2 = C41897w2.f92051a;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, c41897w2, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, c41897w2, null);
            C29483J0 c29483j0 = C29483J0.f59492a;
            C29489L0 c29489l2 = (C29489L0) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, c29483j0, null);
            C29489L0 c29489l3 = (C29489L0) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, c29483j0, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 6, (InterfaceC44949c) lazyArr2[6].getValue(), null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 7, (InterfaceC44949c) lazyArr2[7].getValue(), null);
            C29332c c29332c2 = (C29332c) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 8, C29316a.f59330a, null);
            list = list4;
            str5 = strDecodeStringElement2;
            c29489l0 = c29489l3;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 9, c41897w2, null);
            list2 = list3;
            str3 = str7;
            c29332c = c29332c2;
            c29489l1 = c29489l2;
            str4 = str6;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 10, c41897w2, null);
            i11 = 2047;
            c29603s1 = c29603s2;
        } else {
            int i12 = 7;
            int i13 = 6;
            boolean z11 = true;
            int i14 = 0;
            C29603s1 c29603s3 = null;
            List list5 = null;
            C29489L0 c29489l4 = null;
            String str8 = null;
            List list6 = null;
            C29489L0 c29489l5 = null;
            String str9 = null;
            C29332c c29332c3 = null;
            String str10 = null;
            String str11 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                switch (iDecodeElementIndex) {
                    case -1:
                        z11 = false;
                        i13 = 6;
                        i12 = 7;
                        break;
                    case 0:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 0);
                        i14 |= 1;
                        lazyArr2 = lazyArr2;
                        i13 = 6;
                        i12 = 7;
                        break;
                    case 1:
                        c29603s3 = (C29603s1) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 1, C29492M0.f59516a, c29603s3);
                        i14 |= 2;
                        lazyArr2 = lazyArr2;
                        i13 = 6;
                        i12 = 7;
                        break;
                    case 2:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, str11);
                        i14 |= 4;
                        lazyArr2 = lazyArr2;
                        i13 = 6;
                        i12 = 7;
                        break;
                    case 3:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, str10);
                        i14 |= 8;
                        lazyArr2 = lazyArr2;
                        i13 = 6;
                        i12 = 7;
                        break;
                    case 4:
                        c29489l5 = (C29489L0) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, C29483J0.f59492a, c29489l5);
                        i14 |= 16;
                        lazyArr2 = lazyArr2;
                        i13 = 6;
                        i12 = 7;
                        break;
                    case 5:
                        c29489l4 = (C29489L0) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, C29483J0.f59492a, c29489l4);
                        i14 |= 32;
                        lazyArr2 = lazyArr2;
                        i13 = 6;
                        i12 = 7;
                        break;
                    case 6:
                        Lazy[] lazyArr3 = lazyArr2;
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, i13, (InterfaceC44949c) lazyArr3[i13].getValue(), list6);
                        i14 |= 64;
                        lazyArr2 = lazyArr3;
                        i12 = 7;
                        break;
                    case 7:
                        lazyArr = lazyArr2;
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, i12, (InterfaceC44949c) lazyArr[i12].getValue(), list5);
                        i14 |= 128;
                        lazyArr2 = lazyArr;
                        break;
                    case 8:
                        lazyArr = lazyArr2;
                        c29332c3 = (C29332c) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 8, C29316a.f59330a, c29332c3);
                        i14 |= 256;
                        lazyArr2 = lazyArr;
                        break;
                    case 9:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 9, C41897w2.f92051a, str9);
                        i14 |= 512;
                        lazyArr2 = lazyArr2;
                        break;
                    case 10:
                        lazyArr = lazyArr2;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 10, C41897w2.f92051a, str8);
                        i14 |= 1024;
                        lazyArr2 = lazyArr;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i11 = i14;
            c29603s1 = c29603s3;
            list = list5;
            c29489l0 = c29489l4;
            str = str8;
            list2 = list6;
            c29489l1 = c29489l5;
            str2 = str9;
            c29332c = c29332c3;
            str3 = str10;
            str4 = str11;
            str5 = strDecodeStringElement;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29601s(i11, str5, c29603s1, str4, str3, c29489l1, c29489l0, list2, list, c29332c, str2, str);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29601s c29601s = (C29601s) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29601s.f59637l;
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || !Intrinsics.areEqual(c29601s.f59638a, "")) {
            interfaceC45829bBeginStructure.encodeStringElement(interfaceC45533f, 0, c29601s.f59638a);
        }
        interfaceC45829bBeginStructure.encodeSerializableElement(interfaceC45533f, 1, C29492M0.f59516a, c29601s.f59639b);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c29601s.f59640c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, c29601s.f59640c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c29601s.f59641d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, c29601s.f59641d);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 4) || c29601s.f59642e != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 4, C29483J0.f59492a, c29601s.f59642e);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 5) || c29601s.f59643f != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 5, C29483J0.f59492a, c29601s.f59643f);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 6) || c29601s.f59644g != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 6, (InterfaceC44963p) lazyArr[6].getValue(), c29601s.f59644g);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 7) || c29601s.f59645h != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 7, (InterfaceC44963p) lazyArr[7].getValue(), c29601s.f59645h);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 8) || c29601s.f59646i != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 8, C29316a.f59330a, c29601s.f59646i);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 9) || c29601s.f59647j != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 9, C41897w2.f92051a, c29601s.f59647j);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 10) || c29601s.f59648k != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 10, C41897w2.f92051a, c29601s.f59648k);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
