package androidx.media3.common.util;

import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class CopyOnWriteMultiset<E> implements Iterable<E> {
    private final Object lock = new Object();

    @GuardedBy("lock")
    private final Map<E, Integer> elementCounts = new HashMap();

    @GuardedBy("lock")
    private Set<E> elementSet = Collections.EMPTY_SET;

    @GuardedBy("lock")
    private List<E> elements = Collections.EMPTY_LIST;

    public void add(E e11) {
        synchronized (this.lock) {
            try {
                ArrayList arrayList = new ArrayList(this.elements);
                arrayList.add(e11);
                this.elements = Collections.unmodifiableList(arrayList);
                Integer num = this.elementCounts.get(e11);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.elementSet);
                    hashSet.add(e11);
                    this.elementSet = Collections.unmodifiableSet(hashSet);
                }
                this.elementCounts.put(e11, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int count(E e11) {
        int iIntValue;
        synchronized (this.lock) {
            try {
                iIntValue = this.elementCounts.containsKey(e11) ? this.elementCounts.get(e11).intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    public Set<E> elementSet() {
        Set<E> set;
        synchronized (this.lock) {
            set = this.elementSet;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.lock) {
            it = this.elements.iterator();
        }
        return it;
    }

    public void remove(E e11) {
        synchronized (this.lock) {
            try {
                Integer num = this.elementCounts.get(e11);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.elements);
                arrayList.remove(e11);
                this.elements = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.elementCounts.remove(e11);
                    HashSet hashSet = new HashSet(this.elementSet);
                    hashSet.remove(e11);
                    this.elementSet = Collections.unmodifiableSet(hashSet);
                } else {
                    this.elementCounts.put(e11, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
