package com.kubi.launch;

import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import org.jetbrains.annotations.NotNull;
import p830zf.InterfaceC46801h0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.launch.c */
/* JADX INFO: compiled from: AnimationStrategy.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0082H¢\u0006\u0002\u0010\u000e\"\u001b\u0010\u0000\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"RawLogo", "", "getRawLogo", "()I", "RawLogo$delegate", "Lkotlin/Lazy;", "TAG", "", "showAnimation", "", "context", "Lcom/kubi/launch/LauncherContext;", "animationStrategy", "Lcom/kubi/launch/AnimationStrategy;", "(Lcom/kubi/launch/LauncherContext;Lcom/kubi/launch/AnimationStrategy;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LAppFacade_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAnimationStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationStrategy.kt\ncom/kubi/launch/AnimationStrategyKt\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,314:1\n17#2,2:315\n*S KotlinDebug\n*F\n+ 1 AnimationStrategy.kt\ncom/kubi/launch/AnimationStrategyKt\n*L\n34#1:315,2\n*E\n"})
public final class C17351c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Lazy f31784a = LazyKt.lazy(new Function0() { // from class: com.kubi.launch.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(C17351c.m37442b());
        }
    });

    /* JADX INFO: renamed from: b */
    public static final int m37442b() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46801h0.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            return ((InterfaceC46801h0) objM56186h).m103131b();
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static final int m37444d() {
        return ((Number) f31784a.getValue()).intValue();
    }
}
