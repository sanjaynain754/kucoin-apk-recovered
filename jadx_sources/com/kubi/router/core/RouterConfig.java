package com.kubi.router.core;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Router.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0015B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R)\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/router/core/RouterConfig;", "", "Landroid/content/Context;", "context", "", "internal", "Lkotlin/Function2;", "", "", "handler", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/Context;", "()Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "Builder", "RouterSDK_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class RouterConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String internal;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Function2<String, Throwable, Unit> handler;

    /* JADX INFO: compiled from: Router.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00020\u00002\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R*\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/router/core/RouterConfig$Builder;", "", "<init>", "()V", "", "internal", "c", "(Ljava/lang/String;)Lcom/kubi/router/core/RouterConfig$Builder;", "Lkotlin/Function2;", "", "", "handler", "b", "(Lkotlin/jvm/functions/Function2;)Lcom/kubi/router/core/RouterConfig$Builder;", "Landroid/content/Context;", "context", "Lcom/kubi/router/core/RouterConfig;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;)Lcom/kubi/router/core/RouterConfig;", "Ljava/lang/String;", "Lkotlin/jvm/functions/Function2;", "RouterSDK_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public String internal = "internal";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public Function2<? super String, ? super Throwable, Unit> handler;

        @NotNull
        /* JADX INFO: renamed from: a */
        public final RouterConfig m56205a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this.handler == null) {
                this.handler = new Function2<String, Throwable, Unit>() { // from class: com.kubi.router.core.RouterConfig$Builder$build$1
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(String str, Throwable th2) {
                        invoke2(str, th2);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull String url, @NotNull Throwable error) {
                        Intrinsics.checkNotNullParameter(url, "url");
                        Intrinsics.checkNotNullParameter(error, "error");
                        throw new RuntimeException("Router no handler for url: " + url, error);
                    }
                };
            }
            String str = this.internal;
            Function2<? super String, ? super Throwable, Unit> function2 = this.handler;
            Intrinsics.checkNotNull(function2);
            return new RouterConfig(context, str, function2);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Builder m56206b(@NotNull Function2<? super String, ? super Throwable, Unit> handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            this.handler = handler;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final Builder m56207c(@NotNull String internal) {
            Intrinsics.checkNotNullParameter(internal, "internal");
            this.internal = internal;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RouterConfig(@NotNull Context context, @NotNull String internal, @NotNull Function2<? super String, ? super Throwable, Unit> handler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(internal, "internal");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.context = context;
        this.internal = internal;
        this.handler = handler;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Function2<String, Throwable, Unit> m56203b() {
        return this.handler;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getInternal() {
        return this.internal;
    }
}
