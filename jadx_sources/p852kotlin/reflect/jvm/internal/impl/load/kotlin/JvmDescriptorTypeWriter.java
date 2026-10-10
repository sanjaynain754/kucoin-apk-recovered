package p852kotlin.reflect.jvm.internal.impl.load.kotlin;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: typeSignatureMapping.kt */
/* JADX INFO: loaded from: classes61.dex */
public class JvmDescriptorTypeWriter<T> {

    @Nullable
    private T jvmCurrentType;
    private int jvmCurrentTypeArrayLevel;

    @NotNull
    private final JvmTypeFactory<T> jvmTypeFactory;

    public void writeArrayType() {
        if (this.jvmCurrentType == null) {
            this.jvmCurrentTypeArrayLevel++;
        }
    }

    public void writeClass(@NotNull T objectType) {
        Intrinsics.checkNotNullParameter(objectType, "objectType");
        writeJvmTypeAsIs(objectType);
    }

    public void writeTypeVariable(@NotNull Name name, @NotNull T type) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        writeJvmTypeAsIs(type);
    }

    public final void writeJvmTypeAsIs(@NotNull T type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (this.jvmCurrentType == null) {
            if (this.jvmCurrentTypeArrayLevel > 0) {
                type = this.jvmTypeFactory.createFromString(StringsKt.repeat("[", this.jvmCurrentTypeArrayLevel) + this.jvmTypeFactory.toString(type));
            }
            this.jvmCurrentType = type;
        }
    }

    public void writeArrayEnd() {
    }
}
