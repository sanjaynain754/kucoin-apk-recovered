package com.facebook.react.uimanager.drawable;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.style.BorderInsets;
import com.facebook.react.uimanager.style.BorderRadiusStyle;
import com.facebook.react.uimanager.style.ComputedBorderRadius;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.MutablePropertyReference0Impl;
import p852kotlin.reflect.KMutableProperty0;

/* JADX INFO: compiled from: CompositeBackgroundDrawable.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 E2\u00020\u0001:\u0001EBo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010.\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010/\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001J\u0010\u00100\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u00101\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u00102\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u00010\u0005J\u0010\u00104\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001J\u0010\u00105\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u001a\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u00052\u0006\u00109\u001a\u00020:H\u0002J\u001a\u0010;\u001a\u00020<2\b\u00108\u001a\u0004\u0018\u00010\u00052\u0006\u00109\u001a\u00020:H\u0002J\u001a\u0010=\u001a\u00020<2\b\u00108\u001a\u0004\u0018\u00010\u00052\u0006\u00109\u001a\u00020:H\u0002J\u0010\u0010 \u001a\u00020<2\u0006\u0010\u000f\u001a\u00020>H\u0016J=\u0010?\u001a\u00020\u0000\"\n\b\u0000\u0010@*\u0004\u0018\u00010\u00052\u0006\u0010A\u001a\u0002H@2\u0006\u00109\u001a\u00020:2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u0002H@\u0012\u0004\u0012\u00020<0CH\u0002¢\u0006\u0002\u0010DR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006F"}, m90084d2 = {"Lcom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable;", "Landroid/graphics/drawable/LayerDrawable;", "context", "Landroid/content/Context;", "originalBackground", "Landroid/graphics/drawable/Drawable;", "outerShadows", "cssBackground", "Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;", "background", "Lcom/facebook/react/uimanager/drawable/BackgroundDrawable;", "border", "Lcom/facebook/react/uimanager/drawable/BorderDrawable;", "feedbackUnderlay", "innerShadows", "outline", "Lcom/facebook/react/uimanager/drawable/OutlineDrawable;", "<init>", "(Landroid/content/Context;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/LayerDrawable;Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;Lcom/facebook/react/uimanager/drawable/BackgroundDrawable;Lcom/facebook/react/uimanager/drawable/BorderDrawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/LayerDrawable;Lcom/facebook/react/uimanager/drawable/OutlineDrawable;)V", "getOriginalBackground", "()Landroid/graphics/drawable/Drawable;", "getCssBackground", "()Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;", "value", "getOuterShadows", "()Landroid/graphics/drawable/LayerDrawable;", "getBackground", "()Lcom/facebook/react/uimanager/drawable/BackgroundDrawable;", "getBorder", "()Lcom/facebook/react/uimanager/drawable/BorderDrawable;", "getFeedbackUnderlay", "getInnerShadows", "getOutline", "()Lcom/facebook/react/uimanager/drawable/OutlineDrawable;", "borderInsets", "Lcom/facebook/react/uimanager/style/BorderInsets;", "getBorderInsets", "()Lcom/facebook/react/uimanager/style/BorderInsets;", "setBorderInsets", "(Lcom/facebook/react/uimanager/style/BorderInsets;)V", "borderRadius", "Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "getBorderRadius", "()Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "setBorderRadius", "(Lcom/facebook/react/uimanager/style/BorderRadiusStyle;)V", "withNewCssBackground", "withNewOuterShadow", "withNewBackground", "withNewBorder", "withNewFeedbackUnderlay", "newUnderlay", "withNewInnerShadow", "withNewOutline", "updateLayer", "", "layer", "id", "", "insertNewLayer", "", "addLayer", "Landroid/graphics/Outline;", "withNewLayer", ExifInterface.GPS_DIRECTION_TRUE, "newLayer", "setNewLayer", "Lkotlin/Function1;", "(Landroid/graphics/drawable/Drawable;ILkotlin/jvm/functions/Function1;)Lcom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable;", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class CompositeBackgroundDrawable extends LayerDrawable {
    private static final int BACKGROUND_ID = 3;
    private static final int BORDER_ID = 4;
    private static final int CSS_BACKGROUND_ID = 2;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int FEEDBACK_UNDERLAY_ID = 5;
    private static final int INNER_SHADOWS_ID = 6;
    private static final int ORIGINAL_BACKGROUND_ID = 0;
    private static final int OUTER_SHADOWS_ID = 1;
    private static final int OUTLINE_ID = 7;

    @Nullable
    private BackgroundDrawable background;

    @Nullable
    private BorderDrawable border;

    @Nullable
    private BorderInsets borderInsets;

    @Nullable
    private BorderRadiusStyle borderRadius;

    @NotNull
    private final Context context;

    @Nullable
    private final CSSBackgroundDrawable cssBackground;

    @Nullable
    private Drawable feedbackUnderlay;

    @Nullable
    private LayerDrawable innerShadows;

    @Nullable
    private final Drawable originalBackground;

    @Nullable
    private LayerDrawable outerShadows;

    @Nullable
    private OutlineDrawable outline;

    /* JADX INFO: compiled from: CompositeBackgroundDrawable.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable$Companion;", "", "<init>", "()V", "ORIGINAL_BACKGROUND_ID", "", "OUTER_SHADOWS_ID", "CSS_BACKGROUND_ID", "BACKGROUND_ID", "BORDER_ID", "FEEDBACK_UNDERLAY_ID", "INNER_SHADOWS_ID", "OUTLINE_ID", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable$withNewBackground$1 */
    /* JADX INFO: compiled from: CompositeBackgroundDrawable.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class C61241 extends FunctionReferenceImpl implements Function1<BackgroundDrawable, Unit> {
        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BackgroundDrawable backgroundDrawable) {
            invoke2(backgroundDrawable);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(BackgroundDrawable backgroundDrawable) {
            ((KMutableProperty0) this.receiver).set(backgroundDrawable);
        }

        public C61241(Object obj) {
            super(1, obj, KMutableProperty0.class, "set", "set(Ljava/lang/Object;)V", 0);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable$withNewBorder$1 */
    /* JADX INFO: compiled from: CompositeBackgroundDrawable.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class C61261 extends FunctionReferenceImpl implements Function1<BorderDrawable, Unit> {
        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BorderDrawable borderDrawable) {
            invoke2(borderDrawable);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(BorderDrawable borderDrawable) {
            ((KMutableProperty0) this.receiver).set(borderDrawable);
        }

        public C61261(Object obj) {
            super(1, obj, KMutableProperty0.class, "set", "set(Ljava/lang/Object;)V", 0);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable$withNewFeedbackUnderlay$1 */
    /* JADX INFO: compiled from: CompositeBackgroundDrawable.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class C61281 extends FunctionReferenceImpl implements Function1<Drawable, Unit> {
        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Drawable drawable) {
            invoke2(drawable);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Drawable drawable) {
            ((KMutableProperty0) this.receiver).set(drawable);
        }

        public C61281(Object obj) {
            super(1, obj, KMutableProperty0.class, "set", "set(Ljava/lang/Object;)V", 0);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable$withNewInnerShadow$1 */
    /* JADX INFO: compiled from: CompositeBackgroundDrawable.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class C61301 extends FunctionReferenceImpl implements Function1<LayerDrawable, Unit> {
        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayerDrawable layerDrawable) {
            invoke2(layerDrawable);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LayerDrawable layerDrawable) {
            ((KMutableProperty0) this.receiver).set(layerDrawable);
        }

        public C61301(Object obj) {
            super(1, obj, KMutableProperty0.class, "set", "set(Ljava/lang/Object;)V", 0);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable$withNewOuterShadow$1 */
    /* JADX INFO: compiled from: CompositeBackgroundDrawable.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class C61321 extends FunctionReferenceImpl implements Function1<LayerDrawable, Unit> {
        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayerDrawable layerDrawable) {
            invoke2(layerDrawable);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LayerDrawable layerDrawable) {
            ((KMutableProperty0) this.receiver).set(layerDrawable);
        }

        public C61321(Object obj) {
            super(1, obj, KMutableProperty0.class, "set", "set(Ljava/lang/Object;)V", 0);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable$withNewOutline$1 */
    /* JADX INFO: compiled from: CompositeBackgroundDrawable.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class C61341 extends FunctionReferenceImpl implements Function1<OutlineDrawable, Unit> {
        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OutlineDrawable outlineDrawable) {
            invoke2(outlineDrawable);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OutlineDrawable outlineDrawable) {
            ((KMutableProperty0) this.receiver).set(outlineDrawable);
        }

        public C61341(Object obj) {
            super(1, obj, KMutableProperty0.class, "set", "set(Ljava/lang/Object;)V", 0);
        }
    }

    public /* synthetic */ CompositeBackgroundDrawable(Context context, Drawable drawable, LayerDrawable layerDrawable, CSSBackgroundDrawable cSSBackgroundDrawable, BackgroundDrawable backgroundDrawable, BorderDrawable borderDrawable, Drawable drawable2, LayerDrawable layerDrawable2, OutlineDrawable outlineDrawable, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : drawable, (i11 & 4) != 0 ? null : layerDrawable, (i11 & 8) != 0 ? null : cSSBackgroundDrawable, (i11 & 16) != 0 ? null : backgroundDrawable, (i11 & 32) != 0 ? null : borderDrawable, (i11 & 64) != 0 ? null : drawable2, (i11 & 128) != 0 ? null : layerDrawable2, (i11 & 256) != 0 ? null : outlineDrawable);
    }

    private final boolean updateLayer(Drawable layer, int id2) {
        if (layer == null) {
            return findDrawableByLayerId(id2) == null;
        }
        if (findDrawableByLayerId(id2) == null) {
            insertNewLayer(layer, id2);
        } else {
            setDrawableByLayerId(id2, layer);
        }
        invalidateSelf();
        return true;
    }

    @Nullable
    public final OutlineDrawable getOutline() {
        return this.outline;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositeBackgroundDrawable(@NotNull Context context, @Nullable Drawable drawable, @Nullable LayerDrawable layerDrawable, @Nullable CSSBackgroundDrawable cSSBackgroundDrawable, @Nullable BackgroundDrawable backgroundDrawable, @Nullable BorderDrawable borderDrawable, @Nullable Drawable drawable2, @Nullable LayerDrawable layerDrawable2, @Nullable OutlineDrawable outlineDrawable) {
        super(new Drawable[0]);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.originalBackground = drawable;
        this.cssBackground = cSSBackgroundDrawable;
        this.outerShadows = layerDrawable;
        this.background = backgroundDrawable;
        this.border = borderDrawable;
        this.feedbackUnderlay = drawable2;
        this.innerShadows = layerDrawable2;
        this.outline = outlineDrawable;
        setPaddingMode(1);
        addLayer(drawable, 0);
        addLayer(layerDrawable, 1);
        addLayer(cSSBackgroundDrawable, 2);
        addLayer(backgroundDrawable, 3);
        addLayer(borderDrawable, 4);
        addLayer(drawable2, 5);
        addLayer(layerDrawable2, 6);
        addLayer(outlineDrawable, 7);
    }

    private final void addLayer(Drawable layer, int id2) {
        if (layer == null) {
            return;
        }
        addLayer(layer);
        layer.setCallback(this);
        setId(getNumberOfLayers() - 1, id2);
        invalidateSelf();
    }

    private final void insertNewLayer(Drawable layer, int id2) {
        if (layer == null) {
            return;
        }
        if (getNumberOfLayers() == 0) {
            addLayer(layer, id2);
            return;
        }
        int numberOfLayers = getNumberOfLayers();
        for (int i11 = 0; i11 < numberOfLayers; i11++) {
            if (id2 < getId(i11)) {
                Drawable drawable = getDrawable(i11);
                Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
                int id3 = getId(i11);
                setDrawable(i11, layer);
                setId(i11, id2);
                insertNewLayer(drawable, id3);
                return;
            }
            if (i11 == getNumberOfLayers() - 1) {
                addLayer(layer, id2);
                return;
            }
        }
    }

    @Nullable
    public final BackgroundDrawable getBackground() {
        return this.background;
    }

    @Nullable
    public final BorderDrawable getBorder() {
        return this.border;
    }

    @Nullable
    public final BorderInsets getBorderInsets() {
        return this.borderInsets;
    }

    @Nullable
    public final BorderRadiusStyle getBorderRadius() {
        return this.borderRadius;
    }

    @Nullable
    public final CSSBackgroundDrawable getCssBackground() {
        return this.cssBackground;
    }

    @Nullable
    public final Drawable getFeedbackUnderlay() {
        return this.feedbackUnderlay;
    }

    @Nullable
    public final LayerDrawable getInnerShadows() {
        return this.innerShadows;
    }

    @Nullable
    public final Drawable getOriginalBackground() {
        return this.originalBackground;
    }

    @Nullable
    public final LayerDrawable getOuterShadows() {
        return this.outerShadows;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public void getOutline(@NotNull Outline outline) {
        Intrinsics.checkNotNullParameter(outline, "outline");
        BorderRadiusStyle borderRadiusStyle = this.borderRadius;
        if (borderRadiusStyle == null || !borderRadiusStyle.hasRoundedBorders()) {
            outline.setRect(getBounds());
            return;
        }
        Path path = new Path();
        BorderRadiusStyle borderRadiusStyle2 = this.borderRadius;
        ComputedBorderRadius computedBorderRadiusResolve = borderRadiusStyle2 != null ? borderRadiusStyle2.resolve(getLayoutDirection(), this.context, getBounds().width(), getBounds().height()) : null;
        BorderInsets borderInsets = this.borderInsets;
        RectF rectFResolve = borderInsets != null ? borderInsets.resolve(getLayoutDirection(), this.context) : null;
        if (computedBorderRadiusResolve != null) {
            RectF rectF = new RectF(getBounds());
            PixelUtil pixelUtil = PixelUtil.INSTANCE;
            path.addRoundRect(rectF, new float[]{pixelUtil.dpToPx(computedBorderRadiusResolve.getTopLeft().getHorizontal() + (rectFResolve != null ? rectFResolve.left : 0.0f)), pixelUtil.dpToPx(computedBorderRadiusResolve.getTopLeft().getVertical() + (rectFResolve != null ? rectFResolve.top : 0.0f)), pixelUtil.dpToPx(computedBorderRadiusResolve.getTopRight().getHorizontal() + (rectFResolve != null ? rectFResolve.right : 0.0f)), pixelUtil.dpToPx(computedBorderRadiusResolve.getTopRight().getVertical() + (rectFResolve != null ? rectFResolve.top : 0.0f)), pixelUtil.dpToPx(computedBorderRadiusResolve.getBottomRight().getHorizontal() + (rectFResolve != null ? rectFResolve.right : 0.0f)), pixelUtil.dpToPx(computedBorderRadiusResolve.getBottomRight().getVertical() + (rectFResolve != null ? rectFResolve.bottom : 0.0f)), pixelUtil.dpToPx(computedBorderRadiusResolve.getBottomLeft().getHorizontal() + (rectFResolve != null ? rectFResolve.left : 0.0f)), pixelUtil.dpToPx(computedBorderRadiusResolve.getBottomLeft().getVertical() + (rectFResolve != null ? rectFResolve.bottom : 0.0f))}, Path.Direction.CW);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(path);
        } else {
            outline.setConvexPath(path);
        }
    }

    public final void setBorderInsets(@Nullable BorderInsets borderInsets) {
        this.borderInsets = borderInsets;
    }

    public final void setBorderRadius(@Nullable BorderRadiusStyle borderRadiusStyle) {
        this.borderRadius = borderRadiusStyle;
    }

    @NotNull
    public final CompositeBackgroundDrawable withNewBackground(@Nullable BackgroundDrawable background) {
        return withNewLayer(background, 3, new C61241(new MutablePropertyReference0Impl(this) { // from class: com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable.withNewBackground.2
            @Override // p852kotlin.jvm.internal.MutablePropertyReference0Impl, p852kotlin.reflect.KProperty0
            public Object get() {
                return ((CompositeBackgroundDrawable) this.receiver).getBackground();
            }

            @Override // p852kotlin.jvm.internal.MutablePropertyReference0Impl, p852kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((CompositeBackgroundDrawable) this.receiver).background = (BackgroundDrawable) obj;
            }
        }));
    }

    @NotNull
    public final CompositeBackgroundDrawable withNewBorder(@Nullable BorderDrawable border) {
        return withNewLayer(border, 4, new C61261(new MutablePropertyReference0Impl(this) { // from class: com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable.withNewBorder.2
            @Override // p852kotlin.jvm.internal.MutablePropertyReference0Impl, p852kotlin.reflect.KProperty0
            public Object get() {
                return ((CompositeBackgroundDrawable) this.receiver).getBorder();
            }

            @Override // p852kotlin.jvm.internal.MutablePropertyReference0Impl, p852kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((CompositeBackgroundDrawable) this.receiver).border = (BorderDrawable) obj;
            }
        }));
    }

    @NotNull
    public final CompositeBackgroundDrawable withNewCssBackground(@Nullable CSSBackgroundDrawable cssBackground) {
        CompositeBackgroundDrawable compositeBackgroundDrawable = new CompositeBackgroundDrawable(this.context, this.originalBackground, this.outerShadows, cssBackground, this.background, this.border, this.feedbackUnderlay, this.innerShadows, this.outline);
        compositeBackgroundDrawable.borderInsets = this.borderInsets;
        compositeBackgroundDrawable.borderRadius = this.borderRadius;
        return compositeBackgroundDrawable;
    }

    @NotNull
    public final CompositeBackgroundDrawable withNewFeedbackUnderlay(@Nullable Drawable newUnderlay) {
        return withNewLayer(newUnderlay, 5, new C61281(new MutablePropertyReference0Impl(this) { // from class: com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable.withNewFeedbackUnderlay.2
            @Override // p852kotlin.jvm.internal.MutablePropertyReference0Impl, p852kotlin.reflect.KProperty0
            public Object get() {
                return ((CompositeBackgroundDrawable) this.receiver).getFeedbackUnderlay();
            }

            @Override // p852kotlin.jvm.internal.MutablePropertyReference0Impl, p852kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((CompositeBackgroundDrawable) this.receiver).feedbackUnderlay = (Drawable) obj;
            }
        }));
    }

    @NotNull
    public final CompositeBackgroundDrawable withNewInnerShadow(@Nullable LayerDrawable innerShadows) {
        return withNewLayer(innerShadows, 6, new C61301(new MutablePropertyReference0Impl(this) { // from class: com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable.withNewInnerShadow.2
            @Override // p852kotlin.jvm.internal.MutablePropertyReference0Impl, p852kotlin.reflect.KProperty0
            public Object get() {
                return ((CompositeBackgroundDrawable) this.receiver).getInnerShadows();
            }

            @Override // p852kotlin.jvm.internal.MutablePropertyReference0Impl, p852kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((CompositeBackgroundDrawable) this.receiver).innerShadows = (LayerDrawable) obj;
            }
        }));
    }

    @NotNull
    public final CompositeBackgroundDrawable withNewOuterShadow(@Nullable LayerDrawable outerShadows) {
        return withNewLayer(outerShadows, 1, new C61321(new MutablePropertyReference0Impl(this) { // from class: com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable.withNewOuterShadow.2
            @Override // p852kotlin.jvm.internal.MutablePropertyReference0Impl, p852kotlin.reflect.KProperty0
            public Object get() {
                return ((CompositeBackgroundDrawable) this.receiver).getOuterShadows();
            }

            @Override // p852kotlin.jvm.internal.MutablePropertyReference0Impl, p852kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((CompositeBackgroundDrawable) this.receiver).outerShadows = (LayerDrawable) obj;
            }
        }));
    }

    @NotNull
    public final CompositeBackgroundDrawable withNewOutline(@Nullable OutlineDrawable outline) {
        return withNewLayer(outline, 7, new C61341(new MutablePropertyReference0Impl(this) { // from class: com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable.withNewOutline.2
            @Override // p852kotlin.jvm.internal.MutablePropertyReference0Impl, p852kotlin.reflect.KProperty0
            public Object get() {
                return ((CompositeBackgroundDrawable) this.receiver).getOutline();
            }

            @Override // p852kotlin.jvm.internal.MutablePropertyReference0Impl, p852kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((CompositeBackgroundDrawable) this.receiver).outline = (OutlineDrawable) obj;
            }
        }));
    }

    private final <T extends Drawable> CompositeBackgroundDrawable withNewLayer(T newLayer, int id2, Function1<? super T, Unit> setNewLayer) {
        setNewLayer.invoke(newLayer);
        if (ReactNativeFeatureFlags.enableNewBackgroundAndBorderDrawables() && updateLayer(newLayer, id2)) {
            return this;
        }
        CompositeBackgroundDrawable compositeBackgroundDrawable = new CompositeBackgroundDrawable(this.context, this.originalBackground, this.outerShadows, this.cssBackground, this.background, this.border, this.feedbackUnderlay, this.innerShadows, this.outline);
        compositeBackgroundDrawable.borderInsets = this.borderInsets;
        compositeBackgroundDrawable.borderRadius = this.borderRadius;
        return compositeBackgroundDrawable;
    }
}
