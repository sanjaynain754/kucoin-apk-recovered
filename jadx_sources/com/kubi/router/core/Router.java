package com.kubi.router.core;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.router.core.Router;
import com.kubi.router.exception.RouterException;
import com.kubi.router.model.IRedirect;
import com.kubi.router.p112ui.HolderActivity;
import com.kubi.router.utils.C23636b;
import com.kubi.router.utils.RouteExKt;
import cy.C36556c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026ay.C4400a;
import p569qq.C43846g;
import p705vx.InterfaceC45660a;
import p705vx.InterfaceC45661b;
import p740wx.C45939a;
import p846zx.C46937c;
import p846zx.C46938d;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: Router.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001KB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0004\b \u0010!J+\u0010#\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010\"\u001a\u00020\n¢\u0006\u0004\b#\u0010$J'\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%\"\u0004\b\u0000\u0010\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0004\b&\u0010'J/\u0010*\u001a\u00020\u00132\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e0(2\u0006\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b*\u0010+J\u001b\u0010-\u001a\u00020\u0006*\u00020,2\u0006\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b-\u0010.J#\u00100\u001a\u00020\u0013*\u00020,2\u0006\u0010/\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b0\u00101J\u0013\u00102\u001a\u00020\u0013*\u00020\nH\u0002¢\u0006\u0004\b2\u00103R\u0016\u00105\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u00104R?\u0010)\u001a&\u0012\u0004\u0012\u00020\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e06j\u0012\u0012\u0004\u0012\u00020\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e`78BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R!\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00010<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b>\u0010?R-\u0010E\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010<0A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u00109\u001a\u0004\bC\u0010DR!\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00010<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\bF\u0010?R!\u0010J\u001a\b\u0012\u0004\u0012\u00020H0<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u00109\u001a\u0004\bI\u0010?¨\u0006L"}, m90084d2 = {"Lcom/kubi/router/core/Router;", "", "<init>", "()V", "Lcom/kubi/router/core/RouterConfig;", "_config", "", "q", "(Lcom/kubi/router/core/RouterConfig;)V", "w", "", "uriString", "Lay/a;", "f", "(Ljava/lang/String;)Lay/a;", "Landroid/os/Bundle;", "bundle", "g", "(Ljava/lang/String;Landroid/os/Bundle;)Lay/a;", "", "v", "(Landroid/os/Bundle;)Z", "Landroid/content/Intent;", "intent", "u", "(Landroid/content/Intent;)Z", "postcard", "t", "(Lay/a;)Z", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "cls", "n", "(Ljava/lang/Class;)Ljava/lang/Object;", "flavor", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/lang/Class;)Ljava/util/List;", "", "routes", "b", "(Ljava/util/Map;Lay/a;)Z", "Landroid/content/Context;", CmcdData.Factory.STREAMING_FORMAT_SS, "(Landroid/content/Context;Lay/a;)V", "realIntent", "r", "(Landroid/content/Context;Landroid/content/Intent;Lay/a;)Z", "p", "(Ljava/lang/String;)Z", "Lcom/kubi/router/core/RouterConfig;", "config", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "c", "Lkotlin/Lazy;", "m", "()Ljava/util/HashMap;", "", "d", "o", "()Ljava/util/List;", "services", "", "e", "i", "()Ljava/util/Map;", "flavorServices", "k", "receivers", "Lzx/d;", "j", "interceptors", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "RouterSDK_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SuppressLint({"StaticFieldLeak"})
@SourceDebugExtension({"SMAP\nRouter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Router.kt\ncom/kubi/router/core/Router\n+ 2 RouterIssue.kt\ncom/kubi/router/exception/RouterIssueKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,299:1\n44#2,2:300\n1549#3:302\n1620#3,3:303\n1855#3,2:307\n1#4:306\n19#5,2:309\n*S KotlinDebug\n*F\n+ 1 Router.kt\ncom/kubi/router/core/Router\n*L\n106#1:300,2\n150#1:302\n150#1:303,3\n183#1:307,2\n215#1:309,2\n*E\n"})
public final class Router {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static RouterConfig config;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Router f46192a = new Router();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Lazy routes = LazyKt.lazy(new Function0<HashMap<String, Class<?>>>() { // from class: com.kubi.router.core.Router$routes$2
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final HashMap<String, Class<?>> invoke() {
            Object objM103844constructorimpl;
            HashMap<String, Class<?>> map = new HashMap<>();
            try {
                Result.Companion companion = Result.INSTANCE;
                new C45939a().m101380d(map);
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C43846g.m96568c(new RouterException(thM103847exceptionOrNullimpl, "Router", false, null, 8, null), null, 2, null);
            }
            return map;
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Lazy services = LazyKt.lazy(new Function0<List<Object>>() { // from class: com.kubi.router.core.Router$services$2
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final List<Object> invoke() {
            Object objM103844constructorimpl;
            ArrayList arrayList = new ArrayList();
            try {
                Result.Companion companion = Result.INSTANCE;
                new C45939a().m101381e(arrayList);
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C43846g.m96568c(new RouterException(thM103847exceptionOrNullimpl, "Router", false, null, 8, null), null, 2, null);
            }
            return arrayList;
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Lazy flavorServices = LazyKt.lazy(new Function0<Map<String, List<Object>>>() { // from class: com.kubi.router.core.Router$flavorServices$2
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final Map<String, List<Object>> invoke() {
            Object objM103844constructorimpl;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                Result.Companion companion = Result.INSTANCE;
                new C45939a().m101377a(linkedHashMap);
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C43846g.m96568c(new RouterException(thM103847exceptionOrNullimpl, "Router", false, null, 8, null), null, 2, null);
            }
            return linkedHashMap;
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Lazy receivers = LazyKt.lazy(new Function0<List<Object>>() { // from class: com.kubi.router.core.Router$receivers$2
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final List<Object> invoke() {
            Object objM103844constructorimpl;
            ArrayList arrayList = new ArrayList();
            try {
                Result.Companion companion = Result.INSTANCE;
                new C45939a().m101379c(arrayList);
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C43846g.m96568c(new RouterException(thM103847exceptionOrNullimpl, "Router", false, null, 8, null), null, 2, null);
            }
            return arrayList;
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final Lazy interceptors = LazyKt.lazy(new Function0<List<C46938d>>() { // from class: com.kubi.router.core.Router$interceptors$2
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final List<C46938d> invoke() {
            Object objM103844constructorimpl;
            ArrayList arrayList = new ArrayList();
            try {
                Result.Companion companion = Result.INSTANCE;
                arrayList.add(new C46938d(new Router.C23633a(Router.f46192a.m56191m()), null, 2, null));
                new C45939a().m101378b(arrayList);
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C43846g.m96568c(new RouterException(thM103847exceptionOrNullimpl, "Router", false, null, 8, null), null, 2, null);
            }
            return arrayList;
        }
    });

    /* JADX INFO: renamed from: com.kubi.router.core.Router$a */
    /* JADX INFO: compiled from: Router.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/router/core/Router$a;", "Lzx/b;", "", "", "Ljava/lang/Class;", "routes", "<init>", "(Ljava/util/Map;)V", "Lzx/a;", "chain", "", "b", "(Lzx/a;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/Map;", "RouterSDK_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class C23633a implements InterfaceC46936b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Map<String, Class<?>> routes;

        /* JADX WARN: Multi-variable type inference failed */
        public C23633a(@NotNull Map<String, ? extends Class<?>> routes) {
            Intrinsics.checkNotNullParameter(routes, "routes");
            this.routes = routes;
        }

        @Override // p846zx.InterfaceC46936b
        /* JADX INFO: renamed from: b */
        public boolean mo4304b(@NotNull InterfaceC46935a chain) {
            Intrinsics.checkNotNullParameter(chain, "chain");
            return Router.f46192a.m56183b(this.routes, chain.getPostcard());
        }
    }

    /* JADX INFO: renamed from: v */
    public final boolean m56200v(@Nullable Bundle bundle) {
        boolean z11;
        boolean z12;
        if (bundle == null) {
            return false;
        }
        String strM56233X = RouteExKt.m56233X(bundle);
        if (strM56233X != null) {
            C44128b.m97266j("Router", "redirectUri = " + strM56233X);
            f46192a.m56184f(strM56233X).m4048k();
            z11 = true;
        } else {
            z11 = false;
        }
        IRedirect iRedirectM56232W = RouteExKt.m56232W(bundle);
        if (iRedirectM56232W != null) {
            C44128b.m97266j("Router", "redirectCall = " + iRedirectM56232W);
            iRedirectM56232W.mo45709a();
            z12 = true;
        } else {
            z12 = false;
        }
        return z11 || z12;
    }

    /* JADX INFO: renamed from: c */
    public static final void m56180c(Context context, C4400a postcard) throws IllegalAccessException, InstantiationException {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(postcard, "$postcard");
        f46192a.m56197s(context, postcard);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final C4400a m56184f(@NotNull String uriString) {
        Intrinsics.checkNotNullParameter(uriString, "uriString");
        return m56185g(uriString, null);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final C4400a m56185g(@NotNull String uriString, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(uriString, "uriString");
        RouterConfig routerConfig = null;
        if (StringsKt.startsWith$default(uriString, "http", false, 2, (Object) null)) {
            uriString = Uri.decode(uriString);
        }
        Intrinsics.checkNotNull(uriString);
        if (!m56194p(uriString)) {
            StringBuilder sb2 = new StringBuilder();
            RouterConfig routerConfig2 = config;
            if (routerConfig2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("config");
            } else {
                routerConfig = routerConfig2;
            }
            sb2.append(routerConfig.getInternal());
            sb2.append("://");
            sb2.append(uriString);
            uriString = sb2.toString();
        }
        Uri uri = Uri.parse(uriString);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        if (bundle == null) {
            bundle = new Bundle();
        }
        return new C4400a(uri, bundle);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final <T> T m56186h(@NotNull Class<T> cls, @NotNull String flavor) throws RuntimeException {
        T next;
        Intrinsics.checkNotNullParameter(cls, "cls");
        Intrinsics.checkNotNullParameter(flavor, "flavor");
        if (cls.getAnnotation(InterfaceC45660a.class) == null) {
            throw new RuntimeException("请确认" + cls.getCanonicalName() + "是否申明FlavorProxy注解");
        }
        List<Object> list = m56187i().get(flavor);
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (cls.isInstance(next)) {
                }
            }
            next = null;
        } else {
            next = null;
        }
        if (next == null) {
            return null;
        }
        return next;
    }

    /* JADX INFO: renamed from: i */
    public final Map<String, List<Object>> m56187i() {
        return (Map) flavorServices.getValue();
    }

    /* JADX INFO: renamed from: j */
    public final List<C46938d> m56188j() {
        return (List) interceptors.getValue();
    }

    /* JADX INFO: renamed from: k */
    public final List<Object> m56189k() {
        return (List) receivers.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final <T> List<T> m56190l(@NotNull Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "cls");
        return CollectionsKt.filterIsInstance(m56189k(), cls);
    }

    /* JADX INFO: renamed from: m */
    public final HashMap<String, Class<?>> m56191m() {
        return (HashMap) routes.getValue();
    }

    /* JADX INFO: renamed from: n */
    public final <T> T m56192n(@NotNull Class<T> cls) throws RuntimeException {
        T next;
        Intrinsics.checkNotNullParameter(cls, "cls");
        if (cls.getAnnotation(InterfaceC45661b.class) == null) {
            throw new RuntimeException("请确认" + cls.getCanonicalName() + "是否申明Proxy注解");
        }
        Iterator<T> it = m56193o().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!cls.isInstance(next));
        T t11 = next != null ? next : null;
        if (t11 != null) {
            return t11;
        }
        throw new RuntimeException("请确认" + cls.getCanonicalName() + "子类是否申明Service注解");
    }

    /* JADX INFO: renamed from: o */
    public final List<Object> m56193o() {
        return (List) services.getValue();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m56194p(String str) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Matcher matcher = Pattern.compile("[a-zA-Z_][a-zA-Z0-9]*://").matcher(str);
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(matcher.find() && matcher.start() == 0));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            RouterConfig routerConfig = config;
            if (routerConfig == null) {
                Intrinsics.throwUninitializedPropertyAccessException("config");
                routerConfig = null;
            }
            routerConfig.m56203b().invoke(str, thM103847exceptionOrNullimpl);
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = bool;
        }
        return ((Boolean) objM103844constructorimpl).booleanValue();
    }

    /* JADX INFO: renamed from: q */
    public final void m56195q(@NotNull RouterConfig _config) {
        Intrinsics.checkNotNullParameter(_config, "_config");
        config = _config;
        C23636b.m56291e(_config.getContext());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public final boolean m56198t(@NotNull C4400a postcard) {
        Object objM103844constructorimpl;
        List<C46938d> listM56188j;
        Intrinsics.checkNotNullParameter(postcard, "postcard");
        RouterConfig routerConfig = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        try {
            Result.Companion companion = Result.INSTANCE;
            List<InterfaceC46936b> listM4043f = postcard.m4043f();
            if (listM4043f != null) {
                listM4043f.add(0, new C23633a(f46192a.m56191m()));
                listM56188j = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(listM4043f, 10));
                Iterator<T> it = listM4043f.iterator();
                while (it.hasNext()) {
                    listM56188j.add(new C46938d((InterfaceC46936b) it.next(), objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0));
                }
            } else {
                listM56188j = f46192a.m56188j();
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(new C46937c(listM56188j, listM56188j.size() - 1, postcard).mo103413a(postcard)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            RouterConfig routerConfig2 = config;
            if (routerConfig2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("config");
            } else {
                routerConfig = routerConfig2;
            }
            Function2<String, Throwable, Unit> function2M56203b = routerConfig.m56203b();
            String string = postcard.getUri().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            function2M56203b.invoke(string, thM103847exceptionOrNullimpl);
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = bool;
        }
        return ((Boolean) objM103844constructorimpl).booleanValue();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m56199u(@Nullable Intent intent) {
        return m56200v(intent != null ? intent.getExtras() : null);
    }

    /* JADX INFO: renamed from: w */
    public final void m56201w() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(f46192a.m56188j());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new RouterException(thM103847exceptionOrNullimpl, "Router", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m56183b(Map<String, ? extends Class<?>> routes2, final C4400a postcard) throws IllegalAccessException, InstantiationException {
        String scheme = postcard.getUri().getScheme();
        String strM56216G = RouteExKt.m56216G(postcard.getUri());
        C44128b.m97266j("Router", "navigation uri = " + postcard.getUri());
        final Context contextM56289c = C23636b.m56289c();
        if (contextM56289c != null) {
            RouterConfig routerConfig = config;
            if (routerConfig == null) {
                Intrinsics.throwUninitializedPropertyAccessException("config");
                routerConfig = null;
            }
            if (Intrinsics.areEqual(scheme, routerConfig.getInternal())) {
                if (routes2.containsKey("activity://" + strM56216G)) {
                    Intent intent = new Intent(contextM56289c, routes2.get("activity://" + strM56216G));
                    intent.putExtras(postcard.getBundle());
                    return m56196r(contextM56289c, intent, postcard);
                }
                if (routes2.containsKey("fragment://" + strM56216G)) {
                    Intent intent2 = new Intent(contextM56289c, Class.forName(RouteExKt.m56241c0(postcard.getBundle(), "activity", "com.kubi.sdk.BaseActivity")));
                    Class<?> cls = routes2.get("fragment://" + strM56216G);
                    Intrinsics.checkNotNull(cls);
                    intent2.putExtra("fragment", cls.getName());
                    intent2.putExtras(postcard.getBundle());
                    return m56196r(contextM56289c, intent2, postcard);
                }
                if (routes2.containsKey("dialog://" + strM56216G)) {
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        m56197s(contextM56289c, postcard);
                        return true;
                    }
                    C42917g.m94139e().execute(new Runnable() { // from class: wx.b
                        @Override // java.lang.Runnable
                        public final void run() throws IllegalAccessException, InstantiationException {
                            Router.m56180c(contextM56289c, postcard);
                        }
                    });
                    return true;
                }
                throw new RuntimeException("未找到对应路由:" + strM56216G);
            }
            return m56196r(contextM56289c, new Intent("android.intent.action.VIEW", postcard.getUri()), postcard);
        }
        throw new RuntimeException("Failed to get context");
    }

    /* JADX INFO: renamed from: r */
    public final boolean m56196r(Context context, Intent intent, C4400a c4400a) {
        if (c4400a.m4046i() != null) {
            HolderActivity.m56208G(new C36556c(intent, c4400a.m4046i()));
            intent = new Intent(context, (Class<?>) HolderActivity.class);
        }
        if (!(context instanceof Activity)) {
            intent.setFlags(c4400a.m4042e() | 268435456);
        } else {
            intent.setFlags(c4400a.m4042e());
        }
        context.startActivity(intent);
        return true;
    }

    /* JADX INFO: renamed from: s */
    public final void m56197s(Context context, C4400a c4400a) throws IllegalAccessException, InstantiationException {
        Class<?> cls = m56191m().get("dialog://" + RouteExKt.m56216G(c4400a.getUri()));
        Intrinsics.checkNotNull(cls);
        Object objNewInstance = Class.forName(cls.getName()).newInstance();
        Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type androidx.fragment.app.DialogFragment");
        DialogFragment dialogFragment = (DialogFragment) objNewInstance;
        dialogFragment.setArguments(c4400a.getBundle());
        if (context instanceof FragmentActivity) {
            dialogFragment.show(((FragmentActivity) context).getSupportFragmentManager(), (String) null);
            return;
        }
        throw new RuntimeException("必须在activity中启动dialog");
    }
}
