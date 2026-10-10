package bv;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: bv.c1 */
/* JADX INFO: compiled from: WidgetHomeCalendarWeekBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4658c1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final MaterialCardView f4255a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f4256b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f4257c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f4258d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f4259e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f4260f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final View f4261g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final View f4262h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final View f4263i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final MaterialCardView f4264j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4658c1 m4628a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i11 = R$id.calendar_cur_day_event_list;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            i11 = R$id.calendar_cur_week_event_list;
            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView2 != null) {
                i11 = R$id.calendar_cur_week_list;
                RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView3 != null) {
                    i11 = R$id.calendar_week_cur_date;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.calendar_week_cur_week;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.calendar_week_left_part))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.calendar_week_left_part_bg))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i11 = R$id.calendar_week_right_part))) != null) {
                            MaterialCardView materialCardView = (MaterialCardView) view;
                            return new C4658c1(materialCardView, recyclerView, recyclerView2, recyclerView3, baseTextView, baseTextView2, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, materialCardView);
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
    public MaterialCardView getRoot() {
        return this.f4255a;
    }

    public C4658c1(@NonNull MaterialCardView materialCardView, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull RecyclerView recyclerView3, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull MaterialCardView materialCardView2) {
        this.f4255a = materialCardView;
        this.f4256b = recyclerView;
        this.f4257c = recyclerView2;
        this.f4258d = recyclerView3;
        this.f4259e = baseTextView;
        this.f4260f = baseTextView2;
        this.f4261g = view;
        this.f4262h = view2;
        this.f4263i = view3;
        this.f4264j = materialCardView2;
    }
}
