package io.reactivex.observers;

import com.tencent.bugly.proguard.C33627eb;
import io.reactivex.Notification;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.VolatileSizeArrayList;
import io.reactivex.observers.BaseTestConsumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes60.dex */
public abstract class BaseTestConsumer<T, U extends BaseTestConsumer<T, U>> implements Disposable {
    protected boolean checkSubscriptionOnce;
    protected long completions;
    protected int establishedFusionMode;
    protected int initialFusionMode;
    protected Thread lastThread;
    protected CharSequence tag;
    protected boolean timeout;
    protected final List<T> values = new VolatileSizeArrayList();
    protected final List<Throwable> errors = new VolatileSizeArrayList();
    protected final CountDownLatch done = new CountDownLatch(1);

    public enum TestWaitStrategy implements Runnable {
        SPIN { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.1
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
            }
        },
        YIELD { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.2
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
                Thread.yield();
            }
        },
        SLEEP_1MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.3
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
                TestWaitStrategy.sleep(1);
            }
        },
        SLEEP_10MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.4
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
                TestWaitStrategy.sleep(10);
            }
        },
        SLEEP_100MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.5
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
                TestWaitStrategy.sleep(100);
            }
        },
        SLEEP_1000MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.6
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
                TestWaitStrategy.sleep(1000);
            }
        };

        public static void sleep(int i11) {
            try {
                Thread.sleep(i11);
            } catch (InterruptedException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // java.lang.Runnable
        public abstract void run();
    }

    public final U assertError(Throwable th2) {
        return (U) assertError(Functions.equalsWith(th2));
    }

    public final U assertFailure(Class<? extends Throwable> cls, T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertError(cls).assertNotComplete();
    }

    public final U assertNever(T t11) {
        int size = this.values.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (ObjectHelper.equals(this.values.get(i11), t11)) {
                throw fail("Value at position " + i11 + " is equal to " + valueAndClass(t11) + "; Expected them to be different");
            }
        }
        return this;
    }

    public final U assertNoValues() {
        return (U) assertValueCount(0);
    }

    public abstract U assertNotSubscribed();

    public abstract U assertSubscribed();

    public final U assertValue(T t11) {
        if (this.values.size() != 1) {
            throw fail("expected: " + valueAndClass(t11) + " but was: " + this.values);
        }
        T t12 = this.values.get(0);
        if (ObjectHelper.equals(t11, t12)) {
            return this;
        }
        throw fail("expected: " + valueAndClass(t11) + " but was: " + valueAndClass(t12));
    }

    public final U assertValueAt(int i11, T t11) {
        int size = this.values.size();
        if (size == 0) {
            throw fail("No values");
        }
        if (i11 >= size) {
            throw fail("Invalid index: " + i11);
        }
        T t12 = this.values.get(i11);
        if (ObjectHelper.equals(t11, t12)) {
            return this;
        }
        throw fail("expected: " + valueAndClass(t11) + " but was: " + valueAndClass(t12));
    }

    public final U await() throws InterruptedException {
        if (this.done.getCount() == 0) {
            return this;
        }
        this.done.await();
        return this;
    }

    public final U awaitCount(int i11) {
        return (U) awaitCount(i11, TestWaitStrategy.SLEEP_10MS, 5000L);
    }

    public final boolean awaitTerminalEvent() {
        try {
            await();
            return true;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public final U clearTimeout() {
        this.timeout = false;
        return this;
    }

    public static String valueAndClass(Object obj) {
        if (obj == null) {
            return "null";
        }
        return obj + " (class: " + obj.getClass().getSimpleName() + ")";
    }

    public final U assertComplete() {
        long j11 = this.completions;
        if (j11 == 0) {
            throw fail("Not completed");
        }
        if (j11 <= 1) {
            return this;
        }
        throw fail("Multiple completions: " + j11);
    }

    public final U assertError(Class<? extends Throwable> cls) {
        return (U) assertError(Functions.isInstanceOf(cls));
    }

    public final U assertErrorMessage(String str) {
        int size = this.errors.size();
        if (size == 0) {
            throw fail("No errors");
        }
        if (size != 1) {
            throw fail("Multiple errors");
        }
        String message = this.errors.get(0).getMessage();
        if (ObjectHelper.equals(str, message)) {
            return this;
        }
        throw fail("Error message differs; exptected: " + str + " but was: " + message);
    }

    public final U assertNoErrors() {
        if (this.errors.size() == 0) {
            return this;
        }
        throw fail("Error(s) present: " + this.errors);
    }

    public final U assertNoTimeout() {
        if (this.timeout) {
            throw fail("Timeout?!");
        }
        return this;
    }

    public final U assertNotComplete() {
        long j11 = this.completions;
        if (j11 == 1) {
            throw fail("Completed!");
        }
        if (j11 <= 1) {
            return this;
        }
        throw fail("Multiple completions: " + j11);
    }

    public final U assertNotTerminated() {
        if (this.done.getCount() != 0) {
            return this;
        }
        throw fail("Subscriber terminated!");
    }

    public final U assertTerminated() {
        if (this.done.getCount() != 0) {
            throw fail("Subscriber still running!");
        }
        long j11 = this.completions;
        if (j11 > 1) {
            throw fail("Terminated with multiple completions: " + j11);
        }
        int size = this.errors.size();
        if (size > 1) {
            throw fail("Terminated with multiple errors: " + size);
        }
        if (j11 == 0 || size == 0) {
            return this;
        }
        throw fail("Terminated with multiple completions and errors: " + j11);
    }

    public final U assertTimeout() {
        if (this.timeout) {
            return this;
        }
        throw fail("No timeout?!");
    }

    public final U assertValueCount(int i11) {
        int size = this.values.size();
        if (size == i11) {
            return this;
        }
        throw fail("Value counts differ; expected: " + i11 + " but was: " + size);
    }

    public final U assertValueSequence(Iterable<? extends T> iterable) {
        boolean zHasNext;
        boolean zHasNext2;
        Iterator<T> it = this.values.iterator();
        Iterator<? extends T> it2 = iterable.iterator();
        int i11 = 0;
        while (true) {
            zHasNext = it2.hasNext();
            zHasNext2 = it.hasNext();
            if (!zHasNext2 || !zHasNext) {
                break;
            }
            T next = it2.next();
            T next2 = it.next();
            if (!ObjectHelper.equals(next, next2)) {
                throw fail("Values at position " + i11 + " differ; expected: " + valueAndClass(next) + " but was: " + valueAndClass(next2));
            }
            i11++;
        }
        if (zHasNext2) {
            throw fail("More values received than expected (" + i11 + ")");
        }
        if (!zHasNext) {
            return this;
        }
        throw fail("Fewer values received than expected (" + i11 + ")");
    }

    public final U assertValues(T... tArr) {
        int size = this.values.size();
        if (size != tArr.length) {
            throw fail("Value count differs; expected: " + tArr.length + C33627eb.f69716f + Arrays.toString(tArr) + " but was: " + size + C33627eb.f69716f + this.values);
        }
        for (int i11 = 0; i11 < size; i11++) {
            T t11 = this.values.get(i11);
            T t12 = tArr[i11];
            if (!ObjectHelper.equals(t12, t11)) {
                throw fail("Values at position " + i11 + " differ; expected: " + valueAndClass(t12) + " but was: " + valueAndClass(t11));
            }
        }
        return this;
    }

    public final U awaitCount(int i11, Runnable runnable) {
        return (U) awaitCount(i11, runnable, 5000L);
    }

    public final U awaitDone(long j11, TimeUnit timeUnit) {
        try {
            if (this.done.await(j11, timeUnit)) {
                return this;
            }
            this.timeout = true;
            dispose();
            return this;
        } catch (InterruptedException e11) {
            dispose();
            throw ExceptionHelper.wrapOrThrow(e11);
        }
    }

    public final long completions() {
        return this.completions;
    }

    public final int errorCount() {
        return this.errors.size();
    }

    public final List<Throwable> errors() {
        return this.errors;
    }

    public final AssertionError fail(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 64);
        sb2.append(str);
        sb2.append(" (");
        sb2.append("latch = ");
        sb2.append(this.done.getCount());
        sb2.append(", ");
        sb2.append("values = ");
        sb2.append(this.values.size());
        sb2.append(", ");
        sb2.append("errors = ");
        sb2.append(this.errors.size());
        sb2.append(", ");
        sb2.append("completions = ");
        sb2.append(this.completions);
        if (this.timeout) {
            sb2.append(", timeout!");
        }
        if (getDisposed()) {
            sb2.append(", disposed!");
        }
        CharSequence charSequence = this.tag;
        if (charSequence != null) {
            sb2.append(", tag = ");
            sb2.append(charSequence);
        }
        sb2.append(')');
        AssertionError assertionError = new AssertionError(sb2.toString());
        if (!this.errors.isEmpty()) {
            if (this.errors.size() == 1) {
                assertionError.initCause(this.errors.get(0));
                return assertionError;
            }
            assertionError.initCause(new CompositeException(this.errors));
        }
        return assertionError;
    }

    public final List<List<Object>> getEvents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(values());
        arrayList.add(errors());
        ArrayList arrayList2 = new ArrayList();
        for (long j11 = 0; j11 < this.completions; j11++) {
            arrayList2.add(Notification.createOnComplete());
        }
        arrayList.add(arrayList2);
        return arrayList;
    }

    public final boolean isTerminated() {
        return this.done.getCount() == 0;
    }

    public final boolean isTimeout() {
        return this.timeout;
    }

    public final Thread lastThread() {
        return this.lastThread;
    }

    public final int valueCount() {
        return this.values.size();
    }

    public final List<T> values() {
        return this.values;
    }

    public final U withTag(CharSequence charSequence) {
        this.tag = charSequence;
        return this;
    }

    public final U assertEmpty() {
        return (U) assertSubscribed().assertNoValues().assertNoErrors().assertNotComplete();
    }

    public final U assertError(Predicate<Throwable> predicate) {
        int size = this.errors.size();
        if (size != 0) {
            Iterator<Throwable> it = this.errors.iterator();
            while (it.hasNext()) {
                try {
                    if (predicate.test(it.next())) {
                        if (size == 1) {
                            return this;
                        }
                        throw fail("Error present but other errors as well");
                    }
                } catch (Exception e11) {
                    throw ExceptionHelper.wrapOrThrow(e11);
                }
            }
            throw fail("Error not present");
        }
        throw fail("No errors");
    }

    public final U assertFailureAndMessage(Class<? extends Throwable> cls, String str, T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertError(cls).assertErrorMessage(str).assertNotComplete();
    }

    public final U assertResult(T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertNoErrors().assertComplete();
    }

    public final U assertValueSequenceOnly(Iterable<? extends T> iterable) {
        return (U) assertSubscribed().assertValueSequence(iterable).assertNoErrors().assertNotComplete();
    }

    public final U assertValueSet(Collection<? extends T> collection) {
        if (collection.isEmpty()) {
            assertNoValues();
            return this;
        }
        for (T t11 : this.values) {
            if (!collection.contains(t11)) {
                throw fail("Value not in the expected collection: " + valueAndClass(t11));
            }
        }
        return this;
    }

    public final U assertValueSetOnly(Collection<? extends T> collection) {
        return (U) assertSubscribed().assertValueSet(collection).assertNoErrors().assertNotComplete();
    }

    public final U assertValuesOnly(T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertNoErrors().assertNotComplete();
    }

    public final boolean await(long j11, TimeUnit timeUnit) throws InterruptedException {
        boolean z11 = this.done.getCount() == 0 || this.done.await(j11, timeUnit);
        this.timeout = !z11;
        return z11;
    }

    public final U awaitCount(int i11, Runnable runnable, long j11) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (true) {
            if (j11 > 0 && System.currentTimeMillis() - jCurrentTimeMillis >= j11) {
                this.timeout = true;
                return this;
            }
            if (this.done.getCount() == 0 || this.values.size() >= i11) {
                return this;
            }
            runnable.run();
        }
    }

    public final boolean awaitTerminalEvent(long j11, TimeUnit timeUnit) {
        try {
            return await(j11, timeUnit);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public final U assertFailure(Predicate<Throwable> predicate, T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertError(predicate).assertNotComplete();
    }

    public final U assertNever(Predicate<? super T> predicate) {
        int size = this.values.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                if (predicate.test(this.values.get(i11))) {
                    throw fail("Value at position " + i11 + " matches predicate " + predicate.toString() + ", which was not expected.");
                }
            } catch (Exception e11) {
                throw ExceptionHelper.wrapOrThrow(e11);
            }
        }
        return this;
    }

    public final U assertValue(Predicate<T> predicate) {
        assertValueAt(0, (Predicate) predicate);
        if (this.values.size() <= 1) {
            return this;
        }
        throw fail("Value present but other values as well");
    }

    public final U assertValueAt(int i11, Predicate<T> predicate) {
        if (this.values.size() != 0) {
            if (i11 < this.values.size()) {
                try {
                    if (predicate.test(this.values.get(i11))) {
                        return this;
                    }
                    throw fail("Value not present");
                } catch (Exception e11) {
                    throw ExceptionHelper.wrapOrThrow(e11);
                }
            }
            throw fail("Invalid index: " + i11);
        }
        throw fail("No values");
    }
}
