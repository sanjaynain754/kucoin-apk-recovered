package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Predicate;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public class AppendOnlyLinkedArrayList<T> {
    final int capacity;
    final Object[] head;
    int offset;
    Object[] tail;

    /* JADX INFO: loaded from: classes23.dex */
    public interface NonThrowingPredicate<T> extends Predicate<T> {
        @Override // io.reactivex.functions.Predicate
        boolean test(T t11);
    }

    public <U> boolean accept(InterfaceC44417c<? super U> interfaceC44417c) {
        Object[] objArr = this.head;
        int i11 = this.capacity;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                Object[] objArr2 = objArr[i12];
                if (objArr2 == null) {
                    break;
                }
                if (NotificationLite.acceptFull(objArr2, interfaceC44417c)) {
                    return true;
                }
            }
            objArr = objArr[i11];
        }
    }

    public void forEachWhile(NonThrowingPredicate<? super T> nonThrowingPredicate) {
        int i11 = this.capacity;
        for (Object[] objArr = this.head; objArr != null; objArr = (Object[]) objArr[i11]) {
            for (int i12 = 0; i12 < i11; i12++) {
                Object obj = objArr[i12];
                if (obj == null) {
                    break;
                } else {
                    if (nonThrowingPredicate.test(obj)) {
                        return;
                    }
                }
            }
        }
    }

    public void add(T t11) {
        int i11 = this.capacity;
        int i12 = this.offset;
        if (i12 == i11) {
            Object[] objArr = new Object[i11 + 1];
            this.tail[i11] = objArr;
            this.tail = objArr;
            i12 = 0;
        }
        this.tail[i12] = t11;
        this.offset = i12 + 1;
    }

    public void setFirst(T t11) {
        this.head[0] = t11;
    }

    public AppendOnlyLinkedArrayList(int i11) {
        this.capacity = i11;
        Object[] objArr = new Object[i11 + 1];
        this.head = objArr;
        this.tail = objArr;
    }

    public <U> boolean accept(Observer<? super U> observer) {
        Object[] objArr = this.head;
        int i11 = this.capacity;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                Object[] objArr2 = objArr[i12];
                if (objArr2 == null) {
                    break;
                }
                if (NotificationLite.acceptFull(objArr2, observer)) {
                    return true;
                }
            }
            objArr = objArr[i11];
        }
    }

    public <S> void forEachWhile(S s11, BiPredicate<? super S, ? super T> biPredicate) throws Exception {
        Object[] objArr = this.head;
        int i11 = this.capacity;
        while (true) {
            for (int i12 = 0; i12 < i11; i12++) {
                Object obj = objArr[i12];
                if (obj == null || biPredicate.test(s11, obj)) {
                    return;
                }
            }
            objArr = (Object[]) objArr[i11];
        }
    }
}
