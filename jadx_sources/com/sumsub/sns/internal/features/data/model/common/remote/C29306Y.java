package com.sumsub.sns.internal.features.data.model.common.remote;

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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.Y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29306Y implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29306Y f59314a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29306Y c29306y = new C29306Y();
        f59314a = c29306y;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.LanguageInfo", c29306y, 3);
        c41826h2.m91581o("lang", true);
        c41826h2.m91581o("queuePlace", true);
        c41826h2.m91581o("waitTimeSec", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        InterfaceC44951d interfaceC44951dM99969u = C45236a.m99969u(C41897w2.f92051a);
        C41820g1 c41820g1 = C41820g1.f91932a;
        return new InterfaceC44951d[]{interfaceC44951dM99969u, C45236a.m99969u(c41820g1), C45236a.m99969u(c41820g1)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        String str;
        Long l11;
        Long l12;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        String str2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, null);
            C41820g1 c41820g1 = C41820g1.f91932a;
            l11 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, c41820g1, null);
            l12 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, c41820g1, null);
            i11 = 7;
        } else {
            boolean z11 = true;
            int i12 = 0;
            Long l13 = null;
            Long l14 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, str2);
                    i12 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    l13 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41820g1.f91932a, l13);
                    i12 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    l14 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41820g1.f91932a, l14);
                    i12 |= 4;
                }
            }
            i11 = i12;
            str = str2;
            l11 = l13;
            l12 = l14;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29325b0(i11, str, l11, l12);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        Long l11;
        Long l12;
        C29325b0 c29325b0 = (C29325b0) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c29325b0.f59334a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, c29325b0.f59334a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || (l12 = c29325b0.f59335b) == null || l12.longValue() != 0) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C41820g1.f91932a, c29325b0.f59335b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || (l11 = c29325b0.f59336c) == null || l11.longValue() != 0) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, C41820g1.f91932a, c29325b0.f59336c);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
