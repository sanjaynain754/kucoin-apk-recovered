package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.OverridingMethodsMustInvokeSuper;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
abstract class AggregateFuture<InputT, OutputT> extends AggregateFutureState<OutputT> {
    private static final LazyLogger logger = new LazyLogger(AggregateFuture.class);
    private final boolean allMustSucceed;
    private final boolean collectsValues;

    @LazyInit
    private ImmutableCollection<? extends ListenableFuture<? extends InputT>> futures;

    public enum ReleaseResourcesReason {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processAllMustSucceedDoneFuture(int i11, ListenableFuture<? extends InputT> listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.futures = null;
                cancel(false);
            } else {
                collectValueFromNonCancelledFuture(i11, listenableFuture);
            }
        } finally {
            decrementCountAndMaybeComplete(null);
        }
    }

    public abstract void collectOneValue(int i11, @ParametricNullness InputT inputt);

    public abstract void handleAllCompleted();

    private static boolean addCausalChain(Set<Throwable> set, Throwable th2) {
        while (th2 != null) {
            if (!set.add(th2)) {
                return false;
            }
            th2 = th2.getCause();
        }
        return true;
    }

    private static void log(Throwable th2) {
        logger.get().log(Level.SEVERE, th2 instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th2);
    }

    private void processCompleted(ImmutableCollection<? extends Future<? extends InputT>> immutableCollection) {
        if (immutableCollection != null) {
            UnmodifiableIterator<? extends Future<? extends InputT>> it = immutableCollection.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                Future<? extends InputT> next = it.next();
                if (!next.isCancelled()) {
                    collectValueFromNonCancelledFuture(i11, next);
                }
                i11++;
            }
        }
        clearSeenExceptions();
        handleAllCompleted();
        releaseResources(ReleaseResourcesReason.ALL_INPUT_FUTURES_PROCESSED);
    }

    public final void init() {
        Objects.requireNonNull(this.futures);
        if (this.futures.isEmpty()) {
            handleAllCompleted();
            return;
        }
        if (!this.allMustSucceed) {
            final ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection = this.collectsValues ? this.futures : null;
            Runnable runnable = new Runnable() { // from class: com.google.common.util.concurrent.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12427b.decrementCountAndMaybeComplete(immutableCollection);
                }
            };
            UnmodifiableIterator<? extends ListenableFuture<? extends InputT>> it = this.futures.iterator();
            while (it.hasNext()) {
                ListenableFuture<? extends InputT> next = it.next();
                if (next.isDone()) {
                    decrementCountAndMaybeComplete(immutableCollection);
                } else {
                    next.addListener(runnable, MoreExecutors.directExecutor());
                }
            }
            return;
        }
        UnmodifiableIterator<? extends ListenableFuture<? extends InputT>> it2 = this.futures.iterator();
        final int i11 = 0;
        while (it2.hasNext()) {
            final ListenableFuture<? extends InputT> next2 = it2.next();
            int i12 = i11 + 1;
            if (next2.isDone()) {
                processAllMustSucceedDoneFuture(i11, next2);
            } else {
                next2.addListener(new Runnable() { // from class: com.google.common.util.concurrent.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f12424b.processAllMustSucceedDoneFuture(i11, next2);
                    }
                }, MoreExecutors.directExecutor());
            }
            i11 = i12;
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final String pendingToString() {
        ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection = this.futures;
        if (immutableCollection == null) {
            return super.pendingToString();
        }
        return "futures=" + immutableCollection;
    }

    public AggregateFuture(ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection, boolean z11, boolean z12) {
        super(immutableCollection.size());
        this.futures = (ImmutableCollection) Preconditions.checkNotNull(immutableCollection);
        this.allMustSucceed = z11;
        this.collectsValues = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void collectValueFromNonCancelledFuture(int i11, Future<? extends InputT> future) {
        try {
            collectOneValue(i11, Uninterruptibles.getUninterruptibly(future));
        } catch (ExecutionException e11) {
            handleException(e11.getCause());
        } catch (Throwable th2) {
            handleException(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void decrementCountAndMaybeComplete(ImmutableCollection<? extends Future<? extends InputT>> immutableCollection) {
        boolean z11;
        int iDecrementRemainingAndGet = decrementRemainingAndGet();
        if (iDecrementRemainingAndGet >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkState(z11, "Less than 0 remaining futures");
        if (iDecrementRemainingAndGet == 0) {
            processCompleted(immutableCollection);
        }
    }

    private void handleException(Throwable th2) {
        Preconditions.checkNotNull(th2);
        if (this.allMustSucceed && !setException(th2) && addCausalChain(getOrInitSeenExceptions(), th2)) {
            log(th2);
        } else if (th2 instanceof Error) {
            log(th2);
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFutureState
    public final void addInitialException(Set<Throwable> set) {
        Preconditions.checkNotNull(set);
        if (!isCancelled()) {
            Throwable thTryInternalFastPathGetFailure = tryInternalFastPathGetFailure();
            Objects.requireNonNull(thTryInternalFastPathGetFailure);
            addCausalChain(set, thTryInternalFastPathGetFailure);
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
        boolean z11;
        super.afterDone();
        ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection = this.futures;
        releaseResources(ReleaseResourcesReason.OUTPUT_FUTURE_DONE);
        boolean zIsCancelled = isCancelled();
        if (immutableCollection != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (zIsCancelled & z11) {
            boolean zWasInterrupted = wasInterrupted();
            UnmodifiableIterator<? extends ListenableFuture<? extends InputT>> it = immutableCollection.iterator();
            while (it.hasNext()) {
                it.next().cancel(zWasInterrupted);
            }
        }
    }

    @ForOverride
    @OverridingMethodsMustInvokeSuper
    public void releaseResources(ReleaseResourcesReason releaseResourcesReason) {
        Preconditions.checkNotNull(releaseResourcesReason);
        this.futures = null;
    }
}
