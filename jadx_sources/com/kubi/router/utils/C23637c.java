package com.kubi.router.utils;

import android.content.Intent;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.router.utils.c */
/* JADX INFO: compiled from: IntentUtils.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/router/utils/c;", "", "<init>", "()V", "Landroid/content/Intent;", "intent", "", "key", "b", "(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/String;", "", "default", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Intent;Ljava/lang/String;Z)Z", "RouterSDK_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIntentUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntentUtils.kt\ncom/kubi/router/utils/IntentUtils\n+ 2 RouteEx.kt\ncom/kubi/router/utils/RouteExKt\n*L\n1#1,127:1\n166#2:128\n305#2:129\n*S KotlinDebug\n*F\n+ 1 IntentUtils.kt\ncom/kubi/router/utils/IntentUtils\n*L\n120#1:128\n120#1:129\n*E\n"})
public final class C23637c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C23637c f46218a = new C23637c();

    @Deprecated(message = "请使用兼容原生compatBoolean方法", replaceWith = @ReplaceWith(expression = "RouteExKt.compatBoolean()", imports = {}))
    /* JADX INFO: renamed from: a */
    public final boolean m56296a(@NotNull Intent intent, @NotNull String key, boolean z11) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(key, "key");
        Boolean boolM56220K = RouteExKt.m56220K(intent, key);
        return boolM56220K != null ? boolM56220K.booleanValue() : z11;
    }

    @Deprecated(message = "请使用兼容原生compatString方法", replaceWith = @ReplaceWith(expression = "RouteExKt.compatString()", imports = {}))
    @Nullable
    /* JADX INFO: renamed from: b */
    public final String m56297b(@NotNull Intent intent, @NotNull String key) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(key, "key");
        return RouteExKt.m56237a0(intent, key);
    }
}
