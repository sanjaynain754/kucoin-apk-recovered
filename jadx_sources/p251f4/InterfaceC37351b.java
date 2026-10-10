package p251f4;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: f4.b */
/* JADX INFO: compiled from: DataSource.java */
/* JADX INFO: loaded from: classes34.dex */
public interface InterfaceC37351b<T> {
    /* JADX INFO: renamed from: a */
    boolean mo8588a();

    /* JADX INFO: renamed from: b */
    void mo8589b(InterfaceC37353d<T> interfaceC37353d, Executor executor);

    /* JADX INFO: renamed from: c */
    Throwable mo8590c();

    boolean close();

    /* JADX INFO: renamed from: d */
    boolean mo8591d();

    Map<String, Object> getExtras();

    float getProgress();

    T getResult();

    boolean isFinished();
}
