package com.jumio.core.util;

import android.content.Context;
import com.jumio.commons.log.Log;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/jumio/core/util/SplitUtil;", "", "<init>", "()V", "hasSplitCompat", "", "getHasSplitCompat", "()Z", "loadLibrary", "", "context", "Landroid/content/Context;", "library", "", "installSplitContext", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SplitUtil {

    @NotNull
    public static final SplitUtil INSTANCE = new SplitUtil();

    public final boolean getHasSplitCompat() {
        return ReflectionUtil.INSTANCE.hasClass("com.google.android.play.core.splitcompat.SplitCompat");
    }

    public final void installSplitContext(@Nullable Context context) {
        try {
            if (getHasSplitCompat()) {
                Class<?> cls = Class.forName("com.google.android.play.core.splitcompat.SplitCompat");
                ReflectionUtil reflectionUtil = ReflectionUtil.INSTANCE;
                Intrinsics.checkNotNull(cls);
                reflectionUtil.invokeMethodWithArgs(cls, "install", new Class[]{Context.class}, null, context);
                reflectionUtil.invokeMethodWithArgs(cls, "installActivity", new Class[]{Context.class}, null, context);
            }
        } catch (Exception e11) {
            Log.printStackTrace(e11);
        }
    }

    public final void loadLibrary(@NotNull Context context, @NotNull String library) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(library, "library");
        try {
            if (getHasSplitCompat()) {
                Class<?> cls = Class.forName("com.google.android.play.core.splitinstall.SplitInstallHelper");
                ReflectionUtil reflectionUtil = ReflectionUtil.INSTANCE;
                Intrinsics.checkNotNull(cls);
                reflectionUtil.invokeMethodWithArgs(cls, "loadLibrary", new Class[]{Context.class, String.class}, null, context, library);
            }
        } catch (Exception e11) {
            Log.printStackTrace(e11);
        }
    }
}
