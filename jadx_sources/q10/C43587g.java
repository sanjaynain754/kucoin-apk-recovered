package q10;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.search.R$id;
import com.kubi.search.searchinitial.SearchRealtimeView;

/* JADX INFO: renamed from: q10.g */
/* JADX INFO: compiled from: SearchFragmentTopsearchBinding.java */
/* JADX INFO: loaded from: classes44.dex */
public final class C43587g implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f96207a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FragmentContainerView f96208b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final SearchRealtimeView f96209c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43587g m95924a(@NonNull View view) {
        int i11 = R$id.fTopic;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i11);
        if (fragmentContainerView != null) {
            i11 = R$id.realtimeView;
            SearchRealtimeView searchRealtimeView = (SearchRealtimeView) ViewBindings.findChildViewById(view, i11);
            if (searchRealtimeView != null) {
                return new C43587g((LinearLayoutCompat) view, fragmentContainerView, searchRealtimeView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f96207a;
    }

    public C43587g(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull FragmentContainerView fragmentContainerView, @NonNull SearchRealtimeView searchRealtimeView) {
        this.f96207a = linearLayoutCompat;
        this.f96208b = fragmentContainerView;
        this.f96209c = searchRealtimeView;
    }
}
