package com.kubi.futures.dialog;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kubi.kumex.R$id;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdvancedLimitDialogHelper.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/futures/dialog/AdvancedLimitDialogHelperKt$chooseAdvancedLimitTypeDialog$1$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/futures/dialog/AdvancedLimitItemEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AdvancedLimitDialogHelperKt$chooseAdvancedLimitTypeDialog$1$1 extends BaseQuickAdapter<AdvancedLimitItemEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ DialogFragmentHelper f22759i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Function1<AdvancedLimitItemEntity, Unit> f22760j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdvancedLimitDialogHelperKt$chooseAdvancedLimitTypeDialog$1$1(List<AdvancedLimitItemEntity> list, DialogFragmentHelper dialogFragmentHelper, Function1<? super AdvancedLimitItemEntity, Unit> function1, int i11) {
        super(i11, list);
        this.f22759i = dialogFragmentHelper;
        this.f22760j = function1;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder helper, final AdvancedLimitItemEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        final DialogFragmentHelper dialogFragmentHelper = this.f22759i;
        final Function1<AdvancedLimitItemEntity, Unit> function1 = this.f22760j;
        TextView textView = (TextView) helper.getView(R$id.tv_title);
        Function1<Context, String> titleGetter = item.getTifType().getTitleGetter();
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        textView.setText(titleGetter.invoke(mContext));
        TextView textView2 = (TextView) helper.getView(R$id.tv_desc);
        Function1<Context, String> descGetter = item.getTifType().getDescGetter();
        Context mContext2 = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
        textView2.setText(descGetter.invoke(mContext2));
        helper.getView(R$id.view_item).setSelected(item.isSelect());
        ((ImageView) helper.getView(R$id.iv_check)).setVisibility(item.isSelect() ? 0 : 4);
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.futures.dialog.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvancedLimitDialogHelperKt$chooseAdvancedLimitTypeDialog$1$1.m25049i(dialogFragmentHelper, function1, item);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m25049i(DialogFragmentHelper dialogFragmentHelper, Function1 function1, AdvancedLimitItemEntity advancedLimitItemEntity) {
        dialogFragmentHelper.dismiss();
        function1.invoke(advancedLimitItemEntity);
        return Unit.INSTANCE;
    }
}
