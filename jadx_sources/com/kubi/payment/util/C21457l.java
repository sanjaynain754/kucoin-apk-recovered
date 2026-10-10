package com.kubi.payment.util;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.exifinterface.media.ExifInterface;
import com.kubi.sdk.res.R$mipmap;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p778xy.C46338a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.payment.util.l */
/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\t\u001aT\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\n*\u00020\u0007*\u0002H\n2\u0006\u0010\u0002\u001a\u00020\u00042\u0018\b\u0002\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u00072\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\r¢\u0006\u0002\u0010\u000e\u001a\u001c\u0010\u000f\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u001a\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u001a\n\u0010\u0017\u001a\u00020\u0018*\u00020\u0004\u001a:\u0010\u0019\u001a\u00020\u0001\"\b\b\u0000\u0010\n*\u00020\u0007*\u0002H\n2\u0019\b\u0004\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\rH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001b\u001a\u001e\u0010\u001c\u001a\u00020\u0001*\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00182\b\b\u0002\u0010\u001f\u001a\u00020\u0018\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 "}, m90084d2 = {"showByCondition", "", "condition", "Lkotlin/Function0;", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "", "Landroid/view/View;", "block", "(Lkotlin/jvm/functions/Function0;[Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", ExifInterface.GPS_DIRECTION_TRUE, "oppositeViews", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroid/view/View;Z[Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "loadIcon", "Landroid/widget/ImageView;", "context", "Landroid/content/Context;", "url", "", "ifEmpty", "elseString", "toVisibleOrGone", "", "doOnGlobalLayout", TUIConstants.TIMPush.NOTIFICATION.ACTION, "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "setDivider", "Landroidx/appcompat/widget/LinearLayoutCompat;", "dividerWidth", "dividerHeight", "PaymentLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncom/kubi/payment/util/UtilsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,143:1\n13472#2,2:144\n13472#2,2:146\n13472#2,2:148\n13472#2,2:150\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ncom/kubi/payment/util/UtilsKt\n*L\n84#1:144,2\n89#1:146,2\n97#1:148,2\n101#1:150,2\n*E\n"})
public final class C21457l {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final String m49853a(@Nullable String str, @Nullable String str2) {
        return (str == null || str.length() == 0) ? str2 : str;
    }

    /* JADX INFO: renamed from: b */
    public static final void m49854b(@NotNull ImageView imageView, @NotNull Context context, @Nullable String str) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!C24277v.m58537b(context) || str == null || str.length() == 0) {
            return;
        }
        C46338a.m102151a(context).mo6634v(str).mo92188b0(R$mipmap.kucoin_icon_default_icon).m6594E0(imageView);
    }

    /* JADX INFO: renamed from: c */
    public static final void m49855c(@NotNull LinearLayoutCompat linearLayoutCompat, int i11, int i12) {
        Intrinsics.checkNotNullParameter(linearLayoutCompat, "<this>");
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setIntrinsicWidth(i11);
        shapeDrawable.setIntrinsicHeight(i12);
        shapeDrawable.getPaint().setColor(0);
        linearLayoutCompat.setDividerDrawable(shapeDrawable);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m49856d(LinearLayoutCompat linearLayoutCompat, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        m49855c(linearLayoutCompat, i11, i12);
    }

    /* JADX INFO: renamed from: e */
    public static final <T extends View> void m49857e(@NotNull T t11, boolean z11, @NotNull View[] oppositeViews, @NotNull Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(t11, "<this>");
        Intrinsics.checkNotNullParameter(oppositeViews, "oppositeViews");
        Intrinsics.checkNotNullParameter(block, "block");
        int i11 = 0;
        if (!z11) {
            int length = oppositeViews.length;
            while (i11 < length) {
                View view = oppositeViews[i11];
                if (view != null) {
                    ViewExtKt.m66594y(view);
                }
                i11++;
            }
            ViewExtKt.m66577h(t11);
            return;
        }
        int length2 = oppositeViews.length;
        while (i11 < length2) {
            View view2 = oppositeViews[i11];
            if (view2 != null) {
                ViewExtKt.m66577h(view2);
            }
            i11++;
        }
        ViewExtKt.m66594y(t11);
        block.invoke(t11);
    }

    /* JADX INFO: renamed from: f */
    public static final void m49858f(@NotNull Function0<Boolean> condition, @NotNull View[] view, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(block, "block");
        int i11 = 0;
        if (!condition.invoke().booleanValue()) {
            int length = view.length;
            while (i11 < length) {
                View view2 = view[i11];
                if (view2 != null) {
                    ViewExtKt.m66577h(view2);
                }
                i11++;
            }
            return;
        }
        int length2 = view.length;
        while (i11 < length2) {
            View view3 = view[i11];
            if (view3 != null) {
                ViewExtKt.m66594y(view3);
            }
            i11++;
        }
        block.invoke();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m49859g(View view, boolean z11, View[] viewArr, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            viewArr = new View[0];
        }
        m49857e(view, z11, viewArr, function1);
    }

    /* JADX INFO: renamed from: h */
    public static final int m49860h(boolean z11) {
        return z11 ? 0 : 8;
    }
}
