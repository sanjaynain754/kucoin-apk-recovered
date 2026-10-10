package za0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: za0.c */
/* JADX INFO: loaded from: classes59.dex */
public final class C46744c extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final float f104566a;

    /* JADX INFO: renamed from: b */
    public final boolean f104567b;

    public C46744c(float f11, boolean z11) {
        this.f104566a = f11;
        this.f104567b = z11;
    }

    public /* synthetic */ C46744c(float f11, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, (i11 & 2) != 0 ? false : z11);
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(@NotNull View view, @NotNull Outline outline) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(outline, "outline");
        if (this.f104567b) {
            outline.setRoundRect(view.getPaddingLeft(), view.getPaddingTop(), view.getMeasuredWidth() - view.getPaddingRight(), view.getMeasuredHeight() - view.getPaddingBottom(), this.f104566a);
        } else {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f104566a);
        }
    }
}
