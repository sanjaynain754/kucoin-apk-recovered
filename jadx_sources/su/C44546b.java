package su;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.profit.loss.analysis.lib.AssetEmptyView;
import com.kubi.profit.loss.analysis.lib.R$id;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.chart.view.LineChartView;

/* JADX INFO: renamed from: su.b */
/* JADX INFO: compiled from: FragmentProfitAnalysisContentBinding.java */
/* JADX INFO: loaded from: classes35.dex */
public final class C44546b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f98759a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KuCheckBox f98760b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f98761c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LineChartView f98762d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f98763e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RecyclerView f98764f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AssetEmptyView f98765g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44546b m98611a(@NonNull View view) {
        int i11 = R$id.check_fund;
        KuCheckBox kuCheckBox = (KuCheckBox) ViewBindings.findChildViewById(view, i11);
        if (kuCheckBox != null) {
            i11 = R$id.content;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat != null) {
                i11 = R$id.lineChart;
                LineChartView lineChartView = (LineChartView) ViewBindings.findChildViewById(view, i11);
                if (lineChartView != null) {
                    i11 = R$id.loading;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView != null) {
                        i11 = R$id.rangTypeListView;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                        if (recyclerView != null) {
                            i11 = R$id.viewEmpty;
                            AssetEmptyView assetEmptyView = (AssetEmptyView) ViewBindings.findChildViewById(view, i11);
                            if (assetEmptyView != null) {
                                return new C44546b((LinearLayout) view, kuCheckBox, linearLayoutCompat, lineChartView, imageView, recyclerView, assetEmptyView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f98759a;
    }

    public C44546b(@NonNull LinearLayout linearLayout, @NonNull KuCheckBox kuCheckBox, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LineChartView lineChartView, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull AssetEmptyView assetEmptyView) {
        this.f98759a = linearLayout;
        this.f98760b = kuCheckBox;
        this.f98761c = linearLayoutCompat;
        this.f98762d = lineChartView;
        this.f98763e = imageView;
        this.f98764f = recyclerView;
        this.f98765g = assetEmptyView;
    }
}
