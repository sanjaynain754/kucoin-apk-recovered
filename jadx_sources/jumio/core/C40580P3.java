package jumio.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.jumio.commons.log.Log;
import jumio.core.C40580P3;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.P3 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40580P3 extends AppCompatImageView {
    /* JADX INFO: renamed from: a */
    public static final Unit m89213a(C40580P3 c40580p3, Drawable drawable) {
        super.setImageDrawable(drawable);
        return Unit.INSTANCE;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i11) {
        if (i11 != 4 && i11 != 8) {
            super.setVisibility(i11);
            return;
        }
        Log.m14463d("StickyImageView", "Tried to set visibility: " + AbstractC40707p.m89261a(i11) + ", ignoring...");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40580P3(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m89212a(C40580P3 c40580p3, Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        return Unit.INSTANCE;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(final View changedView, int i11) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, i11);
        if (Intrinsics.areEqual(changedView, this)) {
            if (i11 == 8 || i11 == 4) {
                Log.m14463d("StickyImageView", "Visibility changed to: " + AbstractC40707p.m89261a(i11) + ". Resetting...");
                post(new Runnable() { // from class: lg0.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        C40580P3.m89214a(changedView);
                    }
                });
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageAlpha(int i11) {
        if (i11 >= 255) {
            super.setImageAlpha(i11);
            return;
        }
        Log.m14463d("StickyImageView", "Tried to set alpha to " + i11 + ", ignoring...");
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(@Nullable final Bitmap bitmap) {
        Function0 function0 = new Function0() { // from class: lg0.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40580P3.m89212a(this.f93676b, bitmap);
            }
        };
        if (getDrawable() != null) {
            Log.m14463d("StickyImageView", "Tried to replace image, ignoring...");
        } else {
            function0.invoke();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(@Nullable final Drawable drawable) {
        Function0 function0 = new Function0() { // from class: lg0.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40580P3.m89213a(this.f93674b, drawable);
            }
        };
        if (getDrawable() != null) {
            Log.m14463d("StickyImageView", "Tried to replace image, ignoring...");
        } else {
            function0.invoke();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(final int i11) {
        Function0 function0 = new Function0() { // from class: lg0.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40580P3.m89211a(this.f93679b, i11);
            }
        };
        if (getDrawable() != null) {
            Log.m14463d("StickyImageView", "Tried to replace image, ignoring...");
        } else {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m89211a(C40580P3 c40580p3, int i11) {
        super.setImageResource(i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final void m89214a(View view) {
        view.setVisibility(0);
    }
}
