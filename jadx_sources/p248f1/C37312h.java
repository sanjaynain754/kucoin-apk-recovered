package p248f1;

import android.graphics.Path;
import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;
import p355j1.C40206i;

/* JADX INFO: renamed from: f1.h */
/* JADX INFO: compiled from: MaskKeyframeAnimation.java */
/* JADX INFO: loaded from: classes34.dex */
public class C37312h {

    /* JADX INFO: renamed from: a */
    public final List<AbstractC37305a<C40206i, Path>> f82789a;

    /* JADX INFO: renamed from: b */
    public final List<AbstractC37305a<Integer, Integer>> f82790b;

    /* JADX INFO: renamed from: c */
    public final List<Mask> f82791c;

    /* JADX INFO: renamed from: a */
    public List<AbstractC37305a<C40206i, Path>> m83862a() {
        return this.f82789a;
    }

    /* JADX INFO: renamed from: b */
    public List<Mask> m83863b() {
        return this.f82791c;
    }

    /* JADX INFO: renamed from: c */
    public List<AbstractC37305a<Integer, Integer>> m83864c() {
        return this.f82790b;
    }

    public C37312h(List<Mask> list) {
        this.f82791c = list;
        this.f82789a = new ArrayList(list.size());
        this.f82790b = new ArrayList(list.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f82789a.add(list.get(i11).m5688b().mo86574a());
            this.f82790b.add(list.get(i11).m5689c().mo86574a());
        }
    }
}
