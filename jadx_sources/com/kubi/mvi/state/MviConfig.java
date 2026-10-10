package com.kubi.mvi.state;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.mvi.common.C19241c;
import com.kubi.mvi.common.MVILogSwitchManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MviConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0011\u001a\u0004\b\b\u0010\u0012\"\u0004\b\u0013\u0010\u0014R,\u0010\u001e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\u0004\u0018\u00010\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'R\"\u0010.\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010*\u001a\u0004\b\f\u0010+\"\u0004\b,\u0010-R\"\u00104\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u00100\u001a\u0004\b%\u00101\"\u0004\b2\u00103R\u001b\u00108\u001a\u0002058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b6\u00107R\u001b\u00109\u001a\u0002058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b\u0018\u00107R\u0011\u0010;\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b:\u00107R\u0011\u0010<\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b\u001f\u00107¨\u0006="}, m90084d2 = {"Lcom/kubi/mvi/state/MviConfig;", "", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "viewModelStoreOwner", "<init>", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/ViewModelStoreOwner;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroidx/lifecycle/LifecycleOwner;", "c", "()Landroidx/lifecycle/LifecycleOwner;", "b", "Landroidx/lifecycle/ViewModelStoreOwner;", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Landroidx/lifecycle/ViewModelStoreOwner;", "Landroid/os/Bundle;", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "m", "(Landroid/os/Bundle;)V", "arguments", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "d", "Lkotlin/jvm/functions/Function0;", "j", "()Lkotlin/jvm/functions/Function0;", "o", "(Lkotlin/jvm/functions/Function0;)V", "vmFactoryCreator", "e", "Lkotlin/Lazy;", "i", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "vmFactory", "", "f", "g", "()Ljava/lang/String;", "tag", "Landroid/os/Handler;", "Landroid/os/Handler;", "()Landroid/os/Handler;", "setHandler", "(Landroid/os/Handler;)V", "handler", "Lcom/kubi/mvi/state/g;", "Lcom/kubi/mvi/state/g;", "()Lcom/kubi/mvi/state/g;", "n", "(Lcom/kubi/mvi/state/g;)V", "stateConfig", "", CmcdData.Factory.STREAM_TYPE_LIVE, "()Z", "isOpenLog", "needCatchUIException", "k", "isDebug", "needMeasureTime", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class MviConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final LifecycleOwner lifecycleOwner;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ViewModelStoreOwner viewModelStoreOwner;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Bundle arguments;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Function0<? extends ViewModelProvider.Factory> vmFactoryCreator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Lazy vmFactory;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Lazy tag;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public Handler handler;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public InterfaceC19285g stateConfig;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy isOpenLog;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Lazy needCatchUIException;

    public MviConfig(@NotNull LifecycleOwner lifecycleOwner, @NotNull ViewModelStoreOwner viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.lifecycleOwner = lifecycleOwner;
        this.viewModelStoreOwner = viewModelStoreOwner;
        this.vmFactory = LazyKt.lazy(new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.mvi.state.MviConfig$vmFactory$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final ViewModelProvider.Factory invoke() {
                Function0<ViewModelProvider.Factory> function0M42570j = this.this$0.m42570j();
                if (function0M42570j != null) {
                    return function0M42570j.invoke();
                }
                return null;
            }

            {
                super(0);
            }
        });
        this.tag = LazyKt.lazy(new Function0<String>() { // from class: com.kubi.mvi.state.MviConfig$tag$2
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            public final String invoke() {
                return this.this$0.getLifecycleOwner().getClass().getSimpleName();
            }
        });
        this.handler = new Handler(Looper.getMainLooper());
        this.stateConfig = new C19281c();
        this.isOpenLog = LazyKt.lazy(new Function0<Boolean>() { // from class: com.kubi.mvi.state.MviConfig$isOpenLog$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                return Boolean.valueOf(MVILogSwitchManager.f35617a.m42501b(this.this$0.m42567g()));
            }

            {
                super(0);
            }
        });
        this.needCatchUIException = LazyKt.lazy(new Function0<Boolean>() { // from class: com.kubi.mvi.state.MviConfig$needCatchUIException$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                return Boolean.valueOf(this.this$0.getStateConfig().needCatchUIException() && !this.this$0.m42571k());
            }

            {
                super(0);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Bundle getArguments() {
        return this.arguments;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Handler getHandler() {
        return this.handler;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m42564d() {
        return ((Boolean) this.needCatchUIException.getValue()).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC19285g getStateConfig() {
        return this.stateConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final String m42567g() {
        Object value = this.tag.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (String) value;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final ViewModelStoreOwner getViewModelStoreOwner() {
        return this.viewModelStoreOwner;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final ViewModelProvider.Factory m42569i() {
        return (ViewModelProvider.Factory) this.vmFactory.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final Function0<ViewModelProvider.Factory> m42570j() {
        return this.vmFactoryCreator;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m42571k() {
        return C19241c.f35620a.m42528a();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m42572l() {
        return ((Boolean) this.isOpenLog.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: m */
    public final void m42573m(@Nullable Bundle bundle) {
        this.arguments = bundle;
    }

    /* JADX INFO: renamed from: n */
    public final void m42574n(@NotNull InterfaceC19285g interfaceC19285g) {
        Intrinsics.checkNotNullParameter(interfaceC19285g, "<set-?>");
        this.stateConfig = interfaceC19285g;
    }

    /* JADX INFO: renamed from: o */
    public final void m42575o(@Nullable Function0<? extends ViewModelProvider.Factory> function0) {
        this.vmFactoryCreator = function0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m42565e() {
        return m42571k();
    }
}
