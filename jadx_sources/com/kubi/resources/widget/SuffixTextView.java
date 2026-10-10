package com.kubi.resources.widget;

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
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$styleable;
import com.tencent.bugly.proguard.C33627eb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: SuffixTextView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\n\u0010\u001f\u001a\u0004\u0018\u00010\u0016H\u0002J\u0018\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0014H\u0002J\b\u0010$\u001a\u00020%H\u0002J\u001c\u0010&\u001a\u00020\u001e2\b\u0010'\u001a\u0004\u0018\u00010\u00162\b\u0010(\u001a\u0004\u0018\u00010\u0018H\u0016J\u001c\u0010)\u001a\u00020\u001e2\b\u0010'\u001a\u0004\u0018\u00010\u00162\b\u0010(\u001a\u0004\u0018\u00010\u0018H\u0002J\u000e\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u0014J\u000e\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u0012J\u0010\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\nH\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000fX\u0082D¢\u0006\u0002\n\u0000¨\u00060"}, m90084d2 = {"Lcom/kubi/resources/widget/SuffixTextView;", "Lcom/kubi/resources/widget/BaseTextView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "def", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mLineBreaker", "", "mSuffixText", "", "mSuffixTextColor", "mOnMoreClickListener", "Landroid/view/View$OnClickListener;", "mIsShowMore", "", "mOriginText", "", "mBufferType", "Landroid/widget/TextView$BufferType;", "mLayout", "Landroid/text/Layout;", "mLayoutWidth", "space", "init", "", "getSpannableText", "appendMore", "ssb", "Landroid/text/SpannableStringBuilder;", "isAppend", "createSpan", "Landroid/text/style/ClickableSpan;", "setText", "text", "type", "setTextInternal", "showMore", "isShow", "onMoreClick", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setMaxLines", "maxLines", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SuffixTextView extends BaseTextView {

    /* JADX INFO: renamed from: b */
    public final char f44071b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public String f44072c;

    /* JADX INFO: renamed from: d */
    public int f44073d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public View.OnClickListener f44074e;

    /* JADX INFO: renamed from: f */
    public boolean f44075f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public CharSequence f44076g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public TextView.BufferType f44077h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public Layout f44078i;

    /* JADX INFO: renamed from: j */
    public int f44079j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final String f44080k;

    /* JADX INFO: renamed from: com.kubi.resources.widget.SuffixTextView$a */
    /* JADX INFO: compiled from: SuffixTextView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/resources/widget/SuffixTextView$createSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22951a extends ClickableSpan {
        public C22951a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            View.OnClickListener onClickListener = SuffixTextView.this.f44074e;
            if (onClickListener != null) {
                onClickListener.onClick(widget);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(SuffixTextView.this.f44073d);
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.SuffixTextView$b */
    /* JADX INFO: compiled from: SuffixTextView.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/resources/widget/SuffixTextView$init$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC22952b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC22952b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            SuffixTextView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            SuffixTextView suffixTextView = SuffixTextView.this;
            suffixTextView.m54793j(suffixTextView.getSpannableText(), SuffixTextView.this.f44077h);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuffixTextView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44071b = '\n';
        this.f44072c = "";
        this.f44073d = -16711936;
        this.f44075f = true;
        this.f44077h = TextView.BufferType.NORMAL;
        this.f44080k = C33627eb.f69716f;
    }

    /* JADX INFO: renamed from: g */
    private final void m54790g(SpannableStringBuilder spannableStringBuilder, boolean z11) {
        if (z11) {
            spannableStringBuilder.append((CharSequence) this.f44080k);
            spannableStringBuilder.append((CharSequence) this.f44072c);
            spannableStringBuilder.setSpan(m54791h(), spannableStringBuilder.length() - this.f44072c.length(), spannableStringBuilder.length(), 18);
        }
    }

    /* JADX INFO: renamed from: h */
    private final ClickableSpan m54791h() {
        return new C22951a();
    }

    /* JADX INFO: renamed from: i */
    private final void m54792i(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.kucoin_SuffixTextView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.kucoin_SuffixTextView_kucoin_suffix);
        if (string == null) {
            string = "";
        }
        this.f44072c = string;
        this.f44073d = typedArrayObtainStyledAttributes.getColor(R$styleable.kucoin_SuffixTextView_kucoin_suffix_color, context.getResources().getColor(R$color.primary));
        setMovementMethod(LinkMovementMethod.getInstance());
        typedArrayObtainStyledAttributes.recycle();
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC22952b());
    }

    /* JADX INFO: renamed from: k */
    public final void m54794k(boolean z11) {
        this.f44075f = z11;
        m54793j(getSpannableText(), this.f44077h);
    }

    public final void onMoreClick(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f44074e = listener;
    }

    @Override // com.kubi.resources.widget.BaseTextView, android.widget.TextView
    public void setText(@Nullable CharSequence text, @Nullable TextView.BufferType type) {
        this.f44077h = type;
        if (text == null || text.length() == 0) {
            this.f44076g = "";
        } else {
            while (StringsKt.endsWith$default(String.valueOf(text), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, false, 2, (Object) null)) {
                Intrinsics.checkNotNull(text);
                text = text.subSequence(0, text.length() - 1);
            }
            this.f44076g = text;
        }
        m54793j(getSpannableText(), this.f44077h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CharSequence getSpannableText() {
        CharSequence charSequence;
        int width;
        int lineEnd;
        int lineStart;
        CharSequence charSequenceSubSequence;
        if (getMaxLines() != -1 && (charSequence = this.f44076g) != null && charSequence.length() != 0) {
            Layout layout = getLayout();
            this.f44078i = layout;
            if (layout != null) {
                width = layout.getWidth();
            } else {
                width = 0;
            }
            this.f44079j = width;
            if (width <= 0) {
                if (getWidth() == 0) {
                    return this.f44076g;
                }
                this.f44079j = (getWidth() - getPaddingStart()) - getPaddingEnd();
            }
            CharSequence charSequence2 = this.f44076g;
            Intrinsics.checkNotNull(charSequence2);
            DynamicLayout dynamicLayout = new DynamicLayout(charSequence2, getPaint(), this.f44079j, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f44078i = dynamicLayout;
            if (dynamicLayout.getLineCount() >= getMaxLines()) {
                Layout layout2 = this.f44078i;
                if (layout2 != null) {
                    lineEnd = layout2.getLineEnd(getMaxLines() - 1);
                } else {
                    lineEnd = 0;
                }
                Layout layout3 = this.f44078i;
                if (layout3 != null) {
                    lineStart = layout3.getLineStart(getMaxLines() - 1);
                } else {
                    lineStart = 0;
                }
                CharSequence charSequence3 = this.f44076g;
                Intrinsics.checkNotNull(charSequence3);
                CharSequence charSequenceSubSequence2 = charSequence3.subSequence(0, lineStart);
                float fMeasureText = getPaint().measureText(this.f44080k + this.f44072c) + 0.5f;
                char c11 = this.f44071b;
                CharSequence charSequence4 = this.f44076g;
                Intrinsics.checkNotNull(charSequence4);
                int i11 = lineEnd - 1;
                if (c11 == charSequence4.charAt(i11)) {
                    CharSequence charSequence5 = this.f44076g;
                    Intrinsics.checkNotNull(charSequence5);
                    charSequenceSubSequence = charSequence5.subSequence(lineStart, i11);
                } else {
                    CharSequence charSequence6 = this.f44076g;
                    Intrinsics.checkNotNull(charSequence6);
                    charSequenceSubSequence = charSequence6.subSequence(lineStart, lineEnd);
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceSubSequence2);
                CharSequence charSequenceEllipsize = TextUtils.ellipsize(charSequenceSubSequence, getPaint(), ((getMeasuredWidth() - getPaddingStart()) - getPaddingEnd()) - fMeasureText, TextUtils.TruncateAt.END);
                if (this.f44075f) {
                    if (!Intrinsics.areEqual(charSequenceEllipsize, charSequenceSubSequence)) {
                        spannableStringBuilder.append(charSequenceEllipsize);
                        m54790g(spannableStringBuilder, true);
                        return spannableStringBuilder;
                    }
                    spannableStringBuilder.append(charSequenceSubSequence);
                    m54790g(spannableStringBuilder, true);
                    return spannableStringBuilder;
                }
                CharSequence charSequence7 = this.f44076g;
                Intrinsics.checkNotNull(charSequence7);
                if (lineEnd != charSequence7.length()) {
                    spannableStringBuilder.append(charSequenceEllipsize);
                    m54790g(spannableStringBuilder, true);
                    return spannableStringBuilder;
                }
                spannableStringBuilder.append(charSequenceSubSequence);
                m54790g(spannableStringBuilder, false);
                return spannableStringBuilder;
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.f44076g);
            m54790g(spannableStringBuilder2, this.f44075f);
            return spannableStringBuilder2;
        }
        return this.f44076g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final void m54793j(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int maxLines) {
        super.setMaxLines(maxLines);
        if (this.f44075f) {
            m54793j(getSpannableText(), this.f44077h);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuffixTextView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        this.f44071b = '\n';
        this.f44072c = "";
        this.f44073d = -16711936;
        this.f44075f = true;
        this.f44077h = TextView.BufferType.NORMAL;
        this.f44080k = C33627eb.f69716f;
        m54792i(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuffixTextView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        this.f44071b = '\n';
        this.f44072c = "";
        this.f44073d = -16711936;
        this.f44075f = true;
        this.f44077h = TextView.BufferType.NORMAL;
        this.f44080k = C33627eb.f69716f;
        m54792i(context, attributeSet);
    }
}
