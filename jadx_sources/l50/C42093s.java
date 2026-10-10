package l50;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.tradingbotkit.R$id;

/* JADX INFO: renamed from: l50.s */
/* JADX INFO: compiled from: BtradingBotKitHotCoinListItemBinding.java */
/* JADX INFO: loaded from: classes51.dex */
public final class C42093s implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f93258a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TextView f93259b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42093s m92341a(@NonNull View view) {
        int i11 = R$id.symbolName;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
        if (textView != null) {
            return new C42093s((ConstraintLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f93258a;
    }

    public C42093s(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView) {
        this.f93258a = constraintLayout;
        this.f93259b = textView;
    }
}
