package ua0;

import android.content.Context;
import android.widget.ImageView;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import va0.C45485a;
import wa0.C45780a;
import xa0.C46121g;
import xa0.InterfaceC46117c;

/* JADX INFO: renamed from: ua0.c */
/* JADX INFO: loaded from: classes59.dex */
public final class C45146c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC46117c f101591a;

    public C45146c(@NotNull InterfaceC46117c image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f101591a = image;
    }

    /* JADX INFO: renamed from: a */
    public final C45485a m99787a(C46121g c46121g, Context context) {
        C45485a c45485a = new C45485a(c46121g.m101632d(), c46121g.m101633e(), C45780a.m101101a(context, c46121g.m101634f()), C45780a.m101101a(context, c46121g.m101631c()));
        c45485a.m100447a(c46121g.m101629a());
        c45485a.m100449d(true);
        C45485a.m100446c(c45485a, c46121g.m101630b(), 0, 2, null);
        return c45485a;
    }

    /* JADX INFO: renamed from: b */
    public final void m99788b(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        InterfaceC46117c interfaceC46117c = this.f101591a;
        if (interfaceC46117c instanceof C46121g) {
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "imageView.context");
            imageView.setImageDrawable(m99787a((C46121g) interfaceC46117c, context));
        }
    }
}
