package com.kubi.assets.exchange.p075ui.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.assets.R$layout;
import com.kubi.assets.exchange.model.AccountItem;
import com.kubi.assets.exchange.p075ui.adapter.ConvertAccountSelectAdapter;
import com.kubi.assets.exchange.p075ui.dialog.ConvertAccountSelectDialog;
import com.kubi.data.coin.AccountType;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.unify.api.IUnifyAccountService;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseQuickAdapter;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44878v;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: ConvertAccountSelectDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0002J\b\u0010\u001f\u001a\u00020 H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006!"}, m90084d2 = {"Lcom/kubi/assets/exchange/ui/dialog/ConvertAccountSelectDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetDialogConvertAccountSelectBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetDialogConvertAccountSelectBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "adapter", "Lcom/kubi/assets/exchange/ui/adapter/ConvertAccountSelectAdapter;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Lcom/kubi/assets/exchange/model/AccountItem;", "", "getCallback", "()Lkotlin/jvm/functions/Function1;", "setCallback", "(Lkotlin/jvm/functions/Function1;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initView", "isBottomSheet", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nConvertAccountSelectDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConvertAccountSelectDialog.kt\ncom/kubi/assets/exchange/ui/dialog/ConvertAccountSelectDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n143#2,20:72\n295#3,2:92\n*S KotlinDebug\n*F\n+ 1 ConvertAccountSelectDialog.kt\ncom/kubi/assets/exchange/ui/dialog/ConvertAccountSelectDialog\n*L\n27#1:72,20\n57#1:92,2\n*E\n"})
public final class ConvertAccountSelectDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ KProperty<Object>[] f17292t0 = {Reflection.property1(new PropertyReference1Impl(ConvertAccountSelectDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetDialogConvertAccountSelectBinding;", 0))};

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f17293q0 = C45681e.m100799e(this, new Function1<ConvertAccountSelectDialog, C44878v>() { // from class: com.kubi.assets.exchange.ui.dialog.ConvertAccountSelectDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44878v invoke(@NotNull ConvertAccountSelectDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44878v.m99280a(fragment.requireView());
        }
    }, new Function1<C44878v, Unit>() { // from class: com.kubi.assets.exchange.ui.dialog.ConvertAccountSelectDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44878v it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44878v c44878v) {
            invoke(c44878v);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @Nullable
    public ConvertAccountSelectAdapter f17294r0;

    /* JADX INFO: renamed from: s0 */
    @Nullable
    public Function1<? super AccountItem, Unit> f17295s0;

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    private final void initView() {
        RecyclerView recyclerView;
        boolean zMo64979C = IUnifyAccountService.f53155a.get().mo64979C();
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(new AccountItem(AccountType.MAIN, false));
        if (!zMo64979C) {
            arrayListArrayListOf.add(new AccountItem(AccountType.TRADE, false));
        }
        if (C24129b.m58030b(SiteVisibleConfigKey.Margin)) {
            arrayListArrayListOf.add(new AccountItem(AccountType.LEVER, false));
        }
        Bundle arguments = getArguments();
        Object obj = null;
        String strM56284y = arguments != null ? RouteExKt.m56284y(arguments, "page") : null;
        for (Object obj2 : arrayListArrayListOf) {
            if (Intrinsics.areEqual(((AccountItem) obj2).getAccountType().name(), strM56284y)) {
                obj = obj2;
                break;
            }
        }
        AccountItem accountItem = (AccountItem) obj;
        if (accountItem != null) {
            accountItem.setChecked(true);
        }
        this.f17294r0 = new ConvertAccountSelectAdapter(arrayListArrayListOf, zMo64979C);
        C44878v c44878vM16515k4 = m16515k4();
        if (c44878vM16515k4 != null && (recyclerView = c44878vM16515k4.f100982b) != null) {
            recyclerView.setAdapter(this.f17294r0);
        }
        ConvertAccountSelectAdapter convertAccountSelectAdapter = this.f17294r0;
        if (convertAccountSelectAdapter != null) {
            convertAccountSelectAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: ya.c
                @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
                public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                    ConvertAccountSelectDialog.m16514l4(this.f104091a, baseQuickAdapter, view, i11);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l4 */
    public static final void m16514l4(ConvertAccountSelectDialog convertAccountSelectDialog, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        List<AccountItem> data;
        ConvertAccountSelectAdapter convertAccountSelectAdapter = convertAccountSelectDialog.f17294r0;
        AccountItem accountItem = (convertAccountSelectAdapter == null || (data = convertAccountSelectAdapter.getData()) == null) ? null : (AccountItem) CollectionsKt.getOrNull(data, i11);
        Function1<? super AccountItem, Unit> function1 = convertAccountSelectDialog.f17295s0;
        if (function1 != null) {
            function1.invoke(accountItem);
        }
        convertAccountSelectDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: k4 */
    public final C44878v m16515k4() {
        return (C44878v) this.f17293q0.getValue(this, f17292t0[0]);
    }

    /* JADX INFO: renamed from: m4 */
    public final void m16516m4(@Nullable Function1<? super AccountItem, Unit> function1) {
        this.f17295s0 = function1;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.asset_dialog_convert_account_select, (ViewGroup) null, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
    }
}
