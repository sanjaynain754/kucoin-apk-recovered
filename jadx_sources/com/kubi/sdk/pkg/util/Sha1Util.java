package com.kubi.sdk.pkg.util;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.common.hash.Hashing;
import com.google.common.p069io.Files;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.util.List;
import kotlinx.coroutines.C41686h;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Sha1Util.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/sdk/pkg/util/Sha1Util;", "", "<init>", "()V", "Ljava/io/File;", "file", "", "c", "(Ljava/io/File;)Ljava/lang/String;", "sha1", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/io/File;)Z", "", "Lcom/kubi/sdk/pkg/util/Sha1Util$a;", FirebaseAnalytics.Param.ITEMS, "b", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class Sha1Util {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Sha1Util f47470a = new Sha1Util();

    /* JADX INFO: renamed from: com.kubi.sdk.pkg.util.Sha1Util$a */
    /* JADX INFO: compiled from: Sha1Util.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\t\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000f\u0010\f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/sdk/pkg/util/Sha1Util$a;", "", "", "path", "", SessionDescription.ATTR_LENGTH, "sha1", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "J", "()J", "c", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C23977a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String path;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final long length;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final String sha1;

        public C23977a(@NotNull String path, long j11, @NotNull String sha1) {
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(sha1, "sha1");
            this.path = path;
            this.length = j11;
            this.sha1 = sha1;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getLength() {
            return this.length;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSha1() {
            return this.sha1;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m57838a(@NotNull String sha1, @NotNull File file) {
        Intrinsics.checkNotNullParameter(sha1, "sha1");
        Intrinsics.checkNotNullParameter(file, "file");
        boolean zAreEqual = Intrinsics.areEqual(sha1, m57840c(file));
        if (!zAreEqual) {
            C43840a.m96549c("校验文件sha1:" + file.getPath() + " hash=" + sha1 + " 校验失败", null, 2, null);
        }
        return zAreEqual;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m57840c(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String string = Files.asByteSource(file).hash(Hashing.sha1()).toString();
        Intrinsics.checkNotNullExpressionValue(string, "asByteSource(file).hash(Hashing.sha1()).toString()");
        return string;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Object m57839b(@NotNull List<C23977a> list, @NotNull Continuation<? super Boolean> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new Sha1Util$compareItems$2(list, null), continuation);
    }
}
