package com.sumsub.sns.internal.features.data.model.esign;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.C41891v0;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.esign.S */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29746S implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29746S f59816a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29746S c29746s = new C29746S();
        f59816a = c29746s;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.esign.ESignSigningDocument", c29746s, 5);
        c41826h2.m91581o("id", true);
        c41826h2.m91581o("imageId", true);
        c41826h2.m91581o("name", true);
        c41826h2.m91581o("url", true);
        c41826h2.m91581o("agreements", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        Lazy[] lazyArr = C29748U.f59817f;
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new InterfaceC44951d[]{C45236a.m99969u(c41897w2), C45236a.m99969u(C41891v0.f92041a), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u((InterfaceC44951d) lazyArr[4].getValue())};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        String str;
        Integer num;
        String str2;
        String str3;
        List list;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29748U.f59817f;
        String str4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            C41897w2 c41897w2 = C41897w2.f92051a;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, c41897w2, null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41891v0.f92041a, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, c41897w2, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, c41897w2, null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, (InterfaceC44949c) lazyArr[4].getValue(), null);
            str3 = str7;
            i11 = 31;
            str2 = str6;
            num = num2;
            str = str5;
        } else {
            boolean z11 = true;
            int i12 = 0;
            Integer num3 = null;
            String str8 = null;
            String str9 = null;
            List list2 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, str4);
                    i12 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41891v0.f92041a, num3);
                    i12 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, str8);
                    i12 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, str9);
                    i12 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, (InterfaceC44949c) lazyArr[4].getValue(), list2);
                    i12 |= 16;
                }
            }
            i11 = i12;
            str = str4;
            num = num3;
            str2 = str8;
            str3 = str9;
            list = list2;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29748U(i11, str, num, str2, str3, list);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29748U c29748u = (C29748U) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29748U.f59817f;
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c29748u.f59818a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, c29748u.f59818a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c29748u.f59819b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C41891v0.f92041a, c29748u.f59819b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c29748u.f59820c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, c29748u.f59820c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c29748u.f59821d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, c29748u.f59821d);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 4) || c29748u.f59822e != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 4, (InterfaceC44963p) lazyArr[4].getValue(), c29748u.f59822e);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
