package lv;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.ResourcesCompat;
import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.R$drawable;
import com.kubi.quotefacade.R$font;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.market.sort.SymbolsSortType;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import qe0.C43724b;

/* JADX INFO: renamed from: lv.d */
/* JADX INFO: compiled from: ToggleSortPopWindow.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/quotefacade/market/sort/ToggleSortPopWindow;", "Lcom/zyyoona7/popup/EasyPopup;", "context", "Landroid/content/Context;", "sortType", "Lcom/kubi/quotefacade/market/sort/SymbolsSortType;", "fundingRateSortVisible", "", "sortItemClickListener", "Lkotlin/Function1;", "Landroid/view/View;", "", "<init>", "(Landroid/content/Context;Lcom/kubi/quotefacade/market/sort/SymbolsSortType;ZLkotlin/jvm/functions/Function1;)V", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nToggleSortPopWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToggleSortPopWindow.kt\ncom/kubi/quotefacade/market/sort/ToggleSortPopWindow\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,82:1\n256#2,2:83\n*S KotlinDebug\n*F\n+ 1 ToggleSortPopWindow.kt\ncom/kubi/quotefacade/market/sort/ToggleSortPopWindow\n*L\n50#1:83,2\n*E\n"})
public final class C42318d extends C43724b {

    /* JADX INFO: renamed from: D */
    @NotNull
    public final Context f93831D;

    /* JADX INFO: renamed from: E */
    @NotNull
    public final SymbolsSortType f93832E;

    /* JADX INFO: renamed from: F */
    public final boolean f93833F;

    /* JADX INFO: renamed from: G */
    @Nullable
    public final Function1<View, Unit> f93834G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C42318d(@NotNull Context context, @NotNull SymbolsSortType sortType, boolean z11, @Nullable Function1<? super View, Unit> function1) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sortType, "sortType");
        this.f93831D = context;
        this.f93832E = sortType;
        this.f93833F = z11;
        this.f93834G = function1;
        Typeface font = ResourcesCompat.getFont(context, R$font.medium);
        Typeface font2 = ResourcesCompat.getFont(context, R$font.regular);
        m96317a0(-2);
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.quote_pop_window_toggle_sort_type, (ViewGroup) null);
        final BaseTextView baseTextView = (BaseTextView) viewInflate.findViewById(R$id.changeRateSortTv);
        final BaseTextView baseTextView2 = (BaseTextView) viewInflate.findViewById(R$id.fundingRateSortTv);
        final BaseTextView baseTextView3 = (BaseTextView) viewInflate.findViewById(R$id.marketCapSortTv);
        if (sortType == SymbolsSortType.CHANGE_RATE) {
            baseTextView.setTypeface(font);
            baseTextView.setBackgroundResource(R$drawable.quote_shape_cover2_top_8r);
        } else {
            baseTextView.setTypeface(font2);
            baseTextView.setBackgroundColor(viewInflate.getContext().getColor(R$color.c_transparent));
        }
        Intrinsics.checkNotNull(baseTextView);
        C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: lv.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C42318d.m92856m0(this.f93825b, baseTextView);
            }
        }, 1, null);
        Intrinsics.checkNotNull(baseTextView2);
        baseTextView2.setVisibility(z11 ? 0 : 8);
        if (sortType == SymbolsSortType.FUNDING_RATE) {
            baseTextView2.setTypeface(font);
            baseTextView2.setBackgroundColor(viewInflate.getContext().getColor(R$color.c_cover2));
        } else {
            baseTextView2.setTypeface(font2);
            baseTextView2.setBackgroundColor(viewInflate.getContext().getColor(R$color.c_transparent));
        }
        C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: lv.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C42318d.m92854k0(this.f93827b, baseTextView2);
            }
        }, 1, null);
        if (sortType == SymbolsSortType.MARKET_CAP) {
            baseTextView3.setTypeface(font);
            baseTextView3.setBackgroundResource(R$drawable.quote_shape_cover2_bottom_8r);
        } else {
            baseTextView3.setTypeface(font2);
            baseTextView3.setBackgroundColor(viewInflate.getContext().getColor(R$color.c_transparent));
        }
        Intrinsics.checkNotNull(baseTextView3);
        C27046k.m66711z(baseTextView3, 0L, new Function0() { // from class: lv.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C42318d.m92855l0(this.f93829b, baseTextView3);
            }
        }, 1, null);
        m96309S(viewInflate);
    }

    /* JADX INFO: renamed from: k0 */
    public static Unit m92854k0(C42318d c42318d, BaseTextView baseTextView) {
        Function1<View, Unit> function1 = c42318d.f93834G;
        if (function1 != null) {
            Intrinsics.checkNotNull(baseTextView);
            function1.invoke(baseTextView);
        }
        c42318d.m96331y();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l0 */
    public static Unit m92855l0(C42318d c42318d, BaseTextView baseTextView) {
        Function1<View, Unit> function1 = c42318d.f93834G;
        if (function1 != null) {
            Intrinsics.checkNotNull(baseTextView);
            function1.invoke(baseTextView);
        }
        c42318d.m96331y();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m0 */
    public static Unit m92856m0(C42318d c42318d, BaseTextView baseTextView) {
        Function1<View, Unit> function1 = c42318d.f93834G;
        if (function1 != null) {
            Intrinsics.checkNotNull(baseTextView);
            function1.invoke(baseTextView);
        }
        c42318d.m96331y();
        return Unit.INSTANCE;
    }
}
