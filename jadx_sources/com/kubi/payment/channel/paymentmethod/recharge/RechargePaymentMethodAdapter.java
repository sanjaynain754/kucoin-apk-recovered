package com.kubi.payment.channel.paymentmethod.recharge;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.AsyncDifferConfig;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$string;
import com.kubi.payment.channel.data.entities.PaymentMethod;
import com.kubi.payment.util.C21457l;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.adapter.KcBaseDifferAdapter;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33954u6;
import f00.C37304a;
import g00.InterfaceC37766r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37679r2;
import p275fy.C37728a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: RechargePaymentMethodAdapter.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014J(\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0014J \u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/payment/channel/paymentmethod/recharge/RechargePaymentMethodAdapter;", "Lcom/kubi/sdk/adapter/KcBaseDifferAdapter;", "Lcom/kubi/payment/channel/data/entities/PaymentMethod;", "Lcom/kubi/sdk/adapter/BaseQuickVH;", "Lcom/kubi/otc/databinding/PaymentItemRechargePaymentMethodBinding;", "<init>", "()V", "onCreateViewHolder", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", C33954u6.f72238i, ViewProps.POSITION, "item", "bind", "binding", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RechargePaymentMethodAdapter extends KcBaseDifferAdapter<PaymentMethod, C37728a<C37679r2>> {
    /* JADX WARN: Illegal instructions before constructor call */
    public RechargePaymentMethodAdapter() {
        AsyncDifferConfig asyncDifferConfigBuild = new AsyncDifferConfig.Builder(new RechargePaymentMethodItemCallback()).build();
        Intrinsics.checkNotNullExpressionValue(asyncDifferConfigBuild, "build(...)");
        super(asyncDifferConfigBuild, CollectionsKt.emptyList());
    }

    /* JADX INFO: renamed from: m */
    public final void m45845m(C37679r2 c37679r2, int i11, PaymentMethod paymentMethod) {
        AppCompatImageView ivIcon = c37679r2.f84591c;
        Intrinsics.checkNotNullExpressionValue(ivIcon, "ivIcon");
        C21457l.m49854b(ivIcon, getContext(), paymentMethod.getIconUrl());
        c37679r2.f84594f.setText(C27041f.m66668h(paymentMethod.getTitle()));
        String strM66668h = C27041f.m66668h(paymentMethod.getDescription());
        c37679r2.f84592d.setText(strM66668h);
        if (StringsKt.isBlank(strM66668h)) {
            BaseTextView tvDescription = c37679r2.f84592d;
            Intrinsics.checkNotNullExpressionValue(tvDescription, "tvDescription");
            C27046k.m66700o(tvDescription);
        } else {
            BaseTextView tvDescription2 = c37679r2.f84592d;
            Intrinsics.checkNotNullExpressionValue(tvDescription2, "tvDescription");
            C27046k.m66685H(tvDescription2);
        }
        String strM66668h2 = C27041f.m66668h(paymentMethod.getEventContent());
        c37679r2.f84593e.setText(strM66668h2);
        if (StringsKt.isBlank(strM66668h2)) {
            BaseTextView tvHint = c37679r2.f84593e;
            Intrinsics.checkNotNullExpressionValue(tvHint, "tvHint");
            C27046k.m66700o(tvHint);
        } else {
            BaseTextView tvHint2 = c37679r2.f84593e;
            Intrinsics.checkNotNullExpressionValue(tvHint2, "tvHint");
            C27046k.m66685H(tvHint2);
        }
        final String strM66668h3 = C27041f.m66668h(paymentMethod.getEventHref());
        BaseTextView tvHint3 = c37679r2.f84593e;
        Intrinsics.checkNotNullExpressionValue(tvHint3, "tvHint");
        C27046k.m66711z(tvHint3, 0L, new Function0() { // from class: com.kubi.payment.channel.paymentmethod.recharge.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RechargePaymentMethodAdapter.m45844n(strM66668h3);
            }
        }, 1, null);
        if (paymentMethod.isEnabled()) {
            c37679r2.f84591c.setAlpha(1.0f);
            c37679r2.f84594f.setAlpha(1.0f);
            c37679r2.f84592d.setAlpha(1.0f);
            c37679r2.f84595g.setTextColor(ContextCompat.getColor(getContext(), R$color.brandGreen));
            c37679r2.f84595g.setBackgroundResource(R$drawable.shape_primary8_4r);
            c37679r2.f84595g.setText(C27041f.m66668h(paymentMethod.getFeeMessage()));
        } else {
            c37679r2.f84591c.setAlpha(0.4f);
            c37679r2.f84594f.setAlpha(0.4f);
            c37679r2.f84592d.setAlpha(0.4f);
            c37679r2.f84595g.setTextColor(ContextCompat.getColor(getContext(), R$color.c_text40));
            c37679r2.f84595g.setBackgroundResource(R$drawable.shape_cover4_4r);
            c37679r2.f84595g.setText(ContextCompat.getString(getContext(), R$string.fiat_channel_unavailable));
        }
        ConstraintLayout root = c37679r2.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        C27046k.m66692g(root, C27040e.m66658b(i11 > 0 ? 16 : 8));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C37728a<C37679r2> holder, int i11, @Nullable PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (paymentMethod == null) {
            return;
        }
        m45845m((C37679r2) holder.m85032b(), i11, paymentMethod);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public C37728a<C37679r2> onCreateViewHolder(@NotNull Context context, @NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        C37679r2 c37679r2M84947c = C37679r2.m84947c(LayoutInflater.from(context), parent, false);
        Intrinsics.checkNotNullExpressionValue(c37679r2M84947c, "inflate(...)");
        return new C37728a<>(c37679r2M84947c);
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m45844n(String str) {
        if (!StringsKt.isBlank(str)) {
            InterfaceC37766r.a.m85190a(C37304a.f82764a, str, null, null, null, null, null, null, 126, null);
        }
        return Unit.INSTANCE;
    }
}
