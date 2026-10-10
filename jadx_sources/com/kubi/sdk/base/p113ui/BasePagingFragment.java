package com.kubi.sdk.base.p113ui;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.kubi.resources.widget.C23057g1;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.sdk.R$color;
import com.kubi.sdk.R$drawable;
import com.kubi.sdk.R$id;
import com.kubi.sdk.R$layout;
import com.kubi.sdk.R$mipmap;
import com.kubi.sdk.R$string;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.utils.ToastCompat;
import hb0.InterfaceC38162f;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jb0.InterfaceC40373g;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BasePagingFragment<T extends Parcelable> extends OldBaseFragment {

    /* JADX INFO: renamed from: U */
    public int f46493U = 1;

    /* JADX INFO: renamed from: V */
    public Boolean f46494V = Boolean.TRUE;

    /* JADX INFO: renamed from: W */
    public BaseQuickAdapter<T, BaseViewHolder> f46495W;

    /* JADX INFO: renamed from: X */
    public SwipeRefreshRecyclerView f46496X;

    /* JADX INFO: renamed from: Y */
    public Disposable f46497Y;

    /* JADX INFO: renamed from: com.kubi.sdk.base.ui.BasePagingFragment$a */
    /* JADX INFO: loaded from: classes2.dex */
    public class C23679a extends BaseQuickAdapter<T, BaseViewHolder> {
        public C23679a(int i11) {
            super(i11);
        }

        @Override // io.chad.library.adapter.base.BaseQuickAdapter
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void convert(BaseViewHolder baseViewHolder, T t11) {
            BasePagingFragment.this.mo16439o3(baseViewHolder, t11);
        }
    }

    /* JADX INFO: renamed from: B3 */
    public boolean mo21464B3() {
        return true;
    }

    /* JADX INFO: renamed from: C3 */
    public boolean mo15903C3() {
        return true;
    }

    /* JADX INFO: renamed from: o3 */
    public abstract void mo16439o3(BaseViewHolder baseViewHolder, T t11);

    /* JADX INFO: renamed from: p3 */
    public boolean mo21477p3() {
        return true;
    }

    /* JADX INFO: renamed from: r3 */
    public abstract Observable<BasePageEntity<T>> mo16440r3(int i11, int i12);

    /* JADX INFO: renamed from: s3 */
    public int mo56581s3() {
        return 0;
    }

    /* JADX INFO: renamed from: t3 */
    public int mo15921t3() {
        return 0;
    }

    /* JADX INFO: renamed from: v3 */
    public int mo15923v3() {
        return 0;
    }

    /* JADX INFO: renamed from: x3 */
    public abstract int mo15925x3();

    /* JADX INFO: renamed from: z3 */
    public boolean mo53842z3() {
        return false;
    }

    /* JADX INFO: renamed from: A3 */
    public void mo49243A3() {
        Observable<BasePageEntity<T>> observableMo16440r3 = mo16440r3(this.f46493U, mo17296y3());
        if (observableMo16440r3 == null) {
            showContent();
            this.f46496X.setRefreshing(false);
        } else {
            Disposable disposable = this.f46497Y;
            if (disposable != null) {
                disposable.dispose();
            }
            this.f46497Y = observableMo16440r3.subscribe(new Consumer() { // from class: com.kubi.sdk.base.ui.c
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BasePagingFragment.m56578l3(this.f46514b, (BasePageEntity) obj);
                }
            }, new Consumer() { // from class: com.kubi.sdk.base.ui.d
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BasePagingFragment.m56577k3(this.f46515b, (Throwable) obj);
                }
            });
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.view_swipe_refresh_view;
    }

    /* JADX INFO: renamed from: y3 */
    public int mo17296y3() {
        return 10;
    }

    /* JADX INFO: renamed from: k3 */
    public static /* synthetic */ void m56577k3(final BasePagingFragment basePagingFragment, Throwable th2) {
        SwipeRefreshRecyclerView swipeRefreshRecyclerView;
        if (!basePagingFragment.isDetached() && basePagingFragment.getActivity() != null && !basePagingFragment.getActivity().isFinishing() && (swipeRefreshRecyclerView = basePagingFragment.f46496X) != null) {
            swipeRefreshRecyclerView.setRefreshing(false);
            basePagingFragment.f46495W.addData(new ArrayList());
            if (!basePagingFragment.f46495W.getData().isEmpty()) {
                basePagingFragment.f46495W.loadMoreFail();
            } else {
                if (basePagingFragment.f46495W.getHeaderLayoutCount() == 0) {
                    basePagingFragment.showEmpty();
                } else if (basePagingFragment.m56582u3() != null) {
                    basePagingFragment.showContent();
                    basePagingFragment.f46495W.addFooterView(basePagingFragment.m56582u3());
                }
                if (!(th2 instanceof HttpException) && !(th2 instanceof ConnectException) && !(th2 instanceof UnknownHostException)) {
                    basePagingFragment.showEmpty(R$string.load_failed_click_retry, R$mipmap.ic_load_fail, new View.OnClickListener() { // from class: com.kubi.sdk.base.ui.e
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f46516b.mo15906F3();
                        }
                    });
                } else {
                    ToastCompat.m66437C(R$string.network_error);
                    basePagingFragment.showNetWorkError();
                }
            }
            basePagingFragment.mo35196D3(th2);
            basePagingFragment.mo22112E3(false);
        }
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ void m56578l3(BasePagingFragment basePagingFragment, BasePageEntity basePageEntity) {
        boolean z11;
        if (!basePagingFragment.isDetached() && basePagingFragment.getActivity() != null && !basePagingFragment.getActivity().isFinishing() && basePagingFragment.f46496X != null) {
            if (basePageEntity.getAllowCancelAll() != null) {
                basePagingFragment.f46494V = basePageEntity.getAllowCancelAll();
            }
            BaseQuickAdapter<T, BaseViewHolder> baseQuickAdapter = basePagingFragment.f46495W;
            boolean z12 = false;
            if (basePageEntity.isHasNext() && !basePageEntity.getItems().isEmpty()) {
                z11 = true;
            } else {
                z11 = false;
            }
            baseQuickAdapter.setEnableLoadMore(z11);
            if (basePagingFragment.f46493U == 1) {
                basePagingFragment.f46496X.setRefreshing(false);
                basePagingFragment.f46495W.replaceData(basePagingFragment.mo38075q3(basePageEntity.getItems()));
            } else {
                basePagingFragment.f46495W.addData(basePagingFragment.mo38075q3(basePageEntity.getItems()));
            }
            if (basePagingFragment.mo53842z3()) {
                basePagingFragment.f46493U = basePageEntity.getContext().getIndex();
            } else {
                basePagingFragment.f46493U++;
            }
            if (basePagingFragment.f46495W.getData().size() < basePagingFragment.mo17296y3()) {
                BaseQuickAdapter<T, BaseViewHolder> baseQuickAdapter2 = basePagingFragment.f46495W;
                if (basePagingFragment.f46493U == 1) {
                    z12 = true;
                }
                baseQuickAdapter2.loadMoreEnd(z12);
                if (basePagingFragment.f46495W.getData().isEmpty()) {
                    if (basePagingFragment.f46495W.getHeaderLayoutCount() == 0) {
                        basePagingFragment.showEmpty();
                    } else if (basePagingFragment.m56582u3() != null) {
                        basePagingFragment.showContent();
                        basePagingFragment.f46495W.addFooterView(basePagingFragment.m56582u3());
                    }
                } else {
                    basePagingFragment.showContent();
                    if (basePagingFragment.m56583w3() != null && !basePageEntity.isHasNext()) {
                        basePagingFragment.f46495W.addFooterView(basePagingFragment.m56583w3());
                    }
                }
            } else {
                basePagingFragment.f46495W.loadMoreComplete();
                basePagingFragment.showContent();
                if (basePagingFragment.m56583w3() != null && !basePageEntity.isHasNext()) {
                    basePagingFragment.f46495W.addFooterView(basePagingFragment.m56583w3());
                }
            }
            basePagingFragment.mo22112E3(true);
        }
    }

    /* JADX INFO: renamed from: F3 */
    public void mo15906F3() {
        if (mo21477p3()) {
            this.f46493U = 1;
            mo49243A3();
        } else {
            showEmpty();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f46496X = (SwipeRefreshRecyclerView) view.findViewById(R$id.m_swipe_recycler_view);
        C23679a c23679a = new C23679a(mo15925x3());
        this.f46495W = c23679a;
        c23679a.setLoadMoreView(new C23057g1());
        this.f46495W.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() { // from class: com.kubi.sdk.base.ui.a
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.RequestLoadMoreListener
            public final void onLoadMoreRequested() {
                this.f46512a.mo49243A3();
            }
        }, this.f46496X.getRecyclerView());
        this.f46496X.getRecyclerView().setAdapter(this.f46495W);
        this.f46496X.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.sdk.base.ui.b
            @Override // jb0.InterfaceC40373g
            /* JADX INFO: renamed from: a */
            public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                this.f46513b.mo15906F3();
            }
        });
        this.f46495W.setPreLoadNumber(mo17296y3() / 2);
        this.f46496X.getRecyclerView().setItemAnimator(null);
        showLoading();
        mo15907G3();
        if (mo21464B3()) {
            mo15906F3();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void showContent() {
        super.showContent();
        this.f46495W.removeAllFooterView();
        if (mo15903C3()) {
            this.f46496X.setBackgroundColor(ContextCompat.getColor(this.mContext, R$color.c_background));
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty(int i11, int i12, View.OnClickListener onClickListener) {
        super.showEmpty(i11, i12, onClickListener);
        if (mo15903C3()) {
            this.f46496X.setBackgroundColor(ContextCompat.getColor(this.mContext, R$color.c_overlay));
        }
    }

    /* JADX INFO: renamed from: u3 */
    public View m56582u3() {
        if (mo15903C3()) {
            this.f46496X.setBackgroundColor(ContextCompat.getColor(this.mContext, R$color.c_overlay));
        }
        View viewInflate = View.inflate(this.mContext, R$layout.view_empty, null);
        int i11 = R$id.empty_icon;
        ((ImageView) viewInflate.findViewById(i11)).setImageResource(R$drawable.ic2_common_empty);
        if (mo56581s3() != 0) {
            ((ImageView) viewInflate.findViewById(i11)).setImageResource(mo56581s3());
        }
        if (mo15921t3() != 0) {
            ((TextView) viewInflate.findViewById(R$id.empty_tips)).setText(mo15921t3());
        }
        return viewInflate;
    }

    /* JADX INFO: renamed from: w3 */
    public View m56583w3() {
        if (mo15923v3() == 0) {
            return null;
        }
        View viewInflate = View.inflate(this.mContext, R$layout.view_end, null);
        ((TextView) viewInflate.findViewById(R$id.tv_end)).setText(mo15923v3());
        return viewInflate;
    }

    /* JADX INFO: renamed from: G3 */
    public void mo15907G3() {
    }

    /* JADX INFO: renamed from: D3 */
    public void mo35196D3(Throwable th2) {
    }

    /* JADX INFO: renamed from: E3 */
    public void mo22112E3(boolean z11) {
    }

    /* JADX INFO: renamed from: q3 */
    public Collection<? extends T> mo38075q3(List<T> list) {
        return list;
    }
}
