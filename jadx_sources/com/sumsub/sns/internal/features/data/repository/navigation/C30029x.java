package com.sumsub.sns.internal.features.data.repository.navigation;

import androidx.core.app.NotificationCompat;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.navigation.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C30029x implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C30029x f60320a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C30029x c30029x = new C30029x();
        f60320a = c30029x;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.repository.navigation.ServerNavigationStateDto", c30029x, 5);
        c41826h2.m91581o(NotificationCompat.CATEGORY_NAVIGATION, true);
        c41826h2.m91581o(ReportDataTable.COLUMN_PARAMS, true);
        c41826h2.m91581o("step", false);
        c41826h2.m91581o("version", true);
        c41826h2.m91581o("applicantReview", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        return new InterfaceC44951d[]{C30009d.f60289a, C45236a.m99969u(C30012g.f60293a), C30015j.f60299a, C45236a.m99969u(C41897w2.f92051a), C45236a.m99969u(C30004a.f60287a)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        C30011f c30011f;
        C30014i c30014i;
        C30020o c30020o;
        String str;
        C30008c c30008c;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        C30011f c30011f2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            C30011f c30011f3 = (C30011f) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 0, C30009d.f60289a, null);
            C30014i c30014i2 = (C30014i) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C30012g.f60293a, null);
            C30020o c30020o2 = (C30020o) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 2, C30015j.f60299a, null);
            c30011f = c30011f3;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, null);
            c30008c = (C30008c) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, C30004a.f60287a, null);
            c30020o = c30020o2;
            c30014i = c30014i2;
            i11 = 31;
        } else {
            boolean z11 = true;
            int i12 = 0;
            C30014i c30014i3 = null;
            C30020o c30020o3 = null;
            String str2 = null;
            C30008c c30008c2 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    c30011f2 = (C30011f) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 0, C30009d.f60289a, c30011f2);
                    i12 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    c30014i3 = (C30014i) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C30012g.f60293a, c30014i3);
                    i12 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    c30020o3 = (C30020o) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 2, C30015j.f60299a, c30020o3);
                    i12 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, str2);
                    i12 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    c30008c2 = (C30008c) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, C30004a.f60287a, c30008c2);
                    i12 |= 16;
                }
            }
            i11 = i12;
            c30011f = c30011f2;
            c30014i = c30014i3;
            c30020o = c30020o3;
            str = str2;
            c30008c = c30008c2;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C30031z(i11, c30011f, c30014i, c30020o, str, c30008c);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C30031z c30031z = (C30031z) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || !Intrinsics.areEqual(c30031z.f60321a, new C30011f())) {
            interfaceC45829bBeginStructure.encodeSerializableElement(interfaceC45533f, 0, C30009d.f60289a, c30031z.f60321a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c30031z.f60322b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C30012g.f60293a, c30031z.f60322b);
        }
        interfaceC45829bBeginStructure.encodeSerializableElement(interfaceC45533f, 2, C30015j.f60299a, c30031z.f60323c);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c30031z.f60324d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, c30031z.f60324d);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 4) || c30031z.f60325e != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 4, C30004a.f60287a, c30031z.f60325e);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
