package bv;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: bv.b1 */
/* JADX INFO: compiled from: WidgetHomeCalendarDayBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4655b1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final MaterialCardView f4233a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f4234b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f4235c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f4236d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f4237e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f4238f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f4239g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f4240h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final Group f4241i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final MaterialCardView f4242j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4655b1 m4622a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.calendar_cur_day_event_list;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            i11 = R$id.calendar_cur_day_loading;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.calendar_day_arrow_label;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.calendar_day_bg))) != null) {
                    i11 = R$id.calendar_day_new_label;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.calendar_week_cur_date;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.calendar_week_cur_week;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                i11 = R$id.content_group;
                                Group group = (Group) ViewBindings.findChildViewById(view, i11);
                                if (group != null) {
                                    MaterialCardView materialCardView = (MaterialCardView) view;
                                    return new C4655b1(materialCardView, recyclerView, imageView, imageView2, viewFindChildViewById, baseTextView, baseTextView2, baseTextView3, group, materialCardView);
                                }
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
    public MaterialCardView getRoot() {
        return this.f4233a;
    }

    public C4655b1(@NonNull MaterialCardView materialCardView, @NonNull RecyclerView recyclerView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull View view, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull Group group, @NonNull MaterialCardView materialCardView2) {
        this.f4233a = materialCardView;
        this.f4234b = recyclerView;
        this.f4235c = imageView;
        this.f4236d = imageView2;
        this.f4237e = view;
        this.f4238f = baseTextView;
        this.f4239g = baseTextView2;
        this.f4240h = baseTextView3;
        this.f4241i = group;
        this.f4242j = materialCardView2;
    }
}
