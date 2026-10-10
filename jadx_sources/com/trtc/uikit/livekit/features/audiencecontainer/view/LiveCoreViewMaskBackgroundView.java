package com.trtc.uikit.livekit.features.audiencecontainer.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.google.gson.Gson;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.bugly.proguard.RunnableC33958ua;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import ee0.C37144f;
import io.trtc.tuikit.atomicx.pictureinpicture.PictureInPictureStore;
import io.trtc.tuikit.atomicxcore.api.live.SeatInfo;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p445m2.AbstractC42397h;
import p460n2.InterfaceC42704b;
import p680v1.AbstractC45352c;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.CharsKt;
import p852kotlin.text.StringsKt;
import sc0.C44383a;
import uc0.C45152a;

/* JADX INFO: compiled from: LiveCoreViewMaskBackgroundView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 C2\u00020\u0001:\u0001CB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u001b\u001a\u00020\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u001cH\u0014J\u000e\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\fJ\u0012\u0010 \u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u0007H\u0016J\u0012\u0010$\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u0007H\u0016J\u000e\u0010\u0016\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u0017J\u0012\u0010(\u001a\u00020\u001c2\b\b\u0001\u0010)\u001a\u00020\u0007H\u0016J(\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0007H\u0014J\u0018\u0010/\u001a\u00020\u001c2\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u0007H\u0014J\u0010\u00102\u001a\u00020\u001c2\u0006\u00103\u001a\u000204H\u0014J\u0010\u00105\u001a\u00020\u001c2\u0006\u00103\u001a\u000204H\u0002J\u0018\u00106\u001a\u00020\u001c2\u0006\u00103\u001a\u0002042\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J\u0018\u00107\u001a\u00020\u001c2\u0006\u00103\u001a\u0002042\u0006\u0010!\u001a\u00020\u0010H\u0002J\u0010\u00108\u001a\u0004\u0018\u0001092\u0006\u0010!\u001a\u00020\u0010J\u0010\u0010:\u001a\u00020\u001c2\b\u0010;\u001a\u0004\u0018\u00010<J\u000e\u0010=\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010>\u001a\u00020\u0017J\u0016\u0010?\u001a\u00020\u001c2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020B0AH\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006D"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/LiveCoreViewMaskBackgroundView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "oid", "audienceStore", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;", "parentWidth", "parentHeight", "backgroundDrawable", "Landroid/graphics/drawable/Drawable;", "backgroundColor", "topRect", "Landroid/graphics/Rect;", "middleRect", "bottomRect", "enableBlur", "", "isPortrait", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "onAttachedToWindow", "", "onDetachedFromWindow", "init", "manager", "setImageDrawable", "drawable", "setImageResource", "resId", "setBackground", "background", "setBackgroundResource", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "setBackgroundColor", "color", "onSizeChanged", "w", CmcdData.Factory.STREAMING_FORMAT_HLS, "oldw", "oldh", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "drawableTransparent", "drawableColor", "drawDrawable", "drawableToBitmap", "Landroid/graphics/Bitmap;", "setBackgroundUrl", "url", "", "setPortrait", "isFullScreenLayoutBySeatLayout", "onSeatLayoutChange", "seatList", "", "Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LiveCoreViewMaskBackgroundView extends AppCompatImageView {

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final Companion f78707n = new Companion(null);

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final LiveKitLogger f78708o = LiveKitLogger.f77564c.getFeaturesLogger("LiveCoreViewMaskBackgroundView");

    /* JADX INFO: renamed from: b */
    public final int f78709b;

    /* JADX INFO: renamed from: c */
    public C37144f f78710c;

    /* JADX INFO: renamed from: d */
    public int f78711d;

    /* JADX INFO: renamed from: e */
    public int f78712e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Drawable f78713f;

    /* JADX INFO: renamed from: g */
    public int f78714g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public Rect f78715h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public Rect f78716i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public Rect f78717j;

    /* JADX INFO: renamed from: k */
    public boolean f78718k;

    /* JADX INFO: renamed from: l */
    public boolean f78719l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public InterfaceC41775x1 f78720m;

    /* JADX INFO: compiled from: LiveCoreViewMaskBackgroundView.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/LiveCoreViewMaskBackgroundView$Companion;", "", "<init>", "()V", "BLUR_RADIUS", "", "LOGGER", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.LiveCoreViewMaskBackgroundView$a */
    /* JADX INFO: compiled from: LiveCoreViewMaskBackgroundView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0010\u0010\u0006\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\n"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/LiveCoreViewMaskBackgroundView$setBackgroundUrl$1", "Lcom/bumptech/glide/request/target/SimpleTarget;", "Landroid/graphics/drawable/Drawable;", "onResourceReady", "", InterfaceC33617e1.f69660i, "transition", "Lcom/bumptech/glide/request/transition/Transition;", "onLoadFailed", "errorDrawable", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36230a extends AbstractC42397h<Drawable> {
        public C36230a() {
        }

        @Override // p445m2.InterfaceC42399j
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6639e(Drawable resource, InterfaceC42704b<? super Drawable> interfaceC42704b) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            LiveKitLogger liveKitLogger = LiveCoreViewMaskBackgroundView.f78708o;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onBackgroundUrlChange OID:");
            sb2.append(LiveCoreViewMaskBackgroundView.this.f78709b);
            sb2.append(", roomId:");
            C37144f c37144f = LiveCoreViewMaskBackgroundView.this.f78710c;
            if (c37144f == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audienceStore");
                c37144f = null;
            }
            sb2.append(c37144f.m83096o().getCurrentLive().getValue().getLiveID());
            sb2.append(", resource:");
            sb2.append(resource);
            liveKitLogger.m79404b(sb2.toString());
            LiveCoreViewMaskBackgroundView.this.setImageDrawable(resource);
        }

        @Override // p445m2.AbstractC42390a, p445m2.InterfaceC42399j
        /* JADX INFO: renamed from: i */
        public void mo6640i(Drawable drawable) {
            LiveKitLogger liveKitLogger = LiveCoreViewMaskBackgroundView.f78708o;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onLoadFailed OID:");
            sb2.append(LiveCoreViewMaskBackgroundView.this.f78709b);
            sb2.append(", roomId:");
            C37144f c37144f = LiveCoreViewMaskBackgroundView.this.f78710c;
            if (c37144f == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audienceStore");
                c37144f = null;
            }
            sb2.append(c37144f.m83096o().getCurrentLive().getValue().getLiveID());
            liveKitLogger.m79404b(sb2.toString());
            LiveCoreViewMaskBackgroundView.this.f78713f = null;
            LiveCoreViewMaskBackgroundView.this.setBackgroundColor(0);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.LiveCoreViewMaskBackgroundView$onAttachedToWindow$1 */
    /* JADX INFO: compiled from: LiveCoreViewMaskBackgroundView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.LiveCoreViewMaskBackgroundView$onAttachedToWindow$1", m90122f = "LiveCoreViewMaskBackgroundView.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C362311 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.LiveCoreViewMaskBackgroundView$onAttachedToWindow$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: LiveCoreViewMaskBackgroundView.kt */
        @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.LiveCoreViewMaskBackgroundView$onAttachedToWindow$1$1", m90122f = "LiveCoreViewMaskBackgroundView.kt", m90123i = {}, m90124l = {61}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ LiveCoreViewMaskBackgroundView this$0;

            /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.LiveCoreViewMaskBackgroundView$onAttachedToWindow$1$1$a */
            /* JADX INFO: compiled from: LiveCoreViewMaskBackgroundView.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            public static final class a<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ LiveCoreViewMaskBackgroundView f78722b;

                public a(LiveCoreViewMaskBackgroundView liveCoreViewMaskBackgroundView) {
                    this.f78722b = liveCoreViewMaskBackgroundView;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(List<SeatInfo> list, Continuation<? super Unit> continuation) {
                    this.f78722b.m80963l(list);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LiveCoreViewMaskBackgroundView liveCoreViewMaskBackgroundView, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = liveCoreViewMaskBackgroundView;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.label;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    C37144f c37144f = this.this$0.f78710c;
                    if (c37144f == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("audienceStore");
                        c37144f = null;
                    }
                    InterfaceC41678w<List<SeatInfo>> seatList = c37144f.m83098q().getSeatList();
                    a aVar = new a(this.this$0);
                    this.label = 1;
                    if (seatList.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.LiveCoreViewMaskBackgroundView$onAttachedToWindow$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: LiveCoreViewMaskBackgroundView.kt */
        @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.LiveCoreViewMaskBackgroundView$onAttachedToWindow$1$2", m90122f = "LiveCoreViewMaskBackgroundView.kt", m90123i = {}, m90124l = {66}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ LiveCoreViewMaskBackgroundView this$0;

            /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.LiveCoreViewMaskBackgroundView$onAttachedToWindow$1$2$a */
            /* JADX INFO: compiled from: LiveCoreViewMaskBackgroundView.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            public static final class a<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ LiveCoreViewMaskBackgroundView f78723b;

                public a(LiveCoreViewMaskBackgroundView liveCoreViewMaskBackgroundView) {
                    this.f78723b = liveCoreViewMaskBackgroundView;
                }

                /* JADX INFO: renamed from: a */
                public final Object m80966a(boolean z11, Continuation<? super Unit> continuation) {
                    this.f78723b.setVisibility(z11 ? 8 : 0);
                    return Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return m80966a(((Boolean) obj).booleanValue(), continuation);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(LiveCoreViewMaskBackgroundView liveCoreViewMaskBackgroundView, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = liveCoreViewMaskBackgroundView;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.label;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC41678w<Boolean> interfaceC41678wM103162a = PictureInPictureStore.f87308c.getShared().getF87311b().m103162a();
                    a aVar = new a(this.this$0);
                    this.label = 1;
                    if (interfaceC41678wM103162a.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                throw new KotlinNothingValueException();
            }
        }

        public C362311(Continuation<? super C362311> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C362311 c362311 = LiveCoreViewMaskBackgroundView.this.new C362311(continuation);
            c362311.L$0 = obj;
            return c362311;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C362311) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C41696j.m91104d(interfaceC41709m0, null, null, new AnonymousClass1(LiveCoreViewMaskBackgroundView.this, null), 3, null);
            C41696j.m91104d(interfaceC41709m0, null, null, new AnonymousClass2(LiveCoreViewMaskBackgroundView.this, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveCoreViewMaskBackgroundView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveCoreViewMaskBackgroundView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final Bitmap m80959h(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            return this.f78718k ? C44383a.m97887a(getContext(), bitmap, 20) : bitmap;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            f78708o.m79403a("Drawable dimensions are invalid");
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return this.f78718k ? C44383a.m97887a(getContext(), bitmapCreateBitmap, 20) : bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: i */
    public final void m80960i(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(0);
        canvas.drawRect(new Rect(0, 0, this.f78711d, this.f78712e), paint);
    }

    /* JADX INFO: renamed from: j */
    public final void m80961j(@NotNull C37144f manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.f78710c = manager;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m80962k() {
        C37144f c37144f = this.f78710c;
        if (c37144f == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audienceStore");
            c37144f = null;
        }
        if (c37144f.m83098q().getSeatList().getValue().isEmpty()) {
            return true;
        }
        C37144f c37144f2 = this.f78710c;
        if (c37144f2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audienceStore");
            c37144f2 = null;
        }
        if (c37144f2.m83098q().getSeatList().getValue().size() <= 1) {
            return true;
        }
        C37144f c37144f3 = this.f78710c;
        if (c37144f3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audienceStore");
            c37144f3 = null;
        }
        for (SeatInfo seatInfo : c37144f3.m83098q().getSeatList().getValue()) {
            int w11 = seatInfo.getRegion().getW();
            C37144f c37144f4 = this.f78710c;
            if (c37144f4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audienceStore");
                c37144f4 = null;
            }
            if (w11 == c37144f4.m83098q().getCanvas().getValue().getW()) {
                int h11 = seatInfo.getRegion().getH();
                C37144f c37144f5 = this.f78710c;
                if (c37144f5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("audienceStore");
                    c37144f5 = null;
                }
                if (h11 == c37144f5.m83098q().getCanvas().getValue().getH()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final void m80963l(List<SeatInfo> list) {
        f78708o.m79404b("setSeatLayout OID:" + this.f78709b + ",seatLayout:" + new Gson().toJson(list));
        C37144f c37144f = this.f78710c;
        C37144f c37144f2 = null;
        if (c37144f == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audienceStore");
            c37144f = null;
        }
        if (c37144f.m83098q().getCanvas().getValue().getW() != 0) {
            C37144f c37144f3 = this.f78710c;
            if (c37144f3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audienceStore");
                c37144f3 = null;
            }
            if (c37144f3.m83098q().getCanvas().getValue().getH() != 0 && !list.isEmpty()) {
                C37144f c37144f4 = this.f78710c;
                if (c37144f4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("audienceStore");
                    c37144f4 = null;
                }
                if (c37144f4.m83098q().getCanvas().getValue().getTemplateID() == 200 && this.f78719l) {
                    int iM99800b = C45152a.m99800b(getContext());
                    int iM99799a = C45152a.m99799a(150.0f);
                    int iM99799a2 = ((iM99800b * 9) / 16) + C45152a.m99799a(150.0f);
                    this.f78715h = new Rect(0, 0, this.f78711d, iM99799a);
                    this.f78716i = new Rect(0, iM99799a, this.f78711d, iM99799a2);
                    this.f78717j = new Rect(0, iM99799a2, this.f78711d, this.f78712e);
                    invalidate();
                    return;
                }
                Rect rect = new Rect();
                rect.left = Integer.MAX_VALUE;
                rect.top = Integer.MAX_VALUE;
                rect.right = 0;
                rect.bottom = 0;
                for (SeatInfo seatInfo : list) {
                    rect.left = Math.min(rect.left, seatInfo.getRegion().getX());
                    rect.top = Math.min(rect.top, seatInfo.getRegion().getY());
                    rect.right = Math.max(rect.right, seatInfo.getRegion().getX() + seatInfo.getRegion().getW());
                    rect.bottom = Math.max(rect.bottom, seatInfo.getRegion().getY() + seatInfo.getRegion().getH());
                }
                float f11 = this.f78711d;
                C37144f c37144f5 = this.f78710c;
                if (c37144f5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("audienceStore");
                } else {
                    c37144f2 = c37144f5;
                }
                float w11 = f11 / c37144f2.m83098q().getCanvas().getValue().getW();
                int iWidth = (int) (rect.width() * w11);
                int iHeight = (int) (rect.height() * w11);
                int i11 = (int) (rect.top * w11);
                int i12 = (int) (rect.left * w11);
                f78708o.m79404b("addFillScreenView OID:" + this.f78709b + " l:" + i12 + ",t:" + i11 + ",w:" + iWidth + ",h:" + iHeight);
                this.f78715h = new Rect(0, 0, iWidth, i11);
                int i13 = iHeight + i11;
                this.f78716i = new Rect(0, i11, iWidth, i13);
                this.f78717j = new Rect(0, i13, iWidth, this.f78712e);
                invalidate();
                return;
            }
        }
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        boolean zM80962k = m80962k();
        LiveKitLogger liveKitLogger = f78708o;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onDraw OID:");
        sb2.append(this.f78709b);
        sb2.append(",: isFullScreen:");
        sb2.append(zM80962k);
        sb2.append(", roomId:");
        C37144f c37144f = this.f78710c;
        if (c37144f == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audienceStore");
            c37144f = null;
        }
        sb2.append(c37144f.m83096o().getCurrentLive().getValue().getLiveID());
        sb2.append(", topRect:");
        sb2.append(this.f78715h);
        sb2.append(", middleRect:");
        sb2.append(this.f78716i);
        sb2.append(", bottomRect:");
        sb2.append(this.f78717j);
        sb2.append(",backgroundColor:");
        sb2.append(this.f78714g);
        sb2.append(", backgroundDrawable:");
        sb2.append(this.f78713f);
        liveKitLogger.m79404b(sb2.toString());
        if (zM80962k) {
            m80960i(canvas);
            return;
        }
        Drawable drawable = this.f78713f;
        if (drawable != null) {
            Intrinsics.checkNotNull(drawable);
            m80957f(canvas, drawable);
            return;
        }
        int i11 = this.f78714g;
        if (i11 == 0) {
            m80960i(canvas);
        } else {
            m80958g(canvas, i11);
        }
    }

    @Override // android.view.View
    public void setBackground(@Nullable Drawable background) {
        this.f78713f = background;
        if (background != null) {
            background.setCallback(this);
        }
        invalidate();
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int color) {
        this.f78714g = color;
        invalidate();
    }

    public final void setBackgroundUrl(@Nullable String url) {
        String strSubstring;
        LiveKitLogger liveKitLogger = f78708o;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("setBackgroundUrl OID:");
        sb2.append(this.f78709b);
        sb2.append(", roomId:");
        C37144f c37144f = this.f78710c;
        if (c37144f == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audienceStore");
            c37144f = null;
        }
        sb2.append(c37144f.m83096o().getCurrentLive().getValue().getLiveID());
        sb2.append(", topRect:");
        sb2.append(this.f78715h);
        sb2.append(", middleRect:");
        sb2.append(this.f78716i);
        sb2.append(", bottomRect:");
        sb2.append(this.f78717j);
        sb2.append(",backgroundColor:");
        sb2.append(this.f78714g);
        sb2.append(", backgroundDrawable:");
        sb2.append(this.f78713f);
        sb2.append(", url:");
        sb2.append(url);
        liveKitLogger.m79404b(sb2.toString());
        if (TextUtils.isEmpty(url)) {
            return;
        }
        Intrinsics.checkNotNull(url);
        try {
            if (StringsKt.startsWith$default(url, "0x", false, 2, (Object) null) || StringsKt.startsWith$default(url, "0X", false, 2, (Object) null)) {
                strSubstring = url.substring(2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            } else if (StringsKt.startsWith$default(url, RunnableC33958ua.f72251f, false, 2, (Object) null)) {
                strSubstring = url.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            } else {
                strSubstring = url;
            }
            int i11 = Integer.parseInt(strSubstring, CharsKt.checkRadix(16));
            this.f78713f = null;
            setBackgroundColor(i11);
        } catch (Exception unused) {
            f78708o.m79404b("Exception OID:" + this.f78709b + ", url:" + url);
            this.f78714g = 0;
            ComponentCallbacks2C5309c.m6556t(getContext()).mo6634v(url).mo92200i(AbstractC45352c.f101954a).m6591B0(new C36230a());
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        this.f78713f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        invalidate();
    }

    public final void setPortrait(boolean isPortrait) {
        this.f78719l = isPortrait;
        invalidate();
    }

    public /* synthetic */ LiveCoreViewMaskBackgroundView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: f */
    public final void m80957f(Canvas canvas, Drawable drawable) {
        if (m80962k()) {
            m80960i(canvas);
            return;
        }
        Bitmap bitmapM80959h = m80959h(drawable);
        if (bitmapM80959h == null) {
            f78708o.m79403a("drawDrawable bitmap is null");
            return;
        }
        canvas.drawBitmap(bitmapM80959h, new Rect(0, 0, bitmapM80959h.getWidth(), (int) (bitmapM80959h.getHeight() * (this.f78715h.bottom / this.f78712e))), this.f78715h, (Paint) null);
        Paint paint = new Paint();
        paint.setColor(0);
        canvas.drawRect(this.f78716i, paint);
        canvas.drawBitmap(bitmapM80959h, new Rect(0, (int) (bitmapM80959h.getHeight() * (this.f78717j.top / this.f78712e)), bitmapM80959h.getWidth(), bitmapM80959h.getHeight()), this.f78717j, (Paint) null);
    }

    /* JADX INFO: renamed from: g */
    public final void m80958g(Canvas canvas, int i11) {
        if (m80962k()) {
            m80960i(canvas);
            return;
        }
        Paint paint = new Paint();
        paint.setColor(i11);
        canvas.drawRect(this.f78715h, paint);
        paint.setColor(0);
        canvas.drawRect(this.f78716i, paint);
        paint.setColor(i11);
        canvas.drawRect(this.f78717j, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f78720m = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new C362311(null), 3, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC41775x1 interfaceC41775x1 = this.f78720m;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.f78711d = getMeasuredWidth();
        this.f78712e = getMeasuredHeight();
        f78708o.m79404b("onMeasure OID:" + this.f78709b + " parentWidth:" + this.f78711d + " parentHeight:" + this.f78712e);
    }

    @Override // android.view.View
    public void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        f78708o.m79404b("onSizeChanged OID:" + this.f78709b + " w:" + w11 + " h:" + h11 + " oldw:" + oldw + " oldh:" + oldh);
        if (w11 == oldw && h11 == oldh) {
            return;
        }
        C37144f c37144f = this.f78710c;
        if (c37144f == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audienceStore");
            c37144f = null;
        }
        m80963l(c37144f.m83098q().getSeatList().getValue());
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.view.View
    public void setBackgroundResource(int resId) {
        Drawable drawable = AppCompatResources.getDrawable(getContext(), resId);
        this.f78713f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int resId) {
        Drawable drawable = AppCompatResources.getDrawable(getContext(), resId);
        this.f78713f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveCoreViewMaskBackgroundView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f78709b = hashCode();
        this.f78711d = C45152a.m99799a(720.0f);
        this.f78712e = C45152a.m99799a(1080.0f);
        this.f78715h = new Rect();
        this.f78716i = new Rect();
        this.f78717j = new Rect();
        this.f78718k = true;
        this.f78719l = true;
    }
}
