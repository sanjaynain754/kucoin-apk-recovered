package p392k4;

import android.content.Context;
import com.facebook.fresco.p061ui.common.ControllerListener2;
import com.facebook.imagepipeline.core.C5656a;
import com.facebook.imagepipeline.core.ImagePipeline;
import java.util.Set;
import p283g5.InterfaceC37809b;
import p462n4.AbstractC42743a;
import p487o4.InterfaceC42956c;
import p651u3.C45106i;
import p712w3.InterfaceC45711k;

/* JADX INFO: renamed from: k4.g */
/* JADX INFO: compiled from: PipelineDraweeControllerBuilderSupplier.java */
/* JADX INFO: loaded from: classes34.dex */
public class C40892g implements InterfaceC45711k<C40891f> {

    /* JADX INFO: renamed from: a */
    public final Context f90947a;

    /* JADX INFO: renamed from: b */
    public final ImagePipeline f90948b;

    /* JADX INFO: renamed from: c */
    public final C40893h f90949c;

    /* JADX INFO: renamed from: d */
    public final Set<InterfaceC42956c> f90950d;

    /* JADX INFO: renamed from: e */
    public final Set<ControllerListener2> f90951e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC37809b f90952f;

    public C40892g(Context context, C40887b c40887b) {
        this(context, C5656a.m9433l(), c40887b);
    }

    public C40892g(Context context, C5656a c5656a, C40887b c40887b) {
        this(context, c5656a, null, null, c40887b);
    }

    @Override // p712w3.InterfaceC45711k
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C40891f get() {
        return new C40891f(this.f90947a, this.f90949c, this.f90948b, this.f90950d, this.f90951e).m89567M(this.f90952f);
    }

    public C40892g(Context context, C5656a c5656a, Set<InterfaceC42956c> set, Set<ControllerListener2> set2, C40887b c40887b) {
        this.f90947a = context;
        ImagePipeline imagePipelineM9445j = c5656a.m9445j();
        this.f90948b = imagePipelineM9445j;
        if (c40887b != null && c40887b.m89518d() != null) {
            this.f90949c = c40887b.m89518d();
        } else {
            this.f90949c = new C40893h();
        }
        this.f90949c.m89571a(context.getResources(), AbstractC42743a.m93662b(), c5656a.m9437b(context), C45106i.m99726g(), imagePipelineM9445j.m9227q(), c40887b != null ? c40887b.m89515a() : null, c40887b != null ? c40887b.m89516b() : null);
        this.f90950d = set;
        this.f90951e = set2;
        this.f90952f = c40887b != null ? c40887b.m89517c() : null;
    }
}
