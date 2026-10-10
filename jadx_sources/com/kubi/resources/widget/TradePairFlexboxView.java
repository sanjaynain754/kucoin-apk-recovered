package com.kubi.resources.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.content.res.AppCompatResources;
import com.google.android.flexbox.FlexboxLayout;
import com.kubi.sdk.res.R$drawable;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$layout;
import com.kubi.sdk.res.R$string;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.C27017c;
import k00.C40839c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45682f;

/* JADX INFO: compiled from: TradePairFlexboxView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0013\u0010 \u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0013R\u0013\u0010$\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0013R\u0013\u0010&\u001a\u0004\u0018\u00010'8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006*"}, m90084d2 = {"Lcom/kubi/resources/widget/TradePairFlexboxView;", "Lcom/google/android/flexbox/FlexboxLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/sdk/res/databinding/CommonViewFlexTradepairLayoutBinding;", "getBinding", "()Lcom/kubi/sdk/res/databinding/CommonViewFlexTradepairLayoutBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "tradePairView", "Lcom/kubi/resources/widget/BaseTextView;", "getTradePairView", "()Lcom/kubi/resources/widget/BaseTextView;", "tvQuote", "getTvQuote", "labelViewPrepGroup", "Landroid/view/View;", "getLabelViewPrepGroup", "()Landroid/view/View;", "labelViewPrep", "getLabelViewPrep", "labelViewNew", "getLabelViewNew", "labelViewST", "getLabelViewST", "labelViewLevel", "getLabelViewLevel", "labelViewComingSoon", "getLabelViewComingSoon", "labelView0Fee", "getLabelView0Fee", "labelViewHot", "Landroid/widget/ImageView;", "getLabelViewHot", "()Landroid/widget/ImageView;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradePairFlexboxView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradePairFlexboxView.kt\ncom/kubi/resources/widget/TradePairFlexboxView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n52#2:105\n80#2,7:106\n1#3:113\n*S KotlinDebug\n*F\n+ 1 TradePairFlexboxView.kt\ncom/kubi/resources/widget/TradePairFlexboxView\n*L\n29#1:105\n29#1:106,7\n*E\n"})
public final class TradePairFlexboxView extends FlexboxLayout {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ KProperty<Object>[] f44178k = {Reflection.property1(new PropertyReference1Impl(TradePairFlexboxView.class, "binding", "getBinding()Lcom/kubi/sdk/res/databinding/CommonViewFlexTradepairLayoutBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f44179b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final BaseTextView f44180c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final View f44181d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final BaseTextView f44182e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final BaseTextView f44183f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final BaseTextView f44184g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final BaseTextView f44185h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final BaseTextView f44186i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final BaseTextView f44187j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TradePairFlexboxView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TradePairFlexboxView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final C40839c getBinding() {
        return (C40839c) this.f44179b.getValue(this, f44178k[0]);
    }

    @Nullable
    /* JADX INFO: renamed from: getLabelView0Fee, reason: from getter */
    public final BaseTextView getF44187j() {
        return this.f44187j;
    }

    @Nullable
    /* JADX INFO: renamed from: getLabelViewComingSoon, reason: from getter */
    public final BaseTextView getF44186i() {
        return this.f44186i;
    }

    @Nullable
    public final ImageView getLabelViewHot() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((ImageView) findViewById(R$id.iv_hot_tag));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (ImageView) objM103844constructorimpl;
    }

    @Nullable
    /* JADX INFO: renamed from: getLabelViewLevel, reason: from getter */
    public final BaseTextView getF44185h() {
        return this.f44185h;
    }

    @Nullable
    /* JADX INFO: renamed from: getLabelViewNew, reason: from getter */
    public final BaseTextView getF44183f() {
        return this.f44183f;
    }

    @Nullable
    /* JADX INFO: renamed from: getLabelViewPrep, reason: from getter */
    public final BaseTextView getF44182e() {
        return this.f44182e;
    }

    @Nullable
    /* JADX INFO: renamed from: getLabelViewPrepGroup, reason: from getter */
    public final View getF44181d() {
        return this.f44181d;
    }

    @Nullable
    /* JADX INFO: renamed from: getLabelViewST, reason: from getter */
    public final BaseTextView getF44184g() {
        return this.f44184g;
    }

    @Nullable
    public final BaseTextView getTradePairView() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((BaseTextView) findViewById(R$id.tv_trade_pair));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (BaseTextView) objM103844constructorimpl;
    }

    @Nullable
    /* JADX INFO: renamed from: getTvQuote, reason: from getter */
    public final BaseTextView getF44180c() {
        return this.f44180c;
    }

    public /* synthetic */ TradePairFlexboxView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TradePairFlexboxView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        Object objM103844constructorimpl3;
        Object objM103844constructorimpl4;
        Object objM103844constructorimpl5;
        Object objM103844constructorimpl6;
        Object objM103844constructorimpl7;
        Object objM103844constructorimpl8;
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44179b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C40839c>() { // from class: com.kubi.resources.widget.TradePairFlexboxView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C40839c invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C40839c.m89374a(C45682f.m100800a(viewGroup));
            }
        });
        try {
            Result.Companion companion = Result.INSTANCE;
            C40839c binding = getBinding();
            objM103844constructorimpl = Result.m103844constructorimpl(binding != null ? binding.f90740n : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        this.f44180c = (BaseTextView) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
        try {
            C40839c binding2 = getBinding();
            objM103844constructorimpl2 = Result.m103844constructorimpl(binding2 != null ? binding2.f90729c : null);
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.INSTANCE;
            objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th3));
        }
        this.f44181d = (View) (Result.m103850isFailureimpl(objM103844constructorimpl2) ? null : objM103844constructorimpl2);
        try {
            C40839c binding3 = getBinding();
            objM103844constructorimpl3 = Result.m103844constructorimpl(binding3 != null ? binding3.f90734h : null);
        } catch (Throwable th4) {
            Result.Companion companion4 = Result.INSTANCE;
            objM103844constructorimpl3 = Result.m103844constructorimpl(ResultKt.createFailure(th4));
        }
        this.f44182e = (BaseTextView) (Result.m103850isFailureimpl(objM103844constructorimpl3) ? null : objM103844constructorimpl3);
        try {
            C40839c binding4 = getBinding();
            objM103844constructorimpl4 = Result.m103844constructorimpl(binding4 != null ? binding4.f90733g : null);
        } catch (Throwable th5) {
            Result.Companion companion5 = Result.INSTANCE;
            objM103844constructorimpl4 = Result.m103844constructorimpl(ResultKt.createFailure(th5));
        }
        this.f44183f = (BaseTextView) (Result.m103850isFailureimpl(objM103844constructorimpl4) ? null : objM103844constructorimpl4);
        try {
            C40839c binding5 = getBinding();
            objM103844constructorimpl5 = Result.m103844constructorimpl(binding5 != null ? binding5.f90737k : null);
        } catch (Throwable th6) {
            Result.Companion companion6 = Result.INSTANCE;
            objM103844constructorimpl5 = Result.m103844constructorimpl(ResultKt.createFailure(th6));
        }
        this.f44184g = (BaseTextView) (Result.m103850isFailureimpl(objM103844constructorimpl5) ? null : objM103844constructorimpl5);
        try {
            C40839c binding6 = getBinding();
            objM103844constructorimpl6 = Result.m103844constructorimpl(binding6 != null ? binding6.f90739m : null);
        } catch (Throwable th7) {
            Result.Companion companion7 = Result.INSTANCE;
            objM103844constructorimpl6 = Result.m103844constructorimpl(ResultKt.createFailure(th7));
        }
        this.f44185h = (BaseTextView) (Result.m103850isFailureimpl(objM103844constructorimpl6) ? null : objM103844constructorimpl6);
        try {
            C40839c binding7 = getBinding();
            objM103844constructorimpl7 = Result.m103844constructorimpl(binding7 != null ? binding7.f90741o : null);
        } catch (Throwable th8) {
            Result.Companion companion8 = Result.INSTANCE;
            objM103844constructorimpl7 = Result.m103844constructorimpl(ResultKt.createFailure(th8));
        }
        this.f44186i = (BaseTextView) (Result.m103850isFailureimpl(objM103844constructorimpl7) ? null : objM103844constructorimpl7);
        try {
            C40839c binding8 = getBinding();
            objM103844constructorimpl8 = Result.m103844constructorimpl(binding8 != null ? binding8.f90732f : null);
        } catch (Throwable th9) {
            Result.Companion companion9 = Result.INSTANCE;
            objM103844constructorimpl8 = Result.m103844constructorimpl(ResultKt.createFailure(th9));
        }
        this.f44187j = (BaseTextView) (Result.m103850isFailureimpl(objM103844constructorimpl8) ? null : objM103844constructorimpl8);
        LayoutInflater.from(context).inflate(R$layout.common_view_flex_tradepair_layout, (ViewGroup) this, true);
        setAlignItems(2);
        setFlexDirection(0);
        setFlexWrap(1);
        setJustifyContent(0);
        setShowDividerHorizontal(2);
        setDividerDrawableHorizontal(AppCompatResources.getDrawable(context, R$drawable.shape_size_height_2));
        BaseTextView baseTextView = (BaseTextView) findViewById(R$id.tv_label_prep);
        if (baseTextView != null) {
            baseTextView.setText(StringsKt.trim((CharSequence) C27017c.f54310a.m66516f(R$string.perpetual_contract, "")).toString());
        }
    }
}
