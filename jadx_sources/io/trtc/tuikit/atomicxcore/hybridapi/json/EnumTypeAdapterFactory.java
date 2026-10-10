package io.trtc.tuikit.atomicxcore.hybridapi.json;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\tH\u0016¨\u0006\n"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/hybridapi/json/EnumTypeAdapterFactory;", "Lcom/google/gson/TypeAdapterFactory;", "()V", "create", "Lcom/google/gson/TypeAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "gson", "Lcom/google/gson/Gson;", "type", "Lcom/google/gson/reflect/TypeToken;", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
final class EnumTypeAdapterFactory implements TypeAdapterFactory {
    @Override // com.google.gson.TypeAdapterFactory
    @Nullable
    public <T> TypeAdapter<T> create(@NotNull Gson gson, @NotNull TypeToken<T> type) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(type, "type");
        Class<? super T> rawType = type.getRawType();
        if (!rawType.isEnum()) {
            return null;
        }
        Intrinsics.checkNotNull(rawType, "null cannot be cast to non-null type java.lang.Class<out kotlin.Enum<*>>");
        return new EnumTypeAdapter(rawType);
    }
}
