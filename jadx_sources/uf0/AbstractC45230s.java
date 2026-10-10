package uf0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tf0.C44941b;

/* JADX INFO: renamed from: uf0.s */
/* JADX INFO: compiled from: Tracestate.java */
/* JADX INFO: loaded from: classes60.dex */
public abstract class AbstractC45230s {

    /* JADX INFO: renamed from: uf0.s$b */
    /* JADX INFO: compiled from: Tracestate.java */
    public static final class b {

        /* JADX INFO: renamed from: c */
        public static final AbstractC45230s f101762c = AbstractC45230s.m99940c(Collections.EMPTY_LIST);

        /* JADX INFO: renamed from: a */
        public final AbstractC45230s f101763a;

        /* JADX INFO: renamed from: b */
        public ArrayList<Object> f101764b;

        public b(AbstractC45230s abstractC45230s) {
            C44941b.m99389b(abstractC45230s, "parent");
            this.f101763a = abstractC45230s;
            this.f101764b = null;
        }

        /* JADX INFO: renamed from: b */
        public AbstractC45230s m99942b() {
            ArrayList<Object> arrayList = this.f101764b;
            return arrayList == null ? this.f101763a : AbstractC45230s.m99940c(arrayList);
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract List<Object> mo99898d();

    /* JADX INFO: renamed from: b */
    public static b m99939b() {
        return new b();
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC45230s m99940c(List<Object> list) {
        boolean z11;
        if (list.size() <= 32) {
            z11 = true;
        } else {
            z11 = false;
        }
        C44941b.m99390c(z11, "Invalid size");
        return new C45216e(Collections.unmodifiableList(list));
    }
}
