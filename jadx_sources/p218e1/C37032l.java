package p218e1;

import android.annotation.TargetApi;
import android.graphics.Path;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: e1.l */
/* JADX INFO: compiled from: MergePathsContent.java */
/* JADX INFO: loaded from: classes34.dex */
@TargetApi(19)
public class C37032l implements InterfaceC37033m, InterfaceC37030j {

    /* JADX INFO: renamed from: d */
    public final String f82233d;

    /* JADX INFO: renamed from: f */
    public final MergePaths f82235f;

    /* JADX INFO: renamed from: a */
    public final Path f82230a = new Path();

    /* JADX INFO: renamed from: b */
    public final Path f82231b = new Path();

    /* JADX INFO: renamed from: c */
    public final Path f82232c = new Path();

    /* JADX INFO: renamed from: e */
    public final List<InterfaceC37033m> f82234e = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m82872a() {
        for (int i11 = 0; i11 < this.f82234e.size(); i11++) {
            this.f82232c.addPath(this.f82234e.get(i11).getPath());
        }
    }

    @Override // p218e1.InterfaceC37023c
    /* JADX INFO: renamed from: f */
    public void mo5789f(List<InterfaceC37023c> list, List<InterfaceC37023c> list2) {
        for (int i11 = 0; i11 < this.f82234e.size(); i11++) {
            this.f82234e.get(i11).mo5789f(list, list2);
        }
    }

    /* JADX INFO: renamed from: e1.l$a */
    /* JADX INFO: compiled from: MergePathsContent.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f82236a;

        static {
            int[] iArr = new int[MergePaths.MergePathsMode.values().length];
            f82236a = iArr;
            try {
                iArr[MergePaths.MergePathsMode.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82236a[MergePaths.MergePathsMode.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82236a[MergePaths.MergePathsMode.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f82236a[MergePaths.MergePathsMode.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f82236a[MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: e */
    public final void m82873e(Path.Op op2) {
        this.f82231b.reset();
        this.f82230a.reset();
        for (int size = this.f82234e.size() - 1; size >= 1; size--) {
            InterfaceC37033m interfaceC37033m = this.f82234e.get(size);
            if (interfaceC37033m instanceof C37024d) {
                C37024d c37024d = (C37024d) interfaceC37033m;
                List<InterfaceC37033m> listM82859k = c37024d.m82859k();
                for (int size2 = listM82859k.size() - 1; size2 >= 0; size2--) {
                    Path path = listM82859k.get(size2).getPath();
                    path.transform(c37024d.m82860l());
                    this.f82231b.addPath(path);
                }
            } else {
                this.f82231b.addPath(interfaceC37033m.getPath());
            }
        }
        InterfaceC37033m interfaceC37033m2 = this.f82234e.get(0);
        if (interfaceC37033m2 instanceof C37024d) {
            C37024d c37024d2 = (C37024d) interfaceC37033m2;
            List<InterfaceC37033m> listM82859k2 = c37024d2.m82859k();
            for (int i11 = 0; i11 < listM82859k2.size(); i11++) {
                Path path2 = listM82859k2.get(i11).getPath();
                path2.transform(c37024d2.m82860l());
                this.f82230a.addPath(path2);
            }
        } else {
            this.f82230a.set(interfaceC37033m2.getPath());
        }
        this.f82232c.op(this.f82230a, this.f82231b, op2);
    }

    @Override // p218e1.InterfaceC37033m
    public Path getPath() {
        this.f82232c.reset();
        if (this.f82235f.m5695d()) {
            return this.f82232c;
        }
        int i11 = a.f82236a[this.f82235f.m5693b().ordinal()];
        if (i11 == 1) {
            m82872a();
        } else if (i11 == 2) {
            m82873e(Path.Op.UNION);
        } else if (i11 == 3) {
            m82873e(Path.Op.REVERSE_DIFFERENCE);
        } else if (i11 == 4) {
            m82873e(Path.Op.INTERSECT);
        } else if (i11 == 5) {
            m82873e(Path.Op.XOR);
        }
        return this.f82232c;
    }

    public C37032l(MergePaths mergePaths) {
        this.f82233d = mergePaths.m5694c();
        this.f82235f = mergePaths;
    }

    @Override // p218e1.InterfaceC37030j
    /* JADX INFO: renamed from: c */
    public void mo82871c(ListIterator<InterfaceC37023c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            InterfaceC37023c interfaceC37023cPrevious = listIterator.previous();
            if (interfaceC37023cPrevious instanceof InterfaceC37033m) {
                this.f82234e.add((InterfaceC37033m) interfaceC37023cPrevious);
                listIterator.remove();
            }
        }
    }
}
