package com.kubi.assets.detail;

import android.view.View;
import android.widget.TextView;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$id;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.Action;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaseAccountDetailFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/assets/detail/BaseAccountDetailFragment$setFunctionList$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/assets/detail/BaseAccountDetailFragment$AssetHeaderFunction;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BaseAccountDetailFragment$setFunctionList$1 extends BaseQuickAdapter<BaseAccountDetailFragment.AssetHeaderFunction, BaseViewHolder> {
    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder helper, final BaseAccountDetailFragment.AssetHeaderFunction item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        BaseViewHolder imageResource = helper.setImageResource(R$id.ivIcon, item.getResId());
        int i11 = R$id.tvTitle;
        imageResource.setText(i11, item.getTitle());
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.assets.detail.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseAccountDetailFragment$setFunctionList$1.m15940i(item);
            }
        }, 1, null);
        TextView textView = (TextView) helper.getView(i11);
        if (getData().size() <= 1) {
            Intrinsics.checkNotNull(textView);
            C27046k.m66694i(textView, R$drawable.icon_arrow_right_mirrored, 0, 0, 6, null);
        } else {
            Intrinsics.checkNotNull(textView);
            C27046k.m66694i(textView, 0, 0, 0, 6, null);
        }
    }

    public BaseAccountDetailFragment$setFunctionList$1(int i11) {
        super(i11);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m15940i(BaseAccountDetailFragment.AssetHeaderFunction assetHeaderFunction) throws Exception {
        Action callBack = assetHeaderFunction.getCallBack();
        if (callBack != null) {
            callBack.run();
        }
        return Unit.INSTANCE;
    }
}
