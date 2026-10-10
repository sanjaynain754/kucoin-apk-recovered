package com.kubi.monitor.firebase;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.InterfaceC43843d;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.monitor.firebase.d */
/* JADX INFO: compiled from: FirebaseProvider.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/monitor/firebase/d;", "Lqq/d;", "<init>", "()V", "Landroid/content/Context;", "context", "", "d", "(Landroid/content/Context;)Ljava/lang/String;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;)Z", "did", "uid", "", "c", "(Ljava/lang/String;Ljava/lang/String;)V", JPushConstants.Message.KEY_FOREGROUND, "e", "(Z)V", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Monitor-firebase_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C19222d implements InterfaceC43843d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C19222d f35555a = new C19222d();

    @Override // p569qq.InterfaceC43843d
    /* JADX INFO: renamed from: a */
    public boolean mo42449a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) != 0;
    }

    @Override // p569qq.InterfaceC43843d
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object mo42450b(@NotNull Continuation<? super String> continuation) {
        return FirebaseConfig.f35540a.m42439a(continuation);
    }

    @Override // p569qq.InterfaceC43843d
    /* JADX INFO: renamed from: c */
    public void mo42451c(@Nullable String did, @Nullable String uid) {
        FirebaseConfig.f35540a.m42441c(uid);
    }

    @Override // p569qq.InterfaceC43843d
    @Nullable
    /* JADX INFO: renamed from: d */
    public String mo42452d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(context).getId();
        } catch (Exception e11) {
            C44128b.m97263g("FirebaseProvider", e11);
            return null;
        }
    }

    @Override // p569qq.InterfaceC43843d
    /* JADX INFO: renamed from: e */
    public void mo42453e(boolean isForeground) {
        FirebaseConfig.f35540a.m42440b(isForeground);
    }
}
