package p435ln;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.kyc.R$id;
import com.kubi.kyc.R$layout;
import com.tencent.bugly.proguard.C33954u6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import zg0.AbstractC46843b;

/* JADX INFO: renamed from: ln.g0 */
/* JADX INFO: compiled from: ThreePicTipsCellViewBinder.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0014R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\f¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/kyc/multitype/ThreePicTipsCellViewBinder;", "Lme/drakeet/multitype/ItemViewBinder;", "Lcom/kubi/kyc/multitype/ThreePicTipsCell;", "Lcom/kubi/kyc/multitype/ThreePicTipsCellViewBinder$ViewHolder;", "<init>", "()V", "onTvClick1", "Lkotlin/Function0;", "", "getOnTvClick1", "()Lkotlin/jvm/functions/Function0;", "setOnTvClick1", "(Lkotlin/jvm/functions/Function0;)V", "onTvClick2", "getOnTvClick2", "setOnTvClick2", "onCreateViewHolder", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "onBindViewHolder", C33954u6.f72238i, "item", "ViewHolder", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42253g0 extends AbstractC46843b<C42247d0, a> {

    /* JADX INFO: renamed from: b */
    @Nullable
    public Function0<Unit> f93709b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Function0<Unit> f93710c;

    /* JADX INFO: renamed from: ln.g0$a */
    /* JADX INFO: compiled from: ThreePicTipsCellViewBinder.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, m90084d2 = {"Lcom/kubi/kyc/multitype/ThreePicTipsCellViewBinder$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "llClick1", "Landroid/widget/LinearLayout;", "getLlClick1", "()Landroid/widget/LinearLayout;", "llClick2", "getLlClick2", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final LinearLayout f93711g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final LinearLayout f93712h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.ll_click1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f93711g = (LinearLayout) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.ll_click2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.f93712h = (LinearLayout) viewFindViewById2;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final LinearLayout getF93711g() {
            return this.f93711g;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final LinearLayout getF93712h() {
            return this.f93712h;
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m92701l(C42253g0 c42253g0, View view) {
        Function0<Unit> function0 = c42253g0.f93709b;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m92702m(C42253g0 c42253g0, View view) {
        Function0<Unit> function0 = c42253g0.f93710c;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // zg0.AbstractC46843b
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo36822b(@NotNull a holder, @NotNull C42247d0 item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.getF93711g().setOnClickListener(new View.OnClickListener() { // from class: ln.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C42253g0.m92701l(this.f93705b, view);
            }
        });
        holder.getF93712h().setOnClickListener(new View.OnClickListener() { // from class: ln.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C42253g0.m92702m(this.f93707b, view);
            }
        });
    }

    @Override // zg0.AbstractC46843b
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public a mo36823d(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.busercenter_item_cell_pictips3, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new a(viewInflate);
    }

    /* JADX INFO: renamed from: o */
    public final void m92705o(@Nullable Function0<Unit> function0) {
        this.f93709b = function0;
    }

    /* JADX INFO: renamed from: p */
    public final void m92706p(@Nullable Function0<Unit> function0) {
        this.f93710c = function0;
    }
}
