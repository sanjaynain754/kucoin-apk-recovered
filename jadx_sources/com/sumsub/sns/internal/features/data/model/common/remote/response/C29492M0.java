package com.sumsub.sns.internal.features.data.model.common.remote.response;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.C41828i;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.M0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29492M0 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29492M0 f59516a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29492M0 c29492m0 = new C29492M0();
        f59516a = c29492m0;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.response.WithIdDocsStatusResponse.RequiredIdDocs", c29492m0, 6);
        c41826h2.m91581o("docSets", true);
        c41826h2.m91581o("videoIdent", true);
        c41826h2.m91581o("videoIdentUploadTypes", true);
        c41826h2.m91581o("stepsOutsideVideoId", true);
        c41826h2.m91581o("includedCountries", true);
        c41826h2.m91581o("excludedCountries", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        Lazy[] lazyArr = C29603s1.f59657g;
        return new InterfaceC44951d[]{C45236a.m99969u((InterfaceC44951d) lazyArr[0].getValue()), C45236a.m99969u(C41828i.f91957a), C45236a.m99969u((InterfaceC44951d) lazyArr[2].getValue()), C45236a.m99969u((InterfaceC44951d) lazyArr[3].getValue()), C45236a.m99969u((InterfaceC44951d) lazyArr[4].getValue()), C45236a.m99969u((InterfaceC44951d) lazyArr[5].getValue())};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        List list;
        Boolean bool;
        List list2;
        List list3;
        List list4;
        List list5;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29603s1.f59657g;
        int i12 = 5;
        int i13 = 0;
        List list6 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, (InterfaceC44949c) lazyArr[0].getValue(), null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41828i.f91957a, null);
            List list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, (InterfaceC44949c) lazyArr[2].getValue(), null);
            List list9 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, (InterfaceC44949c) lazyArr[3].getValue(), null);
            List list10 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, (InterfaceC44949c) lazyArr[4].getValue(), null);
            list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, (InterfaceC44949c) lazyArr[5].getValue(), null);
            list = list7;
            i11 = 63;
            list3 = list9;
            list4 = list10;
            list2 = list8;
            bool = bool2;
        } else {
            int i14 = 1;
            int i15 = 0;
            Boolean bool3 = null;
            List list11 = null;
            List list12 = null;
            List list13 = null;
            List list14 = null;
            while (i14 != 0) {
                int i16 = i13;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                switch (iDecodeElementIndex) {
                    case -1:
                        i13 = i16;
                        i14 = i13;
                        i12 = 5;
                        break;
                    case 0:
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, i16, (InterfaceC44949c) lazyArr[i16].getValue(), list6);
                        i15 |= 1;
                        i13 = i16;
                        i12 = 5;
                        break;
                    case 1:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41828i.f91957a, bool3);
                        i15 |= 2;
                        i13 = i16;
                        break;
                    case 2:
                        list11 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, (InterfaceC44949c) lazyArr[2].getValue(), list11);
                        i15 |= 4;
                        i13 = i16;
                        break;
                    case 3:
                        list12 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, (InterfaceC44949c) lazyArr[3].getValue(), list12);
                        i15 |= 8;
                        i13 = i16;
                        break;
                    case 4:
                        list13 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, (InterfaceC44949c) lazyArr[4].getValue(), list13);
                        i15 |= 16;
                        i13 = i16;
                        break;
                    case 5:
                        list14 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, i12, (InterfaceC44949c) lazyArr[i12].getValue(), list14);
                        i15 |= 32;
                        i13 = i16;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i11 = i15;
            list = list6;
            bool = bool3;
            list2 = list11;
            list3 = list12;
            list4 = list13;
            list5 = list14;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29603s1(i11, list, bool, list2, list3, list4, list5);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29603s1 c29603s1 = (C29603s1) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29603s1.f59657g;
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c29603s1.f59658a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, (InterfaceC44963p) lazyArr[0].getValue(), c29603s1.f59658a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || !Intrinsics.areEqual(c29603s1.f59659b, Boolean.FALSE)) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C41828i.f91957a, c29603s1.f59659b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c29603s1.f59660c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, (InterfaceC44963p) lazyArr[2].getValue(), c29603s1.f59660c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c29603s1.f59661d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, (InterfaceC44963p) lazyArr[3].getValue(), c29603s1.f59661d);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 4) || c29603s1.f59662e != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 4, (InterfaceC44963p) lazyArr[4].getValue(), c29603s1.f59662e);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 5) || c29603s1.f59663f != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 5, (InterfaceC44963p) lazyArr[5].getValue(), c29603s1.f59663f);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
