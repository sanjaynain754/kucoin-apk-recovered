package com.kubi.assets.unify.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.assets.R$layout;
import com.kubi.assets.unify.dialog.UnifiedTradeHistoryDialog;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utaspot.api.IUtaSpotService;
import com.kubi.utaspot.api.UtaTradeType;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37752d;
import g00.InterfaceC37756h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44812l3;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: UnifiedTradeHistoryDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/assets/unify/dialog/UnifiedTradeHistoryDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/DialogUnifiedTradeHistoryEntranceBinding;", "getBinding", "()Lcom/kubi/assets/databinding/DialogUnifiedTradeHistoryEntranceBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "isBottomSheet", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifiedTradeHistoryDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifiedTradeHistoryDialog.kt\ncom/kubi/assets/unify/dialog/UnifiedTradeHistoryDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,64:1\n143#2,20:65\n*S KotlinDebug\n*F\n+ 1 UnifiedTradeHistoryDialog.kt\ncom/kubi/assets/unify/dialog/UnifiedTradeHistoryDialog\n*L\n24#1:65,20\n*E\n"})
public final class UnifiedTradeHistoryDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f19014q0 = C45681e.m100799e(this, new Function1<UnifiedTradeHistoryDialog, C44812l3>() { // from class: com.kubi.assets.unify.dialog.UnifiedTradeHistoryDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44812l3 invoke(@NotNull UnifiedTradeHistoryDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44812l3.m99145a(fragment.requireView());
        }
    }, new Function1<C44812l3, Unit>() { // from class: com.kubi.assets.unify.dialog.UnifiedTradeHistoryDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44812l3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44812l3 c44812l3) {
            invoke(c44812l3);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ KProperty<Object>[] f19013s0 = {Reflection.property1(new PropertyReference1Impl(UnifiedTradeHistoryDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/DialogUnifiedTradeHistoryEntranceBinding;", 0))};

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public static final Companion f19012r0 = new Companion(null);

    /* JADX INFO: compiled from: UnifiedTradeHistoryDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/unify/dialog/UnifiedTradeHistoryDialog$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final DialogFragmentHelper newInstance() {
            UnifiedTradeHistoryDialog unifiedTradeHistoryDialog = new UnifiedTradeHistoryDialog();
            unifiedTradeHistoryDialog.setArguments(new C27051h().m66717a());
            return unifiedTradeHistoryDialog;
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: n4 */
    public static final Unit m19883n4(View view) {
        IUtaSpotService iUtaSpotService = IUtaSpotService.f54014a.get();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IUtaSpotService.m65987f(iUtaSpotService, context, null, null, UtaTradeType.SPOT, 0, 22, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public static final Unit m19884o4() {
        InterfaceC37752d.a.m85126e(C37304a.f82764a, null, null, null, null, null, null, null, null, 255, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public static final Unit m19885p4() {
        InterfaceC37756h.a.m85146d(C37304a.f82764a, "cross", 2L, null, null, null, null, null, null, 252, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public final C44812l3 m19886m4() {
        return (C44812l3) this.f19014q0.getValue(this, f19013s0[0]);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.dialog_unified_trade_history_entrance, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull final View view, @Nullable Bundle savedInstanceState) {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        ConstraintLayout constraintLayout3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C44812l3 c44812l3M19886m4 = m19886m4();
        if (c44812l3M19886m4 != null && (constraintLayout3 = c44812l3M19886m4.f100385g) != null) {
            C27046k.m66711z(constraintLayout3, 0L, new Function0() { // from class: kb.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UnifiedTradeHistoryDialog.m19883n4(view);
                }
            }, 1, null);
        }
        C44812l3 c44812l3M19886m5 = m19886m4();
        if (c44812l3M19886m5 != null && (constraintLayout2 = c44812l3M19886m5.f100380b) != null) {
            C27046k.m66711z(constraintLayout2, 0L, new Function0() { // from class: kb.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UnifiedTradeHistoryDialog.m19884o4();
                }
            }, 1, null);
        }
        C44812l3 c44812l3M19886m6 = m19886m4();
        if (c44812l3M19886m6 == null || (constraintLayout = c44812l3M19886m6.f100384f) == null) {
            return;
        }
        C27046k.m66711z(constraintLayout, 0L, new Function0() { // from class: kb.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifiedTradeHistoryDialog.m19885p4();
            }
        }, 1, null);
    }
}
