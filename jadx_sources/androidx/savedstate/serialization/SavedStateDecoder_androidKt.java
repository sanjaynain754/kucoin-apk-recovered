package androidx.savedstate.serialization;

import android.os.Parcelable;
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
import java.util.Arrays;
import kotlinx.serialization.encoding.InterfaceC41787b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmClassMappingKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.reflect.KClass;
import tg0.InterfaceC44949c;
import vg0.InterfaceC45533f;

/* JADX INFO: compiled from: SavedStateDecoder.android.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a)\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\n\u001a\u0012\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b0\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/savedstate/serialization/SavedStateDecoder;", "Ltg0/c;", "strategy", "decodeFormatSpecificTypesOnPlatform", "(Landroidx/savedstate/serialization/SavedStateDecoder;Ltg0/c;)Ljava/lang/Object;", "referenceArraySerializer", "Lkotlin/reflect/KClass;", "", "", "getArrayKClass", "(Ltg0/c;)Lkotlin/reflect/KClass;", "savedstate_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class SavedStateDecoder_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <T> T decodeFormatSpecificTypesOnPlatform(@NotNull SavedStateDecoder savedStateDecoder, @NotNull InterfaceC44949c<? extends T> strategy) {
        Intrinsics.checkNotNullParameter(savedStateDecoder, "<this>");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        InterfaceC45533f descriptor = strategy.getDescriptor();
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceDescriptor())) {
            return (T) CharSequenceSerializer.INSTANCE.deserialize((InterfaceC41787b) savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableDescriptor())) {
            return (T) DefaultParcelableSerializer.INSTANCE.deserialize((InterfaceC41787b) savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicJavaSerializableDescriptor())) {
            return (T) DefaultJavaSerializableSerializer.INSTANCE.deserialize((InterfaceC41787b) savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicIBinderDescriptor())) {
            return (T) IBinderSerializer.INSTANCE.deserialize((InterfaceC41787b) savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getCharSequenceArrayDescriptor()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceArrayDescriptor())) {
            return (T) CharSequenceArraySerializer.INSTANCE.deserialize((InterfaceC41787b) savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getCharSequenceListDescriptor()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceListDescriptor())) {
            return (T) CharSequenceListSerializer.INSTANCE.deserialize((InterfaceC41787b) savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getParcelableArrayDescriptor())) {
            Parcelable[] parcelableArrDeserialize = ParcelableArraySerializer.INSTANCE.deserialize((InterfaceC41787b) savedStateDecoder);
            return (T) Arrays.copyOf(parcelableArrDeserialize, parcelableArrDeserialize.length, JvmClassMappingKt.getJavaClass((KClass) getArrayKClass(strategy)));
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableArrayDescriptor())) {
            return (T) ParcelableArraySerializer.INSTANCE.deserialize((InterfaceC41787b) savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getParcelableListDescriptor()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableListDescriptor())) {
            return (T) ParcelableListSerializer.INSTANCE.deserialize((InterfaceC41787b) savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getSparseParcelableArrayDescriptor()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicSparseParcelableArrayDescriptor()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getNullablePolymorphicSparseParcelableArrayDescriptor())) {
            return (T) SparseParcelableArraySerializer.INSTANCE.deserialize((InterfaceC41787b) savedStateDecoder);
        }
        return null;
    }

    private static final KClass<Object[]> getArrayKClass(InterfaceC44949c<?> interfaceC44949c) {
        Object objDeserialize = interfaceC44949c.deserialize(EmptyArrayDecoder.INSTANCE);
        Intrinsics.checkNotNull(objDeserialize);
        return Reflection.getOrCreateKotlinClass(objDeserialize.getClass());
    }
}
