package com.sumsub.sentry;

import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41813f;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.InterfaceC41849m0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sentry.W0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C27902W0 {
    @NotNull
    public final <T> InterfaceC44951d<C27904X0<T>> serializer(@NotNull final InterfaceC44951d<T> interfaceC44951d) {
        return new InterfaceC41849m0() { // from class: com.sumsub.sentry.V0

            @NotNull
            private final InterfaceC45533f descriptor;

            @Override // kotlinx.serialization.internal.InterfaceC41849m0
            public final InterfaceC44951d[] childSerializers() {
                return new InterfaceC44951d[]{new C41813f(interfaceC44951d)};
            }

            @Override // tg0.InterfaceC44949c
            public final Object deserialize(InterfaceC41787b interfaceC41787b) {
                List list;
                InterfaceC45533f interfaceC45533f = this.descriptor;
                CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
                int i11 = 1;
                List list2 = null;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    list = (List) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 0, new C41813f(interfaceC44951d), null);
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    while (z11) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                        if (iDecodeElementIndex == -1) {
                            z11 = false;
                        } else {
                            if (iDecodeElementIndex != 0) {
                                throw new UnknownFieldException(iDecodeElementIndex);
                            }
                            list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 0, new C41813f(interfaceC44951d), list2);
                            i12 = 1;
                        }
                    }
                    list = list2;
                    i11 = i12;
                }
                compositeDecoderBeginStructure.endStructure(interfaceC45533f);
                return new C27904X0(list, i11);
            }

            @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
            public final InterfaceC45533f getDescriptor() {
                return this.descriptor;
            }

            @Override // tg0.InterfaceC44963p
            public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
                C27904X0 c27904x0 = (C27904X0) obj;
                InterfaceC45533f interfaceC45533f = this.descriptor;
                InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
                InterfaceC44951d interfaceC44951d2 = interfaceC44951d;
                C27902W0 c27902w0 = C27904X0.Companion;
                if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || !Intrinsics.areEqual(c27904x0.f56992a, new ArrayList(0))) {
                    interfaceC45829bBeginStructure.encodeSerializableElement(interfaceC45533f, 0, new C41813f(interfaceC44951d2), c27904x0.f56992a);
                }
                interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
            }

            @Override // kotlinx.serialization.internal.InterfaceC41849m0
            public final InterfaceC44951d[] typeParametersSerializers() {
                return new InterfaceC44951d[]{interfaceC44951d};
            }

            {
                C41826h2 c41826h2 = new C41826h2("com.sumsub.sentry.SentryValues", this, 1);
                c41826h2.m91581o("values", true);
                this.descriptor = c41826h2;
            }
        };
    }
}
