package com.kubi.redpackage.p109ui;

import android.view.View;
import android.widget.TextView;
import com.kubi.redpackage.R$color;
import com.kubi.redpackage.R$id;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RedPacketHistoryFragment.kt */
/* JADX INFO: loaded from: classes38.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/redpackage/ui/RedPacketHistoryFragment$showRedPacketTypeDialog$1$2", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/sdk/widget/dialog/SelectEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRedPacketHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedPacketHistoryFragment.kt\ncom/kubi/redpackage/ui/RedPacketHistoryFragment$showRedPacketTypeDialog$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n1869#2,2:197\n*S KotlinDebug\n*F\n+ 1 RedPacketHistoryFragment.kt\ncom/kubi/redpackage/ui/RedPacketHistoryFragment$showRedPacketTypeDialog$1$2\n*L\n186#1:197,2\n*E\n"})
public final class RedPacketHistoryFragment$showRedPacketTypeDialog$1$2 extends BaseQuickAdapter<SelectEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ RedPacketHistoryFragment f43163i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ DialogFragmentHelper f43164j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedPacketHistoryFragment$showRedPacketTypeDialog$1$2(RedPacketHistoryFragment redPacketHistoryFragment, DialogFragmentHelper dialogFragmentHelper, int i11, ArrayList<SelectEntity> arrayList) {
        super(i11, arrayList);
        this.f43163i = redPacketHistoryFragment;
        this.f43164j = dialogFragmentHelper;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(final BaseViewHolder helper, final SelectEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        TextView textView = (TextView) helper.getView(R$id.text);
        textView.setText(item.getLabel());
        textView.setTextColor(this.f43163i.getColorRes(item.getIsChecked() ? R$color.primary : R$color.c_text));
        View view = helper.itemView;
        final RedPacketHistoryFragment redPacketHistoryFragment = this.f43163i;
        final DialogFragmentHelper dialogFragmentHelper = this.f43164j;
        view.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.redpackage.ui.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RedPacketHistoryFragment$showRedPacketTypeDialog$1$2.m53795i(redPacketHistoryFragment, helper, item, dialogFragmentHelper, view2);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static final void m53795i(RedPacketHistoryFragment redPacketHistoryFragment, BaseViewHolder baseViewHolder, SelectEntity selectEntity, DialogFragmentHelper dialogFragmentHelper, View view) {
        boolean z11;
        if (baseViewHolder.getAdapterPosition() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        redPacketHistoryFragment.f43160a0 = z11;
        Iterator it = redPacketHistoryFragment.f43159Z.iterator();
        while (it.hasNext()) {
            ((SelectEntity) it.next()).setChecked(false);
        }
        selectEntity.setChecked(true);
        redPacketHistoryFragment.showLoading();
        redPacketHistoryFragment.mo15906F3();
        dialogFragmentHelper.dismiss();
    }
}
