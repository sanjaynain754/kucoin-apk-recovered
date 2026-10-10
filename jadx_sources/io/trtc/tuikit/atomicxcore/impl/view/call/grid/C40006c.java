package io.trtc.tuikit.atomicxcore.impl.view.call.grid;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import java.util.ArrayList;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.grid.c */
/* JADX INFO: loaded from: classes61.dex */
public final class C40006c extends ConstraintLayout {

    /* JADX INFO: renamed from: a */
    public int f88982a;

    /* JADX INFO: renamed from: b */
    public int f88983b;

    /* JADX INFO: renamed from: c */
    public int f88984c;

    /* JADX INFO: renamed from: d */
    public int f88985d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f88986e;

    /* JADX INFO: renamed from: a */
    public final void m88400a() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Object systemService = context.getSystemService(InterfaceC33953u5.f72199F);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        this.f88984c = displayMetrics.widthPixels;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Object systemService2 = context2.getSystemService(InterfaceC33953u5.f72199F);
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay2 = ((WindowManager) systemService2).getDefaultDisplay();
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        defaultDisplay2.getRealMetrics(displayMetrics2);
        this.f88985d = displayMetrics2.heightPixels;
        this.f88983b = this.f88984c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40006c(Context context) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f88982a = -99;
        this.f88986e = new ArrayList();
        m88400a();
    }

    public final int getShowLargeViewIndex() {
        return this.f88982a;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        int i13;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f88984c, 1073741824);
        int i14 = this.f88983b;
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((i14 / 3) + i14, 1073741824);
        int i15 = 0;
        if (this.f88982a < 0) {
            if (getChildCount() <= 2) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(((getChildCount() > 2 || this.f88982a >= 0 || this.f88984c >= this.f88985d) ? 0 : this.f88983b / 4) + (this.f88983b / 2), 1073741824);
            } else {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.f88983b, 1073741824);
            }
        }
        setMeasuredDimension(iMakeMeasureSpec, iMakeMeasureSpec2);
        int childCount = getChildCount();
        while (i15 < childCount) {
            View childAt = getChildAt(i15);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            int childCount2 = getChildCount();
            if (childCount2 <= 4 && this.f88982a == i15) {
                i13 = this.f88983b;
            } else if (childCount2 > 4 || this.f88982a >= 0) {
                i13 = (childCount2 <= 4 || this.f88982a != i15) ? this.f88983b / 3 : (this.f88983b / 3) * 2;
            } else {
                i13 = this.f88983b / 2;
            }
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
            measureChild(childAt, iMakeMeasureSpec3, iMakeMeasureSpec3);
            i15++;
        }
    }

    public final void setShowLargeViewIndex(int i11) {
        this.f88982a = i11;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m88400a();
        requestLayout();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int childCount = getChildCount();
        int i17 = this.f88983b / 3;
        int i18 = 0;
        EnumC40005b enumC40005bM88399a = m88399a(childCount, 0);
        ArrayList arrayList = new ArrayList();
        int i19 = 0;
        int i21 = 0;
        while (i19 < childCount) {
            switch (enumC40005bM88399a.ordinal()) {
                case 0:
                    arrayList.add(new C40004a(0, i21));
                    i21 += i17 * 3;
                    i19++;
                    break;
                case 1:
                    int i22 = i17 * 3;
                    int i23 = i22 / 2;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new C40004a(0, i21));
                    arrayList2.add(new C40004a(i23, i21));
                    arrayList2.add(new C40004a(i23 / 2, i23 + i21));
                    arrayList.addAll(arrayList2);
                    i21 += i22;
                    i19 += 3;
                    break;
                case 2:
                    int i24 = i17 * 3;
                    int i25 = i24 / 2;
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new C40004a(0, i21));
                    arrayList3.add(new C40004a(i25, i21));
                    int i26 = i21 + i25;
                    arrayList3.add(new C40004a(0, i26));
                    arrayList3.add(new C40004a(i25, i26));
                    arrayList.addAll(arrayList3);
                    i21 += i24;
                    i19 += 4;
                    break;
                case 3:
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new C40004a(0, i21));
                    arrayList4.add(new C40004a(i17, i21));
                    arrayList4.add(new C40004a(i17 * 2, i21));
                    arrayList.addAll(arrayList4);
                    i21 += i17;
                    i19 += 3;
                    break;
                case 4:
                    ArrayList arrayList5 = new ArrayList();
                    i16 = i17 * 2;
                    arrayList5.add(new C40004a(0, i21));
                    arrayList5.add(new C40004a(i16, i21));
                    arrayList5.add(new C40004a(i16, i21 + i17));
                    arrayList.addAll(arrayList5);
                    i21 += i16;
                    i19 += 3;
                    break;
                case 5:
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.add(new C40004a(0, i21));
                    i16 = i17 * 2;
                    arrayList6.add(new C40004a(i17, i21));
                    arrayList6.add(new C40004a(0, i21 + i17));
                    arrayList.addAll(arrayList6);
                    i21 += i16;
                    i19 += 3;
                    break;
                case 6:
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(new C40004a(0, i21));
                    arrayList7.add(new C40004a(0, i21 + i17));
                    i16 = i17 * 2;
                    arrayList7.add(new C40004a(i17, i21));
                    arrayList.addAll(arrayList7);
                    i21 += i16;
                    i19 += 3;
                    break;
            }
            enumC40005bM88399a = m88399a(childCount, i19);
        }
        if (this.f88982a > 0 && getChildCount() <= 4) {
            int childCount2 = getChildCount();
            for (int i27 = 0; i27 < childCount2; i27++) {
                View childAt = getChildAt(i27);
                if (i27 != this.f88982a) {
                    this.f88986e.add(childAt);
                } else {
                    this.f88986e.add(0, childAt);
                }
            }
            int size = this.f88986e.size();
            while (i18 < size) {
                Object obj = this.f88986e.get(i18);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                View view = (View) obj;
                C40004a c40004a = (C40004a) arrayList.get(i18);
                view.layout(c40004a.f88972a, c40004a.f88973b, view.getMeasuredWidth() + c40004a.f88972a, view.getMeasuredHeight() + c40004a.f88973b);
                i18++;
            }
            this.f88986e.clear();
            return;
        }
        if (getChildCount() <= 2 && this.f88982a < 0 && this.f88984c < this.f88985d) {
            i15 = this.f88983b / 4;
        } else {
            i15 = 0;
        }
        int childCount3 = getChildCount();
        while (i18 < childCount3) {
            View childAt2 = getChildAt(i18);
            C40004a c40004a2 = (C40004a) arrayList.get(i18);
            childAt2.layout(c40004a2.f88972a, c40004a2.f88973b + i15, childAt2.getMeasuredWidth() + c40004a2.f88972a, childAt2.getMeasuredHeight() + c40004a2.f88973b + i15);
            i18++;
        }
    }

    /* JADX INFO: renamed from: a */
    public final EnumC40005b m88399a(int i11, int i12) {
        EnumC40005b enumC40005b = EnumC40005b.THREE_ONE_THIRDS;
        if (i12 != 0) {
            int i13 = i11 - i12;
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i11 > 4 && this.f88982a == i12) {
                        return EnumC40005b.ONE_THIRD_TWO_THIRDS;
                    }
                    if (i11 > 4 && this.f88982a == i12 + 1) {
                        return EnumC40005b.TWO_THIRDS_ONE_THIRD_CENTER;
                    }
                    if (i11 > 4 && this.f88982a == i12 + 2) {
                        return EnumC40005b.TWO_THIRDS_ONE_THIRD_RIGHT;
                    }
                } else {
                    if (i11 == 4) {
                        return EnumC40005b.FIFTY_FIFTY;
                    }
                    if (i11 > 4 && this.f88982a == i12) {
                        return EnumC40005b.ONE_THIRD_TWO_THIRDS;
                    }
                    if (i11 > 4 && this.f88982a == i12 + 1) {
                        return EnumC40005b.TWO_THIRDS_ONE_THIRD_CENTER;
                    }
                    if (i11 > 4 && this.f88982a == i12 + 2) {
                        return EnumC40005b.TWO_THIRDS_ONE_THIRD_RIGHT;
                    }
                }
            } else {
                if (i11 == 3) {
                    return EnumC40005b.ONE_THIRD;
                }
                if (i11 > 4 && this.f88982a == i11 - 1) {
                    return EnumC40005b.ONE_THIRD_TWO_THIRDS;
                }
                if (i11 == 4) {
                    return EnumC40005b.FIFTY_FIFTY;
                }
                if (i11 > 4 && this.f88982a == i12) {
                    return EnumC40005b.ONE_THIRD_TWO_THIRDS;
                }
                if (i11 > 4 && this.f88982a == i12 + 1) {
                    return EnumC40005b.TWO_THIRDS_ONE_THIRD_CENTER;
                }
                if (i11 > 4 && this.f88982a == i12 + 2) {
                    return EnumC40005b.TWO_THIRDS_ONE_THIRD_RIGHT;
                }
            }
        } else {
            if (i11 == 1) {
                return EnumC40005b.FULL_WIDTH;
            }
            if (i11 == 2 || i11 == 4) {
                return this.f88982a >= 0 ? EnumC40005b.FULL_WIDTH : EnumC40005b.FIFTY_FIFTY;
            }
            if (i11 == 3) {
                return this.f88982a >= 0 ? EnumC40005b.FULL_WIDTH : EnumC40005b.ONE_THIRD;
            }
            int i14 = this.f88982a;
            if (i14 == 0) {
                return EnumC40005b.ONE_THIRD_TWO_THIRDS;
            }
            if (i14 == 1) {
                return EnumC40005b.TWO_THIRDS_ONE_THIRD_CENTER;
            }
            if (i14 == 2) {
                return EnumC40005b.TWO_THIRDS_ONE_THIRD_RIGHT;
            }
        }
        return enumC40005b;
    }
}
