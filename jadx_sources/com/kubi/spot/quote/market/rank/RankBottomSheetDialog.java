package com.kubi.spot.quote.market.rank;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.resources.dialog.GravityDialogFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.R$layout;
import com.kubi.spot.entity.Tag;
import com.kubi.spot.quote.market.rank.RankBottomSheetDialog;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import t20.C44634d;

/* JADX INFO: compiled from: RankBottomSheetDialog.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0014\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, m90084d2 = {"Lcom/kubi/spot/quote/market/rank/RankBottomSheetDialog;", "Lcom/kubi/resources/dialog/GravityDialogFragment;", "data", "", "Lcom/kubi/spot/entity/Tag;", "symbol", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getData", "()Ljava/util/List;", "getSymbol", "()Ljava/lang/String;", "binding", "Lcom/kubi/spot/databinding/BkucoinDialogMarketRankBinding;", "getBinding", "()Lcom/kubi/spot/databinding/BkucoinDialogMarketRankBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mAdapter", "com/kubi/spot/quote/market/rank/RankBottomSheetDialog$mAdapter$2$1", "getMAdapter", "()Lcom/kubi/spot/quote/market/rank/RankBottomSheetDialog$mAdapter$2$1;", "mAdapter$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRankBottomSheetDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankBottomSheetDialog.kt\ncom/kubi/spot/quote/market/rank/RankBottomSheetDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,100:1\n143#2,20:101\n*S KotlinDebug\n*F\n+ 1 RankBottomSheetDialog.kt\ncom/kubi/spot/quote/market/rank/RankBottomSheetDialog\n*L\n31#1:101,20\n*E\n"})
public final class RankBottomSheetDialog extends GravityDialogFragment {

    /* JADX INFO: renamed from: g0 */
    public static final /* synthetic */ KProperty<Object>[] f51021g0 = {Reflection.property1(new PropertyReference1Impl(RankBottomSheetDialog.class, "binding", "getBinding()Lcom/kubi/spot/databinding/BkucoinDialogMarketRankBinding;", 0))};

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final List<Tag> f51022c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final String f51023d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final InterfaceC24293a f51024e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final Lazy f51025f0;

    /* JADX INFO: renamed from: A3 */
    public final C44634d m62648A3() {
        return (C44634d) this.f51024e0.getValue(this, f51021g0[0]);
    }

    /* JADX INFO: renamed from: B3 */
    public final RankBottomSheetDialog$mAdapter$2$1 m62649B3() {
        return (RankBottomSheetDialog$mAdapter$2$1) this.f51025f0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: C3, reason: from getter */
    public final String getF51023d0() {
        return this.f51023d0;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkucoin_dialog_market_rank, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView;
        AppCompatImageView appCompatImageView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C44634d c44634dM62648A3 = m62648A3();
        if (c44634dM62648A3 != null && (appCompatImageView = c44634dM62648A3.f99011b) != null) {
            C27046k.m66711z(appCompatImageView, 0L, new Function0() { // from class: z20.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RankBottomSheetDialog.m62646D3(this.f104501b);
                }
            }, 1, null);
        }
        C44634d c44634dM62648A4 = m62648A3();
        if (c44634dM62648A4 != null && (recyclerView = c44634dM62648A4.f99012c) != null) {
            recyclerView.setAdapter(m62649B3());
        }
        m62649B3().replaceData(this.f51022c0);
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m62646D3(RankBottomSheetDialog rankBottomSheetDialog) {
        rankBottomSheetDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m54250y3(0);
    }
}
