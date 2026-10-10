package com.kubi.profit.loss.analysis.lib;

import android.view.View;
import androidx.core.content.ContextCompat;
import com.kubi.mvi.common.C19244f;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import su.C44547c;

/* JADX INFO: compiled from: AssetsRangeTypeListAdapter.kt */
/* JADX INFO: loaded from: classes35.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/profit/loss/analysis/lib/AssetsRangeTypeListAdapterViewHolder;", "Lio/chad/library/adapter/base/BaseViewHolder;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "vb", "Lcom/kubi/profit/loss/analysis/lib/databinding/ItemRangeBinding;", "getVb", "()Lcom/kubi/profit/loss/analysis/lib/databinding/ItemRangeBinding;", "vb$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "bindData", "", "item", "Lcom/kubi/profit/loss/analysis/lib/RangeType;", "itemCount", "", "ProfitLossAnalysisLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetsRangeTypeListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetsRangeTypeListAdapter.kt\ncom/kubi/profit/loss/analysis/lib/AssetsRangeTypeListAdapterViewHolder\n+ 2 ViewHolderBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewHolderBindings\n*L\n1#1,69:1\n18#2,5:70\n*S KotlinDebug\n*F\n+ 1 AssetsRangeTypeListAdapter.kt\ncom/kubi/profit/loss/analysis/lib/AssetsRangeTypeListAdapterViewHolder\n*L\n35#1:70,5\n*E\n"})
public final class AssetsRangeTypeListAdapterViewHolder extends BaseViewHolder {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ KProperty<Object>[] f40631i = {Reflection.property1(new PropertyReference1Impl(AssetsRangeTypeListAdapterViewHolder.class, "vb", "getVb()Lcom/kubi/profit/loss/analysis/lib/databinding/ItemRangeBinding;", 0))};

    /* JADX INFO: renamed from: g */
    @NotNull
    public final View f40632g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final InterfaceC24293a f40633h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetsRangeTypeListAdapterViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.f40632g = view;
        this.f40633h = new LazyViewBindingProperty(new Function1<AssetsRangeTypeListAdapterViewHolder, C44547c>() { // from class: com.kubi.profit.loss.analysis.lib.AssetsRangeTypeListAdapterViewHolder$special$$inlined$viewBinding$default$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44547c invoke(@NotNull AssetsRangeTypeListAdapterViewHolder viewHolder) {
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                return C44547c.m98613a(viewHolder.itemView);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m50049a(@Nullable RangeType rangeType, int i11) {
        C44547c c44547cM50050b;
        if (rangeType == null || (c44547cM50050b = m50050b()) == null) {
            return;
        }
        View endDivider = c44547cM50050b.f98767b;
        Intrinsics.checkNotNullExpressionValue(endDivider, "endDivider");
        C19244f.m42542a(endDivider, rangeType.getEndDividerVisible());
        c44547cM50050b.f98768c.setTextColor(ContextCompat.getColor(this.f40632g.getContext(), rangeType.getSelectColor()));
        c44547cM50050b.f98768c.setText(rangeType.getName());
        if (rangeType.getSelected()) {
            c44547cM50050b.f98768c.getShapeDrawableBuilder().m92151m(ContextCompat.getColor(this.f40632g.getContext(), R$color.c_cover4));
        } else {
            c44547cM50050b.f98768c.getShapeDrawableBuilder().m92151m(ContextCompat.getColor(this.f40632g.getContext(), R$color.c_transparent));
        }
        c44547cM50050b.f98768c.getShapeDrawableBuilder().m92143e();
    }

    /* JADX INFO: renamed from: b */
    public final C44547c m50050b() {
        return (C44547c) this.f40633h.getValue(this, f40631i[0]);
    }
}
