package com.kubi.futures.compliance;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33954u6;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import sh.EuropeComplianceLangEntity;

/* JADX INFO: renamed from: com.kubi.futures.compliance.j, reason: from Kotlin metadata */
/* JADX INFO: compiled from: EuropeComplianceLangAdapter.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001b\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005J\u0016\u0010\u0011\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000fH\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/futures/compliance/EuropeComplianceLangAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kubi/futures/compliance/EuropeComplianceLangAdapter$LangViewHolder;", "itemClick", "Lkotlin/Function1;", "Lcom/kubi/futures/data/compliance/entity/EuropeComplianceLangEntity;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "list", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getCheckedData", "setData", "", "getItemCount", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "LangViewHolder", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class EuropeComplianceLangAdapter extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Function1<EuropeComplianceLangEntity, Unit> f22591i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final List<EuropeComplianceLangEntity> f22592j;

    /* JADX INFO: renamed from: com.kubi.futures.compliance.j$a */
    /* JADX INFO: compiled from: EuropeComplianceLangAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/futures/compliance/EuropeComplianceLangAdapter$LangViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final TextView f22593g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f22593g = (TextView) itemView;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextView getF22593g() {
            return this.f22593g;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EuropeComplianceLangAdapter(@NotNull Function1<? super EuropeComplianceLangEntity, Unit> itemClick) {
        Intrinsics.checkNotNullParameter(itemClick, "itemClick");
        this.f22591i = itemClick;
        this.f22592j = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f22592j.size();
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final EuropeComplianceLangEntity m24552h() {
        for (EuropeComplianceLangEntity europeComplianceLangEntity : this.f22592j) {
            if (europeComplianceLangEntity.getChecked()) {
                return europeComplianceLangEntity;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull a holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        EuropeComplianceLangEntity europeComplianceLangEntity = this.f22592j.get(i11);
        if (europeComplianceLangEntity.getChecked()) {
            holder.getF22593g().setBackgroundColor(C27017c.f54310a.m66512a(R$color.c_cover2));
            ViewExKt.m36477c(holder.getF22593g(), Integer.valueOf(R$drawable.ic2_smallhook2_24), Integer.valueOf(R$color.c_text));
        } else {
            holder.getF22593g().setBackgroundColor(0);
            ViewExKt.m36478d(holder.getF22593g(), null, null, 2, null);
        }
        holder.getF22593g().setText(europeComplianceLangEntity.getLangText());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.bkumex_item_europe_compliance_lang, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        final a aVar = new a(viewInflate);
        C27046k.m66711z(aVar.getF22593g(), 0L, new Function0() { // from class: com.kubi.futures.compliance.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EuropeComplianceLangAdapter.m24551k(aVar, this);
            }
        }, 1, null);
        return aVar;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: l */
    public final void m24555l(@NotNull List<EuropeComplianceLangEntity> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f22592j.clear();
        this.f22592j.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m24551k(a aVar, EuropeComplianceLangAdapter europeComplianceLangAdapter) {
        boolean z11;
        int bindingAdapterPosition = aVar.getBindingAdapterPosition();
        if (bindingAdapterPosition >= 0 && bindingAdapterPosition < europeComplianceLangAdapter.f22592j.size()) {
            int size = europeComplianceLangAdapter.f22592j.size();
            for (int i11 = 0; i11 < size; i11++) {
                EuropeComplianceLangEntity europeComplianceLangEntity = europeComplianceLangAdapter.f22592j.get(i11);
                if (i11 == bindingAdapterPosition) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                europeComplianceLangEntity.m97945d(z11);
            }
            europeComplianceLangAdapter.f22591i.invoke(europeComplianceLangAdapter.f22592j.get(bindingAdapterPosition));
            europeComplianceLangAdapter.notifyDataSetChanged();
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
