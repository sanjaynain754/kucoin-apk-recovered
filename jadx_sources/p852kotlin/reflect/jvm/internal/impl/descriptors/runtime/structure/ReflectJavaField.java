package p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;

/* JADX INFO: compiled from: ReflectJavaField.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class ReflectJavaField extends ReflectJavaMember implements JavaField {

    @NotNull
    private final Field member;

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    public boolean getHasConstantNotNullInitializer() {
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    @NotNull
    public Field getMember() {
        return this.member;
    }

    public ReflectJavaField(@NotNull Field member) {
        Intrinsics.checkNotNullParameter(member, "member");
        this.member = member;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    @NotNull
    public ReflectJavaType getType() {
        ReflectJavaType.Factory factory = ReflectJavaType.Factory;
        Type genericType = getMember().getGenericType();
        Intrinsics.checkNotNullExpressionValue(genericType, "getGenericType(...)");
        return factory.create(genericType);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    public boolean isEnumEntry() {
        return getMember().isEnumConstant();
    }
}
