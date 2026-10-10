package c70;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.c */
/* JADX INFO: compiled from: BusercenterDeleteAccountCannotBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4863c implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f5051a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Button f5052b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final CheckBox f5053c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f5054d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f5055e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4863c m5004a(@NonNull View view) {
        int i11 = R$id.btn_apply;
        Button button = (Button) ViewBindings.findChildViewById(view, i11);
        if (button != null) {
            i11 = R$id.check_read_agree;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i11);
            if (checkBox != null) {
                i11 = R$id.recycler_view;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView != null) {
                    i11 = R$id.tv_agree_protocol_tips;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                    if (textView != null) {
                        return new C4863c((LinearLayoutCompat) view, button, checkBox, recyclerView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f5051a;
    }

    public C4863c(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull Button button, @NonNull CheckBox checkBox, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.f5051a = linearLayoutCompat;
        this.f5052b = button;
        this.f5053c = checkBox;
        this.f5054d = recyclerView;
        this.f5055e = textView;
    }
}
