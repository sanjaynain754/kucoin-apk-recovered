package com.kubi.data;

import android.media.AudioAttributes;
import android.media.SoundPool;
import com.kubi.data.exception.CoinDataMessage;
import com.kubi.sdk.BaseApplication;
import com.kubi.utils.DataMapUtil;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: BeepHelperV2.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000eH\u0007J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000eH\u0002J\u0006\u0010\u0017\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/data/BeepHelperV2;", "", "<init>", "()V", "BEEP", "", "BEEP_LOGIN", "BEEP_INCOME", "BEEP_TRANSFER", "BEEP_REVOKE", "BEEP_OUTCOME", "scope", "Lkotlinx/coroutines/CoroutineScope;", "MAX_STREAM", "", "soundPool", "Landroid/media/SoundPool;", "initSoundPool", "", "play", "key", "raw", "playInternal", "release", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBeepHelperV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeepHelperV2.kt\ncom/kubi/data/BeepHelperV2\n+ 2 CoinDataIssue.kt\ncom/kubi/data/exception/CoinDataIssueKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,90:1\n51#2,2:91\n47#3,4:93\n*S KotlinDebug\n*F\n+ 1 BeepHelperV2.kt\ncom/kubi/data/BeepHelperV2\n*L\n84#1:91,2\n27#1:93,4\n*E\n"})
public final class BeepHelperV2 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final BeepHelperV2 f21336a = new BeepHelperV2();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final InterfaceC41709m0 f21337b = C41713n0.m91125a(C41727q2.m91192b(null, 1, null).plus(C42911a.m94121c()).plus(new C12484a(CoroutineExceptionHandler.INSTANCE)));

    /* JADX INFO: renamed from: c */
    @Nullable
    public static SoundPool f21338c;

    /* JADX INFO: renamed from: com.kubi.data.BeepHelperV2$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 BeepHelperV2.kt\ncom/kubi/data/BeepHelperV2\n*L\n1#1,49:1\n29#2,2:50\n28#2,5:52\n*E\n"})
    public static final class C12484a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C44128b.m97263g("BeepHelperV2", exception);
        }

        public C12484a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m23478g() {
        try {
            SoundPool soundPool = f21338c;
            if (soundPool != null) {
                soundPool.release();
            }
            f21338c = null;
        } catch (Exception e11) {
            C43846g.m96568c(new CoinDataMessage("BeepHelper Release Exception = " + e11, "BeepHelperV2", false, 4, null), null, 2, null);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m23474d(@NotNull String key, int i11) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (i11 != 0 && DataMapUtil.f54245a.m66370a(key, true)) {
            f21336a.m23476c();
            C43840a.m96551e("BeepHelper SoundPool", null, 2, null);
            C41696j.m91104d(f21337b, null, null, new BeepHelperV2$play$1(i11, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m23475f(int i11, SoundPool soundPool, SoundPool soundPool2, int i12, int i13) {
        if (i12 == i11 && i13 == 0) {
            soundPool.play(i12, 1.0f, 1.0f, 1, 0, 1.0f);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m23476c() {
        if (f21338c == null) {
            f21338c = new SoundPool.Builder().setMaxStreams(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(13).setContentType(4).build()).build();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m23477e(int i11) {
        final SoundPool soundPool = f21338c;
        if (soundPool == null) {
            return;
        }
        final int iLoad = soundPool.load(BaseApplication.INSTANCE.get(), i11, 1);
        soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: com.kubi.data.f
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool2, int i12, int i13) {
                BeepHelperV2.m23475f(iLoad, soundPool, soundPool2, i12, i13);
            }
        });
    }
}
