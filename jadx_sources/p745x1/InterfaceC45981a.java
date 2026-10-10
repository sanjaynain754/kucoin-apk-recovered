package p745x1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import p628t1.InterfaceC44610b;

/* JADX INFO: renamed from: x1.a */
/* JADX INFO: compiled from: DiskCache.java */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC45981a {

    /* JADX INFO: renamed from: x1.a$a */
    /* JADX INFO: compiled from: DiskCache.java */
    public interface a {
        @Nullable
        InterfaceC45981a build();
    }

    /* JADX INFO: renamed from: x1.a$b */
    /* JADX INFO: compiled from: DiskCache.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        boolean mo100249a(@NonNull File file);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    File mo101438a(InterfaceC44610b interfaceC44610b);

    /* JADX INFO: renamed from: b */
    void mo101439b(InterfaceC44610b interfaceC44610b, b bVar);
}
