package com.sumsub.sns.internal.features.data.model.common.remote;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.C41897w2;
import kotlinx.serialization.internal.InterfaceC41849m0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import ug0.C45236a;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.j3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29392j3 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29392j3 f59405a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29392j3 c29392j3 = new C29392j3();
        f59405a = c29392j3;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.SNSMessage.ServerMessage.ScreenShotPayload", c29392j3, 5);
        c41826h2.m91581o("type", true);
        c41826h2.m91581o("idDocSubType", true);
        c41826h2.m91581o("country", true);
        c41826h2.m91581o("idDocSetType", true);
        c41826h2.m91581o("variant", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new InterfaceC44951d[]{C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        String str6 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            C41897w2 c41897w2 = C41897w2.f92051a;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, c41897w2, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, c41897w2, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, c41897w2, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, c41897w2, null);
            str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, c41897w2, null);
            str4 = str10;
            i11 = 31;
            str3 = str9;
            str2 = str8;
            str = str7;
        } else {
            boolean z11 = true;
            int i12 = 0;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, str6);
                    i12 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, str11);
                    i12 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, str12);
                    i12 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, str13);
                    i12 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, C41897w2.f92051a, str14);
                    i12 |= 16;
                }
            }
            i11 = i12;
            str = str6;
            str2 = str11;
            str3 = str12;
            str4 = str13;
            str5 = str14;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29424n3(i11, str, str2, str3, str4, str5);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29424n3 c29424n3 = (C29424n3) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || !Intrinsics.areEqual(c29424n3.f59421a, "")) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, c29424n3.f59421a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || !Intrinsics.areEqual(c29424n3.f59422b, "")) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, c29424n3.f59422b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || !Intrinsics.areEqual(c29424n3.f59423c, "")) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, c29424n3.f59423c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || !Intrinsics.areEqual(c29424n3.f59424d, "")) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, c29424n3.f59424d);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 4) || !Intrinsics.areEqual(c29424n3.f59425e, "")) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 4, C41897w2.f92051a, c29424n3.f59425e);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
