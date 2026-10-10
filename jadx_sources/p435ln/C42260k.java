package p435ln;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.kyc.R$color;
import com.kubi.kyc.R$drawable;
import com.kubi.kyc.R$layout;
import com.kubi.kyc.R$string;
import com.kubi.sdk.BaseApplication;
import com.kubi.utils.C27014a1;
import p205dn.C36886f;
import zg0.AbstractC46843b;

/* JADX INFO: renamed from: ln.k */
/* JADX INFO: compiled from: ChooseCellViewBinder.java */
/* JADX INFO: loaded from: classes21.dex */
public class C42260k extends AbstractC46843b<C42254h, a> {

    /* JADX INFO: renamed from: ln.k$a */
    /* JADX INFO: compiled from: ChooseCellViewBinder.java */
    public static class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        public final C36886f f93734g;

        public a(View view) {
            super(view);
            C36886f c36886fM82641a = C36886f.m82641a(view);
            this.f93734g = c36886fM82641a;
            c36886fM82641a.f81459d.setFocusable(false);
        }
    }

    @Override // zg0.AbstractC46843b
    @NonNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public a mo36823d(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        return new a(layoutInflater.inflate(R$layout.busercenter_item_cell_choose, viewGroup, false));
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m92742i(C42254h c42254h, View view) {
        if (!C27014a1.m66501a(view) && c42254h.m92714g() != null) {
            c42254h.m92714g().onClick(view);
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m92743j(C42254h c42254h, View view) {
        if (!C27014a1.m66501a(view) && c42254h.m92713f() != null) {
            c42254h.m92713f().onClick(view);
        }
    }

    @Override // zg0.AbstractC46843b
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo36822b(@NonNull a aVar, @NonNull final C42254h c42254h) {
        if (!TextUtils.isEmpty(c42254h.m92712e())) {
            aVar.f93734g.f81457b.setVisibility(0);
            if (c42254h.m92715h()) {
                aVar.f93734g.f81457b.setTextLabel(c42254h.m92712e());
            } else {
                aVar.f93734g.f81457b.setText(c42254h.m92712e());
            }
        } else {
            aVar.f93734g.f81457b.setVisibility(8);
        }
        if (c42254h.m92717j()) {
            aVar.f93734g.f81458c.setVisibility(0);
            aVar.f93734g.f81458c.setOnClickListener(new View.OnClickListener() { // from class: ln.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C42260k.m92742i(c42254h, view);
                }
            });
        } else {
            aVar.f93734g.f81458c.setVisibility(8);
        }
        aVar.f93734g.f81459d.setTag(aVar.f93734g.f81459d.getId(), c42254h);
        aVar.f93734g.f81459d.setOnClickListener(new View.OnClickListener() { // from class: ln.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C42260k.m92743j(c42254h, view);
            }
        });
        if (!TextUtils.isEmpty(c42254h.m92709b())) {
            aVar.f93734g.f81459d.setText(c42254h.m92709b());
            aVar.f93734g.f81459d.setTextColor(aVar.f93734g.f81459d.getResources().getColor(R$color.c_text));
        } else if (!TextUtils.isEmpty(c42254h.m92711d())) {
            aVar.f93734g.f81459d.setText(c42254h.m92711d());
            aVar.f93734g.f81459d.setTextColor(aVar.f93734g.f81459d.getResources().getColor(R$color.c_text20));
        }
        if (TextUtils.isEmpty(c42254h.m92710c())) {
            c42254h.m92718k(BaseApplication.get().getResources().getString(R$string.email_not_valid));
        }
        aVar.f93734g.f81460e.setText(c42254h.m92710c());
        if (c42254h.f93695c) {
            aVar.f93734g.f81459d.setActivated(true);
            aVar.f93734g.f81460e.setVisibility(0);
        } else {
            aVar.f93734g.f81459d.setActivated(false);
            aVar.f93734g.f81460e.setVisibility(8);
        }
        if (c42254h.m92716i()) {
            C27014a1.m66504d(aVar.f93734g.f81459d, R$drawable.icon_arrow_right_mirrored, 5);
        } else {
            C27014a1.m66504d(aVar.f93734g.f81459d, 0, 5);
        }
    }
}
