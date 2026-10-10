package com.kubi.assets.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.assets.R$layout;
import com.kubi.assets.alpha.AlphaNetworkAdapter;
import com.kubi.assets.entity.AlphaChainInfo;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseQuickAdapter;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44836p;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: AlphaNetworkDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001c\u001a\u00020\rH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R*\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/assets/dialog/AlphaNetworkDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetDialogAlphaNetworkBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetDialogAlphaNetworkBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCloseCallback", "Lkotlin/Function1;", "Lcom/kubi/assets/entity/AlphaChainInfo;", "", "getOnCloseCallback", "()Lkotlin/jvm/functions/Function1;", "setOnCloseCallback", "(Lkotlin/jvm/functions/Function1;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initData", "isBottomSheet", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAlphaNetworkDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaNetworkDialog.kt\ncom/kubi/assets/dialog/AlphaNetworkDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,59:1\n143#2,20:60\n*S KotlinDebug\n*F\n+ 1 AlphaNetworkDialog.kt\ncom/kubi/assets/dialog/AlphaNetworkDialog\n*L\n22#1:60,20\n*E\n"})
public final class AlphaNetworkDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ KProperty<Object>[] f16921s0 = {Reflection.property1(new PropertyReference1Impl(AlphaNetworkDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetDialogAlphaNetworkBinding;", 0))};

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f16922q0 = C45681e.m100799e(this, new Function1<AlphaNetworkDialog, C44836p>() { // from class: com.kubi.assets.dialog.AlphaNetworkDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44836p invoke(@NotNull AlphaNetworkDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44836p.m99198a(fragment.requireView());
        }
    }, new Function1<C44836p, Unit>() { // from class: com.kubi.assets.dialog.AlphaNetworkDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44836p it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44836p c44836p) {
            invoke(c44836p);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @Nullable
    public Function1<? super AlphaChainInfo, Unit> f16923r0;

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final C44836p m15960k4() {
        return (C44836p) this.f16922q0.getValue(this, f16921s0[0]);
    }

    /* JADX INFO: renamed from: n4 */
    public final void m15961n4(@Nullable Function1<? super AlphaChainInfo, Unit> function1) {
        this.f16923r0 = function1;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.asset_dialog_alpha_network, (ViewGroup) null, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m15958l4();
    }

    /* JADX INFO: renamed from: l4 */
    private final void m15958l4() {
        ArrayList parcelableArrayList;
        C44836p c44836pM15960k4;
        RecyclerView recyclerView;
        Bundle arguments = getArguments();
        if (arguments != null) {
            parcelableArrayList = arguments.getParcelableArrayList("data");
        } else {
            parcelableArrayList = null;
        }
        if (parcelableArrayList != null && (c44836pM15960k4 = m15960k4()) != null && (recyclerView = c44836pM15960k4.f100572b) != null) {
            final AlphaNetworkAdapter alphaNetworkAdapter = new AlphaNetworkAdapter(parcelableArrayList);
            alphaNetworkAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.assets.dialog.a
                @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
                public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                    AlphaNetworkDialog.m15959m4(alphaNetworkAdapter, this, baseQuickAdapter, view, i11);
                }
            });
            recyclerView.setAdapter(alphaNetworkAdapter);
        }
    }

    /* JADX INFO: renamed from: m4 */
    public static final void m15959m4(AlphaNetworkAdapter alphaNetworkAdapter, AlphaNetworkDialog alphaNetworkDialog, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        AlphaChainInfo item = alphaNetworkAdapter.getItem(i11);
        if (item != null) {
            alphaNetworkDialog.dismiss();
            Function1<? super AlphaChainInfo, Unit> function1 = alphaNetworkDialog.f16923r0;
            if (function1 != null) {
                function1.invoke(item);
            }
        }
    }
}
