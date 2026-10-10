package com.facebook.appevents.codeless;

import android.view.MotionEvent;
import android.view.View;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p189d3.C36605c;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.appevents.codeless.c */
/* JADX INFO: compiled from: RCTCodelessLoggingEventListener.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/facebook/appevents/codeless/c;", "", "<init>", "()V", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Landroid/view/View;", "rootView", "hostView", "Lcom/facebook/appevents/codeless/c$a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/view/View;)Lcom/facebook/appevents/codeless/c$a;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C5523c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5523c f7791a = new C5523c();

    /* JADX INFO: renamed from: com.facebook.appevents.codeless.c$a */
    /* JADX INFO: compiled from: RCTCodelessLoggingEventListener.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m90084d2 = {"Lcom/facebook/appevents/codeless/c$a;", "Landroid/view/View$OnTouchListener;", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Landroid/view/View;", "rootView", "hostView", "<init>", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/view/View;)V", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/MotionEvent;", "motionEvent", "", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "b", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "Ljava/lang/ref/WeakReference;", "c", "Ljava/lang/ref/WeakReference;", "d", "e", "Landroid/view/View$OnTouchListener;", "existingOnTouchListener", "f", "Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Z", "setSupportCodelessLogging", "(Z)V", "supportCodelessLogging", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a implements View.OnTouchListener {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final EventBinding mapping;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final WeakReference<View> hostView;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final WeakReference<View> rootView;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public final View.OnTouchListener existingOnTouchListener;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public boolean supportCodelessLogging;

        public a(@NotNull EventBinding mapping, @NotNull View rootView, @NotNull View hostView) {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            this.mapping = mapping;
            this.hostView = new WeakReference<>(hostView);
            this.rootView = new WeakReference<>(rootView);
            this.existingOnTouchListener = C36605c.m81904h(hostView);
            this.supportCodelessLogging = true;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getSupportCodelessLogging() {
            return this.supportCodelessLogging;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(@NotNull View view, @NotNull MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
            View view2 = this.rootView.get();
            View view3 = this.hostView.get();
            if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
                C5521a.m8048d(this.mapping, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.existingOnTouchListener;
            if (onTouchListener != null && onTouchListener.onTouch(view, motionEvent)) {
                return true;
            }
            return false;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final a m8067a(@NotNull EventBinding mapping, @NotNull View rootView, @NotNull View hostView) {
        if (C42757a.m93689d(C5523c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            return new a(mapping, rootView, hostView);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5523c.class);
            return null;
        }
    }
}
