package p809yu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.R$drawable;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27059l;
import com.tencent.bugly.proguard.C33954u6;
import cv.ChainSafeEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yu.q */
/* JADX INFO: compiled from: ChainSafelyAlertDialogHelper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/quotefacade/adapter/ChainSafetyAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kubi/quotefacade/adapter/ChainSafetyAdapter$ChainSafetyViewHolder;", "safetyItems", "", "Lcom/kubi/quotefacade/entity/ChainSafeEntity;", "<init>", "(Ljava/util/List;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", C33954u6.f72238i, ViewProps.POSITION, "getItemCount", "ChainSafetyViewHolder", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46584q extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final List<ChainSafeEntity> f104334i;

    /* JADX INFO: renamed from: yu.q$a */
    /* JADX INFO: compiled from: ChainSafelyAlertDialogHelper.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/quotefacade/adapter/ChainSafetyAdapter$ChainSafetyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Lcom/kubi/quotefacade/adapter/ChainSafetyAdapter;Landroid/view/View;)V", "tvDetail", "Landroid/widget/TextView;", "tvExplain", "ivSafely", "Landroid/widget/ImageView;", "bind", "", "safeEntity", "Lcom/kubi/quotefacade/entity/ChainSafeEntity;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final TextView f104335g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final TextView f104336h;

        /* JADX INFO: renamed from: i */
        @NotNull
        public final ImageView f104337i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C46584q f104338j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull C46584q c46584q, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f104338j = c46584q;
            View viewFindViewById = itemView.findViewById(R$id.tv_safe_detail);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f104335g = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.tv_explain);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.f104336h = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R$id.iv_safe);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.f104337i = (ImageView) viewFindViewById3;
        }

        /* JADX INFO: renamed from: a */
        public final void m102741a(@NotNull ChainSafeEntity safeEntity) {
            Intrinsics.checkNotNullParameter(safeEntity, "safeEntity");
            this.f104335g.setText(safeEntity.getDetail());
            Boolean explain = safeEntity.getExplain();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.areEqual(explain, bool)) {
                this.f104336h.setText(C27059l.f54343a.m66757a().getString(R$string.yes));
            } else {
                this.f104336h.setText(C27059l.f54343a.m66757a().getString(R$string.f40993no));
            }
            if (Intrinsics.areEqual(safeEntity.getSafeLevel(), bool)) {
                this.f104337i.setImageResource(R$drawable.ic2_security_setting_16);
                ImageView imageView = this.f104337i;
                Context context = imageView.getContext();
                int i11 = R$color.c_text;
                imageView.setColorFilter(ContextCompat.getColor(context, i11));
                TextView textView = this.f104335g;
                C27017c c27017c = C27017c.f54310a;
                textView.setTextColor(c27017c.m66512a(i11));
                this.f104336h.setTextColor(c27017c.m66512a(i11));
                return;
            }
            this.f104337i.setImageResource(R$drawable.ic2_security_warning_16);
            ImageView imageView2 = this.f104337i;
            Context context2 = imageView2.getContext();
            int i12 = R$color.complementary;
            imageView2.setColorFilter(ContextCompat.getColor(context2, i12));
            TextView textView2 = this.f104335g;
            C27017c c27017c2 = C27017c.f54310a;
            textView2.setTextColor(c27017c2.m66512a(i12));
            this.f104336h.setTextColor(c27017c2.m66512a(i12));
        }
    }

    public C46584q(@NotNull List<ChainSafeEntity> safetyItems) {
        Intrinsics.checkNotNullParameter(safetyItems, "safetyItems");
        this.f104334i = safetyItems;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull a holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.m102741a(this.f104334i.get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f104334i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.item_list_safely_dialog_view, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(this, viewInflate);
    }
}
