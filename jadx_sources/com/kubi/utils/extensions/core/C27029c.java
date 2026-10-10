package com.kubi.utils.extensions.core;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5275i0;
import com.google.gson.Gson;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.utils.extensions.core.c */
/* JADX INFO: compiled from: CommonExt.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\t\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\u000b\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000e\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0010\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0013\u001a\u00020\u0003*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0018\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016*\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019\u001a)\u0010\u001d\u001a\u0004\u0018\u00010\u001c*\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u001b0\u001a¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m90084d2 = {"Landroid/content/Context;", "", "dpValue", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;F)I", "b", "(Landroid/content/Context;I)I", "Landroidx/fragment/app/Fragment;", "e", "(Landroidx/fragment/app/Fragment;F)I", "f", "(Landroidx/fragment/app/Fragment;I)I", "Landroid/view/View;", "c", "(Landroid/view/View;F)I", "d", "(Landroid/view/View;I)I", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "g", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)I", "", "", "kotlin.jvm.PlatformType", "i", "(Ljava/lang/Object;)Ljava/lang/String;", "", "Lkotlin/Pair;", "Landroid/os/Bundle;", CmcdData.Factory.STREAMING_FORMAT_HLS, "([Lkotlin/Pair;)Landroid/os/Bundle;", "Utils_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCommonExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonExt.kt\ncom/kubi/utils/extensions/core/CommonExtKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,224:1\n13579#2,2:225\n*S KotlinDebug\n*F\n+ 1 CommonExt.kt\ncom/kubi/utils/extensions/core/CommonExtKt\n*L\n184#1:225,2\n*E\n"})
public final class C27029c {
    /* JADX INFO: renamed from: a */
    public static final int m66598a(@NotNull Context context, float f11) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (int) ((f11 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: b */
    public static final int m66599b(@NotNull Context context, int i11) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (int) ((i11 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: c */
    public static final int m66600c(@NotNull View view, float f11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return m66598a(context, f11);
    }

    /* JADX INFO: renamed from: d */
    public static final int m66601d(@NotNull View view, int i11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return m66599b(context, i11);
    }

    /* JADX INFO: renamed from: e */
    public static final int m66602e(@NotNull Fragment fragment, float f11) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Context context = fragment.getContext();
        return context != null ? m66598a(context, f11) : C5275i0.m6236a(f11);
    }

    /* JADX INFO: renamed from: f */
    public static final int m66603f(@NotNull Fragment fragment, int i11) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Context context = fragment.getContext();
        return context != null ? m66599b(context, i11) : C5275i0.m6236a(i11);
    }

    /* JADX INFO: renamed from: g */
    public static final int m66604g(@NotNull RecyclerView.ViewHolder viewHolder, int i11) {
        Intrinsics.checkNotNullParameter(viewHolder, "<this>");
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        return m66601d(itemView, i11);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static final Bundle m66605h(@NotNull Pair<String, ? extends Object>[] pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "<this>");
        Bundle bundle = new Bundle();
        for (Pair<String, ? extends Object> pair : pairArr) {
            Object second = pair.getSecond();
            if (second == null) {
                bundle.putSerializable(pair.getFirst(), null);
            } else if (second instanceof Integer) {
                bundle.putInt(pair.getFirst(), ((Number) second).intValue());
            } else if (second instanceof Long) {
                bundle.putLong(pair.getFirst(), ((Number) second).longValue());
            } else if (second instanceof CharSequence) {
                bundle.putCharSequence(pair.getFirst(), (CharSequence) second);
            } else if (second instanceof String) {
                bundle.putString(pair.getFirst(), (String) second);
            } else if (second instanceof Float) {
                bundle.putFloat(pair.getFirst(), ((Number) second).floatValue());
            } else if (second instanceof Double) {
                bundle.putDouble(pair.getFirst(), ((Number) second).doubleValue());
            } else if (second instanceof Character) {
                bundle.putChar(pair.getFirst(), ((Character) second).charValue());
            } else if (second instanceof Short) {
                bundle.putShort(pair.getFirst(), ((Number) second).shortValue());
            } else if (second instanceof Boolean) {
                bundle.putBoolean(pair.getFirst(), ((Boolean) second).booleanValue());
            } else if (second instanceof Serializable) {
                bundle.putSerializable(pair.getFirst(), (Serializable) second);
            } else if (second instanceof Parcelable) {
                bundle.putParcelable(pair.getFirst(), (Parcelable) second);
            } else if (second instanceof int[]) {
                bundle.putIntArray(pair.getFirst(), (int[]) second);
            } else if (second instanceof long[]) {
                bundle.putLongArray(pair.getFirst(), (long[]) second);
            } else if (second instanceof float[]) {
                bundle.putFloatArray(pair.getFirst(), (float[]) second);
            } else if (second instanceof double[]) {
                bundle.putDoubleArray(pair.getFirst(), (double[]) second);
            } else if (second instanceof char[]) {
                bundle.putCharArray(pair.getFirst(), (char[]) second);
            } else if (second instanceof short[]) {
                bundle.putShortArray(pair.getFirst(), (short[]) second);
            } else if (second instanceof boolean[]) {
                bundle.putBooleanArray(pair.getFirst(), (boolean[]) second);
            } else if (second instanceof Object[]) {
                Object[] objArr = (Object[]) second;
                if (objArr instanceof CharSequence[]) {
                    String first = pair.getFirst();
                    Intrinsics.checkNotNull(second, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(first, (CharSequence[]) second);
                } else if (objArr instanceof String[]) {
                    String first2 = pair.getFirst();
                    Intrinsics.checkNotNull(second, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(first2, (String[]) second);
                } else if (objArr instanceof Parcelable[]) {
                    String first3 = pair.getFirst();
                    Intrinsics.checkNotNull(second, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(first3, (Parcelable[]) second);
                }
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: i */
    public static final String m66606i(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        return new Gson().toJson(obj);
    }
}
