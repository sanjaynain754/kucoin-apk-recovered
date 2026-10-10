package com.kubi.kyc.multitype;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.kyc.R$color;
import com.kubi.kyc.R$drawable;
import com.kubi.kyc.R$id;
import com.kubi.kyc.R$layout;
import com.kubi.kyc.entity.KycStepsItem;
import com.kubi.kyc.multitype.StepsCellViewBinder;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33954u6;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p435ln.C42243b0;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import zg0.AbstractC46843b;

/* JADX INFO: compiled from: StepsCellViewBinder.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/kyc/multitype/StepsCellViewBinder;", "Lme/drakeet/multitype/ItemViewBinder;", "Lcom/kubi/kyc/multitype/StepsCell;", "Lcom/kubi/kyc/multitype/StepsCellViewBinder$ViewHolder;", "<init>", "()V", "runnable", "Ljava/lang/Runnable;", "getRunnable", "()Ljava/lang/Runnable;", "setRunnable", "(Ljava/lang/Runnable;)V", "onCreateViewHolder", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "onBindViewHolder", "", C33954u6.f72238i, "item", "onViewDetachedFromWindow", "ViewHolder", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class StepsCellViewBinder extends AbstractC46843b<C42243b0, C17117a> {

    /* JADX INFO: renamed from: b */
    @Nullable
    public Runnable f31232b;

    /* JADX INFO: renamed from: com.kubi.kyc.multitype.StepsCellViewBinder$a */
    /* JADX INFO: compiled from: StepsCellViewBinder.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kyc/multitype/StepsCellViewBinder$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17117a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @Nullable
        public final RecyclerView f31233g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17117a(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f31233g = (RecyclerView) itemView.findViewById(R$id.recycler_view);
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final RecyclerView getF31233g() {
            return this.f31233g;
        }
    }

    @Override // zg0.AbstractC46843b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo36822b(@NotNull C17117a holder, @NotNull final C42243b0 item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        final RecyclerView f31233g = holder.getF31233g();
        if (f31233g != null) {
            Runnable runnable = new Runnable() { // from class: ln.c0
                @Override // java.lang.Runnable
                public final void run() {
                    StepsCellViewBinder.m36821k(f31233g, item);
                }
            };
            this.f31232b = runnable;
            f31233g.post(runnable);
        }
    }

    @Override // zg0.AbstractC46843b
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C17117a mo36823d(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.kucoin_view_recyclerview, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new C17117a(viewInflate);
    }

    @Override // zg0.AbstractC46843b
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo36824g(@NotNull C17117a holder) {
        RecyclerView f31233g;
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.mo36824g(holder);
        Runnable runnable = this.f31232b;
        if (runnable == null || (f31233g = holder.getF31233g()) == null) {
            return;
        }
        f31233g.removeCallbacks(runnable);
    }

    /* JADX INFO: renamed from: k */
    public static final void m36821k(RecyclerView recyclerView, C42243b0 c42243b0) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((LinearLayoutManager) layoutManager).setOrientation(0);
        final int width = recyclerView.getWidth();
        if (recyclerView.getAdapter() == null) {
            final int i11 = R$layout.busercenter_item_cell_steps_item;
            final List<KycStepsItem> listM92687a = c42243b0.m92687a();
            recyclerView.setAdapter(new BaseQuickAdapter<KycStepsItem, BaseViewHolder>(i11, listM92687a) { // from class: com.kubi.kyc.multitype.StepsCellViewBinder$onBindViewHolder$1$1$mAdapter$1
                @Override // io.chad.library.adapter.base.BaseQuickAdapter
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public void convert(BaseViewHolder baseViewHolder, KycStepsItem kycStepsItem) {
                    Integer step;
                    if (baseViewHolder != null) {
                        int i12 = width;
                        ViewGroup.LayoutParams layoutParams = baseViewHolder.itemView.getLayoutParams();
                        layoutParams.width = i12 / getData().size();
                        baseViewHolder.itemView.setLayoutParams(layoutParams);
                        int i13 = R$id.tv_step;
                        baseViewHolder.setText(i13, String.valueOf((kycStepsItem == null || (step = kycStepsItem.getStep()) == null) ? null : Integer.valueOf(C27039d.m66650j(step))));
                        int i14 = R$id.tv_step_label;
                        baseViewHolder.setText(i14, C27041f.m66668h(kycStepsItem != null ? kycStepsItem.getTitle() : null));
                        if (baseViewHolder.getAdapterPosition() == 0) {
                            View view = baseViewHolder.getView(R$id.view_line_left);
                            Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
                            ViewExtKt.m66577h(view);
                            baseViewHolder.setBackgroundRes(i13, R$drawable.shape_oval_primary);
                            Context mContext = this.mContext;
                            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
                            int i15 = R$color.c_text;
                            baseViewHolder.setTextColor(i13, C27046k.m66699n(mContext, i15));
                            Context mContext2 = this.mContext;
                            Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
                            baseViewHolder.setTextColor(i14, C27046k.m66699n(mContext2, i15));
                        } else {
                            View view2 = baseViewHolder.getView(R$id.view_line_left);
                            Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
                            ViewExtKt.m66594y(view2);
                            baseViewHolder.setBackgroundRes(i13, R$drawable.shape_oval_emphasis20);
                            Context mContext3 = this.mContext;
                            Intrinsics.checkNotNullExpressionValue(mContext3, "mContext");
                            int i16 = R$color.c_text60;
                            baseViewHolder.setTextColor(i13, C27046k.m66699n(mContext3, i16));
                            Context mContext4 = this.mContext;
                            Intrinsics.checkNotNullExpressionValue(mContext4, "mContext");
                            baseViewHolder.setTextColor(i14, C27046k.m66699n(mContext4, i16));
                        }
                        if (baseViewHolder.getAdapterPosition() == getData().size() - 1) {
                            View view3 = baseViewHolder.getView(R$id.view_line_right);
                            Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
                            ViewExtKt.m66577h(view3);
                        } else {
                            View view4 = baseViewHolder.getView(R$id.view_line_right);
                            Intrinsics.checkNotNullExpressionValue(view4, "getView(...)");
                            ViewExtKt.m66594y(view4);
                        }
                    }
                }
            });
        } else {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type io.chad.library.adapter.base.BaseQuickAdapter<com.kubi.kyc.entity.KycStepsItem, io.chad.library.adapter.base.BaseViewHolder>");
            ((BaseQuickAdapter) adapter).setNewData(c42243b0.m92687a());
        }
    }
}
