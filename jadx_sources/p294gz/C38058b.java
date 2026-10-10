package p294gz;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.sdk.lib.kucoin.bizcontrol.api.BizControlConfigState;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: gz.b */
/* JADX INFO: compiled from: BizControlManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u0011J\u001b\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\n¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J!\u0010'\u001a\u00020\n2\u0006\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\nH\u0000¢\u0006\u0004\b'\u0010(R\"\u0010-\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010)\u001a\u0004\b*\u0010!\"\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, m90084d2 = {"Lgz/b;", "", "<init>", "()V", "Lgz/d;", "iBizControl", "Landroid/content/Context;", "context", "", "siteType", "", "isShared", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lgz/d;Landroid/content/Context;Ljava/lang/String;Z)V", "uid", "j", "(Ljava/lang/String;)V", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;", "g", "()Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;", "Lgz/e;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lgz/e;)V", "k", "m", "", "d", "()Ljava/util/Map;", "i", "()Z", "", "b", "()J", "key", "default", "e", "(Ljava/lang/String;Z)Z", "Z", "f", CmcdData.Factory.STREAM_TYPE_LIVE, "(Z)V", "newerRegistReport", "Lgz/d;", "bizControl", "biz-control-api_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C38058b {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean newerRegistReport;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38058b f85672a = new C38058b();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static InterfaceC38060d bizControl = new C38059c();

    /* JADX INFO: renamed from: a */
    public final void m85929a(@NotNull InterfaceC38061e listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        bizControl.mo57071j(listener);
    }

    /* JADX INFO: renamed from: b */
    public final long m85930b() {
        return bizControl.mo57065d();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m85931c(@NotNull Continuation<? super Boolean> continuation) {
        return bizControl.mo57069h(continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Map<String, Object> m85932d() {
        return bizControl.mo57068g();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m85933e(@NotNull String key, boolean z11) {
        Intrinsics.checkNotNullParameter(key, "key");
        InterfaceC38060d interfaceC38060d = bizControl;
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = key.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return interfaceC38060d.mo57070i(lowerCase, z11);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m85934f() {
        return newerRegistReport;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final BizControlConfigState m85935g() {
        return bizControl.getState();
    }

    /* JADX INFO: renamed from: h */
    public final void m85936h(@NotNull InterfaceC38060d iBizControl, @NotNull Context context, @NotNull String siteType, boolean isShared) {
        Intrinsics.checkNotNullParameter(iBizControl, "iBizControl");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        bizControl = iBizControl;
        iBizControl.mo57062a(context, siteType, isShared);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m85937i() {
        return bizControl.mo57067f();
    }

    /* JADX INFO: renamed from: j */
    public final void m85938j(@NotNull String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        bizControl.mo57063b(uid);
    }

    /* JADX INFO: renamed from: k */
    public final void m85939k(@NotNull InterfaceC38061e listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        bizControl.mo57066e(listener);
    }

    /* JADX INFO: renamed from: l */
    public final void m85940l(boolean z11) {
        newerRegistReport = z11;
    }

    /* JADX INFO: renamed from: m */
    public final void m85941m(@NotNull String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        bizControl.mo57064c(uid);
    }
}
