package com.sumsub.sns.internal.features.data.model.esign;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.InterfaceC41849m0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import tg0.InterfaceC44949c;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44963p;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.esign.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29784t implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29784t f59856a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29784t c29784t = new C29784t();
        f59856a = c29784t;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.esign.ESignOtpConfirmRequest", c29784t, 2);
        c41826h2.m91581o("otp", false);
        c41826h2.m91581o("documents", false);
        descriptor = c41826h2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        return new InterfaceC44951d[]{C29730B.f59800a, C29733E.f59802c[1].getValue()};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        C29732D c29732d;
        List list;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29733E.f59802c;
        C29732D c29732d2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            c29732d = (C29732D) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 0, C29730B.f59800a, null);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 1, (InterfaceC44949c) lazyArr[1].getValue(), null);
            i11 = 3;
        } else {
            boolean z11 = true;
            int i12 = 0;
            List list2 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    c29732d2 = (C29732D) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 0, C29730B.f59800a, c29732d2);
                    i12 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 1, (InterfaceC44949c) lazyArr[1].getValue(), list2);
                    i12 |= 2;
                }
            }
            i11 = i12;
            c29732d = c29732d2;
            list = list2;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29733E(i11, c29732d, list);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29733E c29733e = (C29733E) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29733E.f59802c;
        interfaceC45829bBeginStructure.encodeSerializableElement(interfaceC45533f, 0, C29730B.f59800a, c29733e.f59803a);
        interfaceC45829bBeginStructure.encodeSerializableElement(interfaceC45533f, 1, (InterfaceC44963p) lazyArr[1].getValue(), c29733e.f59804b);
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
