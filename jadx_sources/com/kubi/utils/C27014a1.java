package com.kubi.utils;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.sdk.utils.R$id;

/* JADX INFO: renamed from: com.kubi.utils.a1 */
/* JADX INFO: compiled from: ViewUtils.java */
/* JADX INFO: loaded from: classes54.dex */
public class C27014a1 {
    /* JADX INFO: renamed from: c */
    public static void m66503c(LinearLayoutManager linearLayoutManager, int i11) {
        linearLayoutManager.scrollToPositionWithOffset(i11, 0);
        linearLayoutManager.setStackFromEnd(true);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m66501a(View view) {
        return m66502b(view, 300L);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m66502b(View view, Long l11) {
        int i11 = R$id.kucoin_last_click;
        long jLongValue = view.getTag(i11) == null ? 0L : ((Long) view.getTag(i11)).longValue();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - jLongValue < l11.longValue()) {
            return true;
        }
        view.setTag(i11, Long.valueOf(jCurrentTimeMillis));
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static void m66504d(TextView textView, @DrawableRes int i11, int i12) {
        m66505e(textView, i11, i12, C5275i0.m6236a(5.0f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13 != 8388613) goto L20;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m66505e(TextView textView, @DrawableRes int i11, int i12, int i13) {
        if (i11 == 0) {
            if (i12 != 3) {
                if (i12 != 5) {
                    if (i12 != 48) {
                        if (i12 != 80) {
                            if (i12 != 8388611) {
                            }
                        } else {
                            textView.setCompoundDrawablesRelative(textView.getCompoundDrawablesRelative()[0], textView.getCompoundDrawablesRelative()[1], textView.getCompoundDrawablesRelative()[2], null);
                            return;
                        }
                    } else {
                        textView.setCompoundDrawablesRelative(textView.getCompoundDrawablesRelative()[0], null, textView.getCompoundDrawablesRelative()[2], textView.getCompoundDrawablesRelative()[3]);
                        return;
                    }
                }
                textView.setCompoundDrawablesRelative(textView.getCompoundDrawablesRelative()[0], textView.getCompoundDrawablesRelative()[1], null, textView.getCompoundDrawablesRelative()[3]);
                return;
            }
            textView.setCompoundDrawablesRelative(null, textView.getCompoundDrawablesRelative()[1], textView.getCompoundDrawablesRelative()[2], textView.getCompoundDrawablesRelative()[3]);
            return;
        }
        Drawable drawable = textView.getResources().getDrawable(i11);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        textView.setCompoundDrawablePadding(i13);
        if (i12 != 3) {
            if (i12 != 5) {
                if (i12 != 48) {
                    if (i12 != 80) {
                        if (i12 != 8388611) {
                            if (i12 != 8388613) {
                                return;
                            }
                        }
                    } else {
                        textView.setCompoundDrawablesRelative(textView.getCompoundDrawablesRelative()[0], textView.getCompoundDrawablesRelative()[1], textView.getCompoundDrawablesRelative()[2], drawable);
                        return;
                    }
                } else {
                    textView.setCompoundDrawablesRelative(textView.getCompoundDrawablesRelative()[0], drawable, textView.getCompoundDrawablesRelative()[2], textView.getCompoundDrawablesRelative()[3]);
                    return;
                }
            }
            textView.setCompoundDrawablesRelative(textView.getCompoundDrawablesRelative()[0], textView.getCompoundDrawablesRelative()[1], drawable, textView.getCompoundDrawablesRelative()[3]);
            return;
        }
        textView.setCompoundDrawablesRelative(drawable, textView.getCompoundDrawablesRelative()[1], textView.getCompoundDrawablesRelative()[2], textView.getCompoundDrawablesRelative()[3]);
    }
}
