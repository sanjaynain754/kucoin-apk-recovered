package p294gz;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.sdk.lib.kucoin.bizcontrol.api.BizControlConfigState;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: gz.c */
/* JADX INFO: compiled from: EmptyBizControl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u000fJ\u001d\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 \u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, m90084d2 = {"Lgz/c;", "Lgz/d;", "<init>", "()V", "Landroid/content/Context;", "context", "", "siteType", "", "isShared", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Ljava/lang/String;Z)V", "uid", "b", "(Ljava/lang/String;)V", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "key", "default", "i", "(Ljava/lang/String;Z)Z", "Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;", "getState", "()Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;", "Lgz/e;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "j", "(Lgz/e;)V", "e", "c", "", "", "g", "()Ljava/util/Map;", "f", "()Z", "", "d", "()J", "biz-control-api_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C38059c implements InterfaceC38060d {
    @Override // p294gz.InterfaceC38060d
    /* JADX INFO: renamed from: f */
    public boolean mo57067f() {
        return false;
    }

    @Override // p294gz.InterfaceC38060d
    @Nullable
    /* JADX INFO: renamed from: g */
    public Map<String, Object> mo57068g() {
        return null;
    }

    @Override // p294gz.InterfaceC38060d
    @Nullable
    /* JADX INFO: renamed from: h */
    public Object mo57069h(@NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(true);
    }

    @Override // p294gz.InterfaceC38060d
    /* JADX INFO: renamed from: a */
    public void mo57062a(@NotNull Context context, @NotNull String siteType, boolean isShared) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(siteType, "siteType");
    }

    @Override // p294gz.InterfaceC38060d
    /* JADX INFO: renamed from: b */
    public void mo57063b(@NotNull String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
    }

    @Override // p294gz.InterfaceC38060d
    /* JADX INFO: renamed from: d */
    public long mo57065d() {
        return 0L;
    }

    @Override // p294gz.InterfaceC38060d
    /* JADX INFO: renamed from: e */
    public void mo57066e(@NotNull InterfaceC38061e listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // p294gz.InterfaceC38060d
    @NotNull
    public BizControlConfigState getState() {
        return BizControlConfigState.SUCCESS;
    }

    @Override // p294gz.InterfaceC38060d
    /* JADX INFO: renamed from: i */
    public boolean mo57070i(@NotNull String key, boolean z11) {
        Intrinsics.checkNotNullParameter(key, "key");
        return z11;
    }

    @Override // p294gz.InterfaceC38060d
    /* JADX INFO: renamed from: j */
    public void mo57071j(@NotNull InterfaceC38061e listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // p294gz.InterfaceC38060d
    /* JADX INFO: renamed from: c */
    public void mo57064c(@Nullable String uid) {
    }
}
