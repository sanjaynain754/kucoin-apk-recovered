package com.kubi.utils;

import android.app.Application;
import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.blankj.utilcode.util.C5258a;
import com.blankj.utilcode.util.C5287o0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.utils.l */
/* JADX INFO: compiled from: ContextUtil.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/utils/l;", "", "<init>", "()V", "Landroid/content/Context;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Landroid/content/Context;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C27059l {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C27059l f54343a = new C27059l();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Context m66757a() {
        try {
            Context contextM6125h = C5258a.m6125h();
            if (contextM6125h == null) {
                contextM6125h = C5287o0.m6331a();
            }
            Intrinsics.checkNotNullExpressionValue(contextM6125h, "{\n            val thisA … Utils.getApp()\n        }");
            return contextM6125h;
        } catch (Exception unused) {
            Application applicationM6331a = C5287o0.m6331a();
            Intrinsics.checkNotNullExpressionValue(applicationM6331a, "{\n            Utils.getApp()\n        }");
            return applicationM6331a;
        }
    }
}
