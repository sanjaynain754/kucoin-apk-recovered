package com.sumsub.sns.internal.features.data.model.common;

import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.tencent.qcloud.tuicore.TUIConstants;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29704v implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29704v f59768a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29704v c29704v = new C29704v();
        f59768a = c29704v;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.ApplicantDataField.Field", c29704v, 9);
        c41826h2.m91581o("name", false);
        c41826h2.m91581o("required", false);
        c41826h2.m91581o("type", true);
        c41826h2.m91581o("mask", true);
        c41826h2.m91581o("masks", true);
        c41826h2.m91581o(TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, true);
        c41826h2.m91581o(ReactTextInputShadowNode.PROP_PLACEHOLDER, true);
        c41826h2.m91581o("immutableIfPresent", true);
        c41826h2.m91581o("path", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        Lazy[] lazyArr = C29719y.f59780k;
        InterfaceC44951d interfaceC44951dM99969u = C45236a.m99969u(C29047R0.f58985a);
        C41828i c41828i = C41828i.f91957a;
        InterfaceC44951d interfaceC44951dM99969u2 = C45236a.m99969u((InterfaceC44951d) lazyArr[2].getValue());
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new InterfaceC44951d[]{interfaceC44951dM99969u, c41828i, interfaceC44951dM99969u2, C45236a.m99969u(c41897w2), C45236a.m99969u((InterfaceC44951d) lazyArr[4].getValue()), C45236a.m99969u(C29700u0.f59764a), C45236a.m99969u(c41897w2), C45236a.m99969u(c41828i), C45236a.m99969u(c41897w2)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        String str;
        String str2;
        Boolean bool;
        AbstractC29028M0 abstractC29028M0;
        List list;
        String str3;
        boolean z11;
        AbstractC29103d2 abstractC29103d2;
        FieldType fieldType;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29719y.f59780k;
        int i12 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            AbstractC29103d2 abstractC29103d3 = (AbstractC29103d2) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C29047R0.f58985a, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(interfaceC45533f, 1);
            FieldType fieldType2 = (FieldType) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, (InterfaceC44949c) lazyArr[2].getValue(), null);
            C41897w2 c41897w2 = C41897w2.f92051a;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, c41897w2, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, (InterfaceC44949c) lazyArr[4].getValue(), null);
            AbstractC29028M0 abstractC29028M1 = (AbstractC29028M0) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, C29700u0.f59764a, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 6, c41897w2, null);
            list = list2;
            abstractC29103d2 = abstractC29103d3;
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 7, C41828i.f91957a, null);
            str2 = str5;
            abstractC29028M0 = abstractC29028M1;
            str3 = str4;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 8, c41897w2, null);
            i11 = 511;
            fieldType = fieldType2;
            z11 = zDecodeBooleanElement;
        } else {
            int i13 = 4;
            int i14 = 2;
            boolean z12 = true;
            int i15 = 0;
            String str6 = null;
            String str7 = null;
            Boolean bool2 = null;
            AbstractC29028M0 abstractC29028M2 = null;
            List list3 = null;
            AbstractC29103d2 abstractC29103d4 = null;
            FieldType fieldType3 = null;
            boolean zDecodeBooleanElement2 = false;
            String str8 = null;
            while (z12) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                switch (iDecodeElementIndex) {
                    case -1:
                        z12 = false;
                        i14 = 2;
                        i13 = 4;
                        break;
                    case 0:
                        abstractC29103d4 = (AbstractC29103d2) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C29047R0.f58985a, abstractC29103d4);
                        i15 |= 1;
                        i12 = 7;
                        i14 = 2;
                        i13 = 4;
                        break;
                    case 1:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(interfaceC45533f, 1);
                        i15 |= 2;
                        i12 = 7;
                        i13 = 4;
                        break;
                    case 2:
                        fieldType3 = (FieldType) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, i14, (InterfaceC44949c) lazyArr[i14].getValue(), fieldType3);
                        i15 |= 4;
                        i12 = 7;
                        i13 = 4;
                        break;
                    case 3:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, str8);
                        i15 |= 8;
                        i12 = 7;
                        i13 = 4;
                        break;
                    case 4:
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, i13, (InterfaceC44949c) lazyArr[i13].getValue(), list3);
                        i15 |= 16;
                        i12 = 7;
                        break;
                    case 5:
                        abstractC29028M2 = (AbstractC29028M0) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, C29700u0.f59764a, abstractC29028M2);
                        i15 |= 32;
                        i12 = 7;
                        break;
                    case 6:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 6, C41897w2.f92051a, str7);
                        i15 |= 64;
                        i12 = 7;
                        break;
                    case 7:
                        bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, i12, C41828i.f91957a, bool2);
                        i15 |= 128;
                        break;
                    case 8:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 8, C41897w2.f92051a, str6);
                        i15 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i11 = i15;
            str = str6;
            str2 = str7;
            bool = bool2;
            abstractC29028M0 = abstractC29028M2;
            list = list3;
            str3 = str8;
            z11 = zDecodeBooleanElement2;
            abstractC29103d2 = abstractC29103d4;
            fieldType = fieldType3;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29719y(i11, abstractC29103d2, z11, fieldType, str3, list, abstractC29028M0, str2, bool, str);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29719y c29719y = (C29719y) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29719y.f59780k;
        interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C29047R0.f58985a, c29719y.f59781b);
        interfaceC45829bBeginStructure.encodeBooleanElement(interfaceC45533f, 1, c29719y.f59782c);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c29719y.f59783d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, (InterfaceC44963p) lazyArr[2].getValue(), c29719y.f59783d);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c29719y.f59784e != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, c29719y.f59784e);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 4) || c29719y.f59785f != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 4, (InterfaceC44963p) lazyArr[4].getValue(), c29719y.f59785f);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 5) || c29719y.f59786g != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 5, C29700u0.f59764a, c29719y.f59786g);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 6) || c29719y.f59787h != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 6, C41897w2.f92051a, c29719y.f59787h);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 7) || c29719y.f59788i != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 7, C41828i.f91957a, c29719y.f59788i);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 8) || c29719y.f59789j != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 8, C41897w2.f92051a, c29719y.f59789j);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
