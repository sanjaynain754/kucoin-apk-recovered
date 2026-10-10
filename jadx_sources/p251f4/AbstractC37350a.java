package p251f4;

/* JADX INFO: renamed from: f4.a */
/* JADX INFO: compiled from: BaseDataSubscriber.java */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC37350a<T> implements InterfaceC37353d<T> {
    public abstract void onFailureImpl(InterfaceC37351b<T> interfaceC37351b);

    public abstract void onNewResultImpl(InterfaceC37351b<T> interfaceC37351b);

    @Override // p251f4.InterfaceC37353d
    public void onFailure(InterfaceC37351b<T> interfaceC37351b) {
        try {
            onFailureImpl(interfaceC37351b);
        } finally {
            interfaceC37351b.close();
        }
    }

    @Override // p251f4.InterfaceC37353d
    public void onNewResult(InterfaceC37351b<T> interfaceC37351b) {
        boolean zIsFinished = interfaceC37351b.isFinished();
        try {
            onNewResultImpl(interfaceC37351b);
        } finally {
            if (zIsFinished) {
                interfaceC37351b.close();
            }
        }
    }

    @Override // p251f4.InterfaceC37353d
    public void onCancellation(InterfaceC37351b<T> interfaceC37351b) {
    }

    @Override // p251f4.InterfaceC37353d
    public void onProgressUpdate(InterfaceC37351b<T> interfaceC37351b) {
    }
}
