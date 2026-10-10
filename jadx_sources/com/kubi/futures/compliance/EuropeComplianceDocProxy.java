package com.kubi.futures.compliance;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.futures.data.compliance.entity.EuropeComplianceDocsEntity;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.resources.C22890g;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.ViewHolderProxy;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import th.InterfaceC44980d;

/* JADX INFO: compiled from: EuropeComplianceDocAdapter.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/futures/compliance/EuropeComplianceDocProxy;", "Lcom/kubi/sdk/ViewHolderProxy;", "Lcom/kubi/futures/data/compliance/entity/EuropeComplianceDocsEntity;", "parent", "Landroid/view/ViewGroup;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "longCall", "<init>", "(Landroid/view/ViewGroup;Lcom/kubi/sdk/ItemCallBack;Lcom/kubi/sdk/ItemCallBack;)V", "getParent", "()Landroid/view/ViewGroup;", "getShortCall", "()Lcom/kubi/sdk/ItemCallBack;", "getLongCall", "createView", "Landroid/view/View;", "bindView", "", "d", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class EuropeComplianceDocProxy extends ViewHolderProxy<EuropeComplianceDocsEntity> {

    @Nullable
    private final ItemCallBack<EuropeComplianceDocsEntity> longCall;

    @NotNull
    private final ViewGroup parent;

    @Nullable
    private final ItemCallBack<EuropeComplianceDocsEntity> shortCall;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EuropeComplianceDocProxy(@NotNull ViewGroup parent, @Nullable ItemCallBack<EuropeComplianceDocsEntity> itemCallBack, @Nullable ItemCallBack<EuropeComplianceDocsEntity> itemCallBack2) {
        super(parent, itemCallBack, itemCallBack2);
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        this.shortCall = itemCallBack;
        this.longCall = itemCallBack2;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    public void bindView(@NotNull EuropeComplianceDocsEntity d11) {
        CharSequence symbol;
        Intrinsics.checkNotNullParameter(d11, "d");
        super.bindView(d11);
        Context context = getHolder().itemView.getContext();
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(d11.getSymbol()), false, 2, null);
        View itemView = getHolder().itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        TextView textView = (TextView) itemView.findViewById(R$id.symbol);
        if (contractEntityM99529O == null || (symbol = FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM99529O)) == null) {
            symbol = d11.getSymbol();
        }
        textView.setText(symbol);
        TextView textView2 = (TextView) itemView.findViewById(R$id.leverage);
        C27017c c27017c = C27017c.f54310a;
        textView2.setText(c27017c.m66516f(R$string.futures_eourpe_legal_max_lever, C6447a.m11724a(C27039d.m66656p(d11.getMaxLeverage())).toPlainString()));
        TextView textView3 = (TextView) itemView.findViewById(R$id.side);
        textView3.setText(DowngradeExKt.m66552v(d11.getDirection(), new Object[0]));
        String direction = d11.getDirection();
        if (Intrinsics.areEqual(direction, "Long")) {
            Intrinsics.checkNotNull(context);
            textView3.setTextColor(C22890g.m54281f(context, true));
        } else if (!Intrinsics.areEqual(direction, "Short")) {
            textView3.setTextColor(c27017c.m66512a(R$color.c_text));
        } else {
            Intrinsics.checkNotNull(context);
            textView3.setTextColor(C22890g.m54281f(context, false));
        }
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<EuropeComplianceDocsEntity> getLongCall() {
        return this.longCall;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public ViewGroup getParent() {
        return this.parent;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<EuropeComplianceDocsEntity> getShortCall() {
        return this.shortCall;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createView$lambda$1$lambda$0(EuropeComplianceDocProxy europeComplianceDocProxy, View view) {
        ItemCallBack<EuropeComplianceDocsEntity> shortCall = europeComplianceDocProxy.getShortCall();
        if (shortCall != null) {
            Intrinsics.checkNotNull(view);
            int bindingAdapterPosition = europeComplianceDocProxy.getHolder().getBindingAdapterPosition();
            EuropeComplianceDocsEntity data = europeComplianceDocProxy.getData();
            Intrinsics.checkNotNull(data);
            shortCall.mo24515a(view, bindingAdapterPosition, data);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public View createView() {
        final View viewInflate = LayoutInflater.from(getParent().getContext()).inflate(R$layout.bkumex_item_europe_compliance_contracts, getParent(), false);
        Intrinsics.checkNotNull(viewInflate);
        C27046k.m66711z(viewInflate, 0L, new Function0() { // from class: com.kubi.futures.compliance.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EuropeComplianceDocProxy.createView$lambda$1$lambda$0(this.f22587b, viewInflate);
            }
        }, 1, null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }
}
