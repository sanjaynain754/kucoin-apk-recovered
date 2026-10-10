package com.kubi.assets.autoearn.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.autoearn.AutoEarnOpenDialog;
import com.kubi.assets.autoearn.views.AutoEarnEntryView;
import com.kubi.resources.widget.KcSwitchButton;
import com.kubi.router.core.Router;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44891w5;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
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

/* JADX INFO: compiled from: AutoEarnEntryView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\"B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u001a\u001a\u00020\u0016H\u0003J\u0010\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0014\u0010\u001e\u001a\u00020\u00162\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018J\u0014\u0010 \u001a\u00020\u00162\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018J\u0006\u0010!\u001a\u00020\u0012R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR+\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Lcom/kubi/assets/autoearn/views/AutoEarnEntryView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/assets/databinding/ViewAutoEarnEntryBinding;", "getBinding", "()Lcom/kubi/assets/databinding/ViewAutoEarnEntryBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onSwitchChangeCallback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isOn", "", "onTouchCallback", "Lkotlin/Function0;", "onManageClick", "initView", "setStyle", "status", "", "setOnTouchCallback", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setManageClick", "getSwitchState", "Style", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nAutoEarnEntryView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoEarnEntryView.kt\ncom/kubi/assets/autoearn/views/AutoEarnEntryView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,166:1\n52#2:167\n80#2,7:168\n*S KotlinDebug\n*F\n+ 1 AutoEarnEntryView.kt\ncom/kubi/assets/autoearn/views/AutoEarnEntryView\n*L\n42#1:167\n42#1:168,7\n*E\n"})
public final class AutoEarnEntryView extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ KProperty<Object>[] f16596f = {Reflection.property1(new PropertyReference1Impl(AutoEarnEntryView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/ViewAutoEarnEntryBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f16597b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Function1<? super Boolean, Unit> f16598c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public Function0<Unit> f16599d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public Function0<Unit> f16600e;

    /* JADX INFO: renamed from: com.kubi.assets.autoearn.views.AutoEarnEntryView$a */
    /* JADX INFO: compiled from: AutoEarnEntryView.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/autoearn/views/AutoEarnEntryView$Style;", "", "<init>", "()V", "Closed", "PartOpen", "AllOpen", "Unavailable", "Lcom/kubi/assets/autoearn/views/AutoEarnEntryView$Style$AllOpen;", "Lcom/kubi/assets/autoearn/views/AutoEarnEntryView$Style$Closed;", "Lcom/kubi/assets/autoearn/views/AutoEarnEntryView$Style$PartOpen;", "Lcom/kubi/assets/autoearn/views/AutoEarnEntryView$Style$Unavailable;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static abstract class AbstractC9531a {

        /* JADX INFO: renamed from: com.kubi.assets.autoearn.views.AutoEarnEntryView$a$a */
        /* JADX INFO: compiled from: AutoEarnEntryView.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/assets/autoearn/views/AutoEarnEntryView$Style$AllOpen;", "Lcom/kubi/assets/autoearn/views/AutoEarnEntryView$Style;", "<init>", "()V", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a extends AbstractC9531a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final a f16601a = new a();

            public a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.kubi.assets.autoearn.views.AutoEarnEntryView$a$b */
        /* JADX INFO: compiled from: AutoEarnEntryView.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/assets/autoearn/views/AutoEarnEntryView$Style$Closed;", "Lcom/kubi/assets/autoearn/views/AutoEarnEntryView$Style;", "<init>", "()V", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class b extends AbstractC9531a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final b f16602a = new b();

            public b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.kubi.assets.autoearn.views.AutoEarnEntryView$a$c */
        /* JADX INFO: compiled from: AutoEarnEntryView.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/assets/autoearn/views/AutoEarnEntryView$Style$PartOpen;", "Lcom/kubi/assets/autoearn/views/AutoEarnEntryView$Style;", "<init>", "()V", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class c extends AbstractC9531a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final c f16603a = new c();

            public c() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.kubi.assets.autoearn.views.AutoEarnEntryView$a$d */
        /* JADX INFO: compiled from: AutoEarnEntryView.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/assets/autoearn/views/AutoEarnEntryView$Style$Unavailable;", "Lcom/kubi/assets/autoearn/views/AutoEarnEntryView$Style;", "<init>", "()V", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class d extends AbstractC9531a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final d f16604a = new d();

            public d() {
                super(null);
            }
        }

        public /* synthetic */ AbstractC9531a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public AbstractC9531a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AutoEarnEntryView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AutoEarnEntryView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m15448f(AutoEarnEntryView autoEarnEntryView) {
        Router.f46192a.m56184f(AutoEarnOpenDialog.f16556x0.getAUTO_EARN_MANAGE_URL()).m4048k();
        Function0<Unit> function0 = autoEarnEntryView.f16600e;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m15449g(AutoEarnEntryView autoEarnEntryView) {
        Router.f46192a.m56184f(AutoEarnOpenDialog.f16556x0.getAUTO_EARN_MANAGE_URL()).m4048k();
        Function0<Unit> function0 = autoEarnEntryView.f16600e;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    private final C44891w5 getBinding() {
        return (C44891w5) this.f16597b.getValue(this, f16596f[0]);
    }

    /* JADX INFO: renamed from: h */
    public static final void m15450h(AutoEarnEntryView autoEarnEntryView, CompoundButton compoundButton, boolean z11) {
        Function1<? super Boolean, Unit> function1 = autoEarnEntryView.f16598c;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z11));
        }
    }

    public final void setManageClick(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f16600e = listener;
    }

    public final void setOnTouchCallback(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f16599d = listener;
    }

    public /* synthetic */ AutoEarnEntryView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m15451i(AutoEarnEntryView autoEarnEntryView, View view, MotionEvent motionEvent) {
        Function0<Unit> function0;
        if (motionEvent.getAction() == 1 && (function0 = autoEarnEntryView.f16599d) != null) {
            function0.invoke();
        }
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: e */
    public final void m15452e() {
        KcSwitchButton kcSwitchButton;
        KcSwitchButton kcSwitchButton2;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        C44891w5 binding = getBinding();
        if (binding != null && (linearLayout2 = binding.f101090e) != null) {
            C27046k.m66711z(linearLayout2, 0L, new Function0() { // from class: pa.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AutoEarnEntryView.m15448f(this.f95872b);
                }
            }, 1, null);
        }
        C44891w5 binding2 = getBinding();
        if (binding2 != null && (linearLayout = binding2.f101091f) != null) {
            C27046k.m66711z(linearLayout, 0L, new Function0() { // from class: pa.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AutoEarnEntryView.m15449g(this.f95873b);
                }
            }, 1, null);
        }
        C44891w5 binding3 = getBinding();
        if (binding3 != null && (kcSwitchButton2 = binding3.f101087b) != null) {
            kcSwitchButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: pa.e
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    AutoEarnEntryView.m15450h(this.f95874b, compoundButton, z11);
                }
            });
        }
        C44891w5 binding4 = getBinding();
        if (binding4 != null && (kcSwitchButton = binding4.f101087b) != null) {
            kcSwitchButton.setOnTouchListener(new View.OnTouchListener() { // from class: pa.f
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return AutoEarnEntryView.m15451i(this.f95875b, view, motionEvent);
                }
            });
        }
    }

    public final boolean getSwitchState() {
        Boolean boolValueOf;
        KcSwitchButton kcSwitchButton;
        C44891w5 binding = getBinding();
        if (binding != null && (kcSwitchButton = binding.f101087b) != null) {
            boolValueOf = Boolean.valueOf(kcSwitchButton.isChecked());
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    public final void setStyle(@Nullable String status) {
        ConstraintLayout root;
        AbstractC9531a abstractC9531aM15454b = C9532a.m15454b(C27041f.m66668h(status));
        if (Intrinsics.areEqual(abstractC9531aM15454b, AbstractC9531a.b.f16602a)) {
            C44891w5 binding = getBinding();
            if (binding != null) {
                LinearLayout llManage1 = binding.f101090e;
                Intrinsics.checkNotNullExpressionValue(llManage1, "llManage1");
                ViewExtKt.m66577h(llManage1);
                LinearLayout llManage2 = binding.f101091f;
                Intrinsics.checkNotNullExpressionValue(llManage2, "llManage2");
                ViewExtKt.m66594y(llManage2);
                KcSwitchButton autoEarnSwitch = binding.f101087b;
                Intrinsics.checkNotNullExpressionValue(autoEarnSwitch, "autoEarnSwitch");
                ViewExtKt.m66594y(autoEarnSwitch);
                binding.f101087b.setChecked(false);
                ShapeTextView tvStatusLabel = binding.f101095j;
                Intrinsics.checkNotNullExpressionValue(tvStatusLabel, "tvStatusLabel");
                ViewExtKt.m66577h(tvStatusLabel);
                ShapeTextView tvStatusLabelNotOpen = binding.f101096k;
                Intrinsics.checkNotNullExpressionValue(tvStatusLabelNotOpen, "tvStatusLabelNotOpen");
                ViewExtKt.m66594y(tvStatusLabelNotOpen);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(abstractC9531aM15454b, AbstractC9531a.a.f16601a)) {
            C44891w5 binding2 = getBinding();
            if (binding2 != null) {
                LinearLayout llManage3 = binding2.f101090e;
                Intrinsics.checkNotNullExpressionValue(llManage3, "llManage1");
                ViewExtKt.m66594y(llManage3);
                LinearLayout llManage4 = binding2.f101091f;
                Intrinsics.checkNotNullExpressionValue(llManage4, "llManage2");
                ViewExtKt.m66577h(llManage4);
                KcSwitchButton autoEarnSwitch2 = binding2.f101087b;
                Intrinsics.checkNotNullExpressionValue(autoEarnSwitch2, "autoEarnSwitch");
                ViewExtKt.m66577h(autoEarnSwitch2);
                binding2.f101087b.setChecked(true);
                ShapeTextView tvStatusLabel2 = binding2.f101095j;
                Intrinsics.checkNotNullExpressionValue(tvStatusLabel2, "tvStatusLabel");
                ViewExtKt.m66594y(tvStatusLabel2);
                ShapeTextView tvStatusLabelNotOpen2 = binding2.f101096k;
                Intrinsics.checkNotNullExpressionValue(tvStatusLabelNotOpen2, "tvStatusLabelNotOpen");
                ViewExtKt.m66577h(tvStatusLabelNotOpen2);
                binding2.f101095j.setText(getResources().getString(R$string.kc_auto_earn_all_open));
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(abstractC9531aM15454b, AbstractC9531a.c.f16603a)) {
            C44891w5 binding3 = getBinding();
            if (binding3 != null) {
                LinearLayout llManage5 = binding3.f101090e;
                Intrinsics.checkNotNullExpressionValue(llManage5, "llManage1");
                ViewExtKt.m66594y(llManage5);
                LinearLayout llManage6 = binding3.f101091f;
                Intrinsics.checkNotNullExpressionValue(llManage6, "llManage2");
                ViewExtKt.m66577h(llManage6);
                KcSwitchButton autoEarnSwitch3 = binding3.f101087b;
                Intrinsics.checkNotNullExpressionValue(autoEarnSwitch3, "autoEarnSwitch");
                ViewExtKt.m66577h(autoEarnSwitch3);
                binding3.f101087b.setChecked(true);
                ShapeTextView tvStatusLabel3 = binding3.f101095j;
                Intrinsics.checkNotNullExpressionValue(tvStatusLabel3, "tvStatusLabel");
                ViewExtKt.m66594y(tvStatusLabel3);
                ShapeTextView tvStatusLabelNotOpen3 = binding3.f101096k;
                Intrinsics.checkNotNullExpressionValue(tvStatusLabelNotOpen3, "tvStatusLabelNotOpen");
                ViewExtKt.m66577h(tvStatusLabelNotOpen3);
                binding3.f101095j.setText(getResources().getString(R$string.kc_auto_earn_part_open));
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(abstractC9531aM15454b, AbstractC9531a.d.f16604a)) {
            C44891w5 binding4 = getBinding();
            if (binding4 != null && (root = binding4.getRoot()) != null) {
                ViewExtKt.m66577h(root);
                return;
            }
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AutoEarnEntryView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16597b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44891w5>() { // from class: com.kubi.assets.autoearn.views.AutoEarnEntryView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44891w5 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44891w5.m99306a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.view_auto_earn_entry, this);
        m15452e();
    }
}
