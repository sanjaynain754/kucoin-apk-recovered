package p852kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.AbstractIterator;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ArrayMap.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayMap.kt\norg/jetbrains/kotlin/util/ArrayMapImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n11408#2,11:146\n13537#2,2:157\n13539#2:160\n11419#2:161\n1#3:159\n*S KotlinDebug\n*F\n+ 1 ArrayMap.kt\norg/jetbrains/kotlin/util/ArrayMapImpl\n*L\n140#1:146,11\n140#1:157,2\n140#1:160\n140#1:161\n140#1:159\n*E\n"})
public final class ArrayMapImpl<T> extends ArrayMap<T> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private Object[] data;
    private int size;

    /* JADX INFO: compiled from: ArrayMap.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private ArrayMapImpl(Object[] objArr, int i11) {
        super(null);
        this.data = objArr;
        this.size = i11;
    }

    private final void ensureCapacity(int i11) {
        Object[] objArr = this.data;
        if (objArr.length > i11) {
            return;
        }
        int length = objArr.length;
        do {
            length *= 2;
        } while (length <= i11);
        Object[] objArrCopyOf = Arrays.copyOf(this.data, length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        this.data = objArrCopyOf;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.util.ArrayMap
    @Nullable
    public T get(int i11) {
        return (T) ArraysKt.getOrNull(this.data, i11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public int getSize() {
        return this.size;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return new AbstractIterator<T>(this) { // from class: kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl.iterator.1
            private int index = -1;
            final /* synthetic */ ArrayMapImpl<T> this$0;

            {
                this.this$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p852kotlin.collections.AbstractIterator
            public void computeNext() {
                do {
                    int i11 = this.index + 1;
                    this.index = i11;
                    if (i11 >= ((ArrayMapImpl) this.this$0).data.length) {
                        break;
                    }
                } while (((ArrayMapImpl) this.this$0).data[this.index] == null);
                if (this.index >= ((ArrayMapImpl) this.this$0).data.length) {
                    done();
                    return;
                }
                Object obj = ((ArrayMapImpl) this.this$0).data[this.index];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
                setNext(obj);
            }
        };
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public void set(int i11, @NotNull T value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ensureCapacity(i11);
        if (this.data[i11] == null) {
            this.size = getSize() + 1;
        }
        this.data[i11] = value;
    }

    public ArrayMapImpl() {
        this(new Object[20], 0);
    }
}
