package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableDistinctUntilChanged<T, K> extends AbstractFlowableWithUpstream<T, T> {
    final BiPredicate<? super K, ? super K> comparer;
    final Function<? super T, K> keySelector;

    public static final class DistinctUntilChangedConditionalSubscriber<T, K> extends BasicFuseableConditionalSubscriber<T, T> {
        final BiPredicate<? super K, ? super K> comparer;
        boolean hasValue;
        final Function<? super T, K> keySelector;
        K last;

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            while (true) {
                T tPoll = this.f87202qs.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.keySelector.apply(tPoll);
                if (!this.hasValue) {
                    this.hasValue = true;
                    this.last = kApply;
                    return tPoll;
                }
                if (!this.comparer.test(this.last, kApply)) {
                    this.last = kApply;
                    return tPoll;
                }
                this.last = kApply;
                if (this.sourceMode != 1) {
                    this.upstream.request(1L);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t11) {
            if (this.done) {
                return false;
            }
            if (this.sourceMode != 0) {
                return this.downstream.tryOnNext((Object) t11);
            }
            try {
                K kApply = this.keySelector.apply(t11);
                if (this.hasValue) {
                    boolean zTest = this.comparer.test(this.last, kApply);
                    this.last = kApply;
                    if (zTest) {
                        return false;
                    }
                } else {
                    this.hasValue = true;
                    this.last = kApply;
                }
                this.downstream.onNext(t11);
                return true;
            } catch (Throwable th2) {
                fail(th2);
                return true;
            }
        }

        public DistinctUntilChangedConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
            super(conditionalSubscriber);
            this.keySelector = function;
            this.comparer = biPredicate;
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber, io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (!tryOnNext(t11)) {
                this.upstream.request(1L);
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i11) {
            return transitiveBoundaryFusion(i11);
        }
    }

    public static final class DistinctUntilChangedSubscriber<T, K> extends BasicFuseableSubscriber<T, T> implements ConditionalSubscriber<T> {
        final BiPredicate<? super K, ? super K> comparer;
        boolean hasValue;
        final Function<? super T, K> keySelector;
        K last;

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            while (true) {
                T tPoll = this.f87203qs.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.keySelector.apply(tPoll);
                if (!this.hasValue) {
                    this.hasValue = true;
                    this.last = kApply;
                    return tPoll;
                }
                if (!this.comparer.test(this.last, kApply)) {
                    this.last = kApply;
                    return tPoll;
                }
                this.last = kApply;
                if (this.sourceMode != 1) {
                    this.upstream.request(1L);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t11) {
            if (this.done) {
                return false;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext((Object) t11);
                return true;
            }
            try {
                K kApply = this.keySelector.apply(t11);
                if (this.hasValue) {
                    boolean zTest = this.comparer.test(this.last, kApply);
                    this.last = kApply;
                    if (zTest) {
                        return false;
                    }
                } else {
                    this.hasValue = true;
                    this.last = kApply;
                }
                this.downstream.onNext((Object) t11);
                return true;
            } catch (Throwable th2) {
                fail(th2);
                return true;
            }
        }

        public DistinctUntilChangedSubscriber(InterfaceC44417c<? super T> interfaceC44417c, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
            super(interfaceC44417c);
            this.keySelector = function;
            this.comparer = biPredicate;
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (!tryOnNext(t11)) {
                this.upstream.request(1L);
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i11) {
            return transitiveBoundaryFusion(i11);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        if (interfaceC44417c instanceof ConditionalSubscriber) {
            this.source.subscribe((FlowableSubscriber) new DistinctUntilChangedConditionalSubscriber((ConditionalSubscriber) interfaceC44417c, this.keySelector, this.comparer));
        } else {
            this.source.subscribe((FlowableSubscriber) new DistinctUntilChangedSubscriber(interfaceC44417c, this.keySelector, this.comparer));
        }
    }

    public FlowableDistinctUntilChanged(Flowable<T> flowable, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
        super(flowable);
        this.keySelector = function;
        this.comparer = biPredicate;
    }
}
