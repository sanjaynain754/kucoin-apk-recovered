package p852kotlin.sequences;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B-\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lkotlin/sequences/GeneratorSequence;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/sequences/Sequence;", "getInitialValue", "Lkotlin/Function0;", "getNextValue", "Lkotlin/Function1;", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
final class GeneratorSequence<T> implements Sequence<T> {

    @NotNull
    private final Function0<T> getInitialValue;

    @NotNull
    private final Function1<T, T> getNextValue;

    /* JADX INFO: renamed from: kotlin.sequences.GeneratorSequence$iterator$1 */
    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0004J\t\u0010\u0011\u001a\u00020\u0012H\u0096\u0002R\u001e\u0010\u0002\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0007\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0013"}, m90084d2 = {"kotlin/sequences/GeneratorSequence$iterator$1", "", "nextItem", "getNextItem", "()Ljava/lang/Object;", "setNextItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "nextState", "", "getNextState", "()I", "setNextState", "(I)V", "calcNext", "", "next", "hasNext", "", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C414581 implements Iterator<T>, KMappedMarker {
        private T nextItem;
        private int nextState = -2;
        final /* synthetic */ GeneratorSequence<T> this$0;

        public C414581(GeneratorSequence<T> generatorSequence) {
            this.this$0 = generatorSequence;
        }

        private final void calcNext() {
            T t11;
            if (this.nextState == -2) {
                t11 = (T) ((GeneratorSequence) this.this$0).getInitialValue.invoke();
            } else {
                Function1 function1 = ((GeneratorSequence) this.this$0).getNextValue;
                T t12 = this.nextItem;
                Intrinsics.checkNotNull(t12);
                t11 = (T) function1.invoke(t12);
            }
            this.nextItem = t11;
            this.nextState = t11 == null ? 0 : 1;
        }

        public final T getNextItem() {
            return this.nextItem;
        }

        public final int getNextState() {
            return this.nextState;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextState < 0) {
                calcNext();
            }
            return this.nextState == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.nextState < 0) {
                calcNext();
            }
            if (this.nextState == 0) {
                throw new NoSuchElementException();
            }
            T t11 = this.nextItem;
            Intrinsics.checkNotNull(t11, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.nextState = -1;
            return t11;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setNextItem(T t11) {
            this.nextItem = t11;
        }

        public final void setNextState(int i11) {
            this.nextState = i11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GeneratorSequence(@NotNull Function0<? extends T> getInitialValue, @NotNull Function1<? super T, ? extends T> getNextValue) {
        Intrinsics.checkNotNullParameter(getInitialValue, "getInitialValue");
        Intrinsics.checkNotNullParameter(getNextValue, "getNextValue");
        this.getInitialValue = getInitialValue;
        this.getNextValue = getNextValue;
    }

    @Override // p852kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new C414581(this);
    }
}
