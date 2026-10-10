package com.kubi.assets.view;

import android.text.TextPaint;
import android.widget.TextView;
import java.util.Calendar;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import p429lf.C42179a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.view.y, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AssetViewHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/assets/view/AssetViewHelper;", "", "<init>", "()V", "getLocalTimeForUtcMidnight", "", "findOptimalFontSize", "", "textView", "Landroid/widget/TextView;", "text", "availableWidth", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AssetViewHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AssetViewHelper f19192a = new AssetViewHelper();

    /* JADX INFO: renamed from: a */
    public final float m20178a(@NotNull TextView textView, @NotNull String text, int i11) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(text, "text");
        TextPaint paint = textView.getPaint();
        float f11 = textView.getContext().getResources().getDisplayMetrics().scaledDensity;
        for (float f12 = 32.0f; f12 >= 16.0f; f12 -= 1.0f) {
            paint.setTextSize(f12 * f11);
            if (paint.measureText(text) <= i11) {
                return f12;
            }
        }
        return 16.0f;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m20179b() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return C42179a.m92633f(calendar.getTimeInMillis(), null, true, true, null, 9, null);
    }
}
