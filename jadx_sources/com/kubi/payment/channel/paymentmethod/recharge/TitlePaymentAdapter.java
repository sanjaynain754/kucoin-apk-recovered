package com.kubi.payment.channel.paymentmethod.recharge;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.sdk.adapter.KcBaseDifferAdapter;
import com.tencent.bugly.proguard.C33954u6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37622g0;
import p275fy.C37728a;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TitlePaymentAdapter.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0014J+\u0010\r\u001a\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u000e0\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0014¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/payment/channel/paymentmethod/recharge/TitlePaymentAdapter;", "Lcom/kubi/sdk/adapter/KcBaseDifferAdapter;", "", "Lcom/kubi/sdk/adapter/BaseQuickVH;", "Lcom/kubi/otc/databinding/CommonPaymentTitleItemLayoutBinding;", "<init>", "()V", "onBindViewHolder", "", C33954u6.f72238i, ViewProps.POSITION, "", "item", "onCreateViewHolder", "Lkotlin/jvm/internal/EnhancedNullability;", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", "viewType", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TitlePaymentAdapter extends KcBaseDifferAdapter<String, C37728a<C37622g0>> {

    /* JADX INFO: renamed from: com.kubi.payment.channel.paymentmethod.recharge.TitlePaymentAdapter$a */
    /* JADX INFO: compiled from: TitlePaymentAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/payment/channel/paymentmethod/recharge/TitlePaymentAdapter$1", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20349a extends DiffUtil.ItemCallback<String> {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(String oldItem, String newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(String oldItem, String newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TitlePaymentAdapter() {
        AsyncDifferConfig asyncDifferConfigBuild = new AsyncDifferConfig.Builder(new C20349a()).build();
        Intrinsics.checkNotNullExpressionValue(asyncDifferConfigBuild, "build(...)");
        super(asyncDifferConfigBuild, CollectionsKt.emptyList());
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C37728a<C37622g0> holder, int i11, @Nullable String str) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((C37622g0) holder.m85032b()).f83902b.setText(str);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C37728a<C37622g0> onCreateViewHolder(@NotNull Context context, @NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        C37622g0 c37622g0M84825c = C37622g0.m84825c(LayoutInflater.from(context), parent, false);
        Intrinsics.checkNotNullExpressionValue(c37622g0M84825c, "inflate(...)");
        return new C37728a<>(c37622g0M84825c);
    }
}
