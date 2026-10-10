package com.kubi.resources.widget.bubbleseekbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.resources.exception.ComponentException;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$font;
import com.kubi.sdk.res.R$styleable;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.processors.BehaviorProcessor;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: KcSeekBar.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0016\u0018\u00002\u00020\u0001:\f¹\u0001º\u0001»\u0001¼\u0001½\u0001¾\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\b\u0010m\u001a\u00020nH\u0002J\b\u0010o\u001a\u00020nH\u0002J\b\u0010p\u001a\u00020nH\u0002J\u0018\u0010q\u001a\u00020n2\u0006\u0010r\u001a\u00020\n2\u0006\u0010s\u001a\u00020\nH\u0014J\u0010\u0010t\u001a\u00020n2\u0006\u0010u\u001a\u00020vH\u0014J\u0018\u0010w\u001a\u00020n2\u0006\u0010x\u001a\u00020\r2\u0006\u0010u\u001a\u00020vH\u0002J\u0018\u0010y\u001a\u00020n2\u0006\u0010x\u001a\u00020\r2\u0006\u0010u\u001a\u00020vH\u0002J\u0018\u0010z\u001a\u00020n2\u0006\u0010x\u001a\u00020\r2\u0006\u0010u\u001a\u00020vH\u0002J\u0018\u0010{\u001a\u00020n2\u0006\u0010x\u001a\u00020\r2\u0006\u0010u\u001a\u00020vH\u0002J\u0010\u0010|\u001a\u00020n2\u0006\u0010u\u001a\u00020vH\u0002J*\u0010}\u001a\u00020n2\u0006\u0010~\u001a\u00020\n2\u0006\u0010\u007f\u001a\u00020\n2\u0007\u0010\u0080\u0001\u001a\u00020\n2\u0007\u0010\u0081\u0001\u001a\u00020\nH\u0014J\u0012\u0010\u0082\u0001\u001a\u00020n2\u0007\u0010\u0083\u0001\u001a\u00020\nH\u0016J\u0013\u0010\u0084\u0001\u001a\u00020\u00122\b\u0010\u0085\u0001\u001a\u00030\u0086\u0001H\u0016J\u0013\u0010\u0087\u0001\u001a\u00020\u00122\b\u0010\u0085\u0001\u001a\u00030\u0086\u0001H\u0002J\u0013\u0010\u0088\u0001\u001a\u00020\u00122\b\u0010\u0085\u0001\u001a\u00030\u0086\u0001H\u0002J\u0013\u0010\u0089\u0001\u001a\u00020\u00122\b\u0010\u0085\u0001\u001a\u00030\u0086\u0001H\u0002J\t\u0010\u008a\u0001\u001a\u00020nH\u0002J\u0012\u0010\u008b\u0001\u001a\u00020A2\u0007\u0010\u008c\u0001\u001a\u00020\rH\u0002J\u0012\u0010\u008d\u0001\u001a\u00020\r2\u0007\u0010\u008c\u0001\u001a\u00020\rH\u0002J\t\u0010\u008e\u0001\u001a\u00020\rH\u0002J\t\u0010\u008f\u0001\u001a\u00020\rH\u0002J\u0010\u0010\u0090\u0001\u001a\u00020n2\u0007\u0010\u0091\u0001\u001a\u00020\rJ\u0010\u0010\u0092\u0001\u001a\u00020n2\u0007\u0010\u0093\u0001\u001a\u00020\rJ\u0007\u0010\u0094\u0001\u001a\u00020\rJ\u0007\u0010\u0095\u0001\u001a\u00020\rJ\u0010\u0010\u0096\u0001\u001a\u00020n2\u0007\u0010\u0097\u0001\u001a\u00020\rJ\u0007\u0010\u0098\u0001\u001a\u00020\nJ\u0007\u0010\u0099\u0001\u001a\u00020\rJ\t\u0010\u009a\u0001\u001a\u0004\u0018\u00010EJ\u0010\u0010\u009b\u0001\u001a\u00020n2\u0007\u0010\u009c\u0001\u001a\u00020EJ\u0011\u0010\u009d\u0001\u001a\u00020n2\b\u0010\u009c\u0001\u001a\u00030\u009e\u0001J\u0010\u0010\u009f\u0001\u001a\u00020n2\u0007\u0010 \u0001\u001a\u00020CJ\u0010\u0010¡\u0001\u001a\u00020n2\u0007\u0010 \u0001\u001a\u00020GJ\u0012\u0010¢\u0001\u001a\u00020n2\t\b\u0001\u0010£\u0001\u001a\u00020\nJ\u0012\u0010¤\u0001\u001a\u00020n2\t\b\u0001\u0010¥\u0001\u001a\u00020\nJ\u0012\u0010¦\u0001\u001a\u00020n2\t\b\u0001\u0010§\u0001\u001a\u00020\nJ\u0012\u0010¨\u0001\u001a\u00020n2\t\b\u0001\u0010©\u0001\u001a\u00020\nJ\u0010\u0010ª\u0001\u001a\u00020n2\u0007\u0010«\u0001\u001a\u00020\nJ\u0011\u0010¬\u0001\u001a\u00020n2\b\u0010\u00ad\u0001\u001a\u00030®\u0001J\u0018\u0010¯\u0001\u001a\u00020n2\t\u0010°\u0001\u001a\u0004\u0018\u00010\u0012¢\u0006\u0003\u0010±\u0001J\u0010\u0010²\u0001\u001a\u00020n2\u0007\u0010³\u0001\u001a\u00020/J\u0010\u0010µ\u0001\u001a\u00020n2\u0007\u0010¶\u0001\u001a\u00020\u0012J\t\u0010·\u0001\u001a\u00020nH\u0014J\t\u0010¸\u0001\u001a\u00020\u0012H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010$\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010B\u001a\u0004\u0018\u00010CX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u0004\u0018\u00010EX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010F\u001a\u0004\u0018\u00010GX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020LX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020NX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010X\u001a\u0004\u0018\u00010Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\bZ\u0010[R\u001d\u0010^\u001a\u0004\u0018\u00010Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010]\u001a\u0004\b_\u0010[R\u001b\u0010a\u001a\u00020b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010]\u001a\u0004\bc\u0010dR\u001c\u0010f\u001a\u0010\u0012\f\u0012\n h*\u0004\u0018\u00010\n0\n0gX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010i\u001a\u0004\u0018\u00010jX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020lX\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010´\u0001\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006¿\u0001"}, m90084d2 = {"Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar;", "Landroid/view/View;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mRealMin", "", "mMin", "mMax", "mProgress", "isFloatType", "", "mTrackSize", "mSecondTrackSize", "mTrackRadius", "mThumbFillSize", "mThumbRadius", "mThumbRadiusOnDragging", "mFillSize", "mFillColor", "mTrackColor", "mSecondTrackColor", "mThumbColor", "mSectionCount", "isShowSectionMark", "isAutoAdjustSectionMark", "isShowSectionText", "mSectionTextSize", "mSectionTextColor", "mSectionTextPosition", "getMSectionTextPosition$annotations", "()V", "mSectionTextInterval", "isShowThumbText", "mThumbTextSize", "mThumbTextColor", "isTouchToSeek", "isSeekStepSection", "isSeekBySection", "mAnimDuration", "", "isAlwaysShowBubble", "mAlwaysShowBubbleDelay", "isHideBubble", "roundMode", "hideNoTextSectionMark", "mBubbleColor", "mBubbleTextSize", "mBubbleTextColor", "mDelta", "mSectionValue", "mThumbCenterX", "mTrackLength", "mSectionOffset", "isThumbOnDragging", "mTextSpace", "mSectionTextArray", "Landroid/util/SparseArray;", "", "mProgressFormatCallback", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$IProgressFormatCallback;", "mProgressListener", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$OnProgressChangedListener;", "mSectionTextFormatListener", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$ISectionTextFormatListener;", "mLeft", "mRight", "mBsbVibrate", "mPaint", "Landroid/graphics/Paint;", "mRectText", "Landroid/graphics/Rect;", "mCanSeek", "mBubbleHeight", "mBubbleVerticalPadding", "mTouched", "mDebounceTime", "mLastTouchMoveTime", "mSectionTextTopMargin", "mBubbleHorizontal", "mBubbleVertical", "mMediumFont", "Landroid/graphics/Typeface;", "getMMediumFont", "()Landroid/graphics/Typeface;", "mMediumFont$delegate", "Lkotlin/Lazy;", "mRegularFont", "getMRegularFont", "mRegularFont$delegate", "mVibrator", "Landroid/os/Vibrator;", "getMVibrator", "()Landroid/os/Vibrator;", "mVibrator$delegate", "mProcessorVibrator", "Lio/reactivex/processors/BehaviorProcessor;", "kotlin.jvm.PlatformType", "mVibratorDisposable", "Lio/reactivex/disposables/Disposable;", "gestureDetector", "Landroid/view/GestureDetector;", "throttleVibrator", "", "initConfigByPriority", "initSectionTextArray", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "drawTrack", "yTop", "drawSecondTrack", "drawSection", "drawThumbCircle", "drawBubble", "onSizeChanged", "w", CmcdData.Factory.STREAMING_FORMAT_HLS, "oldw", "oldh", "onRtlPropertiesChanged", ViewProps.LAYOUT_DIRECTION, "onTouchEvent", "event", "Landroid/view/MotionEvent;", "onTouchDownEvent", "onTouchMoveEvent", "onTouchUpOrCancelEvent", "autoAdjustSection", "float2String", "value", "formatFloat", "calculateThumbCenterX", "calculateProgress", "setMax", "max", "setMin", "min", "getMin", "getMax", "setProgress", "progress", "getProgress", "getProgressFloat", "getOnProgressChangedListener", "setOnProgressChangedListener", "onProgressChangedListener", "setOnSimpleProgressChangedListener", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$OnSimpleProgressChangedListener;", "setProgressFormatCallback", TUIConstants.TUIChat.CALL_BACK, "setSectionTextFormatCallback", "setTrackColor", "trackColor", "setSecondTrackColor", "secondTrackColor", "setThumbColor", "thumbColor", "setBubbleColor", "bubbleColor", "setSectionCount", "count", "setCustomSectionTextArray", "customSectionTextArray", "Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$CustomSectionTextArray;", "setCanSeek", "canSeek", "(Ljava/lang/Boolean;)V", "setDebounceTime", "millisecond", "isAutoAdjustSectionOnTouchUp", "setAutoAdjustSectionOnTouchUp", "enabled", "onDetachedFromWindow", "isRtl", "TextPosition", "ISectionTextFormatListener", "OnProgressChangedListener", "IProgressFormatCallback", "OnProgressChangedListenerAdapter", "OnSimpleProgressChangedListener", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKcSeekBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KcSeekBar.kt\ncom/kubi/resources/widget/bubbleseekbar/KcSeekBar\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ComponentIssue.kt\ncom/kubi/resources/exception/ComponentIssueKt\n*L\n1#1,1027:1\n1#2:1028\n44#3,2:1029\n*S KotlinDebug\n*F\n+ 1 KcSeekBar.kt\ncom/kubi/resources/widget/bubbleseekbar/KcSeekBar\n*L\n335#1:1029,2\n*E\n"})
public class KcSeekBar extends View {

    /* JADX INFO: renamed from: A */
    public int f44277A;

    /* JADX INFO: renamed from: B */
    public int f44278B;

    /* JADX INFO: renamed from: C */
    public boolean f44279C;

    /* JADX INFO: renamed from: D */
    public boolean f44280D;

    /* JADX INFO: renamed from: E */
    public boolean f44281E;

    /* JADX INFO: renamed from: F */
    public long f44282F;

    /* JADX INFO: renamed from: G */
    public boolean f44283G;

    /* JADX INFO: renamed from: H */
    public long f44284H;

    /* JADX INFO: renamed from: I */
    public boolean f44285I;

    /* JADX INFO: renamed from: J */
    public final int f44286J;

    /* JADX INFO: renamed from: K */
    public final boolean f44287K;

    /* JADX INFO: renamed from: L */
    public int f44288L;

    /* JADX INFO: renamed from: M */
    public int f44289M;

    /* JADX INFO: renamed from: N */
    public int f44290N;

    /* JADX INFO: renamed from: O */
    public float f44291O;

    /* JADX INFO: renamed from: P */
    public float f44292P;

    /* JADX INFO: renamed from: Q */
    public float f44293Q;

    /* JADX INFO: renamed from: R */
    public float f44294R;

    /* JADX INFO: renamed from: S */
    public float f44295S;

    /* JADX INFO: renamed from: T */
    public boolean f44296T;

    /* JADX INFO: renamed from: U */
    public int f44297U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public SparseArray<String> f44298V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public InterfaceC23002a f44299W;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public InterfaceC23004c f44300a0;

    /* JADX INFO: renamed from: b */
    public float f44301b;

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public InterfaceC23003b f44302b0;

    /* JADX INFO: renamed from: c */
    public float f44303c;

    /* JADX INFO: renamed from: c0 */
    public float f44304c0;

    /* JADX INFO: renamed from: d */
    public float f44305d;

    /* JADX INFO: renamed from: d0 */
    public float f44306d0;

    /* JADX INFO: renamed from: e */
    public float f44307e;

    /* JADX INFO: renamed from: e0 */
    public boolean f44308e0;

    /* JADX INFO: renamed from: f */
    public boolean f44309f;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public Paint f44310f0;

    /* JADX INFO: renamed from: g */
    public int f44311g;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public Rect f44312g0;

    /* JADX INFO: renamed from: h */
    public int f44313h;

    /* JADX INFO: renamed from: h0 */
    public boolean f44314h0;

    /* JADX INFO: renamed from: i */
    public int f44315i;

    /* JADX INFO: renamed from: i0 */
    public float f44316i0;

    /* JADX INFO: renamed from: j */
    public int f44317j;

    /* JADX INFO: renamed from: j0 */
    public float f44318j0;

    /* JADX INFO: renamed from: k */
    public int f44319k;

    /* JADX INFO: renamed from: k0 */
    public boolean f44320k0;

    /* JADX INFO: renamed from: l */
    public int f44321l;

    /* JADX INFO: renamed from: l0 */
    public long f44322l0;

    /* JADX INFO: renamed from: m */
    public int f44323m;

    /* JADX INFO: renamed from: m0 */
    public long f44324m0;

    /* JADX INFO: renamed from: n */
    public int f44325n;

    /* JADX INFO: renamed from: n0 */
    public float f44326n0;

    /* JADX INFO: renamed from: o */
    public int f44327o;

    /* JADX INFO: renamed from: o0 */
    public int f44328o0;

    /* JADX INFO: renamed from: p */
    public int f44329p;

    /* JADX INFO: renamed from: p0 */
    public int f44330p0;

    /* JADX INFO: renamed from: q */
    public int f44331q;

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final Lazy f44332q0;

    /* JADX INFO: renamed from: r */
    public int f44333r;

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f44334r0;

    /* JADX INFO: renamed from: s */
    public boolean f44335s;

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f44336s0;

    /* JADX INFO: renamed from: t */
    public boolean f44337t;

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final BehaviorProcessor<Integer> f44338t0;

    /* JADX INFO: renamed from: u */
    public boolean f44339u;

    /* JADX INFO: renamed from: u0 */
    @Nullable
    public Disposable f44340u0;

    /* JADX INFO: renamed from: v */
    public int f44341v;

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final GestureDetector f44342v0;

    /* JADX INFO: renamed from: w */
    public int f44343w;

    /* JADX INFO: renamed from: w0 */
    public boolean f44344w0;

    /* JADX INFO: renamed from: x */
    public int f44345x;

    /* JADX INFO: renamed from: y */
    public int f44346y;

    /* JADX INFO: renamed from: z */
    public boolean f44347z;

    /* JADX INFO: renamed from: com.kubi.resources.widget.bubbleseekbar.KcSeekBar$a */
    /* JADX INFO: compiled from: KcSeekBar.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$IProgressFormatCallback;", "", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "", "intValue", "", "floatValue", "", "isFloat", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC23002a {
        @NotNull
        /* JADX INFO: renamed from: a */
        String mo21944a(int i11, float f11, boolean z11);
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.bubbleseekbar.KcSeekBar$b */
    /* JADX INFO: compiled from: KcSeekBar.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$ISectionTextFormatListener;", "", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "", "intValue", "", "floatValue", "", "isFloat", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC23003b {
        @NotNull
        /* JADX INFO: renamed from: a */
        String mo21946a(int i11, float f11, boolean z11);
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.bubbleseekbar.KcSeekBar$c */
    /* JADX INFO: compiled from: KcSeekBar.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\"\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$OnProgressChangedListener;", "", "onProgressChanged", "", "bubbleSeekBar", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar;", "progress", "", "progressFloat", "", "fromUser", "", "getProgressOnActionUp", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC23004c {
        /* JADX INFO: renamed from: a */
        void mo55022a(@Nullable KcSeekBar kcSeekBar, int i11, float f11, boolean z11);

        /* JADX INFO: renamed from: b */
        void mo25745b(@Nullable KcSeekBar kcSeekBar, int i11, float f11);
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.bubbleseekbar.KcSeekBar$e */
    /* JADX INFO: compiled from: KcSeekBar.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, m90084d2 = {"com/kubi/resources/widget/bubbleseekbar/KcSeekBar$gestureDetector$1", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "onDown", "", "e", "Landroid/view/MotionEvent;", "onScroll", "e1", "e2", "distanceX", "", "distanceY", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C23006e extends GestureDetector.SimpleOnGestureListener {
        public C23006e() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e11) {
            Intrinsics.checkNotNullParameter(e11, "e");
            return KcSeekBar.this.m55006A(e11);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent e11, MotionEvent e12, float distanceX, float distanceY) {
            Intrinsics.checkNotNullParameter(e12, "e2");
            return KcSeekBar.this.m55007B(e12);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KcSeekBar(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: B */
    public final boolean m55007B(MotionEvent motionEvent) {
        this.f44320k0 = true;
        this.f44296T = true;
        float x11 = motionEvent.getX();
        this.f44293Q = x11;
        float f11 = this.f44304c0;
        if (x11 < f11) {
            this.f44293Q = f11;
        }
        float f12 = this.f44293Q;
        float f13 = this.f44306d0;
        if (f12 > f13) {
            this.f44293Q = f13;
        }
        float fM55011l = m55011l();
        if (fM55011l != this.f44307e) {
            this.f44307e = fM55011l;
            invalidate();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f44324m0 > this.f44322l0) {
                this.f44324m0 = jCurrentTimeMillis;
                int progress = getProgress();
                InterfaceC23004c interfaceC23004c = this.f44300a0;
                if (interfaceC23004c != null) {
                    interfaceC23004c.mo55022a(this, progress, getProgressFloat(), true);
                }
                if (this.f44308e0) {
                    this.f44338t0.offer(Integer.valueOf(progress));
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m55008C(MotionEvent motionEvent) {
        this.f44320k0 = false;
        getParent().requestDisallowInterceptTouchEvent(false);
        if (this.f44296T && !this.f44344w0) {
            invalidate();
        } else {
            m55010k();
        }
        this.f44296T = false;
        InterfaceC23004c interfaceC23004c = this.f44300a0;
        if (interfaceC23004c != null) {
            interfaceC23004c.mo55022a(this, getProgress(), getProgressFloat(), true);
            interfaceC23004c.mo25745b(this, getProgress(), getProgressFloat());
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final void m55010k() {
        float f11 = 0.0f;
        int i11 = 0;
        while (i11 <= this.f44333r) {
            float f12 = this.f44295S;
            f11 = (i11 * f12) + this.f44304c0;
            float f13 = this.f44293Q;
            if (f11 <= f13 && f13 - f11 <= f12) {
                break;
            } else {
                i11++;
            }
        }
        float f14 = this.f44293Q - f11;
        float f15 = this.f44295S;
        if (f14 > f15 / 2.0f) {
            f11 = ((i11 + 1) * f15) + this.f44304c0;
        }
        this.f44293Q = f11;
        this.f44307e = m55011l();
        invalidate();
        InterfaceC23004c interfaceC23004c = this.f44300a0;
        if (interfaceC23004c != null) {
            interfaceC23004c.mo55022a(this, getProgress(), getProgressFloat(), true);
        }
    }

    /* JADX INFO: renamed from: s */
    public final float m55018s(float f11) {
        try {
            return BigDecimal.valueOf(f11).setScale(4, this.f44286J).floatValue();
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.bubbleseekbar.KcSeekBar$d */
    /* JADX INFO: compiled from: KcSeekBar.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010\u000e\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$OnSimpleProgressChangedListener;", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$OnProgressChangedListener;", "<init>", "()V", "onProgressChanged", "", "bubbleSeekBar", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar;", "progress", "", "progressFloat", "", "fromUser", "", "getProgressOnActionUp", "onChanged", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static abstract class AbstractC23005d implements InterfaceC23004c {
        /* JADX INFO: renamed from: c */
        public abstract void mo21945c(int i11, float f11);

        @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar.InterfaceC23004c
        /* JADX INFO: renamed from: a */
        public void mo55022a(@Nullable KcSeekBar kcSeekBar, int i11, float f11, boolean z11) {
            mo21945c(i11, f11);
        }

        @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar.InterfaceC23004c
        /* JADX INFO: renamed from: b */
        public void mo25745b(@Nullable KcSeekBar kcSeekBar, int i11, float f11) {
            mo21945c(i11, f11);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KcSeekBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final Typeface getMMediumFont() {
        return (Typeface) this.f44332q0.getValue();
    }

    private final Typeface getMRegularFont() {
        return (Typeface) this.f44334r0.getValue();
    }

    private final Vibrator getMVibrator() {
        return (Vibrator) this.f44336s0.getValue();
    }

    /* JADX INFO: renamed from: D */
    public final void m55009D() {
        if (this.f44308e0) {
            Disposable disposable = this.f44340u0;
            if (disposable != null) {
                disposable.dispose();
            }
            Flowable<Integer> flowableDistinctUntilChanged = this.f44338t0.distinctUntilChanged();
            final Function1 function1 = new Function1() { // from class: com.kubi.resources.widget.bubbleseekbar.h
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KcSeekBar.m54988E(this.f44394b, (Integer) obj);
                }
            };
            Consumer<? super Integer> consumer = new Consumer() { // from class: com.kubi.resources.widget.bubbleseekbar.i
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    KcSeekBar.m54989F(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.resources.widget.bubbleseekbar.j
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KcSeekBar.m54990G((Throwable) obj);
                }
            };
            this.f44340u0 = flowableDistinctUntilChanged.subscribe(consumer, new Consumer() { // from class: com.kubi.resources.widget.bubbleseekbar.k
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    KcSeekBar.m54991H(function2, obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: getMax, reason: from getter */
    public final float getF44305d() {
        return this.f44305d;
    }

    /* JADX INFO: renamed from: getMin, reason: from getter */
    public final float getF44303c() {
        return this.f44303c;
    }

    @Nullable
    /* JADX INFO: renamed from: getOnProgressChangedListener, reason: from getter */
    public final InterfaceC23004c getF44300a0() {
        return this.f44300a0;
    }

    public final int getProgress() {
        return (int) (RangesKt.coerceAtMost(RangesKt.coerceAtLeast(this.f44307e, this.f44301b), this.f44305d) + 0.5f);
    }

    public final float getProgressFloat() {
        return m55018s(RangesKt.coerceAtMost(RangesKt.coerceAtLeast(this.f44307e, this.f44301b), this.f44305d));
    }

    /* JADX INFO: renamed from: n */
    public final void m55013n(Canvas canvas) {
        String plainString;
        if (this.f44320k0) {
            this.f44320k0 = false;
            this.f44310f0.setColor(this.f44288L);
            InterfaceC23002a interfaceC23002a = this.f44299W;
            if (interfaceC23002a != null) {
                Intrinsics.checkNotNull(interfaceC23002a);
                plainString = interfaceC23002a.mo21944a(getProgress(), getProgressFloat(), this.f44309f);
            } else {
                plainString = this.f44309f ? C6447a.m11724a(new BigDecimal(String.valueOf(getProgressFloat())).setScale(2, RoundingMode.UP)).toPlainString() : String.valueOf(getProgress());
            }
            this.f44310f0.setTextAlign(Paint.Align.CENTER);
            this.f44310f0.setTextSize(this.f44289M);
            Typeface mMediumFont = getMMediumFont();
            if (mMediumFont != null) {
                this.f44310f0.setTypeface(mMediumFont);
            }
            float fMeasureText = (this.f44310f0.measureText(plainString) + (this.f44328o0 * 2.0f)) / 2.0f;
            Paint.FontMetrics fontMetrics = this.f44310f0.getFontMetrics();
            float f11 = this.f44316i0 / 2.0f;
            float f12 = fontMetrics.descent;
            float f13 = (f11 + ((f12 - fontMetrics.ascent) / 2.0f)) - f12;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            float fM66565c = C27025c.m66565c(context, 4);
            float fCoerceIn = RangesKt.coerceIn(this.f44293Q, fMeasureText, getWidth() - fMeasureText);
            canvas.drawRoundRect(fCoerceIn - fMeasureText, 0.0f, fCoerceIn + fMeasureText, this.f44316i0, fM66565c, fM66565c, this.f44310f0);
            this.f44310f0.setColor(this.f44290N);
            canvas.drawText(plainString, fCoerceIn, f13, this.f44310f0);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m55014o(float f11, Canvas canvas) {
        this.f44310f0.setColor(this.f44327o);
        this.f44310f0.setStrokeWidth(this.f44311g);
        if (m55021v()) {
            canvas.drawLine(this.f44293Q, f11, this.f44304c0, f11, this.f44310f0);
        } else {
            canvas.drawLine(this.f44293Q, f11, this.f44306d0, f11, this.f44310f0);
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float paddingTop = getPaddingTop() + this.f44321l + this.f44316i0 + this.f44318j0;
        m55017r(paddingTop, canvas);
        m55014o(paddingTop, canvas);
        m55015p(paddingTop, canvas);
        m55016q(paddingTop, canvas);
        m55013n(canvas);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.f44314h0) {
            return false;
        }
        if (event.getActionMasked() != 1 && event.getActionMasked() != 3) {
            return this.f44342v0.onTouchEvent(event);
        }
        m55008C(event);
        return this.f44342v0.onTouchEvent(event);
    }

    /* JADX INFO: renamed from: p */
    public final void m55015p(float f11, Canvas canvas) {
        int i11 = 0;
        boolean z11 = this.f44339u && this.f44345x == 2;
        if (!z11 && !this.f44335s) {
            return;
        }
        this.f44310f0.setTextSize(this.f44341v);
        this.f44310f0.getTextBounds("0123456789", 0, 10, this.f44312g0);
        float fHeight = this.f44312g0.height() + f11 + this.f44321l + this.f44297U;
        float fAbs = m55021v() ? this.f44306d0 - ((this.f44294R / this.f44291O) * Math.abs(this.f44307e - this.f44303c)) : this.f44304c0 + ((this.f44294R / this.f44291O) * Math.abs(this.f44307e - this.f44303c));
        int i12 = this.f44333r;
        if (i12 < 0) {
            return;
        }
        while (true) {
            if (!this.f44287K || !TextUtils.isEmpty(this.f44298V.get(i11))) {
                float measuredWidth = this.f44304c0 + (i11 * this.f44295S);
                this.f44310f0.setColor(this.f44325n);
                canvas.drawCircle(measuredWidth, f11, this.f44315i, this.f44310f0);
                if (m55021v()) {
                    this.f44310f0.setColor(measuredWidth <= fAbs ? this.f44327o : this.f44329p);
                } else {
                    this.f44310f0.setColor(measuredWidth <= fAbs ? this.f44329p : this.f44327o);
                }
                canvas.drawCircle(measuredWidth, f11, this.f44315i - this.f44323m, this.f44310f0);
                if (z11) {
                    this.f44310f0.setColor(this.f44343w);
                    Typeface mRegularFont = getMRegularFont();
                    if (mRegularFont != null) {
                        this.f44310f0.setTypeface(mRegularFont);
                    }
                    if (this.f44298V.get(i11, null) != null) {
                        if (i11 == 0) {
                            measuredWidth = getPaddingStart();
                            this.f44310f0.setTextAlign(Paint.Align.LEFT);
                        } else if (i11 == this.f44333r) {
                            measuredWidth = getMeasuredWidth() - getPaddingEnd();
                            this.f44310f0.setTextAlign(Paint.Align.RIGHT);
                        } else {
                            this.f44310f0.setTextAlign(Paint.Align.CENTER);
                        }
                        canvas.drawText(this.f44298V.get(i11), measuredWidth, this.f44326n0 + fHeight, this.f44310f0);
                    }
                }
            }
            if (i11 == i12) {
                return;
            } else {
                i11++;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m55016q(float f11, Canvas canvas) {
        this.f44310f0.setColor(this.f44331q);
        canvas.drawCircle(this.f44293Q, f11, this.f44296T ? this.f44321l : this.f44319k, this.f44310f0);
        this.f44310f0.setColor(this.f44325n);
        canvas.drawCircle(this.f44293Q, f11, (this.f44296T ? this.f44321l : this.f44319k) - this.f44317j, this.f44310f0);
    }

    /* JADX INFO: renamed from: r */
    public final void m55017r(float f11, Canvas canvas) {
        this.f44310f0.setColor(this.f44329p);
        this.f44310f0.setStrokeWidth(this.f44313h);
        if (m55021v()) {
            canvas.drawLine(this.f44306d0, f11, this.f44293Q, f11, this.f44310f0);
        } else {
            canvas.drawLine(this.f44304c0, f11, this.f44293Q, f11, this.f44310f0);
        }
    }

    public final void setAutoAdjustSectionOnTouchUp(boolean enabled) {
        this.f44344w0 = enabled;
    }

    public final void setBubbleColor(@ColorInt int bubbleColor) {
        if (this.f44288L != bubbleColor) {
            this.f44288L = bubbleColor;
            invalidate();
        }
    }

    public final void setCustomSectionTextArray(@NotNull BubbleSeekBar.InterfaceC22997i customSectionTextArray) {
        Intrinsics.checkNotNullParameter(customSectionTextArray, "customSectionTextArray");
        SparseArray<String> sparseArrayMo40278a = customSectionTextArray.mo40278a(this.f44333r, this.f44298V);
        Intrinsics.checkNotNullExpressionValue(sparseArrayMo40278a, "onCustomize(...)");
        this.f44298V = sparseArrayMo40278a;
        int i11 = this.f44333r;
        if (i11 >= 0) {
            int i12 = 0;
            while (true) {
                if (this.f44298V.get(i12) == null) {
                    this.f44298V.put(i12, "");
                }
                if (i12 == i11) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        this.f44347z = false;
        requestLayout();
        invalidate();
    }

    public final void setDebounceTime(long millisecond) {
        this.f44322l0 = millisecond;
    }

    public final void setMax(float max) {
        this.f44305d = max;
        this.f44291O = max - this.f44303c;
        invalidate();
    }

    public final void setMin(float min) {
        this.f44303c = min;
        this.f44291O = this.f44305d - min;
        invalidate();
    }

    public final void setOnProgressChangedListener(@NotNull InterfaceC23004c onProgressChangedListener) {
        Intrinsics.checkNotNullParameter(onProgressChangedListener, "onProgressChangedListener");
        this.f44300a0 = onProgressChangedListener;
    }

    public final void setOnSimpleProgressChangedListener(@NotNull AbstractC23005d onProgressChangedListener) {
        Intrinsics.checkNotNullParameter(onProgressChangedListener, "onProgressChangedListener");
        this.f44300a0 = onProgressChangedListener;
    }

    public final void setProgress(float progress) {
        if (this.f44320k0 || this.f44307e == progress) {
            return;
        }
        this.f44307e = progress;
        float f11 = this.f44305d;
        if (progress > f11) {
            this.f44307e = f11;
        } else if (progress <= this.f44301b) {
            this.f44307e = this.f44303c;
        } else {
            this.f44307e = (int) (progress + 0.5f);
        }
        this.f44293Q = m55012m();
        postInvalidate();
    }

    public final void setProgressFormatCallback(@NotNull InterfaceC23002a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f44299W = callback;
    }

    public final void setSecondTrackColor(@ColorInt int secondTrackColor) {
        if (this.f44329p != secondTrackColor) {
            this.f44329p = secondTrackColor;
            invalidate();
        }
    }

    public final void setSectionCount(int count) {
        this.f44333r = count;
        this.f44292P = this.f44291O / count;
        m55020u();
        invalidate();
    }

    public final void setSectionTextFormatCallback(@NotNull InterfaceC23003b callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f44302b0 = callback;
    }

    public final void setThumbColor(@ColorInt int thumbColor) {
        if (this.f44331q != thumbColor) {
            this.f44331q = thumbColor;
            invalidate();
        }
    }

    public final void setTrackColor(@ColorInt int trackColor) {
        if (this.f44327o != trackColor) {
            this.f44327o = trackColor;
            invalidate();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m55019t() {
        if (this.f44303c == this.f44305d) {
            this.f44303c = 0.0f;
            this.f44305d = 100.0f;
        }
        float f11 = this.f44303c;
        float f12 = this.f44305d;
        if (f11 > f12) {
            this.f44305d = f11;
            this.f44303c = f12;
        }
        float f13 = this.f44307e;
        float f14 = this.f44303c;
        if (f13 < f14) {
            this.f44307e = f14;
        }
        float f15 = this.f44307e;
        float f16 = this.f44305d;
        if (f15 > f16) {
            this.f44307e = f16;
        }
        int i11 = this.f44313h;
        int i12 = this.f44311g;
        if (i11 < i12) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.f44313h = i12 + ((int) C27025c.m66565c(context, 2));
        }
        int i13 = this.f44319k;
        int i14 = this.f44313h;
        if (i13 <= i14) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            this.f44319k = i14 + ((int) C27025c.m66565c(context2, 2));
        }
        int i15 = this.f44321l;
        int i16 = this.f44313h;
        if (i15 <= i16) {
            this.f44321l = i16 * 2;
        }
        if (this.f44333r <= 0) {
            this.f44333r = 10;
        }
        float f17 = this.f44305d - this.f44303c;
        this.f44291O = f17;
        this.f44292P = f17 / this.f44333r;
        int i17 = this.f44345x;
        if (i17 != -1) {
            this.f44339u = true;
        }
        if (this.f44339u) {
            if (i17 == -1) {
                this.f44345x = 0;
            }
            if (this.f44345x == 2) {
                this.f44335s = true;
            }
        }
        if (this.f44346y < 1) {
            this.f44346y = 1;
        }
        m55020u();
        if (this.f44280D) {
            this.f44281E = false;
            this.f44337t = false;
        }
        if (this.f44337t && !this.f44335s) {
            this.f44337t = false;
        }
        if (this.f44281E) {
            this.f44335s = true;
            this.f44337t = true;
        }
        if (this.f44285I) {
            this.f44283G = false;
        }
        if (this.f44283G) {
            setProgress(this.f44307e);
        }
        this.f44277A = (this.f44309f || this.f44281E || (this.f44339u && this.f44345x == 2)) ? this.f44341v : this.f44277A;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0076 A[PHI: r4
      0x0076: PHI (r4v10 float) = (r4v9 float), (r4v9 float), (r4v9 float), (r4v18 float), (r4v20 float) binds: [B:36:0x006f, B:38:0x0073, B:29:0x0051, B:35:0x0067, B:34:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX INFO: renamed from: u */
    public final void m55020u() {
        float fCoerceAtLeast;
        InterfaceC23003b interfaceC23003b;
        String strMo21946a;
        if (!this.f44339u) {
            return;
        }
        int i11 = 0;
        boolean z11 = this.f44345x == 2;
        boolean z12 = this.f44346y > 1 && this.f44333r % 2 == 0;
        int i12 = this.f44333r;
        if (i12 < 0) {
            return;
        }
        while (true) {
            if (this.f44301b <= 0.0f || i11 != 0) {
                fCoerceAtLeast = m55021v() ? RangesKt.coerceAtLeast(this.f44305d - (this.f44292P * i11), this.f44301b) : this.f44303c + (this.f44292P * i11);
            } else {
                fCoerceAtLeast = m55021v() ? this.f44305d : this.f44301b;
            }
            if (z11) {
                if (!z12) {
                    interfaceC23003b = this.f44302b0;
                    if (interfaceC23003b != null) {
                        strMo21946a = interfaceC23003b.mo21946a((int) fCoerceAtLeast, fCoerceAtLeast, this.f44309f);
                    } else {
                        strMo21946a = null;
                    }
                    this.f44298V.put(i11, strMo21946a);
                } else if (i11 % this.f44346y == 0) {
                    fCoerceAtLeast = m55021v() ? this.f44305d - (this.f44292P * i11) : this.f44303c + (this.f44292P * i11);
                    interfaceC23003b = this.f44302b0;
                    if (interfaceC23003b != null) {
                        strMo21946a = interfaceC23003b.mo21946a((int) fCoerceAtLeast, fCoerceAtLeast, this.f44309f);
                    } else {
                        strMo21946a = null;
                    }
                    this.f44298V.put(i11, strMo21946a);
                }
            } else if (i11 == 0 || i11 == this.f44333r) {
                interfaceC23003b = this.f44302b0;
                if (interfaceC23003b != null) {
                    strMo21946a = interfaceC23003b.mo21946a((int) fCoerceAtLeast, fCoerceAtLeast, this.f44309f);
                } else {
                    strMo21946a = null;
                }
                this.f44298V.put(i11, strMo21946a);
            }
            if (i11 == i12) {
                return;
            } else {
                i11++;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KcSeekBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44345x = -1;
        this.f44286J = 4;
        this.f44298V = new SparseArray<>();
        this.f44308e0 = true;
        this.f44314h0 = true;
        this.f44332q0 = LazyKt.lazy(new Function0() { // from class: com.kubi.resources.widget.bubbleseekbar.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KcSeekBar.m55002w(this.f44391b);
            }
        });
        this.f44334r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.resources.widget.bubbleseekbar.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KcSeekBar.m55003x(this.f44392b);
            }
        });
        this.f44336s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.resources.widget.bubbleseekbar.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KcSeekBar.m55004y(this.f44393b);
            }
        });
        BehaviorProcessor<Integer> behaviorProcessorCreate = BehaviorProcessor.create();
        Intrinsics.checkNotNullExpressionValue(behaviorProcessorCreate, "create(...)");
        this.f44338t0 = behaviorProcessorCreate;
        this.f44342v0 = new GestureDetector(getContext(), new C23006e());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BubbleSeekBar, i11, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f44301b = typedArrayObtainStyledAttributes.getFloat(R$styleable.BubbleSeekBar_bsb_real_min, 0.0f);
        this.f44303c = typedArrayObtainStyledAttributes.getFloat(R$styleable.BubbleSeekBar_bsb_min, 0.0f);
        this.f44305d = typedArrayObtainStyledAttributes.getFloat(R$styleable.BubbleSeekBar_bsb_max, 100.0f);
        this.f44307e = typedArrayObtainStyledAttributes.getFloat(R$styleable.BubbleSeekBar_bsb_progress, this.f44303c);
        this.f44309f = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_is_float_type, false);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_track_size, (int) C27025c.m66565c(context, 2));
        this.f44311g = dimensionPixelSize;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_second_track_size, dimensionPixelSize + ((int) C27025c.m66565c(context, 2)));
        this.f44313h = dimensionPixelSize2;
        this.f44315i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_track_radius, dimensionPixelSize2 + ((int) C27025c.m66565c(context, 2)));
        this.f44317j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_thumb_fill_size, 1);
        this.f44321l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_thumb_radius_on_dragging, this.f44313h * 2);
        this.f44319k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_thumb_radius, 1);
        this.f44333r = typedArrayObtainStyledAttributes.getInteger(R$styleable.BubbleSeekBar_bsb_section_count, 10);
        this.f44323m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_fill_size, (int) C27025c.m66565c(context, 2));
        int i12 = R$styleable.BubbleSeekBar_bsb_fill_color;
        int i13 = R$color.emphasis;
        this.f44325n = typedArrayObtainStyledAttributes.getColor(i12, ContextCompat.getColor(context, i13));
        this.f44327o = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_track_color, ContextCompat.getColor(context, i13));
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_second_track_color, ContextCompat.getColor(context, i13));
        this.f44329p = color;
        this.f44331q = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_thumb_color, color);
        this.f44339u = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_show_section_text, false);
        this.f44341v = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_section_text_size, (int) C27025c.m66565c(context, 14));
        this.f44343w = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_section_text_color, this.f44327o);
        this.f44280D = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_seek_step_section, false);
        this.f44281E = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_seek_by_section, false);
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.BubbleSeekBar_bsb_section_text_position, -1);
        this.f44345x = integer != 0 ? integer != 1 ? integer != 2 ? -1 : 2 : 1 : 0;
        this.f44346y = typedArrayObtainStyledAttributes.getInteger(R$styleable.BubbleSeekBar_bsb_section_text_interval, 1);
        this.f44347z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_show_thumb_text, false);
        this.f44277A = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_thumb_text_size, (int) C27025c.m66565c(context, 14));
        this.f44278B = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_thumb_text_color, this.f44329p);
        this.f44288L = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_bubble_color, this.f44329p);
        this.f44289M = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_bubble_text_size, (int) C27025c.m66565c(context, 14));
        this.f44290N = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_bubble_text_color, -1);
        this.f44335s = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_show_section_mark, false);
        this.f44337t = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_auto_adjust_section_mark, false);
        int integer2 = typedArrayObtainStyledAttributes.getInteger(R$styleable.BubbleSeekBar_bsb_anim_duration, -1);
        this.f44282F = integer2 < 0 ? 200L : integer2;
        this.f44279C = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_touch_to_seek, false);
        this.f44283G = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_always_show_bubble, false);
        int integer3 = typedArrayObtainStyledAttributes.getInteger(R$styleable.BubbleSeekBar_bsb_always_show_bubble_delay, 0);
        this.f44284H = integer3 < 0 ? 0L : integer3;
        this.f44285I = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_hide_bubble, false);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_android_enabled, isEnabled()));
        this.f44318j0 = C27025c.m66565c(context, 4);
        this.f44326n0 = typedArrayObtainStyledAttributes.getDimension(R$styleable.BubbleSeekBar_bsb_section_text_top_margin, 0.0f);
        this.f44328o0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_bubble_padding_horizontal, C27029c.m66601d(this, 6));
        this.f44330p0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_bubble_padding_vertical, C27029c.m66601d(this, 4));
        this.f44308e0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_vibrate, true);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f44310f0 = paint;
        paint.setAntiAlias(true);
        this.f44310f0.setStrokeCap(Paint.Cap.ROUND);
        this.f44310f0.setTextAlign(Paint.Align.CENTER);
        this.f44312g0 = new Rect();
        this.f44297U = (int) C27025c.m66565c(context, 2);
        m55019t();
        m55009D();
    }

    /* JADX INFO: renamed from: E */
    public static final Unit m54988E(KcSeekBar kcSeekBar, Integer num) {
        kcSeekBar.getMVibrator().vibrate(10L);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static final void m54989F(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G */
    public static final Unit m54990G(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C43846g.m96568c(new ComponentException(th2, "KcSeekBar-Vibrator", false, null, 8, null), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public static final void m54991H(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w */
    public static final Typeface m55002w(KcSeekBar kcSeekBar) {
        return ResourcesCompat.getFont(kcSeekBar.getContext(), R$font.medium);
    }

    /* JADX INFO: renamed from: x */
    public static final Typeface m55003x(KcSeekBar kcSeekBar) {
        return ResourcesCompat.getFont(kcSeekBar.getContext(), R$font.regular);
    }

    /* JADX INFO: renamed from: y */
    public static final Vibrator m55004y(KcSeekBar kcSeekBar) {
        Object systemService = kcSeekBar.getContext().getSystemService("vibrator");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        return (Vibrator) systemService;
    }

    /* JADX INFO: renamed from: z */
    public static final void m55005z(KcSeekBar kcSeekBar) {
        kcSeekBar.requestLayout();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m55006A(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f44316i0) {
            invalidate();
            return false;
        }
        this.f44320k0 = true;
        getParent().requestDisallowInterceptTouchEvent(true);
        float x11 = motionEvent.getX();
        this.f44293Q = x11;
        float f11 = this.f44304c0;
        if (x11 < f11) {
            this.f44293Q = f11;
        }
        float f12 = this.f44293Q;
        float f13 = this.f44306d0;
        if (f12 > f13) {
            this.f44293Q = f13;
        }
        this.f44307e = m55011l();
        invalidate();
        if (this.f44308e0) {
            this.f44338t0.offer(Integer.valueOf(getProgress()));
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final float m55011l() {
        float f11;
        float f12;
        if (m55021v()) {
            f11 = ((this.f44306d0 - this.f44293Q) * this.f44291O) / this.f44294R;
            f12 = this.f44303c;
        } else {
            f11 = ((this.f44293Q - this.f44304c0) * this.f44291O) / this.f44294R;
            f12 = this.f44303c;
        }
        return f11 + f12;
    }

    /* JADX INFO: renamed from: m */
    public final float m55012m() {
        if (m55021v()) {
            return this.f44306d0 - ((this.f44294R * (this.f44307e - this.f44303c)) / this.f44291O);
        }
        return this.f44304c0 + ((this.f44294R * (this.f44307e - this.f44303c)) / this.f44291O);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Disposable disposable = this.f44340u0;
        if (disposable != null) {
            disposable.dispose();
        }
        getMVibrator().cancel();
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int iMax = this.f44321l * 2;
        if (this.f44347z) {
            this.f44310f0.setTextSize(this.f44277A);
            this.f44310f0.getTextBounds("j", 0, 1, this.f44312g0);
            iMax += this.f44312g0.height();
        }
        if (this.f44339u && this.f44345x >= 1) {
            this.f44310f0.setTextSize(this.f44341v);
            this.f44310f0.getTextBounds("j", 0, 1, this.f44312g0);
            iMax = Math.max(iMax, (this.f44321l * 2) + this.f44312g0.height() + ((int) (this.f44326n0 + 0.5f)));
        }
        if (this.f44339u) {
            iMax += this.f44297U * 2;
        }
        this.f44310f0.setTextSize(this.f44289M);
        Paint.FontMetrics fontMetrics = this.f44310f0.getFontMetrics();
        float f11 = (fontMetrics.descent - fontMetrics.ascent) + (this.f44330p0 * 2.0f);
        int i11 = iMax + ((int) (this.f44318j0 + f11));
        this.f44316i0 = f11;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setMeasuredDimension(View.resolveSize((int) C27025c.m66565c(context, 180), widthMeasureSpec), i11);
        this.f44304c0 = getPaddingLeft() + this.f44321l;
        float measuredWidth = (getMeasuredWidth() - getPaddingRight()) - this.f44321l;
        this.f44306d0 = measuredWidth;
        float f12 = measuredWidth - this.f44304c0;
        this.f44294R = f12;
        this.f44295S = f12 / this.f44333r;
        float fM55012m = m55012m();
        this.f44293Q = fM55012m;
        float fCoerceAtLeast = RangesKt.coerceAtLeast(fM55012m, this.f44304c0);
        this.f44293Q = fCoerceAtLeast;
        this.f44293Q = RangesKt.coerceAtMost(fCoerceAtLeast, this.f44306d0);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        super.onRtlPropertiesChanged(layoutDirection);
        m55020u();
        invalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        post(new Runnable() { // from class: com.kubi.resources.widget.bubbleseekbar.d
            @Override // java.lang.Runnable
            public final void run() {
                KcSeekBar.m55005z(this.f44390b);
            }
        });
    }

    public final void setCanSeek(@Nullable Boolean canSeek) {
        Intrinsics.checkNotNull(canSeek);
        this.f44314h0 = canSeek.booleanValue();
    }

    /* JADX INFO: renamed from: v */
    public final boolean m55021v() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    private static /* synthetic */ void getMSectionTextPosition$annotations() {
    }
}
