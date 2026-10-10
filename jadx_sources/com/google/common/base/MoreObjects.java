package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class MoreObjects {

    public static final class ToStringHelper {
        private final String className;
        private final ValueHolder holderHead;
        private ValueHolder holderTail;
        private boolean omitEmptyValues;
        private boolean omitNullValues;

        public static final class UnconditionalValueHolder extends ValueHolder {
            private UnconditionalValueHolder() {
            }
        }

        public static class ValueHolder {
            String name;
            ValueHolder next;
            Object value;
        }

        private ValueHolder addHolder() {
            ValueHolder valueHolder = new ValueHolder();
            this.holderTail.next = valueHolder;
            this.holderTail = valueHolder;
            return valueHolder;
        }

        private UnconditionalValueHolder addUnconditionalHolder() {
            UnconditionalValueHolder unconditionalValueHolder = new UnconditionalValueHolder();
            this.holderTail.next = unconditionalValueHolder;
            this.holderTail = unconditionalValueHolder;
            return unconditionalValueHolder;
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, Object obj) {
            return addHolder(str, obj);
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(Object obj) {
            return addHolder(obj);
        }

        @CanIgnoreReturnValue
        public ToStringHelper omitNullValues() {
            this.omitNullValues = true;
            return this;
        }

        private ToStringHelper(String str) {
            ValueHolder valueHolder = new ValueHolder();
            this.holderHead = valueHolder;
            this.holderTail = valueHolder;
            this.omitNullValues = false;
            this.omitEmptyValues = false;
            this.className = (String) Preconditions.checkNotNull(str);
        }

        private static boolean isEmpty(Object obj) {
            if (obj instanceof CharSequence) {
                return ((CharSequence) obj).length() == 0;
            }
            if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            }
            if (obj instanceof Map) {
                return ((Map) obj).isEmpty();
            }
            if (obj instanceof Optional) {
                return !((Optional) obj).isPresent();
            }
            return obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, boolean z11) {
            return addUnconditionalHolder(str, String.valueOf(z11));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(boolean z11) {
            return addUnconditionalHolder(String.valueOf(z11));
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0030  */
        /* JADX WARN: Code duplicated, block: B:14:0x0037  */
        /* JADX WARN: Code duplicated, block: B:16:0x0041  */
        /* JADX WARN: Code duplicated, block: B:19:0x005d  */
        public String toString() {
            String str;
            boolean z11 = this.omitNullValues;
            boolean z12 = this.omitEmptyValues;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.className);
            sb2.append('{');
            String str2 = "";
            for (ValueHolder valueHolder = this.holderHead.next; valueHolder != null; valueHolder = valueHolder.next) {
                Object obj = valueHolder.value;
                if (valueHolder instanceof UnconditionalValueHolder) {
                    sb2.append(str2);
                    str = valueHolder.name;
                    if (str != null) {
                        sb2.append(str);
                        sb2.append('=');
                    }
                    if (obj == null && obj.getClass().isArray()) {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    str2 = ", ";
                } else if (obj == null) {
                    if (!z11) {
                        sb2.append(str2);
                        str = valueHolder.name;
                        if (str != null) {
                            sb2.append(str);
                            sb2.append('=');
                        }
                        if (obj == null) {
                            sb2.append(obj);
                        } else {
                            sb2.append(obj);
                        }
                        str2 = ", ";
                    }
                } else if (!z12 || !isEmpty(obj)) {
                    sb2.append(str2);
                    str = valueHolder.name;
                    if (str != null) {
                        sb2.append(str);
                        sb2.append('=');
                    }
                    if (obj == null) {
                        sb2.append(obj);
                    } else {
                        sb2.append(obj);
                    }
                    str2 = ", ";
                }
            }
            sb2.append('}');
            return sb2.toString();
        }

        @CanIgnoreReturnValue
        private ToStringHelper addHolder(Object obj) {
            addHolder().value = obj;
            return this;
        }

        @CanIgnoreReturnValue
        private ToStringHelper addUnconditionalHolder(Object obj) {
            addUnconditionalHolder().value = obj;
            return this;
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, char c11) {
            return addUnconditionalHolder(str, String.valueOf(c11));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(char c11) {
            return addUnconditionalHolder(String.valueOf(c11));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, double d11) {
            return addUnconditionalHolder(str, String.valueOf(d11));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(double d11) {
            return addUnconditionalHolder(String.valueOf(d11));
        }

        @CanIgnoreReturnValue
        private ToStringHelper addHolder(String str, Object obj) {
            ValueHolder valueHolderAddHolder = addHolder();
            valueHolderAddHolder.value = obj;
            valueHolderAddHolder.name = (String) Preconditions.checkNotNull(str);
            return this;
        }

        @CanIgnoreReturnValue
        private ToStringHelper addUnconditionalHolder(String str, Object obj) {
            UnconditionalValueHolder unconditionalValueHolderAddUnconditionalHolder = addUnconditionalHolder();
            unconditionalValueHolderAddUnconditionalHolder.value = obj;
            unconditionalValueHolderAddUnconditionalHolder.name = (String) Preconditions.checkNotNull(str);
            return this;
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, float f11) {
            return addUnconditionalHolder(str, String.valueOf(f11));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(float f11) {
            return addUnconditionalHolder(String.valueOf(f11));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, int i11) {
            return addUnconditionalHolder(str, String.valueOf(i11));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(int i11) {
            return addUnconditionalHolder(String.valueOf(i11));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, long j11) {
            return addUnconditionalHolder(str, String.valueOf(j11));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(long j11) {
            return addUnconditionalHolder(String.valueOf(j11));
        }
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj.getClass().getSimpleName());
    }

    public static <T> T firstNonNull(T t11, T t12) {
        if (t11 != null) {
            return t11;
        }
        if (t12 != null) {
            return t12;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static ToStringHelper toStringHelper(Class<?> cls) {
        return new ToStringHelper(cls.getSimpleName());
    }

    private MoreObjects() {
    }

    public static ToStringHelper toStringHelper(String str) {
        return new ToStringHelper(str);
    }
}
