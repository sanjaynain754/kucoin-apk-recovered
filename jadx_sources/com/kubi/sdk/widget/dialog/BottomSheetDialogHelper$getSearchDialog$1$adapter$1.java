package com.kubi.sdk.widget.dialog;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper$getSearchDialog$1$adapter$1;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.BiConsumer;
import java.util.Iterator;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BottomSheetDialogHelper.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/sdk/widget/dialog/BottomSheetDialogHelper$getSearchDialog$1$adapter$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$SelectItem;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BottomSheetDialogHelper$getSearchDialog$1$adapter$1 extends BaseQuickAdapter<BottomSheetDialogHelper.InterfaceC24339a, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ List<BottomSheetDialogHelper.InterfaceC24339a> f48622i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ DialogFragmentHelper f48623j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ BiConsumer<BaseViewHolder, BottomSheetDialogHelper.InterfaceC24339a> f48624k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetDialogHelper$getSearchDialog$1$adapter$1(List<? extends BottomSheetDialogHelper.InterfaceC24339a> list, DialogFragmentHelper dialogFragmentHelper, BiConsumer<BaseViewHolder, BottomSheetDialogHelper.InterfaceC24339a> biConsumer, int i11) {
        super(i11, list);
        this.f48622i = list;
        this.f48623j = dialogFragmentHelper;
        this.f48624k = biConsumer;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(final BaseViewHolder helper, final BottomSheetDialogHelper.InterfaceC24339a item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        ((TextView) helper.getView(R$id.text)).setText(item.getLabel());
        ImageView imageView = (ImageView) helper.getView(R$id.image);
        helper.getView(R$id.view_item).setSelected(item.getIsChecked());
        imageView.setVisibility(item.getIsChecked() ? 0 : 8);
        ImageView imageView2 = (ImageView) helper.getView(R$id.iv_icon);
        imageView2.setVisibility(0);
        C24277v.m58542g(imageView2, item.getResourceUrl());
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        final DialogFragmentHelper dialogFragmentHelper = this.f48623j;
        final List<BottomSheetDialogHelper.InterfaceC24339a> list = this.f48622i;
        final BiConsumer<BaseViewHolder, BottomSheetDialogHelper.InterfaceC24339a> biConsumer = this.f48624k;
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: j10.i0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BottomSheetDialogHelper$getSearchDialog$1$adapter$1.m59047j(item, dialogFragmentHelper, list, biConsumer, helper);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final Unit m59047j(final BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a, DialogFragmentHelper dialogFragmentHelper, List list, final BiConsumer biConsumer, final BaseViewHolder baseViewHolder) {
        if (interfaceC24339a.getIsChecked()) {
            dialogFragmentHelper.dismiss();
            return Unit.INSTANCE;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((BottomSheetDialogHelper.InterfaceC24339a) it.next()).setChecked(false);
        }
        interfaceC24339a.setChecked(true);
        dialogFragmentHelper.dismiss();
        C27100x0.m66923d(new Function0() { // from class: j10.j0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BottomSheetDialogHelper$getSearchDialog$1$adapter$1.m59048k(biConsumer, baseViewHolder, interfaceC24339a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final Unit m59048k(BiConsumer biConsumer, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) throws Exception {
        biConsumer.accept(baseViewHolder, interfaceC24339a);
        return Unit.INSTANCE;
    }
}
