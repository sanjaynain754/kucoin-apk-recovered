package com.horcrux.svg;

import android.graphics.Matrix;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.MatrixMathHelper;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.TransformHelper;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.horcrux.svg.VirtualView;
import com.tencent.bugly.proguard.C33820nf;
import java.util.Locale;

/* JADX INFO: compiled from: RenderableViewManager.java */
/* JADX INFO: loaded from: classes56.dex */
class VirtualViewManager<V extends VirtualView> extends ViewGroupManager<VirtualView> {
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = 5.0f;
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    protected final String mClassName;
    protected ViewManagerDelegate<V> mDelegate;
    protected final SVGClass svgClass;
    private static final MatrixMathHelper.MatrixDecompositionContext sMatrixDecompositionContext = new MatrixMathHelper.MatrixDecompositionContext();
    private static final double[] sTransformDecompositionArray = new double[16];
    private static final SparseArray<RenderableView> mTagToRenderableView = new SparseArray<>();
    private static final SparseArray<Runnable> mTagToRunnable = new SparseArray<>();

    /* JADX INFO: compiled from: RenderableViewManager.java */
    public enum SVGClass {
        RNSVGGroup,
        RNSVGPath,
        RNSVGText,
        RNSVGTSpan,
        RNSVGTextPath,
        RNSVGImage,
        RNSVGCircle,
        RNSVGEllipse,
        RNSVGLine,
        RNSVGRect,
        RNSVGClipPath,
        RNSVGDefs,
        RNSVGUse,
        RNSVGSymbol,
        RNSVGLinearGradient,
        RNSVGRadialGradient,
        RNSVGPattern,
        RNSVGMask,
        RNSVGFilter,
        RNSVGFeBlend,
        RNSVGFeColorMatrix,
        RNSVGFeComposite,
        RNSVGFeFlood,
        RNSVGFeGaussianBlur,
        RNSVGFeMerge,
        RNSVGFeOffset,
        RNSVGMarker,
        RNSVGForeignObject
    }

    /* JADX INFO: renamed from: com.horcrux.svg.VirtualViewManager$a */
    /* JADX INFO: compiled from: RenderableViewManager.java */
    public class ViewGroupOnHierarchyChangeListenerC9230a implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroupOnHierarchyChangeListenerC9230a() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view instanceof VirtualView) {
                VirtualViewManager.this.invalidateSvgView((VirtualView) view);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view instanceof VirtualView) {
                VirtualViewManager.this.invalidateSvgView((VirtualView) view);
            }
        }
    }

    @ReactProp(name = "matrix")
    public void setMatrix(V v11, Dynamic dynamic) {
        v11.setMatrix(dynamic);
    }

    public void setTransformProperty(VirtualView virtualView, ReadableArray readableArray) {
        if (readableArray == null) {
            virtualView.setTranslationX(PixelUtil.toPixelFromDIP(0.0f));
            virtualView.setTranslationY(PixelUtil.toPixelFromDIP(0.0f));
            virtualView.setRotation(0.0f);
            virtualView.setRotationX(0.0f);
            virtualView.setRotationY(0.0f);
            virtualView.setScaleX(1.0f);
            virtualView.setScaleY(1.0f);
            virtualView.setCameraDistance(0.0f);
            return;
        }
        MatrixMathHelper.MatrixDecompositionContext matrixDecompositionContext = sMatrixDecompositionContext;
        matrixDecompositionContext.reset();
        double[] dArr = sTransformDecompositionArray;
        TransformHelper.processTransform(readableArray, dArr, virtualView.getWidth(), virtualView.getHeight(), null, false);
        MatrixMathHelper.decomposeMatrix(dArr, matrixDecompositionContext);
        virtualView.setTranslationX(PixelUtil.toPixelFromDIP(sanitizeFloatPropertyValue((float) matrixDecompositionContext.translation[0])));
        virtualView.setTranslationY(PixelUtil.toPixelFromDIP(sanitizeFloatPropertyValue((float) matrixDecompositionContext.translation[1])));
        virtualView.setRotation(sanitizeFloatPropertyValue((float) matrixDecompositionContext.rotationDegrees[2]));
        virtualView.setRotationX(sanitizeFloatPropertyValue((float) matrixDecompositionContext.rotationDegrees[0]));
        virtualView.setRotationY(sanitizeFloatPropertyValue((float) matrixDecompositionContext.rotationDegrees[1]));
        virtualView.setScaleX(sanitizeFloatPropertyValue((float) matrixDecompositionContext.scale[0]));
        virtualView.setScaleY(sanitizeFloatPropertyValue((float) matrixDecompositionContext.scale[1]));
        double[] dArr2 = matrixDecompositionContext.perspective;
        if (dArr2.length > 2) {
            float f11 = (float) dArr2[2];
            if (f11 == 0.0f) {
                f11 = 7.8125E-4f;
            }
            float f12 = (-1.0f) / f11;
            float f13 = DisplayMetricsHolder.getScreenDisplayMetrics().density;
            virtualView.setCameraDistance(f13 * f13 * f12 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.VirtualViewManager$b */
    /* JADX INFO: compiled from: RenderableViewManager.java */
    public static /* synthetic */ class C9231b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13163a;

        static {
            int[] iArr = new int[SVGClass.values().length];
            f13163a = iArr;
            try {
                iArr[SVGClass.RNSVGGroup.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13163a[SVGClass.RNSVGPath.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13163a[SVGClass.RNSVGCircle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13163a[SVGClass.RNSVGEllipse.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13163a[SVGClass.RNSVGLine.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13163a[SVGClass.RNSVGRect.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13163a[SVGClass.RNSVGText.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13163a[SVGClass.RNSVGTSpan.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13163a[SVGClass.RNSVGTextPath.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13163a[SVGClass.RNSVGImage.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13163a[SVGClass.RNSVGClipPath.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13163a[SVGClass.RNSVGDefs.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f13163a[SVGClass.RNSVGUse.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f13163a[SVGClass.RNSVGSymbol.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f13163a[SVGClass.RNSVGLinearGradient.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f13163a[SVGClass.RNSVGRadialGradient.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f13163a[SVGClass.RNSVGPattern.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f13163a[SVGClass.RNSVGMask.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f13163a[SVGClass.RNSVGFilter.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f13163a[SVGClass.RNSVGFeBlend.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f13163a[SVGClass.RNSVGFeColorMatrix.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f13163a[SVGClass.RNSVGFeComposite.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f13163a[SVGClass.RNSVGFeFlood.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f13163a[SVGClass.RNSVGFeGaussianBlur.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f13163a[SVGClass.RNSVGFeMerge.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f13163a[SVGClass.RNSVGFeOffset.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f13163a[SVGClass.RNSVGMarker.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f13163a[SVGClass.RNSVGForeignObject.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
        }
    }

    public static RenderableView getRenderableViewByTag(int i11) {
        return mTagToRenderableView.get(i11);
    }

    public static void runWhenViewIsAvailable(int i11, Runnable runnable) {
        mTagToRunnable.put(i11, runnable);
    }

    public static void setRenderableView(int i11, RenderableView renderableView) {
        mTagToRenderableView.put(i11, renderableView);
        SparseArray<Runnable> sparseArray = mTagToRunnable;
        Runnable runnable = sparseArray.get(i11);
        if (runnable != null) {
            runnable.run();
            sparseArray.delete(i11);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(ThemedReactContext themedReactContext, VirtualView virtualView) {
        super.addEventEmitters(themedReactContext, virtualView);
        virtualView.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC9230a());
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        return new C9232c();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public VirtualView createViewInstance(ThemedReactContext themedReactContext) {
        switch (C9231b.f13163a[this.svgClass.ordinal()]) {
            case 1:
                return new GroupView(themedReactContext);
            case 2:
                return new PathView(themedReactContext);
            case 3:
                return new CircleView(themedReactContext);
            case 4:
                return new EllipseView(themedReactContext);
            case 5:
                return new LineView(themedReactContext);
            case 6:
                return new RectView(themedReactContext);
            case 7:
                return new TextView(themedReactContext);
            case 8:
                return new TSpanView(themedReactContext);
            case 9:
                return new TextPathView(themedReactContext);
            case 10:
                return new ImageView(themedReactContext);
            case 11:
                return new ClipPathView(themedReactContext);
            case 12:
                return new DefsView(themedReactContext);
            case 13:
                return new UseView(themedReactContext);
            case 14:
                return new SymbolView(themedReactContext);
            case 15:
                return new LinearGradientView(themedReactContext);
            case 16:
                return new RadialGradientView(themedReactContext);
            case 17:
                return new PatternView(themedReactContext);
            case 18:
                return new MaskView(themedReactContext);
            case 19:
                return new FilterView(themedReactContext);
            case 20:
                return new FeBlendView(themedReactContext);
            case 21:
                return new FeColorMatrixView(themedReactContext);
            case 22:
                return new FeCompositeView(themedReactContext);
            case 23:
                return new FeFloodView(themedReactContext);
            case 24:
                return new FeGaussianBlurView(themedReactContext);
            case 25:
                return new FeMergeView(themedReactContext);
            case 26:
                return new FeOffsetView(themedReactContext);
            case 27:
                return new MarkerView(themedReactContext);
            case 28:
                return new ForeignObjectView(themedReactContext);
            default:
                throw new IllegalStateException("Unexpected type " + this.svgClass.toString());
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return this.mClassName;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return C9232c.class;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(VirtualView virtualView) {
        super.onAfterUpdateTransaction(virtualView);
        invalidateSvgView(virtualView);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(VirtualView virtualView) {
        super.onDropViewInstance(virtualView);
        mTagToRenderableView.remove(virtualView.getId());
    }

    public void setMatrix(V v11, ReadableArray readableArray) {
        v11.setMatrix(readableArray);
    }

    @ReactProp(name = ViewProps.POINTER_EVENTS)
    public void setPointerEvents(V v11, String str) {
        if (str == null) {
            v11.setPointerEvents(PointerEvents.AUTO);
        } else {
            v11.setPointerEvents(PointerEvents.valueOf(str.toUpperCase(Locale.US).replace(C33820nf.f71144W, "_")));
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setTransform(VirtualView virtualView, ReadableArray readableArray) {
        setTransformProperty(virtualView, readableArray);
        Matrix matrix = virtualView.getMatrix();
        virtualView.mMatrix = matrix;
        virtualView.mInvertible = matrix.invert(virtualView.mInvMatrix);
    }

    public VirtualViewManager(SVGClass sVGClass) {
        this.svgClass = sVGClass;
        this.mClassName = sVGClass.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invalidateSvgView(V v11) {
        SvgView svgView = v11.getSvgView();
        if (svgView != null) {
            svgView.invalidate();
        }
        if (v11 instanceof TextView) {
            ((TextView) v11).m14197v().clearChildCache();
        }
    }

    private static float sanitizeFloatPropertyValue(float f11) {
        if (f11 >= -3.4028235E38f && f11 <= Float.MAX_VALUE) {
            return f11;
        }
        if (f11 < -3.4028235E38f || f11 == Float.NEGATIVE_INFINITY) {
            return -3.4028235E38f;
        }
        if (f11 > Float.MAX_VALUE || f11 == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (Float.isNaN(f11)) {
            return 0.0f;
        }
        throw new IllegalStateException("Invalid float property value: " + f11);
    }

    @ReactProp(name = "clipPath")
    public void setClipPath(V v11, String str) {
        v11.setClipPath(str);
    }

    @ReactProp(name = "clipRule")
    public void setClipRule(V v11, int i11) {
        v11.setClipRule(i11);
    }

    @ReactProp(name = "display")
    public void setDisplay(V v11, String str) {
        v11.setDisplay(str);
    }

    @ReactProp(name = "markerEnd")
    public void setMarkerEnd(V v11, String str) {
        v11.setMarkerEnd(str);
    }

    @ReactProp(name = "markerMid")
    public void setMarkerMid(V v11, String str) {
        v11.setMarkerMid(str);
    }

    @ReactProp(name = "markerStart")
    public void setMarkerStart(V v11, String str) {
        v11.setMarkerStart(str);
    }

    @ReactProp(name = "mask")
    public void setMask(V v11, String str) {
        v11.setMask(str);
    }

    @ReactProp(name = "name")
    public void setName(V v11, String str) {
        v11.setName(str);
    }

    @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
    public void setOpacity(V v11, float f11) {
        v11.setOpacity(f11);
    }

    @ReactProp(name = "responsible")
    public void setResponsible(V v11, boolean z11) {
        v11.setResponsible(z11);
    }

    @ReactProp(name = ViewProps.TRANSFORM)
    public void setTransform(V v11, Dynamic dynamic) {
        if (dynamic.getType() != ReadableType.Array) {
            return;
        }
        setTransform((VirtualView) v11, dynamic.asArray());
    }

    /* JADX INFO: renamed from: com.horcrux.svg.VirtualViewManager$c */
    /* JADX INFO: compiled from: RenderableViewManager.java */
    public static class C9232c extends LayoutShadowNode {
        @ReactPropGroup(names = {ViewProps.ALIGN_SELF, ViewProps.ALIGN_ITEMS, ViewProps.COLLAPSABLE, ViewProps.FLEX, ViewProps.FLEX_BASIS, ViewProps.FLEX_DIRECTION, ViewProps.FLEX_GROW, ViewProps.FLEX_SHRINK, ViewProps.FLEX_WRAP, ViewProps.JUSTIFY_CONTENT, ViewProps.OVERFLOW, ViewProps.ALIGN_CONTENT, "display", ViewProps.POSITION, "right", ViewProps.TOP, ViewProps.BOTTOM, "left", "start", "end", "width", "height", ViewProps.MIN_WIDTH, ViewProps.MAX_WIDTH, ViewProps.MIN_HEIGHT, ViewProps.MAX_HEIGHT, ViewProps.MARGIN, ViewProps.MARGIN_VERTICAL, ViewProps.MARGIN_HORIZONTAL, ViewProps.MARGIN_LEFT, ViewProps.MARGIN_RIGHT, ViewProps.MARGIN_TOP, ViewProps.MARGIN_BOTTOM, ViewProps.MARGIN_START, ViewProps.MARGIN_END, ViewProps.PADDING, ViewProps.PADDING_VERTICAL, ViewProps.PADDING_HORIZONTAL, ViewProps.PADDING_LEFT, ViewProps.PADDING_RIGHT, ViewProps.PADDING_TOP, ViewProps.PADDING_BOTTOM, ViewProps.PADDING_START, ViewProps.PADDING_END, ViewProps.BORDER_WIDTH, ViewProps.BORDER_START_WIDTH, ViewProps.BORDER_END_WIDTH, ViewProps.BORDER_TOP_WIDTH, ViewProps.BORDER_BOTTOM_WIDTH, ViewProps.BORDER_LEFT_WIDTH, ViewProps.BORDER_RIGHT_WIDTH})
        public void ignoreLayoutProps(int i11, Dynamic dynamic) {
        }
    }
}
