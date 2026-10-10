package ua0;

import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import wa0.C45780a;
import xa0.C46119e;
import xa0.InterfaceC46117c;

/* JADX INFO: renamed from: ua0.b */
/* JADX INFO: loaded from: classes59.dex */
public final class C45145b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC46117c f101590a;

    public C45145b(@NotNull InterfaceC46117c image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f101590a = image;
    }

    /* JADX INFO: renamed from: b */
    public final void m99786b(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        InterfaceC46117c interfaceC46117c = this.f101590a;
        if (interfaceC46117c instanceof C46119e) {
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "imageView.context");
            imageView.setImageDrawable(m99785a((C46119e) interfaceC46117c, context));
        }
    }

    /* JADX INFO: renamed from: a */
    public final Drawable m99785a(C46119e c46119e, Context context) {
        int iIntValue;
        Drawable drawable = AppCompatResources.getDrawable(context, c46119e.m101626d());
        Integer numM101624b = c46119e.m101624b();
        Integer numM101625c = c46119e.m101625c();
        if (numM101625c != null || c46119e.m101623a() != null || numM101624b != null) {
            if (drawable != null && (drawable = drawable.mutate()) != null) {
                if (numM101624b != null) {
                    iIntValue = C45780a.m101102b(context, numM101624b.intValue());
                } else if (numM101625c != null) {
                    iIntValue = ContextCompat.getColor(context, numM101625c.intValue());
                } else {
                    Integer numM101623a = c46119e.m101623a();
                    if (numM101623a != null) {
                        iIntValue = numM101623a.intValue();
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                drawable.setTint(iIntValue);
            } else {
                drawable = null;
            }
        }
        if (drawable instanceof AnimatedVectorDrawable) {
            ((AnimatedVectorDrawable) drawable).start();
        }
        return drawable;
    }
}
