package io.trtc.tuikit.atomicxcore.hybridapi.json;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Enum;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J\u0017\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0002\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0015R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/hybridapi/json/EnumTypeAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lcom/google/gson/TypeAdapter;", "enumClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "isIntValue", "", "isStringValue", "valueField", "Ljava/lang/reflect/Field;", "read", "in", "Lcom/google/gson/stream/JsonReader;", "(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Enum;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "value", "(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Enum;)V", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
final class EnumTypeAdapter<T extends Enum<?>> extends TypeAdapter<T> {

    @NotNull
    private final Class<T> enumClass;
    private final boolean isIntValue;
    private final boolean isStringValue;

    @Nullable
    private final Field valueField;

    @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JsonToken.values().length];
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JsonToken.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public EnumTypeAdapter(@NotNull Class<T> enumClass) {
        Field declaredField;
        Intrinsics.checkNotNullParameter(enumClass, "enumClass");
        this.enumClass = enumClass;
        boolean z11 = true;
        try {
            declaredField = enumClass.getDeclaredField("value");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
            declaredField = null;
        }
        this.valueField = declaredField;
        Class<?> type = declaredField != null ? declaredField.getType() : null;
        Class cls = Integer.TYPE;
        if (!Intrinsics.areEqual(type, cls)) {
            if (!Intrinsics.areEqual(declaredField != null ? declaredField.getType() : null, cls)) {
                z11 = false;
            }
        }
        this.isIntValue = z11;
        this.isStringValue = Intrinsics.areEqual(declaredField != null ? declaredField.getType() : null, String.class);
    }

    @Override // com.google.gson.TypeAdapter
    @Nullable
    /* JADX INFO: renamed from: read */
    public T read2(@NotNull JsonReader in2) throws IllegalAccessException, IOException {
        Intrinsics.checkNotNullParameter(in2, "in");
        if (in2.peek() == JsonToken.NULL) {
            in2.nextNull();
            return null;
        }
        T[] enumConstants = this.enumClass.getEnumConstants();
        if (enumConstants == null) {
            return null;
        }
        JsonToken jsonTokenPeek = in2.peek();
        int i11 = jsonTokenPeek == null ? -1 : WhenMappings.$EnumSwitchMapping$0[jsonTokenPeek.ordinal()];
        int i12 = 0;
        if (i11 == 1) {
            int iNextInt = in2.nextInt();
            if (this.valueField != null && this.isIntValue) {
                int length = enumConstants.length;
                while (i12 < length) {
                    T t11 = enumConstants[i12];
                    Object obj = this.valueField.get(t11);
                    Integer num = obj instanceof Integer ? (Integer) obj : null;
                    if (num != null && num.intValue() == iNextInt) {
                        return t11;
                    }
                    i12++;
                }
            }
            return null;
        }
        if (i11 != 2) {
            in2.skipValue();
            return null;
        }
        String strNextString = in2.nextString();
        if (this.valueField != null) {
            if (this.isIntValue) {
                Intrinsics.checkNotNull(strNextString);
                Integer intOrNull = StringsKt.toIntOrNull(strNextString);
                if (intOrNull != null) {
                    for (T t12 : enumConstants) {
                        Object obj2 = this.valueField.get(t12);
                        if (Intrinsics.areEqual(obj2 instanceof Integer ? (Integer) obj2 : null, intOrNull)) {
                            return t12;
                        }
                    }
                }
            } else if (this.isStringValue) {
                for (T t13 : enumConstants) {
                    Object obj3 = this.valueField.get(t13);
                    if (Intrinsics.areEqual(obj3 instanceof String ? (String) obj3 : null, strNextString)) {
                        return t13;
                    }
                }
            }
        }
        int length2 = enumConstants.length;
        while (i12 < length2) {
            T t14 = enumConstants[i12];
            if (Intrinsics.areEqual(t14.name(), strNextString)) {
                return t14;
            }
            i12++;
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(@NotNull JsonWriter out, @Nullable T value) throws IllegalAccessException, IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        if (value == null) {
            out.nullValue();
            return;
        }
        Field field = this.valueField;
        if (field != null) {
            Object obj = field.get(value);
            if (this.isIntValue && (obj instanceof Integer)) {
                out.value((Number) obj);
                return;
            } else if (this.isStringValue && (obj instanceof String)) {
                out.value((String) obj);
                return;
            }
        }
        out.value("");
    }
}
