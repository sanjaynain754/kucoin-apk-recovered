package com.kubi.share.lib.utils;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.utils.C27100x0;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.kubi.share.lib.utils.u */
/* JADX INFO: compiled from: ShareImageLoadTarget.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a.\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002\u001a3\u0010\n\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m90084d2 = {"setAndFitBitmap", "", "Landroid/widget/ImageView;", InterfaceC33617e1.f69660i, "Landroid/graphics/Bitmap;", "contentView", "Landroid/view/View;", ViewProps.MAX_WIDTH, "", ViewProps.MAX_HEIGHT, "setAndAdjustBitmap", "fixedRatio", "", "(Landroid/widget/ImageView;Landroid/graphics/Bitmap;Ljava/lang/Double;Ljava/lang/Integer;)V", "ShareLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nShareImageLoadTarget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareImageLoadTarget.kt\ncom/kubi/share/lib/utils/ShareImageLoadTargetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
public final class C24651u {
    /* JADX INFO: renamed from: f */
    public static final void m59889f(@Nullable final ImageView imageView, @NotNull final Bitmap resource, @Nullable final Double d11, @Nullable final Integer num) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        if (imageView == null) {
            return;
        }
        imageView.post(new Runnable() { // from class: com.kubi.share.lib.utils.q
            @Override // java.lang.Runnable
            public final void run() {
                C24651u.m59891h(d11, resource, imageView, num);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m59890g(ImageView imageView, Bitmap bitmap, Double d11, Integer num, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            d11 = null;
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        m59889f(imageView, bitmap, d11, num);
    }

    /* JADX INFO: renamed from: h */
    public static final void m59891h(final Double d11, final Bitmap bitmap, final ImageView imageView, final Integer num) {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.share.lib.utils.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C24651u.m59892i(d11, bitmap, imageView, num);
            }
        });
        C27100x0.m66924e(new Function0() { // from class: com.kubi.share.lib.utils.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C24651u.m59893j(imageView, bitmap);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m59892i(Double d11, Bitmap bitmap, ImageView imageView, Integer num) {
        int width = (int) (((double) imageView.getWidth()) / (d11 != null ? d11.doubleValue() : ((double) bitmap.getWidth()) / ((double) bitmap.getHeight())));
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (num != null) {
            width = Integer.valueOf(RangesKt.coerceAtMost(width, num.intValue())).intValue();
        }
        layoutParams.height = width;
        imageView.setLayoutParams(layoutParams);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final void m59894k(final ImageView imageView, final Bitmap bitmap, final View view, final int i11, final int i12) {
        if (imageView != null && i11 > 0 && i12 > 0) {
            C27100x0.m66924e(new Function0() { // from class: com.kubi.share.lib.utils.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C24651u.m59895l(bitmap, i11, i12, view, imageView);
                }
            });
        }
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m59893j(ImageView imageView, Bitmap bitmap) {
        imageView.setImageBitmap(bitmap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m59895l(Bitmap bitmap, int i11, int i12, View view, ImageView imageView) {
        float width = bitmap.getWidth() / bitmap.getHeight();
        int iMin = Math.min(i11, (int) (i12 * width));
        int i13 = (int) (iMin / width);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = iMin;
        layoutParams.height = i13;
        view.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        layoutParams2.width = iMin;
        layoutParams2.height = i13;
        imageView.setLayoutParams(layoutParams2);
        imageView.setImageBitmap(bitmap);
        return Unit.INSTANCE;
    }
}
