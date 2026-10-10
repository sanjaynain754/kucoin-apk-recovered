package com.sumsub.sns.internal.core.presentation.common;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.PopupMenu;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.sumsub.sns.R$color;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.AbstractC28058F;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Popup;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.common.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28761a extends AbstractC28787t {

    /* JADX INFO: renamed from: e */
    public final FunctionReferenceImpl f58494e;

    /* JADX INFO: renamed from: f */
    public final FunctionReferenceImpl f58495f;

    /* JADX INFO: renamed from: g */
    public final String f58496g;

    /* JADX WARN: Multi-variable type inference failed */
    public C28761a(AbstractC28058F abstractC28058F, Function0 function0, Function0 function1) {
        super(abstractC28058F, null);
        this.f58494e = (FunctionReferenceImpl) function0;
        this.f58495f = (FunctionReferenceImpl) function1;
        this.f58496g = "AttachSourceSelector";
    }

    /* JADX INFO: renamed from: a */
    public final void m69585a(View view, String str, String str2, final Function0 function0, final Function0 function1) {
        Context contextRequireContext = this.f58549a.requireContext();
        Integer numM69174a = AbstractC28234b.m69174a(view, SNSColorElement.CONTENT_WEAK);
        int iIntValue = numM69174a != null ? numM69174a.intValue() : ContextCompat.getColor(contextRequireContext, R$color.sns_contentWeak);
        Integer numM69174a2 = AbstractC28234b.m69174a(view, SNSColorElement.ALERT_TINT);
        view.requestRectangleOnScreen(new Rect(0, 0, view.getWidth(), view.getHeight()), true);
        PopupMenu popupMenu = new PopupMenu(contextRequireContext, view);
        popupMenu.setForceShowIcon(true);
        Menu menu = popupMenu.getMenu();
        Drawable drawable = null;
        CharSequence charSequence = str;
        if (str == null) {
            charSequence = null;
        } else if (numM69174a2 != null) {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new ForegroundColorSpan(numM69174a2.intValue()), 0, spannableString.length(), 33);
            charSequence = spannableString;
        }
        MenuItem menuItemAdd = menu.add(charSequence);
        String imageName = SNSIconHandler.SNSCommonIcons.ICON_CAMERA.getImageName();
        C28468k0 c28468k0 = C28468k0.f57983a;
        Drawable drawableOnResolveIcon = c28468k0.getIconHandler().onResolveIcon(contextRequireContext, imageName);
        if (drawableOnResolveIcon != null) {
            drawableOnResolveIcon.setTintList(ColorStateList.valueOf(iIntValue));
        } else {
            drawableOnResolveIcon = null;
        }
        menuItemAdd.setIcon(drawableOnResolveIcon);
        menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.sumsub.sns.internal.core.presentation.common.w
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return C28761a.m69582a(this.f58558b, function1, menuItem);
            }
        });
        Menu menu2 = popupMenu.getMenu();
        CharSequence charSequence2 = str2;
        if (str2 == null) {
            charSequence2 = null;
        } else if (numM69174a2 != null) {
            SpannableString spannableString2 = new SpannableString(str2);
            spannableString2.setSpan(new ForegroundColorSpan(numM69174a2.intValue()), 0, spannableString2.length(), 33);
            charSequence2 = spannableString2;
        }
        MenuItem menuItemAdd2 = menu2.add(charSequence2);
        Drawable drawableOnResolveIcon2 = c28468k0.getIconHandler().onResolveIcon(contextRequireContext, SNSIconHandler.SNSCommonIcons.GALLERY_SMALL.getImageName());
        if (drawableOnResolveIcon2 != null) {
            drawableOnResolveIcon2.setTintList(ColorStateList.valueOf(iIntValue));
            drawable = drawableOnResolveIcon2;
        }
        menuItemAdd2.setIcon(drawable);
        menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.sumsub.sns.internal.core.presentation.common.x
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return C28761a.m69583b(this.f58560b, function0, menuItem);
            }
        });
        popupMenu.show();
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m69583b(C28761a c28761a, Function0 function0, MenuItem menuItem) {
        C28367f.m69256a(c28761a.f58549a.getAnalyticsDelegate(), Control.DocumentSourceGallery, (Map) null, (Popup) null, 6);
        function0.invoke();
        return true;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f58496g;
    }

    /* JADX INFO: renamed from: a */
    public final void m69584a(final View view) {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this.f58549a.getViewLifecycleOwner()), null, null, new C28786s(this, new Function1() { // from class: com.sumsub.sns.internal.core.presentation.common.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C28761a.m69581a(this.f58556b, view, (C29983l) obj);
            }
        }, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.FunctionReferenceImpl] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.FunctionReferenceImpl] */
    /* JADX INFO: renamed from: a */
    public static final Unit m69581a(C28761a c28761a, View view, C29983l c29983l) {
        c28761a.m69585a(view, c29983l.m70061a("sns_prompt_documentSource_action_camera"), c29983l.m70061a("sns_prompt_documentSource_action_gallery"), c28761a.f58495f, c28761a.f58494e);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m69582a(C28761a c28761a, Function0 function0, MenuItem menuItem) {
        C28367f.m69256a(c28761a.f58549a.getAnalyticsDelegate(), Control.DocumentSourceCamera, (Map) null, (Popup) null, 6);
        function0.invoke();
        return true;
    }
}
