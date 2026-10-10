package p435ln;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.kubi.kyc.R$id;
import com.kubi.kyc.R$layout;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33954u6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import zg0.AbstractC46843b;

/* JADX INFO: renamed from: ln.o */
/* JADX INFO: compiled from: InfoCellViewBinder.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/kyc/multitype/InfoCellViewBinder;", "Lme/drakeet/multitype/ItemViewBinder;", "Lcom/kubi/kyc/multitype/InfoCell;", "Lcom/kubi/kyc/multitype/InfoCellViewBinder$ViewHolder;", "<init>", "()V", "onCreateViewHolder", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "onBindViewHolder", "", C33954u6.f72238i, "item", "ViewHolder", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42266o extends AbstractC46843b<InfoCell, a> {

    /* JADX INFO: renamed from: ln.o$a */
    /* JADX INFO: compiled from: InfoCellViewBinder.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kyc/multitype/InfoCellViewBinder$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", Constants.ScionAnalytics.PARAM_LABEL, "Landroid/widget/TextView;", "getLabel", "()Landroid/widget/TextView;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @Nullable
        public final TextView f93742g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f93742g = (TextView) itemView.findViewById(R$id.tv_label);
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextView getF93742g() {
            return this.f93742g;
        }
    }

    @Override // zg0.AbstractC46843b
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo36822b(@NotNull a holder, @NotNull InfoCell item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        TextView f93742g = holder.getF93742g();
        if (f93742g != null) {
            f93742g.setText(C27041f.m66668h(item.getLabel()));
        }
        Integer backgroundColorRes = item.getBackgroundColorRes();
        if (backgroundColorRes != null) {
            int iIntValue = backgroundColorRes.intValue();
            TextView f93742g2 = holder.getF93742g();
            if (f93742g2 != null) {
                f93742g2.setBackgroundResource(iIntValue);
            }
        }
        Integer iconRes = item.getIconRes();
        if (iconRes != null) {
            int iIntValue2 = iconRes.intValue();
            TextView f93742g3 = holder.getF93742g();
            if (f93742g3 != null) {
                C27046k.m66693h(f93742g3, iIntValue2, 12, GravityCompat.START);
            }
        }
        Integer padding = item.getPadding();
        if (padding != null) {
            int iIntValue3 = padding.intValue();
            TextView f93742g4 = holder.getF93742g();
            if (f93742g4 != null) {
                int i11 = (int) (((double) iIntValue3) * 0.5d);
                f93742g4.setPaddingRelative(iIntValue3, i11, iIntValue3, i11);
            }
        }
    }

    @Override // zg0.AbstractC46843b
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public a mo36823d(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.busercenter_item_cell_info, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new a(viewInflate);
    }
}
