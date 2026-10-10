package p852kotlin.reflect.jvm.internal;

import java.lang.ref.SoftReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public class ReflectProperties {

    public static class LazySoftVal<T> extends Val<T> implements Function0<T> {
        private final Function0<T> initializer;
        private volatile SoftReference<Object> value;

        public LazySoftVal(@Nullable T t11, @NotNull Function0<T> function0) {
            if (function0 == null) {
                $$$reportNull$$$0(0);
            }
            this.value = null;
            this.initializer = function0;
            if (t11 != null) {
                this.value = new SoftReference<>(escape(t11));
            }
        }

        @Override // kotlin.reflect.jvm.internal.ReflectProperties.Val, p852kotlin.jvm.functions.Function0
        public T invoke() {
            Object obj;
            SoftReference<Object> softReference = this.value;
            if (softReference != null && (obj = softReference.get()) != null) {
                return unescape(obj);
            }
            T tInvoke = this.initializer.invoke();
            this.value = new SoftReference<>(escape(tInvoke));
            return tInvoke;
        }

        private static /* synthetic */ void $$$reportNull$$$0(int i11) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }
    }

    public static abstract class Val<T> {
        private static final Object NULL_VALUE = new Object() { // from class: kotlin.reflect.jvm.internal.ReflectProperties.Val.1
        };

        public abstract T invoke();

        public Object escape(T t11) {
            return t11 == null ? NULL_VALUE : t11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public T unescape(Object obj) {
            if (obj == NULL_VALUE) {
                return null;
            }
            return obj;
        }

        public final T getValue(Object obj, Object obj2) {
            return invoke();
        }
    }

    @NotNull
    public static <T> LazySoftVal<T> lazySoft(@Nullable T t11, @NotNull Function0<T> function0) {
        if (function0 == null) {
            $$$reportNull$$$0(0);
        }
        return new LazySoftVal<>(t11, function0);
    }

    @NotNull
    public static <T> LazySoftVal<T> lazySoft(@NotNull Function0<T> function0) {
        if (function0 == null) {
            $$$reportNull$$$0(1);
        }
        return lazySoft(null, function0);
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i11) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }
}
