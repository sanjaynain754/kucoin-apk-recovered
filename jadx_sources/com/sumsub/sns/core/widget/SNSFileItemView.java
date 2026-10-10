package com.sumsub.sns.core.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.firebase.messaging.Constants;
import com.squareup.picasso.C27835s;
import com.squareup.picasso.Picasso;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$color;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.presentation.base.AbstractActivityC28115f;
import com.sumsub.sns.core.presentation.helper.AbstractC28233a;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import com.sumsub.sns.internal.core.presentation.widget.InterfaceC28973a;
import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import com.sumsub.sns.internal.util.AbstractC33407i;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0016\u0018\u0000 g2\u00020\u00012\u00020\u0002:\u0001gB1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001a\u0010\u0016J\u0017\u0010\u001d\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u000f¢\u0006\u0004\b%\u0010\u0012J\u001d\u0010(\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u000f¢\u0006\u0004\b(\u0010)J!\u0010-\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010,\u001a\u00020\u0007¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\f2\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\f2\u0006\u00103\u001a\u00020\u000fH\u0016¢\u0006\u0004\b4\u0010\u0012J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\f2\u0006\u00108\u001a\u000205H\u0016¢\u0006\u0004\b9\u0010:J/\u0010?\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u0007H\u0014¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\f2\u0006\u0010B\u001a\u00020AH\u0014¢\u0006\u0004\bC\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010GR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010Q\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010GR\u0018\u0010R\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010KR\u0018\u0010T\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010W\u001a\u0004\u0018\u00010V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010\\\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010e\u001a\u00020d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010f¨\u0006h"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSFileItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/sumsub/sns/internal/core/presentation/widget/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "resetPath", "()V", "", "isDashed", "setStrokeDashed", "(Z)V", "", "text", "setText", "(Ljava/lang/CharSequence;)V", "setOptionalText", "setDescription", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "setError", "Landroid/graphics/drawable/Drawable;", TUIConstants.TUIChat.INPUT_MORE_ICON, "setStartIcon", "(Landroid/graphics/drawable/Drawable;)V", "setEndIcon", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setEndIconClickListener", "(Landroid/view/View$OnClickListener;)V", ViewProps.VISIBLE, "setEndIconVisible", "progress", ReactProgressBarViewManager.PROP_INDETERMINATE, "setProgress", "(IZ)V", "Landroid/graphics/Bitmap;", "bitmap", "rotation", "setImageBitmap", "(Landroid/graphics/Bitmap;I)V", "", "url", "loadImage", "(Ljava/lang/String;)V", "enabled", "setEnabled", "Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;", "getSNSStepState", "()Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;", "state", "setSNSStepState", "(Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)V", "w", CmcdData.Factory.STREAMING_FORMAT_HLS, "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Landroid/widget/ImageView;", "ivStartIcon", "Landroid/widget/ImageView;", "ivEndIcon", "Landroid/widget/TextView;", "tvText", "Landroid/widget/TextView;", "tvOptionalText", "tvDescription", "Lcom/sumsub/sns/core/widget/SNSHorizontalProgressBarView;", "progressBar", "Lcom/sumsub/sns/core/widget/SNSHorizontalProgressBarView;", "ivPreview", "tvError", "Lcom/sumsub/sns/core/widget/SNSStatefulConstraintLayout;", "box", "Lcom/sumsub/sns/core/widget/SNSStatefulConstraintLayout;", "Lcom/squareup/picasso/Picasso;", "picasso", "Lcom/squareup/picasso/Picasso;", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "weakColor", "Ljava/lang/Integer;", "Landroid/graphics/RectF;", "rectF", "Landroid/graphics/RectF;", "Landroid/graphics/Path;", "path", "Landroid/graphics/Path;", "", "cornerRadius", "F", "Companion", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSFileItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSFileItemView.kt\ncom/sumsub/sns/core/widget/SNSFileItemView\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 ThemeHelper.kt\ncom/sumsub/sns/core/presentation/helper/ThemeHelper\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ViewThemeExtensions.kt\ncom/sumsub/sns/core/presentation/helper/ViewThemeExtensionsKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n+ 7 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,328:1\n59#2,2:329\n22#3:331\n1#4:332\n1#4:341\n37#5:333\n37#5:334\n256#6,2:335\n256#6,2:337\n256#6,2:339\n298#6,2:342\n212#7,8:344\n*S KotlinDebug\n*F\n+ 1 SNSFileItemView.kt\ncom/sumsub/sns/core/widget/SNSFileItemView\n*L\n71#1:329,2\n127#1:331\n127#1:332\n176#1:333\n180#1:334\n250#1:335,2\n276#1:337,2\n282#1:339,2\n285#1:342,2\n312#1:344,8\n*E\n"})
public class SNSFileItemView extends ConstraintLayout implements InterfaceC28973a {

    @Nullable
    private GradientDrawable backgroundDrawable;

    @Nullable
    private SNSStatefulConstraintLayout box;
    private float cornerRadius;

    @Nullable
    private ImageView ivEndIcon;

    @Nullable
    private ImageView ivPreview;

    @Nullable
    private ImageView ivStartIcon;

    @NotNull
    private final Path path;

    @Nullable
    private final Picasso picasso;

    @Nullable
    private SNSHorizontalProgressBarView progressBar;

    @NotNull
    private final RectF rectF;

    @Nullable
    private TextView tvDescription;

    @Nullable
    private TextView tvError;

    @Nullable
    private TextView tvOptionalText;

    @Nullable
    private TextView tvText;

    @Nullable
    private Integer weakColor;

    @JvmOverloads
    public SNSFileItemView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public final void setProgress(int progress, boolean indeterminate) {
        if (indeterminate) {
            SNSHorizontalProgressBarView sNSHorizontalProgressBarView = this.progressBar;
            if (sNSHorizontalProgressBarView != null) {
                AbstractC28458h.m69354d(sNSHorizontalProgressBarView);
            }
            SNSHorizontalProgressBarView sNSHorizontalProgressBarView2 = this.progressBar;
            if (sNSHorizontalProgressBarView2 != null) {
                sNSHorizontalProgressBarView2.setIndeterminate(true);
                return;
            }
            return;
        }
        SNSHorizontalProgressBarView sNSHorizontalProgressBarView3 = this.progressBar;
        if (sNSHorizontalProgressBarView3 != null) {
            sNSHorizontalProgressBarView3.setIndeterminate(false);
        }
        if (progress == 0 || progress >= 100) {
            SNSHorizontalProgressBarView sNSHorizontalProgressBarView4 = this.progressBar;
            if (sNSHorizontalProgressBarView4 != null) {
                AbstractC28458h.m69351b(sNSHorizontalProgressBarView4);
            }
        } else {
            SNSHorizontalProgressBarView sNSHorizontalProgressBarView5 = this.progressBar;
            if (sNSHorizontalProgressBarView5 != null) {
                AbstractC28458h.m69354d(sNSHorizontalProgressBarView5);
            }
        }
        SNSHorizontalProgressBarView sNSHorizontalProgressBarView6 = this.progressBar;
        if (sNSHorizontalProgressBarView6 != null) {
            sNSHorizontalProgressBarView6.setProgress(progress, true);
        }
    }

    @JvmOverloads
    public SNSFileItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final void resetPath() {
        this.path.reset();
        Path path = this.path;
        RectF rectF = this.rectF;
        float f11 = this.cornerRadius;
        path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
        this.path.close();
    }

    public static /* synthetic */ void setImageBitmap$default(SNSFileItemView sNSFileItemView, Bitmap bitmap, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setImageBitmap");
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        sNSFileItemView.setImageBitmap(bitmap, i11);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        Path path = this.path;
        int iSave = canvas.save();
        canvas.clipPath(path);
        try {
            super.dispatchDraw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // com.sumsub.sns.internal.core.presentation.widget.InterfaceC28973a
    @NotNull
    public SNSStepState getSNSStepState() {
        SNSStepState sNSStepState;
        SNSStatefulConstraintLayout sNSStatefulConstraintLayout = this.box;
        return (sNSStatefulConstraintLayout == null || (sNSStepState = sNSStatefulConstraintLayout.getSNSStepState()) == null) ? SNSStepState.INIT : sNSStepState;
    }

    public final void loadImage(@Nullable String url) {
        C27835s c27835sM68795i;
        C27835s c27835sM68909g;
        Picasso picasso;
        if (url == null) {
            ImageView imageView = this.ivPreview;
            if (imageView != null) {
                imageView.setImageBitmap(null);
            }
            ImageView imageView2 = this.ivStartIcon;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            ImageView imageView3 = this.ivPreview;
            if (imageView3 == null || (picasso = this.picasso) == null) {
                return;
            }
            picasso.m68788b(imageView3);
            return;
        }
        ImageView imageView4 = this.ivStartIcon;
        if (imageView4 != null) {
            imageView4.setVisibility(8);
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R$dimen.sns_icon_size_normal_large);
        Picasso picasso2 = this.picasso;
        if (picasso2 == null || (c27835sM68795i = picasso2.m68795i(url)) == null || (c27835sM68909g = c27835sM68795i.m68909g(dimensionPixelSize, dimensionPixelSize)) == null) {
            return;
        }
        if (((Boolean) AbstractC33407i.f68112a.getValue()).booleanValue()) {
            c27835sM68909g.m68908f();
        }
        c27835sM68909g.m68906d(this.ivPreview);
    }

    public final void setDescription(@Nullable CharSequence text) {
        TextView textView = this.tvDescription;
        if (textView != null) {
            AbstractC28458h.m69341a(textView, text);
        }
    }

    public final void setEndIcon(@Nullable Drawable icon) {
        ImageView imageView = this.ivEndIcon;
        if (imageView != null) {
            imageView.setImageDrawable(icon);
            imageView.setVisibility(icon != null ? 0 : 8);
        }
    }

    public final void setEndIconClickListener(@Nullable View.OnClickListener listener) {
        ImageView imageView = this.ivEndIcon;
        if (imageView != null) {
            imageView.setOnClickListener(listener);
        }
    }

    public final void setEndIconVisible(boolean visible) {
        ImageView imageView = this.ivEndIcon;
        if (imageView != null) {
            imageView.setVisibility(visible ? 0 : 8);
        }
    }

    public final void setError(@Nullable CharSequence error) {
        TextView textView = this.tvError;
        if (textView != null) {
            AbstractC28458h.m69341a(textView, error);
        }
        if (error == null || error.length() == 0) {
            setSNSStepState(SNSStepState.INIT);
        } else {
            setSNSStepState(SNSStepState.REJECTED);
        }
    }

    public final void setImageBitmap(@Nullable Bitmap bitmap, int rotation) {
        ImageView imageView = this.ivPreview;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        ImageView imageView2 = this.ivPreview;
        if (imageView2 != null) {
            imageView2.setRotation(rotation);
        }
        ImageView imageView3 = this.ivStartIcon;
        if (imageView3 != null) {
            imageView3.setVisibility(bitmap == null ? 0 : 8);
        }
    }

    public final void setOptionalText(@Nullable CharSequence text) {
        TextView textView = this.tvOptionalText;
        if (textView != null) {
            AbstractC28458h.m69341a(textView, text);
        }
    }

    @Override // com.sumsub.sns.internal.core.presentation.widget.InterfaceC28973a
    public void setSNSStepState(@NotNull SNSStepState state) {
        SNSStatefulConstraintLayout sNSStatefulConstraintLayout = this.box;
        if (sNSStatefulConstraintLayout != null) {
            sNSStatefulConstraintLayout.setSNSStepState(state);
        }
    }

    public final void setStartIcon(@Nullable Drawable icon) {
        ImageView imageView = this.ivStartIcon;
        if (imageView != null) {
            imageView.setImageDrawable(icon);
        }
    }

    public final void setStrokeDashed(boolean isDashed) {
        Integer num = this.weakColor;
        int iIntValue = num != null ? num.intValue() : -16711681;
        int i11 = (int) (1 * Resources.getSystem().getDisplayMetrics().density);
        if (!isDashed) {
            GradientDrawable gradientDrawable = this.backgroundDrawable;
            if (gradientDrawable != null) {
                gradientDrawable.setStroke(i11, ColorStateList.valueOf(iIntValue));
                return;
            }
            return;
        }
        float f11 = (int) (4 * Resources.getSystem().getDisplayMetrics().density);
        GradientDrawable gradientDrawable2 = this.backgroundDrawable;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setStroke(i11, ColorStateList.valueOf(iIntValue), f11, f11);
        }
    }

    public final void setText(@Nullable CharSequence text) {
        if (((Boolean) AbstractC33407i.f68112a.getValue()).booleanValue() && !Intrinsics.areEqual(text, "Add file")) {
            text = "Test";
        }
        TextView textView = this.tvText;
        if (textView != null) {
            textView.setText(text);
        }
    }

    @JvmOverloads
    public SNSFileItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    @Override // android.view.View
    public void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        this.rectF.set(0.0f, 0.0f, w11, h11);
        resetPath();
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        float f11;
        super.setEnabled(enabled);
        if (enabled) {
            f11 = 1.0f;
        } else {
            f11 = 0.5f;
        }
        setAlpha(f11);
    }

    public /* synthetic */ SNSFileItemView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_fileItemViewStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSFileItemView : i12);
    }

    @JvmOverloads
    public SNSFileItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        float dimensionPixelSize;
        ImageView imageView;
        ImageView imageView2;
        Integer numM69172a;
        Integer numM69172a2;
        TextView textView;
        ImageView imageView3;
        ImageView imageView4;
        C28578h c28578h;
        super(context, attributeSet, i11);
        AbstractActivityC28115f abstractActivityC28115f = context instanceof AbstractActivityC28115f ? (AbstractActivityC28115f) context : null;
        this.picasso = (abstractActivityC28115f == null || (c28578h = (C28578h) abstractActivityC28115f.f57328a.getValue()) == null) ? null : (Picasso) c28578h.f58151H.getValue();
        this.rectF = new RectF();
        this.path = new Path();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSFileItemView, i11, i12);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(R$styleable.SNSFileItemView_sns_fileItemViewLayout, R$layout.sns_layout_file_component), (ViewGroup) this, true);
        this.progressBar = (SNSHorizontalProgressBarView) findViewById(R$id.sns_progress_bar);
        this.ivEndIcon = (ImageView) findViewById(R$id.sns_end_icon);
        this.ivStartIcon = (ImageView) findViewById(R$id.sns_start_icon);
        this.tvOptionalText = (TextView) findViewById(R$id.sns_optional_text);
        this.tvText = (TextView) findViewById(R$id.sns_text);
        this.ivPreview = (ImageView) findViewById(R$id.sns_image);
        this.tvDescription = (TextView) findViewById(R$id.sns_description);
        this.tvError = (TextView) findViewById(R$id.sns_file_error);
        this.box = (SNSStatefulConstraintLayout) findViewById(R$id.sns_box);
        int i13 = R$styleable.SNSFileItemView_sns_startIconTint;
        if (typedArrayObtainStyledAttributes.hasValue(i13) && (imageView4 = this.ivStartIcon) != null) {
            imageView4.setImageTintList(AbstractC28458h.m69329a(typedArrayObtainStyledAttributes, context, i13));
        }
        int i14 = R$styleable.SNSFileItemView_sns_endIconTint;
        if (typedArrayObtainStyledAttributes.hasValue(i14) && (imageView3 = this.ivEndIcon) != null) {
            imageView3.setImageTintList(AbstractC28458h.m69329a(typedArrayObtainStyledAttributes, context, i14));
        }
        int i15 = R$styleable.SNSFileItemView_android_textColor;
        if (typedArrayObtainStyledAttributes.hasValue(i15) && (textView = this.tvText) != null) {
            textView.setTextColor(AbstractC28458h.m69329a(typedArrayObtainStyledAttributes, context, i15));
        }
        this.weakColor = Integer.valueOf(context.getColor(R$color.sns_color_neutral_20));
        int i16 = R$styleable.SNSFileItemView_background;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(i16);
            RippleDrawable rippleDrawable = drawable instanceof RippleDrawable ? (RippleDrawable) drawable : null;
            if (rippleDrawable != null) {
                int numberOfLayers = rippleDrawable.getNumberOfLayers();
                for (int i17 = 0; i17 < numberOfLayers; i17++) {
                    Drawable drawable2 = rippleDrawable.getDrawable(i17);
                    if (drawable2 instanceof GradientDrawable) {
                        this.backgroundDrawable = (GradientDrawable) drawable2;
                        break;
                    }
                }
            }
            SNSStatefulConstraintLayout sNSStatefulConstraintLayout = this.box;
            if (sNSStatefulConstraintLayout != null) {
                sNSStatefulConstraintLayout.setBackground(rippleDrawable);
            }
        }
        int i18 = R$styleable.SNSFileItemView_previewCornerRadius;
        if (typedArrayObtainStyledAttributes.hasValue(i18)) {
            ImageView imageView5 = this.ivPreview;
            ShapeableImageView shapeableImageView = imageView5 instanceof ShapeableImageView ? (ShapeableImageView) imageView5 : null;
            if (shapeableImageView != null) {
                shapeableImageView.setShapeAppearanceModel(new ShapeAppearanceModel.Builder().setAllCornerSizes(typedArrayObtainStyledAttributes.getDimension(i18, 0.0f)).build());
            }
        }
        Resources resources = context.getResources();
        int i19 = R$dimen.sns_file_attachment_corner_radius;
        this.cornerRadius = resources.getDimension(i19);
        typedArrayObtainStyledAttributes.recycle();
        C28966p c28966pM69169a = AbstractC28233a.m69169a();
        if (c28966pM69169a != null) {
            Integer numM69174a = AbstractC28234b.m69174a(this, SNSColorElement.FIELD_BACKGROUND);
            Integer numM69174a2 = AbstractC28234b.m69174a(this, SNSColorElement.FIELD_BACKGROUND_INVALID);
            numM69174a2 = numM69174a2 == null ? AbstractC28234b.m69174a(this, SNSColorElement.BACKGROUND_CRITICAL) : numM69174a2;
            Integer numM69174a3 = AbstractC28234b.m69174a(this, SNSColorElement.CONTENT_WEAK);
            this.weakColor = numM69174a3;
            Float fM69171a = AbstractC28233a.m69171a(c28966pM69169a, SNSMetricElement.FIELD_CORNER_RADIUS);
            if (numM69174a != null || numM69174a3 != null || fM69171a != null) {
                int[][] iArr = {new int[]{R$attr.sns_stateInit}, new int[]{R$attr.sns_stateRejected}, new int[0]};
                int iM69328a = AbstractC28458h.m69328a(context, R.attr.colorBackground);
                int iM69328a2 = AbstractC28458h.m69328a(context, R$attr.sns_colorRejected);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(new ColorStateList(iArr, new int[]{numM69174a != null ? numM69174a.intValue() : iM69328a, numM69174a2 != null ? numM69174a2.intValue() : iM69328a2, numM69174a != null ? numM69174a.intValue() : iM69328a}));
                if (fM69171a != null) {
                    dimensionPixelSize = fM69171a.floatValue();
                } else {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(i19);
                }
                gradientDrawable.setCornerRadius(dimensionPixelSize);
                this.cornerRadius = dimensionPixelSize;
                if (numM69174a3 != null && (imageView2 = this.ivStartIcon) != null) {
                    imageView2.setImageTintList(ColorStateList.valueOf(numM69174a3.intValue()));
                }
                SNSStatefulConstraintLayout sNSStatefulConstraintLayout2 = this.box;
                if (sNSStatefulConstraintLayout2 != null) {
                    sNSStatefulConstraintLayout2.setBackground(gradientDrawable);
                }
                if (numM69174a != null && (imageView = this.ivPreview) != null) {
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setColor(ColorStateList.valueOf(numM69174a.intValue()));
                    imageView.setBackground(gradientDrawable2);
                }
                this.backgroundDrawable = gradientDrawable;
            }
            SNSColorElement sNSColorElement = SNSColorElement.CONTENT_STRONG;
            C28966p c28966pM69169a2 = AbstractC28233a.m69169a();
            if (c28966pM69169a2 != null && (numM69172a2 = AbstractC28233a.m69172a(c28966pM69169a2, sNSColorElement, AbstractC28458h.m69346a(getResources().getConfiguration()))) != null) {
                int iIntValue = numM69172a2.intValue();
                ImageView imageView6 = this.ivEndIcon;
                if (imageView6 != null) {
                    imageView6.setImageTintList(ColorStateList.valueOf(iIntValue));
                }
            }
            SNSColorElement sNSColorElement2 = SNSColorElement.CONTENT_LINK;
            C28966p c28966pM69169a3 = AbstractC28233a.m69169a();
            if (c28966pM69169a3 != null && (numM69172a = AbstractC28233a.m69172a(c28966pM69169a3, sNSColorElement2, AbstractC28458h.m69346a(getResources().getConfiguration()))) != null) {
                int iIntValue2 = numM69172a.intValue();
                TextView textView2 = this.tvText;
                if (textView2 != null) {
                    textView2.setTextColor(iIntValue2);
                }
            }
        }
        setStrokeDashed(true);
    }
}
