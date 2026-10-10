package com.sumsub.sns.core.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ImageViewCompat;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.theme.AbstractC28962j;
import com.sumsub.sns.internal.core.presentation.theme.C28955c;
import com.sumsub.sns.internal.core.presentation.theme.C28957e;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import com.sumsub.sns.internal.core.presentation.theme.ImageElementName;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001b\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010\u001e\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!J\u000e\u0010&\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$J\u000e\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0007J\f\u0010)\u001a\u00020\u0017*\u00020\u0012H\u0002R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006*"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSToolbarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "closeButton", "Landroid/widget/ImageButton;", "getCloseButton", "()Landroid/widget/ImageButton;", "optionButton", "getOptionButton", "value", "Landroid/widget/TextView;", "titleView", "getTitleView", "()Landroid/widget/TextView;", "setIconTintList", "", "colorStateList", "Landroid/content/res/ColorStateList;", "setOptionButtonTintList", "setCloseButtonDrawable", TUIConstants.TUIChat.INPUT_MORE_ICON, "Landroid/graphics/drawable/Drawable;", "setOptionButtonDrawable", "setOnCloseButtonClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "setCloseButtonVisible", ViewProps.VISIBLE, "", "setOnOptionButtonClickListener", "setOptionButtonVisible", "initTitle", "titleId", "centerTitle", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSToolbarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSToolbarView.kt\ncom/sumsub/sns/core/widget/SNSToolbarView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 ThemeHelper.kt\ncom/sumsub/sns/core/presentation/helper/ThemeHelper\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ViewThemeExtensions.kt\ncom/sumsub/sns/core/presentation/helper/ViewThemeExtensionsKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,128:1\n233#2,3:129\n22#3:132\n1#4:133\n1#4:135\n37#5:134\n256#6,2:136\n256#6,2:138\n254#6:140\n254#6:141\n326#6,4:142\n*S KotlinDebug\n*F\n+ 1 SNSToolbarView.kt\ncom/sumsub/sns/core/widget/SNSToolbarView\n*L\n39#1:129,3\n55#1:132\n55#1:133\n60#1:134\n88#1:136,2\n97#1:138,2\n108#1:140\n111#1:141\n114#1:142,4\n*E\n"})
public class SNSToolbarView extends ConstraintLayout {

    @Nullable
    private TextView titleView;

    @JvmOverloads
    public SNSToolbarView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @JvmOverloads
    public SNSToolbarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final ImageButton getCloseButton() {
        return (ImageButton) findViewById(R$id.sns_button_close);
    }

    private final ImageButton getOptionButton() {
        return (ImageButton) findViewById(R$id.sns_button_option);
    }

    @Nullable
    public final TextView getTitleView() {
        return this.titleView;
    }

    @JvmOverloads
    public SNSToolbarView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    private final void centerTitle(TextView textView) {
        int iCoerceAtLeast;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ImageButton closeButton = getCloseButton();
        ImageButton imageButton = null;
        int iCoerceAtLeast2 = 0;
        if (closeButton != null) {
            if (closeButton.getVisibility() != 0) {
                closeButton = null;
            }
            if (closeButton != null && (layoutParams2 = closeButton.getLayoutParams()) != null) {
                iCoerceAtLeast = RangesKt.coerceAtLeast(layoutParams2.width, 0);
            } else {
                iCoerceAtLeast = 0;
            }
        } else {
            iCoerceAtLeast = 0;
        }
        ImageButton optionButton = getOptionButton();
        if (optionButton != null) {
            if (optionButton.getVisibility() == 0) {
                imageButton = optionButton;
            }
            if (imageButton != null && (layoutParams = imageButton.getLayoutParams()) != null) {
                iCoerceAtLeast2 = RangesKt.coerceAtLeast(layoutParams.width, 0);
            }
        }
        int iMax = Math.max(iCoerceAtLeast, iCoerceAtLeast2);
        ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
        if (layoutParams3 != null) {
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.setMarginStart(iMax);
            layoutParams4.setMarginEnd(iMax);
            textView.setLayoutParams(layoutParams4);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public final void initTitle(int titleId) {
        TextView textView = (TextView) findViewById(titleId);
        this.titleView = textView;
        if (textView != null) {
            centerTitle(textView);
        }
    }

    public final void setCloseButtonDrawable(@Nullable Drawable icon) {
        ImageButton closeButton = getCloseButton();
        if (closeButton != null) {
            closeButton.setImageDrawable(icon);
        }
    }

    public final void setCloseButtonVisible(boolean visible) {
        int i11;
        ImageButton closeButton = getCloseButton();
        if (closeButton != null) {
            if (visible) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            closeButton.setVisibility(i11);
        }
        TextView textView = this.titleView;
        if (textView != null) {
            centerTitle(textView);
        }
    }

    public final void setIconTintList(@NotNull ColorStateList colorStateList) {
        ImageButton closeButton = getCloseButton();
        if (closeButton != null) {
            ImageViewCompat.setImageTintList(closeButton, colorStateList);
        }
        setOptionButtonTintList(colorStateList);
    }

    public final void setOnCloseButtonClickListener(@NotNull View.OnClickListener listener) {
        ImageButton closeButton = getCloseButton();
        if (closeButton != null) {
            closeButton.setOnClickListener(listener);
        }
    }

    public final void setOnOptionButtonClickListener(@NotNull View.OnClickListener listener) {
        ImageButton optionButton = getOptionButton();
        if (optionButton != null) {
            optionButton.setOnClickListener(listener);
        }
    }

    public final void setOptionButtonDrawable(@Nullable Drawable icon) {
        ImageButton optionButton = getOptionButton();
        if (optionButton != null) {
            optionButton.setImageDrawable(icon);
        }
    }

    public final void setOptionButtonTintList(@NotNull ColorStateList colorStateList) {
        ImageButton optionButton = getOptionButton();
        if (optionButton != null) {
            ImageViewCompat.setImageTintList(optionButton, colorStateList);
        }
    }

    public final void setOptionButtonVisible(boolean visible) {
        int i11;
        ImageButton optionButton = getOptionButton();
        if (optionButton != null) {
            if (visible) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            optionButton.setVisibility(i11);
        }
        TextView textView = this.titleView;
        if (textView != null) {
            centerTitle(textView);
        }
    }

    public /* synthetic */ SNSToolbarView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_ToolbarViewStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSToolbarView : i12);
    }

    @JvmOverloads
    public SNSToolbarView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        C28955c c28955c;
        Bitmap bitmap;
        super(context, attributeSet, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSToolbarView, i11, i12);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(R$styleable.SNSToolbarView_sns_toolbarViewLayout, 0), (ViewGroup) this, true);
        int i13 = R$styleable.SNSToolbarView_sns_toolbarIconTint;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            setIconTintList(AbstractC28458h.m69329a(typedArrayObtainStyledAttributes, context, i13));
        }
        int i14 = R$styleable.SNSToolbarView_sns_iconClose;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            setCloseButtonDrawable(typedArrayObtainStyledAttributes.getDrawable(i14));
        }
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
        C28468k0 c28468k0 = C28468k0.f57983a;
        SNSJsonCustomization customization = c28468k0.getCustomization();
        Integer num = null;
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            Map map = c28966p.f58879e;
            AbstractC28962j abstractC28962j = map != null ? (AbstractC28962j) map.get(ImageElementName.ICON_CLOSE.getValue()) : null;
            C28957e c28957e = abstractC28962j instanceof C28957e ? (C28957e) abstractC28962j : null;
            if (c28957e != null && (bitmap = c28957e.f58864d) != null) {
                setCloseButtonDrawable(new BitmapDrawable(bitmap));
            }
            SNSColorElement sNSColorElement = SNSColorElement.NAVIGATION_BAR_ITEM;
            SNSJsonCustomization customization2 = c28468k0.getCustomization();
            SNSCustomizationTheme theme2 = customization2 != null ? customization2.getTheme() : null;
            C28966p c28966p2 = theme2 instanceof C28966p ? (C28966p) theme2 : null;
            if (c28966p2 != null) {
                boolean zM69346a = AbstractC28458h.m69346a(getResources().getConfiguration());
                Map map2 = c28966p2.f58877c;
                if (map2 != null && (c28955c = (C28955c) map2.get(sNSColorElement.getValue())) != null) {
                    if (zM69346a) {
                        num = c28955c.f58858a;
                    } else {
                        num = c28955c.f58859b;
                    }
                }
                if (num != null) {
                    setIconTintList(ColorStateList.valueOf(num.intValue()));
                }
            }
        }
    }
}
