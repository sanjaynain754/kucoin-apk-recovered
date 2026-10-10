package com.sumsub.sns.internal.features.data.model.common.remote;

import com.sumsub.sns.internal.features.data.model.common.remote.response.ConfirmationType;
import java.util.List;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.N0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29253N0 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29253N0 f59245a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29253N0 c29253n0 = new C29253N0();
        f59245a = c29253n0;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.RemoteApplicantDataSource", c29253n0, 5);
        c41826h2.m91581o("sourceId", true);
        c41826h2.m91581o("docType", true);
        c41826h2.m91581o("confirmationType", true);
        c41826h2.m91581o("fields", true);
        c41826h2.m91581o("idDocSetType", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        Lazy[] lazyArr = C29263P0.f59252f;
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new InterfaceC44951d[]{C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u((InterfaceC44951d) lazyArr[2].getValue()), C45236a.m99969u((InterfaceC44951d) lazyArr[3].getValue()), C45236a.m99969u(c41897w2)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        String str;
        String str2;
        ConfirmationType confirmationType;
        List list;
        String str3;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29263P0.f59252f;
        String str4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            C41897w2 c41897w2 = C41897w2.f92051a;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, c41897w2, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, c41897w2, null);
            ConfirmationType confirmationType2 = (ConfirmationType) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, (InterfaceC44949c) lazyArr[2].getValue(), null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, (InterfaceC44949c) lazyArr[3].getValue(), null);
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, c41897w2, null);
            i11 = 31;
            confirmationType = confirmationType2;
            str2 = str6;
            str = str5;
        } else {
            boolean z11 = true;
            int i12 = 0;
            String str7 = null;
            ConfirmationType confirmationType3 = null;
            List list2 = null;
            String str8 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, str4);
                    i12 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, str7);
                    i12 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    confirmationType3 = (ConfirmationType) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, (InterfaceC44949c) lazyArr[2].getValue(), confirmationType3);
                    i12 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, (InterfaceC44949c) lazyArr[3].getValue(), list2);
                    i12 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, C41897w2.f92051a, str8);
                    i12 |= 16;
                }
            }
            i11 = i12;
            str = str4;
            str2 = str7;
            confirmationType = confirmationType3;
            list = list2;
            str3 = str8;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29263P0(i11, str, str2, confirmationType, list, str3);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29263P0 c29263p0 = (C29263P0) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29263P0.f59252f;
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c29263p0.f59253a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, c29263p0.f59253a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c29263p0.f59254b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, c29263p0.f59254b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c29263p0.f59255c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, (InterfaceC44963p) lazyArr[2].getValue(), c29263p0.f59255c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c29263p0.f59256d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, (InterfaceC44963p) lazyArr[3].getValue(), c29263p0.f59256d);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 4) || c29263p0.f59257e != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 4, C41897w2.f92051a, c29263p0.f59257e);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
