package cf0;

import androidx.annotation.NonNull;
import df0.C36671a;
import ih0.AbstractC38637s;
import jh0.C40408d;

/* JADX INFO: renamed from: cf0.i */
/* JADX INFO: compiled from: MarkwonPlugin.java */
/* JADX INFO: loaded from: classes60.dex */
public interface InterfaceC4954i {

    /* JADX INFO: renamed from: cf0.i$a */
    /* JADX INFO: compiled from: MarkwonPlugin.java */
    public interface a<P extends InterfaceC4954i> {
        void apply(@NonNull P p11);
    }

    /* JADX INFO: renamed from: cf0.i$b */
    /* JADX INFO: compiled from: MarkwonPlugin.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        <P extends InterfaceC4954i> void mo5194a(@NonNull Class<P> cls, @NonNull a<? super P> aVar);
    }

    void afterRender(@NonNull AbstractC38637s abstractC38637s, @NonNull InterfaceC4957l interfaceC4957l);

    void beforeRender(@NonNull AbstractC38637s abstractC38637s);

    void configure(@NonNull b bVar);

    void configureConfiguration(@NonNull C4952g.b bVar);

    void configureParser(@NonNull C40408d.b bVar);

    void configureSpansFactory(@NonNull InterfaceC4955j.a aVar);

    void configureTheme(@NonNull C36671a.a aVar);

    void configureVisitor(@NonNull InterfaceC4957l.b bVar);

    @NonNull
    String processMarkdown(@NonNull String str);
}
