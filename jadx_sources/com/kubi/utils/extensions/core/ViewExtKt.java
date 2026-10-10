package com.kubi.utils.extensions.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import x70.InterfaceC46098a;

/* JADX INFO: compiled from: ViewExt.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\u0004\u001a!\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\r\u001a9\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a4\u0010\u001a\u001a\u00020\u0018*\u00020\u00002!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00180\u0014¢\u0006\u0004\b\u001a\u0010\u001b\u001a4\u0010\u001c\u001a\u00020\u0018*\u00020\u00002!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00060\u0014¢\u0006\u0004\b\u001c\u0010\u001b\u001a\u0011\u0010\u001d\u001a\u00020\u0018*\u00020\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0011\u0010\u001f\u001a\u00020\u0018*\u00020\u0000¢\u0006\u0004\b\u001f\u0010\u001e\u001a\u0011\u0010!\u001a\u00020 *\u00020\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001d\u0010$\u001a\u0004\u0018\u00010 *\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u0001¢\u0006\u0004\b$\u0010%\u001a+\u0010&\u001a\u00020 *\u00020\u00002\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010#\u001a\u00020\u0001¢\u0006\u0004\b&\u0010'\u001a\u001d\u0010(\u001a\u0004\u0018\u00010 *\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u0001¢\u0006\u0004\b(\u0010%\u001a*\u0010*\u001a\u00020\u0018*\u00020\u00002\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00180\u0014¢\u0006\u0002\b)¢\u0006\u0004\b*\u0010\u001b\"\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,\"\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100\"\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104\"\u0015\u00108\u001a\u00020\u0006*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b6\u00107\"\u0015\u0010:\u001a\u00020\u0006*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b9\u00107\"\u0015\u0010<\u001a\u00020\u0006*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b;\u00107¨\u0006="}, m90084d2 = {"Landroid/view/View;", "", "height", "i", "(Landroid/view/View;I)Landroid/view/View;", "Landroid/widget/TextView;", "", "isBold", "d", "(Landroid/widget/TextView;Z)Landroid/widget/TextView;", "width", "z", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "(Landroid/view/View;II)Landroid/view/View;", "startMargin", "topMargin", "endMargin", "bottomMargin", "o", "(Landroid/view/View;IIII)Landroid/view/View;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "f", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "m", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Landroid/view/View;)V", "y", "Landroid/graphics/Bitmap;", "r", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "color", CmcdData.Factory.STREAMING_FORMAT_SS, "(Landroid/view/View;I)Landroid/graphics/Bitmap;", "w", "(Landroid/view/View;III)Landroid/graphics/Bitmap;", "u", "Lkotlin/ExtensionFunctionType;", "q", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Z", "_viewClickFlag", "Ljava/lang/Runnable;", "b", "Ljava/lang/Runnable;", "_clickRunnable", "Landroid/os/Handler;", "c", "Landroid/os/Handler;", "_handler", "j", "(Landroid/view/View;)Z", "isGone", CmcdData.Factory.STREAM_TYPE_LIVE, "isVisible", "k", "isInvisible", "Utils_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nViewExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewExt.kt\ncom/kubi/utils/extensions/core/ViewExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,452:1\n435#1,6:453\n1549#2:459\n1620#2,3:460\n54#3,4:463\n*S KotlinDebug\n*F\n+ 1 ViewExt.kt\ncom/kubi/utils/extensions/core/ViewExtKt\n*L\n361#1:453,6\n372#1:459\n372#1:460,3\n450#1:463,4\n*E\n"})
public final class ViewExtKt {

    /* JADX INFO: renamed from: a */
    public static boolean f54321a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static Runnable f54322b = new Runnable() { // from class: com.kubi.utils.extensions.core.j
        @Override // java.lang.Runnable
        public final void run() {
            ViewExtKt.m66574e();
        }
    };

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Handler f54323c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e */
    public static final void m66574e() {
        f54321a = false;
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public static final View m66569A(@NotNull View view, int i11, int i12) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        layoutParams.width = i11;
        layoutParams.height = i12;
        view.setLayoutParams(layoutParams);
        return view;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final TextView m66573d(@NotNull TextView textView, boolean z11) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setTypeface(Typeface.defaultFromStyle(z11 ? 1 : 0));
        return textView;
    }

    /* JADX INFO: renamed from: f */
    public static final void m66575f(@NotNull View view, @NotNull final Function1<? super View, Unit> action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        view.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.utils.extensions.core.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewExtKt.m66576g(action, view2);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static final void m66576g(Function1 action, View it) {
        Intrinsics.checkNotNullParameter(action, "$action");
        if (!f54321a) {
            f54321a = true;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            action.invoke(it);
        }
        Handler handler = f54323c;
        handler.removeCallbacks(f54322b);
        handler.postDelayed(f54322b, 350L);
    }

    /* JADX INFO: renamed from: h */
    public static final void m66577h(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(8);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final View m66578i(@NotNull View view, int i11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        layoutParams.height = i11;
        view.setLayoutParams(layoutParams);
        return view;
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m66579j(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getVisibility() == 8;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m66580k(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getVisibility() == 4;
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m66581l(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: m */
    public static final void m66582m(@NotNull View view, @NotNull final Function1<? super View, Boolean> action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.kubi.utils.extensions.core.l
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return ViewExtKt.m66583n(action, view2);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m66583n(Function1 action, View it) {
        Intrinsics.checkNotNullParameter(action, "$action");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        return ((Boolean) action.invoke(it)).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public static final View m66584o(@NotNull View view, int i11, int i12, int i13, int i14) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (i11 != Integer.MAX_VALUE) {
            marginLayoutParams.setMarginStart(i11);
        }
        if (i12 != Integer.MAX_VALUE) {
            marginLayoutParams.topMargin = i12;
        }
        if (i13 != Integer.MAX_VALUE) {
            marginLayoutParams.setMarginEnd(i13);
        }
        if (i14 != Integer.MAX_VALUE) {
            marginLayoutParams.bottomMargin = i14;
        }
        view.setLayoutParams(marginLayoutParams);
        return view;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ View m66585p(View view, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        if ((i15 & 2) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        if ((i15 & 4) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        if ((i15 & 8) != 0) {
            i14 = Integer.MAX_VALUE;
        }
        return m66584o(view, i11, i12, i13, i14);
    }

    /* JADX INFO: renamed from: q */
    public static final void m66586q(@NotNull View view, @NotNull Function1<? super View, Unit> action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        action.invoke(view);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                Intrinsics.checkExpressionValueIsNotNull(childAt, "getChildAt(index)");
                m66586q(childAt, action);
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public static final Bitmap m66587r(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getMeasuredWidth() == 0 || view.getMeasuredHeight() == 0) {
            throw new RuntimeException("调用该方法时，请确保View已经测量完毕，如果宽高为0，则抛出异常以提醒！");
        }
        if (!(view instanceof RecyclerView)) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_4444);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(measuredWid… Bitmap.Config.ARGB_4444)");
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            if (view.getBackground() != null) {
                view.getBackground().setBounds(0, 0, view.getWidth(), view.getMeasuredHeight());
                view.getBackground().draw(canvas);
            } else {
                canvas.drawColor(-1);
            }
            view.draw(canvas);
            return bitmapCreateBitmap;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        recyclerView.scrollToPosition(0);
        view.measure(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(recyclerView.getWidth(), recyclerView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap2, "createBitmap(width, meas… Bitmap.Config.ARGB_8888)");
        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
        if (recyclerView.getBackground() != null) {
            recyclerView.getBackground().setBounds(0, 0, recyclerView.getWidth(), recyclerView.getMeasuredHeight());
            recyclerView.getBackground().draw(canvas2);
        } else {
            canvas2.drawColor(-1);
        }
        view.draw(canvas2);
        view.measure(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), Integer.MIN_VALUE));
        return bitmapCreateBitmap2;
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public static final Bitmap m66588s(@NotNull View view, int i11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, heig… Bitmap.Config.ARGB_8888)");
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Drawable background = view.getBackground();
            if (background != null) {
                background.draw(canvas);
            } else {
                canvas.drawColor(i11);
            }
            view.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ Bitmap m66589t(View view, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = -1;
        }
        return m66588s(view, i11);
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public static final Bitmap m66590u(@NotNull View view, int i11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, heig… Bitmap.Config.ARGB_8888)");
            final Canvas canvas = new Canvas(bitmapCreateBitmap);
            Drawable background = view.getBackground();
            if (background != null) {
                background.draw(canvas);
            } else {
                canvas.drawColor(i11);
            }
            view.draw(canvas);
            m66586q(view, new Function1<View, Unit>() { // from class: com.kubi.utils.extensions.core.ViewExtKt$viewToBitmapDisplayWithSurface$$inlined$findChildWithType$1
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                    invoke2(view2);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull View scanViewTree) {
                    Intrinsics.checkNotNullParameter(scanViewTree, "$this$scanViewTree");
                    if (scanViewTree instanceof InterfaceC46098a) {
                        ((InterfaceC46098a) scanViewTree).mo24146c(canvas);
                    }
                }
            });
            return bitmapCreateBitmap;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ Bitmap m66591v(View view, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = -1;
        }
        return m66590u(view, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public static final Bitmap m66592w(@NotNull View view, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(this.width,… Bitmap.Config.ARGB_8888)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(i13);
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ Bitmap m66593x(View view, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i13 = -1;
        }
        return m66592w(view, i11, i12, i13);
    }

    /* JADX INFO: renamed from: y */
    public static final void m66594y(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(0);
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public static final View m66595z(@NotNull View view, int i11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        layoutParams.width = i11;
        view.setLayoutParams(layoutParams);
        return view;
    }
}
