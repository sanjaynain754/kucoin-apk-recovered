package com.sumsub.sns.internal.features.data.model.common;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.C41828i;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.u3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29703u3 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29703u3 f59767a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29703u3 c29703u3 = new C29703u3();
        f59767a = c29703u3;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.SumsubIdConfig", c29703u3, 2);
        c41826h2.m91581o("type", false);
        c41826h2.m91581o("enabledByDefault", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        return new InterfaceC44951d[]{C45236a.m99969u((InterfaceC44951d) C29713w3.f59776c[0].getValue()), C41828i.f91957a};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        boolean zDecodeBooleanElement;
        int i11;
        SumsubIdType sumsubIdType;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29713w3.f59776c;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            sumsubIdType = (SumsubIdType) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, (InterfaceC44949c) lazyArr[0].getValue(), null);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(interfaceC45533f, 1);
            i11 = 3;
        } else {
            boolean z11 = true;
            zDecodeBooleanElement = false;
            SumsubIdType sumsubIdType2 = null;
            int i12 = 0;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    sumsubIdType2 = (SumsubIdType) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, (InterfaceC44949c) lazyArr[0].getValue(), sumsubIdType2);
                    i12 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(interfaceC45533f, 1);
                    i12 |= 2;
                }
            }
            i11 = i12;
            sumsubIdType = sumsubIdType2;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29713w3(i11, sumsubIdType, zDecodeBooleanElement);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29713w3 c29713w3 = (C29713w3) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, (InterfaceC44963p) C29713w3.f59776c[0].getValue(), c29713w3.f59777a);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || !c29713w3.f59778b) {
            interfaceC45829bBeginStructure.encodeBooleanElement(interfaceC45533f, 1, c29713w3.f59778b);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
