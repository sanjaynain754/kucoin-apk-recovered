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

/* JADX INFO: renamed from: gz.d */
/* JADX INFO: compiled from: IBizControl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0006H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u001b\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u001c\u0010\rJ\u001d\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001dH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H&¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H&¢\u0006\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, m90084d2 = {"Lgz/d;", "", "Landroid/content/Context;", "context", "", "siteType", "", "isShared", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Ljava/lang/String;Z)V", "uid", "b", "(Ljava/lang/String;)V", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "key", "default", "i", "(Ljava/lang/String;Z)Z", "Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;", "getState", "()Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;", "Lgz/e;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "j", "(Lgz/e;)V", "e", "c", "", "g", "()Ljava/util/Map;", "f", "()Z", "", "d", "()J", "biz-control-api_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC38060d {
    /* JADX INFO: renamed from: a */
    void mo57062a(@NotNull Context context, @NotNull String siteType, boolean isShared);

    /* JADX INFO: renamed from: b */
    void mo57063b(@NotNull String uid);

    /* JADX INFO: renamed from: c */
    void mo57064c(@Nullable String uid);

    /* JADX INFO: renamed from: d */
    long mo57065d();

    /* JADX INFO: renamed from: e */
    void mo57066e(@NotNull InterfaceC38061e listener);

    /* JADX INFO: renamed from: f */
    boolean mo57067f();

    @Nullable
    /* JADX INFO: renamed from: g */
    Map<String, Object> mo57068g();

    @NotNull
    BizControlConfigState getState();

    @Nullable
    /* JADX INFO: renamed from: h */
    Object mo57069h(@NotNull Continuation<? super Boolean> continuation);

    /* JADX INFO: renamed from: i */
    boolean mo57070i(@NotNull String key, boolean z11);

    /* JADX INFO: renamed from: j */
    void mo57071j(@NotNull InterfaceC38061e listener);
}
