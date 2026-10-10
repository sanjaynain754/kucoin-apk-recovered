package com.kubi.user.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import c70.C4895s;
import com.blankj.utilcode.util.KeyboardUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.user.R$layout;
import com.kubi.user.R$styleable;
import com.kubi.user.exception.UserCenterException;
import com.kubi.user.utils.KeyboardUtil;
import com.kubi.user.view.CodeInputView;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27046k;
import d70.C36638a;
import java.util.List;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: CodeInputView.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001bH\u0002J\u0018\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001bH\u0002J\u0018\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0007H\u0014J\b\u0010%\u001a\u00020\u001cH\u0014J\u001a\u0010&\u001a\u00020\u001c2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aJ\u0006\u0010'\u001a\u00020\u001cJ\u0006\u0010(\u001a\u00020\u001cJ\u000e\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u001bJ\u0006\u0010+\u001a\u00020\u001bR\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR#\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, m90084d2 = {"Lcom/kubi/user/view/CodeInputView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/user/databinding/BusercenterLayoutCodeInputViewBinding;", "getBinding", "()Lcom/kubi/user/databinding/BusercenterLayoutCodeInputViewBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "codeViews", "", "Landroid/widget/CheckedTextView;", "getCodeViews", "()Ljava/util/List;", "codeViews$delegate", "Lkotlin/Lazy;", "autoSoftInput", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "", "", "onTextChanged", "input", "charGet", "index", "onVisibilityChanged", "changedView", "Landroid/view/View;", "visibility", "onDetachedFromWindow", "setInputListener", "setCodeError", "clearCodeContent", "setCodeContent", "code", "getCodeContent", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCodeInputView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CodeInputView.kt\ncom/kubi/user/view/CodeInputView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 UserCenterIssue.kt\ncom/kubi/user/exception/UserCenterIssueKt\n*L\n1#1,138:1\n52#2:139\n80#2,7:140\n39#3:147\n55#3,12:148\n84#3,3:160\n1878#4,3:163\n1878#4,3:175\n1869#4,2:178\n1#5:166\n57#6,8:167\n*S KotlinDebug\n*F\n+ 1 CodeInputView.kt\ncom/kubi/user/view/CodeInputView\n*L\n30#1:139\n30#1:140,7\n48#1:147\n48#1:148,12\n48#1:160,3\n60#1:163,3\n99#1:175,3\n95#1:178,2\n134#1:167,8\n*E\n"})
public final class CodeInputView extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ KProperty<Object>[] f53894f = {Reflection.property1(new PropertyReference1Impl(CodeInputView.class, "binding", "getBinding()Lcom/kubi/user/databinding/BusercenterLayoutCodeInputViewBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f53895b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f53896c;

    /* JADX INFO: renamed from: d */
    public boolean f53897d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public Function1<? super String, Unit> f53898e;

    /* JADX INFO: renamed from: com.kubi.user.view.CodeInputView$a */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release", "androidx/core/widget/TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 CodeInputView.kt\ncom/kubi/user/view/CodeInputView\n*L\n1#1,82:1\n63#2:83\n59#3:84\n48#4:85\n*E\n"})
    public static final class C26844a implements TextWatcher {
        public C26844a() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence text, int start, int before, int count) {
            CodeInputView.this.m65903k(text != null ? text.toString() : null);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s11) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CodeInputView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final String getCodeContent() {
        EditText editText;
        try {
            C4895s binding = getBinding();
            return String.valueOf((binding == null || (editText = binding.f5309h) == null) ? null : editText.getText());
        } catch (Throwable th2) {
            if (C42899b.m94075e(th2)) {
                return "";
            }
            if (C36638a.m81972c(th2)) {
                C43846g.m96568c(new UserCenterException(th2, "CodeInputView", true, null, 8, null), null, 2, null);
                return "";
            }
            C36638a.m81973d(th2, "CodeInputView");
            return "";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CodeInputView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final List<CheckedTextView> getCodeViews() {
        return (List) this.f53896c.getValue();
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m65901l(String str, CodeInputView codeInputView) {
        EditText editText;
        EditText editText2;
        if (!Pattern.compile("^\\d{6}$").matcher(str).matches()) {
            return Unit.INSTANCE;
        }
        C4895s binding = codeInputView.getBinding();
        if (binding != null && (editText2 = binding.f5309h) != null) {
            editText2.setText(str);
        }
        C4895s binding2 = codeInputView.getBinding();
        if (binding2 != null && (editText = binding2.f5309h) != null) {
            editText.setSelection(str.length());
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final C4895s getBinding() {
        return (C4895s) this.f53895b.getValue(this, f53894f[0]);
    }

    /* JADX INFO: renamed from: h */
    public final String m65902h(int i11, String str) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(String.valueOf(str.charAt(i11)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        String str2 = (String) objM103844constructorimpl;
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: k */
    public final void m65903k(String str) {
        Function1<? super String, Unit> function1;
        if (str == null) {
            return;
        }
        int i11 = 0;
        for (Object obj : getCodeViews()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            CheckedTextView checkedTextView = (CheckedTextView) obj;
            if (checkedTextView != null) {
                checkedTextView.setChecked(false);
            }
            if (checkedTextView != null) {
                checkedTextView.setSelected(i11 == str.length());
            }
            if (checkedTextView != null) {
                checkedTextView.setText(m65902h(i11, str));
            }
            i11 = i12;
        }
        if (str.length() != 6 || (function1 = this.f53898e) == null) {
            return;
        }
        function1.invoke(str);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View changedView, int visibility) {
        C4895s binding;
        LinearLayout linearLayout;
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        if (!this.f53897d || visibility != 0 || (binding = getBinding()) == null || (linearLayout = binding.f5310i) == null) {
            return;
        }
        linearLayout.performClick();
    }

    public final void setCodeContent(@NotNull final String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        C27100x0.m66924e(new Function0() { // from class: m70.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CodeInputView.m65901l(code, this);
            }
        });
    }

    public final void setInputListener(@NotNull Function1<? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f53898e = listener;
    }

    public /* synthetic */ CodeInputView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m65897f(CodeInputView codeInputView) {
        EditText editText;
        C4895s binding = codeInputView.getBinding();
        if (binding != null && (editText = binding.f5309h) != null) {
            editText.requestFocus();
            KeyboardUtil.a.showSafeSoftInput(editText);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final List m65899i(CodeInputView codeInputView) {
        CheckedTextView checkedTextView;
        CheckedTextView checkedTextView2;
        CheckedTextView checkedTextView3;
        CheckedTextView checkedTextView4;
        CheckedTextView checkedTextView5;
        C4895s binding = codeInputView.getBinding();
        CheckedTextView checkedTextView6 = null;
        if (binding != null) {
            checkedTextView = binding.f5303b;
        } else {
            checkedTextView = null;
        }
        C4895s binding2 = codeInputView.getBinding();
        if (binding2 != null) {
            checkedTextView2 = binding2.f5304c;
        } else {
            checkedTextView2 = null;
        }
        C4895s binding3 = codeInputView.getBinding();
        if (binding3 != null) {
            checkedTextView3 = binding3.f5305d;
        } else {
            checkedTextView3 = null;
        }
        C4895s binding4 = codeInputView.getBinding();
        if (binding4 != null) {
            checkedTextView4 = binding4.f5306e;
        } else {
            checkedTextView4 = null;
        }
        C4895s binding5 = codeInputView.getBinding();
        if (binding5 != null) {
            checkedTextView5 = binding5.f5307f;
        } else {
            checkedTextView5 = null;
        }
        C4895s binding6 = codeInputView.getBinding();
        if (binding6 != null) {
            checkedTextView6 = binding6.f5308g;
        }
        return CollectionsKt.listOf((Object[]) new CheckedTextView[]{checkedTextView, checkedTextView2, checkedTextView3, checkedTextView4, checkedTextView5, checkedTextView6});
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m65900j(EditText editText) {
        KeyboardUtils.m6034f(editText);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCodeError$lambda$12$lambda$11$lambda$10(CodeInputView codeInputView) {
        boolean z11;
        EditText editText;
        C4895s binding = codeInputView.getBinding();
        if (binding != null && (editText = binding.f5309h) != null) {
            editText.setText("");
        }
        int i11 = 0;
        for (Object obj : codeInputView.getCodeViews()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            CheckedTextView checkedTextView = (CheckedTextView) obj;
            if (checkedTextView != null) {
                checkedTextView.setChecked(false);
            }
            if (checkedTextView != null) {
                if (i11 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                checkedTextView.setSelected(z11);
            }
            if (checkedTextView != null) {
                checkedTextView.setText("");
            }
            i11 = i12;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        final EditText editText;
        super.onDetachedFromWindow();
        C4895s binding = getBinding();
        if (binding != null && (editText = binding.f5309h) != null) {
            C27100x0.m66924e(new Function0() { // from class: m70.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CodeInputView.m65900j(editText);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CodeInputView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        LinearLayout linearLayout;
        EditText editText;
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f53895b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C4895s>() { // from class: com.kubi.user.view.CodeInputView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C4895s invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C4895s.m5069a(C45682f.m100800a(viewGroup));
            }
        });
        this.f53896c = LazyKt.lazy(new Function0() { // from class: m70.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CodeInputView.m65899i(this.f94065b);
            }
        });
        this.f53897d = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CodeInputView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f53897d = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CodeInputView_autoSoftInput, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(R$layout.busercenter_layout_code_input_view, (ViewGroup) this, true);
        C4895s binding = getBinding();
        if (binding != null && (editText = binding.f5309h) != null) {
            editText.addTextChangedListener(new C26844a());
        }
        C4895s binding2 = getBinding();
        if (binding2 != null && (linearLayout = binding2.f5310i) != null) {
            C27046k.m66711z(linearLayout, 0L, new Function0() { // from class: m70.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CodeInputView.m65897f(this.f94067b);
                }
            }, 1, null);
        }
        CheckedTextView checkedTextView = (CheckedTextView) CollectionsKt.firstOrNull((List) getCodeViews());
        if (checkedTextView != null) {
            checkedTextView.setSelected(true);
        }
    }
}
