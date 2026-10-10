package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public class Joiner {
    private final String separator;

    public static final class MapJoiner {
        private final Joiner joiner;
        private final String keyValueSeparator;

        @CanIgnoreReturnValue
        public <A extends Appendable> A appendTo(A a11, Map<?, ?> map) throws IOException {
            return (A) appendTo(a11, map.entrySet());
        }

        public String join(Map<?, ?> map) {
            return join(map.entrySet());
        }

        private MapJoiner(Joiner joiner, String str) {
            this.joiner = joiner;
            this.keyValueSeparator = (String) Preconditions.checkNotNull(str);
        }

        @CanIgnoreReturnValue
        public StringBuilder appendTo(StringBuilder sb2, Map<?, ?> map) {
            return appendTo(sb2, (Iterable<? extends Map.Entry<?, ?>>) map.entrySet());
        }

        public String join(Iterable<? extends Map.Entry<?, ?>> iterable) {
            return join(iterable.iterator());
        }

        public MapJoiner useForNull(String str) {
            return new MapJoiner(this.joiner.useForNull(str), this.keyValueSeparator);
        }

        @CanIgnoreReturnValue
        public <A extends Appendable> A appendTo(A a11, Iterable<? extends Map.Entry<?, ?>> iterable) throws IOException {
            return (A) appendTo(a11, iterable.iterator());
        }

        public String join(Iterator<? extends Map.Entry<?, ?>> it) {
            return appendTo(new StringBuilder(), it).toString();
        }

        @CanIgnoreReturnValue
        public <A extends Appendable> A appendTo(A a11, Iterator<? extends Map.Entry<?, ?>> it) throws IOException {
            Preconditions.checkNotNull(a11);
            if (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                a11.append(this.joiner.toString(next.getKey()));
                a11.append(this.keyValueSeparator);
                a11.append(this.joiner.toString(next.getValue()));
                while (it.hasNext()) {
                    a11.append(this.joiner.separator);
                    Map.Entry<?, ?> next2 = it.next();
                    a11.append(this.joiner.toString(next2.getKey()));
                    a11.append(this.keyValueSeparator);
                    a11.append(this.joiner.toString(next2.getValue()));
                }
            }
            return a11;
        }

        @CanIgnoreReturnValue
        public StringBuilder appendTo(StringBuilder sb2, Iterable<? extends Map.Entry<?, ?>> iterable) {
            return appendTo(sb2, iterable.iterator());
        }

        @CanIgnoreReturnValue
        public StringBuilder appendTo(StringBuilder sb2, Iterator<? extends Map.Entry<?, ?>> it) {
            try {
                appendTo(sb2, it);
                return sb2;
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    /* JADX INFO: renamed from: on */
    public static Joiner m13373on(String str) {
        return new Joiner(str);
    }

    @CanIgnoreReturnValue
    public <A extends Appendable> A appendTo(A a11, Iterable<? extends Object> iterable) throws IOException {
        return (A) appendTo(a11, iterable.iterator());
    }

    public final String join(Iterable<? extends Object> iterable) {
        return join(iterable.iterator());
    }

    public MapJoiner withKeyValueSeparator(char c11) {
        return withKeyValueSeparator(String.valueOf(c11));
    }

    private Joiner(String str) {
        this.separator = (String) Preconditions.checkNotNull(str);
    }

    /* JADX INFO: renamed from: on */
    public static Joiner m13372on(char c11) {
        return new Joiner(String.valueOf(c11));
    }

    @CanIgnoreReturnValue
    public <A extends Appendable> A appendTo(A a11, Iterator<? extends Object> it) throws IOException {
        Preconditions.checkNotNull(a11);
        if (it.hasNext()) {
            a11.append(toString(it.next()));
            while (it.hasNext()) {
                a11.append(this.separator);
                a11.append(toString(it.next()));
            }
        }
        return a11;
    }

    public final String join(Iterator<? extends Object> it) {
        return appendTo(new StringBuilder(), it).toString();
    }

    public Joiner skipNulls() {
        return new Joiner(this) { // from class: com.google.common.base.Joiner.2
            @Override // com.google.common.base.Joiner
            public <A extends Appendable> A appendTo(A a11, Iterator<? extends Object> it) throws IOException {
                Preconditions.checkNotNull(a11, "appendable");
                Preconditions.checkNotNull(it, "parts");
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next != null) {
                        a11.append(Joiner.this.toString(next));
                        break;
                    }
                }
                while (it.hasNext()) {
                    Object next2 = it.next();
                    if (next2 != null) {
                        a11.append(Joiner.this.separator);
                        a11.append(Joiner.this.toString(next2));
                    }
                }
                return a11;
            }

            @Override // com.google.common.base.Joiner
            public Joiner useForNull(String str) {
                throw new UnsupportedOperationException("already specified skipNulls");
            }

            @Override // com.google.common.base.Joiner
            public MapJoiner withKeyValueSeparator(String str) {
                throw new UnsupportedOperationException("can't use .skipNulls() with maps");
            }
        };
    }

    public MapJoiner withKeyValueSeparator(String str) {
        return new MapJoiner(str);
    }

    private static Iterable<Object> iterable(final Object obj, final Object obj2, final Object[] objArr) {
        Preconditions.checkNotNull(objArr);
        return new AbstractList<Object>() { // from class: com.google.common.base.Joiner.3
            @Override // java.util.AbstractList, java.util.List
            public Object get(int i11) {
                if (i11 != 0) {
                    return i11 != 1 ? objArr[i11 - 2] : obj2;
                }
                return obj;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return objArr.length + 2;
            }
        };
    }

    public final String join(Object[] objArr) {
        return join(Arrays.asList(objArr));
    }

    public CharSequence toString(Object obj) {
        java.util.Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public Joiner useForNull(final String str) {
        Preconditions.checkNotNull(str);
        return new Joiner(this, this) { // from class: com.google.common.base.Joiner.1
            final /* synthetic */ Joiner this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.base.Joiner
            public Joiner skipNulls() {
                throw new UnsupportedOperationException("already specified useForNull");
            }

            @Override // com.google.common.base.Joiner
            public CharSequence toString(Object obj) {
                return obj == null ? str : this.this$0.toString(obj);
            }

            @Override // com.google.common.base.Joiner
            public Joiner useForNull(String str2) {
                throw new UnsupportedOperationException("already specified useForNull");
            }
        };
    }

    private Joiner(Joiner joiner) {
        this.separator = joiner.separator;
    }

    public final String join(Object obj, Object obj2, Object... objArr) {
        return join(iterable(obj, obj2, objArr));
    }

    @CanIgnoreReturnValue
    public final <A extends Appendable> A appendTo(A a11, Object[] objArr) throws IOException {
        return (A) appendTo(a11, Arrays.asList(objArr));
    }

    @CanIgnoreReturnValue
    public final <A extends Appendable> A appendTo(A a11, Object obj, Object obj2, Object... objArr) throws IOException {
        return (A) appendTo(a11, iterable(obj, obj2, objArr));
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb2, Iterable<? extends Object> iterable) {
        return appendTo(sb2, iterable.iterator());
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb2, Iterator<? extends Object> it) {
        try {
            appendTo(sb2, it);
            return sb2;
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb2, Object[] objArr) {
        return appendTo(sb2, (Iterable<? extends Object>) Arrays.asList(objArr));
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb2, Object obj, Object obj2, Object... objArr) {
        return appendTo(sb2, iterable(obj, obj2, objArr));
    }
}
