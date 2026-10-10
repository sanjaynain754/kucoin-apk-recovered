package com.facebook.appevents.codeless;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.UiThread;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.FacebookException;
import com.facebook.appevents.codeless.CodelessMatcher;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.ParameterComponent;
import com.facebook.appevents.codeless.internal.PathComponent;
import com.facebook.internal.C5760c;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.react.BuildConfig;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p189d3.C36605c;
import p333i6.C38449h;
import p357j3.C40258g;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: CodelessMatcher.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0003#\u000e$B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0003R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R&\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cRF\u0010\"\u001a4\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u001ej\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001a` 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!¨\u0006%"}, m90084d2 = {"Lcom/facebook/appevents/codeless/CodelessMatcher;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "e", "(Landroid/app/Activity;)V", CmcdData.Factory.STREAMING_FORMAT_HLS, "f", "i", "g", "Landroid/os/Handler;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/os/Handler;", "uiThreadHandler", "", "b", "Ljava/util/Set;", "activitiesSet", "Lcom/facebook/appevents/codeless/CodelessMatcher$ViewMatcher;", "c", "viewMatchers", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "d", "Ljava/util/HashSet;", "listenerSet", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "activityToListenerMap", "Companion", "ViewMatcher", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCodelessMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CodelessMatcher.kt\ncom/facebook/appevents/codeless/CodelessMatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,459:1\n1#2:460\n*E\n"})
public final class CodelessMatcher {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g */
    public static final String f7746g = CodelessMatcher.class.getCanonicalName();

    /* JADX INFO: renamed from: h */
    @Nullable
    public static CodelessMatcher f7747h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Handler uiThreadHandler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Set<Activity> activitiesSet;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Set<ViewMatcher> viewMatchers;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public HashSet<String> listenerSet;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final HashMap<Integer, HashSet<String>> activityToListenerMap;

    /* JADX INFO: compiled from: CodelessMatcher.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\tH\u0007J\"\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/facebook/appevents/codeless/CodelessMatcher$Companion;", "", "()V", "CURRENT_CLASS_NAME", "", "PARENT_CLASS_NAME", "TAG", "kotlin.jvm.PlatformType", "codelessMatcher", "Lcom/facebook/appevents/codeless/CodelessMatcher;", "getInstance", "getParameters", "Landroid/os/Bundle;", "mapping", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "rootView", "Landroid/view/View;", "hostView", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final synchronized CodelessMatcher getInstance() {
            CodelessMatcher codelessMatcherM8010b;
            try {
                if (CodelessMatcher.m8010b() == null) {
                    CodelessMatcher.m8012d(new CodelessMatcher(null));
                }
                codelessMatcherM8010b = CodelessMatcher.m8010b();
                Intrinsics.checkNotNull(codelessMatcherM8010b, "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
            } catch (Throwable th2) {
                throw th2;
            }
            return codelessMatcherM8010b;
        }

        public Companion() {
        }

        @JvmStatic
        @UiThread
        @NotNull
        public final Bundle getParameters(@Nullable EventBinding mapping, @NotNull View rootView, @NotNull View hostView) {
            List<ParameterComponent> listM8071c;
            EventBinding eventBinding;
            View view;
            List<C5517a> listFindViewByPath;
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            Bundle bundle = new Bundle();
            if (mapping != null && (listM8071c = mapping.m8071c()) != null) {
                for (ParameterComponent parameterComponent : listM8071c) {
                    if (parameterComponent.getValue() != null && parameterComponent.getValue().length() > 0) {
                        bundle.putString(parameterComponent.getName(), parameterComponent.getValue());
                    } else if (parameterComponent.m8076b().size() > 0) {
                        if (Intrinsics.areEqual(parameterComponent.getPathType(), "relative")) {
                            ViewMatcher.Companion companion = ViewMatcher.INSTANCE;
                            List<PathComponent> listM8076b = parameterComponent.m8076b();
                            String simpleName = hostView.getClass().getSimpleName();
                            Intrinsics.checkNotNullExpressionValue(simpleName, "hostView.javaClass.simpleName");
                            EventBinding eventBinding2 = mapping;
                            listFindViewByPath = companion.findViewByPath(eventBinding2, hostView, listM8076b, 0, -1, simpleName);
                            eventBinding = eventBinding2;
                            view = rootView;
                        } else {
                            eventBinding = mapping;
                            ViewMatcher.Companion companion2 = ViewMatcher.INSTANCE;
                            List<PathComponent> listM8076b2 = parameterComponent.m8076b();
                            String simpleName2 = rootView.getClass().getSimpleName();
                            Intrinsics.checkNotNullExpressionValue(simpleName2, "rootView.javaClass.simpleName");
                            view = rootView;
                            listFindViewByPath = companion2.findViewByPath(eventBinding, view, listM8076b2, 0, -1, simpleName2);
                        }
                        for (C5517a c5517a : listFindViewByPath) {
                            if (c5517a.m8027a() != null) {
                                String strM81907k = C36605c.m81907k(c5517a.m8027a());
                                if (strM81907k.length() > 0) {
                                    bundle.putString(parameterComponent.getName(), strM81907k);
                                    break;
                                }
                            }
                        }
                        mapping = eventBinding;
                        rootView = view;
                    }
                }
            }
            return bundle;
        }
    }

    /* JADX INFO: compiled from: CodelessMatcher.kt */
    @Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001)B9\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J#\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ'\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ'\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010\u001cR\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010!R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010%R$\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010&R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010'¨\u0006*"}, m90084d2 = {"Lcom/facebook/appevents/codeless/CodelessMatcher$ViewMatcher;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Ljava/lang/Runnable;", "Landroid/view/View;", "rootView", "Landroid/os/Handler;", "handler", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "listenerSet", "activityName", "<init>", "(Landroid/view/View;Landroid/os/Handler;Ljava/util/HashSet;Ljava/lang/String;)V", "", "run", "()V", "onGlobalLayout", "onScrollChanged", "f", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "e", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;)V", "Lcom/facebook/appevents/codeless/CodelessMatcher$a;", "matchedView", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/appevents/codeless/CodelessMatcher$a;Landroid/view/View;Lcom/facebook/appevents/codeless/internal/EventBinding;)V", "b", "c", "d", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "", "Ljava/util/List;", "eventBindings", "Landroid/os/Handler;", "Ljava/util/HashSet;", "Ljava/lang/String;", "g", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @UiThread
    public static final class ViewMatcher implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final WeakReference<View> rootView;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public List<EventBinding> eventBindings;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final Handler handler;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final HashSet<String> listenerSet;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final String activityName;

        /* JADX INFO: compiled from: CodelessMatcher.kt */
        @Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m90084d2 = {"Lcom/facebook/appevents/codeless/CodelessMatcher$ViewMatcher$Companion;", "", "<init>", "()V", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "", "Lcom/facebook/appevents/codeless/internal/PathComponent;", "path", "", FirebaseAnalytics.Param.LEVEL, "index", "", "mapKey", "Lcom/facebook/appevents/codeless/CodelessMatcher$a;", "findViewByPath", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Ljava/util/List;IILjava/lang/String;)Ljava/util/List;", "targetView", "pathElement", "", "b", "(Landroid/view/View;Lcom/facebook/appevents/codeless/internal/PathComponent;I)Z", "Landroid/view/ViewGroup;", "viewGroup", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/view/ViewGroup;)Ljava/util/List;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }

            /* JADX INFO: renamed from: a */
            public final List<View> m8025a(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View child = viewGroup.getChildAt(i11);
                    if (child.getVisibility() == 0) {
                        Intrinsics.checkNotNullExpressionValue(child, "child");
                        arrayList.add(child);
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
            
                if (p852kotlin.jvm.internal.Intrinsics.areEqual(r10.getClass().getSimpleName(), (java.lang.String) r12.get(r12.size() - 1)) == false) goto L15;
             */
            /* JADX INFO: renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final boolean m8026b(View targetView, PathComponent pathElement, int index) {
                String string;
                String string2;
                if (pathElement.getIndex() != -1 && index != pathElement.getIndex()) {
                    return false;
                }
                if (!Intrinsics.areEqual(targetView.getClass().getCanonicalName(), pathElement.getClassName())) {
                    if (new Regex(".*android\\..*").matches(pathElement.getClassName())) {
                        List listSplit$default = StringsKt.split$default((CharSequence) pathElement.getClassName(), new String[]{C33978va.f72339h}, false, 0, 6, (Object) null);
                        if (!listSplit$default.isEmpty()) {
                        }
                    }
                    return false;
                }
                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.ID.getValue()) > 0 && pathElement.getId() != targetView.getId()) {
                    return false;
                }
                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TEXT.getValue()) > 0) {
                    String text = pathElement.getText();
                    String strM81907k = C36605c.m81907k(targetView);
                    String strM10072j = C5760c.m10072j(C5760c.m10086t0(strM81907k), "");
                    if (!Intrinsics.areEqual(text, strM81907k) && !Intrinsics.areEqual(text, strM10072j)) {
                        return false;
                    }
                }
                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.DESCRIPTION.getValue()) > 0) {
                    String str = pathElement.getCom.tencent.qcloud.tuicore.TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION java.lang.String();
                    if (targetView.getContentDescription() == null) {
                        string2 = "";
                    } else {
                        string2 = targetView.getContentDescription().toString();
                    }
                    String strM10072j2 = C5760c.m10072j(C5760c.m10086t0(string2), "");
                    if (!Intrinsics.areEqual(str, string2) && !Intrinsics.areEqual(str, strM10072j2)) {
                        return false;
                    }
                }
                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.HINT.getValue()) > 0) {
                    String hint = pathElement.getHint();
                    String strM81905i = C36605c.m81905i(targetView);
                    String strM10072j3 = C5760c.m10072j(C5760c.m10086t0(strM81905i), "");
                    if (!Intrinsics.areEqual(hint, strM81905i) && !Intrinsics.areEqual(hint, strM10072j3)) {
                        return false;
                    }
                }
                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                    String tag = pathElement.getTag();
                    if (targetView.getTag() == null) {
                        string = "";
                    } else {
                        string = targetView.getTag().toString();
                    }
                    String strM10072j4 = C5760c.m10072j(C5760c.m10086t0(string), "");
                    if (!Intrinsics.areEqual(tag, string) && !Intrinsics.areEqual(tag, strM10072j4)) {
                        return false;
                    }
                }
                return true;
            }

            @JvmStatic
            @NotNull
            public final List<C5517a> findViewByPath(@Nullable EventBinding mapping, @Nullable View view, @NotNull List<PathComponent> path, int level, int index, @NotNull String mapKey) {
                EventBinding eventBinding;
                List<PathComponent> list;
                Companion companion;
                Intrinsics.checkNotNullParameter(path, "path");
                Intrinsics.checkNotNullParameter(mapKey, "mapKey");
                String str = mapKey + '.' + index;
                ArrayList arrayList = new ArrayList();
                if (view != null) {
                    if (level >= path.size()) {
                        arrayList.add(new C5517a(view, str));
                        eventBinding = mapping;
                        list = path;
                        companion = this;
                    } else {
                        PathComponent pathComponent = path.get(level);
                        if (Intrinsics.areEqual(pathComponent.getClassName(), "..")) {
                            ViewParent parent = view.getParent();
                            if (parent instanceof ViewGroup) {
                                List<View> listM8025a = m8025a((ViewGroup) parent);
                                int size = listM8025a.size();
                                int i11 = 0;
                                while (i11 < size) {
                                    EventBinding eventBinding2 = mapping;
                                    List<PathComponent> list2 = path;
                                    arrayList.addAll(findViewByPath(eventBinding2, listM8025a.get(i11), list2, level + 1, i11, str));
                                    i11++;
                                    mapping = eventBinding2;
                                    path = list2;
                                }
                            }
                        } else {
                            eventBinding = mapping;
                            list = path;
                            companion = this;
                            if (Intrinsics.areEqual(pathComponent.getClassName(), C33978va.f72339h)) {
                                arrayList.add(new C5517a(view, str));
                                return arrayList;
                            }
                            if (m8026b(view, pathComponent, index)) {
                                if (level == list.size() - 1) {
                                    arrayList.add(new C5517a(view, str));
                                }
                            }
                        }
                    }
                    if (view instanceof ViewGroup) {
                        List<View> listM8025a2 = m8025a((ViewGroup) view);
                        int size2 = listM8025a2.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            arrayList.addAll(companion.findViewByPath(eventBinding, listM8025a2.get(i12), list, level + 1, i12, str));
                            i12++;
                            companion = this;
                        }
                    }
                }
                return arrayList;
            }
        }

        public ViewMatcher(@Nullable View view, @NotNull Handler handler, @NotNull HashSet<String> listenerSet, @NotNull String activityName) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(listenerSet, "listenerSet");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            this.rootView = new WeakReference<>(view);
            this.handler = handler;
            this.listenerSet = listenerSet;
            this.activityName = activityName;
            handler.postDelayed(this, 200L);
        }

        /* JADX INFO: renamed from: a */
        public final void m8019a(C5517a matchedView, View rootView, EventBinding mapping) {
            if (mapping == null) {
                return;
            }
            try {
                View viewM8027a = matchedView.m8027a();
                if (viewM8027a == null) {
                    return;
                }
                View viewM81899a = C36605c.m81899a(viewM8027a);
                if (viewM81899a != null && C36605c.f79406a.m81916p(viewM8027a, viewM81899a)) {
                    m8022d(matchedView, rootView, mapping);
                    return;
                }
                String name = viewM8027a.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "view.javaClass.name");
                if (StringsKt.startsWith$default(name, BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, (Object) null)) {
                    return;
                }
                if (!(viewM8027a instanceof AdapterView)) {
                    m8020b(matchedView, rootView, mapping);
                } else if (viewM8027a instanceof ListView) {
                    m8021c(matchedView, rootView, mapping);
                }
            } catch (Exception e11) {
                C5760c.m10063d0(CodelessMatcher.m8011c(), e11);
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m8023e(EventBinding mapping, View rootView) {
            if (mapping == null || rootView == null) {
                return;
            }
            String activityName = mapping.getActivityName();
            if (activityName == null || activityName.length() == 0 || Intrinsics.areEqual(mapping.getActivityName(), this.activityName)) {
                List<PathComponent> listM8072d = mapping.m8072d();
                if (listM8072d.size() > 25) {
                    return;
                }
                Iterator<C5517a> it = INSTANCE.findViewByPath(mapping, rootView, listM8072d, 0, -1, this.activityName).iterator();
                while (it.hasNext()) {
                    m8019a(it.next(), rootView, mapping);
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m8024f() {
            List<EventBinding> list = this.eventBindings;
            if (list == null || this.rootView.get() == null) {
                return;
            }
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                m8023e(list.get(i11), this.rootView.get());
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX INFO: renamed from: b */
        public final void m8020b(C5517a matchedView, View rootView, EventBinding mapping) {
            boolean z11;
            View viewM8027a = matchedView.m8027a();
            if (viewM8027a != null) {
                String viewMapKey = matchedView.getViewMapKey();
                View.OnClickListener onClickListenerM81903g = C36605c.m81903g(viewM8027a);
                if (onClickListenerM81903g instanceof C5521a.a) {
                    Intrinsics.checkNotNull(onClickListenerM81903g, "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                    if (((C5521a.a) onClickListenerM81903g).getSupportCodelessLogging()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
                if (!this.listenerSet.contains(viewMapKey) && !z11) {
                    viewM8027a.setOnClickListener(C5521a.m8046b(mapping, rootView, viewM8027a));
                    this.listenerSet.add(viewMapKey);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX INFO: renamed from: c */
        public final void m8021c(C5517a matchedView, View rootView, EventBinding mapping) {
            boolean z11;
            AdapterView adapterView = (AdapterView) matchedView.m8027a();
            if (adapterView != null) {
                String viewMapKey = matchedView.getViewMapKey();
                AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
                if (onItemClickListener instanceof C5521a.b) {
                    Intrinsics.checkNotNull(onItemClickListener, "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
                    if (((C5521a.b) onItemClickListener).getSupportCodelessLogging()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
                if (!this.listenerSet.contains(viewMapKey) && !z11) {
                    adapterView.setOnItemClickListener(C5521a.m8047c(mapping, rootView, adapterView));
                    this.listenerSet.add(viewMapKey);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX INFO: renamed from: d */
        public final void m8022d(C5517a matchedView, View rootView, EventBinding mapping) {
            boolean z11;
            View viewM8027a = matchedView.m8027a();
            if (viewM8027a != null) {
                String viewMapKey = matchedView.getViewMapKey();
                View.OnTouchListener onTouchListenerM81904h = C36605c.m81904h(viewM8027a);
                if (onTouchListenerM81904h instanceof C5523c.a) {
                    Intrinsics.checkNotNull(onTouchListenerM81904h, "null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                    if (((C5523c.a) onTouchListenerM81904h).getSupportCodelessLogging()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
                if (!this.listenerSet.contains(viewMapKey) && !z11) {
                    viewM8027a.setOnTouchListener(C5523c.m8067a(mapping, rootView, viewM8027a));
                    this.listenerSet.add(viewMapKey);
                }
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            m8024f();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            m8024f();
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            if (!C42757a.m93689d(this)) {
                try {
                    if (!C42757a.m93689d(this)) {
                        try {
                            FetchedAppSettings fetchedAppSettingsM9975f = FetchedAppSettingsManager.m9975f(C5501a.m7800n());
                            if (fetchedAppSettingsM9975f != null && fetchedAppSettingsM9975f.getCodelessEventsEnabled()) {
                                List<EventBinding> array = EventBinding.INSTANCE.parseArray(fetchedAppSettingsM9975f.getEventBindings());
                                this.eventBindings = array;
                                if (array != null && (view = this.rootView.get()) != null) {
                                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                                    if (viewTreeObserver.isAlive()) {
                                        viewTreeObserver.addOnGlobalLayoutListener(this);
                                        viewTreeObserver.addOnScrollChangedListener(this);
                                    }
                                    m8024f();
                                }
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

    /* JADX INFO: renamed from: com.facebook.appevents.codeless.CodelessMatcher$a */
    /* JADX INFO: compiled from: CodelessMatcher.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/facebook/appevents/codeless/CodelessMatcher$a;", "", "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "", "viewMapKey", "<init>", "(Landroid/view/View;Ljava/lang/String;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Landroid/view/View;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C5517a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public final WeakReference<View> view;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String viewMapKey;

        @Nullable
        /* JADX INFO: renamed from: a */
        public final View m8027a() {
            WeakReference<View> weakReference = this.view;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getViewMapKey() {
            return this.viewMapKey;
        }

        public C5517a(@NotNull View view, @NotNull String viewMapKey) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(viewMapKey, "viewMapKey");
            this.view = new WeakReference<>(view);
            this.viewMapKey = viewMapKey;
        }
    }

    public /* synthetic */ CodelessMatcher(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public CodelessMatcher() {
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        Set<Activity> setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        Intrinsics.checkNotNullExpressionValue(setNewSetFromMap, "newSetFromMap(WeakHashMap())");
        this.activitiesSet = setNewSetFromMap;
        this.viewMatchers = new LinkedHashSet();
        this.listenerSet = new HashSet<>();
        this.activityToListenerMap = new HashMap<>();
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ CodelessMatcher m8010b() {
        if (C42757a.m93689d(CodelessMatcher.class)) {
            return null;
        }
        try {
            return f7747h;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, CodelessMatcher.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ String m8011c() {
        if (C42757a.m93689d(CodelessMatcher.class)) {
            return null;
        }
        try {
            return f7746g;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, CodelessMatcher.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ void m8012d(CodelessMatcher codelessMatcher) {
        if (C42757a.m93689d(CodelessMatcher.class)) {
            return;
        }
        try {
            f7747h = codelessMatcher;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, CodelessMatcher.class);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m8013j(CodelessMatcher this$0) {
        if (C42757a.m93689d(CodelessMatcher.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.m8016g();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, CodelessMatcher.class);
        }
    }

    @UiThread
    /* JADX INFO: renamed from: e */
    public final void m8014e(@NotNull Activity activity) {
        if (!C42757a.m93689d(this)) {
            try {
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (C38449h.m86714b()) {
                    return;
                }
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    this.activitiesSet.add(activity);
                    this.listenerSet.clear();
                    HashSet<String> hashSet = this.activityToListenerMap.get(Integer.valueOf(activity.hashCode()));
                    if (hashSet != null) {
                        this.listenerSet = hashSet;
                    }
                    m8018i();
                    return;
                }
                throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }

    @UiThread
    /* JADX INFO: renamed from: f */
    public final void m8015f(@NotNull Activity activity) {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activityToListenerMap.remove(Integer.valueOf(activity.hashCode()));
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m8016g() {
        if (!C42757a.m93689d(this)) {
            try {
                for (Activity activity : this.activitiesSet) {
                    if (activity != null) {
                        View viewM88610e = C40258g.m88610e(activity);
                        String activityName = activity.getClass().getSimpleName();
                        Handler handler = this.uiThreadHandler;
                        HashSet<String> hashSet = this.listenerSet;
                        Intrinsics.checkNotNullExpressionValue(activityName, "activityName");
                        this.viewMatchers.add(new ViewMatcher(viewM88610e, handler, hashSet, activityName));
                    }
                }
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }

    @UiThread
    /* JADX INFO: renamed from: h */
    public final void m8017h(@NotNull Activity activity) {
        if (!C42757a.m93689d(this)) {
            try {
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (C38449h.m86714b()) {
                    return;
                }
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    this.activitiesSet.remove(activity);
                    this.viewMatchers.clear();
                    HashMap<Integer, HashSet<String>> map = this.activityToListenerMap;
                    Integer numValueOf = Integer.valueOf(activity.hashCode());
                    Object objClone = this.listenerSet.clone();
                    Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type java.util.HashSet<kotlin.String>{ kotlin.collections.TypeAliasesKt.HashSet<kotlin.String> }");
                    map.put(numValueOf, (HashSet) objClone);
                    this.listenerSet.clear();
                    return;
                }
                throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m8018i() {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                m8016g();
            } else {
                this.uiThreadHandler.post(new Runnable() { // from class: c3.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        CodelessMatcher.m8013j(this.f4841b);
                    }
                });
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }
}
