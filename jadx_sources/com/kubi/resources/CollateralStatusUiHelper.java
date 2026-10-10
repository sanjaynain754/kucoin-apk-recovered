package com.kubi.resources;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.fragment.app.FragmentManager;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$drawable;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$layout;
import com.kubi.sdk.res.R$string;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.resources.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: CollateralStatusUiHelper.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0011JI\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J(\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0016\u001a\u00020\u0017*\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0002\u0010\u0018J\f\u0010\u0019\u001a\u00020\u0005*\u00020\u0005H\u0003J\f\u0010\u001a\u001a\u00020\u0005*\u00020\u0005H\u0003J\f\u0010\u001b\u001a\u00020\u0005*\u00020\u0005H\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/resources/CollateralStatusUiHelper;", "", "<init>", "()V", "STATUS_NEAR_LIMIT", "", "STATUS_EXCEEDED", "bindStatusIcon", "", TUIConstants.TUIChat.INPUT_MORE_ICON, "Landroid/widget/ImageView;", "collateralStatus", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "dialogTag", "", "coinName", "(Landroid/widget/ImageView;Ljava/lang/Integer;Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Ljava/lang/String;)V", "onClick", "Lkotlin/Function2;", "(Landroid/widget/ImageView;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "showStatusDialog", "isLimitStatus", "", "(Ljava/lang/Integer;)Z", "statusColorRes", "statusTitleRes", "statusMessageRes", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCollateralStatusUiHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollateralStatusUiHelper.kt\ncom/kubi/resources/CollateralStatusUiHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
public final class CollateralStatusUiHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final CollateralStatusUiHelper f43602a = new CollateralStatusUiHelper();

    @ColorRes
    /* JADX INFO: renamed from: n */
    public final int m54273n(int i11) {
        return i11 == 3 ? R$color.secondary : R$color.complementary;
    }

    @StringRes
    /* JADX INFO: renamed from: o */
    public final int m54274o(int i11) {
        return i11 == 3 ? R$string.unify_platform_ceiling_reached_desc : R$string.unify_platform_ceiling_warning_desc;
    }

    @StringRes
    /* JADX INFO: renamed from: p */
    public final int m54275p(int i11) {
        return i11 == 3 ? R$string.unify_platform_ceiling_reached : R$string.unify_platform_ceiling_warning;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m54264g(CollateralStatusUiHelper collateralStatusUiHelper, ImageView imageView, Integer num, FragmentManager fragmentManager, String str, String str2, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            str2 = null;
        }
        collateralStatusUiHelper.m54269e(imageView, num, fragmentManager, str, str2);
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m54265h(FragmentManager fragmentManager, String str, int i11, String str2) {
        f43602a.m54272k(fragmentManager, i11, str2, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m54267l(int i11, String str, BaseViewHolder viewHolder, final DialogFragmentHelper helper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        TextView textView = (TextView) viewHolder.getView(R$id.tvTitle);
        CollateralStatusUiHelper collateralStatusUiHelper = f43602a;
        textView.setText(collateralStatusUiHelper.m54275p(i11));
        TextView textView2 = (TextView) viewHolder.getView(R$id.tvContent);
        if (str == null || str.length() <= 0 || collateralStatusUiHelper.m54274o(i11) != R$string.unify_platform_ceiling_reached_desc) {
            textView2.setText(collateralStatusUiHelper.m54274o(i11));
        } else {
            String string = textView2.getContext().getString(R$string.unify_platform_ceiling_held_coins_reached_desc, str);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            textView2.setText(string);
        }
        ((TextView) viewHolder.getView(R$id.tvBtnOk)).setOnClickListener(new View.OnClickListener() { // from class: com.kubi.resources.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CollateralStatusUiHelper.m54268m(helper, view);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public final void m54269e(@Nullable ImageView imageView, @Nullable Integer num, @Nullable final FragmentManager fragmentManager, @NotNull final String dialogTag, @Nullable String str) {
        Intrinsics.checkNotNullParameter(dialogTag, "dialogTag");
        m54270f(imageView, num, str, fragmentManager != null ? new Function2() { // from class: com.kubi.resources.a
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CollateralStatusUiHelper.m54265h(fragmentManager, dialogTag, ((Integer) obj).intValue(), (String) obj2);
            }
        } : null);
    }

    /* JADX INFO: renamed from: f */
    public final void m54270f(@Nullable ImageView imageView, @Nullable final Integer num, @Nullable final String str, @Nullable final Function2<? super Integer, ? super String, Unit> function2) {
        if (imageView == null) {
            return;
        }
        if (!f43602a.m54271j(num)) {
            num = null;
        }
        if (num == null) {
            imageView.setVisibility(8);
            imageView.setOnClickListener(null);
            imageView.setClickable(false);
            imageView.setFocusable(false);
            imageView.setContentDescription(null);
            ImageViewCompat.setImageTintList(imageView, null);
            return;
        }
        imageView.setVisibility(0);
        imageView.setImageResource(R$drawable.ic2_warning_ring_16);
        ImageViewCompat.setImageTintList(imageView, ColorStateList.valueOf(ContextCompat.getColor(imageView.getContext(), m54273n(num.intValue()))));
        imageView.setContentDescription(imageView.getContext().getString(m54275p(num.intValue())));
        imageView.setOnClickListener(function2 != null ? new View.OnClickListener() { // from class: com.kubi.resources.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CollateralStatusUiHelper.m54266i(function2, num, str, view);
            }
        } : null);
        imageView.setClickable(function2 != null);
        imageView.setFocusable(function2 != null);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m54271j(Integer num) {
        if (num != null && num.intValue() == 2) {
            return true;
        }
        return num != null && num.intValue() == 3;
    }

    /* JADX INFO: renamed from: k */
    public final void m54272k(@NotNull FragmentManager fragmentManager, final int i11, @Nullable final String str, @NotNull String dialogTag) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(dialogTag, "dialogTag");
        DialogFragmentHelper.f43568p0.newInstance(R$layout.dialog_collateral_status_limit, true).m54237f4(new Function2() { // from class: com.kubi.resources.b
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CollateralStatusUiHelper.m54267l(i11, str, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).show(fragmentManager, dialogTag);
    }

    /* JADX INFO: renamed from: i */
    public static final void m54266i(Function2 function2, Integer num, String str, View view) {
        function2.invoke(num, str);
    }

    /* JADX INFO: renamed from: m */
    public static final void m54268m(DialogFragmentHelper dialogFragmentHelper, View view) {
        dialogFragmentHelper.dismiss();
    }
}
