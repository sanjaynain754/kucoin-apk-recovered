package com.kubi.kumex.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$styleable;
import com.tencent.bugly.proguard.C33627eb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: FuturesSuffixTextView.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\n\u0010\u001f\u001a\u0004\u0018\u00010\u0016H\u0002J\u0018\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0014H\u0002J\b\u0010$\u001a\u00020%H\u0002J\u001c\u0010&\u001a\u00020\u001e2\b\u0010'\u001a\u0004\u0018\u00010\u00162\b\u0010(\u001a\u0004\u0018\u00010\u0018H\u0016J\u001c\u0010)\u001a\u00020\u001e2\b\u0010'\u001a\u0004\u0018\u00010\u00162\b\u0010(\u001a\u0004\u0018\u00010\u0018H\u0002J\u000e\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u0014J\u000e\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u0012J\u0010\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\nH\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000fX\u0082D¢\u0006\u0002\n\u0000¨\u00060"}, m90084d2 = {"Lcom/kubi/kumex/view/FuturesSuffixTextView;", "Lcom/kubi/resources/widget/BaseTextView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "def", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mLineBreaker", "", "mSuffixText", "", "mSuffixTextColor", "mOnMoreClickListener", "Landroid/view/View$OnClickListener;", "mIsShowMore", "", "mOriginText", "", "mBufferType", "Landroid/widget/TextView$BufferType;", "mLayout", "Landroid/text/Layout;", "mLayoutWidth", "space", "init", "", "getSpannableText", "appendMore", "ssb", "Landroid/text/SpannableStringBuilder;", "isAppend", "createSpan", "Landroid/text/style/ClickableSpan;", "setText", "text", "type", "setTextInternal", "showMore", "isShow", "onMoreClick", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setMaxLines", "maxLines", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FuturesSuffixTextView extends BaseTextView {

    /* JADX INFO: renamed from: b */
    public final char f30837b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public String f30838c;

    /* JADX INFO: renamed from: d */
    public int f30839d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public View.OnClickListener f30840e;

    /* JADX INFO: renamed from: f */
    public boolean f30841f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public CharSequence f30842g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public TextView.BufferType f30843h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public Layout f30844i;

    /* JADX INFO: renamed from: j */
    public int f30845j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final String f30846k;

    /* JADX INFO: renamed from: com.kubi.kumex.view.FuturesSuffixTextView$a */
    /* JADX INFO: compiled from: FuturesSuffixTextView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/kumex/view/FuturesSuffixTextView$createSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17075a extends ClickableSpan {
        public C17075a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            View.OnClickListener onClickListener = FuturesSuffixTextView.this.f30840e;
            if (onClickListener != null) {
                onClickListener.onClick(widget);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(FuturesSuffixTextView.this.f30839d);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.view.FuturesSuffixTextView$b */
    /* JADX INFO: compiled from: FuturesSuffixTextView.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/kumex/view/FuturesSuffixTextView$init$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC17076b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC17076b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            FuturesSuffixTextView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            FuturesSuffixTextView futuresSuffixTextView = FuturesSuffixTextView.this;
            futuresSuffixTextView.m36652j(futuresSuffixTextView.getSpannableText(), FuturesSuffixTextView.this.f30843h);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesSuffixTextView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30837b = '\n';
        this.f30838c = "";
        this.f30839d = -16711936;
        this.f30841f = true;
        this.f30843h = TextView.BufferType.NORMAL;
        this.f30846k = C33627eb.f69716f;
    }

    /* JADX INFO: renamed from: g */
    public final void m36649g(SpannableStringBuilder spannableStringBuilder, boolean z11) {
        if (z11) {
            spannableStringBuilder.append((CharSequence) this.f30846k);
            spannableStringBuilder.append((CharSequence) this.f30838c);
            spannableStringBuilder.setSpan(m36650h(), spannableStringBuilder.length() - this.f30838c.length(), spannableStringBuilder.length(), 18);
        }
    }

    /* JADX INFO: renamed from: h */
    public final ClickableSpan m36650h() {
        return new C17075a();
    }

    /* JADX INFO: renamed from: i */
    public final void m36651i(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.kucoin_SuffixTextView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.kucoin_SuffixTextView_kucoin_suffix);
        if (string == null) {
            string = "";
        }
        this.f30838c = string;
        this.f30839d = typedArrayObtainStyledAttributes.getColor(R$styleable.kucoin_SuffixTextView_kucoin_suffix_color, context.getResources().getColor(R$color.primary));
        setMovementMethod(LinkMovementMethod.getInstance());
        typedArrayObtainStyledAttributes.recycle();
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC17076b());
    }

    /* JADX INFO: renamed from: k */
    public final void m36653k(boolean z11) {
        this.f30841f = z11;
        m36652j(getSpannableText(), this.f30843h);
    }

    public final void onMoreClick(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f30840e = listener;
    }

    @Override // com.kubi.resources.widget.BaseTextView, android.widget.TextView
    public void setText(@Nullable CharSequence text, @Nullable TextView.BufferType type) {
        this.f30843h = type;
        if (text == null || text.length() == 0) {
            this.f30842g = "";
        } else {
            while (StringsKt.endsWith$default(String.valueOf(text), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, false, 2, (Object) null)) {
                Intrinsics.checkNotNull(text);
                text = text.subSequence(0, text.length() - 1);
            }
            this.f30842g = text;
        }
        m36652j(getSpannableText(), this.f30843h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CharSequence getSpannableText() {
        CharSequence charSequence;
        int width;
        int lineEnd;
        int lineStart;
        float fMeasureText;
        CharSequence charSequenceSubSequence;
        if (getMaxLines() != -1 && (charSequence = this.f30842g) != null && charSequence.length() != 0) {
            Layout layout = getLayout();
            this.f30844i = layout;
            if (layout != null) {
                width = layout.getWidth();
            } else {
                width = 0;
            }
            this.f30845j = width;
            if (width <= 0) {
                if (getWidth() == 0) {
                    return this.f30842g;
                }
                this.f30845j = (getWidth() - getPaddingStart()) - getPaddingEnd();
            }
            CharSequence charSequence2 = this.f30842g;
            Intrinsics.checkNotNull(charSequence2);
            DynamicLayout dynamicLayout = new DynamicLayout(charSequence2, getPaint(), this.f30845j, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f30844i = dynamicLayout;
            if (dynamicLayout.getLineCount() >= getMaxLines()) {
                Layout layout2 = this.f30844i;
                if (layout2 != null) {
                    lineEnd = layout2.getLineEnd(getMaxLines() - 1);
                } else {
                    lineEnd = 0;
                }
                Layout layout3 = this.f30844i;
                if (layout3 != null) {
                    lineStart = layout3.getLineStart(getMaxLines() - 1);
                } else {
                    lineStart = 0;
                }
                CharSequence charSequence3 = this.f30842g;
                Intrinsics.checkNotNull(charSequence3);
                CharSequence charSequenceSubSequence2 = charSequence3.subSequence(0, lineStart);
                if (this.f30841f) {
                    fMeasureText = getPaint().measureText(this.f30846k + this.f30838c) + 0.5f;
                } else {
                    fMeasureText = 0.0f;
                }
                if (this.f30841f) {
                    char c11 = this.f30837b;
                    CharSequence charSequence4 = this.f30842g;
                    Intrinsics.checkNotNull(charSequence4);
                    int i11 = lineEnd - 1;
                    if (c11 == charSequence4.charAt(i11)) {
                        CharSequence charSequence5 = this.f30842g;
                        Intrinsics.checkNotNull(charSequence5);
                        charSequenceSubSequence = charSequence5.subSequence(lineStart, i11);
                    } else {
                        CharSequence charSequence6 = this.f30842g;
                        Intrinsics.checkNotNull(charSequence6);
                        charSequenceSubSequence = charSequence6.subSequence(lineStart, lineEnd);
                    }
                } else {
                    CharSequence charSequence7 = this.f30842g;
                    Intrinsics.checkNotNull(charSequence7);
                    CharSequence charSequence8 = this.f30842g;
                    Intrinsics.checkNotNull(charSequence8);
                    charSequenceSubSequence = charSequence7.subSequence(lineStart, charSequence8.length());
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceSubSequence2);
                CharSequence charSequenceEllipsize = TextUtils.ellipsize(charSequenceSubSequence, getPaint(), ((getMeasuredWidth() - getPaddingStart()) - getPaddingEnd()) - fMeasureText, TextUtils.TruncateAt.END);
                if (this.f30841f) {
                    if (!Intrinsics.areEqual(charSequenceEllipsize, charSequenceSubSequence)) {
                        spannableStringBuilder.append(charSequenceEllipsize);
                        m36649g(spannableStringBuilder, true);
                        return spannableStringBuilder;
                    }
                    spannableStringBuilder.append(charSequenceSubSequence);
                    m36649g(spannableStringBuilder, true);
                    return spannableStringBuilder;
                }
                CharSequence charSequence9 = this.f30842g;
                Intrinsics.checkNotNull(charSequence9);
                if (lineEnd != charSequence9.length()) {
                    spannableStringBuilder.append(charSequenceEllipsize);
                    m36649g(spannableStringBuilder, true);
                    return spannableStringBuilder;
                }
                spannableStringBuilder.append(charSequenceSubSequence);
                m36649g(spannableStringBuilder, false);
                return spannableStringBuilder;
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.f30842g);
            m36649g(spannableStringBuilder2, this.f30841f);
            return spannableStringBuilder2;
        }
        return this.f30842g;
    }

    /* JADX INFO: renamed from: j */
    public final void m36652j(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int maxLines) {
        super.setMaxLines(maxLines);
        m36652j(getSpannableText(), this.f30843h);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesSuffixTextView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        this.f30837b = '\n';
        this.f30838c = "";
        this.f30839d = -16711936;
        this.f30841f = true;
        this.f30843h = TextView.BufferType.NORMAL;
        this.f30846k = C33627eb.f69716f;
        m36651i(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesSuffixTextView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        this.f30837b = '\n';
        this.f30838c = "";
        this.f30839d = -16711936;
        this.f30841f = true;
        this.f30843h = TextView.BufferType.NORMAL;
        this.f30846k = C33627eb.f69716f;
        m36651i(context, attributeSet);
    }
}
