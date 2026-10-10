package com.kubi.data;

import android.media.MediaPlayer;
import android.os.Build;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.data.exception.CoinDataException;
import com.kubi.sdk.BaseApplication;
import com.kubi.utils.DataMapUtil;
import com.kubi.utils.extensions.C27025c;
import io.reactivex.schedulers.Schedulers;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p481ny.C42899b;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.data.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BeepHelper.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0012\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/data/BeepHelper;", "", "<init>", "()V", "TAG", "", "BEEP", "BEEP_LOGIN", "BEEP_INCOME", "BEEP_TRANSFER", "BEEP_REVOKE", "BEEP_OUTCOME", "VIBRATE_BOTTOM", "userSoundPool", "", "getUserSoundPool", "()Z", "userSoundPool$delegate", "Lkotlin/Lazy;", "shouldUseSoundPool", "play", "", "key", "raw", "", "release", "mediaPlayer", "Landroid/media/MediaPlayer;", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBeepHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeepHelper.kt\ncom/kubi/data/BeepHelper\n+ 2 CoinDataIssue.kt\ncom/kubi/data/exception/CoinDataIssueKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,99:1\n45#2,4:100\n45#2,4:111\n35#3,4:104\n39#3:110\n44#4,2:108\n*S KotlinDebug\n*F\n+ 1 BeepHelper.kt\ncom/kubi/data/BeepHelper\n*L\n95#1:100,4\n85#1:111,4\n34#1:104,4\n34#1:110\n34#1:108,2\n*E\n"})
public final class BeepHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final BeepHelper f21474a = new BeepHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f21475b = LazyKt.lazy(new Function0() { // from class: com.kubi.data.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(BeepHelper.m23646l());
        }
    });

    /* JADX INFO: renamed from: com.kubi.data.e$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m23642f(@NotNull String key, final int i11) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (i11 != 0 && DataMapUtil.f54245a.m66370a(key, true)) {
            if (f21474a.m23649k()) {
                BeepHelperV2.m23474d(key, i11);
            } else {
                Schedulers.m87969io().scheduleDirect(new Runnable() { // from class: com.kubi.data.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        BeepHelper.m23643g(i11);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m23643g(int i11) {
        Exception exc;
        MediaPlayer mediaPlayerCreate;
        C43840a.m96551e("BeepHelper MediaPlayer", null, 2, null);
        try {
            mediaPlayerCreate = MediaPlayer.create(BaseApplication.INSTANCE.get(), i11);
            if (mediaPlayerCreate != null) {
                try {
                    mediaPlayerCreate.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.kubi.data.c
                        @Override // android.media.MediaPlayer.OnCompletionListener
                        public final void onCompletion(MediaPlayer mediaPlayer) {
                            BeepHelper.m23644h(mediaPlayer);
                        }
                    });
                } catch (Exception e11) {
                    exc = e11;
                    f21474a.m23648j(mediaPlayerCreate);
                    if (C42899b.m94075e(exc)) {
                        return;
                    }
                    C43846g.m96568c(new CoinDataException(exc, "BeepHelper", false, null, 8, null), null, 2, null);
                    return;
                }
            }
            if (mediaPlayerCreate != null) {
                mediaPlayerCreate.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.kubi.data.d
                    @Override // android.media.MediaPlayer.OnErrorListener
                    public final boolean onError(MediaPlayer mediaPlayer, int i12, int i13) {
                        return BeepHelper.m23645i(mediaPlayer, i12, i13);
                    }
                });
            }
            if (mediaPlayerCreate != null) {
                mediaPlayerCreate.start();
            }
        } catch (Exception e12) {
            exc = e12;
            mediaPlayerCreate = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m23644h(MediaPlayer mediaPlayer) {
        f21474a.m23648j(mediaPlayer);
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m23645i(MediaPlayer mediaPlayer, int i11, int i12) {
        f21474a.m23648j(mediaPlayer);
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m23646l() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_beep_play_v2", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m23647e() {
        return ((Boolean) f21475b.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: j */
    public final void m23648j(MediaPlayer mediaPlayer) {
        if (mediaPlayer != null) {
            try {
                mediaPlayer.reset();
            } catch (Exception e11) {
                if (C42899b.m94075e(e11)) {
                    return;
                }
                C43846g.m96568c(new CoinDataException(e11, "BeepHelper", false, null, 8, null), null, 2, null);
                return;
            }
        }
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m23649k() {
        if (!m23647e()) {
            return false;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 == 31) {
            String str = Build.BRAND;
            if ((StringsKt.equals(str, JPushConstants.Manufacturer.XIAOMI, true) && StringsKt.equals(Build.MODEL, "Redmi Note 9S", true)) || (StringsKt.equals(str, "Deploy PVT LTD", true) && StringsKt.equals(Build.MODEL, "Sparx Neo 7 Ultra", true))) {
                C44128b.m97266j("BeepHelper", "fallback to MediaPlayer on risk device: brand=" + str + ", model=" + Build.MODEL + ", sdk=" + i11);
                return false;
            }
        }
        return true;
    }
}
