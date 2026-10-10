package com.swmansion.gesturehandler.react;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.C5771R;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerDelegate;
import com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface;
import com.swmansion.gesturehandler.core.GestureHandler;
import com.swmansion.gesturehandler.core.NativeViewGestureHandler;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.sequences.Sequence;
import sb0.C44375a;

/* JADX INFO: compiled from: RNGestureHandlerButtonViewManager.kt */
/* JADX INFO: loaded from: classes59.dex */
@ReactModule(name = RNGestureHandlerButtonViewManager.REACT_CLASS)
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u001c\b\u0007\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u000256B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0017J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0017J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0011H\u0017J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0011H\u0017J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001bH\u0017J\u0018\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001bH\u0017J\u0018\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001bH\u0017J\u0018\u0010 \u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001bH\u0017J\u0018\u0010\"\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001bH\u0017J\u0018\u0010$\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u001bH\u0017J\u001f\u0010&\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0002\u0010(J\u001a\u0010)\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\tH\u0017J\u001f\u0010+\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0002\u0010(J\u0018\u0010-\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0014H\u0017J\u0018\u0010/\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0011H\u0017J\u0018\u00101\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u0011H\u0017J\u0010\u00103\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014J\u0010\u00104\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007H\u0014R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, m90084d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$ButtonViewGroup;", "Lcom/facebook/react/viewmanagers/RNGestureHandlerButtonManagerInterface;", "<init>", "()V", "mDelegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getName", "", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "setForeground", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "useDrawableOnForeground", "", "setBackgroundColor", "backgroundColor", "", "setBorderless", "useBorderlessDrawable", "setEnabled", "enabled", "setBorderRadius", "borderRadius", "", "setBorderTopLeftRadius", "borderTopLeftRadius", "setBorderTopRightRadius", "borderTopRightRadius", "setBorderBottomLeftRadius", "borderBottomLeftRadius", "setBorderBottomRightRadius", "borderBottomRightRadius", "setBorderWidth", ViewProps.BORDER_WIDTH, "setBorderColor", ViewProps.BORDER_COLOR, "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$ButtonViewGroup;Ljava/lang/Integer;)V", "setBorderStyle", "borderStyle", "setRippleColor", "rippleColor", "setRippleRadius", "rippleRadius", "setExclusive", "exclusive", "setTouchSoundDisabled", "touchSoundDisabled", "onAfterUpdateTransaction", "getDelegate", "ButtonViewGroup", "Companion", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class RNGestureHandlerButtonViewManager extends ViewGroupManager<ButtonViewGroup> implements RNGestureHandlerButtonManagerInterface<ButtonViewGroup> {

    @NotNull
    public static final String REACT_CLASS = "RNGestureHandlerButton";

    @NotNull
    private final ViewManagerDelegate<ButtonViewGroup> mDelegate = new RNGestureHandlerButtonManagerDelegate(this);

    /* JADX INFO: compiled from: RNGestureHandlerButtonViewManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u0000 \u0095\u00012\u00020\u00012\u00020\u0002:\u0002\u0096\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u001a2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0011\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u001a2\u0006\u00100\u001a\u00020,H\u0017¢\u0006\u0004\b1\u0010/J\r\u00102\u001a\u00020\u0012¢\u0006\u0004\b2\u0010\u0019J7\u00106\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\r2\u0006\u00105\u001a\u00020\rH\u0014¢\u0006\u0004\b6\u00107J\u001f\u0010:\u001a\u00020\u00122\u0006\u00109\u001a\u0002082\u0006\u0010\u0018\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u001a2\u0006\u00100\u001a\u00020,H\u0016¢\u0006\u0004\b<\u0010/J\u0017\u00105\u001a\u00020\u00122\u0006\u00100\u001a\u00020,H\u0016¢\u0006\u0004\b5\u0010=J!\u0010@\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020\r2\b\u00100\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u001aH\u0016¢\u0006\u0004\bB\u0010\u001cJ\u0017\u0010D\u001a\u00020\u00122\u0006\u0010C\u001a\u00020\u001aH\u0016¢\u0006\u0004\bD\u0010EJ\u001f\u0010F\u001a\u00020\u00122\u0006\u00109\u001a\u0002082\u0006\u0010\u0018\u001a\u000208H\u0016¢\u0006\u0004\bF\u0010;R.\u0010L\u001a\u0004\u0018\u00010\r2\b\u0010%\u001a\u0004\u0018\u00010\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR.\u0010P\u001a\u0004\u0018\u00010\r2\b\u0010M\u001a\u0004\u0018\u00010\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010G\u001a\u0004\bN\u0010I\"\u0004\bO\u0010KR*\u0010V\u001a\u00020\u001a2\u0006\u0010Q\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010\u001c\"\u0004\bU\u0010ER\"\u0010Z\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010S\u001a\u0004\bX\u0010\u001c\"\u0004\bY\u0010ER*\u0010a\u001a\u0002082\u0006\u0010M\u001a\u0002088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R*\u0010e\u001a\u0002082\u0006\u0010M\u001a\u0002088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010\\\u001a\u0004\bc\u0010^\"\u0004\bd\u0010`R*\u0010i\u001a\u0002082\u0006\u0010M\u001a\u0002088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010\\\u001a\u0004\bg\u0010^\"\u0004\bh\u0010`R*\u0010m\u001a\u0002082\u0006\u0010M\u001a\u0002088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010\\\u001a\u0004\bk\u0010^\"\u0004\bl\u0010`R*\u0010q\u001a\u0002082\u0006\u0010M\u001a\u0002088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010\\\u001a\u0004\bo\u0010^\"\u0004\bp\u0010`R*\u0010v\u001a\u0002082\u0006\u0010r\u001a\u0002088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010\\\u001a\u0004\bt\u0010^\"\u0004\bu\u0010`R.\u0010y\u001a\u0004\u0018\u00010\r2\b\u0010%\u001a\u0004\u0018\u00010\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010G\u001a\u0004\bw\u0010I\"\u0004\bx\u0010KR1\u0010\u0082\u0001\u001a\u0004\u0018\u00010z2\b\u0010{\u001a\u0004\u0018\u00010z8\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R&\u0010\u0086\u0001\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010S\u001a\u0005\b\u0084\u0001\u0010\u001c\"\u0005\b\u0085\u0001\u0010ER\u0019\u0010\u0089\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008b\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010SR\u0019\u0010\u008e\u0001\u001a\u00030\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\b\u0010\u008d\u0001R\u0018\u0010\u008f\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000b\u0010\u0088\u0001R\u0017\u0010\u0090\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010SR%\u0010\u0091\u0001\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u0017\u0010S\u001a\u0005\b\u0091\u0001\u0010\u001c\"\u0005\b\u0092\u0001\u0010ER\u0016\u0010\u0094\u0001\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010\u001c¨\u0006\u0097\u0001"}, m90084d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$ButtonViewGroup;", "Landroid/view/ViewGroup;", "Lcom/swmansion/gesturehandler/core/NativeViewGestureHandler$c;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "q", "()[F", "Landroid/graphics/PathEffect;", "r", "()Landroid/graphics/PathEffect;", "", "backgroundColor", "Landroid/graphics/drawable/Drawable;", "borderDrawable", "selectable", "", "B", "(ILandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V", CmcdData.Factory.STREAMING_FORMAT_SS, "()Landroid/graphics/drawable/Drawable;", "t", "y", "()V", "", "z", "()Z", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "children", "w", "(Lkotlin/sequences/Sequence;)Z", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootView;", "v", "()Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootView;", "color", "setBackgroundColor", "(I)V", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "onInitializeAccessibilityNodeInfo", "(Landroid/view/accessibility/AccessibilityNodeInfo;)V", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "event", "onTouchEvent", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "changed", CmcdData.Factory.STREAM_TYPE_LIVE, "b", ViewProps.ON_LAYOUT, "(ZIIII)V", "", "x", "drawableHotspotChanged", "(FF)V", "c", "(Landroid/view/MotionEvent;)V", "keyCode", "Landroid/view/KeyEvent;", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "performClick", "pressed", "setPressed", "(Z)V", "dispatchDrawableHotspotChanged", "Ljava/lang/Integer;", "getRippleColor", "()Ljava/lang/Integer;", "setRippleColor", "(Ljava/lang/Integer;)V", "rippleColor", "radius", "getRippleRadius", "setRippleRadius", "rippleRadius", "useForeground", "d", "Z", "getUseDrawableOnForeground", "setUseDrawableOnForeground", "useDrawableOnForeground", "e", "getUseBorderlessDrawable", "setUseBorderlessDrawable", "useBorderlessDrawable", "f", "F", "getBorderRadius", "()F", "setBorderRadius", "(F)V", "borderRadius", "g", "getBorderTopLeftRadius", "setBorderTopLeftRadius", "borderTopLeftRadius", CmcdData.Factory.STREAMING_FORMAT_HLS, "getBorderTopRightRadius", "setBorderTopRightRadius", "borderTopRightRadius", "i", "getBorderBottomLeftRadius", "setBorderBottomLeftRadius", "borderBottomLeftRadius", "j", "getBorderBottomRightRadius", "setBorderBottomRightRadius", "borderBottomRightRadius", "width", "k", "getBorderWidth", "setBorderWidth", ViewProps.BORDER_WIDTH, "getBorderColor", "setBorderColor", ViewProps.BORDER_COLOR, "", TtmlNode.TAG_STYLE, "m", "Ljava/lang/String;", "getBorderStyle", "()Ljava/lang/String;", "setBorderStyle", "(Ljava/lang/String;)V", "borderStyle", "n", "getExclusive", "setExclusive", "exclusive", "o", "I", "_backgroundColor", "p", "needBackgroundUpdate", "", "J", "lastEventTime", "lastAction", "receivedKeyEvent", "isTouched", "setTouched", "getHasBorderRadii", "hasBorderRadii", "u", "Companion", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRNGestureHandlerButtonViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RNGestureHandlerButtonViewManager.kt\ncom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$ButtonViewGroup\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,569:1\n221#1,3:570\n221#1,3:573\n221#1,3:576\n221#1,3:579\n221#1,3:582\n221#1,3:585\n221#1,3:588\n221#1,3:591\n221#1,3:594\n221#1,3:597\n221#1,3:600\n221#1,3:607\n11215#2:603\n11550#2,3:604\n*S KotlinDebug\n*F\n+ 1 RNGestureHandlerButtonViewManager.kt\ncom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$ButtonViewGroup\n*L\n148#1:570,3\n153#1:573,3\n157#1:576,3\n162#1:579,3\n166#1:582,3\n170#1:585,3\n174#1:588,3\n178#1:591,3\n182#1:594,3\n186#1:597,3\n190#1:600,3\n249#1:607,3\n237#1:603\n237#1:604,3\n*E\n"})
    public static final class ButtonViewGroup extends ViewGroup implements NativeViewGestureHandler.InterfaceC33421c {

        /* JADX INFO: renamed from: w */
        @Nullable
        public static ButtonViewGroup f68324w;

        /* JADX INFO: renamed from: x */
        @Nullable
        public static ButtonViewGroup f68325x;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public Integer rippleColor;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public Integer rippleRadius;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public boolean useDrawableOnForeground;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public boolean useBorderlessDrawable;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public float borderRadius;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public float borderTopLeftRadius;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public float borderTopRightRadius;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public float borderBottomLeftRadius;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        public float borderBottomRightRadius;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        public float borderWidth;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @Nullable
        public Integer borderColor;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @Nullable
        public String borderStyle;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        public boolean exclusive;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        public int _backgroundColor;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        public boolean needBackgroundUpdate;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        public long lastEventTime;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        public int lastAction;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        public boolean receivedKeyEvent;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        public boolean isTouched;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: v */
        @NotNull
        public static TypedValue f68323v = new TypedValue();

        /* JADX INFO: renamed from: y */
        @NotNull
        public static View.OnClickListener f68326y = new View.OnClickListener() { // from class: sb0.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RNGestureHandlerButtonViewManager.ButtonViewGroup.m71982u(view);
            }
        };

        /* JADX INFO: compiled from: RNGestureHandlerButtonViewManager.kt */
        @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m90084d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$ButtonViewGroup$Companion;", "", "<init>", "()V", "resolveOutValue", "Landroid/util/TypedValue;", "getResolveOutValue", "()Landroid/util/TypedValue;", "setResolveOutValue", "(Landroid/util/TypedValue;)V", "touchResponder", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$ButtonViewGroup;", "getTouchResponder", "()Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$ButtonViewGroup;", "setTouchResponder", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$ButtonViewGroup;)V", "soundResponder", "getSoundResponder", "setSoundResponder", "dummyClickListener", "Landroid/view/View$OnClickListener;", "getDummyClickListener", "()Landroid/view/View$OnClickListener;", "setDummyClickListener", "(Landroid/view/View$OnClickListener;)V", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }

            public final void setDummyClickListener(@NotNull View.OnClickListener onClickListener) {
                Intrinsics.checkNotNullParameter(onClickListener, "<set-?>");
                ButtonViewGroup.f68326y = onClickListener;
            }

            public final void setResolveOutValue(@NotNull TypedValue typedValue) {
                Intrinsics.checkNotNullParameter(typedValue, "<set-?>");
                ButtonViewGroup.f68323v = typedValue;
            }

            @NotNull
            public final View.OnClickListener getDummyClickListener() {
                return ButtonViewGroup.f68326y;
            }

            @NotNull
            public final TypedValue getResolveOutValue() {
                return ButtonViewGroup.f68323v;
            }

            @Nullable
            public final ButtonViewGroup getSoundResponder() {
                return ButtonViewGroup.f68325x;
            }

            @Nullable
            public final ButtonViewGroup getTouchResponder() {
                return ButtonViewGroup.f68324w;
            }

            public final void setSoundResponder(@Nullable ButtonViewGroup buttonViewGroup) {
                ButtonViewGroup.f68325x = buttonViewGroup;
            }

            public final void setTouchResponder(@Nullable ButtonViewGroup buttonViewGroup) {
                ButtonViewGroup.f68324w = buttonViewGroup;
            }
        }

        @Override // android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyUp(int keyCode, @Nullable KeyEvent event) {
            this.receivedKeyEvent = true;
            return super.onKeyUp(keyCode, event);
        }

        @Override // android.view.View
        public boolean performClick() {
            if (!m71983x(this, null, 1, null)) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                if (C44375a.m97875c(context)) {
                    RNGestureHandlerRootView rNGestureHandlerRootViewM71990v = m71990v();
                    if (rNGestureHandlerRootViewM71990v != null) {
                        rNGestureHandlerRootViewM71990v.m72050f(this);
                    }
                } else if (this.receivedKeyEvent) {
                    RNGestureHandlerRootView rNGestureHandlerRootViewM71990v2 = m71990v();
                    if (rNGestureHandlerRootViewM71990v2 != null) {
                        rNGestureHandlerRootViewM71990v2.m72050f(this);
                    }
                    this.receivedKeyEvent = false;
                }
                if (f68325x == this) {
                    m71992y();
                    f68325x = null;
                    return super.performClick();
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: r */
        public final PathEffect m71987r() {
            String str = this.borderStyle;
            if (Intrinsics.areEqual(str, "dotted")) {
                float f11 = this.borderWidth;
                return new DashPathEffect(new float[]{f11, f11, f11, f11}, 0.0f);
            }
            if (!Intrinsics.areEqual(str, "dashed")) {
                return null;
            }
            float f12 = this.borderWidth;
            float f13 = 3;
            return new DashPathEffect(new float[]{f12 * f13, f12 * f13, f12 * f13, f12 * f13}, 0.0f);
        }

        /* JADX INFO: renamed from: z */
        public final boolean m71993z() {
            if (m71983x(this, null, 1, null)) {
                return false;
            }
            ButtonViewGroup buttonViewGroup = f68324w;
            if (buttonViewGroup == null) {
                f68324w = this;
                return true;
            }
            if (this.exclusive) {
                return buttonViewGroup == this;
            }
            return !(buttonViewGroup != null ? buttonViewGroup.exclusive : false);
        }

        private final boolean getHasBorderRadii() {
            return (this.borderRadius == 0.0f && this.borderTopLeftRadius == 0.0f && this.borderTopRightRadius == 0.0f && this.borderBottomLeftRadius == 0.0f && this.borderBottomRightRadius == 0.0f) ? false : true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: x */
        public static /* synthetic */ boolean m71983x(ButtonViewGroup buttonViewGroup, Sequence sequence, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                sequence = ViewGroupKt.getChildren(buttonViewGroup);
            }
            return buttonViewGroup.m71991w(sequence);
        }

        /* JADX INFO: renamed from: A */
        public final void m71984A() {
            if (this.needBackgroundUpdate) {
                this.needBackgroundUpdate = false;
                if (this._backgroundColor == 0) {
                    setBackground(null);
                }
                setForeground(null);
                Drawable drawableM71989t = m71989t();
                Drawable drawableM71988s = m71988s();
                if (getHasBorderRadii() && (drawableM71989t instanceof RippleDrawable)) {
                    PaintDrawable paintDrawable = new PaintDrawable(-1);
                    paintDrawable.setCornerRadii(m71986q());
                    ((RippleDrawable) drawableM71989t).setDrawableByLayerId(R.id.mask, paintDrawable);
                }
                if (this.useDrawableOnForeground) {
                    setForeground(drawableM71989t);
                    int i11 = this._backgroundColor;
                    if (i11 != 0) {
                        m71985B(i11, drawableM71988s, null);
                        return;
                    }
                    return;
                }
                int i12 = this._backgroundColor;
                if (i12 == 0 && this.rippleColor == null) {
                    setBackground(new LayerDrawable(new Drawable[]{drawableM71989t, drawableM71988s}));
                } else {
                    m71985B(i12, drawableM71988s, drawableM71989t);
                }
            }
        }

        /* JADX INFO: renamed from: B */
        public final void m71985B(int backgroundColor, Drawable borderDrawable, Drawable selectable) {
            PaintDrawable paintDrawable = new PaintDrawable(backgroundColor);
            if (getHasBorderRadii()) {
                paintDrawable.setCornerRadii(m71986q());
            }
            setBackground(new LayerDrawable(selectable != null ? new Drawable[]{paintDrawable, selectable, borderDrawable} : new Drawable[]{paintDrawable, borderDrawable}));
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: b */
        public void mo71887b(@NotNull MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            m71992y();
            this.isTouched = false;
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: c */
        public boolean mo71888c(@NotNull MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (event.getAction() == 3 || event.getAction() == 1 || event.getActionMasked() == 6) {
                return false;
            }
            boolean zM71993z = m71993z();
            if (zM71993z) {
                this.isTouched = true;
            }
            return zM71993z;
        }

        @Override // android.view.View
        public void drawableHotspotChanged(float x11, float y11) {
            ButtonViewGroup buttonViewGroup = f68324w;
            if (buttonViewGroup == null || buttonViewGroup == this) {
                super.drawableHotspotChanged(x11, y11);
            }
        }

        public final float getBorderBottomLeftRadius() {
            return this.borderBottomLeftRadius;
        }

        public final float getBorderBottomRightRadius() {
            return this.borderBottomRightRadius;
        }

        @Nullable
        public final Integer getBorderColor() {
            return this.borderColor;
        }

        public final float getBorderRadius() {
            return this.borderRadius;
        }

        @Nullable
        public final String getBorderStyle() {
            return this.borderStyle;
        }

        public final float getBorderTopLeftRadius() {
            return this.borderTopLeftRadius;
        }

        public final float getBorderTopRightRadius() {
            return this.borderTopRightRadius;
        }

        public final float getBorderWidth() {
            return this.borderWidth;
        }

        public final boolean getExclusive() {
            return this.exclusive;
        }

        @Nullable
        public final Integer getRippleColor() {
            return this.rippleColor;
        }

        @Nullable
        public final Integer getRippleRadius() {
            return this.rippleRadius;
        }

        public final boolean getUseBorderlessDrawable() {
            return this.useBorderlessDrawable;
        }

        public final boolean getUseDrawableOnForeground() {
            return this.useDrawableOnForeground;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(@NotNull AccessibilityNodeInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            super.onInitializeAccessibilityNodeInfo(info);
            Object tag = super.getTag(C5771R.id.react_test_id);
            if (tag instanceof String) {
                info.setViewIdResourceName((String) tag);
            }
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(@NotNull MotionEvent ev2) {
            Intrinsics.checkNotNullParameter(ev2, "ev");
            if (super.onInterceptTouchEvent(ev2)) {
                return true;
            }
            onTouchEvent(ev2);
            return isPressed();
        }

        @Override // android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(@NotNull MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            long eventTime = event.getEventTime();
            int action = event.getAction();
            ButtonViewGroup buttonViewGroup = f68324w;
            if (buttonViewGroup != null && buttonViewGroup != this) {
                Intrinsics.checkNotNull(buttonViewGroup);
                if (buttonViewGroup.exclusive) {
                    if (isPressed()) {
                        setPressed(false);
                    }
                    this.lastEventTime = eventTime;
                    this.lastAction = action;
                    return false;
                }
            }
            if (event.getAction() == 3) {
                m71992y();
            }
            if (this.lastEventTime == eventTime && this.lastAction == action && action != 3) {
                return false;
            }
            this.lastEventTime = eventTime;
            this.lastAction = action;
            return super.onTouchEvent(event);
        }

        /* JADX INFO: renamed from: q */
        public final float[] m71986q() {
            float f11 = this.borderTopLeftRadius;
            float f12 = this.borderTopRightRadius;
            float f13 = this.borderBottomRightRadius;
            float f14 = this.borderBottomLeftRadius;
            float[] fArr = {f11, f11, f12, f12, f13, f13, f14, f14};
            ArrayList arrayList = new ArrayList(8);
            for (int i11 = 0; i11 < 8; i11++) {
                float f15 = fArr[i11];
                if (f15 == 0.0f) {
                    f15 = this.borderRadius;
                }
                arrayList.add(Float.valueOf(f15));
            }
            return CollectionsKt.toFloatArray(arrayList);
        }

        /* JADX INFO: renamed from: s */
        public final Drawable m71988s() {
            PaintDrawable paintDrawable = new PaintDrawable(0);
            if (getHasBorderRadii()) {
                paintDrawable.setCornerRadii(m71986q());
            }
            if (this.borderWidth > 0.0f) {
                Paint paint = paintDrawable.getPaint();
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(this.borderWidth);
                Integer num = this.borderColor;
                paint.setColor(num != null ? num.intValue() : ViewCompat.MEASURED_STATE_MASK);
                paint.setPathEffect(m71987r());
            }
            return paintDrawable;
        }

        @Override // android.view.View
        public void setBackgroundColor(int color) {
            this._backgroundColor = color;
            this.needBackgroundUpdate = true;
        }

        public final void setBorderColor(@Nullable Integer num) {
            this.borderColor = num;
            this.needBackgroundUpdate = true;
        }

        public final void setBorderStyle(@Nullable String str) {
            this.borderStyle = str;
            this.needBackgroundUpdate = true;
        }

        public final void setExclusive(boolean z11) {
            this.exclusive = z11;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0021  */
        @Override // android.view.View
        public void setPressed(boolean pressed) {
            boolean z11;
            if (pressed && m71993z()) {
                f68325x = this;
            }
            if (!this.exclusive) {
                ButtonViewGroup buttonViewGroup = f68324w;
                z11 = (buttonViewGroup == null || !buttonViewGroup.exclusive) && !m71983x(this, null, 1, null);
            }
            if (!pressed || f68324w == this || z11) {
                this.isTouched = pressed;
                super.setPressed(pressed);
            }
            if (pressed || f68324w != this) {
                return;
            }
            this.isTouched = false;
        }

        public final void setRippleColor(@Nullable Integer num) {
            this.rippleColor = num;
            this.needBackgroundUpdate = true;
        }

        public final void setRippleRadius(@Nullable Integer num) {
            this.rippleRadius = num;
            this.needBackgroundUpdate = true;
        }

        public final void setTouched(boolean z11) {
            this.isTouched = z11;
        }

        public final void setUseBorderlessDrawable(boolean z11) {
            this.useBorderlessDrawable = z11;
        }

        public final void setUseDrawableOnForeground(boolean z11) {
            this.useDrawableOnForeground = z11;
            this.needBackgroundUpdate = true;
        }

        /* JADX INFO: renamed from: t */
        public final Drawable m71989t() {
            ColorStateList colorStateList;
            Integer num = this.rippleColor;
            if (num != null && num.intValue() == 0) {
                return null;
            }
            int[][] iArr = {new int[]{R.attr.state_enabled}};
            Integer num2 = this.rippleRadius;
            Integer num3 = this.rippleColor;
            if (num3 != null) {
                Intrinsics.checkNotNull(num3);
                colorStateList = new ColorStateList(iArr, new int[]{num3.intValue()});
            } else {
                getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, f68323v, true);
                colorStateList = new ColorStateList(iArr, new int[]{f68323v.data});
            }
            RippleDrawable rippleDrawable = new RippleDrawable(colorStateList, null, this.useBorderlessDrawable ? null : new ShapeDrawable(new RectShape()));
            if (num2 != null) {
                rippleDrawable.setRadius((int) PixelUtil.toPixelFromDIP(num2.intValue()));
            }
            return rippleDrawable;
        }

        /* JADX INFO: renamed from: y */
        public final void m71992y() {
            if (f68324w == this) {
                f68324w = null;
                f68325x = this;
            }
        }

        public ButtonViewGroup(@Nullable Context context) {
            super(context);
            this.borderStyle = "solid";
            this.exclusive = true;
            this.lastEventTime = -1L;
            this.lastAction = -1;
            setOnClickListener(f68326y);
            setClickable(true);
            setFocusable(true);
            this.needBackgroundUpdate = true;
            setClipChildren(false);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: a */
        public boolean mo71886a() {
            return NativeViewGestureHandler.InterfaceC33421c.a.m71899f(this);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: d */
        public boolean mo71889d() {
            return NativeViewGestureHandler.InterfaceC33421c.a.m71901h(this);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: e */
        public boolean mo71890e(@NotNull View view) {
            return NativeViewGestureHandler.InterfaceC33421c.a.m71895b(this, view);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        @Nullable
        /* JADX INFO: renamed from: f */
        public Boolean mo71891f(@Nullable View view, @NotNull MotionEvent motionEvent) {
            return NativeViewGestureHandler.InterfaceC33421c.a.m71898e(this, view, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: g */
        public void mo71892g(@NotNull MotionEvent motionEvent) {
            NativeViewGestureHandler.InterfaceC33421c.a.m71897d(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        @Nullable
        /* JADX INFO: renamed from: h */
        public Boolean mo71893h(@NotNull GestureHandler<?> gestureHandler) {
            return NativeViewGestureHandler.InterfaceC33421c.a.m71900g(this, gestureHandler);
        }

        public final void setBorderBottomLeftRadius(float f11) {
            this.borderBottomLeftRadius = f11 * getResources().getDisplayMetrics().density;
            this.needBackgroundUpdate = true;
        }

        public final void setBorderBottomRightRadius(float f11) {
            this.borderBottomRightRadius = f11 * getResources().getDisplayMetrics().density;
            this.needBackgroundUpdate = true;
        }

        public final void setBorderRadius(float f11) {
            this.borderRadius = f11 * getResources().getDisplayMetrics().density;
            this.needBackgroundUpdate = true;
        }

        public final void setBorderTopLeftRadius(float f11) {
            this.borderTopLeftRadius = f11 * getResources().getDisplayMetrics().density;
            this.needBackgroundUpdate = true;
        }

        public final void setBorderTopRightRadius(float f11) {
            this.borderTopRightRadius = f11 * getResources().getDisplayMetrics().density;
            this.needBackgroundUpdate = true;
        }

        public final void setBorderWidth(float f11) {
            this.borderWidth = f11 * getResources().getDisplayMetrics().density;
            this.needBackgroundUpdate = true;
        }

        /* JADX INFO: renamed from: v */
        public final RNGestureHandlerRootView m71990v() {
            RNGestureHandlerRootView rNGestureHandlerRootView = null;
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof RNGestureHandlerRootView) {
                    rNGestureHandlerRootView = (RNGestureHandlerRootView) parent;
                }
            }
            return rNGestureHandlerRootView;
        }

        /* JADX INFO: renamed from: w */
        public final boolean m71991w(Sequence<? extends View> children) {
            for (View view : children) {
                if (view instanceof ButtonViewGroup) {
                    ButtonViewGroup buttonViewGroup = (ButtonViewGroup) view;
                    if (buttonViewGroup.isTouched || buttonViewGroup.isPressed()) {
                        return true;
                    }
                }
                if ((view instanceof ViewGroup) && m71991w(ViewGroupKt.getChildren((ViewGroup) view))) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: u */
        public static final void m71982u(View view) {
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDrawableHotspotChanged(float x11, float y11) {
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ButtonViewGroup createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ButtonViewGroup(context);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public ViewManagerDelegate<ButtonViewGroup> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull ButtonViewGroup view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        view.m71984A();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(name = "backgroundColor")
    public void setBackgroundColor(@NotNull ButtonViewGroup view, int backgroundColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBackgroundColor(backgroundColor);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(name = "borderBottomLeftRadius")
    public void setBorderBottomLeftRadius(@NotNull ButtonViewGroup view, float borderBottomLeftRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderBottomLeftRadius(borderBottomLeftRadius);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(name = "borderBottomRightRadius")
    public void setBorderBottomRightRadius(@NotNull ButtonViewGroup view, float borderBottomRightRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderBottomRightRadius(borderBottomRightRadius);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_COLOR)
    public void setBorderColor(@NotNull ButtonViewGroup view, @Nullable Integer borderColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderColor(borderColor);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(name = "borderRadius")
    public void setBorderRadius(@NotNull ButtonViewGroup view, float borderRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderRadius(borderRadius);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "borderStyle")
    public void setBorderStyle(@NotNull ButtonViewGroup view, @Nullable String borderStyle) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderStyle(borderStyle);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(name = "borderTopLeftRadius")
    public void setBorderTopLeftRadius(@NotNull ButtonViewGroup view, float borderTopLeftRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderTopLeftRadius(borderTopLeftRadius);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(name = "borderTopRightRadius")
    public void setBorderTopRightRadius(@NotNull ButtonViewGroup view, float borderTopRightRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderTopRightRadius(borderTopRightRadius);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_WIDTH)
    public void setBorderWidth(@NotNull ButtonViewGroup view, float borderWidth) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderWidth(borderWidth);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "borderless")
    public void setBorderless(@NotNull ButtonViewGroup view, boolean useBorderlessDrawable) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setUseBorderlessDrawable(useBorderlessDrawable);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "enabled")
    public void setEnabled(@NotNull ButtonViewGroup view, boolean enabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setEnabled(enabled);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "exclusive")
    public void setExclusive(@NotNull ButtonViewGroup view, boolean exclusive) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setExclusive(exclusive);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "foreground")
    @TargetApi(23)
    public void setForeground(@NotNull ButtonViewGroup view, boolean useDrawableOnForeground) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setUseDrawableOnForeground(useDrawableOnForeground);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "rippleColor")
    public void setRippleColor(@NotNull ButtonViewGroup view, @Nullable Integer rippleColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setRippleColor(rippleColor);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "rippleRadius")
    public void setRippleRadius(@NotNull ButtonViewGroup view, int rippleRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setRippleRadius(Integer.valueOf(rippleRadius));
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "touchSoundDisabled")
    public void setTouchSoundDisabled(@NotNull ButtonViewGroup view, boolean touchSoundDisabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSoundEffectsEnabled(!touchSoundDisabled);
    }
}
