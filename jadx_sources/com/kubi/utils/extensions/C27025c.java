package com.kubi.utils.extensions;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.utils.extensions.c */
/* JADX INFO: compiled from: CommonEx.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\r\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\t\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0012\u001a\u00020\u000e*\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Landroid/os/Bundle;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/os/Bundle;)I", "Landroid/content/Context;", "context", "dp", "", "c", "(Landroid/content/Context;I)F", "b", "(Landroid/content/Context;F)F", "sp", "f", "", "d", "(Ljava/lang/Boolean;)Z", "default", "e", "(Ljava/lang/Boolean;Z)Z", "Utils_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCommonEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonEx.kt\ncom/kubi/utils/extensions/CommonExKt\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,119:1\n15#2,2:120\n19#2,2:122\n*S KotlinDebug\n*F\n+ 1 CommonEx.kt\ncom/kubi/utils/extensions/CommonExKt\n*L\n91#1:120,2\n99#1:122,2\n*E\n"})
public final class C27025c {
    /* JADX INFO: renamed from: a */
    public static final int m66563a(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
        try {
            parcelObtain.writeBundle(bundle);
            return parcelObtain.dataSize();
        } catch (Exception e11) {
            e11.printStackTrace();
            return 1000;
        } finally {
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final float m66564b(@NotNull Context context, float f11) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (f11 * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    /* JADX INFO: renamed from: c */
    public static final float m66565c(@NotNull Context context, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (i11 * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m66566d(@Nullable Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m66567e(@Nullable Boolean bool, boolean z11) {
        return bool != null ? bool.booleanValue() : z11;
    }

    /* JADX INFO: renamed from: f */
    public static final float m66568f(@NotNull Context context, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (i11 * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f;
    }
}
