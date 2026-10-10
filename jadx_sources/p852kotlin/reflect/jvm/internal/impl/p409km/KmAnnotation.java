package p852kotlin.reflect.jvm.internal.impl.p409km;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class KmAnnotation {

    @NotNull
    private final Map<String, KmAnnotationArgument> arguments;

    @NotNull
    private final String className;

    /* JADX WARN: Multi-variable type inference failed */
    public KmAnnotation(@NotNull String className, @NotNull Map<String, ? extends KmAnnotationArgument> arguments) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.className = className;
        this.arguments = arguments;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toString$lambda$0(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        return ((String) pair.component1()) + " = " + ((KmAnnotationArgument) pair.component2());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KmAnnotation)) {
            return false;
        }
        KmAnnotation kmAnnotation = (KmAnnotation) obj;
        return Intrinsics.areEqual(this.className, kmAnnotation.className) && Intrinsics.areEqual(this.arguments, kmAnnotation.arguments);
    }

    @NotNull
    public final Map<String, KmAnnotationArgument> getArguments() {
        return this.arguments;
    }

    @NotNull
    public final String getClassName() {
        return this.className;
    }

    public int hashCode() {
        return (this.className.hashCode() * 31) + this.arguments.hashCode();
    }

    @NotNull
    public String toString() {
        return '@' + this.className + '(' + CollectionsKt.joinToString$default(MapsKt.toList(this.arguments), null, null, null, 0, null, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.km.KmAnnotation$$Lambda$0
            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return KmAnnotation.toString$lambda$0((Pair) obj);
            }
        }, 31, null) + ')';
    }
}
