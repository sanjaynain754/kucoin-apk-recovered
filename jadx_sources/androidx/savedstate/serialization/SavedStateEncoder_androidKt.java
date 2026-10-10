package androidx.savedstate.serialization;

import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.exifinterface.media.ExifInterface;
import androidx.savedstate.serialization.serializers.CharSequenceArraySerializer;
import androidx.savedstate.serialization.serializers.CharSequenceListSerializer;
import androidx.savedstate.serialization.serializers.CharSequenceSerializer;
import androidx.savedstate.serialization.serializers.DefaultJavaSerializableSerializer;
import androidx.savedstate.serialization.serializers.DefaultParcelableSerializer;
import androidx.savedstate.serialization.serializers.IBinderSerializer;
import androidx.savedstate.serialization.serializers.ParcelableArraySerializer;
import androidx.savedstate.serialization.serializers.ParcelableListSerializer;
import androidx.savedstate.serialization.serializers.SparseParcelableArraySerializer;
import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44963p;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45830c;

/* JADX INFO: compiled from: SavedStateEncoder.android.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a/\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/savedstate/serialization/SavedStateEncoder;", "Ltg0/p;", "strategy", "value", "", "encodeFormatSpecificTypesOnPlatform", "(Landroidx/savedstate/serialization/SavedStateEncoder;Ltg0/p;Ljava/lang/Object;)Z", "savedstate_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class SavedStateEncoder_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean encodeFormatSpecificTypesOnPlatform(@NotNull SavedStateEncoder savedStateEncoder, @NotNull InterfaceC44963p<? super T> strategy, T t11) {
        Intrinsics.checkNotNullParameter(savedStateEncoder, "<this>");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        InterfaceC45533f descriptor = strategy.getDescriptor();
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceDescriptor())) {
            CharSequenceSerializer charSequenceSerializer = CharSequenceSerializer.INSTANCE;
            Intrinsics.checkNotNull(t11, "null cannot be cast to non-null type kotlin.CharSequence");
            charSequenceSerializer.serialize((InterfaceC45830c) savedStateEncoder, (CharSequence) t11);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableDescriptor())) {
            DefaultParcelableSerializer defaultParcelableSerializer = DefaultParcelableSerializer.INSTANCE;
            Intrinsics.checkNotNull(t11, "null cannot be cast to non-null type android.os.Parcelable");
            defaultParcelableSerializer.serialize((InterfaceC45830c) savedStateEncoder, (Parcelable) t11);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicJavaSerializableDescriptor())) {
            DefaultJavaSerializableSerializer defaultJavaSerializableSerializer = DefaultJavaSerializableSerializer.INSTANCE;
            Intrinsics.checkNotNull(t11, "null cannot be cast to non-null type java.io.Serializable");
            defaultJavaSerializableSerializer.serialize((InterfaceC45830c) savedStateEncoder, (Serializable) t11);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicIBinderDescriptor())) {
            IBinderSerializer iBinderSerializer = IBinderSerializer.INSTANCE;
            Intrinsics.checkNotNull(t11, "null cannot be cast to non-null type android.os.IBinder");
            iBinderSerializer.serialize((InterfaceC45830c) savedStateEncoder, (IBinder) t11);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getCharSequenceArrayDescriptor()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceArrayDescriptor())) {
            CharSequenceArraySerializer charSequenceArraySerializer = CharSequenceArraySerializer.INSTANCE;
            Intrinsics.checkNotNull(t11, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
            charSequenceArraySerializer.serialize((InterfaceC45830c) savedStateEncoder, (CharSequence[]) t11);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getCharSequenceListDescriptor()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceListDescriptor())) {
            CharSequenceListSerializer charSequenceListSerializer = CharSequenceListSerializer.INSTANCE;
            Intrinsics.checkNotNull(t11, "null cannot be cast to non-null type kotlin.collections.List<kotlin.CharSequence>");
            charSequenceListSerializer.serialize((InterfaceC45830c) savedStateEncoder, (List<? extends CharSequence>) t11);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getParcelableArrayDescriptor()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableArrayDescriptor())) {
            ParcelableArraySerializer parcelableArraySerializer = ParcelableArraySerializer.INSTANCE;
            Intrinsics.checkNotNull(t11, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
            parcelableArraySerializer.serialize((InterfaceC45830c) savedStateEncoder, (Parcelable[]) t11);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getParcelableListDescriptor()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableListDescriptor())) {
            ParcelableListSerializer parcelableListSerializer = ParcelableListSerializer.INSTANCE;
            Intrinsics.checkNotNull(t11, "null cannot be cast to non-null type kotlin.collections.List<android.os.Parcelable>");
            parcelableListSerializer.serialize((InterfaceC45830c) savedStateEncoder, (List<? extends Parcelable>) t11);
            return true;
        }
        if (!Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getSparseParcelableArrayDescriptor()) && !Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicSparseParcelableArrayDescriptor()) && !Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getNullablePolymorphicSparseParcelableArrayDescriptor())) {
            return false;
        }
        SparseParcelableArraySerializer sparseParcelableArraySerializer = SparseParcelableArraySerializer.INSTANCE;
        Intrinsics.checkNotNull(t11, "null cannot be cast to non-null type android.util.SparseArray<android.os.Parcelable>");
        sparseParcelableArraySerializer.serialize((InterfaceC45830c) savedStateEncoder, (SparseArray<Parcelable>) t11);
        return true;
    }
}
