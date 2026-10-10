package p569qq;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: qq.d */
/* JADX INFO: compiled from: MonitorConfigManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0007H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m90084d2 = {"Lqq/d;", "", "Landroid/content/Context;", "context", "", "d", "(Landroid/content/Context;)Ljava/lang/String;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;)Z", "did", "uid", "", "c", "(Ljava/lang/String;Ljava/lang/String;)V", JPushConstants.Message.KEY_FOREGROUND, "e", "(Z)V", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public interface InterfaceC43843d {
    /* JADX INFO: renamed from: a */
    boolean mo42449a(@NotNull Context context);

    @Nullable
    /* JADX INFO: renamed from: b */
    Object mo42450b(@NotNull Continuation<? super String> continuation);

    /* JADX INFO: renamed from: c */
    void mo42451c(@Nullable String did, @Nullable String uid);

    @Nullable
    /* JADX INFO: renamed from: d */
    String mo42452d(@NotNull Context context);

    /* JADX INFO: renamed from: e */
    void mo42453e(boolean isForeground);
}
