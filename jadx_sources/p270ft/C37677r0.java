package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.NavigationBar;

/* JADX INFO: renamed from: ft.r0 */
/* JADX INFO: compiled from: PaymentActivityQrcodeScanBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37677r0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final DecoratedBarcodeView f84482a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final DecoratedBarcodeView f84483b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final NavigationBar f84484c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37677r0 m84942a(@NonNull View view) {
        DecoratedBarcodeView decoratedBarcodeView = (DecoratedBarcodeView) view;
        int i11 = R$id.navigation_bar;
        NavigationBar navigationBar = (NavigationBar) ViewBindings.findChildViewById(view, i11);
        if (navigationBar != null) {
            return new C37677r0(decoratedBarcodeView, decoratedBarcodeView, navigationBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public DecoratedBarcodeView getRoot() {
        return this.f84482a;
    }

    public C37677r0(@NonNull DecoratedBarcodeView decoratedBarcodeView, @NonNull DecoratedBarcodeView decoratedBarcodeView2, @NonNull NavigationBar navigationBar) {
        this.f84482a = decoratedBarcodeView;
        this.f84483b = decoratedBarcodeView2;
        this.f84484c = navigationBar;
    }
}
