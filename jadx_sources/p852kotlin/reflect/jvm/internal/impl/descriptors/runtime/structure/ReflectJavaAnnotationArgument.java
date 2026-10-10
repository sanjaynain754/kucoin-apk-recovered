package p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import p852kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: ReflectJavaAnnotationArguments.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class ReflectJavaAnnotationArgument implements JavaAnnotationArgument {

    @NotNull
    public static final Factory Factory = new Factory(null);

    @Nullable
    private final Name name;

    /* JADX INFO: compiled from: ReflectJavaAnnotationArguments.kt */
    public static final class Factory {
        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Factory() {
        }

        @NotNull
        public final ReflectJavaAnnotationArgument create(@NotNull Object value, @Nullable Name name) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (ReflectClassUtilKt.isEnumClassOrSpecializedEnumEntryClass(value.getClass())) {
                return new ReflectJavaEnumValueAnnotationArgument(name, (Enum) value);
            }
            if (value instanceof Annotation) {
                return new ReflectJavaAnnotationAsAnnotationArgument(name, (Annotation) value);
            }
            if (value instanceof Object[]) {
                return new ReflectJavaArrayAnnotationArgument(name, (Object[]) value);
            }
            if (value instanceof Class) {
                return new ReflectJavaClassObjectAnnotationArgument(name, (Class) value);
            }
            return new ReflectJavaLiteralAnnotationArgument(name, value);
        }
    }

    public /* synthetic */ ReflectJavaAnnotationArgument(Name name, DefaultConstructorMarker defaultConstructorMarker) {
        this(name);
    }

    private ReflectJavaAnnotationArgument(Name name) {
        this.name = name;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument
    @Nullable
    public Name getName() {
        return this.name;
    }
}
