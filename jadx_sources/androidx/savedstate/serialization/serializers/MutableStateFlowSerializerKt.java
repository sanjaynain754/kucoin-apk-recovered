package androidx.savedstate.serialization.serializers;

import androidx.exifinterface.media.ExifInterface;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.MagicApiIntrinsics;
import p852kotlin.reflect.KType;
import tg0.C44971x;

/* JADX INFO: compiled from: MutableStateFlowSerializer.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\u0086\b¨\u0006\u0003"}, m90084d2 = {"MutableStateFlowSerializer", "Landroidx/savedstate/serialization/serializers/MutableStateFlowSerializer;", ExifInterface.GPS_DIRECTION_TRUE, "savedstate_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class MutableStateFlowSerializerKt {
    public static final /* synthetic */ <T> MutableStateFlowSerializer<T> MutableStateFlowSerializer() {
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        return new MutableStateFlowSerializer<>(C44971x.serializer((KType) null));
    }
}
