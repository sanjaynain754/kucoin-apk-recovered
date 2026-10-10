package com.jumio.core.util;

import androidx.exifinterface.media.ExifInterface;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.CollectionToArray;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.markers.KMutableList;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u0010\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016J\u001e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016J\u0016\u0010\u0014\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016J\u0016\u0010\u0015\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u001e\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0019J\u001d\u0010\u000b\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aJ\u0015\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\u001cJ\u0016\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\bH\u0096\u0002¢\u0006\u0002\u0010\u001cJ\b\u0010\u001e\u001a\u00020\fH\u0016J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0096\u0002J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"2\u0006\u0010\u0013\u001a\u00020\bH\u0016J\u0015\u0010#\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010$J\u0015\u0010%\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010$J\u0016\u0010&\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016J\u0016\u0010'\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\bH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006+"}, m90084d2 = {"Lcom/jumio/core/util/ConcurrentMutableList;", ExifInterface.GPS_DIRECTION_TRUE, "", "Ljava/io/Serializable;", "<init>", "()V", "delegate", "size", "", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "remove", "addAll", "elements", "", "index", "removeAll", "retainAll", "clear", "", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "(ILjava/lang/Object;)V", "removeAt", "(I)Ljava/lang/Object;", "get", "isEmpty", "iterator", "", "listIterator", "", "lastIndexOf", "(Ljava/lang/Object;)I", "indexOf", "containsAll", "contains", "subList", "fromIndex", "toIndex", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ConcurrentMutableList<T> implements List<T>, Serializable, KMutableList {

    /* JADX INFO: renamed from: a */
    public final ArrayList f14579a = new ArrayList();

    @Override // java.util.List, java.util.Collection
    public boolean add(T element) {
        boolean zAdd;
        synchronized (this.f14579a) {
            zAdd = this.f14579a.add(element);
        }
        return zAdd;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(@NotNull Collection<? extends T> elements) {
        boolean zAddAll;
        Intrinsics.checkNotNullParameter(elements, "elements");
        synchronized (this.f14579a) {
            zAddAll = this.f14579a.addAll(elements);
        }
        return zAddAll;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<T> listIterator() {
        ListIterator<T> listIterator;
        synchronized (this.f14579a) {
            listIterator = this.f14579a.listIterator();
        }
        return listIterator;
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i11) {
        return removeAt(i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        synchronized (this.f14579a) {
            this.f14579a.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        boolean zContains;
        synchronized (this.f14579a) {
            zContains = this.f14579a.contains(element);
        }
        return zContains;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<?> elements) {
        boolean zContainsAll;
        Intrinsics.checkNotNullParameter(elements, "elements");
        synchronized (this.f14579a) {
            zContainsAll = this.f14579a.containsAll(elements);
        }
        return zContainsAll;
    }

    @Override // java.util.List
    public T get(int index) {
        T t11;
        synchronized (this.f14579a) {
            t11 = (T) this.f14579a.get(index);
        }
        return t11;
    }

    public int getSize() {
        int size;
        synchronized (this.f14579a) {
            size = this.f14579a.size();
        }
        return size;
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        int iIndexOf;
        synchronized (this.f14579a) {
            iIndexOf = this.f14579a.indexOf(element);
        }
        return iIndexOf;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f14579a) {
            zIsEmpty = this.f14579a.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        Iterator<T> it;
        synchronized (this.f14579a) {
            it = this.f14579a.iterator();
        }
        return it;
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        int iLastIndexOf;
        synchronized (this.f14579a) {
            iLastIndexOf = this.f14579a.lastIndexOf(element);
        }
        return iLastIndexOf;
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object element) {
        boolean zRemove;
        synchronized (this.f14579a) {
            zRemove = this.f14579a.remove(element);
        }
        return zRemove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(@NotNull Collection<?> elements) {
        boolean zRemoveAll;
        Intrinsics.checkNotNullParameter(elements, "elements");
        synchronized (this.f14579a) {
            zRemoveAll = this.f14579a.removeAll(elements);
        }
        return zRemoveAll;
    }

    public T removeAt(int index) {
        T t11;
        synchronized (this.f14579a) {
            t11 = (T) this.f14579a.remove(index);
        }
        return t11;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@NotNull Collection<?> elements) {
        boolean zRetainAll;
        Intrinsics.checkNotNullParameter(elements, "elements");
        synchronized (this.f14579a) {
            zRetainAll = this.f14579a.retainAll(elements);
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public T set(int index, T element) {
        T t11;
        synchronized (this.f14579a) {
            t11 = (T) this.f14579a.set(index, element);
        }
        return t11;
    }

    @Override // java.util.List
    @NotNull
    public List<T> subList(int fromIndex, int toIndex) {
        List<T> listSubList;
        synchronized (this.f14579a) {
            listSubList = this.f14579a.subList(fromIndex, toIndex);
        }
        return listSubList;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void add(int index, T element) {
        synchronized (this.f14579a) {
            this.f14579a.add(index, element);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // java.util.List
    public boolean addAll(int index, @NotNull Collection<? extends T> elements) {
        boolean zAddAll;
        Intrinsics.checkNotNullParameter(elements, "elements");
        synchronized (this.f14579a) {
            zAddAll = this.f14579a.addAll(index, elements);
        }
        return zAddAll;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<T> listIterator(int index) {
        ListIterator<T> listIterator;
        synchronized (this.f14579a) {
            listIterator = this.f14579a.listIterator(index);
        }
        return listIterator;
    }
}
