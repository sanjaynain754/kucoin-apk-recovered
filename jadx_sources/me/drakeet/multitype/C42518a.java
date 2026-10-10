package me.drakeet.multitype;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import zg0.AbstractC46843b;
import zg0.C46842a;
import zg0.C46845d;
import zg0.C46846e;
import zg0.InterfaceC46844c;
import zg0.InterfaceC46847f;

/* JADX INFO: renamed from: me.drakeet.multitype.a */
/* JADX INFO: compiled from: MultiTypeAdapter.java */
/* JADX INFO: loaded from: classes61.dex */
public class C42518a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: i */
    @NonNull
    public List<?> f94207i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public InterfaceC46847f f94208j;

    public C42518a() {
        this(Collections.EMPTY_LIST);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @Deprecated
    public final void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i11) {
        onBindViewHolder(viewHolder, i11, Collections.EMPTY_LIST);
    }

    public C42518a(@NonNull List<?> list) {
        this(list, new C46845d());
    }

    /* JADX INFO: renamed from: g */
    public final void m93236g(@NonNull Class<?> cls) {
        if (this.f94208j.mo103188b(cls)) {
            Log.w("MultiTypeAdapter", "You have registered the " + cls.getSimpleName() + " type. It will override the original binder(s).");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f94207i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i11) {
        return this.f94208j.mo103187a(getItemViewType(i11)).m103182a(this.f94207i.get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i11) {
        return m93238i(i11, this.f94207i.get(i11));
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public final AbstractC46843b m93237h(@NonNull RecyclerView.ViewHolder viewHolder) {
        return this.f94208j.mo103187a(viewHolder.getItemViewType());
    }

    /* JADX INFO: renamed from: i */
    public int m93238i(int i11, @NonNull Object obj) throws BinderNotFoundException {
        int iMo103189c = this.f94208j.mo103189c(obj.getClass());
        if (iMo103189c != -1) {
            return iMo103189c + this.f94208j.mo103190d(iMo103189c).mo103181a(i11, obj);
        }
        throw new BinderNotFoundException(obj.getClass());
    }

    /* JADX INFO: renamed from: k */
    public <T> void m93240k(@NonNull Class<? extends T> cls, @NonNull AbstractC46843b<T, ?> abstractC46843b, @NonNull InterfaceC46844c<T> interfaceC46844c) {
        this.f94208j.mo103191e(cls, abstractC46843b, interfaceC46844c);
        abstractC46843b.f104679a = this;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i11, @NonNull List<Object> list) {
        this.f94208j.mo103187a(viewHolder.getItemViewType()).m103183c(viewHolder, this.f94207i.get(i11), list);
    }

    public C42518a(@NonNull List<?> list, @NonNull InterfaceC46847f interfaceC46847f) {
        C46846e.m103192a(list);
        C46846e.m103192a(interfaceC46847f);
        this.f94207i = list;
        this.f94208j = interfaceC46847f;
    }

    /* JADX INFO: renamed from: j */
    public <T> void m93239j(@NonNull Class<? extends T> cls, @NonNull AbstractC46843b<T, ?> abstractC46843b) {
        C46846e.m103192a(cls);
        C46846e.m103192a(abstractC46843b);
        m93236g(cls);
        m93240k(cls, abstractC46843b, new C46842a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i11) {
        return this.f94208j.mo103187a(i11).mo36823d(LayoutInflater.from(viewGroup.getContext()), viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(@NonNull RecyclerView.ViewHolder viewHolder) {
        return m93237h(viewHolder).m103184e(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        m93237h(viewHolder).m103185f(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        m93237h(viewHolder).mo36824g(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(@NonNull RecyclerView.ViewHolder viewHolder) {
        m93237h(viewHolder).m103186h(viewHolder);
    }

    public void setItems(@NonNull List<?> list) {
        C46846e.m103192a(list);
        this.f94207i = list;
    }
}
