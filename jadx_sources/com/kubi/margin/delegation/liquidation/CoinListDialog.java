package com.kubi.margin.delegation.liquidation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.margin.R$layout;
import com.kubi.margin.entity.AssetEntity;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.BaseAdapter;
import com.kubi.sdk.C24346y;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36919j;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: CoinListDialog.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0006\u0010\u001c\u001a\u00020\u001dJ&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010)\u001a\u00020'H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R)\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0018\u0010\u0015¨\u0006+"}, m90084d2 = {"Lcom/kubi/margin/delegation/liquidation/CoinListDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/margin/databinding/BmarginFragmentCoinListDialogBinding;", "getBinding", "()Lcom/kubi/margin/databinding/BmarginFragmentCoinListDialogBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "coinList", "", "Lcom/kubi/margin/entity/AssetEntity;", "kotlin.jvm.PlatformType", "getCoinList", "()Ljava/util/List;", "coinList$delegate", "Lkotlin/Lazy;", "titleString", "", "getTitleString", "()Ljava/lang/String;", "titleString$delegate", "describe", "getDescribe", "describe$delegate", "isBottomSheet", "", "getLayoutId", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initRecycler", "Companion", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCoinListDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoinListDialog.kt\ncom/kubi/margin/delegation/liquidation/CoinListDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,93:1\n143#2,20:94\n*S KotlinDebug\n*F\n+ 1 CoinListDialog.kt\ncom/kubi/margin/delegation/liquidation/CoinListDialog\n*L\n21#1:94,20\n*E\n"})
public final class CoinListDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f32941q0 = C45681e.m100799e(this, new Function1<CoinListDialog, C36919j>() { // from class: com.kubi.margin.delegation.liquidation.CoinListDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36919j invoke(@NotNull CoinListDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36919j.m82706a(fragment.requireView());
        }
    }, new Function1<C36919j, Unit>() { // from class: com.kubi.margin.delegation.liquidation.CoinListDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36919j it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36919j c36919j) {
            invoke(c36919j);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f32942r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.delegation.liquidation.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CoinListDialog.m38209m4(this.f32958b);
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f32943s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.delegation.liquidation.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CoinListDialog.m38211u4(this.f32959b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f32944t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.delegation.liquidation.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CoinListDialog.m38210n4(this.f32960b);
        }
    });

    /* JADX INFO: renamed from: v0 */
    public static final /* synthetic */ KProperty<Object>[] f32940v0 = {Reflection.property1(new PropertyReference1Impl(CoinListDialog.class, "binding", "getBinding()Lcom/kubi/margin/databinding/BmarginFragmentCoinListDialogBinding;", 0))};

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public static final Companion f32939u0 = new Companion(null);

    /* JADX INFO: compiled from: CoinListDialog.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\b\u001a\u00020\t2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/margin/delegation/liquidation/CoinListDialog$Companion;", "", "<init>", "()V", "COIN_LIST", "", "TITLE", "DESCRIBE", "newInstance", "Lcom/kubi/margin/delegation/liquidation/CoinListDialog;", "tradeType", "Ljava/util/ArrayList;", "Lcom/kubi/margin/entity/AssetEntity;", "Lkotlin/collections/ArrayList;", "title", "describe", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final CoinListDialog newInstance(@NotNull ArrayList<AssetEntity> tradeType, @NotNull String title, @NotNull String describe) {
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(describe, "describe");
            CoinListDialog coinListDialog = new CoinListDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("coin_list", tradeType);
            bundle.putString("title", title);
            bundle.putString("describe", describe);
            coinListDialog.setArguments(bundle);
            return coinListDialog;
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: o4 */
    public final C36919j m38212o4() {
        return (C36919j) this.f32941q0.getValue(this, f32940v0[0]);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(m38215r4(), container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m38217t4();
        C36919j c36919jM38212o4 = m38212o4();
        if (c36919jM38212o4 != null && (baseTextView2 = c36919jM38212o4.f81742c) != null) {
            baseTextView2.setText(m38216s4());
        }
        C36919j c36919jM38212o5 = m38212o4();
        if (c36919jM38212o5 == null || (baseTextView = c36919jM38212o5.f81744e) == null) {
            return;
        }
        baseTextView.setText(m38214q4());
    }

    @NotNull
    /* JADX INFO: renamed from: p4 */
    public final List<AssetEntity> m38213p4() {
        return (List) this.f32942r0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: q4 */
    public final String m38214q4() {
        return (String) this.f32944t0.getValue();
    }

    /* JADX INFO: renamed from: r4 */
    public final int m38215r4() {
        return R$layout.bmargin_fragment_coin_list_dialog;
    }

    @NotNull
    /* JADX INFO: renamed from: s4 */
    public final String m38216s4() {
        return (String) this.f32943s0.getValue();
    }

    /* JADX INFO: renamed from: m4 */
    public static final List m38209m4(CoinListDialog coinListDialog) {
        ArrayList parcelableArrayList;
        Bundle arguments = coinListDialog.getArguments();
        if (arguments != null) {
            parcelableArrayList = arguments.getParcelableArrayList("coin_list");
        } else {
            parcelableArrayList = null;
        }
        return C27024b.m66560c(parcelableArrayList);
    }

    /* JADX INFO: renamed from: n4 */
    public static final String m38210n4(CoinListDialog coinListDialog) {
        String string;
        Bundle arguments = coinListDialog.getArguments();
        if (arguments != null) {
            string = arguments.getString("describe");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: u4 */
    public static final String m38211u4(CoinListDialog coinListDialog) {
        String string;
        Bundle arguments = coinListDialog.getArguments();
        if (arguments != null) {
            string = arguments.getString("title");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: t4 */
    public final void m38217t4() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        C36919j c36919jM38212o4 = m38212o4();
        if (c36919jM38212o4 != null && (recyclerView3 = c36919jM38212o4.f81741b) != null) {
            recyclerView3.setItemAnimator(null);
        }
        BaseAdapter baseAdapterM57324a = BaseAdapter.a.m57323c(new BaseAdapter.a(), AssetEntity.class, CoinListItemProxy.class, null, null, 12, null).m57324a();
        C36919j c36919jM38212o5 = m38212o4();
        if (c36919jM38212o5 != null && (recyclerView2 = c36919jM38212o5.f81741b) != null) {
            recyclerView2.setAdapter(baseAdapterM57324a);
        }
        C36919j c36919jM38212o6 = m38212o4();
        if (c36919jM38212o6 != null && (recyclerView = c36919jM38212o6.f81741b) != null) {
            C24346y.m59052b(recyclerView, CollectionsKt.toMutableList((Collection) m38213p4()));
        }
    }
}
