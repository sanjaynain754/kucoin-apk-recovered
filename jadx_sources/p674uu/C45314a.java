package p674uu;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.kubi.qrcode.lib.R$id;
import com.kubi.resources.widget.NavigationBar;

/* JADX INFO: renamed from: uu.a */
/* JADX INFO: compiled from: KucoinActivityQrcodeScanBinding.java */
/* JADX INFO: loaded from: classes36.dex */
public final class C45314a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final DecoratedBarcodeView f101876a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final DecoratedBarcodeView f101877b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final NavigationBar f101878c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45314a m100182a(@NonNull View view) {
        DecoratedBarcodeView decoratedBarcodeView = (DecoratedBarcodeView) view;
        int i11 = R$id.navigation_bar;
        NavigationBar navigationBar = (NavigationBar) ViewBindings.findChildViewById(view, i11);
        if (navigationBar != null) {
            return new C45314a(decoratedBarcodeView, decoratedBarcodeView, navigationBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public DecoratedBarcodeView getRoot() {
        return this.f101876a;
    }

    public C45314a(@NonNull DecoratedBarcodeView decoratedBarcodeView, @NonNull DecoratedBarcodeView decoratedBarcodeView2, @NonNull NavigationBar navigationBar) {
        this.f101876a = decoratedBarcodeView;
        this.f101877b = decoratedBarcodeView2;
        this.f101878c = navigationBar;
    }
}
