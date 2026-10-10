package com.sumsub.sns.internal.features.data.model.common.remote.response;

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
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44949c;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44963p;
import ug0.C45236a;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.C */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29461C implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29461C f59460a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29461C c29461c = new C29461C();
        f59460a = c29461c;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.response.Item", c29461c, 10);
        c41826h2.m91581o("id", true);
        c41826h2.m91581o("title", true);
        c41826h2.m91581o("desc", true);
        c41826h2.m91581o("type", true);
        c41826h2.m91581o("required", true);
        c41826h2.m91581o(TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, true);
        c41826h2.m91581o(ReactTextInputShadowNode.PROP_PLACEHOLDER, true);
        c41826h2.m91581o("condition", true);
        c41826h2.m91581o("options", true);
        c41826h2.m91581o("arbitraryDocType", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        Lazy[] lazyArr = C29470F.f59465k;
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new InterfaceC44951d[]{C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(C41828i.f91957a), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u((InterfaceC44951d) lazyArr[8].getValue()), C45236a.m99969u(c41897w2)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        String str;
        List list;
        String str2;
        String str3;
        String str4;
        Boolean bool;
        String str5;
        String str6;
        String str7;
        String str8;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29470F.f59465k;
        int i12 = 9;
        int i13 = 8;
        String str9 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            C41897w2 c41897w2 = C41897w2.f92051a;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, c41897w2, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, c41897w2, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, c41897w2, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, c41897w2, null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, C41828i.f91957a, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, c41897w2, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 6, c41897w2, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 7, c41897w2, null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 8, (InterfaceC44949c) lazyArr[8].getValue(), null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 9, c41897w2, null);
            i11 = 1023;
            str2 = str16;
            str4 = str15;
            str3 = str14;
            str5 = str13;
            bool = bool2;
            str6 = str12;
            str8 = str11;
            str7 = str10;
        } else {
            boolean z11 = true;
            int i14 = 0;
            String str17 = null;
            List list2 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            Boolean bool3 = null;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            while (z11) {
                int i15 = i13;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                switch (iDecodeElementIndex) {
                    case -1:
                        z11 = false;
                        break;
                    case 0:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, str9);
                        i14 |= 1;
                        break;
                    case 1:
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, str23);
                        i14 |= 2;
                        break;
                    case 2:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, str22);
                        i14 |= 4;
                        break;
                    case 3:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, str21);
                        i14 |= 8;
                        break;
                    case 4:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, C41828i.f91957a, bool3);
                        i14 |= 16;
                        break;
                    case 5:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, C41897w2.f92051a, str19);
                        i14 |= 32;
                        break;
                    case 6:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 6, C41897w2.f92051a, str20);
                        i14 |= 64;
                        break;
                    case 7:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 7, C41897w2.f92051a, str18);
                        i14 |= 128;
                        break;
                    case 8:
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, i15, (InterfaceC44949c) lazyArr[i15].getValue(), list2);
                        i14 |= 256;
                        i13 = i15;
                        i12 = 9;
                        continue;
                    case 9:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, i12, C41897w2.f92051a, str17);
                        i14 |= 512;
                        i13 = i15;
                        continue;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
                i12 = 9;
                i13 = 8;
            }
            i11 = i14;
            str = str17;
            list = list2;
            str2 = str18;
            str3 = str19;
            str4 = str20;
            bool = bool3;
            str5 = str21;
            str6 = str22;
            str7 = str9;
            str8 = str23;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29470F(i11, str7, str8, str6, str5, bool, str3, str4, str2, list, str);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29470F c29470f = (C29470F) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29470F.f59465k;
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c29470f.f59466a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, c29470f.f59466a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c29470f.f59467b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, c29470f.f59467b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c29470f.f59468c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, c29470f.f59468c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c29470f.f59469d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, c29470f.f59469d);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 4) || c29470f.f59470e != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 4, C41828i.f91957a, c29470f.f59470e);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 5) || c29470f.f59471f != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 5, C41897w2.f92051a, c29470f.f59471f);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 6) || c29470f.f59472g != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 6, C41897w2.f92051a, c29470f.f59472g);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 7) || c29470f.f59473h != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 7, C41897w2.f92051a, c29470f.f59473h);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 8) || !Intrinsics.areEqual(c29470f.f59474i, CollectionsKt.emptyList())) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 8, (InterfaceC44963p) lazyArr[8].getValue(), c29470f.f59474i);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 9) || c29470f.f59475j != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 9, C41897w2.f92051a, c29470f.f59475j);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
