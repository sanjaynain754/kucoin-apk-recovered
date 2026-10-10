package com.kubi.payment.third.quote;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.payment.third.data.entities.PayMethodSelect;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ThirdPaySelectDialogFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/payment/third/quote/ThirdPaySelectDialogFragment$payAdapter$2$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/payment/third/data/entities/PayMethodSelect;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nThirdPaySelectDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThirdPaySelectDialogFragment.kt\ncom/kubi/payment/third/quote/ThirdPaySelectDialogFragment$payAdapter$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n774#2:94\n865#2,2:95\n*S KotlinDebug\n*F\n+ 1 ThirdPaySelectDialogFragment.kt\ncom/kubi/payment/third/quote/ThirdPaySelectDialogFragment$payAdapter$2$1\n*L\n34#1:94\n34#1:95,2\n*E\n"})
public final class ThirdPaySelectDialogFragment$payAdapter$2$1 extends BaseQuickAdapter<PayMethodSelect, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ThirdPaySelectDialogFragment f40267i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThirdPaySelectDialogFragment$payAdapter$2$1(ThirdPaySelectDialogFragment thirdPaySelectDialogFragment, int i11) {
        super(i11);
        this.f40267i = thirdPaySelectDialogFragment;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder helper, final PayMethodSelect item) {
        final ArrayList arrayList;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        final ThirdPaySelectDialogFragment thirdPaySelectDialogFragment = this.f40267i;
        helper.getView(R$id.view_item).setSelected(Intrinsics.areEqual(item.getId(), thirdPaySelectDialogFragment.f40263q0));
        helper.setText(R$id.tv_title, item.getName());
        helper.setVisible(R$id.iv_checked, Intrinsics.areEqual(item.getId(), thirdPaySelectDialogFragment.f40263q0));
        List<String> tags = item.getTags();
        if (tags != null) {
            arrayList = new ArrayList();
            for (Object obj : tags) {
                String str = (String) obj;
                if (!(str == null || str.length() == 0)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            RecyclerView recyclerView = (RecyclerView) helper.getView(R$id.recycler_view);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
            linearLayoutManager.setOrientation(0);
            recyclerView.setLayoutManager(linearLayoutManager);
            final int i11 = R$layout.botc_item_label;
            recyclerView.setAdapter(new BaseQuickAdapter<String, BaseViewHolder>(arrayList, i11) { // from class: com.kubi.payment.third.quote.ThirdPaySelectDialogFragment$payAdapter$2$1$convert$1$1$2
                @Override // io.chad.library.adapter.base.BaseQuickAdapter
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public void convert(BaseViewHolder viewHolder, String item2) {
                    Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                    Intrinsics.checkNotNullParameter(item2, "item");
                    viewHolder.setText(R$id.tv_label, item2);
                }
            });
        }
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.payment.third.quote.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThirdPaySelectDialogFragment$payAdapter$2$1.m49648i(item, thirdPaySelectDialogFragment);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m49648i(PayMethodSelect payMethodSelect, ThirdPaySelectDialogFragment thirdPaySelectDialogFragment) {
        if (!Intrinsics.areEqual(payMethodSelect.getId(), thirdPaySelectDialogFragment.f40263q0)) {
            Function1 function1 = thirdPaySelectDialogFragment.f40265s0;
            if (function1 != null) {
                function1.invoke(payMethodSelect);
            }
            thirdPaySelectDialogFragment.dismiss();
            return Unit.INSTANCE;
        }
        thirdPaySelectDialogFragment.dismiss();
        return Unit.INSTANCE;
    }
}
