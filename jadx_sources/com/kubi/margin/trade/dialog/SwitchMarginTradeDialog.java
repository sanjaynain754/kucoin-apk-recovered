package com.kubi.margin.trade.dialog;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.kubi.component.dialog.FeatureToggleCardDialog;
import com.kubi.margin.R$string;
import com.kubi.unify.api.IUnifyAccountService;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p038bc.InterfaceC4549c;
import p038bc.ToggleCardModeData;
import p804yo.InterfaceC46555b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.margin.trade.dialog.a2, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SwitchMarginTradeDialog.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0010J<\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0005H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/margin/trade/dialog/SwitchMarginTradeDialog;", "", "<init>", "()V", "sourceMarginType", "Lcom/kubi/margin/api/define/MarginType;", "selectedMarginType", TIMPushProvider.f75062n, "", "marginType", "isSupportCrossMargin", "", "isSupportIsolateMargin", "parentFragment", "Landroidx/fragment/app/Fragment;", "onConfirm", "Lkotlin/Function1;", "createMarginTypeData", "", "Lcom/kubi/component/dialog/ToggleCardModeData;", "context", "Landroid/content/Context;", "dialog", "Landroidx/fragment/app/DialogFragment;", "getCrossMarginDesc", "", "getIsolateMarginDesc", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SwitchMarginTradeDialog {

    /* JADX INFO: renamed from: a */
    @NotNull
    public InterfaceC46555b f33786a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public InterfaceC46555b f33787b;

    /* JADX INFO: renamed from: e */
    public static final Unit m40261e(SwitchMarginTradeDialog switchMarginTradeDialog, DialogFragment dialogFragment, InterfaceC46555b marginType, boolean z11) {
        Intrinsics.checkNotNullParameter(marginType, "marginType");
        if (z11) {
            switchMarginTradeDialog.f33787b = marginType;
        }
        dialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m40262f(SwitchMarginTradeDialog switchMarginTradeDialog, DialogFragment dialogFragment, InterfaceC46555b marginType, boolean z11) {
        Intrinsics.checkNotNullParameter(marginType, "marginType");
        if (z11) {
            switchMarginTradeDialog.f33787b = marginType;
        }
        dialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final void m40263j(Function1 function1, SwitchMarginTradeDialog switchMarginTradeDialog, DialogInterface dialogInterface) {
        function1.invoke(switchMarginTradeDialog.f33787b);
    }

    /* JADX INFO: renamed from: d */
    public final List<ToggleCardModeData<InterfaceC46555b>> m40264d(Context context, final DialogFragment dialogFragment, boolean z11, boolean z12, InterfaceC46555b interfaceC46555b) {
        ArrayList arrayList = new ArrayList();
        if (z11) {
            String string = context.getString(R$string.kc_margin_account_dialog_cross);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = context.getString(m40265g());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            InterfaceC46555b.a aVar = InterfaceC46555b.a.f104307a;
            arrayList.add(new ToggleCardModeData(string, string2, aVar, Intrinsics.areEqual(interfaceC46555b, aVar), new Function2() { // from class: com.kubi.margin.trade.dialog.y1
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SwitchMarginTradeDialog.m40261e(this.f33868b, dialogFragment, (InterfaceC46555b) obj, ((Boolean) obj2).booleanValue());
                }
            }));
        }
        if (z12) {
            String string3 = context.getString(R$string.kc_margin_account_dialog_isolated);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String string4 = context.getString(m40266h());
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            InterfaceC46555b.b bVar = InterfaceC46555b.b.f104310a;
            arrayList.add(new ToggleCardModeData(string3, string4, bVar, Intrinsics.areEqual(interfaceC46555b, bVar), new Function2() { // from class: com.kubi.margin.trade.dialog.z1
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SwitchMarginTradeDialog.m40262f(this.f33873b, dialogFragment, (InterfaceC46555b) obj, ((Boolean) obj2).booleanValue());
                }
            }));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public final int m40265g() {
        return IUnifyAccountService.f53155a.get().mo64979C() ? R$string.unify_cross_margin_trading_rule : R$string.kc_margin_account_dialog_cross_des;
    }

    /* JADX INFO: renamed from: h */
    public final int m40266h() {
        return IUnifyAccountService.f53155a.get().mo64979C() ? R$string.unify_isolated_margin_transfer_rule : R$string.kc_margin_account_dialog_isolated_desc;
    }

    /* JADX INFO: renamed from: i */
    public final void m40267i(@NotNull InterfaceC46555b marginType, boolean z11, boolean z12, @NotNull Fragment parentFragment, @NotNull final Function1<? super InterfaceC46555b, Unit> onConfirm) {
        Intrinsics.checkNotNullParameter(marginType, "marginType");
        Intrinsics.checkNotNullParameter(parentFragment, "parentFragment");
        Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
        Context context = parentFragment.getContext();
        if (context == null) {
            return;
        }
        this.f33786a = marginType;
        this.f33787b = marginType;
        FeatureToggleCardDialog featureToggleCardDialog = new FeatureToggleCardDialog();
        String string = context.getString(R$string.lever_text_lever_account);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        featureToggleCardDialog.m20444n4(string, m40264d(context, featureToggleCardDialog, z11, z12, marginType), InterfaceC4549c.a.f4002a);
        featureToggleCardDialog.m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.margin.trade.dialog.x1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                SwitchMarginTradeDialog.m40263j(onConfirm, this, dialogInterface);
            }
        });
        FragmentManager childFragmentManager = parentFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        featureToggleCardDialog.show(childFragmentManager, "SwitchMarginTradeDialog");
    }

    public SwitchMarginTradeDialog() {
        InterfaceC46555b.a aVar = InterfaceC46555b.a.f104307a;
        this.f33786a = aVar;
        this.f33787b = aVar;
    }
}
