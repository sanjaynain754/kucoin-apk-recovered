package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.google.common.collect.AbstractSequentialIterator;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.primitives.Ints;
import com.google.common.util.concurrent.ExecutionError;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.google.common.util.concurrent.Uninterruptibles;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import com.tencent.bugly.proguard.C33978va;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible(emulated = true)
class LocalCache<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    static final int CONTAINS_VALUE_RETRIES = 3;
    static final int DRAIN_MAX = 16;
    static final int DRAIN_THRESHOLD = 63;
    static final int MAXIMUM_CAPACITY = 1073741824;
    static final int MAX_SEGMENTS = 65536;
    final int concurrencyLevel;
    final CacheLoader<? super K, V> defaultLoader;
    final EntryFactory entryFactory;

    @RetainedWith
    @LazyInit
    Set<Map.Entry<K, V>> entrySet;
    final long expireAfterAccessNanos;
    final long expireAfterWriteNanos;
    final AbstractCache.StatsCounter globalStatsCounter;
    final Equivalence<Object> keyEquivalence;

    @RetainedWith
    @LazyInit
    Set<K> keySet;
    final Strength keyStrength;
    final long maxWeight;
    final long refreshNanos;
    final RemovalListener<K, V> removalListener;
    final Queue<RemovalNotification<K, V>> removalNotificationQueue;
    final int segmentMask;
    final int segmentShift;
    final Segment<K, V>[] segments;
    final Ticker ticker;
    final Equivalence<Object> valueEquivalence;
    final Strength valueStrength;

    @RetainedWith
    @LazyInit
    Collection<V> values;
    final Weigher<K, V> weigher;
    static final Logger logger = Logger.getLogger(LocalCache.class.getName());
    static final ValueReference<Object, Object> UNSET = new ValueReference<Object, Object>() { // from class: com.google.common.cache.LocalCache.1
        @Override // com.google.common.cache.LocalCache.ValueReference
        public Object get() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<Object, Object> getEntry() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 0;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public Object waitForValue() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(Object obj) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<Object, Object> copyFor(ReferenceQueue<Object> referenceQueue, Object obj, ReferenceEntry<Object, Object> referenceEntry) {
            return this;
        }
    };
    static final Queue<?> DISCARDING_QUEUE = new AbstractQueue<Object>() { // from class: com.google.common.cache.LocalCache.2
        @Override // java.util.Queue
        public boolean offer(Object obj) {
            return true;
        }

        @Override // java.util.Queue
        public Object peek() {
            return null;
        }

        @Override // java.util.Queue
        public Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return ImmutableSet.m13487of().iterator();
        }
    };

    public abstract class AbstractCacheSet<T> extends AbstractSet<T> {
        public AbstractCacheSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() throws Throwable {
            LocalCache.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return LocalCache.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LocalCache.this.size();
        }
    }

    public static abstract class AbstractReferenceEntry<K, V> implements ReferenceEntry<K, V> {
        @Override // com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public K getKey() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNext() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ValueReference<K, V> getValueReference() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(ValueReference<K, V> valueReference) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j11) {
            throw new UnsupportedOperationException();
        }
    }

    public static final class AccessQueue<K, V> extends AbstractQueue<ReferenceEntry<K, V>> {
        final ReferenceEntry<K, V> head = new AbstractReferenceEntry<K, V>() { // from class: com.google.common.cache.LocalCache.AccessQueue.1

            @Weak
            ReferenceEntry<K, V> nextAccess = this;

            @Weak
            ReferenceEntry<K, V> previousAccess = this;

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public ReferenceEntry<K, V> getNextInAccessQueue() {
                return this.nextAccess;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public ReferenceEntry<K, V> getPreviousInAccessQueue() {
                return this.previousAccess;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
                this.nextAccess = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
                this.previousAccess = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public long getAccessTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setAccessTime(long j11) {
            }
        };

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            ReferenceEntry<K, V> nextInAccessQueue = this.head.getNextInAccessQueue();
            while (true) {
                ReferenceEntry<K, V> referenceEntry = this.head;
                if (nextInAccessQueue == referenceEntry) {
                    referenceEntry.setNextInAccessQueue(referenceEntry);
                    ReferenceEntry<K, V> referenceEntry2 = this.head;
                    referenceEntry2.setPreviousInAccessQueue(referenceEntry2);
                    return;
                } else {
                    ReferenceEntry<K, V> nextInAccessQueue2 = nextInAccessQueue.getNextInAccessQueue();
                    LocalCache.nullifyAccessOrder(nextInAccessQueue);
                    nextInAccessQueue = nextInAccessQueue2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((ReferenceEntry) obj).getNextInAccessQueue() != NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.head.getNextInAccessQueue() == this.head;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<ReferenceEntry<K, V>> iterator() {
            return new AbstractSequentialIterator<ReferenceEntry<K, V>>(peek()) { // from class: com.google.common.cache.LocalCache.AccessQueue.2
                @Override // com.google.common.collect.AbstractSequentialIterator
                public ReferenceEntry<K, V> computeNext(ReferenceEntry<K, V> referenceEntry) {
                    ReferenceEntry<K, V> nextInAccessQueue = referenceEntry.getNextInAccessQueue();
                    if (nextInAccessQueue == AccessQueue.this.head) {
                        return null;
                    }
                    return nextInAccessQueue;
                }
            };
        }

        @Override // java.util.Queue
        public boolean offer(ReferenceEntry<K, V> referenceEntry) {
            LocalCache.connectAccessOrder(referenceEntry.getPreviousInAccessQueue(), referenceEntry.getNextInAccessQueue());
            LocalCache.connectAccessOrder(this.head.getPreviousInAccessQueue(), referenceEntry);
            LocalCache.connectAccessOrder(referenceEntry, this.head);
            return true;
        }

        @Override // java.util.Queue
        public ReferenceEntry<K, V> peek() {
            ReferenceEntry<K, V> nextInAccessQueue = this.head.getNextInAccessQueue();
            if (nextInAccessQueue == this.head) {
                return null;
            }
            return nextInAccessQueue;
        }

        @Override // java.util.Queue
        public ReferenceEntry<K, V> poll() {
            ReferenceEntry<K, V> nextInAccessQueue = this.head.getNextInAccessQueue();
            if (nextInAccessQueue == this.head) {
                return null;
            }
            remove(nextInAccessQueue);
            return nextInAccessQueue;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        @CanIgnoreReturnValue
        public boolean remove(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry<K, V> previousInAccessQueue = referenceEntry.getPreviousInAccessQueue();
            ReferenceEntry<K, V> nextInAccessQueue = referenceEntry.getNextInAccessQueue();
            LocalCache.connectAccessOrder(previousInAccessQueue, nextInAccessQueue);
            LocalCache.nullifyAccessOrder(referenceEntry);
            return nextInAccessQueue != NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i11 = 0;
            for (ReferenceEntry<K, V> nextInAccessQueue = this.head.getNextInAccessQueue(); nextInAccessQueue != this.head; nextInAccessQueue = nextInAccessQueue.getNextInAccessQueue()) {
                i11++;
            }
            return i11;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.google.common.cache.LocalCache$EntryFactory, still in use, count: 1, list:
      (r0v0 com.google.common.cache.LocalCache$EntryFactory) from 0x005a: FILLED_NEW_ARRAY 
      (r0v0 com.google.common.cache.LocalCache$EntryFactory)
      (r1v1 com.google.common.cache.LocalCache$EntryFactory)
      (r3v1 com.google.common.cache.LocalCache$EntryFactory)
      (r5v1 com.google.common.cache.LocalCache$EntryFactory)
      (r7v1 com.google.common.cache.LocalCache$EntryFactory)
      (r9v1 com.google.common.cache.LocalCache$EntryFactory)
      (r11v1 com.google.common.cache.LocalCache$EntryFactory)
      (r13v1 com.google.common.cache.LocalCache$EntryFactory)
     A[WRAPPED] (LINE:92) elemType: com.google.common.cache.LocalCache$EntryFactory
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static abstract class EntryFactory {
        STRONG { // from class: com.google.common.cache.LocalCache.EntryFactory.1
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k11, int i11, ReferenceEntry<K, V> referenceEntry) {
                return new StrongEntry(k11, i11, referenceEntry);
            }
        },
        STRONG_ACCESS { // from class: com.google.common.cache.LocalCache.EntryFactory.2
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k11, int i11, ReferenceEntry<K, V> referenceEntry) {
                return new StrongAccessEntry(k11, i11, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k11) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2, k11);
                copyAccessEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        },
        STRONG_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.3
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k11, int i11, ReferenceEntry<K, V> referenceEntry) {
                return new StrongWriteEntry(k11, i11, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k11) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2, k11);
                copyWriteEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        },
        STRONG_ACCESS_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.4
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k11, int i11, ReferenceEntry<K, V> referenceEntry) {
                return new StrongAccessWriteEntry(k11, i11, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k11) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2, k11);
                copyAccessEntry(referenceEntry, referenceEntryCopyEntry);
                copyWriteEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        },
        WEAK { // from class: com.google.common.cache.LocalCache.EntryFactory.5
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k11, int i11, ReferenceEntry<K, V> referenceEntry) {
                return new WeakEntry(segment.keyReferenceQueue, k11, i11, referenceEntry);
            }
        },
        WEAK_ACCESS { // from class: com.google.common.cache.LocalCache.EntryFactory.6
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k11, int i11, ReferenceEntry<K, V> referenceEntry) {
                return new WeakAccessEntry(segment.keyReferenceQueue, k11, i11, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k11) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2, k11);
                copyAccessEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        },
        WEAK_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.7
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k11, int i11, ReferenceEntry<K, V> referenceEntry) {
                return new WeakWriteEntry(segment.keyReferenceQueue, k11, i11, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k11) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2, k11);
                copyWriteEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        },
        WEAK_ACCESS_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.8
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k11, int i11, ReferenceEntry<K, V> referenceEntry) {
                return new WeakAccessWriteEntry(segment.keyReferenceQueue, k11, i11, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k11) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2, k11);
                copyAccessEntry(referenceEntry, referenceEntryCopyEntry);
                copyWriteEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        };

        static final int ACCESS_MASK = 1;
        static final int WEAK_MASK = 4;
        static final int WRITE_MASK = 2;
        static final EntryFactory[] factories = {new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.1
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k11, int i11, ReferenceEntry<K, V> referenceEntry) {
                return new StrongEntry(k11, i11, referenceEntry);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.2
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k11, int i11, ReferenceEntry<K, V> referenceEntry) {
                return new StrongAccessEntry(k11, i11, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k11) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2, k11);
                copyAccessEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.3
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k11, int i11, ReferenceEntry<K, V> referenceEntry) {
                return new StrongWriteEntry(k11, i11, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k11) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2, k11);
                copyWriteEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.4
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k11, int i11, ReferenceEntry<K, V> referenceEntry) {
                return new StrongAccessWriteEntry(k11, i11, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k11) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2, k11);
                copyAccessEntry(referenceEntry, referenceEntryCopyEntry);
                copyWriteEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.5
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k11, int i11, ReferenceEntry<K, V> referenceEntry) {
                return new WeakEntry(segment.keyReferenceQueue, k11, i11, referenceEntry);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.6
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k11, int i11, ReferenceEntry<K, V> referenceEntry) {
                return new WeakAccessEntry(segment.keyReferenceQueue, k11, i11, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k11) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2, k11);
                copyAccessEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.7
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k11, int i11, ReferenceEntry<K, V> referenceEntry) {
                return new WeakWriteEntry(segment.keyReferenceQueue, k11, i11, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k11) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2, k11);
                copyWriteEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.8
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k11, int i11, ReferenceEntry<K, V> referenceEntry) {
                return new WeakAccessWriteEntry(segment.keyReferenceQueue, k11, i11, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k11) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2, k11);
                copyAccessEntry(referenceEntry, referenceEntryCopyEntry);
                copyWriteEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        }};

        private EntryFactory(String str, int i11) {
            super(str, i11);
        }

        public abstract <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k11, int i11, ReferenceEntry<K, V> referenceEntry);

        static {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static EntryFactory getFactory(Strength strength, boolean z11, boolean z12) {
            return factories[((strength == Strength.WEAK ? (char) 4 : (char) 0) | (z11 ? 1 : 0) ? 1 : 0) | (z12 ? 2 : 0)];
        }

        public static EntryFactory valueOf(String str) {
            return (EntryFactory) Enum.valueOf(EntryFactory.class, str);
        }

        public static EntryFactory[] values() {
            return (EntryFactory[]) $VALUES.clone();
        }

        public <K, V> void copyAccessEntry(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            referenceEntry2.setAccessTime(referenceEntry.getAccessTime());
            LocalCache.connectAccessOrder(referenceEntry.getPreviousInAccessQueue(), referenceEntry2);
            LocalCache.connectAccessOrder(referenceEntry2, referenceEntry.getNextInAccessQueue());
            LocalCache.nullifyAccessOrder(referenceEntry);
        }

        public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k11) {
            return newEntry(segment, k11, referenceEntry.getHash(), referenceEntry2);
        }

        public <K, V> void copyWriteEntry(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            referenceEntry2.setWriteTime(referenceEntry.getWriteTime());
            LocalCache.connectWriteOrder(referenceEntry.getPreviousInWriteQueue(), referenceEntry2);
            LocalCache.connectWriteOrder(referenceEntry2, referenceEntry.getNextInWriteQueue());
            LocalCache.nullifyWriteOrder(referenceEntry);
        }
    }

    public final class EntryIterator extends LocalCache<K, V>.HashIterator<Map.Entry<K, V>> {
        public EntryIterator() {
            super();
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public Map.Entry<K, V> next() {
            return nextEntry();
        }
    }

    public final class EntrySet extends LocalCache<K, V>.AbstractCacheSet<Map.Entry<K, V>> {
        public EntrySet() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = LocalCache.this.get(key)) != null && LocalCache.this.valueEquivalence.equivalent(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && LocalCache.this.remove(key, entry.getValue());
        }
    }

    public abstract class HashIterator<T> implements Iterator<T> {
        Segment<K, V> currentSegment;
        AtomicReferenceArray<ReferenceEntry<K, V>> currentTable;
        LocalCache<K, V>.WriteThroughEntry lastReturned;
        ReferenceEntry<K, V> nextEntry;
        LocalCache<K, V>.WriteThroughEntry nextExternal;
        int nextSegmentIndex;
        int nextTableIndex = -1;

        public final void advance() {
            this.nextExternal = null;
            if (nextInChain() || nextInTable()) {
                return;
            }
            while (true) {
                int i11 = this.nextSegmentIndex;
                if (i11 < 0) {
                    return;
                }
                Segment<K, V>[] segmentArr = LocalCache.this.segments;
                this.nextSegmentIndex = i11 - 1;
                Segment<K, V> segment = segmentArr[i11];
                this.currentSegment = segment;
                if (segment.count != 0) {
                    AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.currentSegment.table;
                    this.currentTable = atomicReferenceArray;
                    this.nextTableIndex = atomicReferenceArray.length() - 1;
                    if (nextInTable()) {
                        return;
                    }
                }
            }
        }

        @Override // java.util.Iterator
        public abstract T next();

        public HashIterator() {
            this.nextSegmentIndex = LocalCache.this.segments.length - 1;
            advance();
        }

        public boolean advanceTo(ReferenceEntry<K, V> referenceEntry) {
            Segment<K, V> segment;
            try {
                long j11 = LocalCache.this.ticker.read();
                K key = referenceEntry.getKey();
                Object liveValue = LocalCache.this.getLiveValue(referenceEntry, j11);
                if (liveValue == null) {
                    return false;
                }
                this.nextExternal = new WriteThroughEntry(key, liveValue);
                return true;
            } finally {
                this.currentSegment.postReadCleanup();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.nextExternal != null;
        }

        public LocalCache<K, V>.WriteThroughEntry nextEntry() {
            LocalCache<K, V>.WriteThroughEntry writeThroughEntry = this.nextExternal;
            if (writeThroughEntry == null) {
                throw new NoSuchElementException();
            }
            this.lastReturned = writeThroughEntry;
            advance();
            return this.lastReturned;
        }

        public boolean nextInChain() {
            ReferenceEntry<K, V> referenceEntry = this.nextEntry;
            if (referenceEntry == null) {
                return false;
            }
            while (true) {
                this.nextEntry = referenceEntry.getNext();
                ReferenceEntry<K, V> referenceEntry2 = this.nextEntry;
                if (referenceEntry2 == null) {
                    return false;
                }
                if (advanceTo(referenceEntry2)) {
                    return true;
                }
                referenceEntry = this.nextEntry;
            }
        }

        public boolean nextInTable() {
            while (true) {
                int i11 = this.nextTableIndex;
                if (i11 < 0) {
                    return false;
                }
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.currentTable;
                this.nextTableIndex = i11 - 1;
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(i11);
                this.nextEntry = referenceEntry;
                if (referenceEntry != null && (advanceTo(referenceEntry) || nextInChain())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            Preconditions.checkState(this.lastReturned != null);
            LocalCache.this.remove(this.lastReturned.getKey());
            this.lastReturned = null;
        }
    }

    public final class KeyIterator extends LocalCache<K, V>.HashIterator<K> {
        public KeyIterator() {
            super();
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public K next() {
            return nextEntry().getKey();
        }
    }

    public final class KeySet extends LocalCache<K, V>.AbstractCacheSet<K> {
        public KeySet() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LocalCache.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new KeyIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return LocalCache.this.remove(obj) != null;
        }
    }

    public static final class LoadingSerializationProxy<K, V> extends ManualSerializationProxy<K, V> implements LoadingCache<K, V>, Serializable {
        private static final long serialVersionUID = 1;
        transient LoadingCache<K, V> autoDelegate;

        private Object readResolve() {
            return this.autoDelegate;
        }

        @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
        public V apply(K k11) {
            return this.autoDelegate.apply(k11);
        }

        @Override // com.google.common.cache.LoadingCache
        public V get(K k11) throws ExecutionException {
            return this.autoDelegate.get(k11);
        }

        @Override // com.google.common.cache.LoadingCache
        public ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
            return this.autoDelegate.getAll(iterable);
        }

        @Override // com.google.common.cache.LoadingCache
        public V getUnchecked(K k11) {
            return this.autoDelegate.getUnchecked(k11);
        }

        @Override // com.google.common.cache.LoadingCache
        public void refresh(K k11) {
            this.autoDelegate.refresh(k11);
        }

        public LoadingSerializationProxy(LocalCache<K, V> localCache) {
            super(localCache);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.autoDelegate = (LoadingCache<K, V>) recreateCacheBuilder().build(this.loader);
        }
    }

    public static class LoadingValueReference<K, V> implements ValueReference<K, V> {
        final SettableFuture<V> futureValue;
        volatile ValueReference<K, V> oldValue;
        final Stopwatch stopwatch;

        public LoadingValueReference() {
            this(LocalCache.unset());
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<K, V> getEntry() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return true;
        }

        public LoadingValueReference(ValueReference<K, V> valueReference) {
            this.futureValue = SettableFuture.create();
            this.stopwatch = Stopwatch.createUnstarted();
            this.oldValue = valueReference;
        }

        public long elapsedNanos() {
            return this.stopwatch.elapsed(TimeUnit.NANOSECONDS);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V get() {
            return this.oldValue.get();
        }

        public ValueReference<K, V> getOldValue() {
            return this.oldValue;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return this.oldValue.getWeight();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return this.oldValue.isActive();
        }

        public ListenableFuture<V> loadFuture(K k11, CacheLoader<? super K, V> cacheLoader) {
            try {
                this.stopwatch.start();
                V v11 = this.oldValue.get();
                if (v11 == null) {
                    V vLoad = cacheLoader.load(k11);
                    return set(vLoad) ? this.futureValue : Futures.immediateFuture(vLoad);
                }
                ListenableFuture<V> listenableFutureReload = cacheLoader.reload(k11, v11);
                return listenableFutureReload == null ? Futures.immediateFuture(null) : Futures.transform(listenableFutureReload, new Function() { // from class: com.google.common.cache.b
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        return LocalCache.LoadingValueReference.m13388a(this.f12243b, obj);
                    }
                }, MoreExecutors.directExecutor());
            } catch (Throwable th2) {
                ListenableFuture<V> listenableFutureFullyFailedFuture = setException(th2) ? this.futureValue : fullyFailedFuture(th2);
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return listenableFutureFullyFailedFuture;
            }
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V v11) {
            if (v11 != null) {
                set(v11);
            } else {
                this.oldValue = LocalCache.unset();
            }
        }

        @CanIgnoreReturnValue
        public boolean set(V v11) {
            return this.futureValue.set(v11);
        }

        @CanIgnoreReturnValue
        public boolean setException(Throwable th2) {
            return this.futureValue.setException(th2);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() throws ExecutionException {
            return (V) Uninterruptibles.getUninterruptibly(this.futureValue);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Object m13388a(LoadingValueReference loadingValueReference, Object obj) {
            loadingValueReference.set(obj);
            return obj;
        }

        private ListenableFuture<V> fullyFailedFuture(Throwable th2) {
            return Futures.immediateFailedFuture(th2);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v11, ReferenceEntry<K, V> referenceEntry) {
            return this;
        }
    }

    public static class LocalLoadingCache<K, V> extends LocalManualCache<K, V> implements LoadingCache<K, V> {
        private static final long serialVersionUID = 1;

        public LocalLoadingCache(CacheBuilder<? super K, ? super V> cacheBuilder, CacheLoader<? super K, V> cacheLoader) {
            super();
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use LoadingSerializationProxy");
        }

        @Override // com.google.common.cache.LoadingCache
        public V get(K k11) throws ExecutionException {
            return this.localCache.getOrLoad(k11);
        }

        @Override // com.google.common.cache.LoadingCache
        public ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
            return this.localCache.getAll(iterable);
        }

        @Override // com.google.common.cache.LoadingCache
        public void refresh(K k11) {
            this.localCache.refresh(k11);
        }

        @Override // com.google.common.cache.LocalCache.LocalManualCache
        public Object writeReplace() {
            return new LoadingSerializationProxy(this.localCache);
        }

        @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
        public final V apply(K k11) {
            return getUnchecked(k11);
        }

        @Override // com.google.common.cache.LoadingCache
        @CanIgnoreReturnValue
        public V getUnchecked(K k11) {
            try {
                return get(k11);
            } catch (ExecutionException e11) {
                throw new UncheckedExecutionException(e11.getCause());
            }
        }
    }

    public static class LocalManualCache<K, V> implements Cache<K, V>, Serializable {
        private static final long serialVersionUID = 1;
        final LocalCache<K, V> localCache;

        @Override // com.google.common.cache.Cache
        public void invalidateAll(Iterable<?> iterable) {
            this.localCache.invalidateAll(iterable);
        }

        public LocalManualCache(CacheBuilder<? super K, ? super V> cacheBuilder) {
            this(new LocalCache(cacheBuilder, null));
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use ManualSerializationProxy");
        }

        @Override // com.google.common.cache.Cache
        public ConcurrentMap<K, V> asMap() {
            return this.localCache;
        }

        @Override // com.google.common.cache.Cache
        public void cleanUp() {
            this.localCache.cleanUp();
        }

        @Override // com.google.common.cache.Cache
        public ImmutableMap<K, V> getAllPresent(Iterable<?> iterable) {
            return this.localCache.getAllPresent(iterable);
        }

        @Override // com.google.common.cache.Cache
        public V getIfPresent(Object obj) {
            return this.localCache.getIfPresent(obj);
        }

        @Override // com.google.common.cache.Cache
        public void invalidateAll() throws Throwable {
            this.localCache.clear();
        }

        @Override // com.google.common.cache.Cache
        public void put(K k11, V v11) {
            this.localCache.put(k11, v11);
        }

        @Override // com.google.common.cache.Cache
        public void putAll(Map<? extends K, ? extends V> map) {
            this.localCache.putAll(map);
        }

        @Override // com.google.common.cache.Cache
        public long size() {
            return this.localCache.longSize();
        }

        @Override // com.google.common.cache.Cache
        public CacheStats stats() {
            AbstractCache.SimpleStatsCounter simpleStatsCounter = new AbstractCache.SimpleStatsCounter();
            simpleStatsCounter.incrementBy(this.localCache.globalStatsCounter);
            for (Segment<K, V> segment : this.localCache.segments) {
                simpleStatsCounter.incrementBy(segment.statsCounter);
            }
            return simpleStatsCounter.snapshot();
        }

        public Object writeReplace() {
            return new ManualSerializationProxy(this.localCache);
        }

        private LocalManualCache(LocalCache<K, V> localCache) {
            this.localCache = localCache;
        }

        @Override // com.google.common.cache.Cache
        public V get(K k11, final Callable<? extends V> callable) throws ExecutionException {
            Preconditions.checkNotNull(callable);
            return this.localCache.get(k11, new CacheLoader<Object, V>(this) { // from class: com.google.common.cache.LocalCache.LocalManualCache.1
                final /* synthetic */ LocalManualCache this$0;

                {
                    this.this$0 = this;
                }

                @Override // com.google.common.cache.CacheLoader
                public V load(Object obj) throws Exception {
                    return (V) callable.call();
                }
            });
        }

        @Override // com.google.common.cache.Cache
        public void invalidate(Object obj) {
            Preconditions.checkNotNull(obj);
            this.localCache.remove(obj);
        }
    }

    public static class ManualSerializationProxy<K, V> extends ForwardingCache<K, V> implements Serializable {
        private static final long serialVersionUID = 1;
        final int concurrencyLevel;
        transient Cache<K, V> delegate;
        final long expireAfterAccessNanos;
        final long expireAfterWriteNanos;
        final Equivalence<Object> keyEquivalence;
        final Strength keyStrength;
        final CacheLoader<? super K, V> loader;
        final long maxWeight;
        final RemovalListener<? super K, ? super V> removalListener;
        final Ticker ticker;
        final Equivalence<Object> valueEquivalence;
        final Strength valueStrength;
        final Weigher<K, V> weigher;

        public ManualSerializationProxy(LocalCache<K, V> localCache) {
            this(localCache.keyStrength, localCache.valueStrength, localCache.keyEquivalence, localCache.valueEquivalence, localCache.expireAfterWriteNanos, localCache.expireAfterAccessNanos, localCache.maxWeight, localCache.weigher, localCache.concurrencyLevel, localCache.removalListener, localCache.ticker, localCache.defaultLoader);
        }

        private ManualSerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, long j11, long j12, long j13, Weigher<K, V> weigher, int i11, RemovalListener<? super K, ? super V> removalListener, Ticker ticker, CacheLoader<? super K, V> cacheLoader) {
            this.keyStrength = strength;
            this.valueStrength = strength2;
            this.keyEquivalence = equivalence;
            this.valueEquivalence = equivalence2;
            this.expireAfterWriteNanos = j11;
            this.expireAfterAccessNanos = j12;
            this.maxWeight = j13;
            this.weigher = weigher;
            this.concurrencyLevel = i11;
            this.removalListener = removalListener;
            this.ticker = (ticker == Ticker.systemTicker() || ticker == CacheBuilder.NULL_TICKER) ? null : ticker;
            this.loader = cacheLoader;
        }

        private Object readResolve() {
            return this.delegate;
        }

        @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        public Cache<K, V> delegate() {
            return this.delegate;
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.delegate = (Cache<K, V>) recreateCacheBuilder().build();
        }

        public CacheBuilder<K, V> recreateCacheBuilder() {
            CacheBuilder<K, V> cacheBuilder = (CacheBuilder<K, V>) CacheBuilder.newBuilder().setKeyStrength(this.keyStrength).setValueStrength(this.valueStrength).keyEquivalence(this.keyEquivalence).valueEquivalence(this.valueEquivalence).concurrencyLevel(this.concurrencyLevel).removalListener(this.removalListener);
            cacheBuilder.strictParsing = false;
            long j11 = this.expireAfterWriteNanos;
            if (j11 > 0) {
                cacheBuilder.expireAfterWrite(j11, TimeUnit.NANOSECONDS);
            }
            long j12 = this.expireAfterAccessNanos;
            if (j12 > 0) {
                cacheBuilder.expireAfterAccess(j12, TimeUnit.NANOSECONDS);
            }
            Weigher weigher = this.weigher;
            if (weigher != CacheBuilder.OneWeigher.INSTANCE) {
                cacheBuilder.weigher(weigher);
                long j13 = this.maxWeight;
                if (j13 != -1) {
                    cacheBuilder.maximumWeight(j13);
                }
            } else {
                long j14 = this.maxWeight;
                if (j14 != -1) {
                    cacheBuilder.maximumSize(j14);
                }
            }
            Ticker ticker = this.ticker;
            if (ticker != null) {
                cacheBuilder.ticker(ticker);
            }
            return cacheBuilder;
        }
    }

    public enum NullEntry implements ReferenceEntry<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
            return 0;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public Object getKey() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getNext() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ValueReference<Object, Object> getValueReference() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return 0L;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return 0L;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getNextInAccessQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getNextInWriteQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getPreviousInAccessQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getPreviousInWriteQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j11) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(ValueReference<Object, Object> valueReference) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j11) {
        }
    }

    public static class Segment<K, V> extends ReentrantLock {

        @GuardedBy("this")
        final Queue<ReferenceEntry<K, V>> accessQueue;
        volatile int count;
        final ReferenceQueue<K> keyReferenceQueue;

        @Weak
        final LocalCache<K, V> map;
        final long maxSegmentWeight;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();
        final Queue<ReferenceEntry<K, V>> recencyQueue;
        final AbstractCache.StatsCounter statsCounter;
        volatile AtomicReferenceArray<ReferenceEntry<K, V>> table;
        int threshold;

        @GuardedBy("this")
        long totalWeight;
        final ReferenceQueue<V> valueReferenceQueue;

        @GuardedBy("this")
        final Queue<ReferenceEntry<K, V>> writeQueue;

        @GuardedBy("this")
        public void drainKeyReferenceQueue() throws Throwable {
            int i11 = 0;
            do {
                Reference<? extends K> referencePoll = this.keyReferenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.map.reclaimKey((ReferenceEntry) referencePoll);
                i11++;
            } while (i11 != 16);
        }

        @GuardedBy("this")
        public void drainValueReferenceQueue() throws Throwable {
            int i11 = 0;
            do {
                Reference<? extends V> referencePoll = this.valueReferenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.map.reclaimValue((ValueReference) referencePoll);
                i11++;
            } while (i11 != 16);
        }

        @CanIgnoreReturnValue
        public V get(K k11, int i11, CacheLoader<? super K, V> cacheLoader) throws Throwable {
            K k12;
            ReferenceEntry<K, V> entry;
            Preconditions.checkNotNull(k11);
            Preconditions.checkNotNull(cacheLoader);
            try {
                try {
                    try {
                        if (this.count != 0 && (entry = getEntry(k11, i11)) != null) {
                            long j11 = this.map.ticker.read();
                            V liveValue = getLiveValue(entry, j11);
                            if (liveValue != null) {
                                recordRead(entry, j11);
                                this.statsCounter.recordHits(1);
                                V vScheduleRefresh = scheduleRefresh(entry, k11, i11, liveValue, j11, cacheLoader);
                                postReadCleanup();
                                return vScheduleRefresh;
                            }
                            k12 = k11;
                            ValueReference<K, V> valueReference = entry.getValueReference();
                            if (valueReference.isLoading()) {
                                V vWaitForLoadingValue = waitForLoadingValue(entry, k12, valueReference);
                                postReadCleanup();
                                return vWaitForLoadingValue;
                            }
                            ExecutionException executionException = e;
                            Throwable cause = executionException.getCause();
                            if (cause instanceof Error) {
                                throw new ExecutionError((Error) cause);
                            }
                            if (cause instanceof RuntimeException) {
                                throw new UncheckedExecutionException(cause);
                            }
                            throw executionException;
                        }
                        k12 = k11;
                        V vLockedGetOrLoad = lockedGetOrLoad(k12, i11, cacheLoader);
                        postReadCleanup();
                        return vLockedGetOrLoad;
                    } catch (ExecutionException e11) {
                        e = e11;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    postReadCleanup();
                    throw th3;
                }
            } catch (ExecutionException e12) {
                e = e12;
            } catch (Throwable th4) {
                th = th4;
                Throwable th5 = th;
                postReadCleanup();
                throw th5;
            }
        }

        public V remove(Object obj, int i11) throws Throwable {
            Throwable th2;
            RemovalCause removalCause;
            lock();
            try {
                preWriteCleanup(this.map.ticker.read());
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i11;
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry<K, V> next = referenceEntry;
                while (next != null) {
                    K key = next.getKey();
                    if (next.getHash() == i11 && key != null && this.map.keyEquivalence.equivalent(obj, key)) {
                        ValueReference<K, V> valueReference = next.getValueReference();
                        V v11 = valueReference.get();
                        if (v11 == null) {
                            if (!valueReference.isActive()) {
                                break;
                            }
                            removalCause = RemovalCause.COLLECTED;
                        } else {
                            try {
                                removalCause = RemovalCause.EXPLICIT;
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                        }
                        RemovalCause removalCause2 = removalCause;
                        this.modCount++;
                        ReferenceEntry<K, V> referenceEntryRemoveValueFromChain = removeValueFromChain(referenceEntry, next, key, i11, v11, valueReference, removalCause2);
                        int i12 = this.count - 1;
                        atomicReferenceArray.set(length, referenceEntryRemoveValueFromChain);
                        this.count = i12;
                        unlock();
                        postWriteCleanup();
                        return v11;
                    }
                    int i13 = i11;
                    try {
                        next = next.getNext();
                        i11 = i13;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    th = th4;
                    th2 = th;
                    unlock();
                    postWriteCleanup();
                    throw th2;
                }
                unlock();
                postWriteCleanup();
                return null;
            } catch (Throwable th5) {
                th = th5;
            }
        }

        public boolean replace(K k11, int i11, V v11, V v12) {
            int i12 = i11;
            lock();
            try {
                long j11 = this.map.ticker.read();
                preWriteCleanup(j11);
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = i12 & (atomicReferenceArray.length() - 1);
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry<K, V> next = referenceEntry;
                while (next != null) {
                    ReferenceEntry<K, V> referenceEntry2 = next;
                    K key = referenceEntry2.getKey();
                    if (referenceEntry2.getHash() == i12 && key != null && this.map.keyEquivalence.equivalent(k11, key)) {
                        long j12 = j11;
                        ValueReference<K, V> valueReference = referenceEntry2.getValueReference();
                        V v13 = valueReference.get();
                        if (v13 != null) {
                            if (!this.map.valueEquivalence.equivalent(v11, v13)) {
                                recordLockedRead(referenceEntry2, j12);
                                break;
                            }
                            this.modCount++;
                            enqueueNotification(k11, i11, v13, valueReference.getWeight(), RemovalCause.REPLACED);
                            setValue(referenceEntry2, k11, v12, j12);
                            evictEntries(referenceEntry2);
                            unlock();
                            postWriteCleanup();
                            return true;
                        }
                        if (!valueReference.isActive()) {
                            break;
                        }
                        this.modCount++;
                        ReferenceEntry<K, V> referenceEntryRemoveValueFromChain = removeValueFromChain(referenceEntry, referenceEntry2, key, i12, v13, valueReference, RemovalCause.COLLECTED);
                        int i13 = this.count - 1;
                        atomicReferenceArray.set(length, referenceEntryRemoveValueFromChain);
                        this.count = i13;
                        break;
                    }
                    ReferenceEntry<K, V> referenceEntry3 = referenceEntry;
                    long j13 = j11;
                    next = referenceEntry2.getNext();
                    referenceEntry = referenceEntry3;
                    i12 = i11;
                    j11 = j13;
                }
                unlock();
                postWriteCleanup();
                return false;
            } catch (Throwable th2) {
                unlock();
                postWriteCleanup();
                throw th2;
            }
        }

        public void cleanUp() {
            runLockedCleanup(this.map.ticker.read());
            runUnlockedCleanup();
        }

        public void clear() throws Throwable {
            if (this.count == 0) {
                return;
            }
            lock();
            try {
                preWriteCleanup(this.map.ticker.read());
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                for (int i11 = 0; i11 < atomicReferenceArray.length(); i11++) {
                    for (ReferenceEntry<K, V> next = atomicReferenceArray.get(i11); next != null; next = next.getNext()) {
                        if (next.getValueReference().isActive()) {
                            K key = next.getKey();
                            V v11 = next.getValueReference().get();
                            try {
                                enqueueNotification(key, next.getHash(), v11, next.getValueReference().getWeight(), (key == null || v11 == null) ? RemovalCause.COLLECTED : RemovalCause.EXPLICIT);
                            } catch (Throwable th2) {
                                th = th2;
                                unlock();
                                postWriteCleanup();
                                throw th;
                            }
                        }
                    }
                }
                for (int i12 = 0; i12 < atomicReferenceArray.length(); i12++) {
                    atomicReferenceArray.set(i12, null);
                }
                clearReferenceQueues();
                this.writeQueue.clear();
                this.accessQueue.clear();
                this.readCount.set(0);
                this.modCount++;
                this.count = 0;
                unlock();
                postWriteCleanup();
            } catch (Throwable th3) {
                th = th3;
            }
        }

        public void clearKeyReferenceQueue() {
            while (this.keyReferenceQueue.poll() != null) {
            }
        }

        public void clearReferenceQueues() {
            if (this.map.usesKeyReferences()) {
                clearKeyReferenceQueue();
            }
            if (this.map.usesValueReferences()) {
                clearValueReferenceQueue();
            }
        }

        public void clearValueReferenceQueue() {
            while (this.valueReferenceQueue.poll() != null) {
            }
        }

        public boolean containsKey(Object obj, int i11) {
            try {
                if (this.count == 0) {
                    return false;
                }
                ReferenceEntry<K, V> liveEntry = getLiveEntry(obj, i11, this.map.ticker.read());
                if (liveEntry == null) {
                    return false;
                }
                return liveEntry.getValueReference().get() != null;
            } finally {
                postReadCleanup();
            }
        }

        @VisibleForTesting
        public boolean containsValue(Object obj) {
            try {
                if (this.count != 0) {
                    long j11 = this.map.ticker.read();
                    AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                    int length = atomicReferenceArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        for (ReferenceEntry<K, V> next = atomicReferenceArray.get(i11); next != null; next = next.getNext()) {
                            V liveValue = getLiveValue(next, j11);
                            if (liveValue != null && this.map.valueEquivalence.equivalent(obj, liveValue)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            } finally {
                postReadCleanup();
            }
        }

        @GuardedBy("this")
        public void drainRecencyQueue() {
            while (true) {
                ReferenceEntry<K, V> referenceEntryPoll = this.recencyQueue.poll();
                if (referenceEntryPoll == null) {
                    return;
                }
                if (this.accessQueue.contains(referenceEntryPoll)) {
                    this.accessQueue.add(referenceEntryPoll);
                }
            }
        }

        @GuardedBy("this")
        public void drainReferenceQueues() throws Throwable {
            if (this.map.usesKeyReferences()) {
                drainKeyReferenceQueue();
            }
            if (this.map.usesValueReferences()) {
                drainValueReferenceQueue();
            }
        }

        @GuardedBy("this")
        public void enqueueNotification(K k11, int i11, V v11, int i12, RemovalCause removalCause) {
            this.totalWeight -= (long) i12;
            if (removalCause.wasEvicted()) {
                this.statsCounter.recordEviction();
            }
            if (this.map.removalNotificationQueue != LocalCache.DISCARDING_QUEUE) {
                this.map.removalNotificationQueue.offer(RemovalNotification.create(k11, v11, removalCause));
            }
        }

        @GuardedBy("this")
        public void evictEntries(ReferenceEntry<K, V> referenceEntry) {
            if (this.map.evictsBySize()) {
                drainRecencyQueue();
                if (referenceEntry.getValueReference().getWeight() > this.maxSegmentWeight && !removeEntry(referenceEntry, referenceEntry.getHash(), RemovalCause.SIZE)) {
                    throw new AssertionError();
                }
                while (this.totalWeight > this.maxSegmentWeight) {
                    ReferenceEntry<K, V> nextEvictable = getNextEvictable();
                    if (!removeEntry(nextEvictable, nextEvictable.getHash(), RemovalCause.SIZE)) {
                        throw new AssertionError();
                    }
                }
            }
        }

        @GuardedBy("this")
        public void expand() {
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i11 = this.count;
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArrayNewEntryArray = newEntryArray(length << 1);
            this.threshold = (atomicReferenceArrayNewEntryArray.length() * 3) / 4;
            int length2 = atomicReferenceArrayNewEntryArray.length() - 1;
            for (int i12 = 0; i12 < length; i12++) {
                ReferenceEntry<K, V> next = atomicReferenceArray.get(i12);
                if (next != null) {
                    ReferenceEntry<K, V> next2 = next.getNext();
                    int hash = next.getHash() & length2;
                    if (next2 == null) {
                        atomicReferenceArrayNewEntryArray.set(hash, next);
                    } else {
                        ReferenceEntry<K, V> referenceEntry = next;
                        while (next2 != null) {
                            int hash2 = next2.getHash() & length2;
                            if (hash2 != hash) {
                                referenceEntry = next2;
                                hash = hash2;
                            }
                            next2 = next2.getNext();
                        }
                        atomicReferenceArrayNewEntryArray.set(hash, referenceEntry);
                        while (next != referenceEntry) {
                            int hash3 = next.getHash() & length2;
                            ReferenceEntry<K, V> referenceEntryCopyEntry = copyEntry(next, atomicReferenceArrayNewEntryArray.get(hash3));
                            if (referenceEntryCopyEntry != null) {
                                atomicReferenceArrayNewEntryArray.set(hash3, referenceEntryCopyEntry);
                            } else {
                                removeCollectedEntry(next);
                                i11--;
                            }
                            next = next.getNext();
                        }
                    }
                }
            }
            this.table = atomicReferenceArrayNewEntryArray;
            this.count = i11;
        }

        public ReferenceEntry<K, V> getFirst(int i11) {
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
            return atomicReferenceArray.get(i11 & (atomicReferenceArray.length() - 1));
        }

        @GuardedBy("this")
        public ReferenceEntry<K, V> getNextEvictable() {
            for (ReferenceEntry<K, V> referenceEntry : this.accessQueue) {
                if (referenceEntry.getValueReference().getWeight() > 0) {
                    return referenceEntry;
                }
            }
            throw new AssertionError();
        }

        public V lockedGetOrLoad(K k11, int i11, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            LoadingValueReference<K, V> loadingValueReference;
            boolean z11;
            ValueReference<K, V> valueReference;
            V vLoadSync;
            int i12 = i11;
            lock();
            try {
                long j11 = this.map.ticker.read();
                preWriteCleanup(j11);
                int i13 = this.count - 1;
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = i12 & (atomicReferenceArray.length() - 1);
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry<K, V> referenceEntryNewEntry = referenceEntry;
                while (true) {
                    loadingValueReference = null;
                    if (referenceEntryNewEntry == null) {
                        z11 = true;
                        valueReference = null;
                        break;
                    }
                    long j12 = j11;
                    K key = referenceEntryNewEntry.getKey();
                    if (referenceEntryNewEntry.getHash() == i12 && key != null && this.map.keyEquivalence.equivalent(k11, key)) {
                        valueReference = referenceEntryNewEntry.getValueReference();
                        if (!valueReference.isLoading()) {
                            V v11 = valueReference.get();
                            if (v11 == null) {
                                enqueueNotification(key, i12, v11, valueReference.getWeight(), RemovalCause.COLLECTED);
                                i12 = i11;
                            } else {
                                if (!this.map.isExpired(referenceEntryNewEntry, j12)) {
                                    recordLockedRead(referenceEntryNewEntry, j12);
                                    this.statsCounter.recordHits(1);
                                    unlock();
                                    postWriteCleanup();
                                    return v11;
                                }
                                i12 = i11;
                                enqueueNotification(key, i12, v11, valueReference.getWeight(), RemovalCause.EXPIRED);
                            }
                            this.writeQueue.remove(referenceEntryNewEntry);
                            this.accessQueue.remove(referenceEntryNewEntry);
                            this.count = i13;
                            z11 = true;
                            break;
                        }
                        z11 = false;
                        break;
                    }
                    referenceEntryNewEntry = referenceEntryNewEntry.getNext();
                    j11 = j12;
                }
                if (z11) {
                    loadingValueReference = new LoadingValueReference<>();
                    if (referenceEntryNewEntry == null) {
                        referenceEntryNewEntry = newEntry(k11, i12, referenceEntry);
                        referenceEntryNewEntry.setValueReference(loadingValueReference);
                        atomicReferenceArray.set(length, referenceEntryNewEntry);
                    } else {
                        referenceEntryNewEntry.setValueReference(loadingValueReference);
                    }
                }
                unlock();
                postWriteCleanup();
                if (!z11) {
                    return waitForLoadingValue(referenceEntryNewEntry, k11, valueReference);
                }
                try {
                    synchronized (referenceEntryNewEntry) {
                        vLoadSync = loadSync(k11, i12, loadingValueReference, cacheLoader);
                    }
                    this.statsCounter.recordMisses(1);
                    return vLoadSync;
                } catch (Throwable th2) {
                    this.statsCounter.recordMisses(1);
                    throw th2;
                }
            } catch (Throwable th3) {
                unlock();
                postWriteCleanup();
                throw th3;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @GuardedBy("this")
        public ReferenceEntry<K, V> newEntry(K k11, int i11, ReferenceEntry<K, V> referenceEntry) {
            return this.map.entryFactory.newEntry(this, Preconditions.checkNotNull(k11), i11, referenceEntry);
        }

        public AtomicReferenceArray<ReferenceEntry<K, V>> newEntryArray(int i11) {
            return new AtomicReferenceArray<>(i11);
        }

        public void postReadCleanup() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                cleanUp();
            }
        }

        @GuardedBy("this")
        public void recordLockedRead(ReferenceEntry<K, V> referenceEntry, long j11) {
            if (this.map.recordsAccess()) {
                referenceEntry.setAccessTime(j11);
            }
            this.accessQueue.add(referenceEntry);
        }

        public void recordRead(ReferenceEntry<K, V> referenceEntry, long j11) {
            if (this.map.recordsAccess()) {
                referenceEntry.setAccessTime(j11);
            }
            this.recencyQueue.add(referenceEntry);
        }

        @VisibleForTesting
        @CanIgnoreReturnValue
        @GuardedBy("this")
        public boolean removeEntry(ReferenceEntry<K, V> referenceEntry, int i11, RemovalCause removalCause) {
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
            int length = (atomicReferenceArray.length() - 1) & i11;
            ReferenceEntry<K, V> referenceEntry2 = atomicReferenceArray.get(length);
            for (ReferenceEntry<K, V> next = referenceEntry2; next != null; next = next.getNext()) {
                if (next == referenceEntry) {
                    this.modCount++;
                    ReferenceEntry<K, V> referenceEntryRemoveValueFromChain = removeValueFromChain(referenceEntry2, next, next.getKey(), i11, next.getValueReference().get(), next.getValueReference(), removalCause);
                    int i12 = this.count - 1;
                    atomicReferenceArray.set(length, referenceEntryRemoveValueFromChain);
                    this.count = i12;
                    return true;
                }
            }
            return false;
        }

        @GuardedBy("this")
        public ReferenceEntry<K, V> removeEntryFromChain(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            int i11 = this.count;
            ReferenceEntry<K, V> next = referenceEntry2.getNext();
            while (referenceEntry != referenceEntry2) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = copyEntry(referenceEntry, next);
                if (referenceEntryCopyEntry != null) {
                    next = referenceEntryCopyEntry;
                } else {
                    removeCollectedEntry(referenceEntry);
                    i11--;
                }
                referenceEntry = referenceEntry.getNext();
            }
            this.count = i11;
            return next;
        }

        public V scheduleRefresh(ReferenceEntry<K, V> referenceEntry, K k11, int i11, V v11, long j11, CacheLoader<? super K, V> cacheLoader) {
            V vRefresh;
            return (!this.map.refreshes() || j11 - referenceEntry.getWriteTime() <= this.map.refreshNanos || referenceEntry.getValueReference().isLoading() || (vRefresh = refresh(k11, i11, cacheLoader, true)) == null) ? v11 : vRefresh;
        }

        public Segment(LocalCache<K, V> localCache, int i11, long j11, AbstractCache.StatsCounter statsCounter) {
            ReferenceQueue<K> referenceQueue;
            Queue<ReferenceEntry<K, V>> queueDiscardingQueue;
            Queue<ReferenceEntry<K, V>> queueDiscardingQueue2;
            Queue<ReferenceEntry<K, V>> queueDiscardingQueue3;
            this.map = localCache;
            this.maxSegmentWeight = j11;
            this.statsCounter = (AbstractCache.StatsCounter) Preconditions.checkNotNull(statsCounter);
            initTable(newEntryArray(i11));
            if (localCache.usesKeyReferences()) {
                referenceQueue = new ReferenceQueue<>();
            } else {
                referenceQueue = null;
            }
            this.keyReferenceQueue = referenceQueue;
            this.valueReferenceQueue = localCache.usesValueReferences() ? new ReferenceQueue<>() : null;
            if (localCache.usesAccessQueue()) {
                queueDiscardingQueue = new ConcurrentLinkedQueue<>();
            } else {
                queueDiscardingQueue = LocalCache.discardingQueue();
            }
            this.recencyQueue = queueDiscardingQueue;
            if (localCache.usesWriteQueue()) {
                queueDiscardingQueue2 = new WriteQueue<>();
            } else {
                queueDiscardingQueue2 = LocalCache.discardingQueue();
            }
            this.writeQueue = queueDiscardingQueue2;
            if (localCache.usesAccessQueue()) {
                queueDiscardingQueue3 = new AccessQueue<>();
            } else {
                queueDiscardingQueue3 = LocalCache.discardingQueue();
            }
            this.accessQueue = queueDiscardingQueue3;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m13389a(Segment segment, Object obj, int i11, LoadingValueReference loadingValueReference, ListenableFuture listenableFuture) {
            segment.getClass();
            try {
                segment.getAndRecordStats(obj, i11, loadingValueReference, listenableFuture);
            } catch (Throwable th2) {
                LocalCache.logger.log(Level.WARNING, "Exception thrown during refresh", th2);
                loadingValueReference.setException(th2);
            }
        }

        @GuardedBy("this")
        public ReferenceEntry<K, V> copyEntry(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            K key = referenceEntry.getKey();
            if (key == null) {
                return null;
            }
            ValueReference<K, V> valueReference = referenceEntry.getValueReference();
            V v11 = valueReference.get();
            if (v11 == null && valueReference.isActive()) {
                return null;
            }
            ReferenceEntry<K, V> referenceEntryCopyEntry = this.map.entryFactory.copyEntry(this, referenceEntry, referenceEntry2, key);
            referenceEntryCopyEntry.setValueReference(valueReference.copyFor(this.valueReferenceQueue, v11, referenceEntryCopyEntry));
            return referenceEntryCopyEntry;
        }

        @GuardedBy("this")
        public void expireEntries(long j11) {
            ReferenceEntry<K, V> referenceEntryPeek;
            ReferenceEntry<K, V> referenceEntryPeek2;
            drainRecencyQueue();
            do {
                referenceEntryPeek = this.writeQueue.peek();
                if (referenceEntryPeek == null || !this.map.isExpired(referenceEntryPeek, j11)) {
                    do {
                        referenceEntryPeek2 = this.accessQueue.peek();
                        if (referenceEntryPeek2 == null || !this.map.isExpired(referenceEntryPeek2, j11)) {
                            return;
                        }
                    } while (removeEntry(referenceEntryPeek2, referenceEntryPeek2.getHash(), RemovalCause.EXPIRED));
                    throw new AssertionError();
                }
            } while (removeEntry(referenceEntryPeek, referenceEntryPeek.getHash(), RemovalCause.EXPIRED));
            throw new AssertionError();
        }

        @CanIgnoreReturnValue
        public V getAndRecordStats(K k11, int i11, LoadingValueReference<K, V> loadingValueReference, ListenableFuture<V> listenableFuture) throws Throwable {
            V v11;
            try {
                v11 = (V) Uninterruptibles.getUninterruptibly(listenableFuture);
                try {
                    if (v11 != null) {
                        this.statsCounter.recordLoadSuccess(loadingValueReference.elapsedNanos());
                        storeLoadedValue(k11, i11, loadingValueReference, v11);
                        return v11;
                    }
                    throw new CacheLoader.InvalidCacheLoadException("CacheLoader returned null for key " + k11 + C33978va.f72339h);
                } catch (Throwable th2) {
                    th = th2;
                    if (v11 == null) {
                        this.statsCounter.recordLoadException(loadingValueReference.elapsedNanos());
                        removeLoadingValue(k11, i11, loadingValueReference);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                v11 = null;
            }
        }

        public ReferenceEntry<K, V> getEntry(Object obj, int i11) {
            for (ReferenceEntry<K, V> first = getFirst(i11); first != null; first = first.getNext()) {
                if (first.getHash() == i11) {
                    K key = first.getKey();
                    if (key == null) {
                        tryDrainReferenceQueues();
                    } else if (this.map.keyEquivalence.equivalent(obj, key)) {
                        return first;
                    }
                }
            }
            return null;
        }

        public ReferenceEntry<K, V> getLiveEntry(Object obj, int i11, long j11) {
            ReferenceEntry<K, V> entry = getEntry(obj, i11);
            if (entry == null) {
                return null;
            }
            if (this.map.isExpired(entry, j11)) {
                tryExpireEntries(j11);
                return null;
            }
            return entry;
        }

        public V getLiveValue(ReferenceEntry<K, V> referenceEntry, long j11) {
            if (referenceEntry.getKey() == null) {
                tryDrainReferenceQueues();
                return null;
            }
            V v11 = referenceEntry.getValueReference().get();
            if (v11 == null) {
                tryDrainReferenceQueues();
                return null;
            }
            if (this.map.isExpired(referenceEntry, j11)) {
                tryExpireEntries(j11);
                return null;
            }
            return v11;
        }

        public void initTable(AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray) {
            this.threshold = (atomicReferenceArray.length() * 3) / 4;
            if (!this.map.customWeigher()) {
                int i11 = this.threshold;
                if (i11 == this.maxSegmentWeight) {
                    this.threshold = i11 + 1;
                }
            }
            this.table = atomicReferenceArray;
        }

        public LoadingValueReference<K, V> insertLoadingValueReference(K k11, int i11, boolean z11) {
            lock();
            try {
                long j11 = this.map.ticker.read();
                preWriteCleanup(j11);
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i11;
                ReferenceEntry<K, V> referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
                for (ReferenceEntry next = referenceEntry; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i11 && key != null && this.map.keyEquivalence.equivalent(k11, key)) {
                        ValueReference<K, V> valueReference = next.getValueReference();
                        if (!valueReference.isLoading() && (!z11 || j11 - next.getWriteTime() >= this.map.refreshNanos)) {
                            this.modCount++;
                            LoadingValueReference<K, V> loadingValueReference = new LoadingValueReference<>(valueReference);
                            next.setValueReference(loadingValueReference);
                            return loadingValueReference;
                        }
                        return null;
                    }
                }
                this.modCount++;
                LoadingValueReference<K, V> loadingValueReference2 = new LoadingValueReference<>();
                ReferenceEntry<K, V> referenceEntryNewEntry = newEntry(k11, i11, referenceEntry);
                referenceEntryNewEntry.setValueReference(loadingValueReference2);
                atomicReferenceArray.set(length, referenceEntryNewEntry);
                return loadingValueReference2;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        public ListenableFuture<V> loadAsync(final K k11, final int i11, final LoadingValueReference<K, V> loadingValueReference, CacheLoader<? super K, V> cacheLoader) {
            final ListenableFuture<V> listenableFutureLoadFuture = loadingValueReference.loadFuture(k11, cacheLoader);
            listenableFutureLoadFuture.addListener(new Runnable() { // from class: com.google.common.cache.c
                @Override // java.lang.Runnable
                public final void run() {
                    LocalCache.Segment.m13389a(this.f12244b, k11, i11, loadingValueReference, listenableFutureLoadFuture);
                }
            }, MoreExecutors.directExecutor());
            return listenableFutureLoadFuture;
        }

        public V loadSync(K k11, int i11, LoadingValueReference<K, V> loadingValueReference, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            return getAndRecordStats(k11, i11, loadingValueReference, loadingValueReference.loadFuture(k11, cacheLoader));
        }

        public void postWriteCleanup() {
            runUnlockedCleanup();
        }

        @GuardedBy("this")
        public void preWriteCleanup(long j11) {
            runLockedCleanup(j11);
        }

        @CanIgnoreReturnValue
        public V put(K k11, int i11, V v11, boolean z11) {
            ReferenceEntry<K, V> referenceEntry;
            int i12;
            lock();
            try {
                long j11 = this.map.ticker.read();
                preWriteCleanup(j11);
                if (this.count + 1 > this.threshold) {
                    expand();
                }
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = i11 & (atomicReferenceArray.length() - 1);
                ReferenceEntry<K, V> referenceEntry2 = atomicReferenceArray.get(length);
                ReferenceEntry<K, V> next = referenceEntry2;
                while (next != null) {
                    K key = next.getKey();
                    if (next.getHash() == i11 && key != null && this.map.keyEquivalence.equivalent(k11, key)) {
                        ValueReference<K, V> valueReference = next.getValueReference();
                        V v12 = valueReference.get();
                        if (v12 == null) {
                            this.modCount++;
                            if (valueReference.isActive()) {
                                enqueueNotification(k11, i11, v12, valueReference.getWeight(), RemovalCause.COLLECTED);
                                ReferenceEntry<K, V> referenceEntry3 = next;
                                setValue(referenceEntry3, k11, v11, j11);
                                i12 = this.count;
                                referenceEntry = referenceEntry3;
                            } else {
                                ReferenceEntry<K, V> referenceEntry4 = next;
                                setValue(referenceEntry4, k11, v11, j11);
                                referenceEntry = referenceEntry4;
                                i12 = this.count + 1;
                            }
                            this.count = i12;
                            evictEntries(referenceEntry);
                            return null;
                        }
                        long j12 = j11;
                        ReferenceEntry<K, V> referenceEntry5 = next;
                        if (z11) {
                            recordLockedRead(referenceEntry5, j12);
                            return v12;
                        }
                        this.modCount++;
                        enqueueNotification(k11, i11, v12, valueReference.getWeight(), RemovalCause.REPLACED);
                        setValue(referenceEntry5, k11, v11, j12);
                        evictEntries(referenceEntry5);
                        return v12;
                    }
                    long j13 = j11;
                    next = next.getNext();
                    j11 = j13;
                }
                this.modCount++;
                ReferenceEntry<K, V> referenceEntryNewEntry = newEntry(k11, i11, referenceEntry2);
                setValue(referenceEntryNewEntry, k11, v11, j11);
                atomicReferenceArray.set(length, referenceEntryNewEntry);
                this.count++;
                evictEntries(referenceEntryNewEntry);
                return null;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        @CanIgnoreReturnValue
        public boolean reclaimKey(ReferenceEntry<K, V> referenceEntry, int i11) throws Throwable {
            lock();
            try {
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i11;
                ReferenceEntry<K, V> referenceEntry2 = atomicReferenceArray.get(length);
                ReferenceEntry<K, V> next = referenceEntry2;
                while (next != null) {
                    if (next == referenceEntry) {
                        this.modCount++;
                        ReferenceEntry<K, V> referenceEntryRemoveValueFromChain = removeValueFromChain(referenceEntry2, next, next.getKey(), i11, next.getValueReference().get(), next.getValueReference(), RemovalCause.COLLECTED);
                        int i12 = this.count - 1;
                        atomicReferenceArray.set(length, referenceEntryRemoveValueFromChain);
                        this.count = i12;
                        unlock();
                        postWriteCleanup();
                        return true;
                    }
                    int i13 = i11;
                    try {
                        next = next.getNext();
                        i11 = i13;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    th = th2;
                    Throwable th3 = th;
                    unlock();
                    postWriteCleanup();
                    throw th3;
                }
                unlock();
                postWriteCleanup();
                return false;
            } catch (Throwable th4) {
                th = th4;
            }
        }

        @CanIgnoreReturnValue
        public boolean reclaimValue(K k11, int i11, ValueReference<K, V> valueReference) throws Throwable {
            lock();
            try {
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i11;
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry<K, V> next = referenceEntry;
                while (next != null) {
                    K key = next.getKey();
                    if (next.getHash() == i11 && key != null && this.map.keyEquivalence.equivalent(k11, key)) {
                        if (next.getValueReference() == valueReference) {
                            this.modCount++;
                            ReferenceEntry<K, V> referenceEntryRemoveValueFromChain = removeValueFromChain(referenceEntry, next, key, i11, valueReference.get(), valueReference, RemovalCause.COLLECTED);
                            int i12 = this.count - 1;
                            atomicReferenceArray.set(length, referenceEntryRemoveValueFromChain);
                            this.count = i12;
                            unlock();
                            if (!isHeldByCurrentThread()) {
                                postWriteCleanup();
                            }
                            return true;
                        }
                        unlock();
                        if (!isHeldByCurrentThread()) {
                            postWriteCleanup();
                        }
                        return false;
                    }
                    int i13 = i11;
                    ValueReference<K, V> valueReference2 = valueReference;
                    try {
                        next = next.getNext();
                        i11 = i13;
                        valueReference = valueReference2;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    th = th2;
                    Throwable th3 = th;
                    unlock();
                    if (!isHeldByCurrentThread()) {
                        postWriteCleanup();
                        throw th3;
                    }
                    throw th3;
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    postWriteCleanup();
                }
                return false;
            } catch (Throwable th4) {
                th = th4;
            }
        }

        @GuardedBy("this")
        public void recordWrite(ReferenceEntry<K, V> referenceEntry, int i11, long j11) {
            drainRecencyQueue();
            this.totalWeight += (long) i11;
            if (this.map.recordsAccess()) {
                referenceEntry.setAccessTime(j11);
            }
            if (this.map.recordsWrite()) {
                referenceEntry.setWriteTime(j11);
            }
            this.accessQueue.add(referenceEntry);
            this.writeQueue.add(referenceEntry);
        }

        @CanIgnoreReturnValue
        public V refresh(K k11, int i11, CacheLoader<? super K, V> cacheLoader, boolean z11) {
            LoadingValueReference<K, V> loadingValueReferenceInsertLoadingValueReference = insertLoadingValueReference(k11, i11, z11);
            if (loadingValueReferenceInsertLoadingValueReference == null) {
                return null;
            }
            ListenableFuture<V> listenableFutureLoadAsync = loadAsync(k11, i11, loadingValueReferenceInsertLoadingValueReference, cacheLoader);
            if (listenableFutureLoadAsync.isDone()) {
                try {
                    return (V) Uninterruptibles.getUninterruptibly(listenableFutureLoadAsync);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        @GuardedBy("this")
        public void removeCollectedEntry(ReferenceEntry<K, V> referenceEntry) {
            enqueueNotification(referenceEntry.getKey(), referenceEntry.getHash(), referenceEntry.getValueReference().get(), referenceEntry.getValueReference().getWeight(), RemovalCause.COLLECTED);
            this.writeQueue.remove(referenceEntry);
            this.accessQueue.remove(referenceEntry);
        }

        @CanIgnoreReturnValue
        public boolean removeLoadingValue(K k11, int i11, LoadingValueReference<K, V> loadingValueReference) {
            lock();
            try {
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i11;
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                for (ReferenceEntry<K, V> next = referenceEntry; next != null; next = next.getNext()) {
                    K key = next.getKey();
                    if (next.getHash() == i11 && key != null && this.map.keyEquivalence.equivalent(k11, key)) {
                        if (next.getValueReference() != loadingValueReference) {
                            break;
                        }
                        if (loadingValueReference.isActive()) {
                            next.setValueReference(loadingValueReference.getOldValue());
                        } else {
                            atomicReferenceArray.set(length, removeEntryFromChain(referenceEntry, next));
                        }
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        @GuardedBy("this")
        public ReferenceEntry<K, V> removeValueFromChain(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k11, int i11, V v11, ValueReference<K, V> valueReference, RemovalCause removalCause) {
            enqueueNotification(k11, i11, v11, valueReference.getWeight(), removalCause);
            this.writeQueue.remove(referenceEntry2);
            this.accessQueue.remove(referenceEntry2);
            if (valueReference.isLoading()) {
                valueReference.notifyNewValue(null);
                return referenceEntry;
            }
            return removeEntryFromChain(referenceEntry, referenceEntry2);
        }

        public void runLockedCleanup(long j11) {
            if (tryLock()) {
                try {
                    drainReferenceQueues();
                    expireEntries(j11);
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public void runUnlockedCleanup() {
            if (!isHeldByCurrentThread()) {
                this.map.processPendingNotifications();
            }
        }

        @GuardedBy("this")
        public void setValue(ReferenceEntry<K, V> referenceEntry, K k11, V v11, long j11) {
            boolean z11;
            ValueReference<K, V> valueReference = referenceEntry.getValueReference();
            int iWeigh = this.map.weigher.weigh(k11, v11);
            if (iWeigh >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Preconditions.checkState(z11, "Weights must be non-negative");
            referenceEntry.setValueReference(this.map.valueStrength.referenceValue(this, referenceEntry, v11, iWeigh));
            recordWrite(referenceEntry, iWeigh, j11);
            valueReference.notifyNewValue(v11);
        }

        @CanIgnoreReturnValue
        public boolean storeLoadedValue(K k11, int i11, LoadingValueReference<K, V> loadingValueReference, V v11) {
            RemovalCause removalCause;
            lock();
            try {
                long j11 = this.map.ticker.read();
                preWriteCleanup(j11);
                int i12 = this.count + 1;
                if (i12 > this.threshold) {
                    expand();
                    i12 = this.count + 1;
                }
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = i11 & (atomicReferenceArray.length() - 1);
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                for (ReferenceEntry<K, V> next = referenceEntry; next != null; next = next.getNext()) {
                    K key = next.getKey();
                    if (next.getHash() == i11 && key != null && this.map.keyEquivalence.equivalent(k11, key)) {
                        ValueReference<K, V> valueReference = next.getValueReference();
                        V v12 = valueReference.get();
                        if (loadingValueReference != valueReference && (v12 != null || valueReference == LocalCache.UNSET)) {
                            enqueueNotification(k11, i11, v11, 0, RemovalCause.REPLACED);
                            return false;
                        }
                        this.modCount++;
                        if (loadingValueReference.isActive()) {
                            if (v12 == null) {
                                removalCause = RemovalCause.COLLECTED;
                            } else {
                                removalCause = RemovalCause.REPLACED;
                            }
                            enqueueNotification(k11, i11, v12, loadingValueReference.getWeight(), removalCause);
                            i12--;
                        }
                        ReferenceEntry<K, V> referenceEntry2 = next;
                        setValue(referenceEntry2, k11, v11, j11);
                        this.count = i12;
                        evictEntries(referenceEntry2);
                        return true;
                    }
                }
                this.modCount++;
                ReferenceEntry<K, V> referenceEntryNewEntry = newEntry(k11, i11, referenceEntry);
                setValue(referenceEntryNewEntry, k11, v11, j11);
                atomicReferenceArray.set(length, referenceEntryNewEntry);
                this.count = i12;
                evictEntries(referenceEntryNewEntry);
                return true;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        public void tryDrainReferenceQueues() {
            if (tryLock()) {
                try {
                    drainReferenceQueues();
                } finally {
                    unlock();
                }
            }
        }

        public void tryExpireEntries(long j11) {
            if (tryLock()) {
                try {
                    expireEntries(j11);
                } finally {
                    unlock();
                }
            }
        }

        public V waitForLoadingValue(ReferenceEntry<K, V> referenceEntry, K k11, ValueReference<K, V> valueReference) throws ExecutionException {
            if (valueReference.isLoading()) {
                Preconditions.checkState(!Thread.holdsLock(referenceEntry), "Recursive load of: %s", k11);
                try {
                    V vWaitForValue = valueReference.waitForValue();
                    if (vWaitForValue != null) {
                        recordRead(referenceEntry, this.map.ticker.read());
                        this.statsCounter.recordMisses(1);
                        return vWaitForValue;
                    }
                    throw new CacheLoader.InvalidCacheLoadException("CacheLoader returned null for key " + k11 + C33978va.f72339h);
                } catch (Throwable th2) {
                    this.statsCounter.recordMisses(1);
                    throw th2;
                }
            }
            throw new AssertionError();
        }

        public V get(Object obj, int i11) {
            try {
                if (this.count != 0) {
                    long j11 = this.map.ticker.read();
                    ReferenceEntry<K, V> liveEntry = getLiveEntry(obj, i11, j11);
                    if (liveEntry == null) {
                        return null;
                    }
                    V v11 = liveEntry.getValueReference().get();
                    if (v11 != null) {
                        recordRead(liveEntry, j11);
                        return scheduleRefresh(liveEntry, liveEntry.getKey(), i11, v11, j11, this.map.defaultLoader);
                    }
                    tryDrainReferenceQueues();
                }
                return null;
            } finally {
                postReadCleanup();
            }
        }

        public boolean remove(Object obj, int i11, Object obj2) throws Throwable {
            Throwable th2;
            RemovalCause removalCause;
            lock();
            try {
                preWriteCleanup(this.map.ticker.read());
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i11;
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry<K, V> next = referenceEntry;
                while (next != null) {
                    K key = next.getKey();
                    if (next.getHash() == i11 && key != null && this.map.keyEquivalence.equivalent(obj, key)) {
                        ValueReference<K, V> valueReference = next.getValueReference();
                        V v11 = valueReference.get();
                        if (this.map.valueEquivalence.equivalent(obj2, v11)) {
                            try {
                                removalCause = RemovalCause.EXPLICIT;
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                        } else {
                            if (v11 != null || !valueReference.isActive()) {
                                break;
                                break;
                            }
                            removalCause = RemovalCause.COLLECTED;
                        }
                        RemovalCause removalCause2 = removalCause;
                        this.modCount++;
                        ReferenceEntry<K, V> referenceEntryRemoveValueFromChain = removeValueFromChain(referenceEntry, next, key, i11, v11, valueReference, removalCause2);
                        int i12 = this.count - 1;
                        atomicReferenceArray.set(length, referenceEntryRemoveValueFromChain);
                        this.count = i12;
                        boolean z11 = removalCause2 == RemovalCause.EXPLICIT;
                        unlock();
                        postWriteCleanup();
                        return z11;
                    }
                    int i13 = i11;
                    try {
                        next = next.getNext();
                        i11 = i13;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    th = th4;
                    th2 = th;
                    unlock();
                    postWriteCleanup();
                    throw th2;
                }
                unlock();
                postWriteCleanup();
                return false;
            } catch (Throwable th5) {
                th = th5;
            }
        }

        public V replace(K k11, int i11, V v11) {
            lock();
            try {
                long j11 = this.map.ticker.read();
                preWriteCleanup(j11);
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = i11 & (atomicReferenceArray.length() - 1);
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry<K, V> next = referenceEntry;
                while (next != null) {
                    K key = next.getKey();
                    if (next.getHash() == i11 && key != null && this.map.keyEquivalence.equivalent(k11, key)) {
                        long j12 = j11;
                        ValueReference<K, V> valueReference = next.getValueReference();
                        V v12 = valueReference.get();
                        if (v12 == null) {
                            if (!valueReference.isActive()) {
                                break;
                            }
                            this.modCount++;
                            ReferenceEntry<K, V> referenceEntryRemoveValueFromChain = removeValueFromChain(referenceEntry, next, key, i11, v12, valueReference, RemovalCause.COLLECTED);
                            int i12 = this.count - 1;
                            atomicReferenceArray.set(length, referenceEntryRemoveValueFromChain);
                            this.count = i12;
                            break;
                        }
                        ReferenceEntry<K, V> referenceEntry2 = next;
                        this.modCount++;
                        enqueueNotification(k11, i11, v12, valueReference.getWeight(), RemovalCause.REPLACED);
                        setValue(referenceEntry2, k11, v11, j12);
                        evictEntries(referenceEntry2);
                        unlock();
                        postWriteCleanup();
                        return v12;
                    }
                    ReferenceEntry<K, V> referenceEntry3 = referenceEntry;
                    long j13 = j11;
                    next = next.getNext();
                    referenceEntry = referenceEntry3;
                    j11 = j13;
                }
                unlock();
                postWriteCleanup();
                return null;
            } catch (Throwable th2) {
                unlock();
                postWriteCleanup();
                throw th2;
            }
        }
    }

    public static class SoftValueReference<K, V> extends SoftReference<V> implements ValueReference<K, V> {
        final ReferenceEntry<K, V> entry;

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v11, ReferenceEntry<K, V> referenceEntry) {
            return new SoftValueReference(referenceQueue, v11, referenceEntry);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<K, V> getEntry() {
            return this.entry;
        }

        public SoftValueReference(ReferenceQueue<V> referenceQueue, V v11, ReferenceEntry<K, V> referenceEntry) {
            super(v11, referenceQueue);
            this.entry = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() {
            return get();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V v11) {
        }
    }

    public enum Strength {
        STRONG { // from class: com.google.common.cache.LocalCache.Strength.1
            @Override // com.google.common.cache.LocalCache.Strength
            public <K, V> ValueReference<K, V> referenceValue(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v11, int i11) {
                return i11 == 1 ? new StrongValueReference(v11) : new WeightedStrongValueReference(v11, i11);
            }

            @Override // com.google.common.cache.LocalCache.Strength
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.equals();
            }
        },
        SOFT { // from class: com.google.common.cache.LocalCache.Strength.2
            @Override // com.google.common.cache.LocalCache.Strength
            public <K, V> ValueReference<K, V> referenceValue(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v11, int i11) {
                return i11 == 1 ? new SoftValueReference(segment.valueReferenceQueue, v11, referenceEntry) : new WeightedSoftValueReference(segment.valueReferenceQueue, v11, referenceEntry, i11);
            }

            @Override // com.google.common.cache.LocalCache.Strength
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.identity();
            }
        },
        WEAK { // from class: com.google.common.cache.LocalCache.Strength.3
            @Override // com.google.common.cache.LocalCache.Strength
            public <K, V> ValueReference<K, V> referenceValue(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v11, int i11) {
                return i11 == 1 ? new WeakValueReference(segment.valueReferenceQueue, v11, referenceEntry) : new WeightedWeakValueReference(segment.valueReferenceQueue, v11, referenceEntry, i11);
            }

            @Override // com.google.common.cache.LocalCache.Strength
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.identity();
            }
        };

        public abstract Equivalence<Object> defaultEquivalence();

        public abstract <K, V> ValueReference<K, V> referenceValue(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v11, int i11);
    }

    public static final class StrongAccessEntry<K, V> extends StrongEntry<K, V> {
        volatile long accessTime;

        @Weak
        ReferenceEntry<K, V> nextAccess;

        @Weak
        ReferenceEntry<K, V> previousAccess;

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return this.accessTime;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.nextAccess;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.previousAccess;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j11) {
            this.accessTime = j11;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextAccess = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousAccess = referenceEntry;
        }

        public StrongAccessEntry(K k11, int i11, ReferenceEntry<K, V> referenceEntry) {
            super(k11, i11, referenceEntry);
            this.accessTime = Long.MAX_VALUE;
            this.nextAccess = LocalCache.nullEntry();
            this.previousAccess = LocalCache.nullEntry();
        }
    }

    public static final class StrongAccessWriteEntry<K, V> extends StrongEntry<K, V> {
        volatile long accessTime;

        @Weak
        ReferenceEntry<K, V> nextAccess;

        @Weak
        ReferenceEntry<K, V> nextWrite;

        @Weak
        ReferenceEntry<K, V> previousAccess;

        @Weak
        ReferenceEntry<K, V> previousWrite;
        volatile long writeTime;

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return this.accessTime;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.nextAccess;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.nextWrite;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.previousAccess;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.previousWrite;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return this.writeTime;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j11) {
            this.accessTime = j11;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextAccess = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextWrite = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousAccess = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousWrite = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j11) {
            this.writeTime = j11;
        }

        public StrongAccessWriteEntry(K k11, int i11, ReferenceEntry<K, V> referenceEntry) {
            super(k11, i11, referenceEntry);
            this.accessTime = Long.MAX_VALUE;
            this.nextAccess = LocalCache.nullEntry();
            this.previousAccess = LocalCache.nullEntry();
            this.writeTime = Long.MAX_VALUE;
            this.nextWrite = LocalCache.nullEntry();
            this.previousWrite = LocalCache.nullEntry();
        }
    }

    public static class StrongEntry<K, V> extends AbstractReferenceEntry<K, V> {
        final int hash;
        final K key;
        final ReferenceEntry<K, V> next;
        volatile ValueReference<K, V> valueReference = LocalCache.unset();

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public int getHash() {
            return this.hash;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public K getKey() {
            return this.key;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNext() {
            return this.next;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ValueReference<K, V> getValueReference() {
            return this.valueReference;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setValueReference(ValueReference<K, V> valueReference) {
            this.valueReference = valueReference;
        }

        public StrongEntry(K k11, int i11, ReferenceEntry<K, V> referenceEntry) {
            this.key = k11;
            this.hash = i11;
            this.next = referenceEntry;
        }
    }

    public static class StrongValueReference<K, V> implements ValueReference<K, V> {
        final V referent;

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<K, V> getEntry() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V get() {
            return this.referent;
        }

        public StrongValueReference(V v11) {
            this.referent = v11;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() {
            return get();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V v11) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v11, ReferenceEntry<K, V> referenceEntry) {
            return this;
        }
    }

    public static final class StrongWriteEntry<K, V> extends StrongEntry<K, V> {

        @Weak
        ReferenceEntry<K, V> nextWrite;

        @Weak
        ReferenceEntry<K, V> previousWrite;
        volatile long writeTime;

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.nextWrite;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.previousWrite;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return this.writeTime;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextWrite = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousWrite = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j11) {
            this.writeTime = j11;
        }

        public StrongWriteEntry(K k11, int i11, ReferenceEntry<K, V> referenceEntry) {
            super(k11, i11, referenceEntry);
            this.writeTime = Long.MAX_VALUE;
            this.nextWrite = LocalCache.nullEntry();
            this.previousWrite = LocalCache.nullEntry();
        }
    }

    public final class ValueIterator extends LocalCache<K, V>.HashIterator<V> {
        public ValueIterator() {
            super();
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public V next() {
            return nextEntry().getValue();
        }
    }

    public interface ValueReference<K, V> {
        ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v11, ReferenceEntry<K, V> referenceEntry);

        V get();

        ReferenceEntry<K, V> getEntry();

        int getWeight();

        boolean isActive();

        boolean isLoading();

        void notifyNewValue(V v11);

        V waitForValue() throws ExecutionException;
    }

    public final class Values extends AbstractCollection<V> {
        public Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() throws Throwable {
            LocalCache.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return LocalCache.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return LocalCache.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new ValueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return LocalCache.this.size();
        }
    }

    public static final class WeakAccessEntry<K, V> extends WeakEntry<K, V> {
        volatile long accessTime;

        @Weak
        ReferenceEntry<K, V> nextAccess;

        @Weak
        ReferenceEntry<K, V> previousAccess;

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return this.accessTime;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.nextAccess;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.previousAccess;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j11) {
            this.accessTime = j11;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextAccess = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousAccess = referenceEntry;
        }

        public WeakAccessEntry(ReferenceQueue<K> referenceQueue, K k11, int i11, ReferenceEntry<K, V> referenceEntry) {
            super(referenceQueue, k11, i11, referenceEntry);
            this.accessTime = Long.MAX_VALUE;
            this.nextAccess = LocalCache.nullEntry();
            this.previousAccess = LocalCache.nullEntry();
        }
    }

    public static final class WeakAccessWriteEntry<K, V> extends WeakEntry<K, V> {
        volatile long accessTime;

        @Weak
        ReferenceEntry<K, V> nextAccess;

        @Weak
        ReferenceEntry<K, V> nextWrite;

        @Weak
        ReferenceEntry<K, V> previousAccess;

        @Weak
        ReferenceEntry<K, V> previousWrite;
        volatile long writeTime;

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return this.accessTime;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.nextAccess;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.nextWrite;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.previousAccess;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.previousWrite;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return this.writeTime;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j11) {
            this.accessTime = j11;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextAccess = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextWrite = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousAccess = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousWrite = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j11) {
            this.writeTime = j11;
        }

        public WeakAccessWriteEntry(ReferenceQueue<K> referenceQueue, K k11, int i11, ReferenceEntry<K, V> referenceEntry) {
            super(referenceQueue, k11, i11, referenceEntry);
            this.accessTime = Long.MAX_VALUE;
            this.nextAccess = LocalCache.nullEntry();
            this.previousAccess = LocalCache.nullEntry();
            this.writeTime = Long.MAX_VALUE;
            this.nextWrite = LocalCache.nullEntry();
            this.previousWrite = LocalCache.nullEntry();
        }
    }

    public static class WeakEntry<K, V> extends WeakReference<K> implements ReferenceEntry<K, V> {
        final int hash;
        final ReferenceEntry<K, V> next;
        volatile ValueReference<K, V> valueReference;

        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
            return this.hash;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNext() {
            return this.next;
        }

        public ReferenceEntry<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ValueReference<K, V> getValueReference() {
            return this.valueReference;
        }

        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        public void setAccessTime(long j11) {
            throw new UnsupportedOperationException();
        }

        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(ValueReference<K, V> valueReference) {
            this.valueReference = valueReference;
        }

        public void setWriteTime(long j11) {
            throw new UnsupportedOperationException();
        }

        public WeakEntry(ReferenceQueue<K> referenceQueue, K k11, int i11, ReferenceEntry<K, V> referenceEntry) {
            super(k11, referenceQueue);
            this.valueReference = LocalCache.unset();
            this.hash = i11;
            this.next = referenceEntry;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public K getKey() {
            return get();
        }
    }

    public static class WeakValueReference<K, V> extends WeakReference<V> implements ValueReference<K, V> {
        final ReferenceEntry<K, V> entry;

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v11, ReferenceEntry<K, V> referenceEntry) {
            return new WeakValueReference(referenceQueue, v11, referenceEntry);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<K, V> getEntry() {
            return this.entry;
        }

        public WeakValueReference(ReferenceQueue<V> referenceQueue, V v11, ReferenceEntry<K, V> referenceEntry) {
            super(v11, referenceQueue);
            this.entry = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() {
            return get();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V v11) {
        }
    }

    public static final class WeakWriteEntry<K, V> extends WeakEntry<K, V> {

        @Weak
        ReferenceEntry<K, V> nextWrite;

        @Weak
        ReferenceEntry<K, V> previousWrite;
        volatile long writeTime;

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.nextWrite;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.previousWrite;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return this.writeTime;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextWrite = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousWrite = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j11) {
            this.writeTime = j11;
        }

        public WeakWriteEntry(ReferenceQueue<K> referenceQueue, K k11, int i11, ReferenceEntry<K, V> referenceEntry) {
            super(referenceQueue, k11, i11, referenceEntry);
            this.writeTime = Long.MAX_VALUE;
            this.nextWrite = LocalCache.nullEntry();
            this.previousWrite = LocalCache.nullEntry();
        }
    }

    public static final class WeightedSoftValueReference<K, V> extends SoftValueReference<K, V> {
        final int weight;

        @Override // com.google.common.cache.LocalCache.SoftValueReference, com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v11, ReferenceEntry<K, V> referenceEntry) {
            return new WeightedSoftValueReference(referenceQueue, v11, referenceEntry, this.weight);
        }

        @Override // com.google.common.cache.LocalCache.SoftValueReference, com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return this.weight;
        }

        public WeightedSoftValueReference(ReferenceQueue<V> referenceQueue, V v11, ReferenceEntry<K, V> referenceEntry, int i11) {
            super(referenceQueue, v11, referenceEntry);
            this.weight = i11;
        }
    }

    public static final class WeightedStrongValueReference<K, V> extends StrongValueReference<K, V> {
        final int weight;

        @Override // com.google.common.cache.LocalCache.StrongValueReference, com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return this.weight;
        }

        public WeightedStrongValueReference(V v11, int i11) {
            super(v11);
            this.weight = i11;
        }
    }

    public static final class WeightedWeakValueReference<K, V> extends WeakValueReference<K, V> {
        final int weight;

        @Override // com.google.common.cache.LocalCache.WeakValueReference, com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v11, ReferenceEntry<K, V> referenceEntry) {
            return new WeightedWeakValueReference(referenceQueue, v11, referenceEntry, this.weight);
        }

        @Override // com.google.common.cache.LocalCache.WeakValueReference, com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return this.weight;
        }

        public WeightedWeakValueReference(ReferenceQueue<V> referenceQueue, V v11, ReferenceEntry<K, V> referenceEntry, int i11) {
            super(referenceQueue, v11, referenceEntry);
            this.weight = i11;
        }
    }

    public static final class WriteQueue<K, V> extends AbstractQueue<ReferenceEntry<K, V>> {
        final ReferenceEntry<K, V> head = new AbstractReferenceEntry<K, V>() { // from class: com.google.common.cache.LocalCache.WriteQueue.1

            @Weak
            ReferenceEntry<K, V> nextWrite = this;

            @Weak
            ReferenceEntry<K, V> previousWrite = this;

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public ReferenceEntry<K, V> getNextInWriteQueue() {
                return this.nextWrite;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public ReferenceEntry<K, V> getPreviousInWriteQueue() {
                return this.previousWrite;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
                this.nextWrite = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
                this.previousWrite = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public long getWriteTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setWriteTime(long j11) {
            }
        };

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            ReferenceEntry<K, V> nextInWriteQueue = this.head.getNextInWriteQueue();
            while (true) {
                ReferenceEntry<K, V> referenceEntry = this.head;
                if (nextInWriteQueue == referenceEntry) {
                    referenceEntry.setNextInWriteQueue(referenceEntry);
                    ReferenceEntry<K, V> referenceEntry2 = this.head;
                    referenceEntry2.setPreviousInWriteQueue(referenceEntry2);
                    return;
                } else {
                    ReferenceEntry<K, V> nextInWriteQueue2 = nextInWriteQueue.getNextInWriteQueue();
                    LocalCache.nullifyWriteOrder(nextInWriteQueue);
                    nextInWriteQueue = nextInWriteQueue2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((ReferenceEntry) obj).getNextInWriteQueue() != NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.head.getNextInWriteQueue() == this.head;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<ReferenceEntry<K, V>> iterator() {
            return new AbstractSequentialIterator<ReferenceEntry<K, V>>(peek()) { // from class: com.google.common.cache.LocalCache.WriteQueue.2
                @Override // com.google.common.collect.AbstractSequentialIterator
                public ReferenceEntry<K, V> computeNext(ReferenceEntry<K, V> referenceEntry) {
                    ReferenceEntry<K, V> nextInWriteQueue = referenceEntry.getNextInWriteQueue();
                    if (nextInWriteQueue == WriteQueue.this.head) {
                        return null;
                    }
                    return nextInWriteQueue;
                }
            };
        }

        @Override // java.util.Queue
        public boolean offer(ReferenceEntry<K, V> referenceEntry) {
            LocalCache.connectWriteOrder(referenceEntry.getPreviousInWriteQueue(), referenceEntry.getNextInWriteQueue());
            LocalCache.connectWriteOrder(this.head.getPreviousInWriteQueue(), referenceEntry);
            LocalCache.connectWriteOrder(referenceEntry, this.head);
            return true;
        }

        @Override // java.util.Queue
        public ReferenceEntry<K, V> peek() {
            ReferenceEntry<K, V> nextInWriteQueue = this.head.getNextInWriteQueue();
            if (nextInWriteQueue == this.head) {
                return null;
            }
            return nextInWriteQueue;
        }

        @Override // java.util.Queue
        public ReferenceEntry<K, V> poll() {
            ReferenceEntry<K, V> nextInWriteQueue = this.head.getNextInWriteQueue();
            if (nextInWriteQueue == this.head) {
                return null;
            }
            remove(nextInWriteQueue);
            return nextInWriteQueue;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        @CanIgnoreReturnValue
        public boolean remove(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry<K, V> previousInWriteQueue = referenceEntry.getPreviousInWriteQueue();
            ReferenceEntry<K, V> nextInWriteQueue = referenceEntry.getNextInWriteQueue();
            LocalCache.connectWriteOrder(previousInWriteQueue, nextInWriteQueue);
            LocalCache.nullifyWriteOrder(referenceEntry);
            return nextInWriteQueue != NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i11 = 0;
            for (ReferenceEntry<K, V> nextInWriteQueue = this.head.getNextInWriteQueue(); nextInWriteQueue != this.head; nextInWriteQueue = nextInWriteQueue.getNextInWriteQueue()) {
                i11++;
            }
            return i11;
        }
    }

    public final class WriteThroughEntry implements Map.Entry<K, V> {
        final K key;
        V value;

        public WriteThroughEntry(K k11, V v11) {
            this.key = k11;
            this.value = v11;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (this.key.equals(entry.getKey()) && this.value.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.key.hashCode() ^ this.value.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v11) {
            V v12 = (V) LocalCache.this.put(this.key, v11);
            this.value = v11;
            return v12;
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).get(obj, iHash);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).remove(obj, iHash);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public boolean replace(K k11, V v11, V v12) {
        Preconditions.checkNotNull(k11);
        Preconditions.checkNotNull(v12);
        if (v11 == null) {
            return false;
        }
        int iHash = hash(k11);
        return segmentFor(iHash).replace(k11, iHash, v11, v12);
    }

    public static <E> Queue<E> discardingQueue() {
        return (Queue<E>) DISCARDING_QUEUE;
    }

    public static <K, V> ReferenceEntry<K, V> nullEntry() {
        return NullEntry.INSTANCE;
    }

    public static int rehash(int i11) {
        int i12 = i11 + ((i11 << 15) ^ (-12931));
        int i13 = i12 ^ (i12 >>> 10);
        int i14 = i13 + (i13 << 3);
        int i15 = i14 ^ (i14 >>> 6);
        int i16 = i15 + (i15 << 2) + (i15 << 14);
        return i16 ^ (i16 >>> 16);
    }

    public static <K, V> ValueReference<K, V> unset() {
        return (ValueReference<K, V>) UNSET;
    }

    public void cleanUp() {
        for (Segment<K, V> segment : this.segments) {
            segment.cleanUp();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() throws Throwable {
        for (Segment<K, V> segment : this.segments) {
            segment.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).containsKey(obj, iHash);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        int i11 = 0;
        if (obj == null) {
            return false;
        }
        long j11 = this.ticker.read();
        Segment<K, V>[] segmentArr = this.segments;
        long j12 = -1;
        int i12 = 0;
        while (i12 < 3) {
            int length = segmentArr.length;
            long j13 = 0;
            int i13 = i11 == true ? 1 : 0;
            while (i13 < length) {
                Segment<K, V> segment = segmentArr[i13];
                int i14 = segment.count;
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = segment.table;
                int i15 = i11;
                while (i15 < atomicReferenceArray.length()) {
                    ReferenceEntry<K, V> next = atomicReferenceArray.get(i15);
                    while (next != null) {
                        Segment<K, V>[] segmentArr2 = segmentArr;
                        V liveValue = segment.getLiveValue(next, j11);
                        ReferenceEntry<K, V> referenceEntry = next;
                        if (liveValue != null && this.valueEquivalence.equivalent(obj, liveValue)) {
                            return true;
                        }
                        next = referenceEntry.getNext();
                        segmentArr = segmentArr2;
                    }
                    i15++;
                }
                j13 += (long) segment.modCount;
                i13++;
                i11 = i15;
            }
            boolean z11 = i11;
            Segment<K, V>[] segmentArr3 = segmentArr;
            if (j13 == j12) {
                return z11;
            }
            i12++;
            j12 = j13;
            i11 = z11 ? 1 : 0;
            segmentArr = segmentArr3;
        }
        return i11 == true ? 1 : 0;
    }

    public Segment<K, V> createSegment(int i11, long j11, AbstractCache.StatsCounter statsCounter) {
        return new Segment<>(this, i11, j11, statsCounter);
    }

    public boolean customWeigher() {
        return this.weigher != CacheBuilder.OneWeigher.INSTANCE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @GwtIncompatible
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.entrySet = entrySet;
        return entrySet;
    }

    public boolean evictsBySize() {
        return this.maxWeight >= 0;
    }

    public boolean expiresAfterAccess() {
        return this.expireAfterAccessNanos > 0;
    }

    public boolean expiresAfterWrite() {
        return this.expireAfterWriteNanos > 0;
    }

    public ReferenceEntry<K, V> getEntry(Object obj) {
        if (obj == null) {
            return null;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).getEntry(obj, iHash);
    }

    public V getOrLoad(K k11) throws ExecutionException {
        return get(k11, this.defaultLoader);
    }

    public int hash(Object obj) {
        return rehash(this.keyEquivalence.hash(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        Segment<K, V>[] segmentArr = this.segments;
        long j11 = 0;
        for (Segment<K, V> segment : segmentArr) {
            if (segment.count != 0) {
                return false;
            }
            j11 += (long) segment.modCount;
        }
        if (j11 == 0) {
            return true;
        }
        for (Segment<K, V> segment2 : segmentArr) {
            if (segment2.count != 0) {
                return false;
            }
            j11 -= (long) segment2.modCount;
        }
        return j11 == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.keySet = keySet;
        return keySet;
    }

    public long longSize() {
        long jMax = 0;
        for (Segment<K, V> segment : this.segments) {
            jMax += (long) Math.max(0, segment.count);
        }
        return jMax;
    }

    public final Segment<K, V>[] newSegmentArray(int i11) {
        return new Segment[i11];
    }

    public void processPendingNotifications() {
        while (true) {
            RemovalNotification<K, V> removalNotificationPoll = this.removalNotificationQueue.poll();
            if (removalNotificationPoll == null) {
                return;
            }
            try {
                this.removalListener.onRemoval(removalNotificationPoll);
            } catch (Throwable th2) {
                logger.log(Level.WARNING, "Exception thrown by removal listener", th2);
            }
        }
    }

    public boolean refreshes() {
        return this.refreshNanos > 0;
    }

    public Segment<K, V> segmentFor(int i11) {
        return this.segments[(i11 >>> this.segmentShift) & this.segmentMask];
    }

    public boolean usesKeyReferences() {
        return this.keyStrength != Strength.STRONG;
    }

    public boolean usesValueReferences() {
        return this.valueStrength != Strength.STRONG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        Values values = new Values();
        this.values = values;
        return values;
    }

    public LocalCache(CacheBuilder<? super K, ? super V> cacheBuilder, CacheLoader<? super K, V> cacheLoader) {
        Queue<RemovalNotification<K, V>> concurrentLinkedQueue;
        this.concurrencyLevel = Math.min(cacheBuilder.getConcurrencyLevel(), 65536);
        Strength keyStrength = cacheBuilder.getKeyStrength();
        this.keyStrength = keyStrength;
        this.valueStrength = cacheBuilder.getValueStrength();
        this.keyEquivalence = cacheBuilder.getKeyEquivalence();
        this.valueEquivalence = cacheBuilder.getValueEquivalence();
        long maximumWeight = cacheBuilder.getMaximumWeight();
        this.maxWeight = maximumWeight;
        this.weigher = (Weigher<K, V>) cacheBuilder.getWeigher();
        this.expireAfterAccessNanos = cacheBuilder.getExpireAfterAccessNanos();
        this.expireAfterWriteNanos = cacheBuilder.getExpireAfterWriteNanos();
        this.refreshNanos = cacheBuilder.getRefreshNanos();
        CacheBuilder.NullListener nullListener = (RemovalListener<K, V>) cacheBuilder.getRemovalListener();
        this.removalListener = nullListener;
        if (nullListener == CacheBuilder.NullListener.INSTANCE) {
            concurrentLinkedQueue = discardingQueue();
        } else {
            concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        }
        this.removalNotificationQueue = concurrentLinkedQueue;
        this.ticker = cacheBuilder.getTicker(recordsTime());
        this.entryFactory = EntryFactory.getFactory(keyStrength, usesAccessEntries(), usesWriteEntries());
        this.globalStatsCounter = cacheBuilder.getStatsCounterSupplier().get();
        this.defaultLoader = cacheLoader;
        int iMin = Math.min(cacheBuilder.getInitialCapacity(), 1073741824);
        if (evictsBySize() && !customWeigher()) {
            iMin = (int) Math.min(iMin, maximumWeight);
        }
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        int i14 = 1;
        while (i14 < this.concurrencyLevel && (!evictsBySize() || ((long) i14) * 20 <= this.maxWeight)) {
            i13++;
            i14 <<= 1;
        }
        this.segmentShift = 32 - i13;
        this.segmentMask = i14 - 1;
        this.segments = newSegmentArray(i14);
        int i15 = iMin / i14;
        while (i12 < (i15 * i14 < iMin ? i15 + 1 : i15)) {
            i12 <<= 1;
        }
        if (evictsBySize()) {
            long j11 = this.maxWeight;
            long j12 = i14;
            long j13 = (j11 / j12) + 1;
            long j14 = j11 % j12;
            while (true) {
                Segment<K, V>[] segmentArr = this.segments;
                if (i11 < segmentArr.length) {
                    if (i11 == j14) {
                        j13--;
                    }
                    segmentArr[i11] = createSegment(i12, j13, cacheBuilder.getStatsCounterSupplier().get());
                    i11++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                Segment<K, V>[] segmentArr2 = this.segments;
                if (i11 < segmentArr2.length) {
                    segmentArr2[i11] = createSegment(i12, -1L, cacheBuilder.getStatsCounterSupplier().get());
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    public static <K, V> void connectAccessOrder(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        referenceEntry.setNextInAccessQueue(referenceEntry2);
        referenceEntry2.setPreviousInAccessQueue(referenceEntry);
    }

    public static <K, V> void connectWriteOrder(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        referenceEntry.setNextInWriteQueue(referenceEntry2);
        referenceEntry2.setPreviousInWriteQueue(referenceEntry);
    }

    public static <K, V> void nullifyAccessOrder(ReferenceEntry<K, V> referenceEntry) {
        ReferenceEntry<K, V> referenceEntryNullEntry = nullEntry();
        referenceEntry.setNextInAccessQueue(referenceEntryNullEntry);
        referenceEntry.setPreviousInAccessQueue(referenceEntryNullEntry);
    }

    public static <K, V> void nullifyWriteOrder(ReferenceEntry<K, V> referenceEntry) {
        ReferenceEntry<K, V> referenceEntryNullEntry = nullEntry();
        referenceEntry.setNextInWriteQueue(referenceEntryNullEntry);
        referenceEntry.setPreviousInWriteQueue(referenceEntryNullEntry);
    }

    @VisibleForTesting
    public ReferenceEntry<K, V> copyEntry(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        return segmentFor(referenceEntry.getHash()).copyEntry(referenceEntry, referenceEntry2);
    }

    public boolean expires() {
        if (!expiresAfterWrite() && !expiresAfterAccess()) {
            return false;
        }
        return true;
    }

    @CanIgnoreReturnValue
    public V get(K k11, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
        int iHash = hash(Preconditions.checkNotNull(k11));
        return segmentFor(iHash).get(k11, iHash, cacheLoader);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
        LinkedHashMap linkedHashMapNewLinkedHashMap = Maps.newLinkedHashMap();
        LinkedHashSet linkedHashSetNewLinkedHashSet = Sets.newLinkedHashSet();
        int i11 = 0;
        int i12 = 0;
        for (K k11 : iterable) {
            Object obj = get(k11);
            if (!linkedHashMapNewLinkedHashMap.containsKey(k11)) {
                linkedHashMapNewLinkedHashMap.put(k11, obj);
                if (obj == null) {
                    i12++;
                    linkedHashSetNewLinkedHashSet.add(k11);
                } else {
                    i11++;
                }
            }
        }
        try {
            if (!linkedHashSetNewLinkedHashSet.isEmpty()) {
                try {
                    Map mapLoadAll = loadAll(Collections.unmodifiableSet(linkedHashSetNewLinkedHashSet), this.defaultLoader);
                    for (Object obj2 : linkedHashSetNewLinkedHashSet) {
                        Object obj3 = mapLoadAll.get(obj2);
                        if (obj3 != null) {
                            linkedHashMapNewLinkedHashMap.put(obj2, obj3);
                        } else {
                            throw new CacheLoader.InvalidCacheLoadException("loadAll failed to return a value for " + obj2);
                        }
                    }
                } catch (CacheLoader.UnsupportedLoadingOperationException unused) {
                    for (Object obj4 : linkedHashSetNewLinkedHashSet) {
                        i12--;
                        linkedHashMapNewLinkedHashMap.put(obj4, get(obj4, this.defaultLoader));
                    }
                }
            }
            ImmutableMap<K, V> immutableMapCopyOf = ImmutableMap.copyOf((Map) linkedHashMapNewLinkedHashMap);
            this.globalStatsCounter.recordHits(i11);
            this.globalStatsCounter.recordMisses(i12);
            return immutableMapCopyOf;
        } catch (Throwable th2) {
            this.globalStatsCounter.recordHits(i11);
            this.globalStatsCounter.recordMisses(i12);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImmutableMap<K, V> getAllPresent(Iterable<?> iterable) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        int i11 = 0;
        int i12 = 0;
        for (Object obj : iterable) {
            V v11 = get(obj);
            if (v11 == null) {
                i12++;
            } else {
                builder.put(obj, v11);
                i11++;
            }
        }
        this.globalStatsCounter.recordHits(i11);
        this.globalStatsCounter.recordMisses(i12);
        return builder.buildKeepingLast();
    }

    public V getIfPresent(Object obj) {
        int iHash = hash(Preconditions.checkNotNull(obj));
        V v11 = segmentFor(iHash).get(obj, iHash);
        if (v11 == null) {
            this.globalStatsCounter.recordMisses(1);
            return v11;
        }
        this.globalStatsCounter.recordHits(1);
        return v11;
    }

    public V getLiveValue(ReferenceEntry<K, V> referenceEntry, long j11) {
        V v11;
        if (referenceEntry.getKey() == null || (v11 = referenceEntry.getValueReference().get()) == null || isExpired(referenceEntry, j11)) {
            return null;
        }
        return v11;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V getOrDefault(Object obj, V v11) {
        V v12 = get(obj);
        if (v12 != null) {
            return v12;
        }
        return v11;
    }

    public void invalidateAll(Iterable<?> iterable) {
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public boolean isExpired(ReferenceEntry<K, V> referenceEntry, long j11) {
        Preconditions.checkNotNull(referenceEntry);
        if (expiresAfterAccess() && j11 - referenceEntry.getAccessTime() >= this.expireAfterAccessNanos) {
            return true;
        }
        if (expiresAfterWrite() && j11 - referenceEntry.getWriteTime() >= this.expireAfterWriteNanos) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    public boolean isLive(ReferenceEntry<K, V> referenceEntry, long j11) {
        if (segmentFor(referenceEntry.getHash()).getLiveValue(referenceEntry, j11) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b9  */
    public Map<K, V> loadAll(Set<? extends K> set, CacheLoader<? super K, V> cacheLoader) throws Throwable {
        Preconditions.checkNotNull(cacheLoader);
        Preconditions.checkNotNull(set);
        Stopwatch stopwatchCreateStarted = Stopwatch.createStarted();
        boolean z11 = true;
        boolean z12 = false;
        try {
            try {
                try {
                    Map<? super K, V> mapLoadAll = cacheLoader.loadAll(set);
                    if (mapLoadAll != null) {
                        stopwatchCreateStarted.stop();
                        for (Map.Entry<K, V> entry : mapLoadAll.entrySet()) {
                            K key = entry.getKey();
                            V value = entry.getValue();
                            if (key != null && value != null) {
                                put(key, value);
                            } else {
                                z12 = true;
                            }
                        }
                        if (!z12) {
                            this.globalStatsCounter.recordLoadSuccess(stopwatchCreateStarted.elapsed(TimeUnit.NANOSECONDS));
                            return mapLoadAll;
                        }
                        this.globalStatsCounter.recordLoadException(stopwatchCreateStarted.elapsed(TimeUnit.NANOSECONDS));
                        throw new CacheLoader.InvalidCacheLoadException(cacheLoader + " returned null keys or values from loadAll");
                    }
                    this.globalStatsCounter.recordLoadException(stopwatchCreateStarted.elapsed(TimeUnit.NANOSECONDS));
                    throw new CacheLoader.InvalidCacheLoadException(cacheLoader + " returned null map from loadAll");
                } catch (CacheLoader.UnsupportedLoadingOperationException e11) {
                    try {
                        throw e11;
                    } catch (Throwable th2) {
                        th = th2;
                        if (!z11) {
                            this.globalStatsCounter.recordLoadException(stopwatchCreateStarted.elapsed(TimeUnit.NANOSECONDS));
                        }
                        throw th;
                    }
                } catch (Exception e12) {
                    throw new ExecutionException(e12);
                }
            } catch (Error e13) {
                throw new ExecutionError(e13);
            } catch (InterruptedException e14) {
                Thread.currentThread().interrupt();
                throw new ExecutionException(e14);
            } catch (RuntimeException e15) {
                throw new UncheckedExecutionException(e15);
            }
        } catch (Throwable th3) {
            th = th3;
            z11 = false;
            if (!z11) {
                this.globalStatsCounter.recordLoadException(stopwatchCreateStarted.elapsed(TimeUnit.NANOSECONDS));
            }
            throw th;
        }
    }

    @VisibleForTesting
    public ReferenceEntry<K, V> newEntry(K k11, int i11, ReferenceEntry<K, V> referenceEntry) {
        Segment<K, V> segmentSegmentFor = segmentFor(i11);
        segmentSegmentFor.lock();
        try {
            return segmentSegmentFor.newEntry(k11, i11, referenceEntry);
        } finally {
            segmentSegmentFor.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @VisibleForTesting
    public ValueReference<K, V> newValueReference(ReferenceEntry<K, V> referenceEntry, V v11, int i11) {
        return this.valueStrength.referenceValue(segmentFor(referenceEntry.getHash()), referenceEntry, Preconditions.checkNotNull(v11), i11);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V put(K k11, V v11) {
        Preconditions.checkNotNull(k11);
        Preconditions.checkNotNull(v11);
        int iHash = hash(k11);
        return segmentFor(iHash).put(k11, iHash, v11, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k11, V v11) {
        Preconditions.checkNotNull(k11);
        Preconditions.checkNotNull(v11);
        int iHash = hash(k11);
        return segmentFor(iHash).put(k11, iHash, v11, true);
    }

    public void reclaimKey(ReferenceEntry<K, V> referenceEntry) throws Throwable {
        int hash = referenceEntry.getHash();
        segmentFor(hash).reclaimKey(referenceEntry, hash);
    }

    public void reclaimValue(ValueReference<K, V> valueReference) throws Throwable {
        ReferenceEntry<K, V> entry = valueReference.getEntry();
        int hash = entry.getHash();
        segmentFor(hash).reclaimValue(entry.getKey(), hash, valueReference);
    }

    public boolean recordsAccess() {
        return expiresAfterAccess();
    }

    public boolean recordsTime() {
        if (!recordsWrite() && !recordsAccess()) {
            return false;
        }
        return true;
    }

    public boolean recordsWrite() {
        if (!expiresAfterWrite() && !refreshes()) {
            return false;
        }
        return true;
    }

    public void refresh(K k11) {
        int iHash = hash(Preconditions.checkNotNull(k11));
        segmentFor(iHash).refresh(k11, iHash, this.defaultLoader, false);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).remove(obj, iHash, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return Ints.saturatedCast(longSize());
    }

    public boolean usesAccessEntries() {
        if (!usesAccessQueue() && !recordsAccess()) {
            return false;
        }
        return true;
    }

    public boolean usesAccessQueue() {
        if (!expiresAfterAccess() && !evictsBySize()) {
            return false;
        }
        return true;
    }

    public boolean usesWriteEntries() {
        if (!usesWriteQueue() && !recordsWrite()) {
            return false;
        }
        return true;
    }

    public boolean usesWriteQueue() {
        return expiresAfterWrite();
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public V replace(K k11, V v11) {
        Preconditions.checkNotNull(k11);
        Preconditions.checkNotNull(v11);
        int iHash = hash(k11);
        return segmentFor(iHash).replace(k11, iHash, v11);
    }
}
