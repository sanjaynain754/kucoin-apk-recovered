package jumio.core;

import com.jumio.core.model.StaticModel;
import java.util.List;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.W */
/* JADX INFO: loaded from: classes61.dex */
public final class C40610W implements StaticModel {

    /* JADX INFO: renamed from: a */
    public final boolean f90151a;

    /* JADX INFO: renamed from: b */
    public final boolean f90152b;

    /* JADX INFO: renamed from: c */
    public final String f90153c;

    /* JADX INFO: renamed from: d */
    public final List f90154d;

    public C40610W(boolean z11, boolean z12, String classifier, List images) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(images, "images");
        this.f90151a = z11;
        this.f90152b = z12;
        this.f90153c = classifier;
        this.f90154d = images;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40610W)) {
            return false;
        }
        C40610W c40610w = (C40610W) obj;
        return this.f90151a == c40610w.f90151a && this.f90152b == c40610w.f90152b && Intrinsics.areEqual(this.f90153c, c40610w.f90153c) && Intrinsics.areEqual(this.f90154d, c40610w.f90154d);
    }

    public final int hashCode() {
        return this.f90154d.hashCode() + AbstractC40511C.m89148a(this.f90153c, AbstractC40637b0.m89251a(this.f90152b, Boolean.hashCode(this.f90151a) * 31, 31), 31);
    }

    public final String toString() {
        return "CameraChallengeData(manualEnabled=" + this.f90151a + ", uploadImages=" + this.f90152b + ", classifier=" + this.f90153c + ", images=" + this.f90154d + ')';
    }

    public /* synthetic */ C40610W() {
        this(true, false, "", CollectionsKt.emptyList());
    }
}
