package com.revolut.revolutpay.p123ui.promo_widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import cb0.C4929a;
import com.revolut.revolutpay.R$id;
import com.revolut.revolutpay.R$layout;
import com.revolut.revolutpay.R$styleable;
import com.revolut.revolutpay.api.params.PromoBannerUiParams;
import com.revolut.revolutpay.domain.model.CountryCode;
import com.revolut.revolutpay.p123ui.picker.C27571h;
import com.revolut.revolutpay.ui_kit.params.C27595c;
import com.revolut.revolutpay.ui_kit.params.EnumC27596d;
import com.revolut.revolutpay.ui_kit.widget.PhoneInputWidget;
import com.revolut.revolutpay.ui_kit.widget.RevPayTextView;
import com.revolut.revolutpay.ui_kit.widget.large_action_button.LargeActionButton;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import qa0.C43679d;
import sa0.InterfaceC44373c;
import ya0.AbstractC46424c;
import za0.C46744c;
import za0.C46745d;

/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 `2\u00020\u00012\u00020\u0002:\u0001aB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0014¢\u0006\u0004\b(\u0010)J\u0019\u0010+\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010'H\u0014¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b-\u0010\u0006J\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0006R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00104R\u0016\u00109\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00100R\u0016\u0010;\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u00104R\u0016\u0010=\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u00104R\u0016\u0010?\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u00104R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010E\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u00104R\u0016\u0010I\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010Q\u001a\u00020N8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020N8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010PR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010[\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010_\u001a\u00020\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^¨\u0006b"}, m90084d2 = {"Lcom/revolut/revolutpay/ui/promo_widget/RevolutPromoBannerWidget;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "c", "()V", "d", "onAttachedToWindow", "onDetachedFromWindow", "", HintConstants.AUTOFILL_HINT_PHONE, "setPhoneNumberEntered", "(Ljava/lang/String;)V", "getLocale", "()Ljava/lang/String;", "getLanguage", "getLinkColor", "()I", "Lcom/revolut/revolutpay/domain/model/CountryCode;", "getLocaleCountryCode", "()Lcom/revolut/revolutpay/domain/model/CountryCode;", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Lcom/revolut/revolutpay/ui_kit/params/d;", "phoneInputState", "setPhoneInputState", "(Lcom/revolut/revolutpay/ui_kit/params/d;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "f", "Landroid/view/View;", "n", "Landroid/view/View;", "topBannerLayout", "Lcom/revolut/revolutpay/ui_kit/widget/RevPayTextView;", "o", "Lcom/revolut/revolutpay/ui_kit/widget/RevPayTextView;", "titleTextView", "p", "descriptionTextView", "q", "successIcon", "r", "successTitleTextView", CmcdData.Factory.STREAMING_FORMAT_SS, "downloadRevolutTextView", "t", "footerTextView", "Lcom/revolut/revolutpay/ui_kit/widget/PhoneInputWidget;", "u", "Lcom/revolut/revolutpay/ui_kit/widget/PhoneInputWidget;", "phoneInputWidget", "v", "errorTextView", "Lcom/revolut/revolutpay/ui_kit/widget/large_action_button/LargeActionButton;", "w", "Lcom/revolut/revolutpay/ui_kit/widget/large_action_button/LargeActionButton;", "inviteButton", "Landroid/content/res/Resources;", "x", "Landroid/content/res/Resources;", "resources", "Landroidx/constraintlayout/widget/Group;", "y", "Landroidx/constraintlayout/widget/Group;", "successGroup", "z", "confirmationGroup", "Landroid/graphics/Paint;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroid/graphics/Paint;", "borderPaint", "", "B", "F", "cornerRadiusPx", "Lcom/revolut/revolutpay/api/params/PromoBannerUiParams;", "C", "Lcom/revolut/revolutpay/api/params/PromoBannerUiParams;", "bannerUiParams", "D", "Companion", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1})
public final class RevolutPromoBannerWidget extends ConstraintLayout implements InterfaceC44373c {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final Paint borderPaint;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public float cornerRadiusPx;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public PromoBannerUiParams bannerUiParams;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public View topBannerLayout;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public RevPayTextView titleTextView;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public RevPayTextView descriptionTextView;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public View successIcon;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public RevPayTextView successTitleTextView;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public RevPayTextView downloadRevolutTextView;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public RevPayTextView footerTextView;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public PhoneInputWidget phoneInputWidget;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public RevPayTextView errorTextView;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public LargeActionButton inviteButton;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public Resources resources;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public Group successGroup;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public Group confirmationGroup;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevolutPromoBannerWidget(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.borderPaint = new Paint();
        this.bannerUiParams = PromoBannerUiParams.INSTANCE.m103801default();
        if (getId() == -1) {
            setId(R$id.internalRevolutPay_PromoBanner);
        }
        setSaveEnabled(true);
        m68470f(context);
        m68469d(context);
        m68465c();
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ InterfaceC27582a m68464c(RevolutPromoBannerWidget revolutPromoBannerWidget) {
        revolutPromoBannerWidget.getClass();
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m68469d(Context context) {
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        this.resources = resources;
        View.inflate(context, R$layout.internal_revolut_promo_banner_layout, this);
        View viewFindViewById = findViewById(R$id.internalRevolutPromoBanner_topBannerLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.intern…moBanner_topBannerLayout)");
        this.topBannerLayout = viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.internalRevolutPromoBanner_bannerTitleTextView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.intern…nner_bannerTitleTextView)");
        this.titleTextView = (RevPayTextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.internalRevolutPromoBanner_descriptionTextView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.intern…nner_descriptionTextView)");
        this.descriptionTextView = (RevPayTextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.internalRevolutPromoBanner_successIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(R.id.intern…tPromoBanner_successIcon)");
        this.successIcon = viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.internalRevolutPromoBanner_successTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(R.id.intern…PromoBanner_successTitle)");
        this.successTitleTextView = (RevPayTextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R$id.internalRevolutPromoBanner_footerTextView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(R.id.intern…omoBanner_footerTextView)");
        this.footerTextView = (RevPayTextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R$id.internalRevolutPromoBanner_downloadRevolutTextView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(R.id.intern…_downloadRevolutTextView)");
        this.downloadRevolutTextView = (RevPayTextView) viewFindViewById7;
        View viewFindViewById8 = findViewById(R$id.internalRevolutPromoBanner_phoneInputWidget);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(R.id.intern…oBanner_phoneInputWidget)");
        this.phoneInputWidget = (PhoneInputWidget) viewFindViewById8;
        View viewFindViewById9 = findViewById(R$id.internalRevolutPromoBanner_errorTextView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(R.id.intern…romoBanner_errorTextView)");
        this.errorTextView = (RevPayTextView) viewFindViewById9;
        View viewFindViewById10 = findViewById(R$id.internalRevolutPromoBanner_successGroup);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(R.id.intern…PromoBanner_successGroup)");
        this.successGroup = (Group) viewFindViewById10;
        View viewFindViewById11 = findViewById(R$id.internalRevolutPromoBanner_confirmationGroup);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(R.id.intern…Banner_confirmationGroup)");
        this.confirmationGroup = (Group) viewFindViewById11;
        View viewFindViewById12 = findViewById(R$id.internalRevolutPromoBanner_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(R.id.intern…evolutPromoBanner_button)");
        LargeActionButton largeActionButton = (LargeActionButton) viewFindViewById12;
        this.inviteButton = largeActionButton;
        PhoneInputWidget phoneInputWidget = null;
        if (largeActionButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inviteButton");
            largeActionButton = null;
        }
        largeActionButton.setEnabled(false);
        LargeActionButton largeActionButton2 = this.inviteButton;
        if (largeActionButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inviteButton");
            largeActionButton2 = null;
        }
        largeActionButton2.setOnClickListener(new View.OnClickListener() { // from class: com.revolut.revolutpay.ui.promo_widget.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RevolutPromoBannerWidget.m68467e(this.f56347b, view);
            }
        });
        Group group = this.successGroup;
        if (group == null) {
            Intrinsics.throwUninitializedPropertyAccessException("successGroup");
            group = null;
        }
        group.setVisibility(8);
        RevPayTextView revPayTextView = this.errorTextView;
        if (revPayTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorTextView");
            revPayTextView = null;
        }
        revPayTextView.setVisibility(8);
        Resources resources2 = this.resources;
        if (resources2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resources");
            resources2 = null;
        }
        setMaxWidth(C43679d.m96139a(600.0f, resources2));
        setVisibility(8);
        this.borderPaint.setStyle(Paint.Style.STROKE);
        PhoneInputWidget phoneInputWidget2 = this.phoneInputWidget;
        if (phoneInputWidget2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("phoneInputWidget");
            phoneInputWidget2 = null;
        }
        phoneInputWidget2.setCountryCodeClickListener(new View.OnClickListener() { // from class: com.revolut.revolutpay.ui.promo_widget.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RevolutPromoBannerWidget.m68468g(this.f56348b, view);
            }
        });
        PhoneInputWidget phoneInputWidget3 = this.phoneInputWidget;
        if (phoneInputWidget3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("phoneInputWidget");
        } else {
            phoneInputWidget = phoneInputWidget3;
        }
        phoneInputWidget.setPhoneNumberListener(new Function1<C27595c, Unit>() { // from class: com.revolut.revolutpay.ui.promo_widget.RevolutPromoBannerWidget$init$3
            {
                super(1);
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C27595c c27595c) {
                m68471a(c27595c);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: a */
            public final void m68471a(@NotNull C27595c phoneNumber) {
                Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
                RevolutPromoBannerWidget.m68464c(this.f56346a);
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
                throw null;
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevolutPromoBannerWidget(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.borderPaint = new Paint();
        this.bannerUiParams = PromoBannerUiParams.INSTANCE.m103801default();
        if (getId() == -1) {
            setId(R$id.internalRevolutPay_PromoBanner);
        }
        setSaveEnabled(true);
        m68470f(context);
        m68469d(context);
        m68465c();
    }

    /* JADX INFO: renamed from: c */
    private final void m68465c() {
        PromoBannerUiParams promoBannerUiParams = this.bannerUiParams;
        this.cornerRadiusPx = promoBannerUiParams.getBannerCornerRadius() * getContext().getResources().getDisplayMetrics().density;
        RevPayTextView revPayTextView = null;
        setOutlineProvider(new C46744c(this.cornerRadiusPx, false, 2, null));
        setClipToOutline(this.cornerRadiusPx > 0.0f);
        View view = this.topBannerLayout;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topBannerLayout");
            view = null;
        }
        view.setBackgroundColor(promoBannerUiParams.getColorAccent());
        AbstractC46424c backgroundTextColorVariant = promoBannerUiParams.getBackgroundTextColorVariant();
        PhoneInputWidget phoneInputWidget = this.phoneInputWidget;
        if (phoneInputWidget == null) {
            Intrinsics.throwUninitializedPropertyAccessException("phoneInputWidget");
            phoneInputWidget = null;
        }
        phoneInputWidget.setTextColorVariant(backgroundTextColorVariant);
        RevPayTextView revPayTextView2 = this.successTitleTextView;
        if (revPayTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("successTitleTextView");
            revPayTextView2 = null;
        }
        revPayTextView2.setTextColor(backgroundTextColorVariant.m102390a());
        RevPayTextView revPayTextView3 = this.descriptionTextView;
        if (revPayTextView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("descriptionTextView");
            revPayTextView3 = null;
        }
        revPayTextView3.setTextColor(backgroundTextColorVariant.m102390a());
        RevPayTextView revPayTextView4 = this.footerTextView;
        if (revPayTextView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("footerTextView");
            revPayTextView4 = null;
        }
        revPayTextView4.setTextColor(backgroundTextColorVariant.m102392c());
        RevPayTextView revPayTextView5 = this.titleTextView;
        if (revPayTextView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleTextView");
        } else {
            revPayTextView = revPayTextView5;
        }
        revPayTextView.setTextColor(promoBannerUiParams.getForegroundTextColorVariant().m102390a());
        float strokeWidth = promoBannerUiParams.getStrokeWidth() * getContext().getResources().getDisplayMetrics().density;
        this.borderPaint.setStrokeWidth(2.0f * strokeWidth);
        int i11 = (int) strokeWidth;
        setPadding(i11, i11, i11, i11);
    }

    /* JADX INFO: renamed from: d */
    private final void m68466d() {
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        PhoneInputWidget phoneInputWidget = this.phoneInputWidget;
        if (phoneInputWidget == null) {
            Intrinsics.throwUninitializedPropertyAccessException("phoneInputWidget");
            phoneInputWidget = null;
        }
        phoneInputWidget.getPhoneInputData();
        throw null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (this.borderPaint.getStrokeWidth() > 0.0f) {
            float f11 = canvas.getClipBounds().left;
            float f12 = canvas.getClipBounds().top;
            float f13 = canvas.getClipBounds().right;
            float f14 = canvas.getClipBounds().bottom;
            float f15 = this.cornerRadiusPx;
            canvas.drawRoundRect(f11, f12, f13, f14, f15, f15, this.borderPaint);
        }
    }

    @NotNull
    public String getLanguage() {
        C4929a c4929a = C4929a.f5465a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        String language = c4929a.m5148a(context).getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "context.getLocale().language");
        return language;
    }

    public int getLinkColor() {
        return this.bannerUiParams.getColorAccent();
    }

    @NotNull
    public String getLocale() {
        C4929a c4929a = C4929a.f5465a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        String string = c4929a.m5148a(context).toString();
        Intrinsics.checkNotNullExpressionValue(string, "context.getLocale().toString()");
        return string;
    }

    @NotNull
    public CountryCode getLocaleCountryCode() {
        CountryCode.Companion companion = CountryCode.INSTANCE;
        C4929a c4929a = C4929a.f5465a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        String country = c4929a.m5148a(context).getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "context.getLocale().country");
        return companion.fromValue(country);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable state) {
        if (!(state instanceof Bundle)) {
            super.onRestoreInstanceState(state);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            ((Bundle) state).getParcelable("banner_state");
            throw null;
        }
    }

    @Override // android.view.View
    @NotNull
    public Parcelable onSaveInstanceState() {
        new Bundle().putParcelable("super_state", super.onSaveInstanceState());
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevolutPromoBannerWidget(@NotNull Context context, @NotNull AttributeSet attrs, int i11) {
        super(context, attrs, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.borderPaint = new Paint();
        this.bannerUiParams = PromoBannerUiParams.INSTANCE.m103801default();
        if (getId() == -1) {
            setId(R$id.internalRevolutPay_PromoBanner);
        }
        setSaveEnabled(true);
        m68470f(context);
        m68469d(context);
        m68465c();
    }

    /* JADX INFO: renamed from: e */
    public static final void m68467e(RevolutPromoBannerWidget this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m68466d();
    }

    /* JADX INFO: renamed from: g */
    public static final void m68468g(RevolutPromoBannerWidget this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getClass();
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public final void m68470f(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(R$styleable.PromoBannerWidget);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.PromoBannerWidget_revolutPay_ColorAccent, Color.parseColor("#0666EB"));
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.PromoBannerWidget_revolutPay_ColorBackground, Color.parseColor("#F7F7F7"));
        this.borderPaint.setColor(typedArrayObtainStyledAttributes.getColor(R$styleable.PromoBannerWidget_revolutPay_StrokeColor, 0));
        setBackgroundColor(color2);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.PromoBannerWidget_revolutPay_StrokeWidth, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R$styleable.PromoBannerWidget_revolutPay_BannerCornerRadius, context.getResources().getDisplayMetrics().density * 12.0f);
        float f11 = dimension / context.getResources().getDisplayMetrics().density;
        float f12 = dimension2 / context.getResources().getDisplayMetrics().density;
        C46745d c46745d = C46745d.f104568a;
        this.bannerUiParams = new PromoBannerUiParams(f11, f12, color, c46745d.m102999a(color2), c46745d.m102999a(color));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C27571h.f56311a.m68405a();
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        throw null;
    }

    public void setPhoneInputState(@NotNull EnumC27596d phoneInputState) {
        boolean z11;
        Intrinsics.checkNotNullParameter(phoneInputState, "phoneInputState");
        LargeActionButton largeActionButton = this.inviteButton;
        PhoneInputWidget phoneInputWidget = null;
        if (largeActionButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inviteButton");
            largeActionButton = null;
        }
        if (phoneInputState == EnumC27596d.VALID) {
            z11 = true;
        } else {
            z11 = false;
        }
        largeActionButton.setEnabled(z11);
        PhoneInputWidget phoneInputWidget2 = this.phoneInputWidget;
        if (phoneInputWidget2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("phoneInputWidget");
        } else {
            phoneInputWidget = phoneInputWidget2;
        }
        phoneInputWidget.setPhoneInputState(phoneInputState);
    }

    public void setPhoneNumberEntered(@NotNull String phone) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        PhoneInputWidget phoneInputWidget = this.phoneInputWidget;
        LargeActionButton largeActionButton = null;
        if (phoneInputWidget == null) {
            Intrinsics.throwUninitializedPropertyAccessException("phoneInputWidget");
            phoneInputWidget = null;
        }
        phoneInputWidget.setPhoneText(phone);
        PhoneInputWidget phoneInputWidget2 = this.phoneInputWidget;
        if (phoneInputWidget2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("phoneInputWidget");
            phoneInputWidget2 = null;
        }
        phoneInputWidget2.setVisibility(8);
        LargeActionButton largeActionButton2 = this.inviteButton;
        if (largeActionButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inviteButton");
        } else {
            largeActionButton = largeActionButton2;
        }
        largeActionButton.setEnabled(true);
    }
}
