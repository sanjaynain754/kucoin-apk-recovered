package com.kubi.quotefacade.alpha.container;

import android.view.View;
import android.widget.ImageView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$mipmap;
import com.kubi.quotefacade.entity.AlphaNetworks;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import java.util.Locale;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AlphaContainerDialog.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/quotefacade/alpha/container/AlphaContainerDialog$alertChooseNetwork$1$1$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/quotefacade/entity/AlphaNetworks;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AlphaContainerDialog$alertChooseNetwork$1$1$1 extends BaseQuickAdapter<AlphaNetworks, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f41157i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Function1<AlphaNetworks, Unit> f41158j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ DialogFragmentHelper f41159k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AlphaContainerDialog$alertChooseNetwork$1$1$1(List<AlphaNetworks> list, int i11, Function1<? super AlphaNetworks, Unit> function1, DialogFragmentHelper dialogFragmentHelper, int i12) {
        super(i12, list);
        this.f41157i = i11;
        this.f41158j = function1;
        this.f41159k = dialogFragmentHelper;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m50381i(boolean z11, Function1 function1, AlphaNetworks alphaNetworks, DialogFragmentHelper dialogFragmentHelper) {
        if (!z11) {
            function1.invoke(alphaNetworks);
        }
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder helper, final AlphaNetworks item) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        final boolean z11 = helper.getBindingAdapterPosition() == this.f41157i;
        helper.getView(R$id.view_item).setSelected(z11);
        helper.setGone(R$id.fl_container, true);
        int i11 = R$id.iv_original_icon;
        helper.setGone(i11, true);
        helper.setGone(R$id.image, z11);
        ImageView imageView = (ImageView) helper.getView(i11);
        String externalChain = item.getExternalChain();
        if (externalChain != null) {
            lowerCase = externalChain.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        if (Intrinsics.areEqual(lowerCase, TtmlNode.COMBINE_ALL)) {
            imageView.setImageResource(R$mipmap.quote_ic_network_all);
        } else {
            C24277v.m58542g(imageView, C27041f.m66668h(item.getChainIcon()));
        }
        helper.setText(R$id.text, C27041f.m66668h(item.getDisplayChain()));
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        final Function1<AlphaNetworks, Unit> function1 = this.f41158j;
        final DialogFragmentHelper dialogFragmentHelper = this.f41159k;
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.quotefacade.alpha.container.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaContainerDialog$alertChooseNetwork$1$1$1.m50381i(z11, function1, item, dialogFragmentHelper);
            }
        }, 1, null);
    }
}
