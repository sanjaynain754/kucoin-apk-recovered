package com.kubi.otc.view;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.KeyboardUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.otc.R$color;
import com.kubi.otc.R$layout;
import com.kubi.otc.view.FiatEditTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.FilterEmojiEditText;
import com.kubi.sdk.base.p113ui.InterfaceC23686g;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.C27056j0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.qcloud.tuicore.TUIConstants;
import ht.C38346y;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p270ft.C37617f0;
import p752x8.AbstractC46099a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45682f;

/* JADX INFO: compiled from: FiatEditTextView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\"\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00160\u001aJ\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001dJ\u0006\u0010 \u001a\u00020\u001dJ\u0006\u0010!\u001a\u00020\u0016J\u0006\u0010\"\u001a\u00020\u0016J\u0006\u0010#\u001a\u00020\u0016J\u0006\u0010$\u001a\u00020\u0016R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006%"}, m90084d2 = {"Lcom/kubi/otc/view/FiatEditTextView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "maxInput", "Ljava/math/BigDecimal;", "getMaxInput", "()Ljava/math/BigDecimal;", "maxInput$delegate", "Lkotlin/Lazy;", "binding", "Lcom/kubi/otc/databinding/BotcViewFaitEdittextBinding;", "getBinding", "()Lcom/kubi/otc/databinding/BotcViewFaitEdittextBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "initView", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Lcom/kubi/sdk/base/ui/IView;", "checkAction", "Lkotlin/Function1;", "setInputText", "content", "", "setCurrency", FirebaseAnalytics.Param.CURRENCY, "getInputText", "setLineSecondary", "setLinePrimary", "showSoft", "hideSoft", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFiatEditTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FiatEditTextView.kt\ncom/kubi/otc/view/FiatEditTextView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,127:1\n41#2:128\n65#2:129\n80#2,7:130\n65#2:137\n80#2,7:138\n*S KotlinDebug\n*F\n+ 1 FiatEditTextView.kt\ncom/kubi/otc/view/FiatEditTextView\n*L\n31#1:128\n31#1:129\n31#1:130,7\n31#1:137\n31#1:138,7\n*E\n"})
public final class FiatEditTextView extends ConstraintLayout {

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ KProperty<Object>[] f38149p = {Reflection.property1(new PropertyReference1Impl(FiatEditTextView.class, "binding", "getBinding()Lcom/kubi/otc/databinding/BotcViewFaitEdittextBinding;", 0))};

    /* JADX INFO: renamed from: n */
    @NotNull
    public final Lazy f38150n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final InterfaceC24293a f38151o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiatEditTextView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38150n = LazyKt.lazy(new Function0() { // from class: mt.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FiatEditTextView.m45516y();
            }
        });
        this.f38151o = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37617f0>() { // from class: com.kubi.otc.view.FiatEditTextView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37617f0 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37617f0.m84815a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(getContext()).inflate(R$layout.botc_view_fait_edittext, this);
    }

    private final C37617f0 getBinding() {
        return (C37617f0) this.f38151o.getValue(this, f38149p[0]);
    }

    private final BigDecimal getMaxInput() {
        return (BigDecimal) this.f38150n.getValue();
    }

    /* JADX INFO: renamed from: y */
    public static final BigDecimal m45516y() {
        return new BigDecimal(1000000000);
    }

    /* JADX INFO: renamed from: B */
    public final void m45518B() {
        postDelayed(new Runnable() { // from class: mt.h
            @Override // java.lang.Runnable
            public final void run() {
                FiatEditTextView.m45501C(this.f94352b);
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: o */
    public final void m45520o(@NotNull InterfaceC23686g view, @NotNull final Function1<? super BigDecimal, Unit> checkAction) {
        FilterEmojiEditText filterEmojiEditText;
        final FilterEmojiEditText filterEmojiEditText2;
        LinearLayout linearLayout;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(checkAction, "checkAction");
        C37617f0 binding = getBinding();
        if (binding != null && (linearLayout = binding.f83860d) != null) {
            C27046k.m66711z(linearLayout, 0L, new Function0() { // from class: mt.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FiatEditTextView.m45510p(this.f94334b);
                }
            }, 1, null);
        }
        C37617f0 binding2 = getBinding();
        if (binding2 != null && (filterEmojiEditText2 = binding2.f83858b) != null) {
            AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(filterEmojiEditText2);
            final Function1 function1 = new Function1() { // from class: mt.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FiatEditTextView.m45511r(this.f94336b, filterEmojiEditText2, checkAction, (CharSequence) obj);
                }
            };
            Consumer<? super CharSequence> consumer = new Consumer() { // from class: mt.d
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    FiatEditTextView.m45512t(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: mt.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FiatEditTextView.m45513u((Throwable) obj);
                }
            };
            Disposable disposableSubscribe = abstractC46099aM784d.subscribe(consumer, new Consumer() { // from class: mt.f
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    FiatEditTextView.m45514w(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            CompositeDisposable compositeDisposable = view.getCompositeDisposable();
            Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
            DisposableKt.addTo(disposableSubscribe, compositeDisposable);
        }
        C37617f0 binding3 = getBinding();
        if (binding3 != null && (filterEmojiEditText = binding3.f83858b) != null) {
            filterEmojiEditText.setFilters(new C27056j0[]{new C27056j0(2)});
        }
        post(new Runnable() { // from class: mt.g
            @Override // java.lang.Runnable
            public final void run() {
                FiatEditTextView.m45515x(this.f94350b);
            }
        });
    }

    public final void setCurrency(@NotNull String currency) {
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(currency, "currency");
        C37617f0 binding = getBinding();
        if (binding == null || (baseTextView = binding.f83859c) == null) {
            return;
        }
        baseTextView.setText(currency);
    }

    public final void setInputText(@NotNull String content) {
        FilterEmojiEditText filterEmojiEditText;
        FilterEmojiEditText filterEmojiEditText2;
        Editable text;
        FilterEmojiEditText filterEmojiEditText3;
        Intrinsics.checkNotNullParameter(content, "content");
        C37617f0 binding = getBinding();
        if (binding != null && (filterEmojiEditText3 = binding.f83858b) != null) {
            filterEmojiEditText3.setText(content);
        }
        C37617f0 binding2 = getBinding();
        if (binding2 == null || (filterEmojiEditText = binding2.f83858b) == null) {
            return;
        }
        C37617f0 binding3 = getBinding();
        filterEmojiEditText.setSelection(C27039d.m66650j((binding3 == null || (filterEmojiEditText2 = binding3.f83858b) == null || (text = filterEmojiEditText2.getText()) == null) ? null : Integer.valueOf(text.length())));
    }

    /* JADX INFO: renamed from: C */
    public static final void m45501C(FiatEditTextView fiatEditTextView) {
        C37617f0 binding = fiatEditTextView.getBinding();
        if (binding != null && binding.f83858b != null) {
            KeyboardUtils.m6040l();
        }
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m45510p(FiatEditTextView fiatEditTextView) {
        FilterEmojiEditText filterEmojiEditText;
        C37617f0 binding = fiatEditTextView.getBinding();
        if (binding != null && (filterEmojiEditText = binding.f83858b) != null) {
            filterEmojiEditText.requestFocus();
            KeyboardUtils.m6041m(filterEmojiEditText);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m45511r(FiatEditTextView fiatEditTextView, FilterEmojiEditText filterEmojiEditText, Function1 function1, CharSequence charSequence) {
        float f11;
        Integer numValueOf;
        BaseTextView baseTextView;
        int length = charSequence.length();
        if (length < 8) {
            f11 = 40.0f;
        } else if (8 <= length && length < 12) {
            f11 = 36.0f;
        } else if (12 <= length && length < 14) {
            f11 = 32.0f;
        } else if (14 <= length && length < 16) {
            f11 = 30.0f;
        } else {
            f11 = 28.0f;
        }
        filterEmojiEditText.setTextSize(f11);
        C37617f0 binding = fiatEditTextView.getBinding();
        if (binding != null && (baseTextView = binding.f83859c) != null) {
            baseTextView.setTextSize(f11);
        }
        BigDecimal bigDecimalM86490A = C38346y.m86490A(charSequence.toString());
        if (fiatEditTextView.getMaxInput().compareTo(bigDecimalM86490A) == -1) {
            filterEmojiEditText.setText(fiatEditTextView.getMaxInput().toPlainString());
            Editable text = filterEmojiEditText.getText();
            if (text != null) {
                numValueOf = Integer.valueOf(text.length());
            } else {
                numValueOf = null;
            }
            filterEmojiEditText.setSelection(C27039d.m66650j(numValueOf));
            return Unit.INSTANCE;
        }
        function1.invoke(bigDecimalM86490A);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final void m45512t(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m45513u(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final void m45514w(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x */
    public static final void m45515x(FiatEditTextView fiatEditTextView) {
        View view;
        BaseTextView baseTextView;
        C37617f0 binding;
        FilterEmojiEditText filterEmojiEditText;
        Integer numValueOf;
        BaseTextView baseTextView2;
        View view2;
        if (fiatEditTextView.getBinding() != null) {
            C37617f0 binding2 = fiatEditTextView.getBinding();
            Integer numValueOf2 = null;
            if (binding2 != null) {
                view = binding2.f83861e;
            } else {
                view = null;
            }
            if (view != null) {
                C37617f0 binding3 = fiatEditTextView.getBinding();
                if (binding3 != null) {
                    baseTextView = binding3.f83859c;
                } else {
                    baseTextView = null;
                }
                if (baseTextView != null && (binding = fiatEditTextView.getBinding()) != null && (filterEmojiEditText = binding.f83858b) != null) {
                    C37617f0 binding4 = fiatEditTextView.getBinding();
                    if (binding4 != null && (view2 = binding4.f83861e) != null) {
                        numValueOf = Integer.valueOf(view2.getWidth());
                    } else {
                        numValueOf = null;
                    }
                    int iM66650j = C27039d.m66650j(numValueOf);
                    C37617f0 binding5 = fiatEditTextView.getBinding();
                    if (binding5 != null && (baseTextView2 = binding5.f83859c) != null) {
                        numValueOf2 = Integer.valueOf(baseTextView2.getWidth());
                    }
                    filterEmojiEditText.setMaxWidth((iM66650j - C27039d.m66650j(numValueOf2)) - C27029c.m66601d(fiatEditTextView, 10));
                }
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m45517A() {
        View view;
        C37617f0 binding = getBinding();
        if (binding != null && (view = binding.f83861e) != null) {
            view.setBackgroundColor(ContextCompat.getColor(getContext(), R$color.secondary));
        }
    }

    @NotNull
    public final String getInputText() {
        Editable text;
        FilterEmojiEditText filterEmojiEditText;
        C37617f0 binding = getBinding();
        if (binding != null && (filterEmojiEditText = binding.f83858b) != null) {
            text = filterEmojiEditText.getText();
        } else {
            text = null;
        }
        return String.valueOf(text);
    }

    /* JADX INFO: renamed from: n */
    public final void m45519n() {
        FilterEmojiEditText filterEmojiEditText;
        C37617f0 binding = getBinding();
        if (binding != null && (filterEmojiEditText = binding.f83858b) != null) {
            KeyboardUtils.m6034f(filterEmojiEditText);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m45521z() {
        View view;
        C37617f0 binding = getBinding();
        if (binding != null && (view = binding.f83861e) != null) {
            view.setBackgroundColor(ContextCompat.getColor(getContext(), R$color.primary));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiatEditTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38150n = LazyKt.lazy(new Function0() { // from class: mt.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FiatEditTextView.m45516y();
            }
        });
        this.f38151o = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37617f0>() { // from class: com.kubi.otc.view.FiatEditTextView$special$$inlined$viewBinding$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37617f0 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37617f0.m84815a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(getContext()).inflate(R$layout.botc_view_fait_edittext, this);
    }
}
