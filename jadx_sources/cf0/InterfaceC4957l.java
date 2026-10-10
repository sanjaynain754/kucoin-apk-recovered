package cf0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ih0.AbstractC38637s;
import ih0.InterfaceC38644z;

/* JADX INFO: renamed from: cf0.l */
/* JADX INFO: compiled from: MarkwonVisitor.java */
/* JADX INFO: loaded from: classes60.dex */
public interface InterfaceC4957l extends InterfaceC38644z {

    /* JADX INFO: renamed from: cf0.l$a */
    /* JADX INFO: compiled from: MarkwonVisitor.java */
    public interface a {
        void blockEnd(@NonNull InterfaceC4957l interfaceC4957l, @NonNull AbstractC38637s abstractC38637s);

        void blockStart(@NonNull InterfaceC4957l interfaceC4957l, @NonNull AbstractC38637s abstractC38637s);
    }

    /* JADX INFO: renamed from: cf0.l$b */
    /* JADX INFO: compiled from: MarkwonVisitor.java */
    public interface b {
        @NonNull
        /* JADX INFO: renamed from: a */
        InterfaceC4957l mo5206a(@NonNull C4952g c4952g, @NonNull InterfaceC4962q interfaceC4962q);

        @NonNull
        /* JADX INFO: renamed from: b */
        <N extends AbstractC38637s> b mo5207b(@NonNull Class<N> cls, @Nullable c<? super N> cVar);

        @NonNull
        /* JADX INFO: renamed from: c */
        b mo5208c(@NonNull a aVar);
    }

    /* JADX INFO: renamed from: cf0.l$c */
    /* JADX INFO: compiled from: MarkwonVisitor.java */
    public interface c<N extends AbstractC38637s> {
        /* JADX INFO: renamed from: a */
        void mo5209a(@NonNull InterfaceC4957l interfaceC4957l, @NonNull N n11);
    }

    /* JADX INFO: renamed from: D */
    void mo5196D();

    /* JADX INFO: renamed from: F */
    void mo5197F(@NonNull AbstractC38637s abstractC38637s);

    @NonNull
    C4965t builder();

    /* JADX INFO: renamed from: c */
    void mo5198c(int i11, @Nullable Object obj);

    /* JADX INFO: renamed from: d */
    <N extends AbstractC38637s> void mo5199d(@NonNull N n11, int i11);

    @NonNull
    /* JADX INFO: renamed from: h */
    InterfaceC4962q mo5200h();

    /* JADX INFO: renamed from: i */
    boolean mo5201i(@NonNull AbstractC38637s abstractC38637s);

    int length();

    @NonNull
    /* JADX INFO: renamed from: o */
    C4952g mo5202o();

    /* JADX INFO: renamed from: q */
    void mo5203q();

    /* JADX INFO: renamed from: v */
    void mo5204v(@NonNull AbstractC38637s abstractC38637s);

    /* JADX INFO: renamed from: w */
    void mo5205w(@NonNull AbstractC38637s abstractC38637s);
}
