package com.sumsub.sns.internal.features.presentation.sumsubid.p124ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.base.adapter.AbstractC28090b;
import com.sumsub.sns.core.presentation.base.adapter.AbstractC28091c;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.databinding.C28325E;
import com.sumsub.sns.databinding.C28326F;
import com.sumsub.sns.internal.features.presentation.sumsubid.AbstractC32550p;
import com.sumsub.sns.internal.features.presentation.sumsubid.C32529i;
import com.sumsub.sns.internal.features.presentation.sumsubid.C32535k;
import com.sumsub.sns.internal.features.presentation.sumsubid.C32541m;
import com.sumsub.sns.internal.features.presentation.sumsubid.C32547o;
import java.util.ArrayList;
import java.util.HashMap;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.ui.adapter.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32568d extends AbstractC28090b {

    /* JADX INFO: renamed from: b */
    public final Function1 f66425b;

    /* JADX INFO: renamed from: c */
    public final HashMap f66426c = new HashMap();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i11) {
        if (i11 == 1) {
            int i12 = C32571g.f66432g;
            return new C32571g(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.sns_sumsubid_adapter_item_section, viewGroup, false));
        }
        if (i11 == 2) {
            int i13 = C32565a.f66422g;
            C32566b c32566b = new C32566b(this);
            C28325E c28325eM69248a = C28325E.m69248a(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.sns_sumsubid_adapter_item_checkbox, viewGroup, false));
            c28325eM69248a.f57638b.setCardStyle(SNSMetricElement.SUMSUB_ID_CARD_STYLE);
            return new C32565a(c28325eM69248a.f57637a, c32566b);
        }
        if (i11 != 3) {
            if (i11 != 4) {
                throw new IllegalStateException("Cannot create view holder for SNSSumsubIdDocumentsAdapter");
            }
            int i14 = C32569e.f66427g;
            return new C32569e(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.sns_sumsubid_adapter_item_title, viewGroup, false));
        }
        int i15 = C32570f.f66429g;
        C32567c c32567c = new C32567c(this);
        C28326F c28326fM69249a = C28326F.m69249a(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.sns_sumsubid_adapter_item_radio_button, viewGroup, false));
        c28326fM69249a.f57643c.setCardStyle(SNSMetricElement.SUMSUB_ID_CARD_STYLE);
        return new C32570f(c28326fM69249a.f57641a, c32567c);
    }

    /* JADX INFO: renamed from: a */
    public static final void m71177a(C32568d c32568d, int i11, AbstractC32550p abstractC32550p) {
        if (abstractC32550p instanceof C32541m) {
            ArrayList arrayList = (ArrayList) c32568d.f66426c.get(((C32541m) abstractC32550p).f66380b);
            if (arrayList == null) {
                return;
            }
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                int iIntValue = ((Number) obj).intValue();
                Object obj2 = c32568d.f57292a.get(iIntValue);
                C32541m c32541m = obj2 instanceof C32541m ? (C32541m) obj2 : null;
                if (c32541m != null) {
                    c32541m.f66385g = iIntValue == i11;
                }
                if (iIntValue != i11) {
                    c32568d.notifyItemChanged(iIntValue);
                }
            }
        }
        c32568d.f66425b.invoke(abstractC32550p);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i11) {
        AbstractC32550p abstractC32550p = (AbstractC32550p) this.f57292a.get(i11);
        if (abstractC32550p instanceof C32547o) {
            return 1;
        }
        if (abstractC32550p instanceof C32529i) {
            return 2;
        }
        if (abstractC32550p instanceof C32541m) {
            return 3;
        }
        if (abstractC32550p instanceof C32535k) {
            return 4;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i11) {
        ((AbstractC28091c) viewHolder).mo69072a((AbstractC32550p) this.f57292a.get(i11), this.f57292a.size());
    }

    public C32568d(Function1 function1) {
        this.f66425b = function1;
    }
}
