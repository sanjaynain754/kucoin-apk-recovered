package cf0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ih0.AbstractC38637s;

/* JADX INFO: renamed from: cf0.j */
/* JADX INFO: compiled from: MarkwonSpansFactory.java */
/* JADX INFO: loaded from: classes60.dex */
public interface InterfaceC4955j {

    /* JADX INFO: renamed from: cf0.j$a */
    /* JADX INFO: compiled from: MarkwonSpansFactory.java */
    public interface a {
        @NonNull
        /* JADX INFO: renamed from: a */
        <N extends AbstractC38637s> a mo5195a(@NonNull Class<N> cls, @Nullable InterfaceC4964s interfaceC4964s);

        @NonNull
        InterfaceC4955j build();
    }

    @Nullable
    <N extends AbstractC38637s> InterfaceC4964s get(@NonNull Class<N> cls);
}
