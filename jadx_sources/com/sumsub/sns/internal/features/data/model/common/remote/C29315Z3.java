package com.sumsub.sns.internal.features.data.model.common.remote;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.Z3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29315Z3 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29315Z3 f59329a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29315Z3 c29315z3 = new C29315Z3();
        f59329a = c29315z3;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.UpdatedFieldSurrogateSerializer.UpdatedFieldSurrogate", c29315z3, 2);
        c41826h2.m91581o("name", false);
        c41826h2.m91581o("value", false);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        return new InterfaceC44951d[]{C41897w2.f92051a, C45236a.m99969u(C46181p.f103715a)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        String strDecodeStringElement;
        JsonElement jsonElement;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 0);
            jsonElement = (JsonElement) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C46181p.f103715a, null);
            i11 = 3;
        } else {
            boolean z11 = true;
            int i12 = 0;
            JsonElement jsonElement2 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 0);
                    i12 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    jsonElement2 = (JsonElement) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C46181p.f103715a, jsonElement2);
                    i12 |= 2;
                }
            }
            i11 = i12;
            strDecodeStringElement = strDecodeStringElement2;
            jsonElement = jsonElement2;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29329b4(i11, strDecodeStringElement, jsonElement);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29329b4 c29329b4 = (C29329b4) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        interfaceC45829bBeginStructure.encodeStringElement(interfaceC45533f, 0, c29329b4.f59340a);
        interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C46181p.f103715a, c29329b4.f59341b);
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
