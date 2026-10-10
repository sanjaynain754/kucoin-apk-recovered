package c40;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import androidx.exifinterface.media.ExifInterface;
import b40.TradeTabSortData;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.tradefacade.R$color;
import com.kubi.tradefacade.R$id;
import com.kubi.tradefacade.R$layout;
import com.kubi.tradefacade.R$string;
import com.kubi.tradefacade.tabs.data.C26001a;
import com.kubi.tradefacade.tabs.settings.TradeTabSortSettingFragment;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import qe0.C43724b;

/* JADX INFO: renamed from: c40.d */
/* JADX INFO: compiled from: HiddenTabPopUtils.kt */
/* JADX INFO: loaded from: classes50.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\t\u001a\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0002\u001aG\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u0002H\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u00020\u00010\tH\u0002¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"showTradeMenu", "", "Landroid/content/Context;", "anchor", "Landroid/view/View;", "dataList", "", "Lcom/kubi/tradefacade/tabs/data/TradeTabSortData;", "onItemClick", "Lkotlin/Function1;", "getDividerView", "context", "createItemView", "Lcom/kubi/resources/widget/BaseTextView;", ExifInterface.GPS_DIRECTION_TRUE, "itemContentRes", "", "data", "popup", "Lcom/zyyoona7/popup/EasyPopup;", "(Landroid/content/Context;ILjava/lang/Object;Lcom/zyyoona7/popup/EasyPopup;Lkotlin/jvm/functions/Function1;)Lcom/kubi/resources/widget/BaseTextView;", "TradeFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHiddenTabPopUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HiddenTabPopUtils.kt\ncom/kubi/tradefacade/tabs/helper/HiddenTabPopUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,78:1\n1878#2,3:79\n*S KotlinDebug\n*F\n+ 1 HiddenTabPopUtils.kt\ncom/kubi/tradefacade/tabs/helper/HiddenTabPopUtilsKt\n*L\n29#1:79,3\n*E\n"})
public final class C4826d {
    /* JADX INFO: renamed from: d */
    public static final <T> BaseTextView m4921d(Context context, int i11, final T t11, final C43724b c43724b, final Function1<? super T, Unit> function1) {
        BaseTextView baseTextView = new BaseTextView(context);
        baseTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        baseTextView.setText(context.getString(i11));
        baseTextView.setPadding(C27029c.m66601d(baseTextView, 16), C27029c.m66601d(baseTextView, 12), C27029c.m66601d(baseTextView, 16), C27029c.m66601d(baseTextView, 12));
        baseTextView.setGravity(GravityCompat.START);
        baseTextView.setTextColor(C27046k.m66699n(context, R$color.c_text));
        baseTextView.setTextSize(14.0f);
        baseTextView.setClickable(true);
        baseTextView.setFocusable(true);
        ViewExtKt.m66575f(baseTextView, new Function1() { // from class: c40.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4826d.m4922e(c43724b, function1, t11, (View) obj);
            }
        });
        return baseTextView;
    }

    /* JADX INFO: renamed from: h */
    public static final void m4925h(List list, View view, final Context context, Function1 function1, View view2, C43724b c43724b) {
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(R$id.popupContainer);
        linearLayout.removeAllViews();
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            TradeTabSortData tradeTabSortData = (TradeTabSortData) obj;
            int iM63615a = C26001a.m63615a(tradeTabSortData.getBiz());
            Intrinsics.checkNotNull(c43724b);
            linearLayout.addView(m4921d(context, iM63615a, tradeTabSortData, c43724b, function1));
            i11 = i12;
        }
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        linearLayout.addView(m4923f(context2));
        int i13 = R$string.settings;
        Intrinsics.checkNotNull(c43724b);
        linearLayout.addView(m4921d(context, i13, "", c43724b, new Function1() { // from class: c40.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return C4826d.m4926i(context, (String) obj2);
            }
        }));
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m4922e(C43724b c43724b, Function1 function1, Object obj, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c43724b.m96331y();
        function1.invoke(obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final View m4923f(Context context) {
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C27029c.m66601d(view, 1));
        layoutParams.setMargins(C27029c.m66601d(view, 16), 0, C27029c.m66601d(view, 16), 0);
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(C27046k.m66699n(context, R$color.c_divider8));
        return view;
    }

    /* JADX INFO: renamed from: g */
    public static final void m4924g(@NotNull final Context context, @NotNull final View anchor, @NotNull final List<TradeTabSortData> dataList, @NotNull final Function1<? super TradeTabSortData, Unit> onItemClick) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        C43724b.m96334h0(context).m96307Q(R$layout.popup_menu_layout).m96335j0(new C43724b.a() { // from class: c40.a
            @Override // qe0.C43724b.a
            /* JADX INFO: renamed from: a */
            public final void mo4917a(View view, C43724b c43724b) {
                C4826d.m4925h(dataList, anchor, context, onItemClick, view, c43724b);
            }
        }).m96318c0(anchor, 0, 0);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m4926i(Context context, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        TradeTabSortSettingFragment.f52017W.launchPage(context);
        return Unit.INSTANCE;
    }
}
