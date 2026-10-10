package p270ft;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;

/* JADX INFO: renamed from: ft.e */
/* JADX INFO: compiled from: BotcFragmentAddKycinfoBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37611e implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ScrollView f83825a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f83826b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37611e m84803a(@NonNull View view) {
        int i11 = R$id.ll_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
        if (linearLayout != null) {
            return new C37611e((ScrollView) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.f83825a;
    }

    public C37611e(@NonNull ScrollView scrollView, @NonNull LinearLayout linearLayout) {
        this.f83825a = scrollView;
        this.f83826b = linearLayout;
    }
}
