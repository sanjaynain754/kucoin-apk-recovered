package p249f2;

import androidx.annotation.NonNull;
import java.io.File;
import p628t1.C44613e;
import p628t1.InterfaceC44614f;
import p680v1.InterfaceC45359j;

/* JADX INFO: renamed from: f2.a */
/* JADX INFO: compiled from: FileDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public class C37324a implements InterfaceC44614f<File, File> {
    @Override // p628t1.InterfaceC44614f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo4262b(@NonNull File file, @NonNull C44613e c44613e) {
        return true;
    }

    @Override // p628t1.InterfaceC44614f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC45359j<File> mo4261a(@NonNull File file, int i11, int i12, @NonNull C44613e c44613e) {
        return new C37325b(file);
    }
}
