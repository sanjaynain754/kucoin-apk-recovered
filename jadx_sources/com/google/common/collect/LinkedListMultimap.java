package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public class LinkedListMultimap<K, V> extends AbstractMultimap<K, V> implements ListMultimap<K, V>, Serializable {

    @J2ktIncompatible
    @GwtIncompatible
    private static final long serialVersionUID = 0;
    private transient Node<K, V> head;
    private transient Map<K, KeyList<K, V>> keyToKeyList;
    private transient int modCount;
    private transient int size;
    private transient Node<K, V> tail;

    public class DistinctKeyIterator implements Iterator<K> {
        Node<K, V> current;
        int expectedModCount;
        Node<K, V> next;
        final Set<K> seenKeys;

        private DistinctKeyIterator() {
            this.seenKeys = Sets.newHashSetWithExpectedSize(LinkedListMultimap.this.keySet().size());
            this.next = LinkedListMultimap.this.head;
            this.expectedModCount = LinkedListMultimap.this.modCount;
        }

        private void checkForConcurrentModification() {
            if (LinkedListMultimap.this.modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            checkForConcurrentModification();
            if (this.next != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public K next() {
            Node<K, V> node;
            checkForConcurrentModification();
            Node<K, V> node2 = this.next;
            if (node2 != null) {
                this.current = node2;
                this.seenKeys.add(node2.key);
                do {
                    node = this.next.next;
                    this.next = node;
                    if (node == null) {
                        break;
                    }
                } while (!this.seenKeys.add(node.key));
                return this.current.key;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z11;
            checkForConcurrentModification();
            if (this.current != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            Preconditions.checkState(z11, "no calls to next() since the last call to remove()");
            LinkedListMultimap.this.removeAllNodes(this.current.key);
            this.current = null;
            this.expectedModCount = LinkedListMultimap.this.modCount;
        }
    }

    public static final class Node<K, V> extends AbstractMapEntry<K, V> {

        @ParametricNullness
        final K key;
        Node<K, V> next;
        Node<K, V> nextSibling;
        Node<K, V> previous;
        Node<K, V> previousSibling;

        @ParametricNullness
        V value;

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getKey() {
            return this.key;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getValue() {
            return this.value;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V setValue(@ParametricNullness V v11) {
            V v12 = this.value;
            this.value = v11;
            return v12;
        }

        public Node(@ParametricNullness K k11, @ParametricNullness V v11) {
            this.key = k11;
            this.value = v11;
        }
    }

    public class NodeIterator implements ListIterator<Map.Entry<K, V>> {
        Node<K, V> current;
        int expectedModCount;
        Node<K, V> next;
        int nextIndex;
        Node<K, V> previous;

        public NodeIterator(int i11) {
            this.expectedModCount = LinkedListMultimap.this.modCount;
            int size = LinkedListMultimap.this.size();
            Preconditions.checkPositionIndex(i11, size);
            if (i11 < size / 2) {
                this.next = LinkedListMultimap.this.head;
                while (true) {
                    int i12 = i11 - 1;
                    if (i11 <= 0) {
                        break;
                    }
                    next();
                    i11 = i12;
                }
            } else {
                this.previous = LinkedListMultimap.this.tail;
                this.nextIndex = size;
                while (true) {
                    int i13 = i11 + 1;
                    if (i11 >= size) {
                        break;
                    }
                    previous();
                    i11 = i13;
                }
            }
            this.current = null;
        }

        private void checkForConcurrentModification() {
            if (LinkedListMultimap.this.modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @CanIgnoreReturnValue
        public Node<K, V> next() {
            checkForConcurrentModification();
            Node<K, V> node = this.next;
            if (node == null) {
                throw new NoSuchElementException();
            }
            this.current = node;
            this.previous = node;
            this.next = node.next;
            this.nextIndex++;
            return node;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.nextIndex;
        }

        @Override // java.util.ListIterator
        @CanIgnoreReturnValue
        public Node<K, V> previous() {
            checkForConcurrentModification();
            Node<K, V> node = this.previous;
            if (node == null) {
                throw new NoSuchElementException();
            }
            this.current = node;
            this.next = node;
            this.previous = node.previous;
            this.nextIndex--;
            return node;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.nextIndex - 1;
        }

        @Override // java.util.ListIterator
        public void set(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public void setValue(@ParametricNullness V v11) {
            Preconditions.checkState(this.current != null);
            this.current.value = v11;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            checkForConcurrentModification();
            if (this.next != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            checkForConcurrentModification();
            if (this.previous != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            boolean z11;
            checkForConcurrentModification();
            if (this.current != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            Preconditions.checkState(z11, "no calls to next() since the last call to remove()");
            Node<K, V> node = this.current;
            if (node != this.next) {
                this.previous = node.previous;
                this.nextIndex--;
            } else {
                this.next = node.next;
            }
            LinkedListMultimap.this.removeNode(node);
            this.current = null;
            this.expectedModCount = LinkedListMultimap.this.modCount;
        }
    }

    public class ValueForKeyIterator implements ListIterator<V> {
        Node<K, V> current;

        @ParametricNullness
        final K key;
        Node<K, V> next;
        int nextIndex;
        Node<K, V> previous;

        public ValueForKeyIterator(K k11) {
            this.key = k11;
            KeyList keyList = (KeyList) LinkedListMultimap.this.keyToKeyList.get(k11);
            this.next = keyList == null ? null : keyList.head;
        }

        @Override // java.util.ListIterator
        public void add(@ParametricNullness V v11) {
            this.previous = LinkedListMultimap.this.addNode(this.key, v11, this.next);
            this.nextIndex++;
            this.current = null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.next != null;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.previous != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @ParametricNullness
        @CanIgnoreReturnValue
        public V next() {
            Node<K, V> node = this.next;
            if (node == null) {
                throw new NoSuchElementException();
            }
            this.current = node;
            this.previous = node;
            this.next = node.nextSibling;
            this.nextIndex++;
            return node.value;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.nextIndex;
        }

        @Override // java.util.ListIterator
        @ParametricNullness
        @CanIgnoreReturnValue
        public V previous() {
            Node<K, V> node = this.previous;
            if (node == null) {
                throw new NoSuchElementException();
            }
            this.current = node;
            this.next = node;
            this.previous = node.previousSibling;
            this.nextIndex--;
            return node.value;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.nextIndex - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            Preconditions.checkState(this.current != null, "no calls to next() since the last call to remove()");
            Node<K, V> node = this.current;
            if (node != this.next) {
                this.previous = node.previousSibling;
                this.nextIndex--;
            } else {
                this.next = node.nextSibling;
            }
            LinkedListMultimap.this.removeNode(node);
            this.current = null;
        }

        @Override // java.util.ListIterator
        public void set(@ParametricNullness V v11) {
            Preconditions.checkState(this.current != null);
            this.current.value = v11;
        }

        public ValueForKeyIterator(K k11, int i11) {
            KeyList keyList = (KeyList) LinkedListMultimap.this.keyToKeyList.get(k11);
            int i12 = keyList == null ? 0 : keyList.count;
            Preconditions.checkPositionIndex(i11, i12);
            if (i11 >= i12 / 2) {
                this.previous = keyList == null ? null : keyList.tail;
                this.nextIndex = i12;
                while (true) {
                    int i13 = i11 + 1;
                    if (i11 >= i12) {
                        break;
                    }
                    previous();
                    i11 = i13;
                }
            } else {
                this.next = keyList == null ? null : keyList.head;
                while (true) {
                    int i14 = i11 - 1;
                    if (i11 <= 0) {
                        break;
                    }
                    next();
                    i11 = i14;
                }
            }
            this.key = k11;
            this.current = null;
        }
    }

    public LinkedListMultimap() {
        this(12);
    }

    public static <K, V> LinkedListMultimap<K, V> create() {
        return new LinkedListMultimap<>();
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        this.head = null;
        this.tail = null;
        this.keyToKeyList.clear();
        this.size = 0;
        this.modCount++;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean put(@ParametricNullness K k11, @ParametricNullness V v11) {
        addNode(k11, v11, null);
        return true;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(Multimap multimap) {
        return super.putAll(multimap);
    }

    public static class KeyList<K, V> {
        int count;
        Node<K, V> head;
        Node<K, V> tail;

        public KeyList(Node<K, V> node) {
            this.head = node;
            this.tail = node;
            node.previousSibling = null;
            node.nextSibling = null;
            this.count = 1;
        }
    }

    private LinkedListMultimap(int i11) {
        this.keyToKeyList = Platform.newHashMapWithExpectedSize(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CanIgnoreReturnValue
    public Node<K, V> addNode(@ParametricNullness K k11, @ParametricNullness V v11, Node<K, V> node) {
        Node<K, V> node2 = new Node<>(k11, v11);
        if (this.head == null) {
            this.tail = node2;
            this.head = node2;
            this.keyToKeyList.put(k11, new KeyList<>(node2));
            this.modCount++;
        } else if (node == null) {
            Node<K, V> node3 = this.tail;
            Objects.requireNonNull(node3);
            node3.next = node2;
            node2.previous = this.tail;
            this.tail = node2;
            KeyList<K, V> keyList = this.keyToKeyList.get(k11);
            if (keyList == null) {
                this.keyToKeyList.put(k11, new KeyList<>(node2));
                this.modCount++;
            } else {
                keyList.count++;
                Node<K, V> node4 = keyList.tail;
                node4.nextSibling = node2;
                node2.previousSibling = node4;
                keyList.tail = node2;
            }
        } else {
            KeyList<K, V> keyList2 = this.keyToKeyList.get(k11);
            Objects.requireNonNull(keyList2);
            keyList2.count++;
            node2.previous = node.previous;
            node2.previousSibling = node.previousSibling;
            node2.next = node;
            node2.nextSibling = node;
            Node<K, V> node5 = node.previousSibling;
            if (node5 == null) {
                keyList2.head = node2;
            } else {
                node5.nextSibling = node2;
            }
            Node<K, V> node6 = node.previous;
            if (node6 == null) {
                this.head = node2;
            } else {
                node6.next = node2;
            }
            node.previous = node2;
            node.previousSibling = node2;
        }
        this.size++;
        return node2;
    }

    public static <K, V> LinkedListMultimap<K, V> create(int i11) {
        return new LinkedListMultimap<>(i11);
    }

    private List<V> getCopy(@ParametricNullness K k11) {
        return Collections.unmodifiableList(Lists.newArrayList(new ValueForKeyIterator(k11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAllNodes(@ParametricNullness K k11) {
        Iterators.clear(new ValueForKeyIterator(k11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNode(Node<K, V> node) {
        Node<K, V> node2 = node.previous;
        if (node2 != null) {
            node2.next = node.next;
        } else {
            this.head = node.next;
        }
        Node<K, V> node3 = node.next;
        if (node3 != null) {
            node3.previous = node2;
        } else {
            this.tail = node2;
        }
        if (node.previousSibling == null && node.nextSibling == null) {
            KeyList<K, V> keyListRemove = this.keyToKeyList.remove(node.key);
            Objects.requireNonNull(keyListRemove);
            keyListRemove.count = 0;
            this.modCount++;
        } else {
            KeyList<K, V> keyList = this.keyToKeyList.get(node.key);
            Objects.requireNonNull(keyList);
            keyList.count--;
            Node<K, V> node4 = node.previousSibling;
            if (node4 == null) {
                Node<K, V> node5 = node.nextSibling;
                Objects.requireNonNull(node5);
                keyList.head = node5;
            } else {
                node4.nextSibling = node.nextSibling;
            }
            Node<K, V> node6 = node.nextSibling;
            if (node6 == null) {
                Node<K, V> node7 = node.previousSibling;
                Objects.requireNonNull(node7);
                keyList.tail = node7;
            } else {
                node6.previousSibling = node.previousSibling;
            }
        }
        this.size--;
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(Object obj) {
        return this.keyToKeyList.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Map<K, Collection<V>> createAsMap() {
        return new Multimaps.AsMap(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public List<Map.Entry<K, V>> createEntries() {
        return new AbstractSequentialList<Map.Entry<K, V>>() { // from class: com.google.common.collect.LinkedListMultimap.1EntriesImpl
            @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
            public ListIterator<Map.Entry<K, V>> listIterator(int i11) {
                return new NodeIterator(i11);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return LinkedListMultimap.this.size;
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Set<K> createKeySet() {
        return new Sets.ImprovedAbstractSet<K>() { // from class: com.google.common.collect.LinkedListMultimap.1KeySetImpl
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return LinkedListMultimap.this.containsKey(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<K> iterator() {
                return new DistinctKeyIterator();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                return !LinkedListMultimap.this.removeAll(obj).isEmpty();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return LinkedListMultimap.this.keyToKeyList.size();
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Multiset<K> createKeys() {
        return new Multimaps.Keys(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public List<V> createValues() {
        return new AbstractSequentialList<V>() { // from class: com.google.common.collect.LinkedListMultimap.1ValuesImpl
            @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
            public ListIterator<V> listIterator(int i11) {
                final NodeIterator nodeIterator = new NodeIterator(i11);
                return new TransformedListIterator<Map.Entry<K, V>, V>(this, nodeIterator) { // from class: com.google.common.collect.LinkedListMultimap.1ValuesImpl.1
                    final /* synthetic */ C1ValuesImpl this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override // com.google.common.collect.TransformedListIterator, java.util.ListIterator
                    public void set(@ParametricNullness V v11) {
                        nodeIterator.setValue(v11);
                    }

                    @Override // com.google.common.collect.TransformedIterator
                    @ParametricNullness
                    public V transform(Map.Entry<K, V> entry) {
                        return entry.getValue();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return LinkedListMultimap.this.size;
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public List<Map.Entry<K, V>> entries() {
        return (List) super.entries();
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Iterator<Map.Entry<K, V>> entryIterator() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public List<V> get(@ParametricNullness final K k11) {
        return new AbstractSequentialList<V>(this) { // from class: com.google.common.collect.LinkedListMultimap.1
            final /* synthetic */ LinkedListMultimap this$0;

            {
                this.this$0 = this;
            }

            @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
            public ListIterator<V> listIterator(int i11) {
                return new ValueForKeyIterator(k11, i11);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                KeyList keyList = (KeyList) this.this$0.keyToKeyList.get(k11);
                if (keyList == null) {
                    return 0;
                }
                return keyList.count;
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean isEmpty() {
        return this.head == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(@ParametricNullness Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public List<V> removeAll(Object obj) {
        List<V> copy = getCopy(obj);
        removeAllNodes(obj);
        return copy;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public List<V> replaceValues(@ParametricNullness K k11, Iterable<? extends V> iterable) {
        List<V> copy = getCopy(k11);
        ValueForKeyIterator valueForKeyIterator = new ValueForKeyIterator(k11);
        Iterator<? extends V> it = iterable.iterator();
        while (valueForKeyIterator.hasNext() && it.hasNext()) {
            valueForKeyIterator.next();
            valueForKeyIterator.set(it.next());
        }
        while (valueForKeyIterator.hasNext()) {
            valueForKeyIterator.next();
            valueForKeyIterator.remove();
        }
        while (it.hasNext()) {
            valueForKeyIterator.add(it.next());
        }
        return copy;
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public List<V> values() {
        return (List) super.values();
    }

    public static <K, V> LinkedListMultimap<K, V> create(Multimap<? extends K, ? extends V> multimap) {
        return new LinkedListMultimap<>(multimap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.keyToKeyList = CompactLinkedHashMap.create();
        int i11 = objectInputStream.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        for (Map.Entry<K, V> entry : entries()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Multiset keys() {
        return super.keys();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    private LinkedListMultimap(Multimap<? extends K, ? extends V> multimap) {
        this(multimap.keySet().size());
        putAll(multimap);
    }
}
