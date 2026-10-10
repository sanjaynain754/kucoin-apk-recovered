package wa0;

import android.widget.ImageView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import ua0.C45144a;
import ua0.C45145b;
import ua0.C45146c;
import xa0.C46116b;
import xa0.C46119e;
import xa0.C46121g;
import xa0.InterfaceC46117c;

/* JADX INFO: renamed from: wa0.b */
/* JADX INFO: loaded from: classes59.dex */
public final class C45781b {
    /* JADX INFO: renamed from: a */
    public static final void m101105a(@NotNull ImageView imageView, @Nullable InterfaceC46117c interfaceC46117c) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (interfaceC46117c instanceof C46119e) {
            new C45145b(interfaceC46117c).m99786b(imageView);
            return;
        }
        if (interfaceC46117c instanceof C46121g) {
            new C45146c(interfaceC46117c).m99788b(imageView);
        } else if (interfaceC46117c instanceof C46116b) {
            new C45144a((C46116b) interfaceC46117c).m99784b(imageView);
        } else if (interfaceC46117c == null) {
            imageView.setImageDrawable(null);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m101106b(@NotNull ImageView imageView, @Nullable InterfaceC46117c interfaceC46117c) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        C45784e.m101111b(imageView, interfaceC46117c != null);
        m101105a(imageView, interfaceC46117c);
    }
}
