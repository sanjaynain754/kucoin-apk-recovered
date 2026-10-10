package p218e1;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import p484o1.C42930l;

/* JADX INFO: renamed from: e1.b */
/* JADX INFO: compiled from: CompoundTrimPathContent.java */
/* JADX INFO: loaded from: classes.dex */
public class C37022b {

    /* JADX INFO: renamed from: a */
    public final List<C37041u> f82165a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public void m82854a(C37041u c37041u) {
        this.f82165a.add(c37041u);
    }

    /* JADX INFO: renamed from: b */
    public void m82855b(Path path) {
        for (int size = this.f82165a.size() - 1; size >= 0; size--) {
            C42930l.m94199b(path, this.f82165a.get(size));
        }
    }
}
