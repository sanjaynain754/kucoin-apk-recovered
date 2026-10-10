package com.kubi.kucoin.main.helper;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageView;
import com.kubi.facade.lib.R$id;
import com.kubi.facade.lib.R$mipmap;
import com.kubi.kucoin.main.helper.ModeDialogHelper$alertModeChooseDialog$1$1$1;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModeDialogHelper.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0015¨\u0006\b"}, m90084d2 = {"com/kubi/kucoin/main/helper/ModeDialogHelper$alertModeChooseDialog$1$1$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/sdk/widget/dialog/SelectEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "KuFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ModeDialogHelper$alertModeChooseDialog$1$1$1 extends BaseQuickAdapter<SelectEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Function1<SelectEntity, Unit> f27997i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ DialogFragmentHelper f27998j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModeDialogHelper$alertModeChooseDialog$1$1$1(List<SelectEntity> list, Function1<? super SelectEntity, Unit> function1, DialogFragmentHelper dialogFragmentHelper, int i11) {
        super(i11, list);
        this.f27997i = function1;
        this.f27998j = dialogFragmentHelper;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m32446i(boolean z11, Function1 function1, SelectEntity selectEntity, DialogFragmentHelper dialogFragmentHelper) {
        if (!z11) {
            function1.invoke(selectEntity);
        }
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    @SuppressLint({"SuspiciousIndentation"})
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder helper, final SelectEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        final boolean isChecked = item.getIsChecked();
        helper.getView(R$id.view_item).setSelected(isChecked);
        ImageView imageView = (ImageView) helper.getView(R$id.image);
        Integer resourceId = item.getResourceId();
        imageView.setImageResource(resourceId != null ? resourceId.intValue() : R$mipmap.kucoin_icon_default_icon);
        helper.setText(R$id.title, item.getLabel());
        helper.setText(R$id.content, item.getSubLabel());
        ModeDialogHelper.f27996a.m32443k(helper, item);
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        final Function1<SelectEntity, Unit> function1 = this.f27997i;
        final DialogFragmentHelper dialogFragmentHelper = this.f27998j;
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: ml.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ModeDialogHelper$alertModeChooseDialog$1$1$1.m32446i(isChecked, function1, item, dialogFragmentHelper);
            }
        }, 1, null);
    }
}
