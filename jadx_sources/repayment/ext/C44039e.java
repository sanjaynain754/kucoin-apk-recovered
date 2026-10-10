package repayment.ext;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.StrictDividerItemDecoration;
import com.kubi.unify.R$color;
import com.kubi.unify.R$drawable;
import com.kubi.unify.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import java.util.List;
import l60.C42110e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p575qw.C43884e;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import repayment.UnifiedRepayFragment;
import repayment.UnifyAssetData;
import repayment.UnifyLiabilityData;
import repayment.dialog.AssetsSelectedDialog;

/* JADX INFO: renamed from: repayment.ext.e */
/* JADX INFO: compiled from: RepayAssetUIExt.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a&\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\"\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¨\u0006\u0010"}, m90084d2 = {"initAssetsUI", "", "Lrepayment/UnifiedRepayFragment;", "showRepayAssetListDetailPanel", "updateAssetSignArrowDrawable", "isExpand", "", "emptyAssetsUI", "updateRepayAssetDetailPanel", "updateList", "", "Lrepayment/UnifyAssetData;", "fillAssetsUI", "totalAssetsPriceDisplay", "", "selectedAssetList", "BUnifyAccountLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRepayAssetUIExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepayAssetUIExt.kt\nrepayment/ext/RepayAssetUIExtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,193:1\n1#2:194\n*E\n"})
public final class C44039e {
    /* JADX INFO: renamed from: e */
    public static final void m97106e(@NotNull UnifiedRepayFragment unifiedRepayFragment) {
        Intrinsics.checkNotNullParameter(unifiedRepayFragment, "<this>");
        C42110e c42110eM97005r3 = unifiedRepayFragment.m97005r3();
        if (c42110eM97005r3 != null) {
            c42110eM97005r3.f93501s.setText(unifiedRepayFragment.m97006s3());
            c42110eM97005r3.f93501s.setVisibility(0);
            c42110eM97005r3.f93496n.setVisibility(8);
            BaseTextView baseTextView = c42110eM97005r3.f93498p;
            int i11 = R$string.stub;
            baseTextView.setText(i11);
            c42110eM97005r3.f93498p.setVisibility(8);
            unifiedRepayFragment.m97004q3().m1432g();
            c42110eM97005r3.f93496n.setVisibility(8);
            c42110eM97005r3.f93499q.setVisibility(8);
            c42110eM97005r3.f93499q.setText(i11);
            unifiedRepayFragment.m97003p3().m1440g();
            m97114m(unifiedRepayFragment, false);
            c42110eM97005r3.f93497o.setVisibility(8);
            c42110eM97005r3.f93502t.setText(i11);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m97107f(@NotNull final UnifiedRepayFragment unifiedRepayFragment, @NotNull String totalAssetsPriceDisplay, @NotNull List<UnifyAssetData> selectedAssetList) {
        Intrinsics.checkNotNullParameter(unifiedRepayFragment, "<this>");
        Intrinsics.checkNotNullParameter(totalAssetsPriceDisplay, "totalAssetsPriceDisplay");
        Intrinsics.checkNotNullParameter(selectedAssetList, "selectedAssetList");
        if (selectedAssetList.isEmpty()) {
            m97106e(unifiedRepayFragment);
            return;
        }
        C42110e c42110eM97005r3 = unifiedRepayFragment.m97005r3();
        if (c42110eM97005r3 != null) {
            c42110eM97005r3.f93501s.setVisibility(8);
            c42110eM97005r3.f93496n.setVisibility(0);
            unifiedRepayFragment.m97004q3().m1436k(selectedAssetList);
            c42110eM97005r3.f93498p.setVisibility(0);
            c42110eM97005r3.f93498p.setText(totalAssetsPriceDisplay);
            c42110eM97005r3.f93499q.setText(CollectionsKt.joinToString$default(selectedAssetList, ",", null, null, 0, null, new Function1() { // from class: repayment.ext.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C44039e.m97108g(unifiedRepayFragment, (UnifyAssetData) obj);
                }
            }, 30, null));
            unifiedRepayFragment.m97003p3().m1443j(selectedAssetList);
            c42110eM97005r3.f93499q.setVisibility(0);
            m97114m(unifiedRepayFragment, true);
            c42110eM97005r3.f93497o.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final CharSequence m97108g(UnifiedRepayFragment unifiedRepayFragment, UnifyAssetData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String currencyName = it.getCurrencyName();
        if (currencyName != null) {
            return currencyName;
        }
        String string = unifiedRepayFragment.getString(R$string.stub);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: h */
    public static final void m97109h(@NotNull final UnifiedRepayFragment unifiedRepayFragment) {
        Intrinsics.checkNotNullParameter(unifiedRepayFragment, "<this>");
        C42110e c42110eM97005r3 = unifiedRepayFragment.m97005r3();
        if (c42110eM97005r3 != null) {
            BaseTextView tvAssetTitle = c42110eM97005r3.f93500r;
            Intrinsics.checkNotNullExpressionValue(tvAssetTitle, "tvAssetTitle");
            C22912t.m54411i(tvAssetTitle, R$color.c_icon);
            BaseTextView tvAssetCurrencyListView = c42110eM97005r3.f93499q;
            Intrinsics.checkNotNullExpressionValue(tvAssetCurrencyListView, "tvAssetCurrencyListView");
            C22912t.m54411i(tvAssetCurrencyListView, R$color.c_icon60);
            View assetClickRectView = c42110eM97005r3.f93485c;
            Intrinsics.checkNotNullExpressionValue(assetClickRectView, "assetClickRectView");
            C27046k.m66711z(assetClickRectView, 0L, new Function0() { // from class: repayment.ext.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C44039e.m97110i(unifiedRepayFragment);
                }
            }, 1, null);
            c42110eM97005r3.f93497o.setAdapter(unifiedRepayFragment.m97003p3());
            c42110eM97005r3.f93497o.setLayoutManager(new LinearLayoutManager(unifiedRepayFragment.getContext(), 1, false));
            c42110eM97005r3.f93497o.addItemDecoration(new StrictDividerItemDecoration(0, 8, 0, 4, null));
            c42110eM97005r3.f93496n.setAdapter(unifiedRepayFragment.m97004q3());
            c42110eM97005r3.f93496n.setLayoutManager(new GridLayoutManager(unifiedRepayFragment.requireContext(), 2));
            BaseTextView tvAssetCurrencyListView2 = c42110eM97005r3.f93499q;
            Intrinsics.checkNotNullExpressionValue(tvAssetCurrencyListView2, "tvAssetCurrencyListView");
            C27046k.m66711z(tvAssetCurrencyListView2, 0L, new Function0() { // from class: repayment.ext.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C44039e.m97111j(unifiedRepayFragment);
                }
            }, 1, null);
            BaseTextView tvAssetCurrencyAmount = c42110eM97005r3.f93498p;
            Intrinsics.checkNotNullExpressionValue(tvAssetCurrencyAmount, "tvAssetCurrencyAmount");
            C27046k.m66711z(tvAssetCurrencyAmount, 0L, new Function0() { // from class: repayment.ext.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C44039e.m97112k(unifiedRepayFragment);
                }
            }, 1, null);
        }
        m97106e(unifiedRepayFragment);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m97110i(UnifiedRepayFragment unifiedRepayFragment) {
        AssetsSelectedDialog.Companion companion = AssetsSelectedDialog.f97273u0;
        UnifyLiabilityData value = unifiedRepayFragment.m97008u3().m96987w().getValue();
        FragmentManager childFragmentManager = unifiedRepayFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.show(value, childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final void m97115n(@NotNull UnifiedRepayFragment unifiedRepayFragment, @Nullable List<UnifyAssetData> list, boolean z11) {
        Intrinsics.checkNotNullParameter(unifiedRepayFragment, "<this>");
        C42110e c42110eM97005r3 = unifiedRepayFragment.m97005r3();
        if (c42110eM97005r3 != null) {
            if (z11) {
                RecyclerView rvAssetsIconGroupView = c42110eM97005r3.f93496n;
                Intrinsics.checkNotNullExpressionValue(rvAssetsIconGroupView, "rvAssetsIconGroupView");
                ViewExtKt.m66594y(rvAssetsIconGroupView);
                if (list != null) {
                    unifiedRepayFragment.m97003p3().m1443j(list);
                    return;
                }
                return;
            }
            RecyclerView rvAssetsIconGroupView2 = c42110eM97005r3.f93496n;
            Intrinsics.checkNotNullExpressionValue(rvAssetsIconGroupView2, "rvAssetsIconGroupView");
            ViewExtKt.m66577h(rvAssetsIconGroupView2);
            if (list != null) {
                unifiedRepayFragment.m97003p3().m1443j(list);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m97111j(UnifiedRepayFragment unifiedRepayFragment) {
        m97113l(unifiedRepayFragment);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m97112k(UnifiedRepayFragment unifiedRepayFragment) {
        m97113l(unifiedRepayFragment);
        return Unit.INSTANCE;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: l */
    public static final void m97113l(UnifiedRepayFragment unifiedRepayFragment) {
        C42110e c42110eM97005r3 = unifiedRepayFragment.m97005r3();
        if (c42110eM97005r3 != null) {
            RecyclerView rvSelectedAssetDetailView = c42110eM97005r3.f93497o;
            Intrinsics.checkNotNullExpressionValue(rvSelectedAssetDetailView, "rvSelectedAssetDetailView");
            if (ViewExtKt.m66581l(rvSelectedAssetDetailView)) {
                RecyclerView rvSelectedAssetDetailView2 = c42110eM97005r3.f93497o;
                Intrinsics.checkNotNullExpressionValue(rvSelectedAssetDetailView2, "rvSelectedAssetDetailView");
                ViewExtKt.m66577h(rvSelectedAssetDetailView2);
                m97114m(unifiedRepayFragment, false);
                return;
            }
            if (unifiedRepayFragment.m97003p3().getItemCount() > 0) {
                RecyclerView rvSelectedAssetDetailView3 = c42110eM97005r3.f93497o;
                Intrinsics.checkNotNullExpressionValue(rvSelectedAssetDetailView3, "rvSelectedAssetDetailView");
                ViewExtKt.m66594y(rvSelectedAssetDetailView3);
                unifiedRepayFragment.m97003p3().notifyDataSetChanged();
                m97114m(unifiedRepayFragment, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    /* JADX INFO: renamed from: m */
    public static final void m97114m(UnifiedRepayFragment unifiedRepayFragment, boolean z11) {
        BaseTextView baseTextView;
        Drawable drawableM96657b;
        C42110e c42110eM97005r3 = unifiedRepayFragment.m97005r3();
        if (c42110eM97005r3 != null && (baseTextView = c42110eM97005r3.f93499q) != null) {
            if (z11) {
                drawableM96657b = C43884e.m96657b(baseTextView, R$drawable.ic_arrow_up_12);
                if (drawableM96657b != null) {
                    drawableM96657b.setTint(C27017c.f54310a.m66512a(R$color.c_icon40));
                } else {
                    drawableM96657b = null;
                }
            } else {
                drawableM96657b = C43884e.m96657b(baseTextView, R$drawable.ic_arrow_down_12);
                if (drawableM96657b == null) {
                    drawableM96657b = null;
                } else {
                    drawableM96657b.setTint(C27017c.f54310a.m66512a(R$color.c_icon40));
                }
            }
            baseTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableM96657b, (Drawable) null);
        }
    }
}
