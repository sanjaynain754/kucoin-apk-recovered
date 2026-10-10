package kotlinx.serialization.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.serialization.SerializationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KClass;

/* JADX INFO: renamed from: kotlinx.serialization.internal.c */
/* JADX INFO: compiled from: AbstractPolymorphicSerializer.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\b\u001a\u00020\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"", "subClassName", "Lkotlin/reflect/KClass;", "baseClass", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Void;", "subClass", "b", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;)Ljava/lang/Void;", "kotlinx-serialization-core"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41798c {
    @JvmName(name = "throwSubtypeNotRegistered")
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Void m91503a(@Nullable String str, @NotNull KClass<?> baseClass) {
        String str2;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        String str3 = "in the polymorphic scope of '" + baseClass.getSimpleName() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + baseClass.getSimpleName() + "' has to be sealed and '@Serializable'.";
        }
        throw new SerializationException(str2);
    }

    @JvmName(name = "throwSubtypeNotRegistered")
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Void m91504b(@NotNull KClass<?> subClass, @NotNull KClass<?> baseClass) {
        Intrinsics.checkNotNullParameter(subClass, "subClass");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        String simpleName = subClass.getSimpleName();
        if (simpleName == null) {
            simpleName = String.valueOf(subClass);
        }
        m91503a(simpleName, baseClass);
        throw new KotlinNothingValueException();
    }
}
