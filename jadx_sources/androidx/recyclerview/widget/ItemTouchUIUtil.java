package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes34.dex */
public interface ItemTouchUIUtil {
    @SuppressLint({"UnknownNullness"})
    void clearView(View view);

    @SuppressLint({"UnknownNullness"})
    void onDraw(Canvas canvas, RecyclerView recyclerView, View view, float f11, float f12, int i11, boolean z11);

    @SuppressLint({"UnknownNullness"})
    void onDrawOver(Canvas canvas, RecyclerView recyclerView, View view, float f11, float f12, int i11, boolean z11);

    @SuppressLint({"UnknownNullness"})
    void onSelected(View view);
}
