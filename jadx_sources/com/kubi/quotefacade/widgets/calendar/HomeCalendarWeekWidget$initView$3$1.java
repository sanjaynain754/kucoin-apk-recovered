package com.kubi.quotefacade.widgets.calendar;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.R$drawable;
import com.kubi.quotefacade.R$id;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tv.C45075b;

/* JADX INFO: compiled from: HomeCalendarWeekWidget.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget$initView$3$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarWeekItemWrapper;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HomeCalendarWeekWidget$initView$3$1 extends BaseQuickAdapter<C45075b, BaseViewHolder> {
    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder baseViewHolder, final C45075b item) {
        ImageView imageView;
        Intrinsics.checkNotNullParameter(item, "item");
        if (baseViewHolder == null) {
            return;
        }
        baseViewHolder.setText(R$id.event_week, item.getF101473a());
        TextView textView = (TextView) baseViewHolder.getView(R$id.event_date);
        if (textView != null) {
            textView.setText(item.getF101474b());
            textView.setTextColor(this.mContext.getResources().getColor(item.getF101477e() >= 0 ? R$color.c_text : R$color.c_text30));
            if (item.getF101477e() == 0) {
                textView.setBackgroundResource(R$drawable.home_calendar_cur_day_bg);
            } else {
                textView.setBackground(null);
            }
        }
        boolean z11 = item.getF101475c() != null;
        int i11 = R$id.event_icon;
        baseViewHolder.setGone(i11, z11);
        if (z11 && (imageView = (ImageView) baseViewHolder.getView(i11)) != null) {
            C24277v.m58542g(imageView, item.getF101475c());
        }
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.quotefacade.widgets.calendar.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeCalendarWeekWidget$initView$3$1.m53386i(item);
            }
        }, 1, null);
    }

    public HomeCalendarWeekWidget$initView$3$1(int i11, List<C45075b> list) {
        super(i11, list);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m53386i(C45075b c45075b) {
        C22619k.m53398B(Long.valueOf(c45075b.getF101476d()));
        return Unit.INSTANCE;
    }
}
