package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.events.Event;
import com.facebook.soloader.SoLoader;
import com.kubi.payment.fast.data.entities.RecurringPlan;
import com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec;
import com.swmansion.gesturehandler.core.FlingGestureHandler;
import com.swmansion.gesturehandler.core.GestureHandler;
import com.swmansion.gesturehandler.core.HoverGestureHandler;
import com.swmansion.gesturehandler.core.LongPressGestureHandler;
import com.swmansion.gesturehandler.core.NativeViewGestureHandler;
import com.swmansion.gesturehandler.core.PanGestureHandler;
import com.swmansion.gesturehandler.core.RotationGestureHandler;
import com.swmansion.gesturehandler.core.TapGestureHandler;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import pb0.InterfaceC43431a;
import qb0.C43690g;
import qb0.C43691h;
import rb0.C43977k;
import rb0.C43980n;
import rb0.InterfaceC43978l;
import sb0.C44375a;
import sb0.C44379e;
import tb0.AbstractC44918b;
import tb0.C44917a;
import tb0.C44919c;
import tb0.C44920d;
import tb0.C44921e;
import tb0.C44922f;
import tb0.C44923g;
import tb0.C44924h;
import tb0.C44925i;
import tb0.C44926j;

/* JADX INFO: compiled from: RNGestureHandlerModule.kt */
/* JADX INFO: loaded from: classes59.dex */
@ReactModule(name = "RNGestureHandlerModule")
@Metadata(m90083d1 = {"\u0000¯\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001V\b\u0007\u0018\u0000 j2\u00020\u00012\u00020\u0002:\u000bklmnopqrstjB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\u0010\u001a\u00020\u000f\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001a\u00020\u000f\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0082 ¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\u000f\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u001c\u001a\u00028\u0000H\u0002¢\u0006\u0004\b \u0010!J7\u0010$\u001a\u00020\u000f\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u001c\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000bH\u0002¢\u0006\u0004\b$\u0010%J'\u0010&\u001a\u00020\u000f\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u001c\u001a\u00028\u0000H\u0002¢\u0006\u0004\b&\u0010!J'\u0010)\u001a\u00020\u000f\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000'2\u0006\u0010(\u001a\u00028\u0000H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-J'\u0010.\u001a\u00020\u000f\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000'2\u0006\u0010(\u001a\u00028\u0000H\u0002¢\u0006\u0004\b.\u0010*J\u001f\u00102\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\t2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\tH\u0016¢\u0006\u0004\b4\u00105J'\u00108\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u00107\u001a\u0002062\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b8\u00109J'\u0010<\u001a\u00020\u000f2\u0006\u00107\u001a\u0002062\u0006\u0010:\u001a\u0002062\u0006\u0010;\u001a\u000206H\u0017¢\u0006\u0004\b<\u0010=J\u001f\u0010>\u001a\u00020\u000f2\u0006\u00107\u001a\u0002062\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u000f2\u0006\u00107\u001a\u000206H\u0017¢\u0006\u0004\b@\u0010AJ\u001f\u0010D\u001a\u00020\u000f2\u0006\u0010:\u001a\u0002062\u0006\u0010C\u001a\u00020BH\u0017¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u000fH\u0017¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u000fH\u0017¢\u0006\u0004\bH\u0010GJ\u001f\u0010I\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020BH\u0017¢\u0006\u0004\bK\u0010LJ\u001b\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020N0MH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u000fH\u0016¢\u0006\u0004\bQ\u0010GJ\u0015\u0010S\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020\u0019¢\u0006\u0004\bS\u0010TJ\u0015\u0010U\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020\u0019¢\u0006\u0004\bU\u0010TR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u001e\u0010Z\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0017\u0010]\u001a\u00020\\8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00190d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010i¨\u0006u"}, m90084d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule;", "Lcom/swmansion/gesturehandler/NativeRNGestureHandlerModuleSpec;", "Lpb0/a;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/swmansion/gesturehandler/core/GestureHandler;", ExifInterface.GPS_DIRECTION_TRUE, "", "handlerName", "", "handlerTag", "Lcom/facebook/react/bridge/ReadableMap;", "config", "", "createGestureHandlerHelper", "(Ljava/lang/String;ILcom/facebook/react/bridge/ReadableMap;)V", "updateGestureHandlerHelper", "(ILcom/facebook/react/bridge/ReadableMap;)V", "", "jsiPtr", "decorateRuntime", "(J)V", "viewTag", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper;", "findRootHelperForViewAncestor", "(I)Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper;", "handler", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$b;", "findFactoryForHandler", "(Lcom/swmansion/gesturehandler/core/GestureHandler;)Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$b;", "onHandlerUpdate", "(Lcom/swmansion/gesturehandler/core/GestureHandler;)V", "newState", "oldState", "onStateChange", "(Lcom/swmansion/gesturehandler/core/GestureHandler;II)V", "onTouchEvent", "Lcom/facebook/react/uimanager/events/Event;", "event", "sendEventForReanimated", "(Lcom/facebook/react/uimanager/events/Event;)V", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerEvent;", "sendEventForNativeAnimatedEvent", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerEvent;)V", "sendEventForDirectEvent", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "data", "sendEventForDeviceEvent", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "getName", "()Ljava/lang/String;", "", "handlerTagDouble", "createGestureHandler", "(Ljava/lang/String;DLcom/facebook/react/bridge/ReadableMap;)V", "viewTagDouble", "actionTypeDouble", "attachGestureHandler", "(DDD)V", "updateGestureHandler", "(DLcom/facebook/react/bridge/ReadableMap;)V", "dropGestureHandler", "(D)V", "", "blockNativeResponder", "handleSetJSResponder", "(DZ)V", "handleClearJSResponder", "()V", "flushOperations", "setGestureHandlerState", "(II)V", "install", "()Z", "", "", "getConstants", "()Ljava/util/Map;", "invalidate", "root", "registerRootHelper", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper;)V", "unregisterRootHelper", "com/swmansion/gesturehandler/react/RNGestureHandlerModule$k", "eventListener", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$k;", "", "handlerFactories", "[Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$b;", "Lsb0/e;", "registry", "Lsb0/e;", "getRegistry", "()Lsb0/e;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerInteractionManager;", "interactionManager", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerInteractionManager;", "", "roots", "Ljava/util/List;", "Lqb0/h;", "reanimatedEventDispatcher", "Lqb0/h;", "Companion", "b", "f", "j", "d", "g", CmcdData.Factory.STREAMING_FORMAT_HLS, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "i", "e", "c", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRNGestureHandlerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RNGestureHandlerModule.kt\ncom/swmansion/gesturehandler/react/RNGestureHandlerModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,743:1\n1#2:744\n295#3,2:745\n1310#4,2:747\n*S KotlinDebug\n*F\n+ 1 RNGestureHandlerModule.kt\ncom/swmansion/gesturehandler/react/RNGestureHandlerModule\n*L\n522#1:745,2\n530#1:747,2\n*E\n"})
public final class RNGestureHandlerModule extends NativeRNGestureHandlerModuleSpec implements InterfaceC43431a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String KEY_DIRECTION = "direction";

    @NotNull
    private static final String KEY_ENABLED = "enabled";

    @NotNull
    private static final String KEY_HIT_SLOP = "hitSlop";

    @NotNull
    private static final String KEY_HIT_SLOP_BOTTOM = "bottom";

    @NotNull
    private static final String KEY_HIT_SLOP_HEIGHT = "height";

    @NotNull
    private static final String KEY_HIT_SLOP_HORIZONTAL = "horizontal";

    @NotNull
    private static final String KEY_HIT_SLOP_LEFT = "left";

    @NotNull
    private static final String KEY_HIT_SLOP_RIGHT = "right";

    @NotNull
    private static final String KEY_HIT_SLOP_TOP = "top";

    @NotNull
    private static final String KEY_HIT_SLOP_VERTICAL = "vertical";

    @NotNull
    private static final String KEY_HIT_SLOP_WIDTH = "width";

    @NotNull
    private static final String KEY_LONG_PRESS_MAX_DIST = "maxDist";

    @NotNull
    private static final String KEY_LONG_PRESS_MIN_DURATION_MS = "minDurationMs";

    @NotNull
    private static final String KEY_MANUAL_ACTIVATION = "manualActivation";

    @NotNull
    private static final String KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION = "disallowInterruption";

    @NotNull
    private static final String KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START = "shouldActivateOnStart";

    @NotNull
    private static final String KEY_NEEDS_POINTER_DATA = "needsPointerData";

    @NotNull
    private static final String KEY_NUMBER_OF_POINTERS = "numberOfPointers";

    @NotNull
    private static final String KEY_PAN_ACTIVATE_AFTER_LONG_PRESS = "activateAfterLongPress";

    @NotNull
    private static final String KEY_PAN_ACTIVE_OFFSET_X_END = "activeOffsetXEnd";

    @NotNull
    private static final String KEY_PAN_ACTIVE_OFFSET_X_START = "activeOffsetXStart";

    @NotNull
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_END = "activeOffsetYEnd";

    @NotNull
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_START = "activeOffsetYStart";

    @NotNull
    private static final String KEY_PAN_AVG_TOUCHES = "avgTouches";

    @NotNull
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_END = "failOffsetXEnd";

    @NotNull
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_START = "failOffsetXStart";

    @NotNull
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_END = "failOffsetYEnd";

    @NotNull
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_START = "failOffsetYStart";

    @NotNull
    private static final String KEY_PAN_MAX_POINTERS = "maxPointers";

    @NotNull
    private static final String KEY_PAN_MIN_DIST = "minDist";

    @NotNull
    private static final String KEY_PAN_MIN_POINTERS = "minPointers";

    @NotNull
    private static final String KEY_PAN_MIN_VELOCITY = "minVelocity";

    @NotNull
    private static final String KEY_PAN_MIN_VELOCITY_X = "minVelocityX";

    @NotNull
    private static final String KEY_PAN_MIN_VELOCITY_Y = "minVelocityY";

    @NotNull
    private static final String KEY_SHOULD_CANCEL_WHEN_OUTSIDE = "shouldCancelWhenOutside";

    @NotNull
    private static final String KEY_TAP_MAX_DELAY_MS = "maxDelayMs";

    @NotNull
    private static final String KEY_TAP_MAX_DELTA_X = "maxDeltaX";

    @NotNull
    private static final String KEY_TAP_MAX_DELTA_Y = "maxDeltaY";

    @NotNull
    private static final String KEY_TAP_MAX_DIST = "maxDist";

    @NotNull
    private static final String KEY_TAP_MAX_DURATION_MS = "maxDurationMs";

    @NotNull
    private static final String KEY_TAP_MIN_POINTERS = "minPointers";

    @NotNull
    private static final String KEY_TAP_NUMBER_OF_TAPS = "numberOfTaps";

    @NotNull
    public static final String NAME = "RNGestureHandlerModule";

    @NotNull
    private final C33438k eventListener;

    @NotNull
    private final AbstractC33429b<?>[] handlerFactories;

    @NotNull
    private final RNGestureHandlerInteractionManager interactionManager;

    @NotNull
    private final C43691h reanimatedEventDispatcher;

    @NotNull
    private final C44379e registry;

    @NotNull
    private final List<RNGestureHandlerRootHelper> roots;

    /* JADX INFO: compiled from: RNGestureHandlerModule.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b-\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\rR\u0014\u0010\u0017\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\rR\u0014\u0010\u0018\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\rR\u0014\u0010\u0019\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\rR\u0014\u0010\u001a\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\rR\u0014\u0010\u001b\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\rR\u0014\u0010\u001c\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\rR\u0014\u0010\u001d\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\rR\u0014\u0010\u001e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\rR\u0014\u0010\u001f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\rR\u0014\u0010 \u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\rR\u0014\u0010!\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\rR\u0014\u0010\"\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\rR\u0014\u0010#\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\rR\u0014\u0010$\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\rR\u0014\u0010%\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\rR\u0014\u0010&\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\rR\u0014\u0010'\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\rR\u0014\u0010(\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\rR\u0014\u0010)\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\rR\u0014\u0010*\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\rR\u0014\u0010+\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\rR\u0014\u0010,\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\rR\u0014\u0010-\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\rR\u0014\u0010.\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\rR\u0014\u0010/\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010\rR\u0014\u00100\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010\rR\u0014\u00101\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010\rR\u0014\u00102\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010\rR\u0014\u00103\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010\rR\u0014\u00104\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010\rR\u0014\u00105\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u0010\rR\u0014\u00106\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u0010\rR\u0014\u00107\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u0010\r¨\u00068"}, m90084d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$Companion;", "", "<init>", "()V", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "handler", "Lcom/facebook/react/bridge/ReadableMap;", "config", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/swmansion/gesturehandler/core/GestureHandler;Lcom/facebook/react/bridge/ReadableMap;)V", "", "NAME", "Ljava/lang/String;", "KEY_SHOULD_CANCEL_WHEN_OUTSIDE", "KEY_ENABLED", "KEY_NEEDS_POINTER_DATA", "KEY_MANUAL_ACTIVATION", "KEY_HIT_SLOP", "KEY_HIT_SLOP_LEFT", "KEY_HIT_SLOP_TOP", "KEY_HIT_SLOP_RIGHT", "KEY_HIT_SLOP_BOTTOM", "KEY_HIT_SLOP_VERTICAL", "KEY_HIT_SLOP_HORIZONTAL", "KEY_HIT_SLOP_WIDTH", "KEY_HIT_SLOP_HEIGHT", "KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START", "KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION", "KEY_TAP_NUMBER_OF_TAPS", "KEY_TAP_MAX_DURATION_MS", "KEY_TAP_MAX_DELAY_MS", "KEY_TAP_MAX_DELTA_X", "KEY_TAP_MAX_DELTA_Y", "KEY_TAP_MAX_DIST", "KEY_TAP_MIN_POINTERS", "KEY_LONG_PRESS_MIN_DURATION_MS", "KEY_LONG_PRESS_MAX_DIST", "KEY_PAN_ACTIVE_OFFSET_X_START", "KEY_PAN_ACTIVE_OFFSET_X_END", "KEY_PAN_FAIL_OFFSET_RANGE_X_START", "KEY_PAN_FAIL_OFFSET_RANGE_X_END", "KEY_PAN_ACTIVE_OFFSET_Y_START", "KEY_PAN_ACTIVE_OFFSET_Y_END", "KEY_PAN_FAIL_OFFSET_RANGE_Y_START", "KEY_PAN_FAIL_OFFSET_RANGE_Y_END", "KEY_PAN_MIN_DIST", "KEY_PAN_MIN_VELOCITY", "KEY_PAN_MIN_VELOCITY_X", "KEY_PAN_MIN_VELOCITY_Y", "KEY_PAN_MIN_POINTERS", "KEY_PAN_MAX_POINTERS", "KEY_PAN_AVG_TOUCHES", "KEY_PAN_ACTIVATE_AFTER_LONG_PRESS", "KEY_NUMBER_OF_POINTERS", "KEY_DIRECTION", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final void m72005a(GestureHandler<?> handler, ReadableMap config) {
            if (config.getType(RNGestureHandlerModule.KEY_HIT_SLOP) == ReadableType.Number) {
                float pixelFromDIP = PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP));
                handler.m71805x0(pixelFromDIP, pixelFromDIP, pixelFromDIP, pixelFromDIP, Float.NaN, Float.NaN);
                return;
            }
            ReadableMap map = config.getMap(RNGestureHandlerModule.KEY_HIT_SLOP);
            Intrinsics.checkNotNull(map);
            float pixelFromDIP2 = map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_HORIZONTAL) ? PixelUtil.toPixelFromDIP(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_HORIZONTAL)) : Float.NaN;
            float pixelFromDIP3 = pixelFromDIP2;
            float pixelFromDIP4 = map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_VERTICAL) ? PixelUtil.toPixelFromDIP(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_VERTICAL)) : Float.NaN;
            float pixelFromDIP5 = pixelFromDIP4;
            if (map.hasKey("left")) {
                pixelFromDIP2 = PixelUtil.toPixelFromDIP(map.getDouble("left"));
            }
            float f11 = pixelFromDIP2;
            if (map.hasKey("top")) {
                pixelFromDIP4 = PixelUtil.toPixelFromDIP(map.getDouble("top"));
            }
            float f12 = pixelFromDIP4;
            if (map.hasKey("right")) {
                pixelFromDIP3 = PixelUtil.toPixelFromDIP(map.getDouble("right"));
            }
            float f13 = pixelFromDIP3;
            if (map.hasKey("bottom")) {
                pixelFromDIP5 = PixelUtil.toPixelFromDIP(map.getDouble("bottom"));
            }
            handler.m71805x0(f11, f12, f13, pixelFromDIP5, map.hasKey("width") ? PixelUtil.toPixelFromDIP(map.getDouble("width")) : Float.NaN, map.hasKey("height") ? PixelUtil.toPixelFromDIP(map.getDouble("height")) : Float.NaN);
        }
    }

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$a */
    /* JADX INFO: compiled from: RNGestureHandlerModule.kt */
    @Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m90084d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$a;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$b;", "Lcom/swmansion/gesturehandler/core/FlingGestureHandler;", "<init>", "()V", "Landroid/content/Context;", "context", "g", "(Landroid/content/Context;)Lcom/swmansion/gesturehandler/core/FlingGestureHandler;", "handler", "Lcom/facebook/react/bridge/ReadableMap;", "config", "", "f", "(Lcom/swmansion/gesturehandler/core/FlingGestureHandler;Lcom/facebook/react/bridge/ReadableMap;)V", "Ltb0/a;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lcom/swmansion/gesturehandler/core/FlingGestureHandler;)Ltb0/a;", "Ljava/lang/Class;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "name", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C33428a extends AbstractC33429b<FlingGestureHandler> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Class<FlingGestureHandler> type = FlingGestureHandler.class;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String name = "FlingGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public String getName() {
            return this.name;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: e */
        public Class<FlingGestureHandler> mo72010e() {
            return this.type;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo72006a(@NotNull FlingGestureHandler handler, @NotNull ReadableMap config) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(config, "config");
            super.mo72006a(handler, config);
            if (config.hasKey(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS)) {
                handler.m71711X0(config.getInt(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_DIRECTION)) {
                handler.m71710W0(config.getInt(RNGestureHandlerModule.KEY_DIRECTION));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public FlingGestureHandler mo72007b(@Nullable Context context) {
            return new FlingGestureHandler();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public C44917a mo72008c(@NotNull FlingGestureHandler handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new C44917a(handler);
        }
    }

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$b */
    /* JADX INFO: compiled from: RNGestureHandlerModule.kt */
    @Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\"\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00028\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\n\u001a\u00028\u0000H&¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m90084d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$b;", "Lcom/swmansion/gesturehandler/core/GestureHandler;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "Landroid/content/Context;", "context", "b", "(Landroid/content/Context;)Lcom/swmansion/gesturehandler/core/GestureHandler;", "handler", "Lcom/facebook/react/bridge/ReadableMap;", "config", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/swmansion/gesturehandler/core/GestureHandler;Lcom/facebook/react/bridge/ReadableMap;)V", "Ltb0/b;", "c", "(Lcom/swmansion/gesturehandler/core/GestureHandler;)Ltb0/b;", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "d", "()Ljava/lang/String;", "name", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static abstract class AbstractC33429b<T extends GestureHandler<T>> {
        @NotNull
        /* JADX INFO: renamed from: b */
        public abstract T mo72007b(@Nullable Context context);

        @NotNull
        /* JADX INFO: renamed from: c */
        public abstract AbstractC44918b<T> mo72008c(@NotNull T handler);

        @NotNull
        /* JADX INFO: renamed from: d */
        public abstract String getName();

        @NotNull
        /* JADX INFO: renamed from: e */
        public abstract Class<T> mo72010e();

        /* JADX INFO: renamed from: a */
        public void mo72006a(@NotNull T handler, @NotNull ReadableMap config) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(config, "config");
            handler.mo71718o0();
            if (config.hasKey(RNGestureHandlerModule.KEY_SHOULD_CANCEL_WHEN_OUTSIDE)) {
                handler.m71737E0(config.getBoolean(RNGestureHandlerModule.KEY_SHOULD_CANCEL_WHEN_OUTSIDE));
            }
            if (config.hasKey("enabled")) {
                handler.m71802v0(config.getBoolean("enabled"));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP)) {
                RNGestureHandlerModule.INSTANCE.m72005a(handler, config);
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_NEEDS_POINTER_DATA)) {
                handler.m71731B0(config.getBoolean(RNGestureHandlerModule.KEY_NEEDS_POINTER_DATA));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_MANUAL_ACTIVATION)) {
                handler.m71809z0(config.getBoolean(RNGestureHandlerModule.KEY_MANUAL_ACTIVATION));
            }
            if (config.hasKey("mouseButton")) {
                handler.m71729A0(config.getInt("mouseButton"));
            }
        }
    }

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$c */
    /* JADX INFO: compiled from: RNGestureHandlerModule.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m90084d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$b;", "Lcom/swmansion/gesturehandler/core/HoverGestureHandler;", "<init>", "()V", "Landroid/content/Context;", "context", "f", "(Landroid/content/Context;)Lcom/swmansion/gesturehandler/core/HoverGestureHandler;", "handler", "Ltb0/c;", "g", "(Lcom/swmansion/gesturehandler/core/HoverGestureHandler;)Ltb0/c;", "Ljava/lang/Class;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "name", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C33430c extends AbstractC33429b<HoverGestureHandler> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Class<HoverGestureHandler> type = HoverGestureHandler.class;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String name = "HoverGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public String getName() {
            return this.name;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: e */
        public Class<HoverGestureHandler> mo72010e() {
            return this.type;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public HoverGestureHandler mo72007b(@Nullable Context context) {
            return new HoverGestureHandler();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public C44919c mo72008c(@NotNull HoverGestureHandler handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new C44919c(handler);
        }
    }

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$d */
    /* JADX INFO: compiled from: RNGestureHandlerModule.kt */
    @Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m90084d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$d;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$b;", "Lcom/swmansion/gesturehandler/core/LongPressGestureHandler;", "<init>", "()V", "Landroid/content/Context;", "context", "g", "(Landroid/content/Context;)Lcom/swmansion/gesturehandler/core/LongPressGestureHandler;", "handler", "Lcom/facebook/react/bridge/ReadableMap;", "config", "", "f", "(Lcom/swmansion/gesturehandler/core/LongPressGestureHandler;Lcom/facebook/react/bridge/ReadableMap;)V", "Ltb0/d;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lcom/swmansion/gesturehandler/core/LongPressGestureHandler;)Ltb0/d;", "Ljava/lang/Class;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "name", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C33431d extends AbstractC33429b<LongPressGestureHandler> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Class<LongPressGestureHandler> type = LongPressGestureHandler.class;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String name = "LongPressGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public String getName() {
            return this.name;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: e */
        public Class<LongPressGestureHandler> mo72010e() {
            return this.type;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo72006a(@NotNull LongPressGestureHandler handler, @NotNull ReadableMap config) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(config, "config");
            super.mo72006a(handler, config);
            if (config.hasKey(RNGestureHandlerModule.KEY_LONG_PRESS_MIN_DURATION_MS)) {
                handler.m71880Y0(config.getInt(RNGestureHandlerModule.KEY_LONG_PRESS_MIN_DURATION_MS));
            }
            if (config.hasKey("maxDist")) {
                handler.m71879X0(PixelUtil.toPixelFromDIP(config.getDouble("maxDist")));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS)) {
                handler.m71881Z0(config.getInt(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public LongPressGestureHandler mo72007b(@Nullable Context context) {
            Intrinsics.checkNotNull(context);
            return new LongPressGestureHandler(context);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public C44920d mo72008c(@NotNull LongPressGestureHandler handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new C44920d(handler);
        }
    }

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$e */
    /* JADX INFO: compiled from: RNGestureHandlerModule.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m90084d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$e;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$b;", "Lrb0/k;", "<init>", "()V", "Landroid/content/Context;", "context", "f", "(Landroid/content/Context;)Lrb0/k;", "handler", "Ltb0/e;", "g", "(Lrb0/k;)Ltb0/e;", "Ljava/lang/Class;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "name", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C33432e extends AbstractC33429b<C43977k> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Class<C43977k> type = C43977k.class;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String name = "ManualGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public String getName() {
            return this.name;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: e */
        public Class<C43977k> mo72010e() {
            return this.type;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public C43977k mo72007b(@Nullable Context context) {
            return new C43977k();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public C44921e mo72008c(@NotNull C43977k handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new C44921e(handler);
        }
    }

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$f */
    /* JADX INFO: compiled from: RNGestureHandlerModule.kt */
    @Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m90084d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$f;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$b;", "Lcom/swmansion/gesturehandler/core/NativeViewGestureHandler;", "<init>", "()V", "Landroid/content/Context;", "context", "g", "(Landroid/content/Context;)Lcom/swmansion/gesturehandler/core/NativeViewGestureHandler;", "handler", "Lcom/facebook/react/bridge/ReadableMap;", "config", "", "f", "(Lcom/swmansion/gesturehandler/core/NativeViewGestureHandler;Lcom/facebook/react/bridge/ReadableMap;)V", "Ltb0/f;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lcom/swmansion/gesturehandler/core/NativeViewGestureHandler;)Ltb0/f;", "Ljava/lang/Class;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "name", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C33433f extends AbstractC33429b<NativeViewGestureHandler> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Class<NativeViewGestureHandler> type = NativeViewGestureHandler.class;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String name = "NativeViewGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public String getName() {
            return this.name;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: e */
        public Class<NativeViewGestureHandler> mo72010e() {
            return this.type;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo72006a(@NotNull NativeViewGestureHandler handler, @NotNull ReadableMap config) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(config, "config");
            super.mo72006a(handler, config);
            if (config.hasKey(RNGestureHandlerModule.KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START)) {
                handler.m71884U0(config.getBoolean(RNGestureHandlerModule.KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION)) {
                handler.m71883T0(config.getBoolean(RNGestureHandlerModule.KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NativeViewGestureHandler mo72007b(@Nullable Context context) {
            return new NativeViewGestureHandler();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public C44922f mo72008c(@NotNull NativeViewGestureHandler handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new C44922f(handler);
        }
    }

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$g */
    /* JADX INFO: compiled from: RNGestureHandlerModule.kt */
    @Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m90084d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$g;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$b;", "Lcom/swmansion/gesturehandler/core/PanGestureHandler;", "<init>", "()V", "Landroid/content/Context;", "context", "g", "(Landroid/content/Context;)Lcom/swmansion/gesturehandler/core/PanGestureHandler;", "handler", "Lcom/facebook/react/bridge/ReadableMap;", "config", "", "f", "(Lcom/swmansion/gesturehandler/core/PanGestureHandler;Lcom/facebook/react/bridge/ReadableMap;)V", "Ltb0/g;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lcom/swmansion/gesturehandler/core/PanGestureHandler;)Ltb0/g;", "Ljava/lang/Class;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "name", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C33434g extends AbstractC33429b<PanGestureHandler> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Class<PanGestureHandler> type = PanGestureHandler.class;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String name = "PanGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public String getName() {
            return this.name;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: e */
        public Class<PanGestureHandler> mo72010e() {
            return this.type;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo72006a(@NotNull PanGestureHandler handler, @NotNull ReadableMap config) {
            boolean z11;
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(config, "config");
            super.mo72006a(handler, config);
            boolean z12 = true;
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_START)) {
                handler.m71911b1(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_START)));
                z11 = true;
            } else {
                z11 = false;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_END)) {
                handler.m71910a1(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_END)));
                z11 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_START)) {
                handler.m71916g1(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_START)));
                z11 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_END)) {
                handler.m71915f1(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_END)));
                z11 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_START)) {
                handler.m71913d1(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_START)));
                z11 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_END)) {
                handler.m71912c1(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_END)));
                z11 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_START)) {
                handler.m71918i1(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_START)));
                z11 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_END)) {
                handler.m71917h1(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_END)));
                z11 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY)) {
                handler.m71922m1(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY)));
                z11 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_X)) {
                handler.m71923n1(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_X)));
                z11 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_Y)) {
                handler.m71924o1(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_Y)));
            } else {
                z12 = z11;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_DIST)) {
                handler.m71920k1(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_DIST)));
            } else if (z12) {
                handler.m71920k1(Float.MAX_VALUE);
            }
            if (config.hasKey("minPointers")) {
                handler.m71921l1(config.getInt("minPointers"));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_MAX_POINTERS)) {
                handler.m71919j1(config.getInt(RNGestureHandlerModule.KEY_PAN_MAX_POINTERS));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_AVG_TOUCHES)) {
                handler.m71914e1(config.getBoolean(RNGestureHandlerModule.KEY_PAN_AVG_TOUCHES));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVATE_AFTER_LONG_PRESS)) {
                handler.m71909Z0(config.getInt(RNGestureHandlerModule.KEY_PAN_ACTIVATE_AFTER_LONG_PRESS));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public PanGestureHandler mo72007b(@Nullable Context context) {
            return new PanGestureHandler(context);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public C44923g mo72008c(@NotNull PanGestureHandler handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new C44923g(handler);
        }
    }

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$h */
    /* JADX INFO: compiled from: RNGestureHandlerModule.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m90084d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$h;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$b;", "Lrb0/n;", "<init>", "()V", "Landroid/content/Context;", "context", "f", "(Landroid/content/Context;)Lrb0/n;", "handler", "Ltb0/h;", "g", "(Lrb0/n;)Ltb0/h;", "Ljava/lang/Class;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "name", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C33435h extends AbstractC33429b<C43980n> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Class<C43980n> type = C43980n.class;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String name = "PinchGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public String getName() {
            return this.name;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: e */
        public Class<C43980n> mo72010e() {
            return this.type;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public C43980n mo72007b(@Nullable Context context) {
            return new C43980n();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public C44924h mo72008c(@NotNull C43980n handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new C44924h(handler);
        }
    }

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$i */
    /* JADX INFO: compiled from: RNGestureHandlerModule.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m90084d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$i;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$b;", "Lcom/swmansion/gesturehandler/core/RotationGestureHandler;", "<init>", "()V", "Landroid/content/Context;", "context", "f", "(Landroid/content/Context;)Lcom/swmansion/gesturehandler/core/RotationGestureHandler;", "handler", "Ltb0/i;", "g", "(Lcom/swmansion/gesturehandler/core/RotationGestureHandler;)Ltb0/i;", "Ljava/lang/Class;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "name", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C33436i extends AbstractC33429b<RotationGestureHandler> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Class<RotationGestureHandler> type = RotationGestureHandler.class;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String name = "RotationGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public String getName() {
            return this.name;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: e */
        public Class<RotationGestureHandler> mo72010e() {
            return this.type;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public RotationGestureHandler mo72007b(@Nullable Context context) {
            return new RotationGestureHandler();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public C44925i mo72008c(@NotNull RotationGestureHandler handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new C44925i(handler);
        }
    }

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$j */
    /* JADX INFO: compiled from: RNGestureHandlerModule.kt */
    @Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m90084d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$j;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$b;", "Lcom/swmansion/gesturehandler/core/TapGestureHandler;", "<init>", "()V", "Landroid/content/Context;", "context", "g", "(Landroid/content/Context;)Lcom/swmansion/gesturehandler/core/TapGestureHandler;", "handler", "Lcom/facebook/react/bridge/ReadableMap;", "config", "", "f", "(Lcom/swmansion/gesturehandler/core/TapGestureHandler;Lcom/facebook/react/bridge/ReadableMap;)V", "Ltb0/j;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lcom/swmansion/gesturehandler/core/TapGestureHandler;)Ltb0/j;", "Ljava/lang/Class;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "name", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C33437j extends AbstractC33429b<TapGestureHandler> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Class<TapGestureHandler> type = TapGestureHandler.class;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String name = "TapGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public String getName() {
            return this.name;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: e */
        public Class<TapGestureHandler> mo72010e() {
            return this.type;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo72006a(@NotNull TapGestureHandler handler, @NotNull ReadableMap config) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(config, "config");
            super.mo72006a(handler, config);
            if (config.hasKey(RNGestureHandlerModule.KEY_TAP_NUMBER_OF_TAPS)) {
                handler.m71951b1(config.getInt(RNGestureHandlerModule.KEY_TAP_NUMBER_OF_TAPS));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DURATION_MS)) {
                handler.m71947X0(config.getInt(RNGestureHandlerModule.KEY_TAP_MAX_DURATION_MS));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELAY_MS)) {
                handler.m71945V0(config.getInt(RNGestureHandlerModule.KEY_TAP_MAX_DELAY_MS));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_X)) {
                handler.m71948Y0(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_X)));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_Y)) {
                handler.m71949Z0(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_Y)));
            }
            if (config.hasKey("maxDist")) {
                handler.m71946W0(PixelUtil.toPixelFromDIP(config.getDouble("maxDist")));
            }
            if (config.hasKey("minPointers")) {
                handler.m71950a1(config.getInt("minPointers"));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public TapGestureHandler mo72007b(@Nullable Context context) {
            return new TapGestureHandler();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC33429b
        @NotNull
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public C44926j mo72008c(@NotNull TapGestureHandler handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new C44926j(handler);
        }
    }

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$k */
    /* JADX INFO: compiled from: RNGestureHandlerModule.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u0007\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\r\u001a\u00020\u0007\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\u0007\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"com/swmansion/gesturehandler/react/RNGestureHandlerModule$k", "Lrb0/l;", "Lcom/swmansion/gesturehandler/core/GestureHandler;", ExifInterface.GPS_DIRECTION_TRUE, "handler", "Landroid/view/MotionEvent;", "event", "", "c", "(Lcom/swmansion/gesturehandler/core/GestureHandler;Landroid/view/MotionEvent;)V", "", "newState", "oldState", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/swmansion/gesturehandler/core/GestureHandler;II)V", "b", "(Lcom/swmansion/gesturehandler/core/GestureHandler;)V", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C33438k implements InterfaceC43978l {
        public C33438k() {
        }

        @Override // rb0.InterfaceC43978l
        /* JADX INFO: renamed from: a */
        public <T extends GestureHandler<T>> void mo72034a(T handler, int newState, int oldState) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            RNGestureHandlerModule.this.onStateChange(handler, newState, oldState);
        }

        @Override // rb0.InterfaceC43978l
        /* JADX INFO: renamed from: b */
        public <T extends GestureHandler<T>> void mo72035b(T handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            RNGestureHandlerModule.this.onTouchEvent(handler);
        }

        @Override // rb0.InterfaceC43978l
        /* JADX INFO: renamed from: c */
        public <T extends GestureHandler<T>> void mo72036c(T handler, MotionEvent event) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(event, "event");
            RNGestureHandlerModule.this.onHandlerUpdate(handler);
        }
    }

    private final native void decorateRuntime(long jsiPtr);

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void attachGestureHandler(double handlerTagDouble, double viewTagDouble, double actionTypeDouble) {
        int i11 = (int) handlerTagDouble;
        if (this.registry.m97878c(i11, (int) viewTagDouble, (int) actionTypeDouble)) {
            return;
        }
        throw new JSApplicationIllegalArgumentException("Handler with tag " + i11 + " does not exists");
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void dropGestureHandler(double handlerTagDouble) {
        int i11 = (int) handlerTagDouble;
        this.interactionManager.m72002g(i11);
        this.registry.m97881g(i11);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @NotNull
    public Map<String, Object> getConstants() {
        return MapsKt.mapOf(TuplesKt.m90091to("State", MapsKt.mapOf(TuplesKt.m90091to("UNDETERMINED", 0), TuplesKt.m90091to("BEGAN", 2), TuplesKt.m90091to("ACTIVE", 4), TuplesKt.m90091to(RecurringPlan.CANCELLED, 3), TuplesKt.m90091to("FAILED", 1), TuplesKt.m90091to("END", 5))), TuplesKt.m90091to("Direction", MapsKt.mapOf(TuplesKt.m90091to("RIGHT", 1), TuplesKt.m90091to("LEFT", 2), TuplesKt.m90091to("UP", 4), TuplesKt.m90091to("DOWN", 8))));
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void handleSetJSResponder(double viewTagDouble, boolean blockNativeResponder) {
        int i11 = (int) viewTagDouble;
        RNGestureHandlerRootHelper rNGestureHandlerRootHelperFindRootHelperForViewAncestor = findRootHelperForViewAncestor(i11);
        if (rNGestureHandlerRootHelperFindRootHelperForViewAncestor != null) {
            rNGestureHandlerRootHelperFindRootHelperForViewAncestor.m72044g(i11, blockNativeResponder);
        }
    }

    private final <T extends GestureHandler<T>> void createGestureHandlerHelper(String handlerName, int handlerTag, ReadableMap config) {
        if (this.registry.m97882h(handlerTag) != null) {
            throw new IllegalStateException("Handler with tag " + handlerTag + " already exists. Please ensure that no Gesture instance is used across multiple GestureDetectors.");
        }
        for (AbstractC33429b<?> abstractC33429b : this.handlerFactories) {
            if (Intrinsics.areEqual(abstractC33429b.getName(), handlerName)) {
                GestureHandler<?> gestureHandlerMo72007b = abstractC33429b.mo72007b(getReactApplicationContext());
                gestureHandlerMo72007b.m71741G0(handlerTag);
                gestureHandlerMo72007b.m71733C0(this.eventListener);
                this.registry.m97884j(gestureHandlerMo72007b);
                this.interactionManager.m72000e(gestureHandlerMo72007b, config);
                abstractC33429b.mo72006a(gestureHandlerMo72007b, config);
                return;
            }
        }
        throw new JSApplicationIllegalArgumentException("Invalid handler name " + handlerName);
    }

    private final <T extends GestureHandler<T>> AbstractC33429b<T> findFactoryForHandler(GestureHandler<T> handler) {
        for (Object obj : this.handlerFactories) {
            AbstractC33429b<T> abstractC33429b = (AbstractC33429b<T>) obj;
            if (Intrinsics.areEqual(abstractC33429b.mo72010e(), handler.getClass())) {
                return abstractC33429b;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void install$lambda$2(RNGestureHandlerModule rNGestureHandlerModule) {
        try {
            SoLoader.loadLibrary("gesturehandler");
            JavaScriptContextHolder javaScriptContextHolder = rNGestureHandlerModule.getReactApplicationContext().getJavaScriptContextHolder();
            Intrinsics.checkNotNull(javaScriptContextHolder);
            rNGestureHandlerModule.decorateRuntime(javaScriptContextHolder.get());
        } catch (Exception unused) {
            Log.w("[RNGestureHandler]", "Could not install JSI bindings.");
        }
    }

    private final <T extends Event<T>> void sendEventForReanimated(T event) {
        C43691h c43691h = this.reanimatedEventDispatcher;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        c43691h.m96205a(event, reactApplicationContext);
    }

    private final <T extends GestureHandler<T>> void updateGestureHandlerHelper(int handlerTag, ReadableMap config) {
        AbstractC33429b<T> abstractC33429bFindFactoryForHandler;
        GestureHandler<?> gestureHandlerM97882h = this.registry.m97882h(handlerTag);
        if (gestureHandlerM97882h == null || (abstractC33429bFindFactoryForHandler = findFactoryForHandler(gestureHandlerM97882h)) == null) {
            return;
        }
        this.interactionManager.m72002g(handlerTag);
        this.interactionManager.m72000e(gestureHandlerM97882h, config);
        abstractC33429bFindFactoryForHandler.mo72006a(gestureHandlerM97882h, config);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void createGestureHandler(@NotNull String handlerName, double handlerTagDouble, @NotNull ReadableMap config) {
        Intrinsics.checkNotNullParameter(handlerName, "handlerName");
        Intrinsics.checkNotNullParameter(config, "config");
        createGestureHandlerHelper(handlerName, (int) handlerTagDouble, config);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "RNGestureHandlerModule";
    }

    @NotNull
    public final C44379e getRegistry() {
        return this.registry;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.registry.m97880f();
        this.interactionManager.m72003h();
        synchronized (this.roots) {
            while (!this.roots.isEmpty()) {
                try {
                    int size = this.roots.size();
                    this.roots.get(0).m72046j();
                    if (this.roots.size() >= size) {
                        throw new IllegalStateException("Expected root helper to get unregistered while tearing down");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        super.invalidate();
    }

    @Override // pb0.InterfaceC43431a
    public void setGestureHandlerState(int handlerTag, int newState) {
        GestureHandler<?> gestureHandlerM97882h = this.registry.m97882h(handlerTag);
        if (gestureHandlerM97882h != null) {
            if (newState == 1) {
                gestureHandlerM97882h.m71730B();
                return;
            }
            if (newState == 2) {
                gestureHandlerM97882h.m71786n();
                return;
            }
            if (newState == 3) {
                gestureHandlerM97882h.m71788o();
            } else if (newState == 4) {
                gestureHandlerM97882h.mo71716j(true);
            } else {
                if (newState != 5) {
                    return;
                }
                gestureHandlerM97882h.m71808z();
            }
        }
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void updateGestureHandler(double handlerTagDouble, @NotNull ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        updateGestureHandlerHelper((int) handlerTagDouble, config);
    }

    public RNGestureHandlerModule(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.eventListener = new C33438k();
        this.handlerFactories = new AbstractC33429b[]{new C33433f(), new C33437j(), new C33431d(), new C33434g(), new C33435h(), new C33436i(), new C33428a(), new C33432e(), new C33430c()};
        this.registry = new C44379e();
        this.interactionManager = new RNGestureHandlerInteractionManager();
        this.roots = new ArrayList();
        this.reanimatedEventDispatcher = new C43691h();
    }

    private final RNGestureHandlerRootHelper findRootHelperForViewAncestor(int viewTag) {
        RNGestureHandlerRootHelper rNGestureHandlerRootHelper;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        int iResolveRootTagFromReactTag = C44375a.m97874b(reactApplicationContext).resolveRootTagFromReactTag(viewTag);
        Object obj = null;
        if (iResolveRootTagFromReactTag < 1) {
            return null;
        }
        synchronized (this.roots) {
            try {
                for (Object obj2 : this.roots) {
                    RNGestureHandlerRootHelper rNGestureHandlerRootHelper2 = (RNGestureHandlerRootHelper) obj2;
                    if ((rNGestureHandlerRootHelper2.getRootView() instanceof ReactRootView) && ((ReactRootView) rNGestureHandlerRootHelper2.getRootView()).getRootViewTag() == iResolveRootTagFromReactTag) {
                        obj = obj2;
                        break;
                    }
                }
                rNGestureHandlerRootHelper = (RNGestureHandlerRootHelper) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rNGestureHandlerRootHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends GestureHandler<T>> void onHandlerUpdate(T handler) {
        AbstractC33429b<T> abstractC33429bFindFactoryForHandler;
        if (handler.getTag() >= 0 && handler.getState() == 4 && (abstractC33429bFindFactoryForHandler = findFactoryForHandler(handler)) != null) {
            if (handler.getActionType() == 1) {
                sendEventForReanimated(RNGestureHandlerEvent.Companion.obtain$default(RNGestureHandlerEvent.INSTANCE, handler, abstractC33429bFindFactoryForHandler.mo72008c(handler), false, 4, null));
                return;
            }
            if (handler.getActionType() == 2) {
                sendEventForNativeAnimatedEvent(RNGestureHandlerEvent.INSTANCE.obtain(handler, abstractC33429bFindFactoryForHandler.mo72008c(handler), true));
            } else if (handler.getActionType() == 3) {
                sendEventForDeviceEvent("onGestureHandlerEvent", RNGestureHandlerEvent.INSTANCE.createEventData(abstractC33429bFindFactoryForHandler.mo72008c(handler)));
            } else if (handler.getActionType() == 4) {
                sendEventForDeviceEvent("onGestureHandlerEvent", RNGestureHandlerEvent.INSTANCE.createEventData(abstractC33429bFindFactoryForHandler.mo72008c(handler)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends GestureHandler<T>> void onStateChange(T handler, int newState, int oldState) {
        AbstractC33429b<T> abstractC33429bFindFactoryForHandler;
        if (handler.getTag() >= 0 && (abstractC33429bFindFactoryForHandler = findFactoryForHandler(handler)) != null) {
            if (handler.getActionType() == 1) {
                sendEventForReanimated(RNGestureHandlerStateChangeEvent.INSTANCE.obtain(handler, newState, oldState, abstractC33429bFindFactoryForHandler.mo72008c(handler)));
                return;
            }
            if (handler.getActionType() != 2 && handler.getActionType() != 3) {
                if (handler.getActionType() == 4) {
                    sendEventForDeviceEvent("onGestureHandlerStateChange", RNGestureHandlerStateChangeEvent.INSTANCE.createEventData(abstractC33429bFindFactoryForHandler.mo72008c(handler), newState, oldState));
                    return;
                }
                return;
            }
            sendEventForDeviceEvent("onGestureHandlerStateChange", RNGestureHandlerStateChangeEvent.INSTANCE.createEventData(abstractC33429bFindFactoryForHandler.mo72008c(handler), newState, oldState));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends GestureHandler<T>> void onTouchEvent(T handler) {
        if (handler.getTag() >= 0) {
            if (handler.getState() == 2 || handler.getState() == 4 || handler.getState() == 0 || handler.getCom.tencent.qcloud.tuicore.TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW java.lang.String() != null) {
                if (handler.getActionType() == 1) {
                    sendEventForReanimated(RNGestureHandlerTouchEvent.INSTANCE.obtain(handler));
                } else if (handler.getActionType() == 4) {
                    sendEventForDeviceEvent("onGestureHandlerEvent", RNGestureHandlerTouchEvent.INSTANCE.createEventData(handler));
                }
            }
        }
    }

    private final void sendEventForDeviceEvent(String eventName, WritableMap data) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        C44375a.m97873a(reactApplicationContext).emit(eventName, data);
    }

    private final <T extends Event<T>> void sendEventForDirectEvent(T event) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        C43690g.m96204a(reactApplicationContext, event);
    }

    private final void sendEventForNativeAnimatedEvent(RNGestureHandlerEvent event) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        C43690g.m96204a(reactApplicationContext, event);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean install() {
        getReactApplicationContext().runOnJSQueueThread(new Runnable() { // from class: sb0.c
            @Override // java.lang.Runnable
            public final void run() {
                RNGestureHandlerModule.install$lambda$2(this.f98035b);
            }
        });
        return true;
    }

    public final void registerRootHelper(@NotNull RNGestureHandlerRootHelper root) {
        Intrinsics.checkNotNullParameter(root, "root");
        synchronized (this.roots) {
            if (!this.roots.contains(root)) {
                this.roots.add(root);
            } else {
                throw new IllegalStateException("Root helper" + root + " already registered");
            }
        }
    }

    public final void unregisterRootHelper(@NotNull RNGestureHandlerRootHelper root) {
        Intrinsics.checkNotNullParameter(root, "root");
        synchronized (this.roots) {
            this.roots.remove(root);
        }
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void flushOperations() {
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void handleClearJSResponder() {
    }
}
