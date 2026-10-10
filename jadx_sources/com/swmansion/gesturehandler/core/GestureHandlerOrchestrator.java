package com.swmansion.gesturehandler.core;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.swmansion.gesturehandler.core.GestureHandler;
import com.swmansion.gesturehandler.core.GestureHandlerOrchestrator;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootHelper;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rb0.InterfaceC43973g;
import rb0.InterfaceC43983q;

/* JADX INFO: compiled from: GestureHandlerOrchestrator.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 j2\u00020\u0001:\u0001kB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\n2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\fJ\u001b\u0010\u0018\u001a\u00020\n2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\fJ#\u0010\u001f\u001a\u00020\n2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u001e\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J\u001b\u0010%\u001a\u00020\n2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002¢\u0006\u0004\b%\u0010\u0016J#\u0010&\u001a\u00020\n2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b(\u0010$J'\u0010-\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J#\u00100\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010/\u001a\u00020+H\u0002¢\u0006\u0004\b0\u00101J/\u00102\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b4\u0010\u001cJ/\u00106\u001a\u00020\u00102\u0006\u00105\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b6\u00107J/\u00108\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b8\u00103J\u0017\u00109\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b9\u0010$J\u0017\u0010:\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b:\u0010$J\u0015\u0010;\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b;\u0010<J!\u0010>\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0018\u00010=2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b>\u0010?J)\u0010B\u001a\u00020\n2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010@\u001a\u00020+2\u0006\u0010A\u001a\u00020+¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\u0010¢\u0006\u0004\bD\u0010EJ\u001f\u0010F\u001a\u00020\u00192\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\bF\u0010GJ\u001f\u0010J\u001a\u00020H2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bJ\u0010KJ\u0015\u0010L\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\bL\u0010MR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\"\u0010Z\u001a\u00020T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bV\u0010YR,\u0010^\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0=j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e`[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R,\u0010_\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0=j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e`[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010]R,\u0010a\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0=j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e`[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010]R\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020+0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010cR\u0016\u0010f\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010eR\u0016\u0010g\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00100R\u0016\u0010h\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010eR\u0016\u0010i\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00100¨\u0006l"}, m90084d2 = {"Lcom/swmansion/gesturehandler/core/GestureHandlerOrchestrator;", "", "Landroid/view/ViewGroup;", "wrapperView", "Lrb0/g;", "handlerRegistry", "Lrb0/q;", "viewConfigHelper", "<init>", "(Landroid/view/ViewGroup;Lrb0/g;Lrb0/q;)V", "", ExifInterface.LONGITUDE_EAST, "()V", CmcdData.Factory.STREAM_TYPE_LIVE, "Lcom/swmansion/gesturehandler/core/GestureHandler;", "handler", "", "u", "(Lcom/swmansion/gesturehandler/core/GestureHandler;)Z", "H", "G", "M", "(Lcom/swmansion/gesturehandler/core/GestureHandler;)V", "k", "z", "Landroid/view/MotionEvent;", "event", "o", "(Landroid/view/MotionEvent;)V", "j", "sourceEvent", "n", "(Lcom/swmansion/gesturehandler/core/GestureHandler;Landroid/view/MotionEvent;)V", "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "x", "(Landroid/view/View;)Z", CmcdData.Factory.STREAMING_FORMAT_HLS, "C", "(Lcom/swmansion/gesturehandler/core/GestureHandler;Landroid/view/View;)V", "y", "", "coords", "", "pointerId", "p", "(Landroid/view/View;[FI)Z", TUIConstants.TIMPush.NOTIFICATION.ACTION, "I", "(Lcom/swmansion/gesturehandler/core/GestureHandler;I)Z", "D", "(Landroid/view/View;[FILandroid/view/MotionEvent;)Z", "q", "viewGroup", "r", "(Landroid/view/ViewGroup;[FILandroid/view/MotionEvent;)Z", "L", "i", "w", "B", "(Landroid/view/MotionEvent;)Z", "Ljava/util/ArrayList;", CmcdData.Factory.STREAMING_FORMAT_SS, "(Landroid/view/View;)Ljava/util/ArrayList;", "newState", "prevState", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "(Lcom/swmansion/gesturehandler/core/GestureHandler;II)V", "v", "()Z", "J", "(Landroid/view/View;Landroid/view/MotionEvent;)Landroid/view/MotionEvent;", "Landroid/graphics/PointF;", "point", "K", "(Landroid/view/View;Landroid/graphics/PointF;)Landroid/graphics/PointF;", "f", "(Landroid/view/View;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/view/ViewGroup;", "b", "Lrb0/g;", "c", "Lrb0/q;", "", "d", "F", "getMinimumAlphaForTraversal", "()F", "(F)V", "minimumAlphaForTraversal", "Lkotlin/collections/ArrayList;", "e", "Ljava/util/ArrayList;", "gestureHandlers", "awaitingHandlers", "g", "preparedHandlers", "Ljava/util/HashSet;", "Ljava/util/HashSet;", "awaitingHandlersTags", "Z", "isHandlingTouch", "handlingChangeSemaphore", "finishedHandlersCleanupScheduled", "activationIndex", "m", "Companion", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGestureHandlerOrchestrator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GestureHandlerOrchestrator.kt\ncom/swmansion/gesturehandler/core/GestureHandlerOrchestrator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,721:1\n1755#2,3:722\n1755#2,3:725\n1755#2,3:728\n1755#2,3:731\n1863#2,2:734\n*S KotlinDebug\n*F\n+ 1 GestureHandlerOrchestrator.kt\ncom/swmansion/gesturehandler/core/GestureHandlerOrchestrator\n*L\n86#1:722,3\n89#1:725,3\n92#1:728,3\n334#1:731,3\n608#1:734,2\n*E\n"})
public final class GestureHandlerOrchestrator {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final PointF f68188n = new PointF();

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final float[] f68189o = new float[2];

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final Matrix f68190p = new Matrix();

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final float[] f68191q = new float[2];

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final Comparator<GestureHandler<?>> f68192r = new Comparator() { // from class: rb0.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return GestureHandlerOrchestrator.m71828t((GestureHandler) obj, (GestureHandler) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ViewGroup wrapperView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC43973g handlerRegistry;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC43983q viewConfigHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public float minimumAlphaForTraversal;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<GestureHandler<?>> gestureHandlers;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<GestureHandler<?>> awaitingHandlers;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<GestureHandler<?>> preparedHandlers;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final HashSet<Integer> awaitingHandlersTags;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean isHandlingTouch;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public int handlingChangeSemaphore;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean finishedHandlersCleanupScheduled;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public int activationIndex;

    /* JADX INFO: compiled from: GestureHandlerOrchestrator.kt */
    @Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001b\u001a\u00020\b2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00182\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u00020\b2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00182\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ'\u0010\u001f\u001a\u00020\b2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00182\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0002¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\u001e\u0010\"R\u0014\u0010#\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010(R\u001e\u0010.\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00180-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, m90084d2 = {"Lcom/swmansion/gesturehandler/core/GestureHandlerOrchestrator$Companion;", "", "<init>", "()V", "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "", "coords", "", "f", "(Landroid/view/View;[F)Z", "", "x", "y", "Landroid/view/ViewGroup;", "parent", "child", "Landroid/graphics/PointF;", "outLocalPoint", "", "g", "(FFLandroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/PointF;)V", "c", "(FFLandroid/view/View;)Z", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "handler", "other", "e", "(Lcom/swmansion/gesturehandler/core/GestureHandler;Lcom/swmansion/gesturehandler/core/GestureHandler;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "d", "", "state", "(I)Z", "DEFAULT_MIN_ALPHA_FOR_TRAVERSAL", "F", "tempPoint", "Landroid/graphics/PointF;", "matrixTransformCoords", "[F", "Landroid/graphics/Matrix;", "inverseMatrix", "Landroid/graphics/Matrix;", "tempCoords", "Ljava/util/Comparator;", "handlersComparator", "Ljava/util/Comparator;", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final boolean m71861b(int state) {
            return state == 3 || state == 1 || state == 5;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m71862c(float x11, float y11, View child) {
            return 0.0f <= x11 && x11 <= ((float) child.getWidth()) && 0.0f <= y11 && y11 <= ((float) child.getHeight());
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final boolean m71860a(GestureHandler<?> a11, GestureHandler<?> b11) {
            return a11 == b11 || a11.mo71747J0(b11) || b11.mo71747J0(a11);
        }

        /* JADX INFO: renamed from: e */
        public final boolean m71864e(GestureHandler<?> handler, GestureHandler<?> other) {
            if (handler != other) {
                return handler.m71751L0(other) || other.mo71749K0(handler);
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public final boolean m71865f(View view, float[] coords) {
            return !((view instanceof ViewGroup) && view.getBackground() == null) && m71862c(coords[0], coords[1], view);
        }

        /* JADX INFO: renamed from: d */
        public final boolean m71863d(GestureHandler<?> handler, GestureHandler<?> other) {
            if (!handler.m71768W(other) || m71860a(handler, other)) {
                return false;
            }
            if (handler != other) {
                if (handler.getIsAwaiting() || handler.getState() == 4) {
                    return handler.mo71745I0(other);
                }
                return true;
            }
            return true;
        }

        /* JADX INFO: renamed from: g */
        public final void m71866g(float x11, float y11, ViewGroup parent, View child, PointF outLocalPoint) {
            float scrollX = (x11 + parent.getScrollX()) - child.getLeft();
            float scrollY = (y11 + parent.getScrollY()) - child.getTop();
            Matrix matrix = child.getMatrix();
            if (!matrix.isIdentity()) {
                float[] fArr = GestureHandlerOrchestrator.f68189o;
                fArr[0] = scrollX;
                fArr[1] = scrollY;
                matrix.invert(GestureHandlerOrchestrator.f68190p);
                GestureHandlerOrchestrator.f68190p.mapPoints(fArr);
                float f11 = fArr[0];
                scrollY = fArr[1];
                scrollX = f11;
            }
            outLocalPoint.set(scrollX, scrollY);
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m71857x(View view) {
        if (view == null) {
            return false;
        }
        if (view == this.wrapperView) {
            return true;
        }
        ViewParent parent = view.getParent();
        while (parent != null && parent != this.wrapperView) {
            parent = parent.getParent();
        }
        return parent == this.wrapperView;
    }

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.core.GestureHandlerOrchestrator$a */
    /* JADX INFO: compiled from: GestureHandlerOrchestrator.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class C33418a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointerEventsConfig.values().length];
            try {
                iArr[PointerEventsConfig.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerEventsConfig.BOX_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerEventsConfig.BOX_NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PointerEventsConfig.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m71826g(GestureHandler gestureHandler) {
        NativeViewGestureHandler nativeViewGestureHandler = (NativeViewGestureHandler) gestureHandler;
        nativeViewGestureHandler.m71786n();
        nativeViewGestureHandler.m71778i();
        nativeViewGestureHandler.m71808z();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m71827m(GestureHandler it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return INSTANCE.m71861b(it.getState()) && !it.getIsAwaiting();
    }

    /* JADX INFO: renamed from: A */
    public final void m71829A(@NotNull GestureHandler<?> handler, int newState, int prevState) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.handlingChangeSemaphore++;
        if (INSTANCE.m71861b(newState)) {
            for (GestureHandler<?> gestureHandler : CollectionsKt.toList(this.awaitingHandlers)) {
                if (INSTANCE.m71864e(gestureHandler, handler) && this.awaitingHandlersTags.contains(Integer.valueOf(gestureHandler.getTag()))) {
                    if (newState == 5) {
                        gestureHandler.m71788o();
                        if (gestureHandler.getState() == 5) {
                            gestureHandler.mo71799u(3, 2);
                        }
                        gestureHandler.m71800u0(false);
                    } else {
                        m71841M(gestureHandler);
                    }
                }
            }
            m71846k();
        }
        if (newState == 4) {
            m71841M(handler);
        } else if (prevState == 4 || prevState == 5) {
            if (handler.getIsActive()) {
                handler.mo71799u(newState, prevState);
            } else if (prevState == 4 && (newState == 3 || newState == 1)) {
                handler.mo71799u(newState, 2);
            }
        } else if (prevState != 0 || newState != 3) {
            handler.mo71799u(newState, prevState);
        }
        this.handlingChangeSemaphore--;
        m71833E();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX INFO: renamed from: B */
    public final boolean m71830B(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.isHandlingTouch = true;
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            m71851q(event);
        } else if (actionMasked == 3) {
            m71845j();
        } else if (actionMasked == 5 || actionMasked == 7) {
            m71851q(event);
        }
        m71849o(event);
        this.isHandlingTouch = false;
        if (this.finishedHandlersCleanupScheduled && this.handlingChangeSemaphore == 0) {
            m71847l();
        }
        return true;
    }

    /* JADX INFO: renamed from: C */
    public final void m71831C(GestureHandler<?> handler, View view) {
        if (this.gestureHandlers.contains(handler)) {
            return;
        }
        this.gestureHandlers.add(handler);
        handler.m71798t0(false);
        handler.m71800u0(false);
        handler.m71796s0(Integer.MAX_VALUE);
        handler.m71785m0(view, this);
    }

    /* JADX INFO: renamed from: D */
    public final boolean m71832D(View view, float[] coords, int pointerId, MotionEvent event) {
        boolean z11;
        ArrayList<GestureHandler<?>> arrayListMo96910a = this.handlerRegistry.mo96910a(view);
        if (arrayListMo96910a != null) {
            synchronized (arrayListMo96910a) {
                try {
                    Iterator<GestureHandler<?>> it = arrayListMo96910a.iterator();
                    Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                    z11 = false;
                    while (it.hasNext()) {
                        GestureHandler<?> next = it.next();
                        if (next.getCom.google.firebase.perf.util.Constants.ENABLE_DISABLE java.lang.String() && next.m71775d0(view, coords[0], coords[1]) && !m71837I(next, event.getAction())) {
                            m71831C(next, view);
                            next.m71753M0(pointerId);
                            z11 = true;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            z11 = false;
        }
        float width = view.getWidth();
        float f11 = coords[0];
        if (0.0f <= f11 && f11 <= width) {
            float height = view.getHeight();
            float f12 = coords[1];
            if (0.0f <= f12 && f12 <= height && m71858y(view) && m71850p(view, coords, pointerId)) {
                return true;
            }
        }
        return z11;
    }

    /* JADX INFO: renamed from: E */
    public final void m71833E() {
        if (this.isHandlingTouch || this.handlingChangeSemaphore != 0) {
            this.finishedHandlersCleanupScheduled = true;
        } else {
            m71847l();
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m71834F(float f11) {
        this.minimumAlphaForTraversal = f11;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m71835G(GestureHandler<?> handler) {
        ArrayList<GestureHandler<?>> arrayList = this.gestureHandlers;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (GestureHandler<?> gestureHandler : arrayList) {
            if (handler.m71768W(gestureHandler) && gestureHandler.getState() == 4 && !INSTANCE.m71860a(handler, gestureHandler) && handler.m71772a0(gestureHandler)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m71836H(GestureHandler<?> handler) {
        ArrayList<GestureHandler<?>> arrayList = this.gestureHandlers;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            GestureHandler gestureHandler = (GestureHandler) it.next();
            if (INSTANCE.m71864e(handler, gestureHandler) && gestureHandler.getState() == 5) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m71837I(GestureHandler<?> handler, int action) {
        return ((handler instanceof HoverGestureHandler) || (handler instanceof RNGestureHandlerRootHelper.C33439a) || !CollectionsKt.listOf((Object[]) new Integer[]{10, 9, 7}).contains(Integer.valueOf(action))) ? false : true;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final MotionEvent m71838J(@Nullable View view, @NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (view != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (!Intrinsics.areEqual(viewGroup, this.wrapperView)) {
                m71838J(viewGroup, event);
            }
            if (viewGroup != null) {
                event.setLocation((event.getX() + viewGroup.getScrollX()) - view.getLeft(), (event.getY() + viewGroup.getScrollY()) - view.getTop());
            }
            if (!view.getMatrix().isIdentity()) {
                Matrix matrix = view.getMatrix();
                Matrix matrix2 = f68190p;
                matrix.invert(matrix2);
                event.transform(matrix2);
            }
        }
        return event;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m71840L(View view, float[] coords, int pointerId, MotionEvent event) {
        int i11 = C33418a.$EnumSwitchMapping$0[this.viewConfigHelper.mo96941c(view).ordinal()];
        if (i11 == 1) {
            return false;
        }
        if (i11 == 2) {
            return m71832D(view, coords, pointerId, event) || INSTANCE.m71865f(view, coords);
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return m71832D(view, coords, pointerId, event) || (view instanceof ViewGroup ? m71852r((ViewGroup) view, coords, pointerId, event) : false) || INSTANCE.m71865f(view, coords);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(view instanceof ViewGroup)) {
            if (view instanceof EditText) {
                return m71832D(view, coords, pointerId, event);
            }
            return false;
        }
        boolean zM71852r = m71852r((ViewGroup) view, coords, pointerId, event);
        if (zM71852r) {
            m71832D(view, coords, pointerId, event);
        }
        return zM71852r;
    }

    /* JADX INFO: renamed from: h */
    public final void m71843h(GestureHandler<?> handler) {
        if (this.awaitingHandlers.contains(handler)) {
            return;
        }
        this.awaitingHandlers.add(handler);
        this.awaitingHandlersTags.add(Integer.valueOf(handler.getTag()));
        handler.m71800u0(true);
        int i11 = this.activationIndex;
        this.activationIndex = i11 + 1;
        handler.m71796s0(i11);
    }

    /* JADX INFO: renamed from: j */
    public final void m71845j() {
        Iterator it = CollectionsKt.reversed(this.awaitingHandlers).iterator();
        while (it.hasNext()) {
            ((GestureHandler) it.next()).m71788o();
        }
        this.preparedHandlers.clear();
        this.preparedHandlers.addAll(this.gestureHandlers);
        Iterator it2 = CollectionsKt.reversed(this.gestureHandlers).iterator();
        while (it2.hasNext()) {
            ((GestureHandler) it2.next()).m71788o();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m71846k() {
        for (GestureHandler gestureHandler : CollectionsKt.toList(this.awaitingHandlers)) {
            if (!gestureHandler.getIsAwaiting()) {
                this.awaitingHandlers.remove(gestureHandler);
                this.awaitingHandlersTags.remove(Integer.valueOf(gestureHandler.getTag()));
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m71847l() {
        for (GestureHandler gestureHandler : CollectionsKt.asReversedMutable(this.gestureHandlers)) {
            if (INSTANCE.m71861b(gestureHandler.getState()) && !gestureHandler.getIsAwaiting()) {
                gestureHandler.m71787n0();
                gestureHandler.m71798t0(false);
                gestureHandler.m71800u0(false);
                gestureHandler.m71796s0(Integer.MAX_VALUE);
            }
        }
        CollectionsKt.removeAll((List) this.gestureHandlers, new Function1() { // from class: rb0.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(GestureHandlerOrchestrator.m71827m((GestureHandler) obj));
            }
        });
        this.finishedHandlersCleanupScheduled = false;
    }

    /* JADX INFO: renamed from: o */
    public final void m71849o(MotionEvent event) {
        this.preparedHandlers.clear();
        this.preparedHandlers.addAll(this.gestureHandlers);
        CollectionsKt.sortWith(this.preparedHandlers, f68192r);
        Iterator<GestureHandler<?>> it = this.preparedHandlers.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            m71848n(it.next(), event);
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m71854u(GestureHandler<?> handler) {
        ArrayList<GestureHandler<?>> arrayList = this.gestureHandlers;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            GestureHandler gestureHandler = (GestureHandler) it.next();
            Companion companion = INSTANCE;
            if (!companion.m71861b(gestureHandler.getState()) && companion.m71864e(handler, gestureHandler)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m71855v() {
        ArrayList<GestureHandler<?>> arrayList = this.gestureHandlers;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            if (((GestureHandler) it.next()).getState() == 4) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m71856w(View view) {
        return !(view instanceof ViewGroup) || this.viewConfigHelper.mo96939a((ViewGroup) view);
    }

    public GestureHandlerOrchestrator(@NotNull ViewGroup wrapperView, @NotNull InterfaceC43973g handlerRegistry, @NotNull InterfaceC43983q viewConfigHelper) {
        Intrinsics.checkNotNullParameter(wrapperView, "wrapperView");
        Intrinsics.checkNotNullParameter(handlerRegistry, "handlerRegistry");
        Intrinsics.checkNotNullParameter(viewConfigHelper, "viewConfigHelper");
        this.wrapperView = wrapperView;
        this.handlerRegistry = handlerRegistry;
        this.viewConfigHelper = viewConfigHelper;
        this.gestureHandlers = new ArrayList<>();
        this.awaitingHandlers = new ArrayList<>();
        this.preparedHandlers = new ArrayList<>();
        this.awaitingHandlersTags = new HashSet<>();
    }

    /* JADX INFO: renamed from: t */
    public static final int m71828t(GestureHandler gestureHandler, GestureHandler gestureHandler2) {
        if ((gestureHandler.getIsActive() && gestureHandler2.getIsActive()) || (gestureHandler.getIsAwaiting() && gestureHandler2.getIsAwaiting())) {
            return Integer.signum(gestureHandler2.getActivationIndex() - gestureHandler.getActivationIndex());
        }
        if (gestureHandler.getIsActive()) {
            return -1;
        }
        if (gestureHandler2.getIsActive()) {
            return 1;
        }
        if (gestureHandler.getIsAwaiting()) {
            return -1;
        }
        if (gestureHandler2.getIsAwaiting()) {
            return 1;
        }
        return 0;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final PointF m71839K(@Nullable View view, @NotNull PointF point) {
        ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(point, "point");
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            } else {
                viewGroup = null;
            }
            if (!Intrinsics.areEqual(viewGroup, this.wrapperView)) {
                m71839K(viewGroup, point);
            }
            if (viewGroup != null) {
                point.x += viewGroup.getScrollX() - view.getLeft();
                point.y += viewGroup.getScrollY() - view.getTop();
            }
            if (!view.getMatrix().isIdentity()) {
                Matrix matrix = view.getMatrix();
                Matrix matrix2 = f68190p;
                matrix.invert(matrix2);
                float[] fArr = f68191q;
                fArr[0] = point.x;
                fArr[1] = point.y;
                matrix2.mapPoints(fArr);
                point.x = fArr[0];
                point.y = fArr[1];
            }
        }
        return point;
    }

    /* JADX INFO: renamed from: M */
    public final void m71841M(GestureHandler<?> handler) {
        if (!m71836H(handler) && !m71835G(handler)) {
            if (m71854u(handler)) {
                m71843h(handler);
                return;
            } else {
                m71859z(handler);
                handler.m71800u0(false);
                return;
            }
        }
        handler.m71788o();
    }

    /* JADX INFO: renamed from: f */
    public final void m71842f(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ArrayList<GestureHandler<?>> arrayListMo96910a = this.handlerRegistry.mo96910a(view);
        if (arrayListMo96910a != null) {
            for (final GestureHandler<?> gestureHandler : arrayListMo96910a) {
                if (gestureHandler instanceof NativeViewGestureHandler) {
                    m71831C(gestureHandler, view);
                    ((NativeViewGestureHandler) gestureHandler).m71763R0(new Function0() { // from class: rb0.f
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GestureHandlerOrchestrator.m71826g(gestureHandler);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m71844i(View view) {
        if (view.getVisibility() == 0 && view.getAlpha() >= this.minimumAlphaForTraversal) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final void m71848n(GestureHandler<?> handler, MotionEvent sourceEvent) {
        boolean z11;
        if (!m71857x(handler.getCom.tencent.qcloud.tuicore.TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW java.lang.String())) {
            handler.m71788o();
            return;
        }
        if (!handler.m71761Q0()) {
            return;
        }
        int actionMasked = sourceEvent.getActionMasked();
        View view = handler.getCom.tencent.qcloud.tuicore.TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW java.lang.String();
        MotionEvent motionEventObtain = MotionEvent.obtain(sourceEvent);
        Intrinsics.checkNotNullExpressionValue(motionEventObtain, "obtain(...)");
        MotionEvent motionEventM71838J = m71838J(view, motionEventObtain);
        if (handler.getNeedsPointerData() && handler.getState() != 0) {
            handler.m71759P0(motionEventM71838J, sourceEvent);
        }
        if (!handler.getIsAwaiting() || actionMasked != 2) {
            if (handler.getState() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            handler.m71767V(motionEventM71838J, sourceEvent);
            if (handler.getIsActive()) {
                if (handler.getShouldResetProgress()) {
                    handler.m71739F0(false);
                    handler.mo71790p0();
                }
                handler.mo71797t(motionEventM71838J);
            }
            if (handler.getNeedsPointerData() && z11) {
                handler.m71759P0(motionEventM71838J, sourceEvent);
            }
            if (actionMasked == 1 || actionMasked == 6 || actionMasked == 10) {
                handler.m71755N0(motionEventM71838J.getPointerId(motionEventM71838J.getActionIndex()));
            }
        }
        motionEventM71838J.recycle();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m71850p(View view, float[] coords, int pointerId) {
        boolean z11 = false;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                ArrayList<GestureHandler<?>> arrayListMo96910a = this.handlerRegistry.mo96910a((View) parent);
                if (arrayListMo96910a != null) {
                    synchronized (arrayListMo96910a) {
                        try {
                            Iterator<GestureHandler<?>> it = arrayListMo96910a.iterator();
                            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                            while (it.hasNext()) {
                                GestureHandler<?> next = it.next();
                                if (next.getCom.google.firebase.perf.util.Constants.ENABLE_DISABLE java.lang.String() && next.m71775d0(view, coords[0], coords[1])) {
                                    m71831C(next, viewGroup);
                                    next.m71753M0(pointerId);
                                    z11 = true;
                                }
                            }
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return z11;
    }

    /* JADX INFO: renamed from: q */
    public final void m71851q(MotionEvent event) {
        int actionIndex = event.getActionIndex();
        int pointerId = event.getPointerId(actionIndex);
        float[] fArr = f68191q;
        fArr[0] = event.getX(actionIndex);
        fArr[1] = event.getY(actionIndex);
        m71840L(this.wrapperView, fArr, pointerId, event);
        m71852r(this.wrapperView, fArr, pointerId, event);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m71852r(ViewGroup viewGroup, float[] coords, int pointerId, MotionEvent event) {
        ViewGroup viewGroup2;
        boolean zM71840L;
        int childCount = viewGroup.getChildCount() - 1;
        while (-1 < childCount) {
            View viewMo96940b = this.viewConfigHelper.mo96940b(viewGroup, childCount);
            if (m71844i(viewMo96940b)) {
                PointF pointF = f68188n;
                Companion companion = INSTANCE;
                viewGroup2 = viewGroup;
                companion.m71866g(coords[0], coords[1], viewGroup2, viewMo96940b, pointF);
                float f11 = coords[0];
                float f12 = coords[1];
                coords[0] = pointF.x;
                coords[1] = pointF.y;
                if (m71856w(viewMo96940b) && !companion.m71862c(coords[0], coords[1], viewMo96940b)) {
                    zM71840L = false;
                } else {
                    zM71840L = m71840L(viewMo96940b, coords, pointerId, event);
                }
                coords[0] = f11;
                coords[1] = f12;
                if (zM71840L) {
                    return true;
                }
            } else {
                viewGroup2 = viewGroup;
            }
            childCount--;
            viewGroup = viewGroup2;
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final ArrayList<GestureHandler<?>> m71853s(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return this.handlerRegistry.mo96910a(view);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m71858y(View view) {
        ViewGroup viewGroup;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return false;
        }
        Matrix matrix = view.getMatrix();
        float[] fArr = f68189o;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        float left = fArr[0] + view.getLeft();
        float top = fArr[1] + view.getTop();
        if (left >= 0.0f && left + view.getWidth() <= viewGroup.getWidth() && top >= 0.0f && top + view.getHeight() <= viewGroup.getHeight()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public final void m71859z(GestureHandler<?> handler) {
        int state = handler.getState();
        handler.m71800u0(false);
        handler.m71798t0(true);
        handler.m71739F0(true);
        int i11 = this.activationIndex;
        this.activationIndex = i11 + 1;
        handler.m71796s0(i11);
        for (GestureHandler gestureHandler : CollectionsKt.asReversedMutable(this.gestureHandlers)) {
            if (INSTANCE.m71863d(gestureHandler, handler)) {
                gestureHandler.m71788o();
            }
        }
        for (GestureHandler gestureHandler2 : CollectionsKt.reversed(this.awaitingHandlers)) {
            if (INSTANCE.m71863d(gestureHandler2, handler)) {
                gestureHandler2.m71800u0(false);
            }
        }
        m71846k();
        if (state != 1 && state != 3) {
            handler.mo71799u(4, 2);
            if (state != 4) {
                handler.mo71799u(5, 4);
                if (state != 5) {
                    handler.mo71799u(0, 5);
                }
            }
        }
    }
}
