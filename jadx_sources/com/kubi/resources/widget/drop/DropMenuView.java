package com.kubi.resources.widget.drop;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.resources.widget.drop.DropMenuView;
import com.kubi.sdk.res.R$anim;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$drawable;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$layout;
import com.kubi.utils.C27014a1;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import ro.C44128b;

/* JADX INFO: loaded from: classes13.dex */
public class DropMenuView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    public LinearLayout f44529b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f44530c;

    /* JADX INFO: renamed from: d */
    public View f44531d;

    /* JADX INFO: renamed from: e */
    public List<ChooseAdapter> f44532e;

    /* JADX INFO: renamed from: f */
    public Consumer<Boolean> f44533f;

    /* JADX INFO: renamed from: g */
    public Consumer<List<FilterType.InterfaceC23033b>> f44534g;

    /* JADX INFO: renamed from: h */
    public Consumer<Boolean> f44535h;

    /* JADX INFO: renamed from: i */
    public Boolean f44536i;

    /* JADX INFO: renamed from: j */
    public TextView f44537j;

    /* JADX INFO: renamed from: k */
    public TextView f44538k;

    /* JADX INFO: renamed from: l */
    public Boolean f44539l;

    /* JADX INFO: renamed from: m */
    public Boolean f44540m;

    public class ChooseAdapter extends BaseQuickAdapter<FilterType.InterfaceC23033b, BaseViewHolder> {

        /* JADX INFO: renamed from: i */
        public final Consumer<Integer> f44541i;

        /* JADX WARN: Illegal instructions before constructor call */
        public ChooseAdapter(@Nullable FilterType.InterfaceC23033b[] interfaceC23033bArr, Consumer<Integer> consumer) {
            int i11 = R$layout.view_drop_menu_item;
            Objects.requireNonNull(interfaceC23033bArr);
            super(i11, Arrays.asList(interfaceC23033bArr));
            this.f44541i = consumer;
            setHasStableIds(true);
        }

        @Override // io.chad.library.adapter.base.BaseQuickAdapter
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void convert(final BaseViewHolder baseViewHolder, final FilterType.InterfaceC23033b interfaceC23033b) {
            int i11 = R$id.tv_label;
            baseViewHolder.setText(i11, interfaceC23033b.getF44544a()).setBackgroundRes(i11, interfaceC23033b.getF44546c() ? m55151i() : m55152j()).setTextColor(i11, baseViewHolder.itemView.getResources().getColor(interfaceC23033b.getF44546c() ? R$color.c_text : R$color.c_text60));
            ImageView imageView = (ImageView) baseViewHolder.getView(R$id.iv_choose);
            imageView.setImageResource(interfaceC23033b.getF44546c() ? R$drawable.kucoin_icon_choose_label_mirrored : 0);
            if (DropMenuView.this.f44536i.booleanValue()) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(interfaceC23033b.getF44546c() ? 0 : 8);
            }
            baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: uw.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DropMenuView.ChooseAdapter.m55149g(this.f101912b, interfaceC23033b, baseViewHolder, view);
                }
            });
        }

        /* JADX INFO: renamed from: i */
        public final int m55151i() {
            return DropMenuView.this.f44536i.booleanValue() ? R$drawable.shape_border_emphasis_20r : R$drawable.shape_border_primary_4r;
        }

        /* JADX INFO: renamed from: j */
        public final int m55152j() {
            return DropMenuView.this.f44536i.booleanValue() ? R$drawable.shape_border_divider8_20r : R$drawable.shape_emphasis4_4r;
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ void m55149g(ChooseAdapter chooseAdapter, FilterType.InterfaceC23033b interfaceC23033b, BaseViewHolder baseViewHolder, View view) {
            chooseAdapter.getClass();
            if (!C27014a1.m66501a(view)) {
                Iterator<FilterType.InterfaceC23033b> it = chooseAdapter.getData().iterator();
                while (it.hasNext()) {
                    it.next().mo55155c(false);
                }
                interfaceC23033b.mo55155c(true);
                chooseAdapter.notifyDataSetChanged();
                Consumer<Integer> consumer = chooseAdapter.f44541i;
                if (consumer != null) {
                    try {
                        consumer.accept(Integer.valueOf(baseViewHolder.getPosition()));
                    } catch (Exception e11) {
                        C44128b.m97264h(e11);
                    }
                }
            }
        }
    }

    public DropMenuView(@NonNull Context context) {
        super(context);
        this.f44532e = new ArrayList();
        Boolean bool = Boolean.FALSE;
        this.f44536i = bool;
        this.f44539l = Boolean.TRUE;
        this.f44540m = bool;
        m55144g();
    }

    /* JADX INFO: renamed from: d */
    public void m55141d() {
        this.f44534g = null;
        this.f44532e.clear();
        LinearLayout linearLayout = this.f44529b;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m55140c(Context context, List<C23034a.a> list, Consumer<List<FilterType.InterfaceC23033b>> consumer) {
        this.f44534g = consumer;
        for (C23034a.a aVar : list) {
            View viewInflate = LayoutInflater.from(context).inflate(R$layout.view_filter_item, (ViewGroup) null);
            BaseViewHolder baseViewHolder = new BaseViewHolder(viewInflate);
            TextView textView = (TextView) baseViewHolder.getView(R$id.tv_title);
            textView.setText(aVar.m55169c());
            C27046k.m66692g(textView, C5275i0.m6236a(4.0f));
            if (this.f44536i.booleanValue()) {
                textView.setTextSize(12.0f);
                textView.setTextColor(getResources().getColor(R$color.c_text40));
            }
            RecyclerView recyclerView = (RecyclerView) baseViewHolder.getView(R$id.recycler_view);
            recyclerView.setLayoutManager(new GridLayoutManager(context, aVar.m55170d()));
            ChooseAdapter chooseAdapter = new ChooseAdapter(aVar.m55168b(), aVar.m55167a());
            recyclerView.setAdapter(chooseAdapter);
            this.f44532e.add(chooseAdapter);
            LinearLayout linearLayout = this.f44529b;
            if (linearLayout != null) {
                linearLayout.addView(viewInflate);
            }
        }
        if (this.f44536i.booleanValue()) {
            return;
        }
        this.f44537j.setBackgroundResource(R$color.emphasis4);
        this.f44537j.setTextColor(getResources().getColor(R$color.c_text60));
        this.f44537j.setTextSize(16.0f);
        this.f44538k.setBackgroundResource(R$color.primary);
        this.f44538k.setTextColor(getResources().getColor(R$color.selector_color_for_button));
        this.f44538k.setTextSize(16.0f);
        ViewExtKt.m66578i(this.f44537j, C5275i0.m6236a(48.0f));
        ViewExtKt.m66578i(this.f44538k, C5275i0.m6236a(48.0f));
        ViewExtKt.m66584o(this.f44537j, 0, 0, 0, 0);
        ViewExtKt.m66584o(this.f44538k, 0, 0, 0, 0);
    }

    /* JADX INFO: renamed from: e */
    public void m55142e() {
        if (this.f44530c.getVisibility() == 8) {
            return;
        }
        this.f44530c.setVisibility(8);
        this.f44531d.setVisibility(8);
        if (this.f44539l.booleanValue()) {
            this.f44530c.setAnimation(AnimationUtils.loadAnimation(getContext(), R$anim.dd_menu_out));
            this.f44531d.setAnimation(AnimationUtils.loadAnimation(getContext(), R$anim.dd_mask_out));
        }
        Consumer<Boolean> consumer = this.f44533f;
        if (consumer != null) {
            try {
                consumer.accept(Boolean.FALSE);
            } catch (Exception e11) {
                C44128b.m97264h(e11);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m55143f() {
        FilterType.InterfaceC23033b interfaceC23033b;
        for (ChooseAdapter chooseAdapter : this.f44532e) {
            if (chooseAdapter != null) {
                List<FilterType.InterfaceC23033b> data = chooseAdapter.getData();
                if (!data.isEmpty() && (interfaceC23033b = data.get(0)) != null && !interfaceC23033b.getF44546c()) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<FilterType.InterfaceC23033b> getFilterData() {
        ArrayList arrayList = new ArrayList();
        for (ChooseAdapter chooseAdapter : this.f44532e) {
            for (int i11 = 0; i11 < chooseAdapter.getData().size(); i11++) {
                FilterType.InterfaceC23033b interfaceC23033b = chooseAdapter.getData().get(i11);
                if (interfaceC23033b.getF44546c()) {
                    arrayList.add(interfaceC23033b);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public final void m55146i() {
        this.f44530c.setVisibility(0);
        this.f44531d.setVisibility(0);
        if (this.f44539l.booleanValue()) {
            this.f44530c.setAnimation(AnimationUtils.loadAnimation(getContext(), R$anim.dd_menu_in));
            this.f44531d.setAnimation(AnimationUtils.loadAnimation(getContext(), R$anim.dd_mask_in));
        }
        Consumer<Boolean> consumer = this.f44533f;
        if (consumer != null) {
            try {
                consumer.accept(Boolean.TRUE);
            } catch (Exception e11) {
                C44128b.m97264h(e11);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m55147j() {
        this.f44540m = Boolean.TRUE;
        this.f44530c.setVisibility(0);
    }

    /* JADX INFO: renamed from: k */
    public void m55148k() {
        FrameLayout frameLayout = this.f44530c;
        if (frameLayout == null) {
            return;
        }
        if (frameLayout.getVisibility() == 0) {
            m55142e();
        } else {
            m55146i();
        }
    }

    public void setNew(Boolean bool) {
        this.f44536i = bool;
    }

    public void setResetCallBack(Consumer<Boolean> consumer) {
        this.f44535h = consumer;
    }

    public void setShowCallBack(Consumer<Boolean> consumer) {
        this.f44533f = consumer;
    }

    /* JADX INFO: renamed from: g */
    public final void m55144g() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.view_drop_menu, this);
        this.f44529b = (LinearLayout) viewInflate.findViewById(R$id.fl_container);
        this.f44530c = (FrameLayout) viewInflate.findViewById(R$id.fl_menu);
        int i11 = R$id.view_shadow;
        this.f44531d = viewInflate.findViewById(i11);
        viewInflate.findViewById(i11).setOnClickListener(new View.OnClickListener() { // from class: uw.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101911b.m55145h(view);
            }
        });
        this.f44537j = (TextView) viewInflate.findViewById(R$id.tv_reset);
        this.f44538k = (TextView) viewInflate.findViewById(R$id.tv_confirm);
        this.f44537j.setOnClickListener(new View.OnClickListener() { // from class: uw.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101911b.m55145h(view);
            }
        });
        this.f44538k.setOnClickListener(new View.OnClickListener() { // from class: uw.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101911b.m55145h(view);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m55145h(View view) {
        if (!C27014a1.m66501a(view)) {
            int id2 = view.getId();
            if (id2 == R$id.view_shadow) {
                m55142e();
                return;
            }
            if (id2 == R$id.tv_reset) {
                for (ChooseAdapter chooseAdapter : this.f44532e) {
                    Iterator<FilterType.InterfaceC23033b> it = chooseAdapter.getData().iterator();
                    while (it.hasNext()) {
                        it.next().mo55155c(false);
                    }
                    chooseAdapter.getData().get(0).mo55155c(true);
                    chooseAdapter.notifyDataSetChanged();
                }
                Consumer<Boolean> consumer = this.f44535h;
                if (consumer != null) {
                    try {
                        consumer.accept(Boolean.TRUE);
                        return;
                    } catch (Exception e11) {
                        C44128b.m97264h(e11);
                        return;
                    }
                }
                return;
            }
            if (id2 == R$id.tv_confirm) {
                if (this.f44534g != null) {
                    ArrayList arrayList = new ArrayList();
                    for (ChooseAdapter chooseAdapter2 : this.f44532e) {
                        for (int i11 = 0; i11 < chooseAdapter2.getData().size(); i11++) {
                            FilterType.InterfaceC23033b interfaceC23033b = chooseAdapter2.getData().get(i11);
                            if (interfaceC23033b.getF44546c()) {
                                arrayList.add(interfaceC23033b);
                            }
                        }
                    }
                    try {
                        this.f44534g.accept(arrayList);
                    } catch (Exception e12) {
                        C44128b.m97264h(e12);
                    }
                }
                if (!this.f44540m.booleanValue()) {
                    m55142e();
                }
            }
        }
    }

    public void setUesAnim(boolean z11) {
        this.f44539l = Boolean.valueOf(z11);
    }

    public DropMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44532e = new ArrayList();
        Boolean bool = Boolean.FALSE;
        this.f44536i = bool;
        this.f44539l = Boolean.TRUE;
        this.f44540m = bool;
        m55144g();
    }

    public DropMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f44532e = new ArrayList();
        Boolean bool = Boolean.FALSE;
        this.f44536i = bool;
        this.f44539l = Boolean.TRUE;
        this.f44540m = bool;
        m55144g();
    }
}
