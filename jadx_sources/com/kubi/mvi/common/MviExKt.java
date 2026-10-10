package com.kubi.mvi.common;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.blankj.utilcode.util.C5258a;
import com.kubi.monitor.TechnologyEvent;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43840a;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.JvmClassMappingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import ro.C44128b;

/* JADX INFO: compiled from: MviEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000¦\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aZ\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u000221\u0010\u000b\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a6\u0010\u0012\u001a\u00020\t2'\u0010\u0011\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004¢\u0006\u0002\b\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a#\u0010 \u001a\u00020\u000f2\b\b\u0002\u0010\u0006\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b \u0010!\u001a%\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\"H\u0007¢\u0006\u0004\b#\u0010$\u001au\u0010,\u001a\u00020\f*\u00020\u000f2\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010)2\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010)2\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004¢\u0006\u0004\b,\u0010-\u001a'\u0010/\u001a\u00020\t2\b\b\u0002\u0010.\u001a\u00020\u001a2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0)H\u0007¢\u0006\u0004\b/\u00100\u001a\r\u00101\u001a\u00020\u001a¢\u0006\u0004\b1\u00102\u001a/\u00104\u001a\u00020\t*\u00020\u00022\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n03¢\u0006\u0004\b4\u00105\u001a5\u0010=\u001a\u00028\u0000\"\b\b\u0000\u00107*\u000206*\u0002082\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u0000092\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\b=\u0010>\u001a!\u0010A\u001a\u00020\t2\u0006\u0010?\u001a\u00020\u001d2\b\b\u0002\u0010@\u001a\u00020\u001dH\u0000¢\u0006\u0004\bA\u0010B\u001a)\u0010F\u001a\u00020\t*\u00020C2\b\b\u0002\u0010D\u001a\u00020\u001a2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u001dH\u0000¢\u0006\u0004\bF\u0010G\u001aV\u0010J\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010H\u001a\u00020\u000f2-\u0010\u0011\u001a)\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0I¢\u0006\u0002\b\u0010H\u0000¢\u0006\u0004\bJ\u0010K¨\u0006L"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/e;", "Landroidx/lifecycle/LifecycleOwner;", TUIConstants.TUIChat.OWNER, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlinx/coroutines/x1;", "b", "(Lkotlinx/coroutines/flow/e;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;", "Lkotlinx/coroutines/m0;", "Lkotlin/ExtensionFunctionType;", "block", "n", "(Lkotlin/jvm/functions/Function2;)V", "Landroid/app/Activity;", "g", "()Landroid/app/Activity;", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Lkotlinx/coroutines/m0;", "", "", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/lang/Throwable;)Z", "", "Lkotlinx/coroutines/j0;", "dispatchers", "c", "(Ljava/lang/String;Lkotlinx/coroutines/j0;)Lkotlinx/coroutines/m0;", "Lio/reactivex/Observable;", "k", "(Lio/reactivex/Observable;)Lio/reactivex/Observable;", "", "times", "", "delay", "Lkotlin/Function0;", "startAction", "finishAction", "q", "(Lkotlinx/coroutines/m0;IJLkotlinx/coroutines/j0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;", "isDebug", "e", "(ZLkotlin/jvm/functions/Function0;)V", "m", "()Z", "Lkotlin/Function1;", "o", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;)V", "Landroidx/lifecycle/ViewModel;", "M", "Landroidx/lifecycle/ViewModelStoreOwner;", "Lkotlin/reflect/KClass;", "clazz", "Landroidx/lifecycle/ViewModelProvider$Factory;", "viewModelFactory", "i", "(Landroidx/lifecycle/ViewModelStoreOwner;Lkotlin/reflect/KClass;Landroidx/lifecycle/ViewModelProvider$Factory;)Landroidx/lifecycle/ViewModel;", "message", "category", CmcdData.Factory.STREAMING_FORMAT_SS, "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;", "needLog", "logTag", "p", "(Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;ZLjava/lang/String;)V", "scope", "Lkotlin/Function3;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function3;)V", "MVI_release"}, m90085k = 2, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMviEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 2 Timing.kt\nkotlin/system/TimingKt\n+ 3 MviIssue.kt\ncom/kubi/mvi/exception/MviIssueKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n167#1,2:307\n170#1:311\n17#2,6:299\n44#3,2:305\n2634#4:309\n1#5:310\n*S KotlinDebug\n*F\n+ 1 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n276#1:307,2\n276#1:311\n123#1:299,6\n258#1:305,2\n279#1:309\n279#1:310\n*E\n"})
public final class MviExKt {
    /* JADX INFO: renamed from: a */
    public static final <T> void m42505a(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull InterfaceC41709m0 scope, @NotNull Function3<? super InterfaceC41709m0, ? super T, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(interfaceC41634e, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(block, "block");
        C41636g.m90891O(C41636g.m90890N(C41636g.m90896T(interfaceC41634e, new MviExKt$collectOnIO$1(block, scope, null)), C42911a.m94120b()), scope);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> InterfaceC41775x1 m42506b(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull LifecycleOwner owner, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(interfaceC41634e, "<this>");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(action, "action");
        return LifecycleOwnerKt.getLifecycleScope(owner).launchWhenStarted(new MviExKt$collectWhenStart$1(interfaceC41634e, action, null));
    }

    @Deprecated(message = "使用有命周期的Scope")
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final InterfaceC41709m0 m42507c(@NotNull String name, @NotNull AbstractC41697j0 dispatchers) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        return C41713n0.m91125a(C41727q2.m91192b(null, 1, null).plus(new CoroutineName(name)).plus(dispatchers));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC41709m0 m42508d(String str, AbstractC41697j0 abstractC41697j0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = String.valueOf(System.currentTimeMillis());
        }
        if ((i11 & 2) != 0) {
            abstractC41697j0 = C42911a.m94120b();
        }
        return m42507c(str, abstractC41697j0);
    }

    @Deprecated(message = "Deprecated")
    /* JADX INFO: renamed from: e */
    public static final void m42509e(boolean z11, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (z11) {
            block.invoke();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m42510f(boolean z11, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = m42517m();
        }
        m42509e(z11, function0);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final <M extends ViewModel> M m42513i(@NotNull ViewModelStoreOwner viewModelStoreOwner, @NotNull KClass<M> clazz, @Nullable ViewModelProvider.Factory factory) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return factory == null ? (M) new ViewModelProvider(viewModelStoreOwner).get(JvmClassMappingKt.getJavaClass((KClass) clazz)) : (M) new ViewModelProvider(viewModelStoreOwner, factory).get(JvmClassMappingKt.getJavaClass((KClass) clazz));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ ViewModel m42514j(ViewModelStoreOwner viewModelStoreOwner, KClass kClass, ViewModelProvider.Factory factory, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            factory = null;
        }
        return m42513i(viewModelStoreOwner, kClass, factory);
    }

    @Deprecated(message = "Deprecated")
    @NotNull
    /* JADX INFO: renamed from: k */
    public static final <T> Observable<T> m42515k(@NotNull Observable<T> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Observable<T> observableSubscribeOn = observable.observeOn(C42916f.m94127f()).subscribeOn(C42916f.m94127f());
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "subscribeOn(...)");
        return observableSubscribeOn;
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m42516l(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        return th2 instanceof CancellationException;
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m42517m() {
        return C19241c.f35620a.m42528a();
    }

    /* JADX INFO: renamed from: n */
    public static final void m42518n(@NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        InterfaceC41709m0 interfaceC41709m0M42512h = m42512h();
        if (interfaceC41709m0M42512h != null) {
            C41696j.m91104d(interfaceC41709m0M42512h, null, null, new MviExKt$launchOnTopLifecycleStart$1(block, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m42519o(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        LifecycleKt.getCoroutineScope(lifecycleOwner.getLifecycle()).launchWhenStarted(new MviExKt$launchStart$1(action, null));
    }

    /* JADX INFO: renamed from: p */
    public static final void m42520p(@NotNull TechnologyEvent.EventParametersBuilder eventParametersBuilder, boolean z11, @Nullable String str) throws JSONException {
        Intrinsics.checkNotNullParameter(eventParametersBuilder, "<this>");
        if (z11) {
            JSONObject jSONObject = new JSONObject();
            Bundle first = eventParametersBuilder.m42390a().getFirst();
            for (String str2 : first.keySet()) {
                jSONObject.put(str2, first.get(str2));
            }
            C44128b.m97259c(str, jSONObject.toString());
        }
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public static final InterfaceC41775x1 m42521q(@NotNull InterfaceC41709m0 interfaceC41709m0, int i11, long j11, @NotNull AbstractC41697j0 dispatchers, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @NotNull Function2<? super Integer, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(interfaceC41709m0, "<this>");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(action, "action");
        return C41636g.m90891O(C41636g.m90890N(C41636g.m90896T(C41636g.m90887K(new MviExKt$repeatCall$1(function0, i11, function1, j11, null)), new MviExKt$repeatCall$2(action, null)), dispatchers), interfaceC41709m0);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ InterfaceC41775x1 m42522r(InterfaceC41709m0 interfaceC41709m0, int i11, long j11, AbstractC41697j0 abstractC41697j0, Function0 function0, Function0 function1, Function2 function2, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            j11 = 0;
        }
        long j12 = j11;
        if ((i12 & 4) != 0) {
            abstractC41697j0 = C42911a.m94120b();
        }
        return m42521q(interfaceC41709m0, i11, j12, abstractC41697j0, (i12 & 8) != 0 ? null : function0, (i12 & 16) != 0 ? null : function1, function2);
    }

    /* JADX INFO: renamed from: s */
    public static final void m42523s(@NotNull String message, @NotNull String category) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(category, "category");
        C43840a.m96550d(message, category);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m42524t(String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "mvi";
        }
        m42523s(str, str2);
    }

    @Deprecated(message = "Deprecated", replaceWith = @ReplaceWith(expression = "ActivityUtils.getTopActivity()", imports = {}))
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final Activity m42511g() {
        Activity activityM6125h = C5258a.m6125h();
        Intrinsics.checkNotNullExpressionValue(activityM6125h, "getTopActivity(...)");
        return activityM6125h;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static final InterfaceC41709m0 m42512h() {
        ComponentCallbacks2 componentCallbacks2M6125h = C5258a.m6125h();
        if (componentCallbacks2M6125h instanceof LifecycleOwner) {
            return LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) componentCallbacks2M6125h);
        }
        return null;
    }
}
