package com.kubi.utils;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.internal.AssetHelper;
import com.blankj.utilcode.util.C5287o0;
import ro.C44128b;
import v70.C45463a;

/* JADX INFO: renamed from: com.kubi.utils.k */
/* JADX INFO: compiled from: ClipboardUtils.java */
/* JADX INFO: loaded from: classes54.dex */
public final class C27057k {
    @Nullable
    /* JADX INFO: renamed from: c */
    public static ClipData m66747c(@NonNull String... strArr) {
        ClipDescription primaryClipDescription;
        try {
            ClipboardManager clipboardManager = (ClipboardManager) C5287o0.m6331a().getSystemService("clipboard");
            if (clipboardManager == null || !clipboardManager.hasPrimaryClip() || (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) == null) {
                return null;
            }
            for (String str : strArr) {
                if (primaryClipDescription.hasMimeType(str)) {
                    return clipboardManager.getPrimaryClip();
                }
            }
            return null;
        } catch (Exception e11) {
            C45463a.m100408a(e11, "ClipboardUtils");
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static ClipData.Item m66748d(@NonNull String... strArr) {
        try {
            ClipData clipDataM66747c = m66747c(strArr);
            if (clipDataM66747c != null && clipDataM66747c.getItemCount() > 0) {
                return clipDataM66747c.getItemAt(0);
            }
        } catch (Exception e11) {
            C45463a.m100408a(e11, "ClipboardUtils");
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static CharSequence m66749e() {
        try {
            ClipData.Item itemM66748d = m66748d(AssetHelper.DEFAULT_MIME_TYPE, "text/html");
            if (itemM66748d == null) {
                return null;
            }
            return itemM66748d.coerceToText(C5287o0.m6331a());
        } catch (NullPointerException e11) {
            C45463a.m100408a(e11, "ClipboardUtils");
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m66745a() {
        try {
            ClipboardManager clipboardManager = (ClipboardManager) C5287o0.m6331a().getSystemService("clipboard");
            if (clipboardManager == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                clipboardManager.clearPrimaryClip();
            } else {
                clipboardManager.setPrimaryClip(m66750f(ClipData.newPlainText("", "")));
            }
        } catch (Exception e11) {
            C44128b.m97264h(e11);
            C45463a.m100408a(e11, "ClipboardUtils");
        }
    }

    public static void addListener(ClipboardManager.OnPrimaryClipChangedListener onPrimaryClipChangedListener) {
        if (onPrimaryClipChangedListener == null) {
            return;
        }
        try {
            ClipboardManager clipboardManager = (ClipboardManager) C5287o0.m6331a().getSystemService("clipboard");
            if (clipboardManager == null) {
                return;
            }
            clipboardManager.addPrimaryClipChangedListener(onPrimaryClipChangedListener);
        } catch (NullPointerException e11) {
            C44128b.m97264h(e11);
            C45463a.m100408a(e11, "ClipboardUtils");
        }
    }

    /* JADX INFO: renamed from: f */
    public static ClipData m66750f(ClipData clipData) {
        int i11 = Build.VERSION.SDK_INT;
        PersistableBundle persistableBundle = new PersistableBundle();
        if (i11 >= 33) {
            persistableBundle.putBoolean("android.content.extra.IS_SENSITIVE", true);
        } else {
            persistableBundle.putBoolean("android.content.extra.IS_SENSITIVE", true);
        }
        clipData.getDescription().setExtras(persistableBundle);
        return clipData;
    }

    public static void removeListener(ClipboardManager.OnPrimaryClipChangedListener onPrimaryClipChangedListener) {
        if (onPrimaryClipChangedListener == null) {
            return;
        }
        try {
            ClipboardManager clipboardManager = (ClipboardManager) C5287o0.m6331a().getSystemService("clipboard");
            if (clipboardManager == null) {
                return;
            }
            clipboardManager.removePrimaryClipChangedListener(onPrimaryClipChangedListener);
        } catch (NullPointerException e11) {
            C44128b.m97264h(e11);
            C45463a.m100408a(e11, "ClipboardUtils");
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m66746b(CharSequence charSequence) {
        try {
            ((ClipboardManager) C5287o0.m6331a().getSystemService("clipboard")).setPrimaryClip(m66750f(ClipData.newPlainText("text", charSequence)));
        } catch (Exception e11) {
            C44128b.m97264h(e11);
            C45463a.m100408a(e11, "ClipboardUtils");
        }
    }
}
