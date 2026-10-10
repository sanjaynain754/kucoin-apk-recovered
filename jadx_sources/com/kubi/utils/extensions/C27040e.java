package com.kubi.utils.extensions;

import android.content.res.Resources;
import android.util.TypedValue;
import androidx.media3.exoplayer.upstream.CmcdData;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.utils.extensions.e */
/* JADX INFO: compiled from: SizeEx.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\"\u0015\u0010\u0003\u001a\u00020\u0000*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0003\u001a\u00020\u0004*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0015\u0010\b\u001a\u00020\u0000*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0002\"\u0015\u0010\b\u001a\u00020\u0004*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006¨\u0006\n"}, m90084d2 = {"", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(F)F", "dp", "", "b", "(I)I", "c", "sp", "d", "Utils_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C27040e {
    /* JADX INFO: renamed from: b */
    public static final int m66658b(int i11) {
        return (int) TypedValue.applyDimension(1, i11, Resources.getSystem().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: d */
    public static final int m66660d(int i11) {
        return (int) TypedValue.applyDimension(2, i11, Resources.getSystem().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: a */
    public static final float m66657a(float f11) {
        return TypedValue.applyDimension(1, f11, Resources.getSystem().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: c */
    public static final float m66659c(float f11) {
        return TypedValue.applyDimension(2, f11, Resources.getSystem().getDisplayMetrics());
    }
}
