package com.kubi.utils;

import androidx.media3.exoplayer.upstream.CmcdData;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.utils.x0 */
/* JADX INFO: compiled from: SyncUtils.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\f\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\u000b\"2\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\rj\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002`\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m90084d2 = {"", "flag", "", "force", "Lkotlin/Function0;", "", "run", "b", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V", "block", "d", "(Lkotlin/jvm/functions/Function0;)V", "e", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/HashMap;", "flags", "Utils_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C27100x0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static HashMap<String, Boolean> f54461a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public static final void m66921b(@NotNull final String flag, boolean z11, @NotNull final Function0<Unit> run) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        Intrinsics.checkNotNullParameter(run, "run");
        synchronized (f54461a) {
            if (!z11) {
                if (f54461a.containsKey(flag) && Intrinsics.areEqual(f54461a.get(flag), Boolean.TRUE)) {
                    return;
                }
            }
            f54461a.put(flag, Boolean.TRUE);
            Unit unit = Unit.INSTANCE;
            Schedulers.m87969io().scheduleDirect(new Runnable() { // from class: com.kubi.utils.w0
                @Override // java.lang.Runnable
                public final void run() {
                    C27100x0.m66922c(run, flag);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m66922c(Function0 run, String flag) {
        Intrinsics.checkNotNullParameter(run, "$run");
        Intrinsics.checkNotNullParameter(flag, "$flag");
        try {
            run.invoke();
        } catch (Throwable unused) {
            synchronized (f54461a) {
                f54461a.put(flag, Boolean.FALSE);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m66923d(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            block.invoke();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m66924e(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            block.invoke();
        } catch (Throwable unused) {
        }
    }
}
