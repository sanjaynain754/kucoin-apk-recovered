package kotlinx.serialization.json.internal;

import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;
import vg0.InterfaceC45533f;

/* JADX INFO: compiled from: JsonElementMarker.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
public /* synthetic */ class JsonElementMarker$origin$1 extends FunctionReferenceImpl implements Function2<InterfaceC45533f, Integer, Boolean> {
    public final Boolean invoke(InterfaceC45533f p11, int i11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return Boolean.valueOf(((JsonElementMarker) this.receiver).m91798e(p11, i11));
    }

    public JsonElementMarker$origin$1(Object obj) {
        super(2, obj, JsonElementMarker.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Boolean invoke(InterfaceC45533f interfaceC45533f, Integer num) {
        return invoke(interfaceC45533f, num.intValue());
    }
}
