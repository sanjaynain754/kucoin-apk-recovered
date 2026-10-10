package p055c9;

import android.graphics.Rect;
import android.util.Log;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p037b9.C4519m;

/* JADX INFO: renamed from: c9.j */
/* JADX INFO: compiled from: PreviewScalingStrategy.java */
/* JADX INFO: loaded from: classes56.dex */
public abstract class AbstractC4916j {

    /* JADX INFO: renamed from: a */
    public static final String f5453a = "j";

    /* JADX INFO: renamed from: c9.j$a */
    /* JADX INFO: compiled from: PreviewScalingStrategy.java */
    public class a implements Comparator<C4519m> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C4519m f5454b;

        public a(C4519m c4519m) {
            this.f5454b = c4519m;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C4519m c4519m, C4519m c4519m2) {
            return Float.compare(AbstractC4916j.this.mo5132c(c4519m2, this.f5454b), AbstractC4916j.this.mo5132c(c4519m, this.f5454b));
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract float mo5132c(C4519m c4519m, C4519m c4519m2);

    /* JADX INFO: renamed from: d */
    public abstract Rect mo5133d(C4519m c4519m, C4519m c4519m2);

    /* JADX INFO: renamed from: a */
    public List<C4519m> m5140a(List<C4519m> list, C4519m c4519m) {
        if (c4519m == null) {
            return list;
        }
        Collections.sort(list, new a(c4519m));
        return list;
    }

    /* JADX INFO: renamed from: b */
    public C4519m m5141b(List<C4519m> list, C4519m c4519m) {
        List<C4519m> listM5140a = m5140a(list, c4519m);
        String str = f5453a;
        Log.i(str, "Viewfinder size: " + c4519m);
        Log.i(str, "Preview in order of preference: " + listM5140a);
        return listM5140a.get(0);
    }
}
