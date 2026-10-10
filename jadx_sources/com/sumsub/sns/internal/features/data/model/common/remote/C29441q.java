package com.sumsub.sns.internal.features.data.model.common.remote;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.C41828i;
import kotlinx.serialization.internal.C41897w2;
import kotlinx.serialization.internal.InterfaceC41849m0;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44951d;
import ug0.C45236a;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;
import xg0.C46181p;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29441q implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29441q f59436a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29441q c29441q = new C29441q();
        f59436a = c29441q;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.ApplicantDataFormFieldSurrogateSerializer.ApplicantDataFormFieldSurrogate", c29441q, 5);
        c41826h2.m91581o("displayName", true);
        c41826h2.m91581o("name", false);
        c41826h2.m91581o("required", true);
        c41826h2.m91581o("immutableIfPresent", true);
        c41826h2.m91581o("value", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        C41897w2 c41897w2 = C41897w2.f92051a;
        InterfaceC44951d interfaceC44951dM99969u = C45236a.m99969u(c41897w2);
        InterfaceC44951d interfaceC44951dM99969u2 = C45236a.m99969u(C46181p.f103715a);
        C41828i c41828i = C41828i.f91957a;
        return new InterfaceC44951d[]{interfaceC44951dM99969u, c41897w2, c41828i, c41828i, interfaceC44951dM99969u2};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        boolean zDecodeBooleanElement;
        boolean z11;
        int i11;
        String str;
        String str2;
        JsonElement jsonElement;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 1);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(interfaceC45533f, 2);
            str = str3;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(interfaceC45533f, 3);
            jsonElement = (JsonElement) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, C46181p.f103715a, null);
            z11 = zDecodeBooleanElement2;
            str2 = strDecodeStringElement;
            i11 = 31;
        } else {
            boolean z12 = true;
            boolean zDecodeBooleanElement3 = false;
            int i12 = 0;
            String str4 = null;
            String strDecodeStringElement2 = null;
            JsonElement jsonElement2 = null;
            boolean zDecodeBooleanElement4 = false;
            while (z12) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z12 = false;
                } else if (iDecodeElementIndex == 0) {
                    str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, str4);
                    i12 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 1);
                    i12 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(interfaceC45533f, 2);
                    i12 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(interfaceC45533f, 3);
                    i12 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    jsonElement2 = (JsonElement) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, C46181p.f103715a, jsonElement2);
                    i12 |= 16;
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement3;
            z11 = zDecodeBooleanElement4;
            i11 = i12;
            str = str4;
            str2 = strDecodeStringElement2;
            jsonElement = jsonElement2;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29633s(i11, str, str2, z11, zDecodeBooleanElement, jsonElement);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29633s c29633s = (C29633s) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c29633s.f59686a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, c29633s.f59686a);
        }
        interfaceC45829bBeginStructure.encodeStringElement(interfaceC45533f, 1, c29633s.f59687b);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c29633s.f59688c) {
            interfaceC45829bBeginStructure.encodeBooleanElement(interfaceC45533f, 2, c29633s.f59688c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c29633s.f59689d) {
            interfaceC45829bBeginStructure.encodeBooleanElement(interfaceC45533f, 3, c29633s.f59689d);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 4) || c29633s.f59690e != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 4, C46181p.f103715a, c29633s.f59690e);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
