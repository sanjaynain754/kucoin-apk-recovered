package com.kubi.resources;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FontRes;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.kubi.resources.exception.ComponentException;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CustomColorTypefaceSpan;
import com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$font;
import com.kubi.sdk.res.R$id;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27059l;
import com.kubi.utils.C27096v0;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.resources.t */
/* JADX INFO: compiled from: ResViewEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0006\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a\u0014\u0010\u000b\u001a\u00020\u0001*\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\n\u001a\u0012\u0010\u000e\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u000f\u001a\u00020\n\u001a\u0012\u0010\u0010\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u000f\u001a\u00020\n\u001a\f\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u0013\u001a\n\u0010\u0014\u001a\u00020\u0001*\u00020\u0013\u001a\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n\u001a\u001e\u0010\u0019\u001a\u00020\u0001*\u00020\u001a2\b\b\u0003\u0010\u0017\u001a\u00020\n2\b\b\u0003\u0010\u001b\u001a\u00020\n\u001a\n\u0010\u001c\u001a\u00020\u0001*\u00020\u0012\u001a\n\u0010\u001c\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\u001c\u001a\u00020\u0001*\u00020\u0013\u001a\u0012\u0010\u001d\u001a\u00020\u0001*\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001f\u001a\u001a\u0010 \u001a\u00020\u0001*\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"\u001a\"\u0010#\u001a\u00020\u0001*\u00020\f2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'\u001a$\u0010)\u001a\u00020\u0001*\u00020\f2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0002¨\u0006*"}, m90084d2 = {"defaultAnimatorEnable", "", "Landroidx/recyclerview/widget/RecyclerView;", "isEnable", "", "isBeingDestroyed", "Landroidx/fragment/app/Fragment;", "setTextViewStyle", "Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;", "textSize", "", "setCompactTextCursorDrawable", "Landroid/widget/TextView;", "resId", "startDrawableTint", "colorInt", "endDrawableTint", "getActivity", "Landroid/app/Activity;", "Landroid/view/View;", "securityGuard", "createColorTypefaceSpan", "Landroid/text/style/CharacterStyle;", "fontResId", "color", "registerAllSpanTag", "Lcom/kubi/resources/widget/BaseTextView;", "colorResId", "applyImePadding", "safePost", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Ljava/lang/Runnable;", "safePostDelayed", "delayMillis", "", "setScalableText", "text", "", "maxTextSizeSp", "", "minTextSizeSp", "adjustTextSizeToFit", "LComponent_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nResViewEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResViewEx.kt\ncom/kubi/resources/ResViewExKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 ComponentIssue.kt\ncom/kubi/resources/exception/ComponentIssueKt\n*L\n1#1,293:1\n37#2:294\n36#2,3:295\n44#3,2:298\n44#3,2:300\n*S KotlinDebug\n*F\n+ 1 ResViewEx.kt\ncom/kubi/resources/ResViewExKt\n*L\n85#1:294\n85#1:295,3\n252#1:298,2\n263#1:300,2\n*E\n"})
public final class C22912t {

    /* JADX INFO: renamed from: com.kubi.resources.t$a */
    /* JADX INFO: compiled from: ResViewEx.kt */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/resources/ResViewExKt$applyImePadding$callback$1", "Landroidx/core/view/WindowInsetsAnimationCompat$Callback;", "onProgress", "Landroidx/core/view/WindowInsetsCompat;", "insets", "runningAnimations", "", "Landroidx/core/view/WindowInsetsAnimationCompat;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nResViewEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResViewEx.kt\ncom/kubi/resources/ResViewExKt$applyImePadding$callback$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,293:1\n157#2,8:294\n*S KotlinDebug\n*F\n+ 1 ResViewEx.kt\ncom/kubi/resources/ResViewExKt$applyImePadding$callback$1\n*L\n237#1:294,8\n*E\n"})
    public static final class a extends WindowInsetsAnimationCompat.Callback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f43696a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(1);
            this.f43696a = view;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
        public WindowInsetsCompat onProgress(WindowInsetsCompat insets, List<WindowInsetsAnimationCompat> runningAnimations) {
            Intrinsics.checkNotNullParameter(insets, "insets");
            Intrinsics.checkNotNullParameter(runningAnimations, "runningAnimations");
            int i11 = insets.getInsets(WindowInsetsCompat.Type.ime()).bottom;
            View view = this.f43696a;
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i11);
            return insets;
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.t$b */
    /* JADX INFO: compiled from: ResViewEx.kt */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, m90084d2 = {"com/kubi/resources/ResViewExKt$securityGuard$1", "Landroid/view/View$OnAttachStateChangeListener;", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "onViewAttachedToWindow", "", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nResViewEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResViewEx.kt\ncom/kubi/resources/ResViewExKt$securityGuard$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,293:1\n1#2:294\n*E\n"})
    public static final class b implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b */
        public final Activity f43697b;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v11) {
            Intrinsics.checkNotNullParameter(v11, "v");
            Activity activity = this.f43697b;
            if (activity != null) {
                activity.getWindow().setFlags(8192, 8192);
            }
            C44128b.m97259c("securityGuard", "disable screenshot");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v11) {
            Intrinsics.checkNotNullParameter(v11, "v");
            Activity activity = this.f43697b;
            if (activity != null) {
                activity.getWindow().clearFlags(8192);
            }
            C44128b.m97259c("securityGuard", "enable screenshot");
        }

        public b(View view) {
            this.f43697b = C22912t.m54412j(view);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m54405c(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        View viewFindViewById = activity.findViewById(R$id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        m54406d(viewFindViewById);
    }

    /* JADX INFO: renamed from: d */
    public static final void m54406d(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewCompat.setWindowInsetsAnimationCallback(view, new a(view));
    }

    /* JADX INFO: renamed from: e */
    public static final void m54407e(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            m54405c(activity);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final CharacterStyle m54408f(int i11, int i12) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Typeface font = ResourcesCompat.getFont(C27059l.f54343a.m66757a(), i11);
            objM103844constructorimpl = Result.m103844constructorimpl(font != null ? new CustomColorTypefaceSpan(i12, font) : new ForegroundColorSpan(i12));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return objM103844constructorimpl != null ? (CharacterStyle) objM103844constructorimpl : new ForegroundColorSpan(i12);
    }

    /* JADX INFO: renamed from: g */
    public static final void m54409g(@NotNull RecyclerView recyclerView, boolean z11) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.setAddDuration(z11 ? 120L : 0L);
        }
        RecyclerView.ItemAnimator itemAnimator2 = recyclerView.getItemAnimator();
        if (itemAnimator2 != null) {
            itemAnimator2.setChangeDuration(z11 ? 250L : 0L);
        }
        RecyclerView.ItemAnimator itemAnimator3 = recyclerView.getItemAnimator();
        if (itemAnimator3 != null) {
            itemAnimator3.setMoveDuration(z11 ? 250L : 0L);
        }
        RecyclerView.ItemAnimator itemAnimator4 = recyclerView.getItemAnimator();
        if (itemAnimator4 != null) {
            itemAnimator4.setRemoveDuration(z11 ? 120L : 0L);
        }
        RecyclerView.ItemAnimator itemAnimator5 = recyclerView.getItemAnimator();
        Intrinsics.checkNotNull(itemAnimator5, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((SimpleItemAnimator) itemAnimator5).setSupportsChangeAnimations(z11);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m54410h(RecyclerView recyclerView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        m54409g(recyclerView, z11);
    }

    /* JADX INFO: renamed from: i */
    public static final void m54411i(@NotNull TextView textView, int i11) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Drawable drawable = textView.getCompoundDrawablesRelative()[2];
        if (drawable != null) {
            drawable.setColorFilter(i11, PorterDuff.Mode.SRC_IN);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static final Activity m54412j(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m54413k(@NotNull Fragment fragment) {
        FragmentActivity activity;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Lifecycle.State state = fragment.getLifecycle().getState();
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state == state2 || fragment.isRemoving()) {
            return true;
        }
        FragmentActivity activity2 = fragment.getActivity();
        if ((activity2 == null || !activity2.isFinishing()) && ((activity = fragment.getActivity()) == null || !activity.isDestroyed())) {
            return fragment.getView() == null && fragment.getViewLifecycleOwner().getLifecycle().getState() == state2;
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static final void m54414l(@NotNull BaseTextView baseTextView, @FontRes int i11, @ColorRes int i12) {
        Intrinsics.checkNotNullParameter(baseTextView, "<this>");
        HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
        C27017c c27017c = C27017c.f54310a;
        HighlightTextHelper.f43497a.m54120f(baseTextView, (Pair[]) Arrays.copyOf(new Pair[]{new Pair(textTagEnum, m54408f(i11, c27017c.m66512a(i12))), new Pair(HighlightTextHelper.TextTagEnum.SPAN1, m54408f(i11, c27017c.m66512a(i12))), new Pair(HighlightTextHelper.TextTagEnum.SPAN2, m54408f(i11, c27017c.m66512a(i12))), new Pair(HighlightTextHelper.TextTagEnum.SPAN3, m54408f(i11, c27017c.m66512a(i12)))}, 4));
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m54415m(BaseTextView baseTextView, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = R$font.medium;
        }
        if ((i13 & 2) != 0) {
            i12 = R$color.brandGreen;
        }
        m54414l(baseTextView, i11, i12);
    }

    /* JADX INFO: renamed from: n */
    public static final void m54416n(@NotNull View view, @NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        try {
            view.post(action);
        } catch (Throwable th2) {
            C43846g.m96568c(new ComponentException(th2, "ResViewEx", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m54417o(@NotNull View view, @NotNull Runnable action, long j11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        try {
            view.postDelayed(action, j11);
        } catch (Throwable th2) {
            C43846g.m96568c(new ComponentException(th2, "ResViewEx", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: p */
    public static final void m54418p(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.addOnAttachStateChangeListener(new b(view));
    }

    /* JADX INFO: renamed from: q */
    public static final void m54419q(@NotNull TextView textView, @DrawableRes int i11) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setTextCursorDrawable(i11);
            return;
        }
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(textView, Integer.valueOf(i11));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: r */
    public static final void m54420r(@NotNull final TextView textView, @NotNull final String text, final float f11, final float f12) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        textView.setTextSize(2, f11);
        textView.setText(text);
        m54416n(textView, new Runnable() { // from class: com.kubi.resources.s
            @Override // java.lang.Runnable
            public final void run() {
                C22912t.m54421s(textView, text, f11, f12);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public static final void m54422t(@NotNull BGABanner bGABanner, int i11) {
        Intrinsics.checkNotNullParameter(bGABanner, "<this>");
        try {
            Field declaredField = bGABanner.getClass().getDeclaredField("mNumberIndicatorTv");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(bGABanner);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) obj;
            CharSequence text = textView.getText();
            if (!TextUtils.isEmpty(text)) {
                String[] strArr = (String[]) StringsKt.split$default((CharSequence) text.toString(), new String[]{"/"}, false, 0, 6, (Object) null).toArray(new String[0]);
                C27096v0 c27096v0 = new C27096v0();
                c27096v0.m66904d(strArr[0], i11);
                c27096v0.m66904d('/' + strArr[1], i11 - 2);
                c27096v0.setSpan(new ForegroundColorSpan(bGABanner.getResources().getColor(R$color.c_e1e8f5)), 0, strArr[0].length(), 18);
                c27096v0.setSpan(new ForegroundColorSpan(bGABanner.getResources().getColor(R$color.c_60_e1e8f5)), strArr[0].length(), text.length(), 18);
                textView.setText(c27096v0);
            }
            declaredField.setAccessible(false);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m54404b(TextView textView, String str, float f11, float f12) {
        float width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight();
        if (width > 0.0f) {
            textView.setTextSize(2, f11);
            while (f11 > f12 && textView.getPaint().measureText(str) > width) {
                f11 -= 1.0f;
                textView.setTextSize(2, f11);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static final void m54421s(TextView textView, String str, float f11, float f12) {
        String string;
        CharSequence text = textView.getText();
        if (text != null) {
            string = text.toString();
        } else {
            string = null;
        }
        if (Intrinsics.areEqual(string, str)) {
            m54404b(textView, str, f11, f12);
        }
    }
}
