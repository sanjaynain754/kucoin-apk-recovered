package com.sumsub.sns.internal.features.data.model.common.remote.response;

import java.util.List;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.y1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29627y1 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29627y1 f59685a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29627y1 c29627y1 = new C29627y1();
        f59685a = c29627y1;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.response.WithIdDocsStatusResponse.RequiredIdDocsStatus.RemoteRequiredDoc", c29627y1, 5);
        c41826h2.m91581o("reviewResult", true);
        c41826h2.m91581o("country", true);
        c41826h2.m91581o("idDocType", true);
        c41826h2.m91581o("imageIds", true);
        c41826h2.m91581o("imageReviewResults", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        Lazy[] lazyArr = C29457A1.f59449f;
        InterfaceC44951d interfaceC44951dM99969u = C45236a.m99969u(C29481I1.f59488a);
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new InterfaceC44951d[]{interfaceC44951dM99969u, C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u((InterfaceC44951d) lazyArr[3].getValue()), C45236a.m99969u((InterfaceC44951d) lazyArr[4].getValue())};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        C29487K1 c29487k1;
        String str;
        String str2;
        List list;
        Map map;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29457A1.f59449f;
        C29487K1 c29487k2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            C29487K1 c29487k3 = (C29487K1) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C29481I1.f59488a, null);
            C41897w2 c41897w2 = C41897w2.f92051a;
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, c41897w2, null);
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, c41897w2, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, (InterfaceC44949c) lazyArr[3].getValue(), null);
            map = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, (InterfaceC44949c) lazyArr[4].getValue(), null);
            c29487k1 = c29487k3;
            str2 = str4;
            list = list2;
            i11 = 31;
            str = str3;
        } else {
            boolean z11 = true;
            int i12 = 0;
            String str5 = null;
            String str6 = null;
            List list3 = null;
            Map map2 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    c29487k2 = (C29487K1) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C29481I1.f59488a, c29487k2);
                    i12 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, str5);
                    i12 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, str6);
                    i12 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, (InterfaceC44949c) lazyArr[3].getValue(), list3);
                    i12 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    map2 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, (InterfaceC44949c) lazyArr[4].getValue(), map2);
                    i12 |= 16;
                }
            }
            i11 = i12;
            c29487k1 = c29487k2;
            str = str5;
            str2 = str6;
            list = list3;
            map = map2;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29457A1(i11, c29487k1, str, str2, list, map);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29457A1 c29457a1 = (C29457A1) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29457A1.f59449f;
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c29457a1.f59450a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C29481I1.f59488a, c29457a1.f59450a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c29457a1.f59451b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, c29457a1.f59451b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c29457a1.f59452c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, c29457a1.f59452c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c29457a1.f59453d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, (InterfaceC44963p) lazyArr[3].getValue(), c29457a1.f59453d);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 4) || c29457a1.f59454e != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 4, (InterfaceC44963p) lazyArr[4].getValue(), c29457a1.f59454e);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
