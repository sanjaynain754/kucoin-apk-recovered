package com.kubi.sdk.util;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.RequiresApi;
import com.kubi.sdk.exception.AppBaseMessage;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.sdk.util.g1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SnapshotHelper.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00070\u000bJ&\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00070\u000bH\u0003J.\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00070\u000bH\u0002J \u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0014H\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/sdk/util/SnapshotHelper;", "", "<init>", "()V", "TAG", "", "snapshot", "", "activity", "Landroid/app/Activity;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "screenshotNativeAndFlutter", "screenshotFlutterSurface", "flutterSurface", "Landroid/view/SurfaceView;", "nativeBitmap", "mergeBitmaps", "flutterBitmap", "Landroid/view/View;", "findFlutterSurfaceView", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSnapshotHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotHelper.kt\ncom/kubi/sdk/util/SnapshotHelper\n+ 2 AppBaseIssue.kt\ncom/kubi/sdk/exception/AppBaseIssueKt\n+ 3 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,152:1\n49#2,2:153\n49#2,2:161\n49#2,2:163\n90#3,6:155\n90#3,6:165\n90#3,6:171\n*S KotlinDebug\n*F\n+ 1 SnapshotHelper.kt\ncom/kubi/sdk/util/SnapshotHelper\n*L\n53#1:153,2\n77#1:161,2\n91#1:163,2\n57#1:155,6\n95#1:165,6\n117#1:171,6\n*E\n"})
public final class SnapshotHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SnapshotHelper f48173a = new SnapshotHelper();

    @RequiresApi(26)
    /* JADX INFO: renamed from: g */
    public final void m58415g(Activity activity, final Function1<? super Bitmap, Unit> function1) {
        try {
            Window window = activity.getWindow();
            final View decorView = window.getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
            if (decorView.getWidth() != 0 && decorView.getHeight() != 0) {
                final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(decorView.getWidth(), decorView.getHeight(), Bitmap.Config.ARGB_8888);
                PixelCopy.request(window, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.kubi.sdk.util.e1
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(int i11) {
                        SnapshotHelper.m58411h(function1, decorView, bitmapCreateBitmap, i11);
                    }
                }, new Handler(Looper.getMainLooper()));
                return;
            }
            C44128b.m97266j("SnapshotHelper", "screenshotNativeAndFlutter wait layout");
            C43846g.m96568c(new AppBaseMessage("screenshotNativeAndFlutter wait layout", "SnapshotHelper", false, 4, null), null, 2, null);
        } catch (Exception e11) {
            C43846g.m96568c(new AppBaseMessage("screenshotNativeAndFlutter exception:" + e11.getMessage(), "SnapshotHelper", false, 4, null), null, 2, null);
            function1.invoke(null);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m58410f(Function1 function1, Bitmap bitmap, Bitmap bitmap2, SurfaceView surfaceView, int i11) {
        if (i11 != 0) {
            function1.invoke(bitmap);
        } else {
            function1.invoke(f48173a.m58413d(bitmap, bitmap2, surfaceView));
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m58411h(Function1 function1, View view, Bitmap bitmap, int i11) {
        if (i11 != 0) {
            function1.invoke(null);
            return;
        }
        SnapshotHelper snapshotHelper = f48173a;
        SurfaceView surfaceViewM58412c = snapshotHelper.m58412c(view);
        if (surfaceViewM58412c == null) {
            function1.invoke(bitmap);
        } else {
            snapshotHelper.m58414e(surfaceViewM58412c, bitmap, function1);
        }
    }

    /* JADX INFO: renamed from: c */
    public final SurfaceView m58412c(View view) {
        if (view instanceof SurfaceView) {
            return (SurfaceView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            SurfaceView surfaceViewM58412c = m58412c(childAt);
            if (surfaceViewM58412c != null) {
                return surfaceViewM58412c;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final void m58416i(@NotNull Activity activity, @NotNull Function1<? super Bitmap, Unit> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (Build.VERSION.SDK_INT >= 26) {
            m58415g(activity, callback);
        }
    }

    /* JADX INFO: renamed from: d */
    public final Bitmap m58413d(Bitmap bitmap, Bitmap bitmap2, View view) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        View rootView = view.getRootView();
        Intrinsics.checkNotNull(rootView, "null cannot be cast to non-null type android.view.View");
        rootView.getLocationOnScreen(iArr2);
        canvas.drawBitmap(bitmap2, iArr[0] - iArr2[0], iArr[1] - iArr2[1], (Paint) null);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: e */
    public final void m58414e(final SurfaceView surfaceView, final Bitmap bitmap, final Function1<? super Bitmap, Unit> function1) {
        if (surfaceView.getWidth() != 0 && surfaceView.getHeight() != 0) {
            final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888);
            PixelCopy.request(surfaceView, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.kubi.sdk.util.f1
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i11) {
                    SnapshotHelper.m58410f(function1, bitmap, bitmapCreateBitmap, surfaceView, i11);
                }
            }, new Handler(Looper.getMainLooper()));
        } else {
            C44128b.m97266j("SnapshotHelper", "screenshotFlutterSurface wait layout");
            C43846g.m96568c(new AppBaseMessage("screenshotFlutterSurface wait layout", "SnapshotHelper", false, 4, null), null, 2, null);
        }
    }
}
