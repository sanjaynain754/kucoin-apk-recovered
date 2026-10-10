package com.kubi.kumex.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FontRes;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5303w0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.futures.trade.welfare.C14439y;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.disposables.Disposable;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p236em.C37214b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ViewEx.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000~\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a \u0010\u0004\u001a\u00020\u0001*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001a \u0010\u0004\u001a\u00020\u0001*\u00020\b2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\n\u001a\u0012\u0010\u000b\u001a\u00020\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u001a\f\u0010\u000f\u001a\u00020\u0001*\u00020\u0010H\u0000\u001a\u001c\u0010\u0011\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0015\u001a\f\u0010\u0016\u001a\u00020\u0017*\u00020\u0017H\u0002\u001a\f\u0010\u0018\u001a\u00020\u0019*\u0004\u0018\u00010\u0017\u001a\f\u0010\u001a\u001a\u00020\u0001*\u0004\u0018\u00010\u001b\u001a\u0014\u0010\u001c\u001a\u00020\u001d*\u00020\u001d2\b\b\u0001\u0010\u001e\u001a\u00020\u0015\u001a'\u0010\u001f\u001a\u00020\u0001*\u00020\n2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\"\u001a'\u0010#\u001a\u00020\u0001*\u00020\n2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\"\u001a'\u0010$\u001a\u00020\u0001*\u00020\n2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\"\u001a'\u0010%\u001a\u00020\u0001*\u00020\n2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\"\u001a'\u0010&\u001a\u00020\u0001*\u00020\n2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\"\u001a\u000e\u0010(\u001a\u0004\u0018\u00010)*\u00020*H\u0000\u001a\u001a\u0010+\u001a\u00020,*\u00020\f2\u0006\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u0015\u001a\u001e\u0010/\u001a\u00020\u0001*\u0002002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u00010\u0007\u001a*\u00103\u001a\u00020\u0001*\u00020\n2\u0006\u00104\u001a\u00020\u00172\u0006\u00105\u001a\u00020\u00152\u0006\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u0015\u001a\u0014\u00108\u001a\u00020\u0001*\u00020\n2\b\u00109\u001a\u0004\u0018\u00010\u0017\u001a\n\u0010:\u001a\u000202*\u00020\f¨\u0006;"}, m90084d2 = {"openDefaultAnimator", "", "Landroidx/recyclerview/widget/RecyclerView;", "closeDefaultAnimator", "setOnCheckListener", "Landroidx/appcompat/widget/SwitchCompat;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Landroid/widget/CheckBox;", "middleFont", "Landroid/widget/TextView;", "roundRect", "Landroid/view/View;", "radius", "", "filterStartWithZeroNum", "Landroid/widget/EditText;", "setHintFont", "hint", "", "fontId", "", "reformat", "", "toSafeBigDecimal", "Ljava/math/BigDecimal;", "safeDispose", "Lio/reactivex/disposables/Disposable;", "drawableTint", "Landroid/graphics/drawable/Drawable;", "colorRes", "drawableStart", "drawableId", "tintColorRes", "(Landroid/widget/TextView;Ljava/lang/Integer;Ljava/lang/Integer;)V", "drawableTop", "drawableEnd", "drawableBottom", "startDrawable", "tintColor", "findKcPrimaryButton", "Lcom/kubi/resources/widget/button/KcPrimaryButton;", "Landroidx/fragment/app/Fragment;", "toBitmapUnDisplay", "Landroid/graphics/Bitmap;", "width", "height", "setOnScrollStateChangedListener", "Lcom/google/android/material/appbar/AppBarLayout;", "scrollCallback", "", "setCurrencyText", "value", "valueColor", FirebaseAnalytics.Param.CURRENCY, "currencyColor", "setTextIfChanged", "text", "isViewFullyVisible", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nViewEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewEx.kt\ncom/kubi/kumex/utils/ViewExKt\n+ 2 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n+ 3 ViewExt.kt\ncom/kubi/utils/extensions/core/ViewExtKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,405:1\n47#2,2:406\n435#3,6:408\n117#4,13:414\n*S KotlinDebug\n*F\n+ 1 ViewEx.kt\ncom/kubi/kumex/utils/ViewExKt\n*L\n134#1:406,2\n298#1:408,6\n340#1:414,13\n*E\n"})
public final class ViewExKt {

    /* JADX INFO: renamed from: com.kubi.kumex.utils.ViewExKt$a */
    /* JADX INFO: compiled from: ViewEx.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/kumex/utils/ViewExKt$roundRect$1", "Landroid/view/ViewOutlineProvider;", "getOutline", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "outline", "Landroid/graphics/Outline;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17032a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f30791a;

        public C17032a(float f11) {
            this.f30791a = f11;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(outline, "outline");
            int width = view.getWidth();
            int height = view.getHeight();
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            outline.setRoundRect(0, 0, width, height, C27025c.m66564b(context, this.f30791a));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m36476b(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        recyclerView.setItemAnimator(null);
    }

    /* JADX INFO: renamed from: c */
    public static final void m36477c(@NotNull TextView textView, @DrawableRes @Nullable Integer num, @ColorRes @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, num != null ? C27017c.f54310a.m66514c(num.intValue(), num2) : null, (Drawable) null);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m36478d(TextView textView, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        if ((i11 & 2) != 0) {
            num2 = null;
        }
        m36477c(textView, num, num2);
    }

    /* JADX INFO: renamed from: e */
    public static final void m36479e(@NotNull TextView textView, @DrawableRes @Nullable Integer num, @ColorRes @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(num != null ? C27017c.f54310a.m66514c(num.intValue(), num2) : null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m36480f(TextView textView, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        if ((i11 & 2) != 0) {
            num2 = null;
        }
        m36479e(textView, num, num2);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final Drawable m36481g(@NotNull Drawable drawable, @ColorRes int i11) {
        Intrinsics.checkNotNullParameter(drawable, "<this>");
        Drawable drawableWrap = DrawableCompat.wrap(drawable.mutate());
        Intrinsics.checkNotNullExpressionValue(drawableWrap, "wrap(...)");
        DrawableCompat.setTint(drawableWrap, C27017c.f54310a.m66512a(i11));
        return drawableWrap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: h */
    public static final KcPrimaryButton m36482h(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        View view = fragment.getView();
        if (view != null) {
            ViewExtKt.m66586q(view, new Function1<View, Unit>() { // from class: com.kubi.kumex.utils.ViewExKt$findKcPrimaryButton$$inlined$findChildWithType$1
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                    invoke2(view2);
                    return Unit.INSTANCE;
                }

                {
                    super(1);
                }

                /* JADX WARN: Type inference failed for: r2v1, types: [T, com.kubi.resources.widget.button.KcPrimaryButton] */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull View scanViewTree) {
                    Intrinsics.checkNotNullParameter(scanViewTree, "$this$scanViewTree");
                    if (scanViewTree instanceof KcPrimaryButton) {
                        objectRef.element = (KcPrimaryButton) scanViewTree;
                    }
                }
            });
        }
        return (KcPrimaryButton) objectRef.element;
    }

    /* JADX INFO: renamed from: i */
    public static final void m36483i(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.getPaint().setFakeBoldText(true);
    }

    /* JADX INFO: renamed from: j */
    public static final void m36484j(@NotNull View view, float f11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setOutlineProvider(new C17032a(f11));
        view.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: k */
    public static final void m36485k(@Nullable Disposable disposable) {
        if (disposable == null || disposable.getDisposed()) {
            return;
        }
        disposable.dispose();
    }

    /* JADX INFO: renamed from: l */
    public static final void m36486l(@NotNull EditText editText, @NotNull CharSequence hint, @FontRes int i11) {
        Typeface font;
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Intrinsics.checkNotNullParameter(hint, "hint");
        C27096v0 c27096v0 = new C27096v0();
        c27096v0.append(hint);
        if (Build.VERSION.SDK_INT >= 28 && (font = ResourcesCompat.getFont(C27017c.f54310a.m66513b(), i11)) != null) {
            c27096v0.setSpan(C14439y.m28811a(font), 0, c27096v0.length(), 17);
        }
        editText.setHint(c27096v0);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: m */
    public static final void m36487m(@NotNull final SwitchCompat switchCompat, @NotNull final Function1<? super SwitchCompat, Unit> callback) {
        Intrinsics.checkNotNullParameter(switchCompat, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        switchCompat.setOnTouchListener(new View.OnTouchListener() { // from class: com.kubi.kumex.utils.p0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ViewExKt.m36488n(callback, switchCompat, view, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public static final void m36489o(@NotNull TextView textView, @Nullable String str) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        CharSequence text = textView.getText();
        if (Intrinsics.areEqual(text != null ? text.toString() : null, str)) {
            return;
        }
        textView.setText(str);
    }

    /* JADX INFO: renamed from: p */
    public static final void m36490p(@NotNull TextView textView, @DrawableRes @Nullable Integer num, @ColorInt @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(num != null ? C27017c.f54310a.m66518h(num.intValue(), num2) : null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public static final Bitmap m36491q(@NotNull View view, int i11, int i12) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setLayoutDirection(C5303w0.m6511a() ? 1 : 0);
        view.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        view.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public static final BigDecimal m36492r(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return new BigDecimal("0");
        }
        try {
            return DowngradeExKt.m66535e(str, null, 1, null);
        } catch (Exception e11) {
            C37214b.m83255a(e11, "KUMEX-toSafeBigDecimal-Value:" + str);
            return new BigDecimal("0");
        }
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m36488n(Function1 function1, SwitchCompat switchCompat, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            function1.invoke(switchCompat);
        }
        return true;
    }
}
