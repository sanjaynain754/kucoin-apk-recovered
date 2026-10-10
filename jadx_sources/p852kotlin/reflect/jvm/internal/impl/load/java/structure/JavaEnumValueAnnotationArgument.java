package p852kotlin.reflect.jvm.internal.impl.load.java.structure;

import org.jetbrains.annotations.Nullable;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: annotationArguments.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface JavaEnumValueAnnotationArgument extends JavaAnnotationArgument {
    @Nullable
    Name getEntryName();

    @Nullable
    ClassId getEnumClassId();
}
