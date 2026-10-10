package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.InlineMe;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class Converter<A, B> implements Function<A, B> {
    private final boolean handleNullAutomatically;

    @RetainedWith
    @LazyInit
    private transient Converter<B, A> reverse;

    public static final class ConverterComposition<A, B, C> extends Converter<A, C> implements Serializable {
        private static final long serialVersionUID = 0;
        final Converter<A, B> first;
        final Converter<B, C> second;

        @Override // com.google.common.base.Converter
        public A correctedDoBackward(C c11) {
            return (A) this.first.correctedDoBackward(this.second.correctedDoBackward(c11));
        }

        @Override // com.google.common.base.Converter
        public C correctedDoForward(A a11) {
            return (C) this.second.correctedDoForward(this.first.correctedDoForward(a11));
        }

        @Override // com.google.common.base.Converter
        public A doBackward(C c11) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter
        public C doForward(A a11) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof ConverterComposition) {
                ConverterComposition converterComposition = (ConverterComposition) obj;
                if (this.first.equals(converterComposition.first) && this.second.equals(converterComposition.second)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.first.hashCode() * 31) + this.second.hashCode();
        }

        public String toString() {
            return this.first + ".andThen(" + this.second + ")";
        }

        public ConverterComposition(Converter<A, B> converter, Converter<B, C> converter2) {
            this.first = converter;
            this.second = converter2;
        }
    }

    public static final class FunctionBasedConverter<A, B> extends Converter<A, B> implements Serializable {
        private final Function<? super B, ? extends A> backwardFunction;
        private final Function<? super A, ? extends B> forwardFunction;

        private FunctionBasedConverter(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
            this.forwardFunction = (Function) Preconditions.checkNotNull(function);
            this.backwardFunction = (Function) Preconditions.checkNotNull(function2);
        }

        @Override // com.google.common.base.Converter
        public A doBackward(B b11) {
            return this.backwardFunction.apply(b11);
        }

        @Override // com.google.common.base.Converter
        public B doForward(A a11) {
            return this.forwardFunction.apply(a11);
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof FunctionBasedConverter) {
                FunctionBasedConverter functionBasedConverter = (FunctionBasedConverter) obj;
                if (this.forwardFunction.equals(functionBasedConverter.forwardFunction) && this.backwardFunction.equals(functionBasedConverter.backwardFunction)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.forwardFunction.hashCode() * 31) + this.backwardFunction.hashCode();
        }

        public String toString() {
            return "Converter.from(" + this.forwardFunction + ", " + this.backwardFunction + ")";
        }
    }

    public static final class IdentityConverter<T> extends Converter<T, T> implements Serializable {
        static final Converter<?, ?> INSTANCE = new IdentityConverter();
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Converter
        public IdentityConverter<T> reverse() {
            return this;
        }

        private Object readResolve() {
            return INSTANCE;
        }

        @Override // com.google.common.base.Converter
        public <S> Converter<T, S> doAndThen(Converter<T, S> converter) {
            return (Converter) Preconditions.checkNotNull(converter, "otherConverter");
        }

        public String toString() {
            return "Converter.identity()";
        }

        private IdentityConverter() {
        }

        @Override // com.google.common.base.Converter
        public T doBackward(T t11) {
            return t11;
        }

        @Override // com.google.common.base.Converter
        public T doForward(T t11) {
            return t11;
        }
    }

    public static final class ReverseConverter<A, B> extends Converter<B, A> implements Serializable {
        private static final long serialVersionUID = 0;
        final Converter<A, B> original;

        @Override // com.google.common.base.Converter
        public B correctedDoBackward(A a11) {
            return this.original.correctedDoForward(a11);
        }

        @Override // com.google.common.base.Converter
        public A correctedDoForward(B b11) {
            return this.original.correctedDoBackward(b11);
        }

        @Override // com.google.common.base.Converter
        public B doBackward(A a11) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter
        public A doForward(B b11) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof ReverseConverter) {
                return this.original.equals(((ReverseConverter) obj).original);
            }
            return false;
        }

        public int hashCode() {
            return ~this.original.hashCode();
        }

        @Override // com.google.common.base.Converter
        public Converter<A, B> reverse() {
            return this.original;
        }

        public String toString() {
            return this.original + ".reverse()";
        }

        public ReverseConverter(Converter<A, B> converter) {
            this.original = converter;
        }
    }

    public Converter() {
        this(true);
    }

    @ForOverride
    public abstract A doBackward(B b11);

    @ForOverride
    public abstract B doForward(A a11);

    public Converter(boolean z11) {
        this.handleNullAutomatically = z11;
    }

    public static <A, B> Converter<A, B> from(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
        return new FunctionBasedConverter(function, function2);
    }

    public static <T> Converter<T, T> identity() {
        return (IdentityConverter) IdentityConverter.INSTANCE;
    }

    public Iterable<B> convertAll(final Iterable<? extends A> iterable) {
        Preconditions.checkNotNull(iterable, "fromIterable");
        return new Iterable<B>(this) { // from class: com.google.common.base.Converter.1
            final /* synthetic */ Converter this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Iterable
            public Iterator<B> iterator() {
                return new Iterator<B>() { // from class: com.google.common.base.Converter.1.1
                    private final Iterator<? extends A> fromIterator;

                    {
                        this.fromIterator = iterable.iterator();
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return this.fromIterator.hasNext();
                    }

                    @Override // java.util.Iterator
                    public B next() {
                        return (B) C79741.this.this$0.convert(this.fromIterator.next());
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        this.fromIterator.remove();
                    }
                };
            }
        };
    }

    public A correctedDoBackward(B b11) {
        if (!this.handleNullAutomatically) {
            return unsafeDoBackward(b11);
        }
        if (b11 == null) {
            return null;
        }
        return (A) Preconditions.checkNotNull(doBackward(b11));
    }

    public B correctedDoForward(A a11) {
        if (!this.handleNullAutomatically) {
            return unsafeDoForward(a11);
        }
        if (a11 == null) {
            return null;
        }
        return (B) Preconditions.checkNotNull(doForward(a11));
    }

    public <C> Converter<A, C> doAndThen(Converter<B, C> converter) {
        return new ConverterComposition(this, (Converter) Preconditions.checkNotNull(converter));
    }

    @CheckReturnValue
    public Converter<B, A> reverse() {
        Converter<B, A> converter = this.reverse;
        if (converter != null) {
            return converter;
        }
        ReverseConverter reverseConverter = new ReverseConverter(this);
        this.reverse = reverseConverter;
        return reverseConverter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private A unsafeDoBackward(B b11) {
        return (A) doBackward(NullnessCasts.uncheckedCastNullableTToT(b11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private B unsafeDoForward(A a11) {
        return (B) doForward(NullnessCasts.uncheckedCastNullableTToT(a11));
    }

    public final <C> Converter<A, C> andThen(Converter<B, C> converter) {
        return doAndThen(converter);
    }

    @Override // com.google.common.base.Function
    @InlineMe(replacement = "this.convert(a)")
    @Deprecated
    public final B apply(A a11) {
        return convert(a11);
    }

    public final B convert(A a11) {
        return correctedDoForward(a11);
    }

    @Override // com.google.common.base.Function
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
