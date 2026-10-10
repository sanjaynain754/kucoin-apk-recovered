package com.kubi.margin.view;

import android.content.Context;
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
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$string;
import com.kubi.utils.C27017c;
import com.tencent.bugly.proguard.C33627eb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: ExpandableTextView.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\n\u0010\u001f\u001a\u0004\u0018\u00010\u0012H\u0002J \u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u001cH\u0002J\b\u0010$\u001a\u00020%H\u0002J\u001c\u0010&\u001a\u00020\u001e2\b\u0010'\u001a\u0004\u0018\u00010\u00122\b\u0010(\u001a\u0004\u0018\u00010\u0014H\u0016J\u001c\u0010)\u001a\u00020\u001e2\b\u0010'\u001a\u0004\u0018\u00010\u00122\b\u0010(\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010*\u001a\u00020\u001eH\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, m90084d2 = {"Lcom/kubi/margin/view/ExpandableTextView;", "Lcom/kubi/resources/widget/BaseTextView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "def", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mLineBreaker", "", "mSuffixText", "", "mSuffixTextColor", "mOriginText", "", "mBufferType", "Landroid/widget/TextView$BufferType;", "mLayout", "Landroid/text/Layout;", "mLayoutWidth", "space", "maxLine", "collapseText", "isExpanded", "", "init", "", "getSpannableText", "appendText", "ssb", "Landroid/text/SpannableStringBuilder;", "isAppend", "createSpan", "Landroid/text/style/ClickableSpan;", "setText", "text", "type", "setTextInternal", "toggle", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ExpandableTextView extends BaseTextView {

    /* JADX INFO: renamed from: b */
    public final char f34237b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public String f34238c;

    /* JADX INFO: renamed from: d */
    public int f34239d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public CharSequence f34240e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public TextView.BufferType f34241f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public Layout f34242g;

    /* JADX INFO: renamed from: h */
    public int f34243h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final String f34244i;

    /* JADX INFO: renamed from: j */
    public int f34245j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public String f34246k;

    /* JADX INFO: renamed from: l */
    public boolean f34247l;

    /* JADX INFO: renamed from: com.kubi.margin.view.ExpandableTextView$a */
    /* JADX INFO: compiled from: ExpandableTextView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/margin/view/ExpandableTextView$createSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18591a extends ClickableSpan {
        public C18591a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            ExpandableTextView.this.m40677k();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(ExpandableTextView.this.f34239d);
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.view.ExpandableTextView$b */
    /* JADX INFO: compiled from: ExpandableTextView.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/margin/view/ExpandableTextView$init$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC18592b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC18592b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ExpandableTextView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ExpandableTextView expandableTextView = ExpandableTextView.this;
            expandableTextView.m40676j(expandableTextView.getSpannableText(), ExpandableTextView.this.f34241f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableTextView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34237b = '\n';
        C27017c c27017c = C27017c.f54310a;
        this.f34238c = c27017c.m66516f(R$string.coin_intro_more, new Object[0]);
        this.f34239d = c27017c.m66512a(R$color.primary);
        this.f34241f = TextView.BufferType.NORMAL;
        this.f34244i = C33627eb.f69716f;
        this.f34245j = 4;
        this.f34246k = c27017c.m66516f(R$string.home_rank_toggle, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CharSequence getSpannableText() {
        CharSequence charSequence;
        CharSequence charSequenceSubSequence;
        if (this.f34247l) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f34240e);
            m40678g(spannableStringBuilder, this.f34246k, true);
            return spannableStringBuilder;
        }
        if (this.f34245j == -1 || (charSequence = this.f34240e) == null || charSequence.length() == 0) {
            return this.f34240e;
        }
        Layout layout = getLayout();
        this.f34242g = layout;
        int width = layout != null ? layout.getWidth() : 0;
        this.f34243h = width;
        if (width <= 0) {
            if (getWidth() == 0) {
                return this.f34240e;
            }
            this.f34243h = (getWidth() - getPaddingStart()) - getPaddingEnd();
        }
        CharSequence charSequence2 = this.f34240e;
        Intrinsics.checkNotNull(charSequence2);
        DynamicLayout dynamicLayout = new DynamicLayout(charSequence2, getPaint(), this.f34243h, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f34242g = dynamicLayout;
        int lineCount = dynamicLayout.getLineCount();
        int i11 = this.f34245j;
        if (lineCount < i11) {
            return new SpannableStringBuilder(this.f34240e);
        }
        Layout layout2 = this.f34242g;
        int lineEnd = layout2 != null ? layout2.getLineEnd(i11 - 1) : 0;
        Layout layout3 = this.f34242g;
        int lineStart = layout3 != null ? layout3.getLineStart(this.f34245j - 1) : 0;
        CharSequence charSequence3 = this.f34240e;
        Intrinsics.checkNotNull(charSequence3);
        CharSequence charSequenceSubSequence2 = charSequence3.subSequence(0, lineStart);
        float fMeasureText = getPaint().measureText(this.f34244i + this.f34238c) + 0.5f;
        char c11 = this.f34237b;
        CharSequence charSequence4 = this.f34240e;
        Intrinsics.checkNotNull(charSequence4);
        int i12 = lineEnd - 1;
        if (c11 == charSequence4.charAt(i12)) {
            CharSequence charSequence5 = this.f34240e;
            Intrinsics.checkNotNull(charSequence5);
            charSequenceSubSequence = charSequence5.subSequence(lineStart, i12);
        } else {
            CharSequence charSequence6 = this.f34240e;
            Intrinsics.checkNotNull(charSequence6);
            charSequenceSubSequence = charSequence6.subSequence(lineStart, lineEnd);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequenceSubSequence2);
        CharSequence charSequenceEllipsize = TextUtils.ellipsize(charSequenceSubSequence, getPaint(), ((getMeasuredWidth() - getPaddingStart()) - getPaddingEnd()) - fMeasureText, TextUtils.TruncateAt.END);
        CharSequence charSequence7 = this.f34240e;
        Intrinsics.checkNotNull(charSequence7);
        if (lineEnd != charSequence7.length()) {
            spannableStringBuilder2.append(charSequenceEllipsize);
            m40678g(spannableStringBuilder2, this.f34238c, true);
            return spannableStringBuilder2;
        }
        spannableStringBuilder2.append(charSequenceSubSequence);
        m40678g(spannableStringBuilder2, this.f34238c, false);
        return spannableStringBuilder2;
    }

    /* JADX INFO: renamed from: h */
    private final ClickableSpan m40674h() {
        return new C18591a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final void m40677k() {
        this.f34247l = !this.f34247l;
        m40676j(getSpannableText(), this.f34241f);
    }

    /* JADX INFO: renamed from: g */
    public final void m40678g(SpannableStringBuilder spannableStringBuilder, String str, boolean z11) {
        if (z11) {
            spannableStringBuilder.append((CharSequence) this.f34244i);
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.setSpan(m40674h(), spannableStringBuilder.length() - str.length(), spannableStringBuilder.length(), 18);
        }
    }

    @Override // com.kubi.resources.widget.BaseTextView, android.widget.TextView
    public void setText(@Nullable CharSequence text, @Nullable TextView.BufferType type) {
        this.f34241f = type;
        if (text == null || text.length() == 0) {
            this.f34240e = "";
        } else {
            while (StringsKt.endsWith$default(String.valueOf(text), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, false, 2, (Object) null)) {
                Intrinsics.checkNotNull(text);
                text = text.subSequence(0, text.length() - 1);
            }
            this.f34240e = text;
        }
        m40676j(getSpannableText(), this.f34241f);
    }

    /* JADX INFO: renamed from: i */
    private final void m40675i(Context context, AttributeSet attributeSet) {
        setMovementMethod(LinkMovementMethod.getInstance());
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC18592b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final void m40676j(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableTextView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        this.f34237b = '\n';
        C27017c c27017c = C27017c.f54310a;
        this.f34238c = c27017c.m66516f(R$string.coin_intro_more, new Object[0]);
        this.f34239d = c27017c.m66512a(R$color.primary);
        this.f34241f = TextView.BufferType.NORMAL;
        this.f34244i = C33627eb.f69716f;
        this.f34245j = 4;
        this.f34246k = c27017c.m66516f(R$string.home_rank_toggle, new Object[0]);
        m40675i(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableTextView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        this.f34237b = '\n';
        C27017c c27017c = C27017c.f54310a;
        this.f34238c = c27017c.m66516f(R$string.coin_intro_more, new Object[0]);
        this.f34239d = c27017c.m66512a(R$color.primary);
        this.f34241f = TextView.BufferType.NORMAL;
        this.f34244i = C33627eb.f69716f;
        this.f34245j = 4;
        this.f34246k = c27017c.m66516f(R$string.home_rank_toggle, new Object[0]);
        m40675i(context, attributeSet);
    }
}
