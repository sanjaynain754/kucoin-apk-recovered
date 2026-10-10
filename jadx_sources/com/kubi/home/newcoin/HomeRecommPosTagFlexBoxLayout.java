package com.kubi.home.newcoin;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.blankj.utilcode.util.C5275i0;
import com.google.android.flexbox.FlexboxLayout;
import com.kubi.home.R$color;
import com.kubi.home.R$drawable;
import com.kubi.utils.extensions.core.ViewExtKt;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: HomeRecommPosTagFlexBoxLayout.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/home/newcoin/HomeRecommPosTagFlexBoxLayout;", "Lcom/google/android/flexbox/FlexboxLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "setHighlights", "", "highlights", "", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeRecommPosTagFlexBoxLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeRecommPosTagFlexBoxLayout.kt\ncom/kubi/home/newcoin/HomeRecommPosTagFlexBoxLayout\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n774#2:48\n865#2,2:49\n1563#2:51\n1634#2,3:52\n1869#2:55\n1870#2:57\n1#3:56\n*S KotlinDebug\n*F\n+ 1 HomeRecommPosTagFlexBoxLayout.kt\ncom/kubi/home/newcoin/HomeRecommPosTagFlexBoxLayout\n*L\n28#1:48\n28#1:49,2\n28#1:51\n28#1:52,3\n41#1:55\n41#1:57\n*E\n"})
public final class HomeRecommPosTagFlexBoxLayout extends FlexboxLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeRecommPosTagFlexBoxLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeRecommPosTagFlexBoxLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ HomeRecommPosTagFlexBoxLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void setHighlights(@Nullable List<String> highlights) {
        ArrayList<View> arrayList;
        removeAllViews();
        int iM6236a = C5275i0.m6236a(4.0f);
        int iM6236a2 = C5275i0.m6236a(2.0f);
        if (highlights != null) {
            ArrayList<String> arrayList2 = new ArrayList();
            for (Object obj : highlights) {
                if (!StringsKt.isBlank((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            for (String str : arrayList2) {
                TextView textView = new TextView(getContext());
                textView.setTextSize(10.0f);
                textView.setTextColor(getResources().getColor(R$color.c_text60));
                textView.setPadding(iM6236a, iM6236a2, iM6236a, iM6236a2);
                textView.setBackgroundResource(R$drawable.shape_cover8_cover4_2r);
                textView.setText(str);
                arrayList.add(textView);
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            ViewExtKt.m66594y(this);
            for (View view : arrayList) {
                FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(-2, -2);
                layoutParams.setMarginEnd(iM6236a);
                Unit unit = Unit.INSTANCE;
                addView(view, layoutParams);
            }
            return;
        }
        ViewExtKt.m66577h(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeRecommPosTagFlexBoxLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
