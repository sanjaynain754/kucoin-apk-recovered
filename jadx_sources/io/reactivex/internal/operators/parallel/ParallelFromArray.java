package io.reactivex.internal.operators.parallel;

import io.reactivex.parallel.ParallelFlowable;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class ParallelFromArray<T> extends ParallelFlowable<T> {
    final InterfaceC44416b<T>[] sources;

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.sources.length;
    }

    public ParallelFromArray(InterfaceC44416b<T>[] interfaceC44416bArr) {
        this.sources = interfaceC44416bArr;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(InterfaceC44417c<? super T>[] interfaceC44417cArr) {
        if (validate(interfaceC44417cArr)) {
            int length = interfaceC44417cArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                this.sources[i11].subscribe(interfaceC44417cArr[i11]);
            }
        }
    }
}
