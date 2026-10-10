package com.sumsub.sentry;

import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.InterfaceC41849m0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44949c;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44963p;
import ug0.C45236a;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sentry.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C27988r implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C27988r f57124a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C27988r c27988r = new C27988r();
        f57124a = c27988r;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sentry.DebugMeta", c27988r, 2);
        c41826h2.m91581o("sdk_info", true);
        c41826h2.m91581o("images", true);
        descriptor = c41826h2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        return new InterfaceC44951d[]{C45236a.m99969u(C27890Q.f56966a), C27996t.f57129c[1].getValue()};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        C27895T c27895t;
        List list;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C27996t.f57129c;
        C27895T c27895t2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            c27895t = (C27895T) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C27890Q.f56966a, null);
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
                    c27895t2 = (C27895T) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C27890Q.f56966a, c27895t2);
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
            c27895t = c27895t2;
            list = list2;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C27996t(i11, c27895t, list);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C27996t c27996t = (C27996t) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C27996t.f57129c;
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c27996t.f57130a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C27890Q.f56966a, c27996t.f57130a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || !Intrinsics.areEqual(c27996t.f57131b, new ArrayList())) {
            interfaceC45829bBeginStructure.encodeSerializableElement(interfaceC45533f, 1, (InterfaceC44963p) lazyArr[1].getValue(), c27996t.f57131b);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
