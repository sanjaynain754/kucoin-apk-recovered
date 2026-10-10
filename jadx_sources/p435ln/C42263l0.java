package p435ln;

import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.kyc.R$layout;
import com.kubi.kyc.R$mipmap;
import com.kubi.utils.C27014a1;
import p205dn.C36888h;
import zg0.AbstractC46843b;

/* JADX INFO: renamed from: ln.l0 */
/* JADX INFO: compiled from: UploadCellViewBinder.java */
/* JADX INFO: loaded from: classes21.dex */
public class C42263l0 extends AbstractC46843b<C42259j0, a> {

    /* JADX INFO: renamed from: ln.l0$a */
    /* JADX INFO: compiled from: UploadCellViewBinder.java */
    public class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        public final C36888h f93736g;

        public a(View view) {
            super(view);
            this.f93736g = C36888h.m82645a(view);
        }
    }

    @Override // zg0.AbstractC46843b
    @NonNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a mo36823d(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        return new a(layoutInflater.inflate(R$layout.busercenter_item_cell_upload, viewGroup, false));
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m92747i(C42259j0 c42259j0, View view) {
        if (!C27014a1.m66501a(view) && c42259j0.m92732g() != null) {
            c42259j0.m92732g().onClick(view);
        }
    }

    @Override // zg0.AbstractC46843b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo36822b(@NonNull a aVar, @NonNull final C42259j0 c42259j0) {
        aVar.f93736g.f81469e.setOnClickListener(new View.OnClickListener() { // from class: ln.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C42263l0.m92747i(c42259j0, view);
            }
        });
        if (!TextUtils.isEmpty(c42259j0.m92731f())) {
            aVar.f93736g.f81467c.setVisibility(0);
            aVar.f93736g.f81467c.setText(c42259j0.m92731f());
        } else {
            aVar.f93736g.f81467c.setVisibility(8);
        }
        if (c42259j0.m92733h() != null) {
            aVar.f93736g.f81468d.setVisibility(0);
            aVar.f93736g.f81468d.setMovementMethod(LinkMovementMethod.getInstance());
            aVar.f93736g.f81468d.setText(c42259j0.m92733h());
        } else {
            aVar.f93736g.f81468d.setVisibility(8);
        }
        if (c42259j0.m92734i()) {
            if (c42259j0.f93695c) {
                aVar.f93736g.f81469e.m37104g(true, R$mipmap.kucoin_icon_in_no);
                aVar.f93736g.f81469e.setIsActive(true);
                aVar.f93736g.f81466b.setVisibility(0);
                aVar.f93736g.f81466b.setText(c42259j0.m92728c());
            } else {
                aVar.f93736g.f81469e.m37104g(true, R$mipmap.kucoin_icon_in_yes);
                aVar.f93736g.f81469e.setIsActive(false);
                aVar.f93736g.f81466b.setVisibility(8);
            }
        } else {
            aVar.f93736g.f81469e.m37103f(false);
            aVar.f93736g.f81469e.setIsActive(false);
            aVar.f93736g.f81466b.setVisibility(8);
        }
        if (!TextUtils.isEmpty(c42259j0.m92727b())) {
            aVar.f93736g.f81469e.m37102e(c42259j0.m92727b());
        }
        if (c42259j0.m92729d() != 0) {
            aVar.f93736g.f81469e.setIcon(c42259j0.m92729d());
        }
        if (!TextUtils.isEmpty(c42259j0.m92730e()) && TextUtils.isEmpty(aVar.f93736g.f81469e.getLabelText())) {
            aVar.f93736g.f81469e.setLabel(c42259j0.m92730e());
        }
    }
}
