package com.kubi.resources.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FocusTextView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/resources/widget/FocusTextView;", "Lcom/kubi/resources/widget/BaseTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_bitmap", "Landroid/graphics/Bitmap;", "bitmap", "getBitmap", "()Landroid/graphics/Bitmap;", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "setBackground", "", "background", "Landroid/graphics/drawable/Drawable;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFocusTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTextView.kt\ncom/kubi/resources/widget/FocusTextView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n1#2:48\n*E\n"})
public final class FocusTextView extends BaseTextView {

    /* JADX INFO: renamed from: b */
    @Nullable
    public Bitmap f43813b;

    @Override // android.view.View
    public void setBackground(@Nullable Drawable background) {
        this.f43813b = null;
        super.setBackground(background);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusTextView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    private final Bitmap getBitmap() {
        if (this.f43813b == null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            draw(new Canvas(bitmapCreateBitmap));
            this.f43813b = bitmapCreateBitmap;
        }
        Bitmap bitmap = this.f43813b;
        Intrinsics.checkNotNull(bitmap);
        return bitmap;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        if (((int) ev2.getX()) >= getBitmap().getWidth() || ((int) ev2.getY()) >= getBitmap().getHeight() || Color.alpha(getBitmap().getPixel((int) ev2.getX(), (int) ev2.getY())) <= 0) {
            return false;
        }
        return super.dispatchTouchEvent(ev2);
    }
}
