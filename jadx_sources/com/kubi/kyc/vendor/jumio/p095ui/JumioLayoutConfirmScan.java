package com.kubi.kyc.vendor.jumio.p095ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.jumio.sdk.enums.JumioCredentialPart;
import com.jumio.sdk.exceptions.SDKNotConfiguredException;
import com.jumio.sdk.handler.JumioConfirmationHandler;
import com.jumio.sdk.scanpart.JumioScanPart;
import com.jumio.sdk.views.JumioConfirmationView;
import com.kubi.kyc.R$layout;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205dn.C36893m;
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

/* JADX INFO: compiled from: JumioLayoutConfirmScan.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0006\u0010\u0016\u001a\u00020\u0015J\b\u0010\u0017\u001a\u00020\u0015H\u0002R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/kyc/vendor/jumio/ui/JumioLayoutConfirmScan;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "viewBinding", "Lcom/kubi/kyc/databinding/LayoutJumioConfirmScanBinding;", "getViewBinding", "()Lcom/kubi/kyc/databinding/LayoutJumioConfirmScanBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "confirmationHandler", "Lcom/jumio/sdk/handler/JumioConfirmationHandler;", "scanPart", "Lcom/jumio/sdk/scanpart/JumioScanPart;", TIMPushProvider.f75062n, "", TIMPushProvider.f75063o, "initView", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJumioLayoutConfirmScan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JumioLayoutConfirmScan.kt\ncom/kubi/kyc/vendor/jumio/ui/JumioLayoutConfirmScan\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n52#2:71\n80#2,7:72\n1869#3,2:79\n*S KotlinDebug\n*F\n+ 1 JumioLayoutConfirmScan.kt\ncom/kubi/kyc/vendor/jumio/ui/JumioLayoutConfirmScan\n*L\n30#1:71\n30#1:72,7\n46#1:79,2\n*E\n"})
public final class JumioLayoutConfirmScan extends FrameLayout {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ KProperty<Object>[] f31605e = {Reflection.property1(new PropertyReference1Impl(JumioLayoutConfirmScan.class, "viewBinding", "getViewBinding()Lcom/kubi/kyc/databinding/LayoutJumioConfirmScanBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f31606b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final JumioConfirmationHandler f31607c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public JumioScanPart f31608d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JumioLayoutConfirmScan(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JumioLayoutConfirmScan(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m37324j(JumioLayoutConfirmScan jumioLayoutConfirmScan) throws SDKNotConfiguredException {
        JumioScanPart jumioScanPart = jumioLayoutConfirmScan.f31608d;
        if (jumioScanPart != null) {
            jumioScanPart.finish();
        }
        jumioLayoutConfirmScan.f31608d = null;
        return Unit.INSTANCE;
    }

    @Nullable
    public final C36893m getViewBinding() {
        return (C36893m) this.f31606b.getValue(this, f31605e[0]);
    }

    /* JADX INFO: renamed from: k */
    public final void m37327k(@Nullable JumioScanPart jumioScanPart) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        if (jumioScanPart == null) {
            return;
        }
        this.f31608d = jumioScanPart;
        setVisibility(0);
        C36893m viewBinding = getViewBinding();
        if (viewBinding != null && (linearLayout2 = viewBinding.f81500c) != null) {
            linearLayout2.removeAllViews();
        }
        this.f31607c.attach(jumioScanPart);
        for (JumioCredentialPart jumioCredentialPart : this.f31607c.getParts()) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            JumioConfirmationView jumioConfirmationView = new JumioConfirmationView(context, null, 0, 0, 14, null);
            this.f31607c.renderPart(jumioCredentialPart, jumioConfirmationView);
            C36893m viewBinding2 = getViewBinding();
            if (viewBinding2 != null && (linearLayout = viewBinding2.f81500c) != null) {
                linearLayout.addView(jumioConfirmationView);
            }
        }
    }

    public /* synthetic */ JumioLayoutConfirmScan(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m37321g(JumioLayoutConfirmScan jumioLayoutConfirmScan) {
        TextView textView;
        C36893m viewBinding = jumioLayoutConfirmScan.getViewBinding();
        if (viewBinding != null && (textView = viewBinding.f81502e) != null) {
            textView.performClick();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m37322h(JumioLayoutConfirmScan jumioLayoutConfirmScan) {
        jumioLayoutConfirmScan.m37325e();
        jumioLayoutConfirmScan.f31607c.retake();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m37323i(final JumioLayoutConfirmScan jumioLayoutConfirmScan) {
        jumioLayoutConfirmScan.m37325e();
        jumioLayoutConfirmScan.f31607c.confirm();
        C27100x0.m66924e(new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JumioLayoutConfirmScan.m37324j(this.f31696b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public final void m37325e() {
        ViewExtKt.m66577h(this);
    }

    /* JADX INFO: renamed from: f */
    public final void m37326f() {
        KcPrimaryButton kcPrimaryButton;
        TextView textView;
        ImageView imageView;
        C36893m viewBinding = getViewBinding();
        if (viewBinding != null && (imageView = viewBinding.f81501d) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.w
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return JumioLayoutConfirmScan.m37321g(this.f31691b);
                }
            }, 1, null);
        }
        C36893m viewBinding2 = getViewBinding();
        if (viewBinding2 != null && (textView = viewBinding2.f81502e) != null) {
            C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.x
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return JumioLayoutConfirmScan.m37322h(this.f31692b);
                }
            }, 1, null);
        }
        C36893m viewBinding3 = getViewBinding();
        if (viewBinding3 != null && (kcPrimaryButton = viewBinding3.f81499b) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.y
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return JumioLayoutConfirmScan.m37323i(this.f31694b);
                }
            }, 1, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JumioLayoutConfirmScan(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31606b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C36893m>() { // from class: com.kubi.kyc.vendor.jumio.ui.JumioLayoutConfirmScan$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C36893m invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C36893m.m82655a(C45682f.m100800a(viewGroup));
            }
        });
        this.f31607c = new JumioConfirmationHandler();
        LayoutInflater.from(context).inflate(R$layout.layout_jumio_confirm_scan, (ViewGroup) this, true);
        m37326f();
    }
}
