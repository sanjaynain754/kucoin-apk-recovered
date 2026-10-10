package com.sumsub.sns.internal.features.data.model.common.remote.response;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.InterfaceC41849m0;
import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44951d;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29589p implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29589p f59611a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        return new InterfaceC44951d[]{C29607t1.f59665a, C29593q.f59617a};
    }

    static {
        C29589p c29589p = new C29589p();
        f59611a = c29589p;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.response.ApplicantWithIdDocsStatusResponse", c29589p, 2);
        c41826h2.m91581o("requiredIdDocsStatus", false);
        c41826h2.m91581o("applicant", false);
        descriptor = c41826h2;
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        C29478H1 c29478h1;
        C29601s c29601s;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        C29478H1 c29478h2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            c29478h1 = (C29478H1) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 0, C29607t1.f59665a, null);
            c29601s = (C29601s) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 1, C29593q.f59617a, null);
            i11 = 3;
        } else {
            boolean z11 = true;
            int i12 = 0;
            C29601s c29601s2 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    c29478h2 = (C29478H1) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 0, C29607t1.f59665a, c29478h2);
                    i12 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    c29601s2 = (C29601s) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 1, C29593q.f59617a, c29601s2);
                    i12 |= 2;
                }
            }
            i11 = i12;
            c29478h1 = c29478h2;
            c29601s = c29601s2;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29609u(i11, c29478h1, c29601s);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29609u c29609u = (C29609u) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        interfaceC45829bBeginStructure.encodeSerializableElement(interfaceC45533f, 0, C29607t1.f59665a, c29609u.f59666a);
        interfaceC45829bBeginStructure.encodeSerializableElement(interfaceC45533f, 1, C29593q.f59617a, c29609u.f59667b);
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
