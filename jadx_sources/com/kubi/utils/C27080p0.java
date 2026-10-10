package com.kubi.utils;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.collection.SimpleArrayMap;
import com.blankj.utilcode.util.C5258a;
import com.blankj.utilcode.util.C5275i0;
import com.blankj.utilcode.util.KeyboardUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ro.C44127a;

/* JADX INFO: renamed from: com.kubi.utils.p0 */
/* JADX INFO: compiled from: ResizeViewUtil.java */
/* JADX INFO: loaded from: classes54.dex */
public class C27080p0 {

    /* JADX INFO: renamed from: a */
    public static SimpleArrayMap<String, Integer> f54412a = new SimpleArrayMap<>();

    /* JADX INFO: renamed from: b */
    public static SimpleArrayMap<String, ViewTreeObserver.OnGlobalLayoutListener> f54413b = new SimpleArrayMap<>();

    /* JADX INFO: renamed from: c */
    public static SimpleArrayMap<String, KeyboardUtils.InterfaceC5235b> f54414c = new SimpleArrayMap<>();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m66824a(Activity activity) {
        int iM66826c;
        if (f54414c.get(activity.getClass().getName()) == null || f54412a.get(activity.getClass().getName()).intValue() == (iM66826c = m66826c(activity))) {
            return;
        }
        f54414c.get(activity.getClass().getName()).mo6045a(iM66826c);
        f54412a.put(activity.getClass().getName(), Integer.valueOf(iM66826c));
    }

    /* JADX INFO: renamed from: f */
    public static void m66829f(final View view, final View view2) {
        final int iM6236a = C5275i0.m6236a(10.0f);
        m66828e(C5258a.m6125h(), new KeyboardUtils.InterfaceC5235b() { // from class: com.kubi.utils.n0
            @Override // com.blankj.utilcode.util.KeyboardUtils.InterfaceC5235b
            /* JADX INFO: renamed from: a */
            public final void mo6045a(int i11) {
                C27080p0.m66825b(view, view2, iM6236a, i11);
            }
        });
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: g */
    public static void m66830g(Activity activity) {
        if (activity == null) {
            return;
        }
        activity.findViewById(R.id.content).getViewTreeObserver().removeOnGlobalLayoutListener(f54413b.get(activity.getClass().getName()));
        f54414c.remove(activity.getClass().getName());
        f54413b.remove(activity.getClass().getName());
        f54412a.remove(activity.getClass().getName());
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m66825b(View view, View view2, int i11, int i12) {
        int height = view.getHeight() - view2.getBottom();
        if (height < i12) {
            view.animate().translationY((height - i12) - i11).start();
        }
        if (i12 <= 0) {
            view.animate().translationY(0.0f).start();
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m66826c(Activity activity) {
        View childAt = ((FrameLayout) activity.findViewById(R.id.content)).getChildAt(0);
        Rect rect = new Rect();
        childAt.getWindowVisibleDisplayFrame(rect);
        C44127a.m97243c("KeyboardUtils", "getContentViewInvisibleHeight: " + (childAt.getBottom() - rect.bottom));
        return childAt.getBottom() - rect.bottom;
    }

    /* JADX INFO: renamed from: d */
    public static SpannableStringBuilder m66827d(Context context, CharSequence charSequence, String str, @ColorInt int i11) {
        if (TextUtils.isEmpty(charSequence)) {
            return new SpannableStringBuilder("");
        }
        if (TextUtils.isEmpty(str)) {
            return new SpannableStringBuilder(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i11);
        Matcher matcher = Pattern.compile(str).matcher(charSequence);
        while (matcher.find()) {
            int iEnd = matcher.end();
            spannableStringBuilder.setSpan(foregroundColorSpan, iEnd - str.length(), iEnd, 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: e */
    public static void m66828e(final Activity activity, KeyboardUtils.InterfaceC5235b interfaceC5235b) {
        if ((activity.getWindow().getAttributes().flags & 512) != 0) {
            activity.getWindow().clearFlags(512);
        }
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(R.id.content);
        f54412a.put(activity.getClass().getName(), Integer.valueOf(m66826c(activity)));
        f54414c.put(activity.getClass().getName(), interfaceC5235b);
        f54413b.put(activity.getClass().getName(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.kubi.utils.o0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C27080p0.m66824a(activity);
            }
        });
        frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(f54413b.get(activity.getClass().getName()));
    }
}
