package com.sumsub.sns.internal.features.data.model.common.remote;

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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.c0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29333c0 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29333c0 f59350a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29333c0 c29333c0 = new C29333c0();
        f59350a = c29333c0;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.MRTDData", c29333c0, 7);
        c41826h2.m91581o("imageId", false);
        c41826h2.m91581o("country", false);
        c41826h2.m91581o("idDocType", false);
        c41826h2.m91581o("data", false);
        c41826h2.m91581o("kinegramSessionId", false);
        c41826h2.m91581o("kinegramData", false);
        c41826h2.m91581o("processingErrors", false);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        Lazy[] lazyArr = C29349e0.f59362h;
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new InterfaceC44951d[]{C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u((InterfaceC44951d) lazyArr[3].getValue()), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u((InterfaceC44951d) lazyArr[6].getValue())};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        List list;
        String str;
        String str2;
        String str3;
        String str4;
        List list2;
        String str5;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29349e0.f59362h;
        int i12 = 5;
        String str6 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            C41897w2 c41897w2 = C41897w2.f92051a;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, c41897w2, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, c41897w2, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, c41897w2, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, (InterfaceC44949c) lazyArr[3].getValue(), null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, c41897w2, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, c41897w2, null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 6, (InterfaceC44949c) lazyArr[6].getValue(), null);
            str = str11;
            i11 = 127;
            str5 = str10;
            str4 = str9;
            list2 = list3;
            str3 = str8;
            str2 = str7;
        } else {
            boolean z11 = true;
            int i13 = 0;
            List list4 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            List list5 = null;
            String str15 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                switch (iDecodeElementIndex) {
                    case -1:
                        z11 = false;
                        i12 = 5;
                        break;
                    case 0:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, str6);
                        i13 |= 1;
                        i12 = 5;
                        break;
                    case 1:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, str13);
                        i13 |= 2;
                        i12 = 5;
                        break;
                    case 2:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, str14);
                        i13 |= 4;
                        i12 = 5;
                        break;
                    case 3:
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, (InterfaceC44949c) lazyArr[3].getValue(), list5);
                        i13 |= 8;
                        break;
                    case 4:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, C41897w2.f92051a, str15);
                        i13 |= 16;
                        break;
                    case 5:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, i12, C41897w2.f92051a, str12);
                        i13 |= 32;
                        break;
                    case 6:
                        list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 6, (InterfaceC44949c) lazyArr[6].getValue(), list4);
                        i13 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i11 = i13;
            list = list4;
            str = str12;
            str2 = str6;
            str3 = str13;
            str4 = str14;
            list2 = list5;
            str5 = str15;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29349e0(i11, str2, str3, str4, list2, str5, str, list);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29349e0 c29349e0 = (C29349e0) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29349e0.f59362h;
        C41897w2 c41897w2 = C41897w2.f92051a;
        interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, c41897w2, c29349e0.f59363a);
        interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, c41897w2, c29349e0.f59364b);
        interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, c41897w2, c29349e0.f59365c);
        interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, (InterfaceC44963p) lazyArr[3].getValue(), c29349e0.f59366d);
        interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 4, c41897w2, c29349e0.f59367e);
        interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 5, c41897w2, c29349e0.f59368f);
        interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 6, (InterfaceC44963p) lazyArr[6].getValue(), c29349e0.f59369g);
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
