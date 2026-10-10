package com.sumsub.sns.internal.features.data.model.sumsubid;

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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.sumsubid.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29878s implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29878s f59960a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29878s c29878s = new C29878s();
        f59960a = c29878s;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.sumsubid.SNSSumsubIdDocsResponse.SNSSumsubIdDocByStep", c29878s, 5);
        c41826h2.m91581o("docId", true);
        c41826h2.m91581o("imageIds", true);
        c41826h2.m91581o("info", true);
        c41826h2.m91581o("idDoc", true);
        c41826h2.m91581o("detectedLanguages", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        Lazy[] lazyArr = C29880u.f59961f;
        return new InterfaceC44951d[]{C45236a.m99969u(C41897w2.f92051a), C45236a.m99969u((InterfaceC44951d) lazyArr[1].getValue()), C45236a.m99969u((InterfaceC44951d) lazyArr[2].getValue()), C45236a.m99969u(C29881v.f59967a), C45236a.m99969u((InterfaceC44951d) lazyArr[4].getValue())};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        String str;
        List list;
        Map map;
        C29883x c29883x;
        List list2;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29880u.f59961f;
        String str2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, (InterfaceC44949c) lazyArr[1].getValue(), null);
            Map map2 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, (InterfaceC44949c) lazyArr[2].getValue(), null);
            C29883x c29883x2 = (C29883x) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C29881v.f59967a, null);
            list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, (InterfaceC44949c) lazyArr[4].getValue(), null);
            str = str3;
            c29883x = c29883x2;
            i11 = 31;
            map = map2;
            list = list3;
        } else {
            boolean z11 = true;
            int i12 = 0;
            List list4 = null;
            Map map3 = null;
            C29883x c29883x3 = null;
            List list5 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, str2);
                    i12 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, (InterfaceC44949c) lazyArr[1].getValue(), list4);
                    i12 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    map3 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, (InterfaceC44949c) lazyArr[2].getValue(), map3);
                    i12 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    c29883x3 = (C29883x) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C29881v.f59967a, c29883x3);
                    i12 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, (InterfaceC44949c) lazyArr[4].getValue(), list5);
                    i12 |= 16;
                }
            }
            i11 = i12;
            str = str2;
            list = list4;
            map = map3;
            c29883x = c29883x3;
            list2 = list5;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29880u(i11, str, list, map, c29883x, list2);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29880u c29880u = (C29880u) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29880u.f59961f;
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c29880u.f59962a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, c29880u.f59962a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c29880u.f59963b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, (InterfaceC44963p) lazyArr[1].getValue(), c29880u.f59963b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c29880u.f59964c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, (InterfaceC44963p) lazyArr[2].getValue(), c29880u.f59964c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c29880u.f59965d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, C29881v.f59967a, c29880u.f59965d);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 4) || c29880u.f59966e != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 4, (InterfaceC44963p) lazyArr[4].getValue(), c29880u.f59966e);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
