package com.kubi.margin;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5258a;
import com.kubi.margin.MarginAgreementDialog;
import com.kubi.margin.entity.LeverOpen;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37766r;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import mp.C42579a;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36905c;
import p768xo.InterfaceC46305f;
import p768xo.InterfaceC46306g;
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
import p852kotlin.text.StringsKt;
import t30.C44683c;
import w00.C45681e;

/* JADX INFO: compiled from: MarginAgreementDialog.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010!\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\u001fH\u0002J\b\u0010#\u001a\u00020\u001fH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R#\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR#\u0010\u0011\u001a\n \f*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, m90084d2 = {"Lcom/kubi/margin/MarginAgreementDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/margin/databinding/BmarginDialogMarginAgreementBinding;", "getBinding", "()Lcom/kubi/margin/databinding/BmarginDialogMarginAgreementBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "api", "Lcom/kubi/margin/api/MarginApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/margin/api/MarginApi;", "api$delegate", "Lkotlin/Lazy;", "agreementUrl", "", "getAgreementUrl", "()Ljava/lang/String;", "agreementUrl$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initView", "initListener", "openLever", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginAgreementDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginAgreementDialog.kt\ncom/kubi/margin/MarginAgreementDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n143#2,20:119\n1#3:139\n*S KotlinDebug\n*F\n+ 1 MarginAgreementDialog.kt\ncom/kubi/margin/MarginAgreementDialog\n*L\n40#1:119,20\n*E\n"})
public final class MarginAgreementDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ KProperty<Object>[] f32641t0 = {Reflection.property1(new PropertyReference1Impl(MarginAgreementDialog.class, "binding", "getBinding()Lcom/kubi/margin/databinding/BmarginDialogMarginAgreementBinding;", 0))};

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f32642q0 = C45681e.m100799e(this, new Function1<MarginAgreementDialog, C36905c>() { // from class: com.kubi.margin.MarginAgreementDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36905c invoke(@NotNull MarginAgreementDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36905c.m82679a(fragment.requireView());
        }
    }, new Function1<C36905c, Unit>() { // from class: com.kubi.margin.MarginAgreementDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36905c it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36905c c36905c) {
            invoke(c36905c);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f32643r0 = LazyKt.lazy(new Function0() { // from class: wo.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginAgreementDialog.m37892w4();
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f32644s0 = LazyKt.lazy(new Function0() { // from class: wo.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginAgreementDialog.m37891v4(this.f103371b);
        }
    });

    /* JADX INFO: renamed from: com.kubi.margin.MarginAgreementDialog$a */
    /* JADX INFO: compiled from: MarginAgreementDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/margin/MarginAgreementDialog$initView$1", "Landroid/text/style/ClickableSpan;", "updateDrawState", "", "ds", "Landroid/text/TextPaint;", "onClick", "widget", "Landroid/view/View;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nMarginAgreementDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginAgreementDialog.kt\ncom/kubi/margin/MarginAgreementDialog$initView$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n1#2:119\n*E\n"})
    public static final class C17475a extends ClickableSpan {
        public C17475a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            String strM98841a;
            Intrinsics.checkNotNullParameter(widget, "widget");
            String strM37895x4 = MarginAgreementDialog.this.m37895x4();
            if (strM37895x4 == null || (strM98841a = C44683c.m98841a(strM37895x4)) == null) {
                return;
            }
            String str = strM98841a + "?appNeedLang=true";
            if (str != null) {
                if (str.length() <= 0) {
                    str = null;
                }
                String str2 = str;
                if (str2 != null) {
                    InterfaceC37766r.a.m85190a(C37304a.f82764a, str2, null, null, null, null, null, null, 126, null);
                }
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            ds2.setUnderlineText(true);
        }
    }

    /* JADX INFO: renamed from: F4 */
    public static final Unit m37873F4(BaseActivity baseActivity, Throwable th2) {
        BaseActivity.hideLoadingDialog$default(baseActivity, false, 1, null);
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m37877J4(MarginAgreementDialog marginAgreementDialog, BaseActivity baseActivity, LeverOpen leverOpen) {
        C42579a.f94275a.m93347g().Q();
        ToastCompat.m66441G(marginAgreementDialog.getString(R$string.kc_margin_protocol_assign), new Object[0]);
        BaseActivity.hideLoadingDialog$default(baseActivity, false, 1, null);
        marginAgreementDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    private final InterfaceC46305f m37893y4() {
        return (InterfaceC46305f) this.f32643r0.getValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bmargin_dialog_margin_agreement, (ViewGroup) null, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
        m37869A4();
    }

    /* JADX INFO: renamed from: x4 */
    public final String m37895x4() {
        return (String) this.f32644s0.getValue();
    }

    /* JADX INFO: renamed from: z4 */
    public final C36905c m37896z4() {
        return (C36905c) this.f32642q0.getValue(this, f32641t0[0]);
    }

    /* JADX INFO: renamed from: A4 */
    private final void m37869A4() {
        KcPrimaryButton kcPrimaryButton;
        KcSecondaryButton kcSecondaryButton;
        C36905c c36905cM37896z4 = m37896z4();
        if (c36905cM37896z4 != null && (kcSecondaryButton = c36905cM37896z4.f81600c) != null) {
            C27046k.m66711z(kcSecondaryButton, 0L, new Function0() { // from class: wo.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginAgreementDialog.m37870B4(this.f103368b);
                }
            }, 1, null);
        }
        C36905c c36905cM37896z5 = m37896z4();
        if (c36905cM37896z5 != null && (kcPrimaryButton = c36905cM37896z5.f81601d) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: wo.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginAgreementDialog.m37871C4(this.f103370b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m37870B4(MarginAgreementDialog marginAgreementDialog) {
        marginAgreementDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public static final Unit m37871C4(MarginAgreementDialog marginAgreementDialog) {
        ImageView imageView;
        C36905c c36905cM37896z4 = marginAgreementDialog.m37896z4();
        if (c36905cM37896z4 != null && (imageView = c36905cM37896z4.f81599b) != null && imageView.isSelected()) {
            marginAgreementDialog.m37894E4();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m37872D4(MarginAgreementDialog marginAgreementDialog) {
        ImageView imageView;
        Boolean boolValueOf;
        ImageView imageView2;
        C36905c c36905cM37896z4 = marginAgreementDialog.m37896z4();
        if (c36905cM37896z4 != null && (imageView = c36905cM37896z4.f81599b) != null) {
            C36905c c36905cM37896z5 = marginAgreementDialog.m37896z4();
            if (c36905cM37896z5 != null && (imageView2 = c36905cM37896z5.f81599b) != null) {
                boolValueOf = Boolean.valueOf(imageView2.isSelected());
            } else {
                boolValueOf = null;
            }
            imageView.setSelected(!C27025c.m66566d(boolValueOf));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public static final void m37874G4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m37875H4(BaseActivity baseActivity, Disposable disposable) {
        baseActivity.showLoadingDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I4 */
    public static final void m37876I4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K4 */
    public static final void m37878K4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void initView() {
        ImageView imageView;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        C36905c c36905cM37896z4 = m37896z4();
        if (c36905cM37896z4 != null && (baseTextView3 = c36905cM37896z4.f81603f) != null) {
            baseTextView3.setMovementMethod(LinkMovementMethod.getInstance());
        }
        C36905c c36905cM37896z5 = m37896z4();
        if (c36905cM37896z5 != null && (baseTextView2 = c36905cM37896z5.f81603f) != null) {
            baseTextView2.setHighlightColor(0);
        }
        C36905c c36905cM37896z6 = m37896z4();
        if (c36905cM37896z6 != null && (baseTextView = c36905cM37896z6.f81603f) != null) {
            HighlightTextHelper.f43497a.m54116a(baseTextView, HighlightTextHelper.TextTagEnum.SPAN, new C17475a());
        }
        C36905c c36905cM37896z7 = m37896z4();
        if (c36905cM37896z7 != null && (imageView = c36905cM37896z7.f81599b) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: wo.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginAgreementDialog.m37872D4(this.f103372b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: v4 */
    public static final String m37891v4(MarginAgreementDialog marginAgreementDialog) {
        String str;
        boolean z11;
        String strM56284y;
        String strM98841a;
        Bundle arguments = marginAgreementDialog.getArguments();
        String str2 = null;
        if (arguments != null && (strM56284y = RouteExKt.m56284y(arguments, "url")) != null && (strM98841a = C44683c.m98841a(strM56284y)) != null) {
            str = strM98841a + "?appNeedLang=true";
        } else {
            str = null;
        }
        if (str != null && !StringsKt.isBlank(str)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            str2 = str;
        }
        if (str2 == null) {
            if (MultiLanguageManager.m56979h()) {
                return InterfaceC46306g.f103877d;
            }
            return InterfaceC46306g.f103876c;
        }
        return str2;
    }

    /* JADX INFO: renamed from: w4 */
    public static final InterfaceC46305f m37892w4() {
        return (InterfaceC46305f) C42597a.m93386b().create(InterfaceC46305f.class);
    }

    /* JADX INFO: renamed from: E4 */
    public final void m37894E4() {
        final BaseActivity baseActivity;
        Activity activityM6125h = C5258a.m6125h();
        if (activityM6125h != null) {
            if (activityM6125h instanceof BaseActivity) {
                baseActivity = (BaseActivity) activityM6125h;
            } else {
                baseActivity = null;
            }
            if (baseActivity != null) {
                Observable<R> observableCompose = m37893y4().m102113z().compose(C24217a1.m58389m());
                final Function1 function1 = new Function1() { // from class: wo.h
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarginAgreementDialog.m37875H4(baseActivity, (Disposable) obj);
                    }
                };
                Observable observableDoOnSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: wo.i
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        MarginAgreementDialog.m37876I4(function1, obj);
                    }
                });
                final Function1 function2 = new Function1() { // from class: wo.j
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarginAgreementDialog.m37877J4(this.f103375b, baseActivity, (LeverOpen) obj);
                    }
                };
                Consumer consumer = new Consumer() { // from class: wo.k
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        MarginAgreementDialog.m37878K4(function2, obj);
                    }
                };
                final Function1 function3 = new Function1() { // from class: wo.l
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarginAgreementDialog.m37873F4(baseActivity, (Throwable) obj);
                    }
                };
                Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(consumer, new Consumer() { // from class: wo.c
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        MarginAgreementDialog.m37874G4(function3, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
                DisposableKt.addTo(disposableSubscribe, getF43550U());
            }
        }
    }
}
