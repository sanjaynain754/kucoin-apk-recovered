package p817z1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.data.InterfaceC5323d;
import java.util.Collections;
import java.util.List;
import p523p2.C43363j;
import p628t1.C44613e;
import p628t1.InterfaceC44610b;

/* JADX INFO: renamed from: z1.n */
/* JADX INFO: compiled from: ModelLoader.java */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC46635n<Model, Data> {

    /* JADX INFO: renamed from: z1.n$a */
    /* JADX INFO: compiled from: ModelLoader.java */
    public static class a<Data> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC44610b f104427a;

        /* JADX INFO: renamed from: b */
        public final List<InterfaceC44610b> f104428b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC5323d<Data> f104429c;

        public a(@NonNull InterfaceC44610b interfaceC44610b, @NonNull InterfaceC5323d<Data> interfaceC5323d) {
            this(interfaceC44610b, Collections.EMPTY_LIST, interfaceC5323d);
        }

        public a(@NonNull InterfaceC44610b interfaceC44610b, @NonNull List<InterfaceC44610b> list, @NonNull InterfaceC5323d<Data> interfaceC5323d) {
            this.f104427a = (InterfaceC44610b) C43363j.m95506d(interfaceC44610b);
            this.f104428b = (List) C43363j.m95506d(list);
            this.f104429c = (InterfaceC5323d) C43363j.m95506d(interfaceC5323d);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    a<Data> mo10a(@NonNull Model model, int i11, int i12, @NonNull C44613e c44613e);

    /* JADX INFO: renamed from: b */
    boolean mo11b(@NonNull Model model);
}
