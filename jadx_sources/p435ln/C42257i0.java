package p435ln;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.kyc.R$drawable;
import com.kubi.kyc.R$id;
import com.kubi.kyc.R$layout;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.bugly.proguard.C33954u6;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import zg0.AbstractC46843b;

/* JADX INFO: renamed from: ln.i0 */
/* JADX INFO: compiled from: TipCellViewBinder.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/kyc/multitype/TipCellViewBinder;", "Lme/drakeet/multitype/ItemViewBinder;", "Lcom/kubi/kyc/multitype/TipCell;", "Lcom/kubi/kyc/multitype/TipCellViewBinder$ViewHolder;", "<init>", "()V", "onCreateViewHolder", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "onBindViewHolder", "", C33954u6.f72238i, "item", "ViewHolder", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42257i0 extends AbstractC46843b<TipCell, a> {

    /* JADX INFO: renamed from: ln.i0$a */
    /* JADX INFO: compiled from: TipCellViewBinder.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kyc/multitype/TipCellViewBinder$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "tips", "Landroid/widget/TextView;", "getTips", "()Landroid/widget/TextView;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final TextView f93725g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.tv_tips);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f93725g = (TextView) viewFindViewById;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextView getF93725g() {
            return this.f93725g;
        }
    }

    @Override // zg0.AbstractC46843b
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo36822b(@NotNull a holder, @NotNull TipCell item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        TextView f93725g = holder.getF93725g();
        f93725g.setText(item.getTip());
        f93725g.setTextColor(item.getTextColor());
        Float textSize = item.getTextSize();
        if (textSize != null) {
            f93725g.setTextSize(textSize.floatValue());
        }
        if (!item.getShowDot()) {
            f93725g.setCompoundDrawables(null, null, null, null);
            return;
        }
        Drawable drawableM66510d = C27017c.m66510d(C27017c.f54310a, R$drawable.shape_oval_emphasis60, null, 2, null);
        drawableM66510d.setBounds(0, 0, C27029c.m66601d(f93725g, 4), C27029c.m66601d(f93725g, 4));
        f93725g.setCompoundDrawables(drawableM66510d, null, null, null);
        f93725g.setCompoundDrawablePadding(C27029c.m66601d(f93725g, 12));
    }

    @Override // zg0.AbstractC46843b
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public a mo36823d(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.busercenter_item_cell_tip, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new a(viewInflate);
    }
}
