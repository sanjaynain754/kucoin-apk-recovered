package zg0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.List;
import me.drakeet.multitype.C42518a;

/* JADX INFO: renamed from: zg0.b */
/* JADX INFO: compiled from: ItemViewBinder.java */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC46843b<T, VH extends RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a */
    public C42518a f104679a;

    /* JADX INFO: renamed from: b */
    public abstract void mo36822b(@NonNull VH vh2, @NonNull T t11);

    @NonNull
    /* JADX INFO: renamed from: d */
    public abstract VH mo36823d(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup);

    /* JADX INFO: renamed from: e */
    public boolean m103184e(@NonNull VH vh2) {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public long m103182a(@NonNull T t11) {
        return -1L;
    }

    /* JADX INFO: renamed from: c */
    public void m103183c(@NonNull VH vh2, @NonNull T t11, @NonNull List<Object> list) {
        mo36822b(vh2, t11);
    }

    /* JADX INFO: renamed from: f */
    public void m103185f(@NonNull VH vh2) {
    }

    /* JADX INFO: renamed from: g */
    public void mo36824g(@NonNull VH vh2) {
    }

    /* JADX INFO: renamed from: h */
    public void m103186h(@NonNull VH vh2) {
    }
}
