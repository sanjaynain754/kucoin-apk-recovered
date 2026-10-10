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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29524b implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29524b f59542a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29524b c29524b = new C29524b();
        f59542a = c29524b;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.response.ActionWithWithIdDocsStatusResponse.Action", c29524b, 10);
        c41826h2.m91581o("id", true);
        c41826h2.m91581o("requiredIdDocs", false);
        c41826h2.m91581o("externalActionId", true);
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
        Lazy[] lazyArr = C29534d.f59551k;
        C41897w2 c41897w2 = C41897w2.f92051a;
        InterfaceC44951d interfaceC44951dM99969u = C45236a.m99969u(c41897w2);
        C29483J0 c29483j0 = C29483J0.f59492a;
        return new InterfaceC44951d[]{c41897w2, C29492M0.f59516a, interfaceC44951dM99969u, C45236a.m99969u(c29483j0), C45236a.m99969u(c29483j0), C45236a.m99969u((InterfaceC44951d) lazyArr[5].getValue()), C45236a.m99969u((InterfaceC44951d) lazyArr[6].getValue()), C45236a.m99969u(C29316a.f59330a), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        String str;
        List list;
        List list2;
        C29489L0 c29489l0;
        String str2;
        C29332c c29332c;
        C29489L0 c29489l1;
        String str3;
        String str4;
        C29603s1 c29603s1;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29534d.f59551k;
        int i12 = 9;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 0);
            C29603s1 c29603s2 = (C29603s1) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 1, C29492M0.f59516a, null);
            C41897w2 c41897w2 = C41897w2.f92051a;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, c41897w2, null);
            C29483J0 c29483j0 = C29483J0.f59492a;
            C29489L0 c29489l2 = (C29489L0) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, c29483j0, null);
            C29489L0 c29489l3 = (C29489L0) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, c29483j0, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, (InterfaceC44949c) lazyArr[5].getValue(), null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 6, (InterfaceC44949c) lazyArr[6].getValue(), null);
            C29332c c29332c2 = (C29332c) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 7, C29316a.f59330a, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 8, c41897w2, null);
            list2 = list4;
            str4 = strDecodeStringElement2;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 9, c41897w2, null);
            c29332c = c29332c2;
            c29489l1 = c29489l2;
            str2 = str6;
            c29489l0 = c29489l3;
            str3 = str5;
            i11 = 1023;
            list = list3;
            c29603s1 = c29603s2;
        } else {
            int i13 = 6;
            int i14 = 5;
            boolean z11 = true;
            int i15 = 0;
            String str7 = null;
            List list5 = null;
            List list6 = null;
            C29489L0 c29489l4 = null;
            String str8 = null;
            C29332c c29332c3 = null;
            C29489L0 c29489l5 = null;
            String str9 = null;
            C29603s1 c29603s3 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                switch (iDecodeElementIndex) {
                    case -1:
                        z11 = false;
                        i14 = 5;
                        i13 = 6;
                        break;
                    case 0:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 0);
                        i15 |= 1;
                        i12 = 9;
                        i14 = 5;
                        i13 = 6;
                        break;
                    case 1:
                        c29603s3 = (C29603s1) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 1, C29492M0.f59516a, c29603s3);
                        i15 |= 2;
                        i12 = 9;
                        i14 = 5;
                        i13 = 6;
                        break;
                    case 2:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, str9);
                        i15 |= 4;
                        i12 = 9;
                        i14 = 5;
                        i13 = 6;
                        break;
                    case 3:
                        c29489l5 = (C29489L0) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C29483J0.f59492a, c29489l5);
                        i15 |= 8;
                        i12 = 9;
                        i14 = 5;
                        i13 = 6;
                        break;
                    case 4:
                        c29489l4 = (C29489L0) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, C29483J0.f59492a, c29489l4);
                        i15 |= 16;
                        i12 = 9;
                        i14 = 5;
                        i13 = 6;
                        break;
                    case 5:
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, i14, (InterfaceC44949c) lazyArr[i14].getValue(), list5);
                        i15 |= 32;
                        i12 = 9;
                        i13 = 6;
                        break;
                    case 6:
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, i13, (InterfaceC44949c) lazyArr[i13].getValue(), list6);
                        i15 |= 64;
                        i12 = 9;
                        break;
                    case 7:
                        c29332c3 = (C29332c) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 7, C29316a.f59330a, c29332c3);
                        i15 |= 128;
                        i12 = 9;
                        break;
                    case 8:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 8, C41897w2.f92051a, str8);
                        i15 |= 256;
                        i12 = 9;
                        break;
                    case 9:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, i12, C41897w2.f92051a, str7);
                        i15 |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i11 = i15;
            str = str7;
            list = list5;
            list2 = list6;
            c29489l0 = c29489l4;
            str2 = str8;
            c29332c = c29332c3;
            c29489l1 = c29489l5;
            str3 = str9;
            str4 = strDecodeStringElement;
            c29603s1 = c29603s3;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29534d(i11, str4, c29603s1, str3, c29489l1, c29489l0, list, list2, c29332c, str2, str);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29534d c29534d = (C29534d) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29534d.f59551k;
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || !Intrinsics.areEqual(c29534d.f59552a, "")) {
            interfaceC45829bBeginStructure.encodeStringElement(interfaceC45533f, 0, c29534d.f59552a);
        }
        interfaceC45829bBeginStructure.encodeSerializableElement(interfaceC45533f, 1, C29492M0.f59516a, c29534d.f59553b);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c29534d.f59554c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, c29534d.f59554c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c29534d.f59555d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, C29483J0.f59492a, c29534d.f59555d);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 4) || c29534d.f59556e != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 4, C29483J0.f59492a, c29534d.f59556e);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 5) || c29534d.f59557f != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 5, (InterfaceC44963p) lazyArr[5].getValue(), c29534d.f59557f);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 6) || c29534d.f59558g != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 6, (InterfaceC44963p) lazyArr[6].getValue(), c29534d.f59558g);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 7) || c29534d.f59559h != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 7, C29316a.f59330a, c29534d.f59559h);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 8) || c29534d.f59560i != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 8, C41897w2.f92051a, c29534d.f59560i);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 9) || c29534d.f59561j != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 9, C41897w2.f92051a, c29534d.f59561j);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
