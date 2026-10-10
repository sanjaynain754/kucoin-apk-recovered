package jumio.camerax;

import java.util.List;
import p852kotlin.Triple;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: jumio.camerax.v */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40496v {

    /* JADX INFO: renamed from: a */
    public static final Triple f89891a;

    /* JADX INFO: renamed from: b */
    public static final Triple f89892b;

    /* JADX INFO: renamed from: c */
    public static final Triple f89893c;

    /* JADX INFO: renamed from: d */
    public static final Triple f89894d;

    /* JADX INFO: renamed from: e */
    public static final Triple f89895e;

    /* JADX INFO: renamed from: f */
    public static final Triple f89896f;

    /* JADX INFO: renamed from: g */
    public static final Triple f89897g;

    /* JADX INFO: renamed from: a */
    public static final List m89145a() {
        return CollectionsKt.listOf((Object[]) new Integer[]{1, 3});
    }

    static {
        Float fValueOf = Float.valueOf(1.0f);
        f89891a = new Triple(fValueOf, fValueOf, fValueOf);
        Float fValueOf2 = Float.valueOf(4.0f);
        Float fValueOf3 = Float.valueOf(0.1f);
        Float fValueOf4 = Float.valueOf(0.2f);
        f89892b = new Triple(fValueOf2, fValueOf3, fValueOf4);
        Float fValueOf5 = Float.valueOf(2.0f);
        f89893c = new Triple(fValueOf2, fValueOf5, fValueOf4);
        f89894d = new Triple(fValueOf4, fValueOf2, fValueOf4);
        f89895e = new Triple(fValueOf4, fValueOf5, fValueOf2);
        f89896f = new Triple(fValueOf4, fValueOf3, fValueOf2);
        f89897g = new Triple(fValueOf2, fValueOf3, fValueOf2);
    }
}
