package com.kubi.utils.extensions;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.blankj.utilcode.util.C5275i0;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.sdk.utils.R$id;
import com.kubi.utils.C27014a1;
import com.kubi.utils.C27061m;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.disposables.CompositeDisposable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.utils.extensions.k */
/* JADX INFO: compiled from: ViewEx.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000e\u001a\u00020\r*\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0011\u001a\u00020\r*\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0014\u001a\u00020\r*\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u001a\u001a\u00020\r*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001c\u001a\u00020\r*\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010\u001f\u001a\u00020\r*\u00020\u00052\b\b\u0001\u0010\u001e\u001a\u00020\u0001¢\u0006\u0004\b\u001f\u0010 \u001a\u001b\u0010!\u001a\u00020\r*\u00020\u00052\b\b\u0001\u0010\u001e\u001a\u00020\u0001¢\u0006\u0004\b!\u0010 \u001a\u001b\u0010#\u001a\u00020\r*\u00020\u00052\b\b\u0001\u0010\"\u001a\u00020\u0001¢\u0006\u0004\b#\u0010 \u001a\u0011\u0010$\u001a\u00020\r*\u00020\u0005¢\u0006\u0004\b$\u0010%\u001a\u0011\u0010&\u001a\u00020\r*\u00020\u0005¢\u0006\u0004\b&\u0010%\u001a\u0011\u0010'\u001a\u00020\r*\u00020\u0005¢\u0006\u0004\b'\u0010%\u001a)\u0010,\u001a\u00020\r*\u00020\u00052\b\b\u0002\u0010)\u001a\u00020(2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0*¢\u0006\u0004\b,\u0010-\u001a/\u00100\u001a\u00020\r2\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050.\"\u00020\u00052\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0*¢\u0006\u0004\b0\u00101\u001a\u001f\u00102\u001a\u00020\r*\u00020\u00052\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0*¢\u0006\u0004\b2\u00103\u001a+\u00107\u001a\u00020\r*\u0002042\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\r05¢\u0006\u0004\b7\u00108\u001a\u001c\u0010;\u001a\u00020\u0005*\u0002092\u0006\u0010:\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b;\u0010<\u001a\u0019\u0010>\u001a\u00020\r*\u00020\t2\u0006\u0010=\u001a\u00020\u0001¢\u0006\u0004\b>\u0010\u0012\u001a\u0019\u0010A\u001a\u00020\r*\u00020\t2\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010B\u001a-\u0010J\u001a\u00020I*\u00020C2\u0006\u0010D\u001a\u00020\u00172\u0006\u0010F\u001a\u00020E2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010G¢\u0006\u0004\bJ\u0010K\"(\u0010Q\u001a\u000206*\u00020\u00052\u0006\u0010L\u001a\u0002068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010N\"\u0004\bO\u0010P¨\u0006R"}, m90084d2 = {"Landroid/content/Context;", "", "id", "n", "(Landroid/content/Context;I)I", "Landroid/view/View;", "Lio/reactivex/disposables/CompositeDisposable;", "k", "(Landroid/view/View;)Lio/reactivex/disposables/CompositeDisposable;", "Landroid/widget/TextView;", "drawableId", ViewProps.PADDING, "direction", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Landroid/widget/TextView;III)V", "colorId", "q", "(Landroid/widget/TextView;I)V", "Landroid/widget/ImageView;", "p", "(Landroid/widget/ImageView;I)V", "Landroid/widget/EditText;", "", "hintText", "size", "F", "(Landroid/widget/EditText;Ljava/lang/String;I)V", "v", "(Landroid/widget/EditText;)V", "marginInPx", "g", "(Landroid/view/View;I)V", "e", "paddingInPx", "f", "H", "(Landroid/view/View;)V", "o", "r", "", JPushConstants.Geofence.KEY_INTERVAL, "Lkotlin/Function0;", "function", "y", "(Landroid/view/View;JLkotlin/jvm/functions/Function0;)V", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "D", "([Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "B", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "Landroid/widget/CompoundButton;", "Lkotlin/Function2;", "", "w", "(Landroid/widget/CompoundButton;Lkotlin/jvm/functions/Function2;)V", "Landroid/view/ViewGroup;", "index", "m", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "textColor", CmcdData.Factory.STREAM_TYPE_LIVE, "", ViewProps.MAX_WIDTH, "j", "(Landroid/widget/TextView;F)V", "", "mSignText", "Landroid/text/style/ClickableSpan;", TtmlNode.TAG_SPAN, "Lcom/kubi/utils/m;", "dashSpan", "Landroid/text/SpannableStringBuilder;", "t", "(Ljava/lang/CharSequence;Ljava/lang/String;Landroid/text/style/ClickableSpan;Lcom/kubi/utils/m;)Landroid/text/SpannableStringBuilder;", "value", CmcdData.Factory.STREAMING_FORMAT_SS, "(Landroid/view/View;)Z", "G", "(Landroid/view/View;Z)V", "isShow", "Utils_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nViewEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewEx.kt\ncom/kubi/utils/extensions/ViewExKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,283:1\n13579#2,2:284\n13579#2,2:286\n*S KotlinDebug\n*F\n+ 1 ViewEx.kt\ncom/kubi/utils/extensions/ViewExKt\n*L\n119#1:284,2\n190#1:286,2\n*E\n"})
public final class C27046k {

    /* JADX INFO: renamed from: com.kubi.utils.extensions.k$a */
    /* JADX INFO: compiled from: ViewEx.kt */
    /* JADX INFO: loaded from: classes54.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m90084d2 = {"com/kubi/utils/extensions/k$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CompositeDisposable f54333b;

        public a(CompositeDisposable compositeDisposable) {
            this.f54333b = compositeDisposable;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View v11) {
            Intrinsics.checkNotNullParameter(v11, "v");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View v11) {
            Intrinsics.checkNotNullParameter(v11, "v");
            this.f54333b.clear();
        }
    }

    /* JADX INFO: renamed from: A */
    public static final void m66678A(long j11, Function0 function, View view) {
        Intrinsics.checkNotNullParameter(function, "$function");
        if (C27014a1.m66502b(view, Long.valueOf(j11))) {
            return;
        }
        function.invoke();
    }

    /* JADX INFO: renamed from: B */
    public static final void m66679B(@NotNull View view, @NotNull final Function0<Unit> function) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(function, "function");
        view.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.utils.extensions.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C27046k.m66680C(function, view2);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public static final void m66680C(Function0 function, View view) {
        Intrinsics.checkNotNullParameter(function, "$function");
        function.invoke();
    }

    /* JADX INFO: renamed from: E */
    public static final void m66682E(Function0 function, View view) {
        Intrinsics.checkNotNullParameter(function, "$function");
        if (C27014a1.m66501a(view)) {
            return;
        }
        function.invoke();
    }

    /* JADX INFO: renamed from: F */
    public static final void m66683F(@NotNull EditText editText, @NotNull String hintText, int i11) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Intrinsics.checkNotNullParameter(hintText, "hintText");
        SpannableString spannableString = new SpannableString(hintText);
        spannableString.setSpan(new AbsoluteSizeSpan(i11, true), 0, spannableString.length(), 33);
        editText.setHint(new SpannedString(spannableString));
    }

    /* JADX INFO: renamed from: G */
    public static final void m66684G(@NotNull View view, boolean z11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(z11 ? 0 : 8);
    }

    /* JADX INFO: renamed from: H */
    public static final void m66685H(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(0);
    }

    /* JADX INFO: renamed from: e */
    public static final void m66690e(@NotNull View view, @Px int i11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i11;
    }

    /* JADX INFO: renamed from: f */
    public static final void m66691f(@NotNull View view, @Px int i11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPadding(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), i11);
    }

    /* JADX INFO: renamed from: g */
    public static final void m66692g(@NotNull View view, @Px int i11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i11;
    }

    /* JADX INFO: renamed from: h */
    public static final void m66693h(@NotNull TextView textView, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (i11 == 0) {
            if (i13 != 5) {
                if (i13 == 48) {
                    textView.setCompoundDrawablesRelative(textView.getCompoundDrawablesRelative()[0], null, textView.getCompoundDrawablesRelative()[2], textView.getCompoundDrawablesRelative()[3]);
                    return;
                } else if (i13 == 80) {
                    textView.setCompoundDrawablesRelative(textView.getCompoundDrawablesRelative()[0], textView.getCompoundDrawablesRelative()[1], textView.getCompoundDrawablesRelative()[2], null);
                    return;
                } else if (i13 != 8388613) {
                    textView.setCompoundDrawablesRelative(null, textView.getCompoundDrawablesRelative()[1], textView.getCompoundDrawablesRelative()[2], textView.getCompoundDrawablesRelative()[3]);
                    return;
                }
            }
            textView.setCompoundDrawablesRelative(textView.getCompoundDrawablesRelative()[0], textView.getCompoundDrawablesRelative()[1], null, textView.getCompoundDrawablesRelative()[3]);
            return;
        }
        Drawable drawable = ContextCompat.getDrawable(textView.getContext(), i11);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        textView.setCompoundDrawablePadding(i12);
        if (i13 != 5) {
            if (i13 == 48) {
                textView.setCompoundDrawablesRelative(textView.getCompoundDrawablesRelative()[0], drawable, textView.getCompoundDrawablesRelative()[2], textView.getCompoundDrawablesRelative()[3]);
                return;
            } else if (i13 == 80) {
                textView.setCompoundDrawablesRelative(textView.getCompoundDrawablesRelative()[0], textView.getCompoundDrawablesRelative()[1], textView.getCompoundDrawablesRelative()[2], drawable);
                return;
            } else if (i13 != 8388613) {
                textView.setCompoundDrawablesRelative(drawable, textView.getCompoundDrawablesRelative()[1], textView.getCompoundDrawablesRelative()[2], textView.getCompoundDrawablesRelative()[3]);
                return;
            }
        }
        textView.setCompoundDrawablesRelative(textView.getCompoundDrawablesRelative()[0], textView.getCompoundDrawables()[1], drawable, textView.getCompoundDrawablesRelative()[3]);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m66694i(TextView textView, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i12 = C5275i0.m6236a(5.0f);
        }
        if ((i14 & 4) != 0) {
            i13 = GravityCompat.END;
        }
        m66693h(textView, i11, i12, i13);
    }

    /* JADX INFO: renamed from: j */
    public static final void m66695j(@NotNull TextView textView, float f11) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(textView.getTextSize());
        float fMeasureText = textPaint.measureText(textView.getText().toString());
        if (fMeasureText > f11) {
            textView.setTextSize(0, textView.getTextSize() * (f11 / fMeasureText));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final CompositeDisposable m66696k(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int i11 = R$id.kucoin_composite_disposable;
        Object tag = view.getTag(i11);
        Object obj = tag;
        if (tag == null) {
            CompositeDisposable compositeDisposable = new CompositeDisposable();
            view.setTag(i11, compositeDisposable);
            view.addOnAttachStateChangeListener(new a(compositeDisposable));
            obj = compositeDisposable;
        }
        return (CompositeDisposable) obj;
    }

    /* JADX INFO: renamed from: l */
    public static final void m66697l(@NotNull TextView textView, int i11) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setTextColor(i11);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final View m66698m(@NotNull ViewGroup viewGroup, int i11) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        View childAt = viewGroup.getChildAt(i11);
        Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(index)");
        return childAt;
    }

    /* JADX INFO: renamed from: n */
    public static final int m66699n(@NotNull Context context, @ColorRes int i11) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return ContextCompat.getColor(context, i11);
    }

    /* JADX INFO: renamed from: o */
    public static final void m66700o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(8);
    }

    /* JADX INFO: renamed from: p */
    public static final void m66701p(@NotNull ImageView imageView, int i11) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        imageView.setColorFilter(i11, PorterDuff.Mode.SRC_IN);
    }

    /* JADX INFO: renamed from: q */
    public static final void m66702q(@NotNull TextView textView, int i11) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        Intrinsics.checkNotNullExpressionValue(compoundDrawablesRelative, "compoundDrawablesRelative");
        for (Drawable drawable : compoundDrawablesRelative) {
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.SRC_IN);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public static final void m66703r(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(4);
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m66704s(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getVisibility() == 0;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public static final SpannableStringBuilder m66705t(@NotNull CharSequence charSequence, @NotNull String mSignText, @NotNull ClickableSpan span, @Nullable C27061m c27061m) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(mSignText, "mSignText");
        Intrinsics.checkNotNullParameter(span, "span");
        if (TextUtils.isEmpty(charSequence)) {
            return new SpannableStringBuilder("");
        }
        if (TextUtils.isEmpty(mSignText)) {
            return new SpannableStringBuilder(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        Matcher matcher = Pattern.compile(mSignText).matcher(charSequence);
        if (matcher.find()) {
            int iEnd = matcher.end();
            spannableStringBuilder.setSpan(span, iEnd - mSignText.length(), iEnd, 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ SpannableStringBuilder m66706u(CharSequence charSequence, String str, ClickableSpan clickableSpan, C27061m c27061m, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            c27061m = null;
        }
        return m66705t(charSequence, str, clickableSpan, c27061m);
    }

    /* JADX INFO: renamed from: v */
    public static final void m66707v(@NotNull EditText editText) {
        String string;
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Editable text = editText.getText();
        editText.setSelection((text == null || (string = text.toString()) == null) ? 0 : string.length());
    }

    /* JADX INFO: renamed from: w */
    public static final void m66708w(@NotNull CompoundButton compoundButton, @NotNull final Function2<? super CompoundButton, ? super Boolean, Unit> function) {
        Intrinsics.checkNotNullParameter(compoundButton, "<this>");
        Intrinsics.checkNotNullParameter(function, "function");
        compoundButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.utils.extensions.i
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton2, boolean z11) {
                C27046k.m66709x(function, compoundButton2, z11);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public static final void m66709x(Function2 function, CompoundButton buttonView, boolean z11) {
        Intrinsics.checkNotNullParameter(function, "$function");
        Intrinsics.checkNotNullExpressionValue(buttonView, "buttonView");
        function.invoke(buttonView, Boolean.valueOf(z11));
    }

    /* JADX INFO: renamed from: y */
    public static final void m66710y(@NotNull View view, final long j11, @NotNull final Function0<Unit> function) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(function, "function");
        view.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.utils.extensions.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C27046k.m66678A(j11, function, view2);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m66711z(View view, long j11, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 300;
        }
        m66710y(view, j11, function0);
    }

    /* JADX INFO: renamed from: D */
    public static final void m66681D(@NotNull View[] view, @NotNull final Function0<Unit> function) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(function, "function");
        for (View view2 : view) {
            view2.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.utils.extensions.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    C27046k.m66682E(function, view3);
                }
            });
        }
    }
}
