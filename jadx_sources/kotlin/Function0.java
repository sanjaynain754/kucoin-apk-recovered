package kotlin;

import androidx.media3.exoplayer.upstream.CmcdData;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: b1.c, reason: from Kotlin metadata */
/* JADX INFO: compiled from: Extensions.kt */
/* JADX INFO: loaded from: classes34.dex */
@p852kotlin.Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\"\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m90084d2 = {"Lkotlin/Function0;", "Lokhttp3/Call$Factory;", "initializer", "b", "(Lkotlin/jvm/functions/Function0;)Lokhttp3/Call$Factory;", "Lokhttp3/Headers;", "kotlin.jvm.PlatformType", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lokhttp3/Headers;", "getEMPTY_HEADERS", "()Lokhttp3/Headers;", "EMPTY_HEADERS", "coil-base_release"}, m90085k = 2, m90086mv = {1, 5, 1}, m90088xi = 48)
@JvmName(name = "-Extensions")
public final class Function0 {

    /* JADX INFO: renamed from: a */
    public static final Headers f3850a = new Headers.Builder().build();

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Call.Factory m4234b(@NotNull p852kotlin.jvm.functions.Function0<? extends Call.Factory> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        final p852kotlin.Lazy lazy = p852kotlin.LazyKt.lazy(initializer);
        return new Call.Factory() { // from class: b1.b
            @Override // okhttp3.Call.Factory
            public final Call newCall(Request request) {
                return Function0.m4235c(lazy, request);
            }
        };
    }

    /* JADX INFO: renamed from: c */
    public static final Call m4235c(p852kotlin.Lazy lazy, Request request) {
        Intrinsics.checkNotNullParameter(lazy, "$lazy");
        return ((Call.Factory) lazy.getValue()).newCall(request);
    }
}
