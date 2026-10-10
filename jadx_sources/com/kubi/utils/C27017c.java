package com.kubi.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.ArrayRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.utils.c */
/* JADX INFO: compiled from: ApplicationCompat.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\b2\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\n \u0018*\u0004\u0018\u00010\u00170\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/utils/c;", "", "<init>", "()V", "", "id", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I)I", "", "formatArgs", "", "f", "(I[Ljava/lang/Object;)Ljava/lang/String;", "tint", "Landroid/graphics/drawable/Drawable;", "c", "(ILjava/lang/Integer;)Landroid/graphics/drawable/Drawable;", CmcdData.Factory.STREAMING_FORMAT_HLS, "g", "(I)[Ljava/lang/String;", "Landroid/content/Context;", "b", "()Landroid/content/Context;", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "e", "()Landroid/content/res/Resources;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C27017c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C27017c f54310a = new C27017c();

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Drawable m66510d(C27017c c27017c, int i11, Integer num, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            num = null;
        }
        return c27017c.m66514c(i11, num);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Drawable m66511i(C27017c c27017c, int i11, Integer num, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            num = null;
        }
        return c27017c.m66518h(i11, num);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Context m66513b() {
        return C27059l.f54343a.m66757a();
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    @NotNull
    /* JADX INFO: renamed from: c */
    public final Drawable m66514c(@DrawableRes int id2, @ColorRes @Nullable Integer tint) {
        return m66518h(id2, tint == null ? null : Integer.valueOf(m66515e().getColor(tint.intValue())));
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m66516f(@StringRes int id2, @NotNull Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        return C27019d.m66519a(m66513b(), id2, formatArgs);
    }

    /* JADX INFO: renamed from: a */
    public final int m66512a(@ColorRes int id2) {
        return m66515e().getColor(id2);
    }

    /* JADX INFO: renamed from: e */
    public final Resources m66515e() {
        return m66513b().getResources();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final String[] m66517g(@ArrayRes int id2) {
        String[] stringArray = m66515e().getStringArray(id2);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getResources().getStringArray(id)");
        return stringArray;
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    @NotNull
    /* JADX INFO: renamed from: h */
    public final Drawable m66518h(@DrawableRes int id2, @ColorInt @Nullable Integer tint) {
        Drawable drawable = m66515e().getDrawable(id2);
        if (tint != null) {
            drawable.mutate().setColorFilter(new PorterDuffColorFilter(tint.intValue(), PorterDuff.Mode.SRC_ATOP));
        }
        Intrinsics.checkNotNullExpressionValue(drawable, "getResources().getDrawab…\n            it\n        }");
        return drawable;
    }
}
