package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class SortedLists {

    public enum KeyAbsentBehavior {
        NEXT_LOWER { // from class: com.google.common.collect.SortedLists.KeyAbsentBehavior.1
            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            public int resultIndex(int i11) {
                return i11 - 1;
            }
        },
        NEXT_HIGHER { // from class: com.google.common.collect.SortedLists.KeyAbsentBehavior.2
            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            public int resultIndex(int i11) {
                return i11;
            }
        },
        INVERTED_INSERTION_INDEX { // from class: com.google.common.collect.SortedLists.KeyAbsentBehavior.3
            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            public int resultIndex(int i11) {
                return ~i11;
            }
        };

        public abstract int resultIndex(int i11);
    }

    public enum KeyPresentBehavior {
        ANY_PRESENT { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.1
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, @ParametricNullness E e11, List<? extends E> list, int i11) {
                return i11;
            }
        },
        LAST_PRESENT { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, @ParametricNullness E e11, List<? extends E> list, int i11) {
                int size = list.size() - 1;
                while (i11 < size) {
                    int i12 = ((i11 + size) + 1) >>> 1;
                    if (comparator.compare(list.get(i12), e11) > 0) {
                        size = i12 - 1;
                    } else {
                        i11 = i12;
                    }
                }
                return i11;
            }
        },
        FIRST_PRESENT { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, @ParametricNullness E e11, List<? extends E> list, int i11) {
                int i12 = 0;
                while (i12 < i11) {
                    int i13 = (i12 + i11) >>> 1;
                    if (comparator.compare(list.get(i13), e11) < 0) {
                        i12 = i13 + 1;
                    } else {
                        i11 = i13;
                    }
                }
                return i12;
            }
        },
        FIRST_AFTER { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.4
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, @ParametricNullness E e11, List<? extends E> list, int i11) {
                return KeyPresentBehavior.LAST_PRESENT.resultIndex(comparator, e11, list, i11) + 1;
            }
        },
        LAST_BEFORE { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.5
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, @ParametricNullness E e11, List<? extends E> list, int i11) {
                return KeyPresentBehavior.FIRST_PRESENT.resultIndex(comparator, e11, list, i11) - 1;
            }
        };

        public abstract <E> int resultIndex(Comparator<? super E> comparator, @ParametricNullness E e11, List<? extends E> list, int i11);
    }

    public static <E extends Comparable> int binarySearch(List<? extends E> list, E e11, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        Preconditions.checkNotNull(e11);
        return binarySearch(list, e11, Ordering.natural(), keyPresentBehavior, keyAbsentBehavior);
    }

    private SortedLists() {
    }

    public static <E, K extends Comparable> int binarySearch(List<E> list, Function<? super E, K> function, K k11, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        Preconditions.checkNotNull(k11);
        return binarySearch(list, function, k11, Ordering.natural(), keyPresentBehavior, keyAbsentBehavior);
    }

    public static <E, K> int binarySearch(List<E> list, Function<? super E, K> function, @ParametricNullness K k11, Comparator<? super K> comparator, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        return binarySearch((List<? extends K>) Lists.transform(list, function), k11, comparator, keyPresentBehavior, keyAbsentBehavior);
    }

    public static <E> int binarySearch(List<? extends E> list, @ParametricNullness E e11, Comparator<? super E> comparator, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(keyPresentBehavior);
        Preconditions.checkNotNull(keyAbsentBehavior);
        if (!(list instanceof RandomAccess)) {
            list = new ArrayList(list);
        }
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int iCompare = comparator.compare(e11, list.get(i12));
            if (iCompare < 0) {
                size = i12 - 1;
            } else {
                if (iCompare <= 0) {
                    return i11 + keyPresentBehavior.resultIndex(comparator, e11, list.subList(i11, size + 1), i12 - i11);
                }
                i11 = i12 + 1;
            }
        }
        return keyAbsentBehavior.resultIndex(i11);
    }
}
