package com.sumsub.sentry;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41820g1;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.C41897w2;
import kotlinx.serialization.internal.InterfaceC41849m0;
import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44951d;
import ug0.C45236a;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sentry.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C27976o implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C27976o f57107a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C27976o c27976o = new C27976o();
        f57107a = c27976o;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sentry.DebugImage", c27976o, 9);
        c41826h2.m91581o("uuid", true);
        c41826h2.m91581o("type", true);
        c41826h2.m91581o("debug_id", true);
        c41826h2.m91581o("debug_file", true);
        c41826h2.m91581o("code_id", true);
        c41826h2.m91581o("code_file", true);
        c41826h2.m91581o("image_addr", true);
        c41826h2.m91581o("image_size", true);
        c41826h2.m91581o("arch", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new InterfaceC44951d[]{C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(C41820g1.f91932a), C45236a.m99969u(c41897w2)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        Long l11;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        int i12 = 7;
        String str9 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            C41897w2 c41897w2 = C41897w2.f92051a;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, c41897w2, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, c41897w2, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, c41897w2, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, c41897w2, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, c41897w2, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, c41897w2, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 6, c41897w2, null);
            Long l12 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 7, C41820g1.f91932a, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 8, c41897w2, null);
            l11 = l12;
            str2 = str16;
            str3 = str15;
            str8 = str13;
            i11 = 511;
            str4 = str14;
            str7 = str12;
            str6 = str11;
            str5 = str10;
        } else {
            boolean z11 = true;
            int i13 = 0;
            Long l13 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                switch (iDecodeElementIndex) {
                    case -1:
                        z11 = false;
                        i12 = 7;
                        break;
                    case 0:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, str9);
                        i13 |= 1;
                        i12 = 7;
                        break;
                    case 1:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, str21);
                        i13 |= 2;
                        i12 = 7;
                        break;
                    case 2:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, str22);
                        i13 |= 4;
                        i12 = 7;
                        break;
                    case 3:
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, str23);
                        i13 |= 8;
                        i12 = 7;
                        break;
                    case 4:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, C41897w2.f92051a, str20);
                        i13 |= 16;
                        i12 = 7;
                        break;
                    case 5:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, C41897w2.f92051a, str19);
                        i13 |= 32;
                        i12 = 7;
                        break;
                    case 6:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 6, C41897w2.f92051a, str18);
                        i13 |= 64;
                        break;
                    case 7:
                        l13 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, i12, C41820g1.f91932a, l13);
                        i13 |= 128;
                        break;
                    case 8:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 8, C41897w2.f92051a, str17);
                        i13 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i11 = i13;
            l11 = l13;
            str = str17;
            str2 = str18;
            str3 = str19;
            str4 = str20;
            str5 = str9;
            str6 = str21;
            str7 = str22;
            str8 = str23;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C27984q(i11, str5, str6, str7, str8, str4, str3, str2, l11, str);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C27984q c27984q = (C27984q) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c27984q.f57109a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, c27984q.f57109a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c27984q.f57110b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, c27984q.f57110b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c27984q.f57111c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, c27984q.f57111c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c27984q.f57112d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, c27984q.f57112d);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 4) || c27984q.f57113e != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 4, C41897w2.f92051a, c27984q.f57113e);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 5) || c27984q.f57114f != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 5, C41897w2.f92051a, c27984q.f57114f);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 6) || c27984q.f57115g != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 6, C41897w2.f92051a, c27984q.f57115g);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 7) || c27984q.f57116h != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 7, C41820g1.f91932a, c27984q.f57116h);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 8) || c27984q.f57117i != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 8, C41897w2.f92051a, c27984q.f57117i);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
