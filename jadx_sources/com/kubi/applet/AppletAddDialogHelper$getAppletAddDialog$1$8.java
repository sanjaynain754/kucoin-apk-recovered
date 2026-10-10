package com.kubi.applet;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.kubi.home.api.entity.QuickAccessEntity;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppletAddDialogHelper.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"com/kubi/applet/AppletAddDialogHelper$getAppletAddDialog$1$8", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/home/api/entity/QuickAccessEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "currentViewHolder", "checkedStatus", "AppletLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AppletAddDialogHelper$getAppletAddDialog$1$8 extends BaseQuickAdapter<QuickAccessEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public BaseViewHolder f16198i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ List<QuickAccessEntity> f16199j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f16200k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean f16201l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ QuickAccessEntity f16202m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppletAddDialogHelper$getAppletAddDialog$1$8(List<QuickAccessEntity> list, boolean z11, boolean z12, QuickAccessEntity quickAccessEntity, int i11) {
        super(i11, list);
        this.f16199j = list;
        this.f16200k = z11;
        this.f16201l = z12;
        this.f16202m = quickAccessEntity;
    }

    /* JADX INFO: renamed from: h */
    public final void m15044h(BaseViewHolder baseViewHolder, QuickAccessEntity quickAccessEntity) {
        if (Intrinsics.areEqual(this.f16198i, baseViewHolder)) {
            return;
        }
        if (Intrinsics.areEqual(AppletAddDialogHelper.f16193d, quickAccessEntity)) {
            BaseTextView baseTextView = AppletAddDialogHelper.f16192c;
            if (baseTextView != null) {
                ViewExtKt.m66594y(baseTextView);
            }
        } else {
            BaseTextView baseTextView2 = AppletAddDialogHelper.f16192c;
            if (baseTextView2 != null) {
                C27046k.m66703r(baseTextView2);
            }
        }
        BaseViewHolder baseViewHolder2 = this.f16198i;
        if (baseViewHolder2 != null) {
            Intrinsics.checkNotNull(baseViewHolder2);
            ((CheckBox) baseViewHolder2.getView(R$id.f16227cb)).setChecked(false);
            BaseViewHolder baseViewHolder3 = this.f16198i;
            Intrinsics.checkNotNull(baseViewHolder3);
            ((ImageView) baseViewHolder3.getView(R$id.ivIcon)).setAlpha(0.4f);
            BaseViewHolder baseViewHolder4 = this.f16198i;
            Intrinsics.checkNotNull(baseViewHolder4);
            ((TextView) baseViewHolder4.getView(R$id.tvName)).setTextColor(ContextCompat.getColor(baseViewHolder.itemView.getContext(), R$color.c_text40));
        }
        ((CheckBox) baseViewHolder.getView(R$id.f16227cb)).setChecked(true);
        ((ImageView) baseViewHolder.getView(R$id.ivIcon)).setAlpha(1.0f);
        ((TextView) baseViewHolder.getView(R$id.tvName)).setTextColor(ContextCompat.getColor(baseViewHolder.itemView.getContext(), R$color.c_text));
        this.f16198i = baseViewHolder;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(final BaseViewHolder helper, final QuickAccessEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        if (this.f16200k) {
            View view = helper.getView(R$id.f16227cb);
            Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
            ViewExtKt.m66594y(view);
        }
        AppletAddDialogHelper appletAddDialogHelper = AppletAddDialogHelper.f16190a;
        boolean z11 = this.f16201l;
        View view2 = helper.getView(R$id.appletItem);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        appletAddDialogHelper.m15041s(z11, (ConstraintLayout) view2);
        ImageView imageView = (ImageView) helper.getView(R$id.ivIcon);
        ((TextView) helper.getView(R$id.tvName)).setText(item.getName());
        C24277v.m58540e(imageView.getContext(), item.getIconUrl(), imageView);
        List<QuickAccessEntity> list = this.f16199j;
        if (list != null) {
            if (helper.getLayoutPosition() == list.size() - 1) {
                View view3 = helper.getView(R$id.f16227cb);
                Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
                C27046k.m66703r(view3);
                return;
            }
        }
        if (AppletAddDialogHelper.f16193d != null && Intrinsics.areEqual(AppletAddDialogHelper.f16193d, item)) {
            AppletAddDialogHelper.f16194e = item.getId();
            m15044h(helper, item);
        }
        if (!this.f16200k && Intrinsics.areEqual(this.f16202m, item)) {
            m15044h(helper, item);
        }
        if (this.f16200k) {
            View itemView = helper.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.applet.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AppletAddDialogHelper$getAppletAddDialog$1$8.m15043j(item, this, helper);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m15043j(QuickAccessEntity quickAccessEntity, AppletAddDialogHelper$getAppletAddDialog$1$8 appletAddDialogHelper$getAppletAddDialog$1$8, BaseViewHolder baseViewHolder) {
        if (AppletAddDialogHelper.f16191b != null) {
            ConstraintLayout constraintLayout = AppletAddDialogHelper.f16191b;
            Intrinsics.checkNotNull(constraintLayout);
            ImageView imageView = (ImageView) constraintLayout.findViewById(R$id.ivIcon);
            ConstraintLayout constraintLayout2 = AppletAddDialogHelper.f16191b;
            Intrinsics.checkNotNull(constraintLayout2);
            BaseTextView baseTextView = (BaseTextView) constraintLayout2.findViewById(R$id.tvName);
            if (baseTextView != null) {
                baseTextView.setText(quickAccessEntity.getName());
                baseTextView.setTextColor(ContextCompat.getColor(baseTextView.getContext(), R$color.c_text));
                C24277v.m58540e(baseTextView.getContext(), quickAccessEntity.getIconUrl(), imageView);
            }
        }
        AppletAddDialogHelper.f16194e = quickAccessEntity.getId();
        appletAddDialogHelper$getAppletAddDialog$1$8.m15044h(baseViewHolder, quickAccessEntity);
        return Unit.INSTANCE;
    }
}
