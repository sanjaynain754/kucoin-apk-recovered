package com.kubi.assets.finance;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.AssetsLog;
import com.kubi.assets.R$color;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.entity.Menu;
import com.kubi.router.core.Router;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p419l2.C42032f;
import p778xy.C46338a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: FinanceConfigAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0002J.\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\rH\u0002J\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0002¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/assets/finance/FinanceConfigAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/assets/entity/Menu;", "Lio/chad/library/adapter/base/BaseViewHolder;", "data", "", "<init>", "(Ljava/util/List;)V", "convert", "", "helper", "item", "buildUrl", "", "setDrawableToImageView", "context", "Landroid/content/Context;", "imageView", "Landroid/widget/ImageView;", "drawableName", "iconUrl", "getDrawableByName", "Landroid/graphics/drawable/Drawable;", "name", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FinanceConfigAdapter extends BaseQuickAdapter<Menu, BaseViewHolder> {
    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable final BaseViewHolder baseViewHolder, @Nullable final Menu menu) {
        View view;
        ImageView imageView = baseViewHolder != null ? (ImageView) baseViewHolder.getView(R$id.ivIcon) : null;
        String iconCode = menu != null ? menu.getIconCode() : null;
        if (iconCode != null && iconCode.length() != 0) {
            if (imageView != null) {
                C27046k.m66701p(imageView, ContextCompat.getColor(this.mContext, R$color.c_textEmphasis));
            }
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            m16664l(mContext, imageView, menu != null ? menu.getIconCode() : null, menu != null ? menu.getIconUrl() : null);
        } else if (imageView != null) {
            imageView.clearColorFilter();
            C46338a.m102151a(this.mContext).mo6634v(menu != null ? menu.getIconUrl() : null).m102208o1(C27040e.m66658b(24)).mo6606a(new C42032f().mo92188b0(R$drawable.ic2_more2_20)).m6594E0(imageView);
        }
        if (baseViewHolder != null) {
            baseViewHolder.setText(R$id.tvTitle, C27041f.m66668h(menu != null ? menu.getTitle() : null));
        }
        ShapeTextView shapeTextView = baseViewHolder != null ? (ShapeTextView) baseViewHolder.getView(R$id.tvLabel) : null;
        if (shapeTextView != null) {
            AssetExKt.m15138z(shapeTextView, C27025c.m66566d(menu != null ? menu.isShowOnOff() : null));
        }
        if (C27025c.m66566d(menu != null ? menu.isOn() : null)) {
            if (shapeTextView != null) {
                shapeTextView.setSelected(true);
            }
            if (shapeTextView != null) {
                shapeTextView.setText("On");
            }
        } else {
            if (shapeTextView != null) {
                shapeTextView.setSelected(false);
            }
            if (shapeTextView != null) {
                shapeTextView.setText("Off");
            }
        }
        if (baseViewHolder == null || (view = baseViewHolder.itemView) == null) {
            return;
        }
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.assets.finance.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FinanceConfigAdapter.m16660j(menu, this, baseViewHolder);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: k */
    public final Drawable m16663k(Context context, String str) {
        int identifier;
        if (str != null) {
            try {
                if (str.length() == 0 || (identifier = context.getResources().getIdentifier(str, "drawable", context.getPackageName())) == 0) {
                    return null;
                }
                return ContextCompat.getDrawable(context, identifier);
            } catch (Exception e11) {
                AssetsLog.Home.m15234e("getDrawableByName-----" + e11);
            }
        }
        return null;
    }

    public FinanceConfigAdapter(@Nullable List<Menu> list) {
        super(R$layout.asset_item_finance_config, list);
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m16660j(Menu menu, FinanceConfigAdapter financeConfigAdapter, BaseViewHolder baseViewHolder) {
        String jumpUrl = menu != null ? menu.getJumpUrl() : null;
        if (jumpUrl != null && jumpUrl.length() != 0) {
            Router.f46192a.m56184f(financeConfigAdapter.m16661h(menu)).m4048k();
            FinanceAnalyticsReporter.f17418a.m16758d(String.valueOf(baseViewHolder.getBindingAdapterPosition() + 1));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public final String m16661h(Menu menu) {
        String jumpType;
        if (menu == null || (jumpType = menu.getJumpType()) == null || !StringsKt.equals(jumpType, "H5", true)) {
            return C27041f.m66668h(menu != null ? menu.getJumpUrl() : null);
        }
        return AssetExKt.m15122j(menu.getJumpUrl()) + "&type=0&dark=true&lang=" + MultiLanguageManager.f46811g.getLocalString();
    }

    /* JADX INFO: renamed from: l */
    public final void m16664l(Context context, ImageView imageView, String str, String str2) {
        Drawable drawableM16663k = m16663k(context, str);
        if (drawableM16663k != null) {
            if (imageView != null) {
                imageView.setImageDrawable(drawableM16663k);
            }
        } else if (imageView != null) {
            C46338a.m102151a(this.mContext).mo6634v(str2).m102208o1(C27040e.m66658b(16)).mo6606a(new C42032f().mo92188b0(R$drawable.ic2_more2_20)).m6594E0(imageView);
        }
    }
}
