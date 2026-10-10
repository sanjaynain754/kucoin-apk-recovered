package io.reactivex.internal.util;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes60.dex */
public class LinkedArrayList {
    final int capacityHint;
    Object[] head;
    int indexInTail;
    volatile int size;
    Object[] tail;

    public void add(Object obj) {
        if (this.size == 0) {
            Object[] objArr = new Object[this.capacityHint + 1];
            this.head = objArr;
            this.tail = objArr;
            objArr[0] = obj;
            this.indexInTail = 1;
            this.size = 1;
            return;
        }
        int i11 = this.indexInTail;
        int i12 = this.capacityHint;
        if (i11 != i12) {
            this.tail[i11] = obj;
            this.indexInTail = i11 + 1;
            this.size++;
        } else {
            Object[] objArr2 = new Object[i12 + 1];
            objArr2[0] = obj;
            this.tail[i12] = objArr2;
            this.tail = objArr2;
            this.indexInTail = 1;
            this.size++;
        }
    }

    public Object[] head() {
        return this.head;
    }

    public int size() {
        return this.size;
    }

    public String toString() {
        int i11 = this.capacityHint;
        int i12 = this.size;
        ArrayList arrayList = new ArrayList(i12 + 1);
        Object[] objArrHead = head();
        int i13 = 0;
        int i14 = 0;
        while (i13 < i12) {
            arrayList.add(objArrHead[i14]);
            i13++;
            i14++;
            if (i14 == i11) {
                objArrHead = (Object[]) objArrHead[i11];
                i14 = 0;
            }
        }
        return arrayList.toString();
    }

    public LinkedArrayList(int i11) {
        this.capacityHint = i11;
    }
}
