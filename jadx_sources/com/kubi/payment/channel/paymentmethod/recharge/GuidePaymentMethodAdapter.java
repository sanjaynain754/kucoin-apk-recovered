package com.kubi.payment.channel.paymentmethod.recharge;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AsyncDifferConfig;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.payment.channel.data.entities.GuidePayment;
import com.kubi.payment.util.C21457l;
import com.kubi.sdk.adapter.KcBaseDifferAdapter;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33954u6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37627h0;
import p275fy.C37728a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GuidePaymentMethodAdapter.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u0007\u001a\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\b0\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J(\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0002¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/payment/channel/paymentmethod/recharge/GuidePaymentMethodAdapter;", "Lcom/kubi/sdk/adapter/KcBaseDifferAdapter;", "Lcom/kubi/payment/channel/data/entities/GuidePayment$PaymentMethod;", "Lcom/kubi/sdk/adapter/BaseQuickVH;", "Lcom/kubi/otc/databinding/GuidePaymentMethodItemBinding;", "<init>", "()V", "onCreateViewHolder", "Lkotlin/jvm/internal/EnhancedNullability;", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", C33954u6.f72238i, ViewProps.POSITION, "item", "bind", "binding", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class GuidePaymentMethodAdapter extends KcBaseDifferAdapter<GuidePayment.PaymentMethod, C37728a<C37627h0>> {
    /* JADX WARN: Illegal instructions before constructor call */
    public GuidePaymentMethodAdapter() {
        AsyncDifferConfig asyncDifferConfigBuild = new AsyncDifferConfig.Builder(new GuidePaymentMethodCallback()).build();
        Intrinsics.checkNotNullExpressionValue(asyncDifferConfigBuild, "build(...)");
        super(asyncDifferConfigBuild, CollectionsKt.emptyList());
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m45839p(C37627h0 c37627h0, GuidePayment.PaymentMethod paymentMethod) {
        c37627h0.f83949d.setText(paymentMethod.getDesc());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public final void m45840n(final C37627h0 c37627h0, int i11, final GuidePayment.PaymentMethod paymentMethod) {
        if (paymentMethod != null) {
            ImageView ivPaymentIcon = c37627h0.f83948c;
            Intrinsics.checkNotNullExpressionValue(ivPaymentIcon, "ivPaymentIcon");
            C21457l.m49854b(ivPaymentIcon, getContext(), paymentMethod.getIconUrl());
            c37627h0.f83950e.setText(C27041f.m66668h(paymentMethod.getName()));
            C21457l.m49858f(new Function0() { // from class: com.kubi.payment.channel.paymentmethod.recharge.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(GuidePaymentMethodAdapter.m45838o(paymentMethod));
                }
            }, new View[]{c37627h0.f83949d}, new Function0() { // from class: com.kubi.payment.channel.paymentmethod.recharge.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GuidePaymentMethodAdapter.m45839p(c37627h0, paymentMethod);
                }
            });
            ConstraintLayout root = c37627h0.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            C27046k.m66692g(root, C27040e.m66658b(i11 > 0 ? 16 : 8));
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C37728a<C37627h0> holder, int i11, @Nullable GuidePayment.PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        m45840n((C37627h0) holder.m85032b(), i11, paymentMethod);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @NotNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C37728a<C37627h0> onCreateViewHolder(@NotNull Context context, @NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        C37627h0 c37627h0M84836c = C37627h0.m84836c(LayoutInflater.from(context), parent, false);
        Intrinsics.checkNotNullExpressionValue(c37627h0M84836c, "inflate(...)");
        return new C37728a<>(c37627h0M84836c);
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m45838o(GuidePayment.PaymentMethod paymentMethod) {
        boolean z11;
        String desc = paymentMethod.getDesc();
        if (desc != null && desc.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        return !z11;
    }
}
