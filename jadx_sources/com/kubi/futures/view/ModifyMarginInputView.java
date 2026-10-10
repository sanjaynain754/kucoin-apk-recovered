package com.kubi.futures.view;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fasterxml.jackson.databind.node.C6447a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.utils.SimpleTextWatcher;
import com.kubi.resources.widget.FloatInputFilter;
import com.kubi.utils.C27056j0;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p236em.C37214b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModifyMarginInputView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u001c\u001a\u00020\u00142\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u0006\u0010\u001f\u001a\u00020\u0014J\u0010\u0010 \u001a\u00020\u00142\b\b\u0001\u0010!\u001a\u00020\u0011J\u000e\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u001eJ\u000e\u0010$\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010%\u001a\u0004\u0018\u00010&J\u000e\u0010'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020&J\u000e\u0010)\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u001eJ\u0014\u0010*\u001a\u00020\u00142\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u001c\u0010,\u001a\u00020\u00142\u0014\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u00140\u0016J\u001a\u0010-\u001a\u00020\u00142\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00140\u0016J\u0006\u0010.\u001a\u00020\tJ\u0006\u0010/\u001a\u00020\u000bJ\b\u00100\u001a\u00020\u0014H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, m90084d2 = {"Lcom/kubi/futures/view/ModifyMarginInputView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "subTitle", "Landroidx/appcompat/widget/AppCompatTextView;", "editText", "Landroidx/appcompat/widget/AppCompatEditText;", "suffix", "inputBg", "Landroid/view/View;", "errorTips", "precision", "", "actionListener", "Lkotlin/Function0;", "", "textWatcher", "Lkotlin/Function1;", "", "focusChangeListener", "", "disposable", "Lio/reactivex/disposables/Disposable;", "showError", "message", "", "hideError", "setSubTitleRes", "textRes", "setSuffixText", "text", "setPrecision", "getInputValue", "Ljava/math/BigDecimal;", "setInputValue", "value", "setInputHint", "setActionListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setTextWatcher", "setOnFocusChangeListener", "getSuffixView", "getEditView", "onDetachedFromWindow", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ModifyMarginInputView extends ConstraintLayout {

    /* JADX INFO: renamed from: n */
    @NotNull
    public final AppCompatTextView f25024n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final AppCompatEditText f25025o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final AppCompatTextView f25026p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final View f25027q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final AppCompatTextView f25028r;

    /* JADX INFO: renamed from: s */
    public int f25029s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public Function0<Unit> f25030t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public Function1<? super CharSequence, Unit> f25031u;

    /* JADX INFO: renamed from: v */
    @Nullable
    public Function1<? super Boolean, Unit> f25032v;

    /* JADX INFO: renamed from: w */
    @NotNull
    public Disposable f25033w;

    /* JADX INFO: renamed from: com.kubi.futures.view.ModifyMarginInputView$a */
    /* JADX INFO: compiled from: ModifyMarginInputView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/futures/view/ModifyMarginInputView$4", "Lcom/kubi/kumex/utils/SimpleTextWatcher;", "onTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "", "start", "", TtmlNode.ANNOTATION_POSITION_BEFORE, "count", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14454a extends SimpleTextWatcher {
        public C14454a() {
        }

        @Override // com.kubi.kumex.utils.SimpleTextWatcher, android.text.TextWatcher
        public void onTextChanged(CharSequence s11, int start, int before, int count) {
            Function1 function1 = ModifyMarginInputView.this.f25031u;
            if (function1 != null) {
                function1.invoke(s11);
            }
        }
    }

    public final void setPrecision(int precision) {
        this.f25029s = precision;
        if (precision <= 0) {
            this.f25025o.setInputType(2);
        } else {
            this.f25025o.setInputType(8194);
        }
        this.f25025o.setFilters(new InputFilter[]{new C27056j0(precision), new FloatInputFilter()});
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifyMarginInputView(@NotNull final Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(R$layout.bkumex_modify_margin_input_view, this);
        View viewFindViewById = findViewById(R$id.inputBg);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f25027q = viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.inputTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f25024n = (AppCompatTextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.edit);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        AppCompatEditText appCompatEditText = (AppCompatEditText) viewFindViewById3;
        this.f25025o = appCompatEditText;
        View viewFindViewById4 = findViewById(R$id.inputSuffix);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f25026p = (AppCompatTextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.errorTips);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f25028r = (AppCompatTextView) viewFindViewById5;
        viewFindViewById.setBackgroundResource(R$drawable.shape_input_normal);
        appCompatEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.kubi.futures.view.n
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                ModifyMarginInputView.m28877f(this.f25052b, context, view, z11);
            }
        });
        Observable<CharSequence> observableM101605b = C0206f.m784d(appCompatEditText).m101605b();
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.view.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifyMarginInputView.m28878g((CharSequence) obj);
            }
        };
        Consumer<? super CharSequence> consumer = new Consumer() { // from class: com.kubi.futures.view.p
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ModifyMarginInputView.m28879h(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.futures.view.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifyMarginInputView.m28880i((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableM101605b.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.view.r
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ModifyMarginInputView.m28881j(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        this.f25033w = disposableSubscribe;
        appCompatEditText.addTextChangedListener(new C14454a());
    }

    /* JADX INFO: renamed from: f */
    public static final void m28877f(ModifyMarginInputView modifyMarginInputView, Context context, View view, boolean z11) {
        if (z11) {
            modifyMarginInputView.f25024n.setTextColor(context.getResources().getColor(R$color.c_text));
            modifyMarginInputView.f25027q.setBackgroundResource(R$drawable.shape_input_focus);
        } else {
            modifyMarginInputView.f25024n.setTextColor(context.getResources().getColor(R$color.c_text));
            modifyMarginInputView.f25027q.setBackgroundResource(R$drawable.shape_input_normal);
        }
        Function1<? super Boolean, Unit> function1 = modifyMarginInputView.f25032v;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z11));
        }
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m28878g(CharSequence charSequence) {
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: getEditView, reason: from getter */
    public final AppCompatEditText getF25025o() {
        return this.f25025o;
    }

    @Nullable
    public final BigDecimal getInputValue() {
        String strValueOf = this.f25025o.getText() != null ? String.valueOf(this.f25025o.getText()) : "";
        if (TextUtils.isEmpty(strValueOf)) {
            return null;
        }
        try {
            return new BigDecimal(strValueOf);
        } catch (Exception e11) {
            C37214b.m83255a(e11, "ModifyMarginInputView");
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getSuffixView, reason: from getter */
    public final AppCompatTextView getF25026p() {
        return this.f25026p;
    }

    /* JADX INFO: renamed from: l */
    public final void m28883l() {
        if (this.f25025o.isFocused()) {
            this.f25024n.setTextColor(getContext().getResources().getColor(R$color.c_text));
            this.f25027q.setBackgroundResource(R$drawable.shape_input_focus);
        } else {
            this.f25024n.setTextColor(getContext().getResources().getColor(R$color.c_text));
            this.f25027q.setBackgroundResource(R$drawable.shape_input_normal);
        }
        ViewExtKt.m66577h(this.f25028r);
    }

    /* JADX INFO: renamed from: m */
    public final void m28884m(@Nullable String str) {
        if (str == null || str.length() == 0) {
            ViewExtKt.m66577h(this.f25028r);
        } else {
            C27046k.m66685H(this.f25028r);
            this.f25028r.setText(str);
        }
        this.f25024n.setTextColor(getContext().getResources().getColor(R$color.c_text));
        this.f25027q.setBackgroundResource(R$drawable.shape_input_error);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f25033w.dispose();
        super.onDetachedFromWindow();
    }

    public final void setActionListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f25030t = listener;
    }

    public final void setInputHint(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f25025o.setHint(text);
    }

    public final void setInputValue(@NotNull BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f25025o.setText(C6447a.m11724a(value.setScale(this.f25029s, RoundingMode.DOWN)).toPlainString());
        C27046k.m66707v(this.f25025o);
    }

    public final void setOnFocusChangeListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f25032v = listener;
    }

    public final void setSubTitleRes(@StringRes int textRes) {
        this.f25024n.setText(textRes);
    }

    public final void setSuffixText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f25026p.setText(text);
    }

    public final void setTextWatcher(@NotNull Function1<? super CharSequence, Unit> textWatcher) {
        Intrinsics.checkNotNullParameter(textWatcher, "textWatcher");
        this.f25031u = textWatcher;
    }

    /* JADX INFO: renamed from: h */
    public static final void m28879h(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m28880i(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C37214b.m83255a(th2, "ModifyMarginInputView");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final void m28881j(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
