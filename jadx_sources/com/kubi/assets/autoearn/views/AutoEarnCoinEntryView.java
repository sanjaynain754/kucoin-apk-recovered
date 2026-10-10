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
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.autoearn.views.AutoEarnCoinEntryView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcSwitchButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27041f;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44884v5;
import p852kotlin.Metadata;
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

/* JADX INFO: compiled from: AutoEarnCoinEntryView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0019\u001a\u00020\u0016H\u0003J\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0012J\u0006\u0010\u001c\u001a\u00020\u0012J\u0014\u0010\u001d\u001a\u00020\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018J\u000e\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR+\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, m90084d2 = {"Lcom/kubi/assets/autoearn/views/AutoEarnCoinEntryView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/assets/databinding/ViewAutoEarnCoinEntryBinding;", "getBinding", "()Lcom/kubi/assets/databinding/ViewAutoEarnCoinEntryBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onSwitchChangeCallback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isOn", "", "onTouchCallback", "Lkotlin/Function0;", "initView", "setIsOpen", "isOpen", "getIsOpen", "setOnTouchCallback", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setDesc", FirebaseAnalytics.Param.CURRENCY, "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nAutoEarnCoinEntryView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoEarnCoinEntryView.kt\ncom/kubi/assets/autoearn/views/AutoEarnCoinEntryView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,84:1\n52#2:85\n80#2,7:86\n*S KotlinDebug\n*F\n+ 1 AutoEarnCoinEntryView.kt\ncom/kubi/assets/autoearn/views/AutoEarnCoinEntryView\n*L\n30#1:85\n30#1:86,7\n*E\n"})
public final class AutoEarnCoinEntryView extends FrameLayout {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ KProperty<Object>[] f16592e = {Reflection.property1(new PropertyReference1Impl(AutoEarnCoinEntryView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/ViewAutoEarnCoinEntryBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f16593b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Function1<? super Boolean, Unit> f16594c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public Function0<Unit> f16595d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AutoEarnCoinEntryView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AutoEarnCoinEntryView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: d */
    public static final void m15441d(AutoEarnCoinEntryView autoEarnCoinEntryView, CompoundButton compoundButton, boolean z11) {
        Function1<? super Boolean, Unit> function1 = autoEarnCoinEntryView.f16594c;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z11));
        }
    }

    private final C44884v5 getBinding() {
        return (C44884v5) this.f16593b.getValue(this, f16592e[0]);
    }

    public final void setDesc(@NotNull String currency) {
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(currency, "currency");
        C44884v5 binding = getBinding();
        if (binding == null || (baseTextView = binding.f101016d) == null) {
            return;
        }
        String string = getResources().getString(R$string.kc_auto_earn_detail_page_desc);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str = String.format(string, Arrays.copyOf(new Object[]{C27041f.m66668h(currency)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        baseTextView.setText(str);
    }

    public final void setOnTouchCallback(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f16595d = listener;
    }

    public /* synthetic */ AutoEarnCoinEntryView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m15442e(AutoEarnCoinEntryView autoEarnCoinEntryView, View view, MotionEvent motionEvent) {
        Function0<Unit> function0;
        if (motionEvent.getAction() == 1 && (function0 = autoEarnCoinEntryView.f16595d) != null) {
            function0.invoke();
        }
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: c */
    public final void m15443c() {
        KcSwitchButton kcSwitchButton;
        KcSwitchButton kcSwitchButton2;
        C44884v5 binding = getBinding();
        if (binding != null && (kcSwitchButton2 = binding.f101014b) != null) {
            kcSwitchButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: pa.a
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    AutoEarnCoinEntryView.m15441d(this.f95870b, compoundButton, z11);
                }
            });
        }
        C44884v5 binding2 = getBinding();
        if (binding2 != null && (kcSwitchButton = binding2.f101014b) != null) {
            kcSwitchButton.setOnTouchListener(new View.OnTouchListener() { // from class: pa.b
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return AutoEarnCoinEntryView.m15442e(this.f95871b, view, motionEvent);
                }
            });
        }
    }

    public final boolean getIsOpen() {
        KcSwitchButton kcSwitchButton;
        C44884v5 binding = getBinding();
        if (binding == null || (kcSwitchButton = binding.f101014b) == null || !kcSwitchButton.isChecked()) {
            return false;
        }
        return true;
    }

    public final void setIsOpen(boolean isOpen) {
        KcSwitchButton kcSwitchButton;
        C44884v5 binding = getBinding();
        if (binding != null && (kcSwitchButton = binding.f101014b) != null) {
            kcSwitchButton.setChecked(isOpen);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AutoEarnCoinEntryView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16593b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44884v5>() { // from class: com.kubi.assets.autoearn.views.AutoEarnCoinEntryView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44884v5 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44884v5.m99292a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.view_auto_earn_coin_entry, this);
        m15443c();
    }
}
