package p710w1;

import java.util.Queue;
import p523p2.C43364k;
import p710w1.InterfaceC45694l;

/* JADX INFO: renamed from: w1.c */
/* JADX INFO: compiled from: BaseKeyPool.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC45685c<T extends InterfaceC45694l> {

    /* JADX INFO: renamed from: a */
    public final Queue<T> f102993a = C43364k.m95513f(20);

    /* JADX INFO: renamed from: a */
    public abstract T mo100808a();

    /* JADX INFO: renamed from: b */
    public T m100809b() {
        T tPoll = this.f102993a.poll();
        return tPoll == null ? (T) mo100808a() : tPoll;
    }

    /* JADX INFO: renamed from: c */
    public void m100810c(T t11) {
        if (this.f102993a.size() < 20) {
            this.f102993a.offer(t11);
        }
    }
}
