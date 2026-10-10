package com.kubi.router.utils;

import android.app.Activity;
import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.C33590cg;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.router.utils.d */
/* JADX INFO: compiled from: RouteEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/router/utils/d;", "", "<init>", "()V", TUIConstants.TUIChat.CALL_BACK, "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)V", ExifInterface.GPS_DIRECTION_TRUE, "", "hashCode", "b", "(I)Ljava/lang/Object;", "Ljava/util/LinkedList;", "Ljava/lang/ref/WeakReference;", "Ljava/util/LinkedList;", C33590cg.f69440j, "RouterSDK_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class C23638d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C23638d f46219a = new C23638d();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final LinkedList<WeakReference<Object>> cache = new LinkedList<>();

    /* JADX INFO: renamed from: a */
    public final synchronized void m56298a(@NotNull Object callback) {
        try {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Context contextM56289c = C23636b.m56289c();
            Activity activity = contextM56289c instanceof Activity ? (Activity) contextM56289c : null;
            if (activity == null) {
                C44128b.m97261e("Router", "没有任何activity跟当前callback绑定");
            } else {
                RouteExKt.m56238b(callback, activity);
            }
            cache.add(new WeakReference<>(callback));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final synchronized <T> T m56299b(int hashCode) {
        try {
            Iterator<WeakReference<Object>> it = cache.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                T t11 = (T) it.next().get();
                if (t11 == null) {
                    it.remove();
                } else if (System.identityHashCode(t11) == hashCode) {
                    return t11;
                }
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
