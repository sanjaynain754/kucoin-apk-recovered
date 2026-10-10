package ai0;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.unify.R$id;
import com.kubi.unify.R$layout;
import com.tencent.bugly.proguard.C33954u6;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import repayment.C44044f;
import repayment.UnifyAssetData;

/* JADX INFO: renamed from: ai0.b */
/* JADX INFO: compiled from: RepayAssetValueDetailAdapter.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0007J\u001c\u0010\f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\t2\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lrepayment/adapter/RepayAssetValueDetailAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lrepayment/adapter/RepayAssetValueDetailAdapter$ViewHolder;", "<init>", "()V", "selectedAssetList", "", "Lrepayment/UnifyAssetData;", "clearData", "", "setData", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "getItemCount", "ViewHolder", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C0365b extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final List<UnifyAssetData> f1083i = new ArrayList();

    /* JADX INFO: renamed from: ai0.b$a */
    /* JADX INFO: compiled from: RepayAssetValueDetailAdapter.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lrepayment/adapter/RepayAssetValueDetailAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Lrepayment/adapter/RepayAssetValueDetailAdapter;Landroid/view/View;)V", "tvTitle", "Landroid/widget/TextView;", "tvDescription", "bind", "", "item", "Lrepayment/UnifyAssetData;", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final TextView f1084g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final TextView f1085h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ C0365b f1086i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull C0365b c0365b, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f1086i = c0365b;
            View viewFindViewById = itemView.findViewById(R$id.tvCurrencyName);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f1084g = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.tvCurrencyAmount);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.f1085h = (TextView) viewFindViewById2;
        }

        /* JADX INFO: renamed from: a */
        public final void m1444a(@NotNull UnifyAssetData item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.f1084g.setText(item.getCurrencyName());
            this.f1085h.setText(C44044f.m97124b(item));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1440g() {
        this.f1083i.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f1083i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull a holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.m1444a(this.f1083i.get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.item_selected_repay_asset, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(this, viewInflate);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: j */
    public final void m1443j(@NotNull List<UnifyAssetData> selectedAssetList) {
        Intrinsics.checkNotNullParameter(selectedAssetList, "selectedAssetList");
        this.f1083i.clear();
        this.f1083i.addAll(selectedAssetList);
        notifyDataSetChanged();
    }
}
