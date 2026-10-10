package com.sumsub.sentry;

import com.tencent.bugly.proguard.C33812n7;
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

/* JADX INFO: renamed from: com.sumsub.sentry.o0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C27977o0 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C27977o0 f57108a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C27977o0 c27977o0 = new C27977o0();
        f57108a = c27977o0;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sentry.SentryException", c27977o0, 6);
        c41826h2.m91581o("type", true);
        c41826h2.m91581o("value", true);
        c41826h2.m91581o("module", true);
        c41826h2.m91581o("thread_id", true);
        c41826h2.m91581o(C33812n7.f71061t, true);
        c41826h2.m91581o("mechanism", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new InterfaceC44951d[]{C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(C41820g1.f91932a), C45236a.m99969u(C27881L0.f56949a), C45236a.m99969u(C27872H.f56921a)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        String str;
        String str2;
        String str3;
        Long l11;
        C27885N0 c27885n0;
        C27876J c27876j;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        int i12 = 5;
        String str4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            C41897w2 c41897w2 = C41897w2.f92051a;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, c41897w2, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, c41897w2, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, c41897w2, null);
            Long l12 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C41820g1.f91932a, null);
            C27885N0 c27885n1 = (C27885N0) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, C27881L0.f56949a, null);
            str3 = str7;
            c27876j = (C27876J) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, C27872H.f56921a, null);
            l11 = l12;
            c27885n0 = c27885n1;
            i11 = 63;
            str2 = str6;
            str = str5;
        } else {
            boolean z11 = true;
            int i13 = 0;
            String str8 = null;
            String str9 = null;
            Long l13 = null;
            C27885N0 c27885n2 = null;
            C27876J c27876j2 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                switch (iDecodeElementIndex) {
                    case -1:
                        z11 = false;
                        i12 = 5;
                        break;
                    case 0:
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, str4);
                        i13 |= 1;
                        i12 = 5;
                        break;
                    case 1:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, str8);
                        i13 |= 2;
                        break;
                    case 2:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, str9);
                        i13 |= 4;
                        break;
                    case 3:
                        l13 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C41820g1.f91932a, l13);
                        i13 |= 8;
                        break;
                    case 4:
                        c27885n2 = (C27885N0) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, C27881L0.f56949a, c27885n2);
                        i13 |= 16;
                        break;
                    case 5:
                        c27876j2 = (C27876J) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, i12, C27872H.f56921a, c27876j2);
                        i13 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i11 = i13;
            str = str4;
            str2 = str8;
            str3 = str9;
            l11 = l13;
            c27885n0 = c27885n2;
            c27876j = c27876j2;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C27985q0(i11, str, str2, str3, l11, c27885n0, c27876j);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C27985q0 c27985q0 = (C27985q0) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c27985q0.f57118a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, c27985q0.f57118a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c27985q0.f57119b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, c27985q0.f57119b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c27985q0.f57120c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, c27985q0.f57120c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c27985q0.f57121d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, C41820g1.f91932a, c27985q0.f57121d);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 4) || c27985q0.f57122e != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 4, C27881L0.f56949a, c27985q0.f57122e);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 5) || c27985q0.f57123f != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 5, C27872H.f56921a, c27985q0.f57123f);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
