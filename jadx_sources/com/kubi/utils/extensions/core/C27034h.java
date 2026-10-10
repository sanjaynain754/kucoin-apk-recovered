package com.kubi.utils.extensions.core;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.utils.extensions.core.h */
/* JADX INFO: compiled from: ResourceExt.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\t\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0004\u001a\u0019\u0010\u000b\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\r\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u000f\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\f\u001a\u0019\u0010\u0011\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0014\u001a\u00020\u0001*\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m90084d2 = {"Landroid/content/Context;", "", "id", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;I)I", "Landroid/graphics/drawable/Drawable;", "kotlin.jvm.PlatformType", "g", "(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;", "d", "Landroid/view/View;", "b", "(Landroid/view/View;I)I", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Landroid/view/View;I)Landroid/graphics/drawable/Drawable;", "e", "Landroidx/fragment/app/Fragment;", "f", "(Landroidx/fragment/app/Fragment;I)I", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "c", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)I", "Utils_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C27034h {
    /* JADX INFO: renamed from: a */
    public static final int m66630a(@NotNull Context context, int i11) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getResources().getColor(i11);
    }

    /* JADX INFO: renamed from: b */
    public static final int m66631b(@NotNull View view, int i11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return m66630a(context, i11);
    }

    /* JADX INFO: renamed from: c */
    public static final int m66632c(@NotNull RecyclerView.ViewHolder viewHolder, int i11) {
        Intrinsics.checkNotNullParameter(viewHolder, "<this>");
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        return m66631b(itemView, i11);
    }

    /* JADX INFO: renamed from: d */
    public static final int m66633d(@NotNull Context context, int i11) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getResources().getDimensionPixelSize(i11);
    }

    /* JADX INFO: renamed from: e */
    public static final int m66634e(@NotNull View view, int i11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return m66633d(context, i11);
    }

    /* JADX INFO: renamed from: f */
    public static final int m66635f(@NotNull Fragment fragment, int i11) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Context context = fragment.getContext();
        return context != null ? m66633d(context, i11) : Resources.getSystem().getDimensionPixelSize(i11);
    }

    /* JADX INFO: renamed from: g */
    public static final Drawable m66636g(@NotNull Context context, int i11) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getResources().getDrawable(i11);
    }

    /* JADX INFO: renamed from: h */
    public static final Drawable m66637h(@NotNull View view, int i11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return m66636g(context, i11);
    }
}
