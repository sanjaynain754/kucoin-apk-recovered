package com.facebook.appevents.codeless;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import androidx.annotation.RestrictTo;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.codeless.C5521a;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.react.uimanager.ViewProps;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p189d3.C36605c;
import p357j3.C40258g;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.appevents.codeless.a */
/* JADX INFO: compiled from: CodelessLoggingEventListener.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0017\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m90084d2 = {"Lcom/facebook/appevents/codeless/a;", "", "<init>", "()V", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Landroid/view/View;", "rootView", "hostView", "Lcom/facebook/appevents/codeless/a$a;", "b", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/view/View;)Lcom/facebook/appevents/codeless/a$a;", "Landroid/widget/AdapterView;", "Lcom/facebook/appevents/codeless/a$b;", "c", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/widget/AdapterView;)Lcom/facebook/appevents/codeless/a$b;", "", "d", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/view/View;)V", "Landroid/os/Bundle;", "parameters", "f", "(Landroid/os/Bundle;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C5521a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5521a f7772a = new C5521a();

    /* JADX INFO: renamed from: com.facebook.appevents.codeless.a$a */
    /* JADX INFO: compiled from: CodelessLoggingEventListener.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m90084d2 = {"Lcom/facebook/appevents/codeless/a$a;", "Landroid/view/View$OnClickListener;", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Landroid/view/View;", "rootView", "hostView", "<init>", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/view/View;)V", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "", "onClick", "(Landroid/view/View;)V", "b", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "Ljava/lang/ref/WeakReference;", "c", "Ljava/lang/ref/WeakReference;", "d", "e", "Landroid/view/View$OnClickListener;", "existingOnClickListener", "", "f", "Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Z", "setSupportCodelessLogging", "(Z)V", "supportCodelessLogging", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public EventBinding mapping;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public WeakReference<View> hostView;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public WeakReference<View> rootView;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public View.OnClickListener existingOnClickListener;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public boolean supportCodelessLogging;

        public a(@NotNull EventBinding mapping, @NotNull View rootView, @NotNull View hostView) {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            this.mapping = mapping;
            this.hostView = new WeakReference<>(hostView);
            this.rootView = new WeakReference<>(rootView);
            this.existingOnClickListener = C36605c.m81903g(hostView);
            this.supportCodelessLogging = true;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getSupportCodelessLogging() {
            return this.supportCodelessLogging;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull View view) {
            if (!C42757a.m93689d(this)) {
                try {
                    if (!C42757a.m93689d(this)) {
                        try {
                            Intrinsics.checkNotNullParameter(view, "view");
                            View.OnClickListener onClickListener = this.existingOnClickListener;
                            if (onClickListener != null) {
                                onClickListener.onClick(view);
                            }
                            View view2 = this.rootView.get();
                            View view3 = this.hostView.get();
                            if (view2 != null && view3 != null) {
                                EventBinding eventBinding = this.mapping;
                                Intrinsics.checkNotNull(eventBinding, "null cannot be cast to non-null type com.facebook.appevents.codeless.internal.EventBinding");
                                C5521a.m8048d(eventBinding, view2, view3);
                            }
                        } catch (Throwable th2) {
                            C42757a.m93687b(th2, this);
                        }
                    }
                } catch (Throwable th3) {
                    C42757a.m93687b(th3, this);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.codeless.a$b */
    /* JADX INFO: compiled from: CodelessLoggingEventListener.kt */
    @Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0011\u001a\u00020\u00102\f\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006$"}, m90084d2 = {"Lcom/facebook/appevents/codeless/a$b;", "Landroid/widget/AdapterView$OnItemClickListener;", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Landroid/view/View;", "rootView", "Landroid/widget/AdapterView;", "hostView", "<init>", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/widget/AdapterView;)V", "parent", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "", ViewProps.POSITION, "", "id", "", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "b", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "Ljava/lang/ref/WeakReference;", "c", "Ljava/lang/ref/WeakReference;", "d", "e", "Landroid/widget/AdapterView$OnItemClickListener;", "existingOnItemClickListener", "", "f", "Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Z", "setSupportCodelessLogging", "(Z)V", "supportCodelessLogging", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class b implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public EventBinding mapping;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public WeakReference<AdapterView<?>> hostView;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public WeakReference<View> rootView;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public AdapterView.OnItemClickListener existingOnItemClickListener;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public boolean supportCodelessLogging;

        public b(@NotNull EventBinding mapping, @NotNull View rootView, @NotNull AdapterView<?> hostView) {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            this.mapping = mapping;
            this.hostView = new WeakReference<>(hostView);
            this.rootView = new WeakReference<>(rootView);
            this.existingOnItemClickListener = hostView.getOnItemClickListener();
            this.supportCodelessLogging = true;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getSupportCodelessLogging() {
            return this.supportCodelessLogging;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(@Nullable AdapterView<?> parent, @NotNull View view, int position, long id2) {
            Intrinsics.checkNotNullParameter(view, "view");
            AdapterView.OnItemClickListener onItemClickListener = this.existingOnItemClickListener;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(parent, view, position, id2);
            }
            View view2 = this.rootView.get();
            AdapterView<?> adapterView = this.hostView.get();
            if (view2 != null && adapterView != null) {
                C5521a.m8048d(this.mapping, view2, adapterView);
            }
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final a m8046b(@NotNull EventBinding mapping, @NotNull View rootView, @NotNull View hostView) {
        if (C42757a.m93689d(C5521a.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            return new a(mapping, rootView, hostView);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5521a.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final b m8047c(@NotNull EventBinding mapping, @NotNull View rootView, @NotNull AdapterView<?> hostView) {
        if (C42757a.m93689d(C5521a.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            return new b(mapping, rootView, hostView);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5521a.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m8048d(@NotNull EventBinding mapping, @NotNull View rootView, @NotNull View hostView) {
        if (C42757a.m93689d(C5521a.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            final String eventName = mapping.getEventName();
            final Bundle parameters = CodelessMatcher.INSTANCE.getParameters(mapping, rootView, hostView);
            f7772a.m8050f(parameters);
            C5501a.m7806t().execute(new Runnable() { // from class: c3.a
                @Override // java.lang.Runnable
                public final void run() {
                    C5521a.m8049e(eventName, parameters);
                }
            });
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5521a.class);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m8049e(String eventName, Bundle parameters) {
        if (C42757a.m93689d(C5521a.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(eventName, "$eventName");
            Intrinsics.checkNotNullParameter(parameters, "$parameters");
            AppEventsLogger.INSTANCE.newLogger(C5501a.m7799m()).m7841b(eventName, parameters);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5521a.class);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m8050f(@NotNull Bundle parameters) {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            String string = parameters.getString("_valueToSum");
            if (string != null) {
                parameters.putDouble("_valueToSum", C40258g.m88612g(string));
            }
            parameters.putString("_is_fb_codeless", "1");
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }
}
