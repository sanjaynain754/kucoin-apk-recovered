package com.kubi.margin.market.rank;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.margin.R$layout;
import com.kubi.margin.entity.Tag;
import com.kubi.margin.market.rank.MarginRankBottomSheetDialog;
import com.kubi.resources.dialog.GravityDialogFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36917i;
import p852kotlin.Lazy;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;

/* JADX INFO: compiled from: MarginRankBottomSheetDialog.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0014\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, m90084d2 = {"Lcom/kubi/margin/market/rank/MarginRankBottomSheetDialog;", "Lcom/kubi/resources/dialog/GravityDialogFragment;", "data", "", "Lcom/kubi/margin/entity/Tag;", "symbol", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getData", "()Ljava/util/List;", "getSymbol", "()Ljava/lang/String;", "bmarginDialogMarketRankBinding", "Lcom/kubi/margin/databinding/BmarginDialogMarketRankBinding;", "getBmarginDialogMarketRankBinding", "()Lcom/kubi/margin/databinding/BmarginDialogMarketRankBinding;", "bmarginDialogMarketRankBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mAdapter", "com/kubi/margin/market/rank/MarginRankBottomSheetDialog$mAdapter$2$1", "getMAdapter", "()Lcom/kubi/margin/market/rank/MarginRankBottomSheetDialog$mAdapter$2$1;", "mAdapter$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginRankBottomSheetDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginRankBottomSheetDialog.kt\ncom/kubi/margin/market/rank/MarginRankBottomSheetDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,98:1\n143#2,20:99\n*S KotlinDebug\n*F\n+ 1 MarginRankBottomSheetDialog.kt\ncom/kubi/margin/market/rank/MarginRankBottomSheetDialog\n*L\n30#1:99,20\n*E\n"})
public final class MarginRankBottomSheetDialog extends GravityDialogFragment {

    /* JADX INFO: renamed from: g0 */
    public static final /* synthetic */ KProperty<Object>[] f33400g0 = {Reflection.property1(new PropertyReference1Impl(MarginRankBottomSheetDialog.class, "bmarginDialogMarketRankBinding", "getBmarginDialogMarketRankBinding()Lcom/kubi/margin/databinding/BmarginDialogMarketRankBinding;", 0))};

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final List<Tag> f33401c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final String f33402d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final InterfaceC24293a f33403e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final Lazy f33404f0;

    /* JADX INFO: renamed from: A3 */
    public final C36917i m39138A3() {
        return (C36917i) this.f33403e0.getValue(this, f33400g0[0]);
    }

    /* JADX INFO: renamed from: B3 */
    public final MarginRankBottomSheetDialog$mAdapter$2$1 m39139B3() {
        return (MarginRankBottomSheetDialog$mAdapter$2$1) this.f33404f0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: C3, reason: from getter */
    public final String getF33402d0() {
        return this.f33402d0;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bmargin_dialog_market_rank, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView;
        AppCompatImageView appCompatImageView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36917i c36917iM39138A3 = m39138A3();
        if (c36917iM39138A3 != null && (appCompatImageView = c36917iM39138A3.f81732b) != null) {
            C27046k.m66711z(appCompatImageView, 0L, new Function0() { // from class: jp.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginRankBottomSheetDialog.m39136D3(this.f89842b);
                }
            }, 1, null);
        }
        C36917i c36917iM39138A4 = m39138A3();
        if (c36917iM39138A4 != null && (recyclerView = c36917iM39138A4.f81733c) != null) {
            recyclerView.setAdapter(m39139B3());
        }
        m39139B3().replaceData(this.f33401c0);
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m39136D3(MarginRankBottomSheetDialog marginRankBottomSheetDialog) {
        marginRankBottomSheetDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m54250y3(0);
    }
}
