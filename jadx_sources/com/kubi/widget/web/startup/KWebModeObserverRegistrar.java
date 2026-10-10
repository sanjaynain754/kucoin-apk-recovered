package com.kubi.widget.web.startup;

import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.widget.web.startup.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KWebStartupDependencies.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R \u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/widget/web/startup/KWebModeObserverRegistrar;", "", "postToMain", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "register", "block", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKWebStartupDependencies.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KWebStartupDependencies.kt\ncom/kubi/widget/web/startup/KWebModeObserverRegistrar\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,131:1\n19#2,2:132\n*S KotlinDebug\n*F\n+ 1 KWebStartupDependencies.kt\ncom/kubi/widget/web/startup/KWebModeObserverRegistrar\n*L\n124#1:132,2\n*E\n"})
public final class KWebModeObserverRegistrar {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Function1<Function0<Unit>, Unit> f55240a;

    /* JADX WARN: Multi-variable type inference failed */
    public KWebModeObserverRegistrar(@NotNull Function1<? super Function0<Unit>, Unit> postToMain) {
        Intrinsics.checkNotNullParameter(postToMain, "postToMain");
        this.f55240a = postToMain;
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m67397c(final Function0 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.widget.web.startup.d
            @Override // java.lang.Runnable
            public final void run() {
                KWebModeObserverRegistrar.m67398d(block);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public final void m67399e(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f55240a.invoke(block);
    }

    public /* synthetic */ KWebModeObserverRegistrar(Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new Function1() { // from class: com.kubi.widget.web.startup.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KWebModeObserverRegistrar.m67397c((Function0) obj);
            }
        } : function1);
    }

    /* JADX INFO: renamed from: d */
    public static final void m67398d(Function0 function0) {
        function0.invoke();
    }
}
