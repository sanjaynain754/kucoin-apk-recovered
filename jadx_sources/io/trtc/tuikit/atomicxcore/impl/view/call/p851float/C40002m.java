package io.trtc.tuikit.atomicxcore.impl.view.call.p851float;

import android.content.Context;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import io.trtc.tuikit.atomicxcore.api.call.CallInfo;
import io.trtc.tuikit.atomicxcore.api.call.CallMediaType;
import io.trtc.tuikit.atomicxcore.api.call.CallParticipantInfo;
import io.trtc.tuikit.atomicxcore.api.call.CallParticipantStatus;
import io.trtc.tuikit.atomicxcore.api.call.CallStore;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import io.trtc.tuikit.atomicxcore.api.view.AbstractC39399b;
import io.trtc.tuikit.atomicxcore.impl.view.call.C39983B;
import io.trtc.tuikit.atomicxcore.impl.view.call.C40040x;
import io.trtc.tuikit.atomicxcore.impl.view.call.p851float.C40002m;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.float.m */
/* JADX INFO: loaded from: classes61.dex */
public final class C40002m extends ConstraintLayout {

    /* JADX INFO: renamed from: a */
    public final Context f88958a;

    /* JADX INFO: renamed from: b */
    public InterfaceC41775x1 f88959b;

    /* JADX INFO: renamed from: c */
    public C40040x f88960c;

    /* JADX INFO: renamed from: d */
    public C40040x f88961d;

    /* JADX INFO: renamed from: e */
    public boolean f88962e;

    /* JADX INFO: renamed from: f */
    public Map f88963f;

    /* JADX INFO: renamed from: g */
    public final boolean f88964g;

    /* JADX INFO: renamed from: h */
    public final C39983B f88965h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f88966i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f88967j;

    /* JADX INFO: renamed from: k */
    public ImageFilterView f88968k;

    /* JADX INFO: renamed from: l */
    public TextView f88969l;

    /* JADX INFO: renamed from: m */
    public ImageView f88970m;

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m88385a(C40002m c40002m, ContinuationImpl continuationImpl) {
        C39991b c39991b;
        c40002m.getClass();
        if (continuationImpl instanceof C39991b) {
            c39991b = (C39991b) continuationImpl;
            int i11 = c39991b.f88938c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c39991b.f88938c = i11 - Integer.MIN_VALUE;
            } else {
                c39991b = new C39991b(c40002m, continuationImpl);
            }
        } else {
            c39991b = new C39991b(c40002m, continuationImpl);
        }
        Object obj = c39991b.f88936a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c39991b.f88938c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<DeviceStatus> cameraStatus = DeviceStore.INSTANCE.shared().getDeviceState().getCameraStatus();
            C39992c c39992c = new C39992c(c40002m);
            c39991b.f88938c = 1;
            if (cameraStatus.collect(c39992c, c39991b) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: b */
    public static final Object m88389b(C40002m c40002m, ContinuationImpl continuationImpl) {
        C39993d c39993d;
        c40002m.getClass();
        if (continuationImpl instanceof C39993d) {
            c39993d = (C39993d) continuationImpl;
            int i11 = c39993d.f88942c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c39993d.f88942c = i11 - Integer.MIN_VALUE;
            } else {
                c39993d = new C39993d(c40002m, continuationImpl);
            }
        } else {
            c39993d = new C39993d(c40002m, continuationImpl);
        }
        Object obj = c39993d.f88940a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c39993d.f88942c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<LinkedHashSet<CallParticipantInfo>> allParticipants = CallStore.INSTANCE.getShared().getObserverState().getAllParticipants();
            C39994e c39994e = new C39994e(c40002m);
            c39993d.f88942c = 1;
            if (allParticipants.collect(c39994e, c39993d) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: c */
    public static final Object m88390c(C40002m c40002m, ContinuationImpl continuationImpl) {
        C39995f c39995f;
        c40002m.getClass();
        if (continuationImpl instanceof C39995f) {
            c39995f = (C39995f) continuationImpl;
            int i11 = c39995f.f88946c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c39995f.f88946c = i11 - Integer.MIN_VALUE;
            } else {
                c39995f = new C39995f(c40002m, continuationImpl);
            }
        } else {
            c39995f = new C39995f(c40002m, continuationImpl);
        }
        Object obj = c39995f.f88944a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c39995f.f88946c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<CallParticipantInfo> selfInfo = CallStore.INSTANCE.getShared().getObserverState().getSelfInfo();
            C39996g c39996g = new C39996g(c40002m);
            c39995f.f88946c = 1;
            if (selfInfo.collect(c39996g, c39995f) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40002m(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f88958a = context.getApplicationContext();
        this.f88963f = MapsKt.emptyMap();
        this.f88964g = context.getResources().getConfiguration().getLayoutDirection() == 1;
        this.f88965h = new C39983B(context);
        m88392a();
    }

    /* JADX INFO: renamed from: d */
    public final void m88397d() {
        if (CallStore.INSTANCE.getShared().getObserverState().getSelfInfo().getValue().getStatus() == CallParticipantStatus.Accept) {
            m88386a((View) this.f88961d);
            m88386a((View) this.f88960c);
            FrameLayout frameLayout = this.f88967j;
            FrameLayout frameLayout2 = null;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("smallVideoContainer");
                frameLayout = null;
            }
            frameLayout.removeAllViews();
            FrameLayout frameLayout3 = this.f88966i;
            if (frameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bigVideoContainer");
                frameLayout3 = null;
            }
            frameLayout3.removeAllViews();
            m88398e();
            if (this.f88962e) {
                FrameLayout frameLayout4 = this.f88967j;
                if (frameLayout4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smallVideoContainer");
                    frameLayout4 = null;
                }
                frameLayout4.addView(this.f88960c);
                FrameLayout frameLayout5 = this.f88966i;
                if (frameLayout5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bigVideoContainer");
                } else {
                    frameLayout2 = frameLayout5;
                }
                frameLayout2.addView(this.f88961d);
            } else {
                FrameLayout frameLayout6 = this.f88967j;
                if (frameLayout6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smallVideoContainer");
                    frameLayout6 = null;
                }
                frameLayout6.addView(this.f88961d);
                FrameLayout frameLayout7 = this.f88966i;
                if (frameLayout7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bigVideoContainer");
                } else {
                    frameLayout2 = frameLayout7;
                }
                frameLayout2.addView(this.f88960c);
            }
            this.f88962e = !this.f88962e;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m88398e() {
        FrameLayout frameLayout = this.f88967j;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smallVideoContainer");
            frameLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = m88391a(120.0f);
        }
        if (layoutParams != null) {
            layoutParams.height = m88391a(180.0f);
        }
        FrameLayout frameLayout3 = this.f88967j;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smallVideoContainer");
        } else {
            frameLayout2 = frameLayout3;
        }
        frameLayout2.setLayoutParams(layoutParams);
    }

    public final void setParticipantsAvatar(@NotNull Map<String, String> avatars) {
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        this.f88963f = avatars;
        C40040x c40040x = this.f88960c;
        if (c40040x != null) {
            c40040x.setParticipantsAvatar(avatars);
        }
        C40040x c40040x2 = this.f88961d;
        if (c40040x2 != null) {
            c40040x2.setParticipantsAvatar(avatars);
        }
        m88395b();
        CallStore.Companion companion = CallStore.INSTANCE;
        CallParticipantStatus status = companion.getShared().getObserverState().getSelfInfo().getValue().getStatus();
        CallMediaType mediaType = ((CallInfo) AbstractC39399b.m88230a(companion)).getMediaType();
        if (status == CallParticipantStatus.Waiting) {
            m88394a(true);
        } else if (status == CallParticipantStatus.Accept && mediaType == CallMediaType.Audio) {
            m88394a(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        CallStore.Companion companion = CallStore.INSTANCE;
        String id2 = companion.getShared().getObserverState().getSelfInfo().getValue().getId();
        String inviterId = ((CallInfo) AbstractC39399b.m88230a(companion)).getInviterId();
        String str = (String) CollectionsKt.first(((CallInfo) AbstractC39399b.m88230a(companion)).getInviteeIds());
        if (!Intrinsics.areEqual(id2, str)) {
            inviterId = str;
        }
        Context context = this.f88958a;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        C40040x c40040x = new C40040x(context, id2);
        this.f88961d = c40040x;
        c40040x.m88423a(false, m88391a(80.0f), m88391a(80.0f), 12.0f);
        C40040x c40040x2 = this.f88961d;
        if (c40040x2 != null) {
            c40040x2.setParticipantsAvatar(this.f88963f);
        }
        Context context2 = this.f88958a;
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40040x c40040x3 = new C40040x(context2, inviterId);
        this.f88960c = c40040x3;
        c40040x3.m88423a(true, m88391a(80.0f), m88391a(80.0f), 12.0f);
        C40040x c40040x4 = this.f88960c;
        if (c40040x4 != null) {
            c40040x4.setParticipantsAvatar(this.f88963f);
        }
        CallMediaType mediaType = ((CallInfo) AbstractC39399b.m88230a(companion)).getMediaType();
        CallParticipantStatus status = companion.getShared().getObserverState().getSelfInfo().getValue().getStatus();
        if (mediaType == CallMediaType.Audio) {
            m88394a(true);
            FrameLayout frameLayout = this.f88966i;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bigVideoContainer");
                frameLayout = null;
            }
            frameLayout.setVisibility(8);
            FrameLayout frameLayout2 = this.f88967j;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("smallVideoContainer");
                frameLayout2 = null;
            }
            frameLayout2.setVisibility(8);
        } else if (mediaType == CallMediaType.Video) {
            m88386a((View) this.f88961d);
            FrameLayout frameLayout3 = this.f88966i;
            if (frameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bigVideoContainer");
                frameLayout3 = null;
            }
            frameLayout3.removeAllViews();
            FrameLayout frameLayout4 = this.f88966i;
            if (frameLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bigVideoContainer");
                frameLayout4 = null;
            }
            frameLayout4.addView(this.f88961d);
            FrameLayout frameLayout5 = this.f88967j;
            if (frameLayout5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("smallVideoContainer");
                frameLayout5 = null;
            }
            m88393a(frameLayout5);
            FrameLayout frameLayout6 = this.f88966i;
            if (frameLayout6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bigVideoContainer");
                frameLayout6 = null;
            }
            frameLayout6.setVisibility(0);
            if (status == CallParticipantStatus.Accept) {
                m88394a(false);
                FrameLayout frameLayout7 = this.f88967j;
                if (frameLayout7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smallVideoContainer");
                    frameLayout7 = null;
                }
                frameLayout7.setVisibility(0);
                m88396c();
            } else {
                m88394a(true);
                FrameLayout frameLayout8 = this.f88967j;
                if (frameLayout8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smallVideoContainer");
                    frameLayout8 = null;
                }
                frameLayout8.setVisibility(8);
            }
        }
        m88395b();
        this.f88959b = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new C40001l(this, null), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC41775x1 interfaceC41775x1 = this.f88959b;
        FrameLayout frameLayout = null;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        C40040x c40040x = this.f88960c;
        if (c40040x != null) {
            m88386a((View) c40040x);
            c40040x.removeAllViews();
        }
        C40040x c40040x2 = this.f88961d;
        if (c40040x2 != null) {
            m88386a((View) c40040x2);
            c40040x2.removeAllViews();
        }
        FrameLayout frameLayout2 = this.f88966i;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bigVideoContainer");
            frameLayout2 = null;
        }
        frameLayout2.removeAllViews();
        FrameLayout frameLayout3 = this.f88967j;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smallVideoContainer");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.removeAllViews();
    }

    /* JADX INFO: renamed from: a */
    public final void m88392a() {
        setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(this.f88958a);
        frameLayout.setVisibility(8);
        this.f88966i = frameLayout;
        ViewGroup.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -1);
        View view = this.f88966i;
        View view2 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bigVideoContainer");
            view = null;
        }
        addView(view, layoutParams);
        FrameLayout frameLayout2 = new FrameLayout(this.f88958a);
        frameLayout2.setVisibility(8);
        frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: gg0.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                C40002m.m88387a(this.f85322b, view3);
            }
        });
        this.f88967j = frameLayout2;
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(m88391a(120.0f), m88391a(180.0f));
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = m88391a(100.0f);
        layoutParams2.setMarginEnd(m88391a(20.0f));
        layoutParams2.topToTop = 0;
        layoutParams2.endToEnd = 0;
        View view3 = this.f88967j;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smallVideoContainer");
            view3 = null;
        }
        addView(view3, layoutParams2);
        ImageView imageView = new ImageView(this.f88958a);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setVisibility(8);
        this.f88970m = imageView;
        ViewGroup.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-1, -1);
        View view4 = this.f88970m;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageBackground");
            view4 = null;
        }
        addView(view4, layoutParams3);
        Guideline guideline = new Guideline(this.f88958a);
        guideline.setId(View.generateViewId());
        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams4.orientation = 0;
        addView(guideline, layoutParams4);
        guideline.setGuidelinePercent(0.3f);
        int iM88391a = m88391a(100.0f);
        int iM88391a2 = m88391a(12.0f);
        ImageFilterView imageFilterView = new ImageFilterView(this.f88958a);
        imageFilterView.setId(View.generateViewId());
        imageFilterView.setVisibility(8);
        imageFilterView.setRound(iM88391a2);
        this.f88968k = imageFilterView;
        ConstraintLayout.LayoutParams layoutParams5 = new ConstraintLayout.LayoutParams(iM88391a, iM88391a);
        ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = iM88391a2;
        layoutParams5.topToTop = guideline.getId();
        layoutParams5.startToStart = 0;
        layoutParams5.endToEnd = 0;
        View view5 = this.f88968k;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageAvatar");
            view5 = null;
        }
        addView(view5, layoutParams5);
        TextView textView = new TextView(this.f88958a);
        textView.setVisibility(8);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setTextColor(-1);
        textView.setTextSize(2, 18.0f);
        this.f88969l = textView;
        ConstraintLayout.LayoutParams layoutParams6 = new ConstraintLayout.LayoutParams(-2, -2);
        ImageFilterView imageFilterView2 = this.f88968k;
        if (imageFilterView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageAvatar");
            imageFilterView2 = null;
        }
        layoutParams6.topToBottom = imageFilterView2.getId();
        layoutParams6.startToStart = 0;
        layoutParams6.endToEnd = 0;
        View view6 = this.f88969l;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textUserName");
        } else {
            view2 = view6;
        }
        addView(view2, layoutParams6);
    }

    /* JADX INFO: renamed from: b */
    public final void m88395b() {
        CallStore.Companion companion = CallStore.INSTANCE;
        CallParticipantStatus status = companion.getShared().getObserverState().getSelfInfo().getValue().getStatus();
        boolean z11 = DeviceStore.INSTANCE.shared().getDeviceState().getCameraStatus().getValue() == DeviceStatus.OFF;
        ImageView imageView = null;
        if (((CallInfo) AbstractC39399b.m88230a(companion)).getMediaType() == CallMediaType.Video) {
            ImageView imageView2 = this.f88970m;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageBackground");
                imageView2 = null;
            }
            imageView2.setVisibility((status == CallParticipantStatus.Waiting && z11) ? 0 : 8);
        } else {
            ImageView imageView3 = this.f88970m;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageBackground");
                imageView3 = null;
            }
            imageView3.setVisibility(0);
        }
        Map map = this.f88963f;
        C40040x c40040x = this.f88960c;
        String str = (String) map.get(c40040x != null ? c40040x.getParticipantId() : null);
        if (str != null) {
            C39983B c39983b = this.f88965h;
            ImageView imageView4 = this.f88970m;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageBackground");
                imageView4 = null;
            }
            c39983b.m88384a(imageView4, str, 25);
        }
        ImageView imageView5 = this.f88970m;
        if (imageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageBackground");
        } else {
            imageView = imageView5;
        }
        imageView.setColorFilter(-2145245650);
    }

    /* JADX INFO: renamed from: c */
    public final void m88396c() {
        m88398e();
        m88386a((View) this.f88960c);
        FrameLayout frameLayout = this.f88967j;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smallVideoContainer");
            frameLayout = null;
        }
        frameLayout.removeAllViews();
        FrameLayout frameLayout3 = this.f88967j;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smallVideoContainer");
            frameLayout3 = null;
        }
        frameLayout3.addView(this.f88960c);
        FrameLayout frameLayout4 = this.f88967j;
        if (frameLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smallVideoContainer");
        } else {
            frameLayout2 = frameLayout4;
        }
        frameLayout2.setVisibility(0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m88387a(C40002m this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m88397d();
    }

    /* JADX INFO: renamed from: a */
    public final void m88393a(FrameLayout frameLayout) {
        final GestureDetector gestureDetector = new GestureDetector(this.f88958a, new C39990a(frameLayout, this));
        frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: gg0.b
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C40002m.m88388a(gestureDetector, view, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m88388a(GestureDetector detector, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(detector, "$detector");
        return detector.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: a */
    public static void m88386a(View view) {
        if ((view != null ? view.getParent() : null) != null) {
            ViewParent parent = view.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(view);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m88391a(float f11) {
        return (int) ((f11 * this.f88958a.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: a */
    public final void m88394a(boolean z11) {
        int i11 = z11 ? 0 : 8;
        ImageFilterView imageFilterView = this.f88968k;
        ImageFilterView imageFilterView2 = null;
        if (imageFilterView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageAvatar");
            imageFilterView = null;
        }
        imageFilterView.setVisibility(i11);
        TextView textView = this.f88969l;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textUserName");
            textView = null;
        }
        textView.setVisibility(i11);
        C40040x c40040x = this.f88960c;
        String str = (String) this.f88963f.get(c40040x != null ? c40040x.getParticipantId() : null);
        if (!z11 || str == null) {
            return;
        }
        C39983B c39983b = this.f88965h;
        ImageFilterView imageFilterView3 = this.f88968k;
        if (imageFilterView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageAvatar");
        } else {
            imageFilterView2 = imageFilterView3;
        }
        c39983b.m88383a(imageFilterView2, str);
    }
}
