package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.Fragment;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.kubi.otc.entity.OtcAd;
import com.swmansion.rnscreens.bottomsheet.BottomSheetBehaviorExtKt;
import com.swmansion.rnscreens.bottomsheet.SheetDelegate;
import com.swmansion.rnscreens.bottomsheet.SheetUtilsKt;
import com.swmansion.rnscreens.events.HeaderHeightChangeEvent;
import com.swmansion.rnscreens.events.SheetDetentChangedEvent;
import com.swmansion.rnscreens.ext.FragmentExtKt;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Screen.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 à\u00012\u00020\u00012\u00020\u0002:\fÛ\u0001Ü\u0001Ý\u0001Þ\u0001ß\u0001à\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J0\u0010u\u001a\u00020v2\u0006\u0010w\u001a\u00020'2\u0006\u0010x\u001a\u00020>2\u0006\u0010y\u001a\u00020>2\u0006\u0010z\u001a\u00020>2\u0006\u0010{\u001a\u00020>H\u0016J\u000e\u0010|\u001a\u00020v2\u0006\u0010}\u001a\u00020~J\u0018\u0010\u007f\u001a\u00020v2\u000e\u0010\u001b\u001a\n\u0012\u0005\u0012\u00030\u0081\u00010\u0080\u0001H\u0014J\u0019\u0010\u0082\u0001\u001a\u00020v2\u000e\u0010\u001b\u001a\n\u0012\u0005\u0012\u00030\u0081\u00010\u0080\u0001H\u0014J5\u0010\u0083\u0001\u001a\u00020v2\u0006\u0010w\u001a\u00020'2\u0007\u0010\u0084\u0001\u001a\u00020>2\u0007\u0010\u0085\u0001\u001a\u00020>2\u0007\u0010\u0086\u0001\u001a\u00020>2\u0007\u0010\u0087\u0001\u001a\u00020>H\u0014J\u0018\u0010\u0088\u0001\u001a\u00020v2\u0007\u0010\u0089\u0001\u001a\u00020'H\u0000¢\u0006\u0003\b\u008a\u0001J\t\u0010\u008b\u0001\u001a\u00020vH\u0002J\u001b\u0010\u008c\u0001\u001a\u00020v2\u0007\u0010\u008d\u0001\u001a\u00020>2\u0007\u0010\u008e\u0001\u001a\u00020>H\u0002J$\u0010\u008f\u0001\u001a\u00020v2\u0007\u0010\u008d\u0001\u001a\u00020>2\u0007\u0010\u008e\u0001\u001a\u00020>2\u0007\u0010\u0090\u0001\u001a\u00020>H\u0002J\u0010\u0010\u0098\u0001\u001a\u00020v2\u0007\u0010\u0099\u0001\u001a\u00020'J\u0007\u0010\u009a\u0001\u001a\u00020'J\u0013\u0010\u009b\u0001\u001a\u00020'2\b\u0010\u009c\u0001\u001a\u00030\u009d\u0001H\u0002J\u001e\u0010\u009e\u0001\u001a\u00020v2\u0007\u0010\u009f\u0001\u001a\u00020>2\n\u0010 \u0001\u001a\u0005\u0018\u00010¡\u0001H\u0016J\u000f\u0010¢\u0001\u001a\u00020v2\u0006\u0010#\u001a\u00020\"J\u0012\u0010£\u0001\u001a\u00020v2\t\u0010?\u001a\u0005\u0018\u00010¤\u0001J\u0010\u0010¥\u0001\u001a\u00020v2\u0007\u0010¦\u0001\u001a\u00020>J\u0007\u0010Ç\u0001\u001a\u00020vJ\u0007\u0010È\u0001\u001a\u00020vJ\u0013\u0010É\u0001\u001a\u00020v2\b\u0010Ê\u0001\u001a\u00030\u009d\u0001H\u0002J\u0015\u0010Ë\u0001\u001a\u00020v2\n\u0010Ê\u0001\u001a\u0005\u0018\u00010\u009d\u0001H\u0002J\u0015\u0010Ì\u0001\u001a\u00020'2\n\u0010Í\u0001\u001a\u0005\u0018\u00010Î\u0001H\u0017J\u0012\u0010Ï\u0001\u001a\u00020v2\u0007\u0010Ð\u0001\u001a\u00020>H\u0002J!\u0010Ñ\u0001\u001a\u00020v2\u0007\u0010Ò\u0001\u001a\u00020>2\u0007\u0010Ó\u0001\u001a\u00020'H\u0000¢\u0006\u0003\bÔ\u0001J\t\u0010Õ\u0001\u001a\u00020vH\u0014J\u001b\u0010Ö\u0001\u001a\u00020v2\u0007\u0010Ò\u0001\u001a\u00020>2\u0007\u0010Ó\u0001\u001a\u00020'H\u0002J\u000f\u0010×\u0001\u001a\u00020vH\u0000¢\u0006\u0003\bØ\u0001J\u000f\u0010Ù\u0001\u001a\u00020vH\u0000¢\u0006\u0003\bÚ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010!\u001a\u0004\u0018\u00010\"@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u000205X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010?\u001a\u0004\u0018\u00010>2\b\u0010!\u001a\u0004\u0018\u00010>@BX\u0086\u000e¢\u0006\n\n\u0002\u0010B\u001a\u0004\b@\u0010AR\u001e\u0010C\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u0010\n\u0002\u0010G\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001a\u0010H\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010;\"\u0004\bI\u0010=R\u001a\u0010J\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010;\"\u0004\bK\u0010=R\u000e\u0010L\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010N\u001a\u00020M2\u0006\u0010!\u001a\u00020M@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001a\u0010S\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010;\"\u0004\bU\u0010=R \u0010V\u001a\b\u0012\u0004\u0012\u00020X0WX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001a\u0010]\u001a\u00020>X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u001a\u0010b\u001a\u00020>X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010_\"\u0004\bd\u0010aR\u001a\u0010e\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010;\"\u0004\bg\u0010=R\u001a\u0010h\u001a\u00020MX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010P\"\u0004\bj\u0010RR\u001a\u0010k\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010;\"\u0004\bm\u0010=R(\u0010o\u001a\u0004\u0018\u00010n2\b\u0010!\u001a\u0004\u0018\u00010n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u0014\u0010t\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bt\u0010;R\u0017\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0092\u00018F¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0016\u0010\u0095\u0001\u001a\u0004\u0018\u00010~8F¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R0\u0010§\u0001\u001a\u0005\u0018\u00010¤\u00012\n\u0010§\u0001\u001a\u0005\u0018\u00010¤\u0001@FX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R.\u0010\u00ad\u0001\u001a\u0004\u0018\u00010'2\t\u0010¬\u0001\u001a\u0004\u0018\u00010'@FX\u0086\u000e¢\u0006\u0012\n\u0002\u0010G\u001a\u0005\b\u00ad\u0001\u0010D\"\u0005\b®\u0001\u0010FR8\u0010°\u0001\u001a\u0004\u0018\u00010'2\t\u0010¯\u0001\u001a\u0004\u0018\u00010'8\u0006@FX\u0087\u000e¢\u0006\u001a\n\u0002\u0010G\u0012\u0006\b±\u0001\u0010²\u0001\u001a\u0005\b°\u0001\u0010D\"\u0005\b³\u0001\u0010FR9\u0010´\u0001\u001a\u0004\u0018\u00010>2\t\u0010´\u0001\u001a\u0004\u0018\u00010>8\u0006@FX\u0087\u000e¢\u0006\u001b\n\u0002\u0010B\u0012\u0006\bµ\u0001\u0010²\u0001\u001a\u0005\b¶\u0001\u0010A\"\u0006\b·\u0001\u0010¸\u0001R9\u0010¹\u0001\u001a\u0004\u0018\u00010>2\t\u0010¹\u0001\u001a\u0004\u0018\u00010>8\u0006@FX\u0087\u000e¢\u0006\u001b\n\u0002\u0010B\u0012\u0006\bº\u0001\u0010²\u0001\u001a\u0005\b»\u0001\u0010A\"\u0006\b¼\u0001\u0010¸\u0001R8\u0010¾\u0001\u001a\u0004\u0018\u00010'2\t\u0010½\u0001\u001a\u0004\u0018\u00010'8\u0006@FX\u0087\u000e¢\u0006\u001a\n\u0002\u0010G\u0012\u0006\b¿\u0001\u0010²\u0001\u001a\u0005\b¾\u0001\u0010D\"\u0005\bÀ\u0001\u0010FR.\u0010Â\u0001\u001a\u0004\u0018\u00010'2\t\u0010Á\u0001\u001a\u0004\u0018\u00010'@FX\u0086\u000e¢\u0006\u0012\n\u0002\u0010G\u001a\u0005\bÂ\u0001\u0010D\"\u0005\bÃ\u0001\u0010FR\u001d\u0010Ä\u0001\u001a\u00020'X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÅ\u0001\u0010;\"\u0005\bÆ\u0001\u0010=¨\u0006á\u0001"}, m90084d2 = {"Lcom/swmansion/rnscreens/Screen;", "Lcom/swmansion/rnscreens/FabricEnabledViewGroup;", "Lcom/swmansion/rnscreens/ScreenContentWrapper$OnLayoutCallback;", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "<init>", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "getReactContext", "()Lcom/facebook/react/uimanager/ThemedReactContext;", "fragment", "Landroidx/fragment/app/Fragment;", "getFragment", "()Landroidx/fragment/app/Fragment;", "sheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "getSheetBehavior", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "reactEventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "getReactEventDispatcher", "()Lcom/facebook/react/uimanager/events/EventDispatcher;", "fragmentWrapper", "Lcom/swmansion/rnscreens/ScreenFragmentWrapper;", "getFragmentWrapper", "()Lcom/swmansion/rnscreens/ScreenFragmentWrapper;", "setFragmentWrapper", "(Lcom/swmansion/rnscreens/ScreenFragmentWrapper;)V", TtmlNode.RUBY_CONTAINER, "Lcom/swmansion/rnscreens/ScreenContainer;", "getContainer", "()Lcom/swmansion/rnscreens/ScreenContainer;", "setContainer", "(Lcom/swmansion/rnscreens/ScreenContainer;)V", "value", "Lcom/swmansion/rnscreens/Screen$ActivityState;", "activityState", "getActivityState", "()Lcom/swmansion/rnscreens/Screen$ActivityState;", "isTransitioning", "", "stackPresentation", "Lcom/swmansion/rnscreens/Screen$StackPresentation;", "getStackPresentation", "()Lcom/swmansion/rnscreens/Screen$StackPresentation;", "setStackPresentation", "(Lcom/swmansion/rnscreens/Screen$StackPresentation;)V", "replaceAnimation", "Lcom/swmansion/rnscreens/Screen$ReplaceAnimation;", "getReplaceAnimation", "()Lcom/swmansion/rnscreens/Screen$ReplaceAnimation;", "setReplaceAnimation", "(Lcom/swmansion/rnscreens/Screen$ReplaceAnimation;)V", "stackAnimation", "Lcom/swmansion/rnscreens/Screen$StackAnimation;", "getStackAnimation", "()Lcom/swmansion/rnscreens/Screen$StackAnimation;", "setStackAnimation", "(Lcom/swmansion/rnscreens/Screen$StackAnimation;)V", "isGestureEnabled", "()Z", "setGestureEnabled", "(Z)V", "", "screenOrientation", "getScreenOrientation", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "isStatusBarAnimated", "()Ljava/lang/Boolean;", "setStatusBarAnimated", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isBeingRemoved", "setBeingRemoved", "isSheetGrabberVisible", "setSheetGrabberVisible", "shouldUpdateSheetCornerRadius", "", "sheetCornerRadius", "getSheetCornerRadius", "()F", "setSheetCornerRadius", "(F)V", "sheetExpandsWhenScrolledToEdge", "getSheetExpandsWhenScrolledToEdge", "setSheetExpandsWhenScrolledToEdge", "sheetDetents", "", "", "getSheetDetents", "()Ljava/util/List;", "setSheetDetents", "(Ljava/util/List;)V", "sheetLargestUndimmedDetentIndex", "getSheetLargestUndimmedDetentIndex", "()I", "setSheetLargestUndimmedDetentIndex", "(I)V", "sheetInitialDetentIndex", "getSheetInitialDetentIndex", "setSheetInitialDetentIndex", "sheetClosesOnTouchOutside", "getSheetClosesOnTouchOutside", "setSheetClosesOnTouchOutside", "sheetElevation", "getSheetElevation", "setSheetElevation", "shouldTriggerPostponedTransitionAfterLayout", "getShouldTriggerPostponedTransitionAfterLayout", "setShouldTriggerPostponedTransitionAfterLayout", "Lcom/swmansion/rnscreens/ScreenFooter;", "footer", "getFooter", "()Lcom/swmansion/rnscreens/ScreenFooter;", "setFooter", "(Lcom/swmansion/rnscreens/ScreenFooter;)V", "isNativeStackScreen", "onContentWrapperLayout", "", "changed", "left", ViewProps.TOP, "right", ViewProps.BOTTOM, "registerLayoutCallbackForWrapper", "wrapper", "Lcom/swmansion/rnscreens/ScreenContentWrapper;", "dispatchSaveInstanceState", "Landroid/util/SparseArray;", "Landroid/os/Parcelable;", "dispatchRestoreInstanceState", ViewProps.ON_LAYOUT, CmcdData.Factory.STREAM_TYPE_LIVE, "t", "r", "b", "onBottomSheetBehaviorDidLayout", "coordinatorLayoutDidChange", "onBottomSheetBehaviorDidLayout$react_native_screens_release", "triggerPostponedEnterTransitionIfNeeded", "updateScreenSizePaper", "width", "height", "dispatchShadowStateUpdate", "offsetY", "headerConfig", "Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;", "getHeaderConfig", "()Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;", "contentWrapper", "getContentWrapper", "()Lcom/swmansion/rnscreens/ScreenContentWrapper;", "setTransitioning", "transitioning", "isTranslucent", "hasWebView", "viewGroup", "Landroid/view/ViewGroup;", "setLayerType", "layerType", "paint", "Landroid/graphics/Paint;", "setActivityState", "setScreenOrientation", "", "changeAccessibilityMode", "mode", "statusBarStyle", "getStatusBarStyle", "()Ljava/lang/String;", "setStatusBarStyle", "(Ljava/lang/String;)V", "statusBarHidden", "isStatusBarHidden", "setStatusBarHidden", "statusBarTranslucent", "isStatusBarTranslucent", "isStatusBarTranslucent$annotations", "()V", "setStatusBarTranslucent", "statusBarColor", "getStatusBarColor$annotations", "getStatusBarColor", "setStatusBarColor", "(Ljava/lang/Integer;)V", "navigationBarColor", "getNavigationBarColor$annotations", "getNavigationBarColor", "setNavigationBarColor", "navigationBarTranslucent", "isNavigationBarTranslucent", "isNavigationBarTranslucent$annotations", "setNavigationBarTranslucent", "navigationBarHidden", "isNavigationBarHidden", "setNavigationBarHidden", "nativeBackButtonDismissalEnabled", "getNativeBackButtonDismissalEnabled", "setNativeBackButtonDismissalEnabled", "startRemovalTransition", "endRemovalTransition", "endTransitionRecursive", "parent", "startTransitionRecursive", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "notifyHeaderHeightChange", "headerHeight", "onSheetDetentChanged", "detentIndex", "isStable", "onSheetDetentChanged$react_native_screens_release", "onAttachedToWindow", "dispatchSheetDetentChanged", "onFinalizePropsUpdate", "onFinalizePropsUpdate$react_native_screens_release", "onSheetCornerRadiusChange", "onSheetCornerRadiusChange$react_native_screens_release", "StackPresentation", "StackAnimation", "ReplaceAnimation", "ActivityState", "WindowTraits", "Companion", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Screen.kt\ncom/swmansion/rnscreens/Screen\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,652:1\n1#2:653\n1317#3,2:654\n*S KotlinDebug\n*F\n+ 1 Screen.kt\ncom/swmansion/rnscreens/Screen\n*L\n471#1:654,2\n*E\n"})
public final class Screen extends FabricEnabledViewGroup implements ScreenContentWrapper.OnLayoutCallback {
    public static final double SHEET_FIT_TO_CONTENTS = -1.0d;

    @NotNull
    public static final String TAG = "Screen";

    @Nullable
    private ActivityState activityState;

    @Nullable
    private ScreenContainer container;

    @Nullable
    private ScreenFooter footer;

    @Nullable
    private ScreenFragmentWrapper fragmentWrapper;
    private boolean isBeingRemoved;
    private boolean isGestureEnabled;

    @Nullable
    private Boolean isNavigationBarHidden;

    @Nullable
    private Boolean isNavigationBarTranslucent;
    private boolean isSheetGrabberVisible;

    @Nullable
    private Boolean isStatusBarAnimated;

    @Nullable
    private Boolean isStatusBarHidden;

    @Nullable
    private Boolean isStatusBarTranslucent;
    private boolean isTransitioning;
    private boolean nativeBackButtonDismissalEnabled;

    @Nullable
    private Integer navigationBarColor;

    @NotNull
    private final ThemedReactContext reactContext;

    @NotNull
    private ReplaceAnimation replaceAnimation;

    @Nullable
    private Integer screenOrientation;
    private boolean sheetClosesOnTouchOutside;
    private float sheetCornerRadius;

    @NotNull
    private List<Double> sheetDetents;
    private float sheetElevation;
    private boolean sheetExpandsWhenScrolledToEdge;
    private int sheetInitialDetentIndex;
    private int sheetLargestUndimmedDetentIndex;
    private boolean shouldTriggerPostponedTransitionAfterLayout;
    private boolean shouldUpdateSheetCornerRadius;

    @NotNull
    private StackAnimation stackAnimation;

    @NotNull
    private StackPresentation stackPresentation;

    @Nullable
    private Integer statusBarColor;

    @Nullable
    private String statusBarStyle;

    /* JADX INFO: compiled from: Screen.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/swmansion/rnscreens/Screen$ActivityState;", "", "<init>", "(Ljava/lang/String;I)V", "INACTIVE", "TRANSITIONING_OR_BELOW_TOP", "ON_TOP", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public enum ActivityState {
        INACTIVE,
        TRANSITIONING_OR_BELOW_TOP,
        ON_TOP;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<ActivityState> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: Screen.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/swmansion/rnscreens/Screen$ReplaceAnimation;", "", "<init>", "(Ljava/lang/String;I)V", "PUSH", "POP", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public enum ReplaceAnimation {
        PUSH,
        POP;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<ReplaceAnimation> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: Screen.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m90084d2 = {"Lcom/swmansion/rnscreens/Screen$StackAnimation;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "NONE", "FADE", "SLIDE_FROM_BOTTOM", "SLIDE_FROM_RIGHT", "SLIDE_FROM_LEFT", "FADE_FROM_BOTTOM", "IOS_FROM_RIGHT", "IOS_FROM_LEFT", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public enum StackAnimation {
        DEFAULT,
        NONE,
        FADE,
        SLIDE_FROM_BOTTOM,
        SLIDE_FROM_RIGHT,
        SLIDE_FROM_LEFT,
        FADE_FROM_BOTTOM,
        IOS_FROM_RIGHT,
        IOS_FROM_LEFT;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<StackAnimation> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: Screen.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m90084d2 = {"Lcom/swmansion/rnscreens/Screen$StackPresentation;", "", "<init>", "(Ljava/lang/String;I)V", "PUSH", "MODAL", "TRANSPARENT_MODAL", "FORM_SHEET", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public enum StackPresentation {
        PUSH,
        MODAL,
        TRANSPARENT_MODAL,
        FORM_SHEET;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<StackPresentation> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: Screen.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m90084d2 = {"Lcom/swmansion/rnscreens/Screen$WindowTraits;", "", "<init>", "(Ljava/lang/String;I)V", "ORIENTATION", "COLOR", "STYLE", "TRANSLUCENT", OtcAd.STATUS_HIDDEN, "ANIMATED", "NAVIGATION_BAR_COLOR", "NAVIGATION_BAR_TRANSLUCENT", "NAVIGATION_BAR_HIDDEN", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public enum WindowTraits {
        ORIENTATION,
        COLOR,
        STYLE,
        TRANSLUCENT,
        HIDDEN,
        ANIMATED,
        NAVIGATION_BAR_COLOR,
        NAVIGATION_BAR_TRANSLUCENT,
        NAVIGATION_BAR_HIDDEN;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<WindowTraits> getEntries() {
            return $ENTRIES;
        }
    }

    @Override // com.swmansion.rnscreens.ScreenContentWrapper.OnLayoutCallback
    public void onContentWrapperLayout(boolean changed, int left, int top, int right, int bottom) {
        BottomSheetBehavior<Screen> sheetBehavior;
        int i11 = bottom - top;
        if (SheetUtilsKt.usesFormSheetPresentation(this) && SheetUtilsKt.isSheetFitToContents(this) && (sheetBehavior = getSheetBehavior()) != null) {
            BottomSheetBehaviorExtKt.useSingleDetent$default(sheetBehavior, Integer.valueOf(i11), false, 2, null);
        }
    }

    /* JADX INFO: compiled from: Screen.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StackPresentation.values().length];
            try {
                iArr[StackPresentation.TRANSPARENT_MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StackPresentation.FORM_SHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void dispatchSheetDetentChanged(int detentIndex, boolean isStable) {
        int surfaceId = UIManagerHelper.getSurfaceId(this.reactContext);
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher != null) {
            reactEventDispatcher.dispatchEvent(new SheetDetentChangedEvent(surfaceId, getId(), detentIndex, isStable));
        }
    }

    private final boolean isNativeStackScreen() {
        return this.container instanceof ScreenStack;
    }

    private final void startTransitionRecursive(ViewGroup parent) {
        if (parent != null) {
            int childCount = parent.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = parent.getChildAt(i11);
                if ((parent instanceof SwipeRefreshLayout) && (childAt instanceof ImageView)) {
                    parent.addView(new View(getContext()), i11);
                } else if (childAt != null) {
                    parent.startViewTransition(childAt);
                }
                if (childAt instanceof ScreenStackHeaderConfig) {
                    startTransitionRecursive(((ScreenStackHeaderConfig) childAt).getToolbar());
                }
                if (childAt instanceof ViewGroup) {
                    startTransitionRecursive((ViewGroup) childAt);
                }
            }
        }
    }

    private final void triggerPostponedEnterTransitionIfNeeded() {
        if (this.shouldTriggerPostponedTransitionAfterLayout) {
            this.shouldTriggerPostponedTransitionAfterLayout = false;
            Fragment fragment = getFragment();
            if (fragment != null) {
                fragment.startPostponedEnterTransition();
            }
        }
    }

    private final void updateScreenSizePaper(final int width, final int height) {
        ThemedReactContext themedReactContext = this.reactContext;
        themedReactContext.runOnNativeModulesQueueThread(new GuardedRunnable(themedReactContext.getExceptionHandler()) { // from class: com.swmansion.rnscreens.Screen.updateScreenSizePaper.1
            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                UIManagerModule uIManagerModule = (UIManagerModule) Screen.this.getReactContext().getNativeModule(UIManagerModule.class);
                if (uIManagerModule != null) {
                    uIManagerModule.updateNodeSize(Screen.this.getId(), width, height);
                }
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(@NotNull SparseArray<Parcelable> container) {
        Intrinsics.checkNotNullParameter(container, "container");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(@NotNull SparseArray<Parcelable> container) {
        Intrinsics.checkNotNullParameter(container, "container");
    }

    public final void endRemovalTransition() {
        if (this.isBeingRemoved) {
            this.isBeingRemoved = false;
            endTransitionRecursive(this);
        }
    }

    @Nullable
    public final ActivityState getActivityState() {
        return this.activityState;
    }

    @Nullable
    public final ScreenContainer getContainer() {
        return this.container;
    }

    @Nullable
    public final ScreenFooter getFooter() {
        return this.footer;
    }

    @Nullable
    public final Fragment getFragment() {
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            return screenFragmentWrapper.getFragment();
        }
        return null;
    }

    @Nullable
    public final ScreenFragmentWrapper getFragmentWrapper() {
        return this.fragmentWrapper;
    }

    public final boolean getNativeBackButtonDismissalEnabled() {
        return this.nativeBackButtonDismissalEnabled;
    }

    @Nullable
    public final Integer getNavigationBarColor() {
        return this.navigationBarColor;
    }

    @NotNull
    public final ThemedReactContext getReactContext() {
        return this.reactContext;
    }

    @Nullable
    public final EventDispatcher getReactEventDispatcher() {
        return UIManagerHelper.getEventDispatcherForReactTag(this.reactContext, getId());
    }

    @NotNull
    public final ReplaceAnimation getReplaceAnimation() {
        return this.replaceAnimation;
    }

    @Nullable
    public final Integer getScreenOrientation() {
        return this.screenOrientation;
    }

    public final boolean getSheetClosesOnTouchOutside() {
        return this.sheetClosesOnTouchOutside;
    }

    public final float getSheetCornerRadius() {
        return this.sheetCornerRadius;
    }

    @NotNull
    public final List<Double> getSheetDetents() {
        return this.sheetDetents;
    }

    public final float getSheetElevation() {
        return this.sheetElevation;
    }

    public final boolean getSheetExpandsWhenScrolledToEdge() {
        return this.sheetExpandsWhenScrolledToEdge;
    }

    public final int getSheetInitialDetentIndex() {
        return this.sheetInitialDetentIndex;
    }

    public final int getSheetLargestUndimmedDetentIndex() {
        return this.sheetLargestUndimmedDetentIndex;
    }

    public final boolean getShouldTriggerPostponedTransitionAfterLayout() {
        return this.shouldTriggerPostponedTransitionAfterLayout;
    }

    @NotNull
    public final StackAnimation getStackAnimation() {
        return this.stackAnimation;
    }

    @NotNull
    public final StackPresentation getStackPresentation() {
        return this.stackPresentation;
    }

    @Nullable
    public final Integer getStatusBarColor() {
        return this.statusBarColor;
    }

    @Nullable
    public final String getStatusBarStyle() {
        return this.statusBarStyle;
    }

    /* JADX INFO: renamed from: isBeingRemoved, reason: from getter */
    public final boolean getIsBeingRemoved() {
        return this.isBeingRemoved;
    }

    /* JADX INFO: renamed from: isGestureEnabled, reason: from getter */
    public final boolean getIsGestureEnabled() {
        return this.isGestureEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: isNavigationBarHidden, reason: from getter */
    public final Boolean getIsNavigationBarHidden() {
        return this.isNavigationBarHidden;
    }

    @Nullable
    /* JADX INFO: renamed from: isNavigationBarTranslucent, reason: from getter */
    public final Boolean getIsNavigationBarTranslucent() {
        return this.isNavigationBarTranslucent;
    }

    /* JADX INFO: renamed from: isSheetGrabberVisible, reason: from getter */
    public final boolean getIsSheetGrabberVisible() {
        return this.isSheetGrabberVisible;
    }

    @Nullable
    /* JADX INFO: renamed from: isStatusBarAnimated, reason: from getter */
    public final Boolean getIsStatusBarAnimated() {
        return this.isStatusBarAnimated;
    }

    @Nullable
    /* JADX INFO: renamed from: isStatusBarHidden, reason: from getter */
    public final Boolean getIsStatusBarHidden() {
        return this.isStatusBarHidden;
    }

    @Nullable
    /* JADX INFO: renamed from: isStatusBarTranslucent, reason: from getter */
    public final Boolean getIsStatusBarTranslucent() {
        return this.isStatusBarTranslucent;
    }

    public final boolean isTranslucent() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.stackPresentation.ordinal()];
        return i11 == 1 || i11 == 2;
    }

    public final void onFinalizePropsUpdate$react_native_screens_release() {
        if (this.shouldUpdateSheetCornerRadius) {
            this.shouldUpdateSheetCornerRadius = false;
            onSheetCornerRadiusChange$react_native_screens_release();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
        if (changed && isNativeStackScreen() && !SheetUtilsKt.usesFormSheetPresentation(this)) {
            dispatchShadowStateUpdate(r11 - l11, b11 - t11, t11);
            notifyHeaderHeightChange(t11);
        }
    }

    public final void onSheetCornerRadiusChange$react_native_screens_release() {
        if (this.stackPresentation != StackPresentation.FORM_SHEET || getBackground() == null) {
            return;
        }
        Drawable background = getBackground();
        MaterialShapeDrawable materialShapeDrawable = background instanceof MaterialShapeDrawable ? (MaterialShapeDrawable) background : null;
        if (materialShapeDrawable != null) {
            float dIPFromPixel = PixelUtil.toDIPFromPixel(this.sheetCornerRadius);
            ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder();
            builder.setTopLeftCorner(0, dIPFromPixel);
            builder.setTopRightCorner(0, dIPFromPixel);
            materialShapeDrawable.setShapeAppearanceModel(builder.build());
        }
    }

    public final void setActivityState(@NotNull ActivityState activityState) {
        Intrinsics.checkNotNullParameter(activityState, "activityState");
        ActivityState activityState2 = this.activityState;
        if (activityState == activityState2) {
            return;
        }
        if ((this.container instanceof ScreenStack) && activityState2 != null) {
            Intrinsics.checkNotNull(activityState2);
            if (activityState.compareTo(activityState2) < 0) {
                throw new IllegalStateException("[RNScreens] activityState can only progress in NativeStack");
            }
        }
        this.activityState = activityState;
        ScreenContainer screenContainer = this.container;
        if (screenContainer != null) {
            screenContainer.onChildUpdate();
        }
    }

    public final void setBeingRemoved(boolean z11) {
        this.isBeingRemoved = z11;
    }

    public final void setContainer(@Nullable ScreenContainer screenContainer) {
        this.container = screenContainer;
    }

    public final void setFooter(@Nullable ScreenFooter screenFooter) {
        BottomSheetBehavior<Screen> sheetBehavior;
        if (screenFooter == null && this.footer != null) {
            BottomSheetBehavior<Screen> sheetBehavior2 = getSheetBehavior();
            if (sheetBehavior2 != null) {
                ScreenFooter screenFooter2 = this.footer;
                Intrinsics.checkNotNull(screenFooter2);
                screenFooter2.unregisterWithSheetBehavior(sheetBehavior2);
            }
        } else if (screenFooter != null && (sheetBehavior = getSheetBehavior()) != null) {
            screenFooter.registerWithSheetBehavior(sheetBehavior);
        }
        this.footer = screenFooter;
    }

    public final void setFragmentWrapper(@Nullable ScreenFragmentWrapper screenFragmentWrapper) {
        this.fragmentWrapper = screenFragmentWrapper;
    }

    public final void setGestureEnabled(boolean z11) {
        this.isGestureEnabled = z11;
    }

    public final void setNativeBackButtonDismissalEnabled(boolean z11) {
        this.nativeBackButtonDismissalEnabled = z11;
    }

    public final void setNavigationBarColor(@Nullable Integer num) {
        if (num != null) {
            ScreenWindowTraits.INSTANCE.applyDidSetNavigationBarAppearance$react_native_screens_release();
        }
        this.navigationBarColor = num;
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            ScreenWindowTraits.INSTANCE.setNavigationBarColor$react_native_screens_release(this, screenFragmentWrapper.tryGetActivity());
        }
    }

    public final void setNavigationBarHidden(@Nullable Boolean bool) {
        if (bool != null) {
            ScreenWindowTraits.INSTANCE.applyDidSetNavigationBarAppearance$react_native_screens_release();
        }
        this.isNavigationBarHidden = bool;
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            ScreenWindowTraits.INSTANCE.setNavigationBarHidden$react_native_screens_release(this, screenFragmentWrapper.tryGetActivity());
        }
    }

    public final void setNavigationBarTranslucent(@Nullable Boolean bool) {
        if (bool != null) {
            ScreenWindowTraits.INSTANCE.applyDidSetNavigationBarAppearance$react_native_screens_release();
        }
        this.isNavigationBarTranslucent = bool;
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            ScreenWindowTraits.INSTANCE.setNavigationBarTranslucent$react_native_screens_release(this, screenFragmentWrapper.tryGetActivity());
        }
    }

    public final void setReplaceAnimation(@NotNull ReplaceAnimation replaceAnimation) {
        Intrinsics.checkNotNullParameter(replaceAnimation, "<set-?>");
        this.replaceAnimation = replaceAnimation;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    public final void setScreenOrientation(@Nullable String screenOrientation) {
        int i11;
        if (screenOrientation == null) {
            this.screenOrientation = null;
            return;
        }
        ScreenWindowTraits screenWindowTraits = ScreenWindowTraits.INSTANCE;
        screenWindowTraits.applyDidSetOrientation$react_native_screens_release();
        switch (screenOrientation) {
            case "portrait_down":
                i11 = 9;
                break;
            case "all":
                i11 = 10;
                break;
            case "portrait":
                i11 = 7;
                break;
            case "landscape":
                i11 = 6;
                break;
            case "portrait_up":
                i11 = 1;
                break;
            case "landscape_left":
                i11 = 8;
                break;
            case "landscape_right":
                i11 = 0;
                break;
            default:
                i11 = -1;
                break;
        }
        this.screenOrientation = Integer.valueOf(i11);
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            screenWindowTraits.setOrientation$react_native_screens_release(this, screenFragmentWrapper.tryGetActivity());
        }
    }

    public final void setSheetClosesOnTouchOutside(boolean z11) {
        this.sheetClosesOnTouchOutside = z11;
    }

    public final void setSheetCornerRadius(float f11) {
        if (this.sheetCornerRadius == f11) {
            return;
        }
        this.sheetCornerRadius = f11;
        this.shouldUpdateSheetCornerRadius = true;
    }

    public final void setSheetDetents(@NotNull List<Double> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.sheetDetents = list;
    }

    public final void setSheetElevation(float f11) {
        this.sheetElevation = f11;
    }

    public final void setSheetExpandsWhenScrolledToEdge(boolean z11) {
        this.sheetExpandsWhenScrolledToEdge = z11;
    }

    public final void setSheetGrabberVisible(boolean z11) {
        this.isSheetGrabberVisible = z11;
    }

    public final void setSheetInitialDetentIndex(int i11) {
        this.sheetInitialDetentIndex = i11;
    }

    public final void setSheetLargestUndimmedDetentIndex(int i11) {
        this.sheetLargestUndimmedDetentIndex = i11;
    }

    public final void setShouldTriggerPostponedTransitionAfterLayout(boolean z11) {
        this.shouldTriggerPostponedTransitionAfterLayout = z11;
    }

    public final void setStackAnimation(@NotNull StackAnimation stackAnimation) {
        Intrinsics.checkNotNullParameter(stackAnimation, "<set-?>");
        this.stackAnimation = stackAnimation;
    }

    public final void setStackPresentation(@NotNull StackPresentation stackPresentation) {
        Intrinsics.checkNotNullParameter(stackPresentation, "<set-?>");
        this.stackPresentation = stackPresentation;
    }

    public final void setStatusBarAnimated(@Nullable Boolean bool) {
        this.isStatusBarAnimated = bool;
    }

    public final void setStatusBarColor(@Nullable Integer num) {
        if (num != null) {
            ScreenWindowTraits.INSTANCE.applyDidSetStatusBarAppearance$react_native_screens_release();
        }
        this.statusBarColor = num;
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            ScreenWindowTraits.INSTANCE.setColor$react_native_screens_release(this, screenFragmentWrapper.tryGetActivity(), screenFragmentWrapper.tryGetContext());
        }
    }

    public final void setStatusBarHidden(@Nullable Boolean bool) {
        if (bool != null) {
            ScreenWindowTraits.INSTANCE.applyDidSetStatusBarAppearance$react_native_screens_release();
        }
        this.isStatusBarHidden = bool;
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            ScreenWindowTraits.INSTANCE.setHidden$react_native_screens_release(this, screenFragmentWrapper.tryGetActivity());
        }
    }

    public final void setStatusBarStyle(@Nullable String str) {
        if (str != null) {
            ScreenWindowTraits.INSTANCE.applyDidSetStatusBarAppearance$react_native_screens_release();
        }
        this.statusBarStyle = str;
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            ScreenWindowTraits.INSTANCE.setStyle$react_native_screens_release(this, screenFragmentWrapper.tryGetActivity(), screenFragmentWrapper.tryGetContext());
        }
    }

    public final void setStatusBarTranslucent(@Nullable Boolean bool) {
        if (bool != null) {
            ScreenWindowTraits.INSTANCE.applyDidSetStatusBarAppearance$react_native_screens_release();
        }
        this.isStatusBarTranslucent = bool;
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            ScreenWindowTraits.INSTANCE.setTranslucent$react_native_screens_release(this, screenFragmentWrapper.tryGetActivity(), screenFragmentWrapper.tryGetContext());
        }
    }

    public final void setTransitioning(boolean transitioning) {
        if (this.isTransitioning == transitioning) {
            return;
        }
        this.isTransitioning = transitioning;
        boolean zHasWebView = hasWebView(this);
        if (!zHasWebView || getLayerType() == 2) {
            super.setLayerType((!transitioning || zHasWebView) ? 0 : 2, null);
        }
    }

    public final void startRemovalTransition() {
        if (this.isBeingRemoved) {
            return;
        }
        this.isBeingRemoved = true;
        startTransitionRecursive(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Screen(@NotNull ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.stackPresentation = StackPresentation.PUSH;
        this.replaceAnimation = ReplaceAnimation.POP;
        this.stackAnimation = StackAnimation.DEFAULT;
        this.isGestureEnabled = true;
        this.sheetExpandsWhenScrolledToEdge = true;
        this.sheetDetents = CollectionsKt.mutableListOf(Double.valueOf(1.0d));
        this.sheetLargestUndimmedDetentIndex = -1;
        this.sheetClosesOnTouchOutside = true;
        this.sheetElevation = 24.0f;
        setLayoutParams(new WindowManager.LayoutParams(2));
        this.nativeBackButtonDismissalEnabled = true;
    }

    private final void dispatchShadowStateUpdate(int width, int height, int offsetY) {
        updateScreenSizeFabric(width, height, offsetY);
    }

    private final void endTransitionRecursive(ViewGroup parent) {
        for (View view : ViewGroupKt.getChildren(parent)) {
            parent.endViewTransition(view);
            if (view instanceof ScreenStackHeaderConfig) {
                endTransitionRecursive(((ScreenStackHeaderConfig) view).getToolbar());
            }
            if (view instanceof ViewGroup) {
                endTransitionRecursive((ViewGroup) view);
            }
        }
    }

    private final boolean hasWebView(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt instanceof WebView) {
                return true;
            }
            if ((childAt instanceof ViewGroup) && hasWebView((ViewGroup) childAt)) {
                return true;
            }
        }
        return false;
    }

    private final void notifyHeaderHeightChange(int headerHeight) {
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new HeaderHeightChangeEvent(surfaceId, getId(), headerHeight));
        }
    }

    public final void changeAccessibilityMode(int mode) {
        CustomToolbar toolbar;
        setImportantForAccessibility(mode);
        ScreenStackHeaderConfig headerConfig = getHeaderConfig();
        if (headerConfig != null && (toolbar = headerConfig.getToolbar()) != null) {
            toolbar.setImportantForAccessibility(mode);
        }
    }

    @Nullable
    public final ScreenContentWrapper getContentWrapper() {
        View next;
        Iterator<View> it = ViewGroupKt.getChildren(this).iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!(next instanceof ScreenContentWrapper));
        if (!(next instanceof ScreenContentWrapper)) {
            return null;
        }
        return (ScreenContentWrapper) next;
    }

    @Nullable
    public final ScreenStackHeaderConfig getHeaderConfig() {
        View next;
        Iterator<View> it = ViewGroupKt.getChildren(this).iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!(next instanceof ScreenStackHeaderConfig));
        if (!(next instanceof ScreenStackHeaderConfig)) {
            return null;
        }
        return (ScreenStackHeaderConfig) next;
    }

    @Nullable
    public final BottomSheetBehavior<Screen> getSheetBehavior() {
        CoordinatorLayout.LayoutParams layoutParams;
        CoordinatorLayout.Behavior behavior;
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 instanceof CoordinatorLayout.LayoutParams) {
            layoutParams = (CoordinatorLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            behavior = layoutParams.getBehavior();
        } else {
            behavior = null;
        }
        if (!(behavior instanceof BottomSheetBehavior)) {
            return null;
        }
        return (BottomSheetBehavior) behavior;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Fragment fragment;
        ScreenStackFragment screenStackFragmentAsScreenStackFragment;
        SheetDelegate sheetDelegate$react_native_screens_release;
        super.onAttachedToWindow();
        if (SheetUtilsKt.usesFormSheetPresentation(this) && (fragment = getFragment()) != null && (screenStackFragmentAsScreenStackFragment = FragmentExtKt.asScreenStackFragment(fragment)) != null && (sheetDelegate$react_native_screens_release = screenStackFragmentAsScreenStackFragment.getSheetDelegate()) != null) {
            InsetsObserverProxy.INSTANCE.addOnApplyWindowInsetsListener(sheetDelegate$react_native_screens_release);
        }
    }

    public final void onBottomSheetBehaviorDidLayout$react_native_screens_release(boolean coordinatorLayoutDidChange) {
        if (SheetUtilsKt.usesFormSheetPresentation(this) && isNativeStackScreen()) {
            if (coordinatorLayoutDidChange) {
                dispatchShadowStateUpdate(getWidth(), getHeight(), getTop());
            }
            ScreenFooter screenFooter = this.footer;
            if (screenFooter != null) {
                int left = getLeft();
                int top = getTop();
                int right = getRight();
                int bottom = getBottom();
                ScreenContainer screenContainer = this.container;
                Intrinsics.checkNotNull(screenContainer);
                screenFooter.onParentLayout(coordinatorLayoutDidChange, left, top, right, bottom, screenContainer.getHeight());
            }
        }
    }

    public final void onSheetDetentChanged$react_native_screens_release(int detentIndex, boolean isStable) {
        dispatchSheetDetentChanged(detentIndex, isStable);
        if (isStable) {
            updateScreenSizeFabric(getWidth(), getHeight(), getTop());
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        if (SheetUtilsKt.usesFormSheetPresentation(this)) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    public final void registerLayoutCallbackForWrapper(@NotNull ScreenContentWrapper wrapper) {
        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
        wrapper.setDelegate$react_native_screens_release(this);
    }

    @Deprecated(message = "For all apps targeting Android SDK 35 or above edge-to-edge is enabled by default. ")
    public static /* synthetic */ void getNavigationBarColor$annotations() {
    }

    @Deprecated(message = "For apps targeting SDK 35 or above this prop has no effect because edge-to-edge is enabled by default and the status bar is always translucent.")
    public static /* synthetic */ void getStatusBarColor$annotations() {
    }

    @Deprecated(message = "For all apps targeting Android SDK 35 or above edge-to-edge is enabled by default. ")
    public static /* synthetic */ void isNavigationBarTranslucent$annotations() {
    }

    @Deprecated(message = "For apps targeting SDK 35 or above this prop has no effect because edge-to-edge is enabled by default and the status bar is always translucent.")
    public static /* synthetic */ void isStatusBarTranslucent$annotations() {
    }

    @Override // android.view.View
    public void setLayerType(int layerType, @Nullable Paint paint) {
    }
}
