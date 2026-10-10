package com.kubi.config.kcrc;

import android.provider.Settings;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.config.Config;
import com.kubi.utils.C27059l;
import com.tencent.bugly.proguard.C33820nf;
import io.reactivex.disposables.Disposable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.config.kcrc.l */
/* JADX INFO: compiled from: KCRemoteConfigUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lio/reactivex/disposables/Disposable;", "", "b", "(Lio/reactivex/disposables/Disposable;)V", "", "msg", "d", "(Ljava/lang/String;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "defaultValue", "c", "(Ljava/lang/String;)Ljava/lang/String;", "Config_release"}, m90085k = 2, m90086mv = {1, 7, 1}, m90088xi = 48)
public final class C11426l {
    /* JADX INFO: renamed from: a */
    public static final void m20568a(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        C44128b.m97259c("Config-KCRC", msg);
    }

    /* JADX INFO: renamed from: b */
    public static final void m20569b(@Nullable Disposable disposable) {
        Object objM103844constructorimpl;
        Config configM20528H;
        Function1<Throwable, Unit> function1M20447c;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (disposable != null) {
                disposable.dispose();
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl == null || (configM20528H = KCRemoteConfigFetcher.f19652a.m20528H()) == null || (function1M20447c = configM20528H.m20447c()) == null) {
            return;
        }
        function1M20447c.invoke(thM103847exceptionOrNullimpl);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m20570c(@NotNull String defaultValue) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        try {
            Result.Companion companion = Result.INSTANCE;
            String langs = Settings.System.getString(C27059l.f54343a.m66757a().getApplicationContext().getContentResolver(), "system_locales");
            Intrinsics.checkNotNullExpressionValue(langs, "langs");
            String str = (String) StringsKt.split$default((CharSequence) langs, new String[]{","}, false, 0, 6, (Object) null).get(0);
            String strSubstring = str.substring(StringsKt.lastIndexOf$default((CharSequence) str, C33820nf.f71144W, 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            objM103844constructorimpl = Result.m103844constructorimpl(strSubstring);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Object obj = defaultValue;
        if (!Result.m103850isFailureimpl(objM103844constructorimpl)) {
            obj = objM103844constructorimpl;
        }
        return (String) obj;
    }

    /* JADX INFO: renamed from: d */
    public static final void m20571d(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        C44128b.m97268l("Config-KCRC", msg);
    }
}
